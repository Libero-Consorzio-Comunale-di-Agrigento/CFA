// **********************************************
// Elenco Residui
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoResidui extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ELENCORESIDU_TIPOSTAMRESI = 0;
  private static int PFL_ELENCORESIDU_RESIDUEFFETT = 1;
  private static int PFL_ELENCORESIDU_ELABORA = 2;

  private static int PPQRY_NEWTABLE7 = 0;


  IDPanel PAN_ELENCORESIDU;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE10(IMDB);
    //
    //
    Init_PQRY_NEWTABLE7(IMDB);
    Init_PQRY_NEWTABLE7_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_NEWTABLE10, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_NEWTABLE10, "TBL_NEWTABLE10");
    IMDB.set_FldCode(IMDBDef3.TBL_NEWTABLE10,IMDBDef3.FLD_NEWTABLE10_ROWNAMTISTRE, "ROWNAMTISTRE");
    IMDB.SetFldParams(IMDBDef3.TBL_NEWTABLE10,IMDBDef3.FLD_NEWTABLE10_ROWNAMTISTRE,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_NEWTABLE10,IMDBDef3.FLD_NEWTABLE10_ROWNAMRESEFF, "ROWNAMRESEFF");
    IMDB.SetFldParams(IMDBDef3.TBL_NEWTABLE10,IMDBDef3.FLD_NEWTABLE10_ROWNAMRESEFF,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_NEWTABLE10,IMDBDef3.FLD_NEWTABLE10_RONASTNUDIPA, "RONASTNUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_NEWTABLE10,IMDBDef3.FLD_NEWTABLE10_RONASTNUDIPA,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_NEWTABLE10, 0);
  }

  private static void Init_PQRY_NEWTABLE7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NEWTABLE7, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_NEWTABLE7, "PQRY_NEWTABLE7");
    IMDB.set_FldCode(IMDBDef12.PQRY_NEWTABLE7,IMDBDef12.PQSL_NEWTABLE7_ROWNAMTISTRE, "ROWNAMTISTRE");
    IMDB.SetFldParams(IMDBDef12.PQRY_NEWTABLE7,IMDBDef12.PQSL_NEWTABLE7_ROWNAMTISTRE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_NEWTABLE7,IMDBDef12.PQSL_NEWTABLE7_ROWNAMRESEFF, "ROWNAMRESEFF");
    IMDB.SetFldParams(IMDBDef12.PQRY_NEWTABLE7,IMDBDef12.PQSL_NEWTABLE7_ROWNAMRESEFF,5,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_NEWTABLE7, 0);
  }

  private static void Init_PQRY_NEWTABLE7_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NEWTABLE7_RS, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_NEWTABLE7_RS, "PQRY_NEWTABLE7_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_NEWTABLE7_RS,IMDBDef12.PQSL_NEWTABLE7_ROWNAMTISTRE, "ROWNAMTISTRE");
    IMDB.SetFldParams(IMDBDef12.PQRY_NEWTABLE7_RS,IMDBDef12.PQSL_NEWTABLE7_ROWNAMTISTRE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_NEWTABLE7_RS,IMDBDef12.PQSL_NEWTABLE7_ROWNAMRESEFF, "ROWNAMRESEFF");
    IMDB.SetFldParams(IMDBDef12.PQRY_NEWTABLE7_RS,IMDBDef12.PQSL_NEWTABLE7_ROWNAMRESEFF,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoResidui(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoResidui()
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
    FormIdx = MyGlb.FRM_ELENCORESIDU;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2C0D425C-F3AD-4077-808B-76FBEAA6D3A6";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 368;
    DesignHeight = 178;
    set_Caption(new IDVariant("Elenco Residui"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 368;
    Frames[1].Height = 152;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Elenco Residui";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 152;
    PAN_ELENCORESIDU = new IDPanel(w, this, 1, "PAN_ELENCORESIDU");
    Frames[1].Content = PAN_ELENCORESIDU;
    PAN_ELENCORESIDU.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCORESIDU.VS = MainFrm.VisualStyleList;
    PAN_ELENCORESIDU.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 368-MyGlb.PAN_OFFS_X, 152-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENCORESIDU.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2C30612B-84E6-46C8-8746-F18763896F38");
    PAN_ELENCORESIDU.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 208, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCORESIDU.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCORESIDU.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCORESIDU.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCORESIDU.InitStatus = 2;
    PAN_ELENCORESIDU_Init();
    PAN_ELENCORESIDU_InitFields();
    PAN_ELENCORESIDU_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_NEWTABLE10, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENCORESIDU_NEWTABLE7();
      }
      PAN_ELENCORESIDU.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoResidui);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoResidui.class.getName() : (Glb.ClassWithPackage(ElencoResidui.class) ? ElencoResidui.class.getName().substring(ElencoResidui.class.getPackage().getName().length() + 1) : ElencoResidui.class.getName()));
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
      IMDB.set_Value(IMDBDef3.TBL_NEWTABLE10, IMDBDef3.FLD_NEWTABLE10_ROWNAMTISTRE, 0, (new IDVariant("T")));
      IMDB.set_Value(IMDBDef3.TBL_NEWTABLE10, IMDBDef3.FLD_NEWTABLE10_ROWNAMRESEFF, 0, (new IDVariant("I")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoResidui", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("TIPO")), IMDB.Value(IMDBDef12.PQRY_NEWTABLE7, IMDBDef12.PQSL_NEWTABLE7_ROWNAMTISTRE, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("EFF")), IMDB.Value(IMDBDef12.PQRY_NEWTABLE7, IMDBDef12.PQSL_NEWTABLE7_ROWNAMRESEFF, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_NEWTABLE10, IMDBDef3.FLD_NEWTABLE10_RONASTNUDIPA, 0));
      MainFrm.LanciaStampaJasper((new IDVariant("Elenco_Residui")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoResidui", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla
  // **********************************************************************
  public int Annulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoResidui", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void ELENCORESIDU_NEWTABLE7() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_NEWTABLE7_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_NEWTABLE10, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_NEWTABLE10, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_NEWTABLE7_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_NEWTABLE7_RS, 0, IMDBDef3.TBL_NEWTABLE10, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_NEWTABLE7_RS, 0, 0, IMDBDef3.TBL_NEWTABLE10, IMDBDef3.FLD_NEWTABLE10_ROWNAMTISTRE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_NEWTABLE7_RS, 1, 0, IMDBDef3.TBL_NEWTABLE10, IMDBDef3.FLD_NEWTABLE10_ROWNAMRESEFF, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_NEWTABLE10, 0);
      if (IMDB.Eof(IMDBDef3.TBL_NEWTABLE10, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_NEWTABLE10, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_NEWTABLE7_RS, 0);
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
  private void PAN_ELENCORESIDU_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCORESIDU, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCORESIDU_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCORESIDU, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCORESIDU_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ELENCORESIDU);
    // Stub
  }

  private void PAN_ELENCORESIDU_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENCORESIDU_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ELENCORESIDU.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENCORESIDU_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCORESIDU_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCORESIDU_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCORESIDU_Init()
  {

    PAN_ELENCORESIDU.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCORESIDU.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELENCORESIDU.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_ELENCORESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_TIPOSTAMRESI, "82160CCF-2D5D-40D6-BB10-68E3290F0A61");
    PAN_ELENCORESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_TIPOSTAMRESI, "Tipo Stampa Residui");
    PAN_ELENCORESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_TIPOSTAMRESI, "");
    PAN_ELENCORESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_TIPOSTAMRESI, MyGlb.VIS_OPTIONBUTTON);
    PAN_ELENCORESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_TIPOSTAMRESI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCORESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_RESIDUEFFETT, "C13FA831-02F7-4564-924E-445F01C2C0A2");
    PAN_ELENCORESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_RESIDUEFFETT, "Residuo Effettivo");
    PAN_ELENCORESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_RESIDUEFFETT, "");
    PAN_ELENCORESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_RESIDUEFFETT, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCORESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_RESIDUEFFETT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCORESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_ELABORA, "29289E5F-209D-450D-8FAB-183CF9B1D042");
    PAN_ELENCORESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_ELABORA, "Elabora");
    PAN_ELENCORESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ELENCORESIDU.SetImage(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_ELABORA, 0, "button1.gif", false);
    PAN_ELENCORESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ELENCORESIDU_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCORESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_TIPOSTAMRESI, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCORESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_TIPOSTAMRESI, MyGlb.PANEL_LIST, 104);
    PAN_ELENCORESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_TIPOSTAMRESI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCORESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_TIPOSTAMRESI, MyGlb.PANEL_LIST, "Tipo Stampa Residui");
    PAN_ELENCORESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_TIPOSTAMRESI, MyGlb.PANEL_FORM, 16, 12, 164, 68, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCORESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_TIPOSTAMRESI, MyGlb.PANEL_FORM, 120);
    PAN_ELENCORESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_TIPOSTAMRESI, MyGlb.PANEL_FORM, 4);
    PAN_ELENCORESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_TIPOSTAMRESI, MyGlb.PANEL_FORM, "Tipo Stampa Residui");
    PAN_ELENCORESIDU.SetFieldPage(PFL_ELENCORESIDU_TIPOSTAMRESI, -1, -1);
    PAN_ELENCORESIDU.SetFieldPanel(PFL_ELENCORESIDU_TIPOSTAMRESI, PPQRY_NEWTABLE7, "A.ROWNAMTISTRE", "ROWNAMTISTRE", 5, 1, 0, -13997);
    PAN_ELENCORESIDU.SetValueListItem(PFL_ELENCORESIDU_TIPOSTAMRESI, (new IDVariant("T")), "Totale", "", "", -1);
    PAN_ELENCORESIDU.SetValueListItem(PFL_ELENCORESIDU_TIPOSTAMRESI, (new IDVariant("A")), "Dettaglio per Anno", "", "", -1);
    PAN_ELENCORESIDU.SetValueListItem(PFL_ELENCORESIDU_TIPOSTAMRESI, (new IDVariant("P")), "Dettaglio Anno Precedente", "", "", -1);
    PAN_ELENCORESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_RESIDUEFFETT, MyGlb.PANEL_LIST, 160, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCORESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_RESIDUEFFETT, MyGlb.PANEL_LIST, 92);
    PAN_ELENCORESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_RESIDUEFFETT, MyGlb.PANEL_LIST, 1);
    PAN_ELENCORESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_RESIDUEFFETT, MyGlb.PANEL_LIST, "Res. Effet.");
    PAN_ELENCORESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_RESIDUEFFETT, MyGlb.PANEL_FORM, 192, 32, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCORESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_RESIDUEFFETT, MyGlb.PANEL_FORM, 108);
    PAN_ELENCORESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_RESIDUEFFETT, MyGlb.PANEL_FORM, 1);
    PAN_ELENCORESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_RESIDUEFFETT, MyGlb.PANEL_FORM, "Residuo Effettivo");
    PAN_ELENCORESIDU.SetFieldPage(PFL_ELENCORESIDU_RESIDUEFFETT, -1, -1);
    PAN_ELENCORESIDU.SetFieldPanel(PFL_ELENCORESIDU_RESIDUEFFETT, PPQRY_NEWTABLE7, "A.ROWNAMRESEFF", "ROWNAMRESEFF", 5, 1, 0, -13997);
    PAN_ELENCORESIDU.SetValueListItem(PFL_ELENCORESIDU_RESIDUEFFETT, (new IDVariant("E")), "E", "", "", -1);
    PAN_ELENCORESIDU.SetValueListItem(PFL_ELENCORESIDU_RESIDUEFFETT, (new IDVariant("I")), "I", "", "", -1);
    PAN_ELENCORESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_ELABORA, MyGlb.PANEL_LIST, 184, 84, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCORESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ELENCORESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCORESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_ELABORA, MyGlb.PANEL_FORM, 244, 96, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCORESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ELENCORESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCORESIDU_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCORESIDU.SetFieldPage(PFL_ELENCORESIDU_ELABORA, -1, -1);
    PAN_ELENCORESIDU.SetFieldPanel(PFL_ELENCORESIDU_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_ELENCORESIDU_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCORESIDU.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELENCORESIDU.SetIMDB(IMDB, "PQRY_NEWTABLE7", true);
    PAN_ELENCORESIDU.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ELENCORESIDU.SetQueryIMDB(PPQRY_NEWTABLE7, IMDBDef12.PQRY_NEWTABLE7_RS, IMDBDef3.TBL_NEWTABLE10);
    JustLoaded = true;
    PAN_ELENCORESIDU.SetFieldPrimaryIndex(PFL_ELENCORESIDU_TIPOSTAMRESI, IMDBDef3.FLD_NEWTABLE10_ROWNAMTISTRE);
    PAN_ELENCORESIDU.SetFieldPrimaryIndex(PFL_ELENCORESIDU_RESIDUEFFETT, IMDBDef3.FLD_NEWTABLE10_ROWNAMRESEFF);
    PAN_ELENCORESIDU.SetMasterTable(0, "NEWTABLE10");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCORESIDU.Status() == 2)
    {
      int oldListQBE = PAN_ELENCORESIDU.iUseListQBE;
      PAN_ELENCORESIDU.iUseListQBE = 0;
      PAN_ELENCORESIDU.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCORESIDU.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCORESIDU.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENCORESIDU) PAN_ELENCORESIDU_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCORESIDU) PAN_ELENCORESIDU_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCORESIDU) PAN_ELENCORESIDU_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCORESIDU) PAN_ELENCORESIDU_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENCORESIDU) PAN_ELENCORESIDU_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
