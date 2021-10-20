// **********************************************
// Generazione Variazioni Proposte Var
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GenerazioneVariazioniProposteVar extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_PROPODAELABO = 0;
  private static int GRP_PARAMETRI_VARIADAGENER = 1;

  private static int PFL_PARAMETRI_ES = 0;
  private static int PFL_PARAMETRI_ESERCIZIO = 1;
  private static int PFL_PARAMETRI_PERIODO = 2;
  private static int PFL_PARAMETRI_PERIRIACCODI = 3;
  private static int PFL_PARAMETRI_PROGRUO = 4;
  private static int PFL_PARAMETRI_ETICHETTASF = 5;
  private static int PFL_PARAMETRI_DESCRIZIONE = 6;
  private static int PFL_PARAMETRI_DESCRDANOTE = 7;
  private static int PFL_PARAMETRI_IMPSEDEDEL = 8;
  private static int PFL_PARAMETRI_IMPNUMERODEL = 9;
  private static int PFL_PARAMETRI_IMPANNODEL = 10;
  private static int PFL_PARAMETRI_IMPUNITAPROP = 11;
  private static int PFL_PARAMETRI_IMPNUMERPROP = 12;
  private static int PFL_PARAMETRI_IMPANNOPROPO = 13;
  private static int PFL_PARAMETRI_DATAVAR = 14;
  private static int PFL_PARAMETRI_ETICHSCELDEL = 15;
  private static int PFL_PARAMETRI_INFODEL = 16;
  private static int PFL_PARAMETRI_ETICNELLDESC = 17;
  private static int PFL_PARAMETRI_SCELTAPROP = 18;
  private static int PFL_PARAMETRI_INFOPROP = 19;
  private static int PFL_PARAMETRI_ETICHEELABOR = 20;

  private static int PPQRY_PARAMETRI547 = 0;

  private static int PPQRY_PERIODRIACCE = 1;

  private static int PPQRY_CAPUO = 2;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI550(IMDB);
    //
    //
    Init_PQRY_PARAMETRI547(IMDB);
    Init_PQRY_PARAMETRI547_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI550(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI550, 13);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI550, "TBL_PARAMETRI550");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NOMEOGGETTES,12,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPERI,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPROG,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NOMOGGDEDANO, "NOMOGGDEDANO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NOMOGGDEDANO,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NOMOGGDATVAR, "NOMOGGDATVAR");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI550,IMDBDef5.FLD_PARAMETRI550_NOMOGGDATVAR,6,14,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI550, 0);
  }

  private static void Init_PQRY_PARAMETRI547(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI547, 13);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI547, "PQRY_PARAMETRI547");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGETTES,12,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPERI,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPROG,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NOMOGGDEDANO, "NOMOGGDEDANO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NOMOGGDEDANO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NOMOGGDATVAR, "NOMOGGDATVAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547,IMDBDef14.PQSL_PARAMETRI547_NOMOGGDATVAR,6,14,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI547, 0);
  }

  private static void Init_PQRY_PARAMETRI547_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI547_RS, 13);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI547_RS, "PQRY_PARAMETRI547_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGETTES,12,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPERI,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPROG,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NOMOGGDEDANO, "NOMOGGDEDANO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NOMOGGDEDANO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NOMOGGDATVAR, "NOMOGGDATVAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI547_RS,IMDBDef14.PQSL_PARAMETRI547_NOMOGGDATVAR,6,14,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GenerazioneVariazioniProposteVar(MyWebEntryPoint w, IMDBObj imdb)
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
  public GenerazioneVariazioniProposteVar()
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
    FormIdx = MyGlb.FRM_GENVARPROVAR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "ACD67BAB-7FC8-4958-A660-34902DBE8C4F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 692;
    DesignHeight = 366;
    set_Caption(new IDVariant("Generazione Variazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 692;
    Frames[1].Height = 340;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 340;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 692-MyGlb.PAN_OFFS_X, 340-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "12FE1345-1A86-4D0D-B6F5-C4CD36BCBD50");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1312, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI550, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENVARPROVAR_PARAMETRI547();
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
    if (CallerIdx == MyGlb.FRM_SCELPERIRIAC && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_PERIODO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELPERIRIAC && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_PERIRIACCODI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_ETICHSCELDEL) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SCELTAPROP) {
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
    return (obj instanceof GenerazioneVariazioniProposteVar);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GenerazioneVariazioniProposteVar.class.getName() : (Glb.ClassWithPackage(GenerazioneVariazioniProposteVar.class) ? GenerazioneVariazioniProposteVar.class.getName().substring(GenerazioneVariazioniProposteVar.class.getPackage().getName().length() + 1) : GenerazioneVariazioniProposteVar.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      UNLOAD_PARAMEDELETE();
      ((ProposteVariazioniImpegniSubimpegni)MainFrm.GetForm(MyGlb.FRM_PROVARIMPSUB,0)).PAN_ELENCOIMPSUB.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProposteVar", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPERI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPROG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_DESCRIZIONE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMOGGDEDANO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_ANNO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NUMERO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_SEDE_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_ANNO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_UNITA_PROPONENTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NUMERO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMOGGDATVAR, 0, new IDVariant());
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
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VCODICEPERIO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VANNO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VPERRIAFILDI = new IDVariant(0,IDVariant.STRING);
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMOGGDEDANO, 0, (new IDVariant("NO")));
      // 
      // da rivedere in updating
      // 
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMOGGDATVAR, 0, IDL.Today());
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_PARAMETRI.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      if (IDL.IsNull(IMDB.Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPROG, 0)))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPROG, 0, (new IDVariant(-1)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGETTES, 0)))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGETTES, 0, (new IDVariant("S")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPERI, 0)))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1, ");
        SQL.append("  MAX(A.CODICE) as MAXPERRIACOD, ");
        SQL.append("  MAX(CASE WHEN A.TIPO = 'CONS' THEN TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')) - 1 ELSE TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')) END) as MAIPRTCYT1YT, ");
        SQL.append("  MAX(CASE WHEN (A.FILTRO_DISP IS NULL) THEN 'EFF' ELSE CASE WHEN A.FILTRO_DISP = 'DISP_31_12' THEN 'FIN' ELSE 'EFF' END END) as MIINPRFDEIPR ");
        SQL.append("from ");
        SQL.append("  PERIODI_RIACCERTAMENTI A ");
        SQL.append("where ((TRUNC( SYSDATE ) BETWEEN A.DATA_INIZIO AND NVL(A.DATA_FINE, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          v_VCODICEPERIO = QV.Get("MAXPERRIACOD", IDVariant.INTEGER) ;
          v_VANNO = QV.Get("MAIPRTCYT1YT", IDVariant.INTEGER) ;
          v_VPERRIAFILDI = QV.Get("MIINPRFDEIPR", IDVariant.STRING) ;
        }
        QV.Close();
        if (v_VCOUNT.equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPERI, 0, new IDVariant(v_VCODICEPERIO));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEESER, 0, new IDVariant(v_VANNO));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProposteVar", "Load", _e);
    }
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
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELPERIRIAC)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPERI, 0, IMDB.Value(IMDBDef8.PQRY_PERIODRIACC1, IMDBDef8.PQSL_PERIODRIACC1_PERIRIACCODI, 0));
        PAN_PARAMETRI.RefreshLookup();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProposteVar", "EndModal", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_ANNO_DEL, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_ANNO_PROPOSTA, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProposteVar", "ParametriOnDynamicProperties", _e);
    }
  }

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
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_IMPSEDEDEL)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_IMPNUMERODEL)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_IMPANNODEL)), true)))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_SEDE_DEL, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_SEDE_DEL, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_ANNO_DEL, 0))))
        {
          IDVariant v_SEDE = null;
          v_SEDE = IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_SEDE_DEL, 0);
          IDVariant v_NUMERO = null;
          v_NUMERO = IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NUMERO_DEL, 0);
          IDVariant v_ANNO = null;
          v_ANNO = IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_ANNO_DEL, 0);
          MainFrm.ControlloDelibere(v_SEDE, v_ANNO, v_NUMERO, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_SEDE_DEL, 0, new IDVariant(v_SEDE));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NUMERO_DEL, 0, new IDVariant(v_NUMERO));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_ANNO_DEL, 0, new IDVariant(v_ANNO));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_IMPUNITAPROP)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_IMPNUMERPROP)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_IMPANNOPROPO)), true)))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_UNITA_PROPONENTE, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_UNITA_PROPONENTE, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_UNITA_PROPONENTE, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_ANNO_PROPOSTA, 0))))
        {
          IDVariant v_UNITA = null;
          v_UNITA = IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_UNITA_PROPONENTE, 0);
          IDVariant v_NUMERO = null;
          v_NUMERO = IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NUMERO_PROPOSTA, 0);
          IDVariant v_ANNO = null;
          v_ANNO = IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_ANNO_PROPOSTA, 0);
          MainFrm.ControlloProposte(v_UNITA, v_ANNO, v_NUMERO);
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_UNITA_PROPONENTE, 0, new IDVariant(v_UNITA));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NUMERO_PROPOSTA, 0, new IDVariant(v_NUMERO));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_ANNO_PROPOSTA, 0, new IDVariant(v_ANNO));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_ESERCIZIO)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_PERIODO)), true)))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEESER, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPERI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGETTES, 0))))
        {
          if (!(ControlloRecordTipoVar()))
          {
            IDVariant v_MSGERR = new IDVariant(0,IDVariant.STRING);
            v_MSGERR = (new IDVariant("Esistono proposte da elaborare senza indicazione del tipo variazione. Non è possibile procedere"));
            PAN_PARAMETRI.SetErrorText(v_MSGERR.stringValue()); 
          }
        }
        else
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPERI, 0))) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEESER, 0)))
          {
            IDVariant v_VPERIRIACTIP = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.TIPO as PERIRIACTIPO ");
            SQL.append("from ");
            SQL.append("  PERIODI_RIACCERTAMENTI A ");
            SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPERI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VPERIRIACTIP = QV.Get("PERIRIACTIPO", IDVariant.STRING) ;
            }
            QV.Close();
            if (v_VPERIRIACTIP.equals((new IDVariant("CONS")), true))
            {
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEESER, 0, IDL.Sub(IDL.Year(IDL.Today()), (new IDVariant(1))));
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMOGGDATVAR, 0, IDL.ToDate(IDL.Year(IDL.Sub(IDL.Today(), (new IDVariant(1)))), (new IDVariant(12)), (new IDVariant(31))));
            }
            else
            {
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEESER, 0, IDL.Year(IDL.Today()));
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMOGGDATVAR, 0, IDL.Today());
            }
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProposteVar", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Etichetta Scelta Del
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Del Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProposteVar", "EtichettaSceltaDel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Del
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Del Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_SEDE_DEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_ANNO_DEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NUMERO_DEL, 0));
      MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProposteVar", "InfoDel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Prop
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaProp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Prop Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProposteVar", "SceltaProp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Prop
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoProp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Prop Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_UNITA_PROPONENTE, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NUMERO_PROPOSTA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_ANNO_PROPOSTA, 0));
      MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProposteVar", "InfoProp", _e);
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
      if (PAN_PARAMETRI.IsPanelInError())
      {
        return 0;
      }
      if (MainFrm.ControlloFaseEsefin(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEESER, 0)).compareTo((new IDVariant(0)), true)<0)
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Gestione Movimenti non ammessa per l'Esercizio "));
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("<BR/>Non è possibile generare variazioni"));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_MSG, IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEESER, 0))), S)); 
        return 0;
      }
      if (!(ControlliPREElabora()))
      {
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      IDVariant v_NUMCREATE = null;
      v_NUMCREATE = (new IDVariant());
      MainFrm.Cf4armDBObject.GENERAVARIMPVARACCRIACC(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEESER, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGETTES, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPERI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPROG, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_DESCRIZIONE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMOGGDEDANO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_SEDE_DEL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NUMERO_DEL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_ANNO_DEL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_UNITA_PROPONENTE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NUMERO_PROPOSTA, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_ANNO_PROPOSTA, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMOGGDATVAR, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_NUMCREATE);
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Sono state create "));
        IDVariant v_VAR = new IDVariant(0,IDVariant.STRING);
        v_VAR = (new IDVariant("variazioni"));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<br/>"))), S), IDL.ToString(v_NUMCREATE)), (new IDVariant(" "))), v_VAR)); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProposteVar", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Record Tipo Var
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public boolean ControlloRecordTipoVar ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Record Tipo Var Body
      // Corpo Procedura
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      if (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPROG, 0),(new IDVariant(-1))).equals((new IDVariant(-1)), true))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  PROPOSTE_RIACC A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEESER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.PERIODO_RIACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPERI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((A.TIPO_VAR IS NULL)) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      else
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  PROPOSTE_RIACC A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEESER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.PERIODO_RIACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPERI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((A.TIPO_VAR IS NULL)) ");
        SQL.append("and   (TO_CHAR ( A.ANNO_IMPACC) || '#' || TO_CHAR ( A.NUMERO_IMPACC) IN ");
        SQL.append("( ");
        SQL.append("select ");
        SQL.append("  TO_CHAR ( B.ANNO_IMP) || '#' || TO_CHAR ( B.NUMERO_IMP) ");
        SQL.append("from ");
        SQL.append("  IMP B ");
        SQL.append("where (B.ANNO_IMP = A.ANNO_IMPACC) ");
        SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMPACC) ");
        SQL.append("and   (B.PROGR_UNITA_ORGANIZZATIVA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ('S' = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("UNION ");
        SQL.append("select ");
        SQL.append("  TO_CHAR ( C.ANNO_ACC) || '#' || TO_CHAR ( C.NUMERO_ACC) ");
        SQL.append("from ");
        SQL.append("  ACC C ");
        SQL.append("where (C.NUMERO_ACC = A.NUMERO_IMPACC) ");
        SQL.append("and   (C.ANNO_ACC = A.ANNO_IMPACC) ");
        SQL.append("and   (C.PROGR_UNITA_ORGANIZZATIVA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ('E' = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append(")) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
      {
        return (new IDVariant(0)).booleanValue();
      }
      else
      {
        return (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProposteVar", "ControlloRecordTipoVar", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controlli PRE Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public boolean ControlliPREElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli PRE Elabora Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEPERI, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Periodo obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        return (new IDVariant(0)).booleanValue();
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMEOGGEESER, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Esercizio rif. obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        return (new IDVariant(0)).booleanValue();
      }
      if (!(ControlloRecordTipoVar()))
      {
        IDVariant v_MSGERR = new IDVariant(0,IDVariant.STRING);
        v_MSGERR = (new IDVariant("Esistono proposte da elaborare senza indicazione del tipo variazione. Non è possibile procedere"));
        MainFrm.set_AlertMessage(v_MSGERR); 
        return (new IDVariant(0)).booleanValue();
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_DESCRIZIONE, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Descrizione obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return (new IDVariant(0)).booleanValue();
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI547, IMDBDef14.PQSL_PARAMETRI547_NOMOGGDATVAR, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Data Var. Obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return (new IDVariant(0)).booleanValue();
      }
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniProposteVar", "ControlliPREElabora", _e);
      return false;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void GENVARPROVAR_PARAMETRI547() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI547_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI550, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI550, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI547_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI547_RS, 0, IMDBDef5.TBL_PARAMETRI550, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI547_RS, 0, 0, IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGETTES, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI547_RS, 1, 0, IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPERI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI547_RS, 2, 0, IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI547_RS, 3, 0, IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPROG, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI547_RS, 4, 0, IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_DESCRIZIONE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI547_RS, 5, 0, IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMOGGDEDANO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI547_RS, 6, 0, IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_ANNO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI547_RS, 7, 0, IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI547_RS, 8, 0, IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI547_RS, 9, 0, IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_ANNO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI547_RS, 10, 0, IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_UNITA_PROPONENTE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI547_RS, 11, 0, IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NUMERO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI547_RS, 12, 0, IMDBDef5.TBL_PARAMETRI550, IMDBDef5.FLD_PARAMETRI550_NOMOGGDATVAR, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI550, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI550, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI550, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI547_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_PERIODO)
    {
      IdxPanelActived = PAN_PARAMETRI.FrIndex;
      IdxFieldActived = ColIndex.intValue();
        MainFrm.Show(MyGlb.FRM_SCELPERIRIAC, 1, this);
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_PERIRIACCODI)
    {
      IdxPanelActived = PAN_PARAMETRI.FrIndex;
      IdxFieldActived = ColIndex.intValue();
        MainFrm.Show(MyGlb.FRM_SCELPERIRIAC, 1, this);
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ETICHSCELDEL)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaDel();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFODEL)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDel();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_SCELTAPROP)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaProp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFOPROP)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROPODAELABO, "21229863-9CF2-44B4-8207-893FEBDDE6E5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROPODAELABO, "Proposte da Elaborare");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROPODAELABO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROPODAELABO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROPODAELABO, MyGlb.PANEL_LIST, 0, -9999, 512, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROPODAELABO, MyGlb.PANEL_FORM, 20, 7, 640, 97, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROPODAELABO, 0, 125);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROPODAELABO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROPODAELABO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROPODAELABO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROPODAELABO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIADAGENER, "B12D3DFF-800B-40D9-8CEC-0963ECE94004");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIADAGENER, "Variazioni da generare");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIADAGENER, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIADAGENER, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIADAGENER, MyGlb.PANEL_LIST, 0, -9999, 160, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIADAGENER, MyGlb.PANEL_FORM, 20, 111, 640, 145, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIADAGENER, 0, 127);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIADAGENER, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIADAGENER, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIADAGENER, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VARIADAGENER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 21);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, "62E2EC0E-446B-4C3A-8401-787FA6F6393F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, "ES");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "0657BD07-43A4-4270-B338-D3426E9288E1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "Esercizio Rif.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, "2554EA0E-434C-4DED-970B-15AA2AB6A43D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, "Periodo Riacc.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, 0 | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIRIACCODI, "C62D9DC5-3BE2-4B7B-8DEF-4B286EC3CAE2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIRIACCODI, "Periodo Riacc.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIRIACCODI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIRIACCODI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIRIACCODI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, "E54E6CC1-94E6-4CB8-B839-2357864FBE35");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, "Unità Organizzativa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, "2929D937-7BEA-4302-825B-5AF258931AC3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "2BF8B362-4747-4471-89B2-CA4C927530C5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "Descrizione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRDANOTE, "D16C8AFC-1BC9-4D52-A99C-EE67256F34F0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRDANOTE, "Descr. da Note");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRDANOTE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRDANOTE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRDANOTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPSEDEDEL, "EC679420-FE9D-4141-8C86-052544364843");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPSEDEDEL, "Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPSEDEDEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPSEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPSEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERODEL, "89482BA8-9CE5-4690-980C-CEE0CD6D17F1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERODEL, "-");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNODEL, "32A6999B-2285-47D7-9D7F-522CB76E2EE9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNODEL, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPUNITAPROP, "2335F23E-C1E2-4FE8-9A8D-F35EC863441E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPUNITAPROP, "Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPUNITAPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPUNITAPROP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPUNITAPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERPROP, "A3B3BB8D-64E2-489E-96AB-B217B1042451");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERPROP, "-");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERPROP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNOPROPO, "CA1D783F-AA34-4E9C-B485-D7951A67DF64");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNOPROPO, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNOPROPO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNOPROPO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNOPROPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAVAR, "2CB3A1A9-85C1-4F2A-AD05-877DF3C6DDC8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAVAR, "Data Var.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAVAR, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAVAR, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAVAR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHSCELDEL, "49640E25-1218-407E-80BF-F2222593A84A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHSCELDEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHSCELDEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHSCELDEL, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHSCELDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODEL, "574C4AC7-257B-480C-BE4E-E1EFD3EBB91A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODEL, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICNELLDESC, "C1D58CB5-0D0B-4936-977D-95CC27FAD01F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICNELLDESC, "Nella descrizione vengono messi i primi 140 caratteri della nota ragioneria (prevalente) o ufficio se presenti");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICNELLDESC, MyGlb.VIS_DICITUGENERI);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICNELLDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAPROP, "FD97BA89-331B-4B32-8A80-E88FEB524168");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAPROP, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAPROP, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROP, "099ACAFA-3266-481D-A656-68D8D2A32568");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROP, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROP, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, "910A1E47-EA62-4CD7-8EE8-A6482E44DE5D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_LIST, "ES");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_FORM, 152, 32, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_FORM, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_FORM, "ES");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ES, -1, GRP_PARAMETRI_PROPODAELABO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ES, PPQRY_PARAMETRI547, "A.NOMEOGGETTES", "NOMEOGGETTES", 12, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ES, (new IDVariant("S")), "Impegni/SubImpegni", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ES, (new IDVariant("E")), "Accertamenti", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, "Esr. R.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 368, 56, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio Rif.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIO, -1, GRP_PARAMETRI_PROPODAELABO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIO, PPQRY_PARAMETRI547, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, "Pr. R.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 52, 56, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, "Periodo Riacc.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PERIODO, -1, GRP_PARAMETRI_PROPODAELABO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PERIODO, PPQRY_PARAMETRI547, "A.NOMEOGGEPERI", "NOMEOGGEPERI", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIRIACCODI, MyGlb.PANEL_LIST, 0, 36, 512, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIRIACCODI, MyGlb.PANEL_LIST, 204);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIRIACCODI, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIRIACCODI, MyGlb.PANEL_LIST, "Periodo Riacc.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIRIACCODI, MyGlb.PANEL_FORM, 56, 56, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIRIACCODI, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIRIACCODI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIRIACCODI, MyGlb.PANEL_FORM, "Periodo Riacc.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PERIRIACCODI, -1, GRP_PARAMETRI_PROPODAELABO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PERIRIACCODI, PPQRY_PERIODRIACCE, "TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE", "PERIRIACCODI", 5, 202, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_LIST, "U. Or.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_FORM, 24, 80, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROGRUO, -1, GRP_PARAMETRI_PROPODAELABO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROGRUO, PPQRY_PARAMETRI547, "A.NOMEOGGEPROG", "NOMEOGGEPROG", 1, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_LIST, 624, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_FORM, 640, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETTASF, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHETTASF, -1, GRP_PARAMETRI_PROPODAELABO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHETTASF, -1, "", "ETICHETTASF", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 160, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 24, 136, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRIZIONE, -1, GRP_PARAMETRI_VARIADAGENER);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRIZIONE, PPQRY_PARAMETRI547, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRDANOTE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRDANOTE, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRDANOTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRDANOTE, MyGlb.PANEL_LIST, "D. d. N.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRDANOTE, MyGlb.PANEL_FORM, 52, 160, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRDANOTE, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRDANOTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRDANOTE, MyGlb.PANEL_FORM, "Descr. da Note");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRDANOTE, -1, GRP_PARAMETRI_VARIADAGENER);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRDANOTE, PPQRY_PARAMETRI547, "A.NOMOGGDEDANO", "NOMOGGDEDANO", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DESCRDANOTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DESCRDANOTE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPSEDEDEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPSEDEDEL, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPSEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPSEDEDEL, MyGlb.PANEL_LIST, "Delib.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPSEDEDEL, MyGlb.PANEL_FORM, 60, 204, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPSEDEDEL, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPSEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPSEDEDEL, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPSEDEDEL, -1, GRP_PARAMETRI_VARIADAGENER);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPSEDEDEL, PPQRY_PARAMETRI547, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERODEL, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERODEL, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERODEL, MyGlb.PANEL_LIST, "-");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERODEL, MyGlb.PANEL_FORM, 196, 204, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERODEL, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERODEL, MyGlb.PANEL_FORM, "-");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPNUMERODEL, -1, GRP_PARAMETRI_VARIADAGENER);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPNUMERODEL, PPQRY_PARAMETRI547, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNODEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNODEL, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNODEL, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNODEL, MyGlb.PANEL_FORM, 260, 204, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNODEL, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNODEL, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPANNODEL, -1, GRP_PARAMETRI_VARIADAGENER);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPANNODEL, PPQRY_PARAMETRI547, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPUNITAPROP, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPUNITAPROP, MyGlb.PANEL_LIST, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPUNITAPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPUNITAPROP, MyGlb.PANEL_LIST, "Proposta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPUNITAPROP, MyGlb.PANEL_FORM, 360, 204, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPUNITAPROP, MyGlb.PANEL_FORM, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPUNITAPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPUNITAPROP, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPUNITAPROP, -1, GRP_PARAMETRI_VARIADAGENER);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPUNITAPROP, PPQRY_PARAMETRI547, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERPROP, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERPROP, MyGlb.PANEL_LIST, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERPROP, MyGlb.PANEL_LIST, "-");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERPROP, MyGlb.PANEL_FORM, 508, 204, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERPROP, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPNUMERPROP, MyGlb.PANEL_FORM, "-");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPNUMERPROP, -1, GRP_PARAMETRI_VARIADAGENER);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPNUMERPROP, PPQRY_PARAMETRI547, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNOPROPO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNOPROPO, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNOPROPO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNOPROPO, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNOPROPO, MyGlb.PANEL_FORM, 560, 204, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNOPROPO, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNOPROPO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPANNOPROPO, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPANNOPROPO, -1, GRP_PARAMETRI_VARIADAGENER);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPANNOPROPO, PPQRY_PARAMETRI547, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAVAR, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAVAR, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAVAR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAVAR, MyGlb.PANEL_LIST, "Data Var.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAVAR, MyGlb.PANEL_FORM, 60, 232, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAVAR, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAVAR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAVAR, MyGlb.PANEL_FORM, "Data Var.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAVAR, -1, GRP_PARAMETRI_VARIADAGENER);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAVAR, PPQRY_PARAMETRI547, "A.NOMOGGDATVAR", "NOMOGGDATVAR", 6, 14, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHSCELDEL, MyGlb.PANEL_LIST, 320, 212, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHSCELDEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHSCELDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHSCELDEL, MyGlb.PANEL_FORM, 320, 208, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHSCELDEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHSCELDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHSCELDEL, -1, GRP_PARAMETRI_VARIADAGENER);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHSCELDEL, -1, "", "ETICHSCELDEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODEL, MyGlb.PANEL_LIST, 328, 220, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODEL, MyGlb.PANEL_FORM, 340, 208, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFODEL, -1, GRP_PARAMETRI_VARIADAGENER);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFODEL, -1, "", "INFODEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICNELLDESC, MyGlb.PANEL_LIST, 184, 164, 304, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICNELLDESC, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICNELLDESC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICNELLDESC, MyGlb.PANEL_FORM, 180, 160, 464, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICNELLDESC, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICNELLDESC, MyGlb.PANEL_FORM, 2);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICNELLDESC, -1, GRP_PARAMETRI_VARIADAGENER);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICNELLDESC, -1, "", "ETICNELLDESC", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_Alignment(PFL_PARAMETRI_ETICNELLDESC, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAPROP, MyGlb.PANEL_LIST, 328, 220, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAPROP, MyGlb.PANEL_FORM, 620, 208, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCELTAPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCELTAPROP, -1, GRP_PARAMETRI_VARIADAGENER);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCELTAPROP, -1, "", "SCELTAPROP", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROP, MyGlb.PANEL_LIST, 336, 228, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROP, MyGlb.PANEL_FORM, 640, 208, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFOPROP, -1, GRP_PARAMETRI_VARIADAGENER);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFOPROP, -1, "", "INFOPROP", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_LIST, 556, 276, 108, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_FORM, 576, 280, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHEELABOR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as PERIRIACCODI ");
    SQL.append("from ");
    SQL.append("  PERIODI_RIACCERTAMENTI A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGEPERI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_PERIODRIACCE, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_PERIODRIACCE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_PERIODRIACCE, "PERIODI_RIACCERTAMENTI");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as UOCAUOPRUNOR, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CODICEUO, ");
    SQL.append("  '1' as ORD1, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCR ");
    SQL.append("from ");
    SQL.append("  UO_CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGEPROG~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~NOMEOGGETTES~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '-1', ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~NOMEOGGEPROG~~ = -1) ");
    SQL.append("order by 3, 2, 4 ");
    PAN_PARAMETRI.SetQuery(PPQRY_CAPUO, 0, SQL, PFL_PARAMETRI_PROGRUO, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as UOCAUOPRUNOR, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CODICEUO, ");
    SQL.append("  '1' as ORD1, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCR ");
    SQL.append("from ");
    SQL.append("  UO_CAP_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~NOMEOGGETTES~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '-1', ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 3, 2, 4 ");
    PAN_PARAMETRI.SetQuery(PPQRY_CAPUO, 1, SQL, PFL_PARAMETRI_PROGRUO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_CAPUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI547", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI547, IMDBDef14.PQRY_PARAMETRI547_RS, IMDBDef5.TBL_PARAMETRI550);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ES, IMDBDef5.FLD_PARAMETRI550_NOMEOGGETTES);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIO, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEESER);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PERIODO, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPERI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PROGRUO, IMDBDef5.FLD_PARAMETRI550_NOMEOGGEPROG);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DESCRIZIONE, IMDBDef5.FLD_PARAMETRI550_DESCRIZIONE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DESCRDANOTE, IMDBDef5.FLD_PARAMETRI550_NOMOGGDEDANO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_IMPSEDEDEL, IMDBDef5.FLD_PARAMETRI550_SEDE_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_IMPNUMERODEL, IMDBDef5.FLD_PARAMETRI550_NUMERO_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_IMPANNODEL, IMDBDef5.FLD_PARAMETRI550_ANNO_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_IMPUNITAPROP, IMDBDef5.FLD_PARAMETRI550_UNITA_PROPONENTE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_IMPNUMERPROP, IMDBDef5.FLD_PARAMETRI550_NUMERO_PROPOSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_IMPANNOPROPO, IMDBDef5.FLD_PARAMETRI550_ANNO_PROPOSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAVAR, IMDBDef5.FLD_PARAMETRI550_NOMOGGDATVAR);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI550");
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
