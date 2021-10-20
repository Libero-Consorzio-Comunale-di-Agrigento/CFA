// **********************************************
// Scelta Opere Crono
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaOpereCrono extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_OPERE_CODICE = 0;
  private static int PFL_OPERE_DESCRIZIONE = 1;
  private static int PFL_OPERE_NUMPPI = 2;
  private static int PFL_OPERE_CATEGORIA = 3;
  private static int PFL_OPERE_REALE = 4;
  private static int PFL_OPERE_PROGETTI = 5;

  private static int PPQRY_OPERE3 = 0;


  IDPanel PAN_OPERE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI487(IMDB);
    //
    //
    Init_PQRY_OPERE3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI487(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI487, 5);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI487, "TBL_PARAMETRI487");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI487,IMDBDef1.FLD_PARAMETRI487_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI487,IMDBDef1.FLD_PARAMETRI487_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI487,IMDBDef1.FLD_PARAMETRI487_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI487,IMDBDef1.FLD_PARAMETRI487_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI487,IMDBDef1.FLD_PARAMETRI487_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI487,IMDBDef1.FLD_PARAMETRI487_ROWNAMEARTIC,1,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI487,IMDBDef1.FLD_PARAMETRI487_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI487,IMDBDef1.FLD_PARAMETRI487_ROWNAMEFINAN,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI487,IMDBDef1.FLD_PARAMETRI487_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI487,IMDBDef1.FLD_PARAMETRI487_ROWNAMEESERC,1,4,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI487, 0);
  }

  private static void Init_PQRY_OPERE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_OPERE3, 7);
    IMDB.set_TblCode(IMDBDef8.PQRY_OPERE3, "PQRY_OPERE3");
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE3,IMDBDef8.PQSL_OPERE3_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE3,IMDBDef8.PQSL_OPERE3_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE3,IMDBDef8.PQSL_OPERE3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE3,IMDBDef8.PQSL_OPERE3_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE3,IMDBDef8.PQSL_OPERE3_REALE, "REALE");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE3,IMDBDef8.PQSL_OPERE3_REALE,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE3,IMDBDef8.PQSL_OPERE3_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE3,IMDBDef8.PQSL_OPERE3_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE3,IMDBDef8.PQSL_OPERE3_OPERECATEGOR, "OPERECATEGOR");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE3,IMDBDef8.PQSL_OPERE3_OPERECATEGOR,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE3,IMDBDef8.PQSL_OPERE3_OPEREPROGETT, "OPEREPROGETT");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE3,IMDBDef8.PQSL_OPERE3_OPEREPROGETT,5,114,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_OPERE3,IMDBDef8.PQSL_OPERE3_OPERENUMPPI, "OPERENUMPPI");
    IMDB.SetFldParams(IMDBDef8.PQRY_OPERE3,IMDBDef8.PQSL_OPERE3_OPERENUMPPI,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_OPERE3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaOpereCrono(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaOpereCrono()
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
    FormIdx = MyGlb.FRM_SCELOPERCRON;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "183F7F0F-2A8B-4A9A-9CA4-247ED1E5B2D8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 556;
    DesignHeight = 386;
    set_Caption(new IDVariant("Scelta Opere"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 556;
    Frames[1].Height = 360;
    Frames[1].Caption = "Opere";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_OPERE = new IDPanel(w, this, 1, "PAN_OPERE");
    Frames[1].Content = PAN_OPERE;
    PAN_OPERE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_OPERE.VS = MainFrm.VisualStyleList;
    PAN_OPERE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 556-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "492C4DF3-F632-4095-A466-D9B093F19750");
    PAN_OPERE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1152, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_OPERE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_OPERE.InitStatus = 1;
    PAN_OPERE_Init();
    PAN_OPERE_InitFields();
    PAN_OPERE_InitQueries();
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
      PAN_OPERE.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaOpereCrono);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaOpereCrono.class.getName() : (Glb.ClassWithPackage(SceltaOpereCrono.class) ? SceltaOpereCrono.class.getName().substring(SceltaOpereCrono.class.getPackage().getName().length() + 1) : SceltaOpereCrono.class.getName()));
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
      v_CAPTION = (new IDVariant("Opere", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      if (IDL.IsNull(IMDB.Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMEES, 0)))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMEES, 0, (new IDVariant("-1")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMECAPIT, 0)))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMECAPIT, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMEARTIC, 0)))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMEARTIC, 0, (new IDVariant(-1)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMEFINAN, 0)))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMEFINAN, 0, (new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaOpereCrono", "LoadEvent", _e);
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
      MainFrm.ErrObj.ProcError ("SceltaOpereCrono", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMEES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMECAPIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMEARTIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMEFINAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMEESERC, 0, new IDVariant());
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
  private void PAN_OPERE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_OPERE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_OPERE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_OPERE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_OPERE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_OPERE);
    // Stub
  }

  private void PAN_OPERE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_OPERE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_OPERE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_OPERE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_OPERE_Init()
  {

    PAN_OPERE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_OPERE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_OPERE.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, "7ACCF3FE-1FC1-455A-BE7B-2FAFE765F7F2");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, "Codice");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, "7FB13DCB-9166-45FA-95BC-1506C5A5A1E8");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, "Descrizione");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_NUMPPI, "F3D0AB27-DB7C-491B-9F27-CBB87CED71C7");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_NUMPPI, "Num. P.P.I.");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_NUMPPI, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_NUMPPI, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_NUMPPI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, "107A9922-0674-4713-A92A-F48B8D89C4E4");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, "Categoria");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, "4B4FC729-6BFC-4E1A-B110-D0CFF91CCB1A");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, "Reale");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.VIS_CHECKSTYLE);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_OPERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTI, "648AF095-A706-45D3-9DF4-638CF58B8A40");
    PAN_OPERE.set_Header(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTI, "Obiettivo Operativo");
    PAN_OPERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTI, "");
    PAN_OPERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTI, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERE.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_OPERE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_OPERE.SetFieldPage(PFL_OPERE_CODICE, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_CODICE, PPQRY_OPERE3, "A.CODICE", "CODICE", 1, 5, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 328, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_OPERE.SetFieldPage(PFL_OPERE_DESCRIZIONE, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_DESCRIZIONE, PPQRY_OPERE3, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_NUMPPI, MyGlb.PANEL_LIST, 384, 36, 72, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_NUMPPI, MyGlb.PANEL_LIST, 24);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_NUMPPI, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_NUMPPI, MyGlb.PANEL_LIST, "Num. P.P.I.");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_NUMPPI, MyGlb.PANEL_FORM, 4, 136, 456, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_NUMPPI, MyGlb.PANEL_FORM, 24);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_NUMPPI, MyGlb.PANEL_FORM, 2);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_NUMPPI, MyGlb.PANEL_FORM, "N. P P I");
    PAN_OPERE.SetFieldPage(PFL_OPERE_NUMPPI, -1, -1);
    PAN_OPERE.SetFieldUnbound(PFL_OPERE_NUMPPI, true);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_NUMPPI, PPQRY_OPERE3, "DECODE(A.ANNO_PPI, to_number(NULL), '', TO_CHAR ( A.NUMERO_PPI ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ANNO_PPI ))", "OPERENUMPPI", 5, 99, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_LIST, 456, 36, 348, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_LIST, 56);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_FORM, 4, 184, 488, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_FORM, 56);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_FORM, 2);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_CATEGORIA, MyGlb.PANEL_FORM, "Categ.");
    PAN_OPERE.SetFieldPage(PFL_OPERE_CATEGORIA, -1, -1);
    PAN_OPERE.SetFieldUnbound(PFL_OPERE_CATEGORIA, true);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_CATEGORIA, PPQRY_OPERE3, "DECODE(A.CATEGORIA, to_number(NULL), 'Nulla', TO_CHAR ( A.CATEGORIA ) || ' ' || ' - ' || ' ' || C.DESCRIZIONE)", "OPERECATEGOR", 5, 99, 0, -13997);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_LIST, 804, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_LIST, 40);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_LIST, "Reale");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_FORM, 4, 88, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_FORM, 40);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_FORM, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_REALE, MyGlb.PANEL_FORM, "Reale");
    PAN_OPERE.SetFieldPage(PFL_OPERE_REALE, -1, -1);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_REALE, PPQRY_OPERE3, "A.REALE", "REALE", 5, 2, 0, -13997);
    PAN_OPERE.SetValueListItem(PFL_OPERE_REALE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_OPERE.SetValueListItem(PFL_OPERE_REALE, (new IDVariant()), "Null", "", "", -1);
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTI, MyGlb.PANEL_LIST, 844, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTI, MyGlb.PANEL_LIST, 48);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTI, MyGlb.PANEL_LIST, 1);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTI, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_OPERE.SetRect(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTI, MyGlb.PANEL_FORM, 4, 232, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTI, MyGlb.PANEL_FORM, 48);
    PAN_OPERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTI, MyGlb.PANEL_FORM, 2);
    PAN_OPERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERE_PROGETTI, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_OPERE.SetFieldPage(PFL_OPERE_PROGETTI, -1, -1);
    PAN_OPERE.SetFieldUnbound(PFL_OPERE_PROGETTI, true);
    PAN_OPERE.SetFieldPanel(PFL_OPERE_PROGETTI, PPQRY_OPERE3, "A.PROGETTO_ID || ' ' || ' - ' || ' ' || B.DESCRIZIONE", "OPEREPROGETT", 5, 114, 0, -13997);
  }

  private void PAN_OPERE_InitQueries()
  {
    StringBuffer SQL;

    PAN_OPERE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_OPERE.SetIMDB(IMDB, "PQRY_OPERE3", true);
    PAN_OPERE.set_SetString(MyGlb.MASTER_ROWNAME, "OPERE");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.REALE as REALE, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  DECODE(A.CATEGORIA, to_number(NULL), 'Nulla', TO_CHAR ( A.CATEGORIA ) || ' ' || ' - ' || ' ' || C.DESCRIZIONE) as OPERECATEGOR, ");
    SQL.append("  A.PROGETTO_ID || ' ' || ' - ' || ' ' || B.DESCRIZIONE as OPEREPROGETT, ");
    SQL.append("  DECODE(A.ANNO_PPI, to_number(NULL), '', TO_CHAR ( A.NUMERO_PPI ) || ' ' || ' / ' || ' ' || TO_CHAR ( A.ANNO_PPI )) as OPERENUMPPI ");
    PAN_OPERE.SetQuery(PPQRY_OPERE3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  OPERE A, ");
    SQL.append("  PROGETTI B, ");
    SQL.append("  CATEGORIE_FIN C ");
    PAN_OPERE.SetQuery(PPQRY_OPERE3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGETTO_ID = B.PROGETTO_ID(+)) ");
    SQL.append("and   (A.CATEGORIA = C.CODICE(+)) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.CODICE <> 0) ");
    PAN_OPERE.SetQuery(PPQRY_OPERE3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OPERE.SetQuery(PPQRY_OPERE3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OPERE.SetQuery(PPQRY_OPERE3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OPERE.SetQuery(PPQRY_OPERE3, 5, SQL, -1, "");
    PAN_OPERE.SetQueryDB(PPQRY_OPERE3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_OPERE.SetMasterTable(0, "OPERE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_OPERE.Status() == 2)
    {
      int oldListQBE = PAN_OPERE.iUseListQBE;
      PAN_OPERE.iUseListQBE = 0;
      PAN_OPERE.PanelCommand(Glb.PCM_SEARCH);
      PAN_OPERE.PanelCommand(Glb.PCM_FIND);
      PAN_OPERE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_OPERE) PAN_OPERE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_OPERE) PAN_OPERE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
