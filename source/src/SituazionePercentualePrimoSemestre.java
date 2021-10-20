// **********************************************
// Situazione Percentuale Primo Semestre
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazionePercentualePrimoSemestre extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SITPERPRISEM_DETTAGCAPITO = 0;
  private static int PFL_SITPERPRISEM_DESCRIINTERV = 1;
  private static int PFL_SITPERPRISEM_ELABORA = 2;

  private static int PPQRY_PAR81 = 0;


  IDPanel PAN_SITPERPRISEM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR102(IMDB);
    //
    //
    Init_PQRY_PAR81(IMDB);
    Init_PQRY_PAR81_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR102(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PAR102, 2);
    IMDB.set_TblCode(IMDBDef4.TBL_PAR102, "TBL_PAR102");
    IMDB.set_FldCode(IMDBDef4.TBL_PAR102,IMDBDef4.FLD_PAR102_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR102,IMDBDef4.FLD_PAR102_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAR102,IMDBDef4.FLD_PAR102_ROWNAMSTDEIN, "ROWNAMSTDEIN");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR102,IMDBDef4.FLD_PAR102_ROWNAMSTDEIN,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PAR102, 0);
  }

  private static void Init_PQRY_PAR81(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PAR81, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PAR81, "PQRY_PAR81");
    IMDB.set_FldCode(IMDBDef13.PQRY_PAR81,IMDBDef13.PQSL_PAR81_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PAR81,IMDBDef13.PQSL_PAR81_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PAR81,IMDBDef13.PQSL_PAR81_ROWNAMSTDEIN, "ROWNAMSTDEIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PAR81,IMDBDef13.PQSL_PAR81_ROWNAMSTDEIN,5,2,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PAR81, 0);
  }

  private static void Init_PQRY_PAR81_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PAR81_RS, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PAR81_RS, "PQRY_PAR81_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PAR81_RS,IMDBDef13.PQSL_PAR81_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PAR81_RS,IMDBDef13.PQSL_PAR81_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PAR81_RS,IMDBDef13.PQSL_PAR81_ROWNAMSTDEIN, "ROWNAMSTDEIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PAR81_RS,IMDBDef13.PQSL_PAR81_ROWNAMSTDEIN,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazionePercentualePrimoSemestre(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazionePercentualePrimoSemestre()
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
    FormIdx = MyGlb.FRM_SITPERPRISEM;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1D5E82E6-9B0D-45EF-9125-BB4119DCDB4B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 240;
    DesignHeight = 154;
    set_Caption(new IDVariant("Situazione Percentuale Primo Semestre"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 240;
    Frames[1].Height = 128;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Situazione Percentuale Primo Semestre";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 128;
    PAN_SITPERPRISEM = new IDPanel(w, this, 1, "PAN_SITPERPRISEM");
    Frames[1].Content = PAN_SITPERPRISEM;
    PAN_SITPERPRISEM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SITPERPRISEM.VS = MainFrm.VisualStyleList;
    PAN_SITPERPRISEM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 240-MyGlb.PAN_OFFS_X, 128-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SITPERPRISEM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "62898965-C168-4AC6-A7A7-0DB878697988");
    PAN_SITPERPRISEM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITPERPRISEM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SITPERPRISEM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SITPERPRISEM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SITPERPRISEM.InitStatus = 2;
    PAN_SITPERPRISEM_Init();
    PAN_SITPERPRISEM_InitFields();
    PAN_SITPERPRISEM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PAR102, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITPERPRISEM_PAR81();
      }
      PAN_SITPERPRISEM.UpdatePanel(MainFrm);
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
    return (obj instanceof SituazionePercentualePrimoSemestre);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazionePercentualePrimoSemestre.class.getName() : (Glb.ClassWithPackage(SituazionePercentualePrimoSemestre.class) ? SituazionePercentualePrimoSemestre.class.getName().substring(SituazionePercentualePrimoSemestre.class.getPackage().getName().length() + 1) : SituazionePercentualePrimoSemestre.class.getName()));
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
      v_DW = (new IDVariant("d_sitperc1seme_stampa", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef13.PQRY_PAR81, IMDBDef13.PQSL_PAR81_ROWNAMDETCAP, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef13.PQRY_PAR81, IMDBDef13.PQSL_PAR81_ROWNAMSTDEIN, 0));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazionePercentualePrimoSemestre", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Situazione Percentuale Primo Semestre On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SITPERPRISEM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SITPERPRISEM);
      // 
      // Situazione Percentuale Primo Semestre On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef13.PQRY_PAR81, IMDBDef13.PQSL_PAR81_ROWNAMDETCAP, 0).equals((new IDVariant("NO")), true))
      {
        PAN_SITPERPRISEM.SetFlags (Glb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SITPERPRISEM.SetFlags (Glb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazionePercentualePrimoSemestre", "SituazionePercentualePrimoSemestreOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Situazione Percentuale Primo Semestre On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_SITPERPRISEM_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Situazione Percentuale Primo Semestre On Change Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef13.PQRY_PAR81, IMDBDef13.PQSL_PAR81_ROWNAMDETCAP, 0).equals((new IDVariant("NO")), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PAR102, IMDBDef4.FLD_PAR102_ROWNAMSTDEIN, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazionePercentualePrimoSemestre", "SituazionePercentualePrimoSemestreOnChangeRowEvent", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PAR102, IMDBDef4.FLD_PAR102_ROWNAMDETCAP, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef4.TBL_PAR102, IMDBDef4.FLD_PAR102_ROWNAMSTDEIN, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazionePercentualePrimoSemestre", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void SITPERPRISEM_PAR81() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PAR81_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PAR102, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PAR102, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PAR81_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PAR81_RS, 0, IMDBDef4.TBL_PAR102, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PAR81_RS, 0, 0, IMDBDef4.TBL_PAR102, IMDBDef4.FLD_PAR102_ROWNAMDETCAP, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PAR81_RS, 1, 0, IMDBDef4.TBL_PAR102, IMDBDef4.FLD_PAR102_ROWNAMSTDEIN, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PAR102, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PAR102, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PAR102, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PAR81_RS, 0);
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
  private void PAN_SITPERPRISEM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SITPERPRISEM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SITPERPRISEM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SITPERPRISEM, Cancel);
    // Stub
  }

  private void PAN_SITPERPRISEM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SITPERPRISEM_ELABORA)
    {
      this.IdxPanelActived = this.PAN_SITPERPRISEM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SITPERPRISEM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SITPERPRISEM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SITPERPRISEM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SITPERPRISEM_Init()
  {

    PAN_SITPERPRISEM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SITPERPRISEM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SITPERPRISEM.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_SITPERPRISEM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DETTAGCAPITO, "01959D3E-A4C5-4F59-992E-CA4271E61520");
    PAN_SITPERPRISEM.set_Header(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_SITPERPRISEM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DETTAGCAPITO, "");
    PAN_SITPERPRISEM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_SITPERPRISEM.SetFlags(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SITPERPRISEM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, "299C3598-0C74-441D-B56C-95429DBFF42A");
    PAN_SITPERPRISEM.set_Header(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, "Descrizione Intervento");
    PAN_SITPERPRISEM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, "");
    PAN_SITPERPRISEM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_SITPERPRISEM.SetFlags(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SITPERPRISEM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_ELABORA, "1BE07807-D996-427A-9D8C-0A04B269A668");
    PAN_SITPERPRISEM.set_Header(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_ELABORA, "Elabora");
    PAN_SITPERPRISEM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_SITPERPRISEM.SetImage(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_ELABORA, 0, "button1.gif", false);
    PAN_SITPERPRISEM.SetFlags(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_SITPERPRISEM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SITPERPRISEM.SetRect(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DETTAGCAPITO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITPERPRISEM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DETTAGCAPITO, MyGlb.PANEL_LIST, 92);
    PAN_SITPERPRISEM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_SITPERPRISEM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capit.");
    PAN_SITPERPRISEM.SetRect(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DETTAGCAPITO, MyGlb.PANEL_FORM, 68, 8, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITPERPRISEM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DETTAGCAPITO, MyGlb.PANEL_FORM, 112);
    PAN_SITPERPRISEM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_SITPERPRISEM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_SITPERPRISEM.SetFieldPage(PFL_SITPERPRISEM_DETTAGCAPITO, -1, -1);
    PAN_SITPERPRISEM.SetFieldPanel(PFL_SITPERPRISEM_DETTAGCAPITO, PPQRY_PAR81, "A.ROWNAMDETCAP", "ROWNAMDETCAP", 5, 2, 0, -13997);
    PAN_SITPERPRISEM.SetValueListItem(PFL_SITPERPRISEM_DETTAGCAPITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SITPERPRISEM.SetValueListItem(PFL_SITPERPRISEM_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_SITPERPRISEM.SetRect(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITPERPRISEM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, MyGlb.PANEL_LIST, 156);
    PAN_SITPERPRISEM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_SITPERPRISEM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, MyGlb.PANEL_LIST, "Desc. Int.");
    PAN_SITPERPRISEM.SetRect(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, MyGlb.PANEL_FORM, 40, 32, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITPERPRISEM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, MyGlb.PANEL_FORM, 140);
    PAN_SITPERPRISEM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_SITPERPRISEM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizione Intervento");
    PAN_SITPERPRISEM.SetFieldPage(PFL_SITPERPRISEM_DESCRIINTERV, -1, -1);
    PAN_SITPERPRISEM.SetFieldPanel(PFL_SITPERPRISEM_DESCRIINTERV, PPQRY_PAR81, "A.ROWNAMSTDEIN", "ROWNAMSTDEIN", 5, 2, 0, -13997);
    PAN_SITPERPRISEM.SetValueListItem(PFL_SITPERPRISEM_DESCRIINTERV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SITPERPRISEM.SetValueListItem(PFL_SITPERPRISEM_DESCRIINTERV, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_SITPERPRISEM.SetRect(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_ELABORA, MyGlb.PANEL_LIST, 120, 52, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITPERPRISEM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_SITPERPRISEM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_SITPERPRISEM.SetRect(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_ELABORA, MyGlb.PANEL_FORM, 124, 68, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITPERPRISEM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_SITPERPRISEM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITPERPRISEM_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_SITPERPRISEM.SetFieldPage(PFL_SITPERPRISEM_ELABORA, -1, -1);
    PAN_SITPERPRISEM.SetFieldPanel(PFL_SITPERPRISEM_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_SITPERPRISEM_InitQueries()
  {
    StringBuffer SQL;

    PAN_SITPERPRISEM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SITPERPRISEM.SetIMDB(IMDB, "PQRY_PAR81", true);
    PAN_SITPERPRISEM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_SITPERPRISEM.SetQueryIMDB(PPQRY_PAR81, IMDBDef13.PQRY_PAR81_RS, IMDBDef4.TBL_PAR102);
    JustLoaded = true;
    PAN_SITPERPRISEM.SetFieldPrimaryIndex(PFL_SITPERPRISEM_DETTAGCAPITO, IMDBDef4.FLD_PAR102_ROWNAMDETCAP);
    PAN_SITPERPRISEM.SetFieldPrimaryIndex(PFL_SITPERPRISEM_DESCRIINTERV, IMDBDef4.FLD_PAR102_ROWNAMSTDEIN);
    PAN_SITPERPRISEM.SetMasterTable(0, "PAR102");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SITPERPRISEM.Status() == 2)
    {
      int oldListQBE = PAN_SITPERPRISEM.iUseListQBE;
      PAN_SITPERPRISEM.iUseListQBE = 0;
      PAN_SITPERPRISEM.PanelCommand(Glb.PCM_SEARCH);
      PAN_SITPERPRISEM.PanelCommand(Glb.PCM_FIND);
      PAN_SITPERPRISEM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SITPERPRISEM) PAN_SITPERPRISEM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITPERPRISEM) PAN_SITPERPRISEM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SITPERPRISEM) PAN_SITPERPRISEM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITPERPRISEM) PAN_SITPERPRISEM_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SITPERPRISEM) PAN_SITPERPRISEM_OnChangeRow();
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
    if (SrcObj == PAN_SITPERPRISEM) PAN_SITPERPRISEM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
