// **********************************************
// Scheda Informazioni Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SchedaInformazioniVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_ES = 0;
  private static int PFL_PARS_VARIPUROPOSI = 1;
  private static int PFL_PARS_VARIPURONEGA = 2;
  private static int PFL_PARS_VARIAIMPPOSI = 3;
  private static int PFL_PARS_VARIAIMPNEGA = 4;
  private static int PFL_PARS_VARIASTNPOSI = 5;
  private static int PFL_PARS_VARIASTNNEGA = 6;
  private static int PFL_PARS_VARIACAPOSIT = 7;
  private static int PFL_PARS_VARIACANEGAT = 8;
  private static int PFL_PARS_ETICHETTPURO = 9;
  private static int PFL_PARS_ETICREIDAESI = 10;
  private static int PFL_PARS_ETICHETCASSA = 11;
  private static int PFL_PARS_ETICREIDASTA = 12;
  private static int PFL_PARS_DUALPOS = 13;
  private static int PFL_PARS_DUALNEG = 14;
  private static int PFL_PARS_ETICHETOTALE = 15;

  private static int PPQRY_PARS34 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_PARS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS81(IMDB);
    //
    //
    Init_PQRY_PARS34(IMDB);
    Init_PQRY_PARS34_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS81(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARS81, 9);
    IMDB.set_TblCode(IMDBDef7.TBL_PARS81, "TBL_PARS81");
    IMDB.set_FldCode(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVAPUPO, "NOMOGGVAPUPO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVAPUPO,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVAPUNE, "NOMOGGVAPUNE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVAPUNE,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVAIMPO, "NOMOGGVAIMPO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVAIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVAIMNE, "NOMOGGVAIMNE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVAIMNE,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVASTPO, "NOMOGGVASTPO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVASTPO,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVASTNE, "NOMOGGVASTNE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVASTNE,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVACAPO, "NOMOGGVACAPO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVACAPO,3,14,2);
    IMDB.set_FldCode(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVACANE, "NOMOGGVACANE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARS81,IMDBDef7.FLD_PARS81_NOMOGGVACANE,3,14,2);
    IMDB.TblAddNew(IMDBDef7.TBL_PARS81, 0);
  }

  private static void Init_PQRY_PARS34(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARS34, 9);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARS34, "PQRY_PARS34");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVAPUPO, "NOMOGGVAPUPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVAPUPO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVAPUNE, "NOMOGGVAPUNE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVAPUNE,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVAIMPO, "NOMOGGVAIMPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVAIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVAIMNE, "NOMOGGVAIMNE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVAIMNE,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVASTPO, "NOMOGGVASTPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVASTPO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVASTNE, "NOMOGGVASTNE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVASTNE,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVACAPO, "NOMOGGVACAPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVACAPO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVACANE, "NOMOGGVACANE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34,IMDBDef17.PQSL_PARS34_NOMOGGVACANE,3,14,2);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARS34, 0);
  }

  private static void Init_PQRY_PARS34_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARS34_RS, 9);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARS34_RS, "PQRY_PARS34_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVAPUPO, "NOMOGGVAPUPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVAPUPO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVAPUNE, "NOMOGGVAPUNE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVAPUNE,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVAIMPO, "NOMOGGVAIMPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVAIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVAIMNE, "NOMOGGVAIMNE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVAIMNE,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVASTPO, "NOMOGGVASTPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVASTPO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVASTNE, "NOMOGGVASTNE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVASTNE,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVACAPO, "NOMOGGVACAPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVACAPO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVACANE, "NOMOGGVACANE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARS34_RS,IMDBDef17.PQSL_PARS34_NOMOGGVACANE,3,14,2);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SchedaInformazioniVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public SchedaInformazioniVariazioni()
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
    FormIdx = MyGlb.FRM_SCHEINFOVARI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7C0AAE05-9220-4325-B62E-D975A6BAF6F8";
    ResModeW = 3;
    ResModeH = 1;
    iBorderType = 2;
    iVisualFlags = -4057;
    DesignWidth = 732;
    DesignHeight = 178;
    set_Caption(new IDVariant("Scheda Informazioni Variazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 732;
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
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 732-MyGlb.PAN_OFFS_X, 152-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AA42E748-0769-4B30-917B-8CACAC255D98");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 872, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARS81, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCHEINFOVARI_PARS34();
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
    return (obj instanceof SchedaInformazioniVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SchedaInformazioniVariazioni.class.getName() : (Glb.ClassWithPackage(SchedaInformazioniVariazioni.class) ? SchedaInformazioniVariazioni.class.getName().substring(SchedaInformazioniVariazioni.class.getPackage().getName().length() + 1) : SchedaInformazioniVariazioni.class.getName()));
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
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformazioniVariazioni", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVAPUPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVAPUNE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVAIMPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVAIMNE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVASTPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVASTNE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVACAPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVACANE, 0, new IDVariant());
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
      if (IMDB.Value(IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_VARIASTNPOSI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_VARIASTNNEGA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICREIDASTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformazioniVariazioni", "Load", _e);
    }
  }

  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cioè quando viene portata in primo piano
  // **********************************************************************
  public void Form_Activate()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.Form_Activate(this);
      // 
      // Activate Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_SCHEDINFOBIL, 0, false)!=null))
      {
        MainFrm.GetForm(MyGlb.FRM_SCHEDINFOBIL,0).set_WindowState((new IDVariant(0)).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformazioniVariazioni", "Activate", _e);
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCHEINFOVARI_PARS34() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARS34_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARS81, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARS81, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARS34_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARS34_RS, 0, IMDBDef7.TBL_PARS81, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARS34_RS, 0, 0, IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMEOGGETTES, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARS34_RS, 1, 0, IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVAPUPO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARS34_RS, 2, 0, IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVAPUNE, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARS34_RS, 3, 0, IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVAIMPO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARS34_RS, 4, 0, IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVAIMNE, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARS34_RS, 5, 0, IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVASTPO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARS34_RS, 6, 0, IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVASTNE, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARS34_RS, 7, 0, IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVACAPO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARS34_RS, 8, 0, IMDBDef7.TBL_PARS81, IMDBDef7.FLD_PARS81_NOMOGGVACANE, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARS81, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARS81, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARS81, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARS34_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
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
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ES, "5C9774FA-078B-4FBB-A5F8-A7A0014D32B1");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ES, "ES");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ES, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ES, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_VARIPUROPOSI, "EBA9A110-9264-4BE2-BA61-1469CCBA4D15");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_VARIPUROPOSI, "Variazioni Positive");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_VARIPUROPOSI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_VARIPUROPOSI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_VARIPUROPOSI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_VARIPURONEGA, "F59A5CB0-D395-4B47-B7EC-044E3ED3D4D6");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_VARIPURONEGA, "Variazioni Negative");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_VARIPURONEGA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_VARIPURONEGA, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_VARIPURONEGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPPOSI, "63FEA00B-D26E-45A8-A428-BEEB7C1781EE");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPPOSI, "Variazioni Imp Positive");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPPOSI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPPOSI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPPOSI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPNEGA, "BE7C641D-3749-4F68-8BF9-EEDAA17A44CC");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPNEGA, "Variazioni Imp Negative");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPNEGA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPNEGA, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPNEGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNPOSI, "CF371567-DEC1-433B-BBF8-726A50659E2D");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNPOSI, "Variazioni Stn Positive");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNPOSI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNPOSI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNPOSI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNNEGA, "33FF676A-DFBC-4AC2-86D7-43B5CA463DB8");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNNEGA, "Variazioni Stn Negative");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNNEGA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNNEGA, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNNEGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_VARIACAPOSIT, "9686EB6C-DA58-4F21-8FC7-84563C8D45AA");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_VARIACAPOSIT, "Variazioni Ca Positive");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_VARIACAPOSIT, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_VARIACAPOSIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_VARIACAPOSIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_VARIACANEGAT, "39829E65-1269-4738-95AD-A0476B14551C");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_VARIACANEGAT, "Variazioni Ca Negative");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_VARIACANEGAT, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_VARIACANEGAT, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_VARIACANEGAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTPURO, "E0B66622-CD75-455D-A353-FACE7AABDDB3");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTPURO, "Puro");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTPURO, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTPURO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDAESI, "0B520E57-0BE3-4161-B4C7-9499269C461C");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDAESI, "Reiscrizione da Esigibilità");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDAESI, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDAESI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETCASSA, "8BD233E2-0B47-404A-850A-D4839D706531");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETCASSA, "Cassa");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETCASSA, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETCASSA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDASTA, "0E9A1FCD-8F2C-4F4E-B9F2-7775E09BE809");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDASTA, "Reiscrizioni da Stanziamento");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDASTA, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDASTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DUALPOS, "07130686-E7E3-47B5-A667-E5871E1023DB");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DUALPOS, "Variazioni Positive");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DUALPOS, "Totale Positive");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DUALPOS, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DUALPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DUALNEG, "34C36611-9729-4A13-8E97-1824EBEFE830");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DUALNEG, "Variazioni Negative");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DUALNEG, "Totale Negative");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DUALNEG, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DUALNEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETOTALE, "EBA86639-FA5C-4D57-B413-21BA4CC5E7DA");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETOTALE, "Totale");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETOTALE, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_LIST, 24);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_LIST, "ES");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_FORM, 4, 4, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_FORM, 160);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ES, MyGlb.PANEL_FORM, "ES");
    PAN_PARS.SetFieldPage(PFL_PARS_ES, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ES, PPQRY_PARS34, "A.NOMEOGGETTES", "NOMEOGGETTES", 5, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIPUROPOSI, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIPUROPOSI, MyGlb.PANEL_LIST, 140);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIPUROPOSI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIPUROPOSI, MyGlb.PANEL_LIST, "Variazioni Positive");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIPUROPOSI, MyGlb.PANEL_FORM, 240, 48, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIPUROPOSI, MyGlb.PANEL_FORM, 116);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIPUROPOSI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIPUROPOSI, MyGlb.PANEL_FORM, "Variazioni Positive");
    PAN_PARS.SetFieldPage(PFL_PARS_VARIPUROPOSI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_VARIPUROPOSI, PPQRY_PARS34, "A.NOMOGGVAPUPO", "NOMOGGVAPUPO", 3, 14, 2, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIPURONEGA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIPURONEGA, MyGlb.PANEL_LIST, 148);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIPURONEGA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIPURONEGA, MyGlb.PANEL_LIST, "Variazioni Negative");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIPURONEGA, MyGlb.PANEL_FORM, 240, 72, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIPURONEGA, MyGlb.PANEL_FORM, 116);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIPURONEGA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIPURONEGA, MyGlb.PANEL_FORM, "Variazioni Negative");
    PAN_PARS.SetFieldPage(PFL_PARS_VARIPURONEGA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_VARIPURONEGA, PPQRY_PARS34, "A.NOMOGGVAPUNE", "NOMOGGVAPUNE", 3, 14, 2, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPPOSI, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPPOSI, MyGlb.PANEL_LIST, 140);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPPOSI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPPOSI, MyGlb.PANEL_LIST, "Variaz. Imp Positive");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPPOSI, MyGlb.PANEL_FORM, 356, 48, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPPOSI, MyGlb.PANEL_FORM, 68);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPPOSI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPPOSI, MyGlb.PANEL_FORM, "Var. I. Pos.");
    PAN_PARS.SetFieldPage(PFL_PARS_VARIAIMPPOSI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_VARIAIMPPOSI, PPQRY_PARS34, "A.NOMOGGVAIMPO", "NOMOGGVAIMPO", 3, 14, 2, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPNEGA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPNEGA, MyGlb.PANEL_LIST, 144);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPNEGA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPNEGA, MyGlb.PANEL_LIST, "Variaz. Imp Negative");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPNEGA, MyGlb.PANEL_FORM, 356, 72, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPNEGA, MyGlb.PANEL_FORM, 68);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPNEGA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIAIMPNEGA, MyGlb.PANEL_FORM, "Var. I. Neg.");
    PAN_PARS.SetFieldPage(PFL_PARS_VARIAIMPNEGA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_VARIAIMPNEGA, PPQRY_PARS34, "A.NOMOGGVAIMNE", "NOMOGGVAIMNE", 3, 14, 2, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNPOSI, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNPOSI, MyGlb.PANEL_LIST, 136);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNPOSI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNPOSI, MyGlb.PANEL_LIST, "Variaz. Stn Positive");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNPOSI, MyGlb.PANEL_FORM, 476, 48, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNPOSI, MyGlb.PANEL_FORM, 68);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNPOSI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNPOSI, MyGlb.PANEL_FORM, "Var. S. Pos.");
    PAN_PARS.SetFieldPage(PFL_PARS_VARIASTNPOSI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_VARIASTNPOSI, PPQRY_PARS34, "A.NOMOGGVASTPO", "NOMOGGVASTPO", 3, 14, 2, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNNEGA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNNEGA, MyGlb.PANEL_LIST, 140);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNNEGA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNNEGA, MyGlb.PANEL_LIST, "Variaz. Stn Negative");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNNEGA, MyGlb.PANEL_FORM, 476, 72, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNNEGA, MyGlb.PANEL_FORM, 68);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNNEGA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIASTNNEGA, MyGlb.PANEL_FORM, "Var. S. Neg.");
    PAN_PARS.SetFieldPage(PFL_PARS_VARIASTNNEGA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_VARIASTNNEGA, PPQRY_PARS34, "A.NOMOGGVASTNE", "NOMOGGVASTNE", 3, 14, 2, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIACAPOSIT, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIACAPOSIT, MyGlb.PANEL_LIST, 128);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIACAPOSIT, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIACAPOSIT, MyGlb.PANEL_LIST, "Variazioni Ca Positive");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIACAPOSIT, MyGlb.PANEL_FORM, 592, 48, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIACAPOSIT, MyGlb.PANEL_FORM, 68);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIACAPOSIT, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIACAPOSIT, MyGlb.PANEL_FORM, "Var. C. Pos.");
    PAN_PARS.SetFieldPage(PFL_PARS_VARIACAPOSIT, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_VARIACAPOSIT, PPQRY_PARS34, "A.NOMOGGVACAPO", "NOMOGGVACAPO", 3, 14, 2, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIACANEGAT, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIACANEGAT, MyGlb.PANEL_LIST, 136);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIACANEGAT, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIACANEGAT, MyGlb.PANEL_LIST, "Variaz. Ca Negative");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_VARIACANEGAT, MyGlb.PANEL_FORM, 592, 72, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_VARIACANEGAT, MyGlb.PANEL_FORM, 68);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_VARIACANEGAT, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_VARIACANEGAT, MyGlb.PANEL_FORM, "Var. C. Neg.");
    PAN_PARS.SetFieldPage(PFL_PARS_VARIACANEGAT, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_VARIACANEGAT, PPQRY_PARS34, "A.NOMOGGVACANE", "NOMOGGVACANE", 3, 14, 2, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTPURO, MyGlb.PANEL_LIST, 144, 8, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTPURO, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTPURO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTPURO, MyGlb.PANEL_FORM, 240, 24, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTPURO, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTPURO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHETTPURO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHETTPURO, -1, "", "ETICHETTPURO", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDAESI, MyGlb.PANEL_LIST, 300, 12, 68, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDAESI, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDAESI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDAESI, MyGlb.PANEL_FORM, 356, 12, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDAESI, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDAESI, MyGlb.PANEL_FORM, 2);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICREIDAESI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICREIDAESI, -1, "", "ETICREIDAESI", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETCASSA, MyGlb.PANEL_LIST, 448, 12, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETCASSA, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETCASSA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETCASSA, MyGlb.PANEL_FORM, 592, 24, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETCASSA, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETCASSA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHETCASSA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHETCASSA, -1, "", "ETICHETCASSA", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDASTA, MyGlb.PANEL_LIST, 160, 24, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDASTA, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDASTA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDASTA, MyGlb.PANEL_FORM, 476, 12, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDASTA, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICREIDASTA, MyGlb.PANEL_FORM, 2);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICREIDASTA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICREIDASTA, -1, "", "ETICREIDASTA", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DUALPOS, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DUALPOS, MyGlb.PANEL_LIST, 64);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DUALPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DUALPOS, MyGlb.PANEL_LIST, "Variazioni Positive");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DUALPOS, MyGlb.PANEL_FORM, 4, 48, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DUALPOS, MyGlb.PANEL_FORM, 116);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DUALPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DUALPOS, MyGlb.PANEL_FORM, "Variazioni Positive");
    PAN_PARS.SetFieldPage(PFL_PARS_DUALPOS, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_DUALPOS, PPQRY_DUAL, "NVL(~~NOMOGGVAPUPO~~, 0) + NVL(~~NOMOGGVAIMPO~~, 0) + CASE WHEN ~~TBL_PARS81.NOMEOGGETTES~~ = 'S' THEN NVL(~~NOMOGGVASTPO~~, 0) ELSE 0 END", "POS", 3, 28, 6, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DUALNEG, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DUALNEG, MyGlb.PANEL_LIST, 64);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DUALNEG, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DUALNEG, MyGlb.PANEL_LIST, "Variazioni Negative");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DUALNEG, MyGlb.PANEL_FORM, 4, 72, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DUALNEG, MyGlb.PANEL_FORM, 116);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DUALNEG, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DUALNEG, MyGlb.PANEL_FORM, "Variazioni Negative");
    PAN_PARS.SetFieldPage(PFL_PARS_DUALNEG, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_DUALNEG, PPQRY_DUAL, "NVL(~~NOMOGGVAPUNE~~, 0) + NVL(~~NOMOGGVAIMNE~~, 0) + CASE WHEN ~~TBL_PARS81.NOMEOGGETTES~~ = 'S' THEN NVL(~~NOMOGGVASTNE~~, 0) ELSE 0 END", "NEG", 3, 28, 6, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETOTALE, MyGlb.PANEL_LIST, 152, 16, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETOTALE, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETOTALE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETOTALE, MyGlb.PANEL_FORM, 124, 24, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETOTALE, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETOTALE, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHETOTALE, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHETOTALE, -1, "", "ETICHETOTALE", 0, 0, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(~~NOMOGGVAPUPO~~, 0) + NVL(~~NOMOGGVAIMPO~~, 0) + CASE WHEN ~~TBL_PARS81.NOMEOGGETTES~~ = 'S' THEN NVL(~~NOMOGGVASTPO~~, 0) ELSE 0 END as POS, ");
    SQL.append("  NVL(~~NOMOGGVAPUNE~~, 0) + NVL(~~NOMOGGVAIMNE~~, 0) + CASE WHEN ~~TBL_PARS81.NOMEOGGETTES~~ = 'S' THEN NVL(~~NOMOGGVASTNE~~, 0) ELSE 0 END as NEG ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_PARS.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_PARS.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS34", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS34, IMDBDef17.PQRY_PARS34_RS, IMDBDef7.TBL_PARS81);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ES, IMDBDef7.FLD_PARS81_NOMEOGGETTES);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_VARIPUROPOSI, IMDBDef7.FLD_PARS81_NOMOGGVAPUPO);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_VARIPURONEGA, IMDBDef7.FLD_PARS81_NOMOGGVAPUNE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_VARIAIMPPOSI, IMDBDef7.FLD_PARS81_NOMOGGVAIMPO);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_VARIAIMPNEGA, IMDBDef7.FLD_PARS81_NOMOGGVAIMNE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_VARIASTNPOSI, IMDBDef7.FLD_PARS81_NOMOGGVASTPO);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_VARIASTNNEGA, IMDBDef7.FLD_PARS81_NOMOGGVASTNE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_VARIACAPOSIT, IMDBDef7.FLD_PARS81_NOMOGGVACAPO);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_VARIACANEGAT, IMDBDef7.FLD_PARS81_NOMOGGVACANE);
    PAN_PARS.SetMasterTable(0, "PARS81");
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
