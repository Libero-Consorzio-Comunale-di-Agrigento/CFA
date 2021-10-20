// **********************************************
// Numerazione I V A
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class NumerazioneIVA extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_NUMERAZIONE_ESERCIZIO = 0;
  private static int PFL_NUMERAZIONE_REGISTRO = 1;
  private static int PFL_NUMERAZIONE_BOLLATO = 2;
  private static int PFL_NUMERAZIONE_DALMESE = 3;
  private static int PFL_NUMERAZIONE_TIPOBOLLATO = 4;
  private static int PFL_NUMERAZIONE_ELABORA = 5;

  private static int PPQRY_NUMERAZIOIV1 = 0;

  private static int PPQRY_TIPOBOLLATO = 1;


  IDPanel PAN_NUMERAZIONE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NUMERAZIOIV3(IMDB);
    //
    //
    Init_PQRY_NUMERAZIOIV1(IMDB);
    Init_PQRY_NUMERAZIOIV1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NUMERAZIOIV3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_NUMERAZIOIV3, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_NUMERAZIOIV3, "TBL_NUMERAZIOIV3");
    IMDB.set_FldCode(IMDBDef2.TBL_NUMERAZIOIV3,IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef2.TBL_NUMERAZIOIV3,IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NUMERAZIOIV3,IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_NUMERAZIOIV3,IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NUMERAZIOIV3,IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMDALMES, "ROWNAMDALMES");
    IMDB.SetFldParams(IMDBDef2.TBL_NUMERAZIOIV3,IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMDALMES,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NUMERAZIOIV3,IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_NUMERAZIOIV3,IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMTIPBOL,1,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_NUMERAZIOIV3, 0);
  }

  private static void Init_PQRY_NUMERAZIOIV1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_NUMERAZIOIV1, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_NUMERAZIOIV1, "PQRY_NUMERAZIOIV1");
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV1,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV1,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV1,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV1,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV1,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMDALMES, "ROWNAMDALMES");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV1,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMDALMES,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV1,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV1,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMTIPBOL,1,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_NUMERAZIOIV1, 0);
  }

  private static void Init_PQRY_NUMERAZIOIV1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_NUMERAZIOIV1_RS, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_NUMERAZIOIV1_RS, "PQRY_NUMERAZIOIV1_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV1_RS,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV1_RS,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV1_RS,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV1_RS,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV1_RS,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMDALMES, "ROWNAMDALMES");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV1_RS,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMDALMES,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NUMERAZIOIV1_RS,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef10.PQRY_NUMERAZIOIV1_RS,IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMTIPBOL,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public NumerazioneIVA(MyWebEntryPoint w, IMDBObj imdb)
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
  public NumerazioneIVA()
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
    FormIdx = MyGlb.FRM_NUMERAZIOIVA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "53D812CA-C8C2-4DBE-B888-AFE45922357E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 380;
    DesignHeight = 246;
    set_Caption(new IDVariant("Numerazione I V A"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 380;
    Frames[1].Height = 220;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Numerazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 220;
    PAN_NUMERAZIONE = new IDPanel(w, this, 1, "PAN_NUMERAZIONE");
    Frames[1].Content = PAN_NUMERAZIONE;
    PAN_NUMERAZIONE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NUMERAZIONE.VS = MainFrm.VisualStyleList;
    PAN_NUMERAZIONE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 380-MyGlb.PAN_OFFS_X, 220-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NUMERAZIONE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "124620D2-D616-4BF3-919A-CF31443ADD72");
    PAN_NUMERAZIONE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 408, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUMERAZIONE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NUMERAZIONE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NUMERAZIONE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NUMERAZIONE.InitStatus = 2;
    PAN_NUMERAZIONE_Init();
    PAN_NUMERAZIONE_InitFields();
    PAN_NUMERAZIONE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_NUMERAZIOIV3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        NUMERAZIOIVA_NUMERAZIOIV1();
      }
      PAN_NUMERAZIONE.UpdatePanel(MainFrm);
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
    return (obj instanceof NumerazioneIVA);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? NumerazioneIVA.class.getName() : (Glb.ClassWithPackage(NumerazioneIVA.class) ? NumerazioneIVA.class.getName().substring(NumerazioneIVA.class.getPackage().getName().length() + 1) : NumerazioneIVA.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Numerazione On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NUMERAZIONE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_NUMERAZIONE);
      // 
      // Numerazione On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_NUMERAZIONE.set_ToolTip(Glb.OBJ_FIELD,PFL_NUMERAZIONE_REGISTRO,(new IDVariant(PAN_NUMERAZIONE.FieldText(PFL_NUMERAZIONE_REGISTRO))).stringValue()); 
      PAN_NUMERAZIONE.set_ToolTip(Glb.OBJ_FIELD,PFL_NUMERAZIONE_BOLLATO,(new IDVariant(PAN_NUMERAZIONE.FieldText(PFL_NUMERAZIONE_BOLLATO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NumerazioneIVA", "NumerazioneOnDynamicPropertiesEvent", _e);
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
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Numerazione I.V.A.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAP));
      set_bVisualFlag(Glb.FORMVISPROP_CONFIRMBTN, (new IDVariant(0)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NumerazioneIVA", "LoadEvent", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_NUMERAZIOIV1, IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMDALMES, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Indicare un Mese", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        IDVariant v_NPRIMO = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NULTIMO = new IDVariant(0,IDVariant.INTEGER);
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.FATRINUMERAZIONEIVA(IMDB.Value(IMDBDef2.TBL_NUMERAZIOIV3, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMTIPREG, 0), IMDB.Value(IMDBDef2.TBL_NUMERAZIOIV3, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMTIPBOL, 0), IDL.ToString(IDL.ToDate(IMDB.Value(IMDBDef2.TBL_NUMERAZIOIV3, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMEESERC, 0), IMDB.Value(IMDBDef10.PQRY_NUMERAZIOIV1, IMDBDef10.PQSL_NUMERAZIOIV1_ROWNAMDALMES, 0), (new IDVariant(1)))), IMDB.Value(IMDBDef2.TBL_NUMERAZIOIV3, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMEESERC, 0), v_NPRIMO, v_NULTIMO);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          if (v_NPRIMO.compareTo(v_NULTIMO, true)>0 || (v_NPRIMO.equals((new IDVariant(0)), true) && v_NULTIMO.equals((new IDVariant(0)), true)))
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Nessuna fattura da rinumerare", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<BR/>"))), v_MSG)); 
          }
          else
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Numerazione effettuata ", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<BR/>"))), v_MSG), (new IDVariant("dal numero "))), IDL.ToString(v_NPRIMO)), (new IDVariant(" "))), (new IDVariant("al numero "))), IDL.ToString(v_NULTIMO))); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NumerazioneIVA", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Numerazione I V A
  // Primary record source for panel data
  // **********************************************************************
  private void NUMERAZIOIVA_NUMERAZIOIV1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_NUMERAZIOIV1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_NUMERAZIOIV3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_NUMERAZIOIV3, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_NUMERAZIOIV1_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_NUMERAZIOIV1_RS, 0, IMDBDef2.TBL_NUMERAZIOIV3, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NUMERAZIOIV1_RS, 0, 0, IMDBDef2.TBL_NUMERAZIOIV3, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NUMERAZIOIV1_RS, 1, 0, IMDBDef2.TBL_NUMERAZIOIV3, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMTIPREG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NUMERAZIOIV1_RS, 2, 0, IMDBDef2.TBL_NUMERAZIOIV3, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMDALMES, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NUMERAZIOIV1_RS, 3, 0, IMDBDef2.TBL_NUMERAZIOIV3, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMTIPBOL, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_NUMERAZIOIV3, 0);
      if (IMDB.Eof(IMDBDef2.TBL_NUMERAZIOIV3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_NUMERAZIOIV3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_NUMERAZIOIV1_RS, 0);
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
  private void PAN_NUMERAZIONE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NUMERAZIONE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NUMERAZIONE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NUMERAZIONE, Cancel);
    // Stub
  }

  private void PAN_NUMERAZIONE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_NUMERAZIONE_ELABORA)
    {
      this.IdxPanelActived = this.PAN_NUMERAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_NUMERAZIONE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NUMERAZIONE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NUMERAZIONE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_NUMERAZIONE_Init()
  {

    PAN_NUMERAZIONE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NUMERAZIONE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NUMERAZIONE.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_NUMERAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ESERCIZIO, "261CDBA6-9F72-4689-B4A3-75793338D9FA");
    PAN_NUMERAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ESERCIZIO, "Esercizio");
    PAN_NUMERAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ESERCIZIO, "");
    PAN_NUMERAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_NUMERAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ESERCIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NUMERAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_REGISTRO, "F2EBF6D9-4D40-40BA-96E2-795E1DFD249A");
    PAN_NUMERAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_REGISTRO, "Registro");
    PAN_NUMERAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_REGISTRO, "");
    PAN_NUMERAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_REGISTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_NUMERAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_REGISTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NUMERAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_BOLLATO, "40E46694-FE68-4366-9905-6728A3087CFC");
    PAN_NUMERAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_BOLLATO, "Bollato");
    PAN_NUMERAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_BOLLATO, "");
    PAN_NUMERAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_BOLLATO, MyGlb.VIS_VISULOOUPCF4);
    PAN_NUMERAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_BOLLATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NUMERAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_DALMESE, "F789A6DA-3575-412C-B2F8-50C3BC2A8303");
    PAN_NUMERAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_DALMESE, "Dal Mese");
    PAN_NUMERAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_DALMESE, "");
    PAN_NUMERAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_DALMESE, MyGlb.VIS_NORMALFIELDS);
    PAN_NUMERAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_DALMESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NUMERAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_TIPOBOLLATO, "C993B52E-6494-485E-9238-E48C48EFDAF9");
    PAN_NUMERAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_TIPOBOLLATO, "Tipo Bollato");
    PAN_NUMERAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_TIPOBOLLATO, "");
    PAN_NUMERAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_TIPOBOLLATO, MyGlb.VIS_NORMALFIELDS);
    PAN_NUMERAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_TIPOBOLLATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUMERAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ELABORA, "661DD54C-9BBA-44FC-A8DA-76E99EE5EC9B");
    PAN_NUMERAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ELABORA, "Elabora");
    PAN_NUMERAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_NUMERAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ELABORA, 0, "button1.gif", false);
    PAN_NUMERAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_NUMERAZIONE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NUMERAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUMERAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_NUMERAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_NUMERAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_NUMERAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ESERCIZIO, MyGlb.PANEL_FORM, 0, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUMERAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_NUMERAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_NUMERAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_NUMERAZIONE.SetFieldPage(PFL_NUMERAZIONE_ESERCIZIO, -1, -1);
    PAN_NUMERAZIONE.SetFieldPanel(PFL_NUMERAZIONE_ESERCIZIO, PPQRY_NUMERAZIOIV1, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
    PAN_NUMERAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_REGISTRO, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUMERAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_REGISTRO, MyGlb.PANEL_LIST, 72);
    PAN_NUMERAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_REGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_NUMERAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_REGISTRO, MyGlb.PANEL_LIST, "Regis.");
    PAN_NUMERAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_REGISTRO, MyGlb.PANEL_FORM, 4, 28, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUMERAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_REGISTRO, MyGlb.PANEL_FORM, 64);
    PAN_NUMERAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_REGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_NUMERAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_REGISTRO, MyGlb.PANEL_FORM, "Registro");
    PAN_NUMERAZIONE.SetFieldPage(PFL_NUMERAZIONE_REGISTRO, -1, -1);
    PAN_NUMERAZIONE.SetFieldPanel(PFL_NUMERAZIONE_REGISTRO, PPQRY_NUMERAZIOIV1, "A.ROWNAMTIPREG", "ROWNAMTIPREG", 1, 1, 0, -13997);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_REGISTRO, (new IDVariant(1)), "1 - Acquisti", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_REGISTRO, (new IDVariant(2)), "2 - Acquisti in Attesa di Esigibilità", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_REGISTRO, (new IDVariant(3)), "3 - Vendite", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_REGISTRO, (new IDVariant(4)), "4 - Corrispettivi", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_REGISTRO, (new IDVariant(5)), "5 - Vendite Esigibili al Pagamento", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_REGISTRO, (new IDVariant(6)), "6 - Vendite Debitori non Codificati", "", "", -1);
    PAN_NUMERAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_BOLLATO, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NUMERAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_BOLLATO, MyGlb.PANEL_LIST, 100);
    PAN_NUMERAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_BOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_NUMERAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_BOLLATO, MyGlb.PANEL_LIST, "Bollato");
    PAN_NUMERAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_BOLLATO, MyGlb.PANEL_FORM, 12, 52, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUMERAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_BOLLATO, MyGlb.PANEL_FORM, 56);
    PAN_NUMERAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_BOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_NUMERAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_BOLLATO, MyGlb.PANEL_FORM, "Bollato");
    PAN_NUMERAZIONE.SetFieldPage(PFL_NUMERAZIONE_BOLLATO, -1, -1);
    PAN_NUMERAZIONE.SetFieldPanel(PFL_NUMERAZIONE_BOLLATO, PPQRY_TIPOBOLLATO, "A.DESCRIZIONE", "ROWNAMT04DES", 5, 40, 0, -13997);
    PAN_NUMERAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_DALMESE, MyGlb.PANEL_LIST, 120, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUMERAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_DALMESE, MyGlb.PANEL_LIST, 52);
    PAN_NUMERAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_DALMESE, MyGlb.PANEL_LIST, 1);
    PAN_NUMERAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_DALMESE, MyGlb.PANEL_LIST, "Dal Mese");
    PAN_NUMERAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_DALMESE, MyGlb.PANEL_FORM, 0, 76, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUMERAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_DALMESE, MyGlb.PANEL_FORM, 68);
    PAN_NUMERAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_DALMESE, MyGlb.PANEL_FORM, 1);
    PAN_NUMERAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_DALMESE, MyGlb.PANEL_FORM, "Dal Mese");
    PAN_NUMERAZIONE.SetFieldPage(PFL_NUMERAZIONE_DALMESE, -1, -1);
    PAN_NUMERAZIONE.SetFieldPanel(PFL_NUMERAZIONE_DALMESE, PPQRY_NUMERAZIOIV1, "A.ROWNAMDALMES", "ROWNAMDALMES", 1, 2, 0, -13997);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_DALMESE, (new IDVariant(1)), "Gennaio", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_DALMESE, (new IDVariant(2)), "Febbraio", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_DALMESE, (new IDVariant(3)), "Marzo", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_DALMESE, (new IDVariant(4)), "Aprile", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_DALMESE, (new IDVariant(5)), "Maggio", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_DALMESE, (new IDVariant(6)), "Giugno", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_DALMESE, (new IDVariant(7)), "Luglio", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_DALMESE, (new IDVariant(8)), "Agosto", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_DALMESE, (new IDVariant(9)), "Settembre", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_DALMESE, (new IDVariant(10)), "Ottobre", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_DALMESE, (new IDVariant(11)), "Novembre", "", "", -1);
    PAN_NUMERAZIONE.SetValueListItem(PFL_NUMERAZIONE_DALMESE, (new IDVariant(12)), "Dicembre", "", "", -1);
    PAN_NUMERAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_TIPOBOLLATO, MyGlb.PANEL_LIST, 200, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUMERAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_TIPOBOLLATO, MyGlb.PANEL_LIST, 64);
    PAN_NUMERAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_NUMERAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_TIPOBOLLATO, MyGlb.PANEL_LIST, "Tp. Boll.");
    PAN_NUMERAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_TIPOBOLLATO, MyGlb.PANEL_FORM, 12, 52, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUMERAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_TIPOBOLLATO, MyGlb.PANEL_FORM, 64);
    PAN_NUMERAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_NUMERAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_TIPOBOLLATO, MyGlb.PANEL_FORM, "Tp. Boll.");
    PAN_NUMERAZIONE.SetFieldPage(PFL_NUMERAZIONE_TIPOBOLLATO, -1, -1);
    PAN_NUMERAZIONE.SetFieldPanel(PFL_NUMERAZIONE_TIPOBOLLATO, PPQRY_NUMERAZIOIV1, "A.ROWNAMTIPBOL", "ROWNAMTIPBOL", 1, 2, 0, -13997);
    PAN_NUMERAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ELABORA, MyGlb.PANEL_LIST, 212, 112, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUMERAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_NUMERAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_NUMERAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ELABORA, MyGlb.PANEL_FORM, 244, 112, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUMERAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_NUMERAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUMERAZIONE_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_NUMERAZIONE.SetFieldPage(PFL_NUMERAZIONE_ELABORA, -1, -1);
    PAN_NUMERAZIONE.SetFieldPanel(PFL_NUMERAZIONE_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_NUMERAZIONE_InitQueries()
  {
    StringBuffer SQL;

    PAN_NUMERAZIONE.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMT04DES ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = ~~TBL_NUMERAZIOIV3.ROWNAMTIPREG~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~TBL_NUMERAZIOIV3.ROWNAMTIPBOL~~) ");
    PAN_NUMERAZIONE.SetQuery(PPQRY_TIPOBOLLATO, 0, SQL, -1, "");
    PAN_NUMERAZIONE.SetQueryDB(PPQRY_TIPOBOLLATO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NUMERAZIONE.SetMasterTable(PPQRY_TIPOBOLLATO, "T04");
    PAN_NUMERAZIONE.SetIMDB(IMDB, "PQRY_NUMERAZIOIV1", true);
    PAN_NUMERAZIONE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_NUMERAZIONE.SetQueryIMDB(PPQRY_NUMERAZIOIV1, IMDBDef10.PQRY_NUMERAZIOIV1_RS, IMDBDef2.TBL_NUMERAZIOIV3);
    JustLoaded = true;
    PAN_NUMERAZIONE.SetFieldPrimaryIndex(PFL_NUMERAZIONE_ESERCIZIO, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMEESERC);
    PAN_NUMERAZIONE.SetFieldPrimaryIndex(PFL_NUMERAZIONE_REGISTRO, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMTIPREG);
    PAN_NUMERAZIONE.SetFieldPrimaryIndex(PFL_NUMERAZIONE_DALMESE, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMDALMES);
    PAN_NUMERAZIONE.SetFieldPrimaryIndex(PFL_NUMERAZIONE_TIPOBOLLATO, IMDBDef2.FLD_NUMERAZIOIV3_ROWNAMTIPBOL);
    PAN_NUMERAZIONE.SetMasterTable(0, "NUMERAZIOIV3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NUMERAZIONE.Status() == 2)
    {
      int oldListQBE = PAN_NUMERAZIONE.iUseListQBE;
      PAN_NUMERAZIONE.iUseListQBE = 0;
      PAN_NUMERAZIONE.PanelCommand(Glb.PCM_SEARCH);
      PAN_NUMERAZIONE.PanelCommand(Glb.PCM_FIND);
      PAN_NUMERAZIONE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_NUMERAZIONE) PAN_NUMERAZIONE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_NUMERAZIONE) PAN_NUMERAZIONE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_NUMERAZIONE) PAN_NUMERAZIONE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_NUMERAZIONE) PAN_NUMERAZIONE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_NUMERAZIONE) PAN_NUMERAZIONE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
