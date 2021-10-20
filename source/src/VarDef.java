// **********************************************
// Var Def
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

public class VarDef extends com.progamma.doc.IDDocument
{  
  private MyWebEntryPoint MainFrm;
  private IMDBObj IMDB;
  private static String ClassName = null;

  // Property constant definitions
  public static int VARDEF_PROGRESSIVO = 1;
  public static int VARDEF_ESERCIZIO = 2;
  public static int VARDEF_ES = 3;
  public static int VARDEF_CAPITOLO = 4;
  public static int VARDEF_ARTICOLO = 5;
  public static int VARDEF_ANNODEL = 6;
  public static int VARDEF_NUMERODEL = 7;
  public static int VARDEF_SEDEDEL = 8;
  public static int VARDEF_DATAREG = 9;
  public static int VARDEF_IMPORTO = 10;
  public static int VARDEF_DESCRIZIONE = 11;
  public static int VARDEF_TIPOVAR = 12;
  public static int VARDEF_ANNOPROPOSTA = 13;
  public static int VARDEF_UNITAPROPONE = 14;
  public static int VARDEF_NUMEROPROPOS = 15;
  public static int VARDEF_VARBIL = 16;
  public static int VARDEF_CONSSVILUPPO = 17;
  public static int VARDEF_DDATAREG = 18;
  public static int VARDEF_ISTITUZIONNC = 19;
  public static int VARDEF_PROGETTOID = 20;
  public static int VARDEF_FINANZIAMENTO = 21;
  public static int VARDEF_OPERA = 22;
  public static int VARDEF_PROGUNITORGA = 23;
  public static int VARDEF_UTENTEINSERI = 24;
  public static int VARDEF_DATAINSERIME = 25;
  public static int VARDEF_UTENTULTIAGG = 26;
  public static int VARDEF_DATAULTIMAGG = 27;
  public static int VARDEF_PROUNIORGINS = 28;
  public static int VARDEF_FATTORE = 29;
  public static int VARDEF_CENTRO = 30;
  public static int VARDEF_SCHEDOBIETID = 31;
  public static int VARDEF_PROGRPRIMVAR = 32;
  public static int VARDEF_IMPORTOCASSA = 33;
  public static int VARDEF_REISCRIDAIMP = 34;
  public static int VARDEF_REISCRIDASTN = 35;
  public static int VARDEF_INSERTED = 36;
  public static int VARDEF_ANNOIMP = 37;
  public static int VARDEF_NUMEROIMP = 38;
  public static int VARDEF_ANNOESIGIBIL = 39;
  public static int VARDEF_PROGREVARIMP = 40;
  public static int VARDEF_CRONOPROGRID = 41;
  public static int VARDEF_PROGIMPUCRON = 42;
  public static int VARDEF_ANNOPLURCRON = 43;
  public static int VARDEF_PROGRVARCRON = 44;
  public static int VARDEF_ANNOACC = 45;
  public static int VARDEF_NUMEROACC = 46;
  public static int VARDEF_PROGREVARACC = 47;
  public static int VARDEF_OBIETTIVGEST = 48;
  public static int VARDEF_IMPORTORIGIN = 49;
  public static int VARDEF_VARCOMFK = 1;
  public static int VARDEF_PVBSCHEDOBIE = 2;
  public static int MAX_VARS = 49;
  public static int BASE_VARS = 0;
  public static int BASE_COLLS = 0;

  // Definition of Global Variables
  private IDVariant OLDCAPITOLO = new IDVariant(0,IDVariant.STRING);
  public com.progamma.doc.IDCollection VARCOMFK = new com.progamma.doc.IDCollection();
  public com.progamma.doc.IDCollection PVBSCHEDOBIE = new com.progamma.doc.IDCollection();
  public IDVariant getPROGRESSIVO() { return GetPropDirect(VARDEF_PROGRESSIVO); }
  public void setPROGRESSIVO(IDVariant NewValue) { ChangePropDirect(VARDEF_PROGRESSIVO,NewValue,false); }
  public IDVariant getESERCIZIO() { return GetPropDirect(VARDEF_ESERCIZIO); }
  public void setESERCIZIO(IDVariant NewValue) { ChangePropDirect(VARDEF_ESERCIZIO,NewValue,false); }
  public IDVariant getES() { return GetPropDirect(VARDEF_ES); }
  public void setES(IDVariant NewValue) { ChangePropDirect(VARDEF_ES,NewValue,false); }
  public IDVariant getCAPITOLO() { return GetPropDirect(VARDEF_CAPITOLO); }
  public void setCAPITOLO(IDVariant NewValue) { ChangePropDirect(VARDEF_CAPITOLO,NewValue,false); }
  public IDVariant getARTICOLO() { return GetPropDirect(VARDEF_ARTICOLO); }
  public void setARTICOLO(IDVariant NewValue) { ChangePropDirect(VARDEF_ARTICOLO,NewValue,false); }
  public IDVariant getANNODEL() { return GetPropDirect(VARDEF_ANNODEL); }
  public void setANNODEL(IDVariant NewValue) { ChangePropDirect(VARDEF_ANNODEL,NewValue,false); }
  public IDVariant getNUMERODEL() { return GetPropDirect(VARDEF_NUMERODEL); }
  public void setNUMERODEL(IDVariant NewValue) { ChangePropDirect(VARDEF_NUMERODEL,NewValue,false); }
  public IDVariant getSEDEDEL() { return GetPropDirect(VARDEF_SEDEDEL); }
  public void setSEDEDEL(IDVariant NewValue) { ChangePropDirect(VARDEF_SEDEDEL,NewValue,false); }
  public IDVariant getDATAREG() { return GetPropDirect(VARDEF_DATAREG); }
  public void setDATAREG(IDVariant NewValue) { ChangePropDirect(VARDEF_DATAREG,NewValue,false); }
  public IDVariant getIMPORTO() { return GetPropDirect(VARDEF_IMPORTO); }
  public void setIMPORTO(IDVariant NewValue) { ChangePropDirect(VARDEF_IMPORTO,NewValue,false); }
  public IDVariant getDESCRIZIONE() { return GetPropDirect(VARDEF_DESCRIZIONE); }
  public void setDESCRIZIONE(IDVariant NewValue) { ChangePropDirect(VARDEF_DESCRIZIONE,NewValue,false); }
  public IDVariant getTIPOVAR() { return GetPropDirect(VARDEF_TIPOVAR); }
  public void setTIPOVAR(IDVariant NewValue) { ChangePropDirect(VARDEF_TIPOVAR,NewValue,false); }
  public IDVariant getANNOPROPOSTA() { return GetPropDirect(VARDEF_ANNOPROPOSTA); }
  public void setANNOPROPOSTA(IDVariant NewValue) { ChangePropDirect(VARDEF_ANNOPROPOSTA,NewValue,false); }
  public IDVariant getUNITAPROPONE() { return GetPropDirect(VARDEF_UNITAPROPONE); }
  public void setUNITAPROPONE(IDVariant NewValue) { ChangePropDirect(VARDEF_UNITAPROPONE,NewValue,false); }
  public IDVariant getNUMEROPROPOS() { return GetPropDirect(VARDEF_NUMEROPROPOS); }
  public void setNUMEROPROPOS(IDVariant NewValue) { ChangePropDirect(VARDEF_NUMEROPROPOS,NewValue,false); }
  public IDVariant getVARBIL() { return GetPropDirect(VARDEF_VARBIL); }
  public void setVARBIL(IDVariant NewValue) { ChangePropDirect(VARDEF_VARBIL,NewValue,false); }
  public IDVariant getCONSSVILUPPO() { return GetPropDirect(VARDEF_CONSSVILUPPO); }
  public void setCONSSVILUPPO(IDVariant NewValue) { ChangePropDirect(VARDEF_CONSSVILUPPO,NewValue,false); }
  public IDVariant getDDATAREG() { return GetPropDirect(VARDEF_DDATAREG); }
  public void setDDATAREG(IDVariant NewValue) { ChangePropDirect(VARDEF_DDATAREG,NewValue,false); }
  public IDVariant getISTITUZIONNC() { return GetPropDirect(VARDEF_ISTITUZIONNC); }
  public void setISTITUZIONNC(IDVariant NewValue) { ChangePropDirect(VARDEF_ISTITUZIONNC,NewValue,false); }
  public IDVariant getPROGETTOID() { return GetPropDirect(VARDEF_PROGETTOID); }
  public void setPROGETTOID(IDVariant NewValue) { ChangePropDirect(VARDEF_PROGETTOID,NewValue,false); }
  public IDVariant getFINANZIAMENTO() { return GetPropDirect(VARDEF_FINANZIAMENTO); }
  public void setFINANZIAMENTO(IDVariant NewValue) { ChangePropDirect(VARDEF_FINANZIAMENTO,NewValue,false); }
  public IDVariant getOPERA() { return GetPropDirect(VARDEF_OPERA); }
  public void setOPERA(IDVariant NewValue) { ChangePropDirect(VARDEF_OPERA,NewValue,false); }
  public IDVariant getPROGUNITORGA() { return GetPropDirect(VARDEF_PROGUNITORGA); }
  public void setPROGUNITORGA(IDVariant NewValue) { ChangePropDirect(VARDEF_PROGUNITORGA,NewValue,false); }
  public IDVariant getUTENTEINSERI() { return GetPropDirect(VARDEF_UTENTEINSERI); }
  public void setUTENTEINSERI(IDVariant NewValue) { ChangePropDirect(VARDEF_UTENTEINSERI,NewValue,false); }
  public IDVariant getDATAINSERIME() { return GetPropDirect(VARDEF_DATAINSERIME); }
  public void setDATAINSERIME(IDVariant NewValue) { ChangePropDirect(VARDEF_DATAINSERIME,NewValue,false); }
  public IDVariant getUTENTULTIAGG() { return GetPropDirect(VARDEF_UTENTULTIAGG); }
  public void setUTENTULTIAGG(IDVariant NewValue) { ChangePropDirect(VARDEF_UTENTULTIAGG,NewValue,false); }
  public IDVariant getDATAULTIMAGG() { return GetPropDirect(VARDEF_DATAULTIMAGG); }
  public void setDATAULTIMAGG(IDVariant NewValue) { ChangePropDirect(VARDEF_DATAULTIMAGG,NewValue,false); }
  public IDVariant getPROUNIORGINS() { return GetPropDirect(VARDEF_PROUNIORGINS); }
  public void setPROUNIORGINS(IDVariant NewValue) { ChangePropDirect(VARDEF_PROUNIORGINS,NewValue,false); }
  public IDVariant getFATTORE() { return GetPropDirect(VARDEF_FATTORE); }
  public void setFATTORE(IDVariant NewValue) { ChangePropDirect(VARDEF_FATTORE,NewValue,false); }
  public IDVariant getCENTRO() { return GetPropDirect(VARDEF_CENTRO); }
  public void setCENTRO(IDVariant NewValue) { ChangePropDirect(VARDEF_CENTRO,NewValue,false); }
  public IDVariant getSCHEDOBIETID() { return GetPropDirect(VARDEF_SCHEDOBIETID); }
  public void setSCHEDOBIETID(IDVariant NewValue) { ChangePropDirect(VARDEF_SCHEDOBIETID,NewValue,false); }
  public IDVariant getPROGRPRIMVAR() { return GetPropDirect(VARDEF_PROGRPRIMVAR); }
  public void setPROGRPRIMVAR(IDVariant NewValue) { ChangePropDirect(VARDEF_PROGRPRIMVAR,NewValue,false); }
  public IDVariant getIMPORTOCASSA() { return GetPropDirect(VARDEF_IMPORTOCASSA); }
  public void setIMPORTOCASSA(IDVariant NewValue) { ChangePropDirect(VARDEF_IMPORTOCASSA,NewValue,false); }
  public IDVariant getREISCRIDAIMP() { return GetPropDirect(VARDEF_REISCRIDAIMP); }
  public void setREISCRIDAIMP(IDVariant NewValue) { ChangePropDirect(VARDEF_REISCRIDAIMP,NewValue,false); }
  public IDVariant getREISCRIDASTN() { return GetPropDirect(VARDEF_REISCRIDASTN); }
  public void setREISCRIDASTN(IDVariant NewValue) { ChangePropDirect(VARDEF_REISCRIDASTN,NewValue,false); }
  public IDVariant getINSERTED() { return GetPropDirect(VARDEF_INSERTED); }
  public void setINSERTED(IDVariant NewValue) { ChangePropDirect(VARDEF_INSERTED,NewValue,false); }
  public IDVariant getANNOIMP() { return GetPropDirect(VARDEF_ANNOIMP); }
  public void setANNOIMP(IDVariant NewValue) { ChangePropDirect(VARDEF_ANNOIMP,NewValue,false); }
  public IDVariant getNUMEROIMP() { return GetPropDirect(VARDEF_NUMEROIMP); }
  public void setNUMEROIMP(IDVariant NewValue) { ChangePropDirect(VARDEF_NUMEROIMP,NewValue,false); }
  public IDVariant getANNOESIGIBIL() { return GetPropDirect(VARDEF_ANNOESIGIBIL); }
  public void setANNOESIGIBIL(IDVariant NewValue) { ChangePropDirect(VARDEF_ANNOESIGIBIL,NewValue,false); }
  public IDVariant getPROGREVARIMP() { return GetPropDirect(VARDEF_PROGREVARIMP); }
  public void setPROGREVARIMP(IDVariant NewValue) { ChangePropDirect(VARDEF_PROGREVARIMP,NewValue,false); }
  public IDVariant getCRONOPROGRID() { return GetPropDirect(VARDEF_CRONOPROGRID); }
  public void setCRONOPROGRID(IDVariant NewValue) { ChangePropDirect(VARDEF_CRONOPROGRID,NewValue,false); }
  public IDVariant getPROGIMPUCRON() { return GetPropDirect(VARDEF_PROGIMPUCRON); }
  public void setPROGIMPUCRON(IDVariant NewValue) { ChangePropDirect(VARDEF_PROGIMPUCRON,NewValue,false); }
  public IDVariant getANNOPLURCRON() { return GetPropDirect(VARDEF_ANNOPLURCRON); }
  public void setANNOPLURCRON(IDVariant NewValue) { ChangePropDirect(VARDEF_ANNOPLURCRON,NewValue,false); }
  public IDVariant getPROGRVARCRON() { return GetPropDirect(VARDEF_PROGRVARCRON); }
  public void setPROGRVARCRON(IDVariant NewValue) { ChangePropDirect(VARDEF_PROGRVARCRON,NewValue,false); }
  public IDVariant getANNOACC() { return GetPropDirect(VARDEF_ANNOACC); }
  public void setANNOACC(IDVariant NewValue) { ChangePropDirect(VARDEF_ANNOACC,NewValue,false); }
  public IDVariant getNUMEROACC() { return GetPropDirect(VARDEF_NUMEROACC); }
  public void setNUMEROACC(IDVariant NewValue) { ChangePropDirect(VARDEF_NUMEROACC,NewValue,false); }
  public IDVariant getPROGREVARACC() { return GetPropDirect(VARDEF_PROGREVARACC); }
  public void setPROGREVARACC(IDVariant NewValue) { ChangePropDirect(VARDEF_PROGREVARACC,NewValue,false); }
  public IDVariant getOBIETTIVGEST() { return GetPropDirect(VARDEF_OBIETTIVGEST); }
  public void setOBIETTIVGEST(IDVariant NewValue) { ChangePropDirect(VARDEF_OBIETTIVGEST,NewValue,false); }
  public IDVariant getIMPORTORIGIN() { return GetPropDirect(VARDEF_IMPORTORIGIN); }
  public void setIMPORTORIGIN(IDVariant NewValue) { ChangePropDirect(VARDEF_IMPORTORIGIN,NewValue,true); }
    
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
  public VarDef()
  {
  }

  // **********************************************
  // Initialize common framework object
  // **********************************************
  public VarDef(MyWebEntryPoint w, IMDBObj imdb)
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
  private static DOMDObj MDOVarDef;
  public synchronized static DOMDObj GetDOMD_VarDef()
  {
    DOMDProp MDP;
    DOMDColl MDC;
    DOMDLinkedDoc DOC;

    if (MDOVarDef != null)
      return MDOVarDef;
    else
      MDOVarDef = new DOMDObj();
    MDOVarDef.ObjTag = "VarDef";
    MDOVarDef.ObjGUID = "CC680519-1831-4936-850C-B1B81FF660A8";
    MDOVarDef.UIName = "Variazioni Definitive";
    MDOVarDef.Services = 0;
    MDOVarDef.BaseProps = 0;
    MDOVarDef.BaseColls = 0;
    MDOVarDef.DBCode = "VARCOM";
    MDOVarDef.DBSchema = ".";
    MDOVarDef.SequenceCode = "VARCOM_$F";
    MDOVarDef.DBType = 4;
    MDOVarDef.AddQuery("DF3AF201-22C8-476E-BADC-5E948613A5F7", "VARCOM_PK", "select 1 from VARCOM where PROGRESSIVO=~~PROGRESSIVO~~", "~~!PROGRESSIVO~~=~~PROGRESSIVO~~", 1);
    MDOVarDef.AddQuery("B42C75D2-B572-4389-9480-70CC6E0E6096", "VARCOM_VARCOMFK", "select 1 from VARCOM where PROGRESSIVO=~~PROGRESSIVOPRIMAVAR~~", "VARCOM§~~!PROGRESSIVOPRIMAVAR~~=~~PROGRESSIVOPRIMAVAR~~", 3);
    MDOVarDef.AddQuery("B42C75D2-B572-4389-9480-70CC6E0E6096", "VARCOM_VARCOMFK", "select 1 from VARCOM where PROGRESSIVO_PRIMA_VAR=~~PROGRESSIVO~~", "VARCOM§~~!PROGRESSIVO~~=~~PROGRESSIVO~~", 4);
    MDOVarDef.SetNumProp(49);
    MDP = new DOMDProp();
    MDOVarDef.SetProp(1,MDP);
    MDP.Index = 1;
    MDP.ObjTag = "PROGRESSIVO";
    MDP.Name = "PROGRESSIVO";
    MDP.UIName = "PROGRESSIVO";
    MDP.GUID = "BC2662B7-AA40-4A88-9534-FAC371C5F6CD";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "PROGRESSIVO";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarDef.SetProp(2,MDP);
    MDP.Index = 2;
    MDP.ObjTag = "ESERCIZIO";
    MDP.Name = "ESERCIZIO";
    MDP.UIName = "ESERCIZIO";
    MDP.GUID = "635F5754-EDF5-485A-A7D8-6316B001BC35";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ESERCIZIO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarDef.SetProp(3,MDP);
    MDP.Index = 3;
    MDP.ObjTag = "ES";
    MDP.Name = "ES";
    MDP.UIName = "E S";
    MDP.GUID = "A32255F5-1767-4003-ABFF-06B984F83CEB";
    MDP.Visible = true;
    MDP.Domain = "\"Entrata\",\"E\",\"Spesa\",\"S\"";
    MDP.DataType = 5;
    MDP.MaxLength = 1;
    MDP.vScale = 0;
    MDP.DBCode = "E_S";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarDef.SetProp(4,MDP);
    MDP.Index = 4;
    MDP.ObjTag = "CAPITOLO";
    MDP.Name = "CAPITOLO";
    MDP.UIName = "CAPITOLO";
    MDP.GUID = "18DBDB55-5B65-4AE4-8D9E-3DC5615A7B8D";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 16;
    MDP.vScale = 0;
    MDP.DBCode = "CAPITOLO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarDef.SetProp(5,MDP);
    MDP.Index = 5;
    MDP.ObjTag = "ARTICOLO";
    MDP.Name = "ARTICOLO";
    MDP.UIName = "ARTICOLO";
    MDP.GUID = "D77432D0-3FB1-4B11-B566-42E896260FFC";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "ARTICOLO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarDef.SetProp(6,MDP);
    MDP.Index = 6;
    MDP.ObjTag = "ANNODEL";
    MDP.Name = "ANNODEL";
    MDP.UIName = "ANNO DEL";
    MDP.GUID = "795473AE-839B-4D54-A6C8-553E3460E33A";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_DEL";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(7,MDP);
    MDP.Index = 7;
    MDP.ObjTag = "NUMERODEL";
    MDP.Name = "NUMERODEL";
    MDP.UIName = "NUMERO DEL";
    MDP.GUID = "C07114EC-4B3E-49A7-A1CE-D0A0D1C02806";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 6;
    MDP.vScale = 0;
    MDP.DBCode = "NUMERO_DEL";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(8,MDP);
    MDP.Index = 8;
    MDP.ObjTag = "SEDEDEL";
    MDP.Name = "SEDEDEL";
    MDP.UIName = "SEDE DEL";
    MDP.GUID = "A490A246-3498-44BA-9CE5-E3547FC6EC67";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 255;
    MDP.vScale = 0;
    MDP.DBCode = "SEDE_DEL";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(9,MDP);
    MDP.Index = 9;
    MDP.ObjTag = "DATAREG";
    MDP.Name = "DATAREG";
    MDP.UIName = "DATA REG";
    MDP.GUID = "2B7DDF56-7FDE-4BE1-9401-C3F076AC5EC0";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 7;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_REG";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(10,MDP);
    MDP.Index = 10;
    MDP.ObjTag = "IMPORTO";
    MDP.Name = "IMPORTO";
    MDP.UIName = "IMPORTO";
    MDP.GUID = "7C8BEB6A-9765-4F76-ABA7-05D03F3BE15E";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMPORTO";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(11,MDP);
    MDP.Index = 11;
    MDP.ObjTag = "DESCRIZIONE";
    MDP.Name = "DESCRIZIONE";
    MDP.UIName = "DESCRIZIONE";
    MDP.GUID = "4C772666-AD05-4AA6-87A9-74B304E6ED56";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 140;
    MDP.vScale = 0;
    MDP.DBCode = "DESCRIZIONE";
    MDP.Nullable = false;
    MDP.DescribeRow = true;
    MDP = new DOMDProp();
    MDOVarDef.SetProp(12,MDP);
    MDP.Index = 12;
    MDP.ObjTag = "TIPOVAR";
    MDP.Name = "TIPOVAR";
    MDP.UIName = "TIPO VAR";
    MDP.GUID = "7C2FDA63-981A-42FB-8AFD-386D7FF9D80D";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "TIPO_VAR";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarDef.SetProp(13,MDP);
    MDP.Index = 13;
    MDP.ObjTag = "ANNOPROPOSTA";
    MDP.Name = "ANNOPROPOSTA";
    MDP.UIName = "ANNO PROPOSTA";
    MDP.GUID = "708A6C8B-C1BB-414D-9003-04523398A35E";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_PROPOSTA";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(14,MDP);
    MDP.Index = 14;
    MDP.ObjTag = "UNITAPROPONE";
    MDP.Name = "UNITAPROPONENTE";
    MDP.UIName = "UNITA PROPONENTE";
    MDP.GUID = "EE280336-74DE-4AEF-B055-43253A740288";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 255;
    MDP.vScale = 0;
    MDP.DBCode = "UNITA_PROPONENTE";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(15,MDP);
    MDP.Index = 15;
    MDP.ObjTag = "NUMEROPROPOS";
    MDP.Name = "NUMEROPROPOSTA";
    MDP.UIName = "NUMERO PROPOSTA";
    MDP.GUID = "D8A4AFA9-F9EC-41CB-8233-B5BFCA47D065";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "NUMERO_PROPOSTA";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(16,MDP);
    MDP.Index = 16;
    MDP.ObjTag = "VARBIL";
    MDP.Name = "VARBIL";
    MDP.UIName = "VAR BIL";
    MDP.GUID = "59174DF1-EAD9-42D3-9FCE-E06E3475E7D9";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "VAR_BIL";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(17,MDP);
    MDP.Index = 17;
    MDP.ObjTag = "CONSSVILUPPO";
    MDP.Name = "CONSSVILUPPO";
    MDP.UIName = "CONS SVILUPPO";
    MDP.GUID = "CF5262FB-9E8E-4404-8A98-810CB5E0DB34";
    MDP.Visible = true;
    MDP.Domain = "\"Consolidato\",\"C\",\"Sviluppo\",\"S\"";
    MDP.DataType = 5;
    MDP.MaxLength = 1;
    MDP.vScale = 0;
    MDP.DBCode = "CONS_SVILUPPO";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(18,MDP);
    MDP.Index = 18;
    MDP.ObjTag = "DDATAREG";
    MDP.Name = "DDATAREG";
    MDP.UIName = "D DATA REG";
    MDP.GUID = "4E62087C-715D-42B3-827C-06BD9AAA2204";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "D_DATA_REG";
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOVarDef.SetProp(19,MDP);
    MDP.Index = 19;
    MDP.ObjTag = "ISTITUZIONNC";
    MDP.Name = "ISTITUZIONENC";
    MDP.UIName = "ISTITUZIONE NC";
    MDP.GUID = "5DAFB080-80CE-477D-AC41-CC3ECE3FE4DE";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "ISTITUZIONE_NC";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(20,MDP);
    MDP.Index = 20;
    MDP.ObjTag = "PROGETTOID";
    MDP.Name = "PROGETTOID";
    MDP.UIName = "PROGETTO ID";
    MDP.GUID = "C67FBB04-B2A8-4C5E-B53B-47B342812621";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 9;
    MDP.vScale = 0;
    MDP.DBCode = "PROGETTO_ID";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(21,MDP);
    MDP.Index = 21;
    MDP.ObjTag = "FINANZIAMENTO";
    MDP.Name = "FINANZIAMENTO";
    MDP.UIName = "FINANZIAMENTO";
    MDP.GUID = "AC307A11-DCFC-4497-AD5B-68997E85B2FC";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP.DBCode = "FINANZIAMENTO";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(22,MDP);
    MDP.Index = 22;
    MDP.ObjTag = "OPERA";
    MDP.Name = "OPERA";
    MDP.UIName = "OPERA";
    MDP.GUID = "0670B69C-734F-4987-B7F9-33EBE9EA29D3";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP.DBCode = "OPERA";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(23,MDP);
    MDP.Index = 23;
    MDP.ObjTag = "PROGUNITORGA";
    MDP.Name = "PROGRUNITAORGANIZZATIVA";
    MDP.UIName = "PROGR UNITA ORGANIZZATIVA";
    MDP.GUID = "9CA8D8D3-DEFC-4307-8DC7-553B0BA0D88C";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "PROGR_UNITA_ORGANIZZATIVA";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(24,MDP);
    MDP.Index = 24;
    MDP.ObjTag = "UTENTEINSERI";
    MDP.Name = "UTENTEINSERIMENTO";
    MDP.UIName = "UTENTE INSERIMENTO";
    MDP.GUID = "853EC063-BCEF-440B-B1D0-16BEC2EFF822";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_INSERIMENTO";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(25,MDP);
    MDP.Index = 25;
    MDP.ObjTag = "DATAINSERIME";
    MDP.Name = "DATAINSERIMENTO";
    MDP.UIName = "DATA INSERIMENTO";
    MDP.GUID = "69EEF4FA-E308-440C-BB94-DFF1A6C326FE";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_INSERIMENTO";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(26,MDP);
    MDP.Index = 26;
    MDP.ObjTag = "UTENTULTIAGG";
    MDP.Name = "UTENTEULTIMOAGG";
    MDP.UIName = "UTENTE ULTIMO AGG";
    MDP.GUID = "1D1FEEFA-A878-47A5-B35D-5265F240D088";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(27,MDP);
    MDP.Index = 27;
    MDP.ObjTag = "DATAULTIMAGG";
    MDP.Name = "DATAULTIMOAGG";
    MDP.UIName = "DATA ULTIMO AGG";
    MDP.GUID = "9ACA2C40-B52C-4498-A2E8-3870A0B51BBF";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(28,MDP);
    MDP.Index = 28;
    MDP.ObjTag = "PROUNIORGINS";
    MDP.Name = "PROGRUNITAORGANIZZATIVAINS";
    MDP.UIName = "PROGR UNITA ORGANIZZATIVA INS";
    MDP.GUID = "48AF97C0-6AF6-4FF2-984A-268ACFB71B31";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "PROGR_UNITA_ORGANIZZATIVA_INS";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(29,MDP);
    MDP.Index = 29;
    MDP.ObjTag = "FATTORE";
    MDP.Name = "FATTORE";
    MDP.UIName = "FATTORE";
    MDP.GUID = "3E041D69-7774-4712-A1C1-3CCF15A58497";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 16;
    MDP.vScale = 0;
    MDP.DBCode = "FATTORE";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(30,MDP);
    MDP.Index = 30;
    MDP.ObjTag = "CENTRO";
    MDP.Name = "CENTRO";
    MDP.UIName = "CENTRO";
    MDP.GUID = "4EF129B5-6C6A-4511-BFC7-48EF54B68D3E";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 16;
    MDP.vScale = 0;
    MDP.DBCode = "CENTRO";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(31,MDP);
    MDP.Index = 31;
    MDP.ObjTag = "SCHEDOBIETID";
    MDP.Name = "SCHEDAOBIETTIVOID";
    MDP.UIName = "SCHEDA OBIETTIVO ID";
    MDP.GUID = "07A5BFAC-FC28-4201-BBA9-E79FBA44B24F";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "SCHEDA_OBIETTIVO_ID";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(32,MDP);
    MDP.Index = 32;
    MDP.ObjTag = "PROGRPRIMVAR";
    MDP.Name = "PROGRESSIVOPRIMAVAR";
    MDP.UIName = "PROGRESSIVO PRIMA VAR";
    MDP.GUID = "17092EFE-DBE2-42A1-B842-FD67E611E4BA";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    DOC = new DOMDLinkedDoc("VarDef", 1);
    MDP.LinkedDoc = DOC;
    DOC.SetName("VARCOMFK");
    DOC.SetLinkedProp(0, VarDef.VARDEF_PROGRESSIVO, VarDef.VARDEF_PROGRPRIMVAR);
    MDP.DBCode = "PROGRESSIVO_PRIMA_VAR";
    MDP.FK = true;
    MDP = new DOMDProp();
    MDOVarDef.SetProp(33,MDP);
    MDP.Index = 33;
    MDP.ObjTag = "IMPORTOCASSA";
    MDP.Name = "IMPORTOCASSA";
    MDP.UIName = "IMPORTO CASSA";
    MDP.GUID = "CB7D2CCE-77FD-4A65-9338-4BDCEF624B6B";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMPORTO_CASSA";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(34,MDP);
    MDP.Index = 34;
    MDP.ObjTag = "REISCRIDAIMP";
    MDP.Name = "REISCRIZIONEDAIMP";
    MDP.UIName = "REISCRIZIONE DA IMP";
    MDP.GUID = "4EF9C126-22FE-4C5B-8DCA-37F3A9C705F7";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "REISCRIZIONE_DA_IMP";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(35,MDP);
    MDP.Index = 35;
    MDP.ObjTag = "REISCRIDASTN";
    MDP.Name = "REISCRIZIONEDASTN";
    MDP.UIName = "REISCRIZIONE DA STN";
    MDP.GUID = "397151A8-57B2-440C-A40F-3DDA051DEB9D";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "REISCRIZIONE_DA_STN";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(36,MDP);
    MDP.Index = 36;
    MDP.ObjTag = "INSERTED";
    MDP.Name = "Inserted";
    MDP.UIName = "Inserted";
    MDP.GUID = "E52687F6-952D-4FC5-ABC3-896DA442E5A3";
    MDP.DataType = 11;
    MDP.MaxLength = 9;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOVarDef.SetProp(37,MDP);
    MDP.Index = 37;
    MDP.ObjTag = "ANNOIMP";
    MDP.Name = "ANNOIMP";
    MDP.UIName = "ANNO IMP";
    MDP.GUID = "589D5816-D144-4588-BED9-6DD9FDE2FA71";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_IMP";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(38,MDP);
    MDP.Index = 38;
    MDP.ObjTag = "NUMEROIMP";
    MDP.Name = "NUMEROIMP";
    MDP.UIName = "NUMERO IMP";
    MDP.GUID = "03A1C106-A724-43E4-92C6-E90C1012E290";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP.DBCode = "NUMERO_IMP";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(39,MDP);
    MDP.Index = 39;
    MDP.ObjTag = "ANNOESIGIBIL";
    MDP.Name = "ANNOESIGIBILITA";
    MDP.UIName = "ANNO ESIGIBILITA";
    MDP.GUID = "2AA84A54-9D7A-4705-A2A0-F555C5A78FCE";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_ESIGIBILITA";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(40,MDP);
    MDP.Index = 40;
    MDP.ObjTag = "PROGREVARIMP";
    MDP.Name = "PROGRESSIVOVARIMP";
    MDP.UIName = "PROGRESSIVO VARIMP";
    MDP.GUID = "6172FE73-86A8-4980-902F-965324902CB9";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "PROGRESSIVO_VARIMP";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(41,MDP);
    MDP.Index = 41;
    MDP.ObjTag = "CRONOPROGRID";
    MDP.Name = "CRONOPROGRAMMAID";
    MDP.UIName = "CRONOPROGRAMMA ID";
    MDP.GUID = "ABCEE3A6-4DEA-4189-AF88-E4F5D04FAD20";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "CRONOPROGRAMMA_ID";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(42,MDP);
    MDP.Index = 42;
    MDP.ObjTag = "PROGIMPUCRON";
    MDP.Name = "PROGRESSIVOIMPUTAZIONECRONO";
    MDP.UIName = "PROGRESSIVO IMPUTAZIONE CRONO";
    MDP.GUID = "4878C1BD-8AA7-4B7F-8701-AEB25D33DF09";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "PROGRESSIVO_IMPUTAZIONE_CRONO";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(43,MDP);
    MDP.Index = 43;
    MDP.ObjTag = "ANNOPLURCRON";
    MDP.Name = "ANNOPLURCRONO";
    MDP.UIName = "ANNO PLUR CRONO";
    MDP.GUID = "D9B5EE37-53DF-484C-A7BD-0E05FF3C9820";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_PLUR_CRONO";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(44,MDP);
    MDP.Index = 44;
    MDP.ObjTag = "PROGRVARCRON";
    MDP.Name = "PROGRESSIVOVARCRONO";
    MDP.UIName = "PROGRESSIVO VAR CRONO";
    MDP.GUID = "7152E194-FDFD-4042-B5E4-CDE655842300";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "PROGRESSIVO_VAR_CRONO";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(45,MDP);
    MDP.Index = 45;
    MDP.ObjTag = "ANNOACC";
    MDP.Name = "ANNOACC";
    MDP.UIName = "ANNO ACC";
    MDP.GUID = "D6A0A4EB-A223-411D-A149-DD47CA74782E";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_ACC";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(46,MDP);
    MDP.Index = 46;
    MDP.ObjTag = "NUMEROACC";
    MDP.Name = "NUMEROACC";
    MDP.UIName = "NUMERO ACC";
    MDP.GUID = "4C19CA1C-CBB7-418F-958A-8A110F0E8FB6";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP.DBCode = "NUMERO_ACC";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(47,MDP);
    MDP.Index = 47;
    MDP.ObjTag = "PROGREVARACC";
    MDP.Name = "PROGRESSIVOVARACC";
    MDP.UIName = "PROGRESSIVO VARACC";
    MDP.GUID = "847E5A49-5BD9-4EAA-A4FC-00676098044D";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "PROGRESSIVO_VARACC";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(48,MDP);
    MDP.Index = 48;
    MDP.ObjTag = "OBIETTIVGEST";
    MDP.Name = "OBIETTIVOGEST";
    MDP.UIName = "Obiettivo Gestionale";
    MDP.GUID = "E64905F6-47C7-4024-B144-D1567959A33C";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 9;
    MDP.vScale = 0;
    MDP.DBCode = "OBIETTIVO_GEST";
    MDP = new DOMDProp();
    MDOVarDef.SetProp(49,MDP);
    MDP.Index = 49;
    MDP.ObjTag = "IMPORTORIGIN";
    MDP.Name = "IMPORTOORIGINALE";
    MDP.UIName = "IMPORTO ORIGINALE";
    MDP.GUID = "A7C1675C-C011-4679-9B01-F5037098C10A";
    MDP.Transient = true;
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMPORTO";
    MDOVarDef.SetNumColl(2);
    MDC = new DOMDColl();
    MDOVarDef.SetColl(1,MDC);
    MDC.Index = 1;
    MDC.Name = "VARCOMFK";
    MDC.ChildrenName = "VarDef";
    MDC.Visible = true;
    MDC.PKColl.add("PROGRESSIVO");
    MDC.FKColl.add("PROGRPRIMVAR");
    MDC = new DOMDColl();
    MDOVarDef.SetColl(2,MDC);
    MDC.Index = 2;
    MDC.Name = "PVBSCHEDEOBIETTIVI";
    MDC.ChildrenName = "PvbSchedeObiettiviProv";
    MDC.Visible = true;
    return MDOVarDef;
  }

  public DOMDObj GetMD()
  {
    DOMDObj md = GetDOMD_VarDef();
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
    setDDATAREG((new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
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
      if (Idx==VARDEF_PROGRESSIVO) { setPROGRESSIVO(NewValue); break fine; }
      if (Idx==VARDEF_ESERCIZIO) { setESERCIZIO(NewValue); break fine; }
      if (Idx==VARDEF_ES) { setES(NewValue); break fine; }
      if (Idx==VARDEF_CAPITOLO) { setCAPITOLO(NewValue); break fine; }
      if (Idx==VARDEF_ARTICOLO) { setARTICOLO(NewValue); break fine; }
      if (Idx==VARDEF_ANNODEL) { setANNODEL(NewValue); break fine; }
      if (Idx==VARDEF_NUMERODEL) { setNUMERODEL(NewValue); break fine; }
      if (Idx==VARDEF_SEDEDEL) { setSEDEDEL(NewValue); break fine; }
      if (Idx==VARDEF_DATAREG) { setDATAREG(NewValue); break fine; }
      if (Idx==VARDEF_IMPORTO) { setIMPORTO(NewValue); break fine; }
      if (Idx==VARDEF_DESCRIZIONE) { setDESCRIZIONE(NewValue); break fine; }
      if (Idx==VARDEF_TIPOVAR) { setTIPOVAR(NewValue); break fine; }
      if (Idx==VARDEF_ANNOPROPOSTA) { setANNOPROPOSTA(NewValue); break fine; }
      if (Idx==VARDEF_UNITAPROPONE) { setUNITAPROPONE(NewValue); break fine; }
      if (Idx==VARDEF_NUMEROPROPOS) { setNUMEROPROPOS(NewValue); break fine; }
      if (Idx==VARDEF_VARBIL) { setVARBIL(NewValue); break fine; }
      if (Idx==VARDEF_CONSSVILUPPO) { setCONSSVILUPPO(NewValue); break fine; }
      if (Idx==VARDEF_DDATAREG) { setDDATAREG(NewValue); break fine; }
      if (Idx==VARDEF_ISTITUZIONNC) { setISTITUZIONNC(NewValue); break fine; }
      if (Idx==VARDEF_PROGETTOID) { setPROGETTOID(NewValue); break fine; }
      if (Idx==VARDEF_FINANZIAMENTO) { setFINANZIAMENTO(NewValue); break fine; }
      if (Idx==VARDEF_OPERA) { setOPERA(NewValue); break fine; }
      if (Idx==VARDEF_PROGUNITORGA) { setPROGUNITORGA(NewValue); break fine; }
      if (Idx==VARDEF_UTENTEINSERI) { setUTENTEINSERI(NewValue); break fine; }
      if (Idx==VARDEF_DATAINSERIME) { setDATAINSERIME(NewValue); break fine; }
      if (Idx==VARDEF_UTENTULTIAGG) { setUTENTULTIAGG(NewValue); break fine; }
      if (Idx==VARDEF_DATAULTIMAGG) { setDATAULTIMAGG(NewValue); break fine; }
      if (Idx==VARDEF_PROUNIORGINS) { setPROUNIORGINS(NewValue); break fine; }
      if (Idx==VARDEF_FATTORE) { setFATTORE(NewValue); break fine; }
      if (Idx==VARDEF_CENTRO) { setCENTRO(NewValue); break fine; }
      if (Idx==VARDEF_SCHEDOBIETID) { setSCHEDOBIETID(NewValue); break fine; }
      if (Idx==VARDEF_PROGRPRIMVAR) { setPROGRPRIMVAR(NewValue); break fine; }
      if (Idx==VARDEF_IMPORTOCASSA) { setIMPORTOCASSA(NewValue); break fine; }
      if (Idx==VARDEF_REISCRIDAIMP) { setREISCRIDAIMP(NewValue); break fine; }
      if (Idx==VARDEF_REISCRIDASTN) { setREISCRIDASTN(NewValue); break fine; }
      if (Idx==VARDEF_INSERTED) { setINSERTED(NewValue); break fine; }
      if (Idx==VARDEF_ANNOIMP) { setANNOIMP(NewValue); break fine; }
      if (Idx==VARDEF_NUMEROIMP) { setNUMEROIMP(NewValue); break fine; }
      if (Idx==VARDEF_ANNOESIGIBIL) { setANNOESIGIBIL(NewValue); break fine; }
      if (Idx==VARDEF_PROGREVARIMP) { setPROGREVARIMP(NewValue); break fine; }
      if (Idx==VARDEF_CRONOPROGRID) { setCRONOPROGRID(NewValue); break fine; }
      if (Idx==VARDEF_PROGIMPUCRON) { setPROGIMPUCRON(NewValue); break fine; }
      if (Idx==VARDEF_ANNOPLURCRON) { setANNOPLURCRON(NewValue); break fine; }
      if (Idx==VARDEF_PROGRVARCRON) { setPROGRVARCRON(NewValue); break fine; }
      if (Idx==VARDEF_ANNOACC) { setANNOACC(NewValue); break fine; }
      if (Idx==VARDEF_NUMEROACC) { setNUMEROACC(NewValue); break fine; }
      if (Idx==VARDEF_PROGREVARACC) { setPROGREVARACC(NewValue); break fine; }
      if (Idx==VARDEF_OBIETTIVGEST) { setOBIETTIVGEST(NewValue); break fine; }
      if (Idx==VARDEF_IMPORTORIGIN) { setIMPORTORIGIN(NewValue); break fine; }
      super.SetPropByIndex(Idx, NewValue); break fine;
    }
  }
  
  
  // **********************************************
  // Get Collection By Index
  // **********************************************
  public IDCollection GetCollByIndex(int Idx)
  {
    if (Idx==1+BASE_COLLS) return VARCOMFK;
    if (Idx==2+BASE_COLLS) return PVBSCHEDOBIE;
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

    if (Coll == PVBSCHEDOBIE)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as PVBSCHOBIPRO, ");
      SQL.append("  A.ESERCIZIO as PVBSCHOBIESE, ");
      SQL.append("  A.E_S as PVBSCHEOBIES, ");
      SQL.append("  A.CAPITOLO as PVBSCHOBICAP, ");
      SQL.append("  A.ARTICOLO as PVBSCHOBIART, ");
      SQL.append("  A.PROGRESSIVO_PVB as PVBSCHOBPRPV, ");
      SQL.append("  A.PROGRESSIVO_SCHEDA as PVBSCHOBPRSC, ");
      SQL.append("  A.IMPORTO as PVBSCHOBIIMP, ");
      SQL.append("  A.CASSA as PVBSCHOBICAS, ");
      SQL.append("  A.TIPO_VAR as PVBSCHOBTIVA ");
      SqlText[0] = SQL.toString();
      SQL = new StringBuffer();
      SQL.append("from ");
      SQL.append("  PVB_SCHEDE_OBIETTIVI A ");
      SqlText[1] = SQL.toString();
      SQL = new StringBuffer();
      SQL.append("where (A.PROGRESSIVO_PVB = " + IDL.CSql(getPROGRESSIVO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO_VAR = 'D') ");
      SqlText[2] = SQL.toString();
      SQL = new StringBuffer();
      SqlText[3] = SQL.toString();
      SQL = new StringBuffer();
      SqlText[4] = SQL.toString();
      SQL = new StringBuffer();
      SqlText[5] = SQL.toString();
      ColAssignment.add(new Integer(PvbSchedeObiettiviProv.PVBSCHOBIPRO_PROGRESSIVO));
      ColAssignment.add(new Integer(PvbSchedeObiettiviProv.PVBSCHOBIPRO_ESERCIZIO));
      ColAssignment.add(new Integer(PvbSchedeObiettiviProv.PVBSCHOBIPRO_ES));
      ColAssignment.add(new Integer(PvbSchedeObiettiviProv.PVBSCHOBIPRO_CAPITOLO));
      ColAssignment.add(new Integer(PvbSchedeObiettiviProv.PVBSCHOBIPRO_ARTICOLO));
      ColAssignment.add(new Integer(PvbSchedeObiettiviProv.PVBSCHOBIPRO_PROGRESSIPVB));
      ColAssignment.add(new Integer(PvbSchedeObiettiviProv.PVBSCHOBIPRO_PROGRESCHEDA));
      ColAssignment.add(new Integer(PvbSchedeObiettiviProv.PVBSCHOBIPRO_IMPORTO));
      ColAssignment.add(new Integer(PvbSchedeObiettiviProv.PVBSCHOBIPRO_CASSA));
      ColAssignment.add(new Integer(PvbSchedeObiettiviProv.PVBSCHOBIPRO_TIPOVAR));
    }
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
  public static VarDef CreateVarDef()
  {
    return CreateVarDef(null, null);
  }
  
  public static VarDef CreateVarDef(Object mainfrm, Object imdb) { return CreateVarDef(mainfrm, imdb, null); } 
  public static VarDef CreateVarDef(Object mainfrm, Object imdb, Object mainfrmCF)
  {
    VarDef newobj = null;
    //
    // Creating object
    if (ClassName == null)
      newobj = new VarDef((MyWebEntryPoint)mainfrm, (IMDBObj)imdb); // No class factory
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
          newobj = (VarDef)app.CreateDocument(ClassName);
        }
        else
        {
          // Classe con namespace: faccio creare l'istanza al componente corrispondente
          String CompNameSpace = ClassName.substring(0, ClassName.lastIndexOf('.'));
          com.progamma.is.WebEntryPoint cmp = app.GetCompFromNameSpace(CompNameSpace);
          if (cmp != null)
            newobj = (VarDef)cmp.CreateDocument(ClassName.substring(ClassName.lastIndexOf('.') + 1));
          else
          {
            app.getDTTObj().AddMsg(DTTEngine.DTTMSG_ERROR, "", 191, "CreateVarDef", 
                  "Can't find component " + CompNameSpace + " while handling VarDef class factory");
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
    DOMDObj MD = GetDOMD_VarDef();
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
    return (obj instanceof VarDef);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VarDef.class.getName() : (Glb.ClassWithPackage(VarDef.class) ? VarDef.class.getName().substring(VarDef.class.getPackage().getName().length() + 1) : VarDef.class.getName()));
  }
  
  // **********************************************
  // Event Stubs
  // **********************************************  

  
  // **********************************************
  // Procedure Definition
  // **********************************************
  
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
      setDDATAREG(IDL.Today());
      setUTENTEINSERI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      setDATAINSERIME(IDL.Today());
      if (IDL.IsNull(getTIPOVAR()))
      {
        setTIPOVAR(IMDB.Value(IMDBDef3.TBL_PARAM7, IMDBDef3.FLD_PARAM7_ROWNAMTIPVAR, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VarDef", "OnInserting", _e);
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
      if (Phase.equals((new IDVariant(1)), true))
      {
        try
        {
          if (IDL.IsNull(getPROGRPRIMVAR()))
          {
            setINSERTED((new IDVariant(0)));
          }
          if (!(IDL.IsNull(getPROGRPRIMVAR())))
          {
            IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_FASE = null;
            v_FASE = (new IDVariant());
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1, ");
            SQL.append("  MIN(A.FASE_BILANCIO) as MINESEFASBIL ");
            SQL.append("from ");
            SQL.append("  ESEFIN A ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
              v_FASE = QV.Get("MINESEFASBIL", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CONTA.equals((new IDVariant(0)), true))
            {
              AddDocError(IDL.Add(IDL.Add((new IDVariant("Esercizio ")), IDL.ToString(getESERCIZIO())), (new IDVariant(" non presente su esercizi finanziari"))).stringValue()); 
              Skip.set((new IDVariant(-1)));
              Cancel.set((new IDVariant(-1)));
            }
            else
            {
              if (v_FASE.compareTo((new IDVariant(3)), true)<0)
              {
                AddDocError(IDL.Add(IDL.Add((new IDVariant("Fase per l'esercizio ")), IDL.ToString(getESERCIZIO())), (new IDVariant(" non ammessa"))).stringValue()); 
                Skip.set((new IDVariant(-1)));
                Cancel.set((new IDVariant(-1)));
              }
            }
            if (IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOREIS, 0).equals((new IDVariant("IMP")), true))
            {
              if (this.Inserted())
              {
                setREISCRIDAIMP((new IDVariant("SI")));
              }
            }
            if (IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOREIS, 0).equals((new IDVariant("STN")), true))
            {
              if (IDL.IsNull(getCRONOPROGRID()))
              {
                setREISCRIDASTN((new IDVariant("SI")));
              }
            }
          }
          // 
          // settaggio variazione da imp e variazione da stn
          // 
          if (getES().equals((new IDVariant("S")), true) || (getES().equals((new IDVariant("E")), true) && IDL.Length(IDL.ToString(getCAPITOLO())).compareTo((new IDVariant(15)), true)<0))
          {
            IDVariant v_VTIPOLOGIA = null;
            v_VTIPOLOGIA = (new IDVariant());
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.TIPOLOGIA as T54TIPOLOGIA ");
            SQL.append("from ");
            SQL.append("  T54 A ");
            SQL.append("where (A.CODICE = " + IDL.CSql(getTIPOVAR(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VTIPOLOGIA = QV.Get("T54TIPOLOGIA", IDVariant.STRING) ;
            }
            QV.Close();
            if (!(IDL.IsNull(v_VTIPOLOGIA)))
            {
              IDVariant v_VTIPOIMPORTO = null;
              v_VTIPOIMPORTO = (new IDVariant());
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  A.TIPO_IMPORTO as TIPMOTVBTIIM ");
              SQL.append("from ");
              SQL.append("  TIPI_MOTIVAZIONE_VBIL A ");
              SQL.append("where (A.CODICE = " + IDL.CSql(v_VTIPOLOGIA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VTIPOIMPORTO = QV.Get("TIPMOTVBTIIM", IDVariant.STRING) ;
              }
              QV.Close();
              if (!(IDL.IsNull(v_VTIPOIMPORTO)))
              {
                IDVariant v_VCODICE = null;
                v_VCODICE = (new IDVariant());
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  A.CODICE as TIPIMPVBICOD ");
                SQL.append("from ");
                SQL.append("  TIPI_IMPORTO_VBIL A ");
                SQL.append("where (A.CODICE = " + IDL.CSql(v_VTIPOIMPORTO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_VCODICE = QV.Get("TIPIMPVBICOD", IDVariant.STRING) ;
                }
                QV.Close();
                if (IDL.NullValue(v_VCODICE,(new IDVariant("XX"))).equals((new IDVariant("RE")), true))
                {
                  if (this.Inserted())
                  {
                    setREISCRIDAIMP((new IDVariant("SI")));
                  }
                }
                if (IDL.NullValue(v_VCODICE,(new IDVariant("XX"))).equals((new IDVariant("RS")), true))
                {
                  if (IDL.IsNull(getCRONOPROGRID()))
                  {
                    setREISCRIDASTN((new IDVariant("SI")));
                  }
                }
              }
            }
          }
          // 
          // controllo esistenza voce peg
          // 
          {
            IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  CAP A ");
            SQL.append("where (A.E_S = " + IDL.CSql(getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CONTATORE.equals((new IDVariant(0)), true))
            {
              SQL = new StringBuffer();
              SQL.append("insert into CAP ");
              SQL.append("( ");
              SQL.append("  ESERCIZIO, ");
              SQL.append("  E_S, ");
              SQL.append("  CAPITOLO, ");
              SQL.append("  ARTICOLO ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            v_CONTATORE = (new IDVariant(0));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  BIL A ");
            SQL.append("where (A.E_S = " + IDL.CSql(getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CONTATORE.equals((new IDVariant(0)), true))
            {
              SQL = new StringBuffer();
              SQL.append("insert into BIL ");
              SQL.append("( ");
              SQL.append("  ESERCIZIO, ");
              SQL.append("  E_S, ");
              SQL.append("  CAPITOLO, ");
              SQL.append("  ARTICOLO, ");
              SQL.append("  IMP_ACC_ULT_CHIUSO, ");
              SQL.append("  IMP_ACC_ULT_CONS, ");
              SQL.append("  IMP_ACC_ULT_SVIL, ");
              SQL.append("  PREVISIONE, ");
              SQL.append("  PREVISIONE_CONS, ");
              SQL.append("  PREVISIONE_SVIL, ");
              SQL.append("  STN_INI_CO, ");
              SQL.append("  STN_INI_CO_CONS, ");
              SQL.append("  STN_INI_CO_SVIL, ");
              SQL.append("  VARIAZIONI_CO, ");
              SQL.append("  VARIAZIONI_CO_CONS, ");
              SQL.append("  VARIAZIONI_CO_SVIL, ");
              SQL.append("  DISPONIBILITA, ");
              SQL.append("  DISPONIBILITA_CONS, ");
              SQL.append("  DISPONIBILITA_SVIL, ");
              SQL.append("  DISPONIBILITA_BDG, ");
              SQL.append("  IMPEGNABILE, ");
              SQL.append("  VAR_IMPEGNABILE, ");
              SQL.append("  UTENTE_INSERIMENTO, ");
              SQL.append("  DATA_INSERIMENTO, ");
              SQL.append("  STN_INI_CA, ");
              SQL.append("  VARIAZIONI_CA ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  TRUNC( SYSDATE ), ");
              SQL.append("  0, ");
              SQL.append("  0 ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
          }
          if (MainFrm.FINANZIAMENT.booleanValue())
          {
            // 
            // controllo esistenza su bil_fin
            // 
            {
              if (!(IDL.IsNull(getFINANZIAMENTO())) && !(IDL.IsNull(IDL.NullValue(getOPERA(),(new IDVariant(0))))))
              {
                IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  COUNT(*) as COUNT1 ");
                SQL.append("from ");
                SQL.append("  BIL_FIN A ");
                SQL.append("where (A.ESERCIZIO = " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.FINANZIAMENTO = " + IDL.CSql(getFINANZIAMENTO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.OPERA = NVL(" + IDL.CSql(getOPERA(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0)) ");
                SQL.append("and   (A.E_S = " + IDL.CSql(getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.CAPITOLO = " + IDL.CSql(getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.ARTICOLO = " + IDL.CSql(getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
                }
                QV.Close();
                if (v_CONTATORE.equals((new IDVariant(0)), true))
                {
                  SQL = new StringBuffer();
                  SQL.append("insert into BIL_FIN ");
                  SQL.append("( ");
                  SQL.append("  ESERCIZIO, ");
                  SQL.append("  FINANZIAMENTO, ");
                  SQL.append("  OPERA, ");
                  SQL.append("  E_S, ");
                  SQL.append("  CAPITOLO, ");
                  SQL.append("  ARTICOLO, ");
                  SQL.append("  STN_INI_CO, ");
                  SQL.append("  VARIAZIONI ");
                  SQL.append(") ");
                  SQL.append("values ");
                  SQL.append("( ");
                  SQL.append("  " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(getFINANZIAMENTO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  NVL(" + IDL.CSql(getOPERA(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0), ");
                  SQL.append("  " + IDL.CSql(getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  0, ");
                  SQL.append("  0 ");
                  SQL.append(") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
              }
            }
          }
        }
        catch (Exception e27)
        {
          AddDocError(new IDVariant(e27.getMessage()).stringValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VarDef", "BeforeSave", _e);
    }
  }

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
      OLDCAPITOLO = IDL.Add(IDL.ToString(getCAPITOLO()), IDL.ToString(getARTICOLO()));
      setIMPORTORIGIN(new IDVariant(getIMPORTO()));
      SetOriginal();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VarDef", "AfterLoad", _e);
    }
  }

  // **********************************************************************
  // On Validate
  // Evento notificato al documento durante la procedura
  // di validazione
  // Reason - Input
  // Error - Input/Output
  // Skip - Input/Output
  // **********************************************************************
  public void OnValidate(IDVariant Reason, IDVariant Error, IDVariant Skip)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C7;
    IDCachedRowSet C12;

    try
    {
      TransCount = 0;
      // 
      // On Validate Body
      // Corpo Procedura
      // 
      if (Reason.compareTo((new IDVariant(0)), true)!=0)
      {
        if (IDL.IsNull(getPROGRPRIMVAR()))
        {
          setINSERTED((new IDVariant(this.Inserted())));
        }
        if (!(IDL.IsNull(getCAPITOLO())) && !(IDL.IsNull(getARTICOLO())))
        {
          if (OLDCAPITOLO.compareTo(IDL.Add(IDL.ToString(getCAPITOLO()), IDL.ToString(getARTICOLO())), true)!=0)
          {
            // 
            // proposta unità organizzativa
            // 
            {
              IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
              IDVariant v_PROGRUO = new IDVariant(0,IDVariant.INTEGER);
              v_PROGRUO = (new IDVariant(1, IDVariant.INTEGER));
              v_PROGRUO = (new IDVariant());
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGRUO ");
              SQL.append("from ");
              SQL.append("  CAP_BIL_UO A ");
              SQL.append("where (A.ESERCIZIO = " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.CAPITOLO = " + IDL.CSql(getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ARTICOLO = " + IDL.CSql(getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.E_S = " + IDL.CSql(getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.TIPO = 'O') ");
              SQL.append("and   ((" + IDL.CSql(getISTITUZIONNC(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) ");
              SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= NVL(" + IDL.CSql(getDDATAREG(), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", TRUNC( SYSDATE ))) ");
              SQL.append("UNION ");
              SQL.append("select ");
              SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA ");
              SQL.append("from ");
              SQL.append("  CAP_UO B ");
              SQL.append("where (B.ESERCIZIO = " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (B.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
              SQL.append("and   ((B.SCADENZA IS NULL) OR B.SCADENZA >= NVL(" + IDL.CSql(getDDATAREG(), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", TRUNC( SYSDATE ))) ");
              SQL.append("and   (B.CAPITOLO = " + IDL.CSql(getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (B.ARTICOLO = " + IDL.CSql(getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (" + IDL.CSql(getISTITUZIONNC(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'SI') ");
              C7 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!C7.EOF()) C7.MoveNext();
              while (!C7.EOF())
              {
                v_CONTATORE = IDL.Add(v_CONTATORE, (new IDVariant(1)));
                v_PROGRUO = new IDVariant(new IDVariant(C7.Get("PROGRUO")),IDVariant.INTEGER);
                C7.MoveNext();
              }
              C7.Close();
              if (v_CONTATORE.equals((new IDVariant(1)), true))
              {
                setPROGUNITORGA(new IDVariant(v_PROGRUO));
              }
              else
              {
                setPROGUNITORGA((new IDVariant()));
              }
            }
            if (IDL.IsNull(getISTITUZIONNC()))
            {
              if (MainFrm.FINANZIAMENT.booleanValue())
              {
                IDVariant v_RIGA = new IDVariant(0,IDVariant.INTEGER);
                v_RIGA = (new IDVariant(0, IDVariant.INTEGER));
                IDVariant v_FINANZIAMENT = null;
                v_FINANZIAMENT = (new IDVariant());
                IDVariant v_OPERA = null;
                v_OPERA = (new IDVariant());
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  A.FINANZIAMENTO as BILFINFINANZ, ");
                SQL.append("  A.OPERA as BILFINOPERA ");
                SQL.append("from ");
                SQL.append("  BIL_FIN A, ");
                SQL.append("  FINANZIAMENTI B, ");
                SQL.append("  OPERE C ");
                SQL.append("where (A.ESERCIZIO = " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.E_S = " + IDL.CSql(getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.CAPITOLO = " + IDL.CSql(getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.ARTICOLO = " + IDL.CSql(getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.FINANZIAMENTO = B.CODICE) ");
                SQL.append("and   (A.OPERA = C.CODICE) ");
                SQL.append("and   (A.OPERA <> 0) ");
                C12 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!C12.EOF()) C12.MoveNext();
                while (!C12.EOF())
                {
                  v_RIGA = IDL.Add(v_RIGA, (new IDVariant(1)));
                  v_FINANZIAMENT = new IDVariant(C12.Get("BILFINFINANZ"));
                  v_OPERA = new IDVariant(C12.Get("BILFINOPERA"));
                  C12.MoveNext();
                }
                C12.Close();
                if (v_RIGA.equals((new IDVariant(1)), true))
                {
                  setFINANZIAMENTO(new IDVariant(v_FINANZIAMENT));
                  setOPERA(new IDVariant(v_OPERA));
                }
              }
            }
            OLDCAPITOLO = IDL.Add(IDL.ToString(getCAPITOLO()), IDL.ToString(getARTICOLO()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VarDef", "OnValidate", _e);
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
      if (!(IDL.IsNull(getPROGREVARIMP())))
      {
        SQL = new StringBuffer();
        SQL.append("update VARIMP set ");
        SQL.append("  VARIAZIONE_GENERATA = 'SI', ");
        SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
        SQL.append("where (PROGRESSIVO = " + IDL.CSql(getPROGREVARIMP(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      setIMPORTORIGIN(new IDVariant(getIMPORTO()));
      SetOriginal();
    }
    catch (Exception _e)
    {
      throw new RuntimeException("AfterSave - "+_e.getMessage(),_e);
    }
  }

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
      MainFrm.ErrObj.ProcError ("VarDef", "BeforeLoadCollection", _e);
    }
  }

  // **********************************************************************
  // On Deleting
  // Evento notificato al documento quando varia la proprietà
  // Deleted
  // **********************************************************************
  public void OnDeleting()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // On Deleting Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(getPROGRPRIMVAR()))
      {
        SQL = new StringBuffer();
        SQL.append("delete from VARCOM ");
        SQL.append("where (PROGRESSIVO_PRIMA_VAR = " + IDL.CSql(getPROGRESSIVO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VarDef", "OnDeleting", _e);
    }
  }

  
}  
