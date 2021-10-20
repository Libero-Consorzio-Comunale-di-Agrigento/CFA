// **********************************************
// Informazioni Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InformazioniVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_VARIAZIONI_TIPOLOGIA = 0;

  private static int PFL_VARIAZIONI_DESCRIZIONE = 0;
  private static int PFL_VARIAZIONI_IMPORTO = 1;
  private static int PFL_VARIAZIONI_IMPORTOCASSA = 2;
  private static int PFL_VARIAZIONI_TIPOVARIAZIO = 3;
  private static int PFL_VARIAZIONI_DESCRITIPOLO = 4;
  private static int PFL_VARIAZIONI_TIPOIMPORTO = 5;
  private static int PFL_VARIAZIONI_DDATAREG = 6;

  private static int PPQRY_VARCOM10 = 0;


  IDPanel PAN_VARIAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IN14(IMDB);
    //
    //
    Init_PQRY_VARCOM10(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IN14(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_IN14, 7);
    IMDB.set_TblCode(IMDBDef3.TBL_IN14, "TBL_IN14");
    IMDB.set_FldCode(IMDBDef3.TBL_IN14,IMDBDef3.FLD_IN14_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef3.TBL_IN14,IMDBDef3.FLD_IN14_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IN14,IMDBDef3.FLD_IN14_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef3.TBL_IN14,IMDBDef3.FLD_IN14_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IN14,IMDBDef3.FLD_IN14_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_IN14,IMDBDef3.FLD_IN14_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IN14,IMDBDef3.FLD_IN14_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_IN14,IMDBDef3.FLD_IN14_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IN14,IMDBDef3.FLD_IN14_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef3.TBL_IN14,IMDBDef3.FLD_IN14_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IN14,IMDBDef3.FLD_IN14_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef3.TBL_IN14,IMDBDef3.FLD_IN14_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IN14,IMDBDef3.FLD_IN14_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef3.TBL_IN14,IMDBDef3.FLD_IN14_SEDE_DEL,5,255,0);
    IMDB.TblAddNew(IMDBDef3.TBL_IN14, 0);
  }

  private static void Init_PQRY_VARCOM10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOM10, 8);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOM10, "PQRY_VARCOM10");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RECOVARCPROG, "RECOVARCPROG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RECOVARCPROG,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RECORDDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RECORDIMPORT, "RECORDIMPORT");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RECORDIMPORT,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RECVARIMPCAS, "RECVARIMPCAS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RECVARIMPCAS,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RECOTIPOVARI, "RECOTIPOVARI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RECOTIPOVARI,5,142,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RECODESCTIPO, "RECODESCTIPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RECODESCTIPO,5,100,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RETIMOVBTIIM, "RETIMOVBTIIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RETIMOVBTIIM,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RECVARDDATRE, "RECVARDDATRE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM10,IMDBDef12.PQSL_VARCOM10_RECVARDDATRE,6,10,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOM10, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InformazioniVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public InformazioniVariazioni()
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
    FormIdx = MyGlb.FRM_INFORMVARIAZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F58D6E50-8546-4361-9A21-DF061C86B9E9";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 936;
    DesignHeight = 398;
    set_Caption(new IDVariant("Informazioni Variazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 936;
    Frames[1].Height = 372;
    Frames[1].Caption = "Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 372;
    PAN_VARIAZIONI = new IDPanel(w, this, 1, "PAN_VARIAZIONI");
    Frames[1].Content = PAN_VARIAZIONI;
    PAN_VARIAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIONI.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 936-MyGlb.PAN_OFFS_X, 372-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3BBAB3FF-C776-44BB-8A69-EBBB1C42B228");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1344, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIONI.InitStatus = 2;
    PAN_VARIAZIONI_Init();
    PAN_VARIAZIONI_InitFields();
    PAN_VARIAZIONI_InitQueries();
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
    // Resetto il fuoco perch� le tabbed view lo possono modificare
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
      PAN_VARIAZIONI.UpdatePanel(MainFrm);
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
  // Torna TRUE se l'oggetto passato � una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof InformazioniVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InformazioniVariazioni.class.getName() : (Glb.ClassWithPackage(InformazioniVariazioni.class) ? InformazioniVariazioni.class.getName().substring(InformazioniVariazioni.class.getPackage().getName().length() + 1) : InformazioniVariazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniVariazioni", "Load", _e);
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
      UNLOAD_INDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniVariazioni", "Unload", _e);
    }
  }

  // **********************************************************************
  // IN: Delete
  // Perch� stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_INDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_ANNO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_NUMERO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IN14, IMDBDef3.FLD_IN14_SEDE_DEL, 0, new IDVariant());
  }

  // **********************************************************************
  // Variazioni On Dynamic Properties
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZIONI);
      // 
      // Variazioni On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_DESCRIZIONE,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRIZIONE))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_TIPOVARIAZIO,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_TIPOVARIAZIO))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_DESCRITIPOLO,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRITIPOLO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniVariazioni", "VariazioniOnDynamicProperties", _e);
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cio� quando viene portata in primo piano
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
  private void PAN_VARIAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZIONI, Cancel);
    // Stub
  }

  private void PAN_VARIAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VARIAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARCOM10, IMDBDef12.PQSL_VARCOM10_RECVARDDATRE, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARCOM10, IMDBDef12.PQSL_VARCOM10_RECVARDDATRE, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_VARIAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAZIONI_Init()
  {

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_TIPOLOGIA, "63CA9FB3-9977-40D2-BCCF-368B68ED1EDA");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_TIPOLOGIA, "Tipologia");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_TIPOLOGIA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_TIPOLOGIA, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_TIPOLOGIA, MyGlb.PANEL_LIST, 856, -9999, 408, 16, 0, 0);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_TIPOLOGIA, MyGlb.PANEL_FORM, 0, 99, 604, 73, 0, 0);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_TIPOLOGIA, 0, 51);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_TIPOLOGIA, 1, 13);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_TIPOLOGIA, 0, 4);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_TIPOLOGIA, 1, 4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_TIPOLOGIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "0093D32E-D109-4267-9861-F1AFDDD36CE7");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "Descrizione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "5C1DCE06-72B5-48C8-8866-FFF3CC607209");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "Importo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, "E128A97D-78E5-4135-B70D-AB34500A19FE");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, "Importo Cassa");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "33BA767A-745F-4282-8D11-C0B57B65306B");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "Tipo Variazione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRITIPOLO, "EFBC8147-1F89-47C2-A054-13D22BA3BB94");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRITIPOLO, "Descrizione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRITIPOLO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRITIPOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRITIPOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOIMPORTO, "BF2B5A97-FD0B-463B-9B9F-C841FB7F7E75");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOIMPORTO, "Tipo Importo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOIMPORTO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOIMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOIMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DDATAREG, "6F1451FF-7011-4C54-9E0A-F5D0ED01107C");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DDATAREG, "Data Reg.");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DDATAREG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 280, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 4, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DESCRIZIONE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DESCRIZIONE, PPQRY_VARCOM10, "A.DESCRIZIONE", "RECORDDESCRI", 5, 140, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 280, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 4, 40, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTO, PPQRY_VARCOM10, "A.IMPORTO", "RECORDIMPORT", 3, 14, 2, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_LIST, 428, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_LIST, 104);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_LIST, "Importo Cassa");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_FORM, 4, 64, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_FORM, 104);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_FORM, "Importo Cassa");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTOCASSA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTOCASSA, PPQRY_VARCOM10, "A.IMPORTO_CASSA", "RECVARIMPCAS", 3, 14, 2, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 576, 36, 280, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 4, 88, 460, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPOVARIAZIO, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_TIPOVARIAZIO, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPOVARIAZIO, PPQRY_VARCOM10, "TO_CHAR ( A.TIPO_VAR ) || ' - ' || B.DESCRIZIONE", "RECOTIPOVARI", 5, 142, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRITIPOLO, MyGlb.PANEL_LIST, 856, 36, 280, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRITIPOLO, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRITIPOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRITIPOLO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRITIPOLO, MyGlb.PANEL_FORM, 4, 124, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRITIPOLO, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRITIPOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRITIPOLO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DESCRITIPOLO, -1, GRP_VARIAZIONI_TIPOLOGIA);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DESCRITIPOLO, PPQRY_VARCOM10, "C.DESCRIZIONE", "RECODESCTIPO", 5, 100, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOIMPORTO, MyGlb.PANEL_LIST, 1136, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOIMPORTO, MyGlb.PANEL_LIST, 92);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOIMPORTO, MyGlb.PANEL_LIST, "Tipo Importo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOIMPORTO, MyGlb.PANEL_FORM, 4, 148, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOIMPORTO, MyGlb.PANEL_FORM, 92);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOIMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOIMPORTO, MyGlb.PANEL_FORM, "Tipo Importo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPOIMPORTO, -1, GRP_VARIAZIONI_TIPOLOGIA);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPOIMPORTO, PPQRY_VARCOM10, "C.TIPO_IMPORTO", "RETIMOVBTIIM", 5, 2, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_TIPOIMPORTO, (new IDVariant("CO")), "Competenza", "", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_TIPOIMPORTO, (new IDVariant("CA")), "Cassa", "", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_TIPOIMPORTO, (new IDVariant("RE")), "Reiscrizione", "", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_TIPOIMPORTO, (new IDVariant("T")), "Competenza e Cassa", "", "", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DDATAREG, MyGlb.PANEL_LIST, 1264, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DDATAREG, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DDATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DDATAREG, MyGlb.PANEL_FORM, 4, 172, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DDATAREG, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DDATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DDATAREG, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DDATAREG, PPQRY_VARCOM10, "A.D_DATA_REG", "RECVARDDATRE", 6, 10, 0, -13997);
  }

  private void PAN_VARIAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VARIAZIONI.SetIMDB(IMDB, "PQRY_VARCOM10", true);
    PAN_VARIAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as RECOVARCPROG, ");
    SQL.append("  A.DESCRIZIONE as RECORDDESCRI, ");
    SQL.append("  A.IMPORTO as RECORDIMPORT, ");
    SQL.append("  A.IMPORTO_CASSA as RECVARIMPCAS, ");
    SQL.append("  TO_CHAR ( A.TIPO_VAR ) || ' - ' || B.DESCRIZIONE as RECOTIPOVARI, ");
    SQL.append("  C.DESCRIZIONE as RECODESCTIPO, ");
    SQL.append("  C.TIPO_IMPORTO as RETIMOVBTIIM, ");
    SQL.append("  A.D_DATA_REG as RECVARDDATRE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM10, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARCOM A, ");
    SQL.append("  T54 B, ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL C ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM10, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_IN14.NOMEOGGEESER~~) ");
    SQL.append("and   (A.E_S = ~~TBL_IN14.NOMEOGGETTES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_IN14.NOMEOGGECAPI~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_IN14.NOMEOGGEARTI~~) ");
    SQL.append("and   (A.SEDE_DEL = NVL(~~TBL_IN14.SEDE_DEL~~, A.SEDE_DEL)) ");
    SQL.append("and   (A.NUMERO_DEL = NVL(~~TBL_IN14.NUMERO_DEL~~, A.NUMERO_DEL)) ");
    SQL.append("and   (A.ANNO_DEL = NVL(~~TBL_IN14.ANNO_DEL~~, A.ANNO_DEL)) ");
    SQL.append("and   (A.TIPO_VAR = B.CODICE) ");
    SQL.append("and   (C.CODICE(+) = B.TIPOLOGIA) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM10, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM10, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM10, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.D_DATA_REG ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM10, 5, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_VARCOM10, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(0, "VARCOM");
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_DDATAREG, true);
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_VARIAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZIONI.iUseListQBE;
      PAN_VARIAZIONI.iUseListQBE = 0;
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
