// **********************************************
// Aggiornamento Automatico Impegni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornamentoAutomaticoImpegni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_AGGIAUTOIMPE_NEWGROUP = 0;

  private static int PFL_AGGIAUTOIMPE_DATALIQUSTIP = 0;
  private static int PFL_AGGIAUTOIMPE_NEWPANELABE1 = 1;
  private static int PFL_AGGIAUTOIMPE_ELABORBUTTON = 2;

  private static int PPQRY_NEWTABLE31 = 0;


  IDPanel PAN_AGGIAUTOIMPE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE33(IMDB);
    //
    //
    Init_PQRY_NEWTABLE31(IMDB);
    Init_PQRY_NEWTABLE31_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE33(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_NEWTABLE33, 1);
    IMDB.set_TblCode(IMDBDef5.TBL_NEWTABLE33, "TBL_NEWTABLE33");
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE33,IMDBDef5.FLD_NEWTABLE33_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE33,IMDBDef5.FLD_NEWTABLE33_ROWNAMEDATA,6,49,0);
    IMDB.TblAddNew(IMDBDef5.TBL_NEWTABLE33, 0);
  }

  private static void Init_PQRY_NEWTABLE31(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_NEWTABLE31, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_NEWTABLE31, "PQRY_NEWTABLE31");
    IMDB.set_FldCode(IMDBDef14.PQRY_NEWTABLE31,IMDBDef14.PQSL_NEWTABLE31_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef14.PQRY_NEWTABLE31,IMDBDef14.PQSL_NEWTABLE31_ROWNAMEDATA,6,49,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_NEWTABLE31, 0);
  }

  private static void Init_PQRY_NEWTABLE31_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_NEWTABLE31_RS, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_NEWTABLE31_RS, "PQRY_NEWTABLE31_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_NEWTABLE31_RS,IMDBDef14.PQSL_NEWTABLE31_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef14.PQRY_NEWTABLE31_RS,IMDBDef14.PQSL_NEWTABLE31_ROWNAMEDATA,6,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornamentoAutomaticoImpegni(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornamentoAutomaticoImpegni()
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
    FormIdx = MyGlb.FRM_AGGIAUTOIMPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5386A12A-FD53-4406-BD93-C0535D93EA9B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 324;
    DesignHeight = 154;
    set_Caption(new IDVariant("Aggiornamento Automatico Impegni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 324;
    Frames[1].Height = 128;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Aggiornamento Automatico Impegni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 128;
    PAN_AGGIAUTOIMPE = new IDPanel(w, this, 1, "PAN_AGGIAUTOIMPE");
    Frames[1].Content = PAN_AGGIAUTOIMPE;
    PAN_AGGIAUTOIMPE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_AGGIAUTOIMPE.VS = MainFrm.VisualStyleList;
    PAN_AGGIAUTOIMPE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 324-MyGlb.PAN_OFFS_X, 128-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_AGGIAUTOIMPE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4E0D15E9-8B74-4665-A551-CD7DE0A3626F");
    PAN_AGGIAUTOIMPE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 400, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOIMPE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_AGGIAUTOIMPE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_AGGIAUTOIMPE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_AGGIAUTOIMPE.InitStatus = 2;
    PAN_AGGIAUTOIMPE_Init();
    PAN_AGGIAUTOIMPE_InitFields();
    PAN_AGGIAUTOIMPE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_NEWTABLE33, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGIAUTOIMPE_NEWTABLE31();
      }
      PAN_AGGIAUTOIMPE.UpdatePanel(MainFrm);
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
    return (obj instanceof AggiornamentoAutomaticoImpegni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornamentoAutomaticoImpegni.class.getName() : (Glb.ClassWithPackage(AggiornamentoAutomaticoImpegni.class) ? AggiornamentoAutomaticoImpegni.class.getName().substring(AggiornamentoAutomaticoImpegni.class.getPackage().getName().length() + 1) : AggiornamentoAutomaticoImpegni.class.getName()));
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Aggiornamento Automatico Impegni", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE33, IMDBDef5.FLD_NEWTABLE33_ROWNAMEDATA, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoImpegni", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_AGGIORNATE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.IMPACCAGGAUTO((new IDVariant("S")), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_NEWTABLE31, IMDBDef14.PQSL_NEWTABLE31_ROWNAMEDATA, 0)), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_AGGIORNATE);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      else
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Operazione eseguita.", IDVariant.STRING));
        IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
        v_MSG1 = (new IDVariant("Aggiornate", IDVariant.STRING));
        IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
        v_MSG2 = (new IDVariant("Imputazioni", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MSG, (new IDVariant("<BR/>"))), v_MSG1), (new IDVariant(" "))), IDL.ToString(v_AGGIORNATE)), (new IDVariant(" "))), v_MSG2)); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoAutomaticoImpegni", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void AGGIAUTOIMPE_NEWTABLE31() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_NEWTABLE31_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_NEWTABLE33, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_NEWTABLE33, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_NEWTABLE31_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_NEWTABLE31_RS, 0, IMDBDef5.TBL_NEWTABLE33, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_NEWTABLE31_RS, 0, 0, IMDBDef5.TBL_NEWTABLE33, IMDBDef5.FLD_NEWTABLE33_ROWNAMEDATA, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_NEWTABLE33, 0);
      if (IMDB.Eof(IMDBDef5.TBL_NEWTABLE33, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_NEWTABLE33, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_NEWTABLE31_RS, 0);
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
  private void PAN_AGGIAUTOIMPE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_AGGIAUTOIMPE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_AGGIAUTOIMPE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_AGGIAUTOIMPE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_AGGIAUTOIMPE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_AGGIAUTOIMPE);
    // Stub
  }

  private void PAN_AGGIAUTOIMPE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_AGGIAUTOIMPE_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_AGGIAUTOIMPE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_AGGIAUTOIMPE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_AGGIAUTOIMPE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_AGGIAUTOIMPE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_AGGIAUTOIMPE_Init()
  {

    PAN_AGGIAUTOIMPE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_AGGIAUTOIMPE.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_AGGIAUTOIMPE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_AGGIAUTOIMPE_NEWGROUP, "41C2F41C-A6D2-4C8D-A305-DC112E72E638");
    PAN_AGGIAUTOIMPE.set_Header(MyGlb.OBJ_GROUP, GRP_AGGIAUTOIMPE_NEWGROUP, "New Group");
    PAN_AGGIAUTOIMPE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_AGGIAUTOIMPE_NEWGROUP, "");
    PAN_AGGIAUTOIMPE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_AGGIAUTOIMPE_NEWGROUP, MyGlb.VIS_GROUPSTYLE);
    PAN_AGGIAUTOIMPE.SetRect(MyGlb.OBJ_GROUP, GRP_AGGIAUTOIMPE_NEWGROUP, MyGlb.PANEL_LIST, 0, -9999, 400, 0, 0, 0);
    PAN_AGGIAUTOIMPE.SetRect(MyGlb.OBJ_GROUP, GRP_AGGIAUTOIMPE_NEWGROUP, MyGlb.PANEL_FORM, 12, 4, 272, 56, 0, 0);
    PAN_AGGIAUTOIMPE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_AGGIAUTOIMPE_NEWGROUP, 0, 60);
    PAN_AGGIAUTOIMPE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_AGGIAUTOIMPE_NEWGROUP, 1, 13);
    PAN_AGGIAUTOIMPE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_AGGIAUTOIMPE_NEWGROUP, 0, 1);
    PAN_AGGIAUTOIMPE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_AGGIAUTOIMPE_NEWGROUP, 1, 1);
    PAN_AGGIAUTOIMPE.SetFlags(MyGlb.OBJ_GROUP, GRP_AGGIAUTOIMPE_NEWGROUP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_AGGIAUTOIMPE.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_AGGIAUTOIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_DATALIQUSTIP, "BCDA29E2-D92C-4FD6-A3A6-C023AB190A1B");
    PAN_AGGIAUTOIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_DATALIQUSTIP, "Data Liquidazione Stipendi");
    PAN_AGGIAUTOIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_DATALIQUSTIP, "");
    PAN_AGGIAUTOIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_DATALIQUSTIP, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIAUTOIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_DATALIQUSTIP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIAUTOIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_NEWPANELABE1, "E0070CE2-FA90-41B4-BCE3-A35DEEE6E4F8");
    PAN_AGGIAUTOIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_NEWPANELABE1, "");
    PAN_AGGIAUTOIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_AGGIAUTOIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_AGGIAUTOIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_ELABORBUTTON, "EFB89647-F29E-4D7C-8806-999D97BB626C");
    PAN_AGGIAUTOIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_ELABORBUTTON, "Elabora");
    PAN_AGGIAUTOIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_AGGIAUTOIMPE.SetImage(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_ELABORBUTTON, 0, "button1.gif", false);
    PAN_AGGIAUTOIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_AGGIAUTOIMPE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_AGGIAUTOIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_DATALIQUSTIP, MyGlb.PANEL_LIST, 0, 36, 400, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_DATALIQUSTIP, MyGlb.PANEL_LIST, 32);
    PAN_AGGIAUTOIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_DATALIQUSTIP, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_DATALIQUSTIP, MyGlb.PANEL_LIST, "Data Liquidazione Stipendi");
    PAN_AGGIAUTOIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_DATALIQUSTIP, MyGlb.PANEL_FORM, 16, 24, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_DATALIQUSTIP, MyGlb.PANEL_FORM, 164);
    PAN_AGGIAUTOIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_DATALIQUSTIP, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_DATALIQUSTIP, MyGlb.PANEL_FORM, "Data Liquidazione Stipendi");
    PAN_AGGIAUTOIMPE.SetFieldPage(PFL_AGGIAUTOIMPE_DATALIQUSTIP, -1, GRP_AGGIAUTOIMPE_NEWGROUP);
    PAN_AGGIAUTOIMPE.SetFieldPanel(PFL_AGGIAUTOIMPE_DATALIQUSTIP, PPQRY_NEWTABLE31, "A.ROWNAMEDATA", "ROWNAMEDATA", 6, 49, 0, -13997);
    PAN_AGGIAUTOIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_NEWPANELABE1, MyGlb.PANEL_LIST, 280, 136, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_AGGIAUTOIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_NEWPANELABE1, MyGlb.PANEL_FORM, 272, 8, 8, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_AGGIAUTOIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_NEWPANELABE1, MyGlb.PANEL_FORM, 3);
    PAN_AGGIAUTOIMPE.SetFieldPage(PFL_AGGIAUTOIMPE_NEWPANELABE1, -1, GRP_AGGIAUTOIMPE_NEWGROUP);
    PAN_AGGIAUTOIMPE.SetFieldPanel(PFL_AGGIAUTOIMPE_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_AGGIAUTOIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_ELABORBUTTON, MyGlb.PANEL_LIST, 100, 168, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_AGGIAUTOIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_AGGIAUTOIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_ELABORBUTTON, MyGlb.PANEL_FORM, 192, 76, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIAUTOIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_AGGIAUTOIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIAUTOIMPE_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_AGGIAUTOIMPE.SetFieldPage(PFL_AGGIAUTOIMPE_ELABORBUTTON, -1, -1);
    PAN_AGGIAUTOIMPE.SetFieldPanel(PFL_AGGIAUTOIMPE_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
  }

  private void PAN_AGGIAUTOIMPE_InitQueries()
  {
    StringBuffer SQL;

    PAN_AGGIAUTOIMPE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_AGGIAUTOIMPE.SetIMDB(IMDB, "PQRY_NEWTABLE31", true);
    PAN_AGGIAUTOIMPE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_AGGIAUTOIMPE.SetQueryIMDB(PPQRY_NEWTABLE31, IMDBDef14.PQRY_NEWTABLE31_RS, IMDBDef5.TBL_NEWTABLE33);
    JustLoaded = true;
    PAN_AGGIAUTOIMPE.SetFieldPrimaryIndex(PFL_AGGIAUTOIMPE_DATALIQUSTIP, IMDBDef5.FLD_NEWTABLE33_ROWNAMEDATA);
    PAN_AGGIAUTOIMPE.SetMasterTable(0, "NEWTABLE33");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_AGGIAUTOIMPE.Status() == 2)
    {
      int oldListQBE = PAN_AGGIAUTOIMPE.iUseListQBE;
      PAN_AGGIAUTOIMPE.iUseListQBE = 0;
      PAN_AGGIAUTOIMPE.PanelCommand(Glb.PCM_SEARCH);
      PAN_AGGIAUTOIMPE.PanelCommand(Glb.PCM_FIND);
      PAN_AGGIAUTOIMPE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_AGGIAUTOIMPE) PAN_AGGIAUTOIMPE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_AGGIAUTOIMPE) PAN_AGGIAUTOIMPE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_AGGIAUTOIMPE) PAN_AGGIAUTOIMPE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_AGGIAUTOIMPE) PAN_AGGIAUTOIMPE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_AGGIAUTOIMPE) PAN_AGGIAUTOIMPE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
