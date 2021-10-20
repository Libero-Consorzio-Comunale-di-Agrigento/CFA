// **********************************************
// Dettagli Bozza Proposta
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DettagliBozzaProposta extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DETTAGLBOZZA_IMPORTI = 0;

  private static int PFL_DETTAGLBOZZA_STATO = 0;
  private static int PFL_DETTAGLBOZZA_ES = 1;
  private static int PFL_DETTAGLBOZZA_CAPITOLO = 2;
  private static int PFL_DETTAGLBOZZA_ARTICOLO = 3;
  private static int PFL_DETTAGLBOZZA_CAPITARTSMAL = 4;
  private static int PFL_DETTAGLBOZZA_CAPITOARTBIG = 5;
  private static int PFL_DETTAGLBOZZA_NUOVA = 6;
  private static int PFL_DETTAGLBOZZA_UNITAORG = 7;
  private static int PFL_DETTAGLBOZZA_PROGUNITORGA = 8;
  private static int PFL_DETTAGLBOZZA_IMPORTO1 = 9;
  private static int PFL_DETTAGLBOZZA_IMPORTO2 = 10;
  private static int PFL_DETTAGLBOZZA_IMPORTO3 = 11;

  private static int PPQRY_POLPROVARDE5 = 0;


  IDPanel PAN_DETTAGLBOZZA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR62(IMDB);
    //
    //
    Init_PQRY_POLPROVARDE5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR62(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR62, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR62, "TBL_PAR62");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR62,IMDBDef3.FLD_PAR62_ROWNAMBOVAID, "ROWNAMBOVAID");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR62,IMDBDef3.FLD_PAR62_ROWNAMBOVAID,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR62,IMDBDef3.FLD_PAR62_RONADABOODAD, "RONADABOODAD");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR62,IMDBDef3.FLD_PAR62_RONADABOODAD,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR62,IMDBDef3.FLD_PAR62_ROWNAMEVARID, "ROWNAMEVARID");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR62,IMDBDef3.FLD_PAR62_ROWNAMEVARID,1,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR62, 0);
  }

  private static void Init_PQRY_POLPROVARDE5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLPROVARDE5, 10);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLPROVARDE5, "PQRY_POLPROVARDE5");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_STATO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_ISTITUZIONE_NC, "ISTITUZIONE_NC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_ISTITUZIONE_NC,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_IMPORTO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_IMPORTO_2, "IMPORTO_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_IMPORTO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_IMPORTO_3, "IMPORTO_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_IMPORTO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_RECORUNITORG, "RECORUNITORG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE5,IMDBDef12.PQSL_POLPROVARDE5_RECORUNITORG,5,99,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLPROVARDE5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DettagliBozzaProposta(MyWebEntryPoint w, IMDBObj imdb)
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
  public DettagliBozzaProposta()
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
    FormIdx = MyGlb.FRM_DETTBOZZPROP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "69F82292-1CFC-4130-A2E6-9B7268883409";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 860;
    DesignHeight = 346;
    set_Caption(new IDVariant("Dettagli Bozza Proposta"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 860;
    Frames[1].Height = 320;
    Frames[1].Caption = "Dettagli Bozza";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 320;
    PAN_DETTAGLBOZZA = new IDPanel(w, this, 1, "PAN_DETTAGLBOZZA");
    Frames[1].Content = PAN_DETTAGLBOZZA;
    PAN_DETTAGLBOZZA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGLBOZZA.VS = MainFrm.VisualStyleList;
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 860-MyGlb.PAN_OFFS_X, 320-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DETTAGLBOZZA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "ACDF9C4E-EC32-495C-8126-FAD1C82B708E");
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 816, 244, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 40);
    PAN_DETTAGLBOZZA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGLBOZZA.InitStatus = 2;
    PAN_DETTAGLBOZZA_Init();
    PAN_DETTAGLBOZZA_InitFields();
    PAN_DETTAGLBOZZA_InitQueries();
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
      PAN_DETTAGLBOZZA.UpdatePanel(MainFrm);
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
    return (obj instanceof DettagliBozzaProposta);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DettagliBozzaProposta.class.getName() : (Glb.ClassWithPackage(DettagliBozzaProposta.class) ? DettagliBozzaProposta.class.getName().substring(DettagliBozzaProposta.class.getPackage().getName().length() + 1) : DettagliBozzaProposta.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Dettagli Bozza On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGLBOZZA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTAGLBOZZA);
      // 
      // Dettagli Bozza On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTAGLBOZZA.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLBOZZA_UNITAORG,(new IDVariant(PAN_DETTAGLBOZZA.FieldText(PFL_DETTAGLBOZZA_UNITAORG))).stringValue()); 
      PAN_DETTAGLBOZZA.set_ObjRect(Glb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOARTBIG, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_DETTAGLBOZZA.ObjRect(Glb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliBozzaProposta", "DettagliBozzaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Bozza On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_DETTAGLBOZZA_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Bozza On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_DETTAGLBOZZA.Status()).equals((new IDVariant(1)), true))
      {
        PAN_DETTAGLBOZZA.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if ((new IDVariant(MainFrm.VisualizzaRisorsaIntevento(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))).equals((new IDVariant(-1)), true))
        {
          PAN_DETTAGLBOZZA.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITARTSMAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLBOZZA.set_ObjRect(Glb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOARTBIG, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_DETTAGLBOZZA.ObjRect(Glb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        }
        else
        {
          PAN_DETTAGLBOZZA.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOARTBIG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGLBOZZA.set_ObjRect(Glb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITARTSMAL, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_DETTAGLBOZZA.ObjRect(Glb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef3.TBL_PAR62, IMDBDef3.FLD_PAR62_RONADABOODAD, 0).compareTo((new IDVariant(2)), true)!=0)
        {
          PAN_DETTAGLBOZZA.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliBozzaProposta", "DettagliBozzaOnChangeStatusEvent", _e);
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
      if (IMDB.Value(IMDBDef3.TBL_PAR62, IMDBDef3.FLD_PAR62_RONADABOODAD, 0).equals((new IDVariant(0)), true))
      {
        IDVariant v_CAP1 = new IDVariant(0,IDVariant.STRING);
        v_CAP1 = (new IDVariant("Dettagli Bozza", IDVariant.STRING));
        set_Caption(new IDVariant(v_CAP1));
      }
      else
      {
        IDVariant v_CAP2 = new IDVariant(0,IDVariant.STRING);
        v_CAP2 = (new IDVariant("Dettagli Proposta", IDVariant.STRING));
        set_Caption(new IDVariant(v_CAP2));
      }
      if (IMDB.Value(IMDBDef3.TBL_PAR62, IMDBDef3.FLD_PAR62_RONADABOODAD, 0).equals((new IDVariant(2)), true))
      {
        PAN_DETTAGLBOZZA.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if ((new IDVariant(MainFrm.VisualizzaRisorsaIntevento(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))).equals((new IDVariant(-1)), true))
      {
        PAN_DETTAGLBOZZA.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITARTSMAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTAGLBOZZA.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOARTBIG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_DETTAGLBOZZA.set_Header(Glb.OBJ_FIELD,PFL_DETTAGLBOZZA_IMPORTO1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).stringValue());
      PAN_DETTAGLBOZZA.set_Header(Glb.OBJ_FIELD,PFL_DETTAGLBOZZA_IMPORTO2, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)))).stringValue());
      PAN_DETTAGLBOZZA.set_Header(Glb.OBJ_FIELD,PFL_DETTAGLBOZZA_IMPORTO3, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2)))).stringValue());
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliBozzaProposta", "LoadEvent", _e);
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
  private void PAN_DETTAGLBOZZA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTAGLBOZZA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGLBOZZA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGLBOZZA, Cancel);
    // Stub
  }

  private void PAN_DETTAGLBOZZA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DETTAGLBOZZA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGLBOZZA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGLBOZZA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DETTAGLBOZZA_Init()
  {

    PAN_DETTAGLBOZZA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGLBOZZA.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_DETTAGLBOZZA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTAGLBOZZA_IMPORTI, "FF696F9C-91C5-47A0-8573-AE6E19115888");
    PAN_DETTAGLBOZZA.set_Header(MyGlb.OBJ_GROUP, GRP_DETTAGLBOZZA_IMPORTI, "Importi");
    PAN_DETTAGLBOZZA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTAGLBOZZA_IMPORTI, "");
    PAN_DETTAGLBOZZA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTAGLBOZZA_IMPORTI, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGLBOZZA_IMPORTI, MyGlb.PANEL_LIST, 504, -9999, 312, 20, 0, 0);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGLBOZZA_IMPORTI, MyGlb.PANEL_FORM, 0, 171, 156, 97, 0, 0);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGLBOZZA_IMPORTI, 0, 43);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGLBOZZA_IMPORTI, 1, 13);
    PAN_DETTAGLBOZZA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGLBOZZA_IMPORTI, 0, 4);
    PAN_DETTAGLBOZZA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGLBOZZA_IMPORTI, 1, 4);
    PAN_DETTAGLBOZZA.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTAGLBOZZA_IMPORTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTAGLBOZZA.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_DETTAGLBOZZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, "7DE830DF-FCED-436F-AA96-4F98DA001B5F");
    PAN_DETTAGLBOZZA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, "Stato");
    PAN_DETTAGLBOZZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, "");
    PAN_DETTAGLBOZZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLBOZZA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLBOZZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ES, "6EDE1903-EB35-4D06-A01B-1D54B5AD4B9A");
    PAN_DETTAGLBOZZA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ES, "E/S");
    PAN_DETTAGLBOZZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ES, "");
    PAN_DETTAGLBOZZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLBOZZA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLBOZZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, "CEF34B80-56D4-424D-9F3C-E7B552B5DF6B");
    PAN_DETTAGLBOZZA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, "CAPITOLO");
    PAN_DETTAGLBOZZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, "");
    PAN_DETTAGLBOZZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_DETTAGLBOZZA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLBOZZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ARTICOLO, "88F39812-25B4-48C5-B702-A335A064A040");
    PAN_DETTAGLBOZZA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ARTICOLO, "ARTICOLO");
    PAN_DETTAGLBOZZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ARTICOLO, "");
    PAN_DETTAGLBOZZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLBOZZA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLBOZZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITARTSMAL, "0837F6DD-4434-4DC5-9CF3-D99CB7EA6527");
    PAN_DETTAGLBOZZA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITARTSMAL, "Capitolo/Art.");
    PAN_DETTAGLBOZZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITARTSMAL, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGLBOZZA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITARTSMAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGLBOZZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOARTBIG, "3F4E40BE-70AB-4220-AF79-401B5CF8BD5E");
    PAN_DETTAGLBOZZA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOARTBIG, "Capitolo/Art.");
    PAN_DETTAGLBOZZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOARTBIG, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGLBOZZA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOARTBIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTAGLBOZZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_NUOVA, "33FF46C7-2619-481D-BC50-B5591437281A");
    PAN_DETTAGLBOZZA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_NUOVA, "Nuova");
    PAN_DETTAGLBOZZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_NUOVA, "");
    PAN_DETTAGLBOZZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_NUOVA, MyGlb.VIS_CHECKSTYLE);
    PAN_DETTAGLBOZZA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_NUOVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLBOZZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_UNITAORG, "A1C41AA1-7B44-4058-8377-C80A865B2502");
    PAN_DETTAGLBOZZA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_UNITAORG, "Unità Org. ");
    PAN_DETTAGLBOZZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_UNITAORG, "");
    PAN_DETTAGLBOZZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_UNITAORG, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLBOZZA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_UNITAORG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLBOZZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_PROGUNITORGA, "10CDACD9-C9AF-4D22-ABA8-7DA94B502E81");
    PAN_DETTAGLBOZZA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_DETTAGLBOZZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_PROGUNITORGA, "");
    PAN_DETTAGLBOZZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_PROGUNITORGA, MyGlb.VIS_NONNULLAFIEL);
    PAN_DETTAGLBOZZA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_PROGUNITORGA, 0, -1);
    PAN_DETTAGLBOZZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO1, "50033538-1760-41C7-954B-1099F8CEF094");
    PAN_DETTAGLBOZZA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO1, "IMPORTO 1");
    PAN_DETTAGLBOZZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO1, "");
    PAN_DETTAGLBOZZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGLBOZZA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLBOZZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO2, "68D5952F-73BA-48F2-BCD7-E27ED09104AB");
    PAN_DETTAGLBOZZA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO2, "IMPORTO 2");
    PAN_DETTAGLBOZZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO2, "");
    PAN_DETTAGLBOZZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGLBOZZA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLBOZZA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO3, "89E1C6D8-0C17-4219-A536-987FE3DB2707");
    PAN_DETTAGLBOZZA.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO3, "IMPORTO 3");
    PAN_DETTAGLBOZZA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO3, "");
    PAN_DETTAGLBOZZA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGLBOZZA.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DETTAGLBOZZA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, MyGlb.PANEL_LIST, 0, 44, 40, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, MyGlb.PANEL_LIST, 36);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, MyGlb.PANEL_LIST, "Stato");
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, MyGlb.PANEL_FORM, 4, 4, 468, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, MyGlb.PANEL_FORM, 36);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_STATO, MyGlb.PANEL_FORM, "St.");
    PAN_DETTAGLBOZZA.SetFieldPage(PFL_DETTAGLBOZZA_STATO, -1, -1);
    PAN_DETTAGLBOZZA.SetFieldUnbound(PFL_DETTAGLBOZZA_STATO, true);
    PAN_DETTAGLBOZZA.SetFieldPanel(PFL_DETTAGLBOZZA_STATO, PPQRY_POLPROVARDE5, "A.STATO", "STATO", 5, 1, 0, -13997);
    PAN_DETTAGLBOZZA.SetValueListItem(PFL_DETTAGLBOZZA_STATO, (new IDVariant()), "Faccina interrogativa", "", "smile_question.gif", -1);
    PAN_DETTAGLBOZZA.SetValueListItem(PFL_DETTAGLBOZZA_STATO, (new IDVariant("A")), "Faccina Verde", "", "smileverde.gif", -1);
    PAN_DETTAGLBOZZA.SetValueListItem(PFL_DETTAGLBOZZA_STATO, (new IDVariant("N")), "Faccina rossa", "", "smilerosso.gif", -1);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ES, MyGlb.PANEL_LIST, 40, 44, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ES, MyGlb.PANEL_LIST, 24);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ES, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ES, MyGlb.PANEL_LIST, "E/S");
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ES, MyGlb.PANEL_FORM, 4, 52, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ES, MyGlb.PANEL_FORM, 24);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ES, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ES, MyGlb.PANEL_FORM, "E S");
    PAN_DETTAGLBOZZA.SetFieldPage(PFL_DETTAGLBOZZA_ES, -1, -1);
    PAN_DETTAGLBOZZA.SetFieldPanel(PFL_DETTAGLBOZZA_ES, PPQRY_POLPROVARDE5, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_DETTAGLBOZZA.SetValueListItem(PFL_DETTAGLBOZZA_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_DETTAGLBOZZA.SetValueListItem(PFL_DETTAGLBOZZA_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, MyGlb.PANEL_LIST, 104, 44, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, MyGlb.PANEL_FORM, 4, 100, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_DETTAGLBOZZA.SetFieldPage(PFL_DETTAGLBOZZA_CAPITOLO, -1, -1);
    PAN_DETTAGLBOZZA.SetFieldPanel(PFL_DETTAGLBOZZA_CAPITOLO, PPQRY_POLPROVARDE5, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ARTICOLO, MyGlb.PANEL_LIST, 204, 44, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ARTICOLO, MyGlb.PANEL_FORM, 4, 124, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_DETTAGLBOZZA.SetFieldPage(PFL_DETTAGLBOZZA_ARTICOLO, -1, -1);
    PAN_DETTAGLBOZZA.SetFieldPanel(PFL_DETTAGLBOZZA_ARTICOLO, PPQRY_POLPROVARDE5, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITARTSMAL, MyGlb.PANEL_LIST, 104, 0, 72, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITARTSMAL, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITARTSMAL, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITARTSMAL, MyGlb.PANEL_FORM, 152, 0, 72, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITARTSMAL, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITARTSMAL, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGLBOZZA.SetFieldPage(PFL_DETTAGLBOZZA_CAPITARTSMAL, -1, -1);
    PAN_DETTAGLBOZZA.SetFieldPanel(PFL_DETTAGLBOZZA_CAPITARTSMAL, -1, "", "CAPITARTSMAL", 0, 0, 0, -13997);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOARTBIG, MyGlb.PANEL_LIST, 104, 0, 124, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOARTBIG, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOARTBIG, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOARTBIG, MyGlb.PANEL_FORM, 160, 8, 72, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOARTBIG, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_CAPITOARTBIG, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGLBOZZA.SetFieldPage(PFL_DETTAGLBOZZA_CAPITOARTBIG, -1, -1);
    PAN_DETTAGLBOZZA.SetFieldPanel(PFL_DETTAGLBOZZA_CAPITOARTBIG, -1, "", "CAPITOARTBIG", 0, 0, 0, -13997);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_NUOVA, MyGlb.PANEL_LIST, 228, 44, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_NUOVA, MyGlb.PANEL_LIST, 92);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_NUOVA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_NUOVA, MyGlb.PANEL_LIST, "Nuova");
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_NUOVA, MyGlb.PANEL_FORM, 4, 148, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_NUOVA, MyGlb.PANEL_FORM, 92);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_NUOVA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_NUOVA, MyGlb.PANEL_FORM, "Nuova");
    PAN_DETTAGLBOZZA.SetFieldPage(PFL_DETTAGLBOZZA_NUOVA, -1, -1);
    PAN_DETTAGLBOZZA.SetFieldPanel(PFL_DETTAGLBOZZA_NUOVA, PPQRY_POLPROVARDE5, "A.ISTITUZIONE_NC", "ISTITUZIONE_NC", 5, 2, 0, -13997);
    PAN_DETTAGLBOZZA.SetValueListItem(PFL_DETTAGLBOZZA_NUOVA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DETTAGLBOZZA.SetValueListItem(PFL_DETTAGLBOZZA_NUOVA, (new IDVariant()), "Null", "", "", -1);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_UNITAORG, MyGlb.PANEL_LIST, 272, 44, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_UNITAORG, MyGlb.PANEL_LIST, 52);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_UNITAORG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_UNITAORG, MyGlb.PANEL_LIST, "Unità Org. ");
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_UNITAORG, MyGlb.PANEL_FORM, 4, 268, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_UNITAORG, MyGlb.PANEL_FORM, 52);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_UNITAORG, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_UNITAORG, MyGlb.PANEL_FORM, "Unità Org. ");
    PAN_DETTAGLBOZZA.SetFieldPage(PFL_DETTAGLBOZZA_UNITAORG, -1, -1);
    PAN_DETTAGLBOZZA.SetFieldUnbound(PFL_DETTAGLBOZZA_UNITAORG, true);
    PAN_DETTAGLBOZZA.SetFieldPanel(PFL_DETTAGLBOZZA_UNITAORG, PPQRY_POLPROVARDE5, "ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))", "RECORUNITORG", 5, 99, 0, -13997);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_PROGUNITORGA, MyGlb.PANEL_LIST, 264, 44, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_PROGUNITORGA, MyGlb.PANEL_LIST, 164);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 172, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_PROGUNITORGA, MyGlb.PANEL_FORM, 164);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_PROGUNITORGA, MyGlb.PANEL_FORM, "PR. UNITA ORGANIZZATIVA");
    PAN_DETTAGLBOZZA.SetFieldPage(PFL_DETTAGLBOZZA_PROGUNITORGA, -1, -1);
    PAN_DETTAGLBOZZA.SetFieldPanel(PFL_DETTAGLBOZZA_PROGUNITORGA, PPQRY_POLPROVARDE5, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO1, MyGlb.PANEL_LIST, 504, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO1, MyGlb.PANEL_LIST, "IMPORTO 1");
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO1, MyGlb.PANEL_FORM, 4, 196, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO1, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO1, MyGlb.PANEL_FORM, "IMP. 1");
    PAN_DETTAGLBOZZA.SetFieldPage(PFL_DETTAGLBOZZA_IMPORTO1, -1, GRP_DETTAGLBOZZA_IMPORTI);
    PAN_DETTAGLBOZZA.SetFieldPanel(PFL_DETTAGLBOZZA_IMPORTO1, PPQRY_POLPROVARDE5, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO2, MyGlb.PANEL_LIST, 608, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO2, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO2, MyGlb.PANEL_LIST, "IMPORTO 2");
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO2, MyGlb.PANEL_FORM, 4, 220, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO2, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO2, MyGlb.PANEL_FORM, "IMP. 2");
    PAN_DETTAGLBOZZA.SetFieldPage(PFL_DETTAGLBOZZA_IMPORTO2, -1, GRP_DETTAGLBOZZA_IMPORTI);
    PAN_DETTAGLBOZZA.SetFieldPanel(PFL_DETTAGLBOZZA_IMPORTO2, PPQRY_POLPROVARDE5, "A.IMPORTO_2", "IMPORTO_2", 3, 14, 2, -13997);
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO3, MyGlb.PANEL_LIST, 712, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO3, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO3, MyGlb.PANEL_LIST, "IMPORTO 3");
    PAN_DETTAGLBOZZA.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO3, MyGlb.PANEL_FORM, 4, 244, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLBOZZA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO3, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLBOZZA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLBOZZA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLBOZZA_IMPORTO3, MyGlb.PANEL_FORM, "IMP. 3");
    PAN_DETTAGLBOZZA.SetFieldPage(PFL_DETTAGLBOZZA_IMPORTO3, -1, GRP_DETTAGLBOZZA_IMPORTI);
    PAN_DETTAGLBOZZA.SetFieldPanel(PFL_DETTAGLBOZZA_IMPORTO3, PPQRY_POLPROVARDE5, "A.IMPORTO_3", "IMPORTO_3", 3, 14, 2, -13997);
  }

  private void PAN_DETTAGLBOZZA_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGLBOZZA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DETTAGLBOZZA.SetIMDB(IMDB, "PQRY_POLPROVARDE5", true);
    PAN_DETTAGLBOZZA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ISTITUZIONE_NC as ISTITUZIONE_NC, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.IMPORTO_1 as IMPORTO_1, ");
    SQL.append("  A.IMPORTO_2 as IMPORTO_2, ");
    SQL.append("  A.IMPORTO_3 as IMPORTO_3, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as RECORUNITORG ");
    PAN_DETTAGLBOZZA.SetQuery(PPQRY_POLPROVARDE5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT A ");
    PAN_DETTAGLBOZZA.SetQuery(PPQRY_POLPROVARDE5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((A.BOZZA_VARIAZIONE_ID = ~~TBL_PAR62.ROWNAMBOVAID~~ AND ~~TBL_PAR62.RONADABOODAD~~ = 0) OR (A.PROPOSTA_VAR_ID = ~~TBL_PAR62.ROWNAMEVARID~~ AND (~~TBL_PAR62.RONADABOODAD~~ = 1 OR ~~TBL_PAR62.RONADABOODAD~~ = 2))) ");
    SQL.append("and   ((A.COD_REC = 2 AND ~~TBL_PAR62.RONADABOODAD~~ <> 2) OR (A.COD_REC = 1 AND ~~TBL_PAR62.RONADABOODAD~~ = 2)) ");
    PAN_DETTAGLBOZZA.SetQuery(PPQRY_POLPROVARDE5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLBOZZA.SetQuery(PPQRY_POLPROVARDE5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLBOZZA.SetQuery(PPQRY_POLPROVARDE5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_DETTAGLBOZZA.SetQuery(PPQRY_POLPROVARDE5, 5, SQL, -1, "");
    PAN_DETTAGLBOZZA.SetQueryDB(PPQRY_POLPROVARDE5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLBOZZA.SetMasterTable(0, "POL_PROPOSTE_VAR_DETT");
    PAN_DETTAGLBOZZA.AddToSortList(PFL_DETTAGLBOZZA_ES, true);
    PAN_DETTAGLBOZZA.AddToSortList(PFL_DETTAGLBOZZA_CAPITOLO, true);
    PAN_DETTAGLBOZZA.AddToSortList(PFL_DETTAGLBOZZA_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGLBOZZA.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGLBOZZA.iUseListQBE;
      PAN_DETTAGLBOZZA.iUseListQBE = 0;
      PAN_DETTAGLBOZZA.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGLBOZZA.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGLBOZZA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DETTAGLBOZZA) PAN_DETTAGLBOZZA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGLBOZZA) PAN_DETTAGLBOZZA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTAGLBOZZA) PAN_DETTAGLBOZZA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGLBOZZA) PAN_DETTAGLBOZZA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DETTAGLBOZZA) PAN_DETTAGLBOZZA_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_DETTAGLBOZZA) PAN_DETTAGLBOZZA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
