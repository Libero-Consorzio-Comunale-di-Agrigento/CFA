// **********************************************
// Dettagli Mandato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DettagliMandato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_DETTAGMANDAT_NUMEROLIQ = 0;
  private static int PFL_DETTAGMANDAT_DDATAREG = 1;
  private static int PFL_DETTAGMANDAT_LIQUIDAZIONE = 2;
  private static int PFL_DETTAGMANDAT_IMPORTO = 3;
  private static int PFL_DETTAGMANDAT_RITENUTE = 4;
  private static int PFL_DETTAGMANDAT_PAGATO = 5;
  private static int PFL_DETTAGMANDAT_BENEFICIARIO = 6;
  private static int PFL_DETTAGMANDAT_NUMERODOC = 7;
  private static int PFL_DETTAGMANDAT_DDATADOC = 8;
  private static int PFL_DETTAGMANDAT_DOCUMENTO = 9;
  private static int PFL_DETTAGMANDAT_QUIETANZA = 10;
  private static int PFL_DETTAGMANDAT_INFOQUIETANZ = 11;
  private static int PFL_DETTAGMANDAT_SEDEDEL = 12;
  private static int PFL_DETTAGMANDAT_NUMERODEL = 13;
  private static int PFL_DETTAGMANDAT_ANNODEL = 14;
  private static int PFL_DETTAGMANDAT_DELIBERA = 15;
  private static int PFL_DETTAGMANDAT_PROGRTESORIE = 16;
  private static int PFL_DETTAGMANDAT_DISTINTECNIC = 17;
  private static int PFL_DETTAGMANDAT_UFFICIO = 18;
  private static int PFL_DETTAGMANDAT_DESCRIZIONE = 19;
  private static int PFL_DETTAGMANDAT_CGU = 20;
  private static int PFL_DETTAGMANDAT_FINANZIAMENT = 21;
  private static int PFL_DETTAGMANDAT_SOMMAIMPORTO = 22;
  private static int PFL_DETTAGMANDAT_SOMMARITENUT = 23;
  private static int PFL_DETTAGMANDAT_SOMMAPAGATO = 24;
  private static int PFL_DETTAGMANDAT_CODICE = 25;
  private static int PFL_DETTAGMANDAT_NUMQUIETANZA = 26;
  private static int PFL_DETTAGMANDAT_ORD1 = 27;
  private static int PFL_DETTAGMANDAT_ORD2 = 28;
  private static int PFL_DETTAGMANDAT_TIPODOCUMENT = 29;

  private static int PPQRY_LIQ20 = 0;


  IDPanel PAN_DETTAGMANDAT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM85(IMDB);
    //
    //
    Init_PQRY_LIQ20(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM85(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM85, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM85, "TBL_PARAM85");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM85,IMDBDef2.FLD_PARAM85_ROWNAMANNMAN, "ROWNAMANNMAN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM85,IMDBDef2.FLD_PARAM85_ROWNAMANNMAN,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM85,IMDBDef2.FLD_PARAM85_ROWNAMNUMMAN, "ROWNAMNUMMAN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM85,IMDBDef2.FLD_PARAM85_ROWNAMNUMMAN,1,10,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM85, 0);
  }

  private static void Init_PQRY_LIQ20(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_LIQ20, 25);
    IMDB.set_TblCode(IMDBDef9.PQRY_LIQ20, "PQRY_LIQ20");
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQDDATAREG, "LIQDDATAREG");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQDDATAREG,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIBERASOESES, "LIBERASOESES");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQFATDDATDO, "LIQFATDDATDO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQFATDDATDO,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQQUIETANZA, "LIQQUIETANZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQQUIETANZA,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQUFFICIO, "LIQUFFICIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQUFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQSEDEDEL, "LIQSEDEDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQNUMERODEL, "LIQNUMERODEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQNUMERODEL,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQANNODEL, "LIQANNODEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQFATNUMDOC, "LIQFATNUMDOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQFATNUMDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQRITENUTE, "LIQRITENUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQRITENUTE,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQPROGRTESO, "LIQPROGRTESO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQPROGRTESO,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_DISTINTECNIC, "DISTINTECNIC");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_DISTINTECNIC,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQPAGATO, "LIQPAGATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQPAGATO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_UFFICIO,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_FINANZIAMENT, "FINANZIAMENT");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_FINANZIAMENT,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_CGU, "CGU");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_CGU,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQQTNCODICE, "LIQQTNCODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQQTNCODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQQTNNUMQUI, "LIQQTNNUMQUI");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQQTNNUMQUI,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_ORD1, "ORD1");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_ORD1,2,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_ORD2, "ORD2");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_ORD2,1,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_ANNOLIQ, "ANNOLIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_ANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQINFOQUIET, "LIQINFOQUIET");
    IMDB.SetFldParams(IMDBDef9.PQRY_LIQ20,IMDBDef9.PQSL_LIQ20_LIQINFOQUIET,5,99,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_LIQ20, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DettagliMandato(MyWebEntryPoint w, IMDBObj imdb)
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
  public DettagliMandato()
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
    FormIdx = MyGlb.FRM_DETTAGMANDAT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "66BD9D5B-9401-46D7-A213-9671C3929BDB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 740;
    DesignHeight = 326;
    set_Caption(new IDVariant("Dettagli Mandato"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 740;
    Frames[1].Height = 300;
    Frames[1].Caption = "Dettagli Mandato";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 300;
    PAN_DETTAGMANDAT = new IDPanel(w, this, 1, "PAN_DETTAGMANDAT");
    Frames[1].Content = PAN_DETTAGMANDAT;
    PAN_DETTAGMANDAT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGMANDAT.VS = MainFrm.VisualStyleList;
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 740-MyGlb.PAN_OFFS_X, 300-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E1EF608C-7E0F-4A53-88F3-E28AA6006B30");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 36, 1912, 96, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGMANDAT.InitStatus = 2;
    PAN_DETTAGMANDAT_Init();
    PAN_DETTAGMANDAT_InitFields();
    PAN_DETTAGMANDAT_InitQueries();
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
      PAN_DETTAGMANDAT.UpdatePanel(MainFrm);
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
    return (obj instanceof DettagliMandato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DettagliMandato.class.getName() : (Glb.ClassWithPackage(DettagliMandato.class) ? DettagliMandato.class.getName().substring(DettagliMandato.class.getPackage().getName().length() + 1) : DettagliMandato.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Dettagli Mandato On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGMANDAT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTAGMANDAT);
      // 
      // Dettagli Mandato On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTAGMANDAT.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGMANDAT_UFFICIO,IMDB.Value(IMDBDef9.PQRY_LIQ20, IMDBDef9.PQSL_LIQ20_UFFICIO, 0).stringValue()); 
      PAN_DETTAGMANDAT.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGMANDAT_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_LIQ20, IMDBDef9.PQSL_LIQ20_DESCRIZIONE, 0).stringValue()); 
      PAN_DETTAGMANDAT.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGMANDAT_CGU,IMDB.Value(IMDBDef9.PQRY_LIQ20, IMDBDef9.PQSL_LIQ20_CGU, 0).stringValue()); 
      PAN_DETTAGMANDAT.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGMANDAT_FINANZIAMENT,IMDB.Value(IMDBDef9.PQRY_LIQ20, IMDBDef9.PQSL_LIQ20_FINANZIAMENT, 0).stringValue()); 
      PAN_DETTAGMANDAT.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGMANDAT_BENEFICIARIO,IMDB.Value(IMDBDef9.PQRY_LIQ20, IMDBDef9.PQSL_LIQ20_LIBERASOESES, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliMandato", "DettagliMandatoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Mandato After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DETTAGMANDAT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Mandato After Find Event Body
      // Procedure Body
      // 
      PAN_DETTAGMANDAT.set_FieldText(PFL_DETTAGMANDAT_SOMMAIMPORTO, IDL.NullValue(IDL.ToString(PAN_DETTAGMANDAT.GetFieldSum(PFL_DETTAGMANDAT_IMPORTO)),(new IDVariant("0"))).stringValue());
      PAN_DETTAGMANDAT.set_FieldText(PFL_DETTAGMANDAT_SOMMARITENUT, IDL.NullValue(IDL.ToString(PAN_DETTAGMANDAT.GetFieldSum(PFL_DETTAGMANDAT_RITENUTE)),(new IDVariant("0"))).stringValue());
      PAN_DETTAGMANDAT.set_FieldText(PFL_DETTAGMANDAT_SOMMAPAGATO, IDL.NullValue(IDL.ToString(PAN_DETTAGMANDAT.GetFieldSum(PFL_DETTAGMANDAT_PAGATO)),(new IDVariant("0"))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliMandato", "DettagliMandatoAfterFindEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAM85, IMDBDef2.FLD_PARAM85_ROWNAMANNMAN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM85, IMDBDef2.FLD_PARAM85_ROWNAMNUMMAN, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliMandato", "UnloadEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Dettagli Estratto Conto", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_DETTAGMANDAT.set_Header(Glb.OBJ_FIELD,PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("")).stringValue());
      set_Caption(new IDVariant(v_CAPTION));
      PAN_DETTAGMANDAT.set_FieldText(PFL_DETTAGMANDAT_TIPODOCUMENT, IDL.Add(IDL.Add(IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_FAT_DESCRIZIONE, 0), (new IDVariant(" "))), IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_DOCUMENTO, 0)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliMandato", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Cmd Info Quietanza
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CmdInfoQuietanza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cmd Info Quietanza Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI237, IMDBDef1.FLD_PARAMETRI237_BENEFICIARIO, 0, IMDB.Value(IMDBDef9.PQRY_LIQ20, IMDBDef9.PQSL_LIQ20_LIQQTNCODICE, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI237, IMDBDef1.FLD_PARAMETRI237_NUM_QUIETANZA, 0, IMDB.Value(IMDBDef9.PQRY_LIQ20, IMDBDef9.PQSL_LIQ20_LIQQTNNUMQUI, 0));
      MainFrm.Show(MyGlb.FRM_INFOQUIETANZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliMandato", "CmdInfoQuietanza", _e);
      return -1;
    }
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
  private void PAN_DETTAGMANDAT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTAGMANDAT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGMANDAT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGMANDAT, Cancel);
    // Stub
  }

  private void PAN_DETTAGMANDAT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DETTAGMANDAT_INFOQUIETANZ)
    {
      this.IdxPanelActived = this.PAN_DETTAGMANDAT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CmdInfoQuietanza();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DETTAGMANDAT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGMANDAT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGMANDAT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DETTAGMANDAT_Init()
  {

    PAN_DETTAGMANDAT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGMANDAT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DETTAGMANDAT.SetSize(MyGlb.OBJ_FIELD, 30);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMEROLIQ, "47DEF5A7-A4FD-452C-AE86-489EA6C13D2D");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMEROLIQ, "NUMERO LIQ");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMEROLIQ, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATAREG, "9EC458EC-014D-42A5-B5D1-1C232CA1B723");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATAREG, "D DATA REG");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATAREG, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_LIQUIDAZIONE, "70837D64-C4DD-469A-AAC7-823CC755FF2C");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_LIQUIDAZIONE, "Liquidazione");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_LIQUIDAZIONE, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_LIQUIDAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_IMPORTO, "C4C68AE5-15E9-4559-8830-7BABF175CFC4");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_IMPORTO, "Importo");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_IMPORTO, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_RITENUTE, "003EF50B-728C-4038-BD27-60C3A2B17D58");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_RITENUTE, "Ritenute");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_RITENUTE, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_RITENUTE, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_RITENUTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PAGATO, "5AE771A5-496E-4F38-8955-072D731FE189");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PAGATO, "Pagato");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PAGATO, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PAGATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_BENEFICIARIO, "3D9C12FB-C8DF-4E53-9695-645CDEAE708B");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_BENEFICIARIO, "Beneficiario");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_BENEFICIARIO, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODOC, "A2A49473-AE14-42FB-88DD-1F90B2C7C4FC");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODOC, "NUMERO DOC");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODOC, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATADOC, "C1367164-12FA-42E2-A5F0-B012432F2035");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATADOC, "D DATA DOC");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATADOC, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DOCUMENTO, "6743DEB6-B2FF-4281-BC5E-A111228392C9");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DOCUMENTO, "Documento");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DOCUMENTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DOCUMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_QUIETANZA, "817C70C8-46C1-4853-85D7-1B7D37A8003C");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_QUIETANZA, "Quietanza");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_QUIETANZA, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_INFOQUIETANZ, "545D4211-27F9-4CB9-8E3A-97FDA76CF66B");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_INFOQUIETANZ, "Info Quietanza");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_INFOQUIETANZ, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_INFOQUIETANZ, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_INFOQUIETANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SEDEDEL, "32C0D058-C8DC-44EA-9AE7-D76C05B80185");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SEDEDEL, "SEDE DEL");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SEDEDEL, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODEL, "1D717C38-1F38-4B92-8C10-F5224B9AF962");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODEL, "NUMERO DEL");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODEL, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ANNODEL, "BC5F04FC-1BDB-4618-90A8-DA10423BEDEB");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ANNODEL, "ANNO DEL");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ANNODEL, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DELIBERA, "73665433-DA27-4DF8-80D9-2FA407874F63");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DELIBERA, "Delibera");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DELIBERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DELIBERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PROGRTESORIE, "484DFC15-BAB2-4600-B60E-FCDA6BB04CAD");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PROGRTESORIE, "Progr. Tesoriere");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PROGRTESORIE, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PROGRTESORIE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PROGRTESORIE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DISTINTECNIC, "4B1ABF31-6464-4595-AFFF-804DA502C04B");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DISTINTECNIC, "Distinta Tecnica");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DISTINTECNIC, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DISTINTECNIC, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DISTINTECNIC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_UFFICIO, "DEDBB5B6-CBD6-41E2-BA51-A8A08B9D50A6");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_UFFICIO, "Ufficio");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_UFFICIO, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_UFFICIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DESCRIZIONE, "47839564-CE6B-4025-9557-2DD15E9A1439");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DESCRIZIONE, "Descrizione");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DESCRIZIONE, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CGU, "6AF89580-63A8-4AE8-BF68-38089D40C867");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CGU, "Cgu");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CGU, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CGU, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CGU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_FINANZIAMENT, "98E73E8F-B4E1-4C7D-9EED-AD5F3F7A1926");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_FINANZIAMENT, "Finanziamento");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_FINANZIAMENT, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAIMPORTO, "D6B68F8E-3910-45A6-B69B-5CF4A5CC6D22");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAIMPORTO, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAIMPORTO, MyGlb.VIS_CAMPTOTADISA);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAIMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMARITENUT, "8AD1D238-E814-477C-91BB-74884B744B4B");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMARITENUT, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMARITENUT, MyGlb.VIS_CAMPTOTADISA);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMARITENUT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAPAGATO, "042F850A-0D06-4431-9C36-7F1578531702");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAPAGATO, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAPAGATO, MyGlb.VIS_CAMPTOTADISA);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAPAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CODICE, "E5FC27D2-093C-465F-B41F-294B6F66B922");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CODICE, "CODICE");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CODICE, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CODICE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CODICE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMQUIETANZA, "E839DBF4-B781-4DA2-A9BF-C12A8FB5CBE1");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMQUIETANZA, "NUM QUIETANZA");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMQUIETANZA, "");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMQUIETANZA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMQUIETANZA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD1, "A6D044C2-04AC-4674-A276-E653CD2F6BDC");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD1, "Ord1");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD1, "Null Value (LIQ DIVERSO BEN, LIQ BENEFICIARIO)");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD1, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD2, "207310ED-9980-431A-AD60-C5DFC6F38ECD");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD2, "Ord2");
    PAN_DETTAGMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD2, "To Integer (If (Is Null (LIQ DIVERSO BEN), LIQ NUM QUIETANZA, LIQ NUM QUIETANZA DIV BEN))");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD2, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_TIPODOCUMENT, "A7C968D5-0390-48FF-AFA8-56D2A7DEB3ED");
    PAN_DETTAGMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_TIPODOCUMENT, "l");
    PAN_DETTAGMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_TIPODOCUMENT, MyGlb.VIS_VUOGRAALILEF);
    PAN_DETTAGMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_TIPODOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DETTAGMANDAT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMEROLIQ, MyGlb.PANEL_LIST, 0, 72, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMEROLIQ, MyGlb.PANEL_LIST, "NUM. LIQ");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMEROLIQ, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMEROLIQ, MyGlb.PANEL_FORM, "NUM. LIQ");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_NUMEROLIQ, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_NUMEROLIQ, PPQRY_LIQ20, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATAREG, MyGlb.PANEL_LIST, 40, 72, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATAREG, MyGlb.PANEL_LIST, 68);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATAREG, MyGlb.PANEL_LIST, "D DATA REG");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATAREG, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATAREG, MyGlb.PANEL_FORM, 68);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATAREG, MyGlb.PANEL_FORM, "D DT. REG");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_DDATAREG, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_DDATAREG, PPQRY_LIQ20, "A.D_DATA_REG", "LIQDDATAREG", 6, 10, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_LIQUIDAZIONE, MyGlb.PANEL_LIST, 0, 36, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_LIQUIDAZIONE, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_LIQUIDAZIONE, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_LIQUIDAZIONE, MyGlb.PANEL_FORM, 0, 0, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_LIQUIDAZIONE, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_LIQUIDAZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_LIQUIDAZIONE, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_LIQUIDAZIONE, -1, "", "LIQUIDAZIONE", 0, 0, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_IMPORTO, MyGlb.PANEL_LIST, 108, 72, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_IMPORTO, MyGlb.PANEL_FORM, 4, 148, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_IMPORTO, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_IMPORTO, PPQRY_LIQ20, "A.IMPORTO", "LIQIMPORTO", 3, 14, 2, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_RITENUTE, MyGlb.PANEL_LIST, 196, 72, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_RITENUTE, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_RITENUTE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_RITENUTE, MyGlb.PANEL_LIST, "Ritenute");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_RITENUTE, MyGlb.PANEL_FORM, 4, 172, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_RITENUTE, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_RITENUTE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_RITENUTE, MyGlb.PANEL_FORM, "Ritenute");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_RITENUTE, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_RITENUTE, PPQRY_LIQ20, "A.RITENUTE", "LIQRITENUTE", 3, 14, 2, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PAGATO, MyGlb.PANEL_LIST, 284, 72, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PAGATO, MyGlb.PANEL_LIST, 96);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PAGATO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PAGATO, MyGlb.PANEL_LIST, "Pagato");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PAGATO, MyGlb.PANEL_FORM, 4, 196, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PAGATO, MyGlb.PANEL_FORM, 96);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PAGATO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PAGATO, MyGlb.PANEL_FORM, "Pagato");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_PAGATO, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_PAGATO, PPQRY_LIQ20, "A.IMPORTO_PAGAM", "LIQPAGATO", 3, 14, 2, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_BENEFICIARIO, MyGlb.PANEL_LIST, 372, 72, 148, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_BENEFICIARIO, MyGlb.PANEL_LIST, 100);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 220, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_BENEFICIARIO, MyGlb.PANEL_FORM, 100);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_BENEFICIARIO, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_BENEFICIARIO, PPQRY_LIQ20, "B.RAGIONE_SOCIALE_ESTESA", "LIBERASOESES", 5, 60, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODOC, MyGlb.PANEL_LIST, 520, 72, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODOC, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODOC, MyGlb.PANEL_FORM, 4, 244, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODOC, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_NUMERODOC, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_NUMERODOC, PPQRY_LIQ20, "D.NUMERO_DOC", "LIQFATNUMDOC", 5, 20, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATADOC, MyGlb.PANEL_LIST, 624, 72, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATADOC, MyGlb.PANEL_LIST, 72);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATADOC, MyGlb.PANEL_LIST, "D DATA DOC");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATADOC, MyGlb.PANEL_FORM, 4, 268, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATADOC, MyGlb.PANEL_FORM, 72);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DDATADOC, MyGlb.PANEL_FORM, "D DT. DOC");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_DDATADOC, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_DDATADOC, PPQRY_LIQ20, "D.D_DATA_DOC", "LIQFATDDATDO", 6, 10, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DOCUMENTO, MyGlb.PANEL_LIST, 520, 36, 164, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DOCUMENTO, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DOCUMENTO, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DOCUMENTO, MyGlb.PANEL_FORM, 8, 8, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DOCUMENTO, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DOCUMENTO, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_DOCUMENTO, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_DOCUMENTO, -1, "", "DOCUMENTO", 0, 0, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_QUIETANZA, MyGlb.PANEL_LIST, 684, 72, 172, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_QUIETANZA, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_QUIETANZA, MyGlb.PANEL_FORM, 4, 292, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_QUIETANZA, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_QUIETANZA, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_QUIETANZA, PPQRY_LIQ20, "E.DESCRIZIONE", "LIQQUIETANZA", 5, 40, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_INFOQUIETANZ, MyGlb.PANEL_LIST, 856, 72, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_INFOQUIETANZ, MyGlb.PANEL_LIST, 80);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_INFOQUIETANZ, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_INFOQUIETANZ, MyGlb.PANEL_LIST, "In. Q.");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_INFOQUIETANZ, MyGlb.PANEL_FORM, 4, 652, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_INFOQUIETANZ, MyGlb.PANEL_FORM, 80);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_INFOQUIETANZ, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_INFOQUIETANZ, MyGlb.PANEL_FORM, "Info Quietanza");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_INFOQUIETANZ, -1, -1);
    PAN_DETTAGMANDAT.SetFieldUnbound(PFL_DETTAGMANDAT_INFOQUIETANZ, true);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_INFOQUIETANZ, PPQRY_LIQ20, "CASE WHEN (A.NUM_QUIETANZA IS NULL) THEN '' ELSE 'I' END", "LIQINFOQUIET", 5, 99, 0, -13997);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTAGMANDAT.SetValueListItem(PFL_DETTAGMANDAT_INFOQUIETANZ, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SEDEDEL, MyGlb.PANEL_LIST, 880, 72, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SEDEDEL, MyGlb.PANEL_FORM, 4, 316, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_SEDEDEL, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_SEDEDEL, PPQRY_LIQ20, "A.SEDE_DEL", "LIQSEDEDEL", 5, 4, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODEL, MyGlb.PANEL_LIST, 920, 72, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODEL, MyGlb.PANEL_FORM, 4, 340, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_NUMERODEL, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_NUMERODEL, PPQRY_LIQ20, "A.NUMERO_DEL", "LIQNUMERODEL", 1, 6, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ANNODEL, MyGlb.PANEL_LIST, 968, 72, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ANNODEL, MyGlb.PANEL_FORM, 4, 364, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_ANNODEL, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_ANNODEL, PPQRY_LIQ20, "A.ANNO_DEL", "LIQANNODEL", 1, 4, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DELIBERA, MyGlb.PANEL_LIST, 880, 36, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DELIBERA, MyGlb.PANEL_FORM, 16, 16, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_DELIBERA, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_DELIBERA, -1, "", "DELIBERA", 0, 0, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PROGRTESORIE, MyGlb.PANEL_LIST, 1004, 72, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PROGRTESORIE, MyGlb.PANEL_LIST, 108);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PROGRTESORIE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PROGRTESORIE, MyGlb.PANEL_LIST, "Progr. Tesoriere");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PROGRTESORIE, MyGlb.PANEL_FORM, 4, 388, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PROGRTESORIE, MyGlb.PANEL_FORM, 108);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PROGRTESORIE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_PROGRTESORIE, MyGlb.PANEL_FORM, "Progr. Tesoriere");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_PROGRTESORIE, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_PROGRTESORIE, PPQRY_LIQ20, "A.PROGRESSIVO_TESO", "LIQPROGRTESO", 1, 5, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DISTINTECNIC, MyGlb.PANEL_LIST, 1092, 72, 132, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DISTINTECNIC, MyGlb.PANEL_LIST, 44);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DISTINTECNIC, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DISTINTECNIC, MyGlb.PANEL_LIST, "Distinta Tecnica");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DISTINTECNIC, MyGlb.PANEL_FORM, 4, 412, 476, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DISTINTECNIC, MyGlb.PANEL_FORM, 44);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DISTINTECNIC, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DISTINTECNIC, MyGlb.PANEL_FORM, "Dist. Tecn.");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_DISTINTECNIC, -1, -1);
    PAN_DETTAGMANDAT.SetFieldUnbound(PFL_DETTAGMANDAT_DISTINTECNIC, true);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_DISTINTECNIC, PPQRY_LIQ20, "CASE WHEN (A.NUMERO_DISTINTA IS NULL) THEN '' ELSE A.TIPO_DISTINTA || '-' || TO_CHAR ( A.NUMERO_DISTINTA ) || '/' || TO_CHAR ( A.ANNO_DISTINTA ) END", "DISTINTECNIC", 5, 99, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_UFFICIO, MyGlb.PANEL_LIST, 1224, 72, 172, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_UFFICIO, MyGlb.PANEL_LIST, 84);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_UFFICIO, MyGlb.PANEL_FORM, 4, 460, 516, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_UFFICIO, MyGlb.PANEL_FORM, 84);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_UFFICIO, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_UFFICIO, -1, -1);
    PAN_DETTAGMANDAT.SetFieldUnbound(PFL_DETTAGMANDAT_UFFICIO, true);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_UFFICIO, PPQRY_LIQ20, "CASE WHEN (D.UFFICIO_INVIO IS NULL) THEN '' ELSE SUBSTR(TO_CHAR ( F.CODICE ), 1, 5) || ' - ' || SUBSTR(F.DESCRIZIONE, 1, 25) END", "UFFICIO", 5, 99, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DESCRIZIONE, MyGlb.PANEL_LIST, 1396, 72, 172, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DESCRIZIONE, MyGlb.PANEL_LIST, 80);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 508, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DESCRIZIONE, MyGlb.PANEL_FORM, 80);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_DESCRIZIONE, -1, -1);
    PAN_DETTAGMANDAT.SetFieldUnbound(PFL_DETTAGMANDAT_DESCRIZIONE, true);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_DESCRIZIONE, PPQRY_LIQ20, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CGU, MyGlb.PANEL_LIST, 1568, 72, 172, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CGU, MyGlb.PANEL_LIST, 96);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CGU, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CGU, MyGlb.PANEL_LIST, "Cgu");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CGU, MyGlb.PANEL_FORM, 4, 556, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CGU, MyGlb.PANEL_FORM, 96);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CGU, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CGU, MyGlb.PANEL_FORM, "Cgu");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_CGU, -1, -1);
    PAN_DETTAGMANDAT.SetFieldUnbound(PFL_DETTAGMANDAT_CGU, true);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_CGU, PPQRY_LIQ20, "CASE WHEN (A.CODICE_GESTIONALE IS NULL) THEN '' ELSE TO_CHAR ( A.CODICE_GESTIONALE ) || ' - ' || H.DESCRIZIONE END", "CGU", 5, 99, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_FINANZIAMENT, MyGlb.PANEL_LIST, 1740, 72, 172, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_FINANZIAMENT, MyGlb.PANEL_LIST, 80);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 604, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_FINANZIAMENT, MyGlb.PANEL_FORM, 80);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_FINANZIAMENT, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanz.");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_FINANZIAMENT, -1, -1);
    PAN_DETTAGMANDAT.SetFieldUnbound(PFL_DETTAGMANDAT_FINANZIAMENT, true);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_FINANZIAMENT, PPQRY_LIQ20, "CASE WHEN (A.FINANZIAMENTO IS NULL) THEN '' ELSE TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || G.DESCRIZIONE END", "FINANZIAMENT", 5, 99, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAIMPORTO, MyGlb.PANEL_LIST, 108, 144, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAIMPORTO, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAIMPORTO, MyGlb.PANEL_FORM, 108, 244, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAIMPORTO, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAIMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_SOMMAIMPORTO, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_SOMMAIMPORTO, -1, "", "SOMMAIMPORTO", 0, 0, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMARITENUT, MyGlb.PANEL_LIST, 196, 144, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMARITENUT, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMARITENUT, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMARITENUT, MyGlb.PANEL_FORM, 116, 252, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMARITENUT, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMARITENUT, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_SOMMARITENUT, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_SOMMARITENUT, -1, "", "SOMMARITENUT", 0, 0, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAPAGATO, MyGlb.PANEL_LIST, 284, 144, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAPAGATO, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAPAGATO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAPAGATO, MyGlb.PANEL_FORM, 124, 260, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAPAGATO, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_SOMMAPAGATO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_SOMMAPAGATO, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_SOMMAPAGATO, -1, "", "SOMMAPAGATO", 0, 0, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CODICE, MyGlb.PANEL_LIST, "CODICE");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CODICE, MyGlb.PANEL_FORM, 4, 700, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_CODICE, MyGlb.PANEL_FORM, "CODICE");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_CODICE, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_CODICE, PPQRY_LIQ20, "C.CODICE", "LIQQTNCODICE", 2, 15, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMQUIETANZA, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMQUIETANZA, MyGlb.PANEL_LIST, 92);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMQUIETANZA, MyGlb.PANEL_LIST, "NUM QUIETANZA");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMQUIETANZA, MyGlb.PANEL_FORM, 4, 700, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMQUIETANZA, MyGlb.PANEL_FORM, 92);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_NUMQUIETANZA, MyGlb.PANEL_FORM, "NUM QUIET.");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_NUMQUIETANZA, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_NUMQUIETANZA, PPQRY_LIQ20, "C.NUM_QUIETANZA", "LIQQTNNUMQUI", 1, 2, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD1, MyGlb.PANEL_LIST, 8, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD1, MyGlb.PANEL_LIST, 32);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD1, MyGlb.PANEL_LIST, "Ord1");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD1, MyGlb.PANEL_FORM, 12, 708, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD1, MyGlb.PANEL_FORM, 32);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD1, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD1, MyGlb.PANEL_FORM, "Ord.");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_ORD1, -1, -1);
    PAN_DETTAGMANDAT.SetFieldUnbound(PFL_DETTAGMANDAT_ORD1, true);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_ORD1, PPQRY_LIQ20, "NVL(A.DIVERSO_BEN, A.BENEFICIARIO)", "ORD1", 2, 19, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD2, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD2, MyGlb.PANEL_LIST, 32);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD2, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD2, MyGlb.PANEL_LIST, "Ord2");
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD2, MyGlb.PANEL_FORM, 4, 700, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD2, MyGlb.PANEL_FORM, 32);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD2, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_ORD2, MyGlb.PANEL_FORM, "Ord.");
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_ORD2, -1, -1);
    PAN_DETTAGMANDAT.SetFieldUnbound(PFL_DETTAGMANDAT_ORD2, true);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_ORD2, PPQRY_LIQ20, "TRUNC(TO_NUMBER(CASE WHEN (A.DIVERSO_BEN IS NULL) THEN A.NUM_QUIETANZA ELSE A.NUM_QUIETANZA_DIV_BEN END))", "ORD2", 1, 19, 0, -13997);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_TIPODOCUMENT, MyGlb.PANEL_LIST, 0, 4, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_TIPODOCUMENT, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_TIPODOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_TIPODOCUMENT, MyGlb.PANEL_FORM, 0, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_TIPODOCUMENT, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGMANDAT_TIPODOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGMANDAT.SetFieldPage(PFL_DETTAGMANDAT_TIPODOCUMENT, -1, -1);
    PAN_DETTAGMANDAT.SetFieldPanel(PFL_DETTAGMANDAT_TIPODOCUMENT, -1, "", "TIPODOCUMENT", 0, 0, 0, -13997);
  }

  private void PAN_DETTAGMANDAT_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGMANDAT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DETTAGMANDAT.SetIMDB(IMDB, "PQRY_LIQ20", true);
    PAN_DETTAGMANDAT.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.D_DATA_REG as LIQDDATAREG, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as LIBERASOESES, ");
    SQL.append("  D.D_DATA_DOC as LIQFATDDATDO, ");
    SQL.append("  E.DESCRIZIONE as LIQQUIETANZA, ");
    SQL.append("  A.UFFICIO as LIQUFFICIO, ");
    SQL.append("  A.SEDE_DEL as LIQSEDEDEL, ");
    SQL.append("  A.NUMERO_DEL as LIQNUMERODEL, ");
    SQL.append("  A.ANNO_DEL as LIQANNODEL, ");
    SQL.append("  D.NUMERO_DOC as LIQFATNUMDOC, ");
    SQL.append("  A.RITENUTE as LIQRITENUTE, ");
    SQL.append("  A.IMPORTO as LIQIMPORTO, ");
    SQL.append("  A.PROGRESSIVO_TESO as LIQPROGRTESO, ");
    SQL.append("  CASE WHEN (A.NUMERO_DISTINTA IS NULL) THEN '' ELSE A.TIPO_DISTINTA || '-' || TO_CHAR ( A.NUMERO_DISTINTA ) || '/' || TO_CHAR ( A.ANNO_DISTINTA ) END as DISTINTECNIC, ");
    SQL.append("  A.IMPORTO_PAGAM as LIQPAGATO, ");
    SQL.append("  CASE WHEN (D.UFFICIO_INVIO IS NULL) THEN '' ELSE SUBSTR(TO_CHAR ( F.CODICE ), 1, 5) || ' - ' || SUBSTR(F.DESCRIZIONE, 1, 25) END as UFFICIO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  CASE WHEN (A.FINANZIAMENTO IS NULL) THEN '' ELSE TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || G.DESCRIZIONE END as FINANZIAMENT, ");
    SQL.append("  CASE WHEN (A.CODICE_GESTIONALE IS NULL) THEN '' ELSE TO_CHAR ( A.CODICE_GESTIONALE ) || ' - ' || H.DESCRIZIONE END as CGU, ");
    SQL.append("  C.CODICE as LIQQTNCODICE, ");
    SQL.append("  C.NUM_QUIETANZA as LIQQTNNUMQUI, ");
    SQL.append("  NVL(A.DIVERSO_BEN, A.BENEFICIARIO) as ORD1, ");
    SQL.append("  TRUNC(TO_NUMBER(CASE WHEN (A.DIVERSO_BEN IS NULL) THEN A.NUM_QUIETANZA ELSE A.NUM_QUIETANZA_DIV_BEN END)) as ORD2, ");
    SQL.append("  A.ANNO_LIQ as ANNOLIQ, ");
    SQL.append("  CASE WHEN (A.NUM_QUIETANZA IS NULL) THEN '' ELSE 'I' END as LIQINFOQUIET ");
    PAN_DETTAGMANDAT.SetQuery(PPQRY_LIQ20, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B, ");
    SQL.append("  QTN C, ");
    SQL.append("  FAT D, ");
    SQL.append("  T02 E, ");
    SQL.append("  T53 F, ");
    SQL.append("  FINANZIAMENTI G, ");
    SQL.append("  CODICI_GESTIONALI H ");
    PAN_DETTAGMANDAT.SetQuery(PPQRY_LIQ20, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.BENEFICIARIO = C.CODICE(+)) ");
    SQL.append("and   (A.NUM_QUIETANZA = C.NUM_QUIETANZA(+)) ");
    SQL.append("and   (C.TIPO_QUIETANZA = E.CODICE(+)) ");
    SQL.append("and   (A.BENEFICIARIO = B.CODICE(+)) ");
    SQL.append("and   (A.FAT_ANNO_PROG = D.ANNO_PROG(+)) ");
    SQL.append("and   (A.FAT_NUMERO_PROG = D.NUMERO_PROG(+)) ");
    SQL.append("and   (A.FINANZIAMENTO = G.CODICE(+)) ");
    SQL.append("and   (A.NUMERO_MAND = ~~TBL_PARAM85.ROWNAMNUMMAN~~) ");
    SQL.append("and   (A.ANNO_MAND = ~~TBL_PARAM85.ROWNAMANNMAN~~) ");
    SQL.append("and   (F.CODICE(+) = D.UFFICIO_INVIO) ");
    SQL.append("and   (A.CODICE_GESTIONALE = H.CODICE(+)) ");
    SQL.append("and   (NVL(H.E_S, 'S') = 'S') ");
    PAN_DETTAGMANDAT.SetQuery(PPQRY_LIQ20, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGMANDAT.SetQuery(PPQRY_LIQ20, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGMANDAT.SetQuery(PPQRY_LIQ20, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 22, 23, 24, 1 ");
    PAN_DETTAGMANDAT.SetQuery(PPQRY_LIQ20, 5, SQL, -1, "");
    PAN_DETTAGMANDAT.SetQueryDB(PPQRY_LIQ20, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGMANDAT.SetMasterTable(0, "LIQ");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGMANDAT.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGMANDAT.iUseListQBE;
      PAN_DETTAGMANDAT.iUseListQBE = 0;
      PAN_DETTAGMANDAT.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGMANDAT.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGMANDAT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DETTAGMANDAT) PAN_DETTAGMANDAT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGMANDAT) PAN_DETTAGMANDAT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTAGMANDAT) PAN_DETTAGMANDAT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGMANDAT) PAN_DETTAGMANDAT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DETTAGMANDAT) PAN_DETTAGMANDAT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DETTAGMANDAT) PAN_DETTAGMANDAT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
