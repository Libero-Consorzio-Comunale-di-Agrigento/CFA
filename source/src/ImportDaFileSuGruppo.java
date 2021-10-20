// **********************************************
// Import Da File Su Gruppo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ImportDaFileSuGruppo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_ETICHEINTEST = 0;
  private static int PFL_PARAMETRI_FILEDAIMPORT = 1;
  private static int PFL_PARAMETRI_IMPORTA = 2;

  private static int PPQRY_PARAMETRI625 = 0;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI643(IMDB);
    //
    //
    Init_PQRY_PARAMETRI625(IMDB);
    Init_PQRY_PARAMETRI625_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI643(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI643, 7);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI643, "TBL_PARAMETRI643");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI643,IMDBDef5.FLD_PARAMETRI643_PARAFILDAIMP, "PARAFILDAIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI643,IMDBDef5.FLD_PARAMETRI643_PARAFILDAIMP,10,50000,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI643,IMDBDef5.FLD_PARAMETRI643_PARABLOBINSE, "PARABLOBINSE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI643,IMDBDef5.FLD_PARAMETRI643_PARABLOBINSE,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI643,IMDBDef5.FLD_PARAMETRI643_PARAPERCFILE, "PARAPERCFILE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI643,IMDBDef5.FLD_PARAMETRI643_PARAPERCFILE,9,512,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI643,IMDBDef5.FLD_PARAMETRI643_PARAMGRUPPO, "PARAMGRUPPO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI643,IMDBDef5.FLD_PARAMETRI643_PARAMGRUPPO,1,3,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI643,IMDBDef5.FLD_PARAMETRI643_PARADESCGRUP, "PARADESCGRUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI643,IMDBDef5.FLD_PARAMETRI643_PARADESCGRUP,5,200,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI643,IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, "PARATIPOMOVI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI643,IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI,5,20,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI643,IMDBDef5.FLD_PARAMETRI643_PARAMFASE, "PARAMFASE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI643,IMDBDef5.FLD_PARAMETRI643_PARAMFASE,5,10,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI643, 0);
  }

  private static void Init_PQRY_PARAMETRI625(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI625, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI625, "PQRY_PARAMETRI625");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI625,IMDBDef14.PQSL_PARAMETRI625_PARAFILDAIMP, "PARAFILDAIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI625,IMDBDef14.PQSL_PARAMETRI625_PARAFILDAIMP,10,50000,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI625, 0);
  }

  private static void Init_PQRY_PARAMETRI625_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI625_RS, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI625_RS, "PQRY_PARAMETRI625_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI625_RS,IMDBDef14.PQSL_PARAMETRI625_PARAFILDAIMP, "PARAFILDAIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI625_RS,IMDBDef14.PQSL_PARAMETRI625_PARAFILDAIMP,10,50000,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ImportDaFileSuGruppo(MyWebEntryPoint w, IMDBObj imdb)
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
  public ImportDaFileSuGruppo()
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
    FormIdx = MyGlb.FRM_IMPDAFILSUGR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6E3405F8-23FF-4E8F-98E7-701CA187B82A";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 708;
    DesignHeight = 270;
    set_Caption(new IDVariant("Import da File su Gruppo "));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 708;
    Frames[1].Height = 244;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 244;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 708-MyGlb.PAN_OFFS_X, 244-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7B277F9C-BA56-43DA-B221-5AAA049F908F");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 260, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI643, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        IMPDAFILSUGR_PARAMETRI625();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    return (obj instanceof ImportDaFileSuGruppo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ImportDaFileSuGruppo.class.getName() : (Glb.ClassWithPackage(ImportDaFileSuGruppo.class) ? ImportDaFileSuGruppo.class.getName().substring(ImportDaFileSuGruppo.class.getPackage().getName().length() + 1) : ImportDaFileSuGruppo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri After BLOB Update
  // Evento notificato dal pannello dopo aver salvato su
  // db il file caricato dall'utente o cancellato il contenuto
  // del blob.
  // Column - Input
  // Size - Input
  // Extension - Input
  // **********************************************************************
  private void PAN_PARAMETRI_AfterBlobUpdate (IDVariant Column, IDVariant Size, IDVariant Extension)
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
      // Parametri After BLOB Update Body
      // Corpo Procedura
      // 
      IDVariant v_NOMEFILE = new IDVariant(0,IDVariant.STRING);
      IDVariant v_CARTELLA = new IDVariant(0,IDVariant.STRING);
      IMDB.TblMoveFirst (IMDBDef14.PQRY_PARAMETRI625_RS, 0);
      while (!IMDB.Eof(IMDBDef14.PQRY_PARAMETRI625_RS, 0))
      {
        v_NOMEFILE = new IDVariant(com.progamma.GUID.DocID2GUID (com.progamma.doc.MDOInit.GetNewDocID().stringValue()));
        v_CARTELLA = (new IDVariant(MainFrm.RealPath));
        v_CARTELLA = IDL.Add(IDL.Add(v_CARTELLA, new IDVariant(System.getProperty("file.separator"))
), (new IDVariant("temp")));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAPERCFILE, 0, Glb.SaveBlob(MainFrm,IMDB.Value(IMDBDef14.PQRY_PARAMETRI625_RS, IMDBDef14.PQSL_PARAMETRI625_PARAFILDAIMP, 0),v_CARTELLA,v_NOMEFILE));
        IMDB.TblMoveNext(IMDBDef14.PQRY_PARAMETRI625_RS, 0);
      }
      if (Size.compareTo((new IDVariant(0)), true)>0)
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARABLOBINSE, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARABLOBINSE, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportDaFileSuGruppo", "ParametriAfterBLOBUpdate", _e);
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportDaFileSuGruppo", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAFILDAIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARABLOBINSE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAPERCFILE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAMGRUPPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARADESCGRUP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAMFASE, 0, new IDVariant());
  }

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
      IDVariant v_GENERAORDINA = new IDVariant(0,IDVariant.STRING);
      set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(this.Caption(), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAMGRUPPO, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARADESCGRUP, 0)), (new IDVariant(" - "))), v_GENERAORDINA));
      PAN_PARAMETRI.SetFieldBlobSize(PFL_PARAMETRI_FILEDAIMPORT, (new IDVariant(0)).intValue(), (new IDVariant(10000000)).intValue(), (new IDVariant(-1)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportDaFileSuGruppo", "Load", _e);
    }
  }

  // **********************************************************************
  // Importa
  // **********************************************************************
  public int Importa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Importa Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARABLOBINSE, 0),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non è stato indicato alcun file da caricare"));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        if (MainFrm.LeggiIlFileEScriviSuExport(IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAPERCFILE, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAMFASE, 0), (new IDVariant(2))))
        {
          IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          // 
          //  
          // 
          MainFrm.Cf4armDBObject.IMPORTMOVIMENTIDAFILEIMPORTFILESUGRUPPI(IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAMGRUPPO, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), MainFrm.PROGRESESSIO);
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
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            if (v_CONTA.compareTo((new IDVariant(0)), true)>0)
            {
              IDVariant v_TITOLO = new IDVariant(0,IDVariant.STRING);
              v_TITOLO = (new IDVariant("Anomalie Import Gruppo "));
              v_TITOLO = IDL.Add(v_TITOLO, (IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, 0).equals((new IDVariant("ACC")))? new IDVariant("Accertamenti") : IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, 0).equals((new IDVariant("IMP")))? new IDVariant("Impegni") : IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, 0).equals((new IDVariant("SUBIMP")))? new IDVariant("Subimpegni") : IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, 0).equals((new IDVariant("ORD")))? new IDVariant("Ordinativi") : IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, 0).equals((new IDVariant("LIQ")))? new IDVariant("Liquidazioni") :  new IDVariant()));
              MainFrm.LanciaErrorReport(v_TITOLO, (new IDVariant()));
            }
          }
          else
          {
            if (v_CONTA.compareTo((new IDVariant(0)), true)>0)
            {
              IDVariant v_TITOLO = new IDVariant(0,IDVariant.STRING);
              v_TITOLO = (new IDVariant("Anomalie Import Gruppo "));
              v_TITOLO = IDL.Add(v_TITOLO, (IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, 0).equals((new IDVariant("ACC")))? new IDVariant("Accertamenti") : IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, 0).equals((new IDVariant("IMP")))? new IDVariant("Impegni") : IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, 0).equals((new IDVariant("SUBIMP")))? new IDVariant("Subimpegni") : IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, 0).equals((new IDVariant("ORD")))? new IDVariant("Ordinativi") : IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, 0).equals((new IDVariant("LIQ")))? new IDVariant("Liquidazioni") :  new IDVariant()));
              MainFrm.LanciaErrorReport(v_TITOLO, (new IDVariant("SI")));
            }
            else
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Elaborazione Eseguita"));
              MainFrm.set_AlertMessage(v_AVVISO); 
            }
          }
          if (MainFrm.TEST.compareTo((new IDVariant("SI")), true)!=0)
          {
            SQL = new StringBuffer();
            SQL.append("delete from WORK_EXPORT_TESO ");
            SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAMFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportDaFileSuGruppo", "Importa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void IMPDAFILSUGR_PARAMETRI625() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI625_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI643, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI643, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI625_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI625_RS, 0, IMDBDef5.TBL_PARAMETRI643, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI625_RS, 0, 0, IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAFILDAIMP, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI643, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI643, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI643, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI625_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_IMPORTA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Importa();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEINTEST, "CB9A69BD-5B52-4B4A-91E2-D2F76BC91F31");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEINTEST, "Selezionare il file da importare. Verranno caricate sul gruppo le sole righe che contengono dati senza anomalie. Le altre righe verranno scartate e sara' mostrato un elenco finale delle anomalie trovate.\nLe righe presenti sul gruppo verranno eliminate e sostituite da quelle importate.");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEINTEST, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEINTEST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FILEDAIMPORT, "6B26EBCE-58FB-42F4-ABDD-C3EEE3C49B79");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FILEDAIMPORT, "File da importare");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FILEDAIMPORT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FILEDAIMPORT, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FILEDAIMPORT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTA, "196BB182-909B-4EA7-83C8-37B107F38319");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTA, "Importa");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEINTEST, MyGlb.PANEL_LIST, 32, 28, 400, 84, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEINTEST, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEINTEST, MyGlb.PANEL_LIST, 6);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEINTEST, MyGlb.PANEL_FORM, 32, 28, 640, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEINTEST, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEINTEST, MyGlb.PANEL_FORM, 3);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHEINTEST, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHEINTEST, -1, "", "ETICHEINTEST", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FILEDAIMPORT, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FILEDAIMPORT, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FILEDAIMPORT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FILEDAIMPORT, MyGlb.PANEL_LIST, "File da importare");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FILEDAIMPORT, MyGlb.PANEL_FORM, 32, 96, 640, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FILEDAIMPORT, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FILEDAIMPORT, MyGlb.PANEL_FORM, 3);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FILEDAIMPORT, MyGlb.PANEL_FORM, "File da importare");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_FILEDAIMPORT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_FILEDAIMPORT, PPQRY_PARAMETRI625, "A.PARAFILDAIMP", "PARAFILDAIMP", 10, 50000, 0, -14061);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTA, MyGlb.PANEL_LIST, 548, 192, 76, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTA, MyGlb.PANEL_FORM, 540, 180, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPORTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPORTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPORTA, -1, "", "IMPORTA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI625", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI625, IMDBDef14.PQRY_PARAMETRI625_RS, IMDBDef5.TBL_PARAMETRI643);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_FILEDAIMPORT, IMDBDef5.FLD_PARAMETRI643_PARAFILDAIMP);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI643");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_AfterBlobUpdate(Column, Size, Extension);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
