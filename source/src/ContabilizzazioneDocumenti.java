// **********************************************
// Contabilizzazione Documenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ContabilizzazioneDocumenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_TIPOREGISTRO = 0;
  private static int PFL_PARAM_TIPOBOLLATO = 1;
  private static int PFL_PARAM_TIPOREGIBOLL = 2;
  private static int PFL_PARAM_DOCUEMEFINAL = 3;
  private static int PFL_PARAM_ELABORA = 4;

  private static int PPQRY_PARAM157 = 0;

  private static int PPQRY_T04 = 1;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM58(IMDB);
    //
    //
    Init_PQRY_PARAM157(IMDB);
    Init_PQRY_PARAM157_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM58(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM58, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM58, "TBL_PARAM58");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM58,IMDBDef2.FLD_PARAM58_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM58,IMDBDef2.FLD_PARAM58_ROWNAMTIPREG,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM58,IMDBDef2.FLD_PARAM58_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM58,IMDBDef2.FLD_PARAM58_ROWNAMTIPBOL,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM58,IMDBDef2.FLD_PARAM58_ROWNAMREGBOL, "ROWNAMREGBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM58,IMDBDef2.FLD_PARAM58_ROWNAMREGBOL,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM58,IMDBDef2.FLD_PARAM58_ROWNAMDOCEME, "ROWNAMDOCEME");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM58,IMDBDef2.FLD_PARAM58_ROWNAMDOCEME,6,15,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM58, 0);
  }

  private static void Init_PQRY_PARAM157(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAM157, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAM157, "PQRY_PARAM157");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM157,IMDBDef9.PQSL_PARAM157_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM157,IMDBDef9.PQSL_PARAM157_ROWNAMTIPREG,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM157,IMDBDef9.PQSL_PARAM157_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM157,IMDBDef9.PQSL_PARAM157_ROWNAMTIPBOL,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM157,IMDBDef9.PQSL_PARAM157_ROWNAMREGBOL, "ROWNAMREGBOL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM157,IMDBDef9.PQSL_PARAM157_ROWNAMREGBOL,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM157,IMDBDef9.PQSL_PARAM157_ROWNAMDOCEME, "ROWNAMDOCEME");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM157,IMDBDef9.PQSL_PARAM157_ROWNAMDOCEME,6,15,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAM157, 0);
  }

  private static void Init_PQRY_PARAM157_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAM157_RS, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAM157_RS, "PQRY_PARAM157_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM157_RS,IMDBDef9.PQSL_PARAM157_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM157_RS,IMDBDef9.PQSL_PARAM157_ROWNAMTIPREG,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM157_RS,IMDBDef9.PQSL_PARAM157_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM157_RS,IMDBDef9.PQSL_PARAM157_ROWNAMTIPBOL,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM157_RS,IMDBDef9.PQSL_PARAM157_ROWNAMREGBOL, "ROWNAMREGBOL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM157_RS,IMDBDef9.PQSL_PARAM157_ROWNAMREGBOL,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM157_RS,IMDBDef9.PQSL_PARAM157_ROWNAMDOCEME, "ROWNAMDOCEME");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM157_RS,IMDBDef9.PQSL_PARAM157_ROWNAMDOCEME,6,15,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ContabilizzazioneDocumenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public ContabilizzazioneDocumenti()
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
    FormIdx = MyGlb.FRM_CONTABDOCUME;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "338AC2B2-1E93-4F65-AD29-3400F6036912";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 396;
    DesignHeight = 198;
    set_Caption(new IDVariant("Contabilizzazione Documenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 396;
    Frames[1].Height = 172;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 172;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 396-MyGlb.PAN_OFFS_X, 172-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E96D4D52-2846-4B72-850C-87DF16DC3071");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 312, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM58, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTABDOCUME_PARAM157();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
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
    return (obj instanceof ContabilizzazioneDocumenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ContabilizzazioneDocumenti.class.getName() : (Glb.ClassWithPackage(ContabilizzazioneDocumenti.class) ? ContabilizzazioneDocumenti.class.getName().substring(ContabilizzazioneDocumenti.class.getPackage().getName().length() + 1) : ContabilizzazioneDocumenti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param Tipo Registro Bollato Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAM_TIPOREGIBOLL_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Tipo Registro Bollato Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAM157, IMDBDef9.PQSL_PARAM157_ROWNAMREGBOL, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM58, IMDBDef2.FLD_PARAM58_ROWNAMTIPREG, 0, IDL.ToInteger(IDL.SubStr(IMDB.Value(IMDBDef9.PQRY_PARAM157, IMDBDef9.PQSL_PARAM157_ROWNAMREGBOL, 0), (new IDVariant(0)), (new IDVariant(1)))));
        IMDB.set_Value(IMDBDef2.TBL_PARAM58, IMDBDef2.FLD_PARAM58_ROWNAMTIPBOL, 0, IDL.ToInteger(IDL.Trim(IDL.SubStr(IMDB.Value(IMDBDef9.PQRY_PARAM157, IMDBDef9.PQSL_PARAM157_ROWNAMREGBOL, 0), (new IDVariant(2)), (new IDVariant(2))), true, true)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContabilizzazioneDocumenti", "ParamTipoRegistroBollatoValidateEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAM58, IMDBDef2.FLD_PARAM58_ROWNAMTIPREG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM58, IMDBDef2.FLD_PARAM58_ROWNAMTIPBOL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM58, IMDBDef2.FLD_PARAM58_ROWNAMREGBOL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM58, IMDBDef2.FLD_PARAM58_ROWNAMDOCEME, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContabilizzazioneDocumenti", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // OK
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int OK ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMERODOCUME = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_SMS = (new IDVariant("Sono stati contabilizzati ", IDVariant.STRING));
      v_SMS1 = (new IDVariant(" documenti", IDVariant.STRING));
      // 
      // OK Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAM157, IMDBDef9.PQSL_PARAM157_ROWNAMDOCEME, 0)))
      {
        IDVariant v_SMS2 = new IDVariant(0,IDVariant.STRING);
        v_SMS2 = (new IDVariant("Indicare la data emissione", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS2); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.CONTABILIZZADOCCC(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef9.PQRY_PARAM157, IMDBDef9.PQSL_PARAM157_ROWNAMTIPREG, 0), IMDB.Value(IMDBDef9.PQRY_PARAM157, IMDBDef9.PQSL_PARAM157_ROWNAMTIPBOL, 0), IMDB.Value(IMDBDef9.PQRY_PARAM157, IMDBDef9.PQSL_PARAM157_ROWNAMDOCEME, 0), v_NUMERODOCUME);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_SMS, IDL.ToString(v_NUMERODOCUME)), v_SMS1)); 
      ((DocumentiDebitoriCodificati)MainFrm.GetForm(MyGlb.FRM_DOCUDEBICODI,0)).PAN_DOCUMDACONTA.PanelCommand(Glb.PCM_REQUERY);
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContabilizzazioneDocumenti", "OK", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void CONTABDOCUME_PARAM157() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAM157_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM58, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM58, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAM157_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAM157_RS, 0, IMDBDef2.TBL_PARAM58, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM157_RS, 0, 0, IMDBDef2.TBL_PARAM58, IMDBDef2.FLD_PARAM58_ROWNAMTIPREG, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM157_RS, 1, 0, IMDBDef2.TBL_PARAM58, IMDBDef2.FLD_PARAM58_ROWNAMTIPBOL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM157_RS, 2, 0, IMDBDef2.TBL_PARAM58, IMDBDef2.FLD_PARAM58_ROWNAMREGBOL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM157_RS, 3, 0, IMDBDef2.TBL_PARAM58, IMDBDef2.FLD_PARAM58_ROWNAMDOCEME, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM58, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM58, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM58, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAM157_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OK();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAM_TIPOREGIBOLL)
      {
        PFL_PARAM_TIPOREGIBOLL_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, "C7350D47-01BB-4FE4-AB7E-C3DA8A5DAD71");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, "Tipo Registro");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, "281B3772-969C-4C93-8EF3-E897D4F421F9");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, "Tipo Bollato");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "6FBEC05D-10D8-4613-AF2D-542EA5DEA4C4");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "Tipo Registro/Bollato");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, "336F599B-A215-4265-909F-179AD5C97FE7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, "Documenti emessi fino al");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "E1FFB66E-37BF-40E6-B0A5-494177AA7372");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_LIST, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_LIST, "Tp. Regis.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_FORM, 32, 64, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_FORM, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_FORM, "Tipo Registro");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOREGISTRO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOREGISTRO, PPQRY_PARAM157, "A.ROWNAMTIPREG", "ROWNAMTIPREG", 1, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_LIST, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_LIST, "Tp. Boll.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_FORM, 184, 64, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_FORM, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOBOLLATO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOBOLLATO, PPQRY_PARAM157, "A.ROWNAMTIPBOL", "ROWNAMTIPBOL", 1, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 80, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, "Tipo Registro/Bollato");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 28, 12, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 128);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, "Tipo Registro/Bollato");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOREGIBOLL, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOREGIBOLL, PPQRY_PARAM157, "A.ROWNAMREGBOL", "ROWNAMREGBOL", 5, 50, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_LIST, 288, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_LIST, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_LIST, "Documenti emessi fino al");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_FORM, 4, 36, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_FORM, 152);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_FORM, "Documenti emessi fino al");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DOCUEMEFINAL, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DOCUEMEFINAL, PPQRY_PARAM157, "A.ROWNAMDOCEME", "ROWNAMDOCEME", 6, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 112, 104, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 292, 80, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ELABORA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  LPAD(TO_CHAR ( A.TIPO_REGISTRO ), 1, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR(' ', 1, 1)) as T04REGISBOLL, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (LPAD(TO_CHAR ( A.TIPO_REGISTRO ), 1, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR(' ', 1, 1)) = ~~ROWNAMREGBOL~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = 3 OR A.TIPO_REGISTRO = 5) ");
    SQL.append("order by 1 ");
    PAN_PARAM.SetQuery(PPQRY_T04, 0, SQL, PFL_PARAM_TIPOREGIBOLL, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  LPAD(TO_CHAR ( A.TIPO_REGISTRO ), 1, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR(' ', 1, 1)) as T04REGISBOLL, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = 3 OR A.TIPO_REGISTRO = 5) ");
    SQL.append("order by 1 ");
    PAN_PARAM.SetQuery(PPQRY_T04, 1, SQL, PFL_PARAM_TIPOREGIBOLL, "");
    PAN_PARAM.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM157", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM157, IMDBDef9.PQRY_PARAM157_RS, IMDBDef2.TBL_PARAM58);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOREGISTRO, IMDBDef2.FLD_PARAM58_ROWNAMTIPREG);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOBOLLATO, IMDBDef2.FLD_PARAM58_ROWNAMTIPBOL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOREGIBOLL, IMDBDef2.FLD_PARAM58_ROWNAMREGBOL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DOCUEMEFINAL, IMDBDef2.FLD_PARAM58_ROWNAMDOCEME);
    PAN_PARAM.SetMasterTable(0, "PARAM58");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
