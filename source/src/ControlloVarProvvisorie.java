// **********************************************
// Controllo Var Provvisorie
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloVarProvvisorie extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_PARTE = 0;

  private static int PPQRY_PARAM121 = 0;


  IDPanel PAN_PARAM;
  private static int GRP_VARPROVVISOR_COMPETENZA = 0;
  private static int GRP_VARPROVVISOR_CASSA = 1;

  private static int PFL_VARPROVVISOR_ESERCIZIO = 0;
  private static int PFL_VARPROVVISOR_ES = 1;
  private static int PFL_VARPROVVISOR_MISSIOTITOLO = 2;
  private static int PFL_VARPROVVISOR_PROGRATIPOLO = 3;
  private static int PFL_VARPROVVISOR_CODICE = 4;
  private static int PFL_VARPROVVISOR_CAPITOLO = 5;
  private static int PFL_VARPROVVISOR_ARTICOLO = 6;
  private static int PFL_VARPROVVISOR_DESCRIZIOCAP = 7;
  private static int PFL_VARPROVVISOR_ATTUALCOMPET = 8;
  private static int PFL_VARPROVVISOR_IMPORTO = 9;
  private static int PFL_VARPROVVISOR_TOTALECOMPET = 10;
  private static int PFL_VARPROVVISOR_RESIDUI = 11;
  private static int PFL_VARPROVVISOR_ATTUALECASSA = 12;
  private static int PFL_VARPROVVISOR_IMPORTOCASSA = 13;
  private static int PFL_VARPROVVISOR_TOTALECASSA = 14;
  private static int PFL_VARPROVVISOR_DIFFERENZA = 15;
  private static int PFL_VARPROVVISOR_INFOVARIAZIO = 16;

  private static int PPQRY_VARCOMPRO8 = 0;


  IDPanel PAN_VARPROVVISOR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM123(IMDB);
    //
    //
    Init_PQRY_VARCOMPRO8(IMDB);
    Init_PQRY_PARAM121(IMDB);
    Init_PQRY_PARAM121_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM123(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAM123, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAM123, "TBL_PARAM123");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM123,IMDBDef4.FLD_PARAM123_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM123,IMDBDef4.FLD_PARAM123_PARAMPARTE,5,1,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAM123, 0);
  }

  private static void Init_PQRY_VARCOMPRO8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOMPRO8, 17);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOMPRO8, "PQRY_VARCOMPRO8");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARCMISSTITO, "VARCMISSTITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARCMISSTITO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARCPROGTIPO, "VARCPROGTIPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARCPROGTIPO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARCOMPMACRO, "VARCOMPMACRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARCOMPMACRO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARVISRICAE1, "VARVISRICAE1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARVISRICAE1,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARVISRICAES, "VARVISRICAES");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARVISRICAES,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARVISRICACA, "VARVISRICACA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARVISRICACA,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARVISRICAAR, "VARVISRICAAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARVISRICAAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARCODESCCAP, "VARCODESCCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARCODESCCAP,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARCATTUCOMP, "VARCATTUCOMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARCATTUCOMP,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARVARPROCOM, "VARVARPROCOM");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARVARPROCOM,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_TOTALECOMPET, "TOTALECOMPET");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_TOTALECOMPET,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_RESIDUI, "RESIDUI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_RESIDUI,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_ATTUALECASSA, "ATTUALECASSA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_ATTUALECASSA,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARVARPROCAS, "VARVARPROCAS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_VARVARPROCAS,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_TOTALECASSA, "TOTALECASSA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_TOTALECASSA,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_DIFFERENZA, "DIFFERENZA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_DIFFERENZA,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_INFOVARIAZIO, "INFOVARIAZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO8,IMDBDef12.PQSL_VARCOMPRO8_INFOVARIAZIO,5,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOMPRO8, 0);
  }

  private static void Init_PQRY_PARAM121(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAM121, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAM121, "PQRY_PARAM121");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM121,IMDBDef12.PQSL_PARAM121_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM121,IMDBDef12.PQSL_PARAM121_PARAMPARTE,5,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAM121, 0);
  }

  private static void Init_PQRY_PARAM121_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAM121_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAM121_RS, "PQRY_PARAM121_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM121_RS,IMDBDef12.PQSL_PARAM121_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM121_RS,IMDBDef12.PQSL_PARAM121_PARAMPARTE,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloVarProvvisorie(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloVarProvvisorie()
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
    FormIdx = MyGlb.FRM_CONTRVARPROV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FA1ED8C8-D8FF-4555-ACF4-590999A529E3";
    ResModeW = 3;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 732;
    DesignHeight = 394;
    set_Caption(new IDVariant("Controllo Var. Provvisorie"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 732;
    Frames[1].Height = 368;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0978261;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 732;
    Frames[2].Height = 36;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 36;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 732-MyGlb.PAN_OFFS_X, 36-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FA9628DB-CCD0-4D20-9AEC-5707C83C12BC");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 64, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 1;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 732;
    Frames[3].Height = 332;
    Frames[3].Caption = "Var. Provvisorie";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 332;
    PAN_VARPROVVISOR = new IDPanel(w, this, 3, "PAN_VARPROVVISOR");
    Frames[3].Content = PAN_VARPROVVISOR;
    PAN_VARPROVVISOR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARPROVVISOR.VS = MainFrm.VisualStyleList;
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 732-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "380E0096-C504-4A06-970B-A531AE9EE89D");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1388, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARPROVVISOR.InitStatus = 2;
    PAN_VARPROVVISOR_Init();
    PAN_VARPROVVISOR_InitFields();
    PAN_VARPROVVISOR_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_APRISTAMPA8+BaseCmdLinIdx)
      {
        ApriStampa();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAM123, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTRVARPROV_PARAM121();
      }
      PAN_VARPROVVISOR.UpdatePanel(MainFrm);
      PAN_PARAM.UpdatePanel(MainFrm);
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
    return (obj instanceof ControlloVarProvvisorie);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloVarProvvisorie.class.getName() : (Glb.ClassWithPackage(ControlloVarProvvisorie.class) ? ControlloVarProvvisorie.class.getName().substring(ControlloVarProvvisorie.class.getPackage().getName().length() + 1) : ControlloVarProvvisorie.class.getName()));
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
      IMDB.set_Value(IMDBDef4.TBL_PARAM123, IMDBDef4.FLD_PARAM123_PARAMPARTE, 0, (new IDVariant("E")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloVarProvvisorie", "Load", _e);
    }
  }

  // **********************************************************************
  // Var Provvisorie On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARPROVVISOR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARPROVVISOR);
      // 
      // Var Provvisorie On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef12.PQRY_VARCOMPRO8, IMDBDef12.PQSL_VARCOMPRO8_DIFFERENZA, 0).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_VARPROVVISOR.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARPROVVISOR_DIFFERENZA,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_VARPROVVISOR.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARPROVVISOR_DIFFERENZA,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
      PAN_VARPROVVISOR.set_ToolTip(Glb.OBJ_FIELD,PFL_VARPROVVISOR_DESCRIZIOCAP,(new IDVariant(PAN_VARPROVVISOR.FieldText(PFL_VARPROVVISOR_DESCRIZIOCAP))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloVarProvvisorie", "VarProvvisorieOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Var Provvisorie On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VARPROVVISOR_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Var Provvisorie On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(131072)), true))
      {
        if (UserOperation.booleanValue())
        {
          PAN_VARPROVVISOR.SetFlags (Glb.OBJ_FIELD, PFL_VARPROVVISOR_ES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARPROVVISOR.SetFlags (Glb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          new IDVariant(PAN_VARPROVVISOR.ExportData((new IDVariant(-1)).booleanValue(),false)); 
          PAN_VARPROVVISOR.SetFlags (Glb.OBJ_FIELD, PFL_VARPROVVISOR_ES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARPROVVISOR.SetFlags (Glb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloVarProvvisorie", "VarProvvisorieOnCommand", _e);
    }
  }

  // **********************************************************************
  // Param On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAM121, IMDBDef12.PQSL_PARAM121_PARAMPARTE, 0).equals((new IDVariant("E")), true))
      {
        IDVariant v_TITOLO = new IDVariant(0,IDVariant.STRING);
        v_TITOLO = (new IDVariant("Titolo"));
        IDVariant v_TIPOLOGIA = new IDVariant(0,IDVariant.STRING);
        v_TIPOLOGIA = (new IDVariant("Tipologia"));
        PAN_VARPROVVISOR.set_Header(Glb.OBJ_FIELD,PFL_VARPROVVISOR_MISSIOTITOLO, new IDVariant(v_TITOLO).stringValue());
        PAN_VARPROVVISOR.set_Header(Glb.OBJ_FIELD,PFL_VARPROVVISOR_PROGRATIPOLO, new IDVariant(v_TIPOLOGIA).stringValue());
      }
      else
      {
        IDVariant v_MISSIONE = new IDVariant(0,IDVariant.STRING);
        v_MISSIONE = (new IDVariant("Missione"));
        IDVariant v_PROGRAMMA = new IDVariant(0,IDVariant.STRING);
        v_PROGRAMMA = (new IDVariant("Programma"));
        PAN_VARPROVVISOR.set_Header(Glb.OBJ_FIELD,PFL_VARPROVVISOR_MISSIOTITOLO, new IDVariant(v_MISSIONE).stringValue());
        PAN_VARPROVVISOR.set_Header(Glb.OBJ_FIELD,PFL_VARPROVVISOR_PROGRATIPOLO, new IDVariant(v_PROGRAMMA).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloVarProvvisorie", "ParamOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Info Variazioni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoVariazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Variazioni Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAM124, IMDBDef4.FLD_PARAM124_PARAMESERCIZ, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO8, IMDBDef12.PQSL_VARCOMPRO8_VARVISRICAE1, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAM124, IMDBDef4.FLD_PARAM124_PARAMPARTE, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO8, IMDBDef12.PQSL_VARCOMPRO8_VARVISRICAES, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAM124, IMDBDef4.FLD_PARAM124_PARAMCAPITOL, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO8, IMDBDef12.PQSL_VARCOMPRO8_VARVISRICACA, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAM124, IMDBDef4.FLD_PARAM124_PARAMARTICOL, 0, IMDB.Value(IMDBDef12.PQRY_VARCOMPRO8, IMDBDef12.PQSL_VARCOMPRO8_VARVISRICAAR, 0));
      MainFrm.Show(MyGlb.FRM_ELENVARICAPI, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloVarProvvisorie", "InfoVariazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Stampa
  // **********************************************************************
  public int ApriStampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Stampa Body
      // Corpo Procedura
      // 
      // 
      // 19/05/2016 SB: Aggiunto parametro Entrata/Spesa
      // 
      IDVariant v_SPAR1 = new IDVariant(0,IDVariant.STRING);
      v_SPAR1 = (new IDVariant("ESERCIZIO"));
      IDVariant v_SPAR2 = null;
      v_SPAR2 = (new IDVariant("E_S"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Controllo_Var_Prov"));
      MainFrm.SetParametroStampaJasper(v_SPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_SPAR2, IMDB.Value(IMDBDef12.PQRY_PARAM121, IMDBDef12.PQSL_PARAM121_PARAMPARTE, 0));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloVarProvvisorie", "ApriStampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CONTRVARPROV_PARAM121() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAM121_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM123, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAM123, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAM121_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAM121_RS, 0, IMDBDef4.TBL_PARAM123, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM121_RS, 0, 0, IMDBDef4.TBL_PARAM123, IMDBDef4.FLD_PARAM123_PARAMPARTE, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAM123, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAM123, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM123, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAM121_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VARPROVVISOR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARPROVVISOR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARPROVVISOR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARPROVVISOR, Cancel);
    // Stub
  }

  private void PAN_VARPROVVISOR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARPROVVISOR_INFOVARIAZIO)
    {
      this.IdxPanelActived = this.PAN_VARPROVVISOR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVariazioni();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARPROVVISOR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARPROVVISOR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARPROVVISOR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARPROVVISOR_Init()
  {

    PAN_VARPROVVISOR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARPROVVISOR.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_COMPETENZA, "1403F686-32F6-40E6-A4DB-CF4E092FDBE8");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_COMPETENZA, "Competenza");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_COMPETENZA, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_COMPETENZA, MyGlb.VIS_GROUPSTYLE);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_COMPETENZA, MyGlb.PANEL_LIST, 500, -9999, 324, 16, 0, 0);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_COMPETENZA, MyGlb.PANEL_FORM, 0, 51, 284, 97, 0, 0);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_COMPETENZA, 0, 71);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_COMPETENZA, 1, 13);
    PAN_VARPROVVISOR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_COMPETENZA, 0, 4);
    PAN_VARPROVVISOR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_COMPETENZA, 1, 4);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_COMPETENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_CASSA, "82A65D8B-6334-48B1-A777-81AA74C42099");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_CASSA, "Cassa");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_CASSA, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_CASSA, MyGlb.VIS_GROUPSTYLE);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_CASSA, MyGlb.PANEL_LIST, 932, -9999, 324, 16, 0, 0);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_CASSA, MyGlb.PANEL_FORM, 0, -21, 488, 241, 0, 0);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_CASSA, 0, 33);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_CASSA, 1, 13);
    PAN_VARPROVVISOR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_CASSA, 0, 4);
    PAN_VARPROVVISOR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_CASSA, 1, 4);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_GROUP, GRP_VARPROVVISOR_CASSA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARPROVVISOR.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ESERCIZIO, "AAC6C6D2-22EB-4D55-B3A4-49F74B3B4649");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ESERCIZIO, "ESERCIZIO");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ESERCIZIO, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ES, "25A1EF3E-BE32-4684-A881-75FD5272C9D2");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ES, "Parte");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ES, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ES, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ES, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_MISSIOTITOLO, "33358AEF-ED62-4DDE-B469-298BDFBE558B");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_MISSIOTITOLO, "Missione/Titolo");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_MISSIOTITOLO, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_MISSIOTITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_MISSIOTITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_PROGRATIPOLO, "36395B61-CEBA-494D-8B30-15D1DDA3977F");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_PROGRATIPOLO, "Programma/Tipologia");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_PROGRATIPOLO, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_PROGRATIPOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_PROGRATIPOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CODICE, "1F8BC6D7-D563-49E7-98E0-248701AFA9A8");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CODICE, "Macro");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CODICE, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CAPITOLO, "006EE60A-81B1-4BF1-B846-43430E11374C");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CAPITOLO, "Capitolo");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CAPITOLO, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ARTICOLO, "1338120D-3478-4895-96D4-5CA366E2F570");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ARTICOLO, "Art.");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ARTICOLO, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DESCRIZIOCAP, "F32A7835-450D-4B7C-8A16-892543B86C45");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DESCRIZIOCAP, "Descrizione");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DESCRIZIOCAP, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DESCRIZIOCAP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DESCRIZIOCAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALCOMPET, "F3108F09-0B79-4852-958D-299C5B426939");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALCOMPET, "Attuale");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALCOMPET, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALCOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALCOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTO, "FC44D7EE-1C06-47C7-9919-3CD2C3A482DF");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTO, "Var. Provv.");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTO, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECOMPET, "30F9C346-216A-41A4-B8B4-B2CDB4B8600A");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECOMPET, "Totale");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECOMPET, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_RESIDUI, "1FDA35D9-D75D-4BAE-95C4-7D7850B77660");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_RESIDUI, "Residui");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_RESIDUI, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_RESIDUI, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_RESIDUI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALECASSA, "3B083621-0052-4C14-A9A6-956287144726");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALECASSA, "Attuale");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALECASSA, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALECASSA, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALECASSA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTOCASSA, "F372440F-F3E9-47D0-9D51-70752E9B2D05");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTOCASSA, "Var. Provv.");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTOCASSA, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTOCASSA, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTOCASSA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECASSA, "FF1C07DC-F8F8-42DA-963A-B60B3B8E930E");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECASSA, "Totale");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECASSA, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECASSA, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECASSA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DIFFERENZA, "7D1D333A-C0CF-4971-9D29-6CDEB61ADF57");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DIFFERENZA, "Differenza");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DIFFERENZA, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DIFFERENZA, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DIFFERENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_VARPROVVISOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, "DC18F286-77FE-4CDE-8B37-56DA0EE40DA8");
    PAN_VARPROVVISOR.set_Header(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, " ");
    PAN_VARPROVVISOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, "");
    PAN_VARPROVVISOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARPROVVISOR.SetFlags(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARPROVVISOR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ESERCIZIO, MyGlb.PANEL_FORM, 132, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_ESERCIZIO, -1, -1);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_ESERCIZIO, PPQRY_VARCOMPRO8, "A.ESERCIZIO", "VARVISRICAE1", 1, 4, 0, -13997);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ES, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ES, MyGlb.PANEL_LIST, 24);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ES, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ES, MyGlb.PANEL_LIST, "Parte");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ES, MyGlb.PANEL_FORM, 268, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ES, MyGlb.PANEL_FORM, 40);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ES, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ES, MyGlb.PANEL_FORM, "Parte");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_ES, -1, -1);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_ES, PPQRY_VARCOMPRO8, "A.E_S", "VARVISRICAES", 5, 1, 0, -13997);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_MISSIOTITOLO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_MISSIOTITOLO, MyGlb.PANEL_LIST, 108);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_MISSIOTITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_MISSIOTITOLO, MyGlb.PANEL_LIST, "Missione Titolo");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_MISSIOTITOLO, MyGlb.PANEL_FORM, 4, 244, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_MISSIOTITOLO, MyGlb.PANEL_FORM, 108);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_MISSIOTITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_MISSIOTITOLO, MyGlb.PANEL_FORM, "Missione/Titolo");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_MISSIOTITOLO, -1, -1);
    PAN_VARPROVVISOR.SetFieldUnbound(PFL_VARPROVVISOR_MISSIOTITOLO, true);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_MISSIOTITOLO, PPQRY_VARCOMPRO8, "DECODE(A.E_S, 'E', SUBSTR(A.CODICE_STRUTTURA, 1, 1), SUBSTR(A.CODICE_STRUTTURA, 1, 2))", "VARCMISSTITO", 5, 99, 0, -13997);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_PROGRATIPOLO, MyGlb.PANEL_LIST, 60, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_PROGRATIPOLO, MyGlb.PANEL_LIST, 148);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_PROGRATIPOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_PROGRATIPOLO, MyGlb.PANEL_LIST, "Programma Tipologia");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_PROGRATIPOLO, MyGlb.PANEL_FORM, 4, 268, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_PROGRATIPOLO, MyGlb.PANEL_FORM, 148);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_PROGRATIPOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_PROGRATIPOLO, MyGlb.PANEL_FORM, "Programma/Tipologia");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_PROGRATIPOLO, -1, -1);
    PAN_VARPROVVISOR.SetFieldUnbound(PFL_VARPROVVISOR_PROGRATIPOLO, true);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_PROGRATIPOLO, PPQRY_VARCOMPRO8, "DECODE(A.E_S, 'E', SUBSTR(A.CODICE_STRUTTURA, 2, 4), SUBSTR(A.CODICE_STRUTTURA, 3, 2))", "VARCPROGTIPO", 5, 99, 0, -13997);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CODICE, MyGlb.PANEL_LIST, 136, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CODICE, MyGlb.PANEL_LIST, "Macro");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CODICE, MyGlb.PANEL_FORM, 4, 292, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CODICE, MyGlb.PANEL_FORM, "Macro");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_CODICE, -1, -1);
    PAN_VARPROVVISOR.SetFieldUnbound(PFL_VARPROVVISOR_CODICE, true);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_CODICE, PPQRY_VARCOMPRO8, "A_GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,4,'SI','MACRO')", "VARCOMPMACRO", 5, 99, 0, -13997);
    PAN_VARPROVVISOR.set_Mask(PFL_VARPROVVISOR_CODICE, "##########");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CAPITOLO, MyGlb.PANEL_LIST, 220, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CAPITOLO, MyGlb.PANEL_FORM, 72);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_CAPITOLO, -1, -1);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_CAPITOLO, PPQRY_VARCOMPRO8, "A.CAPITOLO", "VARVISRICACA", 3, 16, 0, -13997);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ARTICOLO, MyGlb.PANEL_LIST, 336, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ARTICOLO, MyGlb.PANEL_FORM, 140, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ARTICOLO, MyGlb.PANEL_FORM, 80);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_ARTICOLO, -1, -1);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_ARTICOLO, PPQRY_VARCOMPRO8, "A.ARTICOLO", "VARVISRICAAR", 1, 2, 0, -13997);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DESCRIZIOCAP, MyGlb.PANEL_LIST, 368, 36, 132, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DESCRIZIOCAP, MyGlb.PANEL_LIST, 108);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DESCRIZIOCAP, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DESCRIZIOCAP, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DESCRIZIOCAP, MyGlb.PANEL_FORM, 4, 316, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DESCRIZIOCAP, MyGlb.PANEL_FORM, 108);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DESCRIZIOCAP, MyGlb.PANEL_FORM, 2);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DESCRIZIOCAP, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_DESCRIZIOCAP, -1, -1);
    PAN_VARPROVVISOR.SetFieldUnbound(PFL_VARPROVVISOR_DESCRIZIOCAP, true);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_DESCRIZIOCAP, PPQRY_VARCOMPRO8, "A.DESCRIZIONE", "VARCODESCCAP", 5, 140, 0, -13997);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALCOMPET, MyGlb.PANEL_LIST, 500, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALCOMPET, MyGlb.PANEL_LIST, 124);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALCOMPET, MyGlb.PANEL_LIST, "Attuale");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALCOMPET, MyGlb.PANEL_FORM, 4, 100, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALCOMPET, MyGlb.PANEL_FORM, 124);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALCOMPET, MyGlb.PANEL_FORM, "Attuale");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_ATTUALCOMPET, -1, GRP_VARPROVVISOR_COMPETENZA);
    PAN_VARPROVVISOR.SetFieldUnbound(PFL_VARPROVVISOR_ATTUALCOMPET, true);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_ATTUALCOMPET, PPQRY_VARCOMPRO8, "NVL(B.STN_INI_CO, 0) + NVL(B.VARIAZIONI_CO, 0)", "VARCATTUCOMP", 3, 28, 6, -13997);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTO, MyGlb.PANEL_LIST, 608, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTO, MyGlb.PANEL_LIST, "Var. Provv.");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTO, MyGlb.PANEL_FORM, 4, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTO, MyGlb.PANEL_FORM, 72);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTO, MyGlb.PANEL_FORM, "Var. Provv.");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_IMPORTO, -1, GRP_VARPROVVISOR_COMPETENZA);
    PAN_VARPROVVISOR.SetFieldUnbound(PFL_VARPROVVISOR_IMPORTO, true);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_IMPORTO, PPQRY_VARCOMPRO8, "SUM(NVL(C.IMPORTO, 0))", "VARVARPROCOM", 3, 28, 6, -13997);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECOMPET, MyGlb.PANEL_LIST, 716, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECOMPET, MyGlb.PANEL_LIST, 120);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECOMPET, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECOMPET, MyGlb.PANEL_LIST, "Totale");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECOMPET, MyGlb.PANEL_FORM, 4, 124, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECOMPET, MyGlb.PANEL_FORM, 120);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECOMPET, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECOMPET, MyGlb.PANEL_FORM, "Totale");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_TOTALECOMPET, -1, GRP_VARPROVVISOR_COMPETENZA);
    PAN_VARPROVVISOR.SetFieldUnbound(PFL_VARPROVVISOR_TOTALECOMPET, true);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_TOTALECOMPET, PPQRY_VARCOMPRO8, "(NVL(B.STN_INI_CO, 0) + NVL(B.VARIAZIONI_CO, 0)) + SUM(NVL(C.IMPORTO, 0))", "TOTALECOMPET", 3, 28, 6, -13997);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_RESIDUI, MyGlb.PANEL_LIST, 824, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_RESIDUI, MyGlb.PANEL_LIST, 52);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_RESIDUI, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_RESIDUI, MyGlb.PANEL_LIST, "Residui");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_RESIDUI, MyGlb.PANEL_FORM, 4, 148, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_RESIDUI, MyGlb.PANEL_FORM, 52);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_RESIDUI, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_RESIDUI, MyGlb.PANEL_FORM, "Residui");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_RESIDUI, -1, -1);
    PAN_VARPROVVISOR.SetFieldUnbound(PFL_VARPROVVISOR_RESIDUI, true);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_RESIDUI, PPQRY_VARCOMPRO8, "GET_IMPORTI_SCHEDA_INFO(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'RES_IMP_ACC','CAP',DECODE(A.E_S, 'E', SUBSTR(A.CODICE_STRUTTURA, 1, 1), SUBSTR(A.CODICE_STRUTTURA, 1, 2)),NULL,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NULL,to_number(NULL),NULL,NULL,to_number(NULL),to_number(NULL),to_number(NULL),NULL,to_number(NULL))", "RESIDUI", 3, 28, 6, -13997);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALECASSA, MyGlb.PANEL_LIST, 932, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALECASSA, MyGlb.PANEL_LIST, 88);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALECASSA, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALECASSA, MyGlb.PANEL_LIST, "Attuale");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALECASSA, MyGlb.PANEL_FORM, 4, 172, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALECASSA, MyGlb.PANEL_FORM, 88);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALECASSA, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_ATTUALECASSA, MyGlb.PANEL_FORM, "Attuale");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_ATTUALECASSA, -1, GRP_VARPROVVISOR_CASSA);
    PAN_VARPROVVISOR.SetFieldUnbound(PFL_VARPROVVISOR_ATTUALECASSA, true);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_ATTUALECASSA, PPQRY_VARCOMPRO8, "NVL(B.STN_INI_CA, 0) + NVL(B.VARIAZIONI_CA, 0)", "ATTUALECASSA", 3, 28, 6, -13997);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTOCASSA, MyGlb.PANEL_LIST, 1040, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTOCASSA, MyGlb.PANEL_LIST, 32);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTOCASSA, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTOCASSA, MyGlb.PANEL_LIST, "Var. Provv.");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTOCASSA, MyGlb.PANEL_FORM, 388, 4, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTOCASSA, MyGlb.PANEL_FORM, 20);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTOCASSA, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_IMPORTOCASSA, MyGlb.PANEL_FORM, "Var. Provv.");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_IMPORTOCASSA, -1, GRP_VARPROVVISOR_CASSA);
    PAN_VARPROVVISOR.SetFieldUnbound(PFL_VARPROVVISOR_IMPORTOCASSA, true);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_IMPORTOCASSA, PPQRY_VARCOMPRO8, "SUM(NVL(C.IMPORTO_CASSA, 0))", "VARVARPROCAS", 3, 28, 6, -13997);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECASSA, MyGlb.PANEL_LIST, 1148, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECASSA, MyGlb.PANEL_LIST, 80);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECASSA, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECASSA, MyGlb.PANEL_LIST, "Totale");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECASSA, MyGlb.PANEL_FORM, 4, 196, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECASSA, MyGlb.PANEL_FORM, 80);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECASSA, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_TOTALECASSA, MyGlb.PANEL_FORM, "Totale");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_TOTALECASSA, -1, GRP_VARPROVVISOR_CASSA);
    PAN_VARPROVVISOR.SetFieldUnbound(PFL_VARPROVVISOR_TOTALECASSA, true);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_TOTALECASSA, PPQRY_VARCOMPRO8, "(NVL(B.STN_INI_CA, 0) + NVL(B.VARIAZIONI_CA, 0)) + SUM(NVL(C.IMPORTO_CASSA, 0))", "TOTALECASSA", 3, 28, 6, -13997);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DIFFERENZA, MyGlb.PANEL_LIST, 1256, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DIFFERENZA, MyGlb.PANEL_LIST, 68);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DIFFERENZA, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DIFFERENZA, MyGlb.PANEL_LIST, "Differenza");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DIFFERENZA, MyGlb.PANEL_FORM, 4, 220, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DIFFERENZA, MyGlb.PANEL_FORM, 68);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DIFFERENZA, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_DIFFERENZA, MyGlb.PANEL_FORM, "Differenza");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_DIFFERENZA, -1, -1);
    PAN_VARPROVVISOR.SetFieldUnbound(PFL_VARPROVVISOR_DIFFERENZA, true);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_DIFFERENZA, PPQRY_VARCOMPRO8, "(NVL(B.STN_INI_CO, 0) + NVL(B.VARIAZIONI_CO, 0) + SUM(NVL(C.IMPORTO, 0)) + GET_IMPORTI_SCHEDA_INFO(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'RES_IMP_ACC','CAP',DECODE(A.E_S, 'E', SUBSTR(A.CODICE_STRUTTURA, 1, 1), SUBSTR(A.CODICE_STRUTTURA, 1, 2)),NULL,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NULL,to_number(NULL),NULL,NULL,to_number(NULL),to_number(NULL),to_number(NULL),NULL,to_number(NULL))) - (NVL(B.STN_INI_CA, 0) + NVL(B.VARIAZIONI_CA, 0) + SUM(NVL(C.IMPORTO_CASSA, 0)))", "DIFFERENZA", 3, 28, 6, -13997);
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, MyGlb.PANEL_LIST, 1364, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, MyGlb.PANEL_LIST, 92);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, MyGlb.PANEL_LIST, " ");
    PAN_VARPROVVISOR.SetRect(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, MyGlb.PANEL_FORM, 4, 352, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARPROVVISOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, MyGlb.PANEL_FORM, 92);
    PAN_VARPROVVISOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARPROVVISOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARPROVVISOR_INFOVARIAZIO, MyGlb.PANEL_FORM, " ");
    PAN_VARPROVVISOR.SetFieldPage(PFL_VARPROVVISOR_INFOVARIAZIO, -1, -1);
    PAN_VARPROVVISOR.SetFieldUnbound(PFL_VARPROVVISOR_INFOVARIAZIO, true);
    PAN_VARPROVVISOR.SetFieldPanel(PFL_VARPROVVISOR_INFOVARIAZIO, PPQRY_VARCOMPRO8, "'I'", "INFOVARIAZIO", 5, 1, 0, -13997);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_VARPROVVISOR.SetValueListItem(PFL_VARPROVVISOR_INFOVARIAZIO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
  }

  private void PAN_VARPROVVISOR_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARPROVVISOR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VARPROVVISOR.SetIMDB(IMDB, "PQRY_VARCOMPRO8", true);
    PAN_VARPROVVISOR.set_SetString(MyGlb.MASTER_ROWNAME, "VARCOMPRO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(A.E_S, 'E', SUBSTR(A.CODICE_STRUTTURA, 1, 1), SUBSTR(A.CODICE_STRUTTURA, 1, 2)) as VARCMISSTITO, ");
    SQL.append("  DECODE(A.E_S, 'E', SUBSTR(A.CODICE_STRUTTURA, 2, 4), SUBSTR(A.CODICE_STRUTTURA, 3, 2)) as VARCPROGTIPO, ");
    SQL.append("  A_GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,4,'SI','MACRO') as VARCOMPMACRO, ");
    SQL.append("  A.ESERCIZIO as VARVISRICAE1, ");
    SQL.append("  A.E_S as VARVISRICAES, ");
    SQL.append("  A.CAPITOLO as VARVISRICACA, ");
    SQL.append("  A.ARTICOLO as VARVISRICAAR, ");
    SQL.append("  A.DESCRIZIONE as VARCODESCCAP, ");
    SQL.append("  NVL(B.STN_INI_CO, 0) + NVL(B.VARIAZIONI_CO, 0) as VARCATTUCOMP, ");
    SQL.append("  SUM(NVL(C.IMPORTO, 0)) as VARVARPROCOM, ");
    SQL.append("  (NVL(B.STN_INI_CO, 0) + NVL(B.VARIAZIONI_CO, 0)) + SUM(NVL(C.IMPORTO, 0)) as TOTALECOMPET, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'RES_IMP_ACC','CAP',DECODE(A.E_S, 'E', SUBSTR(A.CODICE_STRUTTURA, 1, 1), SUBSTR(A.CODICE_STRUTTURA, 1, 2)),NULL,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NULL,to_number(NULL),NULL,NULL,to_number(NULL),to_number(NULL),to_number(NULL),NULL,to_number(NULL)) as RESIDUI, ");
    SQL.append("  NVL(B.STN_INI_CA, 0) + NVL(B.VARIAZIONI_CA, 0) as ATTUALECASSA, ");
    SQL.append("  SUM(NVL(C.IMPORTO_CASSA, 0)) as VARVARPROCAS, ");
    SQL.append("  (NVL(B.STN_INI_CA, 0) + NVL(B.VARIAZIONI_CA, 0)) + SUM(NVL(C.IMPORTO_CASSA, 0)) as TOTALECASSA, ");
    SQL.append("  (NVL(B.STN_INI_CO, 0) + NVL(B.VARIAZIONI_CO, 0) + SUM(NVL(C.IMPORTO, 0)) + GET_IMPORTI_SCHEDA_INFO(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'RES_IMP_ACC','CAP',DECODE(A.E_S, 'E', SUBSTR(A.CODICE_STRUTTURA, 1, 1), SUBSTR(A.CODICE_STRUTTURA, 1, 2)),NULL,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NULL,to_number(NULL),NULL,NULL,to_number(NULL),to_number(NULL),to_number(NULL),NULL,to_number(NULL))) - (NVL(B.STN_INI_CA, 0) + NVL(B.VARIAZIONI_CA, 0) + SUM(NVL(C.IMPORTO_CASSA, 0))) as DIFFERENZA, ");
    SQL.append("  'I' as INFOVARIAZIO ");
    PAN_VARPROVVISOR.SetQuery(PPQRY_VARCOMPRO8, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP A, ");
    SQL.append("  BIL B, ");
    SQL.append("  VARCOMPRO C ");
    PAN_VARPROVVISOR.SetQuery(PPQRY_VARCOMPRO8, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   (C.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (C.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   (A.E_S = ~~PQRY_PARAM121.PARAMPARTE~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_VARPROVVISOR.SetQuery(PPQRY_VARCOMPRO8, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  DECODE(A.E_S, 'E', SUBSTR(A.CODICE_STRUTTURA, 1, 1), SUBSTR(A.CODICE_STRUTTURA, 1, 2)), ");
    SQL.append("  DECODE(A.E_S, 'E', SUBSTR(A.CODICE_STRUTTURA, 2, 4), SUBSTR(A.CODICE_STRUTTURA, 3, 2)), ");
    SQL.append("  A_GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,4,'SI','MACRO'), ");
    SQL.append("  A.ESERCIZIO, ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.DESCRIZIONE, ");
    SQL.append("  NVL(B.STN_INI_CO, 0) + NVL(B.VARIAZIONI_CO, 0), ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'RES_IMP_ACC','CAP',DECODE(A.E_S, 'E', SUBSTR(A.CODICE_STRUTTURA, 1, 1), SUBSTR(A.CODICE_STRUTTURA, 1, 2)),NULL,to_number(NULL),to_number(NULL),to_number(NULL),to_number(NULL),NULL,to_number(NULL),NULL,NULL,to_number(NULL),to_number(NULL),to_number(NULL),NULL,to_number(NULL)), ");
    SQL.append("  NVL(B.STN_INI_CA, 0) + NVL(B.VARIAZIONI_CA, 0) ");
    PAN_VARPROVVISOR.SetQuery(PPQRY_VARCOMPRO8, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARPROVVISOR.SetQuery(PPQRY_VARCOMPRO8, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARPROVVISOR.SetQuery(PPQRY_VARCOMPRO8, 5, SQL, -1, "");
    PAN_VARPROVVISOR.SetQueryDB(PPQRY_VARCOMPRO8, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARPROVVISOR.SetMasterTable(0, "CAP");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARPROVVISOR.Status() == 2)
    {
      int oldListQBE = PAN_VARPROVVISOR.iUseListQBE;
      PAN_VARPROVVISOR.iUseListQBE = 0;
      PAN_VARPROVVISOR.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARPROVVISOR.PanelCommand(Glb.PCM_FIND);
      PAN_VARPROVVISOR.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "4DB970B7-B6C0-4AAB-B213-84BCF6077C73");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "Parte");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 20, 8, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PARTE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PARTE, PPQRY_PARAM121, "A.PARAMPARTE", "PARAMPARTE", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM121", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM121, IMDBDef12.PQRY_PARAM121_RS, IMDBDef4.TBL_PARAM123);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PARTE, IMDBDef4.FLD_PARAM123_PARAMPARTE);
    PAN_PARAM.SetMasterTable(0, "PARAM123");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARPROVVISOR) PAN_VARPROVVISOR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARPROVVISOR) PAN_VARPROVVISOR_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARPROVVISOR) PAN_VARPROVVISOR_DynamicProperties();
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARPROVVISOR) PAN_VARPROVVISOR_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARPROVVISOR) PAN_VARPROVVISOR_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_VARPROVVISOR) PAN_VARPROVVISOR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
