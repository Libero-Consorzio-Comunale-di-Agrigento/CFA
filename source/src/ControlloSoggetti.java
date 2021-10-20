// **********************************************
// Controllo Soggetti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloSoggetti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_IMPORTFILE_IMPORTBUTTON = 0;
  private static int PFL_IMPORTFILE_PROGRESSIVO = 1;
  private static int PFL_IMPORTFILE_SESSIONE = 2;
  private static int PFL_IMPORTFILE_FASE = 3;
  private static int PFL_IMPORTFILE_FILEDATI = 4;
  private static int PFL_IMPORTFILE_ETICHETLABEL = 5;

  private static int PPQRY_IMPORTFILE4 = 0;


  IDPanel PAN_IMPORTFILE;
  private static int PFL_PARAMETRI_TIPPAGPERCAS = 0;
  private static int PFL_PARAMETRI_SPESE = 1;

  private static int PPQRY_PARAMETRI554 = 0;

  private static int PPQRY_T02 = 1;
  private static int PPQRY_TIPISPESMINF = 2;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI566(IMDB);
    Init_TBL_PAR111(IMDB);
    //
    //
    Init_PQRY_IMPORTFILE4(IMDB);
    Init_PQRY_PARAMETRI554(IMDB);
    Init_PQRY_PARAMETRI554_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI566(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI566, 6);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI566, "TBL_PARAMETRI566");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI566,IMDBDef2.FLD_PARAMETRI566_ROWNAMPEFIBL, "ROWNAMPEFIBL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI566,IMDBDef2.FLD_PARAMETRI566_ROWNAMPEFIBL,9,8000,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI566,IMDBDef2.FLD_PARAMETRI566_ROWNAMBLOINS, "ROWNAMBLOINS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI566,IMDBDef2.FLD_PARAMETRI566_ROWNAMBLOINS,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI566,IMDBDef2.FLD_PARAMETRI566_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI566,IMDBDef2.FLD_PARAMETRI566_ROWNAMEPROGR,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI566,IMDBDef2.FLD_PARAMETRI566_ROWNAMEFASE, "ROWNAMEFASE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI566,IMDBDef2.FLD_PARAMETRI566_ROWNAMEFASE,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI566,IMDBDef2.FLD_PARAMETRI566_RONATIPAPECA, "RONATIPAPECA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI566,IMDBDef2.FLD_PARAMETRI566_RONATIPAPECA,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI566,IMDBDef2.FLD_PARAMETRI566_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI566,IMDBDef2.FLD_PARAMETRI566_ROWNAMESPESE,1,1,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI566, 0);
  }

  private static void Init_TBL_PAR111(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PAR111, 1);
    IMDB.set_TblCode(IMDBDef2.TBL_PAR111, "TBL_PAR111");
    IMDB.set_FldCode(IMDBDef2.TBL_PAR111,IMDBDef2.FLD_PAR111_NOMOGGCONINS, "NOMOGGCONINS");
    IMDB.SetFldParams(IMDBDef2.TBL_PAR111,IMDBDef2.FLD_PAR111_NOMOGGCONINS,1,1,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PAR111, 0);
  }

  private static void Init_PQRY_IMPORTFILE4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_IMPORTFILE4, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_IMPORTFILE4, "PQRY_IMPORTFILE4");
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPORTFILE4,IMDBDef9.PQSL_IMPORTFILE4_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPORTFILE4,IMDBDef9.PQSL_IMPORTFILE4_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPORTFILE4,IMDBDef9.PQSL_IMPORTFILE4_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPORTFILE4,IMDBDef9.PQSL_IMPORTFILE4_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPORTFILE4,IMDBDef9.PQSL_IMPORTFILE4_FASE, "FASE");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPORTFILE4,IMDBDef9.PQSL_IMPORTFILE4_FASE,5,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_IMPORTFILE4,IMDBDef9.PQSL_IMPORTFILE4_FILE_DATI, "FILE_DATI");
    IMDB.SetFldParams(IMDBDef9.PQRY_IMPORTFILE4,IMDBDef9.PQSL_IMPORTFILE4_FILE_DATI,10,9999,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_IMPORTFILE4, 0);
  }

  private static void Init_PQRY_PARAMETRI554(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI554, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI554, "PQRY_PARAMETRI554");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI554,IMDBDef9.PQSL_PARAMETRI554_RONATIPAPECA, "RONATIPAPECA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI554,IMDBDef9.PQSL_PARAMETRI554_RONATIPAPECA,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI554,IMDBDef9.PQSL_PARAMETRI554_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI554,IMDBDef9.PQSL_PARAMETRI554_ROWNAMESPESE,1,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI554, 0);
  }

  private static void Init_PQRY_PARAMETRI554_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI554_RS, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI554_RS, "PQRY_PARAMETRI554_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI554_RS,IMDBDef9.PQSL_PARAMETRI554_RONATIPAPECA, "RONATIPAPECA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI554_RS,IMDBDef9.PQSL_PARAMETRI554_RONATIPAPECA,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI554_RS,IMDBDef9.PQSL_PARAMETRI554_ROWNAMESPESE, "ROWNAMESPESE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI554_RS,IMDBDef9.PQSL_PARAMETRI554_ROWNAMESPESE,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloSoggetti(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloSoggetti()
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
    FormIdx = MyGlb.FRM_CONTROSOGGET;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "27531012-CF40-432A-BE2F-F5EB00FEC10A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 668;
    DesignHeight = 346;
    set_Caption(new IDVariant("Controllo Soggetti"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 668;
    Frames[1].Height = 320;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Import File";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 320;
    PAN_IMPORTFILE = new IDPanel(w, this, 1, "PAN_IMPORTFILE");
    Frames[1].Content = PAN_IMPORTFILE;
    PAN_IMPORTFILE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPORTFILE.VS = MainFrm.VisualStyleList;
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 668-MyGlb.PAN_OFFS_X, 320-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6318F264-ADCB-45F4-8BD7-9894B5B1E3B8");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 432, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPORTFILE.InitStatus = 2;
    PAN_IMPORTFILE_Init();
    PAN_IMPORTFILE_InitFields();
    PAN_IMPORTFILE_InitQueries();
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    PAN_IMPORTFILE.SetSubFrame(PFL_IMPORTFILE_ETICHETLABEL,2);
    Frames[2].set_SubFrame(true);
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B3D42BEC-E9D1-465E-A573-4954D7A637CE");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI566, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTROSOGGET_PARAMETRI554();
      }
      PAN_IMPORTFILE.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    return (obj instanceof ControlloSoggetti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloSoggetti.class.getName() : (Glb.ClassWithPackage(ControlloSoggetti.class) ? ControlloSoggetti.class.getName().substring(ControlloSoggetti.class.getPackage().getName().length() + 1) : ControlloSoggetti.class.getName()));
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
      IDVariant v_RET = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_LICENZA = new IDVariant(0,IDVariant.STRING);
      v_LICENZA = (new IDVariant("MIF"));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_RONATIPAPECA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMESPESE, 0, (new IDVariant()));
      // 
      // setto valori di default
      // 
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMEPROGR, 0, PredisposizioneWORDEXPORTID());
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMEFASE, 0, (new IDVariant("AUSO")));
      }
      if (IMDB.Value(IMDBDef2.TBL_PAR111, IMDBDef2.FLD_PAR111_NOMOGGCONINS, 0).compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Caricamento Soggetti"));
        set_Caption(new IDVariant(S));
        PAN_PARAMETRI.set_Visible((new IDVariant(-1)).booleanValue());
        v_RET = (new IDVariant(MainFrm.FunzioneLicenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), v_LICENZA)));
        if (MainFrm.GESTIONSPESE.compareTo((new IDVariant("SI")), true)!=0 || MainFrm.SPESE_DA_SOGGETTO.compareTo((new IDVariant("SI")), true)!=0 || !(v_RET.booleanValue()))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Controllo Soggetti"));
        set_Caption(new IDVariant(S));
        PAN_PARAMETRI.set_Visible((new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloSoggetti", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Import File After BLOB Update Event
  // Evento notificato dal pannello dopo aver salvato su
  // db il file caricato dall'utente o cancellato il contenuto
  // del blob.
  // Column: Numero intero che indica quale campo del pannello è coinvolto nell'operazione di aggiornamento o cancellazione. Deve essere confrontato con la funzione Me dei campi del pannello. - Input
  // Size: Dimensione del file caricato in byte oppure -1 se il contenuto del blob è stato cancellato. - Input
  // Extension: Stringa che contiene l'estensione del file in fase di caricamento. - Input
  // **********************************************************************
  private void PAN_IMPORTFILE_AfterBlobUpdate (IDVariant Column, IDVariant Size, IDVariant Extension)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PERCORSO = new IDVariant(0,IDVariant.STRING);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Import File After BLOB Update Event Body
      // Procedure Body
      // 
      C2 = PAN_IMPORTFILE.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_IMPORTFILE.GotoFirst();
      while (!PAN_IMPORTFILE.RSEOF())
      {
        if (IMDB.Value(IMDBDef9.PQRY_IMPORTFILE4, IMDBDef9.PQSL_IMPORTFILE4_PROGRESSIVO, 0).equals(C2.Get("PROGRESSIVO"), true))
        {
          v_PERCORSO = Glb.SaveBlob(MainFrm,C2.Get("FILE_DATI"),IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), (new IDVariant("temp"))),IDL.Add(IDL.Add((new IDVariant("Soggetti_chek")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMEPROGR, 0))));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMPEFIBL, 0, new IDVariant(v_PERCORSO));
        }
        PAN_IMPORTFILE.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (Size.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMBLOINS, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMBLOINS, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloSoggetti", "ImportFileAfterBLOBUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Import File On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_IMPORTFILE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_IMPORTFILE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Import File On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloSoggetti", "ImportFileOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Controlloerrore
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant Controlloerrore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_STAMPACAPTIO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_STAMPACAPTIO = (new IDVariant("Stampa Anomalie ", IDVariant.STRING));
      // 
      // Controlloerrore Body
      // Procedure Body
      // 
      // 
      // se trovo qualche record si è verificato un errore
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  WRK_ERRORI A ");
      SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
      {
        MainFrm.LanciaErrorReport(v_STAMPACAPTIO, (new IDVariant()));
        return (new IDVariant(-1));
      }
      else
      {
        return (new IDVariant(1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloSoggetti", "Controlloerrore", _e);
      return new IDVariant();
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
    IDVariant v_FD = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      // 
      // la procedura funziona solo se è stato selezionato un file attraverso il campo blob
      // 
      {
        if (!(IMDB.Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMBLOINS, 0).equals((new IDVariant("SI")), true)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Selezionare un file"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      if (IMDB.Value(IMDBDef2.TBL_PAR111, IMDBDef2.FLD_PAR111_NOMOGGCONINS, 0).compareTo((new IDVariant(0)), true)>0)
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI554, IMDBDef9.PQSL_PARAMETRI554_RONATIPAPECA, 0)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Tipo Pagamento obbligatorio"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      // 
      // apro il file gestendo un'eventuale eccezione
      // 
      {
        try
        {
          v_FD = MainFrm.VBFile.FreeFile();
          MainFrm.VBFile.OpenForInput(IMDB.Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMPEFIBL, 0), v_FD); 
        }
        catch (Exception e10)
        {
          IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
          v_MSG = (new IDVariant("Errore nella lettura file!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_MSG); 
          return 0;
        }
      }
      // 
      // copio i caratteri del file nella tabella selezionata in maniera ordinata utilizzando come supporto buffer1 e buffer2
      // 
      {
        IDVariant v_CURRNUMBERCH = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_CURRLINE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CONTROLLASEF = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_PROG = new IDVariant(0,IDVariant.INTEGER);
        v_CONTROLLASEF = (new IDVariant(-1));
        // 
        // inserisco ogni riga del file in WORK EXPORT TESO
        // 
        {
          MainFrm.Cf4armDBObject.BeginTrans();
          try
          {
            // 
            // pulisco la tabella workesportteso prima di effettuare
            // l'inserimento
            // 
            SQL = new StringBuffer();
            SQL.append("delete from WORK_EXPORT_TESO ");
            SQL.append("where (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
            SQL.append("and   (FASE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e15)
          {
            MainFrm.set_AlertMessage(new IDVariant(e15.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
          while (!(MainFrm.VBFile.EOF(v_FD)))
          {
            v_CURRLINE = MainFrm.VBFile.ReadLine(v_FD); 
            v_CURRNUMBERCH = IDL.Length(v_CURRLINE);
            // 
            // controllo se il file è vuoto ed eventualmente lo gestisco
            // 
            {
              if (v_CONTROLLASEF.booleanValue())
              {
                v_CONTROLLASEF = (new IDVariant(0));
                if (v_CURRNUMBERCH.equals((new IDVariant(0)), true))
                {
                  IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
                  v_MSG = (new IDVariant("Il file è vuoto!", IDVariant.STRING));
                  MainFrm.set_AlertMessage(v_MSG); 
                  return 0;
                }
              }
            }
            try
            {
              SQL = new StringBuffer();
              SQL.append("insert into WORK_EXPORT_TESO ");
              SQL.append("( ");
              SQL.append("  SESSIONE, ");
              SQL.append("  DATI, ");
              SQL.append("  DATI2, ");
              SQL.append("  FASE, ");
              SQL.append("  PROGRESSIVO ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ), ");
              SQL.append("  SUBSTR(" + IDL.CSql(v_CURRLINE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 1, 4000), ");
              SQL.append("  SUBSTR(" + IDL.CSql(v_CURRLINE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 4001, 4000), ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_PROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              v_PROG = IDL.Add(v_PROG, (new IDVariant(1)));
            }
            catch (Exception e23)
            {
              MainFrm.set_AlertMessage(new IDVariant(e23.getMessage())); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              return 0;
            }
          }
          MainFrm.Cf4armDBObject.CommitTrans();
          MainFrm.VBFile.Close(v_FD); 
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      IDVariant I = new IDVariant(0,IDVariant.INTEGER);
      MainFrm.Cf4armDBObject.SOGGETTICONTROLLO(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef2.TBL_PAR111, IMDBDef2.FLD_PAR111_NOMOGGCONINS, 0), IMDB.Value(IMDBDef9.PQRY_PARAMETRI554, IMDBDef9.PQSL_PARAMETRI554_RONATIPAPECA, 0), IMDB.Value(IMDBDef9.PQRY_PARAMETRI554, IMDBDef9.PQSL_PARAMETRI554_ROWNAMESPESE, 0), I);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        SQL = new StringBuffer();
        SQL.append("delete from WORK_EXPORT_TESO ");
        SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        return 0;
      }
      if (Controlloerrore().equals((new IDVariant(-1)), true))
      {
        PulisciWorkExportTeso();
        // 
        // 1
        // 
        return 0;
      }
      // 
      // se non ci sono errori
      // 
      {
        IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
        v_MSG2 = (new IDVariant("Controllo Eseguito. Non sono presenti anomalie.", IDVariant.STRING));
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Caricamento Eseguito. Sono stati caricati "));
        S = IDL.Add(IDL.Add(IDL.Add(S, IDL.ToString(I)), (new IDVariant(" "))), (new IDVariant("soggetti")));
        MainFrm.set_AlertMessage(((IMDB.Value(IMDBDef2.TBL_PAR111, IMDBDef2.FLD_PAR111_NOMOGGCONINS, 0).equals((new IDVariant(0))))?v_MSG2:S)); 
      }
      // 
      // ripulisco la tabella workexportteso
      // 
      {
        PulisciWorkExportTeso();
      }
      SQL = new StringBuffer();
      SQL.append("delete from WRK_ERRORI ");
      SQL.append("where (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloSoggetti", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Predisposizione WORDEXPORTID
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant PredisposizioneWORDEXPORTID ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DARESTITUIRE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_IFASE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ISESSIONE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Predisposizione WORDEXPORTID Body
      // Procedure Body
      // 
      v_IFASE = IMDB.Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMEFASE, 0);
      v_ISESSIONE = new IDVariant(new IDVariant(MainFrm.PROGRESESSIO),IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(NVL(A.PROGRESSIVO, 0) + 1) as MANUVAWEIP0U ");
      SQL.append("from ");
      SQL.append("  WORK_EXPORT_ID A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DARESTITUIRE = QV.Get("MANUVAWEIP0U", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("insert into WORK_EXPORT_ID ");
      SQL.append("( ");
      SQL.append("  PROGRESSIVO, ");
      SQL.append("  FASE, ");
      SQL.append("  SESSIONE ");
      SQL.append(") ");
      SQL.append("values ");
      SQL.append("( ");
      SQL.append("  " + IDL.CSql(v_DARESTITUIRE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  " + IDL.CSql(v_IFASE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  " + IDL.CSql(v_ISESSIONE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
      SQL.append(") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return v_DARESTITUIRE;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloSoggetti", "PredisposizioneWORDEXPORTID", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Nomecaption
  // **********************************************************************
  public int Nomecaption ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nomecaption Body
      // Procedure Body
      // 
      // 
      // setto nome caption e valori di default
      // 
      {
        IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);
        v_NOMECAPTION = (new IDVariant("Ricezione ", IDVariant.STRING));
        IDVariant v_SUBNOMECAPTI = new IDVariant(0,IDVariant.STRING);
        IDVariant v_SUBCAPTION3 = new IDVariant(0,IDVariant.STRING);
        IDVariant v_DA = new IDVariant(0,IDVariant.STRING);
        v_DA = (new IDVariant("da Tesoreria", IDVariant.STRING));
        if (IMDB.Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMEFASE, 0).equals((new IDVariant("INCASSI")), true) || IMDB.Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMEFASE, 0).equals((new IDVariant("PAGAM")), true))
        {
          v_SUBCAPTION3 = new IDVariant(v_DA);
        }
        if (IMDB.Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMEFASE, 0).equals((new IDVariant("PAGAM")), true))
        {
          IDVariant v_NOME = new IDVariant(0,IDVariant.STRING);
          v_NOME = (new IDVariant("Pagamenti", IDVariant.STRING));
          v_SUBNOMECAPTI = IDL.Add((new IDVariant(" ")), v_NOME);
        }
        set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_NOMECAPTION, v_SUBNOMECAPTI), (new IDVariant(" "))), v_DA), MainFrm.ESERCIZIO));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloSoggetti", "Nomecaption", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pulisci Work Export Teso
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int PulisciWorkExportTeso ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pulisci Work Export Teso Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("delete from WORK_EXPORT_TESO ");
      SQL.append("where (FASE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMEFASE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloSoggetti", "PulisciWorkExportTeso", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CONTROSOGGET_PARAMETRI554() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAMETRI554_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI566, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI566, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI554_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAMETRI554_RS, 0, IMDBDef2.TBL_PARAMETRI566, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI554_RS, 0, 0, IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_RONATIPAPECA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI554_RS, 1, 0, IMDBDef2.TBL_PARAMETRI566, IMDBDef2.FLD_PARAMETRI566_ROWNAMESPESE, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI566, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI566, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI566, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAMETRI554_RS, 0);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPORTFILE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPORTFILE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPORTFILE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_IMPORTFILE);
    // Stub
  }

  private void PAN_IMPORTFILE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_IMPORTFILE_IMPORTBUTTON)
    {
      this.IdxPanelActived = this.PAN_IMPORTFILE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_IMPORTFILE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMPORTFILE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_IMPORTFILE4, IMDBDef9.PQSL_IMPORTFILE4_FILE_DATI, 0)))
      {
        IMDB.set_Value(IMDBDef9.PQRY_IMPORTFILE4, IMDBDef9.PQSL_IMPORTFILE4_FILE_DATI, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_IMPORTFILE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_IMPORTFILE_Init()
  {

    PAN_IMPORTFILE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPORTFILE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMPORTFILE.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, "B2102216-1D35-471F-BD6B-04459160E772");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, "Elabora");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_IMPORTFILE.SetImage(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, 0, "button1.gif", false);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, "D6E53E5F-1ED8-482D-A2AC-271C88038B7A");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, "PROGRESSIVO");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, "48574ACA-F66E-477E-B53E-707D89F5E173");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, "SESSIONE");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.VIS_NONNULLAFIEL);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, 0, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, "8BDCF3DF-32F4-4945-97C2-B0E9EB7930D8");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, "FASE");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, "8EC19E27-9122-4C30-8DE6-FC7147C52442");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, "FILE DATI");
    PAN_IMPORTFILE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, "");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPORTFILE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, "90EFFFF9-6CBA-4A42-842A-AC7FD1D88D85");
    PAN_IMPORTFILE.set_Header(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, "label");
    PAN_IMPORTFILE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, MyGlb.VIS_LABELFIELD);
    PAN_IMPORTFILE.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_IMPORTFILE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_LIST, 376, 68, 64, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_FORM, 440, 232, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_IMPORTBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_IMPORTBUTTON, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_IMPORTBUTTON, -1, "", "IMPORTBUTTON", 0, 0, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 92, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_PROGRESSIVO, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_PROGRESSIVO, PPQRY_IMPORTFILE4, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, 60);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_LIST, "SESSIONE");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, 4, 116, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, 60);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_SESSIONE, MyGlb.PANEL_FORM, "SESSIONE");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_SESSIONE, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_SESSIONE, PPQRY_IMPORTFILE4, "A.SESSIONE", "SESSIONE", 3, 10, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, 36);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_LIST, "FASE");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, 4, 140, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, 36);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, 1);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FASE, MyGlb.PANEL_FORM, "FASE");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_FASE, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_FASE, PPQRY_IMPORTFILE4, "A.FASE", "FASE", 5, 10, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, 64);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, 2);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_LIST, "FILE DATI");
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, 8, 8, 500, 108, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, 64);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, 7);
    PAN_IMPORTFILE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_FILEDATI, MyGlb.PANEL_FORM, "FILE DATI");
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_FILEDATI, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_FILEDATI, PPQRY_IMPORTFILE4, "A.FILE_DATI", "FILE_DATI", 10, 9999, 0, -13997);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, MyGlb.PANEL_LIST, 20, 144, 324, 84, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, MyGlb.PANEL_LIST, 0);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, MyGlb.PANEL_LIST, 6);
    PAN_IMPORTFILE.SetRect(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, MyGlb.PANEL_FORM, 68, 136, 400, 88, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPORTFILE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, MyGlb.PANEL_FORM, 0);
    PAN_IMPORTFILE.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPORTFILE_ETICHETLABEL, MyGlb.PANEL_FORM, 6);
    PAN_IMPORTFILE.SetFieldPage(PFL_IMPORTFILE_ETICHETLABEL, -1, -1);
    PAN_IMPORTFILE.SetFieldPanel(PFL_IMPORTFILE_ETICHETLABEL, -1, "", "ETICHETLABEL", 0, 0, 0, -13997);
  }

  private void PAN_IMPORTFILE_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPORTFILE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMPORTFILE.SetIMDB(IMDB, "PQRY_IMPORTFILE4", true);
    PAN_IMPORTFILE.set_SetString(MyGlb.MASTER_ROWNAME, "WORK EXPORT TESO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.FASE as FASE, ");
    SQL.append("  A.FILE_DATI as FILE_DATI ");
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WORK_EXPORT_ID A ");
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO = ~~TBL_PARAMETRI566.ROWNAMEPROGR~~) ");
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPORTFILE.SetQuery(PPQRY_IMPORTFILE4, 5, SQL, -1, "");
    PAN_IMPORTFILE.SetQueryDB(PPQRY_IMPORTFILE4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPORTFILE.SetMasterTable(0, "WORK_EXPORT_ID");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPORTFILE.Status() == 2)
    {
      int oldListQBE = PAN_IMPORTFILE.iUseListQBE;
      PAN_IMPORTFILE.iUseListQBE = 0;
      PAN_IMPORTFILE.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPORTFILE.PanelCommand(Glb.PCM_FIND);
      PAN_IMPORTFILE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, "55BD1B3A-711F-4F0B-9966-AC6644D76034");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, "Tipo Pagamento per Cassa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "3EBE165D-F02B-4B11-865C-694185C2A617");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "Spese");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_LIST, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_LIST, "T. Pg. p. C.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_FORM, 0, 12, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_FORM, 172);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPPAGPERCAS, MyGlb.PANEL_FORM, "Tipo Pagamento per Cassa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPPAGPERCAS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPPAGPERCAS, PPQRY_PARAMETRI554, "A.RONATIPAPECA", "RONATIPAPECA", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 56, 36, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SPESE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SPESE, PPQRY_PARAMETRI554, "A.ROWNAMESPESE", "ROWNAMESPESE", 1, 1, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T02CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T02CODICE1 ");
    SQL.append("from ");
    SQL.append("  T02 A ");
    SQL.append("where (A.CODICE = ~~RONATIPAPECA~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T02, 0, SQL, PFL_PARAMETRI_TIPPAGPERCAS, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T02CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T02CODICE1 ");
    SQL.append("from ");
    SQL.append("  T02 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T02, 1, SQL, PFL_PARAMETRI_TIPPAGPERCAS, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T02, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~ROWNAMESPESE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_PARAMETRI_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_PARAMETRI_SPESE, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI554", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI554, IMDBDef9.PQRY_PARAMETRI554_RS, IMDBDef2.TBL_PARAMETRI566);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPPAGPERCAS, IMDBDef2.FLD_PARAMETRI566_RONATIPAPECA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SPESE, IMDBDef2.FLD_PARAMETRI566_ROWNAMESPESE);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI566");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_AfterBlobUpdate(Column, Size, Extension);
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
    if (SrcObj == PAN_IMPORTFILE) PAN_IMPORTFILE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
