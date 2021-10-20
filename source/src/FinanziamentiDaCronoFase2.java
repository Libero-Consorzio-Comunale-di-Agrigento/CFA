// **********************************************
// Finanziamenti Da Crono Fase 2
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FinanziamentiDaCronoFase2 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMFILTRI_ESERCIZIO = 0;
  private static int PFL_PARAMFILTRI_VARIAZICRONO = 1;
  private static int PFL_PARAMFILTRI_DESTINAZIONE = 2;

  private static int PPQRY_PARAMETFDCF3 = 0;


  IDPanel PAN_PARAMFILTRI;
  private static int GRP_FINANDACRONO_OPERA = 0;
  private static int GRP_FINANDACRONO_CAPITOLO = 1;
  private static int GRP_FINANDACRONO_FINANZIAMENT = 2;
  private static int GRP_FINANDACRONO_DATICALCOLAT = 3;
  private static int GRP_FINANDACRONO_ANOMALIA = 4;

  private static int PFL_FINANDACRONO_SELEZIONE = 0;
  private static int PFL_FINANDACRONO_ICONAANOMALI = 1;
  private static int PFL_FINANDACRONO_OPERA = 2;
  private static int PFL_FINANDACRONO_DESCRIZOPERA = 3;
  private static int PFL_FINANDACRONO_PROGRESSIVO = 4;
  private static int PFL_FINANDACRONO_ES = 5;
  private static int PFL_FINANDACRONO_CAPITOARTICO = 6;
  private static int PFL_FINANDACRONO_CAPITOLO = 7;
  private static int PFL_FINANDACRONO_ARTICOLO = 8;
  private static int PFL_FINANDACRONO_CAPDESCRIZIO = 9;
  private static int PFL_FINANDACRONO_INFOCAPITOLO = 10;
  private static int PFL_FINANDACRONO_FINANZIAMENT = 11;
  private static int PFL_FINANDACRONO_FINANZDESCRI = 12;
  private static int PFL_FINANDACRONO_STNPURODACRO = 13;
  private static int PFL_FINANDACRONO_REISCRIDASTN = 14;
  private static int PFL_FINANDACRONO_STNINICO = 15;
  private static int PFL_FINANDACRONO_IMPEGNATO = 16;
  private static int PFL_FINANDACRONO_IMPEGREISSTN = 17;
  private static int PFL_FINANDACRONO_VARDEF = 18;
  private static int PFL_FINANDACRONO_VARDEFREISTN = 19;
  private static int PFL_FINANDACRONO_VARPROV = 20;
  private static int PFL_FINANDACRONO_VARPROREISTN = 21;
  private static int PFL_FINANDACRONO_DETTAGANOMAL = 22;
  private static int PFL_FINANDACRONO_DESCRIANOMAL = 23;
  private static int PFL_FINANDACRONO_ESERCIZIPLUR = 24;
  private static int PFL_FINANDACRONO_PROGRESCRONO = 25;
  private static int PFL_FINANDACRONO_PROGRSESSION = 26;

  private static int PPQRY_WRKGENFINDAC = 0;

  private static int PPQRY_OPERE = 1;
  private static int PPQRY_CAP = 2;
  private static int PPQRY_INFOCAPITOLO = 3;
  private static int PPQRY_FINANZIAMENT = 4;


  IDPanel PAN_FINANDACRONO;
  private static int PFL_PARAMELAB_ETICHEANNULL = 0;
  private static int PFL_PARAMELAB_ETICHEELABOR = 1;
  private static int PFL_PARAMELAB_UNO = 2;

  private static int PPQRY_PATS5 = 0;


  IDPanel PAN_PARAMELAB;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETFDCF2(IMDB);
    //
    //
    Init_PQRY_PARAMETFDCF3(IMDB);
    Init_PQRY_PARAMETFDCF3_RS(IMDB);
    Init_PQRY_WRKGENFINDAC(IMDB);
    Init_PQRY_PATS5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETFDCF2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETFDCF2, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETFDCF2, "TBL_PARAMETFDCF2");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETFDCF2,IMDBDef3.FLD_PARAMETFDCF2_NOMEOGGEDEST, "NOMEOGGEDEST");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETFDCF2,IMDBDef3.FLD_PARAMETFDCF2_NOMEOGGEDEST,5,6,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETFDCF2,IMDBDef3.FLD_PARAMETFDCF2_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETFDCF2,IMDBDef3.FLD_PARAMETFDCF2_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETFDCF2,IMDBDef3.FLD_PARAMETFDCF2_NOMOGGVARCRO, "NOMOGGVARCRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETFDCF2,IMDBDef3.FLD_PARAMETFDCF2_NOMOGGVARCRO,1,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETFDCF2, 0);
  }

  private static void Init_PQRY_PARAMETFDCF3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETFDCF3, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETFDCF3, "PQRY_PARAMETFDCF3");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETFDCF3,IMDBDef11.PQSL_PARAMETFDCF3_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETFDCF3,IMDBDef11.PQSL_PARAMETFDCF3_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETFDCF3,IMDBDef11.PQSL_PARAMETFDCF3_NOMOGGVARCRO, "NOMOGGVARCRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETFDCF3,IMDBDef11.PQSL_PARAMETFDCF3_NOMOGGVARCRO,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETFDCF3,IMDBDef11.PQSL_PARAMETFDCF3_NOMEOGGEDEST, "NOMEOGGEDEST");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETFDCF3,IMDBDef11.PQSL_PARAMETFDCF3_NOMEOGGEDEST,5,6,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETFDCF3, 0);
  }

  private static void Init_PQRY_PARAMETFDCF3_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETFDCF3_RS, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETFDCF3_RS, "PQRY_PARAMETFDCF3_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETFDCF3_RS,IMDBDef11.PQSL_PARAMETFDCF3_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETFDCF3_RS,IMDBDef11.PQSL_PARAMETFDCF3_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETFDCF3_RS,IMDBDef11.PQSL_PARAMETFDCF3_NOMOGGVARCRO, "NOMOGGVARCRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETFDCF3_RS,IMDBDef11.PQSL_PARAMETFDCF3_NOMOGGVARCRO,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETFDCF3_RS,IMDBDef11.PQSL_PARAMETFDCF3_NOMEOGGEDEST, "NOMEOGGEDEST");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETFDCF3_RS,IMDBDef11.PQSL_PARAMETFDCF3_NOMEOGGEDEST,5,6,0);
  }

  private static void Init_PQRY_WRKGENFINDAC(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_WRKGENFINDAC, 24);
    IMDB.set_TblCode(IMDBDef11.PQRY_WRKGENFINDAC, "PQRY_WRKGENFINDAC");
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_SELEZIONE, "SELEZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_SELEZIONE,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_ANOMALIA, "ANOMALIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_ANOMALIA,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_ICONAANOMALI, "ICONAANOMALI");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_ICONAANOMALI,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_CAPITOARTICO, "CAPITOARTICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_CAPITOARTICO,5,199,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_ESERCIZIO_PLUR, "ESERCIZIO_PLUR");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_ESERCIZIO_PLUR,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_REISCRIZIONI_DA_STN, "REISCRIZIONI_DA_STN");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_REISCRIZIONI_DA_STN,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_STN_PURO_DA_CRONO, "STN_PURO_DA_CRONO");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_STN_PURO_DA_CRONO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_DESCRIZIONE_ANOMALIA, "DESCRIZIONE_ANOMALIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_DESCRIZIONE_ANOMALIA,5,4000,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_PROGR_SESSIONE, "PROGR_SESSIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_PROGR_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_PROGRESSIVO_CRONO, "PROGRESSIVO_CRONO");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_PROGRESSIVO_CRONO,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_IMPEGNATO, "IMPEGNATO");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_IMPEGNATO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_IMPEGNATO_REISC_STN, "IMPEGNATO_REISC_STN");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_IMPEGNATO_REISC_STN,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_VAR_DEF, "VAR_DEF");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_VAR_DEF,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_VAR_DEF_REISC_STN, "VAR_DEF_REISC_STN");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_VAR_DEF_REISC_STN,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_VAR_PROV, "VAR_PROV");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_VAR_PROV,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_VAR_PROV_REISC_STN, "VAR_PROV_REISC_STN");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_VAR_PROV_REISC_STN,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_DETTAGANOMAL, "DETTAGANOMAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_DETTAGANOMAL,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_STNINICO, "STNINICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKGENFINDAC,IMDBDef11.PQSL_WRKGENFINDAC_STNINICO,3,28,6);
    IMDB.TblAddNew(IMDBDef11.PQRY_WRKGENFINDAC, 0);
  }

  private static void Init_PQRY_PATS5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PATS5, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_PATS5, "PQRY_PATS5");
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS5,IMDBDef11.PQSL_PATS5_UNO, "UNO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS5,IMDBDef11.PQSL_PATS5_UNO,1,19,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PATS5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FinanziamentiDaCronoFase2(MyWebEntryPoint w, IMDBObj imdb)
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
  public FinanziamentiDaCronoFase2()
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
    FormIdx = MyGlb.FRM_FINDACROFAS2;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "23904A86-9034-46C0-8778-E6FA92249231";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 800;
    DesignHeight = 478;
    set_Caption(new IDVariant("Finanziamenti da Cronoprogramma"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1084;
    Frames[1].Height = 452;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.176991;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1084;
    Frames[2].Height = 80;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param Filtri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 1084;
    Frames[2].FixedHeight = 80;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMFILTRI = new IDPanel(w, this, 2, "PAN_PARAMFILTRI");
    Frames[2].Content = PAN_PARAMFILTRI;
    PAN_PARAMFILTRI.Lockable = false;
    PAN_PARAMFILTRI.iLocked = false;
    PAN_PARAMFILTRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMFILTRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1084-MyGlb.PAN_OFFS_X, 80-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMFILTRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C8069679-D10D-4293-9AE1-AF0E016FCF42");
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 224, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMFILTRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMFILTRI.InitStatus = 2;
    PAN_PARAMFILTRI_Init();
    PAN_PARAMFILTRI_InitFields();
    PAN_PARAMFILTRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1084;
    Frames[3].Height = 372;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.849462;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 1084;
    Frames[4].Height = 316;
    Frames[4].Caption = "Finanziamenti da Cronoprogramma";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 316;
    PAN_FINANDACRONO = new IDPanel(w, this, 4, "PAN_FINANDACRONO");
    Frames[4].Content = PAN_FINANDACRONO;
    PAN_FINANDACRONO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FINANDACRONO.VS = MainFrm.VisualStyleList;
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1084-MyGlb.PAN_OFFS_X, 316-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "076BF637-DD90-45EC-B7D0-EAB8D3B6FBFF");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2588, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FINANDACRONO.InitStatus = 2;
    PAN_FINANDACRONO_Init();
    PAN_FINANDACRONO_InitFields();
    PAN_FINANDACRONO_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[3].ChildFrame2 = Frames[5];
    Frames[5].Width = 1084;
    Frames[5].Height = 56;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "Param Elab";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 56;
    PAN_PARAMELAB = new IDPanel(w, this, 5, "PAN_PARAMELAB");
    Frames[5].Content = PAN_PARAMELAB;
    PAN_PARAMELAB.Lockable = false;
    PAN_PARAMELAB.iLocked = false;
    PAN_PARAMELAB.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMELAB.VS = MainFrm.VisualStyleList;
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1084-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMELAB.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "16C742FB-7972-4D55-8CC1-C059BBF7B9B1");
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 124, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMELAB.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMELAB.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMELAB.InitStatus = 1;
    PAN_PARAMELAB_Init();
    PAN_PARAMELAB_InitFields();
    PAN_PARAMELAB_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETFDCF2, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        FINDACROFAS2_PARAMETFDCF3();
      }
      PAN_PARAMFILTRI.UpdatePanel(MainFrm);
      PAN_FINANDACRONO.UpdatePanel(MainFrm);
      PAN_PARAMELAB.UpdatePanel(MainFrm);
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
    return (obj instanceof FinanziamentiDaCronoFase2);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FinanziamentiDaCronoFase2.class.getName() : (Glb.ClassWithPackage(FinanziamentiDaCronoFase2.class) ? FinanziamentiDaCronoFase2.class.getName().substring(FinanziamentiDaCronoFase2.class.getPackage().getName().length() + 1) : FinanziamentiDaCronoFase2.class.getName()));
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiDaCronoFase2", "Load", _e);
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
      UNLOAD_PARAFDCFDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiDaCronoFase2", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri FDCF2: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAFDCFDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETFDCF2, IMDBDef3.FLD_PARAMETFDCF2_NOMEOGGEDEST, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETFDCF2, IMDBDef3.FLD_PARAMETFDCF2_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETFDCF2, IMDBDef3.FLD_PARAMETFDCF2_NOMOGGVARCRO, 0, new IDVariant());
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiDaCronoFase2", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti da Cronoprogramma On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FINANDACRONO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FINANDACRONO);
      // 
      // Finanziamenti da Cronoprogramma On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_FINANDACRONO.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANDACRONO_CAPDESCRIZIO,(new IDVariant(PAN_FINANDACRONO.FieldText(PFL_FINANDACRONO_CAPDESCRIZIO))).stringValue()); 
      PAN_FINANDACRONO.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANDACRONO_DESCRIZOPERA,(new IDVariant(PAN_FINANDACRONO.FieldText(PFL_FINANDACRONO_DESCRIZOPERA))).stringValue()); 
      PAN_FINANDACRONO.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANDACRONO_FINANZDESCRI,(new IDVariant(PAN_FINANDACRONO.FieldText(PFL_FINANDACRONO_FINANZDESCRI))).stringValue()); 
      PAN_FINANDACRONO.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANDACRONO_DESCRIANOMAL,(new IDVariant(PAN_FINANDACRONO.FieldText(PFL_FINANDACRONO_DESCRIANOMAL))).stringValue()); 
      PAN_FINANDACRONO.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANDACRONO_ICONAANOMALI,(new IDVariant(PAN_FINANDACRONO.FieldText(PFL_FINANDACRONO_DESCRIANOMAL))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiDaCronoFase2", "FinanziamentidaCronoprogrammaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Info Cap
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoCap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Cap Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef11.PQRY_WRKGENFINDAC, IMDBDef11.PQSL_WRKGENFINDAC_E_S, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef11.PQRY_WRKGENFINDAC, IMDBDef11.PQSL_WRKGENFINDAC_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef11.PQRY_WRKGENFINDAC, IMDBDef11.PQSL_WRKGENFINDAC_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARPROUNIORG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiDaCronoFase2", "InfoCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
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
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiDaCronoFase2", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora
  // Generazione finanziamenti da cronoprogrammi su BIL
  // FIN o BPR_FIN
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C5;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Corpo Procedura
      // 
      IDVariant v_VRIGA = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VTOTRIGHESEL = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VRIGHEELABOR = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VRIGHEFALLIT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
      v_AVVISO = (new IDVariant("Generare i finanziamenti da cronoprogramma ?"));
      if (!(MainFrm.MessageConfirm(v_AVVISO)))
      {
        return 0;
      }
      else
      {
        v_VRIGA = (new IDVariant(1));
        v_VTOTRIGHESEL = (new IDVariant(0));
        C5 = PAN_FINANDACRONO.MasterRS();
        if (C5.size()>0) CurPos = C5.getRow(); else CurPos = 0;
        if (!C5.Bof()) PAN_FINANDACRONO.GotoFirst();
        while (!PAN_FINANDACRONO.RSEOF())
        {
          if (C5.Get("SELEZIONE").equals((new IDVariant("SI")), true))
          {
            v_VTOTRIGHESEL = IDL.Add(v_VTOTRIGHESEL, (new IDVariant(1)));
            IDVariant v_VMSGRET = null;
            v_VMSGRET = (new IDVariant());
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.FINGENDACRONOINS(C5.Get("PROGR_SESSIONE"), C5.Get("PROGRESSIVO_CRONO"), C5.Get("PROGRESSIVO"), IMDB.Value(IMDBDef11.PQRY_PARAMETFDCF3, IMDBDef11.PQSL_PARAMETFDCF3_NOMEOGGEDEST, 0), v_VMSGRET);
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0 || !(IDL.IsNull(MainFrm.PulisciMessaggioErrore(v_VMSGRET))))
            {
              v_VRIGHEFALLIT = IDL.Add(v_VRIGHEFALLIT, (new IDVariant(1)));
            }
            else
            {
              v_VRIGHEELABOR = IDL.Add(v_VRIGHEELABOR, (new IDVariant(1)));
            }
          }
          PAN_FINANDACRONO.GotoNext();
        }
        if (CurPos>0) C5.absolute(CurPos);
        if (v_VTOTRIGHESEL.equals((new IDVariant(0)), true))
        {
          IDVariant v_VMSGELA2 = new IDVariant(0,IDVariant.STRING);
          v_VMSGELA2 = (new IDVariant("Nessuna riga selezionata"));
          MainFrm.set_AlertMessage(v_VMSGELA2); 
        }
        else
        {
          IDVariant v_VMSGELA = new IDVariant(0,IDVariant.STRING);
          v_VMSGELA = (new IDVariant("Elaborazione Terminata:"));
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_VMSGELA, (new IDVariant("</br>"))), (new IDVariant("Righe Elaborate con successo: "))), IDL.ToString(v_VRIGHEELABOR)), (new IDVariant("</br>"))), (new IDVariant("Righe Scartate: "))), IDL.ToString(v_VRIGHEFALLIT))); 
        }
      }
      PAN_FINANDACRONO.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiDaCronoFase2", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Capitolo Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_WRKGENFINDAC, IMDBDef11.PQSL_WRKGENFINDAC_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_WRKGENFINDAC, IMDBDef11.PQSL_WRKGENFINDAC_ARTICOLO, 0))))
      {
        if ((MainFrm.GetForm(MyGlb.FRM_INFOSUVOCBIL, 0, false)!=null))
        {
          MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
        }
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMESERCIZ, 0, IMDB.Value(IMDBDef11.PQRY_WRKGENFINDAC, IMDBDef11.PQSL_WRKGENFINDAC_ESERCIZIO_PLUR, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef11.PQRY_WRKGENFINDAC, IMDBDef11.PQSL_WRKGENFINDAC_E_S, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef11.PQRY_WRKGENFINDAC, IMDBDef11.PQSL_WRKGENFINDAC_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef11.PQRY_WRKGENFINDAC, IMDBDef11.PQSL_WRKGENFINDAC_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiDaCronoFase2", "InfoCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Anomalia
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriAnomalia ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Anomalia Body
      // Corpo Procedura
      // 
      IDVariant v_NOTE = new IDVariant(0,IDVariant.STRING);
      v_NOTE = (new IDVariant("Anomalia"));
      if ((MainFrm.GetForm(MyGlb.FRM_DIGITATESTO, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_DIGITATESTO,(new IDVariant(0)).booleanValue()); 
      }
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef11.PQRY_WRKGENFINDAC, IMDBDef11.PQSL_WRKGENFINDAC_DESCRIZIONE_ANOMALIA, 0), v_NOTE, (new IDVariant(0)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiDaCronoFase2", "ApriAnomalia", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri FDCF2
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void FINDACROFAS2_PARAMETFDCF3() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAMETFDCF3_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETFDCF2, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETFDCF2, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETFDCF3_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAMETFDCF3_RS, 0, IMDBDef3.TBL_PARAMETFDCF2, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETFDCF3_RS, 0, 0, IMDBDef3.TBL_PARAMETFDCF2, IMDBDef3.FLD_PARAMETFDCF2_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETFDCF3_RS, 1, 0, IMDBDef3.TBL_PARAMETFDCF2, IMDBDef3.FLD_PARAMETFDCF2_NOMOGGVARCRO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETFDCF3_RS, 2, 0, IMDBDef3.TBL_PARAMETFDCF2, IMDBDef3.FLD_PARAMETFDCF2_NOMEOGGEDEST, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETFDCF2, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETFDCF2, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETFDCF2, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAMETFDCF3_RS, 0);
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
  private void PAN_PARAMFILTRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMFILTRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMFILTRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMFILTRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMFILTRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMFILTRI);
    // Stub
  }

  private void PAN_PARAMFILTRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMFILTRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMFILTRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMFILTRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_FINANDACRONO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FINANDACRONO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FINANDACRONO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FINANDACRONO, Cancel);
    // Stub
  }

  private void PAN_FINANDACRONO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FINANDACRONO_INFOCAPITOLO)
    {
      this.IdxPanelActived = this.PAN_FINANDACRONO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FINANDACRONO_DETTAGANOMAL)
    {
      this.IdxPanelActived = this.PAN_FINANDACRONO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriAnomalia();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FINANDACRONO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FINANDACRONO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FINANDACRONO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMELAB_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMELAB, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMELAB_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMELAB, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMELAB_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMELAB);
    // Stub
  }

  private void PAN_PARAMELAB_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMELAB_ETICHEANNULL)
    {
      this.IdxPanelActived = this.PAN_PARAMELAB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Annulla();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMELAB_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARAMELAB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMELAB_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMELAB_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMELAB_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMFILTRI_Init()
  {

    PAN_PARAMFILTRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMFILTRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMFILTRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMFILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, "A091F5F8-87AF-4B42-9601-10D64992AF24");
    PAN_PARAMFILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, "Esercizio");
    PAN_PARAMFILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, "");
    PAN_PARAMFILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMFILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMFILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_VARIAZICRONO, "39C2D12A-AA4F-4902-9DA0-1BB3C505CEA1");
    PAN_PARAMFILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_VARIAZICRONO, "Variazioni Crono");
    PAN_PARAMFILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_VARIAZICRONO, "");
    PAN_PARAMFILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_VARIAZICRONO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMFILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_VARIAZICRONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMFILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESTINAZIONE, "20FD4201-9FD2-41EF-8F6B-E7BA02BBD48D");
    PAN_PARAMFILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESTINAZIONE, "Destinazione");
    PAN_PARAMFILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESTINAZIONE, "");
    PAN_PARAMFILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESTINAZIONE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMFILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESTINAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMFILTRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_LIST, 132);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_LIST, "Eserc.");
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_FORM, 56, 4, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMFILTRI.SetFieldPage(PFL_PARAMFILTRI_ESERCIZIO, -1, -1);
    PAN_PARAMFILTRI.SetFieldPanel(PFL_PARAMFILTRI_ESERCIZIO, PPQRY_PARAMETFDCF3, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_VARIAZICRONO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_VARIAZICRONO, MyGlb.PANEL_LIST, 100);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_VARIAZICRONO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_VARIAZICRONO, MyGlb.PANEL_LIST, "Variazioni Crono");
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_VARIAZICRONO, MyGlb.PANEL_FORM, 16, 28, 808, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_VARIAZICRONO, MyGlb.PANEL_FORM, 100);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_VARIAZICRONO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_VARIAZICRONO, MyGlb.PANEL_FORM, "Variazioni Crono");
    PAN_PARAMFILTRI.SetFieldPage(PFL_PARAMFILTRI_VARIAZICRONO, -1, -1);
    PAN_PARAMFILTRI.SetFieldPanel(PFL_PARAMFILTRI_VARIAZICRONO, PPQRY_PARAMETFDCF3, "A.NOMOGGVARCRO", "NOMOGGVARCRO", 1, 1, 0, -13997);
    PAN_PARAMFILTRI.SetValueListItem(PFL_PARAMFILTRI_VARIAZICRONO, (new IDVariant(1)), "Variazioni Considerate Sempre", "", "", -1);
    PAN_PARAMFILTRI.SetValueListItem(PFL_PARAMFILTRI_VARIAZICRONO, (new IDVariant(2)), "Variazioni non Considerate", "", "", -1);
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESTINAZIONE, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESTINAZIONE, MyGlb.PANEL_LIST, 84);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESTINAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESTINAZIONE, MyGlb.PANEL_LIST, "Destinazione");
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESTINAZIONE, MyGlb.PANEL_FORM, 32, 52, 792, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESTINAZIONE, MyGlb.PANEL_FORM, 84);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESTINAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESTINAZIONE, MyGlb.PANEL_FORM, "Destinazione");
    PAN_PARAMFILTRI.SetFieldPage(PFL_PARAMFILTRI_DESTINAZIONE, -1, -1);
    PAN_PARAMFILTRI.SetFieldPanel(PFL_PARAMFILTRI_DESTINAZIONE, PPQRY_PARAMETFDCF3, "A.NOMEOGGEDEST", "NOMEOGGEDEST", 5, 6, 0, -13997);
    PAN_PARAMFILTRI.SetValueListItem(PFL_PARAMFILTRI_DESTINAZIONE, (new IDVariant("BIL")), "Finanziamenti Bilancio Effettivo", "Finanziamenti da Cronoprogramma", "", -1);
    PAN_PARAMFILTRI.SetValueListItem(PFL_PARAMFILTRI_DESTINAZIONE, (new IDVariant("BPR")), "Finanziamenti Bilancio Simulato", "Finanziamenti da Cronoprogramma", "", -1);
  }

  private void PAN_PARAMFILTRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMFILTRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMFILTRI.SetIMDB(IMDB, "PQRY_PARAMETFDCF3", true);
    PAN_PARAMFILTRI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMFILTRI.SetQueryIMDB(PPQRY_PARAMETFDCF3, IMDBDef11.PQRY_PARAMETFDCF3_RS, IMDBDef3.TBL_PARAMETFDCF2);
    JustLoaded = true;
    PAN_PARAMFILTRI.SetFieldPrimaryIndex(PFL_PARAMFILTRI_ESERCIZIO, IMDBDef3.FLD_PARAMETFDCF2_NOMEOGGEESER);
    PAN_PARAMFILTRI.SetFieldPrimaryIndex(PFL_PARAMFILTRI_VARIAZICRONO, IMDBDef3.FLD_PARAMETFDCF2_NOMOGGVARCRO);
    PAN_PARAMFILTRI.SetFieldPrimaryIndex(PFL_PARAMFILTRI_DESTINAZIONE, IMDBDef3.FLD_PARAMETFDCF2_NOMEOGGEDEST);
    PAN_PARAMFILTRI.SetMasterTable(0, "PARAMETFDCF2");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMFILTRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMFILTRI.iUseListQBE;
      PAN_PARAMFILTRI.iUseListQBE = 0;
      PAN_PARAMFILTRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMFILTRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMFILTRI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FINANDACRONO_Init()
  {

    PAN_FINANDACRONO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FINANDACRONO.SetSize(MyGlb.OBJ_GROUP, 5);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_OPERA, "92FA0429-5095-49B5-9640-37369F8AD76E");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_OPERA, "Opera");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_OPERA, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_OPERA, MyGlb.VIS_GROUPSTYLE);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_OPERA, MyGlb.PANEL_LIST, 76, -9999, 224, 16, 0, 0);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_OPERA, MyGlb.PANEL_FORM, 0, -21, 668, 421, 0, 0);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_OPERA, 0, 34);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_OPERA, 1, 13);
    PAN_FINANDACRONO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_OPERA, 0, 4);
    PAN_FINANDACRONO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_OPERA, 1, 4);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_OPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_CAPITOLO, "0A3FA46C-E09A-43AF-B01F-EE02D9C4E36C");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_CAPITOLO, "Capitolo");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_CAPITOLO, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_CAPITOLO, MyGlb.VIS_GROUPSTYLE);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_CAPITOLO, MyGlb.PANEL_LIST, 300, -9999, 456, 16, 0, 0);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_CAPITOLO, MyGlb.PANEL_FORM, 0, 171, 620, 481, 0, 0);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_CAPITOLO, 0, 46);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_CAPITOLO, 1, 13);
    PAN_FINANDACRONO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_CAPITOLO, 0, 4);
    PAN_FINANDACRONO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_CAPITOLO, 1, 4);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_FINANZIAMENT, "7C78CEA6-68C3-4656-ACBB-76B5793AC87B");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_FINANZIAMENT, "Finanziamento");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_FINANZIAMENT, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_FINANZIAMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_FINANZIAMENT, MyGlb.PANEL_LIST, 756, -9999, 300, 16, 0, 0);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_FINANZIAMENT, MyGlb.PANEL_FORM, 0, 471, 692, 217, 0, 0);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_FINANZIAMENT, 0, 83);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_FINANZIAMENT, 1, 13);
    PAN_FINANDACRONO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_FINANZIAMENT, 0, 4);
    PAN_FINANDACRONO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_FINANZIAMENT, 1, 4);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_DATICALCOLAT, "86A8A1B5-2AB0-4E18-9D28-F6D939705E71");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_DATICALCOLAT, "Dati Calcolati");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_DATICALCOLAT, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_DATICALCOLAT, MyGlb.VIS_GROUPSTYLE);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_DATICALCOLAT, MyGlb.PANEL_LIST, 1056, -9999, 364, 16, 0, 0);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_DATICALCOLAT, MyGlb.PANEL_FORM, 0, 495, 224, 529, 0, 0);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_DATICALCOLAT, 0, 74);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_DATICALCOLAT, 1, 13);
    PAN_FINANDACRONO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_DATICALCOLAT, 0, 4);
    PAN_FINANDACRONO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_DATICALCOLAT, 1, 4);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_DATICALCOLAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_ANOMALIA, "EC94F14C-D3AB-4925-AB84-9580F47AEDA9");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_ANOMALIA, "Anomalia");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_ANOMALIA, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_ANOMALIA, MyGlb.VIS_GROUPSTYLE);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_ANOMALIA, MyGlb.PANEL_LIST, 2136, -9999, 452, 16, 0, 0);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_ANOMALIA, MyGlb.PANEL_FORM, 0, 543, 632, 457, 0, 0);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_ANOMALIA, 0, 53);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_ANOMALIA, 1, 13);
    PAN_FINANDACRONO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_ANOMALIA, 0, 4);
    PAN_FINANDACRONO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_ANOMALIA, 1, 4);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_GROUP, GRP_FINANDACRONO_ANOMALIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FINANDACRONO.SetSize(MyGlb.OBJ_FIELD, 27);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_SELEZIONE, "80181324-962D-4138-BBFF-0772627243AF");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_SELEZIONE, "Selez.");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_SELEZIONE, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_SELEZIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_SELEZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ICONAANOMALI, "F270C651-F958-489C-951A-AC65A0194B84");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ICONAANOMALI, " ");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ICONAANOMALI, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ICONAANOMALI, MyGlb.VIS_HYPELINKIMMA);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ICONAANOMALI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_OPERA, "1EA923FE-2413-42AE-A3C1-6D347A99750F");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_OPERA, "Codice");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_OPERA, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_OPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIZOPERA, "21700070-97F4-4081-9EDD-07B3BFC0F476");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIZOPERA, "Descrizione");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIZOPERA, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIZOPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIZOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESSIVO, "3F9AC1B5-78E7-4AA3-AADF-4D924415F54E");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESSIVO, "Riga");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESSIVO, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ES, "7593D643-995F-4399-9BCF-0D1DD9A67EAD");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ES, "Parte");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ES, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOARTICO, "7FC78975-7173-4B04-A663-A371BE8A84E7");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOARTICO, "Capitolo");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOARTICO, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOARTICO, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOARTICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOLO, "77DDAF46-8B18-4AF9-B7CE-B6E519D87362");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOLO, "Capitolo");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOLO, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOLO, 0, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ARTICOLO, "4FFFCEA6-006B-46C9-95AD-32BC817D23D8");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ARTICOLO, "Art.");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ARTICOLO, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ARTICOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ARTICOLO, 0, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPDESCRIZIO, "63CE3D91-B7EA-4763-A301-91F13D22EDA9");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPDESCRIZIO, "Descrizione");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPDESCRIZIO, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_INFOCAPITOLO, "EB5F706D-C5FB-4678-AE0B-2C26479B5D08");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_INFOCAPITOLO, " ");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_INFOCAPITOLO, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_INFOCAPITOLO, MyGlb.VIS_HYPELINKIMMA);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_INFOCAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZIAMENT, "F5DDC435-5A79-48C3-A075-943260C9E4C3");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZIAMENT, "Codice");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZIAMENT, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZDESCRI, "BDA54DD0-679C-46A3-B7F4-887974EF69C4");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZDESCRI, "Descrizione");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZDESCRI, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNPURODACRO, "C1A7517A-9C36-4706-A6A3-14C4967558AC");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNPURODACRO, "Puro da Crono");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNPURODACRO, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNPURODACRO, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNPURODACRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_REISCRIDASTN, "4839749D-BDE6-4A55-8BCD-837DEA750E8A");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_REISCRIDASTN, "Reiscr. da Stanziamento");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_REISCRIDASTN, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_REISCRIDASTN, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_REISCRIDASTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNINICO, "C3DCAE1E-0D8F-4B47-87C7-B0A4F615E197");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNINICO, "Competenza Totale");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNINICO, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNINICO, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNINICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGNATO, "A13590FC-B4AF-48FC-9779-ED364C1E0851");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGNATO, "Totale Impegnato Accertato");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGNATO, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGNATO, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGNATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGREISSTN, "DC2FB4DC-C951-4B6F-901D-7426231E85BB");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGREISSTN, "Impegnato da Reiscrizione da Stn");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGREISSTN, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGREISSTN, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGREISSTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEF, "B19C7BE4-FF14-4871-AE18-B741FD3D9743");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEF, "Variazioni Definitive");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEF, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEF, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEFREISTN, "B46A27AB-F8AE-4CAE-86F6-39CFF2660BA4");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEFREISTN, "Variazioni Definitive da Reiscrizione Stn");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEFREISTN, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEFREISTN, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEFREISTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROV, "7379E841-F5A5-42FD-A029-C466B85E6867");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROV, "Variazioni Provvisorie");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROV, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROREISTN, "FC424E55-F1F8-497C-AD3F-4D14946750B3");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROREISTN, "Variazioni Provvisorie da Reiscrizione Stn");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROREISTN, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROREISTN, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROREISTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DETTAGANOMAL, "836412DC-3C54-4CBA-843E-DF2AEEA6094D");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DETTAGANOMAL, " ");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DETTAGANOMAL, "Dettaglio Anomalia");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DETTAGANOMAL, MyGlb.VIS_HYPLINIMLOU1);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DETTAGANOMAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIANOMAL, "63CAF8EF-3C1E-443B-BDB0-6D31BE896A0B");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIANOMAL, "Descrizione Anomalia");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIANOMAL, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIANOMAL, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIANOMAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ESERCIZIPLUR, "2F59CDA1-87CF-474D-8174-F1643B050F75");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ESERCIZIPLUR, "ESERCIZIO PLUR");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ESERCIZIPLUR, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ESERCIZIPLUR, MyGlb.VIS_NONNULLAFIEL);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ESERCIZIPLUR, 0, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESCRONO, "E8003376-0FF6-45BE-B22B-407DFA91657E");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESCRONO, "PROGRESSIVO CRONO");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESCRONO, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESCRONO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESCRONO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_FINANDACRONO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRSESSION, "F6106FBF-DD67-46D7-A2EB-BD4FB00E1672");
    PAN_FINANDACRONO.set_Header(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRSESSION, "PROGR SESSIONE");
    PAN_FINANDACRONO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRSESSION, "");
    PAN_FINANDACRONO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRSESSION, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FINANDACRONO.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRSESSION, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_FINANDACRONO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_SELEZIONE, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_SELEZIONE, MyGlb.PANEL_LIST, 68);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_SELEZIONE, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_SELEZIONE, MyGlb.PANEL_LIST, "Selez.");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_SELEZIONE, MyGlb.PANEL_FORM, 4, 352, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_SELEZIONE, MyGlb.PANEL_FORM, 68);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_SELEZIONE, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_SELEZIONE, MyGlb.PANEL_FORM, "Selez.");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_SELEZIONE, -1, -1);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_SELEZIONE, PPQRY_WRKGENFINDAC, "A.SELEZIONE", "SELEZIONE", 5, 2, 0, -13997);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_SELEZIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_SELEZIONE, (new IDVariant()), "Null", "", "", -1);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ICONAANOMALI, MyGlb.PANEL_LIST, 44, 36, 32, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ICONAANOMALI, MyGlb.PANEL_LIST, 96);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ICONAANOMALI, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ICONAANOMALI, MyGlb.PANEL_LIST, " ");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ICONAANOMALI, MyGlb.PANEL_FORM, 4, 328, 604, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ICONAANOMALI, MyGlb.PANEL_FORM, 96);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ICONAANOMALI, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ICONAANOMALI, MyGlb.PANEL_FORM, " ");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_ICONAANOMALI, -1, -1);
    PAN_FINANDACRONO.SetFieldUnbound(PFL_FINANDACRONO_ICONAANOMALI, true);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_ICONAANOMALI, PPQRY_WRKGENFINDAC, "CASE WHEN NVL(A.ANOMALIA, 'NO') = 'SI' THEN 'E1' ELSE 'OK' END", "ICONAANOMALI", 5, 99, 0, -13997);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_ICONAANOMALI, (new IDVariant("OK")), "Faccina Verde", "", "smileverde.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_ICONAANOMALI, (new IDVariant("E1")), "Faccina rossa (Errore 1)", "Non è stata indica l'Entrata per il Piano", "smilerosso.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_ICONAANOMALI, (new IDVariant("E2")), "Faccina rossa (Errore 2)", "Il totale degli importi del Piano non coincide con il totale importi del folder Entrata", "smilerosso.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_ICONAANOMALI, (new IDVariant("E3")), "Faccina rossa (Errore 3)", "L'importo del Piano non coincide con il totale importi del folder Entrata con esercizio spesa uguale all'anno pluriennale della riga", "smilerosso.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_ICONAANOMALI, (new IDVariant("E4")), "Faccina rossa (Errore 4)", "Esistono Variazioni sul Piano per le quali non è stata generata la Variazione di Bilancio", "smilerosso.gif", -1);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_OPERA, MyGlb.PANEL_LIST, 76, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_OPERA, MyGlb.PANEL_LIST, 48);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_OPERA, MyGlb.PANEL_LIST, "Codice");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_OPERA, MyGlb.PANEL_FORM, 4, 376, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_OPERA, MyGlb.PANEL_FORM, 48);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_OPERA, MyGlb.PANEL_FORM, "Codice");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_OPERA, -1, GRP_FINANDACRONO_OPERA);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_OPERA, PPQRY_WRKGENFINDAC, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIZOPERA, MyGlb.PANEL_LIST, 124, 36, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIZOPERA, MyGlb.PANEL_LIST, 224);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIZOPERA, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIZOPERA, MyGlb.PANEL_LIST, "Descrizione");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIZOPERA, MyGlb.PANEL_FORM, 4, 4, 660, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIZOPERA, MyGlb.PANEL_FORM, 224);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIZOPERA, MyGlb.PANEL_FORM, 2);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIZOPERA, MyGlb.PANEL_FORM, "Descrizione");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_DESCRIZOPERA, -1, GRP_FINANDACRONO_OPERA);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_DESCRIZOPERA, PPQRY_OPERE, "A.DESCRIZIONE", "OPEREDESCRIZ", 5, 200, 0, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESSIVO, MyGlb.PANEL_LIST, 300, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESSIVO, MyGlb.PANEL_LIST, "Riga");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 688, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESSIVO, MyGlb.PANEL_FORM, "Riga");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_PROGRESSIVO, -1, -1);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_PROGRESSIVO, PPQRY_WRKGENFINDAC, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ES, MyGlb.PANEL_LIST, 300, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ES, MyGlb.PANEL_LIST, 24);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ES, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ES, MyGlb.PANEL_LIST, "Parte");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ES, MyGlb.PANEL_FORM, 4, 400, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ES, MyGlb.PANEL_FORM, 24);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ES, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ES, MyGlb.PANEL_FORM, "Pr.");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_ES, -1, GRP_FINANDACRONO_CAPITOLO);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_ES, PPQRY_WRKGENFINDAC, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOARTICO, MyGlb.PANEL_LIST, 344, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOARTICO, MyGlb.PANEL_LIST, 104);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOARTICO, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOARTICO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOARTICO, MyGlb.PANEL_FORM, 4, 616, 612, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOARTICO, MyGlb.PANEL_FORM, 104);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOARTICO, MyGlb.PANEL_FORM, 2);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOARTICO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_CAPITOARTICO, -1, GRP_FINANDACRONO_CAPITOLO);
    PAN_FINANDACRONO.SetFieldUnbound(PFL_FINANDACRONO_CAPITOARTICO, true);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_CAPITOARTICO, PPQRY_WRKGENFINDAC, "TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO )", "CAPITOARTICO", 5, 199, 0, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOLO, MyGlb.PANEL_LIST, 836, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOLO, MyGlb.PANEL_FORM, 4, 424, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_CAPITOLO, -1, GRP_FINANDACRONO_CAPITOLO);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_CAPITOLO, PPQRY_WRKGENFINDAC, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ARTICOLO, MyGlb.PANEL_LIST, 836, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ARTICOLO, MyGlb.PANEL_FORM, 4, 448, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_ARTICOLO, -1, GRP_FINANDACRONO_CAPITOLO);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_ARTICOLO, PPQRY_WRKGENFINDAC, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPDESCRIZIO, MyGlb.PANEL_LIST, 504, 36, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPDESCRIZIO, MyGlb.PANEL_FORM, 4, 196, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPDESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_CAPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_CAPDESCRIZIO, -1, GRP_FINANDACRONO_CAPITOLO);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_CAPDESCRIZIO, PPQRY_CAP, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_INFOCAPITOLO, MyGlb.PANEL_LIST, 736, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_INFOCAPITOLO, MyGlb.PANEL_LIST, 116);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_INFOCAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_INFOCAPITOLO, MyGlb.PANEL_LIST, " ");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_INFOCAPITOLO, MyGlb.PANEL_FORM, 4, 304, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_INFOCAPITOLO, MyGlb.PANEL_FORM, 116);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_INFOCAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_INFOCAPITOLO, MyGlb.PANEL_FORM, " ");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_INFOCAPITOLO, -1, GRP_FINANDACRONO_CAPITOLO);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_INFOCAPITOLO, PPQRY_INFOCAPITOLO, "'I'", "INFOCAPITOLO", 5, 1, 0, -13997);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_INFOCAPITOLO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZIAMENT, MyGlb.PANEL_LIST, 756, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZIAMENT, MyGlb.PANEL_LIST, "Codice");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 496, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZIAMENT, MyGlb.PANEL_FORM, "Codice");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_FINANZIAMENT, -1, GRP_FINANDACRONO_FINANZIAMENT);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_FINANZIAMENT, PPQRY_WRKGENFINDAC, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZDESCRI, MyGlb.PANEL_LIST, 804, 36, 252, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZDESCRI, MyGlb.PANEL_LIST, 176);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZDESCRI, MyGlb.PANEL_LIST, "Descrizione");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZDESCRI, MyGlb.PANEL_FORM, 4, 652, 684, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZDESCRI, MyGlb.PANEL_FORM, 176);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZDESCRI, MyGlb.PANEL_FORM, 2);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_FINANZDESCRI, MyGlb.PANEL_FORM, "Descrizione");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_FINANZDESCRI, -1, GRP_FINANDACRONO_FINANZIAMENT);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_FINANZDESCRI, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNPURODACRO, MyGlb.PANEL_LIST, 1056, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNPURODACRO, MyGlb.PANEL_LIST, 124);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNPURODACRO, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNPURODACRO, MyGlb.PANEL_LIST, "Puro da Crono");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNPURODACRO, MyGlb.PANEL_FORM, 4, 544, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNPURODACRO, MyGlb.PANEL_FORM, 124);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNPURODACRO, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNPURODACRO, MyGlb.PANEL_FORM, "Puro da Crono");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_STNPURODACRO, -1, GRP_FINANDACRONO_DATICALCOLAT);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_STNPURODACRO, PPQRY_WRKGENFINDAC, "A.STN_PURO_DA_CRONO", "STN_PURO_DA_CRONO", 3, 14, 2, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_REISCRIDASTN, MyGlb.PANEL_LIST, 1144, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_REISCRIDASTN, MyGlb.PANEL_LIST, 124);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_REISCRIDASTN, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_REISCRIDASTN, MyGlb.PANEL_LIST, "Reiscr. da Stanziamento");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_REISCRIDASTN, MyGlb.PANEL_FORM, 4, 520, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_REISCRIDASTN, MyGlb.PANEL_FORM, 124);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_REISCRIDASTN, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_REISCRIDASTN, MyGlb.PANEL_FORM, "Reis. da Stanziam.");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_REISCRIDASTN, -1, GRP_FINANDACRONO_DATICALCOLAT);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_REISCRIDASTN, PPQRY_WRKGENFINDAC, "A.REISCRIZIONI_DA_STN", "REISCRIZIONI_DA_STN", 3, 14, 2, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNINICO, MyGlb.PANEL_LIST, 1288, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNINICO, MyGlb.PANEL_LIST, 64);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNINICO, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNINICO, MyGlb.PANEL_LIST, "Competenza Totale");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNINICO, MyGlb.PANEL_FORM, 4, 1000, 216, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNINICO, MyGlb.PANEL_FORM, 64);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNINICO, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_STNINICO, MyGlb.PANEL_FORM, "Cmp. Tot.");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_STNINICO, -1, GRP_FINANDACRONO_DATICALCOLAT);
    PAN_FINANDACRONO.SetFieldUnbound(PFL_FINANDACRONO_STNINICO, true);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_STNINICO, PPQRY_WRKGENFINDAC, "NVL(A.STN_PURO_DA_CRONO, 0) + NVL(A.REISCRIZIONI_DA_STN, 0)", "STNINICO", 3, 28, 6, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGNATO, MyGlb.PANEL_LIST, 1420, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGNATO, MyGlb.PANEL_LIST, 76);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGNATO, MyGlb.PANEL_LIST, "Totale Impegnato Accertato");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGNATO, MyGlb.PANEL_FORM, 4, 832, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGNATO, MyGlb.PANEL_FORM, 76);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGNATO, MyGlb.PANEL_FORM, "Tt. Imp. Acc.");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_IMPEGNATO, -1, -1);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_IMPEGNATO, PPQRY_WRKGENFINDAC, "A.IMPEGNATO", "IMPEGNATO", 3, 14, 2, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGREISSTN, MyGlb.PANEL_LIST, 1540, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGREISSTN, MyGlb.PANEL_LIST, 136);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGREISSTN, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGREISSTN, MyGlb.PANEL_LIST, "Impegnato da Reiscrizione da Stn");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGREISSTN, MyGlb.PANEL_FORM, 4, 856, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGREISSTN, MyGlb.PANEL_FORM, 136);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGREISSTN, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_IMPEGREISSTN, MyGlb.PANEL_FORM, "Imp. da Reiscr. da Stn");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_IMPEGREISSTN, -1, -1);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_IMPEGREISSTN, PPQRY_WRKGENFINDAC, "A.IMPEGNATO_REISC_STN", "IMPEGNATO_REISC_STN", 3, 14, 2, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEF, MyGlb.PANEL_LIST, 1676, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEF, MyGlb.PANEL_LIST, 56);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEF, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEF, MyGlb.PANEL_LIST, "Variazioni Definitive");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEF, MyGlb.PANEL_FORM, 4, 880, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEF, MyGlb.PANEL_FORM, 56);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEF, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEF, MyGlb.PANEL_FORM, "Var. Def.");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_VARDEF, -1, -1);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_VARDEF, PPQRY_WRKGENFINDAC, "A.VAR_DEF", "VAR_DEF", 3, 14, 2, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEFREISTN, MyGlb.PANEL_LIST, 1776, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEFREISTN, MyGlb.PANEL_LIST, 116);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEFREISTN, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEFREISTN, MyGlb.PANEL_LIST, "Variazioni Definitive da Reiscrizione Stn");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEFREISTN, MyGlb.PANEL_FORM, 4, 904, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEFREISTN, MyGlb.PANEL_FORM, 116);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEFREISTN, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARDEFREISTN, MyGlb.PANEL_FORM, "Var. Def. da Rs. Stn");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_VARDEFREISTN, -1, -1);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_VARDEFREISTN, PPQRY_WRKGENFINDAC, "A.VAR_DEF_REISC_STN", "VAR_DEF_REISC_STN", 3, 14, 2, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROV, MyGlb.PANEL_LIST, 1904, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROV, MyGlb.PANEL_LIST, 64);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROV, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROV, MyGlb.PANEL_LIST, "Variazioni Provvisorie");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROV, MyGlb.PANEL_FORM, 4, 928, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROV, MyGlb.PANEL_FORM, 64);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROV, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROV, MyGlb.PANEL_FORM, "Var. Prov.");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_VARPROV, -1, -1);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_VARPROV, PPQRY_WRKGENFINDAC, "A.VAR_PROV", "VAR_PROV", 3, 14, 2, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROREISTN, MyGlb.PANEL_LIST, 2000, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROREISTN, MyGlb.PANEL_LIST, 124);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROREISTN, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROREISTN, MyGlb.PANEL_LIST, "Variazioni Provvisorie da Reiscrizione Stn");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROREISTN, MyGlb.PANEL_FORM, 4, 952, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROREISTN, MyGlb.PANEL_FORM, 124);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROREISTN, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_VARPROREISTN, MyGlb.PANEL_FORM, "Var. Prv. da Reis. Stn");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_VARPROREISTN, -1, -1);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_VARPROREISTN, PPQRY_WRKGENFINDAC, "A.VAR_PROV_REISC_STN", "VAR_PROV_REISC_STN", 3, 14, 2, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DETTAGANOMAL, MyGlb.PANEL_LIST, 2136, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DETTAGANOMAL, MyGlb.PANEL_LIST, 116);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DETTAGANOMAL, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DETTAGANOMAL, MyGlb.PANEL_LIST, " ");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DETTAGANOMAL, MyGlb.PANEL_FORM, 4, 976, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DETTAGANOMAL, MyGlb.PANEL_FORM, 116);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DETTAGANOMAL, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DETTAGANOMAL, MyGlb.PANEL_FORM, " ");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_DETTAGANOMAL, -1, GRP_FINANDACRONO_ANOMALIA);
    PAN_FINANDACRONO.SetFieldUnbound(PFL_FINANDACRONO_DETTAGANOMAL, true);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_DETTAGANOMAL, PPQRY_WRKGENFINDAC, "CASE WHEN NVL(A.ANOMALIA, 'NO') = 'SI' THEN 'P' ELSE NULL END", "DETTAGANOMAL", 5, 99, 0, -13997);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FINANDACRONO.SetValueListItem(PFL_FINANDACRONO_DETTAGANOMAL, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FINANDACRONO.set_ImageResizeMode(PFL_FINANDACRONO_DETTAGANOMAL, 2);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIANOMAL, MyGlb.PANEL_LIST, 2156, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIANOMAL, MyGlb.PANEL_LIST, 148);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIANOMAL, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIANOMAL, MyGlb.PANEL_LIST, "Descrizione Anomalia");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIANOMAL, MyGlb.PANEL_FORM, 4, 568, 584, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIANOMAL, MyGlb.PANEL_FORM, 148);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIANOMAL, MyGlb.PANEL_FORM, 2);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_DESCRIANOMAL, MyGlb.PANEL_FORM, "Descrizione Anomalia");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_DESCRIANOMAL, -1, GRP_FINANDACRONO_ANOMALIA);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_DESCRIANOMAL, PPQRY_WRKGENFINDAC, "A.DESCRIZIONE_ANOMALIA", "DESCRIZIONE_ANOMALIA", 5, 4000, 0, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ESERCIZIPLUR, MyGlb.PANEL_LIST, 1156, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ESERCIZIPLUR, MyGlb.PANEL_LIST, 100);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ESERCIZIPLUR, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ESERCIZIPLUR, MyGlb.PANEL_LIST, "ESERCIZIO PLUR");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ESERCIZIPLUR, MyGlb.PANEL_FORM, 4, 472, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ESERCIZIPLUR, MyGlb.PANEL_FORM, 100);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ESERCIZIPLUR, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_ESERCIZIPLUR, MyGlb.PANEL_FORM, "ESERCIZIO PLUR");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_ESERCIZIPLUR, -1, -1);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_ESERCIZIPLUR, PPQRY_WRKGENFINDAC, "A.ESERCIZIO_PLUR", "ESERCIZIO_PLUR", 1, 4, 0, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESCRONO, MyGlb.PANEL_LIST, 1700, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESCRONO, MyGlb.PANEL_LIST, 128);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESCRONO, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESCRONO, MyGlb.PANEL_LIST, "PROGRESSIVO CRONO");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESCRONO, MyGlb.PANEL_FORM, 4, 712, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESCRONO, MyGlb.PANEL_FORM, 128);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESCRONO, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRESCRONO, MyGlb.PANEL_FORM, "PROGRESSIVO CRONO");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_PROGRESCRONO, -1, -1);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_PROGRESCRONO, PPQRY_WRKGENFINDAC, "A.PROGRESSIVO_CRONO", "PROGRESSIVO_CRONO", 3, 10, 0, -13997);
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRSESSION, MyGlb.PANEL_LIST, 1700, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRSESSION, MyGlb.PANEL_LIST, 104);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRSESSION, MyGlb.PANEL_LIST, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRSESSION, MyGlb.PANEL_LIST, "PROGR SESSIONE");
    PAN_FINANDACRONO.SetRect(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRSESSION, MyGlb.PANEL_FORM, 4, 736, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANDACRONO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRSESSION, MyGlb.PANEL_FORM, 104);
    PAN_FINANDACRONO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRSESSION, MyGlb.PANEL_FORM, 1);
    PAN_FINANDACRONO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANDACRONO_PROGRSESSION, MyGlb.PANEL_FORM, "PROGR SESSIONE");
    PAN_FINANDACRONO.SetFieldPage(PFL_FINANDACRONO_PROGRSESSION, -1, -1);
    PAN_FINANDACRONO.SetFieldPanel(PFL_FINANDACRONO_PROGRSESSION, PPQRY_WRKGENFINDAC, "A.PROGR_SESSIONE", "PROGR_SESSIONE", 3, 10, 0, -13997);
  }

  private void PAN_FINANDACRONO_InitQueries()
  {
    StringBuffer SQL;

    PAN_FINANDACRONO.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as OPEREDESCRIZ ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~OPERA~~) ");
    PAN_FINANDACRONO.SetQuery(PPQRY_OPERE, 0, SQL, -1, "");
    PAN_FINANDACRONO.SetQueryDB(PPQRY_OPERE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANDACRONO.SetMasterTable(PPQRY_OPERE, "OPERE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~ESERCIZIO_PLUR~~) ");
    PAN_FINANDACRONO.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_FINANDACRONO.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANDACRONO.SetMasterTable(PPQRY_CAP, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOCAPITOLO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~CAPITOLO~~ IS NULL)) AND NOT ((~~ARTICOLO~~ IS NULL))) ");
    PAN_FINANDACRONO.SetQuery(PPQRY_INFOCAPITOLO, 0, SQL, -1, "");
    PAN_FINANDACRONO.SetQueryDB(PPQRY_INFOCAPITOLO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANDACRONO.SetMasterTable(PPQRY_INFOCAPITOLO, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~FINANZIAMENTO~~) ");
    PAN_FINANDACRONO.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_FINANDACRONO.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANDACRONO.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    PAN_FINANDACRONO.SetIMDB(IMDB, "PQRY_WRKGENFINDAC", true);
    PAN_FINANDACRONO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SELEZIONE as SELEZIONE, ");
    SQL.append("  A.ANOMALIA as ANOMALIA, ");
    SQL.append("  CASE WHEN NVL(A.ANOMALIA, 'NO') = 'SI' THEN 'E1' ELSE 'OK' END as ICONAANOMALI, ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) as CAPITOARTICO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ESERCIZIO_PLUR as ESERCIZIO_PLUR, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.REISCRIZIONI_DA_STN as REISCRIZIONI_DA_STN, ");
    SQL.append("  A.STN_PURO_DA_CRONO as STN_PURO_DA_CRONO, ");
    SQL.append("  A.DESCRIZIONE_ANOMALIA as DESCRIZIONE_ANOMALIA, ");
    SQL.append("  A.PROGR_SESSIONE as PROGR_SESSIONE, ");
    SQL.append("  A.PROGRESSIVO_CRONO as PROGRESSIVO_CRONO, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.IMPEGNATO as IMPEGNATO, ");
    SQL.append("  A.IMPEGNATO_REISC_STN as IMPEGNATO_REISC_STN, ");
    SQL.append("  A.VAR_DEF as VAR_DEF, ");
    SQL.append("  A.VAR_DEF_REISC_STN as VAR_DEF_REISC_STN, ");
    SQL.append("  A.VAR_PROV as VAR_PROV, ");
    SQL.append("  A.VAR_PROV_REISC_STN as VAR_PROV_REISC_STN, ");
    SQL.append("  CASE WHEN NVL(A.ANOMALIA, 'NO') = 'SI' THEN 'P' ELSE NULL END as DETTAGANOMAL, ");
    SQL.append("  NVL(A.STN_PURO_DA_CRONO, 0) + NVL(A.REISCRIZIONI_DA_STN, 0) as STNINICO ");
    PAN_FINANDACRONO.SetQuery(PPQRY_WRKGENFINDAC, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_GEN_FIN_DA_CRONO_DET A ");
    PAN_FINANDACRONO.SetQuery(PPQRY_WRKGENFINDAC, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_FINANDACRONO.SetQuery(PPQRY_WRKGENFINDAC, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANDACRONO.SetQuery(PPQRY_WRKGENFINDAC, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANDACRONO.SetQuery(PPQRY_WRKGENFINDAC, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.OPERA, ");
    SQL.append("  A.PROGRESSIVO, ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.FINANZIAMENTO ");
    PAN_FINANDACRONO.SetQuery(PPQRY_WRKGENFINDAC, 5, SQL, -1, "");
    PAN_FINANDACRONO.SetQueryDB(PPQRY_WRKGENFINDAC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANDACRONO.SetMasterTable(0, "WRK_GEN_FIN_DA_CRONO_DET");
    PAN_FINANDACRONO.AddToSortList(PFL_FINANDACRONO_OPERA, true);
    PAN_FINANDACRONO.AddToSortList(PFL_FINANDACRONO_PROGRESSIVO, true);
    PAN_FINANDACRONO.AddToSortList(PFL_FINANDACRONO_ES, true);
    PAN_FINANDACRONO.AddToSortList(PFL_FINANDACRONO_CAPITOLO, true);
    PAN_FINANDACRONO.AddToSortList(PFL_FINANDACRONO_ARTICOLO, true);
    PAN_FINANDACRONO.AddToSortList(PFL_FINANDACRONO_FINANZIAMENT, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FINANDACRONO.Status() == 2)
    {
      int oldListQBE = PAN_FINANDACRONO.iUseListQBE;
      PAN_FINANDACRONO.iUseListQBE = 0;
      PAN_FINANDACRONO.PanelCommand(Glb.PCM_SEARCH);
      PAN_FINANDACRONO.PanelCommand(Glb.PCM_FIND);
      PAN_FINANDACRONO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMELAB_Init()
  {

    PAN_PARAMELAB.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMELAB.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMELAB.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, "54AD7522-12E8-4340-9CE4-5E748C43B5F1");
    PAN_PARAMELAB.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, "Annulla");
    PAN_PARAMELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMELAB.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, 0, "button1.gif", false);
    PAN_PARAMELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, "5F4FF5A9-4919-4832-BE78-32645CB4C7E1");
    PAN_PARAMELAB.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, "Elabora");
    PAN_PARAMELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMELAB.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARAMELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMELAB_UNO, "8F7925FD-2F5D-4CE3-B72A-AB935030FDBB");
    PAN_PARAMELAB.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMELAB_UNO, "Uno");
    PAN_PARAMELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMELAB_UNO, "");
    PAN_PARAMELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMELAB_UNO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMELAB_UNO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMELAB_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, MyGlb.PANEL_LIST, 196, 20, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, MyGlb.PANEL_FORM, 20, 12, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMELAB.SetFieldPage(PFL_PARAMELAB_ETICHEANNULL, -1, -1);
    PAN_PARAMELAB.SetFieldPanel(PFL_PARAMELAB_ETICHEANNULL, -1, "", "ETICHEANNULL", 0, 0, 0, -13997);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, MyGlb.PANEL_LIST, 204, 28, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, MyGlb.PANEL_FORM, 108, 12, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMELAB.SetFieldPage(PFL_PARAMELAB_ETICHEELABOR, -1, -1);
    PAN_PARAMELAB.SetFieldPanel(PFL_PARAMELAB_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_UNO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_UNO, MyGlb.PANEL_LIST, 32);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_UNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMELAB_UNO, MyGlb.PANEL_LIST, "Uno");
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_UNO, MyGlb.PANEL_FORM, 4, 48, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_UNO, MyGlb.PANEL_FORM, 32);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_UNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMELAB_UNO, MyGlb.PANEL_FORM, "Uno");
    PAN_PARAMELAB.SetFieldPage(PFL_PARAMELAB_UNO, -1, -1);
    PAN_PARAMELAB.SetFieldUnbound(PFL_PARAMELAB_UNO, true);
    PAN_PARAMELAB.SetFieldPanel(PFL_PARAMELAB_UNO, PPQRY_PATS5, "1", "UNO", 1, 19, 0, -13997);
  }

  private void PAN_PARAMELAB_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMELAB.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMELAB.SetIMDB(IMDB, "PQRY_PATS5", true);
    PAN_PARAMELAB.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  1 as UNO ");
    PAN_PARAMELAB.SetQuery(PPQRY_PATS5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_PARAMELAB.SetQuery(PPQRY_PATS5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMELAB.SetQuery(PPQRY_PATS5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMELAB.SetQuery(PPQRY_PATS5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMELAB.SetQuery(PPQRY_PATS5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PARAMELAB.SetQuery(PPQRY_PATS5, 5, SQL, -1, "");
    PAN_PARAMELAB.SetQueryDB(PPQRY_PATS5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMELAB.SetMasterTable(0, "DUAL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMELAB.Status() == 2)
    {
      int oldListQBE = PAN_PARAMELAB.iUseListQBE;
      PAN_PARAMELAB.iUseListQBE = 0;
      PAN_PARAMELAB.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMELAB.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMELAB.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMFILTRI) PAN_PARAMFILTRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FINANDACRONO) PAN_FINANDACRONO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMELAB) PAN_PARAMELAB_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMFILTRI) PAN_PARAMFILTRI_ValidateRow(Cancel);
    if (SrcObj == PAN_FINANDACRONO) PAN_FINANDACRONO_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMELAB) PAN_PARAMELAB_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMFILTRI) PAN_PARAMFILTRI_DynamicProperties();
    if (SrcObj == PAN_FINANDACRONO) PAN_FINANDACRONO_DynamicProperties();
    if (SrcObj == PAN_PARAMELAB) PAN_PARAMELAB_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMFILTRI) PAN_PARAMFILTRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FINANDACRONO) PAN_FINANDACRONO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMELAB) PAN_PARAMELAB_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMFILTRI) PAN_PARAMFILTRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_FINANDACRONO) PAN_FINANDACRONO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMELAB) PAN_PARAMELAB_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
