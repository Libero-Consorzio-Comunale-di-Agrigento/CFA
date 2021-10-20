// **********************************************
// Aggiornamento Tipo Variazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornamentoTipoVariazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_DESCBOZZA_ONE = 0;
  private static int PFL_DESCBOZZA_NEWPANELLABE = 1;

  private static int PPQRY_DUAL39 = 0;


  IDPanel PAN_DESCBOZZA;
  private static int PFL_NEWPANEL_CODICE = 0;

  private static int PPQRY_DUAL7 = 0;


  IDPanel PAN_NEWPANEL;
  private static int PFL_TIPIVARIAZIO_CODICE1 = 0;
  private static int PFL_TIPIVARIAZIO_DESCRIZIONE1 = 1;

  private static int PPQRY_ELENTIPIVAR1 = 0;


  IDPanel PAN_TIPIVARIAZIO;
  private static int PFL_PARS_SOLSENTIPVAR = 0;
  private static int PFL_PARS_SOLOAPPROVAT = 1;

  private static int PPQRY_PARS4 = 0;


  IDPanel PAN_PARS;
  private static int PFL_DETTDELLBOZZ_STATO1 = 0;
  private static int PFL_DETTDELLBOZZ_STATO = 1;
  private static int PFL_DETTDELLBOZZ_ES = 2;
  private static int PFL_DETTDELLBOZZ_CAPITOLO = 3;
  private static int PFL_DETTDELLBOZZ_ARTICOLO = 4;
  private static int PFL_DETTDELLBOZZ_NUOVA = 5;
  private static int PFL_DETTDELLBOZZ_DESCRIZIONE = 6;
  private static int PFL_DETTDELLBOZZ_TIPOVAR = 7;
  private static int PFL_DETTDELLBOZZ_VOCEPEGBIG = 8;
  private static int PFL_DETTDELLBOZZ_CAPITOLOART = 9;
  private static int PFL_DETTDELLBOZZ_ASSOTIPOVARI = 10;

  private static int PPQRY_POLPROVARDE7 = 0;

  private static int PPQRY_T54 = 1;


  IDPanel PAN_DETTDELLBOZZ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IN5(IMDB);
    Init_TBL_PARS7(IMDB);
    //
    //
    Init_PQRY_DUAL39(IMDB);
    Init_PQRY_ELENTIPIVAR1(IMDB);
    Init_PQRY_PARS4(IMDB);
    Init_PQRY_PARS4_RS(IMDB);
    Init_PQRY_POLPROVARDE7(IMDB);
    Init_PQRY_DUAL7(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IN5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_IN5, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_IN5, "TBL_IN5");
    IMDB.set_FldCode(IMDBDef4.TBL_IN5,IMDBDef4.FLD_IN5_ROWNAMBOVAID, "ROWNAMBOVAID");
    IMDB.SetFldParams(IMDBDef4.TBL_IN5,IMDBDef4.FLD_IN5_ROWNAMBOVAID,1,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_IN5, 0);
  }

  private static void Init_TBL_PARS7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS7, 2);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS7, "TBL_PARS7");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS7,IMDBDef4.FLD_PARS7_RONASOSETIVA, "RONASOSETIVA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS7,IMDBDef4.FLD_PARS7_RONASOSETIVA,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS7,IMDBDef4.FLD_PARS7_ROWNAMSOLAPP, "ROWNAMSOLAPP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS7,IMDBDef4.FLD_PARS7_ROWNAMSOLAPP,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS7, 0);
  }

  private static void Init_PQRY_DUAL39(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_DUAL39, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_DUAL39, "PQRY_DUAL39");
    IMDB.set_FldCode(IMDBDef12.PQRY_DUAL39,IMDBDef12.PQSL_DUAL39_RECORDONE, "RECORDONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_DUAL39,IMDBDef12.PQSL_DUAL39_RECORDONE,1,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_DUAL39, 0);
  }

  private static void Init_PQRY_ELENTIPIVAR1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_ELENTIPIVAR1, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_ELENTIPIVAR1, "PQRY_ELENTIPIVAR1");
    IMDB.set_FldCode(IMDBDef12.PQRY_ELENTIPIVAR1,IMDBDef12.PQSL_ELENTIPIVAR1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef12.PQRY_ELENTIPIVAR1,IMDBDef12.PQSL_ELENTIPIVAR1_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_ELENTIPIVAR1,IMDBDef12.PQSL_ELENTIPIVAR1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_ELENTIPIVAR1,IMDBDef12.PQSL_ELENTIPIVAR1_DESCRIZIONE,5,40,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_ELENTIPIVAR1, 0);
  }

  private static void Init_PQRY_PARS4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS4, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS4, "PQRY_PARS4");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS4,IMDBDef12.PQSL_PARS4_RONASOSETIVA, "RONASOSETIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS4,IMDBDef12.PQSL_PARS4_RONASOSETIVA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS4,IMDBDef12.PQSL_PARS4_ROWNAMSOLAPP, "ROWNAMSOLAPP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS4,IMDBDef12.PQSL_PARS4_ROWNAMSOLAPP,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARS4, 0);
  }

  private static void Init_PQRY_PARS4_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS4_RS, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS4_RS, "PQRY_PARS4_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS4_RS,IMDBDef12.PQSL_PARS4_RONASOSETIVA, "RONASOSETIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS4_RS,IMDBDef12.PQSL_PARS4_RONASOSETIVA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS4_RS,IMDBDef12.PQSL_PARS4_ROWNAMSOLAPP, "ROWNAMSOLAPP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS4_RS,IMDBDef12.PQSL_PARS4_ROWNAMSOLAPP,5,2,0);
  }

  private static void Init_PQRY_POLPROVARDE7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLPROVARDE7, 10);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLPROVARDE7, "PQRY_POLPROVARDE7");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_STATO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_PROPOSTA_VAR_DETT_ID, "PROPOSTA_VAR_DETT_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_PROPOSTA_VAR_DETT_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_COD_REC, "COD_REC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_COD_REC,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_RECORDSTATO, "RECORDSTATO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_RECORDSTATO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_ISTITUZIONE_NC, "ISTITUZIONE_NC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_ISTITUZIONE_NC,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE7,IMDBDef12.PQSL_POLPROVARDE7_RECORDDESCRI,5,99,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLPROVARDE7, 0);
  }

  private static void Init_PQRY_DUAL7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_DUAL7, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_DUAL7, "PQRY_DUAL7");
    IMDB.set_FldCode(IMDBDef12.PQRY_DUAL7,IMDBDef12.PQSL_DUAL7_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef12.PQRY_DUAL7,IMDBDef12.PQSL_DUAL7_CODICE,1,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_DUAL7, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornamentoTipoVariazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornamentoTipoVariazione()
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
    FormIdx = MyGlb.FRM_AGGITIPOVARI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4C88ACA7-3A9F-4989-9E3B-D7F2095CFFCA";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 852;
    DesignHeight = 538;
    set_Caption(new IDVariant("Aggiornamento Tipo Variazione"));
    //
    Frames = new AFrame[10];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 852;
    Frames[1].Height = 512;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.132813;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 852;
    Frames[2].Height = 68;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Desc Bozza";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 68;
    PAN_DESCBOZZA = new IDPanel(w, this, 2, "PAN_DESCBOZZA");
    Frames[2].Content = PAN_DESCBOZZA;
    PAN_DESCBOZZA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DESCBOZZA.VS = MainFrm.VisualStyleList;
    PAN_DESCBOZZA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 852-MyGlb.PAN_OFFS_X, 68-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DESCBOZZA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "594DD165-E935-40F2-9AB9-FCA65CB1AB52");
    PAN_DESCBOZZA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 40, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DESCBOZZA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DESCBOZZA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DESCBOZZA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DESCBOZZA.InitStatus = 2;
    PAN_DESCBOZZA_Init();
    PAN_DESCBOZZA_InitFields();
    PAN_DESCBOZZA_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 852;
    Frames[3].Height = 444;
    Frames[3].FormFactor = 0.469484;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 400;
    Frames[4].Height = 444;
    Frames[4].Vertical = true;
    Frames[4].FormFactor = 0.207207;
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[4].ChildFrame1 = Frames[5];
    Frames[5].Width = 400;
    Frames[5].Height = 92;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "New Panel";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 92;
    PAN_NEWPANEL = new IDPanel(w, this, 5, "PAN_NEWPANEL");
    Frames[5].Content = PAN_NEWPANEL;
    PAN_NEWPANEL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NEWPANEL.VS = MainFrm.VisualStyleList;
    PAN_NEWPANEL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 400-MyGlb.PAN_OFFS_X, 92-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NEWPANEL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "866FCFE0-5644-4345-B718-0B04DCEA78A8");
    PAN_NEWPANEL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 48, 64, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWPANEL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NEWPANEL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NEWPANEL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NEWPANEL.InitStatus = 2;
    PAN_NEWPANEL_Init();
    PAN_NEWPANEL_InitFields();
    PAN_NEWPANEL_InitQueries();
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[4].ChildFrame2 = Frames[6];
    Frames[6].Width = 400;
    Frames[6].Height = 352;
    Frames[6].Caption = "Tipi Variazione";
    Frames[6].Parent = this;
    Frames[6].FixedHeight = 352;
    PAN_TIPIVARIAZIO = new IDPanel(w, this, 6, "PAN_TIPIVARIAZIO");
    Frames[6].Content = PAN_TIPIVARIAZIO;
    PAN_TIPIVARIAZIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPIVARIAZIO.VS = MainFrm.VisualStyleList;
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 400-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3C820BCD-F5C2-4B13-96C0-FCFF67AE1475");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 292, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPIVARIAZIO.InitStatus = 2;
    PAN_TIPIVARIAZIO_Init();
    PAN_TIPIVARIAZIO_InitFields();
    PAN_TIPIVARIAZIO_InitQueries();
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[3].ChildFrame2 = Frames[7];
    Frames[7].Width = 452;
    Frames[7].Height = 444;
    Frames[7].Vertical = true;
    Frames[7].FormFactor = 0.207207;
    Frames[8] = new AFrame(8);
    Frames[8].Parent = this;
    Frames[7].ChildFrame1 = Frames[8];
    Frames[8].Width = 452;
    Frames[8].Height = 92;
    Frames[8].FrHidden = true;
    Frames[8].Caption = "Pars";
    Frames[8].Parent = this;
    Frames[8].FixedHeight = 92;
    PAN_PARS = new IDPanel(w, this, 8, "PAN_PARS");
    Frames[8].Content = PAN_PARS;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 452-MyGlb.PAN_OFFS_X, 92-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A39C0ACE-FBAE-492F-A6AB-27E193F947C8");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 2;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
    Frames[9] = new AFrame(9);
    Frames[9].Parent = this;
    Frames[7].ChildFrame2 = Frames[9];
    Frames[9].Width = 452;
    Frames[9].Height = 352;
    Frames[9].Caption = "Dettagli Della Bozza";
    Frames[9].Parent = this;
    Frames[9].FixedHeight = 352;
    PAN_DETTDELLBOZZ = new IDPanel(w, this, 9, "PAN_DETTDELLBOZZ");
    Frames[9].Content = PAN_DETTDELLBOZZ;
    PAN_DETTDELLBOZZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTDELLBOZZ.VS = MainFrm.VisualStyleList;
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 452-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2E1A6126-B2C3-477D-A93C-30CDC444FEDB");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 568, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTDELLBOZZ.InitStatus = 2;
    PAN_DETTDELLBOZZ_Init();
    PAN_DETTDELLBOZZ_InitFields();
    PAN_DETTDELLBOZZ_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARS7, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGITIPOVARI_PARS4();
      }
      PAN_DESCBOZZA.UpdatePanel(MainFrm);
      PAN_TIPIVARIAZIO.UpdatePanel(MainFrm);
      PAN_PARS.UpdatePanel(MainFrm);
      PAN_DETTDELLBOZZ.UpdatePanel(MainFrm);
      PAN_NEWPANEL.UpdatePanel(MainFrm);
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
    return (obj instanceof AggiornamentoTipoVariazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornamentoTipoVariazione.class.getName() : (Glb.ClassWithPackage(AggiornamentoTipoVariazione.class) ? AggiornamentoTipoVariazione.class.getName().substring(AggiornamentoTipoVariazione.class.getPackage().getName().length() + 1) : AggiornamentoTipoVariazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Associa Tipo Variazione
  // **********************************************************************
  public int AssociaTipoVariazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ERROR = new IDVariant(0,IDVariant.STRING);
    int CurPos=0;
    IDCachedRowSet C4;

    try
    {
      TransCount = 0;
      // 
      // Associa Tipo Variazione Body
      // Procedure Body
      // 
      v_ERROR = (new IDVariant(""));
      v_COUNT = (new IDVariant(1));
      if ((new IDVariant(PAN_DETTDELLBOZZ.ShowMultipleSel())).equals((new IDVariant(0)), true))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Errore, nessuna bozza selezionata", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      C4 = PAN_DETTDELLBOZZ.MasterRS();
      if (C4.size()>0) CurPos = C4.getRow(); else CurPos = 0;
      if (!C4.Bof()) PAN_DETTDELLBOZZ.GotoFirst();
      while (!PAN_DETTDELLBOZZ.RSEOF())
      {
        if (PAN_DETTDELLBOZZ.IsRowSelected(v_COUNT.intValue()))
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("update POL_PROPOSTE_VAR_DETT set ");
            SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ), ");
            SQL.append("  TIPO_VAR = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_ELENTIPIVAR1, IMDBDef12.PQSL_ELENTIPIVAR1_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append("where (BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_IN5, IMDBDef4.FLD_IN5_ROWNAMBOVAID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (COD_REC = 2) ");
            SQL.append("and   (PROPOSTA_VAR_DETT_ID = " + IDL.CSql(C4.Get("PROPOSTA_VAR_DETT_ID"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e7)
          {
            v_ERROR = IDL.Add(IDL.Add(v_ERROR, new IDVariant(e7.getMessage())), (new IDVariant("<BR/>")));
          }
        }
        v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
        PAN_DETTDELLBOZZ.GotoNext();
      }
      if (CurPos>0) C4.absolute(CurPos);
      if (v_ERROR.compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage(v_ERROR); 
      }
      PAN_DETTDELLBOZZ.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoVariazione", "AssociaTipoVariazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Load Event
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DESC = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as POLBOZVARDES ");
      SQL.append("from ");
      SQL.append("  POL_BOZZE_VARIAZIONE A ");
      SQL.append("where (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_IN5, IMDBDef4.FLD_IN5_ROWNAMBOVAID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESC = QV.Get("POLBOZVARDES", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef4.TBL_PARS7, IMDBDef4.FLD_PARS7_RONASOSETIVA, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef4.TBL_PARS7, IMDBDef4.FLD_PARS7_ROWNAMSOLAPP, 0, (new IDVariant("SI")));
      PAN_DESCBOZZA.set_FieldText(PFL_DESCBOZZA_NEWPANELLABE, new IDVariant(v_DESC).stringValue());
      if (MainFrm.VisualizzaRisorsaIntevento(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))
      {
        PAN_DETTDELLBOZZ.set_FixedCols((new IDVariant(5)).intValue());
        PAN_DETTDELLBOZZ.SetFlags (Glb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTDELLBOZZ.set_FixedCols((new IDVariant(4)).intValue());
        PAN_DETTDELLBOZZ.SetFlags (Glb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGBIG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_DESCBOZZA.set_Collapsable((new IDVariant(0)).booleanValue());
      PAN_TIPIVARIAZIO.set_Collapsable((new IDVariant(0)).booleanValue());
      PAN_DETTDELLBOZZ.set_Collapsable((new IDVariant(0)).booleanValue());
      PAN_DETTDELLBOZZ.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_DETTDELLBOZZ.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_DETTDELLBOZZ.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_TIPIVARIAZIO.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoVariazione", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Tipi Variazione On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPIVARIAZIO);
      // 
      // Tipi Variazione On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_TIPIVARIAZIO.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIVARIAZIO_DESCRIZIONE1,(new IDVariant(PAN_TIPIVARIAZIO.FieldText(PFL_TIPIVARIAZIO_DESCRIZIONE1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoVariazione", "TipiVariazioneOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Della Bozza On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTDELLBOZZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTDELLBOZZ);
      // 
      // Dettagli Della Bozza On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTDELLBOZZ.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTDELLBOZZ_TIPOVAR,(new IDVariant(PAN_DETTDELLBOZZ.FieldText(PFL_DETTDELLBOZZ_TIPOVAR))).stringValue()); 
      PAN_DETTDELLBOZZ.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTDELLBOZZ_DESCRIZIONE,(new IDVariant(PAN_DETTDELLBOZZ.FieldText(PFL_DETTDELLBOZZ_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoVariazione", "DettagliDellaBozzaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Pars
  // Primary record source for panel data
  // **********************************************************************
  private void AGGITIPOVARI_PARS4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARS4_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARS7, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARS7, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARS4_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARS4_RS, 0, IMDBDef4.TBL_PARS7, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS4_RS, 0, 0, IMDBDef4.TBL_PARS7, IMDBDef4.FLD_PARS7_RONASOSETIVA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS4_RS, 1, 0, IMDBDef4.TBL_PARS7, IMDBDef4.FLD_PARS7_ROWNAMSOLAPP, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARS7, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARS7, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARS7, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARS4_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    // Stub
  }

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
  private void PAN_DESCBOZZA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DESCBOZZA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DESCBOZZA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DESCBOZZA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DESCBOZZA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DESCBOZZA);
    // Stub
  }

  private void PAN_DESCBOZZA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DESCBOZZA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DESCBOZZA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DESCBOZZA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_NEWPANEL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NEWPANEL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NEWPANEL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NEWPANEL, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NEWPANEL_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NEWPANEL);
    // Stub
  }

  private void PAN_NEWPANEL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NEWPANEL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NEWPANEL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NEWPANEL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TIPIVARIAZIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPIVARIAZIO, Cancel);
    // Stub
  }

  private void PAN_TIPIVARIAZIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPIVARIAZIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TIPIVARIAZIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPIVARIAZIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DETTDELLBOZZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTDELLBOZZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTDELLBOZZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTDELLBOZZ, Cancel);
    // Stub
  }

  private void PAN_DETTDELLBOZZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DETTDELLBOZZ_ASSOTIPOVARI)
    {
      this.IdxPanelActived = this.PAN_DETTDELLBOZZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      AssociaTipoVariazione();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DETTDELLBOZZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTDELLBOZZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTDELLBOZZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DESCBOZZA_Init()
  {

    PAN_DESCBOZZA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DESCBOZZA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DESCBOZZA.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_DESCBOZZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_ONE, "1CFF1832-63AD-430F-861C-A9BF65D98569");
    PAN_DESCBOZZA.set_Header(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_ONE, "ONE");
    PAN_DESCBOZZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_ONE, "");
    PAN_DESCBOZZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_ONE, MyGlb.VIS_NORMFIELPADR);
    PAN_DESCBOZZA.SetFlags(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_ONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DESCBOZZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_NEWPANELLABE, "256F819E-65CB-4887-B76A-EF14597242C6");
    PAN_DESCBOZZA.set_Header(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_NEWPANELLABE, "");
    PAN_DESCBOZZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_NEWPANELLABE, MyGlb.VIS_ETICHEGRASSE);
    PAN_DESCBOZZA.SetFlags(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_DESCBOZZA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DESCBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_ONE, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DESCBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_ONE, MyGlb.PANEL_LIST, 32);
    PAN_DESCBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_ONE, MyGlb.PANEL_LIST, 1);
    PAN_DESCBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_ONE, MyGlb.PANEL_LIST, "ONE");
    PAN_DESCBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_ONE, MyGlb.PANEL_FORM, 4, 4, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DESCBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_ONE, MyGlb.PANEL_FORM, 32);
    PAN_DESCBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_ONE, MyGlb.PANEL_FORM, 1);
    PAN_DESCBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_ONE, MyGlb.PANEL_FORM, "ONE");
    PAN_DESCBOZZA.SetFieldPage(PFL_DESCBOZZA_ONE, -1, -1);
    PAN_DESCBOZZA.SetFieldUnbound(PFL_DESCBOZZA_ONE, true);
    PAN_DESCBOZZA.SetFieldPanel(PFL_DESCBOZZA_ONE, PPQRY_DUAL39, "1", "RECORDONE", 1, 19, 0, -13997);
    PAN_DESCBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_NEWPANELLABE, MyGlb.PANEL_LIST, 444, 12, 336, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DESCBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_DESCBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_DESCBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_NEWPANELLABE, MyGlb.PANEL_FORM, 12, 8, 784, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DESCBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_DESCBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DESCBOZZA_NEWPANELLABE, MyGlb.PANEL_FORM, 2);
    PAN_DESCBOZZA.SetFieldPage(PFL_DESCBOZZA_NEWPANELLABE, -1, -1);
    PAN_DESCBOZZA.SetFieldPanel(PFL_DESCBOZZA_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
  }

  private void PAN_DESCBOZZA_InitQueries()
  {
    StringBuffer SQL;

    PAN_DESCBOZZA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DESCBOZZA.SetIMDB(IMDB, "PQRY_DUAL39", true);
    PAN_DESCBOZZA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  1 as RECORDONE ");
    PAN_DESCBOZZA.SetQuery(PPQRY_DUAL39, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DESCBOZZA.SetQuery(PPQRY_DUAL39, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DESCBOZZA.SetQuery(PPQRY_DUAL39, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DESCBOZZA.SetQuery(PPQRY_DUAL39, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DESCBOZZA.SetQuery(PPQRY_DUAL39, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DESCBOZZA.SetQuery(PPQRY_DUAL39, 5, SQL, -1, "");
    PAN_DESCBOZZA.SetQueryDB(PPQRY_DUAL39, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DESCBOZZA.SetMasterTable(0, "DUAL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DESCBOZZA.Status() == 2)
    {
      int oldListQBE = PAN_DESCBOZZA.iUseListQBE;
      PAN_DESCBOZZA.iUseListQBE = 0;
      PAN_DESCBOZZA.PanelCommand(Glb.PCM_SEARCH);
      PAN_DESCBOZZA.PanelCommand(Glb.PCM_FIND);
      PAN_DESCBOZZA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_TIPIVARIAZIO_Init()
  {

    PAN_TIPIVARIAZIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPIVARIAZIO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPIVARIAZIO.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE1, "0367C6C3-57E3-470B-A022-EF59730165F4");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE1, "Codice");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE1, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE1, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE1, "3C9206D5-6450-4C82-9947-F7004C65E4BB");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE1, "Descrizione");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE1, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_TIPIVARIAZIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE1, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE1, MyGlb.PANEL_LIST, 48);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE1, MyGlb.PANEL_LIST, "Codice");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE1, MyGlb.PANEL_FORM, 4, 4, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE1, MyGlb.PANEL_FORM, 48);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE1, MyGlb.PANEL_FORM, "Codice");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_CODICE1, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_CODICE1, PPQRY_ELENTIPIVAR1, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE1, MyGlb.PANEL_LIST, 48, 36, 244, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 28, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_DESCRIZIONE1, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_DESCRIZIONE1, PPQRY_ELENTIPIVAR1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
  }

  private void PAN_TIPIVARIAZIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPIVARIAZIO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TIPIVARIAZIO.SetIMDB(IMDB, "PQRY_ELENTIPIVAR1", true);
    PAN_TIPIVARIAZIO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_ELENTIPIVAR1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T54 A ");
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_ELENTIPIVAR1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_ELENTIPIVAR1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_ELENTIPIVAR1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_ELENTIPIVAR1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_ELENTIPIVAR1, 5, SQL, -1, "");
    PAN_TIPIVARIAZIO.SetQueryDB(PPQRY_ELENTIPIVAR1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIVARIAZIO.SetMasterTable(0, "T54");
    PAN_TIPIVARIAZIO.AddToSortList(PFL_TIPIVARIAZIO_CODICE1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPIVARIAZIO.Status() == 2)
    {
      int oldListQBE = PAN_TIPIVARIAZIO.iUseListQBE;
      PAN_TIPIVARIAZIO.iUseListQBE = 0;
      PAN_TIPIVARIAZIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPIVARIAZIO.PanelCommand(Glb.PCM_FIND);
      PAN_TIPIVARIAZIO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_SOLSENTIPVAR, "131367D4-E2F5-4D3F-9161-A16AB616EE7F");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_SOLSENTIPVAR, "Solo senza tipo variazione");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_SOLSENTIPVAR, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_SOLSENTIPVAR, MyGlb.VIS_CHECKSTYLE);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_SOLSENTIPVAR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_SOLOAPPROVAT, "68CA04DC-9743-4DF3-AFB2-CC0F98626FCD");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_SOLOAPPROVAT, "Solo approvati");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_SOLOAPPROVAT, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_SOLOAPPROVAT, MyGlb.VIS_CHECKSTYLE);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_SOLOAPPROVAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SOLSENTIPVAR, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SOLSENTIPVAR, MyGlb.PANEL_LIST, 136);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SOLSENTIPVAR, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SOLSENTIPVAR, MyGlb.PANEL_LIST, "S. sn. t. var.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SOLSENTIPVAR, MyGlb.PANEL_FORM, 4, 16, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SOLSENTIPVAR, MyGlb.PANEL_FORM, 156);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SOLSENTIPVAR, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SOLSENTIPVAR, MyGlb.PANEL_FORM, "Solo senza tipo variazione");
    PAN_PARS.SetFieldPage(PFL_PARS_SOLSENTIPVAR, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_SOLSENTIPVAR, PPQRY_PARS4, "A.RONASOSETIVA", "RONASOSETIVA", 5, 2, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_SOLSENTIPVAR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_SOLSENTIPVAR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SOLOAPPROVAT, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SOLOAPPROVAT, MyGlb.PANEL_LIST, 80);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SOLOAPPROVAT, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SOLOAPPROVAT, MyGlb.PANEL_LIST, "Sl. appr.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SOLOAPPROVAT, MyGlb.PANEL_FORM, 56, 40, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SOLOAPPROVAT, MyGlb.PANEL_FORM, 104);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SOLOAPPROVAT, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SOLOAPPROVAT, MyGlb.PANEL_FORM, "Solo approvati");
    PAN_PARS.SetFieldPage(PFL_PARS_SOLOAPPROVAT, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_SOLOAPPROVAT, PPQRY_PARS4, "A.ROWNAMSOLAPP", "ROWNAMSOLAPP", 5, 2, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_SOLOAPPROVAT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_SOLOAPPROVAT, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS4", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS4, IMDBDef12.PQRY_PARS4_RS, IMDBDef4.TBL_PARS7);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_SOLSENTIPVAR, IMDBDef4.FLD_PARS7_RONASOSETIVA);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_SOLOAPPROVAT, IMDBDef4.FLD_PARS7_ROWNAMSOLAPP);
    PAN_PARS.SetMasterTable(0, "PARS7");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DETTDELLBOZZ_Init()
  {

    PAN_DETTDELLBOZZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTDELLBOZZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DETTDELLBOZZ.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, "0366883F-53E8-460B-9919-6C86BF3119C3");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, "STATO");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO, "C6BEACC9-7EBB-4D6A-BCAC-A182073C5EDB");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO, "Stato ");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES, "557D8CB8-E8FB-4F10-99FB-89171AB15516");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES, "E/S");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO, "C812E0DA-24A6-4BED-8E90-C1A895749B45");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO, "CAPITOLO");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO, "71310071-06E2-4E69-B77F-ED4BF085A8DA");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO, "ARTICOLO");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA, "B9AAFF49-38CA-4ACC-8ECE-009DE0FE2F0B");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA, "Nuova");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA, MyGlb.VIS_CHECKSTYLE);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE, "C07DB883-4DF4-470F-ADBD-12258A9D333E");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE, "Descrizione");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_TIPOVAR, "997A0E61-4198-4200-8265-AAF80D5952BA");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_TIPOVAR, "Tipo Var.");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_TIPOVAR, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_TIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_TIPOVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGBIG, "D82F7397-136E-4169-AC09-50DF6BC3EA7E");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGBIG, "Voce P.e.g.");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGBIG, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGBIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, "C89D364A-80D7-43C1-9028-175FB8BEA315");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, "Capitolo/Art.");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ASSOTIPOVARI, "A55E7A57-1B66-4E51-8F7B-23137DC1728D");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ASSOTIPOVARI, "Associa");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ASSOTIPOVARI, MyGlb.VIS_STATICBUTTON);
    PAN_DETTDELLBOZZ.SetImage(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ASSOTIPOVARI, 0, "button1.gif", false);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ASSOTIPOVARI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_DETTDELLBOZZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_LIST, 44);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_LIST, "STATO");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_FORM, 4, 4, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_FORM, 44);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_FORM, "STATO");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_STATO1, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_STATO1, PPQRY_POLPROVARDE7, "A.STATO", "STATO", 5, 1, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO, MyGlb.PANEL_LIST, 44);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO, MyGlb.PANEL_LIST, "Stato ");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO, MyGlb.PANEL_FORM, 4, 4, 476, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO, MyGlb.PANEL_FORM, 44);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO, MyGlb.PANEL_FORM, 2);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO, MyGlb.PANEL_FORM, "Stato ");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_STATO, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldUnbound(PFL_DETTDELLBOZZ_STATO, true);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_STATO, PPQRY_POLPROVARDE7, "A.STATO", "RECORDSTATO", 5, 1, 0, -13997);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_STATO, (new IDVariant()), "Faccina interrogativa", "", "smile_question.gif", -1);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_STATO, (new IDVariant("A")), "Faccina Verde", "", "smileverde.gif", -1);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_STATO, (new IDVariant("N")), "Faccina rossa", "", "smilerosso.gif", -1);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES, MyGlb.PANEL_LIST, 40, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES, MyGlb.PANEL_LIST, 24);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES, MyGlb.PANEL_LIST, "E/S");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES, MyGlb.PANEL_FORM, 4, 76, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES, MyGlb.PANEL_FORM, 24);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES, MyGlb.PANEL_FORM, "E S");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_ES, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_ES, PPQRY_POLPROVARDE7, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO, MyGlb.PANEL_LIST, 96, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO, MyGlb.PANEL_FORM, 4, 124, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_CAPITOLO, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_CAPITOLO, PPQRY_POLPROVARDE7, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO, MyGlb.PANEL_LIST, 196, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_ARTICOLO, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_ARTICOLO, PPQRY_POLPROVARDE7, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA, MyGlb.PANEL_LIST, 220, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA, MyGlb.PANEL_LIST, 92);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA, MyGlb.PANEL_LIST, "Nuova");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA, MyGlb.PANEL_FORM, 4, 172, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA, MyGlb.PANEL_FORM, 92);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA, MyGlb.PANEL_FORM, "Nuova");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_NUOVA, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_NUOVA, PPQRY_POLPROVARDE7, "A.ISTITUZIONE_NC", "ISTITUZIONE_NC", 5, 2, 0, -13997);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_NUOVA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_NUOVA, (new IDVariant()), "Null", "", "", -1);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE, MyGlb.PANEL_LIST, 264, 36, 144, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 196, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_DESCRIZIONE, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldUnbound(PFL_DETTDELLBOZZ_DESCRIZIONE, true);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_DESCRIZIONE, PPQRY_POLPROVARDE7, "SUBSTR(A.DESCRIZIONE, 1, 30)", "RECORDDESCRI", 5, 99, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_TIPOVAR, MyGlb.PANEL_LIST, 408, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_TIPOVAR, MyGlb.PANEL_LIST, 56);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_TIPOVAR, MyGlb.PANEL_LIST, "Tipo Var.");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_TIPOVAR, MyGlb.PANEL_FORM, 4, 52, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_TIPOVAR, MyGlb.PANEL_FORM, 56);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_TIPOVAR, MyGlb.PANEL_FORM, "Tipo Var.");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_TIPOVAR, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_TIPOVAR, PPQRY_POLPROVARDE7, "A.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGBIG, MyGlb.PANEL_LIST, 96, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGBIG, MyGlb.PANEL_LIST, 0);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGBIG, MyGlb.PANEL_LIST, 2);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGBIG, MyGlb.PANEL_FORM, 256, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGBIG, MyGlb.PANEL_FORM, 0);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGBIG, MyGlb.PANEL_FORM, 2);
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_VOCEPEGBIG, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_VOCEPEGBIG, -1, "", "VOCEPEGBIG", 0, 0, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, MyGlb.PANEL_LIST, 96, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, MyGlb.PANEL_LIST, 2);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, MyGlb.PANEL_FORM, 264, 8, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, MyGlb.PANEL_FORM, 2);
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_CAPITOLOART, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ASSOTIPOVARI, MyGlb.PANEL_LIST, 4, 244, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ASSOTIPOVARI, MyGlb.PANEL_LIST, 0);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ASSOTIPOVARI, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ASSOTIPOVARI, MyGlb.PANEL_FORM, 4, 244, 136, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ASSOTIPOVARI, MyGlb.PANEL_FORM, 0);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ASSOTIPOVARI, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_ASSOTIPOVARI, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_ASSOTIPOVARI, -1, "", "ASSOTIPOVARI", 0, 0, 0, -13997);
  }

  private void PAN_DETTDELLBOZZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTDELLBOZZ.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 1, 30) as T54DESC ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    PAN_DETTDELLBOZZ.SetQuery(PPQRY_T54, 0, SQL, PFL_DETTDELLBOZZ_TIPOVAR, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 1, 30) as T54DESC ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    PAN_DETTDELLBOZZ.SetQuery(PPQRY_T54, 1, SQL, PFL_DETTDELLBOZZ_TIPOVAR, "");
    PAN_DETTDELLBOZZ.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTDELLBOZZ.SetIMDB(IMDB, "PQRY_POLPROVARDE7", true);
    PAN_DETTDELLBOZZ.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  A.PROPOSTA_VAR_DETT_ID as PROPOSTA_VAR_DETT_ID, ");
    SQL.append("  A.COD_REC as COD_REC, ");
    SQL.append("  A.STATO as RECORDSTATO, ");
    SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ISTITUZIONE_NC as ISTITUZIONE_NC, ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 1, 30) as RECORDDESCRI ");
    PAN_DETTDELLBOZZ.SetQuery(PPQRY_POLPROVARDE7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT A ");
    PAN_DETTDELLBOZZ.SetQuery(PPQRY_POLPROVARDE7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.COD_REC = 2) ");
    SQL.append("and   (A.BOZZA_VARIAZIONE_ID = ~~TBL_IN5.ROWNAMBOVAID~~) ");
    SQL.append("and   (((A.TIPO_VAR IS NULL) AND ~~TBL_PARS7.RONASOSETIVA~~ = 'SI') OR (~~TBL_PARS7.RONASOSETIVA~~ = 'NO')) ");
    SQL.append("and   (A.STATO <> 'N') ");
    SQL.append("and   ((A.STATO = 'A' AND ~~TBL_PARS7.ROWNAMSOLAPP~~ = 'SI') OR (~~TBL_PARS7.ROWNAMSOLAPP~~ = 'NO')) ");
    PAN_DETTDELLBOZZ.SetQuery(PPQRY_POLPROVARDE7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTDELLBOZZ.SetQuery(PPQRY_POLPROVARDE7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTDELLBOZZ.SetQuery(PPQRY_POLPROVARDE7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTDELLBOZZ.SetQuery(PPQRY_POLPROVARDE7, 5, SQL, -1, "");
    PAN_DETTDELLBOZZ.SetQueryDB(PPQRY_POLPROVARDE7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTDELLBOZZ.SetMasterTable(0, "POL_PROPOSTE_VAR_DETT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTDELLBOZZ.Status() == 2)
    {
      int oldListQBE = PAN_DETTDELLBOZZ.iUseListQBE;
      PAN_DETTDELLBOZZ.iUseListQBE = 0;
      PAN_DETTDELLBOZZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTDELLBOZZ.PanelCommand(Glb.PCM_FIND);
      PAN_DETTDELLBOZZ.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_NEWPANEL_Init()
  {

    PAN_NEWPANEL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NEWPANEL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NEWPANEL.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_NEWPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NEWPANEL_CODICE, "324561D3-0315-49A2-8206-F6053742D837");
    PAN_NEWPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_NEWPANEL_CODICE, "CODICE");
    PAN_NEWPANEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NEWPANEL_CODICE, "");
    PAN_NEWPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NEWPANEL_CODICE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NEWPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_NEWPANEL_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_NEWPANEL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NEWPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_NEWPANEL_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWPANEL_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_NEWPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWPANEL_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_NEWPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NEWPANEL_CODICE, MyGlb.PANEL_LIST, "CODICE");
    PAN_NEWPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_NEWPANEL_CODICE, MyGlb.PANEL_FORM, 8, 48, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWPANEL_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_NEWPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWPANEL_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_NEWPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NEWPANEL_CODICE, MyGlb.PANEL_FORM, "CODICE");
    PAN_NEWPANEL.SetFieldPage(PFL_NEWPANEL_CODICE, -1, -1);
    PAN_NEWPANEL.SetFieldPanel(PFL_NEWPANEL_CODICE, PPQRY_DUAL7, "A.CODICE", "CODICE", 1, 2, 0, -13997);
  }

  private void PAN_NEWPANEL_InitQueries()
  {
    StringBuffer SQL;

    PAN_NEWPANEL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NEWPANEL.SetIMDB(IMDB, "PQRY_DUAL7", true);
    PAN_NEWPANEL.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE ");
    PAN_NEWPANEL.SetQuery(PPQRY_DUAL7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T54 A ");
    PAN_NEWPANEL.SetQuery(PPQRY_DUAL7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NEWPANEL.SetQuery(PPQRY_DUAL7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NEWPANEL.SetQuery(PPQRY_DUAL7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NEWPANEL.SetQuery(PPQRY_DUAL7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NEWPANEL.SetQuery(PPQRY_DUAL7, 5, SQL, -1, "");
    PAN_NEWPANEL.SetQueryDB(PPQRY_DUAL7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NEWPANEL.SetMasterTable(0, "T54");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NEWPANEL.Status() == 2)
    {
      int oldListQBE = PAN_NEWPANEL.iUseListQBE;
      PAN_NEWPANEL.iUseListQBE = 0;
      PAN_NEWPANEL.PanelCommand(Glb.PCM_SEARCH);
      PAN_NEWPANEL.PanelCommand(Glb.PCM_FIND);
      PAN_NEWPANEL.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DESCBOZZA) PAN_DESCBOZZA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DETTDELLBOZZ) PAN_DETTDELLBOZZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NEWPANEL) PAN_NEWPANEL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DESCBOZZA) PAN_DESCBOZZA_ValidateRow(Cancel);
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_ValidateRow(Cancel);
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
    if (SrcObj == PAN_DETTDELLBOZZ) PAN_DETTDELLBOZZ_ValidateRow(Cancel);
    if (SrcObj == PAN_NEWPANEL) PAN_NEWPANEL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DESCBOZZA) PAN_DESCBOZZA_DynamicProperties();
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_DynamicProperties();
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
    if (SrcObj == PAN_DETTDELLBOZZ) PAN_DETTDELLBOZZ_DynamicProperties();
    if (SrcObj == PAN_NEWPANEL) PAN_NEWPANEL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DESCBOZZA) PAN_DESCBOZZA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DETTDELLBOZZ) PAN_DETTDELLBOZZ_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NEWPANEL) PAN_NEWPANEL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DESCBOZZA) PAN_DESCBOZZA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DETTDELLBOZZ) PAN_DETTDELLBOZZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_NEWPANEL) PAN_NEWPANEL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
