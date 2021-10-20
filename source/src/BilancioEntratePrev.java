// **********************************************
// Bilancio Entrate Prev
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class BilancioEntratePrev extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_BILAENTRPREV_ESERCIZIO = 0;
  private static int PFL_BILAENTRPREV_ETICUTILAVAN = 1;
  private static int PFL_BILAENTRPREV_ETIPREANNPRE = 2;
  private static int PFL_BILAENTRPREV_ETICPREVANNO = 3;
  private static int PFL_BILAENTRPREV_ETICPREVANN1 = 4;
  private static int PFL_BILAENTRPREV_ETICPREVANN2 = 5;
  private static int PFL_BILAENTRPREV_UTFONANTLIPR = 6;
  private static int PFL_BILAENTRPREV_UTFONANTLIQ1 = 7;
  private static int PFL_BILAENTRPREV_UTFONANTLIQ2 = 8;
  private static int PFL_BILAENTRPREV_UTFONANTLIQ3 = 9;
  private static int PFL_BILAENTRPREV_ETICHEELABOR = 10;

  private static int PPQRY_BILPREVEQUI1 = 0;


  IDPanel PAN_BILAENTRPREV;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI673(IMDB);
    //
    //
    Init_PQRY_BILPREVEQUI1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI673(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI673, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI673, "TBL_PARAMETRI673");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI673,IMDBDef3.FLD_PARAMETRI673_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI673,IMDBDef3.FLD_PARAMETRI673_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI673,IMDBDef3.FLD_PARAMETRI673_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI673,IMDBDef3.FLD_PARAMETRI673_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI673,IMDBDef3.FLD_PARAMETRI673_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI673,IMDBDef3.FLD_PARAMETRI673_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI673,IMDBDef3.FLD_PARAMETRI673_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI673,IMDBDef3.FLD_PARAMETRI673_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI673,IMDBDef3.FLD_PARAMETRI673_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI673,IMDBDef3.FLD_PARAMETRI673_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI673,IMDBDef3.FLD_PARAMETRI673_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI673,IMDBDef3.FLD_PARAMETRI673_PARANOMEFILE,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI673, 0);
  }

  private static void Init_PQRY_BILPREVEQUI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILPREVEQUI1, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILPREVEQUI1, "PQRY_BILPREVEQUI1");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUI1,IMDBDef11.PQSL_BILPREVEQUI1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUI1,IMDBDef11.PQSL_BILPREVEQUI1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUI1,IMDBDef11.PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_PREC, "UT_FONDO_ANTIC_LIQUIDITA_PREC");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUI1,IMDBDef11.PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_PREC,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUI1,IMDBDef11.PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_1, "UT_FONDO_ANTIC_LIQUIDITA_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUI1,IMDBDef11.PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUI1,IMDBDef11.PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_2, "UT_FONDO_ANTIC_LIQUIDITA_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUI1,IMDBDef11.PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUI1,IMDBDef11.PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_3, "UT_FONDO_ANTIC_LIQUIDITA_3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUI1,IMDBDef11.PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_3,3,14,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILPREVEQUI1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public BilancioEntratePrev(MyWebEntryPoint w, IMDBObj imdb)
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
  public BilancioEntratePrev()
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
    FormIdx = MyGlb.FRM_BILAENTRPREV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5D2B0669-DDF2-4C38-8C3A-8F4FFA03970F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 868;
    DesignHeight = 198;
    set_Caption(new IDVariant("Bilancio Entrate"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 868;
    Frames[1].Height = 172;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Bilancio Entrate Prev";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 172;
    PAN_BILAENTRPREV = new IDPanel(w, this, 1, "PAN_BILAENTRPREV");
    Frames[1].Content = PAN_BILAENTRPREV;
    PAN_BILAENTRPREV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BILAENTRPREV.VS = MainFrm.VisualStyleList;
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 868-MyGlb.PAN_OFFS_X, 172-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BILAENTRPREV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "12350EC2-0B2C-463F-8B18-D1AF9AE6AFD2");
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 380, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_BILAENTRPREV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BILAENTRPREV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BILAENTRPREV.InitStatus = 2;
    PAN_BILAENTRPREV_Init();
    PAN_BILAENTRPREV_InitFields();
    PAN_BILAENTRPREV_InitQueries();
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
      PAN_BILAENTRPREV.UpdatePanel(MainFrm);
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
    return (obj instanceof BilancioEntratePrev);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? BilancioEntratePrev.class.getName() : (Glb.ClassWithPackage(BilancioEntratePrev.class) ? BilancioEntratePrev.class.getName().substring(BilancioEntratePrev.class.getPackage().getName().length() + 1) : BilancioEntratePrev.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Bilancio Entrate Prev On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_BILAENTRPREV_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Bilancio Entrate Prev On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILPREVEQUI1, IMDBDef11.PQSL_BILPREVEQUI1_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUI1, IMDBDef11.PQSL_BILPREVEQUI1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUI1, IMDBDef11.PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_PREC, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUI1, IMDBDef11.PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_1, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUI1, IMDBDef11.PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_2, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUI1, IMDBDef11.PQSL_BILPREVEQUI1_UT_FONDO_ANTIC_LIQUIDITA_3, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioEntratePrev", "BilancioEntratePrevOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Bilancio Entrate Prev After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_BILAENTRPREV_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Bilancio Entrate Prev After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_BILAENTRPREV.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_BILAENTRPREV.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioEntratePrev", "BilancioEntratePrevAfterFind", _e);
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_BILAENTRPREV.Status()).equals((new IDVariant(3)), true))
      {
        PAN_BILAENTRPREV.PanelCommand(Glb.PCM_UPDATE);
      }
      if (new IDVariant(PAN_BILAENTRPREV.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPEPREV(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARANOTESTAM, 0), (new IDVariant()));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
        v_PAR1 = (new IDVariant("SESSIONE"));
        IDVariant v_PAR2 = new IDVariant(0,IDVariant.STRING);
        v_PAR2 = (new IDVariant("ESERCIZIO"));
        MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper(v_PAR2, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioEntratePrev", "EtichettaElabora", _e);
      return -1;
    }
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
      IDVariant v_PREVISIOANNO = new IDVariant(0,IDVariant.STRING);
      v_PREVISIOANNO = (new IDVariant("Previsioni Anno "));
      IDVariant v_PREVDEFIANNO = new IDVariant(0,IDVariant.STRING);
      v_PREVDEFIANNO = (new IDVariant("Previsioni Definitive Anno "));
      PAN_BILAENTRPREV.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_BILAENTRPREV.set_FieldText(PFL_BILAENTRPREV_ETIPREANNPRE, IDL.Add(v_PREVDEFIANNO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_BILAENTRPREV.set_FieldText(PFL_BILAENTRPREV_ETICPREVANNO, IDL.Add(v_PREVISIOANNO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_BILAENTRPREV.set_FieldText(PFL_BILAENTRPREV_ETICPREVANN1, IDL.Add(v_PREVISIOANNO, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_BILAENTRPREV.set_FieldText(PFL_BILAENTRPREV_ETICPREVANN2, IDL.Add(v_PREVISIOANNO, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioEntratePrev", "Load", _e);
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
      if (new IDVariant(PAN_BILAENTRPREV.Status()).equals((new IDVariant(3)), true))
      {
        PAN_BILAENTRPREV.PanelCommand(Glb.PCM_CANCEL);
      }
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioEntratePrev", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARANOMESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARSTANUDIPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARANOTESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARAMIDSTAMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARANOMEFILE, 0, new IDVariant());
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
  private void PAN_BILAENTRPREV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BILAENTRPREV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BILAENTRPREV_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BILAENTRPREV, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BILAENTRPREV_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_BILAENTRPREV);
    // Stub
  }

  private void PAN_BILAENTRPREV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_BILAENTRPREV_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_BILAENTRPREV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_BILAENTRPREV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_BILAENTRPREV_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_BILAENTRPREV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BILAENTRPREV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BILAENTRPREV_Init()
  {

    PAN_BILAENTRPREV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BILAENTRPREV.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_BILAENTRPREV.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_BILAENTRPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ESERCIZIO, "DFE8B611-6287-4EA6-A62C-F79DFA653FCB");
    PAN_BILAENTRPREV.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ESERCIZIO, "ESERCIZIO");
    PAN_BILAENTRPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ESERCIZIO, "");
    PAN_BILAENTRPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BILAENTRPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_BILAENTRPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICUTILAVAN, "8825055E-38CB-485F-AED3-F0E917B9A313");
    PAN_BILAENTRPREV.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICUTILAVAN, "Utilizzo Avanzo di Amministrazione");
    PAN_BILAENTRPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICUTILAVAN, MyGlb.VIS_VUOGRAALILEF);
    PAN_BILAENTRPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICUTILAVAN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILAENTRPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETIPREANNPRE, "BAF25EA6-11AD-4FFA-AF07-D430C66D00A7");
    PAN_BILAENTRPREV.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETIPREANNPRE, "Previsioni Definitive Anno ");
    PAN_BILAENTRPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETIPREANNPRE, "");
    PAN_BILAENTRPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETIPREANNPRE, MyGlb.VIS_VUOTOGRASSET);
    PAN_BILAENTRPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETIPREANNPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILAENTRPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANNO, "AA8AD646-3119-4349-B629-155BD20F33C4");
    PAN_BILAENTRPREV.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANNO, "Previsioni Anno ");
    PAN_BILAENTRPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANNO, "");
    PAN_BILAENTRPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANNO, MyGlb.VIS_VUOTOGRASSET);
    PAN_BILAENTRPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILAENTRPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN1, "37F6AF0A-E558-421A-9FC3-48EB4B49D9BD");
    PAN_BILAENTRPREV.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN1, "Previsioni Anno ");
    PAN_BILAENTRPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN1, "");
    PAN_BILAENTRPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN1, MyGlb.VIS_VUOTOGRASSET);
    PAN_BILAENTRPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILAENTRPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN2, "7EBE373D-2801-4ED5-BA89-7385F47431A7");
    PAN_BILAENTRPREV.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN2, "Previsioni Anno ");
    PAN_BILAENTRPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN2, "");
    PAN_BILAENTRPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN2, MyGlb.VIS_VUOTOGRASSET);
    PAN_BILAENTRPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILAENTRPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIPR, "F08FF844-3422-4766-8B3B-9EDEED1C0AB6");
    PAN_BILAENTRPREV.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIPR, "- di cui Utilizzo Fondo anticipazioni di liquidità");
    PAN_BILAENTRPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIPR, "");
    PAN_BILAENTRPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIPR, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILAENTRPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIPR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILAENTRPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ1, "6D845E06-F397-4DE1-AEAA-2197DC176793");
    PAN_BILAENTRPREV.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ1, "UT FONDO ANTIC LIQUIDITA 1");
    PAN_BILAENTRPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ1, "");
    PAN_BILAENTRPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ1, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILAENTRPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILAENTRPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ2, "07E6BA70-AA5C-4D65-BFC8-383991275A49");
    PAN_BILAENTRPREV.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ2, "UT FONDO ANTIC LIQUIDITA 2");
    PAN_BILAENTRPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ2, "");
    PAN_BILAENTRPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ2, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILAENTRPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILAENTRPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ3, "8991CDCB-F5A1-433A-A0BA-D0D5F63642AE");
    PAN_BILAENTRPREV.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ3, "UT FONDO ANTIC LIQUIDITA 3");
    PAN_BILAENTRPREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ3, "");
    PAN_BILAENTRPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ3, MyGlb.VIS_NOFICFIMHELE);
    PAN_BILAENTRPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILAENTRPREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICHEELABOR, "FBFAC7B9-1BB9-409D-9C71-5F9742C941CC");
    PAN_BILAENTRPREV.set_Header(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICHEELABOR, "Elabora");
    PAN_BILAENTRPREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_BILAENTRPREV.SetImage(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICHEELABOR, 0, "button1.gif", false);
    PAN_BILAENTRPREV.SetFlags(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_BILAENTRPREV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_BILAENTRPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ESERCIZIO, MyGlb.PANEL_FORM, 112);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_BILAENTRPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_BILAENTRPREV.SetFieldPage(PFL_BILAENTRPREV_ESERCIZIO, -1, -1);
    PAN_BILAENTRPREV.SetFieldPanel(PFL_BILAENTRPREV_ESERCIZIO, PPQRY_BILPREVEQUI1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICUTILAVAN, MyGlb.PANEL_LIST, 612, 20, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICUTILAVAN, MyGlb.PANEL_LIST, 0);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICUTILAVAN, MyGlb.PANEL_LIST, 1);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICUTILAVAN, MyGlb.PANEL_FORM, 16, 40, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICUTILAVAN, MyGlb.PANEL_FORM, 0);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICUTILAVAN, MyGlb.PANEL_FORM, 1);
    PAN_BILAENTRPREV.SetFieldPage(PFL_BILAENTRPREV_ETICUTILAVAN, -1, -1);
    PAN_BILAENTRPREV.SetFieldPanel(PFL_BILAENTRPREV_ETICUTILAVAN, -1, "", "ETICUTILAVAN", 0, 0, 0, -13997);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETIPREANNPRE, MyGlb.PANEL_LIST, 604, 12, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETIPREANNPRE, MyGlb.PANEL_LIST, 0);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETIPREANNPRE, MyGlb.PANEL_LIST, 1);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETIPREANNPRE, MyGlb.PANEL_FORM, 336, 12, 124, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETIPREANNPRE, MyGlb.PANEL_FORM, 0);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETIPREANNPRE, MyGlb.PANEL_FORM, 3);
    PAN_BILAENTRPREV.SetFieldPage(PFL_BILAENTRPREV_ETIPREANNPRE, -1, -1);
    PAN_BILAENTRPREV.SetFieldPanel(PFL_BILAENTRPREV_ETIPREANNPRE, -1, "", "ETIPREANNPRE", 0, 0, 0, -13997);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANNO, MyGlb.PANEL_LIST, 612, 20, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANNO, MyGlb.PANEL_LIST, 0);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANNO, MyGlb.PANEL_LIST, 1);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANNO, MyGlb.PANEL_FORM, 464, 12, 124, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANNO, MyGlb.PANEL_FORM, 0);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANNO, MyGlb.PANEL_FORM, 3);
    PAN_BILAENTRPREV.SetFieldPage(PFL_BILAENTRPREV_ETICPREVANNO, -1, -1);
    PAN_BILAENTRPREV.SetFieldPanel(PFL_BILAENTRPREV_ETICPREVANNO, -1, "", "ETICPREVANNO", 0, 0, 0, -13997);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN1, MyGlb.PANEL_LIST, 620, 28, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN1, MyGlb.PANEL_LIST, 0);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN1, MyGlb.PANEL_LIST, 1);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN1, MyGlb.PANEL_FORM, 592, 12, 124, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN1, MyGlb.PANEL_FORM, 0);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN1, MyGlb.PANEL_FORM, 3);
    PAN_BILAENTRPREV.SetFieldPage(PFL_BILAENTRPREV_ETICPREVANN1, -1, -1);
    PAN_BILAENTRPREV.SetFieldPanel(PFL_BILAENTRPREV_ETICPREVANN1, -1, "", "ETICPREVANN1", 0, 0, 0, -13997);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN2, MyGlb.PANEL_LIST, 628, 36, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN2, MyGlb.PANEL_LIST, 0);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN2, MyGlb.PANEL_LIST, 1);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN2, MyGlb.PANEL_FORM, 720, 12, 124, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN2, MyGlb.PANEL_FORM, 0);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICPREVANN2, MyGlb.PANEL_FORM, 3);
    PAN_BILAENTRPREV.SetFieldPage(PFL_BILAENTRPREV_ETICPREVANN2, -1, -1);
    PAN_BILAENTRPREV.SetFieldPanel(PFL_BILAENTRPREV_ETICPREVANN2, -1, "", "ETICPREVANN2", 0, 0, 0, -13997);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIPR, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIPR, MyGlb.PANEL_LIST, 80);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIPR, MyGlb.PANEL_LIST, 1);
    PAN_BILAENTRPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIPR, MyGlb.PANEL_LIST, "d. c. U. F. a. d. l.");
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIPR, MyGlb.PANEL_FORM, 16, 60, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIPR, MyGlb.PANEL_FORM, 316);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIPR, MyGlb.PANEL_FORM, 1);
    PAN_BILAENTRPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIPR, MyGlb.PANEL_FORM, "- di cui Utilizzo Fondo anticipazioni di liquidità");
    PAN_BILAENTRPREV.SetFieldPage(PFL_BILAENTRPREV_UTFONANTLIPR, -1, -1);
    PAN_BILAENTRPREV.SetFieldPanel(PFL_BILAENTRPREV_UTFONANTLIPR, PPQRY_BILPREVEQUI1, "A.UT_FONDO_ANTIC_LIQUIDITA_PREC", "UT_FONDO_ANTIC_LIQUIDITA_PREC", 3, 14, 2, -13997);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ1, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ1, MyGlb.PANEL_LIST, 92);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ1, MyGlb.PANEL_LIST, 1);
    PAN_BILAENTRPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ1, MyGlb.PANEL_LIST, "UT FON. ANTIC LIQUIDITA 1");
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ1, MyGlb.PANEL_FORM, 464, 60, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ1, MyGlb.PANEL_FORM, 92);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ1, MyGlb.PANEL_FORM, 1);
    PAN_BILAENTRPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ1, MyGlb.PANEL_FORM, "U. FN. AN. LIQ. 1");
    PAN_BILAENTRPREV.SetFieldPage(PFL_BILAENTRPREV_UTFONANTLIQ1, -1, -1);
    PAN_BILAENTRPREV.SetFieldPanel(PFL_BILAENTRPREV_UTFONANTLIQ1, PPQRY_BILPREVEQUI1, "A.UT_FONDO_ANTIC_LIQUIDITA_1", "UT_FONDO_ANTIC_LIQUIDITA_1", 3, 14, 2, -13997);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ2, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ2, MyGlb.PANEL_LIST, 92);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ2, MyGlb.PANEL_LIST, 1);
    PAN_BILAENTRPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ2, MyGlb.PANEL_LIST, "UT FON. ANTIC LIQUIDITA 2");
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ2, MyGlb.PANEL_FORM, 592, 60, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ2, MyGlb.PANEL_FORM, 92);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ2, MyGlb.PANEL_FORM, 1);
    PAN_BILAENTRPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ2, MyGlb.PANEL_FORM, "U. FN. AN. LIQ. 2");
    PAN_BILAENTRPREV.SetFieldPage(PFL_BILAENTRPREV_UTFONANTLIQ2, -1, -1);
    PAN_BILAENTRPREV.SetFieldPanel(PFL_BILAENTRPREV_UTFONANTLIQ2, PPQRY_BILPREVEQUI1, "A.UT_FONDO_ANTIC_LIQUIDITA_2", "UT_FONDO_ANTIC_LIQUIDITA_2", 3, 14, 2, -13997);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ3, MyGlb.PANEL_LIST, 8, 44, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ3, MyGlb.PANEL_LIST, 156);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ3, MyGlb.PANEL_LIST, 1);
    PAN_BILAENTRPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ3, MyGlb.PANEL_LIST, "UT FONDO ANTIC LIQUIDITA 3");
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ3, MyGlb.PANEL_FORM, 720, 60, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ3, MyGlb.PANEL_FORM, 156);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ3, MyGlb.PANEL_FORM, 1);
    PAN_BILAENTRPREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_UTFONANTLIQ3, MyGlb.PANEL_FORM, "UT FON. ANT. LIQUIDITA 3");
    PAN_BILAENTRPREV.SetFieldPage(PFL_BILAENTRPREV_UTFONANTLIQ3, -1, -1);
    PAN_BILAENTRPREV.SetFieldPanel(PFL_BILAENTRPREV_UTFONANTLIQ3, PPQRY_BILPREVEQUI1, "A.UT_FONDO_ANTIC_LIQUIDITA_3", "UT_FONDO_ANTIC_LIQUIDITA_3", 3, 14, 2, -13997);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICHEELABOR, MyGlb.PANEL_LIST, 632, 356, 96, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_BILAENTRPREV.SetRect(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICHEELABOR, MyGlb.PANEL_FORM, 764, 108, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILAENTRPREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_BILAENTRPREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILAENTRPREV_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_BILAENTRPREV.SetFieldPage(PFL_BILAENTRPREV_ETICHEELABOR, -1, -1);
    PAN_BILAENTRPREV.SetFieldPanel(PFL_BILAENTRPREV_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_BILAENTRPREV_InitQueries()
  {
    StringBuffer SQL;

    PAN_BILAENTRPREV.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_BILAENTRPREV.SetIMDB(IMDB, "PQRY_BILPREVEQUI1", true);
    PAN_BILAENTRPREV.set_SetString(MyGlb.MASTER_ROWNAME, "BIL PREV EQUILIBRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.UT_FONDO_ANTIC_LIQUIDITA_PREC as UT_FONDO_ANTIC_LIQUIDITA_PREC, ");
    SQL.append("  A.UT_FONDO_ANTIC_LIQUIDITA_1 as UT_FONDO_ANTIC_LIQUIDITA_1, ");
    SQL.append("  A.UT_FONDO_ANTIC_LIQUIDITA_2 as UT_FONDO_ANTIC_LIQUIDITA_2, ");
    SQL.append("  A.UT_FONDO_ANTIC_LIQUIDITA_3 as UT_FONDO_ANTIC_LIQUIDITA_3 ");
    PAN_BILAENTRPREV.SetQuery(PPQRY_BILPREVEQUI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_PREV_EQUILIBRI A ");
    PAN_BILAENTRPREV.SetQuery(PPQRY_BILPREVEQUI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_BILAENTRPREV.SetQuery(PPQRY_BILPREVEQUI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILAENTRPREV.SetQuery(PPQRY_BILPREVEQUI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILAENTRPREV.SetQuery(PPQRY_BILPREVEQUI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILAENTRPREV.SetQuery(PPQRY_BILPREVEQUI1, 5, SQL, -1, "");
    PAN_BILAENTRPREV.SetQueryDB(PPQRY_BILPREVEQUI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BILAENTRPREV.SetMasterTable(0, "BIL_PREV_EQUILIBRI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BILAENTRPREV.Status() == 2)
    {
      int oldListQBE = PAN_BILAENTRPREV.iUseListQBE;
      PAN_BILAENTRPREV.iUseListQBE = 0;
      PAN_BILAENTRPREV.PanelCommand(Glb.PCM_SEARCH);
      PAN_BILAENTRPREV.PanelCommand(Glb.PCM_FIND);
      PAN_BILAENTRPREV.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BILAENTRPREV) PAN_BILAENTRPREV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BILAENTRPREV) PAN_BILAENTRPREV_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BILAENTRPREV) PAN_BILAENTRPREV_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BILAENTRPREV) PAN_BILAENTRPREV_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_BILAENTRPREV) PAN_BILAENTRPREV_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_BILAENTRPREV) PAN_BILAENTRPREV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
