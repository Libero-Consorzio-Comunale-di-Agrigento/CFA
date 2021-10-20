// **********************************************
// Storia Subimpegno
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StoriaSubimpegno extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_STORIASUBIMP_SUBIMPEGNO = 0;
  private static int PFL_STORIASUBIMP_ANNOSUBIMPEG = 1;
  private static int PFL_STORIASUBIMP_TIPOSTAMPA = 2;
  private static int PFL_STORIASUBIMP_DESCRIIMPEGN = 3;
  private static int PFL_STORIASUBIMP_ETICHEELABOR = 4;
  private static int PFL_STORIASUBIMP_SCELTAIMP = 5;
  private static int PFL_STORIASUBIMP_ETICINFOIMP1 = 6;

  private static int PPQRY_NUOVATABELL2 = 0;

  private static int PPQRY_IMP = 1;


  IDPanel PAN_STORIASUBIMP;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NUOVATABELLA(IMDB);
    //
    //
    Init_PQRY_NUOVATABELL2(IMDB);
    Init_PQRY_NUOVATABELL2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NUOVATABELLA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_NUOVATABELLA, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_NUOVATABELLA, "TBL_NUOVATABELLA");
    IMDB.set_FldCode(IMDBDef4.TBL_NUOVATABELLA,IMDBDef4.FLD_NUOVATABELLA_NOMEOGGEIMPE, "NOMEOGGEIMPE");
    IMDB.SetFldParams(IMDBDef4.TBL_NUOVATABELLA,IMDBDef4.FLD_NUOVATABELLA_NOMEOGGEIMPE,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_NUOVATABELLA,IMDBDef4.FLD_NUOVATABELLA_NOMOGGANNIMP, "NOMOGGANNIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_NUOVATABELLA,IMDBDef4.FLD_NUOVATABELLA_NOMOGGANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_NUOVATABELLA,IMDBDef4.FLD_NUOVATABELLA_NOMOGGTIPSTA, "NOMOGGTIPSTA");
    IMDB.SetFldParams(IMDBDef4.TBL_NUOVATABELLA,IMDBDef4.FLD_NUOVATABELLA_NOMOGGTIPSTA,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_NUOVATABELLA, 0);
  }

  private static void Init_PQRY_NUOVATABELL2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_NUOVATABELL2, 3);
    IMDB.set_TblCode(IMDBDef14.PQRY_NUOVATABELL2, "PQRY_NUOVATABELL2");
    IMDB.set_FldCode(IMDBDef14.PQRY_NUOVATABELL2,IMDBDef14.PQSL_NUOVATABELL2_NOMEOGGEIMPE, "NOMEOGGEIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_NUOVATABELL2,IMDBDef14.PQSL_NUOVATABELL2_NOMEOGGEIMPE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_NUOVATABELL2,IMDBDef14.PQSL_NUOVATABELL2_NOMOGGANNIMP, "NOMOGGANNIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_NUOVATABELL2,IMDBDef14.PQSL_NUOVATABELL2_NOMOGGANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_NUOVATABELL2,IMDBDef14.PQSL_NUOVATABELL2_NOMOGGTIPSTA, "NOMOGGTIPSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_NUOVATABELL2,IMDBDef14.PQSL_NUOVATABELL2_NOMOGGTIPSTA,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_NUOVATABELL2, 0);
  }

  private static void Init_PQRY_NUOVATABELL2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_NUOVATABELL2_RS, 3);
    IMDB.set_TblCode(IMDBDef14.PQRY_NUOVATABELL2_RS, "PQRY_NUOVATABELL2_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_NUOVATABELL2_RS,IMDBDef14.PQSL_NUOVATABELL2_NOMEOGGEIMPE, "NOMEOGGEIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_NUOVATABELL2_RS,IMDBDef14.PQSL_NUOVATABELL2_NOMEOGGEIMPE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_NUOVATABELL2_RS,IMDBDef14.PQSL_NUOVATABELL2_NOMOGGANNIMP, "NOMOGGANNIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_NUOVATABELL2_RS,IMDBDef14.PQSL_NUOVATABELL2_NOMOGGANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_NUOVATABELL2_RS,IMDBDef14.PQSL_NUOVATABELL2_NOMOGGTIPSTA, "NOMOGGTIPSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_NUOVATABELL2_RS,IMDBDef14.PQSL_NUOVATABELL2_NOMOGGTIPSTA,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StoriaSubimpegno(MyWebEntryPoint w, IMDBObj imdb)
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
  public StoriaSubimpegno()
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
    FormIdx = MyGlb.FRM_STORIASUBIMP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "ACD08221-369B-4122-BB01-4A377A1A9FA8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 496;
    DesignHeight = 154;
    set_Caption(new IDVariant("Storia SubImpegno"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 496;
    Frames[1].Height = 128;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Storia Sub-Impegno";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 128;
    PAN_STORIASUBIMP = new IDPanel(w, this, 1, "PAN_STORIASUBIMP");
    Frames[1].Content = PAN_STORIASUBIMP;
    PAN_STORIASUBIMP.Lockable = false;
    PAN_STORIASUBIMP.iLocked = false;
    PAN_STORIASUBIMP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STORIASUBIMP.VS = MainFrm.VisualStyleList;
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 496-MyGlb.PAN_OFFS_X, 128-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_STORIASUBIMP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "025AA8A2-AB58-4B48-91A1-B901647D1116");
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 556, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_STORIASUBIMP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_STORIASUBIMP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STORIASUBIMP.InitStatus = 2;
    PAN_STORIASUBIMP_Init();
    PAN_STORIASUBIMP_InitFields();
    PAN_STORIASUBIMP_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_NUOVATABELLA, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STORIASUBIMP_NUOVATABELL2();
      }
      PAN_STORIASUBIMP.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELSUBIMPUT && flRis && IdxPanelActived == PAN_STORIASUBIMP.FrIndex)
    {
      if (IdxFieldActived ==PFL_STORIASUBIMP_SCELTAIMP) {
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
    return (obj instanceof StoriaSubimpegno);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StoriaSubimpegno.class.getName() : (Glb.ClassWithPackage(StoriaSubimpegno.class) ? StoriaSubimpegno.class.getName().substring(StoriaSubimpegno.class.getPackage().getName().length() + 1) : StoriaSubimpegno.class.getName()));
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
      MainFrm.ErrObj.ProcError ("StoriaSubimpegno", "Load", _e);
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
      MainFrm.ErrObj.ProcError ("StoriaSubimpegno", "Unload", _e);
    }
  }

  // **********************************************************************
  // Nuova Tabella: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_NUOVTABEDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_NUOVATABELLA, IMDBDef4.FLD_NUOVATABELLA_NOMEOGGEIMPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_NUOVATABELLA, IMDBDef4.FLD_NUOVATABELLA_NOMOGGANNIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_NUOVATABELLA, IMDBDef4.FLD_NUOVATABELLA_NOMOGGTIPSTA, 0, new IDVariant());
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
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSUBIMPUT)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMEOGGEIMPE, 0, IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_NUMERO_SUBIMP, 0));
          IMDB.set_Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMOGGANNIMP, 0, IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_ANNO_SUBIMP, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoriaSubimpegno", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Storia SubImpegno On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STORIASUBIMP_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_STORIASUBIMP);
      // 
      // Storia SubImpegno On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMEOGGEIMPE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMOGGANNIMP, 0))))
      {
        PAN_STORIASUBIMP.SetFlags (Glb.OBJ_FIELD, PFL_STORIASUBIMP_ETICINFOIMP1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_STORIASUBIMP.SetFlags (Glb.OBJ_FIELD, PFL_STORIASUBIMP_ETICINFOIMP1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_STORIASUBIMP.set_ToolTip(Glb.OBJ_FIELD,PFL_STORIASUBIMP_DESCRIIMPEGN,(new IDVariant(PAN_STORIASUBIMP.FieldText(PFL_STORIASUBIMP_DESCRIIMPEGN))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoriaSubimpegno", "StoriaSubImpegnoOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Storia SubImpegno On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_STORIASUBIMP_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Storia SubImpegno On Updating Row Body
      // Corpo Procedura
      // 
      if ((Column.equals((new IDVariant(PFL_STORIASUBIMP_SUBIMPEGNO)), true) || Column.equals((new IDVariant(PFL_STORIASUBIMP_ANNOSUBIMPEG)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMOGGANNIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMEOGGEIMPE, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  SUBIMP A ");
          SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMOGGANNIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMEOGGEIMPE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
            S = (new IDVariant("Sub-Impegno inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMEOGGEIMPE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMOGGANNIMP, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoriaSubimpegno", "StoriaSubImpegnoOnUpdatingRow", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMOGGANNIMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMEOGGEIMPE, 0));
      if (IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMOGGANNIMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoriaSubimpegno", "EtichettaInfoImp", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI124, IMDBDef1.FLD_PARAMETRI124_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI124, IMDBDef1.FLD_PARAMETRI124_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELSUBIMPUT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoriaSubimpegno", "SceltaImp", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMEOGGEIMPE, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMOGGANNIMP, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Sub-Impegno Obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMOGGTIPSTA, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Tipo stampa obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.WORKSTORIASUBIMP(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMEOGGEIMPE, 0), IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMOGGANNIMP, 0), IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMOGGTIPSTA, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPA = (new IDVariant("Storia_SubImpegno"));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_NUM_SUBIMP")), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMEOGGEIMPE, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_ANNO_SUBIMP")), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMOGGANNIMP, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPO_STAMPA")), IMDB.Value(IMDBDef14.PQRY_NUOVATABELL2, IMDBDef14.PQSL_NUOVATABELL2_NOMOGGTIPSTA, 0));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoriaSubimpegno", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuova Tabella
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void STORIASUBIMP_NUOVATABELL2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_NUOVATABELL2_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_NUOVATABELLA, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_NUOVATABELLA, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_NUOVATABELL2_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_NUOVATABELL2_RS, 0, IMDBDef4.TBL_NUOVATABELLA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_NUOVATABELL2_RS, 0, 0, IMDBDef4.TBL_NUOVATABELLA, IMDBDef4.FLD_NUOVATABELLA_NOMEOGGEIMPE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_NUOVATABELL2_RS, 1, 0, IMDBDef4.TBL_NUOVATABELLA, IMDBDef4.FLD_NUOVATABELLA_NOMOGGANNIMP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_NUOVATABELL2_RS, 2, 0, IMDBDef4.TBL_NUOVATABELLA, IMDBDef4.FLD_NUOVATABELLA_NOMOGGTIPSTA, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_NUOVATABELLA, 0);
      if (IMDB.Eof(IMDBDef4.TBL_NUOVATABELLA, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_NUOVATABELLA, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_NUOVATABELL2_RS, 0);
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
  private void PAN_STORIASUBIMP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_STORIASUBIMP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_STORIASUBIMP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_STORIASUBIMP, Cancel);
    // Stub
  }

  private void PAN_STORIASUBIMP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_STORIASUBIMP_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_STORIASUBIMP.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_STORIASUBIMP_SCELTAIMP)
    {
      this.IdxPanelActived = this.PAN_STORIASUBIMP.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaImp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_STORIASUBIMP_ETICINFOIMP1)
    {
      this.IdxPanelActived = this.PAN_STORIASUBIMP.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaInfoImp();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_STORIASUBIMP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_STORIASUBIMP_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_STORIASUBIMP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_STORIASUBIMP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_STORIASUBIMP_Init()
  {

    PAN_STORIASUBIMP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STORIASUBIMP.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_STORIASUBIMP.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_STORIASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SUBIMPEGNO, "51818536-0A47-498A-AF35-7C614967D108");
    PAN_STORIASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SUBIMPEGNO, "Sub-Impegno");
    PAN_STORIASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SUBIMPEGNO, "");
    PAN_STORIASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SUBIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_STORIASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SUBIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STORIASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ANNOSUBIMPEG, "88456C26-5797-4ED3-90B8-2F15A51348E4");
    PAN_STORIASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ANNOSUBIMPEG, "/");
    PAN_STORIASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ANNOSUBIMPEG, "");
    PAN_STORIASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ANNOSUBIMPEG, MyGlb.VIS_NORMALFIELDS);
    PAN_STORIASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ANNOSUBIMPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STORIASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_TIPOSTAMPA, "4D5D032E-0FAC-4AA4-91AD-F1B59086A8F9");
    PAN_STORIASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_TIPOSTAMPA, "Tipo Stampa");
    PAN_STORIASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_TIPOSTAMPA, "");
    PAN_STORIASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_TIPOSTAMPA, MyGlb.VIS_OPTIONBUTTON);
    PAN_STORIASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_TIPOSTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORIASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_DESCRIIMPEGN, "E8EA062A-E447-4BA5-8130-98A790B46E4C");
    PAN_STORIASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_DESCRIIMPEGN, "Descrizione Impegno");
    PAN_STORIASUBIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_DESCRIIMPEGN, "");
    PAN_STORIASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_DESCRIIMPEGN, MyGlb.VIS_VISULOOUPCF4);
    PAN_STORIASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_DESCRIIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_STORIASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICHEELABOR, "0F1342CB-ECAA-48C5-9240-99A3CF990B75");
    PAN_STORIASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICHEELABOR, "Elabora");
    PAN_STORIASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_STORIASUBIMP.SetImage(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICHEELABOR, 0, "button1.gif", false);
    PAN_STORIASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_STORIASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SCELTAIMP, "2CDABE01-2225-4BAB-93CD-9B0A2BCF4526");
    PAN_STORIASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SCELTAIMP, "");
    PAN_STORIASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SCELTAIMP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_STORIASUBIMP.SetImage(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SCELTAIMP, 0, "wsearch1.gif", false);
    PAN_STORIASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SCELTAIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_STORIASUBIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICINFOIMP1, "5540B0CB-C8C1-461C-ADE1-AEF8C4DF9FFC");
    PAN_STORIASUBIMP.set_Header(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICINFOIMP1, "");
    PAN_STORIASUBIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICINFOIMP1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_STORIASUBIMP.SetImage(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICINFOIMP1, 0, "info.gif", false);
    PAN_STORIASUBIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICINFOIMP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_STORIASUBIMP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SUBIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SUBIMPEGNO, MyGlb.PANEL_LIST, 60);
    PAN_STORIASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SUBIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_STORIASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SUBIMPEGNO, MyGlb.PANEL_LIST, "Sub Impegno");
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SUBIMPEGNO, MyGlb.PANEL_FORM, 4, 20, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SUBIMPEGNO, MyGlb.PANEL_FORM, 104);
    PAN_STORIASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SUBIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_STORIASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SUBIMPEGNO, MyGlb.PANEL_FORM, "Sub-Impegno");
    PAN_STORIASUBIMP.SetFieldPage(PFL_STORIASUBIMP_SUBIMPEGNO, -1, -1);
    PAN_STORIASUBIMP.SetFieldPanel(PFL_STORIASUBIMP_SUBIMPEGNO, PPQRY_NUOVATABELL2, "A.NOMEOGGEIMPE", "NOMEOGGEIMPE", 1, 5, 0, -13997);
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 92);
    PAN_STORIASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ANNOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_STORIASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ANNOSUBIMPEG, MyGlb.PANEL_LIST, "/");
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 148, 20, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 16);
    PAN_STORIASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ANNOSUBIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_STORIASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ANNOSUBIMPEG, MyGlb.PANEL_FORM, "/");
    PAN_STORIASUBIMP.SetFieldPage(PFL_STORIASUBIMP_ANNOSUBIMPEG, -1, -1);
    PAN_STORIASUBIMP.SetFieldPanel(PFL_STORIASUBIMP_ANNOSUBIMPEG, PPQRY_NUOVATABELL2, "A.NOMOGGANNIMP", "NOMOGGANNIMP", 1, 4, 0, -13997);
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_TIPOSTAMPA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_TIPOSTAMPA, MyGlb.PANEL_LIST, 80);
    PAN_STORIASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_STORIASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_TIPOSTAMPA, MyGlb.PANEL_LIST, "Tipo Stampa");
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_TIPOSTAMPA, MyGlb.PANEL_FORM, 4, 44, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_TIPOSTAMPA, MyGlb.PANEL_FORM, 104);
    PAN_STORIASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_STORIASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_TIPOSTAMPA, MyGlb.PANEL_FORM, "Tipo Stampa");
    PAN_STORIASUBIMP.SetFieldPage(PFL_STORIASUBIMP_TIPOSTAMPA, -1, -1);
    PAN_STORIASUBIMP.SetFieldPanel(PFL_STORIASUBIMP_TIPOSTAMPA, PPQRY_NUOVATABELL2, "A.NOMOGGTIPSTA", "NOMOGGTIPSTA", 5, 2, 0, -13997);
    PAN_STORIASUBIMP.SetValueListItem(PFL_STORIASUBIMP_TIPOSTAMPA, (new IDVariant("D")), "Dettaglio", "", "", -1);
    PAN_STORIASUBIMP.SetValueListItem(PFL_STORIASUBIMP_TIPOSTAMPA, (new IDVariant("T")), "Solo Totali", "", "", -1);
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_DESCRIIMPEGN, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_DESCRIIMPEGN, MyGlb.PANEL_LIST, 108);
    PAN_STORIASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_DESCRIIMPEGN, MyGlb.PANEL_LIST, 2);
    PAN_STORIASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_DESCRIIMPEGN, MyGlb.PANEL_LIST, "Descrizione Impegno");
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_DESCRIIMPEGN, MyGlb.PANEL_FORM, 208, 20, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_DESCRIIMPEGN, MyGlb.PANEL_FORM, 108);
    PAN_STORIASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_DESCRIIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_STORIASUBIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_DESCRIIMPEGN, MyGlb.PANEL_FORM, "Descr. Impegno");
    PAN_STORIASUBIMP.SetFieldPage(PFL_STORIASUBIMP_DESCRIIMPEGN, -1, -1);
    PAN_STORIASUBIMP.SetFieldPanel(PFL_STORIASUBIMP_DESCRIIMPEGN, PPQRY_IMP, "A.DESCRIZIONE", "IMPSUBIMDESC", 5, 140, 0, -13997);
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICHEELABOR, MyGlb.PANEL_LIST, 340, 76, 88, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_STORIASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICHEELABOR, MyGlb.PANEL_FORM, 356, 76, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_STORIASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_STORIASUBIMP.SetFieldPage(PFL_STORIASUBIMP_ETICHEELABOR, -1, -1);
    PAN_STORIASUBIMP.SetFieldPanel(PFL_STORIASUBIMP_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SCELTAIMP, MyGlb.PANEL_LIST, 440, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SCELTAIMP, MyGlb.PANEL_LIST, 0);
    PAN_STORIASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SCELTAIMP, MyGlb.PANEL_LIST, 1);
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SCELTAIMP, MyGlb.PANEL_FORM, 440, 24, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SCELTAIMP, MyGlb.PANEL_FORM, 0);
    PAN_STORIASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_SCELTAIMP, MyGlb.PANEL_FORM, 1);
    PAN_STORIASUBIMP.SetFieldPage(PFL_STORIASUBIMP_SCELTAIMP, -1, -1);
    PAN_STORIASUBIMP.SetFieldPanel(PFL_STORIASUBIMP_SCELTAIMP, -1, "", "SCELTAIMP", 0, 0, 0, -13997);
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICINFOIMP1, MyGlb.PANEL_LIST, 448, 40, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICINFOIMP1, MyGlb.PANEL_LIST, 0);
    PAN_STORIASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICINFOIMP1, MyGlb.PANEL_LIST, 1);
    PAN_STORIASUBIMP.SetRect(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICINFOIMP1, MyGlb.PANEL_FORM, 460, 24, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORIASUBIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICINFOIMP1, MyGlb.PANEL_FORM, 0);
    PAN_STORIASUBIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORIASUBIMP_ETICINFOIMP1, MyGlb.PANEL_FORM, 1);
    PAN_STORIASUBIMP.SetFieldPage(PFL_STORIASUBIMP_ETICINFOIMP1, -1, -1);
    PAN_STORIASUBIMP.SetFieldPanel(PFL_STORIASUBIMP_ETICINFOIMP1, -1, "", "ETICINFOIMP1", 0, 0, 0, -13997);
  }

  private void PAN_STORIASUBIMP_InitQueries()
  {
    StringBuffer SQL;

    PAN_STORIASUBIMP.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as IMPSUBIMDESC ");
    SQL.append("from ");
    SQL.append("  SUBIMP A ");
    SQL.append("where (A.ANNO_SUBIMP = ~~NOMOGGANNIMP~~) ");
    SQL.append("and   (A.NUMERO_SUBIMP = ~~NOMEOGGEIMPE~~) ");
    PAN_STORIASUBIMP.SetQuery(PPQRY_IMP, 0, SQL, -1, "");
    PAN_STORIASUBIMP.SetQueryDB(PPQRY_IMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STORIASUBIMP.SetMasterTable(PPQRY_IMP, "SUBIMP");
    PAN_STORIASUBIMP.SetIMDB(IMDB, "PQRY_NUOVATABELL2", true);
    PAN_STORIASUBIMP.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_STORIASUBIMP.SetQueryIMDB(PPQRY_NUOVATABELL2, IMDBDef14.PQRY_NUOVATABELL2_RS, IMDBDef4.TBL_NUOVATABELLA);
    JustLoaded = true;
    PAN_STORIASUBIMP.SetFieldPrimaryIndex(PFL_STORIASUBIMP_SUBIMPEGNO, IMDBDef4.FLD_NUOVATABELLA_NOMEOGGEIMPE);
    PAN_STORIASUBIMP.SetFieldPrimaryIndex(PFL_STORIASUBIMP_ANNOSUBIMPEG, IMDBDef4.FLD_NUOVATABELLA_NOMOGGANNIMP);
    PAN_STORIASUBIMP.SetFieldPrimaryIndex(PFL_STORIASUBIMP_TIPOSTAMPA, IMDBDef4.FLD_NUOVATABELLA_NOMOGGTIPSTA);
    PAN_STORIASUBIMP.SetMasterTable(0, "NUOVATABELLA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STORIASUBIMP.Status() == 2)
    {
      int oldListQBE = PAN_STORIASUBIMP.iUseListQBE;
      PAN_STORIASUBIMP.iUseListQBE = 0;
      PAN_STORIASUBIMP.PanelCommand(Glb.PCM_SEARCH);
      PAN_STORIASUBIMP.PanelCommand(Glb.PCM_FIND);
      PAN_STORIASUBIMP.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_STORIASUBIMP) PAN_STORIASUBIMP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STORIASUBIMP) PAN_STORIASUBIMP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STORIASUBIMP) PAN_STORIASUBIMP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_STORIASUBIMP) PAN_STORIASUBIMP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_STORIASUBIMP) PAN_STORIASUBIMP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
