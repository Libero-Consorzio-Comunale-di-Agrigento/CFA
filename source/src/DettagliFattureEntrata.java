// **********************************************
// Dettagli Fatture Entrata
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DettagliFattureEntrata extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_DETTESTRCONT_ORDINATIVO = 0;
  private static int PFL_DETTESTRCONT_IMPORTO1 = 1;
  private static int PFL_DETTESTRCONT_CAPITOLO = 2;
  private static int PFL_DETTESTRCONT_ACCERTAMENTO = 3;
  private static int PFL_DETTESTRCONT_DISTINTA = 4;
  private static int PFL_DETTESTRCONT_QUIETANZA = 5;
  private static int PFL_DETTESTRCONT_UFFICIO = 6;
  private static int PFL_DETTESTRCONT_DESCRIZIONE1 = 7;
  private static int PFL_DETTESTRCONT_NUMQUIETANZA = 8;
  private static int PFL_DETTESTRCONT_LABEL = 9;

  private static int PPQRY_LIQ33 = 0;


  IDPanel PAN_DETTESTRCONT;
  private static int PFL_RETTIFICHE_DOCUMECOLLEG = 0;
  private static int PFL_RETTIFICHE_IMPORTO = 1;
  private static int PFL_RETTIFICHE_DATAREG = 2;
  private static int PFL_RETTIFICHE_DESCRIZIONE = 3;
  private static int PFL_RETTIFICHE_DOCFAT = 4;

  private static int PPQRY_RETFAT3 = 0;


  IDPanel PAN_RETTIFICHE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM88(IMDB);
    //
    //
    Init_PQRY_LIQ33(IMDB);
    Init_PQRY_RETFAT3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM88(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM88, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM88, "TBL_PARAM88");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM88,IMDBDef2.FLD_PARAM88_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM88,IMDBDef2.FLD_PARAM88_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM88,IMDBDef2.FLD_PARAM88_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM88,IMDBDef2.FLD_PARAM88_ROWNAMNUMPRO,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM88,IMDBDef2.FLD_PARAM88_ROWNAMEBENEF, "ROWNAMEBENEF");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM88,IMDBDef2.FLD_PARAM88_ROWNAMEBENEF,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM88,IMDBDef2.FLD_PARAM88_ROWNAMFATNAC, "ROWNAMFATNAC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM88,IMDBDef2.FLD_PARAM88_ROWNAMFATNAC,5,1,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM88, 0);
  }

  private static void Init_PQRY_LIQ33(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_LIQ33, 11);
    IMDB.set_TblCode(IMDBDef9.PQRY_LIQ33, "PQRY_LIQ33");
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQCAPITOLO, "LIQCAPITOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQCAPITOLO,5,199,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQORDINATIV, "LIQORDINATIV");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQORDINATIV,5,399,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQT02DESCRI, "LIQT02DESCRI");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQT02DESCRI,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQDISTINTA, "LIQDISTINTA");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQDISTINTA,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQACCERTAME, "LIQACCERTAME");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQACCERTAME,5,199,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQQUIETANZA, "LIQQUIETANZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQQUIETANZA,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQUFFICIO, "LIQUFFICIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQUFFICIO,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQPREANNORD, "LIQPREANNORD");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQPREANNORD,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQPRENUMORD, "LIQPRENUMORD");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQPRENUMORD,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQDESCRIZIO, "LIQDESCRIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ33,IMDBDef9.PQSL_LIQ33_LIQDESCRIZIO,5,140,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_LIQ33, 0);
  }

  private static void Init_PQRY_RETFAT3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_RETFAT3, 12);
    IMDB.set_TblCode(IMDBDef9.PQRY_RETFAT3, "PQRY_RETFAT3");
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFATIMPORT, "RETFATIMPORT");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFATIMPORT,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFADATAREG, "RETFADATAREG");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFADATAREG,8,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFATANNRIF, "RETFATANNRIF");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFATANNRIF,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFATNUMRIF, "RETFATNUMRIF");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFATNUMRIF,5,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFATNUMDOC, "RETFATNUMDOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFATNUMDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFAFATDESC, "RETFAFATDESC");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFAFATDESC,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFAFATIMPO, "RETFAFATIMPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFAFATIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFATPROGRE, "RETFATPROGRE");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFATPROGRE,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFATDOCFAT, "RETFATDOCFAT");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFATDOCFAT,5,122,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFDOCUCOLL, "RETFDOCUCOLL");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFDOCUCOLL,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFATCODREC, "RETFATCODREC");
    IMDB.SetFldParams(IMDBDef9.PQRY_RETFAT3,IMDBDef9.PQSL_RETFAT3_RETFATCODREC,5,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_RETFAT3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DettagliFattureEntrata(MyWebEntryPoint w, IMDBObj imdb)
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
  public DettagliFattureEntrata()
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
    FormIdx = MyGlb.FRM_DETTFATTENTR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "43F0E2B9-5B71-4062-A226-D0CDB97F499B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 744;
    DesignHeight = 462;
    set_Caption(new IDVariant("Dettagli Estratto Conto"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 744;
    Frames[1].Height = 436;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.577982;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 744;
    Frames[2].Height = 252;
    Frames[2].Caption = "Dettagli Estratto Conto";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 252;
    PAN_DETTESTRCONT = new IDPanel(w, this, 2, "PAN_DETTESTRCONT");
    Frames[2].Content = PAN_DETTESTRCONT;
    PAN_DETTESTRCONT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTESTRCONT.VS = MainFrm.VisualStyleList;
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 744-MyGlb.PAN_OFFS_X, 252-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "16D1D0D0-B8B7-43F9-BA7C-79AB670F9144");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 32, 1204, 96, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTESTRCONT.InitStatus = 2;
    PAN_DETTESTRCONT_Init();
    PAN_DETTESTRCONT_InitFields();
    PAN_DETTESTRCONT_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 744;
    Frames[3].Height = 184;
    Frames[3].Caption = "Rettifiche";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 184;
    PAN_RETTIFICHE = new IDPanel(w, this, 3, "PAN_RETTIFICHE");
    Frames[3].Content = PAN_RETTIFICHE;
    PAN_RETTIFICHE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RETTIFICHE.VS = MainFrm.VisualStyleList;
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 744-MyGlb.PAN_OFFS_X, 184-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D83F0948-5512-4649-9D97-8A79199C52AD");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 516, 96, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RETTIFICHE.InitStatus = 2;
    PAN_RETTIFICHE_Init();
    PAN_RETTIFICHE_InitFields();
    PAN_RETTIFICHE_InitQueries();
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
      PAN_DETTESTRCONT.UpdatePanel(MainFrm);
      PAN_RETTIFICHE.UpdatePanel(MainFrm);
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
    return (obj instanceof DettagliFattureEntrata);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DettagliFattureEntrata.class.getName() : (Glb.ClassWithPackage(DettagliFattureEntrata.class) ? DettagliFattureEntrata.class.getName().substring(DettagliFattureEntrata.class.getPackage().getName().length() + 1) : DettagliFattureEntrata.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_CODICE_DOC, 0).equals((new IDVariant(6)), true))
      {
        PAN_RETTIFICHE.set_Visible((new IDVariant(0)).booleanValue());
      }
      PAN_DETTESTRCONT.set_FieldText(PFL_DETTESTRCONT_LABEL, IDL.Add(IDL.Add(IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_FAT_DESCRIZIONE, 0), (new IDVariant(" "))), IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_DOCUMENTO, 0)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliFattureEntrata", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
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
      // Unload Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM88, IMDBDef2.FLD_PARAM88_ROWNAMANNPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM88, IMDBDef2.FLD_PARAM88_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM88, IMDBDef2.FLD_PARAM88_ROWNAMEBENEF, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM88, IMDBDef2.FLD_PARAM88_ROWNAMFATNAC, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliFattureEntrata", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Rettifiche On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RETTIFICHE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_RETTIFICHE);
      // 
      // Rettifiche On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_RETTIFICHE.set_ToolTip(Glb.OBJ_FIELD,PFL_RETTIFICHE_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_RETFAT3, IMDBDef9.PQSL_RETFAT3_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliFattureEntrata", "RettificheOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Estratto Conto On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTESTRCONT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTESTRCONT);
      // 
      // Dettagli Estratto Conto On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTESTRCONT.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTESTRCONT_UFFICIO,IMDB.Value(IMDBDef9.PQRY_LIQ33, IMDBDef9.PQSL_LIQ33_LIQUFFICIO, 0).stringValue()); 
      PAN_DETTESTRCONT.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTESTRCONT_QUIETANZA,IMDB.Value(IMDBDef9.PQRY_LIQ33, IMDBDef9.PQSL_LIQ33_LIQQUIETANZA, 0).stringValue()); 
      PAN_DETTESTRCONT.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTESTRCONT_DESCRIZIONE1,IMDB.Value(IMDBDef9.PQRY_LIQ33, IMDBDef9.PQSL_LIQ33_LIQDESCRIZIO, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliFattureEntrata", "DettagliEstrattoContoOnDynamicPropertiesEvent", _e);
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
  private void PAN_DETTESTRCONT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTESTRCONT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTESTRCONT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTESTRCONT, Cancel);
    // Stub
  }

  private void PAN_DETTESTRCONT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DETTESTRCONT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTESTRCONT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTESTRCONT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_RETTIFICHE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RETTIFICHE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RETTIFICHE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RETTIFICHE, Cancel);
    // Stub
  }

  private void PAN_RETTIFICHE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_RETTIFICHE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_RETTIFICHE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_RETFAT3, IMDBDef9.PQSL_RETFAT3_RETFADATAREG, 0)))
      {
        IMDB.set_Value(IMDBDef9.PQRY_RETFAT3, IMDBDef9.PQSL_RETFAT3_RETFADATAREG, 0, (new IDVariant("1999/12/31 02:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_RETTIFICHE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DETTESTRCONT_Init()
  {

    PAN_DETTESTRCONT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTESTRCONT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DETTESTRCONT.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ORDINATIVO, "66653BE6-4657-4372-AD4E-5B5D79F94662");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ORDINATIVO, "Ordinativo");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ORDINATIVO, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ORDINATIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ORDINATIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, "FEE5774C-4AC1-4D1A-8949-8756483BACF3");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, "Importo");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, "8404F2FB-E4A5-4397-9F2F-8BD0045F5553");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, "Capitolo");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ACCERTAMENTO, "60AD261D-E536-4621-8C32-BEAB22314E21");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ACCERTAMENTO, "Accertamento");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ACCERTAMENTO, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ACCERTAMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ACCERTAMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, "5CC51459-8158-4767-A7AD-0B666DEDA048");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, "Distinta");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, "BD3487B4-86FA-4F50-96C3-578334887BB7");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, "Quietanza");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, "477BC84A-264E-4993-9861-C675DB2B2E17");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, "Ufficio");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, "4D08600F-8C86-432F-8F7D-6939361536EC");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, "Descrizione");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, "228D751E-0414-4BDF-8CC1-929CE2F3F676");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, "NUM QUIETANZA");
    PAN_DETTESTRCONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.VIS_NONNULLAFIEL);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, 0, -1);
    PAN_DETTESTRCONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, "43CB7850-7ADD-410D-8F36-610E5ADB6F18");
    PAN_DETTESTRCONT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, "");
    PAN_DETTESTRCONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, MyGlb.VIS_VUOGRAALILEF);
    PAN_DETTESTRCONT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DETTESTRCONT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ORDINATIVO, MyGlb.PANEL_LIST, 0, 68, 128, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ORDINATIVO, MyGlb.PANEL_LIST, 72);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ORDINATIVO, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ORDINATIVO, MyGlb.PANEL_LIST, "Ordinativo");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ORDINATIVO, MyGlb.PANEL_FORM, 4, 556, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ORDINATIVO, MyGlb.PANEL_FORM, 72);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ORDINATIVO, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ORDINATIVO, MyGlb.PANEL_FORM, "Ordinativo");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_ORDINATIVO, -1, -1);
    PAN_DETTESTRCONT.SetFieldUnbound(PFL_DETTESTRCONT_ORDINATIVO, true);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_ORDINATIVO, PPQRY_LIQ33, "TO_CHAR ( A.NUMERO_ORD ) || ' ' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.D_DATA_ORD, 'dd')) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.D_DATA_ORD, 'mm' )) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.D_DATA_ORD, 'yyyy')) )", "LIQORDINATIV", 5, 399, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_LIST, 128, 68, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_LIST, 56);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_FORM, 4, 604, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_FORM, 56);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_IMPORTO1, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_IMPORTO1, PPQRY_LIQ33, "B.IMPORTO", "LIQIMPORTO", 3, 14, 2, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_LIST, 240, 68, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_LIST, 52);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_FORM, 4, 268, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_FORM, 52);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_CAPITOLO, -1, -1);
    PAN_DETTESTRCONT.SetFieldUnbound(PFL_DETTESTRCONT_CAPITOLO, true);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_CAPITOLO, PPQRY_LIQ33, "TO_CHAR ( B.CAPITOLO ) || '/' || TO_CHAR ( B.ARTICOLO )", "LIQCAPITOLO", 5, 199, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ACCERTAMENTO, MyGlb.PANEL_LIST, 380, 68, 92, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ACCERTAMENTO, MyGlb.PANEL_LIST, 28);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ACCERTAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accertamento");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ACCERTAMENTO, MyGlb.PANEL_FORM, 4, 316, 460, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ACCERTAMENTO, MyGlb.PANEL_FORM, 28);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ACCERTAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_ACCERTAMENTO, MyGlb.PANEL_FORM, "Ac.");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_ACCERTAMENTO, -1, -1);
    PAN_DETTESTRCONT.SetFieldUnbound(PFL_DETTESTRCONT_ACCERTAMENTO, true);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_ACCERTAMENTO, PPQRY_LIQ33, "TO_CHAR ( A.NUMERO_ACC ) || '/' || TO_CHAR ( A.ANNO_ACC )", "LIQACCERTAME", 5, 199, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_LIST, 472, 68, 148, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_LIST, 88);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_LIST, "Distinta");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_FORM, 4, 628, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_FORM, 88);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DISTINTA, MyGlb.PANEL_FORM, "Distinta");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_DISTINTA, -1, -1);
    PAN_DETTESTRCONT.SetFieldUnbound(PFL_DETTESTRCONT_DISTINTA, true);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_DISTINTA, PPQRY_LIQ33, "CASE WHEN (A.NUMERO_ELENCO IS NULL) THEN '' ELSE TO_CHAR ( A.NUMERO_ELENCO ) || ' ' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.D_DATA_ELENCO, 'dd')) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.D_DATA_ELENCO, 'mm' )) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.D_DATA_ELENCO, 'yyyy')) ) END", "LIQDISTINTA", 5, 99, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_LIST, 620, 68, 196, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_LIST, 76);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_FORM, 4, 532, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_FORM, 76);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_QUIETANZA, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_QUIETANZA, PPQRY_LIQ33, "D.DESCRIZIONE", "LIQQUIETANZA", 5, 40, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_LIST, 816, 68, 196, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_LIST, 76);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_FORM, 4, 508, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_FORM, 76);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_UFFICIO, -1, -1);
    PAN_DETTESTRCONT.SetFieldUnbound(PFL_DETTESTRCONT_UFFICIO, true);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_UFFICIO, PPQRY_LIQ33, "CASE WHEN (B.UFFICIO IS NULL) THEN '' ELSE TO_CHAR ( E.CODICE ) || ' - ' || E.DESCRIZIONE END", "LIQUFFICIO", 5, 99, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_LIST, 1012, 68, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 676, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_DESCRIZIONE1, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_DESCRIZIONE1, PPQRY_LIQ33, "B.DESCRIZIONE", "LIQDESCRIZIO", 5, 140, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_LIST, 92);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_LIST, "NUM QUIETANZA");
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_FORM, 4, 736, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_FORM, 92);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_NUMQUIETANZA, MyGlb.PANEL_FORM, "NUM QUIET.");
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_NUMQUIETANZA, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_NUMQUIETANZA, PPQRY_LIQ33, "B.ANNO_ORD", "LIQPREANNORD", 1, 4, 0, -13997);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, MyGlb.PANEL_LIST, 0, 4, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, MyGlb.PANEL_LIST, 1);
    PAN_DETTESTRCONT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, MyGlb.PANEL_FORM, 0, 4, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTESTRCONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_DETTESTRCONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTESTRCONT_LABEL, MyGlb.PANEL_FORM, 1);
    PAN_DETTESTRCONT.SetFieldPage(PFL_DETTESTRCONT_LABEL, -1, -1);
    PAN_DETTESTRCONT.SetFieldPanel(PFL_DETTESTRCONT_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
  }

  private void PAN_DETTESTRCONT_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTESTRCONT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DETTESTRCONT.SetIMDB(IMDB, "PQRY_LIQ33", true);
    PAN_DETTESTRCONT.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.CAPITOLO ) || '/' || TO_CHAR ( B.ARTICOLO ) as LIQCAPITOLO, ");
    SQL.append("  TO_CHAR ( A.NUMERO_ORD ) || ' ' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.D_DATA_ORD, 'dd')) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.D_DATA_ORD, 'mm' )) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.D_DATA_ORD, 'yyyy')) ) as LIQORDINATIV, ");
    SQL.append("  B.IMPORTO as LIQIMPORTO, ");
    SQL.append("  D.DESCRIZIONE as LIQT02DESCRI, ");
    SQL.append("  CASE WHEN (A.NUMERO_ELENCO IS NULL) THEN '' ELSE TO_CHAR ( A.NUMERO_ELENCO ) || ' ' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.D_DATA_ELENCO, 'dd')) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.D_DATA_ELENCO, 'mm' )) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.D_DATA_ELENCO, 'yyyy')) ) END as LIQDISTINTA, ");
    SQL.append("  TO_CHAR ( A.NUMERO_ACC ) || '/' || TO_CHAR ( A.ANNO_ACC ) as LIQACCERTAME, ");
    SQL.append("  D.DESCRIZIONE as LIQQUIETANZA, ");
    SQL.append("  CASE WHEN (B.UFFICIO IS NULL) THEN '' ELSE TO_CHAR ( E.CODICE ) || ' - ' || E.DESCRIZIONE END as LIQUFFICIO, ");
    SQL.append("  B.ANNO_ORD as LIQPREANNORD, ");
    SQL.append("  B.NUMERO_ORD as LIQPRENUMORD, ");
    SQL.append("  B.DESCRIZIONE as LIQDESCRIZIO ");
    PAN_DETTESTRCONT.SetQuery(PPQRY_LIQ33, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ORD A, ");
    SQL.append("  PRE B, ");
    SQL.append("  QTN C, ");
    SQL.append("  T02 D, ");
    SQL.append("  T53 E ");
    PAN_DETTESTRCONT.SetQuery(PPQRY_LIQ33, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_ORD = B.ANNO_ORD) ");
    SQL.append("and   (A.NUMERO_ORD = B.NUMERO_ORD) ");
    SQL.append("and   (B.NUM_QUIETANZA = C.NUM_QUIETANZA(+)) ");
    SQL.append("and   (B.DEBITORE = C.CODICE(+)) ");
    SQL.append("and   (D.CODICE(+) = C.TIPO_QUIETANZA) ");
    SQL.append("and   (B.FAT_ANNO_PROG = ~~TBL_PARAM88.ROWNAMANNPRO~~) ");
    SQL.append("and   (B.FAT_NUMERO_PROG = ~~TBL_PARAM88.ROWNAMNUMPRO~~) ");
    SQL.append("and   (B.DEBITORE = ~~TBL_PARAM88.ROWNAMEBENEF~~) ");
    SQL.append("and   (E.CODICE(+) = B.UFFICIO) ");
    PAN_DETTESTRCONT.SetQuery(PPQRY_LIQ33, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTESTRCONT.SetQuery(PPQRY_LIQ33, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTESTRCONT.SetQuery(PPQRY_LIQ33, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_ORD, ");
    SQL.append("  B.NUMERO_ORD ");
    PAN_DETTESTRCONT.SetQuery(PPQRY_LIQ33, 5, SQL, -1, "");
    PAN_DETTESTRCONT.SetQueryDB(PPQRY_LIQ33, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTESTRCONT.SetMasterTable(0, "ORD");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTESTRCONT.Status() == 2)
    {
      int oldListQBE = PAN_DETTESTRCONT.iUseListQBE;
      PAN_DETTESTRCONT.iUseListQBE = 0;
      PAN_DETTESTRCONT.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTESTRCONT.PanelCommand(Glb.PCM_FIND);
      PAN_DETTESTRCONT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_RETTIFICHE_Init()
  {

    PAN_RETTIFICHE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RETTIFICHE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_RETTIFICHE.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, "104627B0-4A67-40FE-990D-E06976A0EF7D");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, "Documento Collegato");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, "5A0C2678-3B43-4ADC-B12D-E185233A2E11");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, "Importo");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, "F1B460D1-7E2D-41C1-A88F-AFC985DCEB90");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, "Data Reg.");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, "DFE46BC9-44B3-47E3-B789-016FA4759D9B");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, "Descrizione");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, "CFEE5BF9-6E81-458B-81B3-7DB7AA818FFF");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, "docFat");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_RETTIFICHE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_LIST, 44);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_LIST, "Documento Collegato");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_FORM, 4, 28, 476, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_FORM, 44);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_FORM, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCUMECOLLEG, MyGlb.PANEL_FORM, "Doc. Coll.");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_DOCUMECOLLEG, -1, -1);
    PAN_RETTIFICHE.SetFieldUnbound(PFL_RETTIFICHE_DOCUMECOLLEG, true);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_DOCUMECOLLEG, PPQRY_RETFAT3, "CASE WHEN (B.NUMERO_DOC IS NULL) THEN '' ELSE B.NUMERO_DOC || ' / ' || TO_CHAR ( B.ANNO_DOC ) END", "RETFDOCUCOLL", 5, 99, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_LIST, 136, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_FORM, 4, 76, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_IMPORTO, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_IMPORTO, PPQRY_RETFAT3, "A.IMPORTO", "RETFATIMPORT", 3, 14, 2, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_LIST, 236, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_LIST, 68);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_FORM, 68);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_DATAREG, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_DATAREG, PPQRY_RETFAT3, "A.D_DATA_REG", "RETFADATAREG", 8, 19, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_LIST, 308, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 124, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_DESCRIZIONE, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_DESCRIZIONE, PPQRY_RETFAT3, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_LIST, 44);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_LIST, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_LIST, "docFat");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_FORM, 4, 148, 476, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_FORM, 44);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_FORM, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DOCFAT, MyGlb.PANEL_FORM, "docFat");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_DOCFAT, -1, -1);
    PAN_RETTIFICHE.SetFieldUnbound(PFL_RETTIFICHE_DOCFAT, true);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_DOCFAT, PPQRY_RETFAT3, "B.NUMERO_DOC || ' / ' || TO_CHAR ( B.ANNO_DOC )", "RETFATDOCFAT", 5, 122, 0, -13997);
  }

  private void PAN_RETTIFICHE_InitQueries()
  {
    StringBuffer SQL;

    PAN_RETTIFICHE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RETTIFICHE.SetIMDB(IMDB, "PQRY_RETFAT3", true);
    PAN_RETTIFICHE.set_SetString(MyGlb.MASTER_ROWNAME, "RETFAT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.IMPORTO as RETFATIMPORT, ");
    SQL.append("  A.D_DATA_REG as RETFADATAREG, ");
    SQL.append("  B.ANNO_RIF as RETFATANNRIF, ");
    SQL.append("  B.NUMERO_RIF as RETFATNUMRIF, ");
    SQL.append("  B.NUMERO_DOC as RETFATNUMDOC, ");
    SQL.append("  B.DESCRIZIONE as RETFAFATDESC, ");
    SQL.append("  B.IMPORTO as RETFAFATIMPO, ");
    SQL.append("  A.PROGRESSIVO as RETFATPROGRE, ");
    SQL.append("  B.NUMERO_DOC || ' / ' || TO_CHAR ( B.ANNO_DOC ) as RETFATDOCFAT, ");
    SQL.append("  CASE WHEN (B.NUMERO_DOC IS NULL) THEN '' ELSE B.NUMERO_DOC || ' / ' || TO_CHAR ( B.ANNO_DOC ) END as RETFDOCUCOLL, ");
    SQL.append("  A.COD_REC as RETFATCODREC ");
    PAN_RETTIFICHE.SetQuery(PPQRY_RETFAT3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  RETFAT A, ");
    SQL.append("  FAT B ");
    PAN_RETTIFICHE.SetQuery(PPQRY_RETFAT3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_PROG(+) = DECODE(~~TBL_PARAM88.ROWNAMFATNAC~~, 'N', A.FAT_ANNO_PROG_FAT, A.FAT_ANNO_PROG_NAC)) ");
    SQL.append("and   (B.NUMERO_PROG(+) = DECODE(~~TBL_PARAM88.ROWNAMFATNAC~~, 'N', A.FAT_NUMERO_PROG_FAT, A.FAT_NUMERO_PROG_NAC)) ");
    SQL.append("and   ((A.COD_REC IS NULL)) ");
    SQL.append("and   (DECODE(~~TBL_PARAM88.ROWNAMFATNAC~~, 'F', A.FAT_ANNO_PROG_FAT, A.FAT_ANNO_PROG_NAC) = ~~TBL_PARAM88.ROWNAMANNPRO~~) ");
    SQL.append("and   (DECODE(~~TBL_PARAM88.ROWNAMFATNAC~~, 'F', A.FAT_NUMERO_PROG_FAT, A.FAT_NUMERO_PROG_NAC) = ~~TBL_PARAM88.ROWNAMNUMPRO~~) ");
    PAN_RETTIFICHE.SetQuery(PPQRY_RETFAT3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RETTIFICHE.SetQuery(PPQRY_RETFAT3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RETTIFICHE.SetQuery(PPQRY_RETFAT3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RETTIFICHE.SetQuery(PPQRY_RETFAT3, 5, SQL, -1, "");
    PAN_RETTIFICHE.SetQueryDB(PPQRY_RETFAT3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RETTIFICHE.SetMasterTable(0, "RETFAT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RETTIFICHE.Status() == 2)
    {
      int oldListQBE = PAN_RETTIFICHE.iUseListQBE;
      PAN_RETTIFICHE.iUseListQBE = 0;
      PAN_RETTIFICHE.PanelCommand(Glb.PCM_SEARCH);
      PAN_RETTIFICHE.PanelCommand(Glb.PCM_FIND);
      PAN_RETTIFICHE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DETTESTRCONT) PAN_DETTESTRCONT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTESTRCONT) PAN_DETTESTRCONT_ValidateRow(Cancel);
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTESTRCONT) PAN_DETTESTRCONT_DynamicProperties();
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTESTRCONT) PAN_DETTESTRCONT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DETTESTRCONT) PAN_DETTESTRCONT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
