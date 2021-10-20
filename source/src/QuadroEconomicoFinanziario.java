// **********************************************
// Quadro Economico Finanziario
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class QuadroEconomicoFinanziario extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_QUADECONOPER_OPERA = 0;
  private static int PFL_QUADECONOPER_VOCETECNICA = 1;
  private static int PFL_QUADECONOPER_VOCTECOPEDES = 2;
  private static int PFL_QUADECONOPER_FINANZIAMENT = 3;
  private static int PFL_QUADECONOPER_FINANZDESCRI = 4;
  private static int PFL_QUADECONOPER_IMPORTO = 5;
  private static int PFL_QUADECONOPER_CRONOPROGRID = 6;
  private static int PFL_QUADECONOPER_ETICVOCITECN = 7;
  private static int PFL_QUADECONOPER_ETICHEFINANZ = 8;
  private static int PFL_QUADECONOPER_ETICHETOTALE = 9;
  private static int PFL_QUADECONOPER_ETICHETOTAL1 = 10;

  private static int PPQRY_QUADECONOPER = 0;

  private static int PPQRY_VOCITECNOPER = 1;
  private static int PPQRY_FINANZIAMENT = 2;


  IDPanel PAN_QUADECONOPER;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS61(IMDB);
    //
    //
    Init_PQRY_QUADECONOPER(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS61(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS61, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS61, "TBL_PARS61");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS61,IMDBDef3.FLD_PARS61_NOMEOGGCROID, "NOMEOGGCROID");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS61,IMDBDef3.FLD_PARS61_NOMEOGGCROID,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS61,IMDBDef3.FLD_PARS61_NOMEOGGEOPER, "NOMEOGGEOPER");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS61,IMDBDef3.FLD_PARS61_NOMEOGGEOPER,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS61,IMDBDef3.FLD_PARS61_NOMEOGGETFIN, "NOMEOGGETFIN");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS61,IMDBDef3.FLD_PARS61_NOMEOGGETFIN,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS61, 0);
  }

  private static void Init_PQRY_QUADECONOPER(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_QUADECONOPER, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_QUADECONOPER, "PQRY_QUADECONOPER");
    IMDB.set_FldCode(IMDBDef11.PQRY_QUADECONOPER,IMDBDef11.PQSL_QUADECONOPER_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef11.PQRY_QUADECONOPER,IMDBDef11.PQSL_QUADECONOPER_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_QUADECONOPER,IMDBDef11.PQSL_QUADECONOPER_VOCE_TECNICA, "VOCE_TECNICA");
    IMDB.SetFldParams(IMDBDef11.PQRY_QUADECONOPER,IMDBDef11.PQSL_QUADECONOPER_VOCE_TECNICA,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_QUADECONOPER,IMDBDef11.PQSL_QUADECONOPER_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_QUADECONOPER,IMDBDef11.PQSL_QUADECONOPER_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_QUADECONOPER,IMDBDef11.PQSL_QUADECONOPER_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_QUADECONOPER,IMDBDef11.PQSL_QUADECONOPER_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_QUADECONOPER,IMDBDef11.PQSL_QUADECONOPER_CRONOPROGRAMMA_ID, "CRONOPROGRAMMA_ID");
    IMDB.SetFldParams(IMDBDef11.PQRY_QUADECONOPER,IMDBDef11.PQSL_QUADECONOPER_CRONOPROGRAMMA_ID,3,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_QUADECONOPER, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public QuadroEconomicoFinanziario(MyWebEntryPoint w, IMDBObj imdb)
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
  public QuadroEconomicoFinanziario()
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
    FormIdx = MyGlb.FRM_QUADECONFINA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "058968D3-9D88-4988-A4D8-E3E12716E225";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 792;
    DesignHeight = 406;
    set_Caption(new IDVariant("Quadro Economico Finanziario"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 792;
    Frames[1].Height = 380;
    Frames[1].Caption = "Quadro Economico Finanziario";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 380;
    PAN_QUADECONOPER = new IDPanel(w, this, 1, "PAN_QUADECONOPER");
    Frames[1].Content = PAN_QUADECONOPER;
    PAN_QUADECONOPER.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_QUADECONOPER.VS = MainFrm.VisualStyleList;
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 792-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_QUADECONOPER.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DEAA06BE-93D8-4217-915B-892CC5190BE7");
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 736, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_QUADECONOPER.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_QUADECONOPER.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_QUADECONOPER.InitStatus = 2;
    PAN_QUADECONOPER_Init();
    PAN_QUADECONOPER_InitFields();
    PAN_QUADECONOPER_InitQueries();
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
      PAN_QUADECONOPER.UpdatePanel(MainFrm);
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
    return (obj instanceof QuadroEconomicoFinanziario);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? QuadroEconomicoFinanziario.class.getName() : (Glb.ClassWithPackage(QuadroEconomicoFinanziario.class) ? QuadroEconomicoFinanziario.class.getName().substring(QuadroEconomicoFinanziario.class.getPackage().getName().length() + 1) : QuadroEconomicoFinanziario.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // QUADRO ECON OPERA On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_QUADECONOPER_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // QUADRO ECON OPERA On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_QUADECONOPER_VOCETECNICA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_QUADECONOPER, IMDBDef11.PQSL_QUADECONOPER_VOCE_TECNICA, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  VOCI_TECNICHE_OPERE A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_QUADECONOPER, IMDBDef11.PQSL_QUADECONOPER_VOCE_TECNICA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Voce tecnica inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_QUADECONOPER, IMDBDef11.PQSL_QUADECONOPER_VOCE_TECNICA, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_QUADECONOPER_FINANZIAMENT)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_QUADECONOPER, IMDBDef11.PQSL_QUADECONOPER_FINANZIAMENTO, 0),(new IDVariant(-1))).compareTo((new IDVariant(-1)), true)!=0)
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          if (!(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARS61, IMDBDef3.FLD_PARS61_NOMEOGGCROID, 0))))
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  TESTATE_CRONOPROGRAMMI A, ");
            SQL.append("  IMPUTAZIONI_CRONOPROGRAMMI B, ");
            SQL.append("  PIANI_CRONOPROGRAMMI C ");
            SQL.append("where A.CRONOPROGRAMMA_ID = B.CRONOPROGRAMMA_ID ");
            SQL.append("and   B.CRONOPROGRAMMA_ID = C.CRONOPROGRAMMA_ID ");
            SQL.append("and   B.PROGRESSIVO_IMPUTAZIONE = C.PROGRESSIVO_IMPUTAZIONE ");
            SQL.append("and   (A.CRONOPROGRAMMA_ID = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARS61, IMDBDef3.FLD_PARS61_NOMEOGGCROID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (C.FINANZIAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_QUADECONOPER, IMDBDef11.PQSL_QUADECONOPER_FINANZIAMENTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
          }
          else
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  FINANZIAMENTI A ");
            SQL.append("where (NVL(A.SCADENZA, 9999) >= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
          }
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Finanziamento inesistente o non collegato ad un piano del cronoprogramma"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_QUADECONOPER, IMDBDef11.PQSL_QUADECONOPER_FINANZIAMENTO, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_QUADECONOPER_IMPORTO)), true) && FieldWasModified.booleanValue())
      {
        Settatot();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroEconomicoFinanziario", "QUADROECONOPERAOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // QUADRO ECON OPERA Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_QUADECONOPER_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // QUADRO ECON OPERA Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef11.PQRY_QUADECONOPER, IMDBDef11.PQSL_QUADECONOPER_CRONOPROGRAMMA_ID, 0, new IDVariant(IMDB.Value(IMDBDef3.TBL_PARS61, IMDBDef3.FLD_PARS61_NOMEOGGCROID, 0),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef11.PQRY_QUADECONOPER, IMDBDef11.PQSL_QUADECONOPER_OPERA, 0, IMDB.Value(IMDBDef3.TBL_PARS61, IMDBDef3.FLD_PARS61_NOMEOGGEOPER, 0));
      if (IMDB.Value(IMDBDef3.TBL_PARS61, IMDBDef3.FLD_PARS61_NOMEOGGETFIN, 0).equals((new IDVariant("NO")), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_QUADECONOPER, IMDBDef11.PQSL_QUADECONOPER_FINANZIAMENTO, 0, (new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroEconomicoFinanziario", "QUADROECONOPERABeforeInsert", _e);
    }
  }

  // **********************************************************************
  // QUADRO ECON OPERA After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_QUADECONOPER_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // QUADRO ECON OPERA After Find Body
      // Corpo Procedura
      // 
      Settatot();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroEconomicoFinanziario", "QUADROECONOPERAAfterFind", _e);
    }
  }

  // **********************************************************************
  // QUADRO ECON OPERA After Delete
  // Evento notificato dopo la cancellazione della riga
  // dal database.
  // **********************************************************************
  private void PAN_QUADECONOPER_AfterDelete()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // QUADRO ECON OPERA After Delete Body
      // Corpo Procedura
      // 
      PAN_QUADECONOPER.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroEconomicoFinanziario", "QUADROECONOPERAAfterDelete", _e);
    }
  }

  // **********************************************************************
  // QUADRO ECON OPERA After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_QUADECONOPER_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // QUADRO ECON OPERA After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true) && RowsUpdated.compareTo((new IDVariant(0)), true)>0)
      {
        PAN_QUADECONOPER.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroEconomicoFinanziario", "QUADROECONOPERAAfterCommit", _e);
    }
  }

  // **********************************************************************
  // VOCE TECNICA
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int VOCETECNICA ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // VOCE TECNICA Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_VOCITECNOPER, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_VOCITECNOPER,(new IDVariant(0)).booleanValue()); 
      }
      IMDB.set_Value(IMDBDef1.TBL_PAR118, IMDBDef1.FLD_PAR118_NOMEOGGELOOK, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_VOCITECNOPER, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroEconomicoFinanziario", "VOCETECNICA", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Finanziamento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Finanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamento Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARS61, IMDBDef3.FLD_PARS61_NOMEOGGCROID, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_IMDB2, IMDBDef1.FLD_IMDB2_NOMEOGGCROID, 0, IMDB.Value(IMDBDef3.TBL_PARS61, IMDBDef3.FLD_PARS61_NOMEOGGCROID, 0));
        MainFrm.Show(MyGlb.FRM_SCEFINPIACRO, (new IDVariant(1)).intValue(), this); 
      }
      else
      {
        MainFrm.Show(MyGlb.FRM_ELENCOFINANZ, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroEconomicoFinanziario", "Finanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_VOCITECNOPER)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_QUADECONOPER, IMDBDef11.PQSL_QUADECONOPER_VOCE_TECNICA, 0, IMDB.Value(IMDBDef9.PQRY_VOCITECNOPER, IMDBDef9.PQSL_VOCITECNOPER_CODICE, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEFINPIACRO)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_QUADECONOPER, IMDBDef11.PQSL_QUADECONOPER_FINANZIAMENTO, 0, IMDB.Value(IMDBDef8.PQRY_TESTATCRONO3, IMDBDef8.PQSL_TESTATCRONO3_RECPIACROFIN, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_ELENCOFINANZ)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_QUADECONOPER, IMDBDef11.PQSL_QUADECONOPER_FINANZIAMENTO, 0, IMDB.Value(IMDBDef7.PQRY_FINANZIAME24, IMDBDef7.PQSL_FINANZIAME24_FINANZCODICE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroEconomicoFinanziario", "EndModal", _e);
    }
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
      if (IDL.NullValue(MainFrm.VOCETECNOPER,(new IDVariant("ZZZZ"))).compareTo((new IDVariant("FINA")), true)!=0)
      {
        PAN_QUADECONOPER.SetFlags (Glb.OBJ_FIELD, PFL_QUADECONOPER_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_QUADECONOPER.SetFlags (Glb.OBJ_FIELD, PFL_QUADECONOPER_FINANZDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_QUADECONOPER.SetFlags (Glb.OBJ_FIELD, PFL_QUADECONOPER_ETICHEFINANZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_QUADECONOPER.set_ObjRect(Glb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTAL1, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_QUADECONOPER.ObjRect(Glb.OBJ_FIELD, PFL_QUADECONOPER_VOCTECOPEDES, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_QUADECONOPER.set_ObjRect(Glb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTALE, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_QUADECONOPER.ObjRect(Glb.OBJ_FIELD, PFL_QUADECONOPER_IMPORTO, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        IMDB.set_Value(IMDBDef3.TBL_PARS61, IMDBDef3.FLD_PARS61_NOMEOGGETFIN, 0, (new IDVariant("NO")));
      }
      else
      {
        IMDB.set_Value(IMDBDef3.TBL_PARS61, IMDBDef3.FLD_PARS61_NOMEOGGETFIN, 0, (new IDVariant("SI")));
      }
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroEconomicoFinanziario", "Load", _e);
    }
  }

  // **********************************************************************
  // Settatot
  // **********************************************************************
  public int Settatot ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Settatot Body
      // Corpo Procedura
      // 
      PAN_QUADECONOPER.set_FieldText(PFL_QUADECONOPER_ETICHETOTALE, IDL.Format(PAN_QUADECONOPER.GetFieldSum(PFL_QUADECONOPER_IMPORTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroEconomicoFinanziario", "Settatot", _e);
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
  private void PAN_QUADECONOPER_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_QUADECONOPER, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_QUADECONOPER_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_QUADECONOPER, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_QUADECONOPER_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_QUADECONOPER);
    // Stub
  }

  private void PAN_QUADECONOPER_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_QUADECONOPER_VOCETECNICA)
    {
      this.IdxPanelActived = this.PAN_QUADECONOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      VOCETECNICA();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_QUADECONOPER_FINANZIAMENT)
    {
      this.IdxPanelActived = this.PAN_QUADECONOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Finanziamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_QUADECONOPER_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_QUADECONOPER_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_QUADECONOPER_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_QUADECONOPER_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_QUADECONOPER_Init()
  {

    PAN_QUADECONOPER.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_QUADECONOPER.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_QUADECONOPER.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_QUADECONOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_OPERA, "14EDE482-4099-43AC-92FA-E2E7EA89C88B");
    PAN_QUADECONOPER.set_Header(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_OPERA, "OPERA");
    PAN_QUADECONOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_OPERA, "");
    PAN_QUADECONOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_OPERA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_QUADECONOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_OPERA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_QUADECONOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCETECNICA, "292E9039-1229-4498-B627-087BE5DB227D");
    PAN_QUADECONOPER.set_Header(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCETECNICA, "VOCE TECNICA");
    PAN_QUADECONOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCETECNICA, "");
    PAN_QUADECONOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCETECNICA, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADECONOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCETECNICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISKEY, -1);
    PAN_QUADECONOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCTECOPEDES, "A167118E-1311-4353-A949-32D4D78D149B");
    PAN_QUADECONOPER.set_Header(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCTECOPEDES, "VOCI TECNICHE OPERE DESCRIZIONE");
    PAN_QUADECONOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCTECOPEDES, "");
    PAN_QUADECONOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCTECOPEDES, MyGlb.VIS_VISULOOUPCF4);
    PAN_QUADECONOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCTECOPEDES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_QUADECONOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZIAMENT, "BF565582-2F64-45D4-9CFF-59CEAF8DE167");
    PAN_QUADECONOPER.set_Header(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZIAMENT, "Finanziamento");
    PAN_QUADECONOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZIAMENT, "");
    PAN_QUADECONOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADECONOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADECONOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZDESCRI, "ADEC4878-C5E1-4E4E-BBD2-7D075F0FE941");
    PAN_QUADECONOPER.set_Header(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZDESCRI, " ");
    PAN_QUADECONOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZDESCRI, "");
    PAN_QUADECONOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_QUADECONOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_QUADECONOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_IMPORTO, "FCBC55B6-543A-4E37-B877-D6106EFECBD1");
    PAN_QUADECONOPER.set_Header(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_IMPORTO, "Importo");
    PAN_QUADECONOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_IMPORTO, "");
    PAN_QUADECONOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADECONOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_QUADECONOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_CRONOPROGRID, "AEC580DD-430E-4D79-8F4A-C8F1D0808353");
    PAN_QUADECONOPER.set_Header(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_CRONOPROGRID, "CRONOPROGRAMMA ID");
    PAN_QUADECONOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_CRONOPROGRID, "");
    PAN_QUADECONOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_CRONOPROGRID, MyGlb.VIS_NORMFIELPADR);
    PAN_QUADECONOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_CRONOPROGRID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_QUADECONOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICVOCITECN, "181C1791-2477-4357-8992-B0BC12263735");
    PAN_QUADECONOPER.set_Header(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICVOCITECN, "Voci Tecniche");
    PAN_QUADECONOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICVOCITECN, MyGlb.VIS_LABEVISUSTYL);
    PAN_QUADECONOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICVOCITECN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_QUADECONOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHEFINANZ, "B4F5C1F6-E34D-4C6B-BA6C-3F43831731ED");
    PAN_QUADECONOPER.set_Header(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHEFINANZ, "Finanziamento");
    PAN_QUADECONOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHEFINANZ, MyGlb.VIS_LABEVISUSTYL);
    PAN_QUADECONOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHEFINANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_QUADECONOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTALE, "99C22844-94B1-4D09-BC2A-88753B9DFB23");
    PAN_QUADECONOPER.set_Header(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTALE, "");
    PAN_QUADECONOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTALE, MyGlb.VIS_CAMPTOTADISA);
    PAN_QUADECONOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_QUADECONOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTAL1, "4122290F-665C-4CB3-8974-4B2F50AAA631");
    PAN_QUADECONOPER.set_Header(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTAL1, "Totale");
    PAN_QUADECONOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTAL1, MyGlb.VIS_VUOTONORMALE);
    PAN_QUADECONOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTAL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_QUADECONOPER_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_OPERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_OPERA, MyGlb.PANEL_LIST, 48);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_QUADECONOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_OPERA, MyGlb.PANEL_LIST, "OPERA");
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_OPERA, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_OPERA, MyGlb.PANEL_FORM, 152);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_QUADECONOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_OPERA, MyGlb.PANEL_FORM, "OPERA");
    PAN_QUADECONOPER.SetFieldPage(PFL_QUADECONOPER_OPERA, -1, -1);
    PAN_QUADECONOPER.SetFieldPanel(PFL_QUADECONOPER_OPERA, PPQRY_QUADECONOPER, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCETECNICA, MyGlb.PANEL_LIST, 0, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCETECNICA, MyGlb.PANEL_LIST, 88);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCETECNICA, MyGlb.PANEL_LIST, 1);
    PAN_QUADECONOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCETECNICA, MyGlb.PANEL_LIST, "VC. TECN.");
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCETECNICA, MyGlb.PANEL_FORM, 4, 28, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCETECNICA, MyGlb.PANEL_FORM, 152);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCETECNICA, MyGlb.PANEL_FORM, 1);
    PAN_QUADECONOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCETECNICA, MyGlb.PANEL_FORM, "VOCE TECNICA");
    PAN_QUADECONOPER.SetFieldPage(PFL_QUADECONOPER_VOCETECNICA, -1, -1);
    PAN_QUADECONOPER.SetFieldPanel(PFL_QUADECONOPER_VOCETECNICA, PPQRY_QUADECONOPER, "A.VOCE_TECNICA", "VOCE_TECNICA", 1, 2, 0, -13997);
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCTECOPEDES, MyGlb.PANEL_LIST, 36, 36, 252, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCTECOPEDES, MyGlb.PANEL_LIST, 208);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCTECOPEDES, MyGlb.PANEL_LIST, 1);
    PAN_QUADECONOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCTECOPEDES, MyGlb.PANEL_LIST, "VOCI TECNICHE OPERE DESCRIZIONE");
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCTECOPEDES, MyGlb.PANEL_FORM, 4, 100, 716, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCTECOPEDES, MyGlb.PANEL_FORM, 208);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCTECOPEDES, MyGlb.PANEL_FORM, 2);
    PAN_QUADECONOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_VOCTECOPEDES, MyGlb.PANEL_FORM, "VOCI TECNICHE OPERE DESCRIZIONE");
    PAN_QUADECONOPER.SetFieldPage(PFL_QUADECONOPER_VOCTECOPEDES, -1, -1);
    PAN_QUADECONOPER.SetFieldPanel(PFL_QUADECONOPER_VOCTECOPEDES, PPQRY_VOCITECNOPER, "A.DESCRIZIONE", "VOCTECOPEDES", 5, 200, 0, -13997);
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZIAMENT, MyGlb.PANEL_LIST, 288, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_QUADECONOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanz.");
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 52, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZIAMENT, MyGlb.PANEL_FORM, 152);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_QUADECONOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_QUADECONOPER.SetFieldPage(PFL_QUADECONOPER_FINANZIAMENT, -1, -1);
    PAN_QUADECONOPER.SetFieldPanel(PFL_QUADECONOPER_FINANZIAMENT, PPQRY_QUADECONOPER, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZDESCRI, MyGlb.PANEL_LIST, 340, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZDESCRI, MyGlb.PANEL_LIST, 176);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_QUADECONOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZDESCRI, MyGlb.PANEL_LIST, " ");
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZDESCRI, MyGlb.PANEL_FORM, 4, 136, 684, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZDESCRI, MyGlb.PANEL_FORM, 176);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZDESCRI, MyGlb.PANEL_FORM, 2);
    PAN_QUADECONOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_FINANZDESCRI, MyGlb.PANEL_FORM, " ");
    PAN_QUADECONOPER.SetFieldPage(PFL_QUADECONOPER_FINANZDESCRI, -1, -1);
    PAN_QUADECONOPER.SetFieldPanel(PFL_QUADECONOPER_FINANZDESCRI, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_IMPORTO, MyGlb.PANEL_LIST, 600, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_QUADECONOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_IMPORTO, MyGlb.PANEL_FORM, 4, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_IMPORTO, MyGlb.PANEL_FORM, 152);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_QUADECONOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_QUADECONOPER.SetFieldPage(PFL_QUADECONOPER_IMPORTO, -1, -1);
    PAN_QUADECONOPER.SetFieldPanel(PFL_QUADECONOPER_IMPORTO, PPQRY_QUADECONOPER, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_CRONOPROGRID, MyGlb.PANEL_LIST, 264, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_CRONOPROGRID, MyGlb.PANEL_LIST, 140);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_CRONOPROGRID, MyGlb.PANEL_LIST, 1);
    PAN_QUADECONOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_CRONOPROGRID, MyGlb.PANEL_LIST, "CRON. ID");
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_CRONOPROGRID, MyGlb.PANEL_FORM, 4, 100, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_CRONOPROGRID, MyGlb.PANEL_FORM, 152);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_CRONOPROGRID, MyGlb.PANEL_FORM, 1);
    PAN_QUADECONOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_CRONOPROGRID, MyGlb.PANEL_FORM, "CRONOPROGRAMMA ID");
    PAN_QUADECONOPER.SetFieldPage(PFL_QUADECONOPER_CRONOPROGRID, -1, -1);
    PAN_QUADECONOPER.SetFieldPanel(PFL_QUADECONOPER_CRONOPROGRID, PPQRY_QUADECONOPER, "A.CRONOPROGRAMMA_ID", "CRONOPROGRAMMA_ID", 3, 10, 0, -13997);
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICVOCITECN, MyGlb.PANEL_LIST, 0, 0, 288, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICVOCITECN, MyGlb.PANEL_LIST, 0);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICVOCITECN, MyGlb.PANEL_LIST, 2);
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICVOCITECN, MyGlb.PANEL_FORM, 4, 260, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICVOCITECN, MyGlb.PANEL_FORM, 0);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICVOCITECN, MyGlb.PANEL_FORM, 1);
    PAN_QUADECONOPER.SetFieldPage(PFL_QUADECONOPER_ETICVOCITECN, -1, -1);
    PAN_QUADECONOPER.SetFieldPanel(PFL_QUADECONOPER_ETICVOCITECN, -1, "", "ETICVOCITECN", 0, 0, 0, -13997);
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHEFINANZ, MyGlb.PANEL_LIST, 288, 0, 312, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHEFINANZ, MyGlb.PANEL_LIST, 0);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHEFINANZ, MyGlb.PANEL_LIST, 2);
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHEFINANZ, MyGlb.PANEL_FORM, 288, 252, 300, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHEFINANZ, MyGlb.PANEL_FORM, 0);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHEFINANZ, MyGlb.PANEL_FORM, 1);
    PAN_QUADECONOPER.SetFieldPage(PFL_QUADECONOPER_ETICHEFINANZ, -1, -1);
    PAN_QUADECONOPER.SetFieldPanel(PFL_QUADECONOPER_ETICHEFINANZ, -1, "", "ETICHEFINANZ", 0, 0, 0, -13997);
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTALE, MyGlb.PANEL_LIST, 600, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTALE, MyGlb.PANEL_LIST, 0);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTALE, MyGlb.PANEL_LIST, 1);
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTALE, MyGlb.PANEL_FORM, 600, 240, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTALE, MyGlb.PANEL_FORM, 0);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTALE, MyGlb.PANEL_FORM, 1);
    PAN_QUADECONOPER.SetFieldPage(PFL_QUADECONOPER_ETICHETOTALE, -1, -1);
    PAN_QUADECONOPER.SetFieldPanel(PFL_QUADECONOPER_ETICHETOTALE, -1, "", "ETICHETOTALE", 0, 0, 0, -13997);
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTAL1, MyGlb.PANEL_LIST, 344, 240, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTAL1, MyGlb.PANEL_LIST, 0);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTAL1, MyGlb.PANEL_LIST, 1);
    PAN_QUADECONOPER.SetRect(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTAL1, MyGlb.PANEL_FORM, 528, 244, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADECONOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTAL1, MyGlb.PANEL_FORM, 0);
    PAN_QUADECONOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADECONOPER_ETICHETOTAL1, MyGlb.PANEL_FORM, 1);
    PAN_QUADECONOPER.SetFieldPage(PFL_QUADECONOPER_ETICHETOTAL1, -1, -1);
    PAN_QUADECONOPER.SetFieldPanel(PFL_QUADECONOPER_ETICHETOTAL1, -1, "", "ETICHETOTAL1", 0, 0, 0, -13997);
  }

  private void PAN_QUADECONOPER_InitQueries()
  {
    StringBuffer SQL;

    PAN_QUADECONOPER.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VOCTECOPEDES ");
    SQL.append("from ");
    SQL.append("  VOCI_TECNICHE_OPERE A ");
    SQL.append("where (A.CODICE = ~~VOCE_TECNICA~~) ");
    PAN_QUADECONOPER.SetQuery(PPQRY_VOCITECNOPER, 0, SQL, -1, "");
    PAN_QUADECONOPER.SetQueryDB(PPQRY_VOCITECNOPER, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUADECONOPER.SetMasterTable(PPQRY_VOCITECNOPER, "VOCI_TECNICHE_OPERE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~FINANZIAMENTO~~) ");
    PAN_QUADECONOPER.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_QUADECONOPER.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUADECONOPER.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    PAN_QUADECONOPER.SetIMDB(IMDB, "PQRY_QUADECONOPER", true);
    PAN_QUADECONOPER.set_SetString(MyGlb.MASTER_ROWNAME, "QUADRO ECON OPERA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.VOCE_TECNICA as VOCE_TECNICA, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.CRONOPROGRAMMA_ID as CRONOPROGRAMMA_ID ");
    PAN_QUADECONOPER.SetQuery(PPQRY_QUADECONOPER, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  QUADRO_ECON_OPERA A ");
    PAN_QUADECONOPER.SetQuery(PPQRY_QUADECONOPER, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (NVL(A.CRONOPROGRAMMA_ID, -1) = NVL(~~TBL_PARS61.NOMEOGGCROID~~, -1)) ");
    SQL.append("and   (A.OPERA = NVL(~~TBL_PARS61.NOMEOGGEOPER~~, A.OPERA)) ");
    PAN_QUADECONOPER.SetQuery(PPQRY_QUADECONOPER, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUADECONOPER.SetQuery(PPQRY_QUADECONOPER, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUADECONOPER.SetQuery(PPQRY_QUADECONOPER, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.VOCE_TECNICA ");
    PAN_QUADECONOPER.SetQuery(PPQRY_QUADECONOPER, 5, SQL, -1, "");
    PAN_QUADECONOPER.SetQueryDB(PPQRY_QUADECONOPER, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUADECONOPER.SetMasterTable(0, "QUADRO_ECON_OPERA");
    PAN_QUADECONOPER.AddToSortList(PFL_QUADECONOPER_VOCETECNICA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_QUADECONOPER.Status() == 2)
    {
      int oldListQBE = PAN_QUADECONOPER.iUseListQBE;
      PAN_QUADECONOPER.iUseListQBE = 0;
      PAN_QUADECONOPER.PanelCommand(Glb.PCM_SEARCH);
      PAN_QUADECONOPER.PanelCommand(Glb.PCM_FIND);
      PAN_QUADECONOPER.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_QUADECONOPER) PAN_QUADECONOPER_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_QUADECONOPER) PAN_QUADECONOPER_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_QUADECONOPER) PAN_QUADECONOPER_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_QUADECONOPER) PAN_QUADECONOPER_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_QUADECONOPER) PAN_QUADECONOPER_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_QUADECONOPER) PAN_QUADECONOPER_AfterDelete();
  }    

  public void AfterFind(IDPanel SrcObj, IDVariant CmdFind)
  {
    if (SrcObj == PAN_QUADECONOPER) PAN_QUADECONOPER_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_QUADECONOPER) PAN_QUADECONOPER_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_QUADECONOPER) PAN_QUADECONOPER_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
