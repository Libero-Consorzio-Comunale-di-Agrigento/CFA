// **********************************************
// Quadro Riassuntivo Gestione Cassa
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class QuadroRiassuntivoGestioneCassa extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_QUARIAGESCAS_ESERCIZIO = 0;
  private static int PFL_QUARIAGESCAS_FONDCASSTOT1 = 1;
  private static int PFL_QUARIAGESCAS_ETICHECOMPET = 2;
  private static int PFL_QUARIAGESCAS_FONDOCASSRES = 3;
  private static int PFL_QUARIAGESCAS_ETICHERESIDU = 4;
  private static int PFL_QUARIAGESCAS_FONDCASSCOMP = 5;
  private static int PFL_QUARIAGESCAS_RISCOSSDAREG = 6;
  private static int PFL_QUARIAGESCAS_PAGAMENDAREG = 7;
  private static int PFL_QUARIAGESCAS_PAGAAZIOESEC = 8;
  private static int PFL_QUARIAGESCAS_ETICHECONCOR = 9;
  private static int PFL_QUARIAGESCAS_FONDTESOPROV = 10;
  private static int PFL_QUARIAGESCAS_RISCTESOPROV = 11;
  private static int PFL_QUARIAGESCAS_PAGTESOPROV = 12;
  private static int PFL_QUARIAGESCAS_DISPTESOPROV = 13;
  private static int PFL_QUARIAGESCAS_ETICHEELABOR = 14;

  private static int PPQRY_WRKBILCONTES = 0;

  private static int PPQRY_BIL = 1;


  IDPanel PAN_QUARIAGESCAS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI672(IMDB);
    //
    //
    Init_PQRY_WRKBILCONTES(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI672(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI672, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI672, "TBL_PARAMETRI672");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI672,IMDBDef3.FLD_PARAMETRI672_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI672,IMDBDef3.FLD_PARAMETRI672_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI672,IMDBDef3.FLD_PARAMETRI672_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI672,IMDBDef3.FLD_PARAMETRI672_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI672,IMDBDef3.FLD_PARAMETRI672_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI672,IMDBDef3.FLD_PARAMETRI672_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI672,IMDBDef3.FLD_PARAMETRI672_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI672,IMDBDef3.FLD_PARAMETRI672_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI672,IMDBDef3.FLD_PARAMETRI672_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI672,IMDBDef3.FLD_PARAMETRI672_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI672,IMDBDef3.FLD_PARAMETRI672_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI672,IMDBDef3.FLD_PARAMETRI672_PARANOMEFILE,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI672, 0);
  }

  private static void Init_PQRY_WRKBILCONTES(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_WRKBILCONTES, 10);
    IMDB.set_TblCode(IMDBDef12.PQRY_WRKBILCONTES, "PQRY_WRKBILCONTES");
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_FONDO_CASSA_RES, "FONDO_CASSA_RES");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_FONDO_CASSA_RES,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_FONDO_CASSA_COMP, "FONDO_CASSA_COMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_FONDO_CASSA_COMP,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_RISCOSSIONI_DA_REG, "RISCOSSIONI_DA_REG");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_RISCOSSIONI_DA_REG,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_PAGAMENTI_DA_REG, "PAGAMENTI_DA_REG");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_PAGAMENTI_DA_REG,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_PAGAMENTI_AZIONI_ESEC, "PAGAMENTI_AZIONI_ESEC");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_PAGAMENTI_AZIONI_ESEC,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_FONDO_TESO_PROV, "FONDO_TESO_PROV");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_FONDO_TESO_PROV,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_RISC_TESO_PROV, "RISC_TESO_PROV");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_RISC_TESO_PROV,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_PAG_TESO_PROV, "PAG_TESO_PROV");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_PAG_TESO_PROV,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_DISPO_TESO_PROV, "DISPO_TESO_PROV");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKBILCONTES,IMDBDef12.PQSL_WRKBILCONTES_DISPO_TESO_PROV,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_WRKBILCONTES, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public QuadroRiassuntivoGestioneCassa(MyWebEntryPoint w, IMDBObj imdb)
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
  public QuadroRiassuntivoGestioneCassa()
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
    FormIdx = MyGlb.FRM_QUARIAGESCAS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "AD94010E-CCBB-4493-8BF8-3CEF9E3F00A6";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 440;
    DesignHeight = 438;
    set_Caption(new IDVariant("Quadro Riassuntivo Gestione Cassa"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 440;
    Frames[1].Height = 412;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Quadro Riassuntivo Gestione Cassa";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 412;
    PAN_QUARIAGESCAS = new IDPanel(w, this, 1, "PAN_QUARIAGESCAS");
    Frames[1].Content = PAN_QUARIAGESCAS;
    PAN_QUARIAGESCAS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_QUARIAGESCAS.VS = MainFrm.VisualStyleList;
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 440-MyGlb.PAN_OFFS_X, 412-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8D98378B-4C0B-42C6-B263-C647AC8511F8");
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1192, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_QUARIAGESCAS.InitStatus = 2;
    PAN_QUARIAGESCAS_Init();
    PAN_QUARIAGESCAS_InitFields();
    PAN_QUARIAGESCAS_InitQueries();
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
      PAN_QUARIAGESCAS.UpdatePanel(MainFrm);
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
    return (obj instanceof QuadroRiassuntivoGestioneCassa);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? QuadroRiassuntivoGestioneCassa.class.getName() : (Glb.ClassWithPackage(QuadroRiassuntivoGestioneCassa.class) ? QuadroRiassuntivoGestioneCassa.class.getName().substring(QuadroRiassuntivoGestioneCassa.class.getPackage().getName().length() + 1) : QuadroRiassuntivoGestioneCassa.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Quadro Riassuntivo Gestione Cassa On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_QUARIAGESCAS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Quadro Riassuntivo Gestione Cassa On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKBILCONTES, IMDBDef12.PQSL_WRKBILCONTES_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_WRKBILCONTES, IMDBDef12.PQSL_WRKBILCONTES_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroRiassuntivoGestioneCassa", "QuadroRiassuntivoGestioneCassaOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Quadro Riassuntivo Gestione Cassa After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_QUARIAGESCAS_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Quadro Riassuntivo Gestione Cassa After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_QUARIAGESCAS.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_QUARIAGESCAS.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroRiassuntivoGestioneCassa", "QuadroRiassuntivoGestioneCassaAfterFind", _e);
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
      if (IDL.Add(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKBILCONTES, IMDBDef12.PQSL_WRKBILCONTES_FONDO_CASSA_RES, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKBILCONTES, IMDBDef12.PQSL_WRKBILCONTES_FONDO_CASSA_COMP, 0),(new IDVariant(0)))).compareTo(IDL.ToCurrency((new IDVariant(PAN_QUARIAGESCAS.FieldText(PFL_QUARIAGESCAS_FONDCASSTOT1)))), true)!=0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Il Fondo Cassa al 1/1 non coincide con la somma tra Competenza e Residui"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if (new IDVariant(PAN_QUARIAGESCAS.Status()).equals((new IDVariant(3)), true))
      {
        PAN_QUARIAGESCAS.PanelCommand(Glb.PCM_UPDATE);
      }
      if (new IDVariant(PAN_QUARIAGESCAS.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPECONS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI672, IMDBDef3.FLD_PARAMETRI672_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI672, IMDBDef3.FLD_PARAMETRI672_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI672, IMDBDef3.FLD_PARAMETRI672_PARANOTESTAM, 0));
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
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI672, IMDBDef3.FLD_PARAMETRI672_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI672, IMDBDef3.FLD_PARAMETRI672_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI672, IMDBDef3.FLD_PARAMETRI672_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI672, IMDBDef3.FLD_PARAMETRI672_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI672, IMDBDef3.FLD_PARAMETRI672_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroRiassuntivoGestioneCassa", "EtichettaElabora", _e);
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
      PAN_QUARIAGESCAS.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroRiassuntivoGestioneCassa", "Load", _e);
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
      if (new IDVariant(PAN_QUARIAGESCAS.Status()).equals((new IDVariant(3)), true))
      {
        PAN_QUARIAGESCAS.PanelCommand(Glb.PCM_CANCEL);
      }
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroRiassuntivoGestioneCassa", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI672, IMDBDef3.FLD_PARAMETRI672_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI672, IMDBDef3.FLD_PARAMETRI672_PARANOMESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI672, IMDBDef3.FLD_PARAMETRI672_PARSTANUDIPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI672, IMDBDef3.FLD_PARAMETRI672_PARANOTESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI672, IMDBDef3.FLD_PARAMETRI672_PARAMIDSTAMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI672, IMDBDef3.FLD_PARAMETRI672_PARANOMEFILE, 0, new IDVariant());
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
  private void PAN_QUARIAGESCAS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_QUARIAGESCAS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_QUARIAGESCAS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_QUARIAGESCAS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_QUARIAGESCAS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_QUARIAGESCAS);
    // Stub
  }

  private void PAN_QUARIAGESCAS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_QUARIAGESCAS_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_QUARIAGESCAS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_QUARIAGESCAS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_QUARIAGESCAS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_QUARIAGESCAS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_QUARIAGESCAS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_QUARIAGESCAS_Init()
  {

    PAN_QUARIAGESCAS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_QUARIAGESCAS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_QUARIAGESCAS.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ESERCIZIO, "52ADC226-8D1F-489D-94FF-CADD764A02AF");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ESERCIZIO, "ESERCIZIO");
    PAN_QUARIAGESCAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ESERCIZIO, "");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSTOT1, "C3EC96A3-D48D-4888-9728-09F893DD19CB");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSTOT1, "Fondo di Cassa al 1/1");
    PAN_QUARIAGESCAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSTOT1, "");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSTOT1, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSTOT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECOMPET, "24CE09E9-B3BD-4317-8E58-607A85197AC4");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECOMPET, "di cui   - Competenza");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECOMPET, MyGlb.VIS_VUOTONORMALE);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDOCASSRES, "5AE23CFD-DDF0-47E7-8B24-73FDCDFA4169");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDOCASSRES, "FONDO CASSA RES");
    PAN_QUARIAGESCAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDOCASSRES, "");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDOCASSRES, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDOCASSRES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHERESIDU, "04C41FB1-E23F-429C-B0A4-93A869A3E79E");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHERESIDU, "- Residui");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHERESIDU, MyGlb.VIS_VUOTONORMALE);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHERESIDU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSCOMP, "8118A393-FCB0-4708-A6C9-A7ACE6AEC46C");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSCOMP, "FONDO CASSA COMP");
    PAN_QUARIAGESCAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSCOMP, "");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSCOMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSCOMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCOSSDAREG, "20DAC0A0-A64D-465E-9DB8-46C86A59483E");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCOSSDAREG, "Riscossioni da regolarizzare con reversali");
    PAN_QUARIAGESCAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCOSSDAREG, "");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCOSSDAREG, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCOSSDAREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAMENDAREG, "2F9B2E20-6142-4BDC-8624-781A8F67B4E5");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAMENDAREG, "Pagamenti da regolarizzare con mandati");
    PAN_QUARIAGESCAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAMENDAREG, "");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAMENDAREG, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAMENDAREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAAZIOESEC, "D9F4EE0F-EAF1-4A35-B13C-FA2D6C317C3F");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAAZIOESEC, "Pagamento per azioni esecutive");
    PAN_QUARIAGESCAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAAZIOESEC, "");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAAZIOESEC, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAAZIOESEC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECONCOR, "727B529F-0124-4E6F-9B89-F9FC59F63D2B");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECONCOR, "Concordanza con la tesoreria provinciale");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECONCOR, MyGlb.VIS_VUOTONORMALE);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECONCOR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDTESOPROV, "E7E9A3E6-A1DF-4FE3-837E-AF19F1504976");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDTESOPROV, "Fondo di cassa al 31 dicembre ");
    PAN_QUARIAGESCAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDTESOPROV, "");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDTESOPROV, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDTESOPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCTESOPROV, "0E989143-6A6B-4CDE-826D-73D5D8484AE2");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCTESOPROV, "Riscossioni");
    PAN_QUARIAGESCAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCTESOPROV, "");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCTESOPROV, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCTESOPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGTESOPROV, "90C69FC3-51A9-41E4-A457-DD4BE5E108C0");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGTESOPROV, "Pagamenti");
    PAN_QUARIAGESCAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGTESOPROV, "");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGTESOPROV, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGTESOPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_DISPTESOPROV, "FEEA0FDB-17CC-42C8-BD57-E0DF6C8BEBC5");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_DISPTESOPROV, "Disponibilità");
    PAN_QUARIAGESCAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_DISPTESOPROV, "");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_DISPTESOPROV, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_DISPTESOPROV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUARIAGESCAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHEELABOR, "C8D38730-9E19-4ACD-8762-AD0774325984");
    PAN_QUARIAGESCAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHEELABOR, "Elabora");
    PAN_QUARIAGESCAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_QUARIAGESCAS.SetImage(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHEELABOR, 0, "button1.gif", false);
    PAN_QUARIAGESCAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_QUARIAGESCAS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ESERCIZIO, MyGlb.PANEL_FORM, 112);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_ESERCIZIO, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_ESERCIZIO, PPQRY_WRKBILCONTES, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSTOT1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSTOT1, MyGlb.PANEL_LIST, 124);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSTOT1, MyGlb.PANEL_LIST, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSTOT1, MyGlb.PANEL_LIST, "Fondo di Cassa al 1/1");
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSTOT1, MyGlb.PANEL_FORM, 120, 44, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSTOT1, MyGlb.PANEL_FORM, 132);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSTOT1, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSTOT1, MyGlb.PANEL_FORM, "Fondo di Cassa al 1/1");
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_FONDCASSTOT1, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_FONDCASSTOT1, PPQRY_BIL, "NVL(A.STN_INI_CO, 0) + NVL(A.VARIAZIONI_CO, 0)", "FONDOCASSTOT", 3, 28, 6, -13997);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECOMPET, MyGlb.PANEL_LIST, 12, 68, 44, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECOMPET, MyGlb.PANEL_LIST, 0);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECOMPET, MyGlb.PANEL_LIST, 1);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECOMPET, MyGlb.PANEL_FORM, 124, 68, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECOMPET, MyGlb.PANEL_FORM, 0);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECOMPET, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_ETICHECOMPET, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_ETICHECOMPET, -1, "", "ETICHECOMPET", 0, 0, 0, -13997);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDOCASSRES, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDOCASSRES, MyGlb.PANEL_LIST, 112);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDOCASSRES, MyGlb.PANEL_LIST, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDOCASSRES, MyGlb.PANEL_LIST, "FONDO CASSA RES");
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDOCASSRES, MyGlb.PANEL_FORM, 256, 92, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDOCASSRES, MyGlb.PANEL_FORM, 92);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDOCASSRES, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDOCASSRES, MyGlb.PANEL_FORM, "FON. CAS. RES");
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_FONDOCASSRES, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_FONDOCASSRES, PPQRY_WRKBILCONTES, "A.FONDO_CASSA_RES", "FONDO_CASSA_RES", 3, 14, 2, -13997);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHERESIDU, MyGlb.PANEL_LIST, 20, 76, 44, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHERESIDU, MyGlb.PANEL_LIST, 0);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHERESIDU, MyGlb.PANEL_LIST, 1);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHERESIDU, MyGlb.PANEL_FORM, 124, 92, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHERESIDU, MyGlb.PANEL_FORM, 0);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHERESIDU, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_ETICHERESIDU, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_ETICHERESIDU, -1, "", "ETICHERESIDU", 0, 0, 0, -13997);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSCOMP, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSCOMP, MyGlb.PANEL_LIST, 120);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSCOMP, MyGlb.PANEL_LIST, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSCOMP, MyGlb.PANEL_LIST, "FONDO CASSA COMP");
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSCOMP, MyGlb.PANEL_FORM, 256, 68, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSCOMP, MyGlb.PANEL_FORM, 128);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSCOMP, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDCASSCOMP, MyGlb.PANEL_FORM, "FONDO CASSA COMP");
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_FONDCASSCOMP, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_FONDCASSCOMP, PPQRY_WRKBILCONTES, "A.FONDO_CASSA_COMP", "FONDO_CASSA_COMP", 3, 14, 2, -13997);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCOSSDAREG, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCOSSDAREG, MyGlb.PANEL_LIST, 128);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCOSSDAREG, MyGlb.PANEL_LIST, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCOSSDAREG, MyGlb.PANEL_LIST, "Riscos. da regolar. con reversali");
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCOSSDAREG, MyGlb.PANEL_FORM, 8, 124, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCOSSDAREG, MyGlb.PANEL_FORM, 244);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCOSSDAREG, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCOSSDAREG, MyGlb.PANEL_FORM, "Riscossioni da regolarizzare con reversali");
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_RISCOSSDAREG, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_RISCOSSDAREG, PPQRY_WRKBILCONTES, "A.RISCOSSIONI_DA_REG", "RISCOSSIONI_DA_REG", 3, 14, 2, -13997);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAMENDAREG, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAMENDAREG, MyGlb.PANEL_LIST, 120);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAMENDAREG, MyGlb.PANEL_LIST, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAMENDAREG, MyGlb.PANEL_LIST, "Pagam. da regolar. con mandati");
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAMENDAREG, MyGlb.PANEL_FORM, 8, 148, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAMENDAREG, MyGlb.PANEL_FORM, 244);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAMENDAREG, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAMENDAREG, MyGlb.PANEL_FORM, "Pagamenti da regolarizzare con mandati");
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_PAGAMENDAREG, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_PAGAMENDAREG, PPQRY_WRKBILCONTES, "A.PAGAMENTI_DA_REG", "PAGAMENTI_DA_REG", 3, 14, 2, -13997);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAAZIOESEC, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAAZIOESEC, MyGlb.PANEL_LIST, 148);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAAZIOESEC, MyGlb.PANEL_LIST, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAAZIOESEC, MyGlb.PANEL_LIST, "Pagamento per azioni esecutive");
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAAZIOESEC, MyGlb.PANEL_FORM, 8, 172, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAAZIOESEC, MyGlb.PANEL_FORM, 244);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAAZIOESEC, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGAAZIOESEC, MyGlb.PANEL_FORM, "Pagamento per azioni esecutive");
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_PAGAAZIOESEC, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_PAGAAZIOESEC, PPQRY_WRKBILCONTES, "A.PAGAMENTI_AZIONI_ESEC", "PAGAMENTI_AZIONI_ESEC", 3, 14, 2, -13997);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECONCOR, MyGlb.PANEL_LIST, 28, 84, 44, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECONCOR, MyGlb.PANEL_LIST, 0);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECONCOR, MyGlb.PANEL_LIST, 1);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECONCOR, MyGlb.PANEL_FORM, 8, 216, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECONCOR, MyGlb.PANEL_FORM, 0);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHECONCOR, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_ETICHECONCOR, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_ETICHECONCOR, -1, "", "ETICHECONCOR", 0, 0, 0, -13997);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDTESOPROV, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDTESOPROV, MyGlb.PANEL_LIST, 112);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDTESOPROV, MyGlb.PANEL_LIST, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDTESOPROV, MyGlb.PANEL_LIST, "Fondo di cassa al 31 dicembre ");
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDTESOPROV, MyGlb.PANEL_FORM, 8, 240, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDTESOPROV, MyGlb.PANEL_FORM, 244);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDTESOPROV, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_FONDTESOPROV, MyGlb.PANEL_FORM, "Fondo di cassa al 31 dicembre ");
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_FONDTESOPROV, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_FONDTESOPROV, PPQRY_WRKBILCONTES, "A.FONDO_TESO_PROV", "FONDO_TESO_PROV", 3, 14, 2, -13997);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCTESOPROV, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCTESOPROV, MyGlb.PANEL_LIST, 100);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCTESOPROV, MyGlb.PANEL_LIST, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCTESOPROV, MyGlb.PANEL_LIST, "Riscossioni");
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCTESOPROV, MyGlb.PANEL_FORM, 8, 288, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCTESOPROV, MyGlb.PANEL_FORM, 244);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCTESOPROV, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_RISCTESOPROV, MyGlb.PANEL_FORM, "Riscossioni");
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_RISCTESOPROV, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_RISCTESOPROV, PPQRY_WRKBILCONTES, "A.RISC_TESO_PROV", "RISC_TESO_PROV", 3, 14, 2, -13997);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGTESOPROV, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGTESOPROV, MyGlb.PANEL_LIST, 96);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGTESOPROV, MyGlb.PANEL_LIST, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGTESOPROV, MyGlb.PANEL_LIST, "Pagamenti");
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGTESOPROV, MyGlb.PANEL_FORM, 8, 264, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGTESOPROV, MyGlb.PANEL_FORM, 244);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGTESOPROV, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_PAGTESOPROV, MyGlb.PANEL_FORM, "Pagamenti");
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_PAGTESOPROV, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_PAGTESOPROV, PPQRY_WRKBILCONTES, "A.PAG_TESO_PROV", "PAG_TESO_PROV", 3, 14, 2, -13997);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_DISPTESOPROV, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_DISPTESOPROV, MyGlb.PANEL_LIST, 108);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_DISPTESOPROV, MyGlb.PANEL_LIST, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_DISPTESOPROV, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_DISPTESOPROV, MyGlb.PANEL_FORM, 8, 312, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_DISPTESOPROV, MyGlb.PANEL_FORM, 244);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_DISPTESOPROV, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_DISPTESOPROV, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_DISPTESOPROV, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_DISPTESOPROV, PPQRY_WRKBILCONTES, "A.DISPO_TESO_PROV", "DISPO_TESO_PROV", 3, 14, 2, -13997);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHEELABOR, MyGlb.PANEL_LIST, 632, 356, 96, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_QUARIAGESCAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHEELABOR, MyGlb.PANEL_FORM, 308, 356, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUARIAGESCAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_QUARIAGESCAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUARIAGESCAS_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_QUARIAGESCAS.SetFieldPage(PFL_QUARIAGESCAS_ETICHEELABOR, -1, -1);
    PAN_QUARIAGESCAS.SetFieldPanel(PFL_QUARIAGESCAS_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_QUARIAGESCAS_InitQueries()
  {
    StringBuffer SQL;

    PAN_QUARIAGESCAS.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(A.STN_INI_CO, 0) + NVL(A.VARIAZIONI_CO, 0) as FONDOCASSTOT ");
    SQL.append("from ");
    SQL.append("  BIL A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.CAPITOLO = 9999999999999998) ");
    SQL.append("and   (A.ARTICOLO = 0) ");
    PAN_QUARIAGESCAS.SetQuery(PPQRY_BIL, 0, SQL, -1, "");
    PAN_QUARIAGESCAS.SetQueryDB(PPQRY_BIL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUARIAGESCAS.SetMasterTable(PPQRY_BIL, "BIL");
    PAN_QUARIAGESCAS.SetIMDB(IMDB, "PQRY_WRKBILCONTES", true);
    PAN_QUARIAGESCAS.set_SetString(MyGlb.MASTER_ROWNAME, "WRK BIL CONS TESO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.FONDO_CASSA_RES as FONDO_CASSA_RES, ");
    SQL.append("  A.FONDO_CASSA_COMP as FONDO_CASSA_COMP, ");
    SQL.append("  A.RISCOSSIONI_DA_REG as RISCOSSIONI_DA_REG, ");
    SQL.append("  A.PAGAMENTI_DA_REG as PAGAMENTI_DA_REG, ");
    SQL.append("  A.PAGAMENTI_AZIONI_ESEC as PAGAMENTI_AZIONI_ESEC, ");
    SQL.append("  A.FONDO_TESO_PROV as FONDO_TESO_PROV, ");
    SQL.append("  A.RISC_TESO_PROV as RISC_TESO_PROV, ");
    SQL.append("  A.PAG_TESO_PROV as PAG_TESO_PROV, ");
    SQL.append("  A.DISPO_TESO_PROV as DISPO_TESO_PROV ");
    PAN_QUARIAGESCAS.SetQuery(PPQRY_WRKBILCONTES, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_BIL_CONS_TESO A ");
    PAN_QUARIAGESCAS.SetQuery(PPQRY_WRKBILCONTES, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_QUARIAGESCAS.SetQuery(PPQRY_WRKBILCONTES, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUARIAGESCAS.SetQuery(PPQRY_WRKBILCONTES, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUARIAGESCAS.SetQuery(PPQRY_WRKBILCONTES, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUARIAGESCAS.SetQuery(PPQRY_WRKBILCONTES, 5, SQL, -1, "");
    PAN_QUARIAGESCAS.SetQueryDB(PPQRY_WRKBILCONTES, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUARIAGESCAS.SetMasterTable(0, "WRK_BIL_CONS_TESO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_QUARIAGESCAS.Status() == 2)
    {
      int oldListQBE = PAN_QUARIAGESCAS.iUseListQBE;
      PAN_QUARIAGESCAS.iUseListQBE = 0;
      PAN_QUARIAGESCAS.PanelCommand(Glb.PCM_SEARCH);
      PAN_QUARIAGESCAS.PanelCommand(Glb.PCM_FIND);
      PAN_QUARIAGESCAS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_QUARIAGESCAS) PAN_QUARIAGESCAS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_QUARIAGESCAS) PAN_QUARIAGESCAS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_QUARIAGESCAS) PAN_QUARIAGESCAS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_QUARIAGESCAS) PAN_QUARIAGESCAS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_QUARIAGESCAS) PAN_QUARIAGESCAS_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_QUARIAGESCAS) PAN_QUARIAGESCAS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
