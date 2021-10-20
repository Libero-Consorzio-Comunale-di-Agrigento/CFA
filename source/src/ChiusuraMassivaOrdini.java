// **********************************************
// Chiusura Massiva Ordini
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ChiusuraMassivaOrdini extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CHIUMASSORDI_ETICHEMESSAG = 0;
  private static int PFL_CHIUMASSORDI_CHIUSORDINCF = 1;
  private static int PFL_CHIUMASSORDI_ETICHMESSACF = 2;
  private static int PFL_CHIUMASSORDI_ETICHEELABOR = 3;

  private static int PPQRY_PARAMETRI562 = 0;


  IDPanel PAN_CHIUMASSORDI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI157(IMDB);
    //
    //
    Init_PQRY_PARAMETRI562(IMDB);
    Init_PQRY_PARAMETRI562_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI157(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI157, 2);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI157, "TBL_PARAMETRI157");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI157,IMDBDef5.FLD_PARAMETRI157_PARANNOVARIA, "PARANNOVARIA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI157,IMDBDef5.FLD_PARAMETRI157_PARANNOVARIA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI157,IMDBDef5.FLD_PARAMETRI157_PARCHIUORDCF, "PARCHIUORDCF");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI157,IMDBDef5.FLD_PARAMETRI157_PARCHIUORDCF,5,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI157, 0);
  }

  private static void Init_PQRY_PARAMETRI562(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI562, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI562, "PQRY_PARAMETRI562");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI562,IMDBDef14.PQSL_PARAMETRI562_PARCHIUORDCF, "PARCHIUORDCF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI562,IMDBDef14.PQSL_PARAMETRI562_PARCHIUORDCF,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI562, 0);
  }

  private static void Init_PQRY_PARAMETRI562_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI562_RS, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI562_RS, "PQRY_PARAMETRI562_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI562_RS,IMDBDef14.PQSL_PARAMETRI562_PARCHIUORDCF, "PARCHIUORDCF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI562_RS,IMDBDef14.PQSL_PARAMETRI562_PARCHIUORDCF,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ChiusuraMassivaOrdini(MyWebEntryPoint w, IMDBObj imdb)
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
  public ChiusuraMassivaOrdini()
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
    FormIdx = MyGlb.FRM_CHIUMASSORDI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5AB4B3BC-7F1B-4FAC-904D-2BE539F62B93";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 688;
    DesignHeight = 198;
    set_Caption(new IDVariant("Chiusura Massiva Ordini"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 688;
    Frames[1].Height = 172;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Chiusura Massiva Ordini";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 172;
    PAN_CHIUMASSORDI = new IDPanel(w, this, 1, "PAN_CHIUMASSORDI");
    Frames[1].Content = PAN_CHIUMASSORDI;
    PAN_CHIUMASSORDI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CHIUMASSORDI.VS = MainFrm.VisualStyleList;
    PAN_CHIUMASSORDI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 688-MyGlb.PAN_OFFS_X, 172-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CHIUMASSORDI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BC15C872-945E-457B-BD2A-89DE5FA861B4");
    PAN_CHIUMASSORDI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 112, 336, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CHIUMASSORDI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CHIUMASSORDI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CHIUMASSORDI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CHIUMASSORDI.InitStatus = 2;
    PAN_CHIUMASSORDI_Init();
    PAN_CHIUMASSORDI_InitFields();
    PAN_CHIUMASSORDI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI157, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CHIUMASSORDI_PARAMETRI562();
      }
      PAN_CHIUMASSORDI.UpdatePanel(MainFrm);
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
    return (obj instanceof ChiusuraMassivaOrdini);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ChiusuraMassivaOrdini.class.getName() : (Glb.ClassWithPackage(ChiusuraMassivaOrdini.class) ? ChiusuraMassivaOrdini.class.getName().substring(ChiusuraMassivaOrdini.class.getPackage().getName().length() + 1) : ChiusuraMassivaOrdini.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Chiusura Massiva Ordini On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CHIUMASSORDI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CHIUMASSORDI);
      // 
      // Chiusura Massiva Ordini On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI562, IMDBDef14.PQSL_PARAMETRI562_PARCHIUORDCF, 0).equals((new IDVariant("SI")), true))
      {
        PAN_CHIUMASSORDI.SetFlags (Glb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHMESSACF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CHIUMASSORDI.SetFlags (Glb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHMESSACF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraMassivaOrdini", "ChiusuraMassivaOrdiniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Load
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
      // Load Body
      // Corpo Procedura
      // 
      PAN_CHIUMASSORDI.set_FieldText(PFL_CHIUMASSORDI_ETICHEMESSAG, IDL.Add((new IDVariant(PAN_CHIUMASSORDI.FieldText(PFL_CHIUMASSORDI_ETICHEMESSAG))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI157, IMDBDef5.FLD_PARAMETRI157_PARANNOVARIA, 0))).stringValue());
      if (IDL.Sub(IDL.ToInteger(IDL.NullValue(MainFrm.PRIMOESERARM,(new IDVariant("0")))), (new IDVariant(1))).equals(IMDB.Value(IMDBDef5.TBL_PARAMETRI157, IMDBDef5.FLD_PARAMETRI157_PARANNOVARIA, 0), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI157, IMDBDef5.FLD_PARAMETRI157_PARCHIUORDCF, 0, (new IDVariant("SI")));
        PAN_CHIUMASSORDI.SetFlags (Glb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CHIUMASSORDI.SetFlags (Glb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHMESSACF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI157, IMDBDef5.FLD_PARAMETRI157_PARCHIUORDCF, 0, (new IDVariant()));
        PAN_CHIUMASSORDI.SetFlags (Glb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CHIUMASSORDI.SetFlags (Glb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHMESSACF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraMassivaOrdini", "Load", _e);
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ChiusuraMassivaOrdini", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CHIUMASSORDI_PARAMETRI562() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI562_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI157, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI157, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI562_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI562_RS, 0, IMDBDef5.TBL_PARAMETRI157, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI562_RS, 0, 0, IMDBDef5.TBL_PARAMETRI157, IMDBDef5.FLD_PARAMETRI157_PARCHIUORDCF, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI157, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI157, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI157, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI562_RS, 0);
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
  private void PAN_CHIUMASSORDI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CHIUMASSORDI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CHIUMASSORDI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CHIUMASSORDI, Cancel);
    // Stub
  }

  private void PAN_CHIUMASSORDI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CHIUMASSORDI_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_CHIUMASSORDI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CHIUMASSORDI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CHIUMASSORDI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CHIUMASSORDI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CHIUMASSORDI_Init()
  {

    PAN_CHIUMASSORDI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CHIUMASSORDI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CHIUMASSORDI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_CHIUMASSORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEMESSAG, "D4A722D6-DAA7-4755-BEA8-97C5559CEE62");
    PAN_CHIUMASSORDI.set_Header(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEMESSAG, "Tutti i dettagli Ordini selezionati verranno chiusi. La variazione all'ordine verrà registrata con anno ");
    PAN_CHIUMASSORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEMESSAG, MyGlb.VIS_VUOGRAALILEF);
    PAN_CHIUMASSORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEMESSAG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CHIUMASSORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, "9B1200D2-029D-4A64-A03A-BF9A08465884");
    PAN_CHIUMASSORDI.set_Header(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, "Chiusura Ordini di CF");
    PAN_CHIUMASSORDI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, "");
    PAN_CHIUMASSORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, MyGlb.VIS_CHECKSTYLE);
    PAN_CHIUMASSORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CHIUMASSORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHMESSACF, "52062DEE-FAA8-47AE-93E0-D9E50EA049CA");
    PAN_CHIUMASSORDI.set_Header(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHMESSACF, "Verranno chiusi anche i corrispondenti dettagli registrati su CF");
    PAN_CHIUMASSORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHMESSACF, MyGlb.VIS_VUOGRAALILEF);
    PAN_CHIUMASSORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHMESSACF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CHIUMASSORDI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEELABOR, "4B3CC1F9-C99B-415A-BC53-3A0E353B29EC");
    PAN_CHIUMASSORDI.set_Header(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEELABOR, "Elabora");
    PAN_CHIUMASSORDI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_CHIUMASSORDI.SetImage(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEELABOR, 0, "button1.gif", false);
    PAN_CHIUMASSORDI.SetFlags(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_CHIUMASSORDI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CHIUMASSORDI.SetRect(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEMESSAG, MyGlb.PANEL_LIST, 24, 24, 636, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CHIUMASSORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEMESSAG, MyGlb.PANEL_LIST, 0);
    PAN_CHIUMASSORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEMESSAG, MyGlb.PANEL_LIST, 4);
    PAN_CHIUMASSORDI.SetRect(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEMESSAG, MyGlb.PANEL_FORM, 24, 24, 648, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CHIUMASSORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEMESSAG, MyGlb.PANEL_FORM, 0);
    PAN_CHIUMASSORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEMESSAG, MyGlb.PANEL_FORM, 1);
    PAN_CHIUMASSORDI.SetFieldPage(PFL_CHIUMASSORDI_ETICHEMESSAG, -1, -1);
    PAN_CHIUMASSORDI.SetFieldPanel(PFL_CHIUMASSORDI_ETICHEMESSAG, -1, "", "ETICHEMESSAG", 0, 0, 0, -13997);
    PAN_CHIUMASSORDI.SetRect(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CHIUMASSORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, MyGlb.PANEL_LIST, 112);
    PAN_CHIUMASSORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, MyGlb.PANEL_LIST, 1);
    PAN_CHIUMASSORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, MyGlb.PANEL_LIST, "Chiusura Ordini di CF");
    PAN_CHIUMASSORDI.SetRect(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, MyGlb.PANEL_FORM, 24, 48, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CHIUMASSORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, MyGlb.PANEL_FORM, 124);
    PAN_CHIUMASSORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, MyGlb.PANEL_FORM, 1);
    PAN_CHIUMASSORDI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_CHIUSORDINCF, MyGlb.PANEL_FORM, "Chiusura Ordini di CF");
    PAN_CHIUMASSORDI.SetFieldPage(PFL_CHIUMASSORDI_CHIUSORDINCF, -1, -1);
    PAN_CHIUMASSORDI.SetFieldPanel(PFL_CHIUMASSORDI_CHIUSORDINCF, PPQRY_PARAMETRI562, "A.PARCHIUORDCF", "PARCHIUORDCF", 5, 2, 0, -13997);
    PAN_CHIUMASSORDI.SetValueListItem(PFL_CHIUMASSORDI_CHIUSORDINCF, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_CHIUMASSORDI.SetValueListItem(PFL_CHIUMASSORDI_CHIUSORDINCF, (new IDVariant()), "Null", "", "", -1);
    PAN_CHIUMASSORDI.SetRect(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHMESSACF, MyGlb.PANEL_LIST, 32, 32, 636, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CHIUMASSORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHMESSACF, MyGlb.PANEL_LIST, 0);
    PAN_CHIUMASSORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHMESSACF, MyGlb.PANEL_LIST, 4);
    PAN_CHIUMASSORDI.SetRect(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHMESSACF, MyGlb.PANEL_FORM, 24, 72, 636, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CHIUMASSORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHMESSACF, MyGlb.PANEL_FORM, 0);
    PAN_CHIUMASSORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHMESSACF, MyGlb.PANEL_FORM, 1);
    PAN_CHIUMASSORDI.SetFieldPage(PFL_CHIUMASSORDI_ETICHMESSACF, -1, -1);
    PAN_CHIUMASSORDI.SetFieldPanel(PFL_CHIUMASSORDI_ETICHMESSACF, -1, "", "ETICHMESSACF", 0, 0, 0, -13997);
    PAN_CHIUMASSORDI.SetRect(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEELABOR, MyGlb.PANEL_LIST, 540, 116, 112, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CHIUMASSORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_CHIUMASSORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_CHIUMASSORDI.SetRect(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEELABOR, MyGlb.PANEL_FORM, 556, 112, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CHIUMASSORDI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_CHIUMASSORDI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CHIUMASSORDI_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_CHIUMASSORDI.SetFieldPage(PFL_CHIUMASSORDI_ETICHEELABOR, -1, -1);
    PAN_CHIUMASSORDI.SetFieldPanel(PFL_CHIUMASSORDI_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_CHIUMASSORDI_InitQueries()
  {
    StringBuffer SQL;

    PAN_CHIUMASSORDI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CHIUMASSORDI.SetIMDB(IMDB, "PQRY_PARAMETRI562", true);
    PAN_CHIUMASSORDI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_CHIUMASSORDI.SetQueryIMDB(PPQRY_PARAMETRI562, IMDBDef14.PQRY_PARAMETRI562_RS, IMDBDef5.TBL_PARAMETRI157);
    JustLoaded = true;
    PAN_CHIUMASSORDI.SetFieldPrimaryIndex(PFL_CHIUMASSORDI_CHIUSORDINCF, IMDBDef5.FLD_PARAMETRI157_PARCHIUORDCF);
    PAN_CHIUMASSORDI.SetMasterTable(0, "PARAMETRI157");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CHIUMASSORDI.Status() == 2)
    {
      int oldListQBE = PAN_CHIUMASSORDI.iUseListQBE;
      PAN_CHIUMASSORDI.iUseListQBE = 0;
      PAN_CHIUMASSORDI.PanelCommand(Glb.PCM_SEARCH);
      PAN_CHIUMASSORDI.PanelCommand(Glb.PCM_FIND);
      PAN_CHIUMASSORDI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CHIUMASSORDI) PAN_CHIUMASSORDI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CHIUMASSORDI) PAN_CHIUMASSORDI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CHIUMASSORDI) PAN_CHIUMASSORDI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CHIUMASSORDI) PAN_CHIUMASSORDI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CHIUMASSORDI) PAN_CHIUMASSORDI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
