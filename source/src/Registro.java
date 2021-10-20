// **********************************************
// Registro
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Registro extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  ATree TRE_REGISTRO1;
  private static int PFL_REGISTRO_CHIAVE = 0;
  private static int PFL_REGISTRO_STRINGA = 1;
  private static int PFL_REGISTRO_VALORE = 2;
  private static int PFL_REGISTRO_COMMENTO = 3;

  private static int PPQRY_REGISTRO = 0;


  IDPanel PAN_REGISTRO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_REGISTRO1(IMDB);
    Init_PQRY_REGISTRO2(IMDB);
    Init_PQRY_REGISTRO(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_REGISTRO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_REGISTRO1, 5);
    IMDB.set_TblCode(IMDBDef17.PQRY_REGISTRO1, "PQRY_REGISTRO1");
    IMDB.set_FldCode(IMDBDef17.PQRY_REGISTRO1,IMDBDef17.PQSL_REGISTRO1_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef17.PQRY_REGISTRO1,IMDBDef17.PQSL_REGISTRO1_RECORDDESCRI,5,512,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_REGISTRO1,IMDBDef17.PQSL_REGISTRO1_RECORDCHIAVE, "RECORDCHIAVE");
    IMDB.SetFldParams(IMDBDef17.PQRY_REGISTRO1,IMDBDef17.PQSL_REGISTRO1_RECORDCHIAVE,5,512,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_REGISTRO1,IMDBDef17.PQSL_REGISTRO1_NODO, "NODO");
    IMDB.SetFldParams(IMDBDef17.PQRY_REGISTRO1,IMDBDef17.PQSL_REGISTRO1_NODO,5,513,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_REGISTRO1,IMDBDef17.PQSL_REGISTRO1_LIVELLO, "LIVELLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_REGISTRO1,IMDBDef17.PQSL_REGISTRO1_LIVELLO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_REGISTRO1,IMDBDef17.PQSL_REGISTRO1_TOOLTIP, "TOOLTIP");
    IMDB.SetFldParams(IMDBDef17.PQRY_REGISTRO1,IMDBDef17.PQSL_REGISTRO1_TOOLTIP,5,512,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_REGISTRO1, 0);
  }

  private static void Init_PQRY_REGISTRO2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_REGISTRO2, 5);
    IMDB.set_TblCode(IMDBDef17.PQRY_REGISTRO2, "PQRY_REGISTRO2");
    IMDB.set_FldCode(IMDBDef17.PQRY_REGISTRO2,IMDBDef17.PQSL_REGISTRO2_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef17.PQRY_REGISTRO2,IMDBDef17.PQSL_REGISTRO2_RECORDDESCRI,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_REGISTRO2,IMDBDef17.PQSL_REGISTRO2_RECORDCHIAVE, "RECORDCHIAVE");
    IMDB.SetFldParams(IMDBDef17.PQRY_REGISTRO2,IMDBDef17.PQSL_REGISTRO2_RECORDCHIAVE,5,512,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_REGISTRO2,IMDBDef17.PQSL_REGISTRO2_NODO, "NODO");
    IMDB.SetFldParams(IMDBDef17.PQRY_REGISTRO2,IMDBDef17.PQSL_REGISTRO2_NODO,5,513,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_REGISTRO2,IMDBDef17.PQSL_REGISTRO2_LIVELLO, "LIVELLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_REGISTRO2,IMDBDef17.PQSL_REGISTRO2_LIVELLO,1,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_REGISTRO2,IMDBDef17.PQSL_REGISTRO2_TOOLTIP, "TOOLTIP");
    IMDB.SetFldParams(IMDBDef17.PQRY_REGISTRO2,IMDBDef17.PQSL_REGISTRO2_TOOLTIP,5,512,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_REGISTRO2, 0);
  }

  private static void Init_PQRY_REGISTRO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_REGISTRO, 4);
    IMDB.set_TblCode(IMDBDef17.PQRY_REGISTRO, "PQRY_REGISTRO");
    IMDB.set_FldCode(IMDBDef17.PQRY_REGISTRO,IMDBDef17.PQSL_REGISTRO_STRINGA, "STRINGA");
    IMDB.SetFldParams(IMDBDef17.PQRY_REGISTRO,IMDBDef17.PQSL_REGISTRO_STRINGA,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_REGISTRO,IMDBDef17.PQSL_REGISTRO_VALORE, "VALORE");
    IMDB.SetFldParams(IMDBDef17.PQRY_REGISTRO,IMDBDef17.PQSL_REGISTRO_VALORE,5,2000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_REGISTRO,IMDBDef17.PQSL_REGISTRO_COMMENTO, "COMMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_REGISTRO,IMDBDef17.PQSL_REGISTRO_COMMENTO,5,2000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_REGISTRO,IMDBDef17.PQSL_REGISTRO_CHIAVE, "CHIAVE");
    IMDB.SetFldParams(IMDBDef17.PQRY_REGISTRO,IMDBDef17.PQSL_REGISTRO_CHIAVE,5,512,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_REGISTRO, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Registro(MyWebEntryPoint w, IMDBObj imdb)
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
  public Registro()
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
    FormIdx = MyGlb.FRM_REGISTRO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F992A13D-C15D-4152-A13D-70D04966B384";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1064;
    DesignHeight = 490;
    set_Caption(new IDVariant("Registro"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1064;
    Frames[1].Height = 464;
    Frames[1].FormFactor = 0.229323;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 244;
    Frames[2].Height = 464;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Registro";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 464;
    TRE_REGISTRO1 = new ATree(this);
    Frames[2].Content = TRE_REGISTRO1;
    TRE_REGISTRO1.Width = 244;
    TRE_REGISTRO1.Height = 464;
    TRE_REGISTRO1.FrIndex = 2;
    TRE_REGISTRO1.Code = "TRE_REGISTRO1";
    TRE_REGISTRO1.iGuid = "62CC29D3-0FF2-4D0E-BBA9-9855A3841793";
    TRE_REGISTRO1.SetItemCount(2);
    Item = new ATreeItem();
    TRE_REGISTRO1.SetItem(1,Item);
    Item.ItemIndex = "N00001";
    Item.Tooltip = "";
    Item.Name = "Radice";
    Item.HasTooltip = true;
    Item.iGuid = "16B37758-A72D-4B22-A70B-D79DC8D80D21";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.CHIAVE as RECORDDESCRI, ");
    SQL.append("  A.CHIAVE as RECORDCHIAVE, ");
    SQL.append("  A.CHIAVE || '/' as NODO, ");
    SQL.append("  0 as LIVELLO, ");
    SQL.append("  A.CHIAVE as TOOLTIP ");
    SQL.append("from ");
    SQL.append("  REGISTRO A ");
    SQL.append("where ((SUBSTR(A.CHIAVE, 1, INSTR(A.CHIAVE, '/', -1)) IS NULL)) ");
    SQL.append("order by 1 ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef17.PQRY_REGISTRO1);
    Item.AddPK("RECORDDESCRI");
    Item.AddPK("RECORDCHIAVE");
    Item.AddPK("TOOLTIP");
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_REGISTRO1.SetItem(2,Item);
    Item.ItemIndex = "N00002";
    Item.Tooltip = "";
    Item.Name = "Radice";
    Item.HasTooltip = true;
    Item.iGuid = "46352C2F-9719-4CF5-9E54-4D5C6FB793FE";
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  SUBSTR(A.CHIAVE, INSTR(A.CHIAVE, '/', -1) + 1, 8000) as RECORDDESCRI, ");
    SQL.append("  A.CHIAVE as RECORDCHIAVE, ");
    SQL.append("  A.CHIAVE || '/' as NODO, ");
    SQL.append("  LENGTH(A.CHIAVE) - LENGTH(REPLACE(A.CHIAVE, '/', '')) as LIVELLO, ");
    SQL.append("  A.CHIAVE as TOOLTIP ");
    SQL.append("from ");
    SQL.append("  REGISTRO A ");
    SQL.append("where (SUBSTR(A.CHIAVE, 1, INSTR(A.CHIAVE, '/', -1)) = ~~PQRY_REGISTRO1.NODO~~) ");
    SQL.append("order by 1 ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef17.PQRY_REGISTRO1);
    Item.AddPK("RECORDCHIAVE");
    Item.AddPK("TOOLTIP");
    Item = TRE_REGISTRO1.GetItem(1);
    Item.SetItem(1, TRE_REGISTRO1.GetItem(2));
    Item = TRE_REGISTRO1.GetItem(2);
    Item.Parent = TRE_REGISTRO1.GetItem(1);
    Item.Derived = TRE_REGISTRO1.GetItem(1);
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 820;
    Frames[3].Height = 464;
    Frames[3].Caption = "Registro";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 464;
    PAN_REGISTRO = new IDPanel(w, this, 3, "PAN_REGISTRO");
    Frames[3].Content = PAN_REGISTRO;
    PAN_REGISTRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_REGISTRO.VS = MainFrm.VisualStyleList;
    PAN_REGISTRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 820-MyGlb.PAN_OFFS_X, 464-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_REGISTRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1B4BA1A4-761A-4FBD-9612-CBD83D720B05");
    PAN_REGISTRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 772, 416, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_REGISTRO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_REGISTRO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_REGISTRO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_REGISTRO.InitStatus = 2;
    PAN_REGISTRO_Init();
    PAN_REGISTRO_InitFields();
    PAN_REGISTRO_InitQueries();
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
      PAN_REGISTRO.UpdatePanel(MainFrm);
      TRE_REGISTRO1.UpdateTree(MainFrm);
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
    return (obj instanceof Registro);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Registro.class.getName() : (Glb.ClassWithPackage(Registro.class) ? Registro.class.getName().substring(Registro.class.getPackage().getName().length() + 1) : Registro.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Registro On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_REGISTRO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Registro On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef17.PQRY_REGISTRO, IMDBDef17.PQSL_REGISTRO_CHIAVE, 0, IMDB.Value(IMDBDef17.PQRY_REGISTRO1, IMDBDef17.PQSL_REGISTRO1_RECORDCHIAVE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Registro", "RegistroOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Registro On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_REGISTRO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_REGISTRO);
      // 
      // Registro On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_REGISTRO.set_ToolTip(Glb.OBJ_FIELD,PFL_REGISTRO_STRINGA,(new IDVariant(PAN_REGISTRO.FieldText(PFL_REGISTRO_STRINGA))).stringValue()); 
      PAN_REGISTRO.set_ToolTip(Glb.OBJ_FIELD,PFL_REGISTRO_VALORE,(new IDVariant(PAN_REGISTRO.FieldText(PFL_REGISTRO_VALORE))).stringValue()); 
      PAN_REGISTRO.set_ToolTip(Glb.OBJ_FIELD,PFL_REGISTRO_COMMENTO,(new IDVariant(PAN_REGISTRO.FieldText(PFL_REGISTRO_COMMENTO))).stringValue()); 
      if (PAN_REGISTRO.IsNewRow())
      {
        PAN_REGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_REGISTRO_STRINGA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_REGISTRO.SetFlags (Glb.OBJ_FIELD, PFL_REGISTRO_STRINGA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Registro", "RegistroOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Registro After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_REGISTRO_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Registro After Commit Body
      // Corpo Procedura
      // 
      MainFrm.SettaParametriRegistro();
      MainFrm.SettaParametriRegistroPAGOPA();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Registro", "RegistroAfterCommit", _e);
    }
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
  private void TRE_REGISTRO1_NodeClick(ATreeNode Node)
  {
    if (TRE_REGISTRO1.NodeClick(MainFrm, Node))
    {
    }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_REGISTRO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_REGISTRO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_REGISTRO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_REGISTRO, Cancel);
    // Stub
  }

  private void PAN_REGISTRO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_REGISTRO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_REGISTRO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_REGISTRO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_REGISTRO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_REGISTRO_Init()
  {

    PAN_REGISTRO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_REGISTRO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_REGISTRO.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_REGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRO_CHIAVE, "8959A819-4868-4429-AE50-79A8986FD99A");
    PAN_REGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRO_CHIAVE, "CHIAVE");
    PAN_REGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRO_CHIAVE, "");
    PAN_REGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRO_CHIAVE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_REGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRO_CHIAVE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_REGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRO_STRINGA, "DA12865D-F324-4D27-AAF0-28D02F44FF0B");
    PAN_REGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRO_STRINGA, "Nome");
    PAN_REGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRO_STRINGA, "");
    PAN_REGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRO_STRINGA, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRO_STRINGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_REGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRO_VALORE, "A76B6A39-DC76-406D-B6FA-9F61220BA108");
    PAN_REGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRO_VALORE, "Dati");
    PAN_REGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRO_VALORE, "");
    PAN_REGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRO_VALORE, MyGlb.VIS_HTMLNORMFIEL);
    PAN_REGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRO_VALORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_REGISTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_REGISTRO_COMMENTO, "946ECED2-9780-4839-9034-715A7B24D930");
    PAN_REGISTRO.set_Header(MyGlb.OBJ_FIELD, PFL_REGISTRO_COMMENTO, "Commento");
    PAN_REGISTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_REGISTRO_COMMENTO, "");
    PAN_REGISTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_REGISTRO_COMMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_REGISTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_REGISTRO_COMMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_REGISTRO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_REGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRO_CHIAVE, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRO_CHIAVE, MyGlb.PANEL_LIST, 52);
    PAN_REGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRO_CHIAVE, MyGlb.PANEL_LIST, 2);
    PAN_REGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRO_CHIAVE, MyGlb.PANEL_LIST, "CHIAVE");
    PAN_REGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRO_CHIAVE, MyGlb.PANEL_FORM, 4, 124, 488, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRO_CHIAVE, MyGlb.PANEL_FORM, 52);
    PAN_REGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRO_CHIAVE, MyGlb.PANEL_FORM, 2);
    PAN_REGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRO_CHIAVE, MyGlb.PANEL_FORM, "CHIAVE");
    PAN_REGISTRO.SetFieldPage(PFL_REGISTRO_CHIAVE, -1, -1);
    PAN_REGISTRO.SetFieldPanel(PFL_REGISTRO_CHIAVE, PPQRY_REGISTRO, "A.CHIAVE", "CHIAVE", 5, 512, 0, -13997);
    PAN_REGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRO_STRINGA, MyGlb.PANEL_LIST, 0, 36, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRO_STRINGA, MyGlb.PANEL_LIST, 60);
    PAN_REGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRO_STRINGA, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRO_STRINGA, MyGlb.PANEL_LIST, "Nome");
    PAN_REGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRO_STRINGA, MyGlb.PANEL_FORM, 4, 4, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRO_STRINGA, MyGlb.PANEL_FORM, 60);
    PAN_REGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRO_STRINGA, MyGlb.PANEL_FORM, 1);
    PAN_REGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRO_STRINGA, MyGlb.PANEL_FORM, "Nome");
    PAN_REGISTRO.SetFieldPage(PFL_REGISTRO_STRINGA, -1, -1);
    PAN_REGISTRO.SetFieldPanel(PFL_REGISTRO_STRINGA, PPQRY_REGISTRO, "A.STRINGA", "STRINGA", 5, 100, 0, -13997);
    PAN_REGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRO_VALORE, MyGlb.PANEL_LIST, 172, 36, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRO_VALORE, MyGlb.PANEL_LIST, 52);
    PAN_REGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRO_VALORE, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRO_VALORE, MyGlb.PANEL_LIST, "Dati");
    PAN_REGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRO_VALORE, MyGlb.PANEL_FORM, 4, 28, 488, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRO_VALORE, MyGlb.PANEL_FORM, 52);
    PAN_REGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRO_VALORE, MyGlb.PANEL_FORM, 2);
    PAN_REGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRO_VALORE, MyGlb.PANEL_FORM, "Dati");
    PAN_REGISTRO.SetFieldPage(PFL_REGISTRO_VALORE, -1, -1);
    PAN_REGISTRO.SetFieldPanel(PFL_REGISTRO_VALORE, PPQRY_REGISTRO, "A.VALORE", "VALORE", 5, 2000, 0, -13997);
    PAN_REGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRO_COMMENTO, MyGlb.PANEL_LIST, 484, 36, 288, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_REGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRO_COMMENTO, MyGlb.PANEL_LIST, 72);
    PAN_REGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRO_COMMENTO, MyGlb.PANEL_LIST, 1);
    PAN_REGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRO_COMMENTO, MyGlb.PANEL_LIST, "Commento");
    PAN_REGISTRO.SetRect(MyGlb.OBJ_FIELD, PFL_REGISTRO_COMMENTO, MyGlb.PANEL_FORM, 4, 76, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_REGISTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_REGISTRO_COMMENTO, MyGlb.PANEL_FORM, 72);
    PAN_REGISTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_REGISTRO_COMMENTO, MyGlb.PANEL_FORM, 2);
    PAN_REGISTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_REGISTRO_COMMENTO, MyGlb.PANEL_FORM, "Commento");
    PAN_REGISTRO.SetFieldPage(PFL_REGISTRO_COMMENTO, -1, -1);
    PAN_REGISTRO.SetFieldPanel(PFL_REGISTRO_COMMENTO, PPQRY_REGISTRO, "A.COMMENTO", "COMMENTO", 5, 2000, 0, -13997);
  }

  private void PAN_REGISTRO_InitQueries()
  {
    StringBuffer SQL;

    PAN_REGISTRO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_REGISTRO.SetIMDB(IMDB, "PQRY_REGISTRO", true);
    PAN_REGISTRO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.STRINGA as STRINGA, ");
    SQL.append("  A.VALORE as VALORE, ");
    SQL.append("  A.COMMENTO as COMMENTO, ");
    SQL.append("  A.CHIAVE as CHIAVE ");
    PAN_REGISTRO.SetQuery(PPQRY_REGISTRO, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  REGISTRO A ");
    PAN_REGISTRO.SetQuery(PPQRY_REGISTRO, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.CHIAVE = ~~PQRY_REGISTRO1.RECORDCHIAVE~~) ");
    PAN_REGISTRO.SetQuery(PPQRY_REGISTRO, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_REGISTRO.SetQuery(PPQRY_REGISTRO, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_REGISTRO.SetQuery(PPQRY_REGISTRO, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.STRINGA ");
    PAN_REGISTRO.SetQuery(PPQRY_REGISTRO, 5, SQL, -1, "");
    PAN_REGISTRO.SetQueryDB(PPQRY_REGISTRO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_REGISTRO.SetMasterTable(0, "REGISTRO");
    PAN_REGISTRO.AddToSortList(PFL_REGISTRO_STRINGA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_REGISTRO.Status() == 2)
    {
      int oldListQBE = PAN_REGISTRO.iUseListQBE;
      PAN_REGISTRO.iUseListQBE = 0;
      PAN_REGISTRO.PanelCommand(Glb.PCM_SEARCH);
      PAN_REGISTRO.PanelCommand(Glb.PCM_FIND);
      PAN_REGISTRO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_REGISTRO) PAN_REGISTRO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_REGISTRO) PAN_REGISTRO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_REGISTRO) PAN_REGISTRO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_REGISTRO) PAN_REGISTRO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_REGISTRO) PAN_REGISTRO_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_REGISTRO) PAN_REGISTRO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == TRE_REGISTRO1) TRE_REGISTRO1_NodeClick(Node);
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
