// **********************************************
// Motivazione Rifiuto
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MotivazioneRifiuto extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_MOTIVARIFIUT_MOTIVAZIONE = 0;
  private static int PFL_MOTIVARIFIUT_ETICHETTAOK = 1;
  private static int PFL_MOTIVARIFIUT_ETICHEANNULL = 2;
  private static int PFL_MOTIVARIFIUT_ETICHETTESTO = 3;

  private static int PPQRY_MOTIVARIFIU1 = 0;


  IDPanel PAN_MOTIVARIFIUT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_MOTIVARIFIUT(IMDB);
    //
    //
    Init_PQRY_MOTIVARIFIU1(IMDB);
    Init_PQRY_MOTIVARIFIU1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_MOTIVARIFIUT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_MOTIVARIFIUT, 1);
    IMDB.set_TblCode(IMDBDef2.TBL_MOTIVARIFIUT, "TBL_MOTIVARIFIUT");
    IMDB.set_FldCode(IMDBDef2.TBL_MOTIVARIFIUT,IMDBDef2.FLD_MOTIVARIFIUT_NOMEOGGEMOTI, "NOMEOGGEMOTI");
    IMDB.SetFldParams(IMDBDef2.TBL_MOTIVARIFIUT,IMDBDef2.FLD_MOTIVARIFIUT_NOMEOGGEMOTI,5,255,0);
    IMDB.TblAddNew(IMDBDef2.TBL_MOTIVARIFIUT, 0);
  }

  private static void Init_PQRY_MOTIVARIFIU1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_MOTIVARIFIU1, 1);
    IMDB.set_TblCode(IMDBDef10.PQRY_MOTIVARIFIU1, "PQRY_MOTIVARIFIU1");
    IMDB.set_FldCode(IMDBDef10.PQRY_MOTIVARIFIU1,IMDBDef10.PQSL_MOTIVARIFIU1_NOMEOGGEMOTI, "NOMEOGGEMOTI");
    IMDB.SetFldParams(IMDBDef10.PQRY_MOTIVARIFIU1,IMDBDef10.PQSL_MOTIVARIFIU1_NOMEOGGEMOTI,5,255,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_MOTIVARIFIU1, 0);
  }

  private static void Init_PQRY_MOTIVARIFIU1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_MOTIVARIFIU1_RS, 1);
    IMDB.set_TblCode(IMDBDef10.PQRY_MOTIVARIFIU1_RS, "PQRY_MOTIVARIFIU1_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_MOTIVARIFIU1_RS,IMDBDef10.PQSL_MOTIVARIFIU1_NOMEOGGEMOTI, "NOMEOGGEMOTI");
    IMDB.SetFldParams(IMDBDef10.PQRY_MOTIVARIFIU1_RS,IMDBDef10.PQSL_MOTIVARIFIU1_NOMEOGGEMOTI,5,255,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MotivazioneRifiuto(MyWebEntryPoint w, IMDBObj imdb)
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
  public MotivazioneRifiuto()
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
    FormIdx = MyGlb.FRM_MOTIVARIFIUT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C3314D7F-48B5-403A-849A-02A04E638590";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 564;
    DesignHeight = 234;
    set_Caption(new IDVariant("Motivazione Rifiuto"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 564;
    Frames[1].Height = 208;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Motivazione Rifiuto";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 208;
    PAN_MOTIVARIFIUT = new IDPanel(w, this, 1, "PAN_MOTIVARIFIUT");
    Frames[1].Content = PAN_MOTIVARIFIUT;
    PAN_MOTIVARIFIUT.Lockable = false;
    PAN_MOTIVARIFIUT.iLocked = false;
    PAN_MOTIVARIFIUT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MOTIVARIFIUT.VS = MainFrm.VisualStyleList;
    PAN_MOTIVARIFIUT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 564-MyGlb.PAN_OFFS_X, 208-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MOTIVARIFIUT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5C908CB7-6347-4DBF-B3A7-DC1368005AF7");
    PAN_MOTIVARIFIUT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 316, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_MOTIVARIFIUT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MOTIVARIFIUT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MOTIVARIFIUT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MOTIVARIFIUT.InitStatus = 1;
    PAN_MOTIVARIFIUT_Init();
    PAN_MOTIVARIFIUT_InitFields();
    PAN_MOTIVARIFIUT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_MOTIVARIFIUT, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        MOTIVARIFIUT_MOTIVARIFIU1();
      }
      PAN_MOTIVARIFIUT.UpdatePanel(MainFrm);
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
    return (obj instanceof MotivazioneRifiuto);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MotivazioneRifiuto.class.getName() : (Glb.ClassWithPackage(MotivazioneRifiuto.class) ? MotivazioneRifiuto.class.getName().substring(MotivazioneRifiuto.class.getPackage().getName().length() + 1) : MotivazioneRifiuto.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Etichetta OK
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaOK ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta OK Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_MOTIVARIFIU1, IMDBDef10.PQSL_MOTIVARIFIU1_NOMEOGGEMOTI, 0)))
      {
        MainFrm.set_AlertMessage((new IDVariant("E' necessario indicare il motivo del rifiuto"))); 
        return 0;
      }
      IMDB.set_Value(IMDBDef2.TBL_TEMPMOTIVAZI, IMDBDef2.FLD_TEMPMOTIVAZI_NOMEOGGEMOTI, 0, IMDB.Value(IMDBDef10.PQRY_MOTIVARIFIU1, IMDBDef10.PQSL_MOTIVARIFIU1_NOMEOGGEMOTI, 0));
      ETICHETTAOK_MOTIRIFIDELE();
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MotivazioneRifiuto", "EtichettaOK", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Motivazione Rifiuto: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void ETICHETTAOK_MOTIRIFIDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_MOTIVARIFIUT, IMDBDef2.FLD_MOTIVARIFIUT_NOMEOGGEMOTI, 0, new IDVariant());
  }

  // **********************************************************************
  // Etichetta Annulla
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaAnnulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Annulla Body
      // Corpo Procedura
      // 
      ETICHEANNULL_MOTIRIFIDELE();
      IMDB.set_Value(IMDBDef2.TBL_TEMPMOTIVAZI, IMDBDef2.FLD_TEMPMOTIVAZI_NOMEOGGEMOTI, 0, (new IDVariant()));
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MotivazioneRifiuto", "EtichettaAnnulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Motivazione Rifiuto: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void ETICHEANNULL_MOTIRIFIDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_MOTIVARIFIUT, IMDBDef2.FLD_MOTIVARIFIUT_NOMEOGGEMOTI, 0, new IDVariant());
  }

  // **********************************************************************
  // Motivazione Rifiuto
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void MOTIVARIFIUT_MOTIVARIFIU1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_MOTIVARIFIU1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_MOTIVARIFIUT, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_MOTIVARIFIUT, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_MOTIVARIFIU1_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_MOTIVARIFIU1_RS, 0, IMDBDef2.TBL_MOTIVARIFIUT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_MOTIVARIFIU1_RS, 0, 0, IMDBDef2.TBL_MOTIVARIFIUT, IMDBDef2.FLD_MOTIVARIFIUT_NOMEOGGEMOTI, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_MOTIVARIFIUT, 0);
      if (IMDB.Eof(IMDBDef2.TBL_MOTIVARIFIUT, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_MOTIVARIFIUT, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_MOTIVARIFIU1_RS, 0);
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
  private void PAN_MOTIVARIFIUT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MOTIVARIFIUT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MOTIVARIFIUT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MOTIVARIFIUT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MOTIVARIFIUT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_MOTIVARIFIUT);
    // Stub
  }

  private void PAN_MOTIVARIFIUT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_MOTIVARIFIUT_ETICHETTAOK)
    {
      this.IdxPanelActived = this.PAN_MOTIVARIFIUT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaOK();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_MOTIVARIFIUT_ETICHEANNULL)
    {
      this.IdxPanelActived = this.PAN_MOTIVARIFIUT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaAnnulla();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_MOTIVARIFIUT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_MOTIVARIFIUT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_MOTIVARIFIUT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_MOTIVARIFIUT_Init()
  {

    PAN_MOTIVARIFIUT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MOTIVARIFIUT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MOTIVARIFIUT.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_MOTIVARIFIUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_MOTIVAZIONE, "2124C5AB-D2C0-4B7A-837E-8213DBC6D270");
    PAN_MOTIVARIFIUT.set_Header(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_MOTIVAZIONE, "Indicare la motivazione del rifiuto");
    PAN_MOTIVARIFIUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_MOTIVAZIONE, "");
    PAN_MOTIVARIFIUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_MOTIVAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_MOTIVARIFIUT.SetFlags(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_MOTIVAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MOTIVARIFIUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTAOK, "939CBE84-BC32-40C1-8853-11BB5951A2E3");
    PAN_MOTIVARIFIUT.set_Header(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTAOK, "OK");
    PAN_MOTIVARIFIUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTAOK, MyGlb.VIS_STATICBUTTON);
    PAN_MOTIVARIFIUT.SetImage(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTAOK, 0, "button1.gif", false);
    PAN_MOTIVARIFIUT.SetFlags(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTAOK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_MOTIVARIFIUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHEANNULL, "9F12EC8E-BDE1-404F-9883-DF2C31B439BE");
    PAN_MOTIVARIFIUT.set_Header(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHEANNULL, "Annulla");
    PAN_MOTIVARIFIUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHEANNULL, MyGlb.VIS_STATICBUTTON);
    PAN_MOTIVARIFIUT.SetImage(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHEANNULL, 0, "button1.gif", false);
    PAN_MOTIVARIFIUT.SetFlags(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHEANNULL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_MOTIVARIFIUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTESTO, "9C279D94-46B2-42CC-9406-66E801F788E8");
    PAN_MOTIVARIFIUT.set_Header(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTESTO, "Indicare la motivazione del rifiuto");
    PAN_MOTIVARIFIUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTESTO, "testo");
    PAN_MOTIVARIFIUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTESTO, MyGlb.VIS_LABELFIELD);
    PAN_MOTIVARIFIUT.SetFlags(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTESTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_MOTIVARIFIUT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MOTIVARIFIUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_MOTIVAZIONE, MyGlb.PANEL_LIST, 0, 36, 316, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOTIVARIFIUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_MOTIVAZIONE, MyGlb.PANEL_LIST, 20);
    PAN_MOTIVARIFIUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_MOTIVAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_MOTIVARIFIUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_MOTIVAZIONE, MyGlb.PANEL_LIST, "Indicare la motivazione del rifiuto");
    PAN_MOTIVARIFIUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_MOTIVAZIONE, MyGlb.PANEL_FORM, 88, 40, 396, 72, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVARIFIUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_MOTIVAZIONE, MyGlb.PANEL_FORM, 20);
    PAN_MOTIVARIFIUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_MOTIVAZIONE, MyGlb.PANEL_FORM, 5);
    PAN_MOTIVARIFIUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_MOTIVAZIONE, MyGlb.PANEL_FORM, "Indicare la motivazione del rifiuto");
    PAN_MOTIVARIFIUT.SetFieldPage(PFL_MOTIVARIFIUT_MOTIVAZIONE, -1, -1);
    PAN_MOTIVARIFIUT.SetFieldPanel(PFL_MOTIVARIFIUT_MOTIVAZIONE, PPQRY_MOTIVARIFIU1, "A.NOMEOGGEMOTI", "NOMEOGGEMOTI", 5, 255, 0, -13997);
    PAN_MOTIVARIFIUT.set_Alignment(PFL_MOTIVARIFIUT_MOTIVAZIONE, 2);
    PAN_MOTIVARIFIUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTAOK, MyGlb.PANEL_LIST, 332, 132, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVARIFIUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTAOK, MyGlb.PANEL_LIST, 0);
    PAN_MOTIVARIFIUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTAOK, MyGlb.PANEL_LIST, 1);
    PAN_MOTIVARIFIUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTAOK, MyGlb.PANEL_FORM, 332, 132, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVARIFIUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTAOK, MyGlb.PANEL_FORM, 0);
    PAN_MOTIVARIFIUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTAOK, MyGlb.PANEL_FORM, 1);
    PAN_MOTIVARIFIUT.SetFieldPage(PFL_MOTIVARIFIUT_ETICHETTAOK, -1, -1);
    PAN_MOTIVARIFIUT.SetFieldPanel(PFL_MOTIVARIFIUT_ETICHETTAOK, -1, "", "ETICHETTAOK", 0, 0, 0, -13997);
    PAN_MOTIVARIFIUT.set_ImageResizeMode(PFL_MOTIVARIFIUT_ETICHETTAOK, 2);
    PAN_MOTIVARIFIUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHEANNULL, MyGlb.PANEL_LIST, 436, 132, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVARIFIUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHEANNULL, MyGlb.PANEL_LIST, 0);
    PAN_MOTIVARIFIUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHEANNULL, MyGlb.PANEL_LIST, 1);
    PAN_MOTIVARIFIUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHEANNULL, MyGlb.PANEL_FORM, 436, 132, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVARIFIUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHEANNULL, MyGlb.PANEL_FORM, 0);
    PAN_MOTIVARIFIUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHEANNULL, MyGlb.PANEL_FORM, 1);
    PAN_MOTIVARIFIUT.SetFieldPage(PFL_MOTIVARIFIUT_ETICHEANNULL, -1, -1);
    PAN_MOTIVARIFIUT.SetFieldPanel(PFL_MOTIVARIFIUT_ETICHEANNULL, -1, "", "ETICHEANNULL", 0, 0, 0, -13997);
    PAN_MOTIVARIFIUT.set_ImageResizeMode(PFL_MOTIVARIFIUT_ETICHEANNULL, 2);
    PAN_MOTIVARIFIUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTESTO, MyGlb.PANEL_LIST, 88, 12, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVARIFIUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTESTO, MyGlb.PANEL_LIST, 0);
    PAN_MOTIVARIFIUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTESTO, MyGlb.PANEL_LIST, 1);
    PAN_MOTIVARIFIUT.SetRect(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTESTO, MyGlb.PANEL_FORM, 88, 12, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOTIVARIFIUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTESTO, MyGlb.PANEL_FORM, 0);
    PAN_MOTIVARIFIUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOTIVARIFIUT_ETICHETTESTO, MyGlb.PANEL_FORM, 1);
    PAN_MOTIVARIFIUT.SetFieldPage(PFL_MOTIVARIFIUT_ETICHETTESTO, -1, -1);
    PAN_MOTIVARIFIUT.SetFieldPanel(PFL_MOTIVARIFIUT_ETICHETTESTO, -1, "", "ETICHETTESTO", 0, 0, 0, -13997);
    PAN_MOTIVARIFIUT.set_FontModifiers(PFL_MOTIVARIFIUT_ETICHETTESTO, "B");
  }

  private void PAN_MOTIVARIFIUT_InitQueries()
  {
    StringBuffer SQL;

    PAN_MOTIVARIFIUT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_MOTIVARIFIUT.SetIMDB(IMDB, "PQRY_MOTIVARIFIU1", true);
    PAN_MOTIVARIFIUT.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_MOTIVARIFIUT.SetQueryIMDB(PPQRY_MOTIVARIFIU1, IMDBDef10.PQRY_MOTIVARIFIU1_RS, IMDBDef2.TBL_MOTIVARIFIUT);
    JustLoaded = true;
    PAN_MOTIVARIFIUT.SetFieldPrimaryIndex(PFL_MOTIVARIFIUT_MOTIVAZIONE, IMDBDef2.FLD_MOTIVARIFIUT_NOMEOGGEMOTI);
    PAN_MOTIVARIFIUT.SetMasterTable(0, "MOTIVARIFIUT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MOTIVARIFIUT.Status() == 2)
    {
      int oldListQBE = PAN_MOTIVARIFIUT.iUseListQBE;
      PAN_MOTIVARIFIUT.iUseListQBE = 0;
      PAN_MOTIVARIFIUT.PanelCommand(Glb.PCM_SEARCH);
      PAN_MOTIVARIFIUT.PanelCommand(Glb.PCM_FIND);
      PAN_MOTIVARIFIUT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_MOTIVARIFIUT) PAN_MOTIVARIFIUT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MOTIVARIFIUT) PAN_MOTIVARIFIUT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MOTIVARIFIUT) PAN_MOTIVARIFIUT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_MOTIVARIFIUT) PAN_MOTIVARIFIUT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MOTIVARIFIUT) PAN_MOTIVARIFIUT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
