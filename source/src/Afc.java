// **********************************************
// Afc
// Project : Cfa
// **********************************************

import com.progamma.*;
import com.progamma.is.*;
import com.progamma.ws.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;
import java.math.*;

public class Afc extends com.progamma.doc.IDDocument
{  
  private MyWebEntryPoint MainFrm;
  private IMDBObj IMDB;
  private static String ClassName = null;

  // Property constant definitions
  public static int AFC_PROGETTO = 1;
  public static int AFC_ISTANZA = 2;
  public static int AFC_UTENTE = 3;
  public static int AFC_USERORACLE = 4;
  public static int AFC_ENTE = 5;
  public static int AFC_HEADEMENUBAR = 6;
  public static int AFC_HEADERNOTE = 7;
  public static int AFC_HEADERNEWMSG = 8;
  public static int AFC_RUOLO = 9;
  public static int MAX_VARS = 9;
  public static int BASE_VARS = 0;
  public static int BASE_COLLS = 0;

  // Definition of Global Variables
  private IDVariant TIPOLOERRORE = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant ABILITAZINFO = new IDVariant(0,IDVariant.STRING);
  private IDVariant MODULO = new IDVariant(0,IDVariant.STRING);
  public IDVariant getPROGETTO() { return GetPropDirect(AFC_PROGETTO); }
  public void setPROGETTO(IDVariant NewValue) { ChangePropDirect(AFC_PROGETTO,NewValue,false); }
  public IDVariant getISTANZA() { return GetPropDirect(AFC_ISTANZA); }
  public void setISTANZA(IDVariant NewValue) { ChangePropDirect(AFC_ISTANZA,NewValue,false); }
  public IDVariant getUTENTE() { return GetPropDirect(AFC_UTENTE); }
  public void setUTENTE(IDVariant NewValue) { ChangePropDirect(AFC_UTENTE,NewValue,false); }
  public IDVariant getUSERORACLE() { return GetPropDirect(AFC_USERORACLE); }
  public void setUSERORACLE(IDVariant NewValue) { ChangePropDirect(AFC_USERORACLE,NewValue,false); }
  public IDVariant getENTE() { return GetPropDirect(AFC_ENTE); }
  public void setENTE(IDVariant NewValue) { ChangePropDirect(AFC_ENTE,NewValue,false); }
  public IDVariant getHEADEMENUBAR() { return GetPropDirect(AFC_HEADEMENUBAR); }
  public void setHEADEMENUBAR(IDVariant NewValue) { ChangePropDirect(AFC_HEADEMENUBAR,NewValue,false); }
  public IDVariant getHEADERNOTE() { return GetPropDirect(AFC_HEADERNOTE); }
  public void setHEADERNOTE(IDVariant NewValue) { ChangePropDirect(AFC_HEADERNOTE,NewValue,false); }
  public IDVariant getHEADERNEWMSG() { return GetPropDirect(AFC_HEADERNEWMSG); }
  public void setHEADERNEWMSG(IDVariant NewValue) { ChangePropDirect(AFC_HEADERNEWMSG,NewValue,false); }
  public IDVariant getRUOLO() { return GetPropDirect(AFC_RUOLO); }
  public void setRUOLO(IDVariant NewValue) { ChangePropDirect(AFC_RUOLO,NewValue,false); }
    
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
  }

  // IMDB DDL Procedures
    
    
  // **********************************************
  // Initialize common framework object
  // **********************************************
  public Afc()
  {
  }

  // **********************************************
  // Initialize common framework object
  // **********************************************
  public Afc(MyWebEntryPoint w, IMDBObj imdb)
  {
    if (w != null)
      SetMainFrm(w, imdb);
  }
  
  public void SetMainFrm(Object mainfrm, Object imdb)
  {
    boolean IMDBChanged = (imdb != null && (IMDB == null || ((IMDBObj)imdb).DBSize() > IMDB.DBSize()));
    //
    if (MainFrm == null || IMDBChanged)
    {
      if (MainFrm==null)
	      MainFrm=(MyWebEntryPoint)mainfrm;
      IMDB=(IMDBObj)imdb;
      //
      if (aVars==null)
      {
        aVars = new IDVariant[MAX_VARS+BASE_VARS];
        MyMDOInit.Initialize(this);
      }
      //
      //
      DOMDObj MD = GetMD();
      for (int i = 1; i <= MD.GetNumColl(); i++)
      {
        IDCollection c = GetCollByIndex(i);
        c.set_MainFrm(MainFrm);
        c.set_imdb(imdb);
      }
      //
      // Ridefinisco mainfrm e imdb prendendo quelli giusti per la classe base prima di passarglielo
      //
      super.SetMainFrm(mainfrm,imdb);
    }
  }

  public Object GetMainFrm()
  {
    return MainFrm;
  }

  public IDDocHelper GetDocHelper()
  {
    if (MainFrm != null)
      return MainFrm.DocHelper;
    else
      return null;
  }

  public Object GetIMDB()
  {
    return IMDB;
  }

  public void RefreshUI()
  {
    if (MainFrm != null)
      MainFrm.set_RefreshUI(true);
  }
   
  public LinkedList GetLookupCache()
  {
    if (MainFrm != null)
      return MainFrm.LookupCache;
    else
      return null;
  }

  public LinkedList GetModifiedList()
  {
    if (MainFrm != null)
      return MainFrm.DOModifiedList;
    else
      return null;
  }
  
  public HashMap GetSchemaCache()
  {
    if (MainFrm != null)
      return MainFrm.SchemaCache;
    else
      return null;
  }
    
    
  // **********************************************
  // Get Database Connection (if not Meta Data Connected)
  // **********************************************
  public IDConnection GetDBObj(boolean Open)
  {
    try
    {
    }
    catch(Exception e)
    {
    }
    return super.GetDBObj(Open);
  }
  
  // **********************************************
  // Get Meta Data
  // **********************************************
  private static DOMDObj MDOAfc;
  public synchronized static DOMDObj GetDOMD_Afc()
  {
    DOMDProp MDP;
    DOMDColl MDC;
    DOMDLinkedDoc DOC;

    if (MDOAfc != null)
      return MDOAfc;
    else
      MDOAfc = new DOMDObj();
    MDOAfc.ObjTag = "Afc";
    MDOAfc.ObjGUID = "FCEAE394-B55F-4B33-BC5B-3155172FC172";
    MDOAfc.UIName = "Afc";
    MDOAfc.Services = 0;
    MDOAfc.BaseProps = 0;
    MDOAfc.BaseColls = 0;
    MDOAfc.SetNumProp(9);
    MDP = new DOMDProp();
    MDOAfc.SetProp(1,MDP);
    MDP.Index = 1;
    MDP.ObjTag = "PROGETTO";
    MDP.Name = "Progetto";
    MDP.UIName = "Progetto";
    MDP.GUID = "423C3B12-2B0A-4437-B0AE-A400FA45871D";
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOAfc.SetProp(2,MDP);
    MDP.Index = 2;
    MDP.ObjTag = "ISTANZA";
    MDP.Name = "Istanza";
    MDP.UIName = "Istanza";
    MDP.GUID = "71E2582E-88B7-4C80-9EA6-1E251B598340";
    MDP.DataType = 5;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOAfc.SetProp(3,MDP);
    MDP.Index = 3;
    MDP.ObjTag = "UTENTE";
    MDP.Name = "Utente";
    MDP.UIName = "Utente";
    MDP.GUID = "D9AB9E9F-8461-4A12-9720-759E869CC4BE";
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOAfc.SetProp(4,MDP);
    MDP.Index = 4;
    MDP.ObjTag = "USERORACLE";
    MDP.Name = "UserOracle";
    MDP.UIName = "User Oracle";
    MDP.GUID = "DC96A858-5893-49C1-844A-452383B57FDF";
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOAfc.SetProp(5,MDP);
    MDP.Index = 5;
    MDP.ObjTag = "ENTE";
    MDP.Name = "Ente";
    MDP.UIName = "Ente";
    MDP.GUID = "9364D0B3-77D6-42BB-A3E1-1F1A6D69B893";
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOAfc.SetProp(6,MDP);
    MDP.Index = 6;
    MDP.ObjTag = "HEADEMENUBAR";
    MDP.Name = "HeaderMenuBar";
    MDP.UIName = "Header Menu Bar";
    MDP.GUID = "494BAF08-C801-44EF-9C2F-5151CF5FBA1F";
    MDP.DataType = 5;
    MDP.MaxLength = 32000;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOAfc.SetProp(7,MDP);
    MDP.Index = 7;
    MDP.ObjTag = "HEADERNOTE";
    MDP.Name = "HeaderNote";
    MDP.UIName = "Header Note";
    MDP.GUID = "37208965-7C13-46BB-A4A2-BBA620C5FB4C";
    MDP.DataType = 5;
    MDP.MaxLength = 2000;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOAfc.SetProp(8,MDP);
    MDP.Index = 8;
    MDP.ObjTag = "HEADERNEWMSG";
    MDP.Name = "HeaderNewMSG";
    MDP.UIName = "Header New MSG";
    MDP.GUID = "5218A974-C996-4F03-B252-6578B1C87794";
    MDP.DataType = 5;
    MDP.MaxLength = 2000;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOAfc.SetProp(9,MDP);
    MDP.Index = 9;
    MDP.ObjTag = "RUOLO";
    MDP.Name = "Ruolo";
    MDP.UIName = "Ruolo";
    MDP.GUID = "F13E1585-B78B-43A5-9C66-0868A1574D9D";
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDOAfc.SetNumColl(0);
    return MDOAfc;
  }

  public DOMDObj GetMD()
  {
    DOMDObj md = GetDOMD_Afc();
    IOTConnector.InitMetadata(GetMainFrm(), md);
    return md;
  }
  
  // **********************************************
  // Get Meta Data By Name (tutte le classi...)
  // **********************************************
  public DOMDObj GetMD(String ClassName)
  {
    try
    {
      return MyMDOInit.GetMetaData(ClassName);
    }
    catch(Exception e)
    {
      System.err.println(e);
      return null;
    }
  }

  // **********************************************
  // Get Meta Data By Name (tutte le classi...)
  // **********************************************
  public IDDocument CreateDocument(String ClassName)
  {
    try
    {
      IDDocument d = MyMDOInit.CreateDocument(ClassName);
      if (d == null && MainFrm != null)
        d = MainFrm.CreateDocument(ClassName);
      d.SetMainFrm(MainFrm, IMDB);
      return d;
    }
    catch(Exception e)
    {
      System.err.println(e);
      return null;
    }
  }
  
  // **********************************************
  // Init Default Values
  // **********************************************
  public void InitDefaults()
  {
    super.InitDefaults();
  }
  public void Init() throws Exception
  {
    InitDefaults();
    MDOInit.Init(this);
  }
  
    
  // **********************************************
  // Set Property By Index
  // **********************************************
  public void SetPropByIndex(int Idx, IDVariant NewValue)
  {
    fine:
    {
      if (Idx==AFC_PROGETTO) { setPROGETTO(NewValue); break fine; }
      if (Idx==AFC_ISTANZA) { setISTANZA(NewValue); break fine; }
      if (Idx==AFC_UTENTE) { setUTENTE(NewValue); break fine; }
      if (Idx==AFC_USERORACLE) { setUSERORACLE(NewValue); break fine; }
      if (Idx==AFC_ENTE) { setENTE(NewValue); break fine; }
      if (Idx==AFC_HEADEMENUBAR) { setHEADEMENUBAR(NewValue); break fine; }
      if (Idx==AFC_HEADERNOTE) { setHEADERNOTE(NewValue); break fine; }
      if (Idx==AFC_HEADERNEWMSG) { setHEADERNEWMSG(NewValue); break fine; }
      if (Idx==AFC_RUOLO) { setRUOLO(NewValue); break fine; }
      super.SetPropByIndex(Idx, NewValue); break fine;
    }
  }
  
  
  // **********************************************
  // Get Collection By Index
  // **********************************************
  public IDCollection GetCollByIndex(int Idx)
  {
    return super.GetCollByIndex(Idx);
  }
  
  
  // **********************************************
  // Get Master Query used to load a document
  // **********************************************
  public void GetMasterQuery(String SqlText[], IDVariant MasterTableAlias, LinkedList ColAssignment)
  {
    StringBuffer SQL;
    
  }


  // **********************************************
  // Get Value Source Query used to load a collection
  // **********************************************
  public void GetValueSource(IDVariant SQLStmt, LinkedList ColAssignment, IDCollection Coll, IDDocument DummyDoc)
  {
    StringBuffer SQL;
    String[] SqlText = new String[6];

    //
    if (SqlText[0]==null)
    {
      // Ask to base class
      super.GetValueSource(SQLStmt, ColAssignment, Coll, DummyDoc);
      return;
    }
    //
    SQL = new StringBuffer();
    for (int i=0;i<6;i++)
    {
      if (SqlText[i]==null)
        continue;
      //
      SQL.append(SqlText[i]);
      if (i == Glb.SQL_WHERE)
      {
        // Fire OnSQL Event...
        IDVariant AddWC = new IDVariant();
        DummyDoc.OnSQLQuery(new IDVariant(SQL.toString()), new IDVariant(MDOInit.QRY_LOADCOLLECTION), AddWC);
        if (AddWC.stringValue().length()>0)
        {
          if (SqlText[i].length() == 0)
            SQL.append(" where ");
          else
            SQL.append(" and ");
          SQL.append(AddWC);
        }
      }
    }
    SQLStmt.set(new IDVariant(SQL.toString()));
  }
  

  // **********************************************
  // Document validation
  // **********************************************
  public void InternalValidate(int Reason, IDVariant bError)
  {
    MDOInit.InternalValidate(this, Reason, bError);
  }

  
  // **********************************************
  // Get DB Expression used to load a property
  // **********************************************
  public String GetDBExpr(int PropIdx)
  {
    StringBuffer SQL;
    
    return "";
  } 


  // **********************************************
  // Class factory
  // **********************************************
  public static Afc CreateAfc()
  {
    return CreateAfc(null, null);
  }
  
  public static Afc CreateAfc(Object mainfrm, Object imdb) { return CreateAfc(mainfrm, imdb, null); } 
  public static Afc CreateAfc(Object mainfrm, Object imdb, Object mainfrmCF)
  {
    Afc newobj = null;
    //
    // Creating object
    if (ClassName == null)
      newobj = new Afc((MyWebEntryPoint)mainfrm, (IMDBObj)imdb); // No class factory
    else
    {
      if (mainfrm == null)
        mainfrm = mainfrmCF;
      //
      if (mainfrm != null)
      {
        IWebEntryPoint app = ((IWebEntryPoint)mainfrm).GetApplication();
        if (ClassName.lastIndexOf('.') == -1)
        {
          // Classe senza namespace: faccio creare l'istanza alla applicazione
          // La CreateDocument già chiama la SetMainFrm
          newobj = (Afc)app.CreateDocument(ClassName);
        }
        else
        {
          // Classe con namespace: faccio creare l'istanza al componente corrispondente
          String CompNameSpace = ClassName.substring(0, ClassName.lastIndexOf('.'));
          com.progamma.is.WebEntryPoint cmp = app.GetCompFromNameSpace(CompNameSpace);
          if (cmp != null)
            newobj = (Afc)cmp.CreateDocument(ClassName.substring(ClassName.lastIndexOf('.') + 1));
          else
          {
            app.getDTTObj().AddMsg(DTTEngine.DTTMSG_ERROR, "", 191, "CreateAfc", 
                  "Can't find component " + CompNameSpace + " while handling Afc class factory");
            app.getDTTObj().AddParameter("", "", "ClassName", ClassName);
          }
        }
      }
    }
    //
    return newobj;
  }

  public static synchronized void SetClassName(String cn)
  {
    ClassName = cn;
  }

  // **********************************************
  // Definizione Concept di proprietà a run-time
  // **********************************************
  public static void SetPropertyConcept(IDVariant PropIdx, IDVariant Concept)
  {
    DOMDObj MD = GetDOMD_Afc();
    DOMDProp MPR = MD.GetProp(PropIdx.intValue());
    synchronized (MPR)
    {
      MPR.Concept = Concept.stringValue();
    }
  }

  //***************************************************************************
  // Mostra questo documento nell'interfaccia utente, ritorna la form aperta
  // Questa funzione deve essere qui altrimenti la NEWINSTANCE non
  // riesce a creare la form per nome
  //***************************************************************************
  public WebForm Show(int OpenAs)
  {
    DOMDObj MD = GetMD();
    IDVariant ClassName = new IDVariant(MD.FormName);
    OnShow(ClassName);
    //
    // Se ho un classname...
    if (ClassName.stringValue().length()>0)    
    {
      return WebForm.NewInstance((com.progamma.is.WebEntryPoint)GetMainFrm(), (IMDBObj)GetIMDB(), ClassName.stringValue(), OpenAs, this);
    }
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Afc);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Afc.class.getName() : (Glb.ClassWithPackage(Afc.class) ? Afc.class.getName().substring(Afc.class.getPackage().getName().length() + 1) : Afc.class.getName()));
  }
  
  // **********************************************
  // Event Stubs
  // **********************************************  

  
  // **********************************************
  // Procedure Definition
  // **********************************************
  
  // **********************************************************************
  // Messaggio Di Errore
  // Restituisce il messaggio contenuto in descrizione errore
  // a seconda del parametro passato o in assenza del parametro
  // andando a leggere sui registri la scelta fatta per
  // l'ambiente
  // Descrizione Errore: What data are you passing to the procedure? - Input
  // Modulo: Codice Modulo - Input
  // Parametro - Optional - Input
  // **********************************************************************
  public int MessaggioDiErrore (IDVariant DescrizioneErrore, IDVariant Modulo, IDVariant Parametro)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Messaggio Di Errore Body
      // Procedure Body
      // 
      if (IDL.IsNull(Parametro) && IDL.IsNull(TIPOLOERRORE))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  TRUNC(TO_NUMBER(NVL(AMVWEB.GET_PREFERENZA('Messaggi errore'," + IDL.CSql(Modulo, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ",NULL), TO_CHAR ( 3 )))) as TINVAGPMEMTS ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          Parametro = QV.Get("TINVAGPMEMTS", IDVariant.INTEGER);
        }
        QV.Close();
        TIPOLOERRORE = new IDVariant(Parametro);
      }
      else
      {
        if (IDL.IsNull(Parametro))
        {
          Parametro = new IDVariant(TIPOLOERRORE);
        }
      }
      if (Parametro.equals((new IDVariant(1)), true))
      {
        MainFrm.ErrObj.ShowMessage ((new IDVariant("")).stringValue(), (new IDVariant(0)).intValue(), DescrizioneErrore.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(0)).booleanValue(), (new IDVariant(0)).booleanValue()); 
      }
      else
      {
        if (Parametro.equals((new IDVariant(2)), true))
        {
          MainFrm.set_AlertMessage(DescrizioneErrore); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "MessaggioDiErrore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Get Comando
  // Restituisce il nome del comando da richiamare: da utilizzare
  // quando si richiama una fase che ha delle personalizzazioni
  // per cliente
  // Modulo: What data are you passing to the procedure? - Input
  // Comando Standard: Nome del comando standard - Input
  // **********************************************************************
  public IDVariant GetComando (IDVariant Modulo, IDVariant ComandoStandard)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COMANDAESEGU = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PERSONTROVAT = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Get Comando Body
      // Procedure Body
      // 
      // 
      // Cerco se esiste la personalizzazione della fase
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PERSONALIZZAZIONE as PERSONPERSON ");
      SQL.append("from ");
      SQL.append("  AD4_PERSONALIZZAZIONI A ");
      SQL.append("where (A.WINDOW = " + IDL.CSql(ComandoStandard, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ENTE = " + IDL.CSql(getENTE(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (UPPER(A.MODULO) = UPPER(" + IDL.CSql(Modulo, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      v_PERSONTROVAT = (QV.RecordCount()!=0 ? IDVariant.TRUE : IDVariant.FALSE);
      if (!QV.EOF())
      {
        v_COMANDAESEGU = QV.Get("PERSONPERSON", IDVariant.STRING) ;
      }
      QV.Close();
      if (!(v_PERSONTROVAT.booleanValue()))
      {
        v_COMANDAESEGU = new IDVariant(ComandoStandard);
      }
      return v_COMANDAESEGU;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "GetComando", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // On Init Event
  // Notificato quando il documento è in fase di inizializzazione
  // **********************************************************************
  public void OnInit()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // On Init Event Body
      // Procedure Body
      // 
      setISTANZA(IDL.NullValue(new IDVariant((String)MainFrm.Request.getSession().getAttribute("Istanza")),(new IDVariant("CF4FDTEST"))));
      setUTENTE(IDL.Upper(IDL.NullValue(new IDVariant((String)MainFrm.Request.getSession().getAttribute("Utente")),(new IDVariant("FDTEST")))));
      setENTE((new IDVariant("ADDP")));
      MODULO = IDL.NullValue(new IDVariant((String)MainFrm.Request.getSession().getAttribute("Modulo")),(new IDVariant("CFA")));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  C.PROGETTO as PROGETTO, ");
      SQL.append("  C.USER_ORACLE as USERORACLE, ");
      SQL.append("  C.ENTE as ENTE, ");
      SQL.append("  A.RUOLO as DIRIACCERUOL ");
      SQL.append("from ");
      SQL.append("  AD4_DIRITTI_ACCESSO A, ");
      SQL.append("  AD4_UTENTI B, ");
      SQL.append("  AD4_ISTANZE C ");
      SQL.append("where (C.ISTANZA = " + IDL.CSql(getISTANZA(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.UTENTE = " + IDL.CSql(getUTENTE(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ISTANZA = C.ISTANZA) ");
      SQL.append("and   (A.UTENTE = B.UTENTE) ");
      SQL.append("and   (A.MODULO = " + IDL.CSql(MODULO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        setPROGETTO (QV.Get("PROGETTO", IDVariant.STRING));
        setUSERORACLE (QV.Get("USERORACLE", IDVariant.STRING));
        setENTE (QV.Get("ENTE", IDVariant.STRING));
        setRUOLO (QV.Get("DIRIACCERUOL", IDVariant.STRING));
      }
      QV.Close();
      TIPOLOERRORE = (new IDVariant());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "OnInitEvent", _e);
    }
  }

  // **********************************************************************
  // Get Tipo Segnalazione
  // Explain which processing is carried out by this procedure
  // Stringa - Input
  // Modulo: Codice Modulo - Input
  // **********************************************************************
  public IDVariant GetTipoSegnalazione (IDVariant Stringa, IDVariant Modulo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PARAMETRO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Get Tipo Segnalazione Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(AMVWEB.GET_PREFERENZA(" + IDL.CSql(Stringa, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(Modulo, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ",NULL), TO_CHAR ( 3 )) as NUVAAGPSMTSC ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PARAMETRO = QV.Get("NUVAAGPSMTSC", IDVariant.STRING) ;
      }
      QV.Close();
      return v_PARAMETRO;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "GetTipoSegnalazione", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Get Registro
  // Se non trova la stringa selezionata ritorna null
  // Stringa: What data are you passing to the procedure? - Input
  // Modulo: Codice Modulo - Input
  // **********************************************************************
  public IDVariant GetRegistro (IDVariant Stringa, IDVariant Modulo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PARAMETRO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Get Registro Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  AMVWEB.GET_PREFERENZA(" + IDL.CSql(Stringa, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(Modulo, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ",NULL) as AMVGETPRSTMO ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PARAMETRO = QV.Get("AMVGETPRSTMO", IDVariant.STRING) ;
      }
      QV.Close();
      return v_PARAMETRO;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "GetRegistro", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Set Registro
  // Explain which processing is carried out by this procedure
  // Stringa: What data are you passing to the procedure? - Input
  // Modulo: What data are you passing to the procedure? - Input
  // Commento: What data are you passing to the procedure? - Input
  // Valore: What data are you passing to the procedure? - Input
  // **********************************************************************
  public int SetRegistro (IDVariant Stringa, IDVariant Modulo, IDVariant Commento, IDVariant Valore)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Set Registro Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = 'PRODUCTS' || '/' || " + IDL.CSql(Modulo, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.STRINGA = " + IDL.CSql(Stringa, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      // 
      // se la chiave/stringa non e' presente
      // 
      if (v_CONTA.equals((new IDVariant(0)), true))
      {
        // 
        // inserisco la chiave/stringa
        // 
        SQL = new StringBuffer();
        SQL.append("insert into REGISTRO ");
        SQL.append("( ");
        SQL.append("  CHIAVE, ");
        SQL.append("  STRINGA, ");
        SQL.append("  COMMENTO, ");
        SQL.append("  VALORE ");
        SQL.append(") ");
        SQL.append("values ");
        SQL.append("( ");
        SQL.append("  'PRODUCTS' || '/' || " + IDL.CSql(Modulo, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  " + IDL.CSql(Stringa, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  " + IDL.CSql(Commento, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  " + IDL.CSql(Valore, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
        SQL.append(") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      else
      {
        // 
        // modifico la chiave/stringa trovata
        // 
        SQL = new StringBuffer();
        SQL.append("update REGISTRO set ");
        SQL.append("  COMMENTO = " + IDL.CSql(Commento, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  VALORE = " + IDL.CSql(Valore, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
        SQL.append("where (STRINGA = " + IDL.CSql(Stringa, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (CHIAVE = 'PRODUCTS' || '/' || " + IDL.CSql(Modulo, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "SetRegistro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Get Header
  // Restituisce i valori che devono essere inseriti nell
  // header della procedura, se non trova la riga sul registro
  // restituisce un valore di default
  // Nome Oggetto - Input
  // Modulo - Input
  // **********************************************************************
  public IDVariant GetHeader (IDVariant NomeOggetto, IDVariant Modulo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RITORNO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_POSIZIONE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Get Header Body
      // Procedure Body
      // 
      if (NomeOggetto.equals((new IDVariant("MenuBar")), true))
      {
        v_RITORNO = new IDVariant(getHEADEMENUBAR());
      }
      else
      {
        if (NomeOggetto.equals((new IDVariant("Oggi")), true))
        {
          v_RITORNO = IDL.Add(GetGiorno(IDL.Today()), IDL.Add((new IDVariant(",")), IDL.Add((new IDVariant(" ")), IDL.Add(IDL.ToString(IDL.Day(IDL.Today())), IDL.Add((new IDVariant(" ")), IDL.Add(GetMese(IDL.Today()), IDL.Add((new IDVariant(" ")), IDL.Add(IDL.ToString(IDL.Year(IDL.Today())), IDL.Add((new IDVariant(" ")), IDL.Add(IDL.FillLR(IDL.ToString(IDL.Hour(IDL.Time())), (new IDVariant(2)), (new IDVariant("0")), true), IDL.Add((new IDVariant(":")), IDL.FillLR(IDL.ToString(IDL.Minute(IDL.Time())), (new IDVariant(2)), (new IDVariant("0")), true))))))))))));
        }
        else
        {
          if (NomeOggetto.equals((new IDVariant("Note")), true))
          {
            v_RITORNO = new IDVariant(getHEADERNOTE());
          }
          else
          {
            if (NomeOggetto.equals((new IDVariant("New MSG")), true))
            {
              v_RITORNO = new IDVariant(getHEADERNEWMSG());
            }
            else
            {
              v_RITORNO = GetRegistro(NomeOggetto, Modulo);
              if (IDL.NullValue(v_RITORNO,(new IDVariant(""))).equals((new IDVariant("")), true))
              {
                if (NomeOggetto.equals((new IDVariant("Welcome")), true))
                {
                  v_RITORNO = IDL.Add((new IDVariant("Buongiorno, sei connesso come")), (new IDVariant(" ")));
                }
                if (NomeOggetto.equals((new IDVariant("Logo dx")), true))
                {
                  v_RITORNO = (new IDVariant("logo_dx.jpg"));
                }
                if (NomeOggetto.equals((new IDVariant("Logo sx")), true))
                {
                  v_RITORNO = (new IDVariant("logo_sx.jpg"));
                }
                if (NomeOggetto.equals((new IDVariant("Intestazione")), true))
                {
                  v_RITORNO = (new IDVariant(" "));
                }
              }
              else
              {
                if (v_RITORNO.compareTo((new IDVariant(" ")), true)!=0)
                {
                  if (NomeOggetto.equals((new IDVariant("Welcome")), true))
                  {
                    v_POSIZIONE = IDL.Sub(IDL.Length(v_RITORNO), (new IDVariant(1)));
                    v_POSIZIONE = IDL.Find(v_RITORNO, (new IDVariant("&")), v_POSIZIONE);
                    if (v_POSIZIONE.compareTo((new IDVariant(0)), true)>0)
                    {
                      v_RITORNO = IDL.SubStr(v_RITORNO, (new IDVariant(1)), IDL.Sub(v_POSIZIONE, (new IDVariant(1))));
                    }
                    v_RITORNO = IDL.Add(v_RITORNO, IDL.Add((new IDVariant(" ")), getUTENTE()));
                  }
                  if (NomeOggetto.equals((new IDVariant("Logo dx")), true))
                  {
                    v_RITORNO = IDL.Add((new IDVariant("<img src=")), IDL.Add(v_RITORNO, IDL.Add((new IDVariant(" ")), (new IDVariant("alt=\"\">")))));
                  }
                  if (NomeOggetto.equals((new IDVariant("Logo sx")), true))
                  {
                    v_RITORNO = IDL.Add((new IDVariant("<img src=")), IDL.Add(v_RITORNO, IDL.Add((new IDVariant(" ")), (new IDVariant("alt=\"\">")))));
                  }
                }
              }
            }
          }
        }
      }
      return v_RITORNO;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "GetHeader", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Get Mese
  // Prende in input la data e restituisce la descrizione
  // estesa del mese in italiano
  // Data - Input
  // **********************************************************************
  public IDVariant GetMese (IDVariant Data)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MESE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RITORNO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Get Mese Body
      // Procedure Body
      // 
      v_MESE = IDL.Month(Data);
      if (v_MESE.equals((new IDVariant(1)), true))
      {
        v_RITORNO = (new IDVariant(1));
      }
      if (v_MESE.equals((new IDVariant(2)), true))
      {
        v_RITORNO = (new IDVariant(2));
      }
      if (v_MESE.equals((new IDVariant(3)), true))
      {
        v_RITORNO = (new IDVariant(3));
      }
      if (v_MESE.equals((new IDVariant(4)), true))
      {
        v_RITORNO = (new IDVariant(4));
      }
      if (v_MESE.equals((new IDVariant(5)), true))
      {
        v_RITORNO = (new IDVariant(5));
      }
      if (v_MESE.equals((new IDVariant(6)), true))
      {
        v_RITORNO = (new IDVariant(6));
      }
      if (v_MESE.equals((new IDVariant(7)), true))
      {
        v_RITORNO = (new IDVariant(7));
      }
      if (v_MESE.equals((new IDVariant(8)), true))
      {
        v_RITORNO = (new IDVariant(8));
      }
      if (v_MESE.equals((new IDVariant(9)), true))
      {
        v_RITORNO = (new IDVariant(9));
      }
      if (v_MESE.equals((new IDVariant(10)), true))
      {
        v_RITORNO = (new IDVariant(10));
      }
      if (v_MESE.equals((new IDVariant(11)), true))
      {
        v_RITORNO = (new IDVariant(11));
      }
      if (v_MESE.equals((new IDVariant(12)), true))
      {
        v_RITORNO = (new IDVariant(12));
      }
      return IDL.ToString(v_RITORNO);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "GetMese", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Get Giorno
  // Prende in input la data e restituisce la descrizione
  // estesa del giorno in italiano
  // Data - Input
  // **********************************************************************
  public IDVariant GetGiorno (IDVariant Data)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_GIORNO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RITORNO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Get Giorno Body
      // Procedure Body
      // 
      v_GIORNO = IDL.WeekDay(Data);
      if (v_GIORNO.equals((new IDVariant(1)), true))
      {
        v_RITORNO = (new IDVariant("Domenica"));
      }
      if (v_GIORNO.equals((new IDVariant(2)), true))
      {
        v_RITORNO = (new IDVariant("Lunedi"));
      }
      if (v_GIORNO.equals((new IDVariant(3)), true))
      {
        v_RITORNO = (new IDVariant("Martedi"));
      }
      if (v_GIORNO.equals((new IDVariant(4)), true))
      {
        v_RITORNO = (new IDVariant("Mercoledi"));
      }
      if (v_GIORNO.equals((new IDVariant(5)), true))
      {
        v_RITORNO = (new IDVariant("Giovedi"));
      }
      if (v_GIORNO.equals((new IDVariant(6)), true))
      {
        v_RITORNO = (new IDVariant("Venerdi"));
      }
      if (v_GIORNO.equals((new IDVariant(7)), true))
      {
        v_RITORNO = (new IDVariant("Sabato"));
      }
      return v_RITORNO;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "GetGiorno", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Get Error DB
  // Restituisce "pulito" l'errore del DB
  // Segnalazione: Segnalazione di Errore proveniente dal DB - Input
  // **********************************************************************
  public IDVariant GetErrorDB (IDVariant Segnalazione)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RITORNO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Get Error DB Body
      // Procedure Body
      // 
      v_RITORNO = IDL.SubStr(IDL.Left(Segnalazione, IDL.Sub(IDL.Find(Segnalazione, (new IDVariant("ORA-")), (new IDVariant(10))), (new IDVariant(1)))), (new IDVariant(11)));
      return v_RITORNO;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "GetErrorDB", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Get Abilitazione
  // Restituisce il nome del comando da richiamare se l
  // utente è abilitato
  // Modulo: What data are you passing to the procedure? - Input
  // Comando: Nome del comando - Input
  // **********************************************************************
  public IDVariant GetAbilitazione (IDVariant Modulo, IDVariant Comando)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COMANDAESEGU = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Get Abilitazione Body
      // Procedure Body
      // 
      // 
      // verifico se l'utente e' abilitato alla fase
      // verifico se l'utente e' abilitato alla fase
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  AD4_DISABILITAZIONI A ");
      SQL.append("where (A.WINDOW = " + IDL.CSql(Comando, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.MODULO = " + IDL.CSql(Modulo, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.RUOLO = " + IDL.CSql(getRUOLO(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      // 
      // l'utente a' abilitato
      // 
      if (v_CONTA.equals((new IDVariant(0)), true))
      {
        v_COMANDAESEGU = new IDVariant(Comando);
      }
      return v_COMANDAESEGU;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "GetAbilitazione", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Numero Pulsanti Di Menu
  // Explain which processing is carried out by this procedure
  // Voce Menu Padre - Input
  // **********************************************************************
  public IDVariant NumeroPulsantiDiMenu (IDVariant VoceMenuPadre)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMEROVOCI = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Numero Pulsanti Di Menu Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  AMV_ABILITAZIONI A, ");
      SQL.append("  AMV_VOCI B ");
      SQL.append("where B.VOCE = A.VOCE_MENU ");
      SQL.append("and   (A.VOCE_MENU IN ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  C.VOCE ");
      SQL.append("from ");
      SQL.append("  AMV_VOCI C ");
      SQL.append("where (C.TIPO = 'A') ");
      SQL.append(")) ");
      SQL.append("and   (A.PADRE = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  D.ABILITAZIONE ");
      SQL.append("from ");
      SQL.append("  AMV_ABILITAZIONI D, ");
      SQL.append("  AMV_VOCI E ");
      SQL.append("where E.VOCE = D.VOCE_MENU ");
      SQL.append("and   (E.VOCE = " + IDL.CSql(VoceMenuPadre, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (D.RUOLO = '*') ");
      SQL.append(")) ");
      SQL.append("and   (A.RUOLO = " + IDL.CSql(getRUOLO(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMEROVOCI = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      return v_NUMEROVOCI;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "NumeroPulsantiDiMenu", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Totale Numero Voci Abilitate Per Progetto
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant TotaleNumeroVociAbilitatePerProgetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMEROVOCI = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Totale Numero Voci Abilitate Per Progetto Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  AMV_ABILITAZIONI A, ");
      SQL.append("  AMV_VOCI B ");
      SQL.append("where B.VOCE = A.VOCE_MENU ");
      SQL.append("and   (A.VOCE_MENU IN ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  C.VOCE ");
      SQL.append("from ");
      SQL.append("  AMV_VOCI C ");
      SQL.append("where (C.TIPO = 'A') ");
      SQL.append(")) ");
      SQL.append("and   (A.RUOLO = " + IDL.CSql(getRUOLO(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.MODULO = " + IDL.CSql(MODULO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMEROVOCI = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      return v_NUMEROVOCI;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "TotaleNumeroVociAbilitatePerProgetto", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Voce Pulsante
  // Explain which processing is carried out by this procedure
  // Numero Pulsante - Input
  // Nome Voce - Input/Output
  // Nome Comando - Input/Output
  // **********************************************************************
  public int VocePulsante (IDVariant NumeroPulsante, IDVariant NomeVoce, IDVariant NomeComando)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMEROVOCE = new IDVariant(0,IDVariant.INTEGER);
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Voce Pulsante Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  B.TITOLO as AMVVOCITITOL, ");
      SQL.append("  B.STRINGA as AMVVOCISTRIN, ");
      SQL.append("  B.VOCE as AMVVOCIVOCE ");
      SQL.append("from ");
      SQL.append("  AMV_ABILITAZIONI A, ");
      SQL.append("  AMV_VOCI B ");
      SQL.append("where B.VOCE = A.VOCE_MENU ");
      SQL.append("and   (A.VOCE_MENU IN ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  C.VOCE ");
      SQL.append("from ");
      SQL.append("  AMV_VOCI C ");
      SQL.append("where (C.TIPO = 'A') ");
      SQL.append(")) ");
      SQL.append("and   (A.RUOLO = " + IDL.CSql(getRUOLO(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.STRINGA LIKE 'CFA' || '%') ");
      SQL.append("order by ");
      SQL.append("  B.VOCE ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        v_NUMEROVOCE = IDL.Add(v_NUMEROVOCE, (new IDVariant(1)));
        if (v_NUMEROVOCE.equals(NumeroPulsante, true))
        {
          NomeVoce.set(new IDVariant(C2.Get("AMVVOCITITOL")));
          NomeComando.set(new IDVariant(C2.Get("AMVVOCISTRIN")));
        }
        C2.MoveNext();
      }
      C2.Close();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "VocePulsante", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Abilitazione Pannello In Sola Info
  // Explain which processing is carried out by this procedure
  // Identificativo Pannello - Input
  // Stringa - Input
  // **********************************************************************
  public int AbilitazionePannelloInSolaInfo (IDPanel IdentificativoPannello, IDVariant Stringa)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMEROVOCI = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Abilitazione Pannello In Sola Info Body
      // Procedure Body
      // 
      v_NUMEROVOCI = IDL.Find(ABILITAZINFO, IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("@")), IDL.Lower((new IDVariant(IdentificativoPannello.Parent.Frames[IdentificativoPannello.FrIndex].Caption)))), (new IDVariant(" "))), (new IDVariant("info"))), (new IDVariant("@"))));
      // 
      // se numero voci = zero, verifico se esiste abilitazione
      // specifica alla info del pannello
      // 
      if (v_NUMEROVOCI.equals((new IDVariant(0)), true))
      {
        v_NUMEROVOCI = IDL.Find(ABILITAZINFO, IDL.Add(IDL.Add((new IDVariant("@")), Stringa), (new IDVariant("@"))));
      }
      // 
      // se numero voci < zero, allora l'utente è abilitato
      // in sola visualizzazione
      // 
      if (v_NUMEROVOCI.compareTo((new IDVariant(0)), true)>0)
      {
        IdentificativoPannello.set_Locked((new IDVariant(-1)).booleanValue());
        IdentificativoPannello.set_iLockable((new IDVariant(0)).booleanValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "AbilitazionePannelloInSolaInfo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Carica Abilitazioni In Sola Info
  // Explain which processing is carried out by this procedure
  // Voce Menu - Input
  // **********************************************************************
  public int CaricaAbilitazioniInSolaInfo (IDVariant VoceMenu)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C2;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Carica Abilitazioni In Sola Info Body
      // Procedure Body
      // 
      ABILITAZINFO = (new IDVariant("@"));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  B.VOCE as AMVVOCIVOCE, ");
      SQL.append("  A.ABILITAZIONE as AMVABIABIPAD, ");
      SQL.append("  B.STRINGA as AMVVOCISTRIN ");
      SQL.append("from ");
      SQL.append("  AMV_ABILITAZIONI A, ");
      SQL.append("  AMV_VOCI B ");
      SQL.append("where B.VOCE = A.VOCE_MENU ");
      SQL.append("and   (A.RUOLO = " + IDL.CSql(getRUOLO(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.MODULO = " + IDL.CSql(MODULO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PADRE = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(C.ABILITAZIONE) ");
      SQL.append("from ");
      SQL.append("  AMV_ABILITAZIONI C, ");
      SQL.append("  AMV_VOCI D ");
      SQL.append("where D.VOCE = C.VOCE_MENU ");
      SQL.append("and   (D.VOCE = " + IDL.CSql(VoceMenu, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " || ' ' || 'info') ");
      SQL.append(")) ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        ABILITAZINFO = IDL.Add(IDL.Add(ABILITAZINFO, C2.Get("AMVVOCISTRIN")), (new IDVariant("@")));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  B.STRINGA as AMVVOCISTRIN ");
        SQL.append("from ");
        SQL.append("  AMV_ABILITAZIONI A, ");
        SQL.append("  AMV_VOCI B ");
        SQL.append("where B.VOCE = A.VOCE_MENU ");
        SQL.append("and   (A.RUOLO = " + IDL.CSql(getRUOLO(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.MODULO = " + IDL.CSql(MODULO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.PADRE = " + IDL.CSql(C2.Get("AMVABIABIPAD"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        C3 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!C3.EOF()) C3.MoveNext();
        while (!C3.EOF())
        {
          ABILITAZINFO = IDL.Add(IDL.Add(ABILITAZINFO, C3.Get("AMVVOCISTRIN")), (new IDVariant("@")));
          C3.MoveNext();
        }
        C3.Close();
        C2.MoveNext();
      }
      C2.Close();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "CaricaAbilitazioniInSolaInfo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Carica Voci Abilitate
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CaricaVociAbilitate ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant I = new IDVariant(0,IDVariant.INTEGER);
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      I = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Carica Voci Abilitate Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  B.TITOLO as AMVVOCITITOL, ");
      SQL.append("  B.STRINGA as AMVVOCISTRIN, ");
      SQL.append("  B.VOCE as AMVVOCIVOCE ");
      SQL.append("from ");
      SQL.append("  AMV_ABILITAZIONI A, ");
      SQL.append("  AMV_VOCI B ");
      SQL.append("where B.VOCE = A.VOCE_MENU ");
      SQL.append("and   (A.VOCE_MENU IN ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  C.VOCE ");
      SQL.append("from ");
      SQL.append("  AMV_VOCI C ");
      SQL.append("where (C.TIPO = 'A') ");
      SQL.append(")) ");
      SQL.append("and   (A.RUOLO = " + IDL.CSql(getRUOLO(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.MODULO = " + IDL.CSql(MODULO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("order by ");
      SQL.append("  B.VOCE ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        CARIVOCIABIL_MENUINSEINTO(C2.Get("AMVVOCITITOL"), C2.Get("AMVVOCISTRIN"), C2.Get("AMVVOCIVOCE"), I);
        I = IDL.Add(I, (new IDVariant(1)));
        C2.MoveNext();
      }
      C2.Close();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Afc", "CaricaVociAbilitate", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Menu: Insert into
  // Perchè stai inserendo queste righe?
  // **********************************************************************
  private void CARIVOCIABIL_MENUINSEINTO(IDVariant C2_AMVVOCITITOL, IDVariant C2_AMVVOCISTRIN, IDVariant C2_AMVVOCIVOCE, IDVariant I) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef7.TBL_MENU, 0);
    IMDB.set_Value(IMDBDef7.TBL_MENU, IMDBDef7.FLD_MENU_COMANDCAPTIO, 0, C2_AMVVOCITITOL);
    IMDB.set_Value(IMDBDef7.TBL_MENU, IMDBDef7.FLD_MENU_COMACOMMCODE, 0, IDL.NullValue(C2_AMVVOCISTRIN,C2_AMVVOCIVOCE));
    IMDB.set_Value(IMDBDef7.TBL_MENU, IMDBDef7.FLD_MENU_COMANDINDICE, 0, I);
  }

  
}  
