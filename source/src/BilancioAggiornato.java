// **********************************************
// Bilancio Aggiornato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class BilancioAggiornato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_BILANCAGGIOR_STAMPA = 0;
  private static int GRP_BILANCAGGIOR_PARTE = 1;
  private static int GRP_BILANCAGGIOR_VARIAZIONI = 2;

  private static int PFL_BILANCAGGIOR_DETTAGLIO = 0;
  private static int PFL_BILANCAGGIOR_COMMENTO = 1;
  private static int PFL_BILANCAGGIOR_STAMPA = 2;
  private static int PFL_BILANCAGGIOR_NEWPANELABE2 = 3;
  private static int PFL_BILANCAGGIOR_PARTE = 4;
  private static int PFL_BILANCAGGIOR_NEWPANELABE1 = 5;
  private static int PFL_BILANCAGGIOR_DAL = 6;
  private static int PFL_BILANCAGGIOR_AL = 7;
  private static int PFL_BILANCAGGIOR_NEWPANELLABE = 8;
  private static int PFL_BILANCAGGIOR_ELABORA = 9;

  private static int PPQRY_NEWTABLE13 = 0;


  IDPanel PAN_BILANCAGGIOR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE4(IMDB);
    //
    //
    Init_PQRY_NEWTABLE13(IMDB);
    Init_PQRY_NEWTABLE13_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_NEWTABLE4, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_NEWTABLE4, "TBL_NEWTABLE4");
    IMDB.set_FldCode(IMDBDef3.TBL_NEWTABLE4,IMDBDef3.FLD_NEWTABLE4_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef3.TBL_NEWTABLE4,IMDBDef3.FLD_NEWTABLE4_ROWNAMEDETTA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_NEWTABLE4,IMDBDef3.FLD_NEWTABLE4_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_NEWTABLE4,IMDBDef3.FLD_NEWTABLE4_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_NEWTABLE4,IMDBDef3.FLD_NEWTABLE4_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef3.TBL_NEWTABLE4,IMDBDef3.FLD_NEWTABLE4_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef3.TBL_NEWTABLE4,IMDBDef3.FLD_NEWTABLE4_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef3.TBL_NEWTABLE4,IMDBDef3.FLD_NEWTABLE4_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef3.TBL_NEWTABLE4,IMDBDef3.FLD_NEWTABLE4_ROWNAMECOMME, "ROWNAMECOMME");
    IMDB.SetFldParams(IMDBDef3.TBL_NEWTABLE4,IMDBDef3.FLD_NEWTABLE4_ROWNAMECOMME,5,40,0);
    IMDB.set_FldCode(IMDBDef3.TBL_NEWTABLE4,IMDBDef3.FLD_NEWTABLE4_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_NEWTABLE4,IMDBDef3.FLD_NEWTABLE4_ROWNAMESTAMP,1,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_NEWTABLE4, 0);
  }

  private static void Init_PQRY_NEWTABLE13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_NEWTABLE13, 6);
    IMDB.set_TblCode(IMDBDef11.PQRY_NEWTABLE13, "PQRY_NEWTABLE13");
    IMDB.set_FldCode(IMDBDef11.PQRY_NEWTABLE13,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef11.PQRY_NEWTABLE13,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDETTA,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NEWTABLE13,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_NEWTABLE13,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NEWTABLE13,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_NEWTABLE13,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NEWTABLE13,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_NEWTABLE13,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NEWTABLE13,IMDBDef11.PQSL_NEWTABLE13_ROWNAMECOMME, "ROWNAMECOMME");
    IMDB.SetFldParams(IMDBDef11.PQRY_NEWTABLE13,IMDBDef11.PQSL_NEWTABLE13_ROWNAMECOMME,5,40,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NEWTABLE13,IMDBDef11.PQSL_NEWTABLE13_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_NEWTABLE13,IMDBDef11.PQSL_NEWTABLE13_ROWNAMESTAMP,1,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_NEWTABLE13, 0);
  }

  private static void Init_PQRY_NEWTABLE13_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_NEWTABLE13_RS, 6);
    IMDB.set_TblCode(IMDBDef11.PQRY_NEWTABLE13_RS, "PQRY_NEWTABLE13_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_NEWTABLE13_RS,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef11.PQRY_NEWTABLE13_RS,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDETTA,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NEWTABLE13_RS,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_NEWTABLE13_RS,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NEWTABLE13_RS,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_NEWTABLE13_RS,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NEWTABLE13_RS,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_NEWTABLE13_RS,IMDBDef11.PQSL_NEWTABLE13_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NEWTABLE13_RS,IMDBDef11.PQSL_NEWTABLE13_ROWNAMECOMME, "ROWNAMECOMME");
    IMDB.SetFldParams(IMDBDef11.PQRY_NEWTABLE13_RS,IMDBDef11.PQSL_NEWTABLE13_ROWNAMECOMME,5,40,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NEWTABLE13_RS,IMDBDef11.PQSL_NEWTABLE13_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_NEWTABLE13_RS,IMDBDef11.PQSL_NEWTABLE13_ROWNAMESTAMP,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public BilancioAggiornato(MyWebEntryPoint w, IMDBObj imdb)
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
  public BilancioAggiornato()
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
    FormIdx = MyGlb.FRM_BILANCAGGIOR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "134FC0C6-755B-4C12-95D3-B2ABCA606BF3";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 472;
    DesignHeight = 322;
    set_Caption(new IDVariant("Bilancio Aggiornato"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 472;
    Frames[1].Height = 296;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Bilancio Aggiornato";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 296;
    PAN_BILANCAGGIOR = new IDPanel(w, this, 1, "PAN_BILANCAGGIOR");
    Frames[1].Content = PAN_BILANCAGGIOR;
    PAN_BILANCAGGIOR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BILANCAGGIOR.VS = MainFrm.VisualStyleList;
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 472-MyGlb.PAN_OFFS_X, 296-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BILANCAGGIOR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E18245D5-4B50-4E01-9DC2-E5E0BC9FAFDF");
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 620, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_BILANCAGGIOR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BILANCAGGIOR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BILANCAGGIOR.InitStatus = 2;
    PAN_BILANCAGGIOR_Init();
    PAN_BILANCAGGIOR_InitFields();
    PAN_BILANCAGGIOR_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_NEWTABLE4, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        BILANCAGGIOR_NEWTABLE13();
      }
      PAN_BILANCAGGIOR.UpdatePanel(MainFrm);
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
    return (obj instanceof BilancioAggiornato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? BilancioAggiornato.class.getName() : (Glb.ClassWithPackage(BilancioAggiornato.class) ? BilancioAggiornato.class.getName().substring(BilancioAggiornato.class.getPackage().getName().length() + 1) : BilancioAggiornato.class.getName()));
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_NEWTABLE4, IMDBDef3.FLD_NEWTABLE4_ROWNAMESTAMP, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_NEWTABLE4, IMDBDef3.FLD_NEWTABLE4_ROWNAMEPARTE, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_NEWTABLE4, IMDBDef3.FLD_NEWTABLE4_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef3.TBL_NEWTABLE4, IMDBDef3.FLD_NEWTABLE4_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef3.TBL_NEWTABLE4, IMDBDef3.FLD_NEWTABLE4_ROWNAMEDETTA, 0, (new IDVariant("NO")));
      PAN_BILANCAGGIOR.SetFlags (Glb.OBJ_GROUP, GRP_BILANCAGGIOR_STAMPA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioAggiornato", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_NEWTABLE4, IMDBDef3.FLD_NEWTABLE4_ROWNAMECOMME, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioAggiornato", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // OK
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COMMENTO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_VARIAZIONI1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_VARIAZIONI2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_AL = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SPACEFAKE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_VARIAZIONI1 = (new IDVariant("Variazioni%20%20dal", IDVariant.STRING));
      v_VARIAZIONI2 = (new IDVariant("Variazioni%20%20del", IDVariant.STRING));
      v_AL = (new IDVariant("al", IDVariant.STRING));
      v_SPACEFAKE = (new IDVariant("%20%20", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDAL, 0),(new IDVariant("1900/01/01# 00:00:00", IDVariant.DATETIME))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEAL, 0),(new IDVariant("2999/12/31# 00:00:00", IDVariant.DATETIME))), true)>0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Data dal non può essere maggiore di data al", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMECOMME, 0))))
      {
        v_COMMENTO = IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMECOMME, 0);
      }
      else
      {
        if (IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDAL, 0).equals(IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEAL, 0), true))
        {
          v_COMMENTO = IDL.Add(IDL.Add(IDL.Add(v_VARIAZIONI2, v_SPACEFAKE), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDAL, 0)));
        }
        else
        {
          v_COMMENTO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_VARIAZIONI1, v_SPACEFAKE), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDAL, 0))), v_SPACEFAKE), v_AL), v_SPACEFAKE), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEAL, 0)));
        }
      }
      if (IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMESTAMP, 0).equals((new IDVariant(0)), true))
      {
        IDVariant v_DATAWINDOW = new IDVariant(0,IDVariant.STRING);
        v_DATAWINDOW = (new IDVariant("d_bil_agg_intestazione", IDVariant.STRING));
        MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampa(v_COMMENTO);
        MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DATAWINDOW);
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      else
      {
        IDVariant v_DWENTRATA = new IDVariant(0,IDVariant.STRING);
        v_DWENTRATA = (new IDVariant("d_bil_aggiornato1_dettaglio_entrata", IDVariant.STRING));
        IDVariant v_DWSPESA = new IDVariant(0,IDVariant.STRING);
        v_DWSPESA = (new IDVariant("d_bil_aggiornato1_dettaglio_spesa", IDVariant.STRING));
        IDVariant v_DWCORNICE = new IDVariant(0,IDVariant.STRING);
        v_DWCORNICE = (new IDVariant("d_bil_aggiornato1_riepilogo_cornice", IDVariant.STRING));
        if (IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEPARTE, 0).equals((new IDVariant("E")), true) && IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDETTA, 0).equals((new IDVariant("SI")), true))
        {
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef3.TBL_NEWTABLE4, IMDBDef3.FLD_NEWTABLE4_ROWNAMEDETTA, 0)));
          MainFrm.SetParametroStampa((new IDVariant("E")));
          MainFrm.SetParametroStampa(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDAL, 0)), (new IDVariant("%20%2000:00:00"))));
          MainFrm.SetParametroStampa(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEAL, 0)), (new IDVariant("%20%2000:00:00"))));
          MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DWENTRATA);
        }
        if (IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEPARTE, 0).equals((new IDVariant("S")), true) && IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDETTA, 0).equals((new IDVariant("SI")), true))
        {
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef3.TBL_NEWTABLE4, IMDBDef3.FLD_NEWTABLE4_ROWNAMEDETTA, 0)));
          MainFrm.SetParametroStampa((new IDVariant("S")));
          MainFrm.SetParametroStampa(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDAL, 0)), (new IDVariant("%20%2000:00:00"))));
          MainFrm.SetParametroStampa(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEAL, 0)), (new IDVariant("%20%2000:00:00"))));
          MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DWSPESA);
        }
        if (IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDETTA, 0).equals((new IDVariant("NO")), true))
        {
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampa(IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEPARTE, 0));
          MainFrm.SetParametroStampa(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEDAL, 0)), (new IDVariant("%20%2000:00:00"))));
          MainFrm.SetParametroStampa(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef11.PQRY_NEWTABLE13, IMDBDef11.PQSL_NEWTABLE13_ROWNAMEAL, 0)), (new IDVariant("%20%2000:00:00"))));
          MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DWCORNICE);
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioAggiornato", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla
  // Annulla
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
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioAggiornato", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void BILANCAGGIOR_NEWTABLE13() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_NEWTABLE13_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_NEWTABLE4, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_NEWTABLE4, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_NEWTABLE13_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_NEWTABLE13_RS, 0, IMDBDef3.TBL_NEWTABLE4, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_NEWTABLE13_RS, 0, 0, IMDBDef3.TBL_NEWTABLE4, IMDBDef3.FLD_NEWTABLE4_ROWNAMEDETTA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_NEWTABLE13_RS, 1, 0, IMDBDef3.TBL_NEWTABLE4, IMDBDef3.FLD_NEWTABLE4_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_NEWTABLE13_RS, 2, 0, IMDBDef3.TBL_NEWTABLE4, IMDBDef3.FLD_NEWTABLE4_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_NEWTABLE13_RS, 3, 0, IMDBDef3.TBL_NEWTABLE4, IMDBDef3.FLD_NEWTABLE4_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_NEWTABLE13_RS, 4, 0, IMDBDef3.TBL_NEWTABLE4, IMDBDef3.FLD_NEWTABLE4_ROWNAMECOMME, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_NEWTABLE13_RS, 5, 0, IMDBDef3.TBL_NEWTABLE4, IMDBDef3.FLD_NEWTABLE4_ROWNAMESTAMP, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_NEWTABLE4, 0);
      if (IMDB.Eof(IMDBDef3.TBL_NEWTABLE4, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_NEWTABLE4, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_NEWTABLE13_RS, 0);
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
  private void PAN_BILANCAGGIOR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BILANCAGGIOR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BILANCAGGIOR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BILANCAGGIOR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BILANCAGGIOR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_BILANCAGGIOR);
    // Stub
  }

  private void PAN_BILANCAGGIOR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_BILANCAGGIOR_ELABORA)
    {
      this.IdxPanelActived = this.PAN_BILANCAGGIOR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_BILANCAGGIOR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_BILANCAGGIOR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BILANCAGGIOR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BILANCAGGIOR_Init()
  {

    PAN_BILANCAGGIOR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BILANCAGGIOR.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_BILANCAGGIOR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_STAMPA, "94E84058-C652-4F85-A0FD-8E3DC96B5F0B");
    PAN_BILANCAGGIOR.set_Header(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_STAMPA, "Stampa");
    PAN_BILANCAGGIOR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_STAMPA, "");
    PAN_BILANCAGGIOR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_STAMPA, MyGlb.VIS_GROUPSTYLE);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_STAMPA, MyGlb.PANEL_LIST, 0, -9999, 44, 16, 0, 0);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_STAMPA, MyGlb.PANEL_FORM, 20, 7, 288, 53, 0, 0);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_STAMPA, 0, 44);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_STAMPA, 1, 13);
    PAN_BILANCAGGIOR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_STAMPA, 0, 4);
    PAN_BILANCAGGIOR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_STAMPA, 1, 4);
    PAN_BILANCAGGIOR.SetFlags(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_STAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILANCAGGIOR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_PARTE, "4712546C-8FE9-43E3-84B3-3EEB22AE8819");
    PAN_BILANCAGGIOR.set_Header(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_PARTE, "Parte");
    PAN_BILANCAGGIOR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_PARTE, "");
    PAN_BILANCAGGIOR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_PARTE, MyGlb.PANEL_LIST, 80, -9999, 64, 16, 0, 0);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_PARTE, MyGlb.PANEL_FORM, 20, 67, 288, 49, 0, 0);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_PARTE, 0, 31);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_PARTE, 1, 13);
    PAN_BILANCAGGIOR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_PARTE, 0, 4);
    PAN_BILANCAGGIOR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_PARTE, 1, 4);
    PAN_BILANCAGGIOR.SetFlags(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILANCAGGIOR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_VARIAZIONI, "BA4B4B8E-9F39-4B34-B7CB-18C2A5C8090F");
    PAN_BILANCAGGIOR.set_Header(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_VARIAZIONI, "Variazioni");
    PAN_BILANCAGGIOR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_VARIAZIONI, "");
    PAN_BILANCAGGIOR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_VARIAZIONI, MyGlb.PANEL_LIST, 144, -9999, 208, 16, 0, 0);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_VARIAZIONI, MyGlb.PANEL_FORM, 20, 123, 376, 49, 0, 0);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_VARIAZIONI, 0, 55);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_VARIAZIONI, 1, 13);
    PAN_BILANCAGGIOR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_VARIAZIONI, 0, 4);
    PAN_BILANCAGGIOR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_VARIAZIONI, 1, 4);
    PAN_BILANCAGGIOR.SetFlags(MyGlb.OBJ_GROUP, GRP_BILANCAGGIOR_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILANCAGGIOR.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_BILANCAGGIOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DETTAGLIO, "A4CB9076-8A3E-4E2B-92EF-16496052C09D");
    PAN_BILANCAGGIOR.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DETTAGLIO, "Dettaglio");
    PAN_BILANCAGGIOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DETTAGLIO, "");
    PAN_BILANCAGGIOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DETTAGLIO, MyGlb.VIS_CHECKSTYLE);
    PAN_BILANCAGGIOR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DETTAGLIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCAGGIOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_COMMENTO, "55FE2C97-961B-4903-8B8E-B0F3EC2B11F6");
    PAN_BILANCAGGIOR.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_COMMENTO, "Commento");
    PAN_BILANCAGGIOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_COMMENTO, "");
    PAN_BILANCAGGIOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_COMMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_BILANCAGGIOR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_COMMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCAGGIOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_STAMPA, "203C0293-BF6C-4303-8E1F-D6AD48E96458");
    PAN_BILANCAGGIOR.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_STAMPA, "Stampa");
    PAN_BILANCAGGIOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_STAMPA, "");
    PAN_BILANCAGGIOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_STAMPA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_BILANCAGGIOR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_STAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCAGGIOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE2, "4D0EB283-6FC9-45F7-93F3-E0CB5EFFB4A9");
    PAN_BILANCAGGIOR.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE2, "");
    PAN_BILANCAGGIOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_BILANCAGGIOR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILANCAGGIOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_PARTE, "202576EA-0635-47F9-B75C-C2DC9B9AD515");
    PAN_BILANCAGGIOR.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_PARTE, "Parte");
    PAN_BILANCAGGIOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_PARTE, "");
    PAN_BILANCAGGIOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_BILANCAGGIOR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCAGGIOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE1, "4116ABB7-F7BE-4D3D-AB22-D900DF831BF4");
    PAN_BILANCAGGIOR.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE1, "");
    PAN_BILANCAGGIOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_BILANCAGGIOR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILANCAGGIOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DAL, "2E2E4A2C-ABE1-49C0-A025-2D1995583151");
    PAN_BILANCAGGIOR.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DAL, "Dal");
    PAN_BILANCAGGIOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DAL, "");
    PAN_BILANCAGGIOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_BILANCAGGIOR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCAGGIOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_AL, "AAD6326B-B660-49ED-B9DA-AC514D0D3115");
    PAN_BILANCAGGIOR.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_AL, "Al");
    PAN_BILANCAGGIOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_AL, "");
    PAN_BILANCAGGIOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_BILANCAGGIOR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCAGGIOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELLABE, "A35DB60F-8ADC-44FE-A156-EAE04902E5D8");
    PAN_BILANCAGGIOR.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELLABE, "");
    PAN_BILANCAGGIOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_BILANCAGGIOR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILANCAGGIOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_ELABORA, "F48D28D7-2306-463C-8AD5-BCC78A172201");
    PAN_BILANCAGGIOR.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_ELABORA, "Elabora");
    PAN_BILANCAGGIOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_BILANCAGGIOR.SetImage(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_ELABORA, 0, "button1.gif", false);
    PAN_BILANCAGGIOR.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_BILANCAGGIOR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DETTAGLIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DETTAGLIO, MyGlb.PANEL_LIST, 52);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DETTAGLIO, MyGlb.PANEL_LIST, 1);
    PAN_BILANCAGGIOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DETTAGLIO, MyGlb.PANEL_LIST, "Dettaglio");
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DETTAGLIO, MyGlb.PANEL_FORM, 308, 96, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DETTAGLIO, MyGlb.PANEL_FORM, 64);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DETTAGLIO, MyGlb.PANEL_FORM, 1);
    PAN_BILANCAGGIOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DETTAGLIO, MyGlb.PANEL_FORM, "Dettaglio");
    PAN_BILANCAGGIOR.SetFieldPage(PFL_BILANCAGGIOR_DETTAGLIO, -1, -1);
    PAN_BILANCAGGIOR.SetFieldPanel(PFL_BILANCAGGIOR_DETTAGLIO, PPQRY_NEWTABLE13, "A.ROWNAMEDETTA", "ROWNAMEDETTA", 5, 2, 0, -13997);
    PAN_BILANCAGGIOR.SetValueListItem(PFL_BILANCAGGIOR_DETTAGLIO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_BILANCAGGIOR.SetValueListItem(PFL_BILANCAGGIOR_DETTAGLIO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_COMMENTO, MyGlb.PANEL_LIST, 352, 36, 224, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_COMMENTO, MyGlb.PANEL_LIST, 60);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_COMMENTO, MyGlb.PANEL_LIST, 1);
    PAN_BILANCAGGIOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_COMMENTO, MyGlb.PANEL_LIST, "Commento");
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_COMMENTO, MyGlb.PANEL_FORM, 20, 180, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_COMMENTO, MyGlb.PANEL_FORM, 76);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_COMMENTO, MyGlb.PANEL_FORM, 1);
    PAN_BILANCAGGIOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_COMMENTO, MyGlb.PANEL_FORM, "Commento");
    PAN_BILANCAGGIOR.SetFieldPage(PFL_BILANCAGGIOR_COMMENTO, -1, -1);
    PAN_BILANCAGGIOR.SetFieldPanel(PFL_BILANCAGGIOR_COMMENTO, PPQRY_NEWTABLE13, "A.ROWNAMECOMME", "ROWNAMECOMME", 5, 40, 0, -13997);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_STAMPA, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_STAMPA, MyGlb.PANEL_LIST, 44);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_STAMPA, MyGlb.PANEL_LIST, 1);
    PAN_BILANCAGGIOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_STAMPA, MyGlb.PANEL_LIST, "Stam.");
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_STAMPA, MyGlb.PANEL_FORM, 84, 32, 220, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_STAMPA, MyGlb.PANEL_FORM, 44);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_STAMPA, MyGlb.PANEL_FORM, 1);
    PAN_BILANCAGGIOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_STAMPA, MyGlb.PANEL_FORM, "Stam.");
    PAN_BILANCAGGIOR.SetFieldPage(PFL_BILANCAGGIOR_STAMPA, -1, GRP_BILANCAGGIOR_STAMPA);
    PAN_BILANCAGGIOR.SetFieldPanel(PFL_BILANCAGGIOR_STAMPA, PPQRY_NEWTABLE13, "A.ROWNAMESTAMP", "ROWNAMESTAMP", 1, 1, 0, -13997);
    PAN_BILANCAGGIOR.SetValueListItem(PFL_BILANCAGGIOR_STAMPA, (new IDVariant(0)), "Copertina", "", "", -1);
    PAN_BILANCAGGIOR.SetValueListItem(PFL_BILANCAGGIOR_STAMPA, (new IDVariant(1)), "Bil. Aggiornato", "", "", -1);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE2, MyGlb.PANEL_LIST, 236, 24, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE2, MyGlb.PANEL_FORM, 24, 44, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_BILANCAGGIOR.SetFieldPage(PFL_BILANCAGGIOR_NEWPANELABE2, -1, GRP_BILANCAGGIOR_STAMPA);
    PAN_BILANCAGGIOR.SetFieldPanel(PFL_BILANCAGGIOR_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_PARTE, MyGlb.PANEL_LIST, 80, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_BILANCAGGIOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_PARTE, MyGlb.PANEL_FORM, 88, 92, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_PARTE, MyGlb.PANEL_FORM, 44);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_BILANCAGGIOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_BILANCAGGIOR.SetFieldPage(PFL_BILANCAGGIOR_PARTE, -1, GRP_BILANCAGGIOR_PARTE);
    PAN_BILANCAGGIOR.SetFieldPanel(PFL_BILANCAGGIOR_PARTE, PPQRY_NEWTABLE13, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 1, 0, -13997);
    PAN_BILANCAGGIOR.SetValueListItem(PFL_BILANCAGGIOR_PARTE, (new IDVariant("E")), "Entrata          ", "Parte Entrata", "", -1);
    PAN_BILANCAGGIOR.SetValueListItem(PFL_BILANCAGGIOR_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE1, MyGlb.PANEL_LIST, 212, 80, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE1, MyGlb.PANEL_FORM, 24, 100, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_BILANCAGGIOR.SetFieldPage(PFL_BILANCAGGIOR_NEWPANELABE1, -1, GRP_BILANCAGGIOR_PARTE);
    PAN_BILANCAGGIOR.SetFieldPanel(PFL_BILANCAGGIOR_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DAL, MyGlb.PANEL_LIST, 144, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DAL, MyGlb.PANEL_LIST, 24);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DAL, MyGlb.PANEL_LIST, 1);
    PAN_BILANCAGGIOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DAL, MyGlb.PANEL_FORM, 24, 148, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DAL, MyGlb.PANEL_FORM, 56);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DAL, MyGlb.PANEL_FORM, 1);
    PAN_BILANCAGGIOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_BILANCAGGIOR.SetFieldPage(PFL_BILANCAGGIOR_DAL, -1, GRP_BILANCAGGIOR_VARIAZIONI);
    PAN_BILANCAGGIOR.SetFieldPanel(PFL_BILANCAGGIOR_DAL, PPQRY_NEWTABLE13, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_AL, MyGlb.PANEL_LIST, 248, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_AL, MyGlb.PANEL_LIST, 20);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_AL, MyGlb.PANEL_LIST, 1);
    PAN_BILANCAGGIOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_AL, MyGlb.PANEL_LIST, "Al");
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_AL, MyGlb.PANEL_FORM, 196, 148, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_AL, MyGlb.PANEL_FORM, 20);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_AL, MyGlb.PANEL_FORM, 1);
    PAN_BILANCAGGIOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_AL, MyGlb.PANEL_FORM, "Al");
    PAN_BILANCAGGIOR.SetFieldPage(PFL_BILANCAGGIOR_AL, -1, GRP_BILANCAGGIOR_VARIAZIONI);
    PAN_BILANCAGGIOR.SetFieldPanel(PFL_BILANCAGGIOR_AL, PPQRY_NEWTABLE13, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELLABE, MyGlb.PANEL_LIST, 256, 136, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELLABE, MyGlb.PANEL_FORM, 380, 152, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_BILANCAGGIOR.SetFieldPage(PFL_BILANCAGGIOR_NEWPANELLABE, -1, GRP_BILANCAGGIOR_VARIAZIONI);
    PAN_BILANCAGGIOR.SetFieldPanel(PFL_BILANCAGGIOR_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_ELABORA, MyGlb.PANEL_LIST, 236, 220, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_BILANCAGGIOR.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_ELABORA, MyGlb.PANEL_FORM, 308, 204, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCAGGIOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_BILANCAGGIOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCAGGIOR_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_BILANCAGGIOR.SetFieldPage(PFL_BILANCAGGIOR_ELABORA, -1, -1);
    PAN_BILANCAGGIOR.SetFieldPanel(PFL_BILANCAGGIOR_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_BILANCAGGIOR_InitQueries()
  {
    StringBuffer SQL;

    PAN_BILANCAGGIOR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_BILANCAGGIOR.SetIMDB(IMDB, "PQRY_NEWTABLE13", true);
    PAN_BILANCAGGIOR.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_BILANCAGGIOR.SetQueryIMDB(PPQRY_NEWTABLE13, IMDBDef11.PQRY_NEWTABLE13_RS, IMDBDef3.TBL_NEWTABLE4);
    JustLoaded = true;
    PAN_BILANCAGGIOR.SetFieldPrimaryIndex(PFL_BILANCAGGIOR_DETTAGLIO, IMDBDef3.FLD_NEWTABLE4_ROWNAMEDETTA);
    PAN_BILANCAGGIOR.SetFieldPrimaryIndex(PFL_BILANCAGGIOR_COMMENTO, IMDBDef3.FLD_NEWTABLE4_ROWNAMECOMME);
    PAN_BILANCAGGIOR.SetFieldPrimaryIndex(PFL_BILANCAGGIOR_STAMPA, IMDBDef3.FLD_NEWTABLE4_ROWNAMESTAMP);
    PAN_BILANCAGGIOR.SetFieldPrimaryIndex(PFL_BILANCAGGIOR_PARTE, IMDBDef3.FLD_NEWTABLE4_ROWNAMEPARTE);
    PAN_BILANCAGGIOR.SetFieldPrimaryIndex(PFL_BILANCAGGIOR_DAL, IMDBDef3.FLD_NEWTABLE4_ROWNAMEDAL);
    PAN_BILANCAGGIOR.SetFieldPrimaryIndex(PFL_BILANCAGGIOR_AL, IMDBDef3.FLD_NEWTABLE4_ROWNAMEAL);
    PAN_BILANCAGGIOR.SetMasterTable(0, "NEWTABLE4");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BILANCAGGIOR.Status() == 2)
    {
      int oldListQBE = PAN_BILANCAGGIOR.iUseListQBE;
      PAN_BILANCAGGIOR.iUseListQBE = 0;
      PAN_BILANCAGGIOR.PanelCommand(Glb.PCM_SEARCH);
      PAN_BILANCAGGIOR.PanelCommand(Glb.PCM_FIND);
      PAN_BILANCAGGIOR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BILANCAGGIOR) PAN_BILANCAGGIOR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BILANCAGGIOR) PAN_BILANCAGGIOR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BILANCAGGIOR) PAN_BILANCAGGIOR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BILANCAGGIOR) PAN_BILANCAGGIOR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_BILANCAGGIOR) PAN_BILANCAGGIOR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
