// **********************************************
// Proposte Da Subimpegni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ProposteDaSubimpegni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_NUOVOPANNELL_ETICLIMPORAG = 0;
  private static int PFL_NUOVOPANNELL_ETICHEELABOR = 1;
  private static int PFL_NUOVOPANNELL_ANNULLA = 2;
  private static int PFL_NUOVOPANNELL_ELIMPROPESIS = 3;

  private static int PPQRY_P1 = 0;


  IDPanel PAN_NUOVOPANNELL;

  // Definition of Global Variables
  private IDVariant DESCRIZIONE = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_P(IMDB);
    //
    //
    Init_PQRY_P1(IMDB);
    Init_PQRY_P1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_P(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_P, 1);
    IMDB.set_TblCode(IMDBDef5.TBL_P, "TBL_P");
    IMDB.set_FldCode(IMDBDef5.TBL_P,IMDBDef5.FLD_P_NOMOGGELPRES, "NOMOGGELPRES");
    IMDB.SetFldParams(IMDBDef5.TBL_P,IMDBDef5.FLD_P_NOMOGGELPRES,5,50,0);
    IMDB.TblAddNew(IMDBDef5.TBL_P, 0);
  }

  private static void Init_PQRY_P1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_P1, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_P1, "PQRY_P1");
    IMDB.set_FldCode(IMDBDef14.PQRY_P1,IMDBDef14.PQSL_P1_NOMOGGELPRES, "NOMOGGELPRES");
    IMDB.SetFldParams(IMDBDef14.PQRY_P1,IMDBDef14.PQSL_P1_NOMOGGELPRES,5,50,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_P1, 0);
  }

  private static void Init_PQRY_P1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_P1_RS, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_P1_RS, "PQRY_P1_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_P1_RS,IMDBDef14.PQSL_P1_NOMOGGELPRES, "NOMOGGELPRES");
    IMDB.SetFldParams(IMDBDef14.PQRY_P1_RS,IMDBDef14.PQSL_P1_NOMOGGELPRES,5,50,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ProposteDaSubimpegni(MyWebEntryPoint w, IMDBObj imdb)
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
  public ProposteDaSubimpegni()
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
    FormIdx = MyGlb.FRM_PROPODASUBIM;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "35AD3F4D-7F7D-47A5-A2F9-31919F8C8787";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 484;
    DesignHeight = 278;
    set_Caption(new IDVariant("Proposte da subimpegni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 484;
    Frames[1].Height = 252;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Nuovo Pannello";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 252;
    PAN_NUOVOPANNELL = new IDPanel(w, this, 1, "PAN_NUOVOPANNELL");
    Frames[1].Content = PAN_NUOVOPANNELL;
    PAN_NUOVOPANNELL.ShowRowSelector = false;
    PAN_NUOVOPANNELL.ShowToolbar = false;
    PAN_NUOVOPANNELL.ShowStatusbar = false;
    PAN_NUOVOPANNELL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NUOVOPANNELL.VS = MainFrm.VisualStyleList;
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 484-MyGlb.PAN_OFFS_X, 252-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NUOVOPANNELL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "72F178BE-A688-40F6-971F-2361AAC80D8A");
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 260, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NUOVOPANNELL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NUOVOPANNELL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NUOVOPANNELL.InitStatus = 2;
    PAN_NUOVOPANNELL_Init();
    PAN_NUOVOPANNELL_InitFields();
    PAN_NUOVOPANNELL_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_P, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PROPODASUBIM_P1();
      }
      PAN_NUOVOPANNELL.UpdatePanel(MainFrm);
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
    return (obj instanceof ProposteDaSubimpegni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ProposteDaSubimpegni.class.getName() : (Glb.ClassWithPackage(ProposteDaSubimpegni.class) ? ProposteDaSubimpegni.class.getName().substring(ProposteDaSubimpegni.class.getPackage().getName().length() + 1) : ProposteDaSubimpegni.class.getName()));
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
      set_bVisualFlag(Glb.FORMVISPROP_CONFIRMBTN, (new IDVariant(0)).booleanValue());
      IMDB.set_Value(IMDBDef5.TBL_P, IMDBDef5.FLD_P_NOMOGGELPRES, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaSubimpegni", "Load", _e);
    }
  }

  // **********************************************************************
  // OK
  // **********************************************************************
  public int OK ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // OK Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaSubimpegni", "OK", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Annulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProposteDaSubimpegni", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // P
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void PROPODASUBIM_P1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_P1_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_P, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_P, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_P1_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_P1_RS, 0, IMDBDef5.TBL_P, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_P1_RS, 0, 0, IMDBDef5.TBL_P, IMDBDef5.FLD_P_NOMOGGELPRES, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_P, 0);
      if (IMDB.Eof(IMDBDef5.TBL_P, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_P, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_P1_RS, 0);
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
  private void PAN_NUOVOPANNELL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NUOVOPANNELL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NUOVOPANNELL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NUOVOPANNELL, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NUOVOPANNELL_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NUOVOPANNELL);
    // Stub
  }

  private void PAN_NUOVOPANNELL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_NUOVOPANNELL_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_NUOVOPANNELL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OK();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_NUOVOPANNELL_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_NUOVOPANNELL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Annulla();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_NUOVOPANNELL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NUOVOPANNELL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NUOVOPANNELL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_NUOVOPANNELL_Init()
  {

    PAN_NUOVOPANNELL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NUOVOPANNELL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NUOVOPANNELL.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_NUOVOPANNELL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICLIMPORAG, "4F6FA200-669A-4E01-B038-FF50EA02DAB0");
    PAN_NUOVOPANNELL.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICLIMPORAG, "Verranno generate le proposte di variazione di impegno sugli impegni selezionati a partire dalle proposte di sub impegno presenti. Ogni proposta creata raggrupperà tutte le proposte di variazione sub impegno con uguale Anno Esigibilità, Anno Entrata, Tipo Variazione e Finanziamento.\nSe abilitato “Elimina Proposte Esistenti”, le proposte di variazione impegno esistenti verranno eliminate, altrimenti le nuove proposte andranno in aggiunta a quelle già esistenti.\n");
    PAN_NUOVOPANNELL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICLIMPORAG, MyGlb.VIS_DICITUGENERI);
    PAN_NUOVOPANNELL.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICLIMPORAG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_NUOVOPANNELL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHEELABOR, "4D49511D-A71C-4FA8-A41B-BFBA5A27E333");
    PAN_NUOVOPANNELL.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHEELABOR, "Elabora");
    PAN_NUOVOPANNELL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_NUOVOPANNELL.SetImage(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHEELABOR, 0, "button1.gif", false);
    PAN_NUOVOPANNELL.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_NUOVOPANNELL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ANNULLA, "7050674C-B4B3-49A2-BC01-DEBD13444F74");
    PAN_NUOVOPANNELL.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ANNULLA, "Annulla");
    PAN_NUOVOPANNELL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_NUOVOPANNELL.SetImage(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ANNULLA, 0, "button1.gif", false);
    PAN_NUOVOPANNELL.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_NUOVOPANNELL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ELIMPROPESIS, "129C6C4B-AFCD-4BD4-88FC-F3768A68CD5C");
    PAN_NUOVOPANNELL.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ELIMPROPESIS, "Elimina Proposte Esistenti");
    PAN_NUOVOPANNELL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ELIMPROPESIS, "");
    PAN_NUOVOPANNELL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ELIMPROPESIS, MyGlb.VIS_CHECKSTYLE);
    PAN_NUOVOPANNELL.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ELIMPROPESIS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NUOVOPANNELL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICLIMPORAG, MyGlb.PANEL_LIST, 48, 92, 396, 180, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICLIMPORAG, MyGlb.PANEL_LIST, 0);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICLIMPORAG, MyGlb.PANEL_LIST, 13);
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICLIMPORAG, MyGlb.PANEL_FORM, 44, 8, 396, 120, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICLIMPORAG, MyGlb.PANEL_FORM, 0);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICLIMPORAG, MyGlb.PANEL_FORM, 9);
    PAN_NUOVOPANNELL.SetFieldPage(PFL_NUOVOPANNELL_ETICLIMPORAG, -1, -1);
    PAN_NUOVOPANNELL.SetFieldPanel(PFL_NUOVOPANNELL_ETICLIMPORAG, -1, "", "ETICLIMPORAG", 0, 0, 0, -13997);
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHEELABOR, MyGlb.PANEL_LIST, 48, 124, 116, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHEELABOR, MyGlb.PANEL_FORM, 156, 168, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_NUOVOPANNELL.SetFieldPage(PFL_NUOVOPANNELL_ETICHEELABOR, -1, -1);
    PAN_NUOVOPANNELL.SetFieldPanel(PFL_NUOVOPANNELL_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ANNULLA, MyGlb.PANEL_LIST, 56, 132, 116, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ANNULLA, MyGlb.PANEL_FORM, 252, 168, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_NUOVOPANNELL.SetFieldPage(PFL_NUOVOPANNELL_ANNULLA, -1, -1);
    PAN_NUOVOPANNELL.SetFieldPanel(PFL_NUOVOPANNELL_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ELIMPROPESIS, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ELIMPROPESIS, MyGlb.PANEL_LIST, 156);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ELIMPROPESIS, MyGlb.PANEL_LIST, 1);
    PAN_NUOVOPANNELL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ELIMPROPESIS, MyGlb.PANEL_LIST, "Elimina Proposte Esistenti");
    PAN_NUOVOPANNELL.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ELIMPROPESIS, MyGlb.PANEL_FORM, 88, 132, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVOPANNELL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ELIMPROPESIS, MyGlb.PANEL_FORM, 156);
    PAN_NUOVOPANNELL.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ELIMPROPESIS, MyGlb.PANEL_FORM, 1);
    PAN_NUOVOPANNELL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVOPANNELL_ELIMPROPESIS, MyGlb.PANEL_FORM, "Elimina Proposte Esistenti");
    PAN_NUOVOPANNELL.SetFieldPage(PFL_NUOVOPANNELL_ELIMPROPESIS, -1, -1);
    PAN_NUOVOPANNELL.SetFieldPanel(PFL_NUOVOPANNELL_ELIMPROPESIS, PPQRY_P1, "A.NOMOGGELPRES", "NOMOGGELPRES", 5, 50, 0, -13997);
    PAN_NUOVOPANNELL.SetValueListItem(PFL_NUOVOPANNELL_ELIMPROPESIS, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_NUOVOPANNELL.SetValueListItem(PFL_NUOVOPANNELL_ELIMPROPESIS, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_NUOVOPANNELL_InitQueries()
  {
    StringBuffer SQL;

    PAN_NUOVOPANNELL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NUOVOPANNELL.SetIMDB(IMDB, "PQRY_P1", true);
    PAN_NUOVOPANNELL.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_NUOVOPANNELL.SetQueryIMDB(PPQRY_P1, IMDBDef14.PQRY_P1_RS, IMDBDef5.TBL_P);
    JustLoaded = true;
    PAN_NUOVOPANNELL.SetFieldPrimaryIndex(PFL_NUOVOPANNELL_ELIMPROPESIS, IMDBDef5.FLD_P_NOMOGGELPRES);
    PAN_NUOVOPANNELL.SetMasterTable(0, "P");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NUOVOPANNELL.Status() == 2)
    {
      int oldListQBE = PAN_NUOVOPANNELL.iUseListQBE;
      PAN_NUOVOPANNELL.iUseListQBE = 0;
      PAN_NUOVOPANNELL.PanelCommand(Glb.PCM_SEARCH);
      PAN_NUOVOPANNELL.PanelCommand(Glb.PCM_FIND);
      PAN_NUOVOPANNELL.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_NUOVOPANNELL) PAN_NUOVOPANNELL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_NUOVOPANNELL) PAN_NUOVOPANNELL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_NUOVOPANNELL) PAN_NUOVOPANNELL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_NUOVOPANNELL) PAN_NUOVOPANNELL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_NUOVOPANNELL) PAN_NUOVOPANNELL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
