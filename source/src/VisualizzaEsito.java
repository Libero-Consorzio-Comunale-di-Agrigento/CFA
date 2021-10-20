// **********************************************
// Visualizza Esito
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VisualizzaEsito extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VISUALIESITO_NOMEFILEESIT = 0;
  private static int PFL_VISUALIESITO_TIPOFILE = 1;
  private static int PFL_VISUALIESITO_DATARICEZION = 2;
  private static int PFL_VISUALIESITO_DOWNLOAD = 3;
  private static int PFL_VISUALIESITO_ESITO = 4;
  private static int PFL_VISUALIESITO_IDARCHIVIO = 5;
  private static int PFL_VISUALIESITO_NOMEARCHIVIO = 6;
  private static int PFL_VISUALIESITO_CODICEERRORE = 7;
  private static int PFL_VISUALIESITO_DESCERRORE = 8;
  private static int PFL_VISUALIESITO_MESSAGEID = 9;
  private static int PFL_VISUALIESITO_NOTE = 10;
  private static int PFL_VISUALIESITO_APRINOTE = 11;
  private static int PFL_VISUALIESITO_FILEXML = 12;

  private static int PPQRY_CFATESITFILE = 0;


  IDPanel PAN_VISUALIESITO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARSVISESITO(IMDB);
    //
    //
    Init_PQRY_CFATESITFILE(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARSVISESITO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARSVISESITO, 1);
    IMDB.set_TblCode(IMDBDef2.TBL_PARSVISESITO, "TBL_PARSVISESITO");
    IMDB.set_FldCode(IMDBDef2.TBL_PARSVISESITO,IMDBDef2.FLD_PARSVISESITO_ID_FILE, "ID_FILE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARSVISESITO,IMDBDef2.FLD_PARSVISESITO_ID_FILE,5,18,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARSVISESITO, 0);
  }

  private static void Init_PQRY_CFATESITFILE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CFATESITFILE, 13);
    IMDB.set_TblCode(IMDBDef10.PQRY_CFATESITFILE, "PQRY_CFATESITFILE");
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECFESNOFIES, "RECFESNOFIES");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECFESNOFIES,5,300,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECCFAESTIFI, "RECCFAESTIFI");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECCFAESTIFI,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECFESFIDARI, "RECFESFIDARI");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECFESFIDARI,8,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECCFAESFIES, "RECCFAESFIES");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECCFAESFIES,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECFESFIIDAR, "RECFESFIIDAR");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECFESFIIDAR,5,100,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECFESFINOAR, "RECFESFINOAR");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECFESFINOAR,5,300,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECFESFICOER, "RECFESFICOER");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECFESFICOER,5,200,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECFESFIDEER, "RECFESFIDEER");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECFESFIDEER,5,2000,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECFESFIMEID, "RECFESFIMEID");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECFESFIMEID,5,300,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECCFAESFINO, "RECCFAESFINO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECCFAESFINO,5,2000,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_APRINOTE, "APRINOTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_APRINOTE,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_DOWNLOAD, "DOWNLOAD");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_DOWNLOAD,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECCFAESFIXM, "RECCFAESFIXM");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATESITFILE,IMDBDef10.PQSL_CFATESITFILE_RECCFAESFIXM,9,9999,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CFATESITFILE, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VisualizzaEsito(MyWebEntryPoint w, IMDBObj imdb)
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
  public VisualizzaEsito()
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
    FormIdx = MyGlb.FRM_VISUALIESITO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BA6DB050-6642-44FE-8712-074F6718002B";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 872;
    DesignHeight = 434;
    set_Caption(new IDVariant("Visualizza Esito"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 872;
    Frames[1].Height = 408;
    Frames[1].Caption = "Visualizza Esito";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 408;
    PAN_VISUALIESITO = new IDPanel(w, this, 1, "PAN_VISUALIESITO");
    Frames[1].Content = PAN_VISUALIESITO;
    PAN_VISUALIESITO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VISUALIESITO.VS = MainFrm.VisualStyleList;
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 872-MyGlb.PAN_OFFS_X, 408-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VISUALIESITO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C7232062-9E87-41BC-A29B-9FF4AD2F7C00");
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3200, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VISUALIESITO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VISUALIESITO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VISUALIESITO.InitStatus = 2;
    PAN_VISUALIESITO_Init();
    PAN_VISUALIESITO_InitFields();
    PAN_VISUALIESITO_InitQueries();
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
      PAN_VISUALIESITO.UpdatePanel(MainFrm);
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
    return (obj instanceof VisualizzaEsito);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VisualizzaEsito.class.getName() : (Glb.ClassWithPackage(VisualizzaEsito.class) ? VisualizzaEsito.class.getName().substring(VisualizzaEsito.class.getPackage().getName().length() + 1) : VisualizzaEsito.class.getName()));
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
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaEsito", "Load", _e);
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
      UNLOAD_PARVISESIDEL();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaEsito", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars Vis Esito: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARVISESIDEL() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARSVISESITO, IMDBDef2.FLD_PARSVISESITO_ID_FILE, 0, new IDVariant());
  }

  // **********************************************************************
  // Visualizza Esito On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VISUALIESITO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VISUALIESITO);
      // 
      // Visualizza Esito On Dynamic Properties Body
      // Corpo Procedura
      // 
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Scarica il File XML di esito"));
      PAN_VISUALIESITO.set_ToolTip(Glb.OBJ_FIELD,PFL_VISUALIESITO_IDARCHIVIO,(new IDVariant(PAN_VISUALIESITO.FieldText(PFL_VISUALIESITO_IDARCHIVIO))).stringValue()); 
      PAN_VISUALIESITO.set_ToolTip(Glb.OBJ_FIELD,PFL_VISUALIESITO_NOMEARCHIVIO,(new IDVariant(PAN_VISUALIESITO.FieldText(PFL_VISUALIESITO_NOMEARCHIVIO))).stringValue()); 
      PAN_VISUALIESITO.set_ToolTip(Glb.OBJ_FIELD,PFL_VISUALIESITO_CODICEERRORE,(new IDVariant(PAN_VISUALIESITO.FieldText(PFL_VISUALIESITO_CODICEERRORE))).stringValue()); 
      PAN_VISUALIESITO.set_ToolTip(Glb.OBJ_FIELD,PFL_VISUALIESITO_DESCERRORE,(new IDVariant(PAN_VISUALIESITO.FieldText(PFL_VISUALIESITO_DESCERRORE))).stringValue()); 
      PAN_VISUALIESITO.set_ToolTip(Glb.OBJ_FIELD,PFL_VISUALIESITO_MESSAGEID,(new IDVariant(PAN_VISUALIESITO.FieldText(PFL_VISUALIESITO_MESSAGEID))).stringValue()); 
      PAN_VISUALIESITO.set_ToolTip(Glb.OBJ_FIELD,PFL_VISUALIESITO_DOWNLOAD,S.stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaEsito", "VisualizzaEsitoOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Apri Note
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Note Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef10.PQRY_CFATESITFILE, IMDBDef10.PQSL_CFATESITFILE_RECCFAESFINO, 0), (new IDVariant("Note")), (new IDVariant(0)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaEsito", "ApriNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Download
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Download ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Download Body
      // Corpo Procedura
      // 
      IDVariant v_NOMEFILE = new IDVariant(0,IDVariant.STRING);
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFATESITFILE, IMDBDef10.PQSL_CFATESITFILE_RECFESNOFIES, 0)))
      {
        return 0;
      }
      IDVariant v_FD = null;
      v_FD = MainFrm.VBFile.FreeFile();
      v_NOMEFILE = IMDB.Value(IMDBDef10.PQRY_CFATESITFILE, IMDBDef10.PQSL_CFATESITFILE_RECFESNOFIES, 0);
      MainFrm.VBFile.OpenForOutput(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), (new IDVariant("temp"))), (new IDVariant("/"))), v_NOMEFILE), v_FD, false); 
      MainFrm.VBFile.WriteLine(v_FD, IMDB.Value(IMDBDef10.PQRY_CFATESITFILE, IMDBDef10.PQSL_CFATESITFILE_RECCFAESFIXM, 0)); 
      MainFrm.VBFile.Close(v_FD); 
      MainFrm.AddTempFile(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("temp/"))), v_NOMEFILE).stringValue()); 
      MainFrm.set_RedirectTo(IDL.Add((new IDVariant("temp/")), v_NOMEFILE));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant("save"))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VisualizzaEsito", "Download", _e);
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
  private void PAN_VISUALIESITO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VISUALIESITO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VISUALIESITO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VISUALIESITO, Cancel);
    // Stub
  }

  private void PAN_VISUALIESITO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VISUALIESITO_DOWNLOAD)
    {
      this.IdxPanelActived = this.PAN_VISUALIESITO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Download();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VISUALIESITO_APRINOTE)
    {
      this.IdxPanelActived = this.PAN_VISUALIESITO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VISUALIESITO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VISUALIESITO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VISUALIESITO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VISUALIESITO_Init()
  {

    PAN_VISUALIESITO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VISUALIESITO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VISUALIESITO.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_VISUALIESITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEFILEESIT, "1A08DFE0-42F1-42DD-8A6B-EC44041856BE");
    PAN_VISUALIESITO.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEFILEESIT, "Nome File Esito");
    PAN_VISUALIESITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEFILEESIT, "");
    PAN_VISUALIESITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEFILEESIT, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALIESITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEFILEESIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VISUALIESITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_TIPOFILE, "98F4E104-B055-48A6-BD74-B2253BF2FEE5");
    PAN_VISUALIESITO.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_TIPOFILE, "Tipo File");
    PAN_VISUALIESITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_TIPOFILE, "");
    PAN_VISUALIESITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_TIPOFILE, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALIESITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_TIPOFILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_VISUALIESITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DATARICEZION, "0B0E9AC7-F0AC-4B9C-8817-A325F5F0E3F1");
    PAN_VISUALIESITO.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DATARICEZION, "Data Ricezione");
    PAN_VISUALIESITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DATARICEZION, "");
    PAN_VISUALIESITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DATARICEZION, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALIESITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DATARICEZION, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VISUALIESITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DOWNLOAD, "8C646322-A3B5-47A4-B947-06D0FAB96B9A");
    PAN_VISUALIESITO.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DOWNLOAD, " ");
    PAN_VISUALIESITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DOWNLOAD, "");
    PAN_VISUALIESITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DOWNLOAD, MyGlb.VIS_HYPELINKIMMA);
    PAN_VISUALIESITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DOWNLOAD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALIESITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_ESITO, "54B67E3B-3010-46C6-8408-B737C68074BB");
    PAN_VISUALIESITO.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_ESITO, "Esito");
    PAN_VISUALIESITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_ESITO, "");
    PAN_VISUALIESITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_ESITO, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALIESITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_ESITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VISUALIESITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_IDARCHIVIO, "440A4DF4-F5DC-4315-9843-7EFEF04EB5E0");
    PAN_VISUALIESITO.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_IDARCHIVIO, "ID Archivio");
    PAN_VISUALIESITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_IDARCHIVIO, "");
    PAN_VISUALIESITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_IDARCHIVIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALIESITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_IDARCHIVIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALIESITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEARCHIVIO, "879358AA-172E-413E-886E-7965B981F314");
    PAN_VISUALIESITO.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEARCHIVIO, "Nome Archivio");
    PAN_VISUALIESITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEARCHIVIO, "");
    PAN_VISUALIESITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEARCHIVIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALIESITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEARCHIVIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALIESITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_CODICEERRORE, "DCDC4D27-C438-4CC1-ACA6-DA97947AAB8F");
    PAN_VISUALIESITO.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_CODICEERRORE, "Codice Errore");
    PAN_VISUALIESITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_CODICEERRORE, "");
    PAN_VISUALIESITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_CODICEERRORE, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALIESITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_CODICEERRORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALIESITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DESCERRORE, "050B11F0-D81E-444C-860E-CFABA9E4958A");
    PAN_VISUALIESITO.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DESCERRORE, "Descrizione Errore");
    PAN_VISUALIESITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DESCERRORE, "");
    PAN_VISUALIESITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DESCERRORE, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALIESITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DESCERRORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALIESITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_MESSAGEID, "9D10374C-671F-48ED-ACDF-990B5A4247B3");
    PAN_VISUALIESITO.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_MESSAGEID, "Message ID");
    PAN_VISUALIESITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_MESSAGEID, "");
    PAN_VISUALIESITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_MESSAGEID, MyGlb.VIS_NORMALFIELDS);
    PAN_VISUALIESITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_MESSAGEID, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALIESITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOTE, "76695FB6-8530-44CE-9A7B-B0BA6CB3B7AA");
    PAN_VISUALIESITO.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOTE, "NOTE");
    PAN_VISUALIESITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOTE, "");
    PAN_VISUALIESITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOTE, MyGlb.VIS_NORMFIELPADR);
    PAN_VISUALIESITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALIESITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_APRINOTE, "92F0A026-8F40-444A-8EA0-677079B7A7C0");
    PAN_VISUALIESITO.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_APRINOTE, " ");
    PAN_VISUALIESITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_APRINOTE, "Note");
    PAN_VISUALIESITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_APRINOTE, MyGlb.VIS_HYPELINKIMMA);
    PAN_VISUALIESITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_APRINOTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VISUALIESITO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_FILEXML, "2D232BF4-781C-48AA-9288-331BEE26774B");
    PAN_VISUALIESITO.set_Header(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_FILEXML, "FILE XML");
    PAN_VISUALIESITO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_FILEXML, "");
    PAN_VISUALIESITO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_FILEXML, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISUALIESITO.SetFlags(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_FILEXML, 0, -1);
  }

  private void PAN_VISUALIESITO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEFILEESIT, MyGlb.PANEL_LIST, 0, 36, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEFILEESIT, MyGlb.PANEL_LIST, 104);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEFILEESIT, MyGlb.PANEL_LIST, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEFILEESIT, MyGlb.PANEL_LIST, "Nome File Esito");
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEFILEESIT, MyGlb.PANEL_FORM, 4, 4, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEFILEESIT, MyGlb.PANEL_FORM, 100);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEFILEESIT, MyGlb.PANEL_FORM, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEFILEESIT, MyGlb.PANEL_FORM, "Nome File Esito");
    PAN_VISUALIESITO.SetFieldPage(PFL_VISUALIESITO_NOMEFILEESIT, -1, -1);
    PAN_VISUALIESITO.SetFieldPanel(PFL_VISUALIESITO_NOMEFILEESIT, PPQRY_CFATESITFILE, "A.NOME_FILE_ESITO", "RECFESNOFIES", 5, 300, 0, -13997);
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_TIPOFILE, MyGlb.PANEL_LIST, 240, 36, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_TIPOFILE, MyGlb.PANEL_LIST, 64);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_TIPOFILE, MyGlb.PANEL_LIST, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_TIPOFILE, MyGlb.PANEL_LIST, "Tipo File");
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_TIPOFILE, MyGlb.PANEL_FORM, 4, 52, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_TIPOFILE, MyGlb.PANEL_FORM, 64);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_TIPOFILE, MyGlb.PANEL_FORM, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_TIPOFILE, MyGlb.PANEL_FORM, "Tipo File");
    PAN_VISUALIESITO.SetFieldPage(PFL_VISUALIESITO_TIPOFILE, -1, -1);
    PAN_VISUALIESITO.SetFieldPanel(PFL_VISUALIESITO_TIPOFILE, PPQRY_CFATESITFILE, "A.TIPO_FILE", "RECCFAESTIFI", 5, 2, 0, -13997);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_TIPOFILE, (new IDVariant("ED")), "ED - Notifica di esito relativa a file dati fattura", "Scrivi il valore e spiega cosa significa", "", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_TIPOFILE, (new IDVariant("EL")), "EL - Notifica di esito relativa a file comunicazioni IVA", "", "", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_TIPOFILE, (new IDVariant("EF")), "EF - Notifica di esito relativa a file compresso (.zip) di tipo FL", "", "", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_TIPOFILE, (new IDVariant("NA")), "NA - Notifica di esito relativa a file non identificato", "", "", -1);
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DATARICEZION, MyGlb.PANEL_LIST, 544, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DATARICEZION, MyGlb.PANEL_LIST, 104);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DATARICEZION, MyGlb.PANEL_LIST, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DATARICEZION, MyGlb.PANEL_LIST, "Data Ricezione");
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DATARICEZION, MyGlb.PANEL_FORM, 372, 4, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DATARICEZION, MyGlb.PANEL_FORM, 96);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DATARICEZION, MyGlb.PANEL_FORM, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DATARICEZION, MyGlb.PANEL_FORM, "Data Ricezione");
    PAN_VISUALIESITO.SetFieldPage(PFL_VISUALIESITO_DATARICEZION, -1, -1);
    PAN_VISUALIESITO.SetFieldPanel(PFL_VISUALIESITO_DATARICEZION, PPQRY_CFATESITFILE, "A.DATA_RICEZIONE", "RECFESFIDARI", 8, 19, 0, -13997);
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DOWNLOAD, MyGlb.PANEL_LIST, 660, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DOWNLOAD, MyGlb.PANEL_LIST, 64);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DOWNLOAD, MyGlb.PANEL_LIST, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DOWNLOAD, MyGlb.PANEL_LIST, " ");
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DOWNLOAD, MyGlb.PANEL_FORM, 4, 332, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DOWNLOAD, MyGlb.PANEL_FORM, 64);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DOWNLOAD, MyGlb.PANEL_FORM, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DOWNLOAD, MyGlb.PANEL_FORM, " ");
    PAN_VISUALIESITO.SetFieldPage(PFL_VISUALIESITO_DOWNLOAD, -1, -1);
    PAN_VISUALIESITO.SetFieldUnbound(PFL_VISUALIESITO_DOWNLOAD, true);
    PAN_VISUALIESITO.SetFieldPanel(PFL_VISUALIESITO_DOWNLOAD, PPQRY_CFATESITFILE, "'T'", "DOWNLOAD", 5, 1, 0, -13997);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_DOWNLOAD, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_ESITO, MyGlb.PANEL_LIST, 680, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_ESITO, MyGlb.PANEL_LIST, 44);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_ESITO, MyGlb.PANEL_LIST, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_ESITO, MyGlb.PANEL_LIST, "Esito");
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_ESITO, MyGlb.PANEL_FORM, 584, 4, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_ESITO, MyGlb.PANEL_FORM, 44);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_ESITO, MyGlb.PANEL_FORM, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_ESITO, MyGlb.PANEL_FORM, "Esito");
    PAN_VISUALIESITO.SetFieldPage(PFL_VISUALIESITO_ESITO, -1, -1);
    PAN_VISUALIESITO.SetFieldPanel(PFL_VISUALIESITO_ESITO, PPQRY_CFATESITFILE, "A.ESITO", "RECCFAESFIES", 5, 4, 0, -13997);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_ESITO, (new IDVariant("ES01")), "ES01 - File validato", "", "", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_ESITO, (new IDVariant("ES02")), "ES02 - File validato con segnalazione", "", "", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_ESITO, (new IDVariant("ES03")), "ES03 - File scartato", "", "", -1);
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_IDARCHIVIO, MyGlb.PANEL_LIST, 872, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_IDARCHIVIO, MyGlb.PANEL_LIST, 80);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_IDARCHIVIO, MyGlb.PANEL_LIST, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_IDARCHIVIO, MyGlb.PANEL_LIST, "ID Archivio");
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_IDARCHIVIO, MyGlb.PANEL_FORM, 24, 28, 796, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_IDARCHIVIO, MyGlb.PANEL_FORM, 80);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_IDARCHIVIO, MyGlb.PANEL_FORM, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_IDARCHIVIO, MyGlb.PANEL_FORM, "ID Archivio");
    PAN_VISUALIESITO.SetFieldPage(PFL_VISUALIESITO_IDARCHIVIO, -1, -1);
    PAN_VISUALIESITO.SetFieldPanel(PFL_VISUALIESITO_IDARCHIVIO, PPQRY_CFATESITFILE, "A.ID_ARCHIVIO", "RECFESFIIDAR", 5, 100, 0, -13997);
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEARCHIVIO, MyGlb.PANEL_LIST, 1380, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEARCHIVIO, MyGlb.PANEL_LIST, 100);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEARCHIVIO, MyGlb.PANEL_LIST, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEARCHIVIO, MyGlb.PANEL_LIST, "Nome Archivio");
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEARCHIVIO, MyGlb.PANEL_FORM, 4, 52, 816, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEARCHIVIO, MyGlb.PANEL_FORM, 100);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEARCHIVIO, MyGlb.PANEL_FORM, 2);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOMEARCHIVIO, MyGlb.PANEL_FORM, "Nome Archivio");
    PAN_VISUALIESITO.SetFieldPage(PFL_VISUALIESITO_NOMEARCHIVIO, -1, -1);
    PAN_VISUALIESITO.SetFieldPanel(PFL_VISUALIESITO_NOMEARCHIVIO, PPQRY_CFATESITFILE, "A.NOME_ARCHIVIO", "RECFESFINOAR", 5, 300, 0, -13997);
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_CODICEERRORE, MyGlb.PANEL_LIST, 1812, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_CODICEERRORE, MyGlb.PANEL_LIST, 96);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_CODICEERRORE, MyGlb.PANEL_LIST, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_CODICEERRORE, MyGlb.PANEL_LIST, "Codice Errore");
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_CODICEERRORE, MyGlb.PANEL_FORM, 8, 100, 812, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_CODICEERRORE, MyGlb.PANEL_FORM, 96);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_CODICEERRORE, MyGlb.PANEL_FORM, 2);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_CODICEERRORE, MyGlb.PANEL_FORM, "Codice Errore");
    PAN_VISUALIESITO.SetFieldPage(PFL_VISUALIESITO_CODICEERRORE, -1, -1);
    PAN_VISUALIESITO.SetFieldPanel(PFL_VISUALIESITO_CODICEERRORE, PPQRY_CFATESITFILE, "A.CODICE_ERRORE", "RECFESFICOER", 5, 200, 0, -13997);
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DESCERRORE, MyGlb.PANEL_LIST, 2316, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DESCERRORE, MyGlb.PANEL_LIST, 84);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DESCERRORE, MyGlb.PANEL_LIST, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DESCERRORE, MyGlb.PANEL_LIST, "Descrizione Errore");
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DESCERRORE, MyGlb.PANEL_FORM, 20, 136, 800, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DESCERRORE, MyGlb.PANEL_FORM, 84);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DESCERRORE, MyGlb.PANEL_FORM, 2);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_DESCERRORE, MyGlb.PANEL_FORM, "Descrizione Errore");
    PAN_VISUALIESITO.SetFieldPage(PFL_VISUALIESITO_DESCERRORE, -1, -1);
    PAN_VISUALIESITO.SetFieldPanel(PFL_VISUALIESITO_DESCERRORE, PPQRY_CFATESITFILE, "A.DESC_ERRORE", "RECFESFIDEER", 5, 2000, 0, -13997);
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_MESSAGEID, MyGlb.PANEL_LIST, 2748, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_MESSAGEID, MyGlb.PANEL_LIST, 76);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_MESSAGEID, MyGlb.PANEL_LIST, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_MESSAGEID, MyGlb.PANEL_LIST, "Message ID");
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_MESSAGEID, MyGlb.PANEL_FORM, 28, 184, 792, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_MESSAGEID, MyGlb.PANEL_FORM, 76);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_MESSAGEID, MyGlb.PANEL_FORM, 2);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_MESSAGEID, MyGlb.PANEL_FORM, "Message ID");
    PAN_VISUALIESITO.SetFieldPage(PFL_VISUALIESITO_MESSAGEID, -1, -1);
    PAN_VISUALIESITO.SetFieldPanel(PFL_VISUALIESITO_MESSAGEID, PPQRY_CFATESITFILE, "A.MESSAGE_ID", "RECFESFIMEID", 5, 300, 0, -13997);
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOTE, MyGlb.PANEL_LIST, 3084, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOTE, MyGlb.PANEL_LIST, 36);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOTE, MyGlb.PANEL_LIST, 2);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOTE, MyGlb.PANEL_LIST, "NOTE");
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOTE, MyGlb.PANEL_FORM, 68, 232, 752, 96, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOTE, MyGlb.PANEL_FORM, 36);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOTE, MyGlb.PANEL_FORM, 6);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_NOTE, MyGlb.PANEL_FORM, "NOTE");
    PAN_VISUALIESITO.SetFieldPage(PFL_VISUALIESITO_NOTE, -1, -1);
    PAN_VISUALIESITO.SetFieldPanel(PFL_VISUALIESITO_NOTE, PPQRY_CFATESITFILE, "A.NOTE", "RECCFAESFINO", 5, 2000, 0, -13997);
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_APRINOTE, MyGlb.PANEL_LIST, 3180, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_APRINOTE, MyGlb.PANEL_LIST, 60);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_APRINOTE, MyGlb.PANEL_LIST, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_APRINOTE, MyGlb.PANEL_LIST, " ");
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_APRINOTE, MyGlb.PANEL_FORM, 4, 332, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_APRINOTE, MyGlb.PANEL_FORM, 60);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_APRINOTE, MyGlb.PANEL_FORM, 1);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_APRINOTE, MyGlb.PANEL_FORM, " ");
    PAN_VISUALIESITO.SetFieldPage(PFL_VISUALIESITO_APRINOTE, -1, -1);
    PAN_VISUALIESITO.SetFieldUnbound(PFL_VISUALIESITO_APRINOTE, true);
    PAN_VISUALIESITO.SetFieldPanel(PFL_VISUALIESITO_APRINOTE, PPQRY_CFATESITFILE, "CASE WHEN (A.NOTE IS NULL) THEN 'N' ELSE 'P' END", "APRINOTE", 5, 99, 0, -13997);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_APRINOTE, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_APRINOTE, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VISUALIESITO.SetValueListItem(PFL_VISUALIESITO_APRINOTE, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_FILEXML, MyGlb.PANEL_LIST, 3200, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_FILEXML, MyGlb.PANEL_LIST, 60);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_FILEXML, MyGlb.PANEL_LIST, 2);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_FILEXML, MyGlb.PANEL_LIST, "FILE XML");
    PAN_VISUALIESITO.SetRect(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_FILEXML, MyGlb.PANEL_FORM, 4, 332, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISUALIESITO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_FILEXML, MyGlb.PANEL_FORM, 60);
    PAN_VISUALIESITO.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_FILEXML, MyGlb.PANEL_FORM, 2);
    PAN_VISUALIESITO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISUALIESITO_FILEXML, MyGlb.PANEL_FORM, "FILE XML");
    PAN_VISUALIESITO.SetFieldPage(PFL_VISUALIESITO_FILEXML, -1, -1);
    PAN_VISUALIESITO.SetFieldPanel(PFL_VISUALIESITO_FILEXML, PPQRY_CFATESITFILE, "A.FILE_XML", "RECCFAESFIXM", 9, 9999, 0, -13997);
  }

  private void PAN_VISUALIESITO_InitQueries()
  {
    StringBuffer SQL;

    PAN_VISUALIESITO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VISUALIESITO.SetIMDB(IMDB, "PQRY_CFATESITFILE", true);
    PAN_VISUALIESITO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NOME_FILE_ESITO as RECFESNOFIES, ");
    SQL.append("  A.TIPO_FILE as RECCFAESTIFI, ");
    SQL.append("  A.DATA_RICEZIONE as RECFESFIDARI, ");
    SQL.append("  A.ESITO as RECCFAESFIES, ");
    SQL.append("  A.ID_ARCHIVIO as RECFESFIIDAR, ");
    SQL.append("  A.NOME_ARCHIVIO as RECFESFINOAR, ");
    SQL.append("  A.CODICE_ERRORE as RECFESFICOER, ");
    SQL.append("  A.DESC_ERRORE as RECFESFIDEER, ");
    SQL.append("  A.MESSAGE_ID as RECFESFIMEID, ");
    SQL.append("  A.NOTE as RECCFAESFINO, ");
    SQL.append("  CASE WHEN (A.NOTE IS NULL) THEN 'N' ELSE 'P' END as APRINOTE, ");
    SQL.append("  'T' as DOWNLOAD, ");
    SQL.append("  A.FILE_XML as RECCFAESFIXM ");
    PAN_VISUALIESITO.SetQuery(PPQRY_CFATESITFILE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CFAT_ESITI_FILE A ");
    PAN_VISUALIESITO.SetQuery(PPQRY_CFATESITFILE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ID_FILE = ~~TBL_PARSVISESITO.ID_FILE~~) ");
    PAN_VISUALIESITO.SetQuery(PPQRY_CFATESITFILE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISUALIESITO.SetQuery(PPQRY_CFATESITFILE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISUALIESITO.SetQuery(PPQRY_CFATESITFILE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.NOME_FILE_ESITO ");
    PAN_VISUALIESITO.SetQuery(PPQRY_CFATESITFILE, 5, SQL, -1, "");
    PAN_VISUALIESITO.SetQueryDB(PPQRY_CFATESITFILE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VISUALIESITO.SetMasterTable(0, "CFAT_ESITI_FILE");
    PAN_VISUALIESITO.AddToSortList(PFL_VISUALIESITO_NOMEFILEESIT, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VISUALIESITO.Status() == 2)
    {
      int oldListQBE = PAN_VISUALIESITO.iUseListQBE;
      PAN_VISUALIESITO.iUseListQBE = 0;
      PAN_VISUALIESITO.PanelCommand(Glb.PCM_SEARCH);
      PAN_VISUALIESITO.PanelCommand(Glb.PCM_FIND);
      PAN_VISUALIESITO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VISUALIESITO) PAN_VISUALIESITO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VISUALIESITO) PAN_VISUALIESITO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VISUALIESITO) PAN_VISUALIESITO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VISUALIESITO) PAN_VISUALIESITO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VISUALIESITO) PAN_VISUALIESITO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
