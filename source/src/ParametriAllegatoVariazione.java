// **********************************************
// Parametri Allegato Variazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ParametriAllegatoVariazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAALLEVARI_NOTE1 = 0;
  private static int PFL_PARAALLEVARI_SUDPERTIPVAR = 1;
  private static int PFL_PARAALLEVARI_TOTALPERTITO = 2;
  private static int PFL_PARAALLEVARI_ELABORA = 3;

  private static int PPQRY_PARS12 = 0;


  IDPanel PAN_PARAALLEVARI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS15(IMDB);
    Init_TBL_IN10(IMDB);
    //
    //
    Init_PQRY_PARS12(IMDB);
    Init_PQRY_PARS12_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS15(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS15, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS15, "TBL_PARS15");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS15,IMDBDef4.FLD_PARS15_ROWNAMENOTE, "ROWNAMENOTE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS15,IMDBDef4.FLD_PARS15_ROWNAMENOTE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS15,IMDBDef4.FLD_PARS15_RONASUPETIVA, "RONASUPETIVA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS15,IMDBDef4.FLD_PARS15_RONASUPETIVA,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS15,IMDBDef4.FLD_PARS15_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS15,IMDBDef4.FLD_PARS15_ROWNAMTOPETI,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS15, 0);
  }

  private static void Init_TBL_IN10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_IN10, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_IN10, "TBL_IN10");
    IMDB.set_FldCode(IMDBDef4.TBL_IN10,IMDBDef4.FLD_IN10_ROWNAMEVARID, "ROWNAMEVARID");
    IMDB.SetFldParams(IMDBDef4.TBL_IN10,IMDBDef4.FLD_IN10_ROWNAMEVARID,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_IN10, 0);
  }

  private static void Init_PQRY_PARS12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS12, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS12, "PQRY_PARS12");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS12,IMDBDef12.PQSL_PARS12_ROWNAMENOTE, "ROWNAMENOTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS12,IMDBDef12.PQSL_PARS12_ROWNAMENOTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS12,IMDBDef12.PQSL_PARS12_RONASUPETIVA, "RONASUPETIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS12,IMDBDef12.PQSL_PARS12_RONASUPETIVA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS12,IMDBDef12.PQSL_PARS12_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS12,IMDBDef12.PQSL_PARS12_ROWNAMTOPETI,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARS12, 0);
  }

  private static void Init_PQRY_PARS12_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS12_RS, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS12_RS, "PQRY_PARS12_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS12_RS,IMDBDef12.PQSL_PARS12_ROWNAMENOTE, "ROWNAMENOTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS12_RS,IMDBDef12.PQSL_PARS12_ROWNAMENOTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS12_RS,IMDBDef12.PQSL_PARS12_RONASUPETIVA, "RONASUPETIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS12_RS,IMDBDef12.PQSL_PARS12_RONASUPETIVA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS12_RS,IMDBDef12.PQSL_PARS12_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS12_RS,IMDBDef12.PQSL_PARS12_ROWNAMTOPETI,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ParametriAllegatoVariazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public ParametriAllegatoVariazione()
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
    FormIdx = MyGlb.FRM_PARAALLEVARI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9B92EF47-6B22-4161-857B-1B3EF716A307";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 300;
    DesignHeight = 178;
    set_Caption(new IDVariant("Parametri Allegato Variazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 300;
    Frames[1].Height = 152;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri Allegato Variazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 152;
    PAN_PARAALLEVARI = new IDPanel(w, this, 1, "PAN_PARAALLEVARI");
    Frames[1].Content = PAN_PARAALLEVARI;
    PAN_PARAALLEVARI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAALLEVARI.VS = MainFrm.VisualStyleList;
    PAN_PARAALLEVARI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 300-MyGlb.PAN_OFFS_X, 152-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAALLEVARI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3D69C3E2-1E88-475E-9E7E-49FFDF69AE64");
    PAN_PARAALLEVARI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 144, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAALLEVARI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAALLEVARI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAALLEVARI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAALLEVARI.InitStatus = 2;
    PAN_PARAALLEVARI_Init();
    PAN_PARAALLEVARI_InitFields();
    PAN_PARAALLEVARI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARS15, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PARAALLEVARI_PARS12();
      }
      PAN_PARAALLEVARI.UpdatePanel(MainFrm);
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
    return (obj instanceof ParametriAllegatoVariazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ParametriAllegatoVariazione.class.getName() : (Glb.ClassWithPackage(ParametriAllegatoVariazione.class) ? ParametriAllegatoVariazione.class.getName().substring(ParametriAllegatoVariazione.class.getPackage().getName().length() + 1) : ParametriAllegatoVariazione.class.getName()));
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
      IMDB.set_Value(IMDBDef4.TBL_PARS15, IMDBDef4.FLD_PARS15_ROWNAMENOTE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARS15, IMDBDef4.FLD_PARS15_RONASUPETIVA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARS15, IMDBDef4.FLD_PARS15_ROWNAMTOPETI, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriAllegatoVariazione", "LoadEvent", _e);
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
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.POLWORKSAVA(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef4.TBL_IN10, IMDBDef4.FLD_IN10_ROWNAMEVARID, 0), IMDB.Value(IMDBDef12.PQRY_PARS12, IMDBDef12.PQSL_PARS12_ROWNAMENOTE, 0), IMDB.Value(IMDBDef12.PQRY_PARS12, IMDBDef12.PQSL_PARS12_RONASUPETIVA, 0), IMDB.Value(IMDBDef12.PQRY_PARS12, IMDBDef12.PQSL_PARS12_ROWNAMTOPETI, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_NEWTABLE17, IMDBDef4.FLD_NEWTABLE17_ROWNAMENOTE, 0, IMDB.Value(IMDBDef12.PQRY_PARS12, IMDBDef12.PQSL_PARS12_ROWNAMENOTE, 0));
        IMDB.set_Value(IMDBDef4.TBL_NEWTABLE17, IMDBDef4.FLD_NEWTABLE17_RONASUPETIVA, 0, IMDB.Value(IMDBDef12.PQRY_PARS12, IMDBDef12.PQSL_PARS12_RONASUPETIVA, 0));
        IMDB.set_Value(IMDBDef4.TBL_NEWTABLE17, IMDBDef4.FLD_NEWTABLE17_ROWNAMTOPETI, 0, IMDB.Value(IMDBDef12.PQRY_PARS12, IMDBDef12.PQSL_PARS12_ROWNAMTOPETI, 0));
        MainFrm.Show(MyGlb.FRM_REPOALLEVARI, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriAllegatoVariazione", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Primary record source for panel data
  // **********************************************************************
  private void PARAALLEVARI_PARS12() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARS12_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARS15, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARS15, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARS12_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARS12_RS, 0, IMDBDef4.TBL_PARS15, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS12_RS, 0, 0, IMDBDef4.TBL_PARS15, IMDBDef4.FLD_PARS15_ROWNAMENOTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS12_RS, 1, 0, IMDBDef4.TBL_PARS15, IMDBDef4.FLD_PARS15_RONASUPETIVA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS12_RS, 2, 0, IMDBDef4.TBL_PARS15, IMDBDef4.FLD_PARS15_ROWNAMTOPETI, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARS15, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARS15, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARS15, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARS12_RS, 0);
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
  private void PAN_PARAALLEVARI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAALLEVARI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAALLEVARI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAALLEVARI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAALLEVARI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAALLEVARI);
    // Stub
  }

  private void PAN_PARAALLEVARI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAALLEVARI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAALLEVARI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAALLEVARI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAALLEVARI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAALLEVARI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAALLEVARI_Init()
  {

    PAN_PARAALLEVARI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAALLEVARI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAALLEVARI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAALLEVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_NOTE1, "ECD11055-C348-4D71-A7DC-D71B42A27B20");
    PAN_PARAALLEVARI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_NOTE1, "Note");
    PAN_PARAALLEVARI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_NOTE1, "");
    PAN_PARAALLEVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_NOTE1, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAALLEVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_NOTE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAALLEVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_SUDPERTIPVAR, "1DE04FE6-54DF-4F72-AFB1-81A5C76E2B91");
    PAN_PARAALLEVARI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_SUDPERTIPVAR, "Suddivisione Per Tipo Variazione");
    PAN_PARAALLEVARI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_SUDPERTIPVAR, "");
    PAN_PARAALLEVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_SUDPERTIPVAR, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAALLEVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_SUDPERTIPVAR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAALLEVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_TOTALPERTITO, "6D99A2D5-72B5-48CC-B98C-C516641BB11F");
    PAN_PARAALLEVARI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_TOTALPERTITO, "Totali Per Titolo");
    PAN_PARAALLEVARI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_TOTALPERTITO, "");
    PAN_PARAALLEVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_TOTALPERTITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAALLEVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_TOTALPERTITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAALLEVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_ELABORA, "DABA6572-1E23-4408-A755-1EEA38317974");
    PAN_PARAALLEVARI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_ELABORA, "Elabora");
    PAN_PARAALLEVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAALLEVARI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_ELABORA, 0, "button1.gif", false);
    PAN_PARAALLEVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAALLEVARI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAALLEVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_NOTE1, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAALLEVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_NOTE1, MyGlb.PANEL_LIST, 32);
    PAN_PARAALLEVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_NOTE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAALLEVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_NOTE1, MyGlb.PANEL_LIST, "Note");
    PAN_PARAALLEVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_NOTE1, MyGlb.PANEL_FORM, 188, 12, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAALLEVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_NOTE1, MyGlb.PANEL_FORM, 44);
    PAN_PARAALLEVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_NOTE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAALLEVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_NOTE1, MyGlb.PANEL_FORM, "Note");
    PAN_PARAALLEVARI.SetFieldPage(PFL_PARAALLEVARI_NOTE1, -1, -1);
    PAN_PARAALLEVARI.SetFieldPanel(PFL_PARAALLEVARI_NOTE1, PPQRY_PARS12, "A.ROWNAMENOTE", "ROWNAMENOTE", 5, 2, 0, -13997);
    PAN_PARAALLEVARI.SetValueListItem(PFL_PARAALLEVARI_NOTE1, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAALLEVARI.SetValueListItem(PFL_PARAALLEVARI_NOTE1, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAALLEVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_SUDPERTIPVAR, MyGlb.PANEL_LIST, 48, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAALLEVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_SUDPERTIPVAR, MyGlb.PANEL_LIST, 164);
    PAN_PARAALLEVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_SUDPERTIPVAR, MyGlb.PANEL_LIST, 1);
    PAN_PARAALLEVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_SUDPERTIPVAR, MyGlb.PANEL_LIST, "Sdd. Pr. Tp. Var.");
    PAN_PARAALLEVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_SUDPERTIPVAR, MyGlb.PANEL_FORM, 32, 36, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAALLEVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_SUDPERTIPVAR, MyGlb.PANEL_FORM, 200);
    PAN_PARAALLEVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_SUDPERTIPVAR, MyGlb.PANEL_FORM, 1);
    PAN_PARAALLEVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_SUDPERTIPVAR, MyGlb.PANEL_FORM, "Suddivisione Per Tipo Variazione");
    PAN_PARAALLEVARI.SetFieldPage(PFL_PARAALLEVARI_SUDPERTIPVAR, -1, -1);
    PAN_PARAALLEVARI.SetFieldPanel(PFL_PARAALLEVARI_SUDPERTIPVAR, PPQRY_PARS12, "A.RONASUPETIVA", "RONASUPETIVA", 5, 2, 0, -13997);
    PAN_PARAALLEVARI.SetValueListItem(PFL_PARAALLEVARI_SUDPERTIPVAR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAALLEVARI.SetValueListItem(PFL_PARAALLEVARI_SUDPERTIPVAR, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAALLEVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_TOTALPERTITO, MyGlb.PANEL_LIST, 96, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAALLEVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_TOTALPERTITO, MyGlb.PANEL_LIST, 84);
    PAN_PARAALLEVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_TOTALPERTITO, MyGlb.PANEL_LIST, 1);
    PAN_PARAALLEVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_TOTALPERTITO, MyGlb.PANEL_LIST, "Tot. Per Tit.");
    PAN_PARAALLEVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_TOTALPERTITO, MyGlb.PANEL_FORM, 128, 60, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAALLEVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_TOTALPERTITO, MyGlb.PANEL_FORM, 104);
    PAN_PARAALLEVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_TOTALPERTITO, MyGlb.PANEL_FORM, 1);
    PAN_PARAALLEVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_TOTALPERTITO, MyGlb.PANEL_FORM, "Totali Per Titolo");
    PAN_PARAALLEVARI.SetFieldPage(PFL_PARAALLEVARI_TOTALPERTITO, -1, -1);
    PAN_PARAALLEVARI.SetFieldPanel(PFL_PARAALLEVARI_TOTALPERTITO, PPQRY_PARS12, "A.ROWNAMTOPETI", "ROWNAMTOPETI", 5, 2, 0, -13997);
    PAN_PARAALLEVARI.SetValueListItem(PFL_PARAALLEVARI_TOTALPERTITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAALLEVARI.SetValueListItem(PFL_PARAALLEVARI_TOTALPERTITO, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAALLEVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_ELABORA, MyGlb.PANEL_LIST, 108, 96, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAALLEVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAALLEVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAALLEVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_ELABORA, MyGlb.PANEL_FORM, 176, 96, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAALLEVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAALLEVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAALLEVARI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAALLEVARI.SetFieldPage(PFL_PARAALLEVARI_ELABORA, -1, -1);
    PAN_PARAALLEVARI.SetFieldPanel(PFL_PARAALLEVARI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAALLEVARI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAALLEVARI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAALLEVARI.SetIMDB(IMDB, "PQRY_PARS12", true);
    PAN_PARAALLEVARI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAALLEVARI.SetQueryIMDB(PPQRY_PARS12, IMDBDef12.PQRY_PARS12_RS, IMDBDef4.TBL_PARS15);
    JustLoaded = true;
    PAN_PARAALLEVARI.SetFieldPrimaryIndex(PFL_PARAALLEVARI_NOTE1, IMDBDef4.FLD_PARS15_ROWNAMENOTE);
    PAN_PARAALLEVARI.SetFieldPrimaryIndex(PFL_PARAALLEVARI_SUDPERTIPVAR, IMDBDef4.FLD_PARS15_RONASUPETIVA);
    PAN_PARAALLEVARI.SetFieldPrimaryIndex(PFL_PARAALLEVARI_TOTALPERTITO, IMDBDef4.FLD_PARS15_ROWNAMTOPETI);
    PAN_PARAALLEVARI.SetMasterTable(0, "PARS15");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAALLEVARI.Status() == 2)
    {
      int oldListQBE = PAN_PARAALLEVARI.iUseListQBE;
      PAN_PARAALLEVARI.iUseListQBE = 0;
      PAN_PARAALLEVARI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAALLEVARI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAALLEVARI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAALLEVARI) PAN_PARAALLEVARI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAALLEVARI) PAN_PARAALLEVARI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAALLEVARI) PAN_PARAALLEVARI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAALLEVARI) PAN_PARAALLEVARI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAALLEVARI) PAN_PARAALLEVARI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
