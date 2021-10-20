// **********************************************
// Tipi Variazione 1
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TipiVariazione1 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_TIPIVARIAZIO_CODICE = 0;
  private static int PFL_TIPIVARIAZIO_DESCRIZIONE = 1;
  private static int PFL_TIPIVARIAZIO_TIPOMOTIVAZI = 2;
  private static int PFL_TIPIVARIAZIO_UTENTEINSERI = 3;
  private static int PFL_TIPIVARIAZIO_DATAINSERIME = 4;
  private static int PFL_TIPIVARIAZIO_UTENTULTIAGG = 5;
  private static int PFL_TIPIVARIAZIO_DATAULTIMAGG = 6;

  private static int PPQRY_T67 = 0;

  private static int PPQRY_TIPIMOTIVBIL = 1;


  IDPanel PAN_TIPIVARIAZIO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS29(IMDB);
    //
    //
    Init_PQRY_T67(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS29(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARS29, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARS29, "TBL_PARS29");
    IMDB.set_FldCode(IMDBDef1.TBL_PARS29,IMDBDef1.FLD_PARS29_NOMEOGGSEECO, "NOMEOGGSEECO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS29,IMDBDef1.FLD_PARS29_NOMEOGGSEECO,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARS29,IMDBDef1.FLD_PARS29_NOMEOGGSEFPV, "NOMEOGGSEFPV");
    IMDB.SetFldParams(IMDBDef1.TBL_PARS29,IMDBDef1.FLD_PARS29_NOMEOGGSEFPV,5,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARS29, 0);
  }

  private static void Init_PQRY_T67(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_T67, 7);
    IMDB.set_TblCode(IMDBDef8.PQRY_T67, "PQRY_T67");
    IMDB.set_FldCode(IMDBDef8.PQRY_T67,IMDBDef8.PQSL_T67_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T67,IMDBDef8.PQSL_T67_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T67,IMDBDef8.PQSL_T67_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T67,IMDBDef8.PQSL_T67_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T67,IMDBDef8.PQSL_T67_TIPOLOGIA, "TIPOLOGIA");
    IMDB.SetFldParams(IMDBDef8.PQRY_T67,IMDBDef8.PQSL_T67_TIPOLOGIA,5,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T67,IMDBDef8.PQSL_T67_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T67,IMDBDef8.PQSL_T67_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T67,IMDBDef8.PQSL_T67_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T67,IMDBDef8.PQSL_T67_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T67,IMDBDef8.PQSL_T67_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_T67,IMDBDef8.PQSL_T67_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T67,IMDBDef8.PQSL_T67_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_T67,IMDBDef8.PQSL_T67_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_T67, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TipiVariazione1(MyWebEntryPoint w, IMDBObj imdb)
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
  public TipiVariazione1()
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
    FormIdx = MyGlb.FRM_TIPIVARIAZI1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0F01611C-AD64-45DC-9E7F-ECED9511FE27";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 824;
    DesignHeight = 394;
    set_Caption(new IDVariant("Tipi Variazione 1"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 824;
    Frames[1].Height = 368;
    Frames[1].Caption = "Tipi Variazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 368;
    PAN_TIPIVARIAZIO = new IDPanel(w, this, 1, "PAN_TIPIVARIAZIO");
    Frames[1].Content = PAN_TIPIVARIAZIO;
    PAN_TIPIVARIAZIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPIVARIAZIO.VS = MainFrm.VisualStyleList;
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 824-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D0C04DF1-0531-4FB9-88A5-051255350A0F");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 684, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPIVARIAZIO.InitStatus = 2;
    PAN_TIPIVARIAZIO_Init();
    PAN_TIPIVARIAZIO_InitFields();
    PAN_TIPIVARIAZIO_InitQueries();
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
      PAN_TIPIVARIAZIO.UpdatePanel(MainFrm);
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
    return (obj instanceof TipiVariazione1);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TipiVariazione1.class.getName() : (Glb.ClassWithPackage(TipiVariazione1.class) ? TipiVariazione1.class.getName().substring(TipiVariazione1.class.getPackage().getName().length() + 1) : TipiVariazione1.class.getName()));
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
      IDVariant v_CAPTION = null;
      v_CAPTION = (new IDVariant("Tipi Variazione"));
      set_Caption(new IDVariant(v_CAPTION));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione1", "Load", _e);
    }
  }

  // **********************************************************************
  // Tipi Variazione On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPIVARIAZIO);
      // 
      // Tipi Variazione On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(PAN_TIPIVARIAZIO.IsNewRow()))
      {
        PAN_TIPIVARIAZIO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TIPIVARIAZIO.SetFlags (Glb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_TIPIVARIAZIO.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIVARIAZIO_DESCRIZIONE,(new IDVariant(PAN_TIPIVARIAZIO.FieldText(PFL_TIPIVARIAZIO_DESCRIZIONE))).stringValue()); 
      PAN_TIPIVARIAZIO.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPIVARIAZIO_TIPOMOTIVAZI,(new IDVariant(PAN_TIPIVARIAZIO.FieldText(PFL_TIPIVARIAZIO_TIPOMOTIVAZI))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione1", "TipiVariazioneOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Tipi Variazione Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Variazione Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef8.PQRY_T67, IMDBDef8.PQSL_T67_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_T67, IMDBDef8.PQSL_T67_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef8.PQRY_T67, IMDBDef8.PQSL_T67_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef8.PQRY_T67, IMDBDef8.PQSL_T67_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_T67, IMDBDef8.PQSL_T67_CODICE, 0)))
      {
        IDVariant v_CODICE = null;
        v_CODICE = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MAX(A.CODICE) as MAXT54CODICE ");
        SQL.append("from ");
        SQL.append("  T54 A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CODICE = QV.Get("MAXT54CODICE", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef8.PQRY_T67, IMDBDef8.PQSL_T67_CODICE, 0, IDL.Add(IDL.NullValue(v_CODICE,(new IDVariant(0))), (new IDVariant(1))));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione1", "TipiVariazioneBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Tipi Variazione Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Variazione Before Update Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef8.PQRY_T67, IMDBDef8.PQSL_T67_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_T67, IMDBDef8.PQSL_T67_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione1", "TipiVariazioneBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Tipi Variazione On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_TIPIVARIAZIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Tipi Variazione On Database Error Body
      // Corpo Procedura
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione1", "TipiVariazioneOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Tipi Variazione On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Variazione On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.T54PD(IMDB.Value(IMDBDef8.PQRY_T67, IMDBDef8.PQSL_T67_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione1", "TipiVariazioneOnCommand", _e);
    }
  }

  // **********************************************************************
  // Tipi Variazione On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tipi Variazione On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_T67, IMDBDef8.PQSL_T67_CODICE, 0)))
        {
          IDVariant v_VMAX = null;
          v_VMAX = (new IDVariant(1));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  NVL(MAX(A.CODICE), 0) + 1 as NUVAMAT5CO01 ");
          SQL.append("from ");
          SQL.append("  T54 A ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VMAX = QV.Get("NUVAMAT5CO01", IDVariant.INTEGER) ;
          }
          QV.Close();
          IMDB.set_Value(IMDBDef8.PQRY_T67, IMDBDef8.PQSL_T67_CODICE, 0, new IDVariant(v_VMAX));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiVariazione1", "TipiVariazioneOnUpdatingRow", _e);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPIVARIAZIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPIVARIAZIO, Cancel);
    // Stub
  }

  private void PAN_TIPIVARIAZIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPIVARIAZIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_TIPIVARIAZIO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_TIPIVARIAZIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPIVARIAZIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPIVARIAZIO_Init()
  {

    PAN_TIPIVARIAZIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPIVARIAZIO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPIVARIAZIO.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, "FCC66E04-C909-4366-B1F0-59BD9F0914C1");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, "Codice");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, "F0A92A48-23AE-4FEB-A759-520F0D8AA9EE");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, "Descrizione");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, "F7F4EE8C-231C-47E8-99BF-A0353DCCDBAA");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, "Tipo Motivazione");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, "4B479763-4919-4394-BEBA-8CA4BF252002");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, "280755B5-F00B-4768-8A4B-A79D3D749249");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, "DATA INSERIMENTO");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, "1A3A977C-0E69-45B2-90B7-175917FB3905");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIVARIAZIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, "6C5AA4CB-1F67-447F-B09E-4310D38EB72B");
    PAN_TIPIVARIAZIO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_TIPIVARIAZIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, "");
    PAN_TIPIVARIAZIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_TIPIVARIAZIO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPIVARIAZIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_CODICE, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_CODICE, PPQRY_T67, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 392, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_DESCRIZIONE, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_DESCRIZIONE, PPQRY_T67, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, MyGlb.PANEL_LIST, 448, 36, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, MyGlb.PANEL_LIST, 64);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, MyGlb.PANEL_LIST, "Tipo Motivazione");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, MyGlb.PANEL_FORM, 4, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, MyGlb.PANEL_FORM, 88);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, MyGlb.PANEL_FORM, "Tp. Motiv.");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_TIPOMOTIVAZI, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_TIPOMOTIVAZI, PPQRY_T67, "A.TIPOLOGIA", "TIPOLOGIA", 5, 3, 0, -13997);
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_LIST, 488, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 76, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_UTENTEINSERI, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_UTENTEINSERI, PPQRY_T67, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_LIST, 608, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_FORM, 4, 100, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_DATAINSERIME, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_DATAINSERIME, PPQRY_T67, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_LIST, 716, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 124, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_UTENTULTIAGG, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_UTENTULTIAGG, PPQRY_T67, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_LIST, 828, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_TIPIVARIAZIO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 148, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIVARIAZIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_TIPIVARIAZIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_TIPIVARIAZIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIVARIAZIO_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_TIPIVARIAZIO.SetFieldPage(PFL_TIPIVARIAZIO_DATAULTIMAGG, -1, -1);
    PAN_TIPIVARIAZIO.SetFieldPanel(PFL_TIPIVARIAZIO_DATAULTIMAGG, PPQRY_T67, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_TIPIVARIAZIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPIVARIAZIO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPMOTVBICOD, ");
    SQL.append("  A.DESCRIZIONE as TIPMOTVBIDES ");
    SQL.append("from ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL A ");
    SQL.append("where (A.CODICE = ~~TIPOLOGIA~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_TIPIMOTIVBIL, 0, SQL, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPMOTVBICOD, ");
    SQL.append("  A.DESCRIZIONE as TIPMOTVBIDES ");
    SQL.append("from ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_TIPIMOTIVBIL, 1, SQL, PFL_TIPIVARIAZIO_TIPOMOTIVAZI, "");
    PAN_TIPIVARIAZIO.SetQueryDB(PPQRY_TIPIMOTIVBIL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIVARIAZIO.SetIMDB(IMDB, "PQRY_T67", true);
    PAN_TIPIVARIAZIO.set_SetString(MyGlb.MASTER_ROWNAME, "T54");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPOLOGIA as TIPOLOGIA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_T67, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T54 A ");
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_T67, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_T67, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_T67, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_T67, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_TIPIVARIAZIO.SetQuery(PPQRY_T67, 5, SQL, -1, "");
    PAN_TIPIVARIAZIO.SetQueryDB(PPQRY_T67, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIVARIAZIO.SetMasterTable(0, "T54");
    PAN_TIPIVARIAZIO.AddToSortList(PFL_TIPIVARIAZIO_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPIVARIAZIO.Status() == 2)
    {
      int oldListQBE = PAN_TIPIVARIAZIO.iUseListQBE;
      PAN_TIPIVARIAZIO.iUseListQBE = 0;
      PAN_TIPIVARIAZIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPIVARIAZIO.PanelCommand(Glb.PCM_FIND);
      PAN_TIPIVARIAZIO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_TIPIVARIAZIO) PAN_TIPIVARIAZIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
