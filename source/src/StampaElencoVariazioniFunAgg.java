// **********************************************
// Stampa Elenco Variazioni Fun Agg
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StampaElencoVariazioniFunAgg extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_CRONOPROGRID = 0;
  private static int PFL_PARS_TOTALIZZAZIO = 1;
  private static int PFL_PARS_ETICHEELABOR = 2;

  private static int PPQRY_PARS60 = 0;


  IDPanel PAN_PARS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS57(IMDB);
    //
    //
    Init_PQRY_PARS60(IMDB);
    Init_PQRY_PARS60_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS57(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS57, 2);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS57, "TBL_PARS57");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS57,IMDBDef3.FLD_PARS57_NOMEOGGCROID, "NOMEOGGCROID");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS57,IMDBDef3.FLD_PARS57_NOMEOGGCROID,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS57,IMDBDef3.FLD_PARS57_NOMEOGGETOTA, "NOMEOGGETOTA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS57,IMDBDef3.FLD_PARS57_NOMEOGGETOTA,5,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS57, 0);
  }

  private static void Init_PQRY_PARS60(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARS60, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARS60, "PQRY_PARS60");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS60,IMDBDef11.PQSL_PARS60_NOMEOGGCROID, "NOMEOGGCROID");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS60,IMDBDef11.PQSL_PARS60_NOMEOGGCROID,1,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS60,IMDBDef11.PQSL_PARS60_NOMEOGGETOTA, "NOMEOGGETOTA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS60,IMDBDef11.PQSL_PARS60_NOMEOGGETOTA,5,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARS60, 0);
  }

  private static void Init_PQRY_PARS60_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARS60_RS, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARS60_RS, "PQRY_PARS60_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS60_RS,IMDBDef11.PQSL_PARS60_NOMEOGGCROID, "NOMEOGGCROID");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS60_RS,IMDBDef11.PQSL_PARS60_NOMEOGGCROID,1,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS60_RS,IMDBDef11.PQSL_PARS60_NOMEOGGETOTA, "NOMEOGGETOTA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS60_RS,IMDBDef11.PQSL_PARS60_NOMEOGGETOTA,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StampaElencoVariazioniFunAgg(MyWebEntryPoint w, IMDBObj imdb)
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
  public StampaElencoVariazioniFunAgg()
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
    FormIdx = MyGlb.FRM_STAELEVAFUAG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6DA2F42F-0401-4920-84B3-C62CDF00F8A6";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 376;
    DesignHeight = 142;
    set_Caption(new IDVariant("Stampa Elenco Variazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 376;
    Frames[1].Height = 116;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Pars";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 116;
    PAN_PARS = new IDPanel(w, this, 1, "PAN_PARS");
    Frames[1].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 376-MyGlb.PAN_OFFS_X, 116-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D04561C6-A509-4273-B8E5-3453EA3466CE");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 120, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 1;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
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
    // Resetto il fuoco perch� le tabbed view lo possono modificare
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARS57, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STAELEVAFUAG_PARS60();
      }
      PAN_PARS.UpdatePanel(MainFrm);
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
  // Torna TRUE se l'oggetto passato � una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof StampaElencoVariazioniFunAgg);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StampaElencoVariazioniFunAgg.class.getName() : (Glb.ClassWithPackage(StampaElencoVariazioniFunAgg.class) ? StampaElencoVariazioniFunAgg.class.getName().substring(StampaElencoVariazioniFunAgg.class.getPackage().getName().length() + 1) : StampaElencoVariazioniFunAgg.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Stampa Elenco Variazioni
  // **********************************************************************
  public int StampaElencoVariazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Elenco Variazioni Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CRONOPROGRAM, IMDBDef11.PQSL_CRONOPROGRAM_CRONOPROGRID, 0)))
      {
        return 0;
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Stampa_var_Crono"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_CRONO_ID")), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARS57, IMDBDef3.FLD_PARS57_NOMEOGGCROID, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_GRP")), IMDB.Value(IMDBDef11.PQRY_PARS60, IMDBDef11.PQSL_PARS60_NOMEOGGETOTA, 0));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaElencoVariazioniFunAgg", "StampaElencoVariazioni", _e);
      return -1;
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
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaElencoVariazioniFunAgg", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perch� stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS57, IMDBDef3.FLD_PARS57_NOMEOGGCROID, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS57, IMDBDef3.FLD_PARS57_NOMEOGGETOTA, 0, new IDVariant());
  }

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
      IMDB.set_Value(IMDBDef3.TBL_PARS57, IMDBDef3.FLD_PARS57_NOMEOGGETOTA, 0, (new IDVariant("A")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaElencoVariazioniFunAgg", "Load", _e);
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void STAELEVAFUAG_PARS60() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARS60_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARS57, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARS57, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARS60_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARS60_RS, 0, IMDBDef3.TBL_PARS57, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS60_RS, 0, 0, IMDBDef3.TBL_PARS57, IMDBDef3.FLD_PARS57_NOMEOGGCROID, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS60_RS, 1, 0, IMDBDef3.TBL_PARS57, IMDBDef3.FLD_PARS57_NOMEOGGETOTA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARS57, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARS57, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARS57, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARS60_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cio� quando viene portata in primo piano
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARS_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      StampaElencoVariazioni();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_CRONOPROGRID, "80092D7F-D659-40F4-8C9A-6047031728FD");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_CRONOPROGRID, "Cronoprogramma Id");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_CRONOPROGRID, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_CRONOPROGRID, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_CRONOPROGRID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, "A81A08C3-B7E0-4D40-9E3B-5EE528DF5FDE");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, "Totalizzazione");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "38FC5D46-C9A6-4811-B5DF-A7AD38D75E59");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "Elabora");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CRONOPROGRID, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CRONOPROGRID, MyGlb.PANEL_LIST, 124);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CRONOPROGRID, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CRONOPROGRID, MyGlb.PANEL_LIST, "Cron. Id");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CRONOPROGRID, MyGlb.PANEL_FORM, 4, 4, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CRONOPROGRID, MyGlb.PANEL_FORM, 136);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CRONOPROGRID, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CRONOPROGRID, MyGlb.PANEL_FORM, "Cronoprogramma Id");
    PAN_PARS.SetFieldPage(PFL_PARS_CRONOPROGRID, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_CRONOPROGRID, PPQRY_PARS60, "A.NOMEOGGCROID", "NOMEOGGCROID", 1, 10, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_LIST, 92);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_LIST, "Totalizzazione");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_FORM, 12, 12, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_FORM, 92);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_FORM, "Totalizzazione");
    PAN_PARS.SetFieldPage(PFL_PARS_TOTALIZZAZIO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TOTALIZZAZIO, PPQRY_PARS60, "A.NOMEOGGETOTA", "NOMEOGGETOTA", 5, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_TOTALIZZAZIO, (new IDVariant("A")), "Anno Variazione", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_TOTALIZZAZIO, (new IDVariant("E")), "Esercizio Pluriennale", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 276, 48, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 252, 44, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHEELABOR, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS60", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS60, IMDBDef11.PQRY_PARS60_RS, IMDBDef3.TBL_PARS57);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_CRONOPROGRID, IMDBDef3.FLD_PARS57_NOMEOGGCROID);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_TOTALIZZAZIO, IMDBDef3.FLD_PARS57_NOMEOGGETOTA);
    PAN_PARS.SetMasterTable(0, "PARS57");
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
