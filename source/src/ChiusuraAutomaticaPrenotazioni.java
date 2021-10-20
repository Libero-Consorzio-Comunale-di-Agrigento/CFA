// **********************************************
// Chiusura Automatica Prenotazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ChiusuraAutomaticaPrenotazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_PROVVEDIMENT = 0;

  private static int PFL_PARAMETRI_DELIBERLABEL = 0;
  private static int PFL_PARAMETRI_SEDEDELIBERA = 1;
  private static int PFL_PARAMETRI_TRATTIDELIBE = 2;
  private static int PFL_PARAMETRI_NUMERODELIBE = 3;
  private static int PFL_PARAMETRI_BARRADELIBER = 4;
  private static int PFL_PARAMETRI_ANNODELIBERA = 5;
  private static int PFL_PARAMETRI_APRISCEGDELI = 6;
  private static int PFL_PARAMETRI_INFODELIBERA = 7;
  private static int PFL_PARAMETRI_PROPOSTLABEL = 8;
  private static int PFL_PARAMETRI_UNITAPROPONE = 9;
  private static int PFL_PARAMETRI_TRATTIPROPOS = 10;
  private static int PFL_PARAMETRI_NUMEROPROPOS = 11;
  private static int PFL_PARAMETRI_BARRAPROPOST = 12;
  private static int PFL_PARAMETRI_ANNOPROPOSTA = 13;
  private static int PFL_PARAMETRI_APRISCEGPROP = 14;
  private static int PFL_PARAMETRI_INFOPROPOSTA = 15;
  private static int PFL_PARAMETRI_ELABORBUTTON = 16;
  private static int PFL_PARAMETRI_DESCRIZIONE = 17;
  private static int PFL_PARAMETRI_TIPOVARIAZIO = 18;
  private static int PFL_PARAMETRI_DATAREG = 19;

  private static int PPQRY_PARAMESTAMP3 = 0;

  private static int PPQRY_T55 = 1;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI335(IMDB);
    Init_TBL_IMPACCSELEZI(IMDB);
    //
    //
    Init_PQRY_PARAMESTAMP3(IMDB);
    Init_PQRY_PARAMESTAMP3_RS(IMDB);
    Init_QRY_IMPACCSELEZ1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI335(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI335, 10);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI335, "TBL_PARAMETRI335");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, "ROWNAMTIPCHI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI,5,3,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ROWNAMEDESCR,5,250,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ROWNAMDATREG, "ROWNAMDATREG");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI335,IMDBDef6.FLD_PARAMETRI335_ROWNAMDATREG,6,19,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI335, 0);
  }

  private static void Init_TBL_IMPACCSELEZI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_IMPACCSELEZI, 6);
    IMDB.set_TblCode(IMDBDef6.TBL_IMPACCSELEZI, "TBL_IMPACCSELEZI");
    IMDB.set_FldCode(IMDBDef6.TBL_IMPACCSELEZI,IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, "IMPACCESERCI");
    IMDB.SetFldParams(IMDBDef6.TBL_IMPACCSELEZI,IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMPACCSELEZI,IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, "IMPACCCAPITO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMPACCSELEZI,IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMPACCSELEZI,IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, "IMPACCARTICO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMPACCSELEZI,IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMPACCSELEZI,IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, "ANNOIMPACC");
    IMDB.SetFldParams(IMDBDef6.TBL_IMPACCSELEZI,IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMPACCSELEZI,IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, "NUMEROIMPACC");
    IMDB.SetFldParams(IMDBDef6.TBL_IMPACCSELEZI,IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMPACCSELEZI,IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, "IMPACCDISPON");
    IMDB.SetFldParams(IMDBDef6.TBL_IMPACCSELEZI,IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON,3,14,2);
  }

  private static void Init_PQRY_PARAMESTAMP3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMESTAMP3, 9);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMESTAMP3, "PQRY_PARAMESTAMP3");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMEDESCR,5,250,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMDATREG, "ROWNAMDATREG");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMDATREG,6,19,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMESTAMP3, 0);
  }

  private static void Init_PQRY_PARAMESTAMP3_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMESTAMP3_RS, 9);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMESTAMP3_RS, "PQRY_PARAMESTAMP3_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMEDESCR,5,250,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMDATREG, "ROWNAMDATREG");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMESTAMP3_RS,IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMDATREG,6,19,0);
  }

  private static void Init_QRY_IMPACCSELEZ1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.QRY_IMPACCSELEZ1, 6);
    IMDB.set_TblCode(IMDBDef17.QRY_IMPACCSELEZ1, "QRY_IMPACCSELEZ1");
    IMDB.set_FldCode(IMDBDef17.QRY_IMPACCSELEZ1,IMDBDef17.QSL_IMPACCSELEZ1_ANNOIMPACC, "ANNOIMPACC");
    IMDB.SetFldParams(IMDBDef17.QRY_IMPACCSELEZ1,IMDBDef17.QSL_IMPACCSELEZ1_ANNOIMPACC,1,4,0);
    IMDB.set_FldCode(IMDBDef17.QRY_IMPACCSELEZ1,IMDBDef17.QSL_IMPACCSELEZ1_NUMEROIMPACC, "NUMEROIMPACC");
    IMDB.SetFldParams(IMDBDef17.QRY_IMPACCSELEZ1,IMDBDef17.QSL_IMPACCSELEZ1_NUMEROIMPACC,1,5,0);
    IMDB.set_FldCode(IMDBDef17.QRY_IMPACCSELEZ1,IMDBDef17.QSL_IMPACCSELEZ1_IMPACCESERCI, "IMPACCESERCI");
    IMDB.SetFldParams(IMDBDef17.QRY_IMPACCSELEZ1,IMDBDef17.QSL_IMPACCSELEZ1_IMPACCESERCI,1,4,0);
    IMDB.set_FldCode(IMDBDef17.QRY_IMPACCSELEZ1,IMDBDef17.QSL_IMPACCSELEZ1_IMPACCCAPITO, "IMPACCCAPITO");
    IMDB.SetFldParams(IMDBDef17.QRY_IMPACCSELEZ1,IMDBDef17.QSL_IMPACCSELEZ1_IMPACCCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.QRY_IMPACCSELEZ1,IMDBDef17.QSL_IMPACCSELEZ1_IMPACCARTICO, "IMPACCARTICO");
    IMDB.SetFldParams(IMDBDef17.QRY_IMPACCSELEZ1,IMDBDef17.QSL_IMPACCSELEZ1_IMPACCARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.QRY_IMPACCSELEZ1,IMDBDef17.QSL_IMPACCSELEZ1_IMPACCDISPON, "IMPACCDISPON");
    IMDB.SetFldParams(IMDBDef17.QRY_IMPACCSELEZ1,IMDBDef17.QSL_IMPACCSELEZ1_IMPACCDISPON,3,14,2);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ChiusuraAutomaticaPrenotazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public ChiusuraAutomaticaPrenotazioni()
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
    FormIdx = MyGlb.FRM_CHIUAUTOPREN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BFE72E35-5071-4FA0-B6C1-869F9E4DDF05";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 660;
    DesignHeight = 218;
    set_Caption(new IDVariant("Chiusura Automatica Prenotazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 660;
    Frames[1].Height = 192;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 192;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 660-MyGlb.PAN_OFFS_X, 192-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E1C34608-E6D4-4952-A550-635748C48120");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1348, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI335, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CHIUAUTOPREN_PARAMESTAMP3();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRISCEGDELI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRISCEGPROP) {
      }
    }
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
    return (obj instanceof ChiusuraAutomaticaPrenotazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ChiusuraAutomaticaPrenotazioni.class.getName() : (Glb.ClassWithPackage(ChiusuraAutomaticaPrenotazioni.class) ? ChiusuraAutomaticaPrenotazioni.class.getName().substring(ChiusuraAutomaticaPrenotazioni.class.getPackage().getName().length() + 1) : ChiusuraAutomaticaPrenotazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    IDVariant v_CAPTIONPRENO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTIOIMPEGN = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTIOACCERT = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTIONPRENO = (new IDVariant("Chiusura Automatica Prenotazioni", IDVariant.STRING));
      v_CAPTIOIMPEGN = (new IDVariant("Chiusura Automatica Impegni", IDVariant.STRING));
      v_CAPTIOACCERT = (new IDVariant("Chiusura Automatica Accertamenti", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, 0).equals((new IDVariant("PRE")), true))
      {
        set_Caption(IDL.Add(v_CAPTIONPRENO, MainFrm.ESERCIZIO));
      }
      else
      {
        if (IMDB.Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, 0).equals((new IDVariant("IMP")), true))
        {
          set_Caption(IDL.Add(v_CAPTIOIMPEGN, MainFrm.ESERCIZIO));
        }
        else
        {
          set_Caption(IDL.Add(v_CAPTIOACCERT, MainFrm.ESERCIZIO));
        }
      }
      if (MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraAutomaticaPrenotazioni", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraAutomaticaPrenotazioni", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
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
      // Unload Event Body
      // Procedure Body
      // 
      UNLOADEVENT_PARADELEROWS();
      UNLOADEVENT_IMPACCSEDERO();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraAutomaticaPrenotazioni", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_UNITA_PROPONENTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_NUMERO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ANNO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMEDESCR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPVAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMDATREG, 0, new IDVariant());
  }

  // **********************************************************************
  // Imp Acc Selezionati: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_IMPACCSEDERO() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_IMPACCSELEZI);
  }

  // **********************************************************************
  // Parametri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMANNDEL, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ANNO_PROPOSTA, 0))) && MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraAutomaticaPrenotazioni", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Provvedimento Sede Delibera Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_SEDEDELIBERA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Provvedimento Sede Delibera Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, 0).compareTo(IDL.Upper(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, 0)), true)!=0)
      {
        IMDB.set_Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraAutomaticaPrenotazioni", "ProvvedimentoSedeDeliberaValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Provvedimento Unità Proponente Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_UNITAPROPONE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Provvedimento Unità Proponente Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, 0).compareTo(IDL.Upper(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, 0)), true)!=0)
      {
        IMDB.set_Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, 0, IDL.Upper(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraAutomaticaPrenotazioni", "ProvvedimentoUnitàProponenteValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      // 
      // validazione dei campi
      // 
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMNUMDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMANNDEL, 0))))
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMANNDEL, 0))))
          {
            if (MainFrm.ControlloEsistenzaDelibere(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMNUMDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMANNDEL, 0), (new IDVariant(-1))).equals((new IDVariant(-1)), true))
            {
              return 0;
            }
          }
          else
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMNUMDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMANNDEL, 0)))
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Dati Delibera incompleti", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_MSG); 
              return 0;
            }
          }
        }
        if (MainFrm.GESTIODELIBE.booleanValue())
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_NUMERO_PROPOSTA, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ANNO_PROPOSTA, 0))))
          {
            if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ANNO_PROPOSTA, 0))))
            {
              if (MainFrm.ControlloEsistenzaProposte(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_NUMERO_PROPOSTA, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ANNO_PROPOSTA, 0), (new IDVariant(-1))).equals((new IDVariant(-1)), true))
              {
                return 0;
              }
            }
            else
            {
              if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_NUMERO_PROPOSTA, 0)) || IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, 0)) || IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ANNO_PROPOSTA, 0)))
              {
                IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
                v_MSG = (new IDVariant("Dati Proposta incompleti", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_MSG); 
                return 0;
              }
            }
          }
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMEDESCR, 0)) || IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMEDESCR, 0).equals((new IDVariant("")), true))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Descrizione Obbligatoria", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMTIPVAR, 0)))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Tipo Variazione Obbligatoria", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMDATREG, 0)))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Data Registrazione Obbligatoria", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      if (ChiusuraPrenotazioni())
      {
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      else
      {
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraAutomaticaPrenotazioni", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Delibere
  // **********************************************************************
  public int ApriSceltaDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Delibere Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraAutomaticaPrenotazioni", "ApriSceltaDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibere
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraAutomaticaPrenotazioni", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Proposta
  // **********************************************************************
  public int ApriSceltaProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Proposta Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraAutomaticaPrenotazioni", "ApriSceltaProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposta
  // **********************************************************************
  public int InfoProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposta Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_NUMERO_PROPOSTA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraAutomaticaPrenotazioni", "InfoProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Chiusura Prenotazioni
  // **********************************************************************
  public boolean ChiusuraPrenotazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant I = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMVARTOT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMERR = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMVAR = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMIMPACCVAR = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      I = (new IDVariant(1, IDVariant.INTEGER));
      v_NUMVARTOT = (new IDVariant(0, IDVariant.INTEGER));
      v_NUMERR = (new IDVariant(0, IDVariant.INTEGER));
      v_NUMVAR = (new IDVariant(0, IDVariant.INTEGER));
      v_NUMIMPACCVAR = (new IDVariant(0, IDVariant.INTEGER));
      // 
      // Chiusura Prenotazioni Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.BeginTrans();
      CHIUSUPRENOT_IMPACCSELEZ1();
      while (!IMDB.Eof(IMDBDef17.QRY_IMPACCSELEZ1, 0))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        if (IMDB.Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, 0).equals((new IDVariant("PRE")), true))
        {
          MainFrm.Cf4armDBObject.CHIUSURAPRENOTAZIONI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMNUMDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMANNDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_NUMERO_PROPOSTA, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ANNO_PROPOSTA, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMEDESCR, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMTIPVAR, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMDATREG, 0), v_NUMVAR, IMDB.Value(IMDBDef17.QRY_IMPACCSELEZ1, IMDBDef17.QSL_IMPACCSELEZ1_ANNOIMPACC, 0), IMDB.Value(IMDBDef17.QRY_IMPACCSELEZ1, IMDBDef17.QSL_IMPACCSELEZ1_NUMEROIMPACC, 0), v_NUMERR);
          v_NUMVARTOT = IDL.Add(v_NUMVARTOT, v_NUMVAR);
        }
        else
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef17.QRY_IMPACCSELEZ1, IMDBDef17.QSL_IMPACCSELEZ1_IMPACCDISPON, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)>0)
          {
            MainFrm.Cf4armDBObject.VARAUTOIMPACC(IMDB.Value(IMDBDef17.QRY_IMPACCSELEZ1, IMDBDef17.QSL_IMPACCSELEZ1_IMPACCESERCI, 0), IMDB.Value(IMDBDef17.QRY_IMPACCSELEZ1, IMDBDef17.QSL_IMPACCSELEZ1_IMPACCCAPITO, 0), IMDB.Value(IMDBDef17.QRY_IMPACCSELEZ1, IMDBDef17.QSL_IMPACCSELEZ1_IMPACCARTICO, 0), IMDB.Value(IMDBDef17.QRY_IMPACCSELEZ1, IMDBDef17.QSL_IMPACCSELEZ1_ANNOIMPACC, 0), IMDB.Value(IMDBDef17.QRY_IMPACCSELEZ1, IMDBDef17.QSL_IMPACCSELEZ1_NUMEROIMPACC, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMANNDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMNUMDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMSEDDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ANNO_PROPOSTA, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_NUMERO_PROPOSTA, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_UNITA_PROPONENTE, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMEDESCR, 0), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMTIPVAR, 0), IDL.Mul(IMDB.Value(IMDBDef17.QRY_IMPACCSELEZ1, IMDBDef17.QSL_IMPACCSELEZ1_IMPACCDISPON, 0), (new IDVariant(-1))), IMDB.Value(IMDBDef17.PQRY_PARAMESTAMP3, IMDBDef17.PQSL_PARAMESTAMP3_ROWNAMDATREG, 0), ((IMDB.Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, 0).equals((new IDVariant("IMP"))))?(new IDVariant("VARIMP")):(new IDVariant("VARACC"))));
            v_NUMIMPACCVAR = IDL.Add(v_NUMIMPACCVAR, (new IDVariant(1)));
          }
        }
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          if (v_NUMVARTOT.compareTo((new IDVariant(0)), true)>0)
          {
            v_NUMVARTOT = IDL.Sub(v_NUMVARTOT, (new IDVariant(1)));
          }
          if (v_NUMIMPACCVAR.compareTo((new IDVariant(0)), true)>0)
          {
            v_NUMIMPACCVAR = IDL.Sub(v_NUMIMPACCVAR, (new IDVariant(1)));
          }
          MainFrm.Cf4armDBObject.RollbackTrans();
          return (new IDVariant(0)).booleanValue();
        }
        I = IDL.Add(I, (new IDVariant(1)));
        IMDB.TblMoveNext(IMDBDef17.QRY_IMPACCSELEZ1, 0);
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, 0).equals((new IDVariant("PRE")), true))
      {
        if (v_NUMVARTOT.compareTo((new IDVariant(0)), true)>0)
        {
          if (v_NUMVARTOT.equals((new IDVariant(1)), true))
          {
            if (MainFrm.FINANZIAMENT.booleanValue() && v_NUMERR.equals((new IDVariant(1)), true))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Elaborazione terminata. Inserita una Variazione. Non tutte le prenotazioni sono state chiuse a causa di incongruenza con i finanziamenti.", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_AVVISO); 
            }
            else
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Elaborazione terminata. Inserita una Variazione.", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_AVVISO); 
            }
          }
          else
          {
            IDVariant v_AVVISO1 = new IDVariant(0,IDVariant.STRING);
            v_AVVISO1 = (new IDVariant("Elaborazione terminata. Inserite n. ", IDVariant.STRING));
            if (MainFrm.FINANZIAMENT.booleanValue() && v_NUMERR.equals((new IDVariant(1)), true))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant(" Variazioni. Non tutte le prenotazioni sono state chiuse a causa di incongruenza con i finanziamenti.", IDVariant.STRING));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_AVVISO1, IDL.ToString(v_NUMVARTOT)), v_AVVISO)); 
            }
            else
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant(" Variazioni.", IDVariant.STRING));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_AVVISO1, IDL.ToString(v_NUMVARTOT)), v_AVVISO)); 
            }
          }
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Elaborazione Terminata. Nessuna Variazione Inserita.", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
        }
      }
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, 0).equals((new IDVariant("IMP")), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Elaborazione Terminata. Chiusi n. ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(v_NUMIMPACCVAR)), (new IDVariant(" "))), (new IDVariant("Impegni")))); 
      }
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, 0).equals((new IDVariant("ACC")), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Elaborazione Terminata. Chiusi n. ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(v_NUMIMPACCVAR)), (new IDVariant(" "))), (new IDVariant("Accertamenti")))); 
      }
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraAutomaticaPrenotazioni", "ChiusuraPrenotazioni", _e);
      return false;
    }
  }

  // **********************************************************************
  // Imp Acc Selezionati
  // Which data are you selecting?
  // **********************************************************************
  private void CHIUSUPRENOT_IMPACCSELEZ1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.QRY_IMPACCSELEZ1);
    IMDB.TblMoveFirst(IMDBDef6.TBL_IMPACCSELEZI, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_IMPACCSELEZI, 0))
    {
      IMDB.TblAddNew(IMDBDef17.QRY_IMPACCSELEZ1, 0);
      IMDB.TblLinkRow(IMDBDef17.QRY_IMPACCSELEZ1, 0, IMDBDef6.TBL_IMPACCSELEZI, 0);
      IMDB.TblLinkField(IMDBDef17.QRY_IMPACCSELEZ1, 0, 0, IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0);
      IMDB.TblLinkField(IMDBDef17.QRY_IMPACCSELEZ1, 1, 0, IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0);
      IMDB.TblLinkField(IMDBDef17.QRY_IMPACCSELEZ1, 2, 0, IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0);
      IMDB.TblLinkField(IMDBDef17.QRY_IMPACCSELEZ1, 3, 0, IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, 0);
      IMDB.TblLinkField(IMDBDef17.QRY_IMPACCSELEZ1, 4, 0, IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, 0);
      IMDB.TblLinkField(IMDBDef17.QRY_IMPACCSELEZ1, 5, 0, IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_IMPACCSELEZI, 0);
      if (IMDB.Eof(IMDBDef6.TBL_IMPACCSELEZI, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_IMPACCSELEZI, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.QRY_IMPACCSELEZ1, 0);
  }

  // **********************************************************************
  // Parametri Stampa
  // Primary record source for panel data
  // **********************************************************************
  private void CHIUAUTOPREN_PARAMESTAMP3() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMESTAMP3_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI335, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI335, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMESTAMP3_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMESTAMP3_RS, 0, IMDBDef6.TBL_PARAMETRI335, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMESTAMP3_RS, 0, 0, IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMESTAMP3_RS, 1, 0, IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMESTAMP3_RS, 2, 0, IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMESTAMP3_RS, 3, 0, IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_UNITA_PROPONENTE, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMESTAMP3_RS, 4, 0, IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_NUMERO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMESTAMP3_RS, 5, 0, IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ANNO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMESTAMP3_RS, 6, 0, IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMEDESCR, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMESTAMP3_RS, 7, 0, IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPVAR, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMESTAMP3_RS, 8, 0, IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMDATREG, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI335, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI335, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI335, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMESTAMP3_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_APRISCEGDELI)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRISCEGPROP)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFOPROPOSTA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_SEDEDELIBERA)
      {
        PFL_PARAMETRI_SEDEDELIBERA_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_UNITAPROPONE)
      {
        PFL_PARAMETRI_UNITAPROPONE_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "A17A2014-D646-47E8-B8B2-E031EF7331A3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "Provvedimento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 112, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.PANEL_FORM, 8, 7, 612, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0, 87);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, "FA067DC2-E4AE-4F50-8317-F92CFCB7C6F3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, "Delibera");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, "0D755F75-C83F-4B50-8365-C15EAFB2C38F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, "Sede Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, "925BC2D9-3C25-4221-BFAA-9E614D2611FF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "C18AA2FD-07D7-47C7-8EDA-498BB84619A2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "Numero Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, "9587CA75-8BC4-4ABF-94F4-87F170E0F633");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "49B78224-3C02-436C-8230-A2DD854C3127");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "Anno Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, "B75E8247-10B1-451D-A56D-8899AB329458");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, "42FCCADF-1C45-4834-B44C-95EC96D74E85");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, "8D821D45-FF83-4AE1-A999-94CC325349F4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, "Proposta");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "F8B878E0-5C40-4379-82DC-D3C9A1281EB6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "Unità Proponente");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, "C16746E4-0762-417D-B049-470D8A0738D1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "E8E218DF-4459-4670-A319-65BD5C613E65");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "Numero Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, "5A98DC28-A0FB-411A-B095-C07308BE73C8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "D7F07F06-1332-4823-8575-65582C6577CF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "Anno Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGPROP, "8493D728-08CD-4287-85FE-213E165C3F66");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGPROP, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGPROP, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, "5A98A0DE-2A97-44E6-B66B-0A07AF221E03");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "9A0C1F00-2BD4-41AB-8AE1-B097C0AF8416");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "65D2081B-7A41-453A-931D-3DCD087BD2BA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "Descrizione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, "228876A6-335B-4D24-B18C-C825618200E3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, "Tipo Variazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAREG, "A6315A74-AD37-4967-8A06-0D03E6FD99C0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAREG, "Data Reg.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAREG, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 116, 36, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 12, 32, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERLABEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERLABEL, -1, "", "DELIBERLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_LIST, "Sd. Del.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_FORM, 104, 32, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_FORM, "Sd. Del.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SEDEDELIBERA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SEDEDELIBERA, PPQRY_PARAMESTAMP3, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_LIST, 108, 28, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_FORM, 144, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTIDELIBE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, "Num. Delibera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 160, 32, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODELIBE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODELIBE, PPQRY_PARAMESTAMP3, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_LIST, 116, 36, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_FORM, 204, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRADELIBER, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, "Ann. Delib.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 220, 32, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, "Ann. Delib.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODELIBERA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODELIBERA, PPQRY_PARAMESTAMP3, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, MyGlb.PANEL_LIST, 232, 24, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, MyGlb.PANEL_FORM, 256, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRISCEGDELI, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRISCEGDELI, -1, "", "APRISCEGDELI", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 224, 16, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 276, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFODELIBERA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_LIST, 124, 44, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_FORM, 304, 32, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROPOSTLABEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROPOSTLABEL, -1, "", "PROPOSTLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, "Unità Proponente");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 364, 32, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, "Un. Prp.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UNITAPROPONE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UNITAPROPONE, PPQRY_PARAMESTAMP3, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 116, 36, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 472, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTIPROPOS, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, "Numero Proposta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 492, 32, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROPROPOS, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROPROPOS, PPQRY_PARAMESTAMP3, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 124, 44, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 532, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRAPROPOST, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Anno Proposta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 548, 32, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOPROPOSTA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOPROPOSTA, PPQRY_PARAMESTAMP3, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGPROP, MyGlb.PANEL_LIST, 240, 32, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGPROP, MyGlb.PANEL_FORM, 584, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRISCEGPROP, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRISCEGPROP, -1, "", "APRISCEGPROP", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, MyGlb.PANEL_LIST, 232, 24, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, MyGlb.PANEL_FORM, 600, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFOPROPOSTA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFOPROPOSTA, -1, "", "INFOPROPOSTA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 100, 168, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 536, 136, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORBUTTON, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 420, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 20, 64, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRIZIONE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRIZIONE, PPQRY_PARAMESTAMP3, "A.ROWNAMEDESCR", "ROWNAMEDESCR", 5, 250, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 4, 92, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOVARIAZIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOVARIAZIO, PPQRY_PARAMESTAMP3, "A.ROWNAMTIPVAR", "ROWNAMTIPVAR", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAREG, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAREG, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAREG, MyGlb.PANEL_FORM, 32, 120, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAREG, MyGlb.PANEL_FORM, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAREG, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAREG, PPQRY_PARAMESTAMP3, "A.ROWNAMDATREG", "ROWNAMDATREG", 6, 19, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPVAR~~) ");
    SQL.append("and   (~~TBL_PARAMETRI335.ROWNAMTIPCHI~~ <> 'ACC') ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  B.CODICE, ");
    SQL.append("  TO_CHAR ( B.CODICE ) || ' - ' || B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T56 B ");
    SQL.append("where (B.CODICE = ~~ROWNAMTIPVAR~~) ");
    SQL.append("and   (~~TBL_PARAMETRI335.ROWNAMTIPCHI~~ = 'ACC') ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T55, 0, SQL, PFL_PARAMETRI_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (~~TBL_PARAMETRI335.ROWNAMTIPCHI~~ <> 'ACC') ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  B.CODICE, ");
    SQL.append("  TO_CHAR ( B.CODICE ) || ' - ' || B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T56 B ");
    SQL.append("where (~~TBL_PARAMETRI335.ROWNAMTIPCHI~~ = 'ACC') ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T55, 1, SQL, PFL_PARAMETRI_TIPOVARIAZIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T55, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMESTAMP3", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMESTAMP3, IMDBDef17.PQRY_PARAMESTAMP3_RS, IMDBDef6.TBL_PARAMETRI335);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SEDEDELIBERA, IMDBDef6.FLD_PARAMETRI335_ROWNAMSEDDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODELIBE, IMDBDef6.FLD_PARAMETRI335_ROWNAMNUMDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODELIBERA, IMDBDef6.FLD_PARAMETRI335_ROWNAMANNDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UNITAPROPONE, IMDBDef6.FLD_PARAMETRI335_UNITA_PROPONENTE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROPROPOS, IMDBDef6.FLD_PARAMETRI335_NUMERO_PROPOSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOPROPOSTA, IMDBDef6.FLD_PARAMETRI335_ANNO_PROPOSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DESCRIZIONE, IMDBDef6.FLD_PARAMETRI335_ROWNAMEDESCR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOVARIAZIO, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPVAR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAREG, IMDBDef6.FLD_PARAMETRI335_ROWNAMDATREG);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI335");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
