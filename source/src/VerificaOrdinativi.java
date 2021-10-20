// **********************************************
// Verifica Ordinativi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VerificaOrdinativi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PAR_FUNZIONE = 0;
  private static int PFL_PAR_DETTAGLIQUID = 1;

  private static int PPQRY_PAR122 = 0;


  IDPanel PAN_PAR;
  private static int PFL_ORDINAERRATI_NUMEROMANDAT = 0;
  private static int PFL_ORDINAERRATI_ANNOMANDSP = 1;
  private static int PFL_ORDINAERRATI_INFOMANDATO = 2;
  private static int PFL_ORDINAERRATI_ETICHEMANDAT = 3;
  private static int PFL_ORDINAERRATI_NUMEROLIQUID = 4;
  private static int PFL_ORDINAERRATI_ANNOLIQUIDAZ = 5;
  private static int PFL_ORDINAERRATI_DUALINFOLIQ = 6;
  private static int PFL_ORDINAERRATI_IMPORTOIVA = 7;
  private static int PFL_ORDINAERRATI_FATDOCUMENTO = 8;
  private static int PFL_ORDINAERRATI_NUMEROORDINA = 9;
  private static int PFL_ORDINAERRATI_ANNOORD = 10;
  private static int PFL_ORDINAERRATI_DUALINFOORDI = 11;
  private static int PFL_ORDINAERRATI_DUALAPRIORDI = 12;
  private static int PFL_ORDINAERRATI_ETICHEORDINA = 13;
  private static int PFL_ORDINAERRATI_ORDIMPORTO = 14;
  private static int PFL_ORDINAERRATI_ANNOPROG = 15;
  private static int PFL_ORDINAERRATI_NUMEROPROG = 16;

  private static int PPQRY_ORD = 0;

  private static int PPQRY_DUAL = 1;
  private static int PPQRY_FAT = 2;


  IDPanel PAN_ORDINAERRATI;
  private static int PFL_NOTEFUNZIONA_MODULO = 0;
  private static int PFL_NOTEFUNZIONA_PAGINA = 1;
  private static int PFL_NOTEFUNZIONA_FUNZIONE1 = 2;
  private static int PFL_NOTEFUNZIONA_DESCRIZIONE = 3;

  private static int PPQRY_NOTEFUNZIO10 = 0;


  IDPanel PAN_NOTEFUNZIONA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR123(IMDB);
    Init_TBL_IMDB(IMDB);
    //
    //
    Init_PQRY_ORD(IMDB);
    Init_PQRY_ORD_RS(IMDB);
    Init_PQRY_NOTEFUNZIO10(IMDB);
    Init_PQRY_PAR122(IMDB);
    Init_PQRY_PAR122_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR123(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR123, 2);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR123, "TBL_PAR123");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR123,IMDBDef6.FLD_PAR123_NOMEOGGEFUNZ, "NOMEOGGEFUNZ");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR123,IMDBDef6.FLD_PAR123_NOMEOGGEFUNZ,5,50,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR123,IMDBDef6.FLD_PAR123_NOMOGGDETLIQ, "NOMOGGDETLIQ");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR123,IMDBDef6.FLD_PAR123_NOMOGGDETLIQ,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR123, 0);
  }

  private static void Init_TBL_IMDB(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_IMDB, 10);
    IMDB.set_TblCode(IMDBDef6.TBL_IMDB, "TBL_IMDB");
    IMDB.set_FldCode(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_ANNO_MAND_SP, "ANNO_MAND_SP");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_ANNO_MAND_SP,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NUMERO_MAND_SP, "NUMERO_MAND_SP");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NUMERO_MAND_SP,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NOMOGGIMPIVA, "NOMOGGIMPIVA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NOMOGGIMPIVA,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NOMOGGANNPRO, "NOMOGGANNPRO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NOMOGGANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NOMEOGGENUME,1,5,0);
  }

  private static void Init_PQRY_ORD(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORD, 10);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORD, "PQRY_ORD");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECONUMEMAND, "RECONUMEMAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECONUMEMAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RENOOGANMASP, "RENOOGANMASP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RENOOGANMASP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECONUMEORDI, "RECONUMEORDI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECONUMEORDI,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECANNNOMOGG, "RECANNNOMOGG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECANNNOMOGG,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECNOMOGGIMP, "RECNOMOGGIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECNOMOGGIMP,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECONUMELIQU, "RECONUMELIQU");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECONUMELIQU,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECOANNOLIQU, "RECOANNOLIQU");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECOANNOLIQU,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECNOMOGIMIV, "RECNOMOGIMIV");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECNOMOGIMIV,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECNOMOGANPR, "RECNOMOGANPR");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECNOMOGANPR,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECNOMOGGNUM, "RECNOMOGGNUM");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD,IMDBDef15.PQSL_ORD_RECNOMOGGNUM,1,5,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ORD, 0);
  }

  private static void Init_PQRY_ORD_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ORD_RS, 10);
    IMDB.set_TblCode(IMDBDef15.PQRY_ORD_RS, "PQRY_ORD_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECONUMEMAND, "RECONUMEMAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECONUMEMAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RENOOGANMASP, "RENOOGANMASP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RENOOGANMASP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECONUMEORDI, "RECONUMEORDI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECONUMEORDI,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECANNNOMOGG, "RECANNNOMOGG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECANNNOMOGG,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECNOMOGGIMP, "RECNOMOGGIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECNOMOGGIMP,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECONUMELIQU, "RECONUMELIQU");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECONUMELIQU,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECOANNOLIQU, "RECOANNOLIQU");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECOANNOLIQU,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECNOMOGIMIV, "RECNOMOGIMIV");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECNOMOGIMIV,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECNOMOGANPR, "RECNOMOGANPR");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECNOMOGANPR,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECNOMOGGNUM, "RECNOMOGGNUM");
    IMDB.SetFldParams(IMDBDef15.PQRY_ORD_RS,IMDBDef15.PQSL_ORD_RECNOMOGGNUM,1,5,0);
  }

  private static void Init_PQRY_NOTEFUNZIO10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NOTEFUNZIO10, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_NOTEFUNZIO10, "PQRY_NOTEFUNZIO10");
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZIO10,IMDBDef15.PQSL_NOTEFUNZIO10_MODULO, "MODULO");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZIO10,IMDBDef15.PQSL_NOTEFUNZIO10_MODULO,5,20,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZIO10,IMDBDef15.PQSL_NOTEFUNZIO10_PAGINA, "PAGINA");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZIO10,IMDBDef15.PQSL_NOTEFUNZIO10_PAGINA,5,200,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZIO10,IMDBDef15.PQSL_NOTEFUNZIO10_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZIO10,IMDBDef15.PQSL_NOTEFUNZIO10_FUNZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZIO10,IMDBDef15.PQSL_NOTEFUNZIO10_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZIO10,IMDBDef15.PQSL_NOTEFUNZIO10_DESCRIZIONE,9,9999,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_NOTEFUNZIO10, 0);
  }

  private static void Init_PQRY_PAR122(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR122, 2);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR122, "PQRY_PAR122");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR122,IMDBDef15.PQSL_PAR122_NOMEOGGEFUNZ, "NOMEOGGEFUNZ");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR122,IMDBDef15.PQSL_PAR122_NOMEOGGEFUNZ,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR122,IMDBDef15.PQSL_PAR122_NOMOGGDETLIQ, "NOMOGGDETLIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR122,IMDBDef15.PQSL_PAR122_NOMOGGDETLIQ,5,2,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PAR122, 0);
  }

  private static void Init_PQRY_PAR122_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR122_RS, 2);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR122_RS, "PQRY_PAR122_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR122_RS,IMDBDef15.PQSL_PAR122_NOMEOGGEFUNZ, "NOMEOGGEFUNZ");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR122_RS,IMDBDef15.PQSL_PAR122_NOMEOGGEFUNZ,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR122_RS,IMDBDef15.PQSL_PAR122_NOMOGGDETLIQ, "NOMOGGDETLIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR122_RS,IMDBDef15.PQSL_PAR122_NOMOGGDETLIQ,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VerificaOrdinativi(MyWebEntryPoint w, IMDBObj imdb)
  {
    //
    SetMainFrm(w,imdb);
  }

  // **********************************************
  // Funzione chiamata su form multipla
  // durante l'inizializzazione
  // **********************************************
  public void SetMainFrm(WebEntryPoint w, IMDBObj i)
  {
    // Sono una form multipla, duplico IMDB
    IMDB = new IMDBObj();
    IMDB.set_DBSize(w.IwImdb.IMDB.DBSize());
    ImdbInit(IMDB);
    IMDB.SetMaster(w.IwImdb.IMDB);
    super.SetMainFrm(w,i);
  }
  public void SetSubMainFrm(WebEntryPoint w, IMDBObj i)
  {
    // Sono una form multipla, duplico IMDB
    IMDB = new IMDBObj();
    IMDB.set_DBSize(w.IwImdb.IMDB.DBSize());
    ImdbInit(IMDB);
    IMDB.SetMaster(w.IwImdb.IMDB);
    super.SetSubMainFrm(w, i);
  }


  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VerificaOrdinativi()
  {
    super();
    //
  }

  // **********************************************
  // Form Loaded
  // **********************************************
  public void Init(WebEntryPoint w, boolean flMulti, boolean flSubForm)
  {
    StringBuffer SQL;
    int i;
    ATreeItem Item;

    MainFrm=(MyWebEntryPoint)w;
    super.Init(w, flMulti, flSubForm);
    //
    FormIdx = MyGlb.FRM_VERIFIORDINA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6A01E483-7471-4DFC-8BFA-70D0F50B89D0";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1032;
    DesignHeight = 378;
    set_Caption(new IDVariant("Verifica Ordinativi"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1032;
    Frames[1].Height = 352;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.102273;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1032;
    Frames[2].Height = 36;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Par";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 36;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PAR = new IDPanel(w, this, 2, "PAN_PAR");
    Frames[2].Content = PAN_PAR;
    PAN_PAR.Lockable = false;
    PAN_PAR.iLocked = false;
    PAN_PAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PAR.VS = MainFrm.VisualStyleList;
    PAN_PAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1032-MyGlb.PAN_OFFS_X, 36-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "19BF6320-F701-4EF0-BF30-6511F9036D1B");
    PAN_PAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 40, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PAR.InitStatus = 1;
    PAN_PAR_Init();
    PAN_PAR_InitFields();
    PAN_PAR_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1032;
    Frames[3].Height = 316;
    Frames[3].FormFactor = 0.786822;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 812;
    Frames[4].Height = 316;
    Frames[4].Caption = "Ordinativi Errati";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 316;
    PAN_ORDINAERRATI = new IDPanel(w, this, 4, "PAN_ORDINAERRATI");
    Frames[4].Content = PAN_ORDINAERRATI;
    PAN_ORDINAERRATI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDINAERRATI.VS = MainFrm.VisualStyleList;
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 812-MyGlb.PAN_OFFS_X, 316-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6D1045F3-01D3-47B5-BDF0-830F0227978E");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 780, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDINAERRATI.InitStatus = 2;
    PAN_ORDINAERRATI_Init();
    PAN_ORDINAERRATI_InitFields();
    PAN_ORDINAERRATI_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[3].ChildFrame2 = Frames[5];
    Frames[5].Width = 220;
    Frames[5].Height = 316;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "NOTE FUNZIONALITA";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 316;
    PAN_NOTEFUNZIONA = new IDPanel(w, this, 5, "PAN_NOTEFUNZIONA");
    Frames[5].Content = PAN_NOTEFUNZIONA;
    PAN_NOTEFUNZIONA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTEFUNZIONA.VS = MainFrm.VisualStyleList;
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 220-MyGlb.PAN_OFFS_X, 316-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "54E752E3-B230-4C6C-BBEE-72B816388C42");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTEFUNZIONA.InitStatus = 2;
    PAN_NOTEFUNZIONA_Init();
    PAN_NOTEFUNZIONA_InitFields();
    PAN_NOTEFUNZIONA_InitQueries();
    HelpFile = "";
    MainFrm.InitializingQueries = false;
    //
    // Modifico alcune impostazioni per smartphone, potranno
    // essere ulteriormente modificate nell'evento di Load
    if (MainFrm.IsSmartPhone())
    {
      DockType = 0;
      Docked = false;
      ResModeW = Glb.FRESMODE_STRETCH;
      ResModeH = Glb.FRESMODE_STRETCH;
    }
    //
    for (i=1; i<Frames.length; i++)
    {
      if (Frames[i].Content instanceof IDPanel)
      {
        Frames[i].Content.MainFrm = w;
        Frames[i].Content.Parent = this;
        ((IDPanel)Frames[i].Content).CalcLayout();
        ((IDPanel)Frames[i].Content).SetDOIMDB(IMDB);
      }
      if (Frames[i].Content instanceof OBook)
        Frames[i].Content.MainFrm = w;
      //
      if (Frames[i].Content != null)
        Frames[i].Content.Collapsable = w.ParamsObj().UseCollapsableFrames;
      //
      if (Frames[i].Content != null && Frames[i].HasCaptionToolbar==-1)
        Frames[i].HasCaptionToolbar = MainFrm.CmdObj.HasCaptionToolbar(FormIdx, Frames[i].Index, Frames[i].Content.Code);
    }
    //
    // Init sub-frames
    for (i = 1; i < Frames.length; i++)
    {
      if (Frames[i].Content instanceof IDPanel)
        for (int j = 0; j < ((IDPanel)Frames[i].Content).UFields(); j++)
          ((IDPanel)Frames[i].Content).bFields(j).UpdateSubFrame();
    }
    //
    for (i=1; i<Frames.length; i++)
    {
      if (Frames[i].Content instanceof OTabView)
        ((OTabView)Frames[i].Content).SelectTab(1, true);
    }
    OrgWidth = Frames[1].Width + GetPadding(false);
    OrgHeight = Frames[1].Height + GetPadding(true);
    //
    // Resetto il fuoco perchè le tabbed view lo possono modificare
    FocusPriority=0;
    ActiveElement="";
    //
    MainFrm.RolObj.ApplyRoles(FormIdx, this);
    //
    MainFrm.TimerObj.ActivateTimers(FormIdx, true);    
    IntFormLoad();
    //
    // Solo le form non modali devono essere ridimensionate
    if (!flSubForm && (!MainFrm.ParamsObj().TruePopup || OpenAs == Glb.OPEN_MDI))
      Resize(w.ScreenW(), w.ScreenH());
    //
    JustLoaded = true;
    UpdateControls();
    MainFrm.InitializingQueries = oldIQ;
  }


  // **********************************************
  // Command Activation Handler
  // **********************************************
  public void CmdClickCB(int CmdIdx)
  {
    fine:
    {
    }
  }
  
  
  // **********************************************
  // Timer Activation Handler
  // **********************************************
  public void TimerTickCB(int TimerIdx)
  {
    fine:
    {
    }
  }
  
  
  // **********************************************
  // Update Controls against IMDB variations
  // **********************************************
  public void UpdateControls()
  {
    try
    {    
      if (IMDB.TblModified(IMDBDef6.TBL_IMDB, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VERIFIORDINA_ORD();
      }
      if (IMDB.TblModified(IMDBDef6.TBL_PAR123, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VERIFIORDINA_PAR122();
      }
      PAN_ORDINAERRATI.UpdatePanel(MainFrm);
      PAN_NOTEFUNZIONA.UpdatePanel(MainFrm);
      PAN_PAR.UpdatePanel(MainFrm);
      //
    }
    catch(Exception e)
    {
      e.printStackTrace(System.out);
    }
    JustLoaded = false;
    DOSetCaption();
    super.UpdateControls();
  }
  
  
  // **********************************************
  // One of my modal form has been closed
  // **********************************************
  public void EndModal(int CallerIdx, boolean flRis)
  {
    IDVariant Cancel=new IDVariant();
    IntEndModal(new IDVariant(CallerIdx), new IDVariant(flRis), Cancel);
    if (Cancel.isTrue())
    {
      if (MainFrm != null) MainFrm.DTTObj.AddMsg(DTTEngine.DTTMSG_INFO, RTCGuid, 26, "Form.EndModal", "Form " + Caption() + " canceled further processing after EndModal event");
      return;
    }
    //
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof VerificaOrdinativi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VerificaOrdinativi.class.getName() : (Glb.ClassWithPackage(VerificaOrdinativi.class) ? VerificaOrdinativi.class.getName().substring(VerificaOrdinativi.class.getPackage().getName().length() + 1) : VerificaOrdinativi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Ordinativi Errati On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_ORDINAERRATI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinativi Errati On Updating Row Body
      // Corpo Procedura
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaOrdinativi", "OrdinativiErratiOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Errati On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDINAERRATI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ORDINAERRATI);
      // 
      // Ordinativi Errati On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ORDINAERRATI.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINAERRATI_FATDOCUMENTO,(new IDVariant(PAN_ORDINAERRATI.FieldText(PFL_ORDINAERRATI_FATDOCUMENTO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaOrdinativi", "OrdinativiErratiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Info Mandato
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoMandato ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Mandato Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMANNMAN, 0, IMDB.Value(IMDBDef15.PQRY_ORD, IMDBDef15.PQSL_ORD_RENOOGANMASP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMNUMMAN, 0, IMDB.Value(IMDBDef15.PQRY_ORD, IMDBDef15.PQSL_ORD_RECONUMEMAND, 0));
      MainFrm.Show(MyGlb.FRM_INFORMMANDAT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaOrdinativi", "InfoMandato", _e);
      return -1;
    }
  }

  // **********************************************************************
  // DUAL Info Ordinativo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DUALInfoOrdinativo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DUAL Info Ordinativo Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMANNOORD, 0, IMDB.Value(IMDBDef15.PQRY_ORD, IMDBDef15.PQSL_ORD_RECANNNOMOGG, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMNUMEORD, 0, IMDB.Value(IMDBDef15.PQRY_ORD, IMDBDef15.PQSL_ORD_RECONUMEORDI, 0));
      MainFrm.Show(MyGlb.FRM_INFOORDINATI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaOrdinativi", "DUALInfoOrdinativo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativo
  // **********************************************************************
  public int ApriOrdinativo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativo Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETINPU1, IMDBDef5.FLD_PARAMETINPU1_PARAMANNOORD, 0, IMDB.Value(IMDBDef15.PQRY_ORD, IMDBDef15.PQSL_ORD_RECANNNOMOGG, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETINPU1, IMDBDef5.FLD_PARAMETINPU1_PARAMNUMEORD, 0, IMDB.Value(IMDBDef15.PQRY_ORD, IMDBDef15.PQSL_ORD_RECONUMEORDI, 0));
      MainFrm.Show(MyGlb.FRM_ORDINATIVO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaOrdinativi", "ApriOrdinativo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Body
      // Corpo Procedura
      // 
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Verifica Ordinativi"));
      IMDB.set_Value(IMDBDef6.TBL_PAR123, IMDBDef6.FLD_PAR123_NOMEOGGEFUNZ, 0, new IDVariant(S));
      IMDB.set_Value(IMDBDef6.TBL_PAR123, IMDBDef6.FLD_PAR123_NOMOGGDETLIQ, 0, (new IDVariant("NO")));
      LOAD_IMDBDELETE();
      RimepiIMDB();
      PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaOrdinativi", "Load", _e);
    }
  }

  // **********************************************************************
  // IMDB: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_IMDBDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_IMDB);
  }

  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_IMDBDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaOrdinativi", "Unload", _e);
    }
  }

  // **********************************************************************
  // IMDB: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDBDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_IMDB);
  }

  // **********************************************************************
  // Par On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PAR_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Par On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PAR_DETTAGLIQUID)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef15.PQRY_PAR122, IMDBDef15.PQSL_PAR122_NOMOGGDETLIQ, 0).equals((new IDVariant("SI")), true))
        {
          RimepiIMDBConDett();
        }
        else
        {
          RimepiIMDB();
        }
        if (IMDB.Value(IMDBDef15.PQRY_PAR122, IMDBDef15.PQSL_PAR122_NOMOGGDETLIQ, 0).equals((new IDVariant("SI")), true))
        {
          PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ORDINAERRATI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaOrdinativi", "ParOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Rimepi IMDB
  // **********************************************************************
  public int RimepiIMDB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Rimepi IMDB Body
      // Corpo Procedura
      // 
      RIMEPIIMDB_IMDBDELETE();
      RIMEPIIMDB_IMDINSINTSE1();
      PAN_ORDINAERRATI.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaOrdinativi", "RimepiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // IMDB: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIMEPIIMDB_IMDBDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_IMDB);
  }

  // **********************************************************************
  // IMDB: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void RIMEPIIMDB_IMDINSINTSE1() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_ORD as ANNOORD, ");
    SQL.append("  A.NUMERO_ORD as NUMEROORD, ");
    SQL.append("  A.ANNO_MAND_SP as ORDANNOMANSP, ");
    SQL.append("  A.NUMERO_MAND_SP as ORDNUMEMANSP, ");
    SQL.append("  A.IMPORTO as ORDIMPORTO ");
    SQL.append("from ");
    SQL.append("  ORD A ");
    SQL.append("where (A.IMPORTO > NVL(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  SUM(NVL(B.IMPORTO_IVA, 0)) ");
    SQL.append("from ");
    SQL.append("  LIQ B ");
    SQL.append("where (B.ANNO_MAND = A.ANNO_MAND_SP) ");
    SQL.append("and   (B.NUMERO_MAND = A.NUMERO_MAND_SP) ");
    SQL.append("), 0)) ");
    SQL.append("and   (A.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (NOT ((A.ANNO_MAND_SP IS NULL))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  C.ANNO_ORD, ");
    SQL.append("  C.NUMERO_ORD, ");
    SQL.append("  C.ANNO_MAND_SP, ");
    SQL.append("  C.NUMERO_MAND_SP, ");
    SQL.append("  C.IMPORTO ");
    SQL.append("from ");
    SQL.append("  ORD C ");
    SQL.append("where (C.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (NOT ((C.ANNO_MAND_SP IS NULL))) ");
    SQL.append("and   (C.ANNO_MAND_SP = C.ANNO_ORD) ");
    SQL.append("and   (C.NUMERO_MAND_SP IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  S.NUMERO_MAND_SP ");
    SQL.append("from ");
    SQL.append("  ORD S ");
    SQL.append("where (S.ANNO_ORD = C.ANNO_ORD) ");
    SQL.append("and   (NOT ((S.ANNO_MAND_SP IS NULL))) ");
    SQL.append("group by ");
    SQL.append("  S.NUMERO_MAND_SP ");
    SQL.append("having (SUM(S.IMPORTO) <> ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  SUM(NVL(D.IMPORTO_IVA, 0)) ");
    SQL.append("from ");
    SQL.append("  LIQ D ");
    SQL.append("where (D.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (D.NUMERO_MAND = S.NUMERO_MAND_SP) ");
    SQL.append(")) ");
    SQL.append(")) ");
    SQL.append("order by 3, 4, 1, 2 ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef6.TBL_IMDB, 0);
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_ANNO_ORD,0,RS.Get(1));
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NUMERO_ORD,0,RS.Get(2));
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_ANNO_MAND_SP,0,RS.Get(3));
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NUMERO_MAND_SP,0,RS.Get(4));
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_IMPORTO,0,RS.Get(5));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Rimepi IMDB Con Dett
  // **********************************************************************
  public int RimepiIMDBConDett ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Rimepi IMDB Con Dett Body
      // Corpo Procedura
      // 
      RIMIMDCONDET_IMDBDELETE();
      RIMIMDCONDET_IMDINSINTSEL();
      PAN_ORDINAERRATI.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaOrdinativi", "RimepiIMDBConDett", _e);
      return -1;
    }
  }

  // **********************************************************************
  // IMDB: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIMIMDCONDET_IMDBDELETE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_IMDB);
  }

  // **********************************************************************
  // IMDB: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void RIMIMDCONDET_IMDINSINTSEL() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.ANNO_ORD as ANNOORD, ");
    SQL.append("  A.NUMERO_ORD as NUMEROORD, ");
    SQL.append("  A.ANNO_MAND_SP as ORDANNOMANSP, ");
    SQL.append("  A.NUMERO_MAND_SP as ORDNUMEMANSP, ");
    SQL.append("  A.IMPORTO as ORDIMPORTO, ");
    SQL.append("  F.ANNO_LIQ as ANNOLIQ, ");
    SQL.append("  F.NUMERO_LIQ as NUMEROLIQ, ");
    SQL.append("  F.FAT_ANNO_PROG as LIQFATANNPRO, ");
    SQL.append("  F.FAT_NUMERO_PROG as LIQFATNUMPRO, ");
    SQL.append("  F.IMPORTO_IVA as LIQIMPORTIVA ");
    SQL.append("from ");
    SQL.append("  ORD A, ");
    SQL.append("  LIQ F ");
    SQL.append("where (A.IMPORTO > NVL(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  SUM(NVL(B.IMPORTO_IVA, 0)) ");
    SQL.append("from ");
    SQL.append("  LIQ B ");
    SQL.append("where (B.ANNO_MAND = A.ANNO_MAND_SP) ");
    SQL.append("and   (B.NUMERO_MAND = A.NUMERO_MAND_SP) ");
    SQL.append("), 0)) ");
    SQL.append("and   (A.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (NOT ((A.ANNO_MAND_SP IS NULL))) ");
    SQL.append("and   (F.ANNO_MAND = A.ANNO_MAND_SP) ");
    SQL.append("and   (F.NUMERO_MAND = A.NUMERO_MAND_SP) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  C.ANNO_ORD, ");
    SQL.append("  C.NUMERO_ORD, ");
    SQL.append("  C.ANNO_MAND_SP, ");
    SQL.append("  C.NUMERO_MAND_SP, ");
    SQL.append("  C.IMPORTO, ");
    SQL.append("  E.ANNO_LIQ, ");
    SQL.append("  E.NUMERO_LIQ, ");
    SQL.append("  E.FAT_ANNO_PROG, ");
    SQL.append("  E.FAT_NUMERO_PROG, ");
    SQL.append("  E.IMPORTO_IVA ");
    SQL.append("from ");
    SQL.append("  ORD C, ");
    SQL.append("  LIQ E ");
    SQL.append("where (C.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (NOT ((C.ANNO_MAND_SP IS NULL))) ");
    SQL.append("and   (C.ANNO_MAND_SP = C.ANNO_ORD) ");
    SQL.append("and   (C.NUMERO_MAND_SP IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  S.NUMERO_MAND_SP ");
    SQL.append("from ");
    SQL.append("  ORD S ");
    SQL.append("where (S.ANNO_ORD = C.ANNO_ORD) ");
    SQL.append("and   (NOT ((S.ANNO_MAND_SP IS NULL))) ");
    SQL.append("group by ");
    SQL.append("  S.NUMERO_MAND_SP ");
    SQL.append("having (SUM(S.IMPORTO) <> ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  SUM(NVL(D.IMPORTO_IVA, 0)) ");
    SQL.append("from ");
    SQL.append("  LIQ D ");
    SQL.append("where (D.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (D.NUMERO_MAND = S.NUMERO_MAND_SP) ");
    SQL.append(")) ");
    SQL.append(")) ");
    SQL.append("and   (E.NUMERO_MAND = C.NUMERO_MAND_SP) ");
    SQL.append("and   (E.ANNO_MAND = C.ANNO_MAND_SP) ");
    SQL.append("order by 3, 4, 6, 7, 1, 2 ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef6.TBL_IMDB, 0);
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_ANNO_ORD,0,RS.Get(1));
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NUMERO_ORD,0,RS.Get(2));
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_ANNO_MAND_SP,0,RS.Get(3));
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NUMERO_MAND_SP,0,RS.Get(4));
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_IMPORTO,0,RS.Get(5));
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_ANNO_LIQ,0,RS.Get(6));
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NUMERO_LIQ,0,RS.Get(7));
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NOMOGGANNPRO,0,RS.Get(8));
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NOMEOGGENUME,0,RS.Get(9));
      IMDB.set_Value(IMDBDef6.TBL_IMDB,IMDBDef6.FLD_IMDB_NOMOGGIMPIVA,0,RS.Get(10));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // DUAL Info Liq
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DUALInfoLiq ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DUAL Info Liq Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef15.PQRY_ORD, IMDBDef15.PQSL_ORD_RECOANNOLIQU, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef15.PQRY_ORD, IMDBDef15.PQSL_ORD_RECONUMELIQU, 0));
      MainFrm.Show(MyGlb.FRM_INFOLIQUIDAZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaOrdinativi", "DUALInfoLiq", _e);
      return -1;
    }
  }

  // **********************************************************************
  // ORD
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void VERIFIORDINA_ORD() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_ORD_RS);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef6.TBL_IMDB, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_IMDB, 0))
    {
      IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
      IMDB.TblLinkRow(IMDBDef1.TMP_RECORDSET, 0, IMDBDef6.TBL_IMDB, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 0, 0, IMDBDef6.TBL_IMDB, IMDBDef6.FLD_IMDB_NUMERO_MAND_SP, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 1, 0, IMDBDef6.TBL_IMDB, IMDBDef6.FLD_IMDB_ANNO_MAND_SP, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 2, 0, IMDBDef6.TBL_IMDB, IMDBDef6.FLD_IMDB_NUMERO_ORD, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 3, 0, IMDBDef6.TBL_IMDB, IMDBDef6.FLD_IMDB_ANNO_ORD, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 4, 0, IMDBDef6.TBL_IMDB, IMDBDef6.FLD_IMDB_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 5, 0, IMDBDef6.TBL_IMDB, IMDBDef6.FLD_IMDB_NUMERO_LIQ, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 6, 0, IMDBDef6.TBL_IMDB, IMDBDef6.FLD_IMDB_ANNO_LIQ, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 7, 0, IMDBDef6.TBL_IMDB, IMDBDef6.FLD_IMDB_NOMOGGIMPIVA, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 8, 0, IMDBDef6.TBL_IMDB, IMDBDef6.FLD_IMDB_NOMOGGANNPRO, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 9, 0, IMDBDef6.TBL_IMDB, IMDBDef6.FLD_IMDB_NOMEOGGENUME, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_IMDB, 0);
      if (IMDB.Eof(IMDBDef6.TBL_IMDB, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_IMDB, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef1.TMP_RECORDSET);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,0,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,1,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,2,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,3,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,4,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,5,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,6,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,7,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,8,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,9,true);
    IMDB.TblStartSort(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[10];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[10];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0);
          AggrBuff[1] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0);
          AggrBuff[2] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 2, 0);
          AggrBuff[3] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 3, 0);
          AggrBuff[4] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 4, 0);
          AggrBuff[5] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 5, 0);
          AggrBuff[6] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 6, 0);
          AggrBuff[7] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 7, 0);
          AggrBuff[8] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 8, 0);
          AggrBuff[9] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 9, 0);
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          AggrNewGroup = AggrNewGroup || !AggrBuff[0].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[1].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[2].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 2, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[3].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 3, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[4].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 4, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[5].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 5, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[6].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 6, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[7].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 7, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[8].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 8, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[9].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 9, 0));
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef15.PQRY_ORD_RS, 0);
              IMDB.set_Value(IMDBDef15.PQRY_ORD_RS, 0, 0, AggrBuff[0]);
              IMDB.set_Value(IMDBDef15.PQRY_ORD_RS, 1, 0, AggrBuff[1]);
              IMDB.set_Value(IMDBDef15.PQRY_ORD_RS, 2, 0, AggrBuff[2]);
              IMDB.set_Value(IMDBDef15.PQRY_ORD_RS, 3, 0, AggrBuff[3]);
              IMDB.set_Value(IMDBDef15.PQRY_ORD_RS, 4, 0, AggrBuff[4]);
              IMDB.set_Value(IMDBDef15.PQRY_ORD_RS, 5, 0, AggrBuff[5]);
              IMDB.set_Value(IMDBDef15.PQRY_ORD_RS, 6, 0, AggrBuff[6]);
              IMDB.set_Value(IMDBDef15.PQRY_ORD_RS, 7, 0, AggrBuff[7]);
              IMDB.set_Value(IMDBDef15.PQRY_ORD_RS, 8, 0, AggrBuff[8]);
              IMDB.set_Value(IMDBDef15.PQRY_ORD_RS, 9, 0, AggrBuff[9]);
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
      IMDB.TblInitSort(IMDBDef15.PQRY_ORD_RS);
      IMDB.TblSortBy(IMDBDef15.PQRY_ORD_RS,1,true);
      IMDB.TblSortBy(IMDBDef15.PQRY_ORD_RS,0,true);
      IMDB.TblSortBy(IMDBDef15.PQRY_ORD_RS,3,true);
      IMDB.TblSortBy(IMDBDef15.PQRY_ORD_RS,2,true);
      IMDB.TblStartSort(IMDBDef15.PQRY_ORD_RS);
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_ORD_RS, 0);
  }

  // **********************************************************************
  // Par
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void VERIFIORDINA_PAR122() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PAR122_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR123, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR123, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PAR122_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PAR122_RS, 0, IMDBDef6.TBL_PAR123, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR122_RS, 0, 0, IMDBDef6.TBL_PAR123, IMDBDef6.FLD_PAR123_NOMEOGGEFUNZ, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR122_RS, 1, 0, IMDBDef6.TBL_PAR123, IMDBDef6.FLD_PAR123_NOMOGGDETLIQ, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR123, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR123, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR123, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PAR122_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cioè quando viene portata in primo piano
  // **********************************************************************
  public void Form_Activate()
  {
      MainFrm.Form_Activate(this);
    // Stub
  }

  // **********************************************************************
  // Deactivate
  // Evento notificato alla videata quando essa viene messa
  // in secondo piano
  // **********************************************************************
  public void Form_Deactivate(IDVariant Cancel)
  {
    // Stub
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    // Stub
  }

  // **********************************************************************
  // On Change Document
  // Evento notificato al form quando viene cambiato il
  // documento collegato
  // **********************************************************************
  public void OnChangeDocument(com.progamma.doc.IDDocument OldDocument)
  {
    // Stub
  }

  // **********************************************************************
  // On Send Message
  // Evento notificato quando una videata invia un messaggio
  // tramite la procedura SendMessage
  // **********************************************************************
  public void OnSendMessage(IDVariant Message, WebForm Sender, com.progamma.doc.IDDocument Doc, IDVariant Par1, IDVariant Par2, IDVariant Par3, IDVariant Par4)
  {
    // Stub
  }

  
  
  // **********************************************
  // Frame Events
  // **********************************************
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PAR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PAR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PAR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PAR);
    // Stub
  }

  private void PAN_PAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PAR_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PAR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PAR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ORDINAERRATI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDINAERRATI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDINAERRATI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDINAERRATI, Cancel);
    // Stub
  }

  private void PAN_ORDINAERRATI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDINAERRATI_INFOMANDATO)
    {
      this.IdxPanelActived = this.PAN_ORDINAERRATI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoMandato();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINAERRATI_DUALINFOLIQ)
    {
      this.IdxPanelActived = this.PAN_ORDINAERRATI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DUALInfoLiq();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINAERRATI_DUALINFOORDI)
    {
      this.IdxPanelActived = this.PAN_ORDINAERRATI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DUALInfoOrdinativo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINAERRATI_DUALAPRIORDI)
    {
      this.IdxPanelActived = this.PAN_ORDINAERRATI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriOrdinativo();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDINAERRATI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ORDINAERRATI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ORDINAERRATI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ORDINAERRATI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTEFUNZIONA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTEFUNZIONA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NOTEFUNZIONA);
    // Stub
  }

  private void PAN_NOTEFUNZIONA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NOTEFUNZIONA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTEFUNZIONA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTEFUNZIONA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDINAERRATI_Init()
  {

    PAN_ORDINAERRATI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDINAERRATI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ORDINAERRATI.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROMANDAT, "5554F423-8A64-4349-9D54-A859D885F03B");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROMANDAT, "Numero Mand.");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROMANDAT, "");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROMANDAT, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROMANDAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOMANDSP, "4F6C92C3-C37F-441E-BF8B-E95D4C511DE6");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOMANDSP, "Anno Mand.");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOMANDSP, "");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOMANDSP, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOMANDSP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_INFOMANDATO, "7033FF14-761B-4BC1-A0B4-99330AC88C6C");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_INFOMANDATO, " ");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_INFOMANDATO, "");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_INFOMANDATO, MyGlb.VIS_HYPELINKIMMA);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_INFOMANDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEMANDAT, "7945C474-18F2-47A2-9B5F-7455D3557EF1");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEMANDAT, "Mandato");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEMANDAT, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEMANDAT, 0, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, "7D86FD35-6C94-4FCE-AD35-82A588D7C298");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, "Numero Liq.");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, "");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, "7EA1BDDB-89AF-4AC6-9E5E-E681565D2FE5");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, "Anno Liq.");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, "");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, "C649D170-5E2A-403B-B5F9-0A3C0C498688");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, " ");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, "");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, MyGlb.VIS_HYPELINKIMMA);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, "88FD7B8B-717C-4A68-858E-9E055DCA790D");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, "Importo IVA");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, "");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, "62A72146-484D-4063-AF4E-48021BBB1313");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, "Documento");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, "");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, MyGlb.VIS_VISULOOUPCF4);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROORDINA, "1948723D-F9A6-47D8-A8EC-85DFFBC589E2");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROORDINA, "Num. Ord. SP");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROORDINA, "");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROORDINA, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROORDINA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOORD, "7FE07A91-74DC-4BDC-8398-15A0457FCC7C");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOORD, "Anno Ord. SP");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOORD, "");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOORDI, "CBD64EB4-C1C8-4F10-A912-89EDD7D6FA20");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOORDI, " ");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOORDI, "Info Ordinativo");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOORDI, MyGlb.VIS_HYPELINKIMMA);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOORDI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALAPRIORDI, "B7F481FA-7310-4DCC-A6C1-27963F1878F2");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALAPRIORDI, "DUAL Apri Ordinativo");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALAPRIORDI, "");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALAPRIORDI, MyGlb.VIS_HYPELINKIMMA);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALAPRIORDI, 0 | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEORDINA, "E322B8DE-5474-4BEE-A728-59B6879162E0");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEORDINA, "Ordinativo");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEORDINA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEORDINA, 0, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ORDIMPORTO, "19EE9410-E04B-43F6-8F45-B109053CFD6A");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ORDIMPORTO, "Importo");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ORDIMPORTO, "");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ORDIMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ORDIMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOPROG, "4FDDE07A-F170-46B9-A1F5-EE64C664377B");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOPROG, "Anno Prog");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOPROG, "");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOPROG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINAERRATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROPROG, "84D2D6B7-0D62-4F2E-826C-CFDCF16658FA");
    PAN_ORDINAERRATI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROPROG, "Numeroprog");
    PAN_ORDINAERRATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROPROG, "");
    PAN_ORDINAERRATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINAERRATI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROPROG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ORDINAERRATI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROMANDAT, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROMANDAT, MyGlb.PANEL_LIST, 104);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROMANDAT, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROMANDAT, MyGlb.PANEL_LIST, "Numero Mand.");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROMANDAT, MyGlb.PANEL_FORM, 4, 4, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROMANDAT, MyGlb.PANEL_FORM, 104);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROMANDAT, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROMANDAT, MyGlb.PANEL_FORM, "Numero Mand.");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_NUMEROMANDAT, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_NUMEROMANDAT, PPQRY_ORD, "A.NUMERO_MAND_SP", "RECONUMEMAND", 1, 5, 0, -13997);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOMANDSP, MyGlb.PANEL_LIST, 56, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOMANDSP, MyGlb.PANEL_LIST, 92);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOMANDSP, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOMANDSP, MyGlb.PANEL_LIST, "Anno Mand.");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOMANDSP, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOMANDSP, MyGlb.PANEL_FORM, 92);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOMANDSP, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOMANDSP, MyGlb.PANEL_FORM, "Anno Mand.");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_ANNOMANDSP, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_ANNOMANDSP, PPQRY_ORD, "A.ANNO_MAND_SP", "RENOOGANMASP", 1, 4, 0, -13997);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_INFOMANDATO, MyGlb.PANEL_LIST, 112, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_INFOMANDATO, MyGlb.PANEL_LIST, 120);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_INFOMANDATO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_INFOMANDATO, MyGlb.PANEL_LIST, " ");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_INFOMANDATO, MyGlb.PANEL_FORM, 4, 52, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_INFOMANDATO, MyGlb.PANEL_FORM, 120);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_INFOMANDATO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_INFOMANDATO, MyGlb.PANEL_FORM, " ");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_INFOMANDATO, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_INFOMANDATO, PPQRY_DUAL, "'I'", "INFOMANDATO", 5, 1, 0, -13997);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_INFOMANDATO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEMANDAT, MyGlb.PANEL_LIST, 0, 0, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEMANDAT, MyGlb.PANEL_LIST, 0);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEMANDAT, MyGlb.PANEL_LIST, 2);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEMANDAT, MyGlb.PANEL_FORM, 4, 348, 176, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEMANDAT, MyGlb.PANEL_FORM, 0);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEMANDAT, MyGlb.PANEL_FORM, 2);
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_ETICHEMANDAT, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_ETICHEMANDAT, -1, "", "ETICHEMANDAT", 0, 0, 0, -13997);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, MyGlb.PANEL_LIST, 132, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, MyGlb.PANEL_LIST, 80);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, MyGlb.PANEL_LIST, "Numero Liq.");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, MyGlb.PANEL_FORM, 4, 244, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, MyGlb.PANEL_FORM, 80);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROLIQUID, MyGlb.PANEL_FORM, "Numero Liq.");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_NUMEROLIQUID, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_NUMEROLIQUID, PPQRY_ORD, "A.NUMERO_LIQ", "RECONUMELIQU", 1, 5, 0, -13997);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, MyGlb.PANEL_LIST, 188, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, MyGlb.PANEL_LIST, 60);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, MyGlb.PANEL_LIST, "Anno Liq.");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, MyGlb.PANEL_FORM, 4, 268, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, MyGlb.PANEL_FORM, 60);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOLIQUIDAZ, MyGlb.PANEL_FORM, "Anno Liq.");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_ANNOLIQUIDAZ, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_ANNOLIQUIDAZ, PPQRY_ORD, "A.ANNO_LIQ", "RECOANNOLIQU", 1, 4, 0, -13997);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, MyGlb.PANEL_LIST, 244, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, MyGlb.PANEL_LIST, 84);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, MyGlb.PANEL_LIST, " ");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, MyGlb.PANEL_FORM, 4, 352, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, MyGlb.PANEL_FORM, 84);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOLIQ, MyGlb.PANEL_FORM, " ");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_DUALINFOLIQ, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_DUALINFOLIQ, PPQRY_DUAL, "'I'", "INFOLIQ", 5, 1, 0, -13997);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOLIQ, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, MyGlb.PANEL_LIST, 264, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, MyGlb.PANEL_LIST, 80);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, MyGlb.PANEL_LIST, "Importo IVA");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, MyGlb.PANEL_FORM, 4, 292, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, MyGlb.PANEL_FORM, 80);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_IMPORTOIVA, MyGlb.PANEL_FORM, "Importo IVA");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_IMPORTOIVA, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_IMPORTOIVA, PPQRY_ORD, "A.NOMOGGIMPIVA", "RECNOMOGIMIV", 3, 14, 2, -13997);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, MyGlb.PANEL_LIST, 368, 36, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, MyGlb.PANEL_LIST, 100);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, MyGlb.PANEL_LIST, "Documento");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, MyGlb.PANEL_FORM, 4, 316, 420, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, MyGlb.PANEL_FORM, 100);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, MyGlb.PANEL_FORM, 2);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_FATDOCUMENTO, MyGlb.PANEL_FORM, "Documento");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_FATDOCUMENTO, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_FATDOCUMENTO, PPQRY_FAT, "A.NUMERO_DOC || ' del ' || TO_CHAR ( A.D_DATA_DOC,'dd/mm/yyyy')", "FATDOCUMENTO", 5, 124, 0, -13997);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROORDINA, MyGlb.PANEL_LIST, 544, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROORDINA, MyGlb.PANEL_LIST, 84);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROORDINA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROORDINA, MyGlb.PANEL_LIST, "Num. Ord. SP");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROORDINA, MyGlb.PANEL_FORM, 4, 100, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROORDINA, MyGlb.PANEL_FORM, 84);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROORDINA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROORDINA, MyGlb.PANEL_FORM, "Num. Ord. SP");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_NUMEROORDINA, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_NUMEROORDINA, PPQRY_ORD, "A.NUMERO_ORD", "RECONUMEORDI", 1, 5, 0, -13997);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOORD, MyGlb.PANEL_LIST, 600, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOORD, MyGlb.PANEL_LIST, 68);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOORD, MyGlb.PANEL_LIST, "Anno Ord. SP");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOORD, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOORD, MyGlb.PANEL_FORM, 68);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOORD, MyGlb.PANEL_FORM, "Ann. Or. SP");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_ANNOORD, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_ANNOORD, PPQRY_ORD, "A.ANNO_ORD", "RECANNNOMOGG", 1, 4, 0, -13997);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOORDI, MyGlb.PANEL_LIST, 656, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOORDI, MyGlb.PANEL_LIST, 128);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOORDI, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOORDI, MyGlb.PANEL_LIST, " ");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOORDI, MyGlb.PANEL_FORM, 4, 196, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOORDI, MyGlb.PANEL_FORM, 128);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOORDI, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALINFOORDI, MyGlb.PANEL_FORM, " ");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_DUALINFOORDI, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_DUALINFOORDI, PPQRY_DUAL, "'I'", "INFOORDINATI", 5, 1, 0, -13997);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALINFOORDI, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALAPRIORDI, MyGlb.PANEL_LIST, 224, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALAPRIORDI, MyGlb.PANEL_LIST, 128);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALAPRIORDI, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALAPRIORDI, MyGlb.PANEL_LIST, "D. A. O.");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALAPRIORDI, MyGlb.PANEL_FORM, 4, 220, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALAPRIORDI, MyGlb.PANEL_FORM, 128);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALAPRIORDI, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_DUALAPRIORDI, MyGlb.PANEL_FORM, "DUAL Apri Ordinativo");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_DUALAPRIORDI, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_DUALAPRIORDI, PPQRY_DUAL, "'A'", "APRIORDINATI", 5, 1, 0, -13997);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ORDINAERRATI.SetValueListItem(PFL_ORDINAERRATI_DUALAPRIORDI, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEORDINA, MyGlb.PANEL_LIST, 152, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEORDINA, MyGlb.PANEL_LIST, 0);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEORDINA, MyGlb.PANEL_LIST, 2);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEORDINA, MyGlb.PANEL_FORM, 12, 356, 176, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEORDINA, MyGlb.PANEL_FORM, 0);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ETICHEORDINA, MyGlb.PANEL_FORM, 2);
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_ETICHEORDINA, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_ETICHEORDINA, -1, "", "ETICHEORDINA", 0, 0, 0, -13997);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ORDIMPORTO, MyGlb.PANEL_LIST, 676, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ORDIMPORTO, MyGlb.PANEL_LIST, 88);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ORDIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ORDIMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ORDIMPORTO, MyGlb.PANEL_FORM, 4, 220, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ORDIMPORTO, MyGlb.PANEL_FORM, 88);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ORDIMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ORDIMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_ORDIMPORTO, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_ORDIMPORTO, PPQRY_ORD, "A.IMPORTO", "RECNOMOGGIMP", 3, 14, 2, -13997);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOPROG, MyGlb.PANEL_LIST, 636, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOPROG, MyGlb.PANEL_LIST, 68);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOPROG, MyGlb.PANEL_LIST, "Anno Prog");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOPROG, MyGlb.PANEL_FORM, 4, 316, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOPROG, MyGlb.PANEL_FORM, 68);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_ANNOPROG, MyGlb.PANEL_FORM, "Anno Prog");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_ANNOPROG, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_ANNOPROG, PPQRY_ORD, "A.NOMOGGANNPRO", "RECNOMOGANPR", 1, 4, 0, -13997);
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROPROG, MyGlb.PANEL_LIST, 636, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROPROG, MyGlb.PANEL_LIST, 80);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROPROG, MyGlb.PANEL_LIST, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROPROG, MyGlb.PANEL_LIST, "Numeroprog");
    PAN_ORDINAERRATI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROPROG, MyGlb.PANEL_FORM, 4, 340, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINAERRATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROPROG, MyGlb.PANEL_FORM, 80);
    PAN_ORDINAERRATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROPROG, MyGlb.PANEL_FORM, 1);
    PAN_ORDINAERRATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINAERRATI_NUMEROPROG, MyGlb.PANEL_FORM, "Numeroprog");
    PAN_ORDINAERRATI.SetFieldPage(PFL_ORDINAERRATI_NUMEROPROG, -1, -1);
    PAN_ORDINAERRATI.SetFieldPanel(PFL_ORDINAERRATI_NUMEROPROG, PPQRY_ORD, "A.NOMEOGGENUME", "RECNOMOGGNUM", 1, 5, 0, -13997);
  }

  private void PAN_ORDINAERRATI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDINAERRATI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOMANDATO, ");
    SQL.append("  'A' as APRIMANDATO, ");
    SQL.append("  'I' as INFOORDINATI, ");
    SQL.append("  'A' as APRIORDINATI, ");
    SQL.append("  'I' as INFOLIQ ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~RECONUMEMAND~~ IS NULL))) ");
    PAN_ORDINAERRATI.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_ORDINAERRATI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINAERRATI.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_DOC || ' del ' || TO_CHAR ( A.D_DATA_DOC,'dd/mm/yyyy') as FATDOCUMENTO ");
    SQL.append("from ");
    SQL.append("  FAT A ");
    SQL.append("where (A.ANNO_PROG = ~~RECNOMOGANPR~~) ");
    SQL.append("and   (A.NUMERO_PROG = ~~RECNOMOGGNUM~~) ");
    PAN_ORDINAERRATI.SetQuery(PPQRY_FAT, 0, SQL, -1, "");
    PAN_ORDINAERRATI.SetQueryDB(PPQRY_FAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINAERRATI.SetMasterTable(PPQRY_FAT, "FAT");
    PAN_ORDINAERRATI.SetIMDB(IMDB, "PQRY_ORD", true);
    PAN_ORDINAERRATI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_ORDINAERRATI.SetQueryIMDB(PPQRY_ORD, IMDBDef15.PQRY_ORD_RS, IMDBDef6.TBL_IMDB);
    JustLoaded = true;
    PAN_ORDINAERRATI.SetFieldPrimaryIndex(PFL_ORDINAERRATI_NUMEROMANDAT, IMDBDef6.FLD_IMDB_NUMERO_MAND_SP);
    PAN_ORDINAERRATI.SetFieldPrimaryIndex(PFL_ORDINAERRATI_ANNOMANDSP, IMDBDef6.FLD_IMDB_ANNO_MAND_SP);
    PAN_ORDINAERRATI.SetFieldPrimaryIndex(PFL_ORDINAERRATI_NUMEROLIQUID, IMDBDef6.FLD_IMDB_NUMERO_LIQ);
    PAN_ORDINAERRATI.SetFieldPrimaryIndex(PFL_ORDINAERRATI_ANNOLIQUIDAZ, IMDBDef6.FLD_IMDB_ANNO_LIQ);
    PAN_ORDINAERRATI.SetFieldPrimaryIndex(PFL_ORDINAERRATI_IMPORTOIVA, IMDBDef6.FLD_IMDB_NOMOGGIMPIVA);
    PAN_ORDINAERRATI.SetFieldPrimaryIndex(PFL_ORDINAERRATI_NUMEROORDINA, IMDBDef6.FLD_IMDB_NUMERO_ORD);
    PAN_ORDINAERRATI.SetFieldPrimaryIndex(PFL_ORDINAERRATI_ANNOORD, IMDBDef6.FLD_IMDB_ANNO_ORD);
    PAN_ORDINAERRATI.SetFieldPrimaryIndex(PFL_ORDINAERRATI_ORDIMPORTO, IMDBDef6.FLD_IMDB_IMPORTO);
    PAN_ORDINAERRATI.SetFieldPrimaryIndex(PFL_ORDINAERRATI_ANNOPROG, IMDBDef6.FLD_IMDB_NOMOGGANNPRO);
    PAN_ORDINAERRATI.SetFieldPrimaryIndex(PFL_ORDINAERRATI_NUMEROPROG, IMDBDef6.FLD_IMDB_NOMEOGGENUME);
    PAN_ORDINAERRATI.SetMasterTable(0, "IMDB");
    PAN_ORDINAERRATI.AddToSortList(PFL_ORDINAERRATI_ANNOMANDSP, true);
    PAN_ORDINAERRATI.AddToSortList(PFL_ORDINAERRATI_NUMEROMANDAT, true);
    PAN_ORDINAERRATI.AddToSortList(PFL_ORDINAERRATI_ANNOORD, true);
    PAN_ORDINAERRATI.AddToSortList(PFL_ORDINAERRATI_NUMEROORDINA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDINAERRATI.Status() == 2)
    {
      int oldListQBE = PAN_ORDINAERRATI.iUseListQBE;
      PAN_ORDINAERRATI.iUseListQBE = 0;
      PAN_ORDINAERRATI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDINAERRATI.PanelCommand(Glb.PCM_FIND);
      PAN_ORDINAERRATI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_NOTEFUNZIONA_Init()
  {

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "561BC44E-9443-4D62-B068-70B86977796F");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "MODULO");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "DCDA8B3B-1AB8-4043-A59B-FE301F3753CC");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "PAGINA");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE1, "E0BFA3D4-B21D-4441-9010-D51F5A699F54");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE1, "FUNZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE1, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "B568BA61-5B97-41A6-BC85-C0F890B6D7E5");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.VIS_HTMEDISTNOSF);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NOTEFUNZIONA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 56);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, "MODULO");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, "MODULO");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_MODULO, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_MODULO, PPQRY_NOTEFUNZIO10, "A.MODULO", "MODULO", 5, 20, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 4, 164, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, "PAGINA");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 4, 28, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, "PAGINA");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_PAGINA, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_PAGINA, PPQRY_NOTEFUNZIO10, "A.PAGINA", "PAGINA", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE1, MyGlb.PANEL_LIST, 4, 200, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE1, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE1, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE1, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE1, MyGlb.PANEL_FORM, 4, 52, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE1, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE1, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_FUNZIONE1, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_FUNZIONE1, PPQRY_NOTEFUNZIO10, "A.FUNZIONE", "FUNZIONE", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 104, 236, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 32, 196, 244, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 18);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_DESCRIZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_DESCRIZIONE, PPQRY_NOTEFUNZIO10, "A.DESCRIZIONE", "DESCRIZIONE", 9, 9999, 0, -13997);
  }

  private void PAN_NOTEFUNZIONA_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTEFUNZIONA.SetIMDB(IMDB, "PQRY_NOTEFUNZIO10", true);
    PAN_NOTEFUNZIONA.set_SetString(MyGlb.MASTER_ROWNAME, "NOTE FUNZIONALITA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MODULO as MODULO, ");
    SQL.append("  A.PAGINA as PAGINA, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO10, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO10, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (A.PAGINA = " + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_VERIFIORDINA,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.FUNZIONE = ~~TBL_PAR123.NOMEOGGEFUNZ~~) ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO10, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO10, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO10, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO10, 5, SQL, -1, "");
    PAN_NOTEFUNZIONA.SetQueryDB(PPQRY_NOTEFUNZIO10, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NOTEFUNZIONA.SetMasterTable(0, "NOTE_FUNZIONALITA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTEFUNZIONA.Status() == 2)
    {
      int oldListQBE = PAN_NOTEFUNZIONA.iUseListQBE;
      PAN_NOTEFUNZIONA.iUseListQBE = 0;
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_FIND);
      PAN_NOTEFUNZIONA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PAR_Init()
  {

    PAN_PAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_FUNZIONE, "3FB231BB-AD49-48D3-91CE-D3DE2F519052");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_FUNZIONE, "Funzione");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_FUNZIONE, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_FUNZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_FUNZIONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLIQUID, "F812923E-F1DC-4822-8EFB-923E62A6C208");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLIQUID, "Dettaglio Liquidazioni");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLIQUID, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLIQUID, MyGlb.VIS_CHECKSTYLE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLIQUID, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_FUNZIONE, MyGlb.PANEL_LIST, 0, 36, 408, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_FUNZIONE, MyGlb.PANEL_LIST, 60);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_FUNZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_FUNZIONE, MyGlb.PANEL_LIST, "Funzione");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_FUNZIONE, MyGlb.PANEL_FORM, 4, 4, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_FUNZIONE, MyGlb.PANEL_FORM, 128);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_FUNZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_FUNZIONE, MyGlb.PANEL_FORM, "Funzione");
    PAN_PAR.SetFieldPage(PFL_PAR_FUNZIONE, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_FUNZIONE, PPQRY_PAR122, "A.NOMEOGGEFUNZ", "NOMEOGGEFUNZ", 5, 50, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLIQUID, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLIQUID, MyGlb.PANEL_LIST, 132);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLIQUID, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLIQUID, MyGlb.PANEL_LIST, "Dett. Liq.");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLIQUID, MyGlb.PANEL_FORM, 8, 8, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLIQUID, MyGlb.PANEL_FORM, 132);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLIQUID, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DETTAGLIQUID, MyGlb.PANEL_FORM, "Dettaglio Liquidazioni");
    PAN_PAR.SetFieldPage(PFL_PAR_DETTAGLIQUID, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_DETTAGLIQUID, PPQRY_PAR122, "A.NOMOGGDETLIQ", "NOMOGGDETLIQ", 5, 2, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_DETTAGLIQUID, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_DETTAGLIQUID, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PAR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PAR.SetIMDB(IMDB, "PQRY_PAR122", true);
    PAN_PAR.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PAR.SetQueryIMDB(PPQRY_PAR122, IMDBDef15.PQRY_PAR122_RS, IMDBDef6.TBL_PAR123);
    JustLoaded = true;
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_FUNZIONE, IMDBDef6.FLD_PAR123_NOMEOGGEFUNZ);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_DETTAGLIQUID, IMDBDef6.FLD_PAR123_NOMOGGDETLIQ);
    PAN_PAR.SetMasterTable(0, "PAR123");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PAR.Status() == 2)
    {
      int oldListQBE = PAN_PAR.iUseListQBE;
      PAN_PAR.iUseListQBE = 0;
      PAN_PAR.PanelCommand(Glb.PCM_SEARCH);
      PAN_PAR.PanelCommand(Glb.PCM_FIND);
      PAN_PAR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDINAERRATI) PAN_ORDINAERRATI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINAERRATI) PAN_ORDINAERRATI_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateRow(Cancel);
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDINAERRATI) PAN_ORDINAERRATI_DynamicProperties();
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_DynamicProperties();
    if (SrcObj == PAN_PAR) PAN_PAR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINAERRATI) PAN_ORDINAERRATI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PAR) PAN_PAR_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
  }

  public void OnSelectingRow(IDPanel SrcObj)
  {
  }

  public void OnSorting(IDPanel SrcObj, IDVariant FldIdx, IDVariant Cancel)
  {
  }

  public void OnChangeSelection(IDPanel SrcObj, IDVariant NewVal, IDVariant Final, IDVariant Cancel)
  {
  }
  
  public void OnChangeLocking(IDPanel SrcObj, IDVariant NewLocking, IDVariant Cancel)
  {
  }
  
  public void OnChangeStatus(IDPanel SrcObj, IDVariant OldStatus)
  {
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
  }

  public void BeforeBlobUpdate(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant FilePath)
  {
  }
  
  public void BeforeDelete(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterInsert(IDPanel SrcObj)
  {
  }
  
  public void AfterUpdate(IDPanel SrcObj)
  {
  }

  public void AfterBlobUpdate(IDPanel SrcObj, IDVariant Column, IDVariant Size, IDVariant Extension)
  {
  }
  
  public void AfterDelete(IDPanel SrcObj)
  {
  }    

  public void AfterFind(IDPanel SrcObj, IDVariant CmdFind)
  {
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_ORDINAERRATI) PAN_ORDINAERRATI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PAR) PAN_PAR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
  }    

  public void NodeClick(ATree SrcObj, ATreeNode Node)
  {
  }    

  public void OnTreeDropNode(ATree SrcObj, IDVariant SourceHash, IDVariant SourceTreeIndex, IDVariant DestinationHash, IDVariant ShiftKey, IDVariant AltKey, IDVariant ControlKey)
  {
  }    

  public void OnTreeExpandNode(ATree SrcObj, IDVariant HashKey, IDVariant Cancel)
  {
  }
  
  public void OnTreeActivateNode(ATree SrcObj, IDVariant HashKey, IDVariant Cancel)
  {
  }

  public void OnTreeChangeSelNode(ATree SrcObj, IDVariant HashKey, IDVariant Selected, IDVariant Cancel, IDVariant Final)
  {
  }
  
  public void OnTreeDropDoc(ATree SrcObj, IDDocument SourceDoc, IDDocument DestDoc, IDVariant ShiftKey, IDVariant AltKey, IDVariant ControlKey, IDVariant Cancel)
  {
  }    

  public void OnTreeExpandDoc(ATree SrcObj, IDDocument Doc, IDVariant Cancel)
  {
  }
  
  public void OnTreeActivateDoc(ATree SrcObj, IDDocument Doc, IDVariant Cancel)
  {
  }
  
  public void OnTreeChangeSelDoc(ATree SrcObj, IDDocument Doc, IDVariant Selected, IDVariant Cancel, IDVariant Final)
  {
  }
  
  public void OnFormattingSection(OBook SrcObj, int SectionID)
  {
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
  }

  public void OnPreview(OBook SrcObj)
  {
  }
  
  public void OnOpenPopup(ACommand SrcObj, IDVariant Direction, IDVariant Cancel) 
  {
  }
  
  public void OnCmdSetCommand(ACommand SrcObj, IDVariant CmdIdx, IDVariant ChildIdx, IDVariant Cancel) 
  {
  }
  
  public void OnCmdSetGeneralDrag(ACommand SrcObj, IDVariant DragInfo, IDVariant CmdIdx, IDVariant ChildIdx)
  {
  }
  
  public void OnCmdSetGeneralDrop(ACommand SrcObj, IDVariant DragInfo, IDVariant CmdIdx, IDVariant ChildIdx)
  {
  }

  public void OnChangeCollapse(WebFrame SrcObj, IDVariant Collapse, IDVariant Cancel)
  {
  }

  public void OnGraphClick(WebFrame SrcObj, IDVariant NumSerie, IDVariant NumPoint)
  {
  }

  public void OnGraphOptions(WebFrame SrcObj, IDVariant Options)
  {
  }
  
  public void OnRenderToolbar(WebFrame SrcObj, IDVariant CmdIdx, IDVariant Visible)
  {
  }

  public void OnBookCommand(OBook SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
  }

  public void OnCmdSetChangeExpand(ACommand SrcObj, IDVariant Expand, IDVariant Cancel)
  {
  }

  public void OnTreeChangeExpandNode(ATree SrcObj, IDVariant HashKey, IDVariant Expanded, IDVariant Cancel)
  {
  }

  public void OnTreeChangeExpandDoc(ATree SrcObj, IDDocument Doc, IDVariant Expanded, IDVariant Cancel)
  {
  }
  

  public void OnMouseClick(IDPanel SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant c, IDVariant r, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(IDPanel SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant c, IDVariant r, IDVariant cancel)
  {
  }
  
  public void OnMouseClick(OBook SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant boxid, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(OBook SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant boxid, IDVariant cancel)
  {
  }
  
  public void OnMouseClick(ATree SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant nodehash, IDDocument doc, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(ATree SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant nodehash, IDDocument doc, IDVariant cancel)
  {
  }
  
  public void OnMouseClick(AGraph SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant numserie, IDVariant recordselected, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(AGraph SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant numserie, IDVariant recordselected, IDVariant cancel)
  {
  }
  
  public void OnMouseClick(OTabView SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant tabid, IDVariant cancel)
  {
  }

  public void OnMouseDoubleClick(OTabView SrcObj, IDVariant btn, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant tabid, IDVariant cancel)
  {
  }  
  
  public void OnReorderColum(IDPanel SrcObj, IDVariant sourcefield, IDVariant targetfield)
  {
  }
  
  public void OnResizeColum(IDPanel SrcObj, IDVariant sourcefield, IDVariant oldwidth)
  {
  }
  

  public void OnGenericDrag(IDPanel SrcObj, IDVariant draginfo,  IDVariant button, IDVariant colidx)
  {
  }

  public void OnGenericDrop(IDPanel SrcObj, IDVariant draginfo, IDVariant cancel, IDVariant button, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant colidx, IDVariant rownum, IDDocument doc)
  {
  }
  
  public void OnGenericDrag(ATree SrcObj, IDVariant draginfo,  IDVariant button, IDVariant hashkey)
  {
  }

  public void OnGenericDrop(ATree SrcObj, IDVariant draginfo, IDVariant cancel, IDVariant button, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant hashkey, IDDocument doc)
  {
  }  
  
  public void OnGenericDrag(OBook SrcObj, IDVariant draginfo,  IDVariant button, IDVariant boxid)
  {
  }

  public void OnGenericDrop(OBook SrcObj, IDVariant draginfo, IDVariant cancel, IDVariant button, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant boxid)
  {
  }    
  
  public void OnGenericDrag(OTabView SrcObj, IDVariant draginfo, IDVariant button, IDVariant pageindex)
  {
  }

  public void OnGenericDrop(OTabView SrcObj, IDVariant draginfo, IDVariant cancel, IDVariant button, IDVariant x, IDVariant y, IDVariant xb, IDVariant yb, IDVariant pageindex)
  {
  }

  public void OnExpandingGroup(IDPanel SrcObj, IDVariant expanded, IDVariant userOperation)
  {
  }  

  public void OnChangeGroupCollapse(IDPanel SrcObj, IDVariant GrpIndex)
  {
  }
  
  public void OnShowMultipleSelection(IDPanel SrcObj, IDVariant NewValue, IDVariant Cancel, IDVariant UserOperation)
  {
  }
  
  public void OnChangeTextSelection(IDPanel SrcObj, IDVariant Field, IDVariant OldSelectionStart, IDVariant OldSelectionEnd)
  {
  }
  
  public void OnFocus(IDPanel SrcObj, IDVariant Field, IDVariant GotFocus)
  {
  }
  
  public void OnFrameKeyPress(WebFrame SrcObj, IDVariant KeySet, IDVariant KeyCode, IDVariant Skip)
  {
  }
  
  public void OnGetLKE(IDPanel SrcObj, IDCachedRowSet RS, IDVariant ntry, IDVariant nullv, IDVariant bskip, IDVariant bcancel, IDVariant fldindex)
  {
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
