// **********************************************
// Imputazioni Crono
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

public class ImputazioniCrono extends com.progamma.doc.IDDocument
{  
  private MyWebEntryPoint MainFrm;
  private IMDBObj IMDB;
  private static String ClassName = null;

  // Property constant definitions
  public static int IMPUTAZCRONO_CRONOPROGRID = 1;
  public static int IMPUTAZCRONO_PROGREIMPUTA = 2;
  public static int IMPUTAZCRONO_CAPITOLO = 3;
  public static int IMPUTAZCRONO_ARTICOLO = 4;
  public static int IMPUTAZCRONO_PROGUNITORGA = 5;
  public static int IMPUTAZCRONO_UTENTEINSERI = 6;
  public static int IMPUTAZCRONO_DATAINSERIME = 7;
  public static int IMPUTAZCRONO_UTENTULTIAGG = 8;
  public static int IMPUTAZCRONO_DATAULTIMAGG = 9;
  public static int IMPUTAZCRONO_IMPORTO = 10;
  public static int IMPUTAZCRONO_PROGETTOID = 11;
  public static int IMPUTAZCRONO_TOT = 12;
  public static int IMPUTAZCRONO_NUOVARIGA = 13;
  public static int IMPUTAZCRONO_OPERACRONO = 14;
  public static int IMPUTAZCRONO_CODLIVELLO5 = 15;
  public static int IMPUTAZCRONO_PIANICRONOPR = 1;
  public static int IMPUTAZCRONO_ENTRATCRONOP = 2;
  public static int MAX_VARS = 15;
  public static int BASE_VARS = 0;
  public static int BASE_COLLS = 0;

  // Definition of Global Variables
  public Cronoprogramma CRONOPRPADRE = null;
  public com.progamma.doc.IDCollection PIANICRONOPR = new com.progamma.doc.IDCollection();
  public com.progamma.doc.IDCollection ENTRATCRONOP = new com.progamma.doc.IDCollection();
  public IDVariant getCRONOPROGRID() { return GetPropDirect(IMPUTAZCRONO_CRONOPROGRID); }
  public void setCRONOPROGRID(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_CRONOPROGRID,NewValue,false); }
  public IDVariant getPROGREIMPUTA() { return GetPropDirect(IMPUTAZCRONO_PROGREIMPUTA); }
  public void setPROGREIMPUTA(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_PROGREIMPUTA,NewValue,false); }
  public IDVariant getCAPITOLO() { return GetPropDirect(IMPUTAZCRONO_CAPITOLO); }
  public void setCAPITOLO(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_CAPITOLO,NewValue,false); }
  public IDVariant getARTICOLO() { return GetPropDirect(IMPUTAZCRONO_ARTICOLO); }
  public void setARTICOLO(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_ARTICOLO,NewValue,false); }
  public IDVariant getPROGUNITORGA() { return GetPropDirect(IMPUTAZCRONO_PROGUNITORGA); }
  public void setPROGUNITORGA(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_PROGUNITORGA,NewValue,false); }
  public IDVariant getUTENTEINSERI() { return GetPropDirect(IMPUTAZCRONO_UTENTEINSERI); }
  public void setUTENTEINSERI(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_UTENTEINSERI,NewValue,false); }
  public IDVariant getDATAINSERIME() { return GetPropDirect(IMPUTAZCRONO_DATAINSERIME); }
  public void setDATAINSERIME(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_DATAINSERIME,NewValue,false); }
  public IDVariant getUTENTULTIAGG() { return GetPropDirect(IMPUTAZCRONO_UTENTULTIAGG); }
  public void setUTENTULTIAGG(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_UTENTULTIAGG,NewValue,false); }
  public IDVariant getDATAULTIMAGG() { return GetPropDirect(IMPUTAZCRONO_DATAULTIMAGG); }
  public void setDATAULTIMAGG(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_DATAULTIMAGG,NewValue,false); }
  public IDVariant getIMPORTO() { return GetPropDirect(IMPUTAZCRONO_IMPORTO); }
  public void setIMPORTO(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_IMPORTO,NewValue,false); }
  public IDVariant getPROGETTOID() { return GetPropDirect(IMPUTAZCRONO_PROGETTOID); }
  public void setPROGETTOID(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_PROGETTOID,NewValue,false); }
  public IDVariant getTOT() { return GetPropDirect(IMPUTAZCRONO_TOT); }
  public void setTOT(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_TOT,NewValue,false); }
  public IDVariant getNUOVARIGA() { return GetPropDirect(IMPUTAZCRONO_NUOVARIGA); }
  public void setNUOVARIGA(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_NUOVARIGA,NewValue,false); }
  public IDVariant getOPERACRONO() { return GetPropDirect(IMPUTAZCRONO_OPERACRONO); }
  public void setOPERACRONO(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_OPERACRONO,NewValue,false); }
  public IDVariant getCODLIVELLO5() { return GetPropDirect(IMPUTAZCRONO_CODLIVELLO5); }
  public void setCODLIVELLO5(IDVariant NewValue) { ChangePropDirect(IMPUTAZCRONO_CODLIVELLO5,NewValue,false); }
    
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
  public ImputazioniCrono()
  {
  }

  // **********************************************
  // Initialize common framework object
  // **********************************************
  public ImputazioniCrono(MyWebEntryPoint w, IMDBObj imdb)
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
      CRONOPRPADRE = new Cronoprogramma(MainFrm,IMDB);
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
      CRONOPRPADRE.SetMainFrm(MainFrm,IMDB);
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
  private static DOMDObj MDOImputazioniCrono;
  public synchronized static DOMDObj GetDOMD_ImputazioniCrono()
  {
    DOMDProp MDP;
    DOMDColl MDC;
    DOMDLinkedDoc DOC;

    if (MDOImputazioniCrono != null)
      return MDOImputazioniCrono;
    else
      MDOImputazioniCrono = new DOMDObj();
    MDOImputazioniCrono.ObjTag = "ImputazioniCrono";
    MDOImputazioniCrono.ObjGUID = "A7C9F8E2-294A-49C8-86B7-4D8D3AC633EC";
    MDOImputazioniCrono.UIName = "Imputazioni Crono";
    MDOImputazioniCrono.Services = 0;
    MDOImputazioniCrono.BaseProps = 0;
    MDOImputazioniCrono.BaseColls = 0;
    MDOImputazioniCrono.DBCode = "IMPUTAZIONI_CRONOPROGRAMMI";
    MDOImputazioniCrono.DBSchema = ".";
    MDOImputazioniCrono.SequenceCode = "IMPUTAZIONI_CRONOPROGRAMMI_$F";
    MDOImputazioniCrono.DBType = 4;
    MDOImputazioniCrono.AddQuery("C748EDA4-5A3A-417D-A578-AE7CAB4B2F51", "IMPUTAZIONICRONOPROGRAMMI_PK", "select 1 from IMPUTAZIONI_CRONOPROGRAMMI where CRONOPROGRAMMA_ID=~~CRONOPROGRAMMAID~~ and PROGRESSIVO_IMPUTAZIONE=~~PROGRESSIVOIMPUTAZIONE~~", "~~!CRONOPROGRAMMAID~~=~~CRONOPROGRAMMAID~~, ~~!PROGRESSIVOIMPUTAZIONE~~=~~PROGRESSIVOIMPUTAZIONE~~", 1);
    MDOImputazioniCrono.AddQuery("EA97B98B-941B-4C0D-BFD9-D73F491B39FD", "IMPUTAZIONICRONOPROGRAMMI_TESTATECRONOPROGRAMMI", "select 1 from TESTATE_CRONOPROGRAMMI where CRONOPROGRAMMA_ID=~~CRONOPROGRAMMAID~~", "TESTATE CRONOPROGRAMMI§~~!CRONOPROGRAMMAID~~=~~CRONOPROGRAMMAID~~", 3);
    MDOImputazioniCrono.AddQuery("FAE0AC3E-B1EC-4C21-B838-D21C4A8002A5", "ENTRATECRONOPROGRAMMI_IMPUTAZIONICRONOPROGRAMMI", "select 1 from ENTRATE_CRONOPROGRAMMI where CRONOPROGRAMMA_ID_SPESA=~~CRONOPROGRAMMAID~~ and PROGRESSIVO_IMPUTAZIONE=~~PROGRESSIVOIMPUTAZIONE~~", "ENTRATE CRONOPROGRAMMI§~~!CRONOPROGRAMMAID~~=~~CRONOPROGRAMMAID~~, ~~!PROGRESSIVOIMPUTAZIONE~~=~~PROGRESSIVOIMPUTAZIONE~~", 4);
    MDOImputazioniCrono.AddQuery("792BC62D-EEA2-4C49-BC81-05016A79E8C3", "PIANICRONOPROGRAMMI_IMPUTAZIONICRONOPROGRAMMI", "select 1 from PIANI_CRONOPROGRAMMI where CRONOPROGRAMMA_ID=~~CRONOPROGRAMMAID~~ and PROGRESSIVO_IMPUTAZIONE=~~PROGRESSIVOIMPUTAZIONE~~", "PIANI CRONOPROGRAMMI§~~!CRONOPROGRAMMAID~~=~~CRONOPROGRAMMAID~~, ~~!PROGRESSIVOIMPUTAZIONE~~=~~PROGRESSIVOIMPUTAZIONE~~", 4);
    MDOImputazioniCrono.SetNumProp(15);
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(1,MDP);
    MDP.Index = 1;
    MDP.ObjTag = "CRONOPROGRID";
    MDP.Name = "CRONOPROGRAMMAID";
    MDP.UIName = "CRONOPROGRAMMA ID";
    MDP.GUID = "052E25D7-9245-439E-ACEC-B774D61D6945";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    DOC = new DOMDLinkedDoc("Cronoprogramma", 1);
    MDP.LinkedDoc = DOC;
    DOC.SetName("TESTATECRONOPROGRAMMI");
    DOC.SetLinkedProp(0, Cronoprogramma.CRONOPROGRA1_CRONOPROGRID, ImputazioniCrono.IMPUTAZCRONO_CRONOPROGRID);
    MDP.DBCode = "CRONOPROGRAMMA_ID";
    MDP.PK = true;
    MDP.FK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(2,MDP);
    MDP.Index = 2;
    MDP.ObjTag = "PROGREIMPUTA";
    MDP.Name = "PROGRESSIVOIMPUTAZIONE";
    MDP.UIName = "PROGRESSIVO IMPUTAZIONE";
    MDP.GUID = "2137AA5C-B7DF-40D6-B3E6-366C08905112";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "PROGRESSIVO_IMPUTAZIONE";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(3,MDP);
    MDP.Index = 3;
    MDP.ObjTag = "CAPITOLO";
    MDP.Name = "CAPITOLO";
    MDP.UIName = "CAPITOLO";
    MDP.GUID = "22FBFA01-31A1-46E3-BEBA-BA5BE2EAF709";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 16;
    MDP.vScale = 0;
    MDP.DBCode = "CAPITOLO";
    MDP.Nullable = false;
    MDP.Mask = "################";
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(4,MDP);
    MDP.Index = 4;
    MDP.ObjTag = "ARTICOLO";
    MDP.Name = "ARTICOLO";
    MDP.UIName = "ARTICOLO";
    MDP.GUID = "C0E48923-401B-4701-9102-E0ADD3C7A651";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "ARTICOLO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(5,MDP);
    MDP.Index = 5;
    MDP.ObjTag = "PROGUNITORGA";
    MDP.Name = "PROGRUNITAORGANIZZATIVA";
    MDP.UIName = "PROGR UNITA ORGANIZZATIVA";
    MDP.GUID = "284F11E4-9476-4E9C-BDD9-DBC5E6BC3394";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "PROGR_UNITA_ORGANIZZATIVA";
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(6,MDP);
    MDP.Index = 6;
    MDP.ObjTag = "UTENTEINSERI";
    MDP.Name = "UTENTEINSERIMENTO";
    MDP.UIName = "UTENTE INSERIMENTO";
    MDP.GUID = "19734914-ABDE-4BCE-999B-8F5C27D41F29";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_INSERIMENTO";
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(7,MDP);
    MDP.Index = 7;
    MDP.ObjTag = "DATAINSERIME";
    MDP.Name = "DATAINSERIMENTO";
    MDP.UIName = "DATA INSERIMENTO";
    MDP.GUID = "9B8772A8-BBA6-443E-A536-2320BA49316B";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 19;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_INSERIMENTO";
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(8,MDP);
    MDP.Index = 8;
    MDP.ObjTag = "UTENTULTIAGG";
    MDP.Name = "UTENTEULTIMOAGG";
    MDP.UIName = "UTENTE ULTIMO AGG";
    MDP.GUID = "55EC8C5E-C1A2-43F4-BEE5-367EEBB0AD75";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(9,MDP);
    MDP.Index = 9;
    MDP.ObjTag = "DATAULTIMAGG";
    MDP.Name = "DATAULTIMOAGG";
    MDP.UIName = "DATA ULTIMO AGG";
    MDP.GUID = "BF6C51ED-26CB-4BB6-9BDC-121DD66C36D6";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 19;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(10,MDP);
    MDP.Index = 10;
    MDP.ObjTag = "IMPORTO";
    MDP.Name = "IMPORTO";
    MDP.UIName = "IMPORTO";
    MDP.GUID = "73213B13-3FA1-4CFE-B1AE-D404A514609D";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMPORTO";
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(11,MDP);
    MDP.Index = 11;
    MDP.ObjTag = "PROGETTOID";
    MDP.Name = "PROGETTOID";
    MDP.UIName = "PROGETTO ID";
    MDP.GUID = "2BE5942C-F4F5-4FB9-B22A-924DF3BD967B";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 9;
    MDP.vScale = 0;
    MDP.DBCode = "PROGETTO_ID";
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(12,MDP);
    MDP.Index = 12;
    MDP.ObjTag = "TOT";
    MDP.Name = "TOT";
    MDP.UIName = "TOT";
    MDP.GUID = "313BD7C0-EC51-4CFD-9A18-069B9AC0EC89";
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(13,MDP);
    MDP.Index = 13;
    MDP.ObjTag = "NUOVARIGA";
    MDP.Name = "NuovaRiga";
    MDP.UIName = "Nuova Riga";
    MDP.GUID = "04FF3747-C03B-4C14-A21C-646DDD06763C";
    MDP.DataType = 1;
    MDP.MaxLength = 1;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(14,MDP);
    MDP.Index = 14;
    MDP.ObjTag = "OPERACRONO";
    MDP.Name = "OperaCrono";
    MDP.UIName = "Opera Crono";
    MDP.GUID = "139F8497-ADC1-4EDE-A44E-D42CB89268F4";
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOImputazioniCrono.SetProp(15,MDP);
    MDP.Index = 15;
    MDP.ObjTag = "CODLIVELLO5";
    MDP.Name = "CODLIVELLO5";
    MDP.UIName = "COD LIVELLO 5";
    MDP.GUID = "15A1E871-A651-4948-908B-B586DDCB4437";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "COD_LIVELLO_5";
    MDP.Mask = "##########";
    MDOImputazioniCrono.SetNumColl(2);
    MDC = new DOMDColl();
    MDOImputazioniCrono.SetColl(1,MDC);
    MDC.Index = 1;
    MDC.Name = "PIANICRONOPROGRAMMI";
    MDC.ChildrenName = "Piani";
    MDC.Visible = true;
    MDC.PKColl.add("CRONOPROGRID");
    MDC.FKColl.add("CRONOPROGRID");
    MDC.PKColl.add("PROGREIMPUTA");
    MDC.FKColl.add("PROGREIMPUTA");
    MDC = new DOMDColl();
    MDOImputazioniCrono.SetColl(2,MDC);
    MDC.Index = 2;
    MDC.Name = "ENTRATECRONOPROGRAMMI";
    MDC.ChildrenName = "EntrateCronoprogrammi";
    MDC.Visible = true;
    MDC.PKColl.add("CRONOPROGRID");
    MDC.FKColl.add("CRONOIDSPESA");
    MDC.PKColl.add("PROGREIMPUTA");
    MDC.FKColl.add("PROGREIMPUTA");
    return MDOImputazioniCrono;
  }

  public DOMDObj GetMD()
  {
    DOMDObj md = GetDOMD_ImputazioniCrono();
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
      if (Idx==IMPUTAZCRONO_CRONOPROGRID) { setCRONOPROGRID(NewValue); break fine; }
      if (Idx==IMPUTAZCRONO_PROGREIMPUTA) { setPROGREIMPUTA(NewValue); break fine; }
      if (Idx==IMPUTAZCRONO_CAPITOLO) { setCAPITOLO(NewValue); break fine; }
      if (Idx==IMPUTAZCRONO_ARTICOLO) { setARTICOLO(NewValue); break fine; }
      if (Idx==IMPUTAZCRONO_PROGUNITORGA) { setPROGUNITORGA(NewValue); break fine; }
      if (Idx==IMPUTAZCRONO_UTENTEINSERI) { setUTENTEINSERI(NewValue); break fine; }
      if (Idx==IMPUTAZCRONO_DATAINSERIME) { setDATAINSERIME(NewValue); break fine; }
      if (Idx==IMPUTAZCRONO_UTENTULTIAGG) { setUTENTULTIAGG(NewValue); break fine; }
      if (Idx==IMPUTAZCRONO_DATAULTIMAGG) { setDATAULTIMAGG(NewValue); break fine; }
      if (Idx==IMPUTAZCRONO_IMPORTO) { setIMPORTO(NewValue); break fine; }
      if (Idx==IMPUTAZCRONO_PROGETTOID) { setPROGETTOID(NewValue); break fine; }
      if (Idx==IMPUTAZCRONO_TOT) { setTOT(NewValue); break fine; }
      if (Idx==IMPUTAZCRONO_NUOVARIGA) { setNUOVARIGA(NewValue); break fine; }
      if (Idx==IMPUTAZCRONO_OPERACRONO) { setOPERACRONO(NewValue); break fine; }
      if (Idx==IMPUTAZCRONO_CODLIVELLO5) { setCODLIVELLO5(NewValue); break fine; }
      super.SetPropByIndex(Idx, NewValue); break fine;
    }
  }
  
  
  // **********************************************
  // Get Collection By Index
  // **********************************************
  public IDCollection GetCollByIndex(int Idx)
  {
    if (Idx==1+BASE_COLLS) return PIANICRONOPR;
    if (Idx==2+BASE_COLLS) return ENTRATCRONOP;
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
  public static ImputazioniCrono CreateImputazioniCrono()
  {
    return CreateImputazioniCrono(null, null);
  }
  
  public static ImputazioniCrono CreateImputazioniCrono(Object mainfrm, Object imdb) { return CreateImputazioniCrono(mainfrm, imdb, null); } 
  public static ImputazioniCrono CreateImputazioniCrono(Object mainfrm, Object imdb, Object mainfrmCF)
  {
    ImputazioniCrono newobj = null;
    //
    // Creating object
    if (ClassName == null)
      newobj = new ImputazioniCrono((MyWebEntryPoint)mainfrm, (IMDBObj)imdb); // No class factory
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
          newobj = (ImputazioniCrono)app.CreateDocument(ClassName);
        }
        else
        {
          // Classe con namespace: faccio creare l'istanza al componente corrispondente
          String CompNameSpace = ClassName.substring(0, ClassName.lastIndexOf('.'));
          com.progamma.is.WebEntryPoint cmp = app.GetCompFromNameSpace(CompNameSpace);
          if (cmp != null)
            newobj = (ImputazioniCrono)cmp.CreateDocument(ClassName.substring(ClassName.lastIndexOf('.') + 1));
          else
          {
            app.getDTTObj().AddMsg(DTTEngine.DTTMSG_ERROR, "", 191, "CreateImputazioniCrono", 
                  "Can't find component " + CompNameSpace + " while handling ImputazioniCrono class factory");
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
    DOMDObj MD = GetDOMD_ImputazioniCrono();
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
    return (obj instanceof ImputazioniCrono);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ImputazioniCrono.class.getName() : (Glb.ClassWithPackage(ImputazioniCrono.class) ? ImputazioniCrono.class.getName().substring(ImputazioniCrono.class.getPackage().getName().length() + 1) : ImputazioniCrono.class.getName()));
  }
  
  // **********************************************
  // Event Stubs
  // **********************************************  

  
  // **********************************************
  // Procedure Definition
  // **********************************************
  
  // **********************************************************************
  // After Load
  // Evento notificato dal documento dopo il caricamento
  // dal database
  // Already Loaded - Input
  // Loaded Collections - Input
  // **********************************************************************
  public void AfterLoad(IDVariant AlreadyLoaded, IDArray LoadedCollections)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // After Load Body
      // Corpo Procedura
      // 
      IDVariant v_VSUM = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  SUM(" + IDL.CSql(getIMPORTO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as SUMIMPORTO ");
      SQL.append("from ");
      SQL.append("  IMPUTAZIONI_CRONOPROGRAMMI A ");
      SQL.append("where (A.CRONOPROGRAMMA_ID = " + IDL.CSql(getCRONOPROGRID(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VSUM = QV.Get("SUMIMPORTO", IDVariant.INTEGER) ;
      }
      QV.Close();
      CRONOPRPADRE = (Cronoprogramma)Parent();
      setOPERACRONO(CRONOPRPADRE.getOPERA());
      setTOT(new IDVariant(IDL.NullValue(v_VSUM,(new IDVariant(0))),IDVariant.DECIMAL));
      setNUOVARIGA((new IDVariant(1)));
      SetOriginal();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImputazioniCrono", "AfterLoad", _e);
    }
  }

  // **********************************************************************
  // Before Save
  // Evento notificato al documento durante le fasi iniziali
  // della procedura di salvataggio dei documenti
  // Skip - Input/Output
  // Cancel - Input/Output
  // Phase - Input
  // **********************************************************************
  public void BeforeSave(IDVariant Skip, IDVariant Cancel, IDVariant Phase)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Before Save Body
      // Corpo Procedura
      // 
      IDVariant v_ESERCIZSPESA = new IDVariant(0,IDVariant.INTEGER);
      v_ESERCIZSPESA = (new IDVariant(9999));
      IDVariant v_VCODICE = null;
      v_VCODICE = (new IDVariant());
      IDVariant v_CODFPVTIT1 = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_CODFPVTIT2 = new IDVariant(0,IDVariant.INTEGER);
      if (Phase.compareTo((new IDVariant(0)), true)!=0)
      {
        Settotpiani();
      }
      // 
      // Controllo che l'imputazione insertita non deve essere
      // un capitolo di FPV
      // 
      if (this.Inserted())
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CODICE as VISRICCAPCOD ");
        SQL.append("from ");
        SQL.append("  VISTA_RICLASSIFICAZIONI_CAP A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = 'S') ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((A.ESERCIZIO BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
        SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO') ");
        SQL.append("and   (A.LIVELLO = 4) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCODICE = QV.Get("VISRICCAPCOD", IDVariant.DECIMAL) ;
        }
        QV.Close();
        if (IDL.IsNull(v_VCODICE))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant(" non collegato a codice livello 4"));
          AddDocError(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Capitolo")), (new IDVariant(" "))), IDL.ToString(getCAPITOLO())), (new IDVariant("/"))), IDL.ToString(getARTICOLO())), v_AVVISO).stringValue()); 
          Cancel.set((new IDVariant(-1)));
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.CODICE_FPV_TIT_1 as TIPRICOFPTI1, ");
          SQL.append("  A.CODICE_FPV_TIT_2 as TIPRICOFPTI2 ");
          SQL.append("from ");
          SQL.append("  TIPI_RICLASSIFICAZIONE A ");
          SQL.append("where ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN A_GET_ESERCIZIO_INI_RICL(A.CODICE,A.ESERCIZIO_SCADENZA) AND NVL(A.ESERCIZIO_SCADENZA, 2999))) ");
          SQL.append("and   (A.CODICE = 'MACRO') ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CODFPVTIT1 = QV.Get("TIPRICOFPTI1", IDVariant.INTEGER) ;
            v_CODFPVTIT2 = QV.Get("TIPRICOFPTI2", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCODICE.equals(v_CODFPVTIT1, true) || v_VCODICE.equals(v_CODFPVTIT2, true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("I capitoli del fondo pluriennale vincolato non possono essere Imputazioni di Cronoprogramma"));
            AddDocError(v_AVVISO.stringValue()); 
            Cancel.set((new IDVariant(-1)));
          }
        }
      }
      ListIterator L7 = ENTRATCRONOP.GetLoopCollection().listIterator();
      while (L7.hasNext())
      {
        EntrateCronoprogrammi C7_ENTRATCRONOP = (EntrateCronoprogrammi) L7.next();
        if (v_ESERCIZSPESA.equals((new IDVariant(9999)), true))
        {
          v_ESERCIZSPESA = C7_ENTRATCRONOP.getESERCIZSPESA();
        }
        else
        {
          if ((IDL.IsNull(v_ESERCIZSPESA) && !(IDL.IsNull(C7_ENTRATCRONOP.getESERCIZSPESA()))) || (!(IDL.IsNull(v_ESERCIZSPESA)) && IDL.IsNull(C7_ENTRATCRONOP.getESERCIZSPESA())))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Indicare o annullare l'Esercizio Spesa in tutte le righe dell'Entrata"));
            AddDocError(v_AVVISO.stringValue()); 
            Cancel.set((new IDVariant(-1)));
            break;
          }
        }
      }
    }
    catch (Exception _e)
    {
      throw new RuntimeException("BeforeSave - "+_e.getMessage(),_e);
    }
  }

  // **********************************************************************
  // On Inserting
  // Evento notificato al documento quando varia la proprietà
  // Inserted
  // **********************************************************************
  public void OnInserting()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // On Inserting Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(getPROGREIMPUTA()))
      {
        Cronoprogramma C = null;
        C = (Cronoprogramma)Parent();
        if (!(C == null))
        {
          setPROGREIMPUTA(C.Getmaxprogressivo());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImputazioniCrono", "OnInserting", _e);
    }
  }

  // **********************************************************************
  // After Save
  // Evento notificato al documento al termine della procedura
  // di salvataggio
  // Cancel - Input/Output
  // **********************************************************************
  public void AfterSave(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // After Save Body
      // Corpo Procedura
      // 
      if (this.Inserted())
      {
        setNUOVARIGA((new IDVariant(1)));
      }
    }
    catch (Exception _e)
    {
      throw new RuntimeException("AfterSave - "+_e.getMessage(),_e);
    }
  }

  // **********************************************************************
  // Settotpiani
  // **********************************************************************
  public int Settotpiani ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Settotpiani Body
      // Corpo Procedura
      // 
      if (new IDVariant(PIANICRONOPR.Count()).compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant v_VSUMVARSUCC = null;
        v_VSUMVARSUCC = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  SUM(A.IMPORTO) as SUMVARPICRIM ");
        SQL.append("from ");
        SQL.append("  VAR_PIANI_CRONOPROGRAMMI A ");
        SQL.append("where (A.CRONOPROGRAMMA_ID = " + IDL.CSql(getCRONOPROGRID(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.PROGRESSIVO_IMPUTAZIONE = " + IDL.CSql(getPROGREIMPUTA(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_VAR > " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VSUMVARSUCC = QV.Get("SUMVARPICRIM", IDVariant.DECIMAL) ;
        }
        QV.Close();
        setIMPORTO(IDL.Add(Gettotpiani(), IDL.NullValue(v_VSUMVARSUCC,(new IDVariant(0)))));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImputazioniCrono", "Settotpiani", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Gettotpiani
  // **********************************************************************
  public IDVariant Gettotpiani ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Gettotpiani Body
      // Corpo Procedura
      // 
      IDVariant v_TOT = new IDVariant(0,IDVariant.DECIMAL);
      ListIterator L2 = PIANICRONOPR.GetLoopCollection().listIterator();
      while (L2.hasNext())
      {
        Piani C2_PIANICRONOPR = (Piani) L2.next();
        // v_TOT = IDL.Add(v_TOT, C2_PIANICRONOPR.getIMPORTATTUAL());
        v_TOT = IDL.Add(v_TOT, ((IDL.IsNull(C2_PIANICRONOPR.Gettotvaranno()))?C2_PIANICRONOPR.getIMPORTATTUAL():IDL.Add(C2_PIANICRONOPR.getIMPOINIZESER(), C2_PIANICRONOPR.Gettotvaranno())));
      }
      return v_TOT;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImputazioniCrono", "Gettotpiani", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Ricarica Collection
  // Piani:  - Input
  // Entrate:  - Input
  // **********************************************************************
  public int RicaricaCollection (IDVariant Piani, IDVariant Entrate)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ricarica Collection Body
      // Corpo Procedura
      // 
      PIANICRONOPR.set_Loaded(!(Piani.booleanValue()));
      ENTRATCRONOP.set_Loaded(!(Entrate.booleanValue()));
      LoadFromDB((new IDVariant(1)).intValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImputazioniCrono", "RicaricaCollection", _e);
      return -1;
    }
  }

  
}  
