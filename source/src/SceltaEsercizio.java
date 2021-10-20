// **********************************************
// Scelta Esercizio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaEsercizio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ESERCIZIO_ESERCIZIO = 0;

  private static int PFL_ESERCIZIO_BOTTONIMPOST = 0;
  private static int PFL_ESERCIZIO_ESERCIZIO = 1;
  private static int PFL_ESERCIZIO_RIEMPIGRUPPO = 2;
  private static int PFL_ESERCIZIO_SPIEGAZIONI = 3;

  private static int PPQRY_DATISESSION1 = 0;

  private static int PPQRY_ESEFIN = 1;


  IDPanel PAN_ESERCIZIO;
  private static int PFL_NOTEFUNZIONA_MODULO = 0;
  private static int PFL_NOTEFUNZIONA_PAGINA = 1;
  private static int PFL_NOTEFUNZIONA_FUNZIONE = 2;
  private static int PFL_NOTEFUNZIONA_DESCRIZIONE = 3;

  private static int PPQRY_NOTEFUNZIO22 = 0;


  IDPanel PAN_NOTEFUNZIONA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_DATISESSION1(IMDB);
    Init_PQRY_DATISESSION1_RS(IMDB);
    Init_PQRY_NOTEFUNZIO22(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_DATISESSION1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_DATISESSION1, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_DATISESSION1, "PQRY_DATISESSION1");
    IMDB.set_FldCode(IMDBDef8.PQRY_DATISESSION1,IMDBDef8.PQSL_DATISESSION1_SESSIOESERCI, "SESSIOESERCI");
    IMDB.SetFldParams(IMDBDef8.PQRY_DATISESSION1,IMDBDef8.PQSL_DATISESSION1_SESSIOESERCI,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_DATISESSION1, 0);
  }

  private static void Init_PQRY_DATISESSION1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_DATISESSION1_RS, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_DATISESSION1_RS, "PQRY_DATISESSION1_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_DATISESSION1_RS,IMDBDef8.PQSL_DATISESSION1_SESSIOESERCI, "SESSIOESERCI");
    IMDB.SetFldParams(IMDBDef8.PQRY_DATISESSION1_RS,IMDBDef8.PQSL_DATISESSION1_SESSIOESERCI,1,4,0);
  }

  private static void Init_PQRY_NOTEFUNZIO22(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_NOTEFUNZIO22, 4);
    IMDB.set_TblCode(IMDBDef8.PQRY_NOTEFUNZIO22, "PQRY_NOTEFUNZIO22");
    IMDB.set_FldCode(IMDBDef8.PQRY_NOTEFUNZIO22,IMDBDef8.PQSL_NOTEFUNZIO22_MODULO, "MODULO");
    IMDB.SetFldParams(IMDBDef8.PQRY_NOTEFUNZIO22,IMDBDef8.PQSL_NOTEFUNZIO22_MODULO,5,20,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_NOTEFUNZIO22,IMDBDef8.PQSL_NOTEFUNZIO22_PAGINA, "PAGINA");
    IMDB.SetFldParams(IMDBDef8.PQRY_NOTEFUNZIO22,IMDBDef8.PQSL_NOTEFUNZIO22_PAGINA,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_NOTEFUNZIO22,IMDBDef8.PQSL_NOTEFUNZIO22_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_NOTEFUNZIO22,IMDBDef8.PQSL_NOTEFUNZIO22_FUNZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_NOTEFUNZIO22,IMDBDef8.PQSL_NOTEFUNZIO22_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_NOTEFUNZIO22,IMDBDef8.PQSL_NOTEFUNZIO22_DESCRIZIONE,9,9999,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_NOTEFUNZIO22, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaEsercizio(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaEsercizio()
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
    FormIdx = MyGlb.FRM_SCELTAESERCI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CBED8E14-1E2D-41EA-95F7-A5D97420E12A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 408;
    DesignHeight = 218;
    set_Caption(new IDVariant("Scelta Esercizio"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 408;
    Frames[1].Height = 192;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.604167;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 408;
    Frames[2].Height = 116;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Esercizio";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 116;
    PAN_ESERCIZIO = new IDPanel(w, this, 2, "PAN_ESERCIZIO");
    Frames[2].Content = PAN_ESERCIZIO;
    PAN_ESERCIZIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESERCIZIO.VS = MainFrm.VisualStyleList;
    PAN_ESERCIZIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 408-MyGlb.PAN_OFFS_X, 116-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESERCIZIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D22985ED-47B8-44D9-8CB6-E22A0366D286");
    PAN_ESERCIZIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIZIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESERCIZIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESERCIZIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESERCIZIO.InitStatus = 2;
    PAN_ESERCIZIO_Init();
    PAN_ESERCIZIO_InitFields();
    PAN_ESERCIZIO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 408;
    Frames[3].Height = 76;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "NOTE FUNZIONALITA";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 76;
    PAN_NOTEFUNZIONA = new IDPanel(w, this, 3, "PAN_NOTEFUNZIONA");
    Frames[3].Content = PAN_NOTEFUNZIONA;
    PAN_NOTEFUNZIONA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTEFUNZIONA.VS = MainFrm.VisualStyleList;
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 408-MyGlb.PAN_OFFS_X, 76-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9011CA64-0E81-4DFC-876E-89DD01A82640");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTEFUNZIONA.InitStatus = 2;
    PAN_NOTEFUNZIONA_Init();
    PAN_NOTEFUNZIONA_InitFields();
    PAN_NOTEFUNZIONA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef7.TBL_DATISESSIONE, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELTAESERCI_DATISESSION1();
      }
      PAN_ESERCIZIO.UpdatePanel(MainFrm);
      PAN_NOTEFUNZIONA.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaEsercizio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaEsercizio.class.getName() : (Glb.ClassWithPackage(SceltaEsercizio.class) ? SceltaEsercizio.class.getName().substring(SceltaEsercizio.class.getPackage().getName().length() + 1) : SceltaEsercizio.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Imposta Esercizio
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ImpostaEsercizio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MESSAGGIO = (new IDVariant("Obbligatorio impostare un valore per l'esercizio!", IDVariant.STRING));
      // 
      // Imposta Esercizio Body
      // Procedure Body
      // 
      // 
      // Ciclo le Videate aperte per chiuderle
      // 
      {
        IDVariant J = null;
        J = IDL.Sub((new IDVariant(MainFrm.OpenFormsCount())), (new IDVariant(1)));
        while ((new IDVariant(MainFrm.OpenFormsCount())).compareTo((new IDVariant(1)), true)>0)
        {
          WebForm v_IDF = null;
          v_IDF = (WebForm)MainFrm.GetOpenForm(J.intValue());
          // 
          // Se la videata è diversa in cui sono provo a chiuderla
          // 
          if (new IDVariant(v_IDF.RTCGuid).compareTo(new IDVariant(this.RTCGuid), true)!=0)
          {
            MainFrm.UnloadForm(v_IDF.FormIdx,(new IDVariant(0)).booleanValue()); 
            // 
            // Se la videata ha modifiche in sospeso la metto in primo
            // piano e non imposto l'esercizio
            // 
            if (v_IDF.FormIsUpdated())
            {
              MainFrm.ShowMultipleForm(v_IDF, (new IDVariant(0)).intValue(), this); 
              return 0;
            }
            J = IDL.Sub((new IDVariant(MainFrm.OpenFormsCount())), (new IDVariant(1)));
          }
          else
          {
            // 
            //  Se la Videata è quella in cui mi trovo non la chiudo
            // e la salto
            // 
            if ((new IDVariant(MainFrm.OpenFormsCount())).compareTo((new IDVariant(1)), true)>0)
            {
              J = IDL.Sub((new IDVariant(MainFrm.OpenFormsCount())), (new IDVariant(2)));
            }
          }
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_DATISESSION1, IMDBDef8.PQSL_DATISESSION1_SESSIOESERCI, 0))))
      {
        IMDB.set_Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0, IMDB.Value(IMDBDef8.PQRY_DATISESSION1, IMDBDef8.PQSL_DATISESSION1_SESSIOESERCI, 0));
        MainFrm.ESERCIZIO = IDL.Add(IDL.Add(IDL.Add((new IDVariant(" - ")), (new IDVariant("Esercizio"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        if (MainFrm.RiempiStruttura())
        {
          MainFrm.Cf4armDBObject.CF4WEBGETUNITAGESTIONE(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        MainFrm.SettaParametriT99();
        MainFrm.SettaPOLParametri();
        MainFrm.SettaMainCaption();
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      else
      {
        MainFrm.set_AlertMessage(v_MESSAGGIO); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaEsercizio", "ImpostaEsercizio", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      AutoSaveType = (new IDVariant("NONE")).stringValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaEsercizio", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Dati Sessione
  // Primary record source for panel data
  // **********************************************************************
  private void SCELTAESERCI_DATISESSION1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_DATISESSION1_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_DATISESSIONE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_DATISESSIONE, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_DATISESSION1_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_DATISESSION1_RS, 0, IMDBDef7.TBL_DATISESSIONE, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_DATISESSION1_RS, 0, 0, IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_DATISESSIONE, 0);
      if (IMDB.Eof(IMDBDef7.TBL_DATISESSIONE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_DATISESSIONE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef8.PQRY_DATISESSION1_RS, 0);
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
  private void PAN_ESERCIZIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ESERCIZIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ESERCIZIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESERCIZIO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESERCIZIO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ESERCIZIO);
    // Stub
  }

  private void PAN_ESERCIZIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ESERCIZIO_BOTTONIMPOST)
    {
      this.IdxPanelActived = this.PAN_ESERCIZIO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ImpostaEsercizio();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ESERCIZIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ESERCIZIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESERCIZIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTEFUNZIONA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTEFUNZIONA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NOTEFUNZIONA);
    // Stub
  }

  private void PAN_NOTEFUNZIONA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NOTEFUNZIONA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTEFUNZIONA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTEFUNZIONA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ESERCIZIO_Init()
  {

    PAN_ESERCIZIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESERCIZIO.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_ESERCIZIO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ESERCIZIO_ESERCIZIO, "8FD5474C-3CA3-4F23-9467-3FA491204BF1");
    PAN_ESERCIZIO.set_Header(MyGlb.OBJ_GROUP, GRP_ESERCIZIO_ESERCIZIO, "Esercizio");
    PAN_ESERCIZIO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ESERCIZIO_ESERCIZIO, "");
    PAN_ESERCIZIO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ESERCIZIO_ESERCIZIO, MyGlb.VIS_GROUPSTYLE);
    PAN_ESERCIZIO.SetRect(MyGlb.OBJ_GROUP, GRP_ESERCIZIO_ESERCIZIO, MyGlb.PANEL_LIST, 0, -9999, 80, 16, 0, 0);
    PAN_ESERCIZIO.SetRect(MyGlb.OBJ_GROUP, GRP_ESERCIZIO_ESERCIZIO, MyGlb.PANEL_FORM, 28, 42, 236, 62, 0, 0);
    PAN_ESERCIZIO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESERCIZIO_ESERCIZIO, 0, 49);
    PAN_ESERCIZIO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESERCIZIO_ESERCIZIO, 1, 13);
    PAN_ESERCIZIO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESERCIZIO_ESERCIZIO, 0, 4);
    PAN_ESERCIZIO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESERCIZIO_ESERCIZIO, 1, 2);
    PAN_ESERCIZIO.SetFlags(MyGlb.OBJ_GROUP, GRP_ESERCIZIO_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ESERCIZIO.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_ESERCIZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_BOTTONIMPOST, "144A4C79-E794-4E2B-BD45-471F22DC2B3B");
    PAN_ESERCIZIO.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_BOTTONIMPOST, "Imposta>>");
    PAN_ESERCIZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_BOTTONIMPOST, MyGlb.VIS_STATICBUTTON);
    PAN_ESERCIZIO.SetImage(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_BOTTONIMPOST, 0, "button1.gif", false);
    PAN_ESERCIZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_BOTTONIMPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ESERCIZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_ESERCIZIO, "953CA648-567D-4EFE-A1D9-06E9700C1355");
    PAN_ESERCIZIO.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_ESERCIZIO, "Esercizio");
    PAN_ESERCIZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_ESERCIZIO, "");
    PAN_ESERCIZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_ESERCIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_ESERCIZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESERCIZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_RIEMPIGRUPPO, "4DA91ECA-28AE-401A-B5AE-368104E2B5F7");
    PAN_ESERCIZIO.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_RIEMPIGRUPPO, "");
    PAN_ESERCIZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_RIEMPIGRUPPO, MyGlb.VIS_SFONEBORDTRA);
    PAN_ESERCIZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_RIEMPIGRUPPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESERCIZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_SPIEGAZIONI, "F13090E5-F3E5-41E7-A966-963BF3C81257");
    PAN_ESERCIZIO.set_Header(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_SPIEGAZIONI, "Selezionare l'Esercizio del contesto e premere Imposta");
    PAN_ESERCIZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_SPIEGAZIONI, MyGlb.VIS_DICITUGENERI);
    PAN_ESERCIZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_SPIEGAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_ESERCIZIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESERCIZIO.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_BOTTONIMPOST, MyGlb.PANEL_LIST, 232, 52, 96, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_BOTTONIMPOST, MyGlb.PANEL_LIST, 0);
    PAN_ESERCIZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_BOTTONIMPOST, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIZIO.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_BOTTONIMPOST, MyGlb.PANEL_FORM, 304, 76, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_BOTTONIMPOST, MyGlb.PANEL_FORM, 0);
    PAN_ESERCIZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_BOTTONIMPOST, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIZIO.SetFieldPage(PFL_ESERCIZIO_BOTTONIMPOST, -1, -1);
    PAN_ESERCIZIO.SetFieldPanel(PFL_ESERCIZIO_BOTTONIMPOST, -1, "", "BOTTONIMPOST", 0, 0, 0, -13997);
    PAN_ESERCIZIO.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_ESERCIZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_ESERCIZIO.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_ESERCIZIO, MyGlb.PANEL_FORM, 56, 56, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_ESERCIZIO, MyGlb.PANEL_FORM, 72);
    PAN_ESERCIZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_ESERCIZIO.SetFieldPage(PFL_ESERCIZIO_ESERCIZIO, -1, GRP_ESERCIZIO_ESERCIZIO);
    PAN_ESERCIZIO.SetFieldPanel(PFL_ESERCIZIO_ESERCIZIO, PPQRY_DATISESSION1, "A.SESSIOESERCI", "SESSIOESERCI", 1, 4, 0, -13997);
    PAN_ESERCIZIO.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_RIEMPIGRUPPO, MyGlb.PANEL_LIST, 16, 32, 156, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_RIEMPIGRUPPO, MyGlb.PANEL_LIST, 0);
    PAN_ESERCIZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_RIEMPIGRUPPO, MyGlb.PANEL_LIST, 4);
    PAN_ESERCIZIO.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_RIEMPIGRUPPO, MyGlb.PANEL_FORM, 32, 80, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_RIEMPIGRUPPO, MyGlb.PANEL_FORM, 0);
    PAN_ESERCIZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_RIEMPIGRUPPO, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIZIO.SetFieldPage(PFL_ESERCIZIO_RIEMPIGRUPPO, -1, GRP_ESERCIZIO_ESERCIZIO);
    PAN_ESERCIZIO.SetFieldPanel(PFL_ESERCIZIO_RIEMPIGRUPPO, -1, "", "RIEMPIGRUPPO", 0, 0, 0, -13997);
    PAN_ESERCIZIO.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_SPIEGAZIONI, MyGlb.PANEL_LIST, 12, 4, 396, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_SPIEGAZIONI, MyGlb.PANEL_LIST, 0);
    PAN_ESERCIZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_SPIEGAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_ESERCIZIO.SetRect(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_SPIEGAZIONI, MyGlb.PANEL_FORM, 28, 8, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESERCIZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_SPIEGAZIONI, MyGlb.PANEL_FORM, 0);
    PAN_ESERCIZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESERCIZIO_SPIEGAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_ESERCIZIO.SetFieldPage(PFL_ESERCIZIO_SPIEGAZIONI, -1, -1);
    PAN_ESERCIZIO.SetFieldPanel(PFL_ESERCIZIO_SPIEGAZIONI, -1, "", "SPIEGAZIONI", 0, 0, 0, -13997);
  }

  private void PAN_ESERCIZIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESERCIZIO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERC1, ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where (A.ESERCIZIO = ~~SESSIOESERCI~~) ");
    SQL.append("and   ((A.FASE_BILANCIO BETWEEN 0 AND 9)) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_ESERCIZIO.SetQuery(PPQRY_ESEFIN, 0, SQL, PFL_ESERCIZIO_ESERCIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERC1, ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where ((A.FASE_BILANCIO BETWEEN 0 AND 9)) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_ESERCIZIO.SetQuery(PPQRY_ESEFIN, 1, SQL, PFL_ESERCIZIO_ESERCIZIO, "");
    PAN_ESERCIZIO.SetQueryDB(PPQRY_ESEFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESERCIZIO.SetIMDB(IMDB, "PQRY_DATISESSION1", true);
    PAN_ESERCIZIO.set_SetString(MyGlb.MASTER_ROWNAME, "Sessione");
    PAN_ESERCIZIO.SetQueryIMDB(PPQRY_DATISESSION1, IMDBDef8.PQRY_DATISESSION1_RS, IMDBDef7.TBL_DATISESSIONE);
    JustLoaded = true;
    PAN_ESERCIZIO.SetFieldPrimaryIndex(PFL_ESERCIZIO_ESERCIZIO, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI);
    PAN_ESERCIZIO.SetMasterTable(0, "DATISESSIONE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESERCIZIO.Status() == 2)
    {
      int oldListQBE = PAN_ESERCIZIO.iUseListQBE;
      PAN_ESERCIZIO.iUseListQBE = 0;
      PAN_ESERCIZIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESERCIZIO.PanelCommand(Glb.PCM_FIND);
      PAN_ESERCIZIO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_NOTEFUNZIONA_Init()
  {

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "5ED8EB04-56EF-4B5D-AAB5-EDCF00E3E3AC");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "MODULO");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "4566C588-28CF-4F76-B2FC-12EFEBD18820");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "PAGINA");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "D2D32D12-EC42-4BAB-B99C-5D772E162987");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "FUNZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "85FE1793-7E07-4BF0-BE8F-3040C66C62EB");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.VIS_HTMEDISTNOSF);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NOTEFUNZIONA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 56);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, "MODULO");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, "MODULO");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_MODULO, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_MODULO, PPQRY_NOTEFUNZIO22, "A.MODULO", "MODULO", 5, 20, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 4, 164, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, "PAGINA");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 4, 28, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, "PAGINA");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_PAGINA, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_PAGINA, PPQRY_NOTEFUNZIO22, "A.PAGINA", "PAGINA", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 4, 200, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 4, 52, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_FUNZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_FUNZIONE, PPQRY_NOTEFUNZIO22, "A.FUNZIONE", "FUNZIONE", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 104, 236, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 24, 4, 368, 64, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 4);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_DESCRIZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_DESCRIZIONE, PPQRY_NOTEFUNZIO22, "A.DESCRIZIONE", "DESCRIZIONE", 9, 9999, 0, -13997);
  }

  private void PAN_NOTEFUNZIONA_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTEFUNZIONA.SetIMDB(IMDB, "PQRY_NOTEFUNZIO22", true);
    PAN_NOTEFUNZIONA.set_SetString(MyGlb.MASTER_ROWNAME, "NOTE FUNZIONALITA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MODULO as MODULO, ");
    SQL.append("  A.PAGINA as PAGINA, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO22, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO22, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (A.PAGINA = " + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_SCELTAESERCI,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.FUNZIONE = 'Imposta') ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO22, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO22, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO22, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO22, 5, SQL, -1, "");
    PAN_NOTEFUNZIONA.SetQueryDB(PPQRY_NOTEFUNZIO22, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NOTEFUNZIONA.SetMasterTable(0, "NOTE_FUNZIONALITA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTEFUNZIONA.Status() == 2)
    {
      int oldListQBE = PAN_NOTEFUNZIONA.iUseListQBE;
      PAN_NOTEFUNZIONA.iUseListQBE = 0;
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_FIND);
      PAN_NOTEFUNZIONA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ESERCIZIO) PAN_ESERCIZIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESERCIZIO) PAN_ESERCIZIO_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ESERCIZIO) PAN_ESERCIZIO_DynamicProperties();
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESERCIZIO) PAN_ESERCIZIO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ESERCIZIO) PAN_ESERCIZIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
