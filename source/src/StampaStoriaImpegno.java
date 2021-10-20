// **********************************************
// Stampa Storia Impegno
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StampaStoriaImpegno extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_STORIAIMPEGN_IMPEGNO = 0;
  private static int PFL_STORIAIMPEGN_ANNOIMPEGNO = 1;
  private static int PFL_STORIAIMPEGN_TIPOSTAMPA = 2;
  private static int PFL_STORIAIMPEGN_DESCRIIMPEGN = 3;
  private static int PFL_STORIAIMPEGN_ETICHEELABOR = 4;
  private static int PFL_STORIAIMPEGN_SCELTAIMP = 5;
  private static int PFL_STORIAIMPEGN_ETICINFOIMP1 = 6;

  private static int PPQRY_NUOVATABELL1 = 0;

  private static int PPQRY_IMP = 1;


  IDPanel PAN_STORIAIMPEGN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NUOVATABELL5(IMDB);
    //
    //
    Init_PQRY_NUOVATABELL1(IMDB);
    Init_PQRY_NUOVATABELL1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NUOVATABELL5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_NUOVATABELL5, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_NUOVATABELL5, "TBL_NUOVATABELL5");
    IMDB.set_FldCode(IMDBDef4.TBL_NUOVATABELL5,IMDBDef4.FLD_NUOVATABELL5_NOMEOGGEIMPE, "NOMEOGGEIMPE");
    IMDB.SetFldParams(IMDBDef4.TBL_NUOVATABELL5,IMDBDef4.FLD_NUOVATABELL5_NOMEOGGEIMPE,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_NUOVATABELL5,IMDBDef4.FLD_NUOVATABELL5_NOMOGGANNIMP, "NOMOGGANNIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_NUOVATABELL5,IMDBDef4.FLD_NUOVATABELL5_NOMOGGANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_NUOVATABELL5,IMDBDef4.FLD_NUOVATABELL5_NOMOGGTIPSTA, "NOMOGGTIPSTA");
    IMDB.SetFldParams(IMDBDef4.TBL_NUOVATABELL5,IMDBDef4.FLD_NUOVATABELL5_NOMOGGTIPSTA,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_NUOVATABELL5, 0);
  }

  private static void Init_PQRY_NUOVATABELL1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_NUOVATABELL1, 3);
    IMDB.set_TblCode(IMDBDef14.PQRY_NUOVATABELL1, "PQRY_NUOVATABELL1");
    IMDB.set_FldCode(IMDBDef14.PQRY_NUOVATABELL1,IMDBDef14.PQSL_NUOVATABELL1_NOMEOGGEIMPE, "NOMEOGGEIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_NUOVATABELL1,IMDBDef14.PQSL_NUOVATABELL1_NOMEOGGEIMPE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_NUOVATABELL1,IMDBDef14.PQSL_NUOVATABELL1_NOMOGGANNIMP, "NOMOGGANNIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_NUOVATABELL1,IMDBDef14.PQSL_NUOVATABELL1_NOMOGGANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_NUOVATABELL1,IMDBDef14.PQSL_NUOVATABELL1_NOMOGGTIPSTA, "NOMOGGTIPSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_NUOVATABELL1,IMDBDef14.PQSL_NUOVATABELL1_NOMOGGTIPSTA,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_NUOVATABELL1, 0);
  }

  private static void Init_PQRY_NUOVATABELL1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_NUOVATABELL1_RS, 3);
    IMDB.set_TblCode(IMDBDef14.PQRY_NUOVATABELL1_RS, "PQRY_NUOVATABELL1_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_NUOVATABELL1_RS,IMDBDef14.PQSL_NUOVATABELL1_NOMEOGGEIMPE, "NOMEOGGEIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_NUOVATABELL1_RS,IMDBDef14.PQSL_NUOVATABELL1_NOMEOGGEIMPE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_NUOVATABELL1_RS,IMDBDef14.PQSL_NUOVATABELL1_NOMOGGANNIMP, "NOMOGGANNIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_NUOVATABELL1_RS,IMDBDef14.PQSL_NUOVATABELL1_NOMOGGANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_NUOVATABELL1_RS,IMDBDef14.PQSL_NUOVATABELL1_NOMOGGTIPSTA, "NOMOGGTIPSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_NUOVATABELL1_RS,IMDBDef14.PQSL_NUOVATABELL1_NOMOGGTIPSTA,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StampaStoriaImpegno(MyWebEntryPoint w, IMDBObj imdb)
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
  public StampaStoriaImpegno()
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
    FormIdx = MyGlb.FRM_STAMSTORIMPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8D93A7B5-3498-46AA-8252-AA9E5C4235B8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 496;
    DesignHeight = 154;
    set_Caption(new IDVariant("Storia Impegno"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 496;
    Frames[1].Height = 128;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Storia Impegno";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 128;
    PAN_STORIAIMPEGN = new IDPanel(w, this, 1, "PAN_STORIAIMPEGN");
    Frames[1].Content = PAN_STORIAIMPEGN;
    PAN_STORIAIMPEGN.Lockable = false;
    PAN_STORIAIMPEGN.iLocked = false;
    PAN_STORIAIMPEGN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STORIAIMPEGN.VS = MainFrm.VisualStyleList;
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 496-MyGlb.PAN_OFFS_X, 128-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_STORIAIMPEGN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E62EDA8C-8860-49E7-B7AD-95DF738D6329");
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 556, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_STORIAIMPEGN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_STORIAIMPEGN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STORIAIMPEGN.InitStatus = 2;
    PAN_STORIAIMPEGN_Init();
    PAN_STORIAIMPEGN_InitFields();
    PAN_STORIAIMPEGN_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_NUOVATABELL5, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STAMSTORIMPE_NUOVATABELL1();
      }
      PAN_STORIAIMPEGN.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_STORIAIMPEGN.FrIndex)
    {
      if (IdxFieldActived ==PFL_STORIAIMPEGN_SCELTAIMP) {
      }
    }
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
    return (obj instanceof StampaStoriaImpegno);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StampaStoriaImpegno.class.getName() : (Glb.ClassWithPackage(StampaStoriaImpegno.class) ? StampaStoriaImpegno.class.getName().substring(StampaStoriaImpegno.class.getPackage().getName().length() + 1) : StampaStoriaImpegno.class.getName()));
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaStoriaImpegno", "Load", _e);
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
      UNLOAD_NUOVTABEDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaStoriaImpegno", "Unload", _e);
    }
  }

  // **********************************************************************
  // Nuova Tabella: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_NUOVTABEDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_NUOVATABELL5, IMDBDef4.FLD_NUOVATABELL5_NOMEOGGEIMPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_NUOVATABELL5, IMDBDef4.FLD_NUOVATABELL5_NOMOGGANNIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_NUOVATABELL5, IMDBDef4.FLD_NUOVATABELL5_NOMOGGTIPSTA, 0, new IDVariant());
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // End Modal Body
      // Corpo Procedura
      // 
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMEOGGEIMPE, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
          IMDB.set_Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMOGGANNIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaStoriaImpegno", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Storia Impegno On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STORIAIMPEGN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_STORIAIMPEGN);
      // 
      // Storia Impegno On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMEOGGEIMPE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMOGGANNIMP, 0))))
      {
        PAN_STORIAIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICINFOIMP1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_STORIAIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICINFOIMP1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_STORIAIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_STORIAIMPEGN_DESCRIIMPEGN,(new IDVariant(PAN_STORIAIMPEGN.FieldText(PFL_STORIAIMPEGN_DESCRIIMPEGN))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaStoriaImpegno", "StoriaImpegnoOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Storia Impegno On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_STORIAIMPEGN_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Storia Impegno On Updating Row Body
      // Corpo Procedura
      // 
      if ((Column.equals((new IDVariant(PFL_STORIAIMPEGN_IMPEGNO)), true) || Column.equals((new IDVariant(PFL_STORIAIMPEGN_ANNOIMPEGNO)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMOGGANNIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMEOGGEIMPE, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  IMP A ");
          SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMOGGANNIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMEOGGEIMPE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Impegno inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMEOGGEIMPE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMOGGANNIMP, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaStoriaImpegno", "StoriaImpegnoOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Etichetta Info Imp
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaInfoImp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Info Imp Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMOGGANNIMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMEOGGEIMPE, 0));
      if (IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMOGGANNIMP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
      }
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaStoriaImpegno", "EtichettaInfoImp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Imp
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaImp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Imp Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaStoriaImpegno", "SceltaImp", _e);
      return -1;
    }
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
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMEOGGEIMPE, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMOGGANNIMP, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Impegno Obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMOGGTIPSTA, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Tipo stampa obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.WORKSTORIAIMP(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMEOGGEIMPE, 0), IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMOGGANNIMP, 0), IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMOGGTIPSTA, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPA = (new IDVariant("Storia_Impegno"));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_NUM_IMP")), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMEOGGEIMPE, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_ANNO_IMP")), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMOGGANNIMP, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPO_STAMPA")), IMDB.Value(IMDBDef14.PQRY_NUOVATABELL1, IMDBDef14.PQSL_NUOVATABELL1_NOMOGGTIPSTA, 0));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaStoriaImpegno", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuova Tabella
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void STAMSTORIMPE_NUOVATABELL1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_NUOVATABELL1_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_NUOVATABELL5, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_NUOVATABELL5, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_NUOVATABELL1_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_NUOVATABELL1_RS, 0, IMDBDef4.TBL_NUOVATABELL5, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_NUOVATABELL1_RS, 0, 0, IMDBDef4.TBL_NUOVATABELL5, IMDBDef4.FLD_NUOVATABELL5_NOMEOGGEIMPE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_NUOVATABELL1_RS, 1, 0, IMDBDef4.TBL_NUOVATABELL5, IMDBDef4.FLD_NUOVATABELL5_NOMOGGANNIMP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_NUOVATABELL1_RS, 2, 0, IMDBDef4.TBL_NUOVATABELL5, IMDBDef4.FLD_NUOVATABELL5_NOMOGGTIPSTA, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_NUOVATABELL5, 0);
      if (IMDB.Eof(IMDBDef4.TBL_NUOVATABELL5, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_NUOVATABELL5, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_NUOVATABELL1_RS, 0);
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
  private void PAN_STORIAIMPEGN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_STORIAIMPEGN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_STORIAIMPEGN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_STORIAIMPEGN, Cancel);
    // Stub
  }

  private void PAN_STORIAIMPEGN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_STORIAIMPEGN_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_STORIAIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_STORIAIMPEGN_SCELTAIMP)
    {
      this.IdxPanelActived = this.PAN_STORIAIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaImp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_STORIAIMPEGN_ETICINFOIMP1)
    {
      this.IdxPanelActived = this.PAN_STORIAIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaInfoImp();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_STORIAIMPEGN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_STORIAIMPEGN_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_STORIAIMPEGN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_STORIAIMPEGN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_STORIAIMPEGN_Init()
  {

    PAN_STORIAIMPEGN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STORIAIMPEGN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_STORIAIMPEGN.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_STORIAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_IMPEGNO, "8DB5E6A9-6A23-4CAD-A414-45D24AD57B3A");
    PAN_STORIAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_IMPEGNO, "Impegno");
    PAN_STORIAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_IMPEGNO, "");
    PAN_STORIAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_IMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_STORIAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STORIAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ANNOIMPEGNO, "D028EE26-C930-4D8A-B177-CC608F7D880B");
    PAN_STORIAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ANNOIMPEGNO, "/");
    PAN_STORIAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ANNOIMPEGNO, "");
    PAN_STORIAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ANNOIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_STORIAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ANNOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STORIAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_TIPOSTAMPA, "DA65DC98-2FAB-47DE-ACE8-D54F6FCBBAA6");
    PAN_STORIAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_TIPOSTAMPA, "Tipo Stampa");
    PAN_STORIAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_TIPOSTAMPA, "");
    PAN_STORIAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_TIPOSTAMPA, MyGlb.VIS_OPTIONBUTTON);
    PAN_STORIAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_TIPOSTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORIAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_DESCRIIMPEGN, "67F2B95F-C709-4CB5-BDE4-EAF2372796B0");
    PAN_STORIAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_DESCRIIMPEGN, "Descrizione Impegno");
    PAN_STORIAIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_DESCRIIMPEGN, "");
    PAN_STORIAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_DESCRIIMPEGN, MyGlb.VIS_VISULOOUPCF4);
    PAN_STORIAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_DESCRIIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_STORIAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICHEELABOR, "403E2EA9-E582-47D5-AAA8-168D782055AD");
    PAN_STORIAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICHEELABOR, "Elabora");
    PAN_STORIAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_STORIAIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICHEELABOR, 0, "button1.gif", false);
    PAN_STORIAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_STORIAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_SCELTAIMP, "1FDB52A5-11A7-48DD-B06C-8386811BE193");
    PAN_STORIAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_SCELTAIMP, "");
    PAN_STORIAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_SCELTAIMP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_STORIAIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_SCELTAIMP, 0, "wsearch1.gif", false);
    PAN_STORIAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_SCELTAIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_STORIAIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICINFOIMP1, "FF91C13C-BD64-4234-A96B-F44BEE5E09CD");
    PAN_STORIAIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICINFOIMP1, "");
    PAN_STORIAIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICINFOIMP1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_STORIAIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICINFOIMP1, 0, "info.gif", false);
    PAN_STORIAIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICINFOIMP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_STORIAIMPEGN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 60);
    PAN_STORIAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_STORIAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 4, 20, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 104);
    PAN_STORIAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_STORIAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_IMPEGNO, MyGlb.PANEL_FORM, "Impegno");
    PAN_STORIAIMPEGN.SetFieldPage(PFL_STORIAIMPEGN_IMPEGNO, -1, -1);
    PAN_STORIAIMPEGN.SetFieldPanel(PFL_STORIAIMPEGN_IMPEGNO, PPQRY_NUOVATABELL1, "A.NOMEOGGEIMPE", "NOMEOGGEIMPE", 1, 5, 0, -13997);
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_LIST, 92);
    PAN_STORIAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_STORIAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_LIST, "/");
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_FORM, 148, 20, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_FORM, 16);
    PAN_STORIAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_STORIAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ANNOIMPEGNO, MyGlb.PANEL_FORM, "/");
    PAN_STORIAIMPEGN.SetFieldPage(PFL_STORIAIMPEGN_ANNOIMPEGNO, -1, -1);
    PAN_STORIAIMPEGN.SetFieldPanel(PFL_STORIAIMPEGN_ANNOIMPEGNO, PPQRY_NUOVATABELL1, "A.NOMOGGANNIMP", "NOMOGGANNIMP", 1, 4, 0, -13997);
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_TIPOSTAMPA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_TIPOSTAMPA, MyGlb.PANEL_LIST, 80);
    PAN_STORIAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_STORIAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_TIPOSTAMPA, MyGlb.PANEL_LIST, "Tipo Stampa");
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_TIPOSTAMPA, MyGlb.PANEL_FORM, 4, 44, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_TIPOSTAMPA, MyGlb.PANEL_FORM, 104);
    PAN_STORIAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_STORIAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_TIPOSTAMPA, MyGlb.PANEL_FORM, "Tipo Stampa");
    PAN_STORIAIMPEGN.SetFieldPage(PFL_STORIAIMPEGN_TIPOSTAMPA, -1, -1);
    PAN_STORIAIMPEGN.SetFieldPanel(PFL_STORIAIMPEGN_TIPOSTAMPA, PPQRY_NUOVATABELL1, "A.NOMOGGTIPSTA", "NOMOGGTIPSTA", 5, 2, 0, -13997);
    PAN_STORIAIMPEGN.SetValueListItem(PFL_STORIAIMPEGN_TIPOSTAMPA, (new IDVariant("D")), "Dettaglio", "", "", -1);
    PAN_STORIAIMPEGN.SetValueListItem(PFL_STORIAIMPEGN_TIPOSTAMPA, (new IDVariant("T")), "Solo Totali", "", "", -1);
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_DESCRIIMPEGN, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_DESCRIIMPEGN, MyGlb.PANEL_LIST, 108);
    PAN_STORIAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_DESCRIIMPEGN, MyGlb.PANEL_LIST, 2);
    PAN_STORIAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_DESCRIIMPEGN, MyGlb.PANEL_LIST, "Descrizione Impegno");
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_DESCRIIMPEGN, MyGlb.PANEL_FORM, 208, 20, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_DESCRIIMPEGN, MyGlb.PANEL_FORM, 108);
    PAN_STORIAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_DESCRIIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_STORIAIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_DESCRIIMPEGN, MyGlb.PANEL_FORM, "Descr. Impegno");
    PAN_STORIAIMPEGN.SetFieldPage(PFL_STORIAIMPEGN_DESCRIIMPEGN, -1, -1);
    PAN_STORIAIMPEGN.SetFieldPanel(PFL_STORIAIMPEGN_DESCRIIMPEGN, PPQRY_IMP, "A.DESCRIZIONE", "IMPDESCRIZIO", 5, 140, 0, -13997);
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICHEELABOR, MyGlb.PANEL_LIST, 340, 76, 88, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_STORIAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICHEELABOR, MyGlb.PANEL_FORM, 356, 76, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_STORIAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_STORIAIMPEGN.SetFieldPage(PFL_STORIAIMPEGN_ETICHEELABOR, -1, -1);
    PAN_STORIAIMPEGN.SetFieldPanel(PFL_STORIAIMPEGN_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_SCELTAIMP, MyGlb.PANEL_LIST, 440, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_SCELTAIMP, MyGlb.PANEL_LIST, 0);
    PAN_STORIAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_SCELTAIMP, MyGlb.PANEL_LIST, 1);
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_SCELTAIMP, MyGlb.PANEL_FORM, 440, 24, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_SCELTAIMP, MyGlb.PANEL_FORM, 0);
    PAN_STORIAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_SCELTAIMP, MyGlb.PANEL_FORM, 1);
    PAN_STORIAIMPEGN.SetFieldPage(PFL_STORIAIMPEGN_SCELTAIMP, -1, -1);
    PAN_STORIAIMPEGN.SetFieldPanel(PFL_STORIAIMPEGN_SCELTAIMP, -1, "", "SCELTAIMP", 0, 0, 0, -13997);
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICINFOIMP1, MyGlb.PANEL_LIST, 448, 40, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICINFOIMP1, MyGlb.PANEL_LIST, 0);
    PAN_STORIAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICINFOIMP1, MyGlb.PANEL_LIST, 1);
    PAN_STORIAIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICINFOIMP1, MyGlb.PANEL_FORM, 460, 24, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIAIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICINFOIMP1, MyGlb.PANEL_FORM, 0);
    PAN_STORIAIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIAIMPEGN_ETICINFOIMP1, MyGlb.PANEL_FORM, 1);
    PAN_STORIAIMPEGN.SetFieldPage(PFL_STORIAIMPEGN_ETICINFOIMP1, -1, -1);
    PAN_STORIAIMPEGN.SetFieldPanel(PFL_STORIAIMPEGN_ETICINFOIMP1, -1, "", "ETICINFOIMP1", 0, 0, 0, -13997);
  }

  private void PAN_STORIAIMPEGN_InitQueries()
  {
    StringBuffer SQL;

    PAN_STORIAIMPEGN.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  IMP A ");
    SQL.append("where (A.ANNO_IMP = ~~NOMOGGANNIMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~NOMEOGGEIMPE~~) ");
    PAN_STORIAIMPEGN.SetQuery(PPQRY_IMP, 0, SQL, -1, "");
    PAN_STORIAIMPEGN.SetQueryDB(PPQRY_IMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STORIAIMPEGN.SetMasterTable(PPQRY_IMP, "IMP");
    PAN_STORIAIMPEGN.SetIMDB(IMDB, "PQRY_NUOVATABELL1", true);
    PAN_STORIAIMPEGN.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_STORIAIMPEGN.SetQueryIMDB(PPQRY_NUOVATABELL1, IMDBDef14.PQRY_NUOVATABELL1_RS, IMDBDef4.TBL_NUOVATABELL5);
    JustLoaded = true;
    PAN_STORIAIMPEGN.SetFieldPrimaryIndex(PFL_STORIAIMPEGN_IMPEGNO, IMDBDef4.FLD_NUOVATABELL5_NOMEOGGEIMPE);
    PAN_STORIAIMPEGN.SetFieldPrimaryIndex(PFL_STORIAIMPEGN_ANNOIMPEGNO, IMDBDef4.FLD_NUOVATABELL5_NOMOGGANNIMP);
    PAN_STORIAIMPEGN.SetFieldPrimaryIndex(PFL_STORIAIMPEGN_TIPOSTAMPA, IMDBDef4.FLD_NUOVATABELL5_NOMOGGTIPSTA);
    PAN_STORIAIMPEGN.SetMasterTable(0, "NUOVATABELL5");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STORIAIMPEGN.Status() == 2)
    {
      int oldListQBE = PAN_STORIAIMPEGN.iUseListQBE;
      PAN_STORIAIMPEGN.iUseListQBE = 0;
      PAN_STORIAIMPEGN.PanelCommand(Glb.PCM_SEARCH);
      PAN_STORIAIMPEGN.PanelCommand(Glb.PCM_FIND);
      PAN_STORIAIMPEGN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_STORIAIMPEGN) PAN_STORIAIMPEGN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STORIAIMPEGN) PAN_STORIAIMPEGN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STORIAIMPEGN) PAN_STORIAIMPEGN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_STORIAIMPEGN) PAN_STORIAIMPEGN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_STORIAIMPEGN) PAN_STORIAIMPEGN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
