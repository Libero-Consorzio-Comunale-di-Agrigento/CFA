// **********************************************
// Var Provv
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

public class VarProvv extends com.progamma.doc.IDDocument
{  
  private MyWebEntryPoint MainFrm;
  private IMDBObj IMDB;
  private static String ClassName = null;

  // Property constant definitions
  public static int VARPROVV_PROGRESSIVO = 1;
  public static int VARPROVV_ESERCIZIO = 2;
  public static int VARPROVV_ES = 3;
  public static int VARPROVV_CAPITOLO = 4;
  public static int VARPROVV_ARTICOLO = 5;
  public static int VARPROVV_ANNODEL = 6;
  public static int VARPROVV_NUMERODEL = 7;
  public static int VARPROVV_SEDEDEL = 8;
  public static int VARPROVV_DATAREG = 9;
  public static int VARPROVV_IMPORTO = 10;
  public static int VARPROVV_DESCRIZIONE = 11;
  public static int VARPROVV_TIPOVAR = 12;
  public static int VARPROVV_ANNOPROPOSTA = 13;
  public static int VARPROVV_UNITAPROPONE = 14;
  public static int VARPROVV_NUMEROPROPOS = 15;
  public static int VARPROVV_VARBIL = 16;
  public static int VARPROVV_CONSSVILUPPO = 17;
  public static int VARPROVV_DDATAREG = 18;
  public static int VARPROVV_ISTITUZIONNC = 19;
  public static int VARPROVV_PROGETTOID = 20;
  public static int VARPROVV_FINANZIAMENTO = 21;
  public static int VARPROVV_OPERA = 22;
  public static int VARPROVV_PROGUNITORGA = 23;
  public static int VARPROVV_UTENTEINSERI = 24;
  public static int VARPROVV_DATAINSERIME = 25;
  public static int VARPROVV_UTENTULTIAGG = 26;
  public static int VARPROVV_DATAULTIMAGG = 27;
  public static int VARPROVV_PROUNIORGINS = 28;
  public static int VARPROVV_FATTORE = 29;
  public static int VARPROVV_CENTRO = 30;
  public static int VARPROVV_SCHEDOBIETID = 31;
  public static int VARPROVV_IMPORTOCASSA = 32;
  public static int VARPROVV_PROGRPRIMVAR = 33;
  public static int VARPROVV_REISCRIDAIMP = 34;
  public static int VARPROVV_REISCRIDASTN = 35;
  public static int VARPROVV_INSERTED = 36;
  public static int VARPROVV_ANNOIMP = 37;
  public static int VARPROVV_NUMEROIMP = 38;
  public static int VARPROVV_ANNOESIGIBIL = 39;
  public static int VARPROVV_PROGREVARIMP = 40;
  public static int VARPROVV_CRONOPROGRID = 41;
  public static int VARPROVV_PROGIMPUCRON = 42;
  public static int VARPROVV_ANNOPLURCRON = 43;
  public static int VARPROVV_PROGRVARCRON = 44;
  public static int VARPROVV_ANNOACC = 45;
  public static int VARPROVV_NUMEROACC = 46;
  public static int VARPROVV_PROGREVARACC = 47;
  public static int VARPROVV_OBIETTIVGEST = 48;
  public static int VARPROVV_VARCOMPROFK = 1;
  public static int VARPROVV_PVBSCHOBIPRO = 2;
  public static int MAX_VARS = 48;
  public static int BASE_VARS = 0;
  public static int BASE_COLLS = 0;

  // Definition of Global Variables
  private IDVariant OLDCAPITOLO = new IDVariant(0,IDVariant.STRING);
  private IDVariant OLDIMPORCOMP = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant OLDIMPORCASS = new IDVariant(0,IDVariant.DECIMAL);
  public com.progamma.doc.IDCollection VARCOMPROFK = new com.progamma.doc.IDCollection();
  public com.progamma.doc.IDCollection PVBSCHOBIPRO = new com.progamma.doc.IDCollection();
  public IDVariant getPROGRESSIVO() { return GetPropDirect(VARPROVV_PROGRESSIVO); }
  public void setPROGRESSIVO(IDVariant NewValue) { ChangePropDirect(VARPROVV_PROGRESSIVO,NewValue,false); }
  public IDVariant getESERCIZIO() { return GetPropDirect(VARPROVV_ESERCIZIO); }
  public void setESERCIZIO(IDVariant NewValue) { ChangePropDirect(VARPROVV_ESERCIZIO,NewValue,false); }
  public IDVariant getES() { return GetPropDirect(VARPROVV_ES); }
  public void setES(IDVariant NewValue) { ChangePropDirect(VARPROVV_ES,NewValue,false); }
  public IDVariant getCAPITOLO() { return GetPropDirect(VARPROVV_CAPITOLO); }
  public void setCAPITOLO(IDVariant NewValue) { ChangePropDirect(VARPROVV_CAPITOLO,NewValue,false); }
  public IDVariant getARTICOLO() { return GetPropDirect(VARPROVV_ARTICOLO); }
  public void setARTICOLO(IDVariant NewValue) { ChangePropDirect(VARPROVV_ARTICOLO,NewValue,false); }
  public IDVariant getANNODEL() { return GetPropDirect(VARPROVV_ANNODEL); }
  public void setANNODEL(IDVariant NewValue) { ChangePropDirect(VARPROVV_ANNODEL,NewValue,false); }
  public IDVariant getNUMERODEL() { return GetPropDirect(VARPROVV_NUMERODEL); }
  public void setNUMERODEL(IDVariant NewValue) { ChangePropDirect(VARPROVV_NUMERODEL,NewValue,false); }
  public IDVariant getSEDEDEL() { return GetPropDirect(VARPROVV_SEDEDEL); }
  public void setSEDEDEL(IDVariant NewValue) { ChangePropDirect(VARPROVV_SEDEDEL,NewValue,false); }
  public IDVariant getDATAREG() { return GetPropDirect(VARPROVV_DATAREG); }
  public void setDATAREG(IDVariant NewValue) { ChangePropDirect(VARPROVV_DATAREG,NewValue,false); }
  public IDVariant getIMPORTO() { return GetPropDirect(VARPROVV_IMPORTO); }
  public void setIMPORTO(IDVariant NewValue) { ChangePropDirect(VARPROVV_IMPORTO,NewValue,false); }
  public IDVariant getDESCRIZIONE() { return GetPropDirect(VARPROVV_DESCRIZIONE); }
  public void setDESCRIZIONE(IDVariant NewValue) { ChangePropDirect(VARPROVV_DESCRIZIONE,NewValue,false); }
  public IDVariant getTIPOVAR() { return GetPropDirect(VARPROVV_TIPOVAR); }
  public void setTIPOVAR(IDVariant NewValue) { ChangePropDirect(VARPROVV_TIPOVAR,NewValue,false); }
  public IDVariant getANNOPROPOSTA() { return GetPropDirect(VARPROVV_ANNOPROPOSTA); }
  public void setANNOPROPOSTA(IDVariant NewValue) { ChangePropDirect(VARPROVV_ANNOPROPOSTA,NewValue,false); }
  public IDVariant getUNITAPROPONE() { return GetPropDirect(VARPROVV_UNITAPROPONE); }
  public void setUNITAPROPONE(IDVariant NewValue) { ChangePropDirect(VARPROVV_UNITAPROPONE,NewValue,false); }
  public IDVariant getNUMEROPROPOS() { return GetPropDirect(VARPROVV_NUMEROPROPOS); }
  public void setNUMEROPROPOS(IDVariant NewValue) { ChangePropDirect(VARPROVV_NUMEROPROPOS,NewValue,false); }
  public IDVariant getVARBIL() { return GetPropDirect(VARPROVV_VARBIL); }
  public void setVARBIL(IDVariant NewValue) { ChangePropDirect(VARPROVV_VARBIL,NewValue,false); }
  public IDVariant getCONSSVILUPPO() { return GetPropDirect(VARPROVV_CONSSVILUPPO); }
  public void setCONSSVILUPPO(IDVariant NewValue) { ChangePropDirect(VARPROVV_CONSSVILUPPO,NewValue,false); }
  public IDVariant getDDATAREG() { return GetPropDirect(VARPROVV_DDATAREG); }
  public void setDDATAREG(IDVariant NewValue) { ChangePropDirect(VARPROVV_DDATAREG,NewValue,false); }
  public IDVariant getISTITUZIONNC() { return GetPropDirect(VARPROVV_ISTITUZIONNC); }
  public void setISTITUZIONNC(IDVariant NewValue) { ChangePropDirect(VARPROVV_ISTITUZIONNC,NewValue,false); }
  public IDVariant getPROGETTOID() { return GetPropDirect(VARPROVV_PROGETTOID); }
  public void setPROGETTOID(IDVariant NewValue) { ChangePropDirect(VARPROVV_PROGETTOID,NewValue,false); }
  public IDVariant getFINANZIAMENTO() { return GetPropDirect(VARPROVV_FINANZIAMENTO); }
  public void setFINANZIAMENTO(IDVariant NewValue) { ChangePropDirect(VARPROVV_FINANZIAMENTO,NewValue,false); }
  public IDVariant getOPERA() { return GetPropDirect(VARPROVV_OPERA); }
  public void setOPERA(IDVariant NewValue) { ChangePropDirect(VARPROVV_OPERA,NewValue,false); }
  public IDVariant getPROGUNITORGA() { return GetPropDirect(VARPROVV_PROGUNITORGA); }
  public void setPROGUNITORGA(IDVariant NewValue) { ChangePropDirect(VARPROVV_PROGUNITORGA,NewValue,false); }
  public IDVariant getUTENTEINSERI() { return GetPropDirect(VARPROVV_UTENTEINSERI); }
  public void setUTENTEINSERI(IDVariant NewValue) { ChangePropDirect(VARPROVV_UTENTEINSERI,NewValue,false); }
  public IDVariant getDATAINSERIME() { return GetPropDirect(VARPROVV_DATAINSERIME); }
  public void setDATAINSERIME(IDVariant NewValue) { ChangePropDirect(VARPROVV_DATAINSERIME,NewValue,false); }
  public IDVariant getUTENTULTIAGG() { return GetPropDirect(VARPROVV_UTENTULTIAGG); }
  public void setUTENTULTIAGG(IDVariant NewValue) { ChangePropDirect(VARPROVV_UTENTULTIAGG,NewValue,false); }
  public IDVariant getDATAULTIMAGG() { return GetPropDirect(VARPROVV_DATAULTIMAGG); }
  public void setDATAULTIMAGG(IDVariant NewValue) { ChangePropDirect(VARPROVV_DATAULTIMAGG,NewValue,false); }
  public IDVariant getPROUNIORGINS() { return GetPropDirect(VARPROVV_PROUNIORGINS); }
  public void setPROUNIORGINS(IDVariant NewValue) { ChangePropDirect(VARPROVV_PROUNIORGINS,NewValue,false); }
  public IDVariant getFATTORE() { return GetPropDirect(VARPROVV_FATTORE); }
  public void setFATTORE(IDVariant NewValue) { ChangePropDirect(VARPROVV_FATTORE,NewValue,false); }
  public IDVariant getCENTRO() { return GetPropDirect(VARPROVV_CENTRO); }
  public void setCENTRO(IDVariant NewValue) { ChangePropDirect(VARPROVV_CENTRO,NewValue,false); }
  public IDVariant getSCHEDOBIETID() { return GetPropDirect(VARPROVV_SCHEDOBIETID); }
  public void setSCHEDOBIETID(IDVariant NewValue) { ChangePropDirect(VARPROVV_SCHEDOBIETID,NewValue,false); }
  public IDVariant getIMPORTOCASSA() { return GetPropDirect(VARPROVV_IMPORTOCASSA); }
  public void setIMPORTOCASSA(IDVariant NewValue) { ChangePropDirect(VARPROVV_IMPORTOCASSA,NewValue,false); }
  public IDVariant getPROGRPRIMVAR() { return GetPropDirect(VARPROVV_PROGRPRIMVAR); }
  public void setPROGRPRIMVAR(IDVariant NewValue) { ChangePropDirect(VARPROVV_PROGRPRIMVAR,NewValue,false); }
  public IDVariant getREISCRIDAIMP() { return GetPropDirect(VARPROVV_REISCRIDAIMP); }
  public void setREISCRIDAIMP(IDVariant NewValue) { ChangePropDirect(VARPROVV_REISCRIDAIMP,NewValue,false); }
  public IDVariant getREISCRIDASTN() { return GetPropDirect(VARPROVV_REISCRIDASTN); }
  public void setREISCRIDASTN(IDVariant NewValue) { ChangePropDirect(VARPROVV_REISCRIDASTN,NewValue,false); }
  public IDVariant getINSERTED() { return GetPropDirect(VARPROVV_INSERTED); }
  public void setINSERTED(IDVariant NewValue) { ChangePropDirect(VARPROVV_INSERTED,NewValue,false); }
  public IDVariant getANNOIMP() { return GetPropDirect(VARPROVV_ANNOIMP); }
  public void setANNOIMP(IDVariant NewValue) { ChangePropDirect(VARPROVV_ANNOIMP,NewValue,false); }
  public IDVariant getNUMEROIMP() { return GetPropDirect(VARPROVV_NUMEROIMP); }
  public void setNUMEROIMP(IDVariant NewValue) { ChangePropDirect(VARPROVV_NUMEROIMP,NewValue,false); }
  public IDVariant getANNOESIGIBIL() { return GetPropDirect(VARPROVV_ANNOESIGIBIL); }
  public void setANNOESIGIBIL(IDVariant NewValue) { ChangePropDirect(VARPROVV_ANNOESIGIBIL,NewValue,false); }
  public IDVariant getPROGREVARIMP() { return GetPropDirect(VARPROVV_PROGREVARIMP); }
  public void setPROGREVARIMP(IDVariant NewValue) { ChangePropDirect(VARPROVV_PROGREVARIMP,NewValue,false); }
  public IDVariant getCRONOPROGRID() { return GetPropDirect(VARPROVV_CRONOPROGRID); }
  public void setCRONOPROGRID(IDVariant NewValue) { ChangePropDirect(VARPROVV_CRONOPROGRID,NewValue,false); }
  public IDVariant getPROGIMPUCRON() { return GetPropDirect(VARPROVV_PROGIMPUCRON); }
  public void setPROGIMPUCRON(IDVariant NewValue) { ChangePropDirect(VARPROVV_PROGIMPUCRON,NewValue,false); }
  public IDVariant getANNOPLURCRON() { return GetPropDirect(VARPROVV_ANNOPLURCRON); }
  public void setANNOPLURCRON(IDVariant NewValue) { ChangePropDirect(VARPROVV_ANNOPLURCRON,NewValue,false); }
  public IDVariant getPROGRVARCRON() { return GetPropDirect(VARPROVV_PROGRVARCRON); }
  public void setPROGRVARCRON(IDVariant NewValue) { ChangePropDirect(VARPROVV_PROGRVARCRON,NewValue,false); }
  public IDVariant getANNOACC() { return GetPropDirect(VARPROVV_ANNOACC); }
  public void setANNOACC(IDVariant NewValue) { ChangePropDirect(VARPROVV_ANNOACC,NewValue,false); }
  public IDVariant getNUMEROACC() { return GetPropDirect(VARPROVV_NUMEROACC); }
  public void setNUMEROACC(IDVariant NewValue) { ChangePropDirect(VARPROVV_NUMEROACC,NewValue,false); }
  public IDVariant getPROGREVARACC() { return GetPropDirect(VARPROVV_PROGREVARACC); }
  public void setPROGREVARACC(IDVariant NewValue) { ChangePropDirect(VARPROVV_PROGREVARACC,NewValue,false); }
  public IDVariant getOBIETTIVGEST() { return GetPropDirect(VARPROVV_OBIETTIVGEST); }
  public void setOBIETTIVGEST(IDVariant NewValue) { ChangePropDirect(VARPROVV_OBIETTIVGEST,NewValue,false); }
    
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
  public VarProvv()
  {
  }

  // **********************************************
  // Initialize common framework object
  // **********************************************
  public VarProvv(MyWebEntryPoint w, IMDBObj imdb)
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
  private static DOMDObj MDOVarProvv;
  public synchronized static DOMDObj GetDOMD_VarProvv()
  {
    DOMDProp MDP;
    DOMDColl MDC;
    DOMDLinkedDoc DOC;

    if (MDOVarProvv != null)
      return MDOVarProvv;
    else
      MDOVarProvv = new DOMDObj();
    MDOVarProvv.ObjTag = "VarProvv";
    MDOVarProvv.ObjGUID = "0DA1FE03-A049-449A-83C7-9D496E188467";
    MDOVarProvv.UIName = "Variazioni Provvisorie";
    MDOVarProvv.Services = 0;
    MDOVarProvv.BaseProps = 0;
    MDOVarProvv.BaseColls = 0;
    MDOVarProvv.DBCode = "VARCOMPRO";
    MDOVarProvv.DBSchema = ".";
    MDOVarProvv.SequenceCode = "VARCOMPRO_$F";
    MDOVarProvv.DBType = 4;
    MDOVarProvv.AddQuery("CF76F19E-E50C-4000-837D-08923293C83C", "VARCOMPRO_PK", "select 1 from VARCOMPRO where PROGRESSIVO=~~PROGRESSIVO~~", "~~!PROGRESSIVO~~=~~PROGRESSIVO~~", 1);
    MDOVarProvv.AddQuery("1F2864EE-C3AA-4225-B877-8FB26A8DB0E8", "VARCOMPRO_VARCOMPROFK", "select 1 from VARCOMPRO where PROGRESSIVO=~~PROGRESSIVOPRIMAVAR~~", "VARCOMPRO§~~!PROGRESSIVOPRIMAVAR~~=~~PROGRESSIVOPRIMAVAR~~", 3);
    MDOVarProvv.AddQuery("97191F05-9971-46E2-BB1D-E73A52CBDC77", "PVBSCHEDEOBIETTIVI_PROGRPVBPROVFK", "select 1 from PVB_SCHEDE_OBIETTIVI where PROGRESSIVO_PVB=~~PROGRESSIVO~~", "PVB SCHEDE OBIETTIVI§~~!PROGRESSIVO~~=~~PROGRESSIVO~~", 4);
    MDOVarProvv.AddQuery("1F2864EE-C3AA-4225-B877-8FB26A8DB0E8", "VARCOMPRO_VARCOMPROFK", "select 1 from VARCOMPRO where PROGRESSIVO_PRIMA_VAR=~~PROGRESSIVO~~", "VARCOMPRO§~~!PROGRESSIVO~~=~~PROGRESSIVO~~", 4);
    MDOVarProvv.SetNumProp(48);
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(1,MDP);
    MDP.Index = 1;
    MDP.ObjTag = "PROGRESSIVO";
    MDP.Name = "PROGRESSIVO";
    MDP.UIName = "PROGRESSIVO";
    MDP.GUID = "5794F13A-C3D1-4522-9DCF-6D60AB912DB3";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "PROGRESSIVO";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(2,MDP);
    MDP.Index = 2;
    MDP.ObjTag = "ESERCIZIO";
    MDP.Name = "ESERCIZIO";
    MDP.UIName = "ESERCIZIO";
    MDP.GUID = "C0526139-5DCA-44B4-A854-40BE5B68F7DC";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ESERCIZIO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(3,MDP);
    MDP.Index = 3;
    MDP.ObjTag = "ES";
    MDP.Name = "ES";
    MDP.UIName = "E S";
    MDP.GUID = "4C6F4C9F-117C-46D0-BEFF-499FDA4E67B0";
    MDP.Visible = true;
    MDP.Domain = "\"Entrata\",\"E\",\"Spesa\",\"S\"";
    MDP.DataType = 5;
    MDP.MaxLength = 1;
    MDP.vScale = 0;
    MDP.DBCode = "E_S";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(4,MDP);
    MDP.Index = 4;
    MDP.ObjTag = "CAPITOLO";
    MDP.Name = "CAPITOLO";
    MDP.UIName = "CAPITOLO";
    MDP.GUID = "5000A0F9-301B-4CD9-93F2-C52B24DDC82A";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 16;
    MDP.vScale = 0;
    MDP.DBCode = "CAPITOLO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(5,MDP);
    MDP.Index = 5;
    MDP.ObjTag = "ARTICOLO";
    MDP.Name = "ARTICOLO";
    MDP.UIName = "ARTICOLO";
    MDP.GUID = "79D389F3-6C0B-4B47-84AF-65DD6D1762ED";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "ARTICOLO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(6,MDP);
    MDP.Index = 6;
    MDP.ObjTag = "ANNODEL";
    MDP.Name = "ANNODEL";
    MDP.UIName = "ANNO DEL";
    MDP.GUID = "E1418C39-F5B4-47B9-882B-B362A08AC8B8";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_DEL";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(7,MDP);
    MDP.Index = 7;
    MDP.ObjTag = "NUMERODEL";
    MDP.Name = "NUMERODEL";
    MDP.UIName = "NUMERO DEL";
    MDP.GUID = "7A18E11D-6723-4E56-B2A6-090633AC7F07";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 6;
    MDP.vScale = 0;
    MDP.DBCode = "NUMERO_DEL";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(8,MDP);
    MDP.Index = 8;
    MDP.ObjTag = "SEDEDEL";
    MDP.Name = "SEDEDEL";
    MDP.UIName = "SEDE DEL";
    MDP.GUID = "D8086B02-C953-4E58-9382-EC76C9F50CFC";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 255;
    MDP.vScale = 0;
    MDP.DBCode = "SEDE_DEL";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(9,MDP);
    MDP.Index = 9;
    MDP.ObjTag = "DATAREG";
    MDP.Name = "DATAREG";
    MDP.UIName = "DATA REG";
    MDP.GUID = "48550823-6B3E-4976-8BE7-D391F66FA022";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 7;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_REG";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(10,MDP);
    MDP.Index = 10;
    MDP.ObjTag = "IMPORTO";
    MDP.Name = "IMPORTO";
    MDP.UIName = "IMPORTO";
    MDP.GUID = "42EE1EA5-5936-4CD8-82E4-EE14987A229F";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMPORTO";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(11,MDP);
    MDP.Index = 11;
    MDP.ObjTag = "DESCRIZIONE";
    MDP.Name = "DESCRIZIONE";
    MDP.UIName = "DESCRIZIONE";
    MDP.GUID = "20C0F7D8-1345-41C8-894C-30758EE0E47F";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 140;
    MDP.vScale = 0;
    MDP.DBCode = "DESCRIZIONE";
    MDP.Nullable = false;
    MDP.DescribeRow = true;
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(12,MDP);
    MDP.Index = 12;
    MDP.ObjTag = "TIPOVAR";
    MDP.Name = "TIPOVAR";
    MDP.UIName = "TIPO VAR";
    MDP.GUID = "412E8A53-DD02-4C59-8267-A9D6F63F01EF";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "TIPO_VAR";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(13,MDP);
    MDP.Index = 13;
    MDP.ObjTag = "ANNOPROPOSTA";
    MDP.Name = "ANNOPROPOSTA";
    MDP.UIName = "ANNO PROPOSTA";
    MDP.GUID = "162AAF57-DE45-436E-AE2B-D08C9B8B4F24";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_PROPOSTA";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(14,MDP);
    MDP.Index = 14;
    MDP.ObjTag = "UNITAPROPONE";
    MDP.Name = "UNITAPROPONENTE";
    MDP.UIName = "UNITA PROPONENTE";
    MDP.GUID = "1573601B-EEE3-436B-9BAB-A42604D1DF56";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 255;
    MDP.vScale = 0;
    MDP.DBCode = "UNITA_PROPONENTE";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(15,MDP);
    MDP.Index = 15;
    MDP.ObjTag = "NUMEROPROPOS";
    MDP.Name = "NUMEROPROPOSTA";
    MDP.UIName = "NUMERO PROPOSTA";
    MDP.GUID = "2F09411F-480E-4442-B6DD-40EEDB4F8578";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "NUMERO_PROPOSTA";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(16,MDP);
    MDP.Index = 16;
    MDP.ObjTag = "VARBIL";
    MDP.Name = "VARBIL";
    MDP.UIName = "VAR BIL";
    MDP.GUID = "A96D6F31-7F1F-41D7-A1DE-014E974AD9BB";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "VAR_BIL";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(17,MDP);
    MDP.Index = 17;
    MDP.ObjTag = "CONSSVILUPPO";
    MDP.Name = "CONSSVILUPPO";
    MDP.UIName = "CONS SVILUPPO";
    MDP.GUID = "27444994-F0D7-40D8-BAD0-0E9354930655";
    MDP.Visible = true;
    MDP.Domain = "\"Consolidato\",\"C\",\"Sviluppo\",\"S\"";
    MDP.DataType = 5;
    MDP.MaxLength = 1;
    MDP.vScale = 0;
    MDP.DBCode = "CONS_SVILUPPO";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(18,MDP);
    MDP.Index = 18;
    MDP.ObjTag = "DDATAREG";
    MDP.Name = "DDATAREG";
    MDP.UIName = "D DATA REG";
    MDP.GUID = "6B2E76E5-A115-4004-89C7-ACC92597F5D9";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "D_DATA_REG";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(19,MDP);
    MDP.Index = 19;
    MDP.ObjTag = "ISTITUZIONNC";
    MDP.Name = "ISTITUZIONENC";
    MDP.UIName = "ISTITUZIONE NC";
    MDP.GUID = "2B809085-8B06-4B9E-A923-BFF8785F3B09";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "ISTITUZIONE_NC";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(20,MDP);
    MDP.Index = 20;
    MDP.ObjTag = "PROGETTOID";
    MDP.Name = "PROGETTOID";
    MDP.UIName = "PROGETTO ID";
    MDP.GUID = "7C94C7FA-C817-49CD-A0DE-FEA6A74FB4A4";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 9;
    MDP.vScale = 0;
    MDP.DBCode = "PROGETTO_ID";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(21,MDP);
    MDP.Index = 21;
    MDP.ObjTag = "FINANZIAMENTO";
    MDP.Name = "FINANZIAMENTO";
    MDP.UIName = "FINANZIAMENTO";
    MDP.GUID = "61554084-9E3F-40D8-B815-F8BF4AFCD8B0";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP.DBCode = "FINANZIAMENTO";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(22,MDP);
    MDP.Index = 22;
    MDP.ObjTag = "OPERA";
    MDP.Name = "OPERA";
    MDP.UIName = "OPERA";
    MDP.GUID = "70E20038-B414-4C1C-982D-D44F47C775C2";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP.DBCode = "OPERA";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(23,MDP);
    MDP.Index = 23;
    MDP.ObjTag = "PROGUNITORGA";
    MDP.Name = "PROGRUNITAORGANIZZATIVA";
    MDP.UIName = "PROGR UNITA ORGANIZZATIVA";
    MDP.GUID = "58721232-5B13-47FC-BCF7-3BE69C69B3AE";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "PROGR_UNITA_ORGANIZZATIVA";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(24,MDP);
    MDP.Index = 24;
    MDP.ObjTag = "UTENTEINSERI";
    MDP.Name = "UTENTEINSERIMENTO";
    MDP.UIName = "UTENTE INSERIMENTO";
    MDP.GUID = "3F998E8A-DC0F-463F-8931-9CBEBE86A7D9";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_INSERIMENTO";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(25,MDP);
    MDP.Index = 25;
    MDP.ObjTag = "DATAINSERIME";
    MDP.Name = "DATAINSERIMENTO";
    MDP.UIName = "DATA INSERIMENTO";
    MDP.GUID = "12B20C45-DFE8-4B15-BAE6-F43A722A8C87";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_INSERIMENTO";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(26,MDP);
    MDP.Index = 26;
    MDP.ObjTag = "UTENTULTIAGG";
    MDP.Name = "UTENTEULTIMOAGG";
    MDP.UIName = "UTENTE ULTIMO AGG";
    MDP.GUID = "CC1E51C9-9AF3-43E7-A3A3-B864CAF14EF7";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(27,MDP);
    MDP.Index = 27;
    MDP.ObjTag = "DATAULTIMAGG";
    MDP.Name = "DATAULTIMOAGG";
    MDP.UIName = "DATA ULTIMO AGG";
    MDP.GUID = "1530EA88-3DAC-4701-BC30-337EE3CECCE1";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(28,MDP);
    MDP.Index = 28;
    MDP.ObjTag = "PROUNIORGINS";
    MDP.Name = "PROGRUNITAORGANIZZATIVAINS";
    MDP.UIName = "PROGR UNITA ORGANIZZATIVA INS";
    MDP.GUID = "46FFB04F-10CC-4CB9-B77B-55C88BA3AD70";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "PROGR_UNITA_ORGANIZZATIVA_INS";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(29,MDP);
    MDP.Index = 29;
    MDP.ObjTag = "FATTORE";
    MDP.Name = "FATTORE";
    MDP.UIName = "FATTORE";
    MDP.GUID = "321F20CB-2D13-495F-A51B-BBC02642F599";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 16;
    MDP.vScale = 0;
    MDP.DBCode = "FATTORE";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(30,MDP);
    MDP.Index = 30;
    MDP.ObjTag = "CENTRO";
    MDP.Name = "CENTRO";
    MDP.UIName = "CENTRO";
    MDP.GUID = "FFD4617C-1193-41EB-A2AF-A515CFFF8DE8";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 16;
    MDP.vScale = 0;
    MDP.DBCode = "CENTRO";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(31,MDP);
    MDP.Index = 31;
    MDP.ObjTag = "SCHEDOBIETID";
    MDP.Name = "SCHEDAOBIETTIVOID";
    MDP.UIName = "SCHEDA OBIETTIVO ID";
    MDP.GUID = "0B7F0B54-CBE3-499A-8EBA-87A047989174";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "SCHEDA_OBIETTIVO_ID";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(32,MDP);
    MDP.Index = 32;
    MDP.ObjTag = "IMPORTOCASSA";
    MDP.Name = "IMPORTOCASSA";
    MDP.UIName = "IMPORTO CASSA";
    MDP.GUID = "A8509BCF-3B93-472B-AF44-71BAB110C25B";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMPORTO_CASSA";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(33,MDP);
    MDP.Index = 33;
    MDP.ObjTag = "PROGRPRIMVAR";
    MDP.Name = "PROGRESSIVOPRIMAVAR";
    MDP.UIName = "PROGRESSIVO PRIMA VAR";
    MDP.GUID = "07A68C27-5830-488D-9EF7-ABA8FBFE39BE";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    DOC = new DOMDLinkedDoc("VarProvv", 1);
    MDP.LinkedDoc = DOC;
    DOC.SetName("VARCOMPROFK");
    DOC.SetLinkedProp(0, VarProvv.VARPROVV_PROGRESSIVO, VarProvv.VARPROVV_PROGRPRIMVAR);
    MDP.DBCode = "PROGRESSIVO_PRIMA_VAR";
    MDP.FK = true;
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(34,MDP);
    MDP.Index = 34;
    MDP.ObjTag = "REISCRIDAIMP";
    MDP.Name = "REISCRIZIONEDAIMP";
    MDP.UIName = "REISCRIZIONE DA IMP";
    MDP.GUID = "7CA59C0C-9536-42C7-988A-F3BCFA5D96AA";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "REISCRIZIONE_DA_IMP";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(35,MDP);
    MDP.Index = 35;
    MDP.ObjTag = "REISCRIDASTN";
    MDP.Name = "REISCRIZIONEDASTN";
    MDP.UIName = "REISCRIZIONE DA STN";
    MDP.GUID = "CB95F594-C2B6-459F-A5E1-295686DAF5E7";
    MDP.Visible = true;
    MDP.Domain = "\"SI\",\"SI\",\"Null\",\"\"";
    MDP.DataType = 5;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "REISCRIZIONE_DA_STN";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(36,MDP);
    MDP.Index = 36;
    MDP.ObjTag = "INSERTED";
    MDP.Name = "Inserted";
    MDP.UIName = "Inserted";
    MDP.GUID = "0850B85C-7877-4793-BDD3-33F672C3369D";
    MDP.DataType = 11;
    MDP.MaxLength = 9;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(37,MDP);
    MDP.Index = 37;
    MDP.ObjTag = "ANNOIMP";
    MDP.Name = "ANNOIMP";
    MDP.UIName = "ANNO IMP";
    MDP.GUID = "8CF3C062-DE9F-40B9-AF6E-CB22F87C09A0";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_IMP";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(38,MDP);
    MDP.Index = 38;
    MDP.ObjTag = "NUMEROIMP";
    MDP.Name = "NUMEROIMP";
    MDP.UIName = "NUMERO IMP";
    MDP.GUID = "63D07A3A-EB81-4C28-821E-ACB6C84861CD";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP.DBCode = "NUMERO_IMP";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(39,MDP);
    MDP.Index = 39;
    MDP.ObjTag = "ANNOESIGIBIL";
    MDP.Name = "ANNOESIGIBILITA";
    MDP.UIName = "ANNO ESIGIBILITA";
    MDP.GUID = "0DB8B222-9600-4ECB-9EA6-9A4DD5A7BD71";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_ESIGIBILITA";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(40,MDP);
    MDP.Index = 40;
    MDP.ObjTag = "PROGREVARIMP";
    MDP.Name = "PROGRESSIVOVARIMP";
    MDP.UIName = "PROGRESSIVO VARIMP";
    MDP.GUID = "D2972C1A-C1F6-4A0D-994E-97FF06B67202";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "PROGRESSIVO_VARIMP";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(41,MDP);
    MDP.Index = 41;
    MDP.ObjTag = "CRONOPROGRID";
    MDP.Name = "CRONOPROGRAMMAID";
    MDP.UIName = "CRONOPROGRAMMA ID";
    MDP.GUID = "3DF1E6E4-738D-433E-9DC6-BD97F0E15F45";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "CRONOPROGRAMMA_ID";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(42,MDP);
    MDP.Index = 42;
    MDP.ObjTag = "PROGIMPUCRON";
    MDP.Name = "PROGRESSIVOIMPUTAZIONECRONO";
    MDP.UIName = "PROGRESSIVO IMPUTAZIONE CRONO";
    MDP.GUID = "D7F5EAC0-08A8-4B26-AA08-7A235A02EFB0";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "PROGRESSIVO_IMPUTAZIONE_CRONO";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(43,MDP);
    MDP.Index = 43;
    MDP.ObjTag = "ANNOPLURCRON";
    MDP.Name = "ANNOPLURCRONO";
    MDP.UIName = "ANNO PLUR CRONO";
    MDP.GUID = "69E903ED-955A-4D6A-B016-49A47EF9E49F";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_PLUR_CRONO";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(44,MDP);
    MDP.Index = 44;
    MDP.ObjTag = "PROGRVARCRON";
    MDP.Name = "PROGRESSIVOVARCRONO";
    MDP.UIName = "PROGRESSIVO VAR CRONO";
    MDP.GUID = "DA420E9E-4BBB-4059-8590-A179634C9DCC";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "PROGRESSIVO_VAR_CRONO";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(45,MDP);
    MDP.Index = 45;
    MDP.ObjTag = "ANNOACC";
    MDP.Name = "ANNOACC";
    MDP.UIName = "ANNO ACC";
    MDP.GUID = "11D22C1F-CB71-4726-82DB-0269E814042C";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ANNO_ACC";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(46,MDP);
    MDP.Index = 46;
    MDP.ObjTag = "NUMEROACC";
    MDP.Name = "NUMEROACC";
    MDP.UIName = "NUMERO ACC";
    MDP.GUID = "41CE7408-25C8-48F3-9B48-1DBF0A9360AE";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 5;
    MDP.vScale = 0;
    MDP.DBCode = "NUMERO_ACC";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(47,MDP);
    MDP.Index = 47;
    MDP.ObjTag = "PROGREVARACC";
    MDP.Name = "PROGRESSIVOVARACC";
    MDP.UIName = "PROGRESSIVO VARACC";
    MDP.GUID = "58D0201A-9833-4C6C-9E72-679B6DDE2FC7";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "PROGRESSIVO_VARACC";
    MDP = new DOMDProp();
    MDOVarProvv.SetProp(48,MDP);
    MDP.Index = 48;
    MDP.ObjTag = "OBIETTIVGEST";
    MDP.Name = "OBIETTIVOGEST";
    MDP.UIName = "Obiettivo Gestionale";
    MDP.GUID = "845E9EAA-19DC-4F8A-AB63-7B1D479F9AF2";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 9;
    MDP.vScale = 0;
    MDP.DBCode = "OBIETTIVO_GEST";
    MDOVarProvv.SetNumColl(2);
    MDC = new DOMDColl();
    MDOVarProvv.SetColl(1,MDC);
    MDC.Index = 1;
    MDC.Name = "VARCOMPROFK";
    MDC.ChildrenName = "VarProvv";
    MDC.Visible = true;
    MDC.PKColl.add("PROGRESSIVO");
    MDC.FKColl.add("PROGRPRIMVAR");
    MDC = new DOMDColl();
    MDOVarProvv.SetColl(2,MDC);
    MDC.Index = 2;
    MDC.Name = "PVBSCHEDEOBIETTIVIPROV";
    MDC.ChildrenName = "PvbSchedeObiettiviProv";
    MDC.Visible = true;
    MDC.PKColl.add("PROGRESSIVO");
    MDC.FKColl.add("PROGRESSIPVB");
    return MDOVarProvv;
  }

  public DOMDObj GetMD()
  {
    DOMDObj md = GetDOMD_VarProvv();
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
      if (Idx==VARPROVV_PROGRESSIVO) { setPROGRESSIVO(NewValue); break fine; }
      if (Idx==VARPROVV_ESERCIZIO) { setESERCIZIO(NewValue); break fine; }
      if (Idx==VARPROVV_ES) { setES(NewValue); break fine; }
      if (Idx==VARPROVV_CAPITOLO) { setCAPITOLO(NewValue); break fine; }
      if (Idx==VARPROVV_ARTICOLO) { setARTICOLO(NewValue); break fine; }
      if (Idx==VARPROVV_ANNODEL) { setANNODEL(NewValue); break fine; }
      if (Idx==VARPROVV_NUMERODEL) { setNUMERODEL(NewValue); break fine; }
      if (Idx==VARPROVV_SEDEDEL) { setSEDEDEL(NewValue); break fine; }
      if (Idx==VARPROVV_DATAREG) { setDATAREG(NewValue); break fine; }
      if (Idx==VARPROVV_IMPORTO) { setIMPORTO(NewValue); break fine; }
      if (Idx==VARPROVV_DESCRIZIONE) { setDESCRIZIONE(NewValue); break fine; }
      if (Idx==VARPROVV_TIPOVAR) { setTIPOVAR(NewValue); break fine; }
      if (Idx==VARPROVV_ANNOPROPOSTA) { setANNOPROPOSTA(NewValue); break fine; }
      if (Idx==VARPROVV_UNITAPROPONE) { setUNITAPROPONE(NewValue); break fine; }
      if (Idx==VARPROVV_NUMEROPROPOS) { setNUMEROPROPOS(NewValue); break fine; }
      if (Idx==VARPROVV_VARBIL) { setVARBIL(NewValue); break fine; }
      if (Idx==VARPROVV_CONSSVILUPPO) { setCONSSVILUPPO(NewValue); break fine; }
      if (Idx==VARPROVV_DDATAREG) { setDDATAREG(NewValue); break fine; }
      if (Idx==VARPROVV_ISTITUZIONNC) { setISTITUZIONNC(NewValue); break fine; }
      if (Idx==VARPROVV_PROGETTOID) { setPROGETTOID(NewValue); break fine; }
      if (Idx==VARPROVV_FINANZIAMENTO) { setFINANZIAMENTO(NewValue); break fine; }
      if (Idx==VARPROVV_OPERA) { setOPERA(NewValue); break fine; }
      if (Idx==VARPROVV_PROGUNITORGA) { setPROGUNITORGA(NewValue); break fine; }
      if (Idx==VARPROVV_UTENTEINSERI) { setUTENTEINSERI(NewValue); break fine; }
      if (Idx==VARPROVV_DATAINSERIME) { setDATAINSERIME(NewValue); break fine; }
      if (Idx==VARPROVV_UTENTULTIAGG) { setUTENTULTIAGG(NewValue); break fine; }
      if (Idx==VARPROVV_DATAULTIMAGG) { setDATAULTIMAGG(NewValue); break fine; }
      if (Idx==VARPROVV_PROUNIORGINS) { setPROUNIORGINS(NewValue); break fine; }
      if (Idx==VARPROVV_FATTORE) { setFATTORE(NewValue); break fine; }
      if (Idx==VARPROVV_CENTRO) { setCENTRO(NewValue); break fine; }
      if (Idx==VARPROVV_SCHEDOBIETID) { setSCHEDOBIETID(NewValue); break fine; }
      if (Idx==VARPROVV_IMPORTOCASSA) { setIMPORTOCASSA(NewValue); break fine; }
      if (Idx==VARPROVV_PROGRPRIMVAR) { setPROGRPRIMVAR(NewValue); break fine; }
      if (Idx==VARPROVV_REISCRIDAIMP) { setREISCRIDAIMP(NewValue); break fine; }
      if (Idx==VARPROVV_REISCRIDASTN) { setREISCRIDASTN(NewValue); break fine; }
      if (Idx==VARPROVV_INSERTED) { setINSERTED(NewValue); break fine; }
      if (Idx==VARPROVV_ANNOIMP) { setANNOIMP(NewValue); break fine; }
      if (Idx==VARPROVV_NUMEROIMP) { setNUMEROIMP(NewValue); break fine; }
      if (Idx==VARPROVV_ANNOESIGIBIL) { setANNOESIGIBIL(NewValue); break fine; }
      if (Idx==VARPROVV_PROGREVARIMP) { setPROGREVARIMP(NewValue); break fine; }
      if (Idx==VARPROVV_CRONOPROGRID) { setCRONOPROGRID(NewValue); break fine; }
      if (Idx==VARPROVV_PROGIMPUCRON) { setPROGIMPUCRON(NewValue); break fine; }
      if (Idx==VARPROVV_ANNOPLURCRON) { setANNOPLURCRON(NewValue); break fine; }
      if (Idx==VARPROVV_PROGRVARCRON) { setPROGRVARCRON(NewValue); break fine; }
      if (Idx==VARPROVV_ANNOACC) { setANNOACC(NewValue); break fine; }
      if (Idx==VARPROVV_NUMEROACC) { setNUMEROACC(NewValue); break fine; }
      if (Idx==VARPROVV_PROGREVARACC) { setPROGREVARACC(NewValue); break fine; }
      if (Idx==VARPROVV_OBIETTIVGEST) { setOBIETTIVGEST(NewValue); break fine; }
      super.SetPropByIndex(Idx, NewValue); break fine;
    }
  }
  
  
  // **********************************************
  // Get Collection By Index
  // **********************************************
  public IDCollection GetCollByIndex(int Idx)
  {
    if (Idx==1+BASE_COLLS) return VARCOMPROFK;
    if (Idx==2+BASE_COLLS) return PVBSCHOBIPRO;
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
  public static VarProvv CreateVarProvv()
  {
    return CreateVarProvv(null, null);
  }
  
  public static VarProvv CreateVarProvv(Object mainfrm, Object imdb) { return CreateVarProvv(mainfrm, imdb, null); } 
  public static VarProvv CreateVarProvv(Object mainfrm, Object imdb, Object mainfrmCF)
  {
    VarProvv newobj = null;
    //
    // Creating object
    if (ClassName == null)
      newobj = new VarProvv((MyWebEntryPoint)mainfrm, (IMDBObj)imdb); // No class factory
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
          newobj = (VarProvv)app.CreateDocument(ClassName);
        }
        else
        {
          // Classe con namespace: faccio creare l'istanza al componente corrispondente
          String CompNameSpace = ClassName.substring(0, ClassName.lastIndexOf('.'));
          com.progamma.is.WebEntryPoint cmp = app.GetCompFromNameSpace(CompNameSpace);
          if (cmp != null)
            newobj = (VarProvv)cmp.CreateDocument(ClassName.substring(ClassName.lastIndexOf('.') + 1));
          else
          {
            app.getDTTObj().AddMsg(DTTEngine.DTTMSG_ERROR, "", 191, "CreateVarProvv", 
                  "Can't find component " + CompNameSpace + " while handling VarProvv class factory");
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
    DOMDObj MD = GetDOMD_VarProvv();
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
    return (obj instanceof VarProvv);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VarProvv.class.getName() : (Glb.ClassWithPackage(VarProvv.class) ? VarProvv.class.getName().substring(VarProvv.class.getPackage().getName().length() + 1) : VarProvv.class.getName()));
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
        setTIPOVAR(IMDB.Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMTIPVAR, 0));
      }
      if (IDL.IsNull(getES()))
      {
        if (IMDB.Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMPARVAR, 0).equals((new IDVariant("E")), true))
        {
          setES((new IDVariant("E")));
        }
        if (IMDB.Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMPARVAR, 0).equals((new IDVariant("S")), true))
        {
          setES((new IDVariant("S")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VarProvv", "OnInserting", _e);
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
          IDVariant v_RIGHE = new IDVariant(0,IDVariant.INTEGER);
          com.progamma.doc.IDCollection v_COLL = null;
          v_COLL = PVBSCHOBIPRO;
          IDVariant v_SOMMAIMPORTO = new IDVariant(0,IDVariant.DECIMAL);
          IDVariant v_SOMMIMPOCASS = new IDVariant(0,IDVariant.DECIMAL);
          ListIterator L5 = v_COLL.GetLoopCollection().listIterator();
          while (L5.hasNext())
          {
            PvbSchedeObiettiviProv C5_COLL = (PvbSchedeObiettiviProv) L5.next();
            v_SOMMAIMPORTO = IDL.Add(v_SOMMAIMPORTO, C5_COLL.getIMPORTO());
            v_SOMMIMPOCASS = IDL.Add(v_SOMMIMPOCASS, C5_COLL.getCASSA());
            v_RIGHE = IDL.Add(v_RIGHE, (new IDVariant(1)));
          }
          if (!(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMTIPQUA, 0))))
          {
            if (!(IDL.IsNull(MainFrm.PVBPS4)))
            {
              if (IDL.IsNull(getPROGRPRIMVAR()))
              {
                if ((v_RIGHE.compareTo((new IDVariant(0)), true)>0) && (v_SOMMAIMPORTO.compareTo(getIMPORTO(), true)!=0) && IMDB.Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMQUAOBB, 0).equals((new IDVariant("SI")), true))
                {
                  AddDocError((new IDVariant("Importo Variazione non quadra con l'importo della Scheda Obiettivo")).stringValue()); 
                  Skip.set((new IDVariant(-1)));
                  Cancel.set((new IDVariant(-1)));
                  return;
                }
                if ((v_RIGHE.compareTo((new IDVariant(0)), true)>0) && (v_SOMMIMPOCASS.compareTo(getIMPORTOCASSA(), true)!=0) && IMDB.Value(IMDBDef3.TBL_PARAM20, IMDBDef3.FLD_PARAM20_ROWNAMQUOBCA, 0).equals((new IDVariant("SI")), true))
                {
                  AddDocError((new IDVariant("Importo Cassa della Variazione non quadra con l'importo cassa della Scheda Obiettivo")).stringValue()); 
                  Skip.set((new IDVariant(-1)));
                  Cancel.set((new IDVariant(-1)));
                  return;
                }
                if (new IDVariant(PVBSCHOBIPRO.Count()).equals((new IDVariant(0)), true))
                {
                  AddDocError((new IDVariant("Inserire le Schede Obiettivo")).stringValue()); 
                  Skip.set((new IDVariant(-1)));
                  Cancel.set((new IDVariant(-1)));
                  return;
                }
              }
            }
          }
          else
          {
            if (!(IDL.IsNull(MainFrm.PVBPS4)))
            {
              if (v_RIGHE.equals((new IDVariant(0)), true))
              {
                AddDocError((new IDVariant("Inserire le Schede Obiettivo")).stringValue()); 
                Skip.set((new IDVariant(-1)));
                Cancel.set((new IDVariant(-1)));
                return;
              }
            }
          }
          // if (!(IDL.IsNull(getPROGRPRIMVAR())))
          // {
            // IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
            // IDVariant v_FASE = null;
            // v_FASE = (new IDVariant());
            // SQL = new StringBuffer();
            // SQL.append("select ");
            // SQL.append("  COUNT(*) as COUNT1, ");
            // SQL.append("  MIN(A.FASE_BILANCIO) as MINESEFASBIL ");
            // SQL.append("from ");
            // SQL.append("  ESEFIN A ");
            // SQL.append("where (A.ESERCIZIO = " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            // if (!QV.EOF()) QV.MoveNext();
            // if (!QV.EOF())
            // {
            //   v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
            //   v_FASE = QV.Get("MINESEFASBIL", IDVariant.INTEGER) ;
            // }
            // QV.Close();
            // if (v_CONTA.equals((new IDVariant(0)), true))
            // {
              // AddDocError(IDL.Add(IDL.Add((new IDVariant("Esercizio ")), IDL.ToString(getESERCIZIO())), (new IDVariant(" non presente su esercizi finanziari"))).stringValue()); 
              // Skip.set((new IDVariant(-1)));
              // Cancel.set((new IDVariant(-1)));
            // }
            // else
            // {
              // if (v_FASE.compareTo((new IDVariant(3)), true)<0)
              // {
                // AddDocError(IDL.Add(IDL.Add((new IDVariant("Fase per l'esercizio ")), IDL.ToString(getESERCIZIO())), (new IDVariant(" non ammessa"))).stringValue()); 
                // Skip.set((new IDVariant(-1)));
                // Cancel.set((new IDVariant(-1)));
              // }
            // }
            // if (IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOREIS, 0).equals((new IDVariant("IMP")), true))
            // {
              // if (this.Inserted())
              // {
                // setREISCRIDAIMP((new IDVariant("SI")));
              // }
            // }
            // if (IMDB.Value(IMDBDef3.TBL_PARAM10, IMDBDef3.FLD_PARAM10_ESTRTIPOREIS, 0).equals((new IDVariant("STN")), true))
            // {
              // setREISCRIDASTN((new IDVariant("SI")));
            // }
          // }
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
        catch (Exception e40)
        {
          AddDocError(new IDVariant(e40.getMessage()).stringValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      throw new RuntimeException("BeforeSave - "+_e.getMessage(),_e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VarProvv", "AfterLoad", _e);
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
        if (getIMPORTO().compareTo(OLDIMPORCOMP, true)!=0)
        {
          if (!(IDL.IsNull(getIMPORTO())))
          {
            if (MainFrm.PVBPS4.equals((new IDVariant(2)), true))
            {
              if (new IDVariant(PVBSCHOBIPRO.Count()).equals((new IDVariant(0)), true))
              {
                if (getISTITUZIONNC().compareTo((new IDVariant("SI")), true)!=0)
                {
                  IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
                  IDVariant v_PROGRESSIVO = new IDVariant(0,IDVariant.INTEGER);
                  IDVariant v_CODICE = new IDVariant(0,IDVariant.STRING);
                  IDVariant v_DESCRESTESA = new IDVariant(0,IDVariant.STRING);
                  SQL = new StringBuffer();
                  SQL.append("select ");
                  SQL.append("  COUNT(*) as COUNT1, ");
                  SQL.append("  MAX(A.PROGRESSIVO) as MAXSCHOBIPRO, ");
                  SQL.append("  MAX(A.CODICE) as MAXSCHOBICOD, ");
                  SQL.append("  MAX(A.DESCRIZIONE_ESTESA) as MAXSCHOBDEES ");
                  SQL.append("from ");
                  SQL.append("  SCHEDE_OBIETTIVI A, ");
                  SQL.append("  CAPITOLI_SCHEDA B ");
                  SQL.append("where (A.PROGRESSIVO = B.PROGRESSIVO) ");
                  SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   ((A.DATA_FINE_VALIDITA IS NULL) OR A.DATA_FINE_VALIDITA >= TRUNC( SYSDATE )) ");
                  SQL.append("and   (A.PROGR_STORICO = 0) ");
                  SQL.append("and   (B.CAPITOLO = " + IDL.CSql(getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (B.ARTICOLO = " + IDL.CSql(getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (B.E_S = " + IDL.CSql(getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
                  QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                  if (!QV.EOF()) QV.MoveNext();
                  if (!QV.EOF())
                  {
                    v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
                    v_PROGRESSIVO = QV.Get("MAXSCHOBIPRO", IDVariant.INTEGER) ;
                    v_CODICE = QV.Get("MAXSCHOBICOD", IDVariant.STRING) ;
                    v_DESCRESTESA = QV.Get("MAXSCHOBDEES", IDVariant.STRING) ;
                  }
                  QV.Close();
                  if (v_CONTA.equals((new IDVariant(1)), true))
                  {
                    PvbSchedeObiettiviProv v_DOC = null;
                    v_DOC = (PvbSchedeObiettiviProv)new PvbSchedeObiettiviProv(MainFrm,IMDB);
                    v_DOC.Init();
                    v_DOC.setIMPORTO(new IDVariant(getIMPORTO()));
                    v_DOC.setPROGRESCHEDA(new IDVariant(v_PROGRESSIVO));
                    v_DOC.setCAPITOLO(new IDVariant(getCAPITOLO()));
                    v_DOC.setARTICOLO(new IDVariant(getARTICOLO()));
                    v_DOC.setES(new IDVariant(getES()));
                    v_DOC.setESERCIZIO(new IDVariant(getESERCIZIO()));
                    IDVariant v_MAX = new IDVariant(0,IDVariant.INTEGER);
                    SQL = new StringBuffer();
                    SQL.append("select ");
                    SQL.append("  PVB_SCHEDE_OBIETTIVI_SQ.nextval as PVBSCHEOBISQ ");
                    SQL.append("from ");
                    SQL.append("  DUAL A ");
                    QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                    if (!QV.EOF()) QV.MoveNext();
                    if (!QV.EOF())
                    {
                      v_MAX = QV.Get("PVBSCHEOBISQ", IDVariant.INTEGER) ;
                    }
                    QV.Close();
                    v_DOC.setPROGRESSIVO(new IDVariant(v_MAX));
                    v_DOC.setPROGRESSIPVB(new IDVariant(getPROGRESSIVO()));
                    PVBSCHOBIPRO.Add(v_DOC); 
                  }
                }
              }
              else
              {
                if (new IDVariant(PVBSCHOBIPRO.Count()).equals((new IDVariant(1)), true))
                {
                  PvbSchedeObiettiviProv v_PSO = null;
                  v_PSO = (PvbSchedeObiettiviProv)PVBSCHOBIPRO.GetDirect((new IDVariant(1)).intValue());
                  if (IDL.IsNull(v_PSO.getIMPORTO()))
                  {
                    v_PSO.setIMPORTO(new IDVariant(getIMPORTO()));
                    v_PSO.Validate(); 
                  }
                }
              }
            }
          }
          OLDIMPORCOMP = new IDVariant(getIMPORTO());
        }
        if (getIMPORTOCASSA().compareTo(OLDIMPORCASS, true)!=0)
        {
          if (!(IDL.IsNull(getIMPORTOCASSA())))
          {
            if (MainFrm.PVBPS4.equals((new IDVariant(2)), true))
            {
              if (new IDVariant(PVBSCHOBIPRO.Count()).equals((new IDVariant(0)), true))
              {
                if (getISTITUZIONNC().compareTo((new IDVariant("SI")), true)!=0)
                {
                  IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
                  IDVariant v_PROGRESSIVO = new IDVariant(0,IDVariant.INTEGER);
                  IDVariant v_CODICE = new IDVariant(0,IDVariant.STRING);
                  IDVariant v_DESCRESTESA = new IDVariant(0,IDVariant.STRING);
                  SQL = new StringBuffer();
                  SQL.append("select ");
                  SQL.append("  COUNT(*) as COUNT1, ");
                  SQL.append("  MAX(A.PROGRESSIVO) as MAXSCHOBIPRO, ");
                  SQL.append("  MAX(A.CODICE) as MAXSCHOBICOD, ");
                  SQL.append("  MAX(A.DESCRIZIONE_ESTESA) as MAXSCHOBDEES ");
                  SQL.append("from ");
                  SQL.append("  SCHEDE_OBIETTIVI A, ");
                  SQL.append("  CAPITOLI_SCHEDA B ");
                  SQL.append("where (A.PROGRESSIVO = B.PROGRESSIVO) ");
                  SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   ((A.DATA_FINE_VALIDITA IS NULL) OR A.DATA_FINE_VALIDITA >= TRUNC( SYSDATE )) ");
                  SQL.append("and   (A.PROGR_STORICO = 0) ");
                  SQL.append("and   (B.CAPITOLO = " + IDL.CSql(getCAPITOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (B.ARTICOLO = " + IDL.CSql(getARTICOLO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (B.E_S = " + IDL.CSql(getES(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
                  QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                  if (!QV.EOF()) QV.MoveNext();
                  if (!QV.EOF())
                  {
                    v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
                    v_PROGRESSIVO = QV.Get("MAXSCHOBIPRO", IDVariant.INTEGER) ;
                    v_CODICE = QV.Get("MAXSCHOBICOD", IDVariant.STRING) ;
                    v_DESCRESTESA = QV.Get("MAXSCHOBDEES", IDVariant.STRING) ;
                  }
                  QV.Close();
                  if (v_CONTA.equals((new IDVariant(1)), true))
                  {
                    PvbSchedeObiettiviProv v_DOC = null;
                    v_DOC = (PvbSchedeObiettiviProv)new PvbSchedeObiettiviProv(MainFrm,IMDB);
                    v_DOC.Init();
                    v_DOC.setCASSA(new IDVariant(getIMPORTOCASSA()));
                    v_DOC.setPROGRESCHEDA(new IDVariant(v_PROGRESSIVO));
                    v_DOC.setCAPITOLO(new IDVariant(getCAPITOLO()));
                    v_DOC.setARTICOLO(new IDVariant(getARTICOLO()));
                    v_DOC.setES(new IDVariant(getES()));
                    v_DOC.setESERCIZIO(new IDVariant(getESERCIZIO()));
                    IDVariant v_MAX = new IDVariant(0,IDVariant.INTEGER);
                    SQL = new StringBuffer();
                    SQL.append("select ");
                    SQL.append("  PVB_SCHEDE_OBIETTIVI_SQ.nextval as PVBSCHEOBISQ ");
                    SQL.append("from ");
                    SQL.append("  DUAL A ");
                    QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                    if (!QV.EOF()) QV.MoveNext();
                    if (!QV.EOF())
                    {
                      v_MAX = QV.Get("PVBSCHEOBISQ", IDVariant.INTEGER) ;
                    }
                    QV.Close();
                    v_DOC.setPROGRESSIVO(new IDVariant(v_MAX));
                    v_DOC.setPROGRESSIPVB(new IDVariant(getPROGRESSIVO()));
                    PVBSCHOBIPRO.Add(v_DOC); 
                  }
                }
              }
              else
              {
                if (new IDVariant(PVBSCHOBIPRO.Count()).equals((new IDVariant(1)), true))
                {
                  PvbSchedeObiettiviProv v_PSO = null;
                  v_PSO = (PvbSchedeObiettiviProv)PVBSCHOBIPRO.GetDirect((new IDVariant(1)).intValue());
                  if (IDL.IsNull(v_PSO.getCASSA()))
                  {
                    v_PSO.setCASSA(new IDVariant(getIMPORTOCASSA()));
                    v_PSO.Validate(); 
                  }
                }
              }
            }
          }
          OLDIMPORCASS = new IDVariant(getIMPORTOCASSA());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VarProvv", "OnValidate", _e);
    }
  }

  // **********************************************************************
  // On Updating
  // Evento notificato al documento quando varia la proprietà
  // Updated
  // **********************************************************************
  public void OnUpdating()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // On Updating Body
      // Corpo Procedura
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VarProvv", "OnUpdating", _e);
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
      MainFrm.ErrObj.ProcError ("VarProvv", "BeforeLoadCollection", _e);
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
        SQL.append("delete from VARCOMPRO ");
        SQL.append("where (PROGRESSIVO_PRIMA_VAR = " + IDL.CSql(getPROGRESSIVO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from PVB_SCHEDE_OBIETTIVI ");
        SQL.append("where (PROGRESSIVO_PVB = " + IDL.CSql(getPROGRESSIVO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VarProvv", "OnDeleting", _e);
    }
  }

  
}  
