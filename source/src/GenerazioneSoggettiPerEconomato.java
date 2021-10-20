// **********************************************
// Generazione Soggetti Per Economato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GenerazioneSoggettiPerEconomato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_GENSOGPERECO_SOLOCONTCOMU = 0;
  private static int PFL_GENSOGPERECO_COMUNEGENERI = 1;
  private static int PFL_GENSOGPERECO_PROV = 2;
  private static int PFL_GENSOGPERECO_CAP = 3;
  private static int PFL_GENSOGPERECO_PROVINNUMERO = 4;
  private static int PFL_GENSOGPERECO_LABEL = 5;
  private static int PFL_GENSOGPERECO_ELABORA = 6;
  private static int PFL_GENSOGPERECO_COMUNE = 7;
  private static int PFL_GENSOGPERECO_CAP1 = 8;

  private static int PPQRY_PAR51 = 0;

  private static int PPQRY_COMUNI = 1;


  IDPanel PAN_GENSOGPERECO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR52(IMDB);
    //
    //
    Init_PQRY_PAR51(IMDB);
    Init_PQRY_PAR51_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR52(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PAR52, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_PAR52, "TBL_PAR52");
    IMDB.set_FldCode(IMDBDef2.TBL_PAR52,IMDBDef2.FLD_PAR52_ROWNAMSOCOCO, "ROWNAMSOCOCO");
    IMDB.SetFldParams(IMDBDef2.TBL_PAR52,IMDBDef2.FLD_PAR52_ROWNAMSOCOCO,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAR52,IMDBDef2.FLD_PAR52_ROWNAMEPROVI, "ROWNAMEPROVI");
    IMDB.SetFldParams(IMDBDef2.TBL_PAR52,IMDBDef2.FLD_PAR52_ROWNAMEPROVI,1,3,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAR52,IMDBDef2.FLD_PAR52_ROWNAMECAP, "ROWNAMECAP");
    IMDB.SetFldParams(IMDBDef2.TBL_PAR52,IMDBDef2.FLD_PAR52_ROWNAMECAP,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PAR52,IMDBDef2.FLD_PAR52_ROWNAMECOMUN, "ROWNAMECOMUN");
    IMDB.SetFldParams(IMDBDef2.TBL_PAR52,IMDBDef2.FLD_PAR52_ROWNAMECOMUN,1,3,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PAR52, 0);
  }

  private static void Init_PQRY_PAR51(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PAR51, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_PAR51, "PQRY_PAR51");
    IMDB.set_FldCode(IMDBDef9.PQRY_PAR51,IMDBDef9.PQSL_PAR51_ROWNAMSOCOCO, "ROWNAMSOCOCO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAR51,IMDBDef9.PQSL_PAR51_ROWNAMSOCOCO,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAR51,IMDBDef9.PQSL_PAR51_ROWNAMEPROVI, "ROWNAMEPROVI");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAR51,IMDBDef9.PQSL_PAR51_ROWNAMEPROVI,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAR51,IMDBDef9.PQSL_PAR51_ROWNAMECAP, "ROWNAMECAP");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAR51,IMDBDef9.PQSL_PAR51_ROWNAMECAP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAR51,IMDBDef9.PQSL_PAR51_ROWNAMECOMUN, "ROWNAMECOMUN");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAR51,IMDBDef9.PQSL_PAR51_ROWNAMECOMUN,1,3,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PAR51, 0);
  }

  private static void Init_PQRY_PAR51_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PAR51_RS, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_PAR51_RS, "PQRY_PAR51_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PAR51_RS,IMDBDef9.PQSL_PAR51_ROWNAMSOCOCO, "ROWNAMSOCOCO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAR51_RS,IMDBDef9.PQSL_PAR51_ROWNAMSOCOCO,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAR51_RS,IMDBDef9.PQSL_PAR51_ROWNAMEPROVI, "ROWNAMEPROVI");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAR51_RS,IMDBDef9.PQSL_PAR51_ROWNAMEPROVI,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAR51_RS,IMDBDef9.PQSL_PAR51_ROWNAMECAP, "ROWNAMECAP");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAR51_RS,IMDBDef9.PQSL_PAR51_ROWNAMECAP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PAR51_RS,IMDBDef9.PQSL_PAR51_ROWNAMECOMUN, "ROWNAMECOMUN");
    IMDB.SetFldParams(IMDBDef9.PQRY_PAR51_RS,IMDBDef9.PQSL_PAR51_ROWNAMECOMUN,1,3,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GenerazioneSoggettiPerEconomato(MyWebEntryPoint w, IMDBObj imdb)
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
  public GenerazioneSoggettiPerEconomato()
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
    FormIdx = MyGlb.FRM_GENSOGPERECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D338CB62-151B-4F35-8B52-73A5C1F4217F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 556;
    DesignHeight = 270;
    set_Caption(new IDVariant("Generazione Soggetti Per Economato"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 556;
    Frames[1].Height = 244;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Generazione Soggetti Per Economato";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 244;
    PAN_GENSOGPERECO = new IDPanel(w, this, 1, "PAN_GENSOGPERECO");
    Frames[1].Content = PAN_GENSOGPERECO;
    PAN_GENSOGPERECO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_GENSOGPERECO.VS = MainFrm.VisualStyleList;
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 556-MyGlb.PAN_OFFS_X, 244-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_GENSOGPERECO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5368B8BE-8F2B-482B-BC50-290B7F4D15BD");
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 748, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_GENSOGPERECO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_GENSOGPERECO.InitStatus = 2;
    PAN_GENSOGPERECO_Init();
    PAN_GENSOGPERECO_InitFields();
    PAN_GENSOGPERECO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PAR52, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENSOGPERECO_PAR51();
      }
      PAN_GENSOGPERECO.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_COMUNI_243 && flRis && IdxPanelActived == PAN_GENSOGPERECO.FrIndex)
    {
      if (IdxFieldActived ==PFL_GENSOGPERECO_COMUNEGENERI) {
      }
    }
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
    return (obj instanceof GenerazioneSoggettiPerEconomato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GenerazioneSoggettiPerEconomato.class.getName() : (Glb.ClassWithPackage(GenerazioneSoggettiPerEconomato.class) ? GenerazioneSoggettiPerEconomato.class.getName().substring(GenerazioneSoggettiPerEconomato.class.getPackage().getName().length() + 1) : GenerazioneSoggettiPerEconomato.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
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
      if (IMDB.Value(IMDBDef9.PQRY_PAR51, IMDBDef9.PQSL_PAR51_ROWNAMSOCOCO, 0).equals((new IDVariant("SI")), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Soggetti_Economato"));
        MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      else
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.GENSOGGE4CI4(IMDB.Value(IMDBDef9.PQRY_PAR51, IMDBDef9.PQSL_PAR51_ROWNAMEPROVI, 0), IMDB.Value(IMDBDef9.PQRY_PAR51, IMDBDef9.PQSL_PAR51_ROWNAMECOMUN, 0), ((IDL.NullValue((new IDVariant(PAN_GENSOGPERECO.FieldText(PFL_GENSOGPERECO_CAP))),(new IDVariant(""))).equals((new IDVariant(""))))?(new IDVariant()):IDL.ToInteger((new IDVariant(PAN_GENSOGPERECO.FieldText(PFL_GENSOGPERECO_CAP))))));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneSoggettiPerEconomato", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Comune Nascita
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ComuneNascita ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Comune Nascita Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_COMUNI_243, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneSoggettiPerEconomato", "ComuneNascita", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PAR52, IMDBDef2.FLD_PAR52_ROWNAMSOCOCO, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneSoggettiPerEconomato", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
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
      // Unload Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PAR52, IMDBDef2.FLD_PAR52_ROWNAMEPROVI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PAR52, IMDBDef2.FLD_PAR52_ROWNAMECAP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PAR52, IMDBDef2.FLD_PAR52_ROWNAMECOMUN, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneSoggettiPerEconomato", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_COMUNI_243)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_PAR51, IMDBDef9.PQSL_PAR51_ROWNAMECOMUN, 0, IMDB.Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMECOMUN, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PAR51, IMDBDef9.PQSL_PAR51_ROWNAMEPROVI, 0, IMDB.Value(IMDBDef1.TBL_FORM1, IMDBDef1.FLD_FORM1_ROWNAMEPROVI, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneSoggettiPerEconomato", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void GENSOGPERECO_PAR51() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PAR51_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PAR52, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PAR52, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PAR51_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PAR51_RS, 0, IMDBDef2.TBL_PAR52, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PAR51_RS, 0, 0, IMDBDef2.TBL_PAR52, IMDBDef2.FLD_PAR52_ROWNAMSOCOCO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PAR51_RS, 1, 0, IMDBDef2.TBL_PAR52, IMDBDef2.FLD_PAR52_ROWNAMEPROVI, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PAR51_RS, 2, 0, IMDBDef2.TBL_PAR52, IMDBDef2.FLD_PAR52_ROWNAMECAP, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PAR51_RS, 3, 0, IMDBDef2.TBL_PAR52, IMDBDef2.FLD_PAR52_ROWNAMECOMUN, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PAR52, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PAR52, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PAR52, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PAR51_RS, 0);
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
  private void PAN_GENSOGPERECO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_GENSOGPERECO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_GENSOGPERECO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_GENSOGPERECO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_GENSOGPERECO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_GENSOGPERECO);
    // Stub
  }

  private void PAN_GENSOGPERECO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_GENSOGPERECO_COMUNEGENERI)
    {
      this.IdxPanelActived = this.PAN_GENSOGPERECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ComuneNascita();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GENSOGPERECO_ELABORA)
    {
      this.IdxPanelActived = this.PAN_GENSOGPERECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_GENSOGPERECO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_GENSOGPERECO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_GENSOGPERECO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_GENSOGPERECO_Init()
  {

    PAN_GENSOGPERECO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_GENSOGPERECO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_GENSOGPERECO.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_GENSOGPERECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_SOLOCONTCOMU, "285E8566-7D42-4B49-8523-641AB1D121C9");
    PAN_GENSOGPERECO.set_Header(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_SOLOCONTCOMU, "Solo Controllo Comuni");
    PAN_GENSOGPERECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_SOLOCONTCOMU, "");
    PAN_GENSOGPERECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_SOLOCONTCOMU, MyGlb.VIS_CHECKSTYLE);
    PAN_GENSOGPERECO.SetFlags(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_SOLOCONTCOMU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENSOGPERECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNEGENERI, "519D764B-F79D-411C-BCF0-1F861F8EF3BF");
    PAN_GENSOGPERECO.set_Header(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNEGENERI, "Comune Generico");
    PAN_GENSOGPERECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNEGENERI, "");
    PAN_GENSOGPERECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNEGENERI, MyGlb.VIS_NORMALFIELDS);
    PAN_GENSOGPERECO.SetFlags(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNEGENERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_GENSOGPERECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROV, "8084A1C8-20C0-4CF2-B89F-5A6F71C0C111");
    PAN_GENSOGPERECO.set_Header(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROV, "Prov.");
    PAN_GENSOGPERECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROV, "");
    PAN_GENSOGPERECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROV, MyGlb.VIS_NORMALFIELDS);
    PAN_GENSOGPERECO.SetFlags(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENSOGPERECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP, "494E7336-4AAC-4410-8F4E-A0D9742A3BA1");
    PAN_GENSOGPERECO.set_Header(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP, "CAP");
    PAN_GENSOGPERECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP, "");
    PAN_GENSOGPERECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP, MyGlb.VIS_NORMALFIELDS);
    PAN_GENSOGPERECO.SetFlags(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENSOGPERECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROVINNUMERO, "4106936E-893F-4034-94F8-7C6FBD479956");
    PAN_GENSOGPERECO.set_Header(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROVINNUMERO, "Provincia numero");
    PAN_GENSOGPERECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROVINNUMERO, "");
    PAN_GENSOGPERECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROVINNUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_GENSOGPERECO.SetFlags(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROVINNUMERO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_GENSOGPERECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_LABEL, "445D555B-AD19-4CF0-8C72-2B89EC62F916");
    PAN_GENSOGPERECO.set_Header(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_LABEL, "La presente fase genera le tabelle SOGGETTI e INDIRIZZI per il collegamento con le procedure CE4 (Economato) e/o CI4 (Inventari). Tutti i soggetti devono avere l'indicazione del comune di residenza. Prima di eseguire l'elaborazione si puo' ottenere l'elenco dei soggetti presenti in CF4 privi di comune di residenza. E' possibile indicare un comune generico da inserire sulle tabelle generate per i soggetti privi di comune di residenza.");
    PAN_GENSOGPERECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_LABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_GENSOGPERECO.SetFlags(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_GENSOGPERECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_ELABORA, "34EE7BEA-A1A6-40A8-B84D-DF5094911FF5");
    PAN_GENSOGPERECO.set_Header(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_ELABORA, "Elabora");
    PAN_GENSOGPERECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_GENSOGPERECO.SetImage(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_ELABORA, 0, "button1.gif", false);
    PAN_GENSOGPERECO.SetFlags(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENSOGPERECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNE, "3E8E043A-C56D-4438-A96B-BABFA1FA768F");
    PAN_GENSOGPERECO.set_Header(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNE, "Comune");
    PAN_GENSOGPERECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNE, "");
    PAN_GENSOGPERECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNE, MyGlb.VIS_NORMFIELPADR);
    PAN_GENSOGPERECO.SetFlags(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_GENSOGPERECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP1, "BC8800CA-69F3-4EF4-84BD-FFC7D9648E9E");
    PAN_GENSOGPERECO.set_Header(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP1, "CAP 1");
    PAN_GENSOGPERECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP1, "");
    PAN_GENSOGPERECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP1, MyGlb.VIS_NORMFIELPADR);
    PAN_GENSOGPERECO.SetFlags(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP1, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_GENSOGPERECO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_SOLOCONTCOMU, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_SOLOCONTCOMU, MyGlb.PANEL_LIST, 112);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_SOLOCONTCOMU, MyGlb.PANEL_LIST, 1);
    PAN_GENSOGPERECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_SOLOCONTCOMU, MyGlb.PANEL_LIST, "S. Cn. Cm.");
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_SOLOCONTCOMU, MyGlb.PANEL_FORM, 16, 108, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_SOLOCONTCOMU, MyGlb.PANEL_FORM, 132);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_SOLOCONTCOMU, MyGlb.PANEL_FORM, 1);
    PAN_GENSOGPERECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_SOLOCONTCOMU, MyGlb.PANEL_FORM, "Solo Controllo Comuni");
    PAN_GENSOGPERECO.SetFieldPage(PFL_GENSOGPERECO_SOLOCONTCOMU, -1, -1);
    PAN_GENSOGPERECO.SetFieldPanel(PFL_GENSOGPERECO_SOLOCONTCOMU, PPQRY_PAR51, "A.ROWNAMSOCOCO", "ROWNAMSOCOCO", 5, 2, 0, -13997);
    PAN_GENSOGPERECO.SetValueListItem(PFL_GENSOGPERECO_SOLOCONTCOMU, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_GENSOGPERECO.SetValueListItem(PFL_GENSOGPERECO_SOLOCONTCOMU, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNEGENERI, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNEGENERI, MyGlb.PANEL_LIST, 140);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNEGENERI, MyGlb.PANEL_LIST, 1);
    PAN_GENSOGPERECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNEGENERI, MyGlb.PANEL_LIST, "Comune Generico");
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNEGENERI, MyGlb.PANEL_FORM, 16, 144, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNEGENERI, MyGlb.PANEL_FORM, 108);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNEGENERI, MyGlb.PANEL_FORM, 1);
    PAN_GENSOGPERECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNEGENERI, MyGlb.PANEL_FORM, "Comune Generico");
    PAN_GENSOGPERECO.SetFieldPage(PFL_GENSOGPERECO_COMUNEGENERI, -1, -1);
    PAN_GENSOGPERECO.SetFieldPanel(PFL_GENSOGPERECO_COMUNEGENERI, PPQRY_COMUNI, "A.DENOMINAZIONE", "COMUNIDENOMI", 5, 40, 0, -13997);
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROV, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROV, MyGlb.PANEL_LIST, 140);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROV, MyGlb.PANEL_LIST, 2);
    PAN_GENSOGPERECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROV, MyGlb.PANEL_LIST, "Prov.");
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROV, MyGlb.PANEL_FORM, 356, 144, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROV, MyGlb.PANEL_FORM, 40);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROV, MyGlb.PANEL_FORM, 1);
    PAN_GENSOGPERECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROV, MyGlb.PANEL_FORM, "Prov.");
    PAN_GENSOGPERECO.SetFieldPage(PFL_GENSOGPERECO_PROV, -1, -1);
    PAN_GENSOGPERECO.SetFieldPanel(PFL_GENSOGPERECO_PROV, PPQRY_COMUNI, "CASE WHEN A.COMUNE = 0 THEN 'EST' ELSE B.SIGLA END", "COMUPROVSIGL", 5, 99, 0, -13997);
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP, MyGlb.PANEL_LIST, 72);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP, MyGlb.PANEL_LIST, 1);
    PAN_GENSOGPERECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP, MyGlb.PANEL_LIST, "CAP");
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP, MyGlb.PANEL_FORM, 456, 144, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP, MyGlb.PANEL_FORM, 32);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP, MyGlb.PANEL_FORM, 1);
    PAN_GENSOGPERECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP, MyGlb.PANEL_FORM, "CAP");
    PAN_GENSOGPERECO.SetFieldPage(PFL_GENSOGPERECO_CAP, -1, -1);
    PAN_GENSOGPERECO.SetFieldPanel(PFL_GENSOGPERECO_CAP, PPQRY_COMUNI, "A.CAP", "COMUNICAP", 1, 5, 0, -13997);
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROVINNUMERO, MyGlb.PANEL_LIST, 40, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROVINNUMERO, MyGlb.PANEL_LIST, 52);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROVINNUMERO, MyGlb.PANEL_LIST, 1);
    PAN_GENSOGPERECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROVINNUMERO, MyGlb.PANEL_LIST, "Provincia numero");
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROVINNUMERO, MyGlb.PANEL_FORM, 28, 172, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROVINNUMERO, MyGlb.PANEL_FORM, 36);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROVINNUMERO, MyGlb.PANEL_FORM, 1);
    PAN_GENSOGPERECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_PROVINNUMERO, MyGlb.PANEL_FORM, "Pr. n.");
    PAN_GENSOGPERECO.SetFieldPage(PFL_GENSOGPERECO_PROVINNUMERO, -1, -1);
    PAN_GENSOGPERECO.SetFieldPanel(PFL_GENSOGPERECO_PROVINNUMERO, PPQRY_PAR51, "A.ROWNAMEPROVI", "ROWNAMEPROVI", 1, 3, 0, -13997);
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_LABEL, MyGlb.PANEL_LIST, 12, 4, 408, 72, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_LABEL, MyGlb.PANEL_LIST, 5);
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_LABEL, MyGlb.PANEL_FORM, 12, 8, 524, 88, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_LABEL, MyGlb.PANEL_FORM, 6);
    PAN_GENSOGPERECO.SetFieldPage(PFL_GENSOGPERECO_LABEL, -1, -1);
    PAN_GENSOGPERECO.SetFieldPanel(PFL_GENSOGPERECO_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_ELABORA, MyGlb.PANEL_LIST, 348, 212, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_ELABORA, MyGlb.PANEL_FORM, 456, 192, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_GENSOGPERECO.SetFieldPage(PFL_GENSOGPERECO_ELABORA, -1, -1);
    PAN_GENSOGPERECO.SetFieldPanel(PFL_GENSOGPERECO_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNE, MyGlb.PANEL_LIST, 48);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNE, MyGlb.PANEL_LIST, 1);
    PAN_GENSOGPERECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNE, MyGlb.PANEL_LIST, "Com.");
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNE, MyGlb.PANEL_FORM, 4, 172, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNE, MyGlb.PANEL_FORM, 48);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNE, MyGlb.PANEL_FORM, 1);
    PAN_GENSOGPERECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_COMUNE, MyGlb.PANEL_FORM, "Com.");
    PAN_GENSOGPERECO.SetFieldPage(PFL_GENSOGPERECO_COMUNE, -1, -1);
    PAN_GENSOGPERECO.SetFieldPanel(PFL_GENSOGPERECO_COMUNE, PPQRY_PAR51, "A.ROWNAMECOMUN", "ROWNAMECOMUN", 1, 3, 0, -13997);
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP1, MyGlb.PANEL_LIST, 32);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP1, MyGlb.PANEL_LIST, 1);
    PAN_GENSOGPERECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP1, MyGlb.PANEL_LIST, "CAP 1");
    PAN_GENSOGPERECO.SetRect(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP1, MyGlb.PANEL_FORM, 4, 220, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENSOGPERECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP1, MyGlb.PANEL_FORM, 32);
    PAN_GENSOGPERECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP1, MyGlb.PANEL_FORM, 1);
    PAN_GENSOGPERECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENSOGPERECO_CAP1, MyGlb.PANEL_FORM, "C. 1");
    PAN_GENSOGPERECO.SetFieldPage(PFL_GENSOGPERECO_CAP1, -1, -1);
    PAN_GENSOGPERECO.SetFieldPanel(PFL_GENSOGPERECO_CAP1, PPQRY_PAR51, "A.ROWNAMECAP", "ROWNAMECAP", 1, 5, 0, -13997);
  }

  private void PAN_GENSOGPERECO_InitQueries()
  {
    StringBuffer SQL;

    PAN_GENSOGPERECO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DENOMINAZIONE as COMUNIDENOMI, ");
    SQL.append("  A.PROVINCIA_STATO as COMUPROVSTAT, ");
    SQL.append("  A.COMUNE as COMUNE, ");
    SQL.append("  CASE WHEN A.COMUNE = 0 THEN 'EST' ELSE B.SIGLA END as COMUPROVSIGL, ");
    SQL.append("  A.CAP as COMUNICAP ");
    SQL.append("from ");
    SQL.append("  AD4_COMUNI A, ");
    SQL.append("  AD4_PROVINCIE B ");
    SQL.append("where (A.COMUNE = ~~ROWNAMECOMUN~~) ");
    SQL.append("and   (A.PROVINCIA_STATO = ~~ROWNAMEPROVI~~) ");
    SQL.append("and   (B.PROVINCIA(+) = A.PROVINCIA_STATO) ");
    PAN_GENSOGPERECO.SetQuery(PPQRY_COMUNI, 0, SQL, -1, "");
    PAN_GENSOGPERECO.SetQueryDB(PPQRY_COMUNI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_GENSOGPERECO.SetMasterTable(PPQRY_COMUNI, "AD4_COMUNI");
    PAN_GENSOGPERECO.SetQueryLKE(PPQRY_COMUNI, PFL_GENSOGPERECO_PROVINNUMERO, "COMUPROVSTAT");
    PAN_GENSOGPERECO.SetQueryLKE(PPQRY_COMUNI, PFL_GENSOGPERECO_COMUNE, "COMUNE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DENOMINAZIONE as COMUNIDENOMI, ");
    SQL.append("  A.PROVINCIA_STATO as COMUPROVSTAT, ");
    SQL.append("  A.COMUNE as COMUNE, ");
    SQL.append("  CASE WHEN A.COMUNE = 0 THEN 'EST' ELSE B.SIGLA END as COMUPROVSIGL, ");
    SQL.append("  A.CAP as COMUNICAP ");
    SQL.append("from ");
    SQL.append("  AD4_COMUNI A, ");
    SQL.append("  AD4_PROVINCIE B ");
    SQL.append("where (B.PROVINCIA(+) = A.PROVINCIA_STATO) ");
    PAN_GENSOGPERECO.SetQuery(PPQRY_COMUNI, 1, SQL, -1, "");
    PAN_GENSOGPERECO.SetQueryHeaderColumn(PPQRY_COMUNI, "COMUNIDENOMI", "COMUNI DENOMINAZIONE");
    PAN_GENSOGPERECO.SetQueryHeaderColumn(PPQRY_COMUNI, "COMUPROVSIGL", "PROVINCIA SIGLA");
    PAN_GENSOGPERECO.SetQueryHeaderColumn(PPQRY_COMUNI, "COMUNICAP", "COMUNI CAP");
    PAN_GENSOGPERECO.SetIMDB(IMDB, "PQRY_PAR51", true);
    PAN_GENSOGPERECO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_GENSOGPERECO.SetQueryIMDB(PPQRY_PAR51, IMDBDef9.PQRY_PAR51_RS, IMDBDef2.TBL_PAR52);
    JustLoaded = true;
    PAN_GENSOGPERECO.SetFieldPrimaryIndex(PFL_GENSOGPERECO_SOLOCONTCOMU, IMDBDef2.FLD_PAR52_ROWNAMSOCOCO);
    PAN_GENSOGPERECO.SetFieldPrimaryIndex(PFL_GENSOGPERECO_PROVINNUMERO, IMDBDef2.FLD_PAR52_ROWNAMEPROVI);
    PAN_GENSOGPERECO.SetFieldPrimaryIndex(PFL_GENSOGPERECO_COMUNE, IMDBDef2.FLD_PAR52_ROWNAMECOMUN);
    PAN_GENSOGPERECO.SetFieldPrimaryIndex(PFL_GENSOGPERECO_CAP1, IMDBDef2.FLD_PAR52_ROWNAMECAP);
    PAN_GENSOGPERECO.SetMasterTable(0, "PAR52");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_GENSOGPERECO.Status() == 2)
    {
      int oldListQBE = PAN_GENSOGPERECO.iUseListQBE;
      PAN_GENSOGPERECO.iUseListQBE = 0;
      PAN_GENSOGPERECO.PanelCommand(Glb.PCM_SEARCH);
      PAN_GENSOGPERECO.PanelCommand(Glb.PCM_FIND);
      PAN_GENSOGPERECO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_GENSOGPERECO) PAN_GENSOGPERECO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_GENSOGPERECO) PAN_GENSOGPERECO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_GENSOGPERECO) PAN_GENSOGPERECO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_GENSOGPERECO) PAN_GENSOGPERECO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_GENSOGPERECO) PAN_GENSOGPERECO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
