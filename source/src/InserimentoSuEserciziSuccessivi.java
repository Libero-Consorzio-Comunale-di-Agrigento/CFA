// **********************************************
// Inserimento Su Esercizi Successivi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InserimentoSuEserciziSuccessivi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMENTRI_OK = 0;
  private static int PFL_PARAMENTRI_ANNULLA = 1;
  private static int PFL_PARAMENTRI_ETICVERRINSE = 2;

  private static int PPQRY_PARAMENTRI1 = 0;


  IDPanel PAN_PARAMENTRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMENTRI(IMDB);
    Init_TBL_PIANODEICONT(IMDB);
    //
    //
    Init_PQRY_PARAMENTRI1(IMDB);
    Init_QRY_PIANODEICON1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMENTRI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMENTRI, 0);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMENTRI, "TBL_PARAMENTRI");
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMENTRI, 0);
  }

  private static void Init_TBL_PIANODEICONT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PIANODEICONT, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_PIANODEICONT, "TBL_PIANODEICONT");
    IMDB.set_FldCode(IMDBDef3.TBL_PIANODEICONT,IMDBDef3.FLD_PIANODEICONT_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef3.TBL_PIANODEICONT,IMDBDef3.FLD_PIANODEICONT_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PIANODEICONT,IMDBDef3.FLD_PIANODEICONT_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef3.TBL_PIANODEICONT,IMDBDef3.FLD_PIANODEICONT_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PIANODEICONT,IMDBDef3.FLD_PIANODEICONT_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef3.TBL_PIANODEICONT,IMDBDef3.FLD_PIANODEICONT_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PIANODEICONT,IMDBDef3.FLD_PIANODEICONT_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef3.TBL_PIANODEICONT,IMDBDef3.FLD_PIANODEICONT_ESERCIZIO,1,4,0);
  }

  private static void Init_PQRY_PARAMENTRI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMENTRI1, 0);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMENTRI1, "PQRY_PARAMENTRI1");
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMENTRI1, 0);
  }

  private static void Init_QRY_PIANODEICON1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.QRY_PIANODEICON1, 4);
    IMDB.set_TblCode(IMDBDef10.QRY_PIANODEICON1, "QRY_PIANODEICON1");
    IMDB.set_FldCode(IMDBDef10.QRY_PIANODEICON1,IMDBDef10.QSL_PIANODEICON1_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef10.QRY_PIANODEICON1,IMDBDef10.QSL_PIANODEICON1_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef10.QRY_PIANODEICON1,IMDBDef10.QSL_PIANODEICON1_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef10.QRY_PIANODEICON1,IMDBDef10.QSL_PIANODEICON1_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef10.QRY_PIANODEICON1,IMDBDef10.QSL_PIANODEICON1_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef10.QRY_PIANODEICON1,IMDBDef10.QSL_PIANODEICON1_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef10.QRY_PIANODEICON1,IMDBDef10.QSL_PIANODEICON1_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef10.QRY_PIANODEICON1,IMDBDef10.QSL_PIANODEICON1_ROWNAMEESERC,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InserimentoSuEserciziSuccessivi(MyWebEntryPoint w, IMDBObj imdb)
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
  public InserimentoSuEserciziSuccessivi()
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
    FormIdx = MyGlb.FRM_INSESUESESUC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F26B3162-529E-4D68-BA4C-6D4C02B4473C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 364;
    DesignHeight = 182;
    set_Caption(new IDVariant("Inserimento Su Esercizi Successivi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 364;
    Frames[1].Height = 156;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Paramentri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 156;
    PAN_PARAMENTRI = new IDPanel(w, this, 1, "PAN_PARAMENTRI");
    Frames[1].Content = PAN_PARAMENTRI;
    PAN_PARAMENTRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMENTRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMENTRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 364-MyGlb.PAN_OFFS_X, 156-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMENTRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F07115DB-8E40-4E17-A6CB-52EFA615CFDD");
    PAN_PARAMENTRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 272, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMENTRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMENTRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMENTRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMENTRI.InitStatus = 2;
    PAN_PARAMENTRI_Init();
    PAN_PARAMENTRI_InitFields();
    PAN_PARAMENTRI_InitQueries();
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
      PAN_PARAMENTRI.UpdatePanel(MainFrm);
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
    return (obj instanceof InserimentoSuEserciziSuccessivi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InserimentoSuEserciziSuccessivi.class.getName() : (Glb.ClassWithPackage(InserimentoSuEserciziSuccessivi.class) ? InserimentoSuEserciziSuccessivi.class.getName().substring(InserimentoSuEserciziSuccessivi.class.getPackage().getName().length() + 1) : InserimentoSuEserciziSuccessivi.class.getName()));
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoSuEserciziSuccessivi", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Uokkey
  // **********************************************************************
  public int Uokkey ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ERRORI = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Uokkey Body
      // Procedure Body
      // 
      v_ERRORI = (new IDVariant());
      UOKKEY_PIANODEICON1();
      while (!IMDB.Eof(IMDBDef10.QRY_PIANODEICON1, 0))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.INSCAPESERCSUCCWEB(IMDB.Value(IMDBDef10.QRY_PIANODEICON1, IMDBDef10.QSL_PIANODEICON1_ROWNAMEESERC, 0), IMDB.Value(IMDBDef10.QRY_PIANODEICON1, IMDBDef10.QSL_PIANODEICON1_ROWNAMEES, 0), IMDB.Value(IMDBDef10.QRY_PIANODEICON1, IMDBDef10.QSL_PIANODEICON1_ROWNAMECAPIT, 0), IMDB.Value(IMDBDef10.QRY_PIANODEICON1, IMDBDef10.QSL_PIANODEICON1_ROWNAMEARTIC, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          v_ERRORI = IDL.Add(IDL.Add(v_ERRORI, (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))), (new IDVariant("<BR/>")));
        }
        IMDB.TblMoveNext(IMDBDef10.QRY_PIANODEICON1, 0);
      }
      if (!(IDL.IsNull(v_ERRORI)))
      {
        MainFrm.set_AlertMessage(v_ERRORI); 
      }
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoSuEserciziSuccessivi", "Uokkey", _e);
      return -1;
    }
  }

  // **********************************************************************
  // PIANO DEI CONTI
  // Which data are you selecting?
  // **********************************************************************
  private void UOKKEY_PIANODEICON1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.QRY_PIANODEICON1);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PIANODEICONT, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PIANODEICONT, 0))
    {
      IMDB.TblAddNew(IMDBDef10.QRY_PIANODEICON1, 0);
      IMDB.TblLinkRow(IMDBDef10.QRY_PIANODEICON1, 0, IMDBDef3.TBL_PIANODEICONT, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_PIANODEICON1, 0, 0, IMDBDef3.TBL_PIANODEICONT, IMDBDef3.FLD_PIANODEICONT_CAPITOLO, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_PIANODEICON1, 1, 0, IMDBDef3.TBL_PIANODEICONT, IMDBDef3.FLD_PIANODEICONT_ARTICOLO, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_PIANODEICON1, 2, 0, IMDBDef3.TBL_PIANODEICONT, IMDBDef3.FLD_PIANODEICONT_E_S, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_PIANODEICON1, 3, 0, IMDBDef3.TBL_PIANODEICONT, IMDBDef3.FLD_PIANODEICONT_ESERCIZIO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PIANODEICONT, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PIANODEICONT, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PIANODEICONT, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.QRY_PIANODEICON1, 0);
  }

  // **********************************************************************
  // Uannulla
  // **********************************************************************
  public int Uannulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Uannulla Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoSuEserciziSuccessivi", "Uannulla", _e);
      return -1;
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
  private void PAN_PARAMENTRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMENTRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMENTRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMENTRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMENTRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMENTRI);
    // Stub
  }

  private void PAN_PARAMENTRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMENTRI_OK)
    {
      this.IdxPanelActived = this.PAN_PARAMENTRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Uokkey();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMENTRI_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_PARAMENTRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Uannulla();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMENTRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMENTRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMENTRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMENTRI_Init()
  {

    PAN_PARAMENTRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMENTRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMENTRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMENTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_OK, "B22444CC-B0BA-419D-BA68-3C9269656137");
    PAN_PARAMENTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_OK, "OK");
    PAN_PARAMENTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_OK, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMENTRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_OK, 0, "button1.gif", false);
    PAN_PARAMENTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMENTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANNULLA, "C402BE35-E918-429E-B8EF-2619AE7DA9F9");
    PAN_PARAMENTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANNULLA, "Annulla");
    PAN_PARAMENTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMENTRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANNULLA, 0, "button1.gif", false);
    PAN_PARAMENTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMENTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ETICVERRINSE, "5989231C-526D-4E71-AD2F-8AB0ECF449DD");
    PAN_PARAMENTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ETICVERRINSE, "Verranno inseriti i Capitoli per tutti gli Esercizi Successivi");
    PAN_PARAMENTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ETICVERRINSE, MyGlb.VIS_LABELFIELD);
    PAN_PARAMENTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ETICVERRINSE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMENTRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_OK, MyGlb.PANEL_LIST, 56, 92, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_OK, MyGlb.PANEL_LIST, 0);
    PAN_PARAMENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_OK, MyGlb.PANEL_LIST, 1);
    PAN_PARAMENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_OK, MyGlb.PANEL_FORM, 104, 96, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_OK, MyGlb.PANEL_FORM, 0);
    PAN_PARAMENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_OK, MyGlb.PANEL_FORM, 1);
    PAN_PARAMENTRI.SetFieldPage(PFL_PARAMENTRI_OK, -1, -1);
    PAN_PARAMENTRI.SetFieldPanel(PFL_PARAMENTRI_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_PARAMENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANNULLA, MyGlb.PANEL_LIST, 140, 88, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANNULLA, MyGlb.PANEL_FORM, 196, 96, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMENTRI.SetFieldPage(PFL_PARAMENTRI_ANNULLA, -1, -1);
    PAN_PARAMENTRI.SetFieldPanel(PFL_PARAMENTRI_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
    PAN_PARAMENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ETICVERRINSE, MyGlb.PANEL_LIST, 72, 28, 220, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ETICVERRINSE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ETICVERRINSE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMENTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ETICVERRINSE, MyGlb.PANEL_FORM, 96, 28, 192, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMENTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ETICVERRINSE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMENTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMENTRI_ETICVERRINSE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMENTRI.SetFieldPage(PFL_PARAMENTRI_ETICVERRINSE, -1, -1);
    PAN_PARAMENTRI.SetFieldPanel(PFL_PARAMENTRI_ETICVERRINSE, -1, "", "ETICVERRINSE", 0, 0, 0, -13997);
  }

  private void PAN_PARAMENTRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMENTRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMENTRI.set_ShowInfoMessages(false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMENTRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMENTRI.iUseListQBE;
      PAN_PARAMENTRI.iUseListQBE = 0;
      PAN_PARAMENTRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMENTRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMENTRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMENTRI) PAN_PARAMENTRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMENTRI) PAN_PARAMENTRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMENTRI) PAN_PARAMENTRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMENTRI) PAN_PARAMENTRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMENTRI) PAN_PARAMENTRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
