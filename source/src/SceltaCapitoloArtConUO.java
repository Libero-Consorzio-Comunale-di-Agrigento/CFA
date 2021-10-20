// **********************************************
// Scelta Capitolo Art Con UO
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaCapitoloArtConUO extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_CAPITOCONTIE = 0;

  private static int PPQRY_PARAMETRI620 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_SCELTCAPIART_CAPITOLO = 0;
  private static int PFL_SCELTCAPIART_ARTICOLO = 1;
  private static int PFL_SCELTCAPIART_INFOVOCEPEG = 2;
  private static int PFL_SCELTCAPIART_MISSITITOACC = 3;
  private static int PFL_SCELTCAPIART_PROGRATIPOLO = 4;
  private static int PFL_SCELTCAPIART_TITOLO = 5;
  private static int PFL_SCELTCAPIART_DESCRIZIONE = 6;
  private static int PFL_SCELTCAPIART_ES = 7;

  private static int PPQRY_VISTABILAN10 = 0;


  IDPanel PAN_SCELTCAPIART;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI123(IMDB);
    //
    //
    Init_PQRY_VISTABILAN10(IMDB);
    Init_PQRY_PARAMETRI620(IMDB);
    Init_PQRY_PARAMETRI620_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI123(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI123, 5);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI123, "TBL_PARAMETRI123");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI123,IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI123,IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI123,IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI123,IMDBDef1.FLD_PARAMETRI123_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI123,IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI123,IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI123,IMDBDef1.FLD_PARAMETRI123_ROWNAMPROUNI, "ROWNAMPROUNI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI123,IMDBDef1.FLD_PARAMETRI123_ROWNAMPROUNI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI123,IMDBDef1.FLD_PARAMETRI123_ROWNAMCAPCON, "ROWNAMCAPCON");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI123,IMDBDef1.FLD_PARAMETRI123_ROWNAMCAPCON,5,16,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI123, 0);
  }

  private static void Init_PQRY_VISTABILAN10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_VISTABILAN10, 8);
    IMDB.set_TblCode(IMDBDef7.PQRY_VISTABILAN10, "PQRY_VISTABILAN10");
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, "VIBICABIUOCA");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, "VIBICABIUOAR");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VIBIUOINVOPE, "VIBIUOINVOPE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VIBIUOINVOPE,5,1,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOMT, "VIBICABIUOMT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOMT,5,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOPT, "VIBICABIUOPT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOPT,5,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VISTBILUOTIT, "VISTBILUOTIT");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VISTBILUOTIT,5,99,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VIBICABIUODE, "VIBICABIUODE");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VIBICABIUODE,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOES, "VIBICABIUOES");
    IMDB.SetFldParams(IMDBDef7.PQRY_VISTABILAN10,IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOES,5,1,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_VISTABILAN10, 0);
  }

  private static void Init_PQRY_PARAMETRI620(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PARAMETRI620, 1);
    IMDB.set_TblCode(IMDBDef7.PQRY_PARAMETRI620, "PQRY_PARAMETRI620");
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI620,IMDBDef7.PQSL_PARAMETRI620_ROWNAMCAPCON, "ROWNAMCAPCON");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI620,IMDBDef7.PQSL_PARAMETRI620_ROWNAMCAPCON,5,16,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_PARAMETRI620, 0);
  }

  private static void Init_PQRY_PARAMETRI620_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_PARAMETRI620_RS, 1);
    IMDB.set_TblCode(IMDBDef7.PQRY_PARAMETRI620_RS, "PQRY_PARAMETRI620_RS");
    IMDB.set_FldCode(IMDBDef7.PQRY_PARAMETRI620_RS,IMDBDef7.PQSL_PARAMETRI620_ROWNAMCAPCON, "ROWNAMCAPCON");
    IMDB.SetFldParams(IMDBDef7.PQRY_PARAMETRI620_RS,IMDBDef7.PQSL_PARAMETRI620_ROWNAMCAPCON,5,16,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaCapitoloArtConUO(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaCapitoloArtConUO()
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
    FormIdx = MyGlb.FRM_SCECAPARCOUO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E9F01E42-4F0F-4417-91BC-24533DE7A400";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 828;
    DesignHeight = 426;
    set_Caption(new IDVariant("Scelta Capitolo Art Con UO"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 828;
    Frames[1].Height = 400;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 828;
    Frames[2].Height = 40;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 40;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 828-MyGlb.PAN_OFFS_X, 40-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2C984661-4311-4883-AA16-3EB304ABF061");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 136, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 828;
    Frames[3].Height = 360;
    Frames[3].Caption = "Scelta Capitolo/Art";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 360;
    PAN_SCELTCAPIART = new IDPanel(w, this, 3, "PAN_SCELTCAPIART");
    Frames[3].Content = PAN_SCELTCAPIART;
    PAN_SCELTCAPIART.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTCAPIART.VS = MainFrm.VisualStyleList;
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 828-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTCAPIART.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C13531F0-02C2-4E1C-8FD3-4FB9D876543F");
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 4, 748, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTCAPIART.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTCAPIART.InitStatus = 2;
    PAN_SCELTCAPIART_Init();
    PAN_SCELTCAPIART_InitFields();
    PAN_SCELTCAPIART_InitQueries();
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARAMETRI123, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCECAPARCOUO_PARAMETRI620();
      }
      PAN_SCELTCAPIART.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaCapitoloArtConUO);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaCapitoloArtConUO.class.getName() : (Glb.ClassWithPackage(SceltaCapitoloArtConUO.class) ? SceltaCapitoloArtConUO.class.getName().substring(SceltaCapitoloArtConUO.class.getPackage().getName().length() + 1) : SceltaCapitoloArtConUO.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Capitolo/Art On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_SCELTCAPIART_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Capitolo/Art On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_SCELTCAPIART.Status()).equals((new IDVariant(1)), true))
      {
        PAN_SCELTCAPIART.SetFlags (Glb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SCELTCAPIART.SetFlags (Glb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaCapitoloArtConUO", "SceltaCapitolo/ArtOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Scelta Capitolo/Art On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTCAPIART_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELTCAPIART);
      // 
      // Scelta Capitolo/Art On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SCELTCAPIART.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTCAPIART_DESCRIZIONE,(new IDVariant(PAN_SCELTCAPIART.FieldText(PFL_SCELTCAPIART_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaCapitoloArtConUO", "SceltaCapitolo/ArtOnDynamicPropertiesEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Scelta Capitolo/Art.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMCAPCON, 0, (new IDVariant()));
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      Frames[PAN_SCELTCAPIART.FrIndex].set_Caption(new IDVariant(v_CAPTION).stringValue());
      PAN_SCELTCAPIART.set_Header(Glb.OBJ_FIELD,PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant()).stringValue());
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        PAN_SCELTCAPIART.set_Header(Glb.OBJ_FIELD,PFL_SCELTCAPIART_MISSITITOACC, (new IDVariant("Missione")).stringValue());
        PAN_SCELTCAPIART.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTCAPIART_MISSITITOACC,(new IDVariant("Missione")).stringValue()); 
        PAN_SCELTCAPIART.set_Header(Glb.OBJ_FIELD,PFL_SCELTCAPIART_PROGRATIPOLO, (new IDVariant("Programma")).stringValue());
        PAN_SCELTCAPIART.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTCAPIART_PROGRATIPOLO,(new IDVariant("Programma")).stringValue()); 
        PAN_SCELTCAPIART.SetFlags (Glb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SCELTCAPIART.set_Header(Glb.OBJ_FIELD,PFL_SCELTCAPIART_MISSITITOACC, (new IDVariant("Titolo")).stringValue());
        PAN_SCELTCAPIART.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTCAPIART_MISSITITOACC,(new IDVariant("Titolo")).stringValue()); 
        PAN_SCELTCAPIART.set_Header(Glb.OBJ_FIELD,PFL_SCELTCAPIART_PROGRATIPOLO, (new IDVariant("Tipologia")).stringValue());
        PAN_SCELTCAPIART.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTCAPIART_PROGRATIPOLO,(new IDVariant("Tipologia")).stringValue()); 
        PAN_SCELTCAPIART.SetFlags (Glb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0)))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("B")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaCapitoloArtConUO", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Info Voci Bilancio
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriInfoVociBilancio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Voci Bilancio Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOES, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaCapitoloArtConUO", "ApriInfoVociBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCECAPARCOUO_PARAMETRI620() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef7.PQRY_PARAMETRI620_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI123, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARAMETRI123, 0))
    {
      IMDB.TblAddNew(IMDBDef7.PQRY_PARAMETRI620_RS, 0);
      IMDB.TblLinkRow(IMDBDef7.PQRY_PARAMETRI620_RS, 0, IMDBDef1.TBL_PARAMETRI123, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_PARAMETRI620_RS, 0, 0, IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMCAPCON, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARAMETRI123, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARAMETRI123, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI123, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef7.PQRY_PARAMETRI620_RS);
    IMDB.TblSortBy(IMDBDef7.PQRY_PARAMETRI620_RS,0,true);
    IMDB.TblStartSort(IMDBDef7.PQRY_PARAMETRI620_RS);
    IMDB.TblMoveFirst(IMDBDef7.PQRY_PARAMETRI620_RS, 0);
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SCELTCAPIART_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTCAPIART, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTCAPIART_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTCAPIART, Cancel);
    // Stub
  }

  private void PAN_SCELTCAPIART_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SCELTCAPIART_INFOVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_SCELTCAPIART.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SCELTCAPIART_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTCAPIART_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTCAPIART_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTCAPIART_Init()
  {

    PAN_SCELTCAPIART.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTCAPIART.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCELTCAPIART.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_SCELTCAPIART.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_CAPITOLO, "6DB9F270-2F89-4EC0-AD44-2C1BD7BD77AE");
    PAN_SCELTCAPIART.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_CAPITOLO, "Capitolo");
    PAN_SCELTCAPIART.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_CAPITOLO, "");
    PAN_SCELTCAPIART.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SCELTCAPIART.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTCAPIART.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ARTICOLO, "981E15AB-5B6C-4AB6-A741-94BE73DCAF17");
    PAN_SCELTCAPIART.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ARTICOLO, "Articolo");
    PAN_SCELTCAPIART.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ARTICOLO, "");
    PAN_SCELTCAPIART.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTCAPIART.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTCAPIART.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, "AA41A82F-691B-46DF-A23A-DBC56013D0CF");
    PAN_SCELTCAPIART.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, "Info Voce Peg");
    PAN_SCELTCAPIART.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, "");
    PAN_SCELTCAPIART.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, MyGlb.VIS_HYPELINKIMMA);
    PAN_SCELTCAPIART.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTCAPIART.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_MISSITITOACC, "4E00A327-99E1-4DC4-9610-A91481D3E4AE");
    PAN_SCELTCAPIART.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_MISSITITOACC, "Missione Titolo Acc.");
    PAN_SCELTCAPIART.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_MISSITITOACC, "Missione");
    PAN_SCELTCAPIART.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_MISSITITOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTCAPIART.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_MISSITITOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTCAPIART.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_PROGRATIPOLO, "D5F0792B-C293-4D31-A51B-C42800186372");
    PAN_SCELTCAPIART.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_PROGRATIPOLO, "Programma Tipologia");
    PAN_SCELTCAPIART.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_PROGRATIPOLO, "Programma");
    PAN_SCELTCAPIART.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_PROGRATIPOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTCAPIART.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_PROGRATIPOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTCAPIART.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, "4CFA8F8B-3698-486F-AA35-4FE4F1866CE6");
    PAN_SCELTCAPIART.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, "Titolo");
    PAN_SCELTCAPIART.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, "Titolo");
    PAN_SCELTCAPIART.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTCAPIART.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTCAPIART.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_DESCRIZIONE, "0491E446-A79B-40E3-8A4E-5493DA1DBCCF");
    PAN_SCELTCAPIART.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_DESCRIZIONE, "Descrizione");
    PAN_SCELTCAPIART.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_DESCRIZIONE, "");
    PAN_SCELTCAPIART.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTCAPIART.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTCAPIART.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ES, "8BC346B3-6243-490F-9BD5-4EC35A7B981E");
    PAN_SCELTCAPIART.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ES, "E S");
    PAN_SCELTCAPIART.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ES, "");
    PAN_SCELTCAPIART.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ES, MyGlb.VIS_NORMFIELPADR);
    PAN_SCELTCAPIART.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ES, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELTCAPIART_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_CAPITOLO, MyGlb.PANEL_LIST, 0, 40, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_CAPITOLO, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SCELTCAPIART.SetFieldPage(PFL_SCELTCAPIART_CAPITOLO, -1, -1);
    PAN_SCELTCAPIART.SetFieldPanel(PFL_SCELTCAPIART_CAPITOLO, PPQRY_VISTABILAN10, "A.CAPITOLO", "VIBICABIUOCA", 3, 16, 0, -13997);
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ARTICOLO, MyGlb.PANEL_LIST, 136, 40, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ARTICOLO, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ARTICOLO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_SCELTCAPIART.SetFieldPage(PFL_SCELTCAPIART_ARTICOLO, -1, -1);
    PAN_SCELTCAPIART.SetFieldPanel(PFL_SCELTCAPIART_ARTICOLO, PPQRY_VISTABILAN10, "A.ARTICOLO", "VIBICABIUOAR", 1, 2, 0, -13997);
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, MyGlb.PANEL_LIST, 188, 40, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, MyGlb.PANEL_LIST, 76);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, MyGlb.PANEL_LIST, "I. V. P.");
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, MyGlb.PANEL_FORM, 4, 280, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, MyGlb.PANEL_FORM, 76);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, MyGlb.PANEL_FORM, 2);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_INFOVOCEPEG, MyGlb.PANEL_FORM, "Info Voce Peg");
    PAN_SCELTCAPIART.SetFieldPage(PFL_SCELTCAPIART_INFOVOCEPEG, -1, -1);
    PAN_SCELTCAPIART.SetFieldUnbound(PFL_SCELTCAPIART_INFOVOCEPEG, true);
    PAN_SCELTCAPIART.SetFieldPanel(PFL_SCELTCAPIART_INFOVOCEPEG, PPQRY_VISTABILAN10, "'I'", "VIBIUOINVOPE", 5, 1, 0, -13997);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_SCELTCAPIART.SetValueListItem(PFL_SCELTCAPIART_INFOVOCEPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_MISSITITOACC, MyGlb.PANEL_LIST, 208, 40, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_MISSITITOACC, MyGlb.PANEL_LIST, 56);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_MISSITITOACC, MyGlb.PANEL_LIST, 1);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_MISSITITOACC, MyGlb.PANEL_LIST, "Missione Titolo Acc.");
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_MISSITITOACC, MyGlb.PANEL_FORM, 4, 148, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_MISSITITOACC, MyGlb.PANEL_FORM, 48);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_MISSITITOACC, MyGlb.PANEL_FORM, 1);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_MISSITITOACC, MyGlb.PANEL_FORM, "M. T. A.");
    PAN_SCELTCAPIART.SetFieldPage(PFL_SCELTCAPIART_MISSITITOACC, -1, -1);
    PAN_SCELTCAPIART.SetFieldPanel(PFL_SCELTCAPIART_MISSITITOACC, PPQRY_VISTABILAN10, "A.MISSIONE_TITOLO", "VIBICABIUOMT", 5, 2, 0, -13997);
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_PROGRATIPOLO, MyGlb.PANEL_LIST, 276, 40, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_PROGRATIPOLO, MyGlb.PANEL_LIST, 140);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_PROGRATIPOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_PROGRATIPOLO, MyGlb.PANEL_LIST, "Programma Tipologia");
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_PROGRATIPOLO, MyGlb.PANEL_FORM, 4, 172, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_PROGRATIPOLO, MyGlb.PANEL_FORM, 136);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_PROGRATIPOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_PROGRATIPOLO, MyGlb.PANEL_FORM, "Programma Tipologia");
    PAN_SCELTCAPIART.SetFieldPage(PFL_SCELTCAPIART_PROGRATIPOLO, -1, -1);
    PAN_SCELTCAPIART.SetFieldPanel(PFL_SCELTCAPIART_PROGRATIPOLO, PPQRY_VISTABILAN10, "A.PROGRAMMA_TIPOLOGIA", "VIBICABIUOPT", 5, 4, 0, -13997);
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, MyGlb.PANEL_LIST, 352, 40, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, MyGlb.PANEL_LIST, 64);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, MyGlb.PANEL_FORM, 4, 196, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_SCELTCAPIART.SetFieldPage(PFL_SCELTCAPIART_TITOLO, -1, -1);
    PAN_SCELTCAPIART.SetFieldUnbound(PFL_SCELTCAPIART_TITOLO, true);
    PAN_SCELTCAPIART.SetFieldPanel(PFL_SCELTCAPIART_TITOLO, PPQRY_VISTABILAN10, "A_GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,1,'NO','MACRO')", "VISTBILUOTIT", 5, 99, 0, -13997);
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_DESCRIZIONE, MyGlb.PANEL_LIST, 412, 40, 336, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 220, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCELTCAPIART.SetFieldPage(PFL_SCELTCAPIART_DESCRIZIONE, -1, -1);
    PAN_SCELTCAPIART.SetFieldPanel(PFL_SCELTCAPIART_DESCRIZIONE, PPQRY_VISTABILAN10, "A.DESCRIZIONE", "VIBICABIUODE", 5, 140, 0, -13997);
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ES, MyGlb.PANEL_LIST, 24);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ES, MyGlb.PANEL_LIST, 1);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ES, MyGlb.PANEL_LIST, "E S");
    PAN_SCELTCAPIART.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ES, MyGlb.PANEL_FORM, 4, 280, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTCAPIART.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ES, MyGlb.PANEL_FORM, 24);
    PAN_SCELTCAPIART.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ES, MyGlb.PANEL_FORM, 1);
    PAN_SCELTCAPIART.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTCAPIART_ES, MyGlb.PANEL_FORM, "E S");
    PAN_SCELTCAPIART.SetFieldPage(PFL_SCELTCAPIART_ES, -1, -1);
    PAN_SCELTCAPIART.SetFieldPanel(PFL_SCELTCAPIART_ES, PPQRY_VISTABILAN10, "A.E_S", "VIBICABIUOES", 5, 1, 0, -13997);
  }

  private void PAN_SCELTCAPIART_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTCAPIART.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCELTCAPIART.SetIMDB(IMDB, "PQRY_VISTABILAN10", true);
    PAN_SCELTCAPIART.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA BILANCIO UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as VIBICABIUOCA, ");
    SQL.append("  A.ARTICOLO as VIBICABIUOAR, ");
    SQL.append("  'I' as VIBIUOINVOPE, ");
    SQL.append("  A.MISSIONE_TITOLO as VIBICABIUOMT, ");
    SQL.append("  A.PROGRAMMA_TIPOLOGIA as VIBICABIUOPT, ");
    SQL.append("  A_GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,1,'NO','MACRO') as VISTBILUOTIT, ");
    SQL.append("  A.DESCRIZIONE as VIBICABIUODE, ");
    SQL.append("  A.E_S as VIBICABIUOES ");
    PAN_SCELTCAPIART.SetQuery(PPQRY_VISTABILAN10, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP_BIL_UO A ");
    PAN_SCELTCAPIART.SetQuery(PPQRY_VISTABILAN10, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) > TRUNC( SYSDATE )) ");
    SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI123.ROWNAMPROUNI~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    SQL.append("and   (A.TIPO = ~~TBL_PARAMETRI123.ROWNAMETIPO~~) ");
    SQL.append("and   (A.E_S = DECODE(~~TBL_PARAMETRI123.ROWNAMEES~~, 'ES', A.E_S, ~~TBL_PARAMETRI123.ROWNAMEES~~)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRI123.ROWNAMEESERC~~) ");
    SQL.append("and   (TO_CHAR ( A.CAPITOLO ) LIKE CASE WHEN NVL(~~PQRY_PARAMETRI620.ROWNAMCAPCON~~, '') = '' THEN TO_CHAR ( A.CAPITOLO ) ELSE '%' || ~~PQRY_PARAMETRI620.ROWNAMCAPCON~~ || '%' END) ");
    PAN_SCELTCAPIART.SetQuery(PPQRY_VISTABILAN10, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTCAPIART.SetQuery(PPQRY_VISTABILAN10, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTCAPIART.SetQuery(PPQRY_VISTABILAN10, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTCAPIART.SetQuery(PPQRY_VISTABILAN10, 5, SQL, -1, "");
    PAN_SCELTCAPIART.SetQueryDB(PPQRY_VISTABILAN10, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTCAPIART.SetMasterTable(0, "CAP_BIL_UO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTCAPIART.Status() == 2)
    {
      int oldListQBE = PAN_SCELTCAPIART.iUseListQBE;
      PAN_SCELTCAPIART.iUseListQBE = 0;
      PAN_SCELTCAPIART.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTCAPIART.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTCAPIART.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, "63123092-0156-4E5F-92D5-7257729BCCC7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, "Capitolo contiene");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_LIST, "Capitolo contiene");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_FORM, 8, 8, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOCONTIE, MyGlb.PANEL_FORM, "Capitolo contiene");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPITOCONTIE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPITOCONTIE, PPQRY_PARAMETRI620, "A.ROWNAMCAPCON", "ROWNAMCAPCON", 5, 16, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI620", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI620, IMDBDef7.PQRY_PARAMETRI620_RS, IMDBDef1.TBL_PARAMETRI123);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAPITOCONTIE, IMDBDef1.FLD_PARAMETRI123_ROWNAMCAPCON);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI123");
    PAN_PARAMETRI.AddToSortList(PFL_PARAMETRI_CAPITOCONTIE, true);
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
    if (SrcObj == PAN_SCELTCAPIART) PAN_SCELTCAPIART_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTCAPIART) PAN_SCELTCAPIART_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTCAPIART) PAN_SCELTCAPIART_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTCAPIART) PAN_SCELTCAPIART_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTCAPIART) PAN_SCELTCAPIART_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_SCELTCAPIART) PAN_SCELTCAPIART_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
