// **********************************************
// Situazione Proposte Variazioni Riacc
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneProposteVariazioniRiacc extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRIELE_PARTE = 0;
  private static int PFL_PARAMETRIELE_UNITAORGANIZ = 1;
  private static int PFL_PARAMETRIELE_PERIODORIACC = 2;
  private static int PFL_PARAMETRIELE_ESERCIZIORIF = 3;
  private static int PFL_PARAMETRIELE_PERIODO = 4;
  private static int PFL_PARAMETRIELE_ETICHEELABOR = 5;
  private static int PFL_PARAMETRIELE_IMPORTORAG = 6;
  private static int PFL_PARAMETRIELE_ORDINAMENTO = 7;
  private static int PFL_PARAMETRIELE_DETTSUBIMP = 8;

  private static int PPQRY_PARAMETRIEL1 = 0;

  private static int PPQRY_PERIODRIACCE = 1;

  private static int PPQRY_CF4WEBSTRUTT = 2;


  IDPanel PAN_PARAMETRIELE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRIELE(IMDB);
    //
    //
    Init_PQRY_PARAMETRIEL1(IMDB);
    Init_PQRY_PARAMETRIEL1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRIELE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRIELE, 11);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRIELE, "TBL_PARAMETRIELE");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMOGGESERIF, "NOMOGGESERIF");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMOGGESERIF,1,9,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMOGGUNIORG, "NOMOGGUNIORG");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMOGGUNIORG,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMOGGTIPDIS, "NOMOGGTIPDIS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMOGGTIPDIS,5,50,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMOGGDIDAGE, "NOMOGGDIDAGE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMOGGDIDAGE,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMEOGGDATAL, "NOMEOGGDATAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMEOGGDATAL,7,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMEOGGEPART, "NOMEOGGEPART");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMEOGGEPART,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMOGGIMPRAG, "NOMOGGIMPRAG");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMOGGIMPRAG,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMEOGGEORDI, "NOMEOGGEORDI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMEOGGEORDI,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMOGGDETSUB, "NOMOGGDETSUB");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOMOGGDETSUB,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOOGTICADIFI, "NOOGTICADIFI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRIELE,IMDBDef5.FLD_PARAMETRIELE_NOOGTICADIFI,5,50,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRIELE, 0);
  }

  private static void Init_PQRY_PARAMETRIEL1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRIEL1, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRIEL1, "PQRY_PARAMETRIEL1");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL1,IMDBDef14.PQSL_PARAMETRIEL1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL1,IMDBDef14.PQSL_PARAMETRIEL1_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL1,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGESERIF, "NOMOGGESERIF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL1,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGESERIF,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL1,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGUNIORG, "NOMOGGUNIORG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL1,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGUNIORG,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL1,IMDBDef14.PQSL_PARAMETRIEL1_NOMEOGGEPART, "NOMEOGGEPART");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL1,IMDBDef14.PQSL_PARAMETRIEL1_NOMEOGGEPART,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL1,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGIMPRAG, "NOMOGGIMPRAG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL1,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGIMPRAG,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL1,IMDBDef14.PQSL_PARAMETRIEL1_NOMEOGGEORDI, "NOMEOGGEORDI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL1,IMDBDef14.PQSL_PARAMETRIEL1_NOMEOGGEORDI,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL1,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGDETSUB, "NOMOGGDETSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL1,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGDETSUB,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRIEL1, 0);
  }

  private static void Init_PQRY_PARAMETRIEL1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRIEL1_RS, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRIEL1_RS, "PQRY_PARAMETRIEL1_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL1_RS,IMDBDef14.PQSL_PARAMETRIEL1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL1_RS,IMDBDef14.PQSL_PARAMETRIEL1_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL1_RS,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGESERIF, "NOMOGGESERIF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL1_RS,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGESERIF,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL1_RS,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGUNIORG, "NOMOGGUNIORG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL1_RS,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGUNIORG,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL1_RS,IMDBDef14.PQSL_PARAMETRIEL1_NOMEOGGEPART, "NOMEOGGEPART");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL1_RS,IMDBDef14.PQSL_PARAMETRIEL1_NOMEOGGEPART,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL1_RS,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGIMPRAG, "NOMOGGIMPRAG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL1_RS,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGIMPRAG,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL1_RS,IMDBDef14.PQSL_PARAMETRIEL1_NOMEOGGEORDI, "NOMEOGGEORDI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL1_RS,IMDBDef14.PQSL_PARAMETRIEL1_NOMEOGGEORDI,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRIEL1_RS,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGDETSUB, "NOMOGGDETSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRIEL1_RS,IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGDETSUB,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneProposteVariazioniRiacc(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneProposteVariazioniRiacc()
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
    FormIdx = MyGlb.FRM_SITPROVARRIA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "37CDC6F2-C3A9-4D22-A1CA-8847C6DC2967";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 636;
    DesignHeight = 218;
    set_Caption(new IDVariant("Situazione Proposte"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 636;
    Frames[1].Height = 192;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametrieleprm";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 192;
    PAN_PARAMETRIELE = new IDPanel(w, this, 1, "PAN_PARAMETRIELE");
    Frames[1].Content = PAN_PARAMETRIELE;
    PAN_PARAMETRIELE.Lockable = false;
    PAN_PARAMETRIELE.iLocked = false;
    PAN_PARAMETRIELE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRIELE.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 636-MyGlb.PAN_OFFS_X, 192-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FFD5789E-FB55-40EA-8472-55C261755677");
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 964, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRIELE.InitStatus = 2;
    PAN_PARAMETRIELE_Init();
    PAN_PARAMETRIELE_InitFields();
    PAN_PARAMETRIELE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRIELE, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITPROVARRIA_PARAMETRIEL1();
      }
      PAN_PARAMETRIELE.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELPERIRIAC && flRis && IdxPanelActived == PAN_PARAMETRIELE.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRIELE_PERIODO) {
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
    return (obj instanceof SituazioneProposteVariazioniRiacc);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneProposteVariazioniRiacc.class.getName() : (Glb.ClassWithPackage(SituazioneProposteVariazioniRiacc.class) ? SituazioneProposteVariazioniRiacc.class.getName().substring(SituazioneProposteVariazioniRiacc.class.getPackage().getName().length() + 1) : SituazioneProposteVariazioniRiacc.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametrieleprm On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRIELE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametrieleprm On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRIELE_PARTE)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGUNIORG, 0, (new IDVariant(-1)));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGDETSUB, 0, (new IDVariant("NO")));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRIELE_UNITAORGANIZ)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGUNIORG, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGUNIORG, 0, (new IDVariant(-1)));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRIELE_PERIODORIACC)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_CODICE, 0))))
        {
          IDVariant v_VPERIRIACTIP = new IDVariant(0,IDVariant.STRING);
          IDVariant v_VPERRIAFILDI = new IDVariant(0,IDVariant.STRING);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.TIPO as PERIRIACTIPO, ");
          SQL.append("  A.FILTRO_DISP as PERRIAFILDIS ");
          SQL.append("from ");
          SQL.append("  PERIODI_RIACCERTAMENTI A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VPERIRIACTIP = QV.Get("PERIRIACTIPO", IDVariant.STRING) ;
            v_VPERRIAFILDI = QV.Get("PERRIAFILDIS", IDVariant.STRING) ;
          }
          QV.Close();
          if (v_VPERIRIACTIP.equals((new IDVariant("CONS")), true))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGESERIF, 0, IDL.Sub(IDL.Year(IDL.Today()), (new IDVariant(1))));
          }
          else
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGESERIF, 0, IDL.Year(IDL.Today()));
          }
          if (IDL.NullValue(v_VPERRIAFILDI,(new IDVariant("DISP_31_12"))).equals((new IDVariant("DISP_31_12")), true))
          {
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGTIPDIS, 0, (new IDVariant("FIN")));
          }
          else
          {
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGTIPDIS, 0, (new IDVariant("EFF")));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProposteVariazioniRiacc", "ParametrieleprmOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Parametrieleprm On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRIELE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRIELE);
      // 
      // Parametrieleprm On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMEOGGEPART, 0).equals((new IDVariant("S")), true))
      {
        PAN_PARAMETRIELE.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRIELE.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProposteVariazioniRiacc", "ParametrieleprmOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Periodo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Periodo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Periodo Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELPERIRIAC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProposteVariazioniRiacc", "Periodo", _e);
      return -1;
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
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELPERIRIAC)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_CODICE, 0, IMDB.Value(IMDBDef8.PQRY_PERIODRIACC1, IMDBDef8.PQSL_PERIODRIACC1_PERIRIACCODI, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProposteVariazioniRiacc", "EndModal", _e);
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
      MainFrm.ErrObj.ProcError ("SituazioneProposteVariazioniRiacc", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametrieleprm: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_CODICE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGESERIF, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGUNIORG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGTIPDIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGDIDAGE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMEOGGDATAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMEOGGEPART, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGIMPRAG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMEOGGEORDI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGDETSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOOGTICADIFI, 0, new IDVariant());
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
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VCODICEPERIO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VANNO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VPERRIAFILDI = new IDVariant(0,IDVariant.STRING);
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGUNIORG, 0, (new IDVariant(-1)));
      if (MainFrm.PROCEDUBUONI.equals((new IDVariant("SI")), true) || MainFrm.TIPOORDINATI.equals((new IDVariant(3)), true) || MainFrm.ATTILIQ.equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGDIDAGE, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGDIDAGE, 0, (new IDVariant("NO")));
      }
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMEOGGEPART, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGIMPRAG, 0, (new IDVariant("NO")));
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0)
      {
        PAN_PARAMETRIELE.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRIELE_IMPORTORAG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMEOGGEORDI, 0, (new IDVariant("2")));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1, ");
      SQL.append("  MAX(A.CODICE) as MAXPERRIACOD, ");
      SQL.append("  MAX(CASE WHEN A.TIPO = 'CONS' THEN TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')) - 1 ELSE TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')) END) as MAIPRTCYT1YT, ");
      SQL.append("  MAX(CASE WHEN (A.FILTRO_DISP IS NULL) THEN 'EFF' ELSE CASE WHEN A.FILTRO_DISP = 'DISP_31_12' THEN 'FIN' ELSE 'EFF' END END) as MIINPRFDEIPR ");
      SQL.append("from ");
      SQL.append("  PERIODI_RIACCERTAMENTI A ");
      SQL.append("where ((TRUNC( SYSDATE ) BETWEEN A.DATA_INIZIO AND NVL(A.DATA_FINE, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        v_VCODICEPERIO = QV.Get("MAXPERRIACOD", IDVariant.INTEGER) ;
        v_VANNO = QV.Get("MAIPRTCYT1YT", IDVariant.INTEGER) ;
        v_VPERRIAFILDI = QV.Get("MIINPRFDEIPR", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_VCOUNT.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_CODICE, 0, new IDVariant(v_VCODICEPERIO));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGESERIF, 0, new IDVariant(v_VANNO));
      }
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGDETSUB, 0, (new IDVariant("NO")));
      IDVariant v_SREG = new IDVariant(0,IDVariant.STRING);
      v_SREG = (new IDVariant("Filtro Disp. 31/12"));
      IDVariant v_SRIACC = new IDVariant(0,IDVariant.STRING);
      v_SRIACC = (new IDVariant("RIACCERTAMENTI"));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOOGTICADIFI, 0, MainFrm.AFC.GetRegistro(v_SREG, IDL.Add(IDL.Add((new IDVariant("CFA")), (new IDVariant("/"))), v_SRIACC)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProposteVariazioniRiacc", "Load", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_CODICE, 0)))
      {
        IDVariant S = null;
        S = (new IDVariant("Periodo di riaccertamento obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGESERIF, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Esercizio di riferimento obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO_RIF")), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGESERIF, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_PERIODO")), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_CODICE, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_PROGR_UO")), IDL.ToString(((IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGUNIORG, 0),(new IDVariant(-1))).equals((new IDVariant(-1)), true))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGUNIORG, 0))));
      MainFrm.SetParametroStampaJasper((new IDVariant("GE4_IMPEGNI")), IMDB.Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGDIDAGE, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPO_DISP")), ((IMDB.Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGTIPDIS, 0).equals((new IDVariant("EFF")), true) && IMDB.Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGDIDAGE, 0).equals((new IDVariant("NO")), true))?(new IDVariant("FIN")):IMDB.Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGTIPDIS, 0)));
      IDVariant D = new IDVariant(0,IDVariant.DATETIME);
      D = (new IDVariant());
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGTIPDIS, 0).equals((new IDVariant("EFF")), true))
      {
        D = IDL.Today();
      }
      else
      {
      }
      D = IDL.ToDate(IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGESERIF, 0), (new IDVariant(12)), (new IDVariant(31)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_AL")), IDL.ToString(D));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ES")), IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMEOGGEPART, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_MODULO")), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DESC_PERIODO")), (new IDVariant(PAN_PARAMETRIELE.FieldText(PFL_PARAMETRIELE_PERIODO))));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_IMPORTO_RAG")), IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGIMPRAG, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ORD")), IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMEOGGEORDI, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DETT_SUBIMP")), IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGDETSUB, 0),(new IDVariant("NO"))));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPO_DATA_DIS_FIN")), IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOOGTICADIFI, 0),(new IDVariant("C"))));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Situazione_Proposte_Variazioni"));
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMOGGIMPRAG, 0).equals((new IDVariant("E")), true))
      {
        v_NOMESTAMPA = IDL.Add(v_NOMESTAMPA, (new IDVariant("_Impo")));
      }
      MainFrm.LanciaStampaJasper(IDL.Add(v_NOMESTAMPA, ((IMDB.Value(IMDBDef14.PQRY_PARAMETRIEL1, IMDBDef14.PQSL_PARAMETRIEL1_NOMEOGGEPART, 0).equals((new IDVariant("E")), true))?(new IDVariant("_E")):(new IDVariant("")))), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneProposteVariazioniRiacc", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametrieleprm
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SITPROVARRIA_PARAMETRIEL1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRIEL1_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRIELE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRIELE, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRIEL1_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRIEL1_RS, 0, IMDBDef5.TBL_PARAMETRIELE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRIEL1_RS, 0, 0, IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_CODICE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRIEL1_RS, 1, 0, IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGESERIF, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRIEL1_RS, 2, 0, IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGUNIORG, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRIEL1_RS, 3, 0, IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMEOGGEPART, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRIEL1_RS, 4, 0, IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGIMPRAG, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRIEL1_RS, 5, 0, IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMEOGGEORDI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRIEL1_RS, 6, 0, IMDBDef5.TBL_PARAMETRIELE, IMDBDef5.FLD_PARAMETRIELE_NOMOGGDETSUB, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRIELE, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRIELE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRIELE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRIEL1_RS, 0);
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
  private void PAN_PARAMETRIELE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRIELE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRIELE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRIELE, Cancel);
    // Stub
  }

  private void PAN_PARAMETRIELE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRIELE_PERIODO)
    {
      this.IdxPanelActived = this.PAN_PARAMETRIELE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Periodo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRIELE_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARAMETRIELE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRIELE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRIELE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRIELE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRIELE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRIELE_Init()
  {

    PAN_PARAMETRIELE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRIELE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRIELE.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PARTE, "CCF83605-3C09-4A68-BDEB-B548226AFC4A");
    PAN_PARAMETRIELE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PARTE, "Parte");
    PAN_PARAMETRIELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PARTE, "");
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_UNITAORGANIZ, "3EFE447C-58F9-4A2F-839C-C07167D6F9BB");
    PAN_PARAMETRIELE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_UNITAORGANIZ, "Unità Organizzativa");
    PAN_PARAMETRIELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_UNITAORGANIZ, "");
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_UNITAORGANIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, "C21EC117-CD98-4C3C-9D1A-B0517D7C048D");
    PAN_PARAMETRIELE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, "Periodo Riacc.");
    PAN_PARAMETRIELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, "");
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, "33960BF1-3340-43E8-B04E-D982B30708CA");
    PAN_PARAMETRIELE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, "Esercizio Rif.");
    PAN_PARAMETRIELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, "");
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, "753E01D4-539E-4B07-9679-AEFE8AC6FC14");
    PAN_PARAMETRIELE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, "Periodo Riacc.");
    PAN_PARAMETRIELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, "");
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ETICHEELABOR, "DB23C2A0-416B-44F5-AF8F-A876322D1E22");
    PAN_PARAMETRIELE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ETICHEELABOR, "Elabora");
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRIELE.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPORTORAG, "6FE87C80-BB36-449E-AFAA-0908DCFD569C");
    PAN_PARAMETRIELE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPORTORAG, "Importo Rag.");
    PAN_PARAMETRIELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPORTORAG, "");
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPORTORAG, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPORTORAG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ORDINAMENTO, "EC6AAC0A-5975-4185-91F1-5C7F0C4C8E16");
    PAN_PARAMETRIELE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ORDINAMENTO, "Ordinamento");
    PAN_PARAMETRIELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ORDINAMENTO, "");
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ORDINAMENTO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRIELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, "9A163B56-A10A-4BBA-9D11-26C6A409F524");
    PAN_PARAMETRIELE.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, "Dettaglio Subimpegni");
    PAN_PARAMETRIELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, "");
    PAN_PARAMETRIELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRIELE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRIELE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PARTE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PARTE, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PARTE, MyGlb.PANEL_FORM, 132, 16, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PARTE, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAMETRIELE.SetFieldPage(PFL_PARAMETRIELE_PARTE, -1, -1);
    PAN_PARAMETRIELE.SetFieldPanel(PFL_PARAMETRIELE_PARTE, PPQRY_PARAMETRIEL1, "A.NOMEOGGEPART", "NOMEOGGEPART", 5, 2, 0, -13997);
    PAN_PARAMETRIELE.SetValueListItem(PFL_PARAMETRIELE_PARTE, (new IDVariant("S")), "Impegni/SubImpegni", "", "", -1);
    PAN_PARAMETRIELE.SetValueListItem(PFL_PARAMETRIELE_PARTE, (new IDVariant("E")), "Accertamenti", "", "", -1);
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_UNITAORGANIZ, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_UNITAORGANIZ, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_UNITAORGANIZ, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_UNITAORGANIZ, MyGlb.PANEL_FORM, 8, 64, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_UNITAORGANIZ, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARAMETRIELE.SetFieldPage(PFL_PARAMETRIELE_UNITAORGANIZ, -1, -1);
    PAN_PARAMETRIELE.SetFieldPanel(PFL_PARAMETRIELE_UNITAORGANIZ, PPQRY_PARAMETRIEL1, "A.NOMOGGUNIORG", "NOMOGGUNIORG", 1, 8, 0, -13997);
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_LIST, "Per. Riacc");
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_FORM, 4, 28, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_FORM, 160);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODORIACC, MyGlb.PANEL_FORM, "Periodo Riacc.");
    PAN_PARAMETRIELE.SetFieldPage(PFL_PARAMETRIELE_PERIODORIACC, -1, -1);
    PAN_PARAMETRIELE.SetFieldPanel(PFL_PARAMETRIELE_PERIODORIACC, PPQRY_PARAMETRIEL1, "A.CODICE", "CODICE", 1, 5, 0, -13997);
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_LIST, "Esercizio Rif.");
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_FORM, 464, 40, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ESERCIZIORIF, MyGlb.PANEL_FORM, "Esercizio Rif.");
    PAN_PARAMETRIELE.SetFieldPage(PFL_PARAMETRIELE_ESERCIZIORIF, -1, -1);
    PAN_PARAMETRIELE.SetFieldPanel(PFL_PARAMETRIELE_ESERCIZIORIF, PPQRY_PARAMETRIEL1, "A.NOMOGGESERIF", "NOMOGGESERIF", 1, 9, 0, -13997);
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_LIST, 236);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_LIST, "Periodo Riacc.");
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_FORM, 40, 40, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_PERIODO, MyGlb.PANEL_FORM, "Periodo Riacc.");
    PAN_PARAMETRIELE.SetFieldPage(PFL_PARAMETRIELE_PERIODO, -1, -1);
    PAN_PARAMETRIELE.SetFieldPanel(PFL_PARAMETRIELE_PERIODO, PPQRY_PERIODRIACCE, "TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE", "PERIRIACDESC", 5, 202, 0, -13997);
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ETICHEELABOR, MyGlb.PANEL_LIST, 412, 72, 112, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ETICHEELABOR, MyGlb.PANEL_FORM, 500, 148, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRIELE.SetFieldPage(PFL_PARAMETRIELE_ETICHEELABOR, -1, -1);
    PAN_PARAMETRIELE.SetFieldPanel(PFL_PARAMETRIELE_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPORTORAG, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPORTORAG, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPORTORAG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPORTORAG, MyGlb.PANEL_LIST, "Importo Rag.");
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPORTORAG, MyGlb.PANEL_FORM, 40, 88, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPORTORAG, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPORTORAG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_IMPORTORAG, MyGlb.PANEL_FORM, "Importo Rag.");
    PAN_PARAMETRIELE.SetFieldPage(PFL_PARAMETRIELE_IMPORTORAG, -1, -1);
    PAN_PARAMETRIELE.SetFieldPanel(PFL_PARAMETRIELE_IMPORTORAG, PPQRY_PARAMETRIEL1, "A.NOMOGGIMPRAG", "NOMOGGIMPRAG", 5, 2, 0, -13997);
    PAN_PARAMETRIELE.SetValueListItem(PFL_PARAMETRIELE_IMPORTORAG, (new IDVariant("SI")), "Ragioneria", "", "", -1);
    PAN_PARAMETRIELE.SetValueListItem(PFL_PARAMETRIELE_IMPORTORAG, (new IDVariant("NO")), "Ufficio", "", "", -1);
    PAN_PARAMETRIELE.SetValueListItem(PFL_PARAMETRIELE_IMPORTORAG, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ORDINAMENTO, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ORDINAMENTO, MyGlb.PANEL_FORM, 44, 116, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ORDINAMENTO, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_PARAMETRIELE.SetFieldPage(PFL_PARAMETRIELE_ORDINAMENTO, -1, -1);
    PAN_PARAMETRIELE.SetFieldPanel(PFL_PARAMETRIELE_ORDINAMENTO, PPQRY_PARAMETRIEL1, "A.NOMEOGGEORDI", "NOMEOGGEORDI", 5, 1, 0, -13997);
    PAN_PARAMETRIELE.SetValueListItem(PFL_PARAMETRIELE_ORDINAMENTO, (new IDVariant("2")), "per Capitolo", "", "", -1);
    PAN_PARAMETRIELE.SetValueListItem(PFL_PARAMETRIELE_ORDINAMENTO, (new IDVariant("1")), "per Codice U.O.", "", "", -1);
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, MyGlb.PANEL_LIST, "Dettaglio Subimpegni");
    PAN_PARAMETRIELE.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, MyGlb.PANEL_FORM, 424, 88, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRIELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, MyGlb.PANEL_FORM, 132);
    PAN_PARAMETRIELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRIELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRIELE_DETTSUBIMP, MyGlb.PANEL_FORM, "Dettaglio Subimpegni");
    PAN_PARAMETRIELE.SetFieldPage(PFL_PARAMETRIELE_DETTSUBIMP, -1, -1);
    PAN_PARAMETRIELE.SetFieldPanel(PFL_PARAMETRIELE_DETTSUBIMP, PPQRY_PARAMETRIEL1, "A.NOMOGGDETSUB", "NOMOGGDETSUB", 5, 2, 0, -13997);
    PAN_PARAMETRIELE.SetValueListItem(PFL_PARAMETRIELE_DETTSUBIMP, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRIELE.SetValueListItem(PFL_PARAMETRIELE_DETTSUBIMP, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAMETRIELE_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRIELE.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as PERIRIACDESC ");
    SQL.append("from ");
    SQL.append("  PERIODI_RIACCERTAMENTI A ");
    SQL.append("where (A.CODICE = ~~CODICE~~) ");
    PAN_PARAMETRIELE.SetQuery(PPQRY_PERIODRIACCE, 0, SQL, -1, "");
    PAN_PARAMETRIELE.SetQueryDB(PPQRY_PERIODRIACCE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRIELE.SetMasterTable(PPQRY_PERIODRIACCE, "PERIODI_RIACCERTAMENTI");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CF4STRPRUNOR, ");
    SQL.append("  1 as ORDER1, ");
    SQL.append("  LPAD(A.CODICE_UO, 16, SUBSTR('0', 1, 1)) as CF4WSTRUORDE, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as CF4STRCODUO1 ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMOGGUNIORG~~) ");
    SQL.append("and   (A.TIPO_STRUTTURA = 'LG') ");
    SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  -1, ");
    SQL.append("  '-1', ");
    SQL.append("  CASE WHEN ~~TBL_DATISESSIONE.SESSIOMODULO~~ = 'CFA' THEN 'Tutte le UO di competenza' ELSE 'Tutte' END ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (NVL(~~NOMOGGUNIORG~~, -1) = -1) ");
    SQL.append("UNION ");
    SQL.append("select distinct ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  LPAD(ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), 16, SUBSTR('0', 1, 1)), ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("from ");
    SQL.append("  UO_CAP_UO C ");
    SQL.append("where (C.PROGR_UNITA_ORGANIZZATIVA = ~~NOMOGGUNIORG~~) ");
    SQL.append("and   (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.E_S = ~~NOMEOGGEPART~~) ");
    SQL.append("order by 2, 3 ");
    PAN_PARAMETRIELE.SetQuery(PPQRY_CF4WEBSTRUTT, 0, SQL, PFL_PARAMETRIELE_UNITAORGANIZ, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CF4STRPRUNOR, ");
    SQL.append("  1 as ORDER1, ");
    SQL.append("  LPAD(A.CODICE_UO, 16, SUBSTR('0', 1, 1)) as CF4WSTRUORDE, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as CF4STRCODUO1 ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA A ");
    SQL.append("where (A.TIPO_STRUTTURA = 'LG') ");
    SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  -1, ");
    SQL.append("  '-1', ");
    SQL.append("  CASE WHEN ~~TBL_DATISESSIONE.SESSIOMODULO~~ = 'CFA' THEN 'Tutte le UO di competenza' ELSE 'Tutte' END ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ");
    SQL.append("select distinct ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  LPAD(ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), 16, SUBSTR('0', 1, 1)), ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("from ");
    SQL.append("  UO_CAP_UO C ");
    SQL.append("where (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.E_S = ~~NOMEOGGEPART~~) ");
    SQL.append("order by 2, 3 ");
    PAN_PARAMETRIELE.SetQuery(PPQRY_CF4WEBSTRUTT, 1, SQL, PFL_PARAMETRIELE_UNITAORGANIZ, "");
    PAN_PARAMETRIELE.SetQueryDB(PPQRY_CF4WEBSTRUTT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRIELE.SetIMDB(IMDB, "PQRY_PARAMETRIEL1", true);
    PAN_PARAMETRIELE.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMETRIELE.SetQueryIMDB(PPQRY_PARAMETRIEL1, IMDBDef14.PQRY_PARAMETRIEL1_RS, IMDBDef5.TBL_PARAMETRIELE);
    JustLoaded = true;
    PAN_PARAMETRIELE.SetFieldPrimaryIndex(PFL_PARAMETRIELE_PARTE, IMDBDef5.FLD_PARAMETRIELE_NOMEOGGEPART);
    PAN_PARAMETRIELE.SetFieldPrimaryIndex(PFL_PARAMETRIELE_UNITAORGANIZ, IMDBDef5.FLD_PARAMETRIELE_NOMOGGUNIORG);
    PAN_PARAMETRIELE.SetFieldPrimaryIndex(PFL_PARAMETRIELE_PERIODORIACC, IMDBDef5.FLD_PARAMETRIELE_CODICE);
    PAN_PARAMETRIELE.SetFieldPrimaryIndex(PFL_PARAMETRIELE_ESERCIZIORIF, IMDBDef5.FLD_PARAMETRIELE_NOMOGGESERIF);
    PAN_PARAMETRIELE.SetFieldPrimaryIndex(PFL_PARAMETRIELE_IMPORTORAG, IMDBDef5.FLD_PARAMETRIELE_NOMOGGIMPRAG);
    PAN_PARAMETRIELE.SetFieldPrimaryIndex(PFL_PARAMETRIELE_ORDINAMENTO, IMDBDef5.FLD_PARAMETRIELE_NOMEOGGEORDI);
    PAN_PARAMETRIELE.SetFieldPrimaryIndex(PFL_PARAMETRIELE_DETTSUBIMP, IMDBDef5.FLD_PARAMETRIELE_NOMOGGDETSUB);
    PAN_PARAMETRIELE.SetMasterTable(0, "PARAMETRIELE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRIELE.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRIELE.iUseListQBE;
      PAN_PARAMETRIELE.iUseListQBE = 0;
      PAN_PARAMETRIELE.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRIELE.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRIELE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRIELE) PAN_PARAMETRIELE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRIELE) PAN_PARAMETRIELE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRIELE) PAN_PARAMETRIELE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRIELE) PAN_PARAMETRIELE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRIELE) PAN_PARAMETRIELE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
