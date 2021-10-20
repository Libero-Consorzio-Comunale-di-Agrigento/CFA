// **********************************************
// Calcolo I V A Ventilata
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CalcoloIVAVentilata extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CALCOIVAVENT_TIPOREGISTO = 0;
  private static int PFL_CALCOIVAVENT_TIPOBOLLATO = 1;
  private static int PFL_CALCOIVAVENT_ANNO = 2;
  private static int PFL_CALCOIVAVENT_DATADA = 3;
  private static int PFL_CALCOIVAVENT_DATAA = 4;
  private static int PFL_CALCOIVAVENT_RICAPERDIINC = 5;
  private static int PFL_CALCOIVAVENT_ELABORA = 6;

  private static int PPQRY_NEWTABLE37 = 0;


  IDPanel PAN_CALCOIVAVENT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE38(IMDB);
    //
    //
    Init_PQRY_NEWTABLE37(IMDB);
    Init_PQRY_NEWTABLE37_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE38(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_NEWTABLE38, 6);
    IMDB.set_TblCode(IMDBDef2.TBL_NEWTABLE38, "TBL_NEWTABLE38");
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE38,IMDBDef2.FLD_NEWTABLE38_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE38,IMDBDef2.FLD_NEWTABLE38_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE38,IMDBDef2.FLD_NEWTABLE38_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE38,IMDBDef2.FLD_NEWTABLE38_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE38,IMDBDef2.FLD_NEWTABLE38_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE38,IMDBDef2.FLD_NEWTABLE38_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE38,IMDBDef2.FLD_NEWTABLE38_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE38,IMDBDef2.FLD_NEWTABLE38_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE38,IMDBDef2.FLD_NEWTABLE38_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE38,IMDBDef2.FLD_NEWTABLE38_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE38,IMDBDef2.FLD_NEWTABLE38_RONARIPEDIIN, "RONARIPEDIIN");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE38,IMDBDef2.FLD_NEWTABLE38_RONARIPEDIIN,1,1,0);
    IMDB.TblAddNew(IMDBDef2.TBL_NEWTABLE38, 0);
  }

  private static void Init_PQRY_NEWTABLE37(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_NEWTABLE37, 6);
    IMDB.set_TblCode(IMDBDef10.PQRY_NEWTABLE37, "PQRY_NEWTABLE37");
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE37,IMDBDef10.PQSL_NEWTABLE37_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE37,IMDBDef10.PQSL_NEWTABLE37_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE37,IMDBDef10.PQSL_NEWTABLE37_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE37,IMDBDef10.PQSL_NEWTABLE37_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE37,IMDBDef10.PQSL_NEWTABLE37_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE37,IMDBDef10.PQSL_NEWTABLE37_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE37,IMDBDef10.PQSL_NEWTABLE37_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE37,IMDBDef10.PQSL_NEWTABLE37_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE37,IMDBDef10.PQSL_NEWTABLE37_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE37,IMDBDef10.PQSL_NEWTABLE37_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE37,IMDBDef10.PQSL_NEWTABLE37_RONARIPEDIIN, "RONARIPEDIIN");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE37,IMDBDef10.PQSL_NEWTABLE37_RONARIPEDIIN,1,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_NEWTABLE37, 0);
  }

  private static void Init_PQRY_NEWTABLE37_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_NEWTABLE37_RS, 6);
    IMDB.set_TblCode(IMDBDef10.PQRY_NEWTABLE37_RS, "PQRY_NEWTABLE37_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE37_RS,IMDBDef10.PQSL_NEWTABLE37_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE37_RS,IMDBDef10.PQSL_NEWTABLE37_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE37_RS,IMDBDef10.PQSL_NEWTABLE37_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE37_RS,IMDBDef10.PQSL_NEWTABLE37_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE37_RS,IMDBDef10.PQSL_NEWTABLE37_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE37_RS,IMDBDef10.PQSL_NEWTABLE37_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE37_RS,IMDBDef10.PQSL_NEWTABLE37_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE37_RS,IMDBDef10.PQSL_NEWTABLE37_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE37_RS,IMDBDef10.PQSL_NEWTABLE37_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE37_RS,IMDBDef10.PQSL_NEWTABLE37_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE37_RS,IMDBDef10.PQSL_NEWTABLE37_RONARIPEDIIN, "RONARIPEDIIN");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE37_RS,IMDBDef10.PQSL_NEWTABLE37_RONARIPEDIIN,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CalcoloIVAVentilata(MyWebEntryPoint w, IMDBObj imdb)
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
  public CalcoloIVAVentilata()
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
    FormIdx = MyGlb.FRM_CALCOIVAVENT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DBDE548B-C35E-4FBE-9977-3C21543C4A56";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 324;
    DesignHeight = 170;
    set_Caption(new IDVariant("Calcolo I V A Ventilata"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 324;
    Frames[1].Height = 144;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Calcolo I V A Ventilata";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 144;
    PAN_CALCOIVAVENT = new IDPanel(w, this, 1, "PAN_CALCOIVAVENT");
    Frames[1].Content = PAN_CALCOIVAVENT;
    PAN_CALCOIVAVENT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CALCOIVAVENT.VS = MainFrm.VisualStyleList;
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 324-MyGlb.PAN_OFFS_X, 144-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CALCOIVAVENT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B5B655B5-5295-41FA-86F4-1AFF5B83C95D");
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 48, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CALCOIVAVENT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CALCOIVAVENT.InitStatus = 2;
    PAN_CALCOIVAVENT_Init();
    PAN_CALCOIVAVENT_InitFields();
    PAN_CALCOIVAVENT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_NEWTABLE38, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CALCOIVAVENT_NEWTABLE37();
      }
      PAN_CALCOIVAVENT.UpdatePanel(MainFrm);
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
    return (obj instanceof CalcoloIVAVentilata);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CalcoloIVAVentilata.class.getName() : (Glb.ClassWithPackage(CalcoloIVAVentilata.class) ? CalcoloIVAVentilata.class.getName().substring(CalcoloIVAVentilata.class.getPackage().getName().length() + 1) : CalcoloIVAVentilata.class.getName()));
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
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Calcolo I.V.A. Ventilata", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAP));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE38, IMDBDef2.FLD_NEWTABLE38_RONARIPEDIIN, 0, (new IDVariant(1)));
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoloIVAVentilata", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.CALCOLOVENTILAZIONE(IMDB.Value(IMDBDef10.PQRY_NEWTABLE37, IMDBDef10.PQSL_NEWTABLE37_ROWNAMTIPREG, 0), IMDB.Value(IMDBDef10.PQRY_NEWTABLE37, IMDBDef10.PQSL_NEWTABLE37_ROWNAMTIPBOL, 0), IMDB.Value(IMDBDef10.PQRY_NEWTABLE37, IMDBDef10.PQSL_NEWTABLE37_ROWNAMEANNO, 0), IDL.Month(IMDB.Value(IMDBDef10.PQRY_NEWTABLE37, IMDBDef10.PQSL_NEWTABLE37_ROWNAMEDATDA, 0)), IDL.Month(IMDB.Value(IMDBDef10.PQRY_NEWTABLE37, IMDBDef10.PQSL_NEWTABLE37_ROWNAMEDATAA, 0)), IMDB.Value(IMDBDef10.PQRY_NEWTABLE37, IMDBDef10.PQSL_NEWTABLE37_RONARIPEDIIN, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoloIVAVentilata", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void CALCOIVAVENT_NEWTABLE37() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_NEWTABLE37_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_NEWTABLE38, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_NEWTABLE38, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_NEWTABLE37_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_NEWTABLE37_RS, 0, IMDBDef2.TBL_NEWTABLE38, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE37_RS, 0, 0, IMDBDef2.TBL_NEWTABLE38, IMDBDef2.FLD_NEWTABLE38_ROWNAMTIPREG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE37_RS, 1, 0, IMDBDef2.TBL_NEWTABLE38, IMDBDef2.FLD_NEWTABLE38_ROWNAMTIPBOL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE37_RS, 2, 0, IMDBDef2.TBL_NEWTABLE38, IMDBDef2.FLD_NEWTABLE38_ROWNAMEANNO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE37_RS, 3, 0, IMDBDef2.TBL_NEWTABLE38, IMDBDef2.FLD_NEWTABLE38_ROWNAMEDATDA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE37_RS, 4, 0, IMDBDef2.TBL_NEWTABLE38, IMDBDef2.FLD_NEWTABLE38_ROWNAMEDATAA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE37_RS, 5, 0, IMDBDef2.TBL_NEWTABLE38, IMDBDef2.FLD_NEWTABLE38_RONARIPEDIIN, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_NEWTABLE38, 0);
      if (IMDB.Eof(IMDBDef2.TBL_NEWTABLE38, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_NEWTABLE38, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_NEWTABLE37_RS, 0);
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
  private void PAN_CALCOIVAVENT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CALCOIVAVENT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CALCOIVAVENT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CALCOIVAVENT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CALCOIVAVENT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CALCOIVAVENT);
    // Stub
  }

  private void PAN_CALCOIVAVENT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CALCOIVAVENT_ELABORA)
    {
      this.IdxPanelActived = this.PAN_CALCOIVAVENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CALCOIVAVENT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CALCOIVAVENT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CALCOIVAVENT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CALCOIVAVENT_Init()
  {

    PAN_CALCOIVAVENT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CALCOIVAVENT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CALCOIVAVENT.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_CALCOIVAVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOREGISTO, "789FB89A-A51D-4B27-96C2-A508213028A6");
    PAN_CALCOIVAVENT.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOREGISTO, "Tipo Registo");
    PAN_CALCOIVAVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOREGISTO, "");
    PAN_CALCOIVAVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOREGISTO, MyGlb.VIS_NORMFIELPADR);
    PAN_CALCOIVAVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOREGISTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CALCOIVAVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOBOLLATO, "7AF43E01-331E-4B50-ABAC-73120B987691");
    PAN_CALCOIVAVENT.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOBOLLATO, "Tipo Bollato");
    PAN_CALCOIVAVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOBOLLATO, "");
    PAN_CALCOIVAVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOBOLLATO, MyGlb.VIS_NORMFIELPADR);
    PAN_CALCOIVAVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOBOLLATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CALCOIVAVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ANNO, "26E1D511-3B96-4597-8EA7-1060E9E289DA");
    PAN_CALCOIVAVENT.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ANNO, "Anno");
    PAN_CALCOIVAVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ANNO, "");
    PAN_CALCOIVAVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ANNO, MyGlb.VIS_NORMFIELPADR);
    PAN_CALCOIVAVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ANNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CALCOIVAVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATADA, "01C34731-DCCC-4C58-88EC-88F7DCA35050");
    PAN_CALCOIVAVENT.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATADA, "Data Da");
    PAN_CALCOIVAVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATADA, "");
    PAN_CALCOIVAVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATADA, MyGlb.VIS_NORMFIELPADR);
    PAN_CALCOIVAVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATADA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CALCOIVAVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATAA, "C952632F-B27E-47F1-8916-67C931D576BC");
    PAN_CALCOIVAVENT.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATAA, "Data A");
    PAN_CALCOIVAVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATAA, "");
    PAN_CALCOIVAVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATAA, MyGlb.VIS_NORMFIELPADR);
    PAN_CALCOIVAVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATAA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CALCOIVAVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_RICAPERDIINC, "33EC989B-7F20-4CF8-80D6-DD09EB1A54EA");
    PAN_CALCOIVAVENT.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_RICAPERDIINC, "Ricalcolo Percentuali Di Incidenza");
    PAN_CALCOIVAVENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_RICAPERDIINC, "");
    PAN_CALCOIVAVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_RICAPERDIINC, MyGlb.VIS_CHECKSTYLE);
    PAN_CALCOIVAVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_RICAPERDIINC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CALCOIVAVENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ELABORA, "D7D2D161-41C9-434A-AD02-7DB5E4E80DFA");
    PAN_CALCOIVAVENT.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ELABORA, "Elabora");
    PAN_CALCOIVAVENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_CALCOIVAVENT.SetImage(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ELABORA, 0, "button1.gif", false);
    PAN_CALCOIVAVENT.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_CALCOIVAVENT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOREGISTO, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOREGISTO, MyGlb.PANEL_LIST, 68);
    PAN_CALCOIVAVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOREGISTO, MyGlb.PANEL_LIST, 1);
    PAN_CALCOIVAVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOREGISTO, MyGlb.PANEL_LIST, "Tipo Registo");
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOREGISTO, MyGlb.PANEL_FORM, 4, 4, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOREGISTO, MyGlb.PANEL_FORM, 160);
    PAN_CALCOIVAVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOREGISTO, MyGlb.PANEL_FORM, 1);
    PAN_CALCOIVAVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOREGISTO, MyGlb.PANEL_FORM, "Tipo Registo");
    PAN_CALCOIVAVENT.SetFieldPage(PFL_CALCOIVAVENT_TIPOREGISTO, -1, -1);
    PAN_CALCOIVAVENT.SetFieldPanel(PFL_CALCOIVAVENT_TIPOREGISTO, PPQRY_NEWTABLE37, "A.ROWNAMTIPREG", "ROWNAMTIPREG", 1, 1, 0, -13997);
    PAN_CALCOIVAVENT.SetValueListItem(PFL_CALCOIVAVENT_TIPOREGISTO, (new IDVariant(1)), "1 - Acquisti", "", "", -1);
    PAN_CALCOIVAVENT.SetValueListItem(PFL_CALCOIVAVENT_TIPOREGISTO, (new IDVariant(2)), "2 - Acquisti in Attesa di Esigibilità", "", "", -1);
    PAN_CALCOIVAVENT.SetValueListItem(PFL_CALCOIVAVENT_TIPOREGISTO, (new IDVariant(3)), "3 - Vendite", "", "", -1);
    PAN_CALCOIVAVENT.SetValueListItem(PFL_CALCOIVAVENT_TIPOREGISTO, (new IDVariant(4)), "4 - Corrispettivi", "", "", -1);
    PAN_CALCOIVAVENT.SetValueListItem(PFL_CALCOIVAVENT_TIPOREGISTO, (new IDVariant(5)), "5 - Vendite Esigibili al Pagamento", "", "", -1);
    PAN_CALCOIVAVENT.SetValueListItem(PFL_CALCOIVAVENT_TIPOREGISTO, (new IDVariant(6)), "6 - Vendite Debitori non Codificati", "", "", -1);
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOBOLLATO, MyGlb.PANEL_LIST, 184, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOBOLLATO, MyGlb.PANEL_LIST, 64);
    PAN_CALCOIVAVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_CALCOIVAVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOBOLLATO, MyGlb.PANEL_LIST, "Tp. Boll.");
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOBOLLATO, MyGlb.PANEL_FORM, 4, 28, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOBOLLATO, MyGlb.PANEL_FORM, 160);
    PAN_CALCOIVAVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_CALCOIVAVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_TIPOBOLLATO, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_CALCOIVAVENT.SetFieldPage(PFL_CALCOIVAVENT_TIPOBOLLATO, -1, -1);
    PAN_CALCOIVAVENT.SetFieldPanel(PFL_CALCOIVAVENT_TIPOBOLLATO, PPQRY_NEWTABLE37, "A.ROWNAMTIPBOL", "ROWNAMTIPBOL", 1, 2, 0, -13997);
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ANNO, MyGlb.PANEL_LIST, 224, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ANNO, MyGlb.PANEL_LIST, 36);
    PAN_CALCOIVAVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_CALCOIVAVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ANNO, MyGlb.PANEL_FORM, 4, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ANNO, MyGlb.PANEL_FORM, 160);
    PAN_CALCOIVAVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_CALCOIVAVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_CALCOIVAVENT.SetFieldPage(PFL_CALCOIVAVENT_ANNO, -1, -1);
    PAN_CALCOIVAVENT.SetFieldPanel(PFL_CALCOIVAVENT_ANNO, PPQRY_NEWTABLE37, "A.ROWNAMEANNO", "ROWNAMEANNO", 1, 4, 0, -13997);
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATADA, MyGlb.PANEL_LIST, 264, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATADA, MyGlb.PANEL_LIST, 48);
    PAN_CALCOIVAVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATADA, MyGlb.PANEL_LIST, 1);
    PAN_CALCOIVAVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATADA, MyGlb.PANEL_LIST, "Data Da");
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATADA, MyGlb.PANEL_FORM, 4, 76, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATADA, MyGlb.PANEL_FORM, 160);
    PAN_CALCOIVAVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATADA, MyGlb.PANEL_FORM, 1);
    PAN_CALCOIVAVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATADA, MyGlb.PANEL_FORM, "Data Da");
    PAN_CALCOIVAVENT.SetFieldPage(PFL_CALCOIVAVENT_DATADA, -1, -1);
    PAN_CALCOIVAVENT.SetFieldPanel(PFL_CALCOIVAVENT_DATADA, PPQRY_NEWTABLE37, "A.ROWNAMEDATDA", "ROWNAMEDATDA", 6, 14, 0, -13997);
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATAA, MyGlb.PANEL_LIST, 368, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATAA, MyGlb.PANEL_LIST, 44);
    PAN_CALCOIVAVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATAA, MyGlb.PANEL_LIST, 1);
    PAN_CALCOIVAVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATAA, MyGlb.PANEL_LIST, "Data A");
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATAA, MyGlb.PANEL_FORM, 4, 100, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATAA, MyGlb.PANEL_FORM, 160);
    PAN_CALCOIVAVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATAA, MyGlb.PANEL_FORM, 1);
    PAN_CALCOIVAVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_DATAA, MyGlb.PANEL_FORM, "Data A");
    PAN_CALCOIVAVENT.SetFieldPage(PFL_CALCOIVAVENT_DATAA, -1, -1);
    PAN_CALCOIVAVENT.SetFieldPanel(PFL_CALCOIVAVENT_DATAA, PPQRY_NEWTABLE37, "A.ROWNAMEDATAA", "ROWNAMEDATAA", 6, 14, 0, -13997);
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_RICAPERDIINC, MyGlb.PANEL_LIST, 472, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_RICAPERDIINC, MyGlb.PANEL_LIST, 168);
    PAN_CALCOIVAVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_RICAPERDIINC, MyGlb.PANEL_LIST, 1);
    PAN_CALCOIVAVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_RICAPERDIINC, MyGlb.PANEL_LIST, "Rc. Prc. D. Inc.");
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_RICAPERDIINC, MyGlb.PANEL_FORM, 8, 8, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_RICAPERDIINC, MyGlb.PANEL_FORM, 204);
    PAN_CALCOIVAVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_RICAPERDIINC, MyGlb.PANEL_FORM, 1);
    PAN_CALCOIVAVENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_RICAPERDIINC, MyGlb.PANEL_FORM, "Ricalcolo Percentuali Di Incidenza");
    PAN_CALCOIVAVENT.SetFieldPage(PFL_CALCOIVAVENT_RICAPERDIINC, -1, -1);
    PAN_CALCOIVAVENT.SetFieldPanel(PFL_CALCOIVAVENT_RICAPERDIINC, PPQRY_NEWTABLE37, "A.RONARIPEDIIN", "RONARIPEDIIN", 1, 1, 0, -13997);
    PAN_CALCOIVAVENT.SetValueListItem(PFL_CALCOIVAVENT_RICAPERDIINC, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_CALCOIVAVENT.SetValueListItem(PFL_CALCOIVAVENT_RICAPERDIINC, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ELABORA, MyGlb.PANEL_LIST, 128, 36, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_CALCOIVAVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_CALCOIVAVENT.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ELABORA, MyGlb.PANEL_FORM, 156, 44, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOIVAVENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_CALCOIVAVENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOIVAVENT_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_CALCOIVAVENT.SetFieldPage(PFL_CALCOIVAVENT_ELABORA, -1, -1);
    PAN_CALCOIVAVENT.SetFieldPanel(PFL_CALCOIVAVENT_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_CALCOIVAVENT_InitQueries()
  {
    StringBuffer SQL;

    PAN_CALCOIVAVENT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CALCOIVAVENT.SetIMDB(IMDB, "PQRY_NEWTABLE37", true);
    PAN_CALCOIVAVENT.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_CALCOIVAVENT.SetQueryIMDB(PPQRY_NEWTABLE37, IMDBDef10.PQRY_NEWTABLE37_RS, IMDBDef2.TBL_NEWTABLE38);
    JustLoaded = true;
    PAN_CALCOIVAVENT.SetFieldPrimaryIndex(PFL_CALCOIVAVENT_TIPOREGISTO, IMDBDef2.FLD_NEWTABLE38_ROWNAMTIPREG);
    PAN_CALCOIVAVENT.SetFieldPrimaryIndex(PFL_CALCOIVAVENT_TIPOBOLLATO, IMDBDef2.FLD_NEWTABLE38_ROWNAMTIPBOL);
    PAN_CALCOIVAVENT.SetFieldPrimaryIndex(PFL_CALCOIVAVENT_ANNO, IMDBDef2.FLD_NEWTABLE38_ROWNAMEANNO);
    PAN_CALCOIVAVENT.SetFieldPrimaryIndex(PFL_CALCOIVAVENT_DATADA, IMDBDef2.FLD_NEWTABLE38_ROWNAMEDATDA);
    PAN_CALCOIVAVENT.SetFieldPrimaryIndex(PFL_CALCOIVAVENT_DATAA, IMDBDef2.FLD_NEWTABLE38_ROWNAMEDATAA);
    PAN_CALCOIVAVENT.SetFieldPrimaryIndex(PFL_CALCOIVAVENT_RICAPERDIINC, IMDBDef2.FLD_NEWTABLE38_RONARIPEDIIN);
    PAN_CALCOIVAVENT.SetMasterTable(0, "NEWTABLE38");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CALCOIVAVENT.Status() == 2)
    {
      int oldListQBE = PAN_CALCOIVAVENT.iUseListQBE;
      PAN_CALCOIVAVENT.iUseListQBE = 0;
      PAN_CALCOIVAVENT.PanelCommand(Glb.PCM_SEARCH);
      PAN_CALCOIVAVENT.PanelCommand(Glb.PCM_FIND);
      PAN_CALCOIVAVENT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CALCOIVAVENT) PAN_CALCOIVAVENT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CALCOIVAVENT) PAN_CALCOIVAVENT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CALCOIVAVENT) PAN_CALCOIVAVENT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CALCOIVAVENT) PAN_CALCOIVAVENT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CALCOIVAVENT) PAN_CALCOIVAVENT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
