// **********************************************
// Emiss Acc
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissAcc extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_DATAREG = 0;
  private static int PFL_PARAM_DESCRIZIONE2 = 1;
  private static int PFL_PARAM_CAUSALE = 2;
  private static int PFL_PARAM_TIPOSERVIZIO = 3;
  private static int PFL_PARAM_ARESIDUO = 4;
  private static int PFL_PARAM_DEBITORE = 5;
  private static int PFL_PARAM_CODICEDEBITO = 6;
  private static int PFL_PARAM_CONTROPAPATR = 7;
  private static int PFL_PARAM_FATTORDESCRI = 8;
  private static int PFL_PARAM_ELABORA = 9;
  private static int PFL_PARAM_PANNELINVISI = 10;
  private static int PFL_PARAM_SCEGBENFBUTT = 11;

  private static int PPQRY_PARAM15 = 0;

  private static int PPQRY_FATTORI = 1;

  private static int PPQRY_T57 = 2;
  private static int PPQRY_T75 = 3;


  IDPanel PAN_PARAM;
  private static int PFL_IMPUTDAEMETT_IMPORTO = 0;
  private static int PFL_IMPUTDAEMETT_RAGIONSOCIAL = 1;
  private static int PFL_IMPUTDAEMETT_NUMERODOC = 2;
  private static int PFL_IMPUTDAEMETT_DDATADOC = 3;
  private static int PFL_IMPUTDAEMETT_DESCRIZIONE1 = 4;
  private static int PFL_IMPUTDAEMETT_DOCUMENTO = 5;
  private static int PFL_IMPUTDAEMETT_DESCRIZIONE = 6;
  private static int PFL_IMPUTDAEMETT_CAPITOLO1 = 7;
  private static int PFL_IMPUTDAEMETT_ARTICOLO = 8;
  private static int PFL_IMPUTDAEMETT_CAPITOLO = 9;

  private static int PPQRY_CFA2 = 0;


  IDPanel PAN_IMPUTDAEMETT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM16(IMDB);
    Init_TBL_CFA(IMDB);
    //
    //
    Init_PQRY_PARAM15(IMDB);
    Init_PQRY_PARAM15_RS(IMDB);
    Init_QRY_CFA3(IMDB);
    Init_PQRY_CFA2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM16(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM16, 13);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM16, "TBL_PARAM16");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMDATAREG, "PARAMDATAREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMDATAREG,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMDESCRIZ, "PARAMDESCRIZ");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMDESCRIZ,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMCAUSALE, "PARAMCAUSALE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMCAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARATIPOSERV, "PARATIPOSERV");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARATIPOSERV,1,3,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMCONTROP, "PARAMCONTROP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMCONTROP,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMARESIDU, "PARAMARESIDU");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMARESIDU,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARATIPOREGI, "PARATIPOREGI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARATIPOREGI,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARATIPOBOLL, "PARATIPOBOLL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARATIPOBOLL,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMDAL,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMAL,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARACODIDEBI, "PARACODIDEBI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARACODIDEBI,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMDEBITOR, "PARAMDEBITOR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMDEBITOR,5,60,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMDEBIOLD, "PARAMDEBIOLD");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM16,IMDBDef2.FLD_PARAM16_PARAMDEBIOLD,5,60,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM16, 0);
  }

  private static void Init_TBL_CFA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_CFA, 1);
    IMDB.set_TblCode(IMDBDef2.TBL_CFA, "TBL_CFA");
    IMDB.set_FldCode(IMDBDef2.TBL_CFA,IMDBDef2.FLD_CFA_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef2.TBL_CFA,IMDBDef2.FLD_CFA_ROWNAMEPROGR,1,8,0);
  }

  private static void Init_PQRY_PARAM15(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAM15, 8);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAM15, "PQRY_PARAM15");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARAMDATAREG, "PARAMDATAREG");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARAMDATAREG,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARAMDESCRIZ, "PARAMDESCRIZ");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARAMDESCRIZ,5,250,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARAMCAUSALE, "PARAMCAUSALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARAMCAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARATIPOSERV, "PARATIPOSERV");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARATIPOSERV,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARAMCONTROP, "PARAMCONTROP");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARAMCONTROP,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARAMARESIDU, "PARAMARESIDU");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARAMARESIDU,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARACODIDEBI, "PARACODIDEBI");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARACODIDEBI,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARAMDEBITOR, "PARAMDEBITOR");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15,IMDBDef9.PQSL_PARAM15_PARAMDEBITOR,5,60,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAM15, 0);
  }

  private static void Init_PQRY_PARAM15_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAM15_RS, 8);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAM15_RS, "PQRY_PARAM15_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARAMDATAREG, "PARAMDATAREG");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARAMDATAREG,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARAMDESCRIZ, "PARAMDESCRIZ");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARAMDESCRIZ,5,250,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARAMCAUSALE, "PARAMCAUSALE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARAMCAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARATIPOSERV, "PARATIPOSERV");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARATIPOSERV,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARAMCONTROP, "PARAMCONTROP");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARAMCONTROP,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARAMARESIDU, "PARAMARESIDU");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARAMARESIDU,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARACODIDEBI, "PARACODIDEBI");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARACODIDEBI,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARAMDEBITOR, "PARAMDEBITOR");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM15_RS,IMDBDef9.PQSL_PARAM15_PARAMDEBITOR,5,60,0);
  }

  private static void Init_QRY_CFA3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.QRY_CFA3, 1);
    IMDB.set_TblCode(IMDBDef9.QRY_CFA3, "QRY_CFA3");
    IMDB.set_FldCode(IMDBDef9.QRY_CFA3,IMDBDef9.QSL_CFA3_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef9.QRY_CFA3,IMDBDef9.QSL_CFA3_ROWNAMEPROGR,1,8,0);
  }

  private static void Init_PQRY_CFA2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_CFA2, 10);
    IMDB.set_TblCode(IMDBDef9.PQRY_CFA2, "PQRY_CFA2");
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_CFBERASOESES, "CFBERASOESES");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_CFBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_CFAT03DESCRI, "CFAT03DESCRI");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_CFAT03DESCRI,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CFA2,IMDBDef9.PQSL_CFA2_PROGRESSIVO,3,10,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_CFA2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissAcc(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissAcc()
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
    FormIdx = MyGlb.FRM_EMISSACC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "02CE0C0C-80FF-4370-A06F-7CF45598CC61";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 544;
    DesignHeight = 298;
    set_Caption(new IDVariant("Emiss Acc"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 544;
    Frames[1].Height = 272;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 272;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 544-MyGlb.PAN_OFFS_X, 272-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "18424B04-826C-4DFA-A5A2-C2AAC7653F0C");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1248, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    PAN_PARAM.SetSubFrame(PFL_PARAM_PANNELINVISI,2);
    Frames[2].set_SubFrame(true);
    Frames[2].Caption = "Imputazioni Da Emettere";
    Frames[2].Parent = this;
    PAN_IMPUTDAEMETT = new IDPanel(w, this, 2, "PAN_IMPUTDAEMETT");
    Frames[2].Content = PAN_IMPUTDAEMETT;
    PAN_IMPUTDAEMETT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPUTDAEMETT.VS = MainFrm.VisualStyleList;
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8BA176E3-6A1F-43FE-825B-7B151BFABE3C");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 728, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPUTDAEMETT.InitStatus = 1;
    PAN_IMPUTDAEMETT_Init();
    PAN_IMPUTDAEMETT_InitFields();
    PAN_IMPUTDAEMETT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM16, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISSACC_PARAM15();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_IMPUTDAEMETT.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELFATTCONT && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_CONTROPAPATR) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_SCEGBENFBUTT) {
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
    return (obj instanceof EmissAcc);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissAcc.class.getName() : (Glb.ClassWithPackage(EmissAcc.class) ? EmissAcc.class.getName().substring(EmissAcc.class.getPackage().getName().length() + 1) : EmissAcc.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      SelettoreBeneficiario v_SELETTBENEFI = new SelettoreBeneficiario(MainFrm,IMDB);
      if (Column.equals((new IDVariant(PFL_PARAM_DEBITORE)), true))
      {
        if (IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDEBITOR, 0).compareTo(IMDB.Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDEBIOLD, 0), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDEBITOR, 0))))
          {
            IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDEBITOR, 0, IDL.Upper(IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDEBITOR, 0)));
            v_SELETTBENEFI.AzzeraValori();
            v_SELETTBENEFI.SetParam(IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDEBITOR, 0), (new IDVariant("FAT")), (new IDVariant(-1)), (new IDVariant()));
            if (!(IDL.IsNull(v_SELETTBENEFI.GetTrovato())))
            {
              if (v_SELETTBENEFI.GetTrovato().equals((new IDVariant("SI")), true))
              {
                IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARACODIDEBI, 0, v_SELETTBENEFI.GetBeneficiario());
                IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDEBITOR, 0, v_SELETTBENEFI.GetRagioneSociale());
              }
              else
              {
                IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARACODIDEBI, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDEBITOR, 0, (new IDVariant()));
              }
            }
            else
            {
              return;
            }
          }
          else
          {
            IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARACODIDEBI, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDEBIOLD, 0, IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDEBITOR, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissAcc", "ParamOnUpdatingRow", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARACODIDEBI, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDEBITOR, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_RAGIONE_SOCIALE_ESTESA, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDEBIOLD, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_RAGIONE_SOCIALE_ESTESA, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARACODIDEBI, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDEBITOR, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_RAGIONE_SOCIALE_ESTESA, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDEBIOLD, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_RAGIONE_SOCIALE_ESTESA, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SOGGETTO)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARACODIDEBI, 0, IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_CODICE, 0));
          IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDEBITOR, 0, IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_RAGIONE_SOCIALE_ESTESA, 0));
          IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDEBIOLD, 0, IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_RAGIONE_SOCIALE_ESTESA, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARACODIDEBI, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDEBITOR, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDEBIOLD, 0, (new IDVariant()));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELFATTCONT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMCONTROP, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI2, IMDBDef7.PQSL_FATTORI2_FATTORE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissAcc", "EndModalEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Emissione Accertamenti", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDATAREG, 0, IDL.Today());
      IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMARESIDU, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMCAUSALE, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARATIPOSERV, 0, (new IDVariant(-1)));
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      // 
      // 
      // 
      // 
      if (MainFrm.MODAIMPUSPES.compareTo((new IDVariant("LI")), true)!=0)
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissAcc", "LoadEvent", _e);
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
      PAN_PARAM.PanelCommand(Glb.PCM_UPDATE);
      UNLOADEVENT_PARADELEROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissAcc", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Param: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDATAREG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDESCRIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMCAUSALE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARATIPOSERV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMCONTROP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMARESIDU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARATIPOREGI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARATIPOBOLL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARACODIDEBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDEBITOR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDEBIOLD, 0, new IDVariant());
  }

  // **********************************************************************
  // Cmd Contropartita Patr
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CmdContropartitaPatr ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cmd Contropartita Patr Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMDATREG, 0, IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDATAREG, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMETIPO, 0, (new IDVariant("P")));
      MainFrm.Show(MyGlb.FRM_SCELFATTCONT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissAcc", "CmdContropartitaPatr", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cmd Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CmdElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ESERCIZIO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMEROACC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Cmd Elabora Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDESCRIZ, 0)))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Descrizione Obbligatoria", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      if (IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMARESIDU, 0).equals((new IDVariant("SI")), true))
      {
        v_ESERCIZIO = (new IDVariant(-1));
      }
      else
      {
        v_ESERCIZIO = IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0);
      }
      // 
      // scorro il pannello
      // 
      {
        CMDELABORA_CFA3();
        while (!IMDB.Eof(IMDBDef9.QRY_CFA3, 0))
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("insert into WRK_ELAB_FAT ");
            SQL.append("( ");
            SQL.append("  SESSIONE_ID, ");
            SQL.append("  CHIAVE, ");
            SQL.append("  DATI ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ), ");
            SQL.append("  'EACC', ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef9.QRY_CFA3, IMDBDef9.QSL_CFA3_ROWNAMEPROGR, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e9)
          {
            MainFrm.set_AlertMessage(new IDVariant(e9.getMessage())); 
          }
          IMDB.TblMoveNext(IMDBDef9.QRY_CFA3, 0);
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.ACCEMISSCFA(IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDATAREG, 0), IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMDESCRIZ, 0), ((IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMCAUSALE, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMCAUSALE, 0)), ((IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARATIPOSERV, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARATIPOSERV, 0)), IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARACODIDEBI, 0), IMDB.Value(IMDBDef9.PQRY_PARAM15, IMDBDef9.PQSL_PARAM15_PARAMCONTROP, 0), MainFrm.PROGRESESSIO, (new IDVariant("EACC")), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_NUMEROACC, v_NUMDA, v_NUMA, v_ESERCIZIO);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      if (v_NUMEROACC.equals((new IDVariant(0)), true))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Non sono stati emessi accertamenti", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
      }
      else
      {
        if (v_NUMEROACC.equals((new IDVariant(1)), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("E' stato emesso l'accertamento ", IDVariant.STRING));
          MainFrm.set_AlertMessage(IDL.Add(v_SMS, IDL.ToString(v_NUMDA))); 
        }
        else
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Sono stati emessi ", IDVariant.STRING));
          IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
          v_SMS1 = (new IDVariant(" accertamenti, dal ", IDVariant.STRING));
          IDVariant v_SMS2 = new IDVariant(0,IDVariant.STRING);
          v_SMS2 = (new IDVariant(" al ", IDVariant.STRING));
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_SMS, IDL.ToString(v_NUMEROACC)), v_SMS1), IDL.ToString(v_NUMDA)), v_SMS2), IDL.ToString(v_NUMA))); 
        }
      }
      ((EmissioneAccertamenti)MainFrm.GetForm(MyGlb.FRM_EMISSIACCERT,0)).PAN_IMPUTDAEMETT.PanelCommand(Glb.PCM_REQUERY);
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissAcc", "CmdElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // CFA
  // Which data are you selecting?
  // **********************************************************************
  private void CMDELABORA_CFA3() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.QRY_CFA3);
    IMDB.TblMoveFirst(IMDBDef2.TBL_CFA, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_CFA, 0))
    {
      IMDB.TblAddNew(IMDBDef9.QRY_CFA3, 0);
      IMDB.TblLinkRow(IMDBDef9.QRY_CFA3, 0, IMDBDef2.TBL_CFA, 0);
      IMDB.TblLinkField(IMDBDef9.QRY_CFA3, 0, 0, IMDBDef2.TBL_CFA, IMDBDef2.FLD_CFA_ROWNAMEPROGR, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_CFA, 0);
      if (IMDB.Eof(IMDBDef2.TBL_CFA, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_CFA, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.QRY_CFA3, 0);
  }

  // **********************************************************************
  // Scegli Benficiario Button
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ScegliBenficiarioButton ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Benficiario Button Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissAcc", "ScegliBenficiarioButton", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void EMISSACC_PARAM15() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAM15_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM16, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM16, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAM15_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAM15_RS, 0, IMDBDef2.TBL_PARAM16, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM15_RS, 0, 0, IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDATAREG, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM15_RS, 1, 0, IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDESCRIZ, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM15_RS, 2, 0, IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMCAUSALE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM15_RS, 3, 0, IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARATIPOSERV, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM15_RS, 4, 0, IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMCONTROP, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM15_RS, 5, 0, IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMARESIDU, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM15_RS, 6, 0, IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARACODIDEBI, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM15_RS, 7, 0, IMDBDef2.TBL_PARAM16, IMDBDef2.FLD_PARAM16_PARAMDEBITOR, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM16, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM16, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM16, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAM15_RS, 0);
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_CONTROPAPATR)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CmdContropartitaPatr();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CmdElabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_SCEGBENFBUTT)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliBenficiarioButton();
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
  private void PAN_IMPUTDAEMETT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IMPUTDAEMETT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPUTDAEMETT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPUTDAEMETT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPUTDAEMETT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_IMPUTDAEMETT);
    // Stub
  }

  private void PAN_IMPUTDAEMETT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IMPUTDAEMETT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMPUTDAEMETT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMPUTDAEMETT_IntValidateRow(Cancel);
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
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DATAREG, "6F9FF14F-0BF9-4CA7-86DD-8A7AFF5E2960");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DATAREG, "Data Reg.");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DATAREG, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DATAREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE2, "4D7BD89C-7A74-4D09-A2C4-06579B7EA19D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE2, "Descrizione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE2, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE2, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, "C2CBC8AD-923B-4195-AA8F-E308BAC12148");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, "Causale");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSERVIZIO, "FCCB2A1D-5D66-427C-A413-14CFA86C8B39");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSERVIZIO, "Tipo Servizio");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSERVIZIO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSERVIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ARESIDUO, "91694CC8-55D6-4FF4-9105-AFF24B5B2044");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ARESIDUO, "A Residuo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ARESIDUO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ARESIDUO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ARESIDUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, "CD1C1DFA-B198-4972-B1B5-8B5AC148DE2D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, "Debitore");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, "06144545-6418-423B-9C45-F0E185813EDB");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, "Codice Debitore");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, "2F945887-217A-4DF8-88EF-35C333D74EB2");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, "Contropartita Patr.");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, "35BDF7CD-AB8F-43B9-AB77-EB50A1D5B816");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "12C464D7-14CC-4917-A47E-BC279F60F4EC");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PANNELINVISI, "431845DD-90CD-4A84-A24E-0E64F8BD20D9");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PANNELINVISI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PANNELINVISI, MyGlb.VIS_LABELFIELD);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PANNELINVISI, 0, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, "7F581BF5-6F09-4466-8879-B8D5DDDD7DAB");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, 0, "wsearch1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATAREG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATAREG, MyGlb.PANEL_LIST, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATAREG, MyGlb.PANEL_FORM, 12, 4, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATAREG, MyGlb.PANEL_FORM, 108);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DATAREG, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DATAREG, PPQRY_PARAM15, "A.PARAMDATAREG", "PARAMDATAREG", 6, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE2, MyGlb.PANEL_LIST, 4, 184, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE2, MyGlb.PANEL_LIST, 104);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE2, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE2, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE2, MyGlb.PANEL_FORM, 32, 28, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE2, MyGlb.PANEL_FORM, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE2, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE2, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DESCRIZIONE2, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DESCRIZIONE2, PPQRY_PARAM15, "A.PARAMDESCRIZ", "PARAMDESCRIZ", 5, 250, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_LIST, 104, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_LIST, "Causale");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_FORM, 32, 52, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_FORM, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CAUSALE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CAUSALE, PPQRY_PARAM15, "A.PARAMCAUSALE", "PARAMCAUSALE", 1, 4, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSERVIZIO, MyGlb.PANEL_LIST, 168, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSERVIZIO, MyGlb.PANEL_LIST, 68);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSERVIZIO, MyGlb.PANEL_LIST, "Tp. Serv.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSERVIZIO, MyGlb.PANEL_FORM, 32, 76, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSERVIZIO, MyGlb.PANEL_FORM, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOSERVIZIO, MyGlb.PANEL_FORM, "Tipo Servizio");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOSERVIZIO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOSERVIZIO, PPQRY_PARAM15, "A.PARATIPOSERV", "PARATIPOSERV", 1, 3, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ARESIDUO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ARESIDUO, MyGlb.PANEL_LIST, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ARESIDUO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ARESIDUO, MyGlb.PANEL_LIST, "A Residuo");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ARESIDUO, MyGlb.PANEL_FORM, 404, 76, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ARESIDUO, MyGlb.PANEL_FORM, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ARESIDUO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ARESIDUO, MyGlb.PANEL_FORM, "A Residuo");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ARESIDUO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ARESIDUO, PPQRY_PARAM15, "A.PARAMARESIDU", "PARAMARESIDU", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ARESIDUO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ARESIDUO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, 56, 100, 372, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DEBITORE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DEBITORE, PPQRY_PARAM15, "A.PARAMDEBITOR", "PARAMDEBITOR", 5, 60, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_LIST, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_LIST, "Codice Debitore");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_FORM, 432, 100, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_FORM, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CODICEDEBITO, MyGlb.PANEL_FORM, "C. Db.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CODICEDEBITO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CODICEDEBITO, PPQRY_PARAM15, "A.PARACODIDEBI", "PARACODIDEBI", 2, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_LIST, 208, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_LIST, 76);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_LIST, "Contropartita Patr.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_FORM, 4, 124, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_FORM, 116);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CONTROPAPATR, MyGlb.PANEL_FORM, "Contropartita Patr.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CONTROPAPATR, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CONTROPAPATR, PPQRY_PARAM15, "A.PARAMCONTROP", "PARAMCONTROP", 5, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_FORM, 200, 124, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_PARAM.SetFieldPage(PFL_PARAM_FATTORDESCRI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 412, 172, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 412, 160, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ELABORA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PANNELINVISI, MyGlb.PANEL_LIST, 40, 180, 244, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PANNELINVISI, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PANNELINVISI, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PANNELINVISI, MyGlb.PANEL_FORM, 40, 180, 244, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PANNELINVISI, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PANNELINVISI, MyGlb.PANEL_FORM, 2);
    PAN_PARAM.SetFieldPage(PFL_PARAM_PANNELINVISI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PANNELINVISI, -1, "", "PANNELINVISI", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_LIST, 312, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_FORM, 496, 104, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCEGBENFBUTT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SCEGBENFBUTT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SCEGBENFBUTT, -1, "", "SCEGBENFBUTT", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~PARAMCONTROP~~) ");
    SQL.append("and   (A.TIPO = 'A' OR A.TIPO = 'P') ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= ~~PARAMDATAREG~~) ");
    PAN_PARAM.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_PARAM.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T57CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T57DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T57 A ");
    SQL.append("where (A.CODICE = ~~PARAMCAUSALE~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMCAUSALE~~ = -1) ");
    SQL.append("order by 1, 2 ");
    PAN_PARAM.SetQuery(PPQRY_T57, 0, SQL, PFL_PARAM_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T57CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T57DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T57 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1, 2 ");
    PAN_PARAM.SetQuery(PPQRY_T57, 1, SQL, PFL_PARAM_CAUSALE, "");
    PAN_PARAM.SetQueryDB(PPQRY_T57, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T75CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T75DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T75 A ");
    SQL.append("where (A.CODICE = ~~PARATIPOSERV~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARATIPOSERV~~ = -1) ");
    SQL.append("order by 1, 2 ");
    PAN_PARAM.SetQuery(PPQRY_T75, 0, SQL, PFL_PARAM_TIPOSERVIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T75CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T75DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T75 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1, 2 ");
    PAN_PARAM.SetQuery(PPQRY_T75, 1, SQL, PFL_PARAM_TIPOSERVIZIO, "");
    PAN_PARAM.SetQueryDB(PPQRY_T75, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM15", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM15, IMDBDef9.PQRY_PARAM15_RS, IMDBDef2.TBL_PARAM16);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DATAREG, IMDBDef2.FLD_PARAM16_PARAMDATAREG);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DESCRIZIONE2, IMDBDef2.FLD_PARAM16_PARAMDESCRIZ);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CAUSALE, IMDBDef2.FLD_PARAM16_PARAMCAUSALE);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOSERVIZIO, IMDBDef2.FLD_PARAM16_PARATIPOSERV);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ARESIDUO, IMDBDef2.FLD_PARAM16_PARAMARESIDU);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DEBITORE, IMDBDef2.FLD_PARAM16_PARAMDEBITOR);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CODICEDEBITO, IMDBDef2.FLD_PARAM16_PARACODIDEBI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CONTROPAPATR, IMDBDef2.FLD_PARAM16_PARAMCONTROP);
    PAN_PARAM.SetMasterTable(0, "PARAM16");
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

  private void PAN_IMPUTDAEMETT_Init()
  {

    PAN_IMPUTDAEMETT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPUTDAEMETT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMPUTDAEMETT.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, "33D10627-C8E4-409A-A92B-94A04C94D03D");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, "Importo");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, "D9378022-8442-4A5A-9DCD-141EA4B23567");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, "Ragione Sociale");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, "4CD157C6-EDAD-4866-9E40-A4319358EA7A");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, "NUMERO DOC");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, "6AD9D80B-3796-4FB8-A497-D61C136A6A7B");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, "D DATA DOC");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, "0CF2DDFA-DF8D-4A5F-A0F3-2FEC26478B7E");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, "DESCRIZIONE");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, "CECE1B85-E483-4936-9A06-6103C3015049");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, "Documento");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, "602F126F-ECB4-40D5-B3F1-8C54E9D1824B");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, "Descrizione");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, "5FB3BF18-79E7-49AA-87E2-72D749A15095");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, "CAPITOLO");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, "B6B93661-E1FC-42AC-A4D7-6D930F6DC736");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, "ARTICOLO");
    PAN_IMPUTDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, "");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPUTDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, "919ADB88-8B6E-4898-85B1-2435508B7818");
    PAN_IMPUTDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, "Capitolo");
    PAN_IMPUTDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPUTDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_IMPUTDAEMETT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_FORM, 188, 100, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_FORM, 72);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_IMPORTO, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_IMPORTO, PPQRY_CFA2, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 88, 36, 148, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 100);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 292, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 100);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_RAGIONSOCIAL, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_RAGIONSOCIAL, PPQRY_CFA2, "C.RAGIONE_SOCIALE_ESTESA", "CFBERASOESES", 5, 60, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_LIST, 236, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_FORM, 4, 316, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_FORM, 76);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_NUMERODOC, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_NUMERODOC, PPQRY_CFA2, "B.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_LIST, 300, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_LIST, 72);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_LIST, "D DATA DOC");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_FORM, 4, 340, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_FORM, 72);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DDATADOC, MyGlb.PANEL_FORM, "D DT. DOC");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_DDATADOC, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_DDATADOC, PPQRY_CFA2, "B.D_DATA_DOC", "D_DATA_DOC", 6, 10, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_LIST, 368, 36, 128, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 364, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE1, MyGlb.PANEL_FORM, "DESCR.");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_DESCRIZIONE1, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldUnbound(PFL_IMPUTDAEMETT_DESCRIZIONE1, true);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_DESCRIZIONE1, PPQRY_CFA2, "D.DESCRIZIONE", "CFAT03DESCRI", 5, 40, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, MyGlb.PANEL_LIST, 236, 0, 312, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, MyGlb.PANEL_LIST, 2);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, MyGlb.PANEL_FORM, 300, 0, 312, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DOCUMENTO, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_DOCUMENTO, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_DOCUMENTO, -1, "", "DOCUMENTO", 0, 0, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_LIST, 496, 36, 148, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 388, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_DESCRIZIONE, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_DESCRIZIONE, PPQRY_CFA2, "E.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_LIST, 704, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_LIST, 60);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_FORM, 4, 436, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_FORM, 60);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO1, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_CAPITOLO1, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_CAPITOLO1, PPQRY_CFA2, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_LIST, 760, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_LIST, "AR.");
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_FORM, 4, 460, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_IMPUTDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_ARTICOLO, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_ARTICOLO, PPQRY_CFA2, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, MyGlb.PANEL_LIST, 644, 0, 168, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, MyGlb.PANEL_LIST, 0);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, MyGlb.PANEL_LIST, 2);
    PAN_IMPUTDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, MyGlb.PANEL_FORM, 644, 0, 168, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPUTDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, MyGlb.PANEL_FORM, 0);
    PAN_IMPUTDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPUTDAEMETT_CAPITOLO, MyGlb.PANEL_FORM, 2);
    PAN_IMPUTDAEMETT.SetFieldPage(PFL_IMPUTDAEMETT_CAPITOLO, -1, -1);
    PAN_IMPUTDAEMETT.SetFieldPanel(PFL_IMPUTDAEMETT_CAPITOLO, -1, "", "CAPITOLO", 0, 0, 0, -13997);
  }

  private void PAN_IMPUTDAEMETT_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPUTDAEMETT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMPUTDAEMETT.SetIMDB(IMDB, "PQRY_CFA2", true);
    PAN_IMPUTDAEMETT.set_SetString(MyGlb.MASTER_ROWNAME, "CFA");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as CFBERASOESES, ");
    SQL.append("  B.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  B.D_DATA_DOC as D_DATA_DOC, ");
    SQL.append("  D.DESCRIZIONE as CFAT03DESCRI, ");
    SQL.append("  E.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  B.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO ");
    PAN_IMPUTDAEMETT.SetQuery(PPQRY_CFA2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CFA A, ");
    SQL.append("  FAT B, ");
    SQL.append("  BEN C, ");
    SQL.append("  T03 D, ");
    SQL.append("  T04 E ");
    PAN_IMPUTDAEMETT.SetQuery(PPQRY_CFA2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_PROG = B.ANNO_PROG) ");
    SQL.append("and   (A.NUMERO_PROG = B.NUMERO_PROG) ");
    SQL.append("and   (B.CODICE = C.CODICE(+)) ");
    SQL.append("and   (B.CODICE_DOC = D.CODICE(+)) ");
    SQL.append("and   (B.STORNO = D.STORNO(+)) ");
    SQL.append("and   (GESTIONE_IVA.FAT_PRIMO_TIPO_REGISTRO(B.ANNO_PROG,B.NUMERO_PROG) = E.TIPO_REGISTRO) ");
    SQL.append("and   (GESTIONE_IVA.FAT_PRIMO_TIPO_BOLLATO(B.ANNO_PROG,B.NUMERO_PROG) = E.TIPO_BOLLATO) ");
    SQL.append("and   ((A.ANNO_ACC IS NULL)) ");
    SQL.append("and   (A.ESERCIZIO <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   ((A.FLAG_LIQUIDATO IS NULL)) ");
    SQL.append("and   ((~~TBL_PARAM16.PARACODIDEBI~~ IS NULL) OR B.CODICE = ~~TBL_PARAM16.PARACODIDEBI~~) ");
    SQL.append("and   (B.CODICE_DOC = 3 OR B.CODICE_DOC = 6 OR B.CODICE_DOC = 8) ");
    SQL.append("and   (B.D_DATA_DOC >= ~~TBL_PARAM16.PARAMDAL~~) ");
    SQL.append("and   (B.D_DATA_DOC <= ~~TBL_PARAM16.PARAMAL~~) ");
    SQL.append("and   ((~~TBL_PARAM16.PARATIPOREGI~~ IS NULL) OR E.TIPO_REGISTRO = ~~TBL_PARAM16.PARATIPOREGI~~) ");
    SQL.append("and   ((~~TBL_PARAM16.PARATIPOBOLL~~ IS NULL) OR E.TIPO_BOLLATO = ~~TBL_PARAM16.PARATIPOBOLL~~) ");
    PAN_IMPUTDAEMETT.SetQuery(PPQRY_CFA2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPUTDAEMETT.SetQuery(PPQRY_CFA2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPUTDAEMETT.SetQuery(PPQRY_CFA2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  B.ANNO_DOC, ");
    SQL.append("  B.NUMERO_DOC ");
    PAN_IMPUTDAEMETT.SetQuery(PPQRY_CFA2, 5, SQL, -1, "");
    PAN_IMPUTDAEMETT.SetQueryDB(PPQRY_CFA2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPUTDAEMETT.SetMasterTable(0, "CFA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPUTDAEMETT.Status() == 2)
    {
      int oldListQBE = PAN_IMPUTDAEMETT.iUseListQBE;
      PAN_IMPUTDAEMETT.iUseListQBE = 0;
      PAN_IMPUTDAEMETT.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPUTDAEMETT.PanelCommand(Glb.PCM_FIND);
      PAN_IMPUTDAEMETT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_IMPUTDAEMETT) PAN_IMPUTDAEMETT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_IMPUTDAEMETT) PAN_IMPUTDAEMETT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_IMPUTDAEMETT) PAN_IMPUTDAEMETT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_IMPUTDAEMETT) PAN_IMPUTDAEMETT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_IMPUTDAEMETT) PAN_IMPUTDAEMETT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
