// **********************************************
// Previsioni Per Vincolo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PrevisioniPerVincolo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PREVIPERVINC_PARTE = 0;

  private static int PFL_PREVIPERVINC_DAVINCOLO = 0;
  private static int PFL_PREVIPERVINC_VINCOLDESCRI = 1;
  private static int PFL_PREVIPERVINC_AVINCOLO = 2;
  private static int PFL_PREVIPERVINC_VINCOLDESCR1 = 3;
  private static int PFL_PREVIPERVINC_DABILANSIMUL = 4;
  private static int PFL_PREVIPERVINC_RIEPIDEIVINC = 5;
  private static int PFL_PREVIPERVINC_DETTAGCAPITO = 6;
  private static int PFL_PREVIPERVINC_VARIAZIONI = 7;
  private static int PFL_PREVIPERVINC_DESCRIINTERV = 8;
  private static int PFL_PREVIPERVINC_PREVANNINCOR = 9;
  private static int PFL_PREVIPERVINC_TOTALPERTITO = 10;
  private static int PFL_PREVIPERVINC_ELABORA = 11;
  private static int PFL_PREVIPERVINC_PARTE = 12;
  private static int PFL_PREVIPERVINC_NEWPANELABE1 = 13;

  private static int PPQRY_PAR21 = 0;

  private static int PPQRY_DAVINCODESCR = 1;
  private static int PPQRY_AVINCOLDESCR = 2;


  IDPanel PAN_PREVIPERVINC;

  // Definition of Global Variables
  private IDVariant DAOPPUREA = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR24(IMDB);
    //
    //
    Init_PQRY_PAR21(IMDB);
    Init_PQRY_PAR21_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR24(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR24, 10);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR24, "TBL_PAR24");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMEDAVIN, "ROWNAMEDAVIN");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMEDAVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMEAVINC, "ROWNAMEAVINC");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMEAVINC,1,6,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMEVARIA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_RONAPRANINCO,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMRIDEFL, "ROWNAMRIDEFL");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMRIDEFL,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR24,IMDBDef3.FLD_PAR24_ROWNAMTOPETI,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR24, 0);
  }

  private static void Init_PQRY_PAR21(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR21, 10);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR21, "PQRY_PAR21");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMEDAVIN, "ROWNAMEDAVIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMEDAVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMEAVINC, "ROWNAMEAVINC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMEAVINC,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMEVARIA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_RONAPRANINCO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMRIDEFL, "ROWNAMRIDEFL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMRIDEFL,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21,IMDBDef12.PQSL_PAR21_ROWNAMTOPETI,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR21, 0);
  }

  private static void Init_PQRY_PAR21_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR21_RS, 10);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR21_RS, "PQRY_PAR21_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMEDAVIN, "ROWNAMEDAVIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMEDAVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMEAVINC, "ROWNAMEAVINC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMEAVINC,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMEVARIA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_RONAPRANINCO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMRIDEFL, "ROWNAMRIDEFL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMRIDEFL,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR21_RS,IMDBDef12.PQSL_PAR21_ROWNAMTOPETI,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PrevisioniPerVincolo(MyWebEntryPoint w, IMDBObj imdb)
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
  public PrevisioniPerVincolo()
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
    FormIdx = MyGlb.FRM_PREVIPERVINC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F6A02E5F-55AF-43B7-AB3A-B32F09FF1C61";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 420;
    DesignHeight = 314;
    set_Caption(new IDVariant("Previsioni Per Vincolo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 420;
    Frames[1].Height = 288;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Previsioni Per Vincolo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 288;
    PAN_PREVIPERVINC = new IDPanel(w, this, 1, "PAN_PREVIPERVINC");
    Frames[1].Content = PAN_PREVIPERVINC;
    PAN_PREVIPERVINC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREVIPERVINC.VS = MainFrm.VisualStyleList;
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 420-MyGlb.PAN_OFFS_X, 288-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4A0CD943-345B-4509-AB90-0FB947481EC2");
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1000, 244, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREVIPERVINC.InitStatus = 2;
    PAN_PREVIPERVINC_Init();
    PAN_PREVIPERVINC_InitFields();
    PAN_PREVIPERVINC_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PAR24, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PREVIPERVINC_PAR21();
      }
      PAN_PREVIPERVINC.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAVINCOL && flRis && IdxPanelActived == PAN_PREVIPERVINC.FrIndex)
    {
      if (IdxFieldActived ==PFL_PREVIPERVINC_DAVINCOLO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAVINCOL && flRis && IdxPanelActived == PAN_PREVIPERVINC.FrIndex)
    {
      if (IdxFieldActived ==PFL_PREVIPERVINC_AVINCOLO) {
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
    return (obj instanceof PrevisioniPerVincolo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PrevisioniPerVincolo.class.getName() : (Glb.ClassWithPackage(PrevisioniPerVincolo.class) ? PrevisioniPerVincolo.class.getName().substring(PrevisioniPerVincolo.class.getPackage().getName().length() + 1) : PrevisioniPerVincolo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DW = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DW1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DW2 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DW1 = (new IDVariant("d_bil_prev_vincoli", IDVariant.STRING));
      v_DW2 = (new IDVariant("d_bil_prev_vincoli_riep", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMRIDEFL, 0).equals((new IDVariant("NO")), true))
      {
        v_DW = new IDVariant(v_DW1);
      }
      else
      {
        v_DW = new IDVariant(v_DW2);
      }
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMDABISI, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMEVARIA, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_RONAPRANINCO, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMDETCAP, 0));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMEDAVIN, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMEAVINC, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMDESINT, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMEPARTE, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMRIDEFL, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMTOPETI, 0));
      MainFrm.SetParametroStampa((new IDVariant("E")));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerVincolo", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Vincoli
  // **********************************************************************
  public int ApriVincoli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Vincoli Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAVINCOL, (new IDVariant(-1)).intValue(), this); 
      DAOPPUREA = (new IDVariant(1));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerVincolo", "ApriVincoli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Vincoli 1
  // **********************************************************************
  public int ApriVincoli1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Vincoli 1 Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAVINCOL, (new IDVariant(-1)).intValue(), this); 
      DAOPPUREA = (new IDVariant(0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerVincolo", "ApriVincoli1", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMEPARTE, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMDABISI, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMDETCAP, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMEVARIA, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_RONAPRANINCO, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMDESINT, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMRIDEFL, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMTOPETI, 0, (new IDVariant("SI")));
      AutoSaveType = (new IDVariant("NONE")).stringValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerVincolo", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
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
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAVINCOL)), true) && Result.booleanValue() && DAOPPUREA.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMEDAVIN, 0, IMDB.Value(IMDBDef7.PQRY_VINCOLI2, IMDBDef7.PQSL_VINCOLI2_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAVINCOL)), true) && Result.booleanValue() && DAOPPUREA.equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMEAVINC, 0, IMDB.Value(IMDBDef7.PQRY_VINCOLI2, IMDBDef7.PQSL_VINCOLI2_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerVincolo", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
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
      // Unload Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMEDAVIN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMEAVINC, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerVincolo", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per Vincolo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREVIPERVINC_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PREVIPERVINC);
      // 
      // Previsioni Per Vincolo On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMEPARTE, 0).compareTo((new IDVariant("E")), true)!=0 && IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMDETCAP, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PREVIPERVINC.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVIPERVINC.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMDETCAP, 0).equals((new IDVariant("NO")), true))
      {
        PAN_PREVIPERVINC.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVIPERVINC.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerVincolo", "PrevisioniPerVincoloOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per Vincolo On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PREVIPERVINC_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Previsioni Per Vincolo On Updating Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMDETCAP, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PAR21, IMDBDef12.PQSL_PAR21_ROWNAMRIDEFL, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerVincolo", "PrevisioniPerVincoloOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void PREVIPERVINC_PAR21() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR21_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PAR24, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PAR24, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR21_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR21_RS, 0, IMDBDef3.TBL_PAR24, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR21_RS, 0, 0, IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR21_RS, 1, 0, IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMEDAVIN, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR21_RS, 2, 0, IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMEAVINC, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR21_RS, 3, 0, IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMDABISI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR21_RS, 4, 0, IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMDETCAP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR21_RS, 5, 0, IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR21_RS, 6, 0, IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_RONAPRANINCO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR21_RS, 7, 0, IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMDESINT, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR21_RS, 8, 0, IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMRIDEFL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR21_RS, 9, 0, IMDBDef3.TBL_PAR24, IMDBDef3.FLD_PAR24_ROWNAMTOPETI, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PAR24, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PAR24, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PAR24, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR21_RS, 0);
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
  private void PAN_PREVIPERVINC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PREVIPERVINC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREVIPERVINC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREVIPERVINC, Cancel);
    // Stub
  }

  private void PAN_PREVIPERVINC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PREVIPERVINC_DAVINCOLO)
    {
      this.IdxPanelActived = this.PAN_PREVIPERVINC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVincoli();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PREVIPERVINC_AVINCOLO)
    {
      this.IdxPanelActived = this.PAN_PREVIPERVINC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVincoli1();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PREVIPERVINC_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PREVIPERVINC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PREVIPERVINC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PREVIPERVINC_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PREVIPERVINC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREVIPERVINC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PREVIPERVINC_Init()
  {

    PAN_PREVIPERVINC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREVIPERVINC.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PREVIPERVINC_PARTE, "704A8196-4B77-4455-9BB3-DB3652F66E47");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_GROUP, GRP_PREVIPERVINC_PARTE, "Parte");
    PAN_PREVIPERVINC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PREVIPERVINC_PARTE, "");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PREVIPERVINC_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_GROUP, GRP_PREVIPERVINC_PARTE, MyGlb.PANEL_LIST, 0, -9999, 72, 16, 0, 0);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_GROUP, GRP_PREVIPERVINC_PARTE, MyGlb.PANEL_FORM, 12, 7, 360, 49, 0, 0);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVIPERVINC_PARTE, 0, 31);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVIPERVINC_PARTE, 1, 13);
    PAN_PREVIPERVINC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVIPERVINC_PARTE, 0, 4);
    PAN_PREVIPERVINC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVIPERVINC_PARTE, 1, 4);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_GROUP, GRP_PREVIPERVINC_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PREVIPERVINC.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DAVINCOLO, "EA521420-8F8B-420F-856A-420C9EBE4F73");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DAVINCOLO, "Da Vincolo");
    PAN_PREVIPERVINC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DAVINCOLO, "");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DAVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DAVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCRI, "E89A290A-639D-44E3-8A01-2A50A87B32AB");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCRI, "VINCOLI DESCRIZIONE");
    PAN_PREVIPERVINC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCRI, "");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_AVINCOLO, "C18883C2-B61C-4999-A33C-77150DF7727A");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_AVINCOLO, "A Vincolo");
    PAN_PREVIPERVINC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_AVINCOLO, "");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_AVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_AVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCR1, "43271713-1842-4C90-8DF6-281AFECB8E7E");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCR1, "VINCOLI DESCRIZIONE 1");
    PAN_PREVIPERVINC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCR1, "");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCR1, MyGlb.VIS_VISULOOUPCF4);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCR1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DABILANSIMUL, "FBA27717-2622-44C1-918B-B7255F3F8769");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DABILANSIMUL, "Da Bilancio Simulato");
    PAN_PREVIPERVINC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DABILANSIMUL, "");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DABILANSIMUL, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DABILANSIMUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, "CD4D6C66-AD30-433C-932D-FDE15F968BBF");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, "Riepilogo dei Vincoli");
    PAN_PREVIPERVINC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, "");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DETTAGCAPITO, "21651B05-2980-4A3A-A4A4-FF03A704A62E");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_PREVIPERVINC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DETTAGCAPITO, "");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VARIAZIONI, "9F40172B-5542-4122-ABE7-0C06894AE51E");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VARIAZIONI, "Variazioni");
    PAN_PREVIPERVINC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VARIAZIONI, "");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VARIAZIONI, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, "5DC14EEB-538C-48B5-8296-972DDA539DE8");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, "Descrizione Intervento");
    PAN_PREVIPERVINC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, "");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PREVANNINCOR, "A6344663-E641-4FAB-AD20-D7A4A7180CC2");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PREVANNINCOR, "Previsione Anno in Corso");
    PAN_PREVIPERVINC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PREVANNINCOR, "");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PREVANNINCOR, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PREVANNINCOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_TOTALPERTITO, "FDB74E5A-A59D-4661-83A1-28CE63440692");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_TOTALPERTITO, "Totali Per Titolo");
    PAN_PREVIPERVINC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_TOTALPERTITO, "");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_TOTALPERTITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_TOTALPERTITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_ELABORA, "87044292-F079-4F4E-9F73-C8775DC47997");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_ELABORA, "Elabora");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PREVIPERVINC.SetImage(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_ELABORA, 0, "button1.gif", false);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PARTE, "86903281-2A6B-4D8E-8535-940011A5EFD0");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PARTE, "Parte");
    PAN_PREVIPERVINC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PARTE, "");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERVINC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_NEWPANELABE1, "09893C33-392D-4E47-8CBE-78883C14A9A0");
    PAN_PREVIPERVINC.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_NEWPANELABE1, "");
    PAN_PREVIPERVINC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PREVIPERVINC.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PREVIPERVINC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DAVINCOLO, MyGlb.PANEL_LIST, 72, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DAVINCOLO, MyGlb.PANEL_LIST, 72);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DAVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DAVINCOLO, MyGlb.PANEL_LIST, "Da Vinc.");
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DAVINCOLO, MyGlb.PANEL_FORM, 4, 64, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DAVINCOLO, MyGlb.PANEL_FORM, 68);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DAVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DAVINCOLO, MyGlb.PANEL_FORM, "Da Vincolo");
    PAN_PREVIPERVINC.SetFieldPage(PFL_PREVIPERVINC_DAVINCOLO, -1, -1);
    PAN_PREVIPERVINC.SetFieldPanel(PFL_PREVIPERVINC_DAVINCOLO, PPQRY_PAR21, "A.ROWNAMEDAVIN", "ROWNAMEDAVIN", 1, 6, 0, -13997);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCRI, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCRI, MyGlb.PANEL_LIST, 120);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCRI, MyGlb.PANEL_LIST, "VINCOLI DESCRIZIONE");
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCRI, MyGlb.PANEL_FORM, 140, 64, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCRI, MyGlb.PANEL_FORM, 120);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCRI, MyGlb.PANEL_FORM, "VINC. DESCRIZIONE");
    PAN_PREVIPERVINC.SetFieldPage(PFL_PREVIPERVINC_VINCOLDESCRI, -1, -1);
    PAN_PREVIPERVINC.SetFieldPanel(PFL_PREVIPERVINC_VINCOLDESCRI, PPQRY_DAVINCODESCR, "A.DESCRIZIONE", "ROWNAMVINDES", 5, 50, 0, -13997);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_AVINCOLO, MyGlb.PANEL_LIST, 112, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_AVINCOLO, MyGlb.PANEL_LIST, 68);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_AVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_AVINCOLO, MyGlb.PANEL_LIST, "A Vinc.");
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_AVINCOLO, MyGlb.PANEL_FORM, 12, 88, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_AVINCOLO, MyGlb.PANEL_FORM, 60);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_AVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_AVINCOLO, MyGlb.PANEL_FORM, "A Vincolo");
    PAN_PREVIPERVINC.SetFieldPage(PFL_PREVIPERVINC_AVINCOLO, -1, -1);
    PAN_PREVIPERVINC.SetFieldPanel(PFL_PREVIPERVINC_AVINCOLO, PPQRY_PAR21, "A.ROWNAMEAVINC", "ROWNAMEAVINC", 1, 6, 0, -13997);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCR1, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCR1, MyGlb.PANEL_LIST, 120);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCR1, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCR1, MyGlb.PANEL_LIST, "VINCOLI DESCRIZIONE 1");
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCR1, MyGlb.PANEL_FORM, 140, 88, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCR1, MyGlb.PANEL_FORM, 120);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCR1, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VINCOLDESCR1, MyGlb.PANEL_FORM, "VINC. DESCR. 1");
    PAN_PREVIPERVINC.SetFieldPage(PFL_PREVIPERVINC_VINCOLDESCR1, -1, -1);
    PAN_PREVIPERVINC.SetFieldPanel(PFL_PREVIPERVINC_VINCOLDESCR1, PPQRY_AVINCOLDESCR, "A.DESCRIZIONE", "ROWNAMVINDES", 5, 50, 0, -13997);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DABILANSIMUL, MyGlb.PANEL_LIST, 152, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DABILANSIMUL, MyGlb.PANEL_LIST, 104);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DABILANSIMUL, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DABILANSIMUL, MyGlb.PANEL_LIST, "Da Bil. Simul.");
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DABILANSIMUL, MyGlb.PANEL_FORM, 24, 116, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DABILANSIMUL, MyGlb.PANEL_FORM, 124);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DABILANSIMUL, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DABILANSIMUL, MyGlb.PANEL_FORM, "Da Bilancio Simulato");
    PAN_PREVIPERVINC.SetFieldPage(PFL_PREVIPERVINC_DABILANSIMUL, -1, -1);
    PAN_PREVIPERVINC.SetFieldPanel(PFL_PREVIPERVINC_DABILANSIMUL, PPQRY_PAR21, "A.ROWNAMDABISI", "ROWNAMDABISI", 5, 1, 0, -13997);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_DABILANSIMUL, (new IDVariant("S")), "S", "", "", -1);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_DABILANSIMUL, (new IDVariant("E")), "E", "", "", -1);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, MyGlb.PANEL_LIST, 400, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, MyGlb.PANEL_LIST, 128);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, MyGlb.PANEL_LIST, "Rp. d. Vnc.");
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, MyGlb.PANEL_FORM, 204, 116, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, MyGlb.PANEL_FORM, 144);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_RIEPIDEIVINC, MyGlb.PANEL_FORM, "Riepilogo dei Vincoli");
    PAN_PREVIPERVINC.SetFieldPage(PFL_PREVIPERVINC_RIEPIDEIVINC, -1, -1);
    PAN_PREVIPERVINC.SetFieldPanel(PFL_PREVIPERVINC_RIEPIDEIVINC, PPQRY_PAR21, "A.ROWNAMRIDEFL", "ROWNAMRIDEFL", 5, 2, 0, -13997);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_RIEPIDEIVINC, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_RIEPIDEIVINC, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DETTAGCAPITO, MyGlb.PANEL_LIST, 192, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DETTAGCAPITO, MyGlb.PANEL_LIST, 92);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capit.");
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DETTAGCAPITO, MyGlb.PANEL_FORM, 36, 140, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DETTAGCAPITO, MyGlb.PANEL_FORM, 112);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_PREVIPERVINC.SetFieldPage(PFL_PREVIPERVINC_DETTAGCAPITO, -1, -1);
    PAN_PREVIPERVINC.SetFieldPanel(PFL_PREVIPERVINC_DETTAGCAPITO, PPQRY_PAR21, "A.ROWNAMDETCAP", "ROWNAMDETCAP", 5, 2, 0, -13997);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_DETTAGCAPITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VARIAZIONI, MyGlb.PANEL_LIST, 232, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VARIAZIONI, MyGlb.PANEL_FORM, 276, 140, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VARIAZIONI, MyGlb.PANEL_FORM, 72);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PREVIPERVINC.SetFieldPage(PFL_PREVIPERVINC_VARIAZIONI, -1, -1);
    PAN_PREVIPERVINC.SetFieldPanel(PFL_PREVIPERVINC_VARIAZIONI, PPQRY_PAR21, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 2, 0, -13997);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_VARIAZIONI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_VARIAZIONI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, MyGlb.PANEL_LIST, 360, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, MyGlb.PANEL_LIST, "Desc. Int.");
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, MyGlb.PANEL_FORM, 8, 164, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, MyGlb.PANEL_FORM, 140);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizione Intervento");
    PAN_PREVIPERVINC.SetFieldPage(PFL_PREVIPERVINC_DESCRIINTERV, -1, -1);
    PAN_PREVIPERVINC.SetFieldPanel(PFL_PREVIPERVINC_DESCRIINTERV, PPQRY_PAR21, "A.ROWNAMDESINT", "ROWNAMDESINT", 5, 2, 0, -13997);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_DESCRIINTERV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_DESCRIINTERV, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PREVANNINCOR, MyGlb.PANEL_LIST, 320, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PREVANNINCOR, MyGlb.PANEL_LIST, 132);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PREVANNINCOR, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PREVANNINCOR, MyGlb.PANEL_LIST, "Prv. A. i. C.");
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PREVANNINCOR, MyGlb.PANEL_FORM, 200, 164, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PREVANNINCOR, MyGlb.PANEL_FORM, 148);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PREVANNINCOR, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PREVANNINCOR, MyGlb.PANEL_FORM, "Previsione Anno in Corso");
    PAN_PREVIPERVINC.SetFieldPage(PFL_PREVIPERVINC_PREVANNINCOR, -1, -1);
    PAN_PREVIPERVINC.SetFieldPanel(PFL_PREVIPERVINC_PREVANNINCOR, PPQRY_PAR21, "A.RONAPRANINCO", "RONAPRANINCO", 5, 2, 0, -13997);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_PREVANNINCOR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_PREVANNINCOR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_TOTALPERTITO, MyGlb.PANEL_LIST, 440, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_TOTALPERTITO, MyGlb.PANEL_LIST, 84);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_TOTALPERTITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_TOTALPERTITO, MyGlb.PANEL_LIST, "Tot. P. Tit.");
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_TOTALPERTITO, MyGlb.PANEL_FORM, 44, 188, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_TOTALPERTITO, MyGlb.PANEL_FORM, 104);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_TOTALPERTITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_TOTALPERTITO, MyGlb.PANEL_FORM, "Totali Per Titolo");
    PAN_PREVIPERVINC.SetFieldPage(PFL_PREVIPERVINC_TOTALPERTITO, -1, -1);
    PAN_PREVIPERVINC.SetFieldPanel(PFL_PREVIPERVINC_TOTALPERTITO, PPQRY_PAR21, "A.ROWNAMTOPETI", "ROWNAMTOPETI", 5, 2, 0, -13997);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_TOTALPERTITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_TOTALPERTITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_ELABORA, MyGlb.PANEL_LIST, 276, 212, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_ELABORA, MyGlb.PANEL_FORM, 292, 228, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERVINC.SetFieldPage(PFL_PREVIPERVINC_ELABORA, -1, -1);
    PAN_PREVIPERVINC.SetFieldPanel(PFL_PREVIPERVINC_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PARTE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PARTE, MyGlb.PANEL_FORM, 104, 32, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PARTE, MyGlb.PANEL_FORM, 144);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERVINC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PREVIPERVINC.SetFieldPage(PFL_PREVIPERVINC_PARTE, -1, GRP_PREVIPERVINC_PARTE);
    PAN_PREVIPERVINC.SetFieldPanel(PFL_PREVIPERVINC_PARTE, PPQRY_PAR21, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 1, 0, -13997);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PREVIPERVINC.SetValueListItem(PFL_PREVIPERVINC_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_NEWPANELABE1, MyGlb.PANEL_LIST, 196, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERVINC.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_NEWPANELABE1, MyGlb.PANEL_FORM, 16, 36, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERVINC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PREVIPERVINC.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERVINC_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERVINC.SetFieldPage(PFL_PREVIPERVINC_NEWPANELABE1, -1, GRP_PREVIPERVINC_PARTE);
    PAN_PREVIPERVINC.SetFieldPanel(PFL_PREVIPERVINC_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
  }

  private void PAN_PREVIPERVINC_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREVIPERVINC.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMVINDES ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEDAVIN~~) ");
    PAN_PREVIPERVINC.SetQuery(PPQRY_DAVINCODESCR, 0, SQL, -1, "");
    PAN_PREVIPERVINC.SetQueryDB(PPQRY_DAVINCODESCR, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVIPERVINC.SetMasterTable(PPQRY_DAVINCODESCR, "VINCOLI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMVINDES ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEAVINC~~) ");
    PAN_PREVIPERVINC.SetQuery(PPQRY_AVINCOLDESCR, 0, SQL, -1, "");
    PAN_PREVIPERVINC.SetQueryDB(PPQRY_AVINCOLDESCR, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVIPERVINC.SetMasterTable(PPQRY_AVINCOLDESCR, "VINCOLI");
    PAN_PREVIPERVINC.SetIMDB(IMDB, "PQRY_PAR21", true);
    PAN_PREVIPERVINC.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PREVIPERVINC.SetQueryIMDB(PPQRY_PAR21, IMDBDef12.PQRY_PAR21_RS, IMDBDef3.TBL_PAR24);
    JustLoaded = true;
    PAN_PREVIPERVINC.SetFieldPrimaryIndex(PFL_PREVIPERVINC_DAVINCOLO, IMDBDef3.FLD_PAR24_ROWNAMEDAVIN);
    PAN_PREVIPERVINC.SetFieldPrimaryIndex(PFL_PREVIPERVINC_AVINCOLO, IMDBDef3.FLD_PAR24_ROWNAMEAVINC);
    PAN_PREVIPERVINC.SetFieldPrimaryIndex(PFL_PREVIPERVINC_DABILANSIMUL, IMDBDef3.FLD_PAR24_ROWNAMDABISI);
    PAN_PREVIPERVINC.SetFieldPrimaryIndex(PFL_PREVIPERVINC_RIEPIDEIVINC, IMDBDef3.FLD_PAR24_ROWNAMRIDEFL);
    PAN_PREVIPERVINC.SetFieldPrimaryIndex(PFL_PREVIPERVINC_DETTAGCAPITO, IMDBDef3.FLD_PAR24_ROWNAMDETCAP);
    PAN_PREVIPERVINC.SetFieldPrimaryIndex(PFL_PREVIPERVINC_VARIAZIONI, IMDBDef3.FLD_PAR24_ROWNAMEVARIA);
    PAN_PREVIPERVINC.SetFieldPrimaryIndex(PFL_PREVIPERVINC_DESCRIINTERV, IMDBDef3.FLD_PAR24_ROWNAMDESINT);
    PAN_PREVIPERVINC.SetFieldPrimaryIndex(PFL_PREVIPERVINC_PREVANNINCOR, IMDBDef3.FLD_PAR24_RONAPRANINCO);
    PAN_PREVIPERVINC.SetFieldPrimaryIndex(PFL_PREVIPERVINC_TOTALPERTITO, IMDBDef3.FLD_PAR24_ROWNAMTOPETI);
    PAN_PREVIPERVINC.SetFieldPrimaryIndex(PFL_PREVIPERVINC_PARTE, IMDBDef3.FLD_PAR24_ROWNAMEPARTE);
    PAN_PREVIPERVINC.SetMasterTable(0, "PAR24");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREVIPERVINC.Status() == 2)
    {
      int oldListQBE = PAN_PREVIPERVINC.iUseListQBE;
      PAN_PREVIPERVINC.iUseListQBE = 0;
      PAN_PREVIPERVINC.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREVIPERVINC.PanelCommand(Glb.PCM_FIND);
      PAN_PREVIPERVINC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PREVIPERVINC) PAN_PREVIPERVINC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVIPERVINC) PAN_PREVIPERVINC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREVIPERVINC) PAN_PREVIPERVINC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVIPERVINC) PAN_PREVIPERVINC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PREVIPERVINC) PAN_PREVIPERVINC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
