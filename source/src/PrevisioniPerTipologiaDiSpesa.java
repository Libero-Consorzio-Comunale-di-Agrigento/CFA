// **********************************************
// Previsioni Per Tipologia Di Spesa
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PrevisioniPerTipologiaDiSpesa extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PREPERTIDISP_TIPODITOTALI = 0;
  private static int GRP_PREPERTIDISP_UNO = 1;
  private static int GRP_PREPERTIDISP_DUE = 2;

  private static int PFL_PREPERTIDISP_TITOLO = 0;
  private static int PFL_PREPERTIDISP_INTERVENTO = 1;
  private static int PFL_PREPERTIDISP_DATIPODISPES = 2;
  private static int PFL_PREPERTIDISP_ATIPOLDISPES = 3;
  private static int PFL_PREPERTIDISP_DABILANSIMUL = 4;
  private static int PFL_PREPERTIDISP_VARIAZIONI = 5;
  private static int PFL_PREPERTIDISP_PREVANNINCOR = 6;
  private static int PFL_PREPERTIDISP_PERINTERVENT = 7;
  private static int PFL_PREPERTIDISP_PERINTERVEN2 = 8;
  private static int PFL_PREPERTIDISP_PERINTERVEN3 = 9;
  private static int PFL_PREPERTIDISP_ELABORA = 10;
  private static int PFL_PREPERTIDISP_FUNZIONE = 11;
  private static int PFL_PREPERTIDISP_SERVIZIO = 12;
  private static int PFL_PREPERTIDISP_CENTRDICOSTO = 13;
  private static int PFL_PREPERTIDISP_SETTOROPERAT = 14;
  private static int PFL_PREPERTIDISP_SERVIZOPERAT = 15;

  private static int PPQRY_PARAMETRI192 = 0;

  private static int PPQRY_TITOLI = 1;
  private static int PPQRY_INTERVENTI = 2;
  private static int PPQRY_DESCAP1 = 3;
  private static int PPQRY_DESCAP = 4;
  private static int PPQRY_FUNZIONI = 5;
  private static int PPQRY_SERVIZI = 6;
  private static int PPQRY_CENCOS = 7;
  private static int PPQRY_SETTOROPERAT = 8;
  private static int PPQRY_SERVIZOPERAT = 9;


  IDPanel PAN_PREPERTIDISP;

  // Definition of Global Variables
  private IDVariant TITOLO = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant FIRSTTIME = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI203(IMDB);
    //
    //
    Init_PQRY_PARAMETRI192(IMDB);
    Init_PQRY_PARAMETRI192_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI203(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI203, 15);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI203, "TBL_PARAMETRI203");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMEINTER, "ROWNAMEINTER");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMEINTER,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_RONADATIDISP, "RONADATIDISP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_RONADATIDISP,1,6,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAATIDISP, "ROWNAATIDISP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAATIDISP,1,6,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMPERINT, "ROWNAMPERINT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMPERINT,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN2, "ROWNAMPERIN2");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN2,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN3, "ROWNAMPERIN3");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN3,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_RONAPRANINCO,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMEFUNZI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMESERVI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMCEDICO, "ROWNAMCEDICO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMCEDICO,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMSETOPE, "ROWNAMSETOPE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMSETOPE,1,6,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMSEROPE, "ROWNAMSEROPE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI203,IMDBDef3.FLD_PARAMETRI203_ROWNAMSEROPE,1,6,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI203, 0);
  }

  private static void Init_PQRY_PARAMETRI192(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI192, 15);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI192, "PQRY_PARAMETRI192");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMEINTER, "ROWNAMEINTER");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMEINTER,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_RONADATIDISP, "RONADATIDISP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_RONADATIDISP,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAATIDISP, "ROWNAATIDISP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAATIDISP,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERINT, "ROWNAMPERINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERINT,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERIN2, "ROWNAMPERIN2");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERIN2,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERIN3, "ROWNAMPERIN3");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERIN3,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_RONAPRANINCO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMEFUNZI,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMESERVI,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMCEDICO, "ROWNAMCEDICO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMCEDICO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMSETOPE, "ROWNAMSETOPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMSETOPE,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMSEROPE, "ROWNAMSEROPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192,IMDBDef12.PQSL_PARAMETRI192_ROWNAMSEROPE,1,6,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI192, 0);
  }

  private static void Init_PQRY_PARAMETRI192_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI192_RS, 15);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI192_RS, "PQRY_PARAMETRI192_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMEINTER, "ROWNAMEINTER");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMEINTER,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_RONADATIDISP, "RONADATIDISP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_RONADATIDISP,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAATIDISP, "ROWNAATIDISP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAATIDISP,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERINT, "ROWNAMPERINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERINT,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERIN2, "ROWNAMPERIN2");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERIN2,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERIN3, "ROWNAMPERIN3");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERIN3,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_RONAPRANINCO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMEFUNZI, "ROWNAMEFUNZI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMEFUNZI,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMESERVI, "ROWNAMESERVI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMESERVI,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMCEDICO, "ROWNAMCEDICO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMCEDICO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMSETOPE, "ROWNAMSETOPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMSETOPE,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMSEROPE, "ROWNAMSEROPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI192_RS,IMDBDef12.PQSL_PARAMETRI192_ROWNAMSEROPE,1,6,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PrevisioniPerTipologiaDiSpesa(MyWebEntryPoint w, IMDBObj imdb)
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
  public PrevisioniPerTipologiaDiSpesa()
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
    FormIdx = MyGlb.FRM_PREPERTIDISP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8D65CD62-A440-429D-9F00-937C4D32B67D";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 592;
    DesignHeight = 390;
    set_Caption(new IDVariant("Previsioni Per Tipologia Di Spesa"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 592;
    Frames[1].Height = 364;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Previsioni Per Tipologia Di Spesa";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 364;
    PAN_PREPERTIDISP = new IDPanel(w, this, 1, "PAN_PREPERTIDISP");
    Frames[1].Content = PAN_PREPERTIDISP;
    PAN_PREPERTIDISP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREPERTIDISP.VS = MainFrm.VisualStyleList;
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 592-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F564B9B5-F11C-4361-84AE-F7707ED986C8");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 656, 244, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREPERTIDISP.InitStatus = 2;
    PAN_PREPERTIDISP_Init();
    PAN_PREPERTIDISP_InitFields();
    PAN_PREPERTIDISP_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI203, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PREPERTIDISP_PARAMETRI192();
      }
      PAN_PREPERTIDISP.UpdatePanel(MainFrm);
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
    return (obj instanceof PrevisioniPerTipologiaDiSpesa);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PrevisioniPerTipologiaDiSpesa.class.getName() : (Glb.ClassWithPackage(PrevisioniPerTipologiaDiSpesa.class) ? PrevisioniPerTipologiaDiSpesa.class.getName().substring(PrevisioniPerTipologiaDiSpesa.class.getPackage().getName().length() + 1) : PrevisioniPerTipologiaDiSpesa.class.getName()));
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
    IDVariant v_ERR1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DW = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ERR1 = (new IDVariant("Errore. Il campo titolo non può essere nullo", IDVariant.STRING));
      v_DW = (new IDVariant("d_bil_tipologia", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMETITOL, 0)))
      {
        MainFrm.set_AlertMessage(v_ERR1); 
        return 0;
      }
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMETITOL, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMEINTER, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMDABISI, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMEVARIA, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_RONAPRANINCO, 0));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_RONADATIDISP, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAATIDISP, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IDL.ToString(((IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERINT, 0).equals((new IDVariant(1)), true))?(new IDVariant(1)):((IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERIN2, 0).equals((new IDVariant(1)), true))?(new IDVariant(2)):(new IDVariant(3))))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMEFUNZI, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMESERVI, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMCEDICO, 0),(new IDVariant("%20")))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMSETOPE, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMSEROPE, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa((new IDVariant("E")));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerTipologiaDiSpesa", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERINT, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN2, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN3, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMDABISI, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMEVARIA, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_RONAPRANINCO, 0, (new IDVariant("NO")));
      FIRSTTIME = (new IDVariant(1));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerTipologiaDiSpesa", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per Tipologia Di Spesa On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREPERTIDISP_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PREPERTIDISP);
      // 
      // Previsioni Per Tipologia Di Spesa On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERINT, 0).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN2, 0, (new IDVariant(0)));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN3, 0, (new IDVariant(0)));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN3, 0, (new IDVariant(0)));
        PAN_PREPERTIDISP.SetFlags (Glb.OBJ_GROUP, GRP_PREPERTIDISP_UNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_PREPERTIDISP.SetFlags (Glb.OBJ_GROUP, GRP_PREPERTIDISP_DUE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERIN2, 0).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERINT, 0, (new IDVariant(0)));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN3, 0, (new IDVariant(0)));
        PAN_PREPERTIDISP.SetFlags (Glb.OBJ_GROUP, GRP_PREPERTIDISP_UNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_PREPERTIDISP.SetFlags (Glb.OBJ_GROUP, GRP_PREPERTIDISP_DUE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMPERIN3, 0).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERINT, 0, (new IDVariant(0)));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN2, 0, (new IDVariant(0)));
        PAN_PREPERTIDISP.SetFlags (Glb.OBJ_GROUP, GRP_PREPERTIDISP_DUE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_PREPERTIDISP.SetFlags (Glb.OBJ_GROUP, GRP_PREPERTIDISP_UNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMEFUNZI, 0)))
      {
        PAN_PREPERTIDISP.SetFlags (Glb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMSETOPE, 0)))
      {
        PAN_PREPERTIDISP.SetFlags (Glb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZOPERAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerTipologiaDiSpesa", "PrevisioniPerTipologiaDiSpesaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per Tipologia Di Spesa After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PREPERTIDISP_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Previsioni Per Tipologia Di Spesa After Find Event Body
      // Procedure Body
      // 
      if (FIRSTTIME.equals((new IDVariant(1)), true))
      {
        FIRSTTIME = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.TITOLO as TITOLITITOLO ");
        SQL.append("from ");
        SQL.append("  TITOLI A ");
        SQL.append("order by ");
        SQL.append("  A.TITOLO ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          TITOLO = QV.Get("TITOLITITOLO", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMETITOL, 0, new IDVariant(TITOLO));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMEINTER, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_RONADATIDISP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAATIDISP, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerTipologiaDiSpesa", "PrevisioniPerTipologiaDiSpesaAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per Tipologia Di Spesa On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PREPERTIDISP_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Previsioni Per Tipologia Di Spesa On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PREPERTIDISP_TITOLO)), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI192, IMDBDef12.PQSL_PARAMETRI192_ROWNAMETITOL, 0).equals((new IDVariant()), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMETITOL, 0, new IDVariant(TITOLO));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerTipologiaDiSpesa", "PrevisioniPerTipologiaDiSpesaOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void PREPERTIDISP_PARAMETRI192() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI192_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI203, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI203, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI192_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI192_RS, 0, IMDBDef3.TBL_PARAMETRI203, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 0, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMETITOL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 1, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMEINTER, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 2, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_RONADATIDISP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 3, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAATIDISP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 4, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERINT, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 5, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN2, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 6, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN3, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 7, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMDABISI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 8, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 9, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_RONAPRANINCO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 10, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMEFUNZI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 11, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMESERVI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 12, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMCEDICO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 13, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMSETOPE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI192_RS, 14, 0, IMDBDef3.TBL_PARAMETRI203, IMDBDef3.FLD_PARAMETRI203_ROWNAMSEROPE, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI203, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI203, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI203, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI192_RS, 0);
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
  private void PAN_PREPERTIDISP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PREPERTIDISP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREPERTIDISP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREPERTIDISP, Cancel);
    // Stub
  }

  private void PAN_PREPERTIDISP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PREPERTIDISP_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PREPERTIDISP.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PREPERTIDISP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PREPERTIDISP_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PREPERTIDISP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREPERTIDISP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PREPERTIDISP_Init()
  {

    PAN_PREPERTIDISP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREPERTIDISP.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_TIPODITOTALI, "9C6F029A-D254-45C4-ADB3-4354BB7D179E");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_TIPODITOTALI, "Tipo di Totalizzazione");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_TIPODITOTALI, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_TIPODITOTALI, MyGlb.VIS_GROUPSTYLE);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_TIPODITOTALI, MyGlb.PANEL_LIST, 160, -9999, 176, 16, 0, 0);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_TIPODITOTALI, MyGlb.PANEL_FORM, 4, 107, 372, 97, 0, 0);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_TIPODITOTALI, 0, 121);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_TIPODITOTALI, 1, 13);
    PAN_PREPERTIDISP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_TIPODITOTALI, 0, 4);
    PAN_PREPERTIDISP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_TIPODITOTALI, 1, 4);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_TIPODITOTALI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_UNO, "DC9D7ECF-ED17-4BA5-8959-1F8C6FEB0C1C");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_UNO, "uno");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_UNO, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_UNO, MyGlb.VIS_GROUSTYNOBOR);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_UNO, MyGlb.PANEL_LIST, 456, -9999, 120, 0, 0, 0);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_UNO, MyGlb.PANEL_FORM, 16, 216, 556, 76, 0, 0);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_UNO, 0, 21);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_UNO, 1, 13);
    PAN_PREPERTIDISP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_UNO, 0, 1);
    PAN_PREPERTIDISP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_UNO, 1, 1);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_UNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_DUE, "262394B4-786F-45D9-AC9C-B21FE538B154");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_DUE, "due");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_DUE, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_DUE, MyGlb.VIS_GROUSTYNOBOR);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_DUE, MyGlb.PANEL_LIST, 576, -9999, 80, 0, 0, 0);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_DUE, MyGlb.PANEL_FORM, 16, 216, 556, 52, 0, 0);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_DUE, 0, 21);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_DUE, 1, 13);
    PAN_PREPERTIDISP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_DUE, 0, 1);
    PAN_PREPERTIDISP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_DUE, 1, 1);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_GROUP, GRP_PREPERTIDISP_DUE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PREPERTIDISP.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_TITOLO, "8D639E6F-4433-43A8-8970-46DF269B9C19");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_TITOLO, "Titolo");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_TITOLO, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_TITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_INTERVENTO, "486AF935-37BF-40F0-B5B7-771C4CFE06C6");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_INTERVENTO, "Intervento");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_INTERVENTO, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_INTERVENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_INTERVENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DATIPODISPES, "9B9EC7D0-D024-4380-920D-C945344153CF");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DATIPODISPES, "Da Tipologia Di Spesa");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DATIPODISPES, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DATIPODISPES, MyGlb.VIS_NORMALFIELDS);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DATIPODISPES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ATIPOLDISPES, "54782C0C-C950-44A6-8B6E-843E131AADB5");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ATIPOLDISPES, "A Tipologia Di Spesa");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ATIPOLDISPES, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ATIPOLDISPES, MyGlb.VIS_NORMALFIELDS);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ATIPOLDISPES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DABILANSIMUL, "5507D4A2-A6B8-4136-BE46-5EE4F4898B8D");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DABILANSIMUL, "Da Bilancio Simulato");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DABILANSIMUL, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DABILANSIMUL, MyGlb.VIS_CHECKSTYLE);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DABILANSIMUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_VARIAZIONI, "1D8DD89C-FDFD-4D47-9DC3-5118D29CD310");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_VARIAZIONI, "Variazioni");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_VARIAZIONI, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_VARIAZIONI, MyGlb.VIS_CHECKSTYLE);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PREVANNINCOR, "46E14771-2F21-4F44-9ED4-95B6F2D392E8");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PREVANNINCOR, "Previsione Anno In Corso");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PREVANNINCOR, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PREVANNINCOR, MyGlb.VIS_CHECKSTYLE);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PREVANNINCOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVENT, "8E9A182F-8284-4AF9-8EBE-736B86868697");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVENT, "Per Intervento1");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVENT, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVENT, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN2, "D11C2E22-315B-4FCE-837F-34A75EF4B7B3");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN2, "Per Intervento 2");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN2, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN2, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN3, "DE948D21-FF86-4A9A-B10C-4177EDFFF512");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN3, "Per Intervento 3");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN3, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN3, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ELABORA, "15AAF440-9CEB-4FFF-9E44-43FB2368A716");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ELABORA, "Elabora");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PREPERTIDISP.SetImage(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ELABORA, 0, "button1.gif", false);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_FUNZIONE, "E2C92B79-B94D-43A7-A0E6-C2774E85193C");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_FUNZIONE, "Funzione");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_FUNZIONE, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_FUNZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_FUNZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZIO, "3EAB7AB3-3EA3-4D61-8F03-8F14A405BB10");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZIO, "Servizio");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZIO, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_CENTRDICOSTO, "6E5E3219-2527-4CB7-ABAD-C8EAC724862A");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_CENTRDICOSTO, "Centro Di Costo");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_CENTRDICOSTO, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_CENTRDICOSTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_CENTRDICOSTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SETTOROPERAT, "E337DA07-CE1C-497E-9A55-D0FE316E4117");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SETTOROPERAT, "Settore Operativo");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SETTOROPERAT, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SETTOROPERAT, MyGlb.VIS_NORMALFIELDS);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SETTOROPERAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREPERTIDISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZOPERAT, "65A47E60-6E29-4496-92FE-14C25337CDC3");
    PAN_PREPERTIDISP.set_Header(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZOPERAT, "Servizio Operativo");
    PAN_PREPERTIDISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZOPERAT, "");
    PAN_PREPERTIDISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZOPERAT, MyGlb.VIS_NORMALFIELDS);
    PAN_PREPERTIDISP.SetFlags(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZOPERAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PREPERTIDISP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_TITOLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_TITOLO, MyGlb.PANEL_LIST, 36);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_TITOLO, MyGlb.PANEL_FORM, 4, 8, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_TITOLO, MyGlb.PANEL_FORM, 128);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_TITOLO, -1, -1);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_TITOLO, PPQRY_PARAMETRI192, "A.ROWNAMETITOL", "ROWNAMETITOL", 1, 2, 0, -13997);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_INTERVENTO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_INTERVENTO, MyGlb.PANEL_LIST, 60);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_INTERVENTO, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_INTERVENTO, MyGlb.PANEL_LIST, "Inter.");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_INTERVENTO, MyGlb.PANEL_FORM, 4, 32, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_INTERVENTO, MyGlb.PANEL_FORM, 128);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_INTERVENTO, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_INTERVENTO, MyGlb.PANEL_FORM, "Intervento");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_INTERVENTO, -1, -1);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_INTERVENTO, PPQRY_PARAMETRI192, "A.ROWNAMEINTER", "ROWNAMEINTER", 1, 2, 0, -13997);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DATIPODISPES, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DATIPODISPES, MyGlb.PANEL_LIST, 112);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DATIPODISPES, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DATIPODISPES, MyGlb.PANEL_LIST, "D. Tip. Di Sp.");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DATIPODISPES, MyGlb.PANEL_FORM, 4, 56, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DATIPODISPES, MyGlb.PANEL_FORM, 128);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DATIPODISPES, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DATIPODISPES, MyGlb.PANEL_FORM, "Da Tipologia Di Spesa");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_DATIPODISPES, -1, -1);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_DATIPODISPES, PPQRY_PARAMETRI192, "A.RONADATIDISP", "RONADATIDISP", 1, 6, 0, -13997);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ATIPOLDISPES, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ATIPOLDISPES, MyGlb.PANEL_LIST, 104);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ATIPOLDISPES, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ATIPOLDISPES, MyGlb.PANEL_LIST, "A Tip. Di Sp.");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ATIPOLDISPES, MyGlb.PANEL_FORM, 4, 80, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ATIPOLDISPES, MyGlb.PANEL_FORM, 128);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ATIPOLDISPES, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ATIPOLDISPES, MyGlb.PANEL_FORM, "A Tipologia Di Spesa");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_ATIPOLDISPES, -1, -1);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_ATIPOLDISPES, PPQRY_PARAMETRI192, "A.ROWNAATIDISP", "ROWNAATIDISP", 1, 6, 0, -13997);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DABILANSIMUL, MyGlb.PANEL_LIST, 336, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DABILANSIMUL, MyGlb.PANEL_LIST, 104);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DABILANSIMUL, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DABILANSIMUL, MyGlb.PANEL_LIST, "Da Bil. Simul.");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DABILANSIMUL, MyGlb.PANEL_FORM, 392, 132, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DABILANSIMUL, MyGlb.PANEL_FORM, 152);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DABILANSIMUL, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_DABILANSIMUL, MyGlb.PANEL_FORM, "Da Bilancio Simulato");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_DABILANSIMUL, -1, -1);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_DABILANSIMUL, PPQRY_PARAMETRI192, "A.ROWNAMDABISI", "ROWNAMDABISI", 5, 1, 0, -13997);
    PAN_PREPERTIDISP.SetValueListItem(PFL_PREPERTIDISP_DABILANSIMUL, (new IDVariant("S")), "S", "", "", -1);
    PAN_PREPERTIDISP.SetValueListItem(PFL_PREPERTIDISP_DABILANSIMUL, (new IDVariant("E")), "E", "", "", -1);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_VARIAZIONI, MyGlb.PANEL_LIST, 376, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_VARIAZIONI, MyGlb.PANEL_LIST, "Var.");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_VARIAZIONI, MyGlb.PANEL_FORM, 392, 156, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_VARIAZIONI, MyGlb.PANEL_FORM, 152);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_VARIAZIONI, -1, -1);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_VARIAZIONI, PPQRY_PARAMETRI192, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 1, 0, -13997);
    PAN_PREPERTIDISP.SetValueListItem(PFL_PREPERTIDISP_VARIAZIONI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREPERTIDISP.SetValueListItem(PFL_PREPERTIDISP_VARIAZIONI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PREVANNINCOR, MyGlb.PANEL_LIST, 416, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PREVANNINCOR, MyGlb.PANEL_LIST, 132);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PREVANNINCOR, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PREVANNINCOR, MyGlb.PANEL_LIST, "Pr. A. I. C.");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PREVANNINCOR, MyGlb.PANEL_FORM, 392, 180, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PREVANNINCOR, MyGlb.PANEL_FORM, 152);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PREVANNINCOR, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PREVANNINCOR, MyGlb.PANEL_FORM, "Previsione Anno In Corso");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_PREVANNINCOR, -1, -1);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_PREVANNINCOR, PPQRY_PARAMETRI192, "A.RONAPRANINCO", "RONAPRANINCO", 5, 1, 0, -13997);
    PAN_PREPERTIDISP.SetValueListItem(PFL_PREPERTIDISP_PREVANNINCOR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREPERTIDISP.SetValueListItem(PFL_PREPERTIDISP_PREVANNINCOR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVENT, MyGlb.PANEL_LIST, 160, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVENT, MyGlb.PANEL_LIST, 88);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVENT, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVENT, MyGlb.PANEL_LIST, "Per Intervento1");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVENT, MyGlb.PANEL_FORM, 8, 132, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVENT, MyGlb.PANEL_FORM, 144);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVENT, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVENT, MyGlb.PANEL_FORM, "Per Intervento1");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_PERINTERVENT, -1, GRP_PREPERTIDISP_TIPODITOTALI);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_PERINTERVENT, PPQRY_PARAMETRI192, "A.ROWNAMPERINT", "ROWNAMPERINT", 1, 1, 0, -13997);
    PAN_PREPERTIDISP.SetValueListItem(PFL_PREPERTIDISP_PERINTERVENT, (new IDVariant(1)), "Per Intervento, Tipologia spesa", "", "", -1);
    PAN_PREPERTIDISP.SetValueListItem(PFL_PREPERTIDISP_PERINTERVENT, (new IDVariant(0)), "fake", "", "", -1);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN2, MyGlb.PANEL_LIST, 160, 252, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN2, MyGlb.PANEL_LIST, 152);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN2, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN2, MyGlb.PANEL_LIST, "Per Intervento 2");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN2, MyGlb.PANEL_FORM, 8, 156, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN2, MyGlb.PANEL_FORM, 144);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN2, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN2, MyGlb.PANEL_FORM, "Per Intervento 2");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_PERINTERVEN2, -1, GRP_PREPERTIDISP_TIPODITOTALI);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_PERINTERVEN2, PPQRY_PARAMETRI192, "A.ROWNAMPERIN2", "ROWNAMPERIN2", 1, 1, 0, -13997);
    PAN_PREPERTIDISP.SetValueListItem(PFL_PREPERTIDISP_PERINTERVEN2, (new IDVariant(1)), "Per Intervento, Tipologia Spesa, Funzione, Servizio, Centro di costo", "", "", -1);
    PAN_PREPERTIDISP.SetValueListItem(PFL_PREPERTIDISP_PERINTERVEN2, (new IDVariant(0)), "fake", "", "", -1);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN3, MyGlb.PANEL_LIST, 160, 276, 372, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN3, MyGlb.PANEL_LIST, 152);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN3, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN3, MyGlb.PANEL_LIST, "Per Intervento 3");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN3, MyGlb.PANEL_FORM, 8, 180, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN3, MyGlb.PANEL_FORM, 144);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN3, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_PERINTERVEN3, MyGlb.PANEL_FORM, "Per Intervento 3");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_PERINTERVEN3, -1, GRP_PREPERTIDISP_TIPODITOTALI);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_PERINTERVEN3, PPQRY_PARAMETRI192, "A.ROWNAMPERIN3", "ROWNAMPERIN3", 1, 1, 0, -13997);
    PAN_PREPERTIDISP.SetValueListItem(PFL_PREPERTIDISP_PERINTERVEN3, (new IDVariant(1)), "Per Intervento, Tipologia Spesa, Settore Operativo, Servizio Operativo", "", "", -1);
    PAN_PREPERTIDISP.SetValueListItem(PFL_PREPERTIDISP_PERINTERVEN3, (new IDVariant(0)), "fake", "", "", -1);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ELABORA, MyGlb.PANEL_LIST, 504, 344, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ELABORA, MyGlb.PANEL_FORM, 472, 308, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_ELABORA, -1, -1);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_FUNZIONE, MyGlb.PANEL_LIST, 456, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_FUNZIONE, MyGlb.PANEL_LIST, 52);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_FUNZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_FUNZIONE, MyGlb.PANEL_LIST, "Funz.");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_FUNZIONE, MyGlb.PANEL_FORM, 20, 220, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_FUNZIONE, MyGlb.PANEL_FORM, 112);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_FUNZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_FUNZIONE, MyGlb.PANEL_FORM, "Funzione");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_FUNZIONE, -1, GRP_PREPERTIDISP_UNO);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_FUNZIONE, PPQRY_PARAMETRI192, "A.ROWNAMEFUNZI", "ROWNAMEFUNZI", 1, 2, 0, -13997);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZIO, MyGlb.PANEL_LIST, 496, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZIO, MyGlb.PANEL_LIST, 48);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZIO, MyGlb.PANEL_LIST, "Serv.");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZIO, MyGlb.PANEL_FORM, 20, 244, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZIO, MyGlb.PANEL_FORM, 112);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZIO, MyGlb.PANEL_FORM, "Servizio");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_SERVIZIO, -1, GRP_PREPERTIDISP_UNO);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_SERVIZIO, PPQRY_PARAMETRI192, "A.ROWNAMESERVI", "ROWNAMESERVI", 1, 2, 0, -13997);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_CENTRDICOSTO, MyGlb.PANEL_LIST, 536, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_CENTRDICOSTO, MyGlb.PANEL_LIST, 84);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_CENTRDICOSTO, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_CENTRDICOSTO, MyGlb.PANEL_LIST, "Cnt. D. Cs.");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_CENTRDICOSTO, MyGlb.PANEL_FORM, 20, 268, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_CENTRDICOSTO, MyGlb.PANEL_FORM, 112);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_CENTRDICOSTO, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_CENTRDICOSTO, MyGlb.PANEL_FORM, "Centro Di Costo");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_CENTRDICOSTO, -1, GRP_PREPERTIDISP_UNO);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_CENTRDICOSTO, PPQRY_PARAMETRI192, "A.ROWNAMCEDICO", "ROWNAMCEDICO", 5, 8, 0, -13997);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SETTOROPERAT, MyGlb.PANEL_LIST, 576, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SETTOROPERAT, MyGlb.PANEL_LIST, 96);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SETTOROPERAT, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SETTOROPERAT, MyGlb.PANEL_LIST, "Sett. Oper.");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SETTOROPERAT, MyGlb.PANEL_FORM, 20, 220, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SETTOROPERAT, MyGlb.PANEL_FORM, 112);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SETTOROPERAT, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SETTOROPERAT, MyGlb.PANEL_FORM, "Settore Operativo");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_SETTOROPERAT, -1, GRP_PREPERTIDISP_DUE);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_SETTOROPERAT, PPQRY_PARAMETRI192, "A.ROWNAMSETOPE", "ROWNAMSETOPE", 1, 6, 0, -13997);
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZOPERAT, MyGlb.PANEL_LIST, 616, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZOPERAT, MyGlb.PANEL_LIST, 96);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZOPERAT, MyGlb.PANEL_LIST, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZOPERAT, MyGlb.PANEL_LIST, "Serv. Oper.");
    PAN_PREPERTIDISP.SetRect(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZOPERAT, MyGlb.PANEL_FORM, 20, 244, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREPERTIDISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZOPERAT, MyGlb.PANEL_FORM, 112);
    PAN_PREPERTIDISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZOPERAT, MyGlb.PANEL_FORM, 1);
    PAN_PREPERTIDISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREPERTIDISP_SERVIZOPERAT, MyGlb.PANEL_FORM, "Servizio Operativo");
    PAN_PREPERTIDISP.SetFieldPage(PFL_PREPERTIDISP_SERVIZOPERAT, -1, GRP_PREPERTIDISP_DUE);
    PAN_PREPERTIDISP.SetFieldPanel(PFL_PREPERTIDISP_SERVIZOPERAT, PPQRY_PARAMETRI192, "A.ROWNAMSEROPE", "ROWNAMSEROPE", 1, 6, 0, -13997);
  }

  private void PAN_PREPERTIDISP_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREPERTIDISP.SetSize(MyGlb.OBJ_QUERY, 10);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLNEWEXPR ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("order by ");
    SQL.append("  A.TITOLO ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_TITOLI, 0, SQL, PFL_PREPERTIDISP_TITOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLNEWEXPR ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.E_S = 'S') ");
    SQL.append("order by ");
    SQL.append("  A.TITOLO ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_TITOLI, 1, SQL, PFL_PREPERTIDISP_TITOLO, "");
    PAN_PREPERTIDISP.SetQueryDB(PPQRY_TITOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.INTERVENTO as INTERVINTERV, ");
    SQL.append("  TO_CHAR ( A.INTERVENTO ) || ' - ' || A.DESCRIZIONE as INTERNEWEXPR ");
    SQL.append("from ");
    SQL.append("  INTERVENTI A ");
    SQL.append("where (A.INTERVENTO = ~~ROWNAMEINTER~~) ");
    SQL.append("and   (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_INTERVENTI, 0, SQL, PFL_PREPERTIDISP_INTERVENTO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.INTERVENTO as INTERVINTERV, ");
    SQL.append("  TO_CHAR ( A.INTERVENTO ) || ' - ' || A.DESCRIZIONE as INTERNEWEXPR ");
    SQL.append("from ");
    SQL.append("  INTERVENTI A ");
    SQL.append("where (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_INTERVENTI, 1, SQL, PFL_PREPERTIDISP_INTERVENTO, "");
    PAN_PREPERTIDISP.SetQueryDB(PPQRY_INTERVENTI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as DESCAPCAPITO, ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' - ' || A.DESCRIZIONE as DESCANEWEXPR ");
    SQL.append("from ");
    SQL.append("  DESCAP A ");
    SQL.append("where (A.CAPITOLO = ~~RONADATIDISP~~) ");
    SQL.append("and   (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("and   (A.COD_INTERVENTO = ~~ROWNAMEINTER~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_DESCAP1, 0, SQL, PFL_PREPERTIDISP_DATIPODISPES, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as DESCAPCAPITO, ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' - ' || A.DESCRIZIONE as DESCANEWEXPR ");
    SQL.append("from ");
    SQL.append("  DESCAP A ");
    SQL.append("where (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("and   (A.COD_INTERVENTO = ~~ROWNAMEINTER~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_DESCAP1, 1, SQL, PFL_PREPERTIDISP_DATIPODISPES, "");
    PAN_PREPERTIDISP.SetQueryDB(PPQRY_DESCAP1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as DESCAPCAPITO, ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' - ' || A.DESCRIZIONE as DESCANEWEXPR ");
    SQL.append("from ");
    SQL.append("  DESCAP A ");
    SQL.append("where (A.CAPITOLO = ~~ROWNAATIDISP~~) ");
    SQL.append("and   (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("and   (A.COD_INTERVENTO = ~~ROWNAMEINTER~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_DESCAP, 0, SQL, PFL_PREPERTIDISP_ATIPOLDISPES, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as DESCAPCAPITO, ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' - ' || A.DESCRIZIONE as DESCANEWEXPR ");
    SQL.append("from ");
    SQL.append("  DESCAP A ");
    SQL.append("where (A.TITOLO = ~~ROWNAMETITOL~~) ");
    SQL.append("and   (A.COD_INTERVENTO = ~~ROWNAMEINTER~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_DESCAP, 1, SQL, PFL_PREPERTIDISP_ATIPOLDISPES, "");
    PAN_PREPERTIDISP.SetQueryDB(PPQRY_DESCAP, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FUNZIONE as FUNZIOFUNZIO, ");
    SQL.append("  TO_CHAR ( A.FUNZIONE ) || ' - ' || A.DESCRIZIONE as FUNZINEWEXPR ");
    SQL.append("from ");
    SQL.append("  FUNZIONI A ");
    SQL.append("where (A.FUNZIONE = ~~ROWNAMEFUNZI~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1, 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_FUNZIONI, 0, SQL, PFL_PREPERTIDISP_FUNZIONE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FUNZIONE as FUNZIOFUNZIO, ");
    SQL.append("  TO_CHAR ( A.FUNZIONE ) || ' - ' || A.DESCRIZIONE as FUNZINEWEXPR ");
    SQL.append("from ");
    SQL.append("  FUNZIONI A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1, 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_FUNZIONI, 1, SQL, PFL_PREPERTIDISP_FUNZIONE, "");
    PAN_PREPERTIDISP.SetQueryDB(PPQRY_FUNZIONI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as SERVIZSERVIZ, ");
    SQL.append("  TO_CHAR ( A.SERVIZIO ) || ' - ' || A.DESCRIZIONE as SERVINEWEXPR ");
    SQL.append("from ");
    SQL.append("  SERVIZI A ");
    SQL.append("where (A.SERVIZIO = ~~ROWNAMESERVI~~) ");
    SQL.append("and   (A.FUNZIONE = ~~ROWNAMEFUNZI~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_SERVIZI, 0, SQL, PFL_PREPERTIDISP_SERVIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as SERVIZSERVIZ, ");
    SQL.append("  TO_CHAR ( A.SERVIZIO ) || ' - ' || A.DESCRIZIONE as SERVINEWEXPR ");
    SQL.append("from ");
    SQL.append("  SERVIZI A ");
    SQL.append("where (A.FUNZIONE = ~~ROWNAMEFUNZI~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_SERVIZI, 1, SQL, PFL_PREPERTIDISP_SERVIZIO, "");
    PAN_PREPERTIDISP.SetQueryDB(PPQRY_SERVIZI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CENTRO_COSTO as CENCCENTCOST, ");
    SQL.append("  TO_CHAR ( A.CENTRO_COSTO ) || ' - ' || A.DESCRIZIONE as CENCONEWEXPR ");
    SQL.append("from ");
    SQL.append("  CENCOS A ");
    SQL.append("where (A.CENTRO_COSTO = ~~ROWNAMCEDICO~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_CENCOS, 0, SQL, PFL_PREPERTIDISP_CENTRDICOSTO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CENTRO_COSTO as CENCCENTCOST, ");
    SQL.append("  TO_CHAR ( A.CENTRO_COSTO ) || ' - ' || A.DESCRIZIONE as CENCONEWEXPR ");
    SQL.append("from ");
    SQL.append("  CENCOS A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_CENCOS, 1, SQL, PFL_PREPERTIDISP_CENTRDICOSTO, "");
    PAN_PREPERTIDISP.SetQueryDB(PPQRY_CENCOS, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SETTORE as OPESETSETTOR, ");
    SQL.append("  TO_CHAR ( A.SETTORE ) || ' - ' || A.DESCRIZIONE as OPESENEWEXPR ");
    SQL.append("from ");
    SQL.append("  OPESET A ");
    SQL.append("where (A.SETTORE = ~~ROWNAMSETOPE~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_SETTOROPERAT, 0, SQL, PFL_PREPERTIDISP_SETTOROPERAT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SETTORE as OPESETSETTOR, ");
    SQL.append("  TO_CHAR ( A.SETTORE ) || ' - ' || A.DESCRIZIONE as OPESENEWEXPR ");
    SQL.append("from ");
    SQL.append("  OPESET A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_SETTOROPERAT, 1, SQL, PFL_PREPERTIDISP_SETTOROPERAT, "");
    PAN_PREPERTIDISP.SetQueryDB(PPQRY_SETTOROPERAT, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as OPESERSERVIZ, ");
    SQL.append("  TO_CHAR ( A.SERVIZIO ) || ' - ' || A.DESCRIZIONE as OPESENEWEXPR ");
    SQL.append("from ");
    SQL.append("  OPESER A ");
    SQL.append("where (A.SERVIZIO = ~~ROWNAMSEROPE~~) ");
    SQL.append("and   (A.SETTORE = ~~ROWNAMSETOPE~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_SERVIZOPERAT, 0, SQL, PFL_PREPERTIDISP_SERVIZOPERAT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as OPESERSERVIZ, ");
    SQL.append("  TO_CHAR ( A.SERVIZIO ) || ' - ' || A.DESCRIZIONE as OPESENEWEXPR ");
    SQL.append("from ");
    SQL.append("  OPESER A ");
    SQL.append("where (A.SETTORE = ~~ROWNAMSETOPE~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREPERTIDISP.SetQuery(PPQRY_SERVIZOPERAT, 1, SQL, PFL_PREPERTIDISP_SERVIZOPERAT, "");
    PAN_PREPERTIDISP.SetQueryDB(PPQRY_SERVIZOPERAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREPERTIDISP.SetIMDB(IMDB, "PQRY_PARAMETRI192", true);
    PAN_PREPERTIDISP.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PREPERTIDISP.SetQueryIMDB(PPQRY_PARAMETRI192, IMDBDef12.PQRY_PARAMETRI192_RS, IMDBDef3.TBL_PARAMETRI203);
    JustLoaded = true;
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_TITOLO, IMDBDef3.FLD_PARAMETRI203_ROWNAMETITOL);
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_INTERVENTO, IMDBDef3.FLD_PARAMETRI203_ROWNAMEINTER);
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_DATIPODISPES, IMDBDef3.FLD_PARAMETRI203_RONADATIDISP);
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_ATIPOLDISPES, IMDBDef3.FLD_PARAMETRI203_ROWNAATIDISP);
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_DABILANSIMUL, IMDBDef3.FLD_PARAMETRI203_ROWNAMDABISI);
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_VARIAZIONI, IMDBDef3.FLD_PARAMETRI203_ROWNAMEVARIA);
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_PREVANNINCOR, IMDBDef3.FLD_PARAMETRI203_RONAPRANINCO);
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_PERINTERVENT, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERINT);
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_PERINTERVEN2, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN2);
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_PERINTERVEN3, IMDBDef3.FLD_PARAMETRI203_ROWNAMPERIN3);
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_FUNZIONE, IMDBDef3.FLD_PARAMETRI203_ROWNAMEFUNZI);
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_SERVIZIO, IMDBDef3.FLD_PARAMETRI203_ROWNAMESERVI);
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_CENTRDICOSTO, IMDBDef3.FLD_PARAMETRI203_ROWNAMCEDICO);
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_SETTOROPERAT, IMDBDef3.FLD_PARAMETRI203_ROWNAMSETOPE);
    PAN_PREPERTIDISP.SetFieldPrimaryIndex(PFL_PREPERTIDISP_SERVIZOPERAT, IMDBDef3.FLD_PARAMETRI203_ROWNAMSEROPE);
    PAN_PREPERTIDISP.SetMasterTable(0, "PARAMETRI203");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREPERTIDISP.Status() == 2)
    {
      int oldListQBE = PAN_PREPERTIDISP.iUseListQBE;
      PAN_PREPERTIDISP.iUseListQBE = 0;
      PAN_PREPERTIDISP.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREPERTIDISP.PanelCommand(Glb.PCM_FIND);
      PAN_PREPERTIDISP.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PREPERTIDISP) PAN_PREPERTIDISP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREPERTIDISP) PAN_PREPERTIDISP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREPERTIDISP) PAN_PREPERTIDISP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREPERTIDISP) PAN_PREPERTIDISP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PREPERTIDISP) PAN_PREPERTIDISP_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PREPERTIDISP) PAN_PREPERTIDISP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
