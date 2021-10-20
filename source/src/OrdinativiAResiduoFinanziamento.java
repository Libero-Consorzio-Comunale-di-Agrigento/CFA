// **********************************************
// Ordinativi A Residuo Finanziamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdinativiAResiduoFinanziamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ORDIARESIFIN_CAPITOLO = 0;
  private static int PFL_ORDIARESIFIN_ARTICOLO = 1;
  private static int PFL_ORDIARESIFIN_NUMEROORD = 2;
  private static int PFL_ORDIARESIFIN_DDATAORD = 3;
  private static int PFL_ORDIARESIFIN_NUMEROACC = 4;
  private static int PFL_ORDIARESIFIN_ANNOACC = 5;
  private static int PFL_ORDIARESIFIN_IMPORTO = 6;
  private static int PFL_ORDIARESIFIN_LABELCAPITOL = 7;
  private static int PFL_ORDIARESIFIN_LABELORDINAT = 8;
  private static int PFL_ORDIARESIFIN_LABELACCERTA = 9;
  private static int PFL_ORDIARESIFIN_RIFBILANCPEG = 10;
  private static int PFL_ORDIARESIFIN_ORDINATIVO = 11;
  private static int PFL_ORDIARESIFIN_ACCERTAMENTO = 12;

  private static int PPQRY_ORD4 = 0;


  IDPanel PAN_ORDIARESIFIN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI46(IMDB);
    //
    //
    Init_PQRY_ORD4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI46(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI46, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI46, "TBL_PARAMETRI46");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI46,IMDBDef1.FLD_PARAMETRI46_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI46,IMDBDef1.FLD_PARAMETRI46_PARAMFINANZI,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI46, 0);
  }

  private static void Init_PQRY_ORD4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_ORD4, 11);
    IMDB.set_TblCode(IMDBDef8.PQRY_ORD4, "PQRY_ORD4");
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_ORDRIFBILPEG, "ORDRIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_ORDRIFBILPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_ORDORDINATIV, "ORDORDINATIV");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_ORDORDINATIV,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_ORDACCERTAME, "ORDACCERTAME");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_ORDACCERTAME,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_D_DATA_ORD, "D_DATA_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_D_DATA_ORD,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_ORD4,IMDBDef8.PQSL_ORD4_ANNO_ORD,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_ORD4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdinativiAResiduoFinanziamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdinativiAResiduoFinanziamento()
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
    FormIdx = MyGlb.FRM_ORDIARESIFIN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6D726688-30D9-4CC8-BA7A-2AA0C5DD0A9B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 628;
    DesignHeight = 390;
    set_Caption(new IDVariant("Ordinativi A Residuo Finanziamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 628;
    Frames[1].Height = 364;
    Frames[1].Caption = "Ordinativi A Residuo Finanziamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 364;
    PAN_ORDIARESIFIN = new IDPanel(w, this, 1, "PAN_ORDIARESIFIN");
    Frames[1].Content = PAN_ORDIARESIFIN;
    PAN_ORDIARESIFIN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDIARESIFIN.VS = MainFrm.VisualStyleList;
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 628-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDIARESIFIN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C303101C-67F7-4C5C-9822-CBF6DEAA248E");
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 452, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDIARESIFIN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDIARESIFIN.InitStatus = 2;
    PAN_ORDIARESIFIN_Init();
    PAN_ORDIARESIFIN_InitFields();
    PAN_ORDIARESIFIN_InitQueries();
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
      PAN_ORDIARESIFIN.UpdatePanel(MainFrm);
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
    return (obj instanceof OrdinativiAResiduoFinanziamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdinativiAResiduoFinanziamento.class.getName() : (Glb.ClassWithPackage(OrdinativiAResiduoFinanziamento.class) ? OrdinativiAResiduoFinanziamento.class.getName().substring(OrdinativiAResiduoFinanziamento.class.getPackage().getName().length() + 1) : OrdinativiAResiduoFinanziamento.class.getName()));
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiAResiduoFinanziamento", "LoadEvent", _e);
    }
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
  private void PAN_ORDIARESIFIN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDIARESIFIN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDIARESIFIN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDIARESIFIN, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDIARESIFIN_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ORDIARESIFIN);
    // Stub
  }

  private void PAN_ORDIARESIFIN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ORDIARESIFIN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ORDIARESIFIN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ORD4, IMDBDef8.PQSL_ORD4_D_DATA_ORD, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_ORD4, IMDBDef8.PQSL_ORD4_D_DATA_ORD, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_ORDIARESIFIN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDIARESIFIN_Init()
  {

    PAN_ORDIARESIFIN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDIARESIFIN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ORDIARESIFIN.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_ORDIARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_CAPITOLO, "6E260DD1-C743-4ECE-AE6E-9A6F4AA155C1");
    PAN_ORDIARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_CAPITOLO, "CAPITOLO");
    PAN_ORDIARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_CAPITOLO, "");
    PAN_ORDIARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ORDIARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDIARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ARTICOLO, "A0213828-AA87-40F0-BE6D-DEE6B81486D4");
    PAN_ORDIARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ARTICOLO, "ARTICOLO");
    PAN_ORDIARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ARTICOLO, "");
    PAN_ORDIARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDIARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDIARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROORD, "0AFDB918-32C2-43AA-BA98-7FE4E61EEFFC");
    PAN_ORDIARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROORD, "NUMERO ORD");
    PAN_ORDIARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROORD, "");
    PAN_ORDIARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDIARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ORDIARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_DDATAORD, "6D6CD162-1E78-46EE-A796-8033287FF381");
    PAN_ORDIARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_DDATAORD, "D DATA ORD");
    PAN_ORDIARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_DDATAORD, "");
    PAN_ORDIARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_DDATAORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDIARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_DDATAORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDIARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROACC, "BCB1F93B-A34F-4E0F-910D-C7D941700B7E");
    PAN_ORDIARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROACC, "NUMERO ACC");
    PAN_ORDIARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROACC, "");
    PAN_ORDIARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDIARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDIARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ANNOACC, "8A6E1A8F-07A5-45A2-A2D2-E863CB515AFF");
    PAN_ORDIARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ANNOACC, "ANNO ACC");
    PAN_ORDIARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ANNOACC, "");
    PAN_ORDIARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDIARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDIARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_IMPORTO, "9AD6AEF0-04E0-4BBC-9BCA-CE55B891E9AE");
    PAN_ORDIARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_IMPORTO, "Importo");
    PAN_ORDIARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_IMPORTO, "");
    PAN_ORDIARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ORDIARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDIARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELCAPITOL, "F12A5492-5FFA-4085-BCC6-9466AC5EB9A2");
    PAN_ORDIARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELCAPITOL, "Capitolo/Art.");
    PAN_ORDIARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDIARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDIARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELORDINAT, "EE33E082-FEE8-4364-A794-8DCDF975C9B3");
    PAN_ORDIARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELORDINAT, "Ordinativo");
    PAN_ORDIARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELORDINAT, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDIARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELORDINAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDIARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELACCERTA, "1609CBA3-4860-4ED7-AA1A-0E5FDDE6AEE5");
    PAN_ORDIARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELACCERTA, "Accertamento");
    PAN_ORDIARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELACCERTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDIARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELACCERTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDIARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_RIFBILANCPEG, "99B06CC1-6C40-46FF-87B7-5B6C6D91868E");
    PAN_ORDIARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_ORDIARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_RIFBILANCPEG, "To String (ORD CAPITOLO) + \" / \" + To String (ORD ARTICOLO)");
    PAN_ORDIARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDIARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ORDIARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ORDINATIVO, "156E63B3-F0E5-40B9-96BF-849089D733BE");
    PAN_ORDIARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ORDINATIVO, "Ordinativo");
    PAN_ORDIARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ORDINATIVO, "To String (NUMERO ORD) + \" / \" + To String (D DATA ORD)");
    PAN_ORDIARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ORDINATIVO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDIARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ORDINATIVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ORDIARESIFIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ACCERTAMENTO, "9D6CD9C6-5FC2-4A88-B6F3-AABDB257245F");
    PAN_ORDIARESIFIN.set_Header(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ACCERTAMENTO, "Accertamento");
    PAN_ORDIARESIFIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ACCERTAMENTO, "To String (ORD NUMERO ACC) + \" / \" + To String (ORD ANNO ACC)");
    PAN_ORDIARESIFIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ACCERTAMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDIARESIFIN.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ACCERTAMENTO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ORDIARESIFIN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_CAPITOLO, MyGlb.PANEL_FORM, 4, 364, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_ORDIARESIFIN.SetFieldPage(PFL_ORDIARESIFIN_CAPITOLO, -1, -1);
    PAN_ORDIARESIFIN.SetFieldPanel(PFL_ORDIARESIFIN_CAPITOLO, PPQRY_ORD4, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ARTICOLO, MyGlb.PANEL_LIST, 100, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ARTICOLO, MyGlb.PANEL_LIST, "AR.");
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ARTICOLO, MyGlb.PANEL_FORM, 4, 388, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_ORDIARESIFIN.SetFieldPage(PFL_ORDIARESIFIN_ARTICOLO, -1, -1);
    PAN_ORDIARESIFIN.SetFieldPanel(PFL_ORDIARESIFIN_ARTICOLO, PPQRY_ORD4, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROORD, MyGlb.PANEL_LIST, 128, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROORD, MyGlb.PANEL_LIST, 76);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROORD, MyGlb.PANEL_LIST, "NUM. ORD");
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROORD, MyGlb.PANEL_FORM, 4, 412, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROORD, MyGlb.PANEL_FORM, 76);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROORD, MyGlb.PANEL_FORM, "NUM. ORD");
    PAN_ORDIARESIFIN.SetFieldPage(PFL_ORDIARESIFIN_NUMEROORD, -1, -1);
    PAN_ORDIARESIFIN.SetFieldPanel(PFL_ORDIARESIFIN_NUMEROORD, PPQRY_ORD4, "A.NUMERO_ORD", "NUMERO_ORD", 1, 5, 0, -13997);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_DDATAORD, MyGlb.PANEL_LIST, 168, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_DDATAORD, MyGlb.PANEL_LIST, 72);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_DDATAORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_DDATAORD, MyGlb.PANEL_LIST, "D DATA ORD");
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_DDATAORD, MyGlb.PANEL_FORM, 4, 436, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_DDATAORD, MyGlb.PANEL_FORM, 72);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_DDATAORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_DDATAORD, MyGlb.PANEL_FORM, "D DT. ORD");
    PAN_ORDIARESIFIN.SetFieldPage(PFL_ORDIARESIFIN_DDATAORD, -1, -1);
    PAN_ORDIARESIFIN.SetFieldPanel(PFL_ORDIARESIFIN_DDATAORD, PPQRY_ORD4, "A.D_DATA_ORD", "D_DATA_ORD", 6, 19, 0, -13997);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROACC, MyGlb.PANEL_LIST, 244, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROACC, MyGlb.PANEL_FORM, 4, 460, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROACC, MyGlb.PANEL_FORM, 76);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_ORDIARESIFIN.SetFieldPage(PFL_ORDIARESIFIN_NUMEROACC, -1, -1);
    PAN_ORDIARESIFIN.SetFieldPanel(PFL_ORDIARESIFIN_NUMEROACC, PPQRY_ORD4, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ANNOACC, MyGlb.PANEL_LIST, 292, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ANNOACC, MyGlb.PANEL_FORM, 4, 484, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_ORDIARESIFIN.SetFieldPage(PFL_ORDIARESIFIN_ANNOACC, -1, -1);
    PAN_ORDIARESIFIN.SetFieldPanel(PFL_ORDIARESIFIN_ANNOACC, PPQRY_ORD4, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_IMPORTO, MyGlb.PANEL_LIST, 336, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_IMPORTO, MyGlb.PANEL_FORM, 420, 172, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_IMPORTO, MyGlb.PANEL_FORM, 72);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ORDIARESIFIN.SetFieldPage(PFL_ORDIARESIFIN_IMPORTO, -1, -1);
    PAN_ORDIARESIFIN.SetFieldPanel(PFL_ORDIARESIFIN_IMPORTO, PPQRY_ORD4, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_ORDIARESIFIN.SetFieldPage(PFL_ORDIARESIFIN_LABELCAPITOL, -1, -1);
    PAN_ORDIARESIFIN.SetFieldPanel(PFL_ORDIARESIFIN_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELORDINAT, MyGlb.PANEL_LIST, 128, 0, 116, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELORDINAT, MyGlb.PANEL_LIST, 0);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELORDINAT, MyGlb.PANEL_LIST, 2);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELORDINAT, MyGlb.PANEL_FORM, 8, 8, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELORDINAT, MyGlb.PANEL_FORM, 0);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELORDINAT, MyGlb.PANEL_FORM, 2);
    PAN_ORDIARESIFIN.SetFieldPage(PFL_ORDIARESIFIN_LABELORDINAT, -1, -1);
    PAN_ORDIARESIFIN.SetFieldPanel(PFL_ORDIARESIFIN_LABELORDINAT, -1, "", "LABELORDINAT", 0, 0, 0, -13997);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELACCERTA, MyGlb.PANEL_LIST, 244, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELACCERTA, MyGlb.PANEL_LIST, 0);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELACCERTA, MyGlb.PANEL_LIST, 2);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELACCERTA, MyGlb.PANEL_FORM, 16, 16, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELACCERTA, MyGlb.PANEL_FORM, 0);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_LABELACCERTA, MyGlb.PANEL_FORM, 2);
    PAN_ORDIARESIFIN.SetFieldPage(PFL_ORDIARESIFIN_LABELACCERTA, -1, -1);
    PAN_ORDIARESIFIN.SetFieldPanel(PFL_ORDIARESIFIN_LABELACCERTA, -1, "", "LABELACCERTA", 0, 0, 0, -13997);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 508, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_ORDIARESIFIN.SetFieldPage(PFL_ORDIARESIFIN_RIFBILANCPEG, -1, -1);
    PAN_ORDIARESIFIN.SetFieldUnbound(PFL_ORDIARESIFIN_RIFBILANCPEG, true);
    PAN_ORDIARESIFIN.SetFieldPanel(PFL_ORDIARESIFIN_RIFBILANCPEG, PPQRY_ORD4, "TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )", "ORDRIFBILPEG", 5, 201, 0, -13997);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ORDINATIVO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ORDINATIVO, MyGlb.PANEL_LIST, 60);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ORDINATIVO, MyGlb.PANEL_LIST, 2);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ORDINATIVO, MyGlb.PANEL_LIST, "Ordinativo");
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ORDINATIVO, MyGlb.PANEL_FORM, 4, 508, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ORDINATIVO, MyGlb.PANEL_FORM, 60);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ORDINATIVO, MyGlb.PANEL_FORM, 2);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ORDINATIVO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_ORDIARESIFIN.SetFieldPage(PFL_ORDIARESIFIN_ORDINATIVO, -1, -1);
    PAN_ORDIARESIFIN.SetFieldUnbound(PFL_ORDIARESIFIN_ORDINATIVO, true);
    PAN_ORDIARESIFIN.SetFieldPanel(PFL_ORDIARESIFIN_ORDINATIVO, PPQRY_ORD4, "TO_CHAR ( A.NUMERO_ORD ) || ' / ' || TO_CHAR ( A.D_DATA_ORD )", "ORDORDINATIV", 5, 201, 0, -13997);
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, 76);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ACCERTAMENTO, MyGlb.PANEL_LIST, "Accertamento");
    PAN_ORDIARESIFIN.SetRect(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, 4, 508, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDIARESIFIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, 76);
    PAN_ORDIARESIFIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_ORDIARESIFIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDIARESIFIN_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accert.");
    PAN_ORDIARESIFIN.SetFieldPage(PFL_ORDIARESIFIN_ACCERTAMENTO, -1, -1);
    PAN_ORDIARESIFIN.SetFieldUnbound(PFL_ORDIARESIFIN_ACCERTAMENTO, true);
    PAN_ORDIARESIFIN.SetFieldPanel(PFL_ORDIARESIFIN_ACCERTAMENTO, PPQRY_ORD4, "TO_CHAR ( A.NUMERO_ACC ) || ' / ' || TO_CHAR ( A.ANNO_ACC )", "ORDACCERTAME", 5, 201, 0, -13997);
  }

  private void PAN_ORDIARESIFIN_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDIARESIFIN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ORDIARESIFIN.SetIMDB(IMDB, "PQRY_ORD4", true);
    PAN_ORDIARESIFIN.set_SetString(MyGlb.MASTER_ROWNAME, "ORD");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as ORDRIFBILPEG, ");
    SQL.append("  TO_CHAR ( A.NUMERO_ORD ) || ' / ' || TO_CHAR ( A.D_DATA_ORD ) as ORDORDINATIV, ");
    SQL.append("  TO_CHAR ( A.NUMERO_ACC ) || ' / ' || TO_CHAR ( A.ANNO_ACC ) as ORDACCERTAME, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.NUMERO_ORD as NUMERO_ORD, ");
    SQL.append("  A.D_DATA_ORD as D_DATA_ORD, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.ANNO_ORD as ANNO_ORD ");
    PAN_ORDIARESIFIN.SetQuery(PPQRY_ORD4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ORD A, ");
    SQL.append("  ESEACC_FIN B ");
    PAN_ORDIARESIFIN.SetQuery(PPQRY_ORD4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_ORD = B.ESERCIZIO) ");
    SQL.append("and   (A.ANNO_ACC = B.ANNO_ACC) ");
    SQL.append("and   (A.NUMERO_ACC = B.NUMERO_ACC) ");
    SQL.append("and   (A.ANNO_ORD = ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND A.ANNO_ACC < ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND B.FINANZIAMENTO = ~~TBL_PARAMETRI46.PARAMFINANZI~~) ");
    PAN_ORDIARESIFIN.SetQuery(PPQRY_ORD4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDIARESIFIN.SetQuery(PPQRY_ORD4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDIARESIFIN.SetQuery(PPQRY_ORD4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.NUMERO_ORD ");
    PAN_ORDIARESIFIN.SetQuery(PPQRY_ORD4, 5, SQL, -1, "");
    PAN_ORDIARESIFIN.SetQueryDB(PPQRY_ORD4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDIARESIFIN.SetMasterTable(0, "ORD");
    PAN_ORDIARESIFIN.AddToSortList(PFL_ORDIARESIFIN_CAPITOLO, true);
    PAN_ORDIARESIFIN.AddToSortList(PFL_ORDIARESIFIN_ARTICOLO, true);
    PAN_ORDIARESIFIN.AddToSortList(PFL_ORDIARESIFIN_NUMEROORD, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDIARESIFIN.Status() == 2)
    {
      int oldListQBE = PAN_ORDIARESIFIN.iUseListQBE;
      PAN_ORDIARESIFIN.iUseListQBE = 0;
      PAN_ORDIARESIFIN.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDIARESIFIN.PanelCommand(Glb.PCM_FIND);
      PAN_ORDIARESIFIN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDIARESIFIN) PAN_ORDIARESIFIN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDIARESIFIN) PAN_ORDIARESIFIN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDIARESIFIN) PAN_ORDIARESIFIN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDIARESIFIN) PAN_ORDIARESIFIN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDIARESIFIN) PAN_ORDIARESIFIN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
