// **********************************************
// File Comunicazioni PCC
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FileComunicazioniPCC extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_DATA = 0;

  private static int PPQRY_PARAMETRI608 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_FILECOMUAPCC_CSV = 0;
  private static int PFL_FILECOMUAPCC_NOMEFILE = 1;
  private static int PFL_FILECOMUAPCC_NOTE = 2;
  private static int PFL_FILECOMUAPCC_FILEANNULLAT = 3;
  private static int PFL_FILECOMUAPCC_FILEESITO = 4;
  private static int PFL_FILECOMUAPCC_UTENULTIVARI = 5;
  private static int PFL_FILECOMUAPCC_UTENTINOMINA = 6;
  private static int PFL_FILECOMUAPCC_DATAULTIVARI = 7;
  private static int PFL_FILECOMUAPCC_CLOBFILE = 8;
  private static int PFL_FILECOMUAPCC_CLOBFILEESIT = 9;

  private static int PPQRY_PCCFILE = 0;

  private static int PPQRY_UTENTI = 1;


  IDPanel PAN_FILECOMUAPCC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI609(IMDB);
    //
    //
    Init_PQRY_PARAMETRI608(IMDB);
    Init_PQRY_PARAMETRI608_RS(IMDB);
    Init_PQRY_PCCFILE(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI609(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI609, 1);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI609, "TBL_PARAMETRI609");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI609,IMDBDef2.FLD_PARAMETRI609_PARAMDATA, "PARAMDATA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI609,IMDBDef2.FLD_PARAMETRI609_PARAMDATA,6,10,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI609, 0);
  }

  private static void Init_PQRY_PARAMETRI608(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI608, 1);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI608, "PQRY_PARAMETRI608");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI608,IMDBDef10.PQSL_PARAMETRI608_PARAMDATA, "PARAMDATA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI608,IMDBDef10.PQSL_PARAMETRI608_PARAMDATA,6,10,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI608, 0);
  }

  private static void Init_PQRY_PARAMETRI608_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI608_RS, 1);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI608_RS, "PQRY_PARAMETRI608_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI608_RS,IMDBDef10.PQSL_PARAMETRI608_PARAMDATA, "PARAMDATA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI608_RS,IMDBDef10.PQSL_PARAMETRI608_PARAMDATA,6,10,0);
  }

  private static void Init_PQRY_PCCFILE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PCCFILE, 9);
    IMDB.set_TblCode(IMDBDef10.PQRY_PCCFILE, "PQRY_PCCFILE");
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_CSV, "CSV");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_CSV,5,3,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_PCCNOMEFILE, "PCCNOMEFILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_PCCNOMEFILE,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_PCCCLOBFILE, "PCCCLOBFILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_PCCCLOBFILE,9,9999,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_PCCFILENOTE, "PCCFILENOTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_PCCFILENOTE,5,200,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_PCCFILDAULVA, "PCCFILDAULVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_PCCFILDAULVA,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_PCCFILUTULVA, "PCCFILUTULVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_PCCFILUTULVA,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_PCCFILEANNUL, "PCCFILEANNUL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_PCCFILEANNUL,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_FILEESITO, "FILEESITO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_FILEESITO,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_PCCCLOFILESI, "PCCCLOFILESI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PCCFILE,IMDBDef10.PQSL_PCCFILE_PCCCLOFILESI,9,9999,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PCCFILE, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FileComunicazioniPCC(MyWebEntryPoint w, IMDBObj imdb)
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
  public FileComunicazioniPCC()
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
    FormIdx = MyGlb.FRM_FILECOMUNPCC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1ADF887C-6AB6-4325-B531-5B4B9EDBFE3F";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 808;
    DesignHeight = 410;
    set_Caption(new IDVariant("File Comunicazioni a PCC"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 808;
    Frames[1].Height = 384;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0833333;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 808;
    Frames[2].Height = 32;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 32;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 808-MyGlb.PAN_OFFS_X, 32-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E2C57FE9-39A3-461A-8447-3069A6F3243D");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 88, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
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
    Frames[3].Width = 808;
    Frames[3].Height = 352;
    Frames[3].Caption = "File Comunicazioni a PCC";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 352;
    PAN_FILECOMUAPCC = new IDPanel(w, this, 3, "PAN_FILECOMUAPCC");
    Frames[3].Content = PAN_FILECOMUAPCC;
    PAN_FILECOMUAPCC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILECOMUAPCC.VS = MainFrm.VisualStyleList;
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 808-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILECOMUAPCC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "447170D7-C47D-443E-9A93-86B0F3E5F511");
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 744, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FILECOMUAPCC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILECOMUAPCC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILECOMUAPCC.InitStatus = 2;
    PAN_FILECOMUAPCC_Init();
    PAN_FILECOMUAPCC_InitFields();
    PAN_FILECOMUAPCC_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIONI10+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIONI9+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIONI10+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ANNUILFILCOR+BaseCmdLinIdx)
      {
        Annullailfilecorrente();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI609, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        FILECOMUNPCC_PARAMETRI608();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_FILECOMUAPCC.UpdatePanel(MainFrm);
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
    return (obj instanceof FileComunicazioniPCC);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FileComunicazioniPCC.class.getName() : (Glb.ClassWithPackage(FileComunicazioniPCC.class) ? FileComunicazioniPCC.class.getName().substring(FileComunicazioniPCC.class.getPackage().getName().length() + 1) : FileComunicazioniPCC.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri CSV
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriCSV ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri CSV Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PCCFILE, IMDBDef10.PQSL_PCCFILE_PCCNOMEFILE, 0))))
      {
        MainFrm.ApriCSVPCC(IMDB.Value(IMDBDef10.PQRY_PCCFILE, IMDBDef10.PQSL_PCCFILE_PCCNOMEFILE, 0), (new IDVariant(0)));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FileComunicazioniPCC", "ApriCSV", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri File Esito
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriFileEsito ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri File Esito Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PCCFILE, IMDBDef10.PQSL_PCCFILE_PCCCLOFILESI, 0))))
      {
        MainFrm.ApriCSVPCC(IMDB.Value(IMDBDef10.PQRY_PCCFILE, IMDBDef10.PQSL_PCCFILE_PCCNOMEFILE, 0), (new IDVariant(-1)));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FileComunicazioniPCC", "ApriFileEsito", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla il file corrente
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Annullailfilecorrente ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla il file corrente Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI612, IMDBDef2.FLD_PARAMETRI612_NOME_FILE, 0, IMDB.Value(IMDBDef10.PQRY_PCCFILE, IMDBDef10.PQSL_PCCFILE_PCCNOMEFILE, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI612, IMDBDef2.FLD_PARAMETRI612_NOTE, 0, IMDB.Value(IMDBDef10.PQRY_PCCFILE, IMDBDef10.PQSL_PCCFILE_PCCFILENOTE, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI612, IMDBDef2.FLD_PARAMETRI612_DATA_ULTIMA_VARIAZIONE, 0, IMDB.Value(IMDBDef10.PQRY_PCCFILE, IMDBDef10.PQSL_PCCFILE_PCCFILDAULVA, 0));
      MainFrm.Show(MyGlb.FRM_ANNUFILECORR, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FileComunicazioniPCC", "Annullailfilecorrente", _e);
      return -1;
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
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI609, IMDBDef2.FLD_PARAMETRI609_PARAMDATA, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FileComunicazioniPCC", "Load", _e);
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FileComunicazioniPCC", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI609, IMDBDef2.FLD_PARAMETRI609_PARAMDATA, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_ANNUFILECORR)), true) && Result.booleanValue())
      {
        PAN_FILECOMUAPCC.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FileComunicazioniPCC", "EndModal", _e);
    }
  }

  // **********************************************************************
  // File Comunicazioni a PCC On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_FILECOMUAPCC_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // File Comunicazioni a PCC On Change Row Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_PCCFILE, IMDBDef10.PQSL_PCCFILE_PCCFILEANNUL, 0).equals((new IDVariant("NO")), true))
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_ANNUILFILCOR+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_ANNUILFILCOR+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FileComunicazioniPCC", "FileComunicazioniaPCCOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void FILECOMUNPCC_PARAMETRI608() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAMETRI608_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI609, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI609, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI608_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAMETRI608_RS, 0, IMDBDef2.TBL_PARAMETRI609, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI608_RS, 0, 0, IMDBDef2.TBL_PARAMETRI609, IMDBDef2.FLD_PARAMETRI609_PARAMDATA, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI609, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI609, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI609, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAMETRI608_RS, 0);
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
  private void PAN_FILECOMUAPCC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILECOMUAPCC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILECOMUAPCC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILECOMUAPCC, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILECOMUAPCC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FILECOMUAPCC);
    // Stub
  }

  private void PAN_FILECOMUAPCC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FILECOMUAPCC_CSV)
    {
      this.IdxPanelActived = this.PAN_FILECOMUAPCC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCSV();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FILECOMUAPCC_FILEESITO)
    {
      this.IdxPanelActived = this.PAN_FILECOMUAPCC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFileEsito();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FILECOMUAPCC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FILECOMUAPCC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PCCFILE, IMDBDef10.PQSL_PCCFILE_PCCFILEANNUL, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_PCCFILE, IMDBDef10.PQSL_PCCFILE_PCCFILEANNUL, 0, (new IDVariant("SI")));
      }
      if (Cancel.isFalse())
      {
        PAN_FILECOMUAPCC_IntValidateRow(Cancel);
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, "994989FB-4B61-4169-9B3D-2FB015776163");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, "Selezione file generati a partire dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_LIST, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_LIST, "Selez. fl. gen. a part. dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_FORM, 4, 4, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_FORM, 208);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_FORM, "Selezione file generati a partire dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATA, PPQRY_PARAMETRI608, "A.PARAMDATA", "PARAMDATA", 6, 10, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI608", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI608, IMDBDef10.PQRY_PARAMETRI608_RS, IMDBDef2.TBL_PARAMETRI609);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATA, IMDBDef2.FLD_PARAMETRI609_PARAMDATA);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI609");
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

  private void PAN_FILECOMUAPCC_Init()
  {

    PAN_FILECOMUAPCC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILECOMUAPCC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILECOMUAPCC.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_FILECOMUAPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CSV, "5C0CC62C-5508-414B-A5FE-5625296C6D9D");
    PAN_FILECOMUAPCC.set_Header(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CSV, " ");
    PAN_FILECOMUAPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CSV, "");
    PAN_FILECOMUAPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CSV, MyGlb.VIS_HYPELINKIMMA);
    PAN_FILECOMUAPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CSV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FILECOMUAPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOMEFILE, "CD062802-CFAB-404A-8403-CE79BC4FEDEA");
    PAN_FILECOMUAPCC.set_Header(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOMEFILE, "Nome File");
    PAN_FILECOMUAPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOMEFILE, "");
    PAN_FILECOMUAPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOMEFILE, MyGlb.VIS_NORMALFIELDS);
    PAN_FILECOMUAPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOMEFILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_FILECOMUAPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOTE, "CB223953-3B8E-4FE8-BB0F-D2045372EF77");
    PAN_FILECOMUAPCC.set_Header(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOTE, "Note");
    PAN_FILECOMUAPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOTE, "");
    PAN_FILECOMUAPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOTE, MyGlb.VIS_NORMALFIELDS);
    PAN_FILECOMUAPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FILECOMUAPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEANNULLAT, "CA69B9ED-8765-4147-92BB-FC5E9EB47CA3");
    PAN_FILECOMUAPCC.set_Header(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEANNULLAT, "Annullato");
    PAN_FILECOMUAPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEANNULLAT, "Se l'elaborazione del file e' stata annullata SI / NO");
    PAN_FILECOMUAPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEANNULLAT, MyGlb.VIS_CHECKSTYLE);
    PAN_FILECOMUAPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEANNULLAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FILECOMUAPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEESITO, "336389F6-6DC0-44E4-A8CD-DB83D95F6A5A");
    PAN_FILECOMUAPCC.set_Header(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEESITO, "File Esito");
    PAN_FILECOMUAPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEESITO, "");
    PAN_FILECOMUAPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEESITO, MyGlb.VIS_HYPELINKIMMA);
    PAN_FILECOMUAPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEESITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FILECOMUAPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENULTIVARI, "6357620B-40A3-4411-A51B-8F28E5EA5E01");
    PAN_FILECOMUAPCC.set_Header(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENULTIVARI, "Utente Ultima Variazione");
    PAN_FILECOMUAPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENULTIVARI, "");
    PAN_FILECOMUAPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENULTIVARI, MyGlb.VIS_NORMALFIELDS);
    PAN_FILECOMUAPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENULTIVARI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_FILECOMUAPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENTINOMINA, "5C12AA68-083E-432F-BFA0-1F2420B54AE0");
    PAN_FILECOMUAPCC.set_Header(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENTINOMINA, "UTENTI NOMINATIVO");
    PAN_FILECOMUAPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENTINOMINA, "");
    PAN_FILECOMUAPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENTINOMINA, MyGlb.VIS_NORMALFIELDS);
    PAN_FILECOMUAPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENTINOMINA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_FILECOMUAPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_DATAULTIVARI, "F04EB1EC-606D-4062-972A-1E5D6AFB2C56");
    PAN_FILECOMUAPCC.set_Header(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_DATAULTIVARI, "il");
    PAN_FILECOMUAPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_DATAULTIVARI, "");
    PAN_FILECOMUAPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_DATAULTIVARI, MyGlb.VIS_NORMALFIELDS);
    PAN_FILECOMUAPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_DATAULTIVARI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_FILECOMUAPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILE, "21EEBD25-0B3D-4894-86AE-E3A7FADC8EF4");
    PAN_FILECOMUAPCC.set_Header(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILE, "CLOB FILE");
    PAN_FILECOMUAPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILE, "");
    PAN_FILECOMUAPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILE, MyGlb.VIS_NORMFIELPADR);
    PAN_FILECOMUAPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FILECOMUAPCC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILEESIT, "5B7B1F0E-08CA-4653-9BF5-ECDCE10CA88D");
    PAN_FILECOMUAPCC.set_Header(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILEESIT, "CLOB FILE ESITO");
    PAN_FILECOMUAPCC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILEESIT, "");
    PAN_FILECOMUAPCC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILEESIT, MyGlb.VIS_NORMFIELPADR);
    PAN_FILECOMUAPCC.SetFlags(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILEESIT, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILECOMUAPCC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CSV, MyGlb.PANEL_LIST, 0, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CSV, MyGlb.PANEL_LIST, 40);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CSV, MyGlb.PANEL_LIST, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CSV, MyGlb.PANEL_LIST, " ");
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CSV, MyGlb.PANEL_FORM, 4, 148, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CSV, MyGlb.PANEL_FORM, 40);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CSV, MyGlb.PANEL_FORM, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CSV, MyGlb.PANEL_FORM, " ");
    PAN_FILECOMUAPCC.SetFieldPage(PFL_FILECOMUAPCC_CSV, -1, -1);
    PAN_FILECOMUAPCC.SetFieldUnbound(PFL_FILECOMUAPCC_CSV, true);
    PAN_FILECOMUAPCC.SetFieldPanel(PFL_FILECOMUAPCC_CSV, PPQRY_PCCFILE, "'CSV'", "CSV", 5, 3, 0, -13997);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_CSV, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOMEFILE, MyGlb.PANEL_LIST, 24, 36, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOMEFILE, MyGlb.PANEL_LIST, 88);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOMEFILE, MyGlb.PANEL_LIST, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOMEFILE, MyGlb.PANEL_LIST, "Nome File");
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOMEFILE, MyGlb.PANEL_FORM, 4, 4, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOMEFILE, MyGlb.PANEL_FORM, 128);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOMEFILE, MyGlb.PANEL_FORM, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOMEFILE, MyGlb.PANEL_FORM, "Nome File");
    PAN_FILECOMUAPCC.SetFieldPage(PFL_FILECOMUAPCC_NOMEFILE, -1, -1);
    PAN_FILECOMUAPCC.SetFieldPanel(PFL_FILECOMUAPCC_NOMEFILE, PPQRY_PCCFILE, "A.NOME_FILE", "PCCNOMEFILE", 5, 40, 0, -13997);
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOTE, MyGlb.PANEL_LIST, 236, 36, 408, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOTE, MyGlb.PANEL_LIST, 88);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOTE, MyGlb.PANEL_LIST, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOTE, MyGlb.PANEL_LIST, "Note");
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOTE, MyGlb.PANEL_FORM, 4, 52, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOTE, MyGlb.PANEL_FORM, 128);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_NOTE, MyGlb.PANEL_FORM, "Note");
    PAN_FILECOMUAPCC.SetFieldPage(PFL_FILECOMUAPCC_NOTE, -1, -1);
    PAN_FILECOMUAPCC.SetFieldPanel(PFL_FILECOMUAPCC_NOTE, PPQRY_PCCFILE, "A.NOTE", "PCCFILENOTE", 5, 200, 0, -13997);
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEANNULLAT, MyGlb.PANEL_LIST, 644, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEANNULLAT, MyGlb.PANEL_LIST, 100);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEANNULLAT, MyGlb.PANEL_LIST, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEANNULLAT, MyGlb.PANEL_LIST, "Annullato");
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEANNULLAT, MyGlb.PANEL_FORM, 4, 172, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEANNULLAT, MyGlb.PANEL_FORM, 100);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEANNULLAT, MyGlb.PANEL_FORM, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEANNULLAT, MyGlb.PANEL_FORM, "Annullato");
    PAN_FILECOMUAPCC.SetFieldPage(PFL_FILECOMUAPCC_FILEANNULLAT, -1, -1);
    PAN_FILECOMUAPCC.SetFieldPanel(PFL_FILECOMUAPCC_FILEANNULLAT, PPQRY_PCCFILE, "A.FILE_ANNULLATO", "PCCFILEANNUL", 5, 2, 0, -13997);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEANNULLAT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEANNULLAT, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEESITO, MyGlb.PANEL_LIST, 708, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEESITO, MyGlb.PANEL_LIST, 60);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEESITO, MyGlb.PANEL_LIST, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEESITO, MyGlb.PANEL_LIST, "File Esito");
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEESITO, MyGlb.PANEL_FORM, 4, 220, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEESITO, MyGlb.PANEL_FORM, 60);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEESITO, MyGlb.PANEL_FORM, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_FILEESITO, MyGlb.PANEL_FORM, "File Esito");
    PAN_FILECOMUAPCC.SetFieldPage(PFL_FILECOMUAPCC_FILEESITO, -1, -1);
    PAN_FILECOMUAPCC.SetFieldUnbound(PFL_FILECOMUAPCC_FILEESITO, true);
    PAN_FILECOMUAPCC.SetFieldPanel(PFL_FILECOMUAPCC_FILEESITO, PPQRY_PCCFILE, "CASE WHEN NOT ((A.CLOB_FILE_ESITO IS NULL)) THEN 'CSV' ELSE NULL END", "FILEESITO", 5, 99, 0, -13997);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FILECOMUAPCC.SetValueListItem(PFL_FILECOMUAPCC_FILEESITO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENULTIVARI, MyGlb.PANEL_LIST, 0, 252, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENULTIVARI, MyGlb.PANEL_LIST, 152);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENULTIVARI, MyGlb.PANEL_LIST, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENULTIVARI, MyGlb.PANEL_LIST, "Utente Ultima Variazione");
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENULTIVARI, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENULTIVARI, MyGlb.PANEL_FORM, 128);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENULTIVARI, MyGlb.PANEL_FORM, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENULTIVARI, MyGlb.PANEL_FORM, "Uten. Ult. Variazione");
    PAN_FILECOMUAPCC.SetFieldPage(PFL_FILECOMUAPCC_UTENULTIVARI, -1, -1);
    PAN_FILECOMUAPCC.SetFieldPanel(PFL_FILECOMUAPCC_UTENULTIVARI, PPQRY_PCCFILE, "A.UTENTE_ULTIMA_VARIAZIONE", "PCCFILUTULVA", 5, 8, 0, -13997);
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENTINOMINA, MyGlb.PANEL_LIST, 240, 252, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENTINOMINA, MyGlb.PANEL_LIST, 124);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENTINOMINA, MyGlb.PANEL_LIST, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENTINOMINA, MyGlb.PANEL_LIST, "UTENTI NOMINATIVO");
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENTINOMINA, MyGlb.PANEL_FORM, 132, 196, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENTINOMINA, MyGlb.PANEL_FORM, 124);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENTINOMINA, MyGlb.PANEL_FORM, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_UTENTINOMINA, MyGlb.PANEL_FORM, "UTENTI NOMINATIVO");
    PAN_FILECOMUAPCC.SetFieldPage(PFL_FILECOMUAPCC_UTENTINOMINA, -1, -1);
    PAN_FILECOMUAPCC.SetFieldPanel(PFL_FILECOMUAPCC_UTENTINOMINA, PPQRY_UTENTI, "A.NOMINATIVO", "UTENTINOMINA", 5, 40, 0, -13997);
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_DATAULTIVARI, MyGlb.PANEL_LIST, 584, 252, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_DATAULTIVARI, MyGlb.PANEL_LIST, 16);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_DATAULTIVARI, MyGlb.PANEL_LIST, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_DATAULTIVARI, MyGlb.PANEL_LIST, "il");
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_DATAULTIVARI, MyGlb.PANEL_FORM, 4, 100, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_DATAULTIVARI, MyGlb.PANEL_FORM, 128);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_DATAULTIVARI, MyGlb.PANEL_FORM, 1);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_DATAULTIVARI, MyGlb.PANEL_FORM, "il");
    PAN_FILECOMUAPCC.SetFieldPage(PFL_FILECOMUAPCC_DATAULTIVARI, -1, -1);
    PAN_FILECOMUAPCC.SetFieldPanel(PFL_FILECOMUAPCC_DATAULTIVARI, PPQRY_PCCFILE, "A.DATA_ULTIMA_VARIAZIONE", "PCCFILDAULVA", 6, 10, 0, -13997);
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILE, MyGlb.PANEL_LIST, 4, 188, 488, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILE, MyGlb.PANEL_LIST, 88);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILE, MyGlb.PANEL_LIST, 2);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILE, MyGlb.PANEL_LIST, "CLOB FILE");
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILE, MyGlb.PANEL_FORM, 4, 28, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILE, MyGlb.PANEL_FORM, 128);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILE, MyGlb.PANEL_FORM, 2);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILE, MyGlb.PANEL_FORM, "CLOB FILE");
    PAN_FILECOMUAPCC.SetFieldPage(PFL_FILECOMUAPCC_CLOBFILE, -1, -1);
    PAN_FILECOMUAPCC.SetFieldPanel(PFL_FILECOMUAPCC_CLOBFILE, PPQRY_PCCFILE, "A.CLOB_FILE", "PCCCLOBFILE", 9, 9999, 0, -13997);
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILEESIT, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILEESIT, MyGlb.PANEL_LIST, 100);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILEESIT, MyGlb.PANEL_LIST, 2);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILEESIT, MyGlb.PANEL_LIST, "CLOB FILE ESITO");
    PAN_FILECOMUAPCC.SetRect(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILEESIT, MyGlb.PANEL_FORM, 4, 244, 536, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILECOMUAPCC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILEESIT, MyGlb.PANEL_FORM, 100);
    PAN_FILECOMUAPCC.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILEESIT, MyGlb.PANEL_FORM, 2);
    PAN_FILECOMUAPCC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILECOMUAPCC_CLOBFILEESIT, MyGlb.PANEL_FORM, "CLOB FILE ESITO");
    PAN_FILECOMUAPCC.SetFieldPage(PFL_FILECOMUAPCC_CLOBFILEESIT, -1, -1);
    PAN_FILECOMUAPCC.SetFieldPanel(PFL_FILECOMUAPCC_CLOBFILEESIT, PPQRY_PCCFILE, "A.CLOB_FILE_ESITO", "PCCCLOFILESI", 9, 9999, 0, -13997);
  }

  private void PAN_FILECOMUAPCC_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILECOMUAPCC.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NOMINATIVO as UTENTINOMINA ");
    SQL.append("from ");
    SQL.append("  AD4_UTENTI A ");
    SQL.append("where (A.UTENTE = ~~PCCFILUTULVA~~) ");
    PAN_FILECOMUAPCC.SetQuery(PPQRY_UTENTI, 0, SQL, -1, "");
    PAN_FILECOMUAPCC.SetQueryDB(PPQRY_UTENTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FILECOMUAPCC.SetMasterTable(PPQRY_UTENTI, "AD4_UTENTI");
    PAN_FILECOMUAPCC.SetIMDB(IMDB, "PQRY_PCCFILE", true);
    PAN_FILECOMUAPCC.set_SetString(MyGlb.MASTER_ROWNAME, "PCC FILE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'CSV' as CSV, ");
    SQL.append("  A.NOME_FILE as PCCNOMEFILE, ");
    SQL.append("  A.CLOB_FILE as PCCCLOBFILE, ");
    SQL.append("  A.NOTE as PCCFILENOTE, ");
    SQL.append("  A.DATA_ULTIMA_VARIAZIONE as PCCFILDAULVA, ");
    SQL.append("  A.UTENTE_ULTIMA_VARIAZIONE as PCCFILUTULVA, ");
    SQL.append("  A.FILE_ANNULLATO as PCCFILEANNUL, ");
    SQL.append("  CASE WHEN NOT ((A.CLOB_FILE_ESITO IS NULL)) THEN 'CSV' ELSE NULL END as FILEESITO, ");
    SQL.append("  A.CLOB_FILE_ESITO as PCCCLOFILESI ");
    PAN_FILECOMUAPCC.SetQuery(PPQRY_PCCFILE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PCC_FILE A ");
    PAN_FILECOMUAPCC.SetQuery(PPQRY_PCCFILE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.DATA_ULTIMA_VARIAZIONE >= ~~PQRY_PARAMETRI608.PARAMDATA~~) ");
    PAN_FILECOMUAPCC.SetQuery(PPQRY_PCCFILE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FILECOMUAPCC.SetQuery(PPQRY_PCCFILE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FILECOMUAPCC.SetQuery(PPQRY_PCCFILE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.NOME_FILE ");
    PAN_FILECOMUAPCC.SetQuery(PPQRY_PCCFILE, 5, SQL, -1, "");
    PAN_FILECOMUAPCC.SetQueryDB(PPQRY_PCCFILE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FILECOMUAPCC.SetMasterTable(0, "PCC_FILE");
    PAN_FILECOMUAPCC.AddToSortList(PFL_FILECOMUAPCC_NOMEFILE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILECOMUAPCC.Status() == 2)
    {
      int oldListQBE = PAN_FILECOMUAPCC.iUseListQBE;
      PAN_FILECOMUAPCC.iUseListQBE = 0;
      PAN_FILECOMUAPCC.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILECOMUAPCC.PanelCommand(Glb.PCM_FIND);
      PAN_FILECOMUAPCC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FILECOMUAPCC) PAN_FILECOMUAPCC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_FILECOMUAPCC) PAN_FILECOMUAPCC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_FILECOMUAPCC) PAN_FILECOMUAPCC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FILECOMUAPCC) PAN_FILECOMUAPCC_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FILECOMUAPCC) PAN_FILECOMUAPCC_OnChangeRow();
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
    if (SrcObj == PAN_FILECOMUAPCC) PAN_FILECOMUAPCC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
