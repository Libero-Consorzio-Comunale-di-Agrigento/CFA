// **********************************************
// Info Step Fattura
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoStepFattura extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_STEPPCC_PROGREREGIST = 0;
  private static int PFL_STEPPCC_SEQUENZA = 1;
  private static int PFL_STEPPCC_AZIONE = 2;
  private static int PFL_STEPPCC_DATAULTIVARI = 3;
  private static int PFL_STEPPCC_STATODELDEBI = 4;
  private static int PFL_STEPPCC_IMPORTPARZIA = 5;
  private static int PFL_STEPPCC_NOMEFILE = 6;
  private static int PFL_STEPPCC_STEPANNULLAT = 7;
  private static int PFL_STEPPCC_NOTE = 8;
  private static int PFL_STEPPCC_UTENULTIVARI = 9;
  private static int PFL_STEPPCC_UTENTINOMINA = 10;
  private static int PFL_STEPPCC_CODICEESITO = 11;
  private static int PFL_STEPPCC_DESCRESITO = 12;
  private static int PFL_STEPPCC_ETICHESOGGET = 13;
  private static int PFL_STEPPCC_ETICHEDOCUME = 14;
  private static int PFL_STEPPCC_ETICIMPOHEAD = 15;
  private static int PFL_STEPPCC_ETICHEIMPORT = 16;
  private static int PFL_STEPPCC_ETICHETSTATO = 17;
  private static int PFL_STEPPCC_ETIICOSTALIQ = 18;
  private static int PFL_STEPPCC_ANNOPROG = 19;
  private static int PFL_STEPPCC_NUMEROPROG = 20;

  private static int PPQRY_PCCSTEP = 0;

  private static int PPQRY_UTENTI = 1;


  IDPanel PAN_STEPPCC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI631(IMDB);
    //
    //
    Init_PQRY_PCCSTEP(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI631(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI631, 2);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI631, "TBL_PARAMETRI631");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI631,IMDBDef3.FLD_PARAMETRI631_PARAANNOPROG, "PARAANNOPROG");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI631,IMDBDef3.FLD_PARAMETRI631_PARAANNOPROG,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI631,IMDBDef3.FLD_PARAMETRI631_PARANUMEPROG, "PARANUMEPROG");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI631,IMDBDef3.FLD_PARAMETRI631_PARANUMEPROG,1,5,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI631, 0);
  }

  private static void Init_PQRY_PCCSTEP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PCCSTEP, 14);
    IMDB.set_TblCode(IMDBDef10.PQRY_PCCSTEP, "PQRY_PCCSTEP");
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEPROREG, "PCCSTEPROREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEPROREG,5,12,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEPSEQUE, "PCCSTEPSEQUE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEPSEQUE,1,3,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEPAZION, "PCCSTEPAZION");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEPAZION,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTESTDEDE, "PCCSTESTDEDE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTESTDEDE,5,12,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEIMPPAR, "PCCSTEIMPPAR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEIMPPAR,3,12,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTENOMFIL, "PCCSTENOMFIL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTENOMFIL,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEPANNUL, "PCCSTEPANNUL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEPANNUL,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEPNOTE, "PCCSTEPNOTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEPNOTE,5,200,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEDAULVA, "PCCSTEDAULVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEDAULVA,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEUTULVA, "PCCSTEUTULVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEUTULVA,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTECODESI, "PCCSTECODESI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTECODESI,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEDESESI, "PCCSTEDESESI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCCSTEDESESI,5,200,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCSTPCDOANPR, "PCSTPCDOANPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCSTPCDOANPR,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCSTPCDONUPR, "PCSTPCDONUPR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCSTEP,IMDBDef10.PQSL_PCCSTEP_PCSTPCDONUPR,1,5,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PCCSTEP, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoStepFattura(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoStepFattura()
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
    FormIdx = MyGlb.FRM_INFOSTEPFATT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BDFED637-9227-47DD-BC9E-FBBBF8341088";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1000;
    DesignHeight = 474;
    set_Caption(new IDVariant("Step PCC"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1000;
    Frames[1].Height = 448;
    Frames[1].Caption = "Step PCC";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 448;
    PAN_STEPPCC = new IDPanel(w, this, 1, "PAN_STEPPCC");
    Frames[1].Content = PAN_STEPPCC;
    PAN_STEPPCC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STEPPCC.VS = MainFrm.VisualStyleList;
    PAN_STEPPCC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1000-MyGlb.PAN_OFFS_X, 448-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "85EBB07B-B7C2-4998-A642-AADDF003A9ED");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 56, 896, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STEPPCC.InitStatus = 2;
    PAN_STEPPCC_Init();
    PAN_STEPPCC_InitFields();
    PAN_STEPPCC_InitQueries();
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
      PAN_STEPPCC.UpdatePanel(MainFrm);
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
    return (obj instanceof InfoStepFattura);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoStepFattura.class.getName() : (Glb.ClassWithPackage(InfoStepFattura.class) ? InfoStepFattura.class.getName().substring(InfoStepFattura.class.getPackage().getName().length() + 1) : InfoStepFattura.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      IDVariant v_VFATNUMERDOC = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VFATDDATADOC = new IDVariant(0,IDVariant.DATETIME);
      IDVariant v_VFATCODICDOC = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VFATIMPORTO = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VBENRAGSOCES = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VSTATOLIQ = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.NUMERO_DOC as FATNUMERODOC, ");
      SQL.append("  A.D_DATA_DOC as FATDDATADOC, ");
      SQL.append("  A.CODICE_DOC as FATCODICEDOC, ");
      SQL.append("  A.IMPORTO as FATIMPORTO, ");
      SQL.append("  B.RAGIONE_SOCIALE_ESTESA as BENRAGSOCEST, ");
      SQL.append("  GET_STATO_FATTURA(A.ANNO_PROG,A.NUMERO_PROG,A.CODICE_DOC,'FAT') as GSFFAPFNPFCD ");
      SQL.append("from ");
      SQL.append("  FAT A, ");
      SQL.append("  BEN B ");
      SQL.append("where (B.CODICE = A.CODICE) ");
      SQL.append("and   (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI631, IMDBDef3.FLD_PARAMETRI631_PARAANNOPROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI631, IMDBDef3.FLD_PARAMETRI631_PARANUMEPROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VFATNUMERDOC = QV.Get("FATNUMERODOC", IDVariant.STRING) ;
        v_VFATDDATADOC = QV.Get("FATDDATADOC", IDVariant.DATETIME) ;
        v_VFATCODICDOC = QV.Get("FATCODICEDOC", IDVariant.INTEGER) ;
        v_VFATIMPORTO = QV.Get("FATIMPORTO", IDVariant.DECIMAL) ;
        v_VBENRAGSOCES = QV.Get("BENRAGSOCEST", IDVariant.STRING) ;
        v_VSTATOLIQ = QV.Get("GSFFAPFNPFCD", IDVariant.STRING) ;
      }
      QV.Close();
      PAN_STEPPCC.set_FieldText(PFL_STEPPCC_ETICHESOGGET, IDL.Add((new IDVariant("Soggetto: ")), v_VBENRAGSOCES).stringValue());
      PAN_STEPPCC.set_FieldText(PFL_STEPPCC_ETICHEDOCUME, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(v_VFATCODICDOC), (new IDVariant(" "))), v_VFATNUMERDOC), (new IDVariant(" "))), (new IDVariant("del"))), (new IDVariant(" "))), IDL.ToString(v_VFATDDATADOC)).stringValue());
      PAN_STEPPCC.set_FieldText(PFL_STEPPCC_ETICHEIMPORT, IDL.Format(IDL.NullValue(v_VFATIMPORTO,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      if (v_VSTATOLIQ.equals((new IDVariant("N")), true))
      {
        IDVariant v_TOOLICONVERD = new IDVariant(0,IDVariant.STRING);
        v_TOOLICONVERD = (new IDVariant("Mandato Emesso"));
        PAN_STEPPCC.set_FieldText(PFL_STEPPCC_ETICHETSTATO, new IDVariant(v_TOOLICONVERD).stringValue());
        PAN_STEPPCC.SetImage(Glb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, 0, (new IDVariant("vnera.gif")).stringValue()); 
      }
      else if (v_VSTATOLIQ.equals((new IDVariant("R")), true))
      {
        IDVariant v_TOOLICONNERA = new IDVariant(0,IDVariant.STRING);
        v_TOOLICONNERA = (new IDVariant("Liquidata - in Emissione"));
        PAN_STEPPCC.set_FieldText(PFL_STEPPCC_ETICHETSTATO, new IDVariant(v_TOOLICONNERA).stringValue());
        PAN_STEPPCC.SetImage(Glb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, 0, (new IDVariant("vrossa.gif")).stringValue()); 
      }
      else if (v_VSTATOLIQ.equals((new IDVariant("V")), true))
      {
        IDVariant v_TOOLICONVERD = new IDVariant(0,IDVariant.STRING);
        v_TOOLICONVERD = (new IDVariant("Liquidata"));
        PAN_STEPPCC.set_FieldText(PFL_STEPPCC_ETICHETSTATO, new IDVariant(v_TOOLICONVERD).stringValue());
        PAN_STEPPCC.SetImage(Glb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, 0, (new IDVariant("vverde.gif")).stringValue()); 
      }
      else if (v_VSTATOLIQ.equals((new IDVariant("G")), true))
      {
        IDVariant v_TOOLICONGIAL = new IDVariant(0,IDVariant.STRING);
        v_TOOLICONGIAL = (new IDVariant("Inserita in Distinta"));
        PAN_STEPPCC.set_FieldText(PFL_STEPPCC_ETICHETSTATO, new IDVariant(v_TOOLICONGIAL).stringValue());
        PAN_STEPPCC.SetImage(Glb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, 0, (new IDVariant("vgialla.gif")).stringValue()); 
      }
      else
      {
        PAN_STEPPCC.set_FieldText(PFL_STEPPCC_ETICHETSTATO, (new IDVariant("")).stringValue());
        PAN_STEPPCC.SetImage(Glb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, 0, (new IDVariant("")).stringValue()); 
      }
      PAN_STEPPCC.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoStepFattura", "Load", _e);
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
  private void PAN_STEPPCC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_STEPPCC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_STEPPCC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_STEPPCC, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STEPPCC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_STEPPCC);
    // Stub
  }

  private void PAN_STEPPCC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_STEPPCC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_STEPPCC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PCCSTEP, IMDBDef10.PQSL_PCCSTEP_PCCSTEPANNUL, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_PCCSTEP, IMDBDef10.PQSL_PCCSTEP_PCCSTEPANNUL, 0, (new IDVariant("SI")));
      }
      if (Cancel.isFalse())
      {
        PAN_STEPPCC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_STEPPCC_Init()
  {

    PAN_STEPPCC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STEPPCC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_STEPPCC.SetSize(MyGlb.OBJ_FIELD, 21);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_PROGREREGIST, "D6AC7576-DD3E-44AE-BE47-BF513A577C45");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_PROGREREGIST, "PROGRESSIVO REGISTRAZIONE");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_PROGREREGIST, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_PROGREREGIST, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_PROGREREGIST, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_SEQUENZA, "45DD91DC-545B-4C6A-8116-A1748C79353B");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_SEQUENZA, "SEQUENZA");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_SEQUENZA, "Sequenza dello step nell'ambito del progr_registrazione");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_SEQUENZA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_SEQUENZA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_AZIONE, "D0321EBD-93C3-4CD6-9055-47278A676287");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_AZIONE, "Azione");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_AZIONE, "Azione prodotta dallo Step in ottica comunicazione a a PCC");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_AZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_AZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_DATAULTIVARI, "8AF40DD7-C879-48EC-8527-05B2A6A83990");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_DATAULTIVARI, "Del");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_DATAULTIVARI, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_DATAULTIVARI, MyGlb.VIS_NORMALFIELDS);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_DATAULTIVARI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_STATODELDEBI, "F2ACC588-4D74-464E-B735-92EC526ACB59");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_STATODELDEBI, "Stato del Debito");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_STATODELDEBI, "Stato del debito Comunicato a PCC");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_STATODELDEBI, MyGlb.VIS_NORMALFIELDS);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_STATODELDEBI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_IMPORTPARZIA, "A56DF851-58D2-4A0E-813A-34E9F5D0F1F9");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_IMPORTPARZIA, "Importo");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_IMPORTPARZIA, "Eventuale importo di pagamento parziale");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_IMPORTPARZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_IMPORTPARZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOMEFILE, "65F3AD09-E3C5-4A1E-926B-2D3914AA3E7B");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOMEFILE, "Nome File");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOMEFILE, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOMEFILE, MyGlb.VIS_NORMALFIELDS);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOMEFILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_STEPANNULLAT, "B474D76D-817F-4E79-9CD2-3682C8971BFC");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_STEPANNULLAT, "Annullato");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_STEPANNULLAT, "Se l'elaborazione del singolo step e' da considerare annullata SI / NO");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_STEPANNULLAT, MyGlb.VIS_CHECKSTYLE);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_STEPANNULLAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOTE, "1006B918-11F2-419F-8B8D-70C56F58C481");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOTE, "Note");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOTE, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOTE, MyGlb.VIS_NORMALFIELDS);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENULTIVARI, "7EE0A5A4-88EA-4ED7-853B-4FA656489382");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENULTIVARI, "Utente Ultima Variazione");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENULTIVARI, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENULTIVARI, MyGlb.VIS_NORMALFIELDS);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENULTIVARI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENTINOMINA, "2C14E9D6-40F1-4503-9600-559855088287");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENTINOMINA, "UTENTI NOMINATIVO");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENTINOMINA, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENTINOMINA, MyGlb.VIS_NORMALFIELDS);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENTINOMINA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_CODICEESITO, "E2C37E80-D4B6-42C5-8C9B-5C8AFB4070AB");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_CODICEESITO, "Esito");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_CODICEESITO, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_CODICEESITO, MyGlb.VIS_NORMALFIELDS);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_CODICEESITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_DESCRESITO, "9786D1D4-039E-49B2-9AF2-03BC1BE6DB0A");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_DESCRESITO, "DESCR ESITO");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_DESCRESITO, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_DESCRESITO, MyGlb.VIS_NORMALFIELDS);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_DESCRESITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHESOGGET, "08CB227E-2EED-416D-8697-BF6D30507E95");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHESOGGET, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHESOGGET, MyGlb.VIS_VUOGRAALILEF);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHESOGGET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEDOCUME, "C9E38C1F-D852-420E-A906-540F55602941");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEDOCUME, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEDOCUME, MyGlb.VIS_VUOGRAALILEF);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEDOCUME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICIMPOHEAD, "E46853D6-05CA-4B63-AD64-3FA7E0836106");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICIMPOHEAD, "Importo ");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICIMPOHEAD, MyGlb.VIS_VUOGRAALILEF);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICIMPOHEAD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEIMPORT, "585D958A-332A-4CCD-A7B6-A7D78C05877D");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEIMPORT, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEIMPORT, MyGlb.VIS_VUOGRAALILEF);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEIMPORT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHETSTATO, "A964FE8D-4D7F-4273-B59F-33625976A907");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHETSTATO, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHETSTATO, MyGlb.VIS_VUOGRAALILEF);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHETSTATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, "FDBBBF2F-612F-4D45-916E-C2350B1636E2");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, MyGlb.VIS_IMAGEFIELD);
    PAN_STEPPCC.SetImage(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, 0, "vgialla.gif", false);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_ANNOPROG, "E1B2AF2F-A162-4FF0-83D2-C614B779E770");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_ANNOPROG, "ANNO PROG");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_ANNOPROG, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_ANNOPROG, MyGlb.VIS_NONNULLAFIEL);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_ANNOPROG, 0, -1);
    PAN_STEPPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STEPPCC_NUMEROPROG, "A152AD96-BD6B-4006-8D1A-EAEABBBE3181");
    PAN_STEPPCC.set_Header(MyGlb.OBJ_FIELD, PFL_STEPPCC_NUMEROPROG, "NUMERO PROG");
    PAN_STEPPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STEPPCC_NUMEROPROG, "");
    PAN_STEPPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STEPPCC_NUMEROPROG, MyGlb.VIS_NONNULLAFIEL);
    PAN_STEPPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_STEPPCC_NUMEROPROG, 0, -1);
  }

  private void PAN_STEPPCC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_PROGREREGIST, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_PROGREREGIST, MyGlb.PANEL_LIST, 180);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_PROGREREGIST, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_PROGREREGIST, MyGlb.PANEL_LIST, "PROGRESSIVO REGISTRAZIONE");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_PROGREREGIST, MyGlb.PANEL_FORM, 4, 4, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_PROGREREGIST, MyGlb.PANEL_FORM, 128);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_PROGREREGIST, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_PROGREREGIST, MyGlb.PANEL_FORM, "PROGR. REGISTR.");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_PROGREREGIST, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_PROGREREGIST, PPQRY_PCCSTEP, "B.PROGRESSIVO_REGISTRAZIONE", "PCCSTEPROREG", 5, 12, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_SEQUENZA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_SEQUENZA, MyGlb.PANEL_LIST, 68);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_SEQUENZA, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_SEQUENZA, MyGlb.PANEL_LIST, "SEQ.");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_SEQUENZA, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_SEQUENZA, MyGlb.PANEL_FORM, 128);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_SEQUENZA, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_SEQUENZA, MyGlb.PANEL_FORM, "SEQUENZA");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_SEQUENZA, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_SEQUENZA, PPQRY_PCCSTEP, "B.SEQUENZA", "PCCSTEPSEQUE", 1, 3, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_AZIONE, MyGlb.PANEL_LIST, 0, 92, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_AZIONE, MyGlb.PANEL_LIST, 52);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_AZIONE, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_AZIONE, MyGlb.PANEL_LIST, "Azione");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_AZIONE, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_AZIONE, MyGlb.PANEL_FORM, 128);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_AZIONE, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_AZIONE, MyGlb.PANEL_FORM, "Azione");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_AZIONE, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_AZIONE, PPQRY_PCCSTEP, "B.AZIONE", "PCCSTEPAZION", 5, 4, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_DATAULTIVARI, MyGlb.PANEL_LIST, 68, 92, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_DATAULTIVARI, MyGlb.PANEL_LIST, 160);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_DATAULTIVARI, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_DATAULTIVARI, MyGlb.PANEL_LIST, "Del");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_DATAULTIVARI, MyGlb.PANEL_FORM, 4, 196, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_DATAULTIVARI, MyGlb.PANEL_FORM, 128);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_DATAULTIVARI, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_DATAULTIVARI, MyGlb.PANEL_FORM, "Del");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_DATAULTIVARI, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_DATAULTIVARI, PPQRY_PCCSTEP, "B.DATA_ULTIMA_VARIAZIONE", "PCCSTEDAULVA", 6, 10, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_STATODELDEBI, MyGlb.PANEL_LIST, 172, 92, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_STATODELDEBI, MyGlb.PANEL_LIST, 112);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_STATODELDEBI, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_STATODELDEBI, MyGlb.PANEL_LIST, "Stato del Debito");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_STATODELDEBI, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_STATODELDEBI, MyGlb.PANEL_FORM, 128);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_STATODELDEBI, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_STATODELDEBI, MyGlb.PANEL_FORM, "Stato del Debito");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_STATODELDEBI, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_STATODELDEBI, PPQRY_PCCSTEP, "B.STATO_DEL_DEBITO", "PCCSTESTDEDE", 5, 12, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_IMPORTPARZIA, MyGlb.PANEL_LIST, 300, 92, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_IMPORTPARZIA, MyGlb.PANEL_LIST, 120);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_IMPORTPARZIA, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_IMPORTPARZIA, MyGlb.PANEL_LIST, "Importo");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_IMPORTPARZIA, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_IMPORTPARZIA, MyGlb.PANEL_FORM, 128);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_IMPORTPARZIA, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_IMPORTPARZIA, MyGlb.PANEL_FORM, "Importo");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_IMPORTPARZIA, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_IMPORTPARZIA, PPQRY_PCCSTEP, "B.IMPORTO_PARZIALE", "PCCSTEIMPPAR", 3, 12, 2, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOMEFILE, MyGlb.PANEL_LIST, 456, 92, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOMEFILE, MyGlb.PANEL_LIST, 68);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOMEFILE, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOMEFILE, MyGlb.PANEL_LIST, "Nome File");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOMEFILE, MyGlb.PANEL_FORM, 4, 124, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOMEFILE, MyGlb.PANEL_FORM, 128);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOMEFILE, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOMEFILE, MyGlb.PANEL_FORM, "Nome File");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_NOMEFILE, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_NOMEFILE, PPQRY_PCCSTEP, "B.NOME_FILE", "PCCSTENOMFIL", 5, 40, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_STEPANNULLAT, MyGlb.PANEL_LIST, 832, 92, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_STEPANNULLAT, MyGlb.PANEL_LIST, 104);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_STEPANNULLAT, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_STEPANNULLAT, MyGlb.PANEL_LIST, "Annullato");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_STEPANNULLAT, MyGlb.PANEL_FORM, 4, 148, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_STEPANNULLAT, MyGlb.PANEL_FORM, 128);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_STEPANNULLAT, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_STEPANNULLAT, MyGlb.PANEL_FORM, "Annullato");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_STEPANNULLAT, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_STEPANNULLAT, PPQRY_PCCSTEP, "B.STEP_ANNULLATO", "PCCSTEPANNUL", 5, 2, 0, -13997);
    PAN_STEPPCC.SetValueListItem(PFL_STEPPCC_STEPANNULLAT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_STEPPCC.SetValueListItem(PFL_STEPPCC_STEPANNULLAT, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOTE, MyGlb.PANEL_LIST, -8, 288, 904, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOTE, MyGlb.PANEL_LIST, 36);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOTE, MyGlb.PANEL_LIST, 2);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOTE, MyGlb.PANEL_LIST, "Note");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOTE, MyGlb.PANEL_FORM, 4, 172, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOTE, MyGlb.PANEL_FORM, 128);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_NOTE, MyGlb.PANEL_FORM, "Note");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_NOTE, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_NOTE, PPQRY_PCCSTEP, "B.NOTE", "PCCSTEPNOTE", 5, 200, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENULTIVARI, MyGlb.PANEL_LIST, -8, 336, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENULTIVARI, MyGlb.PANEL_LIST, 152);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENULTIVARI, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENULTIVARI, MyGlb.PANEL_LIST, "Utente Ultima Variazione");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENULTIVARI, MyGlb.PANEL_FORM, 4, 220, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENULTIVARI, MyGlb.PANEL_FORM, 128);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENULTIVARI, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENULTIVARI, MyGlb.PANEL_FORM, "Uten. Ult. Variazione");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_UTENULTIVARI, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_UTENULTIVARI, PPQRY_PCCSTEP, "B.UTENTE_ULTIMA_VARIAZIONE", "PCCSTEUTULVA", 5, 8, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENTINOMINA, MyGlb.PANEL_LIST, 224, 336, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENTINOMINA, MyGlb.PANEL_LIST, 124);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENTINOMINA, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENTINOMINA, MyGlb.PANEL_LIST, "UTENTI NOMINATIVO");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENTINOMINA, MyGlb.PANEL_FORM, 132, 244, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENTINOMINA, MyGlb.PANEL_FORM, 124);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENTINOMINA, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_UTENTINOMINA, MyGlb.PANEL_FORM, "UTENTI NOMINATIVO");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_UTENTINOMINA, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_UTENTINOMINA, PPQRY_UTENTI, "A.NOMINATIVO", "UTENTINOMINA", 5, 40, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_CODICEESITO, MyGlb.PANEL_LIST, -4, 364, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_CODICEESITO, MyGlb.PANEL_LIST, 36);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_CODICEESITO, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_CODICEESITO, MyGlb.PANEL_LIST, "Esito");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_CODICEESITO, MyGlb.PANEL_FORM, 4, 268, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_CODICEESITO, MyGlb.PANEL_FORM, 88);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_CODICEESITO, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_CODICEESITO, MyGlb.PANEL_FORM, "Esito");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_CODICEESITO, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_CODICEESITO, PPQRY_PCCSTEP, "B.CODICE_ESITO", "PCCSTECODESI", 5, 10, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_DESCRESITO, MyGlb.PANEL_LIST, 128, 364, 768, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_DESCRESITO, MyGlb.PANEL_LIST, 80);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_DESCRESITO, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_DESCRESITO, MyGlb.PANEL_LIST, "DESCR ESITO");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_DESCRESITO, MyGlb.PANEL_FORM, 88, 292, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_DESCRESITO, MyGlb.PANEL_FORM, 80);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_DESCRESITO, MyGlb.PANEL_FORM, 2);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_DESCRESITO, MyGlb.PANEL_FORM, "DESCR ESITO");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_DESCRESITO, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_DESCRESITO, PPQRY_PCCSTEP, "B.DESCR_ESITO", "PCCSTEDESESI", 5, 200, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHESOGGET, MyGlb.PANEL_LIST, 0, 4, 832, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHESOGGET, MyGlb.PANEL_LIST, 0);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHESOGGET, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHESOGGET, MyGlb.PANEL_FORM, 0, 8, 704, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHESOGGET, MyGlb.PANEL_FORM, 0);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHESOGGET, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_ETICHESOGGET, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_ETICHESOGGET, -1, "", "ETICHESOGGET", 0, 0, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEDOCUME, MyGlb.PANEL_LIST, 0, 28, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEDOCUME, MyGlb.PANEL_LIST, 0);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEDOCUME, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEDOCUME, MyGlb.PANEL_FORM, 8, 16, 704, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEDOCUME, MyGlb.PANEL_FORM, 0);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEDOCUME, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_ETICHEDOCUME, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_ETICHEDOCUME, -1, "", "ETICHEDOCUME", 0, 0, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICIMPOHEAD, MyGlb.PANEL_LIST, 332, 28, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICIMPOHEAD, MyGlb.PANEL_LIST, 0);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICIMPOHEAD, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICIMPOHEAD, MyGlb.PANEL_FORM, 16, 24, 704, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICIMPOHEAD, MyGlb.PANEL_FORM, 0);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICIMPOHEAD, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_ETICIMPOHEAD, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_ETICIMPOHEAD, -1, "", "ETICIMPOHEAD", 0, 0, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEIMPORT, MyGlb.PANEL_LIST, 396, 28, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEIMPORT, MyGlb.PANEL_LIST, 0);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEIMPORT, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEIMPORT, MyGlb.PANEL_FORM, 24, 32, 704, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEIMPORT, MyGlb.PANEL_FORM, 0);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHEIMPORT, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_ETICHEIMPORT, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_ETICHEIMPORT, -1, "", "ETICHEIMPORT", 0, 0, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHETSTATO, MyGlb.PANEL_LIST, 588, 28, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHETSTATO, MyGlb.PANEL_LIST, 0);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHETSTATO, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHETSTATO, MyGlb.PANEL_FORM, 16, 24, 704, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHETSTATO, MyGlb.PANEL_FORM, 0);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETICHETSTATO, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_ETICHETSTATO, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_ETICHETSTATO, -1, "", "ETICHETSTATO", 0, 0, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, MyGlb.PANEL_LIST, 568, 28, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, MyGlb.PANEL_LIST, 0);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, MyGlb.PANEL_FORM, 568, 36, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, MyGlb.PANEL_FORM, 0);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_ETIICOSTALIQ, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_ETIICOSTALIQ, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_ETIICOSTALIQ, -1, "", "ETIICOSTALIQ", 0, 0, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_ANNOPROG, MyGlb.PANEL_LIST, 896, 92, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_ANNOPROG, MyGlb.PANEL_LIST, 72);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_ANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_ANNOPROG, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_ANNOPROG, MyGlb.PANEL_FORM, 4, 328, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_ANNOPROG, MyGlb.PANEL_FORM, 72);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_ANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_ANNOPROG, MyGlb.PANEL_FORM, "ANNO PROG");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_ANNOPROG, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_ANNOPROG, PPQRY_PCCSTEP, "A.ANNO_PROG", "PCSTPCDOANPR", 1, 4, 0, -13997);
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_NUMEROPROG, MyGlb.PANEL_LIST, 896, 92, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_NUMEROPROG, MyGlb.PANEL_LIST, 92);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_NUMEROPROG, MyGlb.PANEL_LIST, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_NUMEROPROG, MyGlb.PANEL_LIST, "NUMERO PROG");
    PAN_STEPPCC.SetRect(MyGlb.OBJ_FIELD, PFL_STEPPCC_NUMEROPROG, MyGlb.PANEL_FORM, 4, 352, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STEPPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STEPPCC_NUMEROPROG, MyGlb.PANEL_FORM, 92);
    PAN_STEPPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STEPPCC_NUMEROPROG, MyGlb.PANEL_FORM, 1);
    PAN_STEPPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STEPPCC_NUMEROPROG, MyGlb.PANEL_FORM, "NUMERO PROG");
    PAN_STEPPCC.SetFieldPage(PFL_STEPPCC_NUMEROPROG, -1, -1);
    PAN_STEPPCC.SetFieldPanel(PFL_STEPPCC_NUMEROPROG, PPQRY_PCCSTEP, "A.NUMERO_PROG", "PCSTPCDONUPR", 1, 5, 0, -13997);
  }

  private void PAN_STEPPCC_InitQueries()
  {
    StringBuffer SQL;

    PAN_STEPPCC.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NOMINATIVO as UTENTINOMINA ");
    SQL.append("from ");
    SQL.append("  AD4_UTENTI A ");
    SQL.append("where (A.UTENTE = ~~PCCSTEUTULVA~~) ");
    PAN_STEPPCC.SetQuery(PPQRY_UTENTI, 0, SQL, -1, "");
    PAN_STEPPCC.SetQueryDB(PPQRY_UTENTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STEPPCC.SetMasterTable(PPQRY_UTENTI, "AD4_UTENTI");
    PAN_STEPPCC.SetIMDB(IMDB, "PQRY_PCCSTEP", true);
    PAN_STEPPCC.set_SetString(MyGlb.MASTER_ROWNAME, "PCC STEP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.PROGRESSIVO_REGISTRAZIONE as PCCSTEPROREG, ");
    SQL.append("  B.SEQUENZA as PCCSTEPSEQUE, ");
    SQL.append("  B.AZIONE as PCCSTEPAZION, ");
    SQL.append("  B.STATO_DEL_DEBITO as PCCSTESTDEDE, ");
    SQL.append("  B.IMPORTO_PARZIALE as PCCSTEIMPPAR, ");
    SQL.append("  B.NOME_FILE as PCCSTENOMFIL, ");
    SQL.append("  B.STEP_ANNULLATO as PCCSTEPANNUL, ");
    SQL.append("  B.NOTE as PCCSTEPNOTE, ");
    SQL.append("  B.DATA_ULTIMA_VARIAZIONE as PCCSTEDAULVA, ");
    SQL.append("  B.UTENTE_ULTIMA_VARIAZIONE as PCCSTEUTULVA, ");
    SQL.append("  B.CODICE_ESITO as PCCSTECODESI, ");
    SQL.append("  B.DESCR_ESITO as PCCSTEDESESI, ");
    SQL.append("  A.ANNO_PROG as PCSTPCDOANPR, ");
    SQL.append("  A.NUMERO_PROG as PCSTPCDONUPR ");
    PAN_STEPPCC.SetQuery(PPQRY_PCCSTEP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PCC_DOCUMENTI A, ");
    SQL.append("  PCC_STEP B ");
    PAN_STEPPCC.SetQuery(PPQRY_PCCSTEP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.PROGRESSIVO_REGISTRAZIONE = A.PROGRESSIVO_REGISTRAZIONE) ");
    SQL.append("and   (A.PROCESSO_CONCLUSO <> 'AN') ");
    SQL.append("and   (A.ANNO_PROG = ~~TBL_PARAMETRI631.PARAANNOPROG~~) ");
    SQL.append("and   (A.NUMERO_PROG = ~~TBL_PARAMETRI631.PARANUMEPROG~~) ");
    PAN_STEPPCC.SetQuery(PPQRY_PCCSTEP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STEPPCC.SetQuery(PPQRY_PCCSTEP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STEPPCC.SetQuery(PPQRY_PCCSTEP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.SEQUENZA desc ");
    PAN_STEPPCC.SetQuery(PPQRY_PCCSTEP, 5, SQL, -1, "");
    PAN_STEPPCC.SetQueryDB(PPQRY_PCCSTEP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STEPPCC.SetMasterTable(0, "PCC_DOCUMENTI");
    PAN_STEPPCC.AddToSortList(PFL_STEPPCC_SEQUENZA, false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STEPPCC.Status() == 2)
    {
      int oldListQBE = PAN_STEPPCC.iUseListQBE;
      PAN_STEPPCC.iUseListQBE = 0;
      PAN_STEPPCC.PanelCommand(Glb.PCM_SEARCH);
      PAN_STEPPCC.PanelCommand(Glb.PCM_FIND);
      PAN_STEPPCC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_STEPPCC) PAN_STEPPCC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STEPPCC) PAN_STEPPCC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STEPPCC) PAN_STEPPCC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_STEPPCC) PAN_STEPPCC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_STEPPCC) PAN_STEPPCC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
