// **********************************************
// Aggiorna Valori Comuni UO
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornaValoriComuniUO extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_NUOVAUOGESTI = 0;
  private static int GRP_PARAMETRI_NUOVAUOUTILI = 1;

  private static int PFL_PARAMETRI_CKUOGESTIONE = 0;
  private static int PFL_PARAMETRI_UOGESTINUOVA = 1;
  private static int PFL_PARAMETRI_CKUOUTILIZZO = 2;
  private static int PFL_PARAMETRI_UOUTILINUOVA = 3;
  private static int PFL_PARAMETRI_CONFERMLABEL = 4;

  private static int PPQRY_PARAMETRI636 = 0;

  private static int PPQRY_SO4ANAUNIOR1 = 1;
  private static int PPQRY_SO4ANAUNIORG = 2;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI637(IMDB);
    //
    //
    Init_PQRY_PARAMETRI636(IMDB);
    Init_PQRY_PARAMETRI636_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI637(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI637, 5);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI637, "TBL_PARAMETRI637");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI637,IMDBDef3.FLD_PARAMETRI637_PARAMOTTINEW, "PARAMOTTINEW");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI637,IMDBDef3.FLD_PARAMETRI637_PARAMOTTINEW,5,18,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI637,IMDBDef3.FLD_PARAMETRI637_PARACKUOGEST, "PARACKUOGEST");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI637,IMDBDef3.FLD_PARAMETRI637_PARACKUOGEST,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI637,IMDBDef3.FLD_PARAMETRI637_PARAMUOGESTI, "PARAMUOGESTI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI637,IMDBDef3.FLD_PARAMETRI637_PARAMUOGESTI,1,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI637,IMDBDef3.FLD_PARAMETRI637_PARACKUOUTIL, "PARACKUOUTIL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI637,IMDBDef3.FLD_PARAMETRI637_PARACKUOUTIL,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI637,IMDBDef3.FLD_PARAMETRI637_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI637,IMDBDef3.FLD_PARAMETRI637_PARAMUOUTILI,1,8,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI637, 0);
  }

  private static void Init_PQRY_PARAMETRI636(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI636, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI636, "PQRY_PARAMETRI636");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI636,IMDBDef11.PQSL_PARAMETRI636_PARACKUOGEST, "PARACKUOGEST");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI636,IMDBDef11.PQSL_PARAMETRI636_PARACKUOGEST,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI636,IMDBDef11.PQSL_PARAMETRI636_PARAMUOGESTI, "PARAMUOGESTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI636,IMDBDef11.PQSL_PARAMETRI636_PARAMUOGESTI,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI636,IMDBDef11.PQSL_PARAMETRI636_PARACKUOUTIL, "PARACKUOUTIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI636,IMDBDef11.PQSL_PARAMETRI636_PARACKUOUTIL,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI636,IMDBDef11.PQSL_PARAMETRI636_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI636,IMDBDef11.PQSL_PARAMETRI636_PARAMUOUTILI,1,8,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI636, 0);
  }

  private static void Init_PQRY_PARAMETRI636_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI636_RS, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI636_RS, "PQRY_PARAMETRI636_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI636_RS,IMDBDef11.PQSL_PARAMETRI636_PARACKUOGEST, "PARACKUOGEST");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI636_RS,IMDBDef11.PQSL_PARAMETRI636_PARACKUOGEST,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI636_RS,IMDBDef11.PQSL_PARAMETRI636_PARAMUOGESTI, "PARAMUOGESTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI636_RS,IMDBDef11.PQSL_PARAMETRI636_PARAMUOGESTI,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI636_RS,IMDBDef11.PQSL_PARAMETRI636_PARACKUOUTIL, "PARACKUOUTIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI636_RS,IMDBDef11.PQSL_PARAMETRI636_PARACKUOUTIL,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI636_RS,IMDBDef11.PQSL_PARAMETRI636_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI636_RS,IMDBDef11.PQSL_PARAMETRI636_PARAMUOUTILI,1,8,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornaValoriComuniUO(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornaValoriComuniUO()
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
    FormIdx = MyGlb.FRM_AGGIVALCOMUO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D3F47403-2B98-429D-BF8C-823E9C7CCA18";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 420;
    DesignHeight = 246;
    set_Caption(new IDVariant("Aggiorna Valori Comuni UO"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 420;
    Frames[1].Height = 220;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 220;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 420-MyGlb.PAN_OFFS_X, 220-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E71C70C1-3A92-49FA-AF69-54A8BAE3CF08");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 264, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI637, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGIVALCOMUO_PARAMETRI636();
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
    return (obj instanceof AggiornaValoriComuniUO);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornaValoriComuniUO.class.getName() : (Glb.ClassWithPackage(AggiornaValoriComuniUO.class) ? AggiornaValoriComuniUO.class.getName().substring(AggiornaValoriComuniUO.class.getPackage().getName().length() + 1) : AggiornaValoriComuniUO.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
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
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_UOGESTINUOVA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI636, IMDBDef11.PQSL_PARAMETRI636_PARAMUOGESTI, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI636, IMDBDef11.PQSL_PARAMETRI636_PARACKUOGEST, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI636, IMDBDef11.PQSL_PARAMETRI636_PARACKUOGEST, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_UOUTILINUOVA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI636, IMDBDef11.PQSL_PARAMETRI636_PARAMUOUTILI, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI636, IMDBDef11.PQSL_PARAMETRI636_PARACKUOUTIL, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAMETRI636, IMDBDef11.PQSL_PARAMETRI636_PARACKUOUTIL, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornaValoriComuniUO", "ParametriOnUpdatingRow", _e);
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
      MainFrm.ErrObj.ProcError ("AggiornaValoriComuniUO", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI637, IMDBDef3.FLD_PARAMETRI637_PARAMOTTINEW, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI637, IMDBDef3.FLD_PARAMETRI637_PARACKUOGEST, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI637, IMDBDef3.FLD_PARAMETRI637_PARAMUOGESTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI637, IMDBDef3.FLD_PARAMETRI637_PARACKUOUTIL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI637, IMDBDef3.FLD_PARAMETRI637_PARAMUOUTILI, 0, new IDVariant());
  }

  // **********************************************************************
  // Conferma
  // **********************************************************************
  public int Conferma ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conferma Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornaValoriComuniUO", "Conferma", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void AGGIVALCOMUO_PARAMETRI636() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAMETRI636_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI637, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI637, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI636_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAMETRI636_RS, 0, IMDBDef3.TBL_PARAMETRI637, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI636_RS, 0, 0, IMDBDef3.TBL_PARAMETRI637, IMDBDef3.FLD_PARAMETRI637_PARACKUOGEST, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI636_RS, 1, 0, IMDBDef3.TBL_PARAMETRI637, IMDBDef3.FLD_PARAMETRI637_PARAMUOGESTI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI636_RS, 2, 0, IMDBDef3.TBL_PARAMETRI637, IMDBDef3.FLD_PARAMETRI637_PARACKUOUTIL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI636_RS, 3, 0, IMDBDef3.TBL_PARAMETRI637, IMDBDef3.FLD_PARAMETRI637_PARAMUOUTILI, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI637, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI637, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI637, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAMETRI636_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_CONFERMLABEL)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Conferma();
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOGESTI, "BF00A3AB-4459-450B-8C9B-B38D98464071");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOGESTI, "Nuova UO Gestione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOGESTI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOGESTI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOGESTI, MyGlb.PANEL_LIST, 0, -9999, 96, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOGESTI, MyGlb.PANEL_FORM, 20, 19, 360, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOGESTI, 0, 107);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOGESTI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOGESTI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOGESTI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOGESTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOUTILI, "B8D6F07B-5B65-410C-9266-FC5C09505C73");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOUTILI, "Nuova UO Utilizzo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOUTILI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOUTILI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOUTILI, MyGlb.PANEL_LIST, 0, -9999, 88, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOUTILI, MyGlb.PANEL_FORM, 20, 79, 360, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOUTILI, 0, 98);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOUTILI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOUTILI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOUTILI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUOVAUOUTILI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOGESTIONE, "57506043-72D1-45DD-A050-AAEFD51F2680");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOGESTIONE, "CK UO Gestione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOGESTIONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOGESTIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOGESTIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTINUOVA, "A31400C8-579C-4342-A4B6-AB0951777091");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTINUOVA, "UO Gestione Nuova");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTINUOVA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTINUOVA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTINUOVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOUTILIZZO, "E7B13782-D9DC-4CE8-AE3C-2289D54C34F5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOUTILIZZO, "CK UO Utilizzo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOUTILIZZO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOUTILIZZO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOUTILIZZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILINUOVA, "6BD85D44-CB84-4961-A705-898481824D93");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILINUOVA, "UO Utilizzo Nuova");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILINUOVA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILINUOVA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILINUOVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CONFERMLABEL, "6300FE81-B669-4B30-B9F5-A6FFEBFAB6B7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CONFERMLABEL, "Conferma");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CONFERMLABEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CONFERMLABEL, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CONFERMLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOGESTIONE, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOGESTIONE, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOGESTIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOGESTIONE, MyGlb.PANEL_LIST, "CK UO Gestione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOGESTIONE, MyGlb.PANEL_FORM, 24, 44, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOGESTIONE, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOGESTIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOGESTIONE, MyGlb.PANEL_FORM, "CK UO Gestione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CKUOGESTIONE, -1, GRP_PARAMETRI_NUOVAUOGESTI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CKUOGESTIONE, PPQRY_PARAMETRI636, "A.PARACKUOGEST", "PARACKUOGEST", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CKUOGESTIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CKUOGESTIONE, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTINUOVA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTINUOVA, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTINUOVA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTINUOVA, MyGlb.PANEL_LIST, "U. G. N.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTINUOVA, MyGlb.PANEL_FORM, 52, 44, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTINUOVA, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTINUOVA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTINUOVA, MyGlb.PANEL_FORM, "UO Gest. Nuova");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UOGESTINUOVA, -1, GRP_PARAMETRI_NUOVAUOGESTI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UOGESTINUOVA, PPQRY_PARAMETRI636, "A.PARAMUOGESTI", "PARAMUOGESTI", 1, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOUTILIZZO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOUTILIZZO, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOUTILIZZO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOUTILIZZO, MyGlb.PANEL_LIST, "CK UO Utilizzo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOUTILIZZO, MyGlb.PANEL_FORM, 24, 104, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOUTILIZZO, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOUTILIZZO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CKUOUTILIZZO, MyGlb.PANEL_FORM, "CK UO Utilizzo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CKUOUTILIZZO, -1, GRP_PARAMETRI_NUOVAUOUTILI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CKUOUTILIZZO, PPQRY_PARAMETRI636, "A.PARACKUOUTIL", "PARACKUOUTIL", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CKUOUTILIZZO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CKUOUTILIZZO, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILINUOVA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILINUOVA, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILINUOVA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILINUOVA, MyGlb.PANEL_LIST, "U. U. N.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILINUOVA, MyGlb.PANEL_FORM, 52, 104, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILINUOVA, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILINUOVA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILINUOVA, MyGlb.PANEL_FORM, "UO Util. Nuova");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UOUTILINUOVA, -1, GRP_PARAMETRI_NUOVAUOUTILI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UOUTILINUOVA, PPQRY_PARAMETRI636, "A.PARAMUOUTILI", "PARAMUOUTILI", 1, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CONFERMLABEL, MyGlb.PANEL_LIST, 552, 336, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CONFERMLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CONFERMLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CONFERMLABEL, MyGlb.PANEL_FORM, 296, 156, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CONFERMLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CONFERMLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CONFERMLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CONFERMLABEL, -1, "", "CONFERMLABEL", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PARAMUOGESTI~~) ");
    SQL.append("and   (A.OTTICA = ~~TBL_PARAMETRI637.PARAMOTTINEW~~) ");
    SQL.append("and   (A.DAL <= TRUNC( SYSDATE ) AND NVL(A.AL, TRUNC( SYSDATE )) >= TRUNC( SYSDATE )) ");
    SQL.append("order by 2, 3 ");
    PAN_PARAMETRI.SetQuery(PPQRY_SO4ANAUNIOR1, 0, SQL, PFL_PARAMETRI_UOGESTINUOVA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.OTTICA = ~~TBL_PARAMETRI637.PARAMOTTINEW~~) ");
    SQL.append("and   (A.DAL <= TRUNC( SYSDATE ) AND NVL(A.AL, TRUNC( SYSDATE )) >= TRUNC( SYSDATE )) ");
    SQL.append("order by 2, 3 ");
    PAN_PARAMETRI.SetQuery(PPQRY_SO4ANAUNIOR1, 1, SQL, PFL_PARAMETRI_UOGESTINUOVA, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_SO4ANAUNIOR1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PARAMUOUTILI~~) ");
    SQL.append("and   (A.OTTICA = ~~TBL_PARAMETRI637.PARAMOTTINEW~~) ");
    SQL.append("and   (A.DAL <= TRUNC( SYSDATE ) AND NVL(A.AL, TRUNC( SYSDATE )) >= TRUNC( SYSDATE )) ");
    SQL.append("order by 2, 3 ");
    PAN_PARAMETRI.SetQuery(PPQRY_SO4ANAUNIORG, 0, SQL, PFL_PARAMETRI_UOUTILINUOVA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.OTTICA = ~~TBL_PARAMETRI637.PARAMOTTINEW~~) ");
    SQL.append("and   (A.DAL <= TRUNC( SYSDATE ) AND NVL(A.AL, TRUNC( SYSDATE )) >= TRUNC( SYSDATE )) ");
    SQL.append("order by 2, 3 ");
    PAN_PARAMETRI.SetQuery(PPQRY_SO4ANAUNIORG, 1, SQL, PFL_PARAMETRI_UOUTILINUOVA, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_SO4ANAUNIORG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI636", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI636, IMDBDef11.PQRY_PARAMETRI636_RS, IMDBDef3.TBL_PARAMETRI637);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CKUOGESTIONE, IMDBDef3.FLD_PARAMETRI637_PARACKUOGEST);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UOGESTINUOVA, IMDBDef3.FLD_PARAMETRI637_PARAMUOGESTI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CKUOUTILIZZO, IMDBDef3.FLD_PARAMETRI637_PARACKUOUTIL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UOUTILINUOVA, IMDBDef3.FLD_PARAMETRI637_PARAMUOUTILI);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI637");
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
