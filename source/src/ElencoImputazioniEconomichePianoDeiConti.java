// **********************************************
// Elenco Imputazioni Economiche Piano Dei Conti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoImputazioniEconomichePianoDeiConti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_PARTE = 0;
  private static int PFL_PARAMETRI_FATTORE = 1;
  private static int PFL_PARAMETRI_CENTRO = 2;
  private static int PFL_PARAMETRI_FATTORDESCRI = 3;
  private static int PFL_PARAMETRI_CENTRIDESCRI = 4;
  private static int PFL_PARAMETRI_OK = 5;
  private static int PFL_PARAMETRI_ANNULLA = 6;
  private static int PFL_PARAMETRI_SOLCONIMPECO = 7;

  private static int PPQRY_PARAMETRI446 = 0;

  private static int PPQRY_FATTORE = 1;
  private static int PPQRY_CENTRO = 2;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI457(IMDB);
    //
    //
    Init_PQRY_PARAMETRI446(IMDB);
    Init_PQRY_PARAMETRI446_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI457(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI457, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI457, "TBL_PARAMETRI457");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI457,IMDBDef3.FLD_PARAMETRI457_ROWNAMENTSPE, "ROWNAMENTSPE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI457,IMDBDef3.FLD_PARAMETRI457_ROWNAMENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI457,IMDBDef3.FLD_PARAMETRI457_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI457,IMDBDef3.FLD_PARAMETRI457_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI457,IMDBDef3.FLD_PARAMETRI457_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI457,IMDBDef3.FLD_PARAMETRI457_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI457,IMDBDef3.FLD_PARAMETRI457_RONASOCOIMEC, "RONASOCOIMEC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI457,IMDBDef3.FLD_PARAMETRI457_RONASOCOIMEC,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI457, 0);
  }

  private static void Init_PQRY_PARAMETRI446(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI446, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI446, "PQRY_PARAMETRI446");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI446,IMDBDef11.PQSL_PARAMETRI446_ROWNAMENTSPE, "ROWNAMENTSPE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI446,IMDBDef11.PQSL_PARAMETRI446_ROWNAMENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI446,IMDBDef11.PQSL_PARAMETRI446_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI446,IMDBDef11.PQSL_PARAMETRI446_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI446,IMDBDef11.PQSL_PARAMETRI446_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI446,IMDBDef11.PQSL_PARAMETRI446_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI446,IMDBDef11.PQSL_PARAMETRI446_RONASOCOIMEC, "RONASOCOIMEC");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI446,IMDBDef11.PQSL_PARAMETRI446_RONASOCOIMEC,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI446, 0);
  }

  private static void Init_PQRY_PARAMETRI446_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI446_RS, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI446_RS, "PQRY_PARAMETRI446_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI446_RS,IMDBDef11.PQSL_PARAMETRI446_ROWNAMENTSPE, "ROWNAMENTSPE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI446_RS,IMDBDef11.PQSL_PARAMETRI446_ROWNAMENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI446_RS,IMDBDef11.PQSL_PARAMETRI446_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI446_RS,IMDBDef11.PQSL_PARAMETRI446_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI446_RS,IMDBDef11.PQSL_PARAMETRI446_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI446_RS,IMDBDef11.PQSL_PARAMETRI446_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI446_RS,IMDBDef11.PQSL_PARAMETRI446_RONASOCOIMEC, "RONASOCOIMEC");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI446_RS,IMDBDef11.PQSL_PARAMETRI446_RONASOCOIMEC,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoImputazioniEconomichePianoDeiConti(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoImputazioniEconomichePianoDeiConti()
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
    FormIdx = MyGlb.FRM_ELIMECPIDECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1411A956-B664-4C9A-B1DD-6F002D8B0909";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 676;
    DesignHeight = 194;
    set_Caption(new IDVariant("Elenco Imputazioni Economiche Piano dei Conti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 676;
    Frames[1].Height = 168;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 168;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 676-MyGlb.PAN_OFFS_X, 168-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A5641FE5-8119-4743-A32D-C8A6DC960930");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1072, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI457, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELIMECPIDECO_PARAMETRI446();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_CENTRO) {
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
    return (obj instanceof ElencoImputazioniEconomichePianoDeiConti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoImputazioniEconomichePianoDeiConti.class.getName() : (Glb.ClassWithPackage(ElencoImputazioniEconomichePianoDeiConti.class) ? ElencoImputazioniEconomichePianoDeiConti.class.getName().substring(ElencoImputazioniEconomichePianoDeiConti.class.getPackage().getName().length() + 1) : ElencoImputazioniEconomichePianoDeiConti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Fattore
  // **********************************************************************
  public int ApriFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Fattore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImputazioniEconomichePianoDeiConti", "ApriFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Centro
  // **********************************************************************
  public int ApriCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Centro Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImputazioniEconomichePianoDeiConti", "ApriCentro", _e);
      return -1;
    }
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI446, IMDBDef11.PQSL_PARAMETRI446_ROWNAMEFATTO, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI446, IMDBDef11.PQSL_PARAMETRI446_ROWNAMECENTR, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImputazioniEconomichePianoDeiConti", "EndModalEvent", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAMETRI457, IMDBDef3.FLD_PARAMETRI457_ROWNAMENTSPE, 0)))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI457, IMDBDef3.FLD_PARAMETRI457_ROWNAMENTSPE, 0, (new IDVariant("S")));
      }
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI457, IMDBDef3.FLD_PARAMETRI457_RONASOCOIMEC, 0, (new IDVariant("NO")));
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(2)), true)!=0)
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImputazioniEconomichePianoDeiConti", "LoadEvent", _e);
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImputazioniEconomichePianoDeiConti", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI457, IMDBDef3.FLD_PARAMETRI457_ROWNAMENTSPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI457, IMDBDef3.FLD_PARAMETRI457_ROWNAMEFATTO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI457, IMDBDef3.FLD_PARAMETRI457_ROWNAMECENTR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI457, IMDBDef3.FLD_PARAMETRI457_RONASOCOIMEC, 0, new IDVariant());
  }

  // **********************************************************************
  // OK Proc
  // OK
  // **********************************************************************
  public int OKProc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // OK Proc Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI446, IMDBDef11.PQSL_PARAMETRI446_ROWNAMENTSPE, 0)))
      {
        IDVariant C = new IDVariant(0,IDVariant.STRING);
        C = (new IDVariant("Selezionare la parte"));
        MainFrm.set_AlertMessage(C); 
        return 0;
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Elenco_imputaz_eco"));
      MainFrm.SetParametroStampaJasper((new IDVariant("A_ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("A_ES")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI446, IMDBDef11.PQSL_PARAMETRI446_ROWNAMENTSPE, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("A_CENTRO")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI446, IMDBDef11.PQSL_PARAMETRI446_ROWNAMECENTR, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("A_FATTORE")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI446, IMDBDef11.PQSL_PARAMETRI446_ROWNAMEFATTO, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("A_CENTRO_VIS")), ((MainFrm.GESTIOECONOM.equals((new IDVariant(2))))?(new IDVariant("S")):(new IDVariant("N"))));
      MainFrm.SetParametroStampaJasper((new IDVariant("A_SOLO_IMP_ECO")), IMDB.Value(IMDBDef11.PQRY_PARAMETRI446, IMDBDef11.PQSL_PARAMETRI446_RONASOCOIMEC, 0));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImputazioniEconomichePianoDeiConti", "OKProc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla Proc
  // OK
  // **********************************************************************
  public int AnnullaProc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Proc Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoImputazioniEconomichePianoDeiConti", "AnnullaProc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void ELIMECPIDECO_PARAMETRI446() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAMETRI446_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI457, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI457, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI446_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAMETRI446_RS, 0, IMDBDef3.TBL_PARAMETRI457, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI446_RS, 0, 0, IMDBDef3.TBL_PARAMETRI457, IMDBDef3.FLD_PARAMETRI457_ROWNAMENTSPE, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI446_RS, 1, 0, IMDBDef3.TBL_PARAMETRI457, IMDBDef3.FLD_PARAMETRI457_ROWNAMEFATTO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI446_RS, 2, 0, IMDBDef3.TBL_PARAMETRI457, IMDBDef3.FLD_PARAMETRI457_ROWNAMECENTR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI446_RS, 3, 0, IMDBDef3.TBL_PARAMETRI457, IMDBDef3.FLD_PARAMETRI457_RONASOCOIMEC, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI457, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI457, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI457, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAMETRI446_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_FATTORE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_CENTRO)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_OK)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OKProc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      AnnullaProc();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "AB86718F-1323-4447-9941-D4C10BBD46DB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "Parte");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORE, "D07107D7-F889-4278-B024-B5800F28A749");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORE, "Fattore");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, "6B1EEFC7-08D8-4E2E-9535-50981BD9D789");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, "Centro");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORDESCRI, "2C20D1F0-F090-4740-9CCF-8CB9A39AF6A4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORDESCRI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRIDESCRI, "3FB26323-23C7-4FC2-B465-24AEB78FFB9E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRIDESCRI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, "031B297C-16C3-4583-A66E-94DB35AD9074");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, "OK");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, "FC05F86F-5FE8-4881-B7CA-CF85AAB7EA51");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, "Annulla");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONIMPECO, "39B3AC10-F114-4988-85EE-69EDC2E6AB23");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONIMPECO, "Solo con Imputazioni Economiche");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONIMPECO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONIMPECO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONIMPECO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 172, 8, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARTE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARTE, PPQRY_PARAMETRI446, "A.ROWNAMENTSPE", "ROWNAMENTSPE", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORE, MyGlb.PANEL_LIST, 112, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORE, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORE, MyGlb.PANEL_FORM, 164, 32, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORE, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_FATTORE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_FATTORE, PPQRY_PARAMETRI446, "A.ROWNAMEFATTO", "ROWNAMEFATTO", 5, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_LIST, 184, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_FORM, 164, 56, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CENTRO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CENTRO, PPQRY_PARAMETRI446, "A.ROWNAMECENTR", "ROWNAMECENTR", 5, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORDESCRI, MyGlb.PANEL_FORM, 348, 32, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_FATTORDESCRI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_FATTORDESCRI, PPQRY_FATTORE, "A.DESCRIZIONE", "ROWNAMFATDES", 5, 200, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRIDESCRI, MyGlb.PANEL_FORM, 348, 56, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CENTRIDESCRI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CENTRIDESCRI, PPQRY_CENTRO, "A.DESCRIZIONE", "ROWNAMCENDES", 5, 200, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_LIST, 60, 116, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_FORM, 288, 112, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_OK, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_OK, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_LIST, 136, 116, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_FORM, 380, 112, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNULLA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONIMPECO, MyGlb.PANEL_LIST, 0, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONIMPECO, MyGlb.PANEL_LIST, 200);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONIMPECO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONIMPECO, MyGlb.PANEL_LIST, "Solo con Imputazioni Economiche");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONIMPECO, MyGlb.PANEL_FORM, 16, 80, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONIMPECO, MyGlb.PANEL_FORM, 200);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONIMPECO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONIMPECO, MyGlb.PANEL_FORM, "Solo con Imputazioni Economiche");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLCONIMPECO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLCONIMPECO, PPQRY_PARAMETRI446, "A.RONASOCOIMEC", "RONASOCOIMEC", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLCONIMPECO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLCONIMPECO, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMFATDES ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~TBL_PARAMETRI457.ROWNAMEFATTO~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_FATTORE, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_FATTORE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_FATTORE, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMCENDES ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~TBL_PARAMETRI457.ROWNAMECENTR~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_CENTRO, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_CENTRO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_CENTRO, "CENTRI");
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI446", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI446, IMDBDef11.PQRY_PARAMETRI446_RS, IMDBDef3.TBL_PARAMETRI457);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PARTE, IMDBDef3.FLD_PARAMETRI457_ROWNAMENTSPE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_FATTORE, IMDBDef3.FLD_PARAMETRI457_ROWNAMEFATTO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CENTRO, IMDBDef3.FLD_PARAMETRI457_ROWNAMECENTR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLCONIMPECO, IMDBDef3.FLD_PARAMETRI457_RONASOCOIMEC);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI457");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
