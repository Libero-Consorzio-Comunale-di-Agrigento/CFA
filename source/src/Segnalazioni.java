// **********************************************
// Segnalazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Segnalazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_MESSAGGI_IDDOCUMENTO = 0;
  private static int PFL_MESSAGGI_NUMERODOCUME = 1;
  private static int PFL_MESSAGGI_DATADOCUMENT = 2;
  private static int PFL_MESSAGGI_DATAINS = 3;
  private static int PFL_MESSAGGI_UTENTEINS = 4;
  private static int PFL_MESSAGGI_MESSAGGIO = 5;
  private static int PFL_MESSAGGI_ETICHETTAOK = 6;
  private static int PFL_MESSAGGI_ETICLABEDOCU = 7;
  private static int PFL_MESSAGGI_ETICTESTTOTA = 8;

  private static int PPQRY_WRKACCMULTI = 0;


  IDPanel PAN_MESSAGGI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NUMERARECORD(IMDB);
    //
    //
    Init_PQRY_WRKACCMULTI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NUMERARECORD(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_NUMERARECORD, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_NUMERARECORD, "TBL_NUMERARECORD");
    IMDB.set_FldCode(IMDBDef2.TBL_NUMERARECORD,IMDBDef2.FLD_NUMERARECORD_NOMOGGTECOER, "NOMOGGTECOER");
    IMDB.SetFldParams(IMDBDef2.TBL_NUMERARECORD,IMDBDef2.FLD_NUMERARECORD_NOMOGGTECOER,5,255,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NUMERARECORD,IMDBDef2.FLD_NUMERARECORD_NOMOGGUTLAPR, "NOMOGGUTLAPR");
    IMDB.SetFldParams(IMDBDef2.TBL_NUMERARECORD,IMDBDef2.FLD_NUMERARECORD_NOMOGGUTLAPR,5,50,0);
    IMDB.TblAddNew(IMDBDef2.TBL_NUMERARECORD, 0);
  }

  private static void Init_PQRY_WRKACCMULTI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_WRKACCMULTI, 6);
    IMDB.set_TblCode(IMDBDef10.PQRY_WRKACCMULTI, "PQRY_WRKACCMULTI");
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKACCMULTI,IMDBDef10.PQSL_WRKACCMULTI_WRKACCMUIDDO, "WRKACCMUIDDO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKACCMULTI,IMDBDef10.PQSL_WRKACCMULTI_WRKACCMUIDDO,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKACCMULTI,IMDBDef10.PQSL_WRKACCMULTI_WRKACCMUNUDO, "WRKACCMUNUDO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKACCMULTI,IMDBDef10.PQSL_WRKACCMULTI_WRKACCMUNUDO,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKACCMULTI,IMDBDef10.PQSL_WRKACCMULTI_WRKACCMUDADO, "WRKACCMUDADO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKACCMULTI,IMDBDef10.PQSL_WRKACCMULTI_WRKACCMUDADO,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKACCMULTI,IMDBDef10.PQSL_WRKACCMULTI_WRKACCMULMES, "WRKACCMULMES");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKACCMULTI,IMDBDef10.PQSL_WRKACCMULTI_WRKACCMULMES,5,4000,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKACCMULTI,IMDBDef10.PQSL_WRKACCMULTI_WRKACCMUDAIN, "WRKACCMUDAIN");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKACCMULTI,IMDBDef10.PQSL_WRKACCMULTI_WRKACCMUDAIN,8,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WRKACCMULTI,IMDBDef10.PQSL_WRKACCMULTI_WRKACCMUUTIN, "WRKACCMUUTIN");
    IMDB.SetFldParams(IMDBDef10.PQRY_WRKACCMULTI,IMDBDef10.PQSL_WRKACCMULTI_WRKACCMUUTIN,5,8,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_WRKACCMULTI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Segnalazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public Segnalazioni()
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
    FormIdx = MyGlb.FRM_SEGNALAZIONI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E5A84F6E-71A9-4000-8949-853B25EBF6AF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 812;
    DesignHeight = 454;
    set_Caption(new IDVariant("Segnalazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 812;
    Frames[1].Height = 428;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Messaggi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 428;
    PAN_MESSAGGI = new IDPanel(w, this, 1, "PAN_MESSAGGI");
    Frames[1].Content = PAN_MESSAGGI;
    PAN_MESSAGGI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MESSAGGI.VS = MainFrm.VisualStyleList;
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 812-MyGlb.PAN_OFFS_X, 428-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MESSAGGI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DFAC94D6-9635-4244-A0F9-F7AB7D4E3079");
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 44, 708, 316, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_MESSAGGI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MESSAGGI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MESSAGGI.InitStatus = 2;
    PAN_MESSAGGI_Init();
    PAN_MESSAGGI_InitFields();
    PAN_MESSAGGI_InitQueries();
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
      PAN_MESSAGGI.UpdatePanel(MainFrm);
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
    return (obj instanceof Segnalazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Segnalazioni.class.getName() : (Glb.ClassWithPackage(Segnalazioni.class) ? Segnalazioni.class.getName().substring(Segnalazioni.class.getPackage().getName().length() + 1) : Segnalazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Etichetta ok
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Etichettaok ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta ok Body
      // Corpo Procedura
      // 
      SQL = new StringBuffer();
      SQL.append("delete from WRK_ACC_MULTI ");
      SQL.append("where (UTENTE_INS = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_NUMERARECORD, IMDBDef2.FLD_NUMERARECORD_NOMOGGUTLAPR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Segnalazioni", "Etichettaok", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
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
      // Unload Body
      // Corpo Procedura
      // 
      SQL = new StringBuffer();
      SQL.append("delete from WRK_ACC_MULTI ");
      SQL.append("where (UTENTE_INS = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_NUMERARECORD, IMDBDef2.FLD_NUMERARECORD_NOMOGGUTLAPR, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      UNLOAD_NUMERECODELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Segnalazioni", "Unload", _e);
    }
  }

  // **********************************************************************
  // Numerazione Record: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_NUMERECODELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_NUMERARECORD, IMDBDef2.FLD_NUMERARECORD_NOMOGGTECOER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_NUMERARECORD, IMDBDef2.FLD_NUMERARECORD_NOMOGGUTLAPR, 0, new IDVariant());
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
      PAN_MESSAGGI.set_FieldText(PFL_MESSAGGI_ETICTESTTOTA, IMDB.Value(IMDBDef2.TBL_NUMERARECORD, IMDBDef2.FLD_NUMERARECORD_NOMOGGTECOER, 0).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Segnalazioni", "Load", _e);
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
  private void PAN_MESSAGGI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MESSAGGI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MESSAGGI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MESSAGGI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MESSAGGI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_MESSAGGI);
    // Stub
  }

  private void PAN_MESSAGGI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_MESSAGGI_ETICHETTAOK)
    {
      this.IdxPanelActived = this.PAN_MESSAGGI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Etichettaok();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_MESSAGGI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_MESSAGGI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_MESSAGGI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_MESSAGGI_Init()
  {

    PAN_MESSAGGI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MESSAGGI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MESSAGGI.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_MESSAGGI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MESSAGGI_IDDOCUMENTO, "E3CF2978-E499-43CE-84E1-6AF897F0ED9E");
    PAN_MESSAGGI.set_Header(MyGlb.OBJ_FIELD, PFL_MESSAGGI_IDDOCUMENTO, "ID DOCUMENTO");
    PAN_MESSAGGI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MESSAGGI_IDDOCUMENTO, "");
    PAN_MESSAGGI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MESSAGGI_IDDOCUMENTO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_MESSAGGI.SetFlags(MyGlb.OBJ_FIELD, PFL_MESSAGGI_IDDOCUMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_MESSAGGI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MESSAGGI_NUMERODOCUME, "57E98BE4-21D7-4A6B-A243-DABA5DF10219");
    PAN_MESSAGGI.set_Header(MyGlb.OBJ_FIELD, PFL_MESSAGGI_NUMERODOCUME, "Num. Documento");
    PAN_MESSAGGI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MESSAGGI_NUMERODOCUME, "");
    PAN_MESSAGGI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MESSAGGI_NUMERODOCUME, MyGlb.VIS_NORMALFIELDS);
    PAN_MESSAGGI.SetFlags(MyGlb.OBJ_FIELD, PFL_MESSAGGI_NUMERODOCUME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MESSAGGI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATADOCUMENT, "61B2215E-B216-4B22-A8FB-A63F54D3D68F");
    PAN_MESSAGGI.set_Header(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATADOCUMENT, "Data Documento");
    PAN_MESSAGGI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATADOCUMENT, "");
    PAN_MESSAGGI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATADOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_MESSAGGI.SetFlags(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATADOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MESSAGGI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATAINS, "6838C08E-0295-4CEB-9A19-F59FDECC0173");
    PAN_MESSAGGI.set_Header(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATAINS, "DATA INS");
    PAN_MESSAGGI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATAINS, "");
    PAN_MESSAGGI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATAINS, MyGlb.VIS_NORMFIELPADR);
    PAN_MESSAGGI.SetFlags(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATAINS, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MESSAGGI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MESSAGGI_UTENTEINS, "18882CA2-746D-4D72-ABC7-1756DB97F828");
    PAN_MESSAGGI.set_Header(MyGlb.OBJ_FIELD, PFL_MESSAGGI_UTENTEINS, "UTENTE INS");
    PAN_MESSAGGI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MESSAGGI_UTENTEINS, "");
    PAN_MESSAGGI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MESSAGGI_UTENTEINS, MyGlb.VIS_NORMFIELPADR);
    PAN_MESSAGGI.SetFlags(MyGlb.OBJ_FIELD, PFL_MESSAGGI_UTENTEINS, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MESSAGGI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MESSAGGI_MESSAGGIO, "1007D8BD-A159-4C16-9CA3-509126D42D4E");
    PAN_MESSAGGI.set_Header(MyGlb.OBJ_FIELD, PFL_MESSAGGI_MESSAGGIO, "Messaggio");
    PAN_MESSAGGI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MESSAGGI_MESSAGGIO, "");
    PAN_MESSAGGI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MESSAGGI_MESSAGGIO, MyGlb.VIS_NORMALFIELDS);
    PAN_MESSAGGI.SetFlags(MyGlb.OBJ_FIELD, PFL_MESSAGGI_MESSAGGIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MESSAGGI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICHETTAOK, "CCF6559F-65B9-40DC-955C-4C806BBAE0D4");
    PAN_MESSAGGI.set_Header(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICHETTAOK, "OK");
    PAN_MESSAGGI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICHETTAOK, "ok");
    PAN_MESSAGGI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICHETTAOK, MyGlb.VIS_STATICBUTTON);
    PAN_MESSAGGI.SetImage(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICHETTAOK, 0, "button1.gif", false);
    PAN_MESSAGGI.SetFlags(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICHETTAOK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_MESSAGGI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICLABEDOCU, "4023B0D3-50EC-4926-AA47-4B1A8210AA32");
    PAN_MESSAGGI.set_Header(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICLABEDOCU, "Documento");
    PAN_MESSAGGI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICLABEDOCU, MyGlb.VIS_LABEVISUSTYL);
    PAN_MESSAGGI.SetFlags(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICLABEDOCU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MESSAGGI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICTESTTOTA, "7CB24DAE-6769-4673-90E8-AF8133C7AC89");
    PAN_MESSAGGI.set_Header(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICTESTTOTA, "testo_totale");
    PAN_MESSAGGI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICTESTTOTA, MyGlb.VIS_LABELFIELD);
    PAN_MESSAGGI.SetFlags(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICTESTTOTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_MESSAGGI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_IDDOCUMENTO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_IDDOCUMENTO, MyGlb.PANEL_LIST, 96);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_IDDOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_MESSAGGI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MESSAGGI_IDDOCUMENTO, MyGlb.PANEL_LIST, "ID DOC.");
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_IDDOCUMENTO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_IDDOCUMENTO, MyGlb.PANEL_FORM, 128);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_IDDOCUMENTO, MyGlb.PANEL_FORM, 1);
    PAN_MESSAGGI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MESSAGGI_IDDOCUMENTO, MyGlb.PANEL_FORM, "ID DOCUMENTO");
    PAN_MESSAGGI.SetFieldPage(PFL_MESSAGGI_IDDOCUMENTO, -1, -1);
    PAN_MESSAGGI.SetFieldPanel(PFL_MESSAGGI_IDDOCUMENTO, PPQRY_WRKACCMULTI, "A.ID_DOCUMENTO", "WRKACCMUIDDO", 2, 15, 0, -13997);
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_NUMERODOCUME, MyGlb.PANEL_LIST, 0, 80, 104, 56, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_NUMERODOCUME, MyGlb.PANEL_LIST, 128);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_NUMERODOCUME, MyGlb.PANEL_LIST, 3);
    PAN_MESSAGGI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MESSAGGI_NUMERODOCUME, MyGlb.PANEL_LIST, "Num. Documento");
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_NUMERODOCUME, MyGlb.PANEL_FORM, 4, 28, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_NUMERODOCUME, MyGlb.PANEL_FORM, 128);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_NUMERODOCUME, MyGlb.PANEL_FORM, 1);
    PAN_MESSAGGI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MESSAGGI_NUMERODOCUME, MyGlb.PANEL_FORM, "Num. Documento");
    PAN_MESSAGGI.SetFieldPage(PFL_MESSAGGI_NUMERODOCUME, -1, -1);
    PAN_MESSAGGI.SetFieldPanel(PFL_MESSAGGI_NUMERODOCUME, PPQRY_WRKACCMULTI, "A.NUMERO_DOCUMENTO", "WRKACCMUNUDO", 5, 20, 0, -13997);
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATADOCUMENT, MyGlb.PANEL_LIST, 104, 80, 64, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATADOCUMENT, MyGlb.PANEL_LIST, 112);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATADOCUMENT, MyGlb.PANEL_LIST, 3);
    PAN_MESSAGGI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATADOCUMENT, MyGlb.PANEL_LIST, "Dt. Docum.");
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATADOCUMENT, MyGlb.PANEL_FORM, 4, 52, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATADOCUMENT, MyGlb.PANEL_FORM, 128);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATADOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_MESSAGGI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATADOCUMENT, MyGlb.PANEL_FORM, "Data Documento");
    PAN_MESSAGGI.SetFieldPage(PFL_MESSAGGI_DATADOCUMENT, -1, -1);
    PAN_MESSAGGI.SetFieldPanel(PFL_MESSAGGI_DATADOCUMENT, PPQRY_WRKACCMULTI, "A.DATA_DOCUMENTO", "WRKACCMUDADO", 6, 19, 0, -13997);
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATAINS, MyGlb.PANEL_LIST, 272, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATAINS, MyGlb.PANEL_LIST, 64);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATAINS, MyGlb.PANEL_LIST, 1);
    PAN_MESSAGGI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATAINS, MyGlb.PANEL_LIST, "DATA INS");
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATAINS, MyGlb.PANEL_FORM, 4, 100, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATAINS, MyGlb.PANEL_FORM, 128);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATAINS, MyGlb.PANEL_FORM, 1);
    PAN_MESSAGGI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MESSAGGI_DATAINS, MyGlb.PANEL_FORM, "DATA INS");
    PAN_MESSAGGI.SetFieldPage(PFL_MESSAGGI_DATAINS, -1, -1);
    PAN_MESSAGGI.SetFieldPanel(PFL_MESSAGGI_DATAINS, PPQRY_WRKACCMULTI, "A.DATA_INS", "WRKACCMUDAIN", 8, 19, 0, -13997);
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_UTENTEINS, MyGlb.PANEL_LIST, 272, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_UTENTEINS, MyGlb.PANEL_LIST, 72);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_UTENTEINS, MyGlb.PANEL_LIST, 1);
    PAN_MESSAGGI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MESSAGGI_UTENTEINS, MyGlb.PANEL_LIST, "UTENTE INS");
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_UTENTEINS, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_UTENTEINS, MyGlb.PANEL_FORM, 128);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_UTENTEINS, MyGlb.PANEL_FORM, 1);
    PAN_MESSAGGI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MESSAGGI_UTENTEINS, MyGlb.PANEL_FORM, "UTENTE INS");
    PAN_MESSAGGI.SetFieldPage(PFL_MESSAGGI_UTENTEINS, -1, -1);
    PAN_MESSAGGI.SetFieldPanel(PFL_MESSAGGI_UTENTEINS, PPQRY_WRKACCMULTI, "A.UTENTE_INS", "WRKACCMUUTIN", 5, 8, 0, -13997);
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_MESSAGGIO, MyGlb.PANEL_LIST, 168, 80, 540, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_MESSAGGIO, MyGlb.PANEL_LIST, 88);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_MESSAGGIO, MyGlb.PANEL_LIST, 3);
    PAN_MESSAGGI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MESSAGGI_MESSAGGIO, MyGlb.PANEL_LIST, "Messaggio");
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_MESSAGGIO, MyGlb.PANEL_FORM, 4, 76, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_MESSAGGIO, MyGlb.PANEL_FORM, 128);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_MESSAGGIO, MyGlb.PANEL_FORM, 2);
    PAN_MESSAGGI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MESSAGGI_MESSAGGIO, MyGlb.PANEL_FORM, "Messaggio");
    PAN_MESSAGGI.SetFieldPage(PFL_MESSAGGI_MESSAGGIO, -1, -1);
    PAN_MESSAGGI.SetFieldPanel(PFL_MESSAGGI_MESSAGGIO, PPQRY_WRKACCMULTI, "A.MESSAGGIO", "WRKACCMULMES", 5, 4000, 0, -13997);
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICHETTAOK, MyGlb.PANEL_LIST, 648, 372, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICHETTAOK, MyGlb.PANEL_LIST, 0);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICHETTAOK, MyGlb.PANEL_LIST, 1);
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICHETTAOK, MyGlb.PANEL_FORM, 544, 356, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICHETTAOK, MyGlb.PANEL_FORM, 0);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICHETTAOK, MyGlb.PANEL_FORM, 1);
    PAN_MESSAGGI.SetFieldPage(PFL_MESSAGGI_ETICHETTAOK, -1, -1);
    PAN_MESSAGGI.SetFieldPanel(PFL_MESSAGGI_ETICHETTAOK, -1, "", "ETICHETTAOK", 0, 0, 0, -13997);
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICLABEDOCU, MyGlb.PANEL_LIST, 0, 44, 168, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICLABEDOCU, MyGlb.PANEL_LIST, 0);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICLABEDOCU, MyGlb.PANEL_LIST, 2);
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICLABEDOCU, MyGlb.PANEL_FORM, 4, 344, 188, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICLABEDOCU, MyGlb.PANEL_FORM, 0);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICLABEDOCU, MyGlb.PANEL_FORM, 2);
    PAN_MESSAGGI.SetFieldPage(PFL_MESSAGGI_ETICLABEDOCU, -1, -1);
    PAN_MESSAGGI.SetFieldPanel(PFL_MESSAGGI_ETICLABEDOCU, -1, "", "ETICLABEDOCU", 0, 0, 0, -13997);
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICTESTTOTA, MyGlb.PANEL_LIST, 0, 8, 688, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICTESTTOTA, MyGlb.PANEL_LIST, 0);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICTESTTOTA, MyGlb.PANEL_LIST, 1);
    PAN_MESSAGGI.SetRect(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICTESTTOTA, MyGlb.PANEL_FORM, 0, 8, 688, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MESSAGGI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICTESTTOTA, MyGlb.PANEL_FORM, 0);
    PAN_MESSAGGI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MESSAGGI_ETICTESTTOTA, MyGlb.PANEL_FORM, 1);
    PAN_MESSAGGI.SetFieldPage(PFL_MESSAGGI_ETICTESTTOTA, -1, -1);
    PAN_MESSAGGI.SetFieldPanel(PFL_MESSAGGI_ETICTESTTOTA, -1, "", "ETICTESTTOTA", 0, 0, 0, -13997);
    PAN_MESSAGGI.set_Alignment(PFL_MESSAGGI_ETICTESTTOTA, 3);
    PAN_MESSAGGI.set_FontModifiers(PFL_MESSAGGI_ETICTESTTOTA, "B");
  }

  private void PAN_MESSAGGI_InitQueries()
  {
    StringBuffer SQL;

    PAN_MESSAGGI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_MESSAGGI.SetIMDB(IMDB, "PQRY_WRKACCMULTI", true);
    PAN_MESSAGGI.set_SetString(MyGlb.MASTER_ROWNAME, "WRK ACC MULTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_DOCUMENTO as WRKACCMUIDDO, ");
    SQL.append("  A.NUMERO_DOCUMENTO as WRKACCMUNUDO, ");
    SQL.append("  A.DATA_DOCUMENTO as WRKACCMUDADO, ");
    SQL.append("  A.MESSAGGIO as WRKACCMULMES, ");
    SQL.append("  A.DATA_INS as WRKACCMUDAIN, ");
    SQL.append("  A.UTENTE_INS as WRKACCMUUTIN ");
    PAN_MESSAGGI.SetQuery(PPQRY_WRKACCMULTI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_ACC_MULTI A ");
    PAN_MESSAGGI.SetQuery(PPQRY_WRKACCMULTI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.UTENTE_INS = SUBSTR(~~TBL_NUMERARECORD.NOMOGGUTLAPR~~, 1, 8)) ");
    PAN_MESSAGGI.SetQuery(PPQRY_WRKACCMULTI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MESSAGGI.SetQuery(PPQRY_WRKACCMULTI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MESSAGGI.SetQuery(PPQRY_WRKACCMULTI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MESSAGGI.SetQuery(PPQRY_WRKACCMULTI, 5, SQL, -1, "");
    PAN_MESSAGGI.SetQueryDB(PPQRY_WRKACCMULTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MESSAGGI.SetMasterTable(0, "WRK_ACC_MULTI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MESSAGGI.Status() == 2)
    {
      int oldListQBE = PAN_MESSAGGI.iUseListQBE;
      PAN_MESSAGGI.iUseListQBE = 0;
      PAN_MESSAGGI.PanelCommand(Glb.PCM_SEARCH);
      PAN_MESSAGGI.PanelCommand(Glb.PCM_FIND);
      PAN_MESSAGGI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_MESSAGGI) PAN_MESSAGGI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MESSAGGI) PAN_MESSAGGI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MESSAGGI) PAN_MESSAGGI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_MESSAGGI) PAN_MESSAGGI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MESSAGGI) PAN_MESSAGGI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
