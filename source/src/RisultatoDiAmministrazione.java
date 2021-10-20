// **********************************************
// Risultato Di Amministrazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RisultatoDiAmministrazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_RISULDIAMMIN_PARTEACCANTO = 0;
  private static int GRP_RISULDIAMMIN_PARTEVINCOLA = 1;

  private static int PFL_RISULDIAMMIN_ESERCIZIO = 0;
  private static int PFL_RISULDIAMMIN_ETICHEIMPORT = 1;
  private static int PFL_RISULDIAMMIN_PAGAAZIOESEC = 2;
  private static int PFL_RISULDIAMMIN_SUBADESTDDDF = 3;
  private static int PFL_RISULDIAMMIN_ETICHEELABOR = 4;
  private static int PFL_RISULDIAMMIN_ETICRESIATTI = 5;
  private static int PFL_RISULDIAMMIN_FONDO = 6;
  private static int PFL_RISULDIAMMIN_FONDIRISERVA = 7;
  private static int PFL_RISULDIAMMIN_FONDISPECIAL = 8;
  private static int PFL_RISULDIAMMIN_FONDRINNCONT = 9;
  private static int PFL_RISULDIAMMIN_FONDOAMMTITO = 10;
  private static int PFL_RISULDIAMMIN_ALTRIFONDNAC = 11;
  private static int PFL_RISULDIAMMIN_VINCODALEGGI = 12;
  private static int PFL_RISULDIAMMIN_VINCODATRASF = 13;
  private static int PFL_RISULDIAMMIN_VINCODAMUTUI = 14;
  private static int PFL_RISULDIAMMIN_VINCATTRENTE = 15;
  private static int PFL_RISULDIAMMIN_VINCOLIALTRI = 16;
  private static int PFL_RISULDIAMMIN_TOTDESTININV = 17;

  private static int PPQRY_BILCONSEQUIL = 0;


  IDPanel PAN_RISULDIAMMIN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI671(IMDB);
    //
    //
    Init_PQRY_BILCONSEQUIL(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI671(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI671, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI671, "TBL_PARAMETRI671");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI671,IMDBDef3.FLD_PARAMETRI671_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI671,IMDBDef3.FLD_PARAMETRI671_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI671,IMDBDef3.FLD_PARAMETRI671_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI671,IMDBDef3.FLD_PARAMETRI671_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI671,IMDBDef3.FLD_PARAMETRI671_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI671,IMDBDef3.FLD_PARAMETRI671_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI671,IMDBDef3.FLD_PARAMETRI671_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI671,IMDBDef3.FLD_PARAMETRI671_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI671,IMDBDef3.FLD_PARAMETRI671_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI671,IMDBDef3.FLD_PARAMETRI671_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI671,IMDBDef3.FLD_PARAMETRI671_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI671,IMDBDef3.FLD_PARAMETRI671_PARANOMEFILE,9,500,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI671, 0);
  }

  private static void Init_PQRY_BILCONSEQUIL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_BILCONSEQUIL, 15);
    IMDB.set_TblCode(IMDBDef12.PQRY_BILCONSEQUIL, "PQRY_BILCONSEQUIL");
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_PAGAM_AZIONI_ESEC, "PAGAM_AZIONI_ESEC");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_PAGAM_AZIONI_ESEC,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_ACC_TRIBUTI, "ACC_TRIBUTI");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_ACC_TRIBUTI,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_FONDO_CRED_DUBBIA_ESIG, "FONDO_CRED_DUBBIA_ESIG");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_FONDO_CRED_DUBBIA_ESIG,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_FONDI_RISERVA, "FONDI_RISERVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_FONDI_RISERVA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_FONDI_SPECIALI, "FONDI_SPECIALI");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_FONDI_SPECIALI,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_FONDI_RINNOVI_CONTR, "FONDI_RINNOVI_CONTR");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_FONDI_RINNOVI_CONTR,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_FONDO_AMM_TITOLI, "FONDO_AMM_TITOLI");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_FONDO_AMM_TITOLI,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_VINCOLI_DA_LEGGI, "VINCOLI_DA_LEGGI");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_VINCOLI_DA_LEGGI,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_VINCOLI_DA_TRASF, "VINCOLI_DA_TRASF");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_VINCOLI_DA_TRASF,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_VINCOLI_DA_MUTUI, "VINCOLI_DA_MUTUI");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_VINCOLI_DA_MUTUI,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_VINCOLI_ATTR_ENTE, "VINCOLI_ATTR_ENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_VINCOLI_ATTR_ENTE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_VINCOLI_ALTRI, "VINCOLI_ALTRI");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_VINCOLI_ALTRI,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_TOT_DESTINATO_INV, "TOT_DESTINATO_INV");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_TOT_DESTINATO_INV,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_ALTRI_FONDI_NAC, "ALTRI_FONDI_NAC");
    IMDB.SetFldParams(IMDBDef12.PQRY_BILCONSEQUIL,IMDBDef12.PQSL_BILCONSEQUIL_ALTRI_FONDI_NAC,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_BILCONSEQUIL, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RisultatoDiAmministrazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public RisultatoDiAmministrazione()
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
    FormIdx = MyGlb.FRM_RISULDIAMMIN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "43BA91AB-0CBA-4FD8-935D-520D375F93EB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 676;
    DesignHeight = 554;
    set_Caption(new IDVariant("Risultato di Amministrazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 676;
    Frames[1].Height = 528;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Risultato di Amministrazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 528;
    PAN_RISULDIAMMIN = new IDPanel(w, this, 1, "PAN_RISULDIAMMIN");
    Frames[1].Content = PAN_RISULDIAMMIN;
    PAN_RISULDIAMMIN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RISULDIAMMIN.VS = MainFrm.VisualStyleList;
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 676-MyGlb.PAN_OFFS_X, 528-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FDD32C91-F416-4D25-8727-53D8F1B3C845");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1472, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RISULDIAMMIN.InitStatus = 2;
    PAN_RISULDIAMMIN_Init();
    PAN_RISULDIAMMIN_InitFields();
    PAN_RISULDIAMMIN_InitQueries();
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
      PAN_RISULDIAMMIN.UpdatePanel(MainFrm);
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
    return (obj instanceof RisultatoDiAmministrazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RisultatoDiAmministrazione.class.getName() : (Glb.ClassWithPackage(RisultatoDiAmministrazione.class) ? RisultatoDiAmministrazione.class.getName().substring(RisultatoDiAmministrazione.class.getPackage().getName().length() + 1) : RisultatoDiAmministrazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Risultato di Amministrazione On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_RISULDIAMMIN_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Risultato di Amministrazione On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_BILCONSEQUIL, IMDBDef12.PQSL_BILCONSEQUIL_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUIL, IMDBDef12.PQSL_BILCONSEQUIL_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUIL, IMDBDef12.PQSL_BILCONSEQUIL_PAGAM_AZIONI_ESEC, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef12.PQRY_BILCONSEQUIL, IMDBDef12.PQSL_BILCONSEQUIL_ACC_TRIBUTI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoDiAmministrazione", "RisultatodiAmministrazioneOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Risultato di Amministrazione After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_RISULDIAMMIN_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Risultato di Amministrazione After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_RISULDIAMMIN.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_RISULDIAMMIN.PanelCommand(Glb.PCM_INSERT);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoDiAmministrazione", "RisultatodiAmministrazioneAfterFind", _e);
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
      if (new IDVariant(PAN_RISULDIAMMIN.Status()).equals((new IDVariant(3)), true))
      {
        PAN_RISULDIAMMIN.PanelCommand(Glb.PCM_UPDATE);
      }
      if (new IDVariant(PAN_RISULDIAMMIN.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPECONS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI671, IMDBDef3.FLD_PARAMETRI671_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI671, IMDBDef3.FLD_PARAMETRI671_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI671, IMDBDef3.FLD_PARAMETRI671_PARANOTESTAM, 0));
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
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI671, IMDBDef3.FLD_PARAMETRI671_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI671, IMDBDef3.FLD_PARAMETRI671_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI671, IMDBDef3.FLD_PARAMETRI671_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI671, IMDBDef3.FLD_PARAMETRI671_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI671, IMDBDef3.FLD_PARAMETRI671_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoDiAmministrazione", "EtichettaElabora", _e);
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
      PAN_RISULDIAMMIN.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_RISULDIAMMIN.set_Header(Glb.OBJ_FIELD,PFL_RISULDIAMMIN_FONDO, IDL.Add((new IDVariant(PAN_RISULDIAMMIN.Header(Glb.OBJ_FIELD,PFL_RISULDIAMMIN_FONDO))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoDiAmministrazione", "Load", _e);
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
      if (new IDVariant(PAN_RISULDIAMMIN.Status()).equals((new IDVariant(3)), true))
      {
        PAN_RISULDIAMMIN.PanelCommand(Glb.PCM_CANCEL);
      }
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoDiAmministrazione", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI671, IMDBDef3.FLD_PARAMETRI671_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI671, IMDBDef3.FLD_PARAMETRI671_PARANOMESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI671, IMDBDef3.FLD_PARAMETRI671_PARSTANUDIPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI671, IMDBDef3.FLD_PARAMETRI671_PARANOTESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI671, IMDBDef3.FLD_PARAMETRI671_PARAMIDSTAMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI671, IMDBDef3.FLD_PARAMETRI671_PARANOMEFILE, 0, new IDVariant());
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
  private void PAN_RISULDIAMMIN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RISULDIAMMIN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RISULDIAMMIN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RISULDIAMMIN, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RISULDIAMMIN_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_RISULDIAMMIN);
    // Stub
  }

  private void PAN_RISULDIAMMIN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_RISULDIAMMIN_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_RISULDIAMMIN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_RISULDIAMMIN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_RISULDIAMMIN_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_RISULDIAMMIN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RISULDIAMMIN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_RISULDIAMMIN_Init()
  {

    PAN_RISULDIAMMIN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RISULDIAMMIN.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEACCANTO, "026B63CE-FB86-4B5D-A422-911491302CDD");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEACCANTO, "Parte accantonata");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEACCANTO, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEACCANTO, MyGlb.VIS_GROUPSTYLE);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEACCANTO, MyGlb.PANEL_LIST, 0, -9999, 152, 16, 0, 0);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEACCANTO, MyGlb.PANEL_FORM, 24, 127, 620, 145, 0, 0);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEACCANTO, 0, 105);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEACCANTO, 1, 13);
    PAN_RISULDIAMMIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEACCANTO, 0, 4);
    PAN_RISULDIAMMIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEACCANTO, 1, 4);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEACCANTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEVINCOLA, "D4922354-65CE-4324-98E1-296EA19F49E4");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEVINCOLA, "Parte Vincolata");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEVINCOLA, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEVINCOLA, MyGlb.VIS_GROUPSTYLE);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEVINCOLA, MyGlb.PANEL_LIST, 0, -9999, 116, 16, 0, 0);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEVINCOLA, MyGlb.PANEL_FORM, 24, 277, 620, 145, 0, 0);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEVINCOLA, 0, 86);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEVINCOLA, 1, 13);
    PAN_RISULDIAMMIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEVINCOLA, 0, 4);
    PAN_RISULDIAMMIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEVINCOLA, 1, 4);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_GROUP, GRP_RISULDIAMMIN_PARTEVINCOLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_RISULDIAMMIN.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ESERCIZIO, "888C69F5-1C8E-44E8-A77B-3296D4C838B6");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ESERCIZIO, "ESERCIZIO");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ESERCIZIO, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEIMPORT, "F8D4952E-FF00-4A45-BF19-9C77E9DAF4B5");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEIMPORT, "Importo");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEIMPORT, MyGlb.VIS_VUOTOGRASSET);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEIMPORT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_PAGAAZIOESEC, "CC1F47FC-90DA-4169-AABA-AF4AD12E3195");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_PAGAAZIOESEC, "Pagamenti per azioni esecutive non regolarizzate al 31 dicembre");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_PAGAAZIOESEC, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_PAGAAZIOESEC, MyGlb.VIS_NOFICFIMHELE);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_PAGAAZIOESEC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_SUBADESTDDDF, "230B5AF6-2B28-4E0F-A22F-CDB08C17C865");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_SUBADESTDDDF, "sulla base della stima del dipartimento delle finanze");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_SUBADESTDDDF, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_SUBADESTDDDF, MyGlb.VIS_NOFICFIMHELE);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_SUBADESTDDDF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEELABOR, "44927ED5-01B9-4C3B-8BA3-E430F7477078");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEELABOR, "Elabora");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_RISULDIAMMIN.SetImage(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEELABOR, 0, "button1.gif", false);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICRESIATTI, "7067704D-E83F-4528-8594-807D991ECDEC");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICRESIATTI, "Residui attivi di cui derivanti da accertamenti di tributi effettuati");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICRESIATTI, MyGlb.VIS_VUONORALILEF);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICRESIATTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDO, "508D5949-233F-427A-8C20-709E50372E59");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDO, "Fondo crediti di dubbia esigibilità al 31/12/");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDO, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDO, MyGlb.VIS_NOFICFIMHELE);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDIRISERVA, "6FE81D9D-B204-4CF5-BDDE-532690727FC7");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDIRISERVA, "Fondi di riserva");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDIRISERVA, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDIRISERVA, MyGlb.VIS_NOFICFIMHELE);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDIRISERVA, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDISPECIAL, "BE400012-40A0-4186-8A2C-510894BB588F");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDISPECIAL, "Fondo anticipazioni liquidita'");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDISPECIAL, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDISPECIAL, MyGlb.VIS_NOFICFIMHELE);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDISPECIAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDRINNCONT, "680EA158-444F-405F-8849-24B43709C486");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDRINNCONT, "Fondo  perdite società partecipate");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDRINNCONT, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDRINNCONT, MyGlb.VIS_NOFICFIMHELE);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDRINNCONT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDOAMMTITO, "DC45C8C4-38F0-4BDE-B027-46FCCFA5B332");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDOAMMTITO, "Fondo contezioso");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDOAMMTITO, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDOAMMTITO, MyGlb.VIS_NOFICFIMHELE);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDOAMMTITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ALTRIFONDNAC, "08310FC6-8457-41E1-848A-98BADD293CC4");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ALTRIFONDNAC, "Altri accantonamenti");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ALTRIFONDNAC, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ALTRIFONDNAC, MyGlb.VIS_NOFICFIMHELE);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ALTRIFONDNAC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODALEGGI, "F460B587-1647-4F49-971D-7D868CDA3A74");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODALEGGI, "Vincoli derivanti da leggi e dai principi contabili");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODALEGGI, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODALEGGI, MyGlb.VIS_NOFICFIMHELE);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODALEGGI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODATRASF, "4F17B9D7-A03D-405B-8610-1A8A31BD6E70");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODATRASF, "Vincoli derivanti da trasferimenti");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODATRASF, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODATRASF, MyGlb.VIS_NOFICFIMHELE);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODATRASF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODAMUTUI, "F3B0DDC5-054B-4688-A8B5-9293E4EDDA0C");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODAMUTUI, "Vincoli derivanti dalla contrazione di mutui");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODAMUTUI, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODAMUTUI, MyGlb.VIS_NOFICFIMHELE);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODAMUTUI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCATTRENTE, "522B45F4-1E0B-4693-9EA6-06ED0094259B");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCATTRENTE, "Vincoli formalmente attribuiti dall'ente");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCATTRENTE, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCATTRENTE, MyGlb.VIS_NOFICFIMHELE);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCATTRENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCOLIALTRI, "ED150AE6-CB0E-47B2-8DAD-2DF9686392AB");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCOLIALTRI, "Altri vincoli da specificare");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCOLIALTRI, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCOLIALTRI, MyGlb.VIS_NOFICFIMHELE);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCOLIALTRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RISULDIAMMIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_TOTDESTININV, "523C9527-8543-4C09-A62D-B3A29F56762D");
    PAN_RISULDIAMMIN.set_Header(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_TOTDESTININV, "Parte destinata agli investimenti");
    PAN_RISULDIAMMIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_TOTDESTININV, "");
    PAN_RISULDIAMMIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_TOTDESTININV, MyGlb.VIS_NOFICFIMHELE);
    PAN_RISULDIAMMIN.SetFlags(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_TOTDESTININV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_RISULDIAMMIN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ESERCIZIO, MyGlb.PANEL_FORM, 112);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_ESERCIZIO, -1, -1);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_ESERCIZIO, PPQRY_BILCONSEQUIL, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEIMPORT, MyGlb.PANEL_LIST, 604, 12, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEIMPORT, MyGlb.PANEL_LIST, 0);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEIMPORT, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEIMPORT, MyGlb.PANEL_FORM, 516, 20, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEIMPORT, MyGlb.PANEL_FORM, 0);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEIMPORT, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_ETICHEIMPORT, -1, -1);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_ETICHEIMPORT, -1, "", "ETICHEIMPORT", 0, 0, 0, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_PAGAAZIOESEC, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_PAGAAZIOESEC, MyGlb.PANEL_LIST, 124);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_PAGAAZIOESEC, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_PAGAAZIOESEC, MyGlb.PANEL_LIST, "Pag. per az. esec. non regol. al 31 dic.");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_PAGAAZIOESEC, MyGlb.PANEL_FORM, 24, 52, 616, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_PAGAAZIOESEC, MyGlb.PANEL_FORM, 488);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_PAGAAZIOESEC, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_PAGAAZIOESEC, MyGlb.PANEL_FORM, "Pagamenti per azioni esecutive non regolarizzate al 31 dicembre");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_PAGAAZIOESEC, -1, -1);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_PAGAAZIOESEC, PPQRY_BILCONSEQUIL, "A.PAGAM_AZIONI_ESEC", "PAGAM_AZIONI_ESEC", 3, 14, 2, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_SUBADESTDDDF, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_SUBADESTDDDF, MyGlb.PANEL_LIST, 80);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_SUBADESTDDDF, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_SUBADESTDDDF, MyGlb.PANEL_LIST, "sl. bs. dl. st. d. dip. dl. fin.");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_SUBADESTDDDF, MyGlb.PANEL_FORM, 24, 100, 616, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_SUBADESTDDDF, MyGlb.PANEL_FORM, 488);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_SUBADESTDDDF, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_SUBADESTDDDF, MyGlb.PANEL_FORM, "sulla base della stima del dipartimento delle finanze");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_SUBADESTDDDF, -1, -1);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_SUBADESTDDDF, PPQRY_BILCONSEQUIL, "A.ACC_TRIBUTI", "ACC_TRIBUTI", 3, 14, 2, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEELABOR, MyGlb.PANEL_LIST, 632, 356, 96, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEELABOR, MyGlb.PANEL_FORM, 564, 468, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_ETICHEELABOR, -1, -1);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICRESIATTI, MyGlb.PANEL_LIST, 612, 20, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICRESIATTI, MyGlb.PANEL_LIST, 0);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICRESIATTI, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICRESIATTI, MyGlb.PANEL_FORM, 24, 84, 372, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICRESIATTI, MyGlb.PANEL_FORM, 0);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ETICRESIATTI, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_ETICRESIATTI, -1, -1);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_ETICRESIATTI, -1, "", "ETICRESIATTI", 0, 0, 0, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDO, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDO, MyGlb.PANEL_LIST, 152);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDO, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDO, MyGlb.PANEL_LIST, "Fn. crd. d. dbb. esg. a. 3. 1.");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDO, MyGlb.PANEL_FORM, 28, 152, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDO, MyGlb.PANEL_FORM, 484);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDO, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDO, MyGlb.PANEL_FORM, "Fondo crediti di dubbia esigibilità al 31/12/");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_FONDO, -1, GRP_RISULDIAMMIN_PARTEACCANTO);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_FONDO, PPQRY_BILCONSEQUIL, "A.FONDO_CRED_DUBBIA_ESIG", "FONDO_CRED_DUBBIA_ESIG", 3, 14, 2, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDIRISERVA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDIRISERVA, MyGlb.PANEL_LIST, 96);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDIRISERVA, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDIRISERVA, MyGlb.PANEL_LIST, "Fondi di riserva");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDIRISERVA, MyGlb.PANEL_FORM, 28, 176, 500, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDIRISERVA, MyGlb.PANEL_FORM, 372);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDIRISERVA, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDIRISERVA, MyGlb.PANEL_FORM, "Fondi di riserva");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_FONDIRISERVA, -1, GRP_RISULDIAMMIN_PARTEACCANTO);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_FONDIRISERVA, PPQRY_BILCONSEQUIL, "A.FONDI_RISERVA", "FONDI_RISERVA", 3, 14, 2, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDISPECIAL, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDISPECIAL, MyGlb.PANEL_LIST, 96);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDISPECIAL, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDISPECIAL, MyGlb.PANEL_LIST, "Fon. anticip. liq.");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDISPECIAL, MyGlb.PANEL_FORM, 28, 176, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDISPECIAL, MyGlb.PANEL_FORM, 484);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDISPECIAL, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDISPECIAL, MyGlb.PANEL_FORM, "Fondo anticipazioni liquidita'");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_FONDISPECIAL, -1, GRP_RISULDIAMMIN_PARTEACCANTO);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_FONDISPECIAL, PPQRY_BILCONSEQUIL, "A.FONDI_SPECIALI", "FONDI_SPECIALI", 3, 14, 2, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDRINNCONT, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDRINNCONT, MyGlb.PANEL_LIST, 132);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDRINNCONT, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDRINNCONT, MyGlb.PANEL_LIST, "Fon. perd. soc. partec.");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDRINNCONT, MyGlb.PANEL_FORM, 28, 200, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDRINNCONT, MyGlb.PANEL_FORM, 484);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDRINNCONT, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDRINNCONT, MyGlb.PANEL_FORM, "Fondo  perdite società partecipate");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_FONDRINNCONT, -1, GRP_RISULDIAMMIN_PARTEACCANTO);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_FONDRINNCONT, PPQRY_BILCONSEQUIL, "A.FONDI_RINNOVI_CONTR", "FONDI_RINNOVI_CONTR", 3, 14, 2, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDOAMMTITO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDOAMMTITO, MyGlb.PANEL_LIST, 120);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDOAMMTITO, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDOAMMTITO, MyGlb.PANEL_LIST, "Fondo contezioso");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDOAMMTITO, MyGlb.PANEL_FORM, 28, 224, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDOAMMTITO, MyGlb.PANEL_FORM, 484);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDOAMMTITO, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_FONDOAMMTITO, MyGlb.PANEL_FORM, "Fondo contezioso");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_FONDOAMMTITO, -1, GRP_RISULDIAMMIN_PARTEACCANTO);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_FONDOAMMTITO, PPQRY_BILCONSEQUIL, "A.FONDO_AMM_TITOLI", "FONDO_AMM_TITOLI", 3, 14, 2, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ALTRIFONDNAC, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ALTRIFONDNAC, MyGlb.PANEL_LIST, 104);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ALTRIFONDNAC, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ALTRIFONDNAC, MyGlb.PANEL_LIST, "Alt. accanton.");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ALTRIFONDNAC, MyGlb.PANEL_FORM, 28, 248, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ALTRIFONDNAC, MyGlb.PANEL_FORM, 484);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ALTRIFONDNAC, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_ALTRIFONDNAC, MyGlb.PANEL_FORM, "Altri accantonamenti");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_ALTRIFONDNAC, -1, GRP_RISULDIAMMIN_PARTEACCANTO);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_ALTRIFONDNAC, PPQRY_BILCONSEQUIL, "A.ALTRI_FONDI_NAC", "ALTRI_FONDI_NAC", 3, 14, 2, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODALEGGI, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODALEGGI, MyGlb.PANEL_LIST, 108);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODALEGGI, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODALEGGI, MyGlb.PANEL_LIST, "V. d. d. l. e d. p. cn.");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODALEGGI, MyGlb.PANEL_FORM, 28, 302, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODALEGGI, MyGlb.PANEL_FORM, 484);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODALEGGI, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODALEGGI, MyGlb.PANEL_FORM, "Vincoli derivanti da leggi e dai principi contabili");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_VINCODALEGGI, -1, GRP_RISULDIAMMIN_PARTEVINCOLA);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_VINCODALEGGI, PPQRY_BILCONSEQUIL, "A.VINCOLI_DA_LEGGI", "VINCOLI_DA_LEGGI", 3, 14, 2, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODATRASF, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODATRASF, MyGlb.PANEL_LIST, 112);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODATRASF, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODATRASF, MyGlb.PANEL_LIST, "Vnc. der. da trasf.");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODATRASF, MyGlb.PANEL_FORM, 28, 326, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODATRASF, MyGlb.PANEL_FORM, 484);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODATRASF, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODATRASF, MyGlb.PANEL_FORM, "Vincoli derivanti da trasferimenti");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_VINCODATRASF, -1, GRP_RISULDIAMMIN_PARTEVINCOLA);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_VINCODATRASF, PPQRY_BILCONSEQUIL, "A.VINCOLI_DA_TRASF", "VINCOLI_DA_TRASF", 3, 14, 2, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODAMUTUI, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODAMUTUI, MyGlb.PANEL_LIST, 116);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODAMUTUI, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODAMUTUI, MyGlb.PANEL_LIST, "Vn. der. d. cnt. d. m.");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODAMUTUI, MyGlb.PANEL_FORM, 28, 350, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODAMUTUI, MyGlb.PANEL_FORM, 484);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODAMUTUI, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCODAMUTUI, MyGlb.PANEL_FORM, "Vincoli derivanti dalla contrazione di mutui");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_VINCODAMUTUI, -1, GRP_RISULDIAMMIN_PARTEVINCOLA);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_VINCODAMUTUI, PPQRY_BILCONSEQUIL, "A.VINCOLI_DA_MUTUI", "VINCOLI_DA_MUTUI", 3, 14, 2, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCATTRENTE, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCATTRENTE, MyGlb.PANEL_LIST, 116);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCATTRENTE, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCATTRENTE, MyGlb.PANEL_LIST, "Vnc. frm. att. dl. en.");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCATTRENTE, MyGlb.PANEL_FORM, 28, 374, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCATTRENTE, MyGlb.PANEL_FORM, 484);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCATTRENTE, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCATTRENTE, MyGlb.PANEL_FORM, "Vincoli formalmente attribuiti dall'ente");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_VINCATTRENTE, -1, GRP_RISULDIAMMIN_PARTEVINCOLA);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_VINCATTRENTE, PPQRY_BILCONSEQUIL, "A.VINCOLI_ATTR_ENTE", "VINCOLI_ATTR_ENTE", 3, 14, 2, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCOLIALTRI, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCOLIALTRI, MyGlb.PANEL_LIST, 92);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCOLIALTRI, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCOLIALTRI, MyGlb.PANEL_LIST, "Alt. vnc. d. spc.");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCOLIALTRI, MyGlb.PANEL_FORM, 28, 398, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCOLIALTRI, MyGlb.PANEL_FORM, 484);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCOLIALTRI, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_VINCOLIALTRI, MyGlb.PANEL_FORM, "Altri vincoli da specificare");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_VINCOLIALTRI, -1, GRP_RISULDIAMMIN_PARTEVINCOLA);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_VINCOLIALTRI, PPQRY_BILCONSEQUIL, "A.VINCOLI_ALTRI", "VINCOLI_ALTRI", 3, 14, 2, -13997);
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_TOTDESTININV, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_TOTDESTININV, MyGlb.PANEL_LIST, 120);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_TOTDESTININV, MyGlb.PANEL_LIST, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_TOTDESTININV, MyGlb.PANEL_LIST, "Parte destinata agli investimenti");
    PAN_RISULDIAMMIN.SetRect(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_TOTDESTININV, MyGlb.PANEL_FORM, 28, 428, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RISULDIAMMIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_TOTDESTININV, MyGlb.PANEL_FORM, 484);
    PAN_RISULDIAMMIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_TOTDESTININV, MyGlb.PANEL_FORM, 1);
    PAN_RISULDIAMMIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RISULDIAMMIN_TOTDESTININV, MyGlb.PANEL_FORM, "Parte destinata agli investimenti");
    PAN_RISULDIAMMIN.SetFieldPage(PFL_RISULDIAMMIN_TOTDESTININV, -1, -1);
    PAN_RISULDIAMMIN.SetFieldPanel(PFL_RISULDIAMMIN_TOTDESTININV, PPQRY_BILCONSEQUIL, "A.TOT_DESTINATO_INV", "TOT_DESTINATO_INV", 3, 14, 2, -13997);
  }

  private void PAN_RISULDIAMMIN_InitQueries()
  {
    StringBuffer SQL;

    PAN_RISULDIAMMIN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RISULDIAMMIN.SetIMDB(IMDB, "PQRY_BILCONSEQUIL", true);
    PAN_RISULDIAMMIN.set_SetString(MyGlb.MASTER_ROWNAME, "BIL CONS EQUILIBRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.PAGAM_AZIONI_ESEC as PAGAM_AZIONI_ESEC, ");
    SQL.append("  A.ACC_TRIBUTI as ACC_TRIBUTI, ");
    SQL.append("  A.FONDO_CRED_DUBBIA_ESIG as FONDO_CRED_DUBBIA_ESIG, ");
    SQL.append("  A.FONDI_RISERVA as FONDI_RISERVA, ");
    SQL.append("  A.FONDI_SPECIALI as FONDI_SPECIALI, ");
    SQL.append("  A.FONDI_RINNOVI_CONTR as FONDI_RINNOVI_CONTR, ");
    SQL.append("  A.FONDO_AMM_TITOLI as FONDO_AMM_TITOLI, ");
    SQL.append("  A.VINCOLI_DA_LEGGI as VINCOLI_DA_LEGGI, ");
    SQL.append("  A.VINCOLI_DA_TRASF as VINCOLI_DA_TRASF, ");
    SQL.append("  A.VINCOLI_DA_MUTUI as VINCOLI_DA_MUTUI, ");
    SQL.append("  A.VINCOLI_ATTR_ENTE as VINCOLI_ATTR_ENTE, ");
    SQL.append("  A.VINCOLI_ALTRI as VINCOLI_ALTRI, ");
    SQL.append("  A.TOT_DESTINATO_INV as TOT_DESTINATO_INV, ");
    SQL.append("  A.ALTRI_FONDI_NAC as ALTRI_FONDI_NAC ");
    PAN_RISULDIAMMIN.SetQuery(PPQRY_BILCONSEQUIL, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_CONS_RIS_AMM A ");
    PAN_RISULDIAMMIN.SetQuery(PPQRY_BILCONSEQUIL, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_RISULDIAMMIN.SetQuery(PPQRY_BILCONSEQUIL, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RISULDIAMMIN.SetQuery(PPQRY_BILCONSEQUIL, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RISULDIAMMIN.SetQuery(PPQRY_BILCONSEQUIL, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RISULDIAMMIN.SetQuery(PPQRY_BILCONSEQUIL, 5, SQL, -1, "");
    PAN_RISULDIAMMIN.SetQueryDB(PPQRY_BILCONSEQUIL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RISULDIAMMIN.SetMasterTable(0, "BIL_CONS_RIS_AMM");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RISULDIAMMIN.Status() == 2)
    {
      int oldListQBE = PAN_RISULDIAMMIN.iUseListQBE;
      PAN_RISULDIAMMIN.iUseListQBE = 0;
      PAN_RISULDIAMMIN.PanelCommand(Glb.PCM_SEARCH);
      PAN_RISULDIAMMIN.PanelCommand(Glb.PCM_FIND);
      PAN_RISULDIAMMIN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_RISULDIAMMIN) PAN_RISULDIAMMIN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_RISULDIAMMIN) PAN_RISULDIAMMIN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_RISULDIAMMIN) PAN_RISULDIAMMIN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_RISULDIAMMIN) PAN_RISULDIAMMIN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_RISULDIAMMIN) PAN_RISULDIAMMIN_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_RISULDIAMMIN) PAN_RISULDIAMMIN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
