// **********************************************
// Verifica I V A Sospesi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VerificaIVASospesi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VERIFICAIVA_SUDDIPERBOLL = 0;
  private static int PFL_VERIFICAIVA_STAMPIVAINDE = 1;
  private static int PFL_VERIFICAIVA_ELABORA = 2;

  private static int PPQRY_NEWTABLE40 = 0;


  IDPanel PAN_VERIFICAIVA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE44(IMDB);
    //
    //
    Init_PQRY_NEWTABLE40(IMDB);
    Init_PQRY_NEWTABLE40_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE44(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_NEWTABLE44, 5);
    IMDB.set_TblCode(IMDBDef2.TBL_NEWTABLE44, "TBL_NEWTABLE44");
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE44,IMDBDef2.FLD_NEWTABLE44_ROWNAMSUPEBO, "ROWNAMSUPEBO");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE44,IMDBDef2.FLD_NEWTABLE44_ROWNAMSUPEBO,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE44,IMDBDef2.FLD_NEWTABLE44_ROWNASTIVAIN, "ROWNASTIVAIN");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE44,IMDBDef2.FLD_NEWTABLE44_ROWNASTIVAIN,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE44,IMDBDef2.FLD_NEWTABLE44_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE44,IMDBDef2.FLD_NEWTABLE44_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE44,IMDBDef2.FLD_NEWTABLE44_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE44,IMDBDef2.FLD_NEWTABLE44_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE44,IMDBDef2.FLD_NEWTABLE44_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE44,IMDBDef2.FLD_NEWTABLE44_ROWNAMEANNO,1,4,0);
    IMDB.TblAddNew(IMDBDef2.TBL_NEWTABLE44, 0);
  }

  private static void Init_PQRY_NEWTABLE40(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_NEWTABLE40, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_NEWTABLE40, "PQRY_NEWTABLE40");
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE40,IMDBDef10.PQSL_NEWTABLE40_ROWNAMSUPEBO, "ROWNAMSUPEBO");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE40,IMDBDef10.PQSL_NEWTABLE40_ROWNAMSUPEBO,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE40,IMDBDef10.PQSL_NEWTABLE40_ROWNASTIVAIN, "ROWNASTIVAIN");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE40,IMDBDef10.PQSL_NEWTABLE40_ROWNASTIVAIN,1,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_NEWTABLE40, 0);
  }

  private static void Init_PQRY_NEWTABLE40_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_NEWTABLE40_RS, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_NEWTABLE40_RS, "PQRY_NEWTABLE40_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE40_RS,IMDBDef10.PQSL_NEWTABLE40_ROWNAMSUPEBO, "ROWNAMSUPEBO");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE40_RS,IMDBDef10.PQSL_NEWTABLE40_ROWNAMSUPEBO,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE40_RS,IMDBDef10.PQSL_NEWTABLE40_ROWNASTIVAIN, "ROWNASTIVAIN");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE40_RS,IMDBDef10.PQSL_NEWTABLE40_ROWNASTIVAIN,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VerificaIVASospesi(MyWebEntryPoint w, IMDBObj imdb)
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
  public VerificaIVASospesi()
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
    FormIdx = MyGlb.FRM_VERIFIVASOSP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A782D980-DD35-47F4-9C78-B81161A5BA77";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 320;
    DesignHeight = 142;
    set_Caption(new IDVariant("Verifica I V A Sospesi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 320;
    Frames[1].Height = 116;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Verifica I V A";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 116;
    PAN_VERIFICAIVA = new IDPanel(w, this, 1, "PAN_VERIFICAIVA");
    Frames[1].Content = PAN_VERIFICAIVA;
    PAN_VERIFICAIVA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VERIFICAIVA.VS = MainFrm.VisualStyleList;
    PAN_VERIFICAIVA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 320-MyGlb.PAN_OFFS_X, 116-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VERIFICAIVA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "19F8546E-BC4B-4852-944D-A0040E48A538");
    PAN_VERIFICAIVA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 88, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFICAIVA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VERIFICAIVA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VERIFICAIVA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VERIFICAIVA.InitStatus = 2;
    PAN_VERIFICAIVA_Init();
    PAN_VERIFICAIVA_InitFields();
    PAN_VERIFICAIVA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_NEWTABLE44, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VERIFIVASOSP_NEWTABLE40();
      }
      PAN_VERIFICAIVA.UpdatePanel(MainFrm);
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
    return (obj instanceof VerificaIVASospesi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VerificaIVASospesi.class.getName() : (Glb.ClassWithPackage(VerificaIVASospesi.class) ? VerificaIVASospesi.class.getName().substring(VerificaIVASospesi.class.getPackage().getName().length() + 1) : VerificaIVASospesi.class.getName()));
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
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAP2 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Verifica I.V.A. (Sospesi)", IDVariant.STRING));
      v_CAP2 = (new IDVariant("Stampa I.V.A. Indeducibile", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAP));
      PAN_VERIFICAIVA.set_Header(Glb.OBJ_FIELD,PFL_VERIFICAIVA_STAMPIVAINDE, new IDVariant(v_CAP2).stringValue());
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE44, IMDBDef2.FLD_NEWTABLE44_ROWNAMSUPEBO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE44, IMDBDef2.FLD_NEWTABLE44_ROWNASTIVAIN, 0, (new IDVariant(1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaIVASospesi", "LoadEvent", _e);
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
      if (Checkfatpri().equals((new IDVariant(1)), true))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Per il periodo di elaborazione sono presenti documenti nel Registro Debitori non Codificati che non sono ancora stati Contabilizzati: il Registro Riepilogativo non può essere stampato.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Verifica_IVA_sospesi"));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_ANNO")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_NEWTABLE44, IMDBDef2.FLD_NEWTABLE44_ROWNAMEANNO, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_GRUPPO")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_NEWTABLE40, IMDBDef10.PQSL_NEWTABLE40_ROWNAMSUPEBO, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_IVA_INDED")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_NEWTABLE40, IMDBDef10.PQSL_NEWTABLE40_ROWNASTIVAIN, 0)));
        MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaIVASospesi", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Checkfatpri
  // **********************************************************************
  public IDVariant Checkfatpri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CHECK = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Checkfatpri Body
      // Procedure Body
      // 
      v_CHECK = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  1 as UNO ");
      SQL.append("from ");
      SQL.append("  T04 A, ");
      SQL.append("  FATPRI B ");
      SQL.append("where (A.TIPO_REGISTRO = B.TIPO_REGISTRO) ");
      SQL.append("and   (A.TIPO_BOLLATO = B.TIPO_BOLLATO) ");
      SQL.append("and   ((A.RIMBORSI IS NULL)) ");
      SQL.append("and   ((B.DATA_DOC BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_NEWTABLE44, IMDBDef2.FLD_NEWTABLE44_ROWNAMEDATDA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_NEWTABLE44, IMDBDef2.FLD_NEWTABLE44_ROWNAMEDATAA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   ((B.ANNO_PROG IS NULL)) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CHECK = QV.Get("UNO", IDVariant.INTEGER) ;
      }
      QV.Close();
      return v_CHECK;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaIVASospesi", "Checkfatpri", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void VERIFIVASOSP_NEWTABLE40() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_NEWTABLE40_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_NEWTABLE44, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_NEWTABLE44, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_NEWTABLE40_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_NEWTABLE40_RS, 0, IMDBDef2.TBL_NEWTABLE44, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE40_RS, 0, 0, IMDBDef2.TBL_NEWTABLE44, IMDBDef2.FLD_NEWTABLE44_ROWNAMSUPEBO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE40_RS, 1, 0, IMDBDef2.TBL_NEWTABLE44, IMDBDef2.FLD_NEWTABLE44_ROWNASTIVAIN, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_NEWTABLE44, 0);
      if (IMDB.Eof(IMDBDef2.TBL_NEWTABLE44, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_NEWTABLE44, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_NEWTABLE40_RS, 0);
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
  private void PAN_VERIFICAIVA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VERIFICAIVA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VERIFICAIVA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VERIFICAIVA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VERIFICAIVA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_VERIFICAIVA);
    // Stub
  }

  private void PAN_VERIFICAIVA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VERIFICAIVA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_VERIFICAIVA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VERIFICAIVA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VERIFICAIVA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VERIFICAIVA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VERIFICAIVA_Init()
  {

    PAN_VERIFICAIVA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VERIFICAIVA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VERIFICAIVA.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_VERIFICAIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_SUDDIPERBOLL, "1F45F78C-DA08-465F-A9F7-C5A23C3C9307");
    PAN_VERIFICAIVA.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_SUDDIPERBOLL, "Suddivisione Per Bollato");
    PAN_VERIFICAIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_SUDDIPERBOLL, "");
    PAN_VERIFICAIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_SUDDIPERBOLL, MyGlb.VIS_CHECKSTYLE);
    PAN_VERIFICAIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_SUDDIPERBOLL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFICAIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_STAMPIVAINDE, "A116A8E5-40A6-4487-9685-F41D1DC9F6B0");
    PAN_VERIFICAIVA.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_STAMPIVAINDE, "Stampa I.V.A. Indeducibile");
    PAN_VERIFICAIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_STAMPIVAINDE, "");
    PAN_VERIFICAIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_STAMPIVAINDE, MyGlb.VIS_CHECKSTYLE);
    PAN_VERIFICAIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_STAMPIVAINDE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VERIFICAIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_ELABORA, "BB4456CE-8190-4181-8658-BE97EC22D9FF");
    PAN_VERIFICAIVA.set_Header(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_ELABORA, "Elabora");
    PAN_VERIFICAIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_VERIFICAIVA.SetImage(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_ELABORA, 0, "button1.gif", false);
    PAN_VERIFICAIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_VERIFICAIVA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VERIFICAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_SUDDIPERBOLL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFICAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_SUDDIPERBOLL, MyGlb.PANEL_LIST, 124);
    PAN_VERIFICAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_SUDDIPERBOLL, MyGlb.PANEL_LIST, 1);
    PAN_VERIFICAIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_SUDDIPERBOLL, MyGlb.PANEL_LIST, "Sdd. Pr. Bll.");
    PAN_VERIFICAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_SUDDIPERBOLL, MyGlb.PANEL_FORM, 12, 4, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFICAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_SUDDIPERBOLL, MyGlb.PANEL_FORM, 172);
    PAN_VERIFICAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_SUDDIPERBOLL, MyGlb.PANEL_FORM, 1);
    PAN_VERIFICAIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_SUDDIPERBOLL, MyGlb.PANEL_FORM, "Suddivisione Per Bollato");
    PAN_VERIFICAIVA.SetFieldPage(PFL_VERIFICAIVA_SUDDIPERBOLL, -1, -1);
    PAN_VERIFICAIVA.SetFieldPanel(PFL_VERIFICAIVA_SUDDIPERBOLL, PPQRY_NEWTABLE40, "A.ROWNAMSUPEBO", "ROWNAMSUPEBO", 5, 2, 0, -13997);
    PAN_VERIFICAIVA.SetValueListItem(PFL_VERIFICAIVA_SUDDIPERBOLL, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_VERIFICAIVA.SetValueListItem(PFL_VERIFICAIVA_SUDDIPERBOLL, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_VERIFICAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_STAMPIVAINDE, MyGlb.PANEL_LIST, 40, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFICAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_STAMPIVAINDE, MyGlb.PANEL_LIST, 132);
    PAN_VERIFICAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_STAMPIVAINDE, MyGlb.PANEL_LIST, 1);
    PAN_VERIFICAIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_STAMPIVAINDE, MyGlb.PANEL_LIST, "St. I V A Ind.");
    PAN_VERIFICAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_STAMPIVAINDE, MyGlb.PANEL_FORM, 4, 28, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFICAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_STAMPIVAINDE, MyGlb.PANEL_FORM, 180);
    PAN_VERIFICAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_STAMPIVAINDE, MyGlb.PANEL_FORM, 1);
    PAN_VERIFICAIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_STAMPIVAINDE, MyGlb.PANEL_FORM, "Stampa I.V.A. Indeducibile");
    PAN_VERIFICAIVA.SetFieldPage(PFL_VERIFICAIVA_STAMPIVAINDE, -1, -1);
    PAN_VERIFICAIVA.SetFieldPanel(PFL_VERIFICAIVA_STAMPIVAINDE, PPQRY_NEWTABLE40, "A.ROWNASTIVAIN", "ROWNASTIVAIN", 1, 1, 0, -13997);
    PAN_VERIFICAIVA.SetValueListItem(PFL_VERIFICAIVA_STAMPIVAINDE, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_VERIFICAIVA.SetValueListItem(PFL_VERIFICAIVA_STAMPIVAINDE, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_VERIFICAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_ELABORA, MyGlb.PANEL_LIST, 92, 56, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFICAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_VERIFICAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_VERIFICAIVA.SetRect(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_ELABORA, MyGlb.PANEL_FORM, 128, 68, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VERIFICAIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_VERIFICAIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VERIFICAIVA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_VERIFICAIVA.SetFieldPage(PFL_VERIFICAIVA_ELABORA, -1, -1);
    PAN_VERIFICAIVA.SetFieldPanel(PFL_VERIFICAIVA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_VERIFICAIVA_InitQueries()
  {
    StringBuffer SQL;

    PAN_VERIFICAIVA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VERIFICAIVA.SetIMDB(IMDB, "PQRY_NEWTABLE40", true);
    PAN_VERIFICAIVA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_VERIFICAIVA.SetQueryIMDB(PPQRY_NEWTABLE40, IMDBDef10.PQRY_NEWTABLE40_RS, IMDBDef2.TBL_NEWTABLE44);
    JustLoaded = true;
    PAN_VERIFICAIVA.SetFieldPrimaryIndex(PFL_VERIFICAIVA_SUDDIPERBOLL, IMDBDef2.FLD_NEWTABLE44_ROWNAMSUPEBO);
    PAN_VERIFICAIVA.SetFieldPrimaryIndex(PFL_VERIFICAIVA_STAMPIVAINDE, IMDBDef2.FLD_NEWTABLE44_ROWNASTIVAIN);
    PAN_VERIFICAIVA.SetMasterTable(0, "NEWTABLE44");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VERIFICAIVA.Status() == 2)
    {
      int oldListQBE = PAN_VERIFICAIVA.iUseListQBE;
      PAN_VERIFICAIVA.iUseListQBE = 0;
      PAN_VERIFICAIVA.PanelCommand(Glb.PCM_SEARCH);
      PAN_VERIFICAIVA.PanelCommand(Glb.PCM_FIND);
      PAN_VERIFICAIVA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VERIFICAIVA) PAN_VERIFICAIVA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VERIFICAIVA) PAN_VERIFICAIVA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VERIFICAIVA) PAN_VERIFICAIVA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VERIFICAIVA) PAN_VERIFICAIVA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VERIFICAIVA) PAN_VERIFICAIVA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
