// **********************************************
// Caricamento File
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CaricamentoFile extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_WORKEXPORTID_PROGRESSIVO = 0;
  private static int PFL_WORKEXPORTID_ELABORA = 1;
  private static int PFL_WORKEXPORTID_FILE = 2;
  private static int PFL_WORKEXPORTID_SESSIONE = 3;
  private static int PFL_WORKEXPORTID_ETICHETTESTO = 4;

  private static int PPQRY_WORKEXPORTI5 = 0;


  IDPanel PAN_WORKEXPORTID;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM172(IMDB);
    //
    //
    Init_PQRY_WORKEXPORTI5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM172(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM172, 5);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM172, "TBL_PARAM172");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM172,IMDBDef2.FLD_PARAM172_ROWNAMEUTENZ, "ROWNAMEUTENZ");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM172,IMDBDef2.FLD_PARAM172_ROWNAMEUTENZ,5,150,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM172,IMDBDef2.FLD_PARAM172_ROWNAMCODUTE, "ROWNAMCODUTE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM172,IMDBDef2.FLD_PARAM172_ROWNAMCODUTE,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM172,IMDBDef2.FLD_PARAM172_ROWNAMEPERCO, "ROWNAMEPERCO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM172,IMDBDef2.FLD_PARAM172_ROWNAMEPERCO,9,266,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM172,IMDBDef2.FLD_PARAM172_ROWNAMEBLOBI, "ROWNAMEBLOBI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM172,IMDBDef2.FLD_PARAM172_ROWNAMEBLOBI,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM172,IMDBDef2.FLD_PARAM172_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM172,IMDBDef2.FLD_PARAM172_ROWNAMEPROGR,1,10,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM172, 0);
  }

  private static void Init_PQRY_WORKEXPORTI5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_WORKEXPORTI5, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_WORKEXPORTI5, "PQRY_WORKEXPORTI5");
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI5,IMDBDef10.PQSL_WORKEXPORTI5_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI5,IMDBDef10.PQSL_WORKEXPORTI5_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI5,IMDBDef10.PQSL_WORKEXPORTI5_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI5,IMDBDef10.PQSL_WORKEXPORTI5_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI5,IMDBDef10.PQSL_WORKEXPORTI5_FASE, "FASE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI5,IMDBDef10.PQSL_WORKEXPORTI5_FASE,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI5,IMDBDef10.PQSL_WORKEXPORTI5_FILE_DATI, "FILE_DATI");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI5,IMDBDef10.PQSL_WORKEXPORTI5_FILE_DATI,10,9999,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_WORKEXPORTI5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CaricamentoFile(MyWebEntryPoint w, IMDBObj imdb)
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
  public CaricamentoFile()
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
    FormIdx = MyGlb.FRM_CARICAMEFILE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3B994E76-3596-4F10-994C-397351C2220E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 568;
    DesignHeight = 218;
    set_Caption(new IDVariant("Caricamento File"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 568;
    Frames[1].Height = 192;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "WORK EXPORT ID";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 192;
    PAN_WORKEXPORTID = new IDPanel(w, this, 1, "PAN_WORKEXPORTID");
    Frames[1].Content = PAN_WORKEXPORTID;
    PAN_WORKEXPORTID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_WORKEXPORTID.VS = MainFrm.VisualStyleList;
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 568-MyGlb.PAN_OFFS_X, 192-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C60FF84E-AF68-4E59-AF3D-3929405BF247");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 432, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_WORKEXPORTID.InitStatus = 2;
    PAN_WORKEXPORTID_Init();
    PAN_WORKEXPORTID_InitFields();
    PAN_WORKEXPORTID_InitQueries();
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
      PAN_WORKEXPORTID.UpdatePanel(MainFrm);
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
    return (obj instanceof CaricamentoFile);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CaricamentoFile.class.getName() : (Glb.ClassWithPackage(CaricamentoFile.class) ? CaricamentoFile.class.getName().substring(CaricamentoFile.class.getPackage().getName().length() + 1) : CaricamentoFile.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // WORK EXPORT ID After BLOB Update
  // Evento notificato dal pannello dopo aver salvato su
  // db il file caricato dall'utente o cancellato il contenuto
  // del blob.
  // Column - Input
  // Size - Input
  // Extension - Input
  // **********************************************************************
  private void PAN_WORKEXPORTID_AfterBlobUpdate (IDVariant Column, IDVariant Size, IDVariant Extension)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // WORK EXPORT ID After BLOB Update Body
      // Corpo Procedura
      // 
      // 
      // 
      // 
      // 
      if (Size.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM172, IMDBDef2.FLD_PARAM172_ROWNAMEBLOBI, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM172, IMDBDef2.FLD_PARAM172_ROWNAMEBLOBI, 0, (new IDVariant("NO")));
      }
      if (Extension.compareTo((new IDVariant("xml")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant("Il file deve essere in formato xml"))); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFile", "WORKEXPORTIDAfterBLOBUpdate", _e);
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
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      IMDB.set_Value(IMDBDef2.TBL_PARAM172, IMDBDef2.FLD_PARAM172_ROWNAMEPROGR, 0, PredisposizioneWORDEXPORTID1());
      PAN_WORKEXPORTID.SetFieldActive(PFL_WORKEXPORTID_FILE,true);
      PAN_WORKEXPORTID.SetFieldBlobExtensions(PFL_WORKEXPORTID_FILE, (new IDVariant("*.xml")).stringValue(), (new IDVariant("File xml")).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFile", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAM172, IMDBDef2.FLD_PARAM172_ROWNAMEUTENZ, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM172, IMDBDef2.FLD_PARAM172_ROWNAMEPERCO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM172, IMDBDef2.FLD_PARAM172_ROWNAMEBLOBI, 0, (new IDVariant()));
      SQL = new StringBuffer();
      SQL.append("delete from WORK_EXPORT_ID ");
      SQL.append("where (SESSIONE = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_WORKEXPORTI5, IMDBDef10.PQSL_WORKEXPORTI5_SESSIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFile", "UnloadEvent", _e);
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
      ENDMODALEVEN_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFile", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void ENDMODALEVEN_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAM172, IMDBDef2.FLD_PARAM172_ROWNAMEUTENZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM172, IMDBDef2.FLD_PARAM172_ROWNAMCODUTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM172, IMDBDef2.FLD_PARAM172_ROWNAMEPERCO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM172, IMDBDef2.FLD_PARAM172_ROWNAMEBLOBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM172, IMDBDef2.FLD_PARAM172_ROWNAMEPROGR, 0, new IDVariant());
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
      if (IMDB.Value(IMDBDef2.TBL_PARAM172, IMDBDef2.FLD_PARAM172_ROWNAMEBLOBI, 0).compareTo((new IDVariant("SI")), true)!=0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Manca indicazione del file da caricare", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      IDVariant v_DOCUMECREATI = new IDVariant(0,IDVariant.STRING);
      PAN_WORKEXPORTID.PanelCommand(Glb.PCM_UPDATE);
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant()).stringValue());
      MainFrm.Cf4armDBObject.ImportadaFILE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), MainFrm.PROGRESESSIO, v_DOCUMECREATI);
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add((new IDVariant("Elaborazione avvenuta con successo ")), (new IDVariant("\n"))), v_DOCUMECREATI)); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFile", "CmdEsegui", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Predisposizione WORDEXPORTID 1
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant PredisposizioneWORDEXPORTID1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DARESTITUIRE = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_IFASE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ISESSIONE = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Predisposizione WORDEXPORTID 1 Body
      // Procedure Body
      // 
      v_IFASE = (new IDVariant("INS_XML_FE"));
      v_ISESSIONE = new IDVariant(MainFrm.PROGRESESSIO);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.PROGRESSIVO + 1) as MAWOEXIDPRUN ");
      SQL.append("from ");
      SQL.append("  WORK_EXPORT_ID A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DARESTITUIRE = QV.Get("MAWOEXIDPRUN", IDVariant.DECIMAL) ;
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
      return new IDVariant(v_DARESTITUIRE,IDVariant.INTEGER);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CaricamentoFile", "PredisposizioneWORDEXPORTID1", _e);
      return new IDVariant();
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
      MainFrm.ErrObj.ProcError ("CaricamentoFile", "CmdAnnulla", _e);
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
  private void PAN_WORKEXPORTID_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_WORKEXPORTID, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_WORKEXPORTID_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_WORKEXPORTID, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_WORKEXPORTID_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_WORKEXPORTID);
    // Stub
  }

  private void PAN_WORKEXPORTID_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_WORKEXPORTID_ELABORA)
    {
      this.IdxPanelActived = this.PAN_WORKEXPORTID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CmdEsegui();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_WORKEXPORTID_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_WORKEXPORTID_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_WORKEXPORTI5, IMDBDef10.PQSL_WORKEXPORTI5_FILE_DATI, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_WORKEXPORTI5, IMDBDef10.PQSL_WORKEXPORTI5_FILE_DATI, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_WORKEXPORTID_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_WORKEXPORTID_Init()
  {

    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "AFC88393-45DB-4853-97F0-1239714EACF5");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "PROGRESSIVO");
    PAN_WORKEXPORTID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, "E601D4A4-61DB-4765-A2F4-F4BA37E4BC38");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, "Elabora");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_WORKEXPORTID.SetImage(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, 0, "button1.gif", false);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, "AEFD9010-4059-455E-8056-3ED1547C51D6");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, "File");
    PAN_WORKEXPORTID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, "");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.VIS_NORMFIELPADR);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, "8F154CC6-39E9-4174-BB31-A0D78DD0CE0C");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, "SESSIONE");
    PAN_WORKEXPORTID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, "");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.VIS_NONNULLAFIEL);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, 0, -1);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ETICHETTESTO, "1E6FADC9-FBE0-4A2B-8BA7-78EC6A4F3B81");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ETICHETTESTO, "Scegliere il file XML da cui importare i dati della fattura elettronica");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ETICHETTESTO, MyGlb.VIS_VUOGRAALILEF);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ETICHETTESTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_WORKEXPORTID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 36, 132, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_PROGRESSIVO, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_PROGRESSIVO, PPQRY_WORKEXPORTI5, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, MyGlb.PANEL_LIST, 280, 484, 100, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, MyGlb.PANEL_FORM, 440, 148, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_ELABORA, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_LIST, 64);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_LIST, 2);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_LIST, "File");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_FORM, 20, 48, 500, 84, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_FORM, 64);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_FORM, 6);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_FILE, MyGlb.PANEL_FORM, "File");
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_FILE, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_FILE, PPQRY_WORKEXPORTI5, "A.FILE_DATI", "FILE_DATI", 10, 9999, 0, -13997);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_LIST, 64);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_LIST, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_LIST, "SESSIONE");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_FORM, 4, 168, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_FORM, 64);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_FORM, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_SESSIONE, MyGlb.PANEL_FORM, "SESSIONE");
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_SESSIONE, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_SESSIONE, PPQRY_WORKEXPORTI5, "A.SESSIONE", "SESSIONE", 3, 10, 0, -13997);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ETICHETTESTO, MyGlb.PANEL_LIST, 32, 152, 264, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ETICHETTESTO, MyGlb.PANEL_LIST, 0);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ETICHETTESTO, MyGlb.PANEL_LIST, 2);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ETICHETTESTO, MyGlb.PANEL_FORM, 12, 12, 508, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ETICHETTESTO, MyGlb.PANEL_FORM, 0);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_ETICHETTESTO, MyGlb.PANEL_FORM, 2);
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_ETICHETTESTO, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_ETICHETTESTO, -1, "", "ETICHETTESTO", 0, 0, 0, -13997);
  }

  private void PAN_WORKEXPORTID_InitQueries()
  {
    StringBuffer SQL;

    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_WORKEXPORTID.SetIMDB(IMDB, "PQRY_WORKEXPORTI5", true);
    PAN_WORKEXPORTID.set_SetString(MyGlb.MASTER_ROWNAME, "WORK EXPORT ID");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.FASE as FASE, ");
    SQL.append("  A.FILE_DATI as FILE_DATI ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WORK_EXPORT_ID A ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO = ~~TBL_PARAM172.ROWNAMEPROGR~~) ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI5, 5, SQL, -1, "");
    PAN_WORKEXPORTID.SetQueryDB(PPQRY_WORKEXPORTI5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_WORKEXPORTID.SetMasterTable(0, "WORK_EXPORT_ID");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_WORKEXPORTID.Status() == 2)
    {
      int oldListQBE = PAN_WORKEXPORTID.iUseListQBE;
      PAN_WORKEXPORTID.iUseListQBE = 0;
      PAN_WORKEXPORTID.PanelCommand(Glb.PCM_SEARCH);
      PAN_WORKEXPORTID.PanelCommand(Glb.PCM_FIND);
      PAN_WORKEXPORTID.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_AfterBlobUpdate(Column, Size, Extension);
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
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
