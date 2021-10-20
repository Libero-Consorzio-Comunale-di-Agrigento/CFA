// **********************************************
// Schede Obiettivi Gestionali
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SchedeObiettiviGestionali extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCHEDEOBIETT_CODICE = 0;
  private static int PFL_SCHEDEOBIETT_DESCRIZIONE = 1;
  private static int PFL_SCHEDEOBIETT_CODICEOBIETT = 2;
  private static int PFL_SCHEDEOBIETT_DESCOBIEOPER = 3;
  private static int PFL_SCHEDEOBIETT_DATAFINEVALI = 4;
  private static int PFL_SCHEDEOBIETT_PROGRESSIVO = 5;
  private static int PFL_SCHEDEOBIETT_ESERCIZIO = 6;

  private static int PPQRY_SCHEDEOBIETT = 0;


  IDPanel PAN_SCHEDEOBIETT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM101(IMDB);
    //
    //
    Init_PQRY_SCHEDEOBIETT(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM101(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAM101, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAM101, "TBL_PARAM101");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM101,IMDBDef1.FLD_PARAM101_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM101,IMDBDef1.FLD_PARAM101_NOMEOGGEESER,1,4,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAM101, 0);
  }

  private static void Init_PQRY_SCHEDEOBIETT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_SCHEDEOBIETT, 7);
    IMDB.set_TblCode(IMDBDef7.PQRY_SCHEDEOBIETT, "PQRY_SCHEDEOBIETT");
    IMDB.set_FldCode(IMDBDef7.PQRY_SCHEDEOBIETT,IMDBDef7.PQSL_SCHEDEOBIETT_SCHOBICODOBI, "SCHOBICODOBI");
    IMDB.SetFldParams(IMDBDef7.PQRY_SCHEDEOBIETT,IMDBDef7.PQSL_SCHEDEOBIETT_SCHOBICODOBI,5,9,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SCHEDEOBIETT,IMDBDef7.PQSL_SCHEDEOBIETT_SCHEOBIECODI, "SCHEOBIECODI");
    IMDB.SetFldParams(IMDBDef7.PQRY_SCHEDEOBIETT,IMDBDef7.PQSL_SCHEDEOBIETT_SCHEOBIECODI,5,10,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SCHEDEOBIETT,IMDBDef7.PQSL_SCHEDEOBIETT_SCHEOBIEDESC, "SCHEOBIEDESC");
    IMDB.SetFldParams(IMDBDef7.PQRY_SCHEDEOBIETT,IMDBDef7.PQSL_SCHEDEOBIETT_SCHEOBIEDESC,5,2000,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SCHEDEOBIETT,IMDBDef7.PQSL_SCHEDEOBIETT_SCHOBIDAFIVA, "SCHOBIDAFIVA");
    IMDB.SetFldParams(IMDBDef7.PQRY_SCHEDEOBIETT,IMDBDef7.PQSL_SCHEDEOBIETT_SCHOBIDAFIVA,6,19,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SCHEDEOBIETT,IMDBDef7.PQSL_SCHEDEOBIETT_SCHOBIDEOBOP, "SCHOBIDEOBOP");
    IMDB.SetFldParams(IMDBDef7.PQRY_SCHEDEOBIETT,IMDBDef7.PQSL_SCHEDEOBIETT_SCHOBIDEOBOP,5,140,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SCHEDEOBIETT,IMDBDef7.PQSL_SCHEDEOBIETT_SCHEOBIEPROG, "SCHEOBIEPROG");
    IMDB.SetFldParams(IMDBDef7.PQRY_SCHEDEOBIETT,IMDBDef7.PQSL_SCHEDEOBIETT_SCHEOBIEPROG,1,8,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_SCHEDEOBIETT,IMDBDef7.PQSL_SCHEDEOBIETT_SCHEOBIEESER, "SCHEOBIEESER");
    IMDB.SetFldParams(IMDBDef7.PQRY_SCHEDEOBIETT,IMDBDef7.PQSL_SCHEDEOBIETT_SCHEOBIEESER,1,4,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_SCHEDEOBIETT, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SchedeObiettiviGestionali(MyWebEntryPoint w, IMDBObj imdb)
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
  public SchedeObiettiviGestionali()
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
    FormIdx = MyGlb.FRM_SCHEOBIEGEST;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2B26C611-D2AA-4590-8852-AD36C62F60B0";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 764;
    DesignHeight = 358;
    set_Caption(new IDVariant("Schede Obiettivi Gestionali"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 764;
    Frames[1].Height = 332;
    Frames[1].Caption = "Schede Obiettivi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 332;
    PAN_SCHEDEOBIETT = new IDPanel(w, this, 1, "PAN_SCHEDEOBIETT");
    Frames[1].Content = PAN_SCHEDEOBIETT;
    PAN_SCHEDEOBIETT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCHEDEOBIETT.VS = MainFrm.VisualStyleList;
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 764-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCHEDEOBIETT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D44AC6E5-0F22-42FE-9D30-7975D2AA5F3D");
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 624, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SCHEDEOBIETT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCHEDEOBIETT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCHEDEOBIETT.InitStatus = 1;
    PAN_SCHEDEOBIETT_Init();
    PAN_SCHEDEOBIETT_InitFields();
    PAN_SCHEDEOBIETT_InitQueries();
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
      PAN_SCHEDEOBIETT.UpdatePanel(MainFrm);
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
    return (obj instanceof SchedeObiettiviGestionali);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SchedeObiettiviGestionali.class.getName() : (Glb.ClassWithPackage(SchedeObiettiviGestionali.class) ? SchedeObiettiviGestionali.class.getName().substring(SchedeObiettiviGestionali.class.getPackage().getName().length() + 1) : SchedeObiettiviGestionali.class.getName()));
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
  private void PAN_SCHEDEOBIETT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCHEDEOBIETT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCHEDEOBIETT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCHEDEOBIETT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCHEDEOBIETT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SCHEDEOBIETT);
    // Stub
  }

  private void PAN_SCHEDEOBIETT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCHEDEOBIETT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCHEDEOBIETT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCHEDEOBIETT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCHEDEOBIETT_Init()
  {

    PAN_SCHEDEOBIETT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCHEDEOBIETT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCHEDEOBIETT.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_SCHEDEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICE, "C6B7314C-B0E1-427F-BCCB-D0F5B2AED932");
    PAN_SCHEDEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICE, "Codice");
    PAN_SCHEDEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICE, "");
    PAN_SCHEDEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCRIZIONE, "6681A363-6343-4E42-A4EA-8F883DDBAA38");
    PAN_SCHEDEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCRIZIONE, "Descrizione");
    PAN_SCHEDEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCRIZIONE, "");
    PAN_SCHEDEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICEOBIETT, "2301E76D-A7A9-4E70-BB0D-C78F82BB9BE1");
    PAN_SCHEDEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICEOBIETT, "Obiettivo Operativo");
    PAN_SCHEDEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICEOBIETT, "");
    PAN_SCHEDEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICEOBIETT, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICEOBIETT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_SCHEDEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCOBIEOPER, "3A22DF07-4BE3-4176-AB2B-A2338C46D196");
    PAN_SCHEDEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCOBIEOPER, "Descrizione ");
    PAN_SCHEDEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCOBIEOPER, "");
    PAN_SCHEDEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCOBIEOPER, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCOBIEOPER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DATAFINEVALI, "9207857D-6A91-4A19-BE86-FAEA910E83F2");
    PAN_SCHEDEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DATAFINEVALI, "Data Fine Validità");
    PAN_SCHEDEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DATAFINEVALI, "");
    PAN_SCHEDEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DATAFINEVALI, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHEDEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DATAFINEVALI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_PROGRESSIVO, "F2801532-BA13-429E-8C9C-939A6EC1B3AE");
    PAN_SCHEDEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_PROGRESSIVO, "PROGRESSIVO");
    PAN_SCHEDEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_PROGRESSIVO, "");
    PAN_SCHEDEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_PROGRESSIVO, MyGlb.VIS_NONNULLAFIEL);
    PAN_SCHEDEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_PROGRESSIVO, 0, -1);
    PAN_SCHEDEOBIETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_ESERCIZIO, "3436DF80-BD26-4A75-B21C-644FC90A283A");
    PAN_SCHEDEOBIETT.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_ESERCIZIO, "ESERCIZIO");
    PAN_SCHEDEOBIETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_ESERCIZIO, "");
    PAN_SCHEDEOBIETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_SCHEDEOBIETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_ESERCIZIO, 0, -1);
  }

  private void PAN_SCHEDEOBIETT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICE, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_SCHEDEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICE, MyGlb.PANEL_FORM, 4, 28, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_SCHEDEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_SCHEDEOBIETT.SetFieldPage(PFL_SCHEDEOBIETT_CODICE, -1, -1);
    PAN_SCHEDEOBIETT.SetFieldPanel(PFL_SCHEDEOBIETT_CODICE, PPQRY_SCHEDEOBIETT, "A.CODICE", "SCHEOBIECODI", 5, 10, 0, -13997);
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCRIZIONE, MyGlb.PANEL_LIST, 92, 36, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCRIZIONE, MyGlb.PANEL_LIST, 128);
    PAN_SCHEDEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 564, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_SCHEDEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SCHEDEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCHEDEOBIETT.SetFieldPage(PFL_SCHEDEOBIETT_DESCRIZIONE, -1, -1);
    PAN_SCHEDEOBIETT.SetFieldPanel(PFL_SCHEDEOBIETT_DESCRIZIONE, PPQRY_SCHEDEOBIETT, "A.DESCRIZIONE_ESTESA", "SCHEOBIEDESC", 5, 2000, 0, -13997);
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICEOBIETT, MyGlb.PANEL_LIST, 284, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICEOBIETT, MyGlb.PANEL_LIST, 68);
    PAN_SCHEDEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICEOBIETT, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICEOBIETT, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICEOBIETT, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICEOBIETT, MyGlb.PANEL_FORM, 80);
    PAN_SCHEDEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICEOBIETT, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_CODICEOBIETT, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_SCHEDEOBIETT.SetFieldPage(PFL_SCHEDEOBIETT_CODICEOBIETT, -1, -1);
    PAN_SCHEDEOBIETT.SetFieldPanel(PFL_SCHEDEOBIETT_CODICEOBIETT, PPQRY_SCHEDEOBIETT, "A.PROGETTO", "SCHOBICODOBI", 5, 9, 0, -13997);
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCOBIEOPER, MyGlb.PANEL_LIST, 360, 36, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCOBIEOPER, MyGlb.PANEL_LIST, 84);
    PAN_SCHEDEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCOBIEOPER, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCOBIEOPER, MyGlb.PANEL_LIST, "Descrizione ");
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCOBIEOPER, MyGlb.PANEL_FORM, 4, 124, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCOBIEOPER, MyGlb.PANEL_FORM, 84);
    PAN_SCHEDEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCOBIEOPER, MyGlb.PANEL_FORM, 2);
    PAN_SCHEDEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DESCOBIEOPER, MyGlb.PANEL_FORM, "Descrizione ");
    PAN_SCHEDEOBIETT.SetFieldPage(PFL_SCHEDEOBIETT_DESCOBIEOPER, -1, -1);
    PAN_SCHEDEOBIETT.SetFieldPanel(PFL_SCHEDEOBIETT_DESCOBIEOPER, PPQRY_SCHEDEOBIETT, "B.DESCRIZIONE", "SCHOBIDEOBOP", 5, 140, 0, -13997);
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DATAFINEVALI, MyGlb.PANEL_LIST, 552, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DATAFINEVALI, MyGlb.PANEL_LIST, 124);
    PAN_SCHEDEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DATAFINEVALI, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DATAFINEVALI, MyGlb.PANEL_LIST, "Data Fine Validità");
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DATAFINEVALI, MyGlb.PANEL_FORM, 4, 100, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DATAFINEVALI, MyGlb.PANEL_FORM, 124);
    PAN_SCHEDEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DATAFINEVALI, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_DATAFINEVALI, MyGlb.PANEL_FORM, "Data Fine Validità");
    PAN_SCHEDEOBIETT.SetFieldPage(PFL_SCHEDEOBIETT_DATAFINEVALI, -1, -1);
    PAN_SCHEDEOBIETT.SetFieldPanel(PFL_SCHEDEOBIETT_DATAFINEVALI, PPQRY_SCHEDEOBIETT, "A.DATA_FINE_VALIDITA", "SCHOBIDAFIVA", 6, 19, 0, -13997);
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_PROGRESSIVO, MyGlb.PANEL_LIST, 624, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_SCHEDEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 100, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_SCHEDEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_SCHEDEOBIETT.SetFieldPage(PFL_SCHEDEOBIETT_PROGRESSIVO, -1, -1);
    PAN_SCHEDEOBIETT.SetFieldPanel(PFL_SCHEDEOBIETT_PROGRESSIVO, PPQRY_SCHEDEOBIETT, "A.PROGRESSIVO", "SCHEOBIEPROG", 1, 8, 0, -13997);
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_ESERCIZIO, MyGlb.PANEL_LIST, 624, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_SCHEDEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_SCHEDEOBIETT.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_ESERCIZIO, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDEOBIETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_SCHEDEOBIETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDEOBIETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDEOBIETT_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_SCHEDEOBIETT.SetFieldPage(PFL_SCHEDEOBIETT_ESERCIZIO, -1, -1);
    PAN_SCHEDEOBIETT.SetFieldPanel(PFL_SCHEDEOBIETT_ESERCIZIO, PPQRY_SCHEDEOBIETT, "A.ESERCIZIO", "SCHEOBIEESER", 1, 4, 0, -13997);
  }

  private void PAN_SCHEDEOBIETT_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCHEDEOBIETT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SCHEDEOBIETT.SetIMDB(IMDB, "PQRY_SCHEDEOBIETT", true);
    PAN_SCHEDEOBIETT.set_SetString(MyGlb.MASTER_ROWNAME, "SCHEDE OBIETTIVI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGETTO as SCHOBICODOBI, ");
    SQL.append("  A.CODICE as SCHEOBIECODI, ");
    SQL.append("  A.DESCRIZIONE_ESTESA as SCHEOBIEDESC, ");
    SQL.append("  A.DATA_FINE_VALIDITA as SCHOBIDAFIVA, ");
    SQL.append("  B.DESCRIZIONE as SCHOBIDEOBOP, ");
    SQL.append("  A.PROGRESSIVO as SCHEOBIEPROG, ");
    SQL.append("  A.ESERCIZIO as SCHEOBIEESER ");
    PAN_SCHEDEOBIETT.SetQuery(PPQRY_SCHEDEOBIETT, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  SCHEDE_OBIETTIVI A, ");
    SQL.append("  PROGETTI_CG4 B ");
    PAN_SCHEDEOBIETT.SetQuery(PPQRY_SCHEDEOBIETT, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGETTO = B.PROGETTO(+)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAM101.NOMEOGGEESER~~) ");
    SQL.append("and   ((A.DATA_FINE_VALIDITA IS NULL) OR A.DATA_FINE_VALIDITA >= TRUNC( SYSDATE )) ");
    SQL.append("and   (A.PROGR_STORICO = 0) ");
    PAN_SCHEDEOBIETT.SetQuery(PPQRY_SCHEDEOBIETT, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEDEOBIETT.SetQuery(PPQRY_SCHEDEOBIETT, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEDEOBIETT.SetQuery(PPQRY_SCHEDEOBIETT, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEDEOBIETT.SetQuery(PPQRY_SCHEDEOBIETT, 5, SQL, -1, "");
    PAN_SCHEDEOBIETT.SetQueryDB(PPQRY_SCHEDEOBIETT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHEDEOBIETT.SetMasterTable(0, "SCHEDE_OBIETTIVI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCHEDEOBIETT.Status() == 2)
    {
      int oldListQBE = PAN_SCHEDEOBIETT.iUseListQBE;
      PAN_SCHEDEOBIETT.iUseListQBE = 0;
      PAN_SCHEDEOBIETT.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCHEDEOBIETT.PanelCommand(Glb.PCM_FIND);
      PAN_SCHEDEOBIETT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCHEDEOBIETT) PAN_SCHEDEOBIETT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHEDEOBIETT) PAN_SCHEDEOBIETT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCHEDEOBIETT) PAN_SCHEDEOBIETT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHEDEOBIETT) PAN_SCHEDEOBIETT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCHEDEOBIETT) PAN_SCHEDEOBIETT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
