// **********************************************
// Aggiornamento Esigibilita
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornamentoEsigibilita extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_AGGIORESEGIB_DATAREGISTRA = 0;
  private static int PFL_AGGIORESEGIB_GESTPAGAPARZ = 1;
  private static int PFL_AGGIORESEGIB_ELABORA = 2;

  private static int PPQRY_NEWTABLE34 = 0;


  IDPanel PAN_AGGIORESEGIB;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE53(IMDB);
    //
    //
    Init_PQRY_NEWTABLE34(IMDB);
    Init_PQRY_NEWTABLE34_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE53(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_NEWTABLE53, 7);
    IMDB.set_TblCode(IMDBDef2.TBL_NEWTABLE53, "TBL_NEWTABLE53");
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE53,IMDBDef2.FLD_NEWTABLE53_ROWNAMDATREG, "ROWNAMDATREG");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE53,IMDBDef2.FLD_NEWTABLE53_ROWNAMDATREG,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE53,IMDBDef2.FLD_NEWTABLE53_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE53,IMDBDef2.FLD_NEWTABLE53_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE53,IMDBDef2.FLD_NEWTABLE53_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE53,IMDBDef2.FLD_NEWTABLE53_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE53,IMDBDef2.FLD_NEWTABLE53_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE53,IMDBDef2.FLD_NEWTABLE53_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE53,IMDBDef2.FLD_NEWTABLE53_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE53,IMDBDef2.FLD_NEWTABLE53_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE53,IMDBDef2.FLD_NEWTABLE53_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE53,IMDBDef2.FLD_NEWTABLE53_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE53,IMDBDef2.FLD_NEWTABLE53_ROWNAMGEPAPA, "ROWNAMGEPAPA");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE53,IMDBDef2.FLD_NEWTABLE53_ROWNAMGEPAPA,5,1,0);
    IMDB.TblAddNew(IMDBDef2.TBL_NEWTABLE53, 0);
  }

  private static void Init_PQRY_NEWTABLE34(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_NEWTABLE34, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_NEWTABLE34, "PQRY_NEWTABLE34");
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE34,IMDBDef10.PQSL_NEWTABLE34_ROWNAMDATREG, "ROWNAMDATREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE34,IMDBDef10.PQSL_NEWTABLE34_ROWNAMDATREG,6,14,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE34,IMDBDef10.PQSL_NEWTABLE34_ROWNAMGEPAPA, "ROWNAMGEPAPA");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE34,IMDBDef10.PQSL_NEWTABLE34_ROWNAMGEPAPA,5,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_NEWTABLE34, 0);
  }

  private static void Init_PQRY_NEWTABLE34_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_NEWTABLE34_RS, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_NEWTABLE34_RS, "PQRY_NEWTABLE34_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE34_RS,IMDBDef10.PQSL_NEWTABLE34_ROWNAMDATREG, "ROWNAMDATREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE34_RS,IMDBDef10.PQSL_NEWTABLE34_ROWNAMDATREG,6,14,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE34_RS,IMDBDef10.PQSL_NEWTABLE34_ROWNAMGEPAPA, "ROWNAMGEPAPA");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE34_RS,IMDBDef10.PQSL_NEWTABLE34_ROWNAMGEPAPA,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornamentoEsigibilita(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornamentoEsigibilita()
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
    FormIdx = MyGlb.FRM_AGGIORESIGIB;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DDC7E0AC-340A-48BF-8AAC-0478D57D6C25";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 360;
    DesignHeight = 186;
    set_Caption(new IDVariant("Aggiornamento Esigibilita"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 360;
    Frames[1].Height = 160;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Aggiornamento Esegibilita";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 160;
    PAN_AGGIORESEGIB = new IDPanel(w, this, 1, "PAN_AGGIORESEGIB");
    Frames[1].Content = PAN_AGGIORESEGIB;
    PAN_AGGIORESEGIB.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_AGGIORESEGIB.VS = MainFrm.VisualStyleList;
    PAN_AGGIORESEGIB.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 360-MyGlb.PAN_OFFS_X, 160-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_AGGIORESEGIB.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "643CC7A0-EA2C-4872-A49C-3BA8F5738B1B");
    PAN_AGGIORESEGIB.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 320, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_AGGIORESEGIB.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_AGGIORESEGIB.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_AGGIORESEGIB.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_AGGIORESEGIB.InitStatus = 2;
    PAN_AGGIORESEGIB_Init();
    PAN_AGGIORESEGIB_InitFields();
    PAN_AGGIORESEGIB_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_NEWTABLE53, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGIORESIGIB_NEWTABLE34();
      }
      PAN_AGGIORESEGIB.UpdatePanel(MainFrm);
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
    return (obj instanceof AggiornamentoEsigibilita);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornamentoEsigibilita.class.getName() : (Glb.ClassWithPackage(AggiornamentoEsigibilita.class) ? AggiornamentoEsigibilita.class.getName().substring(AggiornamentoEsigibilita.class.getPackage().getName().length() + 1) : AggiornamentoEsigibilita.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      v_CAPTION = (new IDVariant("Aggiornamento Esigibilita'", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMDATREG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMGEPAPA, 0, (new IDVariant("N")));
      set_Caption(new IDVariant(v_CAPTION));
      Frames[PAN_AGGIORESEGIB.FrIndex].set_Caption(new IDVariant(v_CAPTION).stringValue());
      set_bVisualFlag(Glb.FORMVISPROP_CONFIRMBTN, (new IDVariant(0)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoEsigibilita", "LoadEvent", _e);
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
      IDVariant v_ANOMALIA = new IDVariant(0,IDVariant.STRING);
      if ((IMDB.Value(IMDBDef10.PQRY_NEWTABLE34, IMDBDef10.PQSL_NEWTABLE34_ROWNAMDATREG, 0).compareTo(IMDB.Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMEDATDA, 0), true)<0 || IMDB.Value(IMDBDef10.PQRY_NEWTABLE34, IMDBDef10.PQSL_NEWTABLE34_ROWNAMDATREG, 0).compareTo(IMDB.Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMEDATAA, 0), true)>0) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_NEWTABLE34, IMDBDef10.PQSL_NEWTABLE34_ROWNAMDATREG, 0))))
      {
        IDVariant v_ERROR = new IDVariant(0,IDVariant.STRING);
        v_ERROR = (new IDVariant("Data di registrazione non compresa nel periodo richiesto", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERROR); 
      }
      else
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.FATAGGESIGIBILITA(IMDB.Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMEDATDA, 0), IMDB.Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMEDATAA, 0), IMDB.Value(IMDBDef10.PQRY_NEWTABLE34, IMDBDef10.PQSL_NEWTABLE34_ROWNAMDATREG, 0), IMDB.Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMTIPREG, 0), IMDB.Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMTIPBOL, 0), IMDB.Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMEESERC, 0), v_ANOMALIA);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          if (IDL.IsNull(v_ANOMALIA))
          {
            MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
          }
          else
          {
            MainFrm.set_AlertMessage(v_ANOMALIA); 
          }
          ApriEsigibilitaIVAFattureLiquidateParzialmente();
        }
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoEsigibilita", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Esigibilita IVA Fatture Liquidate Parzialmente
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriEsigibilitaIVAFattureLiquidateParzialmente ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Esigibilita IVA Fatture Liquidate Parzialmente Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMGEPAPA, 0).compareTo((new IDVariant("S")), true)!=0)
      {
        return 0;
      }
      if (IMDB.Value(IMDBDef10.PQRY_NEWTABLE34, IMDBDef10.PQSL_NEWTABLE34_ROWNAMGEPAPA, 0).equals((new IDVariant("S")), true))
      {
        // 
        // Se non ci sono dati non apro la videata
        // 
        if ((MainFrm.GetForm(MyGlb.FRM_ESIIVAFALIPA, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_ESIIVAFALIPA,(new IDVariant(0)).booleanValue()); 
        }
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI691, IMDBDef2.FLD_PARAMETRI691_NOMOGGDATREG, 0, IMDB.Value(IMDBDef10.PQRY_NEWTABLE34, IMDBDef10.PQSL_NEWTABLE34_ROWNAMDATREG, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI691, IMDBDef2.FLD_PARAMETRI691_NOMEOGGDATDA, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMEDATDA, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI691, IMDBDef2.FLD_PARAMETRI691_NOMEOGGEDATA, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMEDATAA, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI691, IMDBDef2.FLD_PARAMETRI691_NOMOGGTIPREG, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMTIPREG, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI691, IMDBDef2.FLD_PARAMETRI691_NOMOGGTIPBOL, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMTIPBOL, 0));
        MainFrm.Show(MyGlb.FRM_ESIIVAFALIPA, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoEsigibilita", "ApriEsigibilitaIVAFattureLiquidateParzialmente", _e);
      return -1;
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void AGGIORESIGIB_NEWTABLE34() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_NEWTABLE34_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_NEWTABLE53, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_NEWTABLE53, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_NEWTABLE34_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_NEWTABLE34_RS, 0, IMDBDef2.TBL_NEWTABLE53, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE34_RS, 0, 0, IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMDATREG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE34_RS, 1, 0, IMDBDef2.TBL_NEWTABLE53, IMDBDef2.FLD_NEWTABLE53_ROWNAMGEPAPA, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_NEWTABLE53, 0);
      if (IMDB.Eof(IMDBDef2.TBL_NEWTABLE53, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_NEWTABLE53, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_NEWTABLE34_RS, 0);
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
  private void PAN_AGGIORESEGIB_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_AGGIORESEGIB, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_AGGIORESEGIB_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_AGGIORESEGIB, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_AGGIORESEGIB_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_AGGIORESEGIB);
    // Stub
  }

  private void PAN_AGGIORESEGIB_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_AGGIORESEGIB_ELABORA)
    {
      this.IdxPanelActived = this.PAN_AGGIORESEGIB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_AGGIORESEGIB_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_AGGIORESEGIB_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_AGGIORESEGIB_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_AGGIORESEGIB_Init()
  {

    PAN_AGGIORESEGIB.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_AGGIORESEGIB.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_AGGIORESEGIB.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_AGGIORESEGIB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_DATAREGISTRA, "D4DBFCAD-C42A-4D52-B358-B21BC4FA79CA");
    PAN_AGGIORESEGIB.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_DATAREGISTRA, "Data Registrazione");
    PAN_AGGIORESEGIB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_DATAREGISTRA, "");
    PAN_AGGIORESEGIB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_DATAREGISTRA, MyGlb.VIS_NORMALFIELDS);
    PAN_AGGIORESEGIB.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_DATAREGISTRA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORESEGIB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_GESTPAGAPARZ, "182692B1-2A9B-4E05-BB44-1261017DECBF");
    PAN_AGGIORESEGIB.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_GESTPAGAPARZ, "Gestione Liquidazioni/Pagamenti Parziali");
    PAN_AGGIORESEGIB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_GESTPAGAPARZ, "Descrivi il contenuto del campo");
    PAN_AGGIORESEGIB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_GESTPAGAPARZ, MyGlb.VIS_CHECKSTYLE);
    PAN_AGGIORESEGIB.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_GESTPAGAPARZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AGGIORESEGIB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_ELABORA, "9EC9C285-5837-4FBB-B670-2EC8BEADC278");
    PAN_AGGIORESEGIB.set_Header(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_ELABORA, "Elabora");
    PAN_AGGIORESEGIB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_AGGIORESEGIB.SetImage(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_ELABORA, 0, "button1.gif", false);
    PAN_AGGIORESEGIB.SetFlags(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_AGGIORESEGIB_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_AGGIORESEGIB.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_DATAREGISTRA, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORESEGIB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_DATAREGISTRA, MyGlb.PANEL_LIST, 100);
    PAN_AGGIORESEGIB.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_DATAREGISTRA, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORESEGIB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_DATAREGISTRA, MyGlb.PANEL_LIST, "Data Registrazione");
    PAN_AGGIORESEGIB.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_DATAREGISTRA, MyGlb.PANEL_FORM, 28, 20, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORESEGIB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_DATAREGISTRA, MyGlb.PANEL_FORM, 116);
    PAN_AGGIORESEGIB.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_DATAREGISTRA, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORESEGIB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_DATAREGISTRA, MyGlb.PANEL_FORM, "Data Registrazione");
    PAN_AGGIORESEGIB.SetFieldPage(PFL_AGGIORESEGIB_DATAREGISTRA, -1, -1);
    PAN_AGGIORESEGIB.SetFieldPanel(PFL_AGGIORESEGIB_DATAREGISTRA, PPQRY_NEWTABLE34, "A.ROWNAMDATREG", "ROWNAMDATREG", 6, 14, 0, -13997);
    PAN_AGGIORESEGIB.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_GESTPAGAPARZ, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORESEGIB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_GESTPAGAPARZ, MyGlb.PANEL_LIST, 168);
    PAN_AGGIORESEGIB.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_GESTPAGAPARZ, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORESEGIB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_GESTPAGAPARZ, MyGlb.PANEL_LIST, "Gestione Liquidazioni Pagamenti Parziali");
    PAN_AGGIORESEGIB.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_GESTPAGAPARZ, MyGlb.PANEL_FORM, 28, 48, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORESEGIB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_GESTPAGAPARZ, MyGlb.PANEL_FORM, 236);
    PAN_AGGIORESEGIB.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_GESTPAGAPARZ, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORESEGIB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_GESTPAGAPARZ, MyGlb.PANEL_FORM, "Gestione Liquidazioni/Pagamenti Parziali");
    PAN_AGGIORESEGIB.SetFieldPage(PFL_AGGIORESEGIB_GESTPAGAPARZ, -1, -1);
    PAN_AGGIORESEGIB.SetFieldPanel(PFL_AGGIORESEGIB_GESTPAGAPARZ, PPQRY_NEWTABLE34, "A.ROWNAMGEPAPA", "ROWNAMGEPAPA", 5, 1, 0, -13997);
    PAN_AGGIORESEGIB.SetValueListItem(PFL_AGGIORESEGIB_GESTPAGAPARZ, (new IDVariant("S")), "S", "", "", -1);
    PAN_AGGIORESEGIB.SetValueListItem(PFL_AGGIORESEGIB_GESTPAGAPARZ, (new IDVariant("N")), "N", "", "", -1);
    PAN_AGGIORESEGIB.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_ELABORA, MyGlb.PANEL_LIST, 104, 28, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORESEGIB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_AGGIORESEGIB.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_AGGIORESEGIB.SetRect(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_ELABORA, MyGlb.PANEL_FORM, 256, 88, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AGGIORESEGIB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_AGGIORESEGIB.SetNumRow(MyGlb.OBJ_FIELD, PFL_AGGIORESEGIB_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_AGGIORESEGIB.SetFieldPage(PFL_AGGIORESEGIB_ELABORA, -1, -1);
    PAN_AGGIORESEGIB.SetFieldPanel(PFL_AGGIORESEGIB_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_AGGIORESEGIB_InitQueries()
  {
    StringBuffer SQL;

    PAN_AGGIORESEGIB.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_AGGIORESEGIB.SetIMDB(IMDB, "PQRY_NEWTABLE34", true);
    PAN_AGGIORESEGIB.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_AGGIORESEGIB.SetQueryIMDB(PPQRY_NEWTABLE34, IMDBDef10.PQRY_NEWTABLE34_RS, IMDBDef2.TBL_NEWTABLE53);
    JustLoaded = true;
    PAN_AGGIORESEGIB.SetFieldPrimaryIndex(PFL_AGGIORESEGIB_DATAREGISTRA, IMDBDef2.FLD_NEWTABLE53_ROWNAMDATREG);
    PAN_AGGIORESEGIB.SetFieldPrimaryIndex(PFL_AGGIORESEGIB_GESTPAGAPARZ, IMDBDef2.FLD_NEWTABLE53_ROWNAMGEPAPA);
    PAN_AGGIORESEGIB.SetMasterTable(0, "NEWTABLE53");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_AGGIORESEGIB.Status() == 2)
    {
      int oldListQBE = PAN_AGGIORESEGIB.iUseListQBE;
      PAN_AGGIORESEGIB.iUseListQBE = 0;
      PAN_AGGIORESEGIB.PanelCommand(Glb.PCM_SEARCH);
      PAN_AGGIORESEGIB.PanelCommand(Glb.PCM_FIND);
      PAN_AGGIORESEGIB.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_AGGIORESEGIB) PAN_AGGIORESEGIB_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_AGGIORESEGIB) PAN_AGGIORESEGIB_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_AGGIORESEGIB) PAN_AGGIORESEGIB_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_AGGIORESEGIB) PAN_AGGIORESEGIB_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_AGGIORESEGIB) PAN_AGGIORESEGIB_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
