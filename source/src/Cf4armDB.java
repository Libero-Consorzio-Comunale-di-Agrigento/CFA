// **********************************************
// Connect to a database
// Instant WEB Application: www.progamma.com
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;

import java.io.*;
import java.util.*;
import java.sql.*;
import javax.naming.*;


// **********************************************
// Command Handler
// **********************************************
public final class Cf4armDB extends Object implements Serializable, IDBObject
{
  public IDConnection DB = new IDConnection();
	public int vErrorNumber = 0;
	public String vErrorMessage;
	public String vOffendingCommand;
  
  public String vDefaultUserId;
  public String vDefaultPassword;
  public String vDefaultConnStr;
  public String DBName;
  public int DBType;
  public int MaxRows;
  
  private MyWebEntryPoint MainFrm;

  private static final int ChunkSize = 32768;
  
  private static byte iSchemaAlreadyAdjusted = 0;

  // Create private definition of other databases for web applications

  public void WebInit(MyWebEntryPoint w)
  {
    MainFrm = w;
  }



  public String DefaultUserId()   
  { 
    if (DB.Parent != this)
      return DB.Parent.DefaultUserId();
    //
    return vDefaultUserId; 
  }
  public String DefaultPassword() 
  { 
    if (DB.Parent != this)
      return DB.Parent.DefaultPassword();
    //
    return vDefaultPassword; 
  }
  public String DefaultConnStr()  
  { 
    if (DB.Parent != this)
      return DB.Parent.DefaultConnStr();
    //
    return vDefaultConnStr; 
  }
  public int DBaseType()
  {
    if (DB.Parent != this)
      return DB.Parent.DBaseType();
    //
    return DBType;
  }
  public byte SchemaAlreadyAdjusted()
  {
    if (DB.Parent != this)
      return DB.Parent.SchemaAlreadyAdjusted();
    //
    return iSchemaAlreadyAdjusted;
  }
  public String OffendingCommand()
  {
    if (DB.Parent != this)
      return DB.Parent.OffendingCommand();
    //
    return vOffendingCommand;
  }
  public String ErrorMessage()
  {
    if (DB.Parent != this)
      return DB.Parent.ErrorMessage();
    //
    return vErrorMessage;
  }
  public int ErrorNumber()
  {
    if (DB.Parent != this)
      return DB.Parent.ErrorNumber();
    //
    return vErrorNumber;
  }
  public IDConnection GetDB()
  {
    return DB;
  }
  public Object GetMainFrm()                  
  { 
    return MainFrm; 
  }
  public void DBAdjustSchema(boolean flForceNew)
  {
    if (DB.Parent != this)
    {
      DB.Parent.DBAdjustSchema(flForceNew);
      return;
    }
    //
    AdjustSchema(flForceNew);
  }

  public void set_DefaultUserId(String s)   
  { 
    if (DB.Parent != this)
      DB.Parent.set_DefaultUserId(s);
    //
    vDefaultUserId=s; 
  }
  public void set_DefaultPassword(String s) 
  { 
    if (DB.Parent != this)
      DB.Parent.set_DefaultPassword(s);
    //
    vDefaultPassword=s; 
  }
  public void set_DefaultConnStr(String s)  
  { 
    if (DB.Parent != this)
      DB.Parent.set_DefaultConnStr(s);
    //
    vDefaultConnStr=s; 
    //
    // Quando cambia la stringa di connessione devo rimettere a posto lo schema
    set_SchemaAlreadyAdjusted((byte)0);
    //
    // ... ed eventualmente la ZZ_SYNC
    if (MainFrm.SyncObject.DB == this)
      MainFrm.SyncObject.TablesAlreadyChecked = false;
  }
  public void set_DBaseType(int t)
  {
    if (DB.Parent != this)
      DB.Parent.set_DBaseType(t);
    //
    DBType = t;
  }
  public void set_SchemaAlreadyAdjusted(byte sc)
  {
    if (DB.Parent != this)
      DB.Parent.set_SchemaAlreadyAdjusted(sc);
    //
    iSchemaAlreadyAdjusted = sc;
  }
  public void set_OffendingCommand(String s)
  {
    if (DB.Parent != this)
      DB.Parent.set_OffendingCommand(s);
    //
    vOffendingCommand = s;
  }
  public void set_ErrorMessage(String s)
  {
    if (DB.Parent != this)
      DB.Parent.set_ErrorMessage(s);
    //
    vErrorMessage = s;
  }
  public void set_ErrorNumber(int t)
  {
    if (DB.Parent != this)
      DB.Parent.set_ErrorNumber(t);
    //
    vErrorNumber = t;
  }

  // **********************************************
  // Costruttore
  // **********************************************
  public Cf4armDB(MyWebEntryPoint p)
  {
    MainFrm=p;
    DB.Parent = this;
    vDefaultUserId = "";
    vDefaultPassword = "";
    vDefaultConnStr = "datasource=cfarm";
    DBType = 4;
    DB.DBType = DBType;
    DBName = "Cf4armDB";
  }


  // **********************************************************************
  // Make the connection open
  // **********************************************************************
  public IDConnection DBO()
  {
    try
    {
      DB.Pool=MainFrm.Pool;
      if (!DB.IsOpen()) 
        OpenConnection("", "", "");
      return DB;
    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }


  // **********************************************************************
  // Open a new connection
  // **********************************************************************
  public int OpenConnection(String UserID, String Password, String ConnStr)
  {
    if (DB.Parent != this)
      return DB.Parent.OpenConnection(UserID, Password, ConnStr);
    //
    DB.Pool = MainFrm.Pool;
    try
    {
      ClearErrors();
      if (UserID.length()==0) 
      {
        Password = DefaultPassword();
        UserID = DefaultUserId();
      }
      if (ConnStr.length()==0) 
        ConnStr = DefaultConnStr();
      int p=ConnStr.indexOf("$DB");
      if (p >= 0)
      {
        ConnStr = ConnStr.substring(0, p) + MainFrm.RealPath + "/WEB-INF" + ConnStr.substring(p+3);
        ConnStr = ConnStr.replace('\\','/');
      }
      //
      MainFrm.DTTObj.AddMsg(DTTEngine.DTTMSG_INFO, "", 160, DBName + ".OpenConnection", DBName + ": Open Connection");
      MainFrm.DTTObj.AddParameter("", "", "Connection String", new IDVariant(ConnStr));
      MainFrm.DTTObj.AddParameter("", "", "User ID", new IDVariant(UserID));
      MainFrm.DTTObj.AddParameter("", "", "Password", new IDVariant(Password));
      //
      DB.DBType = DBType;
      DB.Open(ConnStr, UserID, Password, new InitialContext());
      //
      // Prima di ridare la connessione, controllo che lo schema sia a posto
      // ma solo la prima volta
      if (SchemaAlreadyAdjusted()==0)
      {
        set_SchemaAlreadyAdjusted((byte)1);
        DBAdjustSchema(false);
        set_SchemaAlreadyAdjusted((byte)2);
      }
      //
      // Attendo inizializzazione da altra sessione
      while (SchemaAlreadyAdjusted() != 2)
        Thread.sleep(50);
      //
      return 0;
    }
    catch(Exception s)
    {
      return SetError("OPEN",s);
    }
  }

  // **********************************************************************
  // Make the connection close
  // **********************************************************************
  public void CloseConnection()
  {
    CloseConnection(false);
  }
  
  public void CloseConnection(boolean force)
  {
    if (DB.Parent != this)
    {
      DB.Parent.CloseConnection(force);
      return;
    }
    //
    if (DB.IsOpen())
    {
      try
      {
        if (DB.TransCount > 0)
        {
          MainFrm.DTTObj.AddMsg(DTTEngine.DTTMSG_WARN, "", 171, DBName + ".CloseConnection", DBName + ": closing while in transaction");
          RollbackTrans();
        }
        DB.Close(force);
      }
      catch(SQLException s)
      {
        // Salto...
      }
    }
  }

  // **********************************************************************
  // Clear error status
  // **********************************************************************
  public void ClearErrors()
  {
    if (DB.Parent != this)
      DB.Parent.ClearErrors();
    //
    vErrorNumber = 0;
    vErrorMessage = "";
    vOffendingCommand = "";
  }


  // **********************************************************************
  // Set error status
  // **********************************************************************
  public int SetError(String SQL, Exception s)
  {
    if (DB.Parent != this)
      return DB.Parent.SetError(SQL, s);
    //
    vErrorNumber = -1;
    vErrorMessage = s.getMessage();
    vOffendingCommand = SQL;
    //
    if (vErrorNumber!=-1) // Quando troveremo il modo di ritornare l'errore vero del DB
    {
      switch(DBType)
      {
        case Glb.DBT_SQLSRV6:
        case Glb.DBT_SQLSRV7:
        case Glb.DBT_SQLSRV2K:
          if (vErrorNumber > 50000) 
            vErrorNumber = vErrorNumber - 50000;
         break;
          
        case Glb.DBT_ORACLE7:
        case Glb.DBT_ORACLE8:
          if (vErrorNumber < -20000)
            vErrorNumber = -vErrorNumber - 20000;
        break;
      }
    }
    //
    MainFrm.DTTObj.AddMsg(DTTEngine.DTTMSG_ERROR, "", 161, DBName, DBName + ": " + s.getMessage());
    MainFrm.DTTObj.AddParameter("", "", "Offending Command", new IDVariant(vOffendingCommand));
    return vErrorNumber;
  }


  // **********************************************************************
  // Transaction functions
  // **********************************************************************
  public void BeginTrans() throws SQLException
  {
    if (DB.TransCount != 0)
      MainFrm.DTTObj.AddMsg(DTTEngine.DTTMSG_WARN, "", 162, DBName + ".BeginTrans", DBName + ": nested transaction detected (" + DB.TransCount + ")");
    DBO().BeginTrans();
  }
  
  public void CommitTrans() throws SQLException
  {
    if (DB.TransCount < 1)
      MainFrm.DTTObj.AddMsg(DTTEngine.DTTMSG_WARN, "", 163, DBName + ".CommitTrans", DBName + ": Commit without Begin Transaction");
    DBO().CommitTrans();
  }
  
  public void RollbackTrans() throws SQLException
  {
    if (DB.TransCount < 1)
      MainFrm.DTTObj.AddMsg(DTTEngine.DTTMSG_WARN, "", 164, DBName + ".RollbackTrans", DBName + ": Rollback without Begin Transaction");
    DBO().RollbackTrans();
  }


  // **********************************************
  // SQLite schema adjustment
  // **********************************************
  public boolean AdjustSchema(boolean flForceNew)
  {
    // Se non è SQLite non posso aggiustare lo schema
    if (Glb.ClassDB(DBType) != Glb.DBC_SQLITE)
      return false;
    //
    // Evito problemi con i limiti e le sostituzioni
    DB.MaxRows = 0;
    DB.ClearSubstitutions();
    //
    try
    {
      MainFrm.DTTObj.AddMsg(DTTEngine.DTTMSG_INFO, "", 160, DBName + ".AdjustSchema", DBName + ": Adjust Schema");
      //
      // Disabilito FK Support / scrivo nelle tabelle di sistema
      DBO().Execute("PRAGMA foreign_keys = 0");
      //
      // Lavoro in transazione
      BeginTrans();
      //
      LinkedList Tabelle = new LinkedList();
      LinkedList Indici = new LinkedList();
      LinkedList Viste = new LinkedList();
      //
      if (flForceNew)
      {
        // Distruggo tutto
        DBO().DropUselessObjects(MainFrm, Tabelle, "table");
        DBO().DropUselessObjects(MainFrm, Indici, "index");
        DBO().DropUselessObjects(MainFrm, Viste, "view");
        //
        // ... ed eventualmente la ZZ_SYNC
        if (MainFrm.SyncObject.DB != null && MainFrm.SyncObject.DB.GetDB() == GetDB())
        {
          String sql = "DROP TABLE ZZ_SYNC";
          MainFrm.DTTObj.AddQuery(DBName + ".AdjustSchema", "Dropping table ZZ_SYNC", DBName + ".AdjustSchema", DTTEngine.STMT_QRY_UPDATE, sql);
          try
          {
            DBO().Execute(sql);
            MainFrm.SyncObject.TablesAlreadyChecked = false;
          }
          catch (Exception e) { }
          MainFrm.DTTObj.EndQuery(DBName + ".AdjustSchema");
        }
      }
      //
      // Sistemo tutti gli oggetti del DB (tabelle, indici e viste)
      AdjustObjects(Tabelle, Indici, Viste);
      //
      // Distruggo oggetti ormai inutili
      if (Tabelle.size()>0)
      {
        DBO().DropUselessObjects(MainFrm, Tabelle, "table");
        DBO().DropUselessObjects(MainFrm, Indici, "index");
        DBO().DropUselessObjects(MainFrm, Viste, "view");
      }
      //
      CommitTrans();
      //
      // Riabilito supporto a FK
      DBO().Execute("PRAGMA foreign_keys = 1");
      //
      MainFrm.DTTObj.AddMsg(DTTEngine.DTTMSG_INFO, "", 160, DBName + ".AdjustSchema", DBName + ": Finished adjusting database schema");
      //
      return true;
    }
    catch (Exception e)
    {
      // In caso di errore torno indietro e riabilito FK
      try
      {
        RollbackTrans();
        DBO().Execute("PRAGMA foreign_keys = 1");
      }
      catch (Exception s)
      {}
      //
      vErrorMessage = e.getMessage();
      vOffendingCommand = "AdjustSchema";
      MainFrm.DTTObj.AddMsg(DTTEngine.DTTMSG_ERROR, "", 160, DBName + ".AdjustSchema", "Error occurred while adjusting schema: " + vErrorMessage);
      MainFrm.DTTObj.AddParameter("", "", "Stack Trace", e.getStackTrace());
      return false;
    }
  }
  public void AdjustObjects(LinkedList Tabelle, LinkedList Indici, LinkedList Viste) throws SQLException
  {
    //
    // Verifico se ci sono componenti che vogliono aggiungere qualche oggetto a questo database
    ListIterator pos = MainFrm.CompList.listIterator();
    while (pos.hasNext())
    {
      WebEntryPoint cmp = (WebEntryPoint)pos.next();
      IDBObject dbc = cmp.GetDBObjByName(DBName);
      if (dbc == null || dbc.GetMainFrm() != cmp || dbc.GetDB() != DB)
        continue;
      //
      // Questo componente usa un DB simile a questo. Vediamo se deve, anche lui, aggiungere oggetti allo schema
      dbc.AdjustObjects(Tabelle, Indici, Viste);
    }
  }
  
  // **********************************************
  // Procedure Definition
  // **********************************************
  
  // **********************************************************************
  // OVERLOAD
  // **********************************************************************
  public int CREA_CODICE_FISCALEdalCatasto(IDVariant COGNOME, IDVariant NOME, IDVariant DATANASCITA, IDVariant CODICECATASTO, IDVariant SESSO, IDVariant CODICEFISCALE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(COGNOME);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(NOME);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(DATANASCITA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(CODICECATASTO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(SESSO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(CODICEFISCALE);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("AD4_CODICE_FISCALE.CREA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CREA_CODICE_FISCALEdalCatasto",s);
    }
  }

  public int IMPORTAORDINATIVO(IDVariant IN_ID_ELABORAZIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(IN_ID_ELABORAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("COMUNICAZIONE_SIOPE_WS_GDM.IMPORTA_ORDINATIVO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("IMPORTAORDINATIVO",s);
    }
  }

  public int MESSAGGIINVIONUM(IDVariant AIDMESSAGGIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AIDMESSAGGIO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("MESSAGGI_INVIO_NUM",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("MESSAGGIINVIONUM",s);
    }
  }

  // **********************************************************************
  // Explain what process is carried out by this function
  // **********************************************************************
  public int ACCDI(IDVariant AESERCIZIO, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AANNOACC, IDVariant ANUMEROACC, IDVariant OLDIMPORTO, IDVariant NEWIMPORTO, IDVariant NEWESERCIZIOSCADENZA, IDVariant AANNOINTROD, IDVariant NEWCODIMPECO, IDVariant OLDCONTROLLODISP, IDVariant NEWCONTROLLODISP, IDVariant AVOCEECON, IDVariant ACODICEGESTIONALE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWESERCIZIOSCADENZA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOINTROD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWCODIMPECO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(OLDCONTROLLODISP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(NEWCONTROLLODISP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AVOCEECON);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACODICEGESTIONALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ACC_DI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ACCDI",s);
    }
  }

  public int CF4WEBGETDISCENDENTISTRUTT(IDVariant APROGRSESSIONE, IDVariant APROGRUNITA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(APROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRUNITA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CF4WEB_GET_DISCENDENTI_STRUTT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBGETDISCENDENTISTRUTT",s);
    }
  }

  public int INDEFEPASSIVAAGGIORNAMENTOSOGGETTOCMV(IDVariant PIDDOCUMENTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.AGGIORNAMENTO_SOGGETTO_CMV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INDEFEPASSIVAAGGIORNAMENTOSOGGETTOCMV",s);
    }
  }

  public int SETTANLSNUMERICCHARACTERS()
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    try
    {
      DBO().CallSP("SETTA_NLS_NUMERIC_CHARACTERS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("SETTANLSNUMERICCHARACTERS",s);
    }
  }

  public int GENERACRONOPIANOCOMPTUTTI(IDVariant AESERCIZIO, IDVariant ASESSIONE, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_CRONO_PIANO_COMP_TUTTI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERACRONOPIANOCOMPTUTTI",s);
    }
  }

  public int STATISTICHEUTILIZZOUPDCONTATOREFORM(IDVariant PCLASSNAME, IDVariant PMODULO, IDVariant PTIPO, IDVariant PRUOLO, IDVariant P_UTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PCLASSNAME);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PMODULO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PRUOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_UTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("STATISTICHE_UTILIZZO.UPD_CONTATORE_FORM",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("STATISTICHEUTILIZZOUPDCONTATOREFORM",s);
    }
  }

  public int CF4WEBGETUNITAGESTIONE(IDVariant APROGRSESSIONE, IDVariant AESERCIZIO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(APROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CF4WEB_GET_UNITA_GESTIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBGETUNITAGESTIONE",s);
    }
  }

  public int GENERASTRUTTURA(IDVariant PESERCIZIO, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_STRUTTURA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERASTRUTTURA",s);
    }
  }

  public int INSSTRUTTURAESERCSUCC(IDVariant PESERCIZIO, IDVariant PES, IDVariant PCODICEGERARCHIA, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCODICEGERARCHIA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("INS_STRUTTURA_ESERC_SUCC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INSSTRUTTURAESERCSUCC",s);
    }
  }

  public int T54PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T54_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T54PD",s);
    }
  }

  public int NUMERAZIONEFINOPE(IDVariant ATABELLA, IDVariant ATIPONUMERAZIONE, IDVariant AVALORE, IDVariant ANUMERO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ATABELLA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPONUMERAZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AVALORE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMERO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("NUMERAZIONE_FINOPE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("NUMERAZIONEFINOPE",s);
    }
  }

  public int TITOLIPD(IDVariant OLDES, IDVariant OLDTITOLO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(OLDTITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("TITOLI_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("TITOLIPD",s);
    }
  }

  public int CATEGORIEPD(IDVariant OLDTITOLO, IDVariant OLDCATEGORIA, IDVariant OLDE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDTITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDCATEGORIA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CATEGORIE_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CATEGORIEPD",s);
    }
  }

  public int INTERVENTIPD(IDVariant OLDTITOLO, IDVariant OLDINTERVENTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDTITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDINTERVENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("INTERVENTI_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INTERVENTIPD",s);
    }
  }

  public int CAPTERPD(IDVariant OLDES, IDVariant OLDCAPITOLO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(OLDCAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CAPTER_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CAPTERPD",s);
    }
  }

  public int FUNZIONIPD(IDVariant OLDFUNZIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDFUNZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("FUNZIONI_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FUNZIONIPD",s);
    }
  }

  public int SERVIZIPD(IDVariant OLDFUNZIONE, IDVariant OLDSERVIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDFUNZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDSERVIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("SERVIZI_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("SERVIZIPD",s);
    }
  }

  public int T69PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T69_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T69PD",s);
    }
  }

  public int T55PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T55_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T55PD",s);
    }
  }

  public int T56PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T56_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T56PD",s);
    }
  }

  public int T57PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T57_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T57PD",s);
    }
  }

  public int T58PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T58_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T58PD",s);
    }
  }

  public int T60PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T60_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T60PD",s);
    }
  }

  public int T86PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T86_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T86PD",s);
    }
  }

  public int T59PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T59_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T59PD",s);
    }
  }

  public int T62PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T62_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T62PD",s);
    }
  }

  public int T82PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T82_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T82PD",s);
    }
  }

  public int T83PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T83_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T83PD",s);
    }
  }

  public int T05PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T05_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T05PD",s);
    }
  }

  public int T01PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T01_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T01PD",s);
    }
  }

  public int T02PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T02_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T02PD",s);
    }
  }

  public int T08PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("T08_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T08PD",s);
    }
  }

  public int T53PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T53_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T53PD",s);
    }
  }

  public int T06PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T06_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T06PD",s);
    }
  }

  public int T09PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T09_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T09PD",s);
    }
  }

  public int T11PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("T11_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T11PD",s);
    }
  }

  public int T10PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T10_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T10PD",s);
    }
  }

  public int ASSESSORATIPD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("ASSESSORATI_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ASSESSORATIPD",s);
    }
  }

  public int CF4WEBBILESECUTIVITAMOV(IDVariant AUNITAPRO, IDVariant ANUMEROPRO, IDVariant AANNOPRO, IDVariant ASEDEDEL, IDVariant ANUMERODEL, IDVariant AANNODEL, IDVariant AESERCIZIO, IDVariant ANUMRIGHE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AUNITAPRO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMEROPRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOPRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMRIGHE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CF4WEB_BIL_ESECUTIVITA_MOV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBBILESECUTIVITAMOV",s);
    }
  }

  public int BILESECUTIVITAMOVIMENTIDEL(IDVariant AESERCIZIO, IDVariant AANNOPRO, IDVariant ANUMEROPRO, IDVariant AUNITAPRO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOPRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROPRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUNITAPRO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BIL_ESECUTIVITA_MOVIMENTI_DEL",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILESECUTIVITAMOVIMENTIDEL",s);
    }
  }

  public int T75PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T75_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T75PD",s);
    }
  }

  public int COPIASERCOS(IDVariant PESERCIZIO, IDVariant PCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("COPIA_SERCOS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("COPIASERCOS",s);
    }
  }

  public int ACHKNUMERAZIONE(IDVariant AESERCIZIO, IDVariant ACODICE, IDVariant ANUMERO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMERO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("A_CHK_NUMERAZIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ACHKNUMERAZIONE",s);
    }
  }

  public int BENPD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BEN_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BENPD",s);
    }
  }

  public int GENSOGGE4CI4(IDVariant APROVINCIA, IDVariant ACOMUNE, IDVariant ACAP)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(APROVINCIA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACOMUNE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("GEN_SOG_GE4_CI4",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENSOGGE4CI4",s);
    }
  }

  public int SOGGETTICONTROLLO(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ATIPOCONTROLLO, IDVariant ATIPOQTNCASSA, IDVariant ASPESE, IDVariant AINSERITI)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOCONTROLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOQTNCASSA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AINSERITI);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("SOGGETTI_CONTROLLO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("SOGGETTICONTROLLO",s);
    }
  }

  public int CONTABILIZZADOCCC(IDVariant AESERCIZIO, IDVariant ATIPOREGISTRO, IDVariant ANUMEROBOLLATO, IDVariant ADATA, IDVariant ANUM)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOREGISTRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROBOLLATO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ANUM);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CONTABILIZZA_DOC_CC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTABILIZZADOCCC",s);
    }
  }

  public int CONTABILIZZAIVADOCCNC(IDVariant AESERCIZIO, IDVariant ATIPOREGISTRO, IDVariant ANUMEROBOLLATO, IDVariant ADATA, IDVariant ANUM)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOREGISTRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROBOLLATO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ANUM);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CONTABILIZZA_IVA_DOC_CNC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTABILIZZAIVADOCCNC",s);
    }
  }

  public int CONTABILIZZAFINECODOCCNC(IDVariant AESERCIZIO, IDVariant ATIPOREGISTRO, IDVariant ANUMEROBOLLATO, IDVariant ADATA, IDVariant ADEBITORE, IDVariant ACONTROPARTITA, IDVariant ANUM)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOREGISTRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROBOLLATO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADEBITORE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACONTROPARTITA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUM);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CONTABILIZZA_FINECO_DOC_CNC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTABILIZZAFINECODOCCNC",s);
    }
  }

  public int ACCEMISSCFA(IDVariant ADATA, IDVariant ADESCRIZIONE, IDVariant ACAUSALE, IDVariant ASERVIZIO, IDVariant ADEBITORE, IDVariant ACONTROPARTITA, IDVariant ASESSIONE, IDVariant ACHIAVE, IDVariant AESERCIZIO, IDVariant ANUMACC, IDVariant AACCDA, IDVariant AACCA, IDVariant AANNOACC)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASERVIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADEBITORE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACONTROPARTITA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACHIAVE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMACC);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AACCDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AACCA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AANNOACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ACC_EMISS_CFA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ACCEMISSCFA",s);
    }
  }

  public int CAUSALIPD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CAUSALI_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CAUSALIPD",s);
    }
  }

  public int WORKSITUTENZECOD(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ATIPOUTENZA, IDVariant ACODICEUTENZA, IDVariant ATIPO, IDVariant ASOLOEMESSE, IDVariant ADATAELAB)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOUTENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACODICEUTENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLOEMESSE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_SIT_UTENZE_COD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITUTENZECOD",s);
    }
  }

  public int WORKSITUTENZEIMP(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ATIPOUTENZA, IDVariant AANNOIMP, IDVariant ANUMEROIMP, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant ATIPO, IDVariant ASOLOEMESSE, IDVariant ADATAELAB)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOUTENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLOEMESSE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_SIT_UTENZE_IMP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITUTENZEIMP",s);
    }
  }

  public int IMPUTAECOFATDAMOV()
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    try
    {
      DBO().CallSP("IMPUTA_ECO_FAT_DA_MOV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("IMPUTAECOFATDAMOV",s);
    }
  }

  public int EMISSIONECORRISPETTIVIFS4(IDVariant AESERCIZIO, IDVariant AREGFS4, IDVariant ABOLFS4, IDVariant ADAL, IDVariant AAL, IDVariant ABOLCORR, IDVariant ADESC, IDVariant ACORRDA, IDVariant ACORRA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AREGFS4);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLFS4);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ABOLCORR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADESC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACORRDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ACORRA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("EMISSIONE_CORRISPETTIVI_FS4",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("EMISSIONECORRISPETTIVIFS4",s);
    }
  }

  public int ORDEMISSFS4(IDVariant AESERCIZIO, IDVariant AREGISTRO, IDVariant ABOLLATO, IDVariant AINCASSIDA, IDVariant AINCASSIA, IDVariant ADATA, IDVariant ADESCRIZIONE, IDVariant ADESCRACC, IDVariant ABOLLO, IDVariant AUFFICIO, IDVariant ACAUSALE, IDVariant AEMISS, IDVariant AORDDA, IDVariant AORDA, IDVariant AVARACC)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AREGISTRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLATO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AINCASSIDA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AINCASSIA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADESCRACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AEMISS);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AORDDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AORDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AVARACC);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("ORD_EMISS_FS4",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ORDEMISSFS4",s);
    }
  }

  public int CARICAINCASSIINSOLUTIFS4(IDVariant ASESSIONEID, IDVariant AINSERITIINC, IDVariant ADATAFLUSSO, IDVariant AREGFS4, IDVariant ABOLFS4, IDVariant ADATAINCASSO, IDVariant ANUMEROINCASSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AINSERITIINC);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ADATAFLUSSO);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AREGFS4);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLFS4);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATAINCASSO);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ANUMEROINCASSO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CARICA_INCASSI_INSOLUTI_FS4",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAINCASSIINSOLUTIFS4",s);
    }
  }

  public int CARICAINCASSIFS4(IDVariant ASESSIONEID, IDVariant AINSERITIINC)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AINSERITIINC);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CARICA_INCASSI_FS4",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAINCASSIFS4",s);
    }
  }

  public int FATMODIFICAUO(IDVariant PANNOPROG, IDVariant PNUMEROPROG, IDVariant PPROGRUO, IDVariant OOKKO, IDVariant ODESCRERRORE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PANNOPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRUO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OOKKO);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(ODESCRERRORE);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("FAT_MODIFICA_UO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FATMODIFICAUO",s);
    }
  }

  public int FATRIPRISTINAFSA(IDVariant AANNOPROGFAT, IDVariant ANUMEROPROGFAT)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOPROGFAT);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROPROGFAT);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("FAT_RIPRISTINA_FSA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FATRIPRISTINAFSA",s);
    }
  }

  public int PROPOSTEINTEGRAZIONEINSERISCI_FATTURA_IRIDE(IDVariant AANNOPROG, IDVariant ANUMEROPROG, IDVariant AAGGANAGR, IDVariant ACODICEUO, IDVariant ADATA, IDVariant ATIPODOC, IDVariant AOGGETTO, IDVariant ANUMERODOC, IDVariant ADATADOC, IDVariant ACLASSIFICA, IDVariant ABENEFICIARIO, IDVariant ACODFISC, IDVariant ATIPOPERS, IDVariant ACODAMM, IDVariant AUTENTE, IDVariant ARUOLO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOPROG);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(ANUMEROPROG);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(AAGGANAGR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACODICEUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ATIPODOC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AOGGETTO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMERODOC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATADOC);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ACLASSIFICA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ABENEFICIARIO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACODFISC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOPERS);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACODAMM);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARUOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("PROPOSTE_INTEGRAZIONE.INSERISCI_FATTURA_IRIDE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PROPOSTEINTEGRAZIONEINSERISCI_FATTURA_IRIDE",s);
    }
  }

  public int RIVERSAMENTO_XML_IRIDE(IDVariant AANNOPROG, IDVariant ANUMEROPROG, IDVariant ACODICEUO, IDVariant AIDDOC, IDVariant AIDALLPRIN, IDVariant ACODAMM, IDVariant AUTENTE, IDVariant ARUOLO, IDVariant A_SESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOPROG);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(ANUMEROPROG);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(ACODICEUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AIDDOC);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(AIDALLPRIN);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(ACODAMM);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARUOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(A_SESSIONE);
    OutPar.add(new Integer(IDVariant.INTEGER));
    try
    {
      DBO().CallSP("RIVERSAMENTO_XML_IRIDE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RIVERSAMENTO_XML_IRIDE",s);
    }
  }

  public int PROPOSTEINTEGRAZIONEMODIFICAFATTURAIRIDE(IDVariant AANNOPROG, IDVariant ANUMEROPROG, IDVariant AIDDOCUMENTO, IDVariant AAGGANAGR, IDVariant ACODICEUO, IDVariant ATIPODOC, IDVariant AOGGETTO, IDVariant ANUMERODOC, IDVariant ADATADOC, IDVariant ABENEFICIARIO, IDVariant ACODFISC, IDVariant ATIPOPERS, IDVariant ACODAMM, IDVariant AUTENTE, IDVariant ARUOLO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOPROG);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(ANUMEROPROG);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(AIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AAGGANAGR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACODICEUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPODOC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AOGGETTO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMERODOC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATADOC);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ABENEFICIARIO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACODFISC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOPERS);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACODAMM);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARUOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("PROPOSTE_INTEGRAZIONE.MODIFICA_FATTURA_IRIDE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PROPOSTEINTEGRAZIONEMODIFICAFATTURAIRIDE",s);
    }
  }

  public int FATCONTROLLATRATTAMENTO()
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    try
    {
      DBO().CallSP("FAT_CONTROLLA_TRATTAMENTO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FATCONTROLLATRATTAMENTO",s);
    }
  }

  public int FEAGGIORNASTATIDAGDM(IDVariant PTEST, IDVariant PIDDOCUMENTO, IDVariant PUTENTE, IDVariant PSEMODIFICATO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PTEST);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSEMODIFICATO);
    OutPar.add(new Integer(-IDVariant.INTEGER));
    try
    {
      DBO().CallSP("FE_AGGIORNA_STATI_DA_GDM",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FEAGGIORNASTATIDAGDM",s);
    }
  }

  public int INDEFEPASSIVAFECONTROLLIRIFIUTO(IDVariant PIDDOCUMENTO, IDVariant P_UTENTE, IDVariant P_MESSAGGIO, IDVariant P_SE_PROSEGUO_ACC, IDVariant P_SE_PROSEGUO_RIF, IDVariant P_SE_INVIO_ESITO, IDVariant P_TIPO_RIFIUTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_UTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_MESSAGGIO);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(P_SE_PROSEGUO_ACC);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(P_SE_PROSEGUO_RIF);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(P_SE_INVIO_ESITO);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(P_TIPO_RIFIUTO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.FE_CONTROLLI_RIFIUTO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INDEFEPASSIVAFECONTROLLIRIFIUTO",s);
    }
  }

  public int RifiutaFE(IDVariant P_ID_DOCUMENTO, IDVariant P_UTENTE, IDVariant P_SE_INVIO_ESITO, IDVariant P_TIPO_RIFIUTO, IDVariant P_MOTIVAZIONE, IDVariant PMESSAGGIONOTIFICA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(P_ID_DOCUMENTO);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(P_UTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_SE_INVIO_ESITO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_TIPO_RIFIUTO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_MOTIVAZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PMESSAGGIONOTIFICA);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.FE_RIFIUTA_FE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RifiutaFE",s);
    }
  }

  public int LIQUIDAFATTURA(IDVariant PESERCIZIO, IDVariant PNUMERODOC, IDVariant PSEDEDEL, IDVariant PUNITAPROPONENTE, IDVariant PDESCLIQ, IDVariant PANNOPROG, IDVariant PNUMEROPROG, IDVariant PBENEFICIARIO, IDVariant PANNODOC, IDVariant PNUMQUIETANZA, IDVariant PANNOMAND, IDVariant PUFFICIO, IDVariant PANNODEL, IDVariant PNUMERODEL, IDVariant PANNOPROPOSTA, IDVariant PNUMEROPROPOSTA, IDVariant PANNOLIQ, IDVariant PCAUSALE, IDVariant PLIQUIDATE, IDVariant NNUMERO, IDVariant PROGRESSIVI, IDVariant PBOLLO, IDVariant PANTICIPAZIONE, IDVariant PNOFINANZIAMENTO, IDVariant PCOMMISSIONI, IDVariant PINFOTESORIERE, IDVariant PSPESE, IDVariant PSCADENZA, IDVariant PALLEGATI, IDVariant PSTATOSIOPE, IDVariant PESCLUSIONECIG)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODOC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUNITAPROPONENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCLIQ);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANNOPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PBENEFICIARIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODOC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMQUIETANZA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOMAND);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PLIQUIDATE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(NNUMERO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PROGRESSIVI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PBOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANTICIPAZIONE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNOFINANZIAMENTO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PCOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSCADENZA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PESCLUSIONECIG);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("LIQUIDA_FATTURA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("LIQUIDAFATTURA",s);
    }
  }

  public int ORDEMISSIMPUTAZIONI(IDVariant AESERCIZIO, IDVariant APROGRESSIVI, IDVariant ADESCRIZIONE, IDVariant ABOLLO, IDVariant AUFFICIO, IDVariant ACAUSALE, IDVariant AEMISS, IDVariant ADEBITORE, IDVariant AANNODOC, IDVariant ANUMERODOC, IDVariant ANUMQUIETANZA, IDVariant AANNOPROG, IDVariant ANUMEROPROG, IDVariant AORDDA, IDVariant AORDA, IDVariant AACCDA, IDVariant AACCA, IDVariant AVARACC, IDVariant ADATA, IDVariant ARILEVANTEECO, IDVariant ACONTROPARTITA, IDVariant ACOMMISSIONI, IDVariant AINFOTESORIERE, IDVariant ASPESE, IDVariant AALLEGATI, IDVariant ASTATOSIOPE, IDVariant ASUPDISPPURO, IDVariant aemisssenzacod5)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRESSIVI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AEMISS);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADEBITORE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNODOC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMERODOC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMQUIETANZA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AORDDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AORDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AACCDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AACCA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AVARACC);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ARILEVANTEECO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACONTROPARTITA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASUPDISPPURO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(aemisssenzacod5);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ORD_EMISS_IMPUTAZIONI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ORDEMISSIMPUTAZIONI",s);
    }
  }

  public int PROPOSTEINTEGRAZIONEAGGIUNGIALLEGATOIRIDE(IDVariant AANNOPROG, IDVariant ANUMEROPROG, IDVariant ACODICEUO, IDVariant AIDDOC, IDVariant AIDALLEGATO, IDVariant AIDALLPRIN, IDVariant ACODAMM, IDVariant AUTENTE, IDVariant ARUOLO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOPROG);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(ANUMEROPROG);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(ACODICEUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AIDDOC);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(AIDALLEGATO);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(AIDALLPRIN);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(ACODAMM);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARUOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("PROPOSTE_INTEGRAZIONE.AGGIUNGI_ALLEGATO_IRIDE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PROPOSTEINTEGRAZIONEAGGIUNGIALLEGATOIRIDE",s);
    }
  }

  public int COMUNICAZIONEFATTURECREAFILEZIP(IDVariant PSESSIONE, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("COMUNICAZIONE_FATTURE.CREA_FILE_ZIP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("COMUNICAZIONEFATTURECREAFILEZIP",s);
    }
  }

  public int COMUNICAZIONEFATTURECREAFILEXML(IDVariant PESERCIZIO, IDVariant PSESSIONE, IDVariant PES, IDVariant PDATARIF, IDVariant PCODICEFISCALEDIC, IDVariant PCODICECARICADIC, IDVariant PUTENTE, IDVariant DESCRIZIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATARIF);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PCODICEFISCALEDIC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCODICECARICADIC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(DESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("COMUNICAZIONE_FATTURE.CREA_FILE_XML",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("COMUNICAZIONEFATTURECREAFILEXML",s);
    }
  }

  // **********************************************************************
  // CREA_FILE_ANNULLI
  // **********************************************************************
  public int COMUNICAZIONEFATTURECREA_FILE_ANNULLI(IDVariant PESERCIZIO, IDVariant PSESSIONE, IDVariant PES, IDVariant PDATARIF, IDVariant PCODICEFISCALEDIC, IDVariant PCODICECARICADIC, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATARIF);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PCODICEFISCALEDIC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCODICECARICADIC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("COMUNICAZIONE_FATTURE.CREA_FILE_ANNULLI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("COMUNICAZIONEFATTURECREA_FILE_ANNULLI",s);
    }
  }

  public int COMUNICAZIONEFATTUREIMPORT_FILE_ESITO(IDVariant PSESSIONE, IDVariant PNOMEFILEESITO, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNOMEFILEESITO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("COMUNICAZIONE_FATTURE.IMPORT_FILE_ESITO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("COMUNICAZIONEFATTUREIMPORT_FILE_ESITO",s);
    }
  }

  public int IMPORTFATSAMASH(IDVariant PSESSIONE, IDVariant PUTENTEINS)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTEINS);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("IMPORT_FAT_SAMASH",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("IMPORTFATSAMASH",s);
    }
  }

  public int ELIMINACOLLEGAMENTOBOLLA(IDVariant AANNOPROG, IDVariant ANUMEROPROG, IDVariant ANUMBOLLA, IDVariant ADATABOLLA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMBOLLA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATABOLLA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("ELIMINA_COLLEGAMENTO_BOLLA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ELIMINACOLLEGAMENTOBOLLA",s);
    }
  }

  public int RETTIFICAIMPBUONIWEB(IDVariant PANNOBUONO, IDVariant PNUMEROBUONO, IDVariant PANNOIMPOLD, IDVariant PNUMEROIMPOLD, IDVariant PANNOIMPNEW, IDVariant PNUMEROIMPNEW, IDVariant PSESSIONE, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PANNOBUONO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROBUONO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOIMPOLD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROIMPOLD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOIMPNEW);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROIMPNEW);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("RETTIFICA_IMP_BUONI_WEB",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RETTIFICAIMPBUONIWEB",s);
    }
  }

  public int ImportadaFILE(IDVariant P_UTENTE, IDVariant P_SESSIONE, IDVariant P_NUM_DOC)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(P_UTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_SESSIONE);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(P_NUM_DOC);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.FE_IMP_DA_FILE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ImportadaFILE",s);
    }
  }

  public int POPOLARIFAMMINISTRAZIONE()
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    try
    {
      DBO().CallSP("POPOLA_RIF_AMMINISTRAZIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POPOLARIFAMMINISTRAZIONE",s);
    }
  }

  public int PASSAGGIO_CFWEB_CFA(IDVariant P_UTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(P_UTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.PASSAGGIO_CFWEB_CFA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PASSAGGIO_CFWEB_CFA",s);
    }
  }

  public int INDEFEPASSIVAFENOTIFICACAMBIOUO(IDVariant PIDDOCUMENTO, IDVariant PPROGRUO, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.FE_NOTIFICA_CAMBIO_UO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INDEFEPASSIVAFENOTIFICACAMBIOUO",s);
    }
  }

  public int INDEFESMISTAMENTOFENOTIFICAFAT(IDVariant PIDDOCUMENTO, IDVariant PMODULOA, IDVariant PPROGRUODA, IDVariant PPROGRUOA, IDVariant PTESTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PMODULOA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRUODA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRUOA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTESTO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_SMISTAMENTO.FE_NOTIFICA_FAT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INDEFESMISTAMENTOFENOTIFICAFAT",s);
    }
  }

  // **********************************************************************
  // Descrivi lo scopo di questa funzione...
  // **********************************************************************
  public int INDEFEPASSIVAFECONTROLLIACCETTAZIONE(IDVariant PIDDOCUMENTO, IDVariant P_UTENTE, IDVariant P_MESSAGGIO, IDVariant P_SE_PROSEGUO_ACC, IDVariant P_SE_INVIO_ESITO, IDVariant P_MODULO, IDVariant P_ISTANZA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_UTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_MESSAGGIO);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(P_SE_PROSEGUO_ACC);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(P_SE_INVIO_ESITO);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(P_MODULO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_ISTANZA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.FE_CONTROLLI_ACCETTAZIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INDEFEPASSIVAFECONTROLLIACCETTAZIONE",s);
    }
  }

  public int INDEFEPASSIVASTATO_FATTURA_PASSIVA(IDVariant PIDDOCUMENTO, IDVariant R_ESITO, IDVariant R_STATO, IDVariant R_INVIO, IDVariant R_COMPLETO, IDVariant R_VERIFICA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(R_ESITO);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(R_STATO);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(R_INVIO);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(R_COMPLETO);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(R_VERIFICA);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.STATO_FATTURA_PASSIVA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INDEFEPASSIVASTATO_FATTURA_PASSIVA",s);
    }
  }

  public int RifiutaFEMUTLI(IDVariant P_ID_DOCUMENTO, IDVariant P_UTENTE, IDVariant P_MOTIVAZIONE, IDVariant P_SE_ERRORE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(P_ID_DOCUMENTO);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(P_UTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_MOTIVAZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_SE_ERRORE);
    OutPar.add(new Integer(-IDVariant.INTEGER));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.FE_RIFIUTA_MULTI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RifiutaFEMUTLI",s);
    }
  }

  // **********************************************************************
  // Descrivi lo scopo di questa funzione...
  // **********************************************************************
  public int INDEFEPASSIVAFEACCETTAZIONEMULTIPLA(IDVariant PIDDOCUMENTO, IDVariant P_UTENTE, IDVariant P_SE_ERRORE, IDVariant P_MODULO, IDVariant P_ISTANZA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_UTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_SE_ERRORE);
    OutPar.add(new Integer(-IDVariant.INTEGER));
    SPPar.add(P_MODULO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_ISTANZA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.FE_ACCETTAZIONE_MULTIPLA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INDEFEPASSIVAFEACCETTAZIONEMULTIPLA",s);
    }
  }

  public int InserisciinContabilita(IDVariant P_ID_DOCUMENTO, IDVariant P_UTENTE, IDVariant SE_INVIO_ESITO, IDVariant P_MESS_DA_INS_SOGG, IDVariant P_SE_INSERITA_QTN, IDVariant P_ANNO_PROGR, IDVariant P_NUMERO_PROGR, IDVariant P_SE_ERRORE, IDVariant P_MESSAGGIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(P_ID_DOCUMENTO);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(P_UTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(SE_INVIO_ESITO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_MESS_DA_INS_SOGG);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_SE_INSERITA_QTN);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(P_ANNO_PROGR);
    OutPar.add(new Integer(-IDVariant.INTEGER));
    SPPar.add(P_NUMERO_PROGR);
    OutPar.add(new Integer(-IDVariant.INTEGER));
    SPPar.add(P_SE_ERRORE);
    OutPar.add(new Integer(-IDVariant.INTEGER));
    SPPar.add(P_MESSAGGIO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.FE_INS_IN_CONTABILITA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("InserisciinContabilita",s);
    }
  }

  // **********************************************************************
  // Descrivi lo scopo di questa funzione...
  // **********************************************************************
  public int INDEFEPASSIVAFECONTROLLOSOGGETTO(IDVariant PIDDOCUMENTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.FE_CONTROLLO_SOGGETTO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INDEFEPASSIVAFECONTROLLOSOGGETTO",s);
    }
  }

  public int INDEFEPASSIVAINSERISCEQTNDASCELTABEN(IDVariant PIDDOCUMENTO, IDVariant PCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.INSERISCE_QTN_DA_SCELTA_BEN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INDEFEPASSIVAINSERISCEQTNDASCELTABEN",s);
    }
  }

  public int INDEFESMISTAMENTOFECALCOLARIFERIMENTIFE(IDVariant PIDDOCUMENTO, IDVariant PCUU, IDVariant PRIF, IDVariant PBDO, IDVariant PIMP)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCUU);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(PRIF);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(PBDO);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(PIMP);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_SMISTAMENTO.FE_CALCOLA_RIFERIMENTI_FE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INDEFESMISTAMENTOFECALCOLARIFERIMENTIFE",s);
    }
  }

  public int ImportadaGDM(IDVariant P_UTENTE, IDVariant P_SE_ERRORE, IDVariant P_MESSAGIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(P_UTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_SE_ERRORE);
    OutPar.add(new Integer(-IDVariant.INTEGER));
    SPPar.add(P_MESSAGIO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.FE_IMPORT_DA_GDM",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ImportadaGDM",s);
    }
  }

  // **********************************************************************
  // Descrivi lo scopo di questa funzione...
  // **********************************************************************
  public int INDEFEPASSIVAFECANCELLAFATTURA(IDVariant PIDDOCUMENTO, IDVariant P_ULTIMO_STATO, IDVariant P_UTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_ULTIMO_STATO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_UTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.FE_CANCELLA_FATTURA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INDEFEPASSIVAFECANCELLAFATTURA",s);
    }
  }

  public int RECUPERA_PROTOCOLLO_GENERALE(IDVariant P_UTENTE, IDVariant P_SE_ERRORE, IDVariant P_MESSAGIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(P_UTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_SE_ERRORE);
    OutPar.add(new Integer(-IDVariant.INTEGER));
    SPPar.add(P_MESSAGIO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.RECUPERA_PROTOCOLLO_GENERALE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RECUPERA_PROTOCOLLO_GENERALE",s);
    }
  }

  // **********************************************************************
  // Descrivi lo scopo di questa funzione...
  // **********************************************************************
  public int INDEFEPASSIVAFERIPRISTINAFATTURA(IDVariant PIDDOCUMENTO, IDVariant P_ULTIMO_STATO, IDVariant P_UTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_ULTIMO_STATO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_UTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.FE_RIPRISTINA_FATTURA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INDEFEPASSIVAFERIPRISTINAFATTURA",s);
    }
  }

  public int INDEFESMISTAMENTOFERICALCOLADAXML(IDVariant PIDDOCUMENTO, IDVariant PPROGRUO, IDVariant P_SE_MULTISERVIZI, IDVariant PMESSAGGIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDDOCUMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRUO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(P_SE_MULTISERVIZI);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(PMESSAGGIO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_SMISTAMENTO.FE_RICALCOLA_DA_XML",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INDEFESMISTAMENTOFERICALCOLADAXML",s);
    }
  }

  public int InserisciSoggettoinContabilita(IDVariant P_ID_DOCUMENTO, IDVariant P_MESSAGGIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(P_ID_DOCUMENTO);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(P_MESSAGGIO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_FE_PASSIVA.FE_INS_SOGG_IN_CONTABILITA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("InserisciSoggettoinContabilita",s);
    }
  }

  public int FATAGGESIGIBILITA(IDVariant DATADA, IDVariant DATAA, IDVariant DATAREG, IDVariant TIPOREG, IDVariant TIPOBOLL, IDVariant ESERCIZIOCORR, IDVariant ANOMALIA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(DATADA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(DATAA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(DATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(TIPOREG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(TIPOBOLL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ESERCIZIOCORR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANOMALIA);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("FAT_AGG_ESIGIBILITA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FATAGGESIGIBILITA",s);
    }
  }

  public int FATRINUMERAZIONEIVA(IDVariant AREGISTRO, IDVariant ABOLLATO, IDVariant ADATADA, IDVariant AANNO, IDVariant APRIMO, IDVariant AULTIMO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AREGISTRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLATO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AANNO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APRIMO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AULTIMO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("FAT_RINUMERAZIONE_IVA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FATRINUMERAZIONEIVA",s);
    }
  }

  public int CONFERMAIVA(IDVariant ATIPOREGISTRO, IDVariant ANUMBOLLATO, IDVariant AANNO, IDVariant ADATA, IDVariant AREGLIQ, IDVariant ACONTAFAT)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ATIPOREGISTRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMBOLLATO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AREGLIQ);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACONTAFAT);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CONFERMA_IVA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONFERMAIVA",s);
    }
  }

  public int CALCOLOVENTILAZIONE(IDVariant ATR, IDVariant ATB, IDVariant AANNO, IDVariant ADA, IDVariant AA, IDVariant ARICALCOLO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ATR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATB);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ARICALCOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CALCOLO_VENTILAZIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CALCOLOVENTILAZIONE",s);
    }
  }

  public int COMUNICAZIONELIQIVAPKGSALVATOTSTAMPALIQIVA(IDVariant AESERCIZIO, IDVariant ADATADA, IDVariant ADATAA, IDVariant ADATADAT, IDVariant ADEBITOPREC, IDVariant ACREDITOPREC, IDVariant AACCONTODOVUTO, IDVariant ATIPOLIQ, IDVariant ADESCRIZIONESTAMPA, IDVariant APERIODO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATADAT);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADEBITOPREC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACREDITOPREC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AACCONTODOVUTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOLIQ);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADESCRIZIONESTAMPA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APERIODO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("COMUNICAZIONE_LIQ_IVA_PKG.SALVA_TOT_STAMPA_LIQ_IVA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("COMUNICAZIONELIQIVAPKGSALVATOTSTAMPALIQIVA",s);
    }
  }

  public int COMUNICAZIONELIQIVAPKGESTRAZIONEDATI(IDVariant AESERCIZIO, IDVariant ATRIMESTRE, IDVariant ASOLOTRIMESTRALE, IDVariant ADEBITOPREC, IDVariant ACREDITOPREC, IDVariant AIMPMAXNONVERS, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATRIMESTRE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASOLOTRIMESTRALE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADEBITOPREC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACREDITOPREC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIMPMAXNONVERS);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("COMUNICAZIONE_LIQ_IVA_PKG.ESTRAZIONE_DATI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("COMUNICAZIONELIQIVAPKGESTRAZIONEDATI",s);
    }
  }

  public int COMUNICAZIONELIQIVAPKGGENERAZIONEXML(IDVariant AESERCIZIO, IDVariant ATRIMESTRE, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATRIMESTRE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("COMUNICAZIONE_LIQ_IVA_PKG.GENERAZIONE_XML",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("COMUNICAZIONELIQIVAPKGGENERAZIONEXML",s);
    }
  }

  public int COMUNICAZIONELIQIVAPKGAGGIORNACAMPI(IDVariant AESERCIZIO, IDVariant ATRIMESTRE, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATRIMESTRE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("COMUNICAZIONE_LIQ_IVA_PKG.AGGIORNA_CAMPI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("COMUNICAZIONELIQIVAPKGAGGIORNACAMPI",s);
    }
  }

  public int ESIGIVAPARZIALECONTROLLAWRK(IDVariant PSESSIONE, IDVariant PCONTROLLIOK, IDVariant PMSGERR)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCONTROLLIOK);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(PMSGERR);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("ESIG_IVA_PARZIALE.CONTROLLA_WRK",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ESIGIVAPARZIALECONTROLLAWRK",s);
    }
  }

  public int ESIGIVAPARZIALEESIGIBILITA(IDVariant PSESSIONE, IDVariant PDATAREG, IDVariant PTIPOBOLL, IDVariant PESERCIZIO, IDVariant PUTENTE, IDVariant PRISULTATO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PTIPOBOLL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PRISULTATO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("ESIG_IVA_PARZIALE.ESIGIBILITA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ESIGIVAPARZIALEESIGIBILITA",s);
    }
  }

  public int ESIGIVAPARZIALECARICAWRK(IDVariant PSESSIONE, IDVariant PDATADA, IDVariant PDATAA, IDVariant PDATAREG, IDVariant PTIPOREG, IDVariant PTIPOBOLL, IDVariant PESERCIZIO, IDVariant PUTENTE, IDVariant PANOMALIA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATADA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PDATAA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PDATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PTIPOREG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOBOLL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANOMALIA);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("ESIG_IVA_PARZIALE.CARICA_WRK",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ESIGIVAPARZIALECARICAWRK",s);
    }
  }

  public int CF4WEBDUPLICAIMPUTE(IDVariant AESERCIZIO, IDVariant ATIPOUTENZA, IDVariant ARITORNO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOUTENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARITORNO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CF4WEB_DUPLICA_IMP_UTE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBDUPLICAIMPUTE",s);
    }
  }

  public int WORKDISTINTAUT(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ATIPOUTENZA, IDVariant AANNODISTINTA, IDVariant ANUMERODISTINTA, IDVariant ADATADISTINTA, IDVariant ASCADENZADAL, IDVariant ASCADENZAAL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOUTENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AANNODISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMERODISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADISTINTA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ASCADENZADAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ASCADENZAAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_DISTINTA_UT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKDISTINTAUT",s);
    }
  }

  public int WORKDISTINTAUTGAL(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ATIPOUTENZA, IDVariant AANNODISTINTA, IDVariant ANUMERODISTINTA, IDVariant ADATADISTINTA, IDVariant ASCADENZADAL, IDVariant ASCADENZAAL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOUTENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AANNODISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMERODISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADISTINTA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ASCADENZADAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ASCADENZAAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_DISTINTA_UT_GAL",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKDISTINTAUTGAL",s);
    }
  }

  public int CARICAUTENZETMPFAT(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ATIPOUTENZA, IDVariant ANUMERODISTINTA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOUTENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMERODISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CARICA_UTENZE_TMP_FAT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAUTENZETMPFAT",s);
    }
  }

  public int CARICALIQPI(IDVariant PSESSIONEID, IDVariant PTIPOUTENZA, IDVariant PBEN, IDVariant PUFFICIO, IDVariant PCAUSALE, IDVariant PBOLLO, IDVariant PANNODEL, IDVariant PNUMERODEL, IDVariant PSEDEDEL, IDVariant PDESC, IDVariant PESERCIZIO, IDVariant PDATA, IDVariant PEMISS, IDVariant PNUMQUIETANZA, IDVariant PIMPDA, IDVariant PIMPA, IDVariant PSUBDA, IDVariant PSUBA, IDVariant PLIQDA, IDVariant PLIQA, IDVariant PANTICIPAZIONE, IDVariant PNOFINANZIAMENTO, IDVariant PCONTROLLODISP, IDVariant PCOMPETENZADAL, IDVariant PCOMPETENZAAL, IDVariant PNUMEROCONTABILE, IDVariant PDATACONTABILE, IDVariant PDESCRUTENZE, IDVariant PSUPDISPPURO, IDVariant PMOTIVOESCLUSIONECIG)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOUTENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PBEN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PBOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PEMISS);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMQUIETANZA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PIMPA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PSUBDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PSUBA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PLIQDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PLIQA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PANTICIPAZIONE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNOFINANZIAMENTO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PCONTROLLODISP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCOMPETENZADAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PCOMPETENZAAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PNUMEROCONTABILE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATACONTABILE);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PDESCRUTENZE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSUPDISPPURO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PMOTIVOESCLUSIONECIG);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CARICA_LIQ_PI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICALIQPI",s);
    }
  }

  public int CARICAUTENZEGEN(IDVariant PSESSIONE, IDVariant PTIPOUTENZA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOUTENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CARICA_UTENZE_GEN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAUTENZEGEN",s);
    }
  }

  public int CARICAFATPI(IDVariant PESERCIZIO, IDVariant PSESSIONEID, IDVariant PTIPOUTENZA, IDVariant PBEN, IDVariant PDATAPROT, IDVariant PANNOPROG, IDVariant PDESCRIZIONE, IDVariant PNUMQUIETANZA, IDVariant PCATEGORIA, IDVariant PMAX, IDVariant PFATTURE, IDVariant PCOMPETENZADAL, IDVariant PCOMPETENZAAL, IDVariant PDATAARRIVO, IDVariant PNUMPROTGEN)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOUTENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PBEN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAPROT);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PANNOPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMQUIETANZA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCATEGORIA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PMAX);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PFATTURE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PCOMPETENZADAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PCOMPETENZAAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PDATAARRIVO);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PNUMPROTGEN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CARICA_FAT_PI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAFATPI",s);
    }
  }

  public int CARICAUTENZECONSUMI(IDVariant ASESSIONE, IDVariant ATIPOUTENZA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOUTENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CARICA_UTENZE_CONSUMI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAUTENZECONSUMI",s);
    }
  }

  public int ACHKNUMERAZIONEIVA(IDVariant AANNO, IDVariant ATIPOREGISTRO, IDVariant ATIPOBOLLATO, IDVariant ADATA, IDVariant ANUMERO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOREGISTRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOBOLLATO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ANUMERO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("A_CHK_NUMERAZIONE_IVA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ACHKNUMERAZIONEIVA",s);
    }
  }

  public int AGGIORNABOLLATOCORR(IDVariant PSESSIONE, IDVariant PBOLLATOOLD, IDVariant PANNOCORR, IDVariant PCORRDA, IDVariant PCORRA, IDVariant PBOLLATONEW)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PBOLLATOOLD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOCORR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCORRDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCORRA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PBOLLATONEW);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("AGGIORNA_BOLLATO_CORR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("AGGIORNABOLLATOCORR",s);
    }
  }

  public int PCCFILERICEZIONE(IDVariant ASESSIONE, IDVariant AUTENTE, IDVariant ANUMDOCELAB, IDVariant ANOMEFILE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMDOCELAB);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ANOMEFILE);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("PCC_FILE_RICEZIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PCCFILERICEZIONE",s);
    }
  }

  public int PCCEXPORTDACFA(IDVariant ADATAINIZIOSEL, IDVariant ADATAFINESEL, IDVariant ADATADOCENTROIL, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ADATAINIZIOSEL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATAFINESEL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATADOCENTROIL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("PCC_EXPORT_DA_CFA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PCCEXPORTDACFA",s);
    }
  }

  public int PCCFILECONTABILIZZAZIONE(IDVariant ASESSIONE, IDVariant AUTENTE, IDVariant ANUMDOCELAB, IDVariant ANOMEFILE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMDOCELAB);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ANOMEFILE);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("PCC_FILE_CONTABILIZZAZIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PCCFILECONTABILIZZAZIONE",s);
    }
  }

  public int PCCFILESCADUTO(IDVariant ASESSIONE, IDVariant AUTENTE, IDVariant ADATARIFSCADUTO, IDVariant ADATARIFMNADATI, IDVariant ANUMDOCELAB, IDVariant ANOMEFILE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATARIFSCADUTO);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATARIFMNADATI);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ANUMDOCELAB);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ANOMEFILE);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("PCC_FILE_SCADUTO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PCCFILESCADUTO",s);
    }
  }

  public int PCCANNULLAFILE(IDVariant ANOMEFILE, IDVariant AUTENTE, IDVariant AMSG)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ANOMEFILE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AMSG);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("PCC_ANNULLA_FILE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PCCANNULLAFILE",s);
    }
  }

  public int PCCCAMBIAAZIONE(IDVariant APROGRESSIVOREGISTRAZIONE, IDVariant AAZIONE, IDVariant ANOTE, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(APROGRESSIVOREGISTRAZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AAZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANOTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("PCC_CAMBIA_AZIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PCCCAMBIAAZIONE",s);
    }
  }

  public int PCCIMPORTAESITI(IDVariant PSESSIONE, IDVariant PNOMEFILE, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNOMEFILE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("PCC_IMPORTA_ESITI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PCCIMPORTAESITI",s);
    }
  }

  public int CAPPD(IDVariant OLDESERCIZIO, IDVariant OLDES, IDVariant OLDCAPITOLO, IDVariant OLDARTICOLO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(OLDCAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CAP_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CAPPD",s);
    }
  }

  public int INSRESPONSABILEUO(IDVariant APROGRSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(APROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("INS_RESPONSABILE_UO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INSRESPONSABILEUO",s);
    }
  }

  public int CAPUOALLINEA(IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AESERCIZIO, IDVariant AES, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CAP_UO_ALLINEA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CAPUOALLINEA",s);
    }
  }

  public int INSCAPESERCSUCCWEB(IDVariant AESERCIZIO, IDVariant AES, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("INS_CAP_ESERC_SUCC_WEB",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INSCAPESERCSUCCWEB",s);
    }
  }

  public int IMPUTAECOMOVIMENTI(IDVariant AESERCIZIO, IDVariant a_utilizzo_fat_comodo)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(a_utilizzo_fat_comodo);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("IMPUTA_ECO_MOVIMENTI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("IMPUTAECOMOVIMENTI",s);
    }
  }

  public int INSCAPCF4(IDVariant AESERCIZIO, IDVariant AES, IDVariant ARISINT, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant ACAPITOLOARM, IDVariant AARTICOLOARM, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARISINT);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLOARM);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLOARM);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("INS_CAP_CF4",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INSCAPCF4",s);
    }
  }

  public int AGGMOVCAPITOLO(IDVariant PESERCIZIO, IDVariant PES, IDVariant PCAPITOLO, IDVariant PARTICOLO, IDVariant PATTRIBUTO, IDVariant PAGGATT)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PATTRIBUTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PAGGATT);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("AGG_MOV_CAPITOLO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("AGGMOVCAPITOLO",s);
    }
  }

  public int RETTIFICAUOVOCEPEG(IDVariant PESERCIZIO, IDVariant PSESSIONE, IDVariant PES, IDVariant PCAPITOLO, IDVariant PARTICOLO, IDVariant PPROGRUOOLD, IDVariant PPROGRUONEW, IDVariant PPROGRUOUTILOLD, IDVariant PPROGRUOUTILNEW)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRUOOLD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRUONEW);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRUOUTILOLD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRUOUTILNEW);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("RETTIFICA_UO_VOCE_PEG",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RETTIFICAUOVOCEPEG",s);
    }
  }

  public int AGGIUNGIUO(IDVariant PESERCIZIO, IDVariant PSESSIONE, IDVariant P_ES, IDVariant P_RISORSA_INTERVENTO, IDVariant P_CAPITOLO, IDVariant P_ARTICOLO, IDVariant P_PROGR_UO, IDVariant P_TIPO_UO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_ES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_RISORSA_INTERVENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_CAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_ARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_PROGR_UO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_TIPO_UO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("INDE_UO_GEST.AGGIUNGI_UO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("AGGIUNGIUO",s);
    }
  }

  public int RETTIFICAMASSIVA(IDVariant PESERCIZIO, IDVariant PSESSIONE, IDVariant PES, IDVariant PRISORSAINTERVENTO, IDVariant PCAPITOLO, IDVariant PARTICOLO, IDVariant PPROGRUOOLD, IDVariant PPROGRUONEW, IDVariant PTIPO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PRISORSAINTERVENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRUOOLD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRUONEW);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("RETTIFICA_MASSIVA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RETTIFICAMASSIVA",s);
    }
  }

  public int RETTIFICAUOCAPINS(IDVariant AESERCIZIO, IDVariant AOTTICAOLD, IDVariant AOTTICANEW, IDVariant ASCADENZAUO, IDVariant A_SOLO_CAP_UO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOTTICAOLD);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AOTTICANEW);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASCADENZAUO);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(A_SOLO_CAP_UO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("RETTIFICA_UO_CAP_INS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RETTIFICAUOCAPINS",s);
    }
  }

  public int RETTIFICAUOCAMBIOOTTICA(IDVariant PESERCIZIO, IDVariant PSESSIONE, IDVariant POTTICANEW, IDVariant PUTENTE, IDVariant PSIMULAZIONE, IDVariant PCOMPETENZEUO, IDVariant PERRORI)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(POTTICANEW);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSIMULAZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCOMPETENZEUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PERRORI);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("RETTIFICA_UO_CAMBIO_OTTICA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RETTIFICAUOCAMBIOOTTICA",s);
    }
  }

  public int AGGCAPTIPOAVANZO(IDVariant PESERCIZIO, IDVariant PESERCIZISUCCESSIVI)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZISUCCESSIVI);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("AGG_CAP_TIPO_AVANZO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("AGGCAPTIPOAVANZO",s);
    }
  }

  public int ESEFINPD(IDVariant OLDESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ESEFIN_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ESEFINPD",s);
    }
  }

  public int BILPD(IDVariant OLDESERCIZIO, IDVariant OLDES, IDVariant OLDCAPITOLO, IDVariant OLDARTICOLO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(OLDCAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILPD",s);
    }
  }

  public int FINGENERAZIONEDACRONO(IDVariant AESERCIZIO, IDVariant AESERCIZIORIF, IDVariant ACRONOPROGRAMMAID, IDVariant ASESSIONE, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIORIF);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACRONOPROGRAMMAID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("FIN_GENERAZIONE_DA_CRONO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FINGENERAZIONEDACRONO",s);
    }
  }

  public int GENERACRONOPIANOCOMPTMP(IDVariant AESERCIZIO, IDVariant ACRONOPROGRAMMAID, IDVariant APROGRESSIVOIMPUTAZIONE, IDVariant ASESSIONE, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACRONOPROGRAMMAID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRESSIVOIMPUTAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_CRONO_PIANO_COMP_TMP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERACRONOPIANOCOMPTMP",s);
    }
  }

  public int INSPIANOCRONODAENTRATE(IDVariant AESERCIZIO, IDVariant ACRONOPROGRAMMAID, IDVariant APROGRESSIVOIMPUTAZIONE, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACRONOPROGRAMMAID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRESSIVOIMPUTAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("INS_PIANO_CRONO_DA_ENTRATE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INSPIANOCRONODAENTRATE",s);
    }
  }

  public int POADEFINIZIONEPROGETTI(IDVariant PPROGRESSIVOSESSIONE, IDVariant PESERCIZIO, IDVariant PCRONOPROGRAMMAID, IDVariant PUTENTE, IDVariant PDATE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PPROGRESSIVOSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCRONOPROGRAMMAID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATE);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("POA_DEFINIZIONE_PROGETTI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POADEFINIZIONEPROGETTI",s);
    }
  }

  public int CRONOGENERAIMPEGNI(IDVariant AESERCIZIO, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AFINANZIAMENTO, IDVariant ATIPOELAB, IDVariant ADELDACRONO, IDVariant ASEDEDEL, IDVariant ANUMERODEL, IDVariant AANNODEL, IDVariant ASESSIONE, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFINANZIAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOELAB);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADELDACRONO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CRONO_GENERA_IMPEGNI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CRONOGENERAIMPEGNI",s);
    }
  }

  public int FINGENDACRONOCARICAWRK(IDVariant AESERCIZIO, IDVariant AESERCIZIOCONTESTO, IDVariant AVARIAZIONICRONO, IDVariant ADESTINAZIONE, IDVariant ASESSIONE, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIOCONTESTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AVARIAZIONICRONO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADESTINAZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("FIN_GEN_DA_CRONO_CARICA_WRK",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FINGENDACRONOCARICAWRK",s);
    }
  }

  public int FINGENDACRONOINS(IDVariant ASESSIONE, IDVariant APROGRESSIVOCRONO, IDVariant APROGRESSIVO, IDVariant ADESTINAZIONE, IDVariant AMSGERR)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRESSIVOCRONO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRESSIVO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADESTINAZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AMSGERR);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("FIN_GEN_DA_CRONO_INS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FINGENDACRONOINS",s);
    }
  }

  public int FSCAGGTIPICALCCAP(IDVariant PESERCIZIO, IDVariant PUTENTE, IDVariant PMESSAGGIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PMESSAGGIO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("FSC_AGG_TIPI_CALC_CAP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FSCAGGTIPICALCCAP",s);
    }
  }

  public int FSCCALCOLOGEN(IDVariant PESERCIZIO, IDVariant PPRIMOESERCARM)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPRIMOESERCARM);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("FSC_CALCOLO_GEN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FSCCALCOLOGEN",s);
    }
  }

  public int FSCAGGCAPIMPORTIPREV(IDVariant PESERCIZIO, IDVariant PPRIMOESERCARM, IDVariant PUTENTE, IDVariant PMESSAGGIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPRIMOESERCARM);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PMESSAGGIO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("FSC_AGG_CAP_IMPORTI_PREV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FSCAGGCAPIMPORTIPREV",s);
    }
  }

  public int FSCAPPLRIDREND(IDVariant PESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("FSC_APPL_RID_REND",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FSCAPPLRIDREND",s);
    }
  }

  public int FSCCALCOLOIMPORTIREND(IDVariant PESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("FSC_CALCOLO_IMPORTI_REND",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FSCCALCOLOIMPORTIREND",s);
    }
  }

  public int FSCCALCOLOPERCREND(IDVariant PESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("FSC_CALCOLO_PERC_REND",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FSCCALCOLOPERCREND",s);
    }
  }

  public int FSCAGGCALCOLOIMPORTIREND(IDVariant PESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("FSC_AGG_CALCOLO_IMPORTI_REND",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FSCAGGCALCOLOIMPORTIREND",s);
    }
  }

  public int FSCCONFERMAGEST(IDVariant PESERCIZIO, IDVariant PDATAESTRAZIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAESTRAZIONE);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("FSC_CONFERMA_GEST",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FSCCONFERMAGEST",s);
    }
  }

  public int FSCCALCOLOGEST(IDVariant PESERCIZIO, IDVariant PDATAESTRAZIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAESTRAZIONE);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("FSC_CALCOLO_GEST",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("FSCCALCOLOGEST",s);
    }
  }

  public int DUPLICAESERCIZIOTCC(IDVariant AESERCIZIO, IDVariant AALTROESERCIZIO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AALTROESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("DUPLICA_ESERCIZIO_TCC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("DUPLICAESERCIZIOTCC",s);
    }
  }

  public int DUPLICAESERCIZIOPCS(IDVariant AESERCIZIO, IDVariant AES, IDVariant AALTROESERCIZIO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AALTROESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("DUPLICA_ESERCIZIO_PCS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("DUPLICAESERCIZIOPCS",s);
    }
  }

  public int BPRGENERAZIONEARMFIN(IDVariant AESERCIZIO, IDVariant AESERCIZIORIF, IDVariant AUTENTE, IDVariant ASTNDAPURO, IDVariant ACOMMIT)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIORIF);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTNDAPURO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACOMMIT);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BPR_GENERAZIONE_ARM_FIN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BPRGENERAZIONEARMFIN",s);
    }
  }

  public int BPRGENERAZIONEARM(IDVariant AESERCIZIO, IDVariant AESERCIZIORIF, IDVariant AUTENTE, IDVariant ASTNDAPURO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIORIF);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTNDAPURO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BPR_GENERAZIONE_ARM",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BPRGENERAZIONEARM",s);
    }
  }

  public int BILGENERAZIONEARM(IDVariant AESERCIZIO, IDVariant AESERCIZIORIF, IDVariant AUTENTE, IDVariant ASTNDAPURO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIORIF);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTNDAPURO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BIL_GENERAZIONE_ARM",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILGENERAZIONEARM",s);
    }
  }

  public int BPRGENERAZIONEARMBPRFIN(IDVariant AESERCIZIO, IDVariant AESERCIZIORIF, IDVariant AUTENTE, IDVariant ASTNDAPURO, IDVariant ACOMMIT)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIORIF);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTNDAPURO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACOMMIT);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BPR_GENERAZIONE_ARM_BPR_FIN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BPRGENERAZIONEARMBPRFIN",s);
    }
  }

  public int BPRGENERAZIONEARMBPR(IDVariant AESERCIZIO, IDVariant AESERCIZIORIF, IDVariant AUTENTE, IDVariant ASTNDAPURO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIORIF);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTNDAPURO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BPR_GENERAZIONE_ARM_BPR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BPRGENERAZIONEARMBPR",s);
    }
  }

  public int BILCALCOLOSTNPUROARM(IDVariant AESERCIZIO, IDVariant AESERCIZIORIF, IDVariant AES, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIORIF);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BIL_CALCOLO_STN_PURO_ARM",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILCALCOLOSTNPUROARM",s);
    }
  }

  public int BILCALCOLORESPRESUNTIARM(IDVariant AESERCIZIO, IDVariant AES, IDVariant ATIPO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BIL_CALCOLO_RES_PRESUNTI_ARM",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILCALCOLORESPRESUNTIARM",s);
    }
  }

  public int BILCALCOLOSTNCASSAARM(IDVariant AESERCIZIO, IDVariant AES, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BIL_CALCOLO_STN_CASSA_ARM",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILCALCOLOSTNCASSAARM",s);
    }
  }

  public int BILCALCOLOSTNESIGACC(IDVariant PESERCIZIO, IDVariant PESERCIZIODACALC)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIODACALC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_CALCOLO_STN_ESIG_ACC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILCALCOLOSTNESIGACC",s);
    }
  }

  public int BILCALCOLOSTNESIGIMP(IDVariant PESERCIZIO, IDVariant PESERCIZIODACALC)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIODACALC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_CALCOLO_STN_ESIG_IMP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILCALCOLOSTNESIGIMP",s);
    }
  }

  public int BILCALCOLOSTNESIGCRONO(IDVariant AESERCIZIO, IDVariant AESERCIZIODACALC, IDVariant ASESSIONE, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIODACALC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BIL_CALCOLO_STN_ESIG_CRONO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILCALCOLOSTNESIGCRONO",s);
    }
  }

  public int BILCALCOLOAGGFPV(IDVariant PESERCIZIO, IDVariant PESERCIZIODACALC, IDVariant PSESSIONE, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIODACALC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BIL_CALCOLO_AGG_FPV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILCALCOLOAGGFPV",s);
    }
  }

  public int BILCALCOLOGIAIMPEGNATO(IDVariant AESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_CALCOLO_GIA_IMPEGNATO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILCALCOLOGIAIMPEGNATO",s);
    }
  }

  public int BILCALCOLOPREVISIONE(IDVariant AESERCIZIO, IDVariant AES)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BIL_CALCOLO_PREVISIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILCALCOLOPREVISIONE",s);
    }
  }

  public int BPRCALCPREVISIONECASSA(IDVariant AESERCIZIO, IDVariant AES)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BPR_CALC_PREVISIONE_CASSA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BPRCALCPREVISIONECASSA",s);
    }
  }

  public int BILCALCOLOSTNPUROARMEFF(IDVariant AESERCIZIO, IDVariant AESERCIZIORIF, IDVariant AES, IDVariant AUTENTE, IDVariant ACANCELLAVARIAZIONI, IDVariant AINSBIL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIORIF);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACANCELLAVARIAZIONI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AINSBIL);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BIL_CALCOLO_STN_PURO_ARM_EFF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILCALCOLOSTNPUROARMEFF",s);
    }
  }

  public int BILCALCOLORESPRESUNTIEFF(IDVariant AESERCIZIO, IDVariant AES, IDVariant ATIPO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BIL_CALCOLO_RES_PRESUNTI_EFF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILCALCOLORESPRESUNTIEFF",s);
    }
  }

  public int BILCALCOLOSTNCASSAARMBIL(IDVariant AESERCIZIO, IDVariant AES, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BIL_CALCOLO_STN_CASSA_ARM_BIL",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILCALCOLOSTNCASSAARMBIL",s);
    }
  }

  public int BILCALCOLOGIAIMPEGNATOEFF(IDVariant AESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_CALCOLO_GIA_IMPEGNATO_EFF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILCALCOLOGIAIMPEGNATOEFF",s);
    }
  }

  public int BILPASSAGGIOBPRBILARM(IDVariant AESERCIZIO, IDVariant AESERCIZIOPLUR, IDVariant ARESPRES, IDVariant ASTNCOREISCR, IDVariant ASTNCA, IDVariant AGIAIMP, IDVariant APREVANNOPREC, IDVariant APREVCASSAANNOPREC, IDVariant ADATAAPPRBILANCIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIOPLUR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ARESPRES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTNCOREISCR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTNCA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AGIAIMP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APREVANNOPREC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APREVCASSAANNOPREC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAAPPRBILANCIO);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("BIL_PASSAGGIO_BPR_BIL_ARM",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILPASSAGGIOBPRBILARM",s);
    }
  }

  public int BILGENERAZIONE(IDVariant WESERCIZIO, IDVariant WGENPLUR, IDVariant WBILPROVA, IDVariant WESERCIZIORIF, IDVariant WTIPOSTN)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(WESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(WGENPLUR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(WBILPROVA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(WESERCIZIORIF);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(WTIPOSTN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_GENERAZIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILGENERAZIONE",s);
    }
  }

  public int BPRGENERAZIONE(IDVariant AESERCIZIO, IDVariant APRECEDENTE, IDVariant ATIPOSTN)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APRECEDENTE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOSTN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BPR_GENERAZIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BPRGENERAZIONE",s);
    }
  }

  public int BILGENERAZIONEFIN(IDVariant AESERCIZIO, IDVariant ABILSIM)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABILSIM);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BIL_GENERAZIONE_FIN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILGENERAZIONEFIN",s);
    }
  }

  public int BILPREVENTIVO(IDVariant WESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(WESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_PREVENTIVO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILPREVENTIVO",s);
    }
  }

  public int BILULTIMOCHIUSO(IDVariant WESERCIZIO, IDVariant WSEPROVA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(WESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(WSEPROVA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_ULTIMO_CHIUSO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILULTIMOCHIUSO",s);
    }
  }

  public int BILPREVISIONE(IDVariant WESERCIZIO, IDVariant WBILPROVA, IDVariant WSECOMP)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(WESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(WBILPROVA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(WSECOMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_PREVISIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILPREVISIONE",s);
    }
  }

  public int BILRICALCOLOPLURIENNALE(IDVariant AESERCIZIO, IDVariant ASUBILPROVA, IDVariant AESERCIZIORIF, IDVariant ADABILPROVA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASUBILPROVA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIORIF);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADABILPROVA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_RICALCOLO_PLURIENNALE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILRICALCOLOPLURIENNALE",s);
    }
  }

  public int CALCOLARESPRES(IDVariant AESERCIZIO, IDVariant ATIPO, IDVariant AES, IDVariant ADATAAL, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CALCOLA_RES_PRES",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CALCOLARESPRES",s);
    }
  }

  public int CALCOLACASSA(IDVariant AESERCIZIO, IDVariant AES, IDVariant ATIPO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CALCOLA_CASSA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CALCOLACASSA",s);
    }
  }

  public int CALCOLAGIAIMP(IDVariant AESERCIZIO, IDVariant ATIPO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CALCOLA_GIA_IMP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CALCOLAGIAIMP",s);
    }
  }

  public int BILACCERTAMENTIPLURIENNALI(IDVariant WESERCIZIO, IDVariant WDATAREGS, IDVariant WPRIMOACC, IDVariant WULTIMOACC)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(WESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(WDATAREGS);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(WPRIMOACC);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(WULTIMOACC);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_ACCERTAMENTI_PLURIENNALI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILACCERTAMENTIPLURIENNALI",s);
    }
  }

  public int BILIMPEGNIPLURIENNALI(IDVariant WESERCIZIO, IDVariant WDATAREGS, IDVariant WEMISSIONESUB, IDVariant WPRIMOIMP, IDVariant WULTIMOIMP, IDVariant WPRIMOSUBIMP, IDVariant WULTIMOSUBIMP)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(WESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(WDATAREGS);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(WEMISSIONESUB);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(WPRIMOIMP);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(WULTIMOIMP);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(WPRIMOSUBIMP);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(WULTIMOSUBIMP);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_IMPEGNI_PLURIENNALI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILIMPEGNIPLURIENNALI",s);
    }
  }

  public int BPRELIMINA(IDVariant AESERCIZIO, IDVariant AFASEBIL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFASEBIL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BPR_ELIMINA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BPRELIMINA",s);
    }
  }

  public int BILAPERTURA(IDVariant WESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(WESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_APERTURA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILAPERTURA",s);
    }
  }

  public int LANCIOPROCEDURASTAMPEPREV(IDVariant AESERCIZIO, IDVariant ASESSIONE, IDVariant AUTENTE, IDVariant APROGRESSIVO, IDVariant AIDSTAMPA, IDVariant ANOTA, IDVariant AESERCIZIOPLUR)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRESSIVO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIDSTAMPA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANOTA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIOPLUR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("LANCIO_PROCEDURA_STAMPE_PREV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("LANCIOPROCEDURASTAMPEPREV",s);
    }
  }

  public int WORKBILPREVRISPRES(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PIDSTAMPA, IDVariant PNOTA, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIDSTAMPA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNOTA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_RIS_PRES",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVRISPRES",s);
    }
  }

  public int WORKVARQGENRIASS(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PANNODEL, IDVariant PNUMERODEL, IDVariant PSEDEDEL, IDVariant PANNOPROPOSTA, IDVariant PNUMEROPROPOSTA, IDVariant PUNITAPROPONENTE, IDVariant PTIPOVAR, IDVariant PDATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANNOPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROPONENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_VAR_QGEN_RIASS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKVARQGENRIASS",s);
    }
  }

  public int WORKVAREQUILIBRI(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PANNODEL, IDVariant PNUMERODEL, IDVariant PSEDEDEL, IDVariant PANNOPROPOSTA, IDVariant PNUMEROPROPOSTA, IDVariant PUNITAPROPONENTE, IDVariant PTIPOVAR, IDVariant PDATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANNOPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROPONENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_VAR_EQUILIBRI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKVAREQUILIBRI",s);
    }
  }

  public int WORKBILPREVVERVINCFP(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PANNODEL, IDVariant PNUMERODEL, IDVariant PSEDEDEL, IDVariant PANNOPROP, IDVariant PNUMEROPROP, IDVariant PUNITAPROP, IDVariant PTIPOVAR, IDVariant PDATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_VER_VINC_FP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVVERVINCFP",s);
    }
  }

  public int WORKBILAGGCONSFPV(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PANNOPROPOSTA, IDVariant PNUMEROPROPOSTA, IDVariant PUNITAPROPONENTE, IDVariant PTIPOVAR, IDVariant PDATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROPONENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_BIL_AGG_CONS_FPV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILAGGCONSFPV",s);
    }
  }

  public int WORKBILPREVPIANOIND(IDVariant PESERCIZIO, IDVariant PESERCIZIORIF, IDVariant PUTENTE, IDVariant PAGGIORNA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIORIF);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PAGGIORNA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_PIANO_IND",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVPIANOIND",s);
    }
  }

  public int WORKBILPREVCAPE(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PTIPOBILBPR, IDVariant PTITOLO, IDVariant PTIPOLOGIA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOBILBPR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOLOGIA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_CAP_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVCAPE",s);
    }
  }

  public int WORKBILPREVCAPEUO(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PTIPOBILBPR, IDVariant PTITOLO, IDVariant PTIPOLOGIA, IDVariant PPROGRUNITA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOBILBPR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOLOGIA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRUNITA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_CAP_E_UO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVCAPEUO",s);
    }
  }

  public int WORKBILPREVCAPS(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PTIPOBILBPR, IDVariant PMISSIONE, IDVariant PPROGRAMMA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOBILBPR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PMISSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRAMMA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_CAP_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVCAPS",s);
    }
  }

  public int WORKBILPREVCAPSUO(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PTIPOBILBPR, IDVariant PMISSIONE, IDVariant PPROGRAMMA, IDVariant PTIPOUNITA, IDVariant PPROGRUNITA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOBILBPR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PMISSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRAMMA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOUNITA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRUNITA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_CAP_S_UO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVCAPSUO",s);
    }
  }

  public int WORKBILAGGPEGANNE(IDVariant PESERCIZIO, IDVariant PVARDAL, IDVariant PVARAL, IDVariant PPROGRSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARDAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PVARAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_AGG_PEG_ANN_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILAGGPEGANNE",s);
    }
  }

  public int WORKBILAGGPEGANNS(IDVariant PESERCIZIO, IDVariant PVARDAL, IDVariant PVARAL, IDVariant PPROGRSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARDAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PVARAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_AGG_PEG_ANN_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILAGGPEGANNS",s);
    }
  }

  public int WORKBILPREVAGGPLURE(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PTITOLO, IDVariant PTIPOLOGIA, IDVariant PVARAL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOLOGIA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PVARAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_AGG_PLUR_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVAGGPLURE",s);
    }
  }

  public int WORKBILPREVAGGPLURS(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PMISSIONE, IDVariant PPROGRAMMA, IDVariant PVARAL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PMISSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRAMMA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PVARAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_AGG_PLUR_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVAGGPLURS",s);
    }
  }

  public int WORKBILPREVAGGPLURSUO(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PMISSIONE, IDVariant PPROGRAMMA, IDVariant PVARAL, IDVariant PTIPOUNITA, IDVariant PPROGRUNITA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PMISSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRAMMA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PVARAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PTIPOUNITA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRUNITA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_AGG_PLUR_S_UO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVAGGPLURSUO",s);
    }
  }

  public int WORKBILPREVAGGANNE(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PTITOLO, IDVariant PTIPOLOGIA, IDVariant PVARDAL, IDVariant PVARAL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOLOGIA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PVARDAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PVARAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_AGG_ANN_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVAGGANNE",s);
    }
  }

  public int WORKBILPREVAGGANNS(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PMISSIONE, IDVariant PPROGRAMMA, IDVariant PVARDAL, IDVariant PVARAL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PMISSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRAMMA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PVARDAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PVARAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_AGG_ANN_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVAGGANNS",s);
    }
  }

  public int WORKBILPREVAGGANNSUO(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PMISSIONE, IDVariant PPROGRAMMA, IDVariant PVARDAL, IDVariant PVARAL, IDVariant PTIPOUNITA, IDVariant PPROGRUNITA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PMISSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRAMMA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PVARDAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PVARAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PTIPOUNITA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRUNITA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_AGG_ANN_S_UO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVAGGANNSUO",s);
    }
  }

  public int WORKBILPREVAGGANNEUO(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PTITOLO, IDVariant PTIPOLOGIA, IDVariant PVARDAL, IDVariant PVARAL, IDVariant PPROGRUNITA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOLOGIA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PVARDAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PVARAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PPROGRUNITA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_AGG_ANN_E_UO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVAGGANNEUO",s);
    }
  }

  public int WORKBILPREVAGGPLUREUO(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PTITOLO, IDVariant PTIPOLOGIA, IDVariant PVARAL, IDVariant PPROGRUNITA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOLOGIA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PVARAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PPROGRUNITA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_AGG_PLUR_E_UO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVAGGPLUREUO",s);
    }
  }

  public int WORKBILAMMTRASPE(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant P_CONSUNTIVO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_CONSUNTIVO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_BIL_AMM_TRASP_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILAMMTRASPE",s);
    }
  }

  public int WORKBILAMMTRASPS(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant P_CONSUNTIVO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_CONSUNTIVO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_BIL_AMM_TRASP_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILAMMTRASPS",s);
    }
  }

  public int GENERARPPSTUDIOK(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant AES, IDVariant ATIPOBIL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOBIL);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_RPP_STUDIOK",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERARPPSTUDIOK",s);
    }
  }

  public int INSSTNZERORESIDUI(IDVariant AESERCIZIO, IDVariant ATIPOBIL, IDVariant AES, IDVariant AUTENTE, IDVariant ASTNNONINSERITI)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOBIL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTNNONINSERITI);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("INS_STN_ZERO_RESIDUI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INSSTNZERORESIDUI",s);
    }
  }

  public int INSSTNZERORESIDUIFIN(IDVariant AESERCIZIO, IDVariant ATIPOBIL, IDVariant AES, IDVariant AUTENTE, IDVariant ASTNNONINSERITI)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOBIL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTNNONINSERITI);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("INS_STN_ZERO_RESIDUI_FIN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INSSTNZERORESIDUIFIN",s);
    }
  }

  public int INSSTNZEROASSESESEPREC(IDVariant AESERCIZIO, IDVariant ATIPOBIL, IDVariant AES, IDVariant AUTENTE, IDVariant ASTNNONINSERITI)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOBIL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTNNONINSERITI);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("INS_STN_ZERO_ASSES_ESE_PREC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INSSTNZEROASSESESEPREC",s);
    }
  }

  public int INSSTNZEROASSESESEPRECF(IDVariant AESERCIZIO, IDVariant ATIPOBIL, IDVariant AES, IDVariant AUTENTE, IDVariant ASTNNONINSERITI)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOBIL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTNNONINSERITI);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("INS_STN_ZERO_ASSES_ESE_PREC_F",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INSSTNZEROASSESESEPRECF",s);
    }
  }

  public int WORKBILAMMTRASP(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_AMM_TRASP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILAMMTRASP",s);
    }
  }

  public int WORK_BIL_AMM_TRASP_CONS(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_AMM_TRASP_CONS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORK_BIL_AMM_TRASP_CONS",s);
    }
  }

  public int LANCIOPROCEDURASTAMPECONS(IDVariant AESERCIZIO, IDVariant ASESSIONE, IDVariant AUTENTE, IDVariant APROGRESSIVO, IDVariant AIDSTAMPA, IDVariant ANOTA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRESSIVO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIDSTAMPA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANOTA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("LANCIO_PROCEDURA_STAMPE_CONS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("LANCIOPROCEDURASTAMPECONS",s);
    }
  }

  public int DUPLICAPARAMDEFCCESE(IDVariant AESERCIZIOOLD, IDVariant AESERCIZIONEW)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIOOLD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIONEW);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("DUPLICA_PARAM_DEF_CC_ESE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("DUPLICAPARAMDEFCCESE",s);
    }
  }

  public int WORKBILCONSPIANOIND(IDVariant PESERCIZIO, IDVariant PUTENTE, IDVariant PAGGIORNA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PAGGIORNA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_BIL_CONS_PIANO_IND",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILCONSPIANOIND",s);
    }
  }

  public int GENERACERTCONS(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant AES)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_CERTCONS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERACERTCONS",s);
    }
  }

  public int WORKSERCOSMONZA(IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant ASERVIZIO, IDVariant ATIPOSTAMPA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASERVIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOSTAMPA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SERCOS_MONZA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSERCOSMONZA",s);
    }
  }

  public int WORKBILCONSCAPE(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PTITOLO, IDVariant PTIPOLOGIA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOLOGIA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_BIL_CONS_CAP_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILCONSCAPE",s);
    }
  }

  public int WORKBILCONSCAPS(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PMISSIONE, IDVariant PPROGRAMMA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PMISSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRAMMA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_BIL_CONS_CAP_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILCONSCAPS",s);
    }
  }

  public int WORKBILCONSCAPSUO(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PMISSIONE, IDVariant PPROGRAMMA, IDVariant PPROGRUNITA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PMISSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRAMMA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRUNITA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_CONS_CAP_S_UO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILCONSCAPSUO",s);
    }
  }

  public int INSVARDACE4ISS(IDVariant AESERCIZIO, IDVariant APERIODO, IDVariant ADATAREG, IDVariant ADESCRIZIONEBIL, IDVariant ADESCRIZIONEIMP, IDVariant ATIPOVARBIL, IDVariant ATIPOVARIMP)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APERIODO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADESCRIZIONEBIL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADESCRIZIONEIMP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOVARBIL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOVARIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("INS_VAR_DA_CE4ISS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INSVARDACE4ISS",s);
    }
  }

  public int CF4WEBBILESECUTIVITAVAR(IDVariant AESERCIZIO, IDVariant APROV, IDVariant AUNITAPRO, IDVariant ANUMEROPRO, IDVariant AANNOPRO, IDVariant ASEDEDEL, IDVariant ANUMERODEL, IDVariant AANNODEL, IDVariant ANUMRIGHE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROV);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUNITAPRO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMEROPRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOPRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMRIGHE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CF4WEB_BIL_ESECUTIVITA_VAR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBBILESECUTIVITAVAR",s);
    }
  }

  public int BILCONTROLLOESECVAR(IDVariant AESERCIZIO, IDVariant ASEDEDEL, IDVariant ANUMERODEL, IDVariant AANNODEL, IDVariant APROGRSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_CONTROLLO_ESEC_VAR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILCONTROLLOESECVAR",s);
    }
  }

  public int BILESECUTIVITAVARIAZIONIDEL(IDVariant AESERCIZIO, IDVariant APROV, IDVariant AANNOPROP, IDVariant ANUMEROPROP, IDVariant AUNITAPROP, IDVariant APROGR_SESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROV);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGR_SESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BIL_ESECUTIVITA_VARIAZIONI_DEL",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BILESECUTIVITAVARIAZIONIDEL",s);
    }
  }

  public int GENERATESOVBIMPS(IDVariant PESERCIZIO, IDVariant PANNODEL, IDVariant PNUMERODEL, IDVariant PSEDEDEL, IDVariant PSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("GENERA_TESO_VBI_MPS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERATESOVBIMPS",s);
    }
  }

  public int GENERAVARCOMPROESIGCRONO(IDVariant PPROGRSESSIONE, IDVariant PESERCIZIO, IDVariant PDESCRIZIONE, IDVariant PTIPOVAR, IDVariant PUNITAPROP, IDVariant PNUMEROPROP, IDVariant PANNOPROP, IDVariant PSEDEDEL, IDVariant PNUMERODEL, IDVariant PANNODEL, IDVariant PDATAREG, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_VARCOMPRO_ESIG_CRONO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAVARCOMPROESIGCRONO",s);
    }
  }

  public int CONTROLLOCASSAVARCRONO(IDVariant APROGRSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(APROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CONTROLLO_CASSA_VAR_CRONO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTROLLOCASSAVARCRONO",s);
    }
  }

  public int POLASSOCIABOZZA(IDVariant PBOZZAVARIAZIONEID, IDVariant PPROPOSTEVARID, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PBOZZAVARIAZIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROPOSTEVARID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("POL_ASSOCIA_BOZZA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POLASSOCIABOZZA",s);
    }
  }

  public int POLDISSOCIABOZZA(IDVariant PBOZZAVARIAZIONEID, IDVariant PPROPOSTEVARID, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PBOZZAVARIAZIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROPOSTEVARID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("POL_DISSOCIA_BOZZA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POLDISSOCIABOZZA",s);
    }
  }

  public int POLWORKDISPRAG(IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant AESERCIZIOSTN, IDVariant ABOZZA, IDVariant ANODISP, IDVariant ASOLOAPP, IDVariant ATIPOCONTROLLO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIOSTN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOZZA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANODISP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLOAPP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOCONTROLLO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("POL_WORK_DISP_RAG",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POLWORKDISPRAG",s);
    }
  }

  public int POLWORKELVBOZZA(IDVariant ASESSIONEID, IDVariant ABOZZAVARIAZIONEID, IDVariant AESERCIZIO, IDVariant AESERCIZIOPLUR, IDVariant AES, IDVariant ATIPO, IDVariant ATIPOVAR, IDVariant ASOLOAPPROVATE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOZZAVARIAZIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIOPLUR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOVAR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASOLOAPPROVATE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("POL_WORK_ELV_BOZZA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POLWORKELVBOZZA",s);
    }
  }

  public int POLWORKBOZZAANN(IDVariant ASESSIONEID, IDVariant ABOZZAVARIAZIONEID, IDVariant AESERCIZIO, IDVariant AESERCIZIOPLUR, IDVariant ATIPO, IDVariant ASETIPOVAR)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOZZAVARIAZIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIOPLUR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASETIPOVAR);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("POL_WORK_BOZZA_ANN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POLWORKBOZZAANN",s);
    }
  }

  public int POLAGGBILPEG(IDVariant AESERCIZIO, IDVariant ABOZZAVARIAZIONEID, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOZZAVARIAZIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("POL_AGG_BIL_PEG",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POLAGGBILPEG",s);
    }
  }

  public int POLASSOCIABOZZAVAR(IDVariant PBOZZAVARIAZIONEID, IDVariant PVARIAZIONEID, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PBOZZAVARIAZIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARIAZIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("POL_ASSOCIA_BOZZA_VAR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POLASSOCIABOZZAVAR",s);
    }
  }

  public int POLDISSOCIABOZZAVAR(IDVariant PBOZZAVARIAZIONEID, IDVariant PVARIAZIONEID, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PBOZZAVARIAZIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARIAZIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("POL_DISSOCIA_BOZZA_VAR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POLDISSOCIABOZZAVAR",s);
    }
  }

  public int POLGENERAVAR(IDVariant AESERCIZIO, IDVariant AVARIAZIONEID, IDVariant AANNOPRO, IDVariant ANUMEROPRO, IDVariant AUNITAPRO, IDVariant ADATAREG, IDVariant AUTENTE, IDVariant ANUMVAR)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AVARIAZIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOPRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROPRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUNITAPRO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMVAR);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("POL_GENERA_VAR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POLGENERAVAR",s);
    }
  }

  public int POLWORKSAVA(IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant AVARIAZIONE, IDVariant ASENOTE, IDVariant ASETIPOVAR, IDVariant ASETOTTITOLO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AVARIAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASENOTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASETIPOVAR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASETOTTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("POL_WORK_SAVA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POLWORKSAVA",s);
    }
  }

  public int POLWORKELVVARI(IDVariant ASESSIONEID, IDVariant AVARIAZIONEID, IDVariant AESERCIZIO, IDVariant AESERCIZIOPLUR, IDVariant ASEDETTAGLIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AVARIAZIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIOPLUR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEDETTAGLIO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("POL_WORK_ELV_VARI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POLWORKELVVARI",s);
    }
  }

  public int POLELIMINAVAR(IDVariant AESERCIZIO, IDVariant AVARIAZIONEID, IDVariant ANUMVAR)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AVARIAZIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMVAR);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("POL_ELIMINA_VAR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POLELIMINAVAR",s);
    }
  }

  public int POLWORKVARPEG(IDVariant APROGRSESSIONE, IDVariant AESERCIZIO, IDVariant AVARIAZIONEID)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(APROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AVARIAZIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("POL_WORK_VAR_PEG",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POLWORKVARPEG",s);
    }
  }

  public int ASSESTAMENTIPD(IDVariant OLDESERCIZIO, IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ASSESTAMENTI_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ASSESTAMENTIPD",s);
    }
  }

  public int WORKCOMPVARFPV(IDVariant PPROGRSESSIONE, IDVariant PESERCIZIO, IDVariant PANNOPROPOSTA, IDVariant PNUMEROPROPOSTA, IDVariant PUNITAPROPONENTE, IDVariant PANNODEL, IDVariant PNUMERODEL, IDVariant PSEDEDEL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROPONENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_COMP_VAR_FPV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKCOMPVARFPV",s);
    }
  }

  public int GENERAVARCOMPROESIGCONS(IDVariant PPROGRSESSIONE, IDVariant PESERCIZIO, IDVariant PDESCRIZIONE, IDVariant PTIPOVAR, IDVariant PUNITAPROP, IDVariant PNUMEROPROP, IDVariant PANNOPROP, IDVariant PDATAREG, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_VARCOMPRO_ESIG_CONS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAVARCOMPROESIGCONS",s);
    }
  }

  public int GENERAVARCOMPROESIGCORR(IDVariant PPROGRSESSIONE, IDVariant PESERCIZIO, IDVariant PDESCRIZIONE, IDVariant PTIPOVAR, IDVariant PUNITAPROP, IDVariant PNUMEROPROP, IDVariant PANNOPROP, IDVariant PDATAREG, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_VARCOMPRO_ESIG_CORR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAVARCOMPROESIGCORR",s);
    }
  }

  public int GENERAVARCOMPROESIGANTIC(IDVariant PPROGRSESSIONE, IDVariant PESERCIZIO, IDVariant PDESCRIZIONE, IDVariant PTIPOVAR, IDVariant PUNITAPROP, IDVariant PNUMEROPROP, IDVariant PANNOPROP, IDVariant PDATAREG, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_VARCOMPRO_ESIG_ANTIC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAVARCOMPROESIGANTIC",s);
    }
  }

  public int ELIMINAVARESIG(IDVariant APROGRESSIVOVARIMPACC, IDVariant ATIPOVAR, IDVariant APARTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(APROGRESSIVOVARIMPACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOVAR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APARTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("ELIMINA_VAR_ESIG",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ELIMINAVARESIG",s);
    }
  }

  public int GENERAVPROESIGRITARENT(IDVariant PPROGRSESSIONE, IDVariant PESERCIZIO, IDVariant PDESCRIZIONE, IDVariant PTIPOVAR, IDVariant PUNITAPROP, IDVariant PNUMEROPROP, IDVariant PANNOPROP, IDVariant PDATAREG, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_VPRO_ESIG_RITAR_ENT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAVPROESIGRITARENT",s);
    }
  }

  public int GENERAVPROESIGANTICENT(IDVariant PPROGRSESSIONE, IDVariant PESERCIZIO, IDVariant PDESCRIZIONE, IDVariant PTIPOVAR, IDVariant PUNITAPROP, IDVariant PNUMEROPROP, IDVariant PANNOPROP, IDVariant PDATAREG, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_VPRO_ESIG_ANTIC_ENT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAVPROESIGANTICENT",s);
    }
  }

  public int AGGIORNATIPOAVANZOMOV(IDVariant PESERCIZIO, IDVariant PES)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PES);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("AGGIORNA_TIPO_AVANZO_MOV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("AGGIORNATIPOAVANZOMOV",s);
    }
  }

  public int CARICAGESTIONEAVANZO(IDVariant PESERCIZIO, IDVariant PSESSIONE, IDVariant PES)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PES);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CARICA_GESTIONE_AVANZO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAGESTIONEAVANZO",s);
    }
  }

  public int CALCOLAAVANZOESERCIZIO(IDVariant PESERCIZIO, IDVariant PSESSIONE, IDVariant PIDAVANZOFINALEPREC, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIDAVANZOFINALEPREC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CALCOLA_AVANZO_ESERCIZIO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CALCOLAAVANZOESERCIZIO",s);
    }
  }

  public int CF4WEBSITBILCLASSIF(IDVariant AESERCIZIO, IDVariant ASESSIONE, IDVariant AES, IDVariant ADATAELAB, IDVariant AFILTRO1, IDVariant AFILTRO2, IDVariant ATIPO, IDVariant AFASE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AFILTRO1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFILTRO2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AFASE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CF4WEB_SIT_BIL_CLASSIF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBSITBILCLASSIF",s);
    }
  }

  public int CF4WEBSITBILCLASSIFRES(IDVariant AESERCIZIO, IDVariant ASESSIONE, IDVariant AES, IDVariant ADATAELAB, IDVariant AFILTRO1, IDVariant AFILTRO2, IDVariant ATIPO, IDVariant AFASE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AFILTRO1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFILTRO2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AFASE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CF4WEB_SIT_BIL_CLASSIF_RES",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBSITBILCLASSIFRES",s);
    }
  }

  public int WORKSITCAPFONTFINUO(IDVariant PSESSIONE, IDVariant PESERCIZIO, IDVariant PSTANZ, IDVariant PDATAELAB, IDVariant PTIPOBIL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSTANZ);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PTIPOBIL);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SITCAP_FONTFIN_UO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCAPFONTFINUO",s);
    }
  }

  public int WORKSITCLASMISPROGTIT(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PMISSIONE, IDVariant PPROGRAMMA, IDVariant PTITOLO, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PMISSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRAMMA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_MIS_PROG_TIT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASMISPROGTIT",s);
    }
  }

  public int WORKSITCLASMISPROGMACRO(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PMISSIONE, IDVariant PPROGRAMMA, IDVariant PTITOLO, IDVariant PMACRO, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PMISSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRAMMA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PMACRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_MIS_PROG_MACRO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASMISPROGMACRO",s);
    }
  }

  public int WORKSITCLASTITTIPOLOGIA(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PTITOLO, IDVariant PTIPOLOGIA, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOLOGIA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_TIT_TIPOLOGIA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASTITTIPOLOGIA",s);
    }
  }

  public int WORKSITCLASMACRO2S(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PTITOLO, IDVariant PCODICEMACRO, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCODICEMACRO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_MACRO_2_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASMACRO2S",s);
    }
  }

  public int WORKSITCLASMACRO4E(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PTITOLO, IDVariant PCODICEMACRO, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCODICEMACRO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_MACRO_4_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASMACRO4E",s);
    }
  }

  public int WORKSITCLASMACRO4S(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PTITOLO, IDVariant PCODICEMACRO, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCODICEMACRO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_MACRO_4_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASMACRO4S",s);
    }
  }

  public int WORKSITCLASMACRO5E(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PTITOLO, IDVariant PCODICEMACRO, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCODICEMACRO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_MACRO_5_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASMACRO5E",s);
    }
  }

  public int WORKSITCLASMACRO5S(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PTITOLO, IDVariant PCODICEMACRO, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCODICEMACRO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_MACRO_5_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASMACRO5S",s);
    }
  }

  public int WORKSITCLASCOFOG(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PDIVISIONE, IDVariant PGRUPPO, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDIVISIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PGRUPPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_COFOG",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASCOFOG",s);
    }
  }

  public int WORKSITCLASFLESSE(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PFLESSIBILITA, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PFLESSIBILITA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_FLESS_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASFLESSE",s);
    }
  }

  public int WORKSITCLASFLESSS(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PFLESSIBILITA, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PFLESSIBILITA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_FLESS_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASFLESSS",s);
    }
  }

  public int WORKSITCLASVINCE(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PVINCOLO, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE, IDVariant PTOTTITOLO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PVINCOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTOTTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_VINC_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASVINCE",s);
    }
  }

  public int WORKSITCLASVINCS(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PVINCOLO, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE, IDVariant PTOTTITOLO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PVINCOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTOTTITOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_VINC_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASVINCS",s);
    }
  }

  public int WORKSITCLASUOSUPE(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PPROGRUO, IDVariant P_UO_SUP, IDVariant PTIPOUO, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE, IDVariant P_UO_SUP2)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRUO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_UO_SUP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_UO_SUP2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_UO_SUP_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASUOSUPE",s);
    }
  }

  public int WORKSITCLASUOSUPS(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PPROGRUO, IDVariant P_UO_SUP, IDVariant PTIPOUO, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE, IDVariant P_UO_SUP2)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRUO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_UO_SUP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_UO_SUP2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_UO_SUP_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASUOSUPS",s);
    }
  }

  public int WORKSITCLASUOGUE(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PPROGRUO, IDVariant PTIPOUO, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRUO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_UO_GU_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASUOGUE",s);
    }
  }

  public int WORKSITCLASUOGUS(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATAELAB, IDVariant PSOLOCOMPETENZA, IDVariant PPROGRUO, IDVariant PTIPOUO, IDVariant PDESCABBREVIATA, IDVariant PSTCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSOLOCOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRUO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCABBREVIATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_SIT_CLAS_UO_GU_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITCLASUOGUS",s);
    }
  }

  public int WORKSITSTNCASSA(IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant AES, IDVariant APROGRUNITAORG, IDVariant ATITOLO, IDVariant ADATAREG)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRUNITAORG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_SIT_STN_CASSA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSITSTNCASSA",s);
    }
  }

  public int GENERAQUADROXML(IDVariant AESERCIZIO, IDVariant ASESSIONE, IDVariant AQUADRO, IDVariant AATTRIBUTO, IDVariant ATIPOCERT, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AQUADRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AATTRIBUTO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOCERT);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_QUADRO_XML",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAQUADROXML",s);
    }
  }

  public int CERTPREVLANCIOPROCEDURAQUADRO(IDVariant PESERCIZIO, IDVariant PSESSIONE, IDVariant PSESSIONESTAMPA, IDVariant PQUADRO, IDVariant PATTRIBUTO, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONESTAMPA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PQUADRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PATTRIBUTO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CERT_PREV.LANCIO_PROCEDURA_QUADRO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CERTPREVLANCIOPROCEDURAQUADRO",s);
    }
  }

  public int GENERAXMLCERTPREV(IDVariant AESERCIZIO, IDVariant ASESSIONE, IDVariant AACCANTONATA, IDVariant AVINCOLATA, IDVariant AUTILIZZO, IDVariant ATIPO, IDVariant APROGRESSIVO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AACCANTONATA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AVINCOLATA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTILIZZO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRESSIVO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("GENERA_XML_CERT_PREV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAXMLCERTPREV",s);
    }
  }

  public int GENERAXMLCERTCON(IDVariant AESERCIZIO, IDVariant ASESSIONE, IDVariant AACCANTONATA, IDVariant AVINCOLATA, IDVariant APROGRESSIVO, IDVariant ATIPO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AACCANTONATA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AVINCOLATA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRESSIVO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_XML_CERT_CON",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAXMLCERTCON",s);
    }
  }

  public int CALCOLATOTCERTXML(IDVariant AESERCIZIO, IDVariant ATIPOCERT)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOCERT);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CALCOLA_TOT_CERT_XML",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CALCOLATOTCERTXML",s);
    }
  }

  public int BDAPLANCIOPROCEDURA(IDVariant AESERCIZIO, IDVariant AUTENTE, IDVariant ASESSIONE, IDVariant APROGRESSIVOBDAP, IDVariant APROGRESSIVO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRESSIVOBDAP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRESSIVO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BDAP.LANCIO_PROCEDURA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BDAPLANCIOPROCEDURA",s);
    }
  }

  public int BDAPRENDLANCIOPROCEDURASCHEMA(IDVariant AESERCIZIO, IDVariant AUTENTE, IDVariant ATIPOBDAP, IDVariant ASCHEMABILANCIO, IDVariant ASESSIONE, IDVariant ASESSIONESTAMPA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOBDAP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASCHEMABILANCIO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONESTAMPA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BDAP_REND.LANCIO_PROCEDURA_SCHEMA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BDAPRENDLANCIOPROCEDURASCHEMA",s);
    }
  }

  public int BDAPPREVLANCIOPROCEDURASCHEMA(IDVariant AESERCIZIO, IDVariant AUTENTE, IDVariant ATIPOBDAP, IDVariant ASCHEMABILANCIO, IDVariant ASESSIONE, IDVariant ASESSIONESTAMPA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOBDAP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASCHEMABILANCIO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONESTAMPA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BDAP_PREV.LANCIO_PROCEDURA_SCHEMA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BDAPPREVLANCIOPROCEDURASCHEMA",s);
    }
  }

  public int BDAPRENDDATICONTABILICONS(IDVariant ATIPOBDAP, IDVariant AESERCIZIO, IDVariant AUTENTE, IDVariant ASESSIONE, IDVariant APROGRESSIVO, IDVariant ASOLOXBRL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ATIPOBDAP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRESSIVO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASOLOXBRL);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BDAP_REND.DATI_CONTABILI_CONS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BDAPRENDDATICONTABILICONS",s);
    }
  }

  public int BDAPPREVDATICONTABILIPREV(IDVariant ATIPOBDAP, IDVariant AESERCIZIO, IDVariant AUTENTE, IDVariant ASESSIONE, IDVariant APROGRESSIVO, IDVariant ASOLOXBRL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ATIPOBDAP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRESSIVO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASOLOXBRL);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BDAP_PREV.DATI_CONTABILI_PREV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BDAPPREVDATICONTABILIPREV",s);
    }
  }

  public int BDAPRENDCONTROLLIQUADRATURA(IDVariant AESERCIZIO, IDVariant ASESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("BDAP_REND.CONTROLLI_QUADRATURA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BDAPRENDCONTROLLIQUADRATURA",s);
    }
  }

  public int BDAPRENDBILANCIOCONS(IDVariant ATIPOBDAP, IDVariant AESERCIZIO, IDVariant AUTENTE, IDVariant ASESSIONE, IDVariant APROGRESSIVO, IDVariant ASOLOXBRL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ATIPOBDAP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRESSIVO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASOLOXBRL);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BDAP_REND.BILANCIO_CONS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BDAPRENDBILANCIOCONS",s);
    }
  }

  public int BDAPPREVBILANCIOPREV(IDVariant ATIPOBDAP, IDVariant AESERCIZIO, IDVariant AUTENTE, IDVariant ASESSIONE, IDVariant APROGRESSIVO, IDVariant ASOLOXBRL)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ATIPOBDAP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRESSIVO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASOLOXBRL);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BDAP_PREV.BILANCIO_PREV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BDAPPREVBILANCIOPREV",s);
    }
  }

  public int BDAPRENDCALCOLA_TOT_SCHEMI(IDVariant AESERCIZIO, IDVariant ATIPOBDAP, IDVariant ASCHEMABILANCIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOBDAP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASCHEMABILANCIO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BDAP_REND.CALCOLA_TOT_SCHEMI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BDAPRENDCALCOLA_TOT_SCHEMI",s);
    }
  }

  public int BDAPREVCALCOLA_TOT_SCHEMI(IDVariant AESERCIZIO, IDVariant ATIPOBDAP, IDVariant ASCHEMABILANCIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOBDAP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASCHEMABILANCIO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("BDAP_PREV.CALCOLA_TOT_SCHEMI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("BDAPREVCALCOLA_TOT_SCHEMI",s);
    }
  }

  public int IMPPD(IDVariant OLDANNOIMP, IDVariant OLDNUMEROIMP)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDNUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("IMP_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("IMPPD",s);
    }
  }

  public int IMPUODI(IDVariant AESERCIZIO, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AANNOIMP, IDVariant ANUMEROIMP, IDVariant ACONSSVILUPPO, IDVariant APROGRUNITAORGANIZZATIVA, IDVariant OLDIMPORTO, IDVariant NEWIMPORTO, IDVariant AANNOINTROD)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACONSSVILUPPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRUNITAORGANIZZATIVA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOINTROD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("IMP_UO_DI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("IMPUODI",s);
    }
  }

  public int IMPDI(IDVariant AESERCIZIO, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AANNOIMP, IDVariant ANUMEROIMP, IDVariant ACONSSVILUPPO, IDVariant ASETTORE, IDVariant ASERVIZIO, IDVariant ATIPOLOGIASPESA, IDVariant NEWSEDEDEL, IDVariant NEWNUMEROPROPOSTA, IDVariant NEWIMPEGNOOBBLIG, IDVariant OLDIMPORTO, IDVariant NEWIMPORTO, IDVariant NEWANNODEL, IDVariant NEWNUMERODEL, IDVariant NEWANNOPROPOSTA, IDVariant NEWUNITAPROPONENTE, IDVariant NEWPRENOTAZIONE, IDVariant NEWESERCIZIOSCADENZA, IDVariant AANNOINTROD, IDVariant NEWCODIMPECO, IDVariant AVOCEECON, IDVariant ACODICEGESTIONALE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACONSSVILUPPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASETTORE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASERVIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOLOGIASPESA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(NEWNUMEROPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWIMPEGNOOBBLIG);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(OLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWANNOPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWUNITAPROPONENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(NEWPRENOTAZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(NEWESERCIZIOSCADENZA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOINTROD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWCODIMPECO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AVOCEECON);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACODICEGESTIONALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("IMP_DI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("IMPDI",s);
    }
  }

  public int IMPDIRES(IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AANNOIMP, IDVariant OLDIMPORTO, IDVariant NEWIMPORTO, IDVariant AANNOINTROD)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOINTROD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("IMP_DI_RES",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("IMPDIRES",s);
    }
  }

  public int CONTROLLODISPIMPPROV(IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AANNOIMP, IDVariant OLDIMPORTO, IDVariant NEWIMPORTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CONTROLLO_DISP_IMP_PROV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTROLLODISPIMPPROV",s);
    }
  }

  public int POLCONTROLLODISPPROGOB(IDVariant AESERCIZIO, IDVariant AVOCEPEGID, IDVariant APROGETTOID, IDVariant ASCHEDAOBIETTIVOID, IDVariant AES, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AOLDIMPORTO1, IDVariant ANEWIMPORTO1, IDVariant AOLDIMPORTO2, IDVariant ANEWIMPORTO2, IDVariant AOLDIMPORTO3, IDVariant ANEWIMPORTO3, IDVariant AOLDIMPEGNABILE, IDVariant ANEWIMPEGNABILE, IDVariant AOLDIMPORTOCONS1, IDVariant ANEWIMPORTOCONS1, IDVariant AOLDIMPORTOCONS2, IDVariant ANEWIMPORTOCONS2, IDVariant AOLDIMPORTOCONS3, IDVariant ANEWIMPORTOCONS3, IDVariant AOLDIMPORTOSVIL1, IDVariant ANEWIMPORTOSVIL1, IDVariant AOLDIMPORTOSVIL2, IDVariant ANEWIMPORTOSVIL2, IDVariant AOLDIMPORTOSVIL3, IDVariant ANEWIMPORTOSVIL3, IDVariant AOLDCONSSVILUPPO1, IDVariant ANEWCONSSVILUPPO1, IDVariant AOLDCONSSVILUPPO2, IDVariant ANEWCONSSVILUPPO2, IDVariant AOLDCONSSVILUPPO3, IDVariant ANEWCONSSVILUPPO3, IDVariant AOLDFATTORE, IDVariant ANEWFATTORE, IDVariant AOLDCENTRO, IDVariant ANEWCENTRO, IDVariant ATIPOMOVIMENTO, IDVariant APROVENIENZA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AVOCEPEGID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGETTOID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASCHEDAOBIETTIVOID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDIMPORTO1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWIMPORTO1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDIMPORTO2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWIMPORTO2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDIMPORTO3);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWIMPORTO3);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDIMPEGNABILE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWIMPEGNABILE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDIMPORTOCONS1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWIMPORTOCONS1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDIMPORTOCONS2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWIMPORTOCONS2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDIMPORTOCONS3);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWIMPORTOCONS3);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDIMPORTOSVIL1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWIMPORTOSVIL1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDIMPORTOSVIL2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWIMPORTOSVIL2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDIMPORTOSVIL3);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWIMPORTOSVIL3);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDCONSSVILUPPO1);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANEWCONSSVILUPPO1);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AOLDCONSSVILUPPO2);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANEWCONSSVILUPPO2);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AOLDCONSSVILUPPO3);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANEWCONSSVILUPPO3);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AOLDFATTORE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANEWFATTORE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AOLDCENTRO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANEWCENTRO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOMOVIMENTO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROVENIENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("POL_CONTROLLO_DISP_PROG_OB",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("POLCONTROLLODISPPROGOB",s);
    }
  }

  public int CONTROLLOIMPPURODI(IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AANNOIMP, IDVariant ANUMEROIMP, IDVariant OLDIMPORTO, IDVariant NEWIMPORTO, IDVariant AESITO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESITO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("CONTROLLO_IMP_PURO_DI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTROLLOIMPPURODI",s);
    }
  }

  public int CONTROLLODISPCOMPFIN(IDVariant AESERCIZIO, IDVariant AFINANZIAMENTO, IDVariant AOLDIMPORTO, IDVariant ANEWIMPORTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFINANZIAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CONTROLLO_DISP_COMP_FIN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTROLLODISPCOMPFIN",s);
    }
  }

  public int CONTROLLODISPCOMPOPE(IDVariant AESERCIZIO, IDVariant AFINANZIAMENTO, IDVariant AOPERA, IDVariant AOLDIMPORTO, IDVariant ANEWIMPORTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFINANZIAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOPERA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CONTROLLO_DISP_COMP_OPE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTROLLODISPCOMPOPE",s);
    }
  }

  public int IMPFINDI(IDVariant AESERCIZIO, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AANNOIMP, IDVariant ANUMEROIMP, IDVariant AFINANZIAMENTO, IDVariant AOPERA, IDVariant OLDIMPORTO, IDVariant NEWIMPORTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFINANZIAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOPERA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("IMP_FIN_DI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("IMPFINDI",s);
    }
  }

  public int GENERAFINIMPEGNO(IDVariant AESERCIZIO, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AOPERA, IDVariant AANNOIMP, IDVariant ANUMEROIMP, IDVariant AIMPORTO, IDVariant AMESSAGGIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOPERA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AMESSAGGIO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_FIN_IMPEGNO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAFINIMPEGNO",s);
    }
  }

  public int SUBIMPPD(IDVariant OLDANNOSUBIMP, IDVariant OLDNUMEROSUBIMP)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDANNOSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDNUMEROSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("SUBIMP_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("SUBIMPPD",s);
    }
  }

  public int SUBIMPDI(IDVariant AESERCIZIO, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AANNOIMP, IDVariant ANUMEROIMP, IDVariant AANNOSUBIMP, IDVariant ANUMEROSUBIMP, IDVariant NEWSEDEDEL, IDVariant NEWNUMEROPROPOSTA, IDVariant NEWSUBIMPOBBLIG, IDVariant OLDIMPORTO, IDVariant NEWIMPORTO, IDVariant NEWCODIMPECO, IDVariant AVOCEECON, IDVariant ACODICEGESTIONALE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(NEWNUMEROPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWSUBIMPOBBLIG);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(OLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWCODIMPECO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AVOCEECON);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACODICEGESTIONALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("SUBIMP_DI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("SUBIMPDI",s);
    }
  }

  public int CF4WEBGENERAZIONEIMPEGNI(IDVariant ANUMIMPEGNI)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ANUMIMPEGNI);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CF4WEB_GENERAZIONE_IMPEGNI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBGENERAZIONEIMPEGNI",s);
    }
  }

  public int GENERAIMPDAESIGIBILITAVIMP(IDVariant PPROGRSESSIONE, IDVariant PESERCIZIO, IDVariant PDELIBERA, IDVariant PUTENTE, IDVariant PNUMIMPG, IDVariant PNUMSUBIMPG, IDVariant PNUMVARIMPG, IDVariant PNUMVARSUBG, IDVariant PANOMALIE, IDVariant P_VARIMP_VARCOM)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDELIBERA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMIMPG);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNUMSUBIMPG);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNUMVARIMPG);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNUMVARSUBG);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PANOMALIE);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(P_VARIMP_VARCOM);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_IMP_DA_ESIGIBILITA_VIMP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAIMPDAESIGIBILITAVIMP",s);
    }
  }

  public int GENERAIMPDACRONOVIMP(IDVariant PPROGRSESSIONE, IDVariant PESERCIZIO, IDVariant PDELIBERA, IDVariant PUTENTE, IDVariant PNUMIMPG, IDVariant PNUMVARIMPG)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDELIBERA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMIMPG);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNUMVARIMPG);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("GENERA_IMP_DA_CRONO_VIMP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAIMPDACRONOVIMP",s);
    }
  }

  public int GENERAVARIMPCRONO(IDVariant PPROGRSESSIONE, IDVariant PESERCIZIO, IDVariant PUNITAPROP, IDVariant PNUMEROPROP, IDVariant PANNOPROP, IDVariant PSEDEDEL, IDVariant PNUMERODEL, IDVariant PANNODEL, IDVariant PDATAREG, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_VARIMP_CRONO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAVARIMPCRONO",s);
    }
  }

  public int RETTIFICAOPERAIMPWEB(IDVariant PSESSIONE, IDVariant PESERCIZIO, IDVariant PANNOIMP, IDVariant PNUMEROIMP, IDVariant POPERA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(POPERA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("RETTIFICA_OPERA_IMP_WEB",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RETTIFICAOPERAIMPWEB",s);
    }
  }

  public int RETTIFICAPEGIMP(IDVariant PNUMEROIMP, IDVariant PESERCIZIO, IDVariant PCAPITOLO, IDVariant PARTICOLO, IDVariant PFINANZIAMENTO, IDVariant POPERA, IDVariant PPROGETTOID, IDVariant PCGU, IDVariant PCODLIVELLO5, IDVariant PSESSIONE, IDVariant PANNOIMPPREC, IDVariant PNUMEROIMPPREC, IDVariant PERRORE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PNUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PFINANZIAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(POPERA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGETTOID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCGU);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCODLIVELLO5);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANNOIMPPREC);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(PNUMEROIMPPREC);
    OutPar.add(new Integer(IDVariant.INTEGER));
    SPPar.add(PERRORE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("RETTIFICA_PEG_IMP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RETTIFICAPEGIMP",s);
    }
  }

  public int IMPAUTODISPONIBILITA(IDVariant ANESERCIZIO, IDVariant ACAP, IDVariant AART, IDVariant ANNUMERODEL, IDVariant ANANNODEL, IDVariant ASSEDEDEL, IDVariant ANNUMEROPROP, IDVariant ANANNOPROP, IDVariant ASUNITAPROP, IDVariant ASDESCRIZIONE, IDVariant ADDATAREG, IDVariant AIMPOBBLIG, IDVariant ANUMIMPDA, IDVariant ANUMIMPA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ANESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AART);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASDESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADDATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AIMPOBBLIG);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMIMPDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ANUMIMPA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("IMP_AUTO_DISPONIBILITA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("IMPAUTODISPONIBILITA",s);
    }
  }

  public int WORKSTORIAIMP(IDVariant PESERCIZIO, IDVariant PNUMEROIMP, IDVariant PANNOIMP, IDVariant PTIPOSTAMPA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOSTAMPA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_STORIA_IMP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSTORIAIMP",s);
    }
  }

  public int WORKSTORIASUBIMP(IDVariant PESERCIZIO, IDVariant PNUMEROSUBIMP, IDVariant PANNOSUBIMP, IDVariant PTIPOSTAMPA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOSTAMPA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_STORIA_SUBIMP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSTORIASUBIMP",s);
    }
  }

  public int ACCOPEDI(IDVariant AESERCIZIO, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant OLDIMPORTO, IDVariant NEWIMPORTO, IDVariant AFINANZIAMENTO, IDVariant AOPERA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFINANZIAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOPERA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ACC_OPE_DI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ACCOPEDI",s);
    }
  }

  public int ACCFINDI(IDVariant AESERCIZIO, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AFINANZIAMENTO, IDVariant OLDIMPORTO, IDVariant NEWIMPORTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFINANZIAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ACC_FIN_DI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ACCFINDI",s);
    }
  }

  public int CONTROLLOACCPURODI(IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AANNOACC, IDVariant OLDIMPORTO, IDVariant NEWIMPORTO, IDVariant AESITO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESITO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("CONTROLLO_ACC_PURO_DI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTROLLOACCPURODI",s);
    }
  }

  public int ACCPD(IDVariant OLDANNOACC, IDVariant OLDNUMEROACC)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDANNOACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDNUMEROACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ACC_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ACCPD",s);
    }
  }

  public int RETTIFICAFINACCWEB(IDVariant PSESSIONE, IDVariant PESERCIZIO, IDVariant PANNOACC, IDVariant PNUMEROACC, IDVariant PFINANZIAMENTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PFINANZIAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("RETTIFICA_FIN_ACC_WEB",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RETTIFICAFINACCWEB",s);
    }
  }

  public int RETTIFICAPEGACC(IDVariant PNUMEROACC, IDVariant PNESERCIZIO, IDVariant PNCAPITOLO, IDVariant PNARTICOLO, IDVariant PNFINANZIAMENTO, IDVariant PNOPERA, IDVariant PNPROGETTOID, IDVariant PNCGE, IDVariant PNCODLIVELLO5, IDVariant PSESSIONE, IDVariant PANNOACCPREC, IDVariant PNUMEROACCPREC, IDVariant PERRORE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PNUMEROACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNCAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNFINANZIAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNOPERA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNPROGETTOID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNCGE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNCODLIVELLO5);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANNOACCPREC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROACCPREC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PERRORE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("RETTIFICA_PEG_ACC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RETTIFICAPEGACC",s);
    }
  }

  public int GENERAACCDAESIGIBILITAVACC(IDVariant PPROGRSESSIONE, IDVariant PESERCIZIO, IDVariant PDELIBERA, IDVariant PUTENTE, IDVariant PNUMACCG, IDVariant PNUMVARACCG, IDVariant PANOMALIE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDELIBERA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMACCG);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNUMVARACCG);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PANOMALIE);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_ACC_DA_ESIGIBILITA_VACC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAACCDAESIGIBILITAVACC",s);
    }
  }

  public int PROPOSTEVARIMPDASUB(IDVariant PESERCIZIO, IDVariant PES, IDVariant PPERIODO, IDVariant PNUMEROIMP, IDVariant PANNOIMP, IDVariant PCANCELLA, IDVariant PVARIMPCREATE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPERIODO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCANCELLA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PVARIMPCREATE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("PROPOSTE_VARIMP_DA_SUB",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PROPOSTEVARIMPDASUB",s);
    }
  }

  public int GENERAVARIMPVARACCRIACC(IDVariant PESERCIZIO, IDVariant PES, IDVariant PPERIODO, IDVariant PPROGRUO, IDVariant PDESCRIZIONE, IDVariant PDESCRDANOTE, IDVariant PSEDEDEL, IDVariant PNUMERODEL, IDVariant PANNODEL, IDVariant PUNITAPROP, IDVariant PNUMEROPROP, IDVariant PANNOPROP, IDVariant PDATAVAR, IDVariant PUTENTE, IDVariant PVARINSERITE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPERIODO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRUO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCRDANOTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATAVAR);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PVARINSERITE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("GENERA_VARIMP_VARACC_RIACC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAVARIMPVARACCRIACC",s);
    }
  }

  public int ELIMINAVARIMPACCRIACC(IDVariant PESERCIZIO, IDVariant PES, IDVariant PPERIODO, IDVariant PPROGRUO, IDVariant PIMPACCELIMINATI, IDVariant PSUBIMPELIMINATI)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPERIODO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRUO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPACCELIMINATI);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PSUBIMPELIMINATI);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ELIMINA_VARIMPACC_RIACC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ELIMINAVARIMPACCRIACC",s);
    }
  }

  public int CHIUSURADETTAGLIOORDINE(IDVariant AESERCIZIO, IDVariant AANNOBUONO, IDVariant ANUMBUONO, IDVariant ADETTBUONO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOBUONO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMBUONO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADETTBUONO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CHIUSURA_DETTAGLIO_ORDINE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CHIUSURADETTAGLIOORDINE",s);
    }
  }

  public int CHIUSURADETTAGLIOORDINECF4(IDVariant AESERCIZIO, IDVariant AANNOBUONO, IDVariant ANUMBUONO, IDVariant ADETTBUONO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOBUONO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMBUONO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADETTBUONO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CHIUSURA_DETTAGLIO_ORDINE_CF4",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CHIUSURADETTAGLIOORDINECF4",s);
    }
  }

  public int ELIMINALIQE00(IDVariant PNUMDIST, IDVariant PANNODIST, IDVariant PANNOIMP, IDVariant PNUMEROIMP, IDVariant PANNOSUBIMP, IDVariant PNUMEROSUBIMP, IDVariant PANNOLIQ, IDVariant PNUMEROLIQ, IDVariant PFATANNOPROG, IDVariant PFATNUMEROPROG, IDVariant PIMPORTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PNUMDIST);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODIST);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PFATANNOPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PFATNUMEROPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ELIMINA_LIQ_E00",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ELIMINALIQE00",s);
    }
  }

  public int ELIMINALIQGC4(IDVariant PNUMDIST, IDVariant PANNODIST, IDVariant PANNOIMP, IDVariant PNUMEROIMP, IDVariant PANNOSUBIMP, IDVariant PNUMEROSUBIMP, IDVariant PANNOLIQ, IDVariant PNUMEROLIQ, IDVariant PIMPORTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PNUMDIST);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODIST);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ELIMINA_LIQ_GC4",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ELIMINALIQGC4",s);
    }
  }

  public int ELIMINALIQBUONIDISP(IDVariant ANUMERODISTINTA, IDVariant AANNODISTINTA, IDVariant AANNOIMP, IDVariant ANUMEROIMP, IDVariant AANNOSUBIMP, IDVariant ANUMEROSUBIMP, IDVariant AANNOLIQ, IDVariant ANUMEROLIQ, IDVariant AFATANNOPROG, IDVariant AFATNUMEROPROG, IDVariant AIMPORTO, IDVariant ADETTDIST, IDVariant ARIAPRIDIST)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ANUMERODISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNODISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFATANNOPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFATNUMEROPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADETTDIST);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARIAPRIDIST);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("ELIMINA_LIQ_BUONI_DISP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ELIMINALIQBUONIDISP",s);
    }
  }

  public int ELIMINALIQDIST(IDVariant ANUMERODISTINTA, IDVariant AANNODISTINTA, IDVariant AANNOIMP, IDVariant ANUMEROIMP, IDVariant AANNOSUBIMP, IDVariant ANUMEROSUBIMP, IDVariant AANNOLIQ, IDVariant ANUMEROLIQ, IDVariant AFATANNOPROG, IDVariant AFATNUMEROPROG, IDVariant AIMPORTO, IDVariant ADETTDIST, IDVariant ARIAPRIDIST)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ANUMERODISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNODISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFATANNOPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFATNUMEROPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADETTDIST);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARIAPRIDIST);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("ELIMINA_LIQ_DIST",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ELIMINALIQDIST",s);
    }
  }

  public int CF4WEBCALCOLARIT(IDVariant AANNOPROG, IDVariant ANUMEROPROG, IDVariant AIMPORTOLIQ, IDVariant AIMPONIBILE, IDVariant AIMPORTONONSOG, IDVariant ARITENUTEIRPEF, IDVariant AIMPONIBILESSN, IDVariant ARITENUTESSNCE, IDVariant AIMPONIBILEINPS, IDVariant ARITENUTEINPS, IDVariant ARITENUTEINPSCE, IDVariant ARITENUTEADD, IDVariant ARITENUTEADDCOM, IDVariant AIMPONIBILEINAIL, IDVariant ARITENUTEINAIL, IDVariant ARITENUTEINAILCE, IDVariant ARITENUTECASSEPROF, IDVariant ARITENUTE, IDVariant ACASSA, IDVariant ACODICEINAIL, IDVariant ACODICESSN, IDVariant ACAUSALEIRPEF, IDVariant ACODICE, IDVariant AALIQUOTAINPS, IDVariant AALIQUOTAINAIL, IDVariant AALIQUOTASSNCE, IDVariant AALIQUOTA, IDVariant AALIQUOTAADD, IDVariant AALIQUOTAADDCOM)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROPROG);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIMPORTOLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIMPONIBILE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AIMPORTONONSOG);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ARITENUTEIRPEF);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AIMPONIBILESSN);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ARITENUTESSNCE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AIMPONIBILEINPS);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ARITENUTEINPS);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ARITENUTEINPSCE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ARITENUTEADD);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ARITENUTEADDCOM);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AIMPONIBILEINAIL);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ARITENUTEINAIL);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ARITENUTEINAILCE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ARITENUTECASSEPROF);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ARITENUTE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ACASSA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ACODICEINAIL);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ACODICESSN);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ACAUSALEIRPEF);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ACODICE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AALIQUOTAINPS);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AALIQUOTAINAIL);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AALIQUOTASSNCE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AALIQUOTA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AALIQUOTAADD);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AALIQUOTAADDCOM);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CF4WEB_CALCOLA_RIT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBCALCOLARIT",s);
    }
  }

  public int CONTROLLODISPCASSAVPRO(IDVariant PESERCIZIO, IDVariant PCAPITOLO, IDVariant PARTICOLO, IDVariant PTIPO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CONTROLLO_DISP_CASSA_VPRO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTROLLODISPCASSAVPRO",s);
    }
  }

  public int CONTROLLODISPMANORDFIN(IDVariant AESERCIZIO, IDVariant AFINANZIAMENTO, IDVariant AOLDIMPORTO, IDVariant ANEWIMPORTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFINANZIAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CONTROLLO_DISP_MANORD_FIN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTROLLODISPMANORDFIN",s);
    }
  }

  public int CONTROLLODISPMANORDOPE(IDVariant AESERCIZIO, IDVariant AOPERA, IDVariant AOLDIMPORTO, IDVariant ANEWIMPORTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOPERA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AOLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CONTROLLO_DISP_MANORD_OPE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTROLLODISPMANORDOPE",s);
    }
  }

  public int CONTROLLODISPCASSAFIN(IDVariant AESERCIZIO, IDVariant AFINANZIAMENTO, IDVariant OLDIMPORTO, IDVariant NEWIMPORTO, IDVariant NERRORMSG)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFINANZIAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(OLDIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NEWIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NERRORMSG);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CONTROLLO_DISP_CASSA_FIN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTROLLODISPCASSAFIN",s);
    }
  }

  public int WORKGRLCONTROLLOPURO(IDVariant PGRUPPO, IDVariant PPROGRSESSIONE, IDVariant PESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PGRUPPO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_GRL_CONTROLLO_PURO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKGRLCONTROLLOPURO",s);
    }
  }

  public int ELIMINAGRLGRO(IDVariant AES, IDVariant AGRUPPO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AGRUPPO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ELIMINA_GRL_GRO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ELIMINAGRLGRO",s);
    }
  }

  public int GRLEMISSIONEAUTO(IDVariant AESERCIZIO, IDVariant AGRUPPO, IDVariant ADATA, IDVariant ACAUSALE, IDVariant AUFFICIO, IDVariant ABOLLO, IDVariant ARIFDET, IDVariant ADESCR, IDVariant AEMISS, IDVariant ASEDEDEL, IDVariant ANUMDEL, IDVariant AANNODEL, IDVariant AIMPDA, IDVariant AIMPA, IDVariant ASUBDA, IDVariant ASUBA, IDVariant ALIQDA, IDVariant ALIQA, IDVariant ACBXDEL, IDVariant ACBXDESC, IDVariant PANTICIPAZIONE, IDVariant AALLEGATI, IDVariant PINFOTESORIERE, IDVariant PSTATOSIOPE, IDVariant ASUPDISPPURO, IDVariant ASCADENZAMAND, IDVariant ASPESE, IDVariant ACOMMISSIONI, IDVariant PSTATOCENTRICOMODO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AGRUPPO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ARIFDET);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADESCR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AEMISS);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMDEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIMPDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AIMPA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASUBDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASUBA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ALIQDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ALIQA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ACBXDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACBXDESC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANTICIPAZIONE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASUPDISPPURO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASCADENZAMAND);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ASPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSTATOCENTRICOMODO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("GRL_EMISSIONE_AUTO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GRLEMISSIONEAUTO",s);
    }
  }

  public int IMPACCAGGAUTO(IDVariant AES, IDVariant DDAY, IDVariant AANNO, IDVariant NUMAGG)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(DDAY);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AANNO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(NUMAGG);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("IMP_ACC_AGG_AUTO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("IMPACCAGGAUTO",s);
    }
  }

  public int GRLESTRAZIONE(IDVariant AGRUPPO, IDVariant ADATA, IDVariant ABOLLO, IDVariant ABEN, IDVariant ASEDEDEL, IDVariant AANNODEL, IDVariant ANUMDEL, IDVariant AESERCIZIO, IDVariant AESTRAZIONI)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AGRUPPO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABEN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMDEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESTRAZIONI);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("GRL_ESTRAZIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GRLESTRAZIONE",s);
    }
  }

  public int RITPAGAMENTOIRPEF(IDVariant AESERCIZIO, IDVariant ADATADA, IDVariant ADATAA, IDVariant ABEN, IDVariant ACAUSALE, IDVariant ABOLLO, IDVariant AUFFICIO, IDVariant AEMISS, IDVariant AMESE, IDVariant ALIQDA, IDVariant ALIQA, IDVariant AUFFICIOLIQ, IDVariant PCOMMISSIONI, IDVariant PINFOTESORIERE, IDVariant PSPESE, IDVariant PSCADENZA, IDVariant PALLEGATI, IDVariant PSTATOSIOPE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ABEN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AEMISS);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AMESE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ALIQDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ALIQA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AUFFICIOLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSCADENZA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("RIT_PAGAMENTO_IRPEF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RITPAGAMENTOIRPEF",s);
    }
  }

  public int RITPAGAMENTOADDIZIONALE(IDVariant AESERCIZIO, IDVariant ADATADA, IDVariant ADATAA, IDVariant ACAUSALE, IDVariant ABOLLO, IDVariant AUFFICIO, IDVariant AEMISS, IDVariant AMESE, IDVariant AMINPAGAM, IDVariant ALIQDA, IDVariant ALIQA, IDVariant AUFFICIOLIQ, IDVariant PCOMMISSIONI, IDVariant PINFOTESORIERE, IDVariant PSPESE, IDVariant PSCADENZA, IDVariant PALLEGATI, IDVariant PSTATOSIOPE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AEMISS);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AMESE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AMINPAGAM);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ALIQDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ALIQA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AUFFICIOLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSCADENZA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("RIT_PAGAMENTO_ADDIZIONALE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RITPAGAMENTOADDIZIONALE",s);
    }
  }

  public int RITPAGAMENTOINPS(IDVariant AESERCIZIO, IDVariant ADATADA, IDVariant ADATAA, IDVariant ABEN, IDVariant ACAUSALE, IDVariant ABOLLO, IDVariant AUFFICIO, IDVariant AEMISS, IDVariant ACUM, IDVariant AMESE, IDVariant ALIQDA, IDVariant ALIQA, IDVariant AUFFICIOLIQ, IDVariant PCOMMISSIONI, IDVariant PINFOTESORIERE, IDVariant PSPESE, IDVariant PSCADENZA, IDVariant PALLEGATI, IDVariant PSTATOSIOPE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ABEN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AEMISS);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACUM);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AMESE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ALIQDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ALIQA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AUFFICIOLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSCADENZA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("RIT_PAGAMENTO_INPS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RITPAGAMENTOINPS",s);
    }
  }

  public int RITPAGAMENTOINPSCE(IDVariant AESERCIZIO, IDVariant ADATADA, IDVariant ADATAA, IDVariant ABEN, IDVariant ACAUSALE, IDVariant ABOLLO, IDVariant AUFFICIO, IDVariant AEMISS, IDVariant AMESE, IDVariant ALIQDA, IDVariant ALIQA, IDVariant AUFFICIOLIQ, IDVariant PCOMMISSIONI, IDVariant PINFOTESORIERE, IDVariant PSPESE, IDVariant PSCADENZA, IDVariant PALLEGATI, IDVariant PSTATOSIOPE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ABEN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AEMISS);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AMESE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ALIQDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ALIQA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AUFFICIOLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSCADENZA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("RIT_PAGAMENTO_INPS_CE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RITPAGAMENTOINPSCE",s);
    }
  }

  public int RETTIFICALIQ(IDVariant PNLIQDAL, IDVariant PNLIQAL, IDVariant PNESERCIZIO, IDVariant PNCAPITOLO, IDVariant PNARTICOLO, IDVariant PNUMEROIMP, IDVariant PANNOIMP, IDVariant PERRORE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PNLIQDAL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNLIQAL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNCAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PERRORE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("RETTIFICA_LIQ",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RETTIFICALIQ",s);
    }
  }

  public int RETTIFICALIQSUB(IDVariant PNLIQDAL, IDVariant PNLIQAL, IDVariant PNESERCIZIO, IDVariant PNCAPITOLO, IDVariant PNARTICOLO, IDVariant PNUMEROSUBIMP, IDVariant PANNOSUBIMP, IDVariant PERRORE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PNLIQDAL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNLIQAL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNCAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PERRORE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("RETTIFICA_LIQ_SUB",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RETTIFICALIQSUB",s);
    }
  }

  public int LIQUIDAIMPUTAZIONI(IDVariant ANNUMERODIST, IDVariant ANANNODIST, IDVariant ASSEDEDEL, IDVariant ANNUMERODEL, IDVariant ANANNODEL, IDVariant ANANNOPROP, IDVariant ANNUMEROPROP, IDVariant ASUNITAPROP, IDVariant ASDESCLIQ, IDVariant ANANNOMAND, IDVariant ANUFFICIO, IDVariant ANBOLLO, IDVariant ANESERCIZIO, IDVariant ANCAUSALE, IDVariant ACENTRO, IDVariant ANLIQUIDATE, IDVariant ANULTIMALIQUIDATA, IDVariant PANTICIPAZIONE, IDVariant PNOFINANZIAMENTO, IDVariant PCOMMISSIONI, IDVariant PINFOTESORIERE, IDVariant PSTATOSIOPE, IDVariant PDATALIQ)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ANNUMERODIST);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANANNODIST);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASDESCLIQ);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANANNOMAND);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANBOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANCAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACENTRO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANLIQUIDATE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ANULTIMALIQUIDATA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PANTICIPAZIONE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNOFINANZIAMENTO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PCOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PDATALIQ);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("LIQUIDA_IMPUTAZIONI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("LIQUIDAIMPUTAZIONI",s);
    }
  }

  public int WRKLIQDISTINTAINSERT(IDVariant AESERCIZIO, IDVariant AANNODISTINTA, IDVariant ANUMERODISTINTA, IDVariant ATIPODISTINTA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNODISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMERODISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPODISTINTA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WRK_LIQ_DISTINTA_INSERT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WRKLIQDISTINTAINSERT",s);
    }
  }

  public int LIQUIDAWRKLIQDISTINTA(IDVariant AMODULO, IDVariant AESERCIZIO, IDVariant AANNODISTINTA, IDVariant ANUMERODISTINTA, IDVariant ADATADISTINTA, IDVariant A_UTENTE_INSERIMENTO, IDVariant ANOFINANZIAMENTO, IDVariant ASTATOSIOPE, IDVariant AANTICIPAZIONE, IDVariant ANUMLIQUIDATE, IDVariant AULTIMALIQUIDATA, IDVariant A_NO_COD_V_LIVELLO, IDVariant A_NO_COD_COFOG, IDVariant A_NO_COD_EUROPEO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AMODULO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNODISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMERODISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADISTINTA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(A_UTENTE_INSERIMENTO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANOFINANZIAMENTO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AANTICIPAZIONE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ANUMLIQUIDATE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AULTIMALIQUIDATA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(A_NO_COD_V_LIVELLO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(A_NO_COD_COFOG);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(A_NO_COD_EUROPEO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("LIQUIDA_WRK_LIQ_DISTINTA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("LIQUIDAWRKLIQDISTINTA",s);
    }
  }

  public int LIQUIDACASSAECONOMALEGC4(IDVariant PNNUMERODIST, IDVariant PNANNODIST, IDVariant PNESERCIZIO, IDVariant PDDADATA, IDVariant PDADATA, IDVariant PNUFFICIO, IDVariant PNBOLLO, IDVariant PNCAUSALE, IDVariant PNANNODEL, IDVariant PNNUMERODEL, IDVariant PSSEDEDEL, IDVariant PNANNOMAND, IDVariant PNANNOPROP, IDVariant PNNUMEROPROP, IDVariant PSUNITAPROP, IDVariant PNLIQUIDATE, IDVariant PNULTIMALIQUIDATA, IDVariant PANTICIPAZIONE, IDVariant PNOFINANZIAMENTO, IDVariant PCOMMISSIONI, IDVariant PINFOTESORIERE, IDVariant PSTATOSIOPE, IDVariant PDATALIQ)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PNNUMERODIST);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNANNODIST);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDDADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PDADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PNUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNBOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNCAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNANNOMAND);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNLIQUIDATE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNULTIMALIQUIDATA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PANTICIPAZIONE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNOFINANZIAMENTO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PCOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PDATALIQ);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("LIQUIDA_CASSA_ECONOMALE_GC4",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("LIQUIDACASSAECONOMALEGC4",s);
    }
  }

  public int LIQUIDAFATTURAMULTI(IDVariant PESERCIZIO, IDVariant PCAPITOLO, IDVariant PARTICOLO, IDVariant PANNOIMP, IDVariant PNUMEROIMP, IDVariant PANNOSUBIMP, IDVariant PNUMEROSUBIMP, IDVariant PTIPOVINCOLO, IDVariant PVOCEECON, IDVariant PSESSIONE, IDVariant PSEDEDEL, IDVariant PUNITAPROPONENTE, IDVariant PDESCLIQ, IDVariant PBENEFICIARIO, IDVariant PANNOMAND, IDVariant PUFFICIO, IDVariant PANNODEL, IDVariant PNUMERODEL, IDVariant PANNOPROPOSTA, IDVariant PNUMEROPROPOSTA, IDVariant PANNOLIQ, IDVariant PCAUSALE, IDVariant PLIQUIDATE, IDVariant NNUMERO, IDVariant PBOLLO, IDVariant ADATAREG, IDVariant PANTICIPAZIONE, IDVariant PCOMMISSIONI, IDVariant PINFOTESORIERE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOVINCOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVOCEECON);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUNITAPROPONENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCLIQ);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PBENEFICIARIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOMAND);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PLIQUIDATE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(NNUMERO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PBOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PANTICIPAZIONE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PCOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("LIQUIDA_FATTURA_MULTI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("LIQUIDAFATTURAMULTI",s);
    }
  }

  public int SOGLIQCONTROLLO(IDVariant PSESSIONE, IDVariant PESERCIZIO, IDVariant PTIPOQTNCASSA, IDVariant PSVUOTOWRK, IDVariant PERRORE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOQTNCASSA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSVUOTOWRK);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PERRORE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("SOG_LIQ_CONTROLLO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("SOGLIQCONTROLLO",s);
    }
  }

  public int SOGLIQCARICA(IDVariant PSESSIONE, IDVariant PESERCIZIO, IDVariant PNUMEROIMP, IDVariant PANNOIMP, IDVariant PNUMEROSUBIMP, IDVariant PANNOSUBIMP, IDVariant PSEDEDEL, IDVariant PNUMERODEL, IDVariant PANNODEL, IDVariant PUNITAPROPONENTE, IDVariant PNUMEROPROPOSTA, IDVariant PANNOPROPOSTA, IDVariant PVOCEECON, IDVariant PCODGEST, IDVariant PTIPOVINCOLO, IDVariant PDESCRIZIONE, IDVariant PCAUSALE, IDVariant PTIPOQTNCASSA, IDVariant PBOLLO, IDVariant PUFFICIO, IDVariant PFINANZIAMENTO, IDVariant PSPESE, IDVariant PCOMMISSIONI, IDVariant PSCADENZA, IDVariant PALLETATI, IDVariant PINFOTESO, IDVariant PINEMISSIONE, IDVariant PSOGINSDA, IDVariant PSOGINSA, IDVariant PLIQINSDA, IDVariant PLIQINSA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROPONENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMEROPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVOCEECON);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCODGEST);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOVINCOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOQTNCASSA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PBOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PFINANZIAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSCADENZA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PALLETATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PINFOTESO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PINEMISSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSOGINSDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PSOGINSA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PLIQINSDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PLIQINSA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("SOG_LIQ_CARICA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("SOGLIQCARICA",s);
    }
  }

  public int T72PD(IDVariant OLDCODICE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(OLDCODICE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("T72_PD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("T72PD",s);
    }
  }

  public int DUPLICAGRUPPO(IDVariant AOLDGRUPPO, IDVariant ANEWGRUPPO, IDVariant ADESCRIZIONE, IDVariant AUTENTE, IDVariant ATIPO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AOLDGRUPPO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEWGRUPPO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("DUPLICA_GRUPPO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("DUPLICAGRUPPO",s);
    }
  }

  public int IMPORTMOVIMENTIDAFILEGRUPPICONTROLLOPURO(IDVariant PGRUPPO, IDVariant PTIPOMOV, IDVariant PESERCIZIO, IDVariant PSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PGRUPPO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOMOV);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("IMPORT_MOVIMENTI_DA_FILE.GRUPPI_CONTROLLO_PURO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("IMPORTMOVIMENTIDAFILEGRUPPICONTROLLOPURO",s);
    }
  }

  public int IMPORTMOVIMENTIDAFILEEMISSIONEMOVGRUPPI(IDVariant PGRUPPO, IDVariant PTIPOMOV, IDVariant PESERCIZIO, IDVariant PACCDA, IDVariant PACCA, IDVariant PSUPDISPPURO, IDVariant PSTATOCENTRICOMODO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PGRUPPO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOMOV);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PACCDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PACCA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PSUPDISPPURO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PSTATOCENTRICOMODO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("IMPORT_MOVIMENTI_DA_FILE.EMISSIONE_MOV_GRUPPI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("IMPORTMOVIMENTIDAFILEEMISSIONEMOVGRUPPI",s);
    }
  }

  public int IMPORTMOVIMENTIDAFILEIMPORTFILESUGRUPPI(IDVariant PGRUPPO, IDVariant PTIPOMOV, IDVariant PESERCIZIO, IDVariant PUTENTE, IDVariant PSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PGRUPPO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOMOV);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("IMPORT_MOVIMENTI_DA_FILE.IMPORT_FILE_SU_GRUPPI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("IMPORTMOVIMENTIDAFILEIMPORTFILESUGRUPPI",s);
    }
  }

  public int MANGENERAZIONELI(IDVariant AESERCIZIO, IDVariant DATAELAB, IDVariant ANNOELAB, IDVariant AUFFICIO, IDVariant ATIPOEMISSIONE, IDVariant AORDINE, IDVariant TOT, IDVariant DANUM, IDVariant ANUM, IDVariant PANTICIPAZIONE, IDVariant PCOPERTURA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(DATAELAB);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANNOELAB);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOEMISSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AORDINE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(TOT);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(DANUM);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ANUM);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PANTICIPAZIONE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PCOPERTURA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("MAN_GENERAZIONE_LI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("MANGENERAZIONELI",s);
    }
  }

  public int MANGENERAZIONE(IDVariant AESERCIZIO, IDVariant DATAELAB, IDVariant ANNOELAB, IDVariant AUFFICIO, IDVariant ATIPOEMISSIONE, IDVariant AORDINE, IDVariant TOT, IDVariant DANUM, IDVariant ANUM, IDVariant PANTICIPAZIONE, IDVariant PCOPERTURA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(DATAELAB);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANNOELAB);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOEMISSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AORDINE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(TOT);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(DANUM);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ANUM);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PANTICIPAZIONE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PCOPERTURA);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("MAN_GENERAZIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("MANGENERAZIONE",s);
    }
  }

  public int N04NUMERAZIONEMANUALE(IDVariant PESERCIZIO, IDVariant PNUMELENCO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMELENCO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("N04_NUMERAZIONE_MANUALE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("N04NUMERAZIONEMANUALE",s);
    }
  }

  public int ANNULLAPAGAMENTI(IDVariant AANNOMAND, IDVariant ANUMMANDDA, IDVariant ANUMMANDA, IDVariant ADATAMANDDA, IDVariant ADATAMANDA, IDVariant ADATAPAGDA, IDVariant ADATAPAGA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOMAND);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMMANDDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMMANDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATAMANDDA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATAMANDA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATAPAGDA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATAPAGA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("ANNULLA_PAGAMENTI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ANNULLAPAGAMENTI",s);
    }
  }

  public int MANPAGAMENTO(IDVariant ADAMAN, IDVariant AAMAN, IDVariant AEMESSIAL, IDVariant ANUMEROPAGAM, IDVariant ADATAPAGAM, IDVariant AESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ADAMAN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AAMAN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AEMESSIAL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMEROPAGAM);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATAPAGAM);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("MAN_PAGAMENTO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("MANPAGAMENTO",s);
    }
  }

  public int RETTIFICAMAN(IDVariant PNMANDAL, IDVariant PNMANAL, IDVariant PNESERCIZIO, IDVariant PNCAPITOLO, IDVariant PNARTICOLO, IDVariant PNNUMEROIMP, IDVariant PNANNOIMP, IDVariant PSESSIONE, IDVariant PERRORE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PNMANDAL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNMANAL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNCAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNNUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PERRORE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("RETTIFICA_MAN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RETTIFICAMAN",s);
    }
  }

  public int RETTIFICAMANSUB(IDVariant PNMANDAL, IDVariant PNMANAL, IDVariant PNESERCIZIO, IDVariant PNUMEROSUBIMP, IDVariant PANNOSUBIMP, IDVariant PERRORE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PNMANDAL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNMANAL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOSUBIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PERRORE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("RETTIFICA_MAN_SUB",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RETTIFICAMANSUB",s);
    }
  }

  public int RIEMISSIONEMANNONPAG(IDVariant ANESERCIZIO, IDVariant ANMANDAL, IDVariant ANMANAL, IDVariant ADDATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ANESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANMANDAL);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ANMANAL);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ADDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("RIEMISSIONE_MAN_NONPAG",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RIEMISSIONEMANNONPAG",s);
    }
  }

  public int N04NUMERAZIONE(IDVariant PESERCIZIO, IDVariant PPROVENIENZA, IDVariant PULTIMOMANDATO, IDVariant PNUMELENCO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROVENIENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PULTIMOMANDATO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMELENCO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("N04_NUMERAZIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("N04NUMERAZIONE",s);
    }
  }

  public int GENERATESOMAN(IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant ANUMMANDDA, IDVariant ANUMMANDA, IDVariant AUFFICIO, IDVariant ADISTINTA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMMANDDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMMANDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("GENERA_TESO_MAN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERATESOMAN",s);
    }
  }

  public int CONTROLLOCONGRUENZAMAN(IDVariant AESERCIZIO, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AANNOIMP, IDVariant ANUMEROIMP, IDVariant AVOCEECON, IDVariant ABOLLO, IDVariant AVINCOLO, IDVariant AUFFICIO, IDVariant AANNOLIQ, IDVariant ANUMEROLIQ, IDVariant ADIFF)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AVOCEECON);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AVINCOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADIFF);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("CONTROLLO_CONGRUENZA_MAN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTROLLOCONGRUENZAMAN",s);
    }
  }

  public int CONTROLLOMANINFRITENUTE(IDVariant AANNOMAND, IDVariant ANUMMAND, IDVariant AANNOLIQ, IDVariant ANUMEROLIQ, IDVariant ATIPOSUBMAN, IDVariant AERRORE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOMAND);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMMAND);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROLIQ);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOSUBMAN);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AERRORE);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("CONTROLLO_MAN_INF_RITENUTE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CONTROLLOMANINFRITENUTE",s);
    }
  }

  public int WORKCCFE(IDVariant ASESSIONE, IDVariant AESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_CCFE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKCCFE",s);
    }
  }

  public int ESTRAZ770(IDVariant AESERCIZIO, IDVariant AQUADRO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AQUADRO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("ESTRAZ770",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ESTRAZ770",s);
    }
  }

  public int ESTRAZCU(IDVariant AESERCIZIO, IDVariant ATIPO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("ESTRAZCU",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ESTRAZCU",s);
    }
  }

  public int EMISSMANVERSIVAIST(IDVariant PESERCIZIO, IDVariant PDAL, IDVariant PAL, IDVariant PSEDEDEL, IDVariant PNUMERODEL, IDVariant PANNODEL, IDVariant PUNITAPROP, IDVariant PNUMEROPROP, IDVariant PANNOPROP, IDVariant PBEN, IDVariant PUFFICIO, IDVariant PCAUSALE, IDVariant PCOMMISSIONI, IDVariant PINFOTESORIERE, IDVariant PSPESE, IDVariant PSCADENZA, IDVariant PALLEGATI, IDVariant PNUMMANDAL, IDVariant PNUMMANAL, IDVariant P_QTN, IDVariant P_BOLLO, IDVariant p_numero_contabile, IDVariant p_data_contabile)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PBEN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSCADENZA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMMANDAL);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNUMMANAL);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(P_QTN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_BOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(p_numero_contabile);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(p_data_contabile);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("EMISS_MAN_VERS_IVA_IST",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("EMISSMANVERSIVAIST",s);
    }
  }

  public int EMISSMANFATSPCG4(IDVariant PESERCIZIO, IDVariant PSEDEDEL, IDVariant PNUMERODEL, IDVariant PANNODEL, IDVariant PUNITAPROP, IDVariant PNUMEROPROP, IDVariant PANNOPROP, IDVariant PDESCR, IDVariant PUFFICIO, IDVariant PCAUSALE, IDVariant PCOMMISSIONI, IDVariant PINFOTESORIERE, IDVariant PSPESE, IDVariant PSCADENZA, IDVariant PALLEGATI, IDVariant PNUMMANDAL, IDVariant PNUMMANAL, IDVariant PDATAORD, IDVariant PCAUSALEORD, IDVariant PBOLLOORD, IDVariant PUFFICIOORD, IDVariant PEMISSORD, IDVariant PORDBENORD, IDVariant PORDDA, IDVariant PORDA, IDVariant PVARACC, IDVariant PCOMMISSIONIORD, IDVariant PINFOTESORIEREORD, IDVariant PSPESEORD, IDVariant PALLEGATIORD, IDVariant PSTATOSIOPE, IDVariant PSTATOSIOPEORD, IDVariant PDATAEMISSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDESCR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PCOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSCADENZA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNUMMANDAL);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNUMMANAL);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PDATAORD);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCAUSALEORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PBOLLOORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUFFICIOORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PEMISSORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PORDBENORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PORDDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PORDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PVARACC);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(PCOMMISSIONIORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PINFOTESORIEREORD);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSPESEORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PALLEGATIORD);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PSTATOSIOPEORD);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PDATAEMISSIONE);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("EMISS_MAN_FAT_SP_CG4",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("EMISSMANFATSPCG4",s);
    }
  }

  public int LIQUIDAPROVVISORI(IDVariant AESERCIZIO, IDVariant ADATAEMISS, IDVariant ACAUSALE, IDVariant AUFFICIO, IDVariant ABOLLO, IDVariant ADESCR, IDVariant ASEDEDEL, IDVariant ANUMDEL, IDVariant AANNODEL, IDVariant AIMPDA, IDVariant AIMPA, IDVariant ALIQDA, IDVariant ALIQA, IDVariant ANUMTOTMAND, IDVariant AMANDA, IDVariant AMANA, IDVariant ACBXDEL, IDVariant ACBXDESC, IDVariant AANTICIPAZIONE, IDVariant ASTATOSIOPE, IDVariant ASUPDISPPURO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATAEMISS);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADESCR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMDEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIMPDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AIMPA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ALIQDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ALIQA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ANUMTOTMAND);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AMANDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AMANA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ACBXDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACBXDESC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AANTICIPAZIONE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASUPDISPPURO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("LIQUIDA_PROVVISORI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("LIQUIDAPROVVISORI",s);
    }
  }

  public int WORKGROCONTROLLOPURO(IDVariant PGRUPPO, IDVariant PPROGRSESSIONE, IDVariant PESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PGRUPPO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_GRO_CONTROLLO_PURO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKGROCONTROLLOPURO",s);
    }
  }

  public int GROEMISSIONEAUTO(IDVariant AESERCIZIO, IDVariant AGRUPPO, IDVariant ADATA, IDVariant ACAUSALE, IDVariant AUFFICIO, IDVariant ARIFDET, IDVariant ADESCR, IDVariant AEMISS, IDVariant AORDDA, IDVariant AORDA, IDVariant AACCDA, IDVariant AACCA, IDVariant AVARACC, IDVariant ARILEVANTEECO, IDVariant ADEBITOREACC, IDVariant ACODIMPECO, IDVariant AALLEGATI, IDVariant AINFOTESORIERE, IDVariant ANUMEROCONT, IDVariant ADATACONT, IDVariant ASTATOSIOPE, IDVariant ASUPDISPPURO, IDVariant PSTATOCENTRICOMODO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AGRUPPO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ARIFDET);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADESCR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AEMISS);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AORDDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AORDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AACCDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AACCA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AVARACC);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(ARILEVANTEECO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADEBITOREACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACODIMPECO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMEROCONT);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATACONT);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ASTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASUPDISPPURO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PSTATOCENTRICOMODO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("GRO_EMISSIONE_AUTO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GROEMISSIONEAUTO",s);
    }
  }

  public int AGGAUTOORDPROV(IDVariant AESERCIZIO, IDVariant APROGORDPROV, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant AANNOACC, IDVariant ANUMEROACC, IDVariant ACODDEBITORE, IDVariant ANUMQUIETANZA, IDVariant ABOLLO, IDVariant AUFFICIO, IDVariant ACODLIVELLO5, IDVariant ACODICEEUROPEO, IDVariant ADESCRIZIONE, IDVariant ACGE, IDVariant ADATACCP, IDVariant ATIPOVINCOLO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGORDPROV);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACODDEBITORE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMQUIETANZA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACODLIVELLO5);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACODICEEUROPEO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACGE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATACCP);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ATIPOVINCOLO);
    OutPar.add(new Integer(IDVariant.INTEGER));
    try
    {
      DBO().CallSP("AGG_AUTO_ORD_PROV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("AGGAUTOORDPROV",s);
    }
  }

  public int INTEGRAZAPPLICATIVIESTERNILEGGIRIVERSAMENTIDEPAG(IDVariant PESERCIZIO, IDVariant PUTENTE, IDVariant PSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("INTEGRAZ_APPLICATIVI_ESTERNI.LEGGI_RIVERSAMENTI_DEPAG",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INTEGRAZAPPLICATIVIESTERNILEGGIRIVERSAMENTIDEPAG",s);
    }
  }

  public int INTEGRAZIONEEFILPOSIZIONEIUV(IDVariant PESERCIZIO, IDVariant PPROGRORDPROV, IDVariant PIUV, IDVariant PUTENTE, IDVariant PSESSIONE, IDVariant PRESPONSE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRORDPROV);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIUV);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PRESPONSE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("INTEGRAZIONE_E_FIL.POSIZIONE_IUV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INTEGRAZIONEEFILPOSIZIONEIUV",s);
    }
  }

  public int INTEGRAZIONEEFILIUVPERFLUSSO(IDVariant PESERCIZIO, IDVariant PPROGRORDPROV, IDVariant PUTENTE, IDVariant PSESSIONE, IDVariant PRESPONSE, IDVariant PLISTAIUV)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRORDPROV);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PRESPONSE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PLISTAIUV);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("INTEGRAZIONE_E_FIL.IUV_PER_FLUSSO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INTEGRAZIONEEFILIUVPERFLUSSO",s);
    }
  }

  public int PROVIMPORTAIMPUTCONT(IDVariant PESERCIZIO, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("PROV_IMPORTA_IMPUT_CONT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PROVIMPORTAIMPUTCONT",s);
    }
  }

  public int ORDEMISSPROVVISORI(IDVariant AESERCIZIO, IDVariant ADATA, IDVariant ACAUSALE, IDVariant AUFFICIO, IDVariant ADESCR, IDVariant ADESCRDAACC, IDVariant AEMISS, IDVariant AORDDA, IDVariant AORDA, IDVariant AACCDA, IDVariant AACCA, IDVariant AVARACC, IDVariant ARILEVANTEECO, IDVariant ADEBITOREACC, IDVariant ACODIMPECO, IDVariant ASTATOSIOPE, IDVariant ASUPDISPPURO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADESCR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADESCRDAACC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AEMISS);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AORDDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AORDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AACCDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AACCA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AVARACC);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(ARILEVANTEECO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADEBITOREACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACODIMPECO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASUPDISPPURO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("ORD_EMISS_PROVVISORI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ORDEMISSPROVVISORI",s);
    }
  }

  public int ORDINCASSO(IDVariant ADAORD, IDVariant AAORD, IDVariant AEMESSIAL, IDVariant ANUMEROINC, IDVariant ADATAINC, IDVariant AESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ADAORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AAORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AEMESSIAL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANUMEROINC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAINC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ORD_INCASSO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ORDINCASSO",s);
    }
  }

  public int ANNULLAINCASSI(IDVariant AANNOORD, IDVariant ANUMORDDA, IDVariant ANUMORDA, IDVariant ADATAORDDA, IDVariant ADATAORDA, IDVariant ADATAINCDA, IDVariant ADATAINCA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMORDDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMORDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATAORDDA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATAORDA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATAINCDA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATAINCA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("ANNULLA_INCASSI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ANNULLAINCASSI",s);
    }
  }

  public int RIEMISSIONEORDNONINC(IDVariant ANESERCIZIO, IDVariant ANORDDAL, IDVariant ANORDAL, IDVariant ADDATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ANESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANORDDAL);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ANORDAL);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ADDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("RIEMISSIONE_ORD_NONINC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RIEMISSIONEORDNONINC",s);
    }
  }

  public int RETTIFICAORD(IDVariant PNORDDAL, IDVariant PNORDAL, IDVariant PNESERCIZIO, IDVariant PNCAPITOLO, IDVariant PNARTICOLO, IDVariant PNNUMEROACC, IDVariant PSESSIONE, IDVariant PNANNOACC, IDVariant PUTENTEULTIMOAGG, IDVariant PDATAULTIMOAGG, IDVariant PERRORE, IDVariant PIMPORTOVAR)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PNORDDAL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNORDAL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNCAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNNUMEROACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNANNOACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTEULTIMOAGG);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATAULTIMOAGG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PERRORE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PIMPORTOVAR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("RETTIFICA_ORD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RETTIFICAORD",s);
    }
  }

  public int ORDEMISSRITENUTE(IDVariant AESERCIZIO, IDVariant AMANDA, IDVariant AMANA, IDVariant ADATA, IDVariant ACAUSALE, IDVariant ABOLLO, IDVariant AUFFICIO, IDVariant AEMISS, IDVariant AORDBEN, IDVariant AIRPEF, IDVariant AORDDA, IDVariant AORDA, IDVariant AVARACC, IDVariant ACOMMISSIONI, IDVariant AINFOTESORIERE, IDVariant ASPESE, IDVariant AALLEGATI, IDVariant ASTATOSIOPE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AMANDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AMANA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AEMISS);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AORDBEN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIRPEF);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AORDDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AORDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AVARACC);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(ACOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ORD_EMISS_RITENUTE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ORDEMISSRITENUTE",s);
    }
  }

  public int ORDEMISSPERSP(IDVariant AESERCIZIO, IDVariant AMANDA, IDVariant AMANA, IDVariant ADATA, IDVariant ACAUSALE, IDVariant ABOLLO, IDVariant AUFFICIO, IDVariant AEMISS, IDVariant AORDBEN, IDVariant AORDDA, IDVariant AORDA, IDVariant AVARACC, IDVariant ACOMMISSIONI, IDVariant AINFOTESORIERE, IDVariant ASPESE, IDVariant AALLEGATI, IDVariant ASTATOSIOPE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AMANDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AMANA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AEMISS);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AORDBEN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AORDDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AORDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AVARACC);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(ACOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ORD_EMISS_PER_SP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ORDEMISSPERSP",s);
    }
  }

  public int ORDEMISSCORRISPETTIVI(IDVariant AESERCIZIO, IDVariant ADATADA, IDVariant ADATAA, IDVariant ADATA, IDVariant ADEB, IDVariant ACAUSALE, IDVariant ABOLLO, IDVariant AUFFICIO, IDVariant AEMISS, IDVariant AORDDA, IDVariant AORDA, IDVariant AACCDA, IDVariant AACCA, IDVariant AVARACC, IDVariant ATIPOBOLLATO, IDVariant ARILEVANTEECO, IDVariant ACONTROPARTITA, IDVariant ACOMMISSIONI, IDVariant AINFOTESORIERE, IDVariant ASPESE, IDVariant AALLEGATI, IDVariant ASTATOSIOPE, IDVariant ASUPDISPPURO, IDVariant aemisssenzacod5)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADEB);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AEMISS);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AORDDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AORDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AACCDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AACCA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AVARACC);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(ATIPOBOLLATO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ARILEVANTEECO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACONTROPARTITA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASUPDISPPURO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(aemisssenzacod5);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ORD_EMISS_CORRISPETTIVI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ORDEMISSCORRISPETTIVI",s);
    }
  }

  public int ORDEMISSCFA(IDVariant AESERCIZIO, IDVariant ACAPITOLO, IDVariant AARTICOLO, IDVariant ANUMEROACC, IDVariant AANNOACC, IDVariant ADATA, IDVariant ADESC, IDVariant ACAUSALE, IDVariant ABOLLO, IDVariant AUFFICIO, IDVariant AEMISS, IDVariant AORDDA, IDVariant AORDA, IDVariant AACCDA, IDVariant AACCA, IDVariant AVARACC, IDVariant ADEBITORE, IDVariant ARILEVANTEECO, IDVariant ADEBITOREACC, IDVariant ACONTROPARTITA, IDVariant ACONTABILE, IDVariant ADATACONT, IDVariant AQUIETANZA, IDVariant ADATAINC, IDVariant ADATAEST, IDVariant ACOMMISSIONI, IDVariant AINFOTESORIERE, IDVariant ASPESE, IDVariant AALLEGATI, IDVariant ASTATOSIOPE, IDVariant ASUPDISPPURO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADESC);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AEMISS);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AORDDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AORDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AACCDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AACCA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AVARACC);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(ADEBITORE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ARILEVANTEECO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADEBITOREACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACONTROPARTITA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACONTABILE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATACONT);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AQUIETANZA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATAINC);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATAEST);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ACOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(ASUPDISPPURO);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ORD_EMISS_CFA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ORDEMISSCFA",s);
    }
  }

  public int ORDEMISSCASSAECONGC4(IDVariant ADDATA, IDVariant ANESERCIZIO, IDVariant ANANNODIST, IDVariant ANNUMERODIST, IDVariant ANBOLLO, IDVariant ANUFFICIO, IDVariant ANCAUSALE, IDVariant ANEMISS, IDVariant PNORDDA, IDVariant PNORDA, IDVariant PNACCDA, IDVariant PNACCA, IDVariant PAVARACC, IDVariant ARILEVANTEECO, IDVariant ACODIMPECO, IDVariant ACOMMISSIONI, IDVariant AINFOTESORIERE, IDVariant ASPESE, IDVariant AALLEGATI, IDVariant PSTATOSIOPE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ADDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ANESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANANNODIST);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANNUMERODIST);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANBOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANCAUSALE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANEMISS);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNORDDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNORDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNACCDA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PNACCA);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(PAVARACC);
    OutPar.add(new Integer(-IDVariant.STRING));
    SPPar.add(ARILEVANTEECO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACODIMPECO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACOMMISSIONI);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AINFOTESORIERE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASPESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AALLEGATI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSTATOSIOPE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ORD_EMISS_CASSA_ECON_GC4",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ORDEMISSCASSAECONGC4",s);
    }
  }

  public int GENERATESOORD(IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant ANUMORDDA, IDVariant ANUMORDA, IDVariant AUFFICIO, IDVariant ADISTINTA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMORDDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMORDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUFFICIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("GENERA_TESO_ORD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERATESOORD",s);
    }
  }

  public int GROESTRAZIONE(IDVariant AGRUPPO, IDVariant ADATA, IDVariant ABOLLO, IDVariant ABEN, IDVariant AESERCIZIO, IDVariant AESTRAZIONI)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AGRUPPO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ABOLLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ABEN);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESTRAZIONI);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("GRO_ESTRAZIONE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GROESTRAZIONE",s);
    }
  }

  public int ALLINEASTATI(IDVariant INIDFLUSSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(INIDFLUSSO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("COMUNICAZIONE_SIOPE_WS_GDM.ALLINEA_STATI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ALLINEASTATI",s);
    }
  }

  public int APPROVAORDINATIVO(IDVariant IN_ID_ELABORAZIONE, IDVariant IN_ID_GDM)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(IN_ID_ELABORAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(IN_ID_GDM);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("COMUNICAZIONE_SIOPE_WS_GDM.APPROVA_ORDINATIVO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("APPROVAORDINATIVO",s);
    }
  }

  public int ANNULLAORDINATIVO(IDVariant IN_ID_ELABORAZIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(IN_ID_ELABORAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("COMUNICAZIONE_SIOPE_WS_GDM.ANNULLA_ORDINATIVO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ANNULLAORDINATIVO",s);
    }
  }

  public int RICERCA_GIORNALI()
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    try
    {
      DBO().CallSP("COMUNICAZIONE_SIOPE_WS_GDM.RICERCA_GIORNALI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("RICERCA_GIORNALI",s);
    }
  }

  public int CARICAINCINFTESOOPI(IDVariant AIDELABORAZIONE, IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant AIDFLUSSOBT, IDVariant ADATAFLUSSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AIDELABORAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIDFLUSSOBT);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAFLUSSO);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("CARICA_INC_INF_TESO_OPI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAINCINFTESOOPI",s);
    }
  }

  public int CARICAPAGAMINFTESOOPI(IDVariant AIDELABORAZIONE, IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant AIDFLUSSOBT, IDVariant ADATAFLUSSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AIDELABORAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIDFLUSSOBT);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAFLUSSO);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("CARICA_PAGAM_INF_TESO_OPI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAPAGAMINFTESOOPI",s);
    }
  }

  public int CARICAORDPROVOPI(IDVariant AIDELABORAZIONE, IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant AIDFLUSSOBT, IDVariant ADATAFLUSSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AIDELABORAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIDFLUSSOBT);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAFLUSSO);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("CARICA_ORD_PROV_OPI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAORDPROVOPI",s);
    }
  }

  public int CARICAMANPROVOPI(IDVariant AIDELABORAZIONE, IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant ANONCANCWRK, IDVariant AIDFLUSSOBT, IDVariant ADATAFLUSSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AIDELABORAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANONCANCWRK);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AIDFLUSSOBT);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAFLUSSO);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("CARICA_MAN_PROV_OPI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAMANPROVOPI",s);
    }
  }

  public int PROGTESOMANINF(IDVariant AANNOMAND, IDVariant ANUMEROMAND)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOMAND);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROMAND);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("PROG_TESO_MAN_INF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PROGTESOMANINF",s);
    }
  }

  public int PROGTESOORDINF(IDVariant AANNOORD, IDVariant ANUMEROORD)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("PROG_TESO_ORD_INF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PROGTESOORDINF",s);
    }
  }

  public int GENERAMANINF(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ANUMMANDDA, IDVariant ANUMMANDA, IDVariant ANUMDISTINTA, IDVariant AUTENTE, IDVariant ANOMINATIVO, IDVariant AIDFLUSSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMMANDDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMMANDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMDISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANOMINATIVO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AIDFLUSSO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_MAN_INF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAMANINF",s);
    }
  }

  public int GENERAMANINFANN(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ADATADAL, IDVariant ADATAAL, IDVariant AUTENTE, IDVariant ANOMINATIVO, IDVariant AIDFLUSSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATAAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANOMINATIVO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AIDFLUSSO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_MAN_INF_ANN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAMANINFANN",s);
    }
  }

  public int GENERAMANINFVAR(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ADATADAL, IDVariant ADATAAL, IDVariant AUTENTE, IDVariant ANOMINATIVO, IDVariant AIDFLUSSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATAAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANOMINATIVO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AIDFLUSSO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_MAN_INF_VAR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAMANINFVAR",s);
    }
  }

  public int GENERAMANINFSOS(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ADATADAL, IDVariant ADATAAL, IDVariant AUTENTE, IDVariant ANOMINATIVO, IDVariant AIDFLUSSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATAAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANOMINATIVO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AIDFLUSSO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_MAN_INF_SOS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAMANINFSOS",s);
    }
  }

  public int GENERAORDINF(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ANUMORDDA, IDVariant ANUMORDA, IDVariant ANUMDISTINTA, IDVariant AUTENTE, IDVariant ANOMINATIVO, IDVariant AIDFLUSSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMORDDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMORDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMDISTINTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANOMINATIVO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AIDFLUSSO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_ORD_INF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAORDINF",s);
    }
  }

  public int GENERAORDINFANN(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ADATADAL, IDVariant ADATAAL, IDVariant AUTENTE, IDVariant ANOMINATIVO, IDVariant AIDFLUSSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATAAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANOMINATIVO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AIDFLUSSO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_ORD_INF_ANN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAORDINFANN",s);
    }
  }

  public int GENERAORDINFVAR(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ADATADAL, IDVariant ADATAAL, IDVariant AUTENTE, IDVariant ANOMINATIVO, IDVariant AIDFLUSSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATAAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANOMINATIVO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AIDFLUSSO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_ORD_INF_VAR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAORDINFVAR",s);
    }
  }

  public int GENERAORDINFSOS(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ADATADAL, IDVariant ADATAAL, IDVariant AUTENTE, IDVariant ANOMINATIVO, IDVariant AIDFLUSSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ADATAAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANOMINATIVO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AIDFLUSSO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_ORD_INF_SOS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERAORDINFSOS",s);
    }
  }

  public int MANORDINFSPLITFLUSSO(IDVariant PESERCIZIO, IDVariant PIDFLUSSO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIDFLUSSO);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("MANORD_INF_SPLIT_FLUSSO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("MANORDINFSPLITFLUSSO",s);
    }
  }

  public int ELIMINAINVIOMANINF(IDVariant AANNOMAND, IDVariant ANUMMANDDA, IDVariant ANUMMANDA, IDVariant ANUMELENCO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOMAND);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMMANDDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMMANDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMELENCO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ELIMINA_INVIO_MAN_INF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ELIMINAINVIOMANINF",s);
    }
  }

  public int ELIMINAINVIOORDINF(IDVariant AANNOORD, IDVariant ANUMORDDA, IDVariant ANUMORDA, IDVariant ANUMELENCO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMORDDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMORDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMELENCO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ELIMINA_INVIO_ORD_INF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ELIMINAINVIOORDINF",s);
    }
  }

  public int ELIMINAANNVARMANINF(IDVariant AANNOMAND, IDVariant ANUMMANDDA, IDVariant ANUMMANDA, IDVariant ATIPO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOMAND);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMMANDDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMMANDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("ELIMINA_ANNVAR_MAN_INF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ELIMINAANNVARMANINF",s);
    }
  }

  public int ELIMINAANNVARORDINF(IDVariant AANNOORD, IDVariant ANUMORDDA, IDVariant ANUMORDA, IDVariant ATIPO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMORDDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMORDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("ELIMINA_ANNVAR_ORD_INF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ELIMINAANNVARORDINF",s);
    }
  }

  public int ELIMINASOSMANINF(IDVariant AANNOMAND, IDVariant ANUMMANDDA, IDVariant ANUMMANDA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOMAND);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMMANDDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMMANDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ELIMINA_SOS_MAN_INF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ELIMINASOSMANINF",s);
    }
  }

  public int ELIMINASOSORDINF(IDVariant AANNOORD, IDVariant ANUMORDDA, IDVariant ANUMORDA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AANNOORD);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMORDDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMORDA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ELIMINA_SOS_ORD_INF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ELIMINASOSORDINF",s);
    }
  }

  public int INSELABOPIDAWORKEXPORT(IDVariant AIDWORKEXPORTID, IDVariant AIDELABORAZIONIOPI)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AIDWORKEXPORTID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AIDELABORAZIONIOPI);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("INS_ELAB_OPI_DA_WORK_EXPORT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INSELABOPIDAWORKEXPORT",s);
    }
  }

  public int CARICAPAGAMINFTESO(IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant ASOLOANOMALIE, IDVariant AIDELABORAZIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASOLOANOMALIE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AIDELABORAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CARICA_PAGAM_INF_TESO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAPAGAMINFTESO",s);
    }
  }

  public int CARICAPAGAMENTITESO(IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant ASOLOANOMALIE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASOLOANOMALIE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CARICA_PAGAMENTI_TESO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAPAGAMENTITESO",s);
    }
  }

  public int CARICAINCASSIINFTESO(IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant ASOLOANOMALIE, IDVariant AIDELABORAZIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASOLOANOMALIE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AIDELABORAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CARICA_INCASSI_INF_TESO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAINCASSIINFTESO",s);
    }
  }

  public int CARICAINCASSITESO(IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant ASOLOANOMALIE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASOLOANOMALIE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CARICA_INCASSI_TESO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAINCASSITESO",s);
    }
  }

  public int CARICAMANPROV(IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant ATOTPROVV, IDVariant AIDELABORAZIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATOTPROVV);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AIDELABORAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CARICA_MAN_PROV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAMANPROV",s);
    }
  }

  public int CARICAORDPROV(IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant ATOTPROVV, IDVariant AIDELABORAZIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATOTPROVV);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AIDELABORAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CARICA_ORD_PROV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAORDPROV",s);
    }
  }

  public int CARICAPAGHEESTE(IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant ADATALIQ)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATALIQ);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("CARICA_PAGHE_EST_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAPAGHEESTE",s);
    }
  }

  public int CARICAPAGHEESTS(IDVariant ASESSIONEID, IDVariant AESERCIZIO, IDVariant ADATALIQ)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATALIQ);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("CARICA_PAGHE_EST_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CARICAPAGHEESTS",s);
    }
  }

  public int ESTRAZBILSMU(IDVariant AESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("ESTRAZ_BIL_SMU",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("ESTRAZBILSMU",s);
    }
  }

  public int CF4WEBSITACCCLASSIF(IDVariant AESERCIZIO, IDVariant ASESSIONE, IDVariant ATIPOCLASSIF, IDVariant ATIPOSTAMPA, IDVariant AFILTRO1, IDVariant AFILTRO2, IDVariant ADATAELAB, IDVariant ACOMPRES, IDVariant ASOLODISP, IDVariant a_uo_sup_2)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOCLASSIF);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOSTAMPA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AFILTRO1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFILTRO2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ACOMPRES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLODISP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(a_uo_sup_2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CF4WEB_SIT_ACC_CLASSIF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBSITACCCLASSIF",s);
    }
  }

  // **********************************************************************
  // Explain what process is carried out by this function
  // **********************************************************************
  public int CF4WEBSITIMPCLASSIF(IDVariant AESERCIZIO, IDVariant ASESSIONE, IDVariant ATIPOCLASSIF, IDVariant ATIPOSTAMPA, IDVariant AFILTRO1, IDVariant AFILTRO2, IDVariant ADATAELAB, IDVariant ACOMPRES, IDVariant ASOLOPROVV, IDVariant ASOLOPRENOTAZ, IDVariant ASOLODISP, IDVariant A_DISP_EFF, IDVariant A_UO_SUP_2, IDVariant ADATADAL, IDVariant ASEDATAAPP)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOCLASSIF);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOSTAMPA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AFILTRO1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFILTRO2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ACOMPRES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLOPROVV);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLOPRENOTAZ);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLODISP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(A_DISP_EFF);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(A_UO_SUP_2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATADAL);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ASEDATAAPP);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CF4WEB_SIT_IMP_CLASSIF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBSITIMPCLASSIF",s);
    }
  }

  public int CF4WEBSITSUBIMPCLASSIF(IDVariant AESERCIZIO, IDVariant ASESSIONE, IDVariant ATIPOCLASSIF, IDVariant ATIPOSTAMPA, IDVariant AFILTRO1, IDVariant AFILTRO2, IDVariant ADATAELAB, IDVariant ACOMPRES, IDVariant ASOLOPROVV, IDVariant ASOLODISP, IDVariant A_UO_SUP_2)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOCLASSIF);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOSTAMPA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AFILTRO1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFILTRO2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ACOMPRES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLOPROVV);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLODISP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(A_UO_SUP_2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CF4WEB_SIT_SUBIMP_CLASSIF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBSITSUBIMPCLASSIF",s);
    }
  }

  public int CF4WEBSITLIQCLASSIF(IDVariant AESERCIZIO, IDVariant ASESSIONE, IDVariant ATIPOCLASSIF, IDVariant ATIPOSTAMPA, IDVariant AFILTRO1, IDVariant AFILTRO2, IDVariant ADATAELAB, IDVariant ACOMPRES, IDVariant ASOLOEMESSE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOCLASSIF);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOSTAMPA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AFILTRO1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFILTRO2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ACOMPRES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLOEMESSE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CF4WEB_SIT_LIQ_CLASSIF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBSITLIQCLASSIF",s);
    }
  }

  public int CF4WEBSITORDCLASSIF(IDVariant AESERCIZIO, IDVariant ASESSIONE, IDVariant ATIPOCLASSIF, IDVariant ATIPOSTAMPA, IDVariant AFILTRO1, IDVariant AFILTRO2, IDVariant ADATAELAB, IDVariant ACOMPRES)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOCLASSIF);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOSTAMPA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AFILTRO1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AFILTRO2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ACOMPRES);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CF4WEB_SIT_ORD_CLASSIF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBSITORDCLASSIF",s);
    }
  }

  public int WORKSTAMPAMSGE(IDVariant AESERCIZIO, IDVariant ADACAPITOLO, IDVariant ADAARTICOLO, IDVariant AACAPITOLO, IDVariant AAARTICOLO, IDVariant AMISSIONE, IDVariant APROGRAMMA, IDVariant ACENTROCOSTO, IDVariant ASETTOPE, IDVariant ASERVOPE, IDVariant ACOMPETENZA, IDVariant ARESIDUO, IDVariant AANNO, IDVariant ASESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADAARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AAARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AMISSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRAMMA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACENTROCOSTO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASETTOPE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASERVOPE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARESIDUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AANNO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_STAMPA_MSGE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSTAMPAMSGE",s);
    }
  }

  public int WORKSTAMPAMSGS(IDVariant AESERCIZIO, IDVariant ADACAPITOLO, IDVariant ADAARTICOLO, IDVariant AACAPITOLO, IDVariant AAARTICOLO, IDVariant AMISSIONE, IDVariant APROGRAMMA, IDVariant ACENTROCOSTO, IDVariant ASETTOPE, IDVariant ASERVOPE, IDVariant ACOMPETENZA, IDVariant ARESIDUO, IDVariant AANNO, IDVariant ASESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADAARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AAARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AMISSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRAMMA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACENTROCOSTO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASETTOPE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASERVOPE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARESIDUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AANNO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_STAMPA_MSGS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSTAMPAMSGS",s);
    }
  }

  public int WORKSTAMPAMSGEUO(IDVariant AESERCIZIO, IDVariant ADACAPITOLO, IDVariant ADAARTICOLO, IDVariant AACAPITOLO, IDVariant AAARTICOLO, IDVariant AMISSIONE, IDVariant APROGRAMMA, IDVariant APROGRUOUTILIZZO, IDVariant APROGRUOGESTIONE, IDVariant ACOMPETENZA, IDVariant ARESIDUO, IDVariant AANNO, IDVariant ASESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADAARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AAARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AMISSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRAMMA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRUOUTILIZZO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRUOGESTIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARESIDUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AANNO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_STAMPA_MSGE_UO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSTAMPAMSGEUO",s);
    }
  }

  public int WORKSTAMPAMSGSUO(IDVariant AESERCIZIO, IDVariant ADACAPITOLO, IDVariant ADAARTICOLO, IDVariant AACAPITOLO, IDVariant AAARTICOLO, IDVariant AMISSIONE, IDVariant APROGRAMMA, IDVariant APROGRUOUTILIZZO, IDVariant APROGRUOGESTIONE, IDVariant ACOMPETENZA, IDVariant ARESIDUO, IDVariant AANNO, IDVariant ASESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADAARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AACAPITOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AAARTICOLO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AMISSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRAMMA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRUOUTILIZZO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRUOGESTIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ACOMPETENZA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARESIDUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AANNO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_STAMPA_MSGS_UO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSTAMPAMSGSUO",s);
    }
  }

  public int WORKPATTOMONITORAGGIO(IDVariant AESERCIZIO, IDVariant ATIPOSTAMPA, IDVariant ATIPOMONIT, IDVariant ADATAELAB, IDVariant ATIPORICALCOLO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOSTAMPA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOMONIT);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ATIPORICALCOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_PATTO_MONITORAGGIO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKPATTOMONITORAGGIO",s);
    }
  }

  public int WORKPATTOMONITORAGGIOTOTALI(IDVariant AESERCIZIO, IDVariant ATIPOSTAMPA, IDVariant ATIPOMONIT, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOSTAMPA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOMONIT);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_PATTO_MONITORAGGIO_TOTALI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKPATTOMONITORAGGIOTOTALI",s);
    }
  }

  public int WORKPATTOMONITORAGGIOPREV(IDVariant AESERCIZIO, IDVariant ATIPOSTAMPA, IDVariant ATIPOMONIT, IDVariant ADATAELAB, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOSTAMPA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOMONIT);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_PATTO_MONITORAGGIO_PREV",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKPATTOMONITORAGGIOPREV",s);
    }
  }

  public int WORKBILVARE(IDVariant PESERCIZIO, IDVariant PANNODEL, IDVariant PNUMERODEL, IDVariant PSEDEDEL, IDVariant PANNOPROP, IDVariant PNUMEROPROP, IDVariant PUNITAPROP, IDVariant PDATA, IDVariant PPROGRSESSIONE, IDVariant PRESPRESUNTI, IDVariant PTIPOVAR, IDVariant P_PARTE, IDVariant PPROGRESSIVOSTAMPA, IDVariant PSALVATAGGIO, IDVariant PDESCRIZIONESTAMPA, IDVariant P_RES_FINALI, IDVariant P_ALTRE_PROPOSTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PRESPRESUNTI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_PARTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRESSIVOSTAMPA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSALVATAGGIO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCRIZIONESTAMPA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_RES_FINALI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_ALTRE_PROPOSTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_BIL_VAR_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILVARE",s);
    }
  }

  public int WORKBILVARS(IDVariant PESERCIZIO, IDVariant PANNODEL, IDVariant PNUMERODEL, IDVariant PSEDEDEL, IDVariant PANNOPROP, IDVariant PNUMEROPROP, IDVariant PUNITAPROP, IDVariant PDATA, IDVariant PPROGRSESSIONE, IDVariant PRESPRESUNTI, IDVariant PCAPITOLIFPV, IDVariant PTIPOVAR, IDVariant P_PARTE, IDVariant PPROGRESSIVOSTAMPA, IDVariant PSALVATAGGIO, IDVariant PDESCRIZIONESTAMPA, IDVariant P_RES_FINALI, IDVariant P_ALTRE_PROPOSTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PRESPRESUNTI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCAPITOLIFPV);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_PARTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PPROGRESSIVOSTAMPA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSALVATAGGIO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDESCRIZIONESTAMPA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_RES_FINALI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_ALTRE_PROPOSTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_BIL_VAR_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILVARS",s);
    }
  }

  public int WORKBILVARFPVS(IDVariant PESERCIZIO, IDVariant PANNODEL, IDVariant PNUMERODEL, IDVariant PSEDEDEL, IDVariant PANNOPROP, IDVariant PNUMEROPROP, IDVariant PUNITAPROP, IDVariant PDATA, IDVariant PPROGRSESSIONE, IDVariant PTIPOVAR, IDVariant P_ALTRE_PROPOSTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_ALTRE_PROPOSTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_BIL_VAR_FPV_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILVARFPVS",s);
    }
  }

  public int WORKBILSTNE(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_BIL_STN_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILSTNE",s);
    }
  }

  public int WORKBILSTNS(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_BIL_STN_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILSTNS",s);
    }
  }

  public int WORKBILSTNERES(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_STN_E_RES",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILSTNERES",s);
    }
  }

  public int WORKBILSTNSRES(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_STN_S_RES",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILSTNSRES",s);
    }
  }

  public int WORK_ELENCO_RES_TESO_E(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant P_TIPO_CALCOLO, IDVariant P_DATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_TIPO_CALCOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_DATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_ELENCO_RES_TESO_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORK_ELENCO_RES_TESO_E",s);
    }
  }

  public int WORK_ELENCO_RES_TESO_S(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant P_TIPO_CALCOLO, IDVariant P_DATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_TIPO_CALCOLO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_DATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_ELENCO_RES_TESO_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORK_ELENCO_RES_TESO_S",s);
    }
  }

  public int INSRESPONSABILEUOCAP(IDVariant APROGRSESSIONE, IDVariant AESERCIZIO, IDVariant ATIPOUO, IDVariant AOTTICA, IDVariant ADATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(APROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOUO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AOTTICA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("INS_RESPONSABILE_UO_CAP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("INSRESPONSABILEUOCAP",s);
    }
  }

  public int CF4WEBGETSTRUTTURA(IDVariant APROGRSESSIONE, IDVariant AESERCIZIO, IDVariant ATIPOSTRUTTURA, IDVariant AUTENTE, IDVariant AENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(APROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOSTRUTTURA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CF4WEB_GET_STRUTTURA",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBGETSTRUTTURA",s);
    }
  }

  public int CHIUSURAPRENOTAZIONI(IDVariant ANESERCIZIO, IDVariant ANNUMERODEL, IDVariant ANANNODEL, IDVariant ASSEDEDEL, IDVariant ANNUMEROPROP, IDVariant ANANNOPROP, IDVariant ASUNITAPROP, IDVariant ASDESCRIZIONE, IDVariant ANTIPOVAR, IDVariant ADDATAREG, IDVariant ANNUMEROVAR, IDVariant AANNOIMP, IDVariant ANUMEROIMP, IDVariant AERRORE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ANESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASDESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ANTIPOVAR);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADDATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ANNUMEROVAR);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AANNOIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AERRORE);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CHIUSURA_PRENOTAZIONI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CHIUSURAPRENOTAZIONI",s);
    }
  }

  public int VARAUTOIMPACC(IDVariant PNESE, IDVariant PNCAP, IDVariant PNART, IDVariant PANNOIMPACC, IDVariant PNUMEROIMPACC, IDVariant PNANNODEL, IDVariant PNNUMERODEL, IDVariant PSSEDEDEL, IDVariant PNANNOPROP, IDVariant PNNUMEROPROP, IDVariant PSUNITAPROP, IDVariant PSDESCRIZIONE, IDVariant PNVARIAZIONE, IDVariant PNIMPORTO, IDVariant PDATA, IDVariant PFLAG)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PNESE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNCAP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNART);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNOIMPACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROIMPACC);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PSDESCRIZIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PNVARIAZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNIMPORTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PFLAG);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("VARAUTO_IMP_ACC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("VARAUTOIMPACC",s);
    }
  }

  public int CF4WEBWORKPREVPEG(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ATIPOSTRUTTURA, IDVariant APROGRUOGEST, IDVariant APROGRUOUTIL, IDVariant AUOSOTTOSTANTI, IDVariant AES, IDVariant ATIPOBILANCIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOSTRUTTURA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRUOGEST);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRUOUTIL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUOSOTTOSTANTI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ATIPOBILANCIO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CF4WEB_WORK_PREV_PEG",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBWORKPREVPEG",s);
    }
  }

  public int CF4WEBWORKSITPEG(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ATIPOSTRUTTURA, IDVariant APROGRUOGESTIONE, IDVariant APROGRUOUTIL, IDVariant AUOSOTTOSTANTI, IDVariant AES, IDVariant ASOLOCOMP, IDVariant AVISUOUTILIZZO, IDVariant ADATAELAB)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOSTRUTTURA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRUOGESTIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRUOUTIL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUOSOTTOSTANTI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLOCOMP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AVISUOUTILIZZO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("CF4WEB_WORK_SIT_PEG",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBWORKSITPEG",s);
    }
  }

  public int CF4WEBWORKSITIMP(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ATIPOSTRUTTURA, IDVariant APROGRUO, IDVariant AUOSOTTOSTANTI, IDVariant ASOLOPROVVISORI, IDVariant ASOLOPRENOTAZIONI, IDVariant ASOLODISPONIBILI, IDVariant ARESCOMP, IDVariant AVISUOUTILIZZO, IDVariant ADATAELAB)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOSTRUTTURA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRUO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUOSOTTOSTANTI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLOPROVVISORI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLOPRENOTAZIONI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLODISPONIBILI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARESCOMP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AVISUOUTILIZZO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("CF4WEB_WORK_SIT_IMP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBWORKSITIMP",s);
    }
  }

  public int CF4WEBWORKSITSUBIMP(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ATIPOSTRUTTURA, IDVariant APROGRUO, IDVariant AUOSOTTOSTANTI, IDVariant ASOLOPROVVISORI, IDVariant ASOLODISPONIBILI, IDVariant ARESCOMP, IDVariant AVISUOUTILIZZO, IDVariant ADATAELAB)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOSTRUTTURA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRUO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUOSOTTOSTANTI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLOPROVVISORI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLODISPONIBILI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARESCOMP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AVISUOUTILIZZO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("CF4WEB_WORK_SIT_SUBIMP",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBWORKSITSUBIMP",s);
    }
  }

  public int CF4WEBWORKSITACC(IDVariant ASESSIONE, IDVariant AESERCIZIO, IDVariant ATIPOSTRUTTURA, IDVariant APROGRUO, IDVariant AUOSOTTOSTANTI, IDVariant ASOLODISPONIBILI, IDVariant ARESCOMP, IDVariant AVISUOUTILIZZO, IDVariant ADATAELAB)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOSTRUTTURA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRUO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUOSOTTOSTANTI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASOLODISPONIBILI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ARESCOMP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AVISUOUTILIZZO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("CF4WEB_WORK_SIT_ACC",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CF4WEBWORKSITACC",s);
    }
  }

  public int PVBWORKDISPBIL(IDVariant AESERCIZIO, IDVariant AESERCIZIOCONT, IDVariant ASOLOAPP, IDVariant ASESSIONEID, IDVariant AASSESTAMENTO, IDVariant ANODISP)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIOCONT);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASOLOAPP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AASSESTAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANODISP);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("PVB_WORK_DISP_BIL",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PVBWORKDISPBIL",s);
    }
  }

  public int PVBWORKDISPPRO(IDVariant AESERCIZIO, IDVariant AESERCIZIOCONT, IDVariant ASOLOAPP, IDVariant ASESSIONEID, IDVariant AASSESTAMENTO, IDVariant ANODISP)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIOCONT);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASOLOAPP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AASSESTAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANODISP);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("PVB_WORK_DISP_PRO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PVBWORKDISPPRO",s);
    }
  }

  public int PVBWORKDISPFIN(IDVariant AESERCIZIO, IDVariant AESERCIZIOCONT, IDVariant ASOLOAPP, IDVariant ASESSIONEID, IDVariant AASSESTAMENTO, IDVariant ANODISP)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AESERCIZIOCONT);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASOLOAPP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ASESSIONEID);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AASSESTAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANODISP);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("PVB_WORK_DISP_FIN",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PVBWORKDISPFIN",s);
    }
  }

  public int PVBAGGVARBIL(IDVariant AESERCIZIO, IDVariant AASSESTAMENTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AASSESTAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("PVB_AGG_VAR_BIL",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PVBAGGVARBIL",s);
    }
  }

  public int PVBGENERAVAR(IDVariant AESERCIZIO, IDVariant AASSESTAMENTO, IDVariant APROVDEF, IDVariant AANNOPRO, IDVariant ANUMEROPRO, IDVariant AUNITAPRO, IDVariant AANNODEL, IDVariant ANUMERODEL, IDVariant ASEDEDEL, IDVariant ADATAREG, IDVariant ANUMVAR)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AASSESTAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROVDEF);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AANNOPRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROPRO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUNITAPRO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ADATAREG);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(ANUMVAR);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("PVB_GENERA_VAR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PVBGENERAVAR",s);
    }
  }

  public int PVBELIMINAVAR(IDVariant AESERCIZIO, IDVariant AASSESTAMENTO, IDVariant ANUMVAR, IDVariant AFLAGVAR)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AASSESTAMENTO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMVAR);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(AFLAGVAR);
    OutPar.add(new Integer(-IDVariant.STRING));
    try
    {
      DBO().CallSP("PVB_ELIMINA_VAR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("PVBELIMINAVAR",s);
    }
  }

  public int GENERADETTAGLIART18(IDVariant AESERCIZIO, IDVariant AANNODIST, IDVariant ANUMERODIST, IDVariant ATIPO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNODIST);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMERODIST);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("GENERA_DETTAGLI_ART18",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERADETTAGLIART18",s);
    }
  }

  public int WORKESTRAZGESTEDL77(IDVariant AESERCIZIO, IDVariant ASEGNO, IDVariant APROGRSESSIONE, IDVariant ADATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEGNO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_ESTRAZ_GEST_E_DL77",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKESTRAZGESTEDL77",s);
    }
  }

  public int WORKESTRAZGESTSDL77(IDVariant AESERCIZIO, IDVariant ASEGNO, IDVariant APROGRSESSIONE, IDVariant ADATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEGNO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_ESTRAZ_GEST_S_DL77",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKESTRAZGESTSDL77",s);
    }
  }

  public int WORKESTRAZPEGECONSDL77(IDVariant AESERCIZIO, IDVariant ASEGNO, IDVariant APROGRSESSIONE, IDVariant ADATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEGNO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_ESTRAZ_PEG_E_CONS_DL77",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKESTRAZPEGECONSDL77",s);
    }
  }

  public int WORKESTRAZPEGSCONSDL77(IDVariant AESERCIZIO, IDVariant ASEGNO, IDVariant APROGRSESSIONE, IDVariant ADATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEGNO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(APROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ADATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_ESTRAZ_PEG_S_CONS_DL77",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKESTRAZPEGSCONSDL77",s);
    }
  }

  public int XMLESTRAZGESTE(IDVariant AESERCIZIO, IDVariant ASEGNO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEGNO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_GEST_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZGESTE",s);
    }
  }

  public int XMLESTRAZELR(IDVariant AESERCIZIO, IDVariant ASEGNO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEGNO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_ELR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZELR",s);
    }
  }

  public int XMLESTRAZGESTS(IDVariant AESERCIZIO, IDVariant ASEGNO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEGNO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_GEST_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZGESTS",s);
    }
  }

  public int XMLESTRAZFDL(IDVariant AESERCIZIO, IDVariant ASEGNO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEGNO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_FDL",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZFDL",s);
    }
  }

  public int XMLESTRAZCTI(IDVariant AESERCIZIO, IDVariant ASEGNO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASEGNO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_CTI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZCTI",s);
    }
  }

  public int XMLESTRAZQGRE(IDVariant AESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_QGRE",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZQGRE",s);
    }
  }

  public int XMLESTRAZQGRS(IDVariant AESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_QGRS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZQGRS",s);
    }
  }

  public int XMLESTRAZQGRD(IDVariant AESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_QGRD",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZQGRD",s);
    }
  }

  public int XMLESTRAZQGCO(IDVariant AESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_QGCO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZQGCO",s);
    }
  }

  public int XMLESTRAZQGFI(IDVariant AESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_QGFI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZQGFI",s);
    }
  }

  public int XMLESTRAZPADF(IDVariant AESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_PADF",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZPADF",s);
    }
  }

  public int XMLESTRAZPCON(IDVariant AESERCIZIO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_PCON",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZPCON",s);
    }
  }

  public int XMLESTRAZCONTOECON(IDVariant AESERCIZIO, IDVariant APERIODO, IDVariant ASESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APERIODO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_CONTO_ECON",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZCONTOECON",s);
    }
  }

  public int XMLESTRAZCONTOPATR(IDVariant AESERCIZIO, IDVariant APERIODO, IDVariant ASESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APERIODO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ASESSIONE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_CONTO_PATR",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZCONTOPATR",s);
    }
  }

  public int XMLESTRAZPS(IDVariant PESERCIZIO, IDVariant PESERCIZIORIF, IDVariant PDATA, IDVariant PDATARIF, IDVariant PTRIMESTRE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIORIF);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PDATARIF);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PTRIMESTRE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_PS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZPS",s);
    }
  }

  public int XMLESTRAZPSISTAT(IDVariant AESERCIZIO, IDVariant ATRIMESTRE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATRIMESTRE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("XML_CORTE_CONTI.XML_ESTRAZ_PS_ISTAT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("XMLESTRAZPSISTAT",s);
    }
  }

  public int WORKSTAMPAEQUILIBRISL(IDVariant PSESSIONE, IDVariant PESERCIZIO, IDVariant PFONTE, IDVariant PDATAELAB, IDVariant PPURO1, IDVariant PVARPURO1, IDVariant PPURO2, IDVariant PVARPURO2, IDVariant PPURO3, IDVariant PVARPURO3, IDVariant PPURO4, IDVariant PVARPURO4, IDVariant PPURO5, IDVariant PVARPURO5, IDVariant PPURO6, IDVariant PVARPURO6, IDVariant PPURO7, IDVariant PVARPURO7, IDVariant PPURO8, IDVariant PVARPURO8, IDVariant PPURO9, IDVariant PVARPURO9, IDVariant PPURO10, IDVariant PVARPURO10, IDVariant PPURO11, IDVariant PVARPURO11, IDVariant P_TIPO_VARIAZIONI, IDVariant P_SEDE_DELIBERA, IDVariant P_NUMERO_DELIBERA, IDVariant P_ANNO_DELIBERA, IDVariant P_UNITA_PROPOSTA, IDVariant P_NUMERO_PROPOSTA, IDVariant P_ANNO_PROPOSTA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PFONTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATAELAB);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PPURO1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARPURO1);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPURO2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARPURO2);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPURO3);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARPURO3);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPURO4);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARPURO4);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPURO5);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARPURO5);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPURO6);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARPURO6);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPURO7);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARPURO7);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPURO8);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARPURO8);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPURO9);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARPURO9);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPURO10);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARPURO10);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPURO11);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PVARPURO11);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_TIPO_VARIAZIONI);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_SEDE_DELIBERA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_NUMERO_DELIBERA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_ANNO_DELIBERA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_UNITA_PROPOSTA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(P_NUMERO_PROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(P_ANNO_PROPOSTA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_STAMPA_EQUILIBRI_SL",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSTAMPAEQUILIBRISL",s);
    }
  }

  public int WORKSTAMPASTORICOEQUISL(IDVariant PSESSIONE, IDVariant PESERCIZIO, IDVariant PIMPORTO11, IDVariant PIMPORTO12, IDVariant PIMPORTO13, IDVariant PIMPORTO14, IDVariant PIMPORTO15, IDVariant PIMPORTO16, IDVariant PIMPORTO21, IDVariant PIMPORTO22, IDVariant PIMPORTO23, IDVariant PIMPORTO24, IDVariant PIMPORTO25, IDVariant PIMPORTO26, IDVariant PIMPORTO31, IDVariant PIMPORTO32, IDVariant PIMPORTO33, IDVariant PIMPORTO34, IDVariant PIMPORTO35, IDVariant PIMPORTO36, IDVariant PIMPORTO41, IDVariant PIMPORTO42, IDVariant PIMPORTO43, IDVariant PIMPORTO44, IDVariant PIMPORTO45, IDVariant PIMPORTO46)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO11);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO12);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO13);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO14);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO15);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO16);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO21);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO22);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO23);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO24);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO25);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO26);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO31);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO32);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO33);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO34);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO35);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO36);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO41);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO42);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO43);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO44);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO45);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PIMPORTO46);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_STAMPA_STORICO_EQUI_SL",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKSTAMPASTORICOEQUISL",s);
    }
  }

  public int STAMPEMENUDELPREFERITO(IDVariant PMODULO, IDVariant PCODICE, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PMODULO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("STAMPE_MENU.DEL_PREFERITO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("STAMPEMENUDELPREFERITO",s);
    }
  }

  public int STAMPEMENUINSPREFERITO(IDVariant PMODULO, IDVariant PCODICE, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PMODULO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PCODICE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("STAMPE_MENU.INS_PREFERITO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("STAMPEMENUINSPREFERITO",s);
    }
  }

  public int AGGRICLPICO2014(IDVariant AESERCIZIO, IDVariant AES, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("AGG_RICL_PICO_2014",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("AGGRICLPICO2014",s);
    }
  }

  public int AGGRICLMOVIAUTO2014(IDVariant AESERCIZIO, IDVariant AES, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AES);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("AGG_RICL_MOVI_AUTO_2014",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("AGGRICLMOVIAUTO2014",s);
    }
  }

  public int AGGCOD52014(IDVariant AESERCIZIO, IDVariant AANNOMOV, IDVariant ANUMEROMOV, IDVariant APROGRBUONO, IDVariant APROGRIMP, IDVariant ATIPOMOV, IDVariant ACODLIV5, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOMOV);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROMOV);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRBUONO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOMOV);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACODLIV5);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("AGG_COD_5_2014",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("AGGCOD52014",s);
    }
  }

  public int AGGCODEUROPEO(IDVariant AESERCIZIO, IDVariant AANNOMOV, IDVariant ANUMEROMOV, IDVariant APROGRBUONO, IDVariant APROGRIMP, IDVariant ATIPOMOV, IDVariant ACODEUROPEO, IDVariant AUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(AESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AANNOMOV);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ANUMEROMOV);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRBUONO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(APROGRIMP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(ATIPOMOV);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(ACODEUROPEO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(AUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("AGG_COD_EUROPEO",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("AGGCODEUROPEO",s);
    }
  }

  public int CompileAll()
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    try
    {
      DBO().CallSP("UTILITYPACKAGE.Compile_All",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CompileAll",s);
    }
  }

  public int WORKBILCONSMONPARBIL(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PDATA, IDVariant PIDSTAMPA, IDVariant PNOTA, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PIDSTAMPA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNOTA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_BIL_CONS_MON_PAR_BIL",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILCONSMONPARBIL",s);
    }
  }

  public int WORKBILPREVVERVINCFP2017(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PANNODEL, IDVariant PNUMERODEL, IDVariant PSEDEDEL, IDVariant PANNOPROP, IDVariant PNUMEROPROP, IDVariant PUNITAPROP, IDVariant PTIPOVAR, IDVariant PDATA, IDVariant PIDSTAMPA, IDVariant PNOTA, IDVariant PUTENTE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    SPPar.add(PIDSTAMPA);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNOTA);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_VER_VINC_FP_2017",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVVERVINCFP2017",s);
    }
  }

  public int WORKBILAGGE(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PANNODEL, IDVariant PNUMERODEL, IDVariant PSEDEDEL, IDVariant PANNOPROP, IDVariant PNUMEROPROP, IDVariant PUNITAPROP, IDVariant PTIPOVAR, IDVariant PDATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_BIL_AGG_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILAGGE",s);
    }
  }

  public int WORKBILAGGS(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE, IDVariant PANNODEL, IDVariant PNUMERODEL, IDVariant PSEDEDEL, IDVariant PANNOPROP, IDVariant PNUMEROPROP, IDVariant PUNITAPROP, IDVariant PTIPOVAR, IDVariant PDATA)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PANNODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMERODEL);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSEDEDEL);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PANNOPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PNUMEROPROP);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUNITAPROP);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PTIPOVAR);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PDATA);
    OutPar.add(new Integer(IDVariant.DATETIME));
    try
    {
      DBO().CallSP("WORK_BIL_AGG_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILAGGS",s);
    }
  }

  public int CFESTRAIDUPLICASELECT(IDVariant PIDSELECT, IDVariant PUTENTEINSERIMENTO, IDVariant PID)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDSELECT);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTEINSERIMENTO);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PID);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CF_ESTRAI.DUPLICA_SELECT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CFESTRAIDUPLICASELECT",s);
    }
  }

  public int CFESTRAILOGESECUZIONI(IDVariant PUTENTE, IDVariant PQUERY, IDVariant PIDSELECT, IDVariant PID, IDVariant TEMPO_ESECUZIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PUTENTE);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PQUERY);
    OutPar.add(new Integer(IDVariant.STRING));
    SPPar.add(PIDSELECT);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PID);
    OutPar.add(new Integer(-IDVariant.DECIMAL));
    SPPar.add(TEMPO_ESECUZIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("CF_ESTRAI.LOG_ESECUZIONI",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CFESTRAILOGESECUZIONI",s);
    }
  }

  public int GETPARAMETRIFROMSELECT(IDVariant PIDSELECT, IDVariant PUTENTEINSERIMENTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDSELECT);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTEINSERIMENTO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CF_ESTRAI.GET_PARAMETRI_FROM_SELECT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GETPARAMETRIFROMSELECT",s);
    }
  }

  public int CFESTRAIIMPORTASELECT(IDVariant PIDSELECT, IDVariant PUTENTEINSERIMENTO)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PIDSELECT);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PUTENTEINSERIMENTO);
    OutPar.add(new Integer(IDVariant.STRING));
    try
    {
      DBO().CallSP("CF_ESTRAI.IMPORTA_SELECT",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("CFESTRAIIMPORTASELECT",s);
    }
  }

  public int GENERATESOBILMPS(IDVariant PESERCIZIO, IDVariant PSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("GENERA_TESO_BIL_MPS",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("GENERATESOBILMPS",s);
    }
  }

  public int WORKBILPREVPEGANNE(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_PEG_ANN_E",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVPEGANNE",s);
    }
  }

  public int WORKBILPREVPEGANNS(IDVariant PESERCIZIO, IDVariant PPROGRSESSIONE)
  {
    LinkedList SPPar  = new LinkedList();
    LinkedList OutPar = new LinkedList();

    ClearErrors();
    SPPar.add(PESERCIZIO);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    SPPar.add(PPROGRSESSIONE);
    OutPar.add(new Integer(IDVariant.DECIMAL));
    try
    {
      DBO().CallSP("WORK_BIL_PREV_PEG_ANN_S",SPPar,OutPar);
      return 0;
    }
    catch(SQLException s)
    {
      return SetError("WORKBILPREVPEGANNS",s);
    }
  }

  
}
