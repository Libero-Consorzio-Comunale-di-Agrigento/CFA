// **********************************************
// Elenco Anomalie Impegni Reiscritti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoAnomalieImpegniReiscritti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_IMPSUBREIANO_ANNOREISCRIZ = 0;
  private static int GRP_IMPSUBREIANO_ANNODIORIGIN = 1;
  private static int GRP_IMPSUBREIANO_IMPEGNO = 2;
  private static int GRP_IMPSUBREIANO_BENEFICIARIO = 3;

  private static int PFL_IMPSUBREIANO_CAPITOLREISC = 0;
  private static int PFL_IMPSUBREIANO_ARTICOLREISC = 1;
  private static int PFL_IMPSUBREIANO_NUMERIMPREIS = 2;
  private static int PFL_IMPSUBREIANO_ANNOIMPREISC = 3;
  private static int PFL_IMPSUBREIANO_NUMESUBIREIS = 4;
  private static int PFL_IMPSUBREIANO_ANNOSUBIREIS = 5;
  private static int PFL_IMPSUBREIANO_DESCRIZREISC = 6;
  private static int PFL_IMPSUBREIANO_CODISTRUREIS = 7;
  private static int PFL_IMPSUBREIANO_LIVELL4REISC = 8;
  private static int PFL_IMPSUBREIANO_LIVELL5REISC = 9;
  private static int PFL_IMPSUBREIANO_COFOGREISC = 10;
  private static int PFL_IMPSUBREIANO_UOREISC = 11;
  private static int PFL_IMPSUBREIANO_OBIEOPERREIS = 12;
  private static int PFL_IMPSUBREIANO_CAPITOLOPROV = 13;
  private static int PFL_IMPSUBREIANO_ARTICOLOPROV = 14;
  private static int PFL_IMPSUBREIANO_NUMERIMPPROV = 15;
  private static int PFL_IMPSUBREIANO_ANNOIMPPROV = 16;
  private static int PFL_IMPSUBREIANO_NUMESUBIPROV = 17;
  private static int PFL_IMPSUBREIANO_ANNOSUBIPROV = 18;
  private static int PFL_IMPSUBREIANO_DESCRIZIPROV = 19;
  private static int PFL_IMPSUBREIANO_CODISTRUPROV = 20;
  private static int PFL_IMPSUBREIANO_LIVELLO4PROV = 21;
  private static int PFL_IMPSUBREIANO_LIVELLO5PROV = 22;
  private static int PFL_IMPSUBREIANO_COFOGPROV = 23;
  private static int PFL_IMPSUBREIANO_UOPROV = 24;
  private static int PFL_IMPSUBREIANO_OBIEOPERPROV = 25;
  private static int PFL_IMPSUBREIANO_BENEFICIARIO = 26;
  private static int PFL_IMPSUBREIANO_RAGIONSOCIAL = 27;
  private static int PFL_IMPSUBREIANO_SCADENZABEN = 28;

  private static int PPQRY_IMPSUBREIANO = 0;


  IDPanel PAN_IMPSUBREIANO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_IMPSUBREIANO(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_IMPSUBREIANO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_IMPSUBREIANO, 29);
    IMDB.set_TblCode(IMDBDef13.PQRY_IMPSUBREIANO, "PQRY_IMPSUBREIANO");
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_NUMERO_IMP_PROV, "NUMERO_IMP_PROV");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_NUMERO_IMP_PROV,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_ANNO_IMP_PROV, "ANNO_IMP_PROV");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_ANNO_IMP_PROV,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_ANNO_SUBIMP_PROV, "ANNO_SUBIMP_PROV");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_ANNO_SUBIMP_PROV,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_NUMERO_SUBIMP_PROV, "NUMERO_SUBIMP_PROV");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_NUMERO_SUBIMP_PROV,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_DESCRIZIONE_PROV, "DESCRIZIONE_PROV");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_DESCRIZIONE_PROV,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_CAPITOLO_PROV, "CAPITOLO_PROV");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_CAPITOLO_PROV,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_ARTICOLO_PROV, "ARTICOLO_PROV");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_ARTICOLO_PROV,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_CODICE_STRUTTURA_PROV, "CODICE_STRUTTURA_PROV");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_CODICE_STRUTTURA_PROV,5,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_LIVELLO_4_PROV, "LIVELLO_4_PROV");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_LIVELLO_4_PROV,5,7,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_LIVELLO_5_PROV, "LIVELLO_5_PROV");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_LIVELLO_5_PROV,5,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_COFOG_PROV, "COFOG_PROV");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_COFOG_PROV,5,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANU1, "IMPSUBREANU1");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANU1,5,198,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANO1, "IMPSUBREANO1");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANO1,5,108,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_NUMERO_IMP_REISC, "NUMERO_IMP_REISC");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_NUMERO_IMP_REISC,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_ANNO_IMP_REISC, "ANNO_IMP_REISC");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_ANNO_IMP_REISC,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_ANNO_SUBIMP_REISC, "ANNO_SUBIMP_REISC");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_ANNO_SUBIMP_REISC,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_NUMERO_SUBIMP_REISC, "NUMERO_SUBIMP_REISC");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_NUMERO_SUBIMP_REISC,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_DESCRIZIONE_REISC, "DESCRIZIONE_REISC");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_DESCRIZIONE_REISC,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_CAPITOLO_REISC, "CAPITOLO_REISC");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_CAPITOLO_REISC,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_ARTICOLO_REISC, "ARTICOLO_REISC");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_ARTICOLO_REISC,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_CODICE_STRUTTURA_REISC, "CODICE_STRUTTURA_REISC");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_CODICE_STRUTTURA_REISC,5,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_LIVELLO_4_REISC, "LIVELLO_4_REISC");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_LIVELLO_4_REISC,5,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_LIVELLO_5_REISC, "LIVELLO_5_REISC");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_LIVELLO_5_REISC,5,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_COFOG_REISC, "COFOG_REISC");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_COFOG_REISC,5,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANUN, "IMPSUBREANUN");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANUN,5,198,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANOB, "IMPSUBREANOB");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANOB,5,108,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANBE, "IMPSUBREANBE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANBE,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_IMSUREANRASO, "IMSUREANRASO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_IMSUREANRASO,5,50,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_IMSUREANSCBE, "IMSUREANSCBE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPSUBREIANO,IMDBDef13.PQSL_IMPSUBREIANO_IMSUREANSCBE,6,14,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_IMPSUBREIANO, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoAnomalieImpegniReiscritti(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoAnomalieImpegniReiscritti()
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
    FormIdx = MyGlb.FRM_ELEANOIMPREI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DDCF5A41-31BE-4A4D-9141-60B22E8ABFCA";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 880;
    DesignHeight = 382;
    set_Caption(new IDVariant("Elenco Anomalie"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 880;
    Frames[1].Height = 356;
    Frames[1].Caption = "Impegni/Sub-Impegni Reiscritti con Anomalie";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 356;
    PAN_IMPSUBREIANO = new IDPanel(w, this, 1, "PAN_IMPSUBREIANO");
    Frames[1].Content = PAN_IMPSUBREIANO;
    PAN_IMPSUBREIANO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPSUBREIANO.VS = MainFrm.VisualStyleList;
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 880-MyGlb.PAN_OFFS_X, 356-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "63105AE2-5AC3-4105-81E8-C39167ACDD08");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2544, 276, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPSUBREIANO.InitStatus = 2;
    PAN_IMPSUBREIANO_Init();
    PAN_IMPSUBREIANO_InitFields();
    PAN_IMPSUBREIANO_InitQueries();
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
      PAN_IMPSUBREIANO.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoAnomalieImpegniReiscritti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoAnomalieImpegniReiscritti.class.getName() : (Glb.ClassWithPackage(ElencoAnomalieImpegniReiscritti.class) ? ElencoAnomalieImpegniReiscritti.class.getName().substring(ElencoAnomalieImpegniReiscritti.class.getPackage().getName().length() + 1) : ElencoAnomalieImpegniReiscritti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // IMP SUB REISCRITTI ANOMALI On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPSUBREIANO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_IMPSUBREIANO);
      // 
      // IMP SUB REISCRITTI ANOMALI On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_IMPSUBREIANO.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBREIANO_DESCRIZIPROV,IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_DESCRIZIONE_PROV, 0).stringValue()); 
      PAN_IMPSUBREIANO.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBREIANO_UOPROV,IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANU1, 0).stringValue()); 
      PAN_IMPSUBREIANO.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBREIANO_OBIEOPERPROV,IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANO1, 0).stringValue()); 
      PAN_IMPSUBREIANO.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBREIANO_DESCRIZREISC,IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_DESCRIZIONE_REISC, 0).stringValue()); 
      PAN_IMPSUBREIANO.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBREIANO_UOREISC,IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANUN, 0).stringValue()); 
      PAN_IMPSUBREIANO.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBREIANO_OBIEOPERREIS,IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANOB, 0).stringValue()); 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_LIVELLO_5_REISC, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_LIVELLO_5_PROV, 0))))
      {
        PAN_IMPSUBREIANO.set_VisualStyle(Glb.OBJ_FIELD,PFL_IMPSUBREIANO_LIVELL5REISC,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_COFOG_REISC, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_COFOG_PROV, 0))))
      {
        PAN_IMPSUBREIANO.set_VisualStyle(Glb.OBJ_FIELD,PFL_IMPSUBREIANO_COFOGREISC,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANUN, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANU1, 0))))
      {
        PAN_IMPSUBREIANO.set_VisualStyle(Glb.OBJ_FIELD,PFL_IMPSUBREIANO_UOREISC,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANOB, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_IMPSUBREANO1, 0))))
      {
        PAN_IMPSUBREIANO.set_VisualStyle(Glb.OBJ_FIELD,PFL_IMPSUBREIANO_OBIEOPERREIS,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
      }
      PAN_IMPSUBREIANO.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBREIANO_RAGIONSOCIAL,(new IDVariant(PAN_IMPSUBREIANO.FieldText(PFL_IMPSUBREIANO_RAGIONSOCIAL))).stringValue()); 
      if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_IMPSUBREIANO, IMDBDef13.PQSL_IMPSUBREIANO_IMSUREANSCBE, 0),IDL.ToDate((new IDVariant(2999)), (new IDVariant(12)), (new IDVariant(31)))).compareTo(IDL.Today(), true)<0)
      {
        PAN_IMPSUBREIANO.set_VisualStyle(Glb.OBJ_FIELD,PFL_IMPSUBREIANO_SCADENZABEN,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
      }
      else
      {
        PAN_IMPSUBREIANO.set_VisualStyle(Glb.OBJ_FIELD,PFL_IMPSUBREIANO_SCADENZABEN,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAnomalieImpegniReiscritti", "IMPSUBREISCRITTIANOMALIOnDynamicProperties", _e);
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
    // Stub
  }

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
  private void PAN_IMPSUBREIANO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IMPSUBREIANO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPSUBREIANO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPSUBREIANO, Cancel);
    // Stub
  }

  private void PAN_IMPSUBREIANO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IMPSUBREIANO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMPSUBREIANO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMPSUBREIANO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_IMPSUBREIANO_Init()
  {

    PAN_IMPSUBREIANO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPSUBREIANO.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNOREISCRIZ, "758D4180-0873-4E56-A00D-E32BF03FBFBF");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNOREISCRIZ, "Anno Reiscrizione");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNOREISCRIZ, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNOREISCRIZ, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNOREISCRIZ, MyGlb.PANEL_LIST, 0, -9999, 1076, 16, 0, 0);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNOREISCRIZ, MyGlb.PANEL_FORM, 0, -21, 568, 385, 0, 0);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNOREISCRIZ, 0, 100);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNOREISCRIZ, 1, 13);
    PAN_IMPSUBREIANO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNOREISCRIZ, 0, 4);
    PAN_IMPSUBREIANO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNOREISCRIZ, 1, 4);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNOREISCRIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNODIORIGIN, "887EFB6C-2F1A-4C30-82C0-BA0ED38505F2");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNODIORIGIN, "Anno di Origine");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNODIORIGIN, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNODIORIGIN, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNODIORIGIN, MyGlb.PANEL_LIST, 1076, -9999, 1080, 16, 0, 0);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNODIORIGIN, MyGlb.PANEL_FORM, 0, -21, 480, 217, 0, 0);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNODIORIGIN, 0, 85);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNODIORIGIN, 1, 13);
    PAN_IMPSUBREIANO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNODIORIGIN, 0, 4);
    PAN_IMPSUBREIANO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNODIORIGIN, 1, 4);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_ANNODIORIGIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_IMPEGNO, "54425D38-551D-48EC-AD0F-1C6C0EBDE758");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_IMPEGNO, "Impegno");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_IMPEGNO, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_IMPEGNO, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_IMPEGNO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_IMPEGNO, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_IMPEGNO, 0, 51);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_IMPEGNO, 1, 13);
    PAN_IMPSUBREIANO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_IMPEGNO, 0, 4);
    PAN_IMPSUBREIANO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_IMPEGNO, 1, 4);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_BENEFICIARIO, "AAB35106-7972-4790-814F-2489803C2F8C");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_BENEFICIARIO, "Beneficiario");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_BENEFICIARIO, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_BENEFICIARIO, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_BENEFICIARIO, MyGlb.PANEL_LIST, 2156, -9999, 388, 16, 0, 0);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_BENEFICIARIO, MyGlb.PANEL_FORM, 0, 339, 380, 97, 0, 0);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_BENEFICIARIO, 0, 66);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_BENEFICIARIO, 1, 13);
    PAN_IMPSUBREIANO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_BENEFICIARIO, 0, 4);
    PAN_IMPSUBREIANO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_BENEFICIARIO, 1, 4);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_GROUP, GRP_IMPSUBREIANO_BENEFICIARIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IMPSUBREIANO.SetSize(MyGlb.OBJ_FIELD, 29);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLREISC, "6FBB2FC3-99A0-415C-943E-86B60AAD6163");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLREISC, "Capitolo");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLREISC, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLREISC, MyGlb.VIS_NORFIEINTLUN);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLREISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLREISC, "A2165754-5062-4930-90C2-DC29B0E64155");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLREISC, "Articolo");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLREISC, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLREISC, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLREISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPREIS, "AD09CE79-ED04-4740-A71E-3CEDE43885CB");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPREIS, "Num. Imp.");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPREIS, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPREIS, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPREIS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPREISC, "657FEE10-5AAB-484A-800B-4AC3D9D26737");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPREISC, "Anno Imp.");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPREISC, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPREISC, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPREISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIREIS, "FE3EC39B-3E68-4151-9080-37162096A071");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIREIS, "Num. Sub.");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIREIS, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIREIS, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIREIS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIREIS, "93565227-554E-49FC-9AA8-B287E978A12D");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIREIS, "Anno Sub.");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIREIS, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIREIS, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIREIS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZREISC, "BA6DF1D4-A442-4A4D-A061-B31B34572EAC");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZREISC, "Descrizione");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZREISC, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZREISC, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZREISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUREIS, "B9342A5F-F05B-4709-B2E0-40E8AE8E31B5");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUREIS, "Codice");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUREIS, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUREIS, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUREIS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL4REISC, "EF556419-D8D8-4B1F-809E-5120E6B05F01");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL4REISC, "IV Livello");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL4REISC, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL4REISC, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL4REISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL5REISC, "B3997F46-CB7C-4B87-9400-A6A887E7C974");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL5REISC, "V Livello");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL5REISC, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL5REISC, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL5REISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGREISC, "14E041EE-3988-4B47-A851-5A96ACF9CEF7");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGREISC, "COFOG");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGREISC, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGREISC, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGREISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOREISC, "4C84B18C-C8D7-4F68-85F3-8BDCB3B0BE02");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOREISC, "Unità Organizzativa");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOREISC, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOREISC, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOREISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERREIS, "EFDC751C-04BC-4EE6-A001-43BDCCD608D3");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERREIS, "Obiettivo Operativo");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERREIS, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERREIS, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERREIS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLOPROV, "CE166D2E-55A2-4F77-AB56-4F64B95EF5BC");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLOPROV, "Capitolo");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLOPROV, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLOPROV, MyGlb.VIS_NORFIEINTLUN);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLOPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLOPROV, "0E3A6BEB-1BB4-4C1F-8382-A390EB3E4E1C");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLOPROV, "Articolo");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLOPROV, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLOPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLOPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPPROV, "5A2F9DA9-43F8-42B0-836A-18813E657528");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPPROV, "Num. Imp.");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPPROV, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPPROV, "603462CA-86B6-43FF-8F09-BB1CF8074750");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPPROV, "Anno Imp.");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPPROV, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIPROV, "DE6C0865-882C-467C-BC60-30F70CEED251");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIPROV, "Num. Sub.");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIPROV, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIPROV, "CBB567CB-B12A-4272-B61A-70E54FD30FDE");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIPROV, "Anno Sub.");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIPROV, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZIPROV, "412737C6-17D0-46AE-AD99-D1FCD63C895A");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZIPROV, "Descrizione");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZIPROV, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZIPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZIPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUPROV, "6F4903D1-619E-4959-86EB-7A99624E756E");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUPROV, "Codice");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUPROV, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO4PROV, "1298506E-2C72-461D-B451-CF836476AD39");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO4PROV, "IV Livello");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO4PROV, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO4PROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO4PROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO5PROV, "EAC4FF5F-8519-47E5-9E56-4F7B341F61F8");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO5PROV, "V Livello");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO5PROV, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO5PROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO5PROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGPROV, "E257F2F2-6D9F-42D0-B04A-0E8272FA50C6");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGPROV, "COFOG");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGPROV, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOPROV, "8583CC97-23AF-49B0-A73B-FBDFE1A4BA56");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOPROV, "Unità Organizzativa");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOPROV, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERPROV, "546970C0-4F71-47FF-B3C7-6F488EC12E9F");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERPROV, "Obiettivo Operativo");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERPROV, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_BENEFICIARIO, "92C54A2F-3973-4267-B6B1-076AB0048A5A");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_BENEFICIARIO, "Codice");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_BENEFICIARIO, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_RAGIONSOCIAL, "6CEEC02C-F025-4065-8C64-E8426303D676");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_RAGIONSOCIAL, "Ragione Sociale");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_RAGIONSOCIAL, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBREIANO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_SCADENZABEN, "028F059B-654D-446B-8F30-B4668AF28A4B");
    PAN_IMPSUBREIANO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_SCADENZABEN, "Scadenza");
    PAN_IMPSUBREIANO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_SCADENZABEN, "");
    PAN_IMPSUBREIANO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_SCADENZABEN, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBREIANO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_SCADENZABEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_IMPSUBREIANO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLREISC, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLREISC, MyGlb.PANEL_LIST, 100);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLREISC, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLREISC, MyGlb.PANEL_LIST, "Capitolo");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLREISC, MyGlb.PANEL_FORM, 196, 172, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLREISC, MyGlb.PANEL_FORM, 112);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLREISC, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLREISC, MyGlb.PANEL_FORM, "Capitolo");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_CAPITOLREISC, -1, GRP_IMPSUBREIANO_ANNOREISCRIZ);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_CAPITOLREISC, PPQRY_IMPSUBREIANO, "A.CAPITOLO_REISC", "CAPITOLO_REISC", 3, 16, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLREISC, MyGlb.PANEL_LIST, 96, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLREISC, MyGlb.PANEL_LIST, 104);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLREISC, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLREISC, MyGlb.PANEL_LIST, "Art.");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLREISC, MyGlb.PANEL_FORM, 396, 220, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLREISC, MyGlb.PANEL_FORM, 120);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLREISC, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLREISC, MyGlb.PANEL_FORM, "Articolo");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_ARTICOLREISC, -1, GRP_IMPSUBREIANO_ANNOREISCRIZ);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_ARTICOLREISC, PPQRY_IMPSUBREIANO, "A.ARTICOLO_REISC", "ARTICOLO_REISC", 1, 2, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPREIS, MyGlb.PANEL_LIST, 128, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPREIS, MyGlb.PANEL_LIST, 116);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPREIS, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPREIS, MyGlb.PANEL_LIST, "Num. Imp.");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPREIS, MyGlb.PANEL_FORM, 4, 220, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPREIS, MyGlb.PANEL_FORM, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPREIS, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPREIS, MyGlb.PANEL_FORM, "Num. Imp.");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_NUMERIMPREIS, -1, GRP_IMPSUBREIANO_ANNOREISCRIZ);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_NUMERIMPREIS, PPQRY_IMPSUBREIANO, "A.NUMERO_IMP_REISC", "NUMERO_IMP_REISC", 1, 5, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPREISC, MyGlb.PANEL_LIST, 196, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPREISC, MyGlb.PANEL_LIST, 100);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPREISC, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPREISC, MyGlb.PANEL_LIST, "Anno Imp.");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPREISC, MyGlb.PANEL_FORM, 196, 220, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPREISC, MyGlb.PANEL_FORM, 152);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPREISC, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPREISC, MyGlb.PANEL_FORM, "Anno Imp.");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_ANNOIMPREISC, -1, GRP_IMPSUBREIANO_ANNOREISCRIZ);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_ANNOIMPREISC, PPQRY_IMPSUBREIANO, "A.ANNO_IMP_REISC", "ANNO_IMP_REISC", 1, 4, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIREIS, MyGlb.PANEL_LIST, 264, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIREIS, MyGlb.PANEL_LIST, 140);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIREIS, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIREIS, MyGlb.PANEL_LIST, "Num. Sub.");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIREIS, MyGlb.PANEL_FORM, 196, 244, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIREIS, MyGlb.PANEL_FORM, 152);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIREIS, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIREIS, MyGlb.PANEL_FORM, "Num. Sub.");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_NUMESUBIREIS, -1, GRP_IMPSUBREIANO_ANNOREISCRIZ);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_NUMESUBIREIS, PPQRY_IMPSUBREIANO, "A.NUMERO_SUBIMP_REISC", "NUMERO_SUBIMP_REISC", 1, 5, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIREIS, MyGlb.PANEL_LIST, 328, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIREIS, MyGlb.PANEL_LIST, 124);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIREIS, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIREIS, MyGlb.PANEL_LIST, "Anno Sub.");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIREIS, MyGlb.PANEL_FORM, 4, 244, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIREIS, MyGlb.PANEL_FORM, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIREIS, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIREIS, MyGlb.PANEL_FORM, "Anno Sub.");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_ANNOSUBIREIS, -1, GRP_IMPSUBREIANO_ANNOREISCRIZ);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_ANNOSUBIREIS, PPQRY_IMPSUBREIANO, "A.ANNO_SUBIMP_REISC", "ANNO_SUBIMP_REISC", 1, 4, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZREISC, MyGlb.PANEL_LIST, 392, 36, 136, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZREISC, MyGlb.PANEL_LIST, 120);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZREISC, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZREISC, MyGlb.PANEL_LIST, "Descrizione");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZREISC, MyGlb.PANEL_FORM, 4, 268, 360, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZREISC, MyGlb.PANEL_FORM, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZREISC, MyGlb.PANEL_FORM, 2);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZREISC, MyGlb.PANEL_FORM, "Descrizione");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_DESCRIZREISC, -1, GRP_IMPSUBREIANO_ANNOREISCRIZ);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_DESCRIZREISC, PPQRY_IMPSUBREIANO, "A.DESCRIZIONE_REISC", "DESCRIZIONE_REISC", 5, 140, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUREIS, MyGlb.PANEL_LIST, 528, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUREIS, MyGlb.PANEL_LIST, 128);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUREIS, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUREIS, MyGlb.PANEL_LIST, "Codice");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUREIS, MyGlb.PANEL_FORM, 4, 292, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUREIS, MyGlb.PANEL_FORM, 160);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUREIS, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUREIS, MyGlb.PANEL_FORM, "Codice");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_CODISTRUREIS, -1, GRP_IMPSUBREIANO_ANNOREISCRIZ);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_CODISTRUREIS, PPQRY_IMPSUBREIANO, "A.CODICE_STRUTTURA_REISC", "CODICE_STRUTTURA_REISC", 5, 10, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL4REISC, MyGlb.PANEL_LIST, 580, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL4REISC, MyGlb.PANEL_LIST, 112);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL4REISC, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL4REISC, MyGlb.PANEL_LIST, "IV Livello");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL4REISC, MyGlb.PANEL_FORM, 228, 292, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL4REISC, MyGlb.PANEL_FORM, 112);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL4REISC, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL4REISC, MyGlb.PANEL_FORM, "IV Livello");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_LIVELL4REISC, -1, GRP_IMPSUBREIANO_ANNOREISCRIZ);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_LIVELL4REISC, PPQRY_IMPSUBREIANO, "A.LIVELLO_4_REISC", "LIVELLO_4_REISC", 5, 10, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL5REISC, MyGlb.PANEL_LIST, 648, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL5REISC, MyGlb.PANEL_LIST, 128);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL5REISC, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL5REISC, MyGlb.PANEL_LIST, "V Livello");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL5REISC, MyGlb.PANEL_FORM, 372, 4, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL5REISC, MyGlb.PANEL_FORM, 20);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL5REISC, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELL5REISC, MyGlb.PANEL_FORM, "V Livello");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_LIVELL5REISC, -1, GRP_IMPSUBREIANO_ANNOREISCRIZ);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_LIVELL5REISC, PPQRY_IMPSUBREIANO, "A.LIVELLO_5_REISC", "LIVELLO_5_REISC", 5, 10, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGREISC, MyGlb.PANEL_LIST, 724, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGREISC, MyGlb.PANEL_LIST, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGREISC, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGREISC, MyGlb.PANEL_LIST, "COFOG");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGREISC, MyGlb.PANEL_FORM, 412, 52, 56, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGREISC, MyGlb.PANEL_FORM, 20);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGREISC, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGREISC, MyGlb.PANEL_FORM, "COFOG");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_COFOGREISC, -1, GRP_IMPSUBREIANO_ANNOREISCRIZ);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_COFOGREISC, PPQRY_IMPSUBREIANO, "A.COFOG_REISC", "COFOG_REISC", 5, 10, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOREISC, MyGlb.PANEL_LIST, 776, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOREISC, MyGlb.PANEL_LIST, 72);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOREISC, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOREISC, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOREISC, MyGlb.PANEL_FORM, 396, 244, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOREISC, MyGlb.PANEL_FORM, 72);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOREISC, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOREISC, MyGlb.PANEL_FORM, "Un. Organ.");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_UOREISC, -1, GRP_IMPSUBREIANO_ANNOREISCRIZ);
    PAN_IMPSUBREIANO.SetFieldUnbound(PFL_IMPSUBREIANO_UOREISC, true);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_UOREISC, PPQRY_IMPSUBREIANO, "TO_CHAR ( A.UO_REISC ) || DECODE(A.UO_REISC, to_number(NULL), '', ' - ' || A.DESC_UO_REISC)", "IMPSUBREANUN", 5, 198, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERREIS, MyGlb.PANEL_LIST, 936, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERREIS, MyGlb.PANEL_LIST, 128);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERREIS, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERREIS, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERREIS, MyGlb.PANEL_FORM, 4, 340, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERREIS, MyGlb.PANEL_FORM, 160);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERREIS, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERREIS, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_OBIEOPERREIS, -1, GRP_IMPSUBREIANO_ANNOREISCRIZ);
    PAN_IMPSUBREIANO.SetFieldUnbound(PFL_IMPSUBREIANO_OBIEOPERREIS, true);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_OBIEOPERREIS, PPQRY_IMPSUBREIANO, "A.OBIETTIVO_OPERATIVO_REISC || DECODE(A.OBIETTIVO_OPERATIVO_REISC, '', '', ' - ' || A.DESC_OBIETTIVO_OPERATIVO_REISC)", "IMPSUBREANOB", 5, 108, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLOPROV, MyGlb.PANEL_LIST, 1076, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLOPROV, MyGlb.PANEL_LIST, 100);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLOPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLOPROV, MyGlb.PANEL_LIST, "Capitolo");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLOPROV, MyGlb.PANEL_FORM, 4, 76, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLOPROV, MyGlb.PANEL_FORM, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLOPROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CAPITOLOPROV, MyGlb.PANEL_FORM, "Capitolo");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_CAPITOLOPROV, -1, GRP_IMPSUBREIANO_ANNODIORIGIN);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_CAPITOLOPROV, PPQRY_IMPSUBREIANO, "A.CAPITOLO_PROV", "CAPITOLO_PROV", 3, 16, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLOPROV, MyGlb.PANEL_LIST, 1172, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLOPROV, MyGlb.PANEL_LIST, 100);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLOPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLOPROV, MyGlb.PANEL_LIST, "Art.");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLOPROV, MyGlb.PANEL_FORM, 212, 76, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLOPROV, MyGlb.PANEL_FORM, 112);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLOPROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ARTICOLOPROV, MyGlb.PANEL_FORM, "Articolo");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_ARTICOLOPROV, -1, GRP_IMPSUBREIANO_ANNODIORIGIN);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_ARTICOLOPROV, PPQRY_IMPSUBREIANO, "A.ARTICOLO_PROV", "ARTICOLO_PROV", 1, 2, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPPROV, MyGlb.PANEL_LIST, 1204, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPPROV, MyGlb.PANEL_LIST, 116);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPPROV, MyGlb.PANEL_LIST, "Num. Imp.");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPPROV, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPPROV, MyGlb.PANEL_FORM, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPPROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMERIMPPROV, MyGlb.PANEL_FORM, "Num. Imp.");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_NUMERIMPPROV, -1, GRP_IMPSUBREIANO_ANNODIORIGIN);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_NUMERIMPPROV, PPQRY_IMPSUBREIANO, "A.NUMERO_IMP_PROV", "NUMERO_IMP_PROV", 1, 5, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPPROV, MyGlb.PANEL_LIST, 1272, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPPROV, MyGlb.PANEL_LIST, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPPROV, MyGlb.PANEL_LIST, "Anno Imp.");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPPROV, MyGlb.PANEL_FORM, 156, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPPROV, MyGlb.PANEL_FORM, 112);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPPROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOIMPPROV, MyGlb.PANEL_FORM, "Anno Imp.");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_ANNOIMPPROV, -1, GRP_IMPSUBREIANO_ANNODIORIGIN);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_ANNOIMPPROV, PPQRY_IMPSUBREIANO, "A.ANNO_IMP_PROV", "ANNO_IMP_PROV", 1, 4, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIPROV, MyGlb.PANEL_LIST, 1336, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIPROV, MyGlb.PANEL_LIST, 136);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIPROV, MyGlb.PANEL_LIST, "Num. Sub.");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIPROV, MyGlb.PANEL_FORM, 156, 28, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIPROV, MyGlb.PANEL_FORM, 152);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_NUMESUBIPROV, MyGlb.PANEL_FORM, "Num. Sub.");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_NUMESUBIPROV, -1, GRP_IMPSUBREIANO_ANNODIORIGIN);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_NUMESUBIPROV, PPQRY_IMPSUBREIANO, "A.NUMERO_SUBIMP_PROV", "NUMERO_SUBIMP_PROV", 1, 5, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIPROV, MyGlb.PANEL_LIST, 1400, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIPROV, MyGlb.PANEL_LIST, 120);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIPROV, MyGlb.PANEL_LIST, "Anno Sub.");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIPROV, MyGlb.PANEL_FORM, 4, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIPROV, MyGlb.PANEL_FORM, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_ANNOSUBIPROV, MyGlb.PANEL_FORM, "Anno Sub.");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_ANNOSUBIPROV, -1, GRP_IMPSUBREIANO_ANNODIORIGIN);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_ANNOSUBIPROV, PPQRY_IMPSUBREIANO, "A.ANNO_SUBIMP_PROV", "ANNO_SUBIMP_PROV", 1, 4, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZIPROV, MyGlb.PANEL_LIST, 1464, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZIPROV, MyGlb.PANEL_LIST, 116);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZIPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZIPROV, MyGlb.PANEL_LIST, "Descrizione");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZIPROV, MyGlb.PANEL_FORM, 4, 52, 400, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZIPROV, MyGlb.PANEL_FORM, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZIPROV, MyGlb.PANEL_FORM, 2);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_DESCRIZIPROV, MyGlb.PANEL_FORM, "Descrizione");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_DESCRIZIPROV, -1, GRP_IMPSUBREIANO_ANNODIORIGIN);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_DESCRIZIPROV, PPQRY_IMPSUBREIANO, "A.DESCRIZIONE_PROV", "DESCRIZIONE_PROV", 5, 140, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUPROV, MyGlb.PANEL_LIST, 1624, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUPROV, MyGlb.PANEL_LIST, 156);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUPROV, MyGlb.PANEL_LIST, "Codice");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUPROV, MyGlb.PANEL_FORM, 4, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUPROV, MyGlb.PANEL_FORM, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUPROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_CODISTRUPROV, MyGlb.PANEL_FORM, "Codice");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_CODISTRUPROV, -1, GRP_IMPSUBREIANO_ANNODIORIGIN);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_CODISTRUPROV, PPQRY_IMPSUBREIANO, "A.CODICE_STRUTTURA_PROV", "CODICE_STRUTTURA_PROV", 5, 10, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO4PROV, MyGlb.PANEL_LIST, 1676, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO4PROV, MyGlb.PANEL_LIST, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO4PROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO4PROV, MyGlb.PANEL_LIST, "IV Livello");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO4PROV, MyGlb.PANEL_FORM, 164, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO4PROV, MyGlb.PANEL_FORM, 112);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO4PROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO4PROV, MyGlb.PANEL_FORM, "IV Livello");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_LIVELLO4PROV, -1, GRP_IMPSUBREIANO_ANNODIORIGIN);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_LIVELLO4PROV, PPQRY_IMPSUBREIANO, "A.LIVELLO_4_PROV", "LIVELLO_4_PROV", 5, 7, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO5PROV, MyGlb.PANEL_LIST, 1740, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO5PROV, MyGlb.PANEL_LIST, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO5PROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO5PROV, MyGlb.PANEL_LIST, "V Livello");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO5PROV, MyGlb.PANEL_FORM, 4, 124, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO5PROV, MyGlb.PANEL_FORM, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO5PROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_LIVELLO5PROV, MyGlb.PANEL_FORM, "V Livello");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_LIVELLO5PROV, -1, GRP_IMPSUBREIANO_ANNODIORIGIN);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_LIVELLO5PROV, PPQRY_IMPSUBREIANO, "A.LIVELLO_5_PROV", "LIVELLO_5_PROV", 5, 10, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGPROV, MyGlb.PANEL_LIST, 1816, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGPROV, MyGlb.PANEL_LIST, 80);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGPROV, MyGlb.PANEL_LIST, "COFOG");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGPROV, MyGlb.PANEL_FORM, 204, 124, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGPROV, MyGlb.PANEL_FORM, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGPROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_COFOGPROV, MyGlb.PANEL_FORM, "COFOG");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_COFOGPROV, -1, GRP_IMPSUBREIANO_ANNODIORIGIN);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_COFOGPROV, PPQRY_IMPSUBREIANO, "A.COFOG_PROV", "COFOG_PROV", 5, 10, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOPROV, MyGlb.PANEL_LIST, 1864, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOPROV, MyGlb.PANEL_LIST, 60);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOPROV, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOPROV, MyGlb.PANEL_FORM, 356, 124, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOPROV, MyGlb.PANEL_FORM, 72);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOPROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_UOPROV, MyGlb.PANEL_FORM, "Un. Organ.");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_UOPROV, -1, GRP_IMPSUBREIANO_ANNODIORIGIN);
    PAN_IMPSUBREIANO.SetFieldUnbound(PFL_IMPSUBREIANO_UOPROV, true);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_UOPROV, PPQRY_IMPSUBREIANO, "TO_CHAR ( A.UO_PROV ) || DECODE(A.UO_PROV, to_number(NULL), '', ' - ' || A.DESC_UO_PROV)", "IMPSUBREANU1", 5, 198, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERPROV, MyGlb.PANEL_LIST, 2020, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERPROV, MyGlb.PANEL_LIST, 168);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERPROV, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERPROV, MyGlb.PANEL_FORM, 4, 172, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERPROV, MyGlb.PANEL_FORM, 96);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERPROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_OBIEOPERPROV, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_OBIEOPERPROV, -1, GRP_IMPSUBREIANO_ANNODIORIGIN);
    PAN_IMPSUBREIANO.SetFieldUnbound(PFL_IMPSUBREIANO_OBIEOPERPROV, true);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_OBIEOPERPROV, PPQRY_IMPSUBREIANO, "A.OBIETTIVO_OPERATIVO_PROV || DECODE(A.OBIETTIVO_OPERATIVO_PROV, '', '', ' - ' || A.DESC_OBIETTIVO_OPERATIVO_PROV)", "IMPSUBREANO1", 5, 108, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_BENEFICIARIO, MyGlb.PANEL_LIST, 2156, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_BENEFICIARIO, MyGlb.PANEL_LIST, 88);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_BENEFICIARIO, MyGlb.PANEL_LIST, "Codice");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 364, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_BENEFICIARIO, MyGlb.PANEL_FORM, 88);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_BENEFICIARIO, MyGlb.PANEL_FORM, "Codice");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_BENEFICIARIO, -1, GRP_IMPSUBREIANO_BENEFICIARIO);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_BENEFICIARIO, PPQRY_IMPSUBREIANO, "A.BENEFICIARIO", "IMPSUBREANBE", 2, 15, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 2208, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 108);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 388, 372, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 108);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_RAGIONSOCIAL, -1, GRP_IMPSUBREIANO_BENEFICIARIO);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_RAGIONSOCIAL, PPQRY_IMPSUBREIANO, "A.RAGIONE_SOCIALE", "IMSUREANRASO", 5, 50, 0, -13997);
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_SCADENZABEN, MyGlb.PANEL_LIST, 2468, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_SCADENZABEN, MyGlb.PANEL_LIST, 92);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_SCADENZABEN, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_SCADENZABEN, MyGlb.PANEL_LIST, "Scadenza");
    PAN_IMPSUBREIANO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_SCADENZABEN, MyGlb.PANEL_FORM, 4, 412, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBREIANO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_SCADENZABEN, MyGlb.PANEL_FORM, 92);
    PAN_IMPSUBREIANO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_SCADENZABEN, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBREIANO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBREIANO_SCADENZABEN, MyGlb.PANEL_FORM, "Scadenza");
    PAN_IMPSUBREIANO.SetFieldPage(PFL_IMPSUBREIANO_SCADENZABEN, -1, GRP_IMPSUBREIANO_BENEFICIARIO);
    PAN_IMPSUBREIANO.SetFieldPanel(PFL_IMPSUBREIANO_SCADENZABEN, PPQRY_IMPSUBREIANO, "A.SCADENZA_BEN", "IMSUREANSCBE", 6, 14, 0, -13997);
  }

  private void PAN_IMPSUBREIANO_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPSUBREIANO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMPSUBREIANO.SetIMDB(IMDB, "PQRY_IMPSUBREIANO", true);
    PAN_IMPSUBREIANO.set_SetString(MyGlb.MASTER_ROWNAME, "IMP SUB REISCRITTI ANOMALI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_IMP_PROV as NUMERO_IMP_PROV, ");
    SQL.append("  A.ANNO_IMP_PROV as ANNO_IMP_PROV, ");
    SQL.append("  A.ANNO_SUBIMP_PROV as ANNO_SUBIMP_PROV, ");
    SQL.append("  A.NUMERO_SUBIMP_PROV as NUMERO_SUBIMP_PROV, ");
    SQL.append("  A.DESCRIZIONE_PROV as DESCRIZIONE_PROV, ");
    SQL.append("  A.CAPITOLO_PROV as CAPITOLO_PROV, ");
    SQL.append("  A.ARTICOLO_PROV as ARTICOLO_PROV, ");
    SQL.append("  A.CODICE_STRUTTURA_PROV as CODICE_STRUTTURA_PROV, ");
    SQL.append("  A.LIVELLO_4_PROV as LIVELLO_4_PROV, ");
    SQL.append("  A.LIVELLO_5_PROV as LIVELLO_5_PROV, ");
    SQL.append("  A.COFOG_PROV as COFOG_PROV, ");
    SQL.append("  TO_CHAR ( A.UO_PROV ) || DECODE(A.UO_PROV, to_number(NULL), '', ' - ' || A.DESC_UO_PROV) as IMPSUBREANU1, ");
    SQL.append("  A.OBIETTIVO_OPERATIVO_PROV || DECODE(A.OBIETTIVO_OPERATIVO_PROV, '', '', ' - ' || A.DESC_OBIETTIVO_OPERATIVO_PROV) as IMPSUBREANO1, ");
    SQL.append("  A.NUMERO_IMP_REISC as NUMERO_IMP_REISC, ");
    SQL.append("  A.ANNO_IMP_REISC as ANNO_IMP_REISC, ");
    SQL.append("  A.ANNO_SUBIMP_REISC as ANNO_SUBIMP_REISC, ");
    SQL.append("  A.NUMERO_SUBIMP_REISC as NUMERO_SUBIMP_REISC, ");
    SQL.append("  A.DESCRIZIONE_REISC as DESCRIZIONE_REISC, ");
    SQL.append("  A.CAPITOLO_REISC as CAPITOLO_REISC, ");
    SQL.append("  A.ARTICOLO_REISC as ARTICOLO_REISC, ");
    SQL.append("  A.CODICE_STRUTTURA_REISC as CODICE_STRUTTURA_REISC, ");
    SQL.append("  A.LIVELLO_4_REISC as LIVELLO_4_REISC, ");
    SQL.append("  A.LIVELLO_5_REISC as LIVELLO_5_REISC, ");
    SQL.append("  A.COFOG_REISC as COFOG_REISC, ");
    SQL.append("  TO_CHAR ( A.UO_REISC ) || DECODE(A.UO_REISC, to_number(NULL), '', ' - ' || A.DESC_UO_REISC) as IMPSUBREANUN, ");
    SQL.append("  A.OBIETTIVO_OPERATIVO_REISC || DECODE(A.OBIETTIVO_OPERATIVO_REISC, '', '', ' - ' || A.DESC_OBIETTIVO_OPERATIVO_REISC) as IMPSUBREANOB, ");
    SQL.append("  A.BENEFICIARIO as IMPSUBREANBE, ");
    SQL.append("  A.RAGIONE_SOCIALE as IMSUREANRASO, ");
    SQL.append("  A.SCADENZA_BEN as IMSUREANSCBE ");
    PAN_IMPSUBREIANO.SetQuery(PPQRY_IMPSUBREIANO, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  IMP_SUB_REISCRITTI_ANOMALI A ");
    PAN_IMPSUBREIANO.SetQuery(PPQRY_IMPSUBREIANO, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPSUBREIANO.SetQuery(PPQRY_IMPSUBREIANO, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPSUBREIANO.SetQuery(PPQRY_IMPSUBREIANO, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPSUBREIANO.SetQuery(PPQRY_IMPSUBREIANO, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_IMP_REISC, ");
    SQL.append("  A.NUMERO_IMP_REISC, ");
    SQL.append("  A.ANNO_SUBIMP_REISC, ");
    SQL.append("  A.NUMERO_SUBIMP_REISC ");
    PAN_IMPSUBREIANO.SetQuery(PPQRY_IMPSUBREIANO, 5, SQL, -1, "");
    PAN_IMPSUBREIANO.SetQueryDB(PPQRY_IMPSUBREIANO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPSUBREIANO.SetMasterTable(0, "IMP_SUB_REISCRITTI_ANOMALI");
    PAN_IMPSUBREIANO.AddToSortList(PFL_IMPSUBREIANO_ANNOIMPREISC, true);
    PAN_IMPSUBREIANO.AddToSortList(PFL_IMPSUBREIANO_NUMERIMPREIS, true);
    PAN_IMPSUBREIANO.AddToSortList(PFL_IMPSUBREIANO_ANNOSUBIREIS, true);
    PAN_IMPSUBREIANO.AddToSortList(PFL_IMPSUBREIANO_NUMESUBIREIS, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPSUBREIANO.Status() == 2)
    {
      int oldListQBE = PAN_IMPSUBREIANO.iUseListQBE;
      PAN_IMPSUBREIANO.iUseListQBE = 0;
      PAN_IMPSUBREIANO.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPSUBREIANO.PanelCommand(Glb.PCM_FIND);
      PAN_IMPSUBREIANO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMPSUBREIANO) PAN_IMPSUBREIANO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPSUBREIANO) PAN_IMPSUBREIANO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMPSUBREIANO) PAN_IMPSUBREIANO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPSUBREIANO) PAN_IMPSUBREIANO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMPSUBREIANO) PAN_IMPSUBREIANO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
