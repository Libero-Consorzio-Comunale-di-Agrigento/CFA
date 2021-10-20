// **********************************************
// Situazione Dodicesimi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneDodicesimi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SITUAZDODICE_MESE = 0;
  private static int PFL_SITUAZDODICE_DETTAGCAPITO = 1;
  private static int PFL_SITUAZDODICE_DESCRIINTERV = 2;
  private static int PFL_SITUAZDODICE_ELABORA = 3;

  private static int PPQRY_PAR13 = 0;


  IDPanel PAN_SITUAZDODICE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR16(IMDB);
    //
    //
    Init_PQRY_PAR13(IMDB);
    Init_PQRY_PAR13_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR16(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PAR16, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_PAR16, "TBL_PAR16");
    IMDB.set_FldCode(IMDBDef4.TBL_PAR16,IMDBDef4.FLD_PAR16_ROWNAMEMESI, "ROWNAMEMESI");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR16,IMDBDef4.FLD_PAR16_ROWNAMEMESI,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAR16,IMDBDef4.FLD_PAR16_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR16,IMDBDef4.FLD_PAR16_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAR16,IMDBDef4.FLD_PAR16_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR16,IMDBDef4.FLD_PAR16_ROWNAMDESINT,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PAR16, 0);
  }

  private static void Init_PQRY_PAR13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PAR13, 3);
    IMDB.set_TblCode(IMDBDef13.PQRY_PAR13, "PQRY_PAR13");
    IMDB.set_FldCode(IMDBDef13.PQRY_PAR13,IMDBDef13.PQSL_PAR13_ROWNAMEMESI, "ROWNAMEMESI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PAR13,IMDBDef13.PQSL_PAR13_ROWNAMEMESI,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PAR13,IMDBDef13.PQSL_PAR13_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PAR13,IMDBDef13.PQSL_PAR13_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PAR13,IMDBDef13.PQSL_PAR13_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef13.PQRY_PAR13,IMDBDef13.PQSL_PAR13_ROWNAMDESINT,5,2,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PAR13, 0);
  }

  private static void Init_PQRY_PAR13_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PAR13_RS, 3);
    IMDB.set_TblCode(IMDBDef13.PQRY_PAR13_RS, "PQRY_PAR13_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PAR13_RS,IMDBDef13.PQSL_PAR13_ROWNAMEMESI, "ROWNAMEMESI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PAR13_RS,IMDBDef13.PQSL_PAR13_ROWNAMEMESI,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PAR13_RS,IMDBDef13.PQSL_PAR13_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PAR13_RS,IMDBDef13.PQSL_PAR13_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PAR13_RS,IMDBDef13.PQSL_PAR13_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef13.PQRY_PAR13_RS,IMDBDef13.PQSL_PAR13_ROWNAMDESINT,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneDodicesimi(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneDodicesimi()
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
    FormIdx = MyGlb.FRM_SITUAZDODICE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A948973D-8544-4255-B7AD-0D8AF8960677";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 252;
    DesignHeight = 222;
    set_Caption(new IDVariant("Situazione Dodicesimi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 252;
    Frames[1].Height = 196;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Situazione Dodicesimi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 196;
    PAN_SITUAZDODICE = new IDPanel(w, this, 1, "PAN_SITUAZDODICE");
    Frames[1].Content = PAN_SITUAZDODICE;
    PAN_SITUAZDODICE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SITUAZDODICE.VS = MainFrm.VisualStyleList;
    PAN_SITUAZDODICE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 252-MyGlb.PAN_OFFS_X, 196-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SITUAZDODICE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "38FDAD9A-1F14-4227-B5ED-61525BFC84AA");
    PAN_SITUAZDODICE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 160, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDODICE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SITUAZDODICE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SITUAZDODICE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SITUAZDODICE.InitStatus = 2;
    PAN_SITUAZDODICE_Init();
    PAN_SITUAZDODICE_InitFields();
    PAN_SITUAZDODICE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PAR16, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITUAZDODICE_PAR13();
      }
      PAN_SITUAZDODICE.UpdatePanel(MainFrm);
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
    return (obj instanceof SituazioneDodicesimi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneDodicesimi.class.getName() : (Glb.ClassWithPackage(SituazioneDodicesimi.class) ? SituazioneDodicesimi.class.getName().substring(SituazioneDodicesimi.class.getPackage().getName().length() + 1) : SituazioneDodicesimi.class.getName()));
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
    IDVariant v_DW = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DW = (new IDVariant("d_sitdod_stampa", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PAR13, IMDBDef13.PQSL_PAR13_ROWNAMEMESI, 0)));
      MainFrm.SetParametroStampa(Getmese(IMDB.Value(IMDBDef13.PQRY_PAR13, IMDBDef13.PQSL_PAR13_ROWNAMEMESI, 0)));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef13.PQRY_PAR13, IMDBDef13.PQSL_PAR13_ROWNAMDETCAP, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef13.PQRY_PAR13, IMDBDef13.PQSL_PAR13_ROWNAMDESINT, 0));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneDodicesimi", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Getmese
  // Mese N - Input
  // **********************************************************************
  public IDVariant Getmese (IDVariant MeseN)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Getmese Body
      // Procedure Body
      // 
      if (MeseN.equals((new IDVariant(1)), true))
      {
        return (new IDVariant("Gennaio"));
      }
      if (MeseN.equals((new IDVariant(2)), true))
      {
        return (new IDVariant("Febbraio"));
      }
      if (MeseN.equals((new IDVariant(3)), true))
      {
        return (new IDVariant("Marzo"));
      }
      if (MeseN.equals((new IDVariant(4)), true))
      {
        return (new IDVariant("Aprile"));
      }
      if (MeseN.equals((new IDVariant(5)), true))
      {
        return (new IDVariant("Maggio"));
      }
      if (MeseN.equals((new IDVariant(6)), true))
      {
        return (new IDVariant("Giugno"));
      }
      if (MeseN.equals((new IDVariant(7)), true))
      {
        return (new IDVariant("Luglio"));
      }
      if (MeseN.equals((new IDVariant(8)), true))
      {
        return (new IDVariant("Agosto"));
      }
      if (MeseN.equals((new IDVariant(9)), true))
      {
        return (new IDVariant("Settembre"));
      }
      if (MeseN.equals((new IDVariant(10)), true))
      {
        return (new IDVariant("Ottobre"));
      }
      if (MeseN.equals((new IDVariant(11)), true))
      {
        return (new IDVariant("Novembre"));
      }
      if (MeseN.equals((new IDVariant(12)), true))
      {
        return (new IDVariant("Dicembre"));
      }
      return (new IDVariant());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneDodicesimi", "Getmese", _e);
      return new IDVariant();
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef4.TBL_PAR16, IMDBDef4.FLD_PAR16_ROWNAMEMESI, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef4.TBL_PAR16, IMDBDef4.FLD_PAR16_ROWNAMDETCAP, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef4.TBL_PAR16, IMDBDef4.FLD_PAR16_ROWNAMDESINT, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneDodicesimi", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Situazione Dodicesimi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SITUAZDODICE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SITUAZDODICE);
      // 
      // Situazione Dodicesimi On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef13.PQRY_PAR13, IMDBDef13.PQSL_PAR13_ROWNAMDETCAP, 0).equals((new IDVariant("NO")), true))
      {
        PAN_SITUAZDODICE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SITUAZDODICE.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PAR13, IMDBDef13.PQSL_PAR13_ROWNAMEMESI, 0)))
      {
        IMDB.set_Value(IMDBDef4.TBL_PAR16, IMDBDef4.FLD_PAR16_ROWNAMEMESI, 0, (new IDVariant(1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneDodicesimi", "SituazioneDodicesimiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void SITUAZDODICE_PAR13() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PAR13_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PAR16, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PAR16, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PAR13_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PAR13_RS, 0, IMDBDef4.TBL_PAR16, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PAR13_RS, 0, 0, IMDBDef4.TBL_PAR16, IMDBDef4.FLD_PAR16_ROWNAMEMESI, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PAR13_RS, 1, 0, IMDBDef4.TBL_PAR16, IMDBDef4.FLD_PAR16_ROWNAMDETCAP, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PAR13_RS, 2, 0, IMDBDef4.TBL_PAR16, IMDBDef4.FLD_PAR16_ROWNAMDESINT, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PAR16, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PAR16, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PAR16, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PAR13_RS, 0);
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
  private void PAN_SITUAZDODICE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SITUAZDODICE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SITUAZDODICE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SITUAZDODICE, Cancel);
    // Stub
  }

  private void PAN_SITUAZDODICE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SITUAZDODICE_ELABORA)
    {
      this.IdxPanelActived = this.PAN_SITUAZDODICE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SITUAZDODICE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SITUAZDODICE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SITUAZDODICE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SITUAZDODICE_Init()
  {

    PAN_SITUAZDODICE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SITUAZDODICE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SITUAZDODICE.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_SITUAZDODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_MESE, "497364B4-2D41-42B4-A62B-CD2A17BF859A");
    PAN_SITUAZDODICE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_MESE, "Mese");
    PAN_SITUAZDODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_MESE, "");
    PAN_SITUAZDODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_MESE, MyGlb.VIS_NORFIECFHELE);
    PAN_SITUAZDODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_MESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZDODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DETTAGCAPITO, "7778F60E-E59C-4F6E-B56F-A49DF1C9D0FC");
    PAN_SITUAZDODICE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_SITUAZDODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DETTAGCAPITO, "");
    PAN_SITUAZDODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_SITUAZDODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZDODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, "0BD8209D-5E16-4E75-AA94-E8D57C96880F");
    PAN_SITUAZDODICE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, "Descrizione Intervento");
    PAN_SITUAZDODICE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, "");
    PAN_SITUAZDODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_SITUAZDODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZDODICE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_ELABORA, "EE638C56-010A-49FC-829C-2D07E1A3BE79");
    PAN_SITUAZDODICE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_ELABORA, "Elabora");
    PAN_SITUAZDODICE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZDODICE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_ELABORA, 0, "button1.gif", false);
    PAN_SITUAZDODICE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_SITUAZDODICE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SITUAZDODICE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_MESE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_MESE, MyGlb.PANEL_LIST, 32);
    PAN_SITUAZDODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_MESE, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZDODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_MESE, MyGlb.PANEL_LIST, "Mese");
    PAN_SITUAZDODICE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_MESE, MyGlb.PANEL_FORM, 68, 12, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_MESE, MyGlb.PANEL_FORM, 40);
    PAN_SITUAZDODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_MESE, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZDODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_MESE, MyGlb.PANEL_FORM, "Mese");
    PAN_SITUAZDODICE.SetFieldPage(PFL_SITUAZDODICE_MESE, -1, -1);
    PAN_SITUAZDODICE.SetFieldPanel(PFL_SITUAZDODICE_MESE, PPQRY_PAR13, "A.ROWNAMEMESI", "ROWNAMEMESI", 1, 2, 0, -13997);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_MESE, (new IDVariant(1)), "Gennaio", "", "", -1);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_MESE, (new IDVariant(2)), "Febbraio", "", "", -1);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_MESE, (new IDVariant(3)), "Marzo", "", "", -1);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_MESE, (new IDVariant(4)), "Aprile", "", "", -1);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_MESE, (new IDVariant(5)), "Maggio", "", "", -1);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_MESE, (new IDVariant(6)), "Giugno", "", "", -1);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_MESE, (new IDVariant(7)), "Luglio", "", "", -1);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_MESE, (new IDVariant(8)), "Agosto", "", "", -1);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_MESE, (new IDVariant(9)), "Settembre", "", "", -1);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_MESE, (new IDVariant(10)), "Ottobre", "", "", -1);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_MESE, (new IDVariant(11)), "Novembre", "", "", -1);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_MESE, (new IDVariant(12)), "Dicembre", "", "", -1);
    PAN_SITUAZDODICE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DETTAGCAPITO, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DETTAGCAPITO, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZDODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZDODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capit.");
    PAN_SITUAZDODICE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DETTAGCAPITO, MyGlb.PANEL_FORM, 36, 44, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DETTAGCAPITO, MyGlb.PANEL_FORM, 144);
    PAN_SITUAZDODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZDODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_SITUAZDODICE.SetFieldPage(PFL_SITUAZDODICE_DETTAGCAPITO, -1, -1);
    PAN_SITUAZDODICE.SetFieldPanel(PFL_SITUAZDODICE_DETTAGCAPITO, PPQRY_PAR13, "A.ROWNAMDETCAP", "ROWNAMDETCAP", 5, 2, 0, -13997);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_DETTAGCAPITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_SITUAZDODICE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_SITUAZDODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZDODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, MyGlb.PANEL_LIST, "Desc. Int.");
    PAN_SITUAZDODICE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, MyGlb.PANEL_FORM, 36, 72, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, MyGlb.PANEL_FORM, 144);
    PAN_SITUAZDODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZDODICE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizione Intervento");
    PAN_SITUAZDODICE.SetFieldPage(PFL_SITUAZDODICE_DESCRIINTERV, -1, -1);
    PAN_SITUAZDODICE.SetFieldPanel(PFL_SITUAZDODICE_DESCRIINTERV, PPQRY_PAR13, "A.ROWNAMDESINT", "ROWNAMDESINT", 5, 2, 0, -13997);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_DESCRIINTERV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SITUAZDODICE.SetValueListItem(PFL_SITUAZDODICE_DESCRIINTERV, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_SITUAZDODICE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_ELABORA, MyGlb.PANEL_LIST, 48, 100, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZDODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZDODICE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_ELABORA, MyGlb.PANEL_FORM, 124, 124, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZDODICE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZDODICE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZDODICE_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZDODICE.SetFieldPage(PFL_SITUAZDODICE_ELABORA, -1, -1);
    PAN_SITUAZDODICE.SetFieldPanel(PFL_SITUAZDODICE_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_SITUAZDODICE_InitQueries()
  {
    StringBuffer SQL;

    PAN_SITUAZDODICE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SITUAZDODICE.SetIMDB(IMDB, "PQRY_PAR13", true);
    PAN_SITUAZDODICE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_SITUAZDODICE.SetQueryIMDB(PPQRY_PAR13, IMDBDef13.PQRY_PAR13_RS, IMDBDef4.TBL_PAR16);
    JustLoaded = true;
    PAN_SITUAZDODICE.SetFieldPrimaryIndex(PFL_SITUAZDODICE_MESE, IMDBDef4.FLD_PAR16_ROWNAMEMESI);
    PAN_SITUAZDODICE.SetFieldPrimaryIndex(PFL_SITUAZDODICE_DETTAGCAPITO, IMDBDef4.FLD_PAR16_ROWNAMDETCAP);
    PAN_SITUAZDODICE.SetFieldPrimaryIndex(PFL_SITUAZDODICE_DESCRIINTERV, IMDBDef4.FLD_PAR16_ROWNAMDESINT);
    PAN_SITUAZDODICE.SetMasterTable(0, "PAR16");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SITUAZDODICE.Status() == 2)
    {
      int oldListQBE = PAN_SITUAZDODICE.iUseListQBE;
      PAN_SITUAZDODICE.iUseListQBE = 0;
      PAN_SITUAZDODICE.PanelCommand(Glb.PCM_SEARCH);
      PAN_SITUAZDODICE.PanelCommand(Glb.PCM_FIND);
      PAN_SITUAZDODICE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SITUAZDODICE) PAN_SITUAZDODICE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITUAZDODICE) PAN_SITUAZDODICE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SITUAZDODICE) PAN_SITUAZDODICE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITUAZDODICE) PAN_SITUAZDODICE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SITUAZDODICE) PAN_SITUAZDODICE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
