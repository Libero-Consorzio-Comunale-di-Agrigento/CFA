// **********************************************
// Info Variazione Crono
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoVariazioneCrono extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_ATTO = 0;

  private static int PFL_PARAMETRI_UNITAPROPONE = 0;
  private static int PFL_PARAMETRI_NUMEROPROPOS = 1;
  private static int PFL_PARAMETRI_ANNOPROPOSTA = 2;
  private static int PFL_PARAMETRI_SEDEDEL = 3;
  private static int PFL_PARAMETRI_NUMERODEL = 4;
  private static int PFL_PARAMETRI_ANNODEL = 5;
  private static int PFL_PARAMETRI_DDATAREG = 6;
  private static int PFL_PARAMETRI_TIPOVAR = 7;
  private static int PFL_PARAMETRI_DESCRIZIONE = 8;

  private static int PPQRY_PARAMETRI330 = 0;

  private static int PPQRY_T54 = 1;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI201(IMDB);
    //
    //
    Init_PQRY_PARAMETRI330(IMDB);
    Init_PQRY_PARAMETRI330_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI201(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI201, 11);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI201, "TBL_PARAMETRI201");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_PARAMPROGRES, "PARAMPROGRES");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_PARAMPROGRES,3,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_PARAESIGCRON, "PARAESIGCRON");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_PARAESIGCRON,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI201,IMDBDef7.FLD_PARAMETRI201_DESCRIZIONE,5,140,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI201, 0);
  }

  private static void Init_PQRY_PARAMETRI330(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI330, 9);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI330, "PQRY_PARAMETRI330");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330,IMDBDef17.PQSL_PARAMETRI330_DESCRIZIONE,5,140,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI330, 0);
  }

  private static void Init_PQRY_PARAMETRI330_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI330_RS, 9);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI330_RS, "PQRY_PARAMETRI330_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI330_RS,IMDBDef17.PQSL_PARAMETRI330_DESCRIZIONE,5,140,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoVariazioneCrono(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoVariazioneCrono()
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
    FormIdx = MyGlb.FRM_INFOVARICRON;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1EF63973-29C7-4924-84C2-F65DE1831E41";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 500;
    DesignHeight = 202;
    set_Caption(new IDVariant("Info Variazione Crono"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 500;
    Frames[1].Height = 176;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 176;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 500-MyGlb.PAN_OFFS_X, 176-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A609033F-D01F-4DF9-A2D5-B7AADC033A40");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 956, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARAMETRI201, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INFOVARICRON_PARAMETRI330();
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
    return (obj instanceof InfoVariazioneCrono);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoVariazioneCrono.class.getName() : (Glb.ClassWithPackage(InfoVariazioneCrono.class) ? InfoVariazioneCrono.class.getName().substring(InfoVariazioneCrono.class.getPackage().getName().length() + 1) : InfoVariazioneCrono.class.getName()));
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
      PAN_PARAMETRI.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAMETRI_TIPOVAR,(new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_TIPOVAR))).stringValue()); 
      PAN_PARAMETRI.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAMETRI_DESCRIZIONE,(new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioneCrono", "ParametriOnDynamicProperties", _e);
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
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAESIGCRON, 0).equals((new IDVariant("E")), true))
      {
        IDVariant v_TROVATO = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.UNITA_PROPONENTE as VARCUNITPROP, ");
        SQL.append("  A.NUMERO_PROPOSTA as VARCNUMEPROP, ");
        SQL.append("  A.ANNO_PROPOSTA as VARCANNOPROP, ");
        SQL.append("  A.SEDE_DEL as VARCOSEDEDEL, ");
        SQL.append("  A.NUMERO_DEL as VARCONUMEDEL, ");
        SQL.append("  A.ANNO_DEL as VARCOANNODEL, ");
        SQL.append("  A.D_DATA_REG as VARCDDATAREG, ");
        SQL.append("  A.TIPO_VAR as VARCOTIPOVAR, ");
        SQL.append("  A.DESCRIZIONE as VARCOMDESCRI ");
        SQL.append("from ");
        SQL.append("  VARCOM A ");
        SQL.append("where (A.PROGRESSIVO_VARIMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAMPROGRES, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        v_TROVATO = (QV.RecordCount()!=0 ? IDVariant.TRUE : IDVariant.FALSE);
        if (!QV.EOF())
        {
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_UNITA_PROPONENTE, 0, QV.Get("VARCUNITPROP", IDVariant.STRING));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_NUMERO_PROPOSTA, 0, QV.Get("VARCNUMEPROP", IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_ANNO_PROPOSTA, 0, QV.Get("VARCANNOPROP", IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_SEDE_DEL, 0, QV.Get("VARCOSEDEDEL", IDVariant.STRING));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_NUMERO_DEL, 0, QV.Get("VARCONUMEDEL", IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_ANNO_DEL, 0, QV.Get("VARCOANNODEL", IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_D_DATA_REG, 0, QV.Get("VARCDDATAREG", IDVariant.DATETIME));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_TIPO_VAR, 0, QV.Get("VARCOTIPOVAR", IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_DESCRIZIONE, 0, QV.Get("VARCOMDESCRI", IDVariant.STRING));
        }
        QV.Close();
        if (!(v_TROVATO.booleanValue()))
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.UNITA_PROPONENTE as VARCUNITPONE, ");
          SQL.append("  A.NUMERO_PROPOSTA as VARCNUMEPOST, ");
          SQL.append("  A.ANNO_PROPOSTA as VARCANNOPOST, ");
          SQL.append("  A.SEDE_DEL as VARCOSEDEDEL, ");
          SQL.append("  A.NUMERO_DEL as VARCONUMEDEL, ");
          SQL.append("  A.ANNO_DEL as VARCOANNODEL, ");
          SQL.append("  A.D_DATA_REG as VARCDDATAREG, ");
          SQL.append("  A.TIPO_VAR as VARCOTIPOVAR, ");
          SQL.append("  A.DESCRIZIONE as VARCOMDESCRI ");
          SQL.append("from ");
          SQL.append("  VARCOMPRO A ");
          SQL.append("where (A.PROGRESSIVO_VARIMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAMPROGRES, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_UNITA_PROPONENTE, 0, QV.Get("VARCUNITPONE", IDVariant.STRING));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_NUMERO_PROPOSTA, 0, QV.Get("VARCNUMEPOST", IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_ANNO_PROPOSTA, 0, QV.Get("VARCANNOPOST", IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_SEDE_DEL, 0, QV.Get("VARCOSEDEDEL", IDVariant.STRING));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_NUMERO_DEL, 0, QV.Get("VARCONUMEDEL", IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_ANNO_DEL, 0, QV.Get("VARCOANNODEL", IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_D_DATA_REG, 0, QV.Get("VARCDDATAREG", IDVariant.DATETIME));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_TIPO_VAR, 0, QV.Get("VARCOTIPOVAR", IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_DESCRIZIONE, 0, QV.Get("VARCOMDESCRI", IDVariant.STRING));
          }
          QV.Close();
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        IDVariant v_TROVATOCRONO = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.UNITA_PROPONENTE as VARCUNITPROP, ");
        SQL.append("  A.NUMERO_PROPOSTA as VARCNUMEPROP, ");
        SQL.append("  A.ANNO_PROPOSTA as VARCANNOPROP, ");
        SQL.append("  A.SEDE_DEL as VARCOSEDEDEL, ");
        SQL.append("  A.NUMERO_DEL as VARCONUMEDEL, ");
        SQL.append("  A.ANNO_DEL as VARCOANNODEL, ");
        SQL.append("  A.D_DATA_REG as VARCDDATAREG, ");
        SQL.append("  A.TIPO_VAR as VARCOTIPOVAR, ");
        SQL.append("  A.DESCRIZIONE as VARCOMDESCRI ");
        SQL.append("from ");
        SQL.append("  VARCOM A ");
        SQL.append("where (A.PROGRESSIVO_VAR_CRONO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAMPROGRES, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        v_TROVATOCRONO = (QV.RecordCount()!=0 ? IDVariant.TRUE : IDVariant.FALSE);
        if (!QV.EOF())
        {
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_UNITA_PROPONENTE, 0, QV.Get("VARCUNITPROP", IDVariant.STRING));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_NUMERO_PROPOSTA, 0, QV.Get("VARCNUMEPROP", IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_ANNO_PROPOSTA, 0, QV.Get("VARCANNOPROP", IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_SEDE_DEL, 0, QV.Get("VARCOSEDEDEL", IDVariant.STRING));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_NUMERO_DEL, 0, QV.Get("VARCONUMEDEL", IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_ANNO_DEL, 0, QV.Get("VARCOANNODEL", IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_D_DATA_REG, 0, QV.Get("VARCDDATAREG", IDVariant.DATETIME));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_TIPO_VAR, 0, QV.Get("VARCOTIPOVAR", IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_DESCRIZIONE, 0, QV.Get("VARCOMDESCRI", IDVariant.STRING));
        }
        QV.Close();
        if (!(v_TROVATOCRONO.booleanValue()))
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.UNITA_PROPONENTE as VARCUNITPROP, ");
          SQL.append("  A.NUMERO_PROPOSTA as VARCNUMEPROP, ");
          SQL.append("  A.ANNO_PROPOSTA as VARCANNOPROP, ");
          SQL.append("  A.SEDE_DEL as VARCOSEDEDEL, ");
          SQL.append("  A.NUMERO_DEL as VARCONUMEDEL, ");
          SQL.append("  A.ANNO_DEL as VARCOANNODEL, ");
          SQL.append("  A.D_DATA_REG as VARCDDATAREG, ");
          SQL.append("  A.TIPO_VAR as VARCOTIPOVAR, ");
          SQL.append("  A.DESCRIZIONE as VARCOMDESCRI ");
          SQL.append("from ");
          SQL.append("  VARCOMPRO A ");
          SQL.append("where (A.PROGRESSIVO_VAR_CRONO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAMPROGRES, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_UNITA_PROPONENTE, 0, QV.Get("VARCUNITPROP", IDVariant.STRING));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_NUMERO_PROPOSTA, 0, QV.Get("VARCNUMEPROP", IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_ANNO_PROPOSTA, 0, QV.Get("VARCANNOPROP", IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_SEDE_DEL, 0, QV.Get("VARCOSEDEDEL", IDVariant.STRING));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_NUMERO_DEL, 0, QV.Get("VARCONUMEDEL", IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_ANNO_DEL, 0, QV.Get("VARCOANNODEL", IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_D_DATA_REG, 0, QV.Get("VARCDDATAREG", IDVariant.DATETIME));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_TIPO_VAR, 0, QV.Get("VARCOTIPOVAR", IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_DESCRIZIONE, 0, QV.Get("VARCOMDESCRI", IDVariant.STRING));
          }
          QV.Close();
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoVariazioneCrono", "Load", _e);
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
      MainFrm.ErrObj.ProcError ("InfoVariazioneCrono", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAMPROGRES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_PARAESIGCRON, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_UNITA_PROPONENTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_NUMERO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_ANNO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_SEDE_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_NUMERO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_ANNO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_D_DATA_REG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_TIPO_VAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_DESCRIZIONE, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void INFOVARICRON_PARAMETRI330() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI330_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI201, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI201, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI330_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI330_RS, 0, IMDBDef7.TBL_PARAMETRI201, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI330_RS, 0, 0, IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_UNITA_PROPONENTE, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI330_RS, 1, 0, IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_NUMERO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI330_RS, 2, 0, IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_ANNO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI330_RS, 3, 0, IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI330_RS, 4, 0, IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI330_RS, 5, 0, IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_ANNO_DEL, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI330_RS, 6, 0, IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_D_DATA_REG, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI330_RS, 7, 0, IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_TIPO_VAR, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI330_RS, 8, 0, IMDBDef7.TBL_PARAMETRI201, IMDBDef7.FLD_PARAMETRI201_DESCRIZIONE, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI201, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAMETRI201, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI201, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI330_RS, 0);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI330, IMDBDef17.PQSL_PARAMETRI330_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI330, IMDBDef17.PQSL_PARAMETRI330_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ATTO, "64E54454-A003-40E6-BA46-2C6C49E16A36");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ATTO, "Atto");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ATTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ATTO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ATTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ATTO, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ATTO, 0, 25);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ATTO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ATTO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ATTO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ATTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "948B1825-A6D4-490A-9ACF-C94EDF10CFC1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "F6A3C6CC-A5EB-4571-972B-23AA95F65957");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "-");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "2C868359-A088-495E-AF0A-983D74D2FD1B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "DE5969C8-24D5-4624-B7BD-F49ABD82C1C0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "Atto");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "70F17DAE-643B-4112-8C87-F65BFA6B1B04");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "-");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "2DC08943-17AB-45E1-AF8B-6F40638821FF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DDATAREG, "1553C22F-1998-412F-A3A6-63EFE3227C67");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DDATAREG, "Data Variazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DDATAREG, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVAR, "2B8945CC-D8A5-47A6-8678-5D4FD48BADD8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVAR, "Tipo Variazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVAR, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "A1F3DEAA-0874-418E-B897-1D36D581C965");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "Descrizione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, "Proposta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 72, 16, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UNITAPROPONE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UNITAPROPONE, PPQRY_PARAMETRI330, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, "-");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 280, 16, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, "-");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROPROPOS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROPROPOS, PPQRY_PARAMETRI330, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 356, 16, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOPROPOSTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOPROPOSTA, PPQRY_PARAMETRI330, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, "Atto");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 88, 40, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, "Atto");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SEDEDEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SEDEDEL, PPQRY_PARAMETRI330, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, "-");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 280, 40, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, "-");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODEL, PPQRY_PARAMETRI330, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 356, 40, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODEL, PPQRY_PARAMETRI330, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DDATAREG, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DDATAREG, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DDATAREG, MyGlb.PANEL_LIST, "Data Variazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DDATAREG, MyGlb.PANEL_FORM, 16, 64, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DDATAREG, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DDATAREG, MyGlb.PANEL_FORM, "Data Variazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DDATAREG, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DDATAREG, PPQRY_PARAMETRI330, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVAR, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVAR, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVAR, MyGlb.PANEL_LIST, "Tp. Variaz.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVAR, MyGlb.PANEL_FORM, 28, 88, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVAR, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVAR, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOVAR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOVAR, PPQRY_PARAMETRI330, "A.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 56, 112, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRIZIONE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRIZIONE, PPQRY_PARAMETRI330, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_T54, 0, SQL, PFL_PARAMETRI_TIPOVAR, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    PAN_PARAMETRI.SetQuery(PPQRY_T54, 1, SQL, PFL_PARAMETRI_TIPOVAR, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI330", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI330, IMDBDef17.PQRY_PARAMETRI330_RS, IMDBDef7.TBL_PARAMETRI201);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UNITAPROPONE, IMDBDef7.FLD_PARAMETRI201_UNITA_PROPONENTE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROPROPOS, IMDBDef7.FLD_PARAMETRI201_NUMERO_PROPOSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOPROPOSTA, IMDBDef7.FLD_PARAMETRI201_ANNO_PROPOSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SEDEDEL, IMDBDef7.FLD_PARAMETRI201_SEDE_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODEL, IMDBDef7.FLD_PARAMETRI201_NUMERO_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODEL, IMDBDef7.FLD_PARAMETRI201_ANNO_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DDATAREG, IMDBDef7.FLD_PARAMETRI201_D_DATA_REG);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOVAR, IMDBDef7.FLD_PARAMETRI201_TIPO_VAR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DESCRIZIONE, IMDBDef7.FLD_PARAMETRI201_DESCRIZIONE);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI201");
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
