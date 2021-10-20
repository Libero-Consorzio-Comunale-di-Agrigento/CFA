// **********************************************
// Quadro Generale Riassuntivo Prev
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class QuadroGeneraleRiassuntivoPrev extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_QUADGENERIAS_ESERCIZIO = 0;
  private static int PFL_QUADGENERIAS_UTFONANTLIQ1 = 1;
  private static int PFL_QUADGENERIAS_UTFONANTLIQ2 = 2;
  private static int PFL_QUADGENERIAS_UTFONANTLIQ3 = 3;
  private static int PFL_QUADGENERIAS_FPVTITOLO3 = 4;
  private static int PFL_QUADGENERIAS_FPVTITOLO31 = 5;
  private static int PFL_QUADGENERIAS_FPVTITOLO32 = 6;
  private static int PFL_QUADGENERIAS_FONDANTILIQ1 = 7;
  private static int PFL_QUADGENERIAS_FONDANTILIQ2 = 8;
  private static int PFL_QUADGENERIAS_FONDANTILIQ3 = 9;
  private static int PFL_QUADGENERIAS_ETICHEELABOR = 10;
  private static int PFL_QUADGENERIAS_ETICHECOMPET = 11;
  private static int PFL_QUADGENERIAS_ETICHECOMPE1 = 12;
  private static int PFL_QUADGENERIAS_ETICHECOMPE2 = 13;
  private static int PFL_QUADGENERIAS_ETICHETITOL3 = 14;
  private static int PFL_QUADGENERIAS_ETICHETITOL4 = 15;
  private static int PFL_QUADGENERIAS_ETICUTILAVAN = 16;

  private static int PPQRY_BILPREVEQUIL = 0;


  IDPanel PAN_QUADGENERIAS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI666(IMDB);
    //
    //
    Init_PQRY_BILPREVEQUIL(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI666(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI666, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI666, "TBL_PARAMETRI666");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI666,IMDBDef3.FLD_PARAMETRI666_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI666,IMDBDef3.FLD_PARAMETRI666_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI666,IMDBDef3.FLD_PARAMETRI666_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI666,IMDBDef3.FLD_PARAMETRI666_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI666,IMDBDef3.FLD_PARAMETRI666_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI666,IMDBDef3.FLD_PARAMETRI666_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI666,IMDBDef3.FLD_PARAMETRI666_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI666,IMDBDef3.FLD_PARAMETRI666_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI666,IMDBDef3.FLD_PARAMETRI666_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI666,IMDBDef3.FLD_PARAMETRI666_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI666,IMDBDef3.FLD_PARAMETRI666_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI666,IMDBDef3.FLD_PARAMETRI666_PARANOMEFILE,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI666, 0);
  }

  private static void Init_PQRY_BILPREVEQUIL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILPREVEQUIL, 10);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILPREVEQUIL, "PQRY_BILPREVEQUIL");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_UT_FONDO_ANTIC_LIQUIDITA_1, "UT_FONDO_ANTIC_LIQUIDITA_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_UT_FONDO_ANTIC_LIQUIDITA_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_UT_FONDO_ANTIC_LIQUIDITA_2, "UT_FONDO_ANTIC_LIQUIDITA_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_UT_FONDO_ANTIC_LIQUIDITA_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_UT_FONDO_ANTIC_LIQUIDITA_3, "UT_FONDO_ANTIC_LIQUIDITA_3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_UT_FONDO_ANTIC_LIQUIDITA_3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_FPV_TITOLO3, "FPV_TITOLO3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_FPV_TITOLO3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_FPV_TITOLO3_1, "FPV_TITOLO3_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_FPV_TITOLO3_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_FPV_TITOLO3_2, "FPV_TITOLO3_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_FPV_TITOLO3_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_FONDO_ANTIC_LIQUIDITA_1, "FONDO_ANTIC_LIQUIDITA_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_FONDO_ANTIC_LIQUIDITA_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_FONDO_ANTIC_LIQUIDITA_2, "FONDO_ANTIC_LIQUIDITA_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_FONDO_ANTIC_LIQUIDITA_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_FONDO_ANTIC_LIQUIDITA_3, "FONDO_ANTIC_LIQUIDITA_3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILPREVEQUIL,IMDBDef11.PQSL_BILPREVEQUIL_FONDO_ANTIC_LIQUIDITA_3,3,14,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILPREVEQUIL, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public QuadroGeneraleRiassuntivoPrev(MyWebEntryPoint w, IMDBObj imdb)
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
  public QuadroGeneraleRiassuntivoPrev()
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
    FormIdx = MyGlb.FRM_QUAGENRIAPR1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "60A97C8F-9AFB-48E2-8F8D-A999443CD6F8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 804;
    DesignHeight = 298;
    set_Caption(new IDVariant("Quadro Generale Riassuntivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 804;
    Frames[1].Height = 272;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Quadro Generale Riassuntivo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 272;
    PAN_QUADGENERIAS = new IDPanel(w, this, 1, "PAN_QUADGENERIAS");
    Frames[1].Content = PAN_QUADGENERIAS;
    PAN_QUADGENERIAS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_QUADGENERIAS.VS = MainFrm.VisualStyleList;
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 804-MyGlb.PAN_OFFS_X, 272-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7EEE9F53-834F-4E2F-8CE7-6061C8835B3F");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1000, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_QUADGENERIAS.InitStatus = 2;
    PAN_QUADGENERIAS_Init();
    PAN_QUADGENERIAS_InitFields();
    PAN_QUADGENERIAS_InitQueries();
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
      PAN_QUADGENERIAS.UpdatePanel(MainFrm);
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
    return (obj instanceof QuadroGeneraleRiassuntivoPrev);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? QuadroGeneraleRiassuntivoPrev.class.getName() : (Glb.ClassWithPackage(QuadroGeneraleRiassuntivoPrev.class) ? QuadroGeneraleRiassuntivoPrev.class.getName().substring(QuadroGeneraleRiassuntivoPrev.class.getPackage().getName().length() + 1) : QuadroGeneraleRiassuntivoPrev.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Quadro Generale Riassuntivo On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_QUADGENERIAS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Quadro Generale Riassuntivo On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILPREVEQUIL, IMDBDef11.PQSL_BILPREVEQUIL_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUIL, IMDBDef11.PQSL_BILPREVEQUIL_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUIL, IMDBDef11.PQSL_BILPREVEQUIL_UT_FONDO_ANTIC_LIQUIDITA_1, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUIL, IMDBDef11.PQSL_BILPREVEQUIL_UT_FONDO_ANTIC_LIQUIDITA_2, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUIL, IMDBDef11.PQSL_BILPREVEQUIL_UT_FONDO_ANTIC_LIQUIDITA_3, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUIL, IMDBDef11.PQSL_BILPREVEQUIL_FPV_TITOLO3, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUIL, IMDBDef11.PQSL_BILPREVEQUIL_FPV_TITOLO3_1, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUIL, IMDBDef11.PQSL_BILPREVEQUIL_FPV_TITOLO3_2, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUIL, IMDBDef11.PQSL_BILPREVEQUIL_FONDO_ANTIC_LIQUIDITA_1, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUIL, IMDBDef11.PQSL_BILPREVEQUIL_FONDO_ANTIC_LIQUIDITA_2, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILPREVEQUIL, IMDBDef11.PQSL_BILPREVEQUIL_FONDO_ANTIC_LIQUIDITA_3, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoPrev", "QuadroGeneraleRiassuntivoOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Quadro Generale Riassuntivo After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_QUADGENERIAS_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Quadro Generale Riassuntivo After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_QUADGENERIAS.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_QUADGENERIAS.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoPrev", "QuadroGeneraleRiassuntivoAfterFind", _e);
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
      if (new IDVariant(PAN_QUADGENERIAS.Status()).equals((new IDVariant(3)), true))
      {
        PAN_QUADGENERIAS.PanelCommand(Glb.PCM_UPDATE);
      }
      if (new IDVariant(PAN_QUADGENERIAS.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPEPREV(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARANOTESTAM, 0), (new IDVariant()));
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
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoPrev", "EtichettaElabora", _e);
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
      PAN_QUADGENERIAS.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_QUADGENERIAS.set_FieldText(PFL_QUADGENERIAS_ETICHECOMPET, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_QUADGENERIAS.set_FieldText(PFL_QUADGENERIAS_ETICHECOMPE1, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_QUADGENERIAS.set_FieldText(PFL_QUADGENERIAS_ETICHECOMPE2, IDL.Add((new IDVariant("Competenza ")), IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoPrev", "Load", _e);
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
      if (new IDVariant(PAN_QUADGENERIAS.Status()).equals((new IDVariant(3)), true))
      {
        PAN_QUADGENERIAS.PanelCommand(Glb.PCM_CANCEL);
      }
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoPrev", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARANOMESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARSTANUDIPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARANOTESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARAMIDSTAMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARANOMEFILE, 0, new IDVariant());
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
  private void PAN_QUADGENERIAS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_QUADGENERIAS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_QUADGENERIAS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_QUADGENERIAS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_QUADGENERIAS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_QUADGENERIAS);
    // Stub
  }

  private void PAN_QUADGENERIAS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_QUADGENERIAS_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_QUADGENERIAS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_QUADGENERIAS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_QUADGENERIAS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_QUADGENERIAS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_QUADGENERIAS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_QUADGENERIAS_Init()
  {

    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, "CA35109C-9EAE-4C3B-97E2-74DA4D75BC47");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, "ESERCIZIO");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ1, "A4F4A911-BE69-4E91-B187-B46224EA949F");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ1, "- di cui Utilizzo Fondo anticipazioni di liquidità");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ1, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ1, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ2, "87AAC083-FD12-4B5C-94C5-C8A50D86E37C");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ2, "UT FONDO ANTIC LIQUIDITA 2");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ2, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ2, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ3, "D18FB82D-456F-4FB3-A759-5AF9AA362522");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ3, "UT FONDO ANTIC LIQUIDITA 3");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ3, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ3, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, "741E0DF8-BD78-4E0A-8524-BABBBCCD6A1D");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, "- di cui fondo pluriennale vincolato");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO31, "5A1AD43C-E4B8-424B-91A5-EB83C482BBD4");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO31, "FPV_TITOLO3_1");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO31, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO31, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO31, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO32, "E6256355-F1DA-43FF-82FB-9E3F6E1AFE83");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO32, "FPV_TITOLO3_ 2");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO32, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO32, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO32, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ1, "96472F73-9719-46DC-B874-5212FC5C1B21");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ1, "di cui Fondo anticipazioni di liquidità");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ1, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ1, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ2, "6CB5DE2E-867E-420E-9303-076D224DC086");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ2, "FONDO_ANTIC_LIQUIDITA_2");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ2, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ2, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ3, "7CF782AA-27AA-4618-A6CE-11C03A536245");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ3, "FONDO_ANTIC_LIQUIDITA_3");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ3, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ3, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, "03FC448A-ECE1-494E-9426-651C9F670FE1");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, "Elabora");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_QUADGENERIAS.SetImage(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, 0, "button1.gif", false);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPET, "D2A5F216-7794-4965-8C42-AED5E2D0333F");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPET, "Competenza");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPET, MyGlb.VIS_VUOTOGRASSET);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE1, "E80D2333-F727-4C03-969B-B646FE05E888");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE1, "Competenza");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE1, MyGlb.VIS_VUOTOGRASSET);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE2, "0A92D931-63BB-49B4-9836-BF7458AE3331");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE2, "Competenza");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE2, MyGlb.VIS_VUOTOGRASSET);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, "1C016514-118B-48B7-812F-C1D0B137CAEF");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, "Titolo 3 - Spese per incremento di attività finanziarie");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, MyGlb.VIS_VUOGRAALILEF);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, "8CD6DD24-61B0-4901-B0A5-CB77E83445D4");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, "Titolo 4 - Rimborso di prestiti");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, MyGlb.VIS_VUOGRAALILEF);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICUTILAVAN, "07237368-7A20-4487-93C6-A7E87479B182");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICUTILAVAN, "Utilizzo Avanzo di Amministrazione");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICUTILAVAN, MyGlb.VIS_VUOGRAALILEF);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICUTILAVAN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_QUADGENERIAS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_FORM, 112);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ESERCIZIO, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ESERCIZIO, PPQRY_BILPREVEQUIL, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ1, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ1, MyGlb.PANEL_LIST, 176);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ1, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ1, MyGlb.PANEL_LIST, "- di cui Utilizzo Fondo anticipazioni di liquidità");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ1, MyGlb.PANEL_FORM, 16, 68, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ1, MyGlb.PANEL_FORM, 368);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ1, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ1, MyGlb.PANEL_FORM, "- di cui Utilizzo Fondo anticipazioni di liquidità");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_UTFONANTLIQ1, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_UTFONANTLIQ1, PPQRY_BILPREVEQUIL, "A.UT_FONDO_ANTIC_LIQUIDITA_1", "UT_FONDO_ANTIC_LIQUIDITA_1", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ2, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ2, MyGlb.PANEL_LIST, 176);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ2, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ2, MyGlb.PANEL_LIST, "UT FONDO ANTIC LIQUIDITA 2");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ2, MyGlb.PANEL_FORM, 520, 68, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ2, MyGlb.PANEL_FORM, 176);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ2, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ2, MyGlb.PANEL_FORM, "UT FONDO ANTIC LIQUIDITA 2");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_UTFONANTLIQ2, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_UTFONANTLIQ2, PPQRY_BILPREVEQUIL, "A.UT_FONDO_ANTIC_LIQUIDITA_2", "UT_FONDO_ANTIC_LIQUIDITA_2", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ3, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ3, MyGlb.PANEL_LIST, 176);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ3, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ3, MyGlb.PANEL_LIST, "UT FONDO ANTIC LIQUIDITA 3");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ3, MyGlb.PANEL_FORM, 652, 68, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ3, MyGlb.PANEL_FORM, 176);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ3, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONANTLIQ3, MyGlb.PANEL_FORM, "UT FONDO ANTIC LIQUIDITA 3");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_UTFONANTLIQ3, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_UTFONANTLIQ3, PPQRY_BILPREVEQUIL, "A.UT_FONDO_ANTIC_LIQUIDITA_3", "UT_FONDO_ANTIC_LIQUIDITA_3", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_LIST, 80);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_LIST, "d. c. f. pl. vn.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_FORM, 16, 120, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_FORM, 368);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_FORM, "- di cui fondo pluriennale vincolato");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_FPVTITOLO3, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_FPVTITOLO3, PPQRY_BILPREVEQUIL, "A.FPV_TITOLO3", "FPV_TITOLO3", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO31, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO31, MyGlb.PANEL_LIST, 92);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO31, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO31, MyGlb.PANEL_LIST, "FPV TITOLO3 1");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO31, MyGlb.PANEL_FORM, 520, 120, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO31, MyGlb.PANEL_FORM, 92);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO31, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO31, MyGlb.PANEL_FORM, "FPV TITOLO3 1");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_FPVTITOLO31, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_FPVTITOLO31, PPQRY_BILPREVEQUIL, "A.FPV_TITOLO3_1", "FPV_TITOLO3_1", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO32, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO32, MyGlb.PANEL_LIST, 92);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO32, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO32, MyGlb.PANEL_LIST, "FPV_TITOLO3_ 2");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO32, MyGlb.PANEL_FORM, 652, 120, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO32, MyGlb.PANEL_FORM, 92);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO32, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO32, MyGlb.PANEL_FORM, "FPV TITOLO3 2");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_FPVTITOLO32, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_FPVTITOLO32, PPQRY_BILPREVEQUIL, "A.FPV_TITOLO3_2", "FPV_TITOLO3_2", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ1, MyGlb.PANEL_LIST, 96);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ1, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ1, MyGlb.PANEL_LIST, "d. c. F. a. d. l.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ1, MyGlb.PANEL_FORM, 16, 172, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ1, MyGlb.PANEL_FORM, 368);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ1, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ1, MyGlb.PANEL_FORM, "di cui Fondo anticipazioni di liquidità");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_FONDANTILIQ1, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_FONDANTILIQ1, PPQRY_BILPREVEQUIL, "A.FONDO_ANTIC_LIQUIDITA_1", "FONDO_ANTIC_LIQUIDITA_1", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ2, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ2, MyGlb.PANEL_LIST, 104);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ2, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ2, MyGlb.PANEL_LIST, "FONDO ANTIC LIQUIDITA 2");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ2, MyGlb.PANEL_FORM, 520, 172, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ2, MyGlb.PANEL_FORM, 104);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ2, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ2, MyGlb.PANEL_FORM, "FON. ANT. LIQ. 2");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_FONDANTILIQ2, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_FONDANTILIQ2, PPQRY_BILPREVEQUIL, "A.FONDO_ANTIC_LIQUIDITA_2", "FONDO_ANTIC_LIQUIDITA_2", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ3, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ3, MyGlb.PANEL_LIST, 104);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ3, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ3, MyGlb.PANEL_LIST, "FONDO ANTIC LIQUIDITA 3");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ3, MyGlb.PANEL_FORM, 652, 172, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ3, MyGlb.PANEL_FORM, 104);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ3, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQ3, MyGlb.PANEL_FORM, "FON. ANT. LIQ. 3");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_FONDANTILIQ3, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_FONDANTILIQ3, PPQRY_BILPREVEQUIL, "A.FONDO_ANTIC_LIQUIDITA_3", "FONDO_ANTIC_LIQUIDITA_3", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, MyGlb.PANEL_LIST, 632, 356, 96, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, MyGlb.PANEL_FORM, 696, 220, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETICHEELABOR, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPET, MyGlb.PANEL_LIST, 604, 12, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPET, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPET, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPET, MyGlb.PANEL_FORM, 388, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPET, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPET, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETICHECOMPET, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETICHECOMPET, -1, "", "ETICHECOMPET", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE1, MyGlb.PANEL_LIST, 612, 20, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE1, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE1, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE1, MyGlb.PANEL_FORM, 520, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE1, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE1, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETICHECOMPE1, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETICHECOMPE1, -1, "", "ETICHECOMPE1", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE2, MyGlb.PANEL_LIST, 620, 28, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE2, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE2, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE2, MyGlb.PANEL_FORM, 652, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE2, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHECOMPE2, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETICHECOMPE2, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETICHECOMPE2, -1, "", "ETICHECOMPE2", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, MyGlb.PANEL_LIST, 612, 20, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, MyGlb.PANEL_FORM, 16, 100, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETICHETITOL3, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETICHETITOL3, -1, "", "ETICHETITOL3", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, MyGlb.PANEL_LIST, 620, 28, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, MyGlb.PANEL_FORM, 16, 152, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETICHETITOL4, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETICHETITOL4, -1, "", "ETICHETITOL4", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICUTILAVAN, MyGlb.PANEL_LIST, 612, 20, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICUTILAVAN, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICUTILAVAN, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICUTILAVAN, MyGlb.PANEL_FORM, 16, 48, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICUTILAVAN, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICUTILAVAN, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETICUTILAVAN, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETICUTILAVAN, -1, "", "ETICUTILAVAN", 0, 0, 0, -13997);
  }

  private void PAN_QUADGENERIAS_InitQueries()
  {
    StringBuffer SQL;

    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_QUADGENERIAS.SetIMDB(IMDB, "PQRY_BILPREVEQUIL", true);
    PAN_QUADGENERIAS.set_SetString(MyGlb.MASTER_ROWNAME, "BIL PREV EQUILIBRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.UT_FONDO_ANTIC_LIQUIDITA_1 as UT_FONDO_ANTIC_LIQUIDITA_1, ");
    SQL.append("  A.UT_FONDO_ANTIC_LIQUIDITA_2 as UT_FONDO_ANTIC_LIQUIDITA_2, ");
    SQL.append("  A.UT_FONDO_ANTIC_LIQUIDITA_3 as UT_FONDO_ANTIC_LIQUIDITA_3, ");
    SQL.append("  A.FPV_TITOLO3 as FPV_TITOLO3, ");
    SQL.append("  A.FPV_TITOLO3_1 as FPV_TITOLO3_1, ");
    SQL.append("  A.FPV_TITOLO3_2 as FPV_TITOLO3_2, ");
    SQL.append("  A.FONDO_ANTIC_LIQUIDITA_1 as FONDO_ANTIC_LIQUIDITA_1, ");
    SQL.append("  A.FONDO_ANTIC_LIQUIDITA_2 as FONDO_ANTIC_LIQUIDITA_2, ");
    SQL.append("  A.FONDO_ANTIC_LIQUIDITA_3 as FONDO_ANTIC_LIQUIDITA_3 ");
    PAN_QUADGENERIAS.SetQuery(PPQRY_BILPREVEQUIL, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_PREV_EQUILIBRI A ");
    PAN_QUADGENERIAS.SetQuery(PPQRY_BILPREVEQUIL, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_QUADGENERIAS.SetQuery(PPQRY_BILPREVEQUIL, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUADGENERIAS.SetQuery(PPQRY_BILPREVEQUIL, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUADGENERIAS.SetQuery(PPQRY_BILPREVEQUIL, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUADGENERIAS.SetQuery(PPQRY_BILPREVEQUIL, 5, SQL, -1, "");
    PAN_QUADGENERIAS.SetQueryDB(PPQRY_BILPREVEQUIL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUADGENERIAS.SetMasterTable(0, "BIL_PREV_EQUILIBRI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_QUADGENERIAS.Status() == 2)
    {
      int oldListQBE = PAN_QUADGENERIAS.iUseListQBE;
      PAN_QUADGENERIAS.iUseListQBE = 0;
      PAN_QUADGENERIAS.PanelCommand(Glb.PCM_SEARCH);
      PAN_QUADGENERIAS.PanelCommand(Glb.PCM_FIND);
      PAN_QUADGENERIAS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
