// **********************************************
// Avanzo Di Amministrazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AvanzoDiAmministrazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ARMONIZZAZIO_DESCRIZIONE1 = 0;
  private static int PFL_ARMONIZZAZIO_STANZDEFINIT = 1;

  private static int PPQRY_CAP = 0;


  IDPanel PAN_ARMONIZZAZIO;
  private static int PFL_DL77_PROGRESSIVO1 = 0;
  private static int PFL_DL77_ESERCIZIO1 = 1;
  private static int PFL_DL77_TIPO1 = 2;
  private static int PFL_DL77_DESCRIZIONE2 = 3;
  private static int PFL_DL77_IMPORTO1 = 4;

  private static int PPQRY_WORCONCONDL8 = 0;


  IDPanel PAN_DL77;
  private static int PFL_AVANZAMMIFPV_PROGRESSIVO = 0;
  private static int PFL_AVANZAMMIFPV_ESERCIZIO = 1;
  private static int PFL_AVANZAMMIFPV_TIPO = 2;
  private static int PFL_AVANZAMMIFPV_DESCRIZIONE = 3;
  private static int PFL_AVANZAMMIFPV_DASPESA = 4;
  private static int PFL_AVANZAMMIFPV_DAESIGIBILIT = 5;
  private static int PFL_AVANZAMMIFPV_DIFFERENZA = 6;
  private static int PFL_AVANZAMMIFPV_IMPORTO = 7;

  private static int PPQRY_WORCONCONDL7 = 0;


  IDPanel PAN_AVANZAMMIFPV;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_CAP(IMDB);
    Init_PQRY_WORCONCONDL8(IMDB);
    Init_PQRY_WORCONCONDL7(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_CAP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CAP, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_CAP, "PQRY_CAP");
    IMDB.set_FldCode(IMDBDef17.PQRY_CAP,IMDBDef17.PQSL_CAP_RECORCAPDESC, "RECORCAPDESC");
    IMDB.SetFldParams(IMDBDef17.PQRY_CAP,IMDBDef17.PQSL_CAP_RECORCAPDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CAP,IMDBDef17.PQSL_CAP_RECOSTANDEFI, "RECOSTANDEFI");
    IMDB.SetFldParams(IMDBDef17.PQRY_CAP,IMDBDef17.PQSL_CAP_RECOSTANDEFI,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_CAP, 0);
  }

  private static void Init_PQRY_WORCONCONDL8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_WORCONCONDL8, 5);
    IMDB.set_TblCode(IMDBDef17.PQRY_WORCONCONDL8, "PQRY_WORCONCONDL8");
    IMDB.set_FldCode(IMDBDef17.PQRY_WORCONCONDL8,IMDBDef17.PQSL_WORCONCONDL8_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef17.PQRY_WORCONCONDL8,IMDBDef17.PQSL_WORCONCONDL8_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WORCONCONDL8,IMDBDef17.PQSL_WORCONCONDL8_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_WORCONCONDL8,IMDBDef17.PQSL_WORCONCONDL8_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WORCONCONDL8,IMDBDef17.PQSL_WORCONCONDL8_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_WORCONCONDL8,IMDBDef17.PQSL_WORCONCONDL8_TIPO,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WORCONCONDL8,IMDBDef17.PQSL_WORCONCONDL8_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_WORCONCONDL8,IMDBDef17.PQSL_WORCONCONDL8_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WORCONCONDL8,IMDBDef17.PQSL_WORCONCONDL8_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_WORCONCONDL8,IMDBDef17.PQSL_WORCONCONDL8_IMPORTO,3,14,2);
    IMDB.TblAddNew(IMDBDef17.PQRY_WORCONCONDL8, 0);
  }

  private static void Init_PQRY_WORCONCONDL7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_WORCONCONDL7, 8);
    IMDB.set_TblCode(IMDBDef17.PQRY_WORCONCONDL7, "PQRY_WORCONCONDL7");
    IMDB.set_FldCode(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_TIPO,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_DASPESA, "DASPESA");
    IMDB.SetFldParams(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_DASPESA,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_DAESIGIBILIT, "DAESIGIBILIT");
    IMDB.SetFldParams(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_DAESIGIBILIT,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_DIFFERENZA, "DIFFERENZA");
    IMDB.SetFldParams(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_DIFFERENZA,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_WORCONCONDL7,IMDBDef17.PQSL_WORCONCONDL7_IMPORTO,3,14,2);
    IMDB.TblAddNew(IMDBDef17.PQRY_WORCONCONDL7, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AvanzoDiAmministrazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public AvanzoDiAmministrazione()
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
    FormIdx = MyGlb.FRM_AVANZDIAMMIN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B812D29B-D472-48D6-B3EB-4F26FB6A4255";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 916;
    DesignHeight = 486;
    set_Caption(new IDVariant("Avanzo di amministrazione"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 916;
    Frames[1].Height = 460;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.678261;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 916;
    Frames[2].Height = 312;
    Frames[2].FormFactor = 0.475983;
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[2].ChildFrame1 = Frames[3];
    Frames[3].Width = 436;
    Frames[3].Height = 312;
    Frames[3].Caption = "Armonizzazione";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 312;
    PAN_ARMONIZZAZIO = new IDPanel(w, this, 3, "PAN_ARMONIZZAZIO");
    Frames[3].Content = PAN_ARMONIZZAZIO;
    PAN_ARMONIZZAZIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ARMONIZZAZIO.VS = MainFrm.VisualStyleList;
    PAN_ARMONIZZAZIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 436-MyGlb.PAN_OFFS_X, 312-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ARMONIZZAZIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DB31D353-621A-420F-834E-497B0A140554");
    PAN_ARMONIZZAZIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 376, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ARMONIZZAZIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ARMONIZZAZIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ARMONIZZAZIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ARMONIZZAZIO.InitStatus = 2;
    PAN_ARMONIZZAZIO_Init();
    PAN_ARMONIZZAZIO_InitFields();
    PAN_ARMONIZZAZIO_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[2].ChildFrame2 = Frames[4];
    Frames[4].Width = 480;
    Frames[4].Height = 312;
    Frames[4].Caption = "DL 77";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 312;
    PAN_DL77 = new IDPanel(w, this, 4, "PAN_DL77");
    Frames[4].Content = PAN_DL77;
    PAN_DL77.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DL77.VS = MainFrm.VisualStyleList;
    PAN_DL77.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 480-MyGlb.PAN_OFFS_X, 312-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DL77.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F9CE96F0-29C3-4319-8A30-3C469C8C6F83");
    PAN_DL77.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 404, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DL77.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DL77.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DL77.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DL77.InitStatus = 2;
    PAN_DL77_Init();
    PAN_DL77_InitFields();
    PAN_DL77_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[1].ChildFrame2 = Frames[5];
    Frames[5].Width = 916;
    Frames[5].Height = 148;
    Frames[5].Caption = "Avanzo Amministrazione FPV";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 148;
    PAN_AVANZAMMIFPV = new IDPanel(w, this, 5, "PAN_AVANZAMMIFPV");
    Frames[5].Content = PAN_AVANZAMMIFPV;
    PAN_AVANZAMMIFPV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_AVANZAMMIFPV.VS = MainFrm.VisualStyleList;
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 916-MyGlb.PAN_OFFS_X, 148-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_AVANZAMMIFPV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "18C3B39A-E914-4AD5-BA5E-E1DBB9469E0E");
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 796, 76, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_AVANZAMMIFPV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_AVANZAMMIFPV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_AVANZAMMIFPV.InitStatus = 2;
    PAN_AVANZAMMIFPV_Init();
    PAN_AVANZAMMIFPV_InitFields();
    PAN_AVANZAMMIFPV_InitQueries();
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
      PAN_ARMONIZZAZIO.UpdatePanel(MainFrm);
      PAN_DL77.UpdatePanel(MainFrm);
      PAN_AVANZAMMIFPV.UpdatePanel(MainFrm);
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
    return (obj instanceof AvanzoDiAmministrazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AvanzoDiAmministrazione.class.getName() : (Glb.ClassWithPackage(AvanzoDiAmministrazione.class) ? AvanzoDiAmministrazione.class.getName().substring(AvanzoDiAmministrazione.class.getPackage().getName().length() + 1) : AvanzoDiAmministrazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Armonizzazione On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ARMONIZZAZIO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ARMONIZZAZIO);
      // 
      // Armonizzazione On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ARMONIZZAZIO.set_ToolTip(Glb.OBJ_FIELD,PFL_ARMONIZZAZIO_DESCRIZIONE1,(new IDVariant(PAN_ARMONIZZAZIO.FieldText(PFL_ARMONIZZAZIO_DESCRIZIONE1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoDiAmministrazione", "ArmonizzazioneOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // DL 77 On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DL77_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DL77);
      // 
      // DL 77 On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DL77.set_ToolTip(Glb.OBJ_FIELD,PFL_DL77_DESCRIZIONE2,(new IDVariant(PAN_DL77.FieldText(PFL_DL77_DESCRIZIONE2))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoDiAmministrazione", "DL77OnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // DL 77 On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_DL77_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DL 77 On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_WORCONCONDL8, IMDBDef17.PQSL_WORCONCONDL8_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef17.PQRY_WORCONCONDL8, IMDBDef17.PQSL_WORCONCONDL8_TIPO, 0, (new IDVariant("AVA")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoDiAmministrazione", "DL77OnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Avanzo Amministrazione FPV After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_AVANZAMMIFPV_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Avanzo Amministrazione FPV After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_AVANZAMMIFPV.GetNumRows())).equals((new IDVariant(0)), true) && Command.equals((new IDVariant(4)), true))
      {
        try
        {
          SQL = new StringBuffer();
          SQL.append("insert into WORK_CONTO_CONS_DL77 ");
          SQL.append("( ");
          SQL.append("  PROGRESSIVO, ");
          SQL.append("  ESERCIZIO, ");
          SQL.append("  TIPO, ");
          SQL.append("  DESCRIZIONE ");
          SQL.append(") ");
          SQL.append("values ");
          SQL.append("( ");
          SQL.append("  1, ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  'AFPVCOR', ");
          SQL.append("  'Corrente' ");
          SQL.append(") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          SQL = new StringBuffer();
          SQL.append("insert into WORK_CONTO_CONS_DL77 ");
          SQL.append("( ");
          SQL.append("  PROGRESSIVO, ");
          SQL.append("  ESERCIZIO, ");
          SQL.append("  TIPO, ");
          SQL.append("  DESCRIZIONE ");
          SQL.append(") ");
          SQL.append("values ");
          SQL.append("( ");
          SQL.append("  2, ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  'AFPVCAP', ");
          SQL.append("  'Capitale' ");
          SQL.append(") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e4)
        {
          MainFrm.set_AlertMessage(new IDVariant(e4.getMessage())); 
          return;
        }
        PAN_AVANZAMMIFPV.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvanzoDiAmministrazione", "AvanzoAmministrazioneFPVAfterFind", _e);
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
  private void PAN_ARMONIZZAZIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ARMONIZZAZIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ARMONIZZAZIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ARMONIZZAZIO, Cancel);
    // Stub
  }

  private void PAN_ARMONIZZAZIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ARMONIZZAZIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ARMONIZZAZIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ARMONIZZAZIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DL77_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DL77, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DL77_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DL77, Cancel);
    // Stub
  }

  private void PAN_DL77_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DL77_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_DL77_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_DL77_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DL77_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_AVANZAMMIFPV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_AVANZAMMIFPV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_AVANZAMMIFPV_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_AVANZAMMIFPV, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_AVANZAMMIFPV_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_AVANZAMMIFPV);
    // Stub
  }

  private void PAN_AVANZAMMIFPV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_AVANZAMMIFPV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_AVANZAMMIFPV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_AVANZAMMIFPV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ARMONIZZAZIO_Init()
  {

    PAN_ARMONIZZAZIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ARMONIZZAZIO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ARMONIZZAZIO.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_ARMONIZZAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_DESCRIZIONE1, "C4328392-79C0-456D-B45E-957A6B70202D");
    PAN_ARMONIZZAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_DESCRIZIONE1, "Descrizione");
    PAN_ARMONIZZAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_DESCRIZIONE1, "");
    PAN_ARMONIZZAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ARMONIZZAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARMONIZZAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_STANZDEFINIT, "B77478FA-5225-4F0F-9275-4203C97A57B7");
    PAN_ARMONIZZAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_STANZDEFINIT, "Stanz. Definitivo");
    PAN_ARMONIZZAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_STANZDEFINIT, "");
    PAN_ARMONIZZAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_STANZDEFINIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_ARMONIZZAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_STANZDEFINIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ARMONIZZAZIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ARMONIZZAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_DESCRIZIONE1, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARMONIZZAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_DESCRIZIONE1, MyGlb.PANEL_LIST, 84);
    PAN_ARMONIZZAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_ARMONIZZAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ARMONIZZAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 4, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARMONIZZAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_DESCRIZIONE1, MyGlb.PANEL_FORM, 84);
    PAN_ARMONIZZAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_ARMONIZZAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ARMONIZZAZIO.SetFieldPage(PFL_ARMONIZZAZIO_DESCRIZIONE1, -1, -1);
    PAN_ARMONIZZAZIO.SetFieldPanel(PFL_ARMONIZZAZIO_DESCRIZIONE1, PPQRY_CAP, "A.DESCRIZIONE", "RECORCAPDESC", 5, 140, 0, -13997);
    PAN_ARMONIZZAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_STANZDEFINIT, MyGlb.PANEL_LIST, 256, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARMONIZZAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_STANZDEFINIT, MyGlb.PANEL_LIST, 100);
    PAN_ARMONIZZAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_STANZDEFINIT, MyGlb.PANEL_LIST, 1);
    PAN_ARMONIZZAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_STANZDEFINIT, MyGlb.PANEL_LIST, "Stanz. Definitivo");
    PAN_ARMONIZZAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_STANZDEFINIT, MyGlb.PANEL_FORM, 4, 40, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARMONIZZAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_STANZDEFINIT, MyGlb.PANEL_FORM, 100);
    PAN_ARMONIZZAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_STANZDEFINIT, MyGlb.PANEL_FORM, 1);
    PAN_ARMONIZZAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARMONIZZAZIO_STANZDEFINIT, MyGlb.PANEL_FORM, "Stanz. Definitivo");
    PAN_ARMONIZZAZIO.SetFieldPage(PFL_ARMONIZZAZIO_STANZDEFINIT, -1, -1);
    PAN_ARMONIZZAZIO.SetFieldUnbound(PFL_ARMONIZZAZIO_STANZDEFINIT, true);
    PAN_ARMONIZZAZIO.SetFieldPanel(PFL_ARMONIZZAZIO_STANZDEFINIT, PPQRY_CAP, "B.STN_INI_CO + NVL(B.VARIAZIONI_CO, 0)", "RECOSTANDEFI", 3, 28, 6, -13997);
  }

  private void PAN_ARMONIZZAZIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_ARMONIZZAZIO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ARMONIZZAZIO.SetIMDB(IMDB, "PQRY_CAP", true);
    PAN_ARMONIZZAZIO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as RECORCAPDESC, ");
    SQL.append("  B.STN_INI_CO + NVL(B.VARIAZIONI_CO, 0) as RECOSTANDEFI ");
    PAN_ARMONIZZAZIO.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP A, ");
    SQL.append("  BIL B ");
    PAN_ARMONIZZAZIO.SetQuery(PPQRY_CAP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (A.CAPITOLO = 9999999999999999) ");
    SQL.append("and   (A.E_S = 'E') ");
    PAN_ARMONIZZAZIO.SetQuery(PPQRY_CAP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ARMONIZZAZIO.SetQuery(PPQRY_CAP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ARMONIZZAZIO.SetQuery(PPQRY_CAP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ARMONIZZAZIO.SetQuery(PPQRY_CAP, 5, SQL, -1, "");
    PAN_ARMONIZZAZIO.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ARMONIZZAZIO.SetMasterTable(0, "CAP");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ARMONIZZAZIO.Status() == 2)
    {
      int oldListQBE = PAN_ARMONIZZAZIO.iUseListQBE;
      PAN_ARMONIZZAZIO.iUseListQBE = 0;
      PAN_ARMONIZZAZIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_ARMONIZZAZIO.PanelCommand(Glb.PCM_FIND);
      PAN_ARMONIZZAZIO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DL77_Init()
  {

    PAN_DL77.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DL77.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DL77.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_DL77.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DL77_PROGRESSIVO1, "1F683637-C4A9-4A26-8EED-7BF62DD75F0A");
    PAN_DL77.set_Header(MyGlb.OBJ_FIELD, PFL_DL77_PROGRESSIVO1, "PROGRESSIVO");
    PAN_DL77.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DL77_PROGRESSIVO1, "");
    PAN_DL77.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DL77_PROGRESSIVO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DL77.SetFlags(MyGlb.OBJ_FIELD, PFL_DL77_PROGRESSIVO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DL77.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DL77_ESERCIZIO1, "1DD1CE82-1BEB-4382-81DC-0F225097FAAC");
    PAN_DL77.set_Header(MyGlb.OBJ_FIELD, PFL_DL77_ESERCIZIO1, "ESERCIZIO");
    PAN_DL77.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DL77_ESERCIZIO1, "");
    PAN_DL77.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DL77_ESERCIZIO1, MyGlb.VIS_NORMFIELPADR);
    PAN_DL77.SetFlags(MyGlb.OBJ_FIELD, PFL_DL77_ESERCIZIO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DL77.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DL77_TIPO1, "7322FAC7-EE72-4C1B-AA15-A5AB2F9D10CE");
    PAN_DL77.set_Header(MyGlb.OBJ_FIELD, PFL_DL77_TIPO1, "TIPO");
    PAN_DL77.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DL77_TIPO1, "");
    PAN_DL77.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DL77_TIPO1, MyGlb.VIS_NORMFIELPADR);
    PAN_DL77.SetFlags(MyGlb.OBJ_FIELD, PFL_DL77_TIPO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DL77.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DL77_DESCRIZIONE2, "B5A37165-B58E-45BB-BDEA-0889881FE06E");
    PAN_DL77.set_Header(MyGlb.OBJ_FIELD, PFL_DL77_DESCRIZIONE2, "Descizione");
    PAN_DL77.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DL77_DESCRIZIONE2, "");
    PAN_DL77.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DL77_DESCRIZIONE2, MyGlb.VIS_NORMALFIELDS);
    PAN_DL77.SetFlags(MyGlb.OBJ_FIELD, PFL_DL77_DESCRIZIONE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DL77.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DL77_IMPORTO1, "E2CC37CC-8197-4766-95A1-D2633BDF2CA5");
    PAN_DL77.set_Header(MyGlb.OBJ_FIELD, PFL_DL77_IMPORTO1, "Stanz. Definitivo");
    PAN_DL77.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DL77_IMPORTO1, "");
    PAN_DL77.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DL77_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DL77.SetFlags(MyGlb.OBJ_FIELD, PFL_DL77_IMPORTO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DL77_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DL77.SetRect(MyGlb.OBJ_FIELD, PFL_DL77_PROGRESSIVO1, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DL77.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DL77_PROGRESSIVO1, MyGlb.PANEL_LIST, 88);
    PAN_DL77.SetNumRow(MyGlb.OBJ_FIELD, PFL_DL77_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_DL77.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DL77_PROGRESSIVO1, MyGlb.PANEL_LIST, "PROGR.");
    PAN_DL77.SetRect(MyGlb.OBJ_FIELD, PFL_DL77_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DL77.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DL77_PROGRESSIVO1, MyGlb.PANEL_FORM, 104);
    PAN_DL77.SetNumRow(MyGlb.OBJ_FIELD, PFL_DL77_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_DL77.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DL77_PROGRESSIVO1, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_DL77.SetFieldPage(PFL_DL77_PROGRESSIVO1, -1, -1);
    PAN_DL77.SetFieldPanel(PFL_DL77_PROGRESSIVO1, PPQRY_WORCONCONDL8, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_DL77.SetRect(MyGlb.OBJ_FIELD, PFL_DL77_ESERCIZIO1, MyGlb.PANEL_LIST, 56, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DL77.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DL77_ESERCIZIO1, MyGlb.PANEL_LIST, 68);
    PAN_DL77.SetNumRow(MyGlb.OBJ_FIELD, PFL_DL77_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_DL77.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DL77_ESERCIZIO1, MyGlb.PANEL_LIST, "ESERC.");
    PAN_DL77.SetRect(MyGlb.OBJ_FIELD, PFL_DL77_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DL77.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DL77_ESERCIZIO1, MyGlb.PANEL_FORM, 104);
    PAN_DL77.SetNumRow(MyGlb.OBJ_FIELD, PFL_DL77_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_DL77.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DL77_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_DL77.SetFieldPage(PFL_DL77_ESERCIZIO1, -1, -1);
    PAN_DL77.SetFieldPanel(PFL_DL77_ESERCIZIO1, PPQRY_WORCONCONDL8, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_DL77.SetRect(MyGlb.OBJ_FIELD, PFL_DL77_TIPO1, MyGlb.PANEL_LIST, 104, 36, 104, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DL77.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DL77_TIPO1, MyGlb.PANEL_LIST, 36);
    PAN_DL77.SetNumRow(MyGlb.OBJ_FIELD, PFL_DL77_TIPO1, MyGlb.PANEL_LIST, 1);
    PAN_DL77.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DL77_TIPO1, MyGlb.PANEL_LIST, "TIPO");
    PAN_DL77.SetRect(MyGlb.OBJ_FIELD, PFL_DL77_TIPO1, MyGlb.PANEL_FORM, 4, 52, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DL77.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DL77_TIPO1, MyGlb.PANEL_FORM, 104);
    PAN_DL77.SetNumRow(MyGlb.OBJ_FIELD, PFL_DL77_TIPO1, MyGlb.PANEL_FORM, 1);
    PAN_DL77.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DL77_TIPO1, MyGlb.PANEL_FORM, "TIPO");
    PAN_DL77.SetFieldPage(PFL_DL77_TIPO1, -1, -1);
    PAN_DL77.SetFieldPanel(PFL_DL77_TIPO1, PPQRY_WORCONCONDL8, "A.TIPO", "TIPO", 5, 20, 0, -13997);
    PAN_DL77.SetRect(MyGlb.OBJ_FIELD, PFL_DL77_DESCRIZIONE2, MyGlb.PANEL_LIST, 0, 36, 284, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DL77.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DL77_DESCRIZIONE2, MyGlb.PANEL_LIST, 84);
    PAN_DL77.SetNumRow(MyGlb.OBJ_FIELD, PFL_DL77_DESCRIZIONE2, MyGlb.PANEL_LIST, 1);
    PAN_DL77.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DL77_DESCRIZIONE2, MyGlb.PANEL_LIST, "Descizione");
    PAN_DL77.SetRect(MyGlb.OBJ_FIELD, PFL_DL77_DESCRIZIONE2, MyGlb.PANEL_FORM, 4, 76, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DL77.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DL77_DESCRIZIONE2, MyGlb.PANEL_FORM, 104);
    PAN_DL77.SetNumRow(MyGlb.OBJ_FIELD, PFL_DL77_DESCRIZIONE2, MyGlb.PANEL_FORM, 2);
    PAN_DL77.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DL77_DESCRIZIONE2, MyGlb.PANEL_FORM, "Descizione");
    PAN_DL77.SetFieldPage(PFL_DL77_DESCRIZIONE2, -1, -1);
    PAN_DL77.SetFieldPanel(PFL_DL77_DESCRIZIONE2, PPQRY_WORCONCONDL8, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_DL77.SetRect(MyGlb.OBJ_FIELD, PFL_DL77_IMPORTO1, MyGlb.PANEL_LIST, 284, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DL77.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DL77_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_DL77.SetNumRow(MyGlb.OBJ_FIELD, PFL_DL77_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_DL77.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DL77_IMPORTO1, MyGlb.PANEL_LIST, "Stanz. Definitivo");
    PAN_DL77.SetRect(MyGlb.OBJ_FIELD, PFL_DL77_IMPORTO1, MyGlb.PANEL_FORM, 4, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DL77.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DL77_IMPORTO1, MyGlb.PANEL_FORM, 104);
    PAN_DL77.SetNumRow(MyGlb.OBJ_FIELD, PFL_DL77_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_DL77.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DL77_IMPORTO1, MyGlb.PANEL_FORM, "Stanz. Definitivo");
    PAN_DL77.SetFieldPage(PFL_DL77_IMPORTO1, -1, -1);
    PAN_DL77.SetFieldPanel(PFL_DL77_IMPORTO1, PPQRY_WORCONCONDL8, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
  }

  private void PAN_DL77_InitQueries()
  {
    StringBuffer SQL;

    PAN_DL77.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DL77.SetIMDB(IMDB, "PQRY_WORCONCONDL8", true);
    PAN_DL77.set_SetString(MyGlb.MASTER_ROWNAME, "WORK CONTO CONS DL77");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.IMPORTO as IMPORTO ");
    PAN_DL77.SetQuery(PPQRY_WORCONCONDL8, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WORK_CONTO_CONS_DL77 A ");
    PAN_DL77.SetQuery(PPQRY_WORCONCONDL8, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO = 'AVA') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_DL77.SetQuery(PPQRY_WORCONCONDL8, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DL77.SetQuery(PPQRY_WORCONCONDL8, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DL77.SetQuery(PPQRY_WORCONCONDL8, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DL77.SetQuery(PPQRY_WORCONCONDL8, 5, SQL, -1, "");
    PAN_DL77.SetQueryDB(PPQRY_WORCONCONDL8, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DL77.SetMasterTable(0, "WORK_CONTO_CONS_DL77");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DL77.Status() == 2)
    {
      int oldListQBE = PAN_DL77.iUseListQBE;
      PAN_DL77.iUseListQBE = 0;
      PAN_DL77.PanelCommand(Glb.PCM_SEARCH);
      PAN_DL77.PanelCommand(Glb.PCM_FIND);
      PAN_DL77.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_AVANZAMMIFPV_Init()
  {

    PAN_AVANZAMMIFPV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_AVANZAMMIFPV.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_AVANZAMMIFPV.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_AVANZAMMIFPV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_PROGRESSIVO, "B3C401F7-8E6C-4521-AA4B-52EB2250344E");
    PAN_AVANZAMMIFPV.set_Header(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_PROGRESSIVO, "PROGRESSIVO");
    PAN_AVANZAMMIFPV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_PROGRESSIVO, "");
    PAN_AVANZAMMIFPV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_AVANZAMMIFPV.SetFlags(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_AVANZAMMIFPV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_ESERCIZIO, "48785797-9065-45FC-A062-E93615412E8F");
    PAN_AVANZAMMIFPV.set_Header(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_ESERCIZIO, "ESERCIZIO");
    PAN_AVANZAMMIFPV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_ESERCIZIO, "");
    PAN_AVANZAMMIFPV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_AVANZAMMIFPV.SetFlags(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_AVANZAMMIFPV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_TIPO, "EA6C467C-BA82-4CA9-ADCF-06C3AD59A1FC");
    PAN_AVANZAMMIFPV.set_Header(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_TIPO, "TIPO");
    PAN_AVANZAMMIFPV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_TIPO, "");
    PAN_AVANZAMMIFPV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_TIPO, MyGlb.VIS_NORMFIELPADR);
    PAN_AVANZAMMIFPV.SetFlags(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_TIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_AVANZAMMIFPV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DESCRIZIONE, "58C1A76E-FFFB-4B1C-B7E2-954C6E956F1C");
    PAN_AVANZAMMIFPV.set_Header(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DESCRIZIONE, "Parte");
    PAN_AVANZAMMIFPV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DESCRIZIONE, "");
    PAN_AVANZAMMIFPV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_AVANZAMMIFPV.SetFlags(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AVANZAMMIFPV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DASPESA, "1567EDB4-6F9B-4ED6-848E-4CA1DB71F655");
    PAN_AVANZAMMIFPV.set_Header(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DASPESA, "Da Spesa");
    PAN_AVANZAMMIFPV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DASPESA, "");
    PAN_AVANZAMMIFPV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DASPESA, MyGlb.VIS_NORFIECF4IMP);
    PAN_AVANZAMMIFPV.SetFlags(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DASPESA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AVANZAMMIFPV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DAESIGIBILIT, "3EEC9DCD-83FA-4F43-AE52-8E2DC6A16CEE");
    PAN_AVANZAMMIFPV.set_Header(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DAESIGIBILIT, "Da Esigibilita");
    PAN_AVANZAMMIFPV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DAESIGIBILIT, "");
    PAN_AVANZAMMIFPV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DAESIGIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_AVANZAMMIFPV.SetFlags(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DAESIGIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AVANZAMMIFPV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DIFFERENZA, "3403B881-9BFD-4129-AF44-63C3E6F6C61E");
    PAN_AVANZAMMIFPV.set_Header(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DIFFERENZA, "Differenza");
    PAN_AVANZAMMIFPV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DIFFERENZA, "");
    PAN_AVANZAMMIFPV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DIFFERENZA, MyGlb.VIS_NORFIECF4IMP);
    PAN_AVANZAMMIFPV.SetFlags(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DIFFERENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AVANZAMMIFPV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_IMPORTO, "B535EBFA-680C-4821-ACFE-1A201D058326");
    PAN_AVANZAMMIFPV.set_Header(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_IMPORTO, "Stanz. Definitivo");
    PAN_AVANZAMMIFPV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_IMPORTO, "");
    PAN_AVANZAMMIFPV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_AVANZAMMIFPV.SetFlags(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_AVANZAMMIFPV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_PROGRESSIVO, MyGlb.PANEL_FORM, 104);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_AVANZAMMIFPV.SetFieldPage(PFL_AVANZAMMIFPV_PROGRESSIVO, -1, -1);
    PAN_AVANZAMMIFPV.SetFieldPanel(PFL_AVANZAMMIFPV_PROGRESSIVO, PPQRY_WORCONCONDL7, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_ESERCIZIO, MyGlb.PANEL_LIST, 56, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_ESERCIZIO, MyGlb.PANEL_FORM, 4, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_ESERCIZIO, MyGlb.PANEL_FORM, 104);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_AVANZAMMIFPV.SetFieldPage(PFL_AVANZAMMIFPV_ESERCIZIO, -1, -1);
    PAN_AVANZAMMIFPV.SetFieldPanel(PFL_AVANZAMMIFPV_ESERCIZIO, PPQRY_WORCONCONDL7, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_TIPO, MyGlb.PANEL_LIST, 104, 36, 104, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_TIPO, MyGlb.PANEL_LIST, 36);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_TIPO, MyGlb.PANEL_FORM, 4, 52, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_TIPO, MyGlb.PANEL_FORM, 104);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_TIPO, MyGlb.PANEL_FORM, "TIPO");
    PAN_AVANZAMMIFPV.SetFieldPage(PFL_AVANZAMMIFPV_TIPO, -1, -1);
    PAN_AVANZAMMIFPV.SetFieldPanel(PFL_AVANZAMMIFPV_TIPO, PPQRY_WORCONCONDL7, "A.TIPO", "TIPO", 5, 20, 0, -13997);
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 252, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DESCRIZIONE, MyGlb.PANEL_LIST, "Parte");
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DESCRIZIONE, MyGlb.PANEL_FORM, 104);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DESCRIZIONE, MyGlb.PANEL_FORM, "Parte");
    PAN_AVANZAMMIFPV.SetFieldPage(PFL_AVANZAMMIFPV_DESCRIZIONE, -1, -1);
    PAN_AVANZAMMIFPV.SetFieldPanel(PFL_AVANZAMMIFPV_DESCRIZIONE, PPQRY_WORCONCONDL7, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DASPESA, MyGlb.PANEL_LIST, 252, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DASPESA, MyGlb.PANEL_LIST, 60);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DASPESA, MyGlb.PANEL_LIST, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DASPESA, MyGlb.PANEL_LIST, "Da Spesa");
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DASPESA, MyGlb.PANEL_FORM, 4, 124, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DASPESA, MyGlb.PANEL_FORM, 60);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DASPESA, MyGlb.PANEL_FORM, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DASPESA, MyGlb.PANEL_FORM, "Da Spesa");
    PAN_AVANZAMMIFPV.SetFieldPage(PFL_AVANZAMMIFPV_DASPESA, -1, -1);
    PAN_AVANZAMMIFPV.SetFieldUnbound(PFL_AVANZAMMIFPV_DASPESA, true);
    PAN_AVANZAMMIFPV.SetFieldPanel(PFL_AVANZAMMIFPV_DASPESA, PPQRY_WORCONCONDL7, "IMPORTI_FPV(A.ESERCIZIO,'S',A.TIPO)", "DASPESA", 3, 28, 6, -13997);
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DAESIGIBILIT, MyGlb.PANEL_LIST, 388, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DAESIGIBILIT, MyGlb.PANEL_LIST, 80);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DAESIGIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DAESIGIBILIT, MyGlb.PANEL_LIST, "Da Esigibilita");
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DAESIGIBILIT, MyGlb.PANEL_FORM, 4, 148, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DAESIGIBILIT, MyGlb.PANEL_FORM, 80);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DAESIGIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DAESIGIBILIT, MyGlb.PANEL_FORM, "Da Esigibilita");
    PAN_AVANZAMMIFPV.SetFieldPage(PFL_AVANZAMMIFPV_DAESIGIBILIT, -1, -1);
    PAN_AVANZAMMIFPV.SetFieldUnbound(PFL_AVANZAMMIFPV_DAESIGIBILIT, true);
    PAN_AVANZAMMIFPV.SetFieldPanel(PFL_AVANZAMMIFPV_DAESIGIBILIT, PPQRY_WORCONCONDL7, "IMPORTI_FPV(A.ESERCIZIO,'E',A.TIPO)", "DAESIGIBILIT", 3, 28, 6, -13997);
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DIFFERENZA, MyGlb.PANEL_LIST, 524, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DIFFERENZA, MyGlb.PANEL_LIST, 68);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DIFFERENZA, MyGlb.PANEL_LIST, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DIFFERENZA, MyGlb.PANEL_LIST, "Differenza");
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DIFFERENZA, MyGlb.PANEL_FORM, 4, 172, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DIFFERENZA, MyGlb.PANEL_FORM, 68);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DIFFERENZA, MyGlb.PANEL_FORM, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_DIFFERENZA, MyGlb.PANEL_FORM, "Differenza");
    PAN_AVANZAMMIFPV.SetFieldPage(PFL_AVANZAMMIFPV_DIFFERENZA, -1, -1);
    PAN_AVANZAMMIFPV.SetFieldUnbound(PFL_AVANZAMMIFPV_DIFFERENZA, true);
    PAN_AVANZAMMIFPV.SetFieldPanel(PFL_AVANZAMMIFPV_DIFFERENZA, PPQRY_WORCONCONDL7, "IMPORTI_FPV(A.ESERCIZIO,'S',A.TIPO) - IMPORTI_FPV(A.ESERCIZIO,'E',A.TIPO)", "DIFFERENZA", 3, 28, 6, -13997);
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_IMPORTO, MyGlb.PANEL_LIST, 660, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_IMPORTO, MyGlb.PANEL_LIST, "Stanz. Definitivo");
    PAN_AVANZAMMIFPV.SetRect(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_IMPORTO, MyGlb.PANEL_FORM, 4, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVANZAMMIFPV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_IMPORTO, MyGlb.PANEL_FORM, 104);
    PAN_AVANZAMMIFPV.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_AVANZAMMIFPV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVANZAMMIFPV_IMPORTO, MyGlb.PANEL_FORM, "Stanz. Definitivo");
    PAN_AVANZAMMIFPV.SetFieldPage(PFL_AVANZAMMIFPV_IMPORTO, -1, -1);
    PAN_AVANZAMMIFPV.SetFieldPanel(PFL_AVANZAMMIFPV_IMPORTO, PPQRY_WORCONCONDL7, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
  }

  private void PAN_AVANZAMMIFPV_InitQueries()
  {
    StringBuffer SQL;

    PAN_AVANZAMMIFPV.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_AVANZAMMIFPV.SetIMDB(IMDB, "PQRY_WORCONCONDL7", true);
    PAN_AVANZAMMIFPV.set_SetString(MyGlb.MASTER_ROWNAME, "WORK CONTO CONS DL77");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  IMPORTI_FPV(A.ESERCIZIO,'S',A.TIPO) as DASPESA, ");
    SQL.append("  IMPORTI_FPV(A.ESERCIZIO,'E',A.TIPO) as DAESIGIBILIT, ");
    SQL.append("  IMPORTI_FPV(A.ESERCIZIO,'S',A.TIPO) - IMPORTI_FPV(A.ESERCIZIO,'E',A.TIPO) as DIFFERENZA, ");
    SQL.append("  A.IMPORTO as IMPORTO ");
    PAN_AVANZAMMIFPV.SetQuery(PPQRY_WORCONCONDL7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WORK_CONTO_CONS_DL77 A ");
    PAN_AVANZAMMIFPV.SetQuery(PPQRY_WORCONCONDL7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO = 'AFPVCOR' OR A.TIPO = 'AFPVCAP') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_AVANZAMMIFPV.SetQuery(PPQRY_WORCONCONDL7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_AVANZAMMIFPV.SetQuery(PPQRY_WORCONCONDL7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_AVANZAMMIFPV.SetQuery(PPQRY_WORCONCONDL7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_AVANZAMMIFPV.SetQuery(PPQRY_WORCONCONDL7, 5, SQL, -1, "");
    PAN_AVANZAMMIFPV.SetQueryDB(PPQRY_WORCONCONDL7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_AVANZAMMIFPV.SetMasterTable(0, "WORK_CONTO_CONS_DL77");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_AVANZAMMIFPV.Status() == 2)
    {
      int oldListQBE = PAN_AVANZAMMIFPV.iUseListQBE;
      PAN_AVANZAMMIFPV.iUseListQBE = 0;
      PAN_AVANZAMMIFPV.PanelCommand(Glb.PCM_SEARCH);
      PAN_AVANZAMMIFPV.PanelCommand(Glb.PCM_FIND);
      PAN_AVANZAMMIFPV.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ARMONIZZAZIO) PAN_ARMONIZZAZIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DL77) PAN_DL77_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_AVANZAMMIFPV) PAN_AVANZAMMIFPV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ARMONIZZAZIO) PAN_ARMONIZZAZIO_ValidateRow(Cancel);
    if (SrcObj == PAN_DL77) PAN_DL77_ValidateRow(Cancel);
    if (SrcObj == PAN_AVANZAMMIFPV) PAN_AVANZAMMIFPV_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ARMONIZZAZIO) PAN_ARMONIZZAZIO_DynamicProperties();
    if (SrcObj == PAN_DL77) PAN_DL77_DynamicProperties();
    if (SrcObj == PAN_AVANZAMMIFPV) PAN_AVANZAMMIFPV_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ARMONIZZAZIO) PAN_ARMONIZZAZIO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DL77) PAN_DL77_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_AVANZAMMIFPV) PAN_AVANZAMMIFPV_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_AVANZAMMIFPV) PAN_AVANZAMMIFPV_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_ARMONIZZAZIO) PAN_ARMONIZZAZIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DL77) PAN_DL77_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_AVANZAMMIFPV) PAN_AVANZAMMIFPV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
