// **********************************************
// Pagamenti Mandati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PagamentiMandati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PAGAMENTI_BENEFICIARIO = 0;
  private static int PFL_PAGAMENTI_PAGAMENTO = 1;
  private static int PFL_PAGAMENTI_DATA = 2;
  private static int PFL_PAGAMENTI_NUMERO = 3;
  private static int PFL_PAGAMENTI_QUIETANZA = 4;
  private static int PFL_PAGAMENTI_DATAPAGAMU = 5;
  private static int PFL_PAGAMENTI_PROGRESSIVO = 6;
  private static int PFL_PAGAMENTI_FATNUMERODOC = 7;
  private static int PFL_PAGAMENTI_FATDDATADOC = 8;
  private static int PFL_PAGAMENTI_ANNOMAND = 9;
  private static int PFL_PAGAMENTI_NUMEROMAND = 10;
  private static int PFL_PAGAMENTI_ANNOLIQ = 11;
  private static int PFL_PAGAMENTI_NUMEROLIQ = 12;
  private static int PFL_PAGAMENTI_ESTREMILABEL = 13;
  private static int PFL_PAGAMENTI_IMPORTOLABEL = 14;
  private static int PFL_PAGAMENTI_DOCUMENTO = 15;
  private static int PFL_PAGAMENTI_SOMMPAGALABE = 16;
  private static int PFL_PAGAMENTI_UTENTULTIAGG = 17;
  private static int PFL_PAGAMENTI_DATAULTIMAGG = 18;
  private static int PFL_PAGAMENTI_DOCUMENLABEL = 19;

  private static int PPQRY_PAGAMENTI2 = 0;

  private static int PPQRY_PAGAMENTI1 = 1;


  IDPanel PAN_PAGAMENTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMEPAGAM1(IMDB);
    //
    //
    Init_PQRY_PAGAMENTI2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMEPAGAM1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMEPAGAM1, 5);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMEPAGAM1, "TBL_PARAMEPAGAM1");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMEPAGAM1,IMDBDef5.FLD_PARAMEPAGAM1_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMEPAGAM1,IMDBDef5.FLD_PARAMEPAGAM1_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMEPAGAM1,IMDBDef5.FLD_PARAMEPAGAM1_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMEPAGAM1,IMDBDef5.FLD_PARAMEPAGAM1_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMEPAGAM1,IMDBDef5.FLD_PARAMEPAGAM1_D_DATA_MAND, "D_DATA_MAND");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMEPAGAM1,IMDBDef5.FLD_PARAMEPAGAM1_D_DATA_MAND,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMEPAGAM1,IMDBDef5.FLD_PARAMEPAGAM1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMEPAGAM1,IMDBDef5.FLD_PARAMEPAGAM1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMEPAGAM1,IMDBDef5.FLD_PARAMEPAGAM1_ROWNAMEINFO, "ROWNAMEINFO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMEPAGAM1,IMDBDef5.FLD_PARAMEPAGAM1_ROWNAMEINFO,5,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMEPAGAM1, 0);
  }

  private static void Init_PQRY_PAGAMENTI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PAGAMENTI2, 13);
    IMDB.set_TblCode(IMDBDef14.PQRY_PAGAMENTI2, "PQRY_PAGAMENTI2");
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_DATA_PAGAM, "DATA_PAGAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_DATA_PAGAM,1,7,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_NUMERO_PAGAM, "NUMERO_PAGAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_NUMERO_PAGAM,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_D_DATA_PAGAM, "D_DATA_PAGAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_D_DATA_PAGAM,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI2,IMDBDef14.PQSL_PAGAMENTI2_DATA_ULTIMO_AGG,6,10,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PAGAMENTI2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PagamentiMandati(MyWebEntryPoint w, IMDBObj imdb)
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
  public PagamentiMandati()
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
    FormIdx = MyGlb.FRM_PAGAMEMANDAT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BF5EA9E7-1C32-41BB-A421-356EEAF7A4F1";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 820;
    DesignHeight = 490;
    set_Caption(new IDVariant("Pagamenti Mandati"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 820;
    Frames[1].Height = 464;
    Frames[1].Caption = "PAGAMENTI";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 464;
    PAN_PAGAMENTI = new IDPanel(w, this, 1, "PAN_PAGAMENTI");
    Frames[1].Content = PAN_PAGAMENTI;
    PAN_PAGAMENTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PAGAMENTI.VS = MainFrm.VisualStyleList;
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 820-MyGlb.PAN_OFFS_X, 464-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DDEE1B22-1FAF-4031-9368-DCD85BE44288");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 4, 68, 764, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PAGAMENTI.InitStatus = 2;
    PAN_PAGAMENTI_Init();
    PAN_PAGAMENTI_InitFields();
    PAN_PAGAMENTI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI28+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG155+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI28+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVIPAGAMEN+BaseCmdLinIdx)
      {
        ApriFormNuoviPagamenti();
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
      PAN_PAGAMENTI.UpdatePanel(MainFrm);
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
    return (obj instanceof PagamentiMandati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PagamentiMandati.class.getName() : (Glb.ClassWithPackage(PagamentiMandati.class) ? PagamentiMandati.class.getName().substring(PagamentiMandati.class.getPackage().getName().length() + 1) : PagamentiMandati.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // PAGAMENTI On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PAGAMENTI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // PAGAMENTI On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PAGAMENTI_PAGAMENTO)), true))
      {
        PAN_PAGAMENTI.set_FieldText(PFL_PAGAMENTI_SOMMPAGALABE, IDL.ToString(PAN_PAGAMENTI.GetFieldSum(PFL_PAGAMENTI_PAGAMENTO)).stringValue());
      }
      IMDB.set_Value(IMDBDef14.PQRY_PAGAMENTI2, IMDBDef14.PQSL_PAGAMENTI2_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef14.PQRY_PAGAMENTI2, IMDBDef14.PQSL_PAGAMENTI2_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandati", "PAGAMENTIOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // PAGAMENTI After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PAGAMENTI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // PAGAMENTI After Find Event Body
      // Procedure Body
      // 
      PAN_PAGAMENTI.set_FieldText(PFL_PAGAMENTI_SOMMPAGALABE, IDL.ToString(PAN_PAGAMENTI.GetFieldSum(PFL_PAGAMENTI_PAGAMENTO)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandati", "PAGAMENTIAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // PAGAMENTI On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PAGAMENTI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PAGAMENTI);
      // 
      // PAGAMENTI On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PAGAMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_PAGAMENTI_BENEFICIARIO,(new IDVariant(PAN_PAGAMENTI.FieldText(PFL_PAGAMENTI_BENEFICIARIO))).stringValue()); 
      PAN_PAGAMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_PAGAMENTI_QUIETANZA,(new IDVariant(PAN_PAGAMENTI.FieldText(PFL_PAGAMENTI_QUIETANZA))).stringValue()); 
      PAN_PAGAMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_PAGAMENTI_DOCUMENTO,(new IDVariant(PAN_PAGAMENTI.FieldText(PFL_PAGAMENTI_DOCUMENTO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandati", "PAGAMENTIOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // PAGAMENTI On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_PAGAMENTI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // PAGAMENTI On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(32)), true))
      {
        PAN_PAGAMENTI.PanelCommand(Glb.PCM_REQUERY);
        Cancel.set((new IDVariant(-1)));
      }
      if (Command.equals((new IDVariant(16)), true))
      {
        IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
        v_MSG1 = (new IDVariant("Pagamento in Liquidazione in Mandato", IDVariant.STRING));
        IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
        v_MSG2 = (new IDVariant("Eliminazione della registrazione?", IDVariant.STRING));
        IDVariant v_MSG3 = new IDVariant(0,IDVariant.STRING);
        v_MSG3 = (new IDVariant("Pagamento  Liquidazione ", IDVariant.STRING));
        IDVariant v_EC = new IDVariant(0,IDVariant.INTEGER);
        v_EC = (new IDVariant(MainFrm.MessageConfirm(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MSG1, (new IDVariant("<BR/>"))), v_MSG2), (new IDVariant("<BR/>"))), v_MSG3), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PAGAMENTI2, IMDBDef14.PQSL_PAGAMENTI2_NUMERO_LIQ, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PAGAMENTI2, IMDBDef14.PQSL_PAGAMENTI2_ANNO_LIQ, 0))))));
        if (!(v_EC.booleanValue()))
        {
          Cancel.set((new IDVariant(-1)));
          return;
        }
        else
        {
          Cancel.set((new IDVariant(-1)));
          try
          {
            SQL = new StringBuffer();
            SQL.append("delete from PAGAMENTI ");
            SQL.append("where (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PAGAMENTI2, IMDBDef14.PQSL_PAGAMENTI2_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            PAN_PAGAMENTI.PanelCommand(Glb.PCM_REQUERY);
          }
          catch (Exception e8)
          {
            MainFrm.set_AlertMessage(new IDVariant(e8.getMessage())); 
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandati", "PAGAMENTIOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // PAGAMENTI On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_PAGAMENTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_PAGAMENTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // PAGAMENTI On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandati", "PAGAMENTIOnDatabaseErrorEvent", _e);
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
      UNLOADEVENT_PARAPAGADELE();
      ((Mandati)MainFrm.GetForm(MyGlb.FRM_MANDATI,0)).PAN_MANDATI.PanelCommand(Glb.PCM_REQUERY);
      ((Mandati)MainFrm.GetForm(MyGlb.FRM_MANDATI,0)).PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandati", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Pagamenti: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PARAPAGADELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_NUMERO_MAND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_ANNO_MAND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_D_DATA_MAND, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_IMPORTO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_ROWNAMEINFO, 0, new IDVariant());
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
    IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_LAB = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MSG = (new IDVariant("Mandato ", IDVariant.STRING));
      v_NOMECAPTION = (new IDVariant("Pagamenti", IDVariant.STRING));
      v_LAB = (new IDVariant("Importo: ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      Frames[PAN_PAGAMENTI.FrIndex].set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO).stringValue());
      v_MSG = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MSG, IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_NUMERO_MAND, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_ANNO_MAND, 0))), (new IDVariant(" "))), (new IDVariant("del"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_D_DATA_MAND, 0)));
      PAN_PAGAMENTI.set_FieldText(PFL_PAGAMENTI_ESTREMILABEL, new IDVariant(v_MSG).stringValue());
      PAN_PAGAMENTI.set_FieldText(PFL_PAGAMENTI_IMPORTOLABEL, IDL.Add(v_LAB, IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_IMPORTO, 0))).stringValue());
      Settaimporto();
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_PAGAMENTI.ConfirmDelete = (new IDVariant(0)).booleanValue();
      if (IMDB.Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_ROWNAMEINFO, 0).equals((new IDVariant("I")), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_NEWCOMMANSE6+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        PAN_PAGAMENTI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_PAGAMENTI.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_PAGAMENTI.SetFlags (Glb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PAGAMENTI.SetFlags (Glb.OBJ_FIELD, PFL_PAGAMENTI_DATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PAGAMENTI.SetFlags (Glb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandati", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_NUOVIPAGAMEN)), true) && Result.booleanValue())
      {
        PAN_PAGAMENTI.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandati", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Form Nuovi Pagamenti
  // **********************************************************************
  public int ApriFormNuoviPagamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Form Nuovi Pagamenti Body
      // Procedure Body
      // 
      // 
      // controllo se ci sono modifiche in sospeso sul pannello Pagamenti
      // 
      {
        if (new IDVariant(PAN_PAGAMENTI.Status()).equals((new IDVariant(3)), true))
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Modifiche in sospeso. Salvare le modifiche?", IDVariant.STRING));
          if (!(MainFrm.MessageConfirm(v_MSG)))
          {
            return 0;
          }
        }
        PAN_PAGAMENTI.PanelCommand(Glb.PCM_UPDATE);
      }
      if (new IDVariant(PAN_PAGAMENTI.Status()).equals((new IDVariant(2)), true))
      {
        // 
        // apro form Nuovi Pagamenti
        // 
        {
          IMDB.set_Value(IMDBDef5.TBL_PARANUOVPAGA, IMDBDef5.FLD_PARANUOVPAGA_NUMERO_MAND, 0, IMDB.Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_NUMERO_MAND, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARANUOVPAGA, IMDBDef5.FLD_PARANUOVPAGA_ANNO_MAND, 0, IMDB.Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_ANNO_MAND, 0));
          IMDB.set_Value(IMDBDef5.TBL_PARANUOVPAGA, IMDBDef5.FLD_PARANUOVPAGA_IMPORTO, 0, IMDB.Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_IMPORTO, 0));
        }
        MainFrm.Show(MyGlb.FRM_NUOVIPAGAMEN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandati", "ApriFormNuoviPagamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Settaimporto
  // **********************************************************************
  public int Settaimporto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_IMPORTO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_IMPORTO = (new IDVariant("Importo: ", IDVariant.STRING));
      // 
      // Settaimporto Body
      // Procedure Body
      // 
      PAN_PAGAMENTI.set_FieldText(PFL_PAGAMENTI_IMPORTOLABEL, IDL.Add(v_IMPORTO, IDL.Format(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_IMPORTO, 0),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandati", "Settaimporto", _e);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PAGAMENTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PAGAMENTI, Cancel);
    // Stub
  }

  private void PAN_PAGAMENTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PAGAMENTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PAGAMENTI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PAGAMENTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PAGAMENTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PAGAMENTI_Init()
  {

    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, "641C75B9-4E07-486A-BF79-3B1657374B1B");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, "Beneficiario");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, "des_beneficiario");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, "DDAAC739-D3D5-4FCA-A535-EE011934D82C");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, "Pagamento");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, "importo");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, "D3350E18-932E-4B21-A0BE-0499CA60D0DC");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, "Data");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, "d_data_pagam");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, "7EC07228-5DDB-4C97-8A03-B78DB4AD870F");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, "Numero");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, "976029D0-F878-49CC-9AA8-F05A9930D3D5");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, "Quietanza");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.VIS_VISULOOUPCF4);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, "EE2F119C-4547-4648-8B09-5C08D1BAE274");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, "DATA PAGAMù");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, "138B8CDB-DA6F-4484-A9A5-9E905408F948");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, "PROGRESSIVO");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, "6AAA99FF-2526-4B71-9139-47CFB52B1B83");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, "FAT NUMERO DOC");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.VIS_VISULOOUPCF4);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, "27BE3B9E-9169-44A2-BC65-0971614CA9E8");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, "FAT D DATA DOC");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.VIS_VISULOOUPCF4);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, "7977C416-2C9E-4E58-B958-84722A9E65FF");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, "ANNO MAND");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.VIS_NONNULLAFIEL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, "65DDAAA8-439C-4BE0-A07F-C7B34E46CBA8");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, "NUMERO MAND");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.VIS_NONNULLAFIEL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, "6BE2FA89-7FC7-451D-88EF-00B0F3E6DC61");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, "ANNO LIQ");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.VIS_NONNULLAFIEL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, "24804164-EDEB-424B-B501-D2F2F9A65E2F");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, "NUMERO LIQ");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.VIS_NONNULLAFIEL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, "9E5BDDDD-FA3E-4614-AD58-7DD99C8DF5B7");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, "0F12BA71-C411-4224-BC6C-A537F811E458");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, "Importo:");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, MyGlb.VIS_ETICGRASIMPO);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, "09955927-47DB-4DCE-AA6A-F0DF340F4113");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, "Documento");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, "6BA2185F-432D-45AF-AC6A-02E81FBEADDD");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, MyGlb.VIS_CAMPTOTADISA);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, "2C8ABE54-CFFA-4896-B358-65E4614B12DC");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, "239F136D-CB56-47A9-92CF-33C6CC90546E");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, "753EBA24-AB5B-4BAA-90A8-CDBF84B57AB5");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, "Documento");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_PAGAMENTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_LIST, 4, 104, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_LIST, 124);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 244, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_FORM, 124);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_BENEFICIARIO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_BENEFICIARIO, PPQRY_PAGAMENTI1, "B.RAGIONE_SOCIALE_ESTESA", "LIBERASOESES", 5, 60, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_LIST, 192, 104, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_LIST, 56);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_LIST, "Pagamento");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_FORM, 4, 4, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_FORM, 56);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_FORM, "Pagam.");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_PAGAMENTO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_PAGAMENTO, PPQRY_PAGAMENTI2, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, 272, 104, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, 4, 196, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DATA, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DATA, PPQRY_PAGAMENTI2, "A.D_DATA_PAGAM", "D_DATA_PAGAM", 6, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_LIST, 352, 104, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_LIST, 92);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_FORM, 4, 52, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_FORM, 92);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_NUMERO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_NUMERO, PPQRY_PAGAMENTI2, "A.NUMERO_PAGAM", "NUMERO_PAGAM", 5, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_LIST, 408, 104, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_LIST, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_FORM, 4, 268, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_FORM, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_QUIETANZA, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_QUIETANZA, PPQRY_PAGAMENTI1, "D.DESCRIZIONE", "LIQT02DESCRI", 5, 40, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_LIST, 702, 108, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_LIST, 76);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_LIST, "DATA PAGAMù");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_FORM, 4, 28, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_FORM, 76);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAMU, MyGlb.PANEL_FORM, "DT. PAGAMù");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DATAPAGAMU, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DATAPAGAMU, PPQRY_PAGAMENTI2, "A.DATA_PAGAM", "DATA_PAGAM", 1, 7, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, 776, 108, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_PROGRESSIVO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_PROGRESSIVO, PPQRY_PAGAMENTI2, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_LIST, 616, 104, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_LIST, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_LIST, "FAT NUMERO DOC");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_FORM, 4, 292, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_FORM, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_FORM, "FAT NUM. DOC");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_FATNUMERODOC, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_FATNUMERODOC, PPQRY_PAGAMENTI1, "E.NUMERO_DOC", "LIQFATNUMDOC", 5, 20, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_LIST, 704, 104, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_LIST, 92);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_LIST, "FAT D DATA DOC");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_FORM, 4, 220, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_FORM, 92);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_FORM, "FAT D DT. DOC");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_FATDDATADOC, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_FATDDATADOC, PPQRY_PAGAMENTI1, "E.D_DATA_DOC", "LIQDDATADOC", 6, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, 1068, 108, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, "ANNO MAND");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, 4, 100, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_ANNOMAND, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_ANNOMAND, PPQRY_PAGAMENTI2, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, 1140, 108, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, "NUMERO MAND");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, 4, 124, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, "NUM. MAND");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_NUMEROMAND, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_NUMEROMAND, PPQRY_PAGAMENTI2, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_LIST, 1068, 108, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_ANNOLIQ, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_ANNOLIQ, PPQRY_PAGAMENTI2, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_LIST, 1284, 108, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_LIST, "NUMERO LIQ");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 172, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_FORM, 72);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_FORM, "NUM. LIQ");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_NUMEROLIQ, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_NUMEROLIQ, PPQRY_PAGAMENTI2, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, MyGlb.PANEL_LIST, 8, 12, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, MyGlb.PANEL_LIST, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, MyGlb.PANEL_FORM, 8, 8, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, MyGlb.PANEL_FORM, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ESTREMILABEL, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_ESTREMILABEL, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_ESTREMILABEL, -1, "", "ESTREMILABEL", 0, 0, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, MyGlb.PANEL_LIST, 548, 12, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, MyGlb.PANEL_FORM, 256, 8, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_IMPORTOLABEL, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_IMPORTOLABEL, -1, "", "IMPORTOLABEL", 0, 0, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_LIST, 612, 104, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_LIST, 140);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_LIST, "Documento");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_FORM, 4, 316, 572, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_FORM, 140);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_FORM, 2);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_FORM, "Documento");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DOCUMENTO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DOCUMENTO, PPQRY_PAGAMENTI1, "CASE WHEN (E.NUMERO_DOC IS NULL) THEN NULL ELSE E.NUMERO_DOC || ' ' || 'del' || ' ' || TO_CHAR ( E.D_DATA_DOC ) END", "LIQDOCUMEXPR", 5, 99, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, MyGlb.PANEL_LIST, 192, 316, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, MyGlb.PANEL_LIST, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, MyGlb.PANEL_FORM, 196, 324, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, MyGlb.PANEL_FORM, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMPAGALABE, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_SOMMPAGALABE, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_SOMMPAGALABE, -1, "", "SOMMPAGALABE", 0, 0, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, 780, 104, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 364, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_UTENTULTIAGG, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_UTENTULTIAGG, PPQRY_PAGAMENTI2, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, 780, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 388, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DATAULTIMAGG, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DATAULTIMAGG, PPQRY_PAGAMENTI2, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, MyGlb.PANEL_LIST, 616, 68, 152, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, MyGlb.PANEL_LIST, 2);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, MyGlb.PANEL_FORM, 612, 68, 156, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DOCUMENLABEL, MyGlb.PANEL_FORM, 2);
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DOCUMENLABEL, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DOCUMENLABEL, -1, "", "DOCUMENLABEL", 0, 0, 0, -13997);
  }

  private void PAN_PAGAMENTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  E.D_DATA_DOC as LIQDDATADOC, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as LIBERASOESES, ");
    SQL.append("  D.DESCRIZIONE as LIQT02DESCRI, ");
    SQL.append("  E.NUMERO_DOC as LIQFATNUMDOC, ");
    SQL.append("  CASE WHEN (E.NUMERO_DOC IS NULL) THEN NULL ELSE E.NUMERO_DOC || ' ' || 'del' || ' ' || TO_CHAR ( E.D_DATA_DOC ) END as LIQDOCUMEXPR ");
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B, ");
    SQL.append("  QTN C, ");
    SQL.append("  T02 D, ");
    SQL.append("  FAT E, ");
    SQL.append("  BEN F ");
    SQL.append("where (~~ANNO_LIQ~~ = A.ANNO_LIQ) ");
    SQL.append("and   (~~NUMERO_LIQ~~ = A.NUMERO_LIQ) ");
    SQL.append("and   (B.CODICE(+) = A.BENEFICIARIO) ");
    SQL.append("and   (C.NUM_QUIETANZA(+) = A.NUM_QUIETANZA) ");
    SQL.append("and   (A.BENEFICIARIO = C.CODICE(+)) ");
    SQL.append("and   (C.TIPO_QUIETANZA = D.CODICE(+)) ");
    SQL.append("and   (A.FAT_ANNO_PROG = E.ANNO_PROG(+) AND A.FAT_NUMERO_PROG = E.NUMERO_PROG(+)) ");
    SQL.append("and   (A.DIVERSO_BEN = F.CODICE(+)) ");
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI1, 0, SQL, -1, "");
    PAN_PAGAMENTI.SetQueryDB(PPQRY_PAGAMENTI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PAGAMENTI.SetMasterTable(PPQRY_PAGAMENTI1, "LIQ");
    PAN_PAGAMENTI.SetIMDB(IMDB, "PQRY_PAGAMENTI2", true);
    PAN_PAGAMENTI.set_SetString(MyGlb.MASTER_ROWNAME, "PAGAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  A.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.DATA_PAGAM as DATA_PAGAM, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.NUMERO_PAGAM as NUMERO_PAGAM, ");
    SQL.append("  A.D_DATA_PAGAM as D_DATA_PAGAM, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PAGAMENTI A ");
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_MAND = ~~TBL_PARAMEPAGAM1.ANNO_MAND~~ AND A.NUMERO_MAND = ~~TBL_PARAMEPAGAM1.NUMERO_MAND~~) ");
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ, ");
    SQL.append("  A.D_DATA_PAGAM ");
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI2, 5, SQL, -1, "");
    PAN_PAGAMENTI.SetQueryDB(PPQRY_PAGAMENTI2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PAGAMENTI.SetMasterTable(0, "PAGAMENTI");
    PAN_PAGAMENTI.AddToSortList(PFL_PAGAMENTI_ANNOLIQ, true);
    PAN_PAGAMENTI.AddToSortList(PFL_PAGAMENTI_NUMEROLIQ, true);
    PAN_PAGAMENTI.AddToSortList(PFL_PAGAMENTI_DATA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PAGAMENTI.Status() == 2)
    {
      int oldListQBE = PAN_PAGAMENTI.iUseListQBE;
      PAN_PAGAMENTI.iUseListQBE = 0;
      PAN_PAGAMENTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PAGAMENTI.PanelCommand(Glb.PCM_FIND);
      PAN_PAGAMENTI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
