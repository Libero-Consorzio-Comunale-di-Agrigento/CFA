// **********************************************
// Entrate Cronoprogrammi
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

public class EntrateCronoprogrammi extends com.progamma.doc.IDDocument
{  
  private MyWebEntryPoint MainFrm;
  private IMDBObj IMDB;
  private static String ClassName = null;

  // Property constant definitions
  public static int ENTRATCRONOP_CRONOIDENTRA = 1;
  public static int ENTRATCRONOP_FINANZIAMENT = 2;
  public static int ENTRATCRONOP_ESERCIZIPLUR = 3;
  public static int ENTRATCRONOP_IMPORTO = 4;
  public static int ENTRATCRONOP_CRONOIDSPESA = 5;
  public static int ENTRATCRONOP_UTENTEINSERI = 6;
  public static int ENTRATCRONOP_DATAINSERIME = 7;
  public static int ENTRATCRONOP_UTENTULTIAGG = 8;
  public static int ENTRATCRONOP_DATAULTIMAGG = 9;
  public static int ENTRATCRONOP_PROGREIMPUTA = 10;
  public static int ENTRATCRONOP_ESERCIZSPESA = 11;
  public static int ENTRATCRONOP_CAPITOENTRAT = 12;
  public static int ENTRATCRONOP_ARTICOENTRAT = 13;
  public static int ENTRATCRONOP_DAVARIAZIONE = 14;
  public static int MAX_VARS = 14;
  public static int BASE_VARS = 0;
  public static int BASE_COLLS = 0;

  // Definition of Global Variables
  public IDVariant getCRONOIDENTRA() { return GetPropDirect(ENTRATCRONOP_CRONOIDENTRA); }
  public void setCRONOIDENTRA(IDVariant NewValue) { ChangePropDirect(ENTRATCRONOP_CRONOIDENTRA,NewValue,false); }
  public IDVariant getFINANZIAMENT() { return GetPropDirect(ENTRATCRONOP_FINANZIAMENT); }
  public void setFINANZIAMENT(IDVariant NewValue) { ChangePropDirect(ENTRATCRONOP_FINANZIAMENT,NewValue,false); }
  public IDVariant getESERCIZIPLUR() { return GetPropDirect(ENTRATCRONOP_ESERCIZIPLUR); }
  public void setESERCIZIPLUR(IDVariant NewValue) { ChangePropDirect(ENTRATCRONOP_ESERCIZIPLUR,NewValue,false); }
  public IDVariant getIMPORTO() { return GetPropDirect(ENTRATCRONOP_IMPORTO); }
  public void setIMPORTO(IDVariant NewValue) { ChangePropDirect(ENTRATCRONOP_IMPORTO,NewValue,false); }
  public IDVariant getCRONOIDSPESA() { return GetPropDirect(ENTRATCRONOP_CRONOIDSPESA); }
  public void setCRONOIDSPESA(IDVariant NewValue) { ChangePropDirect(ENTRATCRONOP_CRONOIDSPESA,NewValue,false); }
  public IDVariant getUTENTEINSERI() { return GetPropDirect(ENTRATCRONOP_UTENTEINSERI); }
  public void setUTENTEINSERI(IDVariant NewValue) { ChangePropDirect(ENTRATCRONOP_UTENTEINSERI,NewValue,false); }
  public IDVariant getDATAINSERIME() { return GetPropDirect(ENTRATCRONOP_DATAINSERIME); }
  public void setDATAINSERIME(IDVariant NewValue) { ChangePropDirect(ENTRATCRONOP_DATAINSERIME,NewValue,false); }
  public IDVariant getUTENTULTIAGG() { return GetPropDirect(ENTRATCRONOP_UTENTULTIAGG); }
  public void setUTENTULTIAGG(IDVariant NewValue) { ChangePropDirect(ENTRATCRONOP_UTENTULTIAGG,NewValue,false); }
  public IDVariant getDATAULTIMAGG() { return GetPropDirect(ENTRATCRONOP_DATAULTIMAGG); }
  public void setDATAULTIMAGG(IDVariant NewValue) { ChangePropDirect(ENTRATCRONOP_DATAULTIMAGG,NewValue,false); }
  public IDVariant getPROGREIMPUTA() { return GetPropDirect(ENTRATCRONOP_PROGREIMPUTA); }
  public void setPROGREIMPUTA(IDVariant NewValue) { ChangePropDirect(ENTRATCRONOP_PROGREIMPUTA,NewValue,false); }
  public IDVariant getESERCIZSPESA() { return GetPropDirect(ENTRATCRONOP_ESERCIZSPESA); }
  public void setESERCIZSPESA(IDVariant NewValue) { ChangePropDirect(ENTRATCRONOP_ESERCIZSPESA,NewValue,false); }
  public IDVariant getCAPITOENTRAT() { return GetPropDirect(ENTRATCRONOP_CAPITOENTRAT); }
  public void setCAPITOENTRAT(IDVariant NewValue) { ChangePropDirect(ENTRATCRONOP_CAPITOENTRAT,NewValue,false); }
  public IDVariant getARTICOENTRAT() { return GetPropDirect(ENTRATCRONOP_ARTICOENTRAT); }
  public void setARTICOENTRAT(IDVariant NewValue) { ChangePropDirect(ENTRATCRONOP_ARTICOENTRAT,NewValue,false); }
  public IDVariant getDAVARIAZIONE() { return GetPropDirect(ENTRATCRONOP_DAVARIAZIONE); }
  public void setDAVARIAZIONE(IDVariant NewValue) { ChangePropDirect(ENTRATCRONOP_DAVARIAZIONE,NewValue,false); }
    
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
  public EntrateCronoprogrammi()
  {
  }

  // **********************************************
  // Initialize common framework object
  // **********************************************
  public EntrateCronoprogrammi(MyWebEntryPoint w, IMDBObj imdb)
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
  private static DOMDObj MDOEntrateCronoprogrammi;
  public synchronized static DOMDObj GetDOMD_EntrateCronoprogrammi()
  {
    DOMDProp MDP;
    DOMDColl MDC;
    DOMDLinkedDoc DOC;

    if (MDOEntrateCronoprogrammi != null)
      return MDOEntrateCronoprogrammi;
    else
      MDOEntrateCronoprogrammi = new DOMDObj();
    MDOEntrateCronoprogrammi.ObjTag = "EntrateCronoprogrammi";
    MDOEntrateCronoprogrammi.ObjGUID = "D1C4CDE8-4415-4E6D-83CB-86515C275B87";
    MDOEntrateCronoprogrammi.UIName = "Entrate Cronoprogrammi";
    MDOEntrateCronoprogrammi.Services = 0;
    MDOEntrateCronoprogrammi.BaseProps = 0;
    MDOEntrateCronoprogrammi.BaseColls = 0;
    MDOEntrateCronoprogrammi.DBCode = "ENTRATE_CRONOPROGRAMMI";
    MDOEntrateCronoprogrammi.DBSchema = ".";
    MDOEntrateCronoprogrammi.SequenceCode = "ENTRATE_CRONOPROGRAMMI_$F";
    MDOEntrateCronoprogrammi.DBType = 4;
    MDOEntrateCronoprogrammi.AddQuery("B8B5648B-B919-4790-85E6-822B477009DE", "ENTRATECRONOPROGRAMMI_PK", "select 1 from ENTRATE_CRONOPROGRAMMI where CRONOPROGRAMMA_ID_ENTRATA=~~CRONOPROGRAMMAIDENTRATA~~", "~~!CRONOPROGRAMMAIDENTRATA~~=~~CRONOPROGRAMMAIDENTRATA~~", 1);
    MDOEntrateCronoprogrammi.AddQuery("FAE0AC3E-B1EC-4C21-B838-D21C4A8002A5", "ENTRATECRONOPROGRAMMI_IMPUTAZIONICRONOPROGRAMMI", "select 1 from IMPUTAZIONI_CRONOPROGRAMMI where CRONOPROGRAMMA_ID=~~CRONOPROGRAMMAIDSPESA~~ and PROGRESSIVO_IMPUTAZIONE=~~PROGRESSIVOIMPUTAZIONE~~", "IMPUTAZIONI CRONOPROGRAMMI§~~!CRONOPROGRAMMAIDSPESA~~=~~CRONOPROGRAMMAIDSPESA~~, ~~!PROGRESSIVOIMPUTAZIONE~~=~~PROGRESSIVOIMPUTAZIONE~~", 3);
    MDOEntrateCronoprogrammi.SetNumProp(14);
    MDP = new DOMDProp();
    MDOEntrateCronoprogrammi.SetProp(1,MDP);
    MDP.Index = 1;
    MDP.ObjTag = "CRONOIDENTRA";
    MDP.Name = "CRONOPROGRAMMAIDENTRATA";
    MDP.UIName = "CRONOPROGRAMMA ID ENTRATA";
    MDP.GUID = "176AFDD7-BA54-49C6-B979-6A383F0AA641";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "CRONOPROGRAMMA_ID_ENTRATA";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOEntrateCronoprogrammi.SetProp(2,MDP);
    MDP.Index = 2;
    MDP.ObjTag = "FINANZIAMENT";
    MDP.Name = "FINANZIAMENTO";
    MDP.UIName = "FINANZIAMENTO";
    MDP.GUID = "98761099-E2CF-4772-B195-A08C4A8AE930";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP.DBCode = "FINANZIAMENTO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOEntrateCronoprogrammi.SetProp(3,MDP);
    MDP.Index = 3;
    MDP.ObjTag = "ESERCIZIPLUR";
    MDP.Name = "ESERCIZIOPLUR";
    MDP.UIName = "ESERCIZIO PLUR";
    MDP.GUID = "F12D105A-C08C-4A73-BB11-656CC9C5688E";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ESERCIZIO_PLUR";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOEntrateCronoprogrammi.SetProp(4,MDP);
    MDP.Index = 4;
    MDP.ObjTag = "IMPORTO";
    MDP.Name = "IMPORTO";
    MDP.UIName = "IMPORTO";
    MDP.GUID = "5056172E-EE6F-4693-B8AF-09B0FBDA2A9C";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMPORTO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOEntrateCronoprogrammi.SetProp(5,MDP);
    MDP.Index = 5;
    MDP.ObjTag = "CRONOIDSPESA";
    MDP.Name = "CRONOPROGRAMMAIDSPESA";
    MDP.UIName = "CRONOPROGRAMMA ID SPESA";
    MDP.GUID = "D01F2031-782E-4715-97C3-201554112AEA";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    DOC = new DOMDLinkedDoc("Cronoprogramma", 1);
    MDP.LinkedDoc = DOC;
    DOC.SetName("TESTATECRONOPROGRAMMI");
    DOC.SetLinkedProp(0, Cronoprogramma.CRONOPROGRA1_CRONOPROGRID, EntrateCronoprogrammi.ENTRATCRONOP_CRONOIDSPESA);
    MDP.DBCode = "CRONOPROGRAMMA_ID_SPESA";
    MDP.FK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOEntrateCronoprogrammi.SetProp(6,MDP);
    MDP.Index = 6;
    MDP.ObjTag = "UTENTEINSERI";
    MDP.Name = "UTENTEINSERIMENTO";
    MDP.UIName = "UTENTE INSERIMENTO";
    MDP.GUID = "B11C041E-22CB-4256-B9C3-EA4627BD9D8E";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_INSERIMENTO";
    MDP = new DOMDProp();
    MDOEntrateCronoprogrammi.SetProp(7,MDP);
    MDP.Index = 7;
    MDP.ObjTag = "DATAINSERIME";
    MDP.Name = "DATAINSERIMENTO";
    MDP.UIName = "DATA INSERIMENTO";
    MDP.GUID = "4D5578DF-9825-4646-A58A-399DE9CD209D";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_INSERIMENTO";
    MDP = new DOMDProp();
    MDOEntrateCronoprogrammi.SetProp(8,MDP);
    MDP.Index = 8;
    MDP.ObjTag = "UTENTULTIAGG";
    MDP.Name = "UTENTEULTIMOAGG";
    MDP.UIName = "UTENTE ULTIMO AGG";
    MDP.GUID = "69EBE499-026D-4E7C-98C3-9B8081F9FEF9";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOEntrateCronoprogrammi.SetProp(9,MDP);
    MDP.Index = 9;
    MDP.ObjTag = "DATAULTIMAGG";
    MDP.Name = "DATAULTIMOAGG";
    MDP.UIName = "DATA ULTIMO AGG";
    MDP.GUID = "DDBDF658-976D-40F8-AE2D-6B008FEE305F";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOEntrateCronoprogrammi.SetProp(10,MDP);
    MDP.Index = 10;
    MDP.ObjTag = "PROGREIMPUTA";
    MDP.Name = "PROGRESSIVOIMPUTAZIONE";
    MDP.UIName = "PROGRESSIVO IMPUTAZIONE";
    MDP.GUID = "8AB08A19-1050-48B6-A68D-E9A2A398AA8E";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    DOC = new DOMDLinkedDoc("ImputazioniCrono", 2);
    MDP.LinkedDoc = DOC;
    DOC.SetName("IMPUTAZIONICRONOPROGRAMMI");
    DOC.SetLinkedProp(0, ImputazioniCrono.IMPUTAZCRONO_CRONOPROGRID, EntrateCronoprogrammi.ENTRATCRONOP_CRONOIDSPESA);
    DOC.SetLinkedProp(1, ImputazioniCrono.IMPUTAZCRONO_PROGREIMPUTA, EntrateCronoprogrammi.ENTRATCRONOP_PROGREIMPUTA);
    MDP.DBCode = "PROGRESSIVO_IMPUTAZIONE";
    MDP.FK = true;
    MDP = new DOMDProp();
    MDOEntrateCronoprogrammi.SetProp(11,MDP);
    MDP.Index = 11;
    MDP.ObjTag = "ESERCIZSPESA";
    MDP.Name = "ESERCIZIOSPESA";
    MDP.UIName = "ESERCIZIO SPESA";
    MDP.GUID = "590DB374-B0D5-40CF-BC2E-F84C67D87B26";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ESERCIZIO_SPESA";
    MDP = new DOMDProp();
    MDOEntrateCronoprogrammi.SetProp(12,MDP);
    MDP.Index = 12;
    MDP.ObjTag = "CAPITOENTRAT";
    MDP.Name = "CAPITOLOENTRATA";
    MDP.UIName = "CAPITOLO ENTRATA";
    MDP.GUID = "8C73CFD4-3BCD-41B6-8865-D2551EC30367";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 16;
    MDP.vScale = 0;
    MDP.DBCode = "CAPITOLO_ENTRATA";
    MDP = new DOMDProp();
    MDOEntrateCronoprogrammi.SetProp(13,MDP);
    MDP.Index = 13;
    MDP.ObjTag = "ARTICOENTRAT";
    MDP.Name = "ARTICOLOENTRATA";
    MDP.UIName = "ARTICOLO ENTRATA";
    MDP.GUID = "751E5B69-54CF-4251-90F3-ECB922A31EE1";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "ARTICOLO_ENTRATA";
    MDP = new DOMDProp();
    MDOEntrateCronoprogrammi.SetProp(14,MDP);
    MDP.Index = 14;
    MDP.ObjTag = "DAVARIAZIONE";
    MDP.Name = "DAVARIAZIONE";
    MDP.UIName = "DA VARIAZIONE";
    MDP.GUID = "1160EEE5-99E2-427D-B2A7-57957FC828E2";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "DA_VARIAZIONE";
    MDOEntrateCronoprogrammi.SetNumColl(0);
    return MDOEntrateCronoprogrammi;
  }

  public DOMDObj GetMD()
  {
    DOMDObj md = GetDOMD_EntrateCronoprogrammi();
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
      if (Idx==ENTRATCRONOP_CRONOIDENTRA) { setCRONOIDENTRA(NewValue); break fine; }
      if (Idx==ENTRATCRONOP_FINANZIAMENT) { setFINANZIAMENT(NewValue); break fine; }
      if (Idx==ENTRATCRONOP_ESERCIZIPLUR) { setESERCIZIPLUR(NewValue); break fine; }
      if (Idx==ENTRATCRONOP_IMPORTO) { setIMPORTO(NewValue); break fine; }
      if (Idx==ENTRATCRONOP_CRONOIDSPESA) { setCRONOIDSPESA(NewValue); break fine; }
      if (Idx==ENTRATCRONOP_UTENTEINSERI) { setUTENTEINSERI(NewValue); break fine; }
      if (Idx==ENTRATCRONOP_DATAINSERIME) { setDATAINSERIME(NewValue); break fine; }
      if (Idx==ENTRATCRONOP_UTENTULTIAGG) { setUTENTULTIAGG(NewValue); break fine; }
      if (Idx==ENTRATCRONOP_DATAULTIMAGG) { setDATAULTIMAGG(NewValue); break fine; }
      if (Idx==ENTRATCRONOP_PROGREIMPUTA) { setPROGREIMPUTA(NewValue); break fine; }
      if (Idx==ENTRATCRONOP_ESERCIZSPESA) { setESERCIZSPESA(NewValue); break fine; }
      if (Idx==ENTRATCRONOP_CAPITOENTRAT) { setCAPITOENTRAT(NewValue); break fine; }
      if (Idx==ENTRATCRONOP_ARTICOENTRAT) { setARTICOENTRAT(NewValue); break fine; }
      if (Idx==ENTRATCRONOP_DAVARIAZIONE) { setDAVARIAZIONE(NewValue); break fine; }
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
    
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CRONOPROGRAMMA_ID_ENTRATA as REENCRCRIDEN, ");
    SQL.append("  A.FINANZIAMENTO as RECENTCROFIN, ");
    SQL.append("  A.ESERCIZIO_PLUR as RECENTCRESPL, ");
    SQL.append("  A.IMPORTO as RECENTCROIMP, ");
    SQL.append("  A.CRONOPROGRAMMA_ID_SPESA as REENCRCRIDSP, ");
    SQL.append("  A.UTENTE_INSERIMENTO as RECENTCRUTIN, ");
    SQL.append("  A.DATA_INSERIMENTO as RECENTCRDAIN, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as REENCRUTULAG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as REENCRDAULAG, ");
    SQL.append("  A.PROGRESSIVO_IMPUTAZIONE as RECENTCRPRIM, ");
    SQL.append("  A.ESERCIZIO_SPESA as RECENTCRESSP, ");
    SQL.append("  A.CAPITOLO_ENTRATA as RECENTCRCAEN, ");
    SQL.append("  A.ARTICOLO_ENTRATA as RECENTCRAREN, ");
    SQL.append("  A.DA_VARIAZIONE as RECENTCRDAVA ");
    SqlText[0] = SQL.toString();
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ENTRATE_CRONOPROGRAMMI A ");
    SqlText[1] = SQL.toString();
    SQL = new StringBuffer();
    SqlText[2] = SQL.toString();
    SQL = new StringBuffer();
    SqlText[3] = SQL.toString();
    SQL = new StringBuffer();
    SqlText[4] = SQL.toString();
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.FINANZIAMENTO, ");
    SQL.append("  A.ESERCIZIO_PLUR ");
    SqlText[5] = SQL.toString();
    MasterTableAlias.set(new IDVariant("A"));
    ColAssignment.add(new Integer(ENTRATCRONOP_CRONOIDENTRA));
    ColAssignment.add(new Integer(ENTRATCRONOP_FINANZIAMENT));
    ColAssignment.add(new Integer(ENTRATCRONOP_ESERCIZIPLUR));
    ColAssignment.add(new Integer(ENTRATCRONOP_IMPORTO));
    ColAssignment.add(new Integer(ENTRATCRONOP_CRONOIDSPESA));
    ColAssignment.add(new Integer(ENTRATCRONOP_UTENTEINSERI));
    ColAssignment.add(new Integer(ENTRATCRONOP_DATAINSERIME));
    ColAssignment.add(new Integer(ENTRATCRONOP_UTENTULTIAGG));
    ColAssignment.add(new Integer(ENTRATCRONOP_DATAULTIMAGG));
    ColAssignment.add(new Integer(ENTRATCRONOP_PROGREIMPUTA));
    ColAssignment.add(new Integer(ENTRATCRONOP_ESERCIZSPESA));
    ColAssignment.add(new Integer(ENTRATCRONOP_CAPITOENTRAT));
    ColAssignment.add(new Integer(ENTRATCRONOP_ARTICOENTRAT));
    ColAssignment.add(new Integer(ENTRATCRONOP_DAVARIAZIONE));
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
    
      if (PropIdx==ENTRATCRONOP_CRONOIDENTRA)
      {
        return "A.CRONOPROGRAMMA_ID_ENTRATA";
      }
      if (PropIdx==ENTRATCRONOP_FINANZIAMENT)
      {
        return "A.FINANZIAMENTO";
      }
      if (PropIdx==ENTRATCRONOP_ESERCIZIPLUR)
      {
        return "A.ESERCIZIO_PLUR";
      }
      if (PropIdx==ENTRATCRONOP_IMPORTO)
      {
        return "A.IMPORTO";
      }
      if (PropIdx==ENTRATCRONOP_CRONOIDSPESA)
      {
        return "A.CRONOPROGRAMMA_ID_SPESA";
      }
      if (PropIdx==ENTRATCRONOP_UTENTEINSERI)
      {
        return "A.UTENTE_INSERIMENTO";
      }
      if (PropIdx==ENTRATCRONOP_DATAINSERIME)
      {
        return "A.DATA_INSERIMENTO";
      }
      if (PropIdx==ENTRATCRONOP_UTENTULTIAGG)
      {
        return "A.UTENTE_ULTIMO_AGG";
      }
      if (PropIdx==ENTRATCRONOP_DATAULTIMAGG)
      {
        return "A.DATA_ULTIMO_AGG";
      }
      if (PropIdx==ENTRATCRONOP_PROGREIMPUTA)
      {
        return "A.PROGRESSIVO_IMPUTAZIONE";
      }
      if (PropIdx==ENTRATCRONOP_ESERCIZSPESA)
      {
        return "A.ESERCIZIO_SPESA";
      }
      if (PropIdx==ENTRATCRONOP_CAPITOENTRAT)
      {
        return "A.CAPITOLO_ENTRATA";
      }
      if (PropIdx==ENTRATCRONOP_ARTICOENTRAT)
      {
        return "A.ARTICOLO_ENTRATA";
      }
      if (PropIdx==ENTRATCRONOP_DAVARIAZIONE)
      {
        return "A.DA_VARIAZIONE";
      }
    return "";
  } 


  // **********************************************
  // Class factory
  // **********************************************
  public static EntrateCronoprogrammi CreateEntrateCronoprogrammi()
  {
    return CreateEntrateCronoprogrammi(null, null);
  }
  
  public static EntrateCronoprogrammi CreateEntrateCronoprogrammi(Object mainfrm, Object imdb) { return CreateEntrateCronoprogrammi(mainfrm, imdb, null); } 
  public static EntrateCronoprogrammi CreateEntrateCronoprogrammi(Object mainfrm, Object imdb, Object mainfrmCF)
  {
    EntrateCronoprogrammi newobj = null;
    //
    // Creating object
    if (ClassName == null)
      newobj = new EntrateCronoprogrammi((MyWebEntryPoint)mainfrm, (IMDBObj)imdb); // No class factory
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
          newobj = (EntrateCronoprogrammi)app.CreateDocument(ClassName);
        }
        else
        {
          // Classe con namespace: faccio creare l'istanza al componente corrispondente
          String CompNameSpace = ClassName.substring(0, ClassName.lastIndexOf('.'));
          com.progamma.is.WebEntryPoint cmp = app.GetCompFromNameSpace(CompNameSpace);
          if (cmp != null)
            newobj = (EntrateCronoprogrammi)cmp.CreateDocument(ClassName.substring(ClassName.lastIndexOf('.') + 1));
          else
          {
            app.getDTTObj().AddMsg(DTTEngine.DTTMSG_ERROR, "", 191, "CreateEntrateCronoprogrammi", 
                  "Can't find component " + CompNameSpace + " while handling EntrateCronoprogrammi class factory");
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
    DOMDObj MD = GetDOMD_EntrateCronoprogrammi();
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
    return (obj instanceof EntrateCronoprogrammi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EntrateCronoprogrammi.class.getName() : (Glb.ClassWithPackage(EntrateCronoprogrammi.class) ? EntrateCronoprogrammi.class.getName().substring(EntrateCronoprogrammi.class.getPackage().getName().length() + 1) : EntrateCronoprogrammi.class.getName()));
  }
  
  // **********************************************
  // Event Stubs
  // **********************************************  

  
  // **********************************************
  // Procedure Definition
  // **********************************************
  
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
      if (this.Updated() && !(this.Inserted()))
      {
        setUTENTULTIAGG(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        setDATAULTIMAGG(IDL.Today());
      }
      if ((IDL.IsNull(getCAPITOENTRAT()) && !(IDL.IsNull(getARTICOENTRAT()))) || (!(IDL.IsNull(getCAPITOENTRAT())) && IDL.IsNull(getARTICOENTRAT())))
      {
        IDVariant v_AVVISO = null;
        v_AVVISO = (new IDVariant("Capitolo e Articolo devono essere entrambi indicati o entrambi vuoti."));
        AddDocError(v_AVVISO.stringValue()); 
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      throw new RuntimeException("BeforeSave - "+_e.getMessage(),_e);
    }
  }

  // **********************************************************************
  // On Init
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
      // On Init Body
      // Corpo Procedura
      // 
      setCRONOIDENTRA((new IDVariant(0, IDVariant.DECIMAL)));
      setUTENTEINSERI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      setDATAINSERIME(IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EntrateCronoprogrammi", "OnInit", _e);
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
      setCRONOIDENTRA((new IDVariant(0, IDVariant.DECIMAL)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EntrateCronoprogrammi", "OnInserting", _e);
    }
  }

  
}  
