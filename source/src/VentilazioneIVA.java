// **********************************************
// Ventilazione I V A
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VentilazioneIVA extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VENTILAZIIVA_TIPOREGISTRO = 0;
  private static int PFL_VENTILAZIIVA_TIPOBOLLATO = 1;
  private static int PFL_VENTILAZIIVA_IMPONIBILE = 2;
  private static int PFL_VENTILAZIIVA_IVA = 3;
  private static int PFL_VENTILAZIIVA_ALIQUOTA = 4;
  private static int PFL_VENTILAZIIVA_SOMMA1 = 5;
  private static int PFL_VENTILAZIIVA_SOMMA2 = 6;
  private static int PFL_VENTILAZIIVA_TOTALE = 7;
  private static int PFL_VENTILAZIIVA_TOT = 8;

  private static int PPQRY_IVAVEN = 0;


  IDPanel PAN_VENTILAZIIVA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE36(IMDB);
    //
    //
    Init_PQRY_IVAVEN(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE36(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_NEWTABLE36, 5);
    IMDB.set_TblCode(IMDBDef2.TBL_NEWTABLE36, "TBL_NEWTABLE36");
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE36,IMDBDef2.FLD_NEWTABLE36_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE36,IMDBDef2.FLD_NEWTABLE36_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE36,IMDBDef2.FLD_NEWTABLE36_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE36,IMDBDef2.FLD_NEWTABLE36_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE36,IMDBDef2.FLD_NEWTABLE36_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE36,IMDBDef2.FLD_NEWTABLE36_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE36,IMDBDef2.FLD_NEWTABLE36_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE36,IMDBDef2.FLD_NEWTABLE36_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE36,IMDBDef2.FLD_NEWTABLE36_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE36,IMDBDef2.FLD_NEWTABLE36_ROWNAMEANNO,1,4,0);
    IMDB.TblAddNew(IMDBDef2.TBL_NEWTABLE36, 0);
  }

  private static void Init_PQRY_IVAVEN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_IVAVEN, 5);
    IMDB.set_TblCode(IMDBDef10.PQRY_IVAVEN, "PQRY_IVAVEN");
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAVEN,IMDBDef10.PQSL_IVAVEN_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAVEN,IMDBDef10.PQSL_IVAVEN_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAVEN,IMDBDef10.PQSL_IVAVEN_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAVEN,IMDBDef10.PQSL_IVAVEN_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAVEN,IMDBDef10.PQSL_IVAVEN_IMPONIBILE, "IMPONIBILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAVEN,IMDBDef10.PQSL_IVAVEN_IMPONIBILE,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAVEN,IMDBDef10.PQSL_IVAVEN_IVA, "IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAVEN,IMDBDef10.PQSL_IVAVEN_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_IVAVEN,IMDBDef10.PQSL_IVAVEN_ALIQUOTA, "ALIQUOTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_IVAVEN,IMDBDef10.PQSL_IVAVEN_ALIQUOTA,1,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_IVAVEN, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VentilazioneIVA(MyWebEntryPoint w, IMDBObj imdb)
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
  public VentilazioneIVA()
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
    FormIdx = MyGlb.FRM_VENTILAZIIVA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "17B35C35-14AB-4739-AB00-B014577833E8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 480;
    DesignHeight = 342;
    set_Caption(new IDVariant("Ventilazione I V A"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 480;
    Frames[1].Height = 316;
    Frames[1].Caption = "Ventilazione IVA";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 316;
    PAN_VENTILAZIIVA = new IDPanel(w, this, 1, "PAN_VENTILAZIIVA");
    Frames[1].Content = PAN_VENTILAZIIVA;
    PAN_VENTILAZIIVA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VENTILAZIIVA.VS = MainFrm.VisualStyleList;
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 480-MyGlb.PAN_OFFS_X, 316-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VENTILAZIIVA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1841D5BC-E2D6-4144-8EB2-E3050FE53FF0");
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 292, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VENTILAZIIVA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VENTILAZIIVA.InitStatus = 1;
    PAN_VENTILAZIIVA_Init();
    PAN_VENTILAZIIVA_InitFields();
    PAN_VENTILAZIIVA_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_NEWCOMMAND2+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_MENU9+BaseCmdSetIdx, "M" + (MyGlb.CMD_NEWCOMMAND2+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CALCOIVAVENT+BaseCmdLinIdx)
      {
        CalcoloIVAVentilata1();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_PERCEDIINCID+BaseCmdLinIdx)
      {
        PercentualiDiIncidenza1();
        break fine;
      }
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
      PAN_VENTILAZIIVA.UpdatePanel(MainFrm);
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
    return (obj instanceof VentilazioneIVA);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VentilazioneIVA.class.getName() : (Glb.ClassWithPackage(VentilazioneIVA.class) ? VentilazioneIVA.class.getName().substring(VentilazioneIVA.class.getPackage().getName().length() + 1) : VentilazioneIVA.class.getName()));
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
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Ventilazione I.V.A.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAP));
      PAN_VENTILAZIIVA.set_Header(Glb.OBJ_FIELD,PFL_VENTILAZIIVA_ALIQUOTA, (new IDVariant("%")).stringValue());
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VentilazioneIVA", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Ventilazione IVA After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_VENTILAZIIVA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SOMMATOTALE = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Ventilazione IVA After Find Event Body
      // Procedure Body
      // 
      PAN_VENTILAZIIVA.set_FieldText(PFL_VENTILAZIIVA_SOMMA1, IDL.ToString(IDL.NullValue(PAN_VENTILAZIIVA.GetFieldSum(PFL_VENTILAZIIVA_IMPONIBILE),(new IDVariant(0)))).stringValue());
      PAN_VENTILAZIIVA.set_FieldText(PFL_VENTILAZIIVA_SOMMA2, IDL.ToString(IDL.NullValue(PAN_VENTILAZIIVA.GetFieldSum(PFL_VENTILAZIIVA_IVA),(new IDVariant(0)))).stringValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  SUM(DECODE(B.CODICE_DOC, 1, 1, -1) * SEGNO_IVA(B.CODICE_DOC,A.CODICE_DOC) * (NVL(A.IMPONIBILE, 0) + NVL(A.IVA, 0))) as SIEFCD111CDS ");
      SQL.append("from ");
      SQL.append("  IVA A, ");
      SQL.append("  FAT B ");
      SQL.append("where (A.ANNO_PROG = B.ANNO_PROG) ");
      SQL.append("and   (A.NUMERO_PROG = B.NUMERO_PROG) ");
      SQL.append("and   (A.ANNO_REG = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMEANNO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO_REGISTRO = 1) ");
      SQL.append("and   (A.D_DATA_REG <= " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMEDATAA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.RIVENDITA = 'SI') ");
      SQL.append("and   (NOT ((A.ALIQUOTA IS NULL))) ");
      SQL.append("and   (A.ALIQUOTA <> 0) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SOMMATOTALE = QV.Get("SIEFCD111CDS", IDVariant.DECIMAL) ;
      }
      QV.Close();
      PAN_VENTILAZIIVA.set_FieldText(PFL_VENTILAZIIVA_TOT, IDL.ToString(v_SOMMATOTALE).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VentilazioneIVA", "VentilazioneIVAAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Calcolo I V A Ventilata1
  // **********************************************************************
  public int CalcoloIVAVentilata1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcolo I V A Ventilata1 Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE38, IMDBDef2.FLD_NEWTABLE38_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMTIPREG, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE38, IMDBDef2.FLD_NEWTABLE38_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMTIPBOL, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE38, IMDBDef2.FLD_NEWTABLE38_ROWNAMEANNO, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMEANNO, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE38, IMDBDef2.FLD_NEWTABLE38_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMEDATDA, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE38, IMDBDef2.FLD_NEWTABLE38_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMEDATAA, 0));
      MainFrm.Show(MyGlb.FRM_CALCOIVAVENT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VentilazioneIVA", "CalcoloIVAVentilata1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Percentuali Di Incidenza1
  // **********************************************************************
  public int PercentualiDiIncidenza1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Percentuali Di Incidenza1 Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE39, IMDBDef2.FLD_NEWTABLE39_ROWNAMTIPREG, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMTIPREG, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE39, IMDBDef2.FLD_NEWTABLE39_ROWNAMTIPBOL, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMTIPBOL, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE39, IMDBDef2.FLD_NEWTABLE39_ROWNAMEANNO, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMEANNO, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE39, IMDBDef2.FLD_NEWTABLE39_ROWNAMEDATDA, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMEDATDA, 0));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE39, IMDBDef2.FLD_NEWTABLE39_ROWNAMEDATAA, 0, IMDB.Value(IMDBDef2.TBL_NEWTABLE36, IMDBDef2.FLD_NEWTABLE36_ROWNAMEDATAA, 0));
      MainFrm.Show(MyGlb.FRM_PERCEDIINCID, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VentilazioneIVA", "PercentualiDiIncidenza1", _e);
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
  private void PAN_VENTILAZIIVA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VENTILAZIIVA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VENTILAZIIVA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VENTILAZIIVA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VENTILAZIIVA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_VENTILAZIIVA);
    // Stub
  }

  private void PAN_VENTILAZIIVA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VENTILAZIIVA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VENTILAZIIVA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VENTILAZIIVA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VENTILAZIIVA_Init()
  {

    PAN_VENTILAZIIVA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VENTILAZIIVA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VENTILAZIIVA.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_VENTILAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOREGISTRO, "E9E12548-A739-412E-B900-1782026DB1A5");
    PAN_VENTILAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOREGISTRO, "TIPO REGISTRO");
    PAN_VENTILAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOREGISTRO, "Tipo Registro");
    PAN_VENTILAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOREGISTRO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VENTILAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOREGISTRO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VENTILAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOBOLLATO, "9A7579C7-1ACA-47BE-84E6-75AE222B2A64");
    PAN_VENTILAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOBOLLATO, "TIPO BOLLATO");
    PAN_VENTILAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOBOLLATO, "Ttipo di Bollato");
    PAN_VENTILAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOBOLLATO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VENTILAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOBOLLATO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VENTILAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IMPONIBILE, "33241235-995A-4935-AF0A-E28444057E9D");
    PAN_VENTILAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IMPONIBILE, "Imponibile");
    PAN_VENTILAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IMPONIBILE, "");
    PAN_VENTILAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IMPONIBILE, MyGlb.VIS_NORMALFIELDS);
    PAN_VENTILAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IMPONIBILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VENTILAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IVA, "C23A9487-7FC6-4722-A06E-2F7D57962202");
    PAN_VENTILAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IVA, "I.V.A.");
    PAN_VENTILAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IVA, "");
    PAN_VENTILAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IVA, MyGlb.VIS_NORMALFIELDS);
    PAN_VENTILAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VENTILAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_ALIQUOTA, "3D39278B-9AAF-4364-8C77-E682D6A4636C");
    PAN_VENTILAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_ALIQUOTA, "ALIQUOTA");
    PAN_VENTILAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_ALIQUOTA, "Aliquota applicata");
    PAN_VENTILAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_ALIQUOTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VENTILAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_ALIQUOTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VENTILAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA1, "4D082FF3-3865-42C3-8127-BA3F6CAD70F5");
    PAN_VENTILAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA1, "");
    PAN_VENTILAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA1, MyGlb.VIS_CAMPTOTADISA);
    PAN_VENTILAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VENTILAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA2, "132537CB-6AEA-4048-BBFE-0A69AAAD9B07");
    PAN_VENTILAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA2, "");
    PAN_VENTILAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA2, MyGlb.VIS_CAMPTOTADISA);
    PAN_VENTILAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VENTILAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOTALE, "7DD66F98-0DDB-4EF0-9522-C50389312E74");
    PAN_VENTILAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOTALE, "Totale Fatture Destinate a Rivendita ");
    PAN_VENTILAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOTALE, MyGlb.VIS_VUOGRAALILEF);
    PAN_VENTILAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VENTILAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOT, "6FB64CDB-E39F-45D9-9F66-C5BD12DEA741");
    PAN_VENTILAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOT, "");
    PAN_VENTILAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOT, MyGlb.VIS_CAMPTOTADISA);
    PAN_VENTILAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_VENTILAZIIVA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOREGISTRO, MyGlb.PANEL_LIST, 88);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_VENTILAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOREGISTRO, MyGlb.PANEL_LIST, "TIPO REGISTRO");
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOREGISTRO, MyGlb.PANEL_FORM, 4, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOREGISTRO, MyGlb.PANEL_FORM, 88);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_VENTILAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOREGISTRO, MyGlb.PANEL_FORM, "TP. REGISTRO");
    PAN_VENTILAZIIVA.SetFieldPage(PFL_VENTILAZIIVA_TIPOREGISTRO, -1, -1);
    PAN_VENTILAZIIVA.SetFieldPanel(PFL_VENTILAZIIVA_TIPOREGISTRO, PPQRY_IVAVEN, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 2, 0, -13997);
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 80);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_VENTILAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOBOLLATO, MyGlb.PANEL_LIST, "TIPO BOLLATO");
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 4, 28, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 80);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_VENTILAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TIPOBOLLATO, MyGlb.PANEL_FORM, "TP. BOLLATO");
    PAN_VENTILAZIIVA.SetFieldPage(PFL_VENTILAZIIVA_TIPOBOLLATO, -1, -1);
    PAN_VENTILAZIIVA.SetFieldPanel(PFL_VENTILAZIIVA_TIPOBOLLATO, PPQRY_IVAVEN, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IMPONIBILE, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IMPONIBILE, MyGlb.PANEL_LIST, 68);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IMPONIBILE, MyGlb.PANEL_LIST, 1);
    PAN_VENTILAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IMPONIBILE, MyGlb.PANEL_LIST, "Imponibile");
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IMPONIBILE, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IMPONIBILE, MyGlb.PANEL_FORM, 68);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IMPONIBILE, MyGlb.PANEL_FORM, 1);
    PAN_VENTILAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IMPONIBILE, MyGlb.PANEL_FORM, "Imponibile");
    PAN_VENTILAZIIVA.SetFieldPage(PFL_VENTILAZIIVA_IMPONIBILE, -1, -1);
    PAN_VENTILAZIIVA.SetFieldPanel(PFL_VENTILAZIIVA_IMPONIBILE, PPQRY_IVAVEN, "A.IMPONIBILE", "IMPONIBILE", 3, 14, 2, -13997);
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IVA, MyGlb.PANEL_LIST, 132, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IVA, MyGlb.PANEL_LIST, 28);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IVA, MyGlb.PANEL_LIST, 1);
    PAN_VENTILAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IVA, MyGlb.PANEL_LIST, "I.V.A.");
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IVA, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IVA, MyGlb.PANEL_FORM, 28);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IVA, MyGlb.PANEL_FORM, 1);
    PAN_VENTILAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_IVA, MyGlb.PANEL_FORM, "I V A");
    PAN_VENTILAZIIVA.SetFieldPage(PFL_VENTILAZIIVA_IVA, -1, -1);
    PAN_VENTILAZIIVA.SetFieldPanel(PFL_VENTILAZIIVA_IVA, PPQRY_IVAVEN, "A.IVA", "IVA", 3, 14, 2, -13997);
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_ALIQUOTA, MyGlb.PANEL_LIST, 264, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_ALIQUOTA, MyGlb.PANEL_LIST, 60);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_ALIQUOTA, MyGlb.PANEL_LIST, 1);
    PAN_VENTILAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_ALIQUOTA, MyGlb.PANEL_LIST, "AL.");
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_ALIQUOTA, MyGlb.PANEL_FORM, 4, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_ALIQUOTA, MyGlb.PANEL_FORM, 60);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_ALIQUOTA, MyGlb.PANEL_FORM, 1);
    PAN_VENTILAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_ALIQUOTA, MyGlb.PANEL_FORM, "ALIQ.");
    PAN_VENTILAZIIVA.SetFieldPage(PFL_VENTILAZIIVA_ALIQUOTA, -1, -1);
    PAN_VENTILAZIIVA.SetFieldPanel(PFL_VENTILAZIIVA_ALIQUOTA, PPQRY_IVAVEN, "A.ALIQUOTA", "ALIQUOTA", 1, 2, 0, -13997);
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA1, MyGlb.PANEL_LIST, 0, 164, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA1, MyGlb.PANEL_LIST, 0);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA1, MyGlb.PANEL_LIST, 1);
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA1, MyGlb.PANEL_FORM, 0, 164, 92, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA1, MyGlb.PANEL_FORM, 0);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA1, MyGlb.PANEL_FORM, 1);
    PAN_VENTILAZIIVA.SetFieldPage(PFL_VENTILAZIIVA_SOMMA1, -1, -1);
    PAN_VENTILAZIIVA.SetFieldPanel(PFL_VENTILAZIIVA_SOMMA1, -1, "", "SOMMA1", 0, 0, 0, -13997);
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA2, MyGlb.PANEL_LIST, 132, 164, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA2, MyGlb.PANEL_LIST, 0);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA2, MyGlb.PANEL_LIST, 1);
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA2, MyGlb.PANEL_FORM, 8, 172, 92, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA2, MyGlb.PANEL_FORM, 0);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_SOMMA2, MyGlb.PANEL_FORM, 1);
    PAN_VENTILAZIIVA.SetFieldPage(PFL_VENTILAZIIVA_SOMMA2, -1, -1);
    PAN_VENTILAZIIVA.SetFieldPanel(PFL_VENTILAZIIVA_SOMMA2, -1, "", "SOMMA2", 0, 0, 0, -13997);
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOTALE, MyGlb.PANEL_LIST, 0, 192, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOTALE, MyGlb.PANEL_LIST, 0);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOTALE, MyGlb.PANEL_LIST, 2);
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOTALE, MyGlb.PANEL_FORM, 0, 192, 100, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOTALE, MyGlb.PANEL_FORM, 0);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOTALE, MyGlb.PANEL_FORM, 3);
    PAN_VENTILAZIIVA.SetFieldPage(PFL_VENTILAZIIVA_TOTALE, -1, -1);
    PAN_VENTILAZIIVA.SetFieldPanel(PFL_VENTILAZIIVA_TOTALE, -1, "", "TOTALE", 0, 0, 0, -13997);
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOT, MyGlb.PANEL_LIST, 132, 200, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOT, MyGlb.PANEL_LIST, 0);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOT, MyGlb.PANEL_LIST, 1);
    PAN_VENTILAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOT, MyGlb.PANEL_FORM, 16, 180, 92, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VENTILAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOT, MyGlb.PANEL_FORM, 0);
    PAN_VENTILAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VENTILAZIIVA_TOT, MyGlb.PANEL_FORM, 1);
    PAN_VENTILAZIIVA.SetFieldPage(PFL_VENTILAZIIVA_TOT, -1, -1);
    PAN_VENTILAZIIVA.SetFieldPanel(PFL_VENTILAZIIVA_TOT, -1, "", "TOT", 0, 0, 0, -13997);
  }

  private void PAN_VENTILAZIIVA_InitQueries()
  {
    StringBuffer SQL;

    PAN_VENTILAZIIVA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VENTILAZIIVA.SetIMDB(IMDB, "PQRY_IVAVEN", true);
    PAN_VENTILAZIIVA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_REGISTRO as TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO as TIPO_BOLLATO, ");
    SQL.append("  A.IMPONIBILE as IMPONIBILE, ");
    SQL.append("  A.IVA as IVA, ");
    SQL.append("  A.ALIQUOTA as ALIQUOTA ");
    PAN_VENTILAZIIVA.SetQuery(PPQRY_IVAVEN, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  IVAVEN A ");
    PAN_VENTILAZIIVA.SetQuery(PPQRY_IVAVEN, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO_REGISTRO = ~~TBL_NEWTABLE36.ROWNAMTIPREG~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~TBL_NEWTABLE36.ROWNAMTIPBOL~~) ");
    SQL.append("and   (A.DA_MESE = TO_NUMBER(TO_CHAR(~~TBL_NEWTABLE36.ROWNAMEDATDA~~, 'mm' ))) ");
    SQL.append("and   (A.A_MESE = TO_NUMBER(TO_CHAR(~~TBL_NEWTABLE36.ROWNAMEDATAA~~, 'mm' ))) ");
    SQL.append("and   (A.ANNO = ~~TBL_NEWTABLE36.ROWNAMEANNO~~) ");
    PAN_VENTILAZIIVA.SetQuery(PPQRY_IVAVEN, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VENTILAZIIVA.SetQuery(PPQRY_IVAVEN, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VENTILAZIIVA.SetQuery(PPQRY_IVAVEN, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VENTILAZIIVA.SetQuery(PPQRY_IVAVEN, 5, SQL, -1, "");
    PAN_VENTILAZIIVA.SetQueryDB(PPQRY_IVAVEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VENTILAZIIVA.SetMasterTable(0, "IVAVEN");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VENTILAZIIVA.Status() == 2)
    {
      int oldListQBE = PAN_VENTILAZIIVA.iUseListQBE;
      PAN_VENTILAZIIVA.iUseListQBE = 0;
      PAN_VENTILAZIIVA.PanelCommand(Glb.PCM_SEARCH);
      PAN_VENTILAZIIVA.PanelCommand(Glb.PCM_FIND);
      PAN_VENTILAZIIVA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VENTILAZIIVA) PAN_VENTILAZIIVA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VENTILAZIIVA) PAN_VENTILAZIIVA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VENTILAZIIVA) PAN_VENTILAZIIVA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VENTILAZIIVA) PAN_VENTILAZIIVA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VENTILAZIIVA) PAN_VENTILAZIIVA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_VENTILAZIIVA) PAN_VENTILAZIIVA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
