// **********************************************
// Elenco Anomalie Accertamenti Reiscritti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoAnomalieAccertamentiReiscritti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ACCREISCANOM_ANNOREISCRIZ = 0;
  private static int GRP_ACCREISCANOM_ANNODIORIGIN = 1;

  private static int PFL_ACCREISCANOM_CAPITOLREISC = 0;
  private static int PFL_ACCREISCANOM_ARTICOLREISC = 1;
  private static int PFL_ACCREISCANOM_NUMERACCPROV = 2;
  private static int PFL_ACCREISCANOM_ANNOACCPROV = 3;
  private static int PFL_ACCREISCANOM_DESCRIZREISC = 4;
  private static int PFL_ACCREISCANOM_CODISTRUREIS = 5;
  private static int PFL_ACCREISCANOM_LIVELL4REISC = 6;
  private static int PFL_ACCREISCANOM_LIVELL5REISC = 7;
  private static int PFL_ACCREISCANOM_UOREISC = 8;
  private static int PFL_ACCREISCANOM_OBIEOPERREIS = 9;
  private static int PFL_ACCREISCANOM_CAPITOLOPROV = 10;
  private static int PFL_ACCREISCANOM_ARTICOLOPROV = 11;
  private static int PFL_ACCREISCANOM_NUMERACCREIS = 12;
  private static int PFL_ACCREISCANOM_ANNOACCREISC = 13;
  private static int PFL_ACCREISCANOM_DESCRIZIPROV = 14;
  private static int PFL_ACCREISCANOM_CODISTRUPROV = 15;
  private static int PFL_ACCREISCANOM_LIVELLO4PROV = 16;
  private static int PFL_ACCREISCANOM_LIVELLO5PROV = 17;
  private static int PFL_ACCREISCANOM_UOPROV = 18;
  private static int PFL_ACCREISCANOM_OBIEOPERPROV = 19;

  private static int PPQRY_ACCREISCANOM = 0;


  IDPanel PAN_ACCREISCANOM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_ACCREISCANOM(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_ACCREISCANOM(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_ACCREISCANOM, 20);
    IMDB.set_TblCode(IMDBDef14.PQRY_ACCREISCANOM, "PQRY_ACCREISCANOM");
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMSUACREAAAP, "IMSUACREAAAP");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMSUACREAAAP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMSUACREANAP, "IMSUACREANAP");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMSUACREANAP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_DESCRIZIONE_PROV, "DESCRIZIONE_PROV");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_DESCRIZIONE_PROV,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_CAPITOLO_PROV, "CAPITOLO_PROV");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_CAPITOLO_PROV,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_ARTICOLO_PROV, "ARTICOLO_PROV");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_ARTICOLO_PROV,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_CODICE_STRUTTURA_PROV, "CODICE_STRUTTURA_PROV");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_CODICE_STRUTTURA_PROV,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_LIVELLO_4_PROV, "LIVELLO_4_PROV");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_LIVELLO_4_PROV,5,7,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_LIVELLO_5_PROV, "LIVELLO_5_PROV");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_LIVELLO_5_PROV,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANU1, "IMPSUBREANU1");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANU1,5,198,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANO1, "IMPSUBREANO1");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANO1,5,108,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMSUACREAAAR, "IMSUACREAAAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMSUACREAAAR,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMSUACREANAR, "IMSUACREANAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMSUACREANAR,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_DESCRIZIONE_REISC, "DESCRIZIONE_REISC");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_DESCRIZIONE_REISC,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_CAPITOLO_REISC, "CAPITOLO_REISC");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_CAPITOLO_REISC,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_ARTICOLO_REISC, "ARTICOLO_REISC");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_ARTICOLO_REISC,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_CODICE_STRUTTURA_REISC, "CODICE_STRUTTURA_REISC");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_CODICE_STRUTTURA_REISC,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_LIVELLO_4_REISC, "LIVELLO_4_REISC");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_LIVELLO_4_REISC,5,7,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_LIVELLO_5_REISC, "LIVELLO_5_REISC");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_LIVELLO_5_REISC,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANUN, "IMPSUBREANUN");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANUN,5,198,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANOB, "IMPSUBREANOB");
    IMDB.SetFldParams(IMDBDef14.PQRY_ACCREISCANOM,IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANOB,5,108,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_ACCREISCANOM, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoAnomalieAccertamentiReiscritti(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoAnomalieAccertamentiReiscritti()
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
    FormIdx = MyGlb.FRM_ELEANOACCREI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B5E9CF7F-5943-4C7E-96BA-CAD8C516FD62";
    ResModeW = 2;
    ResModeH = 2;
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
    Frames[1].Caption = "Accertamenti Reiscritti con Anomalie";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 356;
    PAN_ACCREISCANOM = new IDPanel(w, this, 1, "PAN_ACCREISCANOM");
    Frames[1].Content = PAN_ACCREISCANOM;
    PAN_ACCREISCANOM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ACCREISCANOM.VS = MainFrm.VisualStyleList;
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 880-MyGlb.PAN_OFFS_X, 356-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9A1CF744-3DB6-4F24-8C63-CE0914BDBB40");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1788, 276, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ACCREISCANOM.InitStatus = 2;
    PAN_ACCREISCANOM_Init();
    PAN_ACCREISCANOM_InitFields();
    PAN_ACCREISCANOM_InitQueries();
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
      PAN_ACCREISCANOM.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoAnomalieAccertamentiReiscritti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoAnomalieAccertamentiReiscritti.class.getName() : (Glb.ClassWithPackage(ElencoAnomalieAccertamentiReiscritti.class) ? ElencoAnomalieAccertamentiReiscritti.class.getName().substring(ElencoAnomalieAccertamentiReiscritti.class.getPackage().getName().length() + 1) : ElencoAnomalieAccertamentiReiscritti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // ACC REISCRITTI ANOMALI On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ACCREISCANOM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ACCREISCANOM);
      // 
      // ACC REISCRITTI ANOMALI On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ACCREISCANOM.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCREISCANOM_DESCRIZIPROV,IMDB.Value(IMDBDef14.PQRY_ACCREISCANOM, IMDBDef14.PQSL_ACCREISCANOM_DESCRIZIONE_PROV, 0).stringValue()); 
      PAN_ACCREISCANOM.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCREISCANOM_UOPROV,IMDB.Value(IMDBDef14.PQRY_ACCREISCANOM, IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANU1, 0).stringValue()); 
      PAN_ACCREISCANOM.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCREISCANOM_OBIEOPERPROV,IMDB.Value(IMDBDef14.PQRY_ACCREISCANOM, IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANO1, 0).stringValue()); 
      PAN_ACCREISCANOM.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCREISCANOM_DESCRIZREISC,IMDB.Value(IMDBDef14.PQRY_ACCREISCANOM, IMDBDef14.PQSL_ACCREISCANOM_DESCRIZIONE_REISC, 0).stringValue()); 
      PAN_ACCREISCANOM.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCREISCANOM_UOREISC,IMDB.Value(IMDBDef14.PQRY_ACCREISCANOM, IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANUN, 0).stringValue()); 
      PAN_ACCREISCANOM.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCREISCANOM_OBIEOPERREIS,IMDB.Value(IMDBDef14.PQRY_ACCREISCANOM, IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANOB, 0).stringValue()); 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACCREISCANOM, IMDBDef14.PQSL_ACCREISCANOM_LIVELLO_5_REISC, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACCREISCANOM, IMDBDef14.PQSL_ACCREISCANOM_LIVELLO_5_PROV, 0))))
      {
        PAN_ACCREISCANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_ACCREISCANOM_LIVELL5REISC,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACCREISCANOM, IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANUN, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACCREISCANOM, IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANU1, 0))))
      {
        PAN_ACCREISCANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_ACCREISCANOM_UOREISC,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACCREISCANOM, IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANOB, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_ACCREISCANOM, IMDBDef14.PQSL_ACCREISCANOM_IMPSUBREANO1, 0))))
      {
        PAN_ACCREISCANOM.set_VisualStyle(Glb.OBJ_FIELD,PFL_ACCREISCANOM_OBIEOPERREIS,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAnomalieAccertamentiReiscritti", "ACCREISCRITTIANOMALIOnDynamicProperties", _e);
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
  private void PAN_ACCREISCANOM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ACCREISCANOM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ACCREISCANOM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ACCREISCANOM, Cancel);
    // Stub
  }

  private void PAN_ACCREISCANOM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ACCREISCANOM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ACCREISCANOM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ACCREISCANOM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ACCREISCANOM_Init()
  {

    PAN_ACCREISCANOM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ACCREISCANOM.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNOREISCRIZ, "D9BE1FE3-6B47-4454-9977-DC7F13FC247F");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNOREISCRIZ, "Anno Reiscrizione");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNOREISCRIZ, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNOREISCRIZ, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNOREISCRIZ, MyGlb.PANEL_LIST, 0, -9999, 888, 16, 0, 0);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNOREISCRIZ, MyGlb.PANEL_FORM, 0, -21, 568, 433, 0, 0);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNOREISCRIZ, 0, 100);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNOREISCRIZ, 1, 13);
    PAN_ACCREISCANOM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNOREISCRIZ, 0, 4);
    PAN_ACCREISCANOM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNOREISCRIZ, 1, 4);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNOREISCRIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNODIORIGIN, "67234840-6E3C-4659-BD14-4EDF2D4E27E2");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNODIORIGIN, "Anno di Origine");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNODIORIGIN, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNODIORIGIN, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNODIORIGIN, MyGlb.PANEL_LIST, 888, -9999, 900, 16, 0, 0);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNODIORIGIN, MyGlb.PANEL_FORM, 0, 27, 480, 433, 0, 0);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNODIORIGIN, 0, 85);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNODIORIGIN, 1, 13);
    PAN_ACCREISCANOM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNODIORIGIN, 0, 4);
    PAN_ACCREISCANOM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNODIORIGIN, 1, 4);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_GROUP, GRP_ACCREISCANOM_ANNODIORIGIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCREISCANOM.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLREISC, "043C9FBF-2592-4F27-B11C-BAE9F61922F6");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLREISC, "Capitolo");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLREISC, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLREISC, MyGlb.VIS_NORFIEINTLUN);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLREISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLREISC, "40632273-BBB5-4D5D-8E7B-FE1B6B3B4214");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLREISC, "Articolo");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLREISC, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLREISC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLREISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCPROV, "3B27617B-3A05-4DD0-8A34-6F1A445AF086");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCPROV, "Num. Acc.");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCPROV, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCPROV, "A0D28DE1-7B63-44A6-A5BF-23BC82AE3262");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCPROV, "Anno Acc.");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCPROV, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZREISC, "FEAC81BA-C26A-4B48-9DE6-6D7FD80B0433");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZREISC, "Descrizione");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZREISC, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZREISC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZREISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUREIS, "46D6C824-ACBF-4BB0-947E-A6419662B6BF");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUREIS, "Codice");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUREIS, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUREIS, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUREIS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL4REISC, "8540790C-6C8E-4133-AD53-5C3D00366001");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL4REISC, "IV Livello");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL4REISC, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL4REISC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL4REISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL5REISC, "0FF838B8-0247-465D-B5F1-AEBC117E3749");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL5REISC, "V Livello");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL5REISC, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL5REISC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL5REISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOREISC, "97BFE2A1-EC11-42FE-A4E9-9D08DD5CA648");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOREISC, "Unità Organizzativa");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOREISC, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOREISC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOREISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERREIS, "89E7C812-42D5-4F57-8D76-0F136F759297");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERREIS, "Obiettivo Operativo");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERREIS, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERREIS, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERREIS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLOPROV, "8C691417-FAB0-4C08-8F87-32FC1A907140");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLOPROV, "Capitolo");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLOPROV, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLOPROV, MyGlb.VIS_NORFIEINTLUN);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLOPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLOPROV, "BA58909A-EA80-462D-8E3E-395E6906D629");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLOPROV, "Articolo");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLOPROV, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLOPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLOPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCREIS, "78ADF556-1682-4DEC-BB10-9DCF88DC7E65");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCREIS, "Num. Acc.");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCREIS, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCREIS, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCREIS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCREISC, "6655D1CD-D134-4A0F-982E-527A6599F84B");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCREISC, "Anno Acc.");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCREISC, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCREISC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCREISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZIPROV, "4756AF31-68BC-472C-A530-2FE49ECCAE26");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZIPROV, "Descrizione");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZIPROV, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZIPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZIPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUPROV, "EB31F948-8E2F-4427-8850-C1923F45AC4D");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUPROV, "Codice");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUPROV, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO4PROV, "EA4D0F8D-D10E-44E9-9092-9EF33D481CB7");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO4PROV, "IV Livello");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO4PROV, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO4PROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO4PROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO5PROV, "EE1EA225-7D4B-4F3D-B7E9-2182BF8A02F9");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO5PROV, "V Livello");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO5PROV, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO5PROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO5PROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOPROV, "6A8ACAA9-FBDA-43FC-B80E-8F01657D2B63");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOPROV, "Unità Organizzativa");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOPROV, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCREISCANOM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERPROV, "57B074E2-47A0-4282-B1F7-FFCE76E3439C");
    PAN_ACCREISCANOM.set_Header(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERPROV, "Obiettivo Operativo");
    PAN_ACCREISCANOM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERPROV, "");
    PAN_ACCREISCANOM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCREISCANOM.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ACCREISCANOM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLREISC, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLREISC, MyGlb.PANEL_LIST, 100);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLREISC, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLREISC, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLREISC, MyGlb.PANEL_FORM, 196, 172, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLREISC, MyGlb.PANEL_FORM, 112);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLREISC, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLREISC, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_CAPITOLREISC, -1, GRP_ACCREISCANOM_ANNOREISCRIZ);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_CAPITOLREISC, PPQRY_ACCREISCANOM, "A.CAPITOLO_REISC", "CAPITOLO_REISC", 3, 16, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLREISC, MyGlb.PANEL_LIST, 96, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLREISC, MyGlb.PANEL_LIST, 104);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLREISC, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLREISC, MyGlb.PANEL_LIST, "Art.");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLREISC, MyGlb.PANEL_FORM, 396, 220, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLREISC, MyGlb.PANEL_FORM, 120);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLREISC, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLREISC, MyGlb.PANEL_FORM, "Articolo");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_ARTICOLREISC, -1, GRP_ACCREISCANOM_ANNOREISCRIZ);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_ARTICOLREISC, PPQRY_ACCREISCANOM, "A.ARTICOLO_REISC", "ARTICOLO_REISC", 1, 2, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCPROV, MyGlb.PANEL_LIST, 128, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCPROV, MyGlb.PANEL_LIST, 116);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCPROV, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCPROV, MyGlb.PANEL_LIST, "Num. Acc.");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCPROV, MyGlb.PANEL_FORM, 4, 388, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCPROV, MyGlb.PANEL_FORM, 116);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCPROV, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCPROV, MyGlb.PANEL_FORM, "Num. Acc.");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_NUMERACCPROV, -1, GRP_ACCREISCANOM_ANNOREISCRIZ);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_NUMERACCPROV, PPQRY_ACCREISCANOM, "A.NUMERO_ACC_PROV", "IMSUACREANAP", 1, 5, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCPROV, MyGlb.PANEL_LIST, 192, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCPROV, MyGlb.PANEL_LIST, 96);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCPROV, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCPROV, MyGlb.PANEL_LIST, "Anno Acc.");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCPROV, MyGlb.PANEL_FORM, 4, 364, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCPROV, MyGlb.PANEL_FORM, 96);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCPROV, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCPROV, MyGlb.PANEL_FORM, "Anno Acc.");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_ANNOACCPROV, -1, GRP_ACCREISCANOM_ANNOREISCRIZ);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_ANNOACCPROV, PPQRY_ACCREISCANOM, "A.ANNO_ACC_PROV", "IMSUACREAAAP", 1, 4, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZREISC, MyGlb.PANEL_LIST, 256, 36, 136, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZREISC, MyGlb.PANEL_LIST, 120);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZREISC, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZREISC, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZREISC, MyGlb.PANEL_FORM, 4, 268, 360, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZREISC, MyGlb.PANEL_FORM, 96);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZREISC, MyGlb.PANEL_FORM, 2);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZREISC, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_DESCRIZREISC, -1, GRP_ACCREISCANOM_ANNOREISCRIZ);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_DESCRIZREISC, PPQRY_ACCREISCANOM, "A.DESCRIZIONE_REISC", "DESCRIZIONE_REISC", 5, 140, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUREIS, MyGlb.PANEL_LIST, 392, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUREIS, MyGlb.PANEL_LIST, 128);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUREIS, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUREIS, MyGlb.PANEL_LIST, "Codice");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUREIS, MyGlb.PANEL_FORM, 4, 292, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUREIS, MyGlb.PANEL_FORM, 160);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUREIS, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUREIS, MyGlb.PANEL_FORM, "Codice");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_CODISTRUREIS, -1, GRP_ACCREISCANOM_ANNOREISCRIZ);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_CODISTRUREIS, PPQRY_ACCREISCANOM, "A.CODICE_STRUTTURA_REISC", "CODICE_STRUTTURA_REISC", 5, 10, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL4REISC, MyGlb.PANEL_LIST, 444, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL4REISC, MyGlb.PANEL_LIST, 112);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL4REISC, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL4REISC, MyGlb.PANEL_LIST, "IV Livello");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL4REISC, MyGlb.PANEL_FORM, 228, 292, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL4REISC, MyGlb.PANEL_FORM, 112);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL4REISC, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL4REISC, MyGlb.PANEL_FORM, "IV Livello");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_LIVELL4REISC, -1, GRP_ACCREISCANOM_ANNOREISCRIZ);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_LIVELL4REISC, PPQRY_ACCREISCANOM, "A.LIVELLO_4_REISC", "LIVELLO_4_REISC", 5, 7, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL5REISC, MyGlb.PANEL_LIST, 512, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL5REISC, MyGlb.PANEL_LIST, 128);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL5REISC, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL5REISC, MyGlb.PANEL_LIST, "V Livello");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL5REISC, MyGlb.PANEL_FORM, 372, 4, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL5REISC, MyGlb.PANEL_FORM, 20);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL5REISC, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELL5REISC, MyGlb.PANEL_FORM, "V Livello");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_LIVELL5REISC, -1, GRP_ACCREISCANOM_ANNOREISCRIZ);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_LIVELL5REISC, PPQRY_ACCREISCANOM, "A.LIVELLO_5_REISC", "LIVELLO_5_REISC", 5, 10, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOREISC, MyGlb.PANEL_LIST, 588, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOREISC, MyGlb.PANEL_LIST, 72);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOREISC, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOREISC, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOREISC, MyGlb.PANEL_FORM, 396, 244, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOREISC, MyGlb.PANEL_FORM, 72);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOREISC, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOREISC, MyGlb.PANEL_FORM, "Un. Organ.");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_UOREISC, -1, GRP_ACCREISCANOM_ANNOREISCRIZ);
    PAN_ACCREISCANOM.SetFieldUnbound(PFL_ACCREISCANOM_UOREISC, true);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_UOREISC, PPQRY_ACCREISCANOM, "TO_CHAR ( A.UO_REISC ) || DECODE(A.UO_REISC, to_number(NULL), '', ' - ' || A.DESC_UO_REISC)", "IMPSUBREANUN", 5, 198, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERREIS, MyGlb.PANEL_LIST, 748, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERREIS, MyGlb.PANEL_LIST, 128);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERREIS, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERREIS, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERREIS, MyGlb.PANEL_FORM, 4, 340, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERREIS, MyGlb.PANEL_FORM, 160);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERREIS, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERREIS, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_OBIEOPERREIS, -1, GRP_ACCREISCANOM_ANNOREISCRIZ);
    PAN_ACCREISCANOM.SetFieldUnbound(PFL_ACCREISCANOM_OBIEOPERREIS, true);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_OBIEOPERREIS, PPQRY_ACCREISCANOM, "A.OBIETTIVO_OPERATIVO_REISC || DECODE(A.OBIETTIVO_OPERATIVO_REISC, '', '', ' - ' || A.DESC_OBIETTIVO_OPERATIVO_REISC)", "IMPSUBREANOB", 5, 108, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLOPROV, MyGlb.PANEL_LIST, 888, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLOPROV, MyGlb.PANEL_LIST, 100);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLOPROV, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLOPROV, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLOPROV, MyGlb.PANEL_FORM, 4, 76, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLOPROV, MyGlb.PANEL_FORM, 96);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLOPROV, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CAPITOLOPROV, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_CAPITOLOPROV, -1, GRP_ACCREISCANOM_ANNODIORIGIN);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_CAPITOLOPROV, PPQRY_ACCREISCANOM, "A.CAPITOLO_PROV", "CAPITOLO_PROV", 3, 16, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLOPROV, MyGlb.PANEL_LIST, 984, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLOPROV, MyGlb.PANEL_LIST, 100);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLOPROV, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLOPROV, MyGlb.PANEL_LIST, "Art.");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLOPROV, MyGlb.PANEL_FORM, 212, 76, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLOPROV, MyGlb.PANEL_FORM, 112);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLOPROV, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ARTICOLOPROV, MyGlb.PANEL_FORM, "Articolo");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_ARTICOLOPROV, -1, GRP_ACCREISCANOM_ANNODIORIGIN);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_ARTICOLOPROV, PPQRY_ACCREISCANOM, "A.ARTICOLO_PROV", "ARTICOLO_PROV", 1, 2, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCREIS, MyGlb.PANEL_LIST, 1016, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCREIS, MyGlb.PANEL_LIST, 116);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCREIS, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCREIS, MyGlb.PANEL_LIST, "Num. Acc.");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCREIS, MyGlb.PANEL_FORM, 4, 436, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCREIS, MyGlb.PANEL_FORM, 116);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCREIS, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_NUMERACCREIS, MyGlb.PANEL_FORM, "Num. Acc.");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_NUMERACCREIS, -1, GRP_ACCREISCANOM_ANNODIORIGIN);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_NUMERACCREIS, PPQRY_ACCREISCANOM, "A.NUMERO_ACC_REISC", "IMSUACREANAR", 1, 5, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCREISC, MyGlb.PANEL_LIST, 1080, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCREISC, MyGlb.PANEL_LIST, 100);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCREISC, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCREISC, MyGlb.PANEL_LIST, "Anno Acc.");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCREISC, MyGlb.PANEL_FORM, 4, 412, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCREISC, MyGlb.PANEL_FORM, 100);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCREISC, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_ANNOACCREISC, MyGlb.PANEL_FORM, "Anno Acc.");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_ANNOACCREISC, -1, GRP_ACCREISCANOM_ANNODIORIGIN);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_ANNOACCREISC, PPQRY_ACCREISCANOM, "A.ANNO_ACC_REISC", "IMSUACREAAAR", 1, 4, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZIPROV, MyGlb.PANEL_LIST, 1144, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZIPROV, MyGlb.PANEL_LIST, 116);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZIPROV, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZIPROV, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZIPROV, MyGlb.PANEL_FORM, 4, 52, 400, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZIPROV, MyGlb.PANEL_FORM, 96);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZIPROV, MyGlb.PANEL_FORM, 2);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_DESCRIZIPROV, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_DESCRIZIPROV, -1, GRP_ACCREISCANOM_ANNODIORIGIN);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_DESCRIZIPROV, PPQRY_ACCREISCANOM, "A.DESCRIZIONE_PROV", "DESCRIZIONE_PROV", 5, 140, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUPROV, MyGlb.PANEL_LIST, 1304, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUPROV, MyGlb.PANEL_LIST, 156);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUPROV, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUPROV, MyGlb.PANEL_LIST, "Codice");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUPROV, MyGlb.PANEL_FORM, 4, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUPROV, MyGlb.PANEL_FORM, 96);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUPROV, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_CODISTRUPROV, MyGlb.PANEL_FORM, "Codice");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_CODISTRUPROV, -1, GRP_ACCREISCANOM_ANNODIORIGIN);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_CODISTRUPROV, PPQRY_ACCREISCANOM, "A.CODICE_STRUTTURA_PROV", "CODICE_STRUTTURA_PROV", 5, 10, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO4PROV, MyGlb.PANEL_LIST, 1356, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO4PROV, MyGlb.PANEL_LIST, 96);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO4PROV, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO4PROV, MyGlb.PANEL_LIST, "IV Livello");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO4PROV, MyGlb.PANEL_FORM, 164, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO4PROV, MyGlb.PANEL_FORM, 112);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO4PROV, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO4PROV, MyGlb.PANEL_FORM, "IV Livello");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_LIVELLO4PROV, -1, GRP_ACCREISCANOM_ANNODIORIGIN);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_LIVELLO4PROV, PPQRY_ACCREISCANOM, "A.LIVELLO_4_PROV", "LIVELLO_4_PROV", 5, 7, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO5PROV, MyGlb.PANEL_LIST, 1420, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO5PROV, MyGlb.PANEL_LIST, 96);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO5PROV, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO5PROV, MyGlb.PANEL_LIST, "V Livello");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO5PROV, MyGlb.PANEL_FORM, 4, 124, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO5PROV, MyGlb.PANEL_FORM, 96);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO5PROV, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_LIVELLO5PROV, MyGlb.PANEL_FORM, "V Livello");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_LIVELLO5PROV, -1, GRP_ACCREISCANOM_ANNODIORIGIN);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_LIVELLO5PROV, PPQRY_ACCREISCANOM, "A.LIVELLO_5_PROV", "LIVELLO_5_PROV", 5, 10, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOPROV, MyGlb.PANEL_LIST, 1496, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOPROV, MyGlb.PANEL_LIST, 60);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOPROV, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOPROV, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOPROV, MyGlb.PANEL_FORM, 356, 124, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOPROV, MyGlb.PANEL_FORM, 72);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOPROV, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_UOPROV, MyGlb.PANEL_FORM, "Un. Organ.");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_UOPROV, -1, GRP_ACCREISCANOM_ANNODIORIGIN);
    PAN_ACCREISCANOM.SetFieldUnbound(PFL_ACCREISCANOM_UOPROV, true);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_UOPROV, PPQRY_ACCREISCANOM, "TO_CHAR ( A.UO_PROV ) || DECODE(A.UO_PROV, to_number(NULL), '', ' - ' || A.DESC_UO_PROV)", "IMPSUBREANU1", 5, 198, 0, -13997);
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERPROV, MyGlb.PANEL_LIST, 1652, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERPROV, MyGlb.PANEL_LIST, 168);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERPROV, MyGlb.PANEL_LIST, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERPROV, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_ACCREISCANOM.SetRect(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERPROV, MyGlb.PANEL_FORM, 4, 172, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCREISCANOM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERPROV, MyGlb.PANEL_FORM, 96);
    PAN_ACCREISCANOM.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERPROV, MyGlb.PANEL_FORM, 1);
    PAN_ACCREISCANOM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCREISCANOM_OBIEOPERPROV, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_ACCREISCANOM.SetFieldPage(PFL_ACCREISCANOM_OBIEOPERPROV, -1, GRP_ACCREISCANOM_ANNODIORIGIN);
    PAN_ACCREISCANOM.SetFieldUnbound(PFL_ACCREISCANOM_OBIEOPERPROV, true);
    PAN_ACCREISCANOM.SetFieldPanel(PFL_ACCREISCANOM_OBIEOPERPROV, PPQRY_ACCREISCANOM, "A.OBIETTIVO_OPERATIVO_PROV || DECODE(A.OBIETTIVO_OPERATIVO_PROV, '', '', ' - ' || A.DESC_OBIETTIVO_OPERATIVO_PROV)", "IMPSUBREANO1", 5, 108, 0, -13997);
  }

  private void PAN_ACCREISCANOM_InitQueries()
  {
    StringBuffer SQL;

    PAN_ACCREISCANOM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ACCREISCANOM.SetIMDB(IMDB, "PQRY_ACCREISCANOM", true);
    PAN_ACCREISCANOM.set_SetString(MyGlb.MASTER_ROWNAME, "IMP SUB REISCRITTI ANOMALI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_ACC_PROV as IMSUACREAAAP, ");
    SQL.append("  A.NUMERO_ACC_PROV as IMSUACREANAP, ");
    SQL.append("  A.DESCRIZIONE_PROV as DESCRIZIONE_PROV, ");
    SQL.append("  A.CAPITOLO_PROV as CAPITOLO_PROV, ");
    SQL.append("  A.ARTICOLO_PROV as ARTICOLO_PROV, ");
    SQL.append("  A.CODICE_STRUTTURA_PROV as CODICE_STRUTTURA_PROV, ");
    SQL.append("  A.LIVELLO_4_PROV as LIVELLO_4_PROV, ");
    SQL.append("  A.LIVELLO_5_PROV as LIVELLO_5_PROV, ");
    SQL.append("  TO_CHAR ( A.UO_PROV ) || DECODE(A.UO_PROV, to_number(NULL), '', ' - ' || A.DESC_UO_PROV) as IMPSUBREANU1, ");
    SQL.append("  A.OBIETTIVO_OPERATIVO_PROV || DECODE(A.OBIETTIVO_OPERATIVO_PROV, '', '', ' - ' || A.DESC_OBIETTIVO_OPERATIVO_PROV) as IMPSUBREANO1, ");
    SQL.append("  A.ANNO_ACC_REISC as IMSUACREAAAR, ");
    SQL.append("  A.NUMERO_ACC_REISC as IMSUACREANAR, ");
    SQL.append("  A.DESCRIZIONE_REISC as DESCRIZIONE_REISC, ");
    SQL.append("  A.CAPITOLO_REISC as CAPITOLO_REISC, ");
    SQL.append("  A.ARTICOLO_REISC as ARTICOLO_REISC, ");
    SQL.append("  A.CODICE_STRUTTURA_REISC as CODICE_STRUTTURA_REISC, ");
    SQL.append("  A.LIVELLO_4_REISC as LIVELLO_4_REISC, ");
    SQL.append("  A.LIVELLO_5_REISC as LIVELLO_5_REISC, ");
    SQL.append("  TO_CHAR ( A.UO_REISC ) || DECODE(A.UO_REISC, to_number(NULL), '', ' - ' || A.DESC_UO_REISC) as IMPSUBREANUN, ");
    SQL.append("  A.OBIETTIVO_OPERATIVO_REISC || DECODE(A.OBIETTIVO_OPERATIVO_REISC, '', '', ' - ' || A.DESC_OBIETTIVO_OPERATIVO_REISC) as IMPSUBREANOB ");
    PAN_ACCREISCANOM.SetQuery(PPQRY_ACCREISCANOM, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ACC_REISCRITTI_ANOMALI A ");
    PAN_ACCREISCANOM.SetQuery(PPQRY_ACCREISCANOM, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCREISCANOM.SetQuery(PPQRY_ACCREISCANOM, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCREISCANOM.SetQuery(PPQRY_ACCREISCANOM, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCREISCANOM.SetQuery(PPQRY_ACCREISCANOM, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCREISCANOM.SetQuery(PPQRY_ACCREISCANOM, 5, SQL, -1, "");
    PAN_ACCREISCANOM.SetQueryDB(PPQRY_ACCREISCANOM, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCREISCANOM.SetMasterTable(0, "ACC_REISCRITTI_ANOMALI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ACCREISCANOM.Status() == 2)
    {
      int oldListQBE = PAN_ACCREISCANOM.iUseListQBE;
      PAN_ACCREISCANOM.iUseListQBE = 0;
      PAN_ACCREISCANOM.PanelCommand(Glb.PCM_SEARCH);
      PAN_ACCREISCANOM.PanelCommand(Glb.PCM_FIND);
      PAN_ACCREISCANOM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ACCREISCANOM) PAN_ACCREISCANOM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCREISCANOM) PAN_ACCREISCANOM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ACCREISCANOM) PAN_ACCREISCANOM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCREISCANOM) PAN_ACCREISCANOM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ACCREISCANOM) PAN_ACCREISCANOM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
