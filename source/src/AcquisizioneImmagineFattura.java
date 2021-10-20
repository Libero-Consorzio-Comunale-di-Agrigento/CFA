// **********************************************
// Acquisizione Immagine Fattura
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AcquisizioneImmagineFattura extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_ACQUISIMMAGI = 0;
  private static int PFL_PARAM_BARCODE = 1;
  private static int PFL_PARAM_ETICHETTA = 2;
  private static int PFL_PARAM_ANNOPROG = 3;
  private static int PFL_PARAM_NUMEROPROG = 4;
  private static int PFL_PARAM_OK = 5;
  private static int PFL_PARAM_IDENTIFICATI = 6;

  private static int PPQRY_PARAM28 = 0;


  IDPanel PAN_PARAM;
  private static int PFL_WORKEXPORTID_DOCUMESCANSI = 0;
  private static int PFL_WORKEXPORTID_PROGRESSIVO = 1;

  private static int PPQRY_WORKEXPORTI7 = 0;


  IDPanel PAN_WORKEXPORTID;

  // Definition of Global Variables
  private IDVariant IDENTIFICATI = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM1(IMDB);
    Init_TBL_EVENTOBLOB(IMDB);
    //
    //
    Init_PQRY_PARAM28(IMDB);
    Init_PQRY_PARAM28_RS(IMDB);
    Init_PQRY_WORKEXPORTI7(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM1, 16);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM1, "TBL_PARAM1");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMTIPSCA, "ROWNAMTIPSCA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMTIPSCA,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMEBARCO, "ROWNAMEBARCO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMEBARCO,1,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMELINK, "ROWNAMELINK");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMELINK,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMEIDENT, "ROWNAMEIDENT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMEIDENT,1,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMNUMPRO,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMBLOINS, "ROWNAMBLOINS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMBLOINS,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMPERFIL, "ROWNAMPERFIL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMPERFIL,5,100,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMVARIBA, "ROWNAMVARIBA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMVARIBA,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMNUODOC, "ROWNAMNUODOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMNUODOC,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMEIDDOC, "ROWNAMEIDDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMEIDDOC,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMNUMDOC, "ROWNAMNUMDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMNUMDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMANNDOC, "ROWNAMANNDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMANNDOC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMPATAPP, "ROWNAMPATAPP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMPATAPP,5,200,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMSI4URL, "ROWNAMSI4URL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMSI4URL,5,200,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMSI4TMP, "ROWNAMSI4TMP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM1,IMDBDef2.FLD_PARAM1_ROWNAMSI4TMP,5,200,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM1, 0);
  }

  private static void Init_TBL_EVENTOBLOB(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_EVENTOBLOB, 5);
    IMDB.set_TblCode(IMDBDef2.TBL_EVENTOBLOB, "TBL_EVENTOBLOB");
    IMDB.set_FldCode(IMDBDef2.TBL_EVENTOBLOB,IMDBDef2.FLD_EVENTOBLOB_ROWNAMECOLUM, "ROWNAMECOLUM");
    IMDB.SetFldParams(IMDBDef2.TBL_EVENTOBLOB,IMDBDef2.FLD_EVENTOBLOB_ROWNAMECOLUM,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EVENTOBLOB,IMDBDef2.FLD_EVENTOBLOB_ROWNAMESIZE, "ROWNAMESIZE");
    IMDB.SetFldParams(IMDBDef2.TBL_EVENTOBLOB,IMDBDef2.FLD_EVENTOBLOB_ROWNAMESIZE,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EVENTOBLOB,IMDBDef2.FLD_EVENTOBLOB_ROWNAMEEXTEN, "ROWNAMEEXTEN");
    IMDB.SetFldParams(IMDBDef2.TBL_EVENTOBLOB,IMDBDef2.FLD_EVENTOBLOB_ROWNAMEEXTEN,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EVENTOBLOB,IMDBDef2.FLD_EVENTOBLOB_ROWNAMFILPAT, "ROWNAMFILPAT");
    IMDB.SetFldParams(IMDBDef2.TBL_EVENTOBLOB,IMDBDef2.FLD_EVENTOBLOB_ROWNAMFILPAT,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EVENTOBLOB,IMDBDef2.FLD_EVENTOBLOB_ROWNAMECANCE, "ROWNAMECANCE");
    IMDB.SetFldParams(IMDBDef2.TBL_EVENTOBLOB,IMDBDef2.FLD_EVENTOBLOB_ROWNAMECANCE,1,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_EVENTOBLOB, 0);
  }

  private static void Init_PQRY_PARAM28(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM28, 9);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM28, "PQRY_PARAM28");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMTIPSCA, "ROWNAMTIPSCA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMTIPSCA,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMEBARCO, "ROWNAMEBARCO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMEBARCO,1,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMELINK, "ROWNAMELINK");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMELINK,5,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMEIDENT, "ROWNAMEIDENT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMEIDENT,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMNUMPRO,1,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMBLOINS, "ROWNAMBLOINS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMBLOINS,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMPERFIL, "ROWNAMPERFIL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMPERFIL,5,100,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMVARIBA, "ROWNAMVARIBA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28,IMDBDef10.PQSL_PARAM28_ROWNAMVARIBA,1,49,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAM28, 0);
  }

  private static void Init_PQRY_PARAM28_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM28_RS, 9);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM28_RS, "PQRY_PARAM28_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMTIPSCA, "ROWNAMTIPSCA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMTIPSCA,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMEBARCO, "ROWNAMEBARCO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMEBARCO,1,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMELINK, "ROWNAMELINK");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMELINK,5,49,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMEIDENT, "ROWNAMEIDENT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMEIDENT,1,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMNUMPRO,1,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMBLOINS, "ROWNAMBLOINS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMBLOINS,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMPERFIL, "ROWNAMPERFIL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMPERFIL,5,100,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMVARIBA, "ROWNAMVARIBA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM28_RS,IMDBDef10.PQSL_PARAM28_ROWNAMVARIBA,1,49,0);
  }

  private static void Init_PQRY_WORKEXPORTI7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_WORKEXPORTI7, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_WORKEXPORTI7, "PQRY_WORKEXPORTI7");
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI7,IMDBDef10.PQSL_WORKEXPORTI7_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI7,IMDBDef10.PQSL_WORKEXPORTI7_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI7,IMDBDef10.PQSL_WORKEXPORTI7_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI7,IMDBDef10.PQSL_WORKEXPORTI7_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI7,IMDBDef10.PQSL_WORKEXPORTI7_FASE, "FASE");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI7,IMDBDef10.PQSL_WORKEXPORTI7_FASE,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_WORKEXPORTI7,IMDBDef10.PQSL_WORKEXPORTI7_FILE_DATI, "FILE_DATI");
    IMDB.SetFldParams(IMDBDef10.PQRY_WORKEXPORTI7,IMDBDef10.PQSL_WORKEXPORTI7_FILE_DATI,10,9999,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_WORKEXPORTI7, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AcquisizioneImmagineFattura(MyWebEntryPoint w, IMDBObj imdb)
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
  public AcquisizioneImmagineFattura()
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
    FormIdx = MyGlb.FRM_ACQUIMMAFATT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F2EC0972-5B31-4DBC-80B3-C69CC00016BF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 552;
    DesignHeight = 370;
    set_Caption(new IDVariant("Acquisizione Immagine Fattura"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 552;
    Frames[1].Height = 344;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 344;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 552-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DDFCFD01-C51B-41F3-9011-BBECC3C65DB1");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 372, 220, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    PAN_PARAM.SetSubFrame(PFL_PARAM_ETICHETTA,2);
    Frames[2].set_SubFrame(true);
    Frames[2].FrHidden = true;
    Frames[2].Caption = "WORK EXPORT ID";
    Frames[2].Parent = this;
    PAN_WORKEXPORTID = new IDPanel(w, this, 2, "PAN_WORKEXPORTID");
    Frames[2].Content = PAN_WORKEXPORTID;
    PAN_WORKEXPORTID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_WORKEXPORTID.VS = MainFrm.VisualStyleList;
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "74D00F54-FA95-4904-BE00-FF63FB34D388");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 80, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_WORKEXPORTID.InitStatus = 2;
    PAN_WORKEXPORTID_Init();
    PAN_WORKEXPORTID_InitFields();
    PAN_WORKEXPORTID_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM1, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ACQUIMMAFATT_PARAM28();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_WORKEXPORTID.UpdatePanel(MainFrm);
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
    return (obj instanceof AcquisizioneImmagineFattura);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AcquisizioneImmagineFattura.class.getName() : (Glb.ClassWithPackage(AcquisizioneImmagineFattura.class) ? AcquisizioneImmagineFattura.class.getName().substring(AcquisizioneImmagineFattura.class.getPackage().getName().length() + 1) : AcquisizioneImmagineFattura.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // WORK EXPORT ID After BLOB Update Event
  // Evento notificato dal pannello dopo aver salvato su
  // db il file caricato dall'utente o cancellato il contenuto
  // del blob.
  // Column: Numero intero che indica quale campo del pannello è coinvolto nell'operazione di aggiornamento o cancellazione. Deve essere confrontato con la funzione Me dei campi del pannello. - Input
  // Size: Dimensione del file caricato in byte oppure -1 se il contenuto del blob è stato cancellato. - Input
  // Extension: Stringa che contiene l'estensione del file in fase di caricamento. - Input
  // **********************************************************************
  private void PAN_WORKEXPORTID_AfterBlobUpdate (IDVariant Column, IDVariant Size, IDVariant Extension)
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
      // WORK EXPORT ID After BLOB Update Event Body
      // Procedure Body
      // 
      C2 = PAN_WORKEXPORTID.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_WORKEXPORTID.GotoFirst();
      while (!PAN_WORKEXPORTID.RSEOF())
      {
        if (IMDB.Value(IMDBDef10.PQRY_WORKEXPORTI7, IMDBDef10.PQSL_WORKEXPORTI7_PROGRESSIVO, 0).equals(C2.Get("PROGRESSIVO"), true))
        {
          v_PERCORSO = Glb.SaveBlob(MainFrm,C2.Get("FILE_DATI"),IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), (new IDVariant("temp"))),IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Fattura")), (new IDVariant("_"))), IDL.Replace(IDL.Replace(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMNUMDOC, 0)), (new IDVariant("/")), (new IDVariant("_"))), (new IDVariant(".")), (new IDVariant("_"))), (new IDVariant("-")), (new IDVariant("_")))), (new IDVariant("_"))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMANNDOC, 0))));
          v_PERCORSO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMPATAPP, 0), (new IDVariant("/"))), (new IDVariant("Fattura"))), (new IDVariant("_"))), IDL.Replace(IDL.Replace(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMNUMDOC, 0)), (new IDVariant("/")), (new IDVariant("_"))), (new IDVariant(".")), (new IDVariant("_"))), (new IDVariant("-")), (new IDVariant("_")))), (new IDVariant("_"))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMANNDOC, 0))), ((new IDVariant(".")))), Extension);
          IMDB.set_Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMPERFIL, 0, new IDVariant(v_PERCORSO));
        }
        PAN_WORKEXPORTID.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (Size.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMBLOINS, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMBLOINS, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineFattura", "WORKEXPORTIDAfterBLOBUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // WORK EXPORT ID Before BLOB Update Event
  // Evento notificato dal pannello prima di effettuare
  // la registrazione nel database di un blob appena caricato
  // dall'utente.
  // Cancel: Impostando il parametro a True, il file non verrà caricato o cancellato. - Input/Output
  // Column: E' un numero intero che identifica il campo del pannello nel quale si sta caricando il file. Deve essere confrontato con la proprietà Me dei campi del pannello. - Input
  // Size: E' la dimensione del file caricato espressa in byte; in caso di cancellazione vale -1.  In questo modo è possibile verificare quale operazione è in corso sul campo blob. - Input
  // Extension: Stringa che contiene l'estensione del file in fase di caricamento. Ad esempio "doc" per un file di Word. - Input
  // FilePath: Stringa che contiene il nome del file caricato sul server completo di estensione. Tale file viene memorizzato nella sottodirectory TEMP della web application. - Input
  // **********************************************************************
  private void PAN_WORKEXPORTID_BeforeBlobUpdate (IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant FilePath)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // WORK EXPORT ID Before BLOB Update Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_EVENTOBLOB, IMDBDef2.FLD_EVENTOBLOB_ROWNAMECANCE, 0, new IDVariant(Cancel));
      IMDB.set_Value(IMDBDef2.TBL_EVENTOBLOB, IMDBDef2.FLD_EVENTOBLOB_ROWNAMECOLUM, 0, new IDVariant(Column));
      IMDB.set_Value(IMDBDef2.TBL_EVENTOBLOB, IMDBDef2.FLD_EVENTOBLOB_ROWNAMESIZE, 0, new IDVariant(Size));
      IMDB.set_Value(IMDBDef2.TBL_EVENTOBLOB, IMDBDef2.FLD_EVENTOBLOB_ROWNAMEEXTEN, 0, new IDVariant(Extension));
      IMDB.set_Value(IMDBDef2.TBL_EVENTOBLOB, IMDBDef2.FLD_EVENTOBLOB_ROWNAMFILPAT, 0, new IDVariant(FilePath));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineFattura", "WORKEXPORTIDBeforeBLOBUpdateEvent", _e);
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
      IDVariant v_CHIAVE = new IDVariant(0,IDVariant.STRING);
      v_CHIAVE = (new IDVariant("PRODUCTS/SI4WSCAN"));
      IDVariant v_STRINSI4WURL = new IDVariant(0,IDVariant.STRING);
      v_STRINSI4WURL = (new IDVariant("URL"));
      IDVariant v_STRINSI4WTMP = new IDVariant(0,IDVariant.STRING);
      v_STRINSI4WTMP = (new IDVariant("TMP"));
      IDVariant v_VALORSI4WURL = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VALORSI4WTMP = new IDVariant(0,IDVariant.STRING);
      IMDB.set_Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMTIPSCA, 0, (new IDVariant("A")));
      IDENTIFICATI = PredisposizioneRecord();
      IMDB.set_Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMEIDENT, 0, new IDVariant(IDENTIFICATI));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VALORE as REGISTVALORE ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = " + IDL.CSql(v_CHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.STRINGA = " + IDL.CSql(v_STRINSI4WURL, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VALORSI4WURL = QV.Get("REGISTVALORE", IDVariant.STRING) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VALORE as REGISTVALORE ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (A.CHIAVE = " + IDL.CSql(v_CHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.STRINGA = " + IDL.CSql(v_STRINSI4WTMP, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VALORSI4WTMP = QV.Get("REGISTVALORE", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMSI4URL, 0, new IDVariant(v_VALORSI4WURL));
      IMDB.set_Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMSI4TMP, 0, new IDVariant(v_VALORSI4WTMP));
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      IMDB.set_Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMPATAPP, 0, IDL.Add(IDL.Add(IDL.Replace((new IDVariant(MainFrm.RealPath)), (new IDVariant("\\")), (new IDVariant("/"))), (new IDVariant("/"))), (new IDVariant("temp"))));
      if (IDL.IsNull(MainFrm.GESTIOBARCOD))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_BARCODE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineFattura", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_EVENTOBLOB, IMDBDef2.FLD_EVENTOBLOB_ROWNAMECOLUM, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_EVENTOBLOB, IMDBDef2.FLD_EVENTOBLOB_ROWNAMESIZE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_EVENTOBLOB, IMDBDef2.FLD_EVENTOBLOB_ROWNAMEEXTEN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_EVENTOBLOB, IMDBDef2.FLD_EVENTOBLOB_ROWNAMFILPAT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_EVENTOBLOB, IMDBDef2.FLD_EVENTOBLOB_ROWNAMECANCE, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineFattura", "UnloadEvent", _e);
    }
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCANSIONE)), true))
      {
        IDVariant I = null;
        I = (new IDVariant(1));
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Creazione file PDF"));
        MainFrm.StartPhase((new IDVariant(30)).intValue(),v_AVVISO.stringValue(),(new IDVariant(0)).booleanValue()); 
        while (I.compareTo((new IDVariant(30)), true)<=0 && VBFiles.FileLen(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMPERFIL, 0)).compareTo((new IDVariant(0)), true)<=0)
        {
          MainFrm.TrackPhase(I.intValue(),(new IDVariant(30)).intValue()); 
          IDL.Sleep((new IDVariant(1)).intValue()*1000); 
          I = IDL.Add(I, (new IDVariant(1)));
        }
        if (VBFiles.FileLen(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMPERFIL, 0)).compareTo((new IDVariant(0)), true)<=0)
        {
          IDVariant v_AVVISO1 = new IDVariant(0,IDVariant.STRING);
          v_AVVISO1 = (new IDVariant("Errore nella creazione del file PDF"));
          MainFrm.set_AlertMessage(v_AVVISO1); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineFattura", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Param On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef10.PQRY_PARAM28, IMDBDef10.PQSL_PARAM28_ROWNAMTIPSCA, 0).equals((new IDVariant("S")), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICHETTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICHETTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineFattura", "ParamOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Param On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAM_ACQUISIMMAGI)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_NOMEFILE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_APPLET = new IDVariant(0,IDVariant.STRING);
        if (IMDB.Value(IMDBDef10.PQRY_PARAM28, IMDBDef10.PQSL_PARAM28_ROWNAMTIPSCA, 0).equals((new IDVariant("S")), true))
        {
          v_NOMEFILE = IDL.Add(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMNUMPRO, 0)), (new IDVariant("_"))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMANNPRO, 0)));
          v_APPLET = CaricaApplet();
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI411, IMDBDef2.FLD_PARAMETRI411_PARAMAPPLET, 0, IDL.FormatMessage(v_APPLET, v_NOMEFILE, IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMSI4URL, 0), IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMSI4TMP, 0)));
          MainFrm.Show(MyGlb.FRM_SCANSIONE, (new IDVariant(-1)).intValue(), this); 
          IMDB.set_Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMPERFIL, 0, IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMSI4TMP, 0), (new IDVariant("/"))), v_NOMEFILE), (new IDVariant(".pdf"))));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineFattura", "ParamOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Predisposizione Record
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant PredisposizioneRecord ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DARESTITUIRE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Predisposizione Record Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.PROGRESSIVO) + 1 as MAXWOEXIDPR1 ");
      SQL.append("from ");
      SQL.append("  WORK_EXPORT_ID A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DARESTITUIRE = QV.Get("MAXWOEXIDPR1", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("insert into WORK_EXPORT_ID ");
      SQL.append("( ");
      SQL.append("  PROGRESSIVO, ");
      SQL.append("  SESSIONE ");
      SQL.append(") ");
      SQL.append("values ");
      SQL.append("( ");
      SQL.append("  " + IDL.CSql(v_DARESTITUIRE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
      SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
      SQL.append(") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return v_DARESTITUIRE;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineFattura", "PredisposizioneRecord", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Write HTML
  // Explain which processing is carried out by this procedure
  // NomeFile:  - Input
  // Directory:  - Input
  // **********************************************************************
  public int WriteHTML (IDVariant NomeFile, IDVariant Directory)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_FILE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_TAGAPPLET = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CHIUDI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ALTRO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TAGAPPLET = (new IDVariant("<APPLET NAME = \"scan\" CODE = \"it.finmatica.si4wscan.client.ScanApplet\" ARCHIVE = \"ScanApplet.jar\" WIDTH = \"423\" HEIGHT = \"45\"><PARAM NAME = \"imageName\" VALUE = \"", IDVariant.STRING));
      v_CHIUDI = (new IDVariant("\"><PARAM NAME = \"currentDir\" VALUE = \"", IDVariant.STRING));
      v_ALTRO = (new IDVariant("\"><PARAM NAME = \"maxSize\" VALUE = \"2048000\" ><PARAM NAME = \"scannerUI\" VALUE = \"Y\" > </applet>", IDVariant.STRING));
      // 
      // Write HTML Body
      // Procedure Body
      // 
      IDVariant v_APPLETJSCAN = new IDVariant(0,IDVariant.STRING);
      v_FILE = MainFrm.VBFile.FreeFile();
      MainFrm.VBFile.OpenForOutput(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), (new IDVariant("temp"))), (new IDVariant("/"))), NomeFile), (new IDVariant(".html"))), v_FILE, false); 
      // MainFrm.VBFile.WriteLine(v_FILE, IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_TAGAPPLET, NomeFile), v_CHIUDI), (new IDVariant("CF4"))), v_ALTRO)); 
      v_APPLETJSCAN = CaricaApplet();
      MainFrm.VBFile.WriteLine(v_FILE, IDL.FormatMessage(v_APPLETJSCAN, NomeFile)); 
      IMDB.set_Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMPERFIL, 0, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), (new IDVariant("scan"))), (new IDVariant("/"))), NomeFile), (new IDVariant(".tif"))));
      MainFrm.VBFile.Close(v_FILE); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineFattura", "WriteHTML", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Lancia Scansione
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int LanciaScansione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Lancia Scansione Body
      // Procedure Body
      // 
      WriteHTML(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMNUMPRO, 0)), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMANNPRO, 0))), (new IDVariant("")));
      MainFrm.set_RedirectTo(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("temp")), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMNUMPRO, 0))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMANNPRO, 0))), (new IDVariant(".html"))));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineFattura", "LanciaScansione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // OK
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int OK ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // OK Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM28, IMDBDef10.PQSL_PARAM28_ROWNAMEBARCO, 0)))
      {
        if (IMDB.Value(IMDBDef10.PQRY_PARAM28, IMDBDef10.PQSL_PARAM28_ROWNAMTIPSCA, 0).compareTo((new IDVariant("S")), true)!=0)
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMBLOINS, 0),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Selezionare un file immagine da allegare o scannerizzare il documento", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            return 0;
          }
        }
      }
      try
      {
        MainFrm.InserisciNelDocumentale(IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMNUMPRO, 0), IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMPERFIL, 0), IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMNUODOC, 0), IMDB.Value(IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMEIDDOC, 0));
      }
      catch (Exception e7)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Problemi inserimento dati nel Documentale", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineFattura", "OK", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Carica Applet
  // **********************************************************************
  public IDVariant CaricaApplet ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Carica Applet Body
      // Corpo Procedura
      // 
      IDVariant v_LINE = null;
      v_LINE = (new IDVariant(""));
      IDVariant v_STRINGONE = new IDVariant(0,IDVariant.STRING);
      try
      {
        IDVariant v_FILENUMBER = null;
        v_FILENUMBER = MainFrm.VBFile.FreeFile();
        IDVariant v_NOME = new IDVariant(0,IDVariant.STRING);
        v_NOME = (new IDVariant("ScanParametri.html"));
        MainFrm.VBFile.OpenForInput(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), v_NOME), v_FILENUMBER); 
        while (!(MainFrm.VBFile.EOF(v_FILENUMBER)))
        {
          v_LINE = MainFrm.VBFile.ReadLine(v_FILENUMBER); 
          v_STRINGONE = IDL.Add(IDL.Add(v_STRINGONE, (new IDVariant(" "))), v_LINE);
        }
        MainFrm.VBFile.Close(v_FILENUMBER); 
      }
      catch (Exception e4)
      {
        MainFrm.set_AlertMessage(new IDVariant(e4.getMessage())); 
      }
      return v_STRINGONE;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AcquisizioneImmagineFattura", "CaricaApplet", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void ACQUIMMAFATT_PARAM28() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAM28_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM1, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM1, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAM28_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAM28_RS, 0, IMDBDef2.TBL_PARAM1, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM28_RS, 0, 0, IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMTIPSCA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM28_RS, 1, 0, IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMEBARCO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM28_RS, 2, 0, IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMELINK, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM28_RS, 3, 0, IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMEIDENT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM28_RS, 4, 0, IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM28_RS, 5, 0, IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM28_RS, 6, 0, IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMBLOINS, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM28_RS, 7, 0, IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMPERFIL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM28_RS, 8, 0, IMDBDef2.TBL_PARAM1, IMDBDef2.FLD_PARAM1_ROWNAMVARIBA, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM1, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM1, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM1, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAM28_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_OK)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OK();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_WORKEXPORTID_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_WORKEXPORTID, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_WORKEXPORTID_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_WORKEXPORTID, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_WORKEXPORTID_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_WORKEXPORTID);
    // Stub
  }

  private void PAN_WORKEXPORTID_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_WORKEXPORTID_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_WORKEXPORTID_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_WORKEXPORTI7, IMDBDef10.PQSL_WORKEXPORTI7_FILE_DATI, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_WORKEXPORTI7, IMDBDef10.PQSL_WORKEXPORTI7_FILE_DATI, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_WORKEXPORTID_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ACQUISIMMAGI, "3375C4E5-E0C0-47E0-AA66-E965ACC1E89F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ACQUISIMMAGI, "Acquisizione Immagine");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ACQUISIMMAGI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ACQUISIMMAGI, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ACQUISIMMAGI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_BARCODE, "76DD2FF7-EEC8-4F80-84C9-E8A199FE3E78");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_BARCODE, "Barcode");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_BARCODE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_BARCODE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_BARCODE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTA, "11BF9E3C-ED1F-4363-BAF5-6D0AE151F54E");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTA, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROG, "0D12F9E6-45FB-4D5C-BDB7-4A382FDCBB4B");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROG, "Anno Prog");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROG, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROG, "B3D66C29-8B04-4B47-8D8C-BB580DC8FD4E");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROG, "Numero Prog");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROG, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_OK, "5D71875C-D316-4EB3-A003-780644F1E1FF");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_OK, "OK");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_OK, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_IDENTIFICATI, "05FCA3E3-334B-4685-86AA-D3DFB9384D25");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_IDENTIFICATI, "Identificativo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_IDENTIFICATI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_IDENTIFICATI, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_IDENTIFICATI, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ACQUISIMMAGI, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ACQUISIMMAGI, MyGlb.PANEL_LIST, 80);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ACQUISIMMAGI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ACQUISIMMAGI, MyGlb.PANEL_LIST, "Acquisizione Immagine");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ACQUISIMMAGI, MyGlb.PANEL_FORM, 16, 32, 320, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ACQUISIMMAGI, MyGlb.PANEL_FORM, 124);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ACQUISIMMAGI, MyGlb.PANEL_FORM, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ACQUISIMMAGI, MyGlb.PANEL_FORM, "Acquisizione Immagine");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ACQUISIMMAGI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ACQUISIMMAGI, PPQRY_PARAM28, "A.ROWNAMTIPSCA", "ROWNAMTIPSCA", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ACQUISIMMAGI, (new IDVariant("A")), "da File esistente", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ACQUISIMMAGI, (new IDVariant("S")), "da Scanner", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARCODE, MyGlb.PANEL_LIST, 168, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARCODE, MyGlb.PANEL_LIST, 48);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARCODE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_BARCODE, MyGlb.PANEL_LIST, "Barcode");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARCODE, MyGlb.PANEL_FORM, 88, 8, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARCODE, MyGlb.PANEL_FORM, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARCODE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_BARCODE, MyGlb.PANEL_FORM, "Barcode");
    PAN_PARAM.SetFieldPage(PFL_PARAM_BARCODE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_BARCODE, PPQRY_PARAM28, "A.ROWNAMEBARCO", "ROWNAMEBARCO", 1, 16, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTA, MyGlb.PANEL_LIST, 8, 80, 360, 152, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTA, MyGlb.PANEL_LIST, 11);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTA, MyGlb.PANEL_FORM, 8, 80, 504, 180, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETTA, MyGlb.PANEL_FORM, 13);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHETTA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHETTA, -1, "", "ETICHETTA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROG, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROG, MyGlb.PANEL_LIST, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROG, MyGlb.PANEL_LIST, "Anno Prog");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROG, MyGlb.PANEL_FORM, 356, 32, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROG, MyGlb.PANEL_FORM, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANNOPROG, MyGlb.PANEL_FORM, "Ann. Prog");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANNOPROG, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANNOPROG, PPQRY_PARAM28, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROG, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROG, MyGlb.PANEL_LIST, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROG, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROG, MyGlb.PANEL_LIST, "Numero Prog");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROG, MyGlb.PANEL_FORM, 344, 8, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROG, MyGlb.PANEL_FORM, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROG, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUMEROPROG, MyGlb.PANEL_FORM, "Num. Prog");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUMEROPROG, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUMEROPROG, PPQRY_PARAM28, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 172, 280, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 400, 264, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_OK, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_IDENTIFICATI, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_IDENTIFICATI, MyGlb.PANEL_LIST, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_IDENTIFICATI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_IDENTIFICATI, MyGlb.PANEL_LIST, "Identificativo");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_IDENTIFICATI, MyGlb.PANEL_FORM, 4, 292, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_IDENTIFICATI, MyGlb.PANEL_FORM, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_IDENTIFICATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_IDENTIFICATI, MyGlb.PANEL_FORM, "Identif.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_IDENTIFICATI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_IDENTIFICATI, PPQRY_PARAM28, "A.ROWNAMEIDENT", "ROWNAMEIDENT", 1, 19, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM28", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM28, IMDBDef10.PQRY_PARAM28_RS, IMDBDef2.TBL_PARAM1);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ACQUISIMMAGI, IMDBDef2.FLD_PARAM1_ROWNAMTIPSCA);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_BARCODE, IMDBDef2.FLD_PARAM1_ROWNAMEBARCO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANNOPROG, IMDBDef2.FLD_PARAM1_ROWNAMANNPRO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUMEROPROG, IMDBDef2.FLD_PARAM1_ROWNAMNUMPRO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_IDENTIFICATI, IMDBDef2.FLD_PARAM1_ROWNAMEIDENT);
    PAN_PARAM.SetMasterTable(0, "PARAM1");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_WORKEXPORTID_Init()
  {

    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, "0CC91C79-2009-44FD-9AD8-970755D0B995");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, "Documento Scansionato");
    PAN_WORKEXPORTID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, "");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.VIS_NORMFIELPADR);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_WORKEXPORTID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "C76A52EF-B92B-40A8-B6E7-F37AECECC71C");
    PAN_WORKEXPORTID.set_Header(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "PROGRESSIVO");
    PAN_WORKEXPORTID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, "");
    PAN_WORKEXPORTID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_WORKEXPORTID.SetFlags(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_WORKEXPORTID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_LIST, 4, 184, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_LIST, 112);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_LIST, 2);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_LIST, "Documento Scansionato");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_FORM, 4, 0, 464, 144, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_FORM, 124);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_FORM, 10);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_DOCUMESCANSI, MyGlb.PANEL_FORM, "Documento Scansionato");
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_DOCUMESCANSI, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_DOCUMESCANSI, PPQRY_WORKEXPORTI7, "A.FILE_DATI", "FILE_DATI", 10, 9999, 0, -13997);
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_WORKEXPORTID.SetRect(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 148, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_WORKEXPORTID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_WORKEXPORTID.SetNumRow(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_WORKEXPORTID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_WORKEXPORTID_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_WORKEXPORTID.SetFieldPage(PFL_WORKEXPORTID_PROGRESSIVO, -1, -1);
    PAN_WORKEXPORTID.SetFieldPanel(PFL_WORKEXPORTID_PROGRESSIVO, PPQRY_WORKEXPORTI7, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
  }

  private void PAN_WORKEXPORTID_InitQueries()
  {
    StringBuffer SQL;

    PAN_WORKEXPORTID.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_WORKEXPORTID.SetIMDB(IMDB, "PQRY_WORKEXPORTI7", true);
    PAN_WORKEXPORTID.set_SetString(MyGlb.MASTER_ROWNAME, "WORK EXPORT ID");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.FASE as FASE, ");
    SQL.append("  A.FILE_DATI as FILE_DATI ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WORK_EXPORT_ID A ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRESSIVO = ~~PQRY_PARAM28.ROWNAMEIDENT~~) ");
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_WORKEXPORTID.SetQuery(PPQRY_WORKEXPORTI7, 5, SQL, -1, "");
    PAN_WORKEXPORTID.SetQueryDB(PPQRY_WORKEXPORTI7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_WORKEXPORTID.SetMasterTable(0, "WORK_EXPORT_ID");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_WORKEXPORTID.Status() == 2)
    {
      int oldListQBE = PAN_WORKEXPORTID.iUseListQBE;
      PAN_WORKEXPORTID.iUseListQBE = 0;
      PAN_WORKEXPORTID.PanelCommand(Glb.PCM_SEARCH);
      PAN_WORKEXPORTID.PanelCommand(Glb.PCM_FIND);
      PAN_WORKEXPORTID.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_BeforeBlobUpdate(Cancel, Column, Size, Extension, FilePath);
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
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_AfterBlobUpdate(Column, Size, Extension);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_WORKEXPORTID) PAN_WORKEXPORTID_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
