// **********************************************
// Elenco Ordinativi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoOrdinativi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ORDINATIVI_NUMEROORD = 0;
  private static int PFL_ORDINATIVI_DDATAORD = 1;
  private static int PFL_ORDINATIVI_INFO = 2;
  private static int PFL_ORDINATIVI_IMPORTO = 3;
  private static int PFL_ORDINATIVI_CAPITOLO = 4;
  private static int PFL_ORDINATIVI_ARTICOLO = 5;
  private static int PFL_ORDINATIVI_NUMEROACC = 6;
  private static int PFL_ORDINATIVI_ANNOACC = 7;
  private static int PFL_ORDINATIVI_NUMERODISTIN = 8;
  private static int PFL_ORDINATIVI_ANNODISTINTA = 9;
  private static int PFL_ORDINATIVI_ORDINATIVO = 10;
  private static int PFL_ORDINATIVI_ACCERTAMENTO = 11;
  private static int PFL_ORDINATIVI_DISTINTA = 12;
  private static int PFL_ORDINATIVI_TOTLIQ = 13;
  private static int PFL_ORDINATIVI_TOTLIQ2 = 14;
  private static int PFL_ORDINATIVI_QUIETANZA = 15;
  private static int PFL_ORDINATIVI_NEWPANELLABE = 16;
  private static int PFL_ORDINATIVI_ANNOORD = 17;

  private static int PPQRY_LIQ18 = 0;


  IDPanel PAN_ORDINATIVI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM49(IMDB);
    //
    //
    Init_PQRY_LIQ18(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM49(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM49, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM49, "TBL_PARAM49");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM49,IMDBDef2.FLD_PARAM49_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM49,IMDBDef2.FLD_PARAM49_ROWNAMANNPRO,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM49,IMDBDef2.FLD_PARAM49_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM49,IMDBDef2.FLD_PARAM49_ROWNAMNUMPRO,1,8,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM49, 0);
  }

  private static void Init_PQRY_LIQ18(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_LIQ18, 15);
    IMDB.set_TblCode(IMDBDef10.PQRY_LIQ18, "PQRY_LIQ18");
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_D_DATA_ORD, "D_DATA_ORD");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_D_DATA_ORD,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_NUMERO_DISTINTA,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_ANNO_PRE, "ANNO_PRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_ANNO_PRE,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_NUMERO_PRE, "NUMERO_PRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_NUMERO_PRE,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_LIQQUIETANZA, "LIQQUIETANZA");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_LIQQUIETANZA,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_LIQINFO, "LIQINFO");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQ18,IMDBDef10.PQSL_LIQ18_LIQINFO,5,99,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_LIQ18, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoOrdinativi(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoOrdinativi()
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
    FormIdx = MyGlb.FRM_ELENCOORDINA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A74ADDFF-1CED-49EE-B9E5-DBABEBAC5CBC";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 892;
    DesignHeight = 434;
    set_Caption(new IDVariant("Elenco Ordinativi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 892;
    Frames[1].Height = 408;
    Frames[1].Caption = "Ordinativi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 408;
    PAN_ORDINATIVI = new IDPanel(w, this, 1, "PAN_ORDINATIVI");
    Frames[1].Content = PAN_ORDINATIVI;
    PAN_ORDINATIVI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDINATIVI.VS = MainFrm.VisualStyleList;
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 892-MyGlb.PAN_OFFS_X, 408-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "17A8FA34-ED0D-4315-852B-C6AE8C837FEA");
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 848, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDINATIVI.InitStatus = 2;
    PAN_ORDINATIVI_Init();
    PAN_ORDINATIVI_InitFields();
    PAN_ORDINATIVI_InitQueries();
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
      PAN_ORDINATIVI.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoOrdinativi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoOrdinativi.class.getName() : (Glb.ClassWithPackage(ElencoOrdinativi.class) ? ElencoOrdinativi.class.getName().substring(ElencoOrdinativi.class.getPackage().getName().length() + 1) : ElencoOrdinativi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Ordinativi After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ORDINATIVI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinativi After Find Event Body
      // Procedure Body
      // 
      PAN_ORDINATIVI.set_FieldText(PFL_ORDINATIVI_TOTLIQ2, IDL.ToString(IDL.NullValue(PAN_ORDINATIVI.GetFieldSum(PFL_ORDINATIVI_IMPORTO),(new IDVariant(0)))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoOrdinativi", "OrdinativiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_ORDINATIVI_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinativi On Change Status Event Body
      // Procedure Body
      // 
      AllineamentoCampiRicerca();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoOrdinativi", "OrdinativiOnChangeStatusEvent", _e);
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
    IDVariant v_ORDINATIVI = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ORDINATIVI = (new IDVariant("Ordinativi", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_ORDINATIVI, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoOrdinativi", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Allineamento Campi Ricerca
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int AllineamentoCampiRicerca ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Allineamento Campi Ricerca Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_ORDINATIVI.Status()).equals((new IDVariant(1)), true))
      {
        PAN_ORDINATIVI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVI_INFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINATIVI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVI_NEWPANELLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINATIVI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINATIVI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ORDINATIVI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVI_INFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINATIVI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVI_NEWPANELLABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINATIVI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDINATIVI.SetFlags (Glb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_ORDINATIVI.set_ObjRect(Glb.OBJ_FIELD, PFL_ORDINATIVI_ACCERTAMENTO, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ORDINATIVI.ObjRect(Glb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROACC, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_ORDINATIVI.set_ObjRect(Glb.OBJ_FIELD, PFL_ORDINATIVI_DISTINTA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ORDINATIVI.ObjRect(Glb.OBJ_FIELD, PFL_ORDINATIVI_NUMERODISTIN, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoOrdinativi", "AllineamentoCampiRicerca", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Info ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMANNOORD, 0, IMDB.Value(IMDBDef10.PQRY_LIQ18, IMDBDef10.PQSL_LIQ18_ANNO_ORD, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMNUMEORD, 0, IMDB.Value(IMDBDef10.PQRY_LIQ18, IMDBDef10.PQSL_LIQ18_NUMERO_ORD, 0));
      MainFrm.Show(MyGlb.FRM_INFOORDINATI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoOrdinativi", "Info", _e);
      return -1;
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
  private void PAN_ORDINATIVI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDINATIVI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDINATIVI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDINATIVI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDINATIVI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ORDINATIVI);
    // Stub
  }

  private void PAN_ORDINATIVI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDINATIVI_INFO)
    {
      this.IdxPanelActived = this.PAN_ORDINATIVI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Info();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDINATIVI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ORDINATIVI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_LIQ18, IMDBDef10.PQSL_LIQ18_D_DATA_ORD, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_LIQ18, IMDBDef10.PQSL_LIQ18_D_DATA_ORD, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_ORDINATIVI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDINATIVI_Init()
  {

    PAN_ORDINATIVI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDINATIVI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ORDINATIVI.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROORD, "9E058A56-3091-4DC7-BE2E-5EE31F60838F");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROORD, "NUMERO ORD");
    PAN_ORDINATIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROORD, "");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DDATAORD, "A1C6F79C-5095-4C34-B2F0-D4E969A8E5BB");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DDATAORD, "D DATA ORD");
    PAN_ORDINATIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DDATAORD, "");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DDATAORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DDATAORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_INFO, "8672AD45-F27E-41A4-B58F-11F896D0E6FF");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_INFO, "Info");
    PAN_ORDINATIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_INFO, "");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_INFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_IMPORTO, "DFC54EDC-FA6B-49BB-AC15-9D1B164984DA");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_IMPORTO, "Importo");
    PAN_ORDINATIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_IMPORTO, "");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_CAPITOLO, "F49BB818-A0D5-45D5-A001-528D019DD273");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_CAPITOLO, "Capitolo/Art.");
    PAN_ORDINATIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_CAPITOLO, "");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_CAPITOLO, MyGlb.VIS_NOFIINLUHELE);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ARTICOLO, "457F8EE0-8BB1-46B7-A9C0-4D71E9DE8FED");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ARTICOLO, " ");
    PAN_ORDINATIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ARTICOLO, "");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ARTICOLO, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROACC, "7C8AE05F-2994-4268-8DA2-9C5929853660");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROACC, "NUMERO ACC");
    PAN_ORDINATIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROACC, "");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOACC, "724E8E28-C196-4F7E-931A-3CF05A0705A5");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOACC, "ANNO ACC");
    PAN_ORDINATIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOACC, "");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMERODISTIN, "8A127485-CDBD-46CE-B4E4-F497D459BD4E");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMERODISTIN, "NUMERO DISTINTA");
    PAN_ORDINATIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMERODISTIN, "");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMERODISTIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNODISTINTA, "8BCDED04-0F5C-45A8-91BF-91A8327F24EB");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNODISTINTA, "ANNO DISTINTA");
    PAN_ORDINATIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNODISTINTA, "");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNODISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ORDINATIVO, "E6AA8808-F827-4D70-9DAC-FCE0CB63E109");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ORDINATIVO, "Ordinativo");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ORDINATIVO, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ORDINATIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ACCERTAMENTO, "EC224379-FD2B-4DD5-B860-415ECB925314");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ACCERTAMENTO, "Accertamento");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ACCERTAMENTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ACCERTAMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DISTINTA, "94EFBADA-73A6-48FC-94C1-E8BA439ECC4A");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DISTINTA, "Distinta");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DISTINTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ, "D13B5D5E-F63D-4CC5-861D-A4CDC39A7C68");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ, "Totale:");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ, MyGlb.VIS_VUOGRAALILEF);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ2, "BD341EC0-18AF-477A-A3C5-336FF9497B7A");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ2, "");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ2, MyGlb.VIS_CAMPTOTADISA);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_QUIETANZA, "8008117C-D4ED-44CF-926B-1E6C3D8B6389");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_QUIETANZA, "Quietanza");
    PAN_ORDINATIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_QUIETANZA, "");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NEWPANELLABE, "5850C876-BE07-4BF6-9390-55F921DBD33F");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NEWPANELLABE, "");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NEWPANELLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINATIVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOORD, "FF3241A9-C21B-4295-9EFC-9B1F2FFFEF0E");
    PAN_ORDINATIVI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOORD, "ANNO ORD");
    PAN_ORDINATIVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOORD, "");
    PAN_ORDINATIVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOORD, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ORDINATIVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOORD, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_ORDINATIVI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROORD, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROORD, MyGlb.PANEL_LIST, 76);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROORD, MyGlb.PANEL_LIST, "NUM. ORD");
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROORD, MyGlb.PANEL_FORM, 4, 832, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROORD, MyGlb.PANEL_FORM, 76);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROORD, MyGlb.PANEL_FORM, "NUM. ORD");
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_NUMEROORD, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_NUMEROORD, PPQRY_LIQ18, "B.NUMERO_ORD", "NUMERO_ORD", 1, 5, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DDATAORD, MyGlb.PANEL_LIST, 48, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DDATAORD, MyGlb.PANEL_LIST, 72);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DDATAORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DDATAORD, MyGlb.PANEL_LIST, "D DATA ORD");
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DDATAORD, MyGlb.PANEL_FORM, 4, 856, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DDATAORD, MyGlb.PANEL_FORM, 72);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DDATAORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DDATAORD, MyGlb.PANEL_FORM, "D DT. ORD");
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_DDATAORD, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_DDATAORD, PPQRY_LIQ18, "B.D_DATA_ORD", "D_DATA_ORD", 6, 19, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_INFO, MyGlb.PANEL_LIST, 116, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_INFO, MyGlb.PANEL_LIST, 28);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_INFO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_INFO, MyGlb.PANEL_LIST, "In.");
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_INFO, MyGlb.PANEL_FORM, 4, 976, 460, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_INFO, MyGlb.PANEL_FORM, 28);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_INFO, MyGlb.PANEL_FORM, 2);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_INFO, MyGlb.PANEL_FORM, "Inf.");
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_INFO, -1, -1);
    PAN_ORDINATIVI.SetFieldUnbound(PFL_ORDINATIVI_INFO, true);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_INFO, PPQRY_LIQ18, "CASE WHEN NOT ((B.NUMERO_ORD IS NULL)) THEN 'I' ELSE '' END", "LIQINFO", 5, 99, 0, -13997);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ORDINATIVI.SetValueListItem(PFL_ORDINATIVI_INFO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_IMPORTO, MyGlb.PANEL_LIST, 140, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_IMPORTO, MyGlb.PANEL_FORM, 4, 316, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_IMPORTO, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_IMPORTO, PPQRY_LIQ18, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_CAPITOLO, MyGlb.PANEL_LIST, 224, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_CAPITOLO, MyGlb.PANEL_FORM, 4, 496, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_CAPITOLO, MyGlb.PANEL_FORM, "Capit. Art");
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_CAPITOLO, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_CAPITOLO, PPQRY_LIQ18, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ARTICOLO, MyGlb.PANEL_LIST, 332, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ARTICOLO, MyGlb.PANEL_LIST, " ");
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ARTICOLO, MyGlb.PANEL_FORM, 4, 520, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ARTICOLO, MyGlb.PANEL_FORM, " ");
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_ARTICOLO, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_ARTICOLO, PPQRY_LIQ18, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROACC, MyGlb.PANEL_LIST, 360, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROACC, MyGlb.PANEL_FORM, 4, 904, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROACC, MyGlb.PANEL_FORM, 76);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_NUMEROACC, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_NUMEROACC, PPQRY_LIQ18, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOACC, MyGlb.PANEL_LIST, 412, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOACC, MyGlb.PANEL_FORM, 4, 928, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_ANNOACC, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_ANNOACC, PPQRY_LIQ18, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMERODISTIN, MyGlb.PANEL_LIST, 452, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMERODISTIN, MyGlb.PANEL_LIST, 104);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMERODISTIN, MyGlb.PANEL_LIST, "NUM. DIST.");
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMERODISTIN, MyGlb.PANEL_FORM, 4, 640, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMERODISTIN, MyGlb.PANEL_FORM, 104);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NUMERODISTIN, MyGlb.PANEL_FORM, "NUM. DISTINTA");
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_NUMERODISTIN, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_NUMERODISTIN, PPQRY_LIQ18, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 6, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNODISTINTA, MyGlb.PANEL_LIST, 500, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNODISTINTA, MyGlb.PANEL_LIST, 88);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNODISTINTA, MyGlb.PANEL_LIST, "ANN. DIST.");
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNODISTINTA, MyGlb.PANEL_FORM, 4, 664, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNODISTINTA, MyGlb.PANEL_FORM, 88);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNODISTINTA, MyGlb.PANEL_FORM, "ANN. DISTINTA");
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_ANNODISTINTA, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_ANNODISTINTA, PPQRY_LIQ18, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ORDINATIVO, MyGlb.PANEL_LIST, 0, 0, 116, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ORDINATIVO, MyGlb.PANEL_LIST, 0);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ORDINATIVO, MyGlb.PANEL_LIST, 2);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ORDINATIVO, MyGlb.PANEL_FORM, 0, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ORDINATIVO, MyGlb.PANEL_FORM, 0);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ORDINATIVO, MyGlb.PANEL_FORM, 2);
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_ORDINATIVO, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_ORDINATIVO, -1, "", "ORDINATIVO", 0, 0, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ACCERTAMENTO, MyGlb.PANEL_LIST, 360, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ACCERTAMENTO, MyGlb.PANEL_LIST, 0);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ACCERTAMENTO, MyGlb.PANEL_FORM, 32, 32, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ACCERTAMENTO, MyGlb.PANEL_FORM, 0);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ACCERTAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_ACCERTAMENTO, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_ACCERTAMENTO, -1, "", "ACCERTAMENTO", 0, 0, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DISTINTA, MyGlb.PANEL_LIST, 452, 0, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DISTINTA, MyGlb.PANEL_LIST, 0);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DISTINTA, MyGlb.PANEL_LIST, 2);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DISTINTA, MyGlb.PANEL_FORM, 8, 8, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DISTINTA, MyGlb.PANEL_FORM, 0);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_DISTINTA, MyGlb.PANEL_FORM, 2);
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_DISTINTA, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_DISTINTA, -1, "", "DISTINTA", 0, 0, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ, MyGlb.PANEL_LIST, 88, 256, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ, MyGlb.PANEL_LIST, 0);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ, MyGlb.PANEL_FORM, 100, 260, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ, MyGlb.PANEL_FORM, 0);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_TOTLIQ, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_TOTLIQ, -1, "", "TOTLIQ", 0, 0, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ2, MyGlb.PANEL_LIST, 140, 256, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ2, MyGlb.PANEL_LIST, 0);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ2, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ2, MyGlb.PANEL_FORM, 108, 268, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ2, MyGlb.PANEL_FORM, 0);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_TOTLIQ2, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_TOTLIQ2, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_TOTLIQ2, -1, "", "TOTLIQ2", 0, 0, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_QUIETANZA, MyGlb.PANEL_LIST, 540, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_QUIETANZA, MyGlb.PANEL_LIST, 76);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_QUIETANZA, MyGlb.PANEL_FORM, 4, 952, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_QUIETANZA, MyGlb.PANEL_FORM, 76);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_QUIETANZA, -1, -1);
    PAN_ORDINATIVI.SetFieldUnbound(PFL_ORDINATIVI_QUIETANZA, true);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_QUIETANZA, PPQRY_LIQ18, "D.DESCRIZIONE", "LIQQUIETANZA", 5, 40, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NEWPANELLABE, MyGlb.PANEL_LIST, 116, 0, 24, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NEWPANELLABE, MyGlb.PANEL_LIST, 2);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NEWPANELLABE, MyGlb.PANEL_FORM, 116, 0, 20, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_NEWPANELLABE, MyGlb.PANEL_FORM, 2);
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_NEWPANELLABE, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOORD, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOORD, MyGlb.PANEL_LIST, 64);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOORD, MyGlb.PANEL_LIST, "ANNO ORD");
    PAN_ORDINATIVI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOORD, MyGlb.PANEL_FORM, 4, 1024, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINATIVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOORD, MyGlb.PANEL_FORM, 64);
    PAN_ORDINATIVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_ORDINATIVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINATIVI_ANNOORD, MyGlb.PANEL_FORM, "ANNO ORD");
    PAN_ORDINATIVI.SetFieldPage(PFL_ORDINATIVI_ANNOORD, -1, -1);
    PAN_ORDINATIVI.SetFieldPanel(PFL_ORDINATIVI_ANNOORD, PPQRY_LIQ18, "B.ANNO_ORD", "ANNO_ORD", 1, 4, 0, -13997);
  }

  private void PAN_ORDINATIVI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDINATIVI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ORDINATIVI.SetIMDB(IMDB, "PQRY_LIQ18", true);
    PAN_ORDINATIVI.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.NUMERO_ORD as NUMERO_ORD, ");
    SQL.append("  B.D_DATA_ORD as D_DATA_ORD, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.NUMERO_DISTINTA as NUMERO_DISTINTA, ");
    SQL.append("  A.ANNO_DISTINTA as ANNO_DISTINTA, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  B.ANNO_ORD as ANNO_ORD, ");
    SQL.append("  A.ANNO_PRE as ANNO_PRE, ");
    SQL.append("  A.NUMERO_PRE as NUMERO_PRE, ");
    SQL.append("  D.DESCRIZIONE as LIQQUIETANZA, ");
    SQL.append("  CASE WHEN NOT ((B.NUMERO_ORD IS NULL)) THEN 'I' ELSE '' END as LIQINFO ");
    PAN_ORDINATIVI.SetQuery(PPQRY_LIQ18, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PRE A, ");
    SQL.append("  ORD B, ");
    SQL.append("  QTN C, ");
    SQL.append("  T02 D ");
    PAN_ORDINATIVI.SetQuery(PPQRY_LIQ18, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.FAT_ANNO_PROG = ~~TBL_PARAM49.ROWNAMANNPRO~~) ");
    SQL.append("and   (A.FAT_NUMERO_PROG = ~~TBL_PARAM49.ROWNAMNUMPRO~~) ");
    SQL.append("and   (A.NUM_QUIETANZA = C.NUM_QUIETANZA(+)) ");
    SQL.append("and   (A.DEBITORE = C.CODICE(+)) ");
    SQL.append("and   (A.ANNO_ORD = B.ANNO_ORD) ");
    SQL.append("and   (A.NUMERO_ORD = B.NUMERO_ORD) ");
    SQL.append("and   (D.CODICE(+) = C.TIPO_QUIETANZA) ");
    PAN_ORDINATIVI.SetQuery(PPQRY_LIQ18, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDINATIVI.SetQuery(PPQRY_LIQ18, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDINATIVI.SetQuery(PPQRY_LIQ18, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_ORD, ");
    SQL.append("  B.NUMERO_ORD, ");
    SQL.append("  A.ANNO_PRE, ");
    SQL.append("  A.NUMERO_PRE ");
    PAN_ORDINATIVI.SetQuery(PPQRY_LIQ18, 5, SQL, -1, "");
    PAN_ORDINATIVI.SetQueryDB(PPQRY_LIQ18, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINATIVI.SetMasterTable(0, "PRE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDINATIVI.Status() == 2)
    {
      int oldListQBE = PAN_ORDINATIVI.iUseListQBE;
      PAN_ORDINATIVI.iUseListQBE = 0;
      PAN_ORDINATIVI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDINATIVI.PanelCommand(Glb.PCM_FIND);
      PAN_ORDINATIVI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDINATIVI) PAN_ORDINATIVI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINATIVI) PAN_ORDINATIVI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDINATIVI) PAN_ORDINATIVI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINATIVI) PAN_ORDINATIVI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDINATIVI) PAN_ORDINATIVI_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_ORDINATIVI) PAN_ORDINATIVI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_ORDINATIVI) PAN_ORDINATIVI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
