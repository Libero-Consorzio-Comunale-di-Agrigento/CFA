// **********************************************
// Impegni A Residuo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ImpegniAResiduo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_IMPEGNARESID_CAPITOLO = 0;
  private static int PFL_IMPEGNARESID_ARTICOLO = 1;
  private static int PFL_IMPEGNARESID_NUMEROIMP = 2;
  private static int PFL_IMPEGNARESID_ANNOIMP = 3;
  private static int PFL_IMPEGNARESID_DATA = 4;
  private static int PFL_IMPEGNARESID_DESCRIZIONE = 5;
  private static int PFL_IMPEGNARESID_IMPORTO = 6;
  private static int PFL_IMPEGNARESID_DEBITORE = 7;
  private static int PFL_IMPEGNARESID_SEDEDEL = 8;
  private static int PFL_IMPEGNARESID_NUMERODEL = 9;
  private static int PFL_IMPEGNARESID_ANNODEL = 10;
  private static int PFL_IMPEGNARESID_UNITAPROPONE = 11;
  private static int PFL_IMPEGNARESID_NUMEROPROPOS = 12;
  private static int PFL_IMPEGNARESID_ANNOPROPOSTA = 13;
  private static int PFL_IMPEGNARESID_PROGETTO = 14;
  private static int PFL_IMPEGNARESID_LABELCAPITOL = 15;
  private static int PFL_IMPEGNARESID_LABELIMPEGNO = 16;
  private static int PFL_IMPEGNARESID_LABELDELIBER = 17;
  private static int PFL_IMPEGNARESID_LABELPROPOST = 18;
  private static int PFL_IMPEGNARESID_RIFBILANCPEG = 19;
  private static int PFL_IMPEGNARESID_IMPEGNO = 20;
  private static int PFL_IMPEGNARESID_DELIBERA = 21;
  private static int PFL_IMPEGNARESID_PROPOSTA = 22;

  private static int PPQRY_ESEIMPFIN = 0;


  IDPanel PAN_IMPEGNARESID;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI315(IMDB);
    //
    //
    Init_PQRY_ESEIMPFIN(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI315(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI315, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI315, "TBL_PARAMETRI315");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI315,IMDBDef1.FLD_PARAMETRI315_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI315,IMDBDef1.FLD_PARAMETRI315_PARAMOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI315,IMDBDef1.FLD_PARAMETRI315_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI315,IMDBDef1.FLD_PARAMETRI315_PARAMFINANZI,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI315,IMDBDef1.FLD_PARAMETRI315_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI315,IMDBDef1.FLD_PARAMETRI315_PARAMTIPO,5,15,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI315, 0);
  }

  private static void Init_PQRY_ESEIMPFIN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_ESEIMPFIN, 19);
    IMDB.set_TblCode(IMDBDef8.PQRY_ESEIMPFIN, "PQRY_ESEIMPFIN");
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ESEOPRIBIPEG, "ESEOPRIBIPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ESEOPRIBIPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ESEACOPEIMPE, "ESEACOPEIMPE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ESEACOPEIMPE,5,201,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ESEACOPEIMPO, "ESEACOPEIMPO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ESEACOPEIMPO,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ESEACOPEDELI, "ESEACOPEDELI");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ESEACOPEDELI,5,208,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ESEACOPEPROP, "ESEACOPEPROP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ESEACOPEPROP,5,212,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_PROGETTO_ID,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_ESEIMPFIN,IMDBDef8.PQSL_ESEIMPFIN_ANNO_IMP,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_ESEIMPFIN, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ImpegniAResiduo(MyWebEntryPoint w, IMDBObj imdb)
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
  public ImpegniAResiduo()
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
    FormIdx = MyGlb.FRM_IMPEGNARESID;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "82CD67C4-1CF7-4760-9EE4-36A832C2278C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 398;
    set_Caption(new IDVariant("Impegni A Residuo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 372;
    Frames[1].Caption = "Impegni A Residuo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 372;
    PAN_IMPEGNARESID = new IDPanel(w, this, 1, "PAN_IMPEGNARESID");
    Frames[1].Content = PAN_IMPEGNARESID;
    PAN_IMPEGNARESID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPEGNARESID.VS = MainFrm.VisualStyleList;
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 372-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1A90EC4D-31F2-4F2D-9F93-9AFFA40B3F51");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1184, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPEGNARESID.InitStatus = 2;
    PAN_IMPEGNARESID_Init();
    PAN_IMPEGNARESID_InitFields();
    PAN_IMPEGNARESID_InitQueries();
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
      PAN_IMPEGNARESID.UpdatePanel(MainFrm);
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
    return (obj instanceof ImpegniAResiduo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ImpegniAResiduo.class.getName() : (Glb.ClassWithPackage(ImpegniAResiduo.class) ? ImpegniAResiduo.class.getName().substring(ImpegniAResiduo.class.getPackage().getName().length() + 1) : ImpegniAResiduo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Impegni A Residuo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPEGNARESID_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_IMPEGNARESID);
      // 
      // Impegni A Residuo On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_IMPEGNARESID.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPEGNARESID_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_ESEIMPFIN, IMDBDef8.PQSL_ESEIMPFIN_DESCRIZIONE, 0).stringValue()); 
      PAN_IMPEGNARESID.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPEGNARESID_DEBITORE,IMDB.Value(IMDBDef8.PQRY_ESEIMPFIN, IMDBDef8.PQSL_ESEIMPFIN_RAGIONE_SOCIALE_ESTESA, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniAResiduo", "ImpegniAResiduoOnDynamicPropertiesEvent", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      // PAN_IMPEGNARESID.set_FixedCols((new IDVariant(1)).intValue());
      Frames[PAN_IMPEGNARESID.FrIndex].set_Caption(IDL.Add(IDL.Add((new IDVariant(Frames[PAN_IMPEGNARESID.FrIndex].Caption)), (new IDVariant(" "))), IMDB.Value(IMDBDef1.TBL_PARAMETRI315, IMDBDef1.FLD_PARAMETRI315_PARAMTIPO, 0)).stringValue());
      set_Caption(IDL.Add(Caption(), IDL.Add((new IDVariant(" ")), IDL.Add(IMDB.Value(IMDBDef1.TBL_PARAMETRI315, IMDBDef1.FLD_PARAMETRI315_PARAMTIPO, 0), MainFrm.ESERCIZIO))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniAResiduo", "LoadEvent", _e);
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
  private void PAN_IMPEGNARESID_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IMPEGNARESID, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPEGNARESID_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPEGNARESID, Cancel);
    // Stub
  }

  private void PAN_IMPEGNARESID_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IMPEGNARESID_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMPEGNARESID_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_ESEIMPFIN, IMDBDef8.PQSL_ESEIMPFIN_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef8.PQRY_ESEIMPFIN, IMDBDef8.PQSL_ESEIMPFIN_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_IMPEGNARESID_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_IMPEGNARESID_Init()
  {

    PAN_IMPEGNARESID.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPEGNARESID.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMPEGNARESID.SetSize(MyGlb.OBJ_FIELD, 23);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_CAPITOLO, "10FDBAB5-05B5-4CBA-BB88-57B91F6B81F0");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_CAPITOLO, "CAPITOLO");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_CAPITOLO, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ARTICOLO, "D4520329-0427-426D-ABD7-35361841E70E");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ARTICOLO, "ARTICOLO");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ARTICOLO, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROIMP, "7E43EE29-4F13-4F0C-830A-9C147F470F37");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROIMP, "NUMERO IMP");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROIMP, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOIMP, "70C44D11-E8B1-40D0-81F0-A3FB2BD0AB00");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOIMP, "ANNO IMP");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOIMP, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DATA, "7EAE74B4-A60D-42E4-B429-57FD73E2345B");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DATA, "Data");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DATA, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DESCRIZIONE, "9AFA1AE4-C836-4600-B544-717E6A3F660D");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DESCRIZIONE, "Descrizione");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DESCRIZIONE, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPORTO, "F895661B-0028-477B-B5EF-83093BB2DF7B");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPORTO, "Importo");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPORTO, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DEBITORE, "980C44D0-5803-46B8-BFC1-9D425043D3A7");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DEBITORE, "Debitore");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DEBITORE, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_SEDEDEL, "DE8F1DFF-FE66-4FF6-A8F1-DA6EA2970911");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_SEDEDEL, "SEDE DEL");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_SEDEDEL, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMERODEL, "C64AE492-2EDC-43F8-B7DE-D34F0FD18127");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMERODEL, "NUMERO DEL");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMERODEL, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNODEL, "D29AF4D2-FDEC-46B5-AC30-C8C3A747C0B7");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNODEL, "ANNO DEL");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNODEL, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_UNITAPROPONE, "AB9D3536-396F-4FB1-A89E-96AC805DADBA");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_UNITAPROPONE, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROPROPOS, "A0CC4667-C92A-44E5-A3D8-1AEF54238178");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROPROPOS, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOPROPOSTA, "A1BF14BA-EB3B-4CD5-8EA9-EA69953E37DE");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOPROPOSTA, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROGETTO, "E625F151-1F90-4F6A-A2F5-D5115C244382");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROGETTO, "Obiettivo Operativo");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROGETTO, "");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELCAPITOL, "D422CF33-EA1D-478C-9C94-A7F028331D50");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELCAPITOL, "Capitolo/Art.");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELCAPITOL, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELIMPEGNO, "5FFFD053-F0D8-4E24-945E-B837292C7C4D");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELIMPEGNO, "Impegno");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELDELIBER, "56514E84-551A-4627-9920-0DDCC9E7EF76");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELDELIBER, "Delibera");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELDELIBER, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELDELIBER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELPROPOST, "C9AC93A7-A549-4108-AFA0-0A95B3AEA235");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELPROPOST, "Proposta");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELPROPOST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_RIFBILANCPEG, "A0C06045-B5C2-4E84-A720-B4B2BCDA0D9E");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_RIFBILANCPEG, "Rif Bilancio P E G");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_RIFBILANCPEG, "To String (ESEIMP FIN CAPITOLO) + \" / \" + To String (ESEIMP FIN ARTICOLO)");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_RIFBILANCPEG, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_RIFBILANCPEG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPEGNO, "E6C84704-9450-4FE8-A50B-B163F67DF24B");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPEGNO, "Impegno");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPEGNO, "To String (ESEIMP FIN NUMERO IMP) + \" / \" + To String (ESEIMP FIN ANNO IMP)");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DELIBERA, "73B5C48A-A737-41B1-8E94-5A82214EEDB5");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DELIBERA, "Delibera");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DELIBERA, "IMP SEDE DEL + \" - \" + To String (IMP NUMERO DEL) + \" / \" + To String (IMP ANNO DEL)");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DELIBERA, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DELIBERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNARESID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROPOSTA, "DDC91D63-CE5A-4319-8719-78E6802B0995");
    PAN_IMPEGNARESID.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROPOSTA, "Proposta");
    PAN_IMPEGNARESID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROPOSTA, "IMP UNITA PROPONENTE + \" - \" + To String (IMP NUMERO PROPOSTA) + \" / \" + To String (IMP ANNO PROPOSTA)");
    PAN_IMPEGNARESID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGNARESID.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_IMPEGNARESID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_CAPITOLO, MyGlb.PANEL_FORM, 4, 640, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_CAPITOLO, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_CAPITOLO, PPQRY_ESEIMPFIN, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ARTICOLO, MyGlb.PANEL_LIST, 108, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ARTICOLO, MyGlb.PANEL_FORM, 4, 664, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_ARTICOLO, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_ARTICOLO, PPQRY_ESEIMPFIN, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROIMP, MyGlb.PANEL_LIST, 132, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROIMP, MyGlb.PANEL_LIST, "NUM. IMP");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROIMP, MyGlb.PANEL_FORM, 4, 688, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_NUMEROIMP, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_NUMEROIMP, PPQRY_ESEIMPFIN, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOIMP, MyGlb.PANEL_LIST, 176, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOIMP, MyGlb.PANEL_FORM, 4, 712, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_ANNOIMP, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_ANNOIMP, PPQRY_ESEIMPFIN, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DATA, MyGlb.PANEL_LIST, 212, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DATA, MyGlb.PANEL_LIST, 68);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DATA, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DATA, MyGlb.PANEL_FORM, 4, 496, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DATA, MyGlb.PANEL_FORM, 68);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DATA, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_DATA, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_DATA, PPQRY_ESEIMPFIN, "B.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DESCRIZIONE, MyGlb.PANEL_LIST, 284, 36, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 148, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_DESCRIZIONE, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_DESCRIZIONE, PPQRY_ESEIMPFIN, "B.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPORTO, MyGlb.PANEL_LIST, 496, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPORTO, MyGlb.PANEL_FORM, 4, 400, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_IMPORTO, -1, -1);
    PAN_IMPEGNARESID.SetFieldUnbound(PFL_IMPEGNARESID_IMPORTO, true);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_IMPORTO, PPQRY_ESEIMPFIN, "NVL(A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES, 0)", "ESEACOPEIMPO", 3, 28, 6, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DEBITORE, MyGlb.PANEL_LIST, 596, 36, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DEBITORE, MyGlb.PANEL_LIST, 140);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DEBITORE, MyGlb.PANEL_FORM, 4, 376, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DEBITORE, MyGlb.PANEL_FORM, 140);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_DEBITORE, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_DEBITORE, PPQRY_ESEIMPFIN, "C.RAGIONE_SOCIALE_ESTESA", "RAGIONE_SOCIALE_ESTESA", 5, 60, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_SEDEDEL, MyGlb.PANEL_LIST, 808, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_SEDEDEL, MyGlb.PANEL_FORM, 4, 736, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_SEDEDEL, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_SEDEDEL, PPQRY_ESEIMPFIN, "B.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMERODEL, MyGlb.PANEL_LIST, 848, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMERODEL, MyGlb.PANEL_FORM, 4, 760, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_NUMERODEL, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_NUMERODEL, PPQRY_ESEIMPFIN, "B.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNODEL, MyGlb.PANEL_LIST, 892, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNODEL, MyGlb.PANEL_FORM, 4, 784, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_ANNODEL, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_ANNODEL, PPQRY_ESEIMPFIN, "B.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_UNITAPROPONE, MyGlb.PANEL_LIST, 932, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 808, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_UNITAPROPONE, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_UNITAPROPONE, PPQRY_ESEIMPFIN, "B.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROPROPOS, MyGlb.PANEL_LIST, 1040, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 832, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_NUMEROPROPOS, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_NUMEROPROPOS, PPQRY_ESEIMPFIN, "B.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1080, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PROP.");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 856, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_ANNOPROPOSTA, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_ANNOPROPOSTA, PPQRY_ESEIMPFIN, "B.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROGETTO, MyGlb.PANEL_LIST, 1120, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROGETTO, MyGlb.PANEL_FORM, 4, 352, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROGETTO, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_PROGETTO, -1, -1);
    PAN_IMPEGNARESID.SetFieldUnbound(PFL_IMPEGNARESID_PROGETTO, true);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_PROGETTO, PPQRY_ESEIMPFIN, "DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',B.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE ),'SI')", "PROGETTO_ID", 5, 99, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELCAPITOL, MyGlb.PANEL_LIST, 0, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELCAPITOL, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELCAPITOL, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELCAPITOL, MyGlb.PANEL_FORM, 0, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELCAPITOL, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_LABELCAPITOL, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_LABELCAPITOL, -1, "", "LABELCAPITOL", 0, 0, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELIMPEGNO, MyGlb.PANEL_LIST, 132, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELIMPEGNO, MyGlb.PANEL_FORM, 8, 8, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_LABELIMPEGNO, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_LABELIMPEGNO, -1, "", "LABELIMPEGNO", 0, 0, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELDELIBER, MyGlb.PANEL_LIST, 808, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELDELIBER, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELDELIBER, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELDELIBER, MyGlb.PANEL_FORM, 16, 16, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELDELIBER, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELDELIBER, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_LABELDELIBER, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_LABELDELIBER, -1, "", "LABELDELIBER", 0, 0, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELPROPOST, MyGlb.PANEL_LIST, 932, 0, 188, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELPROPOST, MyGlb.PANEL_FORM, 24, 24, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_LABELPROPOST, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_LABELPROPOST, -1, -1);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_RIFBILANCPEG, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_RIFBILANCPEG, MyGlb.PANEL_LIST, 88);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_RIFBILANCPEG, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_RIFBILANCPEG, MyGlb.PANEL_LIST, "Rif Bilancio P E G");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_RIFBILANCPEG, MyGlb.PANEL_FORM, 4, 880, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_RIFBILANCPEG, MyGlb.PANEL_FORM, 88);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_RIFBILANCPEG, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_RIFBILANCPEG, MyGlb.PANEL_FORM, "Rif Bilancio P E G");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_RIFBILANCPEG, -1, -1);
    PAN_IMPEGNARESID.SetFieldUnbound(PFL_IMPEGNARESID_RIFBILANCPEG, true);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_RIFBILANCPEG, PPQRY_ESEIMPFIN, "TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )", "ESEOPRIBIPEG", 5, 201, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPEGNO, MyGlb.PANEL_LIST, 8, 44, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPEGNO, MyGlb.PANEL_LIST, 52);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPEGNO, MyGlb.PANEL_FORM, 12, 888, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPEGNO, MyGlb.PANEL_FORM, 52);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_IMPEGNO, MyGlb.PANEL_FORM, "Imp.");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_IMPEGNO, -1, -1);
    PAN_IMPEGNARESID.SetFieldUnbound(PFL_IMPEGNARESID_IMPEGNO, true);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_IMPEGNO, PPQRY_ESEIMPFIN, "TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP )", "ESEACOPEIMPE", 5, 201, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DELIBERA, MyGlb.PANEL_FORM, 4, 880, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DELIBERA, MyGlb.PANEL_FORM, 48);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_DELIBERA, MyGlb.PANEL_FORM, "Delib.");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_DELIBERA, -1, -1);
    PAN_IMPEGNARESID.SetFieldUnbound(PFL_IMPEGNARESID_DELIBERA, true);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_DELIBERA, PPQRY_ESEIMPFIN, "B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL )", "ESEACOPEDELI", 5, 208, 0, -13997);
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_IMPEGNARESID.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROPOSTA, MyGlb.PANEL_FORM, 4, 880, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNARESID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROPOSTA, MyGlb.PANEL_FORM, 52);
    PAN_IMPEGNARESID.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_IMPEGNARESID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNARESID_PROPOSTA, MyGlb.PANEL_FORM, "Prop.");
    PAN_IMPEGNARESID.SetFieldPage(PFL_IMPEGNARESID_PROPOSTA, -1, -1);
    PAN_IMPEGNARESID.SetFieldUnbound(PFL_IMPEGNARESID_PROPOSTA, true);
    PAN_IMPEGNARESID.SetFieldPanel(PFL_IMPEGNARESID_PROPOSTA, PPQRY_ESEIMPFIN, "B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA )", "ESEACOPEPROP", 5, 212, 0, -13997);
  }

  private void PAN_IMPEGNARESID_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPEGNARESID.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMPEGNARESID.SetIMDB(IMDB, "PQRY_ESEIMPFIN", true);
    PAN_IMPEGNARESID.set_SetString(MyGlb.MASTER_ROWNAME, "ESEACC OPE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as ESEOPRIBIPEG, ");
    SQL.append("  TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP ) as ESEACOPEIMPE, ");
    SQL.append("  B.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  NVL(A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES, 0) as ESEACOPEIMPO, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  B.SEDE_DEL || ' - ' || TO_CHAR ( B.NUMERO_DEL ) || ' / ' || TO_CHAR ( B.ANNO_DEL ) as ESEACOPEDELI, ");
    SQL.append("  B.UNITA_PROPONENTE || ' - ' || TO_CHAR ( B.NUMERO_PROPOSTA ) || ' / ' || TO_CHAR ( B.ANNO_PROPOSTA ) as ESEACOPEPROP, ");
    SQL.append("  DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',B.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE ),'SI') as PROGETTO_ID, ");
    SQL.append("  B.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  B.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  B.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  B.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  B.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  B.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP ");
    PAN_IMPEGNARESID.SetQuery(PPQRY_ESEIMPFIN, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESEIMP_FIN A, ");
    SQL.append("  IMP B, ");
    SQL.append("  BEN C ");
    PAN_IMPEGNARESID.SetQuery(PPQRY_ESEIMPFIN, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.BENEFICIARIO = C.CODICE(+)) ");
    SQL.append("and   (A.ANNO_IMP = B.ANNO_IMP(+)) ");
    SQL.append("and   (A.NUMERO_IMP = B.NUMERO_IMP(+)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_IMP < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (DECODE(~~TBL_PARAMETRI315.PARAMTIPO~~, 'Opera', A.OPERA, A.FINANZIAMENTO) = DECODE(~~TBL_PARAMETRI315.PARAMTIPO~~, 'Opera', ~~TBL_PARAMETRI315.PARAMOPERA~~, ~~TBL_PARAMETRI315.PARAMFINANZI~~)) ");
    PAN_IMPEGNARESID.SetQuery(PPQRY_ESEIMPFIN, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGNARESID.SetQuery(PPQRY_ESEIMPFIN, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGNARESID.SetQuery(PPQRY_ESEIMPFIN, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.NUMERO_IMP, ");
    SQL.append("  A.ANNO_IMP ");
    PAN_IMPEGNARESID.SetQuery(PPQRY_ESEIMPFIN, 5, SQL, -1, "");
    PAN_IMPEGNARESID.SetQueryDB(PPQRY_ESEIMPFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPEGNARESID.SetMasterTable(0, "ESEIMP_FIN");
    PAN_IMPEGNARESID.AddToSortList(PFL_IMPEGNARESID_CAPITOLO, true);
    PAN_IMPEGNARESID.AddToSortList(PFL_IMPEGNARESID_ARTICOLO, true);
    PAN_IMPEGNARESID.AddToSortList(PFL_IMPEGNARESID_NUMEROIMP, true);
    PAN_IMPEGNARESID.AddToSortList(PFL_IMPEGNARESID_ANNOIMP, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPEGNARESID.Status() == 2)
    {
      int oldListQBE = PAN_IMPEGNARESID.iUseListQBE;
      PAN_IMPEGNARESID.iUseListQBE = 0;
      PAN_IMPEGNARESID.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPEGNARESID.PanelCommand(Glb.PCM_FIND);
      PAN_IMPEGNARESID.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMPEGNARESID) PAN_IMPEGNARESID_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPEGNARESID) PAN_IMPEGNARESID_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMPEGNARESID) PAN_IMPEGNARESID_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPEGNARESID) PAN_IMPEGNARESID_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMPEGNARESID) PAN_IMPEGNARESID_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
