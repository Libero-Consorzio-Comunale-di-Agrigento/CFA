// **********************************************
// Scelta Impegno Anno Precedente
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaImpegnoAnnoPrecedente extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_SCELTIMPEGAP_DELIBERA = 0;

  private static int PFL_SCELTIMPEGAP_NUMERO = 0;
  private static int PFL_SCELTIMPEGAP_ANNO = 1;
  private static int PFL_SCELTIMPEGAP_INFOIMPEGNO = 2;
  private static int PFL_SCELTIMPEGAP_IMPEGNO = 3;
  private static int PFL_SCELTIMPEGAP_DESCRIZIONE = 4;
  private static int PFL_SCELTIMPEGAP_CAPITOLO = 5;
  private static int PFL_SCELTIMPEGAP_ART = 6;
  private static int PFL_SCELTIMPEGAP_UOUTILIZZO = 7;
  private static int PFL_SCELTIMPEGAP_DISPEFFETTIV = 8;
  private static int PFL_SCELTIMPEGAP_IMPEGNOBBLIG = 9;
  private static int PFL_SCELTIMPEGAP_SEDEDEL = 10;
  private static int PFL_SCELTIMPEGAP_NUMERODEL = 11;
  private static int PFL_SCELTIMPEGAP_ANNODEL = 12;

  private static int PPQRY_IMP6 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_SCELTIMPEGAP;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRSIAP(IMDB);
    //
    //
    Init_PQRY_IMP6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRSIAP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRSIAP, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRSIAP, "TBL_PARAMETRSIAP");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRSIAP,IMDBDef1.FLD_PARAMETRSIAP_ROWNAMPROUNI, "ROWNAMPROUNI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRSIAP,IMDBDef1.FLD_PARAMETRSIAP_ROWNAMPROUNI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRSIAP,IMDBDef1.FLD_PARAMETRSIAP_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRSIAP,IMDBDef1.FLD_PARAMETRSIAP_ROWNAMECAPIT,1,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRSIAP,IMDBDef1.FLD_PARAMETRSIAP_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRSIAP,IMDBDef1.FLD_PARAMETRSIAP_ROWNAMEARTIC,1,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRSIAP, 0);
  }

  private static void Init_PQRY_IMP6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_IMP6, 11);
    IMDB.set_TblCode(IMDBDef7.PQRY_IMP6, "PQRY_IMP6");
    IMDB.set_FldCode(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ESEIMUOUTILI, "ESEIMUOUTILI");
    IMDB.SetFldParams(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ESEIMUOUTILI,5,99,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ESEIDISPEFFE, "ESEIDISPEFFE");
    IMDB.SetFldParams(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ESEIDISPEFFE,3,28,6);
    IMDB.set_FldCode(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ESEIMPSEDDEL, "ESEIMPSEDDEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ESEIMPSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ESEIMPANNDEL, "ESEIMPANNDEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ESEIMPANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ESEIMPNUMDEL, "ESEIMPNUMDEL");
    IMDB.SetFldParams(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ESEIMPNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ESEIMPIMPOBB, "ESEIMPIMPOBB");
    IMDB.SetFldParams(IMDBDef7.PQRY_IMP6,IMDBDef7.PQSL_IMP6_ESEIMPIMPOBB,5,2,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_IMP6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaImpegnoAnnoPrecedente(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaImpegnoAnnoPrecedente()
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
    FormIdx = MyGlb.FRM_SCEIMPANNPRE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "18DC6704-77F9-4423-92B9-C9AE4F57521C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 956;
    DesignHeight = 366;
    set_Caption(new IDVariant("Scelta Impegno Anno Precedente"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 956;
    Frames[1].Height = 340;
    Frames[1].Caption = "Impegni Esercizi Precedenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 340;
    PAN_SCELTIMPEGAP = new IDPanel(w, this, 1, "PAN_SCELTIMPEGAP");
    Frames[1].Content = PAN_SCELTIMPEGAP;
    PAN_SCELTIMPEGAP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCELTIMPEGAP.VS = MainFrm.VisualStyleList;
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 956-MyGlb.PAN_OFFS_X, 340-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4ACDD9D0-4BC4-47F9-A01E-A8820C677BF1");
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 920, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCELTIMPEGAP.InitStatus = 1;
    PAN_SCELTIMPEGAP_Init();
    PAN_SCELTIMPEGAP_InitFields();
    PAN_SCELTIMPEGAP_InitQueries();
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
      PAN_SCELTIMPEGAP.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaImpegnoAnnoPrecedente);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaImpegnoAnnoPrecedente.class.getName() : (Glb.ClassWithPackage(SceltaImpegnoAnnoPrecedente.class) ? SceltaImpegnoAnnoPrecedente.class.getName().substring(SceltaImpegnoAnnoPrecedente.class.getPackage().getName().length() + 1) : SceltaImpegnoAnnoPrecedente.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scelta Impegno AP On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCELTIMPEGAP_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCELTIMPEGAP);
      // 
      // Scelta Impegno AP On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SCELTIMPEGAP.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTIMPEGAP_UOUTILIZZO,(new IDVariant(PAN_SCELTIMPEGAP.FieldText(PFL_SCELTIMPEGAP_UOUTILIZZO))).stringValue()); 
      PAN_SCELTIMPEGAP.set_ToolTip(Glb.OBJ_FIELD,PFL_SCELTIMPEGAP_DESCRIZIONE,(new IDVariant(PAN_SCELTIMPEGAP.FieldText(PFL_SCELTIMPEGAP_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaImpegnoAnnoPrecedente", "SceltaImpegnoAPOnDynamicPropertiesEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Scelta Impegno ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IDVariant v_ESERCIZIPREC = null;
      v_ESERCIZIPREC = IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)));
      set_Caption(IDL.Add(v_CAPTION, IDL.ToString(v_ESERCIZIPREC)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaImpegnoAnnoPrecedente", "LoadEvent", _e);
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
      UNLOADEVENT_PARASIAPDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaImpegnoAnnoPrecedente", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri SIAP: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PARASIAPDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRSIAP, IMDBDef1.FLD_PARAMETRSIAP_ROWNAMPROUNI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRSIAP, IMDBDef1.FLD_PARAMETRSIAP_ROWNAMECAPIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRSIAP, IMDBDef1.FLD_PARAMETRSIAP_ROWNAMEARTIC, 0, new IDVariant());
  }

  // **********************************************************************
  // Info
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Info ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef7.PQRY_IMP6, IMDBDef7.PQSL_IMP6_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef7.PQRY_IMP6, IMDBDef7.PQSL_IMP6_NUMERO_IMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.PQRY_IMP6, IMDBDef7.PQSL_IMP6_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.PQRY_IMP6, IMDBDef7.PQSL_IMP6_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaImpegnoAnnoPrecedente", "Info", _e);
      return -1;
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
  private void PAN_SCELTIMPEGAP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCELTIMPEGAP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCELTIMPEGAP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCELTIMPEGAP, Cancel);
    // Stub
  }

  private void PAN_SCELTIMPEGAP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SCELTIMPEGAP_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_SCELTIMPEGAP.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Info();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SCELTIMPEGAP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCELTIMPEGAP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCELTIMPEGAP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCELTIMPEGAP_Init()
  {

    PAN_SCELTIMPEGAP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCELTIMPEGAP.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCELTIMPEGAP_DELIBERA, "30B68969-2746-4476-A3FC-1DDE8FE38225");
    PAN_SCELTIMPEGAP.set_Header(MyGlb.OBJ_GROUP, GRP_SCELTIMPEGAP_DELIBERA, "Delibera");
    PAN_SCELTIMPEGAP.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCELTIMPEGAP_DELIBERA, "");
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCELTIMPEGAP_DELIBERA, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTIMPEGAP_DELIBERA, MyGlb.PANEL_LIST, 764, -9999, 156, 16, 0, 0);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_GROUP, GRP_SCELTIMPEGAP_DELIBERA, MyGlb.PANEL_FORM, 0, 327, 132, 97, 0, 0);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTIMPEGAP_DELIBERA, 0, 47);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCELTIMPEGAP_DELIBERA, 1, 13);
    PAN_SCELTIMPEGAP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTIMPEGAP_DELIBERA, 0, 4);
    PAN_SCELTIMPEGAP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCELTIMPEGAP_DELIBERA, 1, 4);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_GROUP, GRP_SCELTIMPEGAP_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCELTIMPEGAP.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERO, "0D4A3E9C-7AA0-4587-859E-96C9BF1CFEF2");
    PAN_SCELTIMPEGAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERO, "Numero");
    PAN_SCELTIMPEGAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERO, "");
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNO, "2BB2270E-4103-4022-8AA2-7CEA0E3005C3");
    PAN_SCELTIMPEGAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNO, "Anno");
    PAN_SCELTIMPEGAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNO, "Anno");
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_INFOIMPEGNO, "37E33B24-BAFB-41E1-AA0D-B024411D79B3");
    PAN_SCELTIMPEGAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_INFOIMPEGNO, "Info Impegno");
    PAN_SCELTIMPEGAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_INFOIMPEGNO, "");
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_INFOIMPEGNO, MyGlb.VIS_HYPLINIMLOU1);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_INFOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNO, "5826AF5B-DA90-4222-8986-4A2E0621AEED");
    PAN_SCELTIMPEGAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNO, "Impegno");
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DESCRIZIONE, "95C05738-3696-4C66-96FE-EF0DAD03D5B9");
    PAN_SCELTIMPEGAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DESCRIZIONE, "Descrizione");
    PAN_SCELTIMPEGAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DESCRIZIONE, "Descrizione");
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_CAPITOLO, "25E577E4-AAF6-4532-A4D2-5DD15F8BBEA2");
    PAN_SCELTIMPEGAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_CAPITOLO, "Capitolo");
    PAN_SCELTIMPEGAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_CAPITOLO, "Capitolo");
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ART, "77A1DFA2-3096-4A1E-902E-4DF987947C3E");
    PAN_SCELTIMPEGAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ART, "Art.");
    PAN_SCELTIMPEGAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ART, "Articolo");
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ART, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_UOUTILIZZO, "C89B7C0E-BB15-4B13-AD37-C330DD25FF72");
    PAN_SCELTIMPEGAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_UOUTILIZZO, "U.O. Utilizzo");
    PAN_SCELTIMPEGAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_UOUTILIZZO, "");
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_UOUTILIZZO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_UOUTILIZZO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DISPEFFETTIV, "02980B74-5C1F-4624-BF00-13EDDFB2F8E8");
    PAN_SCELTIMPEGAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DISPEFFETTIV, "Disp. Effettiva");
    PAN_SCELTIMPEGAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DISPEFFETTIV, "");
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DISPEFFETTIV, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DISPEFFETTIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNOBBLIG, "20D7A463-CA99-47BD-805F-FF65670E1F0E");
    PAN_SCELTIMPEGAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNOBBLIG, "Ob.");
    PAN_SCELTIMPEGAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNOBBLIG, "");
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNOBBLIG, MyGlb.VIS_CHECKSTYLE);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNOBBLIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_SEDEDEL, "FD69498D-7845-41B7-9925-8729DE3FFACA");
    PAN_SCELTIMPEGAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_SEDEDEL, "Sede");
    PAN_SCELTIMPEGAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_SEDEDEL, "");
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERODEL, "0C142705-15CD-41AE-9015-F9062C8DBEB2");
    PAN_SCELTIMPEGAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERODEL, "Numero");
    PAN_SCELTIMPEGAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERODEL, "");
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCELTIMPEGAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNODEL, "59FE1682-42F4-41B4-A327-5C3E3A8C6F6D");
    PAN_SCELTIMPEGAP.set_Header(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNODEL, "Anno");
    PAN_SCELTIMPEGAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNODEL, "");
    PAN_SCELTIMPEGAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCELTIMPEGAP.SetFlags(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCELTIMPEGAP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERO, MyGlb.PANEL_LIST, 72);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERO, MyGlb.PANEL_LIST, "Num.");
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERO, MyGlb.PANEL_FORM, 4, 64, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERO, MyGlb.PANEL_FORM, 72);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTIMPEGAP.SetFieldPage(PFL_SCELTIMPEGAP_NUMERO, -1, -1);
    PAN_SCELTIMPEGAP.SetFieldPanel(PFL_SCELTIMPEGAP_NUMERO, PPQRY_IMP6, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNO, MyGlb.PANEL_LIST, 40, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNO, MyGlb.PANEL_LIST, 60);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNO, MyGlb.PANEL_FORM, 4, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNO, MyGlb.PANEL_FORM, 60);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTIMPEGAP.SetFieldPage(PFL_SCELTIMPEGAP_ANNO, -1, -1);
    PAN_SCELTIMPEGAP.SetFieldPanel(PFL_SCELTIMPEGAP_ANNO, PPQRY_IMP6, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_INFOIMPEGNO, MyGlb.PANEL_LIST, 76, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_INFOIMPEGNO, MyGlb.PANEL_LIST, 104);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_INFOIMPEGNO, MyGlb.PANEL_LIST, "I. I.");
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_INFOIMPEGNO, MyGlb.PANEL_FORM, 4, 304, 536, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_INFOIMPEGNO, MyGlb.PANEL_FORM, 104);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_INFOIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_INFOIMPEGNO, MyGlb.PANEL_FORM, "Info Impegno");
    PAN_SCELTIMPEGAP.SetFieldPage(PFL_SCELTIMPEGAP_INFOIMPEGNO, -1, -1);
    PAN_SCELTIMPEGAP.SetFieldPanel(PFL_SCELTIMPEGAP_INFOIMPEGNO, PPQRY_DUAL, "'I'", "DUALINFOIMPE", 5, 1, 0, -13997);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_INFOIMPEGNO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNO, MyGlb.PANEL_LIST, 0, 0, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNO, MyGlb.PANEL_FORM, 8, 8, 120, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIMPEGAP.SetFieldPage(PFL_SCELTIMPEGAP_IMPEGNO, -1, -1);
    PAN_SCELTIMPEGAP.SetFieldPanel(PFL_SCELTIMPEGAP_IMPEGNO, -1, "", "IMPEGNO", 0, 0, 0, -13997);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DESCRIZIONE, MyGlb.PANEL_LIST, 100, 36, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 4, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCELTIMPEGAP.SetFieldPage(PFL_SCELTIMPEGAP_DESCRIZIONE, -1, -1);
    PAN_SCELTIMPEGAP.SetFieldPanel(PFL_SCELTIMPEGAP_DESCRIZIONE, PPQRY_IMP6, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_CAPITOLO, MyGlb.PANEL_LIST, 312, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_CAPITOLO, MyGlb.PANEL_LIST, 116);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_CAPITOLO, MyGlb.PANEL_FORM, 4, 112, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SCELTIMPEGAP.SetFieldPage(PFL_SCELTIMPEGAP_CAPITOLO, -1, -1);
    PAN_SCELTIMPEGAP.SetFieldPanel(PFL_SCELTIMPEGAP_CAPITOLO, PPQRY_IMP6, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ART, MyGlb.PANEL_LIST, 436, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ART, MyGlb.PANEL_LIST, 60);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ART, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ART, MyGlb.PANEL_LIST, "Art.");
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ART, MyGlb.PANEL_FORM, 4, 136, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ART, MyGlb.PANEL_FORM, 60);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ART, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ART, MyGlb.PANEL_FORM, "Art.");
    PAN_SCELTIMPEGAP.SetFieldPage(PFL_SCELTIMPEGAP_ART, -1, -1);
    PAN_SCELTIMPEGAP.SetFieldPanel(PFL_SCELTIMPEGAP_ART, PPQRY_IMP6, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_UOUTILIZZO, MyGlb.PANEL_LIST, 468, 36, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_UOUTILIZZO, MyGlb.PANEL_LIST, 64);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_UOUTILIZZO, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_UOUTILIZZO, MyGlb.PANEL_LIST, "U.O. Utilizzo");
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_UOUTILIZZO, MyGlb.PANEL_FORM, 4, 184, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_UOUTILIZZO, MyGlb.PANEL_FORM, 64);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_UOUTILIZZO, MyGlb.PANEL_FORM, 2);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_UOUTILIZZO, MyGlb.PANEL_FORM, "U.O. Utilizzo");
    PAN_SCELTIMPEGAP.SetFieldPage(PFL_SCELTIMPEGAP_UOUTILIZZO, -1, -1);
    PAN_SCELTIMPEGAP.SetFieldUnbound(PFL_SCELTIMPEGAP_UOUTILIZZO, true);
    PAN_SCELTIMPEGAP.SetFieldPanel(PFL_SCELTIMPEGAP_UOUTILIZZO, PPQRY_IMP6, "DECODE(GET_UO_UTILIZZO(B.ESERCIZIO,A.S,B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE )), to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(GET_UO_UTILIZZO(B.ESERCIZIO,A.S,B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE )),TRUNC( SYSDATE )))", "ESEIMUOUTILI", 5, 99, 0, -13997);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DISPEFFETTIV, MyGlb.PANEL_LIST, 636, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DISPEFFETTIV, MyGlb.PANEL_LIST, 76);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DISPEFFETTIV, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DISPEFFETTIV, MyGlb.PANEL_LIST, "Disp. Effettiva");
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DISPEFFETTIV, MyGlb.PANEL_FORM, 4, 280, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DISPEFFETTIV, MyGlb.PANEL_FORM, 76);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DISPEFFETTIV, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_DISPEFFETTIV, MyGlb.PANEL_FORM, "Dsp. Effet.");
    PAN_SCELTIMPEGAP.SetFieldPage(PFL_SCELTIMPEGAP_DISPEFFETTIV, -1, -1);
    PAN_SCELTIMPEGAP.SetFieldUnbound(PFL_SCELTIMPEGAP_DISPEFFETTIV, true);
    PAN_SCELTIMPEGAP.SetFieldPanel(PFL_SCELTIMPEGAP_DISPEFFETTIV, PPQRY_IMP6, "MAX(CF4WEB_GET_IMPORTI_SCHEDA_INFO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',to_number(NULL),to_number(NULL),to_number(NULL),A.CAPITOLO,A.ARTICOLO,A.ANNO_IMP,A.NUMERO_IMP,NULL,NULL,NULL,A.PROGR_UNITA_ORGANIZZATIVA,'DISP_EFF'))", "ESEIDISPEFFE", 3, 28, 6, -13997);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNOBBLIG, MyGlb.PANEL_LIST, 740, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNOBBLIG, MyGlb.PANEL_LIST, 104);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNOBBLIG, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNOBBLIG, MyGlb.PANEL_LIST, "Ob.");
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNOBBLIG, MyGlb.PANEL_FORM, 4, 424, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNOBBLIG, MyGlb.PANEL_FORM, 104);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNOBBLIG, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_IMPEGNOBBLIG, MyGlb.PANEL_FORM, "Ob.");
    PAN_SCELTIMPEGAP.SetFieldPage(PFL_SCELTIMPEGAP_IMPEGNOBBLIG, -1, -1);
    PAN_SCELTIMPEGAP.SetFieldPanel(PFL_SCELTIMPEGAP_IMPEGNOBBLIG, PPQRY_IMP6, "A.IMPEGNO_OBBLIG", "ESEIMPIMPOBB", 5, 2, 0, -13997);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_IMPEGNOBBLIG, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SCELTIMPEGAP.SetValueListItem(PFL_SCELTIMPEGAP_IMPEGNOBBLIG, (new IDVariant()), "Null", "", "", -1);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_SEDEDEL, MyGlb.PANEL_LIST, 764, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_SEDEDEL, MyGlb.PANEL_LIST, 60);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_SEDEDEL, MyGlb.PANEL_LIST, "Sede");
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_SEDEDEL, MyGlb.PANEL_FORM, 4, 352, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_SEDEDEL, MyGlb.PANEL_FORM, 60);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_SEDEDEL, MyGlb.PANEL_FORM, "Sede");
    PAN_SCELTIMPEGAP.SetFieldPage(PFL_SCELTIMPEGAP_SEDEDEL, -1, GRP_SCELTIMPEGAP_DELIBERA);
    PAN_SCELTIMPEGAP.SetFieldPanel(PFL_SCELTIMPEGAP_SEDEDEL, PPQRY_IMP6, "A.SEDE_DEL", "ESEIMPSEDDEL", 5, 4, 0, -13997);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERODEL, MyGlb.PANEL_LIST, 824, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERODEL, MyGlb.PANEL_LIST, 80);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERODEL, MyGlb.PANEL_LIST, "Numero");
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERODEL, MyGlb.PANEL_FORM, 4, 400, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERODEL, MyGlb.PANEL_FORM, 80);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_NUMERODEL, MyGlb.PANEL_FORM, "Numero");
    PAN_SCELTIMPEGAP.SetFieldPage(PFL_SCELTIMPEGAP_NUMERODEL, -1, GRP_SCELTIMPEGAP_DELIBERA);
    PAN_SCELTIMPEGAP.SetFieldPanel(PFL_SCELTIMPEGAP_NUMERODEL, PPQRY_IMP6, "A.NUMERO_DEL", "ESEIMPNUMDEL", 1, 6, 0, -13997);
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNODEL, MyGlb.PANEL_LIST, 880, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNODEL, MyGlb.PANEL_LIST, 64);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNODEL, MyGlb.PANEL_LIST, "Anno");
    PAN_SCELTIMPEGAP.SetRect(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNODEL, MyGlb.PANEL_FORM, 4, 376, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCELTIMPEGAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_SCELTIMPEGAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_SCELTIMPEGAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCELTIMPEGAP_ANNODEL, MyGlb.PANEL_FORM, "Anno");
    PAN_SCELTIMPEGAP.SetFieldPage(PFL_SCELTIMPEGAP_ANNODEL, -1, GRP_SCELTIMPEGAP_DELIBERA);
    PAN_SCELTIMPEGAP.SetFieldPanel(PFL_SCELTIMPEGAP_ANNODEL, PPQRY_IMP6, "A.ANNO_DEL", "ESEIMPANNDEL", 1, 4, 0, -13997);
  }

  private void PAN_SCELTIMPEGAP_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCELTIMPEGAP.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as DUALINFOIMPE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ANNO_IMP~~ IS NULL)) AND NOT ((~~NUMERO_IMP~~ IS NULL))) ");
    PAN_SCELTIMPEGAP.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_SCELTIMPEGAP.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTIMPEGAP.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_SCELTIMPEGAP.SetIMDB(IMDB, "PQRY_IMP6", true);
    PAN_SCELTIMPEGAP.set_SetString(MyGlb.MASTER_ROWNAME, "ESEIMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  DECODE(GET_UO_UTILIZZO(B.ESERCIZIO,A.S,B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE )), to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(GET_UO_UTILIZZO(B.ESERCIZIO,A.S,B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE )),TRUNC( SYSDATE ))) as ESEIMUOUTILI, ");
    SQL.append("  MAX(CF4WEB_GET_IMPORTI_SCHEDA_INFO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',to_number(NULL),to_number(NULL),to_number(NULL),A.CAPITOLO,A.ARTICOLO,A.ANNO_IMP,A.NUMERO_IMP,NULL,NULL,NULL,A.PROGR_UNITA_ORGANIZZATIVA,'DISP_EFF')) as ESEIDISPEFFE, ");
    SQL.append("  A.SEDE_DEL as ESEIMPSEDDEL, ");
    SQL.append("  A.ANNO_DEL as ESEIMPANNDEL, ");
    SQL.append("  A.NUMERO_DEL as ESEIMPNUMDEL, ");
    SQL.append("  A.IMPEGNO_OBBLIG as ESEIMPIMPOBB ");
    PAN_SCELTIMPEGAP.SetQuery(PPQRY_IMP6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  IMP A, ");
    SQL.append("  ESEIMP B ");
    PAN_SCELTIMPEGAP.SetQuery(PPQRY_IMP6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_IMP = ~~TBL_DATISESSIONE.SESSIOESERCI~~ - 1) ");
    SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRSIAP.ROWNAMPROUNI~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    SQL.append("and   (B.ANNO_IMP(+) = A.ANNO_IMP) ");
    SQL.append("and   (B.NUMERO_IMP(+) = A.NUMERO_IMP) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~ - 1) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRSIAP.ROWNAMECAPIT~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRSIAP.ROWNAMEARTIC~~) ");
    PAN_SCELTIMPEGAP.SetQuery(PPQRY_IMP6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP, ");
    SQL.append("  A.DESCRIZIONE, ");
    SQL.append("  DECODE(GET_UO_UTILIZZO(B.ESERCIZIO,A.S,B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE )), to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(GET_UO_UTILIZZO(B.ESERCIZIO,A.S,B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE )),TRUNC( SYSDATE ))), ");
    SQL.append("  A.SEDE_DEL, ");
    SQL.append("  A.ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL, ");
    SQL.append("  A.IMPEGNO_OBBLIG ");
    PAN_SCELTIMPEGAP.SetQuery(PPQRY_IMP6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCELTIMPEGAP.SetQuery(PPQRY_IMP6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP ");
    PAN_SCELTIMPEGAP.SetQuery(PPQRY_IMP6, 5, SQL, -1, "");
    PAN_SCELTIMPEGAP.SetQueryDB(PPQRY_IMP6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCELTIMPEGAP.SetMasterTable(0, "IMP");
    PAN_SCELTIMPEGAP.AddToSortList(PFL_SCELTIMPEGAP_ANNO, true);
    PAN_SCELTIMPEGAP.AddToSortList(PFL_SCELTIMPEGAP_NUMERO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCELTIMPEGAP.Status() == 2)
    {
      int oldListQBE = PAN_SCELTIMPEGAP.iUseListQBE;
      PAN_SCELTIMPEGAP.iUseListQBE = 0;
      PAN_SCELTIMPEGAP.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCELTIMPEGAP.PanelCommand(Glb.PCM_FIND);
      PAN_SCELTIMPEGAP.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCELTIMPEGAP) PAN_SCELTIMPEGAP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTIMPEGAP) PAN_SCELTIMPEGAP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCELTIMPEGAP) PAN_SCELTIMPEGAP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCELTIMPEGAP) PAN_SCELTIMPEGAP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCELTIMPEGAP) PAN_SCELTIMPEGAP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
