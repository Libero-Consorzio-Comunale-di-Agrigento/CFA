// **********************************************
// Riepilogo Generale Spese Preventivo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RiepilogoGeneraleSpesePreventivo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_RIEPGENESPES_DABILANSIMUL = 0;
  private static int PFL_RIEPGENESPES_STANZIATTUAL = 1;
  private static int PFL_RIEPGENESPES_ELABORA = 2;

  private static int PPQRY_PAR11 = 0;


  IDPanel PAN_RIEPGENESPES;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR14(IMDB);
    //
    //
    Init_PQRY_PAR11(IMDB);
    Init_PQRY_PAR11_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR14(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR14, 2);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR14, "TBL_PAR14");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR14,IMDBDef3.FLD_PAR14_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR14,IMDBDef3.FLD_PAR14_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR14,IMDBDef3.FLD_PAR14_ROWNAMSTAATT, "ROWNAMSTAATT");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR14,IMDBDef3.FLD_PAR14_ROWNAMSTAATT,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR14, 0);
  }

  private static void Init_PQRY_PAR11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PAR11, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_PAR11, "PQRY_PAR11");
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR11,IMDBDef11.PQSL_PAR11_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR11,IMDBDef11.PQSL_PAR11_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR11,IMDBDef11.PQSL_PAR11_ROWNAMSTAATT, "ROWNAMSTAATT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR11,IMDBDef11.PQSL_PAR11_ROWNAMSTAATT,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PAR11, 0);
  }

  private static void Init_PQRY_PAR11_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PAR11_RS, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_PAR11_RS, "PQRY_PAR11_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR11_RS,IMDBDef11.PQSL_PAR11_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR11_RS,IMDBDef11.PQSL_PAR11_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PAR11_RS,IMDBDef11.PQSL_PAR11_ROWNAMSTAATT, "ROWNAMSTAATT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PAR11_RS,IMDBDef11.PQSL_PAR11_ROWNAMSTAATT,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RiepilogoGeneraleSpesePreventivo(MyWebEntryPoint w, IMDBObj imdb)
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
  public RiepilogoGeneraleSpesePreventivo()
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
    FormIdx = MyGlb.FRM_RIEGENSPEPRE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7D146318-7DD9-4632-90D6-E3F90DD7E1BE";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 240;
    DesignHeight = 190;
    set_Caption(new IDVariant("Riepilogo Generale Spese Preventivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 240;
    Frames[1].Height = 164;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Riepilogo Generale Spese";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 164;
    PAN_RIEPGENESPES = new IDPanel(w, this, 1, "PAN_RIEPGENESPES");
    Frames[1].Content = PAN_RIEPGENESPES;
    PAN_RIEPGENESPES.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RIEPGENESPES.VS = MainFrm.VisualStyleList;
    PAN_RIEPGENESPES.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 240-MyGlb.PAN_OFFS_X, 164-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RIEPGENESPES.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DDDCE586-4850-449E-A2C3-2627A597C94A");
    PAN_RIEPGENESPES.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEPGENESPES.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RIEPGENESPES.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RIEPGENESPES.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RIEPGENESPES.InitStatus = 2;
    PAN_RIEPGENESPES_Init();
    PAN_RIEPGENESPES_InitFields();
    PAN_RIEPGENESPES_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PAR14, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RIEGENSPEPRE_PAR11();
      }
      PAN_RIEPGENESPES.UpdatePanel(MainFrm);
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
    return (obj instanceof RiepilogoGeneraleSpesePreventivo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RiepilogoGeneraleSpesePreventivo.class.getName() : (Glb.ClassWithPackage(RiepilogoGeneraleSpesePreventivo.class) ? RiepilogoGeneraleSpesePreventivo.class.getName().substring(RiepilogoGeneraleSpesePreventivo.class.getPackage().getName().length() + 1) : RiepilogoGeneraleSpesePreventivo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
      IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR2 = (new IDVariant("TIPO"));
      IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR3 = (new IDVariant("ATTUALE"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Riepilogo_Gen_Spese"));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR2, ((IMDB.Value(IMDBDef11.PQRY_PARAMETRI188, IMDBDef11.PQSL_PARAMETRI188_ROWNAMDABISI, 0).equals((new IDVariant(1)), true))?(new IDVariant("S")):(new IDVariant("E"))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IMDB.Value(IMDBDef11.PQRY_PAR11, IMDBDef11.PQSL_PAR11_ROWNAMSTAATT, 0));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiepilogoGeneraleSpesePreventivo", "Elabora", _e);
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
    IDVariant v_CA = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CA = (new IDVariant("Riepilogo Generale Spese", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CA, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_PAR14, IMDBDef3.FLD_PAR14_ROWNAMDABISI, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PAR14, IMDBDef3.FLD_PAR14_ROWNAMSTAATT, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiepilogoGeneraleSpesePreventivo", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Riepilogo Generale Spese On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RIEPGENESPES_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_RIEPGENESPES);
      // 
      // Riepilogo Generale Spese On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PAR11, IMDBDef11.PQSL_PAR11_ROWNAMDABISI, 0).equals((new IDVariant("S")), true))
      {
        PAN_RIEPGENESPES.SetFlags (Glb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_RIEPGENESPES.SetFlags (Glb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiepilogoGeneraleSpesePreventivo", "RiepilogoGeneraleSpeseOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Riepilogo Generale Spese On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_RIEPGENESPES_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riepilogo Generale Spese On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_RIEPGENESPES_DABILANSIMUL)), true))
      {
        if (IMDB.Value(IMDBDef11.PQRY_PAR11, IMDBDef11.PQSL_PAR11_ROWNAMDABISI, 0).equals((new IDVariant("S")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PAR11, IMDBDef11.PQSL_PAR11_ROWNAMSTAATT, 0, (new IDVariant("NO")));
          PAN_RIEPGENESPES.SetFlags (Glb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_RIEPGENESPES.SetFlags (Glb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiepilogoGeneraleSpesePreventivo", "RiepilogoGeneraleSpeseOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void RIEGENSPEPRE_PAR11() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PAR11_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PAR14, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PAR14, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PAR11_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PAR11_RS, 0, IMDBDef3.TBL_PAR14, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PAR11_RS, 0, 0, IMDBDef3.TBL_PAR14, IMDBDef3.FLD_PAR14_ROWNAMDABISI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PAR11_RS, 1, 0, IMDBDef3.TBL_PAR14, IMDBDef3.FLD_PAR14_ROWNAMSTAATT, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PAR14, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PAR14, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PAR14, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PAR11_RS, 0);
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
  private void PAN_RIEPGENESPES_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RIEPGENESPES, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RIEPGENESPES_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RIEPGENESPES, Cancel);
    // Stub
  }

  private void PAN_RIEPGENESPES_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_RIEPGENESPES_ELABORA)
    {
      this.IdxPanelActived = this.PAN_RIEPGENESPES.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_RIEPGENESPES_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_RIEPGENESPES_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_RIEPGENESPES_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RIEPGENESPES_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_RIEPGENESPES_Init()
  {

    PAN_RIEPGENESPES.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RIEPGENESPES.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_RIEPGENESPES.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_RIEPGENESPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_DABILANSIMUL, "82CA1AF3-DB2F-4047-BF73-C5E63A5C2E0B");
    PAN_RIEPGENESPES.set_Header(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_DABILANSIMUL, "Da Bilancio Simulato");
    PAN_RIEPGENESPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_DABILANSIMUL, "");
    PAN_RIEPGENESPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_DABILANSIMUL, MyGlb.VIS_CHECKSTYLE);
    PAN_RIEPGENESPES.SetFlags(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_DABILANSIMUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RIEPGENESPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, "4FBC8862-4C79-495E-887D-3D63676BEC7E");
    PAN_RIEPGENESPES.set_Header(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, "Stanziamento Attuale");
    PAN_RIEPGENESPES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, "");
    PAN_RIEPGENESPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, MyGlb.VIS_CHECKSTYLE);
    PAN_RIEPGENESPES.SetFlags(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RIEPGENESPES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_ELABORA, "C62DCDFE-2250-4C58-B195-39014CD7E778");
    PAN_RIEPGENESPES.set_Header(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_ELABORA, "Elabora");
    PAN_RIEPGENESPES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_RIEPGENESPES.SetImage(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_ELABORA, 0, "button1.gif", false);
    PAN_RIEPGENESPES.SetFlags(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_RIEPGENESPES_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RIEPGENESPES.SetRect(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_DABILANSIMUL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEPGENESPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_DABILANSIMUL, MyGlb.PANEL_LIST, 104);
    PAN_RIEPGENESPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_DABILANSIMUL, MyGlb.PANEL_LIST, 1);
    PAN_RIEPGENESPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_DABILANSIMUL, MyGlb.PANEL_LIST, "Da Bil. Simul.");
    PAN_RIEPGENESPES.SetRect(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_DABILANSIMUL, MyGlb.PANEL_FORM, 32, 16, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEPGENESPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_DABILANSIMUL, MyGlb.PANEL_FORM, 132);
    PAN_RIEPGENESPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_DABILANSIMUL, MyGlb.PANEL_FORM, 1);
    PAN_RIEPGENESPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_DABILANSIMUL, MyGlb.PANEL_FORM, "Da Bilancio Simulato");
    PAN_RIEPGENESPES.SetFieldPage(PFL_RIEPGENESPES_DABILANSIMUL, -1, -1);
    PAN_RIEPGENESPES.SetFieldPanel(PFL_RIEPGENESPES_DABILANSIMUL, PPQRY_PAR11, "A.ROWNAMDABISI", "ROWNAMDABISI", 5, 1, 0, -13997);
    PAN_RIEPGENESPES.SetValueListItem(PFL_RIEPGENESPES_DABILANSIMUL, (new IDVariant("S")), "S", "", "", -1);
    PAN_RIEPGENESPES.SetValueListItem(PFL_RIEPGENESPES_DABILANSIMUL, (new IDVariant("E")), "E", "", "", -1);
    PAN_RIEPGENESPES.SetRect(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEPGENESPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, MyGlb.PANEL_LIST, 112);
    PAN_RIEPGENESPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_RIEPGENESPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, MyGlb.PANEL_LIST, "Stan. Att.");
    PAN_RIEPGENESPES.SetRect(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, MyGlb.PANEL_FORM, 24, 44, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEPGENESPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, MyGlb.PANEL_FORM, 140);
    PAN_RIEPGENESPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_RIEPGENESPES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_STANZIATTUAL, MyGlb.PANEL_FORM, "Stanziamento Attuale");
    PAN_RIEPGENESPES.SetFieldPage(PFL_RIEPGENESPES_STANZIATTUAL, -1, -1);
    PAN_RIEPGENESPES.SetFieldPanel(PFL_RIEPGENESPES_STANZIATTUAL, PPQRY_PAR11, "A.ROWNAMSTAATT", "ROWNAMSTAATT", 5, 2, 0, -13997);
    PAN_RIEPGENESPES.SetValueListItem(PFL_RIEPGENESPES_STANZIATTUAL, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_RIEPGENESPES.SetValueListItem(PFL_RIEPGENESPES_STANZIATTUAL, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_RIEPGENESPES.SetRect(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_ELABORA, MyGlb.PANEL_LIST, 60, 56, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEPGENESPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_RIEPGENESPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_RIEPGENESPES.SetRect(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_ELABORA, MyGlb.PANEL_FORM, 108, 88, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEPGENESPES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_RIEPGENESPES.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEPGENESPES_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_RIEPGENESPES.SetFieldPage(PFL_RIEPGENESPES_ELABORA, -1, -1);
    PAN_RIEPGENESPES.SetFieldPanel(PFL_RIEPGENESPES_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_RIEPGENESPES_InitQueries()
  {
    StringBuffer SQL;

    PAN_RIEPGENESPES.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RIEPGENESPES.SetIMDB(IMDB, "PQRY_PAR11", true);
    PAN_RIEPGENESPES.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_RIEPGENESPES.SetQueryIMDB(PPQRY_PAR11, IMDBDef11.PQRY_PAR11_RS, IMDBDef3.TBL_PAR14);
    JustLoaded = true;
    PAN_RIEPGENESPES.SetFieldPrimaryIndex(PFL_RIEPGENESPES_DABILANSIMUL, IMDBDef3.FLD_PAR14_ROWNAMDABISI);
    PAN_RIEPGENESPES.SetFieldPrimaryIndex(PFL_RIEPGENESPES_STANZIATTUAL, IMDBDef3.FLD_PAR14_ROWNAMSTAATT);
    PAN_RIEPGENESPES.SetMasterTable(0, "PAR14");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RIEPGENESPES.Status() == 2)
    {
      int oldListQBE = PAN_RIEPGENESPES.iUseListQBE;
      PAN_RIEPGENESPES.iUseListQBE = 0;
      PAN_RIEPGENESPES.PanelCommand(Glb.PCM_SEARCH);
      PAN_RIEPGENESPES.PanelCommand(Glb.PCM_FIND);
      PAN_RIEPGENESPES.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_RIEPGENESPES) PAN_RIEPGENESPES_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_RIEPGENESPES) PAN_RIEPGENESPES_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_RIEPGENESPES) PAN_RIEPGENESPES_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_RIEPGENESPES) PAN_RIEPGENESPES_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_RIEPGENESPES) PAN_RIEPGENESPES_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
