// **********************************************
// Stampe Bilancio Prev
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StampeBilancioPrev extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_PROGRSTAMPA = 0;
  private static int PFL_PARAM_ETICHEELABOR = 1;
  private static int PFL_PARAM_SIGLA = 2;
  private static int PFL_PARAM_NOMEREPORT = 3;
  private static int PFL_PARAM_DESCRIZIONE = 4;
  private static int PFL_PARAM_PROCEDSTAMPA = 5;
  private static int PFL_PARAM_STORICO = 6;
  private static int PFL_PARAM_NUMERDIPAGIN = 7;
  private static int PFL_PARAM_ESERCDISTAMP = 8;
  private static int PFL_PARAM_FONTE = 9;
  private static int PFL_PARAM_STAMPASALVAT = 10;
  private static int PFL_PARAM_APRIPDF = 11;
  private static int PFL_PARAM_SALVATSTAMPA = 12;
  private static int PFL_PARAM_NOTESTAMPA = 13;
  private static int PFL_PARAM_FILEDATI = 14;
  private static int PFL_PARAM_TIPOFILE = 15;
  private static int PFL_PARAM_ESERCIZIO = 16;

  private static int PPQRY_PARAM167 = 0;

  private static int PPQRY_TIPISTAMBILP = 1;
  private static int PPQRY_STAMPESALVAT = 2;

  private static int PPQRY_TIPISTAMBIL1 = 3;
  private static int PPQRY_ESEFIN = 4;
  private static int PPQRY_STAMPESALVA1 = 5;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM151(IMDB);
    //
    //
    Init_PQRY_PARAM167(IMDB);
    Init_PQRY_PARAM167_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM151(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAM151, 10);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAM151, "TBL_PARAM151");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARAMFONTE, "PARAMFONTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARAMFONTE,5,50,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARASTAMSALV, "PARASTAMSALV");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARASTAMSALV,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARASALVSTAM, "PARASALVSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARASALVSTAM,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARANOMEFILE,9,500,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARAESEDISTA, "PARAESEDISTA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM151,IMDBDef3.FLD_PARAM151_PARAESEDISTA,1,4,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAM151, 0);
  }

  private static void Init_PQRY_PARAM167(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAM167, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAM167, "PQRY_PARAM167");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARAMFONTE, "PARAMFONTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARAMFONTE,5,50,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARASTAMSALV, "PARASTAMSALV");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARASTAMSALV,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARASALVSTAM, "PARASALVSTAM");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARASALVSTAM,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARAESEDISTA, "PARAESEDISTA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167,IMDBDef11.PQSL_PARAM167_PARAESEDISTA,1,4,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAM167, 0);
  }

  private static void Init_PQRY_PARAM167_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAM167_RS, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAM167_RS, "PQRY_PARAM167_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARAMFONTE, "PARAMFONTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARAMFONTE,5,50,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARASTAMSALV, "PARASTAMSALV");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARASTAMSALV,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARASALVSTAM, "PARASALVSTAM");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARASALVSTAM,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARAESEDISTA, "PARAESEDISTA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM167_RS,IMDBDef11.PQSL_PARAM167_PARAESEDISTA,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StampeBilancioPrev(MyWebEntryPoint w, IMDBObj imdb)
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
  public StampeBilancioPrev()
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
    FormIdx = MyGlb.FRM_STAMBILAPREV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F7564318-7FCD-4441-AF66-1B3D7282637C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 488;
    DesignHeight = 262;
    set_Caption(new IDVariant("Stampe Bilancio Preventivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 488;
    Frames[1].Height = 236;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 236;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 488-MyGlb.PAN_OFFS_X, 236-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E3E8E5BB-EE57-407D-A9C4-A057DF1B06D4");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1688, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 1;
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAM151, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STAMBILAPREV_PARAM167();
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
    return (obj instanceof StampeBilancioPrev);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StampeBilancioPrev.class.getName() : (Glb.ClassWithPackage(StampeBilancioPrev.class) ? StampeBilancioPrev.class.getName().substring(StampeBilancioPrev.class.getPackage().getName().length() + 1) : StampeBilancioPrev.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.NullValue((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_STORICO))),(new IDVariant(""))).equals((new IDVariant("SI")), true))
      {
        // 
        // Visualizzo il parametro solo per le stanpe FPV e FCDDE
        // 
        if (IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0).equals((new IDVariant(34)), true) || IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0).equals((new IDVariant(37)), true))
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAMFONTE, 0).equals((new IDVariant("Base Dati")), true))
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_APRIPDF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          if (IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARASALVSTAM, 0).equals((new IDVariant("SI")), true))
          {
            PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        else
        {
          // PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          if (IDL.Length((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_FILEDATI)))).compareTo((new IDVariant(0)), true)>0)
          {
            PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_APRIPDF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_TIPOFILE))).equals((new IDVariant("xls")), true))
            {
              PAN_PARAM.SetImage(Glb.OBJ_FIELD, PFL_PARAM_APRIPDF, 0, (new IDVariant("xls.png")).stringValue()); 
            }
            else
            {
              PAN_PARAM.SetImage(Glb.OBJ_FIELD, PFL_PARAM_APRIPDF, 0, (new IDVariant("pdf.png")).stringValue()); 
            }
          }
          else
          {
            PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_APRIPDF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_FONTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_APRIPDF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampeBilancioPrev", "ParamOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Param On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAM_PROGRSTAMPA)), true) && RowWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAMFONTE, 0, (new IDVariant("Base Dati")));
        IMDB.set_Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARASALVSTAM, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARASTAMSALV, 0, (new IDVariant()));
        if (IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0).equals((new IDVariant(34)), true) || IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0).equals((new IDVariant(37)), true))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAESEDISTA, 0)))
          {
            IMDB.set_Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAESEDISTA, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAESEDISTA, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAM_FONTE)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAMFONTE, 0).equals((new IDVariant("Base Dati")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARASTAMSALV, 0, (new IDVariant()));
        }
        else if (IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAMFONTE, 0).equals((new IDVariant("Stampa Salvata")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARASALVSTAM, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0, (new IDVariant()));
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAM_SALVATSTAMPA)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARASALVSTAM, 0).equals((new IDVariant("SI")), true) && IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IDL.Today()), (new IDVariant(" "))), IDL.ToString(IDL.Time())), (new IDVariant(" - "))), (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_DESCRIZIONE)))));
        }
        else if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARASALVSTAM, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampeBilancioPrev", "ParamOnUpdatingRow", _e);
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
      IDVariant v_SESSIOSALVAT = null;
      v_SESSIOSALVAT = (new IDVariant());
      IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0, (new IDVariant()));
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAMFONTE, 0),(new IDVariant("Base Dati"))).equals((new IDVariant("Base Dati")), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0))))
        {
          // 
          // Imposto il Nome file se previsto il Salvataggio del
          // PDF
          // 
          if (IDL.NullValue(MainFrm.SALVFILESTAM,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
          {
            IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/temp/"))), IDL.Replace((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_DESCRIZIONE))), (new IDVariant("/")), (new IDVariant("")))), (new IDVariant("_"))), IDL.ToString(MainFrm.PROGRESESSIO)), (new IDVariant(".pdf"))));
          }
          // 
          // calcolo ID Stampa da passare alle procedure
          // 
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  STAMPE_SALVATE_SQ.nextval as CF4DBSTASASQ ");
          SQL.append("from ");
          SQL.append("  DUAL A ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0, QV.Get("CF4DBSTASASQ", IDVariant.DECIMAL));
          }
          QV.Close();
        }
        else
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARASALVSTAM, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Indicare le Note Stampa per il Salvataggio"));
            MainFrm.set_AlertMessage(v_AVVISO); 
            return 0;
          }
        }
        if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_PROCEDSTAMPA))).equals((new IDVariant("WORK_BIL_PREV_PLUR_E")), true) || (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_PROCEDSTAMPA))).equals((new IDVariant("WORK_BIL_PREV_PLUR_E_TIT")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARAPROGSTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARANOMESTAM, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARSTANUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARANOTESTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARAMIDSTAMP, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI673, IMDBDef3.FLD_PARAMETRI673_PARANOMEFILE, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0));
          MainFrm.Show(MyGlb.FRM_BILAENTRPREV, (new IDVariant(0)).intValue(), this); 
          return 0;
        }
        if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_PROCEDSTAMPA))).equals((new IDVariant("WORK_BIL_PREV_QGEN_RIASS")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARAPROGSTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARANOMESTAM, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARSTANUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARANOTESTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARAMIDSTAMP, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI666, IMDBDef3.FLD_PARAMETRI666_PARANOMEFILE, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0));
          MainFrm.Show(MyGlb.FRM_QUAGENRIAPR1, (new IDVariant(0)).intValue(), this); 
          return 0;
        }
        else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_PROCEDSTAMPA))).equals((new IDVariant("WORK_BIL_PREV_EQUIL")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARAPROGSTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARANOMESTAM, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARSTANUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARANOTESTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARAMIDSTAMP, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI668, IMDBDef3.FLD_PARAMETRI668_PARANOMEFILE, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0));
          MainFrm.Show(MyGlb.FRM_EQUIDIBILPRE, (new IDVariant(0)).intValue(), this); 
          return 0;
        }
        else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_PROCEDSTAMPA))).equals((new IDVariant("WORK_BIL_PREV_LIM_INDEB")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARAPROGSTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARANOMESTAM, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARSTANUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARANOTESTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARAMIDSTAMP, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI667, IMDBDef3.FLD_PARAMETRI667_PARANOMEFILE, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0));
          MainFrm.Show(MyGlb.FRM_LIMITIINDEBI, (new IDVariant(0)).intValue(), this); 
          return 0;
        }
        else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_PROCEDSTAMPA))).equals((new IDVariant("WORK_BIL_PREV_FCDDE")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARAESERPLUR, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAESEDISTA, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARAPROGSTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARANOMESTAM, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))));
          IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARSTANUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARANOTESTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARAMIDSTAMP, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARASTAMFCD1, IMDBDef3.FLD_PARASTAMFCD1_PARANOMEFILE, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0));
          MainFrm.Show(MyGlb.FRM_FCDDEPREV, (new IDVariant(0)).intValue(), this); 
          return 0;
        }
        else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_PROCEDSTAMPA))).equals((new IDVariant("WORK_BIL_PREV_RIS_PRES")), true))
        {
          if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).equals((new IDVariant(2013)), true))
          {
            MainFrm.Show(MyGlb.FRM_RISUAMMNEPRE, (new IDVariant(0)).intValue(), this); 
            return 0;
          }
          else
          {
            IMDB.set_Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARAPROGSTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0));
            IMDB.set_Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARANOMESTAM, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))));
            IMDB.set_Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARSTANUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, 0));
            IMDB.set_Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARANOTESTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0));
            IMDB.set_Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARAMIDSTAMP, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0));
            IMDB.set_Value(IMDBDef3.TBL_PARAMETRI659, IMDBDef3.FLD_PARAMETRI659_PARANOMEFILE, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0));
            MainFrm.Show(MyGlb.FRM_RISAMMPRE201, (new IDVariant(0)).intValue(), this); 
            return 0;
          }
        }
        else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_PROCEDSTAMPA))).equals((new IDVariant("WORK_BIL_PREV_VER_VINC_FP_2017")), true))
        {
          if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).compareTo((new IDVariant(2016)), true)<=0)
          {
            MainFrm.UnloadForm(MyGlb.FRM_VERIFIVINCOL,(new IDVariant(0)).booleanValue()); 
            IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_RONASTNUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, 0));
            IMDB.set_Value(IMDBDef3.TBL_PARAMETRI568, IMDBDef3.FLD_PARAMETRI568_ROWNAMTIPSTA, 0, (new IDVariant("PREV")));
            MainFrm.Show(MyGlb.FRM_VERIFIVINCOL, (new IDVariant(0)).intValue(), this); 
          }
          else
          {
            IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
            v_CAPTION = (new IDVariant("Verifica Vincoli di Finanza Pubblica"));
            MainFrm.UnloadForm(MyGlb.FRM_STAMPCONPARA,(new IDVariant(0)).booleanValue()); 
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOOGSTNUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, 0));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNOMSTA, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGFORCAP, 0, new IDVariant(v_CAPTION));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0, (new IDVariant("LVV17")));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNOTSTA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMEOGGIDSTA, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0));
            IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_NOMOGGNOMFIL, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0));
            MainFrm.Show(MyGlb.FRM_STAMPCONPARA, (new IDVariant(0)).intValue(), this); 
          }
          return 0;
        }
        else if ((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_PROCEDSTAMPA))).equals((new IDVariant("WORK_BIL_PREV_PAR_DEF")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_PARAMTRI1, IMDBDef3.FLD_PARAMTRI1_PARAPROGSTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMTRI1, IMDBDef3.FLD_PARAMTRI1_PARANOMESTAM, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))));
          IMDB.set_Value(IMDBDef3.TBL_PARAMTRI1, IMDBDef3.FLD_PARAMTRI1_PARSTANUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMTRI1, IMDBDef3.FLD_PARAMTRI1_PARANOTESTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMTRI1, IMDBDef3.FLD_PARAMTRI1_PARAMIDSTAMP, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMTRI1, IMDBDef3.FLD_PARAMTRI1_PARANOMEFILE, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0));
          MainFrm.Show(MyGlb.FRM_PARAOBIEPREV, (new IDVariant(0)).intValue(), this); 
          return 0;
        }
        else if (IDL.NullValue((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_PROCEDSTAMPA))),(new IDVariant(""))).equals((new IDVariant("")), true))
        {
          if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).equals((new IDVariant(2013)), true))
          {
            MainFrm.Show(MyGlb.FRM_ELENCORESIDU, (new IDVariant(0)).intValue(), this); 
            return 0;
          }
          else
          {
            IMDB.set_Value(IMDBDef3.TBL_IMDB11, IMDBDef3.FLD_IMDB11_NOOGSTNUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, 0));
            MainFrm.Show(MyGlb.FRM_ELENRESIESER, (new IDVariant(0)).intValue(), this); 
            return 0;
          }
        }
        else if (IDL.NullValue((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_PROCEDSTAMPA))),(new IDVariant(""))).equals((new IDVariant("WORK_BIL_PREV_RIS_PRES_A1")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI267, IMDBDef3.FLD_PARAMETRI267_PARAPROGSTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI267, IMDBDef3.FLD_PARAMETRI267_PARANOMESTAM, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI267, IMDBDef3.FLD_PARAMETRI267_PARSTANUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI267, IMDBDef3.FLD_PARAMETRI267_PARANOTESTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI267, IMDBDef3.FLD_PARAMETRI267_PARAMIDSTAMP, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI267, IMDBDef3.FLD_PARAMETRI267_PARANOMEFILE, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0));
          MainFrm.Show(MyGlb.FRM_ALLEBILA1PRE, (new IDVariant(0)).intValue(), this); 
          return 0;
        }
        else if (IDL.NullValue((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_PROCEDSTAMPA))),(new IDVariant(""))).equals((new IDVariant("WORK_BIL_PREV_RIS_PRES_A2")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARAPROGSTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARANOMESTAM, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARSTANUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARANOTESTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARAMIDSTAMP, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI675, IMDBDef3.FLD_PARAMETRI675_PARANOMEFILE, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0));
          MainFrm.Show(MyGlb.FRM_ALLEBILA2PRE, (new IDVariant(0)).intValue(), this); 
          return 0;
        }
        else if (IDL.NullValue((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_PROCEDSTAMPA))),(new IDVariant(""))).equals((new IDVariant("WORK_BIL_PREV_RIS_PRES_A3")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARAPROGSTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARANOMESTAM, 0, (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARSTANUDIPA, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARANOTESTAM, 0, IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARAMIDSTAMP, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI676, IMDBDef3.FLD_PARAMETRI676_PARANOMEFILE, 0, IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0));
          MainFrm.Show(MyGlb.FRM_ALLEBILA3PRE, (new IDVariant(0)).intValue(), this); 
          return 0;
        }
        else
        {
          MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPEPREV(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0), IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAESEDISTA, 0));
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARASTAMSALV, 0)))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Selezionare la stampa Salvata da Stampare"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
        else
        {
          v_SESSIOSALVAT = new IDVariant(IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARASTAMSALV, 0),IDVariant.INTEGER);
        }
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(IDL.NullValue(v_SESSIOSALVAT,MainFrm.PROGRESESSIO)));
        MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARAESEDISTA, 0),IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))));
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0), (new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_NOMEREPORT))), IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0), (new IDVariant("pdf")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampeBilancioPrev", "EtichettaElabora", _e);
      return -1;
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
      UNLOAD_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampeBilancioPrev", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAPROGSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARSTANUDIPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMFONTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARASTAMSALV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARASALVSTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOTESTAM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMIDSTAMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOMEFILE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAESEDISTA, 0, new IDVariant());
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
      IDVariant v_TOOLTIPPDF = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIPPDF = (new IDVariant("Apertura file di Stampa salvato"));
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).compareTo((new IDVariant(2013)), true)>0)
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMESERCIZ, 0, (new IDVariant(2014)));
      }
      else
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
      IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARSTANUDIPA, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMFONTE, 0, (new IDVariant("Base Dati")));
      PAN_PARAM.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAM_APRIPDF,v_TOOLTIPPDF.stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampeBilancioPrev", "Load", _e);
    }
  }

  // **********************************************************************
  // Apri Pdf
  // **********************************************************************
  public int ApriPdf ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Apri Pdf Body
      // Corpo Procedura
      // 
      IDVariant v_PERCORSOFILE = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.FILE_DATI as STASALFILDAT, ");
      SQL.append("  A.TIPO_FILE as STASALTIPFIL ");
      SQL.append("from ");
      SQL.append("  STAMPE_SALVATE A ");
      SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARASTAMSALV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        v_PERCORSOFILE = Glb.SaveBlob(MainFrm,C2.Get("STASALFILDAT"),IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/temp"))),IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Replace((new IDVariant(PAN_PARAM.FieldText(PFL_PARAM_DESCRIZIONE))), (new IDVariant("/")), (new IDVariant(""))), (new IDVariant("_"))), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAM167, IMDBDef11.PQSL_PARAM167_PARASTAMSALV, 0))), (new IDVariant("."))), C2.Get("STASALTIPFIL")));
        C2.MoveNext();
      }
      C2.Close();
      MainFrm.set_RedirectTo(v_PERCORSOFILE);
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampeBilancioPrev", "ApriPdf", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void STAMBILAPREV_PARAM167() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAM167_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM151, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAM151, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAM167_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAM167_RS, 0, IMDBDef3.TBL_PARAM151, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM167_RS, 0, 0, IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAPROGSTAM, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM167_RS, 1, 0, IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARSTANUDIPA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM167_RS, 2, 0, IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMFONTE, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM167_RS, 3, 0, IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARASTAMSALV, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM167_RS, 4, 0, IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARASALVSTAM, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM167_RS, 5, 0, IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARANOTESTAM, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM167_RS, 6, 0, IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAMESERCIZ, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM167_RS, 7, 0, IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAESEDISTA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAM151, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAM151, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM151, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAM167_RS, 0);
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

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_APRIPDF)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPdf();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, "01C6A3BD-6E36-43C1-B5C3-E47DBD042DDD");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, "Stampa");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, "3C9DAE14-995E-4D25-AE68-E8F61B6218ED");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, "497CB545-D3CA-413C-8DAE-63ADE4A4C619");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, "SIGLA");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, "867C2B26-31CB-46D1-8EC5-29F3B289F75D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, "NOME REPORT");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, "0840F375-736C-4118-B457-0273D679D1C7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, "DESCRIZIONE");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PROCEDSTAMPA, "05E40114-1E71-4428-A535-94896521AD8D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PROCEDSTAMPA, "PROCEDURA STAMPA");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PROCEDSTAMPA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PROCEDSTAMPA, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PROCEDSTAMPA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_STORICO, "9DFD6978-1657-45B1-94BF-0B5B46F80FB0");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_STORICO, "STORICO");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_STORICO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_STORICO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_STORICO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, "B880B5A9-9D84-4BAA-82F5-E46D2B446DC6");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, "Numero di pagina");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, "A5860655-0EEB-4BE4-8EE6-EA8D9B7534FE");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, "Esercizio Di Stampa");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_FONTE, "06E8B35A-79C8-4738-AAC5-BC462104D6ED");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_FONTE, "Fonte");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_FONTE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_FONTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_FONTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, "43A75512-8805-4CF3-A0B8-C9F40956F8C4");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, "Stampa Salvata");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_APRIPDF, "2D7AA70C-AFEB-48CD-AC5F-BBB51D815243");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_APRIPDF, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_APRIPDF, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_APRIPDF, 0, "pdf.png", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_APRIPDF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, "1AEB16E9-1DC9-4DF0-BEA0-4C10FC62D3E2");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, "Salvataggio Stampa");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, "E5714844-5033-4BB7-9E87-5FB4DC831451");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, "Note Stampa");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_FILEDATI, "B9BB25B3-765B-4964-80DF-C0FAA78B772D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_FILEDATI, "FILE DATI");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_FILEDATI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_FILEDATI, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_FILEDATI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOFILE, "768E8520-5FC7-4834-8C4D-2D8B73B0ED3D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOFILE, "TIPO FILE");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOFILE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOFILE, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOFILE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, "1AF589FD-8317-4F30-9A41-21E99F857E73");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, "Esercizio");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, 0, 36, 544, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_LIST, "Stampa");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, 52, 24, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRSTAMPA, MyGlb.PANEL_FORM, "Stampa");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PROGRSTAMPA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PROGRSTAMPA, PPQRY_PARAM167, "A.PARAPROGSTAM", "PARAPROGSTAM", 3, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 516, 696, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 368, 180, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHEELABOR, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, 168);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_LIST, "SIGLA");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, 4, 92, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, 168);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SIGLA, MyGlb.PANEL_FORM, "SIGLA");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SIGLA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SIGLA, PPQRY_TIPISTAMBILP, "A.SIGLA", "TIPSTABILSIG", 5, 20, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, 212);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_LIST, "NOME REPORT");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, 4, 116, 724, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, 212);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NOMEREPORT, MyGlb.PANEL_FORM, "NOME REPORT");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NOMEREPORT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NOMEREPORT, PPQRY_TIPISTAMBILP, "A.NOME_REPORT", "TIPSTABINORE", 5, 100, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, 208);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 164, 720, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, 208);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DESCRIZIONE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DESCRIZIONE, PPQRY_TIPISTAMBILP, "A.DESCRIZIONE", "TIPSTABILDES", 5, 100, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROCEDSTAMPA, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROCEDSTAMPA, MyGlb.PANEL_LIST, 252);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROCEDSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROCEDSTAMPA, MyGlb.PANEL_LIST, "PROCEDURA STAMPA");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROCEDSTAMPA, MyGlb.PANEL_FORM, 4, 164, 516, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROCEDSTAMPA, MyGlb.PANEL_FORM, 252);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROCEDSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROCEDSTAMPA, MyGlb.PANEL_FORM, "PROCEDURA STAMPA");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PROCEDSTAMPA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PROCEDSTAMPA, PPQRY_TIPISTAMBILP, "A.PROCEDURA_STAMPA", "TIPSTABIPRST", 5, 50, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_STORICO, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_STORICO, MyGlb.PANEL_LIST, 184);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_STORICO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_STORICO, MyGlb.PANEL_LIST, "STORICO");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_STORICO, MyGlb.PANEL_FORM, 4, 216, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_STORICO, MyGlb.PANEL_FORM, 184);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_STORICO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_STORICO, MyGlb.PANEL_FORM, "STORICO");
    PAN_PARAM.SetFieldPage(PFL_PARAM_STORICO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_STORICO, PPQRY_TIPISTAMBILP, "A.STORICO", "TIPSTABILSTO", 5, 2, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, 156);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_LIST, "Numero di pagina");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, 316, 48, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, 108);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMERDIPAGIN, MyGlb.PANEL_FORM, "Numero di pagina");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMERDIPAGIN, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMERDIPAGIN, PPQRY_PARAM167, "A.PARSTANUDIPA", "PARSTANUDIPA", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_NUMERDIPAGIN, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_NUMERDIPAGIN, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, MyGlb.PANEL_LIST, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, MyGlb.PANEL_LIST, "Esercizio Di Stampa");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, MyGlb.PANEL_FORM, 0, 48, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, MyGlb.PANEL_FORM, 116);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCDISTAMP, MyGlb.PANEL_FORM, "Esercizio Di Stampa");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ESERCDISTAMP, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ESERCDISTAMP, PPQRY_PARAM167, "A.PARAESEDISTA", "PARAESEDISTA", 1, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FONTE, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FONTE, MyGlb.PANEL_LIST, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FONTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FONTE, MyGlb.PANEL_LIST, "Fonte");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FONTE, MyGlb.PANEL_FORM, 240, 72, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FONTE, MyGlb.PANEL_FORM, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FONTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FONTE, MyGlb.PANEL_FORM, "Fonte");
    PAN_PARAM.SetFieldPage(PFL_PARAM_FONTE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_FONTE, PPQRY_PARAM167, "A.PARAMFONTE", "PARAMFONTE", 5, 50, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_FONTE, (new IDVariant("Base Dati")), "Base Dati", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_FONTE, (new IDVariant("Stampa Salvata")), "Stampa Salvata", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, MyGlb.PANEL_LIST, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, MyGlb.PANEL_LIST, "Stampa Salvata");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, MyGlb.PANEL_FORM, 16, 96, 432, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, MyGlb.PANEL_FORM, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_STAMPASALVAT, MyGlb.PANEL_FORM, "Stampa Salvata");
    PAN_PARAM.SetFieldPage(PFL_PARAM_STAMPASALVAT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_STAMPASALVAT, PPQRY_PARAM167, "A.PARASTAMSALV", "PARASTAMSALV", 3, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_APRIPDF, MyGlb.PANEL_LIST, 444, 96, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_APRIPDF, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_APRIPDF, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_APRIPDF, MyGlb.PANEL_FORM, 452, 96, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_APRIPDF, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_APRIPDF, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_APRIPDF, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_APRIPDF, -1, "", "APRIPDF", 0, 0, 0, -13997);
    PAN_PARAM.set_ImageResizeMode(PFL_PARAM_APRIPDF, 3);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, MyGlb.PANEL_LIST, 124);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, MyGlb.PANEL_LIST, "Salvataggio Stampa");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, MyGlb.PANEL_FORM, 300, 120, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, MyGlb.PANEL_FORM, 124);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SALVATSTAMPA, MyGlb.PANEL_FORM, "Salvataggio Stampa");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SALVATSTAMPA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SALVATSTAMPA, PPQRY_PARAM167, "A.PARASALVSTAM", "PARASALVSTAM", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SALVATSTAMPA, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SALVATSTAMPA, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, MyGlb.PANEL_LIST, "Note Stampa");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, MyGlb.PANEL_FORM, 32, 144, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, MyGlb.PANEL_FORM, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NOTESTAMPA, MyGlb.PANEL_FORM, "Note Stampa");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NOTESTAMPA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NOTESTAMPA, PPQRY_PARAM167, "A.PARANOTESTAM", "PARANOTESTAM", 5, 200, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FILEDATI, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FILEDATI, MyGlb.PANEL_LIST, 164);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FILEDATI, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FILEDATI, MyGlb.PANEL_LIST, "FILE DATI");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FILEDATI, MyGlb.PANEL_FORM, 4, 216, 600, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FILEDATI, MyGlb.PANEL_FORM, 164);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FILEDATI, MyGlb.PANEL_FORM, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FILEDATI, MyGlb.PANEL_FORM, "FILE DATI");
    PAN_PARAM.SetFieldPage(PFL_PARAM_FILEDATI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_FILEDATI, PPQRY_STAMPESALVAT, "A.FILE_DATI", "FILE_DATI", 10, 9999, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOFILE, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOFILE, MyGlb.PANEL_LIST, 164);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOFILE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOFILE, MyGlb.PANEL_LIST, "TIPO FILE");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOFILE, MyGlb.PANEL_FORM, 4, 264, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOFILE, MyGlb.PANEL_FORM, 164);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOFILE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOFILE, MyGlb.PANEL_FORM, "TIPO FILE");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOFILE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOFILE, PPQRY_STAMPESALVAT, "A.TIPO_FILE", "TIPO_FILE", 5, 20, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_FORM, 4, 216, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ESERCIZIO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ESERCIZIO, PPQRY_PARAM167, "A.PARAMESERCIZ", "PARAMESERCIZ", 1, 4, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 6);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SIGLA as TIPSTABILSIG, ");
    SQL.append("  A.NOME_REPORT as TIPSTABINORE, ");
    SQL.append("  A.DESCRIZIONE as TIPSTABILDES, ");
    SQL.append("  A.PROCEDURA_STAMPA as TIPSTABIPRST, ");
    SQL.append("  A.STORICO as TIPSTABILSTO ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE_BILPREV A ");
    SQL.append("where (A.PROGRESSIVO = ~~PARAPROGSTAM~~) ");
    PAN_PARAM.SetQuery(PPQRY_TIPISTAMBILP, 0, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_TIPISTAMBILP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(PPQRY_TIPISTAMBILP, "TIPI_STAMPE_BILPREV");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FILE_DATI as FILE_DATI, ");
    SQL.append("  A.TIPO_FILE as TIPO_FILE ");
    SQL.append("from ");
    SQL.append("  STAMPE_SALVATE A ");
    SQL.append("where (A.PROGR_SESSIONE = ~~PARASTAMSALV~~) ");
    PAN_PARAM.SetQuery(PPQRY_STAMPESALVAT, 0, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_STAMPESALVAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(PPQRY_STAMPESALVAT, "STAMPE_SALVATE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as TIPSTABILPRO, ");
    SQL.append("  A.ORDINE as TIPSTABILORD, ");
    SQL.append("  A.RAGGRUPPAMENTO || '' as GROUPID, ");
    SQL.append("  A.DESCRIZIONE as TIPSTABILDES ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE_BILPREV A ");
    SQL.append("where (A.PROGRESSIVO = ~~PARAPROGSTAM~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAM151.PARAMESERCIZ~~) ");
    SQL.append("order by 2, 3 ");
    PAN_PARAM.SetQuery(PPQRY_TIPISTAMBIL1, 0, SQL, PFL_PARAM_PROGRSTAMPA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as TIPSTABILPRO, ");
    SQL.append("  A.ORDINE as TIPSTABILORD, ");
    SQL.append("  A.RAGGRUPPAMENTO || '' as GROUPID, ");
    SQL.append("  A.DESCRIZIONE as TIPSTABILDES ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE_BILPREV A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAM151.PARAMESERCIZ~~) ");
    SQL.append("order by 2, 3 ");
    PAN_PARAM.SetQuery(PPQRY_TIPISTAMBIL1, 1, SQL, PFL_PARAM_PROGRSTAMPA, "");
    PAN_PARAM.SetQueryDB(PPQRY_TIPISTAMBIL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERC1, ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where (A.ESERCIZIO = ~~PARAESEDISTA~~) ");
    SQL.append("and   ((A.ESERCIZIO BETWEEN ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2)) ");
    PAN_PARAM.SetQuery(PPQRY_ESEFIN, 0, SQL, PFL_PARAM_ESERCDISTAMP, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERC1, ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where ((A.ESERCIZIO BETWEEN ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2)) ");
    PAN_PARAM.SetQuery(PPQRY_ESEFIN, 1, SQL, PFL_PARAM_ESERCDISTAMP, "");
    PAN_PARAM.SetQueryDB(PPQRY_ESEFIN, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_SESSIONE as STASALPROSES, ");
    SQL.append("  A.DATA_SALVATAGGIO as STASALDATSAL, ");
    SQL.append("  A.NOTA_SALVATAGGIO as STASALNOTSAL ");
    SQL.append("from ");
    SQL.append("  STAMPE_SALVATE A, ");
    SQL.append("  TIPI_STAMPE_BILPREV B ");
    SQL.append("where (A.PROGR_SESSIONE = ~~PARASTAMSALV~~) ");
    SQL.append("and   (B.PROGRESSIVO = ~~PARAPROGSTAM~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = 'BIL_PREVENTIVO') ");
    SQL.append("and   (A.PROCEDURA_STAMPA = B.PROCEDURA_STAMPA) ");
    SQL.append("order by ");
    SQL.append("  A.DATA_SALVATAGGIO desc ");
    PAN_PARAM.SetQuery(PPQRY_STAMPESALVA1, 0, SQL, PFL_PARAM_STAMPASALVAT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_SESSIONE as STASALPROSES, ");
    SQL.append("  A.DATA_SALVATAGGIO as STASALDATSAL, ");
    SQL.append("  A.NOTA_SALVATAGGIO as STASALNOTSAL ");
    SQL.append("from ");
    SQL.append("  STAMPE_SALVATE A, ");
    SQL.append("  TIPI_STAMPE_BILPREV B ");
    SQL.append("where (B.PROGRESSIVO = ~~PARAPROGSTAM~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = 'BIL_PREVENTIVO') ");
    SQL.append("and   (A.PROCEDURA_STAMPA = B.PROCEDURA_STAMPA) ");
    SQL.append("order by ");
    SQL.append("  A.DATA_SALVATAGGIO desc ");
    PAN_PARAM.SetQuery(PPQRY_STAMPESALVA1, 1, SQL, PFL_PARAM_STAMPASALVAT, "");
    PAN_PARAM.SetQueryDB(PPQRY_STAMPESALVA1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM167", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM167, IMDBDef11.PQRY_PARAM167_RS, IMDBDef3.TBL_PARAM151);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PROGRSTAMPA, IMDBDef3.FLD_PARAM151_PARAPROGSTAM);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUMERDIPAGIN, IMDBDef3.FLD_PARAM151_PARSTANUDIPA);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ESERCDISTAMP, IMDBDef3.FLD_PARAM151_PARAESEDISTA);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_FONTE, IMDBDef3.FLD_PARAM151_PARAMFONTE);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_STAMPASALVAT, IMDBDef3.FLD_PARAM151_PARASTAMSALV);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_SALVATSTAMPA, IMDBDef3.FLD_PARAM151_PARASALVSTAM);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NOTESTAMPA, IMDBDef3.FLD_PARAM151_PARANOTESTAM);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ESERCIZIO, IMDBDef3.FLD_PARAM151_PARAMESERCIZ);
    PAN_PARAM.SetMasterTable(0, "PARAM151");
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
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
