// **********************************************
// Variazioni Esig Di Entrata
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniEsigDiEntrata extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VARIAZIONI_CODICE = 0;
  private static int PFL_VARIAZIONI_CODPIANOCONT = 1;
  private static int PFL_VARIAZIONI_CAPITOLO = 2;
  private static int PFL_VARIAZIONI_ART = 3;
  private static int PFL_VARIAZIONI_DUALINFOCAP = 4;
  private static int PFL_VARIAZIONI_NUMEROACC = 5;
  private static int PFL_VARIAZIONI_ANNOACC = 6;
  private static int PFL_VARIAZIONI_DUALINFOIMPE = 7;
  private static int PFL_VARIAZIONI_DESCRIZIONE = 8;
  private static int PFL_VARIAZIONI_ETICHEACCERT = 9;
  private static int PFL_VARIAZIONI_IMPORTO = 10;
  private static int PFL_VARIAZIONI_ANNOESIGIBIL = 11;
  private static int PFL_VARIAZIONI_PROGRESSIVO = 12;
  private static int PFL_VARIAZIONI_PROGUNITORGA = 13;

  private static int PPQRY_VARACC2 = 0;

  private static int PPQRY_DUAL = 1;
  private static int PPQRY_DUAL1 = 2;


  IDPanel PAN_VARIAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR121(IMDB);
    Init_TBL_VARIAZACCER2(IMDB);
    //
    //
    Init_PQRY_VARACC2(IMDB);
    Init_PQRY_VARACC2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR121(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PAR121, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_PAR121, "TBL_PAR121");
    IMDB.set_FldCode(IMDBDef4.TBL_PAR121,IMDBDef4.FLD_PAR121_NOMOGGRITANT, "NOMOGGRITANT");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR121,IMDBDef4.FLD_PAR121_NOMOGGRITANT,5,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PAR121, 0);
  }

  private static void Init_TBL_VARIAZACCER2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_VARIAZACCER2, 11);
    IMDB.set_TblCode(IMDBDef4.TBL_VARIAZACCER2, "TBL_VARIAZACCER2");
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMOGGCODSTR, "NOMOGGCODSTR");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMOGGCODSTR,5,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMOGGCOPICO, "NOMOGGCOPICO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMOGGCOPICO,9,500,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMOGGNUMACC, "NOMOGGNUMACC");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMOGGNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_ANNO_ESIGIBILITA, "ANNO_ESIGIBILITA");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_ANNO_ESIGIBILITA,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
  }

  private static void Init_PQRY_VARACC2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARACC2, 11);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARACC2, "PQRY_VARACC2");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RENOOGCACOST, "RENOOGCACOST");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RENOOGCACOST,5,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECCODPIACON, "RECCODPIACON");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECCODPIACON,9,500,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECORDCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECORDART, "RECORDART");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECORDART,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECORNUMEACC, "RECORNUMEACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECORNUMEACC,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECORANNOACC, "RECORANNOACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECORANNOACC,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RENOOGIMACDE, "RENOOGIMACDE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RENOOGIMACDE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECORDIMPORT, "RECORDIMPORT");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECORDIMPORT,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECOANNOESIG, "RECOANNOESIG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECOANNOESIG,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECNOMOGGPRO, "RECNOMOGGPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RECNOMOGGPRO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RENOOGACPRUO, "RENOOGACPRUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2,IMDBDef12.PQSL_VARACC2_RENOOGACPRUO,1,8,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARACC2, 0);
  }

  private static void Init_PQRY_VARACC2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARACC2_RS, 11);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARACC2_RS, "PQRY_VARACC2_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RENOOGCACOST, "RENOOGCACOST");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RENOOGCACOST,5,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECCODPIACON, "RECCODPIACON");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECCODPIACON,9,500,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECORDCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECORDART, "RECORDART");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECORDART,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECORNUMEACC, "RECORNUMEACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECORNUMEACC,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECORANNOACC, "RECORANNOACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECORANNOACC,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RENOOGIMACDE, "RENOOGIMACDE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RENOOGIMACDE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECORDIMPORT, "RECORDIMPORT");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECORDIMPORT,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECOANNOESIG, "RECOANNOESIG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECOANNOESIG,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECNOMOGGPRO, "RECNOMOGGPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RECNOMOGGPRO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RENOOGACPRUO, "RENOOGACPRUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC2_RS,IMDBDef12.PQSL_VARACC2_RENOOGACPRUO,1,8,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniEsigDiEntrata(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniEsigDiEntrata()
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
    FormIdx = MyGlb.FRM_VARIESIDIENT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C619AA6C-69AB-419B-98D8-1CB0A87BFEFC";
    ResModeW = 1;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 868;
    DesignHeight = 458;
    set_Caption(new IDVariant("Variazioni Esig Di Entrata"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 868;
    Frames[1].Height = 432;
    Frames[1].Caption = "Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 432;
    PAN_VARIAZIONI = new IDPanel(w, this, 1, "PAN_VARIAZIONI");
    Frames[1].Content = PAN_VARIAZIONI;
    PAN_VARIAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIONI.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 868-MyGlb.PAN_OFFS_X, 432-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "62F53651-D582-4F53-B4FC-C464572BBE80");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 816, 396, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIONI.InitStatus = 2;
    PAN_VARIAZIONI_Init();
    PAN_VARIAZIONI_InitFields();
    PAN_VARIAZIONI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZAGG3+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG148+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGG3+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_GENERAVARIA1+BaseCmdLinIdx)
      {
        GenerazioneVariazioni();
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
      if (IMDB.TblModified(IMDBDef4.TBL_VARIAZACCER2, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIESIDIENT_VARACC2();
      }
      PAN_VARIAZIONI.UpdatePanel(MainFrm);
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
    return (obj instanceof VariazioniEsigDiEntrata);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniEsigDiEntrata.class.getName() : (Glb.ClassWithPackage(VariazioniEsigDiEntrata.class) ? VariazioniEsigDiEntrata.class.getName().substring(VariazioniEsigDiEntrata.class.getPackage().getName().length() + 1) : VariazioniEsigDiEntrata.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Variazioni On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZIONI);
      // 
      // Variazioni On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_DESCRIZIONE,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEsigDiEntrata", "VariazioniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VARIAZIONI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(64)), true) && UserOperation.booleanValue())
      {
        RiempiIMDB();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEsigDiEntrata", "VariazioniOnCommand", _e);
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
      PAN_VARIAZIONI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZIONI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      IDVariant v_TITOLO = new IDVariant(0,IDVariant.STRING);
      if (IMDB.Value(IMDBDef4.TBL_PAR121, IMDBDef4.FLD_PAR121_NOMOGGRITANT, 0).equals((new IDVariant("R")), true))
      {
        v_TITOLO = (new IDVariant("Variazioni Esig. Ritardata di Entrata"));
      }
      else
      {
        v_TITOLO = (new IDVariant("Variazioni Esig. Anticipata di Entrata"));
      }
      set_Caption(new IDVariant(v_TITOLO));
      RiempiIMDB();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEsigDiEntrata", "Load", _e);
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
      UNLOAD_PARDELETE();
      UNLOAD_VARIACCEDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEsigDiEntrata", "Unload", _e);
    }
  }

  // **********************************************************************
  // Par: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PAR121, IMDBDef4.FLD_PAR121_NOMOGGRITANT, 0, new IDVariant());
  }

  // **********************************************************************
  // Variazioni Accertamenti: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_VARIACCEDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef4.TBL_VARIAZACCER2);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_GENVARESIENT)), true) && Result.booleanValue())
      {
        RiempiIMDB();
        PAN_VARIAZIONI.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEsigDiEntrata", "EndModal", _e);
    }
  }

  // **********************************************************************
  // DUAL Info Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DUALInfoCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DUAL Info Capitolo Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef12.PQRY_VARACC2, IMDBDef12.PQSL_VARACC2_RECORDCAPITO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef12.PQRY_VARACC2, IMDBDef12.PQSL_VARACC2_RECORDART, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARPROUNIORG, 0, IMDB.Value(IMDBDef12.PQRY_VARACC2, IMDBDef12.PQSL_VARACC2_RENOOGACPRUO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEsigDiEntrata", "DUALInfoCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // DUAL Info Impegno
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DUALInfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DUAL Info Impegno Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef12.PQRY_VARACC2, IMDBDef12.PQSL_VARACC2_RECORANNOACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef12.PQRY_VARACC2, IMDBDef12.PQSL_VARACC2_RECORNUMEACC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEsigDiEntrata", "DUALInfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Generazione Variazioni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int GenerazioneVariazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Generazione Variazioni Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant J = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("delete from WRK_GEN_VAR_ESIG ");
      SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      if (PAN_VARIAZIONI.ShowMultipleSel())
      {
        IMDB.TblMoveFirst (IMDBDef12.PQRY_VARACC2_RS, 0);
        while (!IMDB.Eof(IMDBDef12.PQRY_VARACC2_RS, 0))
        {
          if (PAN_VARIAZIONI.IsRowSelected(I.intValue()))
          {
            J = IDL.Add(J, (new IDVariant(1)));
            // 
            // inserisco il rec selezionato
            // 
            SQL = new StringBuffer();
            SQL.append("insert into WRK_GEN_VAR_ESIG ");
            SQL.append("( ");
            SQL.append("  PROGRESSIVO_VARIMP, ");
            SQL.append("  PROGR_SESSIONE, ");
            SQL.append("  DATA_INSERIMENTO, ");
            SQL.append("  ANNO_ESIG ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARACC2_RS, IMDBDef12.PQSL_VARACC2_RECNOMOGGPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TRUNC( SYSDATE ), ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARACC2_RS, IMDBDef12.PQSL_VARACC2_RECOANNOESIG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          I = IDL.Add(I, (new IDVariant(1)));
          IMDB.TblMoveNext(IMDBDef12.PQRY_VARACC2_RS, 0);
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARACC2, IMDBDef12.PQSL_VARACC2_RECNOMOGGPRO, 0)))
        {
          J = (new IDVariant(0));
        }
        else
        {
          // 
          // inserisco il rec selezionato
          // 
          SQL = new StringBuffer();
          SQL.append("insert into WRK_GEN_VAR_ESIG ");
          SQL.append("( ");
          SQL.append("  PROGRESSIVO_VARIMP, ");
          SQL.append("  PROGR_SESSIONE, ");
          SQL.append("  DATA_INSERIMENTO, ");
          SQL.append("  ANNO_ESIG ");
          SQL.append(") ");
          SQL.append("values ");
          SQL.append("( ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARACC2, IMDBDef12.PQSL_VARACC2_RECNOMOGGPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  TRUNC( SYSDATE ), ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARACC2, IMDBDef12.PQSL_VARACC2_RECOANNOESIG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append(") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
      }
      if (J.compareTo((new IDVariant(0)), true)>0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMOGGRITANT, 0, IMDB.Value(IMDBDef4.TBL_PAR121, IMDBDef4.FLD_PAR121_NOMOGGRITANT, 0));
        MainFrm.Show(MyGlb.FRM_GENVARESIENT, (new IDVariant(-1)).intValue(), this); 
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Nessun record selezionato"));
        MainFrm.set_AlertMessage(S); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEsigDiEntrata", "GenerazioneVariazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riempi IMDB
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RiempiIMDB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi IMDB Body
      // Corpo Procedura
      // 
      RIEMPIIMDB_VARIACCEDELE();
      RIEMPIIMDB_VARACCININS1();
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEsigDiEntrata", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Variazioni Accertamenti: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_VARIACCEDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef4.TBL_VARIAZACCER2);
  }

  // **********************************************************************
  // Variazioni Accertamenti: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_VARACCININS1() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  D.CODICE_STRUTTURA as CAPCODICSTRU, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  CASE WHEN A.MACRO_LIV_5_STR <> '0' THEN A.MACRO_LIV_5_STR ELSE A.MACRO_LIV_4_STR END ");
    SQL.append("from ");
    SQL.append("  VISTA_CODIFICHE_CAP A ");
    SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.CAPITOLO = B.CAPITOLO) ");
    SQL.append("and   (A.ARTICOLO = B.ARTICOLO) ");
    SQL.append(") as CODPIANOCONT, ");
    SQL.append("  B.CAPITOLO as VARACCCAPITO, ");
    SQL.append("  B.ARTICOLO as VARACCARTICO, ");
    SQL.append("  B.NUMERO_ACC as VARACNUMEACC, ");
    SQL.append("  B.ANNO_ACC as VARACANNOACC, ");
    SQL.append("  C.DESCRIZIONE as ACCDESCRIZIO, ");
    SQL.append("  B.IMPORTO as VARACCIMPORT, ");
    SQL.append("  B.ANNO_ESIGIBILITA as VARAANNOESIG, ");
    SQL.append("  B.PROGRESSIVO as VARACCPROGRE, ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA as ACCPROUNIORG ");
    SQL.append("from ");
    SQL.append("  VARACC B, ");
    SQL.append("  ACC C, ");
    SQL.append("  CAP D ");
    SQL.append("where (B.ANNO_VAR = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.IMPORTO < 0) ");
    SQL.append("and   ((B.VARIAZIONE_GENERATA IS NULL)) ");
    SQL.append("and   (((B.ANNO_ESIGIBILITA > B.ANNO_ACC AND " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PAR121, IMDBDef4.FLD_PAR121_NOMOGGRITANT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'R') OR (B.ANNO_ESIGIBILITA < B.ANNO_ACC AND " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PAR121, IMDBDef4.FLD_PAR121_NOMOGGRITANT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'A'))) ");
    SQL.append("and   (C.ANNO_ACC = B.ANNO_ACC) ");
    SQL.append("and   (C.NUMERO_ACC = B.NUMERO_ACC) ");
    SQL.append("and   (D.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (D.E_S = 'E') ");
    SQL.append("and   (D.CAPITOLO = B.CAPITOLO) ");
    SQL.append("and   (D.ARTICOLO = B.ARTICOLO) ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef4.TBL_VARIAZACCER2, 0);
      IMDB.set_Value(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMOGGCODSTR,0,RS.Get(1));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMOGGCOPICO,0,new IDVariant(RS.Get(2),IDVariant.STRING));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMEOGGECAPI,0,RS.Get(3));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMEOGGEARTI,0,RS.Get(4));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_NOMOGGNUMACC,0,RS.Get(5));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_ANNO_IMP,0,RS.Get(6));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_DESCRIZIONE,0,RS.Get(7));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_IMPORTO,0,RS.Get(8));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_ANNO_ESIGIBILITA,0,RS.Get(9));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_PROGRESSIVO,0,RS.Get(10));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZACCER2,IMDBDef4.FLD_VARIAZACCER2_PROGR_UNITA_ORGANIZZATIVA,0,RS.Get(11));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // VARACC
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void VARIESIDIENT_VARACC2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_VARACC2_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_VARIAZACCER2, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_VARIAZACCER2, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_VARACC2_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_VARACC2_RS, 0, IMDBDef4.TBL_VARIAZACCER2, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_VARACC2_RS, 0, 0, IMDBDef4.TBL_VARIAZACCER2, IMDBDef4.FLD_VARIAZACCER2_NOMOGGCODSTR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_VARACC2_RS, 1, 0, IMDBDef4.TBL_VARIAZACCER2, IMDBDef4.FLD_VARIAZACCER2_NOMOGGCOPICO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_VARACC2_RS, 2, 0, IMDBDef4.TBL_VARIAZACCER2, IMDBDef4.FLD_VARIAZACCER2_NOMEOGGECAPI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_VARACC2_RS, 3, 0, IMDBDef4.TBL_VARIAZACCER2, IMDBDef4.FLD_VARIAZACCER2_NOMEOGGEARTI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_VARACC2_RS, 4, 0, IMDBDef4.TBL_VARIAZACCER2, IMDBDef4.FLD_VARIAZACCER2_NOMOGGNUMACC, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_VARACC2_RS, 5, 0, IMDBDef4.TBL_VARIAZACCER2, IMDBDef4.FLD_VARIAZACCER2_ANNO_IMP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_VARACC2_RS, 6, 0, IMDBDef4.TBL_VARIAZACCER2, IMDBDef4.FLD_VARIAZACCER2_DESCRIZIONE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_VARACC2_RS, 7, 0, IMDBDef4.TBL_VARIAZACCER2, IMDBDef4.FLD_VARIAZACCER2_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_VARACC2_RS, 8, 0, IMDBDef4.TBL_VARIAZACCER2, IMDBDef4.FLD_VARIAZACCER2_ANNO_ESIGIBILITA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_VARACC2_RS, 9, 0, IMDBDef4.TBL_VARIAZACCER2, IMDBDef4.FLD_VARIAZACCER2_PROGRESSIVO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_VARACC2_RS, 10, 0, IMDBDef4.TBL_VARIAZACCER2, IMDBDef4.FLD_VARIAZACCER2_PROGR_UNITA_ORGANIZZATIVA, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_VARIAZACCER2, 0);
      if (IMDB.Eof(IMDBDef4.TBL_VARIAZACCER2, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_VARIAZACCER2, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_VARACC2_RS, 0);
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
  private void PAN_VARIAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZIONI, Cancel);
    // Stub
  }

  private void PAN_VARIAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAZIONI_DUALINFOCAP)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DUALInfoCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_DUALINFOIMPE)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DUALInfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAZIONI_Init()
  {

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, "8CCF6FDC-B94A-4AEC-8527-28D1B75A3026");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, "Codice");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, "7C6E7098-4E01-4B23-900C-83A3EDDE3E78");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, "Cod. Piano Conti");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "B87699BB-05EC-4DCB-A7DB-BE2B5EFD8E90");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "Capitolo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, "B4F2CFD7-1E1A-4EE7-AB0A-F8299CE2EE78");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, "Art.");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, "339A223D-4055-40BC-9550-E79A37A310FC");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, " ");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, "DD4A09B3-BAB6-4BEB-9172-3B2087BA0899");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, "Accertamento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, "7BE857CB-4BAE-436A-A882-73D9FADA1A44");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, "ANNO ACC");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, "A4A1512D-F774-48FE-BFFC-2EDC6EF66307");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, " ");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, "Info");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "411ABFB1-5BAC-440D-B885-0C27D010EA3A");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "DESCRIZIONE");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEACCERT, "16BDA8EA-1DB2-46F2-8497-C96C697EEA32");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEACCERT, "Accertamento");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEACCERT, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEACCERT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "DF2AD0BD-5B60-4280-B48C-A9B34EAB0631");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "Importo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "5D0C5224-7DEE-4370-ACC0-9C58A1ED15A7");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "Anno Esigibilità");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "9B5D9B2B-8CA9-48D6-91C3-32D67EB4BE83");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "PROGRESSIVO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, "4CA38512-5E5E-410F-88F2-ECAB5112826E");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_FORM, 4, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CODICE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CODICE, PPQRY_VARACC2, "A.NOMOGGCODSTR", "RENOOGCACOST", 5, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_LIST, 84, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_LIST, 124);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_LIST, "Cod. Piano Conti");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_FORM, 4, 256, 560, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_FORM, 124);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCONT, MyGlb.PANEL_FORM, "Cod. Piano Conti");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CODPIANOCONT, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CODPIANOCONT, PPQRY_VARACC2, "A.NOMOGGCOPICO", "RECCODPIACON", 9, 500, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 184, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 4, 52, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLO, PPQRY_VARACC2, "A.NOMEOGGECAPI", "RECORDCAPITO", 3, 16, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_LIST, 284, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_LIST, "Art.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ART, MyGlb.PANEL_FORM, "Art.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ART, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ART, PPQRY_VARACC2, "A.NOMEOGGEARTI", "RECORDART", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_LIST, 316, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAP, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DUALINFOCAP, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DUALINFOCAP, PPQRY_DUAL, "'I'", "INFOCAPITOLO", 5, 1, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOCAP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOCAP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOCAP, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_LIST, 336, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_LIST, "Acc.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_FORM, 4, 148, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_FORM, "Accert.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMEROACC, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMEROACC, PPQRY_VARACC2, "A.NOMOGGNUMACC", "RECORNUMEACC", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_LIST, 376, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_FORM, 4, 124, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOACC, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOACC, PPQRY_VARACC2, "A.ANNO_IMP", "RECORANNOACC", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_LIST, 412, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_FORM, 4, 124, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOIMPE, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DUALINFOIMPE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DUALINFOIMPE, PPQRY_DUAL1, "'I'", "INFOIMPEGNO", 5, 1, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOIMPE, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOIMPE, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOIMPE, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 432, 36, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 172, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DESCRIZIONE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DESCRIZIONE, PPQRY_VARACC2, "A.DESCRIZIONE", "RENOOGIMACDE", 5, 140, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEACCERT, MyGlb.PANEL_LIST, 336, 0, 336, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEACCERT, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEACCERT, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEACCERT, MyGlb.PANEL_FORM, 320, 240, 412, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEACCERT, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ETICHEACCERT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ETICHEACCERT, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ETICHEACCERT, -1, "", "ETICHEACCERT", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 672, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 4, 208, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTO, PPQRY_VARACC2, "A.IMPORTO", "RECORDIMPORT", 3, 14, 2, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 752, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 4, 232, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 112);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOESIGIBIL, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOESIGIBIL, PPQRY_VARACC2, "A.ANNO_ESIGIBILITA", "RECOANNOESIG", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 800, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 256, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROGRESSIVO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGRESSIVO, PPQRY_VARACC2, "A.PROGRESSIVO", "RECNOMOGGPRO", 3, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 256, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_FORM, 184);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGUNITORGA, MyGlb.PANEL_FORM, "PROGR UNITA ORGANIZZATIVA");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROGUNITORGA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGUNITORGA, PPQRY_VARACC2, "A.PROGR_UNITA_ORGANIZZATIVA", "RENOOGACPRUO", 1, 8, 0, -13997);
  }

  private void PAN_VARIAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOCAPITOLO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~RECORDCAPITO~~ IS NULL))) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOIMPEGNO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~RECORANNOACC~~ IS NULL))) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_DUAL1, "DUAL");
    PAN_VARIAZIONI.SetIMDB(IMDB, "PQRY_VARACC2", true);
    PAN_VARIAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_VARIAZIONI.SetQueryIMDB(PPQRY_VARACC2, IMDBDef12.PQRY_VARACC2_RS, IMDBDef4.TBL_VARIAZACCER2);
    JustLoaded = true;
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_CODICE, IMDBDef4.FLD_VARIAZACCER2_NOMOGGCODSTR);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_CODPIANOCONT, IMDBDef4.FLD_VARIAZACCER2_NOMOGGCOPICO);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_CAPITOLO, IMDBDef4.FLD_VARIAZACCER2_NOMEOGGECAPI);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_ART, IMDBDef4.FLD_VARIAZACCER2_NOMEOGGEARTI);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_NUMEROACC, IMDBDef4.FLD_VARIAZACCER2_NOMOGGNUMACC);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_ANNOACC, IMDBDef4.FLD_VARIAZACCER2_ANNO_IMP);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_DESCRIZIONE, IMDBDef4.FLD_VARIAZACCER2_DESCRIZIONE);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_IMPORTO, IMDBDef4.FLD_VARIAZACCER2_IMPORTO);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_ANNOESIGIBIL, IMDBDef4.FLD_VARIAZACCER2_ANNO_ESIGIBILITA);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_PROGRESSIVO, IMDBDef4.FLD_VARIAZACCER2_PROGRESSIVO);
    PAN_VARIAZIONI.SetFieldPrimaryIndex(PFL_VARIAZIONI_PROGUNITORGA, IMDBDef4.FLD_VARIAZACCER2_PROGR_UNITA_ORGANIZZATIVA);
    PAN_VARIAZIONI.SetMasterTable(0, "VARIAZACCER2");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZIONI.iUseListQBE;
      PAN_VARIAZIONI.iUseListQBE = 0;
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
