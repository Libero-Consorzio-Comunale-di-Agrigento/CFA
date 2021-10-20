// **********************************************
// Dettagli Variazione Da Variazioni Bilancio Peg
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DettagliVariazioneDaVariazioniBilancioPeg extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DETTAGVARIAZ_IMPORTI = 0;

  private static int PFL_DETTAGVARIAZ_ES = 0;
  private static int PFL_DETTAGVARIAZ_CAPITOLO = 1;
  private static int PFL_DETTAGVARIAZ_ARTICOLO = 2;
  private static int PFL_DETTAGVARIAZ_NUOVA = 3;
  private static int PFL_DETTAGVARIAZ_IMPORTO1 = 4;
  private static int PFL_DETTAGVARIAZ_IMPORTO2 = 5;
  private static int PFL_DETTAGVARIAZ_IMPORTO3 = 6;
  private static int PFL_DETTAGVARIAZ_CONSSVIL = 7;
  private static int PFL_DETTAGVARIAZ_TIPOVAR = 8;
  private static int PFL_DETTAGVARIAZ_DESCRIZIONE = 9;
  private static int PFL_DETTAGVARIAZ_NOTE1 = 10;
  private static int PFL_DETTAGVARIAZ_NOTA1 = 11;
  private static int PFL_DETTAGVARIAZ_NOTA2 = 12;
  private static int PFL_DETTAGVARIAZ_NOTA3 = 13;
  private static int PFL_DETTAGVARIAZ_NOTA4 = 14;
  private static int PFL_DETTAGVARIAZ_NOTA5 = 15;
  private static int PFL_DETTAGVARIAZ_VARBIL = 16;
  private static int PFL_DETTAGVARIAZ_PROGETTO = 17;
  private static int PFL_DETTAGVARIAZ_OBIETTIVO = 18;
  private static int PFL_DETTAGVARIAZ_SCHEDAOBIETT = 19;
  private static int PFL_DETTAGVARIAZ_FATTORE = 20;
  private static int PFL_DETTAGVARIAZ_CENTRO = 21;
  private static int PFL_DETTAGVARIAZ_FINANZIAMENT = 22;
  private static int PFL_DETTAGVARIAZ_OPERA = 23;
  private static int PFL_DETTAGVARIAZ_VOCEPEGSMALL = 24;
  private static int PFL_DETTAGVARIAZ_CAPITOLOART = 25;

  private static int PPQRY_POLPROVARDET = 0;

  private static int PPQRY_POLOBIETTIVI = 1;

  private static int PPQRY_T54 = 2;


  IDPanel PAN_DETTAGVARIAZ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IN9(IMDB);
    //
    //
    Init_PQRY_POLPROVARDET(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IN9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_IN9, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_IN9, "TBL_IN9");
    IMDB.set_FldCode(IMDBDef4.TBL_IN9,IMDBDef4.FLD_IN9_ROWNAMEVARID, "ROWNAMEVARID");
    IMDB.SetFldParams(IMDBDef4.TBL_IN9,IMDBDef4.FLD_IN9_ROWNAMEVARID,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_IN9, 0);
  }

  private static void Init_PQRY_POLPROVARDET(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLPROVARDET, 23);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLPROVARDET, "PQRY_POLPROVARDET");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_ISTITUZIONE_NC, "ISTITUZIONE_NC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_ISTITUZIONE_NC,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_IMPORTO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_IMPORTO_2, "IMPORTO_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_IMPORTO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_IMPORTO_3, "IMPORTO_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_IMPORTO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_CONS_SVILUPPO, "CONS_SVILUPPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_CONS_SVILUPPO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_DESCRIZIONE,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_NOTA_1, "NOTA_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_NOTA_1,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_NOTA_2, "NOTA_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_NOTA_2,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_NOTA_3, "NOTA_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_NOTA_3,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_NOTA_4, "NOTA_4");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_NOTA_4,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_NOTA_5, "NOTA_5");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_NOTA_5,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_VAR_BIL, "VAR_BIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_VAR_BIL,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_SCHEDA_OBIETTIVO_ID, "SCHEDA_OBIETTIVO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_SCHEDA_OBIETTIVO_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_RECORDNOTE, "RECORDNOTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDET,IMDBDef12.PQSL_POLPROVARDET_RECORDNOTE,5,99,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLPROVARDET, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DettagliVariazioneDaVariazioniBilancioPeg(MyWebEntryPoint w, IMDBObj imdb)
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
  public DettagliVariazioneDaVariazioniBilancioPeg()
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
    FormIdx = MyGlb.FRM_DEVADAVABIPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B51ED1A4-F9F5-47C1-87E4-57FE8067D2C5";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 804;
    DesignHeight = 374;
    set_Caption(new IDVariant("Dettagli Variazione Da Variazioni Bilancio Peg"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 804;
    Frames[1].Height = 348;
    Frames[1].Caption = "Dettagli Variazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 348;
    PAN_DETTAGVARIAZ = new IDPanel(w, this, 1, "PAN_DETTAGVARIAZ");
    Frames[1].Content = PAN_DETTAGVARIAZ;
    PAN_DETTAGVARIAZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGVARIAZ.VS = MainFrm.VisualStyleList;
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 804-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "ED0A295C-D325-4349-8044-0AF3CD37649A");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1484, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGVARIAZ.InitStatus = 2;
    PAN_DETTAGVARIAZ_Init();
    PAN_DETTAGVARIAZ_InitFields();
    PAN_DETTAGVARIAZ_InitQueries();
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
      PAN_DETTAGVARIAZ.UpdatePanel(MainFrm);
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
    return (obj instanceof DettagliVariazioneDaVariazioniBilancioPeg);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DettagliVariazioneDaVariazioniBilancioPeg.class.getName() : (Glb.ClassWithPackage(DettagliVariazioneDaVariazioniBilancioPeg.class) ? DettagliVariazioneDaVariazioniBilancioPeg.class.getName().substring(DettagliVariazioneDaVariazioniBilancioPeg.class.getPackage().getName().length() + 1) : DettagliVariazioneDaVariazioniBilancioPeg.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Note
  // **********************************************************************
  public int ApriNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Note Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PAR34, IMDBDef4.FLD_PAR34_ROWNAMEMODIF, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef4.TBL_NOTE1, IMDBDef4.FLD_NOTE1_ROWNAMENOTE1, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDET, IMDBDef12.PQSL_POLPROVARDET_NOTA_1, 0));
      IMDB.set_Value(IMDBDef4.TBL_NOTE2, IMDBDef4.FLD_NOTE2_ROWNAMENOTE2, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDET, IMDBDef12.PQSL_POLPROVARDET_NOTA_2, 0));
      IMDB.set_Value(IMDBDef4.TBL_NOTE3, IMDBDef4.FLD_NOTE3_ROWNAMENOTE3, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDET, IMDBDef12.PQSL_POLPROVARDET_NOTA_3, 0));
      IMDB.set_Value(IMDBDef4.TBL_NOTE4, IMDBDef4.FLD_NOTE4_ROWNAMENOTE4, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDET, IMDBDef12.PQSL_POLPROVARDET_NOTA_4, 0));
      IMDB.set_Value(IMDBDef4.TBL_NOTE5, IMDBDef4.FLD_NOTE5_ROWNAMENOTE5, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDET, IMDBDef12.PQSL_POLPROVARDET_NOTA_5, 0));
      MainFrm.Show(MyGlb.FRM_SPECDIGITEST, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliVariazioneDaVariazioniBilancioPeg", "ApriNote", _e);
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
    IDVariant v_CAPT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_RET = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_CAPT = (new IDVariant("Dettagli variazione", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPT));
      PAN_DETTAGVARIAZ.set_Header(Glb.OBJ_FIELD,PFL_DETTAGVARIAZ_IMPORTO1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).stringValue());
      PAN_DETTAGVARIAZ.set_Header(Glb.OBJ_FIELD,PFL_DETTAGVARIAZ_IMPORTO2, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)))).stringValue());
      PAN_DETTAGVARIAZ.set_Header(Glb.OBJ_FIELD,PFL_DETTAGVARIAZ_IMPORTO3, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2)))).stringValue());
      if (MainFrm.VisualizzaRisorsaIntevento(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))
      {
        PAN_DETTAGVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGVARIAZ_VOCEPEGSMALL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGVARIAZ.set_FixedCols((new IDVariant(4)).intValue());
      }
      else
      {
        PAN_DETTAGVARIAZ.set_FixedCols((new IDVariant(3)).intValue());
        PAN_DETTAGVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLOART, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A_GET_SE_OBIETTIVI_POL(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as AGESEOBPOSEE ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_RET = QV.Get("AGESEOBPOSEE", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_RET.equals((new IDVariant(0)), true))
      {
        PAN_DETTAGVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGVARIAZ_OBIETTIVO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(MainFrm.FINANZIAMENT.booleanValue()))
      {
        PAN_DETTAGVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGVARIAZ_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGVARIAZ_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.IsNull(MainFrm.GESTIOECONOM) || (MainFrm.GESTIOECONOM.compareTo((new IDVariant(1)), true)!=0 && MainFrm.GESTIOECONOM.compareTo((new IDVariant(2)), true)!=0))
      {
        PAN_DETTAGVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGVARIAZ_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGVARIAZ_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliVariazioneDaVariazioniBilancioPeg", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Variazione On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGVARIAZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTAGVARIAZ);
      // 
      // Dettagli Variazione On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTAGVARIAZ.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGVARIAZ_DESCRIZIONE,(new IDVariant(PAN_DETTAGVARIAZ.FieldText(PFL_DETTAGVARIAZ_DESCRIZIONE))).stringValue()); 
      PAN_DETTAGVARIAZ.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGVARIAZ_TIPOVAR,(new IDVariant(PAN_DETTAGVARIAZ.FieldText(PFL_DETTAGVARIAZ_TIPOVAR))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliVariazioneDaVariazioniBilancioPeg", "DettagliVariazioneOnDynamicPropertiesEvent", _e);
    }
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
  private void PAN_DETTAGVARIAZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTAGVARIAZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGVARIAZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGVARIAZ, Cancel);
    // Stub
  }

  private void PAN_DETTAGVARIAZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DETTAGVARIAZ_NOTE1)
    {
      this.IdxPanelActived = this.PAN_DETTAGVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DETTAGVARIAZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGVARIAZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGVARIAZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DETTAGVARIAZ_Init()
  {

    PAN_DETTAGVARIAZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGVARIAZ.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTAGVARIAZ_IMPORTI, "F928204A-022B-4A96-848B-C3671481D0C4");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_DETTAGVARIAZ_IMPORTI, "Importi");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTAGVARIAZ_IMPORTI, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTAGVARIAZ_IMPORTI, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGVARIAZ_IMPORTI, MyGlb.PANEL_LIST, 212, -9999, 324, 16, 0, 0);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGVARIAZ_IMPORTI, MyGlb.PANEL_FORM, 0, 99, 156, 97, 0, 0);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGVARIAZ_IMPORTI, 0, 43);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGVARIAZ_IMPORTI, 1, 13);
    PAN_DETTAGVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGVARIAZ_IMPORTI, 0, 4);
    PAN_DETTAGVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGVARIAZ_IMPORTI, 1, 4);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTAGVARIAZ_IMPORTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTAGVARIAZ.SetSize(MyGlb.OBJ_FIELD, 26);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ES, "273C0561-01FA-4E80-B0BB-15B80D50AB74");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ES, "E S");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ES, "Brief description of field content.");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLO, "A33A0EEE-2D45-46CC-92D0-A5311C6BED74");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLO, "CAPITOLO");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLO, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ARTICOLO, "26C1F453-9B10-4A19-B992-59C07AFF5A4F");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ARTICOLO, "ARTICOLO");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ARTICOLO, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NUOVA, "2EDA4815-B439-4FFF-82F6-8B5430E0B5E2");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NUOVA, "Nuova");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NUOVA, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NUOVA, MyGlb.VIS_CHECKSTYLE);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NUOVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO1, "D97F756A-C50E-4522-8A34-B64D06FD7216");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO1, "IMPORTO 1");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO1, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO2, "538E4E5E-880C-4B18-B21C-3BC611BD2AAD");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO2, "IMPORTO 2");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO2, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO3, "FE30A281-3A22-4222-B9B6-C3EF5BD719CD");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO3, "IMPORTO 3");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO3, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CONSSVIL, "F1C1280D-55E4-4B49-A280-C1523D21C5B3");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CONSSVIL, "Cons./Svil.");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CONSSVIL, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CONSSVIL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CONSSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_TIPOVAR, "0953A34C-62CF-4F29-AE3C-83FA6456F27D");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_TIPOVAR, "Tipo Var.");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_TIPOVAR, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_TIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_TIPOVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_DESCRIZIONE, "96D3C995-B99A-4A42-A865-88AD7329A864");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_DESCRIZIONE, "Descrizione");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_DESCRIZIONE, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTE1, "587EFF0B-656F-481D-A981-EC04409CCF70");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTE1, "Note");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTE1, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTE1, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA1, "CFF38767-5244-42DD-8586-0DE7C74A9B99");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA1, "NOTA 1");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA1, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA1, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA2, "3CF5177B-CAA3-41DE-B4F3-A2F0708F0054");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA2, "NOTA 2");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA2, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA2, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA3, "DEDF514B-39D1-4872-815C-8BB125356ABB");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA3, "NOTA 3");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA3, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA3, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA3, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA4, "6B053290-6BC7-49A4-AFC8-1A78017551DD");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA4, "NOTA 4");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA4, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA4, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA4, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA5, "77FC70BB-CDE8-479D-AAC4-7D84040D08C0");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA5, "NOTA 5");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA5, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA5, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA5, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VARBIL, "B8CF726D-1C7A-47E1-817A-B2A84A27B625");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VARBIL, "Var.Bil.");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VARBIL, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VARBIL, MyGlb.VIS_CHECKSTYLE);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VARBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_PROGETTO, "AA4252A1-F8D0-44F4-A978-00B28DC73875");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_PROGETTO, "Obiettivo Operativo");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_PROGETTO, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OBIETTIVO, "20AD37CC-53C3-40BB-947D-AA9A9DFCF526");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OBIETTIVO, "Obiettivo Gestionale");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OBIETTIVO, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OBIETTIVO, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OBIETTIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_SCHEDAOBIETT, "438CA4CF-3916-4BBE-86D0-218C6D0932B7");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_SCHEDAOBIETT, "Scheda Obiettivo");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_SCHEDAOBIETT, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_SCHEDAOBIETT, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_SCHEDAOBIETT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FATTORE, "B0D29E63-28A3-4AFC-BA12-8F9ACD312677");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FATTORE, "Fattore");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FATTORE, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CENTRO, "22335213-444C-4CC6-9CF0-74E9E3EF5902");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CENTRO, "Centro");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CENTRO, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FINANZIAMENT, "8A608544-A042-4A02-ACEB-6912E8CCCC13");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FINANZIAMENT, "Finanziamento");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FINANZIAMENT, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OPERA, "A928770D-170E-4796-9BC5-1AE9E1FBABEE");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OPERA, "Opera");
    PAN_DETTAGVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OPERA, "");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VOCEPEGSMALL, "C8B7F79E-D871-4E37-839F-84E1D13592F9");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VOCEPEGSMALL, "Voce P.e.g.");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VOCEPEGSMALL, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VOCEPEGSMALL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLOART, "08FCFC29-F755-4C8D-B075-93D78649A91F");
    PAN_DETTAGVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLOART, "Capitolo/Art.");
    PAN_DETTAGVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DETTAGVARIAZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ES, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ES, MyGlb.PANEL_LIST, 24);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ES, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ES, MyGlb.PANEL_LIST, "E S");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ES, MyGlb.PANEL_FORM, 4, 4, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ES, MyGlb.PANEL_FORM, 24);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ES, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ES, MyGlb.PANEL_FORM, "E S");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_ES, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_ES, PPQRY_POLPROVARDET, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLO, MyGlb.PANEL_LIST, 48, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLO, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLO, MyGlb.PANEL_FORM, 4, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_CAPITOLO, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_CAPITOLO, PPQRY_POLPROVARDET, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ARTICOLO, MyGlb.PANEL_LIST, 148, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ARTICOLO, MyGlb.PANEL_FORM, 4, 76, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_ARTICOLO, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_ARTICOLO, PPQRY_POLPROVARDET, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NUOVA, MyGlb.PANEL_LIST, 172, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NUOVA, MyGlb.PANEL_LIST, 92);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NUOVA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NUOVA, MyGlb.PANEL_LIST, "Nuov.");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NUOVA, MyGlb.PANEL_FORM, 4, 100, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NUOVA, MyGlb.PANEL_FORM, 92);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NUOVA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NUOVA, MyGlb.PANEL_FORM, "Nuova");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_NUOVA, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_NUOVA, PPQRY_POLPROVARDET, "A.ISTITUZIONE_NC", "ISTITUZIONE_NC", 5, 2, 0, -13997);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NUOVA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NUOVA, (new IDVariant()), "Null", "", "", -1);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO1, MyGlb.PANEL_LIST, 212, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO1, MyGlb.PANEL_LIST, "IMPORTO 1");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO1, MyGlb.PANEL_FORM, 4, 124, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO1, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO1, MyGlb.PANEL_FORM, "IMP. 1");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_IMPORTO1, -1, GRP_DETTAGVARIAZ_IMPORTI);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_IMPORTO1, PPQRY_POLPROVARDET, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO2, MyGlb.PANEL_LIST, 320, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO2, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO2, MyGlb.PANEL_LIST, "IMPORTO 2");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO2, MyGlb.PANEL_FORM, 4, 148, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO2, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO2, MyGlb.PANEL_FORM, "IMP. 2");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_IMPORTO2, -1, GRP_DETTAGVARIAZ_IMPORTI);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_IMPORTO2, PPQRY_POLPROVARDET, "A.IMPORTO_2", "IMPORTO_2", 3, 14, 2, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO3, MyGlb.PANEL_LIST, 428, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO3, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO3, MyGlb.PANEL_LIST, "IMPORTO 3");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO3, MyGlb.PANEL_FORM, 4, 172, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO3, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_IMPORTO3, MyGlb.PANEL_FORM, "IMP. 3");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_IMPORTO3, -1, GRP_DETTAGVARIAZ_IMPORTI);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_IMPORTO3, PPQRY_POLPROVARDET, "A.IMPORTO_3", "IMPORTO_3", 3, 14, 2, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CONSSVIL, MyGlb.PANEL_LIST, 536, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CONSSVIL, MyGlb.PANEL_LIST, 88);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CONSSVIL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CONSSVIL, MyGlb.PANEL_LIST, "Cons./Svil.");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CONSSVIL, MyGlb.PANEL_FORM, 4, 196, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CONSSVIL, MyGlb.PANEL_FORM, 88);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CONSSVIL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CONSSVIL, MyGlb.PANEL_FORM, "Cons./Svil.");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_CONSSVIL, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_CONSSVIL, PPQRY_POLPROVARDET, "A.CONS_SVILUPPO", "CONS_SVILUPPO", 5, 1, 0, -13997);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_CONSSVIL, (new IDVariant("C")), "Consolidato", "", "", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_CONSSVIL, (new IDVariant("S")), "Sviluppo", "", "", -1);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_TIPOVAR, MyGlb.PANEL_LIST, 604, 36, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_TIPOVAR, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_TIPOVAR, MyGlb.PANEL_LIST, "Tipo Var.");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_TIPOVAR, MyGlb.PANEL_FORM, 4, 220, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_TIPOVAR, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_TIPOVAR, MyGlb.PANEL_FORM, "Tipo Var.");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_TIPOVAR, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_TIPOVAR, PPQRY_POLPROVARDET, "A.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_DESCRIZIONE, MyGlb.PANEL_LIST, 820, 36, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 244, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_DESCRIZIONE, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldUnbound(PFL_DETTAGVARIAZ_DESCRIZIONE, true);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_DESCRIZIONE, PPQRY_POLPROVARDET, "SUBSTR(A.DESCRIZIONE, 1, 30)", "DESCRIZIONE", 5, 99, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTE1, MyGlb.PANEL_LIST, 1036, 36, 32, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTE1, MyGlb.PANEL_LIST, 32);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTE1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTE1, MyGlb.PANEL_LIST, "Note");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTE1, MyGlb.PANEL_FORM, 4, 688, 464, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTE1, MyGlb.PANEL_FORM, 32);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTE1, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTE1, MyGlb.PANEL_FORM, "Note");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_NOTE1, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldUnbound(PFL_DETTAGVARIAZ_NOTE1, true);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_NOTE1, PPQRY_POLPROVARDET, "CASE WHEN NOT ((A.NOTA_1 IS NULL)) OR NOT ((A.NOTA_2 IS NULL)) OR NOT ((A.NOTA_3 IS NULL)) OR NOT ((A.NOTA_4 IS NULL)) OR NOT ((A.NOTA_5 IS NULL)) THEN 'P' ELSE 'N' END", "RECORDNOTE", 5, 99, 0, -13997);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_NOTE1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA1, MyGlb.PANEL_LIST, 1012, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA1, MyGlb.PANEL_LIST, 48);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA1, MyGlb.PANEL_LIST, "NOTA 1");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA1, MyGlb.PANEL_FORM, 4, 280, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA1, MyGlb.PANEL_FORM, 48);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA1, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA1, MyGlb.PANEL_FORM, "NOTA 1");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_NOTA1, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_NOTA1, PPQRY_POLPROVARDET, "A.NOTA_1", "NOTA_1", 5, 400, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA2, MyGlb.PANEL_LIST, 1444, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA2, MyGlb.PANEL_LIST, 48);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA2, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA2, MyGlb.PANEL_LIST, "NOTA 2");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA2, MyGlb.PANEL_FORM, 4, 328, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA2, MyGlb.PANEL_FORM, 48);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA2, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA2, MyGlb.PANEL_FORM, "NOTA 2");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_NOTA2, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_NOTA2, PPQRY_POLPROVARDET, "A.NOTA_2", "NOTA_2", 5, 400, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA3, MyGlb.PANEL_LIST, 1876, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA3, MyGlb.PANEL_LIST, 48);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA3, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA3, MyGlb.PANEL_LIST, "NOTA 3");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA3, MyGlb.PANEL_FORM, 4, 376, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA3, MyGlb.PANEL_FORM, 48);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA3, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA3, MyGlb.PANEL_FORM, "NOTA 3");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_NOTA3, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_NOTA3, PPQRY_POLPROVARDET, "A.NOTA_3", "NOTA_3", 5, 400, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA4, MyGlb.PANEL_LIST, 2308, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA4, MyGlb.PANEL_LIST, 48);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA4, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA4, MyGlb.PANEL_LIST, "NOTA 4");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA4, MyGlb.PANEL_FORM, 4, 424, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA4, MyGlb.PANEL_FORM, 48);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA4, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA4, MyGlb.PANEL_FORM, "NOTA 4");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_NOTA4, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_NOTA4, PPQRY_POLPROVARDET, "A.NOTA_4", "NOTA_4", 5, 400, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA5, MyGlb.PANEL_LIST, 2740, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA5, MyGlb.PANEL_LIST, 48);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA5, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA5, MyGlb.PANEL_LIST, "NOTA 5");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA5, MyGlb.PANEL_FORM, 4, 472, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA5, MyGlb.PANEL_FORM, 48);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA5, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_NOTA5, MyGlb.PANEL_FORM, "NOTA 5");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_NOTA5, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_NOTA5, PPQRY_POLPROVARDET, "A.NOTA_5", "NOTA_5", 5, 400, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VARBIL, MyGlb.PANEL_LIST, 1068, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VARBIL, MyGlb.PANEL_LIST, 48);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VARBIL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VARBIL, MyGlb.PANEL_LIST, "Var.Bil.");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VARBIL, MyGlb.PANEL_FORM, 4, 520, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VARBIL, MyGlb.PANEL_FORM, 48);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VARBIL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VARBIL, MyGlb.PANEL_FORM, "Var.Bil.");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_VARBIL, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_VARBIL, PPQRY_POLPROVARDET, "A.VAR_BIL", "VAR_BIL", 5, 2, 0, -13997);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_VARBIL, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DETTAGVARIAZ.SetValueListItem(PFL_DETTAGVARIAZ_VARBIL, (new IDVariant()), "Null", "", "", -1);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_PROGETTO, MyGlb.PANEL_LIST, 1112, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_PROGETTO, MyGlb.PANEL_FORM, 4, 544, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_PROGETTO, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_PROGETTO, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_PROGETTO, PPQRY_POLPROVARDET, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OBIETTIVO, MyGlb.PANEL_LIST, 1176, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OBIETTIVO, MyGlb.PANEL_LIST, 124);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OBIETTIVO, MyGlb.PANEL_LIST, "Obiettivo Gestionale");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OBIETTIVO, MyGlb.PANEL_FORM, 4, 736, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OBIETTIVO, MyGlb.PANEL_FORM, 124);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OBIETTIVO, MyGlb.PANEL_FORM, "Obiettivo Gestionale");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_OBIETTIVO, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_OBIETTIVO, PPQRY_POLOBIETTIVI, "A.CODICE", "POLOBIETCODI", 5, 10, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_SCHEDAOBIETT, MyGlb.PANEL_LIST, 1176, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_SCHEDAOBIETT, MyGlb.PANEL_LIST, 120);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_SCHEDAOBIETT, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_SCHEDAOBIETT, MyGlb.PANEL_LIST, "Scheda Obiettivo");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_SCHEDAOBIETT, MyGlb.PANEL_FORM, 4, 568, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_SCHEDAOBIETT, MyGlb.PANEL_FORM, 120);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_SCHEDAOBIETT, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_SCHEDAOBIETT, MyGlb.PANEL_FORM, "Scheda Obiettivo");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_SCHEDAOBIETT, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_SCHEDAOBIETT, PPQRY_POLPROVARDET, "A.SCHEDA_OBIETTIVO_ID", "SCHEDA_OBIETTIVO_ID", 3, 10, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FATTORE, MyGlb.PANEL_LIST, 1244, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FATTORE, MyGlb.PANEL_FORM, 4, 592, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_FATTORE, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_FATTORE, PPQRY_POLPROVARDET, "A.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CENTRO, MyGlb.PANEL_LIST, 1300, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CENTRO, MyGlb.PANEL_FORM, 4, 616, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_CENTRO, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_CENTRO, PPQRY_POLPROVARDET, "A.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FINANZIAMENT, MyGlb.PANEL_LIST, 1360, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanz.");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 640, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_FINANZIAMENT, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_FINANZIAMENT, PPQRY_POLPROVARDET, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OPERA, MyGlb.PANEL_LIST, 1440, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OPERA, MyGlb.PANEL_LIST, 44);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OPERA, MyGlb.PANEL_FORM, 4, 664, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OPERA, MyGlb.PANEL_FORM, 44);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_OPERA, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_OPERA, PPQRY_POLPROVARDET, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VOCEPEGSMALL, MyGlb.PANEL_LIST, 48, 0, 72, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VOCEPEGSMALL, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VOCEPEGSMALL, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VOCEPEGSMALL, MyGlb.PANEL_FORM, 100, 0, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VOCEPEGSMALL, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_VOCEPEGSMALL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_VOCEPEGSMALL, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_VOCEPEGSMALL, -1, "", "VOCEPEGSMALL", 0, 0, 0, -13997);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLOART, MyGlb.PANEL_LIST, 48, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLOART, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLOART, MyGlb.PANEL_FORM, 108, 8, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGVARIAZ_CAPITOLOART, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGVARIAZ.SetFieldPage(PFL_DETTAGVARIAZ_CAPITOLOART, -1, -1);
    PAN_DETTAGVARIAZ.SetFieldPanel(PFL_DETTAGVARIAZ_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
  }

  private void PAN_DETTAGVARIAZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGVARIAZ.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as POLOBIETCODI ");
    SQL.append("from ");
    SQL.append("  POL_OBIETTIVI A, ");
    SQL.append("  POL_SCHEDE_OBIETTIVO B ");
    SQL.append("where (B.SCHEDA_OBIETTIVO_ID = ~~SCHEDA_OBIETTIVO_ID~~) ");
    SQL.append("and   (B.OBIETTIVO_ID = A.OBIETTIVO_ID) ");
    PAN_DETTAGVARIAZ.SetQuery(PPQRY_POLOBIETTIVI, 0, SQL, -1, "");
    PAN_DETTAGVARIAZ.SetQueryDB(PPQRY_POLOBIETTIVI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGVARIAZ.SetMasterTable(PPQRY_POLOBIETTIVI, "POL_OBIETTIVI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    PAN_DETTAGVARIAZ.SetQuery(PPQRY_T54, 0, SQL, PFL_DETTAGVARIAZ_TIPOVAR, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    PAN_DETTAGVARIAZ.SetQuery(PPQRY_T54, 1, SQL, PFL_DETTAGVARIAZ_TIPOVAR, "");
    PAN_DETTAGVARIAZ.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGVARIAZ.SetIMDB(IMDB, "PQRY_POLPROVARDET", true);
    PAN_DETTAGVARIAZ.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ISTITUZIONE_NC as ISTITUZIONE_NC, ");
    SQL.append("  A.IMPORTO_1 as IMPORTO_1, ");
    SQL.append("  A.IMPORTO_2 as IMPORTO_2, ");
    SQL.append("  A.IMPORTO_3 as IMPORTO_3, ");
    SQL.append("  A.CONS_SVILUPPO as CONS_SVILUPPO, ");
    SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 1, 30) as DESCRIZIONE, ");
    SQL.append("  A.NOTA_1 as NOTA_1, ");
    SQL.append("  A.NOTA_2 as NOTA_2, ");
    SQL.append("  A.NOTA_3 as NOTA_3, ");
    SQL.append("  A.NOTA_4 as NOTA_4, ");
    SQL.append("  A.NOTA_5 as NOTA_5, ");
    SQL.append("  A.VAR_BIL as VAR_BIL, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.SCHEDA_OBIETTIVO_ID as SCHEDA_OBIETTIVO_ID, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  CASE WHEN NOT ((A.NOTA_1 IS NULL)) OR NOT ((A.NOTA_2 IS NULL)) OR NOT ((A.NOTA_3 IS NULL)) OR NOT ((A.NOTA_4 IS NULL)) OR NOT ((A.NOTA_5 IS NULL)) THEN 'P' ELSE 'N' END as RECORDNOTE ");
    PAN_DETTAGVARIAZ.SetQuery(PPQRY_POLPROVARDET, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT A ");
    PAN_DETTAGVARIAZ.SetQuery(PPQRY_POLPROVARDET, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.VARIAZIONE_ID = ~~TBL_IN9.ROWNAMEVARID~~) ");
    PAN_DETTAGVARIAZ.SetQuery(PPQRY_POLPROVARDET, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGVARIAZ.SetQuery(PPQRY_POLPROVARDET, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGVARIAZ.SetQuery(PPQRY_POLPROVARDET, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_DETTAGVARIAZ.SetQuery(PPQRY_POLPROVARDET, 5, SQL, -1, "");
    PAN_DETTAGVARIAZ.SetQueryDB(PPQRY_POLPROVARDET, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGVARIAZ.SetMasterTable(0, "POL_PROPOSTE_VAR_DETT");
    PAN_DETTAGVARIAZ.AddToSortList(PFL_DETTAGVARIAZ_ES, true);
    PAN_DETTAGVARIAZ.AddToSortList(PFL_DETTAGVARIAZ_CAPITOLO, true);
    PAN_DETTAGVARIAZ.AddToSortList(PFL_DETTAGVARIAZ_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGVARIAZ.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGVARIAZ.iUseListQBE;
      PAN_DETTAGVARIAZ.iUseListQBE = 0;
      PAN_DETTAGVARIAZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGVARIAZ.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGVARIAZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DETTAGVARIAZ) PAN_DETTAGVARIAZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGVARIAZ) PAN_DETTAGVARIAZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTAGVARIAZ) PAN_DETTAGVARIAZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGVARIAZ) PAN_DETTAGVARIAZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DETTAGVARIAZ) PAN_DETTAGVARIAZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
