// **********************************************
// Capitoli Con Var Prov Anomalie
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CapitoliConVarProvAnomalie extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CAPITCONANOM_ETICHEESERCI = 0;
  private static int PFL_CAPITCONANOM_ETICHEPROPOS = 1;
  private static int PFL_CAPITCONANOM_ETICTIPOVARI = 2;
  private static int PFL_CAPITCONANOM_PARTE = 3;
  private static int PFL_CAPITCONANOM_CAPITOLO = 4;
  private static int PFL_CAPITCONANOM_ARTICOLO = 5;
  private static int PFL_CAPITCONANOM_STNINICO = 6;
  private static int PFL_CAPITCONANOM_VARIAZIONICO = 7;
  private static int PFL_CAPITCONANOM_VARCOMPROCO = 8;
  private static int PFL_CAPITCONANOM_ASSESTATOCO = 9;
  private static int PFL_CAPITCONANOM_DISPONIBILIT = 10;
  private static int PFL_CAPITCONANOM_REISCRIDAIMP = 11;
  private static int PFL_CAPITCONANOM_VARIREIDAIMP = 12;
  private static int PFL_CAPITCONANOM_VARCOMPCOIMP = 13;
  private static int PFL_CAPITCONANOM_ASSESTACOIMP = 14;
  private static int PFL_CAPITCONANOM_REISCRIDASTN = 15;
  private static int PFL_CAPITCONANOM_VARIREIDASTN = 16;
  private static int PFL_CAPITCONANOM_VARCOMPCOSTN = 17;
  private static int PFL_CAPITCONANOM_ASSESTACOSTN = 18;
  private static int PFL_CAPITCONANOM_STNINICOPURO = 19;
  private static int PFL_CAPITCONANOM_VARIAZCOPURO = 20;
  private static int PFL_CAPITCONANOM_VARCOMCOPURO = 21;
  private static int PFL_CAPITCONANOM_ASSESTCOPURO = 22;
  private static int PFL_CAPITCONANOM_IMPEGNATPURO = 23;
  private static int PFL_CAPITCONANOM_DISPPUROSPES = 24;
  private static int PFL_CAPITCONANOM_STNINICA = 25;
  private static int PFL_CAPITCONANOM_VARIAZIONICA = 26;
  private static int PFL_CAPITCONANOM_VARCOMPROCA = 27;
  private static int PFL_CAPITCONANOM_ASSESTATOCA = 28;
  private static int PFL_CAPITCONANOM_DISPONIBILCA = 29;
  private static int PFL_CAPITCONANOM_RESIINIZSPES = 30;
  private static int PFL_CAPITCONANOM_DIFCASCORESP = 31;

  private static int PPQRY_BILVARCOMPRO = 0;


  IDPanel PAN_CAPITCONANOM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS93(IMDB);
    //
    //
    Init_PQRY_BILVARCOMPRO(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS93(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS93, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS93, "TBL_PARS93");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS93,IMDBDef3.FLD_PARS93_NOMOGGUNIPRO, "NOMOGGUNIPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS93,IMDBDef3.FLD_PARS93_NOMOGGUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS93,IMDBDef3.FLD_PARS93_NOMOGGNUMPRO, "NOMOGGNUMPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS93,IMDBDef3.FLD_PARS93_NOMOGGNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS93,IMDBDef3.FLD_PARS93_NOMOGGANNPRO, "NOMOGGANNPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS93,IMDBDef3.FLD_PARS93_NOMOGGANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS93,IMDBDef3.FLD_PARS93_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS93,IMDBDef3.FLD_PARS93_NOMEOGGETIPO,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS93, 0);
  }

  private static void Init_PQRY_BILVARCOMPRO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_BILVARCOMPRO, 29);
    IMDB.set_TblCode(IMDBDef12.PQRY_BILVARCOMPRO, "PQRY_BILVARCOMPRO");
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECORDPARTE, "RECORDPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECORDPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVARCAP, "RECBILVARCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVARCAP,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVARART, "RECBILVARART");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVARART,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVASTINCO, "REBIVASTINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVASTINCO,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVAVACO, "RECBILVAVACO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVAVACO,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECOBILVARCO, "RECOBILVARCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECOBILVARCO,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVAASCO, "RECBILVAASCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVAASCO,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVARDIS, "RECBILVARDIS");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVARDIS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAREDAIM, "REBIVAREDAIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAREDAIM,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAVAREDI, "REBIVAVAREDI");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAVAREDI,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVACOIM, "RECBILVACOIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVACOIM,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAASCOIM, "REBIVAASCOIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAASCOIM,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAREDAST, "REBIVAREDAST");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAREDAST,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAVAREDS, "REBIVAVAREDS");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAVAREDS,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVACOST, "RECBILVACOST");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVACOST,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAASCOST, "REBIVAASCOST");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAASCOST,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVASTINCP, "REBIVASTINCP");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVASTINCP,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAVACOPU, "REBIVAVACOPU");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAVACOPU,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVACOPU, "RECBILVACOPU");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVACOPU,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAASCOPU, "REBIVAASCOPU");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAASCOPU,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVAIMPU, "RECBILVAIMPU");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVAIMPU,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVADIPUSP, "REBIVADIPUSP");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVADIPUSP,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVASTINCA, "REBIVASTINCA");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVASTINCA,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVAVACA, "RECBILVAVACA");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVAVACA,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECOBILVARCA, "RECOBILVARCA");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECOBILVARCA,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVAASCA, "RECBILVAASCA");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVAASCA,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVADICA, "RECBILVADICA");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_RECBILVADICA,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAREINSP, "REBIVAREINSP");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVAREINSP,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVADICCRS, "REBIVADICCRS");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILVARCOMPRO,IMDBDef12.PQSL_BILVARCOMPRO_REBIVADICCRS,2,15,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_BILVARCOMPRO, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CapitoliConVarProvAnomalie(MyWebEntryPoint w, IMDBObj imdb)
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
  public CapitoliConVarProvAnomalie()
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
    FormIdx = MyGlb.FRM_CAPCONVAPRAN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DFB8AA71-AFA5-480C-8FD8-DD0155FBB494";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 892;
    DesignHeight = 418;
    set_Caption(new IDVariant("Capitoli con Variazioni di Bilancio Provvisorie con Anomalie"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 892;
    Frames[1].Height = 392;
    Frames[1].Caption = "Capitoli con Anomalie";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 392;
    PAN_CAPITCONANOM = new IDPanel(w, this, 1, "PAN_CAPITCONANOM");
    Frames[1].Content = PAN_CAPITCONANOM;
    PAN_CAPITCONANOM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CAPITCONANOM.VS = MainFrm.VisualStyleList;
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 892-MyGlb.PAN_OFFS_X, 392-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CD6BC7CE-8206-4BBF-A674-207D018BDB56");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 68, 3772, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CAPITCONANOM.InitStatus = 2;
    PAN_CAPITCONANOM_Init();
    PAN_CAPITCONANOM_InitFields();
    PAN_CAPITCONANOM_InitQueries();
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
      PAN_CAPITCONANOM.UpdatePanel(MainFrm);
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
    return (obj instanceof CapitoliConVarProvAnomalie);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CapitoliConVarProvAnomalie.class.getName() : (Glb.ClassWithPackage(CapitoliConVarProvAnomalie.class) ? CapitoliConVarProvAnomalie.class.getName().substring(CapitoliConVarProvAnomalie.class.getPackage().getName().length() + 1) : CapitoliConVarProvAnomalie.class.getName()));
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
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_CAPITCONANOM.set_FieldText(PFL_CAPITCONANOM_ETICHEESERCI, IDL.Add((new IDVariant("Esercizio: ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_CAPITCONANOM.set_FieldText(PFL_CAPITCONANOM_ETICHEPROPOS, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Proposta: ")), IMDB.Value(IMDBDef3.TBL_PARS93, IMDBDef3.FLD_PARS93_NOMOGGUNIPRO, 0)), (new IDVariant("-"))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARS93, IMDBDef3.FLD_PARS93_NOMOGGNUMPRO, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARS93, IMDBDef3.FLD_PARS93_NOMOGGANNPRO, 0))).stringValue());
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Tipologia Variazione: "));
      IDVariant v_VTIPMOTVBIDE = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as TIPMOTVBIDES ");
      SQL.append("from ");
      SQL.append("  TIPI_MOTIVAZIONE_VBIL A ");
      SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARS93, IMDBDef3.FLD_PARS93_NOMEOGGETIPO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VTIPMOTVBIDE = QV.Get("TIPMOTVBIDES", IDVariant.STRING) ;
      }
      QV.Close();
      PAN_CAPITCONANOM.set_FieldText(PFL_CAPITCONANOM_ETICTIPOVARI, IDL.Add(IDL.Add(IDL.Add(S, IMDB.Value(IMDBDef3.TBL_PARS93, IMDBDef3.FLD_PARS93_NOMEOGGETIPO, 0)), (new IDVariant(" - "))), v_VTIPMOTVBIDE).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliConVarProvAnomalie", "Load", _e);
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
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliConVarProvAnomalie", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS93, IMDBDef3.FLD_PARS93_NOMOGGUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS93, IMDBDef3.FLD_PARS93_NOMOGGNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS93, IMDBDef3.FLD_PARS93_NOMOGGANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS93, IMDBDef3.FLD_PARS93_NOMEOGGETIPO, 0, new IDVariant());
  }

  // **********************************************************************
  // Capitoli con Anomalie On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CAPITCONANOM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CAPITCONANOM);
      // 
      // Capitoli con Anomalie On Dynamic Properties Body
      // Corpo Procedura
      // 
      // 
      // 1
      // 
      {
        if (IMDB.Value(IMDBDef12.PQRY_BILVARCOMPRO, IMDBDef12.PQSL_BILVARCOMPRO_RECBILVAASCO, 0).compareTo((new IDVariant(0)), true)<0)
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_ASSESTATOCO,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
        }
        else
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_ASSESTATOCO,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
        }
      }
      // 
      // 2
      // 
      {
        if (IMDB.Value(IMDBDef12.PQRY_BILVARCOMPRO, IMDBDef12.PQSL_BILVARCOMPRO_RECBILVARDIS, 0).compareTo((new IDVariant(0)), true)<0)
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_DISPONIBILIT,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
        }
        else
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_DISPONIBILIT,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
        }
      }
      // 
      // 3
      // 
      {
        if (IMDB.Value(IMDBDef12.PQRY_BILVARCOMPRO, IMDBDef12.PQSL_BILVARCOMPRO_REBIVAASCOIM, 0).compareTo((new IDVariant(0)), true)<0)
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_ASSESTACOIMP,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
        }
        else
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_ASSESTACOIMP,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
        }
      }
      // 
      // quattro
      // 
      {
        if (IMDB.Value(IMDBDef12.PQRY_BILVARCOMPRO, IMDBDef12.PQSL_BILVARCOMPRO_REBIVAASCOST, 0).compareTo((new IDVariant(0)), true)<0)
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_ASSESTACOSTN,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
        }
        else
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_ASSESTACOSTN,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
        }
      }
      // 
      // cinque
      // 
      {
        if (IMDB.Value(IMDBDef12.PQRY_BILVARCOMPRO, IMDBDef12.PQSL_BILVARCOMPRO_REBIVAASCOPU, 0).compareTo((new IDVariant(0)), true)<0)
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_ASSESTCOPURO,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
        }
        else
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_ASSESTCOPURO,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
        }
      }
      // 
      // sei
      // 
      {
        if (IMDB.Value(IMDBDef12.PQRY_BILVARCOMPRO, IMDBDef12.PQSL_BILVARCOMPRO_REBIVADIPUSP, 0).compareTo((new IDVariant(0)), true)<0)
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_DISPPUROSPES,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
        }
        else
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_DISPPUROSPES,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
        }
      }
      // 
      // sette
      // 
      {
        if (IMDB.Value(IMDBDef12.PQRY_BILVARCOMPRO, IMDBDef12.PQSL_BILVARCOMPRO_RECBILVAASCA, 0).compareTo((new IDVariant(0)), true)<0)
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_ASSESTATOCA,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
        }
        else
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_ASSESTATOCA,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
        }
      }
      // 
      // otto
      // 
      {
        if (IMDB.Value(IMDBDef12.PQRY_BILVARCOMPRO, IMDBDef12.PQSL_BILVARCOMPRO_RECBILVADICA, 0).compareTo((new IDVariant(0)), true)<0)
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_DISPONIBILCA,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
        }
        else
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_DISPONIBILCA,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
        }
      }
      // 
      // nove
      // 
      {
        if (IMDB.Value(IMDBDef12.PQRY_BILVARCOMPRO, IMDBDef12.PQSL_BILVARCOMPRO_REBIVADICCRS, 0).compareTo((new IDVariant(0)), true)<0)
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_DIFCASCORESP,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
          PAN_CAPITCONANOM.set_ToolTip(Glb.OBJ_FIELD,PFL_CAPITCONANOM_DIFCASCORESP,(new IDVariant("Cassa Superiore a Competenza + Residui")).stringValue()); 
        }
        else
        {
          PAN_CAPITCONANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_CAPITCONANOM_DIFCASCORESP,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
          PAN_CAPITCONANOM.set_ToolTip(Glb.OBJ_FIELD,PFL_CAPITCONANOM_DIFCASCORESP,(new IDVariant("")).stringValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliConVarProvAnomalie", "CapitoliconAnomalieOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Capitoli con Anomalie After Delete
  // Evento notificato dopo la cancellazione della riga
  // dal database.
  // **********************************************************************
  private void PAN_CAPITCONANOM_AfterDelete()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Capitoli con Anomalie After Delete Body
      // Corpo Procedura
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliConVarProvAnomalie", "CapitoliconAnomalieAfterDelete", _e);
    }
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
  private void PAN_CAPITCONANOM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CAPITCONANOM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CAPITCONANOM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CAPITCONANOM, Cancel);
    // Stub
  }

  private void PAN_CAPITCONANOM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CAPITCONANOM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CAPITCONANOM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CAPITCONANOM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CAPITCONANOM_Init()
  {

    PAN_CAPITCONANOM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CAPITCONANOM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CAPITCONANOM.SetSize(MyGlb.OBJ_FIELD, 32);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEESERCI, "281153B3-3B9A-44BA-86B0-54F62CBD6E6D");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEESERCI, "Esercizio: ");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEESERCI, MyGlb.VIS_VUONORALILEF);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEESERCI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEPROPOS, "AF14F9DD-A2B6-46EE-8F3A-10BFA7C7F305");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEPROPOS, "Proposta: ");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEPROPOS, MyGlb.VIS_VUONORALILEF);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICTIPOVARI, "0EAA7986-A480-4C7B-A92B-0BBFF9D17E57");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICTIPOVARI, "Tipologia Variazione: ");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICTIPOVARI, MyGlb.VIS_VUONORALILEF);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICTIPOVARI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_PARTE, "5BD867C6-AA46-43A8-8CE9-4F8658FDE2A8");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_PARTE, "Parte");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_PARTE, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_PARTE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_PARTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_CAPITOLO, "BCF0AE59-8B67-4405-AEFD-83CA436BD77C");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_CAPITOLO, "Capitolo");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_CAPITOLO, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ARTICOLO, "94406472-D874-46A0-A4CB-34C1A22E4D03");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ARTICOLO, "Articolo");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ARTICOLO, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICO, "6F98D04A-DD02-455E-B80D-E585AD634E87");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICO, "Stanziamento Iniziale");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICO, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICO, "43BD651C-6A21-4644-ADA5-9676BE2DB667");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICO, "Variazioni Definitive Competenza");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICO, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCO, "857956DF-11BF-40BB-BDEE-CB7520FC7633");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCO, "Variazioni Provvisorie Competenza");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCO, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCO, "B2E6EFBB-0CA4-48F9-8CA5-52268FF58827");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCO, "Assestato Competenza");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCO, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILIT, "094B65E5-5108-47E6-93C9-4F4E4407FDF4");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILIT, "Disponibilità Competenza");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILIT, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDAIMP, "9A329679-9D30-4B94-BB44-A6BF1463B05C");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDAIMP, "Reiscrizioni da Imp.");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDAIMP, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDAIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDAIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDAIMP, "CC32F93B-6FEC-4795-97B6-3534A691A429");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDAIMP, "Variazioni Definitive Reiscr. da Imp.");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDAIMP, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDAIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDAIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOIMP, "A55649F8-B032-4A57-9D1D-5ED02FACB794");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOIMP, "Variazioni Provvisorie Reiscr. da Imp.");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOIMP, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOIMP, "AA08185F-1EC1-4CCF-9974-79AD7A57967D");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOIMP, "Assestato Competenza Reisc. Imp.");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOIMP, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDASTN, "B344D6D7-AA57-41DA-820A-A62295EA7A74");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDASTN, "Reiscrizioni da Stn.");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDASTN, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDASTN, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDASTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDASTN, "51E4ED5E-A7E0-473F-861F-2AD52A1C8639");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDASTN, "Variazioni Definitive Reiscr. da Stn.");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDASTN, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDASTN, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDASTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOSTN, "A818BC50-4D9F-48C6-94A7-E642C4548ECD");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOSTN, "Variazioni Provvisorie Reiscr. da Stn.");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOSTN, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOSTN, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOSTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOSTN, "E72DF201-9D5E-4BCA-98DB-D06BE5D52F55");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOSTN, "Assestato Competenza Reisc. Stn.");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOSTN, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOSTN, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOSTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICOPURO, "D7A953F9-F8B0-45CE-A697-8C3FD7BDB386");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICOPURO, "Stanziamento Iniziale Comp. Puro");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICOPURO, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICOPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICOPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZCOPURO, "FE177D4A-0C0A-4383-AC1A-B410F3839025");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZCOPURO, "Variazioni Definitive Competenza Puro");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZCOPURO, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZCOPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZCOPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMCOPURO, "2487D622-3C73-4A99-8E40-37A266438E42");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMCOPURO, "Variazioni Provvisorie Competenza Puro");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMCOPURO, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMCOPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMCOPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTCOPURO, "BB28FA7A-6EF5-4E07-AEA5-98EF959C5423");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTCOPURO, "Assestato Competenza Pura");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTCOPURO, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTCOPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTCOPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_IMPEGNATPURO, "25051169-F3A7-428C-830C-694A2070811E");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_IMPEGNATPURO, "Impegnato Puro");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_IMPEGNATPURO, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_IMPEGNATPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_IMPEGNATPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPPUROSPES, "55848EB9-8121-46E1-B179-57117BCC133F");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPPUROSPES, "Disp. Competenza Pura (Spesa)");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPPUROSPES, "Disponibilità Competenza Pura (Spesa)");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPPUROSPES, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPPUROSPES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICA, "3CC9DD0A-6097-4DB1-9B90-5CD258CFACF0");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICA, "Stanziamento Iniziale Cassa");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICA, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICA, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICA, "8D414A6E-0751-4BA7-9B0E-632995BAE2CF");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICA, "Variazioni Definitive Cassa");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICA, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICA, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCA, "D2E17AC5-EA01-44A3-9B0C-FBD8BF078A91");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCA, "Variazioni Provvisorie Cassa");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCA, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCA, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCA, "A9EBE4CC-5E75-40DA-AB4E-F8E3C1E793AE");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCA, "Assestato Cassa");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCA, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCA, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILCA, "03740CB8-0E6F-4229-9B4F-7D6C623B6C84");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILCA, "Disponibilità Cassa");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILCA, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILCA, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILCA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_RESIINIZSPES, "8531E18F-7158-4407-9BC5-F37E302D1202");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_RESIINIZSPES, "Residui Iniziali Spesa");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_RESIINIZSPES, "");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_RESIINIZSPES, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_RESIINIZSPES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPITCONANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DIFCASCORESP, "B6F943DF-E4CC-4D65-A138-522A079AD7EF");
    PAN_CAPITCONANOM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DIFCASCORESP, "Asses. Comp. +Residui Ini. -Asses. Cassa (Spesa)");
    PAN_CAPITCONANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DIFCASCORESP, "Asses. Comp.+Residui Ini.-Asses. Cassa (Spesa)");
    PAN_CAPITCONANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DIFCASCORESP, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPITCONANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DIFCASCORESP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CAPITCONANOM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEESERCI, MyGlb.PANEL_LIST, 0, 12, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEESERCI, MyGlb.PANEL_LIST, 0);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEESERCI, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEESERCI, MyGlb.PANEL_FORM, 0, 12, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEESERCI, MyGlb.PANEL_FORM, 0);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEESERCI, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_ETICHEESERCI, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_ETICHEESERCI, -1, "", "ETICHEESERCI", 0, 0, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEPROPOS, MyGlb.PANEL_LIST, 0, 36, 248, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEPROPOS, MyGlb.PANEL_FORM, 4, 36, 132, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICHEPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_ETICHEPROPOS, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_ETICHEPROPOS, -1, "", "ETICHEPROPOS", 0, 0, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICTIPOVARI, MyGlb.PANEL_LIST, 180, 16, 680, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICTIPOVARI, MyGlb.PANEL_LIST, 0);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICTIPOVARI, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICTIPOVARI, MyGlb.PANEL_FORM, 180, 16, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICTIPOVARI, MyGlb.PANEL_FORM, 0);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ETICTIPOVARI, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_ETICTIPOVARI, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_ETICTIPOVARI, -1, "", "ETICTIPOVARI", 0, 0, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_PARTE, MyGlb.PANEL_LIST, 0, 104, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_PARTE, MyGlb.PANEL_LIST, 24);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_PARTE, MyGlb.PANEL_FORM, 4, 4, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_PARTE, MyGlb.PANEL_FORM, 24);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_PARTE, MyGlb.PANEL_FORM, "Pr.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_PARTE, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_PARTE, PPQRY_BILVARCOMPRO, "A.E_S", "RECORDPARTE", 5, 1, 0, -13997);
    PAN_CAPITCONANOM.SetValueListItem(PFL_CAPITCONANOM_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_CAPITCONANOM.SetValueListItem(PFL_CAPITCONANOM_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_CAPITOLO, MyGlb.PANEL_LIST, 64, 104, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_CAPITOLO, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_CAPITOLO, PPQRY_BILVARCOMPRO, "A.CAPITOLO", "RECBILVARCAP", 3, 16, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ARTICOLO, MyGlb.PANEL_LIST, 204, 104, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_ARTICOLO, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_ARTICOLO, PPQRY_BILVARCOMPRO, "A.ARTICOLO", "RECBILVARART", 1, 2, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICO, MyGlb.PANEL_LIST, 236, 104, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICO, MyGlb.PANEL_LIST, 68);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICO, MyGlb.PANEL_LIST, "Stanziamento Iniziale");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICO, MyGlb.PANEL_FORM, 4, 76, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICO, MyGlb.PANEL_FORM, 68);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICO, MyGlb.PANEL_FORM, "Stanz. Iniz.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_STNINICO, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_STNINICO, PPQRY_BILVARCOMPRO, "A.STN_INI_CO", "REBIVASTINCO", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICO, MyGlb.PANEL_LIST, 388, 104, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICO, MyGlb.PANEL_LIST, 96);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICO, MyGlb.PANEL_LIST, "Variazioni Definitive Competenza");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICO, MyGlb.PANEL_FORM, 4, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICO, MyGlb.PANEL_FORM, 96);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICO, MyGlb.PANEL_FORM, "Var. Def. Comp.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_VARIAZIONICO, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_VARIAZIONICO, PPQRY_BILVARCOMPRO, "A.VARIAZIONI_CO", "RECBILVAVACO", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCO, MyGlb.PANEL_LIST, 540, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCO, MyGlb.PANEL_LIST, 100);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCO, MyGlb.PANEL_LIST, "Variazioni Provvisorie Competenza");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCO, MyGlb.PANEL_FORM, 4, 580, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCO, MyGlb.PANEL_FORM, 100);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCO, MyGlb.PANEL_FORM, "Var. Prov. Comp.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_VARCOMPROCO, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_VARCOMPROCO, PPQRY_BILVARCOMPRO, "A.VARCOMPRO_CO", "RECOBILVARCO", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCO, MyGlb.PANEL_LIST, 672, 104, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCO, MyGlb.PANEL_LIST, 92);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCO, MyGlb.PANEL_LIST, "Assestato Competenza");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCO, MyGlb.PANEL_FORM, 4, 124, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCO, MyGlb.PANEL_FORM, 92);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCO, MyGlb.PANEL_FORM, "Asses. Compet.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_ASSESTATOCO, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_ASSESTATOCO, PPQRY_BILVARCOMPRO, "A.ASSESTATO_CO", "RECBILVAASCO", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILIT, MyGlb.PANEL_LIST, 824, 104, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILIT, MyGlb.PANEL_LIST, 96);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità Competenza");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 148, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILIT, MyGlb.PANEL_FORM, 96);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILIT, MyGlb.PANEL_FORM, "Dispon. Comp.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_DISPONIBILIT, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_DISPONIBILIT, PPQRY_BILVARCOMPRO, "A.DISPONIBILITA", "RECBILVARDIS", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDAIMP, MyGlb.PANEL_LIST, 976, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDAIMP, MyGlb.PANEL_LIST, 132);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDAIMP, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDAIMP, MyGlb.PANEL_LIST, "Reiscrizioni da Imp.");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDAIMP, MyGlb.PANEL_FORM, 4, 172, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDAIMP, MyGlb.PANEL_FORM, 132);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDAIMP, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDAIMP, MyGlb.PANEL_FORM, "Reiscrizioni da Imp.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_REISCRIDAIMP, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_REISCRIDAIMP, PPQRY_BILVARCOMPRO, "A.REISCRIZIONI_DA_IMP", "REBIVAREDAIM", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDAIMP, MyGlb.PANEL_LIST, 1108, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDAIMP, MyGlb.PANEL_LIST, 164);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDAIMP, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDAIMP, MyGlb.PANEL_LIST, "Variazioni Definitive Reiscr. da Imp.");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDAIMP, MyGlb.PANEL_FORM, 4, 196, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDAIMP, MyGlb.PANEL_FORM, 164);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDAIMP, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDAIMP, MyGlb.PANEL_FORM, "Variaz. Defin. Reiscr da Imp");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_VARIREIDAIMP, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_VARIREIDAIMP, PPQRY_BILVARCOMPRO, "A.VARIAZIONI_REISCR_DA_IMP", "REBIVAVAREDI", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOIMP, MyGlb.PANEL_LIST, 1240, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOIMP, MyGlb.PANEL_LIST, 124);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOIMP, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOIMP, MyGlb.PANEL_LIST, "Variazioni Provvisorie Reiscr. da Imp.");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOIMP, MyGlb.PANEL_FORM, 4, 604, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOIMP, MyGlb.PANEL_FORM, 124);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOIMP, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOIMP, MyGlb.PANEL_FORM, "Var. Prov. Rs. da Imp");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_VARCOMPCOIMP, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_VARCOMPCOIMP, PPQRY_BILVARCOMPRO, "A.VARCOMPRO_CO_IMP", "RECBILVACOIM", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOIMP, MyGlb.PANEL_LIST, 1372, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOIMP, MyGlb.PANEL_LIST, 116);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOIMP, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOIMP, MyGlb.PANEL_LIST, "Asses. Competenza Reisc Imp");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOIMP, MyGlb.PANEL_FORM, 4, 220, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOIMP, MyGlb.PANEL_FORM, 116);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOIMP, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOIMP, MyGlb.PANEL_FORM, "Ass. Comp. Rs. Imp");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_ASSESTACOIMP, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_ASSESTACOIMP, PPQRY_BILVARCOMPRO, "A.ASSESTATO_CO_IMP", "REBIVAASCOIM", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDASTN, MyGlb.PANEL_LIST, 1504, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDASTN, MyGlb.PANEL_LIST, 132);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDASTN, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDASTN, MyGlb.PANEL_LIST, "Reiscrizioni da Stn.");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDASTN, MyGlb.PANEL_FORM, 4, 244, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDASTN, MyGlb.PANEL_FORM, 132);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDASTN, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_REISCRIDASTN, MyGlb.PANEL_FORM, "Reiscrizioni da Stn.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_REISCRIDASTN, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_REISCRIDASTN, PPQRY_BILVARCOMPRO, "A.REISCRIZIONI_DA_STN", "REBIVAREDAST", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDASTN, MyGlb.PANEL_LIST, 1636, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDASTN, MyGlb.PANEL_LIST, 164);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDASTN, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDASTN, MyGlb.PANEL_LIST, "Variazioni Definitive Reiscr. da Stn.");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDASTN, MyGlb.PANEL_FORM, 4, 268, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDASTN, MyGlb.PANEL_FORM, 164);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDASTN, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIREIDASTN, MyGlb.PANEL_FORM, "Variaz. Defin. Reiscr da Stn");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_VARIREIDASTN, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_VARIREIDASTN, PPQRY_BILVARCOMPRO, "A.VARIAZIONI_REISCR_DA_STN", "REBIVAVAREDS", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOSTN, MyGlb.PANEL_LIST, 1768, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOSTN, MyGlb.PANEL_LIST, 124);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOSTN, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOSTN, MyGlb.PANEL_LIST, "Variazioni Provvisorie Reiscr. da Stn.");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOSTN, MyGlb.PANEL_FORM, 4, 628, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOSTN, MyGlb.PANEL_FORM, 124);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOSTN, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPCOSTN, MyGlb.PANEL_FORM, "Var. Prov. Rs. da Stn");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_VARCOMPCOSTN, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_VARCOMPCOSTN, PPQRY_BILVARCOMPRO, "A.VARCOMPRO_CO_STN", "RECBILVACOST", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOSTN, MyGlb.PANEL_LIST, 1900, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOSTN, MyGlb.PANEL_LIST, 116);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOSTN, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOSTN, MyGlb.PANEL_LIST, "Assestato Competenza Reisc Stn");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOSTN, MyGlb.PANEL_FORM, 4, 292, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOSTN, MyGlb.PANEL_FORM, 116);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOSTN, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTACOSTN, MyGlb.PANEL_FORM, "Ass. Comp. Rs. Stn");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_ASSESTACOSTN, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_ASSESTACOSTN, PPQRY_BILVARCOMPRO, "A.ASSESTATO_CO_STN", "REBIVAASCOST", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICOPURO, MyGlb.PANEL_LIST, 2032, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICOPURO, MyGlb.PANEL_LIST, 104);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICOPURO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICOPURO, MyGlb.PANEL_LIST, "Stanziamento Iniziale Comp. Puro");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICOPURO, MyGlb.PANEL_FORM, 4, 316, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICOPURO, MyGlb.PANEL_FORM, 104);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICOPURO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICOPURO, MyGlb.PANEL_FORM, "Stn. Inz. Cmp. Pr.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_STNINICOPURO, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_STNINICOPURO, PPQRY_BILVARCOMPRO, "A.STN_INI_CO_PURO", "REBIVASTINCP", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZCOPURO, MyGlb.PANEL_LIST, 2164, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZCOPURO, MyGlb.PANEL_LIST, 128);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZCOPURO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZCOPURO, MyGlb.PANEL_LIST, "Variazioni Definitive Competenza Puro");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZCOPURO, MyGlb.PANEL_FORM, 4, 340, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZCOPURO, MyGlb.PANEL_FORM, 128);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZCOPURO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZCOPURO, MyGlb.PANEL_FORM, "Var. Defin. Comp. Pr.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_VARIAZCOPURO, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_VARIAZCOPURO, PPQRY_BILVARCOMPRO, "A.VARIAZIONI_CO_PURO", "REBIVAVACOPU", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMCOPURO, MyGlb.PANEL_LIST, 2296, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMCOPURO, MyGlb.PANEL_LIST, 132);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMCOPURO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMCOPURO, MyGlb.PANEL_LIST, "Variazioni Provvisorie Competenza Puro");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMCOPURO, MyGlb.PANEL_FORM, 4, 652, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMCOPURO, MyGlb.PANEL_FORM, 132);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMCOPURO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMCOPURO, MyGlb.PANEL_FORM, "Var. Provv. Comp. Pr.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_VARCOMCOPURO, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_VARCOMCOPURO, PPQRY_BILVARCOMPRO, "A.VARCOMPRO_CO_PURO", "RECBILVACOPU", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTCOPURO, MyGlb.PANEL_LIST, 2428, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTCOPURO, MyGlb.PANEL_LIST, 128);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTCOPURO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTCOPURO, MyGlb.PANEL_LIST, "Assestato Competenza Pura");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTCOPURO, MyGlb.PANEL_FORM, 4, 364, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTCOPURO, MyGlb.PANEL_FORM, 128);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTCOPURO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTCOPURO, MyGlb.PANEL_FORM, "Asses. Compet. Pura");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_ASSESTCOPURO, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_ASSESTCOPURO, PPQRY_BILVARCOMPRO, "A.ASSESTATO_CO_PURO", "REBIVAASCOPU", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_IMPEGNATPURO, MyGlb.PANEL_LIST, 2560, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_IMPEGNATPURO, MyGlb.PANEL_LIST, 108);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_IMPEGNATPURO, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_IMPEGNATPURO, MyGlb.PANEL_LIST, "Impegnato Puro");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_IMPEGNATPURO, MyGlb.PANEL_FORM, 4, 388, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_IMPEGNATPURO, MyGlb.PANEL_FORM, 108);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_IMPEGNATPURO, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_IMPEGNATPURO, MyGlb.PANEL_FORM, "Impegnato Puro");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_IMPEGNATPURO, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_IMPEGNATPURO, PPQRY_BILVARCOMPRO, "A.IMPEGNATO_PURO", "RECBILVAIMPU", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPPUROSPES, MyGlb.PANEL_LIST, 2692, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPPUROSPES, MyGlb.PANEL_LIST, 168);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPPUROSPES, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPPUROSPES, MyGlb.PANEL_LIST, "Disp. Competenza Pura (Spesa)");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPPUROSPES, MyGlb.PANEL_FORM, 4, 412, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPPUROSPES, MyGlb.PANEL_FORM, 168);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPPUROSPES, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPPUROSPES, MyGlb.PANEL_FORM, "Dsp. Compet. Pura Spesa");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_DISPPUROSPES, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_DISPPUROSPES, PPQRY_BILVARCOMPRO, "A.DISPONIBILITA_PURO_SPESA", "REBIVADIPUSP", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICA, MyGlb.PANEL_LIST, 2824, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICA, MyGlb.PANEL_LIST, 68);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICA, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICA, MyGlb.PANEL_LIST, "Stanziamento Iniziale Cassa");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICA, MyGlb.PANEL_FORM, 4, 436, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICA, MyGlb.PANEL_FORM, 68);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICA, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_STNINICA, MyGlb.PANEL_FORM, "Stn. Inz. C.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_STNINICA, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_STNINICA, PPQRY_BILVARCOMPRO, "A.STN_INI_CA", "REBIVASTINCA", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICA, MyGlb.PANEL_LIST, 2956, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICA, MyGlb.PANEL_LIST, 96);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICA, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICA, MyGlb.PANEL_LIST, "Variazioni Definitive Cassa");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICA, MyGlb.PANEL_FORM, 4, 460, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICA, MyGlb.PANEL_FORM, 96);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICA, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARIAZIONICA, MyGlb.PANEL_FORM, "Var. Defin. Cas.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_VARIAZIONICA, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_VARIAZIONICA, PPQRY_BILVARCOMPRO, "A.VARIAZIONI_CA", "RECBILVAVACA", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCA, MyGlb.PANEL_LIST, 3088, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCA, MyGlb.PANEL_LIST, 100);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCA, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCA, MyGlb.PANEL_LIST, "Variazioni Provvisorie Cassa");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCA, MyGlb.PANEL_FORM, 4, 676, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCA, MyGlb.PANEL_FORM, 100);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCA, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_VARCOMPROCA, MyGlb.PANEL_FORM, "Var. Provv. Cas.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_VARCOMPROCA, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_VARCOMPROCA, PPQRY_BILVARCOMPRO, "A.VARCOMPRO_CA", "RECOBILVARCA", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCA, MyGlb.PANEL_LIST, 3220, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCA, MyGlb.PANEL_LIST, 92);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCA, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCA, MyGlb.PANEL_LIST, "Assestato Cassa");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCA, MyGlb.PANEL_FORM, 4, 484, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCA, MyGlb.PANEL_FORM, 92);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCA, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_ASSESTATOCA, MyGlb.PANEL_FORM, "Asses. Cassa");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_ASSESTATOCA, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_ASSESTATOCA, PPQRY_BILVARCOMPRO, "A.ASSESTATO_CA", "RECBILVAASCA", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILCA, MyGlb.PANEL_LIST, 3352, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILCA, MyGlb.PANEL_LIST, 112);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILCA, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILCA, MyGlb.PANEL_LIST, "Disponibilità Cassa");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILCA, MyGlb.PANEL_FORM, 4, 508, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILCA, MyGlb.PANEL_FORM, 112);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILCA, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DISPONIBILCA, MyGlb.PANEL_FORM, "Disponibilità Cassa");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_DISPONIBILCA, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_DISPONIBILCA, PPQRY_BILVARCOMPRO, "A.DISPONIBILITA_CA", "RECBILVADICA", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_RESIINIZSPES, MyGlb.PANEL_LIST, 3484, 104, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_RESIINIZSPES, MyGlb.PANEL_LIST, 120);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_RESIINIZSPES, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_RESIINIZSPES, MyGlb.PANEL_LIST, "Residui Iniziali Spesa");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_RESIINIZSPES, MyGlb.PANEL_FORM, 4, 532, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_RESIINIZSPES, MyGlb.PANEL_FORM, 120);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_RESIINIZSPES, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_RESIINIZSPES, MyGlb.PANEL_FORM, "Res. Iniziali Spesa");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_RESIINIZSPES, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_RESIINIZSPES, PPQRY_BILVARCOMPRO, "A.RESIDUI_INIZ_SPESA", "REBIVAREINSP", 2, 15, 0, -13997);
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DIFCASCORESP, MyGlb.PANEL_LIST, 3616, 104, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DIFCASCORESP, MyGlb.PANEL_LIST, 172);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DIFCASCORESP, MyGlb.PANEL_LIST, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DIFCASCORESP, MyGlb.PANEL_LIST, "Asses. Comp. +Residui Ini. -Asses. Cassa (Spesa)");
    PAN_CAPITCONANOM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DIFCASCORESP, MyGlb.PANEL_FORM, 4, 556, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPITCONANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DIFCASCORESP, MyGlb.PANEL_FORM, 172);
    PAN_CAPITCONANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DIFCASCORESP, MyGlb.PANEL_FORM, 1);
    PAN_CAPITCONANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPITCONANOM_DIFCASCORESP, MyGlb.PANEL_FORM, "Ass. Cm. Res. In. Ass. Cas. Sp.");
    PAN_CAPITCONANOM.SetFieldPage(PFL_CAPITCONANOM_DIFCASCORESP, -1, -1);
    PAN_CAPITCONANOM.SetFieldPanel(PFL_CAPITCONANOM_DIFCASCORESP, PPQRY_BILVARCOMPRO, "A.DIFF_CASSA_COMP_RES_SPESA", "REBIVADICCRS", 2, 15, 0, -13997);
  }

  private void PAN_CAPITCONANOM_InitQueries()
  {
    StringBuffer SQL;

    PAN_CAPITCONANOM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CAPITCONANOM.SetIMDB(IMDB, "PQRY_BILVARCOMPRO", true);
    PAN_CAPITCONANOM.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.E_S as RECORDPARTE, ");
    SQL.append("  A.CAPITOLO as RECBILVARCAP, ");
    SQL.append("  A.ARTICOLO as RECBILVARART, ");
    SQL.append("  A.STN_INI_CO as REBIVASTINCO, ");
    SQL.append("  A.VARIAZIONI_CO as RECBILVAVACO, ");
    SQL.append("  A.VARCOMPRO_CO as RECOBILVARCO, ");
    SQL.append("  A.ASSESTATO_CO as RECBILVAASCO, ");
    SQL.append("  A.DISPONIBILITA as RECBILVARDIS, ");
    SQL.append("  A.REISCRIZIONI_DA_IMP as REBIVAREDAIM, ");
    SQL.append("  A.VARIAZIONI_REISCR_DA_IMP as REBIVAVAREDI, ");
    SQL.append("  A.VARCOMPRO_CO_IMP as RECBILVACOIM, ");
    SQL.append("  A.ASSESTATO_CO_IMP as REBIVAASCOIM, ");
    SQL.append("  A.REISCRIZIONI_DA_STN as REBIVAREDAST, ");
    SQL.append("  A.VARIAZIONI_REISCR_DA_STN as REBIVAVAREDS, ");
    SQL.append("  A.VARCOMPRO_CO_STN as RECBILVACOST, ");
    SQL.append("  A.ASSESTATO_CO_STN as REBIVAASCOST, ");
    SQL.append("  A.STN_INI_CO_PURO as REBIVASTINCP, ");
    SQL.append("  A.VARIAZIONI_CO_PURO as REBIVAVACOPU, ");
    SQL.append("  A.VARCOMPRO_CO_PURO as RECBILVACOPU, ");
    SQL.append("  A.ASSESTATO_CO_PURO as REBIVAASCOPU, ");
    SQL.append("  A.IMPEGNATO_PURO as RECBILVAIMPU, ");
    SQL.append("  A.DISPONIBILITA_PURO_SPESA as REBIVADIPUSP, ");
    SQL.append("  A.STN_INI_CA as REBIVASTINCA, ");
    SQL.append("  A.VARIAZIONI_CA as RECBILVAVACA, ");
    SQL.append("  A.VARCOMPRO_CA as RECOBILVARCA, ");
    SQL.append("  A.ASSESTATO_CA as RECBILVAASCA, ");
    SQL.append("  A.DISPONIBILITA_CA as RECBILVADICA, ");
    SQL.append("  A.RESIDUI_INIZ_SPESA as REBIVAREINSP, ");
    SQL.append("  A.DIFF_CASSA_COMP_RES_SPESA as REBIVADICCRS ");
    PAN_CAPITCONANOM.SetQuery(PPQRY_BILVARCOMPRO, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_VARCOMPRO A ");
    PAN_CAPITCONANOM.SetQuery(PPQRY_BILVARCOMPRO, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  VARCOMPRO B, ");
    SQL.append("  T54 C ");
    SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   (B.TIPO_VAR = C.CODICE) ");
    SQL.append("and   (C.TIPOLOGIA = ~~TBL_PARS93.NOMEOGGETIPO~~) ");
    SQL.append("and   (B.UNITA_PROPONENTE = ~~TBL_PARS93.NOMOGGUNIPRO~~) ");
    SQL.append("and   (B.NUMERO_PROPOSTA = ~~TBL_PARS93.NOMOGGNUMPRO~~) ");
    SQL.append("and   (B.ANNO_PROPOSTA = ~~TBL_PARS93.NOMOGGANNPRO~~) ");
    SQL.append("))) ");
    SQL.append("and   (A.ASSESTATO_CO < 0 OR A.DISPONIBILITA < 0 OR A.ASSESTATO_CO_IMP < 0 OR A.ASSESTATO_CO_STN < 0 OR A.ASSESTATO_CO_PURO < 0 OR A.DISPONIBILITA_PURO_SPESA < 0 OR A.ASSESTATO_CA < 0 OR A.DISPONIBILITA_CA < 0 OR A.DIFF_CASSA_COMP_RES_SPESA < 0) ");
    PAN_CAPITCONANOM.SetQuery(PPQRY_BILVARCOMPRO, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPITCONANOM.SetQuery(PPQRY_BILVARCOMPRO, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPITCONANOM.SetQuery(PPQRY_BILVARCOMPRO, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_CAPITCONANOM.SetQuery(PPQRY_BILVARCOMPRO, 5, SQL, -1, "");
    PAN_CAPITCONANOM.SetQueryDB(PPQRY_BILVARCOMPRO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAPITCONANOM.SetMasterTable(0, "BIL_VARCOMPRO");
    PAN_CAPITCONANOM.AddToSortList(PFL_CAPITCONANOM_PARTE, true);
    PAN_CAPITCONANOM.AddToSortList(PFL_CAPITCONANOM_CAPITOLO, true);
    PAN_CAPITCONANOM.AddToSortList(PFL_CAPITCONANOM_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CAPITCONANOM.Status() == 2)
    {
      int oldListQBE = PAN_CAPITCONANOM.iUseListQBE;
      PAN_CAPITCONANOM.iUseListQBE = 0;
      PAN_CAPITCONANOM.PanelCommand(Glb.PCM_SEARCH);
      PAN_CAPITCONANOM.PanelCommand(Glb.PCM_FIND);
      PAN_CAPITCONANOM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CAPITCONANOM) PAN_CAPITCONANOM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAPITCONANOM) PAN_CAPITCONANOM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CAPITCONANOM) PAN_CAPITCONANOM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAPITCONANOM) PAN_CAPITCONANOM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CAPITCONANOM) PAN_CAPITCONANOM_AfterDelete();
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
    if (SrcObj == PAN_CAPITCONANOM) PAN_CAPITCONANOM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
