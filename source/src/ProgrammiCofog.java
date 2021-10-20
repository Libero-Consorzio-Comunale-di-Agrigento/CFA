// **********************************************
// Programmi Cofog
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ProgrammiCofog extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PROGRAMCOFOG_PROGRAMMA = 0;
  private static int PFL_PROGRAMCOFOG_DESCRIPROGRA = 1;
  private static int PFL_PROGRAMCOFOG_COFOG = 2;
  private static int PFL_PROGRAMCOFOG_DESCRIZCOFOG = 3;

  private static int PPQRY_PROGRAMCOFOG = 0;

  private static int PPQRY_BILSTRUTTURA = 1;
  private static int PPQRY_STRUTTRICLAS = 2;


  IDPanel PAN_PROGRAMCOFOG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_PROGRAMCOFOG(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_PROGRAMCOFOG(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PROGRAMCOFOG, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_PROGRAMCOFOG, "PQRY_PROGRAMCOFOG");
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMCOFOG,IMDBDef8.PQSL_PROGRAMCOFOG_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMCOFOG,IMDBDef8.PQSL_PROGRAMCOFOG_PROGRAMMA,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMCOFOG,IMDBDef8.PQSL_PROGRAMCOFOG_COFOG, "COFOG");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMCOFOG,IMDBDef8.PQSL_PROGRAMCOFOG_COFOG,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PROGRAMCOFOG, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ProgrammiCofog(MyWebEntryPoint w, IMDBObj imdb)
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
  public ProgrammiCofog()
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
    FormIdx = MyGlb.FRM_PROGRAMCOFOG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2DA38BC0-5F24-486B-90BF-D122A8FEE1FC";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 812;
    DesignHeight = 26;
    set_Caption(new IDVariant("Programmi Cofog"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 812;
    Frames[1].Height = 380;
    Frames[1].Caption = "Programmi Cofog";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 380;
    PAN_PROGRAMCOFOG = new IDPanel(w, this, 1, "PAN_PROGRAMCOFOG");
    Frames[1].Content = PAN_PROGRAMCOFOG;
    PAN_PROGRAMCOFOG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROGRAMCOFOG.VS = MainFrm.VisualStyleList;
    PAN_PROGRAMCOFOG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 812-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PROGRAMCOFOG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8945BD60-693A-4C42-9F1C-27A263059A07");
    PAN_PROGRAMCOFOG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 764, 276, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PROGRAMCOFOG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROGRAMCOFOG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PROGRAMCOFOG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PROGRAMCOFOG.InitStatus = 2;
    PAN_PROGRAMCOFOG_Init();
    PAN_PROGRAMCOFOG_InitFields();
    PAN_PROGRAMCOFOG_InitQueries();
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
      PAN_PROGRAMCOFOG.UpdatePanel(MainFrm);
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
    return (obj instanceof ProgrammiCofog);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ProgrammiCofog.class.getName() : (Glb.ClassWithPackage(ProgrammiCofog.class) ? ProgrammiCofog.class.getName().substring(ProgrammiCofog.class.getPackage().getName().length() + 1) : ProgrammiCofog.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  
  
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
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PROGRAMCOFOG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PROGRAMCOFOG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PROGRAMCOFOG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PROGRAMCOFOG, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PROGRAMCOFOG_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PROGRAMCOFOG);
    // Stub
  }

  private void PAN_PROGRAMCOFOG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PROGRAMCOFOG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PROGRAMCOFOG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PROGRAMCOFOG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PROGRAMCOFOG_Init()
  {

    PAN_PROGRAMCOFOG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PROGRAMCOFOG.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PROGRAMCOFOG.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PROGRAMCOFOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_PROGRAMMA, "AF98EBC8-BA2E-4642-BCC5-B2A32D63BD9D");
    PAN_PROGRAMCOFOG.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_PROGRAMMA, "Programma");
    PAN_PROGRAMCOFOG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_PROGRAMMA, "");
    PAN_PROGRAMCOFOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_PROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGRAMCOFOG.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_PROGRAMMA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PROGRAMCOFOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIPROGRA, "2E739B40-BACD-4770-A06B-56138D126E8A");
    PAN_PROGRAMCOFOG.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIPROGRA, "Descrizione Programma");
    PAN_PROGRAMCOFOG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIPROGRA, "");
    PAN_PROGRAMCOFOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIPROGRA, MyGlb.VIS_VISULOOUPCF4);
    PAN_PROGRAMCOFOG.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIPROGRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PROGRAMCOFOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_COFOG, "E92B3F66-FC35-45FA-8B2A-1BD59FBA93BF");
    PAN_PROGRAMCOFOG.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_COFOG, "COFOG");
    PAN_PROGRAMCOFOG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_COFOG, "");
    PAN_PROGRAMCOFOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_COFOG, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGRAMCOFOG.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_COFOG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PROGRAMCOFOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIZCOFOG, "9C0E1ADA-5802-43B8-9808-6FEFE492146D");
    PAN_PROGRAMCOFOG.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIZCOFOG, "Descrizione COFOG");
    PAN_PROGRAMCOFOG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIZCOFOG, "");
    PAN_PROGRAMCOFOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIZCOFOG, MyGlb.VIS_VISULOOUPCF4);
    PAN_PROGRAMCOFOG.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIZCOFOG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PROGRAMCOFOG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PROGRAMCOFOG.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_PROGRAMMA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMCOFOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_PROGRAMMA, MyGlb.PANEL_LIST, 84);
    PAN_PROGRAMCOFOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMCOFOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_PROGRAMMA, MyGlb.PANEL_LIST, "Programma");
    PAN_PROGRAMCOFOG.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_PROGRAMMA, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMCOFOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_PROGRAMMA, MyGlb.PANEL_FORM, 96);
    PAN_PROGRAMCOFOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_PROGRAMCOFOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_PROGRAMMA, MyGlb.PANEL_FORM, "Programma");
    PAN_PROGRAMCOFOG.SetFieldPage(PFL_PROGRAMCOFOG_PROGRAMMA, -1, -1);
    PAN_PROGRAMCOFOG.SetFieldPanel(PFL_PROGRAMCOFOG_PROGRAMMA, PPQRY_PROGRAMCOFOG, "A.PROGRAMMA", "PROGRAMMA", 5, 4, 0, -13997);
    PAN_PROGRAMCOFOG.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIPROGRA, MyGlb.PANEL_LIST, 76, 36, 320, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROGRAMCOFOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIPROGRA, MyGlb.PANEL_LIST, 176);
    PAN_PROGRAMCOFOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIPROGRA, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMCOFOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIPROGRA, MyGlb.PANEL_LIST, "Descrizione Programma");
    PAN_PROGRAMCOFOG.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIPROGRA, MyGlb.PANEL_FORM, 4, 52, 536, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMCOFOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIPROGRA, MyGlb.PANEL_FORM, 176);
    PAN_PROGRAMCOFOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIPROGRA, MyGlb.PANEL_FORM, 2);
    PAN_PROGRAMCOFOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIPROGRA, MyGlb.PANEL_FORM, "Descrizione Programma");
    PAN_PROGRAMCOFOG.SetFieldPage(PFL_PROGRAMCOFOG_DESCRIPROGRA, -1, -1);
    PAN_PROGRAMCOFOG.SetFieldPanel(PFL_PROGRAMCOFOG_DESCRIPROGRA, PPQRY_BILSTRUTTURA, "A.DESCRIZIONE", "BILSTRUTDESC", 5, 140, 0, -13997);
    PAN_PROGRAMCOFOG.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_COFOG, MyGlb.PANEL_LIST, 396, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMCOFOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_COFOG, MyGlb.PANEL_LIST, 48);
    PAN_PROGRAMCOFOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_COFOG, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMCOFOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_COFOG, MyGlb.PANEL_LIST, "COFOG");
    PAN_PROGRAMCOFOG.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_COFOG, MyGlb.PANEL_FORM, 4, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMCOFOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_COFOG, MyGlb.PANEL_FORM, 96);
    PAN_PROGRAMCOFOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_COFOG, MyGlb.PANEL_FORM, 1);
    PAN_PROGRAMCOFOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_COFOG, MyGlb.PANEL_FORM, "COFOG");
    PAN_PROGRAMCOFOG.SetFieldPage(PFL_PROGRAMCOFOG_COFOG, -1, -1);
    PAN_PROGRAMCOFOG.SetFieldPanel(PFL_PROGRAMCOFOG_COFOG, PPQRY_PROGRAMCOFOG, "A.COFOG", "COFOG", 1, 4, 0, -13997);
    PAN_PROGRAMCOFOG.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIZCOFOG, MyGlb.PANEL_LIST, 444, 36, 320, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROGRAMCOFOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIZCOFOG, MyGlb.PANEL_LIST, 268);
    PAN_PROGRAMCOFOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIZCOFOG, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMCOFOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIZCOFOG, MyGlb.PANEL_LIST, "Descrizione COFOG");
    PAN_PROGRAMCOFOG.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIZCOFOG, MyGlb.PANEL_FORM, 4, 88, 704, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMCOFOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIZCOFOG, MyGlb.PANEL_FORM, 268);
    PAN_PROGRAMCOFOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIZCOFOG, MyGlb.PANEL_FORM, 2);
    PAN_PROGRAMCOFOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMCOFOG_DESCRIZCOFOG, MyGlb.PANEL_FORM, "Descrizione COFOG");
    PAN_PROGRAMCOFOG.SetFieldPage(PFL_PROGRAMCOFOG_DESCRIZCOFOG, -1, -1);
    PAN_PROGRAMCOFOG.SetFieldPanel(PFL_PROGRAMCOFOG_DESCRIZCOFOG, PPQRY_STRUTTRICLAS, "A.DESCRIZIONE", "STRURICLDESC", 5, 300, 0, -13997);
  }

  private void PAN_PROGRAMCOFOG_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROGRAMCOFOG.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as BILSTRUTDESC ");
    SQL.append("from ");
    SQL.append("  BIL_STRUTTURA A ");
    SQL.append("where (A.E_S = 'S') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.CODICE_GERARCHIA = ~~PROGRAMMA~~) ");
    PAN_PROGRAMCOFOG.SetQuery(PPQRY_BILSTRUTTURA, 0, SQL, -1, "");
    PAN_PROGRAMCOFOG.SetQueryDB(PPQRY_BILSTRUTTURA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROGRAMCOFOG.SetMasterTable(PPQRY_BILSTRUTTURA, "BIL_STRUTTURA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as STRURICLDESC ");
    SQL.append("from ");
    SQL.append("  STRUTTURA_RICLASSIFICAZIONE A ");
    SQL.append("where (A.E_S = 'S') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.TIPO_RICL_ID = 2) ");
    SQL.append("and   (A.CODICE = ~~COFOG~~) ");
    PAN_PROGRAMCOFOG.SetQuery(PPQRY_STRUTTRICLAS, 0, SQL, -1, "");
    PAN_PROGRAMCOFOG.SetQueryDB(PPQRY_STRUTTRICLAS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROGRAMCOFOG.SetMasterTable(PPQRY_STRUTTRICLAS, "STRUTTURA_RICLASSIFICAZIONE");
    PAN_PROGRAMCOFOG.SetIMDB(IMDB, "PQRY_PROGRAMCOFOG", true);
    PAN_PROGRAMCOFOG.set_SetString(MyGlb.MASTER_ROWNAME, "PROGRAMMI COFOG");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRAMMA as PROGRAMMA, ");
    SQL.append("  A.COFOG as COFOG ");
    PAN_PROGRAMCOFOG.SetQuery(PPQRY_PROGRAMCOFOG, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PROGRAMMI_COFOG A ");
    PAN_PROGRAMCOFOG.SetQuery(PPQRY_PROGRAMCOFOG, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROGRAMCOFOG.SetQuery(PPQRY_PROGRAMCOFOG, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROGRAMCOFOG.SetQuery(PPQRY_PROGRAMCOFOG, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROGRAMCOFOG.SetQuery(PPQRY_PROGRAMCOFOG, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGRAMMA, ");
    SQL.append("  A.COFOG ");
    PAN_PROGRAMCOFOG.SetQuery(PPQRY_PROGRAMCOFOG, 5, SQL, -1, "");
    PAN_PROGRAMCOFOG.SetQueryDB(PPQRY_PROGRAMCOFOG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROGRAMCOFOG.SetMasterTable(0, "PROGRAMMI_COFOG");
    PAN_PROGRAMCOFOG.AddToSortList(PFL_PROGRAMCOFOG_PROGRAMMA, true);
    PAN_PROGRAMCOFOG.AddToSortList(PFL_PROGRAMCOFOG_COFOG, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PROGRAMCOFOG.Status() == 2)
    {
      int oldListQBE = PAN_PROGRAMCOFOG.iUseListQBE;
      PAN_PROGRAMCOFOG.iUseListQBE = 0;
      PAN_PROGRAMCOFOG.PanelCommand(Glb.PCM_SEARCH);
      PAN_PROGRAMCOFOG.PanelCommand(Glb.PCM_FIND);
      PAN_PROGRAMCOFOG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PROGRAMCOFOG) PAN_PROGRAMCOFOG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROGRAMCOFOG) PAN_PROGRAMCOFOG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PROGRAMCOFOG) PAN_PROGRAMCOFOG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROGRAMCOFOG) PAN_PROGRAMCOFOG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PROGRAMCOFOG) PAN_PROGRAMCOFOG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
