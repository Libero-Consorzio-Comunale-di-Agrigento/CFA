// **********************************************
// Corrispondenze Capitoli
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CorrispondenzeCapitoli extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTRO_ENTRATASPESA = 0;

  private static int PPQRY_FILTRO1 = 0;


  IDPanel PAN_FILTRO;
  private static int PFL_CORRISCAPARM_CAPITOLOARM = 0;
  private static int PFL_CORRISCAPARM_ARTICOLOARM = 1;
  private static int PFL_CORRISCAPARM_APRIARM = 2;
  private static int PFL_CORRISCAPARM_INFOARM = 3;
  private static int PFL_CORRISCAPARM_CAPDESCRIZIO = 4;
  private static int PFL_CORRISCAPARM_RISORSINTERV = 5;
  private static int PFL_CORRISCAPARM_CAPITOLO = 6;
  private static int PFL_CORRISCAPARM_ARTICOLO = 7;
  private static int PFL_CORRISCAPARM_APRIDL77 = 8;
  private static int PFL_CORRISCAPARM_INFODL77 = 9;
  private static int PFL_CORRISCAPARM_CAP77DESCRIZ = 10;
  private static int PFL_CORRISCAPARM_ETICHEARMONI = 11;
  private static int PFL_CORRISCAPARM_ETICHETTDL77 = 12;
  private static int PFL_CORRISCAPARM_ESERCIZIO = 13;
  private static int PFL_CORRISCAPARM_ES = 14;
  private static int PFL_CORRISCAPARM_ETICARTIARMO = 15;
  private static int PFL_CORRISCAPARM_ETICARTIDL77 = 16;

  private static int PPQRY_CORRISCAPARM = 0;

  private static int PPQRY_CAP = 1;
  private static int PPQRY_CAP77 = 2;
  private static int PPQRY_DUAL = 3;


  IDPanel PAN_CORRISCAPARM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRO15(IMDB);
    //
    //
    Init_PQRY_CORRISCAPARM(IMDB);
    Init_PQRY_FILTRO1(IMDB);
    Init_PQRY_FILTRO1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRO15(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_FILTRO15, 2);
    IMDB.set_TblCode(IMDBDef3.TBL_FILTRO15, "TBL_FILTRO15");
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRO15,IMDBDef3.FLD_FILTRO15_ROWNAMENTSPE, "ROWNAMENTSPE");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRO15,IMDBDef3.FLD_FILTRO15_ROWNAMENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRO15,IMDBDef3.FLD_FILTRO15_RONASOCADACO, "RONASOCADACO");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRO15,IMDBDef3.FLD_FILTRO15_RONASOCADACO,5,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_FILTRO15, 0);
  }

  private static void Init_PQRY_CORRISCAPARM(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CORRISCAPARM, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_CORRISCAPARM, "PQRY_CORRISCAPARM");
    IMDB.set_FldCode(IMDBDef10.PQRY_CORRISCAPARM,IMDBDef10.PQSL_CORRISCAPARM_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CORRISCAPARM,IMDBDef10.PQSL_CORRISCAPARM_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CORRISCAPARM,IMDBDef10.PQSL_CORRISCAPARM_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef10.PQRY_CORRISCAPARM,IMDBDef10.PQSL_CORRISCAPARM_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CORRISCAPARM,IMDBDef10.PQSL_CORRISCAPARM_CAPITOLO_ARM, "CAPITOLO_ARM");
    IMDB.SetFldParams(IMDBDef10.PQRY_CORRISCAPARM,IMDBDef10.PQSL_CORRISCAPARM_CAPITOLO_ARM,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CORRISCAPARM,IMDBDef10.PQSL_CORRISCAPARM_ARTICOLO_ARM, "ARTICOLO_ARM");
    IMDB.SetFldParams(IMDBDef10.PQRY_CORRISCAPARM,IMDBDef10.PQSL_CORRISCAPARM_ARTICOLO_ARM,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CORRISCAPARM,IMDBDef10.PQSL_CORRISCAPARM_RISORSA_INTERVENTO, "RISORSA_INTERVENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CORRISCAPARM,IMDBDef10.PQSL_CORRISCAPARM_RISORSA_INTERVENTO,1,7,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CORRISCAPARM,IMDBDef10.PQSL_CORRISCAPARM_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CORRISCAPARM,IMDBDef10.PQSL_CORRISCAPARM_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CORRISCAPARM,IMDBDef10.PQSL_CORRISCAPARM_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CORRISCAPARM,IMDBDef10.PQSL_CORRISCAPARM_ARTICOLO,1,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CORRISCAPARM, 0);
  }

  private static void Init_PQRY_FILTRO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FILTRO1, 1);
    IMDB.set_TblCode(IMDBDef10.PQRY_FILTRO1, "PQRY_FILTRO1");
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRO1,IMDBDef10.PQSL_FILTRO1_ROWNAMENTSPE, "ROWNAMENTSPE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRO1,IMDBDef10.PQSL_FILTRO1_ROWNAMENTSPE,5,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_FILTRO1, 0);
  }

  private static void Init_PQRY_FILTRO1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FILTRO1_RS, 1);
    IMDB.set_TblCode(IMDBDef10.PQRY_FILTRO1_RS, "PQRY_FILTRO1_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRO1_RS,IMDBDef10.PQSL_FILTRO1_ROWNAMENTSPE, "ROWNAMENTSPE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRO1_RS,IMDBDef10.PQSL_FILTRO1_ROWNAMENTSPE,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CorrispondenzeCapitoli(MyWebEntryPoint w, IMDBObj imdb)
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
  public CorrispondenzeCapitoli()
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
    FormIdx = MyGlb.FRM_CORRISCAPITO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0BF42731-DD08-460B-85CF-FF48CEEB6130";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 948;
    DesignHeight = 486;
    set_Caption(new IDVariant("Corrispondenze Capitoli"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 948;
    Frames[1].Height = 460;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.11087;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 948;
    Frames[2].Height = 51;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtro";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 51;
    PAN_FILTRO = new IDPanel(w, this, 2, "PAN_FILTRO");
    Frames[2].Content = PAN_FILTRO;
    PAN_FILTRO.Lockable = false;
    PAN_FILTRO.iLocked = false;
    PAN_FILTRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRO.VS = MainFrm.VisualStyleList;
    PAN_FILTRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 948-MyGlb.PAN_OFFS_X, 51-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "101BEB29-57DC-42A8-9FC9-B4CDC87FD35F");
    PAN_FILTRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 64, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRO.InitStatus = 1;
    PAN_FILTRO_Init();
    PAN_FILTRO_InitFields();
    PAN_FILTRO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 948;
    Frames[3].Height = 409;
    Frames[3].Caption = "CORRISPONDENZE CAP ARM";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 409;
    PAN_CORRISCAPARM = new IDPanel(w, this, 3, "PAN_CORRISCAPARM");
    Frames[3].Content = PAN_CORRISCAPARM;
    PAN_CORRISCAPARM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CORRISCAPARM.VS = MainFrm.VisualStyleList;
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 948-MyGlb.PAN_OFFS_X, 409-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BAF8F26C-808D-46F9-BD5D-F5F62A5045F1");
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 32, 888, 296, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CORRISCAPARM.InitStatus = 1;
    PAN_CORRISCAPARM_Init();
    PAN_CORRISCAPARM_InitFields();
    PAN_CORRISCAPARM_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG146+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIONI6+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG146+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELENCOCAPITO+BaseCmdLinIdx)
      {
        ElencoCapitoli();
        break fine;
      }
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
      if (IMDB.TblModified(IMDBDef3.TBL_FILTRO15, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CORRISCAPITO_FILTRO1();
      }
      PAN_CORRISCAPARM.UpdatePanel(MainFrm);
      PAN_FILTRO.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARTARM && flRis && IdxPanelActived == PAN_CORRISCAPARM.FrIndex)
    {
      if (IdxFieldActived ==PFL_CORRISCAPARM_APRIARM) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEVOCPEDL77 && flRis && IdxPanelActived == PAN_CORRISCAPARM.FrIndex)
    {
      if (IdxFieldActived ==PFL_CORRISCAPARM_APRIDL77) {
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
    return (obj instanceof CorrispondenzeCapitoli);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CorrispondenzeCapitoli.class.getName() : (Glb.ClassWithPackage(CorrispondenzeCapitoli.class) ? CorrispondenzeCapitoli.class.getName().substring(CorrispondenzeCapitoli.class.getPackage().getName().length() + 1) : CorrispondenzeCapitoli.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // CORRISPONDENZE CAP ARM On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CORRISCAPARM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CORRISCAPARM);
      // 
      // CORRISPONDENZE CAP ARM On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_CORRISCAPARM.set_ToolTip(Glb.OBJ_FIELD,PFL_CORRISCAPARM_CAPDESCRIZIO,(new IDVariant(PAN_CORRISCAPARM.FieldText(PFL_CORRISCAPARM_CAPDESCRIZIO))).stringValue()); 
      PAN_CORRISCAPARM.set_ToolTip(Glb.OBJ_FIELD,PFL_CORRISCAPARM_CAP77DESCRIZ,(new IDVariant(PAN_CORRISCAPARM.FieldText(PFL_CORRISCAPARM_CAP77DESCRIZ))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzeCapitoli", "CORRISPONDENZECAPARMOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // CORRISPONDENZE CAP ARM On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_CORRISCAPARM_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // CORRISPONDENZE CAP ARM On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_CORRISCAPARM.Status()).equals((new IDVariant(1)), true))
      {
        PAN_CORRISCAPARM.Freezed = (new IDVariant(-1)).booleanValue();
      }
      else
      {
        PAN_CORRISCAPARM.Freezed = (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzeCapitoli", "CORRISPONDENZECAPARMOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // CORRISPONDENZE CAP ARM On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_CORRISCAPARM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // CORRISPONDENZE CAP ARM On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_CORRISCAPARM, IMDBDef10.PQSL_CORRISCAPARM_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CORRISCAPARM, IMDBDef10.PQSL_CORRISCAPARM_E_S, 0, IMDB.Value(IMDBDef10.PQRY_FILTRO1, IMDBDef10.PQSL_FILTRO1_ROWNAMENTSPE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzeCapitoli", "CORRISPONDENZECAPARMOnUpdatingRow", _e);
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_FILTRO15, IMDBDef3.FLD_FILTRO15_ROWNAMENTSPE, 0, (new IDVariant("E")));
      IDVariant v_RISORSA = null;
      v_RISORSA = (new IDVariant("Risorsa"));
      PAN_CORRISCAPARM.set_Header(Glb.OBJ_FIELD,PFL_CORRISCAPARM_RISORSINTERV, new IDVariant(v_RISORSA).stringValue());
      PAN_CORRISCAPARM.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_CORRISCAPARM.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzeCapitoli", "Load", _e);
    }
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEVOCPEDL77)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_CORRISCAPARM, IMDBDef10.PQSL_CORRISCAPARM_RISORSA_INTERVENTO, 0, IMDB.Value(IMDBDef7.PQRY_CAP77, IMDBDef7.PQSL_CAP77_RECORDRISORS, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CORRISCAPARM, IMDBDef10.PQSL_CORRISCAPARM_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP77, IMDBDef7.PQSL_CAP77_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CORRISCAPARM, IMDBDef10.PQSL_CORRISCAPARM_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP77, IMDBDef7.PQSL_CAP77_ARTICOLO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARTARM)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_CORRISCAPARM, IMDBDef10.PQSL_CORRISCAPARM_CAPITOLO_ARM, 0, IMDB.Value(IMDBDef7.PQRY_CAP24, IMDBDef7.PQSL_CAP24_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_CORRISCAPARM, IMDBDef10.PQSL_CORRISCAPARM_ARTICOLO_ARM, 0, IMDB.Value(IMDBDef7.PQRY_CAP24, IMDBDef7.PQSL_CAP24_ARTICOLO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzeCapitoli", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Scelta Capitolo Armonizzazione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaCapitoloArmonizzazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Capitolo Armonizzazione Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI424, IMDBDef1.FLD_PARAMETRI424_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI424, IMDBDef1.FLD_PARAMETRI424_ROWNAMEES, 0, IMDB.Value(IMDBDef10.PQRY_FILTRO1, IMDBDef10.PQSL_FILTRO1_ROWNAMENTSPE, 0));
      MainFrm.Show(MyGlb.FRM_SCECAPARTARM, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzeCapitoli", "SceltaCapitoloArmonizzazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Voce P E G DL 77
  // **********************************************************************
  public int SceltaVocePEGDL77 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Voce P E G DL 77 Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI423, IMDBDef1.FLD_PARAMETRI423_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI423, IMDBDef1.FLD_PARAMETRI423_ROWNAMEES, 0, IMDB.Value(IMDBDef10.PQRY_FILTRO1, IMDBDef10.PQSL_FILTRO1_ROWNAMENTSPE, 0));
      MainFrm.Show(MyGlb.FRM_SCEVOCPEDL77, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzeCapitoli", "SceltaVocePEGDL77", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Arm
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoArm ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Arm Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef10.PQRY_FILTRO1, IMDBDef10.PQSL_FILTRO1_ROWNAMENTSPE, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef10.PQRY_CORRISCAPARM, IMDBDef10.PQSL_CORRISCAPARM_CAPITOLO_ARM, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef10.PQRY_CORRISCAPARM, IMDBDef10.PQSL_CORRISCAPARM_ARTICOLO_ARM, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzeCapitoli", "InfoArm", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info DL77
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDL77 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info DL77 Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMES, 0, IMDB.Value(IMDBDef10.PQRY_FILTRO1, IMDBDef10.PQSL_FILTRO1_ROWNAMENTSPE, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMRISORSA, 0, IMDB.Value(IMDBDef10.PQRY_CORRISCAPARM, IMDBDef10.PQSL_CORRISCAPARM_RISORSA_INTERVENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMCAPITOL, 0, IMDB.Value(IMDBDef10.PQRY_CORRISCAPARM, IMDBDef10.PQSL_CORRISCAPARM_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMARTICOL, 0, IMDB.Value(IMDBDef10.PQRY_CORRISCAPARM, IMDBDef10.PQSL_CORRISCAPARM_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI476, IMDBDef1.FLD_PARAMETRI476_PARAMDATADAL, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_INFSUVOCBI77, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzeCapitoli", "InfoDL77", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elenco Capitoli
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ElencoCapitoli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Capitoli Body
      // Corpo Procedura
      // 
      MainFrm.SetParametroStampaJasper((new IDVariant("ES")), IMDB.Value(IMDBDef10.PQRY_FILTRO1, IMDBDef10.PQSL_FILTRO1_ROWNAMENTSPE, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.LanciaStampaJasper((new IDVariant("Elenco_Capitoli")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzeCapitoli", "ElencoCapitoli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtro On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FILTRO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtro On Updating Row Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_FILTRO1, IMDBDef10.PQSL_FILTRO1_ROWNAMENTSPE, 0).equals((new IDVariant("E")), true))
      {
        IDVariant v_RISORSA = null;
        v_RISORSA = (new IDVariant("Risorsa"));
        PAN_CORRISCAPARM.set_Header(Glb.OBJ_FIELD,PFL_CORRISCAPARM_RISORSINTERV, new IDVariant(v_RISORSA).stringValue());
      }
      else
      {
        IDVariant v_INTERVENTO = null;
        v_INTERVENTO = (new IDVariant("Intervento"));
        PAN_CORRISCAPARM.set_Header(Glb.OBJ_FIELD,PFL_CORRISCAPARM_RISORSINTERV, new IDVariant(v_INTERVENTO).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CorrispondenzeCapitoli", "FiltroOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Filtro
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CORRISCAPITO_FILTRO1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_FILTRO1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_FILTRO15, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_FILTRO15, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_FILTRO1_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_FILTRO1_RS, 0, IMDBDef3.TBL_FILTRO15, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FILTRO1_RS, 0, 0, IMDBDef3.TBL_FILTRO15, IMDBDef3.FLD_FILTRO15_ROWNAMENTSPE, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_FILTRO15, 0);
      if (IMDB.Eof(IMDBDef3.TBL_FILTRO15, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_FILTRO15, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_FILTRO1_RS, 0);
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
  private void PAN_FILTRO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILTRO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILTRO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FILTRO);
    // Stub
  }

  private void PAN_FILTRO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FILTRO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FILTRO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTRO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CORRISCAPARM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CORRISCAPARM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CORRISCAPARM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CORRISCAPARM, Cancel);
    // Stub
  }

  private void PAN_CORRISCAPARM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CORRISCAPARM_APRIARM)
    {
      this.IdxPanelActived = this.PAN_CORRISCAPARM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCapitoloArmonizzazione();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CORRISCAPARM_INFOARM)
    {
      this.IdxPanelActived = this.PAN_CORRISCAPARM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoArm();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CORRISCAPARM_APRIDL77)
    {
      this.IdxPanelActived = this.PAN_CORRISCAPARM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaVocePEGDL77();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CORRISCAPARM_INFODL77)
    {
      this.IdxPanelActived = this.PAN_CORRISCAPARM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDL77();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CORRISCAPARM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CORRISCAPARM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_CORRISCAPARM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CORRISCAPARM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CORRISCAPARM_Init()
  {

    PAN_CORRISCAPARM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CORRISCAPARM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CORRISCAPARM.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLOARM, "0F1DA89D-52D6-4039-89F2-6FB268683512");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLOARM, "Capitolo");
    PAN_CORRISCAPARM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLOARM, "Capitolo");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLOARM, MyGlb.VIS_NORFIEINTLUN);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLOARM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLOARM, "67A8CB02-784A-45B3-B854-69DF37EC76AA");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLOARM, "Art.");
    PAN_CORRISCAPARM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLOARM, "Art.");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLOARM, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLOARM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIARM, "EC913F6A-1426-4AA9-9E44-8883A816C1CC");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIARM, "Apri Arm");
    PAN_CORRISCAPARM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIARM, "");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIARM, MyGlb.VIS_HYPELINKIMMA);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIARM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFOARM, "6B29BA06-413D-4268-ACC6-C184B95139B7");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFOARM, "Info Arm");
    PAN_CORRISCAPARM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFOARM, "");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFOARM, MyGlb.VIS_HYPELINKIMMA);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFOARM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPDESCRIZIO, "FBBF54DC-C43B-462E-AE85-B81765B47DCD");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPDESCRIZIO, "Descrizione");
    PAN_CORRISCAPARM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPDESCRIZIO, "Descrizione");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPDESCRIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_RISORSINTERV, "D35EE626-FF62-479A-AF90-52D22F9D51AD");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_RISORSINTERV, "RISORSA INTERVENTO");
    PAN_CORRISCAPARM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_RISORSINTERV, "");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_RISORSINTERV, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_RISORSINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLO, "5305CF67-0EE7-46A4-B6E8-234FC5920E43");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLO, "Capitolo");
    PAN_CORRISCAPARM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLO, "Capitolo");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLO, "F3D87968-6ADD-4F62-AC83-747ED0D7870E");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLO, "Art.");
    PAN_CORRISCAPARM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLO, "Art.");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIDL77, "0BE4E287-5BBF-43C2-87CB-DCB429AACA7B");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIDL77, "Apri DL77");
    PAN_CORRISCAPARM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIDL77, "");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIDL77, MyGlb.VIS_HYPELINKIMMA);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIDL77, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFODL77, "25221ED0-B702-4EF1-AB0C-AA7CDC4CCCCD");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFODL77, "Info DL77");
    PAN_CORRISCAPARM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFODL77, "");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFODL77, MyGlb.VIS_HYPELINKIMMA);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFODL77, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAP77DESCRIZ, "BFCCC417-9315-4B89-8E5F-27B5B61FF9F5");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAP77DESCRIZ, "Descrizione");
    PAN_CORRISCAPARM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAP77DESCRIZ, "");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAP77DESCRIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAP77DESCRIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHEARMONI, "6AEB04B4-D388-4D01-9CF8-A989C2C58663");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHEARMONI, "ARMONIZZAZIONE");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHEARMONI, MyGlb.VIS_LAVISTPEGRCE);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHEARMONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHETTDL77, "2FFB2FD4-6421-46AB-9C7F-12DD2B527878");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHETTDL77, "D.L. 77");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHETTDL77, MyGlb.VIS_LAVISTPEGRCE);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHETTDL77, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ESERCIZIO, "2014FD38-6237-4E07-9357-49D178DA695F");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ESERCIZIO, "ESERCIZIO");
    PAN_CORRISCAPARM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ESERCIZIO, "");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ES, "62B01295-46FB-426A-B844-929342049ACE");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ES, "E S");
    PAN_CORRISCAPARM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ES, "");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ES, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ES, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIARMO, "1E9AD1A6-E4E4-486F-98B7-51FE1C7781BF");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIARMO, "Art.");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIARMO, MyGlb.VIS_LABEVISUSTYL);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIARMO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CORRISCAPARM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIDL77, "3ECEB008-CC6B-4AC1-A197-7E4CD1608757");
    PAN_CORRISCAPARM.set_Header(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIDL77, "Art.");
    PAN_CORRISCAPARM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIDL77, MyGlb.VIS_LABEVISUSTYL);
    PAN_CORRISCAPARM.SetFlags(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIDL77, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_CORRISCAPARM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLOARM, MyGlb.PANEL_LIST, 0, 68, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLOARM, MyGlb.PANEL_LIST, 96);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLOARM, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLOARM, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLOARM, MyGlb.PANEL_FORM, 4, 52, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLOARM, MyGlb.PANEL_FORM, 144);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLOARM, MyGlb.PANEL_FORM, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLOARM, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_CAPITOLOARM, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_CAPITOLOARM, PPQRY_CORRISCAPARM, "A.CAPITOLO_ARM", "CAPITOLO_ARM", 3, 16, 0, -13997);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLOARM, MyGlb.PANEL_LIST, 128, 68, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLOARM, MyGlb.PANEL_LIST, 96);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLOARM, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLOARM, MyGlb.PANEL_LIST, "Art.");
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLOARM, MyGlb.PANEL_FORM, 4, 76, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLOARM, MyGlb.PANEL_FORM, 144);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLOARM, MyGlb.PANEL_FORM, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLOARM, MyGlb.PANEL_FORM, "Art.");
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_ARTICOLOARM, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_ARTICOLOARM, PPQRY_CORRISCAPARM, "A.ARTICOLO_ARM", "ARTICOLO_ARM", 1, 2, 0, -13997);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIARM, MyGlb.PANEL_LIST, 160, 68, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIARM, MyGlb.PANEL_LIST, 60);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIARM, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIARM, MyGlb.PANEL_LIST, "Ap. Ar.");
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIARM, MyGlb.PANEL_FORM, 4, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIARM, MyGlb.PANEL_FORM, 60);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIARM, MyGlb.PANEL_FORM, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIARM, MyGlb.PANEL_FORM, "Apri Arm");
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_APRIARM, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_APRIARM, PPQRY_DUAL, "'A'", "APRIARM", 5, 1, 0, -13997);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIARM, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CORRISCAPARM.set_ImageResizeMode(PFL_CORRISCAPARM_APRIARM, 2);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFOARM, MyGlb.PANEL_LIST, 184, 68, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFOARM, MyGlb.PANEL_LIST, 92);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFOARM, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFOARM, MyGlb.PANEL_LIST, "In. Ar.");
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFOARM, MyGlb.PANEL_FORM, 4, 172, 600, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFOARM, MyGlb.PANEL_FORM, 92);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFOARM, MyGlb.PANEL_FORM, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFOARM, MyGlb.PANEL_FORM, "Info Arm");
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_INFOARM, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_INFOARM, PPQRY_DUAL, "DECODE(~~CAPITOLO_ARM~~, NULL, NULL, 'I')", "INFOARM", 5, 99, 0, -13997);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFOARM, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPDESCRIZIO, MyGlb.PANEL_LIST, 208, 68, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPDESCRIZIO, MyGlb.PANEL_FORM, 4, 172, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPDESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_CAPDESCRIZIO, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_CAPDESCRIZIO, PPQRY_CAP, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_RISORSINTERV, MyGlb.PANEL_LIST, 448, 68, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_RISORSINTERV, MyGlb.PANEL_LIST, 132);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_RISORSINTERV, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_RISORSINTERV, MyGlb.PANEL_LIST, "RIS. INTERV.");
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_RISORSINTERV, MyGlb.PANEL_FORM, 4, 100, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_RISORSINTERV, MyGlb.PANEL_FORM, 144);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_RISORSINTERV, MyGlb.PANEL_FORM, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_RISORSINTERV, MyGlb.PANEL_FORM, "RISORSA INTERVENTO");
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_RISORSINTERV, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_RISORSINTERV, PPQRY_CORRISCAPARM, "A.RISORSA_INTERVENTO", "RISORSA_INTERVENTO", 1, 7, 0, -13997);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLO, MyGlb.PANEL_LIST, 516, 68, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLO, MyGlb.PANEL_FORM, 4, 124, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLO, MyGlb.PANEL_FORM, 144);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_CAPITOLO, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_CAPITOLO, PPQRY_CORRISCAPARM, "A.CAPITOLO", "CAPITOLO", 1, 6, 0, -13997);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLO, MyGlb.PANEL_LIST, 572, 68, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLO, MyGlb.PANEL_FORM, 4, 148, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLO, MyGlb.PANEL_FORM, 144);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_ARTICOLO, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_ARTICOLO, PPQRY_CORRISCAPARM, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIDL77, MyGlb.PANEL_LIST, 604, 68, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIDL77, MyGlb.PANEL_LIST, 64);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIDL77, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIDL77, MyGlb.PANEL_LIST, "Ap. DL.");
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIDL77, MyGlb.PANEL_FORM, 4, 172, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIDL77, MyGlb.PANEL_FORM, 64);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIDL77, MyGlb.PANEL_FORM, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_APRIDL77, MyGlb.PANEL_FORM, "Apri DL77");
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_APRIDL77, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_APRIDL77, PPQRY_DUAL, "'A'", "APRIDL77", 5, 1, 0, -13997);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_APRIDL77, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CORRISCAPARM.set_ImageResizeMode(PFL_CORRISCAPARM_APRIDL77, 2);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFODL77, MyGlb.PANEL_LIST, 628, 68, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFODL77, MyGlb.PANEL_LIST, 96);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFODL77, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFODL77, MyGlb.PANEL_LIST, "In. DL.");
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFODL77, MyGlb.PANEL_FORM, 4, 196, 604, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFODL77, MyGlb.PANEL_FORM, 96);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFODL77, MyGlb.PANEL_FORM, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_INFODL77, MyGlb.PANEL_FORM, "Info DL77");
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_INFODL77, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_INFODL77, PPQRY_DUAL, "DECODE(~~CAPITOLO~~, NULL, NULL, 'I')", "INFODL77", 5, 99, 0, -13997);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CORRISCAPARM.SetValueListItem(PFL_CORRISCAPARM_INFODL77, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAP77DESCRIZ, MyGlb.PANEL_LIST, 652, 68, 236, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAP77DESCRIZ, MyGlb.PANEL_LIST, 124);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAP77DESCRIZ, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAP77DESCRIZ, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAP77DESCRIZ, MyGlb.PANEL_FORM, 4, 172, 484, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAP77DESCRIZ, MyGlb.PANEL_FORM, 124);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAP77DESCRIZ, MyGlb.PANEL_FORM, 2);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_CAP77DESCRIZ, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_CAP77DESCRIZ, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_CAP77DESCRIZ, PPQRY_CAP77, "A.DESCRIZIONE", "CAP77DESCRIZ", 5, 140, 0, -13997);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHEARMONI, MyGlb.PANEL_LIST, 0, 8, 448, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHEARMONI, MyGlb.PANEL_LIST, 0);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHEARMONI, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHEARMONI, MyGlb.PANEL_FORM, 8, 8, 132, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHEARMONI, MyGlb.PANEL_FORM, 0);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHEARMONI, MyGlb.PANEL_FORM, 1);
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_ETICHEARMONI, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_ETICHEARMONI, -1, "", "ETICHEARMONI", 0, 0, 0, -13997);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHETTDL77, MyGlb.PANEL_LIST, 448, 8, 440, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHETTDL77, MyGlb.PANEL_LIST, 0);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHETTDL77, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHETTDL77, MyGlb.PANEL_FORM, 248, 12, 120, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHETTDL77, MyGlb.PANEL_FORM, 0);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICHETTDL77, MyGlb.PANEL_FORM, 1);
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_ETICHETTDL77, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_ETICHETTDL77, -1, "", "ETICHETTDL77", 0, 0, 0, -13997);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ESERCIZIO, MyGlb.PANEL_FORM, 4, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_ESERCIZIO, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_ESERCIZIO, PPQRY_CORRISCAPARM, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ES, MyGlb.PANEL_LIST, 24);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ES, MyGlb.PANEL_LIST, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ES, MyGlb.PANEL_LIST, "E S");
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ES, MyGlb.PANEL_FORM, 4, 172, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ES, MyGlb.PANEL_FORM, 24);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ES, MyGlb.PANEL_FORM, 1);
    PAN_CORRISCAPARM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ES, MyGlb.PANEL_FORM, "E S");
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_ES, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_ES, PPQRY_CORRISCAPARM, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIARMO, MyGlb.PANEL_LIST, 128, 32, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIARMO, MyGlb.PANEL_LIST, 0);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIARMO, MyGlb.PANEL_LIST, 2);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIARMO, MyGlb.PANEL_FORM, 28, 340, 260, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIARMO, MyGlb.PANEL_FORM, 0);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIARMO, MyGlb.PANEL_FORM, 1);
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_ETICARTIARMO, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_ETICARTIARMO, -1, "", "ETICARTIARMO", 0, 0, 0, -13997);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIDL77, MyGlb.PANEL_LIST, 572, 32, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIDL77, MyGlb.PANEL_LIST, 0);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIDL77, MyGlb.PANEL_LIST, 2);
    PAN_CORRISCAPARM.SetRect(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIDL77, MyGlb.PANEL_FORM, 68, 336, 324, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CORRISCAPARM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIDL77, MyGlb.PANEL_FORM, 0);
    PAN_CORRISCAPARM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CORRISCAPARM_ETICARTIDL77, MyGlb.PANEL_FORM, 2);
    PAN_CORRISCAPARM.SetFieldPage(PFL_CORRISCAPARM_ETICARTIDL77, -1, -1);
    PAN_CORRISCAPARM.SetFieldPanel(PFL_CORRISCAPARM_ETICARTIDL77, -1, "", "ETICARTIDL77", 0, 0, 0, -13997);
  }

  private void PAN_CORRISCAPARM_InitQueries()
  {
    StringBuffer SQL;

    PAN_CORRISCAPARM.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.CAPITOLO = ~~CAPITOLO_ARM~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO_ARM~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    PAN_CORRISCAPARM.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_CORRISCAPARM.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISCAPARM.SetMasterTable(PPQRY_CAP, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAP77DESCRIZ ");
    SQL.append("from ");
    SQL.append("  CAP_77 A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_FILTRO1.ROWNAMENTSPE~~) ");
    SQL.append("and   (A.RISORSA_INTERVENTO = ~~RISORSA_INTERVENTO~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    PAN_CORRISCAPARM.SetQuery(PPQRY_CAP77, 0, SQL, -1, "");
    PAN_CORRISCAPARM.SetQueryDB(PPQRY_CAP77, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISCAPARM.SetMasterTable(PPQRY_CAP77, "CAP_77");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'A' as APRIARM, ");
    SQL.append("  'A' as APRIDL77, ");
    SQL.append("  DECODE(~~CAPITOLO_ARM~~, NULL, NULL, 'I') as INFOARM, ");
    SQL.append("  DECODE(~~CAPITOLO~~, NULL, NULL, 'I') as INFODL77 ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ESERCIZIO~~ IS NULL))) ");
    PAN_CORRISCAPARM.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_CORRISCAPARM.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISCAPARM.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_CORRISCAPARM.SetIMDB(IMDB, "PQRY_CORRISCAPARM", true);
    PAN_CORRISCAPARM.set_SetString(MyGlb.MASTER_ROWNAME, "CORRISPONDENZE CAP ARM");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO_ARM as CAPITOLO_ARM, ");
    SQL.append("  A.ARTICOLO_ARM as ARTICOLO_ARM, ");
    SQL.append("  A.RISORSA_INTERVENTO as RISORSA_INTERVENTO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO ");
    PAN_CORRISCAPARM.SetQuery(PPQRY_CORRISCAPARM, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CORRISPONDENZE_CAP_ARM A ");
    PAN_CORRISCAPARM.SetQuery(PPQRY_CORRISCAPARM, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_FILTRO1.ROWNAMENTSPE~~) ");
    PAN_CORRISCAPARM.SetQuery(PPQRY_CORRISCAPARM, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CORRISCAPARM.SetQuery(PPQRY_CORRISCAPARM, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CORRISCAPARM.SetQuery(PPQRY_CORRISCAPARM, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CORRISCAPARM.SetQuery(PPQRY_CORRISCAPARM, 5, SQL, -1, "");
    PAN_CORRISCAPARM.SetQueryDB(PPQRY_CORRISCAPARM, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CORRISCAPARM.SetMasterTable(0, "CORRISPONDENZE_CAP_ARM");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CORRISCAPARM.Status() == 2)
    {
      int oldListQBE = PAN_CORRISCAPARM.iUseListQBE;
      PAN_CORRISCAPARM.iUseListQBE = 0;
      PAN_CORRISCAPARM.PanelCommand(Glb.PCM_SEARCH);
      PAN_CORRISCAPARM.PanelCommand(Glb.PCM_FIND);
      PAN_CORRISCAPARM.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FILTRO_Init()
  {

    PAN_FILTRO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATASPESA, "EF92C339-076B-4065-8444-22D3D4AFEE7F");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATASPESA, "Entrata Spesa");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATASPESA, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATASPESA, MyGlb.VIS_OPTIONBUTTON);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATASPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATASPESA, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATASPESA, MyGlb.PANEL_LIST, 96);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATASPESA, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATASPESA, MyGlb.PANEL_LIST, "Entrata Spesa");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATASPESA, MyGlb.PANEL_FORM, 16, 16, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATASPESA, MyGlb.PANEL_FORM, 132);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATASPESA, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATASPESA, MyGlb.PANEL_FORM, "Entrata Spesa");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_ENTRATASPESA, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_ENTRATASPESA, PPQRY_FILTRO1, "A.ROWNAMENTSPE", "ROWNAMENTSPE", 5, 1, 0, -13997);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_ENTRATASPESA, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_ENTRATASPESA, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
  }

  private void PAN_FILTRO_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FILTRO.SetIMDB(IMDB, "PQRY_FILTRO1", true);
    PAN_FILTRO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_FILTRO.SetQueryIMDB(PPQRY_FILTRO1, IMDBDef10.PQRY_FILTRO1_RS, IMDBDef3.TBL_FILTRO15);
    JustLoaded = true;
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_ENTRATASPESA, IMDBDef3.FLD_FILTRO15_ROWNAMENTSPE);
    PAN_FILTRO.SetMasterTable(0, "FILTRO15");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTRO.Status() == 2)
    {
      int oldListQBE = PAN_FILTRO.iUseListQBE;
      PAN_FILTRO.iUseListQBE = 0;
      PAN_FILTRO.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRO.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CORRISCAPARM) PAN_CORRISCAPARM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CORRISCAPARM) PAN_CORRISCAPARM_ValidateRow(Cancel);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CORRISCAPARM) PAN_CORRISCAPARM_DynamicProperties();
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CORRISCAPARM) PAN_CORRISCAPARM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CORRISCAPARM) PAN_CORRISCAPARM_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_CORRISCAPARM) PAN_CORRISCAPARM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
