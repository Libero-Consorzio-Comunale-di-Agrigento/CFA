// **********************************************
// Servizi In Economia Peg Consuntivo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ServiziInEconomiaPegConsuntivo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SERVIINECONO_SERVIZIO = 0;
  private static int PFL_SERVIINECONO_ELABORA = 1;
  private static int PFL_SERVIINECONO_DESCRIINTERV = 2;

  private static int PPQRY_NEWTABLE9 = 0;

  private static int PPQRY_T75 = 1;


  IDPanel PAN_SERVIINECONO;

  // Definition of Global Variables
  private IDVariant FIRSTTIME = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE14(IMDB);
    //
    //
    Init_PQRY_NEWTABLE9(IMDB);
    Init_PQRY_NEWTABLE9_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE14(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_NEWTABLE14, 2);
    IMDB.set_TblCode(IMDBDef3.TBL_NEWTABLE14, "TBL_NEWTABLE14");
    IMDB.set_FldCode(IMDBDef3.TBL_NEWTABLE14,IMDBDef3.FLD_NEWTABLE14_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef3.TBL_NEWTABLE14,IMDBDef3.FLD_NEWTABLE14_ROWNAMESERVI,1,3,0);
    IMDB.set_FldCode(IMDBDef3.TBL_NEWTABLE14,IMDBDef3.FLD_NEWTABLE14_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef3.TBL_NEWTABLE14,IMDBDef3.FLD_NEWTABLE14_ROWNAMDESINT,1,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_NEWTABLE14, 0);
  }

  private static void Init_PQRY_NEWTABLE9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NEWTABLE9, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_NEWTABLE9, "PQRY_NEWTABLE9");
    IMDB.set_FldCode(IMDBDef12.PQRY_NEWTABLE9,IMDBDef12.PQSL_NEWTABLE9_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef12.PQRY_NEWTABLE9,IMDBDef12.PQSL_NEWTABLE9_ROWNAMESERVI,1,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_NEWTABLE9,IMDBDef12.PQSL_NEWTABLE9_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_NEWTABLE9,IMDBDef12.PQSL_NEWTABLE9_ROWNAMDESINT,1,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_NEWTABLE9, 0);
  }

  private static void Init_PQRY_NEWTABLE9_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NEWTABLE9_RS, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_NEWTABLE9_RS, "PQRY_NEWTABLE9_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_NEWTABLE9_RS,IMDBDef12.PQSL_NEWTABLE9_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef12.PQRY_NEWTABLE9_RS,IMDBDef12.PQSL_NEWTABLE9_ROWNAMESERVI,1,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_NEWTABLE9_RS,IMDBDef12.PQSL_NEWTABLE9_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_NEWTABLE9_RS,IMDBDef12.PQSL_NEWTABLE9_ROWNAMDESINT,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ServiziInEconomiaPegConsuntivo(MyWebEntryPoint w, IMDBObj imdb)
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
  public ServiziInEconomiaPegConsuntivo()
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
    FormIdx = MyGlb.FRM_SERINECOPECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A138DDE2-ECF3-48BE-B194-46EF61E678BC";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 348;
    DesignHeight = 190;
    set_Caption(new IDVariant("Servizi In Economia Peg Consuntivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 348;
    Frames[1].Height = 164;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Servizi In Economia";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 164;
    PAN_SERVIINECONO = new IDPanel(w, this, 1, "PAN_SERVIINECONO");
    Frames[1].Content = PAN_SERVIINECONO;
    PAN_SERVIINECONO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SERVIINECONO.VS = MainFrm.VisualStyleList;
    PAN_SERVIINECONO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 348-MyGlb.PAN_OFFS_X, 164-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SERVIINECONO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6623F86F-6E8B-4317-8211-5FE5700E3BE5");
    PAN_SERVIINECONO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 520, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIINECONO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SERVIINECONO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SERVIINECONO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SERVIINECONO.InitStatus = 2;
    PAN_SERVIINECONO_Init();
    PAN_SERVIINECONO_InitFields();
    PAN_SERVIINECONO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_NEWTABLE14, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SERINECOPECO_NEWTABLE9();
      }
      PAN_SERVIINECONO.UpdatePanel(MainFrm);
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
    return (obj instanceof ServiziInEconomiaPegConsuntivo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ServiziInEconomiaPegConsuntivo.class.getName() : (Glb.ClassWithPackage(ServiziInEconomiaPegConsuntivo.class) ? ServiziInEconomiaPegConsuntivo.class.getName().substring(ServiziInEconomiaPegConsuntivo.class.getPackage().getName().length() + 1) : ServiziInEconomiaPegConsuntivo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DW = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WINDOWPERSON = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WINDOW = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DWP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DW = (new IDVariant("d_servizi_economia_pegc", IDVariant.STRING));
      v_WP = (new IDVariant("w_servizi_economia_pegc_stampa_mz", IDVariant.STRING));
      v_WINDOW = (new IDVariant("w_servizi_economia_pegc_stampa", IDVariant.STRING));
      v_DWP = (new IDVariant("d_servizi_economia_mz", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      v_WINDOWPERSON = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_WINDOW);
      // 
      // SE Personalizzazione attiva
      // 
      if (v_WINDOWPERSON.equals(v_WP, true))
      {
        Deletewrk();
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.WORKSERCOSMONZA(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef12.PQRY_NEWTABLE9, IMDBDef12.PQSL_NEWTABLE9_ROWNAMESERVI, 0).equals((new IDVariant(999)), true))?(new IDVariant(-1)):IMDB.Value(IMDBDef12.PQRY_NEWTABLE9, IMDBDef12.PQSL_NEWTABLE9_ROWNAMESERVI, 0)), (new IDVariant("C")));
        MainFrm.SetParametroStampa(IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampa((new IDVariant("C")));
        MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DWP);
      }
      else
      {
        if (IMDB.Value(IMDBDef12.PQRY_NEWTABLE9, IMDBDef12.PQSL_NEWTABLE9_ROWNAMESERVI, 0).equals((new IDVariant(999)), true))
        {
          MainFrm.SetParametroStampa(IDL.ToString((new IDVariant(-1))));
        }
        else
        {
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_NEWTABLE9, IMDBDef12.PQSL_NEWTABLE9_ROWNAMESERVI, 0)));
        }
        MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_NEWTABLE9, IMDBDef12.PQSL_NEWTABLE9_ROWNAMDESINT, 0)));
        MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziInEconomiaPegConsuntivo", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Deletewrk
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Deletewrk ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Deletewrk Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("delete from WRK_SER_MZ ");
      SQL.append("where (SESSIONE_ID = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziInEconomiaPegConsuntivo", "Deletewrk", _e);
      return -1;
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
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WINDOWPERSON = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WINDOW = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Servizi in Economia (Peg Consuntivo)", IDVariant.STRING));
      v_WP = (new IDVariant("w_servizi_economia_pegc_stampa_mz", IDVariant.STRING));
      v_WINDOW = (new IDVariant("w_servizi_economia_pegc_stampa", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAP, MainFrm.ESERCIZIO));
      FIRSTTIME = (new IDVariant(1));
      IMDB.set_Value(IMDBDef3.TBL_NEWTABLE14, IMDBDef3.FLD_NEWTABLE14_ROWNAMDESINT, 0, (new IDVariant(0)));
      v_WINDOWPERSON = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_WINDOW);
      if (v_WINDOWPERSON.equals(v_WP, true))
      {
        PAN_SERVIINECONO.SetFlags (Glb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SERVIINECONO.SetFlags (Glb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziInEconomiaPegConsuntivo", "LoadEvent", _e);
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
      Deletewrk();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziInEconomiaPegConsuntivo", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Servizi In Economia After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_SERVIINECONO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Servizi In Economia After Find Event Body
      // Procedure Body
      // 
      if (FIRSTTIME.equals((new IDVariant(1)), true))
      {
        FIRSTTIME = (new IDVariant(0));
        IMDB.set_Value(IMDBDef3.TBL_NEWTABLE14, IMDBDef3.FLD_NEWTABLE14_ROWNAMESERVI, 0, (new IDVariant(999)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziInEconomiaPegConsuntivo", "ServiziInEconomiaAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void SERINECOPECO_NEWTABLE9() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_NEWTABLE9_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_NEWTABLE14, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_NEWTABLE14, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_NEWTABLE9_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_NEWTABLE9_RS, 0, IMDBDef3.TBL_NEWTABLE14, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_NEWTABLE9_RS, 0, 0, IMDBDef3.TBL_NEWTABLE14, IMDBDef3.FLD_NEWTABLE14_ROWNAMESERVI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_NEWTABLE9_RS, 1, 0, IMDBDef3.TBL_NEWTABLE14, IMDBDef3.FLD_NEWTABLE14_ROWNAMDESINT, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_NEWTABLE14, 0);
      if (IMDB.Eof(IMDBDef3.TBL_NEWTABLE14, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_NEWTABLE14, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_NEWTABLE9_RS, 0);
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
  private void PAN_SERVIINECONO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SERVIINECONO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SERVIINECONO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SERVIINECONO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SERVIINECONO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SERVIINECONO);
    // Stub
  }

  private void PAN_SERVIINECONO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SERVIINECONO_ELABORA)
    {
      this.IdxPanelActived = this.PAN_SERVIINECONO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SERVIINECONO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SERVIINECONO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SERVIINECONO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SERVIINECONO_Init()
  {

    PAN_SERVIINECONO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SERVIINECONO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SERVIINECONO.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_SERVIINECONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_SERVIZIO, "87AF37F5-E14E-4673-A4B5-0910D3EA884C");
    PAN_SERVIINECONO.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_SERVIZIO, "Servizio");
    PAN_SERVIINECONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_SERVIZIO, "");
    PAN_SERVIINECONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_SERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIINECONO.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_SERVIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIINECONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_ELABORA, "CDCC3C12-5F64-445B-8FD2-0A1A96D6EAA9");
    PAN_SERVIINECONO.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_ELABORA, "Elabora");
    PAN_SERVIINECONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_SERVIINECONO.SetImage(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_ELABORA, 0, "button1.gif", false);
    PAN_SERVIINECONO.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SERVIINECONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, "D39A8ED1-332D-4EC3-B3A9-782052753341");
    PAN_SERVIINECONO.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, "Descrizione Intervento");
    PAN_SERVIINECONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, "");
    PAN_SERVIINECONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_SERVIINECONO.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SERVIINECONO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SERVIINECONO.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_SERVIZIO, MyGlb.PANEL_LIST, 0, 36, 400, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SERVIINECONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_SERVIZIO, MyGlb.PANEL_LIST, 48);
    PAN_SERVIINECONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SERVIINECONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_SERVIZIO, MyGlb.PANEL_LIST, "Servizio");
    PAN_SERVIINECONO.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_SERVIZIO, MyGlb.PANEL_FORM, 4, 24, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIINECONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_SERVIZIO, MyGlb.PANEL_FORM, 56);
    PAN_SERVIINECONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SERVIINECONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_SERVIZIO, MyGlb.PANEL_FORM, "Servizio");
    PAN_SERVIINECONO.SetFieldPage(PFL_SERVIINECONO_SERVIZIO, -1, -1);
    PAN_SERVIINECONO.SetFieldPanel(PFL_SERVIINECONO_SERVIZIO, PPQRY_NEWTABLE9, "A.ROWNAMESERVI", "ROWNAMESERVI", 1, 3, 0, -13997);
    PAN_SERVIINECONO.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_ELABORA, MyGlb.PANEL_LIST, 176, 68, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIINECONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_SERVIINECONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_SERVIINECONO.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_ELABORA, MyGlb.PANEL_FORM, 220, 92, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIINECONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_SERVIINECONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_SERVIINECONO.SetFieldPage(PFL_SERVIINECONO_ELABORA, -1, -1);
    PAN_SERVIINECONO.SetFieldPanel(PFL_SERVIINECONO_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_SERVIINECONO.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIINECONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_SERVIINECONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_SERVIINECONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, MyGlb.PANEL_LIST, "Descrizione Intervento");
    PAN_SERVIINECONO.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, MyGlb.PANEL_FORM, 136, 52, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIINECONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, MyGlb.PANEL_FORM, 140);
    PAN_SERVIINECONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_SERVIINECONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIINECONO_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizione Intervento");
    PAN_SERVIINECONO.SetFieldPage(PFL_SERVIINECONO_DESCRIINTERV, -1, -1);
    PAN_SERVIINECONO.SetFieldPanel(PFL_SERVIINECONO_DESCRIINTERV, PPQRY_NEWTABLE9, "A.ROWNAMDESINT", "ROWNAMDESINT", 1, 1, 0, -13997);
    PAN_SERVIINECONO.SetValueListItem(PFL_SERVIINECONO_DESCRIINTERV, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_SERVIINECONO.SetValueListItem(PFL_SERVIINECONO_DESCRIINTERV, (new IDVariant(0)), "Zero", "", "", -1);
  }

  private void PAN_SERVIINECONO_InitQueries()
  {
    StringBuffer SQL;

    PAN_SERVIINECONO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T75CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T75NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T75 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMESERVI~~) ");
    SQL.append("and   (A.ECONOMIA_IVA = 'SI') ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  999, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_SERVIINECONO.SetQuery(PPQRY_T75, 0, SQL, PFL_SERVIINECONO_SERVIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T75CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T75NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T75 A ");
    SQL.append("where (A.ECONOMIA_IVA = 'SI') ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  999, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_SERVIINECONO.SetQuery(PPQRY_T75, 1, SQL, PFL_SERVIINECONO_SERVIZIO, "");
    PAN_SERVIINECONO.SetQueryDB(PPQRY_T75, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SERVIINECONO.SetIMDB(IMDB, "PQRY_NEWTABLE9", true);
    PAN_SERVIINECONO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_SERVIINECONO.SetQueryIMDB(PPQRY_NEWTABLE9, IMDBDef12.PQRY_NEWTABLE9_RS, IMDBDef3.TBL_NEWTABLE14);
    JustLoaded = true;
    PAN_SERVIINECONO.SetFieldPrimaryIndex(PFL_SERVIINECONO_SERVIZIO, IMDBDef3.FLD_NEWTABLE14_ROWNAMESERVI);
    PAN_SERVIINECONO.SetFieldPrimaryIndex(PFL_SERVIINECONO_DESCRIINTERV, IMDBDef3.FLD_NEWTABLE14_ROWNAMDESINT);
    PAN_SERVIINECONO.SetMasterTable(0, "NEWTABLE14");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SERVIINECONO.Status() == 2)
    {
      int oldListQBE = PAN_SERVIINECONO.iUseListQBE;
      PAN_SERVIINECONO.iUseListQBE = 0;
      PAN_SERVIINECONO.PanelCommand(Glb.PCM_SEARCH);
      PAN_SERVIINECONO.PanelCommand(Glb.PCM_FIND);
      PAN_SERVIINECONO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SERVIINECONO) PAN_SERVIINECONO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SERVIINECONO) PAN_SERVIINECONO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SERVIINECONO) PAN_SERVIINECONO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SERVIINECONO) PAN_SERVIINECONO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SERVIINECONO) PAN_SERVIINECONO_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_SERVIINECONO) PAN_SERVIINECONO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
