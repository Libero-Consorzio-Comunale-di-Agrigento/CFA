// **********************************************
// Elenco Mandati In Distinta
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoMandatiInDistinta extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ELENMANINDIS_NUMEROMAND = 0;
  private static int PFL_ELENMANINDIS_DDATAMAND = 1;
  private static int PFL_ELENMANINDIS_INFOMANDATO = 2;
  private static int PFL_ELENMANINDIS_DATAELENCO = 3;
  private static int PFL_ELENMANINDIS_IMPORTO = 4;
  private static int PFL_ELENMANINDIS_MANDATO = 5;
  private static int PFL_ELENMANINDIS_ANNOMAND = 6;

  private static int PPQRY_MAN5 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_ELENMANINDIS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_MAN5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_MAN5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_MAN5, 5);
    IMDB.set_TblCode(IMDBDef14.PQRY_MAN5, "PQRY_MAN5");
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN5,IMDBDef14.PQSL_MAN5_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN5,IMDBDef14.PQSL_MAN5_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN5,IMDBDef14.PQSL_MAN5_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN5,IMDBDef14.PQSL_MAN5_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN5,IMDBDef14.PQSL_MAN5_D_DATA_MAND, "D_DATA_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN5,IMDBDef14.PQSL_MAN5_D_DATA_MAND,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN5,IMDBDef14.PQSL_MAN5_D_DATA_ELENCO, "D_DATA_ELENCO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN5,IMDBDef14.PQSL_MAN5_D_DATA_ELENCO,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN5,IMDBDef14.PQSL_MAN5_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN5,IMDBDef14.PQSL_MAN5_IMPORTO,3,14,2);
    IMDB.TblAddNew(IMDBDef14.PQRY_MAN5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoMandatiInDistinta(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoMandatiInDistinta()
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
    FormIdx = MyGlb.FRM_ELENMANINDIS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C33440EF-4BB9-4891-AE23-5D547E493D44";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 528;
    DesignHeight = 338;
    set_Caption(new IDVariant("Elenco Mandati In Distinta"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 528;
    Frames[1].Height = 312;
    Frames[1].Caption = "Elenco Mandati In Distinta";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 312;
    PAN_ELENMANINDIS = new IDPanel(w, this, 1, "PAN_ELENMANINDIS");
    Frames[1].Content = PAN_ELENMANINDIS;
    PAN_ELENMANINDIS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENMANINDIS.VS = MainFrm.VisualStyleList;
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 528-MyGlb.PAN_OFFS_X, 312-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENMANINDIS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "561F9F07-DCAF-42AC-857F-B7826EEF889E");
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 288, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENMANINDIS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENMANINDIS.InitStatus = 2;
    PAN_ELENMANINDIS_Init();
    PAN_ELENMANINDIS_InitFields();
    PAN_ELENMANINDIS_InitQueries();
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
      PAN_ELENMANINDIS.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoMandatiInDistinta);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoMandatiInDistinta.class.getName() : (Glb.ClassWithPackage(ElencoMandatiInDistinta.class) ? ElencoMandatiInDistinta.class.getName().substring(ElencoMandatiInDistinta.class.getPackage().getName().length() + 1) : ElencoMandatiInDistinta.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Info Mandato
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoMandato ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Mandato Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMANNMAN, 0, IMDB.Value(IMDBDef14.PQRY_MAN5, IMDBDef14.PQSL_MAN5_ANNO_MAND, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMNUMMAN, 0, IMDB.Value(IMDBDef14.PQRY_MAN5, IMDBDef14.PQSL_MAN5_NUMERO_MAND, 0));
      MainFrm.Show(MyGlb.FRM_INFORMMANDAT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoMandatiInDistinta", "InfoMandato", _e);
      return -1;
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
  private void PAN_ELENMANINDIS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENMANINDIS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENMANINDIS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENMANINDIS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENMANINDIS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ELENMANINDIS);
    // Stub
  }

  private void PAN_ELENMANINDIS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENMANINDIS_INFOMANDATO)
    {
      this.IdxPanelActived = this.PAN_ELENMANINDIS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoMandato();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENMANINDIS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENMANINDIS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN5, IMDBDef14.PQSL_MAN5_D_DATA_MAND, 0)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_MAN5, IMDBDef14.PQSL_MAN5_D_DATA_MAND, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_ELENMANINDIS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENMANINDIS_Init()
  {

    PAN_ELENMANINDIS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENMANINDIS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELENMANINDIS.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_ELENMANINDIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_NUMEROMAND, "A1EBEF20-617C-4664-9678-DC818A6FF73A");
    PAN_ELENMANINDIS.set_Header(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_NUMEROMAND, "NUMERO MAND");
    PAN_ELENMANINDIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_NUMEROMAND, "");
    PAN_ELENMANINDIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENMANINDIS.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_NUMEROMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ELENMANINDIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DDATAMAND, "7C71F86D-A5B5-468E-9AC1-4A4E3921FA1F");
    PAN_ELENMANINDIS.set_Header(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DDATAMAND, "D DATA MAND");
    PAN_ELENMANINDIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DDATAMAND, "");
    PAN_ELENMANINDIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DDATAMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENMANINDIS.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DDATAMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENMANINDIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_INFOMANDATO, "2B405BFD-279B-4298-99EE-3872290F4E06");
    PAN_ELENMANINDIS.set_Header(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_INFOMANDATO, "Info Mandato");
    PAN_ELENMANINDIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_INFOMANDATO, "");
    PAN_ELENMANINDIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_INFOMANDATO, MyGlb.VIS_HYPLINIMLOU1);
    PAN_ELENMANINDIS.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_INFOMANDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENMANINDIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DATAELENCO, "093C8145-64DB-4F15-A0B3-9A44EB17F355");
    PAN_ELENMANINDIS.set_Header(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DATAELENCO, "Data Elenco");
    PAN_ELENMANINDIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DATAELENCO, "");
    PAN_ELENMANINDIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DATAELENCO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENMANINDIS.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DATAELENCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENMANINDIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_IMPORTO, "848D1F13-2F31-4378-973B-34941DB3A3B2");
    PAN_ELENMANINDIS.set_Header(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_IMPORTO, "Importo");
    PAN_ELENMANINDIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_IMPORTO, "");
    PAN_ELENMANINDIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENMANINDIS.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENMANINDIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_MANDATO, "8C4D1871-D4E0-4A03-B5C9-9855C31E658E");
    PAN_ELENMANINDIS.set_Header(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_MANDATO, "Mandato");
    PAN_ELENMANINDIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_MANDATO, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENMANINDIS.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_MANDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENMANINDIS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_ANNOMAND, "A06B052B-AAF1-47FD-893E-96D0768D25C0");
    PAN_ELENMANINDIS.set_Header(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_ANNOMAND, "ANNO MAND");
    PAN_ELENMANINDIS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_ANNOMAND, "");
    PAN_ELENMANINDIS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_ANNOMAND, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ELENMANINDIS.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_ANNOMAND, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_ELENMANINDIS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_NUMEROMAND, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_ELENMANINDIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_ELENMANINDIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_NUMEROMAND, MyGlb.PANEL_LIST, "NUM. MAND");
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_NUMEROMAND, MyGlb.PANEL_FORM, 4, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_NUMEROMAND, MyGlb.PANEL_FORM, 96);
    PAN_ELENMANINDIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_ELENMANINDIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_NUMEROMAND, MyGlb.PANEL_FORM, "NUMERO MAND");
    PAN_ELENMANINDIS.SetFieldPage(PFL_ELENMANINDIS_NUMEROMAND, -1, -1);
    PAN_ELENMANINDIS.SetFieldPanel(PFL_ELENMANINDIS_NUMEROMAND, PPQRY_MAN5, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DDATAMAND, MyGlb.PANEL_LIST, 44, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DDATAMAND, MyGlb.PANEL_LIST, 80);
    PAN_ELENMANINDIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DDATAMAND, MyGlb.PANEL_LIST, 1);
    PAN_ELENMANINDIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DDATAMAND, MyGlb.PANEL_LIST, "D DATA MAND");
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DDATAMAND, MyGlb.PANEL_FORM, 4, 100, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DDATAMAND, MyGlb.PANEL_FORM, 96);
    PAN_ELENMANINDIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DDATAMAND, MyGlb.PANEL_FORM, 1);
    PAN_ELENMANINDIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DDATAMAND, MyGlb.PANEL_FORM, "D DATA MAND");
    PAN_ELENMANINDIS.SetFieldPage(PFL_ELENMANINDIS_DDATAMAND, -1, -1);
    PAN_ELENMANINDIS.SetFieldPanel(PFL_ELENMANINDIS_DDATAMAND, PPQRY_MAN5, "A.D_DATA_MAND", "D_DATA_MAND", 6, 19, 0, -13997);
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_INFOMANDATO, MyGlb.PANEL_LIST, 112, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_INFOMANDATO, MyGlb.PANEL_LIST, 120);
    PAN_ELENMANINDIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_INFOMANDATO, MyGlb.PANEL_LIST, 1);
    PAN_ELENMANINDIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_INFOMANDATO, MyGlb.PANEL_LIST, "I. M.");
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_INFOMANDATO, MyGlb.PANEL_FORM, 4, 220, 552, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_INFOMANDATO, MyGlb.PANEL_FORM, 120);
    PAN_ELENMANINDIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_INFOMANDATO, MyGlb.PANEL_FORM, 2);
    PAN_ELENMANINDIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_INFOMANDATO, MyGlb.PANEL_FORM, "Info Mandato");
    PAN_ELENMANINDIS.SetFieldPage(PFL_ELENMANINDIS_INFOMANDATO, -1, -1);
    PAN_ELENMANINDIS.SetFieldPanel(PFL_ELENMANINDIS_INFOMANDATO, PPQRY_DUAL, "DECODE(~~NUMERO_MAND~~, to_number(NULL), NULL, 'I')", "INFOMANDATO", 5, 99, 0, -13997);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENMANINDIS.SetValueListItem(PFL_ELENMANINDIS_INFOMANDATO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DATAELENCO, MyGlb.PANEL_LIST, 136, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DATAELENCO, MyGlb.PANEL_LIST, 88);
    PAN_ELENMANINDIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DATAELENCO, MyGlb.PANEL_LIST, 1);
    PAN_ELENMANINDIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DATAELENCO, MyGlb.PANEL_LIST, "Data Elenco");
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DATAELENCO, MyGlb.PANEL_FORM, 156, 148, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DATAELENCO, MyGlb.PANEL_FORM, 104);
    PAN_ELENMANINDIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DATAELENCO, MyGlb.PANEL_FORM, 1);
    PAN_ELENMANINDIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_DATAELENCO, MyGlb.PANEL_FORM, "Data Elenco");
    PAN_ELENMANINDIS.SetFieldPage(PFL_ELENMANINDIS_DATAELENCO, -1, -1);
    PAN_ELENMANINDIS.SetFieldPanel(PFL_ELENMANINDIS_DATAELENCO, PPQRY_MAN5, "A.D_DATA_ELENCO", "D_DATA_ELENCO", 6, 19, 0, -13997);
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_IMPORTO, MyGlb.PANEL_LIST, 204, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_ELENMANINDIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENMANINDIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_IMPORTO, MyGlb.PANEL_FORM, 372, 148, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_IMPORTO, MyGlb.PANEL_FORM, 72);
    PAN_ELENMANINDIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENMANINDIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ELENMANINDIS.SetFieldPage(PFL_ELENMANINDIS_IMPORTO, -1, -1);
    PAN_ELENMANINDIS.SetFieldPanel(PFL_ELENMANINDIS_IMPORTO, PPQRY_MAN5, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_MANDATO, MyGlb.PANEL_LIST, 0, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_MANDATO, MyGlb.PANEL_LIST, 0);
    PAN_ELENMANINDIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_MANDATO, MyGlb.PANEL_LIST, 2);
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_MANDATO, MyGlb.PANEL_FORM, 0, 0, 112, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_MANDATO, MyGlb.PANEL_FORM, 0);
    PAN_ELENMANINDIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_MANDATO, MyGlb.PANEL_FORM, 2);
    PAN_ELENMANINDIS.SetFieldPage(PFL_ELENMANINDIS_MANDATO, -1, -1);
    PAN_ELENMANINDIS.SetFieldPanel(PFL_ELENMANINDIS_MANDATO, -1, "", "MANDATO", 0, 0, 0, -13997);
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_ANNOMAND, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_ELENMANINDIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_ELENMANINDIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_ANNOMAND, MyGlb.PANEL_LIST, "ANNO MAND");
    PAN_ELENMANINDIS.SetRect(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_ANNOMAND, MyGlb.PANEL_FORM, 4, 220, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENMANINDIS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_ELENMANINDIS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_ELENMANINDIS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENMANINDIS_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_ELENMANINDIS.SetFieldPage(PFL_ELENMANINDIS_ANNOMAND, -1, -1);
    PAN_ELENMANINDIS.SetFieldPanel(PFL_ELENMANINDIS_ANNOMAND, PPQRY_MAN5, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
  }

  private void PAN_ELENMANINDIS_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENMANINDIS.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~NUMERO_MAND~~, to_number(NULL), NULL, 'I') as INFOMANDATO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_ELENMANINDIS.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_ELENMANINDIS.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENMANINDIS.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_ELENMANINDIS.SetIMDB(IMDB, "PQRY_MAN5", true);
    PAN_ELENMANINDIS.set_SetString(MyGlb.MASTER_ROWNAME, "MAN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  A.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  A.D_DATA_MAND as D_DATA_MAND, ");
    SQL.append("  A.D_DATA_ELENCO as D_DATA_ELENCO, ");
    SQL.append("  A.IMPORTO as IMPORTO ");
    PAN_ELENMANINDIS.SetQuery(PPQRY_MAN5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  MAN A ");
    PAN_ELENMANINDIS.SetQuery(PPQRY_MAN5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_ELENCO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.NUMERO_ELENCO = ~~PQRY_PARAMETRI293.ROWNAMENUMER~~) ");
    PAN_ELENMANINDIS.SetQuery(PPQRY_MAN5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENMANINDIS.SetQuery(PPQRY_MAN5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENMANINDIS.SetQuery(PPQRY_MAN5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENMANINDIS.SetQuery(PPQRY_MAN5, 5, SQL, -1, "");
    PAN_ELENMANINDIS.SetQueryDB(PPQRY_MAN5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENMANINDIS.SetMasterTable(0, "MAN");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENMANINDIS.Status() == 2)
    {
      int oldListQBE = PAN_ELENMANINDIS.iUseListQBE;
      PAN_ELENMANINDIS.iUseListQBE = 0;
      PAN_ELENMANINDIS.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENMANINDIS.PanelCommand(Glb.PCM_FIND);
      PAN_ELENMANINDIS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENMANINDIS) PAN_ELENMANINDIS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENMANINDIS) PAN_ELENMANINDIS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENMANINDIS) PAN_ELENMANINDIS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENMANINDIS) PAN_ELENMANINDIS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENMANINDIS) PAN_ELENMANINDIS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
