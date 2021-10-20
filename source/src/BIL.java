// **********************************************
// BIL
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

public class BIL extends com.progamma.doc.IDDocument
{  
  private MyWebEntryPoint MainFrm;
  private IMDBObj IMDB;
  private static String ClassName = null;

  // Property constant definitions
  public static int BIL_ESERCIZIO = 1;
  public static int BIL_ES = 2;
  public static int BIL_CAPITOLO = 3;
  public static int BIL_ARTICOLO = 4;
  public static int BIL_IMPACCULTCHI = 5;
  public static int BIL_IMPACCULTCON = 6;
  public static int BIL_IMPACCULTSVI = 7;
  public static int BIL_PREVISIONE = 8;
  public static int BIL_PREVISIOCONS = 9;
  public static int BIL_PREVISIOSVIL = 10;
  public static int BIL_STNINICO = 11;
  public static int BIL_STNINICOCONS = 12;
  public static int BIL_STNINICOSVIL = 13;
  public static int BIL_VARIAZIONICO = 14;
  public static int BIL_VARIAZCOCONS = 15;
  public static int BIL_VARIAZCOSVIL = 16;
  public static int BIL_DISPONIBILIT = 17;
  public static int BIL_DISPONIBCONS = 18;
  public static int BIL_DISPONIBSVIL = 19;
  public static int BIL_DISPONIBIBDG = 20;
  public static int BIL_IMPEGNABILE = 21;
  public static int BIL_VARIMPEGNABI = 22;
  public static int BIL_UTENTEINSERI = 23;
  public static int BIL_DATAINSERIME = 24;
  public static int BIL_UTENTULTIAGG = 25;
  public static int BIL_DATAULTIMAGG = 26;
  public static int BIL_STNINICA = 27;
  public static int BIL_VARIAZIONICA = 28;
  public static int BIL_DISPONIBILCA = 29;
  public static int BIL_RESIDUPRESUN = 30;
  public static int BIL_REISCRIDAIMP = 31;
  public static int BIL_REISCRIDASTN = 32;
  public static int BIL_GIAIMPEGNATO = 33;
  public static int BIL_VARIREIDAIMP = 34;
  public static int BIL_VARIREIDASTN = 35;
  public static int BIL_COMPETENPURA = 36;
  public static int BIL_NUOVO = 37;
  public static int BIL_FASEESEFIN = 38;
  public static int BIL_PREVISCASSA1 = 39;
  public static int MAX_VARS = 39;
  public static int BASE_VARS = 0;
  public static int BASE_COLLS = 0;

  // Definition of Global Variables
  public IDVariant getESERCIZIO() { return GetPropDirect(BIL_ESERCIZIO); }
  public void setESERCIZIO(IDVariant NewValue) { ChangePropDirect(BIL_ESERCIZIO,NewValue,false); }
  public IDVariant getES() { return GetPropDirect(BIL_ES); }
  public void setES(IDVariant NewValue) { ChangePropDirect(BIL_ES,NewValue,false); }
  public IDVariant getCAPITOLO() { return GetPropDirect(BIL_CAPITOLO); }
  public void setCAPITOLO(IDVariant NewValue) { ChangePropDirect(BIL_CAPITOLO,NewValue,false); }
  public IDVariant getARTICOLO() { return GetPropDirect(BIL_ARTICOLO); }
  public void setARTICOLO(IDVariant NewValue) { ChangePropDirect(BIL_ARTICOLO,NewValue,false); }
  public IDVariant getIMPACCULTCHI() { return GetPropDirect(BIL_IMPACCULTCHI); }
  public void setIMPACCULTCHI(IDVariant NewValue) { ChangePropDirect(BIL_IMPACCULTCHI,NewValue,false); }
  public IDVariant getIMPACCULTCON() { return GetPropDirect(BIL_IMPACCULTCON); }
  public void setIMPACCULTCON(IDVariant NewValue) { ChangePropDirect(BIL_IMPACCULTCON,NewValue,false); }
  public IDVariant getIMPACCULTSVI() { return GetPropDirect(BIL_IMPACCULTSVI); }
  public void setIMPACCULTSVI(IDVariant NewValue) { ChangePropDirect(BIL_IMPACCULTSVI,NewValue,false); }
  public IDVariant getPREVISIONE() { return GetPropDirect(BIL_PREVISIONE); }
  public void setPREVISIONE(IDVariant NewValue) { ChangePropDirect(BIL_PREVISIONE,NewValue,false); }
  public IDVariant getPREVISIOCONS() { return GetPropDirect(BIL_PREVISIOCONS); }
  public void setPREVISIOCONS(IDVariant NewValue) { ChangePropDirect(BIL_PREVISIOCONS,NewValue,false); }
  public IDVariant getPREVISIOSVIL() { return GetPropDirect(BIL_PREVISIOSVIL); }
  public void setPREVISIOSVIL(IDVariant NewValue) { ChangePropDirect(BIL_PREVISIOSVIL,NewValue,false); }
  public IDVariant getSTNINICO() { return GetPropDirect(BIL_STNINICO); }
  public void setSTNINICO(IDVariant NewValue) { ChangePropDirect(BIL_STNINICO,NewValue,false); }
  public IDVariant getSTNINICOCONS() { return GetPropDirect(BIL_STNINICOCONS); }
  public void setSTNINICOCONS(IDVariant NewValue) { ChangePropDirect(BIL_STNINICOCONS,NewValue,false); }
  public IDVariant getSTNINICOSVIL() { return GetPropDirect(BIL_STNINICOSVIL); }
  public void setSTNINICOSVIL(IDVariant NewValue) { ChangePropDirect(BIL_STNINICOSVIL,NewValue,false); }
  public IDVariant getVARIAZIONICO() { return GetPropDirect(BIL_VARIAZIONICO); }
  public void setVARIAZIONICO(IDVariant NewValue) { ChangePropDirect(BIL_VARIAZIONICO,NewValue,false); }
  public IDVariant getVARIAZCOCONS() { return GetPropDirect(BIL_VARIAZCOCONS); }
  public void setVARIAZCOCONS(IDVariant NewValue) { ChangePropDirect(BIL_VARIAZCOCONS,NewValue,false); }
  public IDVariant getVARIAZCOSVIL() { return GetPropDirect(BIL_VARIAZCOSVIL); }
  public void setVARIAZCOSVIL(IDVariant NewValue) { ChangePropDirect(BIL_VARIAZCOSVIL,NewValue,false); }
  public IDVariant getDISPONIBILIT() { return GetPropDirect(BIL_DISPONIBILIT); }
  public void setDISPONIBILIT(IDVariant NewValue) { ChangePropDirect(BIL_DISPONIBILIT,NewValue,false); }
  public IDVariant getDISPONIBCONS() { return GetPropDirect(BIL_DISPONIBCONS); }
  public void setDISPONIBCONS(IDVariant NewValue) { ChangePropDirect(BIL_DISPONIBCONS,NewValue,false); }
  public IDVariant getDISPONIBSVIL() { return GetPropDirect(BIL_DISPONIBSVIL); }
  public void setDISPONIBSVIL(IDVariant NewValue) { ChangePropDirect(BIL_DISPONIBSVIL,NewValue,false); }
  public IDVariant getDISPONIBIBDG() { return GetPropDirect(BIL_DISPONIBIBDG); }
  public void setDISPONIBIBDG(IDVariant NewValue) { ChangePropDirect(BIL_DISPONIBIBDG,NewValue,false); }
  public IDVariant getIMPEGNABILE() { return GetPropDirect(BIL_IMPEGNABILE); }
  public void setIMPEGNABILE(IDVariant NewValue) { ChangePropDirect(BIL_IMPEGNABILE,NewValue,false); }
  public IDVariant getVARIMPEGNABI() { return GetPropDirect(BIL_VARIMPEGNABI); }
  public void setVARIMPEGNABI(IDVariant NewValue) { ChangePropDirect(BIL_VARIMPEGNABI,NewValue,false); }
  public IDVariant getUTENTEINSERI() { return GetPropDirect(BIL_UTENTEINSERI); }
  public void setUTENTEINSERI(IDVariant NewValue) { ChangePropDirect(BIL_UTENTEINSERI,NewValue,false); }
  public IDVariant getDATAINSERIME() { return GetPropDirect(BIL_DATAINSERIME); }
  public void setDATAINSERIME(IDVariant NewValue) { ChangePropDirect(BIL_DATAINSERIME,NewValue,false); }
  public IDVariant getUTENTULTIAGG() { return GetPropDirect(BIL_UTENTULTIAGG); }
  public void setUTENTULTIAGG(IDVariant NewValue) { ChangePropDirect(BIL_UTENTULTIAGG,NewValue,false); }
  public IDVariant getDATAULTIMAGG() { return GetPropDirect(BIL_DATAULTIMAGG); }
  public void setDATAULTIMAGG(IDVariant NewValue) { ChangePropDirect(BIL_DATAULTIMAGG,NewValue,false); }
  public IDVariant getSTNINICA() { return GetPropDirect(BIL_STNINICA); }
  public void setSTNINICA(IDVariant NewValue) { ChangePropDirect(BIL_STNINICA,NewValue,false); }
  public IDVariant getVARIAZIONICA() { return GetPropDirect(BIL_VARIAZIONICA); }
  public void setVARIAZIONICA(IDVariant NewValue) { ChangePropDirect(BIL_VARIAZIONICA,NewValue,false); }
  public IDVariant getDISPONIBILCA() { return GetPropDirect(BIL_DISPONIBILCA); }
  public void setDISPONIBILCA(IDVariant NewValue) { ChangePropDirect(BIL_DISPONIBILCA,NewValue,false); }
  public IDVariant getRESIDUPRESUN() { return GetPropDirect(BIL_RESIDUPRESUN); }
  public void setRESIDUPRESUN(IDVariant NewValue) { ChangePropDirect(BIL_RESIDUPRESUN,NewValue,false); }
  public IDVariant getREISCRIDAIMP() { return GetPropDirect(BIL_REISCRIDAIMP); }
  public void setREISCRIDAIMP(IDVariant NewValue) { ChangePropDirect(BIL_REISCRIDAIMP,NewValue,false); }
  public IDVariant getREISCRIDASTN() { return GetPropDirect(BIL_REISCRIDASTN); }
  public void setREISCRIDASTN(IDVariant NewValue) { ChangePropDirect(BIL_REISCRIDASTN,NewValue,false); }
  public IDVariant getGIAIMPEGNATO() { return GetPropDirect(BIL_GIAIMPEGNATO); }
  public void setGIAIMPEGNATO(IDVariant NewValue) { ChangePropDirect(BIL_GIAIMPEGNATO,NewValue,false); }
  public IDVariant getVARIREIDAIMP() { return GetPropDirect(BIL_VARIREIDAIMP); }
  public void setVARIREIDAIMP(IDVariant NewValue) { ChangePropDirect(BIL_VARIREIDAIMP,NewValue,false); }
  public IDVariant getVARIREIDASTN() { return GetPropDirect(BIL_VARIREIDASTN); }
  public void setVARIREIDASTN(IDVariant NewValue) { ChangePropDirect(BIL_VARIREIDASTN,NewValue,false); }
  public IDVariant getCOMPETENPURA() { return GetPropDirect(BIL_COMPETENPURA); }
  public void setCOMPETENPURA(IDVariant NewValue) { ChangePropDirect(BIL_COMPETENPURA,NewValue,false); }
  public IDVariant getNUOVO() { return GetPropDirect(BIL_NUOVO); }
  public void setNUOVO(IDVariant NewValue) { ChangePropDirect(BIL_NUOVO,NewValue,false); }
  public IDVariant getFASEESEFIN() { return GetPropDirect(BIL_FASEESEFIN); }
  public void setFASEESEFIN(IDVariant NewValue) { ChangePropDirect(BIL_FASEESEFIN,NewValue,false); }
  public IDVariant getPREVISCASSA1() { return GetPropDirect(BIL_PREVISCASSA1); }
  public void setPREVISCASSA1(IDVariant NewValue) { ChangePropDirect(BIL_PREVISCASSA1,NewValue,false); }
    
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
  public BIL()
  {
  }

  // **********************************************
  // Initialize common framework object
  // **********************************************
  public BIL(MyWebEntryPoint w, IMDBObj imdb)
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
  private static DOMDObj MDOBIL;
  public synchronized static DOMDObj GetDOMD_BIL()
  {
    DOMDProp MDP;
    DOMDColl MDC;
    DOMDLinkedDoc DOC;

    if (MDOBIL != null)
      return MDOBIL;
    else
      MDOBIL = new DOMDObj();
    MDOBIL.ObjTag = "BIL";
    MDOBIL.ObjGUID = "9712D2E0-A22A-442C-91EC-D96F4158E3FA";
    MDOBIL.UIName = "BIL";
    MDOBIL.Services = 0;
    MDOBIL.BaseProps = 0;
    MDOBIL.BaseColls = 0;
    MDOBIL.DBCode = "BIL";
    MDOBIL.DBSchema = ".";
    MDOBIL.SequenceCode = "BIL_$F";
    MDOBIL.DBType = 4;
    MDOBIL.AddQuery("066ADEA7-3621-4DB8-BF43-C4D72FDFF821", "BIL_PK", "select 1 from BIL where ESERCIZIO=~~ESERCIZIO~~ and E_S=~~ES~~ and CAPITOLO=~~CAPITOLO~~ and ARTICOLO=~~ARTICOLO~~", "~~!ESERCIZIO~~=~~ESERCIZIO~~, ~~!ES~~=~~ES~~, ~~!CAPITOLO~~=~~CAPITOLO~~, ~~!ARTICOLO~~=~~ARTICOLO~~", 1);
    MDOBIL.SetNumProp(39);
    MDP = new DOMDProp();
    MDOBIL.SetProp(1,MDP);
    MDP.Index = 1;
    MDP.ObjTag = "ESERCIZIO";
    MDP.Name = "ESERCIZIO";
    MDP.UIName = "ESERCIZIO";
    MDP.GUID = "934BACD3-DEEC-4D48-A19B-B2E50612DD01";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 12;
    MDP.vScale = 0;
    MDP.DBCode = "ESERCIZIO";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP.Mask = "################";
    MDP = new DOMDProp();
    MDOBIL.SetProp(2,MDP);
    MDP.Index = 2;
    MDP.ObjTag = "ES";
    MDP.Name = "ES";
    MDP.UIName = "E S";
    MDP.GUID = "A2990CF2-A322-4F9A-89FF-6C947F876E39";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 1;
    MDP.vScale = 0;
    MDP.DBCode = "E_S";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOBIL.SetProp(3,MDP);
    MDP.Index = 3;
    MDP.ObjTag = "CAPITOLO";
    MDP.Name = "CAPITOLO";
    MDP.UIName = "CAPITOLO";
    MDP.GUID = "01B58373-321F-40D2-8D54-DD08EF2615BD";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 16;
    MDP.vScale = 0;
    MDP.DBCode = "CAPITOLO";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOBIL.SetProp(4,MDP);
    MDP.Index = 4;
    MDP.ObjTag = "ARTICOLO";
    MDP.Name = "ARTICOLO";
    MDP.UIName = "ARTICOLO";
    MDP.GUID = "50081BE5-7854-438C-B437-8CD6B171C69F";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "ARTICOLO";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOBIL.SetProp(5,MDP);
    MDP.Index = 5;
    MDP.ObjTag = "IMPACCULTCHI";
    MDP.Name = "IMPACCULTCHIUSO";
    MDP.UIName = "IMP ACC ULT CHIUSO";
    MDP.GUID = "BD914365-5D7B-4A6C-8304-27AD91140BEC";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMP_ACC_ULT_CHIUSO";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBIL.SetProp(6,MDP);
    MDP.Index = 6;
    MDP.ObjTag = "IMPACCULTCON";
    MDP.Name = "IMPACCULTCONS";
    MDP.UIName = "IMP ACC ULT CONS";
    MDP.GUID = "00999CCC-57E2-4909-B3C4-F30871C38237";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMP_ACC_ULT_CONS";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBIL.SetProp(7,MDP);
    MDP.Index = 7;
    MDP.ObjTag = "IMPACCULTSVI";
    MDP.Name = "IMPACCULTSVIL";
    MDP.UIName = "IMP ACC ULT SVIL";
    MDP.GUID = "05E03F2F-55A5-48E5-8D91-91DE62E551BF";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMP_ACC_ULT_SVIL";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBIL.SetProp(8,MDP);
    MDP.Index = 8;
    MDP.ObjTag = "PREVISIONE";
    MDP.Name = "PREVISIONE";
    MDP.UIName = "PREVISIONE";
    MDP.GUID = "2B22061C-22A9-4557-90F4-4C680954E292";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "PREVISIONE";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBIL.SetProp(9,MDP);
    MDP.Index = 9;
    MDP.ObjTag = "PREVISIOCONS";
    MDP.Name = "PREVISIONECONS";
    MDP.UIName = "PREVISIONE CONS";
    MDP.GUID = "38B0CD5E-0FB4-4EF4-9CA0-6F6229237AA6";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "PREVISIONE_CONS";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBIL.SetProp(10,MDP);
    MDP.Index = 10;
    MDP.ObjTag = "PREVISIOSVIL";
    MDP.Name = "PREVISIONESVIL";
    MDP.UIName = "PREVISIONE SVIL";
    MDP.GUID = "B1DFA532-D22B-40FD-8FB1-6FE07EA6F285";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "PREVISIONE_SVIL";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBIL.SetProp(11,MDP);
    MDP.Index = 11;
    MDP.ObjTag = "STNINICO";
    MDP.Name = "STNINICO";
    MDP.UIName = "STN INI CO";
    MDP.GUID = "18702863-9CF2-4F1D-BA8A-80CED4B18911";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "STN_INI_CO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOBIL.SetProp(12,MDP);
    MDP.Index = 12;
    MDP.ObjTag = "STNINICOCONS";
    MDP.Name = "STNINICOCONS";
    MDP.UIName = "STN INI CO CONS";
    MDP.GUID = "6599FB01-486F-4B87-95EB-FD6A3BB741BE";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "STN_INI_CO_CONS";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBIL.SetProp(13,MDP);
    MDP.Index = 13;
    MDP.ObjTag = "STNINICOSVIL";
    MDP.Name = "STNINICOSVIL";
    MDP.UIName = "STN INI CO SVIL";
    MDP.GUID = "AB9D086A-E829-476D-9F9F-866732AC9027";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "STN_INI_CO_SVIL";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBIL.SetProp(14,MDP);
    MDP.Index = 14;
    MDP.ObjTag = "VARIAZIONICO";
    MDP.Name = "VARIAZIONICO";
    MDP.UIName = "VARIAZIONI CO";
    MDP.GUID = "0697F978-B30F-47E6-A917-E343DA0575A5";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "VARIAZIONI_CO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOBIL.SetProp(15,MDP);
    MDP.Index = 15;
    MDP.ObjTag = "VARIAZCOCONS";
    MDP.Name = "VARIAZIONICOCONS";
    MDP.UIName = "VARIAZIONI CO CONS";
    MDP.GUID = "18A1F2A9-BAA5-495E-AB0E-D1532C27F10F";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "VARIAZIONI_CO_CONS";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBIL.SetProp(16,MDP);
    MDP.Index = 16;
    MDP.ObjTag = "VARIAZCOSVIL";
    MDP.Name = "VARIAZIONICOSVIL";
    MDP.UIName = "VARIAZIONI CO SVIL";
    MDP.GUID = "8DD66AC2-9D02-49CA-9931-1C2B7166BADA";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "VARIAZIONI_CO_SVIL";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBIL.SetProp(17,MDP);
    MDP.Index = 17;
    MDP.ObjTag = "DISPONIBILIT";
    MDP.Name = "DISPONIBILITA";
    MDP.UIName = "DISPONIBILITA";
    MDP.GUID = "C6599D46-0952-4DC2-BA23-BC03CD4405D7";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "DISPONIBILITA";
    MDP = new DOMDProp();
    MDOBIL.SetProp(18,MDP);
    MDP.Index = 18;
    MDP.ObjTag = "DISPONIBCONS";
    MDP.Name = "DISPONIBILITACONS";
    MDP.UIName = "DISPONIBILITA CONS";
    MDP.GUID = "2C640636-FD9F-4C51-A411-5EDF258BA264";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "DISPONIBILITA_CONS";
    MDP = new DOMDProp();
    MDOBIL.SetProp(19,MDP);
    MDP.Index = 19;
    MDP.ObjTag = "DISPONIBSVIL";
    MDP.Name = "DISPONIBILITASVIL";
    MDP.UIName = "DISPONIBILITA SVIL";
    MDP.GUID = "5A4D1790-E3DF-46AD-9D7E-2E2C68490549";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "DISPONIBILITA_SVIL";
    MDP = new DOMDProp();
    MDOBIL.SetProp(20,MDP);
    MDP.Index = 20;
    MDP.ObjTag = "DISPONIBIBDG";
    MDP.Name = "DISPONIBILITABDG";
    MDP.UIName = "DISPONIBILITA BDG";
    MDP.GUID = "AD7BCE20-B91C-452F-83EC-B3696BCF874B";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "DISPONIBILITA_BDG";
    MDP = new DOMDProp();
    MDOBIL.SetProp(21,MDP);
    MDP.Index = 21;
    MDP.ObjTag = "IMPEGNABILE";
    MDP.Name = "IMPEGNABILE";
    MDP.UIName = "IMPEGNABILE";
    MDP.GUID = "70C7A909-B94B-4804-8232-9128C495EB52";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMPEGNABILE";
    MDP = new DOMDProp();
    MDOBIL.SetProp(22,MDP);
    MDP.Index = 22;
    MDP.ObjTag = "VARIMPEGNABI";
    MDP.Name = "VARIMPEGNABILE";
    MDP.UIName = "VAR IMPEGNABILE";
    MDP.GUID = "6446FA76-DECC-41DA-9E94-6A38D5C0293E";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "VAR_IMPEGNABILE";
    MDP = new DOMDProp();
    MDOBIL.SetProp(23,MDP);
    MDP.Index = 23;
    MDP.ObjTag = "UTENTEINSERI";
    MDP.Name = "UTENTEINSERIMENTO";
    MDP.UIName = "UTENTE INSERIMENTO";
    MDP.GUID = "37DCD0DA-24AD-435D-946C-AEA050F76E8C";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_INSERIMENTO";
    MDP = new DOMDProp();
    MDOBIL.SetProp(24,MDP);
    MDP.Index = 24;
    MDP.ObjTag = "DATAINSERIME";
    MDP.Name = "DATAINSERIMENTO";
    MDP.UIName = "DATA INSERIMENTO";
    MDP.GUID = "42B8BAFE-338E-46FC-9CEB-A690495F15FA";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_INSERIMENTO";
    MDP = new DOMDProp();
    MDOBIL.SetProp(25,MDP);
    MDP.Index = 25;
    MDP.ObjTag = "UTENTULTIAGG";
    MDP.Name = "UTENTEULTIMOAGG";
    MDP.UIName = "UTENTE ULTIMO AGG";
    MDP.GUID = "BE1AAF94-0743-4914-96D0-26D673D98D2A";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOBIL.SetProp(26,MDP);
    MDP.Index = 26;
    MDP.ObjTag = "DATAULTIMAGG";
    MDP.Name = "DATAULTIMOAGG";
    MDP.UIName = "DATA ULTIMO AGG";
    MDP.GUID = "D75D8228-D405-4D08-B42F-1A3C37963630";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOBIL.SetProp(27,MDP);
    MDP.Index = 27;
    MDP.ObjTag = "STNINICA";
    MDP.Name = "STNINICA";
    MDP.UIName = "STN INI CA";
    MDP.GUID = "743970D9-82CC-4E0C-8914-D1CCF0154881";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "STN_INI_CA";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOBIL.SetProp(28,MDP);
    MDP.Index = 28;
    MDP.ObjTag = "VARIAZIONICA";
    MDP.Name = "VARIAZIONICA";
    MDP.UIName = "VARIAZIONI CA";
    MDP.GUID = "D7BFE9FA-2656-4AAB-A289-357AA79E4865";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "VARIAZIONI_CA";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOBIL.SetProp(29,MDP);
    MDP.Index = 29;
    MDP.ObjTag = "DISPONIBILCA";
    MDP.Name = "DISPONIBILITACA";
    MDP.UIName = "DISPONIBILITA CA";
    MDP.GUID = "4B8C4FA5-3AAA-4E8B-BBEF-9F1877E572A3";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "DISPONIBILITA_CA";
    MDP = new DOMDProp();
    MDOBIL.SetProp(30,MDP);
    MDP.Index = 30;
    MDP.ObjTag = "RESIDUPRESUN";
    MDP.Name = "RESIDUIPRESUNTI";
    MDP.UIName = "RESIDUI PRESUNTI";
    MDP.GUID = "F3B35D66-4AEE-4266-AC70-2D457E7A5E44";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "RESIDUI_PRESUNTI";
    MDP = new DOMDProp();
    MDOBIL.SetProp(31,MDP);
    MDP.Index = 31;
    MDP.ObjTag = "REISCRIDAIMP";
    MDP.Name = "REISCRIZIONIDAIMP";
    MDP.UIName = "REISCRIZIONI DA IMP";
    MDP.GUID = "AE818428-97DB-4C1D-8D14-FFCAA9980A99";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "REISCRIZIONI_DA_IMP";
    MDP = new DOMDProp();
    MDOBIL.SetProp(32,MDP);
    MDP.Index = 32;
    MDP.ObjTag = "REISCRIDASTN";
    MDP.Name = "REISCRIZIONIDASTN";
    MDP.UIName = "REISCRIZIONI DA STN";
    MDP.GUID = "B1899EDA-6DCA-46F5-9FCB-902AA14F312A";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "REISCRIZIONI_DA_STN";
    MDP = new DOMDProp();
    MDOBIL.SetProp(33,MDP);
    MDP.Index = 33;
    MDP.ObjTag = "GIAIMPEGNATO";
    MDP.Name = "GIAIMPEGNATO";
    MDP.UIName = "GIA IMPEGNATO";
    MDP.GUID = "9353C827-E26E-4D45-AFFB-A0162FABE4D7";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "GIA_IMPEGNATO";
    MDP = new DOMDProp();
    MDOBIL.SetProp(34,MDP);
    MDP.Index = 34;
    MDP.ObjTag = "VARIREIDAIMP";
    MDP.Name = "VARIAZIONIREISCRDAIMP";
    MDP.UIName = "VARIAZIONI REISCR DA IMP";
    MDP.GUID = "0157FE7D-8560-48D8-869C-6A708A553305";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "VARIAZIONI_REISCR_DA_IMP";
    MDP = new DOMDProp();
    MDOBIL.SetProp(35,MDP);
    MDP.Index = 35;
    MDP.ObjTag = "VARIREIDASTN";
    MDP.Name = "VARIAZIONIREISCRDASTN";
    MDP.UIName = "VARIAZIONI REISCR DA STN";
    MDP.GUID = "8D89E04C-FF50-4A27-8F0B-CD5E33C4D05B";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "VARIAZIONI_REISCR_DA_STN";
    MDP = new DOMDProp();
    MDOBIL.SetProp(36,MDP);
    MDP.Index = 36;
    MDP.ObjTag = "COMPETENPURA";
    MDP.Name = "CompetenzaPura";
    MDP.UIName = "Competenza Pura";
    MDP.GUID = "B50BAAFE-3533-46BA-A126-DCBBE1B90C9B";
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP = new DOMDProp();
    MDOBIL.SetProp(37,MDP);
    MDP.Index = 37;
    MDP.ObjTag = "NUOVO";
    MDP.Name = "Nuovo";
    MDP.UIName = "Nuovo";
    MDP.GUID = "88BD2D8E-1AF5-4171-B3DA-56FAE52DE194";
    MDP.DataType = 1;
    MDP.MaxLength = 1;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOBIL.SetProp(38,MDP);
    MDP.Index = 38;
    MDP.ObjTag = "FASEESEFIN";
    MDP.Name = "FaseEsefin";
    MDP.UIName = "Fase Esefin";
    MDP.GUID = "D38E166A-58E1-423F-8A30-BA0323722473";
    MDP.DataType = 1;
    MDP.MaxLength = 1;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOBIL.SetProp(39,MDP);
    MDP.Index = 39;
    MDP.ObjTag = "PREVISCASSA1";
    MDP.Name = "PREVISIONECASSA1";
    MDP.UIName = "PREVISIONE CASSA 1";
    MDP.GUID = "98F9E1E1-3ECC-430A-B287-4F24A848F94C";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "PREVISIONE_CASSA";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDOBIL.SetNumColl(0);
    return MDOBIL;
  }

  public DOMDObj GetMD()
  {
    DOMDObj md = GetDOMD_BIL();
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
    setIMPACCULTCHI((new IDVariant(0)));
    setIMPACCULTCON((new IDVariant(0)));
    setIMPACCULTSVI((new IDVariant(0)));
    setPREVISIONE((new IDVariant(0)));
    setPREVISIOCONS((new IDVariant(0)));
    setPREVISIOSVIL((new IDVariant(0)));
    setSTNINICOCONS((new IDVariant(0)));
    setSTNINICOSVIL((new IDVariant(0)));
    setVARIAZCOCONS((new IDVariant(0)));
    setVARIAZCOSVIL((new IDVariant(0)));
    setPREVISCASSA1((new IDVariant(0)));
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
      if (Idx==BIL_ESERCIZIO) { setESERCIZIO(NewValue); break fine; }
      if (Idx==BIL_ES) { setES(NewValue); break fine; }
      if (Idx==BIL_CAPITOLO) { setCAPITOLO(NewValue); break fine; }
      if (Idx==BIL_ARTICOLO) { setARTICOLO(NewValue); break fine; }
      if (Idx==BIL_IMPACCULTCHI) { setIMPACCULTCHI(NewValue); break fine; }
      if (Idx==BIL_IMPACCULTCON) { setIMPACCULTCON(NewValue); break fine; }
      if (Idx==BIL_IMPACCULTSVI) { setIMPACCULTSVI(NewValue); break fine; }
      if (Idx==BIL_PREVISIONE) { setPREVISIONE(NewValue); break fine; }
      if (Idx==BIL_PREVISIOCONS) { setPREVISIOCONS(NewValue); break fine; }
      if (Idx==BIL_PREVISIOSVIL) { setPREVISIOSVIL(NewValue); break fine; }
      if (Idx==BIL_STNINICO) { setSTNINICO(NewValue); break fine; }
      if (Idx==BIL_STNINICOCONS) { setSTNINICOCONS(NewValue); break fine; }
      if (Idx==BIL_STNINICOSVIL) { setSTNINICOSVIL(NewValue); break fine; }
      if (Idx==BIL_VARIAZIONICO) { setVARIAZIONICO(NewValue); break fine; }
      if (Idx==BIL_VARIAZCOCONS) { setVARIAZCOCONS(NewValue); break fine; }
      if (Idx==BIL_VARIAZCOSVIL) { setVARIAZCOSVIL(NewValue); break fine; }
      if (Idx==BIL_DISPONIBILIT) { setDISPONIBILIT(NewValue); break fine; }
      if (Idx==BIL_DISPONIBCONS) { setDISPONIBCONS(NewValue); break fine; }
      if (Idx==BIL_DISPONIBSVIL) { setDISPONIBSVIL(NewValue); break fine; }
      if (Idx==BIL_DISPONIBIBDG) { setDISPONIBIBDG(NewValue); break fine; }
      if (Idx==BIL_IMPEGNABILE) { setIMPEGNABILE(NewValue); break fine; }
      if (Idx==BIL_VARIMPEGNABI) { setVARIMPEGNABI(NewValue); break fine; }
      if (Idx==BIL_UTENTEINSERI) { setUTENTEINSERI(NewValue); break fine; }
      if (Idx==BIL_DATAINSERIME) { setDATAINSERIME(NewValue); break fine; }
      if (Idx==BIL_UTENTULTIAGG) { setUTENTULTIAGG(NewValue); break fine; }
      if (Idx==BIL_DATAULTIMAGG) { setDATAULTIMAGG(NewValue); break fine; }
      if (Idx==BIL_STNINICA) { setSTNINICA(NewValue); break fine; }
      if (Idx==BIL_VARIAZIONICA) { setVARIAZIONICA(NewValue); break fine; }
      if (Idx==BIL_DISPONIBILCA) { setDISPONIBILCA(NewValue); break fine; }
      if (Idx==BIL_RESIDUPRESUN) { setRESIDUPRESUN(NewValue); break fine; }
      if (Idx==BIL_REISCRIDAIMP) { setREISCRIDAIMP(NewValue); break fine; }
      if (Idx==BIL_REISCRIDASTN) { setREISCRIDASTN(NewValue); break fine; }
      if (Idx==BIL_GIAIMPEGNATO) { setGIAIMPEGNATO(NewValue); break fine; }
      if (Idx==BIL_VARIREIDAIMP) { setVARIREIDAIMP(NewValue); break fine; }
      if (Idx==BIL_VARIREIDASTN) { setVARIREIDASTN(NewValue); break fine; }
      if (Idx==BIL_COMPETENPURA) { setCOMPETENPURA(NewValue); break fine; }
      if (Idx==BIL_NUOVO) { setNUOVO(NewValue); break fine; }
      if (Idx==BIL_FASEESEFIN) { setFASEESEFIN(NewValue); break fine; }
      if (Idx==BIL_PREVISCASSA1) { setPREVISCASSA1(NewValue); break fine; }
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
  public static BIL CreateBIL()
  {
    return CreateBIL(null, null);
  }
  
  public static BIL CreateBIL(Object mainfrm, Object imdb) { return CreateBIL(mainfrm, imdb, null); } 
  public static BIL CreateBIL(Object mainfrm, Object imdb, Object mainfrmCF)
  {
    BIL newobj = null;
    //
    // Creating object
    if (ClassName == null)
      newobj = new BIL((MyWebEntryPoint)mainfrm, (IMDBObj)imdb); // No class factory
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
          newobj = (BIL)app.CreateDocument(ClassName);
        }
        else
        {
          // Classe con namespace: faccio creare l'istanza al componente corrispondente
          String CompNameSpace = ClassName.substring(0, ClassName.lastIndexOf('.'));
          com.progamma.is.WebEntryPoint cmp = app.GetCompFromNameSpace(CompNameSpace);
          if (cmp != null)
            newobj = (BIL)cmp.CreateDocument(ClassName.substring(ClassName.lastIndexOf('.') + 1));
          else
          {
            app.getDTTObj().AddMsg(DTTEngine.DTTMSG_ERROR, "", 191, "CreateBIL", 
                  "Can't find component " + CompNameSpace + " while handling BIL class factory");
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
    DOMDObj MD = GetDOMD_BIL();
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
    return (obj instanceof BIL);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? BIL.class.getName() : (Glb.ClassWithPackage(BIL.class) ? BIL.class.getName().substring(BIL.class.getPackage().getName().length() + 1) : BIL.class.getName()));
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
      setCOMPETENPURA(IDL.Sub(IDL.Sub(IDL.NullValue(getSTNINICO(),(new IDVariant(0))), IDL.NullValue(getREISCRIDAIMP(),(new IDVariant(0)))), IDL.NullValue(getREISCRIDASTN(),(new IDVariant(0)))));
      setNUOVO((new IDVariant(1)));
      IDVariant v_VESEFFASEBIL = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.FASE_BILANCIO as ESEFFASEBILA ");
      SQL.append("from ");
      SQL.append("  ESEFIN A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VESEFFASEBIL = QV.Get("ESEFFASEBILA", IDVariant.INTEGER) ;
      }
      QV.Close();
      setFASEESEFIN(new IDVariant(v_VESEFFASEBIL));
      SetOriginal();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BIL", "AfterLoad", _e);
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
        setNUOVO((new IDVariant(1)));
        IDVariant v_VESEFFASEBIL = null;
        v_VESEFFASEBIL = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.FASE_BILANCIO as ESEFFASEBILA ");
        SQL.append("from ");
        SQL.append("  ESEFIN A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(getESERCIZIO(), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VESEFFASEBIL = QV.Get("ESEFFASEBILA", IDVariant.INTEGER) ;
        }
        QV.Close();
        setFASEESEFIN(new IDVariant(v_VESEFFASEBIL));
      }
    }
    catch (Exception _e)
    {
      throw new RuntimeException("AfterSave - "+_e.getMessage(),_e);
    }
  }

  
}  
