// **********************************************
// Variazioni A Tesoreria
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniATesoreria extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_SEDEDELIBERA = 0;
  private static int PFL_PARAMETRI_NUMERODELIBE = 1;
  private static int PFL_PARAMETRI_ANNODELIBERA = 2;
  private static int PFL_PARAMETRI_DELIBERLABEL = 3;
  private static int PFL_PARAMETRI_TRATTINLABEL = 4;
  private static int PFL_PARAMETRI_BARRALABEL = 5;
  private static int PFL_PARAMETRI_APRISCEGDELI = 6;
  private static int PFL_PARAMETRI_APRIINFODELI = 7;
  private static int PFL_PARAMETRI_ELABORA = 8;

  private static int PPQRY_PARAMETRI326 = 0;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI226(IMDB);
    //
    //
    Init_PQRY_PARAMETRI326(IMDB);
    Init_PQRY_PARAMETRI326_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI226(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI226, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI226, "TBL_PARAMETRI226");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI226,IMDBDef3.FLD_PARAMETRI226_PARASEDEDELI, "PARASEDEDELI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI226,IMDBDef3.FLD_PARAMETRI226_PARASEDEDELI,5,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI226,IMDBDef3.FLD_PARAMETRI226_PARANUMEDELI, "PARANUMEDELI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI226,IMDBDef3.FLD_PARAMETRI226_PARANUMEDELI,1,6,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI226,IMDBDef3.FLD_PARAMETRI226_PARAANNODELI, "PARAANNODELI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI226,IMDBDef3.FLD_PARAMETRI226_PARAANNODELI,1,4,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI226, 0);
  }

  private static void Init_PQRY_PARAMETRI326(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI326, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI326, "PQRY_PARAMETRI326");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI326,IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI, "PARASEDEDELI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI326,IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI326,IMDBDef12.PQSL_PARAMETRI326_PARANUMEDELI, "PARANUMEDELI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI326,IMDBDef12.PQSL_PARAMETRI326_PARANUMEDELI,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI326,IMDBDef12.PQSL_PARAMETRI326_PARAANNODELI, "PARAANNODELI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI326,IMDBDef12.PQSL_PARAMETRI326_PARAANNODELI,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI326, 0);
  }

  private static void Init_PQRY_PARAMETRI326_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI326_RS, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI326_RS, "PQRY_PARAMETRI326_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI326_RS,IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI, "PARASEDEDELI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI326_RS,IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI326_RS,IMDBDef12.PQSL_PARAMETRI326_PARANUMEDELI, "PARANUMEDELI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI326_RS,IMDBDef12.PQSL_PARAMETRI326_PARANUMEDELI,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI326_RS,IMDBDef12.PQSL_PARAMETRI326_PARAANNODELI, "PARAANNODELI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI326_RS,IMDBDef12.PQSL_PARAMETRI326_PARAANNODELI,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniATesoreria(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniATesoreria()
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
    FormIdx = MyGlb.FRM_VARIAZATESOR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "98F69987-19D6-4F4C-9A3F-3A5E2A01D5EA";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 308;
    DesignHeight = 162;
    set_Caption(new IDVariant("Variazioni A Tesoreria"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 308;
    Frames[1].Height = 136;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 136;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 308-MyGlb.PAN_OFFS_X, 136-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A5CBB204-C500-4D15-85B3-13A1F747E0F2");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 120, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI226, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIAZATESOR_PARAMETRI326();
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRISCEGDELI) {
      }
    }
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
    return (obj instanceof VariazioniATesoreria);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniATesoreria.class.getName() : (Glb.ClassWithPackage(VariazioniATesoreria.class) ? VariazioniATesoreria.class.getName().substring(VariazioniATesoreria.class.getPackage().getName().length() + 1) : VariazioniATesoreria.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Variazioni a Tesoreria", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI226, IMDBDef3.FLD_PARAMETRI226_PARASEDEDELI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI226, IMDBDef3.FLD_PARAMETRI226_PARANUMEDELI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI226, IMDBDef3.FLD_PARAMETRI226_PARAANNODELI, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniATesoreria", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARANUMEDELI, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARAANNODELI, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniATesoreria", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARANUMEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARAANNODELI, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniATesoreria", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_SEDEDELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniATesoreria", "ParametriOnUpdatingRowEvent", _e);
    }
  }

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
    IDVariant v_OUTFILE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_FASE = new IDVariant(0,IDVariant.STRING);
    IDCachedRowSet C12;

    try
    {
      TransCount = 0;
      v_OUTFILE = (new IDVariant("VARIAZIONI.txt", IDVariant.STRING));
      v_FASE = (new IDVariant("VBI_MPS", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARANUMEDELI, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARAANNODELI, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Delibera Obbligatoria", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARANUMEDELI, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARAANNODELI, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Dati Delibera Incompleti", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if (MainFrm.ControlloEsistenzaDelibere(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARANUMEDELI, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARAANNODELI, 0), (new IDVariant(-1))).equals((new IDVariant(-1)), true))
      {
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.GENERATESOVBIMPS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARAANNODELI, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARANUMEDELI, 0), IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI, 0), MainFrm.PROGRESESSIO);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      if ((new IDVariant(-1)).equals((new IDVariant(-1)), true))
      {
        IDVariant v_FD = new IDVariant(0,IDVariant.INTEGER);
        // 
        // scrivo il file
        // 
        {
          v_FD = MainFrm.VBFile.FreeFile();
          MainFrm.VBFile.OpenForOutput(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), v_OUTFILE), v_FD, false); 
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.DATI as WOREXPTESDA1, ");
          SQL.append("  A.ORDINAMENTO as WOREXPTESORD ");
          SQL.append("from ");
          SQL.append("  WORK_EXPORT_TESO A ");
          SQL.append("where (A.FASE = " + IDL.CSql(v_FASE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
          SQL.append("order by ");
          SQL.append("  A.ORDINAMENTO ");
          C12 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!C12.EOF()) C12.MoveNext();
          while (!C12.EOF())
          {
            MainFrm.VBFile.WriteLine(v_FD, C12.Get("WOREXPTESDA1")); 
            C12.MoveNext();
          }
          C12.Close();
          MainFrm.VBFile.Close(v_FD); 
          MainFrm.set_RedirectTo(v_OUTFILE);
          MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
          MainFrm.set_RedirectFeatures((new IDVariant(""))); 
        }
      }
      SQL = new StringBuffer();
      SQL.append("delete from WORK_EXPORT_TESO ");
      SQL.append("where (FASE = " + IDL.CSql(v_FASE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniATesoreria", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Delibera
  // **********************************************************************
  public int ApriDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniATesoreria", "ApriDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARAANNODELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARANUMEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARASEDEDELI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARAANNODELI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI326, IMDBDef12.PQSL_PARAMETRI326_PARANUMEDELI, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniATesoreria", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void VARIAZATESOR_PARAMETRI326() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI326_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI226, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI226, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI326_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI326_RS, 0, IMDBDef3.TBL_PARAMETRI226, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI326_RS, 0, 0, IMDBDef3.TBL_PARAMETRI226, IMDBDef3.FLD_PARAMETRI226_PARASEDEDELI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI326_RS, 1, 0, IMDBDef3.TBL_PARAMETRI226, IMDBDef3.FLD_PARAMETRI226_PARANUMEDELI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI326_RS, 2, 0, IMDBDef3.TBL_PARAMETRI226, IMDBDef3.FLD_PARAMETRI226_PARAANNODELI, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI226, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI226, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI226, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI326_RS, 0);
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

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_APRISCEGDELI)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRIINFODELI)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, "6C81CA8A-4A51-49FE-B443-F56EB20E528F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, "Sede Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "65A7CE66-4585-424E-AFB7-16E322C8624F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "Numero Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "C4DC0C6E-E689-43B3-B9E4-975FCAAEE1AB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "Anno Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, "06058B3E-55F8-47FC-B84D-738B27A25D3E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, "Delibera ");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, "8531D2A7-459E-493F-BC5A-B5387E8673C8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, "88C1CD61-3C43-4FED-BA3F-83FE1950D317");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, "783B273E-0C95-43A1-8083-0417CDFC43AA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, "52FF49E4-B5E2-401A-85C8-D13825A7DAF4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "896F3167-8E0F-427C-A576-6B2963BF0644");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_LIST, "Sd. Delib.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_FORM, 72, 16, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDELIBERA, MyGlb.PANEL_FORM, "Sd. Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SEDEDELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SEDEDELIBERA, PPQRY_PARAMETRI326, "A.PARASEDEDELI", "PARASEDEDELI", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, "Num. Delib.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 140, 16, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODELIBE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODELIBE, PPQRY_PARAMETRI326, "A.PARANUMEDELI", "PARANUMEDELI", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, "Ann. Delib.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 208, 16, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, "Ann. Delib.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODELIBERA, PPQRY_PARAMETRI326, "A.PARAANNODELI", "PARAANNODELI", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 12, 16, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 12, 16, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERLABEL, -1, "", "DELIBERLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 20, 24, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 120, 16, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTINLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTINLABEL, -1, "", "TRATTINLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_LIST, 28, 32, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_FORM, 188, 16, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRALABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRALABEL, -1, "", "BARRALABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, MyGlb.PANEL_LIST, 228, 16, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, MyGlb.PANEL_FORM, 248, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRISCEGDELI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRISCEGDELI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRISCEGDELI, -1, "", "APRISCEGDELI", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_LIST, 236, 24, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_FORM, 268, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIINFODELI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRIINFODELI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRIINFODELI, -1, "", "APRIINFODELI", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 428, 292, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 200, 68, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI326", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI326, IMDBDef12.PQRY_PARAMETRI326_RS, IMDBDef3.TBL_PARAMETRI226);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SEDEDELIBERA, IMDBDef3.FLD_PARAMETRI226_PARASEDEDELI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODELIBE, IMDBDef3.FLD_PARAMETRI226_PARANUMEDELI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODELIBERA, IMDBDef3.FLD_PARAMETRI226_PARAANNODELI);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI226");
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
