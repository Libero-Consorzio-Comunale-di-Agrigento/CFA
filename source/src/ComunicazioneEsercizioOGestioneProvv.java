// **********************************************
// Comunicazione Esercizio O Gestione Provv
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ComunicazioneEsercizioOGestioneProvv extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_PARTE = 0;
  private static int PFL_PARAMETRI_ELABORBUTTON = 1;
  private static int PFL_PARAMETRI_DELIBERA = 2;
  private static int PFL_PARAMETRI_NUMERODELIBE = 3;
  private static int PFL_PARAMETRI_ANNODELIBERA = 4;
  private static int PFL_PARAMETRI_DATA = 5;
  private static int PFL_PARAMETRI_APRIDELIBERA = 6;
  private static int PFL_PARAMETRI_INFODELIBERA = 7;

  private static int PPQRY_PARAMESTAM24 = 0;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI472(IMDB);
    //
    //
    Init_PQRY_PARAMESTAM24(IMDB);
    Init_PQRY_PARAMESTAM24_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI472(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI472, 5);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI472, "TBL_PARAMETRI472");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI472,IMDBDef6.FLD_PARAMETRI472_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI472,IMDBDef6.FLD_PARAMETRI472_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI472,IMDBDef6.FLD_PARAMETRI472_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI472,IMDBDef6.FLD_PARAMETRI472_ROWNAMEDELIB,5,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI472,IMDBDef6.FLD_PARAMETRI472_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI472,IMDBDef6.FLD_PARAMETRI472_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI472,IMDBDef6.FLD_PARAMETRI472_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI472,IMDBDef6.FLD_PARAMETRI472_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI472,IMDBDef6.FLD_PARAMETRI472_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI472,IMDBDef6.FLD_PARAMETRI472_ROWNAMEDATA,6,10,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI472, 0);
  }

  private static void Init_PQRY_PARAMESTAM24(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAMESTAM24, 5);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAMESTAM24, "PQRY_PARAMESTAM24");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM24,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM24,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM24,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM24,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDELIB,5,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM24,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM24,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM24,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM24,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM24,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM24,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDATA,6,10,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PARAMESTAM24, 0);
  }

  private static void Init_PQRY_PARAMESTAM24_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAMESTAM24_RS, 5);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAMESTAM24_RS, "PQRY_PARAMESTAM24_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM24_RS,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM24_RS,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM24_RS,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM24_RS,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDELIB,5,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM24_RS,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM24_RS,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM24_RS,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM24_RS,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM24_RS,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM24_RS,IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDATA,6,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ComunicazioneEsercizioOGestioneProvv(MyWebEntryPoint w, IMDBObj imdb)
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
  public ComunicazioneEsercizioOGestioneProvv()
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
    FormIdx = MyGlb.FRM_COMESEOGESPR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "103D7179-94BB-40B1-8AAD-6EC6E05DE017";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 424;
    DesignHeight = 190;
    set_Caption(new IDVariant("Comunicazione degli stanziamenti in esercizio o gestione provvisoria"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 424;
    Frames[1].Height = 164;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 164;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 424-MyGlb.PAN_OFFS_X, 164-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "971B7AE6-3EBB-4764-8254-BA97AE60CEE0");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 452, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI472, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        COMESEOGESPR_PARAMESTAM24();
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRIDELIBERA) {
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
    return (obj instanceof ComunicazioneEsercizioOGestioneProvv);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ComunicazioneEsercizioOGestioneProvv.class.getName() : (Glb.ClassWithPackage(ComunicazioneEsercizioOGestioneProvv.class) ? ComunicazioneEsercizioOGestioneProvv.class.getName().substring(ComunicazioneEsercizioOGestioneProvv.class.getPackage().getName().length() + 1) : ComunicazioneEsercizioOGestioneProvv.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDELIB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMANNDEL, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneEsercizioOGestioneProvv", "ParametriOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_DELIBERA)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMERODELIBE)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNODELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDELIB, 0))))
        {
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDELIB, 0, IDL.Upper(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDELIB, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDELIB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMANNDEL, 0))))
        {
          IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
          IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
          v_SEDEDEL = IDL.Upper(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDELIB, 0));
          v_NUMERODEL = IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMNUMDEL, 0);
          v_ANNODEL = IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMANNDEL, 0);
          MainFrm.ControlloDelibereNonDaInserire(v_SEDEDEL, v_ANNODEL, v_NUMERODEL);
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDELIB, 0, new IDVariant(v_SEDEDEL));
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMNUMDEL, 0, new IDVariant(v_NUMERODEL));
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMANNDEL, 0, new IDVariant(v_ANNODEL));
          if (!(IDL.IsNull(v_SEDEDEL)))
          {
            IDVariant v_VMAX = null;
            v_VMAX = (new IDVariant());
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  MAX(A.D_DATA_REG) as MAXVARDDATRE ");
            SQL.append("from ");
            SQL.append("  VARCOM A ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.SEDE_DEL = " + IDL.CSql(v_SEDEDEL, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(v_NUMERODEL, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(v_ANNODEL, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VMAX = QV.Get("MAXVARDDATRE", IDVariant.DATETIME) ;
            }
            QV.Close();
            if (!(IDL.IsNull(v_VMAX)))
            {
              if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDATA, 0)))
              {
                IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDATA, 0, new IDVariant(v_VMAX));
              }
            }
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneEsercizioOGestioneProvv", "ParametriOnUpdatingRow", _e);
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
      LOADEVENT_PARAMEDELETE();
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI472, IMDBDef6.FLD_PARAMETRI472_ROWNAMEPARTE, 0, (new IDVariant("ES")));
      AutoSaveType = (new IDVariant("NONE")).stringValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneEsercizioOGestioneProvv", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI472, IMDBDef6.FLD_PARAMETRI472_ROWNAMEPARTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI472, IMDBDef6.FLD_PARAMETRI472_ROWNAMEDELIB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI472, IMDBDef6.FLD_PARAMETRI472_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI472, IMDBDef6.FLD_PARAMETRI472_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI472, IMDBDef6.FLD_PARAMETRI472_ROWNAMEDATA, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDELIB, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneEsercizioOGestioneProvv", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDATA, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Indicare la Data"));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEPARTE, 0).compareTo((new IDVariant("S")), true)!=0)
        {
          MainFrm.Cf4armDBObject.WORKBILSTNE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDATA, 0));
        }
        if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEPARTE, 0).compareTo((new IDVariant("E")), true)!=0)
        {
          MainFrm.Cf4armDBObject.WORKBILSTNS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDATA, 0));
        }
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
          v_NOMESTAMPA = (new IDVariant("Comunicazione_Stn_Ese_Gp"));
          MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
          MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("PARTE")), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEPARTE, 0));
          MainFrm.SetParametroStampaJasper((new IDVariant("DATA")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDATA, 0)));
          MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneEsercizioOGestioneProvv", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibere Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneEsercizioOGestioneProvv", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDELIB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMANNDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMEDELIB, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef16.PQRY_PARAMESTAM24, IMDBDef16.PQSL_PARAMESTAM24_ROWNAMNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneEsercizioOGestioneProvv", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Stampa
  // Primary record source for panel data
  // **********************************************************************
  private void COMESEOGESPR_PARAMESTAM24() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PARAMESTAM24_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI472, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI472, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PARAMESTAM24_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PARAMESTAM24_RS, 0, IMDBDef6.TBL_PARAMETRI472, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM24_RS, 0, 0, IMDBDef6.TBL_PARAMETRI472, IMDBDef6.FLD_PARAMETRI472_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM24_RS, 1, 0, IMDBDef6.TBL_PARAMETRI472, IMDBDef6.FLD_PARAMETRI472_ROWNAMEDELIB, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM24_RS, 2, 0, IMDBDef6.TBL_PARAMETRI472, IMDBDef6.FLD_PARAMETRI472_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM24_RS, 3, 0, IMDBDef6.TBL_PARAMETRI472, IMDBDef6.FLD_PARAMETRI472_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM24_RS, 4, 0, IMDBDef6.TBL_PARAMETRI472, IMDBDef6.FLD_PARAMETRI472_ROWNAMEDATA, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI472, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI472, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI472, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PARAMESTAM24_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    // Stub
  }

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

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRIDELIBERA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "809CC7EE-0370-4E25-9B24-7A66D70D73B6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "Parte");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "78E3852D-7CBE-4AB2-AC7B-7A4FAEA1B892");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "12A2E8FF-E7E6-4DEB-A2CE-B76F28B73436");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "92B8E9C9-54ED-4550-9597-3831814F99EE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "-");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "AE261B60-31CC-4FDE-85C1-AA62FD4C676A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, "A429FB43-28ED-474B-90DE-A8185D0AA006");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, "Data");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, "23F1AAF5-1425-4E0F-AF26-20DF915EF810");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, "AA93CDBA-6C1B-45B9-A5DB-F1BC93EF219D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 88, 16, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARTE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARTE, PPQRY_PARAMESTAM24, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 100, 168, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 304, 108, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORBUTTON, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 84, 44, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERA, PPQRY_PARAMESTAM24, "A.ROWNAMEDELIB", "ROWNAMEDELIB", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, "-");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 196, 44, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, "-");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODELIBE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODELIBE, PPQRY_PARAMESTAM24, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 280, 44, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODELIBERA, PPQRY_PARAMESTAM24, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_LIST, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_FORM, 104, 72, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_FORM, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATA, PPQRY_PARAMESTAM24, "A.ROWNAMEDATA", "ROWNAMEDATA", 6, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_LIST, 232, 24, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_FORM, 344, 48, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRIDELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRIDELIBERA, -1, "", "APRIDELIBERA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 224, 16, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 364, 48, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFODELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMESTAM24", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMESTAM24, IMDBDef16.PQRY_PARAMESTAM24_RS, IMDBDef6.TBL_PARAMETRI472);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PARTE, IMDBDef6.FLD_PARAMETRI472_ROWNAMEPARTE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DELIBERA, IMDBDef6.FLD_PARAMETRI472_ROWNAMEDELIB);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODELIBE, IMDBDef6.FLD_PARAMETRI472_ROWNAMNUMDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODELIBERA, IMDBDef6.FLD_PARAMETRI472_ROWNAMANNDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATA, IMDBDef6.FLD_PARAMETRI472_ROWNAMEDATA);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI472");
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
