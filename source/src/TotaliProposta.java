// **********************************************
// Totali Proposta
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TotaliProposta extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_ASSESTAMENTO = 0;
  private static int PFL_PARAM_DESCRIZIONE = 1;

  private static int PPQRY_PARAM108 = 0;


  IDPanel PAN_PARAM;
  private static int PFL_TOTALIENTRAT_ENTRATE1 = 0;
  private static int PFL_TOTALIENTRAT_IMP2E1 = 1;
  private static int PFL_TOTALIENTRAT_IMP3E1 = 2;
  private static int PFL_TOTALIENTRAT_ENTRATE = 3;
  private static int PFL_TOTALIENTRAT_IMP2EN1 = 4;
  private static int PFL_TOTALIENTRAT_IMP3EN1 = 5;
  private static int PFL_TOTALIENTRAT_TOTALE1 = 6;
  private static int PFL_TOTALIENTRAT_TOT4 = 7;
  private static int PFL_TOTALIENTRAT_TOT5 = 8;
  private static int PFL_TOTALIENTRAT_ETICHETLABE1 = 9;
  private static int PFL_TOTALIENTRAT_PROGRESSIVO1 = 10;
  private static int PFL_TOTALIENTRAT_TIPO1 = 11;

  private static int PPQRY_PROPOSTEVB1 = 0;


  IDPanel PAN_TOTALIENTRAT;
  private static int PFL_TOTALISPESE_SPESE1 = 0;
  private static int PFL_TOTALISPESE_IMP2E = 1;
  private static int PFL_TOTALISPESE_IMP3E = 2;
  private static int PFL_TOTALISPESE_SPESE = 3;
  private static int PFL_TOTALISPESE_IMP2EN = 4;
  private static int PFL_TOTALISPESE_IMP3EN = 5;
  private static int PFL_TOTALISPESE_TOTALE = 6;
  private static int PFL_TOTALISPESE_TOT2 = 7;
  private static int PFL_TOTALISPESE_TOT3 = 8;
  private static int PFL_TOTALISPESE_ETICHETLABEL = 9;
  private static int PFL_TOTALISPESE_PROGRESSIVO = 10;
  private static int PFL_TOTALISPESE_TIPO = 11;

  private static int PPQRY_PROPOSTEVB3 = 0;


  IDPanel PAN_TOTALISPESE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM9(IMDB);
    //
    //
    Init_PQRY_PARAM108(IMDB);
    Init_PQRY_PARAM108_RS(IMDB);
    Init_PQRY_PROPOSTEVB1(IMDB);
    Init_PQRY_PROPOSTEVB3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAM9, 3);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAM9, "TBL_PARAM9");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM9,IMDBDef7.FLD_PARAM9_NOMEOGGECODI, "NOMEOGGECODI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM9,IMDBDef7.FLD_PARAM9_NOMEOGGECODI,1,10,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM9,IMDBDef7.FLD_PARAM9_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM9,IMDBDef7.FLD_PARAM9_NOMEOGGEDESC,5,250,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAM9,IMDBDef7.FLD_PARAM9_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAM9,IMDBDef7.FLD_PARAM9_NOMEOGGETIPO,1,2,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAM9, 0);
  }

  private static void Init_PQRY_PARAM108(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAM108, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAM108, "PQRY_PARAM108");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM108,IMDBDef17.PQSL_PARAM108_NOMEOGGECODI, "NOMEOGGECODI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM108,IMDBDef17.PQSL_PARAM108_NOMEOGGECODI,1,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM108,IMDBDef17.PQSL_PARAM108_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM108,IMDBDef17.PQSL_PARAM108_NOMEOGGEDESC,5,250,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAM108, 0);
  }

  private static void Init_PQRY_PARAM108_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAM108_RS, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAM108_RS, "PQRY_PARAM108_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM108_RS,IMDBDef17.PQSL_PARAM108_NOMEOGGECODI, "NOMEOGGECODI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM108_RS,IMDBDef17.PQSL_PARAM108_NOMEOGGECODI,1,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAM108_RS,IMDBDef17.PQSL_PARAM108_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAM108_RS,IMDBDef17.PQSL_PARAM108_NOMEOGGEDESC,5,250,0);
  }

  private static void Init_PQRY_PROPOSTEVB1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PROPOSTEVB1, 11);
    IMDB.set_TblCode(IMDBDef17.PQRY_PROPOSTEVB1, "PQRY_PROPOSTEVB1");
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_ENTRATE1, "ENTRATE1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_ENTRATE1,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_IMP2E, "IMP2E");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_IMP2E,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_IMP3E, "IMP3E");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_IMP3E,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_ENTRATE, "ENTRATE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_ENTRATE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_IMP2EN, "IMP2EN");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_IMP2EN,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_IMP3EN, "IMP3EN");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_IMP3EN,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_TOTALE, "TOTALE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_TOTALE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_TOT2, "TOT2");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_TOT2,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_TOT3, "TOT3");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_TOT3,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB1,IMDBDef17.PQSL_PROPOSTEVB1_TIPO,1,1,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PROPOSTEVB1, 0);
  }

  private static void Init_PQRY_PROPOSTEVB3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PROPOSTEVB3, 11);
    IMDB.set_TblCode(IMDBDef17.PQRY_PROPOSTEVB3, "PQRY_PROPOSTEVB3");
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_SPESE1, "SPESE1");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_SPESE1,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_IMP2E, "IMP2E");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_IMP2E,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_IMP3E, "IMP3E");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_IMP3E,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_SPESE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_IMP2EN, "IMP2EN");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_IMP2EN,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_IMP3EN, "IMP3EN");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_IMP3EN,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_TOTALE, "TOTALE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_TOTALE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_TOT2, "TOT2");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_TOT2,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_TOT3, "TOT3");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_TOT3,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PROPOSTEVB3,IMDBDef17.PQSL_PROPOSTEVB3_TIPO,1,1,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PROPOSTEVB3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TotaliProposta(MyWebEntryPoint w, IMDBObj imdb)
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
  public TotaliProposta()
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
    FormIdx = MyGlb.FRM_TOTALIPROPOS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5A5C421C-3BA4-40D2-A14F-8EE056FCD95C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 556;
    DesignHeight = 302;
    set_Caption(new IDVariant("Totali Proposta"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 556;
    Frames[1].Height = 276;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.565217;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 556;
    Frames[2].Height = 156;
    Frames[2].Vertical = true;
    Frames[2].FormFactor = 0.25641;
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[2].ChildFrame1 = Frames[3];
    Frames[3].Width = 556;
    Frames[3].Height = 40;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Param";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 40;
    PAN_PARAM = new IDPanel(w, this, 3, "PAN_PARAM");
    Frames[3].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 556-MyGlb.PAN_OFFS_X, 40-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D7E93AF4-81DB-4ABA-872A-0B60CF70A8CB");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 56, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[2].ChildFrame2 = Frames[4];
    Frames[4].Width = 556;
    Frames[4].Height = 116;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Totali Entrate";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 116;
    PAN_TOTALIENTRAT = new IDPanel(w, this, 4, "PAN_TOTALIENTRAT");
    Frames[4].Content = PAN_TOTALIENTRAT;
    PAN_TOTALIENTRAT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TOTALIENTRAT.VS = MainFrm.VisualStyleList;
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 556-MyGlb.PAN_OFFS_X, 116-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TOTALIENTRAT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "450A4D8E-A2B9-4946-8F91-51901FAE5134");
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1332, 116, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TOTALIENTRAT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TOTALIENTRAT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TOTALIENTRAT.InitStatus = 2;
    PAN_TOTALIENTRAT_Init();
    PAN_TOTALIENTRAT_InitFields();
    PAN_TOTALIENTRAT_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[1].ChildFrame2 = Frames[5];
    Frames[5].Width = 556;
    Frames[5].Height = 120;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "Totali Spese";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 120;
    PAN_TOTALISPESE = new IDPanel(w, this, 5, "PAN_TOTALISPESE");
    Frames[5].Content = PAN_TOTALISPESE;
    PAN_TOTALISPESE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TOTALISPESE.VS = MainFrm.VisualStyleList;
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 556-MyGlb.PAN_OFFS_X, 120-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TOTALISPESE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D14502DB-4DD2-4C8F-8C90-CEFFC39FC407");
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1332, 116, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TOTALISPESE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TOTALISPESE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TOTALISPESE.InitStatus = 2;
    PAN_TOTALISPESE_Init();
    PAN_TOTALISPESE_InitFields();
    PAN_TOTALISPESE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARAM9, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        TOTALIPROPOS_PARAM108();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_TOTALIENTRAT.UpdatePanel(MainFrm);
      PAN_TOTALISPESE.UpdatePanel(MainFrm);
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
    return (obj instanceof TotaliProposta);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TotaliProposta.class.getName() : (Glb.ClassWithPackage(TotaliProposta.class) ? TotaliProposta.class.getName().substring(TotaliProposta.class.getPackage().getName().length() + 1) : TotaliProposta.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void TOTALIPROPOS_PARAM108() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAM108_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAM9, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAM9, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAM108_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAM108_RS, 0, IMDBDef7.TBL_PARAM9, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAM108_RS, 0, 0, IMDBDef7.TBL_PARAM9, IMDBDef7.FLD_PARAM9_NOMEOGGECODI, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAM108_RS, 1, 0, IMDBDef7.TBL_PARAM9, IMDBDef7.FLD_PARAM9_NOMEOGGEDESC, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAM9, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAM9, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAM9, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAM108_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
    // Stub
  }

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
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
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
  private void PAN_TOTALIENTRAT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TOTALIENTRAT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TOTALIENTRAT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TOTALIENTRAT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TOTALIENTRAT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_TOTALIENTRAT);
    // Stub
  }

  private void PAN_TOTALIENTRAT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TOTALIENTRAT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TOTALIENTRAT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TOTALIENTRAT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_TOTALISPESE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TOTALISPESE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TOTALISPESE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TOTALISPESE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TOTALISPESE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_TOTALISPESE);
    // Stub
  }

  private void PAN_TOTALISPESE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TOTALISPESE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TOTALISPESE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TOTALISPESE_IntValidateRow(Cancel);
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
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENTO, "C2977EB1-EFBC-4953-8C05-22CB9649F9CB");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENTO, "Assestamento");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENTO, "Descrivi il contenuto del campo");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, "36B7BF4A-5188-4559-A536-EC986C0B3ED4");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, "Descrizione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENTO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENTO, MyGlb.PANEL_LIST, 48);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENTO, MyGlb.PANEL_LIST, "Assest.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENTO, MyGlb.PANEL_FORM, 8, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENTO, MyGlb.PANEL_FORM, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ASSESTAMENTO, MyGlb.PANEL_FORM, "Assestamento");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ASSESTAMENTO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ASSESTAMENTO, PPQRY_PARAM108, "A.NOMEOGGECODI", "NOMEOGGECODI", 1, 10, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, 112, 164, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, 104);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, 168, 4, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DESCRIZIONE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DESCRIZIONE, PPQRY_PARAM108, "A.NOMEOGGEDESC", "NOMEOGGEDESC", 5, 250, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM108", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM108, IMDBDef17.PQRY_PARAM108_RS, IMDBDef7.TBL_PARAM9);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ASSESTAMENTO, IMDBDef7.FLD_PARAM9_NOMEOGGECODI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DESCRIZIONE, IMDBDef7.FLD_PARAM9_NOMEOGGEDESC);
    PAN_PARAM.SetMasterTable(0, "PARAM9");
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

  private void PAN_TOTALIENTRAT_Init()
  {

    PAN_TOTALIENTRAT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TOTALIENTRAT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TOTALIENTRAT.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_TOTALIENTRAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE1, "1DAEECD0-408A-4B6E-8B38-CB1DD66D5032");
    PAN_TOTALIENTRAT.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE1, "Entrate +");
    PAN_TOTALIENTRAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE1, "");
    PAN_TOTALIENTRAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE1, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALIENTRAT.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIENTRAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2E1, "1093CD88-D6FD-48E5-9066-E02E33BC933F");
    PAN_TOTALIENTRAT.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2E1, "imp2e");
    PAN_TOTALIENTRAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2E1, "");
    PAN_TOTALIENTRAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2E1, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALIENTRAT.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2E1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIENTRAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3E1, "75F3611C-4E3B-481F-9B33-E707D7175FAB");
    PAN_TOTALIENTRAT.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3E1, "imp3e");
    PAN_TOTALIENTRAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3E1, "");
    PAN_TOTALIENTRAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3E1, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALIENTRAT.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3E1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIENTRAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE, "F06F033A-5CDC-4DDA-AFBE-11D37590D72E");
    PAN_TOTALIENTRAT.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE, "Entrate -");
    PAN_TOTALIENTRAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE, "");
    PAN_TOTALIENTRAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALIENTRAT.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIENTRAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2EN1, "B6932DC3-818A-4914-8E30-C82C3B822051");
    PAN_TOTALIENTRAT.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2EN1, "imp2en");
    PAN_TOTALIENTRAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2EN1, "");
    PAN_TOTALIENTRAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2EN1, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALIENTRAT.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2EN1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIENTRAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3EN1, "038DD55B-4432-48C5-9B76-365C1E73A711");
    PAN_TOTALIENTRAT.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3EN1, "imp3en");
    PAN_TOTALIENTRAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3EN1, "");
    PAN_TOTALIENTRAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3EN1, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALIENTRAT.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3EN1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIENTRAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOTALE1, "82E6D11F-B082-4921-8EFA-F92347D35C7B");
    PAN_TOTALIENTRAT.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOTALE1, "Totale");
    PAN_TOTALIENTRAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOTALE1, "");
    PAN_TOTALIENTRAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOTALE1, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALIENTRAT.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOTALE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIENTRAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT4, "FE4C80AE-8E47-4E4A-91CC-48C90CE06AF3");
    PAN_TOTALIENTRAT.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT4, "Tot2");
    PAN_TOTALIENTRAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT4, "");
    PAN_TOTALIENTRAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT4, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALIENTRAT.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIENTRAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT5, "E4CCC55D-3742-4D9B-A587-536CF993C5FF");
    PAN_TOTALIENTRAT.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT5, "Tot3");
    PAN_TOTALIENTRAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT5, "");
    PAN_TOTALIENTRAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT5, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALIENTRAT.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALIENTRAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ETICHETLABE1, "D9AB464A-5216-472D-8318-8C25305C246A");
    PAN_TOTALIENTRAT.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ETICHETLABE1, "SONO PRESENTI PROPOSTE IN ATTESA DI APPROVAZIONE");
    PAN_TOTALIENTRAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ETICHETLABE1, MyGlb.VIS_VUOTOGRASSET);
    PAN_TOTALIENTRAT.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ETICHETLABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TOTALIENTRAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_PROGRESSIVO1, "1275B997-CA72-4C6D-8318-A99C36520FE0");
    PAN_TOTALIENTRAT.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_PROGRESSIVO1, "PROGRESSIVO");
    PAN_TOTALIENTRAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_PROGRESSIVO1, "");
    PAN_TOTALIENTRAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_PROGRESSIVO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_TOTALIENTRAT.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_PROGRESSIVO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_TOTALIENTRAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TIPO1, "9336F2E0-85CE-4258-BD15-D777620CB555");
    PAN_TOTALIENTRAT.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TIPO1, "TIPO");
    PAN_TOTALIENTRAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TIPO1, "");
    PAN_TOTALIENTRAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TIPO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_TOTALIENTRAT.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TIPO1, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_TOTALIENTRAT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE1, MyGlb.PANEL_LIST, 44);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE1, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE1, MyGlb.PANEL_LIST, "Entrate +");
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE1, MyGlb.PANEL_FORM, 44, 4, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE1, MyGlb.PANEL_FORM, 64);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE1, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE1, MyGlb.PANEL_FORM, "Entrate +");
    PAN_TOTALIENTRAT.SetFieldPage(PFL_TOTALIENTRAT_ENTRATE1, -1, -1);
    PAN_TOTALIENTRAT.SetFieldUnbound(PFL_TOTALIENTRAT_ENTRATE1, true);
    PAN_TOTALIENTRAT.SetFieldPanel(PFL_TOTALIENTRAT_ENTRATE1, PPQRY_PROPOSTEVB1, "SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, 0, NVL(A.IMPORTO_1, 0)))", "ENTRATE1", 3, 28, 6, -13997);
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2E1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2E1, MyGlb.PANEL_LIST, 44);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2E1, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2E1, MyGlb.PANEL_LIST, "imp2e");
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2E1, MyGlb.PANEL_FORM, 212, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2E1, MyGlb.PANEL_FORM, 44);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2E1, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2E1, MyGlb.PANEL_FORM, "imp2e");
    PAN_TOTALIENTRAT.SetFieldPage(PFL_TOTALIENTRAT_IMP2E1, -1, -1);
    PAN_TOTALIENTRAT.SetFieldUnbound(PFL_TOTALIENTRAT_IMP2E1, true);
    PAN_TOTALIENTRAT.SetFieldPanel(PFL_TOTALIENTRAT_IMP2E1, PPQRY_PROPOSTEVB1, "SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, 0, NVL(A.IMPORTO_2, 0)))", "IMP2E", 3, 28, 6, -13997);
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3E1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3E1, MyGlb.PANEL_LIST, 44);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3E1, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3E1, MyGlb.PANEL_LIST, "imp3e");
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3E1, MyGlb.PANEL_FORM, 312, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3E1, MyGlb.PANEL_FORM, 44);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3E1, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3E1, MyGlb.PANEL_FORM, "imp3e");
    PAN_TOTALIENTRAT.SetFieldPage(PFL_TOTALIENTRAT_IMP3E1, -1, -1);
    PAN_TOTALIENTRAT.SetFieldUnbound(PFL_TOTALIENTRAT_IMP3E1, true);
    PAN_TOTALIENTRAT.SetFieldPanel(PFL_TOTALIENTRAT_IMP3E1, PPQRY_PROPOSTEVB1, "SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, 0, NVL(A.IMPORTO_3, 0)))", "IMP3E", 3, 28, 6, -13997);
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE, MyGlb.PANEL_LIST, 52);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE, MyGlb.PANEL_LIST, "Entrate -");
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE, MyGlb.PANEL_FORM, 48, 28, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE, MyGlb.PANEL_FORM, 60);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ENTRATE, MyGlb.PANEL_FORM, "Entrate -");
    PAN_TOTALIENTRAT.SetFieldPage(PFL_TOTALIENTRAT_ENTRATE, -1, -1);
    PAN_TOTALIENTRAT.SetFieldUnbound(PFL_TOTALIENTRAT_ENTRATE, true);
    PAN_TOTALIENTRAT.SetFieldPanel(PFL_TOTALIENTRAT_ENTRATE, PPQRY_PROPOSTEVB1, "SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, NVL(A.IMPORTO_1, 0), 0))", "ENTRATE", 3, 28, 6, -13997);
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2EN1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2EN1, MyGlb.PANEL_LIST, 52);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2EN1, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2EN1, MyGlb.PANEL_LIST, "imp2en");
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2EN1, MyGlb.PANEL_FORM, 212, 28, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2EN1, MyGlb.PANEL_FORM, 52);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2EN1, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP2EN1, MyGlb.PANEL_FORM, "imp2en");
    PAN_TOTALIENTRAT.SetFieldPage(PFL_TOTALIENTRAT_IMP2EN1, -1, -1);
    PAN_TOTALIENTRAT.SetFieldUnbound(PFL_TOTALIENTRAT_IMP2EN1, true);
    PAN_TOTALIENTRAT.SetFieldPanel(PFL_TOTALIENTRAT_IMP2EN1, PPQRY_PROPOSTEVB1, "SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, NVL(A.IMPORTO_2, 0), 0))", "IMP2EN", 3, 28, 6, -13997);
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3EN1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3EN1, MyGlb.PANEL_LIST, 52);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3EN1, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3EN1, MyGlb.PANEL_LIST, "imp3en");
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3EN1, MyGlb.PANEL_FORM, 312, 28, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3EN1, MyGlb.PANEL_FORM, 52);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3EN1, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_IMP3EN1, MyGlb.PANEL_FORM, "imp3en");
    PAN_TOTALIENTRAT.SetFieldPage(PFL_TOTALIENTRAT_IMP3EN1, -1, -1);
    PAN_TOTALIENTRAT.SetFieldUnbound(PFL_TOTALIENTRAT_IMP3EN1, true);
    PAN_TOTALIENTRAT.SetFieldPanel(PFL_TOTALIENTRAT_IMP3EN1, PPQRY_PROPOSTEVB1, "SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, NVL(A.IMPORTO_3, 0), 0))", "IMP3EN", 3, 28, 6, -13997);
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOTALE1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOTALE1, MyGlb.PANEL_LIST, 36);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOTALE1, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOTALE1, MyGlb.PANEL_LIST, "Totale");
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOTALE1, MyGlb.PANEL_FORM, 64, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOTALE1, MyGlb.PANEL_FORM, 44);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOTALE1, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOTALE1, MyGlb.PANEL_FORM, "Totale");
    PAN_TOTALIENTRAT.SetFieldPage(PFL_TOTALIENTRAT_TOTALE1, -1, -1);
    PAN_TOTALIENTRAT.SetFieldUnbound(PFL_TOTALIENTRAT_TOTALE1, true);
    PAN_TOTALIENTRAT.SetFieldPanel(PFL_TOTALIENTRAT_TOTALE1, PPQRY_PROPOSTEVB1, "SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, 0, NVL(A.IMPORTO_1, 0))) + SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, NVL(A.IMPORTO_1, 0), 0))", "TOTALE", 3, 28, 6, -13997);
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT4, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT4, MyGlb.PANEL_LIST, 36);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT4, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT4, MyGlb.PANEL_LIST, "Tot2");
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT4, MyGlb.PANEL_FORM, 212, 52, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT4, MyGlb.PANEL_FORM, 36);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT4, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT4, MyGlb.PANEL_FORM, "Tot2");
    PAN_TOTALIENTRAT.SetFieldPage(PFL_TOTALIENTRAT_TOT4, -1, -1);
    PAN_TOTALIENTRAT.SetFieldUnbound(PFL_TOTALIENTRAT_TOT4, true);
    PAN_TOTALIENTRAT.SetFieldPanel(PFL_TOTALIENTRAT_TOT4, PPQRY_PROPOSTEVB1, "SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, 0, NVL(A.IMPORTO_2, 0))) + SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, NVL(A.IMPORTO_2, 0), 0))", "TOT2", 3, 28, 6, -13997);
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT5, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT5, MyGlb.PANEL_LIST, 36);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT5, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT5, MyGlb.PANEL_LIST, "Tot3");
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT5, MyGlb.PANEL_FORM, 312, 52, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT5, MyGlb.PANEL_FORM, 36);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT5, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TOT5, MyGlb.PANEL_FORM, "Tot3");
    PAN_TOTALIENTRAT.SetFieldPage(PFL_TOTALIENTRAT_TOT5, -1, -1);
    PAN_TOTALIENTRAT.SetFieldUnbound(PFL_TOTALIENTRAT_TOT5, true);
    PAN_TOTALIENTRAT.SetFieldPanel(PFL_TOTALIENTRAT_TOT5, PPQRY_PROPOSTEVB1, "SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, 0, NVL(A.IMPORTO_3, 0))) + SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, NVL(A.IMPORTO_3, 0), 0))", "TOT3", 3, 28, 6, -13997);
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ETICHETLABE1, MyGlb.PANEL_LIST, 44, 76, 432, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ETICHETLABE1, MyGlb.PANEL_LIST, 0);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ETICHETLABE1, MyGlb.PANEL_LIST, 3);
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ETICHETLABE1, MyGlb.PANEL_FORM, 36, 76, 432, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ETICHETLABE1, MyGlb.PANEL_FORM, 0);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_ETICHETLABE1, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIENTRAT.SetFieldPage(PFL_TOTALIENTRAT_ETICHETLABE1, -1, -1);
    PAN_TOTALIENTRAT.SetFieldPanel(PFL_TOTALIENTRAT_ETICHETLABE1, -1, "", "ETICHETLABE1", 0, 0, 0, -13997);
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_PROGRESSIVO1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_PROGRESSIVO1, MyGlb.PANEL_LIST, 88);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_PROGRESSIVO1, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_PROGRESSIVO1, MyGlb.PANEL_FORM, 88);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_PROGRESSIVO1, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_TOTALIENTRAT.SetFieldPage(PFL_TOTALIENTRAT_PROGRESSIVO1, -1, -1);
    PAN_TOTALIENTRAT.SetFieldPanel(PFL_TOTALIENTRAT_PROGRESSIVO1, PPQRY_PROPOSTEVB1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TIPO1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TIPO1, MyGlb.PANEL_LIST, 36);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TIPO1, MyGlb.PANEL_LIST, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TIPO1, MyGlb.PANEL_LIST, "TIPO");
    PAN_TOTALIENTRAT.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TIPO1, MyGlb.PANEL_FORM, 4, 100, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALIENTRAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TIPO1, MyGlb.PANEL_FORM, 36);
    PAN_TOTALIENTRAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TIPO1, MyGlb.PANEL_FORM, 1);
    PAN_TOTALIENTRAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALIENTRAT_TIPO1, MyGlb.PANEL_FORM, "TIPO");
    PAN_TOTALIENTRAT.SetFieldPage(PFL_TOTALIENTRAT_TIPO1, -1, -1);
    PAN_TOTALIENTRAT.SetFieldPanel(PFL_TOTALIENTRAT_TIPO1, PPQRY_PROPOSTEVB1, "A.TIPO", "TIPO", 1, 1, 0, -13997);
  }

  private void PAN_TOTALIENTRAT_InitQueries()
  {
    StringBuffer SQL;

    PAN_TOTALIENTRAT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TOTALIENTRAT.SetIMDB(IMDB, "PQRY_PROPOSTEVB1", true);
    PAN_TOTALIENTRAT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, 0, NVL(A.IMPORTO_1, 0))) as ENTRATE1, ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, 0, NVL(A.IMPORTO_2, 0))) as IMP2E, ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, 0, NVL(A.IMPORTO_3, 0))) as IMP3E, ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, NVL(A.IMPORTO_1, 0), 0)) as ENTRATE, ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, NVL(A.IMPORTO_2, 0), 0)) as IMP2EN, ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, NVL(A.IMPORTO_3, 0), 0)) as IMP3EN, ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, 0, NVL(A.IMPORTO_1, 0))) + SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, NVL(A.IMPORTO_1, 0), 0)) as TOTALE, ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, 0, NVL(A.IMPORTO_2, 0))) + SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, NVL(A.IMPORTO_2, 0), 0)) as TOT2, ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, 0, NVL(A.IMPORTO_3, 0))) + SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, NVL(A.IMPORTO_3, 0), 0)) as TOT3, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.TIPO as TIPO ");
    PAN_TOTALIENTRAT.SetQuery(PPQRY_PROPOSTEVB1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PROPOSTE_VB A ");
    PAN_TOTALIENTRAT.SetQuery(PPQRY_PROPOSTEVB1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ASSESTAMENTO = ~~TBL_PARAM9.NOMEOGGECODI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO = ~~TBL_PARAM9.NOMEOGGETIPO~~) ");
    SQL.append("and   (A.STATO = 'A') ");
    PAN_TOTALIENTRAT.SetQuery(PPQRY_PROPOSTEVB1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.PROGRESSIVO, ");
    SQL.append("  A.TIPO ");
    PAN_TOTALIENTRAT.SetQuery(PPQRY_PROPOSTEVB1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TOTALIENTRAT.SetQuery(PPQRY_PROPOSTEVB1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TOTALIENTRAT.SetQuery(PPQRY_PROPOSTEVB1, 5, SQL, -1, "");
    PAN_TOTALIENTRAT.SetQueryDB(PPQRY_PROPOSTEVB1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TOTALIENTRAT.SetMasterTable(0, "PROPOSTE_VB");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TOTALIENTRAT.Status() == 2)
    {
      int oldListQBE = PAN_TOTALIENTRAT.iUseListQBE;
      PAN_TOTALIENTRAT.iUseListQBE = 0;
      PAN_TOTALIENTRAT.PanelCommand(Glb.PCM_SEARCH);
      PAN_TOTALIENTRAT.PanelCommand(Glb.PCM_FIND);
      PAN_TOTALIENTRAT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_TOTALISPESE_Init()
  {

    PAN_TOTALISPESE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TOTALISPESE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TOTALISPESE.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_TOTALISPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE1, "F4F52812-858C-426C-A4AF-B5F0FE1020A0");
    PAN_TOTALISPESE.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE1, "Spese +");
    PAN_TOTALISPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE1, "");
    PAN_TOTALISPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE1, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALISPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALISPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2E, "3E2AD428-9C88-4BA3-8B82-DCC56BDDA1EF");
    PAN_TOTALISPESE.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2E, "imp2e");
    PAN_TOTALISPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2E, "");
    PAN_TOTALISPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2E, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALISPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2E, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALISPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3E, "489012DC-A464-494B-BAD3-A289E008C2F3");
    PAN_TOTALISPESE.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3E, "imp3e");
    PAN_TOTALISPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3E, "");
    PAN_TOTALISPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3E, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALISPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3E, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALISPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE, "AD23C9BA-004C-4529-90C3-E2091C1884D2");
    PAN_TOTALISPESE.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE, "Spese -");
    PAN_TOTALISPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE, "");
    PAN_TOTALISPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALISPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALISPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2EN, "6B227BAA-B928-4891-9699-53B21B6FA293");
    PAN_TOTALISPESE.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2EN, "imp2en");
    PAN_TOTALISPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2EN, "");
    PAN_TOTALISPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2EN, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALISPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2EN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALISPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3EN, "C0D63077-A0AE-4C65-B525-CFF6FC9EB95D");
    PAN_TOTALISPESE.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3EN, "imp3en");
    PAN_TOTALISPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3EN, "");
    PAN_TOTALISPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3EN, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALISPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3EN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALISPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOTALE, "9AF37911-E55B-4BA8-8DF3-1EB586DF3FCA");
    PAN_TOTALISPESE.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOTALE, "Totale");
    PAN_TOTALISPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOTALE, "");
    PAN_TOTALISPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOTALE, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALISPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALISPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT2, "E40638E2-B864-4423-BDE1-C804FF4D4DB9");
    PAN_TOTALISPESE.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT2, "Tot2");
    PAN_TOTALISPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT2, "");
    PAN_TOTALISPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT2, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALISPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALISPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT3, "58A2F2A7-0938-44B7-AECD-5175A74FAC10");
    PAN_TOTALISPESE.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT3, "Tot3");
    PAN_TOTALISPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT3, "");
    PAN_TOTALISPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT3, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTALISPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_TOTALISPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_ETICHETLABEL, "C9015678-CAC6-44BA-94F1-0FBD3B1CA2ED");
    PAN_TOTALISPESE.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_ETICHETLABEL, "SONO PRESENTI PROPOSTE IN ATTESA DI APPROVAZIONE");
    PAN_TOTALISPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_ETICHETLABEL, MyGlb.VIS_VUOTOGRASSET);
    PAN_TOTALISPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_ETICHETLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_TOTALISPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_PROGRESSIVO, "3D4907A2-BAC8-4132-BC5C-6D4F867F7C99");
    PAN_TOTALISPESE.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_PROGRESSIVO, "PROGRESSIVO");
    PAN_TOTALISPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_PROGRESSIVO, "");
    PAN_TOTALISPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_TOTALISPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_TOTALISPESE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TIPO, "CF88F1D5-88D2-40D4-970D-5ADC663D3FC6");
    PAN_TOTALISPESE.set_Header(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TIPO, "TIPO");
    PAN_TOTALISPESE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TIPO, "");
    PAN_TOTALISPESE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TIPO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_TOTALISPESE.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TIPO, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_TOTALISPESE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE1, MyGlb.PANEL_LIST, 44);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE1, MyGlb.PANEL_LIST, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE1, MyGlb.PANEL_LIST, "Spese +");
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE1, MyGlb.PANEL_FORM, 44, 4, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE1, MyGlb.PANEL_FORM, 64);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE1, MyGlb.PANEL_FORM, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE1, MyGlb.PANEL_FORM, "Spese +");
    PAN_TOTALISPESE.SetFieldPage(PFL_TOTALISPESE_SPESE1, -1, -1);
    PAN_TOTALISPESE.SetFieldUnbound(PFL_TOTALISPESE_SPESE1, true);
    PAN_TOTALISPESE.SetFieldPanel(PFL_TOTALISPESE_SPESE1, PPQRY_PROPOSTEVB3, "SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, 0, NVL(A.IMPORTO_1, 0)))", "SPESE1", 3, 28, 6, -13997);
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2E, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2E, MyGlb.PANEL_LIST, 44);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2E, MyGlb.PANEL_LIST, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2E, MyGlb.PANEL_LIST, "imp2e");
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2E, MyGlb.PANEL_FORM, 212, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2E, MyGlb.PANEL_FORM, 44);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2E, MyGlb.PANEL_FORM, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2E, MyGlb.PANEL_FORM, "imp2e");
    PAN_TOTALISPESE.SetFieldPage(PFL_TOTALISPESE_IMP2E, -1, -1);
    PAN_TOTALISPESE.SetFieldUnbound(PFL_TOTALISPESE_IMP2E, true);
    PAN_TOTALISPESE.SetFieldPanel(PFL_TOTALISPESE_IMP2E, PPQRY_PROPOSTEVB3, "SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, 0, NVL(A.IMPORTO_2, 0)))", "IMP2E", 3, 28, 6, -13997);
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3E, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3E, MyGlb.PANEL_LIST, 44);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3E, MyGlb.PANEL_LIST, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3E, MyGlb.PANEL_LIST, "imp3e");
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3E, MyGlb.PANEL_FORM, 312, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3E, MyGlb.PANEL_FORM, 44);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3E, MyGlb.PANEL_FORM, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3E, MyGlb.PANEL_FORM, "imp3e");
    PAN_TOTALISPESE.SetFieldPage(PFL_TOTALISPESE_IMP3E, -1, -1);
    PAN_TOTALISPESE.SetFieldUnbound(PFL_TOTALISPESE_IMP3E, true);
    PAN_TOTALISPESE.SetFieldPanel(PFL_TOTALISPESE_IMP3E, PPQRY_PROPOSTEVB3, "SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, 0, NVL(A.IMPORTO_3, 0)))", "IMP3E", 3, 28, 6, -13997);
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE, MyGlb.PANEL_LIST, 52);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE, MyGlb.PANEL_LIST, "Spese -");
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE, MyGlb.PANEL_FORM, 48, 28, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE, MyGlb.PANEL_FORM, 60);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_SPESE, MyGlb.PANEL_FORM, "Spese -");
    PAN_TOTALISPESE.SetFieldPage(PFL_TOTALISPESE_SPESE, -1, -1);
    PAN_TOTALISPESE.SetFieldUnbound(PFL_TOTALISPESE_SPESE, true);
    PAN_TOTALISPESE.SetFieldPanel(PFL_TOTALISPESE_SPESE, PPQRY_PROPOSTEVB3, "ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, NVL(A.IMPORTO_1, 0), 0)))", "SPESE", 3, 28, 6, -13997);
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2EN, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2EN, MyGlb.PANEL_LIST, 52);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2EN, MyGlb.PANEL_LIST, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2EN, MyGlb.PANEL_LIST, "imp2en");
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2EN, MyGlb.PANEL_FORM, 212, 28, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2EN, MyGlb.PANEL_FORM, 52);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2EN, MyGlb.PANEL_FORM, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP2EN, MyGlb.PANEL_FORM, "imp2en");
    PAN_TOTALISPESE.SetFieldPage(PFL_TOTALISPESE_IMP2EN, -1, -1);
    PAN_TOTALISPESE.SetFieldUnbound(PFL_TOTALISPESE_IMP2EN, true);
    PAN_TOTALISPESE.SetFieldPanel(PFL_TOTALISPESE_IMP2EN, PPQRY_PROPOSTEVB3, "ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, NVL(A.IMPORTO_2, 0), 0)))", "IMP2EN", 3, 28, 6, -13997);
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3EN, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3EN, MyGlb.PANEL_LIST, 52);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3EN, MyGlb.PANEL_LIST, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3EN, MyGlb.PANEL_LIST, "imp3en");
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3EN, MyGlb.PANEL_FORM, 312, 28, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3EN, MyGlb.PANEL_FORM, 52);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3EN, MyGlb.PANEL_FORM, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_IMP3EN, MyGlb.PANEL_FORM, "imp3en");
    PAN_TOTALISPESE.SetFieldPage(PFL_TOTALISPESE_IMP3EN, -1, -1);
    PAN_TOTALISPESE.SetFieldUnbound(PFL_TOTALISPESE_IMP3EN, true);
    PAN_TOTALISPESE.SetFieldPanel(PFL_TOTALISPESE_IMP3EN, PPQRY_PROPOSTEVB3, "ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, NVL(A.IMPORTO_3, 0), 0)))", "IMP3EN", 3, 28, 6, -13997);
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOTALE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOTALE, MyGlb.PANEL_LIST, 36);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOTALE, MyGlb.PANEL_LIST, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOTALE, MyGlb.PANEL_LIST, "Totale");
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOTALE, MyGlb.PANEL_FORM, 64, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOTALE, MyGlb.PANEL_FORM, 44);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOTALE, MyGlb.PANEL_FORM, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOTALE, MyGlb.PANEL_FORM, "Totale");
    PAN_TOTALISPESE.SetFieldPage(PFL_TOTALISPESE_TOTALE, -1, -1);
    PAN_TOTALISPESE.SetFieldUnbound(PFL_TOTALISPESE_TOTALE, true);
    PAN_TOTALISPESE.SetFieldPanel(PFL_TOTALISPESE_TOTALE, PPQRY_PROPOSTEVB3, "SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, 0, NVL(A.IMPORTO_1, 0))) + ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, NVL(A.IMPORTO_1, 0), 0)))", "TOTALE", 3, 28, 6, -13997);
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT2, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT2, MyGlb.PANEL_LIST, 36);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT2, MyGlb.PANEL_LIST, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT2, MyGlb.PANEL_LIST, "Tot2");
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT2, MyGlb.PANEL_FORM, 212, 52, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT2, MyGlb.PANEL_FORM, 36);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT2, MyGlb.PANEL_FORM, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT2, MyGlb.PANEL_FORM, "Tot2");
    PAN_TOTALISPESE.SetFieldPage(PFL_TOTALISPESE_TOT2, -1, -1);
    PAN_TOTALISPESE.SetFieldUnbound(PFL_TOTALISPESE_TOT2, true);
    PAN_TOTALISPESE.SetFieldPanel(PFL_TOTALISPESE_TOT2, PPQRY_PROPOSTEVB3, "SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, 0, NVL(A.IMPORTO_2, 0))) + ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, NVL(A.IMPORTO_2, 0), 0)))", "TOT2", 3, 28, 6, -13997);
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT3, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT3, MyGlb.PANEL_LIST, 36);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT3, MyGlb.PANEL_LIST, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT3, MyGlb.PANEL_LIST, "Tot3");
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT3, MyGlb.PANEL_FORM, 312, 52, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT3, MyGlb.PANEL_FORM, 36);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT3, MyGlb.PANEL_FORM, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TOT3, MyGlb.PANEL_FORM, "Tot3");
    PAN_TOTALISPESE.SetFieldPage(PFL_TOTALISPESE_TOT3, -1, -1);
    PAN_TOTALISPESE.SetFieldUnbound(PFL_TOTALISPESE_TOT3, true);
    PAN_TOTALISPESE.SetFieldPanel(PFL_TOTALISPESE_TOT3, PPQRY_PROPOSTEVB3, "SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, 0, NVL(A.IMPORTO_3, 0))) + ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, NVL(A.IMPORTO_3, 0), 0)))", "TOT3", 3, 28, 6, -13997);
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_ETICHETLABEL, MyGlb.PANEL_LIST, 44, 76, 432, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_ETICHETLABEL, MyGlb.PANEL_LIST, 0);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_ETICHETLABEL, MyGlb.PANEL_LIST, 3);
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_ETICHETLABEL, MyGlb.PANEL_FORM, 36, 76, 432, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_ETICHETLABEL, MyGlb.PANEL_FORM, 0);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_ETICHETLABEL, MyGlb.PANEL_FORM, 1);
    PAN_TOTALISPESE.SetFieldPage(PFL_TOTALISPESE_ETICHETLABEL, -1, -1);
    PAN_TOTALISPESE.SetFieldPanel(PFL_TOTALISPESE_ETICHETLABEL, -1, "", "ETICHETLABEL", 0, 0, 0, -13997);
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_TOTALISPESE.SetFieldPage(PFL_TOTALISPESE_PROGRESSIVO, -1, -1);
    PAN_TOTALISPESE.SetFieldPanel(PFL_TOTALISPESE_PROGRESSIVO, PPQRY_PROPOSTEVB3, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TIPO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TIPO, MyGlb.PANEL_LIST, 36);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_TOTALISPESE.SetRect(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TIPO, MyGlb.PANEL_FORM, 4, 100, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTALISPESE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TIPO, MyGlb.PANEL_FORM, 36);
    PAN_TOTALISPESE.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_TOTALISPESE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTALISPESE_TIPO, MyGlb.PANEL_FORM, "TIPO");
    PAN_TOTALISPESE.SetFieldPage(PFL_TOTALISPESE_TIPO, -1, -1);
    PAN_TOTALISPESE.SetFieldPanel(PFL_TOTALISPESE_TIPO, PPQRY_PROPOSTEVB3, "A.TIPO", "TIPO", 1, 1, 0, -13997);
  }

  private void PAN_TOTALISPESE_InitQueries()
  {
    StringBuffer SQL;

    PAN_TOTALISPESE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TOTALISPESE.SetIMDB(IMDB, "PQRY_PROPOSTEVB3", true);
    PAN_TOTALISPESE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, 0, NVL(A.IMPORTO_1, 0))) as SPESE1, ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, 0, NVL(A.IMPORTO_2, 0))) as IMP2E, ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, 0, NVL(A.IMPORTO_3, 0))) as IMP3E, ");
    SQL.append("  ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, NVL(A.IMPORTO_1, 0), 0))) as SPESE, ");
    SQL.append("  ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, NVL(A.IMPORTO_2, 0), 0))) as IMP2EN, ");
    SQL.append("  ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, NVL(A.IMPORTO_3, 0), 0))) as IMP3EN, ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, 0, NVL(A.IMPORTO_1, 0))) + ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_1, 0)), -1, NVL(A.IMPORTO_1, 0), 0))) as TOTALE, ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, 0, NVL(A.IMPORTO_2, 0))) + ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_2, 0)), -1, NVL(A.IMPORTO_2, 0), 0))) as TOT2, ");
    SQL.append("  SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, 0, NVL(A.IMPORTO_3, 0))) + ABS(SUM(DECODE(SIGN(NVL(A.IMPORTO_3, 0)), -1, NVL(A.IMPORTO_3, 0), 0))) as TOT3, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.TIPO as TIPO ");
    PAN_TOTALISPESE.SetQuery(PPQRY_PROPOSTEVB3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PROPOSTE_VB A ");
    PAN_TOTALISPESE.SetQuery(PPQRY_PROPOSTEVB3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ASSESTAMENTO = ~~TBL_PARAM9.NOMEOGGECODI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO = ~~TBL_PARAM9.NOMEOGGETIPO~~) ");
    SQL.append("and   (A.STATO = 'A') ");
    PAN_TOTALISPESE.SetQuery(PPQRY_PROPOSTEVB3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.PROGRESSIVO, ");
    SQL.append("  A.TIPO ");
    PAN_TOTALISPESE.SetQuery(PPQRY_PROPOSTEVB3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TOTALISPESE.SetQuery(PPQRY_PROPOSTEVB3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TOTALISPESE.SetQuery(PPQRY_PROPOSTEVB3, 5, SQL, -1, "");
    PAN_TOTALISPESE.SetQueryDB(PPQRY_PROPOSTEVB3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TOTALISPESE.SetMasterTable(0, "PROPOSTE_VB");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TOTALISPESE.Status() == 2)
    {
      int oldListQBE = PAN_TOTALISPESE.iUseListQBE;
      PAN_TOTALISPESE.iUseListQBE = 0;
      PAN_TOTALISPESE.PanelCommand(Glb.PCM_SEARCH);
      PAN_TOTALISPESE.PanelCommand(Glb.PCM_FIND);
      PAN_TOTALISPESE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_TOTALIENTRAT) PAN_TOTALIENTRAT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_TOTALISPESE) PAN_TOTALISPESE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_TOTALIENTRAT) PAN_TOTALIENTRAT_ValidateRow(Cancel);
    if (SrcObj == PAN_TOTALISPESE) PAN_TOTALISPESE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_TOTALIENTRAT) PAN_TOTALIENTRAT_DynamicProperties();
    if (SrcObj == PAN_TOTALISPESE) PAN_TOTALISPESE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_TOTALIENTRAT) PAN_TOTALIENTRAT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_TOTALISPESE) PAN_TOTALISPESE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_TOTALIENTRAT) PAN_TOTALIENTRAT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_TOTALISPESE) PAN_TOTALISPESE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
