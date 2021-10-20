// **********************************************
// Dati Certificato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DatiCertificato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARA2013CONS_ETICHQUADR21 = 0;
  private static int PFL_PARA2013CONS_ETICHETTA3 = 1;
  private static int PFL_PARA2013CONS_PARTEACCANT1 = 2;
  private static int PFL_PARA2013CONS_PARTEVINCOL1 = 3;

  private static int PPQRY_PARAM128 = 0;


  IDPanel PAN_PARA2013CONS;
  private static int PFL_PARA2013PREV_ETICHQUADR20 = 0;
  private static int PFL_PARA2013PREV_ETICHETTA2 = 1;
  private static int PFL_PARA2013PREV_PARTEACCANTO = 2;
  private static int PFL_PARA2013PREV_PARTEVINCOLA = 3;
  private static int PFL_PARA2013PREV_UTILQUOTVINC = 4;

  private static int PPQRY_PARAM163 = 0;


  IDPanel PAN_PARA2013PREV;
  private static int PFL_PANNELELABOR_TIPOELABORAZ = 0;
  private static int PFL_PANNELELABOR_ETICHEELABOR = 1;

  private static int PPQRY_PARAM184 = 0;


  IDPanel PAN_PANNELELABOR;
  private static int PFL_QUADRICERTIF_PROGRESSIVO = 0;
  private static int PFL_QUADRICERTIF_TIPOCERTIFIC = 1;
  private static int PFL_QUADRICERTIF_ESERCIZIO = 2;
  private static int PFL_QUADRICERTIF_QUADRO = 3;
  private static int PFL_QUADRICERTIF_RIFQUADRO = 4;
  private static int PFL_QUADRICERTIF_DESCRIZIONE = 5;
  private static int PFL_QUADRICERTIF_PROCEDURA = 6;
  private static int PFL_QUADRICERTIF_DATARICALCOL = 7;
  private static int PFL_QUADRICERTIF_FONTE = 8;
  private static int PFL_QUADRICERTIF_PROGRSESSION = 9;
  private static int PFL_QUADRICERTIF_NOTE = 10;
  private static int PFL_QUADRICERTIF_PROCEDSTAMPA = 11;

  private static int PPQRY_QUADRICERTI1 = 0;

  private static int PPQRY_STAMPESALVAT = 1;


  IDPanel PAN_QUADRICERTIF;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM129(IMDB);
    //
    //
    Init_PQRY_PARAM128(IMDB);
    Init_PQRY_PARAM128_RS(IMDB);
    Init_PQRY_PARAM163(IMDB);
    Init_PQRY_PARAM163_RS(IMDB);
    Init_PQRY_PARAM184(IMDB);
    Init_PQRY_PARAM184_RS(IMDB);
    Init_PQRY_QUADRICERTI1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM129(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAM129, 5);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAM129, "TBL_PARAM129");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM129,IMDBDef4.FLD_PARAM129_PARAPARTACCA, "PARAPARTACCA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM129,IMDBDef4.FLD_PARAM129_PARAPARTACCA,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM129,IMDBDef4.FLD_PARAM129_PARAPARTVINC, "PARAPARTVINC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM129,IMDBDef4.FLD_PARAM129_PARAPARTVINC,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM129,IMDBDef4.FLD_PARAM129_PARUTIQUOVIN, "PARUTIQUOVIN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM129,IMDBDef4.FLD_PARAM129_PARUTIQUOVIN,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM129,IMDBDef4.FLD_PARAM129_PARATIPOELAB, "PARATIPOELAB");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM129,IMDBDef4.FLD_PARAM129_PARATIPOELAB,5,3,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM129,IMDBDef4.FLD_PARAM129_PARATIPOCERT, "PARATIPOCERT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM129,IMDBDef4.FLD_PARAM129_PARATIPOCERT,5,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAM129, 0);
  }

  private static void Init_PQRY_PARAM128(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAM128, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAM128, "PQRY_PARAM128");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM128,IMDBDef13.PQSL_PARAM128_PARAPARTACCA, "PARAPARTACCA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM128,IMDBDef13.PQSL_PARAM128_PARAPARTACCA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM128,IMDBDef13.PQSL_PARAM128_PARAPARTVINC, "PARAPARTVINC");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM128,IMDBDef13.PQSL_PARAM128_PARAPARTVINC,3,14,2);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAM128, 0);
  }

  private static void Init_PQRY_PARAM128_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAM128_RS, 2);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAM128_RS, "PQRY_PARAM128_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM128_RS,IMDBDef13.PQSL_PARAM128_PARAPARTACCA, "PARAPARTACCA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM128_RS,IMDBDef13.PQSL_PARAM128_PARAPARTACCA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM128_RS,IMDBDef13.PQSL_PARAM128_PARAPARTVINC, "PARAPARTVINC");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM128_RS,IMDBDef13.PQSL_PARAM128_PARAPARTVINC,3,14,2);
  }

  private static void Init_PQRY_PARAM163(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAM163, 3);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAM163, "PQRY_PARAM163");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM163,IMDBDef13.PQSL_PARAM163_PARAPARTACCA, "PARAPARTACCA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM163,IMDBDef13.PQSL_PARAM163_PARAPARTACCA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM163,IMDBDef13.PQSL_PARAM163_PARAPARTVINC, "PARAPARTVINC");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM163,IMDBDef13.PQSL_PARAM163_PARAPARTVINC,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM163,IMDBDef13.PQSL_PARAM163_PARUTIQUOVIN, "PARUTIQUOVIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM163,IMDBDef13.PQSL_PARAM163_PARUTIQUOVIN,3,14,2);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAM163, 0);
  }

  private static void Init_PQRY_PARAM163_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAM163_RS, 3);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAM163_RS, "PQRY_PARAM163_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM163_RS,IMDBDef13.PQSL_PARAM163_PARAPARTACCA, "PARAPARTACCA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM163_RS,IMDBDef13.PQSL_PARAM163_PARAPARTACCA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM163_RS,IMDBDef13.PQSL_PARAM163_PARAPARTVINC, "PARAPARTVINC");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM163_RS,IMDBDef13.PQSL_PARAM163_PARAPARTVINC,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM163_RS,IMDBDef13.PQSL_PARAM163_PARUTIQUOVIN, "PARUTIQUOVIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM163_RS,IMDBDef13.PQSL_PARAM163_PARUTIQUOVIN,3,14,2);
  }

  private static void Init_PQRY_PARAM184(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAM184, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAM184, "PQRY_PARAM184");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM184,IMDBDef13.PQSL_PARAM184_PARATIPOELAB, "PARATIPOELAB");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM184,IMDBDef13.PQSL_PARAM184_PARATIPOELAB,5,3,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAM184, 0);
  }

  private static void Init_PQRY_PARAM184_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAM184_RS, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAM184_RS, "PQRY_PARAM184_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM184_RS,IMDBDef13.PQSL_PARAM184_PARATIPOELAB, "PARATIPOELAB");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM184_RS,IMDBDef13.PQSL_PARAM184_PARATIPOELAB,5,3,0);
  }

  private static void Init_PQRY_QUADRICERTI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_QUADRICERTI1, 12);
    IMDB.set_TblCode(IMDBDef13.PQRY_QUADRICERTI1, "PQRY_QUADRICERTI1");
    IMDB.set_FldCode(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_TIPO_CERTIFICATO, "TIPO_CERTIFICATO");
    IMDB.SetFldParams(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_TIPO_CERTIFICATO,5,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_QUADRO, "QUADRO");
    IMDB.SetFldParams(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_QUADRO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_DESCRIZIONE,5,500,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_PROCEDURA, "PROCEDURA");
    IMDB.SetFldParams(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_PROCEDURA,5,200,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_DATA_RICALCOLO, "DATA_RICALCOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_DATA_RICALCOLO,6,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_RIF_QUADRO, "RIF_QUADRO");
    IMDB.SetFldParams(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_RIF_QUADRO,5,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_FONTE, "FONTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_FONTE,5,20,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_PROGR_SESSIONE, "PROGR_SESSIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_PROGR_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_PROCEDURA_STAMPA, "PROCEDURA_STAMPA");
    IMDB.SetFldParams(IMDBDef13.PQRY_QUADRICERTI1,IMDBDef13.PQSL_QUADRICERTI1_PROCEDURA_STAMPA,5,50,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_QUADRICERTI1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DatiCertificato(MyWebEntryPoint w, IMDBObj imdb)
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
  public DatiCertificato()
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
    FormIdx = MyGlb.FRM_DATICERTIFIC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BA6E1EB8-7E2D-4F80-90BF-B853BC44224C";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 932;
    DesignHeight = 594;
    set_Caption(new IDVariant("Dati Certificato"));
    //
    Frames = new AFrame[8];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 932;
    Frames[1].Height = 568;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.528169;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 932;
    Frames[2].Height = 300;
    Frames[2].Vertical = true;
    Frames[2].FormFactor = 0.453333;
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[2].ChildFrame1 = Frames[3];
    Frames[3].Width = 932;
    Frames[3].Height = 136;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Param 2013 Consuntivo";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 136;
    Frames[3].MinHeight = Frames[3].Height;
    Frames[3].MaxHeight = Frames[3].Height;
    PAN_PARA2013CONS = new IDPanel(w, this, 3, "PAN_PARA2013CONS");
    Frames[3].Content = PAN_PARA2013CONS;
    PAN_PARA2013CONS.Lockable = false;
    PAN_PARA2013CONS.iLocked = false;
    PAN_PARA2013CONS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARA2013CONS.VS = MainFrm.VisualStyleList;
    PAN_PARA2013CONS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 932-MyGlb.PAN_OFFS_X, 136-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARA2013CONS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3DAFC552-FC63-46F2-9C18-AE678CACE23C");
    PAN_PARA2013CONS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 200, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARA2013CONS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARA2013CONS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARA2013CONS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARA2013CONS.InitStatus = 1;
    PAN_PARA2013CONS_Init();
    PAN_PARA2013CONS_InitFields();
    PAN_PARA2013CONS_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[2].ChildFrame2 = Frames[4];
    Frames[4].Width = 932;
    Frames[4].Height = 164;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Param 2013 Preventivo";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 164;
    Frames[4].MinHeight = Frames[4].Height;
    Frames[4].MaxHeight = Frames[4].Height;
    PAN_PARA2013PREV = new IDPanel(w, this, 4, "PAN_PARA2013PREV");
    Frames[4].Content = PAN_PARA2013PREV;
    PAN_PARA2013PREV.Lockable = false;
    PAN_PARA2013PREV.iLocked = false;
    PAN_PARA2013PREV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARA2013PREV.VS = MainFrm.VisualStyleList;
    PAN_PARA2013PREV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 932-MyGlb.PAN_OFFS_X, 164-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARA2013PREV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "338D6D35-2E1B-41B0-B3CF-850DC0E1C95B");
    PAN_PARA2013PREV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 272, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARA2013PREV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARA2013PREV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARA2013PREV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARA2013PREV.InitStatus = 1;
    PAN_PARA2013PREV_Init();
    PAN_PARA2013PREV_InitFields();
    PAN_PARA2013PREV_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[1].ChildFrame2 = Frames[5];
    Frames[5].Width = 932;
    Frames[5].Height = 268;
    Frames[5].Vertical = true;
    Frames[5].FormFactor = 0.179104;
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[5].ChildFrame1 = Frames[6];
    Frames[6].Width = 932;
    Frames[6].Height = 48;
    Frames[6].FrHidden = true;
    Frames[6].Caption = "Pannello Elabora";
    Frames[6].Parent = this;
    Frames[6].FixedHeight = 48;
    Frames[6].MinHeight = Frames[6].Height;
    Frames[6].MaxHeight = Frames[6].Height;
    PAN_PANNELELABOR = new IDPanel(w, this, 6, "PAN_PANNELELABOR");
    Frames[6].Content = PAN_PANNELELABOR;
    PAN_PANNELELABOR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PANNELELABOR.VS = MainFrm.VisualStyleList;
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 932-MyGlb.PAN_OFFS_X, 48-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PANNELELABOR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FC10BED5-95F4-407B-AB71-A8C77E20C4E3");
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 108, 36, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PANNELELABOR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PANNELELABOR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PANNELELABOR.InitStatus = 1;
    PAN_PANNELELABOR_Init();
    PAN_PANNELELABOR_InitFields();
    PAN_PANNELELABOR_InitQueries();
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[5].ChildFrame2 = Frames[7];
    Frames[7].Width = 932;
    Frames[7].Height = 220;
    Frames[7].FrHidden = true;
    Frames[7].Caption = "Quadri Certificato";
    Frames[7].Parent = this;
    Frames[7].FixedHeight = 220;
    PAN_QUADRICERTIF = new IDPanel(w, this, 7, "PAN_QUADRICERTIF");
    Frames[7].Content = PAN_QUADRICERTIF;
    PAN_QUADRICERTIF.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_QUADRICERTIF.VS = MainFrm.VisualStyleList;
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 932-MyGlb.PAN_OFFS_X, 220-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_QUADRICERTIF.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "752360C2-92F1-49D5-98D1-311686320BD3");
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 884, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_QUADRICERTIF.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_QUADRICERTIF.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_QUADRICERTIF.InitStatus = 2;
    PAN_QUADRICERTIF_Init();
    PAN_QUADRICERTIF_InitFields();
    PAN_QUADRICERTIF_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAM129, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DATICERTIFIC_PARAM128();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_PARAM129, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DATICERTIFIC_PARAM163();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_PARAM129, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DATICERTIFIC_PARAM184();
      }
      PAN_PARA2013CONS.UpdatePanel(MainFrm);
      PAN_PARA2013PREV.UpdatePanel(MainFrm);
      PAN_PANNELELABOR.UpdatePanel(MainFrm);
      PAN_QUADRICERTIF.UpdatePanel(MainFrm);
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
    return (obj instanceof DatiCertificato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DatiCertificato.class.getName() : (Glb.ClassWithPackage(DatiCertificato.class) ? DatiCertificato.class.getName().substring(DatiCertificato.class.getPackage().getName().length() + 1) : DatiCertificato.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    int CurPos=0;
    IDCachedRowSet C5;
    IDCachedRowSet C12;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  STRUTTURA_CERTIFICATO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO_CERTIFICATO = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARATIPOCERT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.equals((new IDVariant(0)), true))
      {
        IDVariant v_AVVISO1 = new IDVariant(0,IDVariant.STRING);
        v_AVVISO1 = (new IDVariant("Non e' possibile generare il Certificato "));
        IDVariant v_AVVISO2 = new IDVariant(0,IDVariant.STRING);
        v_AVVISO2 = (new IDVariant(" perchè l'aggiornamento per questo esercizio non è ancora presente. Se il Decreto per il Certificato e' gia' stato pubblicato, contattare l'assistenza."));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_AVVISO1, ((IMDB.Value(IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARATIPOCERT, 0).equals((new IDVariant("PREV"))))?(new IDVariant("Preventivo")):(new IDVariant("Consuntivo")))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), v_AVVISO2)); 
        return 0;
      }
      if (IMDB.Value(IMDBDef13.PQRY_PARAM184, IMDBDef13.PQSL_PARAM184_PARATIPOELAB, 0).equals((new IDVariant("G")), true))
      {
        IDVariant I = null;
        I = (new IDVariant(1));
        IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_MESSAGGIOINT = new IDVariant(0,IDVariant.STRING);
        v_MESSAGGIOINT = (new IDVariant("I seguenti Quadri non sono stati elaborati:"));
        IDVariant v_MESSAGGIO = null;
        v_MESSAGGIO = (new IDVariant());
        PAN_QUADRICERTIF.PanelCommand(Glb.PCM_UPDATE);
        C5 = PAN_QUADRICERTIF.MasterRS();
        if (C5.size()>0) CurPos = C5.getRow(); else CurPos = 0;
        if (!C5.Bof()) PAN_QUADRICERTIF.GotoFirst();
        while (!PAN_QUADRICERTIF.RSEOF())
        {
          if (PAN_QUADRICERTIF.IsRowSelected(I.intValue()))
          {
            v_SELEZIONATO = (new IDVariant(-1));
            if (C5.Get("FONTE").equals((new IDVariant("Stampa Salvata")), true) && IDL.IsNull(C5.Get("PROGR_SESSIONE")))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Selezionare la stampa Salvata"));
              v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("<BR/>"))), (new IDVariant("Quadro"))), (new IDVariant(" "))), IDL.ToString(C5.Get("QUADRO"))), (new IDVariant("<BR/>"))), v_AVVISO);
            }
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_QUADRICERTIF.GotoNext();
        }
        if (CurPos>0) C5.absolute(CurPos);
        if (!(v_SELEZIONATO.booleanValue()))
        {
          IDVariant v_SAVVISO = new IDVariant(0,IDVariant.STRING);
          v_SAVVISO = (new IDVariant("Selezionare almeno uno Schema per procedere con l'elaborazione."));
          MainFrm.set_AlertMessage(v_SAVVISO); 
          return 0;
        }
        if (!(IDL.IsNull(v_MESSAGGIO)))
        {
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
          return 0;
        }
        I = (new IDVariant(1));
        v_MESSAGGIO = (new IDVariant());
        C12 = PAN_QUADRICERTIF.MasterRS();
        if (C12.size()>0) CurPos = C12.getRow(); else CurPos = 0;
        if (!C12.Bof()) PAN_QUADRICERTIF.GotoFirst();
        while (!PAN_QUADRICERTIF.RSEOF())
        {
          if (PAN_QUADRICERTIF.IsRowSelected(I.intValue()))
          {
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            if (IDL.IsNull(C12.Get("PROCEDURA_STAMPA")))
            {
              MainFrm.Cf4armDBObject.GENERAQUADROXML(C12.Get("ESERCIZIO"), MainFrm.PROGRESESSIO, C12.Get("QUADRO"), C12.Get("RIF_QUADRO"), IMDB.Value(IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARATIPOCERT, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
            }
            else
            {
              if (IMDB.Value(IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARATIPOCERT, 0).equals((new IDVariant("PREV")), true))
              {
                MainFrm.Cf4armDBObject.CERTPREVLANCIOPROCEDURAQUADRO(C12.Get("ESERCIZIO"), MainFrm.PROGRESESSIO, C12.Get("PROGR_SESSIONE"), C12.Get("QUADRO"), C12.Get("RIF_QUADRO"), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
              }
            }
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("<BR/>"))), (new IDVariant("Quadro"))), (new IDVariant(" "))), IDL.ToString(C12.Get("QUADRO"))), (new IDVariant("<BR/>"))), MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))));
            }
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_QUADRICERTIF.GotoNext();
        }
        if (CurPos>0) C12.absolute(CurPos);
        if (!(IDL.IsNull(v_MESSAGGIO)))
        {
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_MESSAGGIOINT, (new IDVariant("<BR/>"))), v_MESSAGGIO)); 
        }
        PAN_QUADRICERTIF.PanelCommand(Glb.PCM_REQUERY);
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI346, IMDBDef4.FLD_PARAMETRI346_PARATIPOCERT, 0, IMDB.Value(IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARATIPOCERT, 0));
      MainFrm.Show(MyGlb.FRM_CERTIFICATO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiCertificato", "EtichettaElabora", _e);
      return -1;
    }
  }

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
      set_Caption(IDL.Add(IDL.Add(this.Caption(), (new IDVariant(" "))), ((IMDB.Value(IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARATIPOCERT, 0).equals((new IDVariant("PREV"))))?(new IDVariant("Preventivo")):(new IDVariant("Consuntivo")))));
      IMDB.set_Value(IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARAPARTACCA, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARAPARTVINC, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARUTIQUOVIN, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARATIPOELAB, 0, (new IDVariant("G")));
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).compareTo((new IDVariant(2013)), true)!=0)
      {
        PAN_PARA2013PREV.set_Visible((new IDVariant(0)).booleanValue());
        PAN_PARA2013CONS.set_Visible((new IDVariant(0)).booleanValue());
      }
      else
      {
        if (IMDB.Value(IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARATIPOCERT, 0).equals((new IDVariant("PREV")), true))
        {
          PAN_PARA2013PREV.set_Visible((new IDVariant(-1)).booleanValue());
          PAN_PARA2013CONS.set_Visible((new IDVariant(0)).booleanValue());
        }
        else
        {
          PAN_PARA2013PREV.set_Visible((new IDVariant(0)).booleanValue());
          PAN_PARA2013CONS.set_Visible((new IDVariant(-1)).booleanValue());
        }
      }
      PAN_QUADRICERTIF.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_QUADRICERTIF.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_QUADRICERTIF.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_PANNELELABOR.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
      if (IMDB.Value(IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARATIPOCERT, 0).equals((new IDVariant("PREV")), true))
      {
        PAN_QUADRICERTIF.SetFlags (Glb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_QUADRICERTIF.SetFlags (Glb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_QUADRICERTIF.SetFlags (Glb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_QUADRICERTIF.SetFlags (Glb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiCertificato", "Load", _e);
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
      PAN_QUADRICERTIF.PanelCommand(Glb.PCM_CANCEL);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiCertificato", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pannello Elabora On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PANNELELABOR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PANNELELABOR);
      // 
      // Pannello Elabora On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef13.PQRY_PARAM184, IMDBDef13.PQSL_PARAM184_PARATIPOELAB, 0).equals((new IDVariant("G")), true))
      {
        IDVariant v_ELABORA = new IDVariant(0,IDVariant.STRING);
        v_ELABORA = (new IDVariant("Elabora"));
        PAN_QUADRICERTIF.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_PANNELELABOR.set_FieldText(PFL_PANNELELABOR_ETICHEELABOR, new IDVariant(v_ELABORA).stringValue());
      }
      else
      {
        IDVariant v_VISUALIZZA = new IDVariant(0,IDVariant.STRING);
        v_VISUALIZZA = (new IDVariant("Visualizza"));
        PAN_QUADRICERTIF.set_Visible((new IDVariant(0)).booleanValue());
        PAN_PANNELELABOR.set_FieldText(PFL_PANNELELABOR_ETICHEELABOR, new IDVariant(v_VISUALIZZA).stringValue());
      }
      PAN_QUADRICERTIF.set_ToolTip(Glb.OBJ_FIELD,PFL_QUADRICERTIF_DESCRIZIONE,(new IDVariant(PAN_QUADRICERTIF.FieldText(PFL_QUADRICERTIF_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiCertificato", "PannelloElaboraOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Pannello Elabora On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PANNELELABOR_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pannello Elabora On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PANNELELABOR_TIPOELABORAZ)), true))
      {
        if (IMDB.Value(IMDBDef13.PQRY_PARAM184, IMDBDef13.PQSL_PARAM184_PARATIPOELAB, 0).equals((new IDVariant("G")), true))
        {
          IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);
          v_TOOLTIP = (new IDVariant("Genera Dati per Certificati consente di ricalcolare i dati per il certificato per i quadri selezionati. Vengono sovrascritti i dati esistenti salvati precedentemente."));
          MainFrm.ShowTooltip(v_TOOLTIP.stringValue(),(new IDVariant("Tipo Elaborazione")).stringValue(),new IDVariant(PAN_PANNELELABOR.bFields(PFL_PANNELELABOR_TIPOELABORAZ).GetRD3Ident((new IDVariant(-1)).intValue(), (new IDVariant(0)).booleanValue())).stringValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant(0)).intValue(),(new IDVariant(750)).intValue(),(new IDVariant(4000)).intValue(),(new IDVariant(0)).booleanValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant("info")).stringValue(),(new IDVariant(-1)).booleanValue()); 
        }
        else
        {
          IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);
          v_TOOLTIP = (new IDVariant("Visualizza Dati Esistenti mostra i dati generati nelle elaborazioni precedenti ed eventualmente aggiornati manualmente."));
          MainFrm.ShowTooltip(v_TOOLTIP.stringValue(),(new IDVariant("Tipo Elaborazione")).stringValue(),new IDVariant(PAN_PANNELELABOR.bFields(PFL_PANNELELABOR_TIPOELABORAZ).GetRD3Ident((new IDVariant(-1)).intValue(), (new IDVariant(0)).booleanValue())).stringValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant(0)).intValue(),(new IDVariant(750)).intValue(),(new IDVariant(4000)).intValue(),(new IDVariant(0)).booleanValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant("info")).stringValue(),(new IDVariant(-1)).booleanValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiCertificato", "PannelloElaboraOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Quadri Certificato On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_QUADRICERTIF_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Quadri Certificato On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_QUADRICERTIF_FONTE)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef13.PQRY_QUADRICERTI1, IMDBDef13.PQSL_QUADRICERTI1_FONTE, 0).equals((new IDVariant("Base Dati")), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_QUADRICERTI1, IMDBDef13.PQSL_QUADRICERTI1_PROGR_SESSIONE, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiCertificato", "QuadriCertificatoOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Quadri Certificato On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_QUADRICERTIF_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_QUADRICERTIF);
      // 
      // Quadri Certificato On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_QUADRICERTI1, IMDBDef13.PQSL_QUADRICERTI1_PROCEDURA_STAMPA, 0)))
      {
        PAN_QUADRICERTIF.SetFlags (Glb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_QUADRICERTIF.SetFlags (Glb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_QUADRICERTIF.SetFlags (Glb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_QUADRICERTI1, IMDBDef13.PQSL_QUADRICERTI1_FONTE, 0),(new IDVariant("Base Dati"))).equals((new IDVariant("Base Dati")), true))
        {
          PAN_QUADRICERTIF.SetFlags (Glb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_QUADRICERTIF.SetFlags (Glb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DatiCertificato", "QuadriCertificatoOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void DATICERTIFIC_PARAM128() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAM128_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM129, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAM129, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAM128_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAM128_RS, 0, IMDBDef4.TBL_PARAM129, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM128_RS, 0, 0, IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARAPARTACCA, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM128_RS, 1, 0, IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARAPARTVINC, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAM129, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAM129, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM129, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAM128_RS, 0);
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void DATICERTIFIC_PARAM163() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAM163_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM129, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAM129, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAM163_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAM163_RS, 0, IMDBDef4.TBL_PARAM129, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM163_RS, 0, 0, IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARAPARTACCA, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM163_RS, 1, 0, IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARAPARTVINC, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM163_RS, 2, 0, IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARUTIQUOVIN, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAM129, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAM129, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM129, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAM163_RS, 0);
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void DATICERTIFIC_PARAM184() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAM184_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM129, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAM129, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAM184_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAM184_RS, 0, IMDBDef4.TBL_PARAM129, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM184_RS, 0, 0, IMDBDef4.TBL_PARAM129, IMDBDef4.FLD_PARAM129_PARATIPOELAB, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAM129, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAM129, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM129, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAM184_RS, 0);
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
  private void PAN_PARA2013CONS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARA2013CONS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARA2013CONS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARA2013CONS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARA2013CONS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARA2013CONS);
    // Stub
  }

  private void PAN_PARA2013CONS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARA2013CONS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARA2013CONS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARA2013CONS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARA2013PREV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARA2013PREV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARA2013PREV_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARA2013PREV, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARA2013PREV_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARA2013PREV);
    // Stub
  }

  private void PAN_PARA2013PREV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARA2013PREV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARA2013PREV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARA2013PREV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PANNELELABOR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PANNELELABOR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PANNELELABOR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PANNELELABOR, Cancel);
    // Stub
  }

  private void PAN_PANNELELABOR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PANNELELABOR_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PANNELELABOR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PANNELELABOR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PANNELELABOR_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PANNELELABOR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PANNELELABOR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_QUADRICERTIF_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_QUADRICERTIF, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_QUADRICERTIF_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_QUADRICERTIF, Cancel);
    // Stub
  }

  private void PAN_QUADRICERTIF_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_QUADRICERTIF_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_QUADRICERTIF_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_QUADRICERTIF_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_QUADRICERTIF_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARA2013CONS_Init()
  {

    PAN_PARA2013CONS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARA2013CONS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARA2013CONS.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARA2013CONS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHQUADR21, "20C9EE2F-1235-4BA0-A8F9-896D6EEC840E");
    PAN_PARA2013CONS.set_Header(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHQUADR21, "QUADRO 14 - PROSPETTO DIMOSTRATIVO DEL RISULTATO DI AMMINISTRAZIONE");
    PAN_PARA2013CONS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHQUADR21, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARA2013CONS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHQUADR21, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARA2013CONS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHETTA3, "AFCE0CAD-EE22-4B0F-AA62-4B3CC9372913");
    PAN_PARA2013CONS.set_Header(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHETTA3, "Composizione del risultato di amministrazione al 31 dicembre 2012");
    PAN_PARA2013CONS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHETTA3, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARA2013CONS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHETTA3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARA2013CONS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEACCANT1, "C35B75FC-1929-4E03-A171-BBD09D8F0005");
    PAN_PARA2013CONS.set_Header(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEACCANT1, "14120 - Totale parte accantonata (B)");
    PAN_PARA2013CONS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEACCANT1, "");
    PAN_PARA2013CONS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEACCANT1, MyGlb.VIS_NOFICFIMHELE);
    PAN_PARA2013CONS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEACCANT1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARA2013CONS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEVINCOL1, "2B392ACA-DD00-45AE-9F33-062F0D09376C");
    PAN_PARA2013CONS.set_Header(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEVINCOL1, "14130 - Totale parte vincolata (C)");
    PAN_PARA2013CONS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEVINCOL1, "");
    PAN_PARA2013CONS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEVINCOL1, MyGlb.VIS_NOFICFIMHELE);
    PAN_PARA2013CONS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEVINCOL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARA2013CONS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARA2013CONS.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHQUADR21, MyGlb.PANEL_LIST, 44, 8, 384, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013CONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHQUADR21, MyGlb.PANEL_LIST, 0);
    PAN_PARA2013CONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHQUADR21, MyGlb.PANEL_LIST, 1);
    PAN_PARA2013CONS.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHQUADR21, MyGlb.PANEL_FORM, 4, 8, 468, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013CONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHQUADR21, MyGlb.PANEL_FORM, 0);
    PAN_PARA2013CONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHQUADR21, MyGlb.PANEL_FORM, 1);
    PAN_PARA2013CONS.SetFieldPage(PFL_PARA2013CONS_ETICHQUADR21, -1, -1);
    PAN_PARA2013CONS.SetFieldPanel(PFL_PARA2013CONS_ETICHQUADR21, -1, "", "ETICHQUADR21", 0, 0, 0, -13997);
    PAN_PARA2013CONS.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHETTA3, MyGlb.PANEL_LIST, 52, 16, 384, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013CONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHETTA3, MyGlb.PANEL_LIST, 0);
    PAN_PARA2013CONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHETTA3, MyGlb.PANEL_LIST, 1);
    PAN_PARA2013CONS.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHETTA3, MyGlb.PANEL_FORM, 16, 36, 456, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013CONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHETTA3, MyGlb.PANEL_FORM, 0);
    PAN_PARA2013CONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_ETICHETTA3, MyGlb.PANEL_FORM, 1);
    PAN_PARA2013CONS.SetFieldPage(PFL_PARA2013CONS_ETICHETTA3, -1, -1);
    PAN_PARA2013CONS.SetFieldPanel(PFL_PARA2013CONS_ETICHETTA3, -1, "", "ETICHETTA3", 0, 0, 0, -13997);
    PAN_PARA2013CONS.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEACCANT1, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013CONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEACCANT1, MyGlb.PANEL_LIST, 116);
    PAN_PARA2013CONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEACCANT1, MyGlb.PANEL_LIST, 1);
    PAN_PARA2013CONS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEACCANT1, MyGlb.PANEL_LIST, "141. Tot. par. acc. B");
    PAN_PARA2013CONS.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEACCANT1, MyGlb.PANEL_FORM, 16, 80, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013CONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEACCANT1, MyGlb.PANEL_FORM, 224);
    PAN_PARA2013CONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEACCANT1, MyGlb.PANEL_FORM, 1);
    PAN_PARA2013CONS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEACCANT1, MyGlb.PANEL_FORM, "14120 - Totale parte accantonata (B)");
    PAN_PARA2013CONS.SetFieldPage(PFL_PARA2013CONS_PARTEACCANT1, -1, -1);
    PAN_PARA2013CONS.SetFieldPanel(PFL_PARA2013CONS_PARTEACCANT1, PPQRY_PARAM128, "A.PARAPARTACCA", "PARAPARTACCA", 3, 14, 2, -13997);
    PAN_PARA2013CONS.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEVINCOL1, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013CONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEVINCOL1, MyGlb.PANEL_LIST, 96);
    PAN_PARA2013CONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEVINCOL1, MyGlb.PANEL_LIST, 1);
    PAN_PARA2013CONS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEVINCOL1, MyGlb.PANEL_LIST, "14130 - Totale parte vincolata (C)");
    PAN_PARA2013CONS.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEVINCOL1, MyGlb.PANEL_FORM, 16, 108, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013CONS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEVINCOL1, MyGlb.PANEL_FORM, 224);
    PAN_PARA2013CONS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEVINCOL1, MyGlb.PANEL_FORM, 1);
    PAN_PARA2013CONS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARA2013CONS_PARTEVINCOL1, MyGlb.PANEL_FORM, "14130 - Totale parte vincolata (C)");
    PAN_PARA2013CONS.SetFieldPage(PFL_PARA2013CONS_PARTEVINCOL1, -1, -1);
    PAN_PARA2013CONS.SetFieldPanel(PFL_PARA2013CONS_PARTEVINCOL1, PPQRY_PARAM128, "A.PARAPARTVINC", "PARAPARTVINC", 3, 14, 2, -13997);
  }

  private void PAN_PARA2013CONS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARA2013CONS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARA2013CONS.SetIMDB(IMDB, "PQRY_PARAM128", true);
    PAN_PARA2013CONS.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARA2013CONS.SetQueryIMDB(PPQRY_PARAM128, IMDBDef13.PQRY_PARAM128_RS, IMDBDef4.TBL_PARAM129);
    JustLoaded = true;
    PAN_PARA2013CONS.SetFieldPrimaryIndex(PFL_PARA2013CONS_PARTEACCANT1, IMDBDef4.FLD_PARAM129_PARAPARTACCA);
    PAN_PARA2013CONS.SetFieldPrimaryIndex(PFL_PARA2013CONS_PARTEVINCOL1, IMDBDef4.FLD_PARAM129_PARAPARTVINC);
    PAN_PARA2013CONS.SetMasterTable(0, "PARAM129");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARA2013CONS.Status() == 2)
    {
      int oldListQBE = PAN_PARA2013CONS.iUseListQBE;
      PAN_PARA2013CONS.iUseListQBE = 0;
      PAN_PARA2013CONS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARA2013CONS.PanelCommand(Glb.PCM_FIND);
      PAN_PARA2013CONS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARA2013PREV_Init()
  {

    PAN_PARA2013PREV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARA2013PREV.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARA2013PREV.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PARA2013PREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHQUADR20, "0C8110B9-0B2C-45D4-81B8-A2BF8FA6F6C1");
    PAN_PARA2013PREV.set_Header(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHQUADR20, "Quadro 20 - Tabella Dimostrativa del Risultato di Amministrazione Presunto");
    PAN_PARA2013PREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHQUADR20, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARA2013PREV.SetFlags(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHQUADR20, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARA2013PREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHETTA2, "C9E54FC1-2C0C-4C82-806E-80261E289C05");
    PAN_PARA2013PREV.set_Header(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHETTA2, "2) Composizione del risultato di amministrazione Presunto al 31/12/2012");
    PAN_PARA2013PREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHETTA2, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARA2013PREV.SetFlags(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHETTA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARA2013PREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEACCANTO, "9C2092CA-6512-44C7-8240-6C0B6338F6D4");
    PAN_PARA2013PREV.set_Header(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEACCANTO, "20160 - Parte Accantonata");
    PAN_PARA2013PREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEACCANTO, "");
    PAN_PARA2013PREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEACCANTO, MyGlb.VIS_NOFICFIMHELE);
    PAN_PARA2013PREV.SetFlags(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEACCANTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARA2013PREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEVINCOLA, "A3BF74E8-D3DD-468A-ACB5-0FF81DB10580");
    PAN_PARA2013PREV.set_Header(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEVINCOLA, "20170 - Parte Vincolata");
    PAN_PARA2013PREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEVINCOLA, "");
    PAN_PARA2013PREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEVINCOLA, MyGlb.VIS_NOFICFIMHELE);
    PAN_PARA2013PREV.SetFlags(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEVINCOLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARA2013PREV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_UTILQUOTVINC, "2F4AB6D7-8200-4AAE-A67D-86C5206C9E6C");
    PAN_PARA2013PREV.set_Header(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_UTILQUOTVINC, "20190 - Utilizzo Quota Vincolata");
    PAN_PARA2013PREV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_UTILQUOTVINC, "");
    PAN_PARA2013PREV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_UTILQUOTVINC, MyGlb.VIS_NOFICFIMHELE);
    PAN_PARA2013PREV.SetFlags(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_UTILQUOTVINC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARA2013PREV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARA2013PREV.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHQUADR20, MyGlb.PANEL_LIST, 44, 8, 384, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013PREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHQUADR20, MyGlb.PANEL_LIST, 0);
    PAN_PARA2013PREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHQUADR20, MyGlb.PANEL_LIST, 1);
    PAN_PARA2013PREV.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHQUADR20, MyGlb.PANEL_FORM, 16, 8, 456, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013PREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHQUADR20, MyGlb.PANEL_FORM, 0);
    PAN_PARA2013PREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHQUADR20, MyGlb.PANEL_FORM, 1);
    PAN_PARA2013PREV.SetFieldPage(PFL_PARA2013PREV_ETICHQUADR20, -1, -1);
    PAN_PARA2013PREV.SetFieldPanel(PFL_PARA2013PREV_ETICHQUADR20, -1, "", "ETICHQUADR20", 0, 0, 0, -13997);
    PAN_PARA2013PREV.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHETTA2, MyGlb.PANEL_LIST, 52, 16, 384, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013PREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHETTA2, MyGlb.PANEL_LIST, 0);
    PAN_PARA2013PREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHETTA2, MyGlb.PANEL_LIST, 1);
    PAN_PARA2013PREV.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHETTA2, MyGlb.PANEL_FORM, 4, 36, 456, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013PREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHETTA2, MyGlb.PANEL_FORM, 0);
    PAN_PARA2013PREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_ETICHETTA2, MyGlb.PANEL_FORM, 1);
    PAN_PARA2013PREV.SetFieldPage(PFL_PARA2013PREV_ETICHETTA2, -1, -1);
    PAN_PARA2013PREV.SetFieldPanel(PFL_PARA2013PREV_ETICHETTA2, -1, "", "ETICHETTA2", 0, 0, 0, -13997);
    PAN_PARA2013PREV.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEACCANTO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013PREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEACCANTO, MyGlb.PANEL_LIST, 116);
    PAN_PARA2013PREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEACCANTO, MyGlb.PANEL_LIST, 1);
    PAN_PARA2013PREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEACCANTO, MyGlb.PANEL_LIST, "201. Par. Accant.");
    PAN_PARA2013PREV.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEACCANTO, MyGlb.PANEL_FORM, 16, 72, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013PREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEACCANTO, MyGlb.PANEL_FORM, 188);
    PAN_PARA2013PREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEACCANTO, MyGlb.PANEL_FORM, 1);
    PAN_PARA2013PREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEACCANTO, MyGlb.PANEL_FORM, "20160 - Parte Accantonata");
    PAN_PARA2013PREV.SetFieldPage(PFL_PARA2013PREV_PARTEACCANTO, -1, -1);
    PAN_PARA2013PREV.SetFieldPanel(PFL_PARA2013PREV_PARTEACCANTO, PPQRY_PARAM163, "A.PARAPARTACCA", "PARAPARTACCA", 3, 14, 2, -13997);
    PAN_PARA2013PREV.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEVINCOLA, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013PREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEVINCOLA, MyGlb.PANEL_LIST, 96);
    PAN_PARA2013PREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEVINCOLA, MyGlb.PANEL_LIST, 1);
    PAN_PARA2013PREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEVINCOLA, MyGlb.PANEL_LIST, "20170 - Parte Vincolata");
    PAN_PARA2013PREV.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEVINCOLA, MyGlb.PANEL_FORM, 16, 100, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013PREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEVINCOLA, MyGlb.PANEL_FORM, 188);
    PAN_PARA2013PREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEVINCOLA, MyGlb.PANEL_FORM, 1);
    PAN_PARA2013PREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_PARTEVINCOLA, MyGlb.PANEL_FORM, "20170 - Parte Vincolata");
    PAN_PARA2013PREV.SetFieldPage(PFL_PARA2013PREV_PARTEVINCOLA, -1, -1);
    PAN_PARA2013PREV.SetFieldPanel(PFL_PARA2013PREV_PARTEVINCOLA, PPQRY_PARAM163, "A.PARAPARTVINC", "PARAPARTVINC", 3, 14, 2, -13997);
    PAN_PARA2013PREV.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_UTILQUOTVINC, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013PREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_UTILQUOTVINC, MyGlb.PANEL_LIST, 144);
    PAN_PARA2013PREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_UTILQUOTVINC, MyGlb.PANEL_LIST, 1);
    PAN_PARA2013PREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_UTILQUOTVINC, MyGlb.PANEL_LIST, "201. Util. Quot. Vinc.");
    PAN_PARA2013PREV.SetRect(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_UTILQUOTVINC, MyGlb.PANEL_FORM, 16, 128, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARA2013PREV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_UTILQUOTVINC, MyGlb.PANEL_FORM, 188);
    PAN_PARA2013PREV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_UTILQUOTVINC, MyGlb.PANEL_FORM, 1);
    PAN_PARA2013PREV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARA2013PREV_UTILQUOTVINC, MyGlb.PANEL_FORM, "20190 - Utilizzo Quota Vincolata");
    PAN_PARA2013PREV.SetFieldPage(PFL_PARA2013PREV_UTILQUOTVINC, -1, -1);
    PAN_PARA2013PREV.SetFieldPanel(PFL_PARA2013PREV_UTILQUOTVINC, PPQRY_PARAM163, "A.PARUTIQUOVIN", "PARUTIQUOVIN", 3, 14, 2, -13997);
  }

  private void PAN_PARA2013PREV_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARA2013PREV.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARA2013PREV.SetIMDB(IMDB, "PQRY_PARAM163", true);
    PAN_PARA2013PREV.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARA2013PREV.SetQueryIMDB(PPQRY_PARAM163, IMDBDef13.PQRY_PARAM163_RS, IMDBDef4.TBL_PARAM129);
    JustLoaded = true;
    PAN_PARA2013PREV.SetFieldPrimaryIndex(PFL_PARA2013PREV_PARTEACCANTO, IMDBDef4.FLD_PARAM129_PARAPARTACCA);
    PAN_PARA2013PREV.SetFieldPrimaryIndex(PFL_PARA2013PREV_PARTEVINCOLA, IMDBDef4.FLD_PARAM129_PARAPARTVINC);
    PAN_PARA2013PREV.SetFieldPrimaryIndex(PFL_PARA2013PREV_UTILQUOTVINC, IMDBDef4.FLD_PARAM129_PARUTIQUOVIN);
    PAN_PARA2013PREV.SetMasterTable(0, "PARAM129");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARA2013PREV.Status() == 2)
    {
      int oldListQBE = PAN_PARA2013PREV.iUseListQBE;
      PAN_PARA2013PREV.iUseListQBE = 0;
      PAN_PARA2013PREV.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARA2013PREV.PanelCommand(Glb.PCM_FIND);
      PAN_PARA2013PREV.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PANNELELABOR_Init()
  {

    PAN_PANNELELABOR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PANNELELABOR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PANNELELABOR.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PANNELELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, "E31F8404-1010-42F8-8DBE-6ADC7C4F9AD4");
    PAN_PANNELELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, "Tipo Elaborazione");
    PAN_PANNELELABOR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, "");
    PAN_PANNELELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.VIS_OPTIONBUTTON);
    PAN_PANNELELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PANNELELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, "45CE0B3E-F17B-447E-B1F9-D035EC74A71D");
    PAN_PANNELELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, "Elabora");
    PAN_PANNELELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PANNELELABOR.SetImage(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PANNELELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PANNELELABOR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_LIST, 108);
    PAN_PANNELELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PANNELELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_LIST, "Tipo Elaborazione");
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_FORM, 48, 16, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_FORM, 108);
    PAN_PANNELELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PANNELELABOR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_TIPOELABORAZ, MyGlb.PANEL_FORM, "Tipo Elaborazione");
    PAN_PANNELELABOR.SetFieldPage(PFL_PANNELELABOR_TIPOELABORAZ, -1, -1);
    PAN_PANNELELABOR.SetFieldPanel(PFL_PANNELELABOR_TIPOELABORAZ, PPQRY_PARAM184, "A.PARATIPOELAB", "PARATIPOELAB", 5, 3, 0, -13997);
    PAN_PANNELELABOR.SetValueListItem(PFL_PANNELELABOR_TIPOELABORAZ, (new IDVariant("G")), "Genera Dati per Certificato", "Genera Dati per Certificati consente di ricalcolare i dati per il certificato per i quadri selezionati. Vengono sovrascritti i dati esistenti salvati precedentemente.", "", -1);
    PAN_PANNELELABOR.SetValueListItem(PFL_PANNELELABOR_TIPOELABORAZ, (new IDVariant("V")), "Visualizza Dati Esistenti", "Visualizza Dati Esistenti mostra i dati generati nelle elaborazioni precedenti ed eventualmente aggiornati manualmente.", "", -1);
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, MyGlb.PANEL_LIST, 376, 172, 76, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PANNELELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PANNELELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, MyGlb.PANEL_FORM, 344, 8, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANNELELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PANNELELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANNELELABOR_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PANNELELABOR.SetFieldPage(PFL_PANNELELABOR_ETICHEELABOR, -1, -1);
    PAN_PANNELELABOR.SetFieldPanel(PFL_PANNELELABOR_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PANNELELABOR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PANNELELABOR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PANNELELABOR.SetIMDB(IMDB, "PQRY_PARAM184", true);
    PAN_PANNELELABOR.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PANNELELABOR.SetQueryIMDB(PPQRY_PARAM184, IMDBDef13.PQRY_PARAM184_RS, IMDBDef4.TBL_PARAM129);
    JustLoaded = true;
    PAN_PANNELELABOR.SetFieldPrimaryIndex(PFL_PANNELELABOR_TIPOELABORAZ, IMDBDef4.FLD_PARAM129_PARATIPOELAB);
    PAN_PANNELELABOR.SetMasterTable(0, "PARAM129");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PANNELELABOR.Status() == 2)
    {
      int oldListQBE = PAN_PANNELELABOR.iUseListQBE;
      PAN_PANNELELABOR.iUseListQBE = 0;
      PAN_PANNELELABOR.PanelCommand(Glb.PCM_SEARCH);
      PAN_PANNELELABOR.PanelCommand(Glb.PCM_FIND);
      PAN_PANNELELABOR.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_QUADRICERTIF_Init()
  {

    PAN_QUADRICERTIF.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_QUADRICERTIF.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_QUADRICERTIF.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_QUADRICERTIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRESSIVO, "4487FF6F-F585-454D-BC68-E022A7BAECC4");
    PAN_QUADRICERTIF.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRESSIVO, "PROGRESSIVO");
    PAN_QUADRICERTIF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRESSIVO, "");
    PAN_QUADRICERTIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_QUADRICERTIF.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_QUADRICERTIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_TIPOCERTIFIC, "5AA3B0F3-F806-4382-AD50-5BA26FE42D14");
    PAN_QUADRICERTIF.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_TIPOCERTIFIC, "TIPO CERTIFICATO");
    PAN_QUADRICERTIF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_TIPOCERTIFIC, "");
    PAN_QUADRICERTIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_TIPOCERTIFIC, MyGlb.VIS_NONNULLAFIEL);
    PAN_QUADRICERTIF.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_TIPOCERTIFIC, 0, -1);
    PAN_QUADRICERTIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_ESERCIZIO, "798F03BE-EF09-4C34-8DA6-C6C2ED691F0A");
    PAN_QUADRICERTIF.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_ESERCIZIO, "ESERCIZIO");
    PAN_QUADRICERTIF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_ESERCIZIO, "");
    PAN_QUADRICERTIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_QUADRICERTIF.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_ESERCIZIO, 0, -1);
    PAN_QUADRICERTIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_QUADRO, "A8E1CE7E-F655-4BE6-91D4-6B3E7A42FD3B");
    PAN_QUADRICERTIF.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_QUADRO, "Quadro");
    PAN_QUADRICERTIF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_QUADRO, "");
    PAN_QUADRICERTIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_QUADRO, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRICERTIF.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_QUADRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_QUADRICERTIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_RIFQUADRO, "89F2AFED-D27C-40EA-8A8B-BCBAE0592656");
    PAN_QUADRICERTIF.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_RIFQUADRO, "Rif. Quadro");
    PAN_QUADRICERTIF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_RIFQUADRO, "");
    PAN_QUADRICERTIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_RIFQUADRO, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRICERTIF.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_RIFQUADRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRICERTIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DESCRIZIONE, "6E90E4C7-8DB7-4699-A018-6A4AA4C51558");
    PAN_QUADRICERTIF.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DESCRIZIONE, "Descrizione");
    PAN_QUADRICERTIF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DESCRIZIONE, "");
    PAN_QUADRICERTIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRICERTIF.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRICERTIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDURA, "BBA16D69-43FD-4F76-93BE-AF9AF0D7C431");
    PAN_QUADRICERTIF.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDURA, "PROCEDURA");
    PAN_QUADRICERTIF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDURA, "");
    PAN_QUADRICERTIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDURA, MyGlb.VIS_NORMFIELPADR);
    PAN_QUADRICERTIF.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDURA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRICERTIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DATARICALCOL, "9D5661AB-21BA-4CB1-8695-75531DF21498");
    PAN_QUADRICERTIF.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DATARICALCOL, "Data Ultima Elaborazione");
    PAN_QUADRICERTIF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DATARICALCOL, "");
    PAN_QUADRICERTIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DATARICALCOL, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRICERTIF.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DATARICALCOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRICERTIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, "D489F256-F385-4918-8A5A-88934B8D429A");
    PAN_QUADRICERTIF.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, "Fonte");
    PAN_QUADRICERTIF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, "");
    PAN_QUADRICERTIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRICERTIF.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRICERTIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, "379D3659-DCF0-4666-A5A3-8FB1DA6D1904");
    PAN_QUADRICERTIF.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, "Stampa Salvata");
    PAN_QUADRICERTIF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, "");
    PAN_QUADRICERTIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, MyGlb.VIS_NORMALFIELDS);
    PAN_QUADRICERTIF.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRICERTIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_NOTE, "6BAB255E-556D-4533-89D6-3661092B2E2A");
    PAN_QUADRICERTIF.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_NOTE, "NOTE");
    PAN_QUADRICERTIF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_NOTE, "");
    PAN_QUADRICERTIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_NOTE, MyGlb.VIS_NORMFIELPADR);
    PAN_QUADRICERTIF.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_NOTE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_QUADRICERTIF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDSTAMPA, "CAAA75D5-88A7-4570-8F1D-E3F9F5135268");
    PAN_QUADRICERTIF.set_Header(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDSTAMPA, "PROCEDURA STAMPA");
    PAN_QUADRICERTIF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDSTAMPA, "");
    PAN_QUADRICERTIF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDSTAMPA, MyGlb.VIS_NORMFIELPADR);
    PAN_QUADRICERTIF.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDSTAMPA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_QUADRICERTIF_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRESSIVO, MyGlb.PANEL_FORM, 128);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_QUADRICERTIF.SetFieldPage(PFL_QUADRICERTIF_PROGRESSIVO, -1, -1);
    PAN_QUADRICERTIF.SetFieldPanel(PFL_QUADRICERTIF_PROGRESSIVO, PPQRY_QUADRICERTI1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_TIPOCERTIFIC, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_TIPOCERTIFIC, MyGlb.PANEL_LIST, 112);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_TIPOCERTIFIC, MyGlb.PANEL_LIST, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_TIPOCERTIFIC, MyGlb.PANEL_LIST, "TP. CERTIF.");
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_TIPOCERTIFIC, MyGlb.PANEL_FORM, 4, 28, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_TIPOCERTIFIC, MyGlb.PANEL_FORM, 128);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_TIPOCERTIFIC, MyGlb.PANEL_FORM, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_TIPOCERTIFIC, MyGlb.PANEL_FORM, "TIPO CERTIFICATO");
    PAN_QUADRICERTIF.SetFieldPage(PFL_QUADRICERTIF_TIPOCERTIFIC, -1, -1);
    PAN_QUADRICERTIF.SetFieldPanel(PFL_QUADRICERTIF_TIPOCERTIFIC, PPQRY_QUADRICERTI1, "A.TIPO_CERTIFICATO", "TIPO_CERTIFICATO", 5, 10, 0, -13997);
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_ESERCIZIO, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_ESERCIZIO, MyGlb.PANEL_FORM, 128);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_QUADRICERTIF.SetFieldPage(PFL_QUADRICERTIF_ESERCIZIO, -1, -1);
    PAN_QUADRICERTIF.SetFieldPanel(PFL_QUADRICERTIF_ESERCIZIO, PPQRY_QUADRICERTI1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_QUADRO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_QUADRO, MyGlb.PANEL_LIST, 56);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_QUADRO, MyGlb.PANEL_LIST, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_QUADRO, MyGlb.PANEL_LIST, "Quadro");
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_QUADRO, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_QUADRO, MyGlb.PANEL_FORM, 128);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_QUADRO, MyGlb.PANEL_FORM, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_QUADRO, MyGlb.PANEL_FORM, "Quadro");
    PAN_QUADRICERTIF.SetFieldPage(PFL_QUADRICERTIF_QUADRO, -1, -1);
    PAN_QUADRICERTIF.SetFieldPanel(PFL_QUADRICERTIF_QUADRO, PPQRY_QUADRICERTI1, "A.QUADRO", "QUADRO", 1, 2, 0, -13997);
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_RIFQUADRO, MyGlb.PANEL_LIST, 56, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_RIFQUADRO, MyGlb.PANEL_LIST, 124);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_RIFQUADRO, MyGlb.PANEL_LIST, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_RIFQUADRO, MyGlb.PANEL_LIST, "Rif. Quadro");
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_RIFQUADRO, MyGlb.PANEL_FORM, 4, 172, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_RIFQUADRO, MyGlb.PANEL_FORM, 124);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_RIFQUADRO, MyGlb.PANEL_FORM, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_RIFQUADRO, MyGlb.PANEL_FORM, "Rif. Quadro");
    PAN_QUADRICERTIF.SetFieldPage(PFL_QUADRICERTIF_RIFQUADRO, -1, -1);
    PAN_QUADRICERTIF.SetFieldPanel(PFL_QUADRICERTIF_RIFQUADRO, PPQRY_QUADRICERTI1, "A.RIF_QUADRO", "RIF_QUADRO", 5, 10, 0, -13997);
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DESCRIZIONE, MyGlb.PANEL_LIST, 120, 36, 396, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_QUADRICERTIF.SetFieldPage(PFL_QUADRICERTIF_DESCRIZIONE, -1, -1);
    PAN_QUADRICERTIF.SetFieldPanel(PFL_QUADRICERTIF_DESCRIZIONE, PPQRY_QUADRICERTI1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 500, 0, -13997);
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDURA, MyGlb.PANEL_LIST, 56, 36, 224, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDURA, MyGlb.PANEL_LIST, 76);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDURA, MyGlb.PANEL_LIST, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDURA, MyGlb.PANEL_LIST, "PROCEDURA");
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDURA, MyGlb.PANEL_FORM, 4, 124, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDURA, MyGlb.PANEL_FORM, 128);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDURA, MyGlb.PANEL_FORM, 2);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDURA, MyGlb.PANEL_FORM, "PROCEDURA");
    PAN_QUADRICERTIF.SetFieldPage(PFL_QUADRICERTIF_PROCEDURA, -1, -1);
    PAN_QUADRICERTIF.SetFieldPanel(PFL_QUADRICERTIF_PROCEDURA, PPQRY_QUADRICERTI1, "A.PROCEDURA", "PROCEDURA", 5, 200, 0, -13997);
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DATARICALCOL, MyGlb.PANEL_LIST, 516, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DATARICALCOL, MyGlb.PANEL_LIST, 108);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DATARICALCOL, MyGlb.PANEL_LIST, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DATARICALCOL, MyGlb.PANEL_LIST, "Data Ultima Elaborazione");
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DATARICALCOL, MyGlb.PANEL_FORM, 4, 148, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DATARICALCOL, MyGlb.PANEL_FORM, 128);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DATARICALCOL, MyGlb.PANEL_FORM, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_DATARICALCOL, MyGlb.PANEL_FORM, "Dt. Ult. Elaborazione");
    PAN_QUADRICERTIF.SetFieldPage(PFL_QUADRICERTIF_DATARICALCOL, -1, -1);
    PAN_QUADRICERTIF.SetFieldPanel(PFL_QUADRICERTIF_DATARICALCOL, PPQRY_QUADRICERTI1, "A.DATA_RICALCOLO", "DATA_RICALCOLO", 6, 10, 0, -13997);
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, MyGlb.PANEL_LIST, 596, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, MyGlb.PANEL_LIST, 44);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, MyGlb.PANEL_LIST, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, MyGlb.PANEL_LIST, "Fonte");
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, MyGlb.PANEL_FORM, 4, 196, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, MyGlb.PANEL_FORM, 44);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, MyGlb.PANEL_FORM, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_FONTE, MyGlb.PANEL_FORM, "Fonte");
    PAN_QUADRICERTIF.SetFieldPage(PFL_QUADRICERTIF_FONTE, -1, -1);
    PAN_QUADRICERTIF.SetFieldPanel(PFL_QUADRICERTIF_FONTE, PPQRY_QUADRICERTI1, "A.FONTE", "FONTE", 5, 20, 0, -13997);
    PAN_QUADRICERTIF.SetValueListItem(PFL_QUADRICERTIF_FONTE, (new IDVariant("Base Dati")), "Base Dati", "", "", -1);
    PAN_QUADRICERTIF.SetValueListItem(PFL_QUADRICERTIF_FONTE, (new IDVariant("Stampa Salvata")), "Stampa Salvata", "", "", -1);
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, MyGlb.PANEL_LIST, 704, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, MyGlb.PANEL_LIST, 104);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, MyGlb.PANEL_LIST, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, MyGlb.PANEL_LIST, "Stampa Salvata");
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, MyGlb.PANEL_FORM, 4, 220, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, MyGlb.PANEL_FORM, 104);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, MyGlb.PANEL_FORM, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROGRSESSION, MyGlb.PANEL_FORM, "Stampa Salvata");
    PAN_QUADRICERTIF.SetFieldPage(PFL_QUADRICERTIF_PROGRSESSION, -1, -1);
    PAN_QUADRICERTIF.SetFieldPanel(PFL_QUADRICERTIF_PROGRSESSION, PPQRY_QUADRICERTI1, "A.PROGR_SESSIONE", "PROGR_SESSIONE", 3, 10, 0, -13997);
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_NOTE, MyGlb.PANEL_LIST, 4, 252, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_NOTE, MyGlb.PANEL_LIST, 96);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_NOTE, MyGlb.PANEL_LIST, 2);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_NOTE, MyGlb.PANEL_LIST, "NOTE");
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_NOTE, MyGlb.PANEL_FORM, 4, 172, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_NOTE, MyGlb.PANEL_FORM, 128);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_NOTE, MyGlb.PANEL_FORM, "NOTE");
    PAN_QUADRICERTIF.SetFieldPage(PFL_QUADRICERTIF_NOTE, -1, -1);
    PAN_QUADRICERTIF.SetFieldPanel(PFL_QUADRICERTIF_NOTE, PPQRY_QUADRICERTI1, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDSTAMPA, MyGlb.PANEL_LIST, 808, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDSTAMPA, MyGlb.PANEL_LIST, 128);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDSTAMPA, MyGlb.PANEL_LIST, "PROCEDURA STAMPA");
    PAN_QUADRICERTIF.SetRect(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDSTAMPA, MyGlb.PANEL_FORM, 4, 244, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADRICERTIF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDSTAMPA, MyGlb.PANEL_FORM, 128);
    PAN_QUADRICERTIF.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_QUADRICERTIF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADRICERTIF_PROCEDSTAMPA, MyGlb.PANEL_FORM, "PROCEDURA STAMPA");
    PAN_QUADRICERTIF.SetFieldPage(PFL_QUADRICERTIF_PROCEDSTAMPA, -1, -1);
    PAN_QUADRICERTIF.SetFieldPanel(PFL_QUADRICERTIF_PROCEDSTAMPA, PPQRY_QUADRICERTI1, "A.PROCEDURA_STAMPA", "PROCEDURA_STAMPA", 5, 50, 0, -13997);
  }

  private void PAN_QUADRICERTIF_InitQueries()
  {
    StringBuffer SQL;

    PAN_QUADRICERTIF.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_SESSIONE as STASALPROSES, ");
    SQL.append("  A.DATA_SALVATAGGIO as STASALDATSAL, ");
    SQL.append("  A.NOTA_SALVATAGGIO as STASALNOTSAL ");
    SQL.append("from ");
    SQL.append("  STAMPE_SALVATE A ");
    SQL.append("where (A.PROGR_SESSIONE = ~~PROGR_SESSIONE~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = 'BIL_PREVENTIVO') ");
    SQL.append("and   (A.PROCEDURA_STAMPA = ~~PROCEDURA_STAMPA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DATA_SALVATAGGIO desc ");
    PAN_QUADRICERTIF.SetQuery(PPQRY_STAMPESALVAT, 0, SQL, PFL_QUADRICERTIF_PROGRSESSION, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_SESSIONE as STASALPROSES, ");
    SQL.append("  A.DATA_SALVATAGGIO as STASALDATSAL, ");
    SQL.append("  A.NOTA_SALVATAGGIO as STASALNOTSAL ");
    SQL.append("from ");
    SQL.append("  STAMPE_SALVATE A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = 'BIL_PREVENTIVO') ");
    SQL.append("and   (A.PROCEDURA_STAMPA = ~~PROCEDURA_STAMPA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DATA_SALVATAGGIO desc ");
    PAN_QUADRICERTIF.SetQuery(PPQRY_STAMPESALVAT, 1, SQL, PFL_QUADRICERTIF_PROGRSESSION, "");
    PAN_QUADRICERTIF.SetQueryDB(PPQRY_STAMPESALVAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUADRICERTIF.SetIMDB(IMDB, "PQRY_QUADRICERTI1", true);
    PAN_QUADRICERTIF.set_SetString(MyGlb.MASTER_ROWNAME, "QUADRI CERTIFICATO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.TIPO_CERTIFICATO as TIPO_CERTIFICATO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.QUADRO as QUADRO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.PROCEDURA as PROCEDURA, ");
    SQL.append("  A.DATA_RICALCOLO as DATA_RICALCOLO, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.RIF_QUADRO as RIF_QUADRO, ");
    SQL.append("  A.FONTE as FONTE, ");
    SQL.append("  A.PROGR_SESSIONE as PROGR_SESSIONE, ");
    SQL.append("  A.PROCEDURA_STAMPA as PROCEDURA_STAMPA ");
    PAN_QUADRICERTIF.SetQuery(PPQRY_QUADRICERTI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  QUADRI_CERTIFICATO A ");
    PAN_QUADRICERTIF.SetQuery(PPQRY_QUADRICERTI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_CERTIFICATO = ~~TBL_PARAM129.PARATIPOCERT~~) ");
    PAN_QUADRICERTIF.SetQuery(PPQRY_QUADRICERTI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUADRICERTIF.SetQuery(PPQRY_QUADRICERTI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUADRICERTIF.SetQuery(PPQRY_QUADRICERTI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.QUADRO ");
    PAN_QUADRICERTIF.SetQuery(PPQRY_QUADRICERTI1, 5, SQL, -1, "");
    PAN_QUADRICERTIF.SetQueryDB(PPQRY_QUADRICERTI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUADRICERTIF.SetMasterTable(0, "QUADRI_CERTIFICATO");
    PAN_QUADRICERTIF.AddToSortList(PFL_QUADRICERTIF_QUADRO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_QUADRICERTIF.Status() == 2)
    {
      int oldListQBE = PAN_QUADRICERTIF.iUseListQBE;
      PAN_QUADRICERTIF.iUseListQBE = 0;
      PAN_QUADRICERTIF.PanelCommand(Glb.PCM_SEARCH);
      PAN_QUADRICERTIF.PanelCommand(Glb.PCM_FIND);
      PAN_QUADRICERTIF.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARA2013CONS) PAN_PARA2013CONS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARA2013PREV) PAN_PARA2013PREV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_QUADRICERTIF) PAN_QUADRICERTIF_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARA2013CONS) PAN_PARA2013CONS_ValidateRow(Cancel);
    if (SrcObj == PAN_PARA2013PREV) PAN_PARA2013PREV_ValidateRow(Cancel);
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_ValidateRow(Cancel);
    if (SrcObj == PAN_QUADRICERTIF) PAN_QUADRICERTIF_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARA2013CONS) PAN_PARA2013CONS_DynamicProperties();
    if (SrcObj == PAN_PARA2013PREV) PAN_PARA2013PREV_DynamicProperties();
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_DynamicProperties();
    if (SrcObj == PAN_QUADRICERTIF) PAN_QUADRICERTIF_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARA2013CONS) PAN_PARA2013CONS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARA2013PREV) PAN_PARA2013PREV_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_QUADRICERTIF) PAN_QUADRICERTIF_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARA2013CONS) PAN_PARA2013CONS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARA2013PREV) PAN_PARA2013PREV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PANNELELABOR) PAN_PANNELELABOR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_QUADRICERTIF) PAN_QUADRICERTIF_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
