// **********************************************
// Movimenti Vincolo Imp
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MovimentiVincoloImp extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_TIPOVINCOLO = 0;
  private static int PFL_PARAMETRI_SOLOCOMPETEN = 1;

  private static int PPQRY_PARAMETRI13 = 0;

  private static int PPQRY_VINCOLI = 1;


  IDPanel PAN_PARAMETRI;
  private static int PFL_MOVIMEVINCOL_CAPITOLOART = 0;
  private static int PFL_MOVIMEVINCOL_ACCERTAMENTO = 1;
  private static int PFL_MOVIMEVINCOL_IMPORTO = 2;
  private static int PFL_MOVIMEVINCOL_DATA = 3;
  private static int PFL_MOVIMEVINCOL_DESCRIZIONE = 4;
  private static int PFL_MOVIMEVINCOL_DELIBERA = 5;
  private static int PFL_MOVIMEVINCOL_PROPOSTA = 6;

  private static int PPQRY_ACC2 = 0;


  IDPanel PAN_MOVIMEVINCOL;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI683(IMDB);
    //
    //
    Init_PQRY_ACC2(IMDB);
    Init_PQRY_PARAMETRI13(IMDB);
    Init_PQRY_PARAMETRI13_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI683(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI683, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI683, "TBL_PARAMETRI683");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI683,IMDBDef4.FLD_PARAMETRI683_ROWNAMTIPVIN, "ROWNAMTIPVIN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI683,IMDBDef4.FLD_PARAMETRI683_ROWNAMTIPVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI683,IMDBDef4.FLD_PARAMETRI683_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI683,IMDBDef4.FLD_PARAMETRI683_ROWNAMECOMPE,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI683,IMDBDef4.FLD_PARAMETRI683_ROWNAMDATREG, "ROWNAMDATREG");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI683,IMDBDef4.FLD_PARAMETRI683_ROWNAMDATREG,6,19,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI683, 0);
  }

  private static void Init_PQRY_ACC2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_ACC2, 17);
    IMDB.set_TblCode(IMDBDef13.PQRY_ACC2, "PQRY_ACC2");
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ACCIMPORTO, "ACCIMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ACCIMPORTO,3,28,6);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ACCCAPITOART, "ACCCAPITOART");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ACCCAPITOART,5,203,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ACCACCERTAME, "ACCACCERTAME");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ACCACCERTAME,5,203,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ACCDELIBERA, "ACCDELIBERA");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ACCDELIBERA,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ACCPROPOSTA, "ACCPROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_ACC2,IMDBDef13.PQSL_ACC2_ACCPROPOSTA,5,99,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_ACC2, 0);
  }

  private static void Init_PQRY_PARAMETRI13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI13, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI13, "PQRY_PARAMETRI13");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI13,IMDBDef13.PQSL_PARAMETRI13_ROWNAMTIPVIN, "ROWNAMTIPVIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI13,IMDBDef13.PQSL_PARAMETRI13_ROWNAMTIPVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI13,IMDBDef13.PQSL_PARAMETRI13_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI13,IMDBDef13.PQSL_PARAMETRI13_ROWNAMECOMPE,1,2,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI13, 0);
  }

  private static void Init_PQRY_PARAMETRI13_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI13_RS, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI13_RS, "PQRY_PARAMETRI13_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI13_RS,IMDBDef13.PQSL_PARAMETRI13_ROWNAMTIPVIN, "ROWNAMTIPVIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI13_RS,IMDBDef13.PQSL_PARAMETRI13_ROWNAMTIPVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI13_RS,IMDBDef13.PQSL_PARAMETRI13_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI13_RS,IMDBDef13.PQSL_PARAMETRI13_ROWNAMECOMPE,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MovimentiVincoloImp(MyWebEntryPoint w, IMDBObj imdb)
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
  public MovimentiVincoloImp()
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
    FormIdx = MyGlb.FRM_MOVIMVINCIMP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2D0AFAC1-3BDB-44AE-A711-1015FBE9B1CA";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 948;
    DesignHeight = 454;
    set_Caption(new IDVariant("Movimenti Vincolo Imp"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 948;
    Frames[1].Height = 428;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.149533;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 948;
    Frames[2].Height = 64;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 64;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 948-MyGlb.PAN_OFFS_X, 64-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EE20ABAF-3A2C-4170-A3A6-A6BEAA29EF63");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 128, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 948;
    Frames[3].Height = 364;
    Frames[3].Caption = "Movimenti Vincolo";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 364;
    PAN_MOVIMEVINCOL = new IDPanel(w, this, 3, "PAN_MOVIMEVINCOL");
    Frames[3].Content = PAN_MOVIMEVINCOL;
    PAN_MOVIMEVINCOL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MOVIMEVINCOL.VS = MainFrm.VisualStyleList;
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 948-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8CFD7857-BD4A-4275-BFDC-981EE95560A2");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1100, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MOVIMEVINCOL.InitStatus = 2;
    PAN_MOVIMEVINCOL_Init();
    PAN_MOVIMEVINCOL_InitFields();
    PAN_MOVIMEVINCOL_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI683, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        MOVIMVINCIMP_PARAMETRI13();
      }
      PAN_MOVIMEVINCOL.UpdatePanel(MainFrm);
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
    return (obj instanceof MovimentiVincoloImp);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MovimentiVincoloImp.class.getName() : (Glb.ClassWithPackage(MovimentiVincoloImp.class) ? MovimentiVincoloImp.class.getName().substring(MovimentiVincoloImp.class.getPackage().getName().length() + 1) : MovimentiVincoloImp.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Movimenti Vincolo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MOVIMEVINCOL_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_MOVIMEVINCOL);
      // 
      // Movimenti Vincolo On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_MOVIMEVINCOL.set_ToolTip(Glb.OBJ_FIELD,PFL_MOVIMEVINCOL_DESCRIZIONE,(new IDVariant(PAN_MOVIMEVINCOL.FieldText(PFL_MOVIMEVINCOL_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiVincoloImp", "MovimentiVincoloOnDynamicPropertiesEvent", _e);
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
      v_CAPTION = (new IDVariant("Movimenti Vincolo", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiVincoloImp", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void MOVIMVINCIMP_PARAMETRI13() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI13_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI683, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI683, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI13_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI13_RS, 0, IMDBDef4.TBL_PARAMETRI683, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI13_RS, 0, 0, IMDBDef4.TBL_PARAMETRI683, IMDBDef4.FLD_PARAMETRI683_ROWNAMTIPVIN, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI13_RS, 1, 0, IMDBDef4.TBL_PARAMETRI683, IMDBDef4.FLD_PARAMETRI683_ROWNAMECOMPE, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI683, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI683, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI683, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI13_RS, 0);
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
  private void PAN_MOVIMEVINCOL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MOVIMEVINCOL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MOVIMEVINCOL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MOVIMEVINCOL, Cancel);
    // Stub
  }

  private void PAN_MOVIMEVINCOL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_MOVIMEVINCOL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_MOVIMEVINCOL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_ACC2, IMDBDef13.PQSL_ACC2_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef13.PQRY_ACC2, IMDBDef13.PQSL_ACC2_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_MOVIMEVINCOL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_MOVIMEVINCOL_Init()
  {

    PAN_MOVIMEVINCOL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MOVIMEVINCOL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MOVIMEVINCOL.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, "9F4BCB66-C0BE-4B20-A98E-F244A4302795");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, "Capitolo/Art.");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.VIS_NORMFIELPADR);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ACCERTAMENTO, "52D06949-D949-4F0A-96F2-50492FA5B52F");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ACCERTAMENTO, "Accertamento");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ACCERTAMENTO, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ACCERTAMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, "1A78F75B-1EE4-412F-9C91-5A567BABF290");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, "Importo");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, "3F2C628F-3343-4938-8170-852266160535");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, "Data");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, "Data Reg");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, "D5E75115-BFB0-418E-99AD-B056EE16BD93");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, "Descrizione");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, "22CB6DDB-C917-4194-A851-78F510E2C92B");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, "Delibera");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, "196B7671-DDF4-4C1B-BC6D-7A1008C1ABEC");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, "Proposta");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_MOVIMEVINCOL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_LIST, 264);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_FORM, 4, 676, 416, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_FORM, 68);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_FORM, "Capitolo Art");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_CAPITOLOART, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldUnbound(PFL_MOVIMEVINCOL_CAPITOLOART, true);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_CAPITOLOART, PPQRY_ACC2, "TO_CHAR ( A.CAPITOLO ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ARTICOLO )", "ACCCAPITOART", 5, 203, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ACCERTAMENTO, MyGlb.PANEL_LIST, 128, 36, 92, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ACCERTAMENTO, MyGlb.PANEL_LIST, 80);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ACCERTAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accertamento");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ACCERTAMENTO, MyGlb.PANEL_FORM, 4, 448, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ACCERTAMENTO, MyGlb.PANEL_FORM, 76);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ACCERTAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accert.");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_ACCERTAMENTO, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldUnbound(PFL_MOVIMEVINCOL_ACCERTAMENTO, true);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_ACCERTAMENTO, PPQRY_ACC2, "TO_CHAR ( A.NUMERO_ACC ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ANNO_ACC )", "ACCACCERTAME", 5, 203, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_LIST, 220, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_LIST, 44);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_FORM, 4, 496, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_FORM, 44);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_IMPORTO, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldUnbound(PFL_MOVIMEVINCOL_IMPORTO, true);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_IMPORTO, PPQRY_ACC2, "B.SALDO_INI + B.VARIAZIONI + B.VARIAZIONI_RES", "ACCIMPORTO", 3, 28, 6, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_LIST, 328, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_LIST, 68);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_FORM, 4, 520, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_FORM, 68);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_DATA, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_DATA, PPQRY_ACC2, "A.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_LIST, 392, 36, 340, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 544, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_DESCRIZIONE, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_DESCRIZIONE, PPQRY_ACC2, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_LIST, 732, 36, 148, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_FORM, 4, 580, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_FORM, 48);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_FORM, "Delib.");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_DELIBERA, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldUnbound(PFL_MOVIMEVINCOL_DELIBERA, true);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_DELIBERA, PPQRY_ACC2, "DECODE(A.SEDE_DEL, NULL, '', TO_CHAR ( A.SEDE_DEL ) || ' ' || ' - ' || ' ' || TO_CHAR ( A.NUMERO_DEL ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ANNO_DEL ))", "ACCDELIBERA", 5, 99, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_LIST, 880, 36, 220, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_FORM, 4, 628, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_FORM, 52);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_FORM, "Prop.");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_PROPOSTA, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldUnbound(PFL_MOVIMEVINCOL_PROPOSTA, true);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_PROPOSTA, PPQRY_ACC2, "DECODE(A.UNITA_PROPONENTE, NULL, '', TO_CHAR ( A.UNITA_PROPONENTE ) || ' ' || ' - ' || ' ' || TO_CHAR ( A.NUMERO_PROPOSTA ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ANNO_PROPOSTA ))", "ACCPROPOSTA", 5, 99, 0, -13997);
  }

  private void PAN_MOVIMEVINCOL_InitQueries()
  {
    StringBuffer SQL;

    PAN_MOVIMEVINCOL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_MOVIMEVINCOL.SetIMDB(IMDB, "PQRY_ACC2", true);
    PAN_MOVIMEVINCOL.set_SetString(MyGlb.MASTER_ROWNAME, "ACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  B.SALDO_INI + B.VARIAZIONI + B.VARIAZIONI_RES as ACCIMPORTO, ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ARTICOLO ) as ACCCAPITOART, ");
    SQL.append("  TO_CHAR ( A.NUMERO_ACC ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ANNO_ACC ) as ACCACCERTAME, ");
    SQL.append("  DECODE(A.SEDE_DEL, NULL, '', TO_CHAR ( A.SEDE_DEL ) || ' ' || ' - ' || ' ' || TO_CHAR ( A.NUMERO_DEL ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ANNO_DEL )) as ACCDELIBERA, ");
    SQL.append("  DECODE(A.UNITA_PROPONENTE, NULL, '', TO_CHAR ( A.UNITA_PROPONENTE ) || ' ' || ' - ' || ' ' || TO_CHAR ( A.NUMERO_PROPOSTA ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ANNO_PROPOSTA )) as ACCPROPOSTA ");
    PAN_MOVIMEVINCOL.SetQuery(PPQRY_ACC2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ACC A, ");
    SQL.append("  ESEACC B ");
    PAN_MOVIMEVINCOL.SetQuery(PPQRY_ACC2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_ACC = B.ANNO_ACC) ");
    SQL.append("and   (A.NUMERO_ACC = B.NUMERO_ACC) ");
    SQL.append("and   ((B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) AND (NVL(A.TIPO_VINCOLO, -1) = NVL(~~TBL_PARAMETRI683.ROWNAMTIPVIN~~, -1)) AND (B.ESERCIZIO = B.ANNO_ACC OR ~~TBL_PARAMETRI683.ROWNAMECOMPE~~ = 0)) ");
    PAN_MOVIMEVINCOL.SetQuery(PPQRY_ACC2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOVIMEVINCOL.SetQuery(PPQRY_ACC2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOVIMEVINCOL.SetQuery(PPQRY_ACC2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC ");
    PAN_MOVIMEVINCOL.SetQuery(PPQRY_ACC2, 5, SQL, -1, "");
    PAN_MOVIMEVINCOL.SetQueryDB(PPQRY_ACC2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MOVIMEVINCOL.SetMasterTable(0, "ACC");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MOVIMEVINCOL.Status() == 2)
    {
      int oldListQBE = PAN_MOVIMEVINCOL.iUseListQBE;
      PAN_MOVIMEVINCOL.iUseListQBE = 0;
      PAN_MOVIMEVINCOL.PanelCommand(Glb.PCM_SEARCH);
      PAN_MOVIMEVINCOL.PanelCommand(Glb.PCM_FIND);
      PAN_MOVIMEVINCOL.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "C2368811-E5FC-4898-A1A2-964DB6746EA9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "Tipo Vincolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "384B0F2F-92DC-4C57-9888-D51FA34B4C9C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "Solo Competenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tp. Vinc.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 8, 508, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOVINCOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOVINCOLO, PPQRY_PARAMETRI13, "A.ROWNAMTIPVIN", "ROWNAMTIPVIN", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 40, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, "Solo Competenza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 532, 8, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, "Solo Competenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOCOMPETEN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOCOMPETEN, PPQRY_PARAMETRI13, "A.ROWNAMECOMPE", "ROWNAMECOMPE", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCOMPETEN, (new IDVariant(1)), "1", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCOMPETEN, (new IDVariant(0)), "0", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  LPAD(TO_CHAR ( A.CODICE ), 4, SUBSTR(' ', 1, 1)) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPVIN~~) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= ~~TBL_PARAMETRI683.ROWNAMDATREG~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.CODICE, ");
    SQL.append("  '*** VINCOLO SCADUTO *** ' || '(' || TO_CHAR ( B.CODICE ) || ')' ");
    SQL.append("from ");
    SQL.append("  VINCOLI B ");
    SQL.append("where (B.CODICE = ~~ROWNAMTIPVIN~~) ");
    SQL.append("and   (B.SCADENZA < ~~TBL_PARAMETRI683.ROWNAMDATREG~~ AND B.CODICE = ~~TBL_PARAMETRI683.ROWNAMTIPVIN~~) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_PARAMETRI_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  LPAD(TO_CHAR ( A.CODICE ), 4, SUBSTR(' ', 1, 1)) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where ((A.SCADENZA IS NULL) OR A.SCADENZA >= ~~TBL_PARAMETRI683.ROWNAMDATREG~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.CODICE, ");
    SQL.append("  '*** VINCOLO SCADUTO *** ' || '(' || TO_CHAR ( B.CODICE ) || ')' ");
    SQL.append("from ");
    SQL.append("  VINCOLI B ");
    SQL.append("where (B.SCADENZA < ~~TBL_PARAMETRI683.ROWNAMDATREG~~ AND B.CODICE = ~~TBL_PARAMETRI683.ROWNAMTIPVIN~~) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_PARAMETRI_TIPOVINCOLO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI13", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI13, IMDBDef13.PQRY_PARAMETRI13_RS, IMDBDef4.TBL_PARAMETRI683);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOVINCOLO, IMDBDef4.FLD_PARAMETRI683_ROWNAMTIPVIN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOCOMPETEN, IMDBDef4.FLD_PARAMETRI683_ROWNAMECOMPE);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI683");
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
    if (SrcObj == PAN_MOVIMEVINCOL) PAN_MOVIMEVINCOL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MOVIMEVINCOL) PAN_MOVIMEVINCOL_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MOVIMEVINCOL) PAN_MOVIMEVINCOL_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_MOVIMEVINCOL) PAN_MOVIMEVINCOL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MOVIMEVINCOL) PAN_MOVIMEVINCOL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
