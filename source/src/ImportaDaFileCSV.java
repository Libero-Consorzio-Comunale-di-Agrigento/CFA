// **********************************************
// Importa Da File CSV
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ImportaDaFileCSV extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMEIMPORT_ETILABPERBLO = 0;
  private static int PFL_PARAMEIMPORT_IMPOVISUBUTT = 1;
  private static int PFL_PARAMEIMPORT_ETICSELILFIL = 2;
  private static int PFL_PARAMEIMPORT_PROGRESSIVO1 = 3;

  private static int PPQRY_PARAMEIMPOR2 = 0;


  IDPanel PAN_PARAMEIMPORT;
  private static int PFL_BLOB_FILEDATI = 0;
  private static int PFL_BLOB_FASE = 1;
  private static int PFL_BLOB_SESSIONE = 2;
  private static int PFL_BLOB_PROGRESSIVO = 3;

  private static int PPQRY_WORKEXPORTI1 = 0;


  IDPanel PAN_BLOB;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMEIMPORT(IMDB);
    //
    //
    Init_PQRY_PARAMEIMPOR2(IMDB);
    Init_PQRY_PARAMEIMPOR2_RS(IMDB);
    Init_PQRY_WORKEXPORTI1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMEIMPORT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMEIMPORT, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMEIMPORT, "TBL_PARAMEIMPORT");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMEIMPORT,IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMEIMPORT,IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEPROG,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMEIMPORT,IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEBLOB, "NOMEOGGEBLOB");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMEIMPORT,IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEBLOB,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMEIMPORT,IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEPERC, "NOMEOGGEPERC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMEIMPORT,IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEPERC,9,512,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMEIMPORT,IMDBDef2.FLD_PARAMEIMPORT_NOMOGGFASIMP, "NOMOGGFASIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMEIMPORT,IMDBDef2.FLD_PARAMEIMPORT_NOMOGGFASIMP,5,10,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMEIMPORT, 0);
  }

  private static void Init_PQRY_PARAMEIMPOR2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMEIMPOR2, 1);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMEIMPOR2, "PQRY_PARAMEIMPOR2");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMEIMPOR2,IMDBDef10.PQSL_PARAMEIMPOR2_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMEIMPOR2,IMDBDef10.PQSL_PARAMEIMPOR2_NOMEOGGEPROG,1,10,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMEIMPOR2, 0);
  }

  private static void Init_PQRY_PARAMEIMPOR2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMEIMPOR2_RS, 1);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMEIMPOR2_RS, "PQRY_PARAMEIMPOR2_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMEIMPOR2_RS,IMDBDef10.PQSL_PARAMEIMPOR2_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMEIMPOR2_RS,IMDBDef10.PQSL_PARAMEIMPOR2_NOMEOGGEPROG,1,10,0);
  }

  private static void Init_PQRY_WORKEXPORTI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_WORKEXPORTI1, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_WORKEXPORTI1, "PQRY_WORKEXPORTI1");
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI1,IMDBDef10.PQSL_WORKEXPORTI1_FILE_DATI, "FILE_DATI");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI1,IMDBDef10.PQSL_WORKEXPORTI1_FILE_DATI,10,9999,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI1,IMDBDef10.PQSL_WORKEXPORTI1_FASE, "FASE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI1,IMDBDef10.PQSL_WORKEXPORTI1_FASE,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI1,IMDBDef10.PQSL_WORKEXPORTI1_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI1,IMDBDef10.PQSL_WORKEXPORTI1_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI1,IMDBDef10.PQSL_WORKEXPORTI1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI1,IMDBDef10.PQSL_WORKEXPORTI1_PROGRESSIVO,3,10,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_WORKEXPORTI1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ImportaDaFileCSV(MyWebEntryPoint w, IMDBObj imdb)
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
  public ImportaDaFileCSV()
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
    FormIdx = MyGlb.FRM_IMPODAFILCSV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "787C4775-A8C4-4ABA-8BC4-AD69A5938BB1";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 624;
    DesignHeight = 258;
    set_Caption(new IDVariant("Importa da File"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 624;
    Frames[1].Height = 232;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri Import";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 232;
    PAN_PARAMEIMPORT = new IDPanel(w, this, 1, "PAN_PARAMEIMPORT");
    Frames[1].Content = PAN_PARAMEIMPORT;
    PAN_PARAMEIMPORT.Lockable = false;
    PAN_PARAMEIMPORT.iLocked = false;
    PAN_PARAMEIMPORT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMEIMPORT.VS = MainFrm.VisualStyleList;
    PAN_PARAMEIMPORT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 624-MyGlb.PAN_OFFS_X, 232-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMEIMPORT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F1D1BB7E-C59F-4696-9603-3551D92ACD02");
    PAN_PARAMEIMPORT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 76, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMEIMPORT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMEIMPORT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMEIMPORT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMEIMPORT.InitStatus = 1;
    PAN_PARAMEIMPORT_Init();
    PAN_PARAMEIMPORT_InitFields();
    PAN_PARAMEIMPORT_InitQueries();
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    PAN_PARAMEIMPORT.SetSubFrame(PFL_PARAMEIMPORT_ETILABPERBLO,2);
    Frames[2].set_SubFrame(true);
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Blob";
    Frames[2].Parent = this;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_BLOB = new IDPanel(w, this, 2, "PAN_BLOB");
    Frames[2].Content = PAN_BLOB;
    PAN_BLOB.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BLOB.VS = MainFrm.VisualStyleList;
    PAN_BLOB.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5A5705F7-E9B8-4F7D-9D91-CB2F80D418F3");
    PAN_BLOB.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 432, 136, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BLOB.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BLOB.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BLOB.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BLOB.InitStatus = 2;
    PAN_BLOB_Init();
    PAN_BLOB_InitFields();
    PAN_BLOB_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMEIMPORT, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        IMPODAFILCSV_PARAMEIMPOR2();
      }
      PAN_PARAMEIMPORT.UpdatePanel(MainFrm);
      PAN_BLOB.UpdatePanel(MainFrm);
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
    return (obj instanceof ImportaDaFileCSV);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ImportaDaFileCSV.class.getName() : (Glb.ClassWithPackage(ImportaDaFileCSV.class) ? ImportaDaFileCSV.class.getName().substring(ImportaDaFileCSV.class.getPackage().getName().length() + 1) : ImportaDaFileCSV.class.getName()));
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
    IDVariant v_PROGRESSIV = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Body
      // Corpo Procedura
      // 
        IDVariant v_IFASE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ISESSIONE = new IDVariant(0,IDVariant.DECIMAL);
      if (IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMOGGFASIMP, 0)))
      {
        IDVariant v_FASEIMPORT = new IDVariant(0,IDVariant.STRING);
        v_FASEIMPORT = (new IDVariant("IM_FAT_SAM"));
        IMDB.set_Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMOGGFASIMP, 0, new IDVariant(v_FASEIMPORT));
      }
      v_PROGRESSIV = (new IDVariant());
      IMDB.set_Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEBLOB, 0, (new IDVariant("NO")));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.PROGRESSIVO + 1) as MAWOEXIDPRUN ");
      SQL.append("from ");
      SQL.append("  WORK_EXPORT_ID A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PROGRESSIV = QV.Get("MAWOEXIDPRUN", IDVariant.DECIMAL) ;
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
      SQL.append("  " + IDL.CSql(v_PROGRESSIV, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMOGGFASIMP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
      SQL.append(") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      IMDB.set_Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEPROG, 0, new IDVariant(new IDVariant(v_PROGRESSIV),IDVariant.INTEGER));
      PAN_BLOB.SetFieldBlobSize(PFL_BLOB_FILEDATI, (new IDVariant(1)).intValue(), (new IDVariant(68000000)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_BLOB.SetFieldBlobExtensions(PFL_BLOB_FILEDATI, (new IDVariant("*.csv")).stringValue(), (new IDVariant("File CSV")).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportaDaFileCSV", "Load", _e);
    }
  }

  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
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
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_PARAIMPODELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportaDaFileCSV", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri Import: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAIMPODELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEPROG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEBLOB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEPERC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMOGGFASIMP, 0, new IDVariant());
  }

  // **********************************************************************
  // Blob After BLOB Update
  // Evento notificato dal pannello dopo aver salvato su
  // db il file caricato dall'utente o cancellato il contenuto
  // del blob.
  // Column - Input
  // Size - Input
  // Extension - Input
  // **********************************************************************
  private void PAN_BLOB_AfterBlobUpdate (IDVariant Column, IDVariant Size, IDVariant Extension)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Blob After BLOB Update Body
      // Corpo Procedura
      // 
      IDVariant v_PERCORSO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_NOMEFILE = new IDVariant(0,IDVariant.STRING);
      IDVariant v_CARTELLA = new IDVariant(0,IDVariant.STRING);
      C2 = PAN_BLOB.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_BLOB.GotoFirst();
      while (!PAN_BLOB.RSEOF())
      {
        if (C2.Get("PROGRESSIVO").equals(IMDB.Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEPROG, 0), true))
        {
          v_NOMEFILE = new IDVariant(com.progamma.GUID.DocID2GUID (com.progamma.doc.MDOInit.GetNewDocID().stringValue()));
          v_CARTELLA = (new IDVariant(MainFrm.RealPath));
          v_CARTELLA = IDL.Add(IDL.Add(v_CARTELLA, new IDVariant(System.getProperty("file.separator"))
), (new IDVariant("temp")));
          v_PERCORSO = Glb.SaveBlob(MainFrm,C2.Get("FILE_DATI"),v_CARTELLA,v_NOMEFILE);
          IMDB.set_Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEPERC, 0, new IDVariant(v_PERCORSO));
          MainFrm.AddTempFile(IDL.Add(IDL.Add(v_CARTELLA, new IDVariant(System.getProperty("file.separator"))
), v_NOMEFILE).stringValue()); 
        }
        PAN_BLOB.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (Size.compareTo((new IDVariant(0)), true)>0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEBLOB, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEBLOB, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportaDaFileCSV", "BlobAfterBLOBUpdate", _e);
    }
  }

  // **********************************************************************
  // Importa Visualizza Button
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ImportaVisualizzaButton ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Importa Visualizza Button Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEBLOB, 0).compareTo((new IDVariant("SI")), true)!=0)
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Non è stato indicato alcun file da caricare"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (LeggiIlFileEScriviSuExport())
      {
        // 
        // lancio la proc
        // 
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.IMPORTFATSAMASH(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        else
        {
          MainFrm.set_AlertMessage((new IDVariant("Elaborazione Eseguita"))); 
          MainFrm.Show(MyGlb.FRM_RISULTELABOR, (new IDVariant(-1)).intValue(), this); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
        if (MainFrm.TEST.compareTo((new IDVariant("SI")), true)!=0)
        {
          // 
          // pulisco la tabella workesportteso prima di effettuare
          // l'inserimento
          // 
          SQL = new StringBuffer();
          SQL.append("delete from WORK_EXPORT_ID ");
          SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMOGGFASIMP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          SQL = new StringBuffer();
          SQL.append("delete from WORK_EXPORT_TESO ");
          SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMOGGFASIMP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportaDaFileCSV", "ImportaVisualizzaButton", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Leggi Il File E Scrivi Su Export
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public boolean LeggiIlFileEScriviSuExport ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Leggi Il File E Scrivi Su Export Body
      // Corpo Procedura
      // 
      // 
      // fd del file di input
      // 
      IDVariant v_FD = new IDVariant(0,IDVariant.INTEGER);
      try
      {
        v_FD = MainFrm.VBFile.FreeFile();
        MainFrm.VBFile.OpenForInput(IMDB.Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEPERC, 0), v_FD); 
      }
      catch (Exception e3)
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Errore nella lettura del file"));
        MainFrm.set_AlertMessage(S); 
        // 
        // log catalina.out
        // 
        MainFrm.Logmessage(IDL.Add(IDL.Add(S, (new IDVariant("\n"))), new IDVariant(e3.getMessage())));
        return (new IDVariant(0)).booleanValue();
      }
      IDVariant v_CURRLINE = new IDVariant(0,IDVariant.STRING);
      IDVariant v_CURRNUMBCHAR = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_PROGR = new IDVariant(0,IDVariant.DECIMAL);
      MainFrm.Cf4armDBObject.BeginTrans();
      try
      {
        // 
        // pulisco la tabella workesportteso prima di effettuare
        // l'inserimento
        // 
        SQL = new StringBuffer();
        SQL.append("delete from WORK_EXPORT_TESO ");
        SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMOGGFASIMP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      catch (Exception e6)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return (new IDVariant(0)).booleanValue();
      }
      IDVariant v_VMAX = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(MAX(NVL(A.PROGRESSIVO, 0)), 0) as NUVMNVWETP00 ");
      SQL.append("from ");
      SQL.append("  WORK_EXPORT_TESO A ");
      SQL.append("where (A.FASE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMOGGFASIMP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VMAX = QV.Get("NUVMNVWETP00", IDVariant.INTEGER) ;
      }
      QV.Close();
      v_PROGR = new IDVariant(IDL.Add(IDL.NullValue(v_VMAX,(new IDVariant(0))), (new IDVariant(1))),IDVariant.DECIMAL);
      IDVariant v_NRIGA = null;
      v_NRIGA = (new IDVariant(1));
      while (!(MainFrm.VBFile.EOF(v_FD)))
      {
        v_CURRLINE = MainFrm.VBFile.ReadLine(v_FD); 
        v_CURRNUMBCHAR = IDL.Length(v_CURRLINE);
        // 
        // salto la prima riga che ha solo l'intestazione
        // 
        if (v_NRIGA.compareTo((new IDVariant(1)), true)!=0)
        {
          try
          {
            v_PROGR = IDL.Add(v_PROGR, (new IDVariant(1)));
            SQL = new StringBuffer();
            SQL.append("insert into WORK_EXPORT_TESO ");
            SQL.append("( ");
            SQL.append("  FASE, ");
            SQL.append("  PROGRESSIVO, ");
            SQL.append("  SESSIONE, ");
            SQL.append("  DATI, ");
            SQL.append("  DATI2 ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMOGGFASIMP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(v_PROGR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ), ");
            SQL.append("  SUBSTR(" + IDL.CSql(v_CURRLINE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 1, 4000), ");
            SQL.append("  SUBSTR(" + IDL.CSql(v_CURRLINE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 4001, 4000) ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e11)
          {
            MainFrm.set_AlertMessage(new IDVariant(e11.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return (new IDVariant(0)).booleanValue();
          }
        }
        v_NRIGA = IDL.Add(v_NRIGA, (new IDVariant(1)));
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      MainFrm.VBFile.Close(v_FD); 
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportaDaFileCSV", "LeggiIlFileEScriviSuExport", _e);
      return false;
    }
  }

  // **********************************************************************
  // Parametri Import
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void IMPODAFILCSV_PARAMEIMPOR2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAMEIMPOR2_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMEIMPORT, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMEIMPORT, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAMEIMPOR2_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAMEIMPOR2_RS, 0, IMDBDef2.TBL_PARAMEIMPORT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMEIMPOR2_RS, 0, 0, IMDBDef2.TBL_PARAMEIMPORT, IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEPROG, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMEIMPORT, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMEIMPORT, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMEIMPORT, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAMEIMPOR2_RS, 0);
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
  private void PAN_PARAMEIMPORT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMEIMPORT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMEIMPORT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMEIMPORT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMEIMPORT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMEIMPORT);
    // Stub
  }

  private void PAN_PARAMEIMPORT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMEIMPORT_IMPOVISUBUTT)
    {
      this.IdxPanelActived = this.PAN_PARAMEIMPORT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ImportaVisualizzaButton();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMEIMPORT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMEIMPORT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMEIMPORT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_BLOB_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BLOB, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BLOB_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BLOB, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BLOB_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_BLOB);
    // Stub
  }

  private void PAN_BLOB_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_BLOB_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_BLOB_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_WORKEXPORTI1, IMDBDef10.PQSL_WORKEXPORTI1_FILE_DATI, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_WORKEXPORTI1, IMDBDef10.PQSL_WORKEXPORTI1_FILE_DATI, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_BLOB_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMEIMPORT_Init()
  {

    PAN_PARAMEIMPORT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMEIMPORT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMEIMPORT.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAMEIMPORT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETILABPERBLO, "AB72E581-41D9-4E2B-8AA9-1AD4C3F24BF5");
    PAN_PARAMEIMPORT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETILABPERBLO, "Label per Blob");
    PAN_PARAMEIMPORT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETILABPERBLO, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMEIMPORT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETILABPERBLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMEIMPORT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_IMPOVISUBUTT, "666C6791-9EF9-4C0E-A7F1-50D451FDAA75");
    PAN_PARAMEIMPORT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_IMPOVISUBUTT, "Importa");
    PAN_PARAMEIMPORT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_IMPOVISUBUTT, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMEIMPORT.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_IMPOVISUBUTT, 0, "button1.gif", false);
    PAN_PARAMEIMPORT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_IMPOVISUBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMEIMPORT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETICSELILFIL, "AB07B339-8F75-4EA9-B0E2-69AD0D316D2F");
    PAN_PARAMEIMPORT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETICSELILFIL, "Verranno eseguite le seguenti operazioni:<br/>\n- Modifica dettagli iva Documenti<br/>\n- Creazione Distinte Liquidazione<br/><br/>\n\nI documenti già liquidati o inseriti in distinta, non saranno trattati.");
    PAN_PARAMEIMPORT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETICSELILFIL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMEIMPORT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETICSELILFIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMEIMPORT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_PROGRESSIVO1, "0C84AF34-C54B-4894-93ED-0677A77A86E0");
    PAN_PARAMEIMPORT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_PROGRESSIVO1, "Progressivo");
    PAN_PARAMEIMPORT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_PROGRESSIVO1, "");
    PAN_PARAMEIMPORT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_PROGRESSIVO1, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMEIMPORT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_PROGRESSIVO1, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMEIMPORT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMEIMPORT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETILABPERBLO, MyGlb.PANEL_LIST, 20, 44, 776, 192, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEIMPORT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETILABPERBLO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMEIMPORT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETILABPERBLO, MyGlb.PANEL_LIST, 14);
    PAN_PARAMEIMPORT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETILABPERBLO, MyGlb.PANEL_FORM, 24, 104, 548, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEIMPORT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETILABPERBLO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMEIMPORT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETILABPERBLO, MyGlb.PANEL_FORM, 4);
    PAN_PARAMEIMPORT.SetFieldPage(PFL_PARAMEIMPORT_ETILABPERBLO, -1, -1);
    PAN_PARAMEIMPORT.SetFieldPanel(PFL_PARAMEIMPORT_ETILABPERBLO, -1, "", "ETILABPERBLO", 0, 0, 0, -13997);
    PAN_PARAMEIMPORT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_IMPOVISUBUTT, MyGlb.PANEL_LIST, 296, 8, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEIMPORT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_IMPOVISUBUTT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMEIMPORT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_IMPOVISUBUTT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEIMPORT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_IMPOVISUBUTT, MyGlb.PANEL_FORM, 468, 176, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEIMPORT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_IMPOVISUBUTT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMEIMPORT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_IMPOVISUBUTT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEIMPORT.SetFieldPage(PFL_PARAMEIMPORT_IMPOVISUBUTT, -1, -1);
    PAN_PARAMEIMPORT.SetFieldPanel(PFL_PARAMEIMPORT_IMPOVISUBUTT, -1, "", "IMPOVISUBUTT", 0, 0, 0, -13997);
    PAN_PARAMEIMPORT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETICSELILFIL, MyGlb.PANEL_LIST, 24, 12, 572, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEIMPORT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETICSELILFIL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMEIMPORT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETICSELILFIL, MyGlb.PANEL_LIST, 3);
    PAN_PARAMEIMPORT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETICSELILFIL, MyGlb.PANEL_FORM, 24, 12, 580, 72, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEIMPORT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETICSELILFIL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMEIMPORT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_ETICSELILFIL, MyGlb.PANEL_FORM, 5);
    PAN_PARAMEIMPORT.SetFieldPage(PFL_PARAMEIMPORT_ETICSELILFIL, -1, -1);
    PAN_PARAMEIMPORT.SetFieldPanel(PFL_PARAMEIMPORT_ETICSELILFIL, -1, "", "ETICSELILFIL", 0, 0, 0, -13997);
    PAN_PARAMEIMPORT.set_Alignment(PFL_PARAMEIMPORT_ETICSELILFIL, 2);
    PAN_PARAMEIMPORT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_PROGRESSIVO1, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEIMPORT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_PROGRESSIVO1, MyGlb.PANEL_LIST, 76);
    PAN_PARAMEIMPORT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEIMPORT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_PROGRESSIVO1, MyGlb.PANEL_LIST, "Progressivo");
    PAN_PARAMEIMPORT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 212, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEIMPORT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_PROGRESSIVO1, MyGlb.PANEL_FORM, 76);
    PAN_PARAMEIMPORT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEIMPORT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEIMPORT_PROGRESSIVO1, MyGlb.PANEL_FORM, "Progressivo");
    PAN_PARAMEIMPORT.SetFieldPage(PFL_PARAMEIMPORT_PROGRESSIVO1, -1, -1);
    PAN_PARAMEIMPORT.SetFieldPanel(PFL_PARAMEIMPORT_PROGRESSIVO1, PPQRY_PARAMEIMPOR2, "A.NOMEOGGEPROG", "NOMEOGGEPROG", 1, 10, 0, -13997);
  }

  private void PAN_PARAMEIMPORT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMEIMPORT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMEIMPORT.SetIMDB(IMDB, "PQRY_PARAMEIMPOR2", true);
    PAN_PARAMEIMPORT.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMEIMPORT.SetQueryIMDB(PPQRY_PARAMEIMPOR2, IMDBDef10.PQRY_PARAMEIMPOR2_RS, IMDBDef2.TBL_PARAMEIMPORT);
    JustLoaded = true;
    PAN_PARAMEIMPORT.SetFieldPrimaryIndex(PFL_PARAMEIMPORT_PROGRESSIVO1, IMDBDef2.FLD_PARAMEIMPORT_NOMEOGGEPROG);
    PAN_PARAMEIMPORT.SetMasterTable(0, "PARAMEIMPORT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMEIMPORT.Status() == 2)
    {
      int oldListQBE = PAN_PARAMEIMPORT.iUseListQBE;
      PAN_PARAMEIMPORT.iUseListQBE = 0;
      PAN_PARAMEIMPORT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMEIMPORT.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMEIMPORT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_BLOB_Init()
  {

    PAN_BLOB.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BLOB.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_BLOB.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_BLOB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BLOB_FILEDATI, "879CD554-99B4-4880-9D9E-A195C297510F");
    PAN_BLOB.set_Header(MyGlb.OBJ_FIELD, PFL_BLOB_FILEDATI, "File");
    PAN_BLOB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BLOB_FILEDATI, "File");
    PAN_BLOB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BLOB_FILEDATI, MyGlb.VIS_NORMFIELPADR);
    PAN_BLOB.SetFlags(MyGlb.OBJ_FIELD, PFL_BLOB_FILEDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BLOB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BLOB_FASE, "E7C964DF-0674-4D45-9146-0DAD4BE00F66");
    PAN_BLOB.set_Header(MyGlb.OBJ_FIELD, PFL_BLOB_FASE, "FASE");
    PAN_BLOB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BLOB_FASE, "");
    PAN_BLOB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BLOB_FASE, MyGlb.VIS_NORMFIELPADR);
    PAN_BLOB.SetFlags(MyGlb.OBJ_FIELD, PFL_BLOB_FASE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BLOB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BLOB_SESSIONE, "40DF4B6A-C8A0-4EC8-823B-BCBAE578AF37");
    PAN_BLOB.set_Header(MyGlb.OBJ_FIELD, PFL_BLOB_SESSIONE, "SESSIONE");
    PAN_BLOB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BLOB_SESSIONE, "");
    PAN_BLOB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BLOB_SESSIONE, MyGlb.VIS_NONNULLAFIEL);
    PAN_BLOB.SetFlags(MyGlb.OBJ_FIELD, PFL_BLOB_SESSIONE, 0, -1);
    PAN_BLOB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BLOB_PROGRESSIVO, "E7E71C34-EF5D-4E66-B758-420BFDC47B03");
    PAN_BLOB.set_Header(MyGlb.OBJ_FIELD, PFL_BLOB_PROGRESSIVO, "PROGRESSIVO");
    PAN_BLOB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BLOB_PROGRESSIVO, "");
    PAN_BLOB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BLOB_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BLOB.SetFlags(MyGlb.OBJ_FIELD, PFL_BLOB_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_BLOB_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BLOB.SetRect(MyGlb.OBJ_FIELD, PFL_BLOB_FILEDATI, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BLOB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BLOB_FILEDATI, MyGlb.PANEL_LIST, 68);
    PAN_BLOB.SetNumRow(MyGlb.OBJ_FIELD, PFL_BLOB_FILEDATI, MyGlb.PANEL_LIST, 2);
    PAN_BLOB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BLOB_FILEDATI, MyGlb.PANEL_LIST, "File");
    PAN_BLOB.SetRect(MyGlb.OBJ_FIELD, PFL_BLOB_FILEDATI, MyGlb.PANEL_FORM, 8, 4, 516, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BLOB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BLOB_FILEDATI, MyGlb.PANEL_FORM, 68);
    PAN_BLOB.SetNumRow(MyGlb.OBJ_FIELD, PFL_BLOB_FILEDATI, MyGlb.PANEL_FORM, 3);
    PAN_BLOB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BLOB_FILEDATI, MyGlb.PANEL_FORM, "File");
    PAN_BLOB.SetFieldPage(PFL_BLOB_FILEDATI, -1, -1);
    PAN_BLOB.SetFieldPanel(PFL_BLOB_FILEDATI, PPQRY_WORKEXPORTI1, "A.FILE_DATI", "FILE_DATI", 10, 9999, 0, -13997);
    PAN_BLOB.SetRect(MyGlb.OBJ_FIELD, PFL_BLOB_FASE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BLOB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BLOB_FASE, MyGlb.PANEL_LIST, 36);
    PAN_BLOB.SetNumRow(MyGlb.OBJ_FIELD, PFL_BLOB_FASE, MyGlb.PANEL_LIST, 1);
    PAN_BLOB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BLOB_FASE, MyGlb.PANEL_LIST, "FASE");
    PAN_BLOB.SetRect(MyGlb.OBJ_FIELD, PFL_BLOB_FASE, MyGlb.PANEL_FORM, 4, 52, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BLOB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BLOB_FASE, MyGlb.PANEL_FORM, 36);
    PAN_BLOB.SetNumRow(MyGlb.OBJ_FIELD, PFL_BLOB_FASE, MyGlb.PANEL_FORM, 1);
    PAN_BLOB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BLOB_FASE, MyGlb.PANEL_FORM, "FASE");
    PAN_BLOB.SetFieldPage(PFL_BLOB_FASE, -1, -1);
    PAN_BLOB.SetFieldPanel(PFL_BLOB_FASE, PPQRY_WORKEXPORTI1, "A.FASE", "FASE", 5, 10, 0, -13997);
    PAN_BLOB.SetRect(MyGlb.OBJ_FIELD, PFL_BLOB_SESSIONE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BLOB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BLOB_SESSIONE, MyGlb.PANEL_LIST, 64);
    PAN_BLOB.SetNumRow(MyGlb.OBJ_FIELD, PFL_BLOB_SESSIONE, MyGlb.PANEL_LIST, 1);
    PAN_BLOB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BLOB_SESSIONE, MyGlb.PANEL_LIST, "SESSIONE");
    PAN_BLOB.SetRect(MyGlb.OBJ_FIELD, PFL_BLOB_SESSIONE, MyGlb.PANEL_FORM, 4, 76, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BLOB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BLOB_SESSIONE, MyGlb.PANEL_FORM, 64);
    PAN_BLOB.SetNumRow(MyGlb.OBJ_FIELD, PFL_BLOB_SESSIONE, MyGlb.PANEL_FORM, 1);
    PAN_BLOB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BLOB_SESSIONE, MyGlb.PANEL_FORM, "SESSIONE");
    PAN_BLOB.SetFieldPage(PFL_BLOB_SESSIONE, -1, -1);
    PAN_BLOB.SetFieldPanel(PFL_BLOB_SESSIONE, PPQRY_WORKEXPORTI1, "A.SESSIONE", "SESSIONE", 3, 10, 0, -13997);
    PAN_BLOB.SetRect(MyGlb.OBJ_FIELD, PFL_BLOB_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BLOB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BLOB_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_BLOB.SetNumRow(MyGlb.OBJ_FIELD, PFL_BLOB_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_BLOB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BLOB_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_BLOB.SetRect(MyGlb.OBJ_FIELD, PFL_BLOB_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BLOB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BLOB_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_BLOB.SetNumRow(MyGlb.OBJ_FIELD, PFL_BLOB_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_BLOB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BLOB_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_BLOB.SetFieldPage(PFL_BLOB_PROGRESSIVO, -1, -1);
    PAN_BLOB.SetFieldPanel(PFL_BLOB_PROGRESSIVO, PPQRY_WORKEXPORTI1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
  }

  private void PAN_BLOB_InitQueries()
  {
    StringBuffer SQL;

    PAN_BLOB.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_BLOB.SetIMDB(IMDB, "PQRY_WORKEXPORTI1", true);
    PAN_BLOB.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FILE_DATI as FILE_DATI, ");
    SQL.append("  A.FASE as FASE, ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO ");
    PAN_BLOB.SetQuery(PPQRY_WORKEXPORTI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WORK_EXPORT_ID A ");
    PAN_BLOB.SetQuery(PPQRY_WORKEXPORTI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO = ~~TBL_PARAMEIMPORT.NOMEOGGEPROG~~) ");
    PAN_BLOB.SetQuery(PPQRY_WORKEXPORTI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BLOB.SetQuery(PPQRY_WORKEXPORTI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BLOB.SetQuery(PPQRY_WORKEXPORTI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BLOB.SetQuery(PPQRY_WORKEXPORTI1, 5, SQL, -1, "");
    PAN_BLOB.SetQueryDB(PPQRY_WORKEXPORTI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BLOB.SetMasterTable(0, "WORK_EXPORT_ID");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BLOB.Status() == 2)
    {
      int oldListQBE = PAN_BLOB.iUseListQBE;
      PAN_BLOB.iUseListQBE = 0;
      PAN_BLOB.PanelCommand(Glb.PCM_SEARCH);
      PAN_BLOB.PanelCommand(Glb.PCM_FIND);
      PAN_BLOB.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMEIMPORT) PAN_PARAMEIMPORT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_BLOB) PAN_BLOB_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMEIMPORT) PAN_PARAMEIMPORT_ValidateRow(Cancel);
    if (SrcObj == PAN_BLOB) PAN_BLOB_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMEIMPORT) PAN_PARAMEIMPORT_DynamicProperties();
    if (SrcObj == PAN_BLOB) PAN_BLOB_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMEIMPORT) PAN_PARAMEIMPORT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_BLOB) PAN_BLOB_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_BLOB) PAN_BLOB_AfterBlobUpdate(Column, Size, Extension);
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
    if (SrcObj == PAN_PARAMEIMPORT) PAN_PARAMEIMPORT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_BLOB) PAN_BLOB_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
