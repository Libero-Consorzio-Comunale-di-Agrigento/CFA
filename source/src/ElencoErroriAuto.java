// **********************************************
// Elenco Errori Auto
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoErroriAuto extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMERRORI_CAPTION = 0;
  private static int PFL_PARAMERRORI_FASE = 1;
  private static int PFL_PARAMERRORI_DATA = 2;

  private static int PPQRY_NEWTABLE54 = 0;


  IDPanel PAN_PARAMERRORI;
  private static int PFL_ELENCOANOMAL_ANOMALIA = 0;
  private static int PFL_ELENCOANOMAL_IDFLUSSOBT = 1;

  private static int PPQRY_WRKERRORI6 = 0;


  IDPanel PAN_ELENCOANOMAL;
  CIDREObj BUK_ERRORI;
  OBook BKW_ERRORI;
  //
  // Template Pages constants
  private static int BUK_ERRORI_MST_NEWTEMPLPAGE = 1;
  private static int BUK_ERRORI_RPTBOX_PAGEHEADER = 2;
  private static int BUK_ERRORI_RPTBOX_PAGEBODY = 3;

  //
  // Reports constants
  private static int BUK_ERRORI_RPT_NEWREPORT = 4;
  private static int BUK_ERRORI_SEC_REPORTHEADER = 5;
  private static int BUK_ERRORI_RPTBOX_TITOLOBOX = 6;
  private static int BUK_ERRORI_SPAN_ROWNAMECAPTI = 7;
  private static int BUK_ERRORI_SEC_PAGEHEADER = 8;
  private static int BUK_ERRORI_SEC_DETAIL = 9;
  private static int BUK_ERRORI_RPTBOX_ERRORE = 10;
  private static int BUK_ERRORI_SPAN_REWREREREEAE = 11;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE(IMDB);
    //
    //
    Init_PQRY_WRKERRORI2(IMDB);
    Init_PQRY_NEWTABLE54(IMDB);
    Init_PQRY_NEWTABLE54_RS(IMDB);
    Init_PQRY_WRKERRORI6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_NEWTABLE, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_NEWTABLE, "TBL_NEWTABLE");
    IMDB.set_FldCode(IMDBDef6.TBL_NEWTABLE,IMDBDef6.FLD_NEWTABLE_ROWNAMECAPTI, "ROWNAMECAPTI");
    IMDB.SetFldParams(IMDBDef6.TBL_NEWTABLE,IMDBDef6.FLD_NEWTABLE_ROWNAMECAPTI,5,45,0);
    IMDB.set_FldCode(IMDBDef6.TBL_NEWTABLE,IMDBDef6.FLD_NEWTABLE_ROWNAMEFASE, "ROWNAMEFASE");
    IMDB.SetFldParams(IMDBDef6.TBL_NEWTABLE,IMDBDef6.FLD_NEWTABLE_ROWNAMEFASE,5,10,0);
    IMDB.set_FldCode(IMDBDef6.TBL_NEWTABLE,IMDBDef6.FLD_NEWTABLE_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef6.TBL_NEWTABLE,IMDBDef6.FLD_NEWTABLE_ROWNAMEDATA,6,10,0);
    IMDB.TblAddNew(IMDBDef6.TBL_NEWTABLE, 0);
  }

  private static void Init_PQRY_WRKERRORI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_WRKERRORI2, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_WRKERRORI2, "PQRY_WRKERRORI2");
    IMDB.set_FldCode(IMDBDef15.PQRY_WRKERRORI2,IMDBDef15.PQSL_WRKERRORI2_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_WRKERRORI2,IMDBDef15.PQSL_WRKERRORI2_SESSIONE,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_WRKERRORI2,IMDBDef15.PQSL_WRKERRORI2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_WRKERRORI2,IMDBDef15.PQSL_WRKERRORI2_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_WRKERRORI2,IMDBDef15.PQSL_WRKERRORI2_ERRORE, "ERRORE");
    IMDB.SetFldParams(IMDBDef15.PQRY_WRKERRORI2,IMDBDef15.PQSL_WRKERRORI2_ERRORE,5,300,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_WRKERRORI2, 0);
  }

  private static void Init_PQRY_NEWTABLE54(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE54, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE54, "PQRY_NEWTABLE54");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE54,IMDBDef15.PQSL_NEWTABLE54_ROWNAMECAPTI, "ROWNAMECAPTI");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE54,IMDBDef15.PQSL_NEWTABLE54_ROWNAMECAPTI,5,45,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE54,IMDBDef15.PQSL_NEWTABLE54_ROWNAMEFASE, "ROWNAMEFASE");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE54,IMDBDef15.PQSL_NEWTABLE54_ROWNAMEFASE,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE54,IMDBDef15.PQSL_NEWTABLE54_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE54,IMDBDef15.PQSL_NEWTABLE54_ROWNAMEDATA,6,10,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE54, 0);
  }

  private static void Init_PQRY_NEWTABLE54_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE54_RS, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE54_RS, "PQRY_NEWTABLE54_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE54_RS,IMDBDef15.PQSL_NEWTABLE54_ROWNAMECAPTI, "ROWNAMECAPTI");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE54_RS,IMDBDef15.PQSL_NEWTABLE54_ROWNAMECAPTI,5,45,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE54_RS,IMDBDef15.PQSL_NEWTABLE54_ROWNAMEFASE, "ROWNAMEFASE");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE54_RS,IMDBDef15.PQSL_NEWTABLE54_ROWNAMEFASE,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE54_RS,IMDBDef15.PQSL_NEWTABLE54_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE54_RS,IMDBDef15.PQSL_NEWTABLE54_ROWNAMEDATA,6,10,0);
  }

  private static void Init_PQRY_WRKERRORI6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_WRKERRORI6, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_WRKERRORI6, "PQRY_WRKERRORI6");
    IMDB.set_FldCode(IMDBDef15.PQRY_WRKERRORI6,IMDBDef15.PQSL_WRKERRORI6_RECWRKERRPRO, "RECWRKERRPRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_WRKERRORI6,IMDBDef15.PQSL_WRKERRORI6_RECWRKERRPRO,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_WRKERRORI6,IMDBDef15.PQSL_WRKERRORI6_RECORDANOMAL, "RECORDANOMAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_WRKERRORI6,IMDBDef15.PQSL_WRKERRORI6_RECORDANOMAL,5,300,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_WRKERRORI6,IMDBDef15.PQSL_WRKERRORI6_RECOIDFLUSBT, "RECOIDFLUSBT");
    IMDB.SetFldParams(IMDBDef15.PQRY_WRKERRORI6,IMDBDef15.PQSL_WRKERRORI6_RECOIDFLUSBT,5,500,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_WRKERRORI6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoErroriAuto(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoErroriAuto()
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
    FormIdx = MyGlb.FRM_ELENERROAUTO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "336DEB0C-E96F-4D80-B83C-84628248F6B3";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 848;
    DesignHeight = 382;
    set_Caption(new IDVariant("Elenco Anomalie"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 848;
    Frames[1].Height = 356;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.11236;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 848;
    Frames[2].Height = 40;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param Errori";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 40;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMERRORI = new IDPanel(w, this, 2, "PAN_PARAMERRORI");
    Frames[2].Content = PAN_PARAMERRORI;
    PAN_PARAMERRORI.Lockable = false;
    PAN_PARAMERRORI.iLocked = false;
    PAN_PARAMERRORI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMERRORI.VS = MainFrm.VisualStyleList;
    PAN_PARAMERRORI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 848-MyGlb.PAN_OFFS_X, 40-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMERRORI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A767D826-D453-44B9-9907-3F303D665A97");
    PAN_PARAMERRORI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 552, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMERRORI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMERRORI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMERRORI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMERRORI.InitStatus = 2;
    PAN_PARAMERRORI_Init();
    PAN_PARAMERRORI_InitFields();
    PAN_PARAMERRORI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 848;
    Frames[3].Height = 316;
    Frames[3].Caption = "Elenco Anomalie";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 316;
    PAN_ELENCOANOMAL = new IDPanel(w, this, 3, "PAN_ELENCOANOMAL");
    Frames[3].Content = PAN_ELENCOANOMAL;
    PAN_ELENCOANOMAL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOANOMAL.VS = MainFrm.VisualStyleList;
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 848-MyGlb.PAN_OFFS_X, 316-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3368FB7E-A40C-4BAE-B880-07DD94D25CEA");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 784, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOANOMAL.InitStatus = 2;
    PAN_ELENCOANOMAL_Init();
    PAN_ELENCOANOMAL_InitFields();
    PAN_ELENCOANOMAL_InitQueries();
    BKW_ERRORI = new OBook(this);
    BUK_ERRORI = new CIDREObj(BKW_ERRORI);
    BKW_ERRORI.iGuid = "9BCFA507-241B-47C0-AFCD-D8D0E03753A3";
    BKW_ERRORI.Code = "BUK_ERRORI";
    BKW_ERRORI.BookObj = BUK_ERRORI;
    BKW_ERRORI.InitDefMasks();
    BUK_ERRORI.InitBook(1, 1245441, "Errori", IMDB, MainFrm.VisualStyleList);
    BUK_ERRORI.InitHTML();
    BUK_ERRORI.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ERRORI.Book.SetMainFrm(MainFrm);
    BUK_ERRORI.SetRTCGuid(0, "9BCFA507-241B-47C0-AFCD-D8D0E03753A3");
    BUK_ERRORI.SetObjCode(0, "ERRORI");
    BUK_ERRORI_MST_NEWTEMPLPAGE_Init();
    BUK_ERRORI_RPT_NEWREPORT_Init();
    BUK_ERRORI_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_STAMPA5+BaseCmdLinIdx)
      {
        LanciaStampa();
        break fine;
      }
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
      if (IMDB.TblModified(IMDBDef6.TBL_NEWTABLE, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENERROAUTO_NEWTABLE54();
      }
      PAN_PARAMERRORI.UpdatePanel(MainFrm);
      PAN_ELENCOANOMAL.UpdatePanel(MainFrm);
      // BUK_ERRORI.UpdateBook();
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
    if (Code.equals("BUK_ERRORI")) return BUK_ERRORI;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ElencoErroriAuto);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoErroriAuto.class.getName() : (Glb.ClassWithPackage(ElencoErroriAuto.class) ? ElencoErroriAuto.class.getName().substring(ElencoErroriAuto.class.getPackage().getName().length() + 1) : ElencoErroriAuto.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (IDL.IsNull(IMDB.Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMEDATA, 0)))
      {
        IMDB.set_Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMEDATA, 0, IDL.Today());
        PAN_ELENCOANOMAL.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ELENCOANOMAL.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoErroriAuto", "Load", _e);
    }
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
      UNLOAD_NEWTABLEDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoErroriAuto", "Unload", _e);
    }
  }

  // **********************************************************************
  // New Table: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_NEWTABLEDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMECAPTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMEFASE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMEDATA, 0, new IDVariant());
  }

  // **********************************************************************
  // Lancia Stampa
  // **********************************************************************
  public int LanciaStampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Lancia Stampa Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE54, IMDBDef15.PQSL_NEWTABLE54_ROWNAMEFASE, 0)))
      {
        IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
        v_S1 = (new IDVariant("Scegliere la fase"));
        MainFrm.set_AlertMessage(v_S1); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE54, IMDBDef15.PQSL_NEWTABLE54_ROWNAMEDATA, 0)))
      {
        IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
        v_S1 = (new IDVariant("Scegliere una data"));
        MainFrm.set_AlertMessage(v_S1); 
        return 0;
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Elenco anomalie import file "));
      IMDB.set_Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMECAPTI, 0, IDL.Add(IDL.Add(IDL.Add(S, (IMDB.Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMEFASE, 0).equals((new IDVariant("TUTTI")))? new IDVariant("Tutti") : IMDB.Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMEFASE, 0).equals((new IDVariant("INCASSI")))? new IDVariant("Incassi") : IMDB.Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMEFASE, 0).equals((new IDVariant("PAGAM")))? new IDVariant("Pagamenti") : IMDB.Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMEFASE, 0).equals((new IDVariant("MANPROV")))? new IDVariant("Provvisori Mandati") : IMDB.Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMEFASE, 0).equals((new IDVariant("ORDPROV")))? new IDVariant("Provvisori Ordinativi") :  new IDVariant())), (new IDVariant(" del "))), IDL.ToString(IMDB.Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMEDATA, 0))));
      BUK_ERRORI.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_ERRORI.RefreshQuery();
      BUK_ERRORI.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_ERRORI.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoErroriAuto", "LanciaStampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // New Table
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ELENERROAUTO_NEWTABLE54() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_NEWTABLE54_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_NEWTABLE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_NEWTABLE, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE54_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_NEWTABLE54_RS, 0, IMDBDef6.TBL_NEWTABLE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE54_RS, 0, 0, IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMECAPTI, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE54_RS, 1, 0, IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMEFASE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE54_RS, 2, 0, IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMEDATA, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_NEWTABLE, 0);
      if (IMDB.Eof(IMDBDef6.TBL_NEWTABLE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_NEWTABLE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_NEWTABLE54_RS, 0);
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
  private void PAN_PARAMERRORI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMERRORI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMERRORI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMERRORI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMERRORI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMERRORI);
    // Stub
  }

  private void PAN_PARAMERRORI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMERRORI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMERRORI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMERRORI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ELENCOANOMAL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCOANOMAL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCOANOMAL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCOANOMAL, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCOANOMAL_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ELENCOANOMAL);
    // Stub
  }

  private void PAN_ELENCOANOMAL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ELENCOANOMAL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCOANOMAL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCOANOMAL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_ERRORI_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ERRORI_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ERRORI_SEC_REPORTHEADER)
    {
      BUK_ERRORI.set_SpanValue(BUK_ERRORI_SPAN_ROWNAMECAPTI, new IDVariant(IMDB.Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMECAPTI, 0)));
    }
    if (SectionID==BUK_ERRORI_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_ERRORI_SEC_DETAIL)
    {
    }
  }

  private void BUK_ERRORI_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_ERRORI_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ERRORI_MST_NEWTEMPLPAGE)
    {
    }
  }

  private void BUK_ERRORI_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ERRORI_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ERRORI_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ERRORI_OnPreview()
  {
    PreviewBook = BKW_ERRORI;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMERRORI_Init()
  {

    PAN_PARAMERRORI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMERRORI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMERRORI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMERRORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_CAPTION, "BAB4258B-722A-4966-9C3A-AC878257EB0E");
    PAN_PARAMERRORI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_CAPTION, "Caption");
    PAN_PARAMERRORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_CAPTION, "");
    PAN_PARAMERRORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_CAPTION, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMERRORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_CAPTION, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMERRORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_FASE, "53B847DF-459A-4ED1-A3F5-95706E14AD7F");
    PAN_PARAMERRORI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_FASE, "Fase");
    PAN_PARAMERRORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_FASE, "");
    PAN_PARAMERRORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_FASE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMERRORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_FASE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PARAMERRORI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_DATA, "8CF0ED9B-E89C-4D0E-829D-0FE297C55493");
    PAN_PARAMERRORI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_DATA, "Data");
    PAN_PARAMERRORI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_DATA, "");
    PAN_PARAMERRORI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMERRORI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMERRORI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMERRORI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_CAPTION, MyGlb.PANEL_LIST, 0, 36, 368, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMERRORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_CAPTION, MyGlb.PANEL_LIST, 52);
    PAN_PARAMERRORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_CAPTION, MyGlb.PANEL_LIST, 1);
    PAN_PARAMERRORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_CAPTION, MyGlb.PANEL_LIST, "Caption");
    PAN_PARAMERRORI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_CAPTION, MyGlb.PANEL_FORM, 4, 4, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMERRORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_CAPTION, MyGlb.PANEL_FORM, 64);
    PAN_PARAMERRORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_CAPTION, MyGlb.PANEL_FORM, 1);
    PAN_PARAMERRORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_CAPTION, MyGlb.PANEL_FORM, "Caption");
    PAN_PARAMERRORI.SetFieldPage(PFL_PARAMERRORI_CAPTION, -1, -1);
    PAN_PARAMERRORI.SetFieldPanel(PFL_PARAMERRORI_CAPTION, PPQRY_NEWTABLE54, "A.ROWNAMECAPTI", "ROWNAMECAPTI", 5, 45, 0, -13997);
    PAN_PARAMERRORI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_FASE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMERRORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_FASE, MyGlb.PANEL_LIST, 36);
    PAN_PARAMERRORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_FASE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMERRORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_FASE, MyGlb.PANEL_LIST, "Fase");
    PAN_PARAMERRORI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_FASE, MyGlb.PANEL_FORM, 12, 8, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMERRORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_FASE, MyGlb.PANEL_FORM, 64);
    PAN_PARAMERRORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_FASE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMERRORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_FASE, MyGlb.PANEL_FORM, "Fase");
    PAN_PARAMERRORI.SetFieldPage(PFL_PARAMERRORI_FASE, -1, -1);
    PAN_PARAMERRORI.SetFieldPanel(PFL_PARAMERRORI_FASE, PPQRY_NEWTABLE54, "A.ROWNAMEFASE", "ROWNAMEFASE", 5, 10, 0, -13965);
    PAN_PARAMERRORI.SetValueListItem(PFL_PARAMERRORI_FASE, (new IDVariant("TUTTI")), "Tutti", "", "", -1);
    PAN_PARAMERRORI.SetValueListItem(PFL_PARAMERRORI_FASE, (new IDVariant("INCASSI")), "Incassi", "", "", -1);
    PAN_PARAMERRORI.SetValueListItem(PFL_PARAMERRORI_FASE, (new IDVariant("PAGAM")), "Pagamenti", "", "", -1);
    PAN_PARAMERRORI.SetValueListItem(PFL_PARAMERRORI_FASE, (new IDVariant("MANPROV")), "Provvisori Mandati", "", "", -1);
    PAN_PARAMERRORI.SetValueListItem(PFL_PARAMERRORI_FASE, (new IDVariant("ORDPROV")), "Provvisori Ordinativi", "", "", -1);
    PAN_PARAMERRORI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_DATA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMERRORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_DATA, MyGlb.PANEL_LIST, 36);
    PAN_PARAMERRORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMERRORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_PARAMERRORI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_DATA, MyGlb.PANEL_FORM, 204, 8, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMERRORI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_DATA, MyGlb.PANEL_FORM, 40);
    PAN_PARAMERRORI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMERRORI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMERRORI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_PARAMERRORI.SetFieldPage(PFL_PARAMERRORI_DATA, -1, -1);
    PAN_PARAMERRORI.SetFieldPanel(PFL_PARAMERRORI_DATA, PPQRY_NEWTABLE54, "A.ROWNAMEDATA", "ROWNAMEDATA", 6, 10, 0, -13997);
  }

  private void PAN_PARAMERRORI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMERRORI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMERRORI.SetIMDB(IMDB, "PQRY_NEWTABLE54", true);
    PAN_PARAMERRORI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMERRORI.SetQueryIMDB(PPQRY_NEWTABLE54, IMDBDef15.PQRY_NEWTABLE54_RS, IMDBDef6.TBL_NEWTABLE);
    JustLoaded = true;
    PAN_PARAMERRORI.SetFieldPrimaryIndex(PFL_PARAMERRORI_CAPTION, IMDBDef6.FLD_NEWTABLE_ROWNAMECAPTI);
    PAN_PARAMERRORI.SetFieldPrimaryIndex(PFL_PARAMERRORI_FASE, IMDBDef6.FLD_NEWTABLE_ROWNAMEFASE);
    PAN_PARAMERRORI.SetFieldPrimaryIndex(PFL_PARAMERRORI_DATA, IMDBDef6.FLD_NEWTABLE_ROWNAMEDATA);
    PAN_PARAMERRORI.SetMasterTable(0, "NEWTABLE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMERRORI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMERRORI.iUseListQBE;
      PAN_PARAMERRORI.iUseListQBE = 0;
      PAN_PARAMERRORI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMERRORI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMERRORI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ELENCOANOMAL_Init()
  {

    PAN_ELENCOANOMAL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOANOMAL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELENCOANOMAL.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANOMALIA, "B1296E50-B9D7-4372-85DB-C22E16B39DC1");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANOMALIA, "Anomalia");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANOMALIA, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANOMALIA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANOMALIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOANOMAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, "2919A01C-71B9-4B1F-83F0-B5B35908DF8B");
    PAN_ELENCOANOMAL.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, "Id Flusso BT");
    PAN_ELENCOANOMAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, "");
    PAN_ELENCOANOMAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOANOMAL.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ELENCOANOMAL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANOMALIA, MyGlb.PANEL_LIST, 0, 36, 524, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANOMALIA, MyGlb.PANEL_LIST, 52);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANOMALIA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANOMALIA, MyGlb.PANEL_LIST, "Anomalia");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANOMALIA, MyGlb.PANEL_FORM, 4, 4, 488, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANOMALIA, MyGlb.PANEL_FORM, 52);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANOMALIA, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_ANOMALIA, MyGlb.PANEL_FORM, "Anom.");
    PAN_ELENCOANOMAL.SetFieldPage(PFL_ELENCOANOMAL_ANOMALIA, -1, -1);
    PAN_ELENCOANOMAL.SetFieldPanel(PFL_ELENCOANOMAL_ANOMALIA, PPQRY_WRKERRORI6, "A.ERRORE", "RECORDANOMAL", 5, 300, 0, -13997);
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, MyGlb.PANEL_LIST, 524, 36, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, MyGlb.PANEL_LIST, "Id Flusso BT");
    PAN_ELENCOANOMAL.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, MyGlb.PANEL_FORM, 4, 52, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOANOMAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOANOMAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOANOMAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOANOMAL_IDFLUSSOBT, MyGlb.PANEL_FORM, "Id Flusso BT");
    PAN_ELENCOANOMAL.SetFieldPage(PFL_ELENCOANOMAL_IDFLUSSOBT, -1, -1);
    PAN_ELENCOANOMAL.SetFieldPanel(PFL_ELENCOANOMAL_IDFLUSSOBT, PPQRY_WRKERRORI6, "A.ID_FLUSSO_BT", "RECOIDFLUSBT", 5, 500, 0, -13997);
  }

  private void PAN_ELENCOANOMAL_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOANOMAL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELENCOANOMAL.SetIMDB(IMDB, "PQRY_WRKERRORI6", true);
    PAN_ELENCOANOMAL.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as RECWRKERRPRO, ");
    SQL.append("  A.ERRORE as RECORDANOMAL, ");
    SQL.append("  A.ID_FLUSSO_BT as RECOIDFLUSBT ");
    PAN_ELENCOANOMAL.SetQuery(PPQRY_WRKERRORI6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_ERRORI A ");
    PAN_ELENCOANOMAL.SetQuery(PPQRY_WRKERRORI6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.FASE = DECODE(~~PQRY_NEWTABLE54.ROWNAMEFASE~~, 'TUTTI', A.FASE, ~~PQRY_NEWTABLE54.ROWNAMEFASE~~)) ");
    SQL.append("and   (A.FASE IN ('TUTTI', 'INCASSI', 'PAGAM', 'MANPROV', 'ORDPROV')) ");
    SQL.append("and   (A.DATA_ERRORE = ~~PQRY_NEWTABLE54.ROWNAMEDATA~~) ");
    PAN_ELENCOANOMAL.SetQuery(PPQRY_WRKERRORI6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOANOMAL.SetQuery(PPQRY_WRKERRORI6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOANOMAL.SetQuery(PPQRY_WRKERRORI6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_ELENCOANOMAL.SetQuery(PPQRY_WRKERRORI6, 5, SQL, -1, "");
    PAN_ELENCOANOMAL.SetQueryDB(PPQRY_WRKERRORI6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOANOMAL.SetMasterTable(0, "WRK_ERRORI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCOANOMAL.Status() == 2)
    {
      int oldListQBE = PAN_ELENCOANOMAL.iUseListQBE;
      PAN_ELENCOANOMAL.iUseListQBE = 0;
      PAN_ELENCOANOMAL.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCOANOMAL.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCOANOMAL.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_ERRORI_MST_NEWTEMPLPAGE_Init()
  {
    BUK_ERRORI.InitMastro(BUK_ERRORI_MST_NEWTEMPLPAGE, 3, 21000, 29700, 1, 2, 1);
    BUK_ERRORI.SetRTCGuid(BUK_ERRORI_MST_NEWTEMPLPAGE, "89929520-A41E-4FF7-9AE0-D10A747676B1");
    BUK_ERRORI.SetObjCode(BUK_ERRORI_MST_NEWTEMPLPAGE, "NEWTEMPLPAGE");
    BUK_ERRORI.InitMastroBox(BUK_ERRORI_MST_NEWTEMPLPAGE, BUK_ERRORI_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ERRORI.SetRTCGuid(BUK_ERRORI_RPTBOX_PAGEHEADER, "187FA741-4126-4366-8737-09C77958EB91");
    BUK_ERRORI.SetObjCode(BUK_ERRORI_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_ERRORI.InitMastroBox(BUK_ERRORI_MST_NEWTEMPLPAGE, BUK_ERRORI_RPTBOX_PAGEBODY, 1000, 3500, 27700, 13400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ERRORI.SetRTCGuid(BUK_ERRORI_RPTBOX_PAGEBODY, "B2527A3B-6D2D-43B2-97BA-9D7B751C1D36");
    BUK_ERRORI.SetObjCode(BUK_ERRORI_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_ERRORI_RPT_NEWREPORT_InitQuery() { BUK_ERRORI_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_ERRORI_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.SESSIONE as SESSIONE, ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.ERRORE as ERRORE ");
      SQL.append("from ");
      SQL.append("  WRK_ERRORI A ");
      SQL.append("where (TO_DATE(TO_NUMBER(TO_CHAR(A.DATA_ERRORE, 'dd'))||'/'||TO_NUMBER(TO_CHAR(A.DATA_ERRORE, 'mm' ))||'/'||TO_NUMBER(TO_CHAR(A.DATA_ERRORE, 'yyyy')),'dd/mm/yyyy') = ~~TBL_NEWTABLE.ROWNAMEDATA~~) ");
      SQL.append("and   (A.FASE = ~~TBL_NEWTABLE.ROWNAMEFASE~~) ");
      SQL.append("order by ");
      SQL.append("  A.PROGRESSIVO ");
      BUK_ERRORI.SetReportQuery(BUK_ERRORI_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "08052FF6-70DC-4AEE-8F0D-EE0D313B9B84");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ERRORI_RPT_NEWREPORT_Init()
  {
    BUK_ERRORI.InitReport(BUK_ERRORI_RPT_NEWREPORT, 196609);
    BUK_ERRORI_RPT_NEWREPORT_InitQuery(true, false);
    BUK_ERRORI.SetRTCGuid(BUK_ERRORI_RPT_NEWREPORT, "A60217C2-429F-4E6C-BE5C-A1913E86E555");
    BUK_ERRORI.SetObjCode(BUK_ERRORI_RPT_NEWREPORT, "NEWREPORT");
    BUK_ERRORI.InitSection(BUK_ERRORI_RPT_NEWREPORT, BUK_ERRORI_SEC_REPORTHEADER, 2000, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ERRORI.SetSectionRendersInto(BUK_ERRORI_SEC_REPORTHEADER, BUK_ERRORI_RPTBOX_PAGEHEADER);
    BUK_ERRORI.SetRTCGuid(BUK_ERRORI_SEC_REPORTHEADER, "C15671AE-7B3F-4892-8B8E-53869EBF5C33");
    BUK_ERRORI.SetObjCode(BUK_ERRORI_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_ERRORI.InitReportBox(BUK_ERRORI_SEC_REPORTHEADER, BUK_ERRORI_RPTBOX_TITOLOBOX, 0, 0, 27600, 2000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_ERRORI.SetRTCGuid(BUK_ERRORI_RPTBOX_TITOLOBOX, "0B7D4D24-B104-4136-8042-EA6485A43DAF");
    BUK_ERRORI.SetObjCode(BUK_ERRORI_RPTBOX_TITOLOBOX, "TITOLOBOX");
    BUK_ERRORI.InitBoxSpan(BUK_ERRORI_RPTBOX_TITOLOBOX, BUK_ERRORI_SPAN_ROWNAMECAPTI, MyGlb.VIS_TITOLOREPORT, 5, 45, 0, 271384961, "", "", 1);
    BUK_ERRORI.SetRTCGuid(BUK_ERRORI_SPAN_ROWNAMECAPTI, "F5307942-82C3-4B22-B472-BA85AE863341");
    BUK_ERRORI.SetObjCode(BUK_ERRORI_SPAN_ROWNAMECAPTI, "ROWNAMECAPTI");
    BUK_ERRORI.InitSection(BUK_ERRORI_RPT_NEWREPORT, BUK_ERRORI_SEC_PAGEHEADER, 0, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ERRORI.SetSectionRendersInto(BUK_ERRORI_SEC_PAGEHEADER, BUK_ERRORI_RPTBOX_PAGEBODY);
    BUK_ERRORI.SetRTCGuid(BUK_ERRORI_SEC_PAGEHEADER, "5D3A4750-7141-43DC-9465-19E4E1918637");
    BUK_ERRORI.SetObjCode(BUK_ERRORI_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_ERRORI.InitSection(BUK_ERRORI_RPT_NEWREPORT, BUK_ERRORI_SEC_DETAIL, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ERRORI.SetSectionRendersInto(BUK_ERRORI_SEC_DETAIL, BUK_ERRORI_RPTBOX_PAGEBODY);
    BUK_ERRORI.SetRTCGuid(BUK_ERRORI_SEC_DETAIL, "48B2B77B-FAE9-4AF9-96C9-16A5C5714BCB");
    BUK_ERRORI.SetObjCode(BUK_ERRORI_SEC_DETAIL, "DETAIL");
    BUK_ERRORI.InitReportBox(BUK_ERRORI_SEC_DETAIL, BUK_ERRORI_RPTBOX_ERRORE, 0, 0, 27600, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ERRORI.SetRTCGuid(BUK_ERRORI_RPTBOX_ERRORE, "BB9D1B90-0F98-48F9-9D24-F1F9EC7CA4E9");
    BUK_ERRORI.SetObjCode(BUK_ERRORI_RPTBOX_ERRORE, "ERRORE");
    BUK_ERRORI.InitBoxSpan(BUK_ERRORI_RPTBOX_ERRORE, BUK_ERRORI_SPAN_REWREREREEAE, MyGlb.VIS_DEFAREPOSTYL, 5, 300, 0, 271384705, "Brief description of field content.", "::ERRORE", 1);
    BUK_ERRORI.SetRTCGuid(BUK_ERRORI_SPAN_REWREREREEAE, "94D1F6E0-73BF-47BF-A293-F2D81EB24F00");
    BUK_ERRORI.SetObjCode(BUK_ERRORI_SPAN_REWREREREEAE, "REWREREREEAE");
    BUK_ERRORI_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_ERRORI_InitLinks()
  {
    BUK_ERRORI.SetBoxNextBox(BUK_ERRORI_RPTBOX_PAGEBODY, BUK_ERRORI_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMERRORI) PAN_PARAMERRORI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ELENCOANOMAL) PAN_ELENCOANOMAL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMERRORI) PAN_PARAMERRORI_ValidateRow(Cancel);
    if (SrcObj == PAN_ELENCOANOMAL) PAN_ELENCOANOMAL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMERRORI) PAN_PARAMERRORI_DynamicProperties();
    if (SrcObj == PAN_ELENCOANOMAL) PAN_ELENCOANOMAL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMERRORI) PAN_PARAMERRORI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ELENCOANOMAL) PAN_ELENCOANOMAL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMERRORI) PAN_PARAMERRORI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ELENCOANOMAL) PAN_ELENCOANOMAL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_ERRORI) BUK_ERRORI_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ERRORI) BUK_ERRORI_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ERRORI) BUK_ERRORI_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ERRORI) BUK_ERRORI_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ERRORI) BUK_ERRORI_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ERRORI) BUK_ERRORI_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ERRORI) BUK_ERRORI_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ERRORI) BUK_ERRORI_OnPreview();
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
