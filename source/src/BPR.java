// **********************************************
// BPR
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

public class BPR extends com.progamma.doc.IDDocument
{  
  private MyWebEntryPoint MainFrm;
  private IMDBObj IMDB;
  private static String ClassName = null;

  // Property constant definitions
  public static int BPR_ESERCIZIO = 1;
  public static int BPR_ES = 2;
  public static int BPR_CAPITOLO = 3;
  public static int BPR_ARTICOLO = 4;
  public static int BPR_IMPACCULTCHI = 5;
  public static int BPR_IMPACCULTCON = 6;
  public static int BPR_IMPACCULTSVI = 7;
  public static int BPR_PREVISIONE = 8;
  public static int BPR_PREVISIOCONS = 9;
  public static int BPR_PREVISIOSVIL = 10;
  public static int BPR_STNINICO = 11;
  public static int BPR_STNINICOCONS = 12;
  public static int BPR_STNINICOSVIL = 13;
  public static int BPR_VARIAZIONICO = 14;
  public static int BPR_VARIAZCOSVIL = 15;
  public static int BPR_VARIAZCOCONS = 16;
  public static int BPR_IMPEGNABILE = 17;
  public static int BPR_UTENTEINSERI = 18;
  public static int BPR_DATAINSERIME = 19;
  public static int BPR_UTENTULTIAGG = 20;
  public static int BPR_DATAULTIMAGG = 21;
  public static int BPR_STNINICA = 22;
  public static int BPR_RESIDUPRESUN = 23;
  public static int BPR_REISCRIDAIMP = 24;
  public static int BPR_REISCRIDASTN = 25;
  public static int BPR_GIAIMPEGNATO = 26;
  public static int BPR_NUOVO = 27;
  public static int BPR_COMPETENPURA = 28;
  public static int BPR_FASEESEFIN = 29;
  public static int BPR_STNPURDACRO1 = 30;
  public static int BPR_STNPURDACRO2 = 31;
  public static int BPR_PREVISICASSA = 32;
  public static int MAX_VARS = 32;
  public static int BASE_VARS = 0;
  public static int BASE_COLLS = 0;

  // Definition of Global Variables
  public IDVariant getESERCIZIO() { return GetPropDirect(BPR_ESERCIZIO); }
  public void setESERCIZIO(IDVariant NewValue) { ChangePropDirect(BPR_ESERCIZIO,NewValue,false); }
  public IDVariant getES() { return GetPropDirect(BPR_ES); }
  public void setES(IDVariant NewValue) { ChangePropDirect(BPR_ES,NewValue,false); }
  public IDVariant getCAPITOLO() { return GetPropDirect(BPR_CAPITOLO); }
  public void setCAPITOLO(IDVariant NewValue) { ChangePropDirect(BPR_CAPITOLO,NewValue,false); }
  public IDVariant getARTICOLO() { return GetPropDirect(BPR_ARTICOLO); }
  public void setARTICOLO(IDVariant NewValue) { ChangePropDirect(BPR_ARTICOLO,NewValue,false); }
  public IDVariant getIMPACCULTCHI() { return GetPropDirect(BPR_IMPACCULTCHI); }
  public void setIMPACCULTCHI(IDVariant NewValue) { ChangePropDirect(BPR_IMPACCULTCHI,NewValue,false); }
  public IDVariant getIMPACCULTCON() { return GetPropDirect(BPR_IMPACCULTCON); }
  public void setIMPACCULTCON(IDVariant NewValue) { ChangePropDirect(BPR_IMPACCULTCON,NewValue,false); }
  public IDVariant getIMPACCULTSVI() { return GetPropDirect(BPR_IMPACCULTSVI); }
  public void setIMPACCULTSVI(IDVariant NewValue) { ChangePropDirect(BPR_IMPACCULTSVI,NewValue,false); }
  public IDVariant getPREVISIONE() { return GetPropDirect(BPR_PREVISIONE); }
  public void setPREVISIONE(IDVariant NewValue) { ChangePropDirect(BPR_PREVISIONE,NewValue,false); }
  public IDVariant getPREVISIOCONS() { return GetPropDirect(BPR_PREVISIOCONS); }
  public void setPREVISIOCONS(IDVariant NewValue) { ChangePropDirect(BPR_PREVISIOCONS,NewValue,false); }
  public IDVariant getPREVISIOSVIL() { return GetPropDirect(BPR_PREVISIOSVIL); }
  public void setPREVISIOSVIL(IDVariant NewValue) { ChangePropDirect(BPR_PREVISIOSVIL,NewValue,false); }
  public IDVariant getSTNINICO() { return GetPropDirect(BPR_STNINICO); }
  public void setSTNINICO(IDVariant NewValue) { ChangePropDirect(BPR_STNINICO,NewValue,false); }
  public IDVariant getSTNINICOCONS() { return GetPropDirect(BPR_STNINICOCONS); }
  public void setSTNINICOCONS(IDVariant NewValue) { ChangePropDirect(BPR_STNINICOCONS,NewValue,false); }
  public IDVariant getSTNINICOSVIL() { return GetPropDirect(BPR_STNINICOSVIL); }
  public void setSTNINICOSVIL(IDVariant NewValue) { ChangePropDirect(BPR_STNINICOSVIL,NewValue,false); }
  public IDVariant getVARIAZIONICO() { return GetPropDirect(BPR_VARIAZIONICO); }
  public void setVARIAZIONICO(IDVariant NewValue) { ChangePropDirect(BPR_VARIAZIONICO,NewValue,false); }
  public IDVariant getVARIAZCOSVIL() { return GetPropDirect(BPR_VARIAZCOSVIL); }
  public void setVARIAZCOSVIL(IDVariant NewValue) { ChangePropDirect(BPR_VARIAZCOSVIL,NewValue,false); }
  public IDVariant getVARIAZCOCONS() { return GetPropDirect(BPR_VARIAZCOCONS); }
  public void setVARIAZCOCONS(IDVariant NewValue) { ChangePropDirect(BPR_VARIAZCOCONS,NewValue,false); }
  public IDVariant getIMPEGNABILE() { return GetPropDirect(BPR_IMPEGNABILE); }
  public void setIMPEGNABILE(IDVariant NewValue) { ChangePropDirect(BPR_IMPEGNABILE,NewValue,false); }
  public IDVariant getUTENTEINSERI() { return GetPropDirect(BPR_UTENTEINSERI); }
  public void setUTENTEINSERI(IDVariant NewValue) { ChangePropDirect(BPR_UTENTEINSERI,NewValue,false); }
  public IDVariant getDATAINSERIME() { return GetPropDirect(BPR_DATAINSERIME); }
  public void setDATAINSERIME(IDVariant NewValue) { ChangePropDirect(BPR_DATAINSERIME,NewValue,false); }
  public IDVariant getUTENTULTIAGG() { return GetPropDirect(BPR_UTENTULTIAGG); }
  public void setUTENTULTIAGG(IDVariant NewValue) { ChangePropDirect(BPR_UTENTULTIAGG,NewValue,false); }
  public IDVariant getDATAULTIMAGG() { return GetPropDirect(BPR_DATAULTIMAGG); }
  public void setDATAULTIMAGG(IDVariant NewValue) { ChangePropDirect(BPR_DATAULTIMAGG,NewValue,false); }
  public IDVariant getSTNINICA() { return GetPropDirect(BPR_STNINICA); }
  public void setSTNINICA(IDVariant NewValue) { ChangePropDirect(BPR_STNINICA,NewValue,false); }
  public IDVariant getRESIDUPRESUN() { return GetPropDirect(BPR_RESIDUPRESUN); }
  public void setRESIDUPRESUN(IDVariant NewValue) { ChangePropDirect(BPR_RESIDUPRESUN,NewValue,false); }
  public IDVariant getREISCRIDAIMP() { return GetPropDirect(BPR_REISCRIDAIMP); }
  public void setREISCRIDAIMP(IDVariant NewValue) { ChangePropDirect(BPR_REISCRIDAIMP,NewValue,false); }
  public IDVariant getREISCRIDASTN() { return GetPropDirect(BPR_REISCRIDASTN); }
  public void setREISCRIDASTN(IDVariant NewValue) { ChangePropDirect(BPR_REISCRIDASTN,NewValue,false); }
  public IDVariant getGIAIMPEGNATO() { return GetPropDirect(BPR_GIAIMPEGNATO); }
  public void setGIAIMPEGNATO(IDVariant NewValue) { ChangePropDirect(BPR_GIAIMPEGNATO,NewValue,false); }
  public IDVariant getNUOVO() { return GetPropDirect(BPR_NUOVO); }
  public void setNUOVO(IDVariant NewValue) { ChangePropDirect(BPR_NUOVO,NewValue,false); }
  public IDVariant getCOMPETENPURA() { return GetPropDirect(BPR_COMPETENPURA); }
  public void setCOMPETENPURA(IDVariant NewValue) { ChangePropDirect(BPR_COMPETENPURA,NewValue,false); }
  public IDVariant getFASEESEFIN() { return GetPropDirect(BPR_FASEESEFIN); }
  public void setFASEESEFIN(IDVariant NewValue) { ChangePropDirect(BPR_FASEESEFIN,NewValue,false); }
  public IDVariant getSTNPURDACRO1() { return GetPropDirect(BPR_STNPURDACRO1); }
  public void setSTNPURDACRO1(IDVariant NewValue) { ChangePropDirect(BPR_STNPURDACRO1,NewValue,false); }
  public IDVariant getSTNPURDACRO2() { return GetPropDirect(BPR_STNPURDACRO2); }
  public void setSTNPURDACRO2(IDVariant NewValue) { ChangePropDirect(BPR_STNPURDACRO2,NewValue,false); }
  public IDVariant getPREVISICASSA() { return GetPropDirect(BPR_PREVISICASSA); }
  public void setPREVISICASSA(IDVariant NewValue) { ChangePropDirect(BPR_PREVISICASSA,NewValue,false); }
    
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
  public BPR()
  {
  }

  // **********************************************
  // Initialize common framework object
  // **********************************************
  public BPR(MyWebEntryPoint w, IMDBObj imdb)
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
  private static DOMDObj MDOBPR;
  public synchronized static DOMDObj GetDOMD_BPR()
  {
    DOMDProp MDP;
    DOMDColl MDC;
    DOMDLinkedDoc DOC;

    if (MDOBPR != null)
      return MDOBPR;
    else
      MDOBPR = new DOMDObj();
    MDOBPR.ObjTag = "BPR";
    MDOBPR.ObjGUID = "8196EC75-53D1-4DE7-8DF3-9A0DF0B10022";
    MDOBPR.UIName = "BPR";
    MDOBPR.Services = 0;
    MDOBPR.BaseProps = 0;
    MDOBPR.BaseColls = 0;
    MDOBPR.DBCode = "BPR";
    MDOBPR.DBSchema = ".";
    MDOBPR.SequenceCode = "BPR_$F";
    MDOBPR.DBType = 4;
    MDOBPR.AddQuery("A228F33C-AD2A-416C-8C21-BD6CB68EC9FB", "BPR_PK", "select 1 from BPR where ESERCIZIO=~~ESERCIZIO~~ and E_S=~~ES~~ and CAPITOLO=~~CAPITOLO~~ and ARTICOLO=~~ARTICOLO~~", "~~!ESERCIZIO~~=~~ESERCIZIO~~, ~~!ES~~=~~ES~~, ~~!CAPITOLO~~=~~CAPITOLO~~, ~~!ARTICOLO~~=~~ARTICOLO~~", 1);
    MDOBPR.SetNumProp(32);
    MDP = new DOMDProp();
    MDOBPR.SetProp(1,MDP);
    MDP.Index = 1;
    MDP.ObjTag = "ESERCIZIO";
    MDP.Name = "ESERCIZIO";
    MDP.UIName = "ESERCIZIO";
    MDP.GUID = "2E6AA9D7-1929-4A46-A163-262707515574";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 4;
    MDP.vScale = 0;
    MDP.DBCode = "ESERCIZIO";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOBPR.SetProp(2,MDP);
    MDP.Index = 2;
    MDP.ObjTag = "ES";
    MDP.Name = "ES";
    MDP.UIName = "E S";
    MDP.GUID = "60FA51F5-5783-4039-9921-7E4637F177D6";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 1;
    MDP.vScale = 0;
    MDP.DBCode = "E_S";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOBPR.SetProp(3,MDP);
    MDP.Index = 3;
    MDP.ObjTag = "CAPITOLO";
    MDP.Name = "CAPITOLO";
    MDP.UIName = "CAPITOLO";
    MDP.GUID = "02325826-3DCE-4B6A-B879-A6303984B7A5";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 16;
    MDP.vScale = 0;
    MDP.DBCode = "CAPITOLO";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOBPR.SetProp(4,MDP);
    MDP.Index = 4;
    MDP.ObjTag = "ARTICOLO";
    MDP.Name = "ARTICOLO";
    MDP.UIName = "ARTICOLO";
    MDP.GUID = "E2F460E9-00B6-4331-86B9-AC0DB3D5DFFA";
    MDP.Visible = true;
    MDP.DataType = 1;
    MDP.MaxLength = 2;
    MDP.vScale = 0;
    MDP.DBCode = "ARTICOLO";
    MDP.PK = true;
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOBPR.SetProp(5,MDP);
    MDP.Index = 5;
    MDP.ObjTag = "IMPACCULTCHI";
    MDP.Name = "IMPACCULTCHIUSO";
    MDP.UIName = "IMP ACC ULT CHIUSO";
    MDP.GUID = "8D82A163-4917-4244-AB40-C83AD2ECEB5C";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMP_ACC_ULT_CHIUSO";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBPR.SetProp(6,MDP);
    MDP.Index = 6;
    MDP.ObjTag = "IMPACCULTCON";
    MDP.Name = "IMPACCULTCONS";
    MDP.UIName = "IMP ACC ULT CONS";
    MDP.GUID = "5E37837A-E8CF-4DCB-B739-B11DE52E7384";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMP_ACC_ULT_CONS";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBPR.SetProp(7,MDP);
    MDP.Index = 7;
    MDP.ObjTag = "IMPACCULTSVI";
    MDP.Name = "IMPACCULTSVIL";
    MDP.UIName = "IMP ACC ULT SVIL";
    MDP.GUID = "46221E4D-D5A8-472C-9F5C-0B54B043B9C5";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMP_ACC_ULT_SVIL";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBPR.SetProp(8,MDP);
    MDP.Index = 8;
    MDP.ObjTag = "PREVISIONE";
    MDP.Name = "PREVISIONE";
    MDP.UIName = "PREVISIONE";
    MDP.GUID = "1BAB2F36-0C11-4389-B656-6A7B95E209A5";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "PREVISIONE";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBPR.SetProp(9,MDP);
    MDP.Index = 9;
    MDP.ObjTag = "PREVISIOCONS";
    MDP.Name = "PREVISIONECONS";
    MDP.UIName = "PREVISIONE CONS";
    MDP.GUID = "FC0983BF-51F0-43B4-8ABF-36B3A3855901";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "PREVISIONE_CONS";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBPR.SetProp(10,MDP);
    MDP.Index = 10;
    MDP.ObjTag = "PREVISIOSVIL";
    MDP.Name = "PREVISIONESVIL";
    MDP.UIName = "PREVISIONE SVIL";
    MDP.GUID = "D52B77FD-9ECA-4FD9-AB45-3CA6966E9C17";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "PREVISIONE_SVIL";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBPR.SetProp(11,MDP);
    MDP.Index = 11;
    MDP.ObjTag = "STNINICO";
    MDP.Name = "STNINICO";
    MDP.UIName = "STN INI CO";
    MDP.GUID = "FB6A25FD-6C28-4206-9158-3DE7A5BAF416";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "STN_INI_CO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOBPR.SetProp(12,MDP);
    MDP.Index = 12;
    MDP.ObjTag = "STNINICOCONS";
    MDP.Name = "STNINICOCONS";
    MDP.UIName = "STN INI CO CONS";
    MDP.GUID = "DBA6EC01-F2BF-4D2D-9092-C84E57D7EAE6";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "STN_INI_CO_CONS";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBPR.SetProp(13,MDP);
    MDP.Index = 13;
    MDP.ObjTag = "STNINICOSVIL";
    MDP.Name = "STNINICOSVIL";
    MDP.UIName = "STN INI CO SVIL";
    MDP.GUID = "4132A2CF-853E-4CEB-8EFD-64759F32122C";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "STN_INI_CO_SVIL";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBPR.SetProp(14,MDP);
    MDP.Index = 14;
    MDP.ObjTag = "VARIAZIONICO";
    MDP.Name = "VARIAZIONICO";
    MDP.UIName = "VARIAZIONI CO";
    MDP.GUID = "38C3261B-80BA-48D8-8CE7-956869FD6BB8";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "VARIAZIONI_CO";
    MDP.Nullable = false;
    MDP = new DOMDProp();
    MDOBPR.SetProp(15,MDP);
    MDP.Index = 15;
    MDP.ObjTag = "VARIAZCOSVIL";
    MDP.Name = "VARIAZIONICOSVIL";
    MDP.UIName = "VARIAZIONI CO SVIL";
    MDP.GUID = "DD08D3DC-5F72-4B13-BEE6-48B1C5A3C07E";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "VARIAZIONI_CO_SVIL";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBPR.SetProp(16,MDP);
    MDP.Index = 16;
    MDP.ObjTag = "VARIAZCOCONS";
    MDP.Name = "VARIAZIONICOCONS";
    MDP.UIName = "VARIAZIONI CO CONS";
    MDP.GUID = "3EF636BA-66BF-4A25-A3D3-5C03D4EDE44E";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "VARIAZIONI_CO_CONS";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDP = new DOMDProp();
    MDOBPR.SetProp(17,MDP);
    MDP.Index = 17;
    MDP.ObjTag = "IMPEGNABILE";
    MDP.Name = "IMPEGNABILE";
    MDP.UIName = "IMPEGNABILE";
    MDP.GUID = "C72F72E9-9A37-434D-9273-922235DB1549";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "IMPEGNABILE";
    MDP = new DOMDProp();
    MDOBPR.SetProp(18,MDP);
    MDP.Index = 18;
    MDP.ObjTag = "UTENTEINSERI";
    MDP.Name = "UTENTEINSERIMENTO";
    MDP.UIName = "UTENTE INSERIMENTO";
    MDP.GUID = "B38DE949-F81B-4F7F-BADA-DBFC8D26E5CD";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_INSERIMENTO";
    MDP = new DOMDProp();
    MDOBPR.SetProp(19,MDP);
    MDP.Index = 19;
    MDP.ObjTag = "DATAINSERIME";
    MDP.Name = "DATAINSERIMENTO";
    MDP.UIName = "DATA INSERIMENTO";
    MDP.GUID = "AE457428-1985-4BC8-9B87-DF3313A60567";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_INSERIMENTO";
    MDP = new DOMDProp();
    MDOBPR.SetProp(20,MDP);
    MDP.Index = 20;
    MDP.ObjTag = "UTENTULTIAGG";
    MDP.Name = "UTENTEULTIMOAGG";
    MDP.UIName = "UTENTE ULTIMO AGG";
    MDP.GUID = "1E443FA3-50FF-4FA8-A26C-EAADDFD7CFFA";
    MDP.Visible = true;
    MDP.DataType = 5;
    MDP.MaxLength = 8;
    MDP.vScale = 0;
    MDP.DBCode = "UTENTE_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOBPR.SetProp(21,MDP);
    MDP.Index = 21;
    MDP.ObjTag = "DATAULTIMAGG";
    MDP.Name = "DATAULTIMOAGG";
    MDP.UIName = "DATA ULTIMO AGG";
    MDP.GUID = "074D3DA7-34B8-4A19-9024-1461B5E5975A";
    MDP.Visible = true;
    MDP.DataType = 6;
    MDP.MaxLength = 10;
    MDP.vScale = 0;
    MDP.DBCode = "DATA_ULTIMO_AGG";
    MDP = new DOMDProp();
    MDOBPR.SetProp(22,MDP);
    MDP.Index = 22;
    MDP.ObjTag = "STNINICA";
    MDP.Name = "STNINICA";
    MDP.UIName = "STN INI CA";
    MDP.GUID = "439E9436-2E6B-4E5F-8913-9239E9BD1E67";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "STN_INI_CA";
    MDP = new DOMDProp();
    MDOBPR.SetProp(23,MDP);
    MDP.Index = 23;
    MDP.ObjTag = "RESIDUPRESUN";
    MDP.Name = "RESIDUIPRESUNTI";
    MDP.UIName = "RESIDUI PRESUNTI";
    MDP.GUID = "5717E247-2A32-4DDA-A21C-35951078C9C6";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "RESIDUI_PRESUNTI";
    MDP = new DOMDProp();
    MDOBPR.SetProp(24,MDP);
    MDP.Index = 24;
    MDP.ObjTag = "REISCRIDAIMP";
    MDP.Name = "REISCRIZIONIDAIMP";
    MDP.UIName = "REISCRIZIONI DA IMP";
    MDP.GUID = "588902E8-62DE-4F0E-9955-0C9E7E8D11F6";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "REISCRIZIONI_DA_IMP";
    MDP = new DOMDProp();
    MDOBPR.SetProp(25,MDP);
    MDP.Index = 25;
    MDP.ObjTag = "REISCRIDASTN";
    MDP.Name = "REISCRIZIONIDASTN";
    MDP.UIName = "REISCRIZIONI DA STN";
    MDP.GUID = "07856FE5-A4FD-4FEB-B456-808B17462A31";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "REISCRIZIONI_DA_STN";
    MDP = new DOMDProp();
    MDOBPR.SetProp(26,MDP);
    MDP.Index = 26;
    MDP.ObjTag = "GIAIMPEGNATO";
    MDP.Name = "GIAIMPEGNATO";
    MDP.UIName = "GIA IMPEGNATO";
    MDP.GUID = "3165CABC-4EAA-4E88-83E3-92A1230910ED";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "GIA_IMPEGNATO";
    MDP = new DOMDProp();
    MDOBPR.SetProp(27,MDP);
    MDP.Index = 27;
    MDP.ObjTag = "NUOVO";
    MDP.Name = "Nuovo";
    MDP.UIName = "Nuovo";
    MDP.GUID = "122E4833-1645-4740-935E-89628E35FB4B";
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOBPR.SetProp(28,MDP);
    MDP.Index = 28;
    MDP.ObjTag = "COMPETENPURA";
    MDP.Name = "CompetenzaPura";
    MDP.UIName = "Competenza Pura";
    MDP.GUID = "F8F40767-D316-472E-A60B-7CDD2001C778";
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP = new DOMDProp();
    MDOBPR.SetProp(29,MDP);
    MDP.Index = 29;
    MDP.ObjTag = "FASEESEFIN";
    MDP.Name = "Faseesefin";
    MDP.UIName = "Faseesefin";
    MDP.GUID = "88B7F345-F8D7-4175-9EFE-826B65FA243B";
    MDP.DataType = 1;
    MDP.MaxLength = 1;
    MDP.vScale = 0;
    MDP = new DOMDProp();
    MDOBPR.SetProp(30,MDP);
    MDP.Index = 30;
    MDP.ObjTag = "STNPURDACRO1";
    MDP.Name = "STNPURODACRONO1";
    MDP.UIName = "STN PURO DA CRONO 1";
    MDP.GUID = "C991BB81-2441-4F8C-98B4-ADB097897755";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "STN_PURO_DA_CRONO";
    MDP = new DOMDProp();
    MDOBPR.SetProp(31,MDP);
    MDP.Index = 31;
    MDP.ObjTag = "STNPURDACRO2";
    MDP.Name = "STNPURODACRONO2";
    MDP.UIName = "STN PURO DA CRONO 2";
    MDP.GUID = "984A5B2D-F497-4F04-86E9-7C58ECCFE78D";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "VAR_STN_PURO_DA_CRONO";
    MDP = new DOMDProp();
    MDOBPR.SetProp(32,MDP);
    MDP.Index = 32;
    MDP.ObjTag = "PREVISICASSA";
    MDP.Name = "PREVISIONECASSA";
    MDP.UIName = "PREVISIONE CASSA";
    MDP.GUID = "F9B76C5A-B802-4D28-9C96-5027035A41D7";
    MDP.Visible = true;
    MDP.DataType = 3;
    MDP.MaxLength = 14;
    MDP.vScale = 2;
    MDP.DBCode = "PREVISIONE_CASSA";
    MDP.Nullable = false;
    MDP.HasDefault = true;
    MDOBPR.SetNumColl(0);
    return MDOBPR;
  }

  public DOMDObj GetMD()
  {
    DOMDObj md = GetDOMD_BPR();
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
    setVARIAZCOSVIL((new IDVariant(0)));
    setVARIAZCOCONS((new IDVariant(0)));
    setPREVISICASSA((new IDVariant(0)));
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
      if (Idx==BPR_ESERCIZIO) { setESERCIZIO(NewValue); break fine; }
      if (Idx==BPR_ES) { setES(NewValue); break fine; }
      if (Idx==BPR_CAPITOLO) { setCAPITOLO(NewValue); break fine; }
      if (Idx==BPR_ARTICOLO) { setARTICOLO(NewValue); break fine; }
      if (Idx==BPR_IMPACCULTCHI) { setIMPACCULTCHI(NewValue); break fine; }
      if (Idx==BPR_IMPACCULTCON) { setIMPACCULTCON(NewValue); break fine; }
      if (Idx==BPR_IMPACCULTSVI) { setIMPACCULTSVI(NewValue); break fine; }
      if (Idx==BPR_PREVISIONE) { setPREVISIONE(NewValue); break fine; }
      if (Idx==BPR_PREVISIOCONS) { setPREVISIOCONS(NewValue); break fine; }
      if (Idx==BPR_PREVISIOSVIL) { setPREVISIOSVIL(NewValue); break fine; }
      if (Idx==BPR_STNINICO) { setSTNINICO(NewValue); break fine; }
      if (Idx==BPR_STNINICOCONS) { setSTNINICOCONS(NewValue); break fine; }
      if (Idx==BPR_STNINICOSVIL) { setSTNINICOSVIL(NewValue); break fine; }
      if (Idx==BPR_VARIAZIONICO) { setVARIAZIONICO(NewValue); break fine; }
      if (Idx==BPR_VARIAZCOSVIL) { setVARIAZCOSVIL(NewValue); break fine; }
      if (Idx==BPR_VARIAZCOCONS) { setVARIAZCOCONS(NewValue); break fine; }
      if (Idx==BPR_IMPEGNABILE) { setIMPEGNABILE(NewValue); break fine; }
      if (Idx==BPR_UTENTEINSERI) { setUTENTEINSERI(NewValue); break fine; }
      if (Idx==BPR_DATAINSERIME) { setDATAINSERIME(NewValue); break fine; }
      if (Idx==BPR_UTENTULTIAGG) { setUTENTULTIAGG(NewValue); break fine; }
      if (Idx==BPR_DATAULTIMAGG) { setDATAULTIMAGG(NewValue); break fine; }
      if (Idx==BPR_STNINICA) { setSTNINICA(NewValue); break fine; }
      if (Idx==BPR_RESIDUPRESUN) { setRESIDUPRESUN(NewValue); break fine; }
      if (Idx==BPR_REISCRIDAIMP) { setREISCRIDAIMP(NewValue); break fine; }
      if (Idx==BPR_REISCRIDASTN) { setREISCRIDASTN(NewValue); break fine; }
      if (Idx==BPR_GIAIMPEGNATO) { setGIAIMPEGNATO(NewValue); break fine; }
      if (Idx==BPR_NUOVO) { setNUOVO(NewValue); break fine; }
      if (Idx==BPR_COMPETENPURA) { setCOMPETENPURA(NewValue); break fine; }
      if (Idx==BPR_FASEESEFIN) { setFASEESEFIN(NewValue); break fine; }
      if (Idx==BPR_STNPURDACRO1) { setSTNPURDACRO1(NewValue); break fine; }
      if (Idx==BPR_STNPURDACRO2) { setSTNPURDACRO2(NewValue); break fine; }
      if (Idx==BPR_PREVISICASSA) { setPREVISICASSA(NewValue); break fine; }
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
  public static BPR CreateBPR()
  {
    return CreateBPR(null, null);
  }
  
  public static BPR CreateBPR(Object mainfrm, Object imdb) { return CreateBPR(mainfrm, imdb, null); } 
  public static BPR CreateBPR(Object mainfrm, Object imdb, Object mainfrmCF)
  {
    BPR newobj = null;
    //
    // Creating object
    if (ClassName == null)
      newobj = new BPR((MyWebEntryPoint)mainfrm, (IMDBObj)imdb); // No class factory
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
          newobj = (BPR)app.CreateDocument(ClassName);
        }
        else
        {
          // Classe con namespace: faccio creare l'istanza al componente corrispondente
          String CompNameSpace = ClassName.substring(0, ClassName.lastIndexOf('.'));
          com.progamma.is.WebEntryPoint cmp = app.GetCompFromNameSpace(CompNameSpace);
          if (cmp != null)
            newobj = (BPR)cmp.CreateDocument(ClassName.substring(ClassName.lastIndexOf('.') + 1));
          else
          {
            app.getDTTObj().AddMsg(DTTEngine.DTTMSG_ERROR, "", 191, "CreateBPR", 
                  "Can't find component " + CompNameSpace + " while handling BPR class factory");
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
    DOMDObj MD = GetDOMD_BPR();
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
    return (obj instanceof BPR);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? BPR.class.getName() : (Glb.ClassWithPackage(BPR.class) ? BPR.class.getName().substring(BPR.class.getPackage().getName().length() + 1) : BPR.class.getName()));
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
      setCOMPETENPURA(IDL.Sub(IDL.Sub(IDL.NullValue(getSTNINICO(),(new IDVariant(0))), IDL.NullValue(getREISCRIDASTN(),(new IDVariant(0)))), IDL.NullValue(getREISCRIDAIMP(),(new IDVariant(0)))));
      setNUOVO((new IDVariant(1, IDVariant.DECIMAL)));
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
      SetOriginal();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BPR", "AfterLoad", _e);
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
        setNUOVO((new IDVariant(1, IDVariant.DECIMAL)));
      }
    }
    catch (Exception _e)
    {
      throw new RuntimeException("AfterSave - "+_e.getMessage(),_e);
    }
  }

  
}  
