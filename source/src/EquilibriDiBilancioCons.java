// **********************************************
// Equilibri Di Bilancio Cons
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EquilibriDiBilancioCons extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_EQUILDIBILAN_GRUPPORICALC = 0;

  private static int PFL_EQUILDIBILAN_ESERCIZIO = 0;
  private static int PFL_EQUILDIBILAN_ETICHECOMPET = 1;
  private static int PFL_EQUILDIBILAN_IMPORTOAA = 2;
  private static int PFL_EQUILDIBILAN_IMPORTOBEST = 3;
  private static int PFL_EQUILDIBILAN_FPVS204 = 4;
  private static int PFL_EQUILDIBILAN_IMPORTOFEST = 5;
  private static int PFL_EQUILDIBILAN_FONDANTILIQU = 6;
  private static int PFL_EQUILDIBILAN_IMPORTOH = 7;
  private static int PFL_EQUILDIBILAN_IMPORTOHEST = 8;
  private static int PFL_EQUILDIBILAN_IMPORTOI = 9;
  private static int PFL_EQUILDIBILAN_IMPORTOIEST = 10;
  private static int PFL_EQUILDIBILAN_IMPORTOL = 11;
  private static int PFL_EQUILDIBILAN_IMPORTOM = 12;
  private static int PFL_EQUILDIBILAN_RISOACCABIL1 = 13;
  private static int PFL_EQUILDIBILAN_RISOVINCBIL1 = 14;
  private static int PFL_EQUILDIBILAN_VARIACCACORR = 15;
  private static int PFL_EQUILDIBILAN_IMPORTOP = 16;
  private static int PFL_EQUILDIBILAN_RISOACCABILC = 17;
  private static int PFL_EQUILDIBILAN_RISOVINCBILC = 18;
  private static int PFL_EQUILDIBILAN_VARIAACCACAP = 19;
  private static int PFL_EQUILDIBILAN_RISOACCABILA = 20;
  private static int PFL_EQUILDIBILAN_RISOVINCBILA = 21;
  private static int PFL_EQUILDIBILAN_VARIAZACCANT = 22;
  private static int PFL_EQUILDIBILAN_ETICHERICALC = 23;
  private static int PFL_EQUILDIBILAN_IMPORTNONRIC = 24;
  private static int PFL_EQUILDIBILAN_ETICHEELABOR = 25;

  private static int PPQRY_BILCONSEQUI1 = 0;


  IDPanel PAN_EQUILDIBILAN;

  // Definition of Global Variables
  private IDVariant TOTALECA1 = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant TOTALEN1A2 = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant TOTALEDA1 = new IDVariant(0,IDVariant.DECIMAL);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI669(IMDB);
    //
    //
    Init_PQRY_BILCONSEQUI1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI669(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI669, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI669, "TBL_PARAMETRI669");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI669,IMDBDef3.FLD_PARAMETRI669_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI669,IMDBDef3.FLD_PARAMETRI669_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI669,IMDBDef3.FLD_PARAMETRI669_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI669,IMDBDef3.FLD_PARAMETRI669_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI669,IMDBDef3.FLD_PARAMETRI669_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI669,IMDBDef3.FLD_PARAMETRI669_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI669,IMDBDef3.FLD_PARAMETRI669_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI669,IMDBDef3.FLD_PARAMETRI669_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI669,IMDBDef3.FLD_PARAMETRI669_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI669,IMDBDef3.FLD_PARAMETRI669_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI669,IMDBDef3.FLD_PARAMETRI669_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI669,IMDBDef3.FLD_PARAMETRI669_PARANOMEFILE,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI669, 0);
  }

  private static void Init_PQRY_BILCONSEQUI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_BILCONSEQUI1, 23);
    IMDB.set_TblCode(IMDBDef12.PQRY_BILCONSEQUI1, "PQRY_BILCONSEQUI1");
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_AA, "IMPORTO_AA");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_AA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_B_EST, "IMPORTO_B_EST");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_B_EST,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_F_EST, "IMPORTO_F_EST");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_F_EST,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_FONDO_ANTIC_LIQUIDITA, "FONDO_ANTIC_LIQUIDITA");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_FONDO_ANTIC_LIQUIDITA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_H, "IMPORTO_H");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_H,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_H_EST, "IMPORTO_H_EST");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_H_EST,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_I, "IMPORTO_I");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_I,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_I_EST, "IMPORTO_I_EST");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_I_EST,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_L, "IMPORTO_L");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_L,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_M, "IMPORTO_M");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_M,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_P, "IMPORTO_P");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_P,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_NON_RIC, "IMPORTO_NON_RIC");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_NON_RIC,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_FPV_S_204, "FPV_S_204");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_FPV_S_204,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_ACCANTONATE_BILCORR, "RISORSE_ACCANTONATE_BILCORR");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_ACCANTONATE_BILCORR,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_VINCOLATE_BILCORR, "RISORSE_VINCOLATE_BILCORR");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_VINCOLATE_BILCORR,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_VARIAZIONE_ACCANTONAMENTI_CORR, "VARIAZIONE_ACCANTONAMENTI_CORR");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_VARIAZIONE_ACCANTONAMENTI_CORR,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_ACCANTONATE_BILCAP, "RISORSE_ACCANTONATE_BILCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_ACCANTONATE_BILCAP,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_VINCOLATE_BILCAP, "RISORSE_VINCOLATE_BILCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_VINCOLATE_BILCAP,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_VARIAZIONE_ACCANTONAMENTI_CAP, "VARIAZIONE_ACCANTONAMENTI_CAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_VARIAZIONE_ACCANTONAMENTI_CAP,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_ACCANTONATE_BILANCIO, "RISORSE_ACCANTONATE_BILANCIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_ACCANTONATE_BILANCIO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_VINCOLATE_BILANCIO, "RISORSE_VINCOLATE_BILANCIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_VINCOLATE_BILANCIO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_VARIAZIONE_ACCANTONAMENTI, "VARIAZIONE_ACCANTONAMENTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI1,IMDBDef12.PQSL_BILCONSEQUI1_VARIAZIONE_ACCANTONAMENTI,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_BILCONSEQUI1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EquilibriDiBilancioCons(MyWebEntryPoint w, IMDBObj imdb)
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
  public EquilibriDiBilancioCons()
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
    FormIdx = MyGlb.FRM_EQUIDIBILCON;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1FC2AF4F-DB9A-4012-BA40-ECAFE8C015FB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 786;
    set_Caption(new IDVariant("Equilibri di Bilancio"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 760;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Equilibri di Bilancio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 760;
    PAN_EQUILDIBILAN = new IDPanel(w, this, 1, "PAN_EQUILDIBILAN");
    Frames[1].Content = PAN_EQUILDIBILAN;
    PAN_EQUILDIBILAN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_EQUILDIBILAN.VS = MainFrm.VisualStyleList;
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 760-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5E2A62F8-2394-43A8-A0F7-B2F3DFF1E5E6");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2480, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_EQUILDIBILAN.InitStatus = 2;
    PAN_EQUILDIBILAN_Init();
    PAN_EQUILDIBILAN_InitFields();
    PAN_EQUILDIBILAN_InitQueries();
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
      PAN_EQUILDIBILAN.UpdatePanel(MainFrm);
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
    return (obj instanceof EquilibriDiBilancioCons);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EquilibriDiBilancioCons.class.getName() : (Glb.ClassWithPackage(EquilibriDiBilancioCons.class) ? EquilibriDiBilancioCons.class.getName().substring(EquilibriDiBilancioCons.class.getPackage().getName().length() + 1) : EquilibriDiBilancioCons.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Equilibri Di Bilancio On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_EQUILDIBILAN_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Equilibri Di Bilancio On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_AA, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_B_EST, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_F_EST, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_H, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_H_EST, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_I, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_I_EST, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_L, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_M, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_P, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_IMPORTO_NON_RIC, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_ACCANTONATE_BILANCIO, 0, new IDVariant(TOTALECA1));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_VINCOLATE_BILANCIO, 0, new IDVariant(TOTALEN1A2));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_VARIAZIONE_ACCANTONAMENTI, 0, new IDVariant(TOTALEDA1));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriDiBilancioCons", "EquilibriDiBilancioOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Equilibri Di Bilancio After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_EQUILDIBILAN_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Equilibri Di Bilancio After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_EQUILDIBILAN.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_EQUILDIBILAN.PanelCommand(Glb.PCM_INSERT);
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_ACCANTONATE_BILANCIO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_ACCANTONATE_BILANCIO, 0, new IDVariant(TOTALECA1));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_VINCOLATE_BILANCIO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_VINCOLATE_BILANCIO, 0, new IDVariant(TOTALEN1A2));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_VARIAZIONE_ACCANTONAMENTI, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_VARIAZIONE_ACCANTONAMENTI, 0, new IDVariant(TOTALEDA1));
        }
        PAN_EQUILDIBILAN.UpdatePanel(MainFrm);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriDiBilancioCons", "EquilibriDiBilancioAfterFind", _e);
    }
  }

  // **********************************************************************
  // Ricalcola Importi Gestione
  // **********************************************************************
  public int RicalcolaImportiGestione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ricalcola Importi Gestione Body
      // Corpo Procedura
      // 
      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
      v_AVVISO = (new IDVariant("Verrano ricalcolati i valori relativi agli allegati A1 e A2. Continuare?"));
      if (MainFrm.MessageConfirm(v_AVVISO))
      {
        IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_ACCANTONATE_BILANCIO, 0, new IDVariant(TOTALECA1));
        IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_RISORSE_VINCOLATE_BILANCIO, 0, new IDVariant(TOTALEN1A2));
        IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI1, IMDBDef12.PQSL_BILCONSEQUI1_VARIAZIONE_ACCANTONAMENTI, 0, new IDVariant(TOTALEDA1));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriDiBilancioCons", "RicalcolaImportiGestione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_EQUILDIBILAN.Status()).equals((new IDVariant(3)), true))
      {
        PAN_EQUILDIBILAN.PanelCommand(Glb.PCM_UPDATE);
      }
      if (new IDVariant(PAN_EQUILDIBILAN.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPECONS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI669, IMDBDef3.FLD_PARAMETRI669_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI669, IMDBDef3.FLD_PARAMETRI669_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI669, IMDBDef3.FLD_PARAMETRI669_PARANOTESTAM, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
        v_PAR1 = (new IDVariant("SESSIONE"));
        IDVariant v_PAR2 = new IDVariant(0,IDVariant.STRING);
        v_PAR2 = (new IDVariant("ESERCIZIO"));
        MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper(v_PAR2, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI669, IMDBDef3.FLD_PARAMETRI669_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI669, IMDBDef3.FLD_PARAMETRI669_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI669, IMDBDef3.FLD_PARAMETRI669_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI669, IMDBDef3.FLD_PARAMETRI669_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI669, IMDBDef3.FLD_PARAMETRI669_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriDiBilancioCons", "EtichettaElabora", _e);
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
      IDVariant v_TOOLTIRICALC = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIRICALC = (new IDVariant("Ricalcolo valori relativi agli allegati A1 e A2."));
      PAN_EQUILDIBILAN.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  GET_IMPORTI_ALL_RIS_AMM(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'TOT_C_A1') as GEIMARASETCA, ");
      SQL.append("  GET_IMPORTI_ALL_RIS_AMM(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'TOT_N1_A2') as GEIMARASETNA, ");
      SQL.append("  GET_IMPORTI_ALL_RIS_AMM(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'TOT_D_A1') as GEIMARASETDA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        TOTALECA1 = QV.Get("GEIMARASETCA", IDVariant.DECIMAL) ;
        TOTALEN1A2 = QV.Get("GEIMARASETNA", IDVariant.DECIMAL) ;
        TOTALEDA1 = QV.Get("GEIMARASETDA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      PAN_EQUILDIBILAN.set_ToolTip(Glb.OBJ_FIELD,PFL_EQUILDIBILAN_ETICHERICALC,v_TOOLTIRICALC.stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriDiBilancioCons", "Load", _e);
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
      if (new IDVariant(PAN_EQUILDIBILAN.Status()).equals((new IDVariant(3)), true))
      {
        PAN_EQUILDIBILAN.PanelCommand(Glb.PCM_CANCEL);
      }
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EquilibriDiBilancioCons", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI669, IMDBDef3.FLD_PARAMETRI669_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI669, IMDBDef3.FLD_PARAMETRI669_PARANOMESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI669, IMDBDef3.FLD_PARAMETRI669_PARSTANUDIPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI669, IMDBDef3.FLD_PARAMETRI669_PARANOTESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI669, IMDBDef3.FLD_PARAMETRI669_PARAMIDSTAMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI669, IMDBDef3.FLD_PARAMETRI669_PARANOMEFILE, 0, new IDVariant());
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
  private void PAN_EQUILDIBILAN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_EQUILDIBILAN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_EQUILDIBILAN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_EQUILDIBILAN, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_EQUILDIBILAN_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_EQUILDIBILAN);
    // Stub
  }

  private void PAN_EQUILDIBILAN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_EQUILDIBILAN_ETICHERICALC)
    {
      this.IdxPanelActived = this.PAN_EQUILDIBILAN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      RicalcolaImportiGestione();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EQUILDIBILAN_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_EQUILDIBILAN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_EQUILDIBILAN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_EQUILDIBILAN_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_EQUILDIBILAN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_EQUILDIBILAN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_EQUILDIBILAN_Init()
  {

    PAN_EQUILDIBILAN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_EQUILDIBILAN.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EQUILDIBILAN_GRUPPORICALC, "B0FAF230-66F2-4B1C-8E9F-0B8C18C21A38");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_GROUP, GRP_EQUILDIBILAN_GRUPPORICALC, "Gruppo Ricalcola");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EQUILDIBILAN_GRUPPORICALC, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EQUILDIBILAN_GRUPPORICALC, MyGlb.VIS_GROUPSTYLE);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_GROUP, GRP_EQUILDIBILAN_GRUPPORICALC, MyGlb.PANEL_LIST, 0, -9999, 196, 0, 0, 0);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_GROUP, GRP_EQUILDIBILAN_GRUPPORICALC, MyGlb.PANEL_FORM, 12, 572, 812, 84, 0, 0);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EQUILDIBILAN_GRUPPORICALC, 0, 94);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EQUILDIBILAN_GRUPPORICALC, 1, 13);
    PAN_EQUILDIBILAN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EQUILDIBILAN_GRUPPORICALC, 0, 1);
    PAN_EQUILDIBILAN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EQUILDIBILAN_GRUPPORICALC, 1, 1);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_GROUP, GRP_EQUILDIBILAN_GRUPPORICALC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EQUILDIBILAN.SetSize(MyGlb.OBJ_FIELD, 26);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, "070D51D0-E877-4D2E-BB48-24B9CBD146AD");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, "ESERCIZIO");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, "B106C131-DCF5-4B62-8F01-FCD55B98F13C");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, "Competenza");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, MyGlb.VIS_VUOTOGRASSET);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, "59E9123B-94E5-435D-9E34-E699C4AEF45E");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, "AA) Recupero disavanzo di amministrazione esercizio precedente");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, "B592C9C3-B3F1-4FAD-9A9B-50B0EA566CD0");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, "B) Entrate Titoli 1.00 - 2.00 - 3.00 - Estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FPVS204, "8EEE41B5-0165-42D5-80A9-7E26073A6736");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FPVS204, "E1) Fondo pluriennale vincolato di spesa - titolo 2.04  Altri trasferimenti in conto capitale");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FPVS204, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FPVS204, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FPVS204, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, "2609DAB8-2406-4E9D-A71F-01A03BBCE9FE");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, "F1) Spese Titolo 4 - di cui per estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQU, "7C14DCB1-EAFE-4F0A-B39A-292DDDE04F8E");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQU, "F2) Fondo anticipazioni di liquidita'");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQU, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQU, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, "08B715F8-57BF-40A6-92CE-32E32851453E");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, "H) Utilizzo avanzo di amministrazione per spese correnti");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, "3F1FC61D-DC44-4FC1-872E-D839BABE150C");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, "     di cui estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, "276A3614-F083-4048-B692-1AE8CAC4FE3D");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, "I) Entrate di parte capitale destinate a spese correnti in base a specifiche disposizioni di legge");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, "3C1922EF-DCD9-4559-94E9-97FEF6B00464");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, "     di cui estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, "1C00EA3B-368C-4FA0-A45B-ED61949E59D3");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, "L) Entrate di parte corrente destinate a spese di investimento in base a specifiche disposizioni di legge");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, "1F839FCE-E2D4-46E9-B59A-0E3B75F43C1C");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, "M) Entrate da accensioni di prestiti destinate a estinzione anticipata dei prestiti");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABIL1, "A464B609-520E-4ED6-9416-7612DC3ECD39");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABIL1, "- Risorse accantonate  di parte corrente stanziate nel bilancio dell'esercizio ");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABIL1, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABIL1, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABIL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBIL1, "2063AA68-164D-4630-9DA9-D1CFA464540C");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBIL1, "- Risorse vincolate di parte corrente nel bilancio ");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBIL1, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBIL1, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBIL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIACCACORR, "2E1C3379-FC08-4F2C-918E-77C51C8CC333");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIACCACORR, "- Variazione accantonamenti di parte corrente effettuata in sede di rendiconto (+)/(-)");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIACCACORR, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIACCACORR, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIACCACORR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, "823B1BBD-603F-4B99-9E73-6C675627B5C0");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, "P) Utilizzo avanzo di amministrazione per spese di investimento");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILC, "1CBB637C-5507-4429-9F69-C83423BCBD19");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILC, "Z/1) Risorse accantonate  in c/capitale stanziate nel bilancio dell'esercizio ");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILC, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILC, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILC, "F9965CBD-0184-43EF-965B-981150E7F61A");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILC, "- Risorse vincolate in c/capitale nel bilancio");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILC, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILC, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAACCACAP, "92518FAE-0E84-4C97-9F8C-A02FC9358F1F");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAACCACAP, "- Variazione accantonamenti in c/capitale effettuata in sede di rendiconto (+)/(-)");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAACCACAP, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAACCACAP, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAACCACAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILA, "0D730E6B-5DF0-419A-B5F8-861CD15B2096");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILA, "Risorse accantonate  stanziate nel bilancio dell'esercizio ");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILA, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILA, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILA, "3F3C87EA-1941-4B8B-A21D-6D01995D2296");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILA, "Risorse vincolate nel bilancio");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILA, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILA, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAZACCANT, "3CFAE40E-66DD-4963-B24F-F206E8B2916A");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAZACCANT, "Variazione accantonamenti effettuata in sede di rendiconto");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAZACCANT, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAZACCANT, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAZACCANT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHERICALC, "E70EDF1C-BFF6-4EB3-A60D-6DCDD05E3D42");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHERICALC, "Ricalcola");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHERICALC, MyGlb.VIS_STATICBUTTON);
    PAN_EQUILDIBILAN.SetImage(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHERICALC, 0, "button1.gif", false);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHERICALC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTNONRIC, "782F1FE9-0582-47F7-A607-D8BC30150A00");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTNONRIC, "Entrate non ricorrenti che non hanno dato copertura a impegni");
    PAN_EQUILDIBILAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTNONRIC, "");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTNONRIC, MyGlb.VIS_NOFICFIMHELE);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTNONRIC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EQUILDIBILAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, "2C4E16B3-2A32-4635-B861-87F07A97B6F8");
    PAN_EQUILDIBILAN.set_Header(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, "Elabora");
    PAN_EQUILDIBILAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_EQUILDIBILAN.SetImage(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, 0, "button1.gif", false);
    PAN_EQUILDIBILAN.SetFlags(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_EQUILDIBILAN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_FORM, 112);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_ESERCIZIO, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_ESERCIZIO, PPQRY_BILCONSEQUI1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, MyGlb.PANEL_LIST, 604, 12, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, MyGlb.PANEL_LIST, 0);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, MyGlb.PANEL_FORM, 604, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, MyGlb.PANEL_FORM, 0);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHECOMPET, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_ETICHECOMPET, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_ETICHECOMPET, -1, "", "ETICHECOMPET", 0, 0, 0, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_LIST, 80);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_LIST, "A. R. d. d. a. e. p.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_FORM, 16, 40, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOAA, MyGlb.PANEL_FORM, "AA) Recupero disavanzo di amministrazione esercizio precedente");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOAA, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOAA, PPQRY_BILCONSEQUI1, "A.IMPORTO_AA", "IMPORTO_AA", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_LIST, 96);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_LIST, "B E. T. 1 0. 2 0. 3 0. E. a. d. p.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_FORM, 16, 76, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOBEST, MyGlb.PANEL_FORM, "B) Entrate Titoli 1.00 - 2.00 - 3.00 - Estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOBEST, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOBEST, PPQRY_BILCONSEQUI1, "A.IMPORTO_B_EST", "IMPORTO_B_EST", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FPVS204, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FPVS204, MyGlb.PANEL_LIST, 64);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FPVS204, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FPVS204, MyGlb.PANEL_LIST, "E. F. p. v. d. s. t. 2 0. A. t. i. c. c.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FPVS204, MyGlb.PANEL_FORM, 16, 108, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FPVS204, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FPVS204, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FPVS204, MyGlb.PANEL_FORM, "E1) Fondo pluriennale vincolato di spesa - titolo 2.04  Altri trasferimenti in conto capitale");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_FPVS204, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_FPVS204, PPQRY_BILCONSEQUI1, "A.FPV_S_204", "FPV_S_204", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_LIST, 96);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_LIST, "F. S. T. 4 d. c. p. e. a. d. p.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_FORM, 16, 140, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOFEST, MyGlb.PANEL_FORM, "F1) Spese Titolo 4 - di cui per estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOFEST, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOFEST, PPQRY_BILCONSEQUI1, "A.IMPORTO_F_EST", "IMPORTO_F_EST", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQU, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQU, MyGlb.PANEL_LIST, 148);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQU, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQU, MyGlb.PANEL_LIST, "F2) Fondo anticipazioni di liquidita'");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQU, MyGlb.PANEL_FORM, 16, 164, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQU, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQU, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_FONDANTILIQU, MyGlb.PANEL_FORM, "F2) Fondo anticipazioni di liquidita'");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_FONDANTILIQU, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_FONDANTILIQU, PPQRY_BILCONSEQUI1, "A.FONDO_ANTIC_LIQUIDITA", "FONDO_ANTIC_LIQUIDITA", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_LIST, 72);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_LIST, "H U. a. d. a. p. s. c.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_FORM, 16, 196, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOH, MyGlb.PANEL_FORM, "H) Utilizzo avanzo di amministrazione per spese correnti");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOH, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOH, PPQRY_BILCONSEQUI1, "A.IMPORTO_H", "IMPORTO_H", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_LIST, 96);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_LIST, "d. c. e. a. d. p.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_FORM, 16, 220, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOHEST, MyGlb.PANEL_FORM, "     di cui estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOHEST, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOHEST, PPQRY_BILCONSEQUI1, "A.IMPORTO_H_EST", "IMPORTO_H_EST", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_LIST, 72);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_LIST, "I E. d. p. c. d. a s. c. i. b. a s. d. d. l.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_FORM, 16, 252, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOI, MyGlb.PANEL_FORM, "I) Entrate di parte capitale destinate a spese correnti in base a specifiche disposizioni di legge");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOI, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOI, PPQRY_BILCONSEQUI1, "A.IMPORTO_I", "IMPORTO_I", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_LIST, 92);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_LIST, "d. c. e. a. d. p.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_FORM, 16, 276, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOIEST, MyGlb.PANEL_FORM, "     di cui estinzione anticipata di prestiti");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOIEST, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOIEST, PPQRY_BILCONSEQUI1, "A.IMPORTO_I_EST", "IMPORTO_I_EST", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_LIST, 72);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_LIST, "L E. d. p. c. d. a s. d. i. i. b. a s. d. d. l.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_FORM, 16, 308, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOL, MyGlb.PANEL_FORM, "L) Entrate di parte corrente destinate a spese di investimento in base a specifiche disposizioni di legge");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOL, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOL, PPQRY_BILCONSEQUI1, "A.IMPORTO_L", "IMPORTO_L", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_LIST, 76);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_LIST, "M E. d. a. d. p. d. a e. a. d. p.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_FORM, 16, 340, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOM, MyGlb.PANEL_FORM, "M) Entrate da accensioni di prestiti destinate a estinzione anticipata dei prestiti");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOM, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOM, PPQRY_BILCONSEQUI1, "A.IMPORTO_M", "IMPORTO_M", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABIL1, MyGlb.PANEL_LIST, 0, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABIL1, MyGlb.PANEL_LIST, 192);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABIL1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABIL1, MyGlb.PANEL_LIST, "Ris. accant. di par. corr. stanz. nel bilancio dell esercizio");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABIL1, MyGlb.PANEL_FORM, 16, 372, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABIL1, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABIL1, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABIL1, MyGlb.PANEL_FORM, "- Risorse accantonate  di parte corrente stanziate nel bilancio dell'esercizio ");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_RISOACCABIL1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_RISOACCABIL1, PPQRY_BILCONSEQUI1, "A.RISORSE_ACCANTONATE_BILCORR", "RISORSE_ACCANTONATE_BILCORR", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBIL1, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBIL1, MyGlb.PANEL_LIST, 176);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBIL1, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBIL1, MyGlb.PANEL_LIST, "- Risorse vincolate di parte corrente nel bilancio ");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBIL1, MyGlb.PANEL_FORM, 16, 400, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBIL1, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBIL1, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBIL1, MyGlb.PANEL_FORM, "- Risorse vincolate di parte corrente nel bilancio ");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_RISOVINCBIL1, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_RISOVINCBIL1, PPQRY_BILCONSEQUI1, "A.RISORSE_VINCOLATE_BILCORR", "RISORSE_VINCOLATE_BILCORR", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIACCACORR, MyGlb.PANEL_LIST, 0, 36, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIACCACORR, MyGlb.PANEL_LIST, 216);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIACCACORR, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIACCACORR, MyGlb.PANEL_LIST, "Variaz. accanton. di parte corrente effettuata in sede di rendiconto");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIACCACORR, MyGlb.PANEL_FORM, 16, 428, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIACCACORR, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIACCACORR, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIACCACORR, MyGlb.PANEL_FORM, "- Variazione accantonamenti di parte corrente effettuata in sede di rendiconto (+)/(-)");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_VARIACCACORR, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_VARIACCACORR, PPQRY_BILCONSEQUI1, "A.VARIAZIONE_ACCANTONAMENTI_CORR", "VARIAZIONE_ACCANTONAMENTI_CORR", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_LIST, 72);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_LIST, "P U. a. d. am. p. s. d. in.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_FORM, 16, 460, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTOP, MyGlb.PANEL_FORM, "P) Utilizzo avanzo di amministrazione per spese di investimento");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTOP, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTOP, PPQRY_BILCONSEQUI1, "A.IMPORTO_P", "IMPORTO_P", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILC, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILC, MyGlb.PANEL_LIST, 184);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILC, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILC, MyGlb.PANEL_LIST, "Z 1 Ris. accant. in c capit. stanz. nel bilancio dell esercizio");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILC, MyGlb.PANEL_FORM, 16, 492, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILC, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILC, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILC, MyGlb.PANEL_FORM, "Z/1) Risorse accantonate  in c/capitale stanziate nel bilancio dell'esercizio ");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_RISOACCABILC, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_RISOACCABILC, PPQRY_BILCONSEQUI1, "A.RISORSE_ACCANTONATE_BILCAP", "RISORSE_ACCANTONATE_BILCAP", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILC, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILC, MyGlb.PANEL_LIST, 164);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILC, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILC, MyGlb.PANEL_LIST, "- Risorse vincolate in c/capitale nel bilancio");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILC, MyGlb.PANEL_FORM, 16, 520, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILC, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILC, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILC, MyGlb.PANEL_FORM, "- Risorse vincolate in c/capitale nel bilancio");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_RISOVINCBILC, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_RISOVINCBILC, PPQRY_BILCONSEQUI1, "A.RISORSE_VINCOLATE_BILCAP", "RISORSE_VINCOLATE_BILCAP", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAACCACAP, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAACCACAP, MyGlb.PANEL_LIST, 208);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAACCACAP, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAACCACAP, MyGlb.PANEL_LIST, "Variaz. accanton. in c capitale effettuata in sede di rendiconto");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAACCACAP, MyGlb.PANEL_FORM, 16, 548, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAACCACAP, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAACCACAP, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAACCACAP, MyGlb.PANEL_FORM, "- Variazione accantonamenti in c/capitale effettuata in sede di rendiconto (+)/(-)");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_VARIAACCACAP, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_VARIAACCACAP, PPQRY_BILCONSEQUI1, "A.VARIAZIONE_ACCANTONAMENTI_CAP", "VARIAZIONE_ACCANTONAMENTI_CAP", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILA, MyGlb.PANEL_LIST, 0, 36, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILA, MyGlb.PANEL_LIST, 196);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILA, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILA, MyGlb.PANEL_LIST, "Risorse accantonate  stanziate nel bilancio dell'esercizio ");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILA, MyGlb.PANEL_FORM, 16, 576, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILA, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILA, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOACCABILA, MyGlb.PANEL_FORM, "Risorse accantonate  stanziate nel bilancio dell'esercizio ");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_RISOACCABILA, -1, GRP_EQUILDIBILAN_GRUPPORICALC);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_RISOACCABILA, PPQRY_BILCONSEQUI1, "A.RISORSE_ACCANTONATE_BILANCIO", "RISORSE_ACCANTONATE_BILANCIO", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILA, MyGlb.PANEL_LIST, 0, 36, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILA, MyGlb.PANEL_LIST, 180);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILA, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILA, MyGlb.PANEL_LIST, "Risorse vincolate nel bilancio");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILA, MyGlb.PANEL_FORM, 16, 604, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILA, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILA, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_RISOVINCBILA, MyGlb.PANEL_FORM, "Risorse vincolate nel bilancio");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_RISOVINCBILA, -1, GRP_EQUILDIBILAN_GRUPPORICALC);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_RISOVINCBILA, PPQRY_BILCONSEQUI1, "A.RISORSE_VINCOLATE_BILANCIO", "RISORSE_VINCOLATE_BILANCIO", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAZACCANT, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAZACCANT, MyGlb.PANEL_LIST, 184);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAZACCANT, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAZACCANT, MyGlb.PANEL_LIST, "Variazione accantonamenti effettuata in sede di rendiconto");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAZACCANT, MyGlb.PANEL_FORM, 16, 632, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAZACCANT, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAZACCANT, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_VARIAZACCANT, MyGlb.PANEL_FORM, "Variazione accantonamenti effettuata in sede di rendiconto");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_VARIAZACCANT, -1, GRP_EQUILDIBILAN_GRUPPORICALC);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_VARIAZACCANT, PPQRY_BILCONSEQUI1, "A.VARIAZIONE_ACCANTONAMENTI", "VARIAZIONE_ACCANTONAMENTI", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHERICALC, MyGlb.PANEL_LIST, 640, 364, 96, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHERICALC, MyGlb.PANEL_LIST, 0);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHERICALC, MyGlb.PANEL_LIST, 2);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHERICALC, MyGlb.PANEL_FORM, 740, 576, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHERICALC, MyGlb.PANEL_FORM, 0);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHERICALC, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_ETICHERICALC, -1, GRP_EQUILDIBILAN_GRUPPORICALC);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_ETICHERICALC, -1, "", "ETICHERICALC", 0, 0, 0, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTNONRIC, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTNONRIC, MyGlb.PANEL_LIST, 112);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTNONRIC, MyGlb.PANEL_LIST, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTNONRIC, MyGlb.PANEL_LIST, "Ent. nn. ric. ch. non han. dt. cop. a imp.");
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTNONRIC, MyGlb.PANEL_FORM, 16, 660, 712, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTNONRIC, MyGlb.PANEL_FORM, 584);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTNONRIC, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_IMPORTNONRIC, MyGlb.PANEL_FORM, "Entrate non ricorrenti che non hanno dato copertura a impegni");
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_IMPORTNONRIC, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_IMPORTNONRIC, PPQRY_BILCONSEQUI1, "A.IMPORTO_NON_RIC", "IMPORTO_NON_RIC", 3, 14, 2, -13997);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, MyGlb.PANEL_LIST, 632, 356, 96, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_EQUILDIBILAN.SetRect(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, MyGlb.PANEL_FORM, 648, 708, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EQUILDIBILAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_EQUILDIBILAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_EQUILDIBILAN_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_EQUILDIBILAN.SetFieldPage(PFL_EQUILDIBILAN_ETICHEELABOR, -1, -1);
    PAN_EQUILDIBILAN.SetFieldPanel(PFL_EQUILDIBILAN_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_EQUILDIBILAN_InitQueries()
  {
    StringBuffer SQL;

    PAN_EQUILDIBILAN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_EQUILDIBILAN.SetIMDB(IMDB, "PQRY_BILCONSEQUI1", true);
    PAN_EQUILDIBILAN.set_SetString(MyGlb.MASTER_ROWNAME, "BIL CONS EQUILIBRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.IMPORTO_AA as IMPORTO_AA, ");
    SQL.append("  A.IMPORTO_B_EST as IMPORTO_B_EST, ");
    SQL.append("  A.IMPORTO_F_EST as IMPORTO_F_EST, ");
    SQL.append("  A.FONDO_ANTIC_LIQUIDITA as FONDO_ANTIC_LIQUIDITA, ");
    SQL.append("  A.IMPORTO_H as IMPORTO_H, ");
    SQL.append("  A.IMPORTO_H_EST as IMPORTO_H_EST, ");
    SQL.append("  A.IMPORTO_I as IMPORTO_I, ");
    SQL.append("  A.IMPORTO_I_EST as IMPORTO_I_EST, ");
    SQL.append("  A.IMPORTO_L as IMPORTO_L, ");
    SQL.append("  A.IMPORTO_M as IMPORTO_M, ");
    SQL.append("  A.IMPORTO_P as IMPORTO_P, ");
    SQL.append("  A.IMPORTO_NON_RIC as IMPORTO_NON_RIC, ");
    SQL.append("  A.FPV_S_204 as FPV_S_204, ");
    SQL.append("  A.RISORSE_ACCANTONATE_BILCORR as RISORSE_ACCANTONATE_BILCORR, ");
    SQL.append("  A.RISORSE_VINCOLATE_BILCORR as RISORSE_VINCOLATE_BILCORR, ");
    SQL.append("  A.VARIAZIONE_ACCANTONAMENTI_CORR as VARIAZIONE_ACCANTONAMENTI_CORR, ");
    SQL.append("  A.RISORSE_ACCANTONATE_BILCAP as RISORSE_ACCANTONATE_BILCAP, ");
    SQL.append("  A.RISORSE_VINCOLATE_BILCAP as RISORSE_VINCOLATE_BILCAP, ");
    SQL.append("  A.VARIAZIONE_ACCANTONAMENTI_CAP as VARIAZIONE_ACCANTONAMENTI_CAP, ");
    SQL.append("  A.RISORSE_ACCANTONATE_BILANCIO as RISORSE_ACCANTONATE_BILANCIO, ");
    SQL.append("  A.RISORSE_VINCOLATE_BILANCIO as RISORSE_VINCOLATE_BILANCIO, ");
    SQL.append("  A.VARIAZIONE_ACCANTONAMENTI as VARIAZIONE_ACCANTONAMENTI ");
    PAN_EQUILDIBILAN.SetQuery(PPQRY_BILCONSEQUI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_CONS_EQUILIBRI A ");
    PAN_EQUILDIBILAN.SetQuery(PPQRY_BILCONSEQUI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_EQUILDIBILAN.SetQuery(PPQRY_BILCONSEQUI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_EQUILDIBILAN.SetQuery(PPQRY_BILCONSEQUI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_EQUILDIBILAN.SetQuery(PPQRY_BILCONSEQUI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_EQUILDIBILAN.SetQuery(PPQRY_BILCONSEQUI1, 5, SQL, -1, "");
    PAN_EQUILDIBILAN.SetQueryDB(PPQRY_BILCONSEQUI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EQUILDIBILAN.SetMasterTable(0, "BIL_CONS_EQUILIBRI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_EQUILDIBILAN.Status() == 2)
    {
      int oldListQBE = PAN_EQUILDIBILAN.iUseListQBE;
      PAN_EQUILDIBILAN.iUseListQBE = 0;
      PAN_EQUILDIBILAN.PanelCommand(Glb.PCM_SEARCH);
      PAN_EQUILDIBILAN.PanelCommand(Glb.PCM_FIND);
      PAN_EQUILDIBILAN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_EQUILDIBILAN) PAN_EQUILDIBILAN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_EQUILDIBILAN) PAN_EQUILDIBILAN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_EQUILDIBILAN) PAN_EQUILDIBILAN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_EQUILDIBILAN) PAN_EQUILDIBILAN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_EQUILDIBILAN) PAN_EQUILDIBILAN_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_EQUILDIBILAN) PAN_EQUILDIBILAN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
