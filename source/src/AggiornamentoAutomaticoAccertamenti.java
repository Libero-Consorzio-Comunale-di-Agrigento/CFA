// **********************************************
// Aggiornamento Automatico Accertamenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornamentoAutomaticoAccertamenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_AGGIAUTOACCE_DATALIQUSTIP = 0;
  private static int PFL_AGGIAUTOACCE_ELABORA = 1;

  private static int PPQRY_TABLE1 = 0;


  IDPanel PAN_AGGIAUTOACCE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_TABLE2(IMDB);
    //
    //
    Init_PQRY_TABLE1(IMDB);
    Init_PQRY_TABLE1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_TABLE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_TABLE2, 1);
    IMDB.set_TblCode(IMDBDef5.TBL_TABLE2, "TBL_TABLE2");
    IMDB.set_FldCode(IMDBDef5.TBL_TABLE2,IMDBDef5.FLD_TABLE2_ROWNAMDALIST, "ROWNAMDALIST");
    IMDB.SetFldParams(IMDBDef5.TBL_TABLE2,IMDBDef5.FLD_TABLE2_ROWNAMDALIST,6,14,0);
    IMDB.TblAddNew(IMDBDef5.TBL_TABLE2, 0);
  }

  private static void Init_PQRY_TABLE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_TABLE1, 1);
    IMDB.set_TblCode(IMDBDef15.PQRY_TABLE1, "PQRY_TABLE1");
    IMDB.set_FldCode(IMDBDef15.PQRY_TABLE1,IMDBDef15.PQSL_TABLE1_ROWNAMDALIST, "ROWNAMDALIST");
    IMDB.SetFldParams(IMDBDef15.PQRY_TABLE1,IMDBDef15.PQSL_TABLE1_ROWNAMDALIST,6,14,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_TABLE1, 0);
  }

  private static void Init_PQRY_TABLE1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_TABLE1_RS, 1);
    IMDB.set_TblCode(IMDBDef15.PQRY_TABLE1_RS, "PQRY_TABLE1_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_TABLE1_RS,IMDBDef15.PQSL_TABLE1_ROWNAMDALIST, "ROWNAMDALIST");
    IMDB.SetFldParams(IMDBDef15.PQRY_TABLE1_RS,IMDBDef15.PQSL_TABLE1_ROWNAMDALIST,6,14,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornamentoAutomaticoAccertamenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornamentoAutomaticoAccertamenti()
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
    FormIdx = MyGlb.FRM_AGGIAUTOACCE1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E7BDC755-63DC-49FD-899E-0C41782046A6";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 340;
    DesignHeight = 154;
    set_Caption(new IDVariant("Aggiornamento Automatico Accertamenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 340;
    Frames[1].Height = 128;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Aggiornamento Automatico Accertamenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 128;
    PAN_AGGIAUTOACCE = new IDPanel(w, this, 1, "PAN_AGGIAUTOACCE");
    Frames[1].Content = PAN_AGGIAUTOACCE;
    PAN_AGGIAUTOACCE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_AGGIAUTOACCE.VS = MainFrm.VisualStyleList;
    PAN_AGGIAUTOACCE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 340-MyGlb.PAN_OFFS_X, 128-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_AGGIAUTOACCE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "95C6F1E2-E81A-40F1-A419-F2C06C437D2B");
    PAN_AGGIAUTOACCE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 96, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOACCE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_AGGIAUTOACCE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_AGGIAUTOACCE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_AGGIAUTOACCE.InitStatus = 2;
    PAN_AGGIAUTOACCE_Init();
    PAN_AGGIAUTOACCE_InitFields();
    PAN_AGGIAUTOACCE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_TABLE2, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGIAUTOACCE1_TABLE1();
      }
      PAN_AGGIAUTOACCE.UpdatePanel(MainFrm);
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
    return (obj instanceof AggiornamentoAutomaticoAccertamenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornamentoAutomaticoAccertamenti.class.getName() : (Glb.ClassWithPackage(AggiornamentoAutomaticoAccertamenti.class) ? AggiornamentoAutomaticoAccertamenti.class.getName().substring(AggiornamentoAutomaticoAccertamenti.class.getPackage().getName().length() + 1) : AggiornamentoAutomaticoAccertamenti.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef5.TBL_TABLE2, IMDBDef5.FLD_TABLE2_ROWNAMDALIST, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoAccertamenti", "LoadEvent", _e);
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
    IDVariant v_NUMAGG = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.IMPACCAGGAUTO((new IDVariant("E")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_TABLE1, IMDBDef15.PQSL_TABLE1_ROWNAMDALIST, 0)), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_NUMAGG);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_AGG = new IDVariant(0,IDVariant.STRING);
        v_AGG = (new IDVariant("Aggiornate", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<BR/>"))), v_AGG), (new IDVariant(" "))), IDL.ToString(v_NUMAGG)), (new IDVariant(" "))), (new IDVariant("Imputazioni")))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoAccertamenti", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Table
  // Primary record source for panel data
  // **********************************************************************
  private void AGGIAUTOACCE1_TABLE1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_TABLE1_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_TABLE2, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_TABLE2, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_TABLE1_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_TABLE1_RS, 0, IMDBDef5.TBL_TABLE2, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_TABLE1_RS, 0, 0, IMDBDef5.TBL_TABLE2, IMDBDef5.FLD_TABLE2_ROWNAMDALIST, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_TABLE2, 0);
      if (IMDB.Eof(IMDBDef5.TBL_TABLE2, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_TABLE2, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_TABLE1_RS, 0);
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
  private void PAN_AGGIAUTOACCE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_AGGIAUTOACCE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_AGGIAUTOACCE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_AGGIAUTOACCE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_AGGIAUTOACCE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_AGGIAUTOACCE);
    // Stub
  }

  private void PAN_AGGIAUTOACCE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_AGGIAUTOACCE_ELABORA)
    {
      this.IdxPanelActived = this.PAN_AGGIAUTOACCE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_AGGIAUTOACCE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_AGGIAUTOACCE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_AGGIAUTOACCE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_AGGIAUTOACCE_Init()
  {

    PAN_AGGIAUTOACCE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_AGGIAUTOACCE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_AGGIAUTOACCE.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_AGGIAUTOACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_DATALIQUSTIP, "A5F0B6A0-4627-4A39-B771-1352BA5D95BA");
    PAN_AGGIAUTOACCE.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_DATALIQUSTIP, "Data Liquidazioni Stipendi");
    PAN_AGGIAUTOACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_DATALIQUSTIP, "");
    PAN_AGGIAUTOACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_DATALIQUSTIP, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIAUTOACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_DATALIQUSTIP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_ELABORA, "F2D377E1-3CA9-46F1-BD92-68373BE00EAA");
    PAN_AGGIAUTOACCE.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_ELABORA, "Elabora");
    PAN_AGGIAUTOACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_AGGIAUTOACCE.SetImage(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_ELABORA, 0, "button1.gif", false);
    PAN_AGGIAUTOACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_AGGIAUTOACCE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_AGGIAUTOACCE.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_DATALIQUSTIP, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_DATALIQUSTIP, MyGlb.PANEL_LIST, 132);
    PAN_AGGIAUTOACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_DATALIQUSTIP, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_DATALIQUSTIP, MyGlb.PANEL_LIST, "Dt. Liquidazioni Stipendi");
    PAN_AGGIAUTOACCE.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_DATALIQUSTIP, MyGlb.PANEL_FORM, 4, 4, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_DATALIQUSTIP, MyGlb.PANEL_FORM, 164);
    PAN_AGGIAUTOACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_DATALIQUSTIP, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_DATALIQUSTIP, MyGlb.PANEL_FORM, "Data Liquidazioni Stipendi");
    PAN_AGGIAUTOACCE.SetFieldPage(PFL_AGGIAUTOACCE_DATALIQUSTIP, -1, -1);
    PAN_AGGIAUTOACCE.SetFieldPanel(PFL_AGGIAUTOACCE_DATALIQUSTIP, PPQRY_TABLE1, "A.ROWNAMDALIST", "ROWNAMDALIST", 6, 14, 0, -13997);
    PAN_AGGIAUTOACCE.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_ELABORA, MyGlb.PANEL_LIST, 136, 28, 92, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_AGGIAUTOACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOACCE.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_ELABORA, MyGlb.PANEL_FORM, 172, 40, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_AGGIAUTOACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOACCE_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOACCE.SetFieldPage(PFL_AGGIAUTOACCE_ELABORA, -1, -1);
    PAN_AGGIAUTOACCE.SetFieldPanel(PFL_AGGIAUTOACCE_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_AGGIAUTOACCE_InitQueries()
  {
    StringBuffer SQL;

    PAN_AGGIAUTOACCE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_AGGIAUTOACCE.SetIMDB(IMDB, "PQRY_TABLE1", true);
    PAN_AGGIAUTOACCE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_AGGIAUTOACCE.SetQueryIMDB(PPQRY_TABLE1, IMDBDef15.PQRY_TABLE1_RS, IMDBDef5.TBL_TABLE2);
    JustLoaded = true;
    PAN_AGGIAUTOACCE.SetFieldPrimaryIndex(PFL_AGGIAUTOACCE_DATALIQUSTIP, IMDBDef5.FLD_TABLE2_ROWNAMDALIST);
    PAN_AGGIAUTOACCE.SetMasterTable(0, "TABLE2");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_AGGIAUTOACCE.Status() == 2)
    {
      int oldListQBE = PAN_AGGIAUTOACCE.iUseListQBE;
      PAN_AGGIAUTOACCE.iUseListQBE = 0;
      PAN_AGGIAUTOACCE.PanelCommand(Glb.PCM_SEARCH);
      PAN_AGGIAUTOACCE.PanelCommand(Glb.PCM_FIND);
      PAN_AGGIAUTOACCE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_AGGIAUTOACCE) PAN_AGGIAUTOACCE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_AGGIAUTOACCE) PAN_AGGIAUTOACCE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_AGGIAUTOACCE) PAN_AGGIAUTOACCE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_AGGIAUTOACCE) PAN_AGGIAUTOACCE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_AGGIAUTOACCE) PAN_AGGIAUTOACCE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
