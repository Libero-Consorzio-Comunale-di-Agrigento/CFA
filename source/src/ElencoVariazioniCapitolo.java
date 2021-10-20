// **********************************************
// Elenco Variazioni Capitolo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoVariazioniCapitolo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_VARIAZCAPITO_IMPORTO = 0;

  private static int PFL_VARIAZCAPITO_PROGRESSIVO = 0;
  private static int PFL_VARIAZCAPITO_ESERCIZIO = 1;
  private static int PFL_VARIAZCAPITO_ES = 2;
  private static int PFL_VARIAZCAPITO_CAPITOLO = 3;
  private static int PFL_VARIAZCAPITO_ARTICOLO = 4;
  private static int PFL_VARIAZCAPITO_UNITAPROPONE = 5;
  private static int PFL_VARIAZCAPITO_NUMEROPROPOS = 6;
  private static int PFL_VARIAZCAPITO_ANNOPROPOSTA = 7;
  private static int PFL_VARIAZCAPITO_DDATAREG = 8;
  private static int PFL_VARIAZCAPITO_DESCRIZIONE = 9;
  private static int PFL_VARIAZCAPITO_IMPORTO = 10;
  private static int PFL_VARIAZCAPITO_IMPORTOCASSA = 11;
  private static int PFL_VARIAZCAPITO_TIPOVAR = 12;
  private static int PFL_VARIAZCAPITO_MOTIVAZIONE = 13;

  private static int PPQRY_VARCOMPRO = 0;

  private static int PPQRY_TIPIMOTIVAZI = 1;

  private static int PPQRY_T54 = 2;


  IDPanel PAN_VARIAZCAPITO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM124(IMDB);
    //
    //
    Init_PQRY_VARCOMPRO(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM124(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAM124, 4);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAM124, "TBL_PARAM124");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM124,IMDBDef4.FLD_PARAM124_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM124,IMDBDef4.FLD_PARAM124_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM124,IMDBDef4.FLD_PARAM124_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM124,IMDBDef4.FLD_PARAM124_PARAMPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM124,IMDBDef4.FLD_PARAM124_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM124,IMDBDef4.FLD_PARAM124_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM124,IMDBDef4.FLD_PARAM124_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM124,IMDBDef4.FLD_PARAM124_PARAMARTICOL,1,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAM124, 0);
  }

  private static void Init_PQRY_VARCOMPRO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOMPRO, 13);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOMPRO, "PQRY_VARCOMPRO");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOMPROGRE, "VARCOMPROGRE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOMPROGRE,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOMESERCI, "VARCOMESERCI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOMESERCI,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOMPROES, "VARCOMPROES");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOMPROES,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOMCAPITO, "VARCOMCAPITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOMCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOMARTICO, "VARCOMARTICO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOMARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOMIMPORT, "VARCOMIMPORT");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOMIMPORT,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOMDESCRI, "VARCOMDESCRI");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOMDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOTIPOVAR, "VARCOTIPOVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCOTIPOVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCANNOPROP, "VARCANNOPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCANNOPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCUNITPROP, "VARCUNITPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCUNITPROP,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCNUMEPROP, "VARCNUMEPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCNUMEPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCDDATAREG, "VARCDDATAREG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCDDATAREG,6,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCIMPOCASS, "VARCIMPOCASS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOMPRO,IMDBDef12.PQSL_VARCOMPRO_VARCIMPOCASS,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOMPRO, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoVariazioniCapitolo(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoVariazioniCapitolo()
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
    FormIdx = MyGlb.FRM_ELENVARICAPI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5A2994B6-88A0-4E1F-AE5E-3D5D674A9FC2";
    ResModeW = 3;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1040;
    DesignHeight = 354;
    set_Caption(new IDVariant("Elenco Variazioni Capitolo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1040;
    Frames[1].Height = 328;
    Frames[1].Caption = "Variazioni Capitolo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 328;
    PAN_VARIAZCAPITO = new IDPanel(w, this, 1, "PAN_VARIAZCAPITO");
    Frames[1].Content = PAN_VARIAZCAPITO;
    PAN_VARIAZCAPITO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZCAPITO.VS = MainFrm.VisualStyleList;
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 328-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "80A40DE6-C10E-4AA9-B6FC-1D8DA76CC814");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 968, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZCAPITO.InitStatus = 2;
    PAN_VARIAZCAPITO_Init();
    PAN_VARIAZCAPITO_InitFields();
    PAN_VARIAZCAPITO_InitQueries();
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
      PAN_VARIAZCAPITO.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoVariazioniCapitolo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoVariazioniCapitolo.class.getName() : (Glb.ClassWithPackage(ElencoVariazioniCapitolo.class) ? ElencoVariazioniCapitolo.class.getName().substring(ElencoVariazioniCapitolo.class.getPackage().getName().length() + 1) : ElencoVariazioniCapitolo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Variazioni Capitolo On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZCAPITO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZCAPITO);
      // 
      // Variazioni Capitolo On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VARIAZCAPITO.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZCAPITO_DESCRIZIONE,(new IDVariant(PAN_VARIAZCAPITO.FieldText(PFL_VARIAZCAPITO_DESCRIZIONE))).stringValue()); 
      PAN_VARIAZCAPITO.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZCAPITO_TIPOVAR,(new IDVariant(PAN_VARIAZCAPITO.FieldText(PFL_VARIAZCAPITO_TIPOVAR))).stringValue()); 
      PAN_VARIAZCAPITO.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZCAPITO_MOTIVAZIONE,(new IDVariant(PAN_VARIAZCAPITO.FieldText(PFL_VARIAZCAPITO_MOTIVAZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoVariazioniCapitolo", "VariazioniCapitoloOnDynamicProperties", _e);
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
    // Stub
  }

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
  private void PAN_VARIAZCAPITO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZCAPITO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAZCAPITO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZCAPITO, Cancel);
    // Stub
  }

  private void PAN_VARIAZCAPITO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VARIAZCAPITO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZCAPITO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAZCAPITO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAZCAPITO_Init()
  {

    PAN_VARIAZCAPITO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZCAPITO.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZCAPITO_IMPORTO, "7BAE14A9-5A85-4E19-B977-7D80E4E7F2C0");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZCAPITO_IMPORTO, "Importo");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZCAPITO_IMPORTO, "");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZCAPITO_IMPORTO, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZCAPITO_IMPORTO, MyGlb.PANEL_LIST, 460, -9999, 216, 16, 0, 0);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZCAPITO_IMPORTO, MyGlb.PANEL_FORM, 0, -21, 488, 121, 0, 0);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZCAPITO_IMPORTO, 0, 47);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZCAPITO_IMPORTO, 1, 13);
    PAN_VARIAZCAPITO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZCAPITO_IMPORTO, 0, 4);
    PAN_VARIAZCAPITO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZCAPITO_IMPORTO, 1, 4);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZCAPITO_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZCAPITO.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_PROGRESSIVO, "744F98F8-4EB0-4DDF-B1B3-550CF6B278B8");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_PROGRESSIVO, "PROGRESSIVO");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_PROGRESSIVO, "");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ESERCIZIO, "67824A3F-622C-43F7-B322-BB1679D7EAB6");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ESERCIZIO, "ESERCIZIO");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ESERCIZIO, "");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ESERCIZIO, 0, -1);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ES, "CC514738-4A58-4B71-9E3E-51B206F371AB");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ES, "E S");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ES, "Brief description of field content.");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ES, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ES, 0, -1);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_CAPITOLO, "0FD0EAF3-8F74-4D9B-811E-040947101C32");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_CAPITOLO, "CAPITOLO");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_CAPITOLO, "");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_CAPITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_CAPITOLO, 0, -1);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ARTICOLO, "FAF29D28-084C-4829-8AAB-E7892292F616");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ARTICOLO, "ARTICOLO");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ARTICOLO, "");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ARTICOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ARTICOLO, 0, -1);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_UNITAPROPONE, "2CD1A82F-86E4-4E69-B4DB-86AB13ADE1B2");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_UNITAPROPONE, "Proposta");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_UNITAPROPONE, "");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_NUMEROPROPOS, "41CC7D59-1E24-42AF-9FFF-47698D28751D");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_NUMEROPROPOS, " ");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_NUMEROPROPOS, "");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_NUMEROPROPOS, MyGlb.VIS_NOFINOBOVEHE);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ANNOPROPOSTA, "1321A693-8149-45CA-A639-774C63AEE656");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ANNOPROPOSTA, " ");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ANNOPROPOSTA, "");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ANNOPROPOSTA, MyGlb.VIS_NOFINOBOVEHE);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DDATAREG, "AA9A4DF5-536C-4225-B04A-98F7F58B69DF");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DDATAREG, "Data");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DDATAREG, "");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DESCRIZIONE, "D3374F93-90F0-42BD-9B4D-5D63D0464389");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DESCRIZIONE, "Descrizione");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DESCRIZIONE, "");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTO, "BF8B1478-2ACC-4763-8A6C-DF2A88D7ABA9");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTO, "Competenza");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTO, "");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTOCASSA, "7043352C-2784-4BBC-93C2-EBB0CBAF746A");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTOCASSA, "Cassa");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTOCASSA, "");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTOCASSA, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTOCASSA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_TIPOVAR, "0BE76BE9-1ADE-4CA4-846E-492DC4DFF915");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_TIPOVAR, "Tipo Variazione");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_TIPOVAR, "");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_TIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_TIPOVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP, -1);
    PAN_VARIAZCAPITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_MOTIVAZIONE, "9CAF553D-EEB7-4D21-82DA-C958BA27CE77");
    PAN_VARIAZCAPITO.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_MOTIVAZIONE, "Motivazione");
    PAN_VARIAZCAPITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_MOTIVAZIONE, "");
    PAN_VARIAZCAPITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_MOTIVAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZCAPITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_MOTIVAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAZCAPITO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_PROGRESSIVO, MyGlb.PANEL_LIST, "PROG.");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_PROGRESSIVO, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_VARIAZCAPITO.SetFieldPage(PFL_VARIAZCAPITO_PROGRESSIVO, -1, -1);
    PAN_VARIAZCAPITO.SetFieldPanel(PFL_VARIAZCAPITO_PROGRESSIVO, PPQRY_VARCOMPRO, "A.PROGRESSIVO", "VARCOMPROGRE", 3, 10, 0, -13997);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ESERCIZIO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ESERCIZIO, MyGlb.PANEL_FORM, 132, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_VARIAZCAPITO.SetFieldPage(PFL_VARIAZCAPITO_ESERCIZIO, -1, -1);
    PAN_VARIAZCAPITO.SetFieldPanel(PFL_VARIAZCAPITO_ESERCIZIO, PPQRY_VARCOMPRO, "A.ESERCIZIO", "VARCOMESERCI", 1, 4, 0, -13997);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ES, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ES, MyGlb.PANEL_LIST, 24);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ES, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ES, MyGlb.PANEL_LIST, "E S");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ES, MyGlb.PANEL_FORM, 268, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ES, MyGlb.PANEL_FORM, 40);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ES, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ES, MyGlb.PANEL_FORM, "E S");
    PAN_VARIAZCAPITO.SetFieldPage(PFL_VARIAZCAPITO_ES, -1, -1);
    PAN_VARIAZCAPITO.SetFieldPanel(PFL_VARIAZCAPITO_ES, PPQRY_VARCOMPRO, "A.E_S", "VARCOMPROES", 5, 1, 0, -13997);
    PAN_VARIAZCAPITO.SetValueListItem(PFL_VARIAZCAPITO_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_VARIAZCAPITO.SetValueListItem(PFL_VARIAZCAPITO_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_CAPITOLO, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_VARIAZCAPITO.SetFieldPage(PFL_VARIAZCAPITO_CAPITOLO, -1, -1);
    PAN_VARIAZCAPITO.SetFieldPanel(PFL_VARIAZCAPITO_CAPITOLO, PPQRY_VARCOMPRO, "A.CAPITOLO", "VARCOMCAPITO", 3, 16, 0, -13997);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ARTICOLO, MyGlb.PANEL_LIST, "ART.");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ARTICOLO, MyGlb.PANEL_FORM, 140, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ARTICOLO, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_VARIAZCAPITO.SetFieldPage(PFL_VARIAZCAPITO_ARTICOLO, -1, -1);
    PAN_VARIAZCAPITO.SetFieldPanel(PFL_VARIAZCAPITO_ARTICOLO, PPQRY_VARCOMPRO, "A.ARTICOLO", "VARCOMARTICO", 1, 2, 0, -13997);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_UNITAPROPONE, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_UNITAPROPONE, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_UNITAPROPONE, MyGlb.PANEL_LIST, "Proposta");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_UNITAPROPONE, MyGlb.PANEL_FORM, 308, 124, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_UNITAPROPONE, MyGlb.PANEL_FORM, 136);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_UNITAPROPONE, MyGlb.PANEL_FORM, "Proposta");
    PAN_VARIAZCAPITO.SetFieldPage(PFL_VARIAZCAPITO_UNITAPROPONE, -1, -1);
    PAN_VARIAZCAPITO.SetFieldPanel(PFL_VARIAZCAPITO_UNITAPROPONE, PPQRY_VARCOMPRO, "A.UNITA_PROPONENTE", "VARCUNITPROP", 5, 255, 0, -13997);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_NUMEROPROPOS, MyGlb.PANEL_LIST, 108, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_NUMEROPROPOS, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_NUMEROPROPOS, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 148, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_NUMEROPROPOS, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_NUMEROPROPOS, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZCAPITO.SetFieldPage(PFL_VARIAZCAPITO_NUMEROPROPOS, -1, -1);
    PAN_VARIAZCAPITO.SetFieldPanel(PFL_VARIAZCAPITO_NUMEROPROPOS, PPQRY_VARCOMPRO, "A.NUMERO_PROPOSTA", "VARCNUMEPROP", 1, 4, 0, -13997);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ANNOPROPOSTA, MyGlb.PANEL_LIST, 152, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ANNOPROPOSTA, MyGlb.PANEL_LIST, 104);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ANNOPROPOSTA, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ANNOPROPOSTA, MyGlb.PANEL_FORM, 132, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ANNOPROPOSTA, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_ANNOPROPOSTA, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZCAPITO.SetFieldPage(PFL_VARIAZCAPITO_ANNOPROPOSTA, -1, -1);
    PAN_VARIAZCAPITO.SetFieldPanel(PFL_VARIAZCAPITO_ANNOPROPOSTA, PPQRY_VARCOMPRO, "A.ANNO_PROPOSTA", "VARCANNOPROP", 1, 4, 0, -13997);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DDATAREG, MyGlb.PANEL_LIST, 184, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DDATAREG, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DDATAREG, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DDATAREG, MyGlb.PANEL_FORM, 4, 172, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DDATAREG, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DDATAREG, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZCAPITO.SetFieldPage(PFL_VARIAZCAPITO_DDATAREG, -1, -1);
    PAN_VARIAZCAPITO.SetFieldPanel(PFL_VARIAZCAPITO_DDATAREG, PPQRY_VARCOMPRO, "A.D_DATA_REG", "VARCDDATAREG", 6, 10, 0, -13997);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DESCRIZIONE, MyGlb.PANEL_LIST, 260, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 464, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DESCRIZIONE, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VARIAZCAPITO.SetFieldPage(PFL_VARIAZCAPITO_DESCRIZIONE, -1, -1);
    PAN_VARIAZCAPITO.SetFieldPanel(PFL_VARIAZCAPITO_DESCRIZIONE, PPQRY_VARCOMPRO, "A.DESCRIZIONE", "VARCOMDESCRI", 5, 140, 0, -13997);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTO, MyGlb.PANEL_LIST, 460, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTO, MyGlb.PANEL_LIST, "Competenza");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTO, MyGlb.PANEL_FORM, 4, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTO, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTO, MyGlb.PANEL_FORM, "Compet.");
    PAN_VARIAZCAPITO.SetFieldPage(PFL_VARIAZCAPITO_IMPORTO, -1, GRP_VARIAZCAPITO_IMPORTO);
    PAN_VARIAZCAPITO.SetFieldPanel(PFL_VARIAZCAPITO_IMPORTO, PPQRY_VARCOMPRO, "A.IMPORTO", "VARCOMIMPORT", 3, 14, 2, -13997);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTOCASSA, MyGlb.PANEL_LIST, 568, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTOCASSA, MyGlb.PANEL_LIST, 32);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTOCASSA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTOCASSA, MyGlb.PANEL_LIST, "Cassa");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTOCASSA, MyGlb.PANEL_FORM, 388, 4, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTOCASSA, MyGlb.PANEL_FORM, 20);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTOCASSA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_IMPORTOCASSA, MyGlb.PANEL_FORM, "Cassa");
    PAN_VARIAZCAPITO.SetFieldPage(PFL_VARIAZCAPITO_IMPORTOCASSA, -1, GRP_VARIAZCAPITO_IMPORTO);
    PAN_VARIAZCAPITO.SetFieldPanel(PFL_VARIAZCAPITO_IMPORTOCASSA, PPQRY_VARCOMPRO, "A.IMPORTO_CASSA", "VARCIMPOCASS", 3, 14, 2, -13997);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_TIPOVAR, MyGlb.PANEL_LIST, 676, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_TIPOVAR, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_TIPOVAR, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_TIPOVAR, MyGlb.PANEL_FORM, 4, 124, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_TIPOVAR, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_TIPOVAR, MyGlb.PANEL_FORM, "Tp. Variaz.");
    PAN_VARIAZCAPITO.SetFieldPage(PFL_VARIAZCAPITO_TIPOVAR, -1, -1);
    PAN_VARIAZCAPITO.SetFieldPanel(PFL_VARIAZCAPITO_TIPOVAR, PPQRY_VARCOMPRO, "A.TIPO_VAR", "VARCOTIPOVAR", 1, 2, 0, -13997);
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_MOTIVAZIONE, MyGlb.PANEL_LIST, 812, 36, 156, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_MOTIVAZIONE, MyGlb.PANEL_LIST, 104);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_MOTIVAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_MOTIVAZIONE, MyGlb.PANEL_LIST, "Motivazione");
    PAN_VARIAZCAPITO.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_MOTIVAZIONE, MyGlb.PANEL_FORM, 4, 196, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZCAPITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_MOTIVAZIONE, MyGlb.PANEL_FORM, 104);
    PAN_VARIAZCAPITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_MOTIVAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZCAPITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZCAPITO_MOTIVAZIONE, MyGlb.PANEL_FORM, "Motivazione");
    PAN_VARIAZCAPITO.SetFieldPage(PFL_VARIAZCAPITO_MOTIVAZIONE, -1, -1);
    PAN_VARIAZCAPITO.SetFieldPanel(PFL_VARIAZCAPITO_MOTIVAZIONE, PPQRY_TIPIMOTIVAZI, "A.CODICE || ' - ' || A.DESCRIZIONE", "TIPIMOTIVAZI", 5, 106, 0, -13997);
  }

  private void PAN_VARIAZCAPITO_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZCAPITO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIMOTIVAZI ");
    SQL.append("from ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL A, ");
    SQL.append("  T54 B ");
    SQL.append("where (A.CODICE = B.TIPOLOGIA) ");
    SQL.append("and   (B.CODICE = ~~VARCOTIPOVAR~~) ");
    PAN_VARIAZCAPITO.SetQuery(PPQRY_TIPIMOTIVAZI, 0, SQL, -1, "");
    PAN_VARIAZCAPITO.SetQueryDB(PPQRY_TIPIMOTIVAZI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZCAPITO.SetMasterTable(PPQRY_TIPIMOTIVAZI, "TIPI_MOTIVAZIONE_VBIL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~VARCOTIPOVAR~~) ");
    PAN_VARIAZCAPITO.SetQuery(PPQRY_T54, 0, SQL, PFL_VARIAZCAPITO_TIPOVAR, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    PAN_VARIAZCAPITO.SetQuery(PPQRY_T54, 1, SQL, PFL_VARIAZCAPITO_TIPOVAR, "");
    PAN_VARIAZCAPITO.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZCAPITO.SetIMDB(IMDB, "PQRY_VARCOMPRO", true);
    PAN_VARIAZCAPITO.set_SetString(MyGlb.MASTER_ROWNAME, "VARCOMPRO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as VARCOMPROGRE, ");
    SQL.append("  A.ESERCIZIO as VARCOMESERCI, ");
    SQL.append("  A.E_S as VARCOMPROES, ");
    SQL.append("  A.CAPITOLO as VARCOMCAPITO, ");
    SQL.append("  A.ARTICOLO as VARCOMARTICO, ");
    SQL.append("  A.IMPORTO as VARCOMIMPORT, ");
    SQL.append("  A.DESCRIZIONE as VARCOMDESCRI, ");
    SQL.append("  A.TIPO_VAR as VARCOTIPOVAR, ");
    SQL.append("  A.ANNO_PROPOSTA as VARCANNOPROP, ");
    SQL.append("  A.UNITA_PROPONENTE as VARCUNITPROP, ");
    SQL.append("  A.NUMERO_PROPOSTA as VARCNUMEPROP, ");
    SQL.append("  A.D_DATA_REG as VARCDDATAREG, ");
    SQL.append("  A.IMPORTO_CASSA as VARCIMPOCASS ");
    PAN_VARIAZCAPITO.SetQuery(PPQRY_VARCOMPRO, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARCOMPRO A ");
    PAN_VARIAZCAPITO.SetQuery(PPQRY_VARCOMPRO, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ARTICOLO = ~~TBL_PARAM124.PARAMARTICOL~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAM124.PARAMCAPITOL~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAM124.PARAMPARTE~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAM124.PARAMESERCIZ~~) ");
    PAN_VARIAZCAPITO.SetQuery(PPQRY_VARCOMPRO, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZCAPITO.SetQuery(PPQRY_VARCOMPRO, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZCAPITO.SetQuery(PPQRY_VARCOMPRO, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA, ");
    SQL.append("  A.ANNO_PROPOSTA, ");
    SQL.append("  A.D_DATA_REG ");
    PAN_VARIAZCAPITO.SetQuery(PPQRY_VARCOMPRO, 5, SQL, -1, "");
    PAN_VARIAZCAPITO.SetQueryDB(PPQRY_VARCOMPRO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZCAPITO.SetMasterTable(0, "VARCOMPRO");
    PAN_VARIAZCAPITO.AddToSortList(PFL_VARIAZCAPITO_UNITAPROPONE, true);
    PAN_VARIAZCAPITO.AddToSortList(PFL_VARIAZCAPITO_NUMEROPROPOS, true);
    PAN_VARIAZCAPITO.AddToSortList(PFL_VARIAZCAPITO_ANNOPROPOSTA, true);
    PAN_VARIAZCAPITO.AddToSortList(PFL_VARIAZCAPITO_DDATAREG, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZCAPITO.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZCAPITO.iUseListQBE;
      PAN_VARIAZCAPITO.iUseListQBE = 0;
      PAN_VARIAZCAPITO.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZCAPITO.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZCAPITO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAZCAPITO) PAN_VARIAZCAPITO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZCAPITO) PAN_VARIAZCAPITO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZCAPITO) PAN_VARIAZCAPITO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZCAPITO) PAN_VARIAZCAPITO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIAZCAPITO) PAN_VARIAZCAPITO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
