// **********************************************
// Acquisizione Immagine Iride
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AcquisizioneImmagineIride extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_WORKEXPORTID_DOCUMESCANSI = 0;
  private static int PFL_WORKEXPORTID_PROGRESSIVO = 1;
  private static int PFL_WORKEXPORTID_OK = 2;

  private static int PPQRY_WORKEXPORTI3 = 0;


  IDPanel PAN_WORKEXPORTID;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM115(IMDB);
    //
    //
    Init_PQRY_WORKEXPORTI3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM115(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM115, 7);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM115, "TBL_PARAM115");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM115,IMDBDef2.FLD_PARAM115_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM115,IMDBDef2.FLD_PARAM115_ROWNAMEPROGR,1,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM115,IMDBDef2.FLD_PARAM115_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM115,IMDBDef2.FLD_PARAM115_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM115,IMDBDef2.FLD_PARAM115_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM115,IMDBDef2.FLD_PARAM115_ROWNAMNUMPRO,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM115,IMDBDef2.FLD_PARAM115_ROWNAMEPROUO, "ROWNAMEPROUO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM115,IMDBDef2.FLD_PARAM115_ROWNAMEPROUO,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM115,IMDBDef2.FLD_PARAM115_ROWNAMBLOINS, "ROWNAMBLOINS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM115,IMDBDef2.FLD_PARAM115_ROWNAMBLOINS,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM115,IMDBDef2.FLD_PARAM115_ROWNAMEIDDOC, "ROWNAMEIDDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM115,IMDBDef2.FLD_PARAM115_ROWNAMEIDDOC,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM115,IMDBDef2.FLD_PARAM115_ROWNAMIDALPR, "ROWNAMIDALPR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM115,IMDBDef2.FLD_PARAM115_ROWNAMIDALPR,1,10,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM115, 0);
  }

  private static void Init_PQRY_WORKEXPORTI3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_WORKEXPORTI3, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_WORKEXPORTI3, "PQRY_WORKEXPORTI3");
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI3,IMDBDef10.PQSL_WORKEXPORTI3_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI3,IMDBDef10.PQSL_WORKEXPORTI3_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI3,IMDBDef10.PQSL_WORKEXPORTI3_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI3,IMDBDef10.PQSL_WORKEXPORTI3_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI3,IMDBDef10.PQSL_WORKEXPORTI3_FASE, "FASE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI3,IMDBDef10.PQSL_WORKEXPORTI3_FASE,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI3,IMDBDef10.PQSL_WORKEXPORTI3_FILE_DATI, "FILE_DATI");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI3,IMDBDef10.PQSL_WORKEXPORTI3_FILE_DATI,10,9999,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_WORKEXPORTI3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AcquisizioneImmagineIride(MyWebEntryPoint w, IMDBObj imdb)
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
  public AcquisizioneImmagineIride()
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
    FormIdx = MyGlb.FRM_ACQUIMMAIRID;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7B1D6EF7-64EF-4AC4-932A-96DA2CE48C09";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 552;
    DesignHeight = 270;
    set_Caption(new IDVariant("Acquisizione Immagine Iride"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 552;
    Frames[1].Height = 244;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "WORK EXPORT ID";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 244;
    PAN_WORKEXPORTID = new IDPanel(w, this, 1, "PAN_WORKEXPORTID");
    Frames[1].Content = PAN_WORKEXPORTID;
    PAN_WORKEXPORTID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_WORKEXPORTID.VS = MainFrm.VisualStyleList;
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 552-MyGlb.PAN_OFFS_X, 244-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "40BCEECD-3021-43DB-852F-6CAF4C1718AC");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
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
    return (obj instanceof AcquisizioneImmagineIride);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AcquisizioneImmagineIride.class.getName() : (Glb.ClassWithPackage(AcquisizioneImmagineIride.class) ? AcquisizioneImmagineIride.class.getName().substring(AcquisizioneImmagineIride.class.getPackage().getName().length() + 1) : AcquisizioneImmagineIride.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // WORK EXPORT ID After BLOB Update Event
  // Evento notificato dal pannello dopo aver salvato su
  // db il file caricato dall'utente o cancellato il contenuto
  // del blob.
  // Column: Numero intero che indica quale campo del pannello è coinvolto nell'operazione di aggiornamento o cancellazione. Deve essere confrontato con la funzione Me dei campi del pannello. - Input
  // Size: Dimensione del file caricato in byte oppure -1 se il contenuto del blob è stato cancellato. - Input
  // Extension: Stringa che contiene l'estensione del file in fase di caricamento. - Input
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
      // WORK EXPORT ID After BLOB Update Event Body
      // Procedure Body
      // 
      // 
      // 
      // 
      // 
      if (Size.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMBLOINS, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMBLOINS, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineIride", "WORKEXPORTIDAfterBLOBUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // WORK EXPORT ID On Download Blob
  // Evento notificato dal pannello prima dello scaricamento
  // di un blob da un pannello.
  // Cancel - Input/Output
  // Column - Input
  // Size - Input
  // Extension - Input/Output
  // Inline - Input/Output
  // Filename - Input/Output
  // Mime Type - Input/Output
  // **********************************************************************
  private void PAN_WORKEXPORTID_OnDownloadBlob (IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // WORK EXPORT ID On Download Blob Body
      // Corpo Procedura
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineIride", "WORKEXPORTIDOnDownloadBlob", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMEPROGR, 0, PredisposizioneRecord());
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      PAN_WORKEXPORTID.SetFieldBlobSize(PFL_WORKEXPORTID_DOCUMESCANSI, (new IDVariant(1)).intValue(), (new IDVariant(0)).intValue(), (new IDVariant(-1)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineIride", "LoadEvent", _e);
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
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineIride", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMEPROGR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMEPROUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMBLOINS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMEIDDOC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMIDALPR, 0, new IDVariant());
  }

  // **********************************************************************
  // Predisposizione Record
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant PredisposizioneRecord ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DARESTITUIRE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Predisposizione Record Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.PROGRESSIVO) + 1 as MAXWOEXIDPR1 ");
      SQL.append("from ");
      SQL.append("  WORK_EXPORT_ID A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DARESTITUIRE = QV.Get("MAXWOEXIDPR1", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("insert into WORK_EXPORT_ID ");
      SQL.append("( ");
      SQL.append("  PROGRESSIVO, ");
      SQL.append("  SESSIONE ");
      SQL.append(") ");
      SQL.append("values ");
      SQL.append("( ");
      SQL.append("  " + IDL.CSql(v_DARESTITUIRE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
      SQL.append(") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return v_DARESTITUIRE;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineIride", "PredisposizioneRecord", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // OK
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int OK ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_SMS = (new IDVariant("Errore nell'inserimento documentale Iride", IDVariant.STRING));
      // 
      // OK Body
      // Procedure Body
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMBLOINS, 0),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Selezionare un file immagine da allegare o scannerizzare il documento", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      IDVariant v_CODICEUO = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  TO_CHAR ( SO4_UTIL.UNITA_GET_CODICE_VALIDO(" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMEPROUO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",TRUNC( SYSDATE )) ) as TOSUGCVRNPUT ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODICEUO = QV.Get("TOSUGCVRNPUT", IDVariant.STRING) ;
      }
      QV.Close();
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.PROPOSTEINTEGRAZIONEAGGIUNGIALLEGATOIRIDE(IMDB.Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMNUMPRO, 0), v_CODICEUO, IMDB.Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMEIDDOC, 0), IMDB.Value(IMDBDef10.PQRY_WORKEXPORTI3, IMDBDef10.PQSL_WORKEXPORTI3_PROGRESSIVO, 0), IMDB.Value(IMDBDef2.TBL_PARAM115, IMDBDef2.FLD_PARAM115_ROWNAMIDALPR, 0), IMDB.Value(IMDBDef7.TBL_PARAMETIRIDE, IMDBDef7.FLD_PARAMETIRIDE_IRIDCODAMMWS, 0), IMDB.Value(IMDBDef7.TBL_PARAMETIRIDE, IMDBDef7.FLD_PARAMETIRIDE_IRIDUTEWSFAT, 0), IMDB.Value(IMDBDef7.TBL_PARAMETIRIDE, IMDBDef7.FLD_PARAMETIRIDE_IRIDRUOWSFAT, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_SMS, (new IDVariant("<BR/>"))), (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
        return 0;
      }
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineIride", "OK", _e);
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
    if (ColIndex.intValue() == PFL_WORKEXPORTID_OK)
    {
      this.IdxPanelActived = this.PAN_WORKEXPORTID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OK();
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
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_WORKEXPORTI3, IMDBDef10.PQSL_WORKEXPORTI3_FILE_DATI, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_WORKEXPORTI3, IMDBDef10.PQSL_WORKEXPORTI3_FILE_DATI, 0, (new IDVariant()));
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
    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, "3A8A22DF-6067-4136-9A58-B3831DA38D85");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, "Documento Scansionato");
    PAN_WORKEXPORTID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, "");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.VIS_NORMFIELPADR);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "549D8BD4-CCE2-4A8E-8509-558AD303D1B5");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "PROGRESSIVO");
    PAN_WORKEXPORTID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_OK, "1C2BD7E9-C34A-4FE5-8039-D0902556BD34");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_OK, "OK");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_OK, MyGlb.VIS_STATICBUTTON);
    PAN_WORKEXPORTID.SetImage(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_OK, 0, "button1.gif", false);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_WORKEXPORTID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_LIST, 4, 184, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_LIST, 112);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_LIST, 2);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_LIST, "Documento Scansionato");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_FORM, 32, 20, 476, 144, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_FORM, 136);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_FORM, 10);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_FORM, "Documento Scansionato");
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_DOCUMESCANSI, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_DOCUMESCANSI, PPQRY_WORKEXPORTI3, "A.FILE_DATI", "FILE_DATI", 10, 9999, 0, -13997);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 148, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_PROGRESSIVO, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_PROGRESSIVO, PPQRY_WORKEXPORTI3, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_OK, MyGlb.PANEL_LIST, 172, 280, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_OK, MyGlb.PANEL_LIST, 0);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_OK, MyGlb.PANEL_LIST, 1);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_OK, MyGlb.PANEL_FORM, 428, 192, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_OK, MyGlb.PANEL_FORM, 0);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_OK, MyGlb.PANEL_FORM, 1);
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_OK, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_OK, -1, "", "OK", 0, 0, 0, -13997);
  }

  private void PAN_WORKEXPORTID_InitQueries()
  {
    StringBuffer SQL;

    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_WORKEXPORTID.SetIMDB(IMDB, "PQRY_WORKEXPORTI3", true);
    PAN_WORKEXPORTID.set_SetString(MyGlb.MASTER_ROWNAME, "WORK EXPORT ID");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.FASE as FASE, ");
    SQL.append("  A.FILE_DATI as FILE_DATI ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WORK_EXPORT_ID A ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO = ~~TBL_PARAM115.ROWNAMEPROGR~~) ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI3, 5, SQL, -1, "");
    PAN_WORKEXPORTID.SetQueryDB(PPQRY_WORKEXPORTI3, MainFrm.Cf4armDBObject.DB, 4);
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
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_OnDownloadBlob(Cancel, Column, Size, Extension, Inline, Filename, MimeType);
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
