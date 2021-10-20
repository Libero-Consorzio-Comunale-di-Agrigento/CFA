// **********************************************
// Totali Bozza
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TotaliBozza extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PANNELLO_SOLOAPPROVAT = 0;

  private static int PPQRY_PANNELLO1 = 0;


  IDPanel PAN_PANNELLO;
  private static int PFL_TOTALIPROPOS_ENTRATE = 0;
  private static int PFL_TOTALIPROPOS_SPESE = 1;
  private static int PFL_TOTALIPROPOS_008 = 2;
  private static int PFL_TOTALIPROPOS_009 = 3;
  private static int PFL_TOTALIPROPOS_2010 = 4;
  private static int PFL_TOTALIPROPOS_0081 = 5;
  private static int PFL_TOTALIPROPOS_0091 = 6;
  private static int PFL_TOTALIPROPOS_0101 = 7;
  private static int PFL_TOTALIPROPOS_LABEL = 8;
  private static int PFL_TOTALIPROPOS_VARIAZPOSIT1 = 9;
  private static int PFL_TOTALIPROPOS_VAREPOSITIV2 = 10;
  private static int PFL_TOTALIPROPOS_VAREPOSITIV3 = 11;
  private static int PFL_TOTALIPROPOS_VARIAZNEGAT1 = 12;
  private static int PFL_TOTALIPROPOS_VARENEGATIV2 = 13;
  private static int PFL_TOTALIPROPOS_VARENEGATIV3 = 14;
  private static int PFL_TOTALIPROPOS_TOT4 = 15;
  private static int PFL_TOTALIPROPOS_TOT5 = 16;
  private static int PFL_TOTALIPROPOS_TOT6 = 17;
  private static int PFL_TOTALIPROPOS_VARIAZPOSITI = 18;
  private static int PFL_TOTALIPROPOS_VARSPOSITIV2 = 19;
  private static int PFL_TOTALIPROPOS_VARSPOSITIV3 = 20;
  private static int PFL_TOTALIPROPOS_VARIAZNEGATI = 21;
  private static int PFL_TOTALIPROPOS_VARSNEGATIV2 = 22;
  private static int PFL_TOTALIPROPOS_VARSNEGATIV3 = 23;
  private static int PFL_TOTALIPROPOS_TOTALESCRITT = 24;
  private static int PFL_TOTALIPROPOS_TOTALESCRIT1 = 25;
  private static int PFL_TOTALIPROPOS_TOT1 = 26;
  private static int PFL_TOTALIPROPOS_TOT2 = 27;
  private static int PFL_TOTALIPROPOS_TOT3 = 28;

  private static int PPQRY_POLTOTPROPO2 = 0;


  IDPanel PAN_TOTALIPROPOS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR64(IMDB);
    Init_TBL_PANNELLO3(IMDB);
    //
    //
    Init_PQRY_POLTOTPROPO2(IMDB);
    Init_PQRY_PANNELLO1(IMDB);
    Init_PQRY_PANNELLO1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR64(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR64, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR64, "TBL_PAR64");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR64,IMDBDef3.FLD_PAR64_ROWNAMBOVAID, "ROWNAMBOVAID");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR64,IMDBDef3.FLD_PAR64_ROWNAMBOVAID,1,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR64, 0);
  }

  private static void Init_TBL_PANNELLO3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PANNELLO3, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PANNELLO3, "TBL_PANNELLO3");
    IMDB.set_FldCode(IMDBDef3.TBL_PANNELLO3,IMDBDef3.FLD_PANNELLO3_ROWNAMSOLAPP, "ROWNAMSOLAPP");
    IMDB.SetFldParams(IMDBDef3.TBL_PANNELLO3,IMDBDef3.FLD_PANNELLO3_ROWNAMSOLAPP,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PANNELLO3, 0);
  }

  private static void Init_PQRY_POLTOTPROPO2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLTOTPROPO2, 18);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLTOTPROPO2, "PQRY_POLTOTPROPO2");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARINEGA, "RECOVARINEGA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARINEGA,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARIPOSI, "RECOVARIPOSI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARIPOSI,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARINEG1, "RECOVARINEG1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARINEG1,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARIPOS1, "RECOVARIPOS1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARIPOS1,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARENEG2, "RECOVARENEG2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARENEG2,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVAREPOS2, "RECOVAREPOS2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVAREPOS2,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARSNEG2, "RECOVARSNEG2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARSNEG2,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARSPOS2, "RECOVARSPOS2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARSPOS2,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARENEG3, "RECOVARENEG3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARENEG3,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVAREPOS3, "RECOVAREPOS3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVAREPOS3,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARSNEG3, "RECOVARSNEG3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARSNEG3,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARSPOS3, "RECOVARSPOS3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECOVARSPOS3,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECORDTOT1, "RECORDTOT1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECORDTOT1,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECORDTOT2, "RECORDTOT2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECORDTOT2,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECORDTOT3, "RECORDTOT3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECORDTOT3,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECORDTOT4, "RECORDTOT4");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECORDTOT4,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECORDTOT5, "RECORDTOT5");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECORDTOT5,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECORDTOT6, "RECORDTOT6");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLTOTPROPO2,IMDBDef12.PQSL_POLTOTPROPO2_RECORDTOT6,3,28,6);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLTOTPROPO2, 0);
  }

  private static void Init_PQRY_PANNELLO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PANNELLO1, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PANNELLO1, "PQRY_PANNELLO1");
    IMDB.set_FldCode(IMDBDef12.PQRY_PANNELLO1,IMDBDef12.PQSL_PANNELLO1_ROWNAMSOLAPP, "ROWNAMSOLAPP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANNELLO1,IMDBDef12.PQSL_PANNELLO1_ROWNAMSOLAPP,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PANNELLO1, 0);
  }

  private static void Init_PQRY_PANNELLO1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PANNELLO1_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PANNELLO1_RS, "PQRY_PANNELLO1_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PANNELLO1_RS,IMDBDef12.PQSL_PANNELLO1_ROWNAMSOLAPP, "ROWNAMSOLAPP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANNELLO1_RS,IMDBDef12.PQSL_PANNELLO1_ROWNAMSOLAPP,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TotaliBozza(MyWebEntryPoint w, IMDBObj imdb)
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
  public TotaliBozza()
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
    FormIdx = MyGlb.FRM_TOTALIBOZZA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "89421B8C-5743-42E2-8B5C-035A3F258CB5";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 512;
    DesignHeight = 362;
    set_Caption(new IDVariant("Totali Bozza"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 512;
    Frames[1].Height = 336;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.166667;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 512;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pannello";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    PAN_PANNELLO = new IDPanel(w, this, 2, "PAN_PANNELLO");
    Frames[2].Content = PAN_PANNELLO;
    PAN_PANNELLO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PANNELLO.VS = MainFrm.VisualStyleList;
    PAN_PANNELLO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 512-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AA2AEBD5-7808-4C6B-96E9-F3237C9401D0");
    PAN_PANNELLO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 40, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PANNELLO.InitStatus = 2;
    PAN_PANNELLO_Init();
    PAN_PANNELLO_InitFields();
    PAN_PANNELLO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 512;
    Frames[3].Height = 280;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Totali Proposte";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 280;
    PAN_TOTALIPROPOS = new IDPanel(w, this, 3, "PAN_TOTALIPROPOS");
    Frames[3].Content = PAN_TOTALIPROPOS;
    PAN_TOTALIPROPOS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TOTALIPROPOS.VS = MainFrm.VisualStyleList;
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 512-MyGlb.PAN_OFFS_X, 280-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4290AD1E-9DEF-4935-A22B-2F19DA16CC2B");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2664, 184, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TOTALIPROPOS.InitStatus = 2;
    PAN_TOTALIPROPOS_Init();
    PAN_TOTALIPROPOS_InitFields();
    PAN_TOTALIPROPOS_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PANNELLO3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        TOTALIBOZZA_PANNELLO1();
      }
      PAN_TOTALIPROPOS.UpdatePanel(MainFrm);
      PAN_PANNELLO.UpdatePanel(MainFrm);
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
    return (obj instanceof TotaliBozza);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TotaliBozza.class.getName() : (Glb.ClassWithPackage(TotaliBozza.class) ? TotaliBozza.class.getName().substring(TotaliBozza.class.getPackage().getName().length() + 1) : TotaliBozza.class.getName()));
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
    IDVariant v_DESC = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_TOTALIPROPOS.set_FieldText(PFL_TOTALIPROPOS_008, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).stringValue());
      PAN_TOTALIPROPOS.set_FieldText(PFL_TOTALIPROPOS_0081, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).stringValue());
      PAN_TOTALIPROPOS.set_FieldText(PFL_TOTALIPROPOS_009, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)))).stringValue());
      PAN_TOTALIPROPOS.set_FieldText(PFL_TOTALIPROPOS_0091, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)))).stringValue());
      PAN_TOTALIPROPOS.set_FieldText(PFL_TOTALIPROPOS_2010, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2)))).stringValue());
      PAN_TOTALIPROPOS.set_FieldText(PFL_TOTALIPROPOS_0101, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2)))).stringValue());
      PAN_TOTALIPROPOS.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef3.TBL_PANNELLO3, IMDBDef3.FLD_PANNELLO3_ROWNAMSOLAPP, 0, (new IDVariant("NO")));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as POLBOZVARDES ");
      SQL.append("from ");
      SQL.append("  POL_BOZZE_VARIAZIONE A ");
      SQL.append("where (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PAR64, IMDBDef3.FLD_PAR64_ROWNAMBOVAID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESC = QV.Get("POLBOZVARDES", IDVariant.STRING) ;
      }
      QV.Close();
      PAN_TOTALIPROPOS.set_FieldText(PFL_TOTALIPROPOS_LABEL, new IDVariant(v_DESC).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TotaliBozza", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Pannello
  // Primary record source for panel data
  // **********************************************************************
  private void TOTALIBOZZA_PANNELLO1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PANNELLO1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PANNELLO3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PANNELLO3, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PANNELLO1_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PANNELLO1_RS, 0, IMDBDef3.TBL_PANNELLO3, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PANNELLO1_RS, 0, 0, IMDBDef3.TBL_PANNELLO3, IMDBDef3.FLD_PANNELLO3_ROWNAMSOLAPP, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PANNELLO3, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PANNELLO3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PANNELLO3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PANNELLO1_RS, 0);
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
  private void PAN_PANNELLO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PANNELLO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PANNELLO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PANNELLO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PANNELLO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PANNELLO);
    // Stub
  }

  private void PAN_PANNELLO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PANNELLO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PANNELLO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PANNELLO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_TOTALIPROPOS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TOTALIPROPOS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TOTALIPROPOS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TOTALIPROPOS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TOTALIPROPOS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_TOTALIPROPOS);
    // Stub
  }

  private void PAN_TOTALIPROPOS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TOTALIPROPOS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TOTALIPROPOS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TOTALIPROPOS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TOTALIPROPOS_Init()
  {

    PAN_TOTALIPROPOS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TOTALIPROPOS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TOTALIPROPOS.SetSize(MyGlb.OBJ_FIELD, 29);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_ENTRATE, "81460937-9600-4506-B1EF-46FD18FD250F");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_ENTRATE, "Entrate");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_ENTRATE, MyGlb.VIS_VUOTOGRASSET);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_ENTRATE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_SPESE, "58832E8C-524D-40F2-9089-F076D164AC6E");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_SPESE, "Spese");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_SPESE, MyGlb.VIS_VUOTOGRASSET);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_SPESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_008, "56324E33-DF7F-48BE-BECC-71B1669956AF");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_008, "2008");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_008, MyGlb.VIS_VUOTOGRASSET);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_008, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_009, "E395CDCA-6D4C-4426-8701-79FED00FD536");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_009, "2009");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_009, MyGlb.VIS_VUOTOGRASSET);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_009, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_2010, "037E6810-D33D-466A-9D59-4059B47F675E");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_2010, "2010");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_2010, MyGlb.VIS_VUOTOGRASSET);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_2010, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0081, "0AD25E98-A79B-4C6D-976A-40E427AEDA8B");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0081, "2008");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0081, MyGlb.VIS_VUOTOGRASSET);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0081, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0091, "C3DD4B40-BA51-4212-854C-1C803E945331");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0091, "2009");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0091, MyGlb.VIS_VUOTOGRASSET);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0091, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0101, "E6A9E56B-D7BC-4B90-B9D7-E6B4D7FF4619");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0101, "2010");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0101, MyGlb.VIS_VUOTOGRASSET);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0101, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_LABEL, "1B059350-C42B-4ED4-8049-61D5F88173B1");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_LABEL, "");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_LABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSIT1, "450F33D9-33E5-4BF3-8FF2-CF14958D07E2");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSIT1, "Variazioni Positive");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSIT1, "");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSIT1, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSIT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV2, "589B4C68-350E-4C75-A129-1821DBF3D7F0");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV2, "Var E Positive 2");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV2, "");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV2, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV3, "03280AB0-887F-4CC4-969B-42C3131F01CE");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV3, "Var E Positive 3");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV3, "");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV3, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGAT1, "C332C4C6-CB55-4D45-A10C-ECBF6F9F2008");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGAT1, "Variazioni Negative");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGAT1, "");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGAT1, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGAT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV2, "9A2D31A9-95A8-4A49-8F0D-7A32CE5FEB00");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV2, "Var E Negative 2");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV2, "");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV2, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV3, "F793583F-559C-4BF6-B393-674C0BA74F99");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV3, "Var E Negative 3");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV3, "");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV3, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT4, "F7ADAF73-832D-497A-AEFF-75FA77D967DE");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT4, "Tot 4");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT4, "Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 1 * If Equal (POL PROPOSTE VAR DETT E S, S, ZERO, If Equal (Sign (POL PROPOSTE VAR DETT IMPORTO 1), ONE, ONE, ZERO))), ZERO) + Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 1 * If Equal (POL PROPOSTE VAR DETT E S, S, ZERO, If Equal (Sign (POL PROPOSTE VAR DETT IMPORTO 1), -1, ONE, ZERO))), ZERO)");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT4, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT5, "B0ED5A85-3438-484E-9131-04DC83FB004D");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT5, "Tot 5");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT5, "Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 2 * If Equal (POL PROPOSTE VAR DETT E S, S, ZERO, If Equal (Sign (POL PROPOSTE VAR DETT IMPORTO 2), ONE, ONE, ZERO))), ZERO) + Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 2 * If Equal (POL PROPOSTE VAR DETT E S, S, ZERO, If Equal (Sign (POL PROPOSTE VAR DETT IMPORTO 2), -1, ONE, ZERO))), ZERO)");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT5, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT6, "E1E953BE-C141-4BFD-9816-6AA47FE5B63D");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT6, "Tot 6");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT6, "Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 3 * If Equal (POL PROPOSTE VAR DETT E S, S, ZERO, If Equal (Sign (POL PROPOSTE VAR DETT IMPORTO 3), ONE, ONE, ZERO))), ZERO) + Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 3 * If Equal (POL PROPOSTE VAR DETT E S, S, ZERO, If Equal (Sign (POL PROPOSTE VAR DETT IMPORTO 3), -1, ONE, ZERO))), ZERO)");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT6, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSITI, "42D5613C-DACF-4A53-94D5-AA372A860EF9");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSITI, "Variazioni Positive  ");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSITI, "");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSITI, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSITI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV2, "2FF0DDF0-0B27-4841-8A8A-FE227EA51223");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV2, "Var S Positive 2");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV2, "");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV2, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV3, "518951F6-000C-4B5F-9F57-DAEEA45771D8");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV3, "Var S Positive 3");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV3, "");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV3, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGATI, "B2970EFE-078B-4C4E-A02E-E085E5FCDF2F");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGATI, "Variazioni Negative ");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGATI, "");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGATI, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV2, "D68B6AD7-63B6-4BFB-966F-A6A5CC59AA54");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV2, "Var S Negative 2");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV2, "");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV2, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV3, "7E2D6155-CE5F-4C48-8598-48E1756D2EB7");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV3, "Var S Negative 3");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV3, "");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV3, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRITT, "27B0139F-3823-4483-B680-8FB2566C4113");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRITT, "Totale");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRITT, MyGlb.VIS_VUOTONORMALE);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRITT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRIT1, "CE2B9386-6354-462F-BF3C-CD6376C650D9");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRIT1, "Totale");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRIT1, MyGlb.VIS_VUOTONORMALE);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRIT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT1, "66964AA5-1836-42DB-A95E-DBA588B8F4E3");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT1, "Tot1");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT1, "");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT1, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT2, "C05FC6E3-924A-4237-A68F-0245D72D8821");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT2, "Tot 2");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT2, "Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 2 * If Equal (POL PROPOSTE VAR DETT E S, E, ZERO, If Equal (Sign (POL PROPOSTE VAR DETT IMPORTO 2), ONE, ONE, ZERO))), ZERO) + Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 2 * If Equal (POL PROPOSTE VAR DETT E S, E, ZERO, If Equal (Sign (POL PROPOSTE VAR DETT IMPORTO 2), -1, ONE, ZERO))), ZERO)");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT2, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT3, "421BE6CF-B90F-4F71-981A-20A3BE8D9D11");
    PAN_TOTALIPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT3, "Tot 3");
    PAN_TOTALIPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT3, "Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 3 * If Equal (POL PROPOSTE VAR DETT E S, E, ZERO, If Equal (Sign (POL PROPOSTE VAR DETT IMPORTO 3), ONE, ONE, ZERO))), ZERO) + Null Value (Sum (POL PROPOSTE VAR DETT IMPORTO 3 * If Equal (POL PROPOSTE VAR DETT E S, E, ZERO, If Equal (Sign (POL PROPOSTE VAR DETT IMPORTO 3), -1, ONE, ZERO))), ZERO)");
    PAN_TOTALIPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT3, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTALIPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TOTALIPROPOS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_ENTRATE, MyGlb.PANEL_LIST, 12, 12, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_ENTRATE, MyGlb.PANEL_LIST, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_ENTRATE, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_ENTRATE, MyGlb.PANEL_FORM, 36, 52, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_ENTRATE, MyGlb.PANEL_FORM, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_ENTRATE, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_ENTRATE, -1, -1);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_ENTRATE, -1, "", "ENTRATE", 0, 0, 0, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_SPESE, MyGlb.PANEL_LIST, 20, 20, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_SPESE, MyGlb.PANEL_LIST, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_SPESE, MyGlb.PANEL_FORM, 36, 164, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_SPESE, MyGlb.PANEL_FORM, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_SPESE, -1, -1);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_SPESE, -1, "", "SPESE", 0, 0, 0, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_008, MyGlb.PANEL_LIST, 20, 20, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_008, MyGlb.PANEL_LIST, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_008, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_008, MyGlb.PANEL_FORM, 164, 52, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_008, MyGlb.PANEL_FORM, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_008, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_008, -1, -1);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_008, -1, "", "008", 0, 0, 0, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_009, MyGlb.PANEL_LIST, 28, 28, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_009, MyGlb.PANEL_LIST, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_009, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_009, MyGlb.PANEL_FORM, 280, 52, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_009, MyGlb.PANEL_FORM, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_009, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_009, -1, -1);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_009, -1, "", "009", 0, 0, 0, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_2010, MyGlb.PANEL_LIST, 36, 36, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_2010, MyGlb.PANEL_LIST, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_2010, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_2010, MyGlb.PANEL_FORM, 400, 52, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_2010, MyGlb.PANEL_FORM, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_2010, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_2010, -1, -1);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_2010, -1, "", "2010", 0, 0, 0, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0081, MyGlb.PANEL_LIST, 28, 28, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0081, MyGlb.PANEL_LIST, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0081, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0081, MyGlb.PANEL_FORM, 164, 164, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0081, MyGlb.PANEL_FORM, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0081, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_0081, -1, -1);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_0081, -1, "", "0081", 0, 0, 0, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0091, MyGlb.PANEL_LIST, 36, 36, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0091, MyGlb.PANEL_LIST, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0091, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0091, MyGlb.PANEL_FORM, 280, 164, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0091, MyGlb.PANEL_FORM, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0091, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_0091, -1, -1);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_0091, -1, "", "0091", 0, 0, 0, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0101, MyGlb.PANEL_LIST, 44, 44, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0101, MyGlb.PANEL_LIST, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0101, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0101, MyGlb.PANEL_FORM, 400, 164, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0101, MyGlb.PANEL_FORM, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_0101, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_0101, -1, -1);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_0101, -1, "", "0101", 0, 0, 0, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_LABEL, MyGlb.PANEL_LIST, 8, 8, 476, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_LABEL, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_LABEL, MyGlb.PANEL_FORM, 8, 8, 476, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_LABEL, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_LABEL, -1, -1);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSIT1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSIT1, MyGlb.PANEL_LIST, 84);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSIT1, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSIT1, MyGlb.PANEL_LIST, "Variazioni Positive");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSIT1, MyGlb.PANEL_FORM, 20, 72, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSIT1, MyGlb.PANEL_FORM, 112);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSIT1, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSIT1, MyGlb.PANEL_FORM, "Variazioni Positive");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_VARIAZPOSIT1, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_VARIAZPOSIT1, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_VARIAZPOSIT1, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_1), 1, 1, 0))), 0)", "RECOVARIPOSI", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV2, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV2, MyGlb.PANEL_LIST, 84);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV2, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV2, MyGlb.PANEL_LIST, "Var E Positive 2");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV2, MyGlb.PANEL_FORM, 256, 72, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV2, MyGlb.PANEL_FORM, 84);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV2, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV2, MyGlb.PANEL_FORM, "Var E Posit. 2");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_VAREPOSITIV2, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_VAREPOSITIV2, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_VAREPOSITIV2, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_2), 1, 1, 0))), 0)", "RECOVAREPOS2", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV3, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV3, MyGlb.PANEL_LIST, 84);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV3, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV3, MyGlb.PANEL_LIST, "Var E Positive 3");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV3, MyGlb.PANEL_FORM, 372, 72, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV3, MyGlb.PANEL_FORM, 84);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV3, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VAREPOSITIV3, MyGlb.PANEL_FORM, "Var E Posit. 3");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_VAREPOSITIV3, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_VAREPOSITIV3, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_VAREPOSITIV3, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_3), 1, 1, 0))), 0)", "RECOVAREPOS3", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGAT1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGAT1, MyGlb.PANEL_LIST, 88);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGAT1, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGAT1, MyGlb.PANEL_LIST, "Variazioni Negative");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGAT1, MyGlb.PANEL_FORM, 12, 96, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGAT1, MyGlb.PANEL_FORM, 120);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGAT1, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGAT1, MyGlb.PANEL_FORM, "Variazioni Negative");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_VARIAZNEGAT1, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_VARIAZNEGAT1, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_VARIAZNEGAT1, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_1), -1, 1, 0))), 0)", "RECOVARINEGA", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV2, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV2, MyGlb.PANEL_LIST, 88);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV2, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV2, MyGlb.PANEL_LIST, "Var E Negative 2");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV2, MyGlb.PANEL_FORM, 256, 96, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV2, MyGlb.PANEL_FORM, 88);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV2, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV2, MyGlb.PANEL_FORM, "Var E Negat. 2");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_VARENEGATIV2, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_VARENEGATIV2, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_VARENEGATIV2, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_2), -1, 1, 0))), 0)", "RECOVARENEG2", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV3, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV3, MyGlb.PANEL_LIST, 88);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV3, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV3, MyGlb.PANEL_LIST, "Var E Negative 3");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV3, MyGlb.PANEL_FORM, 372, 96, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV3, MyGlb.PANEL_FORM, 88);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV3, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARENEGATIV3, MyGlb.PANEL_FORM, "Var E Negat. 3");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_VARENEGATIV3, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_VARENEGATIV3, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_VARENEGATIV3, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_3), -1, 1, 0))), 0)", "RECOVARENEG3", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT4, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT4, MyGlb.PANEL_LIST, 36);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT4, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT4, MyGlb.PANEL_LIST, "Tot 4");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT4, MyGlb.PANEL_FORM, 136, 120, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT4, MyGlb.PANEL_FORM, 36);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT4, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT4, MyGlb.PANEL_FORM, "Tot 4");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_TOT4, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_TOT4, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_TOT4, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_1), 1, 1, 0))), 0) + NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_1), -1, 1, 0))), 0)", "RECORDTOT4", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT5, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT5, MyGlb.PANEL_LIST, 36);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT5, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT5, MyGlb.PANEL_LIST, "Tot 5");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT5, MyGlb.PANEL_FORM, 256, 120, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT5, MyGlb.PANEL_FORM, 36);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT5, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT5, MyGlb.PANEL_FORM, "Tot 5");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_TOT5, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_TOT5, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_TOT5, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_2), 1, 1, 0))), 0) + NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_2), -1, 1, 0))), 0)", "RECORDTOT5", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT6, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT6, MyGlb.PANEL_LIST, 36);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT6, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT6, MyGlb.PANEL_LIST, "Tot 6");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT6, MyGlb.PANEL_FORM, 372, 120, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT6, MyGlb.PANEL_FORM, 36);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT6, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT6, MyGlb.PANEL_FORM, "Tot 6");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_TOT6, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_TOT6, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_TOT6, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_3), 1, 1, 0))), 0) + NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_3), -1, 1, 0))), 0)", "RECORDTOT6", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSITI, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSITI, MyGlb.PANEL_LIST, 84);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSITI, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSITI, MyGlb.PANEL_LIST, "Variazioni Positive  ");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSITI, MyGlb.PANEL_FORM, 20, 184, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSITI, MyGlb.PANEL_FORM, 112);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSITI, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZPOSITI, MyGlb.PANEL_FORM, "Variazioni Positive  ");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_VARIAZPOSITI, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_VARIAZPOSITI, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_VARIAZPOSITI, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_1), 1, 1, 0))), 0)", "RECOVARIPOS1", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV2, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV2, MyGlb.PANEL_LIST, 84);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV2, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV2, MyGlb.PANEL_LIST, "Var S Positive 2");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV2, MyGlb.PANEL_FORM, 256, 184, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV2, MyGlb.PANEL_FORM, 84);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV2, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV2, MyGlb.PANEL_FORM, "Var S Posit. 2");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_VARSPOSITIV2, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_VARSPOSITIV2, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_VARSPOSITIV2, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_2), 1, 1, 0))), 0)", "RECOVARSPOS2", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV3, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV3, MyGlb.PANEL_LIST, 84);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV3, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV3, MyGlb.PANEL_LIST, "Var S Positive 3");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV3, MyGlb.PANEL_FORM, 372, 184, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV3, MyGlb.PANEL_FORM, 84);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV3, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSPOSITIV3, MyGlb.PANEL_FORM, "Var S Posit. 3");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_VARSPOSITIV3, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_VARSPOSITIV3, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_VARSPOSITIV3, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_3), 1, 1, 0))), 0)", "RECOVARSPOS3", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGATI, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGATI, MyGlb.PANEL_LIST, 88);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGATI, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGATI, MyGlb.PANEL_LIST, "Variazioni Negative ");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGATI, MyGlb.PANEL_FORM, 16, 208, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGATI, MyGlb.PANEL_FORM, 116);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGATI, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARIAZNEGATI, MyGlb.PANEL_FORM, "Variazioni Negative ");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_VARIAZNEGATI, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_VARIAZNEGATI, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_VARIAZNEGATI, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_1), -1, 1, 0))), 0)", "RECOVARINEG1", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV2, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV2, MyGlb.PANEL_LIST, 88);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV2, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV2, MyGlb.PANEL_LIST, "Var S Negative 2");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV2, MyGlb.PANEL_FORM, 256, 208, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV2, MyGlb.PANEL_FORM, 88);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV2, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV2, MyGlb.PANEL_FORM, "Var S Negat. 2");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_VARSNEGATIV2, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_VARSNEGATIV2, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_VARSNEGATIV2, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_2), -1, 1, 0))), 0)", "RECOVARSNEG2", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV3, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV3, MyGlb.PANEL_LIST, 88);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV3, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV3, MyGlb.PANEL_LIST, "Var S Negative 3");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV3, MyGlb.PANEL_FORM, 372, 208, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV3, MyGlb.PANEL_FORM, 88);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV3, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_VARSNEGATIV3, MyGlb.PANEL_FORM, "Var S Negat. 3");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_VARSNEGATIV3, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_VARSNEGATIV3, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_VARSNEGATIV3, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_3), -1, 1, 0))), 0)", "RECOVARSNEG3", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRITT, MyGlb.PANEL_LIST, 48, 152, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRITT, MyGlb.PANEL_LIST, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRITT, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRITT, MyGlb.PANEL_FORM, 80, 120, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRITT, MyGlb.PANEL_FORM, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRITT, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_TOTALESCRITT, -1, -1);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_TOTALESCRITT, -1, "", "TOTALESCRITT", 0, 0, 0, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRIT1, MyGlb.PANEL_LIST, 56, 160, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRIT1, MyGlb.PANEL_LIST, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRIT1, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRIT1, MyGlb.PANEL_FORM, 80, 232, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRIT1, MyGlb.PANEL_FORM, 0);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOTALESCRIT1, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_TOTALESCRIT1, -1, -1);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_TOTALESCRIT1, -1, "", "TOTALESCRIT1", 0, 0, 0, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT1, MyGlb.PANEL_LIST, 32);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT1, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT1, MyGlb.PANEL_LIST, "Tot1");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT1, MyGlb.PANEL_FORM, 136, 232, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT1, MyGlb.PANEL_FORM, 32);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT1, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT1, MyGlb.PANEL_FORM, "Tot1");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_TOT1, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_TOT1, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_TOT1, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_1), 1, 1, 0))), 0) + NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_1), -1, 1, 0))), 0)", "RECORDTOT1", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT2, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT2, MyGlb.PANEL_LIST, 36);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT2, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT2, MyGlb.PANEL_LIST, "Tot 2");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT2, MyGlb.PANEL_FORM, 256, 232, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT2, MyGlb.PANEL_FORM, 36);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT2, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT2, MyGlb.PANEL_FORM, "Tot 2");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_TOT2, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_TOT2, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_TOT2, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_2), 1, 1, 0))), 0) + NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_2), -1, 1, 0))), 0)", "RECORDTOT2", 3, 28, 6, -13997);
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT3, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT3, MyGlb.PANEL_LIST, 36);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT3, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT3, MyGlb.PANEL_LIST, "Tot 3");
    PAN_TOTALIPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT3, MyGlb.PANEL_FORM, 372, 232, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT3, MyGlb.PANEL_FORM, 36);
    PAN_TOTALIPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT3, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIPROPOS_TOT3, MyGlb.PANEL_FORM, "Tot 3");
    PAN_TOTALIPROPOS.SetFieldPage(PFL_TOTALIPROPOS_TOT3, -1, -1);
    PAN_TOTALIPROPOS.SetFieldUnbound(PFL_TOTALIPROPOS_TOT3, true);
    PAN_TOTALIPROPOS.SetFieldPanel(PFL_TOTALIPROPOS_TOT3, PPQRY_POLTOTPROPO2, "NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_3), 1, 1, 0))), 0) + NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_3), -1, 1, 0))), 0)", "RECORDTOT3", 3, 28, 6, -13997);
  }

  private void PAN_TOTALIPROPOS_InitQueries()
  {
    StringBuffer SQL;

    PAN_TOTALIPROPOS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TOTALIPROPOS.SetIMDB(IMDB, "PQRY_POLTOTPROPO2", true);
    PAN_TOTALIPROPOS.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_1), -1, 1, 0))), 0) as RECOVARINEGA, ");
    SQL.append("  NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_1), 1, 1, 0))), 0) as RECOVARIPOSI, ");
    SQL.append("  NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_1), -1, 1, 0))), 0) as RECOVARINEG1, ");
    SQL.append("  NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_1), 1, 1, 0))), 0) as RECOVARIPOS1, ");
    SQL.append("  NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_2), -1, 1, 0))), 0) as RECOVARENEG2, ");
    SQL.append("  NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_2), 1, 1, 0))), 0) as RECOVAREPOS2, ");
    SQL.append("  NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_2), -1, 1, 0))), 0) as RECOVARSNEG2, ");
    SQL.append("  NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_2), 1, 1, 0))), 0) as RECOVARSPOS2, ");
    SQL.append("  NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_3), -1, 1, 0))), 0) as RECOVARENEG3, ");
    SQL.append("  NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_3), 1, 1, 0))), 0) as RECOVAREPOS3, ");
    SQL.append("  NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_3), -1, 1, 0))), 0) as RECOVARSNEG3, ");
    SQL.append("  NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_3), 1, 1, 0))), 0) as RECOVARSPOS3, ");
    SQL.append("  NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_1), 1, 1, 0))), 0) + NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_1), -1, 1, 0))), 0) as RECORDTOT1, ");
    SQL.append("  NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_2), 1, 1, 0))), 0) + NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_2), -1, 1, 0))), 0) as RECORDTOT2, ");
    SQL.append("  NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_3), 1, 1, 0))), 0) + NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'E', 0, DECODE(SIGN(A.IMPORTO_3), -1, 1, 0))), 0) as RECORDTOT3, ");
    SQL.append("  NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_1), 1, 1, 0))), 0) + NVL(SUM(A.IMPORTO_1 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_1), -1, 1, 0))), 0) as RECORDTOT4, ");
    SQL.append("  NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_2), 1, 1, 0))), 0) + NVL(SUM(A.IMPORTO_2 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_2), -1, 1, 0))), 0) as RECORDTOT5, ");
    SQL.append("  NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_3), 1, 1, 0))), 0) + NVL(SUM(A.IMPORTO_3 * DECODE(A.E_S, 'S', 0, DECODE(SIGN(A.IMPORTO_3), -1, 1, 0))), 0) as RECORDTOT6 ");
    PAN_TOTALIPROPOS.SetQuery(PPQRY_POLTOTPROPO2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT A ");
    PAN_TOTALIPROPOS.SetQuery(PPQRY_POLTOTPROPO2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.BOZZA_VARIAZIONE_ID = ~~TBL_PAR64.ROWNAMBOVAID~~) ");
    SQL.append("and   (A.COD_REC = 2) ");
    SQL.append("and   (NVL(A.STATO, 'B') <> 'N') ");
    SQL.append("and   (NVL(A.STATO, 'B') = DECODE(~~TBL_PANNELLO3.ROWNAMSOLAPP~~, 'SI', 'A', NVL(A.STATO, 'B'))) ");
    PAN_TOTALIPROPOS.SetQuery(PPQRY_POLTOTPROPO2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TOTALIPROPOS.SetQuery(PPQRY_POLTOTPROPO2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TOTALIPROPOS.SetQuery(PPQRY_POLTOTPROPO2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TOTALIPROPOS.SetQuery(PPQRY_POLTOTPROPO2, 5, SQL, -1, "");
    PAN_TOTALIPROPOS.SetQueryDB(PPQRY_POLTOTPROPO2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TOTALIPROPOS.SetMasterTable(0, "POL_PROPOSTE_VAR_DETT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TOTALIPROPOS.Status() == 2)
    {
      int oldListQBE = PAN_TOTALIPROPOS.iUseListQBE;
      PAN_TOTALIPROPOS.iUseListQBE = 0;
      PAN_TOTALIPROPOS.PanelCommand(Glb.PCM_SEARCH);
      PAN_TOTALIPROPOS.PanelCommand(Glb.PCM_FIND);
      PAN_TOTALIPROPOS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PANNELLO_Init()
  {

    PAN_PANNELLO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PANNELLO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PANNELLO.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PANNELLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, "9CE3B3D1-1251-4359-A0C8-AD601FE1BB78");
    PAN_PANNELLO.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, "Solo Approvate");
    PAN_PANNELLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, "");
    PAN_PANNELLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.VIS_CHECKSTYLE);
    PAN_PANNELLO.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PANNELLO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_LIST, 84);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_LIST, 1);
    PAN_PANNELLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_LIST, "Sl. Appr.");
    PAN_PANNELLO.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_FORM, 8, 12, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_FORM, 96);
    PAN_PANNELLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_FORM, 1);
    PAN_PANNELLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELLO_SOLOAPPROVAT, MyGlb.PANEL_FORM, "Solo Approvate");
    PAN_PANNELLO.SetFieldPage(PFL_PANNELLO_SOLOAPPROVAT, -1, -1);
    PAN_PANNELLO.SetFieldPanel(PFL_PANNELLO_SOLOAPPROVAT, PPQRY_PANNELLO1, "A.ROWNAMSOLAPP", "ROWNAMSOLAPP", 5, 2, 0, -13997);
    PAN_PANNELLO.SetValueListItem(PFL_PANNELLO_SOLOAPPROVAT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PANNELLO.SetValueListItem(PFL_PANNELLO_SOLOAPPROVAT, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PANNELLO_InitQueries()
  {
    StringBuffer SQL;

    PAN_PANNELLO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PANNELLO.SetIMDB(IMDB, "PQRY_PANNELLO1", true);
    PAN_PANNELLO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PANNELLO.SetQueryIMDB(PPQRY_PANNELLO1, IMDBDef12.PQRY_PANNELLO1_RS, IMDBDef3.TBL_PANNELLO3);
    JustLoaded = true;
    PAN_PANNELLO.SetFieldPrimaryIndex(PFL_PANNELLO_SOLOAPPROVAT, IMDBDef3.FLD_PANNELLO3_ROWNAMSOLAPP);
    PAN_PANNELLO.SetMasterTable(0, "PANNELLO3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PANNELLO.Status() == 2)
    {
      int oldListQBE = PAN_PANNELLO.iUseListQBE;
      PAN_PANNELLO.iUseListQBE = 0;
      PAN_PANNELLO.PanelCommand(Glb.PCM_SEARCH);
      PAN_PANNELLO.PanelCommand(Glb.PCM_FIND);
      PAN_PANNELLO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TOTALIPROPOS) PAN_TOTALIPROPOS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TOTALIPROPOS) PAN_TOTALIPROPOS_ValidateRow(Cancel);
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TOTALIPROPOS) PAN_TOTALIPROPOS_DynamicProperties();
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TOTALIPROPOS) PAN_TOTALIPROPOS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TOTALIPROPOS) PAN_TOTALIPROPOS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PANNELLO) PAN_PANNELLO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
