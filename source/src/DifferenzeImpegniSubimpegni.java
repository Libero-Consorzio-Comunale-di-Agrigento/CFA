// **********************************************
// Differenze Impegni Subimpegni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DifferenzeImpegniSubimpegni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTRO_PERIODORIACC = 0;
  private static int PFL_FILTRO_ESERCIZIO = 1;
  private static int PFL_FILTRO_TIPOCONTROLL = 2;

  private static int PPQRY_PARAMEFILTR1 = 0;

  private static int PPQRY_PERIODRIACCE = 1;


  IDPanel PAN_FILTRO;
  private static int PFL_NOTEFUNZIONA_MODULO = 0;
  private static int PFL_NOTEFUNZIONA_PAGINA = 1;
  private static int PFL_NOTEFUNZIONA_FUNZIONE = 2;
  private static int PFL_NOTEFUNZIONA_DESCRIZIONE = 3;

  private static int PPQRY_NOTEFUNZIO13 = 0;


  IDPanel PAN_NOTEFUNZIONA;
  private static int PFL_DIFIMPSUBDET_NUMEROIMPAC1 = 0;
  private static int PFL_DIFIMPSUBDET_ANNOIMPACC1 = 1;
  private static int PFL_DIFIMPSUBDET_DESCRIZIONE1 = 2;
  private static int PFL_DIFIMPSUBDET_ANNOESIGIBIL = 3;
  private static int PFL_DIFIMPSUBDET_ANNOENTRATA = 4;
  private static int PFL_DIFIMPSUBDET_TIPOVAR = 5;
  private static int PFL_DIFIMPSUBDET_TIPOAVANZO = 6;
  private static int PFL_DIFIMPSUBDET_FINANZIOPERA = 7;
  private static int PFL_DIFIMPSUBDET_TOTIMP1 = 8;
  private static int PFL_DIFIMPSUBDET_TOTSUBIMP1 = 9;
  private static int PFL_DIFIMPSUBDET_TOTIMPUFF1 = 10;
  private static int PFL_DIFIMPSUBDET_TOTSUBIMPUF1 = 11;

  private static int PPQRY_CONTRORIACC1 = 0;

  private static int PPQRY_T55 = 1;
  private static int PPQRY_TIPIAVANZO = 2;
  private static int PPQRY_IMPFIN = 3;


  IDPanel PAN_DIFIMPSUBDET;
  private static int PFL_DIFIMPSUBTOT_NUMEROIMPACC = 0;
  private static int PFL_DIFIMPSUBTOT_ANNOIMPACC = 1;
  private static int PFL_DIFIMPSUBTOT_DESCRIZIONE2 = 2;
  private static int PFL_DIFIMPSUBTOT_TOTIMP = 3;
  private static int PFL_DIFIMPSUBTOT_TOTSUBIMP = 4;
  private static int PFL_DIFIMPSUBTOT_TOTIMPUFF = 5;
  private static int PFL_DIFIMPSUBTOT_TOTSUBIMPUFF = 6;

  private static int PPQRY_CONTRORIACCE = 0;


  IDPanel PAN_DIFIMPSUBTOT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMEFILTR3(IMDB);
    //
    //
    Init_PQRY_CONTRORIACC1(IMDB);
    Init_PQRY_CONTRORIACCE(IMDB);
    Init_PQRY_PARAMEFILTR1(IMDB);
    Init_PQRY_PARAMEFILTR1_RS(IMDB);
    Init_PQRY_NOTEFUNZIO13(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMEFILTR3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMEFILTR3, 3);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMEFILTR3, "TBL_PARAMEFILTR3");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMEFILTR3,IMDBDef5.FLD_PARAMEFILTR3_NOMOGGTIPCON, "NOMOGGTIPCON");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMEFILTR3,IMDBDef5.FLD_PARAMEFILTR3_NOMOGGTIPCON,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMEFILTR3,IMDBDef5.FLD_PARAMEFILTR3_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMEFILTR3,IMDBDef5.FLD_PARAMEFILTR3_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMEFILTR3,IMDBDef5.FLD_PARAMEFILTR3_NOMOGGPERRIA, "NOMOGGPERRIA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMEFILTR3,IMDBDef5.FLD_PARAMEFILTR3_NOMOGGPERRIA,1,5,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMEFILTR3, 0);
  }

  private static void Init_PQRY_CONTRORIACC1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_CONTRORIACC1, 16);
    IMDB.set_TblCode(IMDBDef14.PQRY_CONTRORIACC1, "PQRY_CONTRORIACC1");
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_PERIODO_RIACC, "PERIODO_RIACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_PERIODO_RIACC,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_TOTIMP, "TOTIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_TOTIMP,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_TOTSUBIMP, "TOTSUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_TOTSUBIMP,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_TOTIMP_UFF, "TOTIMP_UFF");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_TOTIMP_UFF,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_TOTSUBIMP_UFF, "TOTSUBIMP_UFF");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_TOTSUBIMP_UFF,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_VISIBILE_RAG, "VISIBILE_RAG");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_VISIBILE_RAG,12,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_VISIBILE_UFF, "VISIBILE_UFF");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_VISIBILE_UFF,12,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_ANNO_ESIGIBILITA, "ANNO_ESIGIBILITA");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_ANNO_ESIGIBILITA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_ANNO_ENTRATA, "ANNO_ENTRATA");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_ANNO_ENTRATA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_TIPO_AVANZO, "TIPO_AVANZO");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_TIPO_AVANZO,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_FINANZIAMENTO_OPERA, "FINANZIAMENTO_OPERA");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_FINANZIAMENTO_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_RECCONRINUIM, "RECCONRINUIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_RECCONRINUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_RECCONRIANIM, "RECCONRIANIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_RECCONRIANIM,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_RECORIMPDESC, "RECORIMPDESC");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACC1,IMDBDef14.PQSL_CONTRORIACC1_RECORIMPDESC,5,140,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_CONTRORIACC1, 0);
  }

  private static void Init_PQRY_CONTRORIACCE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_CONTRORIACCE, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_CONTRORIACCE, "PQRY_CONTRORIACCE");
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACCE,IMDBDef14.PQSL_CONTRORIACCE_TOTIMP, "TOTIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACCE,IMDBDef14.PQSL_CONTRORIACCE_TOTIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACCE,IMDBDef14.PQSL_CONTRORIACCE_TOTSUBIMP, "TOTSUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACCE,IMDBDef14.PQSL_CONTRORIACCE_TOTSUBIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACCE,IMDBDef14.PQSL_CONTRORIACCE_TOTIMP_UFF, "TOTIMP_UFF");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACCE,IMDBDef14.PQSL_CONTRORIACCE_TOTIMP_UFF,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACCE,IMDBDef14.PQSL_CONTRORIACCE_TOTSUBIMP_UFF, "TOTSUBIMP_UFF");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACCE,IMDBDef14.PQSL_CONTRORIACCE_TOTSUBIMP_UFF,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACCE,IMDBDef14.PQSL_CONTRORIACCE_RECCONRINUIM, "RECCONRINUIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACCE,IMDBDef14.PQSL_CONTRORIACCE_RECCONRINUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACCE,IMDBDef14.PQSL_CONTRORIACCE_RECCONRIANIM, "RECCONRIANIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACCE,IMDBDef14.PQSL_CONTRORIACCE_RECCONRIANIM,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_CONTRORIACCE,IMDBDef14.PQSL_CONTRORIACCE_RECORIMPDESC, "RECORIMPDESC");
    IMDB.SetFldParams(IMDBDef14.PQRY_CONTRORIACCE,IMDBDef14.PQSL_CONTRORIACCE_RECORIMPDESC,5,140,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_CONTRORIACCE, 0);
  }

  private static void Init_PQRY_PARAMEFILTR1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMEFILTR1, 3);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMEFILTR1, "PQRY_PARAMEFILTR1");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMEFILTR1,IMDBDef14.PQSL_PARAMEFILTR1_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMEFILTR1,IMDBDef14.PQSL_PARAMEFILTR1_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMEFILTR1,IMDBDef14.PQSL_PARAMEFILTR1_NOMOGGPERRIA, "NOMOGGPERRIA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMEFILTR1,IMDBDef14.PQSL_PARAMEFILTR1_NOMOGGPERRIA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMEFILTR1,IMDBDef14.PQSL_PARAMEFILTR1_NOMOGGTIPCON, "NOMOGGTIPCON");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMEFILTR1,IMDBDef14.PQSL_PARAMEFILTR1_NOMOGGTIPCON,5,1,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMEFILTR1, 0);
  }

  private static void Init_PQRY_PARAMEFILTR1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMEFILTR1_RS, 3);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMEFILTR1_RS, "PQRY_PARAMEFILTR1_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMEFILTR1_RS,IMDBDef14.PQSL_PARAMEFILTR1_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMEFILTR1_RS,IMDBDef14.PQSL_PARAMEFILTR1_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMEFILTR1_RS,IMDBDef14.PQSL_PARAMEFILTR1_NOMOGGPERRIA, "NOMOGGPERRIA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMEFILTR1_RS,IMDBDef14.PQSL_PARAMEFILTR1_NOMOGGPERRIA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMEFILTR1_RS,IMDBDef14.PQSL_PARAMEFILTR1_NOMOGGTIPCON, "NOMOGGTIPCON");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMEFILTR1_RS,IMDBDef14.PQSL_PARAMEFILTR1_NOMOGGTIPCON,5,1,0);
  }

  private static void Init_PQRY_NOTEFUNZIO13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_NOTEFUNZIO13, 4);
    IMDB.set_TblCode(IMDBDef14.PQRY_NOTEFUNZIO13, "PQRY_NOTEFUNZIO13");
    IMDB.set_FldCode(IMDBDef14.PQRY_NOTEFUNZIO13,IMDBDef14.PQSL_NOTEFUNZIO13_MODULO, "MODULO");
    IMDB.SetFldParams(IMDBDef14.PQRY_NOTEFUNZIO13,IMDBDef14.PQSL_NOTEFUNZIO13_MODULO,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_NOTEFUNZIO13,IMDBDef14.PQSL_NOTEFUNZIO13_PAGINA, "PAGINA");
    IMDB.SetFldParams(IMDBDef14.PQRY_NOTEFUNZIO13,IMDBDef14.PQSL_NOTEFUNZIO13_PAGINA,5,200,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_NOTEFUNZIO13,IMDBDef14.PQSL_NOTEFUNZIO13_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_NOTEFUNZIO13,IMDBDef14.PQSL_NOTEFUNZIO13_FUNZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_NOTEFUNZIO13,IMDBDef14.PQSL_NOTEFUNZIO13_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_NOTEFUNZIO13,IMDBDef14.PQSL_NOTEFUNZIO13_DESCRIZIONE,9,9999,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_NOTEFUNZIO13, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DifferenzeImpegniSubimpegni(MyWebEntryPoint w, IMDBObj imdb)
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
  public DifferenzeImpegniSubimpegni()
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
    FormIdx = MyGlb.FRM_DIFFIMPESUBI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0DCBF5BF-5E22-4E38-896E-5771D96A0814";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1472;
    DesignHeight = 538;
    set_Caption(new IDVariant("Differenze Impegni Subimpegni"));
    //
    Frames = new AFrame[8];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1472;
    Frames[1].Height = 512;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.765625;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1472;
    Frames[2].Height = 392;
    Frames[2].Vertical = true;
    Frames[2].FormFactor = 0.418367;
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[2].ChildFrame1 = Frames[3];
    Frames[3].Width = 1472;
    Frames[3].Height = 164;
    Frames[3].FormFactor = 0.418478;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 616;
    Frames[4].Height = 164;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Filtro";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 164;
    Frames[4].MinHeight = Frames[4].Height;
    Frames[4].MaxHeight = Frames[4].Height;
    PAN_FILTRO = new IDPanel(w, this, 4, "PAN_FILTRO");
    Frames[4].Content = PAN_FILTRO;
    PAN_FILTRO.ShowToolbar = false;
    PAN_FILTRO.ShowStatusbar = false;
    PAN_FILTRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRO.VS = MainFrm.VisualStyleList;
    PAN_FILTRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 616-MyGlb.PAN_OFFS_X, 164-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FAF00D1F-4CE5-4AD7-9172-60572A04BE27");
    PAN_FILTRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRO.InitStatus = 2;
    PAN_FILTRO_Init();
    PAN_FILTRO_InitFields();
    PAN_FILTRO_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[3].ChildFrame2 = Frames[5];
    Frames[5].Width = 856;
    Frames[5].Height = 164;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "NOTE FUNZIONALITA";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 164;
    Frames[5].MinHeight = Frames[5].Height;
    Frames[5].MaxHeight = Frames[5].Height;
    PAN_NOTEFUNZIONA = new IDPanel(w, this, 5, "PAN_NOTEFUNZIONA");
    Frames[5].Content = PAN_NOTEFUNZIONA;
    PAN_NOTEFUNZIONA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTEFUNZIONA.VS = MainFrm.VisualStyleList;
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 856-MyGlb.PAN_OFFS_X, 164-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "760B56DD-3CBE-4E19-81EB-921876D724FA");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTEFUNZIONA.InitStatus = 2;
    PAN_NOTEFUNZIONA_Init();
    PAN_NOTEFUNZIONA_InitFields();
    PAN_NOTEFUNZIONA_InitQueries();
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[2].ChildFrame2 = Frames[6];
    Frames[6].Width = 1472;
    Frames[6].Height = 228;
    Frames[6].Caption = "Differenze Impegni Subimpegni Dettaglio";
    Frames[6].Parent = this;
    Frames[6].FixedHeight = 228;
    PAN_DIFIMPSUBDET = new IDPanel(w, this, 6, "PAN_DIFIMPSUBDET");
    Frames[6].Content = PAN_DIFIMPSUBDET;
    PAN_DIFIMPSUBDET.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DIFIMPSUBDET.VS = MainFrm.VisualStyleList;
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1472-MyGlb.PAN_OFFS_X, 228-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DIFIMPSUBDET.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3B5EC7D2-D2A1-4EF5-937C-4FF0AB58297B");
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1532, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DIFIMPSUBDET.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DIFIMPSUBDET.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DIFIMPSUBDET.InitStatus = 1;
    PAN_DIFIMPSUBDET_Init();
    PAN_DIFIMPSUBDET_InitFields();
    PAN_DIFIMPSUBDET_InitQueries();
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[1].ChildFrame2 = Frames[7];
    Frames[7].Width = 1472;
    Frames[7].Height = 120;
    Frames[7].Caption = "Differenze Impegni Subimpegni Totale";
    Frames[7].Parent = this;
    Frames[7].FixedHeight = 120;
    PAN_DIFIMPSUBTOT = new IDPanel(w, this, 7, "PAN_DIFIMPSUBTOT");
    Frames[7].Content = PAN_DIFIMPSUBTOT;
    PAN_DIFIMPSUBTOT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DIFIMPSUBTOT.VS = MainFrm.VisualStyleList;
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1472-MyGlb.PAN_OFFS_X, 120-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DIFIMPSUBTOT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F49FF93E-41A1-429C-B391-6277E509962B");
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 940, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DIFIMPSUBTOT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DIFIMPSUBTOT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DIFIMPSUBTOT.InitStatus = 1;
    PAN_DIFIMPSUBTOT_Init();
    PAN_DIFIMPSUBTOT_InitFields();
    PAN_DIFIMPSUBTOT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMEFILTR3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DIFFIMPESUBI_PARAMEFILTR1();
      }
      PAN_DIFIMPSUBDET.UpdatePanel(MainFrm);
      PAN_DIFIMPSUBTOT.UpdatePanel(MainFrm);
      PAN_FILTRO.UpdatePanel(MainFrm);
      PAN_NOTEFUNZIONA.UpdatePanel(MainFrm);
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
    return (obj instanceof DifferenzeImpegniSubimpegni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DifferenzeImpegniSubimpegni.class.getName() : (Glb.ClassWithPackage(DifferenzeImpegniSubimpegni.class) ? DifferenzeImpegniSubimpegni.class.getName().substring(DifferenzeImpegniSubimpegni.class.getPackage().getName().length() + 1) : DifferenzeImpegniSubimpegni.class.getName()));
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
      if (IMDB.Value(IMDBDef5.TBL_PARAMEFILTR3, IMDBDef5.FLD_PARAMEFILTR3_NOMOGGTIPCON, 0).equals((new IDVariant("1")), true))
      {
        PAN_DIFIMPSUBDET.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_DIFIMPSUBTOT.set_Visible((new IDVariant(0)).booleanValue());
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
        {
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_DIFIMPSUBDET.set_Visible((new IDVariant(0)).booleanValue());
        PAN_DIFIMPSUBTOT.set_Visible((new IDVariant(-1)).booleanValue());
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
        {
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DifferenzeImpegniSubimpegni", "Load", _e);
    }
  }

  // **********************************************************************
  // Filtro On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FILTRO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtro On Updating Row Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef5.TBL_PARAMEFILTR3, IMDBDef5.FLD_PARAMEFILTR3_NOMOGGTIPCON, 0).equals((new IDVariant("1")), true))
      {
        PAN_DIFIMPSUBDET.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_DIFIMPSUBTOT.set_Visible((new IDVariant(0)).booleanValue());
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
        {
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_DIFIMPSUBDET.set_Visible((new IDVariant(0)).booleanValue());
        PAN_DIFIMPSUBTOT.set_Visible((new IDVariant(-1)).booleanValue());
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
        {
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DifferenzeImpegniSubimpegni", "FiltroOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Filtro On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FILTRO);
      // 
      // Filtro On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef5.TBL_PARAMEFILTR3, IMDBDef5.FLD_PARAMEFILTR3_NOMOGGTIPCON, 0).equals((new IDVariant("1")), true))
      {
        PAN_DIFIMPSUBDET.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_DIFIMPSUBTOT.set_Visible((new IDVariant(0)).booleanValue());
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
        {
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBDET.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_DIFIMPSUBDET.set_Visible((new IDVariant(0)).booleanValue());
        PAN_DIFIMPSUBTOT.set_Visible((new IDVariant(-1)).booleanValue());
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
        {
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DIFIMPSUBTOT.SetFlags (Glb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DifferenzeImpegniSubimpegni", "FiltroOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Parametri Filtro
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void DIFFIMPESUBI_PARAMEFILTR1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMEFILTR1_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMEFILTR3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMEFILTR3, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMEFILTR1_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMEFILTR1_RS, 0, IMDBDef5.TBL_PARAMEFILTR3, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMEFILTR1_RS, 0, 0, IMDBDef5.TBL_PARAMEFILTR3, IMDBDef5.FLD_PARAMEFILTR3_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMEFILTR1_RS, 1, 0, IMDBDef5.TBL_PARAMEFILTR3, IMDBDef5.FLD_PARAMEFILTR3_NOMOGGPERRIA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMEFILTR1_RS, 2, 0, IMDBDef5.TBL_PARAMEFILTR3, IMDBDef5.FLD_PARAMEFILTR3_NOMOGGTIPCON, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMEFILTR3, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMEFILTR3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMEFILTR3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMEFILTR1_RS, 0);
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
  private void PAN_FILTRO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILTRO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILTRO, Cancel);
    // Stub
  }

  private void PAN_FILTRO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FILTRO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FILTRO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTRO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTEFUNZIONA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTEFUNZIONA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NOTEFUNZIONA);
    // Stub
  }

  private void PAN_NOTEFUNZIONA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NOTEFUNZIONA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTEFUNZIONA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTEFUNZIONA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DIFIMPSUBDET_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DIFIMPSUBDET, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DIFIMPSUBDET_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DIFIMPSUBDET, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DIFIMPSUBDET_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DIFIMPSUBDET);
    // Stub
  }

  private void PAN_DIFIMPSUBDET_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DIFIMPSUBDET_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DIFIMPSUBDET_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DIFIMPSUBDET_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DIFIMPSUBTOT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DIFIMPSUBTOT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DIFIMPSUBTOT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DIFIMPSUBTOT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DIFIMPSUBTOT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DIFIMPSUBTOT);
    // Stub
  }

  private void PAN_DIFIMPSUBTOT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DIFIMPSUBTOT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DIFIMPSUBTOT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DIFIMPSUBTOT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DIFIMPSUBDET_Init()
  {

    PAN_DIFIMPSUBDET.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DIFIMPSUBDET.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DIFIMPSUBDET.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_DIFIMPSUBDET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_NUMEROIMPAC1, "B0BC4E3E-8339-4185-973D-08B21325438A");
    PAN_DIFIMPSUBDET.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_NUMEROIMPAC1, "Numero Imp.");
    PAN_DIFIMPSUBDET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_NUMEROIMPAC1, "");
    PAN_DIFIMPSUBDET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_NUMEROIMPAC1, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFIMPSUBDET.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_NUMEROIMPAC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBDET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOIMPACC1, "16BB1D23-BD02-449F-92BC-2B0D195CEA07");
    PAN_DIFIMPSUBDET.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOIMPACC1, "Anno Imp.");
    PAN_DIFIMPSUBDET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOIMPACC1, "");
    PAN_DIFIMPSUBDET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOIMPACC1, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFIMPSUBDET.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOIMPACC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBDET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_DESCRIZIONE1, "0AF3C0BE-CCBD-44EA-B728-BAC612D4E36C");
    PAN_DIFIMPSUBDET.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_DESCRIZIONE1, "Impegno Descrizione");
    PAN_DIFIMPSUBDET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_DESCRIZIONE1, "");
    PAN_DIFIMPSUBDET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFIMPSUBDET.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_DIFIMPSUBDET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOESIGIBIL, "01017F42-A369-4ABB-BF97-76E31A7A45CF");
    PAN_DIFIMPSUBDET.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOESIGIBIL, "Anno Esigibilità");
    PAN_DIFIMPSUBDET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOESIGIBIL, "");
    PAN_DIFIMPSUBDET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFIMPSUBDET.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOESIGIBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBDET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOENTRATA, "E3230D80-CD3F-4F08-80A4-2720C1CB4EF3");
    PAN_DIFIMPSUBDET.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOENTRATA, "Anno Entrata");
    PAN_DIFIMPSUBDET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOENTRATA, "");
    PAN_DIFIMPSUBDET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOENTRATA, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFIMPSUBDET.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOENTRATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBDET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOVAR, "B3CFE8B1-6F83-4498-A545-4169D40E3370");
    PAN_DIFIMPSUBDET.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOVAR, "Tipo Var.");
    PAN_DIFIMPSUBDET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOVAR, "");
    PAN_DIFIMPSUBDET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFIMPSUBDET.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBDET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOAVANZO, "A2231B28-CA37-4865-AFF2-92DD4F213E60");
    PAN_DIFIMPSUBDET.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOAVANZO, "Tipo Avanzo");
    PAN_DIFIMPSUBDET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOAVANZO, "");
    PAN_DIFIMPSUBDET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFIMPSUBDET.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOAVANZO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBDET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_FINANZIOPERA, "29B3B92A-9506-45B3-9850-9C112B932631");
    PAN_DIFIMPSUBDET.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_FINANZIOPERA, "Finanziamento");
    PAN_DIFIMPSUBDET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_FINANZIOPERA, "");
    PAN_DIFIMPSUBDET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_FINANZIOPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFIMPSUBDET.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_FINANZIOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBDET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, "6693B207-CDEB-4FE8-8EC0-AA730AFF8DAC");
    PAN_DIFIMPSUBDET.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, "Proposte Impegno");
    PAN_DIFIMPSUBDET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, "");
    PAN_DIFIMPSUBDET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DIFIMPSUBDET.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBDET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, "83E18B8B-B8AE-47F0-8A33-8EAEF50C7FDA");
    PAN_DIFIMPSUBDET.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, "Proposte Subimpegno");
    PAN_DIFIMPSUBDET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, "");
    PAN_DIFIMPSUBDET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DIFIMPSUBDET.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBDET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, "FE15AA5F-5645-44C9-BDE3-F24C016F79B6");
    PAN_DIFIMPSUBDET.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, "Proposte Impegno");
    PAN_DIFIMPSUBDET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, "");
    PAN_DIFIMPSUBDET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DIFIMPSUBDET.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBDET.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, "A10118F0-731F-4032-8752-CA7FF0DEC4BE");
    PAN_DIFIMPSUBDET.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, "Proposte Subimpegno");
    PAN_DIFIMPSUBDET.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, "");
    PAN_DIFIMPSUBDET.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, MyGlb.VIS_NORFIECF4IMP);
    PAN_DIFIMPSUBDET.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DIFIMPSUBDET_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_NUMEROIMPAC1, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_NUMEROIMPAC1, MyGlb.PANEL_LIST, 104);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_NUMEROIMPAC1, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_NUMEROIMPAC1, MyGlb.PANEL_LIST, "Numero Imp.");
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_NUMEROIMPAC1, MyGlb.PANEL_FORM, 4, 4, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_NUMEROIMPAC1, MyGlb.PANEL_FORM, 104);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_NUMEROIMPAC1, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_NUMEROIMPAC1, MyGlb.PANEL_FORM, "Numero Imp.");
    PAN_DIFIMPSUBDET.SetFieldPage(PFL_DIFIMPSUBDET_NUMEROIMPAC1, -1, -1);
    PAN_DIFIMPSUBDET.SetFieldPanel(PFL_DIFIMPSUBDET_NUMEROIMPAC1, PPQRY_CONTRORIACC1, "A.NUMERO_IMPACC", "RECCONRINUIM", 1, 5, 0, -13997);
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOIMPACC1, MyGlb.PANEL_LIST, 72, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOIMPACC1, MyGlb.PANEL_LIST, 88);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOIMPACC1, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOIMPACC1, MyGlb.PANEL_LIST, "Anno Imp.");
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOIMPACC1, MyGlb.PANEL_FORM, 4, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOIMPACC1, MyGlb.PANEL_FORM, 88);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOIMPACC1, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOIMPACC1, MyGlb.PANEL_FORM, "Anno Imp.");
    PAN_DIFIMPSUBDET.SetFieldPage(PFL_DIFIMPSUBDET_ANNOIMPACC1, -1, -1);
    PAN_DIFIMPSUBDET.SetFieldPanel(PFL_DIFIMPSUBDET_ANNOIMPACC1, PPQRY_CONTRORIACC1, "A.ANNO_IMPACC", "RECCONRIANIM", 1, 4, 0, -13997);
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_DESCRIZIONE1, MyGlb.PANEL_LIST, 132, 36, 356, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_DESCRIZIONE1, MyGlb.PANEL_LIST, 84);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_DESCRIZIONE1, MyGlb.PANEL_LIST, "Impegno Descrizione");
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 4, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_DESCRIZIONE1, MyGlb.PANEL_FORM, 84);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_DESCRIZIONE1, MyGlb.PANEL_FORM, "Impegno Descrizione");
    PAN_DIFIMPSUBDET.SetFieldPage(PFL_DIFIMPSUBDET_DESCRIZIONE1, -1, -1);
    PAN_DIFIMPSUBDET.SetFieldPanel(PFL_DIFIMPSUBDET_DESCRIZIONE1, PPQRY_CONTRORIACC1, "C.DESCRIZIONE", "RECORIMPDESC", 5, 140, 0, -13997);
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOESIGIBIL, MyGlb.PANEL_LIST, 488, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOESIGIBIL, MyGlb.PANEL_LIST, 112);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOESIGIBIL, MyGlb.PANEL_FORM, 4, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOESIGIBIL, MyGlb.PANEL_FORM, 112);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_DIFIMPSUBDET.SetFieldPage(PFL_DIFIMPSUBDET_ANNOESIGIBIL, -1, -1);
    PAN_DIFIMPSUBDET.SetFieldPanel(PFL_DIFIMPSUBDET_ANNOESIGIBIL, PPQRY_CONTRORIACC1, "A.ANNO_ESIGIBILITA", "ANNO_ESIGIBILITA", 1, 4, 0, -13997);
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOENTRATA, MyGlb.PANEL_LIST, 548, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOENTRATA, MyGlb.PANEL_LIST, 92);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOENTRATA, MyGlb.PANEL_LIST, "Anno Entrata");
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOENTRATA, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOENTRATA, MyGlb.PANEL_FORM, 92);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_ANNOENTRATA, MyGlb.PANEL_FORM, "Anno Entrata");
    PAN_DIFIMPSUBDET.SetFieldPage(PFL_DIFIMPSUBDET_ANNOENTRATA, -1, -1);
    PAN_DIFIMPSUBDET.SetFieldPanel(PFL_DIFIMPSUBDET_ANNOENTRATA, PPQRY_CONTRORIACC1, "A.ANNO_ENTRATA", "ANNO_ENTRATA", 1, 4, 0, -13997);
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOVAR, MyGlb.PANEL_LIST, 608, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOVAR, MyGlb.PANEL_LIST, 64);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOVAR, MyGlb.PANEL_LIST, "Tipo Var.");
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOVAR, MyGlb.PANEL_FORM, 4, 4, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOVAR, MyGlb.PANEL_FORM, 64);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOVAR, MyGlb.PANEL_FORM, "Tipo Var.");
    PAN_DIFIMPSUBDET.SetFieldPage(PFL_DIFIMPSUBDET_TIPOVAR, -1, -1);
    PAN_DIFIMPSUBDET.SetFieldPanel(PFL_DIFIMPSUBDET_TIPOVAR, PPQRY_CONTRORIACC1, "A.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOAVANZO, MyGlb.PANEL_LIST, 768, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOAVANZO, MyGlb.PANEL_LIST, 84);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOAVANZO, MyGlb.PANEL_FORM, 4, 4, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOAVANZO, MyGlb.PANEL_FORM, 84);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_DIFIMPSUBDET.SetFieldPage(PFL_DIFIMPSUBDET_TIPOAVANZO, -1, -1);
    PAN_DIFIMPSUBDET.SetFieldPanel(PFL_DIFIMPSUBDET_TIPOAVANZO, PPQRY_CONTRORIACC1, "A.TIPO_AVANZO", "TIPO_AVANZO", 3, 10, 0, -13997);
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_FINANZIOPERA, MyGlb.PANEL_LIST, 924, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_FINANZIOPERA, MyGlb.PANEL_LIST, 140);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_FINANZIOPERA, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_FINANZIOPERA, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_FINANZIOPERA, MyGlb.PANEL_FORM, 4, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_FINANZIOPERA, MyGlb.PANEL_FORM, 140);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_FINANZIOPERA, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_FINANZIOPERA, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_DIFIMPSUBDET.SetFieldPage(PFL_DIFIMPSUBDET_FINANZIOPERA, -1, -1);
    PAN_DIFIMPSUBDET.SetFieldPanel(PFL_DIFIMPSUBDET_FINANZIOPERA, PPQRY_CONTRORIACC1, "A.FINANZIAMENTO_OPERA", "FINANZIAMENTO_OPERA", 1, 5, 0, -13997);
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, MyGlb.PANEL_LIST, 1080, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, MyGlb.PANEL_LIST, 52);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, MyGlb.PANEL_LIST, "Proposte Impegno");
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, MyGlb.PANEL_FORM, 4, 4, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, MyGlb.PANEL_FORM, 52);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMP1, MyGlb.PANEL_FORM, "Prp. Im.");
    PAN_DIFIMPSUBDET.SetFieldPage(PFL_DIFIMPSUBDET_TOTIMP1, -1, -1);
    PAN_DIFIMPSUBDET.SetFieldPanel(PFL_DIFIMPSUBDET_TOTIMP1, PPQRY_CONTRORIACC1, "A.TOTIMP", "TOTIMP", 3, 14, 2, -13997);
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, MyGlb.PANEL_LIST, 1188, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, MyGlb.PANEL_LIST, 72);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, MyGlb.PANEL_LIST, "Proposte Subimpegno");
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, MyGlb.PANEL_FORM, 4, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, MyGlb.PANEL_FORM, 76);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMP1, MyGlb.PANEL_FORM, "Prop. Subim.");
    PAN_DIFIMPSUBDET.SetFieldPage(PFL_DIFIMPSUBDET_TOTSUBIMP1, -1, -1);
    PAN_DIFIMPSUBDET.SetFieldPanel(PFL_DIFIMPSUBDET_TOTSUBIMP1, PPQRY_CONTRORIACC1, "A.TOTSUBIMP", "TOTSUBIMP", 3, 14, 2, -13997);
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, MyGlb.PANEL_LIST, 1304, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, MyGlb.PANEL_LIST, 76);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, MyGlb.PANEL_LIST, "Proposte Impegno");
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, MyGlb.PANEL_FORM, 4, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, MyGlb.PANEL_FORM, 76);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTIMPUFF1, MyGlb.PANEL_FORM, "Prop. Imp.");
    PAN_DIFIMPSUBDET.SetFieldPage(PFL_DIFIMPSUBDET_TOTIMPUFF1, -1, -1);
    PAN_DIFIMPSUBDET.SetFieldPanel(PFL_DIFIMPSUBDET_TOTIMPUFF1, PPQRY_CONTRORIACC1, "A.TOTIMP_UFF", "TOTIMP_UFF", 3, 14, 2, -13997);
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, MyGlb.PANEL_LIST, 1420, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, MyGlb.PANEL_LIST, 100);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, MyGlb.PANEL_LIST, "Proposte Subimpegno");
    PAN_DIFIMPSUBDET.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, MyGlb.PANEL_FORM, 4, 4, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBDET.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, MyGlb.PANEL_FORM, 100);
    PAN_DIFIMPSUBDET.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBDET.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBDET_TOTSUBIMPUF1, MyGlb.PANEL_FORM, "Prop. Subimp.");
    PAN_DIFIMPSUBDET.SetFieldPage(PFL_DIFIMPSUBDET_TOTSUBIMPUF1, -1, -1);
    PAN_DIFIMPSUBDET.SetFieldPanel(PFL_DIFIMPSUBDET_TOTSUBIMPUF1, PPQRY_CONTRORIACC1, "A.TOTSUBIMP_UFF", "TOTSUBIMP_UFF", 3, 14, 2, -13997);
  }

  private void PAN_DIFIMPSUBDET_InitQueries()
  {
    StringBuffer SQL;

    PAN_DIFIMPSUBDET.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    SQL.append("and   (A.RIACCERTAMENTO = 'SI') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DIFIMPSUBDET.SetQuery(PPQRY_T55, 0, SQL, PFL_DIFIMPSUBDET_TIPOVAR, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.RIACCERTAMENTO = 'SI') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DIFIMPSUBDET.SetQuery(PPQRY_T55, 1, SQL, PFL_DIFIMPSUBDET_TIPOVAR, "");
    PAN_DIFIMPSUBDET.SetQueryDB(PPQRY_T55, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where (A.CODICE = ~~TIPO_AVANZO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DIFIMPSUBDET.SetQuery(PPQRY_TIPIAVANZO, 0, SQL, PFL_DIFIMPSUBDET_TIPOAVANZO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DIFIMPSUBDET.SetQuery(PPQRY_TIPIAVANZO, 1, SQL, PFL_DIFIMPSUBDET_TIPOAVANZO, "");
    PAN_DIFIMPSUBDET.SetQueryDB(PPQRY_TIPIAVANZO, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as IMPFINFINANZ, ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || B.DESCRIZIONE as IMPFINFINAN1 ");
    SQL.append("from ");
    SQL.append("  IMP_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (A.FINANZIAMENTO = ~~FINANZIAMENTO_OPERA~~) ");
    SQL.append("and   (B.CODICE = A.FINANZIAMENTO) ");
    SQL.append("and   (A.ANNO_IMP = ~~RECCONRIANIM~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~RECCONRINUIM~~) ");
    SQL.append("order by ");
    SQL.append("  A.FINANZIAMENTO ");
    PAN_DIFIMPSUBDET.SetQuery(PPQRY_IMPFIN, 0, SQL, PFL_DIFIMPSUBDET_FINANZIOPERA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as IMPFINFINANZ, ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || B.DESCRIZIONE as IMPFINFINAN1 ");
    SQL.append("from ");
    SQL.append("  IMP_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (B.CODICE = A.FINANZIAMENTO) ");
    SQL.append("and   (A.ANNO_IMP = ~~RECCONRIANIM~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~RECCONRINUIM~~) ");
    SQL.append("order by ");
    SQL.append("  A.FINANZIAMENTO ");
    PAN_DIFIMPSUBDET.SetQuery(PPQRY_IMPFIN, 1, SQL, PFL_DIFIMPSUBDET_FINANZIOPERA, "");
    PAN_DIFIMPSUBDET.SetQueryDB(PPQRY_IMPFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DIFIMPSUBDET.SetIMDB(IMDB, "PQRY_CONTRORIACC1", true);
    PAN_DIFIMPSUBDET.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.PERIODO_RIACC as PERIODO_RIACC, ");
    SQL.append("  A.TOTIMP as TOTIMP, ");
    SQL.append("  A.TOTSUBIMP as TOTSUBIMP, ");
    SQL.append("  A.TOTIMP_UFF as TOTIMP_UFF, ");
    SQL.append("  A.TOTSUBIMP_UFF as TOTSUBIMP_UFF, ");
    SQL.append("  A.VISIBILE_RAG as VISIBILE_RAG, ");
    SQL.append("  A.VISIBILE_UFF as VISIBILE_UFF, ");
    SQL.append("  A.ANNO_ESIGIBILITA as ANNO_ESIGIBILITA, ");
    SQL.append("  A.ANNO_ENTRATA as ANNO_ENTRATA, ");
    SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
    SQL.append("  A.TIPO_AVANZO as TIPO_AVANZO, ");
    SQL.append("  A.FINANZIAMENTO_OPERA as FINANZIAMENTO_OPERA, ");
    SQL.append("  A.NUMERO_IMPACC as RECCONRINUIM, ");
    SQL.append("  A.ANNO_IMPACC as RECCONRIANIM, ");
    SQL.append("  C.DESCRIZIONE as RECORIMPDESC ");
    PAN_DIFIMPSUBDET.SetQuery(PPQRY_CONTRORIACC1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CONTROLLO_RIACCERTAMENTI A, ");
    SQL.append("  IMP C ");
    PAN_DIFIMPSUBDET.SetQuery(PPQRY_CONTRORIACC1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.NUMERO_IMP = A.NUMERO_IMPACC) ");
    SQL.append("and   (C.ANNO_IMP = A.ANNO_IMPACC) ");
    SQL.append("and   (A.PERIODO_RIACC = ~~TBL_PARAMEFILTR3.NOMOGGPERRIA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMEFILTR3.NOMEOGGEESER~~) ");
    SQL.append("and   (DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', A.VISIBILE_RAG, A.VISIBILE_UFF) = 'SI') ");
    SQL.append("and   (DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', A.TOTIMP, A.TOTIMP_UFF) <> DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', A.TOTSUBIMP, A.TOTSUBIMP_UFF)) ");
    SQL.append("and   (~~TBL_DATISESSIONE.SESSIOMODULO~~ = 'CFA' OR EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA B ");
    SQL.append("where (B.PROGR_UNITA_ORGANIZZATIVA = NVL(C.PROGR_UNITA_ORGANIZZATIVA, A_GET_UNITA_ORGANIZZATIVA(A.ESERCIZIO,'S',C.CAPITOLO,C.ARTICOLO,C.D_DATA_REG))) ");
    SQL.append("and   (B.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.TIPO_STRUTTURA = 'LG') ");
    SQL.append("))) ");
    PAN_DIFIMPSUBDET.SetQuery(PPQRY_CONTRORIACC1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DIFIMPSUBDET.SetQuery(PPQRY_CONTRORIACC1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DIFIMPSUBDET.SetQuery(PPQRY_CONTRORIACC1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DIFIMPSUBDET.SetQuery(PPQRY_CONTRORIACC1, 5, SQL, -1, "");
    PAN_DIFIMPSUBDET.SetQueryDB(PPQRY_CONTRORIACC1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DIFIMPSUBDET.SetMasterTable(0, "CONTROLLO_RIACCERTAMENTI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DIFIMPSUBDET.Status() == 2)
    {
      int oldListQBE = PAN_DIFIMPSUBDET.iUseListQBE;
      PAN_DIFIMPSUBDET.iUseListQBE = 0;
      PAN_DIFIMPSUBDET.PanelCommand(Glb.PCM_SEARCH);
      PAN_DIFIMPSUBDET.PanelCommand(Glb.PCM_FIND);
      PAN_DIFIMPSUBDET.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DIFIMPSUBTOT_Init()
  {

    PAN_DIFIMPSUBTOT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DIFIMPSUBTOT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DIFIMPSUBTOT.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_DIFIMPSUBTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_NUMEROIMPACC, "6375ED2C-4C0C-42EA-99D7-3BA24EA8BE55");
    PAN_DIFIMPSUBTOT.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_NUMEROIMPACC, "Numero Imp.");
    PAN_DIFIMPSUBTOT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_NUMEROIMPACC, "");
    PAN_DIFIMPSUBTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_NUMEROIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFIMPSUBTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_NUMEROIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_ANNOIMPACC, "B00B4D69-C52E-4EA0-BFAA-F97C7E40E9A5");
    PAN_DIFIMPSUBTOT.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_ANNOIMPACC, "Anno Imp.");
    PAN_DIFIMPSUBTOT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_ANNOIMPACC, "");
    PAN_DIFIMPSUBTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_ANNOIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFIMPSUBTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_ANNOIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_DESCRIZIONE2, "CDB32619-930D-41D1-9120-F09DC6475A67");
    PAN_DIFIMPSUBTOT.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_DESCRIZIONE2, "Impegno Descrizione");
    PAN_DIFIMPSUBTOT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_DESCRIZIONE2, "");
    PAN_DIFIMPSUBTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_DESCRIZIONE2, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFIMPSUBTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_DESCRIZIONE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_DIFIMPSUBTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, "918EED7D-C5AC-4B84-AFAE-64C227AC3F1F");
    PAN_DIFIMPSUBTOT.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, "Proposte Impegno");
    PAN_DIFIMPSUBTOT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, "");
    PAN_DIFIMPSUBTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_DIFIMPSUBTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, "08499C2A-7EF3-4AB0-AD69-07278F75DF96");
    PAN_DIFIMPSUBTOT.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, "Proposte Subimpegno");
    PAN_DIFIMPSUBTOT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, "");
    PAN_DIFIMPSUBTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_DIFIMPSUBTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, "8A4E4374-2F1A-4525-8A1F-84E89C1C1519");
    PAN_DIFIMPSUBTOT.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, "Proposte Impegno");
    PAN_DIFIMPSUBTOT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, "");
    PAN_DIFIMPSUBTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, MyGlb.VIS_NORFIECF4IMP);
    PAN_DIFIMPSUBTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_DIFIMPSUBTOT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, "B70ECE3A-E4DE-4473-BD28-FB47B5CD058A");
    PAN_DIFIMPSUBTOT.set_Header(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, "Proposte Subimpegno");
    PAN_DIFIMPSUBTOT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, "");
    PAN_DIFIMPSUBTOT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, MyGlb.VIS_NORFIECF4IMP);
    PAN_DIFIMPSUBTOT.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DIFIMPSUBTOT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_NUMEROIMPACC, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_NUMEROIMPACC, MyGlb.PANEL_LIST, 104);
    PAN_DIFIMPSUBTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_NUMEROIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_NUMEROIMPACC, MyGlb.PANEL_LIST, "Numero Imp.");
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_NUMEROIMPACC, MyGlb.PANEL_FORM, 4, 4, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_NUMEROIMPACC, MyGlb.PANEL_FORM, 104);
    PAN_DIFIMPSUBTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_NUMEROIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_NUMEROIMPACC, MyGlb.PANEL_FORM, "Numero Imp.");
    PAN_DIFIMPSUBTOT.SetFieldPage(PFL_DIFIMPSUBTOT_NUMEROIMPACC, -1, -1);
    PAN_DIFIMPSUBTOT.SetFieldPanel(PFL_DIFIMPSUBTOT_NUMEROIMPACC, PPQRY_CONTRORIACCE, "A.NUMERO_IMPACC", "RECCONRINUIM", 1, 5, 0, -13997);
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_ANNOIMPACC, MyGlb.PANEL_LIST, 72, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_ANNOIMPACC, MyGlb.PANEL_LIST, 88);
    PAN_DIFIMPSUBTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_ANNOIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_ANNOIMPACC, MyGlb.PANEL_LIST, "Anno Imp.");
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_ANNOIMPACC, MyGlb.PANEL_FORM, 4, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_ANNOIMPACC, MyGlb.PANEL_FORM, 88);
    PAN_DIFIMPSUBTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_ANNOIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_ANNOIMPACC, MyGlb.PANEL_FORM, "Anno Imp.");
    PAN_DIFIMPSUBTOT.SetFieldPage(PFL_DIFIMPSUBTOT_ANNOIMPACC, -1, -1);
    PAN_DIFIMPSUBTOT.SetFieldPanel(PFL_DIFIMPSUBTOT_ANNOIMPACC, PPQRY_CONTRORIACCE, "A.ANNO_IMPACC", "RECCONRIANIM", 1, 4, 0, -13997);
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_DESCRIZIONE2, MyGlb.PANEL_LIST, 132, 36, 356, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_DESCRIZIONE2, MyGlb.PANEL_LIST, 84);
    PAN_DIFIMPSUBTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_DESCRIZIONE2, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_DESCRIZIONE2, MyGlb.PANEL_LIST, "Impegno Descrizione");
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_DESCRIZIONE2, MyGlb.PANEL_FORM, 4, 4, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_DESCRIZIONE2, MyGlb.PANEL_FORM, 84);
    PAN_DIFIMPSUBTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_DESCRIZIONE2, MyGlb.PANEL_FORM, 2);
    PAN_DIFIMPSUBTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_DESCRIZIONE2, MyGlb.PANEL_FORM, "Impegno Descrizione");
    PAN_DIFIMPSUBTOT.SetFieldPage(PFL_DIFIMPSUBTOT_DESCRIZIONE2, -1, -1);
    PAN_DIFIMPSUBTOT.SetFieldPanel(PFL_DIFIMPSUBTOT_DESCRIZIONE2, PPQRY_CONTRORIACCE, "B.DESCRIZIONE", "RECORIMPDESC", 5, 140, 0, -13997);
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, MyGlb.PANEL_LIST, 488, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, MyGlb.PANEL_LIST, 52);
    PAN_DIFIMPSUBTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, MyGlb.PANEL_LIST, "Proposte Impegno");
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, MyGlb.PANEL_FORM, 4, 4, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, MyGlb.PANEL_FORM, 52);
    PAN_DIFIMPSUBTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMP, MyGlb.PANEL_FORM, "Prp. Im.");
    PAN_DIFIMPSUBTOT.SetFieldPage(PFL_DIFIMPSUBTOT_TOTIMP, -1, -1);
    PAN_DIFIMPSUBTOT.SetFieldUnbound(PFL_DIFIMPSUBTOT_TOTIMP, true);
    PAN_DIFIMPSUBTOT.SetFieldPanel(PFL_DIFIMPSUBTOT_TOTIMP, PPQRY_CONTRORIACCE, "SUM(A.TOTIMP)", "TOTIMP", 3, 28, 6, -13997);
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, MyGlb.PANEL_LIST, 596, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, MyGlb.PANEL_LIST, 72);
    PAN_DIFIMPSUBTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, MyGlb.PANEL_LIST, "Proposte Subimpegno");
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, MyGlb.PANEL_FORM, 4, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, MyGlb.PANEL_FORM, 76);
    PAN_DIFIMPSUBTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMP, MyGlb.PANEL_FORM, "Prop. Subim.");
    PAN_DIFIMPSUBTOT.SetFieldPage(PFL_DIFIMPSUBTOT_TOTSUBIMP, -1, -1);
    PAN_DIFIMPSUBTOT.SetFieldUnbound(PFL_DIFIMPSUBTOT_TOTSUBIMP, true);
    PAN_DIFIMPSUBTOT.SetFieldPanel(PFL_DIFIMPSUBTOT_TOTSUBIMP, PPQRY_CONTRORIACCE, "SUM(A.TOTSUBIMP)", "TOTSUBIMP", 3, 28, 6, -13997);
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, MyGlb.PANEL_LIST, 712, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, MyGlb.PANEL_LIST, 76);
    PAN_DIFIMPSUBTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, MyGlb.PANEL_LIST, "Proposte Impegno");
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, MyGlb.PANEL_FORM, 4, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, MyGlb.PANEL_FORM, 76);
    PAN_DIFIMPSUBTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTIMPUFF, MyGlb.PANEL_FORM, "Prop. Imp.");
    PAN_DIFIMPSUBTOT.SetFieldPage(PFL_DIFIMPSUBTOT_TOTIMPUFF, -1, -1);
    PAN_DIFIMPSUBTOT.SetFieldUnbound(PFL_DIFIMPSUBTOT_TOTIMPUFF, true);
    PAN_DIFIMPSUBTOT.SetFieldPanel(PFL_DIFIMPSUBTOT_TOTIMPUFF, PPQRY_CONTRORIACCE, "SUM(A.TOTIMP_UFF)", "TOTIMP_UFF", 3, 28, 6, -13997);
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, MyGlb.PANEL_LIST, 828, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, MyGlb.PANEL_LIST, 100);
    PAN_DIFIMPSUBTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, MyGlb.PANEL_LIST, 1);
    PAN_DIFIMPSUBTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, MyGlb.PANEL_LIST, "Proposte Subimpegno");
    PAN_DIFIMPSUBTOT.SetRect(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, MyGlb.PANEL_FORM, 4, 4, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFIMPSUBTOT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, MyGlb.PANEL_FORM, 100);
    PAN_DIFIMPSUBTOT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, MyGlb.PANEL_FORM, 1);
    PAN_DIFIMPSUBTOT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, MyGlb.PANEL_FORM, "Prop. Subimp.");
    PAN_DIFIMPSUBTOT.SetFieldPage(PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, -1, -1);
    PAN_DIFIMPSUBTOT.SetFieldUnbound(PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, true);
    PAN_DIFIMPSUBTOT.SetFieldPanel(PFL_DIFIMPSUBTOT_TOTSUBIMPUFF, PPQRY_CONTRORIACCE, "SUM(A.TOTSUBIMP_UFF)", "TOTSUBIMP_UFF", 3, 28, 6, -13997);
  }

  private void PAN_DIFIMPSUBTOT_InitQueries()
  {
    StringBuffer SQL;

    PAN_DIFIMPSUBTOT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DIFIMPSUBTOT.SetIMDB(IMDB, "PQRY_CONTRORIACCE", true);
    PAN_DIFIMPSUBTOT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUM(A.TOTIMP) as TOTIMP, ");
    SQL.append("  SUM(A.TOTSUBIMP) as TOTSUBIMP, ");
    SQL.append("  SUM(A.TOTIMP_UFF) as TOTIMP_UFF, ");
    SQL.append("  SUM(A.TOTSUBIMP_UFF) as TOTSUBIMP_UFF, ");
    SQL.append("  A.NUMERO_IMPACC as RECCONRINUIM, ");
    SQL.append("  A.ANNO_IMPACC as RECCONRIANIM, ");
    SQL.append("  B.DESCRIZIONE as RECORIMPDESC ");
    PAN_DIFIMPSUBTOT.SetQuery(PPQRY_CONTRORIACCE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CONTROLLO_RIACCERTAMENTI A, ");
    SQL.append("  IMP B ");
    PAN_DIFIMPSUBTOT.SetQuery(PPQRY_CONTRORIACCE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.NUMERO_IMP = A.NUMERO_IMPACC) ");
    SQL.append("and   (B.ANNO_IMP = A.ANNO_IMPACC) ");
    SQL.append("and   (A.PERIODO_RIACC = ~~TBL_PARAMEFILTR3.NOMOGGPERRIA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMEFILTR3.NOMEOGGEESER~~) ");
    SQL.append("and   (DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', A.VISIBILE_RAG, A.VISIBILE_UFF) = 'SI') ");
    SQL.append("and   (DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', A.TOTIMP, A.TOTIMP_UFF) <> DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', A.TOTSUBIMP, A.TOTSUBIMP_UFF)) ");
    SQL.append("and   (~~TBL_DATISESSIONE.SESSIOMODULO~~ = 'CFA' OR EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA C ");
    SQL.append("where (C.PROGR_UNITA_ORGANIZZATIVA = NVL(B.PROGR_UNITA_ORGANIZZATIVA, A_GET_UNITA_ORGANIZZATIVA(A.ESERCIZIO,'S',B.CAPITOLO,B.ARTICOLO,B.D_DATA_REG))) ");
    SQL.append("and   (C.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (C.TIPO_STRUTTURA = 'LG') ");
    SQL.append("))) ");
    PAN_DIFIMPSUBTOT.SetQuery(PPQRY_CONTRORIACCE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.NUMERO_IMPACC, ");
    SQL.append("  A.ANNO_IMPACC, ");
    SQL.append("  B.DESCRIZIONE ");
    PAN_DIFIMPSUBTOT.SetQuery(PPQRY_CONTRORIACCE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DIFIMPSUBTOT.SetQuery(PPQRY_CONTRORIACCE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DIFIMPSUBTOT.SetQuery(PPQRY_CONTRORIACCE, 5, SQL, -1, "");
    PAN_DIFIMPSUBTOT.SetQueryDB(PPQRY_CONTRORIACCE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DIFIMPSUBTOT.SetMasterTable(0, "CONTROLLO_RIACCERTAMENTI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DIFIMPSUBTOT.Status() == 2)
    {
      int oldListQBE = PAN_DIFIMPSUBTOT.iUseListQBE;
      PAN_DIFIMPSUBTOT.iUseListQBE = 0;
      PAN_DIFIMPSUBTOT.PanelCommand(Glb.PCM_SEARCH);
      PAN_DIFIMPSUBTOT.PanelCommand(Glb.PCM_FIND);
      PAN_DIFIMPSUBTOT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FILTRO_Init()
  {

    PAN_FILTRO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_PERIODORIACC, "8F9316A9-0B85-41A2-8746-9816D34EF85A");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_PERIODORIACC, "Periodo Riacc.");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_PERIODORIACC, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_PERIODORIACC, MyGlb.VIS_NORMFIELPADR);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_PERIODORIACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, "3524A281-C520-4FD4-8A35-BF7B4D208F53");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, "Esercizio Rif.");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOCONTROLL, "AF1B0CA8-BE38-4C2A-8AB7-1FF670E7EC9F");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOCONTROLL, "Controllo");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOCONTROLL, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOCONTROLL, MyGlb.VIS_OPTIONBUTTON);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOCONTROLL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_PERIODORIACC, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_PERIODORIACC, MyGlb.PANEL_LIST, 96);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_PERIODORIACC, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_PERIODORIACC, MyGlb.PANEL_LIST, "Periodo Riacc.");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_PERIODORIACC, MyGlb.PANEL_FORM, 28, 16, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_PERIODORIACC, MyGlb.PANEL_FORM, 96);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_PERIODORIACC, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_PERIODORIACC, MyGlb.PANEL_FORM, "Periodo Riacc.");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_PERIODORIACC, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_PERIODORIACC, PPQRY_PARAMEFILTR1, "A.NOMOGGPERRIA", "NOMOGGPERRIA", 1, 5, 0, -13997);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio Rif.");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 452, 16, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 88);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio Rif.");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_ESERCIZIO, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_ESERCIZIO, PPQRY_PARAMEFILTR1, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOCONTROLL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOCONTROLL, MyGlb.PANEL_LIST, 88);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOCONTROLL, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOCONTROLL, MyGlb.PANEL_LIST, "Controllo");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOCONTROLL, MyGlb.PANEL_FORM, 44, 44, 200, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOCONTROLL, MyGlb.PANEL_FORM, 80);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOCONTROLL, MyGlb.PANEL_FORM, 2);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOCONTROLL, MyGlb.PANEL_FORM, "Controllo");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_TIPOCONTROLL, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_TIPOCONTROLL, PPQRY_PARAMEFILTR1, "A.NOMOGGTIPCON", "NOMOGGTIPCON", 5, 1, 0, -13997);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPOCONTROLL, (new IDVariant("T")), "Totale Proposte", "", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPOCONTROLL, (new IDVariant("1")), "Dettaglio", "", "", -1);
  }

  private void PAN_FILTRO_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as PERIRIACCODI, ");
    SQL.append("  A.DESCRIZIONE as PERIRIACDESC ");
    SQL.append("from ");
    SQL.append("  PERIODI_RIACCERTAMENTI A ");
    SQL.append("where (A.CODICE = ~~NOMOGGPERRIA~~) ");
    PAN_FILTRO.SetQuery(PPQRY_PERIODRIACCE, 0, SQL, PFL_FILTRO_PERIODORIACC, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as PERIRIACCODI, ");
    SQL.append("  A.DESCRIZIONE as PERIRIACDESC ");
    SQL.append("from ");
    SQL.append("  PERIODI_RIACCERTAMENTI A ");
    PAN_FILTRO.SetQuery(PPQRY_PERIODRIACCE, 1, SQL, PFL_FILTRO_PERIODORIACC, "");
    PAN_FILTRO.SetQueryDB(PPQRY_PERIODRIACCE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FILTRO.SetIMDB(IMDB, "PQRY_PARAMEFILTR1", true);
    PAN_FILTRO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_FILTRO.SetQueryIMDB(PPQRY_PARAMEFILTR1, IMDBDef14.PQRY_PARAMEFILTR1_RS, IMDBDef5.TBL_PARAMEFILTR3);
    JustLoaded = true;
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_PERIODORIACC, IMDBDef5.FLD_PARAMEFILTR3_NOMOGGPERRIA);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_ESERCIZIO, IMDBDef5.FLD_PARAMEFILTR3_NOMEOGGEESER);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_TIPOCONTROLL, IMDBDef5.FLD_PARAMEFILTR3_NOMOGGTIPCON);
    PAN_FILTRO.SetMasterTable(0, "PARAMEFILTR3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTRO.Status() == 2)
    {
      int oldListQBE = PAN_FILTRO.iUseListQBE;
      PAN_FILTRO.iUseListQBE = 0;
      PAN_FILTRO.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRO.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_NOTEFUNZIONA_Init()
  {

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "9C4C8C50-2811-4473-8AFB-BFCC0B95BF3B");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "MODULO");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "81AB357F-2BC6-4DC7-9F51-2135CDACFB8E");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "PAGINA");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "361CB55E-88FA-4026-84BE-17D595AB1BF6");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "FUNZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "E4913D68-6DC7-4107-910A-E7AAF6AAD6D5");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.VIS_HTMEDISTNOSF);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NOTEFUNZIONA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 56);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, "MODULO");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, "MODULO");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_MODULO, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_MODULO, PPQRY_NOTEFUNZIO13, "A.MODULO", "MODULO", 5, 20, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 4, 164, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, "PAGINA");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 4, 28, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, "PAGINA");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_PAGINA, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_PAGINA, PPQRY_NOTEFUNZIO13, "A.PAGINA", "PAGINA", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 4, 200, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 4, 52, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_FUNZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_FUNZIONE, PPQRY_NOTEFUNZIO13, "A.FUNZIONE", "FUNZIONE", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 104, 236, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 8, 16, 496, 140, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 10);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_DESCRIZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_DESCRIZIONE, PPQRY_NOTEFUNZIO13, "A.DESCRIZIONE", "DESCRIZIONE", 9, 9999, 0, -13997);
  }

  private void PAN_NOTEFUNZIONA_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTEFUNZIONA.SetIMDB(IMDB, "PQRY_NOTEFUNZIO13", true);
    PAN_NOTEFUNZIONA.set_SetString(MyGlb.MASTER_ROWNAME, "NOTE FUNZIONALITA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MODULO as MODULO, ");
    SQL.append("  A.PAGINA as PAGINA, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO13, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO13, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = 'CFA') ");
    SQL.append("and   (A.PAGINA = " + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_DIFFIMPESUBI,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.FUNZIONE = 'Differenze Impegni Subimpegni') ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO13, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO13, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO13, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO13, 5, SQL, -1, "");
    PAN_NOTEFUNZIONA.SetQueryDB(PPQRY_NOTEFUNZIO13, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NOTEFUNZIONA.SetMasterTable(0, "NOTE_FUNZIONALITA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTEFUNZIONA.Status() == 2)
    {
      int oldListQBE = PAN_NOTEFUNZIONA.iUseListQBE;
      PAN_NOTEFUNZIONA.iUseListQBE = 0;
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_FIND);
      PAN_NOTEFUNZIONA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DIFIMPSUBDET) PAN_DIFIMPSUBDET_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DIFIMPSUBTOT) PAN_DIFIMPSUBTOT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DIFIMPSUBDET) PAN_DIFIMPSUBDET_ValidateRow(Cancel);
    if (SrcObj == PAN_DIFIMPSUBTOT) PAN_DIFIMPSUBTOT_ValidateRow(Cancel);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DIFIMPSUBDET) PAN_DIFIMPSUBDET_DynamicProperties();
    if (SrcObj == PAN_DIFIMPSUBTOT) PAN_DIFIMPSUBTOT_DynamicProperties();
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_DynamicProperties();
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DIFIMPSUBDET) PAN_DIFIMPSUBDET_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DIFIMPSUBTOT) PAN_DIFIMPSUBTOT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DIFIMPSUBDET) PAN_DIFIMPSUBDET_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DIFIMPSUBTOT) PAN_DIFIMPSUBTOT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
