// **********************************************
// Movimenti Vincolo Acc
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MovimentiVincoloAcc extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_TIPOVINCOLO = 0;
  private static int PFL_PARAMETRI_SOLOCOMPETEN = 1;

  private static int PPQRY_PARAMETRI218 = 0;

  private static int PPQRY_VINCOLI = 1;


  IDPanel PAN_PARAMETRI;
  private static int PFL_MOVIMEVINCOL_CAPITOLOART = 0;
  private static int PFL_MOVIMEVINCOL_IMPEGNO = 1;
  private static int PFL_MOVIMEVINCOL_IMPORTO = 2;
  private static int PFL_MOVIMEVINCOL_DATA = 3;
  private static int PFL_MOVIMEVINCOL_DESCRIZIONE = 4;
  private static int PFL_MOVIMEVINCOL_DELIBERA = 5;
  private static int PFL_MOVIMEVINCOL_PROPOSTA = 6;
  private static int PFL_MOVIMEVINCOL_ANNOIMP = 7;
  private static int PFL_MOVIMEVINCOL_NUMEROIMP = 8;
  private static int PFL_MOVIMEVINCOL_CAPITOLO = 9;
  private static int PFL_MOVIMEVINCOL_ARTICOLO = 10;
  private static int PFL_MOVIMEVINCOL_NUMERODEL = 11;
  private static int PFL_MOVIMEVINCOL_ANNODEL = 12;

  private static int PPQRY_IMP1 = 0;


  IDPanel PAN_MOVIMEVINCOL;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI233(IMDB);
    //
    //
    Init_PQRY_IMP1(IMDB);
    Init_PQRY_PARAMETRI218(IMDB);
    Init_PQRY_PARAMETRI218_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI233(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI233, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI233, "TBL_PARAMETRI233");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI233,IMDBDef4.FLD_PARAMETRI233_ROWNAMTIPVIN, "ROWNAMTIPVIN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI233,IMDBDef4.FLD_PARAMETRI233_ROWNAMTIPVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI233,IMDBDef4.FLD_PARAMETRI233_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI233,IMDBDef4.FLD_PARAMETRI233_ROWNAMECOMPE,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI233,IMDBDef4.FLD_PARAMETRI233_ROWNAMDATREG, "ROWNAMDATREG");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI233,IMDBDef4.FLD_PARAMETRI233_ROWNAMDATREG,6,19,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI233, 0);
  }

  private static void Init_PQRY_IMP1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_IMP1, 17);
    IMDB.set_TblCode(IMDBDef13.PQRY_IMP1, "PQRY_IMP1");
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ACCCAPITOART, "ACCCAPITOART");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ACCCAPITOART,5,203,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ACCIMPEGNO, "ACCIMPEGNO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ACCIMPEGNO,5,203,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ACCIMPORTO, "ACCIMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ACCIMPORTO,3,28,6);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ACCDELIBERA, "ACCDELIBERA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ACCDELIBERA,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ACCPROPOSTA, "ACCPROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ACCPROPOSTA,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP1,IMDBDef13.PQSL_IMP1_NUMERO_PROPOSTA,1,4,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_IMP1, 0);
  }

  private static void Init_PQRY_PARAMETRI218(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI218, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI218, "PQRY_PARAMETRI218");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI218,IMDBDef13.PQSL_PARAMETRI218_ROWNAMTIPVIN, "ROWNAMTIPVIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI218,IMDBDef13.PQSL_PARAMETRI218_ROWNAMTIPVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI218,IMDBDef13.PQSL_PARAMETRI218_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI218,IMDBDef13.PQSL_PARAMETRI218_ROWNAMECOMPE,1,2,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI218, 0);
  }

  private static void Init_PQRY_PARAMETRI218_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI218_RS, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI218_RS, "PQRY_PARAMETRI218_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI218_RS,IMDBDef13.PQSL_PARAMETRI218_ROWNAMTIPVIN, "ROWNAMTIPVIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI218_RS,IMDBDef13.PQSL_PARAMETRI218_ROWNAMTIPVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI218_RS,IMDBDef13.PQSL_PARAMETRI218_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI218_RS,IMDBDef13.PQSL_PARAMETRI218_ROWNAMECOMPE,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MovimentiVincoloAcc(MyWebEntryPoint w, IMDBObj imdb)
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
  public MovimentiVincoloAcc()
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
    FormIdx = MyGlb.FRM_MOVIMVINCACC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "65E8E5AB-D164-4220-8EE8-766F5615257A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 680;
    DesignHeight = 454;
    set_Caption(new IDVariant("Movimenti Vincolo Acc"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 680;
    Frames[1].Height = 428;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.149533;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 680;
    Frames[2].Height = 64;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 64;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 680-MyGlb.PAN_OFFS_X, 64-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A72A640E-58DA-4A67-955D-92BF8BD5E614");
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
    Frames[3].Width = 680;
    Frames[3].Height = 364;
    Frames[3].Caption = "Movimenti Vincolo";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 364;
    PAN_MOVIMEVINCOL = new IDPanel(w, this, 3, "PAN_MOVIMEVINCOL");
    Frames[3].Content = PAN_MOVIMEVINCOL;
    PAN_MOVIMEVINCOL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MOVIMEVINCOL.VS = MainFrm.VisualStyleList;
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 680-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D23EAF56-02CD-40AA-A844-1F2BE0C8220E");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1068, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI233, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        MOVIMVINCACC_PARAMETRI218();
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
    return (obj instanceof MovimentiVincoloAcc);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MovimentiVincoloAcc.class.getName() : (Glb.ClassWithPackage(MovimentiVincoloAcc.class) ? MovimentiVincoloAcc.class.getName().substring(MovimentiVincoloAcc.class.getPackage().getName().length() + 1) : MovimentiVincoloAcc.class.getName()));
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
      MainFrm.ErrObj.ProcError ("MovimentiVincoloAcc", "MovimentiVincoloOnDynamicPropertiesEvent", _e);
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
      MainFrm.ErrObj.ProcError ("MovimentiVincoloAcc", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void MOVIMVINCACC_PARAMETRI218() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI218_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI233, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI233, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI218_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI218_RS, 0, IMDBDef4.TBL_PARAMETRI233, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI218_RS, 0, 0, IMDBDef4.TBL_PARAMETRI233, IMDBDef4.FLD_PARAMETRI233_ROWNAMTIPVIN, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI218_RS, 1, 0, IMDBDef4.TBL_PARAMETRI233, IMDBDef4.FLD_PARAMETRI233_ROWNAMECOMPE, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI233, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI233, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI233, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI218_RS, 0);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP1, IMDBDef13.PQSL_IMP1_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef13.PQRY_IMP1, IMDBDef13.PQSL_IMP1_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
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
    PAN_MOVIMEVINCOL.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, "F32D7D55-B2AF-4848-8C74-B2CE1CF36C3A");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, "Capitolo/Art.");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPEGNO, "5784433A-BF03-4743-8204-8B8722704A92");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPEGNO, "Impegno");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPEGNO, "To String (NUMERO IMP) + \" \" + \" / \" + \" \" + To String (ANNO IMP)");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, "6F03B44C-3359-4E39-A8C1-903F65B31A55");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, "Importo");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, "384518D3-F5B0-424A-9C41-90C2850CA690");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, "Data");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, "Data Reg");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, "5D1BDA89-B151-4B53-BCD1-12913DD14939");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, "Descrizione");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, "268DD18D-9611-462C-81F9-7CEB026361FE");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, "Delibera");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, "BA6DC190-8889-4718-A1D7-AFD0ECD89C2E");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, "Proposta");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNOIMP, "375FFC15-9DFC-4AF7-9DF2-54E8BF9E9D1D");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNOIMP, "ANNO IMP");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNOIMP, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNOIMP, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNOIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMEROIMP, "CA2B32AD-7D72-4641-9034-5CF3BD3C6369");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMEROIMP, "NUMERO IMP");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMEROIMP, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMEROIMP, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMEROIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLO, "3E73D06D-07AD-4E0E-A84E-6C428D121814");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLO, "CAPITOLO");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLO, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLO, 0, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ARTICOLO, "D39D131F-56AC-464B-AE1C-DA7800C8DBD7");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ARTICOLO, "ARTICOLO");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ARTICOLO, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ARTICOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ARTICOLO, 0, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMERODEL, "1B82511E-10C4-4545-A6E7-D69573AD33E9");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMERODEL, "NUMERO DEL");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMERODEL, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMERODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMERODEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNODEL, "50AFA305-FC10-4164-9B18-C50765B5D58B");
    PAN_MOVIMEVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNODEL, "ANNO DEL");
    PAN_MOVIMEVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNODEL, "");
    PAN_MOVIMEVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_MOVIMEVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNODEL, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_MOVIMEVINCOL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_LIST, 92);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_FORM, 4, 400, 524, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_FORM, 92);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLOART, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_CAPITOLOART, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldUnbound(PFL_MOVIMEVINCOL_CAPITOLOART, true);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_CAPITOLOART, PPQRY_IMP1, "TO_CHAR ( B.CAPITOLO ) || ' ' || ' / ' || ' ' || TO_CHAR ( B.ARTICOLO )", "ACCCAPITOART", 5, 203, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPEGNO, MyGlb.PANEL_LIST, 108, 36, 88, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPEGNO, MyGlb.PANEL_LIST, 76);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPEGNO, MyGlb.PANEL_FORM, 4, 448, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPEGNO, MyGlb.PANEL_FORM, 76);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPEGNO, MyGlb.PANEL_FORM, "Impegno");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_IMPEGNO, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldUnbound(PFL_MOVIMEVINCOL_IMPEGNO, true);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_IMPEGNO, PPQRY_IMP1, "TO_CHAR ( B.NUMERO_IMP ) || ' ' || ' / ' || ' ' || TO_CHAR ( B.ANNO_IMP )", "ACCIMPEGNO", 5, 203, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_LIST, 196, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_LIST, 44);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_FORM, 4, 496, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_FORM, 44);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_IMPORTO, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldUnbound(PFL_MOVIMEVINCOL_IMPORTO, true);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_IMPORTO, PPQRY_IMP1, "A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES", "ACCIMPORTO", 3, 28, 6, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_LIST, 304, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_LIST, 68);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_FORM, 4, 520, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_FORM, 68);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_DATA, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_DATA, PPQRY_IMP1, "B.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_LIST, 368, 36, 340, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 544, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_DESCRIZIONE, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_DESCRIZIONE, PPQRY_IMP1, "B.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_LIST, 708, 36, 148, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_FORM, 4, 580, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_FORM, 48);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_DELIBERA, MyGlb.PANEL_FORM, "Delib.");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_DELIBERA, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldUnbound(PFL_MOVIMEVINCOL_DELIBERA, true);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_DELIBERA, PPQRY_IMP1, "DECODE(B.SEDE_DEL, NULL, '', TO_CHAR ( B.SEDE_DEL ) || ' ' || ' - ' || ' ' || TO_CHAR ( B.NUMERO_DEL ) || ' ' || ' / ' || ' ' || TO_CHAR ( B.ANNO_DEL ))", "ACCDELIBERA", 5, 99, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_LIST, 856, 36, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_FORM, 4, 628, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_FORM, 52);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_PROPOSTA, MyGlb.PANEL_FORM, "Prop.");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_PROPOSTA, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldUnbound(PFL_MOVIMEVINCOL_PROPOSTA, true);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_PROPOSTA, PPQRY_IMP1, "DECODE(B.UNITA_PROPONENTE, NULL, '', TO_CHAR ( B.UNITA_PROPONENTE ) || ' ' || ' - ' || ' ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' ' || ' / ' || ' ' || TO_CHAR ( B.ANNO_PROPOSTA ))", "ACCPROPOSTA", 5, 99, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNOIMP, MyGlb.PANEL_LIST, 1008, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNOIMP, MyGlb.PANEL_FORM, 4, 676, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_ANNOIMP, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_ANNOIMP, PPQRY_IMP1, "B.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMEROIMP, MyGlb.PANEL_LIST, 1068, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMEROIMP, MyGlb.PANEL_LIST, "NUMERO IMP");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMEROIMP, MyGlb.PANEL_FORM, 4, 700, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_NUMEROIMP, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_NUMEROIMP, PPQRY_IMP1, "B.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLO, MyGlb.PANEL_LIST, 8, 44, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLO, MyGlb.PANEL_FORM, 12, 732, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_CAPITOLO, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_CAPITOLO, PPQRY_IMP1, "B.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ARTICOLO, MyGlb.PANEL_LIST, 16, 52, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ARTICOLO, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ARTICOLO, MyGlb.PANEL_FORM, 20, 740, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_ARTICOLO, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_ARTICOLO, PPQRY_IMP1, "B.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMERODEL, MyGlb.PANEL_LIST, "NUMERO DEL");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMERODEL, MyGlb.PANEL_FORM, 4, 724, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_NUMERODEL, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_NUMERODEL, PPQRY_IMP1, "B.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_MOVIMEVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNODEL, MyGlb.PANEL_FORM, 4, 724, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_MOVIMEVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEVINCOL_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_MOVIMEVINCOL.SetFieldPage(PFL_MOVIMEVINCOL_ANNODEL, -1, -1);
    PAN_MOVIMEVINCOL.SetFieldPanel(PFL_MOVIMEVINCOL_ANNODEL, PPQRY_IMP1, "B.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
  }

  private void PAN_MOVIMEVINCOL_InitQueries()
  {
    StringBuffer SQL;

    PAN_MOVIMEVINCOL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_MOVIMEVINCOL.SetIMDB(IMDB, "PQRY_IMP1", true);
    PAN_MOVIMEVINCOL.set_SetString(MyGlb.MASTER_ROWNAME, "ACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  B.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  TO_CHAR ( B.CAPITOLO ) || ' ' || ' / ' || ' ' || TO_CHAR ( B.ARTICOLO ) as ACCCAPITOART, ");
    SQL.append("  TO_CHAR ( B.NUMERO_IMP ) || ' ' || ' / ' || ' ' || TO_CHAR ( B.ANNO_IMP ) as ACCIMPEGNO, ");
    SQL.append("  A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES as ACCIMPORTO, ");
    SQL.append("  B.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  DECODE(B.SEDE_DEL, NULL, '', TO_CHAR ( B.SEDE_DEL ) || ' ' || ' - ' || ' ' || TO_CHAR ( B.NUMERO_DEL ) || ' ' || ' / ' || ' ' || TO_CHAR ( B.ANNO_DEL )) as ACCDELIBERA, ");
    SQL.append("  DECODE(B.UNITA_PROPONENTE, NULL, '', TO_CHAR ( B.UNITA_PROPONENTE ) || ' ' || ' - ' || ' ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' ' || ' / ' || ' ' || TO_CHAR ( B.ANNO_PROPOSTA )) as ACCPROPOSTA, ");
    SQL.append("  B.CAPITOLO as CAPITOLO, ");
    SQL.append("  B.ARTICOLO as ARTICOLO, ");
    SQL.append("  B.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  B.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  B.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  B.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  B.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  B.NUMERO_PROPOSTA as NUMERO_PROPOSTA ");
    PAN_MOVIMEVINCOL.SetQuery(PPQRY_IMP1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESEIMP A, ");
    SQL.append("  IMP B ");
    PAN_MOVIMEVINCOL.SetQuery(PPQRY_IMP1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_IMP = B.ANNO_IMP) ");
    SQL.append("and   (A.NUMERO_IMP = B.NUMERO_IMP) ");
    SQL.append("and   ((A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) AND (NVL(B.TIPO_VINCOLO, -1) = NVL(~~TBL_PARAMETRI233.ROWNAMTIPVIN~~, -1)) AND (A.ESERCIZIO = A.ANNO_IMP OR ~~TBL_PARAMETRI233.ROWNAMECOMPE~~ = 0)) ");
    PAN_MOVIMEVINCOL.SetQuery(PPQRY_IMP1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOVIMEVINCOL.SetQuery(PPQRY_IMP1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOVIMEVINCOL.SetQuery(PPQRY_IMP1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_IMP, ");
    SQL.append("  B.NUMERO_IMP ");
    PAN_MOVIMEVINCOL.SetQuery(PPQRY_IMP1, 5, SQL, -1, "");
    PAN_MOVIMEVINCOL.SetQueryDB(PPQRY_IMP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MOVIMEVINCOL.SetMasterTable(0, "ESEIMP");
    PAN_MOVIMEVINCOL.AddToSortList(PFL_MOVIMEVINCOL_ANNOIMP, true);
    PAN_MOVIMEVINCOL.AddToSortList(PFL_MOVIMEVINCOL_NUMEROIMP, true);
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
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "64E129C6-ED50-4385-82CA-BC87CB905F67");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "Tipo Vincolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "DE2C87A0-0779-411C-8AA7-38DCCF81CB89");
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
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 8, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOVINCOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOVINCOLO, PPQRY_PARAMETRI218, "A.ROWNAMTIPVIN", "ROWNAMTIPVIN", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 40, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, "Solo Competenza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 520, 8, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, "Solo Competenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOCOMPETEN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOCOMPETEN, PPQRY_PARAMETRI218, "A.ROWNAMECOMPE", "ROWNAMECOMPE", 1, 2, 0, -13997);
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
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= ~~TBL_PARAMETRI233.ROWNAMDATREG~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.CODICE, ");
    SQL.append("  '*** VINCOLO SCADUTO *** ' || '(' || TO_CHAR ( B.CODICE ) || ')' ");
    SQL.append("from ");
    SQL.append("  VINCOLI B ");
    SQL.append("where (B.CODICE = ~~ROWNAMTIPVIN~~) ");
    SQL.append("and   (B.SCADENZA < ~~TBL_PARAMETRI233.ROWNAMDATREG~~ AND B.CODICE = ~~TBL_PARAMETRI233.ROWNAMTIPVIN~~) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_PARAMETRI_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  LPAD(TO_CHAR ( A.CODICE ), 4, SUBSTR(' ', 1, 1)) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where ((A.SCADENZA IS NULL) OR A.SCADENZA >= ~~TBL_PARAMETRI233.ROWNAMDATREG~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.CODICE, ");
    SQL.append("  '*** VINCOLO SCADUTO *** ' || '(' || TO_CHAR ( B.CODICE ) || ')' ");
    SQL.append("from ");
    SQL.append("  VINCOLI B ");
    SQL.append("where (B.SCADENZA < ~~TBL_PARAMETRI233.ROWNAMDATREG~~ AND B.CODICE = ~~TBL_PARAMETRI233.ROWNAMTIPVIN~~) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_PARAMETRI_TIPOVINCOLO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI218", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI218, IMDBDef13.PQRY_PARAMETRI218_RS, IMDBDef4.TBL_PARAMETRI233);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOVINCOLO, IMDBDef4.FLD_PARAMETRI233_ROWNAMTIPVIN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOCOMPETEN, IMDBDef4.FLD_PARAMETRI233_ROWNAMECOMPE);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI233");
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
