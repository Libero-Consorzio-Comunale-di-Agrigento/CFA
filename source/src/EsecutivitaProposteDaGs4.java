// **********************************************
// Esecutivita Proposte Da Gs4
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EsecutivitaProposteDaGs4 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ESECPRODAGS4_PROPOSTA = 0;

  private static int PFL_ESECPRODAGS4_AGG = 0;
  private static int PFL_ESECPRODAGS4_NEWPANELLABE = 1;
  private static int PFL_ESECPRODAGS4_UNITAPROPOST = 2;
  private static int PFL_ESECPRODAGS4_LABEL1 = 3;
  private static int PFL_ESECPRODAGS4_NUMEROPROPOS = 4;
  private static int PFL_ESECPRODAGS4_LABEL2 = 5;
  private static int PFL_ESECPRODAGS4_ANNOPROPOSTA = 6;
  private static int PFL_ESECPRODAGS4_APRI = 7;
  private static int PFL_ESECPRODAGS4_LABELGRUPPO = 8;
  private static int PFL_ESECPRODAGS4_ETICHEAVVISO = 9;
  private static int PFL_ESECPRODAGS4_ELABORA = 10;

  private static int PPQRY_ESECPRODAGS5 = 0;


  IDPanel PAN_ESECPRODAGS4;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_ESECPRODAGS4(IMDB);
    //
    //
    Init_PQRY_ESECPRODAGS5(IMDB);
    Init_PQRY_ESECPRODAGS5_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_ESECPRODAGS4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_ESECPRODAGS4, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_ESECPRODAGS4, "TBL_ESECPRODAGS4");
    IMDB.set_FldCode(IMDBDef2.TBL_ESECPRODAGS4,IMDBDef2.FLD_ESECPRODAGS4_ROWNAMEAGG, "ROWNAMEAGG");
    IMDB.SetFldParams(IMDBDef2.TBL_ESECPRODAGS4,IMDBDef2.FLD_ESECPRODAGS4_ROWNAMEAGG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESECPRODAGS4,IMDBDef2.FLD_ESECPRODAGS4_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_ESECPRODAGS4,IMDBDef2.FLD_ESECPRODAGS4_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESECPRODAGS4,IMDBDef2.FLD_ESECPRODAGS4_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_ESECPRODAGS4,IMDBDef2.FLD_ESECPRODAGS4_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_ESECPRODAGS4,IMDBDef2.FLD_ESECPRODAGS4_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_ESECPRODAGS4,IMDBDef2.FLD_ESECPRODAGS4_ROWNAMANNPRO,1,4,0);
    IMDB.TblAddNew(IMDBDef2.TBL_ESECPRODAGS4, 0);
  }

  private static void Init_PQRY_ESECPRODAGS5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_ESECPRODAGS5, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_ESECPRODAGS5, "PQRY_ESECPRODAGS5");
    IMDB.set_FldCode(IMDBDef9.PQRY_ESECPRODAGS5,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMEAGG, "ROWNAMEAGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_ESECPRODAGS5,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMEAGG,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ESECPRODAGS5,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ESECPRODAGS5,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ESECPRODAGS5,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ESECPRODAGS5,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ESECPRODAGS5,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ESECPRODAGS5,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMANNPRO,1,4,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_ESECPRODAGS5, 0);
  }

  private static void Init_PQRY_ESECPRODAGS5_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_ESECPRODAGS5_RS, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_ESECPRODAGS5_RS, "PQRY_ESECPRODAGS5_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_ESECPRODAGS5_RS,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMEAGG, "ROWNAMEAGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_ESECPRODAGS5_RS,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMEAGG,1,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ESECPRODAGS5_RS,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ESECPRODAGS5_RS,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ESECPRODAGS5_RS,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ESECPRODAGS5_RS,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ESECPRODAGS5_RS,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ESECPRODAGS5_RS,IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMANNPRO,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EsecutivitaProposteDaGs4(MyWebEntryPoint w, IMDBObj imdb)
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
  public EsecutivitaProposteDaGs4()
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
    FormIdx = MyGlb.FRM_ESECPRODAGS4;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F00868CE-806E-48BB-A89E-25ABBD876B52";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 344;
    DesignHeight = 250;
    set_Caption(new IDVariant("Esecutivita Proposte Da Gs4"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 344;
    Frames[1].Height = 224;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Esecutività Proposte Da Gs4";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 224;
    PAN_ESECPRODAGS4 = new IDPanel(w, this, 1, "PAN_ESECPRODAGS4");
    Frames[1].Content = PAN_ESECPRODAGS4;
    PAN_ESECPRODAGS4.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESECPRODAGS4.VS = MainFrm.VisualStyleList;
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 344-MyGlb.PAN_OFFS_X, 224-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESECPRODAGS4.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BA805D32-9159-4097-8CC1-FB0AF10DCADF");
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 444, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESECPRODAGS4.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESECPRODAGS4.InitStatus = 2;
    PAN_ESECPRODAGS4_Init();
    PAN_ESECPRODAGS4_InitFields();
    PAN_ESECPRODAGS4_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_ESECPRODAGS4, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESECPRODAGS4_ESECPRODAGS5();
      }
      PAN_ESECPRODAGS4.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_ESECPRODAGS4.FrIndex)
    {
      if (IdxFieldActived ==PFL_ESECPRODAGS4_APRI) {
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
    return (obj instanceof EsecutivitaProposteDaGs4);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EsecutivitaProposteDaGs4.class.getName() : (Glb.ClassWithPackage(EsecutivitaProposteDaGs4.class) ? EsecutivitaProposteDaGs4.class.getName().substring(EsecutivitaProposteDaGs4.class.getPackage().getName().length() + 1) : EsecutivitaProposteDaGs4.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      // 
      // FACCIO PARTIRE LA STAMPA
      // 
      if (IMDB.Value(IMDBDef9.PQRY_ESECPRODAGS5, IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMEAGG, 0).equals((new IDVariant(0)), true))
      {
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPA = (new IDVariant("Proposte_Esecutive"));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      else
      {
        // 
        // PROCEDURA
        // 
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILESECUTIVITAMOVIMENTIDEL(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef9.PQRY_ESECPRODAGS5, IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef9.PQRY_ESECPRODAGS5, IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMNUMPRO, 0), IMDB.Value(IMDBDef9.PQRY_ESECPRODAGS5, IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMUNIPRO, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposteDaGs4", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Proposta
  // **********************************************************************
  public int ApriProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Proposta Body
      // Procedure Body
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_SCELTAPROPOS, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_SCELTAPROPOS,(new IDVariant(0)).booleanValue()); 
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAM174, IMDBDef1.FLD_PARAM174_PARAMDELESEC, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposteDaGs4", "ApriProposta", _e);
      return -1;
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef2.TBL_ESECPRODAGS4, IMDBDef2.FLD_ESECPRODAGS4_ROWNAMEAGG, 0, (new IDVariant(1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposteDaGs4", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_ESECPRODAGS5, IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef9.PQRY_ESECPRODAGS5, IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef9.PQRY_ESECPRODAGS5, IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposteDaGs4", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Esecutività Proposte Da Gs4 On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESECPRODAGS4_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ESECPRODAGS4);
      // 
      // Esecutività Proposte Da Gs4 On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef9.PQRY_ESECPRODAGS5, IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMEAGG, 0).equals((new IDVariant(1)), true))
      {
        PAN_ESECPRODAGS4.SetFlags (Glb.OBJ_GROUP, GRP_ESECPRODAGS4_PROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_ESECPRODAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECPRODAGS4_ETICHEAVVISO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ESECPRODAGS4.SetFlags (Glb.OBJ_GROUP, GRP_ESECPRODAGS4_PROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_ESECPRODAGS4.SetFlags (Glb.OBJ_FIELD, PFL_ESECPRODAGS4_ETICHEAVVISO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposteDaGs4", "EsecutivitàProposteDaGs4OnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Esecutività Proposte Da Gs4 On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_ESECPRODAGS4_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esecutività Proposte Da Gs4 On Updating Row Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef9.PQRY_ESECPRODAGS5, IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMEAGG, 0).equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_ESECPRODAGS5, IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMUNIPRO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_ESECPRODAGS5, IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMNUMPRO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_ESECPRODAGS5, IMDBDef9.PQSL_ESECPRODAGS5_ROWNAMANNPRO, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsecutivitaProposteDaGs4", "EsecutivitàProposteDaGs4OnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Esecutività Proposte Da Gs4
  // Primary record source for panel data
  // **********************************************************************
  private void ESECPRODAGS4_ESECPRODAGS5() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_ESECPRODAGS5_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_ESECPRODAGS4, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_ESECPRODAGS4, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_ESECPRODAGS5_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_ESECPRODAGS5_RS, 0, IMDBDef2.TBL_ESECPRODAGS4, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ESECPRODAGS5_RS, 0, 0, IMDBDef2.TBL_ESECPRODAGS4, IMDBDef2.FLD_ESECPRODAGS4_ROWNAMEAGG, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ESECPRODAGS5_RS, 1, 0, IMDBDef2.TBL_ESECPRODAGS4, IMDBDef2.FLD_ESECPRODAGS4_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ESECPRODAGS5_RS, 2, 0, IMDBDef2.TBL_ESECPRODAGS4, IMDBDef2.FLD_ESECPRODAGS4_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ESECPRODAGS5_RS, 3, 0, IMDBDef2.TBL_ESECPRODAGS4, IMDBDef2.FLD_ESECPRODAGS4_ROWNAMANNPRO, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_ESECPRODAGS4, 0);
      if (IMDB.Eof(IMDBDef2.TBL_ESECPRODAGS4, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_ESECPRODAGS4, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_ESECPRODAGS5_RS, 0);
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
  private void PAN_ESECPRODAGS4_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ESECPRODAGS4, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ESECPRODAGS4_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESECPRODAGS4, Cancel);
    // Stub
  }

  private void PAN_ESECPRODAGS4_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ESECPRODAGS4_APRI)
    {
      this.IdxPanelActived = this.PAN_ESECPRODAGS4.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ESECPRODAGS4_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ESECPRODAGS4.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ESECPRODAGS4_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ESECPRODAGS4_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ESECPRODAGS4_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESECPRODAGS4_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ESECPRODAGS4_Init()
  {

    PAN_ESECPRODAGS4.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESECPRODAGS4.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_ESECPRODAGS4.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ESECPRODAGS4_PROPOSTA, "3967FF7D-404D-40F7-AAC8-AC06B3C044FD");
    PAN_ESECPRODAGS4.set_Header(MyGlb.OBJ_GROUP, GRP_ESECPRODAGS4_PROPOSTA, "Proposta");
    PAN_ESECPRODAGS4.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ESECPRODAGS4_PROPOSTA, "");
    PAN_ESECPRODAGS4.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ESECPRODAGS4_PROPOSTA, MyGlb.VIS_GROUPSTYLE);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_GROUP, GRP_ESECPRODAGS4_PROPOSTA, MyGlb.PANEL_LIST, 0, -9999, 108, 0, 0, 0);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_GROUP, GRP_ESECPRODAGS4_PROPOSTA, MyGlb.PANEL_FORM, 12, 88, 316, 28, 0, 0);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESECPRODAGS4_PROPOSTA, 0, 51);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESECPRODAGS4_PROPOSTA, 1, 13);
    PAN_ESECPRODAGS4.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESECPRODAGS4_PROPOSTA, 0, 1);
    PAN_ESECPRODAGS4.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESECPRODAGS4_PROPOSTA, 1, 1);
    PAN_ESECPRODAGS4.SetFlags(MyGlb.OBJ_GROUP, GRP_ESECPRODAGS4_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ESECPRODAGS4.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_ESECPRODAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_AGG, "7D1B068C-966A-4D76-B7F3-3C882578116F");
    PAN_ESECPRODAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_AGG, "Agg");
    PAN_ESECPRODAGS4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_AGG, "");
    PAN_ESECPRODAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_AGG, MyGlb.VIS_OPTIONBUTTON);
    PAN_ESECPRODAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_AGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESECPRODAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NEWPANELLABE, "FED6D746-0299-43CB-968F-1B7A89752F82");
    PAN_ESECPRODAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NEWPANELLABE, "Aggiornamento Esecutività Proposte su Movimenti Contabili.\n (Escluse Variazioni di Bilancio)");
    PAN_ESECPRODAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NEWPANELLABE, MyGlb.VIS_ETICHEGRASSE);
    PAN_ESECPRODAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NEWPANELLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECPRODAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_UNITAPROPOST, "CC657241-8C75-4102-B071-4C3B64315906");
    PAN_ESECPRODAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_UNITAPROPOST, "Proposta");
    PAN_ESECPRODAGS4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_UNITAPROPOST, "");
    PAN_ESECPRODAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_UNITAPROPOST, MyGlb.VIS_NORMFIELPADR);
    PAN_ESECPRODAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_UNITAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESECPRODAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL1, "5AB63B18-CFA1-4B13-8DCF-793286F6B83B");
    PAN_ESECPRODAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL1, "-");
    PAN_ESECPRODAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL1, MyGlb.VIS_VUOTONORMALE);
    PAN_ESECPRODAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECPRODAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NUMEROPROPOS, "FF26CF70-EF72-47F4-9B81-5B0CCFB86544");
    PAN_ESECPRODAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NUMEROPROPOS, "Numero Proposta");
    PAN_ESECPRODAGS4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NUMEROPROPOS, "");
    PAN_ESECPRODAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NUMEROPROPOS, MyGlb.VIS_NORMFIELPADR);
    PAN_ESECPRODAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESECPRODAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL2, "12F10ECC-267A-441A-8609-AFFE4ED0768E");
    PAN_ESECPRODAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL2, "/");
    PAN_ESECPRODAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL2, MyGlb.VIS_VUOTONORMALE);
    PAN_ESECPRODAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECPRODAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ANNOPROPOSTA, "C1DD9525-FE79-46D9-BEDB-2331831A54DA");
    PAN_ESECPRODAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ANNOPROPOSTA, "Anno Proposta");
    PAN_ESECPRODAGS4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ANNOPROPOSTA, "");
    PAN_ESECPRODAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ANNOPROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_ESECPRODAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESECPRODAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_APRI, "22BFF868-191B-43FA-8F1A-74E5528A4F00");
    PAN_ESECPRODAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_APRI, "");
    PAN_ESECPRODAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_APRI, MyGlb.VIS_STATICBUTTON);
    PAN_ESECPRODAGS4.SetImage(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_APRI, 0, "wsearch1.gif", false);
    PAN_ESECPRODAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_APRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ESECPRODAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABELGRUPPO, "95E9AB7B-8281-43B9-82D8-7FDA3D441127");
    PAN_ESECPRODAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABELGRUPPO, "");
    PAN_ESECPRODAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABELGRUPPO, MyGlb.VIS_VUOTONORMALE);
    PAN_ESECPRODAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABELGRUPPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECPRODAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ETICHEAVVISO, "7AF91081-952D-4B3D-BA75-3E10A92FBAC7");
    PAN_ESECPRODAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ETICHEAVVISO, "Se non viene indicata nessuna proposta, saranno resi esecutivi tutti i movimenti su proposte esecutive");
    PAN_ESECPRODAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ETICHEAVVISO, MyGlb.VIS_VUOGRAALILEF);
    PAN_ESECPRODAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ETICHEAVVISO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESECPRODAGS4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ELABORA, "3FC1E378-4D29-44BD-9811-271004E3E93E");
    PAN_ESECPRODAGS4.set_Header(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ELABORA, "Elabora");
    PAN_ESECPRODAGS4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ESECPRODAGS4.SetImage(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ELABORA, 0, "button1.gif", false);
    PAN_ESECPRODAGS4.SetFlags(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ESECPRODAGS4_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_AGG, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_AGG, MyGlb.PANEL_LIST, 28);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_AGG, MyGlb.PANEL_LIST, 1);
    PAN_ESECPRODAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_AGG, MyGlb.PANEL_LIST, "Agg");
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_AGG, MyGlb.PANEL_FORM, 12, 64, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_AGG, MyGlb.PANEL_FORM, 40);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_AGG, MyGlb.PANEL_FORM, 1);
    PAN_ESECPRODAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_AGG, MyGlb.PANEL_FORM, "Agg");
    PAN_ESECPRODAGS4.SetFieldPage(PFL_ESECPRODAGS4_AGG, -1, -1);
    PAN_ESECPRODAGS4.SetFieldPanel(PFL_ESECPRODAGS4_AGG, PPQRY_ESECPRODAGS5, "A.ROWNAMEAGG", "ROWNAMEAGG", 1, 1, 0, -13997);
    PAN_ESECPRODAGS4.SetValueListItem(PFL_ESECPRODAGS4_AGG, (new IDVariant(1)), "Aggiornamento Esecutività", "", "", -1);
    PAN_ESECPRODAGS4.SetValueListItem(PFL_ESECPRODAGS4_AGG, (new IDVariant(0)), "Solo Elenco Proposte", "", "", -1);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NEWPANELLABE, MyGlb.PANEL_LIST, 4, 4, 276, 64, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NEWPANELLABE, MyGlb.PANEL_LIST, 4);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NEWPANELLABE, MyGlb.PANEL_FORM, 12, 8, 316, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NEWPANELLABE, MyGlb.PANEL_FORM, 3);
    PAN_ESECPRODAGS4.SetFieldPage(PFL_ESECPRODAGS4_NEWPANELLABE, -1, -1);
    PAN_ESECPRODAGS4.SetFieldPanel(PFL_ESECPRODAGS4_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_UNITAPROPOST, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_UNITAPROPOST, MyGlb.PANEL_LIST, 92);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_UNITAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_ESECPRODAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_UNITAPROPOST, MyGlb.PANEL_LIST, "Proposta");
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_UNITAPROPOST, MyGlb.PANEL_FORM, 16, 92, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_UNITAPROPOST, MyGlb.PANEL_FORM, 60);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_UNITAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_ESECPRODAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_UNITAPROPOST, MyGlb.PANEL_FORM, "Proposta");
    PAN_ESECPRODAGS4.SetFieldPage(PFL_ESECPRODAGS4_UNITAPROPOST, -1, GRP_ESECPRODAGS4_PROPOSTA);
    PAN_ESECPRODAGS4.SetFieldPanel(PFL_ESECPRODAGS4_UNITAPROPOST, PPQRY_ESECPRODAGS5, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL1, MyGlb.PANEL_LIST, 144, 4, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL1, MyGlb.PANEL_LIST, 0);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL1, MyGlb.PANEL_LIST, 1);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL1, MyGlb.PANEL_FORM, 136, 92, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL1, MyGlb.PANEL_FORM, 0);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL1, MyGlb.PANEL_FORM, 1);
    PAN_ESECPRODAGS4.SetFieldPage(PFL_ESECPRODAGS4_LABEL1, -1, GRP_ESECPRODAGS4_PROPOSTA);
    PAN_ESECPRODAGS4.SetFieldPanel(PFL_ESECPRODAGS4_LABEL1, -1, "", "LABEL1", 0, 0, 0, -13997);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NUMEROPROPOS, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ESECPRODAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NUMEROPROPOS, MyGlb.PANEL_LIST, "Numero Proposta");
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NUMEROPROPOS, MyGlb.PANEL_FORM, 156, 92, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ESECPRODAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_ESECPRODAGS4.SetFieldPage(PFL_ESECPRODAGS4_NUMEROPROPOS, -1, GRP_ESECPRODAGS4_PROPOSTA);
    PAN_ESECPRODAGS4.SetFieldPanel(PFL_ESECPRODAGS4_NUMEROPROPOS, PPQRY_ESECPRODAGS5, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL2, MyGlb.PANEL_LIST, 152, 12, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL2, MyGlb.PANEL_LIST, 0);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL2, MyGlb.PANEL_LIST, 1);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL2, MyGlb.PANEL_FORM, 196, 92, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL2, MyGlb.PANEL_FORM, 0);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABEL2, MyGlb.PANEL_FORM, 1);
    PAN_ESECPRODAGS4.SetFieldPage(PFL_ESECPRODAGS4_LABEL2, -1, GRP_ESECPRODAGS4_PROPOSTA);
    PAN_ESECPRODAGS4.SetFieldPanel(PFL_ESECPRODAGS4_LABEL2, -1, "", "LABEL2", 0, 0, 0, -13997);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ANNOPROPOSTA, MyGlb.PANEL_LIST, 92);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ESECPRODAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Anno Proposta");
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ANNOPROPOSTA, MyGlb.PANEL_FORM, 212, 92, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ANNOPROPOSTA, MyGlb.PANEL_FORM, 92);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ESECPRODAGS4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_ESECPRODAGS4.SetFieldPage(PFL_ESECPRODAGS4_ANNOPROPOSTA, -1, GRP_ESECPRODAGS4_PROPOSTA);
    PAN_ESECPRODAGS4.SetFieldPanel(PFL_ESECPRODAGS4_ANNOPROPOSTA, PPQRY_ESECPRODAGS5, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_APRI, MyGlb.PANEL_LIST, 428, 20, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_APRI, MyGlb.PANEL_LIST, 0);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_APRI, MyGlb.PANEL_LIST, 1);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_APRI, MyGlb.PANEL_FORM, 256, 92, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_APRI, MyGlb.PANEL_FORM, 0);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_APRI, MyGlb.PANEL_FORM, 1);
    PAN_ESECPRODAGS4.SetFieldPage(PFL_ESECPRODAGS4_APRI, -1, GRP_ESECPRODAGS4_PROPOSTA);
    PAN_ESECPRODAGS4.SetFieldPanel(PFL_ESECPRODAGS4_APRI, -1, "", "APRI", 0, 0, 0, -13997);
    PAN_ESECPRODAGS4.set_ImageResizeMode(PFL_ESECPRODAGS4_APRI, 2);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABELGRUPPO, MyGlb.PANEL_LIST, 160, 20, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABELGRUPPO, MyGlb.PANEL_LIST, 0);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABELGRUPPO, MyGlb.PANEL_LIST, 1);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABELGRUPPO, MyGlb.PANEL_FORM, 308, 92, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABELGRUPPO, MyGlb.PANEL_FORM, 0);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_LABELGRUPPO, MyGlb.PANEL_FORM, 1);
    PAN_ESECPRODAGS4.SetFieldPage(PFL_ESECPRODAGS4_LABELGRUPPO, -1, GRP_ESECPRODAGS4_PROPOSTA);
    PAN_ESECPRODAGS4.SetFieldPanel(PFL_ESECPRODAGS4_LABELGRUPPO, -1, "", "LABELGRUPPO", 0, 0, 0, -13997);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ETICHEAVVISO, MyGlb.PANEL_LIST, 8, 140, 384, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ETICHEAVVISO, MyGlb.PANEL_LIST, 0);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ETICHEAVVISO, MyGlb.PANEL_LIST, 2);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ETICHEAVVISO, MyGlb.PANEL_FORM, 12, 120, 316, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ETICHEAVVISO, MyGlb.PANEL_FORM, 0);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ETICHEAVVISO, MyGlb.PANEL_FORM, 2);
    PAN_ESECPRODAGS4.SetFieldPage(PFL_ESECPRODAGS4_ETICHEAVVISO, -1, -1);
    PAN_ESECPRODAGS4.SetFieldPanel(PFL_ESECPRODAGS4_ETICHEAVVISO, -1, "", "ETICHEAVVISO", 0, 0, 0, -13997);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ELABORA, MyGlb.PANEL_LIST, 244, 108, 60, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ESECPRODAGS4.SetRect(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ELABORA, MyGlb.PANEL_FORM, 244, 156, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESECPRODAGS4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ESECPRODAGS4.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESECPRODAGS4_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ESECPRODAGS4.SetFieldPage(PFL_ESECPRODAGS4_ELABORA, -1, -1);
    PAN_ESECPRODAGS4.SetFieldPanel(PFL_ESECPRODAGS4_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_ESECPRODAGS4_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESECPRODAGS4.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ESECPRODAGS4.SetIMDB(IMDB, "PQRY_ESECPRODAGS5", true);
    PAN_ESECPRODAGS4.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ESECPRODAGS4.SetQueryIMDB(PPQRY_ESECPRODAGS5, IMDBDef9.PQRY_ESECPRODAGS5_RS, IMDBDef2.TBL_ESECPRODAGS4);
    JustLoaded = true;
    PAN_ESECPRODAGS4.SetFieldPrimaryIndex(PFL_ESECPRODAGS4_AGG, IMDBDef2.FLD_ESECPRODAGS4_ROWNAMEAGG);
    PAN_ESECPRODAGS4.SetFieldPrimaryIndex(PFL_ESECPRODAGS4_UNITAPROPOST, IMDBDef2.FLD_ESECPRODAGS4_ROWNAMUNIPRO);
    PAN_ESECPRODAGS4.SetFieldPrimaryIndex(PFL_ESECPRODAGS4_NUMEROPROPOS, IMDBDef2.FLD_ESECPRODAGS4_ROWNAMNUMPRO);
    PAN_ESECPRODAGS4.SetFieldPrimaryIndex(PFL_ESECPRODAGS4_ANNOPROPOSTA, IMDBDef2.FLD_ESECPRODAGS4_ROWNAMANNPRO);
    PAN_ESECPRODAGS4.SetMasterTable(0, "ESECPRODAGS4");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESECPRODAGS4.Status() == 2)
    {
      int oldListQBE = PAN_ESECPRODAGS4.iUseListQBE;
      PAN_ESECPRODAGS4.iUseListQBE = 0;
      PAN_ESECPRODAGS4.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESECPRODAGS4.PanelCommand(Glb.PCM_FIND);
      PAN_ESECPRODAGS4.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ESECPRODAGS4) PAN_ESECPRODAGS4_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESECPRODAGS4) PAN_ESECPRODAGS4_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ESECPRODAGS4) PAN_ESECPRODAGS4_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESECPRODAGS4) PAN_ESECPRODAGS4_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ESECPRODAGS4) PAN_ESECPRODAGS4_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
