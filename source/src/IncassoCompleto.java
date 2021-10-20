// **********************************************
// Incasso Completo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class IncassoCompleto extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_INCASSCOMPLE_ORDINATIVI = 0;
  private static int GRP_INCASSCOMPLE_INCASSO = 1;

  private static int PFL_INCASSCOMPLE_DAL = 0;
  private static int PFL_INCASSCOMPLE_AL = 1;
  private static int PFL_INCASSCOMPLE_EMESSIAL = 2;
  private static int PFL_INCASSCOMPLE_DATA = 3;
  private static int PFL_INCASSCOMPLE_NUMERO = 4;
  private static int PFL_INCASSCOMPLE_ELABORA = 5;

  private static int PPQRY_INCASSCOMPL1 = 0;


  IDPanel PAN_INCASSCOMPLE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_INCASSCOMPLE(IMDB);
    //
    //
    Init_PQRY_INCASSCOMPL1(IMDB);
    Init_PQRY_INCASSCOMPL1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_INCASSCOMPLE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_INCASSCOMPLE, 5);
    IMDB.set_TblCode(IMDBDef5.TBL_INCASSCOMPLE, "TBL_INCASSCOMPLE");
    IMDB.set_FldCode(IMDBDef5.TBL_INCASSCOMPLE,IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_INCASSCOMPLE,IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_INCASSCOMPLE,IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef5.TBL_INCASSCOMPLE,IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_INCASSCOMPLE,IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEEMEAL, "ROWNAMEEMEAL");
    IMDB.SetFldParams(IMDBDef5.TBL_INCASSCOMPLE,IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEEMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_INCASSCOMPLE,IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef5.TBL_INCASSCOMPLE,IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_INCASSCOMPLE,IMDBDef5.FLD_INCASSCOMPLE_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef5.TBL_INCASSCOMPLE,IMDBDef5.FLD_INCASSCOMPLE_ROWNAMENUMER,1,10,0);
    IMDB.TblAddNew(IMDBDef5.TBL_INCASSCOMPLE, 0);
  }

  private static void Init_PQRY_INCASSCOMPL1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_INCASSCOMPL1, 5);
    IMDB.set_TblCode(IMDBDef15.PQRY_INCASSCOMPL1, "PQRY_INCASSCOMPL1");
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSCOMPL1,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSCOMPL1,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSCOMPL1,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSCOMPL1,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSCOMPL1,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEEMEAL, "ROWNAMEEMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSCOMPL1,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEEMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSCOMPL1,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSCOMPL1,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSCOMPL1,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSCOMPL1,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMENUMER,1,10,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_INCASSCOMPL1, 0);
  }

  private static void Init_PQRY_INCASSCOMPL1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_INCASSCOMPL1_RS, 5);
    IMDB.set_TblCode(IMDBDef15.PQRY_INCASSCOMPL1_RS, "PQRY_INCASSCOMPL1_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSCOMPL1_RS,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSCOMPL1_RS,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSCOMPL1_RS,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSCOMPL1_RS,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSCOMPL1_RS,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEEMEAL, "ROWNAMEEMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSCOMPL1_RS,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEEMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSCOMPL1_RS,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSCOMPL1_RS,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSCOMPL1_RS,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSCOMPL1_RS,IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMENUMER,1,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public IncassoCompleto(MyWebEntryPoint w, IMDBObj imdb)
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
  public IncassoCompleto()
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
    FormIdx = MyGlb.FRM_INCASSCOMPLE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4AEFDE7D-6E8D-4BBC-A991-76BE0C88BE88";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 420;
    DesignHeight = 266;
    set_Caption(new IDVariant("Incasso Completo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 420;
    Frames[1].Height = 240;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Incasso Completo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 240;
    PAN_INCASSCOMPLE = new IDPanel(w, this, 1, "PAN_INCASSCOMPLE");
    Frames[1].Content = PAN_INCASSCOMPLE;
    PAN_INCASSCOMPLE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_INCASSCOMPLE.VS = MainFrm.VisualStyleList;
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 420-MyGlb.PAN_OFFS_X, 240-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_INCASSCOMPLE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CCF54A46-92C2-476B-88ED-77B04FACBD04");
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 344, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSCOMPLE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_INCASSCOMPLE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_INCASSCOMPLE.InitStatus = 2;
    PAN_INCASSCOMPLE_Init();
    PAN_INCASSCOMPLE_InitFields();
    PAN_INCASSCOMPLE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_INCASSCOMPLE, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INCASSCOMPLE_INCASSCOMPL1();
      }
      PAN_INCASSCOMPLE.UpdatePanel(MainFrm);
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
    return (obj instanceof IncassoCompleto);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? IncassoCompleto.class.getName() : (Glb.ClassWithPackage(IncassoCompleto.class) ? IncassoCompleto.class.getName().substring(IncassoCompleto.class.getPackage().getName().length() + 1) : IncassoCompleto.class.getName()));
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
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_INCASSCOMPL1, IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEDATA, 0)) || IDL.Year(IMDB.Value(IMDBDef15.PQRY_INCASSCOMPL1, IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEDATA, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Data Incasso non indicata o non appartenente all'Esercizio del Contesto", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_INCASSCOMPL1, IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEEMEAL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_INCASSCOMPL1, IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEDAL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_INCASSCOMPL1, IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEAL, 0)))
        {
          IDVariant v_MESS = new IDVariant(0,IDVariant.STRING);
          v_MESS = (new IDVariant("Indicare almeno un filtro per la ricerca degli Ordinativi", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MESS); 
        }
        else
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.ORDINCASSO(IMDB.Value(IMDBDef15.PQRY_INCASSCOMPL1, IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEDAL, 0), IMDB.Value(IMDBDef15.PQRY_INCASSCOMPL1, IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEAL, 0), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_INCASSCOMPL1, IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEEMEAL, 0)), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_INCASSCOMPL1, IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMENUMER, 0)), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_INCASSCOMPL1, IMDBDef15.PQSL_INCASSCOMPL1_ROWNAMEDATA, 0)), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
          else
          {
            MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncassoCompleto", "Elabora", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef5.TBL_INCASSCOMPLE, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEDAL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef5.TBL_INCASSCOMPLE, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEAL, 0))))
      {
        PAN_INCASSCOMPLE.SetFlags (Glb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_INCASSCOMPLE.SetFlags (Glb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_INCASSCOMPLE.SetFlags (Glb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_INCASSCOMPLE.SetFlags (Glb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncassoCompleto", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_INCASSCOMPLE, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_INCASSCOMPLE, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_INCASSCOMPLE, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMENUMER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_INCASSCOMPLE, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEEMEAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_INCASSCOMPLE, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEDATA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO1, IMDBDef6.FLD_PARAMEESPLO1_PARAAGGDAFUO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO2, IMDBDef6.FLD_PARAMEESPLO2_PARAAGGDAFUO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO4, IMDBDef6.FLD_PARAMEESPLO4_PARAAGGDAFUO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO5, IMDBDef6.FLD_PARAMEESPLO5_PARAAGGDAFUO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO6, IMDBDef6.FLD_PARAMEESPLO6_PARAAGGDAFUO, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncassoCompleto", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Incasso Completo
  // Primary record source for panel data
  // **********************************************************************
  private void INCASSCOMPLE_INCASSCOMPL1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_INCASSCOMPL1_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_INCASSCOMPLE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_INCASSCOMPLE, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_INCASSCOMPL1_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_INCASSCOMPL1_RS, 0, IMDBDef5.TBL_INCASSCOMPLE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_INCASSCOMPL1_RS, 0, 0, IMDBDef5.TBL_INCASSCOMPLE, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_INCASSCOMPL1_RS, 1, 0, IMDBDef5.TBL_INCASSCOMPLE, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_INCASSCOMPL1_RS, 2, 0, IMDBDef5.TBL_INCASSCOMPLE, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEEMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_INCASSCOMPL1_RS, 3, 0, IMDBDef5.TBL_INCASSCOMPLE, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEDATA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_INCASSCOMPL1_RS, 4, 0, IMDBDef5.TBL_INCASSCOMPLE, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMENUMER, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_INCASSCOMPLE, 0);
      if (IMDB.Eof(IMDBDef5.TBL_INCASSCOMPLE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_INCASSCOMPLE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_INCASSCOMPL1_RS, 0);
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
  private void PAN_INCASSCOMPLE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_INCASSCOMPLE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_INCASSCOMPLE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_INCASSCOMPLE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_INCASSCOMPLE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_INCASSCOMPLE);
    // Stub
  }

  private void PAN_INCASSCOMPLE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_INCASSCOMPLE_ELABORA)
    {
      this.IdxPanelActived = this.PAN_INCASSCOMPLE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_INCASSCOMPLE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_INCASSCOMPLE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_INCASSCOMPLE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_INCASSCOMPLE_Init()
  {

    PAN_INCASSCOMPLE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_INCASSCOMPLE.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_INCASSCOMPLE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_ORDINATIVI, "0E929C79-8E1E-4AFE-A12D-51323051CFDC");
    PAN_INCASSCOMPLE.set_Header(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_ORDINATIVI, "Ordinativi");
    PAN_INCASSCOMPLE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_ORDINATIVI, "");
    PAN_INCASSCOMPLE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_ORDINATIVI, MyGlb.PANEL_LIST, 0, -9999, 184, 16, 0, 0);
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_ORDINATIVI, MyGlb.PANEL_FORM, 28, 7, 296, 77, 0, 0);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_ORDINATIVI, 0, 55);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_ORDINATIVI, 1, 13);
    PAN_INCASSCOMPLE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_ORDINATIVI, 0, 4);
    PAN_INCASSCOMPLE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_ORDINATIVI, 1, 4);
    PAN_INCASSCOMPLE.SetFlags(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_INCASSCOMPLE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_INCASSO, "2698842D-7AE9-427C-A05E-BB7D265C3A72");
    PAN_INCASSCOMPLE.set_Header(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_INCASSO, "Incasso");
    PAN_INCASSCOMPLE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_INCASSO, "");
    PAN_INCASSCOMPLE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_INCASSO, MyGlb.VIS_GROUPSTYLE);
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_INCASSO, MyGlb.PANEL_LIST, 184, -9999, 160, 16, 0, 0);
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_INCASSO, MyGlb.PANEL_FORM, 28, 91, 296, 49, 0, 0);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_INCASSO, 0, 44);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_INCASSO, 1, 13);
    PAN_INCASSCOMPLE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_INCASSO, 0, 4);
    PAN_INCASSCOMPLE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_INCASSO, 1, 4);
    PAN_INCASSCOMPLE.SetFlags(MyGlb.OBJ_GROUP, GRP_INCASSCOMPLE_INCASSO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_INCASSCOMPLE.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_INCASSCOMPLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, "50CD2FBA-2001-4963-820E-827C4AF3915E");
    PAN_INCASSCOMPLE.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, "Dal");
    PAN_INCASSCOMPLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, "");
    PAN_INCASSCOMPLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSCOMPLE.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSCOMPLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, "6B680C53-616E-45D1-BDC0-3C0B9122A32A");
    PAN_INCASSCOMPLE.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, "Al");
    PAN_INCASSCOMPLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, "");
    PAN_INCASSCOMPLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSCOMPLE.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSCOMPLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_EMESSIAL, "33E794F2-3F2A-4D92-B434-8388A555D394");
    PAN_INCASSCOMPLE.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_EMESSIAL, "Emessi Al");
    PAN_INCASSCOMPLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_EMESSIAL, "");
    PAN_INCASSCOMPLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_EMESSIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSCOMPLE.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_EMESSIAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSCOMPLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DATA, "7AAC7BF8-83A8-4FAC-B813-BA6ECD9AD017");
    PAN_INCASSCOMPLE.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DATA, "Data");
    PAN_INCASSCOMPLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DATA, "");
    PAN_INCASSCOMPLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSCOMPLE.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSCOMPLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_NUMERO, "50AB7EAA-940E-4B9C-9423-70803F739FEE");
    PAN_INCASSCOMPLE.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_NUMERO, "Numero");
    PAN_INCASSCOMPLE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_NUMERO, "");
    PAN_INCASSCOMPLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSCOMPLE.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSCOMPLE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_ELABORA, "0D466AC7-C9EB-4228-B0A0-FB88C86DC068");
    PAN_INCASSCOMPLE.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_ELABORA, "Elabora");
    PAN_INCASSCOMPLE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_INCASSCOMPLE.SetImage(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_ELABORA, 0, "button1.gif", false);
    PAN_INCASSCOMPLE.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_INCASSCOMPLE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, MyGlb.PANEL_LIST, 24);
    PAN_INCASSCOMPLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, MyGlb.PANEL_LIST, 1);
    PAN_INCASSCOMPLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, MyGlb.PANEL_FORM, 68, 32, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, MyGlb.PANEL_FORM, 28);
    PAN_INCASSCOMPLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, MyGlb.PANEL_FORM, 1);
    PAN_INCASSCOMPLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_INCASSCOMPLE.SetFieldPage(PFL_INCASSCOMPLE_DAL, -1, GRP_INCASSCOMPLE_ORDINATIVI);
    PAN_INCASSCOMPLE.SetFieldPanel(PFL_INCASSCOMPLE_DAL, PPQRY_INCASSCOMPL1, "A.ROWNAMEDAL", "ROWNAMEDAL", 1, 5, 0, -13997);
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, MyGlb.PANEL_LIST, 20);
    PAN_INCASSCOMPLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, MyGlb.PANEL_LIST, 1);
    PAN_INCASSCOMPLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, MyGlb.PANEL_LIST, "Al");
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, MyGlb.PANEL_FORM, 248, 32, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, MyGlb.PANEL_FORM, 20);
    PAN_INCASSCOMPLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, MyGlb.PANEL_FORM, 1);
    PAN_INCASSCOMPLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_AL, MyGlb.PANEL_FORM, "Al");
    PAN_INCASSCOMPLE.SetFieldPage(PFL_INCASSCOMPLE_AL, -1, GRP_INCASSCOMPLE_ORDINATIVI);
    PAN_INCASSCOMPLE.SetFieldPanel(PFL_INCASSCOMPLE_AL, PPQRY_INCASSCOMPL1, "A.ROWNAMEAL", "ROWNAMEAL", 1, 5, 0, -13997);
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_EMESSIAL, MyGlb.PANEL_LIST, 80, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_EMESSIAL, MyGlb.PANEL_LIST, 52);
    PAN_INCASSCOMPLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_EMESSIAL, MyGlb.PANEL_LIST, 1);
    PAN_INCASSCOMPLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_EMESSIAL, MyGlb.PANEL_LIST, "Emessi Al");
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_EMESSIAL, MyGlb.PANEL_FORM, 32, 60, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_EMESSIAL, MyGlb.PANEL_FORM, 68);
    PAN_INCASSCOMPLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_EMESSIAL, MyGlb.PANEL_FORM, 1);
    PAN_INCASSCOMPLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_EMESSIAL, MyGlb.PANEL_FORM, "Emessi Al");
    PAN_INCASSCOMPLE.SetFieldPage(PFL_INCASSCOMPLE_EMESSIAL, -1, GRP_INCASSCOMPLE_ORDINATIVI);
    PAN_INCASSCOMPLE.SetFieldPanel(PFL_INCASSCOMPLE_EMESSIAL, PPQRY_INCASSCOMPL1, "A.ROWNAMEEMEAL", "ROWNAMEEMEAL", 6, 14, 0, -13997);
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DATA, MyGlb.PANEL_LIST, 184, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DATA, MyGlb.PANEL_LIST, 32);
    PAN_INCASSCOMPLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DATA, MyGlb.PANEL_LIST, 1);
    PAN_INCASSCOMPLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DATA, MyGlb.PANEL_FORM, 32, 116, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DATA, MyGlb.PANEL_FORM, 68);
    PAN_INCASSCOMPLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DATA, MyGlb.PANEL_FORM, 1);
    PAN_INCASSCOMPLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_INCASSCOMPLE.SetFieldPage(PFL_INCASSCOMPLE_DATA, -1, GRP_INCASSCOMPLE_INCASSO);
    PAN_INCASSCOMPLE.SetFieldPanel(PFL_INCASSCOMPLE_DATA, PPQRY_INCASSCOMPL1, "A.ROWNAMEDATA", "ROWNAMEDATA", 6, 14, 0, -13997);
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_NUMERO, MyGlb.PANEL_LIST, 288, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_NUMERO, MyGlb.PANEL_LIST, 48);
    PAN_INCASSCOMPLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_INCASSCOMPLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_NUMERO, MyGlb.PANEL_FORM, 192, 116, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_NUMERO, MyGlb.PANEL_FORM, 52);
    PAN_INCASSCOMPLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_INCASSCOMPLE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_INCASSCOMPLE.SetFieldPage(PFL_INCASSCOMPLE_NUMERO, -1, GRP_INCASSCOMPLE_INCASSO);
    PAN_INCASSCOMPLE.SetFieldPanel(PFL_INCASSCOMPLE_NUMERO, PPQRY_INCASSCOMPL1, "A.ROWNAMENUMER", "ROWNAMENUMER", 1, 10, 0, -13997);
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_ELABORA, MyGlb.PANEL_LIST, 140, 156, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_INCASSCOMPLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_INCASSCOMPLE.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_ELABORA, MyGlb.PANEL_FORM, 248, 160, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSCOMPLE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_INCASSCOMPLE.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSCOMPLE_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_INCASSCOMPLE.SetFieldPage(PFL_INCASSCOMPLE_ELABORA, -1, -1);
    PAN_INCASSCOMPLE.SetFieldPanel(PFL_INCASSCOMPLE_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_INCASSCOMPLE_InitQueries()
  {
    StringBuffer SQL;

    PAN_INCASSCOMPLE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_INCASSCOMPLE.SetIMDB(IMDB, "PQRY_INCASSCOMPL1", true);
    PAN_INCASSCOMPLE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_INCASSCOMPLE.SetQueryIMDB(PPQRY_INCASSCOMPL1, IMDBDef15.PQRY_INCASSCOMPL1_RS, IMDBDef5.TBL_INCASSCOMPLE);
    JustLoaded = true;
    PAN_INCASSCOMPLE.SetFieldPrimaryIndex(PFL_INCASSCOMPLE_DAL, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEDAL);
    PAN_INCASSCOMPLE.SetFieldPrimaryIndex(PFL_INCASSCOMPLE_AL, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEAL);
    PAN_INCASSCOMPLE.SetFieldPrimaryIndex(PFL_INCASSCOMPLE_EMESSIAL, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEEMEAL);
    PAN_INCASSCOMPLE.SetFieldPrimaryIndex(PFL_INCASSCOMPLE_DATA, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMEDATA);
    PAN_INCASSCOMPLE.SetFieldPrimaryIndex(PFL_INCASSCOMPLE_NUMERO, IMDBDef5.FLD_INCASSCOMPLE_ROWNAMENUMER);
    PAN_INCASSCOMPLE.SetMasterTable(0, "INCASSCOMPLE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_INCASSCOMPLE.Status() == 2)
    {
      int oldListQBE = PAN_INCASSCOMPLE.iUseListQBE;
      PAN_INCASSCOMPLE.iUseListQBE = 0;
      PAN_INCASSCOMPLE.PanelCommand(Glb.PCM_SEARCH);
      PAN_INCASSCOMPLE.PanelCommand(Glb.PCM_FIND);
      PAN_INCASSCOMPLE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_INCASSCOMPLE) PAN_INCASSCOMPLE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_INCASSCOMPLE) PAN_INCASSCOMPLE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_INCASSCOMPLE) PAN_INCASSCOMPLE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_INCASSCOMPLE) PAN_INCASSCOMPLE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_INCASSCOMPLE) PAN_INCASSCOMPLE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
