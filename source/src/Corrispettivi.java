// **********************************************
// Corrispettivi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Corrispettivi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_DATACORRISPE = 0;

  private static int PFL_PARAMETRI_DAL = 0;
  private static int PFL_PARAMETRI_AL = 1;
  private static int PFL_PARAMETRI_NEWPANELLABE = 2;
  private static int PFL_PARAMETRI_BOLLATO = 3;
  private static int PFL_PARAMETRI_DATAELABORAZ = 4;
  private static int PFL_PARAMETRI_ELABORA = 5;

  private static int PPQRY_DATACORRIDAL = 0;

  private static int PPQRY_T04 = 1;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI130(IMDB);
    //
    //
    Init_PQRY_DATACORRIDAL(IMDB);
    Init_PQRY_DATACORRIDAL_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI130(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI130, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI130, "TBL_PARAMETRI130");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI130,IMDBDef2.FLD_PARAMETRI130_ROWNAMDACODA, "ROWNAMDACODA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI130,IMDBDef2.FLD_PARAMETRI130_ROWNAMDACODA,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI130,IMDBDef2.FLD_PARAMETRI130_ROWNAMDACOAL, "ROWNAMDACOAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI130,IMDBDef2.FLD_PARAMETRI130_ROWNAMDACOAL,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI130,IMDBDef2.FLD_PARAMETRI130_ROWNAMEBOLLA, "ROWNAMEBOLLA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI130,IMDBDef2.FLD_PARAMETRI130_ROWNAMEBOLLA,1,3,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI130,IMDBDef2.FLD_PARAMETRI130_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI130,IMDBDef2.FLD_PARAMETRI130_ROWNAMDATELA,6,4,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI130, 0);
  }

  private static void Init_PQRY_DATACORRIDAL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_DATACORRIDAL, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_DATACORRIDAL, "PQRY_DATACORRIDAL");
    IMDB.set_FldCode(IMDBDef9.PQRY_DATACORRIDAL,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDACODA, "ROWNAMDACODA");
    IMDB.SetFldParams(IMDBDef9.PQRY_DATACORRIDAL,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDACODA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DATACORRIDAL,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDACOAL, "ROWNAMDACOAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DATACORRIDAL,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDACOAL,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DATACORRIDAL,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMEBOLLA, "ROWNAMEBOLLA");
    IMDB.SetFldParams(IMDBDef9.PQRY_DATACORRIDAL,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMEBOLLA,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DATACORRIDAL,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef9.PQRY_DATACORRIDAL,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDATELA,6,4,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_DATACORRIDAL, 0);
  }

  private static void Init_PQRY_DATACORRIDAL_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_DATACORRIDAL_RS, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_DATACORRIDAL_RS, "PQRY_DATACORRIDAL_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_DATACORRIDAL_RS,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDACODA, "ROWNAMDACODA");
    IMDB.SetFldParams(IMDBDef9.PQRY_DATACORRIDAL_RS,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDACODA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DATACORRIDAL_RS,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDACOAL, "ROWNAMDACOAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DATACORRIDAL_RS,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDACOAL,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DATACORRIDAL_RS,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMEBOLLA, "ROWNAMEBOLLA");
    IMDB.SetFldParams(IMDBDef9.PQRY_DATACORRIDAL_RS,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMEBOLLA,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DATACORRIDAL_RS,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef9.PQRY_DATACORRIDAL_RS,IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDATELA,6,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Corrispettivi(MyWebEntryPoint w, IMDBObj imdb)
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
  public Corrispettivi()
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
    FormIdx = MyGlb.FRM_CORRISPETTIV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CFC8416B-9629-4118-B6D8-D653DA2D216F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 348;
    DesignHeight = 222;
    set_Caption(new IDVariant("Corrispettivi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 348;
    Frames[1].Height = 196;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 196;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 348-MyGlb.PAN_OFFS_X, 196-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BFCAB013-7326-4ADE-84DF-5F8C697EFB2B");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 568, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI130, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CORRISPETTIV_DATACORRIDAL();
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
    return (obj instanceof Corrispettivi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Corrispettivi.class.getName() : (Glb.ClassWithPackage(Corrispettivi.class) ? Corrispettivi.class.getName().substring(Corrispettivi.class.getPackage().getName().length() + 1) : Corrispettivi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      // 
      // valido campi
      // 
      {
        if (IMDB.Value(IMDBDef9.PQRY_DATACORRIDAL, IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDACODA, 0).compareTo(IMDB.Value(IMDBDef9.PQRY_DATACORRIDAL, IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDACOAL, 0), true)>0 || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_DATACORRIDAL, IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDACODA, 0)))
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Invalidazione date di ricerca: possibile incoerenza nei dati di ricerca per data", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return 0;
        }
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Corrispettivi"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DAL")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_DATACORRIDAL, IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDACODA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_AL")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_DATACORRIDAL, IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDACOAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATAELAB")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_DATACORRIDAL, IMDBDef9.PQSL_DATACORRIDAL_ROWNAMDATELA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_BOLLATO")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_DATACORRIDAL, IMDBDef9.PQSL_DATACORRIDAL_ROWNAMEBOLLA, 0),(new IDVariant(0)))));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Corrispettivi", "Elabora", _e);
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
      v_NOMECAPTION = (new IDVariant("Corrispettivi", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI130, IMDBDef2.FLD_PARAMETRI130_ROWNAMDACODA, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI130, IMDBDef2.FLD_PARAMETRI130_ROWNAMDACOAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI130, IMDBDef2.FLD_PARAMETRI130_ROWNAMEBOLLA, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI130, IMDBDef2.FLD_PARAMETRI130_ROWNAMDATELA, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Corrispettivi", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI130, IMDBDef2.FLD_PARAMETRI130_ROWNAMDACODA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI130, IMDBDef2.FLD_PARAMETRI130_ROWNAMDACOAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI130, IMDBDef2.FLD_PARAMETRI130_ROWNAMEBOLLA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI130, IMDBDef2.FLD_PARAMETRI130_ROWNAMDATELA, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Corrispettivi", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Data Corrispettivi Dal
  // Primary record source for panel data
  // **********************************************************************
  private void CORRISPETTIV_DATACORRIDAL() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_DATACORRIDAL_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI130, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI130, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_DATACORRIDAL_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_DATACORRIDAL_RS, 0, IMDBDef2.TBL_PARAMETRI130, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DATACORRIDAL_RS, 0, 0, IMDBDef2.TBL_PARAMETRI130, IMDBDef2.FLD_PARAMETRI130_ROWNAMDACODA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DATACORRIDAL_RS, 1, 0, IMDBDef2.TBL_PARAMETRI130, IMDBDef2.FLD_PARAMETRI130_ROWNAMDACOAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DATACORRIDAL_RS, 2, 0, IMDBDef2.TBL_PARAMETRI130, IMDBDef2.FLD_PARAMETRI130_ROWNAMEBOLLA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DATACORRIDAL_RS, 3, 0, IMDBDef2.TBL_PARAMETRI130, IMDBDef2.FLD_PARAMETRI130_ROWNAMDATELA, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI130, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI130, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI130, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_DATACORRIDAL_RS, 0);
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
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
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATACORRISPE, "B88743A2-3FA3-41FC-8208-5AF81EFFC21C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATACORRISPE, "Data Corrispettivi");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATACORRISPE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATACORRISPE, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATACORRISPE, MyGlb.PANEL_LIST, 0, -9999, 480, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATACORRISPE, MyGlb.PANEL_FORM, 44, 7, 272, 53, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATACORRISPE, 0, 100);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATACORRISPE, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATACORRISPE, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATACORRISPE, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATACORRISPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "DE84FA00-EE59-442E-A623-E3ACC9DCBC5E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "FF7A4633-7F7F-4F8F-87CC-72A400AA10FD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "40541117-3B72-4BD7-B229-76CC888A432D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLATO, "A08AFA09-F4E1-40DF-BDCB-3496B7CB59F3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLATO, "Bollato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLATO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLATO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "7B210475-0866-41DD-9895-373AC344B793");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "37A9FBD4-DC89-4357-BA72-D0A801053F01");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 0, 36, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 84, 32, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_DATACORRISPE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_DATACORRIDAL, "A.ROWNAMDACODA", "ROWNAMDACODA", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 240, 36, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 200, 32, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_DATACORRISPE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_DATACORRIDAL, "A.ROWNAMDACOAL", "ROWNAMDACOAL", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 204, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 48, 44, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLABE, -1, GRP_PARAMETRI_DATACORRISPE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLATO, MyGlb.PANEL_LIST, 480, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLATO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLATO, MyGlb.PANEL_LIST, "Bollato");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLATO, MyGlb.PANEL_FORM, 64, 64, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLATO, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLATO, MyGlb.PANEL_FORM, "Bollato");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BOLLATO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BOLLATO, PPQRY_DATACORRIDAL, "A.ROWNAMEBOLLA", "ROWNAMEBOLLA", 1, 3, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 528, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Dt. Elab.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 0, 88, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_DATACORRIDAL, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 304, 136, 80, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 228, 136, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_BOLLATO = ~~ROWNAMEBOLLA~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = 4) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  0, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEBOLLA~~ = 0) ");
    PAN_PARAMETRI.SetQuery(PPQRY_T04, 0, SQL, PFL_PARAMETRI_BOLLATO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = 4) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  0, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    PAN_PARAMETRI.SetQuery(PPQRY_T04, 1, SQL, PFL_PARAMETRI_BOLLATO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_DATACORRIDAL", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_DATACORRIDAL, IMDBDef9.PQRY_DATACORRIDAL_RS, IMDBDef2.TBL_PARAMETRI130);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef2.FLD_PARAMETRI130_ROWNAMDACODA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef2.FLD_PARAMETRI130_ROWNAMDACOAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_BOLLATO, IMDBDef2.FLD_PARAMETRI130_ROWNAMEBOLLA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef2.FLD_PARAMETRI130_ROWNAMDATELA);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI130");
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
