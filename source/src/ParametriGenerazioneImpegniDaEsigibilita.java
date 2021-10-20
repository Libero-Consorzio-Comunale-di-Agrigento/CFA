// **********************************************
// Parametri Generazione Impegni Da Esigibilita
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ParametriGenerazioneImpegniDaEsigibilita extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PAR_DELIBERA = 0;
  private static int PFL_PAR_ETICHEELABOR = 1;

  private static int PPQRY_PAR125 = 0;


  IDPanel PAN_PAR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR116(IMDB);
    //
    //
    Init_PQRY_PAR125(IMDB);
    Init_PQRY_PAR125_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR116(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PAR116, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_PAR116, "TBL_PAR116");
    IMDB.set_FldCode(IMDBDef4.TBL_PAR116,IMDBDef4.FLD_PAR116_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR116,IMDBDef4.FLD_PAR116_NOMEOGGEDELI,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAR116,IMDBDef4.FLD_PAR116_NOMEOGGDAELA, "NOMEOGGDAELA");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR116,IMDBDef4.FLD_PAR116_NOMEOGGDAELA,5,52,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PAR116,IMDBDef4.FLD_PAR116_NOMEOGGEVBVI, "NOMEOGGEVBVI");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR116,IMDBDef4.FLD_PAR116_NOMEOGGEVBVI,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PAR116, 0);
  }

  private static void Init_PQRY_PAR125(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PAR125, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_PAR125, "PQRY_PAR125");
    IMDB.set_FldCode(IMDBDef13.PQRY_PAR125,IMDBDef13.PQSL_PAR125_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PAR125,IMDBDef13.PQSL_PAR125_NOMEOGGEDELI,5,1,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PAR125, 0);
  }

  private static void Init_PQRY_PAR125_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PAR125_RS, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_PAR125_RS, "PQRY_PAR125_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PAR125_RS,IMDBDef13.PQSL_PAR125_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PAR125_RS,IMDBDef13.PQSL_PAR125_NOMEOGGEDELI,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ParametriGenerazioneImpegniDaEsigibilita(MyWebEntryPoint w, IMDBObj imdb)
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
  public ParametriGenerazioneImpegniDaEsigibilita()
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
    FormIdx = MyGlb.FRM_PARGENIMDAES;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E5562926-EF10-4303-81A9-604D127D04FE";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 324;
    DesignHeight = 138;
    set_Caption(new IDVariant("Generazione Impegni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 324;
    Frames[1].Height = 112;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Par";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 112;
    PAN_PAR = new IDPanel(w, this, 1, "PAN_PAR");
    Frames[1].Content = PAN_PAR;
    PAN_PAR.Lockable = false;
    PAN_PAR.iLocked = false;
    PAN_PAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PAR.VS = MainFrm.VisualStyleList;
    PAN_PAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 324-MyGlb.PAN_OFFS_X, 112-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F8E7C33B-1653-4763-BEDB-4C7890120A67");
    PAN_PAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 72, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PAR.InitStatus = 1;
    PAN_PAR_Init();
    PAN_PAR_InitFields();
    PAN_PAR_InitQueries();
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
    // Resetto il fuoco perch� le tabbed view lo possono modificare
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
      if (IMDB.TblModified(IMDBDef4.TBL_PAR116, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PARGENIMDAES_PAR125();
      }
      PAN_PAR.UpdatePanel(MainFrm);
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
  // Torna TRUE se l'oggetto passato � una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ParametriGenerazioneImpegniDaEsigibilita);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ParametriGenerazioneImpegniDaEsigibilita.class.getName() : (Glb.ClassWithPackage(ParametriGenerazioneImpegniDaEsigibilita.class) ? ParametriGenerazioneImpegniDaEsigibilita.class.getName().substring(ParametriGenerazioneImpegniDaEsigibilita.class.getPackage().getName().length() + 1) : ParametriGenerazioneImpegniDaEsigibilita.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      LOAD_PARDELETE();
      IMDB.set_Value(IMDBDef4.TBL_PAR116, IMDBDef4.FLD_PAR116_NOMEOGGDAELA, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriGenerazioneImpegniDaEsigibilita", "Load", _e);
    }
  }

  // **********************************************************************
  // Par: Delete
  // Perch� stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_PARDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PAR116, IMDBDef4.FLD_PAR116_NOMEOGGEDELI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PAR116, IMDBDef4.FLD_PAR116_NOMEOGGDAELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PAR116, IMDBDef4.FLD_PAR116_NOMEOGGEVBVI, 0, new IDVariant());
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PAR125, IMDBDef13.PQSL_PAR125_NOMEOGGEDELI, 0)))
      {
        IDVariant v_SS = new IDVariant(0,IDVariant.STRING);
        v_SS = (new IDVariant("Opzione Delibera obbligatoria"));
        MainFrm.set_AlertMessage(v_SS); 
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_PAR116, IMDBDef4.FLD_PAR116_NOMEOGGDAELA, 0, (new IDVariant("SI")));
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriGenerazioneImpegniDaEsigibilita", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Par
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void PARGENIMDAES_PAR125() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PAR125_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PAR116, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PAR116, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PAR125_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PAR125_RS, 0, IMDBDef4.TBL_PAR116, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PAR125_RS, 0, 0, IMDBDef4.TBL_PAR116, IMDBDef4.FLD_PAR116_NOMEOGGEDELI, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PAR116, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PAR116, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PAR116, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PAR125_RS, 0);
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
  // cio� quando viene portata in primo piano
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
  private void PAN_PAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PAR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PAR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PAR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PAR);
    // Stub
  }

  private void PAN_PAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PAR_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PAR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PAR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PAR_Init()
  {

    PAN_PAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_DELIBERA, "901F8DF7-D358-4C73-895B-B1A1DEF8831E");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_DELIBERA, "Delibera");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_DELIBERA, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_DELIBERA, MyGlb.VIS_OPTIONBUTTON);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_ETICHEELABOR, "B3102A25-F2D1-4941-B37C-45DBB73E30BB");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_ETICHEELABOR, "Elabora");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DELIBERA, MyGlb.PANEL_LIST, 56);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DELIBERA, MyGlb.PANEL_FORM, 8, 20, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DELIBERA, MyGlb.PANEL_FORM, 72);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PAR.SetFieldPage(PFL_PAR_DELIBERA, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_DELIBERA, PPQRY_PAR125, "A.NOMEOGGEDELI", "NOMEOGGEDELI", 5, 1, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_DELIBERA, (new IDVariant("I")), "da Impegno", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_DELIBERA, (new IDVariant("V")), "da Variazione Impegno", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ETICHEELABOR, MyGlb.PANEL_LIST, 192, 68, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ETICHEELABOR, MyGlb.PANEL_FORM, 224, 52, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_ETICHEELABOR, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PAR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PAR.SetIMDB(IMDB, "PQRY_PAR125", true);
    PAN_PAR.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PAR.SetQueryIMDB(PPQRY_PAR125, IMDBDef13.PQRY_PAR125_RS, IMDBDef4.TBL_PAR116);
    JustLoaded = true;
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_DELIBERA, IMDBDef4.FLD_PAR116_NOMEOGGEDELI);
    PAN_PAR.SetMasterTable(0, "PAR116");
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_PAR.Status() == 2)
    {
      int oldListQBE = PAN_PAR.iUseListQBE;
      PAN_PAR.iUseListQBE = 0;
      PAN_PAR.PanelCommand(Glb.PCM_SEARCH);
      PAN_PAR.PanelCommand(Glb.PCM_FIND);
      PAN_PAR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PAR) PAN_PAR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
