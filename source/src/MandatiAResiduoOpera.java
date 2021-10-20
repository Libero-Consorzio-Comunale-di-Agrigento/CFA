// **********************************************
// Mandati A Residuo Opera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MandatiAResiduoOpera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_MANDARESIOPE_CAPITOLO = 0;
  private static int PFL_MANDARESIOPE_ARTICOLO = 1;
  private static int PFL_MANDARESIOPE_NUMEROMAND = 2;
  private static int PFL_MANDARESIOPE_DDATAMAND = 3;
  private static int PFL_MANDARESIOPE_NUMEROIMP = 4;
  private static int PFL_MANDARESIOPE_ANNOIMP = 5;
  private static int PFL_MANDARESIOPE_IMPORTO = 6;
  private static int PFL_MANDARESIOPE_LABELCAPITOL = 7;
  private static int PFL_MANDARESIOPE_LABELMANDATO = 8;
  private static int PFL_MANDARESIOPE_LABELIMPEGNO = 9;
  private static int PFL_MANDARESIOPE_RIFBILANCPEG = 10;
  private static int PFL_MANDARESIOPE_MANDATO = 11;
  private static int PFL_MANDARESIOPE_IMPEGNO = 12;

  private static int PPQRY_MAN2 = 0;


  IDPanel PAN_MANDARESIOPE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI37(IMDB);
    //
    //
    Init_PQRY_MAN2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI37(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI37, 1);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI37, "TBL_PARAMETRI37");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI37,IMDBDef1.FLD_PARAMETRI37_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI37,IMDBDef1.FLD_PARAMETRI37_PARAMOPERA,1,5,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI37, 0);
  }

  private static void Init_PQRY_MAN2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_MAN2, 11);
    IMDB.set_TblCode(IMDBDef8.PQRY_MAN2, "PQRY_MAN2");
    IMDB.set_FldCode(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_MANRIFBILPEG, "MANRIFBILPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_MANRIFBILPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_MANMANDATO, "MANMANDATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_MANMANDATO,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_MANIMPEGNO, "MANIMPEGNO");
    IMDB.SetFldParams(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_MANIMPEGNO,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_MANIMPORTO, "MANIMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_MANIMPORTO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_D_DATA_MAND, "D_DATA_MAND");
    IMDB.SetFldParams(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_D_DATA_MAND,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef8.PQRY_MAN2,IMDBDef8.PQSL_MAN2_ANNO_MAND,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_MAN2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MandatiAResiduoOpera(MyWebEntryPoint w, IMDBObj imdb)
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
  public MandatiAResiduoOpera()
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
    FormIdx = MyGlb.FRM_MANDARESIOPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CEBC48D3-0F5E-4FB3-9767-8DE7C762E397";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 472;
    DesignHeight = 398;
    set_Caption(new IDVariant("Mandati A Residuo Opera"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 472;
    Frames[1].Height = 372;
    Frames[1].Caption = "Mandati A Residuo Opera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 372;
    PAN_MANDARESIOPE = new IDPanel(w, this, 1, "PAN_MANDARESIOPE");
    Frames[1].Content = PAN_MANDARESIOPE;
    PAN_MANDARESIOPE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MANDARESIOPE.VS = MainFrm.VisualStyleList;
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 472-MyGlb.PAN_OFFS_X, 372-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MANDARESIOPE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8070FD05-D53D-4157-AE95-3CA3DF33C485");
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 424, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MANDARESIOPE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MANDARESIOPE.InitStatus = 2;
    PAN_MANDARESIOPE_Init();
    PAN_MANDARESIOPE_InitFields();
    PAN_MANDARESIOPE_InitQueries();
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
      PAN_MANDARESIOPE.UpdatePanel(MainFrm);
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
    return (obj instanceof MandatiAResiduoOpera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MandatiAResiduoOpera.class.getName() : (Glb.ClassWithPackage(MandatiAResiduoOpera.class) ? MandatiAResiduoOpera.class.getName().substring(MandatiAResiduoOpera.class.getPackage().getName().length() + 1) : MandatiAResiduoOpera.class.getName()));
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
      MainFrm.ErrObj.ProcError ("MandatiAResiduoOpera", "LoadEvent", _e);
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
  private void PAN_MANDARESIOPE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MANDARESIOPE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MANDARESIOPE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MANDARESIOPE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MANDARESIOPE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_MANDARESIOPE);
    // Stub
  }

  private void PAN_MANDARESIOPE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_MANDARESIOPE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_MANDARESIOPE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_MAN2, IMDBDef8.PQSL_MAN2_D_DATA_MAND, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_MAN2, IMDBDef8.PQSL_MAN2_D_DATA_MAND, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_MANDARESIOPE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_MANDARESIOPE_Init()
  {

    PAN_MANDARESIOPE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MANDARESIOPE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MANDARESIOPE.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_MANDARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_CAPITOLO, "EFB20C3D-298E-4425-9236-084859AEABF6");
    PAN_MANDARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_CAPITOLO, "CAPITOLO");
    PAN_MANDARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_CAPITOLO, "");
    PAN_MANDARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_MANDARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANDARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ARTICOLO, "EF08B8EF-00F6-41A1-80E3-EB3D2902AA54");
    PAN_MANDARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ARTICOLO, "ARTICOLO");
    PAN_MANDARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ARTICOLO, "");
    PAN_MANDARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANDARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROMAND, "9D65E492-CD35-4B7E-8D7E-4A8AFC8709D8");
    PAN_MANDARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROMAND, "NUMERO MAND");
    PAN_MANDARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROMAND, "");
    PAN_MANDARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_MANDARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_DDATAMAND, "4D8DF4CF-0654-4692-AC68-4924B1528239");
    PAN_MANDARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_DDATAMAND, "D DATA MAND");
    PAN_MANDARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_DDATAMAND, "");
    PAN_MANDARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_DDATAMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_DDATAMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROIMP, "F7910A70-6304-4B51-A48B-1663E0B7346D");
    PAN_MANDARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROIMP, "NUMERO IMP");
    PAN_MANDARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROIMP, "");
    PAN_MANDARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANDARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ANNOIMP, "E7171A8E-28F4-4742-8DDE-3926C5A7ABC5");
    PAN_MANDARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ANNOIMP, "ANNO IMP");
    PAN_MANDARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ANNOIMP, "");
    PAN_MANDARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANDARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPORTO, "C93C7ACC-3B43-446C-8CDA-96DF211A4A34");
    PAN_MANDARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPORTO, "Importo");
    PAN_MANDARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPORTO, "");
    PAN_MANDARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_MANDARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_MANDARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELCAPITOL, "AF930083-D360-4FE5-AEEF-71F0CD695EF0");
    PAN_MANDARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELCAPITOL, "Capitolo/Art.");
    PAN_MANDARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANDARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MANDARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELMANDATO, "B8335C1B-23B9-4200-8134-5BFC16107ADD");
    PAN_MANDARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELMANDATO, "Mandato");
    PAN_MANDARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELMANDATO, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANDARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELMANDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MANDARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELIMPEGNO, "D4E7D7C9-552F-4D88-AA05-ACD8D9D03B7A");
    PAN_MANDARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELIMPEGNO, "Impegno");
    PAN_MANDARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANDARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MANDARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_RIFBILANCPEG, "9DD2807B-A8EE-4F04-A2E6-F65C2A59C09F");
    PAN_MANDARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_MANDARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_RIFBILANCPEG, "To String (MAN CAPITOLO) + \" / \" + To String (MAN ARTICOLO)");
    PAN_MANDARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_MANDARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_MANDATO, "4DAED634-0D45-4B3C-8454-4BF1C7FA4E12");
    PAN_MANDARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_MANDATO, "Mandato");
    PAN_MANDARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_MANDATO, "");
    PAN_MANDARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_MANDATO, MyGlb.VIS_NORMFIELPADR);
    PAN_MANDARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_MANDATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDARESIOPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPEGNO, "9EABB436-795C-42A7-8CEF-3FCBA220D72C");
    PAN_MANDARESIOPE.set_Header(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPEGNO, "Impegno");
    PAN_MANDARESIOPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPEGNO, "");
    PAN_MANDARESIOPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_MANDARESIOPE.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_MANDARESIOPE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_CAPITOLO, MyGlb.PANEL_FORM, 4, 292, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_MANDARESIOPE.SetFieldPage(PFL_MANDARESIOPE_CAPITOLO, -1, -1);
    PAN_MANDARESIOPE.SetFieldPanel(PFL_MANDARESIOPE_CAPITOLO, PPQRY_MAN2, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ARTICOLO, MyGlb.PANEL_LIST, 100, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ARTICOLO, MyGlb.PANEL_FORM, 4, 316, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_MANDARESIOPE.SetFieldPage(PFL_MANDARESIOPE_ARTICOLO, -1, -1);
    PAN_MANDARESIOPE.SetFieldPanel(PFL_MANDARESIOPE_ARTICOLO, PPQRY_MAN2, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROMAND, MyGlb.PANEL_LIST, 124, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROMAND, MyGlb.PANEL_LIST, "NUM. MAND");
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROMAND, MyGlb.PANEL_FORM, 4, 340, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROMAND, MyGlb.PANEL_FORM, 84);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROMAND, MyGlb.PANEL_FORM, "NUM. MAND");
    PAN_MANDARESIOPE.SetFieldPage(PFL_MANDARESIOPE_NUMEROMAND, -1, -1);
    PAN_MANDARESIOPE.SetFieldPanel(PFL_MANDARESIOPE_NUMEROMAND, PPQRY_MAN2, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_DDATAMAND, MyGlb.PANEL_LIST, 168, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_DDATAMAND, MyGlb.PANEL_LIST, 80);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_DDATAMAND, MyGlb.PANEL_LIST, 1);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_DDATAMAND, MyGlb.PANEL_LIST, "D DATA MAND");
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_DDATAMAND, MyGlb.PANEL_FORM, 4, 364, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_DDATAMAND, MyGlb.PANEL_FORM, 80);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_DDATAMAND, MyGlb.PANEL_FORM, 1);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_DDATAMAND, MyGlb.PANEL_FORM, "D DT. MAND");
    PAN_MANDARESIOPE.SetFieldPage(PFL_MANDARESIOPE_DDATAMAND, -1, -1);
    PAN_MANDARESIOPE.SetFieldPanel(PFL_MANDARESIOPE_DDATAMAND, PPQRY_MAN2, "A.D_DATA_MAND", "D_DATA_MAND", 6, 19, 0, -13997);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROIMP, MyGlb.PANEL_LIST, 240, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROIMP, MyGlb.PANEL_FORM, 4, 388, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_MANDARESIOPE.SetFieldPage(PFL_MANDARESIOPE_NUMEROIMP, -1, -1);
    PAN_MANDARESIOPE.SetFieldPanel(PFL_MANDARESIOPE_NUMEROIMP, PPQRY_MAN2, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ANNOIMP, MyGlb.PANEL_LIST, 288, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ANNOIMP, MyGlb.PANEL_FORM, 4, 412, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_MANDARESIOPE.SetFieldPage(PFL_MANDARESIOPE_ANNOIMP, -1, -1);
    PAN_MANDARESIOPE.SetFieldPanel(PFL_MANDARESIOPE_ANNOIMP, PPQRY_MAN2, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPORTO, MyGlb.PANEL_LIST, 324, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPORTO, MyGlb.PANEL_FORM, 4, 124, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_MANDARESIOPE.SetFieldPage(PFL_MANDARESIOPE_IMPORTO, -1, -1);
    PAN_MANDARESIOPE.SetFieldUnbound(PFL_MANDARESIOPE_IMPORTO, true);
    PAN_MANDARESIOPE.SetFieldPanel(PFL_MANDARESIOPE_IMPORTO, PPQRY_MAN2, "SUM(C.IMPORTO)", "MANIMPORTO", 3, 28, 6, -13997);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 124, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELCAPITOL, MyGlb.PANEL_FORM, 1);
    PAN_MANDARESIOPE.SetFieldPage(PFL_MANDARESIOPE_LABELCAPITOL, -1, -1);
    PAN_MANDARESIOPE.SetFieldPanel(PFL_MANDARESIOPE_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELMANDATO, MyGlb.PANEL_LIST, 124, 0, 116, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELMANDATO, MyGlb.PANEL_LIST, 0);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELMANDATO, MyGlb.PANEL_LIST, 2);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELMANDATO, MyGlb.PANEL_FORM, 8, 8, 124, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELMANDATO, MyGlb.PANEL_FORM, 0);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELMANDATO, MyGlb.PANEL_FORM, 1);
    PAN_MANDARESIOPE.SetFieldPage(PFL_MANDARESIOPE_LABELMANDATO, -1, -1);
    PAN_MANDARESIOPE.SetFieldPanel(PFL_MANDARESIOPE_LABELMANDATO, -1, "", "LABELMANDATO", 0, 0, 0, -13997);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELIMPEGNO, MyGlb.PANEL_LIST, 240, 0, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELIMPEGNO, MyGlb.PANEL_FORM, 16, 16, 124, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_LABELIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_MANDARESIOPE.SetFieldPage(PFL_MANDARESIOPE_LABELIMPEGNO, -1, -1);
    PAN_MANDARESIOPE.SetFieldPanel(PFL_MANDARESIOPE_LABELIMPEGNO, -1, "", "LABELIMPEGNO", 0, 0, 0, -13997);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 436, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_MANDARESIOPE.SetFieldPage(PFL_MANDARESIOPE_RIFBILANCPEG, -1, -1);
    PAN_MANDARESIOPE.SetFieldUnbound(PFL_MANDARESIOPE_RIFBILANCPEG, true);
    PAN_MANDARESIOPE.SetFieldPanel(PFL_MANDARESIOPE_RIFBILANCPEG, PPQRY_MAN2, "TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )", "MANRIFBILPEG", 5, 201, 0, -13997);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_MANDATO, MyGlb.PANEL_LIST, 8, 44, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_MANDATO, MyGlb.PANEL_LIST, 52);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_MANDATO, MyGlb.PANEL_LIST, 2);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_MANDATO, MyGlb.PANEL_LIST, "Mandato");
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_MANDATO, MyGlb.PANEL_FORM, 12, 444, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_MANDATO, MyGlb.PANEL_FORM, 52);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_MANDATO, MyGlb.PANEL_FORM, 2);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_MANDATO, MyGlb.PANEL_FORM, "Mand.");
    PAN_MANDARESIOPE.SetFieldPage(PFL_MANDARESIOPE_MANDATO, -1, -1);
    PAN_MANDARESIOPE.SetFieldUnbound(PFL_MANDARESIOPE_MANDATO, true);
    PAN_MANDARESIOPE.SetFieldPanel(PFL_MANDARESIOPE_MANDATO, PPQRY_MAN2, "TO_CHAR ( A.NUMERO_MAND ) || ' / ' || TO_CHAR ( A.D_DATA_MAND )", "MANMANDATO", 5, 201, 0, -13997);
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPEGNO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPEGNO, MyGlb.PANEL_LIST, 52);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_MANDARESIOPE.SetRect(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPEGNO, MyGlb.PANEL_FORM, 4, 436, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDARESIOPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPEGNO, MyGlb.PANEL_FORM, 52);
    PAN_MANDARESIOPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_MANDARESIOPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDARESIOPE_IMPEGNO, MyGlb.PANEL_FORM, "Imp.");
    PAN_MANDARESIOPE.SetFieldPage(PFL_MANDARESIOPE_IMPEGNO, -1, -1);
    PAN_MANDARESIOPE.SetFieldUnbound(PFL_MANDARESIOPE_IMPEGNO, true);
    PAN_MANDARESIOPE.SetFieldPanel(PFL_MANDARESIOPE_IMPEGNO, PPQRY_MAN2, "TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP )", "MANIMPEGNO", 5, 201, 0, -13997);
  }

  private void PAN_MANDARESIOPE_InitQueries()
  {
    StringBuffer SQL;

    PAN_MANDARESIOPE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_MANDARESIOPE.SetIMDB(IMDB, "PQRY_MAN2", true);
    PAN_MANDARESIOPE.set_SetString(MyGlb.MASTER_ROWNAME, "MAN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as MANRIFBILPEG, ");
    SQL.append("  TO_CHAR ( A.NUMERO_MAND ) || ' / ' || TO_CHAR ( A.D_DATA_MAND ) as MANMANDATO, ");
    SQL.append("  TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP ) as MANIMPEGNO, ");
    SQL.append("  SUM(C.IMPORTO) as MANIMPORTO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  A.D_DATA_MAND as D_DATA_MAND, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.ANNO_MAND as ANNO_MAND ");
    PAN_MANDARESIOPE.SetQuery(PPQRY_MAN2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  MAN A, ");
    SQL.append("  IMP B, ");
    SQL.append("  LIQ C ");
    PAN_MANDARESIOPE.SetQuery(PPQRY_MAN2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_IMP < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_IMP = B.ANNO_IMP) ");
    SQL.append("and   (A.NUMERO_IMP = B.NUMERO_IMP) ");
    SQL.append("and   (B.OPERA = ~~TBL_PARAMETRI37.PARAMOPERA~~) ");
    SQL.append("and   (C.ANNO_MAND = A.ANNO_MAND) ");
    SQL.append("and   (C.NUMERO_MAND = A.NUMERO_MAND) ");
    SQL.append("and   (NOT ((C.FINANZIAMENTO IS NULL))) ");
    PAN_MANDARESIOPE.SetQuery(PPQRY_MAN2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.NUMERO_MAND, ");
    SQL.append("  A.D_DATA_MAND, ");
    SQL.append("  A.NUMERO_IMP, ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.ANNO_MAND ");
    PAN_MANDARESIOPE.SetQuery(PPQRY_MAN2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MANDARESIOPE.SetQuery(PPQRY_MAN2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.NUMERO_MAND ");
    PAN_MANDARESIOPE.SetQuery(PPQRY_MAN2, 5, SQL, -1, "");
    PAN_MANDARESIOPE.SetQueryDB(PPQRY_MAN2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDARESIOPE.SetMasterTable(0, "MAN");
    PAN_MANDARESIOPE.AddToSortList(PFL_MANDARESIOPE_CAPITOLO, true);
    PAN_MANDARESIOPE.AddToSortList(PFL_MANDARESIOPE_ARTICOLO, true);
    PAN_MANDARESIOPE.AddToSortList(PFL_MANDARESIOPE_NUMEROMAND, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MANDARESIOPE.Status() == 2)
    {
      int oldListQBE = PAN_MANDARESIOPE.iUseListQBE;
      PAN_MANDARESIOPE.iUseListQBE = 0;
      PAN_MANDARESIOPE.PanelCommand(Glb.PCM_SEARCH);
      PAN_MANDARESIOPE.PanelCommand(Glb.PCM_FIND);
      PAN_MANDARESIOPE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_MANDARESIOPE) PAN_MANDARESIOPE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MANDARESIOPE) PAN_MANDARESIOPE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MANDARESIOPE) PAN_MANDARESIOPE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_MANDARESIOPE) PAN_MANDARESIOPE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MANDARESIOPE) PAN_MANDARESIOPE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
