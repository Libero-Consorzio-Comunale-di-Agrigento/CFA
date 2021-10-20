// **********************************************
// Verifica Anomalie
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VerificaAnomalie extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_ANOMALIA = 0;
  private static int PFL_PARS_PARTE = 1;
  private static int PFL_PARS_TIPO = 2;
  private static int PFL_PARS_ETICTOOLANOM = 3;
  private static int PFL_PARS_ETICHEELABOR = 4;
  private static int PFL_PARS_ETICHEBONIFI = 5;

  private static int PPQRY_PARS42 = 0;


  IDPanel PAN_PARS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS43(IMDB);
    //
    //
    Init_PQRY_PARS42(IMDB);
    Init_PQRY_PARS42_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS43(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS43, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS43, "TBL_PARS43");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS43,IMDBDef3.FLD_PARS43_NOMEOGGEANOM, "NOMEOGGEANOM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS43,IMDBDef3.FLD_PARS43_NOMEOGGEANOM,12,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS43,IMDBDef3.FLD_PARS43_NOMEOGGEPART, "NOMEOGGEPART");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS43,IMDBDef3.FLD_PARS43_NOMEOGGEPART,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS43,IMDBDef3.FLD_PARS43_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS43,IMDBDef3.FLD_PARS43_NOMEOGGETIPO,5,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS43, 0);
  }

  private static void Init_PQRY_PARS42(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS42, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS42, "PQRY_PARS42");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS42,IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, "NOMEOGGEANOM");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS42,IMDBDef12.PQSL_PARS42_NOMEOGGEANOM,12,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS42,IMDBDef12.PQSL_PARS42_NOMEOGGEPART, "NOMEOGGEPART");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS42,IMDBDef12.PQSL_PARS42_NOMEOGGEPART,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS42,IMDBDef12.PQSL_PARS42_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS42,IMDBDef12.PQSL_PARS42_NOMEOGGETIPO,5,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARS42, 0);
  }

  private static void Init_PQRY_PARS42_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS42_RS, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS42_RS, "PQRY_PARS42_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS42_RS,IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, "NOMEOGGEANOM");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS42_RS,IMDBDef12.PQSL_PARS42_NOMEOGGEANOM,12,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS42_RS,IMDBDef12.PQSL_PARS42_NOMEOGGEPART, "NOMEOGGEPART");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS42_RS,IMDBDef12.PQSL_PARS42_NOMEOGGEPART,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS42_RS,IMDBDef12.PQSL_PARS42_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS42_RS,IMDBDef12.PQSL_PARS42_NOMEOGGETIPO,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VerificaAnomalie(MyWebEntryPoint w, IMDBObj imdb)
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
  public VerificaAnomalie()
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
    FormIdx = MyGlb.FRM_VERIFIANOMAL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9C2BF7A0-8401-482C-9570-F0858E991EE7";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 620;
    DesignHeight = 178;
    set_Caption(new IDVariant("Verifica Anomalie"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 620;
    Frames[1].Height = 152;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Pars";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 152;
    PAN_PARS = new IDPanel(w, this, 1, "PAN_PARS");
    Frames[1].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 620-MyGlb.PAN_OFFS_X, 152-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F7FE8C48-93FA-410D-A14C-65AFB8B52AAC");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 392, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 1;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARS43, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VERIFIANOMAL_PARS42();
      }
      PAN_PARS.UpdatePanel(MainFrm);
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
    return (obj instanceof VerificaAnomalie);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VerificaAnomalie.class.getName() : (Glb.ClassWithPackage(VerificaAnomalie.class) ? VerificaAnomalie.class.getName().substring(VerificaAnomalie.class.getPackage().getName().length() + 1) : VerificaAnomalie.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Pars On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARS);
      // 
      // Pars On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("I")), true))
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TIPO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TIPO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("S")), true))
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICTOOLANOM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICTOOLANOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if ((IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("R")), true)) || (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("C")), true)) || (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("F")), true)) || (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("A")), true)))
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICHEBONIFI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICHEBONIFI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaAnomalie", "ParsOnDynamicProperties", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGEPART, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGETIPO, 0, (new IDVariant("E")));
      PAN_PARS.ClearValueList(PFL_PARS_ANOMALIA);
      PAN_PARS.SetValueListItem(PFL_PARS_ANOMALIA, (new IDVariant("R")), ((new IDVariant("R")).equals((new IDVariant("R")))? new IDVariant("Residui aperti senza stanziamento") : (new IDVariant("R")).equals((new IDVariant("F")))? new IDVariant("Residui aperti senza stanziamento per i Finanziamenti") : (new IDVariant("R")).equals((new IDVariant("C")))? new IDVariant("Capitoli con Assestato in Eserc. Precedente") : (new IDVariant("R")).equals((new IDVariant("A")))? new IDVariant("Capitoli con Assestato in Eserc. Precedente per i Finanziamenti") : (new IDVariant("R")).equals((new IDVariant("I")))? new IDVariant("Impegnato/Accertato superiore Stanziamento Simulato") : (new IDVariant("R")).equals((new IDVariant("S")))? new IDVariant("Capitoli sottoarticolati con stanziamento/residui su art. 0") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        PAN_PARS.SetValueListItem(PFL_PARS_ANOMALIA, (new IDVariant("F")), ((new IDVariant("F")).equals((new IDVariant("R")))? new IDVariant("Residui aperti senza stanziamento") : (new IDVariant("F")).equals((new IDVariant("F")))? new IDVariant("Residui aperti senza stanziamento per i Finanziamenti") : (new IDVariant("F")).equals((new IDVariant("C")))? new IDVariant("Capitoli con Assestato in Eserc. Precedente") : (new IDVariant("F")).equals((new IDVariant("A")))? new IDVariant("Capitoli con Assestato in Eserc. Precedente per i Finanziamenti") : (new IDVariant("F")).equals((new IDVariant("I")))? new IDVariant("Impegnato/Accertato superiore Stanziamento Simulato") : (new IDVariant("F")).equals((new IDVariant("S")))? new IDVariant("Capitoli sottoarticolati con stanziamento/residui su art. 0") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      PAN_PARS.SetValueListItem(PFL_PARS_ANOMALIA, (new IDVariant("C")), ((new IDVariant("C")).equals((new IDVariant("R")))? new IDVariant("Residui aperti senza stanziamento") : (new IDVariant("C")).equals((new IDVariant("F")))? new IDVariant("Residui aperti senza stanziamento per i Finanziamenti") : (new IDVariant("C")).equals((new IDVariant("C")))? new IDVariant("Capitoli con Assestato in Eserc. Precedente") : (new IDVariant("C")).equals((new IDVariant("A")))? new IDVariant("Capitoli con Assestato in Eserc. Precedente per i Finanziamenti") : (new IDVariant("C")).equals((new IDVariant("I")))? new IDVariant("Impegnato/Accertato superiore Stanziamento Simulato") : (new IDVariant("C")).equals((new IDVariant("S")))? new IDVariant("Capitoli sottoarticolati con stanziamento/residui su art. 0") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        PAN_PARS.SetValueListItem(PFL_PARS_ANOMALIA, (new IDVariant("A")), ((new IDVariant("A")).equals((new IDVariant("R")))? new IDVariant("Residui aperti senza stanziamento") : (new IDVariant("A")).equals((new IDVariant("F")))? new IDVariant("Residui aperti senza stanziamento per i Finanziamenti") : (new IDVariant("A")).equals((new IDVariant("C")))? new IDVariant("Capitoli con Assestato in Eserc. Precedente") : (new IDVariant("A")).equals((new IDVariant("A")))? new IDVariant("Capitoli con Assestato in Eserc. Precedente per i Finanziamenti") : (new IDVariant("A")).equals((new IDVariant("I")))? new IDVariant("Impegnato/Accertato superiore Stanziamento Simulato") : (new IDVariant("A")).equals((new IDVariant("S")))? new IDVariant("Capitoli sottoarticolati con stanziamento/residui su art. 0") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      PAN_PARS.SetValueListItem(PFL_PARS_ANOMALIA, (new IDVariant("I")), ((new IDVariant("I")).equals((new IDVariant("R")))? new IDVariant("Residui aperti senza stanziamento") : (new IDVariant("I")).equals((new IDVariant("F")))? new IDVariant("Residui aperti senza stanziamento per i Finanziamenti") : (new IDVariant("I")).equals((new IDVariant("C")))? new IDVariant("Capitoli con Assestato in Eserc. Precedente") : (new IDVariant("I")).equals((new IDVariant("A")))? new IDVariant("Capitoli con Assestato in Eserc. Precedente per i Finanziamenti") : (new IDVariant("I")).equals((new IDVariant("I")))? new IDVariant("Impegnato/Accertato superiore Stanziamento Simulato") : (new IDVariant("I")).equals((new IDVariant("S")))? new IDVariant("Capitoli sottoarticolati con stanziamento/residui su art. 0") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_PARS.SetValueListItem(PFL_PARS_ANOMALIA, (new IDVariant("S")), ((new IDVariant("S")).equals((new IDVariant("R")))? new IDVariant("Residui aperti senza stanziamento") : (new IDVariant("S")).equals((new IDVariant("F")))? new IDVariant("Residui aperti senza stanziamento per i Finanziamenti") : (new IDVariant("S")).equals((new IDVariant("C")))? new IDVariant("Capitoli con Assestato in Eserc. Precedente") : (new IDVariant("S")).equals((new IDVariant("A")))? new IDVariant("Capitoli con Assestato in Eserc. Precedente per i Finanziamenti") : (new IDVariant("S")).equals((new IDVariant("I")))? new IDVariant("Impegnato/Accertato superiore Stanziamento Simulato") : (new IDVariant("S")).equals((new IDVariant("S")))? new IDVariant("Capitoli sottoarticolati con stanziamento/residui su art. 0") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaAnomalie", "Load", _e);
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
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaAnomalie", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGEANOM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGEPART, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGETIPO, 0, new IDVariant());
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
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Anomalia obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      if (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("R")), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Anomalie_Residui_aperti"));
        v_NOMESTAMPA = new IDVariant(S);
      }
      else if (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("F")), true))
      {
        IDVariant S = null;
        S = (new IDVariant("Anomalie_Residui_aperti_Finanziamenti"));
        v_NOMESTAMPA = new IDVariant(S);
      }
      else if (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("C")), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Capitoli_Ass_Eserc_Prec"));
        v_NOMESTAMPA = new IDVariant(S);
      }
      else if (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("A")), true))
      {
        IDVariant S = null;
        S = (new IDVariant("Capitoli_Ass_Eserc_Prec_Finanziamenti"));
        v_NOMESTAMPA = new IDVariant(S);
      }
      else if (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("S")), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Capitoli_Stn_Res_Art"));
        v_NOMESTAMPA = new IDVariant(S);
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("ImpAcc_sup_Simu"));
        v_NOMESTAMPA = new IDVariant(S);
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ES")), IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEPART, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      if (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).compareTo((new IDVariant("I")), true)!=0)
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPO")), IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGETIPO, 0));
      }
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaAnomalie", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Bonifica
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaBonifica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Bonifica Body
      // Corpo Procedura
      // 
      IDVariant v_PARTE = new IDVariant(0,IDVariant.STRING);
      if (IMDB.Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGEPART, 0).equals((new IDVariant("S")), true))
      {
        v_PARTE = (new IDVariant("di Spesa "));
      }
      else if (IMDB.Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGEPART, 0).equals((new IDVariant("E")), true))
      {
        v_PARTE = (new IDVariant("di Entrata "));
      }
      else
      {
        v_PARTE = (new IDVariant(""));
      }
      IDVariant v_BILANCIO = new IDVariant(0,IDVariant.STRING);
      if (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGETIPO, 0).equals((new IDVariant("E")), true))
      {
        v_BILANCIO = (new IDVariant("Effettivo"));
      }
      else
      {
        v_BILANCIO = (new IDVariant("Simulato"));
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("R")), true))
      {
        if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Verrà inserito lo Stanziamento ")), v_BILANCIO), (new IDVariant(" a Zero per i Capitoli "))), v_PARTE), (new IDVariant("con Residui aperti! Vuoi Continuare?"))))))
        {
          return 0;
        }
        IDVariant v_NONINSERITI1 = new IDVariant(0,IDVariant.INTEGER);
        MainFrm.Cf4armDBObject.INSSTNZERORESIDUI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGETIPO, 0), IMDB.Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGEPART, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_NONINSERITI1);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        if (v_NONINSERITI1.compareTo((new IDVariant(0)), true)>0)
        {
          if (v_NONINSERITI1.equals((new IDVariant(1)), true))
          {
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Rimane ")), IDL.ToString(v_NONINSERITI1)), (new IDVariant(" Stanziamento di Bilancio "))), v_BILANCIO), (new IDVariant(" non inserito, perchè non esiste il relativo Capitolo."))), (new IDVariant("\n"))), (new IDVariant("Prima di rilanciare la Bonifica inserire il Capitolo nel Piano dei Conti per l'esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
          }
          else
          {
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Rimangono ")), IDL.ToString(v_NONINSERITI1)), (new IDVariant(" Stanziamenti di Bilancio "))), v_BILANCIO), (new IDVariant(" non inseriti, perchè non esiste il relativo Capitolo."))), (new IDVariant("\n"))), (new IDVariant("Prima di rilanciare la Bonifica inserire i Capitoli nel Piano dei Conti per l'esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
          }
        }
        else
        {
          MainFrm.set_AlertMessage((new IDVariant("Bonifica completata"))); 
        }
      }
      else if (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("F")), true))
      {
        if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Verrà inserito lo Stanziamento ")), v_BILANCIO), (new IDVariant(" a Zero dei Finanziamenti, per i Capitoli "))), v_PARTE), (new IDVariant("con Residui aperti! Vuoi Continuare?"))))))
        {
          return 0;
        }
        IDVariant v_NONINSERITI1 = new IDVariant(0,IDVariant.INTEGER);
        MainFrm.Cf4armDBObject.INSSTNZERORESIDUIFIN(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGETIPO, 0), IMDB.Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGEPART, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_NONINSERITI1);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        if (v_NONINSERITI1.compareTo((new IDVariant(0)), true)>0)
        {
          if (v_NONINSERITI1.equals((new IDVariant(1)), true))
          {
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Rimane ")), IDL.ToString(v_NONINSERITI1)), (new IDVariant(" Stanziamento di Bilancio "))), v_BILANCIO), (new IDVariant(" per i Finanziamenti non inserito, perchè non esiste il relativo Capitolo."))), (new IDVariant("\n"))), (new IDVariant("Prima di rilanciare la Bonifica inserire il Capitolo nel Piano dei Conti per l'esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
          }
          else
          {
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Rimangono ")), IDL.ToString(v_NONINSERITI1)), (new IDVariant(" Stanziamenti di Bilancio "))), v_BILANCIO), (new IDVariant(" per i Finanziamenti non inseriti, perchè non esiste il relativo Capitolo."))), (new IDVariant("\n"))), (new IDVariant("Prima di rilanciare la Bonifica inserire i Capitoli nel Piano dei Conti per l'esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
          }
        }
        else
        {
          MainFrm.set_AlertMessage((new IDVariant("Bonifica completata"))); 
        }
      }
      else if (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("C")), true))
      {
        if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Verrà inserito lo Stanziamento ")), v_BILANCIO), (new IDVariant(" a Zero per i Capitoli "))), v_PARTE), (new IDVariant("con Assestato in Esercizio Precedente! Vuoi Continuare?"))))))
        {
          return 0;
        }
        IDVariant v_NONINSERITI2 = new IDVariant(0,IDVariant.INTEGER);
        MainFrm.Cf4armDBObject.INSSTNZEROASSESESEPREC(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGETIPO, 0), IMDB.Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGEPART, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_NONINSERITI2);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        if (v_NONINSERITI2.compareTo((new IDVariant(0)), true)>0)
        {
          if (v_NONINSERITI2.equals((new IDVariant(1)), true))
          {
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Rimane ")), IDL.ToString(v_NONINSERITI2)), (new IDVariant(" Stanziamento di Bilancio "))), v_BILANCIO), (new IDVariant(" non inserito, perchè non esiste il relativo Capitolo."))), (new IDVariant("\n"))), (new IDVariant("Prima di rilanciare la Bonifica inserire il Capitolo nel Piano dei Conti per l'esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
          }
          else
          {
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Rimangono ")), IDL.ToString(v_NONINSERITI2)), (new IDVariant(" Stanziamenti di Bilancio "))), v_BILANCIO), (new IDVariant(" non inseriti, perchè non esiste il relativo Capitolo."))), (new IDVariant("\n"))), (new IDVariant("Prima di rilanciare la Bonifica inserire i Capitoli nel Piano dei Conti per l'esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
          }
        }
        else
        {
          MainFrm.set_AlertMessage((new IDVariant("Bonifica completata"))); 
        }
      }
      else if (IMDB.Value(IMDBDef12.PQRY_PARS42, IMDBDef12.PQSL_PARS42_NOMEOGGEANOM, 0).equals((new IDVariant("A")), true))
      {
        // 
        // Finanziamenti
        // 
        if (!(MainFrm.MessageConfirm(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Verrà inserito lo Stanziamento ")), v_BILANCIO), (new IDVariant(" a Zero dei Finanziamenti, per i Capitoli "))), v_PARTE), (new IDVariant("con Assestato in Esercizio Precedente! Vuoi Continuare?"))))))
        {
          return 0;
        }
        IDVariant v_NONINSERITI2 = new IDVariant(0,IDVariant.INTEGER);
        MainFrm.Cf4armDBObject.INSSTNZEROASSESESEPRECF(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGETIPO, 0), IMDB.Value(IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGEPART, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_NONINSERITI2);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        if (v_NONINSERITI2.compareTo((new IDVariant(0)), true)>0)
        {
          if (v_NONINSERITI2.equals((new IDVariant(1)), true))
          {
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Rimane ")), IDL.ToString(v_NONINSERITI2)), (new IDVariant(" Stanziamento di Bilancio "))), v_BILANCIO), (new IDVariant(" per i Finanziamenti non inserito, perchè non esiste il relativo Capitolo."))), (new IDVariant("\n"))), (new IDVariant("Prima di rilanciare la Bonifica inserire il Capitolo nel Piano dei Conti per l'esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
          }
          else
          {
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Rimangono ")), IDL.ToString(v_NONINSERITI2)), (new IDVariant(" Stanziamenti di Bilancio "))), v_BILANCIO), (new IDVariant(" per i Finanziamenti non inseriti, perchè non esiste il relativo Capitolo."))), (new IDVariant("\n"))), (new IDVariant("Prima di rilanciare la Bonifica inserire i Capitoli nel Piano dei Conti per l'esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
          }
        }
        else
        {
          MainFrm.set_AlertMessage((new IDVariant("Bonifica completata"))); 
        }
      }
      else
      {
        IDVariant S = null;
        S = (new IDVariant("Bonifica Anomalia non Abilitata"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VerificaAnomalie", "EtichettaBonifica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void VERIFIANOMAL_PARS42() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARS42_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARS43, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARS43, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARS42_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARS42_RS, 0, IMDBDef3.TBL_PARS43, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS42_RS, 0, 0, IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGEANOM, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS42_RS, 1, 0, IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGEPART, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS42_RS, 2, 0, IMDBDef3.TBL_PARS43, IMDBDef3.FLD_PARS43_NOMEOGGETIPO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARS43, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARS43, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARS43, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARS42_RS, 0);
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARS_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARS_ETICHEBONIFI)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaBonifica();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ANOMALIA, "F0B833D1-8D74-4BED-A818-52DCC599626F");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ANOMALIA, "Anomalia");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ANOMALIA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ANOMALIA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ANOMALIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_PARTE, "920273AB-0610-46FA-ACB4-37823AA352D4");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_PARTE, "Parte");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_PARTE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, "D9BA3DA5-AB95-4EC6-8155-F2764D20FD9B");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, "Tipo Bilancio");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICTOOLANOM, "514DF90A-FCD4-4667-B475-5F1534BA5B2D");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICTOOLANOM, "Elenco dei capitoli con articolo 0 (zero), articolati, che hanno stanziamento e/o residui sull’articolo 0.\n\n");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICTOOLANOM, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICTOOLANOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "9C78F26B-5D71-4A67-98DB-5AA2F764A1D0");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "Visualizza");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEBONIFI, "EBCA64DE-1937-4A80-A84A-488C9F869B14");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEBONIFI, "Bonifica Anomalia");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEBONIFI, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEBONIFI, 0, "button1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEBONIFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANOMALIA, MyGlb.PANEL_LIST, 0, 36, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANOMALIA, MyGlb.PANEL_LIST, 64);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANOMALIA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANOMALIA, MyGlb.PANEL_LIST, "Anomalia");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANOMALIA, MyGlb.PANEL_FORM, 4, 16, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANOMALIA, MyGlb.PANEL_FORM, 80);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANOMALIA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANOMALIA, MyGlb.PANEL_FORM, "Anomalia");
    PAN_PARS.SetFieldPage(PFL_PARS_ANOMALIA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ANOMALIA, PPQRY_PARS42, "A.NOMEOGGEANOM", "NOMEOGGEANOM", 12, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_ANOMALIA, (new IDVariant("R")), "Residui aperti senza stanziamento", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_ANOMALIA, (new IDVariant("F")), "Residui aperti senza stanziamento per i Finanziamenti", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_ANOMALIA, (new IDVariant("C")), "Capitoli con Assestato in Eserc. Precedente", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_ANOMALIA, (new IDVariant("A")), "Capitoli con Assestato in Eserc. Precedente per i Finanziamenti", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_ANOMALIA, (new IDVariant("I")), "Impegnato/Accertato superiore Stanziamento Simulato", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_ANOMALIA, (new IDVariant("S")), "Capitoli sottoarticolati con stanziamento/residui su art. 0", "Elenco dei capitoli con articolo 0 (zero), articolati, che hanno stanziamento e/o residui sull’articolo 0.\n\n", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PARTE, MyGlb.PANEL_LIST, 40);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PARTE, MyGlb.PANEL_FORM, 36, 44, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PARTE, MyGlb.PANEL_FORM, 48);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARS.SetFieldPage(PFL_PARS_PARTE, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_PARTE, PPQRY_PARS42, "A.NOMEOGGEPART", "NOMEOGGEPART", 5, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_PARTE, (new IDVariant("E")), "Entrata", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_PARTE, (new IDVariant("S")), "Spesa", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_PARTE, (new IDVariant("ES")), "Tutte", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_LIST, "Tp. Bilan.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_FORM, 4, 72, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_FORM, 80);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_FORM, "Tipo Bilancio");
    PAN_PARS.SetFieldPage(PFL_PARS_TIPO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TIPO, PPQRY_PARS42, "A.NOMEOGGETIPO", "NOMEOGGETIPO", 5, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_TIPO, (new IDVariant("E")), "Effettivo", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_TIPO, (new IDVariant("S")), "Simulato", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICTOOLANOM, MyGlb.PANEL_LIST, 8, 104, 288, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICTOOLANOM, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICTOOLANOM, MyGlb.PANEL_LIST, 2);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICTOOLANOM, MyGlb.PANEL_FORM, 16, 104, 312, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICTOOLANOM, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICTOOLANOM, MyGlb.PANEL_FORM, 2);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICTOOLANOM, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICTOOLANOM, -1, "", "ETICTOOLANOM", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 276, 80, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 332, 104, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHEELABOR, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEBONIFI, MyGlb.PANEL_LIST, 284, 88, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEBONIFI, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEBONIFI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEBONIFI, MyGlb.PANEL_FORM, 424, 104, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEBONIFI, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEBONIFI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHEBONIFI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHEBONIFI, -1, "", "ETICHEBONIFI", 0, 0, 0, -13997);
    PAN_PARS.set_ImageResizeMode(PFL_PARS_ETICHEBONIFI, 3);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS42", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS42, IMDBDef12.PQRY_PARS42_RS, IMDBDef3.TBL_PARS43);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ANOMALIA, IMDBDef3.FLD_PARS43_NOMEOGGEANOM);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_PARTE, IMDBDef3.FLD_PARS43_NOMEOGGEPART);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_TIPO, IMDBDef3.FLD_PARS43_NOMEOGGETIPO);
    PAN_PARS.SetMasterTable(0, "PARS43");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
