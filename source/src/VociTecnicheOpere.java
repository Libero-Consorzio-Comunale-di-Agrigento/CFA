// **********************************************
// Voci Tecniche Opere
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VociTecnicheOpere extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VOCITECNOPER_CODICE = 0;
  private static int PFL_VOCITECNOPER_DESCRIZIONE = 1;

  private static int PPQRY_VOCITECNOPER = 0;


  IDPanel PAN_VOCITECNOPER;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR118(IMDB);
    //
    //
    Init_PQRY_VOCITECNOPER(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR118(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PAR118, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PAR118, "TBL_PAR118");
    IMDB.set_FldCode(IMDBDef1.TBL_PAR118,IMDBDef1.FLD_PAR118_NOMEOGGELOOK, "NOMEOGGELOOK");
    IMDB.SetFldParams(IMDBDef1.TBL_PAR118,IMDBDef1.FLD_PAR118_NOMEOGGELOOK,5,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PAR118, 0);
  }

  private static void Init_PQRY_VOCITECNOPER(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_VOCITECNOPER, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_VOCITECNOPER, "PQRY_VOCITECNOPER");
    IMDB.set_FldCode(IMDBDef9.PQRY_VOCITECNOPER,IMDBDef9.PQSL_VOCITECNOPER_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_VOCITECNOPER,IMDBDef9.PQSL_VOCITECNOPER_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VOCITECNOPER,IMDBDef9.PQSL_VOCITECNOPER_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_VOCITECNOPER,IMDBDef9.PQSL_VOCITECNOPER_DESCRIZIONE,5,200,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_VOCITECNOPER, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VociTecnicheOpere(MyWebEntryPoint w, IMDBObj imdb)
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
  public VociTecnicheOpere()
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
    FormIdx = MyGlb.FRM_VOCITECNOPER;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A0A4A9B8-23FD-435E-8767-EC2851C94718";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 664;
    DesignHeight = 386;
    set_Caption(new IDVariant("Voci Tecniche Opere"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 664;
    Frames[1].Height = 360;
    Frames[1].Caption = "Voci Tecniche Opere";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_VOCITECNOPER = new IDPanel(w, this, 1, "PAN_VOCITECNOPER");
    Frames[1].Content = PAN_VOCITECNOPER;
    PAN_VOCITECNOPER.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VOCITECNOPER.VS = MainFrm.VisualStyleList;
    PAN_VOCITECNOPER.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 664-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VOCITECNOPER.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "70F9ECD4-EF61-4CB8-859C-D4B90FDB1279");
    PAN_VOCITECNOPER.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 544, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VOCITECNOPER.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VOCITECNOPER.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VOCITECNOPER.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VOCITECNOPER.InitStatus = 2;
    PAN_VOCITECNOPER_Init();
    PAN_VOCITECNOPER_InitFields();
    PAN_VOCITECNOPER_InitQueries();
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
      PAN_VOCITECNOPER.UpdatePanel(MainFrm);
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
    return (obj instanceof VociTecnicheOpere);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VociTecnicheOpere.class.getName() : (Glb.ClassWithPackage(VociTecnicheOpere.class) ? VociTecnicheOpere.class.getName().substring(VociTecnicheOpere.class.getPackage().getName().length() + 1) : VociTecnicheOpere.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Voci Tecniche Opere On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VOCITECNOPER_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VOCITECNOPER);
      // 
      // Voci Tecniche Opere On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (PAN_VOCITECNOPER.IsNewRow())
      {
        PAN_VOCITECNOPER.SetFlags (Glb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VOCITECNOPER.SetFlags (Glb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VociTecnicheOpere", "VociTecnicheOpereOnDynamicProperties", _e);
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
      PAN_VOCITECNOPER.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (IMDB.Value(IMDBDef1.TBL_PAR118, IMDBDef1.FLD_PAR118_NOMEOGGELOOK, 0).equals((new IDVariant("SI")), true))
      {
        PAN_VOCITECNOPER.set_Locked((new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VociTecnicheOpere", "Load", _e);
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
      UNLOAD_PARDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VociTecnicheOpere", "Unload", _e);
    }
  }

  // **********************************************************************
  // Par: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PAR118, IMDBDef1.FLD_PAR118_NOMEOGGELOOK, 0, new IDVariant());
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
  private void PAN_VOCITECNOPER_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VOCITECNOPER, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VOCITECNOPER_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VOCITECNOPER, Cancel);
    // Stub
  }

  private void PAN_VOCITECNOPER_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VOCITECNOPER_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VOCITECNOPER_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VOCITECNOPER_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VOCITECNOPER_Init()
  {

    PAN_VOCITECNOPER.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VOCITECNOPER.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VOCITECNOPER.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_VOCITECNOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, "4C622AE5-CC52-4D84-9A1A-6E3A0C5036C0");
    PAN_VOCITECNOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, "Codice");
    PAN_VOCITECNOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, "");
    PAN_VOCITECNOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCITECNOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VOCITECNOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_DESCRIZIONE, "2FB7927F-4A16-42D7-9DD2-052682285BF2");
    PAN_VOCITECNOPER.set_Header(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_DESCRIZIONE, "Descrizione");
    PAN_VOCITECNOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_DESCRIZIONE, "");
    PAN_VOCITECNOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VOCITECNOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_VOCITECNOPER_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VOCITECNOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCITECNOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_VOCITECNOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VOCITECNOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_VOCITECNOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, MyGlb.PANEL_FORM, 20, 8, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCITECNOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, MyGlb.PANEL_FORM, 96);
    PAN_VOCITECNOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VOCITECNOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_VOCITECNOPER.SetFieldPage(PFL_VOCITECNOPER_CODICE, -1, -1);
    PAN_VOCITECNOPER.SetFieldPanel(PFL_VOCITECNOPER_CODICE, PPQRY_VOCITECNOPER, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_VOCITECNOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_DESCRIZIONE, MyGlb.PANEL_LIST, 48, 36, 496, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VOCITECNOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_VOCITECNOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VOCITECNOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VOCITECNOPER.SetRect(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_DESCRIZIONE, MyGlb.PANEL_FORM, 20, 32, 496, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VOCITECNOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_VOCITECNOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_DESCRIZIONE, MyGlb.PANEL_FORM, 3);
    PAN_VOCITECNOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VOCITECNOPER_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VOCITECNOPER.SetFieldPage(PFL_VOCITECNOPER_DESCRIZIONE, -1, -1);
    PAN_VOCITECNOPER.SetFieldPanel(PFL_VOCITECNOPER_DESCRIZIONE, PPQRY_VOCITECNOPER, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
  }

  private void PAN_VOCITECNOPER_InitQueries()
  {
    StringBuffer SQL;

    PAN_VOCITECNOPER.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VOCITECNOPER.SetIMDB(IMDB, "PQRY_VOCITECNOPER", true);
    PAN_VOCITECNOPER.set_SetString(MyGlb.MASTER_ROWNAME, "VOCI TECNICHE OPERE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_VOCITECNOPER.SetQuery(PPQRY_VOCITECNOPER, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VOCI_TECNICHE_OPERE A ");
    PAN_VOCITECNOPER.SetQuery(PPQRY_VOCITECNOPER, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCITECNOPER.SetQuery(PPQRY_VOCITECNOPER, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCITECNOPER.SetQuery(PPQRY_VOCITECNOPER, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VOCITECNOPER.SetQuery(PPQRY_VOCITECNOPER, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VOCITECNOPER.SetQuery(PPQRY_VOCITECNOPER, 5, SQL, -1, "");
    PAN_VOCITECNOPER.SetQueryDB(PPQRY_VOCITECNOPER, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VOCITECNOPER.SetMasterTable(0, "VOCI_TECNICHE_OPERE");
    PAN_VOCITECNOPER.AddToSortList(PFL_VOCITECNOPER_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VOCITECNOPER.Status() == 2)
    {
      int oldListQBE = PAN_VOCITECNOPER.iUseListQBE;
      PAN_VOCITECNOPER.iUseListQBE = 0;
      PAN_VOCITECNOPER.PanelCommand(Glb.PCM_SEARCH);
      PAN_VOCITECNOPER.PanelCommand(Glb.PCM_FIND);
      PAN_VOCITECNOPER.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VOCITECNOPER) PAN_VOCITECNOPER_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VOCITECNOPER) PAN_VOCITECNOPER_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VOCITECNOPER) PAN_VOCITECNOPER_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VOCITECNOPER) PAN_VOCITECNOPER_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VOCITECNOPER) PAN_VOCITECNOPER_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
