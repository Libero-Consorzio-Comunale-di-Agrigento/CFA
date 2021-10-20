// **********************************************
// Special Digita Testo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SpecialDigitaTesto extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_NOTE1_NOTE1 = 0;

  private static int PPQRY_NOTE7 = 0;


  IDPanel PAN_NOTE1;
  private static int PFL_NOTE2_NOTE2 = 0;

  private static int PPQRY_NOTE8 = 0;


  IDPanel PAN_NOTE2;
  private static int PFL_NOTE3_NOTE3 = 0;

  private static int PPQRY_NOTE9 = 0;


  IDPanel PAN_NOTE3;
  private static int PFL_NOTE4_NOTE4 = 0;

  private static int PPQRY_NOTE10 = 0;


  IDPanel PAN_NOTE4;
  private static int PFL_NOTE5_NOTE5 = 0;

  private static int PPQRY_NOTE11 = 0;


  IDPanel PAN_NOTE5;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NOTE1(IMDB);
    Init_TBL_NOTE2(IMDB);
    Init_TBL_NOTE3(IMDB);
    Init_TBL_NOTE4(IMDB);
    Init_TBL_NOTE5(IMDB);
    Init_TBL_PAR34(IMDB);
    //
    //
    Init_PQRY_NOTE7(IMDB);
    Init_PQRY_NOTE7_RS(IMDB);
    Init_PQRY_NOTE8(IMDB);
    Init_PQRY_NOTE8_RS(IMDB);
    Init_PQRY_NOTE9(IMDB);
    Init_PQRY_NOTE9_RS(IMDB);
    Init_PQRY_NOTE10(IMDB);
    Init_PQRY_NOTE10_RS(IMDB);
    Init_PQRY_NOTE11(IMDB);
    Init_PQRY_NOTE11_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NOTE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_NOTE1, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_NOTE1, "TBL_NOTE1");
    IMDB.set_FldCode(IMDBDef4.TBL_NOTE1,IMDBDef4.FLD_NOTE1_ROWNAMENOTE1, "ROWNAMENOTE1");
    IMDB.SetFldParams(IMDBDef4.TBL_NOTE1,IMDBDef4.FLD_NOTE1_ROWNAMENOTE1,9,400,0);
    IMDB.TblAddNew(IMDBDef4.TBL_NOTE1, 0);
  }

  private static void Init_TBL_NOTE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_NOTE2, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_NOTE2, "TBL_NOTE2");
    IMDB.set_FldCode(IMDBDef4.TBL_NOTE2,IMDBDef4.FLD_NOTE2_ROWNAMENOTE2, "ROWNAMENOTE2");
    IMDB.SetFldParams(IMDBDef4.TBL_NOTE2,IMDBDef4.FLD_NOTE2_ROWNAMENOTE2,9,400,0);
    IMDB.TblAddNew(IMDBDef4.TBL_NOTE2, 0);
  }

  private static void Init_TBL_NOTE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_NOTE3, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_NOTE3, "TBL_NOTE3");
    IMDB.set_FldCode(IMDBDef4.TBL_NOTE3,IMDBDef4.FLD_NOTE3_ROWNAMENOTE3, "ROWNAMENOTE3");
    IMDB.SetFldParams(IMDBDef4.TBL_NOTE3,IMDBDef4.FLD_NOTE3_ROWNAMENOTE3,9,400,0);
    IMDB.TblAddNew(IMDBDef4.TBL_NOTE3, 0);
  }

  private static void Init_TBL_NOTE4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_NOTE4, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_NOTE4, "TBL_NOTE4");
    IMDB.set_FldCode(IMDBDef4.TBL_NOTE4,IMDBDef4.FLD_NOTE4_ROWNAMENOTE4, "ROWNAMENOTE4");
    IMDB.SetFldParams(IMDBDef4.TBL_NOTE4,IMDBDef4.FLD_NOTE4_ROWNAMENOTE4,9,400,0);
    IMDB.TblAddNew(IMDBDef4.TBL_NOTE4, 0);
  }

  private static void Init_TBL_NOTE5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_NOTE5, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_NOTE5, "TBL_NOTE5");
    IMDB.set_FldCode(IMDBDef4.TBL_NOTE5,IMDBDef4.FLD_NOTE5_ROWNAMENOTE5, "ROWNAMENOTE5");
    IMDB.SetFldParams(IMDBDef4.TBL_NOTE5,IMDBDef4.FLD_NOTE5_ROWNAMENOTE5,9,400,0);
    IMDB.TblAddNew(IMDBDef4.TBL_NOTE5, 0);
  }

  private static void Init_TBL_PAR34(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PAR34, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_PAR34, "TBL_PAR34");
    IMDB.set_FldCode(IMDBDef4.TBL_PAR34,IMDBDef4.FLD_PAR34_ROWNAMEMODIF, "ROWNAMEMODIF");
    IMDB.SetFldParams(IMDBDef4.TBL_PAR34,IMDBDef4.FLD_PAR34_ROWNAMEMODIF,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PAR34, 0);
  }

  private static void Init_PQRY_NOTE7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NOTE7, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_NOTE7, "PQRY_NOTE7");
    IMDB.set_FldCode(IMDBDef12.PQRY_NOTE7,IMDBDef12.PQSL_NOTE7_ROWNAMENOTE1, "ROWNAMENOTE1");
    IMDB.SetFldParams(IMDBDef12.PQRY_NOTE7,IMDBDef12.PQSL_NOTE7_ROWNAMENOTE1,9,400,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_NOTE7, 0);
  }

  private static void Init_PQRY_NOTE7_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NOTE7_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_NOTE7_RS, "PQRY_NOTE7_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_NOTE7_RS,IMDBDef12.PQSL_NOTE7_ROWNAMENOTE1, "ROWNAMENOTE1");
    IMDB.SetFldParams(IMDBDef12.PQRY_NOTE7_RS,IMDBDef12.PQSL_NOTE7_ROWNAMENOTE1,9,400,0);
  }

  private static void Init_PQRY_NOTE8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NOTE8, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_NOTE8, "PQRY_NOTE8");
    IMDB.set_FldCode(IMDBDef12.PQRY_NOTE8,IMDBDef12.PQSL_NOTE8_ROWNAMENOTE2, "ROWNAMENOTE2");
    IMDB.SetFldParams(IMDBDef12.PQRY_NOTE8,IMDBDef12.PQSL_NOTE8_ROWNAMENOTE2,9,400,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_NOTE8, 0);
  }

  private static void Init_PQRY_NOTE8_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NOTE8_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_NOTE8_RS, "PQRY_NOTE8_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_NOTE8_RS,IMDBDef12.PQSL_NOTE8_ROWNAMENOTE2, "ROWNAMENOTE2");
    IMDB.SetFldParams(IMDBDef12.PQRY_NOTE8_RS,IMDBDef12.PQSL_NOTE8_ROWNAMENOTE2,9,400,0);
  }

  private static void Init_PQRY_NOTE9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NOTE9, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_NOTE9, "PQRY_NOTE9");
    IMDB.set_FldCode(IMDBDef12.PQRY_NOTE9,IMDBDef12.PQSL_NOTE9_ROWNAMENOTE3, "ROWNAMENOTE3");
    IMDB.SetFldParams(IMDBDef12.PQRY_NOTE9,IMDBDef12.PQSL_NOTE9_ROWNAMENOTE3,9,400,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_NOTE9, 0);
  }

  private static void Init_PQRY_NOTE9_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NOTE9_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_NOTE9_RS, "PQRY_NOTE9_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_NOTE9_RS,IMDBDef12.PQSL_NOTE9_ROWNAMENOTE3, "ROWNAMENOTE3");
    IMDB.SetFldParams(IMDBDef12.PQRY_NOTE9_RS,IMDBDef12.PQSL_NOTE9_ROWNAMENOTE3,9,400,0);
  }

  private static void Init_PQRY_NOTE10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NOTE10, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_NOTE10, "PQRY_NOTE10");
    IMDB.set_FldCode(IMDBDef12.PQRY_NOTE10,IMDBDef12.PQSL_NOTE10_ROWNAMENOTE4, "ROWNAMENOTE4");
    IMDB.SetFldParams(IMDBDef12.PQRY_NOTE10,IMDBDef12.PQSL_NOTE10_ROWNAMENOTE4,9,400,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_NOTE10, 0);
  }

  private static void Init_PQRY_NOTE10_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NOTE10_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_NOTE10_RS, "PQRY_NOTE10_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_NOTE10_RS,IMDBDef12.PQSL_NOTE10_ROWNAMENOTE4, "ROWNAMENOTE4");
    IMDB.SetFldParams(IMDBDef12.PQRY_NOTE10_RS,IMDBDef12.PQSL_NOTE10_ROWNAMENOTE4,9,400,0);
  }

  private static void Init_PQRY_NOTE11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NOTE11, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_NOTE11, "PQRY_NOTE11");
    IMDB.set_FldCode(IMDBDef12.PQRY_NOTE11,IMDBDef12.PQSL_NOTE11_ROWNAMENOTE5, "ROWNAMENOTE5");
    IMDB.SetFldParams(IMDBDef12.PQRY_NOTE11,IMDBDef12.PQSL_NOTE11_ROWNAMENOTE5,9,400,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_NOTE11, 0);
  }

  private static void Init_PQRY_NOTE11_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NOTE11_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_NOTE11_RS, "PQRY_NOTE11_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_NOTE11_RS,IMDBDef12.PQSL_NOTE11_ROWNAMENOTE5, "ROWNAMENOTE5");
    IMDB.SetFldParams(IMDBDef12.PQRY_NOTE11_RS,IMDBDef12.PQSL_NOTE11_ROWNAMENOTE5,9,400,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SpecialDigitaTesto(MyWebEntryPoint w, IMDBObj imdb)
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
  public SpecialDigitaTesto()
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
    FormIdx = MyGlb.FRM_SPECDIGITEST;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "22156B7E-C1BE-4F75-BFA9-EC8AFFE4691C";
    ResModeW = 1;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 596;
    DesignHeight = 642;
    set_Caption(new IDVariant("Special Digita Testo"));
    //
    Frames = new AFrame[10];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 596;
    Frames[1].Height = 616;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.194805;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 596;
    Frames[2].Height = 120;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Note 1";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 120;
    PAN_NOTE1 = new IDPanel(w, this, 2, "PAN_NOTE1");
    Frames[2].Content = PAN_NOTE1;
    PAN_NOTE1.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTE1.VS = MainFrm.VisualStyleList;
    PAN_NOTE1.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 596-MyGlb.PAN_OFFS_X, 120-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTE1.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AE3FD46D-54DA-4C71-9732-8EB1D828B500");
    PAN_NOTE1.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTE1.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTE1.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTE1.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTE1.InitStatus = 2;
    PAN_NOTE1_Init();
    PAN_NOTE1_InitFields();
    PAN_NOTE1_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 596;
    Frames[3].Height = 496;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.241935;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 596;
    Frames[4].Height = 120;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Note 2";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 120;
    PAN_NOTE2 = new IDPanel(w, this, 4, "PAN_NOTE2");
    Frames[4].Content = PAN_NOTE2;
    PAN_NOTE2.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTE2.VS = MainFrm.VisualStyleList;
    PAN_NOTE2.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 596-MyGlb.PAN_OFFS_X, 120-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTE2.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F4181202-BB77-43B6-8578-91F4552BE111");
    PAN_NOTE2.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTE2.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTE2.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTE2.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTE2.InitStatus = 2;
    PAN_NOTE2_Init();
    PAN_NOTE2_InitFields();
    PAN_NOTE2_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[3].ChildFrame2 = Frames[5];
    Frames[5].Width = 596;
    Frames[5].Height = 376;
    Frames[5].Vertical = true;
    Frames[5].FormFactor = 0.319149;
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[5].ChildFrame1 = Frames[6];
    Frames[6].Width = 596;
    Frames[6].Height = 120;
    Frames[6].FrHidden = true;
    Frames[6].Caption = "Note 3";
    Frames[6].Parent = this;
    Frames[6].FixedHeight = 120;
    PAN_NOTE3 = new IDPanel(w, this, 6, "PAN_NOTE3");
    Frames[6].Content = PAN_NOTE3;
    PAN_NOTE3.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTE3.VS = MainFrm.VisualStyleList;
    PAN_NOTE3.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 596-MyGlb.PAN_OFFS_X, 120-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTE3.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EB8D1E15-3A82-447D-83F5-69BED72A1449");
    PAN_NOTE3.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTE3.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTE3.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTE3.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTE3.InitStatus = 2;
    PAN_NOTE3_Init();
    PAN_NOTE3_InitFields();
    PAN_NOTE3_InitQueries();
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[5].ChildFrame2 = Frames[7];
    Frames[7].Width = 596;
    Frames[7].Height = 256;
    Frames[7].Vertical = true;
    Frames[7].FormFactor = 0.46875;
    Frames[8] = new AFrame(8);
    Frames[8].Parent = this;
    Frames[7].ChildFrame1 = Frames[8];
    Frames[8].Width = 596;
    Frames[8].Height = 120;
    Frames[8].FrHidden = true;
    Frames[8].Caption = "Note 4";
    Frames[8].Parent = this;
    Frames[8].FixedHeight = 120;
    PAN_NOTE4 = new IDPanel(w, this, 8, "PAN_NOTE4");
    Frames[8].Content = PAN_NOTE4;
    PAN_NOTE4.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTE4.VS = MainFrm.VisualStyleList;
    PAN_NOTE4.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 596-MyGlb.PAN_OFFS_X, 120-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTE4.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D8F2222B-B7E7-462D-8F3B-B952E87A59A2");
    PAN_NOTE4.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTE4.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTE4.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTE4.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTE4.InitStatus = 2;
    PAN_NOTE4_Init();
    PAN_NOTE4_InitFields();
    PAN_NOTE4_InitQueries();
    Frames[9] = new AFrame(9);
    Frames[9].Parent = this;
    Frames[7].ChildFrame2 = Frames[9];
    Frames[9].Width = 596;
    Frames[9].Height = 136;
    Frames[9].FrHidden = true;
    Frames[9].Caption = "Note 5";
    Frames[9].Parent = this;
    Frames[9].FixedHeight = 136;
    PAN_NOTE5 = new IDPanel(w, this, 9, "PAN_NOTE5");
    Frames[9].Content = PAN_NOTE5;
    PAN_NOTE5.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTE5.VS = MainFrm.VisualStyleList;
    PAN_NOTE5.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 596-MyGlb.PAN_OFFS_X, 136-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTE5.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5C396DC3-EE68-4DC1-B7DD-CA5E7BF12D9A");
    PAN_NOTE5.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTE5.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTE5.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTE5.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTE5.InitStatus = 2;
    PAN_NOTE5_Init();
    PAN_NOTE5_InitFields();
    PAN_NOTE5_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_NOTE1, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SPECDIGITEST_NOTE7();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_NOTE2, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SPECDIGITEST_NOTE8();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_NOTE3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SPECDIGITEST_NOTE9();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_NOTE4, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SPECDIGITEST_NOTE10();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_NOTE5, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SPECDIGITEST_NOTE11();
      }
      PAN_NOTE1.UpdatePanel(MainFrm);
      PAN_NOTE2.UpdatePanel(MainFrm);
      PAN_NOTE3.UpdatePanel(MainFrm);
      PAN_NOTE4.UpdatePanel(MainFrm);
      PAN_NOTE5.UpdatePanel(MainFrm);
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
    return (obj instanceof SpecialDigitaTesto);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SpecialDigitaTesto.class.getName() : (Glb.ClassWithPackage(SpecialDigitaTesto.class) ? SpecialDigitaTesto.class.getName().substring(SpecialDigitaTesto.class.getPackage().getName().length() + 1) : SpecialDigitaTesto.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Note", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAP));
      if (IMDB.Value(IMDBDef4.TBL_PAR34, IMDBDef4.FLD_PAR34_ROWNAMEMODIF, 0).equals((new IDVariant("NO")), true))
      {
        PAN_NOTE1.set_Locked((new IDVariant(-1)).booleanValue());
        PAN_NOTE2.set_Locked((new IDVariant(-1)).booleanValue());
        PAN_NOTE3.set_Locked((new IDVariant(-1)).booleanValue());
        PAN_NOTE4.set_Locked((new IDVariant(-1)).booleanValue());
        PAN_NOTE5.set_Locked((new IDVariant(-1)).booleanValue());
        PAN_NOTE1.set_iLockable((new IDVariant(0)).booleanValue());
        PAN_NOTE2.set_iLockable((new IDVariant(0)).booleanValue());
        PAN_NOTE3.set_iLockable((new IDVariant(0)).booleanValue());
        PAN_NOTE4.set_iLockable((new IDVariant(0)).booleanValue());
        PAN_NOTE5.set_iLockable((new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SpecialDigitaTesto", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Note 1
  // Primary record source for panel data
  // **********************************************************************
  private void SPECDIGITEST_NOTE7() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_NOTE7_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_NOTE1, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_NOTE1, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_NOTE7_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_NOTE7_RS, 0, IMDBDef4.TBL_NOTE1, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_NOTE7_RS, 0, 0, IMDBDef4.TBL_NOTE1, IMDBDef4.FLD_NOTE1_ROWNAMENOTE1, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_NOTE1, 0);
      if (IMDB.Eof(IMDBDef4.TBL_NOTE1, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_NOTE1, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_NOTE7_RS, 0);
  }

  // **********************************************************************
  // Note 2
  // Primary record source for panel data
  // **********************************************************************
  private void SPECDIGITEST_NOTE8() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_NOTE8_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_NOTE2, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_NOTE2, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_NOTE8_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_NOTE8_RS, 0, IMDBDef4.TBL_NOTE2, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_NOTE8_RS, 0, 0, IMDBDef4.TBL_NOTE2, IMDBDef4.FLD_NOTE2_ROWNAMENOTE2, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_NOTE2, 0);
      if (IMDB.Eof(IMDBDef4.TBL_NOTE2, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_NOTE2, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_NOTE8_RS, 0);
  }

  // **********************************************************************
  // Note 3
  // Primary record source for panel data
  // **********************************************************************
  private void SPECDIGITEST_NOTE9() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_NOTE9_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_NOTE3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_NOTE3, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_NOTE9_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_NOTE9_RS, 0, IMDBDef4.TBL_NOTE3, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_NOTE9_RS, 0, 0, IMDBDef4.TBL_NOTE3, IMDBDef4.FLD_NOTE3_ROWNAMENOTE3, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_NOTE3, 0);
      if (IMDB.Eof(IMDBDef4.TBL_NOTE3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_NOTE3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_NOTE9_RS, 0);
  }

  // **********************************************************************
  // Note 4
  // Primary record source for panel data
  // **********************************************************************
  private void SPECDIGITEST_NOTE10() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_NOTE10_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_NOTE4, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_NOTE4, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_NOTE10_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_NOTE10_RS, 0, IMDBDef4.TBL_NOTE4, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_NOTE10_RS, 0, 0, IMDBDef4.TBL_NOTE4, IMDBDef4.FLD_NOTE4_ROWNAMENOTE4, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_NOTE4, 0);
      if (IMDB.Eof(IMDBDef4.TBL_NOTE4, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_NOTE4, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_NOTE10_RS, 0);
  }

  // **********************************************************************
  // Note 5
  // Primary record source for panel data
  // **********************************************************************
  private void SPECDIGITEST_NOTE11() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_NOTE11_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_NOTE5, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_NOTE5, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_NOTE11_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_NOTE11_RS, 0, IMDBDef4.TBL_NOTE5, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_NOTE11_RS, 0, 0, IMDBDef4.TBL_NOTE5, IMDBDef4.FLD_NOTE5_ROWNAMENOTE5, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_NOTE5, 0);
      if (IMDB.Eof(IMDBDef4.TBL_NOTE5, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_NOTE5, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_NOTE11_RS, 0);
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
  private void PAN_NOTE1_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTE1, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTE1_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTE1, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTE1_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NOTE1);
    // Stub
  }

  private void PAN_NOTE1_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NOTE1_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTE1_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTE1_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_NOTE2_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTE2, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTE2_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTE2, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTE2_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NOTE2);
    // Stub
  }

  private void PAN_NOTE2_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NOTE2_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTE2_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTE2_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_NOTE3_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTE3, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTE3_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTE3, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTE3_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NOTE3);
    // Stub
  }

  private void PAN_NOTE3_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NOTE3_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTE3_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTE3_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_NOTE4_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTE4, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTE4_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTE4, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTE4_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NOTE4);
    // Stub
  }

  private void PAN_NOTE4_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NOTE4_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTE4_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTE4_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_NOTE5_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTE5, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTE5_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTE5, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTE5_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NOTE5);
    // Stub
  }

  private void PAN_NOTE5_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NOTE5_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTE5_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTE5_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_NOTE1_Init()
  {

    PAN_NOTE1.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTE1.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTE1.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_NOTE1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTE1_NOTE1, "025D0100-2641-4061-8791-397793F7DCEB");
    PAN_NOTE1.set_Header(MyGlb.OBJ_FIELD, PFL_NOTE1_NOTE1, "Note 1");
    PAN_NOTE1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTE1_NOTE1, "");
    PAN_NOTE1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTE1_NOTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTE1.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTE1_NOTE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NOTE1_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTE1.SetRect(MyGlb.OBJ_FIELD, PFL_NOTE1_NOTE1, MyGlb.PANEL_LIST, 80, 184, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTE1_NOTE1, MyGlb.PANEL_LIST, 72);
    PAN_NOTE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTE1_NOTE1, MyGlb.PANEL_LIST, 2);
    PAN_NOTE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTE1_NOTE1, MyGlb.PANEL_LIST, "Note 1");
    PAN_NOTE1.SetRect(MyGlb.OBJ_FIELD, PFL_NOTE1_NOTE1, MyGlb.PANEL_FORM, 4, 4, 556, 80, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTE1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTE1_NOTE1, MyGlb.PANEL_FORM, 56);
    PAN_NOTE1.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTE1_NOTE1, MyGlb.PANEL_FORM, 5);
    PAN_NOTE1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTE1_NOTE1, MyGlb.PANEL_FORM, "Note 1");
    PAN_NOTE1.SetFieldPage(PFL_NOTE1_NOTE1, -1, -1);
    PAN_NOTE1.SetFieldPanel(PFL_NOTE1_NOTE1, PPQRY_NOTE7, "A.ROWNAMENOTE1", "ROWNAMENOTE1", 9, 400, 0, -13997);
  }

  private void PAN_NOTE1_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTE1.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTE1.SetIMDB(IMDB, "PQRY_NOTE7", true);
    PAN_NOTE1.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_NOTE1.SetQueryIMDB(PPQRY_NOTE7, IMDBDef12.PQRY_NOTE7_RS, IMDBDef4.TBL_NOTE1);
    JustLoaded = true;
    PAN_NOTE1.SetFieldPrimaryIndex(PFL_NOTE1_NOTE1, IMDBDef4.FLD_NOTE1_ROWNAMENOTE1);
    PAN_NOTE1.SetMasterTable(0, "NOTE1");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTE1.Status() == 2)
    {
      int oldListQBE = PAN_NOTE1.iUseListQBE;
      PAN_NOTE1.iUseListQBE = 0;
      PAN_NOTE1.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTE1.PanelCommand(Glb.PCM_FIND);
      PAN_NOTE1.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_NOTE2_Init()
  {

    PAN_NOTE2.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTE2.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTE2.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_NOTE2.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTE2_NOTE2, "CB2A67C4-136F-4683-BCBA-C9DDC22696BE");
    PAN_NOTE2.set_Header(MyGlb.OBJ_FIELD, PFL_NOTE2_NOTE2, "Note 2");
    PAN_NOTE2.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTE2_NOTE2, "");
    PAN_NOTE2.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTE2_NOTE2, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTE2.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTE2_NOTE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NOTE2_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTE2.SetRect(MyGlb.OBJ_FIELD, PFL_NOTE2_NOTE2, MyGlb.PANEL_LIST, 80, 184, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTE2_NOTE2, MyGlb.PANEL_LIST, 72);
    PAN_NOTE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTE2_NOTE2, MyGlb.PANEL_LIST, 2);
    PAN_NOTE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTE2_NOTE2, MyGlb.PANEL_LIST, "Note 2");
    PAN_NOTE2.SetRect(MyGlb.OBJ_FIELD, PFL_NOTE2_NOTE2, MyGlb.PANEL_FORM, 4, 4, 556, 84, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTE2.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTE2_NOTE2, MyGlb.PANEL_FORM, 56);
    PAN_NOTE2.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTE2_NOTE2, MyGlb.PANEL_FORM, 6);
    PAN_NOTE2.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTE2_NOTE2, MyGlb.PANEL_FORM, "Note 2");
    PAN_NOTE2.SetFieldPage(PFL_NOTE2_NOTE2, -1, -1);
    PAN_NOTE2.SetFieldPanel(PFL_NOTE2_NOTE2, PPQRY_NOTE8, "A.ROWNAMENOTE2", "ROWNAMENOTE2", 9, 400, 0, -13997);
  }

  private void PAN_NOTE2_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTE2.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTE2.SetIMDB(IMDB, "PQRY_NOTE8", true);
    PAN_NOTE2.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_NOTE2.SetQueryIMDB(PPQRY_NOTE8, IMDBDef12.PQRY_NOTE8_RS, IMDBDef4.TBL_NOTE2);
    JustLoaded = true;
    PAN_NOTE2.SetFieldPrimaryIndex(PFL_NOTE2_NOTE2, IMDBDef4.FLD_NOTE2_ROWNAMENOTE2);
    PAN_NOTE2.SetMasterTable(0, "NOTE2");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTE2.Status() == 2)
    {
      int oldListQBE = PAN_NOTE2.iUseListQBE;
      PAN_NOTE2.iUseListQBE = 0;
      PAN_NOTE2.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTE2.PanelCommand(Glb.PCM_FIND);
      PAN_NOTE2.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_NOTE3_Init()
  {

    PAN_NOTE3.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTE3.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTE3.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_NOTE3.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTE3_NOTE3, "06778939-A0AA-42B9-AA68-BA4E53CFCA78");
    PAN_NOTE3.set_Header(MyGlb.OBJ_FIELD, PFL_NOTE3_NOTE3, "Note 3");
    PAN_NOTE3.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTE3_NOTE3, "");
    PAN_NOTE3.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTE3_NOTE3, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTE3.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTE3_NOTE3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NOTE3_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTE3.SetRect(MyGlb.OBJ_FIELD, PFL_NOTE3_NOTE3, MyGlb.PANEL_LIST, 80, 184, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTE3.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTE3_NOTE3, MyGlb.PANEL_LIST, 72);
    PAN_NOTE3.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTE3_NOTE3, MyGlb.PANEL_LIST, 2);
    PAN_NOTE3.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTE3_NOTE3, MyGlb.PANEL_LIST, "Note 3");
    PAN_NOTE3.SetRect(MyGlb.OBJ_FIELD, PFL_NOTE3_NOTE3, MyGlb.PANEL_FORM, 4, 4, 556, 88, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTE3.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTE3_NOTE3, MyGlb.PANEL_FORM, 56);
    PAN_NOTE3.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTE3_NOTE3, MyGlb.PANEL_FORM, 6);
    PAN_NOTE3.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTE3_NOTE3, MyGlb.PANEL_FORM, "Note 3");
    PAN_NOTE3.SetFieldPage(PFL_NOTE3_NOTE3, -1, -1);
    PAN_NOTE3.SetFieldPanel(PFL_NOTE3_NOTE3, PPQRY_NOTE9, "A.ROWNAMENOTE3", "ROWNAMENOTE3", 9, 400, 0, -13997);
  }

  private void PAN_NOTE3_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTE3.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTE3.SetIMDB(IMDB, "PQRY_NOTE9", true);
    PAN_NOTE3.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_NOTE3.SetQueryIMDB(PPQRY_NOTE9, IMDBDef12.PQRY_NOTE9_RS, IMDBDef4.TBL_NOTE3);
    JustLoaded = true;
    PAN_NOTE3.SetFieldPrimaryIndex(PFL_NOTE3_NOTE3, IMDBDef4.FLD_NOTE3_ROWNAMENOTE3);
    PAN_NOTE3.SetMasterTable(0, "NOTE3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTE3.Status() == 2)
    {
      int oldListQBE = PAN_NOTE3.iUseListQBE;
      PAN_NOTE3.iUseListQBE = 0;
      PAN_NOTE3.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTE3.PanelCommand(Glb.PCM_FIND);
      PAN_NOTE3.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_NOTE4_Init()
  {

    PAN_NOTE4.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTE4.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTE4.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_NOTE4.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTE4_NOTE4, "C50A9A74-F87D-4573-8521-45D69D6A177D");
    PAN_NOTE4.set_Header(MyGlb.OBJ_FIELD, PFL_NOTE4_NOTE4, "Note 4");
    PAN_NOTE4.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTE4_NOTE4, "");
    PAN_NOTE4.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTE4_NOTE4, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTE4.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTE4_NOTE4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NOTE4_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTE4.SetRect(MyGlb.OBJ_FIELD, PFL_NOTE4_NOTE4, MyGlb.PANEL_LIST, 80, 184, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTE4_NOTE4, MyGlb.PANEL_LIST, 72);
    PAN_NOTE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTE4_NOTE4, MyGlb.PANEL_LIST, 2);
    PAN_NOTE4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTE4_NOTE4, MyGlb.PANEL_LIST, "Note 4");
    PAN_NOTE4.SetRect(MyGlb.OBJ_FIELD, PFL_NOTE4_NOTE4, MyGlb.PANEL_FORM, 4, 4, 556, 88, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTE4.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTE4_NOTE4, MyGlb.PANEL_FORM, 56);
    PAN_NOTE4.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTE4_NOTE4, MyGlb.PANEL_FORM, 6);
    PAN_NOTE4.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTE4_NOTE4, MyGlb.PANEL_FORM, "Note 4");
    PAN_NOTE4.SetFieldPage(PFL_NOTE4_NOTE4, -1, -1);
    PAN_NOTE4.SetFieldPanel(PFL_NOTE4_NOTE4, PPQRY_NOTE10, "A.ROWNAMENOTE4", "ROWNAMENOTE4", 9, 400, 0, -13997);
  }

  private void PAN_NOTE4_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTE4.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTE4.SetIMDB(IMDB, "PQRY_NOTE10", true);
    PAN_NOTE4.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_NOTE4.SetQueryIMDB(PPQRY_NOTE10, IMDBDef12.PQRY_NOTE10_RS, IMDBDef4.TBL_NOTE4);
    JustLoaded = true;
    PAN_NOTE4.SetFieldPrimaryIndex(PFL_NOTE4_NOTE4, IMDBDef4.FLD_NOTE4_ROWNAMENOTE4);
    PAN_NOTE4.SetMasterTable(0, "NOTE4");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTE4.Status() == 2)
    {
      int oldListQBE = PAN_NOTE4.iUseListQBE;
      PAN_NOTE4.iUseListQBE = 0;
      PAN_NOTE4.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTE4.PanelCommand(Glb.PCM_FIND);
      PAN_NOTE4.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_NOTE5_Init()
  {

    PAN_NOTE5.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTE5.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTE5.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_NOTE5.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTE5_NOTE5, "E19A5335-61DC-4379-98B1-99FEFB63872E");
    PAN_NOTE5.set_Header(MyGlb.OBJ_FIELD, PFL_NOTE5_NOTE5, "Note 5");
    PAN_NOTE5.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTE5_NOTE5, "");
    PAN_NOTE5.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTE5_NOTE5, MyGlb.VIS_NORMALFIELDS);
    PAN_NOTE5.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTE5_NOTE5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NOTE5_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTE5.SetRect(MyGlb.OBJ_FIELD, PFL_NOTE5_NOTE5, MyGlb.PANEL_LIST, 80, 184, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTE5_NOTE5, MyGlb.PANEL_LIST, 72);
    PAN_NOTE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTE5_NOTE5, MyGlb.PANEL_LIST, 2);
    PAN_NOTE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTE5_NOTE5, MyGlb.PANEL_LIST, "Note 5");
    PAN_NOTE5.SetRect(MyGlb.OBJ_FIELD, PFL_NOTE5_NOTE5, MyGlb.PANEL_FORM, 4, 4, 556, 100, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTE5.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTE5_NOTE5, MyGlb.PANEL_FORM, 56);
    PAN_NOTE5.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTE5_NOTE5, MyGlb.PANEL_FORM, 7);
    PAN_NOTE5.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTE5_NOTE5, MyGlb.PANEL_FORM, "Note 5");
    PAN_NOTE5.SetFieldPage(PFL_NOTE5_NOTE5, -1, -1);
    PAN_NOTE5.SetFieldPanel(PFL_NOTE5_NOTE5, PPQRY_NOTE11, "A.ROWNAMENOTE5", "ROWNAMENOTE5", 9, 400, 0, -13997);
  }

  private void PAN_NOTE5_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTE5.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTE5.SetIMDB(IMDB, "PQRY_NOTE11", true);
    PAN_NOTE5.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_NOTE5.SetQueryIMDB(PPQRY_NOTE11, IMDBDef12.PQRY_NOTE11_RS, IMDBDef4.TBL_NOTE5);
    JustLoaded = true;
    PAN_NOTE5.SetFieldPrimaryIndex(PFL_NOTE5_NOTE5, IMDBDef4.FLD_NOTE5_ROWNAMENOTE5);
    PAN_NOTE5.SetMasterTable(0, "NOTE5");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTE5.Status() == 2)
    {
      int oldListQBE = PAN_NOTE5.iUseListQBE;
      PAN_NOTE5.iUseListQBE = 0;
      PAN_NOTE5.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTE5.PanelCommand(Glb.PCM_FIND);
      PAN_NOTE5.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_NOTE1) PAN_NOTE1_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTE2) PAN_NOTE2_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTE3) PAN_NOTE3_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTE4) PAN_NOTE4_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTE5) PAN_NOTE5_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_NOTE1) PAN_NOTE1_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTE2) PAN_NOTE2_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTE3) PAN_NOTE3_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTE4) PAN_NOTE4_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTE5) PAN_NOTE5_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_NOTE1) PAN_NOTE1_DynamicProperties();
    if (SrcObj == PAN_NOTE2) PAN_NOTE2_DynamicProperties();
    if (SrcObj == PAN_NOTE3) PAN_NOTE3_DynamicProperties();
    if (SrcObj == PAN_NOTE4) PAN_NOTE4_DynamicProperties();
    if (SrcObj == PAN_NOTE5) PAN_NOTE5_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_NOTE1) PAN_NOTE1_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NOTE2) PAN_NOTE2_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NOTE3) PAN_NOTE3_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NOTE4) PAN_NOTE4_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NOTE5) PAN_NOTE5_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_NOTE1) PAN_NOTE1_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_NOTE2) PAN_NOTE2_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_NOTE3) PAN_NOTE3_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_NOTE4) PAN_NOTE4_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_NOTE5) PAN_NOTE5_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
