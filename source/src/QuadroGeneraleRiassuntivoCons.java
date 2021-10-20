// **********************************************
// Quadro Generale Riassuntivo Cons
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class QuadroGeneraleRiassuntivoCons extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_QUADGENERIAS_GRUPPORICALC = 0;

  private static int PFL_QUADGENERIAS_ESERCIZIO = 0;
  private static int PFL_QUADGENERIAS_ETICHEACCERT = 1;
  private static int PFL_QUADGENERIAS_UTILIZAVANZO = 2;
  private static int PFL_QUADGENERIAS_UTFONDANTLIQ = 3;
  private static int PFL_QUADGENERIAS_ETFOPLVIINCC = 4;
  private static int PFL_QUADGENERIAS_FPVECAPFINDE = 5;
  private static int PFL_QUADGENERIAS_FPVEINCATTFI = 6;
  private static int PFL_QUADGENERIAS_ETICHEIMPEGN = 7;
  private static int PFL_QUADGENERIAS_ETTI2SPINCOC = 8;
  private static int PFL_QUADGENERIAS_FPVSCAPFINDE = 9;
  private static int PFL_QUADGENERIAS_ETICHETITOL3 = 10;
  private static int PFL_QUADGENERIAS_FPVTITOLO3 = 11;
  private static int PFL_QUADGENERIAS_ETICHETITOL4 = 12;
  private static int PFL_QUADGENERIAS_FONDANTILIQU = 13;
  private static int PFL_QUADGENERIAS_ETIGESDELBIL = 14;
  private static int PFL_QUADGENERIAS_RISOACCABILA = 15;
  private static int PFL_QUADGENERIAS_RISOVINCBILA = 16;
  private static int PFL_QUADGENERIAS_ETIGESDEGACC = 17;
  private static int PFL_QUADGENERIAS_VARIAZACCANT = 18;
  private static int PFL_QUADGENERIAS_ETICHERICALC = 19;
  private static int PFL_QUADGENERIAS_ETICHEELABOR = 20;

  private static int PPQRY_BILCONSEQUI4 = 0;


  IDPanel PAN_QUADGENERIAS;

  // Definition of Global Variables
  private IDVariant TOTALECA1 = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant TOTALEN1A2 = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant TOTALEDA1 = new IDVariant(0,IDVariant.DECIMAL);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI670(IMDB);
    //
    //
    Init_PQRY_BILCONSEQUI4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI670(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI670, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI670, "TBL_PARAMETRI670");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI670,IMDBDef3.FLD_PARAMETRI670_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI670,IMDBDef3.FLD_PARAMETRI670_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI670,IMDBDef3.FLD_PARAMETRI670_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI670,IMDBDef3.FLD_PARAMETRI670_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI670,IMDBDef3.FLD_PARAMETRI670_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI670,IMDBDef3.FLD_PARAMETRI670_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI670,IMDBDef3.FLD_PARAMETRI670_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI670,IMDBDef3.FLD_PARAMETRI670_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI670,IMDBDef3.FLD_PARAMETRI670_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI670,IMDBDef3.FLD_PARAMETRI670_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI670,IMDBDef3.FLD_PARAMETRI670_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI670,IMDBDef3.FLD_PARAMETRI670_PARANOMEFILE,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI670, 0);
  }

  private static void Init_PQRY_BILCONSEQUI4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_BILCONSEQUI4, 11);
    IMDB.set_TblCode(IMDBDef12.PQRY_BILCONSEQUI4, "PQRY_BILCONSEQUI4");
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_FPV_TITOLO3, "FPV_TITOLO3");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_FPV_TITOLO3,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_FONDO_ANTIC_LIQUIDITA, "FONDO_ANTIC_LIQUIDITA");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_FONDO_ANTIC_LIQUIDITA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_UT_FONDO_ANTIC_LIQUIDITA, "UT_FONDO_ANTIC_LIQUIDITA");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_UT_FONDO_ANTIC_LIQUIDITA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_FPV_E_CAP_FINANZ_DEBITO, "FPV_E_CAP_FINANZ_DEBITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_FPV_E_CAP_FINANZ_DEBITO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_FPV_E_INCREMENTO_ATTIVITA_FIN, "FPV_E_INCREMENTO_ATTIVITA_FIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_FPV_E_INCREMENTO_ATTIVITA_FIN,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_FPV_S_CAP_FINANZ_DEBITO, "FPV_S_CAP_FINANZ_DEBITO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_FPV_S_CAP_FINANZ_DEBITO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_RISORSE_ACCANTONATE_BILANCIO, "RISORSE_ACCANTONATE_BILANCIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_RISORSE_ACCANTONATE_BILANCIO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_RISORSE_VINCOLATE_BILANCIO, "RISORSE_VINCOLATE_BILANCIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_RISORSE_VINCOLATE_BILANCIO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_VARIAZIONE_ACCANTONAMENTI, "VARIAZIONE_ACCANTONAMENTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_VARIAZIONE_ACCANTONAMENTI,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_UTILIZZO_AVANZO, "UTILIZZO_AVANZO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUI4,IMDBDef12.PQSL_BILCONSEQUI4_UTILIZZO_AVANZO,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_BILCONSEQUI4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public QuadroGeneraleRiassuntivoCons(MyWebEntryPoint w, IMDBObj imdb)
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
  public QuadroGeneraleRiassuntivoCons()
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
    FormIdx = MyGlb.FRM_QUAGENRIACON;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3C2339A6-D3B8-4A98-B7AD-EBFADAD2F368";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 800;
    DesignHeight = 626;
    set_Caption(new IDVariant("Quadro Generale Riassuntivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 800;
    Frames[1].Height = 600;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Quadro Generale Riassuntivo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 600;
    PAN_QUADGENERIAS = new IDPanel(w, this, 1, "PAN_QUADGENERIAS");
    Frames[1].Content = PAN_QUADGENERIAS;
    PAN_QUADGENERIAS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_QUADGENERIAS.VS = MainFrm.VisualStyleList;
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 800-MyGlb.PAN_OFFS_X, 600-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1E874DF7-818B-402B-9AC9-3139355B71D8");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1412, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
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
    return (obj instanceof QuadroGeneraleRiassuntivoCons);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? QuadroGeneraleRiassuntivoCons.class.getName() : (Glb.ClassWithPackage(QuadroGeneraleRiassuntivoCons.class) ? QuadroGeneraleRiassuntivoCons.class.getName().substring(QuadroGeneraleRiassuntivoCons.class.getPackage().getName().length() + 1) : QuadroGeneraleRiassuntivoCons.class.getName()));
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
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_BILCONSEQUI4, IMDBDef12.PQSL_BILCONSEQUI4_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI4, IMDBDef12.PQSL_BILCONSEQUI4_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI4, IMDBDef12.PQSL_BILCONSEQUI4_RISORSE_ACCANTONATE_BILANCIO, 0, new IDVariant(TOTALECA1));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI4, IMDBDef12.PQSL_BILCONSEQUI4_RISORSE_VINCOLATE_BILANCIO, 0, new IDVariant(TOTALEN1A2));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI4, IMDBDef12.PQSL_BILCONSEQUI4_VARIAZIONE_ACCANTONAMENTI, 0, new IDVariant(TOTALEDA1));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoCons", "QuadroGeneraleRiassuntivoOnUpdatingRow", _e);
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
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_BILCONSEQUI4, IMDBDef12.PQSL_BILCONSEQUI4_RISORSE_ACCANTONATE_BILANCIO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI4, IMDBDef12.PQSL_BILCONSEQUI4_RISORSE_ACCANTONATE_BILANCIO, 0, new IDVariant(TOTALECA1));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_BILCONSEQUI4, IMDBDef12.PQSL_BILCONSEQUI4_RISORSE_VINCOLATE_BILANCIO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI4, IMDBDef12.PQSL_BILCONSEQUI4_RISORSE_VINCOLATE_BILANCIO, 0, new IDVariant(TOTALEN1A2));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_BILCONSEQUI4, IMDBDef12.PQSL_BILCONSEQUI4_VARIAZIONE_ACCANTONAMENTI, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI4, IMDBDef12.PQSL_BILCONSEQUI4_VARIAZIONE_ACCANTONAMENTI, 0, new IDVariant(TOTALEDA1));
        }
        PAN_QUADGENERIAS.UpdatePanel(MainFrm);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoCons", "QuadroGeneraleRiassuntivoAfterFind", _e);
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
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPECONS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI670, IMDBDef3.FLD_PARAMETRI670_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI670, IMDBDef3.FLD_PARAMETRI670_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI670, IMDBDef3.FLD_PARAMETRI670_PARANOTESTAM, 0));
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
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI670, IMDBDef3.FLD_PARAMETRI670_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI670, IMDBDef3.FLD_PARAMETRI670_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI670, IMDBDef3.FLD_PARAMETRI670_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI670, IMDBDef3.FLD_PARAMETRI670_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI670, IMDBDef3.FLD_PARAMETRI670_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoCons", "EtichettaElabora", _e);
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
      IDVariant v_CAPRISACCBIL = new IDVariant(0,IDVariant.STRING);
      v_CAPRISACCBIL = (new IDVariant("b) Risorse accantonate  stanziate nel bilancio dell'esercizio "));
      IDVariant v_TOOLTIRICALC = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIRICALC = (new IDVariant("Ricalcolo valori relativi agli allegati A1 e A2."));
      PAN_QUADGENERIAS.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_QUADGENERIAS.set_Header(Glb.OBJ_FIELD,PFL_QUADGENERIAS_RISOACCABILA, IDL.Add(v_CAPRISACCBIL, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  GET_IMPORTI_ALL_RIS_AMM(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'TOT_C_A1') as GEIMARASETCA, ");
      SQL.append("  GET_IMPORTI_ALL_RIS_AMM(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'TOT_N1_A2') as GEIMARASETNA, ");
      SQL.append("  GET_IMPORTI_ALL_RIS_AMM(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'TOT_D_A1') as GEIMARASETDA ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        TOTALECA1 = QV.Get("GEIMARASETCA", IDVariant.DECIMAL) ;
        TOTALEN1A2 = QV.Get("GEIMARASETNA", IDVariant.DECIMAL) ;
        TOTALEDA1 = QV.Get("GEIMARASETDA", IDVariant.DECIMAL) ;
      }
      QV.Close();
      PAN_QUADGENERIAS.set_ToolTip(Glb.OBJ_FIELD,PFL_QUADGENERIAS_ETICHERICALC,v_TOOLTIRICALC.stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoCons", "Load", _e);
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
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoCons", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI670, IMDBDef3.FLD_PARAMETRI670_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI670, IMDBDef3.FLD_PARAMETRI670_PARANOMESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI670, IMDBDef3.FLD_PARAMETRI670_PARSTANUDIPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI670, IMDBDef3.FLD_PARAMETRI670_PARANOTESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI670, IMDBDef3.FLD_PARAMETRI670_PARAMIDSTAMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI670, IMDBDef3.FLD_PARAMETRI670_PARANOMEFILE, 0, new IDVariant());
  }

  // **********************************************************************
  // Ricalcola Importi Gestione
  // **********************************************************************
  public int RicalcolaImportiGestione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ricalcola Importi Gestione Body
      // Corpo Procedura
      // 
      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
      v_AVVISO = (new IDVariant("Verrano ricalcolati i valori relativi agli allegati A1 e A2. Continuare?"));
      if (MainFrm.MessageConfirm(v_AVVISO))
      {
        IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI4, IMDBDef12.PQSL_BILCONSEQUI4_RISORSE_ACCANTONATE_BILANCIO, 0, new IDVariant(TOTALECA1));
        IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI4, IMDBDef12.PQSL_BILCONSEQUI4_RISORSE_VINCOLATE_BILANCIO, 0, new IDVariant(TOTALEN1A2));
        IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUI4, IMDBDef12.PQSL_BILCONSEQUI4_VARIAZIONE_ACCANTONAMENTI, 0, new IDVariant(TOTALEDA1));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivoCons", "RicalcolaImportiGestione", _e);
      return -1;
    }
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
    if (ColIndex.intValue() == PFL_QUADGENERIAS_ETICHERICALC)
    {
      this.IdxPanelActived = this.PAN_QUADGENERIAS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      RicalcolaImportiGestione();
      Cancel.set(IDVariant.TRUE);
    }
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
    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_GRUPPORICALC, "5BFA0771-ACC7-4780-939C-E84EB08678DD");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_GRUPPORICALC, "Gruppo Ricalcola");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_GRUPPORICALC, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_GRUPPORICALC, MyGlb.VIS_GROUPSTYLE);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_GRUPPORICALC, MyGlb.PANEL_LIST, 0, -9999, 196, 0, 0, 0);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_GRUPPORICALC, MyGlb.PANEL_FORM, 8, 388, 768, 128, 0, 0);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_GRUPPORICALC, 0, 94);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_GRUPPORICALC, 1, 13);
    PAN_QUADGENERIAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_GRUPPORICALC, 0, 1);
    PAN_QUADGENERIAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_GRUPPORICALC, 1, 1);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_GRUPPORICALC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_FIELD, 21);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, "FDE532F0-6095-4271-95CA-C853B5E0EDDB");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, "ESERCIZIO");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEACCERT, "DECD4F1A-54EC-42A0-A1EC-A10E2925713C");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEACCERT, "Accertamenti");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEACCERT, MyGlb.VIS_VUOTOGRASSET);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEACCERT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTILIZAVANZO, "FDB696D8-05CF-4287-95C0-C70DB702FA2F");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTILIZAVANZO, "Utilizzo avanzo  di amministrazione");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTILIZAVANZO, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTILIZAVANZO, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTILIZAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONDANTLIQ, "52E72738-6B98-430A-90B3-27E421431846");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONDANTLIQ, "di cui Utilizzo Fondo anticipazioni di liquidita'");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONDANTLIQ, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONDANTLIQ, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONDANTLIQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETFOPLVIINCC, "E9A44C34-32EC-417D-935B-81C9D72ADC79");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETFOPLVIINCC, "Fondo pluriennale vincolato in c/capitale");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETFOPLVIINCC, MyGlb.VIS_VUOGRAALILEF);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETFOPLVIINCC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVECAPFINDE, "5B407529-1F99-4DBB-A989-091216C8D66A");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVECAPFINDE, "di cui Fondo pluriennale vincolato in c/capitale finanziato da debito");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVECAPFINDE, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVECAPFINDE, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVECAPFINDE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVEINCATTFI, "F7C8794A-21E4-4938-B086-C4733A63CC2D");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVEINCATTFI, "Fondo pluriennale vincolato per incremento di attivita' finanziarie");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVEINCATTFI, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVEINCATTFI, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVEINCATTFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEIMPEGN, "AC53A0B5-4366-4775-8433-2DF478C7F866");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEIMPEGN, "Impegni");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEIMPEGN, MyGlb.VIS_VUOTOGRASSET);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETTI2SPINCOC, "2B565E3A-C4C9-4530-87C7-716A226C1ED9");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETTI2SPINCOC, "Titolo 2 - Spese in conto capitale");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETTI2SPINCOC, MyGlb.VIS_VUOGRAALILEF);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETTI2SPINCOC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVSCAPFINDE, "0E28310D-2988-4E14-9051-80A00E2BBD3C");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVSCAPFINDE, "di cui Fondo pluriennale vincolato in c/capitale finanziato da debito");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVSCAPFINDE, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVSCAPFINDE, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVSCAPFINDE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, "5B403321-5422-4A8E-96D0-F8F900FAC93F");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, "Titolo 3 - Spese per incremento di attività finanziarie");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, MyGlb.VIS_VUOGRAALILEF);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, "AC1E4C7D-DDA3-4CC6-AC88-F48874001F35");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, "Fondo pluriennale vincolato per attività finanziarie");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, "F03503FA-3E3F-4CBC-B5E5-A68F92990959");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, "Titolo 4 - Rimborso di prestiti");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, MyGlb.VIS_VUOGRAALILEF);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQU, "4BA15E6C-A51F-474C-B8E2-9158A8BF9FE7");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQU, "Fondo anticipazioni di liquidita'");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQU, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQU, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDELBIL, "8C029DD4-A0FF-46F8-979E-31F29EEFBDAC");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDELBIL, "GESTIONE DEL BILANCIO");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDELBIL, MyGlb.VIS_VUOGRAALILEF);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDELBIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOACCABILA, "189D27EE-A747-4A09-98B2-BE0375F5A778");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOACCABILA, "b) Risorse accantonate  stanziate nel bilancio dell'esercizio ");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOACCABILA, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOACCABILA, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOACCABILA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOVINCBILA, "7B4134C7-457E-405A-93E5-F27206C839F5");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOVINCBILA, "c) Risorse vincolate nel bilancio");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOVINCBILA, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOVINCBILA, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOVINCBILA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDEGACC, "2821DFD0-A441-437D-A91E-0B33585BC50D");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDEGACC, "GESTIONE DEGLI ACCANTONAMENTI IN SEDE DI RENDICONTO");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDEGACC, MyGlb.VIS_VUOGRAALILEF);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDEGACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_VARIAZACCANT, "0A0621AD-155F-4AED-AF06-73F9AC321E4F");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_VARIAZACCANT, "e) Variazione accantonamenti effettuata in sede di rendiconto");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_VARIAZACCANT, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_VARIAZACCANT, MyGlb.VIS_NOFICFIMHELE);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_VARIAZACCANT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHERICALC, "B22D0009-D9A1-44BD-8F46-CA797F37404A");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHERICALC, "Ricalcola");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHERICALC, MyGlb.VIS_STATICBUTTON);
    PAN_QUADGENERIAS.SetImage(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHERICALC, 0, "button1.gif", false);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHERICALC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, "E6A36904-1244-4C87-B3AB-40B9E59BD6E1");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, "Elabora");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_QUADGENERIAS.SetImage(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, 0, "button1.gif", false);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
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
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ESERCIZIO, PPQRY_BILCONSEQUI4, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEACCERT, MyGlb.PANEL_LIST, 612, 20, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEACCERT, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEACCERT, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEACCERT, MyGlb.PANEL_FORM, 560, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEACCERT, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEACCERT, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETICHEACCERT, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETICHEACCERT, -1, "", "ETICHEACCERT", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTILIZAVANZO, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTILIZAVANZO, MyGlb.PANEL_LIST, 112);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTILIZAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTILIZAVANZO, MyGlb.PANEL_LIST, "Utilizzo avanzo  di amministrazione");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTILIZAVANZO, MyGlb.PANEL_FORM, 16, 36, 668, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTILIZAVANZO, MyGlb.PANEL_FORM, 540);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTILIZAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTILIZAVANZO, MyGlb.PANEL_FORM, "Utilizzo avanzo  di amministrazione");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_UTILIZAVANZO, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_UTILIZAVANZO, PPQRY_BILCONSEQUI4, "A.UTILIZZO_AVANZO", "UTILIZZO_AVANZO", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONDANTLIQ, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONDANTLIQ, MyGlb.PANEL_LIST, 164);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONDANTLIQ, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONDANTLIQ, MyGlb.PANEL_LIST, "di cui Utilizzo Fondo anticipazioni di liquidita'");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONDANTLIQ, MyGlb.PANEL_FORM, 16, 60, 668, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONDANTLIQ, MyGlb.PANEL_FORM, 540);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONDANTLIQ, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_UTFONDANTLIQ, MyGlb.PANEL_FORM, "di cui Utilizzo Fondo anticipazioni di liquidita'");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_UTFONDANTLIQ, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_UTFONDANTLIQ, PPQRY_BILCONSEQUI4, "A.UT_FONDO_ANTIC_LIQUIDITA", "UT_FONDO_ANTIC_LIQUIDITA", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETFOPLVIINCC, MyGlb.PANEL_LIST, 628, 36, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETFOPLVIINCC, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETFOPLVIINCC, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETFOPLVIINCC, MyGlb.PANEL_FORM, 16, 100, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETFOPLVIINCC, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETFOPLVIINCC, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETFOPLVIINCC, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETFOPLVIINCC, -1, "", "ETFOPLVIINCC", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVECAPFINDE, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVECAPFINDE, MyGlb.PANEL_LIST, 152);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVECAPFINDE, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVECAPFINDE, MyGlb.PANEL_LIST, "di cui Fon. plurien. vinc. in c capit. finanz. da debito");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVECAPFINDE, MyGlb.PANEL_FORM, 16, 120, 668, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVECAPFINDE, MyGlb.PANEL_FORM, 540);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVECAPFINDE, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVECAPFINDE, MyGlb.PANEL_FORM, "di cui Fondo pluriennale vincolato in c/capitale finanziato da debito");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_FPVECAPFINDE, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_FPVECAPFINDE, PPQRY_BILCONSEQUI4, "A.FPV_E_CAP_FINANZ_DEBITO", "FPV_E_CAP_FINANZ_DEBITO", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVEINCATTFI, MyGlb.PANEL_LIST, 0, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVEINCATTFI, MyGlb.PANEL_LIST, 192);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVEINCATTFI, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVEINCATTFI, MyGlb.PANEL_LIST, "Fondo pluriennale vincolato per incremento di attivita finanziarie");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVEINCATTFI, MyGlb.PANEL_FORM, 16, 164, 668, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVEINCATTFI, MyGlb.PANEL_FORM, 540);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVEINCATTFI, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVEINCATTFI, MyGlb.PANEL_FORM, "Fondo pluriennale vincolato per incremento di attivita' finanziarie");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_FPVEINCATTFI, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_FPVEINCATTFI, PPQRY_BILCONSEQUI4, "A.FPV_E_INCREMENTO_ATTIVITA_FIN", "FPV_E_INCREMENTO_ATTIVITA_FIN", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEIMPEGN, MyGlb.PANEL_LIST, 604, 12, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEIMPEGN, MyGlb.PANEL_FORM, 560, 216, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETICHEIMPEGN, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETICHEIMPEGN, -1, "", "ETICHEIMPEGN", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETTI2SPINCOC, MyGlb.PANEL_LIST, 644, 52, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETTI2SPINCOC, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETTI2SPINCOC, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETTI2SPINCOC, MyGlb.PANEL_FORM, 16, 240, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETTI2SPINCOC, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETTI2SPINCOC, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETTI2SPINCOC, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETTI2SPINCOC, -1, "", "ETTI2SPINCOC", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVSCAPFINDE, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVSCAPFINDE, MyGlb.PANEL_LIST, 152);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVSCAPFINDE, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVSCAPFINDE, MyGlb.PANEL_LIST, "di cui Fon. plurien. vinc. in c capit. finanz. da debito");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVSCAPFINDE, MyGlb.PANEL_FORM, 16, 260, 668, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVSCAPFINDE, MyGlb.PANEL_FORM, 540);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVSCAPFINDE, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVSCAPFINDE, MyGlb.PANEL_FORM, "di cui Fondo pluriennale vincolato in c/capitale finanziato da debito");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_FPVSCAPFINDE, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_FPVSCAPFINDE, PPQRY_BILCONSEQUI4, "A.FPV_S_CAP_FINANZ_DEBITO", "FPV_S_CAP_FINANZ_DEBITO", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, MyGlb.PANEL_LIST, 612, 20, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, MyGlb.PANEL_FORM, 12, 292, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL3, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETICHETITOL3, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETICHETITOL3, -1, "", "ETICHETITOL3", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_LIST, 80);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_LIST, "F. p. v. p. a. f.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_FORM, 12, 312, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_FORM, 544);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FPVTITOLO3, MyGlb.PANEL_FORM, "Fondo pluriennale vincolato per attività finanziarie");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_FPVTITOLO3, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_FPVTITOLO3, PPQRY_BILCONSEQUI4, "A.FPV_TITOLO3", "FPV_TITOLO3", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, MyGlb.PANEL_LIST, 620, 28, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, MyGlb.PANEL_FORM, 12, 344, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHETITOL4, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETICHETITOL4, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETICHETITOL4, -1, "", "ETICHETITOL4", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQU, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQU, MyGlb.PANEL_LIST, 96);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQU, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQU, MyGlb.PANEL_LIST, "F. ant. d. liq.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQU, MyGlb.PANEL_FORM, 12, 364, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQU, MyGlb.PANEL_FORM, 544);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQU, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_FONDANTILIQU, MyGlb.PANEL_FORM, "Fondo anticipazioni di liquidita'");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_FONDANTILIQU, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_FONDANTILIQU, PPQRY_BILCONSEQUI4, "A.FONDO_ANTIC_LIQUIDITA", "FONDO_ANTIC_LIQUIDITA", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDELBIL, MyGlb.PANEL_LIST, 628, 36, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDELBIL, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDELBIL, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDELBIL, MyGlb.PANEL_FORM, 12, 392, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDELBIL, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDELBIL, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETIGESDELBIL, -1, GRP_QUADGENERIAS_GRUPPORICALC);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETIGESDELBIL, -1, "", "ETIGESDELBIL", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOACCABILA, MyGlb.PANEL_LIST, 0, 36, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOACCABILA, MyGlb.PANEL_LIST, 196);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOACCABILA, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOACCABILA, MyGlb.PANEL_LIST, "b) Risorse accantonate  stanziate nel bilancio dell'esercizio ");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOACCABILA, MyGlb.PANEL_FORM, 12, 412, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOACCABILA, MyGlb.PANEL_FORM, 544);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOACCABILA, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOACCABILA, MyGlb.PANEL_FORM, "b) Risorse accantonate  stanziate nel bilancio dell'esercizio ");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_RISOACCABILA, -1, GRP_QUADGENERIAS_GRUPPORICALC);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_RISOACCABILA, PPQRY_BILCONSEQUI4, "A.RISORSE_ACCANTONATE_BILANCIO", "RISORSE_ACCANTONATE_BILANCIO", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOVINCBILA, MyGlb.PANEL_LIST, 0, 36, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOVINCBILA, MyGlb.PANEL_LIST, 180);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOVINCBILA, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOVINCBILA, MyGlb.PANEL_LIST, "c) Risorse vincolate nel bilancio");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOVINCBILA, MyGlb.PANEL_FORM, 12, 436, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOVINCBILA, MyGlb.PANEL_FORM, 544);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOVINCBILA, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISOVINCBILA, MyGlb.PANEL_FORM, "c) Risorse vincolate nel bilancio");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_RISOVINCBILA, -1, GRP_QUADGENERIAS_GRUPPORICALC);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_RISOVINCBILA, PPQRY_BILCONSEQUI4, "A.RISORSE_VINCOLATE_BILANCIO", "RISORSE_VINCOLATE_BILANCIO", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDEGACC, MyGlb.PANEL_LIST, 636, 44, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDEGACC, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDEGACC, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDEGACC, MyGlb.PANEL_FORM, 12, 472, 508, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDEGACC, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETIGESDEGACC, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETIGESDEGACC, -1, GRP_QUADGENERIAS_GRUPPORICALC);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETIGESDEGACC, -1, "", "ETIGESDEGACC", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_VARIAZACCANT, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_VARIAZACCANT, MyGlb.PANEL_LIST, 184);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_VARIAZACCANT, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_VARIAZACCANT, MyGlb.PANEL_LIST, "e) Variazione accantonamenti effettuata in sede di rendiconto");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_VARIAZACCANT, MyGlb.PANEL_FORM, 12, 492, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_VARIAZACCANT, MyGlb.PANEL_FORM, 544);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_VARIAZACCANT, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_VARIAZACCANT, MyGlb.PANEL_FORM, "e) Variazione accantonamenti effettuata in sede di rendiconto");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_VARIAZACCANT, -1, GRP_QUADGENERIAS_GRUPPORICALC);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_VARIAZACCANT, PPQRY_BILCONSEQUI4, "A.VARIAZIONE_ACCANTONAMENTI", "VARIAZIONE_ACCANTONAMENTI", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHERICALC, MyGlb.PANEL_LIST, 640, 364, 96, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHERICALC, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHERICALC, MyGlb.PANEL_LIST, 2);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHERICALC, MyGlb.PANEL_FORM, 692, 412, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHERICALC, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHERICALC, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETICHERICALC, -1, GRP_QUADGENERIAS_GRUPPORICALC);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETICHERICALC, -1, "", "ETICHERICALC", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, MyGlb.PANEL_LIST, 632, 356, 96, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, MyGlb.PANEL_FORM, 604, 544, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ETICHEELABOR, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_QUADGENERIAS_InitQueries()
  {
    StringBuffer SQL;

    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_QUADGENERIAS.SetIMDB(IMDB, "PQRY_BILCONSEQUI4", true);
    PAN_QUADGENERIAS.set_SetString(MyGlb.MASTER_ROWNAME, "BIL CONS EQUILIBRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.FPV_TITOLO3 as FPV_TITOLO3, ");
    SQL.append("  A.FONDO_ANTIC_LIQUIDITA as FONDO_ANTIC_LIQUIDITA, ");
    SQL.append("  A.UT_FONDO_ANTIC_LIQUIDITA as UT_FONDO_ANTIC_LIQUIDITA, ");
    SQL.append("  A.FPV_E_CAP_FINANZ_DEBITO as FPV_E_CAP_FINANZ_DEBITO, ");
    SQL.append("  A.FPV_E_INCREMENTO_ATTIVITA_FIN as FPV_E_INCREMENTO_ATTIVITA_FIN, ");
    SQL.append("  A.FPV_S_CAP_FINANZ_DEBITO as FPV_S_CAP_FINANZ_DEBITO, ");
    SQL.append("  A.RISORSE_ACCANTONATE_BILANCIO as RISORSE_ACCANTONATE_BILANCIO, ");
    SQL.append("  A.RISORSE_VINCOLATE_BILANCIO as RISORSE_VINCOLATE_BILANCIO, ");
    SQL.append("  A.VARIAZIONE_ACCANTONAMENTI as VARIAZIONE_ACCANTONAMENTI, ");
    SQL.append("  A.UTILIZZO_AVANZO as UTILIZZO_AVANZO ");
    PAN_QUADGENERIAS.SetQuery(PPQRY_BILCONSEQUI4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_CONS_EQUILIBRI A ");
    PAN_QUADGENERIAS.SetQuery(PPQRY_BILCONSEQUI4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_QUADGENERIAS.SetQuery(PPQRY_BILCONSEQUI4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUADGENERIAS.SetQuery(PPQRY_BILCONSEQUI4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUADGENERIAS.SetQuery(PPQRY_BILCONSEQUI4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUADGENERIAS.SetQuery(PPQRY_BILCONSEQUI4, 5, SQL, -1, "");
    PAN_QUADGENERIAS.SetQueryDB(PPQRY_BILCONSEQUI4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUADGENERIAS.SetMasterTable(0, "BIL_CONS_EQUILIBRI");
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
