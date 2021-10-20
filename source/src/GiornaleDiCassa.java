// **********************************************
// Giornale Di Cassa
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GiornaleDiCassa extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_DATAFLUSSO = 0;

  private static int PFL_PARAMETRI_SCARICATO = 0;
  private static int PFL_PARAMETRI_ELABORATO = 1;
  private static int PFL_PARAMETRI_DATAFLUSSDAL = 2;
  private static int PFL_PARAMETRI_DATAFLUSSOAL = 3;

  private static int PPQRY_PARAMETRI595 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_GIORNDICASSA_IDELABORAZIO = 0;
  private static int PFL_GIORNDICASSA_VISUALIZHTML = 1;
  private static int PFL_GIORNDICASSA_ESERCIZIO = 2;
  private static int PFL_GIORNDICASSA_DATAFLUSSO = 3;
  private static int PFL_GIORNDICASSA_IDFLUSSOBT = 4;
  private static int PFL_GIORNDICASSA_CODABIBT = 5;
  private static int PFL_GIORNDICASSA_DATAINIZPERI = 6;
  private static int PFL_GIORNDICASSA_DATAFINEPERI = 7;
  private static int PFL_GIORNDICASSA_STATO = 8;
  private static int PFL_GIORNDICASSA_APRIPROVSPES = 9;
  private static int PFL_GIORNDICASSA_APRIPROVENTR = 10;
  private static int PFL_GIORNDICASSA_APRIPAGAMENT = 11;
  private static int PFL_GIORNDICASSA_APRIINCASSI = 12;
  private static int PFL_GIORNDICASSA_IDGDM = 13;
  private static int PFL_GIORNDICASSA_FILEXML = 14;
  private static int PFL_GIORNDICASSA_PAGINA = 15;

  private static int PPQRY_ELABORAZIOPI = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_GIORNDICASSA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI596(IMDB);
    //
    //
    Init_PQRY_PARAMETRI595(IMDB);
    Init_PQRY_PARAMETRI595_RS(IMDB);
    Init_PQRY_ELABORAZIOPI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI596(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI596, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI596, "TBL_PARAMETRI596");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI596,IMDBDef6.FLD_PARAMETRI596_PARAMSCARICA, "PARAMSCARICA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI596,IMDBDef6.FLD_PARAMETRI596_PARAMSCARICA,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI596,IMDBDef6.FLD_PARAMETRI596_PARAMELABORA, "PARAMELABORA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI596,IMDBDef6.FLD_PARAMETRI596_PARAMELABORA,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI596,IMDBDef6.FLD_PARAMETRI596_PARDATFLUDAL, "PARDATFLUDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI596,IMDBDef6.FLD_PARAMETRI596_PARDATFLUDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI596,IMDBDef6.FLD_PARAMETRI596_PARADATFLUAL, "PARADATFLUAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI596,IMDBDef6.FLD_PARAMETRI596_PARADATFLUAL,6,10,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI596, 0);
  }

  private static void Init_PQRY_PARAMETRI595(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI595, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI595, "PQRY_PARAMETRI595");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI595,IMDBDef15.PQSL_PARAMETRI595_PARAMSCARICA, "PARAMSCARICA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI595,IMDBDef15.PQSL_PARAMETRI595_PARAMSCARICA,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI595,IMDBDef15.PQSL_PARAMETRI595_PARAMELABORA, "PARAMELABORA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI595,IMDBDef15.PQSL_PARAMETRI595_PARAMELABORA,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI595,IMDBDef15.PQSL_PARAMETRI595_PARDATFLUDAL, "PARDATFLUDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI595,IMDBDef15.PQSL_PARAMETRI595_PARDATFLUDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI595,IMDBDef15.PQSL_PARAMETRI595_PARADATFLUAL, "PARADATFLUAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI595,IMDBDef15.PQSL_PARAMETRI595_PARADATFLUAL,6,10,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI595, 0);
  }

  private static void Init_PQRY_PARAMETRI595_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI595_RS, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI595_RS, "PQRY_PARAMETRI595_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI595_RS,IMDBDef15.PQSL_PARAMETRI595_PARAMSCARICA, "PARAMSCARICA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI595_RS,IMDBDef15.PQSL_PARAMETRI595_PARAMSCARICA,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI595_RS,IMDBDef15.PQSL_PARAMETRI595_PARAMELABORA, "PARAMELABORA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI595_RS,IMDBDef15.PQSL_PARAMETRI595_PARAMELABORA,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI595_RS,IMDBDef15.PQSL_PARAMETRI595_PARDATFLUDAL, "PARDATFLUDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI595_RS,IMDBDef15.PQSL_PARAMETRI595_PARDATFLUDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI595_RS,IMDBDef15.PQSL_PARAMETRI595_PARADATFLUAL, "PARADATFLUAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI595_RS,IMDBDef15.PQSL_PARAMETRI595_PARADATFLUAL,6,10,0);
  }

  private static void Init_PQRY_ELABORAZIOPI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ELABORAZIOPI, 12);
    IMDB.set_TblCode(IMDBDef15.PQRY_ELABORAZIOPI, "PQRY_ELABORAZIOPI");
    IMDB.set_FldCode(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELABOPIIDELA, "ELABOPIIDELA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELABOPIIDELA,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_VISUALIZHTML, "VISUALIZHTML");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_VISUALIZHTML,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIDATFLU, "ELAOPIDATFLU");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIDATFLU,6,0,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIIDFLBT, "ELAOPIIDFLBT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIIDFLBT,5,500,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELAOPICOABBT, "ELAOPICOABBT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELAOPICOABBT,5,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIDAINPE, "ELAOPIDAINPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIDAINPE,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIDAFIPE, "ELAOPIDAFIPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIDAFIPE,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELABOOPISTAT, "ELABOOPISTAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELABOOPISTAT,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELABOPIIDGDM, "ELABOPIIDGDM");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELABOPIIDGDM,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIFILXML, "ELAOPIFILXML");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIFILXML,9,9999,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELABOOPIESER, "ELABOOPIESER");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELABOOPIESER,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELABOOPIPAGI, "ELABOOPIPAGI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELABORAZIOPI,IMDBDef15.PQSL_ELABORAZIOPI_ELABOOPIPAGI,1,9,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ELABORAZIOPI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GiornaleDiCassa(MyWebEntryPoint w, IMDBObj imdb)
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
  public GiornaleDiCassa()
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
    FormIdx = MyGlb.FRM_GIORNDICASSA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "11F77AC2-9588-43DA-8E0B-379989BBB07B";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1076;
    DesignHeight = 478;
    set_Caption(new IDVariant("Giornale di Cassa"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1076;
    Frames[1].Height = 452;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.141593;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1076;
    Frames[2].Height = 64;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 64;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1076-MyGlb.PAN_OFFS_X, 64-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "657B621C-0454-4483-93F7-771BA9689E4F");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 344, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1076;
    Frames[3].Height = 388;
    Frames[3].Caption = "Giornale di Cassa";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 388;
    PAN_GIORNDICASSA = new IDPanel(w, this, 3, "PAN_GIORNDICASSA");
    Frames[3].Content = PAN_GIORNDICASSA;
    PAN_GIORNDICASSA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_GIORNDICASSA.VS = MainFrm.VisualStyleList;
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1076-MyGlb.PAN_OFFS_X, 388-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4B3DB8C4-903E-4B7F-9F6F-ADAE2A0D42E3");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 948, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_GIORNDICASSA.InitStatus = 2;
    PAN_GIORNDICASSA_Init();
    PAN_GIORNDICASSA_InitFields();
    PAN_GIORNDICASSA_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG178+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG177+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG178+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SCARICFLUSSI+BaseCmdLinIdx)
      {
        ScaricaFlussi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELABORFLUSSI+BaseCmdLinIdx)
      {
        ElaboraFlussi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELENCOANOMA4+BaseCmdLinIdx)
      {
        ElencoAnomalie();
        break fine;
      }
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI596, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GIORNDICASSA_PARAMETRI595();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_GIORNDICASSA.UpdatePanel(MainFrm);
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
    return (obj instanceof GiornaleDiCassa);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GiornaleDiCassa.class.getName() : (Glb.ClassWithPackage(GiornaleDiCassa.class) ? GiornaleDiCassa.class.getName().substring(GiornaleDiCassa.class.getPackage().getName().length() + 1) : GiornaleDiCassa.class.getName()));
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
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI596, IMDBDef6.FLD_PARAMETRI596_PARAMSCARICA, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI596, IMDBDef6.FLD_PARAMETRI596_PARAMELABORA, 0, (new IDVariant()));
      PAN_GIORNDICASSA.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_GIORNDICASSA.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_GIORNDICASSA.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
      IDVariant v_VVALORE = null;
      v_VVALORE = (new IDVariant("NO"));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.VALORE, 'NO') as NULVALREVANO ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = 'PRODUCTS/INTEGRAZIONE_ENTRANEXT') ");
      SQL.append("and   (A.STRINGA = 'ATTIVA_INTEGRAZIONE') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VVALORE = QV.Get("NULVALREVANO", IDVariant.STRING) ;
      }
      QV.Close();
      if (IDL.NullValue(v_VVALORE,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SCARICFLUSSI+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELABORFLUSSI+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SCARICFLUSSI+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELABORFLUSSI+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleDiCassa", "Load", _e);
    }
  }

  // **********************************************************************
  // Visualizza Html
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int VisualizzaHtml ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Html Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_ELABORAZIOPI, IMDBDef15.PQSL_ELABORAZIOPI_ELABOPIIDGDM, 0),(new IDVariant(-1))).compareTo((new IDVariant(-1)), true)!=0)
      {
        IDVariant v_URLGDMSIOFLU = new IDVariant(0,IDVariant.STRING);
        v_URLGDMSIOFLU = (new IDVariant("/siope/visualizza/xml?iddoc="));
        MainFrm.set_RedirectTo(IDL.Add(IDL.Add(MainFrm.URLWSGDMSIOP, v_URLGDMSIOFLU), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_ELABORAZIOPI, IMDBDef15.PQSL_ELABORAZIOPI_ELABOPIIDGDM, 0))));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleDiCassa", "VisualizzaHtml", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scarica Flussi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ScaricaFlussi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scarica Flussi Body
      // Corpo Procedura
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.RICERCA_GIORNALI();
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Elaborazione Eseguita"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        PAN_GIORNDICASSA.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleDiCassa", "ScaricaFlussi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora Flussi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ElaboraFlussi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;
    IDCachedRowSet C9;

    try
    {
      TransCount = 0;
      // 
      // Elabora Flussi Body
      // Corpo Procedura
      // 
      IDVariant v_ELABORESEGUI = new IDVariant(0,IDVariant.STRING);
      v_ELABORESEGUI = (new IDVariant("Elaborazione Eseguita"));
      IDVariant v_MESSAGESERCI = null;
      v_MESSAGESERCI = (new IDVariant());
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
      C2 = PAN_GIORNDICASSA.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_GIORNDICASSA.GotoFirst();
      while (!PAN_GIORNDICASSA.RSEOF())
      {
        if (PAN_GIORNDICASSA.IsRowSelected(I.intValue()) && C2.Get("ELABOOPISTAT").equals((new IDVariant("SCARICATO")), true))
        {
          v_SELEZIONATO = (new IDVariant(-1));
          if (C2.Get("ELABOOPIESER").compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
          {
            IDVariant v_AVVISOESERCI = new IDVariant(0,IDVariant.STRING);
            v_AVVISOESERCI = (new IDVariant("Esercizio del Tracciato diverso da Esercizio del Contesto"));
            v_MESSAGESERCI = IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Flusso: ")), C2.Get("ELAOPIIDFLBT")), (new IDVariant("<BR/>"))), v_AVVISOESERCI), (new IDVariant("<BR/>")));
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_GIORNDICASSA.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (!(v_SELEZIONATO.booleanValue()))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non e' stato selezionato nessun documento in stato SCARICATO"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if (!(IDL.IsNull(v_MESSAGESERCI)))
      {
        MainFrm.set_AlertMessage(v_MESSAGESERCI); 
        return 0;
      }
      I = (new IDVariant(1));
      C9 = PAN_GIORNDICASSA.MasterRS();
      if (C9.size()>0) CurPos = C9.getRow(); else CurPos = 0;
      if (!C9.Bof()) PAN_GIORNDICASSA.GotoFirst();
      while (!PAN_GIORNDICASSA.RSEOF())
      {
        if (PAN_GIORNDICASSA.IsRowSelected(I.intValue()))
        {
          if (C9.Get("ELABOOPISTAT").equals((new IDVariant("SCARICATO")), true))
          {
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.CARICAINCINFTESOOPI(C9.Get("ELABOPIIDELA"), IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), C9.Get("ELAOPIIDFLBT"), C9.Get("ELAOPIDATFLU"));
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("ID ELABORAZIONE: "));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(C9.Get("ELABOPIIDELA"))), (new IDVariant("<BR/>"))), (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
              PAN_GIORNDICASSA.PanelCommand(Glb.PCM_REQUERY);
              return 0;
            }
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.CARICAPAGAMINFTESOOPI(C9.Get("ELABOPIIDELA"), IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), C9.Get("ELAOPIIDFLBT"), C9.Get("ELAOPIDATFLU"));
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("ID ELABORAZIONE: "));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(C9.Get("ELABOPIIDELA"))), (new IDVariant("<BR/>"))), (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
              PAN_GIORNDICASSA.PanelCommand(Glb.PCM_REQUERY);
              return 0;
            }
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.CARICAORDPROVOPI(C9.Get("ELABOPIIDELA"), IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), C9.Get("ELAOPIIDFLBT"), C9.Get("ELAOPIDATFLU"));
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("ID ELABORAZIONE: "));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(C9.Get("ELABOPIIDELA"))), (new IDVariant("<BR/>"))), (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
              PAN_GIORNDICASSA.PanelCommand(Glb.PCM_REQUERY);
              return 0;
            }
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.CARICAMANPROVOPI(C9.Get("ELABOPIIDELA"), IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant()), C9.Get("ELAOPIIDFLBT"), C9.Get("ELAOPIDATFLU"));
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("ID ELABORAZIONE: "));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(C9.Get("ELABOPIIDELA"))), (new IDVariant("<BR/>"))), (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
              PAN_GIORNDICASSA.PanelCommand(Glb.PCM_REQUERY);
              return 0;
            }
            SQL = new StringBuffer();
            SQL.append("update ELABORAZIONI_OPI set ");
            SQL.append("  STATO = 'ELABORATO' ");
            SQL.append("where (ID_ELABORAZIONE = " + IDL.CSql(C9.Get("ELABOPIIDELA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_GIORNDICASSA.GotoNext();
      }
      if (CurPos>0) C9.absolute(CurPos);
      MainFrm.set_AlertMessage(v_ELABORESEGUI); 
      PAN_GIORNDICASSA.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleDiCassa", "ElaboraFlussi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elenco Anomalie
  // **********************************************************************
  public int ElencoAnomalie ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Anomalie Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_ELENERROAUTO, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_ELENERROAUTO,(new IDVariant(0)).booleanValue()); 
      }
      IMDB.set_Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMEFASE, 0, (new IDVariant("TUTTI")));
      IMDB.set_Value(IMDBDef6.TBL_NEWTABLE, IMDBDef6.FLD_NEWTABLE_ROWNAMEDATA, 0, IMDB.Value(IMDBDef15.PQRY_ELABORAZIOPI, IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIDATFLU, 0));
      MainFrm.Show(MyGlb.FRM_ELENERROAUTO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleDiCassa", "ElencoAnomalie", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Provv Spesa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriProvvSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Provv Spesa Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ELABORAZIOPI, IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIIDFLBT, 0))))
      {
        MainFrm.UnloadForm(MyGlb.FRM_AGGIPROVMAND,(new IDVariant(0)).booleanValue()); 
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI318, IMDBDef5.FLD_PARAMETRI318_PARAENTRSPES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI318, IMDBDef5.FLD_PARAMETRI318_PARANCPROREG, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef5.TBL_PARAMEFLUSS3, IMDBDef5.FLD_PARAMEFLUSS3_IDFLUSSOBT, 0, IMDB.Value(IMDBDef15.PQRY_ELABORAZIOPI, IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIIDFLBT, 0));
        MainFrm.Show(MyGlb.FRM_AGGIPROVMAND, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleDiCassa", "ApriProvvSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Provv Entrata
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriProvvEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Provv Entrata Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ELABORAZIOPI, IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIIDFLBT, 0))))
      {
        MainFrm.UnloadForm(MyGlb.FRM_AGGIPROVORDI,(new IDVariant(0)).booleanValue()); 
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI393, IMDBDef5.FLD_PARAMETRI393_PARAENTRSPES, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI393, IMDBDef5.FLD_PARAMETRI393_PARANCPROREG, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef5.TBL_PARAMEFLUSS5, IMDBDef5.FLD_PARAMEFLUSS5_IDFLUSSOBT, 0, IMDB.Value(IMDBDef15.PQRY_ELABORAZIOPI, IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIIDFLBT, 0));
        MainFrm.Show(MyGlb.FRM_AGGIPROVORDI, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleDiCassa", "ApriProvvEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Pagamenti
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriPagamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Pagamenti Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAME, IMDBDef5.FLD_PARAMEPAGAME_ROWNAMIDFLBT, 0, IMDB.Value(IMDBDef15.PQRY_ELABORAZIOPI, IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIIDFLBT, 0));
      MainFrm.Show(MyGlb.FRM_PAGMANPERFLU, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleDiCassa", "ApriPagamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Incassi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriIncassi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Incassi Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI616, IMDBDef5.FLD_PARAMETRI616_PARAIDFLUSBT, 0, IMDB.Value(IMDBDef15.PQRY_ELABORAZIOPI, IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIIDFLBT, 0));
      MainFrm.Show(MyGlb.FRM_INCASPERFLUS, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleDiCassa", "ApriIncassi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void GIORNDICASSA_PARAMETRI595() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI595_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI596, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI596, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI595_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI595_RS, 0, IMDBDef6.TBL_PARAMETRI596, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI595_RS, 0, 0, IMDBDef6.TBL_PARAMETRI596, IMDBDef6.FLD_PARAMETRI596_PARAMSCARICA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI595_RS, 1, 0, IMDBDef6.TBL_PARAMETRI596, IMDBDef6.FLD_PARAMETRI596_PARAMELABORA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI595_RS, 2, 0, IMDBDef6.TBL_PARAMETRI596, IMDBDef6.FLD_PARAMETRI596_PARDATFLUDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI595_RS, 3, 0, IMDBDef6.TBL_PARAMETRI596, IMDBDef6.FLD_PARAMETRI596_PARADATFLUAL, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI596, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI596, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI596, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI595_RS, 0);
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_GIORNDICASSA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_GIORNDICASSA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_GIORNDICASSA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_GIORNDICASSA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_GIORNDICASSA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_GIORNDICASSA);
    // Stub
  }

  private void PAN_GIORNDICASSA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_GIORNDICASSA_VISUALIZHTML)
    {
      this.IdxPanelActived = this.PAN_GIORNDICASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      VisualizzaHtml();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GIORNDICASSA_APRIPROVSPES)
    {
      this.IdxPanelActived = this.PAN_GIORNDICASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProvvSpesa();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GIORNDICASSA_APRIPROVENTR)
    {
      this.IdxPanelActived = this.PAN_GIORNDICASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProvvEntrata();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GIORNDICASSA_APRIPAGAMENT)
    {
      this.IdxPanelActived = this.PAN_GIORNDICASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPagamenti();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GIORNDICASSA_APRIINCASSI)
    {
      this.IdxPanelActived = this.PAN_GIORNDICASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriIncassi();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_GIORNDICASSA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_GIORNDICASSA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_ELABORAZIOPI, IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIFILXML, 0)))
      {
        IMDB.set_Value(IMDBDef15.PQRY_ELABORAZIOPI, IMDBDef15.PQSL_ELABORAZIOPI_ELAOPIFILXML, 0, (new IDVariant("empty_clob()")));
      }
      if (Cancel.isFalse())
      {
        PAN_GIORNDICASSA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAFLUSSO, "7969E63C-CC6B-44CB-B6B2-E676D8ADC1EF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAFLUSSO, "Data Flusso");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAFLUSSO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAFLUSSO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAFLUSSO, MyGlb.PANEL_LIST, 0, -9999, 96, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAFLUSSO, MyGlb.PANEL_FORM, 136, 7, 244, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAFLUSSO, 0, 65);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAFLUSSO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAFLUSSO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAFLUSSO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAFLUSSO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCARICATO, "66C161FA-C461-4B3A-95DE-B45BBD6FF4F4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCARICATO, "Scaricato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCARICATO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCARICATO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCARICATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORATO, "8F694C49-3B3E-4B28-92FC-620D985FC876");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORATO, "Elaborato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORATO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORATO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSDAL, "09B20718-57D1-4030-B96D-DA45479BF287");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSDAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSDAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSOAL, "255F7980-2028-48A2-A2BA-4C2FF29C832D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSOAL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSOAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSOAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSOAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCARICATO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCARICATO, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCARICATO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCARICATO, MyGlb.PANEL_LIST, "Scaricato");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCARICATO, MyGlb.PANEL_FORM, 24, 8, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCARICATO, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCARICATO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCARICATO, MyGlb.PANEL_FORM, "Scaricato");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCARICATO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCARICATO, PPQRY_PARAMETRI595, "A.PARAMSCARICA", "PARAMSCARICA", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SCARICATO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SCARICATO, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORATO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORATO, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORATO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORATO, MyGlb.PANEL_LIST, "Elaborato");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORATO, MyGlb.PANEL_FORM, 32, 32, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORATO, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORATO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORATO, MyGlb.PANEL_FORM, "Elaborato");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORATO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORATO, PPQRY_PARAMETRI595, "A.PARAMELABORA", "PARAMELABORA", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ELABORATO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ELABORATO, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSDAL, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSDAL, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSDAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSDAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSDAL, MyGlb.PANEL_FORM, 140, 32, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSDAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSDAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSDAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAFLUSSDAL, -1, GRP_PARAMETRI_DATAFLUSSO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAFLUSSDAL, PPQRY_PARAMETRI595, "A.PARDATFLUDAL", "PARDATFLUDAL", 6, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSOAL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSOAL, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSOAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSOAL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSOAL, MyGlb.PANEL_FORM, 264, 32, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSOAL, MyGlb.PANEL_FORM, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSOAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAFLUSSOAL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAFLUSSOAL, -1, GRP_PARAMETRI_DATAFLUSSO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAFLUSSOAL, PPQRY_PARAMETRI595, "A.PARADATFLUAL", "PARADATFLUAL", 6, 10, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI595", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI595, IMDBDef15.PQRY_PARAMETRI595_RS, IMDBDef6.TBL_PARAMETRI596);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SCARICATO, IMDBDef6.FLD_PARAMETRI596_PARAMSCARICA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ELABORATO, IMDBDef6.FLD_PARAMETRI596_PARAMELABORA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAFLUSSDAL, IMDBDef6.FLD_PARAMETRI596_PARDATFLUDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAFLUSSOAL, IMDBDef6.FLD_PARAMETRI596_PARADATFLUAL);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI596");
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

  private void PAN_GIORNDICASSA_Init()
  {

    PAN_GIORNDICASSA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_GIORNDICASSA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_GIORNDICASSA.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDELABORAZIO, "0E9E31C3-A22C-43FC-BBC9-A4AD3F0C3B30");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDELABORAZIO, "ID ELABORAZIONE");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDELABORAZIO, "");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDELABORAZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDELABORAZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_VISUALIZHTML, "BF600987-701C-473A-8C2C-4F944EE6949B");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_VISUALIZHTML, " ");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_VISUALIZHTML, "Visualizza Html Giornale di Cassa");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_VISUALIZHTML, MyGlb.VIS_HYPELINKIMMA);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_VISUALIZHTML, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_ESERCIZIO, "45EDE0B5-2EF3-4F55-B424-4E156F6AD334");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_ESERCIZIO, "Esercizio Flusso");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_ESERCIZIO, "");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_ESERCIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFLUSSO, "96923830-4203-40A6-AA66-8B59B388247F");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFLUSSO, "Data Flusso");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFLUSSO, "");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFLUSSO, MyGlb.VIS_NORMALFIELDS);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFLUSSO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDFLUSSOBT, "70D1DC92-ADD0-434A-9F03-B441C3332FDE");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDFLUSSOBT, "Id Flusso BT");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDFLUSSOBT, "");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDFLUSSOBT, MyGlb.VIS_NORMALFIELDS);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDFLUSSOBT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_CODABIBT, "6FCC3913-8C24-4FAB-9099-5360FF147450");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_CODABIBT, "ABI BT");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_CODABIBT, "");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_CODABIBT, MyGlb.VIS_NORMALFIELDS);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_CODABIBT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAINIZPERI, "496BD354-B902-4E62-BF45-3E4442AE5C62");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAINIZPERI, "Data Giornale Cassa");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAINIZPERI, "");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAINIZPERI, MyGlb.VIS_NORMALFIELDS);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAINIZPERI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFINEPERI, "8446DA7E-4843-4A75-8A80-599C2D540F3A");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFINEPERI, "Data Fine Periodo");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFINEPERI, "");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFINEPERI, MyGlb.VIS_NORMALFIELDS);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFINEPERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_STATO, "A2D637FE-B149-4562-9568-CF4D0C4FC33F");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_STATO, "Stato");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_STATO, "");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_STATO, MyGlb.VIS_NORMALFIELDS);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_STATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVSPES, "EBEC6677-465C-4047-B580-E4364A463574");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVSPES, " ");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVSPES, "Dettaglio Provvisori di Spesa");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVSPES, MyGlb.VIS_HYPELINKIMMA);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVSPES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVENTR, "8BD02CDB-1B15-4266-8DA5-706FAF43C0E7");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVENTR, " ");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVENTR, "Dettaglio Provvisori di Entrata");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVENTR, MyGlb.VIS_HYPELINKIMMA);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVENTR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPAGAMENT, "42B513A3-A535-4638-B739-B1BFD0FCD3B1");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPAGAMENT, " ");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPAGAMENT, "Dettaglio Pagamenti");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPAGAMENT, MyGlb.VIS_HYPELINKIMMA);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPAGAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIINCASSI, "A7D38935-6E7D-4504-8031-CBCF3C84FDB8");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIINCASSI, " ");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIINCASSI, "Dettaglio Incassi");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIINCASSI, MyGlb.VIS_HYPELINKIMMA);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIINCASSI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDGDM, "8608D82A-9884-4C52-9E0A-0AAB3CE88B10");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDGDM, "ID GDM");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDGDM, "");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDGDM, MyGlb.VIS_NORMFIELPADR);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDGDM, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_FILEXML, "7762DBB4-CE13-423A-B116-BFF87A7C489A");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_FILEXML, "FILE XML");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_FILEXML, "");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_FILEXML, MyGlb.VIS_NORMFIELPADR);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_FILEXML, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_GIORNDICASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_PAGINA, "8FC2EA8A-6D4B-42B2-8442-C89E247E3857");
    PAN_GIORNDICASSA.set_Header(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_PAGINA, "PAGINA");
    PAN_GIORNDICASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_PAGINA, "");
    PAN_GIORNDICASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_PAGINA, MyGlb.VIS_NORMFIELPADR);
    PAN_GIORNDICASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_PAGINA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_GIORNDICASSA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDELABORAZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDELABORAZIO, MyGlb.PANEL_LIST, 108);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDELABORAZIO, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDELABORAZIO, MyGlb.PANEL_LIST, "ID ELAB.");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDELABORAZIO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDELABORAZIO, MyGlb.PANEL_FORM, 128);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDELABORAZIO, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDELABORAZIO, MyGlb.PANEL_FORM, "ID ELABORAZIONE");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_IDELABORAZIO, -1, -1);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_IDELABORAZIO, PPQRY_ELABORAZIOPI, "A.ID_ELABORAZIONE", "ELABOPIIDELA", 3, 10, 0, -13997);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_VISUALIZHTML, MyGlb.PANEL_LIST, 0, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_VISUALIZHTML, MyGlb.PANEL_LIST, 96);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_VISUALIZHTML, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_VISUALIZHTML, MyGlb.PANEL_LIST, " ");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_VISUALIZHTML, MyGlb.PANEL_FORM, 4, 268, 604, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_VISUALIZHTML, MyGlb.PANEL_FORM, 96);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_VISUALIZHTML, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_VISUALIZHTML, MyGlb.PANEL_FORM, " ");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_VISUALIZHTML, -1, -1);
    PAN_GIORNDICASSA.SetFieldUnbound(PFL_GIORNDICASSA_VISUALIZHTML, true);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_VISUALIZHTML, PPQRY_ELABORAZIOPI, "DECODE(A.ID_GDM, to_number(NULL), NULL, 'T')", "VISUALIZHTML", 5, 99, 0, -13997);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_VISUALIZHTML, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_ESERCIZIO, MyGlb.PANEL_LIST, 24, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio Flusso");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_ESERCIZIO, MyGlb.PANEL_FORM, 4, 292, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_ESERCIZIO, MyGlb.PANEL_FORM, "Eserc. Flus.");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_ESERCIZIO, -1, -1);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_ESERCIZIO, PPQRY_ELABORAZIOPI, "A.ESERCIZIO", "ELABOOPIESER", 1, 4, 0, -13997);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFLUSSO, MyGlb.PANEL_LIST, 84, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFLUSSO, MyGlb.PANEL_LIST, 84);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFLUSSO, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFLUSSO, MyGlb.PANEL_LIST, "Data Flusso");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFLUSSO, MyGlb.PANEL_FORM, 4, 28, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFLUSSO, MyGlb.PANEL_FORM, 128);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFLUSSO, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFLUSSO, MyGlb.PANEL_FORM, "Data Flusso");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_DATAFLUSSO, -1, -1);
    PAN_GIORNDICASSA.SetFieldUnbound(PFL_GIORNDICASSA_DATAFLUSSO, true);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_DATAFLUSSO, PPQRY_ELABORAZIOPI, "TO_DATE(TO_NUMBER(TO_CHAR(A.DATA_FLUSSO, 'dd'))||'/'||TO_NUMBER(TO_CHAR(A.DATA_FLUSSO, 'mm' ))||'/'||TO_NUMBER(TO_CHAR(A.DATA_FLUSSO, 'yyyy')),'dd/mm/yyyy')", "ELAOPIDATFLU", 6, 0, 0, -13997);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDFLUSSOBT, MyGlb.PANEL_LIST, 164, 36, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDFLUSSOBT, MyGlb.PANEL_LIST, 96);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDFLUSSOBT, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDFLUSSOBT, MyGlb.PANEL_LIST, "Id Flusso BT");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDFLUSSOBT, MyGlb.PANEL_FORM, 4, 52, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDFLUSSOBT, MyGlb.PANEL_FORM, 128);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDFLUSSOBT, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDFLUSSOBT, MyGlb.PANEL_FORM, "Id Flusso BT");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_IDFLUSSOBT, -1, -1);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_IDFLUSSOBT, PPQRY_ELABORAZIOPI, "A.ID_FLUSSO_BT", "ELAOPIIDFLBT", 5, 500, 0, -13997);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_CODABIBT, MyGlb.PANEL_LIST, 516, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_CODABIBT, MyGlb.PANEL_LIST, 72);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_CODABIBT, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_CODABIBT, MyGlb.PANEL_LIST, "ABI BT");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_CODABIBT, MyGlb.PANEL_FORM, 4, 76, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_CODABIBT, MyGlb.PANEL_FORM, 128);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_CODABIBT, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_CODABIBT, MyGlb.PANEL_FORM, "ABI BT");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_CODABIBT, -1, -1);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_CODABIBT, PPQRY_ELABORAZIOPI, "A.COD_ABI_BT", "ELAOPICOABBT", 5, 5, 0, -13997);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAINIZPERI, MyGlb.PANEL_LIST, 572, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAINIZPERI, MyGlb.PANEL_LIST, 132);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAINIZPERI, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAINIZPERI, MyGlb.PANEL_LIST, "Data Giornale Cassa");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAINIZPERI, MyGlb.PANEL_FORM, 4, 100, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAINIZPERI, MyGlb.PANEL_FORM, 128);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAINIZPERI, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAINIZPERI, MyGlb.PANEL_FORM, "Data Giornale Cassa");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_DATAINIZPERI, -1, -1);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_DATAINIZPERI, PPQRY_ELABORAZIOPI, "A.DATA_INIZIO_PERIODO", "ELAOPIDAINPE", 6, 10, 0, -13997);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFINEPERI, MyGlb.PANEL_LIST, 652, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFINEPERI, MyGlb.PANEL_LIST, 120);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFINEPERI, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFINEPERI, MyGlb.PANEL_LIST, "Data Fine Periodo");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFINEPERI, MyGlb.PANEL_FORM, 4, 124, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFINEPERI, MyGlb.PANEL_FORM, 128);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFINEPERI, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_DATAFINEPERI, MyGlb.PANEL_FORM, "Data Fine Periodo");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_DATAFINEPERI, -1, -1);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_DATAFINEPERI, PPQRY_ELABORAZIOPI, "A.DATA_FINE_PERIODO", "ELAOPIDAFIPE", 6, 10, 0, -13997);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_STATO, MyGlb.PANEL_LIST, 668, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_STATO, MyGlb.PANEL_LIST, 96);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_STATO, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_STATO, MyGlb.PANEL_LIST, "Stato");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_STATO, MyGlb.PANEL_FORM, 4, 148, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_STATO, MyGlb.PANEL_FORM, 128);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_STATO, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_STATO, MyGlb.PANEL_FORM, "Stato");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_STATO, -1, -1);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_STATO, PPQRY_ELABORAZIOPI, "A.STATO", "ELABOOPISTAT", 5, 50, 0, -13997);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVSPES, MyGlb.PANEL_LIST, 852, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVSPES, MyGlb.PANEL_LIST, 140);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVSPES, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVSPES, MyGlb.PANEL_LIST, " ");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVSPES, MyGlb.PANEL_FORM, 4, 172, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVSPES, MyGlb.PANEL_FORM, 140);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVSPES, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVSPES, MyGlb.PANEL_FORM, " ");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_APRIPROVSPES, -1, -1);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_APRIPROVSPES, PPQRY_DUAL, "'M'", "APRIPROVSPES", 5, 1, 0, -13997);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIPROVSPES, (new IDVariant("M")), "Mandati", "", "Manda.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIPROVSPES, (new IDVariant("O")), "Ordinativi", "", "Ordina.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIPROVSPES, (new IDVariant("I")), "Incassi", "", "OrdSoldi.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIPROVSPES, (new IDVariant("P")), "Pagamenti", "", "ManSoldi.gif", -1);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVENTR, MyGlb.PANEL_LIST, 876, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVENTR, MyGlb.PANEL_LIST, 140);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVENTR, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVENTR, MyGlb.PANEL_LIST, " ");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVENTR, MyGlb.PANEL_FORM, 4, 196, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVENTR, MyGlb.PANEL_FORM, 140);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVENTR, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPROVENTR, MyGlb.PANEL_FORM, " ");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_APRIPROVENTR, -1, -1);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_APRIPROVENTR, PPQRY_DUAL, "'O'", "APRIPROVENTR", 5, 1, 0, -13997);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIPROVENTR, (new IDVariant("M")), "Mandati", "", "Manda.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIPROVENTR, (new IDVariant("O")), "Ordinativi", "", "Ordina.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIPROVENTR, (new IDVariant("I")), "Incassi", "", "OrdSoldi.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIPROVENTR, (new IDVariant("P")), "Pagamenti", "", "ManSoldi.gif", -1);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPAGAMENT, MyGlb.PANEL_LIST, 900, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPAGAMENT, MyGlb.PANEL_LIST, 128);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPAGAMENT, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPAGAMENT, MyGlb.PANEL_LIST, " ");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPAGAMENT, MyGlb.PANEL_FORM, 4, 244, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPAGAMENT, MyGlb.PANEL_FORM, 128);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPAGAMENT, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIPAGAMENT, MyGlb.PANEL_FORM, " ");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_APRIPAGAMENT, -1, -1);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_APRIPAGAMENT, PPQRY_DUAL, "'P'", "APRIPAGAMENT", 5, 1, 0, -13997);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIPAGAMENT, (new IDVariant("M")), "Mandati", "", "Manda.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIPAGAMENT, (new IDVariant("O")), "Ordinativi", "", "Ordina.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIPAGAMENT, (new IDVariant("I")), "Incassi", "", "OrdSoldi.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIPAGAMENT, (new IDVariant("P")), "Pagamenti", "", "ManSoldi.gif", -1);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIINCASSI, MyGlb.PANEL_LIST, 924, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIINCASSI, MyGlb.PANEL_LIST, 108);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIINCASSI, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIINCASSI, MyGlb.PANEL_LIST, " ");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIINCASSI, MyGlb.PANEL_FORM, 4, 220, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIINCASSI, MyGlb.PANEL_FORM, 108);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIINCASSI, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_APRIINCASSI, MyGlb.PANEL_FORM, " ");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_APRIINCASSI, -1, -1);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_APRIINCASSI, PPQRY_DUAL, "'I'", "APRIINCASSI", 5, 1, 0, -13997);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIINCASSI, (new IDVariant("M")), "Mandati", "", "Manda.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIINCASSI, (new IDVariant("O")), "Ordinativi", "", "Ordina.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIINCASSI, (new IDVariant("I")), "Incassi", "", "OrdSoldi.gif", -1);
    PAN_GIORNDICASSA.SetValueListItem(PFL_GIORNDICASSA_APRIINCASSI, (new IDVariant("P")), "Pagamenti", "", "ManSoldi.gif", -1);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDGDM, MyGlb.PANEL_LIST, 804, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDGDM, MyGlb.PANEL_LIST, 52);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDGDM, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDGDM, MyGlb.PANEL_LIST, "ID GDM");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDGDM, MyGlb.PANEL_FORM, 4, 172, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDGDM, MyGlb.PANEL_FORM, 128);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDGDM, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_IDGDM, MyGlb.PANEL_FORM, "ID GDM");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_IDGDM, -1, -1);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_IDGDM, PPQRY_ELABORAZIOPI, "A.ID_GDM", "ELABOPIIDGDM", 3, 16, 0, -13997);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_FILEXML, MyGlb.PANEL_LIST, 812, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_FILEXML, MyGlb.PANEL_LIST, 60);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_FILEXML, MyGlb.PANEL_LIST, 2);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_FILEXML, MyGlb.PANEL_LIST, "FILE XML");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_FILEXML, MyGlb.PANEL_FORM, 4, 172, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_FILEXML, MyGlb.PANEL_FORM, 60);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_FILEXML, MyGlb.PANEL_FORM, 2);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_FILEXML, MyGlb.PANEL_FORM, "FILE XML");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_FILEXML, -1, -1);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_FILEXML, PPQRY_ELABORAZIOPI, "A.FILE_XML", "ELAOPIFILXML", 9, 9999, 0, -13997);
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_PAGINA, MyGlb.PANEL_LIST, 1004, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_PAGINA, MyGlb.PANEL_LIST, 52);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_PAGINA, MyGlb.PANEL_LIST, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_PAGINA, MyGlb.PANEL_LIST, "PAGINA");
    PAN_GIORNDICASSA.SetRect(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_PAGINA, MyGlb.PANEL_FORM, 4, 316, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GIORNDICASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_PAGINA, MyGlb.PANEL_FORM, 52);
    PAN_GIORNDICASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_PAGINA, MyGlb.PANEL_FORM, 1);
    PAN_GIORNDICASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GIORNDICASSA_PAGINA, MyGlb.PANEL_FORM, "PAGINA");
    PAN_GIORNDICASSA.SetFieldPage(PFL_GIORNDICASSA_PAGINA, -1, -1);
    PAN_GIORNDICASSA.SetFieldPanel(PFL_GIORNDICASSA_PAGINA, PPQRY_ELABORAZIOPI, "A.PAGINA", "ELABOOPIPAGI", 1, 9, 0, -13997);
  }

  private void PAN_GIORNDICASSA_InitQueries()
  {
    StringBuffer SQL;

    PAN_GIORNDICASSA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'M' as APRIPROVSPES, ");
    SQL.append("  'O' as APRIPROVENTR, ");
    SQL.append("  'I' as APRIINCASSI, ");
    SQL.append("  'P' as APRIPAGAMENT ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ELAOPIIDFLBT~~ IS NULL))) ");
    PAN_GIORNDICASSA.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_GIORNDICASSA.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_GIORNDICASSA.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_GIORNDICASSA.SetIMDB(IMDB, "PQRY_ELABORAZIOPI", true);
    PAN_GIORNDICASSA.set_SetString(MyGlb.MASTER_ROWNAME, "ELABORAZIONI OPI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_ELABORAZIONE as ELABOPIIDELA, ");
    SQL.append("  DECODE(A.ID_GDM, to_number(NULL), NULL, 'T') as VISUALIZHTML, ");
    SQL.append("  TO_DATE(TO_NUMBER(TO_CHAR(A.DATA_FLUSSO, 'dd'))||'/'||TO_NUMBER(TO_CHAR(A.DATA_FLUSSO, 'mm' ))||'/'||TO_NUMBER(TO_CHAR(A.DATA_FLUSSO, 'yyyy')),'dd/mm/yyyy') as ELAOPIDATFLU, ");
    SQL.append("  A.ID_FLUSSO_BT as ELAOPIIDFLBT, ");
    SQL.append("  A.COD_ABI_BT as ELAOPICOABBT, ");
    SQL.append("  A.DATA_INIZIO_PERIODO as ELAOPIDAINPE, ");
    SQL.append("  A.DATA_FINE_PERIODO as ELAOPIDAFIPE, ");
    SQL.append("  A.STATO as ELABOOPISTAT, ");
    SQL.append("  A.ID_GDM as ELABOPIIDGDM, ");
    SQL.append("  A.FILE_XML as ELAOPIFILXML, ");
    SQL.append("  A.ESERCIZIO as ELABOOPIESER, ");
    SQL.append("  A.PAGINA as ELABOOPIPAGI ");
    PAN_GIORNDICASSA.SetQuery(PPQRY_ELABORAZIOPI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ELABORAZIONI_OPI A ");
    PAN_GIORNDICASSA.SetQuery(PPQRY_ELABORAZIOPI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.STATO <> DECODE(~~TBL_PARAMETRI596.PARAMSCARICA~~, 'SI', 'X', 'SCARICATO')) ");
    SQL.append("and   (A.STATO <> DECODE(~~TBL_PARAMETRI596.PARAMELABORA~~, 'SI', 'X', 'ELABORATO')) ");
    SQL.append("and   ((A.DATA_FLUSSO BETWEEN DECODE(~~PQRY_PARAMETRI595.PARDATFLUDAL~~, to_date(NULL), TO_DATE('1900-01-01','YYYY-MM-DD'), ~~PQRY_PARAMETRI595.PARDATFLUDAL~~) AND DECODE(~~PQRY_PARAMETRI595.PARADATFLUAL~~, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), ~~PQRY_PARAMETRI595.PARADATFLUAL~~))) ");
    PAN_GIORNDICASSA.SetQuery(PPQRY_ELABORAZIOPI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_GIORNDICASSA.SetQuery(PPQRY_ELABORAZIOPI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_GIORNDICASSA.SetQuery(PPQRY_ELABORAZIOPI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 3 desc, 4, 12 ");
    PAN_GIORNDICASSA.SetQuery(PPQRY_ELABORAZIOPI, 5, SQL, -1, "");
    PAN_GIORNDICASSA.SetQueryDB(PPQRY_ELABORAZIOPI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_GIORNDICASSA.SetMasterTable(0, "ELABORAZIONI_OPI");
    PAN_GIORNDICASSA.AddToSortList(PFL_GIORNDICASSA_DATAFLUSSO, false);
    PAN_GIORNDICASSA.AddToSortList(PFL_GIORNDICASSA_IDFLUSSOBT, true);
    PAN_GIORNDICASSA.AddToSortList(PFL_GIORNDICASSA_PAGINA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_GIORNDICASSA.Status() == 2)
    {
      int oldListQBE = PAN_GIORNDICASSA.iUseListQBE;
      PAN_GIORNDICASSA.iUseListQBE = 0;
      PAN_GIORNDICASSA.PanelCommand(Glb.PCM_SEARCH);
      PAN_GIORNDICASSA.PanelCommand(Glb.PCM_FIND);
      PAN_GIORNDICASSA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_GIORNDICASSA) PAN_GIORNDICASSA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_GIORNDICASSA) PAN_GIORNDICASSA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_GIORNDICASSA) PAN_GIORNDICASSA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_GIORNDICASSA) PAN_GIORNDICASSA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_GIORNDICASSA) PAN_GIORNDICASSA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
