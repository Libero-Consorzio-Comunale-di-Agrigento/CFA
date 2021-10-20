// **********************************************
// Residui Da Riportare Cons
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ResiduiDaRiportareCons extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_PARTE = 0;

  private static int PFL_PARAM_ETICHLABELSX = 0;
  private static int PFL_PARAM_PARTE = 1;
  private static int PFL_PARAM_ELABORA = 2;
  private static int PFL_PARAM_DETTAGCAPITO = 3;
  private static int PFL_PARAM_SOLORESDARIP = 4;
  private static int PFL_PARAM_ESCIMPACDICO = 5;

  private static int PPQRY_PARAM149 = 0;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM150(IMDB);
    //
    //
    Init_PQRY_PARAM149(IMDB);
    Init_PQRY_PARAM149_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM150(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAM150, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAM150, "TBL_PARAM150");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM150,IMDBDef3.FLD_PARAM150_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM150,IMDBDef3.FLD_PARAM150_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM150,IMDBDef3.FLD_PARAM150_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM150,IMDBDef3.FLD_PARAM150_ROWNAMDETCAP,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM150,IMDBDef3.FLD_PARAM150_RONASOREDARI, "RONASOREDARI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM150,IMDBDef3.FLD_PARAM150_RONASOREDARI,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM150,IMDBDef3.FLD_PARAM150_RONAESIMACDC, "RONAESIMACDC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM150,IMDBDef3.FLD_PARAM150_RONAESIMACDC,5,50,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAM150, 0);
  }

  private static void Init_PQRY_PARAM149(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAM149, 4);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAM149, "PQRY_PARAM149");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM149,IMDBDef12.PQSL_PARAM149_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM149,IMDBDef12.PQSL_PARAM149_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM149,IMDBDef12.PQSL_PARAM149_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM149,IMDBDef12.PQSL_PARAM149_ROWNAMDETCAP,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM149,IMDBDef12.PQSL_PARAM149_RONASOREDARI, "RONASOREDARI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM149,IMDBDef12.PQSL_PARAM149_RONASOREDARI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM149,IMDBDef12.PQSL_PARAM149_RONAESIMACDC, "RONAESIMACDC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM149,IMDBDef12.PQSL_PARAM149_RONAESIMACDC,5,50,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAM149, 0);
  }

  private static void Init_PQRY_PARAM149_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAM149_RS, 4);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAM149_RS, "PQRY_PARAM149_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM149_RS,IMDBDef12.PQSL_PARAM149_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM149_RS,IMDBDef12.PQSL_PARAM149_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM149_RS,IMDBDef12.PQSL_PARAM149_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM149_RS,IMDBDef12.PQSL_PARAM149_ROWNAMDETCAP,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM149_RS,IMDBDef12.PQSL_PARAM149_RONASOREDARI, "RONASOREDARI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM149_RS,IMDBDef12.PQSL_PARAM149_RONASOREDARI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAM149_RS,IMDBDef12.PQSL_PARAM149_RONAESIMACDC, "RONAESIMACDC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAM149_RS,IMDBDef12.PQSL_PARAM149_RONAESIMACDC,5,50,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ResiduiDaRiportareCons(MyWebEntryPoint w, IMDBObj imdb)
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
  public ResiduiDaRiportareCons()
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
    FormIdx = MyGlb.FRM_RESIDARIPCON;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "523707A9-BA04-4C47-9BD3-1EF584CB353B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 456;
    DesignHeight = 234;
    set_Caption(new IDVariant("Residui da Riportare"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 456;
    Frames[1].Height = 208;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 208;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 456-MyGlb.PAN_OFFS_X, 208-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DDC14E67-8CBD-49E6-A6E8-C4C6F8FB6475");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 472, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAM150, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RESIDARIPCON_PARAM149();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
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
    return (obj instanceof ResiduiDaRiportareCons);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ResiduiDaRiportareCons.class.getName() : (Glb.ClassWithPackage(ResiduiDaRiportareCons.class) ? ResiduiDaRiportareCons.class.getName().substring(ResiduiDaRiportareCons.class.getPackage().getName().length() + 1) : ResiduiDaRiportareCons.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAM_PARTE)), true) && FieldWasModified.booleanValue())
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Escludi Impegni di competenza"));
        IDVariant E = new IDVariant(0,IDVariant.STRING);
        E = (new IDVariant("Escludi Accertamenti di competenza"));
        if (IMDB.Value(IMDBDef12.PQRY_PARAM149, IMDBDef12.PQSL_PARAM149_ROWNAMEES, 0).equals((new IDVariant("E")), true))
        {
          PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_ESCIMPACDICO, new IDVariant(E).stringValue());
        }
        else
        {
          PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_ESCIMPACDICO, new IDVariant(S).stringValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ResiduiDaRiportareCons", "ParamOnUpdatingRow", _e);
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

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
      v_PAR1 = (new IDVariant("ESERCIZIO"));
      IDVariant v_PAR2 = new IDVariant(0,IDVariant.STRING);
      v_PAR2 = (new IDVariant("PARTE"));
      IDVariant v_PAR3 = new IDVariant(0,IDVariant.STRING);
      v_PAR3 = (new IDVariant("DETT_CAP"));
      IDVariant v_PAR4 = new IDVariant(0,IDVariant.STRING);
      v_PAR4 = (new IDVariant("RES_DA_RIP"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Residui_da_Riportare"));
      MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_PAR2, IMDB.Value(IMDBDef12.PQRY_PARAM149, IMDBDef12.PQSL_PARAM149_ROWNAMEES, 0));
      MainFrm.SetParametroStampaJasper(v_PAR3, IMDB.Value(IMDBDef12.PQRY_PARAM149, IMDBDef12.PQSL_PARAM149_ROWNAMDETCAP, 0));
      MainFrm.SetParametroStampaJasper(v_PAR4, IMDB.Value(IMDBDef12.PQRY_PARAM149, IMDBDef12.PQSL_PARAM149_RONASOREDARI, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef12.PQRY_PARAM145, IMDBDef12.PQSL_PARAM145_PARSTANUDIPA, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("ESCLUDI_COMPETENZA")), IMDB.Value(IMDBDef12.PQRY_PARAM149, IMDBDef12.PQSL_PARAM149_RONAESIMACDC, 0));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ResiduiDaRiportareCons", "Elabora", _e);
      return -1;
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
      set_Caption(IDL.Add(this.Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_PARAM150, IMDBDef3.FLD_PARAM150_ROWNAMEES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM150, IMDBDef3.FLD_PARAM150_ROWNAMDETCAP, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM150, IMDBDef3.FLD_PARAM150_RONASOREDARI, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM150, IMDBDef3.FLD_PARAM150_RONAESIMACDC, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ResiduiDaRiportareCons", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void RESIDARIPCON_PARAM149() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAM149_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM150, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAM150, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAM149_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAM149_RS, 0, IMDBDef3.TBL_PARAM150, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM149_RS, 0, 0, IMDBDef3.TBL_PARAM150, IMDBDef3.FLD_PARAM150_ROWNAMEES, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM149_RS, 1, 0, IMDBDef3.TBL_PARAM150, IMDBDef3.FLD_PARAM150_ROWNAMDETCAP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM149_RS, 2, 0, IMDBDef3.TBL_PARAM150, IMDBDef3.FLD_PARAM150_RONASOREDARI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAM149_RS, 3, 0, IMDBDef3.TBL_PARAM150, IMDBDef3.FLD_PARAM150_RONAESIMACDC, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAM150, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAM150, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM150, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAM149_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, "A8328DD4-35C8-4883-9B6D-E5FC13F8712A");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, "Parte");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, MyGlb.PANEL_LIST, 0, -9999, 64, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, MyGlb.PANEL_FORM, 68, 10, 248, 38, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 0, 31);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 1, 2);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, "0C53B672-AB15-4EED-B648-1241D6A1868D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, MyGlb.VIS_LABELFIELD);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "BF2FB866-1088-4E03-895A-FEAA5D77CEE7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "Parte");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "ABA5F773-C6A0-4AA2-AA06-0FE80D14753E");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, "B0CCDB93-F412-43B9-9F10-1392FD1EB3C5");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SOLORESDARIP, "FB2005FC-EA79-469E-A9FD-719730B50708");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SOLORESDARIP, "Solo Residui da Riportare");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SOLORESDARIP, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SOLORESDARIP, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SOLORESDARIP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ESCIMPACDICO, "CC517C51-4C86-4499-BBBF-6A22C8848B06");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ESCIMPACDICO, "Escludi Accertamenti di competenza");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ESCIMPACDICO, "Escludi Impegni Accertamenti Di Competenza");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ESCIMPACDICO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ESCIMPACDICO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, MyGlb.PANEL_LIST, 20, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, MyGlb.PANEL_FORM, 72, 28, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHLABELSX, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHLABELSX, -1, GRP_PARAM_PARTE);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHLABELSX, -1, "", "ETICHLABELSX", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 20);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 140, 24, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 32);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, "Par.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PARTE, -1, GRP_PARAM_PARTE);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PARTE, PPQRY_PARAM149, "A.ROWNAMEES", "ROWNAMEES", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 92, 52, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 204, 136, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ELABORA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capitoli");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_FORM, 116, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DETTAGCAPITO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DETTAGCAPITO, PPQRY_PARAM149, "A.ROWNAMDETCAP", "ROWNAMDETCAP", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_DETTAGCAPITO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SOLORESDARIP, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SOLORESDARIP, MyGlb.PANEL_LIST, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SOLORESDARIP, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SOLORESDARIP, MyGlb.PANEL_LIST, "Solo Residui da Riportare");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SOLORESDARIP, MyGlb.PANEL_FORM, 56, 76, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SOLORESDARIP, MyGlb.PANEL_FORM, 172);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SOLORESDARIP, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SOLORESDARIP, MyGlb.PANEL_FORM, "Solo Residui da Riportare");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SOLORESDARIP, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SOLORESDARIP, PPQRY_PARAM149, "A.RONASOREDARI", "RONASOREDARI", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SOLORESDARIP, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SOLORESDARIP, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ESCIMPACDICO, MyGlb.PANEL_LIST, 0, 36, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ESCIMPACDICO, MyGlb.PANEL_LIST, 264);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ESCIMPACDICO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ESCIMPACDICO, MyGlb.PANEL_LIST, "Escludi Accertamenti di competenza");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ESCIMPACDICO, MyGlb.PANEL_FORM, -20, 100, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ESCIMPACDICO, MyGlb.PANEL_FORM, 248);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ESCIMPACDICO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ESCIMPACDICO, MyGlb.PANEL_FORM, "Escludi Accertamenti di competenza");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ESCIMPACDICO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ESCIMPACDICO, PPQRY_PARAM149, "A.RONAESIMACDC", "RONAESIMACDC", 5, 50, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ESCIMPACDICO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ESCIMPACDICO, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM149", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM149, IMDBDef12.PQRY_PARAM149_RS, IMDBDef3.TBL_PARAM150);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PARTE, IMDBDef3.FLD_PARAM150_ROWNAMEES);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DETTAGCAPITO, IMDBDef3.FLD_PARAM150_ROWNAMDETCAP);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_SOLORESDARIP, IMDBDef3.FLD_PARAM150_RONASOREDARI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ESCIMPACDICO, IMDBDef3.FLD_PARAM150_RONAESIMACDC);
    PAN_PARAM.SetMasterTable(0, "PARAM150");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
