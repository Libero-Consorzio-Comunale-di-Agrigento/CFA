// **********************************************
// Generazione Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GenerazioneVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_VARIAZIONI = 0;

  private static int PFL_PARAM_PROPOSTA = 0;
  private static int PFL_PARAM_NUMPROPOSTA = 1;
  private static int PFL_PARAM_ANNOPROPOSTA = 2;
  private static int PFL_PARAM_DELIBERA = 3;
  private static int PFL_PARAM_NUMDELIBERA = 4;
  private static int PFL_PARAM_ANNODELIBERA = 5;
  private static int PFL_PARAM_DATAVARIAZIO = 6;
  private static int PFL_PARAM_VARIAZIONI = 7;
  private static int PFL_PARAM_NUOVCAMPSTA4 = 8;
  private static int PFL_PARAM_NUOVCAMPSTA5 = 9;
  private static int PFL_PARAM_NUOVCAMPSTAT = 10;
  private static int PFL_PARAM_NUOVCAMPSTA1 = 11;
  private static int PFL_PARAM_NUOVCAMPSTA2 = 12;
  private static int PFL_PARAM_NUOVCAMPSTA3 = 13;
  private static int PFL_PARAM_ETICSCELDELI = 14;
  private static int PFL_PARAM_ETICINFODELI = 15;
  private static int PFL_PARAM_ETICSCELPROP = 16;
  private static int PFL_PARAM_ETICINFOPROP = 17;
  private static int PFL_PARAM_ETICHEELABOR = 18;

  private static int PPQRY_PARAM112 = 0;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM119(IMDB);
    //
    //
    Init_PQRY_PARAM112(IMDB);
    Init_PQRY_PARAM112_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM119(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAM119, 9);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAM119, "TBL_PARAM119");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMEOGGEVARI, "NOMEOGGEVARI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMEOGGEVARI,5,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMOGGDATVAR, "NOMOGGDATVAR");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMOGGDATVAR,6,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMEOGGEPROP,5,52,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMOGGNUMPRO, "NOMOGGNUMPRO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMOGGNUMPRO,1,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMOGGANNPRO, "NOMOGGANNPRO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMOGGANNPRO,1,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMEOGGEDELI,5,52,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMOGGNUMDEL,1,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMOGGANNDEL,1,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMEOGGEASSE, "NOMEOGGEASSE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM119,IMDBDef7.FLD_PARAM119_NOMEOGGEASSE,1,2,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAM119, 0);
  }

  private static void Init_PQRY_PARAM112(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAM112, 8);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAM112, "PQRY_PARAM112");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMEOGGEVARI, "NOMEOGGEVARI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMEOGGEVARI,5,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMOGGDATVAR, "NOMOGGDATVAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMOGGDATVAR,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMEOGGEPROP,5,52,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMOGGNUMPRO, "NOMOGGNUMPRO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMOGGNUMPRO,1,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMOGGANNPRO, "NOMOGGANNPRO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMOGGANNPRO,1,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMEOGGEDELI,5,52,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMOGGNUMDEL,1,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112,IMDBDef17.PQSL_PARAM112_NOMOGGANNDEL,1,10,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAM112, 0);
  }

  private static void Init_PQRY_PARAM112_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAM112_RS, 8);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAM112_RS, "PQRY_PARAM112_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMEOGGEVARI, "NOMEOGGEVARI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMEOGGEVARI,5,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMOGGDATVAR, "NOMOGGDATVAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMOGGDATVAR,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMEOGGEPROP,5,52,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMOGGNUMPRO, "NOMOGGNUMPRO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMOGGNUMPRO,1,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMOGGANNPRO, "NOMOGGANNPRO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMOGGANNPRO,1,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMEOGGEDELI,5,52,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMOGGNUMDEL,1,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM112_RS,IMDBDef17.PQSL_PARAM112_NOMOGGANNDEL,1,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GenerazioneVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public GenerazioneVariazioni()
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
    FormIdx = MyGlb.FRM_GENERAVARIAZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "292C7F06-DD6D-4B7C-A041-8BF120F5EE43";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 384;
    DesignHeight = 262;
    set_Caption(new IDVariant("Generazione Variazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 384;
    Frames[1].Height = 236;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 236;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 384-MyGlb.PAN_OFFS_X, 236-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E088BE22-98A7-4F92-8FB0-C83F1D96D069");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 408, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARAM119, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENERAVARIAZ_PARAM112();
      }
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_ETICSCELDELI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_ETICSCELPROP) {
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
    return (obj instanceof GenerazioneVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GenerazioneVariazioni.class.getName() : (Glb.ClassWithPackage(GenerazioneVariazioni.class) ? GenerazioneVariazioni.class.getName().substring(GenerazioneVariazioni.class.getPackage().getName().length() + 1) : GenerazioneVariazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGANNPRO, 0))) && MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEVARI, 0).equals((new IDVariant("D")), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGANNDEL, 0))))
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioni", "ParamOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Param On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
      // 
      // Param On Validate Row Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGANNDEL, 0))))
      {
        IDVariant v_SEDEDELIBERA = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NUMERODELIBE = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_ANNODELIBERA = new IDVariant(0,IDVariant.INTEGER);
        v_SEDEDELIBERA = IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEDELI, 0);
        v_NUMERODELIBE = IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGNUMDEL, 0);
        v_ANNODELIBERA = IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGANNDEL, 0);
        MainFrm.ControlloDelibere(v_SEDEDELIBERA, v_ANNODELIBERA, v_NUMERODELIBE, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMSEDDEL, 0, new IDVariant(v_SEDEDELIBERA));
        IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMNUMDEL, 0, new IDVariant(v_NUMERODELIBE));
        IMDB.set_Value(IMDBDef2.TBL_PAER, IMDBDef2.FLD_PAER_ROWNAMANNDEL, 0, new IDVariant(v_ANNODELIBERA));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioni", "ParamOnValidateRow", _e);
    }
  }

  // **********************************************************************
  // Etichetta scelta delibera
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Etichettasceltadelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta scelta delibera Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioni", "Etichettasceltadelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta info delibera
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Etichettainfodelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta info delibera Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGANNDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEDELI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioni", "Etichettainfodelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta scelta proposta
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Etichettasceltaproposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta scelta proposta Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioni", "Etichettasceltaproposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta info proposta
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Etichettainfoproposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta info proposta Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGANNPRO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEPROP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGNUMPRO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGANNPRO, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioni", "Etichettainfoproposta", _e);
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
      IMDB.set_Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEVARI, 0, (new IDVariant("P")));
      IMDB.set_Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMOGGDATVAR, 0, IDL.Today());
      PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, (MainFrm.GESTIODELIBE.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, (MainFrm.GESTIODELIBE.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioni", "Load", _e);
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
      UNLOAD_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioni", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEVARI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMOGGDATVAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEPROP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMOGGNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMOGGANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEDELI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMOGGNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMOGGANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEASSE, 0, new IDVariant());
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEDELI, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEPROP, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioni", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Etichetta elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Etichettaelabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta elabora Body
      // Corpo Procedura
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  PROPOSTE_VB A ");
      SQL.append("where (A.ASSESTAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEASSE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((A.STATO IS NULL)) ");
      SQL.append("and   (A.TIPO = 2) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
      {
        MainFrm.set_AlertMessage((new IDVariant("Sono presenti proposte in attesa di approvazione. L'elaborazione non può essere eseguita"))); 
        return 0;
      }
      if (IDL.Year(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGDATVAR, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant("Esercizo di Data Variazione diverso da quello del contesto"))); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEDELI, 0)) && IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEVARI, 0).equals((new IDVariant("D")), true))
      {
        MainFrm.set_AlertMessage((new IDVariant("Variazioni Definitive. Indicare la Delibera!"))); 
        return 0;
      }
      IDVariant v_MSGBLOCCANTE = new IDVariant(0,IDVariant.STRING);
      IDVariant v_MSGNONBLOCCA = new IDVariant(0,IDVariant.STRING);
      IDVariant v_BLOCCANTE = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_NONBLOCCANTE = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_MSGENT = null;
      v_MSGENT = (new IDVariant("Sono presenti proposte (storni di entrata) che non quadrano"));
      IDVariant v_MSGSPESA = null;
      v_MSGSPESA = (new IDVariant("Sono presenti proposte (storni di spesa) che non quadrano"));
      IDVariant v_MSGVAR = null;
      v_MSGVAR = (new IDVariant("Sono presenti proposte (variazioni) che non quadrano"));
      IDVariant v_RET1 = null;
      v_RET1 = ControlloQuadratura(IMDB.Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEASSE, 0), (new IDVariant(1)));
      IDVariant v_RET2 = null;
      v_RET2 = ControlloQuadratura(IMDB.Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEASSE, 0), (new IDVariant(2)));
      IDVariant v_RET3 = null;
      v_RET3 = ControlloQuadratura(IMDB.Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEASSE, 0), (new IDVariant(3)));
      if (v_RET1.equals((new IDVariant(1)), true))
      {
        v_MSGBLOCCANTE = IDL.Add(IDL.Add(v_MSGBLOCCANTE, v_MSGENT), (new IDVariant("/n")));
        v_BLOCCANTE = (new IDVariant(-1));
      }
      if (v_RET1.equals((new IDVariant(1)), true))
      {
        v_MSGBLOCCANTE = IDL.Add(IDL.Add(v_MSGBLOCCANTE, v_MSGSPESA), (new IDVariant("/n")));
        v_BLOCCANTE = (new IDVariant(-1));
      }
      if (v_RET1.equals((new IDVariant(1)), true))
      {
        v_MSGBLOCCANTE = IDL.Add(IDL.Add(v_MSGBLOCCANTE, v_MSGVAR), (new IDVariant("/n")));
        v_BLOCCANTE = (new IDVariant(-1));
      }
      if (v_RET1.equals((new IDVariant(2)), true))
      {
        v_MSGNONBLOCCA = IDL.Add(IDL.Add(v_MSGNONBLOCCA, v_MSGENT), (new IDVariant("/n")));
        v_NONBLOCCANTE = (new IDVariant(-1));
      }
      if (v_RET1.equals((new IDVariant(2)), true))
      {
        v_MSGNONBLOCCA = IDL.Add(IDL.Add(v_MSGNONBLOCCA, v_MSGSPESA), (new IDVariant("/n")));
        v_NONBLOCCANTE = (new IDVariant(-1));
      }
      if (v_RET1.equals((new IDVariant(2)), true))
      {
        v_MSGNONBLOCCA = IDL.Add(IDL.Add(v_MSGNONBLOCCA, v_MSGVAR), (new IDVariant("/n")));
        v_NONBLOCCANTE = (new IDVariant(-1));
      }
      if (v_BLOCCANTE.booleanValue())
      {
        MainFrm.set_AlertMessage(v_MSGBLOCCANTE); 
        return 0;
      }
      else
      {
        IDVariant v_NUMVAR = null;
        v_NUMVAR = (new IDVariant());
        if (v_NONBLOCCANTE.booleanValue())
        {
          if (MainFrm.MessageConfirm(IDL.Add(IDL.Add(v_MSGNONBLOCCA, (new IDVariant("/n"))), (new IDVariant("Si vuole procedere ugualmente?")))))
          {
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.PVBGENERAVAR(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEASSE, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEVARI, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGANNPRO, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGNUMPRO, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEPROP, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGANNDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGNUMDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEDELI, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGDATVAR, 0), v_NUMVAR);
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
              return 0;
            }
          }
        }
        else
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.PVBGENERAVAR(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEASSE, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEVARI, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGANNPRO, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGNUMPRO, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEPROP, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGANNDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGNUMDEL, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEDELI, 0), IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMOGGDATVAR, 0), v_NUMVAR);
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            return 0;
          }
        }
        if (IMDB.Value(IMDBDef17.PQRY_PARAM112, IMDBDef17.PQSL_PARAM112_NOMEOGGEVARI, 0).equals((new IDVariant("P")), true))
        {
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add((new IDVariant("Sono state emesse ")), IDL.ToString(v_NUMVAR)), (new IDVariant(" variazioni provvisorie")))); 
        }
        else
        {
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add((new IDVariant("Sono state emesse ")), IDL.ToString(v_NUMVAR)), (new IDVariant(" variazioni definitive")))); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioni", "Etichettaelabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Quadratura
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // assestamento - Input
  // tipologia - Input
  // **********************************************************************
  public IDVariant ControlloQuadratura (IDVariant assestamento, IDVariant tipologia)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Quadratura Body
      // Corpo Procedura
      // 
      IDVariant v_IMPORTO1 = null;
      v_IMPORTO1 = (new IDVariant());
      IDVariant v_IMPORTO2 = null;
      v_IMPORTO2 = (new IDVariant());
      IDVariant v_IMPORTO3 = null;
      v_IMPORTO3 = (new IDVariant());
      IDVariant v_IMPORTOS1 = null;
      v_IMPORTOS1 = (new IDVariant());
      IDVariant v_IMPORTOS2 = null;
      v_IMPORTOS2 = (new IDVariant());
      IDVariant v_IMPORTOS3 = null;
      v_IMPORTOS3 = (new IDVariant());
      IDVariant v_VARNQ = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.VAR_NQ, 'NO') as NUVAT9VANQNO ");
      SQL.append("from ");
      SQL.append("  T99 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VARNQ = QV.Get("NUVAT9VANQNO", IDVariant.STRING) ;
      }
      QV.Close();
      if (tipologia.equals((new IDVariant(1)), true))
      {
        IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  PROPOSTE_VB A, ");
        SQL.append("  T54 B ");
        SQL.append("where (B.CODICE = A.TIPO_VAR) ");
        SQL.append("and   (B.TIPOLOGIA = 'SE') ");
        SQL.append("and   (A.ASSESTAMENTO = " + IDL.CSql(assestamento, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO = 2) ");
        SQL.append("and   (A.E_S = 'E') ");
        SQL.append("and   (A.STATO = 'A') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.equals((new IDVariant(0)), true))
        {
          v_IMPORTO1 = (new IDVariant(0, IDVariant.DECIMAL));
          v_IMPORTO2 = (new IDVariant(0, IDVariant.DECIMAL));
          v_IMPORTO3 = (new IDVariant(0, IDVariant.DECIMAL));
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  SUM(NVL(A.IMPORTO_1, 0)) as SUNUVAPRVI10, ");
          SQL.append("  SUM(NVL(A.IMPORTO_2, 0)) as SUNUVAPRVI20, ");
          SQL.append("  SUM(NVL(A.IMPORTO_3, 0)) as SUNUVAPRVI30 ");
          SQL.append("from ");
          SQL.append("  PROPOSTE_VB A, ");
          SQL.append("  T54 B ");
          SQL.append("where (B.CODICE = A.TIPO_VAR) ");
          SQL.append("and   (B.TIPOLOGIA = 'SE') ");
          SQL.append("and   (A.ASSESTAMENTO = " + IDL.CSql(assestamento, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO = 2) ");
          SQL.append("and   (A.E_S = 'E') ");
          SQL.append("and   (A.STATO = 'A') ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_IMPORTO1 = QV.Get("SUNUVAPRVI10", IDVariant.DECIMAL) ;
            v_IMPORTO2 = QV.Get("SUNUVAPRVI20", IDVariant.DECIMAL) ;
            v_IMPORTO3 = QV.Get("SUNUVAPRVI30", IDVariant.DECIMAL) ;
          }
          QV.Close();
        }
        if (v_IMPORTO1.compareTo((new IDVariant(0)), true)!=0 || v_IMPORTO2.compareTo((new IDVariant(0)), true)!=0 || v_IMPORTO3.compareTo((new IDVariant(0)), true)!=0)
        {
          if (v_VARNQ.equals((new IDVariant("NO")), true))
          {
            return (new IDVariant(1));
          }
          else
          {
            return (new IDVariant(0));
          }
        }
        else
        {
          return (new IDVariant(2));
        }
      }
      else if (tipologia.equals((new IDVariant(2)), true))
      {
        IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  PROPOSTE_VB A, ");
        SQL.append("  T54 B ");
        SQL.append("where (B.CODICE = A.TIPO_VAR) ");
        SQL.append("and   (B.TIPOLOGIA = 'SS') ");
        SQL.append("and   (A.ASSESTAMENTO = " + IDL.CSql(assestamento, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO = 2) ");
        SQL.append("and   (A.E_S = 'S') ");
        SQL.append("and   (A.STATO = 'A') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.equals((new IDVariant(0)), true))
        {
          v_IMPORTOS1 = (new IDVariant(0, IDVariant.DECIMAL));
          v_IMPORTOS2 = (new IDVariant(0, IDVariant.DECIMAL));
          v_IMPORTOS3 = (new IDVariant(0, IDVariant.DECIMAL));
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  SUM(NVL(A.IMPORTO_1, 0)) as SUNUVAPRVI10, ");
          SQL.append("  SUM(NVL(A.IMPORTO_2, 0)) as SUNUVAPRVI20, ");
          SQL.append("  SUM(NVL(A.IMPORTO_3, 0)) as SUNUVAPRVI30 ");
          SQL.append("from ");
          SQL.append("  PROPOSTE_VB A, ");
          SQL.append("  T54 B ");
          SQL.append("where (B.CODICE = A.TIPO_VAR) ");
          SQL.append("and   (B.TIPOLOGIA = 'SS') ");
          SQL.append("and   (A.ASSESTAMENTO = " + IDL.CSql(assestamento, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO = 2) ");
          SQL.append("and   (A.E_S = 'S') ");
          SQL.append("and   (A.STATO = 'A') ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_IMPORTOS1 = QV.Get("SUNUVAPRVI10", IDVariant.DECIMAL) ;
            v_IMPORTOS2 = QV.Get("SUNUVAPRVI20", IDVariant.DECIMAL) ;
            v_IMPORTOS3 = QV.Get("SUNUVAPRVI30", IDVariant.DECIMAL) ;
          }
          QV.Close();
        }
        if (v_IMPORTOS1.compareTo((new IDVariant(0)), true)!=0 || v_IMPORTOS2.compareTo((new IDVariant(0)), true)!=0 || v_IMPORTOS3.compareTo((new IDVariant(0)), true)!=0)
        {
          if (v_VARNQ.equals((new IDVariant("NO")), true))
          {
            return (new IDVariant(1));
          }
          else
          {
            return (new IDVariant(0));
          }
        }
        else
        {
          return (new IDVariant(2));
        }
      }
      else
      {
        IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  PROPOSTE_VB A, ");
        SQL.append("  T54 B ");
        SQL.append("where (B.CODICE = A.TIPO_VAR) ");
        SQL.append("and   (B.TIPOLOGIA = 'V') ");
        SQL.append("and   (A.ASSESTAMENTO = " + IDL.CSql(assestamento, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO = 2) ");
        SQL.append("and   (A.E_S = 'E') ");
        SQL.append("and   (A.STATO = 'A') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.equals((new IDVariant(0)), true))
        {
          v_IMPORTO1 = (new IDVariant(0, IDVariant.DECIMAL));
          v_IMPORTO2 = (new IDVariant(0, IDVariant.DECIMAL));
          v_IMPORTO3 = (new IDVariant(0, IDVariant.DECIMAL));
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  SUM(NVL(A.IMPORTO_1, 0)) as SUNUVAPRVI10, ");
          SQL.append("  SUM(NVL(A.IMPORTO_2, 0)) as SUNUVAPRVI20, ");
          SQL.append("  SUM(NVL(A.IMPORTO_3, 0)) as SUNUVAPRVI30 ");
          SQL.append("from ");
          SQL.append("  PROPOSTE_VB A, ");
          SQL.append("  T54 B ");
          SQL.append("where (B.CODICE = A.TIPO_VAR) ");
          SQL.append("and   (B.TIPOLOGIA = 'V') ");
          SQL.append("and   (A.ASSESTAMENTO = " + IDL.CSql(assestamento, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO = 2) ");
          SQL.append("and   (A.E_S = 'E') ");
          SQL.append("and   (A.STATO = 'A') ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_IMPORTO1 = QV.Get("SUNUVAPRVI10", IDVariant.DECIMAL) ;
            v_IMPORTO2 = QV.Get("SUNUVAPRVI20", IDVariant.DECIMAL) ;
            v_IMPORTO3 = QV.Get("SUNUVAPRVI30", IDVariant.DECIMAL) ;
          }
          QV.Close();
        }
        IDVariant v_VCOUNT1 = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  PROPOSTE_VB A, ");
        SQL.append("  T54 B ");
        SQL.append("where (B.CODICE = A.TIPO_VAR) ");
        SQL.append("and   (B.TIPOLOGIA = 'V') ");
        SQL.append("and   (A.ASSESTAMENTO = " + IDL.CSql(assestamento, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO = 2) ");
        SQL.append("and   (A.E_S = 'S') ");
        SQL.append("and   (A.STATO = 'A') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT1.equals((new IDVariant(0)), true))
        {
          v_IMPORTOS1 = (new IDVariant(0, IDVariant.DECIMAL));
          v_IMPORTOS2 = (new IDVariant(0, IDVariant.DECIMAL));
          v_IMPORTOS3 = (new IDVariant(0, IDVariant.DECIMAL));
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  SUM(NVL(A.IMPORTO_1, 0)) as SUNUVAPRVI10, ");
          SQL.append("  SUM(NVL(A.IMPORTO_2, 0)) as SUNUVAPRVI20, ");
          SQL.append("  SUM(NVL(A.IMPORTO_3, 0)) as SUNUVAPRVI30 ");
          SQL.append("from ");
          SQL.append("  PROPOSTE_VB A, ");
          SQL.append("  T54 B ");
          SQL.append("where (B.CODICE = A.TIPO_VAR) ");
          SQL.append("and   (B.TIPOLOGIA = 'V') ");
          SQL.append("and   (A.ASSESTAMENTO = " + IDL.CSql(assestamento, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO = 2) ");
          SQL.append("and   (A.E_S = 'S') ");
          SQL.append("and   (A.STATO = 'A') ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_IMPORTOS1 = QV.Get("SUNUVAPRVI10", IDVariant.DECIMAL) ;
            v_IMPORTOS2 = QV.Get("SUNUVAPRVI20", IDVariant.DECIMAL) ;
            v_IMPORTOS3 = QV.Get("SUNUVAPRVI30", IDVariant.DECIMAL) ;
          }
          QV.Close();
        }
        if (v_IMPORTO1.compareTo(v_IMPORTOS1, true)!=0 || v_IMPORTO2.compareTo(v_IMPORTOS2, true)!=0 || v_IMPORTO3.compareTo(v_IMPORTOS3, true)!=0)
        {
          if (v_VARNQ.equals((new IDVariant("NO")), true))
          {
            return (new IDVariant(1));
          }
          else
          {
            return (new IDVariant(0));
          }
        }
        else
        {
          return (new IDVariant(2));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioni", "ControlloQuadratura", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void GENERAVARIAZ_PARAM112() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAM112_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAM119, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAM119, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAM112_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAM112_RS, 0, IMDBDef7.TBL_PARAM119, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAM112_RS, 0, 0, IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEVARI, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAM112_RS, 1, 0, IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMOGGDATVAR, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAM112_RS, 2, 0, IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEPROP, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAM112_RS, 3, 0, IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMOGGNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAM112_RS, 4, 0, IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMOGGANNPRO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAM112_RS, 5, 0, IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMEOGGEDELI, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAM112_RS, 6, 0, IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMOGGNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAM112_RS, 7, 0, IMDBDef7.TBL_PARAM119, IMDBDef7.FLD_PARAM119_NOMOGGANNDEL, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAM119, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAM119, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAM119, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAM112_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_ETICSCELDELI)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Etichettasceltadelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ETICINFODELI)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Etichettainfodelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ETICSCELPROP)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Etichettasceltaproposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ETICINFOPROP)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Etichettainfoproposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Etichettaelabora();
      Cancel.set(IDVariant.TRUE);
    }
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, "49DF0D1F-31D4-434F-9D5E-F3F646B50DBE");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, "Variazioni");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, MyGlb.PANEL_LIST, 0, -9999, 88, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, MyGlb.PANEL_FORM, 44, 11, 280, 49, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 0, 55);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 1, 4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, "B6886D0C-AAB0-47B0-81EB-678A7F2EE59C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, "Proposta");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, "C85B649B-154A-43CA-8D98-8B442B5AC370");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, "Num Proposta");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, "4AF3CB04-7AC7-4320-A29B-6ECC10584C4A");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, "Anno Proposta");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, "8B0016B0-8BCD-4CD5-AC93-B6FE936DCEB1");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, "Delibera");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, "56800BC7-F23F-4989-AAF8-5E2EBF2855D1");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, "Num Delibera");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, "6A69BFA8-DF38-4248-A358-EFEC214D27A1");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, "Anno Delibera");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DATAVARIAZIO, "42F9DAFD-1F8F-44BB-9C7C-352EC31062AD");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DATAVARIAZIO, "Data Variazione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DATAVARIAZIO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DATAVARIAZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DATAVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, "00EA1702-7C03-43F2-856F-C673B538877F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, "Variazioni");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, "4DAF192B-9E59-4A01-B616-D2A8CE6E57A4");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, "620DE474-599D-4906-8BB9-DA962D15DBD8");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, "AC139663-FC7B-461D-8E37-29C8074C1C3F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, "-");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, "B872FD58-42B5-4329-B6CD-8CAA5094D4C4");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, "/");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA2, "4B09BF51-504A-42A1-9DA0-0B294FC01468");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA2, "-");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA2, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA3, "FC9E7B83-94C9-48EC-A455-559B1792BAF9");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA3, "/");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA3, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, "D0240192-F94A-470F-BC43-FD4B8B4537AE");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, 0, "wsearch.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, "3E0E4633-924E-446B-BE1E-F5D2DBB31DCA");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, 0, "info.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, "F5DBF2AE-CFDC-49D8-A352-7A46D1A6DF0C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, 0, "wsearch.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, "24EE826E-FB97-40BF-83B9-552D6C87C6B3");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, 0, "info.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, "04BB732E-5240-41D4-9452-3CDEE6381999");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, "elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, 4, 164, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, 128);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, 40, 64, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PROPOSTA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PROPOSTA, PPQRY_PARAM112, "A.NOMEOGGEPROP", "NOMEOGGEPROP", 5, 52, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_LIST, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_LIST, "Num Prop.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_FORM, 176, 64, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMPROPOSTA, MyGlb.PANEL_FORM, "Num Proposta");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMPROPOSTA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMPROPOSTA, PPQRY_PARAM112, "A.NOMOGGNUMPRO", "NOMOGGNUMPRO", 1, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_LIST, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Ann. Prop.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_FORM, 240, 64, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNOPROPOSTA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNOPROPOSTA, PPQRY_PARAM112, "A.NOMOGGANNPRO", "NOMOGGANNPRO", 1, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, 4, 188, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, 128);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, 44, 88, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DELIBERA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DELIBERA, PPQRY_PARAM112, "A.NOMEOGGEDELI", "NOMEOGGEDELI", 5, 52, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_LIST, "Num Delib.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_FORM, 176, 88, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMDELIBERA, MyGlb.PANEL_FORM, "Num Delibera");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMDELIBERA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMDELIBERA, PPQRY_PARAM112, "A.NOMOGGNUMDEL", "NOMOGGNUMDEL", 1, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_LIST, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_LIST, "Ann. Delib.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_FORM, 240, 88, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNODELIBERA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNODELIBERA, PPQRY_PARAM112, "A.NOMOGGANNDEL", "NOMOGGANNDEL", 1, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATAVARIAZIO, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATAVARIAZIO, MyGlb.PANEL_LIST, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATAVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATAVARIAZIO, MyGlb.PANEL_LIST, "Data Variazione");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATAVARIAZIO, MyGlb.PANEL_FORM, 44, 112, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATAVARIAZIO, MyGlb.PANEL_FORM, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATAVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATAVARIAZIO, MyGlb.PANEL_FORM, "Data Variazione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DATAVARIAZIO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DATAVARIAZIO, PPQRY_PARAM112, "A.NOMOGGDATVAR", "NOMOGGDATVAR", 6, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_LIST, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_FORM, 112, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PARAM.SetFieldPage(PFL_PARAM_VARIAZIONI, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_VARIAZIONI, PPQRY_PARAM112, "A.NOMEOGGEVARI", "NOMEOGGEVARI", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, MyGlb.PANEL_LIST, 164, 76, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, MyGlb.PANEL_FORM, 48, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA4, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUOVCAMPSTA4, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUOVCAMPSTA4, -1, "", "NUOVCAMPSTA4", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, MyGlb.PANEL_LIST, 172, 84, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, MyGlb.PANEL_FORM, 304, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA5, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUOVCAMPSTA5, -1, GRP_PARAM_VARIAZIONI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUOVCAMPSTA5, -1, "", "NUOVCAMPSTA5", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 156, 68, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 156, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUOVCAMPSTAT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUOVCAMPSTAT, -1, "", "NUOVCAMPSTAT", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, MyGlb.PANEL_LIST, 164, 76, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, MyGlb.PANEL_FORM, 220, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUOVCAMPSTA1, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUOVCAMPSTA1, -1, "", "NUOVCAMPSTA1", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA2, MyGlb.PANEL_LIST, 164, 76, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA2, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA2, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA2, MyGlb.PANEL_FORM, 156, 88, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA2, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA2, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUOVCAMPSTA2, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUOVCAMPSTA2, -1, "", "NUOVCAMPSTA2", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA3, MyGlb.PANEL_LIST, 172, 84, 28, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA3, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA3, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA3, MyGlb.PANEL_FORM, 220, 88, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA3, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVCAMPSTA3, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUOVCAMPSTA3, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUOVCAMPSTA3, -1, "", "NUOVCAMPSTA3", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, MyGlb.PANEL_LIST, 288, 88, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, MyGlb.PANEL_FORM, 284, 92, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELDELI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICSCELDELI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICSCELDELI, -1, "", "ETICSCELDELI", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, MyGlb.PANEL_LIST, 296, 96, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, MyGlb.PANEL_FORM, 304, 92, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFODELI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICINFODELI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICINFODELI, -1, "", "ETICINFODELI", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, MyGlb.PANEL_LIST, 296, 96, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, MyGlb.PANEL_FORM, 284, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICSCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICSCELPROP, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICSCELPROP, -1, "", "ETICSCELPROP", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, MyGlb.PANEL_LIST, 304, 104, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, MyGlb.PANEL_FORM, 304, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICINFOPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICINFOPROP, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICINFOPROP, -1, "", "ETICINFOPROP", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 128, 180, 76, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 240, 144, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHEELABOR, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM112", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM112, IMDBDef17.PQRY_PARAM112_RS, IMDBDef7.TBL_PARAM119);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PROPOSTA, IMDBDef7.FLD_PARAM119_NOMEOGGEPROP);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUMPROPOSTA, IMDBDef7.FLD_PARAM119_NOMOGGNUMPRO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANNOPROPOSTA, IMDBDef7.FLD_PARAM119_NOMOGGANNPRO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DELIBERA, IMDBDef7.FLD_PARAM119_NOMEOGGEDELI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUMDELIBERA, IMDBDef7.FLD_PARAM119_NOMOGGNUMDEL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANNODELIBERA, IMDBDef7.FLD_PARAM119_NOMOGGANNDEL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DATAVARIAZIO, IMDBDef7.FLD_PARAM119_NOMOGGDATVAR);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_VARIAZIONI, IMDBDef7.FLD_PARAM119_NOMEOGGEVARI);
    PAN_PARAM.SetMasterTable(0, "PARAM119");
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
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
