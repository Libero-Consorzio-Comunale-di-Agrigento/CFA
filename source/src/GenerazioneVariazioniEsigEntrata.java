// **********************************************
// Generazione Variazioni Esig Entrata
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GenerazioneVariazioniEsigEntrata extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_GENERAVARIAZ_PROPOSTA = 0;
  private static int PFL_GENERAVARIAZ_NUMERO = 1;
  private static int PFL_GENERAVARIAZ_ANNO = 2;
  private static int PFL_GENERAVARIAZ_ETICSCELPROP = 3;
  private static int PFL_GENERAVARIAZ_INFOPROP = 4;
  private static int PFL_GENERAVARIAZ_DESCRIZIONE = 5;
  private static int PFL_GENERAVARIAZ_DATAREG = 6;
  private static int PFL_GENERAVARIAZ_ETICHEELABOR = 7;
  private static int PFL_GENERAVARIAZ_TIPOVARIAZIO = 8;

  private static int PPQRY_PARS52 = 0;

  private static int PPQRY_T54 = 1;


  IDPanel PAN_GENERAVARIAZ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS67(IMDB);
    //
    //
    Init_PQRY_PARS52(IMDB);
    Init_PQRY_PARS52_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS67(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS67, 7);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS67, "TBL_PARS67");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS67,IMDBDef4.FLD_PARS67_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS67,IMDBDef4.FLD_PARS67_NOMEOGGEPROP,5,255,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS67,IMDBDef4.FLD_PARS67_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS67,IMDBDef4.FLD_PARS67_NOMEOGGENUME,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS67,IMDBDef4.FLD_PARS67_NOMEOGGEANNO, "NOMEOGGEANNO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS67,IMDBDef4.FLD_PARS67_NOMEOGGEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS67,IMDBDef4.FLD_PARS67_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS67,IMDBDef4.FLD_PARS67_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS67,IMDBDef4.FLD_PARS67_NOMOGGDATREG, "NOMOGGDATREG");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS67,IMDBDef4.FLD_PARS67_NOMOGGDATREG,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS67,IMDBDef4.FLD_PARS67_NOMOGGRITANT, "NOMOGGRITANT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS67,IMDBDef4.FLD_PARS67_NOMOGGRITANT,5,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS67,IMDBDef4.FLD_PARS67_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS67,IMDBDef4.FLD_PARS67_NOMOGGTIPVAR,1,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS67, 0);
  }

  private static void Init_PQRY_PARS52(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS52, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS52, "PQRY_PARS52");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS52,IMDBDef12.PQSL_PARS52_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS52,IMDBDef12.PQSL_PARS52_NOMEOGGEPROP,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS52,IMDBDef12.PQSL_PARS52_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS52,IMDBDef12.PQSL_PARS52_NOMEOGGENUME,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS52,IMDBDef12.PQSL_PARS52_NOMEOGGEANNO, "NOMEOGGEANNO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS52,IMDBDef12.PQSL_PARS52_NOMEOGGEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS52,IMDBDef12.PQSL_PARS52_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS52,IMDBDef12.PQSL_PARS52_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS52,IMDBDef12.PQSL_PARS52_NOMOGGDATREG, "NOMOGGDATREG");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS52,IMDBDef12.PQSL_PARS52_NOMOGGDATREG,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS52,IMDBDef12.PQSL_PARS52_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS52,IMDBDef12.PQSL_PARS52_NOMOGGTIPVAR,1,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARS52, 0);
  }

  private static void Init_PQRY_PARS52_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS52_RS, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS52_RS, "PQRY_PARS52_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS52_RS,IMDBDef12.PQSL_PARS52_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS52_RS,IMDBDef12.PQSL_PARS52_NOMEOGGEPROP,5,255,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS52_RS,IMDBDef12.PQSL_PARS52_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS52_RS,IMDBDef12.PQSL_PARS52_NOMEOGGENUME,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS52_RS,IMDBDef12.PQSL_PARS52_NOMEOGGEANNO, "NOMEOGGEANNO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS52_RS,IMDBDef12.PQSL_PARS52_NOMEOGGEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS52_RS,IMDBDef12.PQSL_PARS52_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS52_RS,IMDBDef12.PQSL_PARS52_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS52_RS,IMDBDef12.PQSL_PARS52_NOMOGGDATREG, "NOMOGGDATREG");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS52_RS,IMDBDef12.PQSL_PARS52_NOMOGGDATREG,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS52_RS,IMDBDef12.PQSL_PARS52_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS52_RS,IMDBDef12.PQSL_PARS52_NOMOGGTIPVAR,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GenerazioneVariazioniEsigEntrata(MyWebEntryPoint w, IMDBObj imdb)
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
  public GenerazioneVariazioniEsigEntrata()
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
    FormIdx = MyGlb.FRM_GENVARESIENT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5DCED15D-1A6B-4F43-B01B-E409415E73D6";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 460;
    DesignHeight = 234;
    set_Caption(new IDVariant("Generazione Variazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 460;
    Frames[1].Height = 208;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Generazione Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 208;
    PAN_GENERAVARIAZ = new IDPanel(w, this, 1, "PAN_GENERAVARIAZ");
    Frames[1].Content = PAN_GENERAVARIAZ;
    PAN_GENERAVARIAZ.Lockable = false;
    PAN_GENERAVARIAZ.iLocked = false;
    PAN_GENERAVARIAZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_GENERAVARIAZ.VS = MainFrm.VisualStyleList;
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 460-MyGlb.PAN_OFFS_X, 208-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "70039EEE-C8BE-4F06-B8DB-6395019FAB14");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 696, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_GENERAVARIAZ.InitStatus = 1;
    PAN_GENERAVARIAZ_Init();
    PAN_GENERAVARIAZ_InitFields();
    PAN_GENERAVARIAZ_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARS67, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENVARESIENT_PARS52();
      }
      PAN_GENERAVARIAZ.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_GENERAVARIAZ.FrIndex)
    {
      if (IdxFieldActived ==PFL_GENERAVARIAZ_ETICSCELPROP) {
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
    return (obj instanceof GenerazioneVariazioniEsigEntrata);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GenerazioneVariazioniEsigEntrata.class.getName() : (Glb.ClassWithPackage(GenerazioneVariazioniEsigEntrata.class) ? GenerazioneVariazioniEsigEntrata.class.getName().substring(GenerazioneVariazioniEsigEntrata.class.getPackage().getName().length() + 1) : GenerazioneVariazioniEsigEntrata.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniEsigEntrata", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMEOGGEPROP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMEOGGENUME, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMEOGGEANNO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMEOGGEDESC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMOGGDATREG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMOGGRITANT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMOGGTIPVAR, 0, new IDVariant());
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
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEPROP, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGENUME, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEANNO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniEsigEntrata", "EndModal", _e);
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
      PAN_GENERAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICSCELPROP, (MainFrm.GESTIODELIBE.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_GENERAVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, (MainFrm.GESTIODELIBE.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      IMDB.set_Value(IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMOGGDATREG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniEsigEntrata", "Load", _e);
    }
  }

  // **********************************************************************
  // Generazione Variazioni On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_GENERAVARIAZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Generazione Variazioni On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_GENERAVARIAZ_PROPOSTA)), true))
      {
        if (FieldWasModified.booleanValue())
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEPROP, 0))))
          {
            IMDB.set_Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEPROP, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEPROP, 0)));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_GENERAVARIAZ_DATAREG)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMOGGDATREG, 0))))
        {
          if (IDL.Year(IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMOGGDATREG, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Errore, l'anno della data di registrazione deve appartenere a quello dell'esercizio del contesto"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMOGGDATREG, 0, IDL.Today());
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniEsigEntrata", "GenerazioneVariazioniOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Info Proposta
  // **********************************************************************
  public int InfoProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposta Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGENUME, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEANNO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEPROP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGENUME, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEANNO, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniEsigEntrata", "InfoProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Scelta Prop
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaProp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Prop Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniEsigEntrata", "EtichettaSceltaProp", _e);
      return -1;
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
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEPROP, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGENUME, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEANNO, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Proposta nulla o incompleta"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEDESC, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Descrizione obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMOGGDATREG, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Data di Registrazione obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMOGGTIPVAR, 0)))
      {
        IDVariant S = null;
        S = (new IDVariant("Tipo Variazione obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if (IMDB.Value(IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMOGGRITANT, 0).equals((new IDVariant("R")), true))
      {
        MainFrm.Cf4armDBObject.GENERAVPROESIGRITARENT(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEDESC, 0), IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMOGGTIPVAR, 0), IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEPROP, 0), IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGENUME, 0), IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEANNO, 0), IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMOGGDATREG, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      }
      else
      {
        // 
        // = "A"
        // 
        MainFrm.Cf4armDBObject.GENERAVPROESIGANTICENT(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEDESC, 0), IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMOGGTIPVAR, 0), IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEPROP, 0), IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGENUME, 0), IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMEOGGEANNO, 0), IMDB.Value(IMDBDef12.PQRY_PARS52, IMDBDef12.PQSL_PARS52_NOMOGGDATREG, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      }
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniEsigEntrata", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void GENVARESIENT_PARS52() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARS52_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARS67, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARS67, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARS52_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARS52_RS, 0, IMDBDef4.TBL_PARS67, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS52_RS, 0, 0, IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMEOGGEPROP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS52_RS, 1, 0, IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMEOGGENUME, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS52_RS, 2, 0, IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMEOGGEANNO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS52_RS, 3, 0, IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMEOGGEDESC, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS52_RS, 4, 0, IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMOGGDATREG, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS52_RS, 5, 0, IMDBDef4.TBL_PARS67, IMDBDef4.FLD_PARS67_NOMOGGTIPVAR, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARS67, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARS67, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARS67, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARS52_RS, 0);
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
  private void PAN_GENERAVARIAZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_GENERAVARIAZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_GENERAVARIAZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_GENERAVARIAZ, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_GENERAVARIAZ_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_GENERAVARIAZ);
    // Stub
  }

  private void PAN_GENERAVARIAZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_GENERAVARIAZ_ETICSCELPROP)
    {
      this.IdxPanelActived = this.PAN_GENERAVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaProp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GENERAVARIAZ_INFOPROP)
    {
      this.IdxPanelActived = this.PAN_GENERAVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GENERAVARIAZ_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_GENERAVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_GENERAVARIAZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_GENERAVARIAZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_GENERAVARIAZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_GENERAVARIAZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_GENERAVARIAZ_Init()
  {

    PAN_GENERAVARIAZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_GENERAVARIAZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_GENERAVARIAZ.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, "27D4BD39-2958-4460-AC80-93E6BBFB1171");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, "Proposta");
    PAN_GENERAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, "5DC23216-4692-4ACE-83CF-5089A17D2C03");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, "-");
    PAN_GENERAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, "B00B477D-0E7D-497B-BA6B-B46E00DF3869");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, "/");
    PAN_GENERAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICSCELPROP, "CC8E912A-E38A-4F5E-839A-4426086847C8");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICSCELPROP, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICSCELPROP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_GENERAVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICSCELPROP, 0, "wsearch1.gif", false);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICSCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, "CF0B8797-E7BD-4059-BF21-A9E134E98488");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_GENERAVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, 0, "info.gif", false);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DESCRIZIONE, "6DF72FDC-C5A0-476D-BFD6-65393199A2B3");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DESCRIZIONE, "Descrizione");
    PAN_GENERAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DESCRIZIONE, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DESCRIZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, "FF4A2D56-47AB-41A2-A2CB-064298C0E399");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, "Data Reg.");
    PAN_GENERAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.VIS_NORMFIELPADR);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, "28A0BE12-4481-4EF6-9537-B948E548CF9E");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, "Elabora");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_GENERAVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, 0, "button1.gif", false);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENERAVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_TIPOVARIAZIO, "A6BB6474-C5E3-4564-8CC3-89A317A74AAC");
    PAN_GENERAVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_TIPOVARIAZIO, "Tipo Variazione");
    PAN_GENERAVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_TIPOVARIAZIO, "");
    PAN_GENERAVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_GENERAVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_GENERAVARIAZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 60);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 32, 28, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 72);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_PROPOSTA, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_PROPOSTA, PPQRY_PARS52, "A.NOMEOGGEPROP", "NOMEOGGEPROP", 5, 255, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_LIST, 52);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_LIST, "-");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_FORM, 168, 28, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_FORM, 16);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_NUMERO, MyGlb.PANEL_FORM, "-");
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_NUMERO, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_NUMERO, PPQRY_PARS52, "A.NOMEOGGENUME", "NOMEOGGENUME", 1, 4, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_LIST, 40);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_LIST, "/");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_FORM, 232, 28, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_FORM, 16);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ANNO, MyGlb.PANEL_FORM, "/");
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_ANNO, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_ANNO, PPQRY_PARS52, "A.NOMEOGGEANNO", "NOMEOGGEANNO", 1, 4, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICSCELPROP, MyGlb.PANEL_LIST, 272, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICSCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICSCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICSCELPROP, MyGlb.PANEL_FORM, 300, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICSCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICSCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_ETICSCELPROP, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_ETICSCELPROP, -1, "", "ETICSCELPROP", 0, 0, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, MyGlb.PANEL_LIST, 280, 44, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, MyGlb.PANEL_LIST, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, MyGlb.PANEL_FORM, 320, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, MyGlb.PANEL_FORM, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_INFOPROP, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_INFOPROP, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_INFOPROP, -1, "", "INFOPROP", 0, 0, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DESCRIZIONE, MyGlb.PANEL_FORM, 12, 52, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DESCRIZIONE, MyGlb.PANEL_FORM, 92);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_DESCRIZIONE, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_DESCRIZIONE, PPQRY_PARS52, "A.NOMEOGGEDESC", "NOMEOGGEDESC", 5, 140, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_LIST, 60);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_FORM, 44, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_FORM, 60);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_DATAREG, MyGlb.PANEL_FORM, "Data Reg");
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_DATAREG, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_DATAREG, PPQRY_PARS52, "A.NOMOGGDATREG", "NOMOGGDATREG", 6, 14, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, MyGlb.PANEL_LIST, 224, 180, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, MyGlb.PANEL_FORM, 348, 148, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_ETICHEELABOR, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 92);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_GENERAVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 8, 100, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENERAVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_GENERAVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_GENERAVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENERAVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_GENERAVARIAZ.SetFieldPage(PFL_GENERAVARIAZ_TIPOVARIAZIO, -1, -1);
    PAN_GENERAVARIAZ.SetFieldPanel(PFL_GENERAVARIAZ_TIPOVARIAZIO, PPQRY_PARS52, "A.NOMOGGTIPVAR", "NOMOGGTIPVAR", 1, 2, 0, -13997);
  }

  private void PAN_GENERAVARIAZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_GENERAVARIAZ.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T54 A, ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL B ");
    SQL.append("where (A.CODICE = ~~NOMOGGTIPVAR~~) ");
    SQL.append("and   (B.CODICE = A.TIPOLOGIA) ");
    SQL.append("and   (B.TIPO_IMPORTO = 'RE') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_GENERAVARIAZ.SetQuery(PPQRY_T54, 0, SQL, PFL_GENERAVARIAZ_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T54 A, ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL B ");
    SQL.append("where (B.CODICE = A.TIPOLOGIA) ");
    SQL.append("and   (B.TIPO_IMPORTO = 'RE') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_GENERAVARIAZ.SetQuery(PPQRY_T54, 1, SQL, PFL_GENERAVARIAZ_TIPOVARIAZIO, "");
    PAN_GENERAVARIAZ.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_GENERAVARIAZ.SetIMDB(IMDB, "PQRY_PARS52", true);
    PAN_GENERAVARIAZ.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_GENERAVARIAZ.SetQueryIMDB(PPQRY_PARS52, IMDBDef12.PQRY_PARS52_RS, IMDBDef4.TBL_PARS67);
    JustLoaded = true;
    PAN_GENERAVARIAZ.SetFieldPrimaryIndex(PFL_GENERAVARIAZ_PROPOSTA, IMDBDef4.FLD_PARS67_NOMEOGGEPROP);
    PAN_GENERAVARIAZ.SetFieldPrimaryIndex(PFL_GENERAVARIAZ_NUMERO, IMDBDef4.FLD_PARS67_NOMEOGGENUME);
    PAN_GENERAVARIAZ.SetFieldPrimaryIndex(PFL_GENERAVARIAZ_ANNO, IMDBDef4.FLD_PARS67_NOMEOGGEANNO);
    PAN_GENERAVARIAZ.SetFieldPrimaryIndex(PFL_GENERAVARIAZ_DESCRIZIONE, IMDBDef4.FLD_PARS67_NOMEOGGEDESC);
    PAN_GENERAVARIAZ.SetFieldPrimaryIndex(PFL_GENERAVARIAZ_DATAREG, IMDBDef4.FLD_PARS67_NOMOGGDATREG);
    PAN_GENERAVARIAZ.SetFieldPrimaryIndex(PFL_GENERAVARIAZ_TIPOVARIAZIO, IMDBDef4.FLD_PARS67_NOMOGGTIPVAR);
    PAN_GENERAVARIAZ.SetMasterTable(0, "PARS67");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_GENERAVARIAZ.Status() == 2)
    {
      int oldListQBE = PAN_GENERAVARIAZ.iUseListQBE;
      PAN_GENERAVARIAZ.iUseListQBE = 0;
      PAN_GENERAVARIAZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_GENERAVARIAZ.PanelCommand(Glb.PCM_FIND);
      PAN_GENERAVARIAZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_GENERAVARIAZ) PAN_GENERAVARIAZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_GENERAVARIAZ) PAN_GENERAVARIAZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_GENERAVARIAZ) PAN_GENERAVARIAZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_GENERAVARIAZ) PAN_GENERAVARIAZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_GENERAVARIAZ) PAN_GENERAVARIAZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
