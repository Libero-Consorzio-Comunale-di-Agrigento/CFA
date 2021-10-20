// **********************************************
// Elenco Liquidazioni Con Importo Iva Ist Da Valorizzare
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoLiquidazioniConImportoIvaIstDaValorizzare extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ELENCOLIQUID_FORNITORE = 0;

  private static int PFL_ELENCOLIQUID_NUMEROLIQ = 0;
  private static int PFL_ELENCOLIQUID_ANNOLIQ = 1;
  private static int PFL_ELENCOLIQUID_DUALINFO = 2;
  private static int PFL_ELENCOLIQUID_IMPORTO = 3;
  private static int PFL_ELENCOLIQUID_IMPORTOIVA = 4;
  private static int PFL_ELENCOLIQUID_IMPORTIVAIST = 5;
  private static int PFL_ELENCOLIQUID_ETICHELIQUID = 6;
  private static int PFL_ELENCOLIQUID_TOTIVAIST = 7;
  private static int PFL_ELENCOLIQUID_DDATADOC = 8;
  private static int PFL_ELENCOLIQUID_NUMERODOC = 9;
  private static int PFL_ELENCOLIQUID_ETICHEDOCUME = 10;
  private static int PFL_ELENCOLIQUID_ETICHETTAOK = 11;
  private static int PFL_ELENCOLIQUID_ETICHECANCEL = 12;
  private static int PFL_ELENCOLIQUID_INFODOC = 13;
  private static int PFL_ELENCOLIQUID_INFODOC1 = 14;
  private static int PFL_ELENCOLIQUID_CODICE = 15;
  private static int PFL_ELENCOLIQUID_RAGIONSOCIAL = 16;
  private static int PFL_ELENCOLIQUID_NUMEROPROG = 17;
  private static int PFL_ELENCOLIQUID_ANNOPROG = 18;

  private static int PPQRY_FAT15 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_ELENCOLIQUID;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS79(IMDB);
    //
    //
    Init_PQRY_FAT15(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS79(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARS79, 2);
    IMDB.set_TblCode(IMDBDef5.TBL_PARS79, "TBL_PARS79");
    IMDB.set_FldCode(IMDBDef5.TBL_PARS79,IMDBDef5.FLD_PARS79_NOMEOGGETDAL, "NOMEOGGETDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS79,IMDBDef5.FLD_PARS79_NOMEOGGETDAL,6,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS79,IMDBDef5.FLD_PARS79_NOMEOGGETTAL, "NOMEOGGETTAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS79,IMDBDef5.FLD_PARS79_NOMEOGGETTAL,6,16,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARS79, 0);
  }

  private static void Init_PQRY_FAT15(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_FAT15, 14);
    IMDB.set_TblCode(IMDBDef15.PQRY_FAT15, "PQRY_FAT15");
    IMDB.set_FldCode(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_D_DATA_DOC,6,0,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_IMPORTO_IVA, "IMPORTO_IVA");
    IMDB.SetFldParams(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_IMPORTO_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_IMPORTO_IVA_IST, "IMPORTO_IVA_IST");
    IMDB.SetFldParams(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_IMPORTO_IVA_IST,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_TOTIVAIST, "TOTIVAIST");
    IMDB.SetFldParams(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_TOTIVAIST,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_RECORINFODOC, "RECORINFODOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_RECORINFODOC,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_RECORBENCODI, "RECORBENCODI");
    IMDB.SetFldParams(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_RECORBENCODI,2,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_RECFATNUMPRO, "RECFATNUMPRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_RECFATNUMPRO,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_RECFATANNPRO, "RECFATANNPRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_RECFATANNPRO,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_RECBENRAGSOC, "RECBENRAGSOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_RECBENRAGSOC,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_RECOINFODOC1, "RECOINFODOC1");
    IMDB.SetFldParams(IMDBDef15.PQRY_FAT15,IMDBDef15.PQSL_FAT15_RECOINFODOC1,5,1,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_FAT15, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoLiquidazioniConImportoIvaIstDaValorizzare(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoLiquidazioniConImportoIvaIstDaValorizzare()
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
    FormIdx = MyGlb.FRM_ELLICOIMIIDV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4AA89BE9-A66B-4FF1-9801-078137D8B6EC";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 944;
    DesignHeight = 398;
    set_Caption(new IDVariant("Elenco Liquidazioni con importo iva Ist. da Valorizzare"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 944;
    Frames[1].Height = 372;
    Frames[1].Caption = "Elenco liquidazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 372;
    PAN_ELENCOLIQUID = new IDPanel(w, this, 1, "PAN_ELENCOLIQUID");
    Frames[1].Content = PAN_ELENCOLIQUID;
    PAN_ELENCOLIQUID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOLIQUID.VS = MainFrm.VisualStyleList;
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 944-MyGlb.PAN_OFFS_X, 372-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B7E76479-ABDF-440E-B542-5E7BEFB7B2EE");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1040, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOLIQUID.InitStatus = 2;
    PAN_ELENCOLIQUID_Init();
    PAN_ELENCOLIQUID_InitFields();
    PAN_ELENCOLIQUID_InitQueries();
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
      PAN_ELENCOLIQUID.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoLiquidazioniConImportoIvaIstDaValorizzare);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoLiquidazioniConImportoIvaIstDaValorizzare.class.getName() : (Glb.ClassWithPackage(ElencoLiquidazioniConImportoIvaIstDaValorizzare.class) ? ElencoLiquidazioniConImportoIvaIstDaValorizzare.class.getName().substring(ElencoLiquidazioniConImportoIvaIstDaValorizzare.class.getPackage().getName().length() + 1) : ElencoLiquidazioniConImportoIvaIstDaValorizzare.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elenco liquidazioni On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCOLIQUID_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELENCOLIQUID);
      // 
      // Elenco liquidazioni On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ELENCOLIQUID.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOLIQUID_NUMERODOC,(new IDVariant(PAN_ELENCOLIQUID.FieldText(PFL_ELENCOLIQUID_NUMERODOC))).stringValue()); 
      PAN_ELENCOLIQUID.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOLIQUID_RAGIONSOCIAL,(new IDVariant(PAN_ELENCOLIQUID.FieldText(PFL_ELENCOLIQUID_RAGIONSOCIAL))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniConImportoIvaIstDaValorizzare", "ElencoliquidazioniOnDynamicProperties", _e);
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
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniConImportoIvaIstDaValorizzare", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARS79, IMDBDef5.FLD_PARS79_NOMEOGGETDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS79, IMDBDef5.FLD_PARS79_NOMEOGGETTAL, 0, new IDVariant());
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
      PAN_ELENCOLIQUID.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ELENCOLIQUID.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOLIQUID_INFODOC,(new IDVariant("Info Doc.")).stringValue()); 
      PAN_ELENCOLIQUID.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOLIQUID_INFODOC1,(new IDVariant("Riepilogo IVA")).stringValue()); 
      PAN_ELENCOLIQUID.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTIVAIST, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniConImportoIvaIstDaValorizzare", "Load", _e);
    }
  }

  // **********************************************************************
  // DUAL Info
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DUALInfo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DUAL Info Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_FAT15, IMDBDef15.PQSL_FAT15_ANNO_LIQ, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef15.PQRY_FAT15, IMDBDef15.PQSL_FAT15_ANNO_LIQ, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef15.PQRY_FAT15, IMDBDef15.PQSL_FAT15_NUMERO_LIQ, 0));
      MainFrm.Show(MyGlb.FRM_INFOLIQUIDAZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniConImportoIvaIstDaValorizzare", "DUALInfo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // SAVE
  // **********************************************************************
  public int SAVE ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // SAVE Body
      // Corpo Procedura
      // 
      PAN_ELENCOLIQUID.PanelCommand(Glb.PCM_UPDATE);
      C2 = PAN_ELENCOLIQUID.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_ELENCOLIQUID.GotoFirst();
      while (!PAN_ELENCOLIQUID.RSEOF())
      {
        if (IDL.IsNull(C2.Get("IMPORTO_IVA_IST")))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Valorizzare Importo Iva Ist."));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
        PAN_ELENCOLIQUID.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (new IDVariant(PAN_ELENCOLIQUID.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniConImportoIvaIstDaValorizzare", "SAVE", _e);
      return -1;
    }
  }

  // **********************************************************************
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
      // Corpo Procedura
      // 
      PAN_ELENCOLIQUID.PanelCommand(Glb.PCM_CANCEL);
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniConImportoIvaIstDaValorizzare", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Doc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDoc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Doc Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef15.PQRY_FAT15, IMDBDef15.PQSL_FAT15_RECFATANNPRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef15.PQRY_FAT15, IMDBDef15.PQSL_FAT15_RECFATNUMPRO, 0));
      MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniConImportoIvaIstDaValorizzare", "InfoDoc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Doc 1
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDoc1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Doc 1 Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGANPRFA, 0, IMDB.Value(IMDBDef15.PQRY_FAT15, IMDBDef15.PQSL_FAT15_RECFATANNPRO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGNUPRFA, 0, IMDB.Value(IMDBDef15.PQRY_FAT15, IMDBDef15.PQSL_FAT15_RECFATNUMPRO, 0));
      MainFrm.Show(MyGlb.FRM_RIEPILOGOIVA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoLiquidazioniConImportoIvaIstDaValorizzare", "InfoDoc1", _e);
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
  private void PAN_ELENCOLIQUID_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCOLIQUID, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCOLIQUID_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCOLIQUID, Cancel);
    // Stub
  }

  private void PAN_ELENCOLIQUID_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENCOLIQUID_DUALINFO)
    {
      this.IdxPanelActived = this.PAN_ELENCOLIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DUALInfo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOLIQUID_ETICHETTAOK)
    {
      this.IdxPanelActived = this.PAN_ELENCOLIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SAVE();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOLIQUID_ETICHECANCEL)
    {
      this.IdxPanelActived = this.PAN_ELENCOLIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Annulla();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOLIQUID_INFODOC)
    {
      this.IdxPanelActived = this.PAN_ELENCOLIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDoc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOLIQUID_INFODOC1)
    {
      this.IdxPanelActived = this.PAN_ELENCOLIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDoc1();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENCOLIQUID_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCOLIQUID_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCOLIQUID_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCOLIQUID_Init()
  {

    PAN_ELENCOLIQUID.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOLIQUID.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_FORNITORE, "3178F71A-D5E4-439D-A7E7-436962351AC2");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_FORNITORE, "Fornitore");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_FORNITORE, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_FORNITORE, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_FORNITORE, MyGlb.PANEL_LIST, 780, -9999, 260, 16, 0, 0);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_FORNITORE, MyGlb.PANEL_FORM, 0, 219, 328, 73, 0, 0);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_FORNITORE, 0, 52);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_FORNITORE, 1, 13);
    PAN_ELENCOLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_FORNITORE, 0, 4);
    PAN_ELENCOLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_FORNITORE, 1, 4);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOLIQUID_FORNITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOLIQUID.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, "5FD8D23F-07E8-4579-9FE0-75F05234900A");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, "NUMERO LIQ");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, "A9840A88-83D7-4AB8-80CD-2B1C95A0E09E");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, "ANNO LIQ");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFO, "74C87D17-261E-4572-B778-FEE83581D76E");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFO, "DUAL Info");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFO, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, "5E577D8D-0CC3-4841-89A2-275569AECEFA");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, "Importo");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTOIVA, "B050E6FA-18B4-4DF2-9229-172E994754F1");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTOIVA, "Importo Iva");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTOIVA, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTOIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTOIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTIVAIST, "B4A16695-97EF-430D-B214-6F96A5383A04");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTIVAIST, "Importo Iva Ist.");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTIVAIST, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTIVAIST, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTIVAIST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHELIQUID, "21E8171E-41F8-494A-89AE-72D051D15B9C");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHELIQUID, "Liquidazione");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHELIQUID, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHELIQUID, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_TOTIVAIST, "F01558CF-92D1-4194-9AC2-BADE016EC721");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_TOTIVAIST, "Iva Istituz. Documento");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_TOTIVAIST, "Totale Iva Istituzionale sulla fattura");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_TOTIVAIST, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_TOTIVAIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DDATADOC, "A5DE3220-BA9F-4C68-B3BC-1A46F6792C39");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DDATADOC, "D DATA DOC");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DDATADOC, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, "A7ED80D4-921E-45AF-9DB7-93641529D36B");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, "NUMERO DOC");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHEDOCUME, "ABF67CCA-1F33-4909-A44D-77AC890390BE");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHEDOCUME, "Documento");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHEDOCUME, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHEDOCUME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHETTAOK, "FD6B77E2-CA95-45A1-BD9C-C0FE8466DBF0");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHETTAOK, "SALVA");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHETTAOK, MyGlb.VIS_STATICBUTTON);
    PAN_ELENCOLIQUID.SetImage(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHETTAOK, 0, "button1.gif", false);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHETTAOK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHECANCEL, "EE43641C-409A-452E-B773-EF718B6C56F5");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHECANCEL, "ANNULLA");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHECANCEL, MyGlb.VIS_STATICBUTTON);
    PAN_ELENCOLIQUID.SetImage(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHECANCEL, 0, "button1.gif", false);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHECANCEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC, "391E54C9-3A35-4456-8AB0-01AE132190FB");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC, " ");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC1, "0FA832F9-5E48-411B-BE92-9862B6CC447F");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC1, " ");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC1, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC1, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CODICE, "561B7BFB-4C48-404A-8B7D-316D380A3D13");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CODICE, "Codice");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CODICE, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, "13719FAE-3E10-4FB7-9531-5FC35315E201");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, "Ragione Sociale");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROG, "35CE48A3-7E71-4D09-97D3-C17A312663A4");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROG, "NUMERO PROG");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROG, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROG, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_ELENCOLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROG, "38E7DE9E-8AD3-481B-ABDA-DD99D44F3754");
    PAN_ELENCOLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROG, "ANNO PROG");
    PAN_ELENCOLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROG, "");
    PAN_ELENCOLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ELENCOLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROG, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_ELENCOLIQUID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, "NUM. LIQ");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 4, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, 80);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, "NUMERO LIQ");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_NUMEROLIQ, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_NUMEROLIQ, PPQRY_FAT15, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_LIST, 48, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_FORM, 4, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_ANNOLIQ, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_ANNOLIQ, PPQRY_FAT15, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFO, MyGlb.PANEL_LIST, 84, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFO, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFO, MyGlb.PANEL_LIST, "D. I.");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFO, MyGlb.PANEL_FORM, 4, 172, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DUALINFO, MyGlb.PANEL_FORM, "DUAL Info");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_DUALINFO, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_DUALINFO, PPQRY_DUAL, "'I'", "INFO", 5, 1, 0, -13997);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_DUALINFO, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_LIST, 104, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_FORM, 4, 100, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_IMPORTO, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_IMPORTO, PPQRY_FAT15, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTOIVA, MyGlb.PANEL_LIST, 232, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTOIVA, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTOIVA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTOIVA, MyGlb.PANEL_LIST, "Importo Iva");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTOIVA, MyGlb.PANEL_FORM, 4, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTOIVA, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTOIVA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTOIVA, MyGlb.PANEL_FORM, "Importo Iva");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_IMPORTOIVA, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_IMPORTOIVA, PPQRY_FAT15, "A.IMPORTO_IVA", "IMPORTO_IVA", 3, 14, 2, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTIVAIST, MyGlb.PANEL_LIST, 340, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTIVAIST, MyGlb.PANEL_LIST, 108);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTIVAIST, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTIVAIST, MyGlb.PANEL_LIST, "Importo Iva Ist.");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTIVAIST, MyGlb.PANEL_FORM, 4, 148, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTIVAIST, MyGlb.PANEL_FORM, 108);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTIVAIST, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_IMPORTIVAIST, MyGlb.PANEL_FORM, "Importo Iva Ist.");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_IMPORTIVAIST, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_IMPORTIVAIST, PPQRY_FAT15, "A.IMPORTO_IVA_IST", "IMPORTO_IVA_IST", 3, 14, 2, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHELIQUID, MyGlb.PANEL_LIST, 0, 0, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHELIQUID, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHELIQUID, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHELIQUID, MyGlb.PANEL_FORM, 0, 228, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHELIQUID, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHELIQUID, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_ETICHELIQUID, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_ETICHELIQUID, -1, "", "ETICHELIQUID", 0, 0, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_TOTIVAIST, MyGlb.PANEL_LIST, 448, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_TOTIVAIST, MyGlb.PANEL_LIST, 68);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_TOTIVAIST, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_TOTIVAIST, MyGlb.PANEL_LIST, "Iva Istituz. Documento");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_TOTIVAIST, MyGlb.PANEL_FORM, 4, 196, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_TOTIVAIST, MyGlb.PANEL_FORM, 68);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_TOTIVAIST, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_TOTIVAIST, MyGlb.PANEL_FORM, "I. Ist. Doc.");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_TOTIVAIST, -1, -1);
    PAN_ELENCOLIQUID.SetFieldUnbound(PFL_ELENCOLIQUID_TOTIVAIST, true);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_TOTIVAIST, PPQRY_FAT15, "GET_TOT_IVA_IST(A.FAT_ANNO_PROG,A.FAT_NUMERO_PROG)", "TOTIVAIST", 3, 28, 6, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DDATADOC, MyGlb.PANEL_LIST, 556, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DDATADOC, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DDATADOC, MyGlb.PANEL_LIST, "D DATA DOC");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DDATADOC, MyGlb.PANEL_FORM, 4, 76, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DDATADOC, MyGlb.PANEL_FORM, 76);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_DDATADOC, MyGlb.PANEL_FORM, "D DATA DOC");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_DDATADOC, -1, -1);
    PAN_ELENCOLIQUID.SetFieldUnbound(PFL_ELENCOLIQUID_DDATADOC, true);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_DDATADOC, PPQRY_FAT15, "C.D_DATA_DOC", "D_DATA_DOC", 6, 0, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_LIST, 632, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_FORM, 4, 52, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMERODOC, MyGlb.PANEL_FORM, "NUMERO DOC");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_NUMERODOC, -1, -1);
    PAN_ELENCOLIQUID.SetFieldUnbound(PFL_ELENCOLIQUID_NUMERODOC, true);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_NUMERODOC, PPQRY_FAT15, "C.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHEDOCUME, MyGlb.PANEL_LIST, 556, 0, 224, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHEDOCUME, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHEDOCUME, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHEDOCUME, MyGlb.PANEL_FORM, 84, 220, 184, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHEDOCUME, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHEDOCUME, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_ETICHEDOCUME, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_ETICHEDOCUME, -1, "", "ETICHEDOCUME", 0, 0, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHETTAOK, MyGlb.PANEL_LIST, 232, 256, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHETTAOK, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHETTAOK, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHETTAOK, MyGlb.PANEL_FORM, 232, 256, 92, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHETTAOK, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHETTAOK, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_ETICHETTAOK, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_ETICHETTAOK, -1, "", "ETICHETTAOK", 0, 0, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHECANCEL, MyGlb.PANEL_LIST, 328, 256, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHECANCEL, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHECANCEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHECANCEL, MyGlb.PANEL_FORM, 240, 264, 92, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHECANCEL, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ETICHECANCEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_ETICHECANCEL, -1, -1);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_ETICHECANCEL, -1, "", "ETICHECANCEL", 0, 0, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC, MyGlb.PANEL_LIST, 740, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC, MyGlb.PANEL_FORM, 4, 220, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC, MyGlb.PANEL_FORM, 56);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_INFODOC, -1, -1);
    PAN_ELENCOLIQUID.SetFieldUnbound(PFL_ELENCOLIQUID_INFODOC, true);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_INFODOC, PPQRY_FAT15, "'I'", "RECORINFODOC", 5, 1, 0, -13997);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC1, MyGlb.PANEL_LIST, 760, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC1, MyGlb.PANEL_LIST, 68);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC1, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC1, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC1, MyGlb.PANEL_FORM, 4, 292, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC1, MyGlb.PANEL_FORM, 68);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC1, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_INFODOC1, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_INFODOC1, -1, -1);
    PAN_ELENCOLIQUID.SetFieldUnbound(PFL_ELENCOLIQUID_INFODOC1, true);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_INFODOC1, PPQRY_FAT15, "'F'", "RECOINFODOC1", 5, 1, 0, -13997);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOLIQUID.SetValueListItem(PFL_ELENCOLIQUID_INFODOC1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CODICE, MyGlb.PANEL_LIST, 780, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CODICE, MyGlb.PANEL_FORM, 4, 244, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_CODICE, -1, GRP_ELENCOLIQUID_FORNITORE);
    PAN_ELENCOLIQUID.SetFieldUnbound(PFL_ELENCOLIQUID_CODICE, true);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_CODICE, PPQRY_FAT15, "H.CODICE", "RECORBENCODI", 2, 19, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_LIST, 832, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_LIST, 108);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 268, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_FORM, 108);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_RAGIONSOCIAL, -1, GRP_ELENCOLIQUID_FORNITORE);
    PAN_ELENCOLIQUID.SetFieldUnbound(PFL_ELENCOLIQUID_RAGIONSOCIAL, true);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_RAGIONSOCIAL, PPQRY_FAT15, "H.RAGIONE_SOCIALE", "RECBENRAGSOC", 5, 40, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROG, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROG, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROG, MyGlb.PANEL_LIST, "NUMERO PROG");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROG, MyGlb.PANEL_FORM, 4, 292, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROG, MyGlb.PANEL_FORM, 92);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROG, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_NUMEROPROG, MyGlb.PANEL_FORM, "NUMERO PROG");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_NUMEROPROG, -1, -1);
    PAN_ELENCOLIQUID.SetFieldUnbound(PFL_ELENCOLIQUID_NUMEROPROG, true);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_NUMEROPROG, PPQRY_FAT15, "C.NUMERO_PROG", "RECFATNUMPRO", 1, 19, 0, -13997);
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROG, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROG, MyGlb.PANEL_LIST, 72);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROG, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_ELENCOLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROG, MyGlb.PANEL_FORM, 4, 292, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROG, MyGlb.PANEL_FORM, 72);
    PAN_ELENCOLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOLIQUID_ANNOPROG, MyGlb.PANEL_FORM, "ANNO PROG");
    PAN_ELENCOLIQUID.SetFieldPage(PFL_ELENCOLIQUID_ANNOPROG, -1, -1);
    PAN_ELENCOLIQUID.SetFieldUnbound(PFL_ELENCOLIQUID_ANNOPROG, true);
    PAN_ELENCOLIQUID.SetFieldPanel(PFL_ELENCOLIQUID_ANNOPROG, PPQRY_FAT15, "C.ANNO_PROG", "RECFATANNPRO", 1, 19, 0, -13997);
  }

  private void PAN_ELENCOLIQUID_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOLIQUID.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ANNO_LIQ~~ IS NULL))) ");
    PAN_ELENCOLIQUID.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_ELENCOLIQUID.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOLIQUID.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_ELENCOLIQUID.SetIMDB(IMDB, "PQRY_FAT15", true);
    PAN_ELENCOLIQUID.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  C.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  C.D_DATA_DOC as D_DATA_DOC, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.IMPORTO_IVA as IMPORTO_IVA, ");
    SQL.append("  A.IMPORTO_IVA_IST as IMPORTO_IVA_IST, ");
    SQL.append("  GET_TOT_IVA_IST(A.FAT_ANNO_PROG,A.FAT_NUMERO_PROG) as TOTIVAIST, ");
    SQL.append("  'I' as RECORINFODOC, ");
    SQL.append("  H.CODICE as RECORBENCODI, ");
    SQL.append("  C.NUMERO_PROG as RECFATNUMPRO, ");
    SQL.append("  C.ANNO_PROG as RECFATANNPRO, ");
    SQL.append("  H.RAGIONE_SOCIALE as RECBENRAGSOC, ");
    SQL.append("  'F' as RECOINFODOC1 ");
    PAN_ELENCOLIQUID.SetQuery(PPQRY_FAT15, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  MAN B, ");
    SQL.append("  FAT C, ");
    SQL.append("  IVA D, ");
    SQL.append("  T04 E, ");
    SQL.append("  T09 F, ");
    SQL.append("  BEN H ");
    PAN_ELENCOLIQUID.SetQuery(PPQRY_FAT15, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_MAND = A.ANNO_MAND) ");
    SQL.append("and   (B.NUMERO_MAND = A.NUMERO_MAND) ");
    SQL.append("and   (C.ANNO_PROG = A.FAT_ANNO_PROG) ");
    SQL.append("and   (C.NUMERO_PROG = A.FAT_NUMERO_PROG) ");
    SQL.append("and   ((B.D_DATA_MAND BETWEEN ~~TBL_PARS79.NOMEOGGETDAL~~ AND ~~TBL_PARS79.NOMEOGGETTAL~~)) ");
    SQL.append("and   (C.TRATTAMENTO_IVA = 'SP' OR C.TRATTAMENTO_IVA = 'RC') ");
    SQL.append("and   ((A.ANNO_LIQ_IVA IS NULL)) ");
    SQL.append("and   ((A.NUMERO_LIQ_IVA IS NULL)) ");
    SQL.append("and   (D.ANNO_PROG = C.ANNO_PROG) ");
    SQL.append("and   (D.NUMERO_PROG = C.NUMERO_PROG) ");
    SQL.append("and   (E.TIPO_REGISTRO = D.TIPO_REGISTRO) ");
    SQL.append("and   (E.TIPO_BOLLATO = D.SERVIZIO) ");
    SQL.append("and   (F.CODICE = E.ATTIVITA) ");
    SQL.append("and   (F.ISTITUZIONALE = 'SI') ");
    SQL.append("and   (H.CODICE(+) = C.CODICE) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  IVA G, ");
    SQL.append("  T04 t04bis, ");
    SQL.append("  T09 t09bis ");
    SQL.append("where (G.ANNO_PROG = D.ANNO_PROG) ");
    SQL.append("and   (G.NUMERO_PROG = D.NUMERO_PROG) ");
    SQL.append("and   (G.PROGRESSIVO <> D.PROGRESSIVO) ");
    SQL.append("and   (t04bis.TIPO_REGISTRO = G.TIPO_REGISTRO) ");
    SQL.append("and   (t04bis.TIPO_BOLLATO = G.SERVIZIO) ");
    SQL.append("and   (t09bis.CODICE = t04bis.ATTIVITA) ");
    SQL.append("and   ((t09bis.ISTITUZIONALE IS NULL)) ");
    SQL.append("))) ");
    PAN_ELENCOLIQUID.SetQuery(PPQRY_FAT15, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOLIQUID.SetQuery(PPQRY_FAT15, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOLIQUID.SetQuery(PPQRY_FAT15, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 4, 3, 2, 1 ");
    PAN_ELENCOLIQUID.SetQuery(PPQRY_FAT15, 5, SQL, -1, "");
    PAN_ELENCOLIQUID.SetQueryDB(PPQRY_FAT15, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOLIQUID.SetMasterTable(0, "LIQ");
    PAN_ELENCOLIQUID.AddToSortList(PFL_ELENCOLIQUID_DDATADOC, true);
    PAN_ELENCOLIQUID.AddToSortList(PFL_ELENCOLIQUID_NUMERODOC, true);
    PAN_ELENCOLIQUID.AddToSortList(PFL_ELENCOLIQUID_ANNOLIQ, true);
    PAN_ELENCOLIQUID.AddToSortList(PFL_ELENCOLIQUID_NUMEROLIQ, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCOLIQUID.Status() == 2)
    {
      int oldListQBE = PAN_ELENCOLIQUID.iUseListQBE;
      PAN_ELENCOLIQUID.iUseListQBE = 0;
      PAN_ELENCOLIQUID.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCOLIQUID.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCOLIQUID.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENCOLIQUID) PAN_ELENCOLIQUID_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOLIQUID) PAN_ELENCOLIQUID_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCOLIQUID) PAN_ELENCOLIQUID_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOLIQUID) PAN_ELENCOLIQUID_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENCOLIQUID) PAN_ELENCOLIQUID_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
