// **********************************************
// Sollecito Chiusura Proposta
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SollecitoChiusuraProposta extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SOLLECCHIUSU_TESTMAILCODI = 0;
  private static int PFL_SOLLECCHIUSU_TESTMAILLIBE = 1;
  private static int PFL_SOLLECCHIUSU_MODIFICAMAIL = 2;
  private static int PFL_SOLLECCHIUSU_APRIMAIL = 3;
  private static int PFL_SOLLECCHIUSU_MODIFICMAIL1 = 4;
  private static int PFL_SOLLECCHIUSU_INVIA = 5;

  private static int PPQRY_PARAMETRI380 = 0;


  IDPanel PAN_SOLLECCHIUSU;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI135(IMDB);
    //
    //
    Init_PQRY_PARAMETRI380(IMDB);
    Init_PQRY_PARAMETRI380_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI135(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI135, 4);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI135, "TBL_PARAMETRI135");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI135,IMDBDef4.FLD_PARAMETRI135_ROWNAMTEMACO, "ROWNAMTEMACO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI135,IMDBDef4.FLD_PARAMETRI135_ROWNAMTEMACO,9,2000,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI135,IMDBDef4.FLD_PARAMETRI135_ROWNAMTEMALI, "ROWNAMTEMALI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI135,IMDBDef4.FLD_PARAMETRI135_ROWNAMTEMALI,9,2000,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI135,IMDBDef4.FLD_PARAMETRI135_ROWNAMEQUALE, "ROWNAMEQUALE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI135,IMDBDef4.FLD_PARAMETRI135_ROWNAMEQUALE,1,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI135,IMDBDef4.FLD_PARAMETRI135_ROWNAMPRVAID, "ROWNAMPRVAID");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI135,IMDBDef4.FLD_PARAMETRI135_ROWNAMPRVAID,1,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI135, 0);
  }

  private static void Init_PQRY_PARAMETRI380(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI380, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI380, "PQRY_PARAMETRI380");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI380,IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMACO, "ROWNAMTEMACO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI380,IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMACO,9,2000,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI380,IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMALI, "ROWNAMTEMALI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI380,IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMALI,9,2000,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI380, 0);
  }

  private static void Init_PQRY_PARAMETRI380_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI380_RS, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI380_RS, "PQRY_PARAMETRI380_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI380_RS,IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMACO, "ROWNAMTEMACO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI380_RS,IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMACO,9,2000,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI380_RS,IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMALI, "ROWNAMTEMALI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI380_RS,IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMALI,9,2000,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SollecitoChiusuraProposta(MyWebEntryPoint w, IMDBObj imdb)
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
  public SollecitoChiusuraProposta()
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
    FormIdx = MyGlb.FRM_SOLLCHIUPROP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5AACB350-5A64-4C19-8E7B-72DC8F4FD4E3";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 588;
    DesignHeight = 218;
    set_Caption(new IDVariant("Sollecito Chiusura Proposta"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 588;
    Frames[1].Height = 192;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Sollecito Chiusura";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 192;
    PAN_SOLLECCHIUSU = new IDPanel(w, this, 1, "PAN_SOLLECCHIUSU");
    Frames[1].Content = PAN_SOLLECCHIUSU;
    PAN_SOLLECCHIUSU.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SOLLECCHIUSU.VS = MainFrm.VisualStyleList;
    PAN_SOLLECCHIUSU.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 588-MyGlb.PAN_OFFS_X, 192-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SOLLECCHIUSU.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2D5AFE81-3B93-4C13-B535-9E4F55E0EF4F");
    PAN_SOLLECCHIUSU.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECCHIUSU.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SOLLECCHIUSU.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SOLLECCHIUSU.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SOLLECCHIUSU.InitStatus = 2;
    PAN_SOLLECCHIUSU_Init();
    PAN_SOLLECCHIUSU_InitFields();
    PAN_SOLLECCHIUSU_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI135, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SOLLCHIUPROP_PARAMETRI380();
      }
      PAN_SOLLECCHIUSU.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTESTMAIL && flRis && IdxPanelActived == PAN_SOLLECCHIUSU.FrIndex)
    {
      if (IdxFieldActived ==PFL_SOLLECCHIUSU_APRIMAIL) {
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
    return (obj instanceof SollecitoChiusuraProposta);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SollecitoChiusuraProposta.class.getName() : (Glb.ClassWithPackage(SollecitoChiusuraProposta.class) ? SollecitoChiusuraProposta.class.getName().substring(SollecitoChiusuraProposta.class.getPackage().getName().length() + 1) : SollecitoChiusuraProposta.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Setta Testo Mail
  // **********************************************************************
  public int SettaTestoMail ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TESTO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Setta Testo Mail Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  B.TESTO as POLTESMAITES ");
      SQL.append("from ");
      SQL.append("  POL_FASI_PROCESSO A, ");
      SQL.append("  POL_TESTI_MAIL B ");
      SQL.append("where (B.TESTO_MAIL_ID = A.TESTO_MAIL_SOLLECITO_ID) ");
      SQL.append("and   (A.CODICE = 'PROP') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_TESTO = QV.Get("POLTESMAITES", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI135, IMDBDef4.FLD_PARAMETRI135_ROWNAMTEMACO, 0, new IDVariant(v_TESTO));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitoChiusuraProposta", "SettaTestoMail", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Modifica Mail
  // **********************************************************************
  public int ModificaMail ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Modifica Mail Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI135, IMDBDef4.FLD_PARAMETRI135_ROWNAMEQUALE, 0, (new IDVariant(0)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef12.PQRY_PARAMETRI380, IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMACO, 0), (new IDVariant(PAN_SOLLECCHIUSU.Header(Glb.OBJ_FIELD,PFL_SOLLECCHIUSU_TESTMAILCODI))), (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitoChiusuraProposta", "ModificaMail", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mail
  // **********************************************************************
  public int ApriMail ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mail Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI135, IMDBDef4.FLD_PARAMETRI135_ROWNAMEQUALE, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef1.TBL_PAR101, IMDBDef1.FLD_PAR101_ROWNAMTIPEVE, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_SCELTESTMAIL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitoChiusuraProposta", "ApriMail", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Modifica Mail 1
  // **********************************************************************
  public int ModificaMail1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Modifica Mail 1 Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI135, IMDBDef4.FLD_PARAMETRI135_ROWNAMEQUALE, 0, (new IDVariant(1)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef12.PQRY_PARAMETRI380, IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMALI, 0), (new IDVariant(PAN_SOLLECCHIUSU.Header(Glb.OBJ_FIELD,PFL_SOLLECCHIUSU_TESTMAILLIBE))), (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitoChiusuraProposta", "ModificaMail1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Invia
  // **********************************************************************
  public int Invia ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Invia Body
      // Procedure Body
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI380, IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMACO, 0),(new IDVariant(""))).equals((new IDVariant("")), true) && IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI380, IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMALI, 0),(new IDVariant(""))).equals((new IDVariant("")), true))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Non è presente il testo della mail di sollecito. La mail di sollecito non può essere inviata", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitoChiusuraProposta", "Invia", _e);
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
    IDVariant M = new IDVariant(0,IDVariant.STRING);
    IDVariant A = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ABILITA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      M = (new IDVariant("Modifica il testo della Mail", IDVariant.STRING));
      A = (new IDVariant("Apri elenco Mail di Sollecito", IDVariant.STRING));
      v_CAPTION = (new IDVariant("Sollecito Chiusura", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI135, IMDBDef4.FLD_PARAMETRI135_ROWNAMTEMACO, 0, (new IDVariant("")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI135, IMDBDef4.FLD_PARAMETRI135_ROWNAMTEMALI, 0, (new IDVariant("")));
      SettaTestoMail();
      PAN_SOLLECCHIUSU.set_ToolTip(Glb.OBJ_FIELD,PFL_SOLLECCHIUSU_MODIFICAMAIL,M.stringValue()); 
      PAN_SOLLECCHIUSU.set_ToolTip(Glb.OBJ_FIELD,PFL_SOLLECCHIUSU_APRIMAIL,A.stringValue()); 
      PAN_SOLLECCHIUSU.set_ToolTip(Glb.OBJ_FIELD,PFL_SOLLECCHIUSU_MODIFICMAIL1,M.stringValue()); 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ABILITATA_UNITA_ORGANIZZATIVE as POFAPRABUNOR ");
      SQL.append("from ");
      SQL.append("  POL_FASI_PROCESSO A ");
      SQL.append("where (A.CODICE = 'PROP') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ABILITA = QV.Get("POFAPRABUNOR", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_ABILITA.compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_SOLLECCHIUSU.SetFlags (Glb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILLIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SOLLECCHIUSU.SetFlags (Glb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICMAIL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      set_Caption(new IDVariant(v_CAPTION));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitoChiusuraProposta", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
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
      // End Modal Event Body
      // Procedure Body
      // 
      if (Result.equals((new IDVariant(-1)), true))
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && IMDB.Value(IMDBDef4.TBL_PARAMETRI135, IMDBDef4.FLD_PARAMETRI135_ROWNAMEQUALE, 0).equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI135, IMDBDef4.FLD_PARAMETRI135_ROWNAMTEMACO, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI380, IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMACO, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && IMDB.Value(IMDBDef4.TBL_PARAMETRI135, IMDBDef4.FLD_PARAMETRI135_ROWNAMEQUALE, 0).equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI135, IMDBDef4.FLD_PARAMETRI135_ROWNAMTEMALI, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI380, IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMALI, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTESTMAIL)), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI135, IMDBDef4.FLD_PARAMETRI135_ROWNAMTEMACO, 0, IMDB.Value(IMDBDef7.PQRY_POLTESTIMAI1, IMDBDef7.PQSL_POLTESTIMAI1_TESTO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI380, IMDBDef12.PQSL_PARAMETRI380_ROWNAMTEMACO, 0, IMDB.Value(IMDBDef7.PQRY_POLTESTIMAI1, IMDBDef7.PQSL_POLTESTIMAI1_TESTO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitoChiusuraProposta", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void SOLLCHIUPROP_PARAMETRI380() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI380_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI135, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI135, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI380_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI380_RS, 0, IMDBDef4.TBL_PARAMETRI135, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI380_RS, 0, 0, IMDBDef4.TBL_PARAMETRI135, IMDBDef4.FLD_PARAMETRI135_ROWNAMTEMACO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI380_RS, 1, 0, IMDBDef4.TBL_PARAMETRI135, IMDBDef4.FLD_PARAMETRI135_ROWNAMTEMALI, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI135, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI135, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI135, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI380_RS, 0);
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
  private void PAN_SOLLECCHIUSU_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SOLLECCHIUSU, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SOLLECCHIUSU_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SOLLECCHIUSU, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SOLLECCHIUSU_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SOLLECCHIUSU);
    // Stub
  }

  private void PAN_SOLLECCHIUSU_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SOLLECCHIUSU_MODIFICAMAIL)
    {
      this.IdxPanelActived = this.PAN_SOLLECCHIUSU.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ModificaMail();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SOLLECCHIUSU_APRIMAIL)
    {
      this.IdxPanelActived = this.PAN_SOLLECCHIUSU.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriMail();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SOLLECCHIUSU_MODIFICMAIL1)
    {
      this.IdxPanelActived = this.PAN_SOLLECCHIUSU.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ModificaMail1();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SOLLECCHIUSU_INVIA)
    {
      this.IdxPanelActived = this.PAN_SOLLECCHIUSU.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Invia();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SOLLECCHIUSU_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SOLLECCHIUSU_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SOLLECCHIUSU_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SOLLECCHIUSU_Init()
  {

    PAN_SOLLECCHIUSU.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SOLLECCHIUSU.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SOLLECCHIUSU.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_SOLLECCHIUSU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILCODI, "92321C86-8B5B-43FA-B8EA-8363BFF52F93");
    PAN_SOLLECCHIUSU.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILCODI, "Testo Mail codificato");
    PAN_SOLLECCHIUSU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILCODI, "");
    PAN_SOLLECCHIUSU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILCODI, MyGlb.VIS_NORMALFIELDS);
    PAN_SOLLECCHIUSU.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILCODI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOLLECCHIUSU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILLIBE, "F4E65968-0E56-4320-AAB4-F41EDD3DAE97");
    PAN_SOLLECCHIUSU.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILLIBE, "Testo Mail libero");
    PAN_SOLLECCHIUSU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILLIBE, "");
    PAN_SOLLECCHIUSU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILLIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_SOLLECCHIUSU.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILLIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOLLECCHIUSU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICAMAIL, "2492E5C2-1249-44BE-8338-446B00AB8A35");
    PAN_SOLLECCHIUSU.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICAMAIL, "");
    PAN_SOLLECCHIUSU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICAMAIL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SOLLECCHIUSU.SetImage(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICAMAIL, 0, "Testo.bmp", false);
    PAN_SOLLECCHIUSU.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICAMAIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SOLLECCHIUSU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_APRIMAIL, "20B60885-8474-4BAA-9510-15270BFD45C2");
    PAN_SOLLECCHIUSU.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_APRIMAIL, "");
    PAN_SOLLECCHIUSU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_APRIMAIL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SOLLECCHIUSU.SetImage(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_APRIMAIL, 0, "wfind.gif", false);
    PAN_SOLLECCHIUSU.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_APRIMAIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SOLLECCHIUSU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICMAIL1, "62FAE31E-9821-47D2-8EC3-80E5A19D36AA");
    PAN_SOLLECCHIUSU.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICMAIL1, "");
    PAN_SOLLECCHIUSU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICMAIL1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SOLLECCHIUSU.SetImage(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICMAIL1, 0, "Testo.bmp", false);
    PAN_SOLLECCHIUSU.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICMAIL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SOLLECCHIUSU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_INVIA, "E7307BF5-E2BC-45BA-904B-3EC02D2900D3");
    PAN_SOLLECCHIUSU.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_INVIA, "Invia");
    PAN_SOLLECCHIUSU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_INVIA, MyGlb.VIS_STATICBUTTON);
    PAN_SOLLECCHIUSU.SetImage(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_INVIA, 0, "button1.gif", false);
    PAN_SOLLECCHIUSU.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_INVIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_SOLLECCHIUSU_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SOLLECCHIUSU.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILCODI, MyGlb.PANEL_LIST, 4, 184, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_SOLLECCHIUSU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILCODI, MyGlb.PANEL_LIST, 128);
    PAN_SOLLECCHIUSU.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILCODI, MyGlb.PANEL_LIST, 2);
    PAN_SOLLECCHIUSU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILCODI, MyGlb.PANEL_LIST, "Testo Mail codificato");
    PAN_SOLLECCHIUSU.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILCODI, MyGlb.PANEL_FORM, 4, 20, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECCHIUSU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILCODI, MyGlb.PANEL_FORM, 108);
    PAN_SOLLECCHIUSU.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILCODI, MyGlb.PANEL_FORM, 2);
    PAN_SOLLECCHIUSU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILCODI, MyGlb.PANEL_FORM, "Testo Mail codificato");
    PAN_SOLLECCHIUSU.SetFieldPage(PFL_SOLLECCHIUSU_TESTMAILCODI, -1, -1);
    PAN_SOLLECCHIUSU.SetFieldPanel(PFL_SOLLECCHIUSU_TESTMAILCODI, PPQRY_PARAMETRI380, "A.ROWNAMTEMACO", "ROWNAMTEMACO", 9, 2000, 0, -13997);
    PAN_SOLLECCHIUSU.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILLIBE, MyGlb.PANEL_LIST, 4, 208, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_SOLLECCHIUSU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILLIBE, MyGlb.PANEL_LIST, 128);
    PAN_SOLLECCHIUSU.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILLIBE, MyGlb.PANEL_LIST, 2);
    PAN_SOLLECCHIUSU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILLIBE, MyGlb.PANEL_LIST, "Testo Mail libero");
    PAN_SOLLECCHIUSU.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILLIBE, MyGlb.PANEL_FORM, 24, 68, 488, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECCHIUSU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILLIBE, MyGlb.PANEL_FORM, 88);
    PAN_SOLLECCHIUSU.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILLIBE, MyGlb.PANEL_FORM, 3);
    PAN_SOLLECCHIUSU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_TESTMAILLIBE, MyGlb.PANEL_FORM, "Testo Mail libero");
    PAN_SOLLECCHIUSU.SetFieldPage(PFL_SOLLECCHIUSU_TESTMAILLIBE, -1, -1);
    PAN_SOLLECCHIUSU.SetFieldPanel(PFL_SOLLECCHIUSU_TESTMAILLIBE, PPQRY_PARAMETRI380, "A.ROWNAMTEMALI", "ROWNAMTEMALI", 9, 2000, 0, -13997);
    PAN_SOLLECCHIUSU.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICAMAIL, MyGlb.PANEL_LIST, 516, 28, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECCHIUSU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICAMAIL, MyGlb.PANEL_LIST, 0);
    PAN_SOLLECCHIUSU.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICAMAIL, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECCHIUSU.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICAMAIL, MyGlb.PANEL_FORM, 516, 40, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECCHIUSU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICAMAIL, MyGlb.PANEL_FORM, 0);
    PAN_SOLLECCHIUSU.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICAMAIL, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECCHIUSU.SetFieldPage(PFL_SOLLECCHIUSU_MODIFICAMAIL, -1, -1);
    PAN_SOLLECCHIUSU.SetFieldPanel(PFL_SOLLECCHIUSU_MODIFICAMAIL, -1, "", "MODIFICAMAIL", 0, 0, 0, -13997);
    PAN_SOLLECCHIUSU.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_APRIMAIL, MyGlb.PANEL_LIST, 512, 28, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECCHIUSU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_APRIMAIL, MyGlb.PANEL_LIST, 0);
    PAN_SOLLECCHIUSU.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_APRIMAIL, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECCHIUSU.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_APRIMAIL, MyGlb.PANEL_FORM, 516, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECCHIUSU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_APRIMAIL, MyGlb.PANEL_FORM, 0);
    PAN_SOLLECCHIUSU.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_APRIMAIL, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECCHIUSU.SetFieldPage(PFL_SOLLECCHIUSU_APRIMAIL, -1, -1);
    PAN_SOLLECCHIUSU.SetFieldPanel(PFL_SOLLECCHIUSU_APRIMAIL, -1, "", "APRIMAIL", 0, 0, 0, -13997);
    PAN_SOLLECCHIUSU.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICMAIL1, MyGlb.PANEL_LIST, 524, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECCHIUSU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICMAIL1, MyGlb.PANEL_LIST, 0);
    PAN_SOLLECCHIUSU.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICMAIL1, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECCHIUSU.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICMAIL1, MyGlb.PANEL_FORM, 516, 68, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECCHIUSU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICMAIL1, MyGlb.PANEL_FORM, 0);
    PAN_SOLLECCHIUSU.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_MODIFICMAIL1, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECCHIUSU.SetFieldPage(PFL_SOLLECCHIUSU_MODIFICMAIL1, -1, -1);
    PAN_SOLLECCHIUSU.SetFieldPanel(PFL_SOLLECCHIUSU_MODIFICMAIL1, -1, "", "MODIFICMAIL1", 0, 0, 0, -13997);
    PAN_SOLLECCHIUSU.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_INVIA, MyGlb.PANEL_LIST, 412, 128, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECCHIUSU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_INVIA, MyGlb.PANEL_LIST, 0);
    PAN_SOLLECCHIUSU.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_INVIA, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECCHIUSU.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_INVIA, MyGlb.PANEL_FORM, 432, 124, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECCHIUSU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_INVIA, MyGlb.PANEL_FORM, 0);
    PAN_SOLLECCHIUSU.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECCHIUSU_INVIA, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECCHIUSU.SetFieldPage(PFL_SOLLECCHIUSU_INVIA, -1, -1);
    PAN_SOLLECCHIUSU.SetFieldPanel(PFL_SOLLECCHIUSU_INVIA, -1, "", "INVIA", 0, 0, 0, -13997);
  }

  private void PAN_SOLLECCHIUSU_InitQueries()
  {
    StringBuffer SQL;

    PAN_SOLLECCHIUSU.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SOLLECCHIUSU.SetIMDB(IMDB, "PQRY_PARAMETRI380", true);
    PAN_SOLLECCHIUSU.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_SOLLECCHIUSU.SetQueryIMDB(PPQRY_PARAMETRI380, IMDBDef12.PQRY_PARAMETRI380_RS, IMDBDef4.TBL_PARAMETRI135);
    JustLoaded = true;
    PAN_SOLLECCHIUSU.SetFieldPrimaryIndex(PFL_SOLLECCHIUSU_TESTMAILCODI, IMDBDef4.FLD_PARAMETRI135_ROWNAMTEMACO);
    PAN_SOLLECCHIUSU.SetFieldPrimaryIndex(PFL_SOLLECCHIUSU_TESTMAILLIBE, IMDBDef4.FLD_PARAMETRI135_ROWNAMTEMALI);
    PAN_SOLLECCHIUSU.SetMasterTable(0, "PARAMETRI135");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SOLLECCHIUSU.Status() == 2)
    {
      int oldListQBE = PAN_SOLLECCHIUSU.iUseListQBE;
      PAN_SOLLECCHIUSU.iUseListQBE = 0;
      PAN_SOLLECCHIUSU.PanelCommand(Glb.PCM_SEARCH);
      PAN_SOLLECCHIUSU.PanelCommand(Glb.PCM_FIND);
      PAN_SOLLECCHIUSU.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SOLLECCHIUSU) PAN_SOLLECCHIUSU_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SOLLECCHIUSU) PAN_SOLLECCHIUSU_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SOLLECCHIUSU) PAN_SOLLECCHIUSU_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SOLLECCHIUSU) PAN_SOLLECCHIUSU_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SOLLECCHIUSU) PAN_SOLLECCHIUSU_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
