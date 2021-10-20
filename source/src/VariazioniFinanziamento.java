// **********************************************
// Variazioni Finanziamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniFinanziamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VARIAZFINANZ_CAPITOLO = 0;
  private static int PFL_VARIAZFINANZ_ARTICOLO = 1;
  private static int PFL_VARIAZFINANZ_IMPORTO = 2;
  private static int PFL_VARIAZFINANZ_OPERA1 = 3;
  private static int PFL_VARIAZFINANZ_DESCRIZIONE = 4;
  private static int PFL_VARIAZFINANZ_DATA = 5;
  private static int PFL_VARIAZFINANZ_SEDEDEL = 6;
  private static int PFL_VARIAZFINANZ_NUMERODEL = 7;
  private static int PFL_VARIAZFINANZ_ANNODEL = 8;
  private static int PFL_VARIAZFINANZ_UNITAPROPONE = 9;
  private static int PFL_VARIAZFINANZ_NUMEROPROPOS = 10;
  private static int PFL_VARIAZFINANZ_ANNOPROPOSTA = 11;
  private static int PFL_VARIAZFINANZ_PROGETTO = 12;
  private static int PFL_VARIAZFINANZ_CODICEDESCRI = 13;
  private static int PFL_VARIAZFINANZ_LABELCAPITOL = 14;
  private static int PFL_VARIAZFINANZ_LABELOPERA = 15;
  private static int PFL_VARIAZFINANZ_LABELDELIBER = 16;
  private static int PFL_VARIAZFINANZ_LABELPROPOST = 17;
  private static int PFL_VARIAZFINANZ_RIFBILANCPEG = 18;
  private static int PFL_VARIAZFINANZ_OPERA = 19;
  private static int PFL_VARIAZFINANZ_DELIBERA = 20;
  private static int PFL_VARIAZFINANZ_PROPOSTA = 21;

  private static int PPQRY_VARCOM14 = 0;


  IDPanel PAN_VARIAZFINANZ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI39(IMDB);
    //
    //
    Init_PQRY_VARCOM14(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI39(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI39, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI39, "TBL_PARAMETRI39");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI39,IMDBDef1.FLD_PARAMETRI39_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI39,IMDBDef1.FLD_PARAMETRI39_PARAMFINANZI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI39,IMDBDef1.FLD_PARAMETRI39_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI39,IMDBDef1.FLD_PARAMETRI39_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI39,IMDBDef1.FLD_PARAMETRI39_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI39,IMDBDef1.FLD_PARAMETRI39_PARAMTIPO,5,10,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI39, 0);
  }

  private static void Init_PQRY_VARCOM14(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VARCOM14, 18);
    IMDB.set_TblCode(IMDBDef8.PQRY_VARCOM14, "PQRY_VARCOM14");
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_VARRIFBILPEG, "VARRIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_VARRIFBILPEG,5,203,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_VARCOMOPERA, "VARCOMOPERA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_VARCOMOPERA,5,304,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_VARCOMDELIBE, "VARCOMDELIBE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_VARCOMDELIBE,5,463,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_VARCOMPROPOS, "VARCOMPROPOS");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_VARCOMPROPOS,5,461,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_UNITA_PROPONENTE,5,255,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_VARCCODIDESC, "VARCCODIDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_VARCOM14,IMDBDef8.PQSL_VARCOM14_VARCCODIDESC,5,302,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VARCOM14, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniFinanziamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniFinanziamento()
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
    FormIdx = MyGlb.FRM_VARIAZFINANZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "372F9D29-9D18-4C42-947F-718E0D347293";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 390;
    set_Caption(new IDVariant("Variazioni Finanziamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 364;
    Frames[1].Caption = "Variazioni Finanziamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 364;
    PAN_VARIAZFINANZ = new IDPanel(w, this, 1, "PAN_VARIAZFINANZ");
    Frames[1].Content = PAN_VARIAZFINANZ;
    PAN_VARIAZFINANZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZFINANZ.VS = MainFrm.VisualStyleList;
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CE5A3CF5-BA97-45F9-B1E9-4DCA61BABB9A");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 884, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZFINANZ.InitStatus = 2;
    PAN_VARIAZFINANZ_Init();
    PAN_VARIAZFINANZ_InitFields();
    PAN_VARIAZFINANZ_InitQueries();
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
      PAN_VARIAZFINANZ.UpdatePanel(MainFrm);
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
    return (obj instanceof VariazioniFinanziamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniFinanziamento.class.getName() : (Glb.ClassWithPackage(VariazioniFinanziamento.class) ? VariazioniFinanziamento.class.getName().substring(VariazioniFinanziamento.class.getPackage().getName().length() + 1) : VariazioniFinanziamento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Variazioni Finanziamento On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZFINANZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZFINANZ);
      // 
      // Variazioni Finanziamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_VARIAZFINANZ.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZFINANZ_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_VARCOM14, IMDBDef8.PQSL_VARCOM14_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniFinanziamento", "VariazioniFinanziamentoOnDynamicPropertiesEvent", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      Frames[PAN_VARIAZFINANZ.FrIndex].set_Caption(IDL.Add(IDL.Add((new IDVariant(Frames[PAN_VARIAZFINANZ.FrIndex].Caption)), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant(" - ")), (new IDVariant(" "))))), IMDB.Value(IMDBDef1.TBL_PARAMETRI39, IMDBDef1.FLD_PARAMETRI39_PARAMTIPO, 0)).stringValue());
      set_Caption(IDL.Add(Caption(), IDL.Add((new IDVariant(" ")), IDL.Add((new IDVariant(" - ")), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI39, IMDBDef1.FLD_PARAMETRI39_PARAMTIPO, 0), MainFrm.ESERCIZIO))))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniFinanziamento", "LoadEvent", _e);
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
  private void PAN_VARIAZFINANZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZFINANZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAZFINANZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZFINANZ, Cancel);
    // Stub
  }

  private void PAN_VARIAZFINANZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VARIAZFINANZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZFINANZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_VARCOM14, IMDBDef8.PQSL_VARCOM14_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_VARCOM14, IMDBDef8.PQSL_VARCOM14_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_VARIAZFINANZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAZFINANZ_Init()
  {

    PAN_VARIAZFINANZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZFINANZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIAZFINANZ.SetSize(MyGlb.OBJ_FIELD, 22);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CAPITOLO, "7C4A1C9B-0C8E-401E-96CC-98F6A8E2A7FD");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CAPITOLO, "CAPITOLO");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CAPITOLO, "");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ARTICOLO, "0242E192-5B32-4B68-9839-F7BD8D34EE54");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ARTICOLO, "ARTICOLO");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ARTICOLO, "");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_IMPORTO, "A6CF9F92-5E7E-4CB6-A4E9-F61FD59C9445");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_IMPORTO, "Importo");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_IMPORTO, "");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA1, "9128311E-5B90-4009-85D2-1AC4FC3D6CEF");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA1, "OPERA");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA1, "");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DESCRIZIONE, "AA4DBBB1-9BC9-4D43-883E-D8736C697D24");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DESCRIZIONE, "DESCRIZIONE");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DESCRIZIONE, "");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DATA, "29204A86-45C5-47B8-98BA-85ACEAF30BE0");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DATA, "Data");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DATA, "");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_SEDEDEL, "B84CE6EE-AD0A-474C-8927-2E2B918321F3");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_SEDEDEL, "SEDE DEL");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_SEDEDEL, "");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMERODEL, "CF489257-9865-4C03-BDB8-C34656CF69D8");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMERODEL, "NUMERO DEL");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMERODEL, "");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNODEL, "59CBD416-2A6D-4F47-9A51-0285821723C0");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNODEL, "ANNO DEL");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNODEL, "");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_UNITAPROPONE, "2F0AFAFC-2016-49D6-B1D5-B6F5CF7BCDE0");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_UNITAPROPONE, "");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMEROPROPOS, "AA701BF2-C6BF-4AED-8451-553A3D6953E5");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMEROPROPOS, "");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNOPROPOSTA, "8F9F7678-2FDA-4EC4-A959-0E8D5659E44E");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNOPROPOSTA, "");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROGETTO, "18D04055-D020-4F24-8976-C807289F0AB0");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROGETTO, "Obiettivo Operativo");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROGETTO, "");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CODICEDESCRI, "5946BE9B-9088-441C-9E3E-BBE88F67F844");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CODICEDESCRI, "Codice Descrizione");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CODICEDESCRI, "");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CODICEDESCRI, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CODICEDESCRI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELCAPITOL, "43F69804-830D-457C-AD2A-F7C6F2698A74");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELCAPITOL, "Capitolo/Art.");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELOPERA, "65DF27D5-DD79-40BF-9158-431A3D029123");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELOPERA, "Opera");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELOPERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELDELIBER, "F4464B81-ED28-4C54-9AF6-A4A8DA72B978");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELDELIBER, "Delibera");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELDELIBER, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELDELIBER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELPROPOST, "0CA00FAF-B601-4959-961B-18FE0E53AE9D");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELPROPOST, "Proposta");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELPROPOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_RIFBILANCPEG, "B42A42A6-53E7-42BE-BD70-B4DE3A49EA13");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_RIFBILANCPEG, "To String (VARCOM CAPITOLO) + \" \" + \" / \" + \" \" + To String (VARCOM ARTICOLO)");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA, "5FEFC10E-9F62-435A-B356-3A6FD2324617");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA, "Opera");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA, "To String (VARCOM OPERA) + \" \" + \" - \" + \" \" + OPERE DESCRIZIONE");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DELIBERA, "3C02CF45-69AC-45D5-B6CD-AC4BD7AF6011");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DELIBERA, "Delibera");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DELIBERA, "VARCOM SEDE DEL + \" \" + \" - \" + \" \" + To String (VARCOM NUMERO DEL) + \" \" + \" / \" + \" \" + To String (VARCOM ANNO DEL)");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DELIBERA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DELIBERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROPOSTA, "443C39AB-D458-46EA-B395-111EB1F76B62");
    PAN_VARIAZFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROPOSTA, "Proposta");
    PAN_VARIAZFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROPOSTA, "VARCOM UNITA PROPONENTE + \" \" + \" - \" + \" \" + To String (VARCOM NUMERO PROPOSTA) + \" / \" + To String (VARCOM ANNO PROPOSTA)");
    PAN_VARIAZFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAZFINANZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CAPITOLO, MyGlb.PANEL_FORM, 4, 352, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_CAPITOLO, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_CAPITOLO, PPQRY_VARCOM14, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ARTICOLO, MyGlb.PANEL_LIST, 108, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ARTICOLO, MyGlb.PANEL_LIST, "AR.");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ARTICOLO, MyGlb.PANEL_FORM, 4, 376, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_ARTICOLO, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_ARTICOLO, PPQRY_VARCOM14, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_IMPORTO, MyGlb.PANEL_LIST, 136, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_IMPORTO, MyGlb.PANEL_FORM, 4, 160, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_IMPORTO, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_IMPORTO, PPQRY_VARCOM14, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA1, MyGlb.PANEL_LIST, 252, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA1, MyGlb.PANEL_LIST, 44);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA1, MyGlb.PANEL_LIST, "OPERA");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA1, MyGlb.PANEL_FORM, 4, 400, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA1, MyGlb.PANEL_FORM, 44);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA1, MyGlb.PANEL_FORM, "OPERA");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_OPERA1, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_OPERA1, PPQRY_VARCOM14, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DESCRIZIONE, MyGlb.PANEL_LIST, 296, 36, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 424, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCR.");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_DESCRIZIONE, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_DESCRIZIONE, PPQRY_VARCOM14, "B.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DATA, MyGlb.PANEL_LIST, 436, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DATA, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DATA, MyGlb.PANEL_FORM, 4, 184, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DATA, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_DATA, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_DATA, PPQRY_VARCOM14, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_SEDEDEL, MyGlb.PANEL_LIST, 512, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_SEDEDEL, MyGlb.PANEL_FORM, 4, 460, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_SEDEDEL, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_SEDEDEL, PPQRY_VARCOM14, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMERODEL, MyGlb.PANEL_LIST, 556, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMERODEL, MyGlb.PANEL_FORM, 4, 484, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_NUMERODEL, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_NUMERODEL, PPQRY_VARCOM14, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNODEL, MyGlb.PANEL_LIST, 600, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNODEL, MyGlb.PANEL_FORM, 4, 508, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_ANNODEL, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_ANNODEL, PPQRY_VARCOM14, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_UNITAPROPONE, MyGlb.PANEL_LIST, 636, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 532, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_UNITAPROPONE, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_UNITAPROPONE, PPQRY_VARCOM14, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 255, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 744, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PRP.");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 556, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_NUMEROPROPOS, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_NUMEROPROPOS, PPQRY_VARCOM14, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 780, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 580, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_ANNOPROPOSTA, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_ANNOPROPOSTA, PPQRY_VARCOM14, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROGETTO, MyGlb.PANEL_LIST, 816, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROGETTO, MyGlb.PANEL_FORM, 4, 208, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROGETTO, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_PROGETTO, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_PROGETTO, PPQRY_VARCOM14, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CODICEDESCRI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CODICEDESCRI, MyGlb.PANEL_LIST, 100);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CODICEDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CODICEDESCRI, MyGlb.PANEL_LIST, "Codice Descrizione");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CODICEDESCRI, MyGlb.PANEL_FORM, 4, 328, 532, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CODICEDESCRI, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CODICEDESCRI, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_CODICEDESCRI, MyGlb.PANEL_FORM, "Codice Descrizione");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_CODICEDESCRI, -1, -1);
    PAN_VARIAZFINANZ.SetFieldUnbound(PFL_VARIAZFINANZ_CODICEDESCRI, true);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_CODICEDESCRI, PPQRY_VARCOM14, "TO_CHAR ( A.OPERA ) || ' - ' || B.DESCRIZIONE", "VARCCODIDESC", 5, 302, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 4, 136, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELCAPITOL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_LABELCAPITOL, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELOPERA, MyGlb.PANEL_LIST, 252, 0, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELOPERA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELOPERA, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELOPERA, MyGlb.PANEL_FORM, 8, 12, 136, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELOPERA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELOPERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_LABELOPERA, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_LABELOPERA, -1, "", "LABELOPERA", 0, 0, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELDELIBER, MyGlb.PANEL_LIST, 512, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELDELIBER, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELDELIBER, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELDELIBER, MyGlb.PANEL_FORM, 16, 20, 136, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELDELIBER, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELDELIBER, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_LABELDELIBER, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_LABELDELIBER, -1, "", "LABELDELIBER", 0, 0, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELPROPOST, MyGlb.PANEL_LIST, 636, 0, 180, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELPROPOST, MyGlb.PANEL_FORM, 24, 28, 136, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_LABELPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_LABELPROPOST, -1, -1);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 604, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_RIFBILANCPEG, -1, -1);
    PAN_VARIAZFINANZ.SetFieldUnbound(PFL_VARIAZFINANZ_RIFBILANCPEG, true);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_RIFBILANCPEG, PPQRY_VARCOM14, "TO_CHAR ( A.CAPITOLO ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ARTICOLO )", "VARRIFBILPEG", 5, 203, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA, MyGlb.PANEL_LIST, 40);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA, MyGlb.PANEL_FORM, 4, 604, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA, MyGlb.PANEL_FORM, 40);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_OPERA, -1, -1);
    PAN_VARIAZFINANZ.SetFieldUnbound(PFL_VARIAZFINANZ_OPERA, true);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_OPERA, PPQRY_VARCOM14, "TO_CHAR ( A.OPERA ) || ' ' || ' - ' || ' ' || B.DESCRIZIONE", "VARCOMOPERA", 5, 304, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DELIBERA, MyGlb.PANEL_FORM, 4, 604, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DELIBERA, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_DELIBERA, MyGlb.PANEL_FORM, "Delib.");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_DELIBERA, -1, -1);
    PAN_VARIAZFINANZ.SetFieldUnbound(PFL_VARIAZFINANZ_DELIBERA, true);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_DELIBERA, PPQRY_VARCOM14, "A.SEDE_DEL || ' ' || ' - ' || ' ' || TO_CHAR ( A.NUMERO_DEL ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ANNO_DEL )", "VARCOMDELIBE", 5, 463, 0, -13997);
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_VARIAZFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROPOSTA, MyGlb.PANEL_FORM, 4, 604, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROPOSTA, MyGlb.PANEL_FORM, 52);
    PAN_VARIAZFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZFINANZ_PROPOSTA, MyGlb.PANEL_FORM, "Prop.");
    PAN_VARIAZFINANZ.SetFieldPage(PFL_VARIAZFINANZ_PROPOSTA, -1, -1);
    PAN_VARIAZFINANZ.SetFieldUnbound(PFL_VARIAZFINANZ_PROPOSTA, true);
    PAN_VARIAZFINANZ.SetFieldPanel(PFL_VARIAZFINANZ_PROPOSTA, PPQRY_VARCOM14, "A.UNITA_PROPONENTE || ' ' || ' - ' || ' ' || TO_CHAR ( A.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( A.ANNO_PROPOSTA )", "VARCOMPROPOS", 5, 461, 0, -13997);
  }

  private void PAN_VARIAZFINANZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZFINANZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VARIAZFINANZ.SetIMDB(IMDB, "PQRY_VARCOM14", true);
    PAN_VARIAZFINANZ.set_SetString(MyGlb.MASTER_ROWNAME, "VARCOM");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ARTICOLO ) as VARRIFBILPEG, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  TO_CHAR ( A.OPERA ) || ' ' || ' - ' || ' ' || B.DESCRIZIONE as VARCOMOPERA, ");
    SQL.append("  A.SEDE_DEL || ' ' || ' - ' || ' ' || TO_CHAR ( A.NUMERO_DEL ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ANNO_DEL ) as VARCOMDELIBE, ");
    SQL.append("  A.UNITA_PROPONENTE || ' ' || ' - ' || ' ' || TO_CHAR ( A.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( A.ANNO_PROPOSTA ) as VARCOMPROPOS, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  TO_CHAR ( A.OPERA ) || ' - ' || B.DESCRIZIONE as VARCCODIDESC ");
    PAN_VARIAZFINANZ.SetQuery(PPQRY_VARCOM14, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARCOM A, ");
    SQL.append("  OPERE B ");
    PAN_VARIAZFINANZ.SetQuery(PPQRY_VARCOM14, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.OPERA = B.CODICE(+)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND A.E_S = ~~TBL_PARAMETRI39.PARAMES~~ AND A.FINANZIAMENTO = ~~TBL_PARAMETRI39.PARAMFINANZI~~) ");
    PAN_VARIAZFINANZ.SetQuery(PPQRY_VARCOM14, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZFINANZ.SetQuery(PPQRY_VARCOM14, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZFINANZ.SetQuery(PPQRY_VARCOM14, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.D_DATA_REG ");
    PAN_VARIAZFINANZ.SetQuery(PPQRY_VARCOM14, 5, SQL, -1, "");
    PAN_VARIAZFINANZ.SetQueryDB(PPQRY_VARCOM14, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZFINANZ.SetMasterTable(0, "VARCOM");
    PAN_VARIAZFINANZ.AddToSortList(PFL_VARIAZFINANZ_CAPITOLO, true);
    PAN_VARIAZFINANZ.AddToSortList(PFL_VARIAZFINANZ_ARTICOLO, true);
    PAN_VARIAZFINANZ.AddToSortList(PFL_VARIAZFINANZ_DATA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZFINANZ.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZFINANZ.iUseListQBE;
      PAN_VARIAZFINANZ.iUseListQBE = 0;
      PAN_VARIAZFINANZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZFINANZ.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZFINANZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAZFINANZ) PAN_VARIAZFINANZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZFINANZ) PAN_VARIAZFINANZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZFINANZ) PAN_VARIAZFINANZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZFINANZ) PAN_VARIAZFINANZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIAZFINANZ) PAN_VARIAZFINANZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
