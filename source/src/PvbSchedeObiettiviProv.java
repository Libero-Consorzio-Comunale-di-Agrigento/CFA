// **********************************************
// Pvb Schede Obiettivi Prov
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

public class PvbSchedeObiettiviProv extends com.progamma.doc.IDDocument
{  
  private MyWebEntryPoint MainFrm;
  private IMDBObj IMDB;
  private static String ClassName = null;

  // Property constant definitions
  public static int PVBSCHOBIPRO_PROGRESSIVO = 1;
  public static int PVBSCHOBIPRO_ESERCIZIO = 2;
  public static int PVBSCHOBIPRO_ES = 3;
  public static int PVBSCHOBIPRO_CAPITOLO = 4;
  public static int PVBSCHOBIPRO_ARTICOLO = 5;
  public static int PVBSCHOBIPRO_PROGRESSIPVB = 6;
  public static int PVBSCHOBIPRO_PROGRESCHEDA = 7;
  public static int PVBSCHOBIPRO_IMPORTO = 8;
  public static int PVBSCHOBIPRO_CASSA = 9;
  public static int PVBSCHOBIPRO_TIPOVAR = 10;
  public static int MAX_VARS = 10;
  public static int BASE_VARS = 0;
  public static int BASE_COLLS = 0;

  // Definition of Global Variables
  public IDVariant getPROGRESSIVO() { return GetPropDirect(PVBSCHOBIPRO_PROGRESSIVO); }
  public void setPROGRESSIVO(IDVariant NewValue) { ChangePropDirect(PVBSCHOBIPRO_PROGRESSIVO,NewValue,false); }
  public IDVariant getESERCIZIO() { return GetPropDirect(PVBSCHOBIPRO_ESERCIZIO); }
  public void setESERCIZIO(IDVariant NewValue) { ChangePropDirect(PVBSCHOBIPRO_ESERCIZIO,NewValue,false); }
  public IDVariant getES() { return GetPropDirect(PVBSCHOBIPRO_ES); }
  public void setES(IDVariant NewValue) { ChangePropDirect(PVBSCHOBIPRO_ES,NewValue,false); }
  public IDVariant getCAPITOLO() { return GetPropDirect(PVBSCHOBIPRO_CAPITOLO); }
  public void setCAPITOLO(IDVariant NewValue) { ChangePropDirect(PVBSCHOBIPRO_CAPITOLO,NewValue,false); }
  public IDVariant getARTICOLO() { return GetPropDirect(PVBSCHOBIPRO_ARTICOLO); }
  public void setARTICOLO(IDVariant NewValue) { ChangePropDirect(PVBSCHOBIPRO_ARTICOLO,NewValue,false); }
  public IDVariant getPROGRESSIPVB() { return GetPropDirect(PVBSCHOBIPRO_PROGRESSIPVB); }
  public void setPROGRESSIPVB(IDVariant NewValue) { ChangePropDirect(PVBSCHOBIPRO_PROGRESSIPVB,NewValue,false); }
  public IDVariant getPROGRESCHEDA() { return GetPropDirect(PVBSCHOBIPRO_PROGRESCHEDA); }
  public void setPROGRESCHEDA(IDVariant NewValue) { ChangePropDirect(PVBSCHOBIPRO_PROGRESCHEDA,NewValue,false); }
  public IDVariant getIMPORTO() { return GetPropDirect(PVBSCHOBIPRO_IMPORTO); }
  public void setIMPORTO(IDVariant NewValue) { ChangePropDirect(PVBSCHOBIPRO_IMPORTO,NewValue,false); }
  public IDVariant getCASSA() { return GetPropDirect(PVBSCHOBIPRO_CASSA); }
  public void setCASSA(IDVariant NewValue) { ChangePropDirect(PVBSCHOBIPRO_CASSA,NewValue,false); }
  public IDVariant getTIPOVAR() { return GetPropDirect(PVBSCHOBIPRO_TIPOVAR); }
  public void setTIPOVAR(IDVariant NewValue) { ChangePropDirect(PVBSCHOBIPRO_TIPOVAR,NewValue,false); }
    
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
  public PvbSchedeObiettiviProv()
  {
  }

  // **********************************************
  // Initialize common framework object
  // **********************************************
  public PvbSchedeObiettiviProv(MyWebEntryPoint w, IMDBObj imdb)
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
      return (Open ? MainFrm.Cf4armDBObject.DBO() : MainFrm.Cf4armDBObject.GetDB());
    }
    catch(Exception e)
    {
    }
    return super.GetDBObj(Open);
  }
  
  // **********************************************
  // Get Meta Data
  // **********************************************
  private static DOMDObj MDOPvbSchedeObiettiviProv;
  public synchronized static DOMDObj GetDOMD_PvbSchedeObiettiviProv()
  {
    DOMDProp MDP;
    DOMDColl MDC;
    DOMDLinkedDoc DOC;

    if (MDOPvbSchedeObiettiviProv != null)
      return MDOPvbSchedeObiettiviProv;
    else
      MDOPvbSchedeObiettiviProv = new DOMDObj();
    MDOPvbSchedeObiettiviProv.ObjTag = "PvbSchedeObiettiviProv";
    MDOPvbSchedeObiettiviProv.ObjGUID = "AD277BC4-56C7-4F45-A276-679A671A04BB";
    MDOPvbSchedeObiettiviProv.UIName = "Pvb Schede Obiettivi Prov";
    MDOPvbSchedeObiettiviProv.Services = 0;
    MDOPvbSchedeObiettiviProv.BaseProps = 0;
    MDOPvbSchedeObiettiviProv.BaseColls = 0;
    MDOPvbSchedeObiettiviProv.DBCode = "PVB_SCHEDE_OBIETTIVI";
    MDOPvbSchedeObiettiviProv.DBSchema = ".";
    MDOPvbSchedeObiettiviProv.SequenceCode = "PVB_SCHEDE_OBIETTIVI_$F";
    MDOPvbSchedeObiettiviProv.DBType = 4;
    MDOPvbSchedeObiettiviProv.AddQuery("4FB3BE02-C6E9-4077-AF43-0D739079CA76", "PVBSCHEDEOBIETTIVI_PK", "select 1 from PVB_SCHEDE_OBIETTIVI where PROGRESSIVO=~~PROGRESSIVO~~", "~~!PROGRESSIVO~~=~~PROGRESSIVO~~", 1);
    MDOPvbSchedeObiettiviProv.AddQuery("97191F05-9971-46E2-BB1D-E73A52CBDC77", "PVBSCHEDEOBIETTIVI_PROGRPVBPROVFK", "select 1 from VARCOMPRO where PROGRESSIVO=~~PROGRESSIVOPVB~~", "VARCOMPRO§~~!PROGRESSIVOPVB~~=~~PROGRESSIVOPVB~~", 3);
    MDOPvbSchedeObiettiviProv.SetNumProp(10);
    MDP = new DOMDProp();
    MDOPvbSchedeObiettiviProv.SetProp(1,MDP);
    MDP.Index = 1;
    MDP.ObjTag = "PROGRESSIVO";
    MDP.Name = "PROGRESSIVO";
    MDP.UIName = "PROGRESSIVO";
    MDP.GUID = "FA6D6C60-2CF2-4D23-B3BD-A099E4DA8CD1";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "PROGRESSIVO";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOPvbSchedeObiettiviProv.SetProp(2,MDP);
    MDP.Index = 2;
    MDP.ObjTag = "ESERCIZIO";
    MDP.Name = "ESERCIZIO";
    MDP.UIName = "ESERCIZIO";
    MDP.GUID = "D76392DC-CB72-4F98-A9EE-4266C507653B";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ESERCIZIO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOPvbSchedeObiettiviProv.SetProp(3,MDP);
    MDP.Index = 3;
    MDP.ObjTag = "ES";
    MDP.Name = "ES";
    MDP.UIName = "E S";
    MDP.GUID = "71CC8674-1E13-47BB-8E72-5649277A5748";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 1;
    MDP.vScale = 0;
    MDP.DBCode = "E_S";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOPvbSchedeObiettiviProv.SetProp(4,MDP);
    MDP.Index = 4;
    MDP.ObjTag = "CAPITOLO";
    MDP.Name = "CAPITOLO";
    MDP.UIName = "CAPITOLO";
    MDP.GUID = "3AB4B604-F1D1-4245-A1B6-01338D1B9AA0";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 16;
    MDP.vScale = 0;
    MDP.DBCode = "CAPITOLO";
    MDP = new DOMDProp();
    MDOPvbSchedeObiettiviProv.SetProp(5,MDP);
    MDP.Index = 5;
    MDP.ObjTag = "ARTICOLO";
    MDP.Name = "ARTICOLO";
    MDP.UIName = "ARTICOLO";
    MDP.GUID = "CBA5C8DD-83D6-4CB0-9E9E-2AA8CB2E3B44";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "ARTICOLO";
    MDP = new DOMDProp();
    MDOPvbSchedeObiettiviProv.SetProp(6,MDP);
    MDP.Index = 6;
    MDP.ObjTag = "PROGRESSIPVB";
    MDP.Name = "PROGRESSIVOPVB";
    MDP.UIName = "PROGRESSIVO PVB";
    MDP.GUID = "46B6E49C-AD47-4A33-BE7B-E7CCA0BBA5E2";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    DOC = new DOMDLinkedDoc("VarProvv", 1);
    MDP.LinkedDoc = DOC;
    DOC.SetName("PROGRPVBPROVFK");
    DOC.SetLinkedProp(0, VarProvv.VARPROVV_PROGRESSIVO, PvbSchedeObiettiviProv.PVBSCHOBIPRO_PROGRESSIPVB);
    MDP.DBCode = "PROGRESSIVO_PVB";
    MDP.FK = true;
    MDP = new DOMDProp();
    MDOPvbSchedeObiettiviProv.SetProp(7,MDP);
    MDP.Index = 7;
    MDP.ObjTag = "PROGRESCHEDA";
    MDP.Name = "PROGRESSIVOSCHEDA";
    MDP.UIName = "PROGRESSIVO SCHEDA";
    MDP.GUID = "948A3627-165F-4962-95C0-1256F1D27168";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "PROGRESSIVO_SCHEDA";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOPvbSchedeObiettiviProv.SetProp(8,MDP);
    MDP.Index = 8;
    MDP.ObjTag = "IMPORTO";
    MDP.Name = "IMPORTO";
    MDP.UIName = "IMPORTO";
    MDP.GUID = "DF201FFB-0246-46D1-A28A-45ACFD8D8A47";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMPORTO";
    MDP = new DOMDProp();
    MDOPvbSchedeObiettiviProv.SetProp(9,MDP);
    MDP.Index = 9;
    MDP.ObjTag = "CASSA";
    MDP.Name = "CASSA";
    MDP.UIName = "CASSA";
    MDP.GUID = "E89E997E-9E73-49C8-B58A-F26E17533093";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "CASSA";
    MDP = new DOMDProp();
    MDOPvbSchedeObiettiviProv.SetProp(10,MDP);
    MDP.Index = 10;
    MDP.ObjTag = "TIPOVAR";
    MDP.Name = "TIPOVAR";
    MDP.UIName = "TIPO VAR";
    MDP.GUID = "BF6FCBA1-7327-41EE-B81F-46B5BB87D931";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "TIPO_VAR";
    MDOPvbSchedeObiettiviProv.SetNumColl(0);
    return MDOPvbSchedeObiettiviProv;
  }

  public DOMDObj GetMD()
  {
    DOMDObj md = GetDOMD_PvbSchedeObiettiviProv();
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
      if (Idx==PVBSCHOBIPRO_PROGRESSIVO) { setPROGRESSIVO(NewValue); break fine; }
      if (Idx==PVBSCHOBIPRO_ESERCIZIO) { setESERCIZIO(NewValue); break fine; }
      if (Idx==PVBSCHOBIPRO_ES) { setES(NewValue); break fine; }
      if (Idx==PVBSCHOBIPRO_CAPITOLO) { setCAPITOLO(NewValue); break fine; }
      if (Idx==PVBSCHOBIPRO_ARTICOLO) { setARTICOLO(NewValue); break fine; }
      if (Idx==PVBSCHOBIPRO_PROGRESSIPVB) { setPROGRESSIPVB(NewValue); break fine; }
      if (Idx==PVBSCHOBIPRO_PROGRESCHEDA) { setPROGRESCHEDA(NewValue); break fine; }
      if (Idx==PVBSCHOBIPRO_IMPORTO) { setIMPORTO(NewValue); break fine; }
      if (Idx==PVBSCHOBIPRO_CASSA) { setCASSA(NewValue); break fine; }
      if (Idx==PVBSCHOBIPRO_TIPOVAR) { setTIPOVAR(NewValue); break fine; }
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
  public static PvbSchedeObiettiviProv CreatePvbSchedeObiettiviProv()
  {
    return CreatePvbSchedeObiettiviProv(null, null);
  }
  
  public static PvbSchedeObiettiviProv CreatePvbSchedeObiettiviProv(Object mainfrm, Object imdb) { return CreatePvbSchedeObiettiviProv(mainfrm, imdb, null); } 
  public static PvbSchedeObiettiviProv CreatePvbSchedeObiettiviProv(Object mainfrm, Object imdb, Object mainfrmCF)
  {
    PvbSchedeObiettiviProv newobj = null;
    //
    // Creating object
    if (ClassName == null)
      newobj = new PvbSchedeObiettiviProv((MyWebEntryPoint)mainfrm, (IMDBObj)imdb); // No class factory
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
          newobj = (PvbSchedeObiettiviProv)app.CreateDocument(ClassName);
        }
        else
        {
          // Classe con namespace: faccio creare l'istanza al componente corrispondente
          String CompNameSpace = ClassName.substring(0, ClassName.lastIndexOf('.'));
          com.progamma.is.WebEntryPoint cmp = app.GetCompFromNameSpace(CompNameSpace);
          if (cmp != null)
            newobj = (PvbSchedeObiettiviProv)cmp.CreateDocument(ClassName.substring(ClassName.lastIndexOf('.') + 1));
          else
          {
            app.getDTTObj().AddMsg(DTTEngine.DTTMSG_ERROR, "", 191, "CreatePvbSchedeObiettiviProv", 
                  "Can't find component " + CompNameSpace + " while handling PvbSchedeObiettiviProv class factory");
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
    DOMDObj MD = GetDOMD_PvbSchedeObiettiviProv();
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
    return (obj instanceof PvbSchedeObiettiviProv);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PvbSchedeObiettiviProv.class.getName() : (Glb.ClassWithPackage(PvbSchedeObiettiviProv.class) ? PvbSchedeObiettiviProv.class.getName().substring(PvbSchedeObiettiviProv.class.getPackage().getName().length() + 1) : PvbSchedeObiettiviProv.class.getName()));
  }
  
  // **********************************************
  // Event Stubs
  // **********************************************  

  
  // **********************************************
  // Procedure Definition
  // **********************************************
  
  // **********************************************************************
  // Before Load Collection
  // Evento notificato al documento prima di caricare una
  // collection del suo tipo
  // Parent - Input
  // Collection - Input
  // Skip - Input/Output
  // **********************************************************************
  public void BeforeLoadCollection(com.progamma.doc.IDDocument Parent, com.progamma.doc.IDCollection Collection, IDVariant Skip)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Before Load Collection Body
      // Corpo Procedura
      // 
      Collection.MaxRows = (new IDVariant(0)).intValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PvbSchedeObiettiviProv", "BeforeLoadCollection", _e);
    }
  }

  
}  
