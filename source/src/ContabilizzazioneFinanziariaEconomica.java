// **********************************************
// Contabilizzazione Finanziaria Economica
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ContabilizzazioneFinanziariaEconomica extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_DOCUMENTI = 0;
  private static int GRP_PARAM_NOTECONTEMES = 1;

  private static int PFL_PARAM_TIPOREGISTRO = 0;
  private static int PFL_PARAM_TIPOBOLLATO = 1;
  private static int PFL_PARAM_ELABORA = 2;
  private static int PFL_PARAM_TIPOREGIBOLL = 3;
  private static int PFL_PARAM_DOCUEMEFINAL = 4;
  private static int PFL_PARAM_NEWPANELLABE = 5;
  private static int PFL_PARAM_DEBITORE = 6;
  private static int PFL_PARAM_CONTROPARTIT = 7;
  private static int PFL_PARAM_FATTORDESCRI = 8;
  private static int PFL_PARAM_CODICEDEBITO = 9;
  private static int PFL_PARAM_SCEGBENFBUTT = 10;

  private static int PPQRY_PARAM25 = 0;

  private static int PPQRY_FATTORI = 1;
  private static int PPQRY_BEN = 2;

  private static int PPQRY_T04 = 3;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM12(IMDB);
    //
    //
    Init_PQRY_PARAM25(IMDB);
    Init_PQRY_PARAM25_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM12, 6);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM12, "TBL_PARAM12");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM12,IMDBDef2.FLD_PARAM12_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM12,IMDBDef2.FLD_PARAM12_ROWNAMTIPREG,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM12,IMDBDef2.FLD_PARAM12_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM12,IMDBDef2.FLD_PARAM12_ROWNAMTIPBOL,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM12,IMDBDef2.FLD_PARAM12_ROWNAMREGBOL, "ROWNAMREGBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM12,IMDBDef2.FLD_PARAM12_ROWNAMREGBOL,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM12,IMDBDef2.FLD_PARAM12_ROWNAMDOCEME, "ROWNAMDOCEME");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM12,IMDBDef2.FLD_PARAM12_ROWNAMDOCEME,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM12,IMDBDef2.FLD_PARAM12_ROWNAMCONPAT, "ROWNAMCONPAT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM12,IMDBDef2.FLD_PARAM12_ROWNAMCONPAT,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM12,IMDBDef2.FLD_PARAM12_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM12,IMDBDef2.FLD_PARAM12_ROWNAMCODDEB,2,15,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM12, 0);
  }

  private static void Init_PQRY_PARAM25(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAM25, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAM25, "PQRY_PARAM25");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM25,IMDBDef9.PQSL_PARAM25_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM25,IMDBDef9.PQSL_PARAM25_ROWNAMTIPREG,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM25,IMDBDef9.PQSL_PARAM25_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM25,IMDBDef9.PQSL_PARAM25_ROWNAMTIPBOL,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM25,IMDBDef9.PQSL_PARAM25_ROWNAMREGBOL, "ROWNAMREGBOL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM25,IMDBDef9.PQSL_PARAM25_ROWNAMREGBOL,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM25,IMDBDef9.PQSL_PARAM25_ROWNAMDOCEME, "ROWNAMDOCEME");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM25,IMDBDef9.PQSL_PARAM25_ROWNAMDOCEME,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM25,IMDBDef9.PQSL_PARAM25_ROWNAMCONPAT, "ROWNAMCONPAT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM25,IMDBDef9.PQSL_PARAM25_ROWNAMCONPAT,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM25,IMDBDef9.PQSL_PARAM25_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM25,IMDBDef9.PQSL_PARAM25_ROWNAMCODDEB,2,15,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAM25, 0);
  }

  private static void Init_PQRY_PARAM25_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAM25_RS, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAM25_RS, "PQRY_PARAM25_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM25_RS,IMDBDef9.PQSL_PARAM25_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM25_RS,IMDBDef9.PQSL_PARAM25_ROWNAMTIPREG,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM25_RS,IMDBDef9.PQSL_PARAM25_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM25_RS,IMDBDef9.PQSL_PARAM25_ROWNAMTIPBOL,1,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM25_RS,IMDBDef9.PQSL_PARAM25_ROWNAMREGBOL, "ROWNAMREGBOL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM25_RS,IMDBDef9.PQSL_PARAM25_ROWNAMREGBOL,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM25_RS,IMDBDef9.PQSL_PARAM25_ROWNAMDOCEME, "ROWNAMDOCEME");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM25_RS,IMDBDef9.PQSL_PARAM25_ROWNAMDOCEME,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM25_RS,IMDBDef9.PQSL_PARAM25_ROWNAMCONPAT, "ROWNAMCONPAT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM25_RS,IMDBDef9.PQSL_PARAM25_ROWNAMCONPAT,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM25_RS,IMDBDef9.PQSL_PARAM25_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM25_RS,IMDBDef9.PQSL_PARAM25_ROWNAMCODDEB,2,15,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ContabilizzazioneFinanziariaEconomica(MyWebEntryPoint w, IMDBObj imdb)
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
  public ContabilizzazioneFinanziariaEconomica()
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
    FormIdx = MyGlb.FRM_CONTFINAECON;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E0B572B1-3831-4D61-A8D0-03417719A968";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 496;
    DesignHeight = 314;
    set_Caption(new IDVariant("Contabilizzazione Finanziaria Economica"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 496;
    Frames[1].Height = 288;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 288;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 496-MyGlb.PAN_OFFS_X, 288-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1791FBD8-9EF9-4AF6-9D84-5AB7DA98A102");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1172, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM12, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTFINAECON_PARAM25();
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
    if (CallerIdx == MyGlb.FRM_SCELFATTCONT && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_CONTROPARTIT) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_SCEGBENFBUTT) {
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
    return (obj instanceof ContabilizzazioneFinanziariaEconomica);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ContabilizzazioneFinanziariaEconomica.class.getName() : (Glb.ClassWithPackage(ContabilizzazioneFinanziariaEconomica.class) ? ContabilizzazioneFinanziariaEconomica.class.getName().substring(ContabilizzazioneFinanziariaEconomica.class.getPackage().getName().length() + 1) : ContabilizzazioneFinanziariaEconomica.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_PARAM_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_PARAM_DEBITORE)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_DEBITORE))), IDL.Today(), (new IDVariant("FAT")), (new IDVariant(0)), (new IDVariant("NO")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContabilizzazioneFinanziariaEconomica", "ParamOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Param Tipo Registro Bollato Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAM_TIPOREGIBOLL_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Tipo Registro Bollato Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMREGBOL, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMTIPREG, 0, IDL.ToInteger(IDL.SubStr(IMDB.Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMREGBOL, 0), (new IDVariant(0)), (new IDVariant(1)))));
        IMDB.set_Value(IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMTIPBOL, 0, IDL.ToInteger(IDL.Trim(IDL.SubStr(IMDB.Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMREGBOL, 0), (new IDVariant(2)), (new IDVariant(2))), true, true)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContabilizzazioneFinanziariaEconomica", "ParamTipoRegistroBollatoValidateEvent", _e);
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
      PAN_PARAM.PanelCommand(Glb.PCM_UPDATE);
      UNLOADEVENT_PARADELEROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContabilizzazioneFinanziariaEconomica", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Param: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMTIPREG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMTIPBOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMREGBOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMDOCEME, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMCONPAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMCODDEB, 0, new IDVariant());
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
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
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SOGGETTO)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_CODICE, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMCODDEB, 0, (new IDVariant()));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELFATTCONT)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMCONPAT, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI2, IMDBDef7.PQSL_FATTORI2_FATTORE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContabilizzazioneFinanziariaEconomica", "EndModalEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Contabilizzazione Finanziaria/Economica", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContabilizzazioneFinanziariaEconomica", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // OK
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int OK ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMERODOCUME = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_SMS = (new IDVariant("Sono stati contabilizzati ", IDVariant.STRING));
      v_SMS1 = (new IDVariant(" documenti", IDVariant.STRING));
      // 
      // OK Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMDOCEME, 0)))
      {
        IDVariant v_SMS2 = new IDVariant(0,IDVariant.STRING);
        v_SMS2 = (new IDVariant("Indicare la data emissione", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS2); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMCODDEB, 0)))
      {
        IDVariant v_SMS2 = new IDVariant(0,IDVariant.STRING);
        v_SMS2 = (new IDVariant("Indicare il debitore", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS2); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.CONTABILIZZAFINECODOCCNC(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMTIPREG, 0), IMDB.Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMTIPBOL, 0), IMDB.Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMDOCEME, 0), IMDB.Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMCODDEB, 0), IMDB.Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMCONPAT, 0), v_NUMERODOCUME);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_SMS, IDL.ToString(v_NUMERODOCUME)), v_SMS1)); 
      ((DocumentiDebitoriNonCodificati)MainFrm.GetForm(MyGlb.FRM_DOCDEBNONCOD,0)).PAN_DOCUMDACONTA.PanelCommand(Glb.PCM_REQUERY);
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContabilizzazioneFinanziariaEconomica", "OK", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scegli Benficiario Button
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ScegliBenficiarioButton ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Benficiario Button Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContabilizzazioneFinanziariaEconomica", "ScegliBenficiarioButton", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Contropartita
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Contropartita ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Contropartita Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMDATREG, 0, IMDB.Value(IMDBDef9.PQRY_PARAM25, IMDBDef9.PQSL_PARAM25_ROWNAMDOCEME, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMETIPO, 0, (new IDVariant("P")));
      MainFrm.Show(MyGlb.FRM_SCELFATTCONT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ContabilizzazioneFinanziariaEconomica", "Contropartita", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void CONTFINAECON_PARAM25() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAM25_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM12, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM12, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAM25_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAM25_RS, 0, IMDBDef2.TBL_PARAM12, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM25_RS, 0, 0, IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMTIPREG, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM25_RS, 1, 0, IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMTIPBOL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM25_RS, 2, 0, IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMREGBOL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM25_RS, 3, 0, IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMDOCEME, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM25_RS, 4, 0, IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMCONPAT, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM25_RS, 5, 0, IMDBDef2.TBL_PARAM12, IMDBDef2.FLD_PARAM12_ROWNAMCODDEB, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM12, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM12, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM12, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAM25_RS, 0);
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
      OK();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_CONTROPARTIT)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Contropartita();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_SCEGBENFBUTT)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliBenficiarioButton();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAM_TIPOREGIBOLL)
      {
        PFL_PARAM_TIPOREGIBOLL_ValidateCell(Cancel);
      }
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
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, "AA2A20A0-4F52-4907-96A0-83EB131473D7");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, "Documenti");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, MyGlb.PANEL_LIST, 80, -9999, 312, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, MyGlb.PANEL_FORM, 8, 3, 460, 73, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, 0, 61);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, 1, 4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_NOTECONTEMES, "E5A5F9F3-50AF-471B-A548-6D67F5825D97");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_NOTECONTEMES, "Note Contabili Emesse");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_NOTECONTEMES, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_NOTECONTEMES, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_NOTECONTEMES, MyGlb.PANEL_LIST, 0, -9999, 404, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_NOTECONTEMES, MyGlb.PANEL_FORM, 8, 91, 460, 73, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_NOTECONTEMES, 0, 124);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_NOTECONTEMES, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_NOTECONTEMES, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_NOTECONTEMES, 1, 4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_NOTECONTEMES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, "F8D31B05-E5B7-4A8A-AFE2-4402C3AF531F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, "Tipo Registro");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, "48226F17-8E62-492E-BBC5-ED37565C1F62");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, "Tipo Bollato");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "04C4F4D8-7709-4239-9C8E-3691C69C4816");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "DC53BC12-8F43-4F29-990F-35CB2A88828F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "Tipo Registro/Bollato");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, "952CDFAF-3DCF-448E-9266-47C0F6EFC712");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, "Documenti emessi fino al");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, "5CCE7987-9FE2-402E-A8C2-CCC82843057C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, "D1C2930E-B5BA-4022-9EA3-9C98AF4B696B");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, "Debitore");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPARTIT, "3F21B746-1B86-4085-ADBD-01E9E71580B7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPARTIT, "Contropartita");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPARTIT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPARTIT, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPARTIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, "32099C1C-46A0-4A5F-97FF-537D437CB02A");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, "5061B5A8-CF0B-4C5E-A886-693A26B21765");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, "Codice Debitore");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, "6127067C-2E22-47BD-BB09-AFBA8D6B18AA");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, 0, "wsearch1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_LIST, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_LIST, "Tp. Regis.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_FORM, 32, 64, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_FORM, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGISTRO, MyGlb.PANEL_FORM, "Tipo Registro");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOREGISTRO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOREGISTRO, PPQRY_PARAM25, "A.ROWNAMTIPREG", "ROWNAMTIPREG", 1, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_LIST, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_LIST, "Tp. Boll.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_FORM, 184, 64, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_FORM, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOBOLLATO, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOBOLLATO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOBOLLATO, PPQRY_PARAM25, "A.ROWNAMTIPBOL", "ROWNAMTIPBOL", 1, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 112, 104, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 388, 180, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ELABORA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 80, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_LIST, "Tipo Registro/Bollato");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 36, 28, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 128);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOREGIBOLL, MyGlb.PANEL_FORM, "Tipo Registro/Bollato");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOREGIBOLL, -1, GRP_PARAM_DOCUMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOREGIBOLL, PPQRY_PARAM25, "A.ROWNAMREGBOL", "ROWNAMREGBOL", 5, 50, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_LIST, 288, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_LIST, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_LIST, "Doc. ems. fn. al");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_FORM, 12, 52, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_FORM, 152);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DOCUEMEFINAL, MyGlb.PANEL_FORM, "Documenti emessi fino al");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DOCUEMEFINAL, -1, GRP_PARAM_DOCUMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DOCUEMEFINAL, PPQRY_PARAM25, "A.ROWNAMDOCEME", "ROWNAMDOCEME", 6, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, MyGlb.PANEL_LIST, 316, 56, 24, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, MyGlb.PANEL_FORM, 440, 60, 24, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_NEWPANELLABE, -1, GRP_PARAM_DOCUMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, 20, 116, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DEBITORE, -1, GRP_PARAM_NOTECONTEMES);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DEBITORE, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "DEBITORE", 5, 160, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPARTIT, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPARTIT, MyGlb.PANEL_LIST, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPARTIT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPARTIT, MyGlb.PANEL_LIST, "Contropartita");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPARTIT, MyGlb.PANEL_FORM, 12, 140, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPARTIT, MyGlb.PANEL_FORM, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPARTIT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPARTIT, MyGlb.PANEL_FORM, "Contropartita");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CONTROPARTIT, -1, GRP_PARAM_NOTECONTEMES);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CONTROPARTIT, PPQRY_PARAM25, "A.ROWNAMCONPAT", "ROWNAMCONPAT", 5, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_FORM, 168, 140, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_PARAM.SetFieldPage(PFL_PARAM_FATTORDESCRI, -1, GRP_PARAM_NOTECONTEMES);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_LIST, "Cd. Deb.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_FORM, 384, 116, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_FORM, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_FORM, "Cd. Deb.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CODICEDEBITO, -1, GRP_PARAM_NOTECONTEMES);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CODICEDEBITO, PPQRY_PARAM25, "A.ROWNAMCODDEB", "ROWNAMCODDEB", 2, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_LIST, 312, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_FORM, 448, 120, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SCEGBENFBUTT, -1, GRP_PARAM_NOTECONTEMES);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SCEGBENFBUTT, -1, "", "SCEGBENFBUTT", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~ROWNAMCONPAT~~) ");
    SQL.append("and   (A.TIPO = 'A' OR A.TIPO = 'P') ");
    SQL.append("and   (A.DATA_VALIDITA >= ~~ROWNAMDOCEME~~ OR (A.DATA_VALIDITA IS NULL)) ");
    PAN_PARAM.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~ROWNAMCODDEB~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_PARAM.SetQueryLKE(PPQRY_BEN, PFL_PARAM_CODICEDEBITO, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAM.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_PARAM.SetQueryHeaderColumn(PPQRY_BEN, "DEBITORE", "Debitore");
    PAN_PARAM.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_PARAM.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_PARAM.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_PARAM.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  LPAD(TO_CHAR ( A.TIPO_REGISTRO ), 1, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR(' ', 1, 1)) as T04REGISBOLL, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (LPAD(TO_CHAR ( A.TIPO_REGISTRO ), 1, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR(' ', 1, 1)) = ~~ROWNAMREGBOL~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = 6) ");
    SQL.append("order by 1 ");
    PAN_PARAM.SetQuery(PPQRY_T04, 0, SQL, PFL_PARAM_TIPOREGIBOLL, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  LPAD(TO_CHAR ( A.TIPO_REGISTRO ), 1, SUBSTR(' ', 1, 1)) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR(' ', 1, 1)) as T04REGISBOLL, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = 6) ");
    SQL.append("order by 1 ");
    PAN_PARAM.SetQuery(PPQRY_T04, 1, SQL, PFL_PARAM_TIPOREGIBOLL, "");
    PAN_PARAM.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM25", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM25, IMDBDef9.PQRY_PARAM25_RS, IMDBDef2.TBL_PARAM12);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOREGISTRO, IMDBDef2.FLD_PARAM12_ROWNAMTIPREG);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOBOLLATO, IMDBDef2.FLD_PARAM12_ROWNAMTIPBOL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOREGIBOLL, IMDBDef2.FLD_PARAM12_ROWNAMREGBOL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DOCUEMEFINAL, IMDBDef2.FLD_PARAM12_ROWNAMDOCEME);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CONTROPARTIT, IMDBDef2.FLD_PARAM12_ROWNAMCONPAT);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CODICEDEBITO, IMDBDef2.FLD_PARAM12_ROWNAMCODDEB);
    PAN_PARAM.SetMasterTable(0, "PARAM12");
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
