// **********************************************
// Scelta Periodo Riaccertamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaPeriodoRiaccertamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARSS_ESCLUDI = 0;

  private static int PPQRY_PARSS1 = 0;


  IDPanel PAN_PARSS;
  private static int PFL_PERIODRIACCE_CODICE = 0;
  private static int PFL_PERIODRIACCE_DESCRIZIONE = 1;
  private static int PFL_PERIODRIACCE_DATAINIZIO = 2;
  private static int PFL_PERIODRIACCE_DATAFINE = 3;
  private static int PFL_PERIODRIACCE_TIPO = 4;
  private static int PFL_PERIODRIACCE_FILTRODISP = 5;

  private static int PPQRY_PERIODRIACC1 = 0;


  IDPanel PAN_PERIODRIACCE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARSS(IMDB);
    //
    //
    Init_PQRY_PERIODRIACC1(IMDB);
    Init_PQRY_PARSS1(IMDB);
    Init_PQRY_PARSS1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARSS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARSS, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARSS, "TBL_PARSS");
    IMDB.set_FldCode(IMDBDef1.TBL_PARSS,IMDBDef1.FLD_PARSS_NOMEOGGEESCL, "NOMEOGGEESCL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARSS,IMDBDef1.FLD_PARSS_NOMEOGGEESCL,5,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARSS, 0);
  }

  private static void Init_PQRY_PERIODRIACC1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PERIODRIACC1, 6);
    IMDB.set_TblCode(IMDBDef8.PQRY_PERIODRIACC1, "PQRY_PERIODRIACC1");
    IMDB.set_FldCode(IMDBDef8.PQRY_PERIODRIACC1,IMDBDef8.PQSL_PERIODRIACC1_PERIRIACCODI, "PERIRIACCODI");
    IMDB.SetFldParams(IMDBDef8.PQRY_PERIODRIACC1,IMDBDef8.PQSL_PERIODRIACC1_PERIRIACCODI,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PERIODRIACC1,IMDBDef8.PQSL_PERIODRIACC1_PERIRIACDESC, "PERIRIACDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PERIODRIACC1,IMDBDef8.PQSL_PERIODRIACC1_PERIRIACDESC,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PERIODRIACC1,IMDBDef8.PQSL_PERIODRIACC1_PERRIADATINI, "PERRIADATINI");
    IMDB.SetFldParams(IMDBDef8.PQRY_PERIODRIACC1,IMDBDef8.PQSL_PERIODRIACC1_PERRIADATINI,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PERIODRIACC1,IMDBDef8.PQSL_PERIODRIACC1_PERRIADATFIN, "PERRIADATFIN");
    IMDB.SetFldParams(IMDBDef8.PQRY_PERIODRIACC1,IMDBDef8.PQSL_PERIODRIACC1_PERRIADATFIN,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PERIODRIACC1,IMDBDef8.PQSL_PERIODRIACC1_PERIRIACTIPO, "PERIRIACTIPO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PERIODRIACC1,IMDBDef8.PQSL_PERIODRIACC1_PERIRIACTIPO,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PERIODRIACC1,IMDBDef8.PQSL_PERIODRIACC1_PERRIAFILDIS, "PERRIAFILDIS");
    IMDB.SetFldParams(IMDBDef8.PQRY_PERIODRIACC1,IMDBDef8.PQSL_PERIODRIACC1_PERRIAFILDIS,5,10,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PERIODRIACC1, 0);
  }

  private static void Init_PQRY_PARSS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PARSS1, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_PARSS1, "PQRY_PARSS1");
    IMDB.set_FldCode(IMDBDef8.PQRY_PARSS1,IMDBDef8.PQSL_PARSS1_NOMEOGGEESCL, "NOMEOGGEESCL");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARSS1,IMDBDef8.PQSL_PARSS1_NOMEOGGEESCL,5,2,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PARSS1, 0);
  }

  private static void Init_PQRY_PARSS1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PARSS1_RS, 1);
    IMDB.set_TblCode(IMDBDef8.PQRY_PARSS1_RS, "PQRY_PARSS1_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_PARSS1_RS,IMDBDef8.PQSL_PARSS1_NOMEOGGEESCL, "NOMEOGGEESCL");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARSS1_RS,IMDBDef8.PQSL_PARSS1_NOMEOGGEESCL,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaPeriodoRiaccertamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaPeriodoRiaccertamento()
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
    FormIdx = MyGlb.FRM_SCELPERIRIAC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C72C6EFD-E88A-447A-AEBA-55D656DD2776";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 836;
    DesignHeight = 382;
    set_Caption(new IDVariant("Scelta Periodo Riaccertamento"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 836;
    Frames[1].Height = 356;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.101124;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 836;
    Frames[2].Height = 36;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parss";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 836;
    Frames[2].FixedHeight = 36;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARSS = new IDPanel(w, this, 2, "PAN_PARSS");
    Frames[2].Content = PAN_PARSS;
    PAN_PARSS.Lockable = false;
    PAN_PARSS.iLocked = false;
    PAN_PARSS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARSS.VS = MainFrm.VisualStyleList;
    PAN_PARSS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 836-MyGlb.PAN_OFFS_X, 36-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARSS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3FB25DB1-942F-4174-B8B2-999BD56103A4");
    PAN_PARSS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 48, 56, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARSS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARSS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARSS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARSS.InitStatus = 1;
    PAN_PARSS_Init();
    PAN_PARSS_InitFields();
    PAN_PARSS_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 836;
    Frames[3].Height = 320;
    Frames[3].Caption = "Periodo Riaccertamento";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 320;
    PAN_PERIODRIACCE = new IDPanel(w, this, 3, "PAN_PERIODRIACCE");
    Frames[3].Content = PAN_PERIODRIACCE;
    PAN_PERIODRIACCE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PERIODRIACCE.VS = MainFrm.VisualStyleList;
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 836-MyGlb.PAN_OFFS_X, 320-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PERIODRIACCE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8D628111-9597-490A-AB70-F7511E9EBB86");
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 796, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PERIODRIACCE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PERIODRIACCE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PERIODRIACCE.InitStatus = 2;
    PAN_PERIODRIACCE_Init();
    PAN_PERIODRIACCE_InitFields();
    PAN_PERIODRIACCE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARSS, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELPERIRIAC_PARSS1();
      }
      PAN_PERIODRIACCE.UpdatePanel(MainFrm);
      PAN_PARSS.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaPeriodoRiaccertamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaPeriodoRiaccertamento.class.getName() : (Glb.ClassWithPackage(SceltaPeriodoRiaccertamento.class) ? SceltaPeriodoRiaccertamento.class.getName().substring(SceltaPeriodoRiaccertamento.class.getPackage().getName().length() + 1) : SceltaPeriodoRiaccertamento.class.getName()));
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
      IMDB.set_Value(IMDBDef1.TBL_PARSS, IMDBDef1.FLD_PARSS_NOMEOGGEESCL, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaPeriodoRiaccertamento", "Load", _e);
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
      UNLOAD_PARSSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaPeriodoRiaccertamento", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parss: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARSS, IMDBDef1.FLD_PARSS_NOMEOGGEESCL, 0, new IDVariant());
  }

  // **********************************************************************
  // Parss
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCELPERIRIAC_PARSS1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_PARSS1_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARSS, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARSS, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_PARSS1_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_PARSS1_RS, 0, IMDBDef1.TBL_PARSS, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_PARSS1_RS, 0, 0, IMDBDef1.TBL_PARSS, IMDBDef1.FLD_PARSS_NOMEOGGEESCL, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARSS, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARSS, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARSS, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef8.PQRY_PARSS1_RS, 0);
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
  private void PAN_PARSS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARSS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARSS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARSS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARSS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARSS);
    // Stub
  }

  private void PAN_PARSS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARSS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARSS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARSS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PERIODRIACCE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PERIODRIACCE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PERIODRIACCE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PERIODRIACCE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PERIODRIACCE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PERIODRIACCE);
    // Stub
  }

  private void PAN_PERIODRIACCE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PERIODRIACCE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PERIODRIACCE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PERIODRIACCE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PERIODRIACCE_Init()
  {

    PAN_PERIODRIACCE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PERIODRIACCE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PERIODRIACCE.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PERIODRIACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, "BB6BC506-F626-455E-A0A2-085585AD7EAA");
    PAN_PERIODRIACCE.set_Header(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, "Codice");
    PAN_PERIODRIACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, "");
    PAN_PERIODRIACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_PERIODRIACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PERIODRIACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, "07A3B3F4-17CA-431A-8798-A0CEEB9C20CA");
    PAN_PERIODRIACCE.set_Header(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, "Descrizione");
    PAN_PERIODRIACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, "");
    PAN_PERIODRIACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PERIODRIACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PERIODRIACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, "F3370810-AA40-4BE2-AFF0-0238C3CCCD60");
    PAN_PERIODRIACCE.set_Header(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, "Data Inizio");
    PAN_PERIODRIACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, "");
    PAN_PERIODRIACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PERIODRIACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PERIODRIACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, "FFBDDDE8-9A58-4463-B7C1-420EC35E1312");
    PAN_PERIODRIACCE.set_Header(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, "Data Fine");
    PAN_PERIODRIACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, "");
    PAN_PERIODRIACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.VIS_NORMALFIELDS);
    PAN_PERIODRIACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PERIODRIACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, "D54DAF96-6403-455A-AF70-3032DFDD0CD5");
    PAN_PERIODRIACCE.set_Header(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, "Tipo");
    PAN_PERIODRIACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, "");
    PAN_PERIODRIACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_PERIODRIACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PERIODRIACCE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, "CB666AE1-9A8D-43D1-BDC1-4AA4639B9555");
    PAN_PERIODRIACCE.set_Header(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, "Filtro Disponibilità");
    PAN_PERIODRIACCE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, "");
    PAN_PERIODRIACCE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.VIS_NORMALFIELDS);
    PAN_PERIODRIACCE.SetFlags(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PERIODRIACCE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_FORM, 96);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_PERIODRIACCE.SetFieldPage(PFL_PERIODRIACCE_CODICE, -1, -1);
    PAN_PERIODRIACCE.SetFieldPanel(PFL_PERIODRIACCE_CODICE, PPQRY_PERIODRIACC1, "A.CODICE", "PERIRIACCODI", 1, 5, 0, -13997);
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_LIST, 48, 36, 360, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PERIODRIACCE.SetFieldPage(PFL_PERIODRIACCE_DESCRIZIONE, -1, -1);
    PAN_PERIODRIACCE.SetFieldPanel(PFL_PERIODRIACCE_DESCRIZIONE, PPQRY_PERIODRIACC1, "A.DESCRIZIONE", "PERIRIACDESC", 5, 100, 0, -13997);
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_LIST, 408, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_LIST, 80);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_LIST, "Data Inizio");
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_FORM, 4, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_FORM, 80);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAINIZIO, MyGlb.PANEL_FORM, "Data Inizio");
    PAN_PERIODRIACCE.SetFieldPage(PFL_PERIODRIACCE_DATAINIZIO, -1, -1);
    PAN_PERIODRIACCE.SetFieldPanel(PFL_PERIODRIACCE_DATAINIZIO, PPQRY_PERIODRIACC1, "A.DATA_INIZIO", "PERRIADATINI", 6, 19, 0, -13997);
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_LIST, 488, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_LIST, 68);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_LIST, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_LIST, "Data Fine");
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_FORM, 4, 76, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_FORM, 68);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_FORM, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_DATAFINE, MyGlb.PANEL_FORM, "Data Fine");
    PAN_PERIODRIACCE.SetFieldPage(PFL_PERIODRIACCE_DATAFINE, -1, -1);
    PAN_PERIODRIACCE.SetFieldPanel(PFL_PERIODRIACCE_DATAFINE, PPQRY_PERIODRIACC1, "A.DATA_FINE", "PERRIADATFIN", 6, 19, 0, -13997);
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_LIST, 556, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_LIST, 36);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_FORM, 4, 100, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_FORM, 36);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_PERIODRIACCE.SetFieldPage(PFL_PERIODRIACCE_TIPO, -1, -1);
    PAN_PERIODRIACCE.SetFieldPanel(PFL_PERIODRIACCE_TIPO, PPQRY_PERIODRIACC1, "A.TIPO", "PERIRIACTIPO", 5, 10, 0, -13997);
    PAN_PERIODRIACCE.SetValueListItem(PFL_PERIODRIACCE_TIPO, (new IDVariant("CONS")), "Consuntivo", "", "", -1);
    PAN_PERIODRIACCE.SetValueListItem(PFL_PERIODRIACCE_TIPO, (new IDVariant("GEST")), "Gestione", "", "", -1);
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_LIST, 644, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_LIST, 80);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_LIST, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_LIST, "Filtro Disponibilità");
    PAN_PERIODRIACCE.SetRect(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_FORM, 4, 124, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERIODRIACCE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_FORM, 80);
    PAN_PERIODRIACCE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_FORM, 1);
    PAN_PERIODRIACCE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERIODRIACCE_FILTRODISP, MyGlb.PANEL_FORM, "Filt. Dispon.");
    PAN_PERIODRIACCE.SetFieldPage(PFL_PERIODRIACCE_FILTRODISP, -1, -1);
    PAN_PERIODRIACCE.SetFieldPanel(PFL_PERIODRIACCE_FILTRODISP, PPQRY_PERIODRIACC1, "A.FILTRO_DISP", "PERRIAFILDIS", 5, 10, 0, -13997);
    PAN_PERIODRIACCE.SetValueListItem(PFL_PERIODRIACCE_FILTRODISP, (new IDVariant("DISP_31_12")), "Disp. finanziaria 31/12", "", "", -1);
    PAN_PERIODRIACCE.SetValueListItem(PFL_PERIODRIACCE_FILTRODISP, (new IDVariant("DISP_EFF")), "Disp. effettiva data elab.", "", "", -1);
  }

  private void PAN_PERIODRIACCE_InitQueries()
  {
    StringBuffer SQL;

    PAN_PERIODRIACCE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PERIODRIACCE.SetIMDB(IMDB, "PQRY_PERIODRIACC1", true);
    PAN_PERIODRIACCE.set_SetString(MyGlb.MASTER_ROWNAME, "PERIODI RIACCERTAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as PERIRIACCODI, ");
    SQL.append("  A.DESCRIZIONE as PERIRIACDESC, ");
    SQL.append("  A.DATA_INIZIO as PERRIADATINI, ");
    SQL.append("  A.DATA_FINE as PERRIADATFIN, ");
    SQL.append("  A.TIPO as PERIRIACTIPO, ");
    SQL.append("  A.FILTRO_DISP as PERRIAFILDIS ");
    PAN_PERIODRIACCE.SetQuery(PPQRY_PERIODRIACC1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PERIODI_RIACCERTAMENTI A ");
    PAN_PERIODRIACCE.SetQuery(PPQRY_PERIODRIACC1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (~~PQRY_PARSS1.NOMEOGGEESCL~~ = 'NO' OR (~~PQRY_PARSS1.NOMEOGGEESCL~~ = 'SI' AND (TRUNC( SYSDATE ) BETWEEN A.DATA_INIZIO AND NVL(A.DATA_FINE, TO_DATE('2999-12-31','YYYY-MM-DD'))))) ");
    PAN_PERIODRIACCE.SetQuery(PPQRY_PERIODRIACC1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PERIODRIACCE.SetQuery(PPQRY_PERIODRIACC1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PERIODRIACCE.SetQuery(PPQRY_PERIODRIACC1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE, ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PERIODRIACCE.SetQuery(PPQRY_PERIODRIACC1, 5, SQL, -1, "");
    PAN_PERIODRIACCE.SetQueryDB(PPQRY_PERIODRIACC1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PERIODRIACCE.SetMasterTable(0, "PERIODI_RIACCERTAMENTI");
    PAN_PERIODRIACCE.AddToSortList(PFL_PERIODRIACCE_CODICE, true);
    PAN_PERIODRIACCE.AddToSortList(PFL_PERIODRIACCE_DESCRIZIONE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PERIODRIACCE.Status() == 2)
    {
      int oldListQBE = PAN_PERIODRIACCE.iUseListQBE;
      PAN_PERIODRIACCE.iUseListQBE = 0;
      PAN_PERIODRIACCE.PanelCommand(Glb.PCM_SEARCH);
      PAN_PERIODRIACCE.PanelCommand(Glb.PCM_FIND);
      PAN_PERIODRIACCE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARSS_Init()
  {

    PAN_PARSS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARSS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARSS.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARSS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSS_ESCLUDI, "0AA8F2CD-DA37-4D2E-AC62-90365CD3DF5B");
    PAN_PARSS.set_Header(MyGlb.OBJ_FIELD, PFL_PARSS_ESCLUDI, "Escludi periodi chiusi");
    PAN_PARSS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARSS_ESCLUDI, "");
    PAN_PARSS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSS_ESCLUDI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARSS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSS_ESCLUDI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARSS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARSS.SetRect(MyGlb.OBJ_FIELD, PFL_PARSS_ESCLUDI, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSS_ESCLUDI, MyGlb.PANEL_LIST, 48);
    PAN_PARSS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSS_ESCLUDI, MyGlb.PANEL_LIST, 1);
    PAN_PARSS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSS_ESCLUDI, MyGlb.PANEL_LIST, "Escl. per. ch.");
    PAN_PARSS.SetRect(MyGlb.OBJ_FIELD, PFL_PARSS_ESCLUDI, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSS_ESCLUDI, MyGlb.PANEL_FORM, 148);
    PAN_PARSS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSS_ESCLUDI, MyGlb.PANEL_FORM, 1);
    PAN_PARSS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSS_ESCLUDI, MyGlb.PANEL_FORM, "Escludi periodi chiusi");
    PAN_PARSS.SetFieldPage(PFL_PARSS_ESCLUDI, -1, -1);
    PAN_PARSS.SetFieldPanel(PFL_PARSS_ESCLUDI, PPQRY_PARSS1, "A.NOMEOGGEESCL", "NOMEOGGEESCL", 5, 2, 0, -13997);
    PAN_PARSS.SetValueListItem(PFL_PARSS_ESCLUDI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARSS.SetValueListItem(PFL_PARSS_ESCLUDI, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARSS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARSS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARSS.SetIMDB(IMDB, "PQRY_PARSS1", true);
    PAN_PARSS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARSS.SetQueryIMDB(PPQRY_PARSS1, IMDBDef8.PQRY_PARSS1_RS, IMDBDef1.TBL_PARSS);
    JustLoaded = true;
    PAN_PARSS.SetFieldPrimaryIndex(PFL_PARSS_ESCLUDI, IMDBDef1.FLD_PARSS_NOMEOGGEESCL);
    PAN_PARSS.SetMasterTable(0, "PARSS");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARSS.Status() == 2)
    {
      int oldListQBE = PAN_PARSS.iUseListQBE;
      PAN_PARSS.iUseListQBE = 0;
      PAN_PARSS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARSS.PanelCommand(Glb.PCM_FIND);
      PAN_PARSS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PERIODRIACCE) PAN_PERIODRIACCE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARSS) PAN_PARSS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PERIODRIACCE) PAN_PERIODRIACCE_ValidateRow(Cancel);
    if (SrcObj == PAN_PARSS) PAN_PARSS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PERIODRIACCE) PAN_PERIODRIACCE_DynamicProperties();
    if (SrcObj == PAN_PARSS) PAN_PARSS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PERIODRIACCE) PAN_PERIODRIACCE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARSS) PAN_PARSS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PERIODRIACCE) PAN_PERIODRIACCE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARSS) PAN_PARSS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
