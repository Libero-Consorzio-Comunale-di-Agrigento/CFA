// **********************************************
// Mandati Emessi Esercizi Precedenti Fin
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MandatiEmessiEserciziPrecedentiFin extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_MANEMEESPRFI_NUMEROMAND = 0;
  private static int PFL_MANEMEESPRFI_ANNOMAND = 1;
  private static int PFL_MANEMEESPRFI_DATA = 2;
  private static int PFL_MANEMEESPRFI_IMPORTO = 3;
  private static int PFL_MANEMEESPRFI_PAGATO = 4;
  private static int PFL_MANEMEESPRFI_CAPITOLO = 5;
  private static int PFL_MANEMEESPRFI_ARTICOLO = 6;
  private static int PFL_MANEMEESPRFI_NUMEROIMP = 7;
  private static int PFL_MANEMEESPRFI_ANNOIMP = 8;
  private static int PFL_MANEMEESPRFI_LABELMANDATO = 9;
  private static int PFL_MANEMEESPRFI_LABELCAPITOL = 10;
  private static int PFL_MANEMEESPRFI_LABELIMPEGNO = 11;
  private static int PFL_MANEMEESPRFI_MANDATO = 12;
  private static int PFL_MANEMEESPRFI_RIFBILANCPEG = 13;
  private static int PFL_MANEMEESPRFI_IMPEGNO = 14;

  private static int PPQRY_LIQ50 = 0;


  IDPanel PAN_MANEMEESPRFI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI51(IMDB);
    //
    //
    Init_PQRY_LIQ50(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI51(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI51, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI51, "TBL_PARAMETRI51");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI51,IMDBDef1.FLD_PARAMETRI51_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI51,IMDBDef1.FLD_PARAMETRI51_PARAMFINANZI,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI51, 0);
  }

  private static void Init_PQRY_LIQ50(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_LIQ50, 12);
    IMDB.set_TblCode(IMDBDef8.PQRY_LIQ50, "PQRY_LIQ50");
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_LIQMANDATO, "LIQMANDATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_LIQMANDATO,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_D_DATA_MAND, "D_DATA_MAND");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_D_DATA_MAND,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_LIQIMPORTO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_PAGATO, "PAGATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_PAGATO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_LIQRIFBILPEG, "LIQRIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_LIQRIFBILPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_LIQIMPEGNO, "LIQIMPEGNO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_LIQIMPEGNO,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQ50,IMDBDef8.PQSL_LIQ50_ANNO_IMP,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_LIQ50, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MandatiEmessiEserciziPrecedentiFin(MyWebEntryPoint w, IMDBObj imdb)
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
  public MandatiEmessiEserciziPrecedentiFin()
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
    FormIdx = MyGlb.FRM_MANEMEESPRFI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3DEF4FAC-E640-478D-9FBE-819F642E8977";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 620;
    DesignHeight = 390;
    set_Caption(new IDVariant("Mandati Emessi Esercizi Precedenti Fin"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 620;
    Frames[1].Height = 364;
    Frames[1].Caption = "Mandati Emessi Esercizi Precedenti Fin";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 364;
    PAN_MANEMEESPRFI = new IDPanel(w, this, 1, "PAN_MANEMEESPRFI");
    Frames[1].Content = PAN_MANEMEESPRFI;
    PAN_MANEMEESPRFI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MANEMEESPRFI.VS = MainFrm.VisualStyleList;
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 620-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "954B9B34-6AB7-40E5-92DD-4B12BD313760");
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 564, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MANEMEESPRFI.InitStatus = 2;
    PAN_MANEMEESPRFI_Init();
    PAN_MANEMEESPRFI_InitFields();
    PAN_MANEMEESPRFI_InitQueries();
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
      PAN_MANEMEESPRFI.UpdatePanel(MainFrm);
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
    return (obj instanceof MandatiEmessiEserciziPrecedentiFin);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MandatiEmessiEserciziPrecedentiFin.class.getName() : (Glb.ClassWithPackage(MandatiEmessiEserciziPrecedentiFin.class) ? MandatiEmessiEserciziPrecedentiFin.class.getName().substring(MandatiEmessiEserciziPrecedentiFin.class.getPackage().getName().length() + 1) : MandatiEmessiEserciziPrecedentiFin.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiEmessiEserciziPrecedentiFin", "LoadEvent", _e);
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
  private void PAN_MANEMEESPRFI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MANEMEESPRFI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MANEMEESPRFI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MANEMEESPRFI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MANEMEESPRFI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_MANEMEESPRFI);
    // Stub
  }

  private void PAN_MANEMEESPRFI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_MANEMEESPRFI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_MANEMEESPRFI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_LIQ50, IMDBDef8.PQSL_LIQ50_D_DATA_MAND, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_LIQ50, IMDBDef8.PQSL_LIQ50_D_DATA_MAND, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_MANEMEESPRFI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_MANEMEESPRFI_Init()
  {

    PAN_MANEMEESPRFI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MANEMEESPRFI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MANEMEESPRFI.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROMAND, "E4FD6A8E-1F10-4D2A-B526-2884E7D75D15");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROMAND, "NUMERO MAND");
    PAN_MANEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROMAND, "");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOMAND, "797AE2BA-1F98-4EC4-A75B-0E0F849BD353");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOMAND, "ANNO MAND");
    PAN_MANEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOMAND, "");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_DATA, "EAEB663F-C9FC-4495-9DF9-1594EC01A80E");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_DATA, "Data");
    PAN_MANEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_DATA, "");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPORTO, "F8D58BE8-F1D7-4F21-8408-7076B1CA84D2");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPORTO, "Importo");
    PAN_MANEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPORTO, "");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_PAGATO, "4E43E9AD-EBD6-4BC1-A2F1-AEA1B8576CA4");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_PAGATO, "Pagato");
    PAN_MANEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_PAGATO, "");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_PAGATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_PAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_CAPITOLO, "694D276C-9299-4455-AA54-050FE0E73BB3");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_CAPITOLO, "CAPITOLO");
    PAN_MANEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_CAPITOLO, "");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ARTICOLO, "2496084F-41F8-47CF-B7B8-9A875D4A1D64");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ARTICOLO, "ARTICOLO");
    PAN_MANEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ARTICOLO, "");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROIMP, "524CF3A9-1152-4B96-85AA-99E498BD30D4");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROIMP, "NUMERO IMP");
    PAN_MANEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROIMP, "");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOIMP, "49CAD4EE-6654-43CA-A445-E67085DB0656");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOIMP, "ANNO IMP");
    PAN_MANEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOIMP, "");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELMANDATO, "26FE0782-D263-4CC2-AAC6-A670F6199D4B");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELMANDATO, "Mandato");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELMANDATO, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELMANDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELCAPITOL, "DD55F406-0B11-426E-9744-DC83E2D51E23");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELCAPITOL, "Capitolo/Art.");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELIMPEGNO, "BFB4F1FF-A9C6-4A96-AF79-D7201448C5A4");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELIMPEGNO, "Impegno");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_MANDATO, "CA5E62C9-0891-42DB-90B6-39AE08AACDEE");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_MANDATO, "Mandato");
    PAN_MANEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_MANDATO, "");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_MANDATO, MyGlb.VIS_NORMFIELPADR);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_MANDATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_RIFBILANCPEG, "22B61EBF-5263-4204-A1D5-42EBCB55562A");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_MANEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_RIFBILANCPEG, "");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANEMEESPRFI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPEGNO, "AD702CBC-3174-4249-8813-C8217D1906D7");
    PAN_MANEMEESPRFI.set_Header(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPEGNO, "Impegno");
    PAN_MANEMEESPRFI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPEGNO, "");
    PAN_MANEMEESPRFI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_MANEMEESPRFI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_MANEMEESPRFI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROMAND, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROMAND, MyGlb.PANEL_LIST, "NUM. MAND");
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROMAND, MyGlb.PANEL_FORM, 4, 388, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROMAND, MyGlb.PANEL_FORM, 84);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROMAND, MyGlb.PANEL_FORM, "NUM. MAND");
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_NUMEROMAND, -1, -1);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_NUMEROMAND, PPQRY_LIQ50, "B.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOMAND, MyGlb.PANEL_LIST, 44, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOMAND, MyGlb.PANEL_LIST, "ANN. MND.");
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOMAND, MyGlb.PANEL_FORM, 4, 412, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_ANNOMAND, -1, -1);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_ANNOMAND, PPQRY_LIQ50, "B.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_DATA, MyGlb.PANEL_LIST, 80, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_DATA, MyGlb.PANEL_LIST, 80);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_DATA, MyGlb.PANEL_FORM, 4, 172, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_DATA, MyGlb.PANEL_FORM, 80);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_DATA, -1, -1);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_DATA, PPQRY_LIQ50, "B.D_DATA_MAND", "D_DATA_MAND", 6, 19, 0, -13997);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPORTO, MyGlb.PANEL_LIST, 156, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPORTO, MyGlb.PANEL_FORM, 4, 268, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_IMPORTO, -1, -1);
    PAN_MANEMEESPRFI.SetFieldUnbound(PFL_MANEMEESPRFI_IMPORTO, true);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_IMPORTO, PPQRY_LIQ50, "NVL(A.IMPORTO, 0)", "LIQIMPORTO", 3, 28, 6, -13997);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_PAGATO, MyGlb.PANEL_LIST, 256, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_PAGATO, MyGlb.PANEL_LIST, 52);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_PAGATO, MyGlb.PANEL_LIST, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_PAGATO, MyGlb.PANEL_LIST, "Pagato");
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_PAGATO, MyGlb.PANEL_FORM, 4, 196, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_PAGATO, MyGlb.PANEL_FORM, 52);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_PAGATO, MyGlb.PANEL_FORM, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_PAGATO, MyGlb.PANEL_FORM, "Pagato");
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_PAGATO, -1, -1);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_PAGATO, PPQRY_LIQ50, "B.PAGATO", "PAGATO", 3, 14, 2, -13997);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_CAPITOLO, MyGlb.PANEL_LIST, 356, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_CAPITOLO, MyGlb.PANEL_FORM, 4, 460, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_CAPITOLO, -1, -1);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_CAPITOLO, PPQRY_LIQ50, "B.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ARTICOLO, MyGlb.PANEL_LIST, 460, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ARTICOLO, MyGlb.PANEL_FORM, 4, 484, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_ARTICOLO, -1, -1);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_ARTICOLO, PPQRY_LIQ50, "B.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROIMP, MyGlb.PANEL_LIST, 484, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROIMP, MyGlb.PANEL_FORM, 4, 508, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_NUMEROIMP, -1, -1);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_NUMEROIMP, PPQRY_LIQ50, "B.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOIMP, MyGlb.PANEL_LIST, 528, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOIMP, MyGlb.PANEL_FORM, 4, 532, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_ANNOIMP, -1, -1);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_ANNOIMP, PPQRY_LIQ50, "B.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELMANDATO, MyGlb.PANEL_LIST, 0, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELMANDATO, MyGlb.PANEL_LIST, 0);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELMANDATO, MyGlb.PANEL_LIST, 2);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELMANDATO, MyGlb.PANEL_FORM, 0, 0, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELMANDATO, MyGlb.PANEL_FORM, 0);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELMANDATO, MyGlb.PANEL_FORM, 2);
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_LABELMANDATO, -1, -1);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_LABELMANDATO, -1, "", "LABELMANDATO", 0, 0, 0, -13997);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELCAPITOL, MyGlb.PANEL_LIST, 356, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELCAPITOL, MyGlb.PANEL_FORM, 8, 8, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_LABELCAPITOL, -1, -1);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELIMPEGNO, MyGlb.PANEL_LIST, 484, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELIMPEGNO, MyGlb.PANEL_FORM, 16, 16, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_LABELIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_LABELIMPEGNO, -1, -1);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_LABELIMPEGNO, -1, "", "LABELIMPEGNO", 0, 0, 0, -13997);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_MANDATO, MyGlb.PANEL_LIST, 8, 44, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_MANDATO, MyGlb.PANEL_LIST, 52);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_MANDATO, MyGlb.PANEL_LIST, 2);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_MANDATO, MyGlb.PANEL_LIST, "Mandato");
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_MANDATO, MyGlb.PANEL_FORM, 12, 564, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_MANDATO, MyGlb.PANEL_FORM, 52);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_MANDATO, MyGlb.PANEL_FORM, 2);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_MANDATO, MyGlb.PANEL_FORM, "Mand.");
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_MANDATO, -1, -1);
    PAN_MANEMEESPRFI.SetFieldUnbound(PFL_MANEMEESPRFI_MANDATO, true);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_MANDATO, PPQRY_LIQ50, "TO_CHAR ( B.NUMERO_MAND ) || ' / ' || TO_CHAR ( B.ANNO_MAND )", "LIQMANDATO", 5, 201, 0, -13997);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 556, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_RIFBILANCPEG, -1, -1);
    PAN_MANEMEESPRFI.SetFieldUnbound(PFL_MANEMEESPRFI_RIFBILANCPEG, true);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_RIFBILANCPEG, PPQRY_LIQ50, "TO_CHAR ( B.CAPITOLO ) || ' / ' || TO_CHAR ( B.ARTICOLO )", "LIQRIFBILPEG", 5, 201, 0, -13997);
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPEGNO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPEGNO, MyGlb.PANEL_LIST, 52);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_MANEMEESPRFI.SetRect(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPEGNO, MyGlb.PANEL_FORM, 4, 556, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANEMEESPRFI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPEGNO, MyGlb.PANEL_FORM, 52);
    PAN_MANEMEESPRFI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_MANEMEESPRFI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANEMEESPRFI_IMPEGNO, MyGlb.PANEL_FORM, "Imp.");
    PAN_MANEMEESPRFI.SetFieldPage(PFL_MANEMEESPRFI_IMPEGNO, -1, -1);
    PAN_MANEMEESPRFI.SetFieldUnbound(PFL_MANEMEESPRFI_IMPEGNO, true);
    PAN_MANEMEESPRFI.SetFieldPanel(PFL_MANEMEESPRFI_IMPEGNO, PPQRY_LIQ50, "TO_CHAR ( B.NUMERO_IMP ) || ' / ' || TO_CHAR ( B.ANNO_IMP )", "LIQIMPEGNO", 5, 201, 0, -13997);
  }

  private void PAN_MANEMEESPRFI_InitQueries()
  {
    StringBuffer SQL;

    PAN_MANEMEESPRFI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_MANEMEESPRFI.SetIMDB(IMDB, "PQRY_LIQ50", true);
    PAN_MANEMEESPRFI.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.NUMERO_MAND ) || ' / ' || TO_CHAR ( B.ANNO_MAND ) as LIQMANDATO, ");
    SQL.append("  B.D_DATA_MAND as D_DATA_MAND, ");
    SQL.append("  NVL(A.IMPORTO, 0) as LIQIMPORTO, ");
    SQL.append("  B.PAGATO as PAGATO, ");
    SQL.append("  TO_CHAR ( B.CAPITOLO ) || ' / ' || TO_CHAR ( B.ARTICOLO ) as LIQRIFBILPEG, ");
    SQL.append("  TO_CHAR ( B.NUMERO_IMP ) || ' / ' || TO_CHAR ( B.ANNO_IMP ) as LIQIMPEGNO, ");
    SQL.append("  B.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  B.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  B.CAPITOLO as CAPITOLO, ");
    SQL.append("  B.ARTICOLO as ARTICOLO, ");
    SQL.append("  B.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  B.ANNO_IMP as ANNO_IMP ");
    PAN_MANEMEESPRFI.SetQuery(PPQRY_LIQ50, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  MAN B ");
    PAN_MANEMEESPRFI.SetQuery(PPQRY_LIQ50, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_MAND = A.ANNO_MAND) ");
    SQL.append("and   (B.NUMERO_MAND = A.NUMERO_MAND) ");
    SQL.append("and   (A.ANNO_MAND < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~TBL_PARAMETRI51.PARAMFINANZI~~) ");
    PAN_MANEMEESPRFI.SetQuery(PPQRY_LIQ50, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MANEMEESPRFI.SetQuery(PPQRY_LIQ50, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MANEMEESPRFI.SetQuery(PPQRY_LIQ50, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.ANNO_MAND, ");
    SQL.append("  B.NUMERO_MAND ");
    PAN_MANEMEESPRFI.SetQuery(PPQRY_LIQ50, 5, SQL, -1, "");
    PAN_MANEMEESPRFI.SetQueryDB(PPQRY_LIQ50, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANEMEESPRFI.SetMasterTable(0, "LIQ");
    PAN_MANEMEESPRFI.AddToSortList(PFL_MANEMEESPRFI_ANNOMAND, true);
    PAN_MANEMEESPRFI.AddToSortList(PFL_MANEMEESPRFI_NUMEROMAND, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MANEMEESPRFI.Status() == 2)
    {
      int oldListQBE = PAN_MANEMEESPRFI.iUseListQBE;
      PAN_MANEMEESPRFI.iUseListQBE = 0;
      PAN_MANEMEESPRFI.PanelCommand(Glb.PCM_SEARCH);
      PAN_MANEMEESPRFI.PanelCommand(Glb.PCM_FIND);
      PAN_MANEMEESPRFI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_MANEMEESPRFI) PAN_MANEMEESPRFI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MANEMEESPRFI) PAN_MANEMEESPRFI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MANEMEESPRFI) PAN_MANEMEESPRFI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_MANEMEESPRFI) PAN_MANEMEESPRFI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MANEMEESPRFI) PAN_MANEMEESPRFI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
