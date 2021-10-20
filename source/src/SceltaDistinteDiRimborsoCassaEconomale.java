// **********************************************
// Scelta Distinte Di Rimborso Cassa Economale
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaDistinteDiRimborsoCassaEconomale extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARACASSECON_ESERCIZIO = 0;

  private static int PPQRY_PARAMETRI662 = 0;

  private static int PPQRY_ESEFIN = 1;


  IDPanel PAN_PARACASSECON;
  private static int GRP_DISDIRIMCAEC_DISTCASSECON = 0;

  private static int PFL_DISDIRIMCAEC_NUMERODISTIN = 0;
  private static int PFL_DISDIRIMCAEC_ANNODISTINTA = 1;
  private static int PFL_DISDIRIMCAEC_DATADA = 2;
  private static int PFL_DISDIRIMCAEC_DATAA = 3;
  private static int PFL_DISDIRIMCAEC_LIQUIDATA = 4;

  private static int PPQRY_DISTINTE1 = 0;


  IDPanel PAN_DISDIRIMCAEC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI661(IMDB);
    //
    //
    Init_PQRY_PARAMETRI662(IMDB);
    Init_PQRY_PARAMETRI662_RS(IMDB);
    Init_PQRY_DISTINTE1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI661(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI661, 1);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI661, "TBL_PARAMETRI661");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI661,IMDBDef5.FLD_PARAMETRI661_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI661,IMDBDef5.FLD_PARAMETRI661_PARAMESERCIZ,1,4,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI661, 0);
  }

  private static void Init_PQRY_PARAMETRI662(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI662, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI662, "PQRY_PARAMETRI662");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI662,IMDBDef14.PQSL_PARAMETRI662_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI662,IMDBDef14.PQSL_PARAMETRI662_PARAMESERCIZ,1,4,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI662, 0);
  }

  private static void Init_PQRY_PARAMETRI662_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI662_RS, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI662_RS, "PQRY_PARAMETRI662_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI662_RS,IMDBDef14.PQSL_PARAMETRI662_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI662_RS,IMDBDef14.PQSL_PARAMETRI662_PARAMESERCIZ,1,4,0);
  }

  private static void Init_PQRY_DISTINTE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_DISTINTE1, 5);
    IMDB.set_TblCode(IMDBDef14.PQRY_DISTINTE1, "PQRY_DISTINTE1");
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINTE1,IMDBDef14.PQSL_DISTINTE1_BEDIRIRIANDI, "BEDIRIRIANDI");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINTE1,IMDBDef14.PQSL_DISTINTE1_BEDIRIRIANDI,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINTE1,IMDBDef14.PQSL_DISTINTE1_BEDIRIRINUDI, "BEDIRIRINUDI");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINTE1,IMDBDef14.PQSL_DISTINTE1_BEDIRIRINUDI,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINTE1,IMDBDef14.PQSL_DISTINTE1_BEDIRIRIDADA, "BEDIRIRIDADA");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINTE1,IMDBDef14.PQSL_DISTINTE1_BEDIRIRIDADA,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINTE1,IMDBDef14.PQSL_DISTINTE1_BENDIRIRIDAA, "BENDIRIRIDAA");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINTE1,IMDBDef14.PQSL_DISTINTE1_BENDIRIRIDAA,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_DISTINTE1,IMDBDef14.PQSL_DISTINTE1_LIQUIDATA, "LIQUIDATA");
    IMDB.SetFldParams(IMDBDef14.PQRY_DISTINTE1,IMDBDef14.PQSL_DISTINTE1_LIQUIDATA,5,99,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_DISTINTE1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaDistinteDiRimborsoCassaEconomale(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaDistinteDiRimborsoCassaEconomale()
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
    FormIdx = MyGlb.FRM_SCDIDIRICAEC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4C877A41-F8C7-4603-8147-F5304F37C5CB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 572;
    DesignHeight = 478;
    set_Caption(new IDVariant("Scelta Distinte Di Rimborso Cassa Economale"));
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
    PAN_PARACASSECON.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1D40B88B-E582-4F45-9B60-94CE1928DF35");
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
    Frames[3].Caption = "Distinte di Rimborso Cassa Economale";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 404;
    PAN_DISDIRIMCAEC = new IDPanel(w, this, 3, "PAN_DISDIRIMCAEC");
    Frames[3].Content = PAN_DISDIRIMCAEC;
    PAN_DISDIRIMCAEC.ShowRowSelector = false;
    PAN_DISDIRIMCAEC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISDIRIMCAEC.VS = MainFrm.VisualStyleList;
    PAN_DISDIRIMCAEC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 572-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DISDIRIMCAEC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "56D7CF7C-77EF-421C-83FC-1883ED6E8B86");
    PAN_DISDIRIMCAEC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 12, 0, 524, 316, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIRIMCAEC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISDIRIMCAEC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISDIRIMCAEC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISDIRIMCAEC.InitStatus = 1;
    PAN_DISDIRIMCAEC_Init();
    PAN_DISDIRIMCAEC_InitFields();
    PAN_DISDIRIMCAEC_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI661, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCDIDIRICAEC_PARAMETRI662();
      }
      PAN_PARACASSECON.UpdatePanel(MainFrm);
      PAN_DISDIRIMCAEC.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaDistinteDiRimborsoCassaEconomale);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaDistinteDiRimborsoCassaEconomale.class.getName() : (Glb.ClassWithPackage(SceltaDistinteDiRimborsoCassaEconomale.class) ? SceltaDistinteDiRimborsoCassaEconomale.class.getName().substring(SceltaDistinteDiRimborsoCassaEconomale.class.getPackage().getName().length() + 1) : SceltaDistinteDiRimborsoCassaEconomale.class.getName()));
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
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI661, IMDBDef5.FLD_PARAMETRI661_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDistinteDiRimborsoCassaEconomale", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void SCDIDIRICAEC_PARAMETRI662() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI662_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI661, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI661, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI662_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI662_RS, 0, IMDBDef5.TBL_PARAMETRI661, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI662_RS, 0, 0, IMDBDef5.TBL_PARAMETRI661, IMDBDef5.FLD_PARAMETRI661_PARAMESERCIZ, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI661, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI661, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI661, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI662_RS, 0);
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
  private void PAN_DISDIRIMCAEC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISDIRIMCAEC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISDIRIMCAEC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISDIRIMCAEC, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISDIRIMCAEC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DISDIRIMCAEC);
    // Stub
  }

  private void PAN_DISDIRIMCAEC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DISDIRIMCAEC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISDIRIMCAEC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISDIRIMCAEC_IntValidateRow(Cancel);
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
    PAN_PARACASSECON.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARACASSECON_ESERCIZIO, "DE5E62B7-8084-44D3-8CE8-CF658DFD7B27");
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
    PAN_PARACASSECON.SetFieldPanel(PFL_PARACASSECON_ESERCIZIO, PPQRY_PARAMETRI662, "A.PARAMESERCIZ", "PARAMESERCIZ", 1, 4, 0, -13997);
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
    PAN_PARACASSECON.SetIMDB(IMDB, "PQRY_PARAMETRI662", true);
    PAN_PARACASSECON.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARACASSECON.SetQueryIMDB(PPQRY_PARAMETRI662, IMDBDef14.PQRY_PARAMETRI662_RS, IMDBDef5.TBL_PARAMETRI661);
    JustLoaded = true;
    PAN_PARACASSECON.SetFieldPrimaryIndex(PFL_PARACASSECON_ESERCIZIO, IMDBDef5.FLD_PARAMETRI661_PARAMESERCIZ);
    PAN_PARACASSECON.SetMasterTable(0, "PARAMETRI661");
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

  private void PAN_DISDIRIMCAEC_Init()
  {

    PAN_DISDIRIMCAEC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISDIRIMCAEC.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_DISDIRIMCAEC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISDIRIMCAEC_DISTCASSECON, "5C054CF9-CEC6-4C27-8DF4-FBF63D80A56A");
    PAN_DISDIRIMCAEC.set_Header(MyGlb.OBJ_GROUP, GRP_DISDIRIMCAEC_DISTCASSECON, "Distinta Cassa Economale");
    PAN_DISDIRIMCAEC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISDIRIMCAEC_DISTCASSECON, "");
    PAN_DISDIRIMCAEC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISDIRIMCAEC_DISTCASSECON, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISDIRIMCAEC.SetRect(MyGlb.OBJ_GROUP, GRP_DISDIRIMCAEC_DISTCASSECON, MyGlb.PANEL_LIST, 12, -9999, 180, 16, 0, 0);
    PAN_DISDIRIMCAEC.SetRect(MyGlb.OBJ_GROUP, GRP_DISDIRIMCAEC_DISTCASSECON, MyGlb.PANEL_FORM, 0, -21, 164, 73, 0, 0);
    PAN_DISDIRIMCAEC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISDIRIMCAEC_DISTCASSECON, 0, 144);
    PAN_DISDIRIMCAEC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISDIRIMCAEC_DISTCASSECON, 1, 13);
    PAN_DISDIRIMCAEC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISDIRIMCAEC_DISTCASSECON, 0, 4);
    PAN_DISDIRIMCAEC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISDIRIMCAEC_DISTCASSECON, 1, 4);
    PAN_DISDIRIMCAEC.SetFlags(MyGlb.OBJ_GROUP, GRP_DISDIRIMCAEC_DISTCASSECON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISDIRIMCAEC.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_DISDIRIMCAEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_NUMERODISTIN, "052297BC-9029-41E3-A8F5-DE929D3B4254");
    PAN_DISDIRIMCAEC.set_Header(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_NUMERODISTIN, "Numero");
    PAN_DISDIRIMCAEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_NUMERODISTIN, "");
    PAN_DISDIRIMCAEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_DISDIRIMCAEC.SetFlags(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_NUMERODISTIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DISDIRIMCAEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_ANNODISTINTA, "9459474B-63ED-4268-92C4-8D364CAF5EDF");
    PAN_DISDIRIMCAEC.set_Header(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_ANNODISTINTA, "Anno");
    PAN_DISDIRIMCAEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_ANNODISTINTA, "");
    PAN_DISDIRIMCAEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISDIRIMCAEC.SetFlags(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_ANNODISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DISDIRIMCAEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATADA, "578677C1-6AC6-4E57-8AD3-1E761E86532C");
    PAN_DISDIRIMCAEC.set_Header(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATADA, "Dal");
    PAN_DISDIRIMCAEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATADA, "");
    PAN_DISDIRIMCAEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATADA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISDIRIMCAEC.SetFlags(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATADA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISDIRIMCAEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATAA, "FBF791F4-EAFC-4A71-88AB-64305FA84238");
    PAN_DISDIRIMCAEC.set_Header(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATAA, "Al");
    PAN_DISDIRIMCAEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATAA, "");
    PAN_DISDIRIMCAEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATAA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISDIRIMCAEC.SetFlags(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATAA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISDIRIMCAEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_LIQUIDATA, "D8B1732B-09E3-49D1-A0CE-7ECB0F8B2DD3");
    PAN_DISDIRIMCAEC.set_Header(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_LIQUIDATA, "Liquidata");
    PAN_DISDIRIMCAEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_LIQUIDATA, "");
    PAN_DISDIRIMCAEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_LIQUIDATA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISDIRIMCAEC.SetFlags(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_LIQUIDATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISDIRIMCAEC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISDIRIMCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_NUMERODISTIN, MyGlb.PANEL_LIST, 12, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIRIMCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_NUMERODISTIN, MyGlb.PANEL_LIST, 112);
    PAN_DISDIRIMCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_DISDIRIMCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_NUMERODISTIN, MyGlb.PANEL_LIST, "Numero");
    PAN_DISDIRIMCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_NUMERODISTIN, MyGlb.PANEL_FORM, 4, 28, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIRIMCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_NUMERODISTIN, MyGlb.PANEL_FORM, 112);
    PAN_DISDIRIMCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_DISDIRIMCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_NUMERODISTIN, MyGlb.PANEL_FORM, "Numero");
    PAN_DISDIRIMCAEC.SetFieldPage(PFL_DISDIRIMCAEC_NUMERODISTIN, -1, GRP_DISDIRIMCAEC_DISTCASSECON);
    PAN_DISDIRIMCAEC.SetFieldPanel(PFL_DISDIRIMCAEC_NUMERODISTIN, PPQRY_DISTINTE1, "A.NUMERO_DISTINTA", "BEDIRIRINUDI", 1, 6, 0, -13997);
    PAN_DISDIRIMCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_ANNODISTINTA, MyGlb.PANEL_LIST, 124, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIRIMCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_ANNODISTINTA, MyGlb.PANEL_LIST, 96);
    PAN_DISDIRIMCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_DISDIRIMCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_ANNODISTINTA, MyGlb.PANEL_LIST, "Anno");
    PAN_DISDIRIMCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_ANNODISTINTA, MyGlb.PANEL_FORM, 4, 4, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIRIMCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_ANNODISTINTA, MyGlb.PANEL_FORM, 96);
    PAN_DISDIRIMCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_DISDIRIMCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_ANNODISTINTA, MyGlb.PANEL_FORM, "Anno");
    PAN_DISDIRIMCAEC.SetFieldPage(PFL_DISDIRIMCAEC_ANNODISTINTA, -1, GRP_DISDIRIMCAEC_DISTCASSECON);
    PAN_DISDIRIMCAEC.SetFieldPanel(PFL_DISDIRIMCAEC_ANNODISTINTA, PPQRY_DISTINTE1, "A.ANNO_DISTINTA", "BEDIRIRIANDI", 1, 4, 0, -13997);
    PAN_DISDIRIMCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATADA, MyGlb.PANEL_LIST, 192, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIRIMCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATADA, MyGlb.PANEL_LIST, 60);
    PAN_DISDIRIMCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATADA, MyGlb.PANEL_LIST, 1);
    PAN_DISDIRIMCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATADA, MyGlb.PANEL_LIST, "Dal");
    PAN_DISDIRIMCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATADA, MyGlb.PANEL_FORM, 4, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIRIMCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATADA, MyGlb.PANEL_FORM, 60);
    PAN_DISDIRIMCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATADA, MyGlb.PANEL_FORM, 1);
    PAN_DISDIRIMCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATADA, MyGlb.PANEL_FORM, "Dal");
    PAN_DISDIRIMCAEC.SetFieldPage(PFL_DISDIRIMCAEC_DATADA, -1, -1);
    PAN_DISDIRIMCAEC.SetFieldPanel(PFL_DISDIRIMCAEC_DATADA, PPQRY_DISTINTE1, "A.DATA_DA", "BEDIRIRIDADA", 6, 19, 0, -13997);
    PAN_DISDIRIMCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATAA, MyGlb.PANEL_LIST, 276, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIRIMCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATAA, MyGlb.PANEL_LIST, 52);
    PAN_DISDIRIMCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATAA, MyGlb.PANEL_LIST, 1);
    PAN_DISDIRIMCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATAA, MyGlb.PANEL_LIST, "Al");
    PAN_DISDIRIMCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATAA, MyGlb.PANEL_FORM, 4, 76, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIRIMCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATAA, MyGlb.PANEL_FORM, 52);
    PAN_DISDIRIMCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATAA, MyGlb.PANEL_FORM, 1);
    PAN_DISDIRIMCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_DATAA, MyGlb.PANEL_FORM, "Al");
    PAN_DISDIRIMCAEC.SetFieldPage(PFL_DISDIRIMCAEC_DATAA, -1, -1);
    PAN_DISDIRIMCAEC.SetFieldPanel(PFL_DISDIRIMCAEC_DATAA, PPQRY_DISTINTE1, "A.DATA_A", "BENDIRIRIDAA", 6, 19, 0, -13997);
    PAN_DISDIRIMCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_LIQUIDATA, MyGlb.PANEL_LIST, 356, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISDIRIMCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_LIQUIDATA, MyGlb.PANEL_LIST, 60);
    PAN_DISDIRIMCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_LIQUIDATA, MyGlb.PANEL_LIST, 1);
    PAN_DISDIRIMCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_LIQUIDATA, MyGlb.PANEL_LIST, "Liquidata");
    PAN_DISDIRIMCAEC.SetRect(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_LIQUIDATA, MyGlb.PANEL_FORM, 4, 100, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISDIRIMCAEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_LIQUIDATA, MyGlb.PANEL_FORM, 60);
    PAN_DISDIRIMCAEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_LIQUIDATA, MyGlb.PANEL_FORM, 1);
    PAN_DISDIRIMCAEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISDIRIMCAEC_LIQUIDATA, MyGlb.PANEL_FORM, "Liquidata");
    PAN_DISDIRIMCAEC.SetFieldPage(PFL_DISDIRIMCAEC_LIQUIDATA, -1, -1);
    PAN_DISDIRIMCAEC.SetFieldUnbound(PFL_DISDIRIMCAEC_LIQUIDATA, true);
    PAN_DISDIRIMCAEC.SetFieldPanel(PFL_DISDIRIMCAEC_LIQUIDATA, PPQRY_DISTINTE1, "DECODE(A.FLAG_LIQUIDATA, 'SI', DECODE(CHECK_DISTINTA_LIQ(A.ANNO_DISTINTA,A.NUMERO_DISTINTA), 0, 'Completamente Liquidata', 'Parzialmente Liquidata'), 'Da Liquidare')", "LIQUIDATA", 5, 99, 0, -13997);
  }

  private void PAN_DISDIRIMCAEC_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISDIRIMCAEC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DISDIRIMCAEC.SetIMDB(IMDB, "PQRY_DISTINTE1", true);
    PAN_DISDIRIMCAEC.set_SetString(MyGlb.MASTER_ROWNAME, "BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_DISTINTA as BEDIRIRIANDI, ");
    SQL.append("  A.NUMERO_DISTINTA as BEDIRIRINUDI, ");
    SQL.append("  A.DATA_DA as BEDIRIRIDADA, ");
    SQL.append("  A.DATA_A as BENDIRIRIDAA, ");
    SQL.append("  DECODE(A.FLAG_LIQUIDATA, 'SI', DECODE(CHECK_DISTINTA_LIQ(A.ANNO_DISTINTA,A.NUMERO_DISTINTA), 0, 'Completamente Liquidata', 'Parzialmente Liquidata'), 'Da Liquidare') as LIQUIDATA ");
    PAN_DISDIRIMCAEC.SetQuery(PPQRY_DISTINTE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DISTINTE_RIC_RIMBORSO A ");
    PAN_DISDIRIMCAEC.SetQuery(PPQRY_DISTINTE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_DISTINTA = ~~PQRY_PARAMETRI662.PARAMESERCIZ~~) ");
    PAN_DISDIRIMCAEC.SetQuery(PPQRY_DISTINTE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISDIRIMCAEC.SetQuery(PPQRY_DISTINTE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISDIRIMCAEC.SetQuery(PPQRY_DISTINTE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_DISTINTA desc, ");
    SQL.append("  A.NUMERO_DISTINTA desc ");
    PAN_DISDIRIMCAEC.SetQuery(PPQRY_DISTINTE1, 5, SQL, -1, "");
    PAN_DISDIRIMCAEC.SetQueryDB(PPQRY_DISTINTE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISDIRIMCAEC.SetMasterTable(0, "DISTINTE_RIC_RIMBORSO");
    PAN_DISDIRIMCAEC.AddToSortList(PFL_DISDIRIMCAEC_ANNODISTINTA, false);
    PAN_DISDIRIMCAEC.AddToSortList(PFL_DISDIRIMCAEC_NUMERODISTIN, false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISDIRIMCAEC.Status() == 2)
    {
      int oldListQBE = PAN_DISDIRIMCAEC.iUseListQBE;
      PAN_DISDIRIMCAEC.iUseListQBE = 0;
      PAN_DISDIRIMCAEC.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISDIRIMCAEC.PanelCommand(Glb.PCM_FIND);
      PAN_DISDIRIMCAEC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARACASSECON) PAN_PARACASSECON_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DISDIRIMCAEC) PAN_DISDIRIMCAEC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARACASSECON) PAN_PARACASSECON_ValidateRow(Cancel);
    if (SrcObj == PAN_DISDIRIMCAEC) PAN_DISDIRIMCAEC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARACASSECON) PAN_PARACASSECON_DynamicProperties();
    if (SrcObj == PAN_DISDIRIMCAEC) PAN_DISDIRIMCAEC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARACASSECON) PAN_PARACASSECON_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DISDIRIMCAEC) PAN_DISDIRIMCAEC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DISDIRIMCAEC) PAN_DISDIRIMCAEC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
