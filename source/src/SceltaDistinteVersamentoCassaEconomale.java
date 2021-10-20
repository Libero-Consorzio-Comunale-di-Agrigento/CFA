// **********************************************
// Scelta Distinte Versamento Cassa Economale
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaDistinteVersamentoCassaEconomale extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARACASSECON_ESERCIZIO = 0;

  private static int PPQRY_PARAMETRI660 = 0;

  private static int PPQRY_ESEFIN = 1;


  IDPanel PAN_PARACASSECON;
  private static int GRP_DISDIVERCAEC_DISTCASSECON = 0;

  private static int PFL_DISDIVERCAEC_NUMERODISTIN = 0;
  private static int PFL_DISDIVERCAEC_ANNODISTINTA = 1;
  private static int PFL_DISDIVERCAEC_DATADA = 2;
  private static int PFL_DISDIVERCAEC_DATAA = 3;
  private static int PFL_DISDIVERCAEC_INCASSATA = 4;

  private static int PPQRY_DISTINTE = 0;


  IDPanel PAN_DISDIVERCAEC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI663(IMDB);
    //
    //
    Init_PQRY_PARAMETRI660(IMDB);
    Init_PQRY_PARAMETRI660_RS(IMDB);
    Init_PQRY_DISTINTE(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI663(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI663, 1);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI663, "TBL_PARAMETRI663");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI663,IMDBDef6.FLD_PARAMETRI663_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI663,IMDBDef6.FLD_PARAMETRI663_PARAMESERCIZ,1,4,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI663, 0);
  }

  private static void Init_PQRY_PARAMETRI660(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI660, 1);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI660, "PQRY_PARAMETRI660");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI660,IMDBDef15.PQSL_PARAMETRI660_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI660,IMDBDef15.PQSL_PARAMETRI660_PARAMESERCIZ,1,4,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI660, 0);
  }

  private static void Init_PQRY_PARAMETRI660_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI660_RS, 1);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI660_RS, "PQRY_PARAMETRI660_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI660_RS,IMDBDef15.PQSL_PARAMETRI660_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI660_RS,IMDBDef15.PQSL_PARAMETRI660_PARAMESERCIZ,1,4,0);
  }

  private static void Init_PQRY_DISTINTE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_DISTINTE, 5);
    IMDB.set_TblCode(IMDBDef15.PQRY_DISTINTE, "PQRY_DISTINTE");
    IMDB.set_FldCode(IMDBDef15.PQRY_DISTINTE,IMDBDef15.PQSL_DISTINTE_BENDISVEANDI, "BENDISVEANDI");
    IMDB.SetFldParams(IMDBDef15.PQRY_DISTINTE,IMDBDef15.PQSL_DISTINTE_BENDISVEANDI,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_DISTINTE,IMDBDef15.PQSL_DISTINTE_BENDISVENUDI, "BENDISVENUDI");
    IMDB.SetFldParams(IMDBDef15.PQRY_DISTINTE,IMDBDef15.PQSL_DISTINTE_BENDISVENUDI,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_DISTINTE,IMDBDef15.PQSL_DISTINTE_BENDISVEDADA, "BENDISVEDADA");
    IMDB.SetFldParams(IMDBDef15.PQRY_DISTINTE,IMDBDef15.PQSL_DISTINTE_BENDISVEDADA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_DISTINTE,IMDBDef15.PQSL_DISTINTE_BENDISVERDAA, "BENDISVERDAA");
    IMDB.SetFldParams(IMDBDef15.PQRY_DISTINTE,IMDBDef15.PQSL_DISTINTE_BENDISVERDAA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_DISTINTE,IMDBDef15.PQSL_DISTINTE_INCASSATA, "INCASSATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_DISTINTE,IMDBDef15.PQSL_DISTINTE_INCASSATA,5,99,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_DISTINTE, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaDistinteVersamentoCassaEconomale(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaDistinteVersamentoCassaEconomale()
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
    FormIdx = MyGlb.FRM_SCEDISVECAEC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F1B7A64B-8123-49C6-A151-69584DF856C2";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 572;
    DesignHeight = 478;
    set_Caption(new IDVariant("Scelta Distinte Versamento Cassa Economale"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 572;
    Frames[1].Height = 452;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.106195;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 572;
    Frames[2].Height = 48;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri Cassa Economale";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 48;
    PAN_PARACASSECON = new IDPanel(w, this, 2, "PAN_PARACASSECON");
    Frames[2].Content = PAN_PARACASSECON;
    PAN_PARACASSECON.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARACASSECON.VS = MainFrm.VisualStyleList;
    PAN_PARACASSECON.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 572-MyGlb.PAN_OFFS_X, 48-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARACASSECON.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0052C831-3256-49F1-B292-96641754F327");
    PAN_PARACASSECON.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 40, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARACASSECON.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARACASSECON.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARACASSECON.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARACASSECON.InitStatus = 2;
    PAN_PARACASSECON_Init();
    PAN_PARACASSECON_InitFields();
    PAN_PARACASSECON_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 572;
    Frames[3].Height = 404;
    Frames[3].Caption = "Distinte di Versamento Cassa Economale";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 404;
    PAN_DISDIVERCAEC = new IDPanel(w, this, 3, "PAN_DISDIVERCAEC");
    Frames[3].Content = PAN_DISDIVERCAEC;
    PAN_DISDIVERCAEC.ShowRowSelector = false;
    PAN_DISDIVERCAEC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISDIVERCAEC.VS = MainFrm.VisualStyleList;
    PAN_DISDIVERCAEC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 572-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DISDIVERCAEC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E3516AFA-DCE9-469D-A751-9BA8A5089281");
    PAN_DISDIVERCAEC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 12, 0, 524, 316, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIVERCAEC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISDIVERCAEC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISDIVERCAEC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISDIVERCAEC.InitStatus = 1;
    PAN_DISDIVERCAEC_Init();
    PAN_DISDIVERCAEC_InitFields();
    PAN_DISDIVERCAEC_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI663, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCEDISVECAEC_PARAMETRI660();
      }
      PAN_PARACASSECON.UpdatePanel(MainFrm);
      PAN_DISDIVERCAEC.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaDistinteVersamentoCassaEconomale);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaDistinteVersamentoCassaEconomale.class.getName() : (Glb.ClassWithPackage(SceltaDistinteVersamentoCassaEconomale.class) ? SceltaDistinteVersamentoCassaEconomale.class.getName().substring(SceltaDistinteVersamentoCassaEconomale.class.getPackage().getName().length() + 1) : SceltaDistinteVersamentoCassaEconomale.class.getName()));
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
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI663, IMDBDef6.FLD_PARAMETRI663_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDistinteVersamentoCassaEconomale", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void SCEDISVECAEC_PARAMETRI660() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI660_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI663, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI663, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI660_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI660_RS, 0, IMDBDef6.TBL_PARAMETRI663, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI660_RS, 0, 0, IMDBDef6.TBL_PARAMETRI663, IMDBDef6.FLD_PARAMETRI663_PARAMESERCIZ, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI663, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI663, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI663, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI660_RS, 0);
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
  private void PAN_PARACASSECON_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARACASSECON, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARACASSECON_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARACASSECON, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARACASSECON_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARACASSECON);
    // Stub
  }

  private void PAN_PARACASSECON_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARACASSECON_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARACASSECON_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARACASSECON_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DISDIVERCAEC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISDIVERCAEC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISDIVERCAEC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISDIVERCAEC, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISDIVERCAEC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DISDIVERCAEC);
    // Stub
  }

  private void PAN_DISDIVERCAEC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DISDIVERCAEC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISDIVERCAEC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISDIVERCAEC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARACASSECON_Init()
  {

    PAN_PARACASSECON.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARACASSECON.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARACASSECON.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARACASSECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARACASSECON_ESERCIZIO, "EA5EFBFD-300C-49F1-A5D5-910EDF8AF20D");
    PAN_PARACASSECON.set_Header(MyGlb.OBJ_FIELD, PFL_PARACASSECON_ESERCIZIO, "Esercizio");
    PAN_PARACASSECON.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARACASSECON_ESERCIZIO, "");
    PAN_PARACASSECON.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARACASSECON_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARACASSECON.SetFlags(MyGlb.OBJ_FIELD, PFL_PARACASSECON_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARACASSECON_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARACASSECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARACASSECON_ESERCIZIO, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARACASSECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARACASSECON_ESERCIZIO, MyGlb.PANEL_LIST, 76);
    PAN_PARACASSECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARACASSECON_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARACASSECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARACASSECON_ESERCIZIO, MyGlb.PANEL_LIST, "Eserc.");
    PAN_PARACASSECON.SetRect(MyGlb.OBJ_FIELD, PFL_PARACASSECON_ESERCIZIO, MyGlb.PANEL_FORM, 8, 12, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARACASSECON.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARACASSECON_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_PARACASSECON.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARACASSECON_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARACASSECON.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARACASSECON_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARACASSECON.SetFieldPage(PFL_PARACASSECON_ESERCIZIO, -1, -1);
    PAN_PARACASSECON.SetFieldPanel(PFL_PARACASSECON_ESERCIZIO, PPQRY_PARAMETRI660, "A.PARAMESERCIZ", "PARAMESERCIZ", 1, 4, 0, -13997);
    PAN_PARACASSECON.set_Alignment(PFL_PARACASSECON_ESERCIZIO, 2);
  }

  private void PAN_PARACASSECON_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARACASSECON.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERC1, ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO desc ");
    PAN_PARACASSECON.SetQuery(PPQRY_ESEFIN, 0, SQL, PFL_PARACASSECON_ESERCIZIO, "");
    PAN_PARACASSECON.SetQueryDB(PPQRY_ESEFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARACASSECON.SetIMDB(IMDB, "PQRY_PARAMETRI660", true);
    PAN_PARACASSECON.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARACASSECON.SetQueryIMDB(PPQRY_PARAMETRI660, IMDBDef15.PQRY_PARAMETRI660_RS, IMDBDef6.TBL_PARAMETRI663);
    JustLoaded = true;
    PAN_PARACASSECON.SetFieldPrimaryIndex(PFL_PARACASSECON_ESERCIZIO, IMDBDef6.FLD_PARAMETRI663_PARAMESERCIZ);
    PAN_PARACASSECON.SetMasterTable(0, "PARAMETRI663");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARACASSECON.Status() == 2)
    {
      int oldListQBE = PAN_PARACASSECON.iUseListQBE;
      PAN_PARACASSECON.iUseListQBE = 0;
      PAN_PARACASSECON.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARACASSECON.PanelCommand(Glb.PCM_FIND);
      PAN_PARACASSECON.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DISDIVERCAEC_Init()
  {

    PAN_DISDIVERCAEC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISDIVERCAEC.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_DISDIVERCAEC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISDIVERCAEC_DISTCASSECON, "52BE7C9B-E518-4AB0-AC21-F31D1EC68AC9");
    PAN_DISDIVERCAEC.set_Header(MyGlb.OBJ_GROUP, GRP_DISDIVERCAEC_DISTCASSECON, "Distinta Cassa Economale");
    PAN_DISDIVERCAEC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISDIVERCAEC_DISTCASSECON, "");
    PAN_DISDIVERCAEC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISDIVERCAEC_DISTCASSECON, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISDIVERCAEC.SetRect(MyGlb.OBJ_GROUP, GRP_DISDIVERCAEC_DISTCASSECON, MyGlb.PANEL_LIST, 12, -9999, 180, 16, 0, 0);
    PAN_DISDIVERCAEC.SetRect(MyGlb.OBJ_GROUP, GRP_DISDIVERCAEC_DISTCASSECON, MyGlb.PANEL_FORM, 0, -21, 164, 73, 0, 0);
    PAN_DISDIVERCAEC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISDIVERCAEC_DISTCASSECON, 0, 144);
    PAN_DISDIVERCAEC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISDIVERCAEC_DISTCASSECON, 1, 13);
    PAN_DISDIVERCAEC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISDIVERCAEC_DISTCASSECON, 0, 4);
    PAN_DISDIVERCAEC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISDIVERCAEC_DISTCASSECON, 1, 4);
    PAN_DISDIVERCAEC.SetFlags(MyGlb.OBJ_GROUP, GRP_DISDIVERCAEC_DISTCASSECON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISDIVERCAEC.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_DISDIVERCAEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_NUMERODISTIN, "C0C6FDB5-7C53-4B38-8ED3-A9F2D87561A2");
    PAN_DISDIVERCAEC.set_Header(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_NUMERODISTIN, "Numero");
    PAN_DISDIVERCAEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_NUMERODISTIN, "");
    PAN_DISDIVERCAEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_DISDIVERCAEC.SetFlags(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_NUMERODISTIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISDIVERCAEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_ANNODISTINTA, "FA557988-7411-4084-83EA-F4629B775CB6");
    PAN_DISDIVERCAEC.set_Header(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_ANNODISTINTA, "Anno");
    PAN_DISDIVERCAEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_ANNODISTINTA, "");
    PAN_DISDIVERCAEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISDIVERCAEC.SetFlags(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_ANNODISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISDIVERCAEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATADA, "3C1E1235-F1BF-4770-BFC8-FC4EDEB6947C");
    PAN_DISDIVERCAEC.set_Header(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATADA, "Dal");
    PAN_DISDIVERCAEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATADA, "");
    PAN_DISDIVERCAEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATADA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISDIVERCAEC.SetFlags(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATADA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISDIVERCAEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATAA, "CC201103-F593-4797-BEFD-8A06D036E7CC");
    PAN_DISDIVERCAEC.set_Header(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATAA, "Al");
    PAN_DISDIVERCAEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATAA, "");
    PAN_DISDIVERCAEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATAA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISDIVERCAEC.SetFlags(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATAA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISDIVERCAEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_INCASSATA, "DA203111-EAC7-4831-AF11-75FA11B373C0");
    PAN_DISDIVERCAEC.set_Header(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_INCASSATA, "Incassata");
    PAN_DISDIVERCAEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_INCASSATA, "");
    PAN_DISDIVERCAEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_INCASSATA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISDIVERCAEC.SetFlags(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_INCASSATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISDIVERCAEC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISDIVERCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_NUMERODISTIN, MyGlb.PANEL_LIST, 12, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIVERCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_NUMERODISTIN, MyGlb.PANEL_LIST, 112);
    PAN_DISDIVERCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_DISDIVERCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_NUMERODISTIN, MyGlb.PANEL_LIST, "Numero");
    PAN_DISDIVERCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_NUMERODISTIN, MyGlb.PANEL_FORM, 4, 28, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIVERCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_NUMERODISTIN, MyGlb.PANEL_FORM, 112);
    PAN_DISDIVERCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_DISDIVERCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_NUMERODISTIN, MyGlb.PANEL_FORM, "Numero");
    PAN_DISDIVERCAEC.SetFieldPage(PFL_DISDIVERCAEC_NUMERODISTIN, -1, GRP_DISDIVERCAEC_DISTCASSECON);
    PAN_DISDIVERCAEC.SetFieldPanel(PFL_DISDIVERCAEC_NUMERODISTIN, PPQRY_DISTINTE, "A.NUMERO_DISTINTA", "BENDISVENUDI", 1, 6, 0, -13997);
    PAN_DISDIVERCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_ANNODISTINTA, MyGlb.PANEL_LIST, 124, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIVERCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_ANNODISTINTA, MyGlb.PANEL_LIST, 96);
    PAN_DISDIVERCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_DISDIVERCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_ANNODISTINTA, MyGlb.PANEL_LIST, "Anno");
    PAN_DISDIVERCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_ANNODISTINTA, MyGlb.PANEL_FORM, 4, 4, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIVERCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_ANNODISTINTA, MyGlb.PANEL_FORM, 96);
    PAN_DISDIVERCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_DISDIVERCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_ANNODISTINTA, MyGlb.PANEL_FORM, "Anno");
    PAN_DISDIVERCAEC.SetFieldPage(PFL_DISDIVERCAEC_ANNODISTINTA, -1, GRP_DISDIVERCAEC_DISTCASSECON);
    PAN_DISDIVERCAEC.SetFieldPanel(PFL_DISDIVERCAEC_ANNODISTINTA, PPQRY_DISTINTE, "A.ANNO_DISTINTA", "BENDISVEANDI", 1, 4, 0, -13997);
    PAN_DISDIVERCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATADA, MyGlb.PANEL_LIST, 192, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIVERCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATADA, MyGlb.PANEL_LIST, 60);
    PAN_DISDIVERCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATADA, MyGlb.PANEL_LIST, 1);
    PAN_DISDIVERCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATADA, MyGlb.PANEL_LIST, "Dal");
    PAN_DISDIVERCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATADA, MyGlb.PANEL_FORM, 4, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIVERCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATADA, MyGlb.PANEL_FORM, 60);
    PAN_DISDIVERCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATADA, MyGlb.PANEL_FORM, 1);
    PAN_DISDIVERCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATADA, MyGlb.PANEL_FORM, "Dal");
    PAN_DISDIVERCAEC.SetFieldPage(PFL_DISDIVERCAEC_DATADA, -1, -1);
    PAN_DISDIVERCAEC.SetFieldPanel(PFL_DISDIVERCAEC_DATADA, PPQRY_DISTINTE, "A.DATA_DA", "BENDISVEDADA", 6, 19, 0, -13997);
    PAN_DISDIVERCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATAA, MyGlb.PANEL_LIST, 276, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIVERCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATAA, MyGlb.PANEL_LIST, 52);
    PAN_DISDIVERCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATAA, MyGlb.PANEL_LIST, 1);
    PAN_DISDIVERCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATAA, MyGlb.PANEL_LIST, "Al");
    PAN_DISDIVERCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATAA, MyGlb.PANEL_FORM, 4, 76, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIVERCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATAA, MyGlb.PANEL_FORM, 52);
    PAN_DISDIVERCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATAA, MyGlb.PANEL_FORM, 1);
    PAN_DISDIVERCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_DATAA, MyGlb.PANEL_FORM, "Al");
    PAN_DISDIVERCAEC.SetFieldPage(PFL_DISDIVERCAEC_DATAA, -1, -1);
    PAN_DISDIVERCAEC.SetFieldPanel(PFL_DISDIVERCAEC_DATAA, PPQRY_DISTINTE, "A.DATA_A", "BENDISVERDAA", 6, 19, 0, -13997);
    PAN_DISDIVERCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_INCASSATA, MyGlb.PANEL_LIST, 356, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISDIVERCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_INCASSATA, MyGlb.PANEL_LIST, 60);
    PAN_DISDIVERCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_INCASSATA, MyGlb.PANEL_LIST, 1);
    PAN_DISDIVERCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_INCASSATA, MyGlb.PANEL_LIST, "Incassata");
    PAN_DISDIVERCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_INCASSATA, MyGlb.PANEL_FORM, 4, 100, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIVERCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_INCASSATA, MyGlb.PANEL_FORM, 60);
    PAN_DISDIVERCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_INCASSATA, MyGlb.PANEL_FORM, 1);
    PAN_DISDIVERCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIVERCAEC_INCASSATA, MyGlb.PANEL_FORM, "Incas.");
    PAN_DISDIVERCAEC.SetFieldPage(PFL_DISDIVERCAEC_INCASSATA, -1, -1);
    PAN_DISDIVERCAEC.SetFieldUnbound(PFL_DISDIVERCAEC_INCASSATA, true);
    PAN_DISDIVERCAEC.SetFieldPanel(PFL_DISDIVERCAEC_INCASSATA, PPQRY_DISTINTE, "DECODE(A.FLAG_LIQUIDATA, 'SI', DECODE(CHECK_DISTINTA_PRE(A.ANNO_DISTINTA,A.NUMERO_DISTINTA), 0, 'Completamente Incassata', 'Parzialmente Incassata'), 'Da Incassare')", "INCASSATA", 5, 99, 0, -13997);
  }

  private void PAN_DISDIVERCAEC_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISDIVERCAEC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DISDIVERCAEC.SetIMDB(IMDB, "PQRY_DISTINTE", true);
    PAN_DISDIVERCAEC.set_SetString(MyGlb.MASTER_ROWNAME, "BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_DISTINTA as BENDISVEANDI, ");
    SQL.append("  A.NUMERO_DISTINTA as BENDISVENUDI, ");
    SQL.append("  A.DATA_DA as BENDISVEDADA, ");
    SQL.append("  A.DATA_A as BENDISVERDAA, ");
    SQL.append("  DECODE(A.FLAG_LIQUIDATA, 'SI', DECODE(CHECK_DISTINTA_PRE(A.ANNO_DISTINTA,A.NUMERO_DISTINTA), 0, 'Completamente Incassata', 'Parzialmente Incassata'), 'Da Incassare') as INCASSATA ");
    PAN_DISDIVERCAEC.SetQuery(PPQRY_DISTINTE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DISTINTE_VERSAMENTI A ");
    PAN_DISDIVERCAEC.SetQuery(PPQRY_DISTINTE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_DISTINTA = ~~PQRY_PARAMETRI660.PARAMESERCIZ~~) ");
    PAN_DISDIVERCAEC.SetQuery(PPQRY_DISTINTE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISDIVERCAEC.SetQuery(PPQRY_DISTINTE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISDIVERCAEC.SetQuery(PPQRY_DISTINTE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_DISTINTA desc, ");
    SQL.append("  A.NUMERO_DISTINTA desc ");
    PAN_DISDIVERCAEC.SetQuery(PPQRY_DISTINTE, 5, SQL, -1, "");
    PAN_DISDIVERCAEC.SetQueryDB(PPQRY_DISTINTE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISDIVERCAEC.SetMasterTable(0, "DISTINTE_VERSAMENTI");
    PAN_DISDIVERCAEC.AddToSortList(PFL_DISDIVERCAEC_ANNODISTINTA, false);
    PAN_DISDIVERCAEC.AddToSortList(PFL_DISDIVERCAEC_NUMERODISTIN, false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISDIVERCAEC.Status() == 2)
    {
      int oldListQBE = PAN_DISDIVERCAEC.iUseListQBE;
      PAN_DISDIVERCAEC.iUseListQBE = 0;
      PAN_DISDIVERCAEC.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISDIVERCAEC.PanelCommand(Glb.PCM_FIND);
      PAN_DISDIVERCAEC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARACASSECON) PAN_PARACASSECON_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DISDIVERCAEC) PAN_DISDIVERCAEC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARACASSECON) PAN_PARACASSECON_ValidateRow(Cancel);
    if (SrcObj == PAN_DISDIVERCAEC) PAN_DISDIVERCAEC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARACASSECON) PAN_PARACASSECON_DynamicProperties();
    if (SrcObj == PAN_DISDIVERCAEC) PAN_DISDIVERCAEC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARACASSECON) PAN_PARACASSECON_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DISDIVERCAEC) PAN_DISDIVERCAEC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARACASSECON) PAN_PARACASSECON_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DISDIVERCAEC) PAN_DISDIVERCAEC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
