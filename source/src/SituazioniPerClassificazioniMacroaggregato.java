// **********************************************
// Situazioni Per Classificazioni Macroaggregato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioniPerClassificazioniMacroaggregato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PERSIT_ES = 0;
  private static int PFL_PERSIT_TITOLI = 1;
  private static int PFL_PERSIT_MACROAGGREGA = 2;
  private static int PFL_PERSIT_DETTAGCAPITO = 3;
  private static int PFL_PERSIT_DESCRIABBREV = 4;
  private static int PFL_PERSIT_SOLOCOMPETEN = 5;
  private static int PFL_PERSIT_DATAELABORAZ = 6;
  private static int PFL_PERSIT_ETICHEELABOR = 7;

  private static int PPQRY_PERSIT6 = 0;

  private static int PPQRY_VISTMISSPRO1 = 1;
  private static int PPQRY_VISTMISSPROG = 2;


  IDPanel PAN_PERSIT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PERSIT7(IMDB);
    //
    //
    Init_PQRY_PERSIT6(IMDB);
    Init_PQRY_PERSIT6_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PERSIT7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PERSIT7, 8);
    IMDB.set_TblCode(IMDBDef4.TBL_PERSIT7, "TBL_PERSIT7");
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMEOGGETITO, "NOMEOGGETITO");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMEOGGETITO,1,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMEOGGEMACR, "NOMEOGGEMACR");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMEOGGEMACR,1,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMOGGDETCAP, "NOMOGGDETCAP");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMOGGDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMOGGSOLCOM, "NOMOGGSOLCOM");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMOGGSOLCOM,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMOGGDESABB, "NOMOGGDESABB");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMOGGDESABB,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMOGGDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMOGGTIPMAC, "NOMOGGTIPMAC");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMOGGTIPMAC,5,20,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT7,IMDBDef4.FLD_PERSIT7_NOMEOGGETTES,5,1,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PERSIT7, 0);
  }

  private static void Init_PQRY_PERSIT6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PERSIT6, 7);
    IMDB.set_TblCode(IMDBDef13.PQRY_PERSIT6, "PQRY_PERSIT6");
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT6,IMDBDef13.PQSL_PERSIT6_NOMEOGGETITO, "NOMEOGGETITO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT6,IMDBDef13.PQSL_PERSIT6_NOMEOGGETITO,1,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT6,IMDBDef13.PQSL_PERSIT6_NOMEOGGEMACR, "NOMEOGGEMACR");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT6,IMDBDef13.PQSL_PERSIT6_NOMEOGGEMACR,1,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT6,IMDBDef13.PQSL_PERSIT6_NOMOGGDETCAP, "NOMOGGDETCAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT6,IMDBDef13.PQSL_PERSIT6_NOMOGGDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT6,IMDBDef13.PQSL_PERSIT6_NOMOGGSOLCOM, "NOMOGGSOLCOM");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT6,IMDBDef13.PQSL_PERSIT6_NOMOGGSOLCOM,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT6,IMDBDef13.PQSL_PERSIT6_NOMOGGDESABB, "NOMOGGDESABB");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT6,IMDBDef13.PQSL_PERSIT6_NOMOGGDESABB,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT6,IMDBDef13.PQSL_PERSIT6_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT6,IMDBDef13.PQSL_PERSIT6_NOMOGGDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT6,IMDBDef13.PQSL_PERSIT6_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT6,IMDBDef13.PQSL_PERSIT6_NOMEOGGETTES,5,1,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PERSIT6, 0);
  }

  private static void Init_PQRY_PERSIT6_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PERSIT6_RS, 7);
    IMDB.set_TblCode(IMDBDef13.PQRY_PERSIT6_RS, "PQRY_PERSIT6_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT6_RS,IMDBDef13.PQSL_PERSIT6_NOMEOGGETITO, "NOMEOGGETITO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT6_RS,IMDBDef13.PQSL_PERSIT6_NOMEOGGETITO,1,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT6_RS,IMDBDef13.PQSL_PERSIT6_NOMEOGGEMACR, "NOMEOGGEMACR");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT6_RS,IMDBDef13.PQSL_PERSIT6_NOMEOGGEMACR,1,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT6_RS,IMDBDef13.PQSL_PERSIT6_NOMOGGDETCAP, "NOMOGGDETCAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT6_RS,IMDBDef13.PQSL_PERSIT6_NOMOGGDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT6_RS,IMDBDef13.PQSL_PERSIT6_NOMOGGSOLCOM, "NOMOGGSOLCOM");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT6_RS,IMDBDef13.PQSL_PERSIT6_NOMOGGSOLCOM,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT6_RS,IMDBDef13.PQSL_PERSIT6_NOMOGGDESABB, "NOMOGGDESABB");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT6_RS,IMDBDef13.PQSL_PERSIT6_NOMOGGDESABB,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT6_RS,IMDBDef13.PQSL_PERSIT6_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT6_RS,IMDBDef13.PQSL_PERSIT6_NOMOGGDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT6_RS,IMDBDef13.PQSL_PERSIT6_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT6_RS,IMDBDef13.PQSL_PERSIT6_NOMEOGGETTES,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioniPerClassificazioniMacroaggregato(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioniPerClassificazioniMacroaggregato()
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
    FormIdx = MyGlb.FRM_SITPERCLAMAC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3EAFBD38-A865-4A05-BC8F-3AB63D7D272F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 532;
    DesignHeight = 226;
    set_Caption(new IDVariant("per Macroaggregato"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 532;
    Frames[1].Height = 200;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Per Sit";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 200;
    PAN_PERSIT = new IDPanel(w, this, 1, "PAN_PERSIT");
    Frames[1].Content = PAN_PERSIT;
    PAN_PERSIT.Lockable = false;
    PAN_PERSIT.iLocked = false;
    PAN_PERSIT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PERSIT.VS = MainFrm.VisualStyleList;
    PAN_PERSIT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 532-MyGlb.PAN_OFFS_X, 200-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "77C272BD-9115-484B-92CE-759FC7590685");
    PAN_PERSIT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 456, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PERSIT.InitStatus = 1;
    PAN_PERSIT_Init();
    PAN_PERSIT_InitFields();
    PAN_PERSIT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PERSIT7, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITPERCLAMAC_PERSIT6();
      }
      PAN_PERSIT.UpdatePanel(MainFrm);
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
    return (obj instanceof SituazioniPerClassificazioniMacroaggregato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioniPerClassificazioniMacroaggregato.class.getName() : (Glb.ClassWithPackage(SituazioniPerClassificazioniMacroaggregato.class) ? SituazioniPerClassificazioniMacroaggregato.class.getName().substring(SituazioniPerClassificazioniMacroaggregato.class.getPackage().getName().length() + 1) : SituazioniPerClassificazioniMacroaggregato.class.getName()));
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
      IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGDETCAP, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGSOLCOM, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGDESABB, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGDATELA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMEOGGETITO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMEOGGEMACR, 0, (new IDVariant()));
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Situazioni per "));
      set_Caption(IDL.Add(S, IMDB.Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGTIPMAC, 0)));
      if (IMDB.Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGTIPMAC, 0).compareTo((new IDVariant("Macroaggregato")), true)!=0)
      {
        PAN_PERSIT.set_Header(Glb.OBJ_FIELD,PFL_PERSIT_MACROAGGREGA, IMDB.Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGTIPMAC, 0).stringValue());
      }
      IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMEOGGETTES, 0, (new IDVariant("S")));
      if (IMDB.Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGTIPMAC, 0).equals((new IDVariant("Macroaggregato")), true) || IMDB.Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGTIPMAC, 0).equals((new IDVariant("Cofog")), true))
      {
        PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_ES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGTIPMAC, 0).equals((new IDVariant("Cofog")), true))
      {
        PAN_PERSIT.set_Header(Glb.OBJ_FIELD,PFL_PERSIT_TITOLI, (new IDVariant("Divisioni")).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioniPerClassificazioniMacroaggregato", "Load", _e);
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
      UNLOAD_PERSITDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioniPerClassificazioniMacroaggregato", "Unload", _e);
    }
  }

  // **********************************************************************
  // Per Sit: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PERSITDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMEOGGETITO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMEOGGEMACR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGDETCAP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGSOLCOM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGDESABB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGDATELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGTIPMAC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMEOGGETTES, 0, new IDVariant());
  }

  // **********************************************************************
  // Per Sit On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PERSIT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Per Sit On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PERSIT_ES)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGETITO, 0, (new IDVariant()));
      }
      if (Column.equals((new IDVariant(PFL_PERSIT_TITOLI)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGEMACR, 0, (new IDVariant()));
      }
      if (Column.equals((new IDVariant(PFL_PERSIT_DETTAGCAPITO)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDETCAP, 0),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDESABB, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioniPerClassificazioniMacroaggregato", "PerSitOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Per Sit On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PERSIT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PERSIT);
      // 
      // Per Sit On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDETCAP, 0),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
      {
        PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioniPerClassificazioniMacroaggregato", "PerSitOnDynamicProperties", _e);
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
      IDVariant v_STAMPA = new IDVariant(0,IDVariant.STRING);
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
      v_S1 = (new IDVariant("Sit_Class_MacroAggregato"));
      IDVariant v_S2 = new IDVariant(0,IDVariant.STRING);
      v_S2 = (new IDVariant("Sit_Class_TitoloTipologia"));
      if (IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
      {
        v_STAMPA = new IDVariant(v_S1);
      }
      else
      {
        v_STAMPA = new IDVariant(v_S2);
      }
      if (IMDB.Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGTIPMAC, 0).equals((new IDVariant("Macroaggregato")), true))
      {
        MainFrm.Cf4armDBObject.WORKSITCLASMACRO2S(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDATELA, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGSOLCOM, 0), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGETITO, 0)), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGEMACR, 0)), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDESABB, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDETCAP, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("SI"))));
      }
      else if (IMDB.Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGTIPMAC, 0).equals((new IDVariant("Codice IV Livello")), true))
      {
        if (IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
        {
          MainFrm.Cf4armDBObject.WORKSITCLASMACRO4E(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDATELA, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGSOLCOM, 0), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGETITO, 0)), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGEMACR, 0)), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDESABB, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDETCAP, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("SI"))));
        }
        else
        {
          MainFrm.Cf4armDBObject.WORKSITCLASMACRO4S(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDATELA, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGSOLCOM, 0), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGETITO, 0)), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGEMACR, 0)), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDESABB, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDETCAP, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("SI"))));
        }
      }
      // 
      // Cod Livello V
      // 
      // 
      else if (IMDB.Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGTIPMAC, 0).equals((new IDVariant("Codice V Livello")), true))
      {
        if (IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
        {
          MainFrm.Cf4armDBObject.WORKSITCLASMACRO5E(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDATELA, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGSOLCOM, 0), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGETITO, 0)), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGEMACR, 0)), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDESABB, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDETCAP, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("SI"))));
        }
        else
        {
          MainFrm.Cf4armDBObject.WORKSITCLASMACRO5S(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDATELA, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGSOLCOM, 0), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGETITO, 0)), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGEMACR, 0)), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDESABB, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDETCAP, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("SI"))));
        }
      }
      else if (IMDB.Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGTIPMAC, 0).equals((new IDVariant("Cofog")), true))
      {
        MainFrm.Cf4armDBObject.WORKSITCLASCOFOG(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDATELA, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGSOLCOM, 0), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGETITO, 0)), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMEOGGEMACR, 0)), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDESABB, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDETCAP, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("SI"))));
      }
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_PROGR_SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DETT_CAPITOLI")), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDETCAP, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DESC_ABB")), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDESABB, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_SOLO_COMP")), IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGSOLCOM, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_ELAB")), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT6, IMDBDef13.PQSL_PERSIT6_NOMOGGDATELA, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_MACAGG")), IMDB.Value(IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGTIPMAC, 0));
        MainFrm.LanciaStampaJasper(v_STAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioniPerClassificazioniMacroaggregato", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Per Sit
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SITPERCLAMAC_PERSIT6() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PERSIT6_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PERSIT7, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PERSIT7, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PERSIT6_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PERSIT6_RS, 0, IMDBDef4.TBL_PERSIT7, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT6_RS, 0, 0, IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMEOGGETITO, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT6_RS, 1, 0, IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMEOGGEMACR, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT6_RS, 2, 0, IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGDETCAP, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT6_RS, 3, 0, IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGSOLCOM, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT6_RS, 4, 0, IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGDESABB, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT6_RS, 5, 0, IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMOGGDATELA, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT6_RS, 6, 0, IMDBDef4.TBL_PERSIT7, IMDBDef4.FLD_PERSIT7_NOMEOGGETTES, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PERSIT7, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PERSIT7, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PERSIT7, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PERSIT6_RS, 0);
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
  private void PAN_PERSIT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PERSIT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PERSIT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PERSIT, Cancel);
    // Stub
  }

  private void PAN_PERSIT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PERSIT_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PERSIT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PERSIT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PERSIT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PERSIT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PERSIT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PERSIT_Init()
  {

    PAN_PERSIT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PERSIT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PERSIT.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, "C833BF4A-5391-44EF-8D5C-ADD4A84B3F68");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, "Parte");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.VIS_OPTIONBUTTON);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_TITOLI, "2BCBFEC4-5244-4225-BEE9-1930CCC9CA24");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_TITOLI, "Titoli");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_TITOLI, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_TITOLI, MyGlb.VIS_NORMALFIELDS);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_TITOLI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_MACROAGGREGA, "68F4527C-3EB2-41FE-9616-7C498BA4B9F0");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_MACROAGGREGA, "Macroaggregato");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_MACROAGGREGA, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_MACROAGGREGA, MyGlb.VIS_NORMALFIELDS);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_MACROAGGREGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, "4A06C2FE-7FF9-4942-A2A4-00943C7E0737");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, "8D8EE7A1-DC00-4559-BE19-737D6853AD92");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, "Descrizione Abbreviata");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.VIS_CHECKSTYLE);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, "6D7B8434-15AE-4759-9DE4-11B5BAD3649B");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, "Solo Competenza");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.VIS_CHECKSTYLE);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, "2F6ACE09-144D-450D-9B02-646D974D6A36");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, "Data Elaborazione");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.VIS_NORMFIELPADR);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, "9910E571-2794-4DAA-AAFB-B3DAEDB067E4");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, "Elabora");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PERSIT.SetImage(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PERSIT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_LIST, 24);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_LIST, "Parte");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_FORM, 80, 12, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_FORM, 44);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_FORM, "Parte");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_ES, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_ES, PPQRY_PERSIT6, "A.NOMEOGGETTES", "NOMEOGGETTES", 5, 1, 0, -13997);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_TITOLI, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_TITOLI, MyGlb.PANEL_LIST, 56);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_TITOLI, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_TITOLI, MyGlb.PANEL_LIST, "Titoli");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_TITOLI, MyGlb.PANEL_FORM, 28, 36, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_TITOLI, MyGlb.PANEL_FORM, 96);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_TITOLI, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_TITOLI, MyGlb.PANEL_FORM, "Titoli");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_TITOLI, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_TITOLI, PPQRY_PERSIT6, "A.NOMEOGGETITO", "NOMEOGGETITO", 1, 1, 0, -13997);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_MACROAGGREGA, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_MACROAGGREGA, MyGlb.PANEL_LIST, 72);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_MACROAGGREGA, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_MACROAGGREGA, MyGlb.PANEL_LIST, "Macroagg.");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_MACROAGGREGA, MyGlb.PANEL_FORM, 16, 60, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_MACROAGGREGA, MyGlb.PANEL_FORM, 108);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_MACROAGGREGA, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_MACROAGGREGA, MyGlb.PANEL_FORM, "Macroaggregato");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_MACROAGGREGA, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_MACROAGGREGA, PPQRY_PERSIT6, "A.NOMEOGGEMACR", "NOMEOGGEMACR", 1, 10, 0, -13997);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_LIST, 108);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capit.");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_FORM, 12, 84, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_FORM, 112);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_DETTAGCAPITO, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_DETTAGCAPITO, PPQRY_PERSIT6, "A.NOMOGGDETCAP", "NOMOGGDETCAP", 5, 2, 0, -13997);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_DETTAGCAPITO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_DETTAGCAPITO, (new IDVariant()), "Null", "", "", -1);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_LIST, 140);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_LIST, "Desc. Abbr.");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_FORM, 156, 84, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_FORM, 152);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_FORM, "Descrizione Abbreviata");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_DESCRIABBREV, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_DESCRIABBREV, PPQRY_PERSIT6, "A.NOMOGGDESABB", "NOMOGGDESABB", 5, 2, 0, -13997);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_DESCRIABBREV, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_DESCRIABBREV, (new IDVariant()), "Null", "", "", -1);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_LIST, 108);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_LIST, "Sl. Cmp.");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_FORM, 348, 84, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_FORM, 112);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_FORM, "Solo Competenza");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_SOLOCOMPETEN, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_SOLOCOMPETEN, PPQRY_PERSIT6, "A.NOMOGGSOLCOM", "NOMOGGSOLCOM", 5, 2, 0, -13997);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_SOLOCOMPETEN, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_SOLOCOMPETEN, (new IDVariant()), "Null", "", "", -1);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_LIST, 112);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_FORM, 8, 108, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_FORM, 116);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_DATAELABORAZ, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_DATAELABORAZ, PPQRY_PERSIT6, "A.NOMOGGDATELA", "NOMOGGDATELA", 6, 14, 0, -13997);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_LIST, 376, 128, 88, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_FORM, 404, 144, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_ETICHEELABOR, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PERSIT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PERSIT.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.CODICE as VIMIPRVISTRC, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VISMISPROMI1 ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGETITO~~) ");
    SQL.append("and   (A.E_S = ~~NOMEOGGETTES~~) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = CASE WHEN ~~TBL_PERSIT7.NOMOGGTIPMAC~~ <> 'Cofog' THEN 'MACRO' ELSE 'COFOG' END) ");
    SQL.append("and   (A.LIVELLO = 1) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PERSIT.SetQuery(PPQRY_VISTMISSPRO1, 0, SQL, PFL_PERSIT_TITOLI, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.CODICE as VIMIPRVISTRC, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VISMISPROMI1 ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.E_S = ~~NOMEOGGETTES~~) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = CASE WHEN ~~TBL_PERSIT7.NOMOGGTIPMAC~~ <> 'Cofog' THEN 'MACRO' ELSE 'COFOG' END) ");
    SQL.append("and   (A.LIVELLO = 1) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PERSIT.SetQuery(PPQRY_VISTMISSPRO1, 1, SQL, PFL_PERSIT_TITOLI, "");
    PAN_PERSIT.SetQueryDB(PPQRY_VISTMISSPRO1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.COD_LIV_2 as VIMIPCEPCCL2, ");
    SQL.append("  TO_CHAR ( A.COD_LIV_2 ) || ' - ' || A.DES_LIV_2 as VISMISPROPR1 ");
    SQL.append("from ");
    SQL.append("  CF4WEB_ESPL_PIANO_CONTI A ");
    SQL.append("where (A.COD_LIV_2 = ~~NOMEOGGEMACR~~) ");
    SQL.append("and   (A.E_S = ~~NOMEOGGETTES~~) ");
    SQL.append("and   (SUBSTR(TO_CHAR ( A.COD_LIV_2 ), 1, 1) = NVL(TO_CHAR ( ~~NOMEOGGETITO~~ ), SUBSTR(TO_CHAR ( A.COD_LIV_2 ), 1, 1))) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (~~TBL_PERSIT7.NOMOGGTIPMAC~~ = 'Macroaggregato') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.COD_LIV_4, ");
    SQL.append("  TO_CHAR ( B.COD_LIV_4 ) || ' - ' || B.DES_LIV_4 ");
    SQL.append("from ");
    SQL.append("  CF4WEB_ESPL_PIANO_CONTI B ");
    SQL.append("where (B.COD_LIV_4 = ~~NOMEOGGEMACR~~) ");
    SQL.append("and   (B.E_S = ~~NOMEOGGETTES~~) ");
    SQL.append("and   (SUBSTR(TO_CHAR ( B.COD_LIV_4 ), 1, 1) = NVL(TO_CHAR ( ~~NOMEOGGETITO~~ ), SUBSTR(TO_CHAR ( B.COD_LIV_4 ), 1, 1))) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN B.ESERCIZIO_INIZIO AND B.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (~~TBL_PERSIT7.NOMOGGTIPMAC~~ = 'Codice IV Livello') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  C.CODICE, ");
    SQL.append("  TO_CHAR ( C.CODICE ) || ' - ' || C.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL C ");
    SQL.append("where (C.CODICE = ~~NOMEOGGEMACR~~) ");
    SQL.append("and   (C.E_S = ~~NOMEOGGETTES~~) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN C.ESERCIZIO_INIZIO AND C.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (C.LIVELLO = 2) ");
    SQL.append("and   (SUBSTR(TO_CHAR ( C.CODICE ), 1, 1) = NVL(TO_CHAR ( ~~NOMEOGGETITO~~ ), SUBSTR(TO_CHAR ( C.CODICE ), 1, 1))) ");
    SQL.append("and   (C.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (~~TBL_PERSIT7.NOMOGGTIPMAC~~ = 'Codice V Livello') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  D.CODICE, ");
    SQL.append("  TO_CHAR ( D.CODICE ) || ' - ' || D.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL D ");
    SQL.append("where (D.CODICE = ~~NOMEOGGEMACR~~) ");
    SQL.append("and   (D.E_S = ~~NOMEOGGETTES~~) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN D.ESERCIZIO_INIZIO AND D.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (D.LIVELLO = 2) ");
    SQL.append("and   (D.CODICE_TIPO_RICL = 'COFOG') ");
    SQL.append("and   (SUBSTR(LPAD(TO_CHAR ( D.CODICE ), 3, SUBSTR('0', 1, 1)), 1, 2) = NVL(LPAD(TO_CHAR ( ~~NOMEOGGETITO~~ ), 2, SUBSTR('0', 1, 1)), SUBSTR(LPAD(TO_CHAR ( D.CODICE ), 3, SUBSTR('0', 1, 1)), 1, 2))) ");
    SQL.append("and   (~~TBL_PERSIT7.NOMOGGTIPMAC~~ = 'Cofog') ");
    SQL.append("order by 1 ");
    PAN_PERSIT.SetQuery(PPQRY_VISTMISSPROG, 0, SQL, PFL_PERSIT_MACROAGGREGA, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.COD_LIV_2 as VIMIPCEPCCL2, ");
    SQL.append("  TO_CHAR ( A.COD_LIV_2 ) || ' - ' || A.DES_LIV_2 as VISMISPROPR1 ");
    SQL.append("from ");
    SQL.append("  CF4WEB_ESPL_PIANO_CONTI A ");
    SQL.append("where (A.E_S = ~~NOMEOGGETTES~~) ");
    SQL.append("and   (SUBSTR(TO_CHAR ( A.COD_LIV_2 ), 1, 1) = NVL(TO_CHAR ( ~~NOMEOGGETITO~~ ), SUBSTR(TO_CHAR ( A.COD_LIV_2 ), 1, 1))) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (~~TBL_PERSIT7.NOMOGGTIPMAC~~ = 'Macroaggregato') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.COD_LIV_4, ");
    SQL.append("  TO_CHAR ( B.COD_LIV_4 ) || ' - ' || B.DES_LIV_4 ");
    SQL.append("from ");
    SQL.append("  CF4WEB_ESPL_PIANO_CONTI B ");
    SQL.append("where (B.E_S = ~~NOMEOGGETTES~~) ");
    SQL.append("and   (SUBSTR(TO_CHAR ( B.COD_LIV_4 ), 1, 1) = NVL(TO_CHAR ( ~~NOMEOGGETITO~~ ), SUBSTR(TO_CHAR ( B.COD_LIV_4 ), 1, 1))) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN B.ESERCIZIO_INIZIO AND B.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (~~TBL_PERSIT7.NOMOGGTIPMAC~~ = 'Codice IV Livello') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  C.CODICE, ");
    SQL.append("  TO_CHAR ( C.CODICE ) || ' - ' || C.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL C ");
    SQL.append("where (C.E_S = ~~NOMEOGGETTES~~) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN C.ESERCIZIO_INIZIO AND C.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (C.LIVELLO = 2) ");
    SQL.append("and   (SUBSTR(TO_CHAR ( C.CODICE ), 1, 1) = NVL(TO_CHAR ( ~~NOMEOGGETITO~~ ), SUBSTR(TO_CHAR ( C.CODICE ), 1, 1))) ");
    SQL.append("and   (C.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (~~TBL_PERSIT7.NOMOGGTIPMAC~~ = 'Codice V Livello') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  D.CODICE, ");
    SQL.append("  TO_CHAR ( D.CODICE ) || ' - ' || D.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL D ");
    SQL.append("where (D.E_S = ~~NOMEOGGETTES~~) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN D.ESERCIZIO_INIZIO AND D.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (D.LIVELLO = 2) ");
    SQL.append("and   (D.CODICE_TIPO_RICL = 'COFOG') ");
    SQL.append("and   (SUBSTR(LPAD(TO_CHAR ( D.CODICE ), 3, SUBSTR('0', 1, 1)), 1, 2) = NVL(LPAD(TO_CHAR ( ~~NOMEOGGETITO~~ ), 2, SUBSTR('0', 1, 1)), SUBSTR(LPAD(TO_CHAR ( D.CODICE ), 3, SUBSTR('0', 1, 1)), 1, 2))) ");
    SQL.append("and   (~~TBL_PERSIT7.NOMOGGTIPMAC~~ = 'Cofog') ");
    SQL.append("order by 1 ");
    PAN_PERSIT.SetQuery(PPQRY_VISTMISSPROG, 1, SQL, PFL_PERSIT_MACROAGGREGA, "");
    PAN_PERSIT.SetQueryDB(PPQRY_VISTMISSPROG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PERSIT.SetIMDB(IMDB, "PQRY_PERSIT6", true);
    PAN_PERSIT.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PERSIT.SetQueryIMDB(PPQRY_PERSIT6, IMDBDef13.PQRY_PERSIT6_RS, IMDBDef4.TBL_PERSIT7);
    JustLoaded = true;
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_ES, IMDBDef4.FLD_PERSIT7_NOMEOGGETTES);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_TITOLI, IMDBDef4.FLD_PERSIT7_NOMEOGGETITO);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_MACROAGGREGA, IMDBDef4.FLD_PERSIT7_NOMEOGGEMACR);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_DETTAGCAPITO, IMDBDef4.FLD_PERSIT7_NOMOGGDETCAP);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_DESCRIABBREV, IMDBDef4.FLD_PERSIT7_NOMOGGDESABB);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_SOLOCOMPETEN, IMDBDef4.FLD_PERSIT7_NOMOGGSOLCOM);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_DATAELABORAZ, IMDBDef4.FLD_PERSIT7_NOMOGGDATELA);
    PAN_PERSIT.SetMasterTable(0, "PERSIT7");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PERSIT.Status() == 2)
    {
      int oldListQBE = PAN_PERSIT.iUseListQBE;
      PAN_PERSIT.iUseListQBE = 0;
      PAN_PERSIT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PERSIT.PanelCommand(Glb.PCM_FIND);
      PAN_PERSIT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
