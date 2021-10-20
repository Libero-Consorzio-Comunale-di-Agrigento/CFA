// **********************************************
// Caricamento Incassi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CaricamentoIncassi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_PROGRESSIVO = 0;
  private static int PFL_PARAM_ELABORA = 1;
  private static int PFL_PARAM_FILE = 2;
  private static int PFL_PARAM_DATAFLUSSO = 3;
  private static int PFL_PARAM_NUMEROINCASS = 4;
  private static int PFL_PARAM_DATAINCASSO = 5;
  private static int PFL_PARAM_GESTIOINCASS = 6;

  private static int PPQRY_WORKEXPORTI6 = 0;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM56(IMDB);
    //
    //
    Init_PQRY_WORKEXPORTI6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM56(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM56, 9);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM56, "TBL_PARAM56");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMTIPBOL, "ROWNAMTIPBOL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMTIPBOL,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMEPERCO, "ROWNAMEPERCO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMEPERCO,9,266,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMEBLOBI, "ROWNAMEBLOBI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMEBLOBI,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMEPROGR,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMGESINS, "ROWNAMGESINS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMGESINS,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMDATFLU, "ROWNAMDATFLU");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMDATFLU,6,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMDATINC, "ROWNAMDATINC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMDATINC,6,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMNUMINC, "ROWNAMNUMINC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM56,IMDBDef2.FLD_PARAM56_ROWNAMNUMINC,1,10,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM56, 0);
  }

  private static void Init_PQRY_WORKEXPORTI6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_WORKEXPORTI6, 8);
    IMDB.set_TblCode(IMDBDef9.PQRY_WORKEXPORTI6, "PQRY_WORKEXPORTI6");
    IMDB.set_FldCode(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_FASE, "FASE");
    IMDB.SetFldParams(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_FASE,5,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_FILE_DATI, "FILE_DATI");
    IMDB.SetFldParams(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_FILE_DATI,10,9999,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_DATAFLUSSO, "DATAFLUSSO");
    IMDB.SetFldParams(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_DATAFLUSSO,6,0,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_NUMEROINCASS, "NUMEROINCASS");
    IMDB.SetFldParams(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_NUMEROINCASS,1,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_DATAINCASSO, "DATAINCASSO");
    IMDB.SetFldParams(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_DATAINCASSO,6,0,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_GESTIOINCASS, "GESTIOINCASS");
    IMDB.SetFldParams(IMDBDef9.PQRY_WORKEXPORTI6,IMDBDef9.PQSL_WORKEXPORTI6_GESTIOINCASS,5,8,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_WORKEXPORTI6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CaricamentoIncassi(MyWebEntryPoint w, IMDBObj imdb)
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
  public CaricamentoIncassi()
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
    FormIdx = MyGlb.FRM_CARICAINCASS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BDBA89BB-F245-4970-88F2-00A7752C5739";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 568;
    DesignHeight = 218;
    set_Caption(new IDVariant("Caricamento Incassi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 568;
    Frames[1].Height = 192;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 192;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 568-MyGlb.PAN_OFFS_X, 192-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AB9CB796-8A41-4D36-8E19-2BA68F227BE2");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 724, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      PAN_PARAM.UpdatePanel(MainFrm);
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
    return (obj instanceof CaricamentoIncassi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CaricamentoIncassi.class.getName() : (Glb.ClassWithPackage(CaricamentoIncassi.class) ? CaricamentoIncassi.class.getName().substring(CaricamentoIncassi.class.getPackage().getName().length() + 1) : CaricamentoIncassi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param After BLOB Update Event
  // Evento notificato dal pannello dopo aver salvato su
  // db il file caricato dall'utente o cancellato il contenuto
  // del blob.
  // Column: Numero intero che indica quale campo del pannello è coinvolto nell'operazione di aggiornamento o cancellazione. Deve essere confrontato con la funzione Me dei campi del pannello. - Input
  // Size: Dimensione del file caricato in byte oppure -1 se il contenuto del blob è stato cancellato. - Input
  // Extension: Stringa che contiene l'estensione del file in fase di caricamento. - Input
  // **********************************************************************
  private void PAN_PARAM_AfterBlobUpdate (IDVariant Column, IDVariant Size, IDVariant Extension)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PERCORSO = new IDVariant(0,IDVariant.STRING);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Param After BLOB Update Event Body
      // Procedure Body
      // 
      C2 = PAN_PARAM.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_PARAM.GotoFirst();
      while (!PAN_PARAM.RSEOF())
      {
        if (IMDB.Value(IMDBDef9.PQRY_WORKEXPORTI6, IMDBDef9.PQSL_WORKEXPORTI6_PROGRESSIVO, 0).equals(C2.Get("PROGRESSIVO"), true))
        {
          v_PERCORSO = Glb.SaveBlob(MainFrm,C2.Get("FILE_DATI"),(new IDVariant(MainFrm.RealPath)),IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("temp")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant("_"))), IDL.ToString(MainFrm.PROGRESESSIO)), (new IDVariant("_"))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMEPROGR, 0))));
          IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMEPERCO, 0, new IDVariant(v_PERCORSO));
        }
        PAN_PARAM.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (Size.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMEBLOBI, 0, (new IDVariant("SI")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoIncassi", "ParamAfterBLOBUpdateEvent", _e);
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
    IDVariant v_UTENZA = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_UTENZA = (new IDVariant("Utenza: ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      // 
      // Codice
      // Feature 8509: Gestione Insoluti (sb)
      // 
      {
        IDVariant v_SCHIAVE = null;
        v_SCHIAVE = (new IDVariant("PRODUCTS/CFA"));
        IDVariant v_SSTRINGA = null;
        v_SSTRINGA = (new IDVariant("recupero_automatico_da_fatturazione"));
        IDVariant v_STITOLO = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(LOWER(A.VALORE), 'incassi') as NUVALOREVAFI ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (LOWER(A.STRINGA) = LOWER(" + IDL.CSql(v_SSTRINGA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        SQL.append("and   (A.CHIAVE = " + IDL.CSql(v_SCHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMGESINS, 0, QV.Get("NUVALOREVAFI", IDVariant.STRING));
        }
        QV.Close();
        // 
        // Feat:8509
        // 
        if (IMDB.Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMGESINS, 0).equals((new IDVariant("incassi")), true))
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          v_STITOLO = (new IDVariant("Caricamento Incassi"));
        }
        else
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMTIPBOL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMTIPREG, 0)))
          {
            MainFrm.set_AlertMessage((new IDVariant("Deve essere indicato il Registro/Bollato in Elenco Incassi"))); 
            MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
          }
          else
          {
            PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            // 
            // Setto di Default il caricamento normale
            // 
            IMDB.set_Value(IMDBDef9.PQRY_WORKEXPORTI6, IMDBDef9.PQSL_WORKEXPORTI6_GESTIOINCASS, 0, (new IDVariant("insoluti")));
            v_STITOLO = IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Caricamento Incassi ed Insoluti (Registro ")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMTIPREG, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMTIPBOL, 0))), (new IDVariant(")")));
          }
        }
        set_Caption(new IDVariant(v_STITOLO));
      }
      IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMEPROGR, 0, Predisposizione());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoIncassi", "LoadEvent", _e);
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
      UNLOADEVENT_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoIncassi", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMTIPREG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMTIPBOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMEPERCO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMEBLOBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMEPROGR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMGESINS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMDATFLU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMDATINC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMNUMINC, 0, new IDVariant());
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
      ENDMODALEVEN_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoIncassi", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void ENDMODALEVEN_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMTIPREG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMTIPBOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMEPERCO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMEBLOBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMEPROGR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMGESINS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMDATFLU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMDATINC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMNUMINC, 0, new IDVariant());
  }

  // **********************************************************************
  // Cmd Esegui
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CmdEsegui ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cmd Esegui Body
      // Procedure Body
      // 
      // 
      // Codice
      // Feature 8509: Gestione Insoluti (sb) File obbligatorio
      // solo per caricamento incassi normale.
      // 
      {
        if (IMDB.Value(IMDBDef9.PQRY_WORKEXPORTI6, IMDBDef9.PQSL_WORKEXPORTI6_GESTIOINCASS, 0).equals((new IDVariant("insoluti")), true))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_WORKEXPORTI6, IMDBDef9.PQSL_WORKEXPORTI6_DATAFLUSSO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_WORKEXPORTI6, IMDBDef9.PQSL_WORKEXPORTI6_NUMEROINCASS, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_WORKEXPORTI6, IMDBDef9.PQSL_WORKEXPORTI6_DATAINCASSO, 0)))
          {
            IDVariant v_SMS2 = null;
            v_SMS2 = (new IDVariant("Indicare correttamente Data Flusso, Numero e Data Incasso"));
            MainFrm.set_AlertMessage(v_SMS2); 
            return 0;
          }
        }
        else
        {
          if (IMDB.Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMEBLOBI, 0).compareTo((new IDVariant("SI")), true)!=0)
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Manca indicazione del file da caricare", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            return 0;
          }
        }
      }
      LeggiRigheDelFile();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoIncassi", "CmdEsegui", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cmd Annulla
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CmdAnnulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cmd Annulla Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoIncassi", "CmdAnnulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Non Bloccante
  // Explain which processing is carried out by this procedure
  // sms:  - Input
  // **********************************************************************
  public boolean ControlloNonBloccante (IDVariant sms)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RET = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controllo Non Bloccante Body
      // Procedure Body
      // 
      v_RET = (new IDVariant(-1));
      if (!(MainFrm.MessageConfirm(sms)))
      {
        v_RET = (new IDVariant(0));
        return v_RET.booleanValue();
      }
      return v_RET.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoIncassi", "ControlloNonBloccante", _e);
      return false;
    }
  }

  // **********************************************************************
  // Leggi Righe Del File
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int LeggiRigheDelFile ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_FD = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONTROLLOFIL = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Leggi Righe Del File Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMEBLOBI, 0).equals((new IDVariant("SI")), true))
      {
        v_CONTROLLOFIL = (new IDVariant(-1));
        v_FD = MainFrm.VBFile.FreeFile();
        MainFrm.VBFile.OpenForInput(IMDB.Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMEPERCO, 0), v_FD); 
        MainFrm.Cf4armDBObject.BeginTrans();
        while (!(MainFrm.VBFile.EOF(v_FD)))
        {
          IDVariant v_CURRLINE = new IDVariant(0,IDVariant.STRING);
          IDVariant v_CURRNUMBERCH = new IDVariant(0,IDVariant.INTEGER);
          v_CURRLINE = MainFrm.VBFile.ReadLine(v_FD); 
          v_CURRNUMBERCH = IDL.Length(v_CURRLINE);
          // 
          // controllo se il file è vuoto ed eventualmente lo gestisco
          // 
          {
            if (v_CONTROLLOFIL.booleanValue())
            {
              v_CONTROLLOFIL = (new IDVariant(0));
              if (v_CURRNUMBERCH.equals((new IDVariant(0)), true))
              {
                IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
                v_MSG = (new IDVariant("Il file è vuoto!", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_MSG); 
                return 0;
              }
            }
          }
          if (v_CURRNUMBERCH.compareTo((new IDVariant(0)), true)>0)
          {
            try
            {
              SQL = new StringBuffer();
              SQL.append("insert into WORK_EXPORT_TESO ");
              SQL.append("( ");
              SQL.append("  SESSIONE, ");
              SQL.append("  PROGRESSIVO, ");
              SQL.append("  DATI, ");
              SQL.append("  FASE ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ), ");
              SQL.append("  to_number(NULL), ");
              SQL.append("  " + IDL.CSql(v_CURRLINE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  'INC_FS4' ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e10)
            {
              MainFrm.set_AlertMessage(new IDVariant(e10.getMessage())); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              return 0;
            }
          }
        }
        MainFrm.VBFile.Close(v_FD); 
      }
      IDVariant v_NINCASSI = null;
      v_NINCASSI = (new IDVariant());
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      // 
      // Feat: 8509
      // 
      if (IMDB.Value(IMDBDef9.PQRY_WORKEXPORTI6, IMDBDef9.PQSL_WORKEXPORTI6_GESTIOINCASS, 0).equals((new IDVariant("insoluti")), true))
      {
        MainFrm.Cf4armDBObject.CARICAINCASSIINSOLUTIFS4(IDL.ToString(MainFrm.PROGRESESSIO), v_NINCASSI, IMDB.Value(IMDBDef9.PQRY_WORKEXPORTI6, IMDBDef9.PQSL_WORKEXPORTI6_DATAFLUSSO, 0), IMDB.Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMTIPREG, 0), IMDB.Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMTIPBOL, 0), IMDB.Value(IMDBDef9.PQRY_WORKEXPORTI6, IMDBDef9.PQSL_WORKEXPORTI6_DATAINCASSO, 0), IMDB.Value(IMDBDef9.PQRY_WORKEXPORTI6, IMDBDef9.PQSL_WORKEXPORTI6_NUMEROINCASS, 0));
      }
      else
      {
        MainFrm.Cf4armDBObject.CARICAINCASSIFS4(IDL.ToString(MainFrm.PROGRESESSIO), v_NINCASSI);
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return 0;
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      // 
      // elaborazione terminata
      // 
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Elaborazione Terminata - Caricati ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_SMS, IDL.ToString(v_NINCASSI)), (new IDVariant(" incassi.")))); 
      }
      IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  WRK_ERRORI A ");
      SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTA.compareTo((new IDVariant(0)), true)!=0)
      {
        MainFrm.LanciaErrorReport((new IDVariant("Stampa Anomalie Incassi")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoIncassi", "LeggiRigheDelFile", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Predisposizione
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant Predisposizione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DARESTITUIRE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_IFASE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ISESSIONE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Predisposizione Body
      // Procedure Body
      // 
      // 
      // Feature 8509: Modificato uso i_fase (sb)
      // 
      v_ISESSIONE = new IDVariant(new IDVariant(MainFrm.PROGRESESSIO),IDVariant.INTEGER);
      v_IFASE = (new IDVariant("INC_FS4"));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.PROGRESSIVO + 1) as MAWOEXIDPRUN ");
      SQL.append("from ");
      SQL.append("  WORK_EXPORT_ID A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DARESTITUIRE = QV.Get("MAWOEXIDPRUN", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("insert into WORK_EXPORT_ID ");
      SQL.append("( ");
      SQL.append("  PROGRESSIVO, ");
      SQL.append("  FASE, ");
      SQL.append("  SESSIONE ");
      SQL.append(") ");
      SQL.append("values ");
      SQL.append("( ");
      SQL.append("  " + IDL.CSql(v_DARESTITUIRE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  " + IDL.CSql(v_IFASE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  " + IDL.CSql(v_ISESSIONE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
      SQL.append(") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return v_DARESTITUIRE;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoIncassi", "Predisposizione", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Param Gestione Incassi Activated
  // Evento notificato al campo quando esso viene attivato
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARAM_GESTIOINCASS_CellActivated(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Gestione Incassi Activated Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef2.TBL_PARAM56, IMDBDef2.FLD_PARAM56_ROWNAMGESINS, 0).equals((new IDVariant("incassi")), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoIncassi", "ParamGestioneIncassiActivated", _e);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CmdEsegui();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_GESTIOINCASS)
    {
      PFL_PARAM_GESTIOINCASS_CellActivated(Cancel);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_WORKEXPORTI6, IMDBDef9.PQSL_WORKEXPORTI6_FILE_DATI, 0)))
      {
        IMDB.set_Value(IMDBDef9.PQRY_WORKEXPORTI6, IMDBDef9.PQSL_WORKEXPORTI6_FILE_DATI, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSIVO, "356694EB-1391-4EDB-889B-EF79E1E279B4");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSIVO, "PROGRESSIVO");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSIVO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "A6DC790F-9CEC-4859-835D-CE5B41D5AB75");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_FILE, "8155F267-F9AB-492C-AE22-D1CFF894BB40");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_FILE, "File");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_FILE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_FILE, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_FILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, "D8EE5CCE-7654-4B34-85A5-40DBA59B842F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, "Data Flusso");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, "3116C513-B6B6-406D-8A5C-E6137E275B75");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, "Numero Inc.");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, "6174141A-2072-4E44-9B32-A4C634C82F22");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, "Data Inc.");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, "E65EA063-39DF-49EF-80EA-29A46A45212B");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, "Generazione Da:");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, MyGlb.VIS_OPTBUTSEBOGR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 84, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PROGRESSIVO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PROGRESSIVO, PPQRY_WORKEXPORTI6, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 280, 484, 100, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 460, 136, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ELABORA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FILE, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FILE, MyGlb.PANEL_LIST, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FILE, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FILE, MyGlb.PANEL_LIST, "File");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FILE, MyGlb.PANEL_FORM, 40, 28, 500, 84, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FILE, MyGlb.PANEL_FORM, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FILE, MyGlb.PANEL_FORM, 6);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FILE, MyGlb.PANEL_FORM, "File");
    PAN_PARAM.SetFieldPage(PFL_PARAM_FILE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_FILE, PPQRY_WORKEXPORTI6, "A.FILE_DATI", "FILE_DATI", 10, 9999, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, MyGlb.PANEL_LIST, 76);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, MyGlb.PANEL_LIST, "Data Flusso");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, MyGlb.PANEL_FORM, 28, 120, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, MyGlb.PANEL_FORM, 76);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATAFLUSSO, MyGlb.PANEL_FORM, "Data Flusso");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DATAFLUSSO, -1, -1);
    PAN_PARAM.SetFieldUnbound(PFL_PARAM_DATAFLUSSO, true);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DATAFLUSSO, PPQRY_WORKEXPORTI6, "~~TBL_PARAM56.ROWNAMDATFLU~~", "DATAFLUSSO", 6, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, MyGlb.PANEL_LIST, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, MyGlb.PANEL_LIST, "Numero Inc.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, MyGlb.PANEL_FORM, 28, 148, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, MyGlb.PANEL_FORM, 76);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROINCASS, MyGlb.PANEL_FORM, "Numero Inc.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMEROINCASS, -1, -1);
    PAN_PARAM.SetFieldUnbound(PFL_PARAM_NUMEROINCASS, true);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMEROINCASS, PPQRY_WORKEXPORTI6, "~~TBL_PARAM56.ROWNAMNUMINC~~", "NUMEROINCASS", 1, 19, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, MyGlb.PANEL_LIST, "Data Inc.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, MyGlb.PANEL_FORM, 196, 148, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, MyGlb.PANEL_FORM, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATAINCASSO, MyGlb.PANEL_FORM, "Data Inc.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DATAINCASSO, -1, -1);
    PAN_PARAM.SetFieldUnbound(PFL_PARAM_DATAINCASSO, true);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DATAINCASSO, PPQRY_WORKEXPORTI6, "~~TBL_PARAM56.ROWNAMDATINC~~", "DATAINCASSO", 6, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, MyGlb.PANEL_LIST, 104);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, MyGlb.PANEL_LIST, "Generazione Da:");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, MyGlb.PANEL_FORM, 4, 4, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, MyGlb.PANEL_FORM, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_GESTIOINCASS, MyGlb.PANEL_FORM, "Generazione Da:");
    PAN_PARAM.SetFieldPage(PFL_PARAM_GESTIOINCASS, -1, -1);
    PAN_PARAM.SetFieldUnbound(PFL_PARAM_GESTIOINCASS, true);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_GESTIOINCASS, PPQRY_WORKEXPORTI6, "~~TBL_PARAM56.ROWNAMGESINS~~", "GESTIOINCASS", 5, 8, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_GESTIOINCASS, (new IDVariant("incassi")), "File Incassi", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_GESTIOINCASS, (new IDVariant("insoluti")), "File Insoluti (SDD)", "", "", -1);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_WORKEXPORTI6", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "WORK EXPORT ID");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.FASE as FASE, ");
    SQL.append("  A.FILE_DATI as FILE_DATI, ");
    SQL.append("  ~~TBL_PARAM56.ROWNAMDATFLU~~ as DATAFLUSSO, ");
    SQL.append("  ~~TBL_PARAM56.ROWNAMNUMINC~~ as NUMEROINCASS, ");
    SQL.append("  ~~TBL_PARAM56.ROWNAMDATINC~~ as DATAINCASSO, ");
    SQL.append("  ~~TBL_PARAM56.ROWNAMGESINS~~ as GESTIOINCASS ");
    PAN_PARAM.SetQuery(PPQRY_WORKEXPORTI6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WORK_EXPORT_ID A ");
    PAN_PARAM.SetQuery(PPQRY_WORKEXPORTI6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO = ~~TBL_PARAM56.ROWNAMEPROGR~~) ");
    PAN_PARAM.SetQuery(PPQRY_WORKEXPORTI6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAM.SetQuery(PPQRY_WORKEXPORTI6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAM.SetQuery(PPQRY_WORKEXPORTI6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAM.SetQuery(PPQRY_WORKEXPORTI6, 5, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_WORKEXPORTI6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(0, "WORK_EXPORT_ID");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_AfterBlobUpdate(Column, Size, Extension);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
