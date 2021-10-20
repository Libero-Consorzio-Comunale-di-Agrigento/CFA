// **********************************************
// Bilancio Pluriennale
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class BilancioPluriennale extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_BILANCPLURIE_STAMPA = 0;
  private static int GRP_BILANCPLURIE_PARTE = 1;

  private static int PFL_BILANCPLURIE_PRIESEDABISI = 0;
  private static int PFL_BILANCPLURIE_ESEPLUDABISI = 1;
  private static int PFL_BILANCPLURIE_CRITEDISTAMP = 2;
  private static int PFL_BILANCPLURIE_STAMPA = 3;
  private static int PFL_BILANCPLURIE_NEWPANELABE2 = 4;
  private static int PFL_BILANCPLURIE_PARTE = 5;
  private static int PFL_BILANCPLURIE_NEWPANELABE1 = 6;
  private static int PFL_BILANCPLURIE_ELABORA = 7;

  private static int PPQRY_PARAMETRI187 = 0;


  IDPanel PAN_BILANCPLURIE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI199(IMDB);
    //
    //
    Init_PQRY_PARAMETRI187(IMDB);
    Init_PQRY_PARAMETRI187_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI199(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI199, 5);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI199, "TBL_PARAMETRI199");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI199,IMDBDef3.FLD_PARAMETRI199_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI199,IMDBDef3.FLD_PARAMETRI199_ROWNAMESTAMP,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI199,IMDBDef3.FLD_PARAMETRI199_RONAPRESDABS, "RONAPRESDABS");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI199,IMDBDef3.FLD_PARAMETRI199_RONAPRESDABS,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI199,IMDBDef3.FLD_PARAMETRI199_RONAESPLDABS, "RONAESPLDABS");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI199,IMDBDef3.FLD_PARAMETRI199_RONAESPLDABS,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI199,IMDBDef3.FLD_PARAMETRI199_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI199,IMDBDef3.FLD_PARAMETRI199_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI199,IMDBDef3.FLD_PARAMETRI199_ROWNAMCRDIST, "ROWNAMCRDIST");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI199,IMDBDef3.FLD_PARAMETRI199_ROWNAMCRDIST,12,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI199, 0);
  }

  private static void Init_PQRY_PARAMETRI187(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI187, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI187, "PQRY_PARAMETRI187");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI187,IMDBDef11.PQSL_PARAMETRI187_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI187,IMDBDef11.PQSL_PARAMETRI187_ROWNAMESTAMP,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI187,IMDBDef11.PQSL_PARAMETRI187_RONAPRESDABS, "RONAPRESDABS");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI187,IMDBDef11.PQSL_PARAMETRI187_RONAPRESDABS,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI187,IMDBDef11.PQSL_PARAMETRI187_RONAESPLDABS, "RONAESPLDABS");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI187,IMDBDef11.PQSL_PARAMETRI187_RONAESPLDABS,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI187,IMDBDef11.PQSL_PARAMETRI187_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI187,IMDBDef11.PQSL_PARAMETRI187_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI187,IMDBDef11.PQSL_PARAMETRI187_ROWNAMCRDIST, "ROWNAMCRDIST");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI187,IMDBDef11.PQSL_PARAMETRI187_ROWNAMCRDIST,12,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI187, 0);
  }

  private static void Init_PQRY_PARAMETRI187_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI187_RS, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI187_RS, "PQRY_PARAMETRI187_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI187_RS,IMDBDef11.PQSL_PARAMETRI187_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI187_RS,IMDBDef11.PQSL_PARAMETRI187_ROWNAMESTAMP,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI187_RS,IMDBDef11.PQSL_PARAMETRI187_RONAPRESDABS, "RONAPRESDABS");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI187_RS,IMDBDef11.PQSL_PARAMETRI187_RONAPRESDABS,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI187_RS,IMDBDef11.PQSL_PARAMETRI187_RONAESPLDABS, "RONAESPLDABS");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI187_RS,IMDBDef11.PQSL_PARAMETRI187_RONAESPLDABS,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI187_RS,IMDBDef11.PQSL_PARAMETRI187_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI187_RS,IMDBDef11.PQSL_PARAMETRI187_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI187_RS,IMDBDef11.PQSL_PARAMETRI187_ROWNAMCRDIST, "ROWNAMCRDIST");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI187_RS,IMDBDef11.PQSL_PARAMETRI187_ROWNAMCRDIST,12,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public BilancioPluriennale(MyWebEntryPoint w, IMDBObj imdb)
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
  public BilancioPluriennale()
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
    FormIdx = MyGlb.FRM_BILANCPLURIE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FBC525CF-8962-4A80-B9D9-F4E1E460DA15";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 336;
    DesignHeight = 326;
    set_Caption(new IDVariant("Bilancio Pluriennale"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 336;
    Frames[1].Height = 300;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Bilancio Pluriennale";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 300;
    PAN_BILANCPLURIE = new IDPanel(w, this, 1, "PAN_BILANCPLURIE");
    Frames[1].Content = PAN_BILANCPLURIE;
    PAN_BILANCPLURIE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BILANCPLURIE.VS = MainFrm.VisualStyleList;
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 336-MyGlb.PAN_OFFS_X, 300-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BILANCPLURIE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A4A35C44-1631-4120-B2A5-75F67102EB81");
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 408, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BILANCPLURIE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BILANCPLURIE.InitStatus = 2;
    PAN_BILANCPLURIE_Init();
    PAN_BILANCPLURIE_InitFields();
    PAN_BILANCPLURIE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI199, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        BILANCPLURIE_PARAMETRI187();
      }
      PAN_BILANCPLURIE.UpdatePanel(MainFrm);
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
    return (obj instanceof BilancioPluriennale);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? BilancioPluriennale.class.getName() : (Glb.ClassWithPackage(BilancioPluriennale.class) ? BilancioPluriennale.class.getName().substring(BilancioPluriennale.class.getPackage().getName().length() + 1) : BilancioPluriennale.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_ROWNAMESTAMP, 0).equals((new IDVariant(0)), true))
      {
        IDVariant v_DATAWINDOWCO = new IDVariant(0,IDVariant.STRING);
        v_DATAWINDOWCO = (new IDVariant("d_bil_pluri_intestazione", IDVariant.STRING));
        MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_ROWNAMEPARTE, 0)));
        MainFrm.SetParametroStampa((new IDVariant("NO")));
        MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DATAWINDOWCO);
      }
      else
      {
        if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_ROWNAMEPARTE, 0).equals((new IDVariant("E")), true))
        {
          IDVariant v_DW = new IDVariant(0,IDVariant.STRING);
          v_DW = (new IDVariant("d_bil_pluri_dettaglio_entrata2", IDVariant.STRING));
          MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampa((new IDVariant("E")));
          MainFrm.SetParametroStampa(((IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_RONAPRESDABS, 0).equals((new IDVariant(1)), true))?(new IDVariant("S")):(new IDVariant("E"))));
          MainFrm.SetParametroStampa(((IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_RONAESPLDABS, 0).equals((new IDVariant(1)), true))?(new IDVariant("S")):(new IDVariant("E"))));
          MainFrm.SetParametroStampa((new IDVariant("NO")));
          MainFrm.SetParametroStampa(IDL.ToString((new IDVariant(0))));
          MainFrm.SetParametroStampa((new IDVariant("E")));
          MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
        }
        else
        {
          IDVariant v_DATAWINDOW = new IDVariant(0,IDVariant.STRING);
          IDVariant v_DW1 = new IDVariant(0,IDVariant.STRING);
          v_DW1 = (new IDVariant("d_bil_pluri_s_programmi2", IDVariant.STRING));
          IDVariant v_DW2 = new IDVariant(0,IDVariant.STRING);
          v_DW2 = (new IDVariant("d_bil_pluri_s_funser2", IDVariant.STRING));
          IDVariant v_DW3 = new IDVariant(0,IDVariant.STRING);
          v_DW3 = (new IDVariant("d_bil_pluri_s_interventi2", IDVariant.STRING));
          IDVariant v_DW4 = new IDVariant(0,IDVariant.STRING);
          v_DW4 = (new IDVariant("d_bil_pluri_s_programmi_riep2", IDVariant.STRING));
          IDVariant v_DW5 = new IDVariant(0,IDVariant.STRING);
          v_DW5 = (new IDVariant("d_bil_pluri_s_programmi_riep2_rpp", IDVariant.STRING));
          IDVariant v_DW6 = new IDVariant(0,IDVariant.STRING);
          v_DW6 = (new IDVariant("d_bil_pluri_s_programmi2_rpp", IDVariant.STRING));
          if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_ROWNAMCRDIST, 0).equals((new IDVariant("P")), true) || IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_ROWNAMCRDIST, 0).equals((new IDVariant("F")), true))
          {
            if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_ROWNAMCRDIST, 0).equals((new IDVariant("P")), true))
            {
              if (MainFrm.FunctionRppAttiva().equals((new IDVariant(1)), true))
              {
                v_DATAWINDOW = new IDVariant(v_DW6);
              }
              else
              {
                v_DATAWINDOW = new IDVariant(v_DW1);
              }
            }
            if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_ROWNAMCRDIST, 0).equals((new IDVariant("F")), true))
            {
              v_DATAWINDOW = new IDVariant(v_DW2);
            }
            MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
            MainFrm.SetParametroStampa(((IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_RONAPRESDABS, 0).equals((new IDVariant(1)), true))?(new IDVariant("S")):(new IDVariant("E"))));
            MainFrm.SetParametroStampa(((IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_RONAESPLDABS, 0).equals((new IDVariant(1)), true))?(new IDVariant("S")):(new IDVariant("E"))));
            MainFrm.SetParametroStampa(IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_ROWNAMCRDIST, 0));
            MainFrm.SetParametroStampa((new IDVariant("NO")));
            MainFrm.SetParametroStampa(IDL.ToString((new IDVariant(0))));
            MainFrm.SetParametroStampa((new IDVariant("E")));
            MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DATAWINDOW);
          }
          if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_ROWNAMCRDIST, 0).equals((new IDVariant("I")), true))
          {
            v_DATAWINDOW = new IDVariant(v_DW3);
            MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_ROWNAMCRDIST, 0)));
            MainFrm.SetParametroStampa((new IDVariant("S")));
            MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
            MainFrm.SetParametroStampa(((IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_RONAPRESDABS, 0).equals((new IDVariant(1)), true))?(new IDVariant("S")):(new IDVariant("E"))));
            MainFrm.SetParametroStampa(((IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_RONAESPLDABS, 0).equals((new IDVariant(1)), true))?(new IDVariant("S")):(new IDVariant("E"))));
            MainFrm.SetParametroStampa((new IDVariant("NO")));
            MainFrm.SetParametroStampa((new IDVariant("0")));
            MainFrm.SetParametroStampa((new IDVariant("E")));
            MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DATAWINDOW);
          }
          if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_ROWNAMCRDIST, 0).equals((new IDVariant("R")), true))
          {
            if (MainFrm.FunctionRppAttiva().equals((new IDVariant(1)), true))
            {
              v_DATAWINDOW = new IDVariant(v_DW5);
            }
            else
            {
              v_DATAWINDOW = new IDVariant(v_DW4);
            }
            MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
            MainFrm.SetParametroStampa(((IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_RONAPRESDABS, 0).equals((new IDVariant(1)), true))?(new IDVariant("S")):(new IDVariant("E"))));
            MainFrm.SetParametroStampa((new IDVariant("S")));
            MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_ROWNAMCRDIST, 0)));
            MainFrm.SetParametroStampa(((IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_RONAPRESDABS, 0).equals((new IDVariant(1)), true))?(new IDVariant("S")):(new IDVariant("E"))));
            MainFrm.SetParametroStampa((new IDVariant("NO")));
            MainFrm.SetParametroStampa(IDL.ToString((new IDVariant(0))));
            MainFrm.SetParametroStampa((new IDVariant("E")));
            MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DATAWINDOW);
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPluriennale", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla
  // **********************************************************************
  public int Annulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPluriennale", "Annulla", _e);
      return -1;
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI199, IMDBDef3.FLD_PARAMETRI199_ROWNAMESTAMP, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI199, IMDBDef3.FLD_PARAMETRI199_RONAPRESDABS, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI199, IMDBDef3.FLD_PARAMETRI199_RONAESPLDABS, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI199, IMDBDef3.FLD_PARAMETRI199_ROWNAMEPARTE, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI199, IMDBDef3.FLD_PARAMETRI199_ROWNAMCRDIST, 0, (new IDVariant("P")));
      PAN_BILANCPLURIE.SetFlags (Glb.OBJ_GROUP, GRP_BILANCPLURIE_STAMPA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPluriennale", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Bilancio Pluriennale On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BILANCPLURIE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_BILANCPLURIE);
      // 
      // Bilancio Pluriennale On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI187, IMDBDef11.PQSL_PARAMETRI187_ROWNAMEPARTE, 0).equals((new IDVariant("E")), true))
      {
        PAN_BILANCPLURIE.SetFlags (Glb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_BILANCPLURIE.SetFlags (Glb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioPluriennale", "BilancioPluriennaleOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void BILANCPLURIE_PARAMETRI187() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAMETRI187_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI199, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI199, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI187_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAMETRI187_RS, 0, IMDBDef3.TBL_PARAMETRI199, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI187_RS, 0, 0, IMDBDef3.TBL_PARAMETRI199, IMDBDef3.FLD_PARAMETRI199_ROWNAMESTAMP, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI187_RS, 1, 0, IMDBDef3.TBL_PARAMETRI199, IMDBDef3.FLD_PARAMETRI199_RONAPRESDABS, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI187_RS, 2, 0, IMDBDef3.TBL_PARAMETRI199, IMDBDef3.FLD_PARAMETRI199_RONAESPLDABS, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI187_RS, 3, 0, IMDBDef3.TBL_PARAMETRI199, IMDBDef3.FLD_PARAMETRI199_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI187_RS, 4, 0, IMDBDef3.TBL_PARAMETRI199, IMDBDef3.FLD_PARAMETRI199_ROWNAMCRDIST, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI199, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI199, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI199, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAMETRI187_RS, 0);
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
  private void PAN_BILANCPLURIE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BILANCPLURIE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BILANCPLURIE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BILANCPLURIE, Cancel);
    // Stub
  }

  private void PAN_BILANCPLURIE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_BILANCPLURIE_ELABORA)
    {
      this.IdxPanelActived = this.PAN_BILANCPLURIE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_BILANCPLURIE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_BILANCPLURIE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BILANCPLURIE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BILANCPLURIE_Init()
  {

    PAN_BILANCPLURIE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BILANCPLURIE.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_BILANCPLURIE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_STAMPA, "D9CC5C86-4699-4398-92F6-FFD1021F73B6");
    PAN_BILANCPLURIE.set_Header(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_STAMPA, "Stampa");
    PAN_BILANCPLURIE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_STAMPA, "");
    PAN_BILANCPLURIE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_STAMPA, MyGlb.VIS_GROUPSTYLE);
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_STAMPA, MyGlb.PANEL_LIST, 0, -9999, 96, 16, 0, 0);
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_STAMPA, MyGlb.PANEL_FORM, 8, 7, 268, 53, 0, 0);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_STAMPA, 0, 44);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_STAMPA, 1, 13);
    PAN_BILANCPLURIE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_STAMPA, 0, 4);
    PAN_BILANCPLURIE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_STAMPA, 1, 4);
    PAN_BILANCPLURIE.SetFlags(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_STAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILANCPLURIE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_PARTE, "22B5E4A6-F918-4E1D-AA1E-9ACE9E5D6FB8");
    PAN_BILANCPLURIE.set_Header(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_PARTE, "Parte");
    PAN_BILANCPLURIE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_PARTE, "");
    PAN_BILANCPLURIE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_PARTE, MyGlb.PANEL_LIST, 192, -9999, 64, 16, 0, 0);
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_PARTE, MyGlb.PANEL_FORM, 12, 123, 264, 53, 0, 0);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_PARTE, 0, 31);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_PARTE, 1, 13);
    PAN_BILANCPLURIE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_PARTE, 0, 4);
    PAN_BILANCPLURIE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_PARTE, 1, 4);
    PAN_BILANCPLURIE.SetFlags(MyGlb.OBJ_GROUP, GRP_BILANCPLURIE_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILANCPLURIE.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_BILANCPLURIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PRIESEDABISI, "4FEC4080-7BC1-420A-B3B5-7254DB3F83AF");
    PAN_BILANCPLURIE.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PRIESEDABISI, "Primo Esercizio Da Bilancio Simulato");
    PAN_BILANCPLURIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PRIESEDABISI, "");
    PAN_BILANCPLURIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PRIESEDABISI, MyGlb.VIS_CHECKSTYLE);
    PAN_BILANCPLURIE.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PRIESEDABISI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCPLURIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ESEPLUDABISI, "350AE797-D06D-41D3-8650-A39DEBFB546C");
    PAN_BILANCPLURIE.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ESEPLUDABISI, "Esercizi Pluriennali Da Bilancio Simulato");
    PAN_BILANCPLURIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ESEPLUDABISI, "");
    PAN_BILANCPLURIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ESEPLUDABISI, MyGlb.VIS_CHECKSTYLE);
    PAN_BILANCPLURIE.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ESEPLUDABISI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCPLURIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, "648F589C-02C6-4901-A1FB-44DF9D10D810");
    PAN_BILANCPLURIE.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, "Criterio Di Stampa");
    PAN_BILANCPLURIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, "");
    PAN_BILANCPLURIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, MyGlb.VIS_NORMALFIELDS);
    PAN_BILANCPLURIE.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCPLURIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_STAMPA, "81EA7C5C-0E10-4C62-B72B-B6150FAB0056");
    PAN_BILANCPLURIE.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_STAMPA, "Stampa");
    PAN_BILANCPLURIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_STAMPA, "");
    PAN_BILANCPLURIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_STAMPA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_BILANCPLURIE.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_STAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCPLURIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE2, "538D4782-01BD-4073-A68C-A83772F0031C");
    PAN_BILANCPLURIE.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE2, "");
    PAN_BILANCPLURIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_BILANCPLURIE.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILANCPLURIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PARTE, "5F0B47D8-950C-4FBB-A750-4D5B72E28955");
    PAN_BILANCPLURIE.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PARTE, "Parte");
    PAN_BILANCPLURIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PARTE, "");
    PAN_BILANCPLURIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_BILANCPLURIE.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BILANCPLURIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE1, "036E9836-A384-42BD-855C-ACD5799F8796");
    PAN_BILANCPLURIE.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE1, "");
    PAN_BILANCPLURIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_BILANCPLURIE.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BILANCPLURIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ELABORA, "16F39C7D-0A1D-4956-B0EB-FBC1863AD432");
    PAN_BILANCPLURIE.set_Header(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ELABORA, "Elabora");
    PAN_BILANCPLURIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_BILANCPLURIE.SetImage(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ELABORA, 0, "button1.gif", false);
    PAN_BILANCPLURIE.SetFlags(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_BILANCPLURIE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PRIESEDABISI, MyGlb.PANEL_LIST, 96, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PRIESEDABISI, MyGlb.PANEL_LIST, 176);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PRIESEDABISI, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPLURIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PRIESEDABISI, MyGlb.PANEL_LIST, "P. Es. D. Bl. Sm.");
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PRIESEDABISI, MyGlb.PANEL_FORM, 16, 72, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PRIESEDABISI, MyGlb.PANEL_FORM, 236);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PRIESEDABISI, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPLURIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PRIESEDABISI, MyGlb.PANEL_FORM, "Primo Esercizio Da Bilancio Simulato");
    PAN_BILANCPLURIE.SetFieldPage(PFL_BILANCPLURIE_PRIESEDABISI, -1, -1);
    PAN_BILANCPLURIE.SetFieldPanel(PFL_BILANCPLURIE_PRIESEDABISI, PPQRY_PARAMETRI187, "A.RONAPRESDABS", "RONAPRESDABS", 1, 1, 0, -13997);
    PAN_BILANCPLURIE.SetValueListItem(PFL_BILANCPLURIE_PRIESEDABISI, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_BILANCPLURIE.SetValueListItem(PFL_BILANCPLURIE_PRIESEDABISI, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ESEPLUDABISI, MyGlb.PANEL_LIST, 144, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ESEPLUDABISI, MyGlb.PANEL_LIST, 192);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ESEPLUDABISI, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPLURIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ESEPLUDABISI, MyGlb.PANEL_LIST, "E. Pl. D. Bl. Sm.");
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ESEPLUDABISI, MyGlb.PANEL_FORM, 16, 96, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ESEPLUDABISI, MyGlb.PANEL_FORM, 236);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ESEPLUDABISI, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPLURIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ESEPLUDABISI, MyGlb.PANEL_FORM, "Esercizi Pluriennali Da Bilancio Simulato");
    PAN_BILANCPLURIE.SetFieldPage(PFL_BILANCPLURIE_ESEPLUDABISI, -1, -1);
    PAN_BILANCPLURIE.SetFieldPanel(PFL_BILANCPLURIE_ESEPLUDABISI, PPQRY_PARAMETRI187, "A.RONAESPLDABS", "RONAESPLDABS", 1, 1, 0, -13997);
    PAN_BILANCPLURIE.SetValueListItem(PFL_BILANCPLURIE_ESEPLUDABISI, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_BILANCPLURIE.SetValueListItem(PFL_BILANCPLURIE_ESEPLUDABISI, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, MyGlb.PANEL_LIST, 256, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, MyGlb.PANEL_LIST, 96);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPLURIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, MyGlb.PANEL_LIST, "Criterio Di Stampa");
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, MyGlb.PANEL_FORM, 16, 184, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, MyGlb.PANEL_FORM, 112);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPLURIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_CRITEDISTAMP, MyGlb.PANEL_FORM, "Criterio Di Stampa");
    PAN_BILANCPLURIE.SetFieldPage(PFL_BILANCPLURIE_CRITEDISTAMP, -1, -1);
    PAN_BILANCPLURIE.SetFieldPanel(PFL_BILANCPLURIE_CRITEDISTAMP, PPQRY_PARAMETRI187, "A.ROWNAMCRDIST", "ROWNAMCRDIST", 12, 1, 0, -13997);
    PAN_BILANCPLURIE.SetValueListItem(PFL_BILANCPLURIE_CRITEDISTAMP, (new IDVariant("P")), "Per Programma", "", "", -1);
    PAN_BILANCPLURIE.SetValueListItem(PFL_BILANCPLURIE_CRITEDISTAMP, (new IDVariant("F")), "Per Funzione/Servizio", "", "", -1);
    PAN_BILANCPLURIE.SetValueListItem(PFL_BILANCPLURIE_CRITEDISTAMP, (new IDVariant("I")), "Riepilogo per Intervento", "", "", -1);
    PAN_BILANCPLURIE.SetValueListItem(PFL_BILANCPLURIE_CRITEDISTAMP, (new IDVariant("R")), "Riepilogo per Programma", "", "", -1);
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_STAMPA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_STAMPA, MyGlb.PANEL_LIST, 44);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_STAMPA, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPLURIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_STAMPA, MyGlb.PANEL_LIST, "Stampa");
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_STAMPA, MyGlb.PANEL_FORM, 56, 32, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_STAMPA, MyGlb.PANEL_FORM, 44);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_STAMPA, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPLURIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_STAMPA, MyGlb.PANEL_FORM, "Stam.");
    PAN_BILANCPLURIE.SetFieldPage(PFL_BILANCPLURIE_STAMPA, -1, GRP_BILANCPLURIE_STAMPA);
    PAN_BILANCPLURIE.SetFieldPanel(PFL_BILANCPLURIE_STAMPA, PPQRY_PARAMETRI187, "A.ROWNAMESTAMP", "ROWNAMESTAMP", 1, 1, 0, -13997);
    PAN_BILANCPLURIE.SetValueListItem(PFL_BILANCPLURIE_STAMPA, (new IDVariant(0)), "Copertina", "", "", -1);
    PAN_BILANCPLURIE.SetValueListItem(PFL_BILANCPLURIE_STAMPA, (new IDVariant(1)), "Bil. Pluriennale", "", "", -1);
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE2, MyGlb.PANEL_LIST, 204, 20, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE2, MyGlb.PANEL_FORM, 12, 44, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPLURIE.SetFieldPage(PFL_BILANCPLURIE_NEWPANELABE2, -1, GRP_BILANCPLURIE_STAMPA);
    PAN_BILANCPLURIE.SetFieldPanel(PFL_BILANCPLURIE_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PARTE, MyGlb.PANEL_LIST, 192, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPLURIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PARTE, MyGlb.PANEL_FORM, 56, 148, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PARTE, MyGlb.PANEL_FORM, 44);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPLURIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_BILANCPLURIE.SetFieldPage(PFL_BILANCPLURIE_PARTE, -1, GRP_BILANCPLURIE_PARTE);
    PAN_BILANCPLURIE.SetFieldPanel(PFL_BILANCPLURIE_PARTE, PPQRY_PARAMETRI187, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 1, 0, -13997);
    PAN_BILANCPLURIE.SetValueListItem(PFL_BILANCPLURIE_PARTE, (new IDVariant("E")), "Entrata          ", "Parte Entrata", "", -1);
    PAN_BILANCPLURIE.SetValueListItem(PFL_BILANCPLURIE_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE1, MyGlb.PANEL_LIST, 184, 136, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE1, MyGlb.PANEL_FORM, 16, 156, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPLURIE.SetFieldPage(PFL_BILANCPLURIE_NEWPANELABE1, -1, GRP_BILANCPLURIE_PARTE);
    PAN_BILANCPLURIE.SetFieldPanel(PFL_BILANCPLURIE_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ELABORA, MyGlb.PANEL_LIST, 76, 220, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_BILANCPLURIE.SetRect(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ELABORA, MyGlb.PANEL_FORM, 196, 216, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILANCPLURIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_BILANCPLURIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILANCPLURIE_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_BILANCPLURIE.SetFieldPage(PFL_BILANCPLURIE_ELABORA, -1, -1);
    PAN_BILANCPLURIE.SetFieldPanel(PFL_BILANCPLURIE_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_BILANCPLURIE_InitQueries()
  {
    StringBuffer SQL;

    PAN_BILANCPLURIE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_BILANCPLURIE.SetIMDB(IMDB, "PQRY_PARAMETRI187", true);
    PAN_BILANCPLURIE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_BILANCPLURIE.SetQueryIMDB(PPQRY_PARAMETRI187, IMDBDef11.PQRY_PARAMETRI187_RS, IMDBDef3.TBL_PARAMETRI199);
    JustLoaded = true;
    PAN_BILANCPLURIE.SetFieldPrimaryIndex(PFL_BILANCPLURIE_PRIESEDABISI, IMDBDef3.FLD_PARAMETRI199_RONAPRESDABS);
    PAN_BILANCPLURIE.SetFieldPrimaryIndex(PFL_BILANCPLURIE_ESEPLUDABISI, IMDBDef3.FLD_PARAMETRI199_RONAESPLDABS);
    PAN_BILANCPLURIE.SetFieldPrimaryIndex(PFL_BILANCPLURIE_CRITEDISTAMP, IMDBDef3.FLD_PARAMETRI199_ROWNAMCRDIST);
    PAN_BILANCPLURIE.SetFieldPrimaryIndex(PFL_BILANCPLURIE_STAMPA, IMDBDef3.FLD_PARAMETRI199_ROWNAMESTAMP);
    PAN_BILANCPLURIE.SetFieldPrimaryIndex(PFL_BILANCPLURIE_PARTE, IMDBDef3.FLD_PARAMETRI199_ROWNAMEPARTE);
    PAN_BILANCPLURIE.SetMasterTable(0, "PARAMETRI199");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BILANCPLURIE.Status() == 2)
    {
      int oldListQBE = PAN_BILANCPLURIE.iUseListQBE;
      PAN_BILANCPLURIE.iUseListQBE = 0;
      PAN_BILANCPLURIE.PanelCommand(Glb.PCM_SEARCH);
      PAN_BILANCPLURIE.PanelCommand(Glb.PCM_FIND);
      PAN_BILANCPLURIE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BILANCPLURIE) PAN_BILANCPLURIE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BILANCPLURIE) PAN_BILANCPLURIE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BILANCPLURIE) PAN_BILANCPLURIE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BILANCPLURIE) PAN_BILANCPLURIE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_BILANCPLURIE) PAN_BILANCPLURIE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
