// **********************************************
// Generazione Imputazione Economica 2
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GenerazioneImputazioneEconomica2 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_NEWTABLE_NEWFIELD = 0;
  private static int PFL_NEWTABLE_STR1 = 1;
  private static int PFL_NEWTABLE_STR2 = 2;
  private static int PFL_NEWTABLE_STR3 = 3;
  private static int PFL_NEWTABLE_STR4 = 4;
  private static int PFL_NEWTABLE_SIBUTTON = 5;
  private static int PFL_NEWTABLE_NOBUTTON = 6;

  private static int PPQRY_NEWTABLE30 = 0;


  IDPanel PAN_NEWTABLE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE18(IMDB);
    //
    //
    Init_PQRY_NEWTABLE30(IMDB);
    Init_PQRY_NEWTABLE30_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE18(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_NEWTABLE18, 1);
    IMDB.set_TblCode(IMDBDef2.TBL_NEWTABLE18, "TBL_NEWTABLE18");
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE18,IMDBDef2.FLD_NEWTABLE18_ROWNAMNEWFIE, "ROWNAMNEWFIE");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE18,IMDBDef2.FLD_NEWTABLE18_ROWNAMNEWFIE,5,49,0);
    IMDB.TblAddNew(IMDBDef2.TBL_NEWTABLE18, 0);
  }

  private static void Init_PQRY_NEWTABLE30(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_NEWTABLE30, 1);
    IMDB.set_TblCode(IMDBDef9.PQRY_NEWTABLE30, "PQRY_NEWTABLE30");
    IMDB.set_FldCode(IMDBDef9.PQRY_NEWTABLE30,IMDBDef9.PQSL_NEWTABLE30_ROWNAMNEWFIE, "ROWNAMNEWFIE");
    IMDB.SetFldParams(IMDBDef9.PQRY_NEWTABLE30,IMDBDef9.PQSL_NEWTABLE30_ROWNAMNEWFIE,5,49,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_NEWTABLE30, 0);
  }

  private static void Init_PQRY_NEWTABLE30_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_NEWTABLE30_RS, 1);
    IMDB.set_TblCode(IMDBDef9.PQRY_NEWTABLE30_RS, "PQRY_NEWTABLE30_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_NEWTABLE30_RS,IMDBDef9.PQSL_NEWTABLE30_ROWNAMNEWFIE, "ROWNAMNEWFIE");
    IMDB.SetFldParams(IMDBDef9.PQRY_NEWTABLE30_RS,IMDBDef9.PQSL_NEWTABLE30_ROWNAMNEWFIE,5,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GenerazioneImputazioneEconomica2(MyWebEntryPoint w, IMDBObj imdb)
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
  public GenerazioneImputazioneEconomica2()
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
    FormIdx = MyGlb.FRM_GENEIMPUECO2;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5B2E2EBA-12E9-4652-A6A4-7BF3D943174D";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 424;
    DesignHeight = 218;
    set_Caption(new IDVariant("Generazione Imputazione Economica 2"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 424;
    Frames[1].Height = 192;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "New Table";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 192;
    PAN_NEWTABLE = new IDPanel(w, this, 1, "PAN_NEWTABLE");
    Frames[1].Content = PAN_NEWTABLE;
    PAN_NEWTABLE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NEWTABLE.VS = MainFrm.VisualStyleList;
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 424-MyGlb.PAN_OFFS_X, 192-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NEWTABLE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5C181CF0-CD11-4510-BB5E-C3593C209A6B");
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 356, 252, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NEWTABLE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NEWTABLE.InitStatus = 2;
    PAN_NEWTABLE_Init();
    PAN_NEWTABLE_InitFields();
    PAN_NEWTABLE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_NEWTABLE18, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENEIMPUECO2_NEWTABLE30();
      }
      PAN_NEWTABLE.UpdatePanel(MainFrm);
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
    return (obj instanceof GenerazioneImputazioneEconomica2);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GenerazioneImputazioneEconomica2.class.getName() : (Glb.ClassWithPackage(GenerazioneImputazioneEconomica2.class) ? GenerazioneImputazioneEconomica2.class.getName().substring(GenerazioneImputazioneEconomica2.class.getPackage().getName().length() + 1) : GenerazioneImputazioneEconomica2.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // NO Procedure
  // **********************************************************************
  public int NOProcedure ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // NO Procedure Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImputazioneEconomica2", "NOProcedure", _e);
      return -1;
    }
  }

  // **********************************************************************
  // SI Procedura
  // **********************************************************************
  public int SIProcedura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ELABESEGMESS = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ELABESEGMESS = (new IDVariant("Elaborazione Eseguita", IDVariant.STRING));
      // 
      // SI Procedura Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.IMPUTAECOFATDAMOV();
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.set_AlertMessage(v_ELABESEGMESS); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImputazioneEconomica2", "SIProcedura", _e);
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
      v_NOMECAPTION = (new IDVariant("Imputazione Economica da Liquidazioni/Ordinativi", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImputazioneEconomica2", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void GENEIMPUECO2_NEWTABLE30() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_NEWTABLE30_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_NEWTABLE18, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_NEWTABLE18, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_NEWTABLE30_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_NEWTABLE30_RS, 0, IMDBDef2.TBL_NEWTABLE18, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_NEWTABLE30_RS, 0, 0, IMDBDef2.TBL_NEWTABLE18, IMDBDef2.FLD_NEWTABLE18_ROWNAMNEWFIE, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_NEWTABLE18, 0);
      if (IMDB.Eof(IMDBDef2.TBL_NEWTABLE18, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_NEWTABLE18, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_NEWTABLE30_RS, 0);
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
  private void PAN_NEWTABLE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NEWTABLE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NEWTABLE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NEWTABLE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NEWTABLE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NEWTABLE);
    // Stub
  }

  private void PAN_NEWTABLE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_NEWTABLE_SIBUTTON)
    {
      this.IdxPanelActived = this.PAN_NEWTABLE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SIProcedura();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_NEWTABLE_NOBUTTON)
    {
      this.IdxPanelActived = this.PAN_NEWTABLE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      NOProcedure();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_NEWTABLE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NEWTABLE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NEWTABLE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_NEWTABLE_Init()
  {

    PAN_NEWTABLE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NEWTABLE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NEWTABLE.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_NEWTABLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NEWFIELD, "5C2E6C0C-9026-46BD-B389-4F5BA56F03B0");
    PAN_NEWTABLE.set_Header(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NEWFIELD, "New Field");
    PAN_NEWTABLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NEWFIELD, "");
    PAN_NEWTABLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NEWFIELD, MyGlb.VIS_NORMFIELPADR);
    PAN_NEWTABLE.SetFlags(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NEWFIELD, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NEWTABLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR1, "E46A341A-A1F0-4A53-8D67-FBFFA30A1A96");
    PAN_NEWTABLE.set_Header(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR1, "La fase genera le imputazioni economiche per i documenti non ancora imputati, ma liquidati o incassati.\n\n");
    PAN_NEWTABLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_NEWTABLE.SetFlags(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_NEWTABLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR2, "93B9042A-6A2A-4E5D-8DBA-08FC9BF81D99");
    PAN_NEWTABLE.set_Header(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR2, "L'imputazione presente sulla liquidazione, per le spese, o sull'ordinativo, per le entrate, viene trasferita sul documento ed eliminata dal movimento originale.");
    PAN_NEWTABLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR2, MyGlb.VIS_IMAGEBUTTONS);
    PAN_NEWTABLE.SetFlags(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_NEWTABLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR3, "9CDBD069-A365-42A4-A30D-871DBF49DAC7");
    PAN_NEWTABLE.set_Header(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR3, "L'elaborazione può essere eseguita più volte.");
    PAN_NEWTABLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR3, MyGlb.VIS_IMAGEBUTTONS);
    PAN_NEWTABLE.SetFlags(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_NEWTABLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR4, "C57DAE05-CED4-4FF0-9D62-1B78C1E3B90A");
    PAN_NEWTABLE.set_Header(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR4, "Si conferma l'elaborazione?");
    PAN_NEWTABLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR4, MyGlb.VIS_IMAGEBUTTONS);
    PAN_NEWTABLE.SetFlags(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_NEWTABLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NEWTABLE_SIBUTTON, "AAA13D16-7C19-4EDE-B293-63EFEFEFF9A1");
    PAN_NEWTABLE.set_Header(MyGlb.OBJ_FIELD, PFL_NEWTABLE_SIBUTTON, "SI");
    PAN_NEWTABLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NEWTABLE_SIBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_NEWTABLE.SetImage(MyGlb.OBJ_FIELD, PFL_NEWTABLE_SIBUTTON, 0, "button1.gif", false);
    PAN_NEWTABLE.SetFlags(MyGlb.OBJ_FIELD, PFL_NEWTABLE_SIBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_NEWTABLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NOBUTTON, "61BE7A22-1E5C-4EC0-A72A-67B12E27F120");
    PAN_NEWTABLE.set_Header(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NOBUTTON, "NO");
    PAN_NEWTABLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NOBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_NEWTABLE.SetImage(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NOBUTTON, 0, "button1.gif", false);
    PAN_NEWTABLE.SetFlags(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NOBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_NEWTABLE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NEWFIELD, MyGlb.PANEL_LIST, 0, 36, 356, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NEWFIELD, MyGlb.PANEL_LIST, 56);
    PAN_NEWTABLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NEWFIELD, MyGlb.PANEL_LIST, 1);
    PAN_NEWTABLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NEWFIELD, MyGlb.PANEL_LIST, "New Field");
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NEWFIELD, MyGlb.PANEL_FORM, 56, 160, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NEWFIELD, MyGlb.PANEL_FORM, 68);
    PAN_NEWTABLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NEWFIELD, MyGlb.PANEL_FORM, 1);
    PAN_NEWTABLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NEWFIELD, MyGlb.PANEL_FORM, "New Field");
    PAN_NEWTABLE.SetFieldPage(PFL_NEWTABLE_NEWFIELD, -1, -1);
    PAN_NEWTABLE.SetFieldPanel(PFL_NEWTABLE_NEWFIELD, PPQRY_NEWTABLE30, "A.ROWNAMNEWFIE", "ROWNAMNEWFIE", 5, 49, 0, -13997);
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR1, MyGlb.PANEL_LIST, 32, 44, 276, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR1, MyGlb.PANEL_LIST, 0);
    PAN_NEWTABLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR1, MyGlb.PANEL_LIST, 1);
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR1, MyGlb.PANEL_FORM, 8, 8, 348, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR1, MyGlb.PANEL_FORM, 0);
    PAN_NEWTABLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR1, MyGlb.PANEL_FORM, 2);
    PAN_NEWTABLE.SetFieldPage(PFL_NEWTABLE_STR1, -1, -1);
    PAN_NEWTABLE.SetFieldPanel(PFL_NEWTABLE_STR1, -1, "", "STR1", 0, 0, 0, -13997);
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR2, MyGlb.PANEL_LIST, 32, 76, 276, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR2, MyGlb.PANEL_LIST, 0);
    PAN_NEWTABLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR2, MyGlb.PANEL_LIST, 3);
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR2, MyGlb.PANEL_FORM, 8, 40, 356, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR2, MyGlb.PANEL_FORM, 0);
    PAN_NEWTABLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR2, MyGlb.PANEL_FORM, 3);
    PAN_NEWTABLE.SetFieldPage(PFL_NEWTABLE_STR2, -1, -1);
    PAN_NEWTABLE.SetFieldPanel(PFL_NEWTABLE_STR2, -1, "", "STR2", 0, 0, 0, -13997);
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR3, MyGlb.PANEL_LIST, 28, 124, 276, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR3, MyGlb.PANEL_LIST, 0);
    PAN_NEWTABLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR3, MyGlb.PANEL_LIST, 3);
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR3, MyGlb.PANEL_FORM, 8, 88, 272, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR3, MyGlb.PANEL_FORM, 0);
    PAN_NEWTABLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR3, MyGlb.PANEL_FORM, 3);
    PAN_NEWTABLE.SetFieldPage(PFL_NEWTABLE_STR3, -1, -1);
    PAN_NEWTABLE.SetFieldPanel(PFL_NEWTABLE_STR3, -1, "", "STR3", 0, 0, 0, -13997);
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR4, MyGlb.PANEL_LIST, 40, 168, 188, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR4, MyGlb.PANEL_LIST, 0);
    PAN_NEWTABLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR4, MyGlb.PANEL_LIST, 2);
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR4, MyGlb.PANEL_FORM, 8, 116, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR4, MyGlb.PANEL_FORM, 0);
    PAN_NEWTABLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWTABLE_STR4, MyGlb.PANEL_FORM, 1);
    PAN_NEWTABLE.SetFieldPage(PFL_NEWTABLE_STR4, -1, -1);
    PAN_NEWTABLE.SetFieldPanel(PFL_NEWTABLE_STR4, -1, "", "STR4", 0, 0, 0, -13997);
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_FIELD, PFL_NEWTABLE_SIBUTTON, MyGlb.PANEL_LIST, 268, 168, 64, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWTABLE_SIBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_NEWTABLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWTABLE_SIBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_FIELD, PFL_NEWTABLE_SIBUTTON, MyGlb.PANEL_FORM, 208, 120, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWTABLE_SIBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_NEWTABLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWTABLE_SIBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_NEWTABLE.SetFieldPage(PFL_NEWTABLE_SIBUTTON, -1, -1);
    PAN_NEWTABLE.SetFieldPanel(PFL_NEWTABLE_SIBUTTON, -1, "", "SIBUTTON", 0, 0, 0, -13997);
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NOBUTTON, MyGlb.PANEL_LIST, 344, 168, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NOBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_NEWTABLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NOBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_NEWTABLE.SetRect(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NOBUTTON, MyGlb.PANEL_FORM, 300, 120, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NEWTABLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NOBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_NEWTABLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_NEWTABLE_NOBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_NEWTABLE.SetFieldPage(PFL_NEWTABLE_NOBUTTON, -1, -1);
    PAN_NEWTABLE.SetFieldPanel(PFL_NEWTABLE_NOBUTTON, -1, "", "NOBUTTON", 0, 0, 0, -13997);
  }

  private void PAN_NEWTABLE_InitQueries()
  {
    StringBuffer SQL;

    PAN_NEWTABLE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NEWTABLE.SetIMDB(IMDB, "PQRY_NEWTABLE30", true);
    PAN_NEWTABLE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_NEWTABLE.SetQueryIMDB(PPQRY_NEWTABLE30, IMDBDef9.PQRY_NEWTABLE30_RS, IMDBDef2.TBL_NEWTABLE18);
    JustLoaded = true;
    PAN_NEWTABLE.SetFieldPrimaryIndex(PFL_NEWTABLE_NEWFIELD, IMDBDef2.FLD_NEWTABLE18_ROWNAMNEWFIE);
    PAN_NEWTABLE.SetMasterTable(0, "NEWTABLE18");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NEWTABLE.Status() == 2)
    {
      int oldListQBE = PAN_NEWTABLE.iUseListQBE;
      PAN_NEWTABLE.iUseListQBE = 0;
      PAN_NEWTABLE.PanelCommand(Glb.PCM_SEARCH);
      PAN_NEWTABLE.PanelCommand(Glb.PCM_FIND);
      PAN_NEWTABLE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_NEWTABLE) PAN_NEWTABLE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_NEWTABLE) PAN_NEWTABLE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_NEWTABLE) PAN_NEWTABLE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_NEWTABLE) PAN_NEWTABLE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_NEWTABLE) PAN_NEWTABLE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
