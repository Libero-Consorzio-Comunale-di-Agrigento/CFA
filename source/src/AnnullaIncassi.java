// **********************************************
// Annulla Incassi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AnnullaIncassi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ANNULLINCASS_ORDINATIVI = 0;
  private static int GRP_ANNULLINCASS_INCASSI = 1;

  private static int PFL_ANNULLINCASS_DA = 0;
  private static int PFL_ANNULLINCASS_A = 1;
  private static int PFL_ANNULLINCASS_DAL1 = 2;
  private static int PFL_ANNULLINCASS_AL1 = 3;
  private static int PFL_ANNULLINCASS_DAL = 4;
  private static int PFL_ANNULLINCASS_AL = 5;
  private static int PFL_ANNULLINCASS_ELABORA = 6;

  private static int PPQRY_ANNULLINCAS1 = 0;


  IDPanel PAN_ANNULLINCASS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_ANNULLINCASS(IMDB);
    //
    //
    Init_PQRY_ANNULLINCAS1(IMDB);
    Init_PQRY_ANNULLINCAS1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_ANNULLINCASS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_ANNULLINCASS, 6);
    IMDB.set_TblCode(IMDBDef5.TBL_ANNULLINCASS, "TBL_ANNULLINCASS");
    IMDB.set_FldCode(IMDBDef5.TBL_ANNULLINCASS,IMDBDef5.FLD_ANNULLINCASS_ROWNAMEDA, "ROWNAMEDA");
    IMDB.SetFldParams(IMDBDef5.TBL_ANNULLINCASS,IMDBDef5.FLD_ANNULLINCASS_ROWNAMEDA,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ANNULLINCASS,IMDBDef5.FLD_ANNULLINCASS_ROWNAMEA, "ROWNAMEA");
    IMDB.SetFldParams(IMDBDef5.TBL_ANNULLINCASS,IMDBDef5.FLD_ANNULLINCASS_ROWNAMEA,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ANNULLINCASS,IMDBDef5.FLD_ANNULLINCASS_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_ANNULLINCASS,IMDBDef5.FLD_ANNULLINCASS_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ANNULLINCASS,IMDBDef5.FLD_ANNULLINCASS_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef5.TBL_ANNULLINCASS,IMDBDef5.FLD_ANNULLINCASS_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ANNULLINCASS,IMDBDef5.FLD_ANNULLINCASS_ROWNAMDALINC, "ROWNAMDALINC");
    IMDB.SetFldParams(IMDBDef5.TBL_ANNULLINCASS,IMDBDef5.FLD_ANNULLINCASS_ROWNAMDALINC,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ANNULLINCASS,IMDBDef5.FLD_ANNULLINCASS_ROWNAMEALINC, "ROWNAMEALINC");
    IMDB.SetFldParams(IMDBDef5.TBL_ANNULLINCASS,IMDBDef5.FLD_ANNULLINCASS_ROWNAMEALINC,6,14,0);
    IMDB.TblAddNew(IMDBDef5.TBL_ANNULLINCASS, 0);
  }

  private static void Init_PQRY_ANNULLINCAS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ANNULLINCAS1, 6);
    IMDB.set_TblCode(IMDBDef15.PQRY_ANNULLINCAS1, "PQRY_ANNULLINCAS1");
    IMDB.set_FldCode(IMDBDef15.PQRY_ANNULLINCAS1,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEDA, "ROWNAMEDA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANNULLINCAS1,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEDA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANNULLINCAS1,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEA, "ROWNAMEA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANNULLINCAS1,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANNULLINCAS1,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANNULLINCAS1,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANNULLINCAS1,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANNULLINCAS1,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANNULLINCAS1,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMDALINC, "ROWNAMDALINC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANNULLINCAS1,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMDALINC,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANNULLINCAS1,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEALINC, "ROWNAMEALINC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANNULLINCAS1,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEALINC,6,14,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ANNULLINCAS1, 0);
  }

  private static void Init_PQRY_ANNULLINCAS1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ANNULLINCAS1_RS, 6);
    IMDB.set_TblCode(IMDBDef15.PQRY_ANNULLINCAS1_RS, "PQRY_ANNULLINCAS1_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_ANNULLINCAS1_RS,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEDA, "ROWNAMEDA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANNULLINCAS1_RS,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEDA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANNULLINCAS1_RS,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEA, "ROWNAMEA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANNULLINCAS1_RS,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANNULLINCAS1_RS,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANNULLINCAS1_RS,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANNULLINCAS1_RS,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANNULLINCAS1_RS,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANNULLINCAS1_RS,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMDALINC, "ROWNAMDALINC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANNULLINCAS1_RS,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMDALINC,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANNULLINCAS1_RS,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEALINC, "ROWNAMEALINC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANNULLINCAS1_RS,IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEALINC,6,14,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AnnullaIncassi(MyWebEntryPoint w, IMDBObj imdb)
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
  public AnnullaIncassi()
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
    FormIdx = MyGlb.FRM_ANNULLINCASS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F2B92137-E983-4E9E-9935-51AD24D27DE2";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 352;
    DesignHeight = 262;
    set_Caption(new IDVariant("Annulla Incassi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 352;
    Frames[1].Height = 236;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Annulla Incassi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 236;
    PAN_ANNULLINCASS = new IDPanel(w, this, 1, "PAN_ANNULLINCASS");
    Frames[1].Content = PAN_ANNULLINCASS;
    PAN_ANNULLINCASS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ANNULLINCASS.VS = MainFrm.VisualStyleList;
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 352-MyGlb.PAN_OFFS_X, 236-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ANNULLINCASS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2E35ADCE-B427-4355-97FB-7785CFA17900");
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 496, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ANNULLINCASS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ANNULLINCASS.InitStatus = 2;
    PAN_ANNULLINCASS_Init();
    PAN_ANNULLINCASS_InitFields();
    PAN_ANNULLINCASS_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_ANNULLINCASS, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ANNULLINCASS_ANNULLINCAS1();
      }
      PAN_ANNULLINCASS.UpdatePanel(MainFrm);
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
    return (obj instanceof AnnullaIncassi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AnnullaIncassi.class.getName() : (Glb.ClassWithPackage(AnnullaIncassi.class) ? AnnullaIncassi.class.getName().substring(AnnullaIncassi.class.getPackage().getName().length() + 1) : AnnullaIncassi.class.getName()));
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
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ANNULLINCAS1, IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEDA, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ANNULLINCAS1, IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEA, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ANNULLINCAS1, IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEDAL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ANNULLINCAS1, IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEAL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ANNULLINCAS1, IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMDALINC, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ANNULLINCAS1, IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEALINC, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Specificare almeno un parametro", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.ANNULLAINCASSI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_ANNULLINCAS1, IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEDA, 0), IMDB.Value(IMDBDef15.PQRY_ANNULLINCAS1, IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEA, 0), IMDB.Value(IMDBDef15.PQRY_ANNULLINCAS1, IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEDAL, 0), IMDB.Value(IMDBDef15.PQRY_ANNULLINCAS1, IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEAL, 0), IMDB.Value(IMDBDef15.PQRY_ANNULLINCAS1, IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMDALINC, 0), IMDB.Value(IMDBDef15.PQRY_ANNULLINCAS1, IMDBDef15.PQSL_ANNULLINCAS1_ROWNAMEALINC, 0));
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
      MainFrm.ErrObj.ProcError ("AnnullaIncassi", "Elabora", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEDA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEA, 0))))
      {
        PAN_ANNULLINCASS.SetFlags (Glb.OBJ_FIELD, PFL_ANNULLINCASS_DA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ANNULLINCASS.SetFlags (Glb.OBJ_FIELD, PFL_ANNULLINCASS_A, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ANNULLINCASS.SetFlags (Glb.OBJ_FIELD, PFL_ANNULLINCASS_DA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ANNULLINCASS.SetFlags (Glb.OBJ_FIELD, PFL_ANNULLINCASS_A, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnnullaIncassi", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEDA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMDALINC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEALINC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO1, IMDBDef6.FLD_PARAMEESPLO1_PARAAGGDAFUO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO2, IMDBDef6.FLD_PARAMEESPLO2_PARAAGGDAFUO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO4, IMDBDef6.FLD_PARAMEESPLO4_PARAAGGDAFUO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO5, IMDBDef6.FLD_PARAMEESPLO5_PARAAGGDAFUO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO6, IMDBDef6.FLD_PARAMEESPLO6_PARAAGGDAFUO, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnnullaIncassi", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Annulla Incassi
  // Primary record source for panel data
  // **********************************************************************
  private void ANNULLINCASS_ANNULLINCAS1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_ANNULLINCAS1_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_ANNULLINCASS, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_ANNULLINCASS, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_ANNULLINCAS1_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_ANNULLINCAS1_RS, 0, IMDBDef5.TBL_ANNULLINCASS, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ANNULLINCAS1_RS, 0, 0, IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEDA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ANNULLINCAS1_RS, 1, 0, IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ANNULLINCAS1_RS, 2, 0, IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ANNULLINCAS1_RS, 3, 0, IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ANNULLINCAS1_RS, 4, 0, IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMDALINC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ANNULLINCAS1_RS, 5, 0, IMDBDef5.TBL_ANNULLINCASS, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEALINC, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_ANNULLINCASS, 0);
      if (IMDB.Eof(IMDBDef5.TBL_ANNULLINCASS, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_ANNULLINCASS, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_ANNULLINCAS1_RS, 0);
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
  private void PAN_ANNULLINCASS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ANNULLINCASS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ANNULLINCASS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ANNULLINCASS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ANNULLINCASS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ANNULLINCASS);
    // Stub
  }

  private void PAN_ANNULLINCASS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ANNULLINCASS_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ANNULLINCASS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ANNULLINCASS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ANNULLINCASS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ANNULLINCASS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ANNULLINCASS_Init()
  {

    PAN_ANNULLINCASS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ANNULLINCASS.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ANNULLINCASS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_ORDINATIVI, "19EA7C4A-05DE-4527-8049-177A2859E298");
    PAN_ANNULLINCASS.set_Header(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_ORDINATIVI, "Ordinativi");
    PAN_ANNULLINCASS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_ORDINATIVI, "");
    PAN_ANNULLINCASS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_ORDINATIVI, MyGlb.PANEL_LIST, 0, -9999, 288, 16, 0, 0);
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_ORDINATIVI, MyGlb.PANEL_FORM, 28, 7, 276, 73, 0, 0);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_ORDINATIVI, 0, 55);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_ORDINATIVI, 1, 13);
    PAN_ANNULLINCASS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_ORDINATIVI, 0, 4);
    PAN_ANNULLINCASS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_ORDINATIVI, 1, 4);
    PAN_ANNULLINCASS.SetFlags(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ANNULLINCASS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_INCASSI, "FF759BE3-F32F-4A2A-9E7C-76585A279D20");
    PAN_ANNULLINCASS.set_Header(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_INCASSI, "Incassi");
    PAN_ANNULLINCASS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_INCASSI, "");
    PAN_ANNULLINCASS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_INCASSI, MyGlb.VIS_GROUPSTYLE);
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_INCASSI, MyGlb.PANEL_LIST, 288, -9999, 208, 16, 0, 0);
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_INCASSI, MyGlb.PANEL_FORM, 28, 87, 276, 49, 0, 0);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_INCASSI, 0, 40);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_INCASSI, 1, 13);
    PAN_ANNULLINCASS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_INCASSI, 0, 4);
    PAN_ANNULLINCASS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_INCASSI, 1, 4);
    PAN_ANNULLINCASS.SetFlags(MyGlb.OBJ_GROUP, GRP_ANNULLINCASS_INCASSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ANNULLINCASS.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_ANNULLINCASS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DA, "6E5822C0-719B-4243-8633-5009B8E01375");
    PAN_ANNULLINCASS.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DA, "Da");
    PAN_ANNULLINCASS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DA, "");
    PAN_ANNULLINCASS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DA, MyGlb.VIS_NORMALFIELDS);
    PAN_ANNULLINCASS.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANNULLINCASS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_A, "937E444E-D7E7-4DED-B94B-06A6295B83C7");
    PAN_ANNULLINCASS.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_A, "A");
    PAN_ANNULLINCASS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_A, "");
    PAN_ANNULLINCASS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_A, MyGlb.VIS_NORMALFIELDS);
    PAN_ANNULLINCASS.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_A, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANNULLINCASS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL1, "0CAE51D6-30D7-461C-ACE9-F24820AA8D5C");
    PAN_ANNULLINCASS.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL1, "Dal");
    PAN_ANNULLINCASS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL1, "");
    PAN_ANNULLINCASS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_ANNULLINCASS.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANNULLINCASS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL1, "B8FBAA44-493A-4AC2-B576-C02060D0B924");
    PAN_ANNULLINCASS.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL1, "Al");
    PAN_ANNULLINCASS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL1, "");
    PAN_ANNULLINCASS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_ANNULLINCASS.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANNULLINCASS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL, "4F4BAC82-D662-4AD0-822C-B72FE7404B1E");
    PAN_ANNULLINCASS.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL, "Dal ");
    PAN_ANNULLINCASS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL, "");
    PAN_ANNULLINCASS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ANNULLINCASS.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANNULLINCASS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL, "1445E83A-AD78-4427-850D-04F9BE77B8B9");
    PAN_ANNULLINCASS.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL, "Al ");
    PAN_ANNULLINCASS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL, "");
    PAN_ANNULLINCASS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_ANNULLINCASS.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANNULLINCASS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_ELABORA, "8BA75F80-130E-48B3-B6D0-D13B37AF32E8");
    PAN_ANNULLINCASS.set_Header(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_ELABORA, "Elabora");
    PAN_ANNULLINCASS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ANNULLINCASS.SetImage(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_ELABORA, 0, "button1.gif", false);
    PAN_ANNULLINCASS.SetFlags(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ANNULLINCASS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DA, MyGlb.PANEL_LIST, 24);
    PAN_ANNULLINCASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DA, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLINCASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DA, MyGlb.PANEL_LIST, "Da");
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DA, MyGlb.PANEL_FORM, 32, 32, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DA, MyGlb.PANEL_FORM, 32);
    PAN_ANNULLINCASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DA, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLINCASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DA, MyGlb.PANEL_FORM, "Da");
    PAN_ANNULLINCASS.SetFieldPage(PFL_ANNULLINCASS_DA, -1, GRP_ANNULLINCASS_ORDINATIVI);
    PAN_ANNULLINCASS.SetFieldPanel(PFL_ANNULLINCASS_DA, PPQRY_ANNULLINCAS1, "A.ROWNAMEDA", "ROWNAMEDA", 1, 5, 0, -13997);
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_A, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_A, MyGlb.PANEL_LIST, 16);
    PAN_ANNULLINCASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_A, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLINCASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_A, MyGlb.PANEL_LIST, "A");
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_A, MyGlb.PANEL_FORM, 192, 32, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_A, MyGlb.PANEL_FORM, 24);
    PAN_ANNULLINCASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_A, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLINCASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_A, MyGlb.PANEL_FORM, "A");
    PAN_ANNULLINCASS.SetFieldPage(PFL_ANNULLINCASS_A, -1, GRP_ANNULLINCASS_ORDINATIVI);
    PAN_ANNULLINCASS.SetFieldPanel(PFL_ANNULLINCASS_A, PPQRY_ANNULLINCAS1, "A.ROWNAMEA", "ROWNAMEA", 1, 5, 0, -13997);
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL1, MyGlb.PANEL_LIST, 80, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL1, MyGlb.PANEL_LIST, 24);
    PAN_ANNULLINCASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLINCASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL1, MyGlb.PANEL_LIST, "Dal");
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL1, MyGlb.PANEL_FORM, 32, 56, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL1, MyGlb.PANEL_FORM, 32);
    PAN_ANNULLINCASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLINCASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL1, MyGlb.PANEL_FORM, "Dal");
    PAN_ANNULLINCASS.SetFieldPage(PFL_ANNULLINCASS_DAL1, -1, GRP_ANNULLINCASS_ORDINATIVI);
    PAN_ANNULLINCASS.SetFieldPanel(PFL_ANNULLINCASS_DAL1, PPQRY_ANNULLINCAS1, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL1, MyGlb.PANEL_LIST, 184, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL1, MyGlb.PANEL_LIST, 20);
    PAN_ANNULLINCASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL1, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLINCASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL1, MyGlb.PANEL_LIST, "Al");
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL1, MyGlb.PANEL_FORM, 184, 56, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL1, MyGlb.PANEL_FORM, 32);
    PAN_ANNULLINCASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL1, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLINCASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL1, MyGlb.PANEL_FORM, "Al");
    PAN_ANNULLINCASS.SetFieldPage(PFL_ANNULLINCASS_AL1, -1, GRP_ANNULLINCASS_ORDINATIVI);
    PAN_ANNULLINCASS.SetFieldPanel(PFL_ANNULLINCASS_AL1, PPQRY_ANNULLINCAS1, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL, MyGlb.PANEL_LIST, 288, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL, MyGlb.PANEL_LIST, 60);
    PAN_ANNULLINCASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLINCASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL, MyGlb.PANEL_LIST, "Dal ");
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL, MyGlb.PANEL_FORM, 32, 112, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL, MyGlb.PANEL_FORM, 32);
    PAN_ANNULLINCASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLINCASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_DAL, MyGlb.PANEL_FORM, "Dal ");
    PAN_ANNULLINCASS.SetFieldPage(PFL_ANNULLINCASS_DAL, -1, GRP_ANNULLINCASS_INCASSI);
    PAN_ANNULLINCASS.SetFieldPanel(PFL_ANNULLINCASS_DAL, PPQRY_ANNULLINCAS1, "A.ROWNAMDALINC", "ROWNAMDALINC", 6, 14, 0, -13997);
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL, MyGlb.PANEL_LIST, 392, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL, MyGlb.PANEL_LIST, 56);
    PAN_ANNULLINCASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLINCASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL, MyGlb.PANEL_LIST, "Al ");
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL, MyGlb.PANEL_FORM, 184, 112, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL, MyGlb.PANEL_FORM, 32);
    PAN_ANNULLINCASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLINCASS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_AL, MyGlb.PANEL_FORM, "Al ");
    PAN_ANNULLINCASS.SetFieldPage(PFL_ANNULLINCASS_AL, -1, GRP_ANNULLINCASS_INCASSI);
    PAN_ANNULLINCASS.SetFieldPanel(PFL_ANNULLINCASS_AL, PPQRY_ANNULLINCAS1, "A.ROWNAMEALINC", "ROWNAMEALINC", 6, 14, 0, -13997);
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_ELABORA, MyGlb.PANEL_LIST, 172, 148, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ANNULLINCASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ANNULLINCASS.SetRect(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_ELABORA, MyGlb.PANEL_FORM, 228, 160, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANNULLINCASS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ANNULLINCASS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANNULLINCASS_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ANNULLINCASS.SetFieldPage(PFL_ANNULLINCASS_ELABORA, -1, -1);
    PAN_ANNULLINCASS.SetFieldPanel(PFL_ANNULLINCASS_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_ANNULLINCASS_InitQueries()
  {
    StringBuffer SQL;

    PAN_ANNULLINCASS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ANNULLINCASS.SetIMDB(IMDB, "PQRY_ANNULLINCAS1", true);
    PAN_ANNULLINCASS.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ANNULLINCASS.SetQueryIMDB(PPQRY_ANNULLINCAS1, IMDBDef15.PQRY_ANNULLINCAS1_RS, IMDBDef5.TBL_ANNULLINCASS);
    JustLoaded = true;
    PAN_ANNULLINCASS.SetFieldPrimaryIndex(PFL_ANNULLINCASS_DA, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEDA);
    PAN_ANNULLINCASS.SetFieldPrimaryIndex(PFL_ANNULLINCASS_A, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEA);
    PAN_ANNULLINCASS.SetFieldPrimaryIndex(PFL_ANNULLINCASS_DAL1, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEDAL);
    PAN_ANNULLINCASS.SetFieldPrimaryIndex(PFL_ANNULLINCASS_AL1, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEAL);
    PAN_ANNULLINCASS.SetFieldPrimaryIndex(PFL_ANNULLINCASS_DAL, IMDBDef5.FLD_ANNULLINCASS_ROWNAMDALINC);
    PAN_ANNULLINCASS.SetFieldPrimaryIndex(PFL_ANNULLINCASS_AL, IMDBDef5.FLD_ANNULLINCASS_ROWNAMEALINC);
    PAN_ANNULLINCASS.SetMasterTable(0, "ANNULLINCASS");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ANNULLINCASS.Status() == 2)
    {
      int oldListQBE = PAN_ANNULLINCASS.iUseListQBE;
      PAN_ANNULLINCASS.iUseListQBE = 0;
      PAN_ANNULLINCASS.PanelCommand(Glb.PCM_SEARCH);
      PAN_ANNULLINCASS.PanelCommand(Glb.PCM_FIND);
      PAN_ANNULLINCASS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ANNULLINCASS) PAN_ANNULLINCASS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ANNULLINCASS) PAN_ANNULLINCASS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ANNULLINCASS) PAN_ANNULLINCASS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ANNULLINCASS) PAN_ANNULLINCASS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ANNULLINCASS) PAN_ANNULLINCASS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
