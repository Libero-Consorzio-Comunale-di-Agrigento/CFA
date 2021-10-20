// **********************************************
// Duplica Gruppo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DuplicaGruppo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_NUOVOGRUPPO = 0;

  private static int PFL_PARAM_ETICHETTESTO = 0;
  private static int PFL_PARAM_NEWGRUPPO = 1;
  private static int PFL_PARAM_NEWDESCRIZIO = 2;
  private static int PFL_PARAM_ETICHEELABOR = 3;

  private static int PPQRY_PARAM160 = 0;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM170(IMDB);
    //
    //
    Init_PQRY_PARAM160(IMDB);
    Init_PQRY_PARAM160_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM170(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAM170, 5);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAM170, "TBL_PARAM170");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAM170,IMDBDef5.FLD_PARAM170_NOMOGGLIQORD, "NOMOGGLIQORD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAM170,IMDBDef5.FLD_PARAM170_NOMOGGLIQORD,5,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAM170,IMDBDef5.FLD_PARAM170_NOMOGGOLDGRU, "NOMOGGOLDGRU");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAM170,IMDBDef5.FLD_PARAM170_NOMOGGOLDGRU,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAM170,IMDBDef5.FLD_PARAM170_NOMOGGOLDDES, "NOMOGGOLDDES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAM170,IMDBDef5.FLD_PARAM170_NOMOGGOLDDES,5,250,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAM170,IMDBDef5.FLD_PARAM170_NOMOGGNEWGRU, "NOMOGGNEWGRU");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAM170,IMDBDef5.FLD_PARAM170_NOMOGGNEWGRU,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAM170,IMDBDef5.FLD_PARAM170_NOMOGGNEWDES, "NOMOGGNEWDES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAM170,IMDBDef5.FLD_PARAM170_NOMOGGNEWDES,5,250,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAM170, 0);
  }

  private static void Init_PQRY_PARAM160(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAM160, 2);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAM160, "PQRY_PARAM160");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAM160,IMDBDef14.PQSL_PARAM160_NOMOGGNEWGRU, "NOMOGGNEWGRU");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAM160,IMDBDef14.PQSL_PARAM160_NOMOGGNEWGRU,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAM160,IMDBDef14.PQSL_PARAM160_NOMOGGNEWDES, "NOMOGGNEWDES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAM160,IMDBDef14.PQSL_PARAM160_NOMOGGNEWDES,5,250,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAM160, 0);
  }

  private static void Init_PQRY_PARAM160_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAM160_RS, 2);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAM160_RS, "PQRY_PARAM160_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAM160_RS,IMDBDef14.PQSL_PARAM160_NOMOGGNEWGRU, "NOMOGGNEWGRU");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAM160_RS,IMDBDef14.PQSL_PARAM160_NOMOGGNEWGRU,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAM160_RS,IMDBDef14.PQSL_PARAM160_NOMOGGNEWDES, "NOMOGGNEWDES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAM160_RS,IMDBDef14.PQSL_PARAM160_NOMOGGNEWDES,5,250,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DuplicaGruppo(MyWebEntryPoint w, IMDBObj imdb)
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
  public DuplicaGruppo()
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
    FormIdx = MyGlb.FRM_DUPLICGRUPPO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "189F947E-C0E9-4D10-9C12-5BA77D57AFF7";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 452;
    DesignHeight = 214;
    set_Caption(new IDVariant("Duplica Gruppo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 452;
    Frames[1].Height = 188;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 188;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 452-MyGlb.PAN_OFFS_X, 188-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A486D0EA-A653-409A-B2CD-DBB337B6A53F");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 460, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 1;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAM170, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DUPLICGRUPPO_PARAM160();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
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
    return (obj instanceof DuplicaGruppo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DuplicaGruppo.class.getName() : (Glb.ClassWithPackage(DuplicaGruppo.class) ? DuplicaGruppo.class.getName().substring(DuplicaGruppo.class.getPackage().getName().length() + 1) : DuplicaGruppo.class.getName()));
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
      PAN_PARAM.set_FieldText(PFL_PARAM_ETICHETTESTO, IDL.Add(IDL.Add(IDL.Add((new IDVariant("Duplica Gruppo: ")), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGOLDGRU, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGOLDDES, 0)).stringValue());
      IDVariant v_CODICEMAX = null;
      v_CODICEMAX = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.CODICE) as MAXT72CODICE ");
      SQL.append("from ");
      SQL.append("  T72 A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODICEMAX = QV.Get("MAXT72CODICE", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGNEWGRU, 0, IDL.Add(v_CODICEMAX, (new IDVariant(1))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DuplicaGruppo", "Load", _e);
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
      MainFrm.ErrObj.ProcError ("DuplicaGruppo", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGLIQORD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGOLDGRU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGOLDDES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGNEWGRU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGNEWDES, 0, new IDVariant());
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
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAM160, IMDBDef14.PQSL_PARAM160_NOMOGGNEWGRU, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAM160, IMDBDef14.PQSL_PARAM160_NOMOGGNEWDES, 0)))
      {
        MainFrm.set_AlertMessage((new IDVariant("Specificare Codice e Descrizione del nuovo gruppo"))); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.DUPLICAGRUPPO(IMDB.Value(IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGOLDGRU, 0), IMDB.Value(IMDBDef14.PQRY_PARAM160, IMDBDef14.PQSL_PARAM160_NOMOGGNEWGRU, 0), IMDB.Value(IMDBDef14.PQRY_PARAM160, IMDBDef14.PQSL_PARAM160_NOMOGGNEWDES, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGLIQORD, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Elaborazione eseguita.")), IDL.CHR((new IDVariant(10)))), IDL.CHR((new IDVariant(13)))), (new IDVariant("Generato il gruppo: "))), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAM160, IMDBDef14.PQSL_PARAM160_NOMOGGNEWGRU, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef14.PQRY_PARAM160, IMDBDef14.PQSL_PARAM160_NOMOGGNEWDES, 0))); 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DuplicaGruppo", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void DUPLICGRUPPO_PARAM160() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAM160_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAM170, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAM170, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAM160_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAM160_RS, 0, IMDBDef5.TBL_PARAM170, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAM160_RS, 0, 0, IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGNEWGRU, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAM160_RS, 1, 0, IMDBDef5.TBL_PARAM170, IMDBDef5.FLD_PARAM170_NOMOGGNEWDES, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAM170, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAM170, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAM170, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAM160_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_NUOVOGRUPPO, "AD320DA8-813E-46FE-BFF2-CAB31AA772E3");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_NUOVOGRUPPO, "Nuovo Gruppo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_NUOVOGRUPPO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_NUOVOGRUPPO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_NUOVOGRUPPO, MyGlb.PANEL_LIST, 0, -9999, 420, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_NUOVOGRUPPO, MyGlb.PANEL_FORM, 16, 39, 388, 49, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_NUOVOGRUPPO, 0, 79);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_NUOVOGRUPPO, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_NUOVOGRUPPO, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_NUOVOGRUPPO, 1, 4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_NUOVOGRUPPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTESTO, "64494819-F93D-4BF1-B56E-845C9A2015B5");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTESTO, "Testo");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTESTO, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTESTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NEWGRUPPO, "B921153F-D2E9-4EDB-9970-6750C92E950D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NEWGRUPPO, "New Gruppo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NEWGRUPPO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NEWGRUPPO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NEWGRUPPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NEWDESCRIZIO, "EAFD2855-509F-40F1-8884-DC3E482252C2");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NEWDESCRIZIO, "New Descrizione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NEWDESCRIZIO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NEWDESCRIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NEWDESCRIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, "52CC07A3-E895-4834-9023-78C39BC004BF");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTESTO, MyGlb.PANEL_LIST, 20, 8, 392, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTESTO, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTESTO, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTESTO, MyGlb.PANEL_FORM, 12, 12, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTESTO, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTESTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHETTESTO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHETTESTO, -1, "", "ETICHETTESTO", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NEWGRUPPO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NEWGRUPPO, MyGlb.PANEL_LIST, 76);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NEWGRUPPO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NEWGRUPPO, MyGlb.PANEL_LIST, "N. Gr.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NEWGRUPPO, MyGlb.PANEL_FORM, 20, 64, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NEWGRUPPO, MyGlb.PANEL_FORM, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NEWGRUPPO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NEWGRUPPO, MyGlb.PANEL_FORM, "New Gruppo");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NEWGRUPPO, -1, GRP_PARAM_NUOVOGRUPPO);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NEWGRUPPO, PPQRY_PARAM160, "A.NOMOGGNEWGRU", "NOMOGGNEWGRU", 1, 2, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NEWDESCRIZIO, MyGlb.PANEL_LIST, 0, 36, 420, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NEWDESCRIZIO, MyGlb.PANEL_LIST, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NEWDESCRIZIO, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NEWDESCRIZIO, MyGlb.PANEL_LIST, "New Descrizione");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NEWDESCRIZIO, MyGlb.PANEL_FORM, 68, 64, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NEWDESCRIZIO, MyGlb.PANEL_FORM, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NEWDESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NEWDESCRIZIO, MyGlb.PANEL_FORM, "New Descrizione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NEWDESCRIZIO, -1, GRP_PARAM_NUOVOGRUPPO);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NEWDESCRIZIO, PPQRY_PARAM160, "A.NOMOGGNEWDES", "NOMOGGNEWDES", 5, 250, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 252, 112, 156, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 324, 100, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHEELABOR, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM160", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM160, IMDBDef14.PQRY_PARAM160_RS, IMDBDef5.TBL_PARAM170);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NEWGRUPPO, IMDBDef5.FLD_PARAM170_NOMOGGNEWGRU);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NEWDESCRIZIO, IMDBDef5.FLD_PARAM170_NOMOGGNEWDES);
    PAN_PARAM.SetMasterTable(0, "PARAM170");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
