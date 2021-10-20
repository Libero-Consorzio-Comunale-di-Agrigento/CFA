// **********************************************
// Selezione Comuni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SelezioneComuni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_NEWTABBEVIEW;
  private static int PFL_COMUNI_COMUNE1 = 0;
  private static int PFL_COMUNI_PROVINCIA1 = 1;
  private static int PFL_COMUNI_SIGLA = 2;
  private static int PFL_COMUNI_CAP1 = 3;
  private static int PFL_COMUNI_COMUNE2 = 4;
  private static int PFL_COMUNI_PROVINCIA = 5;
  private static int PFL_COMUNI_PROVINTRIBUN = 6;
  private static int PFL_COMUNI_PROVINCSTAT1 = 7;

  private static int PPQRY_COMUNI32 = 0;


  IDPanel PAN_COMUNI;
  private static int PFL_ESTERI_DENOMINAZION = 0;
  private static int PFL_ESTERI_COMUNE = 1;
  private static int PFL_ESTERI_PROVINCSTATO = 2;
  private static int PFL_ESTERI_CAP = 3;
  private static int PFL_ESTERI_SIGLISO3ALPH = 4;

  private static int PPQRY_COMUNI36 = 0;


  IDPanel PAN_ESTERI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FORM1(IMDB);
    //
    //
    Init_PQRY_COMUNI32(IMDB);
    Init_PQRY_COMUNI36(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FORM1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_FORM1, 4);
    IMDB.set_TblCode(IMDBDef1.TBL_FORM1, "TBL_FORM1");
    IMDB.set_FldCode(IMDBDef1.TBL_FORM1,IMDBDef1.FLD_FORM1_ROWNAMECOMUN, "ROWNAMECOMUN");
    IMDB.SetFldParams(IMDBDef1.TBL_FORM1,IMDBDef1.FLD_FORM1_ROWNAMECOMUN,1,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_FORM1,IMDBDef1.FLD_FORM1_ROWNAMEPROVI, "ROWNAMEPROVI");
    IMDB.SetFldParams(IMDBDef1.TBL_FORM1,IMDBDef1.FLD_FORM1_ROWNAMEPROVI,1,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_FORM1,IMDBDef1.FLD_FORM1_ROWNAMECAP, "ROWNAMECAP");
    IMDB.SetFldParams(IMDBDef1.TBL_FORM1,IMDBDef1.FLD_FORM1_ROWNAMECAP,1,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_FORM1,IMDBDef1.FLD_FORM1_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef1.TBL_FORM1,IMDBDef1.FLD_FORM1_ROWNAMEDATA,6,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_FORM1, 0);
  }

  private static void Init_PQRY_COMUNI32(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_COMUNI32, 8);
    IMDB.set_TblCode(IMDBDef7.PQRY_COMUNI32, "PQRY_COMUNI32");
    IMDB.set_FldCode(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_PROVINCIA_STATO, "PROVINCIA_STATO");
    IMDB.SetFldParams(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_PROVINCIA_STATO,1,3,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_COMUNE, "COMUNE");
    IMDB.SetFldParams(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_COMUNE,1,3,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_SIGLA, "SIGLA");
    IMDB.SetFldParams(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_SIGLA,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_DENOMINAZIONE, "DENOMINAZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_DENOMINAZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_COMUNICOMUNE, "COMUNICOMUNE");
    IMDB.SetFldParams(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_COMUNICOMUNE,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_CAP, "CAP");
    IMDB.SetFldParams(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_CAP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_PROVINCIA, "PROVINCIA");
    IMDB.SetFldParams(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_PROVINCIA,1,3,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_PROVINCIA_TRIBUNALE, "PROVINCIA_TRIBUNALE");
    IMDB.SetFldParams(IMDBDef7.PQRY_COMUNI32,IMDBDef7.PQSL_COMUNI32_PROVINCIA_TRIBUNALE,1,3,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_COMUNI32, 0);
  }

  private static void Init_PQRY_COMUNI36(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_COMUNI36, 5);
    IMDB.set_TblCode(IMDBDef7.PQRY_COMUNI36, "PQRY_COMUNI36");
    IMDB.set_FldCode(IMDBDef7.PQRY_COMUNI36,IMDBDef7.PQSL_COMUNI36_PROVINCIA_STATO, "PROVINCIA_STATO");
    IMDB.SetFldParams(IMDBDef7.PQRY_COMUNI36,IMDBDef7.PQSL_COMUNI36_PROVINCIA_STATO,1,3,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_COMUNI36,IMDBDef7.PQSL_COMUNI36_COMUNE, "COMUNE");
    IMDB.SetFldParams(IMDBDef7.PQRY_COMUNI36,IMDBDef7.PQSL_COMUNI36_COMUNE,1,3,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_COMUNI36,IMDBDef7.PQSL_COMUNI36_DENOMINAZIONE, "DENOMINAZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_COMUNI36,IMDBDef7.PQSL_COMUNI36_DENOMINAZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_COMUNI36,IMDBDef7.PQSL_COMUNI36_CAP, "CAP");
    IMDB.SetFldParams(IMDBDef7.PQRY_COMUNI36,IMDBDef7.PQSL_COMUNI36_CAP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_COMUNI36,IMDBDef7.PQSL_COMUNI36_COADSTTESIIA, "COADSTTESIIA");
    IMDB.SetFldParams(IMDBDef7.PQRY_COMUNI36,IMDBDef7.PQSL_COMUNI36_COADSTTESIIA,5,2,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_COMUNI36, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SelezioneComuni(MyWebEntryPoint w, IMDBObj imdb)
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
  public SelezioneComuni()
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
    FormIdx = MyGlb.FRM_COMUNI_243;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3303DA42-B920-4132-93E1-8BD0713E8D84";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 532;
    DesignHeight = 398;
    set_Caption(new IDVariant("Selezione Comuni"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 532;
    Frames[1].Height = 372;
    Frames[1].Caption = "New Tabbed View";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 372;
    TAB_NEWTABBEVIEW = new OTabView(this);
    Frames[1].Content = TAB_NEWTABBEVIEW;
    TAB_NEWTABBEVIEW.iGuid = "21893E22-66AC-42BD-8160-6B1153EA328C";
    TAB_NEWTABBEVIEW.SetItemCount(2);
    TAB_NEWTABBEVIEW.Placement = 1;
    TAB_NEWTABBEVIEW.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Comuni";
    Frames[2].Parent = this;
    PAN_COMUNI = new IDPanel(w, this, 2, "PAN_COMUNI");
    Frames[2].Content = PAN_COMUNI;
    PAN_COMUNI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_COMUNI.VS = MainFrm.VisualStyleList;
    PAN_COMUNI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 532-MyGlb.PAN_OFFS_X, 372-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_COMUNI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DB7F2B36-412A-4B87-AF6C-90528B424F05");
    PAN_COMUNI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 488, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_COMUNI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_COMUNI.InitStatus = 1;
    PAN_COMUNI_Init();
    PAN_COMUNI_InitFields();
    PAN_COMUNI_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(1, Frames[2], 0, "", "Comuni", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Esteri";
    Frames[3].Parent = this;
    PAN_ESTERI = new IDPanel(w, this, 3, "PAN_ESTERI");
    Frames[3].Content = PAN_ESTERI;
    PAN_ESTERI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESTERI.VS = MainFrm.VisualStyleList;
    PAN_ESTERI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 532-MyGlb.PAN_OFFS_X, 372-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_ESTERI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1A47E5D4-08DA-4B57-9034-E0D6D9BD5A6F");
    PAN_ESTERI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 460, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTERI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESTERI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESTERI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESTERI.InitStatus = 1;
    PAN_ESTERI_Init();
    PAN_ESTERI_InitFields();
    PAN_ESTERI_InitQueries();
    TAB_NEWTABBEVIEW.SetItem(2, Frames[3], 0, "", "Esteri", "");
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
      PAN_COMUNI.UpdatePanel(MainFrm);
      PAN_ESTERI.UpdatePanel(MainFrm);
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
    return (obj instanceof SelezioneComuni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SelezioneComuni.class.getName() : (Glb.ClassWithPackage(SelezioneComuni.class) ? SelezioneComuni.class.getName().substring(SelezioneComuni.class.getPackage().getName().length() + 1) : SelezioneComuni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Comuni On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_COMUNI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Comuni On Change Row Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMECOMUN, 0, IMDB.Value(IMDBDef7.PQRY_COMUNI32, IMDBDef7.PQSL_COMUNI32_COMUNE, 0));
      IMDB.set_Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMEPROVI, 0, IMDB.Value(IMDBDef7.PQRY_COMUNI32, IMDBDef7.PQSL_COMUNI32_PROVINCIA_STATO, 0));
      IMDB.set_Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMECAP, 0, IMDB.Value(IMDBDef7.PQRY_COMUNI32, IMDBDef7.PQSL_COMUNI32_CAP, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelezioneComuni", "ComuniOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Comuni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_COMUNI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_COMUNI);
      // 
      // Comuni On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_COMUNI.set_ToolTip(Glb.OBJ_FIELD,PFL_COMUNI_COMUNE1,(new IDVariant(PAN_COMUNI.FieldText(PFL_COMUNI_COMUNE1))).stringValue()); 
      PAN_COMUNI.set_ToolTip(Glb.OBJ_FIELD,PFL_COMUNI_PROVINCIA1,(new IDVariant(PAN_COMUNI.FieldText(PFL_COMUNI_PROVINCIA1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelezioneComuni", "ComuniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Esteri On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_ESTERI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esteri On Change Row Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMECOMUN, 0, IMDB.Value(IMDBDef7.PQRY_COMUNI36, IMDBDef7.PQSL_COMUNI36_COMUNE, 0));
      IMDB.set_Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMEPROVI, 0, IMDB.Value(IMDBDef7.PQRY_COMUNI36, IMDBDef7.PQSL_COMUNI36_PROVINCIA_STATO, 0));
      IMDB.set_Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMECAP, 0, IMDB.Value(IMDBDef7.PQRY_COMUNI36, IMDBDef7.PQSL_COMUNI36_CAP, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelezioneComuni", "EsteriOnChangeRowEvent", _e);
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
      if (new IDVariant(TAB_NEWTABBEVIEW.SelectedPageIndex()).equals((new IDVariant(PAN_COMUNI.FrIndex)), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMECOMUN, 0, IMDB.Value(IMDBDef7.PQRY_COMUNI32, IMDBDef7.PQSL_COMUNI32_COMUNE, 0));
        IMDB.set_Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMEPROVI, 0, IMDB.Value(IMDBDef7.PQRY_COMUNI32, IMDBDef7.PQSL_COMUNI32_PROVINCIA, 0));
        IMDB.set_Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMECAP, 0, IMDB.Value(IMDBDef7.PQRY_COMUNI32, IMDBDef7.PQSL_COMUNI32_CAP, 0));
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMECOMUN, 0, IMDB.Value(IMDBDef7.PQRY_COMUNI36, IMDBDef7.PQSL_COMUNI36_COMUNE, 0));
        IMDB.set_Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMEPROVI, 0, IMDB.Value(IMDBDef7.PQRY_COMUNI36, IMDBDef7.PQSL_COMUNI36_PROVINCIA_STATO, 0));
        IMDB.set_Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMECAP, 0, (new IDVariant()));
      }
      IMDB.set_Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMEDATA, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SelezioneComuni", "Unload", _e);
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
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
  private void TAB_NEWTABBEVIEW_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_COMUNI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_COMUNI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_COMUNI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_COMUNI, Cancel);
    // Stub
  }

  private void PAN_COMUNI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_COMUNI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_COMUNI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_COMUNI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ESTERI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ESTERI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ESTERI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESTERI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESTERI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ESTERI);
    // Stub
  }

  private void PAN_ESTERI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ESTERI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ESTERI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESTERI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_COMUNI_Init()
  {

    PAN_COMUNI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_COMUNI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_COMUNI.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_COMUNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE1, "F3416AEB-2581-4B06-9297-A60B168DD309");
    PAN_COMUNI.set_Header(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE1, "Comune");
    PAN_COMUNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE1, "Denominazione del Comune <NLS>");
    PAN_COMUNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE1, MyGlb.VIS_NORMALFIELDS);
    PAN_COMUNI.SetFlags(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_COMUNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA1, "ED2C3303-C822-423E-B06E-411FABC8C45A");
    PAN_COMUNI.set_Header(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA1, "Provincia");
    PAN_COMUNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA1, "Denominazione PROVINCIA <NLS>");
    PAN_COMUNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA1, MyGlb.VIS_NORMALFIELDS);
    PAN_COMUNI.SetFlags(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_COMUNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMUNI_SIGLA, "37EA481A-66F7-46C0-BBF1-B93F59DDF3A8");
    PAN_COMUNI.set_Header(MyGlb.OBJ_FIELD, PFL_COMUNI_SIGLA, "Sigla");
    PAN_COMUNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMUNI_SIGLA, "Sigla automobilistica");
    PAN_COMUNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMUNI_SIGLA, MyGlb.VIS_NORMALFIELDS);
    PAN_COMUNI.SetFlags(MyGlb.OBJ_FIELD, PFL_COMUNI_SIGLA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_COMUNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMUNI_CAP1, "6FAE5B3D-991A-492A-BA3D-89F4B46B36F4");
    PAN_COMUNI.set_Header(MyGlb.OBJ_FIELD, PFL_COMUNI_CAP1, "CAP");
    PAN_COMUNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMUNI_CAP1, "codice avviamento postale per i comuni italiani");
    PAN_COMUNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMUNI_CAP1, MyGlb.VIS_NORMALFIELDS);
    PAN_COMUNI.SetFlags(MyGlb.OBJ_FIELD, PFL_COMUNI_CAP1, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_COMUNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE2, "0BBBC399-EF1A-452A-83FA-6FD27ED06E38");
    PAN_COMUNI.set_Header(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE2, "COMUNE");
    PAN_COMUNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE2, "Codice comune");
    PAN_COMUNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE2, MyGlb.VIS_NORMALFIELDS);
    PAN_COMUNI.SetFlags(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE2, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_COMUNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA, "3136BFB5-8FC4-432A-9237-AB323152C63F");
    PAN_COMUNI.set_Header(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA, "PROVINCIA");
    PAN_COMUNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA, "Codice della provincia");
    PAN_COMUNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_COMUNI.SetFlags(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_ISKEY, -1);
    PAN_COMUNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINTRIBUN, "5B160B7B-82CF-4457-A64C-CFC1B178B9A5");
    PAN_COMUNI.set_Header(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINTRIBUN, "PROVINCIA TRIBUNALE");
    PAN_COMUNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINTRIBUN, "Codice della provincia");
    PAN_COMUNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINTRIBUN, MyGlb.VIS_NORMFIELPADR);
    PAN_COMUNI.SetFlags(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINTRIBUN, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_ISOPT, -1);
    PAN_COMUNI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCSTAT1, "629ECCEA-FA4C-4807-B510-B298797B4C57");
    PAN_COMUNI.set_Header(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCSTAT1, "PROVINCIA STATO");
    PAN_COMUNI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCSTAT1, "Codice provincia per i comuni italiani dello stato per gli esteri");
    PAN_COMUNI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCSTAT1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_COMUNI.SetFlags(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCSTAT1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_COMUNI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE1, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE1, MyGlb.PANEL_LIST, 96);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE1, MyGlb.PANEL_LIST, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE1, MyGlb.PANEL_LIST, "Comune");
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE1, MyGlb.PANEL_FORM, 4, 124, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE1, MyGlb.PANEL_FORM, 96);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE1, MyGlb.PANEL_FORM, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE1, MyGlb.PANEL_FORM, "Comune");
    PAN_COMUNI.SetFieldPage(PFL_COMUNI_COMUNE1, -1, -1);
    PAN_COMUNI.SetFieldPanel(PFL_COMUNI_COMUNE1, PPQRY_COMUNI32, "A.DENOMINAZIONE", "COMUNICOMUNE", 5, 40, 0, -13997);
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA1, MyGlb.PANEL_LIST, 208, 36, 148, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA1, MyGlb.PANEL_LIST, 96);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA1, MyGlb.PANEL_LIST, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA1, MyGlb.PANEL_LIST, "Provincia");
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA1, MyGlb.PANEL_FORM, 4, 100, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA1, MyGlb.PANEL_FORM, 96);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA1, MyGlb.PANEL_FORM, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA1, MyGlb.PANEL_FORM, "Provincia");
    PAN_COMUNI.SetFieldPage(PFL_COMUNI_PROVINCIA1, -1, -1);
    PAN_COMUNI.SetFieldPanel(PFL_COMUNI_PROVINCIA1, PPQRY_COMUNI32, "B.DENOMINAZIONE", "DENOMINAZIONE", 5, 40, 0, -13997);
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_SIGLA, MyGlb.PANEL_LIST, 356, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_SIGLA, MyGlb.PANEL_LIST, 40);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_SIGLA, MyGlb.PANEL_LIST, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_SIGLA, MyGlb.PANEL_LIST, "Sigla");
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_SIGLA, MyGlb.PANEL_FORM, 4, 76, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_SIGLA, MyGlb.PANEL_FORM, 40);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_SIGLA, MyGlb.PANEL_FORM, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_SIGLA, MyGlb.PANEL_FORM, "Sigla");
    PAN_COMUNI.SetFieldPage(PFL_COMUNI_SIGLA, -1, -1);
    PAN_COMUNI.SetFieldPanel(PFL_COMUNI_SIGLA, PPQRY_COMUNI32, "B.SIGLA", "SIGLA", 5, 2, 0, -13997);
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_CAP1, MyGlb.PANEL_LIST, 396, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_CAP1, MyGlb.PANEL_LIST, 28);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_CAP1, MyGlb.PANEL_LIST, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_CAP1, MyGlb.PANEL_LIST, "CAP");
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_CAP1, MyGlb.PANEL_FORM, 4, 148, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_CAP1, MyGlb.PANEL_FORM, 28);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_CAP1, MyGlb.PANEL_FORM, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_CAP1, MyGlb.PANEL_FORM, "CAP");
    PAN_COMUNI.SetFieldPage(PFL_COMUNI_CAP1, -1, -1);
    PAN_COMUNI.SetFieldPanel(PFL_COMUNI_CAP1, PPQRY_COMUNI32, "A.CAP", "CAP", 1, 5, 0, -13997);
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE2, MyGlb.PANEL_LIST, 436, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE2, MyGlb.PANEL_LIST, 52);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE2, MyGlb.PANEL_LIST, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE2, MyGlb.PANEL_LIST, "COMUNE");
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE2, MyGlb.PANEL_FORM, 4, 172, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE2, MyGlb.PANEL_FORM, 52);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE2, MyGlb.PANEL_FORM, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_COMUNE2, MyGlb.PANEL_FORM, "COMUNE");
    PAN_COMUNI.SetFieldPage(PFL_COMUNI_COMUNE2, -1, -1);
    PAN_COMUNI.SetFieldPanel(PFL_COMUNI_COMUNE2, PPQRY_COMUNI32, "A.COMUNE", "COMUNE", 1, 3, 0, -13997);
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA, MyGlb.PANEL_LIST, 64);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA, MyGlb.PANEL_LIST, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA, MyGlb.PANEL_LIST, "PROV.");
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA, MyGlb.PANEL_FORM, 4, 196, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA, MyGlb.PANEL_FORM, 64);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA, MyGlb.PANEL_FORM, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCIA, MyGlb.PANEL_FORM, "PROV.");
    PAN_COMUNI.SetFieldPage(PFL_COMUNI_PROVINCIA, -1, -1);
    PAN_COMUNI.SetFieldPanel(PFL_COMUNI_PROVINCIA, PPQRY_COMUNI32, "B.PROVINCIA", "PROVINCIA", 1, 3, 0, -13997);
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINTRIBUN, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINTRIBUN, MyGlb.PANEL_LIST, 124);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINTRIBUN, MyGlb.PANEL_LIST, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINTRIBUN, MyGlb.PANEL_LIST, "PROVINCIA TRIBUNALE");
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINTRIBUN, MyGlb.PANEL_FORM, 4, 196, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINTRIBUN, MyGlb.PANEL_FORM, 124);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINTRIBUN, MyGlb.PANEL_FORM, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINTRIBUN, MyGlb.PANEL_FORM, "PROV. TRIBUNALE");
    PAN_COMUNI.SetFieldPage(PFL_COMUNI_PROVINTRIBUN, -1, -1);
    PAN_COMUNI.SetFieldPanel(PFL_COMUNI_PROVINTRIBUN, PPQRY_COMUNI32, "A.PROVINCIA_TRIBUNALE", "PROVINCIA_TRIBUNALE", 1, 3, 0, -13997);
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCSTAT1, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCSTAT1, MyGlb.PANEL_LIST, 100);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCSTAT1, MyGlb.PANEL_LIST, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCSTAT1, MyGlb.PANEL_LIST, "PROVINCIA STATO");
    PAN_COMUNI.SetRect(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCSTAT1, MyGlb.PANEL_FORM, 4, 196, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMUNI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCSTAT1, MyGlb.PANEL_FORM, 100);
    PAN_COMUNI.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCSTAT1, MyGlb.PANEL_FORM, 1);
    PAN_COMUNI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMUNI_PROVINCSTAT1, MyGlb.PANEL_FORM, "PROV. STATO");
    PAN_COMUNI.SetFieldPage(PFL_COMUNI_PROVINCSTAT1, -1, -1);
    PAN_COMUNI.SetFieldPanel(PFL_COMUNI_PROVINCSTAT1, PPQRY_COMUNI32, "A.PROVINCIA_STATO", "PROVINCIA_STATO", 1, 3, 0, -13997);
  }

  private void PAN_COMUNI_InitQueries()
  {
    StringBuffer SQL;

    PAN_COMUNI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_COMUNI.SetIMDB(IMDB, "PQRY_COMUNI32", true);
    PAN_COMUNI.set_SetString(MyGlb.MASTER_ROWNAME, "COMUNI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROVINCIA_STATO as PROVINCIA_STATO, ");
    SQL.append("  A.COMUNE as COMUNE, ");
    SQL.append("  B.SIGLA as SIGLA, ");
    SQL.append("  B.DENOMINAZIONE as DENOMINAZIONE, ");
    SQL.append("  A.DENOMINAZIONE as COMUNICOMUNE, ");
    SQL.append("  A.CAP as CAP, ");
    SQL.append("  B.PROVINCIA as PROVINCIA, ");
    SQL.append("  A.PROVINCIA_TRIBUNALE as PROVINCIA_TRIBUNALE ");
    PAN_COMUNI.SetQuery(PPQRY_COMUNI32, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  AD4_COMUNI A, ");
    SQL.append("  AD4_PROVINCIE B ");
    PAN_COMUNI.SetQuery(PPQRY_COMUNI32, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.PROVINCIA = A.PROVINCIA_STATO) ");
    SQL.append("and   (NVL(A.DATA_SOPPRESSIONE, TO_DATE('2999-12-31','YYYY-MM-DD')) > NVL(~~TBL_FORM1.ROWNAMEDATA~~, TRUNC( SYSDATE ))) ");
    SQL.append("and   (NVL(A.DATA_SOPPRESSIONE, TO_DATE('2999-12-31','YYYY-MM-DD')) = ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  MIN(NVL(C.DATA_SOPPRESSIONE, TO_DATE('2999-12-31','YYYY-MM-DD'))) ");
    SQL.append("from ");
    SQL.append("  AD4_COMUNI C ");
    SQL.append("where ((C.SIGLA_CFIS = A.SIGLA_CFIS AND NOT ((A.SIGLA_CFIS IS NULL)) OR (C.COMUNE = A.COMUNE) AND C.PROVINCIA_STATO = A.PROVINCIA_STATO AND (A.SIGLA_CFIS IS NULL))) ");
    SQL.append("and   (NVL(C.DATA_SOPPRESSIONE, TO_DATE('2999-12-31','YYYY-MM-DD')) > NVL(~~TBL_FORM1.ROWNAMEDATA~~, TRUNC( SYSDATE ))) ");
    SQL.append(")) ");
    PAN_COMUNI.SetQuery(PPQRY_COMUNI32, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_COMUNI.SetQuery(PPQRY_COMUNI32, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_COMUNI.SetQuery(PPQRY_COMUNI32, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.DENOMINAZIONE, ");
    SQL.append("  B.DENOMINAZIONE ");
    PAN_COMUNI.SetQuery(PPQRY_COMUNI32, 5, SQL, -1, "");
    PAN_COMUNI.SetQueryDB(PPQRY_COMUNI32, MainFrm.Cf4armDBObject.DB, 4);
    PAN_COMUNI.SetMasterTable(0, "AD4_COMUNI");
    PAN_COMUNI.AddToSortList(PFL_COMUNI_COMUNE1, true);
    PAN_COMUNI.AddToSortList(PFL_COMUNI_PROVINCIA1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_COMUNI.Status() == 2)
    {
      int oldListQBE = PAN_COMUNI.iUseListQBE;
      PAN_COMUNI.iUseListQBE = 0;
      PAN_COMUNI.PanelCommand(Glb.PCM_SEARCH);
      PAN_COMUNI.PanelCommand(Glb.PCM_FIND);
      PAN_COMUNI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ESTERI_Init()
  {

    PAN_ESTERI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESTERI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ESTERI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_ESTERI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTERI_DENOMINAZION, "695209AA-5BBB-429A-860A-3172BA61C386");
    PAN_ESTERI.set_Header(MyGlb.OBJ_FIELD, PFL_ESTERI_DENOMINAZION, "Denominazione");
    PAN_ESTERI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTERI_DENOMINAZION, "Denominazione del Comune <NLS>");
    PAN_ESTERI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTERI_DENOMINAZION, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTERI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTERI_DENOMINAZION, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_ESTERI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTERI_COMUNE, "D9852801-FE3E-4A22-B84F-88BC79793F69");
    PAN_ESTERI.set_Header(MyGlb.OBJ_FIELD, PFL_ESTERI_COMUNE, "COMUNE");
    PAN_ESTERI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTERI_COMUNE, "Codice comune");
    PAN_ESTERI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTERI_COMUNE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ESTERI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTERI_COMUNE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ESTERI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTERI_PROVINCSTATO, "C14A6D69-6C4E-4514-B3C0-2705E7C5ABCB");
    PAN_ESTERI.set_Header(MyGlb.OBJ_FIELD, PFL_ESTERI_PROVINCSTATO, "PROVINCIA STATO");
    PAN_ESTERI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTERI_PROVINCSTATO, "Codice provincia per i comuni italiani dello stato per gli esteri");
    PAN_ESTERI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTERI_PROVINCSTATO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ESTERI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTERI_PROVINCSTATO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ESTERI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTERI_CAP, "5FF237C2-DCDD-4CCC-B1CE-239B0A4639AB");
    PAN_ESTERI.set_Header(MyGlb.OBJ_FIELD, PFL_ESTERI_CAP, "CAP");
    PAN_ESTERI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTERI_CAP, "codice avviamento postale per i comuni italiani");
    PAN_ESTERI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTERI_CAP, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTERI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTERI_CAP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ESTERI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTERI_SIGLISO3ALPH, "4077BF18-1232-4637-9320-961FB3C1D706");
    PAN_ESTERI.set_Header(MyGlb.OBJ_FIELD, PFL_ESTERI_SIGLISO3ALPH, "Sigla Stato");
    PAN_ESTERI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTERI_SIGLISO3ALPH, "");
    PAN_ESTERI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTERI_SIGLISO3ALPH, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTERI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTERI_SIGLISO3ALPH, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ESTERI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESTERI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTERI_DENOMINAZION, MyGlb.PANEL_LIST, 0, 36, 388, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTERI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTERI_DENOMINAZION, MyGlb.PANEL_LIST, 96);
    PAN_ESTERI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTERI_DENOMINAZION, MyGlb.PANEL_LIST, 1);
    PAN_ESTERI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTERI_DENOMINAZION, MyGlb.PANEL_LIST, "Denominazione");
    PAN_ESTERI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTERI_DENOMINAZION, MyGlb.PANEL_FORM, 4, 52, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTERI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTERI_DENOMINAZION, MyGlb.PANEL_FORM, 112);
    PAN_ESTERI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTERI_DENOMINAZION, MyGlb.PANEL_FORM, 1);
    PAN_ESTERI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTERI_DENOMINAZION, MyGlb.PANEL_FORM, "Denominazione");
    PAN_ESTERI.SetFieldPage(PFL_ESTERI_DENOMINAZION, -1, -1);
    PAN_ESTERI.SetFieldPanel(PFL_ESTERI_DENOMINAZION, PPQRY_COMUNI36, "A.DENOMINAZIONE", "DENOMINAZIONE", 5, 40, 0, -13997);
    PAN_ESTERI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTERI_COMUNE, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTERI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTERI_COMUNE, MyGlb.PANEL_LIST, 52);
    PAN_ESTERI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTERI_COMUNE, MyGlb.PANEL_LIST, 1);
    PAN_ESTERI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTERI_COMUNE, MyGlb.PANEL_LIST, "COMUNE");
    PAN_ESTERI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTERI_COMUNE, MyGlb.PANEL_FORM, 4, 76, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTERI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTERI_COMUNE, MyGlb.PANEL_FORM, 52);
    PAN_ESTERI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTERI_COMUNE, MyGlb.PANEL_FORM, 1);
    PAN_ESTERI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTERI_COMUNE, MyGlb.PANEL_FORM, "COMUNE");
    PAN_ESTERI.SetFieldPage(PFL_ESTERI_COMUNE, -1, -1);
    PAN_ESTERI.SetFieldPanel(PFL_ESTERI_COMUNE, PPQRY_COMUNI36, "A.COMUNE", "COMUNE", 1, 3, 0, -13997);
    PAN_ESTERI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTERI_PROVINCSTATO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTERI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTERI_PROVINCSTATO, MyGlb.PANEL_LIST, 100);
    PAN_ESTERI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTERI_PROVINCSTATO, MyGlb.PANEL_LIST, 1);
    PAN_ESTERI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTERI_PROVINCSTATO, MyGlb.PANEL_LIST, "PROVINCIA STATO");
    PAN_ESTERI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTERI_PROVINCSTATO, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTERI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTERI_PROVINCSTATO, MyGlb.PANEL_FORM, 100);
    PAN_ESTERI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTERI_PROVINCSTATO, MyGlb.PANEL_FORM, 1);
    PAN_ESTERI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTERI_PROVINCSTATO, MyGlb.PANEL_FORM, "PROV. STATO");
    PAN_ESTERI.SetFieldPage(PFL_ESTERI_PROVINCSTATO, -1, -1);
    PAN_ESTERI.SetFieldPanel(PFL_ESTERI_PROVINCSTATO, PPQRY_COMUNI36, "A.PROVINCIA_STATO", "PROVINCIA_STATO", 1, 3, 0, -13997);
    PAN_ESTERI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTERI_CAP, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTERI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTERI_CAP, MyGlb.PANEL_LIST, 28);
    PAN_ESTERI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTERI_CAP, MyGlb.PANEL_LIST, 1);
    PAN_ESTERI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTERI_CAP, MyGlb.PANEL_LIST, "CAP");
    PAN_ESTERI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTERI_CAP, MyGlb.PANEL_FORM, 4, 76, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTERI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTERI_CAP, MyGlb.PANEL_FORM, 28);
    PAN_ESTERI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTERI_CAP, MyGlb.PANEL_FORM, 1);
    PAN_ESTERI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTERI_CAP, MyGlb.PANEL_FORM, "CAP");
    PAN_ESTERI.SetFieldPage(PFL_ESTERI_CAP, -1, -1);
    PAN_ESTERI.SetFieldPanel(PFL_ESTERI_CAP, PPQRY_COMUNI36, "A.CAP", "CAP", 1, 5, 0, -13997);
    PAN_ESTERI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTERI_SIGLISO3ALPH, MyGlb.PANEL_LIST, 388, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTERI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTERI_SIGLISO3ALPH, MyGlb.PANEL_LIST, 140);
    PAN_ESTERI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTERI_SIGLISO3ALPH, MyGlb.PANEL_LIST, 1);
    PAN_ESTERI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTERI_SIGLISO3ALPH, MyGlb.PANEL_LIST, "Sigla Stato");
    PAN_ESTERI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTERI_SIGLISO3ALPH, MyGlb.PANEL_FORM, 4, 76, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTERI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTERI_SIGLISO3ALPH, MyGlb.PANEL_FORM, 140);
    PAN_ESTERI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTERI_SIGLISO3ALPH, MyGlb.PANEL_FORM, 1);
    PAN_ESTERI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTERI_SIGLISO3ALPH, MyGlb.PANEL_FORM, "Sigla Stato");
    PAN_ESTERI.SetFieldPage(PFL_ESTERI_SIGLISO3ALPH, -1, -1);
    PAN_ESTERI.SetFieldPanel(PFL_ESTERI_SIGLISO3ALPH, PPQRY_COMUNI36, "B.SIGLA_ISO3166_ALPHA2", "COADSTTESIIA", 5, 2, 0, -13997);
    PAN_ESTERI.set_Alignment(PFL_ESTERI_SIGLISO3ALPH, 3);
  }

  private void PAN_ESTERI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESTERI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ESTERI.SetIMDB(IMDB, "PQRY_COMUNI36", true);
    PAN_ESTERI.set_SetString(MyGlb.MASTER_ROWNAME, "COMUNI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROVINCIA_STATO as PROVINCIA_STATO, ");
    SQL.append("  A.COMUNE as COMUNE, ");
    SQL.append("  A.DENOMINAZIONE as DENOMINAZIONE, ");
    SQL.append("  A.CAP as CAP, ");
    SQL.append("  B.SIGLA_ISO3166_ALPHA2 as COADSTTESIIA ");
    PAN_ESTERI.SetQuery(PPQRY_COMUNI36, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  AD4_COMUNI A, ");
    SQL.append("  AD4_STATI_TERRITORI B ");
    PAN_ESTERI.SetQuery(PPQRY_COMUNI36, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.COMUNE = 0) ");
    SQL.append("and   (A.PROVINCIA_STATO = B.STATO_TERRITORIO(+)) ");
    SQL.append("and   (NVL(A.DATA_SOPPRESSIONE, TO_DATE('2999-12-31','YYYY-MM-DD')) > NVL(~~TBL_FORM1.ROWNAMEDATA~~, TRUNC( SYSDATE ))) ");
    SQL.append("and   (NVL(A.DATA_SOPPRESSIONE, TO_DATE('2999-12-31','YYYY-MM-DD')) = ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  MIN(NVL(C.DATA_SOPPRESSIONE, TO_DATE('2999-12-31','YYYY-MM-DD'))) ");
    SQL.append("from ");
    SQL.append("  AD4_COMUNI C ");
    SQL.append("where ((C.SIGLA_CFIS = A.SIGLA_CFIS AND NOT ((C.SIGLA_CFIS IS NULL)) OR (C.COMUNE = A.COMUNE) AND C.PROVINCIA_STATO = A.PROVINCIA_STATO AND (C.SIGLA_CFIS IS NULL))) ");
    SQL.append("and   (NVL(C.DATA_SOPPRESSIONE, TO_DATE('2999-12-31','YYYY-MM-DD')) > NVL(~~TBL_FORM1.ROWNAMEDATA~~, TRUNC( SYSDATE ))) ");
    SQL.append(")) ");
    PAN_ESTERI.SetQuery(PPQRY_COMUNI36, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTERI.SetQuery(PPQRY_COMUNI36, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTERI.SetQuery(PPQRY_COMUNI36, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.DENOMINAZIONE ");
    PAN_ESTERI.SetQuery(PPQRY_COMUNI36, 5, SQL, -1, "");
    PAN_ESTERI.SetQueryDB(PPQRY_COMUNI36, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESTERI.SetMasterTable(0, "AD4_COMUNI");
    PAN_ESTERI.AddToSortList(PFL_ESTERI_DENOMINAZION, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESTERI.Status() == 2)
    {
      int oldListQBE = PAN_ESTERI.iUseListQBE;
      PAN_ESTERI.iUseListQBE = 0;
      PAN_ESTERI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESTERI.PanelCommand(Glb.PCM_FIND);
      PAN_ESTERI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_COMUNI) PAN_COMUNI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ESTERI) PAN_ESTERI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_COMUNI) PAN_COMUNI_ValidateRow(Cancel);
    if (SrcObj == PAN_ESTERI) PAN_ESTERI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_COMUNI) PAN_COMUNI_DynamicProperties();
    if (SrcObj == PAN_ESTERI) PAN_ESTERI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_COMUNI) PAN_COMUNI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ESTERI) PAN_ESTERI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_COMUNI) PAN_COMUNI_OnChangeRow();
    if (SrcObj == PAN_ESTERI) PAN_ESTERI_OnChangeRow();
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
    if (SrcObj == PAN_COMUNI) PAN_COMUNI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ESTERI) PAN_ESTERI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_NEWTABBEVIEW) TAB_NEWTABBEVIEW_Click(PreviousPage, Cancel);
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
