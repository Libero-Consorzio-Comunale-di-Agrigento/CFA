// **********************************************
// Estrazioni BDAP
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EstrazioniBDAP extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_PROGRESSBDAP = 0;
  private static int PFL_PARAM_ELABORA = 1;

  private static int PPQRY_PARAM182 = 0;

  private static int PPQRY_TIPIBDAP1 = 1;


  IDPanel PAN_PARAM;
  private static int PFL_TIPIBDAP_INFORMAZIONI = 0;
  private static int PFL_TIPIBDAP_TIPOBDAP = 1;

  private static int PPQRY_TIPIBDAP = 0;


  IDPanel PAN_TIPIBDAP;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM183(IMDB);
    //
    //
    Init_PQRY_PARAM182(IMDB);
    Init_PQRY_PARAM182_RS(IMDB);
    Init_PQRY_TIPIBDAP(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM183(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAM183, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAM183, "TBL_PARAM183");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM183,IMDBDef4.FLD_PARAM183_PARAPROGBDAP, "PARAPROGBDAP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM183,IMDBDef4.FLD_PARAM183_PARAPROGBDAP,3,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAM183, 0);
  }

  private static void Init_PQRY_PARAM182(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAM182, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAM182, "PQRY_PARAM182");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM182,IMDBDef13.PQSL_PARAM182_PARAPROGBDAP, "PARAPROGBDAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM182,IMDBDef13.PQSL_PARAM182_PARAPROGBDAP,3,10,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAM182, 0);
  }

  private static void Init_PQRY_PARAM182_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAM182_RS, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAM182_RS, "PQRY_PARAM182_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM182_RS,IMDBDef13.PQSL_PARAM182_PARAPROGBDAP, "PARAPROGBDAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM182_RS,IMDBDef13.PQSL_PARAM182_PARAPROGBDAP,3,10,0);
  }

  private static void Init_PQRY_TIPIBDAP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_TIPIBDAP, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_TIPIBDAP, "PQRY_TIPIBDAP");
    IMDB.set_FldCode(IMDBDef13.PQRY_TIPIBDAP,IMDBDef13.PQSL_TIPIBDAP_TIPIBDAPINFO, "TIPIBDAPINFO");
    IMDB.SetFldParams(IMDBDef13.PQRY_TIPIBDAP,IMDBDef13.PQSL_TIPIBDAP_TIPIBDAPINFO,5,2000,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_TIPIBDAP,IMDBDef13.PQSL_TIPIBDAP_TIPTIPTIPBDA, "TIPTIPTIPBDA");
    IMDB.SetFldParams(IMDBDef13.PQRY_TIPIBDAP,IMDBDef13.PQSL_TIPIBDAP_TIPTIPTIPBDA,5,20,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_TIPIBDAP, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EstrazioniBDAP(MyWebEntryPoint w, IMDBObj imdb)
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
  public EstrazioniBDAP()
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
    FormIdx = MyGlb.FRM_ESTRAZIOBDAP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0B58C9E4-E396-4225-8645-85444D12CA93";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 740;
    DesignHeight = 290;
    set_Caption(new IDVariant("Estrazioni BDAP"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 740;
    Frames[1].Height = 264;
    Frames[1].FormFactor = 0.432432;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 320;
    Frames[2].Height = 264;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 320;
    Frames[2].FixedHeight = 264;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 320-MyGlb.PAN_OFFS_X, 264-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "45C17F65-BDBF-48D6-83E4-20348818F040");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 168, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 420;
    Frames[3].Height = 264;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "TIPI BDAP";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 264;
    PAN_TIPIBDAP = new IDPanel(w, this, 3, "PAN_TIPIBDAP");
    Frames[3].Content = PAN_TIPIBDAP;
    PAN_TIPIBDAP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPIBDAP.VS = MainFrm.VisualStyleList;
    PAN_TIPIBDAP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 420-MyGlb.PAN_OFFS_X, 264-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TIPIBDAP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F61424D7-8C33-4828-8164-CAD42E3E50C1");
    PAN_TIPIBDAP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 108, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPIBDAP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPIBDAP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPIBDAP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPIBDAP.InitStatus = 2;
    PAN_TIPIBDAP_Init();
    PAN_TIPIBDAP_InitFields();
    PAN_TIPIBDAP_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAM183, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESTRAZIOBDAP_PARAM182();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_TIPIBDAP.UpdatePanel(MainFrm);
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
    return (obj instanceof EstrazioniBDAP);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EstrazioniBDAP.class.getName() : (Glb.ClassWithPackage(EstrazioniBDAP.class) ? EstrazioniBDAP.class.getName().substring(EstrazioniBDAP.class.getPackage().getName().length() + 1) : EstrazioniBDAP.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      MainFrm.ErrObj.ProcError ("EstrazioniBDAP", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAM183, IMDBDef4.FLD_PARAM183_PARAPROGBDAP, 0, new IDVariant());
  }

  // **********************************************************************
  // Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C6;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAM182, IMDBDef13.PQSL_PARAM182_PARAPROGBDAP, 0))))
      {
        if (IMDB.Value(IMDBDef13.PQRY_PARAM182, IMDBDef13.PQSL_PARAM182_PARAPROGBDAP, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef13.PQRY_PARAM182, IMDBDef13.PQSL_PARAM182_PARAPROGBDAP, 0).equals((new IDVariant(2)), true))
        {
          IDVariant v_PROGRESSIVO = null;
          v_PROGRESSIVO = (new IDVariant());
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.BDAPLANCIOPROCEDURA(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PARAM182, IMDBDef13.PQSL_PARAM182_PARAPROGBDAP, 0), v_PROGRESSIVO);
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
          else
          {
            IDVariant v_PERCORSO = new IDVariant(0,IDVariant.STRING);
            IDVariant v_NOMEFILEXML = null;
            v_NOMEFILEXML = IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)), IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DATENTCODBDA, 0)), IMDB.Value(IMDBDef13.PQRY_TIPIBDAP, IMDBDef13.PQSL_TIPIBDAP_TIPTIPTIPBDA, 0)), (new IDVariant(".xbrl")));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.FILE_DATI as WOREXPIDFIDA ");
            SQL.append("from ");
            SQL.append("  WORK_EXPORT_ID A ");
            SQL.append("where (A.PROGRESSIVO = " + IDL.CSql(v_PROGRESSIVO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            C6 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!C6.EOF()) C6.MoveNext();
            while (!C6.EOF())
            {
              v_PERCORSO = Glb.SaveBlob(MainFrm,C6.Get("WOREXPIDFIDA"),IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/temp"))),v_NOMEFILEXML);
              C6.MoveNext();
            }
            C6.Close();
            if (v_PERCORSO.compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.AddTempFile(v_PERCORSO.stringValue()); 
              MainFrm.set_RedirectTo(IDL.Add((new IDVariant("temp/")), v_NOMEFILEXML));
              MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
              MainFrm.set_RedirectFeatures((new IDVariant("save"))); 
            }
          }
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Per il Rendiconto utilizzare la funzione Gestione BDAP"));
          MainFrm.set_AlertMessage(v_AVVISO); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrazioniBDAP", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ESTRAZIOBDAP_PARAM182() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAM182_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM183, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAM183, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAM182_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAM182_RS, 0, IMDBDef4.TBL_PARAM183, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM182_RS, 0, 0, IMDBDef4.TBL_PARAM183, IMDBDef4.FLD_PARAM183_PARAPROGBDAP, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAM183, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAM183, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM183, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAM182_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAM_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_TIPIBDAP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TIPIBDAP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPIBDAP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPIBDAP, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPIBDAP_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_TIPIBDAP);
    // Stub
  }

  private void PAN_TIPIBDAP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPIBDAP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TIPIBDAP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPIBDAP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSBDAP, "9B95F8D9-CAFC-4658-9A80-436E3070C6D1");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSBDAP, "Tipo ");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSBDAP, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSBDAP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSBDAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "234F0082-518F-4E27-A652-FCBBE3C42347");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSBDAP, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSBDAP, MyGlb.PANEL_LIST, 68);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSBDAP, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSBDAP, MyGlb.PANEL_LIST, "Tipo ");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSBDAP, MyGlb.PANEL_FORM, 12, 44, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSBDAP, MyGlb.PANEL_FORM, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSBDAP, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRESSBDAP, MyGlb.PANEL_FORM, "Tipo ");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PROGRESSBDAP, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PROGRESSBDAP, PPQRY_PARAM182, "A.PARAPROGBDAP", "PARAPROGBDAP", 3, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 184, 260, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 204, 108, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ELABORA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as TIPIBDAPPROG, ");
    SQL.append("  A.TIPO_BDAP as TIPTIPTIPBDA, ");
    SQL.append("  A.DESCRIZIONE as TIPIBDAPDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_BDAP A ");
    SQL.append("where (A.PROGRESSIVO = ~~PARAPROGBDAP~~) ");
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_PARAM.SetQuery(PPQRY_TIPIBDAP1, 0, SQL, PFL_PARAM_PROGRESSBDAP, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as TIPIBDAPPROG, ");
    SQL.append("  A.TIPO_BDAP as TIPTIPTIPBDA, ");
    SQL.append("  A.DESCRIZIONE as TIPIBDAPDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_BDAP A ");
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_PARAM.SetQuery(PPQRY_TIPIBDAP1, 1, SQL, PFL_PARAM_PROGRESSBDAP, "");
    PAN_PARAM.SetQueryDB(PPQRY_TIPIBDAP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM182", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM182, IMDBDef13.PQRY_PARAM182_RS, IMDBDef4.TBL_PARAM183);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PROGRESSBDAP, IMDBDef4.FLD_PARAM183_PARAPROGBDAP);
    PAN_PARAM.SetMasterTable(0, "PARAM183");
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

  private void PAN_TIPIBDAP_Init()
  {

    PAN_TIPIBDAP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPIBDAP.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPIBDAP.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_TIPIBDAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_INFORMAZIONI, "45745C92-14C1-4E0C-92CA-53C7E3D1449E");
    PAN_TIPIBDAP.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_INFORMAZIONI, "INFORMAZIONI");
    PAN_TIPIBDAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_INFORMAZIONI, "");
    PAN_TIPIBDAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_INFORMAZIONI, MyGlb.VIS_HTMEDISTNOSF);
    PAN_TIPIBDAP.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_INFORMAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TIPIBDAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_TIPOBDAP, "CD2B1922-41CE-4D46-AA4F-E68403A7DF3E");
    PAN_TIPIBDAP.set_Header(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_TIPOBDAP, "TIPO BDAP");
    PAN_TIPIBDAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_TIPOBDAP, "");
    PAN_TIPIBDAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_TIPOBDAP, MyGlb.VIS_NONNULLAFIEL);
    PAN_TIPIBDAP.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_TIPOBDAP, 0, -1);
  }

  private void PAN_TIPIBDAP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPIBDAP.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_INFORMAZIONI, MyGlb.PANEL_LIST, 104, 236, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_TIPIBDAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_INFORMAZIONI, MyGlb.PANEL_LIST, 96);
    PAN_TIPIBDAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_INFORMAZIONI, MyGlb.PANEL_LIST, 3);
    PAN_TIPIBDAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_INFORMAZIONI, MyGlb.PANEL_LIST, "INFORMAZIONI");
    PAN_TIPIBDAP.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_INFORMAZIONI, MyGlb.PANEL_FORM, 12, 16, 400, 232, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPIBDAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_INFORMAZIONI, MyGlb.PANEL_FORM, 96);
    PAN_TIPIBDAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_INFORMAZIONI, MyGlb.PANEL_FORM, 17);
    PAN_TIPIBDAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_INFORMAZIONI, MyGlb.PANEL_FORM, "INFORMAZIONI");
    PAN_TIPIBDAP.SetFieldPage(PFL_TIPIBDAP_INFORMAZIONI, -1, -1);
    PAN_TIPIBDAP.SetFieldPanel(PFL_TIPIBDAP_INFORMAZIONI, PPQRY_TIPIBDAP, "A.INFORMAZIONI", "TIPIBDAPINFO", 5, 2000, 0, -13997);
    PAN_TIPIBDAP.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_TIPOBDAP, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBDAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_TIPOBDAP, MyGlb.PANEL_LIST, 68);
    PAN_TIPIBDAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_TIPOBDAP, MyGlb.PANEL_LIST, 1);
    PAN_TIPIBDAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_TIPOBDAP, MyGlb.PANEL_LIST, "TIPO BDAP");
    PAN_TIPIBDAP.SetRect(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_TIPOBDAP, MyGlb.PANEL_FORM, 4, 252, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPIBDAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_TIPOBDAP, MyGlb.PANEL_FORM, 68);
    PAN_TIPIBDAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_TIPOBDAP, MyGlb.PANEL_FORM, 1);
    PAN_TIPIBDAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPIBDAP_TIPOBDAP, MyGlb.PANEL_FORM, "TIPO BDAP");
    PAN_TIPIBDAP.SetFieldPage(PFL_TIPIBDAP_TIPOBDAP, -1, -1);
    PAN_TIPIBDAP.SetFieldPanel(PFL_TIPIBDAP_TIPOBDAP, PPQRY_TIPIBDAP, "A.TIPO_BDAP", "TIPTIPTIPBDA", 5, 20, 0, -13997);
  }

  private void PAN_TIPIBDAP_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPIBDAP.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TIPIBDAP.SetIMDB(IMDB, "PQRY_TIPIBDAP", true);
    PAN_TIPIBDAP.set_SetString(MyGlb.MASTER_ROWNAME, "TIPI BDAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.INFORMAZIONI as TIPIBDAPINFO, ");
    SQL.append("  A.TIPO_BDAP as TIPTIPTIPBDA ");
    PAN_TIPIBDAP.SetQuery(PPQRY_TIPIBDAP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  TIPI_BDAP A ");
    PAN_TIPIBDAP.SetQuery(PPQRY_TIPIBDAP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO = ~~PQRY_PARAM182.PARAPROGBDAP~~) ");
    PAN_TIPIBDAP.SetQuery(PPQRY_TIPIBDAP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIBDAP.SetQuery(PPQRY_TIPIBDAP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIBDAP.SetQuery(PPQRY_TIPIBDAP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPIBDAP.SetQuery(PPQRY_TIPIBDAP, 5, SQL, -1, "");
    PAN_TIPIBDAP.SetQueryDB(PPQRY_TIPIBDAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPIBDAP.SetMasterTable(0, "TIPI_BDAP");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPIBDAP.Status() == 2)
    {
      int oldListQBE = PAN_TIPIBDAP.iUseListQBE;
      PAN_TIPIBDAP.iUseListQBE = 0;
      PAN_TIPIBDAP.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPIBDAP.PanelCommand(Glb.PCM_FIND);
      PAN_TIPIBDAP.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_TIPIBDAP) PAN_TIPIBDAP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_TIPIBDAP) PAN_TIPIBDAP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_TIPIBDAP) PAN_TIPIBDAP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_TIPIBDAP) PAN_TIPIBDAP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TIPIBDAP) PAN_TIPIBDAP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
