// **********************************************
// Totale Entrata
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TotaleEntrata extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ENTRATA_IMPORTO = 0;
  private static int PFL_ENTRATA_RETTIFICHE = 1;
  private static int PFL_ENTRATA_PAGATO = 2;
  private static int PFL_ENTRATA_SALDO = 3;

  private static int PPQRY_ENTRATA1 = 0;


  IDPanel PAN_ENTRATA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_ENTRATA1(IMDB);
    Init_PQRY_ENTRATA1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_ENTRATA1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_ENTRATA1, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_ENTRATA1, "PQRY_ENTRATA1");
    IMDB.set_FldCode(IMDBDef9.PQRY_ENTRATA1,IMDBDef9.PQSL_ENTRATA1_ROWNAMERETTI, "ROWNAMERETTI");
    IMDB.SetFldParams(IMDBDef9.PQRY_ENTRATA1,IMDBDef9.PQSL_ENTRATA1_ROWNAMERETTI,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_ENTRATA1,IMDBDef9.PQSL_ENTRATA1_ROWNAMEPAGAT, "ROWNAMEPAGAT");
    IMDB.SetFldParams(IMDBDef9.PQRY_ENTRATA1,IMDBDef9.PQSL_ENTRATA1_ROWNAMEPAGAT,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_ENTRATA1,IMDBDef9.PQSL_ENTRATA1_ROWNAMESALDO, "ROWNAMESALDO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ENTRATA1,IMDBDef9.PQSL_ENTRATA1_ROWNAMESALDO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_ENTRATA1,IMDBDef9.PQSL_ENTRATA1_ROWNAMEIMPOR, "ROWNAMEIMPOR");
    IMDB.SetFldParams(IMDBDef9.PQRY_ENTRATA1,IMDBDef9.PQSL_ENTRATA1_ROWNAMEIMPOR,3,14,2);
    IMDB.TblAddNew(IMDBDef9.PQRY_ENTRATA1, 0);
  }

  private static void Init_PQRY_ENTRATA1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_ENTRATA1_RS, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_ENTRATA1_RS, "PQRY_ENTRATA1_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_ENTRATA1_RS,IMDBDef9.PQSL_ENTRATA1_ROWNAMERETTI, "ROWNAMERETTI");
    IMDB.SetFldParams(IMDBDef9.PQRY_ENTRATA1_RS,IMDBDef9.PQSL_ENTRATA1_ROWNAMERETTI,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_ENTRATA1_RS,IMDBDef9.PQSL_ENTRATA1_ROWNAMEPAGAT, "ROWNAMEPAGAT");
    IMDB.SetFldParams(IMDBDef9.PQRY_ENTRATA1_RS,IMDBDef9.PQSL_ENTRATA1_ROWNAMEPAGAT,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_ENTRATA1_RS,IMDBDef9.PQSL_ENTRATA1_ROWNAMESALDO, "ROWNAMESALDO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ENTRATA1_RS,IMDBDef9.PQSL_ENTRATA1_ROWNAMESALDO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_ENTRATA1_RS,IMDBDef9.PQSL_ENTRATA1_ROWNAMEIMPOR, "ROWNAMEIMPOR");
    IMDB.SetFldParams(IMDBDef9.PQRY_ENTRATA1_RS,IMDBDef9.PQSL_ENTRATA1_ROWNAMEIMPOR,3,14,2);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TotaleEntrata(MyWebEntryPoint w, IMDBObj imdb)
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
  public TotaleEntrata()
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
    FormIdx = MyGlb.FRM_TOTALEENTRAT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "38F4EFED-ADA2-4D2E-AC61-579373A8D48F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 260;
    DesignHeight = 198;
    set_Caption(new IDVariant("Totale Entrata"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 260;
    Frames[1].Height = 172;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Entrata";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 172;
    PAN_ENTRATA = new IDPanel(w, this, 1, "PAN_ENTRATA");
    Frames[1].Content = PAN_ENTRATA;
    PAN_ENTRATA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ENTRATA.VS = MainFrm.VisualStyleList;
    PAN_ENTRATA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 260-MyGlb.PAN_OFFS_X, 172-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "09A20476-2AD0-4832-A62B-692E71EE5D4A");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 312, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ENTRATA.InitStatus = 2;
    PAN_ENTRATA_Init();
    PAN_ENTRATA_InitFields();
    PAN_ENTRATA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_ENTRATA, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        TOTALEENTRAT_ENTRATA1();
      }
      PAN_ENTRATA.UpdatePanel(MainFrm);
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
    return (obj instanceof TotaleEntrata);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TotaleEntrata.class.getName() : (Glb.ClassWithPackage(TotaleEntrata.class) ? TotaleEntrata.class.getName().substring(TotaleEntrata.class.getPackage().getName().length() + 1) : TotaleEntrata.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Entrata
  // Primary record source for panel data
  // **********************************************************************
  private void TOTALEENTRAT_ENTRATA1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_ENTRATA1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_ENTRATA, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_ENTRATA, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_ENTRATA1_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_ENTRATA1_RS, 0, IMDBDef2.TBL_ENTRATA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ENTRATA1_RS, 0, 0, IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMERETTI, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ENTRATA1_RS, 1, 0, IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMEPAGAT, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ENTRATA1_RS, 2, 0, IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMESALDO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ENTRATA1_RS, 3, 0, IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMEIMPOR, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_ENTRATA, 0);
      if (IMDB.Eof(IMDBDef2.TBL_ENTRATA, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_ENTRATA, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_ENTRATA1_RS, 0);
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
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ENTRATA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ENTRATA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ENTRATA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ENTRATA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ENTRATA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ENTRATA);
    // Stub
  }

  private void PAN_ENTRATA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ENTRATA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ENTRATA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ENTRATA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ENTRATA_Init()
  {

    PAN_ENTRATA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ENTRATA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ENTRATA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTO, "6DB157C8-7847-43E6-962D-CC3537BB5FF6");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTO, "Importo");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_RETTIFICHE, "77DBE249-1D9B-4AFC-94DF-7E5442F03EA4");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_RETTIFICHE, "Rettifiche");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_RETTIFICHE, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_RETTIFICHE, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_RETTIFICHE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_PAGATO, "7863D92D-F4B0-49FD-9091-08416F95B212");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_PAGATO, "Pagato");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_PAGATO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_PAGATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_PAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, "ABA9BB7E-7108-4362-9890-8F293FA07318");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, "Saldo");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ENTRATA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTO, MyGlb.PANEL_FORM, 28, 12, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTO, MyGlb.PANEL_FORM, 60);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_IMPORTO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_IMPORTO, PPQRY_ENTRATA1, "A.ROWNAMEIMPOR", "ROWNAMEIMPOR", 3, 14, 2, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_RETTIFICHE, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_RETTIFICHE, MyGlb.PANEL_LIST, 56);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_RETTIFICHE, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_RETTIFICHE, MyGlb.PANEL_LIST, "Rettifiche");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_RETTIFICHE, MyGlb.PANEL_FORM, 4, 36, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_RETTIFICHE, MyGlb.PANEL_FORM, 84);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_RETTIFICHE, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_RETTIFICHE, MyGlb.PANEL_FORM, "Rettifiche");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_RETTIFICHE, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_RETTIFICHE, PPQRY_ENTRATA1, "A.ROWNAMERETTI", "ROWNAMERETTI", 3, 14, 2, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_PAGATO, MyGlb.PANEL_LIST, 88, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_PAGATO, MyGlb.PANEL_LIST, 44);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_PAGATO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_PAGATO, MyGlb.PANEL_LIST, "Pagato");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_PAGATO, MyGlb.PANEL_FORM, 4, 60, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_PAGATO, MyGlb.PANEL_FORM, 84);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_PAGATO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_PAGATO, MyGlb.PANEL_FORM, "Pagato");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_PAGATO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_PAGATO, PPQRY_ENTRATA1, "A.ROWNAMEPAGAT", "ROWNAMEPAGAT", 3, 14, 2, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.PANEL_LIST, 160, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.PANEL_LIST, 36);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.PANEL_LIST, "Saldo");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.PANEL_FORM, 4, 84, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.PANEL_FORM, 84);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.PANEL_FORM, "Saldo");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_SALDO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_SALDO, PPQRY_ENTRATA1, "A.ROWNAMESALDO", "ROWNAMESALDO", 3, 14, 2, -13997);
  }

  private void PAN_ENTRATA_InitQueries()
  {
    StringBuffer SQL;

    PAN_ENTRATA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ENTRATA.SetIMDB(IMDB, "PQRY_ENTRATA1", true);
    PAN_ENTRATA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ENTRATA.SetQueryIMDB(PPQRY_ENTRATA1, IMDBDef9.PQRY_ENTRATA1_RS, IMDBDef2.TBL_ENTRATA);
    JustLoaded = true;
    PAN_ENTRATA.SetFieldPrimaryIndex(PFL_ENTRATA_IMPORTO, IMDBDef2.FLD_ENTRATA_ROWNAMEIMPOR);
    PAN_ENTRATA.SetFieldPrimaryIndex(PFL_ENTRATA_RETTIFICHE, IMDBDef2.FLD_ENTRATA_ROWNAMERETTI);
    PAN_ENTRATA.SetFieldPrimaryIndex(PFL_ENTRATA_PAGATO, IMDBDef2.FLD_ENTRATA_ROWNAMEPAGAT);
    PAN_ENTRATA.SetFieldPrimaryIndex(PFL_ENTRATA_SALDO, IMDBDef2.FLD_ENTRATA_ROWNAMESALDO);
    PAN_ENTRATA.SetMasterTable(0, "ENTRATA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ENTRATA.Status() == 2)
    {
      int oldListQBE = PAN_ENTRATA.iUseListQBE;
      PAN_ENTRATA.iUseListQBE = 0;
      PAN_ENTRATA.PanelCommand(Glb.PCM_SEARCH);
      PAN_ENTRATA.PanelCommand(Glb.PCM_FIND);
      PAN_ENTRATA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
