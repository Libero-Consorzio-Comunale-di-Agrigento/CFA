// **********************************************
// Elenco Codici Mancanti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoCodiciMancanti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ELENCODIMANC_PROGRESSIVO = 0;
  private static int PFL_ELENCODIMANC_TIPOCERTIFIC = 1;
  private static int PFL_ELENCODIMANC_ESERCIZIO = 2;
  private static int PFL_ELENCODIMANC_QUADRO = 3;
  private static int PFL_ELENCODIMANC_CODICE = 4;
  private static int PFL_ELENCODIMANC_DESCRIZIONE1 = 5;
  private static int PFL_ELENCODIMANC_DESCRIZIONE2 = 6;
  private static int PFL_ELENCODIMANC_TIPORIGA = 7;
  private static int PFL_ELENCODIMANC_NUMCOLONNE = 8;
  private static int PFL_ELENCODIMANC_CODTOTALE = 9;
  private static int PFL_ELENCODIMANC_SEGNO = 10;

  private static int PPQRY_STRUTTCERTIF = 0;


  IDPanel PAN_ELENCODIMANC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI592(IMDB);
    //
    //
    Init_PQRY_STRUTTCERTIF(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI592(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI592, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI592, "TBL_PARAMETRI592");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI592,IMDBDef4.FLD_PARAMETRI592_PARATIPOCERT, "PARATIPOCERT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI592,IMDBDef4.FLD_PARAMETRI592_PARATIPOCERT,5,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI592, 0);
  }

  private static void Init_PQRY_STRUTTCERTIF(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_STRUTTCERTIF, 11);
    IMDB.set_TblCode(IMDBDef13.PQRY_STRUTTCERTIF, "PQRY_STRUTTCERTIF");
    IMDB.set_FldCode(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUCERTPROG, "STRUCERTPROG");
    IMDB.SetFldParams(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUCERTPROG,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUTIPOCERT, "STRUTIPOCERT");
    IMDB.SetFldParams(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUTIPOCERT,5,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUCERTESER, "STRUCERTESER");
    IMDB.SetFldParams(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUCERTESER,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUCERTQUAD, "STRUCERTQUAD");
    IMDB.SetFldParams(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUCERTQUAD,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUCERTCODI, "STRUCERTCODI");
    IMDB.SetFldParams(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUCERTCODI,1,9,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRCERTIPRIG, "STRCERTIPRIG");
    IMDB.SetFldParams(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRCERTIPRIG,5,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUCERTDES1, "STRUCERTDES1");
    IMDB.SetFldParams(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUCERTDES1,5,200,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUCERTDES2, "STRUCERTDES2");
    IMDB.SetFldParams(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUCERTDES2,5,200,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRCERNUMCOL, "STRCERNUMCOL");
    IMDB.SetFldParams(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRCERNUMCOL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRCERCODTOT, "STRCERCODTOT");
    IMDB.SetFldParams(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRCERCODTOT,5,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUCERTSEGN, "STRUCERTSEGN");
    IMDB.SetFldParams(IMDBDef13.PQRY_STRUTTCERTIF,IMDBDef13.PQSL_STRUTTCERTIF_STRUCERTSEGN,1,1,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_STRUTTCERTIF, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoCodiciMancanti(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoCodiciMancanti()
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
    FormIdx = MyGlb.FRM_ELENCODIMANC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5F7AAAF2-00CD-4D55-8D2C-FF234CE11474";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 896;
    DesignHeight = 26;
    set_Caption(new IDVariant("Elenco Codici Mancanti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 896;
    Frames[1].Height = 380;
    Frames[1].Caption = "Elenco Codici Mancanti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 380;
    PAN_ELENCODIMANC = new IDPanel(w, this, 1, "PAN_ELENCODIMANC");
    Frames[1].Content = PAN_ELENCODIMANC;
    PAN_ELENCODIMANC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCODIMANC.VS = MainFrm.VisualStyleList;
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 896-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENCODIMANC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "297A437C-562A-4173-914E-9ED3CA7AEB90");
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 840, 296, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ELENCODIMANC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCODIMANC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCODIMANC.InitStatus = 2;
    PAN_ELENCODIMANC_Init();
    PAN_ELENCODIMANC_InitFields();
    PAN_ELENCODIMANC_InitQueries();
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
      PAN_ELENCODIMANC.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoCodiciMancanti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoCodiciMancanti.class.getName() : (Glb.ClassWithPackage(ElencoCodiciMancanti.class) ? ElencoCodiciMancanti.class.getName().substring(ElencoCodiciMancanti.class.getPackage().getName().length() + 1) : ElencoCodiciMancanti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  
  
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
  private void PAN_ELENCODIMANC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCODIMANC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCODIMANC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCODIMANC, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCODIMANC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ELENCODIMANC);
    // Stub
  }

  private void PAN_ELENCODIMANC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ELENCODIMANC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCODIMANC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCODIMANC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCODIMANC_Init()
  {

    PAN_ELENCODIMANC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCODIMANC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELENCODIMANC.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_ELENCODIMANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_PROGRESSIVO, "10F6B937-11EE-4EE6-8BB3-962D6D79CEA3");
    PAN_ELENCODIMANC.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_PROGRESSIVO, "PROGRESSIVO");
    PAN_ELENCODIMANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_PROGRESSIVO, "");
    PAN_ELENCODIMANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ELENCODIMANC.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ELENCODIMANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPOCERTIFIC, "9D081687-3520-4165-B983-1608708D0863");
    PAN_ELENCODIMANC.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPOCERTIFIC, "TIPO CERTIFICATO");
    PAN_ELENCODIMANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPOCERTIFIC, "");
    PAN_ELENCODIMANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPOCERTIFIC, MyGlb.VIS_NONNULLAFIEL);
    PAN_ELENCODIMANC.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPOCERTIFIC, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM, -1);
    PAN_ELENCODIMANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_ESERCIZIO, "1AD9736C-DCD5-4815-B72E-0F2F05F577ED");
    PAN_ELENCODIMANC.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_ESERCIZIO, "ESERCIZIO");
    PAN_ELENCODIMANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_ESERCIZIO, "");
    PAN_ELENCODIMANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_ELENCODIMANC.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_ESERCIZIO, 0, -1);
    PAN_ELENCODIMANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_QUADRO, "8A32DFA5-3481-4013-90F4-87B1DDA1D5EC");
    PAN_ELENCODIMANC.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_QUADRO, "Quadro");
    PAN_ELENCODIMANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_QUADRO, "");
    PAN_ELENCODIMANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_QUADRO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCODIMANC.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_QUADRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCODIMANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODICE, "F3DD14C0-B8D6-435D-8005-E5CF38547281");
    PAN_ELENCODIMANC.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODICE, "Codice");
    PAN_ELENCODIMANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODICE, "");
    PAN_ELENCODIMANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCODIMANC.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCODIMANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE1, "9A2D4A2D-EAE4-4BBB-86D6-E0EC4CAE2ED5");
    PAN_ELENCODIMANC.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE1, "Descrizione 1");
    PAN_ELENCODIMANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE1, "");
    PAN_ELENCODIMANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCODIMANC.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCODIMANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE2, "D1DAB721-FB57-46A4-B471-4893BBA24DC9");
    PAN_ELENCODIMANC.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE2, "Descrizione 2");
    PAN_ELENCODIMANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE2, "");
    PAN_ELENCODIMANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE2, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCODIMANC.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCODIMANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPORIGA, "EE832101-4C74-48D6-A998-5ECABB992185");
    PAN_ELENCODIMANC.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPORIGA, "TIPO RIGA");
    PAN_ELENCODIMANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPORIGA, "");
    PAN_ELENCODIMANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPORIGA, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCODIMANC.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPORIGA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCODIMANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_NUMCOLONNE, "2D4E3AC4-049F-4863-A817-80911BE600D7");
    PAN_ELENCODIMANC.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_NUMCOLONNE, "NUM COLONNE");
    PAN_ELENCODIMANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_NUMCOLONNE, "");
    PAN_ELENCODIMANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_NUMCOLONNE, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCODIMANC.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_NUMCOLONNE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCODIMANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODTOTALE, "918A3E27-AFDA-4344-82D3-B221EF7CA482");
    PAN_ELENCODIMANC.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODTOTALE, "COD TOTALE");
    PAN_ELENCODIMANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODTOTALE, "");
    PAN_ELENCODIMANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODTOTALE, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCODIMANC.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODTOTALE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCODIMANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_SEGNO, "B9F8EFF2-AA36-456C-90F2-4C2AA8EE9274");
    PAN_ELENCODIMANC.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_SEGNO, "SEGNO");
    PAN_ELENCODIMANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_SEGNO, "");
    PAN_ELENCODIMANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_SEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCODIMANC.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_SEGNO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ELENCODIMANC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_PROGRESSIVO, MyGlb.PANEL_FORM, 128);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_ELENCODIMANC.SetFieldPage(PFL_ELENCODIMANC_PROGRESSIVO, -1, -1);
    PAN_ELENCODIMANC.SetFieldPanel(PFL_ELENCODIMANC_PROGRESSIVO, PPQRY_STRUTTCERTIF, "A.PROGRESSIVO", "STRUCERTPROG", 3, 10, 0, -13997);
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPOCERTIFIC, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPOCERTIFIC, MyGlb.PANEL_LIST, 112);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPOCERTIFIC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPOCERTIFIC, MyGlb.PANEL_LIST, "TIPO CERTIFICATO");
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPOCERTIFIC, MyGlb.PANEL_FORM, 136, 28, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPOCERTIFIC, MyGlb.PANEL_FORM, 128);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPOCERTIFIC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPOCERTIFIC, MyGlb.PANEL_FORM, "TIPO CERTIFICATO");
    PAN_ELENCODIMANC.SetFieldPage(PFL_ELENCODIMANC_TIPOCERTIFIC, -1, -1);
    PAN_ELENCODIMANC.SetFieldPanel(PFL_ELENCODIMANC_TIPOCERTIFIC, PPQRY_STRUTTCERTIF, "A.TIPO_CERTIFICATO", "STRUTIPOCERT", 5, 10, 0, -13997);
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_ESERCIZIO, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_ESERCIZIO, MyGlb.PANEL_FORM, 128);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_ELENCODIMANC.SetFieldPage(PFL_ELENCODIMANC_ESERCIZIO, -1, -1);
    PAN_ELENCODIMANC.SetFieldPanel(PFL_ELENCODIMANC_ESERCIZIO, PPQRY_STRUTTCERTIF, "A.ESERCIZIO", "STRUCERTESER", 1, 4, 0, -13997);
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_QUADRO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_QUADRO, MyGlb.PANEL_LIST, 56);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_QUADRO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_QUADRO, MyGlb.PANEL_LIST, "Quadro");
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_QUADRO, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_QUADRO, MyGlb.PANEL_FORM, 128);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_QUADRO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_QUADRO, MyGlb.PANEL_FORM, "Quadro");
    PAN_ELENCODIMANC.SetFieldPage(PFL_ELENCODIMANC_QUADRO, -1, -1);
    PAN_ELENCODIMANC.SetFieldPanel(PFL_ELENCODIMANC_QUADRO, PPQRY_STRUTTCERTIF, "A.QUADRO", "STRUCERTQUAD", 1, 2, 0, -13997);
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODICE, MyGlb.PANEL_LIST, 56, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODICE, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODICE, MyGlb.PANEL_FORM, 128);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_ELENCODIMANC.SetFieldPage(PFL_ELENCODIMANC_CODICE, -1, -1);
    PAN_ELENCODIMANC.SetFieldPanel(PFL_ELENCODIMANC_CODICE, PPQRY_STRUTTCERTIF, "A.CODICE", "STRUCERTCODI", 1, 9, 0, -13997);
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE1, MyGlb.PANEL_LIST, 112, 36, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE1, MyGlb.PANEL_LIST, 104);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione 1");
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 148, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE1, MyGlb.PANEL_FORM, 128);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione 1");
    PAN_ELENCODIMANC.SetFieldPage(PFL_ELENCODIMANC_DESCRIZIONE1, -1, -1);
    PAN_ELENCODIMANC.SetFieldPanel(PFL_ELENCODIMANC_DESCRIZIONE1, PPQRY_STRUTTCERTIF, "A.DESCRIZIONE_1", "STRUCERTDES1", 5, 200, 0, -13997);
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE2, MyGlb.PANEL_LIST, 476, 36, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE2, MyGlb.PANEL_LIST, 104);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE2, MyGlb.PANEL_LIST, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE2, MyGlb.PANEL_LIST, "Descrizione 2");
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE2, MyGlb.PANEL_FORM, 4, 172, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE2, MyGlb.PANEL_FORM, 128);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE2, MyGlb.PANEL_FORM, 2);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_DESCRIZIONE2, MyGlb.PANEL_FORM, "Descrizione 2");
    PAN_ELENCODIMANC.SetFieldPage(PFL_ELENCODIMANC_DESCRIZIONE2, -1, -1);
    PAN_ELENCODIMANC.SetFieldPanel(PFL_ELENCODIMANC_DESCRIZIONE2, PPQRY_STRUTTCERTIF, "A.DESCRIZIONE_2", "STRUCERTDES2", 5, 200, 0, -13997);
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPORIGA, MyGlb.PANEL_LIST, 112, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPORIGA, MyGlb.PANEL_LIST, 68);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPORIGA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPORIGA, MyGlb.PANEL_LIST, "TIPO RIGA");
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPORIGA, MyGlb.PANEL_FORM, 4, 124, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPORIGA, MyGlb.PANEL_FORM, 128);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPORIGA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_TIPORIGA, MyGlb.PANEL_FORM, "TIPO RIGA");
    PAN_ELENCODIMANC.SetFieldPage(PFL_ELENCODIMANC_TIPORIGA, -1, -1);
    PAN_ELENCODIMANC.SetFieldPanel(PFL_ELENCODIMANC_TIPORIGA, PPQRY_STRUTTCERTIF, "A.TIPO_RIGA", "STRCERTIPRIG", 5, 10, 0, -13997);
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_NUMCOLONNE, MyGlb.PANEL_LIST, 112, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_NUMCOLONNE, MyGlb.PANEL_LIST, 88);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_NUMCOLONNE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_NUMCOLONNE, MyGlb.PANEL_LIST, "NUM COL.");
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_NUMCOLONNE, MyGlb.PANEL_FORM, 4, 196, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_NUMCOLONNE, MyGlb.PANEL_FORM, 128);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_NUMCOLONNE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_NUMCOLONNE, MyGlb.PANEL_FORM, "NUM COLONNE");
    PAN_ELENCODIMANC.SetFieldPage(PFL_ELENCODIMANC_NUMCOLONNE, -1, -1);
    PAN_ELENCODIMANC.SetFieldPanel(PFL_ELENCODIMANC_NUMCOLONNE, PPQRY_STRUTTCERTIF, "A.NUM_COLONNE", "STRCERNUMCOL", 1, 4, 0, -13997);
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODTOTALE, MyGlb.PANEL_LIST, 112, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODTOTALE, MyGlb.PANEL_LIST, 76);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODTOTALE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODTOTALE, MyGlb.PANEL_LIST, "COD TOTALE");
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODTOTALE, MyGlb.PANEL_FORM, 4, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODTOTALE, MyGlb.PANEL_FORM, 128);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODTOTALE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_CODTOTALE, MyGlb.PANEL_FORM, "COD TOTALE");
    PAN_ELENCODIMANC.SetFieldPage(PFL_ELENCODIMANC_CODTOTALE, -1, -1);
    PAN_ELENCODIMANC.SetFieldPanel(PFL_ELENCODIMANC_CODTOTALE, PPQRY_STRUTTCERTIF, "A.COD_TOTALE", "STRCERCODTOT", 5, 10, 0, -13997);
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_SEGNO, MyGlb.PANEL_LIST, 112, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_SEGNO, MyGlb.PANEL_LIST, 44);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_SEGNO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_SEGNO, MyGlb.PANEL_LIST, "SEGNO");
    PAN_ELENCODIMANC.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_SEGNO, MyGlb.PANEL_FORM, 4, 244, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCODIMANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_SEGNO, MyGlb.PANEL_FORM, 128);
    PAN_ELENCODIMANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_SEGNO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCODIMANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCODIMANC_SEGNO, MyGlb.PANEL_FORM, "SEGNO");
    PAN_ELENCODIMANC.SetFieldPage(PFL_ELENCODIMANC_SEGNO, -1, -1);
    PAN_ELENCODIMANC.SetFieldPanel(PFL_ELENCODIMANC_SEGNO, PPQRY_STRUTTCERTIF, "A.SEGNO", "STRUCERTSEGN", 1, 1, 0, -13997);
  }

  private void PAN_ELENCODIMANC_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCODIMANC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELENCODIMANC.SetIMDB(IMDB, "PQRY_STRUTTCERTIF", true);
    PAN_ELENCODIMANC.set_SetString(MyGlb.MASTER_ROWNAME, "STRUTTURA CERTIFICATO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as STRUCERTPROG, ");
    SQL.append("  A.TIPO_CERTIFICATO as STRUTIPOCERT, ");
    SQL.append("  A.ESERCIZIO as STRUCERTESER, ");
    SQL.append("  A.QUADRO as STRUCERTQUAD, ");
    SQL.append("  A.CODICE as STRUCERTCODI, ");
    SQL.append("  A.TIPO_RIGA as STRCERTIPRIG, ");
    SQL.append("  A.DESCRIZIONE_1 as STRUCERTDES1, ");
    SQL.append("  A.DESCRIZIONE_2 as STRUCERTDES2, ");
    SQL.append("  A.NUM_COLONNE as STRCERNUMCOL, ");
    SQL.append("  A.COD_TOTALE as STRCERCODTOT, ");
    SQL.append("  A.SEGNO as STRUCERTSEGN ");
    PAN_ELENCODIMANC.SetQuery(PPQRY_STRUTTCERTIF, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  STRUTTURA_CERTIFICATO A ");
    PAN_ELENCODIMANC.SetQuery(PPQRY_STRUTTCERTIF, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_CERTIFICATO = ~~TBL_PARAMETRI592.PARATIPOCERT~~) ");
    SQL.append("and   (A.CODICE NOT IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  B.CODICE ");
    SQL.append("from ");
    SQL.append("  CF4CERTBIL B ");
    SQL.append("where (B.ANNO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAMETRI592.PARATIPOCERT~~ = 'PREV') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  C.CODICE ");
    SQL.append("from ");
    SQL.append("  CF4CERTCON C ");
    SQL.append("where (C.ANNO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~TBL_PARAMETRI592.PARATIPOCERT~~ = 'CONS') ");
    SQL.append(")) ");
    PAN_ELENCODIMANC.SetQuery(PPQRY_STRUTTCERTIF, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCODIMANC.SetQuery(PPQRY_STRUTTCERTIF, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCODIMANC.SetQuery(PPQRY_STRUTTCERTIF, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCODIMANC.SetQuery(PPQRY_STRUTTCERTIF, 5, SQL, -1, "");
    PAN_ELENCODIMANC.SetQueryDB(PPQRY_STRUTTCERTIF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCODIMANC.SetMasterTable(0, "STRUTTURA_CERTIFICATO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCODIMANC.Status() == 2)
    {
      int oldListQBE = PAN_ELENCODIMANC.iUseListQBE;
      PAN_ELENCODIMANC.iUseListQBE = 0;
      PAN_ELENCODIMANC.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCODIMANC.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCODIMANC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENCODIMANC) PAN_ELENCODIMANC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCODIMANC) PAN_ELENCODIMANC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCODIMANC) PAN_ELENCODIMANC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCODIMANC) PAN_ELENCODIMANC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENCODIMANC) PAN_ELENCODIMANC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
