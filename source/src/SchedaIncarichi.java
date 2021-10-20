// **********************************************
// Scheda Incarichi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SchedaIncarichi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_PERIDOINCARI = 0;
  private static int GRP_PARAMETRI_DATAMANDATO = 1;
  private static int GRP_PARAMETRI_PRIMOGRUPPO = 2;

  private static int PFL_PARAMETRI_ELABORA = 0;
  private static int PFL_PARAMETRI_DAL1 = 1;
  private static int PFL_PARAMETRI_AL1 = 2;
  private static int PFL_PARAMETRI_NEWPANELLAB1 = 3;
  private static int PFL_PARAMETRI_NEWPANELABE2 = 4;
  private static int PFL_PARAMETRI_DAL = 5;
  private static int PFL_PARAMETRI_AL = 6;
  private static int PFL_PARAMETRI_NEWPANELABE1 = 7;
  private static int PFL_PARAMETRI_NEWPANELLABE = 8;
  private static int PFL_PARAMETRI_TIPO = 9;
  private static int PFL_PARAMETRI_CODICEBENEFI = 10;
  private static int PFL_PARAMETRI_BENEFICIARIO = 11;
  private static int PFL_PARAMETRI_SCEBENBUTLAB = 12;
  private static int PFL_PARAMETRI_INFOBENEBUTT = 13;

  private static int PPQRY_PARAMETRI331 = 0;

  private static int PPQRY_TIPIINCARICO = 1;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI216(IMDB);
    //
    //
    Init_PQRY_PARAMETRI331(IMDB);
    Init_PQRY_PARAMETRI331_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI216(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI216, 11);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI216, "TBL_PARAMETRI216");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARAMCASSA, "PARAMCASSA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARAMCASSA,5,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARAMESERCIZ,5,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARPERINCDAL, "PARPERINCDAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARPERINCDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARAPERINCAL, "PARAPERINCAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARAPERINCAL,6,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARADATARITE, "PARADATARITE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARADATARITE,5,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARDATMANDAL, "PARDATMANDAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARDATMANDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARADATMANAL, "PARADATMANAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARADATMANAL,6,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARAMTIPO,1,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARACODIBENE, "PARACODIBENE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARACODIBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARAMBENEFIC, "PARAMBENEFIC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARAMBENEFIC,5,60,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARAMBENEOLD, "PARAMBENEOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI216,IMDBDef4.FLD_PARAMETRI216_PARAMBENEOLD,5,60,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI216, 0);
  }

  private static void Init_PQRY_PARAMETRI331(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI331, 7);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI331, "PQRY_PARAMETRI331");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI331,IMDBDef13.PQSL_PARAMETRI331_PARPERINCDAL, "PARPERINCDAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI331,IMDBDef13.PQSL_PARAMETRI331_PARPERINCDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI331,IMDBDef13.PQSL_PARAMETRI331_PARAPERINCAL, "PARAPERINCAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI331,IMDBDef13.PQSL_PARAMETRI331_PARAPERINCAL,6,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI331,IMDBDef13.PQSL_PARAMETRI331_PARDATMANDAL, "PARDATMANDAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI331,IMDBDef13.PQSL_PARAMETRI331_PARDATMANDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI331,IMDBDef13.PQSL_PARAMETRI331_PARADATMANAL, "PARADATMANAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI331,IMDBDef13.PQSL_PARAMETRI331_PARADATMANAL,6,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI331,IMDBDef13.PQSL_PARAMETRI331_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI331,IMDBDef13.PQSL_PARAMETRI331_PARAMTIPO,1,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI331,IMDBDef13.PQSL_PARAMETRI331_PARACODIBENE, "PARACODIBENE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI331,IMDBDef13.PQSL_PARAMETRI331_PARACODIBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI331,IMDBDef13.PQSL_PARAMETRI331_PARAMBENEFIC, "PARAMBENEFIC");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI331,IMDBDef13.PQSL_PARAMETRI331_PARAMBENEFIC,5,60,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI331, 0);
  }

  private static void Init_PQRY_PARAMETRI331_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI331_RS, 7);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI331_RS, "PQRY_PARAMETRI331_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI331_RS,IMDBDef13.PQSL_PARAMETRI331_PARPERINCDAL, "PARPERINCDAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI331_RS,IMDBDef13.PQSL_PARAMETRI331_PARPERINCDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI331_RS,IMDBDef13.PQSL_PARAMETRI331_PARAPERINCAL, "PARAPERINCAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI331_RS,IMDBDef13.PQSL_PARAMETRI331_PARAPERINCAL,6,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI331_RS,IMDBDef13.PQSL_PARAMETRI331_PARDATMANDAL, "PARDATMANDAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI331_RS,IMDBDef13.PQSL_PARAMETRI331_PARDATMANDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI331_RS,IMDBDef13.PQSL_PARAMETRI331_PARADATMANAL, "PARADATMANAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI331_RS,IMDBDef13.PQSL_PARAMETRI331_PARADATMANAL,6,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI331_RS,IMDBDef13.PQSL_PARAMETRI331_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI331_RS,IMDBDef13.PQSL_PARAMETRI331_PARAMTIPO,1,49,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI331_RS,IMDBDef13.PQSL_PARAMETRI331_PARACODIBENE, "PARACODIBENE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI331_RS,IMDBDef13.PQSL_PARAMETRI331_PARACODIBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI331_RS,IMDBDef13.PQSL_PARAMETRI331_PARAMBENEFIC, "PARAMBENEFIC");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI331_RS,IMDBDef13.PQSL_PARAMETRI331_PARAMBENEFIC,5,60,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SchedaIncarichi(MyWebEntryPoint w, IMDBObj imdb)
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
  public SchedaIncarichi()
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
    FormIdx = MyGlb.FRM_SCHEDAINCARI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "22D51FA7-9EE4-42FD-B7E6-34D999FD55C4";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 488;
    DesignHeight = 322;
    set_Caption(new IDVariant("Scheda Incarichi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 488;
    Frames[1].Height = 296;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 296;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 488-MyGlb.PAN_OFFS_X, 296-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AFC21989-FA6F-4AAF-B4D5-5AB4AA514DFA");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1704, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI216, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCHEDAINCARI_PARAMETRI331();
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SCEBENBUTLAB) {
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
    return (obj instanceof SchedaIncarichi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SchedaIncarichi.class.getName() : (Glb.ClassWithPackage(SchedaIncarichi.class) ? SchedaIncarichi.class.getName().substring(SchedaIncarichi.class.getPackage().getName().length() + 1) : SchedaIncarichi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      SelettoreBeneficiario v_SELETTBENEFI = new SelettoreBeneficiario(MainFrm,IMDB);
      if (Column.equals((new IDVariant(PFL_PARAMETRI_BENEFICIARIO)), true))
      {
        if (IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARAMBENEFIC, 0).compareTo(IMDB.Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAMBENEOLD, 0), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARAMBENEFIC, 0))))
          {
            IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARAMBENEFIC, 0, IDL.Upper(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARAMBENEFIC, 0)));
            v_SELETTBENEFI.AzzeraValori();
            v_SELETTBENEFI.SetParam(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARAMBENEFIC, 0), (new IDVariant("IMP")), (new IDVariant(0)), (new IDVariant()));
            if (!(IDL.IsNull(v_SELETTBENEFI.GetTrovato())))
            {
              if (v_SELETTBENEFI.GetTrovato().equals((new IDVariant("SI")), true))
              {
                IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARACODIBENE, 0, v_SELETTBENEFI.GetBeneficiario());
                IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARAMBENEFIC, 0, v_SELETTBENEFI.GetRagioneSociale());
              }
              else
              {
                IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARACODIBENE, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARAMBENEFIC, 0, (new IDVariant()));
              }
            }
            else
            {
              return;
            }
          }
          else
          {
            IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARACODIBENE, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAMBENEOLD, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARAMBENEFIC, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaIncarichi", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties
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
      // Parametri On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARACODIBENE, 0)))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaIncarichi", "ParametriOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CODSOG = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      // 
      // valido i campi
      // 
      {
        if (IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARDATMANDAL, 0).compareTo(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARADATMANAL, 0), true)>0 || IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARDATMANDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARADATMANAL, 0)) || IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARPERINCDAL, 0).compareTo(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARAPERINCAL, 0), true)>0 || IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARPERINCDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARAPERINCAL, 0)))
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Invalidazione date di ricerca:\",\"possibile incoerenza nei dati di ricerca per data.", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return 0;
        }
        v_CODSOG = new IDVariant(((IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARACODIBENE, 0).equals((new IDVariant(0))))?(new IDVariant()):IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARACODIBENE, 0)),IDVariant.INTEGER);
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("TIPO_INC")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARAMTIPO, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("BEN")), IDL.ToString(IDL.NullValue(v_CODSOG,(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("MAN_DAL")), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARDATMANDAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("MAN_AL")), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARADATMANAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("INC_DAL")), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARPERINCDAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("INC_AL")), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARAPERINCAL, 0)));
      MainFrm.LanciaStampaJasper((new IDVariant("Scheda_Incarichi")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaIncarichi", "Elabora", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Scheda Incarichi", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARADELEROWS();
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARPERINCDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAPERINCAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARDATMANDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARADATMANAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAMTIPO, 0, (new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaIncarichi", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAMCASSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARPERINCDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAPERINCAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARADATARITE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARDATMANDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARADATMANAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAMTIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARACODIBENE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAMBENEFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAMBENEOLD, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARACODIBENE, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARAMBENEFIC, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_RAGIONE_SOCIALE_ESTESA, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAMBENEOLD, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_RAGIONE_SOCIALE_ESTESA, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARACODIBENE, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
        IMDB.set_Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARAMBENEFIC, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_RAGIONE_SOCIALE_ESTESA, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAMBENEOLD, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_RAGIONE_SOCIALE_ESTESA, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaIncarichi", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Scegli Soggetto
  // **********************************************************************
  public int ApriScegliSoggetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scegli Soggetto Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      // IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaIncarichi", "ApriScegliSoggetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Beneficiario
  // **********************************************************************
  public int InfoBeneficiario ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Beneficiario Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARACODIBENE, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef13.PQRY_PARAMETRI331, IMDBDef13.PQSL_PARAMETRI331_PARACODIBENE, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaIncarichi", "InfoBeneficiario", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void SCHEDAINCARI_PARAMETRI331() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI331_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI216, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI216, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI331_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI331_RS, 0, IMDBDef4.TBL_PARAMETRI216, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI331_RS, 0, 0, IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARPERINCDAL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI331_RS, 1, 0, IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAPERINCAL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI331_RS, 2, 0, IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARDATMANDAL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI331_RS, 3, 0, IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARADATMANAL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI331_RS, 4, 0, IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAMTIPO, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI331_RS, 5, 0, IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARACODIBENE, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI331_RS, 6, 0, IMDBDef4.TBL_PARAMETRI216, IMDBDef4.FLD_PARAMETRI216_PARAMBENEFIC, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI216, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI216, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI216, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI331_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_SCEBENBUTLAB)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriScegliSoggetto();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFOBENEBUTT)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoBeneficiario();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIDOINCARI, "9AD21059-D895-4F07-8F32-98EE9EF3352D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIDOINCARI, "Perido Incarico");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIDOINCARI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIDOINCARI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIDOINCARI, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIDOINCARI, MyGlb.PANEL_FORM, 12, 147, 440, 57, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIDOINCARI, 0, 85);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIDOINCARI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIDOINCARI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIDOINCARI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIDOINCARI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, "8448BC96-DA45-4E0D-B7CE-6DCC1938804D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, "Data Mandato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, MyGlb.PANEL_FORM, 12, 87, 440, 57, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 0, 80);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PRIMOGRUPPO, "25639769-8889-4773-B871-D0AC55D863BE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PRIMOGRUPPO, "Primo Gruppo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PRIMOGRUPPO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PRIMOGRUPPO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PRIMOGRUPPO, MyGlb.PANEL_LIST, 0, -9999, 308, 0, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PRIMOGRUPPO, MyGlb.PANEL_FORM, 12, 20, 440, 64, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PRIMOGRUPPO, 0, 77);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PRIMOGRUPPO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PRIMOGRUPPO, 0, 1);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PRIMOGRUPPO, 1, 1);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PRIMOGRUPPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "DB6E74CB-7499-4071-92FE-FB2594DB8B36");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "E542B2B5-ACD3-46A1-A92D-E60123F225A3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "7CB96C19-E7A3-402C-8132-7427E137E2B5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, "03BE3991-2D26-4F3A-96A2-2B849E312A7C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, "3F59B2E2-CA1C-4749-8957-19E4A17FC4EC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "111651F3-69EA-4101-A070-974455F39135");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "2FCB8150-AF27-43B3-9581-601269543071");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "4D050D6D-1FDD-4296-9555-13C9EE1D2018");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "4CFA0FC6-1792-403C-BD01-8207C3F81775");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, "6B22EFB5-522A-45B2-A867-6D28DF27E944");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, "Tipo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, "330B7B07-0B07-49B1-9AC3-0CF2FD713478");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, "Codice Beneficiario");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, "83026D7B-C779-4EF5-8256-0A3885F48CE6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, "Beneficiario");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, "3F927EB8-B3C9-4E6A-9EFE-01894D039AE4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, "6108FB16-9286-47AA-B098-569835653236");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 188, 204, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 368, 236, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 64, 172, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL1, -1, GRP_PARAMETRI_PERIDOINCARI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL1, PPQRY_PARAMETRI331, "A.PARPERINCDAL", "PARPERINCDAL", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 240, 172, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL1, -1, GRP_PARAMETRI_PERIDOINCARI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL1, PPQRY_PARAMETRI331, "A.PARAPERINCAL", "PARAPERINCAL", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 144, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 16, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLAB1, -1, GRP_PARAMETRI_PERIDOINCARI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 188, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 436, 184, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE2, -1, GRP_PARAMETRI_PERIDOINCARI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 64, 112, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_DATAMANDATO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI331, "A.PARDATMANDAL", "PARDATMANDAL", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 240, 112, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_DATAMANDATO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI331, "A.PARADATMANAL", "PARADATMANAL", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 112, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 16, 128, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE1, -1, GRP_PARAMETRI_DATAMANDATO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 312, 168, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 436, 128, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLABE, -1, GRP_PARAMETRI_DATAMANDATO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_FORM, 56, 60, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_FORM, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPO, -1, GRP_PARAMETRI_PRIMOGRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPO, PPQRY_PARAMETRI331, "A.PARAMTIPO", "PARAMTIPO", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, "Codice Beneficiario");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, 352, 24, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, "Codice Beneficiario");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODICEBENEFI, -1, GRP_PARAMETRI_PRIMOGRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODICEBENEFI, PPQRY_PARAMETRI331, "A.PARACODIBENE", "PARACODIBENE", 2, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_FORM, 16, 24, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BENEFICIARIO, -1, GRP_PARAMETRI_PRIMOGRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BENEFICIARIO, PPQRY_PARAMETRI331, "A.PARAMBENEFIC", "PARAMBENEFIC", 5, 60, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, MyGlb.PANEL_LIST, 308, 0, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, MyGlb.PANEL_FORM, 416, 28, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEBENBUTLAB, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCEBENBUTLAB, -1, GRP_PARAMETRI_PRIMOGRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCEBENBUTLAB, -1, "", "SCEBENBUTLAB", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, MyGlb.PANEL_LIST, 324, 4, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, MyGlb.PANEL_FORM, 432, 28, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOBENEBUTT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFOBENEBUTT, -1, GRP_PARAMETRI_PRIMOGRUPPO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFOBENEBUTT, -1, "", "INFOBENEBUTT", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIINCACODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPINCDESEXP ");
    SQL.append("from ");
    SQL.append("  TIPI_INCARICO A ");
    SQL.append("where (A.CODICE = ~~PARAMTIPO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMTIPO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPIINCARICO, 0, SQL, PFL_PARAMETRI_TIPO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIINCACODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPINCDESEXP ");
    SQL.append("from ");
    SQL.append("  TIPI_INCARICO A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPIINCARICO, 1, SQL, PFL_PARAMETRI_TIPO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_TIPIINCARICO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI331", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI331, IMDBDef13.PQRY_PARAMETRI331_RS, IMDBDef4.TBL_PARAMETRI216);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL1, IMDBDef4.FLD_PARAMETRI216_PARPERINCDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL1, IMDBDef4.FLD_PARAMETRI216_PARAPERINCAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef4.FLD_PARAMETRI216_PARDATMANDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef4.FLD_PARAMETRI216_PARADATMANAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPO, IMDBDef4.FLD_PARAMETRI216_PARAMTIPO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CODICEBENEFI, IMDBDef4.FLD_PARAMETRI216_PARACODIBENE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_BENEFICIARIO, IMDBDef4.FLD_PARAMETRI216_PARAMBENEFIC);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI216");
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
