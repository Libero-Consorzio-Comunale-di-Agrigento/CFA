// **********************************************
// Eliminazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Eliminazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ELIMINAZIONE_NUMEROMAND = 0;
  private static int PFL_ELIMINAZIONE_DATAMAND = 1;
  private static int PFL_ELIMINAZIONE_IMPORTO = 2;
  private static int PFL_ELIMINAZIONE_NUMEROELENCO = 3;
  private static int PFL_ELIMINAZIONE_DATAELENCO = 4;
  private static int PFL_ELIMINAZIONE_PAGATO = 5;
  private static int PFL_ELIMINAZIONE_CAPITOLO = 6;
  private static int PFL_ELIMINAZIONE_ARTICOLO = 7;
  private static int PFL_ELIMINAZIONE_ANNOIMP = 8;
  private static int PFL_ELIMINAZIONE_NUMEROIMP = 9;
  private static int PFL_ELIMINAZIONE_DISTINTLABEL = 10;
  private static int PFL_ELIMINAZIONE_IMPEGNOLABEL = 11;
  private static int PFL_ELIMINAZIONE_MANDATOLABEL = 12;
  private static int PFL_ELIMINAZIONE_PAGATOLABEL = 13;

  private static int PPQRY_ELIMINAZION2 = 0;


  IDPanel PAN_ELIMINAZIONE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_OLDVALFILTAB(IMDB);
    Init_TBL_IMDBVISUALIZ(IMDB);
    //
    //
    Init_PQRY_ELIMINAZION2(IMDB);
    Init_PQRY_ELIMINAZION2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_OLDVALFILTAB(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_OLDVALFILTAB, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_OLDVALFILTAB, "TBL_OLDVALFILTAB");
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTAB,IMDBDef6.FLD_OLDVALFILTAB_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTAB,IMDBDef6.FLD_OLDVALFILTAB_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTAB,IMDBDef6.FLD_OLDVALFILTAB_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTAB,IMDBDef6.FLD_OLDVALFILTAB_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTAB,IMDBDef6.FLD_OLDVALFILTAB_DATA_MAND, "DATA_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTAB,IMDBDef6.FLD_OLDVALFILTAB_DATA_MAND,6,7,0);
    IMDB.set_FldCode(IMDBDef6.TBL_OLDVALFILTAB,IMDBDef6.FLD_OLDVALFILTAB_ROWNAMOLDAMA, "ROWNAMOLDAMA");
    IMDB.SetFldParams(IMDBDef6.TBL_OLDVALFILTAB,IMDBDef6.FLD_OLDVALFILTAB_ROWNAMOLDAMA,1,7,0);
    IMDB.TblAddNew(IMDBDef6.TBL_OLDVALFILTAB, 0);
  }

  private static void Init_TBL_IMDBVISUALIZ(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_IMDBVISUALIZ, 10);
    IMDB.set_TblCode(IMDBDef6.TBL_IMDBVISUALIZ, "TBL_IMDBVISUALIZ");
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_DATA_MAND, "DATA_MAND");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_DATA_MAND,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_NUMERO_ELENCO, "NUMERO_ELENCO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_NUMERO_ELENCO,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_DATA_ELENCO, "DATA_ELENCO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_DATA_ELENCO,6,19,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_PAGATO, "PAGATO");
    IMDB.SetFldParams(IMDBDef6.TBL_IMDBVISUALIZ,IMDBDef6.FLD_IMDBVISUALIZ_PAGATO,3,14,2);
  }

  private static void Init_PQRY_ELIMINAZION2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ELIMINAZION2, 10);
    IMDB.set_TblCode(IMDBDef15.PQRY_ELIMINAZION2, "PQRY_ELIMINAZION2");
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_DATA_MAND, "DATA_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_DATA_MAND,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_NUMERO_ELENCO, "NUMERO_ELENCO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_NUMERO_ELENCO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_DATA_ELENCO, "DATA_ELENCO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_DATA_ELENCO,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_PAGATO, "PAGATO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2,IMDBDef15.PQSL_ELIMINAZION2_PAGATO,3,14,2);
    IMDB.TblAddNew(IMDBDef15.PQRY_ELIMINAZION2, 0);
  }

  private static void Init_PQRY_ELIMINAZION2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ELIMINAZION2_RS, 10);
    IMDB.set_TblCode(IMDBDef15.PQRY_ELIMINAZION2_RS, "PQRY_ELIMINAZION2_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_DATA_MAND, "DATA_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_DATA_MAND,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_NUMERO_ELENCO, "NUMERO_ELENCO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_NUMERO_ELENCO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_DATA_ELENCO, "DATA_ELENCO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_DATA_ELENCO,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_PAGATO, "PAGATO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ELIMINAZION2_RS,IMDBDef15.PQSL_ELIMINAZION2_PAGATO,3,14,2);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Eliminazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public Eliminazione()
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
    FormIdx = MyGlb.FRM_ELIMINAZIONE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0F0AAFA6-F150-4E40-8B0E-482A87BE4BB0";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 804;
    DesignHeight = 342;
    set_Caption(new IDVariant("Eliminazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 804;
    Frames[1].Height = 316;
    Frames[1].Caption = "Eliminazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 316;
    PAN_ELIMINAZIONE = new IDPanel(w, this, 1, "PAN_ELIMINAZIONE");
    Frames[1].Content = PAN_ELIMINAZIONE;
    PAN_ELIMINAZIONE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELIMINAZIONE.VS = MainFrm.VisualStyleList;
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 804-MyGlb.PAN_OFFS_X, 316-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8E0E62A6-4930-4E09-B101-71D0C5035348");
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 736, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELIMINAZIONE.InitStatus = 2;
    PAN_ELIMINAZIONE_Init();
    PAN_ELIMINAZIONE_InitFields();
    PAN_ELIMINAZIONE_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_MENU7+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI90+BaseCmdSetIdx, "M" + (MyGlb.CMD_MENU7+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELIMINAINVIO+BaseCmdLinIdx)
      {
        Cancella();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELIMINANNULL+BaseCmdLinIdx)
      {
        Cancella();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELIMINVARIA2+BaseCmdLinIdx)
      {
        Cancella();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELIMINSOSTIT+BaseCmdLinIdx)
      {
        Cancella();
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
      if (IMDB.TblModified(IMDBDef6.TBL_IMDBVISUALIZ, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELIMINAZIONE_ELIMINAZION2();
      }
      PAN_ELIMINAZIONE.UpdatePanel(MainFrm);
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
    return (obj instanceof Eliminazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Eliminazione.class.getName() : (Glb.ClassWithPackage(Eliminazione.class) ? Eliminazione.class.getName().substring(Eliminazione.class.getPackage().getName().length() + 1) : Eliminazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Cancella
  // **********************************************************************
  public int Cancella ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DAL = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_AL = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Cancella Body
      // Procedure Body
      // 
      IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
      v_MSG1 = (new IDVariant("L'elaborazione elimina tutti "));
      IDVariant v_MANDATI = new IDVariant(0,IDVariant.STRING);
      v_MANDATI = (new IDVariant("i mandati"));
      IDVariant v_ORDINATIVI = new IDVariant(0,IDVariant.STRING);
      v_ORDINATIVI = (new IDVariant("gli ordinativi"));
      IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
      v_MSG2 = (new IDVariant(" presenti in elenco. Continuare?"));
      v_DAL = IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMEDAL, 0),(new IDVariant(0)));
      v_AL = IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMEAL, 0),(new IDVariant(99999)));
      if (MainFrm.MessageConfirm(IDL.Add(IDL.Add(v_MSG1, ((IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(1))))?v_MANDATI:((IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(3))))?v_MANDATI:((IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(5))))?v_MANDATI:((IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(7))))?v_MANDATI:v_ORDINATIVI))))), v_MSG2)))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(1)), true))
        {
          MainFrm.Cf4armDBObject.ELIMINAINVIOMANINF(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_DAL, v_AL, IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMDISNUM, 0));
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(2)), true))
        {
          MainFrm.Cf4armDBObject.ELIMINAINVIOORDINF(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_DAL, v_AL, IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMDISNUM, 0));
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(3)), true))
        {
          MainFrm.Cf4armDBObject.ELIMINAANNVARMANINF(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_DAL, v_AL, (new IDVariant("A")));
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(4)), true))
        {
          MainFrm.Cf4armDBObject.ELIMINAANNVARORDINF(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_DAL, v_AL, (new IDVariant("A")));
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(5)), true))
        {
          MainFrm.Cf4armDBObject.ELIMINAANNVARMANINF(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_DAL, v_AL, (new IDVariant("V")));
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(6)), true))
        {
          MainFrm.Cf4armDBObject.ELIMINAANNVARORDINF(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_DAL, v_AL, (new IDVariant("V")));
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(7)), true))
        {
          MainFrm.Cf4armDBObject.ELIMINASOSMANINF(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_DAL, v_AL);
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(8)), true))
        {
          MainFrm.Cf4armDBObject.ELIMINASOSORDINF(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_DAL, v_AL);
        }
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      MainFrm.RiempiIMDB();
      PAN_ELIMINAZIONE.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Eliminazione", "Cancella", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Eliminazione On Database Error Event
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
  private void PAN_ELIMINAZIONE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ELIMINAZIONE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Eliminazione On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Eliminazione", "EliminazioneOnDatabaseErrorEvent", _e);
    }
  }

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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      // 
      // setto la caption
      // 
      {
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(1)), true))
        {
          IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
          v_CAPTION = (new IDVariant("Eliminazione Invio Mandati", IDVariant.STRING));
          v_NOMECAPTION = IDL.Add(v_CAPTION, MainFrm.ESERCIZIO);
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINAINVIO+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINANNULL+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINVARIA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINSOSTIT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(2)), true))
        {
          IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
          v_CAPTION = (new IDVariant("Eliminazione Invio Ordinativi", IDVariant.STRING));
          v_NOMECAPTION = IDL.Add(v_CAPTION, MainFrm.ESERCIZIO);
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINAINVIO+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINANNULL+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINVARIA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINSOSTIT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(3)), true))
        {
          IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
          v_CAPTION = (new IDVariant("Eliminazione Annulli Mandati", IDVariant.STRING));
          v_NOMECAPTION = IDL.Add(v_CAPTION, MainFrm.ESERCIZIO);
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINAINVIO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINANNULL+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINVARIA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINSOSTIT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(4)), true))
        {
          IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
          v_CAPTION = (new IDVariant("Eliminazione Annulli Ordinativi", IDVariant.STRING));
          v_NOMECAPTION = IDL.Add(v_CAPTION, MainFrm.ESERCIZIO);
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINAINVIO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINANNULL+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINVARIA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINSOSTIT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(5)), true))
        {
          IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
          v_CAPTION = (new IDVariant("Eliminazione Variazioni Mandati", IDVariant.STRING));
          v_NOMECAPTION = IDL.Add(v_CAPTION, MainFrm.ESERCIZIO);
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINAINVIO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINANNULL+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINVARIA2+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINSOSTIT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(6)), true))
        {
          IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
          v_CAPTION = (new IDVariant("Eliminazione Variazioni Ordinativi", IDVariant.STRING));
          v_NOMECAPTION = IDL.Add(v_CAPTION, MainFrm.ESERCIZIO);
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINAINVIO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINANNULL+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINVARIA2+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINSOSTIT+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(7)), true))
        {
          IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
          v_CAPTION = (new IDVariant("Eliminazione Sostituzioni Mandati", IDVariant.STRING));
          v_NOMECAPTION = IDL.Add(v_CAPTION, MainFrm.ESERCIZIO);
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINAINVIO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINANNULL+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINVARIA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINSOSTIT+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(8)), true))
        {
          IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
          v_CAPTION = (new IDVariant("Eliminazione Sostituzioni Ordinativi", IDVariant.STRING));
          v_NOMECAPTION = IDL.Add(v_CAPTION, MainFrm.ESERCIZIO);
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINAINVIO+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINANNULL+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINVARIA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINSOSTIT+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        set_Caption(new IDVariant(v_NOMECAPTION));
      }
      // 
      // setto le etichette della tabella
      // 
      {
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMEMANDA, 0).equals((new IDVariant(1)), true))
        {
        }
        if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMEMANDA, 0).equals((new IDVariant(2)), true))
        {
          IDVariant v_MANDATO = new IDVariant(0,IDVariant.STRING);
          v_MANDATO = (new IDVariant("Ordinativo", IDVariant.STRING));
          IDVariant v_IMPEGNO = new IDVariant(0,IDVariant.STRING);
          v_IMPEGNO = (new IDVariant("Accertamento", IDVariant.STRING));
          IDVariant v_PAGATO = new IDVariant(0,IDVariant.STRING);
          v_PAGATO = (new IDVariant("Incassato", IDVariant.STRING));
          PAN_ELIMINAZIONE.set_FieldText(PFL_ELIMINAZIONE_MANDATOLABEL, new IDVariant(v_MANDATO).stringValue());
          PAN_ELIMINAZIONE.set_FieldText(PFL_ELIMINAZIONE_IMPEGNOLABEL, new IDVariant(v_IMPEGNO).stringValue());
          PAN_ELIMINAZIONE.set_FieldText(PFL_ELIMINAZIONE_PAGATOLABEL, new IDVariant(v_PAGATO).stringValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Eliminazione", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Eliminazione
  // Primary record source for panel data
  // **********************************************************************
  private void ELIMINAZIONE_ELIMINAZION2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_ELIMINAZION2_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_IMDBVISUALIZ, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_IMDBVISUALIZ, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_ELIMINAZION2_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_ELIMINAZION2_RS, 0, IMDBDef6.TBL_IMDBVISUALIZ, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ELIMINAZION2_RS, 0, 0, IMDBDef6.TBL_IMDBVISUALIZ, IMDBDef6.FLD_IMDBVISUALIZ_NUMERO_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ELIMINAZION2_RS, 1, 0, IMDBDef6.TBL_IMDBVISUALIZ, IMDBDef6.FLD_IMDBVISUALIZ_DATA_MAND, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ELIMINAZION2_RS, 2, 0, IMDBDef6.TBL_IMDBVISUALIZ, IMDBDef6.FLD_IMDBVISUALIZ_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ELIMINAZION2_RS, 3, 0, IMDBDef6.TBL_IMDBVISUALIZ, IMDBDef6.FLD_IMDBVISUALIZ_NUMERO_ELENCO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ELIMINAZION2_RS, 4, 0, IMDBDef6.TBL_IMDBVISUALIZ, IMDBDef6.FLD_IMDBVISUALIZ_DATA_ELENCO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ELIMINAZION2_RS, 5, 0, IMDBDef6.TBL_IMDBVISUALIZ, IMDBDef6.FLD_IMDBVISUALIZ_CAPITOLO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ELIMINAZION2_RS, 6, 0, IMDBDef6.TBL_IMDBVISUALIZ, IMDBDef6.FLD_IMDBVISUALIZ_ARTICOLO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ELIMINAZION2_RS, 7, 0, IMDBDef6.TBL_IMDBVISUALIZ, IMDBDef6.FLD_IMDBVISUALIZ_ANNO_IMP, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ELIMINAZION2_RS, 8, 0, IMDBDef6.TBL_IMDBVISUALIZ, IMDBDef6.FLD_IMDBVISUALIZ_NUMERO_IMP, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ELIMINAZION2_RS, 9, 0, IMDBDef6.TBL_IMDBVISUALIZ, IMDBDef6.FLD_IMDBVISUALIZ_PAGATO, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_IMDBVISUALIZ, 0);
      if (IMDB.Eof(IMDBDef6.TBL_IMDBVISUALIZ, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_IMDBVISUALIZ, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_ELIMINAZION2_RS, 0);
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
  private void PAN_ELIMINAZIONE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELIMINAZIONE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELIMINAZIONE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ELIMINAZIONE);
    // Stub
  }

  private void PAN_ELIMINAZIONE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ELIMINAZIONE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELIMINAZIONE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELIMINAZIONE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELIMINAZIONE_Init()
  {

    PAN_ELIMINAZIONE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELIMINAZIONE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELIMINAZIONE.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROMAND, "D95C96AB-3976-4183-BB6B-4DE057A2796B");
    PAN_ELIMINAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROMAND, "NUMERO MAND");
    PAN_ELIMINAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROMAND, "");
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAMAND, "C349A463-8E10-4098-9210-21887D6CD3C4");
    PAN_ELIMINAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAMAND, "DATA MAND");
    PAN_ELIMINAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAMAND, "");
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPORTO, "72EA785F-9C67-4980-990D-1C90C0FC3782");
    PAN_ELIMINAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPORTO, "Importo");
    PAN_ELIMINAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPORTO, "");
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROELENCO, "CF42D892-4551-4E15-8759-4FE7310ED389");
    PAN_ELIMINAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROELENCO, "NUMERO ELENCO");
    PAN_ELIMINAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROELENCO, "");
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROELENCO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROELENCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAELENCO, "D1C17571-6082-470A-B20C-77E80FCD30E2");
    PAN_ELIMINAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAELENCO, "DATA ELENCO");
    PAN_ELIMINAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAELENCO, "");
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAELENCO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAELENCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATO, "257BD23C-B30C-47EC-9F5B-F4A566CCD3C5");
    PAN_ELIMINAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATO, "Pagato");
    PAN_ELIMINAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATO, "");
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_CAPITOLO, "941A5608-669A-43D3-BC26-0CBA95A60DC2");
    PAN_ELIMINAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_CAPITOLO, "Capitolo");
    PAN_ELIMINAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_CAPITOLO, "");
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_CAPITOLO, MyGlb.VIS_NOFIINLUHELE);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ARTICOLO, "9C033067-18AC-4B3C-BF43-56C82094F5E2");
    PAN_ELIMINAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ARTICOLO, " ");
    PAN_ELIMINAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ARTICOLO, "");
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ARTICOLO, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ANNOIMP, "123FD21F-BBC0-45EF-9415-E8DE9ADEE54E");
    PAN_ELIMINAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ANNOIMP, "ANNO IMP");
    PAN_ELIMINAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ANNOIMP, "");
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROIMP, "4CB77D35-688A-48A5-98F4-359AE12A7CED");
    PAN_ELIMINAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROIMP, "NUMERO IMP");
    PAN_ELIMINAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROIMP, "");
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DISTINTLABEL, "ACACA0C5-9E54-4CCA-A3A7-3E54583CA25E");
    PAN_ELIMINAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DISTINTLABEL, "Distinta");
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DISTINTLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DISTINTLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPEGNOLABEL, "28BBBB09-4E81-4AE2-B474-218A3357530B");
    PAN_ELIMINAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPEGNOLABEL, "Impegno");
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPEGNOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPEGNOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_MANDATOLABEL, "A3990055-8A29-4EF9-9086-F2A8CB7FACD0");
    PAN_ELIMINAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_MANDATOLABEL, "Mandato");
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_MANDATOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_MANDATOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELIMINAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATOLABEL, "D5345525-0DDF-40C3-81D8-7A042AE60998");
    PAN_ELIMINAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATOLABEL, "Pagato");
    PAN_ELIMINAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELIMINAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_ELIMINAZIONE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROMAND, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROMAND, MyGlb.PANEL_LIST, "NUM. MAND");
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROMAND, MyGlb.PANEL_FORM, 4, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROMAND, MyGlb.PANEL_FORM, 84);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROMAND, MyGlb.PANEL_FORM, "NUM. MAND");
    PAN_ELIMINAZIONE.SetFieldPage(PFL_ELIMINAZIONE_NUMEROMAND, -1, -1);
    PAN_ELIMINAZIONE.SetFieldPanel(PFL_ELIMINAZIONE_NUMEROMAND, PPQRY_ELIMINAZION2, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAMAND, MyGlb.PANEL_LIST, 52, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAMAND, MyGlb.PANEL_LIST, 68);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAMAND, MyGlb.PANEL_LIST, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAMAND, MyGlb.PANEL_LIST, "DATA MAND");
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAMAND, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAMAND, MyGlb.PANEL_FORM, 68);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAMAND, MyGlb.PANEL_FORM, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAMAND, MyGlb.PANEL_FORM, "DT. MAND");
    PAN_ELIMINAZIONE.SetFieldPage(PFL_ELIMINAZIONE_DATAMAND, -1, -1);
    PAN_ELIMINAZIONE.SetFieldPanel(PFL_ELIMINAZIONE_DATAMAND, PPQRY_ELIMINAZION2, "A.DATA_MAND", "DATA_MAND", 6, 19, 0, -13997);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPORTO, MyGlb.PANEL_LIST, 144, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPORTO, MyGlb.PANEL_FORM, 4, 52, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ELIMINAZIONE.SetFieldPage(PFL_ELIMINAZIONE_IMPORTO, -1, -1);
    PAN_ELIMINAZIONE.SetFieldPanel(PFL_ELIMINAZIONE_IMPORTO, PPQRY_ELIMINAZION2, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROELENCO, MyGlb.PANEL_LIST, 224, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROELENCO, MyGlb.PANEL_LIST, 96);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROELENCO, MyGlb.PANEL_LIST, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROELENCO, MyGlb.PANEL_LIST, "NUM. ELENCO");
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROELENCO, MyGlb.PANEL_FORM, 4, 76, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROELENCO, MyGlb.PANEL_FORM, 96);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROELENCO, MyGlb.PANEL_FORM, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROELENCO, MyGlb.PANEL_FORM, "NUMERO ELENCO");
    PAN_ELIMINAZIONE.SetFieldPage(PFL_ELIMINAZIONE_NUMEROELENCO, -1, -1);
    PAN_ELIMINAZIONE.SetFieldPanel(PFL_ELIMINAZIONE_NUMEROELENCO, PPQRY_ELIMINAZION2, "A.NUMERO_ELENCO", "NUMERO_ELENCO", 1, 5, 0, -13997);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAELENCO, MyGlb.PANEL_LIST, 276, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAELENCO, MyGlb.PANEL_LIST, 80);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAELENCO, MyGlb.PANEL_LIST, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAELENCO, MyGlb.PANEL_LIST, "DATA ELENCO");
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAELENCO, MyGlb.PANEL_FORM, 4, 100, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAELENCO, MyGlb.PANEL_FORM, 80);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAELENCO, MyGlb.PANEL_FORM, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DATAELENCO, MyGlb.PANEL_FORM, "DATA ELENCO");
    PAN_ELIMINAZIONE.SetFieldPage(PFL_ELIMINAZIONE_DATAELENCO, -1, -1);
    PAN_ELIMINAZIONE.SetFieldPanel(PFL_ELIMINAZIONE_DATAELENCO, PPQRY_ELIMINAZION2, "A.DATA_ELENCO", "DATA_ELENCO", 6, 19, 0, -13997);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATO, MyGlb.PANEL_LIST, 368, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATO, MyGlb.PANEL_LIST, 52);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATO, MyGlb.PANEL_LIST, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATO, MyGlb.PANEL_LIST, "Pagato");
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATO, MyGlb.PANEL_FORM, 4, 244, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATO, MyGlb.PANEL_FORM, 52);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATO, MyGlb.PANEL_FORM, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATO, MyGlb.PANEL_FORM, "Pagato");
    PAN_ELIMINAZIONE.SetFieldPage(PFL_ELIMINAZIONE_PAGATO, -1, -1);
    PAN_ELIMINAZIONE.SetFieldPanel(PFL_ELIMINAZIONE_PAGATO, PPQRY_ELIMINAZION2, "A.PAGATO", "PAGATO", 3, 14, 2, -13997);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_CAPITOLO, MyGlb.PANEL_LIST, 448, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_CAPITOLO, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ELIMINAZIONE.SetFieldPage(PFL_ELIMINAZIONE_CAPITOLO, -1, -1);
    PAN_ELIMINAZIONE.SetFieldPanel(PFL_ELIMINAZIONE_CAPITOLO, PPQRY_ELIMINAZION2, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ARTICOLO, MyGlb.PANEL_LIST, 576, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ARTICOLO, MyGlb.PANEL_LIST, " ");
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ARTICOLO, MyGlb.PANEL_FORM, 4, 172, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ARTICOLO, MyGlb.PANEL_FORM, " ");
    PAN_ELIMINAZIONE.SetFieldPage(PFL_ELIMINAZIONE_ARTICOLO, -1, -1);
    PAN_ELIMINAZIONE.SetFieldPanel(PFL_ELIMINAZIONE_ARTICOLO, PPQRY_ELIMINAZION2, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ANNOIMP, MyGlb.PANEL_LIST, 604, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ANNOIMP, MyGlb.PANEL_FORM, 4, 196, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_ELIMINAZIONE.SetFieldPage(PFL_ELIMINAZIONE_ANNOIMP, -1, -1);
    PAN_ELIMINAZIONE.SetFieldPanel(PFL_ELIMINAZIONE_ANNOIMP, PPQRY_ELIMINAZION2, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROIMP, MyGlb.PANEL_LIST, 664, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROIMP, MyGlb.PANEL_LIST, "NUMERO IMP");
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROIMP, MyGlb.PANEL_FORM, 4, 220, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_ELIMINAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_ELIMINAZIONE.SetFieldPage(PFL_ELIMINAZIONE_NUMEROIMP, -1, -1);
    PAN_ELIMINAZIONE.SetFieldPanel(PFL_ELIMINAZIONE_NUMEROIMP, PPQRY_ELIMINAZION2, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DISTINTLABEL, MyGlb.PANEL_LIST, 224, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DISTINTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DISTINTLABEL, MyGlb.PANEL_LIST, 2);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DISTINTLABEL, MyGlb.PANEL_FORM, 280, 56, 128, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DISTINTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_DISTINTLABEL, MyGlb.PANEL_FORM, 1);
    PAN_ELIMINAZIONE.SetFieldPage(PFL_ELIMINAZIONE_DISTINTLABEL, -1, -1);
    PAN_ELIMINAZIONE.SetFieldPanel(PFL_ELIMINAZIONE_DISTINTLABEL, -1, "", "DISTINTLABEL", 0, 0, 0, -13997);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPEGNOLABEL, MyGlb.PANEL_LIST, 604, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPEGNOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPEGNOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPEGNOLABEL, MyGlb.PANEL_FORM, 568, 8, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPEGNOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_IMPEGNOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_ELIMINAZIONE.SetFieldPage(PFL_ELIMINAZIONE_IMPEGNOLABEL, -1, -1);
    PAN_ELIMINAZIONE.SetFieldPanel(PFL_ELIMINAZIONE_IMPEGNOLABEL, -1, "", "IMPEGNOLABEL", 0, 0, 0, -13997);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_MANDATOLABEL, MyGlb.PANEL_LIST, 0, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_MANDATOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_MANDATOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_MANDATOLABEL, MyGlb.PANEL_FORM, 0, 4, 152, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_MANDATOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_MANDATOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_ELIMINAZIONE.SetFieldPage(PFL_ELIMINAZIONE_MANDATOLABEL, -1, -1);
    PAN_ELIMINAZIONE.SetFieldPanel(PFL_ELIMINAZIONE_MANDATOLABEL, -1, "", "MANDATOLABEL", 0, 0, 0, -13997);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATOLABEL, MyGlb.PANEL_LIST, 368, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_ELIMINAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATOLABEL, MyGlb.PANEL_FORM, 388, 4, 60, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELIMINAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_ELIMINAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELIMINAZIONE_PAGATOLABEL, MyGlb.PANEL_FORM, 2);
    PAN_ELIMINAZIONE.SetFieldPage(PFL_ELIMINAZIONE_PAGATOLABEL, -1, -1);
    PAN_ELIMINAZIONE.SetFieldPanel(PFL_ELIMINAZIONE_PAGATOLABEL, -1, "", "PAGATOLABEL", 0, 0, 0, -13997);
  }

  private void PAN_ELIMINAZIONE_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELIMINAZIONE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELIMINAZIONE.SetIMDB(IMDB, "PQRY_ELIMINAZION2", true);
    PAN_ELIMINAZIONE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_ELIMINAZIONE.SetQueryIMDB(PPQRY_ELIMINAZION2, IMDBDef15.PQRY_ELIMINAZION2_RS, IMDBDef6.TBL_IMDBVISUALIZ);
    JustLoaded = true;
    PAN_ELIMINAZIONE.SetFieldPrimaryIndex(PFL_ELIMINAZIONE_NUMEROMAND, IMDBDef6.FLD_IMDBVISUALIZ_NUMERO_MAND);
    PAN_ELIMINAZIONE.SetFieldPrimaryIndex(PFL_ELIMINAZIONE_DATAMAND, IMDBDef6.FLD_IMDBVISUALIZ_DATA_MAND);
    PAN_ELIMINAZIONE.SetFieldPrimaryIndex(PFL_ELIMINAZIONE_IMPORTO, IMDBDef6.FLD_IMDBVISUALIZ_IMPORTO);
    PAN_ELIMINAZIONE.SetFieldPrimaryIndex(PFL_ELIMINAZIONE_NUMEROELENCO, IMDBDef6.FLD_IMDBVISUALIZ_NUMERO_ELENCO);
    PAN_ELIMINAZIONE.SetFieldPrimaryIndex(PFL_ELIMINAZIONE_DATAELENCO, IMDBDef6.FLD_IMDBVISUALIZ_DATA_ELENCO);
    PAN_ELIMINAZIONE.SetFieldPrimaryIndex(PFL_ELIMINAZIONE_PAGATO, IMDBDef6.FLD_IMDBVISUALIZ_PAGATO);
    PAN_ELIMINAZIONE.SetFieldPrimaryIndex(PFL_ELIMINAZIONE_CAPITOLO, IMDBDef6.FLD_IMDBVISUALIZ_CAPITOLO);
    PAN_ELIMINAZIONE.SetFieldPrimaryIndex(PFL_ELIMINAZIONE_ARTICOLO, IMDBDef6.FLD_IMDBVISUALIZ_ARTICOLO);
    PAN_ELIMINAZIONE.SetFieldPrimaryIndex(PFL_ELIMINAZIONE_ANNOIMP, IMDBDef6.FLD_IMDBVISUALIZ_ANNO_IMP);
    PAN_ELIMINAZIONE.SetFieldPrimaryIndex(PFL_ELIMINAZIONE_NUMEROIMP, IMDBDef6.FLD_IMDBVISUALIZ_NUMERO_IMP);
    PAN_ELIMINAZIONE.SetMasterTable(0, "IMDBVISUALIZ");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELIMINAZIONE.Status() == 2)
    {
      int oldListQBE = PAN_ELIMINAZIONE.iUseListQBE;
      PAN_ELIMINAZIONE.iUseListQBE = 0;
      PAN_ELIMINAZIONE.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELIMINAZIONE.PanelCommand(Glb.PCM_FIND);
      PAN_ELIMINAZIONE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELIMINAZIONE) PAN_ELIMINAZIONE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELIMINAZIONE) PAN_ELIMINAZIONE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELIMINAZIONE) PAN_ELIMINAZIONE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELIMINAZIONE) PAN_ELIMINAZIONE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELIMINAZIONE) PAN_ELIMINAZIONE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
