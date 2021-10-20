// **********************************************
// Info Progetti Voce Peg
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoProgettiVocePeg extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PROGETTI_PROGRAMMA = 0;
  private static int PFL_PROGETTI_PROGETTO = 1;
  private static int PFL_PROGETTI_DESCRIZIONE = 2;
  private static int PFL_PROGETTI_STANZINIZIAL = 3;
  private static int PFL_PROGETTI_VARIAZIONI = 4;
  private static int PFL_PROGETTI_STANZDEFINIT = 5;
  private static int PFL_PROGETTI_IMPACC = 6;
  private static int PFL_PROGETTI_DISPONIBILIT = 7;

  private static int PPQRY_POLDETSTNPR1 = 0;


  IDPanel PAN_PROGETTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM6(IMDB);
    //
    //
    Init_PQRY_POLDETSTNPR1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAM6, 4);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAM6, "TBL_PARAM6");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM6,IMDBDef1.FLD_PARAM6_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM6,IMDBDef1.FLD_PARAM6_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM6,IMDBDef1.FLD_PARAM6_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM6,IMDBDef1.FLD_PARAM6_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM6,IMDBDef1.FLD_PARAM6_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM6,IMDBDef1.FLD_PARAM6_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM6,IMDBDef1.FLD_PARAM6_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM6,IMDBDef1.FLD_PARAM6_ROWNAMEARTIC,1,2,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAM6, 0);
  }

  private static void Init_PQRY_POLDETSTNPR1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_POLDETSTNPR1, 8);
    IMDB.set_TblCode(IMDBDef8.PQRY_POLDETSTNPR1, "PQRY_POLDETSTNPR1");
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_PROGRAMMA,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_PROGETTO, "PROGETTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_PROGETTO,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_DES_PROGETTO, "DES_PROGETTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_DES_PROGETTO,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_StanzIniziale, "StanzIniziale");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_StanzIniziale,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_variazioni, "variazioni");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_variazioni,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_stanzDefinitivo, "stanzDefinitivo");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_stanzDefinitivo,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_ImpAcc, "ImpAcc");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_ImpAcc,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_Disponibilit_, "Disponibilità");
    IMDB.SetFldParams(IMDBDef8.PQRY_POLDETSTNPR1,IMDBDef8.PQSL_POLDETSTNPR1_Disponibilit_,2,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_POLDETSTNPR1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoProgettiVocePeg(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoProgettiVocePeg()
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
    FormIdx = MyGlb.FRM_INFPROVOCPEG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B56D1AE4-89D7-4205-B064-E8D1CD8369AF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 792;
    DesignHeight = 362;
    set_Caption(new IDVariant("Info Progetti Voce Peg"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 792;
    Frames[1].Height = 336;
    Frames[1].Caption = "Progetti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 336;
    PAN_PROGETTI = new IDPanel(w, this, 1, "PAN_PROGETTI");
    Frames[1].Content = PAN_PROGETTI;
    PAN_PROGETTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROGETTI.VS = MainFrm.VisualStyleList;
    PAN_PROGETTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 792-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "162D7163-B9E3-4B5D-8826-8875687D2D92");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 884, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PROGETTI.InitStatus = 2;
    PAN_PROGETTI_Init();
    PAN_PROGETTI_InitFields();
    PAN_PROGETTI_InitQueries();
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
      PAN_PROGETTI.UpdatePanel(MainFrm);
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
    return (obj instanceof InfoProgettiVocePeg);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoProgettiVocePeg.class.getName() : (Glb.ClassWithPackage(InfoProgettiVocePeg.class) ? InfoProgettiVocePeg.class.getName().substring(InfoProgettiVocePeg.class.getPackage().getName().length() + 1) : InfoProgettiVocePeg.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Progetti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PROGETTI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PROGETTI);
      // 
      // Progetti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PROGETTI.set_ToolTip(Glb.OBJ_FIELD,PFL_PROGETTI_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_POLDETSTNPR1, IMDBDef8.PQSL_POLDETSTNPR1_DES_PROGETTO, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoProgettiVocePeg", "ProgettiOnDynamicPropertiesEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION2 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Progetti", IDVariant.STRING));
      v_CAPTION1 = (new IDVariant("Impegnato", IDVariant.STRING));
      v_CAPTION2 = (new IDVariant("Accertato", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTION, (new IDVariant(" - "))), (new IDVariant("Esercizio"))), (new IDVariant(" "))), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef1.TBL_PARAM6, IMDBDef1.FLD_PARAM6_ROWNAMEESERC, 0),IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))));
      if (IMDB.Value(IMDBDef1.TBL_PARAM6, IMDBDef1.FLD_PARAM6_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        PAN_PROGETTI.set_Header(Glb.OBJ_FIELD,PFL_PROGETTI_IMPACC, new IDVariant(v_CAPTION1).stringValue());
      }
      else
      {
        PAN_PROGETTI.set_Header(Glb.OBJ_FIELD,PFL_PROGETTI_IMPACC, new IDVariant(v_CAPTION2).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoProgettiVocePeg", "LoadEvent", _e);
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
      UNLOAD_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoProgettiVocePeg", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAM6, IMDBDef1.FLD_PARAM6_ROWNAMEESERC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM6, IMDBDef1.FLD_PARAM6_ROWNAMEES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM6, IMDBDef1.FLD_PARAM6_ROWNAMECAPIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAM6, IMDBDef1.FLD_PARAM6_ROWNAMEARTIC, 0, new IDVariant());
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
  private void PAN_PROGETTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PROGETTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PROGETTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PROGETTI, Cancel);
    // Stub
  }

  private void PAN_PROGETTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PROGETTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PROGETTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PROGETTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PROGETTI_Init()
  {

    PAN_PROGETTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PROGETTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PROGETTI.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGRAMMA, "CC2097EE-8F16-45BB-84FA-C4CB619E2BB6");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGRAMMA, "Programma");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGRAMMA, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGRAMMA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTO, "A1D8CEF2-32C8-4EE8-9142-991F8914709F");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTO, "Obiettivo Operativo");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTO, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, "47919FFB-2820-45B4-B214-C95687D733F9");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, "Descrizione");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZINIZIAL, "08EF7469-4998-49E4-B5C2-310140C50692");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZINIZIAL, "Stanz. Iniziale");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZINIZIAL, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZINIZIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZINIZIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_VARIAZIONI, "2212AB39-7D94-4E28-A0DE-8E16D108E0B4");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_VARIAZIONI, "Variazioni");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_VARIAZIONI, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_VARIAZIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_VARIAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZDEFINIT, "7DAE7746-958B-48BB-AA69-956AEE770271");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZDEFINIT, "Stanz. Definitivo");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZDEFINIT, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZDEFINIT, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZDEFINIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_IMPACC, "B5F01F49-7184-4F67-A4B4-C24D7A9EE4D2");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_IMPACC, "Imp Acc");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_IMPACC, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_IMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_IMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PROGETTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGETTI_DISPONIBILIT, "EC17D35C-E92F-418A-A907-42AA00D2C476");
    PAN_PROGETTI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGETTI_DISPONIBILIT, "Disponibilità");
    PAN_PROGETTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGETTI_DISPONIBILIT, "");
    PAN_PROGETTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGETTI_DISPONIBILIT, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGETTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGETTI_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PROGETTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGRAMMA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGRAMMA, MyGlb.PANEL_LIST, 76);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGRAMMA, MyGlb.PANEL_LIST, "Programma");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGRAMMA, MyGlb.PANEL_FORM, 276, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGRAMMA, MyGlb.PANEL_FORM, 64);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGRAMMA, MyGlb.PANEL_FORM, "Progr.");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_PROGRAMMA, -1, -1);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_PROGRAMMA, PPQRY_POLDETSTNPR1, "A.PROGRAMMA", "PROGRAMMA", 5, 4, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTO, MyGlb.PANEL_LIST, 76, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTO, MyGlb.PANEL_LIST, 64);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTO, MyGlb.PANEL_FORM, 420, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTO, MyGlb.PANEL_FORM, 64);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_PROGETTO, MyGlb.PANEL_FORM, "Ob. Oper.");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_PROGETTO, -1, -1);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_PROGETTO, PPQRY_POLDETSTNPR1, "A.PROGETTO", "PROGETTO", 5, 4, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, 148, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, 292, 244, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_DESCRIZIONE, -1, -1);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_DESCRIZIONE, PPQRY_POLDETSTNPR1, "A.DES_PROGETTO", "DES_PROGETTO", 5, 100, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZINIZIAL, MyGlb.PANEL_LIST, 404, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZINIZIAL, MyGlb.PANEL_LIST, 72);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZINIZIAL, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZINIZIAL, MyGlb.PANEL_LIST, "Stanz. Iniziale");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZINIZIAL, MyGlb.PANEL_FORM, 4, 4, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZINIZIAL, MyGlb.PANEL_FORM, 72);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZINIZIAL, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZINIZIAL, MyGlb.PANEL_FORM, "St. Iniziale");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_STANZINIZIAL, -1, -1);
    PAN_PROGETTI.SetFieldUnbound(PFL_PROGETTI_STANZINIZIAL, true);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_STANZINIZIAL, PPQRY_POLDETSTNPR1, "NVL(A.STN_INI, 0) + NVL(A.VAR_INI, 0)", "StanzIniziale", 2, 19, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_VARIAZIONI, MyGlb.PANEL_LIST, 500, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_VARIAZIONI, MyGlb.PANEL_FORM, 4, 4, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_VARIAZIONI, MyGlb.PANEL_FORM, 56);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_VARIAZIONI, MyGlb.PANEL_FORM, "Variaz.");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_VARIAZIONI, -1, -1);
    PAN_PROGETTI.SetFieldUnbound(PFL_PROGETTI_VARIAZIONI, true);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_VARIAZIONI, PPQRY_POLDETSTNPR1, "NVL(A.VAR_DEF, 0)", "variazioni", 2, 19, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZDEFINIT, MyGlb.PANEL_LIST, 596, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZDEFINIT, MyGlb.PANEL_LIST, 84);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZDEFINIT, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZDEFINIT, MyGlb.PANEL_LIST, "Stanz. Definitivo");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZDEFINIT, MyGlb.PANEL_FORM, 4, 28, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZDEFINIT, MyGlb.PANEL_FORM, 84);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZDEFINIT, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_STANZDEFINIT, MyGlb.PANEL_FORM, "St. Definitivo");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_STANZDEFINIT, -1, -1);
    PAN_PROGETTI.SetFieldUnbound(PFL_PROGETTI_STANZDEFINIT, true);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_STANZDEFINIT, PPQRY_POLDETSTNPR1, "NVL(A.STN_INI, 0) + NVL(A.VAR_INI, 0) + NVL(A.VAR_DEF, 0)", "stanzDefinitivo", 2, 19, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_IMPACC, MyGlb.PANEL_LIST, 692, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_IMPACC, MyGlb.PANEL_LIST, 48);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_IMPACC, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_IMPACC, MyGlb.PANEL_LIST, "Imp Acc");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_IMPACC, MyGlb.PANEL_FORM, 4, 52, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_IMPACC, MyGlb.PANEL_FORM, 48);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_IMPACC, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_IMPACC, MyGlb.PANEL_FORM, "Im. Acc");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_IMPACC, -1, -1);
    PAN_PROGETTI.SetFieldUnbound(PFL_PROGETTI_IMPACC, true);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_IMPACC, PPQRY_POLDETSTNPR1, "NVL(A.IMP_ACC, 0)", "ImpAcc", 2, 19, 0, -13997);
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DISPONIBILIT, MyGlb.PANEL_LIST, 788, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DISPONIBILIT, MyGlb.PANEL_LIST, 64);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_PROGETTI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGETTI_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 76, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGETTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGETTI_DISPONIBILIT, MyGlb.PANEL_FORM, 64);
    PAN_PROGETTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGETTI_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_PROGETTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGETTI_DISPONIBILIT, MyGlb.PANEL_FORM, "Dispon.");
    PAN_PROGETTI.SetFieldPage(PFL_PROGETTI_DISPONIBILIT, -1, -1);
    PAN_PROGETTI.SetFieldUnbound(PFL_PROGETTI_DISPONIBILIT, true);
    PAN_PROGETTI.SetFieldPanel(PFL_PROGETTI_DISPONIBILIT, PPQRY_POLDETSTNPR1, "NVL(A.DISP, 0)", "Disponibilità", 2, 19, 0, -13997);
  }

  private void PAN_PROGETTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROGETTI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PROGETTI.SetIMDB(IMDB, "PQRY_POLDETSTNPR1", true);
    PAN_PROGETTI.set_SetString(MyGlb.MASTER_ROWNAME, "POL DETTAGLIO STN PROG");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRAMMA as PROGRAMMA, ");
    SQL.append("  A.PROGETTO as PROGETTO, ");
    SQL.append("  A.DES_PROGETTO as DES_PROGETTO, ");
    SQL.append("  NVL(A.STN_INI, 0) + NVL(A.VAR_INI, 0) as StanzIniziale, ");
    SQL.append("  NVL(A.VAR_DEF, 0) as variazioni, ");
    SQL.append("  NVL(A.STN_INI, 0) + NVL(A.VAR_INI, 0) + NVL(A.VAR_DEF, 0) as stanzDefinitivo, ");
    SQL.append("  NVL(A.IMP_ACC, 0) as ImpAcc, ");
    SQL.append("  NVL(A.DISP, 0) as Disponibilità ");
    PAN_PROGETTI.SetQuery(PPQRY_POLDETSTNPR1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_DETTAGLIO_STN_PROG A ");
    PAN_PROGETTI.SetQuery(PPQRY_POLDETSTNPR1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = NVL(~~TBL_PARAM6.ROWNAMEESERC~~, ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    SQL.append("and   (A.ESERCIZIO_STN = NVL(~~TBL_PARAM6.ROWNAMEESERC~~, ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAM6.ROWNAMEES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAM6.ROWNAMECAPIT~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAM6.ROWNAMEARTIC~~) ");
    PAN_PROGETTI.SetQuery(PPQRY_POLDETSTNPR1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROGETTI.SetQuery(PPQRY_POLDETSTNPR1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROGETTI.SetQuery(PPQRY_POLDETSTNPR1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROGETTI.SetQuery(PPQRY_POLDETSTNPR1, 5, SQL, -1, "");
    PAN_PROGETTI.SetQueryDB(PPQRY_POLDETSTNPR1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROGETTI.SetMasterTable(0, "POL_DETTAGLIO_STN_PROG");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PROGETTI.Status() == 2)
    {
      int oldListQBE = PAN_PROGETTI.iUseListQBE;
      PAN_PROGETTI.iUseListQBE = 0;
      PAN_PROGETTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PROGETTI.PanelCommand(Glb.PCM_FIND);
      PAN_PROGETTI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PROGETTI) PAN_PROGETTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROGETTI) PAN_PROGETTI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PROGETTI) PAN_PROGETTI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROGETTI) PAN_PROGETTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PROGETTI) PAN_PROGETTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
