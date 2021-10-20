// **********************************************
// Testi Stampe
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TestiStampe extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_TIPOSTAMPA1 = 0;
  private static int PFL_PARAMETRI_NUMMAXRIGHE = 1;
  private static int PFL_PARAMETRI_DIMFONTDEFAU = 2;

  private static int PPQRY_PARAMETRI92 = 0;

  private static int PPQRY_TIPISTAMPE = 1;

  private static int PPQRY_TIPISTAMPE1 = 2;


  IDPanel PAN_PARAMETRI;
  private static int PFL_TESTISTAMPE_TIPOSTAMPA = 0;
  private static int PFL_TESTISTAMPE_PROGR = 1;
  private static int PFL_TESTISTAMPE_TESTO = 2;
  private static int PFL_TESTISTAMPE_GRASSETTO = 3;
  private static int PFL_TESTISTAMPE_CORSIVO = 4;
  private static int PFL_TESTISTAMPE_SOTTOLIN = 5;
  private static int PFL_TESTISTAMPE_DIMFONT = 6;

  private static int PPQRY_TESTISTAMPE = 0;


  IDPanel PAN_TESTISTAMPE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI109(IMDB);
    //
    //
    Init_PQRY_PARAMETRI92(IMDB);
    Init_PQRY_PARAMETRI92_RS(IMDB);
    Init_PQRY_TESTISTAMPE(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI109(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI109, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI109, "TBL_PARAMETRI109");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI109,IMDBDef1.FLD_PARAMETRI109_NOMOGGTIPSTA, "NOMOGGTIPSTA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI109,IMDBDef1.FLD_PARAMETRI109_NOMOGGTIPSTA,5,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI109,IMDBDef1.FLD_PARAMETRI109_NOMOGGTISTOL, "NOMOGGTISTOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI109,IMDBDef1.FLD_PARAMETRI109_NOMOGGTISTOL,5,4,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI109, 0);
  }

  private static void Init_PQRY_PARAMETRI92(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI92, 1);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI92, "PQRY_PARAMETRI92");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI92,IMDBDef9.PQSL_PARAMETRI92_NOMOGGTIPSTA, "NOMOGGTIPSTA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI92,IMDBDef9.PQSL_PARAMETRI92_NOMOGGTIPSTA,5,4,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI92, 0);
  }

  private static void Init_PQRY_PARAMETRI92_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI92_RS, 1);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI92_RS, "PQRY_PARAMETRI92_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI92_RS,IMDBDef9.PQSL_PARAMETRI92_NOMOGGTIPSTA, "NOMOGGTIPSTA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI92_RS,IMDBDef9.PQSL_PARAMETRI92_NOMOGGTIPSTA,5,4,0);
  }

  private static void Init_PQRY_TESTISTAMPE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_TESTISTAMPE, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_TESTISTAMPE, "PQRY_TESTISTAMPE");
    IMDB.set_FldCode(IMDBDef9.PQRY_TESTISTAMPE,IMDBDef9.PQSL_TESTISTAMPE_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef9.PQRY_TESTISTAMPE,IMDBDef9.PQSL_TESTISTAMPE_TIPO_STAMPA,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_TESTISTAMPE,IMDBDef9.PQSL_TESTISTAMPE_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef9.PQRY_TESTISTAMPE,IMDBDef9.PQSL_TESTISTAMPE_PROGRESSIVO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_TESTISTAMPE,IMDBDef9.PQSL_TESTISTAMPE_TESTO, "TESTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_TESTISTAMPE,IMDBDef9.PQSL_TESTISTAMPE_TESTO,5,2000,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_TESTISTAMPE,IMDBDef9.PQSL_TESTISTAMPE_GRASSETTO, "GRASSETTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_TESTISTAMPE,IMDBDef9.PQSL_TESTISTAMPE_GRASSETTO,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_TESTISTAMPE,IMDBDef9.PQSL_TESTISTAMPE_CORSIVO, "CORSIVO");
    IMDB.SetFldParams(IMDBDef9.PQRY_TESTISTAMPE,IMDBDef9.PQSL_TESTISTAMPE_CORSIVO,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_TESTISTAMPE,IMDBDef9.PQSL_TESTISTAMPE_SOTTOLINEATO, "SOTTOLINEATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_TESTISTAMPE,IMDBDef9.PQSL_TESTISTAMPE_SOTTOLINEATO,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_TESTISTAMPE,IMDBDef9.PQSL_TESTISTAMPE_DIMENSIONE_FONT, "DIMENSIONE_FONT");
    IMDB.SetFldParams(IMDBDef9.PQRY_TESTISTAMPE,IMDBDef9.PQSL_TESTISTAMPE_DIMENSIONE_FONT,1,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_TESTISTAMPE, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TestiStampe(MyWebEntryPoint w, IMDBObj imdb)
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
  public TestiStampe()
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
    FormIdx = MyGlb.FRM_TESTISTAMPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C2402091-4AAC-4277-9ED2-136407D7B2E2";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 696;
    DesignHeight = 390;
    set_Caption(new IDVariant("Testi Stampe"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 696;
    Frames[1].Height = 364;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.142857;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 696;
    Frames[2].Height = 52;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 696;
    Frames[2].FixedHeight = 52;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 696-MyGlb.PAN_OFFS_X, 52-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C141576B-6F6F-43C6-A3BF-79F89578285E");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 408, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 696;
    Frames[3].Height = 312;
    Frames[3].Caption = "Testi Stampe";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 312;
    PAN_TESTISTAMPE = new IDPanel(w, this, 3, "PAN_TESTISTAMPE");
    Frames[3].Content = PAN_TESTISTAMPE;
    PAN_TESTISTAMPE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TESTISTAMPE.VS = MainFrm.VisualStyleList;
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 696-MyGlb.PAN_OFFS_X, 312-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TESTISTAMPE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BB295797-D8F0-4938-A9EF-FE43C0B00DD3");
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 640, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TESTISTAMPE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TESTISTAMPE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TESTISTAMPE.InitStatus = 1;
    PAN_TESTISTAMPE_Init();
    PAN_TESTISTAMPE_InitFields();
    PAN_TESTISTAMPE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARAMETRI109, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        TESTISTAMPE_PARAMETRI92();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_TESTISTAMPE.UpdatePanel(MainFrm);
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
    return (obj instanceof TestiStampe);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TestiStampe.class.getName() : (Glb.ClassWithPackage(TestiStampe.class) ? TestiStampe.class.getName().substring(TestiStampe.class.getPackage().getName().length() + 1) : TestiStampe.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_TIPOSTAMPA1)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef9.PQRY_PARAMETRI92, IMDBDef9.PQSL_PARAMETRI92_NOMOGGTIPSTA, 0).compareTo(IMDB.Value(IMDBDef1.TBL_PARAMETRI109, IMDBDef1.FLD_PARAMETRI109_NOMOGGTISTOL, 0), true)!=0)
        {
          if (new IDVariant(PAN_TESTISTAMPE.Status()).equals((new IDVariant(3)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Modifiche in sospeso. Confermare e ripetere l'operazione!"));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI92, IMDBDef9.PQSL_PARAMETRI92_NOMOGGTIPSTA, 0, PAN_PARAMETRI.GetLastValue(PFL_PARAMETRI_TIPOSTAMPA1));
          }
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI109, IMDBDef1.FLD_PARAMETRI109_NOMOGGTISTOL, 0, IMDB.Value(IMDBDef9.PQRY_PARAMETRI92, IMDBDef9.PQSL_PARAMETRI92_NOMOGGTIPSTA, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TestiStampe", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Testi Stampe On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_TESTISTAMPE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Testi Stampe On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_TESTISTAMPE, IMDBDef9.PQSL_TESTISTAMPE_TIPO_STAMPA, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_TESTISTAMPE, IMDBDef9.PQSL_TESTISTAMPE_TIPO_STAMPA, 0, IMDB.Value(IMDBDef9.PQRY_PARAMETRI92, IMDBDef9.PQSL_PARAMETRI92_NOMOGGTIPSTA, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_TESTISTAMPE, IMDBDef9.PQSL_TESTISTAMPE_DIMENSIONE_FONT, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_TESTISTAMPE, IMDBDef9.PQSL_TESTISTAMPE_DIMENSIONE_FONT, 0, IDL.ToInteger((new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_DIMFONTDEFAU)))));
        }
      }
      if (Column.equals((new IDVariant(PFL_TESTISTAMPE_PROGR)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_MAXRIGHE = new IDVariant(0,IDVariant.INTEGER);
        v_MAXRIGHE = IDL.ToInteger(IDL.NullValue((new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_NUMMAXRIGHE))),(new IDVariant("0"))));
        if (v_MAXRIGHE.equals((new IDVariant(0)), true))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Numero Massimo di Righe per questa Tipologia di Stampa non corretto.Contattare l'amministratore del sistema!"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          IMDB.set_Value(IMDBDef9.PQRY_TESTISTAMPE, IMDBDef9.PQSL_TESTISTAMPE_PROGRESSIVO, 0, (new IDVariant()));
        }
        else
        {
          if (IMDB.Value(IMDBDef9.PQRY_TESTISTAMPE, IMDBDef9.PQSL_TESTISTAMPE_PROGRESSIVO, 0).compareTo(v_MAXRIGHE, true)>0 || IMDB.Value(IMDBDef9.PQRY_TESTISTAMPE, IMDBDef9.PQSL_TESTISTAMPE_PROGRESSIVO, 0).compareTo((new IDVariant(1)), true)<0)
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Il Progressivo deve essere compreso tra 1 e "));
            MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, (new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_NUMMAXRIGHE))))); 
            IMDB.set_Value(IMDBDef9.PQRY_TESTISTAMPE, IMDBDef9.PQSL_TESTISTAMPE_PROGRESSIVO, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TestiStampe", "TestiStampeOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Testi Stampe On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TESTISTAMPE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TESTISTAMPE);
      // 
      // Testi Stampe On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (PAN_TESTISTAMPE.IsNewRow())
      {
        PAN_TESTISTAMPE.SetFlags (Glb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_TESTISTAMPE.SetFlags (Glb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_TESTISTAMPE.set_ToolTip(Glb.OBJ_FIELD,PFL_TESTISTAMPE_TESTO,(new IDVariant(PAN_TESTISTAMPE.FieldText(PFL_TESTISTAMPE_TESTO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TestiStampe", "TestiStampeOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Testi Stampe On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_TESTISTAMPE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_TESTISTAMPE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Testi Stampe On Database Error Body
      // Corpo Procedura
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TestiStampe", "TestiStampeOnDatabaseError", _e);
    }
  }

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
      PAN_TESTISTAMPE.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      IDVariant v_TIPOSTAMPA = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.CODICE) as MINTIPSTACOD ");
      SQL.append("from ");
      SQL.append("  TIPI_STAMPE A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_TIPOSTAMPA = QV.Get("MINTIPSTACOD", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI109, IMDBDef1.FLD_PARAMETRI109_NOMOGGTIPSTA, 0, new IDVariant(v_TIPOSTAMPA));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI109, IMDBDef1.FLD_PARAMETRI109_NOMOGGTISTOL, 0, new IDVariant(v_TIPOSTAMPA));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TestiStampe", "Load", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void TESTISTAMPE_PARAMETRI92() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAMETRI92_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI109, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARAMETRI109, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI92_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAMETRI92_RS, 0, IMDBDef1.TBL_PARAMETRI109, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI92_RS, 0, 0, IMDBDef1.TBL_PARAMETRI109, IMDBDef1.FLD_PARAMETRI109_NOMOGGTIPSTA, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARAMETRI109, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARAMETRI109, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI109, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAMETRI92_RS, 0);
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
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TESTISTAMPE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TESTISTAMPE, Cancel);
    // Stub
  }

  private void PAN_TESTISTAMPE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TESTISTAMPE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_TESTISTAMPE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_TESTISTAMPE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TESTISTAMPE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTAMPA1, "53FE2696-F2FD-48C5-8C74-9DC3695E196C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTAMPA1, "Tipo Stampa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTAMPA1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTAMPA1, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTAMPA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMMAXRIGHE, "10D33E8A-A04B-4D1B-9A16-20F54C03D1A5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMMAXRIGHE, "NUM MAX RIGHE");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMMAXRIGHE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMMAXRIGHE, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMMAXRIGHE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DIMFONTDEFAU, "8CFC82AF-4D31-44B6-9259-E45F62FD37BD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DIMFONTDEFAU, " DIM FONT DEFAULT");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DIMFONTDEFAU, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DIMFONTDEFAU, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DIMFONTDEFAU, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTAMPA1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTAMPA1, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTAMPA1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTAMPA1, MyGlb.PANEL_LIST, "Tp. Stam.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTAMPA1, MyGlb.PANEL_FORM, 20, 12, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTAMPA1, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTAMPA1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSTAMPA1, MyGlb.PANEL_FORM, "Tipo Stampa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOSTAMPA1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOSTAMPA1, PPQRY_PARAMETRI92, "A.NOMOGGTIPSTA", "NOMOGGTIPSTA", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMMAXRIGHE, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMMAXRIGHE, MyGlb.PANEL_LIST, 176);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMMAXRIGHE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMMAXRIGHE, MyGlb.PANEL_LIST, "NUM MAX RIGHE");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMMAXRIGHE, MyGlb.PANEL_FORM, 496, 12, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMMAXRIGHE, MyGlb.PANEL_FORM, 176);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMMAXRIGHE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMMAXRIGHE, MyGlb.PANEL_FORM, "NUM MAX RIGHE");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMMAXRIGHE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMMAXRIGHE, PPQRY_TIPISTAMPE, "A.NUM_MAX_RIGHE", "TIPSTANUMARI", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DIMFONTDEFAU, MyGlb.PANEL_LIST, 0, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DIMFONTDEFAU, MyGlb.PANEL_LIST, 192);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DIMFONTDEFAU, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DIMFONTDEFAU, MyGlb.PANEL_LIST, " DIM FONT DEFAULT");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DIMFONTDEFAU, MyGlb.PANEL_FORM, 556, 12, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DIMFONTDEFAU, MyGlb.PANEL_FORM, 192);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DIMFONTDEFAU, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DIMFONTDEFAU, MyGlb.PANEL_FORM, " DIM FONT DEFAULT");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DIMFONTDEFAU, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DIMFONTDEFAU, PPQRY_TIPISTAMPE, "A.DIM_FONT_DEFAULT", "TIPSTADIFODE", 1, 2, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUM_MAX_RIGHE as TIPSTANUMARI, ");
    SQL.append("  A.DIM_FONT_DEFAULT as TIPSTADIFODE ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE A ");
    SQL.append("where (A.CODICE = ~~NOMOGGTIPSTA~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPISTAMPE, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_TIPISTAMPE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_TIPISTAMPE, "TIPI_STAMPE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPISTAMCODI, ");
    SQL.append("  A.DESCRIZIONE as TIPISTAMDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE A ");
    SQL.append("where (A.CODICE = ~~NOMOGGTIPSTA~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPISTAMPE1, 0, SQL, PFL_PARAMETRI_TIPOSTAMPA1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPISTAMCODI, ");
    SQL.append("  A.DESCRIZIONE as TIPISTAMDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_STAMPE A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPISTAMPE1, 1, SQL, PFL_PARAMETRI_TIPOSTAMPA1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_TIPISTAMPE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI92", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI92, IMDBDef9.PQRY_PARAMETRI92_RS, IMDBDef1.TBL_PARAMETRI109);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOSTAMPA1, IMDBDef1.FLD_PARAMETRI109_NOMOGGTIPSTA);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI109");
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

  private void PAN_TESTISTAMPE_Init()
  {

    PAN_TESTISTAMPE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TESTISTAMPE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TESTISTAMPE.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_TESTISTAMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TIPOSTAMPA, "75420312-8AC4-4E1D-815C-EE4CAEB3A873");
    PAN_TESTISTAMPE.set_Header(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TIPOSTAMPA, "TIPO STAMPA");
    PAN_TESTISTAMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TIPOSTAMPA, "");
    PAN_TESTISTAMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TIPOSTAMPA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_TESTISTAMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TIPOSTAMPA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_TESTISTAMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, "95253FBC-4340-4F04-A6C8-E92BD909E7B5");
    PAN_TESTISTAMPE.set_Header(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, "Progr.");
    PAN_TESTISTAMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, "");
    PAN_TESTISTAMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, MyGlb.VIS_NORMALFIELDS);
    PAN_TESTISTAMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_TESTISTAMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TESTO, "FC5CD311-A957-445C-8016-A344C228F1C1");
    PAN_TESTISTAMPE.set_Header(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TESTO, "Testo");
    PAN_TESTISTAMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TESTO, "");
    PAN_TESTISTAMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TESTO, MyGlb.VIS_NORMALFIELDS);
    PAN_TESTISTAMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TESTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_TESTISTAMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_GRASSETTO, "F4FAD955-6996-4E58-963C-822CEEED3D88");
    PAN_TESTISTAMPE.set_Header(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_GRASSETTO, "Grassetto");
    PAN_TESTISTAMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_GRASSETTO, "");
    PAN_TESTISTAMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_GRASSETTO, MyGlb.VIS_CHECKSTYLE);
    PAN_TESTISTAMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_GRASSETTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TESTISTAMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_CORSIVO, "AC20F57F-9391-41FC-B851-CC53455425C2");
    PAN_TESTISTAMPE.set_Header(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_CORSIVO, "Corsivo");
    PAN_TESTISTAMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_CORSIVO, "");
    PAN_TESTISTAMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_CORSIVO, MyGlb.VIS_CHECKSTYLE);
    PAN_TESTISTAMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_CORSIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TESTISTAMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_SOTTOLIN, "7185CC68-D7BC-4852-90A7-D1C7FF33DFE9");
    PAN_TESTISTAMPE.set_Header(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_SOTTOLIN, "Sottolin.");
    PAN_TESTISTAMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_SOTTOLIN, "");
    PAN_TESTISTAMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_SOTTOLIN, MyGlb.VIS_CHECKSTYLE);
    PAN_TESTISTAMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_SOTTOLIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_TESTISTAMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_DIMFONT, "215361DA-D36E-41EE-8AA2-C42AC2EA9468");
    PAN_TESTISTAMPE.set_Header(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_DIMFONT, "Dim. Font");
    PAN_TESTISTAMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_DIMFONT, "");
    PAN_TESTISTAMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_DIMFONT, MyGlb.VIS_NORMFIELPADR);
    PAN_TESTISTAMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_DIMFONT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TESTISTAMPE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TIPOSTAMPA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TIPOSTAMPA, MyGlb.PANEL_LIST, 88);
    PAN_TESTISTAMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_TESTISTAMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TIPOSTAMPA, MyGlb.PANEL_LIST, "TP. STM.");
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TIPOSTAMPA, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TIPOSTAMPA, MyGlb.PANEL_FORM, 120);
    PAN_TESTISTAMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_TESTISTAMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TIPOSTAMPA, MyGlb.PANEL_FORM, "TIPO STAMPA");
    PAN_TESTISTAMPE.SetFieldPage(PFL_TESTISTAMPE_TIPOSTAMPA, -1, -1);
    PAN_TESTISTAMPE.SetFieldPanel(PFL_TESTISTAMPE_TIPOSTAMPA, PPQRY_TESTISTAMPE, "A.TIPO_STAMPA", "TIPO_STAMPA", 5, 4, 0, -13997);
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, MyGlb.PANEL_LIST, 88);
    PAN_TESTISTAMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, MyGlb.PANEL_LIST, 1);
    PAN_TESTISTAMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, MyGlb.PANEL_LIST, "Progr.");
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, MyGlb.PANEL_FORM, 4, 28, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, MyGlb.PANEL_FORM, 120);
    PAN_TESTISTAMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, MyGlb.PANEL_FORM, 1);
    PAN_TESTISTAMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_PROGR, MyGlb.PANEL_FORM, "Progr.");
    PAN_TESTISTAMPE.SetFieldPage(PFL_TESTISTAMPE_PROGR, -1, -1);
    PAN_TESTISTAMPE.SetFieldPanel(PFL_TESTISTAMPE_PROGR, PPQRY_TESTISTAMPE, "A.PROGRESSIVO", "PROGRESSIVO", 1, 2, 0, -13997);
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TESTO, MyGlb.PANEL_LIST, 44, 36, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TESTO, MyGlb.PANEL_LIST, 128);
    PAN_TESTISTAMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TESTO, MyGlb.PANEL_LIST, 1);
    PAN_TESTISTAMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TESTO, MyGlb.PANEL_LIST, "Testo");
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TESTO, MyGlb.PANEL_FORM, 4, 52, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TESTO, MyGlb.PANEL_FORM, 120);
    PAN_TESTISTAMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TESTO, MyGlb.PANEL_FORM, 2);
    PAN_TESTISTAMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_TESTO, MyGlb.PANEL_FORM, "Testo");
    PAN_TESTISTAMPE.SetFieldPage(PFL_TESTISTAMPE_TESTO, -1, -1);
    PAN_TESTISTAMPE.SetFieldPanel(PFL_TESTISTAMPE_TESTO, PPQRY_TESTISTAMPE, "A.TESTO", "TESTO", 5, 2000, 0, -13997);
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_GRASSETTO, MyGlb.PANEL_LIST, 412, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_GRASSETTO, MyGlb.PANEL_LIST, 76);
    PAN_TESTISTAMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_GRASSETTO, MyGlb.PANEL_LIST, 1);
    PAN_TESTISTAMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_GRASSETTO, MyGlb.PANEL_LIST, "Grassetto");
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_GRASSETTO, MyGlb.PANEL_FORM, 4, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_GRASSETTO, MyGlb.PANEL_FORM, 120);
    PAN_TESTISTAMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_GRASSETTO, MyGlb.PANEL_FORM, 1);
    PAN_TESTISTAMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_GRASSETTO, MyGlb.PANEL_FORM, "Grassetto");
    PAN_TESTISTAMPE.SetFieldPage(PFL_TESTISTAMPE_GRASSETTO, -1, -1);
    PAN_TESTISTAMPE.SetFieldPanel(PFL_TESTISTAMPE_GRASSETTO, PPQRY_TESTISTAMPE, "A.GRASSETTO", "GRASSETTO", 5, 2, 0, -13997);
    PAN_TESTISTAMPE.SetValueListItem(PFL_TESTISTAMPE_GRASSETTO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TESTISTAMPE.SetValueListItem(PFL_TESTISTAMPE_GRASSETTO, (new IDVariant()), "Null", "", "", -1);
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_CORSIVO, MyGlb.PANEL_LIST, 476, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_CORSIVO, MyGlb.PANEL_LIST, 60);
    PAN_TESTISTAMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_CORSIVO, MyGlb.PANEL_LIST, 1);
    PAN_TESTISTAMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_CORSIVO, MyGlb.PANEL_LIST, "Corsivo");
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_CORSIVO, MyGlb.PANEL_FORM, 4, 100, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_CORSIVO, MyGlb.PANEL_FORM, 120);
    PAN_TESTISTAMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_CORSIVO, MyGlb.PANEL_FORM, 1);
    PAN_TESTISTAMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_CORSIVO, MyGlb.PANEL_FORM, "Corsivo");
    PAN_TESTISTAMPE.SetFieldPage(PFL_TESTISTAMPE_CORSIVO, -1, -1);
    PAN_TESTISTAMPE.SetFieldPanel(PFL_TESTISTAMPE_CORSIVO, PPQRY_TESTISTAMPE, "A.CORSIVO", "CORSIVO", 5, 2, 0, -13997);
    PAN_TESTISTAMPE.SetValueListItem(PFL_TESTISTAMPE_CORSIVO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TESTISTAMPE.SetValueListItem(PFL_TESTISTAMPE_CORSIVO, (new IDVariant()), "Null", "", "", -1);
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_SOTTOLIN, MyGlb.PANEL_LIST, 540, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_SOTTOLIN, MyGlb.PANEL_LIST, 92);
    PAN_TESTISTAMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_SOTTOLIN, MyGlb.PANEL_LIST, 1);
    PAN_TESTISTAMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_SOTTOLIN, MyGlb.PANEL_LIST, "Sottolin.");
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_SOTTOLIN, MyGlb.PANEL_FORM, 4, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_SOTTOLIN, MyGlb.PANEL_FORM, 120);
    PAN_TESTISTAMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_SOTTOLIN, MyGlb.PANEL_FORM, 1);
    PAN_TESTISTAMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_SOTTOLIN, MyGlb.PANEL_FORM, "Sottolin.");
    PAN_TESTISTAMPE.SetFieldPage(PFL_TESTISTAMPE_SOTTOLIN, -1, -1);
    PAN_TESTISTAMPE.SetFieldPanel(PFL_TESTISTAMPE_SOTTOLIN, PPQRY_TESTISTAMPE, "A.SOTTOLINEATO", "SOTTOLINEATO", 5, 2, 0, -13997);
    PAN_TESTISTAMPE.SetValueListItem(PFL_TESTISTAMPE_SOTTOLIN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TESTISTAMPE.SetValueListItem(PFL_TESTISTAMPE_SOTTOLIN, (new IDVariant()), "Null", "", "", -1);
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_DIMFONT, MyGlb.PANEL_LIST, 604, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_DIMFONT, MyGlb.PANEL_LIST, 108);
    PAN_TESTISTAMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_DIMFONT, MyGlb.PANEL_LIST, 1);
    PAN_TESTISTAMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_DIMFONT, MyGlb.PANEL_LIST, "Dim. Font");
    PAN_TESTISTAMPE.SetRect(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_DIMFONT, MyGlb.PANEL_FORM, 4, 148, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TESTISTAMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_DIMFONT, MyGlb.PANEL_FORM, 120);
    PAN_TESTISTAMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_DIMFONT, MyGlb.PANEL_FORM, 1);
    PAN_TESTISTAMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TESTISTAMPE_DIMFONT, MyGlb.PANEL_FORM, "Dim. Font");
    PAN_TESTISTAMPE.SetFieldPage(PFL_TESTISTAMPE_DIMFONT, -1, -1);
    PAN_TESTISTAMPE.SetFieldPanel(PFL_TESTISTAMPE_DIMFONT, PPQRY_TESTISTAMPE, "A.DIMENSIONE_FONT", "DIMENSIONE_FONT", 1, 2, 0, -13997);
  }

  private void PAN_TESTISTAMPE_InitQueries()
  {
    StringBuffer SQL;

    PAN_TESTISTAMPE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TESTISTAMPE.SetIMDB(IMDB, "PQRY_TESTISTAMPE", true);
    PAN_TESTISTAMPE.set_SetString(MyGlb.MASTER_ROWNAME, "TESTI STAMPE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_STAMPA as TIPO_STAMPA, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.TESTO as TESTO, ");
    SQL.append("  A.GRASSETTO as GRASSETTO, ");
    SQL.append("  A.CORSIVO as CORSIVO, ");
    SQL.append("  A.SOTTOLINEATO as SOTTOLINEATO, ");
    SQL.append("  A.DIMENSIONE_FONT as DIMENSIONE_FONT ");
    PAN_TESTISTAMPE.SetQuery(PPQRY_TESTISTAMPE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  TESTI_STAMPE A ");
    PAN_TESTISTAMPE.SetQuery(PPQRY_TESTISTAMPE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO_STAMPA = ~~PQRY_PARAMETRI92.NOMOGGTIPSTA~~) ");
    PAN_TESTISTAMPE.SetQuery(PPQRY_TESTISTAMPE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TESTISTAMPE.SetQuery(PPQRY_TESTISTAMPE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TESTISTAMPE.SetQuery(PPQRY_TESTISTAMPE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_TESTISTAMPE.SetQuery(PPQRY_TESTISTAMPE, 5, SQL, -1, "");
    PAN_TESTISTAMPE.SetQueryDB(PPQRY_TESTISTAMPE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TESTISTAMPE.SetMasterTable(0, "TESTI_STAMPE");
    PAN_TESTISTAMPE.AddToSortList(PFL_TESTISTAMPE_PROGR, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TESTISTAMPE.Status() == 2)
    {
      int oldListQBE = PAN_TESTISTAMPE.iUseListQBE;
      PAN_TESTISTAMPE.iUseListQBE = 0;
      PAN_TESTISTAMPE.PanelCommand(Glb.PCM_SEARCH);
      PAN_TESTISTAMPE.PanelCommand(Glb.PCM_FIND);
      PAN_TESTISTAMPE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_TESTISTAMPE) PAN_TESTISTAMPE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_TESTISTAMPE) PAN_TESTISTAMPE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_TESTISTAMPE) PAN_TESTISTAMPE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_TESTISTAMPE) PAN_TESTISTAMPE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_TESTISTAMPE) PAN_TESTISTAMPE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
