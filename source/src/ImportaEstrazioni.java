// **********************************************
// Importa Estrazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ImportaEstrazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CFESTRIMPSEL_TITOLO = 0;
  private static int PFL_CFESTRIMPSEL_DESCRIZIONE = 1;
  private static int PFL_CFESTRIMPSEL_INFO1 = 2;
  private static int PFL_CFESTRIMPSEL_CATEGORIA = 3;
  private static int PFL_CFESTRIMPSEL_SELECTSQL = 4;
  private static int PFL_CFESTRIMPSEL_INFO = 5;
  private static int PFL_CFESTRIMPSEL_NOTE = 6;
  private static int PFL_CFESTRIMPSEL_NOMEFILEEXPO = 7;
  private static int PFL_CFESTRIMPSEL_ID = 8;

  private static int PPQRY_CFESTRIMPSE1 = 0;

  private static int PPQRY_CFESTRCATSEL = 1;


  IDPanel PAN_CFESTRIMPSEL;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_CFESTRIMPSE1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_CFESTRIMPSE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CFESTRIMPSE1, 9);
    IMDB.set_TblCode(IMDBDef17.PQRY_CFESTRIMPSE1, "PQRY_CFESTRIMPSE1");
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_ID, "ID");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_ID,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_TITOLO,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_DESCRIZIONE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_CATEGORIA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_SELECT_SQL, "SELECT_SQL");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_SELECT_SQL,9,9999,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_NOTE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_NOME_FILE_EXPORT, "NOME_FILE_EXPORT");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_NOME_FILE_EXPORT,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_INFO, "INFO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_INFO,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_INFO1, "INFO1");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRIMPSE1,IMDBDef17.PQSL_CFESTRIMPSE1_INFO1,5,99,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_CFESTRIMPSE1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ImportaEstrazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public ImportaEstrazioni()
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
    FormIdx = MyGlb.FRM_IMPORTESTRAZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "39820F88-6A5B-402A-A809-99B3741FE7D0";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2177;
    DesignWidth = 2020;
    DesignHeight = 698;
    set_Caption(new IDVariant("Importa Estrazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 2020;
    Frames[1].Height = 672;
    Frames[1].Caption = "Select da importare";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 672;
    PAN_CFESTRIMPSEL = new IDPanel(w, this, 1, "PAN_CFESTRIMPSEL");
    Frames[1].Content = PAN_CFESTRIMPSEL;
    PAN_CFESTRIMPSEL.set_ShowGroups(true);
    PAN_CFESTRIMPSEL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CFESTRIMPSEL.VS = MainFrm.VisualStyleList;
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 2020-MyGlb.PAN_OFFS_X, 672-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CFESTRIMPSEL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "74964D28-EE42-42FE-8897-7533A1C8B632");
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1880, 556, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CFESTRIMPSEL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_NORMALFIELDS);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CFESTRIMPSEL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CFESTRIMPSEL.InitStatus = 2;
    PAN_CFESTRIMPSEL_Init();
    PAN_CFESTRIMPSEL_InitFields();
    PAN_CFESTRIMPSEL_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_MENU+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_MENU6+BaseCmdSetIdx, "M" + (MyGlb.CMD_MENU+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_IMPORTA+BaseCmdLinIdx)
      {
        Importa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CARICASELECT+BaseCmdLinIdx)
      {
        Caricaselect();
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
      PAN_CFESTRIMPSEL.UpdatePanel(MainFrm);
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
    return (obj instanceof ImportaEstrazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ImportaEstrazioni.class.getName() : (Glb.ClassWithPackage(ImportaEstrazioni.class) ? ImportaEstrazioni.class.getName().substring(ImportaEstrazioni.class.getPackage().getName().length() + 1) : ImportaEstrazioni.class.getName()));
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
      PAN_CFESTRIMPSEL.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_CFESTRIMPSEL.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportaEstrazioni", "Load", _e);
    }
  }

  // **********************************************************************
  // Importa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Importa ()
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
      // Importa Body
      // Corpo Procedura
      // 
      IDVariant v_RIGA = null;
      v_RIGA = (new IDVariant(1));
      C2 = PAN_CFESTRIMPSEL.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_CFESTRIMPSEL.GotoFirst();
      while (!PAN_CFESTRIMPSEL.RSEOF())
      {
        if (PAN_CFESTRIMPSEL.IsRowSelected(v_RIGA.intValue()))
        {
          if (IDL.IsNull(C2.Get("CATEGORIA")))
          {
            MainFrm.set_AlertMessage((new IDVariant("Categoria Obbligatoria"))); 
            return 0;
          }
          MainFrm.Cf4armDBObject.CFESTRAIIMPORTASELECT(C2.Get("ID"), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant("Errore in fase di importazione select"))); 
            return 0;
          }
        }
        v_RIGA = IDL.Add(v_RIGA, (new IDVariant(1)));
        PAN_CFESTRIMPSEL.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      PAN_CFESTRIMPSEL.PanelCommand(Glb.PCM_REQUERY);
      if ((MainFrm.GetForm(MyGlb.FRM_ALBEROESTRAZ, 0, false)!=null))
      {
        ((AlberoEstrazioni)MainFrm.GetForm(MyGlb.FRM_ALBEROESTRAZ,0)).TRE_ESTRAZIONI.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportaEstrazioni", "Importa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Caricaselect
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Caricaselect ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Caricaselect Body
      // Corpo Procedura
      // 
      IDVariant v_URL = new IDVariant(0,IDVariant.STRING);
      it.finmatica.cfEstrai.CaricaProperties C = null;
      C = (it.finmatica.cfEstrai.CaricaProperties)new it.finmatica.cfEstrai.CaricaProperties();
      if ((new IDVariant(MainFrm.Cf4armDBObject.DefaultConnStr())).compareTo((new IDVariant("datasource=cfarm")), true)!=0)
      {
        v_URL = IDL.SubStr((new IDVariant(MainFrm.Cf4armDBObject.DefaultConnStr())), IDL.Add(IDL.Find((new IDVariant(MainFrm.Cf4armDBObject.DefaultConnStr())), (new IDVariant("url="))), (new IDVariant(4))));
        C.setUrl(v_URL.stringValue()); 
        C.setUsername((new IDVariant(MainFrm.Cf4armDBObject.DefaultUserId())).stringValue()); 
        C.setPassword((new IDVariant(MainFrm.Cf4armDBObject.DefaultPassword())).stringValue()); 
      }
      else
      {
        C.setDatasource((new IDVariant("jdbc/cfarm")).stringValue()); 
      }
      IDVariant v_PERCORSO = null;
      v_PERCORSO = IDL.Add(IDL.Replace((new IDVariant(MainFrm.RealPath)), (new IDVariant("Cfaid")), (new IDVariant("cfestrai"))), (new IDVariant("/WEB-INF/")));
      // v_PERCORSO = IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/WEB-INF/")));
      C.caricaSelect(v_PERCORSO.stringValue(), (new IDVariant("db2.properties")).stringValue()); 
      PAN_CFESTRIMPSEL.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportaEstrazioni", "Caricaselect", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Select
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInfoSelect ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Select Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI685, IMDBDef7.FLD_PARAMETRI685_ID_SELECT, 0, IMDB.Value(IMDBDef17.PQRY_CFESTRIMPSE1, IMDBDef17.PQSL_CFESTRIMPSE1_ID, 0));
      MainFrm.Show(MyGlb.FRM_VISUALSELECT, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportaEstrazioni", "ApriInfoSelect", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Descrizione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriInfoDescrizione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Descrizione Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI685, IMDBDef7.FLD_PARAMETRI685_ID_SELECT, 0, IMDB.Value(IMDBDef17.PQRY_CFESTRIMPSE1, IMDBDef17.PQSL_CFESTRIMPSE1_ID, 0));
      MainFrm.Show(MyGlb.FRM_VISUDESCIMPO, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImportaEstrazioni", "ApriInfoDescrizione", _e);
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
  private void PAN_CFESTRIMPSEL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CFESTRIMPSEL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CFESTRIMPSEL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CFESTRIMPSEL, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CFESTRIMPSEL_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CFESTRIMPSEL);
    // Stub
  }

  private void PAN_CFESTRIMPSEL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CFESTRIMPSEL_INFO1)
    {
      this.IdxPanelActived = this.PAN_CFESTRIMPSEL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoDescrizione();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CFESTRIMPSEL_INFO)
    {
      this.IdxPanelActived = this.PAN_CFESTRIMPSEL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoSelect();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CFESTRIMPSEL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CFESTRIMPSEL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CFESTRIMPSEL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CFESTRIMPSEL_Init()
  {

    PAN_CFESTRIMPSEL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CFESTRIMPSEL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CFESTRIMPSEL.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_CFESTRIMPSEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_TITOLO, "5367DD4C-558E-4A9F-865C-140551B80FAD");
    PAN_CFESTRIMPSEL.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_TITOLO, "Titolo");
    PAN_CFESTRIMPSEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_TITOLO, "");
    PAN_CFESTRIMPSEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CFESTRIMPSEL.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_TITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CFESTRIMPSEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_DESCRIZIONE, "44C3F140-6F52-4A00-9077-98D11845C93A");
    PAN_CFESTRIMPSEL.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_DESCRIZIONE, "Descrizione");
    PAN_CFESTRIMPSEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_DESCRIZIONE, "");
    PAN_CFESTRIMPSEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_DESCRIZIONE, MyGlb.VIS_HTMLNORMFIEL);
    PAN_CFESTRIMPSEL.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRIMPSEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO1, "47A4DE0F-8A01-4170-997B-70ECF7112C1F");
    PAN_CFESTRIMPSEL.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO1, " ");
    PAN_CFESTRIMPSEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO1, "If (Is Null (CF ESTRAI IMP SELECT ID), \"\", Info)");
    PAN_CFESTRIMPSEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO1, MyGlb.VIS_HYPELINKIMMA);
    PAN_CFESTRIMPSEL.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRIMPSEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_CATEGORIA, "52F881A7-4DC2-460D-969A-54B7355CA4BA");
    PAN_CFESTRIMPSEL.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_CATEGORIA, "Categoria");
    PAN_CFESTRIMPSEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_CATEGORIA, "");
    PAN_CFESTRIMPSEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_CFESTRIMPSEL.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_CATEGORIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRIMPSEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_SELECTSQL, "4956A4D7-A8D2-4897-A5D0-8C9808719033");
    PAN_CFESTRIMPSEL.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_SELECTSQL, "Query");
    PAN_CFESTRIMPSEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_SELECTSQL, "");
    PAN_CFESTRIMPSEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_SELECTSQL, MyGlb.VIS_NORMALFIELDS);
    PAN_CFESTRIMPSEL.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_SELECTSQL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRIMPSEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO, "172B955E-3E47-483E-B9B6-5F2FB07696AB");
    PAN_CFESTRIMPSEL.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO, " ");
    PAN_CFESTRIMPSEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO, "If (Is Null (CF ESTRAI IMP SELECT ID), Null Number, Info)");
    PAN_CFESTRIMPSEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_CFESTRIMPSEL.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRIMPSEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOTE, "61DB02C4-5E87-45AF-B42E-39BF2F3B689A");
    PAN_CFESTRIMPSEL.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOTE, "Note");
    PAN_CFESTRIMPSEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOTE, "");
    PAN_CFESTRIMPSEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOTE, MyGlb.VIS_NORMALFIELDS);
    PAN_CFESTRIMPSEL.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRIMPSEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOMEFILEEXPO, "D190B9AA-49FF-453D-8AA4-0CE8124EA805");
    PAN_CFESTRIMPSEL.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOMEFILEEXPO, "Nome Export");
    PAN_CFESTRIMPSEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOMEFILEEXPO, "");
    PAN_CFESTRIMPSEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOMEFILEEXPO, MyGlb.VIS_NORMALFIELDS);
    PAN_CFESTRIMPSEL.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOMEFILEEXPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRIMPSEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_ID, "8A6D25BF-48C2-4644-AC91-36CDE9BA0C72");
    PAN_CFESTRIMPSEL.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_ID, "ID");
    PAN_CFESTRIMPSEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_ID, "");
    PAN_CFESTRIMPSEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_ID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CFESTRIMPSEL.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_ID, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_CFESTRIMPSEL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_TITOLO, MyGlb.PANEL_LIST, 0, 36, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_TITOLO, MyGlb.PANEL_LIST, 128);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_TITOLO, MyGlb.PANEL_FORM, 4, 28, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_TITOLO, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_CFESTRIMPSEL.SetFieldPage(PFL_CFESTRIMPSEL_TITOLO, -1, -1);
    PAN_CFESTRIMPSEL.SetFieldPanel(PFL_CFESTRIMPSEL_TITOLO, PPQRY_CFESTRIMPSE1, "A.TITOLO", "TITOLO", 5, 100, 0, -13997);
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_DESCRIZIONE, MyGlb.PANEL_LIST, 328, 36, 412, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_DESCRIZIONE, MyGlb.PANEL_LIST, 128);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CFESTRIMPSEL.SetFieldPage(PFL_CFESTRIMPSEL_DESCRIZIONE, -1, -1);
    PAN_CFESTRIMPSEL.SetFieldPanel(PFL_CFESTRIMPSEL_DESCRIZIONE, PPQRY_CFESTRIMPSE1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 4000, 0, -13997);
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO1, MyGlb.PANEL_LIST, 740, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO1, MyGlb.PANEL_LIST, 40);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO1, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO1, MyGlb.PANEL_LIST, " ");
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO1, MyGlb.PANEL_FORM, 4, 268, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO1, MyGlb.PANEL_FORM, 40);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO1, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO1, MyGlb.PANEL_FORM, " ");
    PAN_CFESTRIMPSEL.SetFieldPage(PFL_CFESTRIMPSEL_INFO1, -1, -1);
    PAN_CFESTRIMPSEL.SetFieldUnbound(PFL_CFESTRIMPSEL_INFO1, true);
    PAN_CFESTRIMPSEL.SetFieldPanel(PFL_CFESTRIMPSEL_INFO1, PPQRY_CFESTRIMPSE1, "CASE WHEN (A.ID IS NULL) THEN NULL ELSE 'I' END", "INFO1", 5, 99, 0, -13997);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_CATEGORIA, MyGlb.PANEL_LIST, 760, 36, 132, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_CATEGORIA, MyGlb.PANEL_LIST, 76);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_CATEGORIA, MyGlb.PANEL_FORM, 4, 76, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_CATEGORIA, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_CFESTRIMPSEL.SetFieldPage(PFL_CFESTRIMPSEL_CATEGORIA, -1, -1);
    PAN_CFESTRIMPSEL.SetFieldPanel(PFL_CFESTRIMPSEL_CATEGORIA, PPQRY_CFESTRIMPSE1, "A.CATEGORIA", "CATEGORIA", 5, 50, 0, -13997);
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_SELECTSQL, MyGlb.PANEL_LIST, 892, 36, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_SELECTSQL, MyGlb.PANEL_LIST, 128);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_SELECTSQL, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_SELECTSQL, MyGlb.PANEL_LIST, "Query");
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_SELECTSQL, MyGlb.PANEL_FORM, 4, 100, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_SELECTSQL, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_SELECTSQL, MyGlb.PANEL_FORM, 2);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_SELECTSQL, MyGlb.PANEL_FORM, "Query");
    PAN_CFESTRIMPSEL.SetFieldPage(PFL_CFESTRIMPSEL_SELECTSQL, -1, -1);
    PAN_CFESTRIMPSEL.SetFieldPanel(PFL_CFESTRIMPSEL_SELECTSQL, PPQRY_CFESTRIMPSE1, "A.SELECT_SQL", "SELECT_SQL", 9, 9999, 0, -13997);
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO, MyGlb.PANEL_LIST, 1240, 36, 28, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO, MyGlb.PANEL_LIST, 32);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO, MyGlb.PANEL_LIST, " ");
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO, MyGlb.PANEL_FORM, 4, 268, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO, MyGlb.PANEL_FORM, 32);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_INFO, MyGlb.PANEL_FORM, " ");
    PAN_CFESTRIMPSEL.SetFieldPage(PFL_CFESTRIMPSEL_INFO, -1, -1);
    PAN_CFESTRIMPSEL.SetFieldUnbound(PFL_CFESTRIMPSEL_INFO, true);
    PAN_CFESTRIMPSEL.SetFieldPanel(PFL_CFESTRIMPSEL_INFO, PPQRY_CFESTRIMPSE1, "CASE WHEN (A.ID IS NULL) THEN NULL ELSE 'I' END", "INFO", 5, 99, 0, -13997);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CFESTRIMPSEL.SetValueListItem(PFL_CFESTRIMPSEL_INFO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CFESTRIMPSEL.set_ImageResizeMode(PFL_CFESTRIMPSEL_INFO, 2);
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOTE, MyGlb.PANEL_LIST, 1268, 36, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOTE, MyGlb.PANEL_LIST, 128);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOTE, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOTE, MyGlb.PANEL_LIST, "Note");
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOTE, MyGlb.PANEL_FORM, 4, 124, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOTE, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOTE, MyGlb.PANEL_FORM, "Note");
    PAN_CFESTRIMPSEL.SetFieldPage(PFL_CFESTRIMPSEL_NOTE, -1, -1);
    PAN_CFESTRIMPSEL.SetFieldPanel(PFL_CFESTRIMPSEL_NOTE, PPQRY_CFESTRIMPSE1, "A.NOTE", "NOTE", 5, 4000, 0, -13997);
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOMEFILEEXPO, MyGlb.PANEL_LIST, 1592, 36, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOMEFILEEXPO, MyGlb.PANEL_LIST, 128);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOMEFILEEXPO, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOMEFILEEXPO, MyGlb.PANEL_LIST, "Nome Export");
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOMEFILEEXPO, MyGlb.PANEL_FORM, 4, 244, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOMEFILEEXPO, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOMEFILEEXPO, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_NOMEFILEEXPO, MyGlb.PANEL_FORM, "Nome Export");
    PAN_CFESTRIMPSEL.SetFieldPage(PFL_CFESTRIMPSEL_NOMEFILEEXPO, -1, -1);
    PAN_CFESTRIMPSEL.SetFieldPanel(PFL_CFESTRIMPSEL_NOMEFILEEXPO, PPQRY_CFESTRIMPSE1, "A.NOME_FILE_EXPORT", "NOME_FILE_EXPORT", 5, 100, 0, -13997);
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_ID, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_ID, MyGlb.PANEL_LIST, 24);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_ID, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_ID, MyGlb.PANEL_LIST, "ID");
    PAN_CFESTRIMPSEL.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_ID, MyGlb.PANEL_FORM, 4, 268, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRIMPSEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_ID, MyGlb.PANEL_FORM, 24);
    PAN_CFESTRIMPSEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_ID, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRIMPSEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRIMPSEL_ID, MyGlb.PANEL_FORM, "ID");
    PAN_CFESTRIMPSEL.SetFieldPage(PFL_CFESTRIMPSEL_ID, -1, -1);
    PAN_CFESTRIMPSEL.SetFieldPanel(PFL_CFESTRIMPSEL_ID, PPQRY_CFESTRIMPSE1, "A.ID", "ID", 3, 19, 0, -13997);
  }

  private void PAN_CFESTRIMPSEL_InitQueries()
  {
    StringBuffer SQL;

    PAN_CFESTRIMPSEL.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA as CFESTCATSECA, ");
    SQL.append("  A.DESCRIZIONE as CFESTCATSEDE ");
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_CATEGORIE_SELECT A ");
    SQL.append("where (A.CATEGORIA = ~~CATEGORIA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_CFESTRIMPSEL.SetQuery(PPQRY_CFESTRCATSEL, 0, SQL, PFL_CFESTRIMPSEL_CATEGORIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CATEGORIA as CFESTCATSECA, ");
    SQL.append("  A.DESCRIZIONE as CFESTCATSEDE ");
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_CATEGORIE_SELECT A ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_CFESTRIMPSEL.SetQuery(PPQRY_CFESTRCATSEL, 1, SQL, PFL_CFESTRIMPSEL_CATEGORIA, "");
    PAN_CFESTRIMPSEL.SetQueryDB(PPQRY_CFESTRCATSEL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CFESTRIMPSEL.SetIMDB(IMDB, "PQRY_CFESTRIMPSE1", true);
    PAN_CFESTRIMPSEL.set_SetString(MyGlb.MASTER_ROWNAME, "CF ESTRAI IMP SELECT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID as ID, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.SELECT_SQL as SELECT_SQL, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.NOME_FILE_EXPORT as NOME_FILE_EXPORT, ");
    SQL.append("  CASE WHEN (A.ID IS NULL) THEN NULL ELSE 'I' END as INFO, ");
    SQL.append("  CASE WHEN (A.ID IS NULL) THEN NULL ELSE 'I' END as INFO1 ");
    PAN_CFESTRIMPSEL.SetQuery(PPQRY_CFESTRIMPSE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_IMP_SELECT A ");
    PAN_CFESTRIMPSEL.SetQuery(PPQRY_CFESTRIMPSE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((A.STATO_IMPORTAZIONE IS NULL)) ");
    PAN_CFESTRIMPSEL.SetQuery(PPQRY_CFESTRIMPSE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CFESTRIMPSEL.SetQuery(PPQRY_CFESTRIMPSE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CFESTRIMPSEL.SetQuery(PPQRY_CFESTRIMPSE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CFESTRIMPSEL.SetQuery(PPQRY_CFESTRIMPSE1, 5, SQL, -1, "");
    PAN_CFESTRIMPSEL.SetQueryDB(PPQRY_CFESTRIMPSE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CFESTRIMPSEL.SetMasterTable(0, "CF_ESTRAI_IMP_SELECT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CFESTRIMPSEL.Status() == 2)
    {
      int oldListQBE = PAN_CFESTRIMPSEL.iUseListQBE;
      PAN_CFESTRIMPSEL.iUseListQBE = 0;
      PAN_CFESTRIMPSEL.PanelCommand(Glb.PCM_SEARCH);
      PAN_CFESTRIMPSEL.PanelCommand(Glb.PCM_FIND);
      PAN_CFESTRIMPSEL.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CFESTRIMPSEL) PAN_CFESTRIMPSEL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CFESTRIMPSEL) PAN_CFESTRIMPSEL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CFESTRIMPSEL) PAN_CFESTRIMPSEL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CFESTRIMPSEL) PAN_CFESTRIMPSEL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CFESTRIMPSEL) PAN_CFESTRIMPSEL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
