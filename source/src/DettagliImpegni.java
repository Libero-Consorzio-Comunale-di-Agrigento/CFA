// **********************************************
// Dettagli Impegni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DettagliImpegni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_DETTAGIMPEGN_PROGR = 0;
  private static int PFL_DETTAGIMPEGN_NUMEROIMP = 1;
  private static int PFL_DETTAGIMPEGN_ANNOIMP = 2;
  private static int PFL_DETTAGIMPEGN_NUMEROSUBIMP = 3;
  private static int PFL_DETTAGIMPEGN_ANNOSUBIMP = 4;
  private static int PFL_DETTAGIMPEGN_IMPUTATO = 5;
  private static int PFL_DETTAGIMPEGN_IMPEGNO = 6;
  private static int PFL_DETTAGIMPEGN_SUBIMPEGNO = 7;
  private static int PFL_DETTAGIMPEGN_IMPORTO = 8;

  private static int PPQRY_FATTUREBUON1 = 0;


  IDPanel PAN_DETTAGIMPEGN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FATTURE(IMDB);
    Init_TBL_PROG(IMDB);
    //
    //
    Init_PQRY_FATTUREBUON1(IMDB);
    Init_PQRY_FATTUREBUON1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FATTURE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_FATTURE, 6);
    IMDB.set_TblCode(IMDBDef2.TBL_FATTURE, "TBL_FATTURE");
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURE,IMDBDef2.FLD_FATTURE_FATTURPROGRE, "FATTURPROGRE");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURE,IMDBDef2.FLD_FATTURE_FATTURPROGRE,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURE,IMDBDef2.FLD_FATTURE_FATTUNUMEIMP, "FATTUNUMEIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURE,IMDBDef2.FLD_FATTURE_FATTUNUMEIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURE,IMDBDef2.FLD_FATTURE_FATTUANNOIMP, "FATTUANNOIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURE,IMDBDef2.FLD_FATTURE_FATTUANNOIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURE,IMDBDef2.FLD_FATTURE_FATNUMSUBIMP, "FATNUMSUBIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURE,IMDBDef2.FLD_FATTURE_FATNUMSUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURE,IMDBDef2.FLD_FATTURE_FATANNSUBIMP, "FATANNSUBIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURE,IMDBDef2.FLD_FATTURE_FATANNSUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FATTURE,IMDBDef2.FLD_FATTURE_FATTURIMPUTA, "FATTURIMPUTA");
    IMDB.SetFldParams(IMDBDef2.TBL_FATTURE,IMDBDef2.FLD_FATTURE_FATTURIMPUTA,3,14,2);
  }

  private static void Init_TBL_PROG(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PROG, 6);
    IMDB.set_TblCode(IMDBDef2.TBL_PROG, "TBL_PROG");
    IMDB.set_FldCode(IMDBDef2.TBL_PROG,IMDBDef2.FLD_PROG_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PROG,IMDBDef2.FLD_PROG_ROWNAMANNPRO,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PROG,IMDBDef2.FLD_PROG_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PROG,IMDBDef2.FLD_PROG_ROWNAMNUMPRO,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PROG,IMDBDef2.FLD_PROG_ROWNAMELIQUI, "ROWNAMELIQUI");
    IMDB.SetFldParams(IMDBDef2.TBL_PROG,IMDBDef2.FLD_PROG_ROWNAMELIQUI,3,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PROG,IMDBDef2.FLD_PROG_ROWNAMANNBUO, "ROWNAMANNBUO");
    IMDB.SetFldParams(IMDBDef2.TBL_PROG,IMDBDef2.FLD_PROG_ROWNAMANNBUO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PROG,IMDBDef2.FLD_PROG_ROWNAMNUMBUO, "ROWNAMNUMBUO");
    IMDB.SetFldParams(IMDBDef2.TBL_PROG,IMDBDef2.FLD_PROG_ROWNAMNUMBUO,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PROG,IMDBDef2.FLD_PROG_ROWNAMPROBUO, "ROWNAMPROBUO");
    IMDB.SetFldParams(IMDBDef2.TBL_PROG,IMDBDef2.FLD_PROG_ROWNAMPROBUO,1,3,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PROG, 0);
  }

  private static void Init_PQRY_FATTUREBUON1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FATTUREBUON1, 6);
    IMDB.set_TblCode(IMDBDef10.PQRY_FATTUREBUON1, "PQRY_FATTUREBUON1");
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON1,IMDBDef10.PQSL_FATTUREBUON1_FATTURPROGRE, "FATTURPROGRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON1,IMDBDef10.PQSL_FATTUREBUON1_FATTURPROGRE,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON1,IMDBDef10.PQSL_FATTUREBUON1_FATTUNUMEIMP, "FATTUNUMEIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON1,IMDBDef10.PQSL_FATTUREBUON1_FATTUNUMEIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON1,IMDBDef10.PQSL_FATTUREBUON1_FATTUANNOIMP, "FATTUANNOIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON1,IMDBDef10.PQSL_FATTUREBUON1_FATTUANNOIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON1,IMDBDef10.PQSL_FATTUREBUON1_FATNUMSUBIMP, "FATNUMSUBIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON1,IMDBDef10.PQSL_FATTUREBUON1_FATNUMSUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON1,IMDBDef10.PQSL_FATTUREBUON1_FATANNSUBIMP, "FATANNSUBIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON1,IMDBDef10.PQSL_FATTUREBUON1_FATANNSUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON1,IMDBDef10.PQSL_FATTUREBUON1_FATTURIMPUTA, "FATTURIMPUTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON1,IMDBDef10.PQSL_FATTUREBUON1_FATTURIMPUTA,3,14,2);
    IMDB.TblAddNew(IMDBDef10.PQRY_FATTUREBUON1, 0);
  }

  private static void Init_PQRY_FATTUREBUON1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FATTUREBUON1_RS, 6);
    IMDB.set_TblCode(IMDBDef10.PQRY_FATTUREBUON1_RS, "PQRY_FATTUREBUON1_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON1_RS,IMDBDef10.PQSL_FATTUREBUON1_FATTURPROGRE, "FATTURPROGRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON1_RS,IMDBDef10.PQSL_FATTUREBUON1_FATTURPROGRE,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON1_RS,IMDBDef10.PQSL_FATTUREBUON1_FATTUNUMEIMP, "FATTUNUMEIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON1_RS,IMDBDef10.PQSL_FATTUREBUON1_FATTUNUMEIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON1_RS,IMDBDef10.PQSL_FATTUREBUON1_FATTUANNOIMP, "FATTUANNOIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON1_RS,IMDBDef10.PQSL_FATTUREBUON1_FATTUANNOIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON1_RS,IMDBDef10.PQSL_FATTUREBUON1_FATNUMSUBIMP, "FATNUMSUBIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON1_RS,IMDBDef10.PQSL_FATTUREBUON1_FATNUMSUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON1_RS,IMDBDef10.PQSL_FATTUREBUON1_FATANNSUBIMP, "FATANNSUBIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON1_RS,IMDBDef10.PQSL_FATTUREBUON1_FATANNSUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON1_RS,IMDBDef10.PQSL_FATTUREBUON1_FATTURIMPUTA, "FATTURIMPUTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON1_RS,IMDBDef10.PQSL_FATTUREBUON1_FATTURIMPUTA,3,14,2);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DettagliImpegni(MyWebEntryPoint w, IMDBObj imdb)
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
  public DettagliImpegni()
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
    FormIdx = MyGlb.FRM_DETTAGIMPEGN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A02BC668-920C-437A-AEE1-1715574BF694";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 516;
    DesignHeight = 406;
    set_Caption(new IDVariant("Dettagli Impegni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 516;
    Frames[1].Height = 380;
    Frames[1].Caption = "Dettagli Impegni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 380;
    PAN_DETTAGIMPEGN = new IDPanel(w, this, 1, "PAN_DETTAGIMPEGN");
    Frames[1].Content = PAN_DETTAGIMPEGN;
    PAN_DETTAGIMPEGN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGIMPEGN.VS = MainFrm.VisualStyleList;
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 516-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DETTAGIMPEGN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CCAEF4BE-8037-4B54-A3C1-4C1A1F141B99");
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 36, 356, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGIMPEGN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGIMPEGN.InitStatus = 2;
    PAN_DETTAGIMPEGN_Init();
    PAN_DETTAGIMPEGN_InitFields();
    PAN_DETTAGIMPEGN_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_FATTURE, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DETTAGIMPEGN_FATTUREBUON1();
      }
      PAN_DETTAGIMPEGN.UpdatePanel(MainFrm);
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
    return (obj instanceof DettagliImpegni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DettagliImpegni.class.getName() : (Glb.ClassWithPackage(DettagliImpegni.class) ? DettagliImpegni.class.getName().substring(DettagliImpegni.class.getPackage().getName().length() + 1) : DettagliImpegni.class.getName()));
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
      v_CAPTION = (new IDVariant("Importo: ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_DETTAGIMPEGN.set_FieldText(PFL_DETTAGIMPEGN_IMPORTO, IDL.Add(v_CAPTION, IDL.Format(IDL.NullValue(IMDB.Value(IMDBDef2.TBL_PROG, IMDBDef2.FLD_PROG_ROWNAMELIQUI, 0),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_DETTAGIMPEGN.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      RiempiFatture();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliImpegni", "LoadEvent", _e);
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
    int CurPos=0;
    IDCachedRowSet C6;

    try
    {
      TransCount = 0;
      // 
      // Unload Event Body
      // Procedure Body
      // 
      if (Confirm.booleanValue())
      {
        if (IMDB.Value(IMDBDef2.TBL_PROG, IMDBDef2.FLD_PROG_ROWNAMELIQUI, 0).compareTo(PAN_DETTAGIMPEGN.GetFieldSum(PFL_DETTAGIMPEGN_IMPUTATO), true)!=0)
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("Somma degli importi diversa dal liquidabile", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
        MainFrm.Cf4armDBObject.BeginTrans();
        try
        {
          PAN_DETTAGIMPEGN.PanelCommand(Glb.PCM_UPDATE);
          IMDB.TblMoveFirst (IMDBDef10.PQRY_FATTUREBUON1_RS, 0);
          while (!IMDB.Eof(IMDBDef10.PQRY_FATTUREBUON1_RS, 0))
          {
            IDVariant v_IMPUTATO = new IDVariant(0,IDVariant.DECIMAL);
            IDVariant v_PROGRESSIVO = new IDVariant(0,IDVariant.INTEGER);
            v_IMPUTATO = new IDVariant(IMDB.Value(IMDBDef10.PQRY_FATTUREBUON1_RS, IMDBDef10.PQSL_FATTUREBUON1_FATTURIMPUTA, 0));
            v_PROGRESSIVO = new IDVariant(IMDB.Value(IMDBDef10.PQRY_FATTUREBUON1_RS, IMDBDef10.PQSL_FATTUREBUON1_FATTURPROGRE, 0));
            SQL = new StringBuffer();
            SQL.append("update FATTURE_BUONI set ");
            SQL.append("  IMPUTATO = " + IDL.CSql(v_IMPUTATO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append("where (PROGRESSIVO = " + IDL.CSql(v_PROGRESSIVO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            if (IDL.IsNull(IMDB.Value(IMDBDef2.TBL_FILTRO3, IMDBDef2.FLD_FILTRO3_ROWNAMLIQMOD, 0)))
            {
              IMDB.set_Value(IMDBDef2.TBL_FILTRO3, IMDBDef2.FLD_FILTRO3_ROWNAMLIQMOD, 0, (new IDVariant(1)));
            }
            IMDB.TblMoveNext(IMDBDef10.PQRY_FATTUREBUON1_RS, 0);
          }
        }
        catch (Exception e8)
        {
          MainFrm.set_AlertMessage(new IDVariant(e8.getMessage())); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          return;
        }
        MainFrm.Cf4armDBObject.CommitTrans();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliImpegni", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Riempi Fatture
  // **********************************************************************
  public int RiempiFatture ()
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
      // Riempi Fatture Body
      // Procedure Body
      // 
      RIEMPIFATTUR_FATTDELEROWS();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGRESSIVO as FATTBUONPROG, ");
      SQL.append("  B.NUMERO_IMP as DETIMPBUNUIM, ");
      SQL.append("  B.ANNO_IMP as DETIMPBUANIM, ");
      SQL.append("  B.NUMERO_SUBIMP as DETIMPBUNUSU, ");
      SQL.append("  B.ANNO_SUBIMP as DETIMPBUANSU, ");
      SQL.append("  A.IMPUTATO as FATTBUONIMPU ");
      SQL.append("from ");
      SQL.append("  FATTURE_BUONI A, ");
      SQL.append("  DETTAGLI_IMPEGNI_BUONI B ");
      SQL.append("where (A.ANNO_BUONO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PROG, IMDBDef2.FLD_PROG_ROWNAMANNBUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_BUONO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PROG, IMDBDef2.FLD_PROG_ROWNAMNUMBUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGRESSIVO_BUONO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PROG, IMDBDef2.FLD_PROG_ROWNAMPROBUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PROG, IMDBDef2.FLD_PROG_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PROG, IMDBDef2.FLD_PROG_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO_BUONO = B.ANNO_BUONO(+)) ");
      SQL.append("and   (A.NUMERO_BUONO = B.NUMERO_BUONO(+)) ");
      SQL.append("and   (A.PROGRESSIVO_BUONO = B.PROGRESSIVO_BUONO(+)) ");
      SQL.append("and   (A.PROGRESSIVO_IMP = B.PROGRESSIVO_IMP(+)) ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        RIEMPIFATTUR_FATTINSEVALU(C2.Get("FATTBUONPROG"), C2.Get("DETIMPBUNUIM"), C2.Get("DETIMPBUANIM"), C2.Get("DETIMPBUNUSU"), C2.Get("DETIMPBUANSU"), C2.Get("FATTBUONIMPU"));
        C2.MoveNext();
      }
      C2.Close();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliImpegni", "RiempiFatture", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Fatture: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void RIEMPIFATTUR_FATTDELEROWS() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef2.TBL_FATTURE);
  }

  // **********************************************************************
  // Fatture: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void RIEMPIFATTUR_FATTINSEVALU(IDVariant C2_FATTBUONPROG, IDVariant C2_DETIMPBUNUIM, IDVariant C2_DETIMPBUANIM, IDVariant C2_DETIMPBUNUSU, IDVariant C2_DETIMPBUANSU, IDVariant C2_FATTBUONIMPU) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef2.TBL_FATTURE, 0);
    IMDB.set_Value(IMDBDef2.TBL_FATTURE, IMDBDef2.FLD_FATTURE_FATTURPROGRE, 0, C2_FATTBUONPROG);
    IMDB.set_Value(IMDBDef2.TBL_FATTURE, IMDBDef2.FLD_FATTURE_FATTUNUMEIMP, 0, C2_DETIMPBUNUIM);
    IMDB.set_Value(IMDBDef2.TBL_FATTURE, IMDBDef2.FLD_FATTURE_FATTUANNOIMP, 0, C2_DETIMPBUANIM);
    IMDB.set_Value(IMDBDef2.TBL_FATTURE, IMDBDef2.FLD_FATTURE_FATNUMSUBIMP, 0, C2_DETIMPBUNUSU);
    IMDB.set_Value(IMDBDef2.TBL_FATTURE, IMDBDef2.FLD_FATTURE_FATANNSUBIMP, 0, C2_DETIMPBUANSU);
    IMDB.set_Value(IMDBDef2.TBL_FATTURE, IMDBDef2.FLD_FATTURE_FATTURIMPUTA, 0, C2_FATTBUONIMPU);
  }

  // **********************************************************************
  // FATTURE BUONI
  // Primary record source for panel data
  // **********************************************************************
  private void DETTAGIMPEGN_FATTUREBUON1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_FATTUREBUON1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_FATTURE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_FATTURE, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_FATTUREBUON1_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_FATTUREBUON1_RS, 0, IMDBDef2.TBL_FATTURE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FATTUREBUON1_RS, 0, 0, IMDBDef2.TBL_FATTURE, IMDBDef2.FLD_FATTURE_FATTURPROGRE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FATTUREBUON1_RS, 1, 0, IMDBDef2.TBL_FATTURE, IMDBDef2.FLD_FATTURE_FATTUNUMEIMP, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FATTUREBUON1_RS, 2, 0, IMDBDef2.TBL_FATTURE, IMDBDef2.FLD_FATTURE_FATTUANNOIMP, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FATTUREBUON1_RS, 3, 0, IMDBDef2.TBL_FATTURE, IMDBDef2.FLD_FATTURE_FATNUMSUBIMP, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FATTUREBUON1_RS, 4, 0, IMDBDef2.TBL_FATTURE, IMDBDef2.FLD_FATTURE_FATANNSUBIMP, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FATTUREBUON1_RS, 5, 0, IMDBDef2.TBL_FATTURE, IMDBDef2.FLD_FATTURE_FATTURIMPUTA, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_FATTURE, 0);
      if (IMDB.Eof(IMDBDef2.TBL_FATTURE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_FATTURE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef10.PQRY_FATTUREBUON1_RS);
    IMDB.TblSortBy(IMDBDef10.PQRY_FATTUREBUON1_RS,0,true);
    IMDB.TblStartSort(IMDBDef10.PQRY_FATTUREBUON1_RS);
    IMDB.TblMoveFirst(IMDBDef10.PQRY_FATTUREBUON1_RS, 0);
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
  private void PAN_DETTAGIMPEGN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTAGIMPEGN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGIMPEGN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGIMPEGN, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGIMPEGN_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DETTAGIMPEGN);
    // Stub
  }

  private void PAN_DETTAGIMPEGN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DETTAGIMPEGN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGIMPEGN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGIMPEGN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DETTAGIMPEGN_Init()
  {

    PAN_DETTAGIMPEGN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGIMPEGN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DETTAGIMPEGN.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_DETTAGIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_PROGR, "747D86CD-D888-464C-B235-7C642D7470EA");
    PAN_DETTAGIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_PROGR, "Progr.");
    PAN_DETTAGIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_PROGR, "");
    PAN_DETTAGIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_PROGR, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_PROGR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROIMP, "2F16562A-650F-4EDB-85D8-F6DEC86DB7C4");
    PAN_DETTAGIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROIMP, "NUMERO IMP");
    PAN_DETTAGIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROIMP, "");
    PAN_DETTAGIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOIMP, "B18F7314-D76C-403B-AEDC-8C66088BADD2");
    PAN_DETTAGIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOIMP, "ANNO IMP");
    PAN_DETTAGIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOIMP, "");
    PAN_DETTAGIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROSUBIMP, "C450F679-1298-4271-A305-483B14B9FBD9");
    PAN_DETTAGIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_DETTAGIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROSUBIMP, "");
    PAN_DETTAGIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOSUBIMP, "BD5C01C2-5391-4154-B7F1-9BD319C1BF3F");
    PAN_DETTAGIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_DETTAGIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOSUBIMP, "");
    PAN_DETTAGIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPUTATO, "F616D759-1AC8-4927-B8F5-6FCB7AAAC1F3");
    PAN_DETTAGIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPUTATO, "Imputato");
    PAN_DETTAGIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPUTATO, "");
    PAN_DETTAGIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPUTATO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPUTATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPEGNO, "643F0D95-0704-4736-9CD0-970DDB7C81DC");
    PAN_DETTAGIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPEGNO, "Impegno");
    PAN_DETTAGIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_SUBIMPEGNO, "87A854FD-7058-46CF-AED4-30C30FDE2FA3");
    PAN_DETTAGIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_SUBIMPEGNO, "Subimpegno");
    PAN_DETTAGIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_SUBIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_SUBIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPORTO, "1771ABCF-E086-4E0E-8CD6-6BA30D287DEE");
    PAN_DETTAGIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPORTO, "");
    PAN_DETTAGIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPORTO, MyGlb.VIS_ETICHEGRASSE);
    PAN_DETTAGIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DETTAGIMPEGN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_PROGR, MyGlb.PANEL_LIST, 0, 72, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_PROGR, MyGlb.PANEL_LIST, 80);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_PROGR, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_PROGR, MyGlb.PANEL_LIST, "Progr.");
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_PROGR, MyGlb.PANEL_FORM, 4, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_PROGR, MyGlb.PANEL_FORM, 136);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_PROGR, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_PROGR, MyGlb.PANEL_FORM, "Progr.");
    PAN_DETTAGIMPEGN.SetFieldPage(PFL_DETTAGIMPEGN_PROGR, -1, -1);
    PAN_DETTAGIMPEGN.SetFieldPanel(PFL_DETTAGIMPEGN_PROGR, PPQRY_FATTUREBUON1, "A.FATTURPROGRE", "FATTURPROGRE", 1, 10, 0, -13997);
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 44, 72, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, "NUMERO IMP");
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 4, 28, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_DETTAGIMPEGN.SetFieldPage(PFL_DETTAGIMPEGN_NUMEROIMP, -1, -1);
    PAN_DETTAGIMPEGN.SetFieldPanel(PFL_DETTAGIMPEGN_NUMEROIMP, PPQRY_FATTUREBUON1, "A.FATTUNUMEIMP", "FATTUNUMEIMP", 1, 5, 0, -13997);
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 100, 72, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 4, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_DETTAGIMPEGN.SetFieldPage(PFL_DETTAGIMPEGN_ANNOIMP, -1, -1);
    PAN_DETTAGIMPEGN.SetFieldPanel(PFL_DETTAGIMPEGN_ANNOIMP, PPQRY_FATTUREBUON1, "A.FATTUANNOIMP", "FATTUANNOIMP", 1, 4, 0, -13997);
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_LIST, 152, 72, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUMERO SUBIMP");
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 76, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_DETTAGIMPEGN.SetFieldPage(PFL_DETTAGIMPEGN_NUMEROSUBIMP, -1, -1);
    PAN_DETTAGIMPEGN.SetFieldPanel(PFL_DETTAGIMPEGN_NUMEROSUBIMP, PPQRY_FATTUREBUON1, "A.FATNUMSUBIMP", "FATNUMSUBIMP", 1, 5, 0, -13997);
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, 208, 72, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANNO SUBIMP");
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 100, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_DETTAGIMPEGN.SetFieldPage(PFL_DETTAGIMPEGN_ANNOSUBIMP, -1, -1);
    PAN_DETTAGIMPEGN.SetFieldPanel(PFL_DETTAGIMPEGN_ANNOSUBIMP, PPQRY_FATTUREBUON1, "A.FATANNSUBIMP", "FATANNSUBIMP", 1, 4, 0, -13997);
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPUTATO, MyGlb.PANEL_LIST, 260, 72, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPUTATO, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPUTATO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPUTATO, MyGlb.PANEL_LIST, "Imputato");
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPUTATO, MyGlb.PANEL_FORM, 4, 124, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPUTATO, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPUTATO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPUTATO, MyGlb.PANEL_FORM, "Imputato");
    PAN_DETTAGIMPEGN.SetFieldPage(PFL_DETTAGIMPEGN_IMPUTATO, -1, -1);
    PAN_DETTAGIMPEGN.SetFieldPanel(PFL_DETTAGIMPEGN_IMPUTATO, PPQRY_FATTUREBUON1, "A.FATTURIMPUTA", "FATTURIMPUTA", 3, 14, 2, -13997);
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 44, 36, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 40, 0, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGIMPEGN.SetFieldPage(PFL_DETTAGIMPEGN_IMPEGNO, -1, -1);
    PAN_DETTAGIMPEGN.SetFieldPanel(PFL_DETTAGIMPEGN_IMPEGNO, -1, "", "IMPEGNO", 0, 0, 0, -13997);
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_SUBIMPEGNO, MyGlb.PANEL_LIST, 152, 36, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_SUBIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_SUBIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_SUBIMPEGNO, MyGlb.PANEL_FORM, 48, 8, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_SUBIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_SUBIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGIMPEGN.SetFieldPage(PFL_DETTAGIMPEGN_SUBIMPEGNO, -1, -1);
    PAN_DETTAGIMPEGN.SetFieldPanel(PFL_DETTAGIMPEGN_SUBIMPEGNO, -1, "", "SUBIMPEGNO", 0, 0, 0, -13997);
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 0, 4, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 0, 0, 340, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGIMPEGN.SetFieldPage(PFL_DETTAGIMPEGN_IMPORTO, -1, -1);
    PAN_DETTAGIMPEGN.SetFieldPanel(PFL_DETTAGIMPEGN_IMPORTO, -1, "", "IMPORTO", 0, 0, 0, -13997);
  }

  private void PAN_DETTAGIMPEGN_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGIMPEGN.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DETTAGIMPEGN.SetIMDB(IMDB, "PQRY_FATTUREBUON1", true);
    PAN_DETTAGIMPEGN.set_SetString(MyGlb.MASTER_ROWNAME, "FATTURE BUONI");
    PAN_DETTAGIMPEGN.SetQueryIMDB(PPQRY_FATTUREBUON1, IMDBDef10.PQRY_FATTUREBUON1_RS, IMDBDef2.TBL_FATTURE);
    JustLoaded = true;
    PAN_DETTAGIMPEGN.SetFieldPrimaryIndex(PFL_DETTAGIMPEGN_PROGR, IMDBDef2.FLD_FATTURE_FATTURPROGRE);
    PAN_DETTAGIMPEGN.SetFieldPrimaryIndex(PFL_DETTAGIMPEGN_NUMEROIMP, IMDBDef2.FLD_FATTURE_FATTUNUMEIMP);
    PAN_DETTAGIMPEGN.SetFieldPrimaryIndex(PFL_DETTAGIMPEGN_ANNOIMP, IMDBDef2.FLD_FATTURE_FATTUANNOIMP);
    PAN_DETTAGIMPEGN.SetFieldPrimaryIndex(PFL_DETTAGIMPEGN_NUMEROSUBIMP, IMDBDef2.FLD_FATTURE_FATNUMSUBIMP);
    PAN_DETTAGIMPEGN.SetFieldPrimaryIndex(PFL_DETTAGIMPEGN_ANNOSUBIMP, IMDBDef2.FLD_FATTURE_FATANNSUBIMP);
    PAN_DETTAGIMPEGN.SetFieldPrimaryIndex(PFL_DETTAGIMPEGN_IMPUTATO, IMDBDef2.FLD_FATTURE_FATTURIMPUTA);
    PAN_DETTAGIMPEGN.SetMasterTable(0, "FATTURE");
    PAN_DETTAGIMPEGN.AddToSortList(PFL_DETTAGIMPEGN_PROGR, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGIMPEGN.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGIMPEGN.iUseListQBE;
      PAN_DETTAGIMPEGN.iUseListQBE = 0;
      PAN_DETTAGIMPEGN.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGIMPEGN.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGIMPEGN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DETTAGIMPEGN) PAN_DETTAGIMPEGN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGIMPEGN) PAN_DETTAGIMPEGN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTAGIMPEGN) PAN_DETTAGIMPEGN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGIMPEGN) PAN_DETTAGIMPEGN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DETTAGIMPEGN) PAN_DETTAGIMPEGN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
