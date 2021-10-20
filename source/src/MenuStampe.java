// **********************************************
// Menu Stampe
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MenuStampe extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_DESCRIZIONE1 = 0;
  private static int PFL_PARAMETRI_HASH = 1;

  private static int PPQRY_PARAMETRI583 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_DESCRIZIONE_DESCRIZIONE = 0;

  private static int PPQRY_NOTEFUNZIONA = 0;


  IDPanel PAN_DESCRIZIONE;
  ATree TRE_MENUSTAMPE;
  private static int PFL_PREFERITI_DESCRIZIRAM1 = 0;
  private static int PFL_PREFERITI_LINKSTAMPA1 = 1;
  private static int PFL_PREFERITI_PARAMETRLIN1 = 2;
  private static int PFL_PREFERITI_STORICO1 = 3;

  private static int PPQRY_MENUSTAMPREF = 0;


  IDPanel PAN_PREFERITI;
  private static int PFL_PIUUTILIZZAT_DESCRIZIRAMO = 0;
  private static int PFL_PIUUTILIZZAT_LINKSTAMPA = 1;
  private static int PFL_PIUUTILIZZAT_PARAMETRLINK = 2;
  private static int PFL_PIUUTILIZZAT_STORICO = 3;

  private static int PPQRY_MENUSTAMSTAT = 0;


  IDPanel PAN_PIUUTILIZZAT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI584(IMDB);
    //
    //
    Init_PQRY_MENUSTAMPE1(IMDB);
    Init_PQRY_MENUSTAMPE(IMDB);
    Init_PQRY_PARAMETRI583(IMDB);
    Init_PQRY_PARAMETRI583_RS(IMDB);
    Init_PQRY_NOTEFUNZIONA(IMDB);
    Init_PQRY_MENUSTAMPREF(IMDB);
    Init_PQRY_MENUSTAMSTAT(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI584(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI584, 2);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI584, "TBL_PARAMETRI584");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI584,IMDBDef7.FLD_PARAMETRI584_PARAMEDESCRI, "PARAMEDESCRI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI584,IMDBDef7.FLD_PARAMETRI584_PARAMEDESCRI,9,1000,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI584,IMDBDef7.FLD_PARAMETRI584_PARAMETRHASH, "PARAMETRHASH");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI584,IMDBDef7.FLD_PARAMETRI584_PARAMETRHASH,5,50,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI584, 0);
  }

  private static void Init_PQRY_MENUSTAMPE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_MENUSTAMPE1, 12);
    IMDB.set_TblCode(IMDBDef17.PQRY_MENUSTAMPE1, "PQRY_MENUSTAMPE1");
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMESTVDERA, "RECMESTVDERA");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMESTVDERA,5,500,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMENSTAVCO, "RECMENSTAVCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMENSTAVCO,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_TOOLTIP, "TOOLTIP");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_TOOLTIP,5,500,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMESTVTIRA, "RECMESTVTIRA");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMESTVTIRA,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMENSTAVL1, "RECMENSTAVL1");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMENSTAVL1,1,3,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMENSTAVPA, "RECMENSTAVPA");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMENSTAVPA,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMENSTAVOR, "RECMENSTAVOR");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMENSTAVOR,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMESTVLIST, "RECMESTVLIST");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMESTVLIST,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMESTVPALI, "RECMESTVPALI");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMESTVPALI,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_ICON,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_HASH,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMENSTAVST, "RECMENSTAVST");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE1,IMDBDef17.PQSL_MENUSTAMPE1_RECMENSTAVST,5,2,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_MENUSTAMPE1, 0);
  }

  private static void Init_PQRY_MENUSTAMPE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_MENUSTAMPE, 12);
    IMDB.set_TblCode(IMDBDef17.PQRY_MENUSTAMPE, "PQRY_MENUSTAMPE");
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMESTVDERA, "RECMESTVDERA");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMESTVDERA,5,500,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMENSTAVCO, "RECMENSTAVCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMENSTAVCO,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_TOOLTIP, "TOOLTIP");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_TOOLTIP,5,500,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMESTVTIRA, "RECMESTVTIRA");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMESTVTIRA,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMENSTAVL1, "RECMENSTAVL1");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMENSTAVL1,1,3,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMENSTAVPA, "RECMENSTAVPA");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMENSTAVPA,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMENSTAVOR, "RECMENSTAVOR");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMENSTAVOR,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMESTVLIST, "RECMESTVLIST");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMESTVLIST,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMESTVPALI, "RECMESTVPALI");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMESTVPALI,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_ICON, "ICON");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_ICON,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_HASH, "HASH");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_HASH,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMENSTAVST, "RECMENSTAVST");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPE,IMDBDef17.PQSL_MENUSTAMPE_RECMENSTAVST,5,2,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_MENUSTAMPE, 0);
  }

  private static void Init_PQRY_PARAMETRI583(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI583, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI583, "PQRY_PARAMETRI583");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI583,IMDBDef17.PQSL_PARAMETRI583_PARAMEDESCRI, "PARAMEDESCRI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI583,IMDBDef17.PQSL_PARAMETRI583_PARAMEDESCRI,9,1000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI583,IMDBDef17.PQSL_PARAMETRI583_PARAMETRHASH, "PARAMETRHASH");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI583,IMDBDef17.PQSL_PARAMETRI583_PARAMETRHASH,5,50,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI583, 0);
  }

  private static void Init_PQRY_PARAMETRI583_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI583_RS, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI583_RS, "PQRY_PARAMETRI583_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI583_RS,IMDBDef17.PQSL_PARAMETRI583_PARAMEDESCRI, "PARAMEDESCRI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI583_RS,IMDBDef17.PQSL_PARAMETRI583_PARAMEDESCRI,9,1000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI583_RS,IMDBDef17.PQSL_PARAMETRI583_PARAMETRHASH, "PARAMETRHASH");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI583_RS,IMDBDef17.PQSL_PARAMETRI583_PARAMETRHASH,5,50,0);
  }

  private static void Init_PQRY_NOTEFUNZIONA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_NOTEFUNZIONA, 4);
    IMDB.set_TblCode(IMDBDef17.PQRY_NOTEFUNZIONA, "PQRY_NOTEFUNZIONA");
    IMDB.set_FldCode(IMDBDef17.PQRY_NOTEFUNZIONA,IMDBDef17.PQSL_NOTEFUNZIONA_MODULO, "MODULO");
    IMDB.SetFldParams(IMDBDef17.PQRY_NOTEFUNZIONA,IMDBDef17.PQSL_NOTEFUNZIONA_MODULO,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_NOTEFUNZIONA,IMDBDef17.PQSL_NOTEFUNZIONA_PAGINA, "PAGINA");
    IMDB.SetFldParams(IMDBDef17.PQRY_NOTEFUNZIONA,IMDBDef17.PQSL_NOTEFUNZIONA_PAGINA,5,200,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_NOTEFUNZIONA,IMDBDef17.PQSL_NOTEFUNZIONA_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_NOTEFUNZIONA,IMDBDef17.PQSL_NOTEFUNZIONA_FUNZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_NOTEFUNZIONA,IMDBDef17.PQSL_NOTEFUNZIONA_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_NOTEFUNZIONA,IMDBDef17.PQSL_NOTEFUNZIONA_DESCRIZIONE,9,9999,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_NOTEFUNZIONA, 0);
  }

  private static void Init_PQRY_MENUSTAMPREF(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_MENUSTAMPREF, 6);
    IMDB.set_TblCode(IMDBDef17.PQRY_MENUSTAMPREF, "PQRY_MENUSTAMPREF");
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPREF,IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTDERA, "RECMENSTDERA");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPREF,IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTDERA,5,500,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPREF,IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTTORA, "RECMENSTTORA");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPREF,IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTTORA,5,500,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPREF,IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTLIST, "RECMENSTLIST");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPREF,IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTLIST,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPREF,IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTPALI, "RECMENSTPALI");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPREF,IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTPALI,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPREF,IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTACOD, "RECMENSTACOD");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPREF,IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTACOD,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMPREF,IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTASTO, "RECMENSTASTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMPREF,IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTASTO,5,2,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_MENUSTAMPREF, 0);
  }

  private static void Init_PQRY_MENUSTAMSTAT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_MENUSTAMSTAT, 6);
    IMDB.set_TblCode(IMDBDef17.PQRY_MENUSTAMSTAT, "PQRY_MENUSTAMSTAT");
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMSTAT,IMDBDef17.PQSL_MENUSTAMSTAT_DESCRIZIONE_RAMO, "DESCRIZIONE_RAMO");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMSTAT,IMDBDef17.PQSL_MENUSTAMSTAT_DESCRIZIONE_RAMO,5,500,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMSTAT,IMDBDef17.PQSL_MENUSTAMSTAT_CONTATORE, "CONTATORE");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMSTAT,IMDBDef17.PQSL_MENUSTAMSTAT_CONTATORE,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMSTAT,IMDBDef17.PQSL_MENUSTAMSTAT_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMSTAT,IMDBDef17.PQSL_MENUSTAMSTAT_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMSTAT,IMDBDef17.PQSL_MENUSTAMSTAT_LINK_STAMPA, "LINK_STAMPA");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMSTAT,IMDBDef17.PQSL_MENUSTAMSTAT_LINK_STAMPA,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMSTAT,IMDBDef17.PQSL_MENUSTAMSTAT_REMESTSTPALI, "REMESTSTPALI");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMSTAT,IMDBDef17.PQSL_MENUSTAMSTAT_REMESTSTPALI,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_MENUSTAMSTAT,IMDBDef17.PQSL_MENUSTAMSTAT_RECMENSTSTST, "RECMENSTSTST");
    IMDB.SetFldParams(IMDBDef17.PQRY_MENUSTAMSTAT,IMDBDef17.PQSL_MENUSTAMSTAT_RECMENSTSTST,5,2,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_MENUSTAMSTAT, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MenuStampe(MyWebEntryPoint w, IMDBObj imdb)
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
  public MenuStampe()
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
    FormIdx = MyGlb.FRM_CFAMEST;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6E308CAE-C07C-45D3-8702-946C32443548";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 636;
    DesignHeight = 554;
    set_Caption(new IDVariant("Menu Stampe"));
    //
    Frames = new AFrame[10];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 636;
    Frames[1].Height = 528;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0909091;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 636;
    Frames[2].Height = 48;
    Frames[2].FormFactor = 0.660377;
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[2].ChildFrame1 = Frames[3];
    Frames[3].Width = 420;
    Frames[3].Height = 48;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Parametri";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 48;
    Frames[3].MinHeight = Frames[3].Height;
    Frames[3].MaxHeight = Frames[3].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 3, "PAN_PARAMETRI");
    Frames[3].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 420-MyGlb.PAN_OFFS_X, 48-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FCD1DFB1-7EA8-481C-A2AA-252118E49F41");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 532, 36, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[2].ChildFrame2 = Frames[4];
    Frames[4].Width = 216;
    Frames[4].Height = 48;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Descrizione";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 48;
    Frames[4].MinHeight = Frames[4].Height;
    Frames[4].MaxHeight = Frames[4].Height;
    PAN_DESCRIZIONE = new IDPanel(w, this, 4, "PAN_DESCRIZIONE");
    Frames[4].Content = PAN_DESCRIZIONE;
    PAN_DESCRIZIONE.ShowRowSelector = false;
    PAN_DESCRIZIONE.ShowToolbar = false;
    PAN_DESCRIZIONE.ShowStatusbar = false;
    PAN_DESCRIZIONE.VS = MainFrm.VisualStyleList;
    PAN_DESCRIZIONE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 216-MyGlb.PAN_OFFS_X, 48-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DESCRIZIONE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8CFC7EF3-7875-4649-A05A-C3F7D855AB49");
    PAN_DESCRIZIONE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 152, 40, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DESCRIZIONE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DESCRIZIONE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 0);
    PAN_DESCRIZIONE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DESCRIZIONE.InitStatus = 2;
    PAN_DESCRIZIONE_Init();
    PAN_DESCRIZIONE_InitFields();
    PAN_DESCRIZIONE_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[1].ChildFrame2 = Frames[5];
    Frames[5].Width = 636;
    Frames[5].Height = 480;
    Frames[5].FormFactor = 0.660377;
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[5].ChildFrame1 = Frames[6];
    Frames[6].Width = 420;
    Frames[6].Height = 480;
    Frames[6].FrHidden = true;
    Frames[6].Caption = "Menu Stampe";
    Frames[6].Parent = this;
    Frames[6].FixedHeight = 480;
    TRE_MENUSTAMPE = new ATree(this);
    Frames[6].Content = TRE_MENUSTAMPE;
    TRE_MENUSTAMPE.Width = 420;
    TRE_MENUSTAMPE.Height = 480;
    TRE_MENUSTAMPE.FrIndex = 6;
    TRE_MENUSTAMPE.Code = "TRE_MENUSTAMPE";
    TRE_MENUSTAMPE.set_IsActive(true);
    TRE_MENUSTAMPE.iGuid = "0685EA00-D0ED-4635-A23B-394DF6082F97";
    TRE_MENUSTAMPE.SetItemCount(2);
    Item = new ATreeItem();
    TRE_MENUSTAMPE.SetItem(1,Item);
    Item.ItemIndex = "N00001";
    Item.Tooltip = "";
    Item.Name = "Livello 0";
    Item.iGuid = "D438C35A-2CC7-4416-90AE-F9E6DB5C083C";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE_RAMO as RECMESTVDERA, ");
    SQL.append("  A.CODICE as RECMENSTAVCO, ");
    SQL.append("  A.TOOLTIP_RAMO as TOOLTIP, ");
    SQL.append("  A.TIPO_RAMO as RECMESTVTIRA, ");
    SQL.append("  A.LIVELLO as RECMENSTAVL1, ");
    SQL.append("  A.PADRE as RECMENSTAVPA, ");
    SQL.append("  A.ORDINE as RECMENSTAVOR, ");
    SQL.append("  A.LINK_STAMPA as RECMESTVLIST, ");
    SQL.append("  A.PARAMETRO_LINK as RECMESTVPALI, ");
    SQL.append("  A.IMMAGINE as ICON, ");
    SQL.append("  A.HASHKEY as HASH, ");
    SQL.append("  A.STORICO as RECMENSTAVST ");
    SQL.append("from ");
    SQL.append("  MENU_STAMPE_V A ");
    SQL.append("where (A.LIVELLO = 0) ");
    SQL.append("and   (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_AL, 0) AND NVL(A.ESERCIZIO_AL, 9999))) ");
    SQL.append("order by ");
    SQL.append("  A.ORDINE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef17.PQRY_MENUSTAMPE1);
    Item.SetItemCount(1);
    Item = new ATreeItem();
    TRE_MENUSTAMPE.SetItem(2,Item);
    Item.ItemIndex = "N00002";
    Item.Tooltip = "";
    Item.Name = "Livelli Successivi";
    Item.iGuid = "C6178391-A2E4-4985-BDD4-FE3C73FD479B";
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE_RAMO as RECMESTVDERA, ");
    SQL.append("  A.CODICE as RECMENSTAVCO, ");
    SQL.append("  A.TOOLTIP_RAMO as TOOLTIP, ");
    SQL.append("  A.TIPO_RAMO as RECMESTVTIRA, ");
    SQL.append("  A.LIVELLO as RECMENSTAVL1, ");
    SQL.append("  A.PADRE as RECMENSTAVPA, ");
    SQL.append("  A.ORDINE as RECMENSTAVOR, ");
    SQL.append("  A.LINK_STAMPA as RECMESTVLIST, ");
    SQL.append("  A.PARAMETRO_LINK as RECMESTVPALI, ");
    SQL.append("  A.IMMAGINE as ICON, ");
    SQL.append("  A.HASHKEY as HASH, ");
    SQL.append("  A.STORICO as RECMENSTAVST ");
    SQL.append("from ");
    SQL.append("  MENU_STAMPE_V A ");
    SQL.append("where (A.LIVELLO = ~~PQRY_MENUSTAMPE1.RECMENSTAVL1~~ + 1) ");
    SQL.append("and   (A.PADRE = ~~PQRY_MENUSTAMPE1.RECMENSTAVCO~~) ");
    SQL.append("and   (UPPER(A.DESCRIZIONE_RAMO) LIKE DECODE((A.TIPO_RAMO), 'F', '%' || UPPER(~~PQRY_PARAMETRI583.PARAMEDESCRI~~) || '%', '%')) ");
    SQL.append("and   (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (STAMPE_MENU.VIS_NODO_MENU_STAMPE(~~TBL_DATISESSIONE.SESSIOESERCI~~,A.MODULO,A.CODICE,A.TIPO_RAMO,~~PQRY_PARAMETRI583.PARAMEDESCRI~~) = 'SI') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_DAL, 0) AND NVL(A.ESERCIZIO_AL, 9999))) ");
    SQL.append("order by ");
    SQL.append("  A.ORDINE ");
    Item.SetQuery(SQL, MainFrm.Cf4armDBObject.DB, MainFrm, "");
    Item.SetIMDBTable(IMDBDef17.PQRY_MENUSTAMPE1);
    Item = TRE_MENUSTAMPE.GetItem(1);
    Item.SetItem(1, TRE_MENUSTAMPE.GetItem(2));
    Item = TRE_MENUSTAMPE.GetItem(2);
    Item.Parent = TRE_MENUSTAMPE.GetItem(1);
    Item.Derived = TRE_MENUSTAMPE.GetItem(1);
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[5].ChildFrame2 = Frames[7];
    Frames[7].Width = 216;
    Frames[7].Height = 480;
    Frames[7].Vertical = true;
    Frames[7].FormFactor = 0.5;
    Frames[8] = new AFrame(8);
    Frames[8].Parent = this;
    Frames[7].ChildFrame1 = Frames[8];
    Frames[8].Width = 216;
    Frames[8].Height = 240;
    Frames[8].FrHidden = true;
    Frames[8].Caption = "Preferiti";
    Frames[8].Parent = this;
    Frames[8].FixedHeight = 240;
    Frames[8].MinHeight = Frames[8].Height;
    Frames[8].MaxHeight = Frames[8].Height;
    PAN_PREFERITI = new IDPanel(w, this, 8, "PAN_PREFERITI");
    Frames[8].Content = PAN_PREFERITI;
    PAN_PREFERITI.ShowRowSelector = false;
    PAN_PREFERITI.ShowToolbar = false;
    PAN_PREFERITI.set_CanDrop(true);
    PAN_PREFERITI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREFERITI.MouseClickEventDef = RD3Glb.EVENT_ACTIVE;
    PAN_PREFERITI.VS = MainFrm.VisualStyleList;
    PAN_PREFERITI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 216-MyGlb.PAN_OFFS_X, 240-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREFERITI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6ADD412B-F4CE-4950-8F17-8E674E99F1F9");
    PAN_PREFERITI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 208, 228, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PREFERITI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREFERITI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 20);
    PAN_PREFERITI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREFERITI.InitStatus = 2;
    PAN_PREFERITI_Init();
    PAN_PREFERITI_InitFields();
    PAN_PREFERITI_InitQueries();
    Frames[9] = new AFrame(9);
    Frames[9].Parent = this;
    Frames[7].ChildFrame2 = Frames[9];
    Frames[9].Width = 216;
    Frames[9].Height = 240;
    Frames[9].FrHidden = true;
    Frames[9].Caption = "Piu Utilizzate";
    Frames[9].Parent = this;
    Frames[9].FixedHeight = 240;
    PAN_PIUUTILIZZAT = new IDPanel(w, this, 9, "PAN_PIUUTILIZZAT");
    Frames[9].Content = PAN_PIUUTILIZZAT;
    PAN_PIUUTILIZZAT.ShowRowSelector = false;
    PAN_PIUUTILIZZAT.ShowToolbar = false;
    PAN_PIUUTILIZZAT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PIUUTILIZZAT.VS = MainFrm.VisualStyleList;
    PAN_PIUUTILIZZAT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 216-MyGlb.PAN_OFFS_X, 240-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PIUUTILIZZAT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "434D48A6-B7CB-4B94-957B-1564B77C6105");
    PAN_PIUUTILIZZAT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 208, 232, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PIUUTILIZZAT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PIUUTILIZZAT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 20);
    PAN_PIUUTILIZZAT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PIUUTILIZZAT.InitStatus = 2;
    PAN_PIUUTILIZZAT_Init();
    PAN_PIUUTILIZZAT_InitFields();
    PAN_PIUUTILIZZAT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARAMETRI584, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CFAMEST_PARAMETRI583();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_DESCRIZIONE.UpdatePanel(MainFrm);
      PAN_PREFERITI.UpdatePanel(MainFrm);
      PAN_PIUUTILIZZAT.UpdatePanel(MainFrm);
      TRE_MENUSTAMPE.UpdateTree(MainFrm);
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
    return (obj instanceof MenuStampe);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MenuStampe.class.getName() : (Glb.ClassWithPackage(MenuStampe.class) ? MenuStampe.class.getName().substring(MenuStampe.class.getPackage().getName().length() + 1) : MenuStampe.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Menu Stampe On Generic Drag
  // Dopo aver tirato con successo un nodo dell'albero su
  // un frame ricevente, questo evento viene notificato
  // dall'albero per permettere di preparare i dati per
  // il frame ricevente
  // Drag Info - Input/Output
  // Button - Input
  // Hash Key - Input
  // **********************************************************************
  private void TRE_MENUSTAMPE_OnGenericDrag(IDVariant DragInfo, IDVariant Button, IDVariant HashKey)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Menu Stampe On Generic Drag Body
      // Corpo Procedura
      // 
      DragInfo.set(new IDVariant(HashKey));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MenuStampe", "MenuStampeOnGenericDrag", _e);
    }
  }

  // **********************************************************************
  // Menu Stampe On Expand Node
  // Evento notificato dall'albero quando un nodo viene
  // espanso per la prima volta
  // HashKey - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void TRE_MENUSTAMPE_OnExpandNode(IDVariant HashKey,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Menu Stampe On Expand Node Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI583, IMDBDef17.PQSL_PARAMETRI583_PARAMETRHASH, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI583, IMDBDef17.PQSL_PARAMETRI583_PARAMETRHASH, 0, new IDVariant(HashKey));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MenuStampe", "MenuStampeOnExpandNode", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C8;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_DESCRIZIONE1)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI583, IMDBDef17.PQSL_PARAMETRI583_PARAMEDESCRI, 0)))
        {
          TRE_MENUSTAMPE.ExpandNode(MainFrm, (new IDVariant("")), (new IDVariant(0)).booleanValue(), (new IDVariant(-1)).booleanValue()); 
          TRE_MENUSTAMPE.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue()); 
          IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI583, IMDBDef17.PQSL_PARAMETRI583_PARAMETRHASH, 0, (new IDVariant()));
        }
        else
        {
          if (IDL.Length(IMDB.Value(IMDBDef17.PQRY_PARAMETRI583, IMDBDef17.PQSL_PARAMETRI583_PARAMEDESCRI, 0)).compareTo((new IDVariant(2)), true)>0)
          {
            TRE_MENUSTAMPE.ExpandNode(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue(), (new IDVariant(-1)).booleanValue()); 
            TRE_MENUSTAMPE.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue()); 
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_HASH)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI583, IMDBDef17.PQSL_PARAMETRI583_PARAMETRHASH, 0))))
        {
          IDVariant v_VMENUSTAVCOD = new IDVariant(0,IDVariant.STRING);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.CODICE as MENUSTAMVCOD ");
          SQL.append("from ");
          SQL.append("  MENU_STAMPE_V A ");
          SQL.append("where (A.HASHKEY = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_PARAMETRI583, IMDBDef17.PQSL_PARAMETRI583_PARAMETRHASH, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.MODULO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VMENUSTAVCOD = QV.Get("MENUSTAMVCOD", IDVariant.STRING) ;
          }
          QV.Close();
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.HASHKEY as VHASHKEY, ");
          SQL.append("  A.TIPO_RAMO as VTIPORAMO ");
          SQL.append("from ");
          SQL.append("  MENU_STAMPE_V A ");
          SQL.append("where (A.PADRE = " + IDL.CSql(v_VMENUSTAVCOD, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.MODULO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          C8 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!C8.EOF()) C8.MoveNext();
          while (!C8.EOF())
          {
            if (C8.Get("VTIPORAMO").equals((new IDVariant("F")), true))
            {
              TRE_MENUSTAMPE.ExpandNode(MainFrm, C8.Get("VHASHKEY"), (new IDVariant(-1)).booleanValue(), (new IDVariant(-1)).booleanValue()); 
            }
            C8.MoveNext();
          }
          C8.Close();
          IMDB.set_Value(IMDBDef17.PQRY_PARAMETRI583, IMDBDef17.PQSL_PARAMETRI583_PARAMETRHASH, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MenuStampe", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Livello 0
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Livello0 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Livello 0 Body
      // Corpo Procedura
      // 
      LancioStampa(IMDB.Value(IMDBDef17.PQRY_MENUSTAMPE1, IMDBDef17.PQSL_MENUSTAMPE1_RECMESTVTIRA, 0), IMDB.Value(IMDBDef17.PQRY_MENUSTAMPE1, IMDBDef17.PQSL_MENUSTAMPE1_RECMESTVLIST, 0), IMDB.Value(IMDBDef17.PQRY_MENUSTAMPE1, IMDBDef17.PQSL_MENUSTAMPE1_RECMESTVPALI, 0), IMDB.Value(IMDBDef17.PQRY_MENUSTAMPE1, IMDBDef17.PQSL_MENUSTAMPE1_RECMENSTAVST, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MenuStampe", "Livello0", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Lancio Stampa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // Tipo Ramo - Input
  // Link Stampa - Input
  // Parametro Link - Input
  // Storico:  - Input
  // **********************************************************************
  public int LancioStampa (IDVariant TipoRamo, IDVariant LinkStampa, IDVariant ParametroLink, IDVariant Storico)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Lancio Stampa Body
      // Corpo Procedura
      // 
      if (TipoRamo.equals((new IDVariant("F")), true) && !(IDL.IsNull(LinkStampa)))
      {
        // WebForm v_IDF = null;
        // v_IDF = (WebForm)MainFrm.CreateObjFromLibrary((new IDVariant("")).stringValue(), LinkStampa.stringValue());
        // MainFrm.ShowMultipleForm(v_IDF, (new IDVariant(0)).intValue(), this); 
        if (LinkStampa.equals((new IDVariant("CABSSTDI")), true))
        {
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI586, IMDBDef7.FLD_PARAMETRI586_PPARAMETLINK, 0, new IDVariant(ParametroLink));
        }
        if (LinkStampa.equals((new IDVariant("CABLRELA")), true) && !(IDL.IsNull(ParametroLink)))
        {
          IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
          v_S1 = (new IDVariant("doc_relazioni/RelazioneInizioMandato.docx"));
          IDVariant v_S2 = new IDVariant(0,IDVariant.STRING);
          v_S2 = (new IDVariant("doc_relazioni/RelazioneFineMandato.docx"));
          // 
          // if da eliminare dopo la demo
          // 
          if (ParametroLink.equals((new IDVariant("1")), true))
          {
            // 
            // da eliminare dopo demo
            // 
            MainFrm.set_RedirectTo(v_S1);
            MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
            MainFrm.set_RedirectFeatures((new IDVariant(""))); 
          }
          else if (ParametroLink.equals((new IDVariant("2")), true))
          {
            // 
            // da eliminare dopo demo
            // 
            MainFrm.set_RedirectTo(v_S2);
            MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
            MainFrm.set_RedirectFeatures((new IDVariant(""))); 
          }
          return 0;
        }
        if (LinkStampa.equals((new IDVariant("CABLBCSB")), true) && !(IDL.IsNull(ParametroLink)))
        {
          // 
          // if da eliminare dopo la demo
          // 
          if (ParametroLink.equals((new IDVariant("31")), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("doc_relazioni/NotaIntegrativaRendiconto.docx"));
            // 
            // da eliminare dopo demo
            // 
            MainFrm.set_RedirectTo(S);
            MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
            MainFrm.set_RedirectFeatures((new IDVariant(""))); 
            return 0;
          }
          IMDB.set_Value(IMDBDef3.TBL_PARAM152, IMDBDef3.FLD_PARAM152_PARAPROGSTAM, 0, new IDVariant(IDL.ToInteger(ParametroLink),IDVariant.DECIMAL));
          MainFrm.Show(MyGlb.FRM_STAMBILACONS, (new IDVariant(0)).intValue(), this); 
          if (IDL.NullValue(Storico,(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
          {
            ((StampeBilancioCons)MainFrm.GetForm(MyGlb.FRM_STAMBILACONS,0,true,this)).EtichettaElabora();
            MainFrm.UnloadForm(MyGlb.FRM_STAMBILACONS,(new IDVariant(0)).booleanValue()); 
          }
        }
        else if (LinkStampa.equals((new IDVariant("CABLPSBL")), true) && !(IDL.IsNull(ParametroLink)))
        {
          // 
          // if da eliminare dopo la demo
          // 
          if (ParametroLink.equals((new IDVariant("42")), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("doc_relazioni/NotaIntegrativaPrevisione.docx"));
            // 
            // da eliminare dopo demo
            // 
            MainFrm.set_RedirectTo(S);
            MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
            MainFrm.set_RedirectFeatures((new IDVariant(""))); 
            return 0;
          }
          IMDB.set_Value(IMDBDef3.TBL_PARAM151, IMDBDef3.FLD_PARAM151_PARAPROGSTAM, 0, new IDVariant(IDL.ToInteger(ParametroLink),IDVariant.DECIMAL));
          MainFrm.Show(MyGlb.FRM_STAMBILAPREV, (new IDVariant(0)).intValue(), this); 
          if (IDL.NullValue(Storico,(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
          {
            ((StampeBilancioPrev)MainFrm.GetForm(MyGlb.FRM_STAMBILAPREV,0,true,this)).EtichettaElabora();
            MainFrm.UnloadForm(MyGlb.FRM_STAMBILAPREV,(new IDVariant(0)).booleanValue()); 
          }
        }
        else if (LinkStampa.equals((new IDVariant("CABILAGG")), true) && !(IDL.IsNull(ParametroLink)))
        {
          IMDB.set_Value(IMDBDef3.TBL_PARAM161, IMDBDef3.FLD_PARAM161_PARAPROGSTAM, 0, new IDVariant(IDL.ToInteger(ParametroLink),IDVariant.DECIMAL));
          ((StampeBilancioAggiornato)MainFrm.GetForm(MyGlb.FRM_STAMBILAAGGI,0,true,this)).EtichettaElabora();
          MainFrm.UnloadForm(MyGlb.FRM_STAMBILAAGGI,(new IDVariant(0)).booleanValue()); 
        }
        else if (LinkStampa.equals((new IDVariant("CATSSTPL")), true))
        {
          // 
          // Tesoreria - Prospetto liquidità
          // 
          IMDB.set_Value(IMDBDef7.TBL_PARAMETRI689, IMDBDef7.FLD_PARAMETRI689_COD_STAMPA, 0, (new IDVariant("PRLIQ")));
          MainFrm.Show(MyGlb.FRM_STAMPCONPARA, (new IDVariant(0)).intValue(), this); 
        }
        else
        {
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_INVISIBILE, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.ExecCmdCode(LinkStampa.stringValue()); 
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_INVISIBILE, (new IDVariant(0)).booleanValue());
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MenuStampe", "LancioStampa", _e);
      return -1;
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MenuStampe", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI584, IMDBDef7.FLD_PARAMETRI584_PARAMEDESCRI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI584, IMDBDef7.FLD_PARAMETRI584_PARAMETRHASH, 0, new IDVariant());
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
      TRE_MENUSTAMPE.ActivateOnExpand = (new IDVariant(0)).booleanValue();
      TRE_MENUSTAMPE.set_CanDrag((new IDVariant(-1)).booleanValue());
      PAN_PREFERITI.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
      PAN_PIUUTILIZZAT.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MenuStampe", "Load", _e);
    }
  }

  // **********************************************************************
  // Preferiti On Generic Drop
  // Dopo aver tirato con successo un oggetto su questo
  // pannello, questo evento viene notificato dal pannello
  // per permettere di gestire i dati trascinati su di esso
  // Drag Info - Input
  // Cancel - Input/Output
  // Button - Input
  // X - Input
  // Y - Input
  // XB - Input
  // YB - Input
  // Column - Input
  // Row - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_PREFERITI_OnGenericDrop(IDVariant DragInfo, IDVariant Cancel, IDVariant Button, IDVariant X, IDVariant Y, IDVariant XB, IDVariant YB, IDVariant Column, IDVariant Row, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Preferiti On Generic Drop Body
      // Corpo Procedura
      // 
      // MainFrm.set_AlertMessage(DragInfo); 
      InsPreferito(DragInfo);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MenuStampe", "PreferitiOnGenericDrop", _e);
    }
  }

  // **********************************************************************
  // Preferiti On Mouse Click
  // Notificato dal pannello quando l'utente clicca su di
  // esso
  // Button - Input
  // X - Input
  // Y - Input
  // XB - Input
  // YB - Input
  // Column - Input
  // Row - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PREFERITI_OnMouseClick(IDVariant Button, IDVariant X, IDVariant Y, IDVariant XB, IDVariant YB, IDVariant Column, IDVariant Row, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Preferiti On Mouse Click Body
      // Corpo Procedura
      // 
      if (Button.equals((new IDVariant(2)), true))
      {
        IDVariant I = new IDVariant(0,IDVariant.INTEGER);
        C3 = PAN_PREFERITI.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_PREFERITI.GotoFirst();
        while (!PAN_PREFERITI.RSEOF())
        {
          if (I.equals(Row, true))
          {
            MainFrm.Cf4armDBObject.STAMPEMENUDELPREFERITO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), C3.Get("RECMENSTACOD"), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_PREFERITI.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
        PAN_PREFERITI.PanelCommand(Glb.PCM_REQUERY);
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MenuStampe", "PreferitiOnMouseClick", _e);
    }
  }

  // **********************************************************************
  // Preferiti DESCRIZIONE RAMO Activated
  // Evento notificato al campo quando esso viene attivato
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PREFERITI_DESCRIZIRAM1_CellActivated(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Preferiti DESCRIZIONE RAMO Activated Body
      // Corpo Procedura
      // 
      LancioStampa((new IDVariant("F")), IMDB.Value(IMDBDef17.PQRY_MENUSTAMPREF, IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTLIST, 0), IMDB.Value(IMDBDef17.PQRY_MENUSTAMPREF, IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTPALI, 0), IMDB.Value(IMDBDef17.PQRY_MENUSTAMPREF, IMDBDef17.PQSL_MENUSTAMPREF_RECMENSTASTO, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MenuStampe", "PreferitiDESCRIZIONERAMOActivated", _e);
    }
  }

  // **********************************************************************
  // Ins Preferito
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // Hashkey - Input
  // **********************************************************************
  public int InsPreferito (IDVariant Hashkey)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ins Preferito Body
      // Corpo Procedura
      // 
      IDVariant v_CODICE = null;
      v_CODICE = IDL.SubStr(Hashkey, (new IDVariant(2)));
      IDVariant v_TIPORAMO = null;
      v_TIPORAMO = IDL.SubStr(Hashkey, (new IDVariant(1)), (new IDVariant(1)));
      if (v_TIPORAMO.equals((new IDVariant("F")), true))
      {
        MainFrm.Cf4armDBObject.STAMPEMENUINSPREFERITO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_CODICE, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      }
      PAN_PREFERITI.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MenuStampe", "InsPreferito", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Piu Utilizzate DESCRIZIONE RAMO Activated
  // Evento notificato al campo quando esso viene attivato
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PIUUTILIZZAT_DESCRIZIRAMO_CellActivated(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Piu Utilizzate DESCRIZIONE RAMO Activated Body
      // Corpo Procedura
      // 
      LancioStampa((new IDVariant("F")), IMDB.Value(IMDBDef17.PQRY_MENUSTAMSTAT, IMDBDef17.PQSL_MENUSTAMSTAT_LINK_STAMPA, 0), IMDB.Value(IMDBDef17.PQRY_MENUSTAMSTAT, IMDBDef17.PQSL_MENUSTAMSTAT_REMESTSTPALI, 0), IMDB.Value(IMDBDef17.PQRY_MENUSTAMSTAT, IMDBDef17.PQSL_MENUSTAMSTAT_RECMENSTSTST, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MenuStampe", "PiuUtilizzateDESCRIZIONERAMOActivated", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CFAMEST_PARAMETRI583() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI583_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI584, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI584, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI583_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI583_RS, 0, IMDBDef7.TBL_PARAMETRI584, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI583_RS, 0, 0, IMDBDef7.TBL_PARAMETRI584, IMDBDef7.FLD_PARAMETRI584_PARAMEDESCRI, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI583_RS, 1, 0, IMDBDef7.TBL_PARAMETRI584, IMDBDef7.FLD_PARAMETRI584_PARAMETRHASH, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI584, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAMETRI584, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI584, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI583_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DESCRIZIONE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DESCRIZIONE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DESCRIZIONE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DESCRIZIONE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DESCRIZIONE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DESCRIZIONE);
    // Stub
  }

  private void PAN_DESCRIZIONE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DESCRIZIONE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DESCRIZIONE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DESCRIZIONE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void TRE_MENUSTAMPE_NodeClick(ATreeNode Node)
  {
    if (TRE_MENUSTAMPE.NodeClick(MainFrm, Node))
    {
      if (Node.Key.substring(0,6).equals("N00001"))
      {
      Livello0();
      }
      if (Node.Key.substring(0,6).equals("N00002"))
      {
      Livello0();
      }
    }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PREFERITI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PREFERITI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREFERITI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREFERITI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREFERITI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PREFERITI);
    // Stub
  }

  private void PAN_PREFERITI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PREFERITI_DESCRIZIRAM1)
    {
      PFL_PREFERITI_DESCRIZIRAM1_CellActivated(Cancel);
    }
  }

  private void PAN_PREFERITI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PREFERITI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREFERITI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PIUUTILIZZAT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PIUUTILIZZAT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PIUUTILIZZAT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PIUUTILIZZAT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PIUUTILIZZAT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PIUUTILIZZAT);
    // Stub
  }

  private void PAN_PIUUTILIZZAT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PIUUTILIZZAT_DESCRIZIRAMO)
    {
      PFL_PIUUTILIZZAT_DESCRIZIRAMO_CellActivated(Cancel);
    }
  }

  private void PAN_PIUUTILIZZAT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PIUUTILIZZAT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PIUUTILIZZAT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE1, "79344887-E57D-4A76-B41C-CC40C370C540");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE1, "Descrizione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_HASH, "53BCD218-E016-4F91-B673-7780068D5451");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_HASH, "Hash");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_HASH, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_HASH, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_HASH, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE1, MyGlb.PANEL_LIST, 0, 36, 532, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE1, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE1, MyGlb.PANEL_FORM, 16, 12, 396, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRIZIONE1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRIZIONE1, PPQRY_PARAMETRI583, "A.PARAMEDESCRI", "PARAMEDESCRI", 9, 1000, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_HASH, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_HASH, MyGlb.PANEL_LIST, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_HASH, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_HASH, MyGlb.PANEL_LIST, "Hash");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_HASH, MyGlb.PANEL_FORM, 4, 40, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_HASH, MyGlb.PANEL_FORM, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_HASH, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_HASH, MyGlb.PANEL_FORM, "Hash");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_HASH, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_HASH, PPQRY_PARAMETRI583, "A.PARAMETRHASH", "PARAMETRHASH", 5, 50, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI583", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI583, IMDBDef17.PQRY_PARAMETRI583_RS, IMDBDef7.TBL_PARAMETRI584);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DESCRIZIONE1, IMDBDef7.FLD_PARAMETRI584_PARAMEDESCRI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_HASH, IMDBDef7.FLD_PARAMETRI584_PARAMETRHASH);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI584");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DESCRIZIONE_Init()
  {

    PAN_DESCRIZIONE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DESCRIZIONE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DESCRIZIONE.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_DESCRIZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DESCRIZIONE_DESCRIZIONE, "6E2453C3-A980-41FD-9CF3-3F392AB47B32");
    PAN_DESCRIZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_DESCRIZIONE_DESCRIZIONE, "DESCRIZIONE");
    PAN_DESCRIZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DESCRIZIONE_DESCRIZIONE, "");
    PAN_DESCRIZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DESCRIZIONE_DESCRIZIONE, MyGlb.VIS_HTMEDISTNOSF);
    PAN_DESCRIZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_DESCRIZIONE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DESCRIZIONE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DESCRIZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DESCRIZIONE_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 0, 432, 40, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DESCRIZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DESCRIZIONE_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_DESCRIZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DESCRIZIONE_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_DESCRIZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DESCRIZIONE_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_DESCRIZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_DESCRIZIONE_DESCRIZIONE, MyGlb.PANEL_FORM, 0, 4, 208, 36, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DESCRIZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DESCRIZIONE_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_DESCRIZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DESCRIZIONE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DESCRIZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DESCRIZIONE_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_DESCRIZIONE.SetFieldPage(PFL_DESCRIZIONE_DESCRIZIONE, -1, -1);
    PAN_DESCRIZIONE.SetFieldPanel(PFL_DESCRIZIONE_DESCRIZIONE, PPQRY_NOTEFUNZIONA, "A.DESCRIZIONE", "DESCRIZIONE", 9, 9999, 0, -14014);
  }

  private void PAN_DESCRIZIONE_InitQueries()
  {
    StringBuffer SQL;

    PAN_DESCRIZIONE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DESCRIZIONE.SetIMDB(IMDB, "PQRY_NOTEFUNZIONA", true);
    PAN_DESCRIZIONE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MODULO as MODULO, ");
    SQL.append("  A.PAGINA as PAGINA, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_DESCRIZIONE.SetQuery(PPQRY_NOTEFUNZIONA, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_DESCRIZIONE.SetQuery(PPQRY_NOTEFUNZIONA, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (A.PAGINA = " + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_CFAMEST,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.FUNZIONE = 'Descrizione') ");
    PAN_DESCRIZIONE.SetQuery(PPQRY_NOTEFUNZIONA, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DESCRIZIONE.SetQuery(PPQRY_NOTEFUNZIONA, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DESCRIZIONE.SetQuery(PPQRY_NOTEFUNZIONA, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DESCRIZIONE.SetQuery(PPQRY_NOTEFUNZIONA, 5, SQL, -1, "");
    PAN_DESCRIZIONE.SetQueryDB(PPQRY_NOTEFUNZIONA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DESCRIZIONE.SetMasterTable(0, "NOTE_FUNZIONALITA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DESCRIZIONE.Status() == 2)
    {
      int oldListQBE = PAN_DESCRIZIONE.iUseListQBE;
      PAN_DESCRIZIONE.iUseListQBE = 0;
      PAN_DESCRIZIONE.PanelCommand(Glb.PCM_SEARCH);
      PAN_DESCRIZIONE.PanelCommand(Glb.PCM_FIND);
      PAN_DESCRIZIONE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PREFERITI_Init()
  {

    PAN_PREFERITI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREFERITI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PREFERITI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PREFERITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERITI_DESCRIZIRAM1, "DDB12D29-CCEC-4E89-8E75-A9E84BC9311F");
    PAN_PREFERITI.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERITI_DESCRIZIRAM1, "Preferiti");
    PAN_PREFERITI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERITI_DESCRIZIRAM1, "Doppio Click per Attivare la Stampa");
    PAN_PREFERITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERITI_DESCRIZIRAM1, MyGlb.VIS_NORMFIELBUTT);
    PAN_PREFERITI.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERITI_DESCRIZIRAM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PREFERITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERITI_LINKSTAMPA1, "D13CA955-3CF4-4F01-BDC1-A06C83AD8451");
    PAN_PREFERITI.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERITI_LINKSTAMPA1, "LINK STAMPA");
    PAN_PREFERITI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERITI_LINKSTAMPA1, "");
    PAN_PREFERITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERITI_LINKSTAMPA1, MyGlb.VIS_NORMFIELPADR);
    PAN_PREFERITI.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERITI_LINKSTAMPA1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERITI_PARAMETRLIN1, "40D63578-C0D6-4EB3-A87D-378A19E85D1F");
    PAN_PREFERITI.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERITI_PARAMETRLIN1, "PARAMETRO LINK");
    PAN_PREFERITI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERITI_PARAMETRLIN1, "");
    PAN_PREFERITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERITI_PARAMETRLIN1, MyGlb.VIS_NORMFIELPADR);
    PAN_PREFERITI.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERITI_PARAMETRLIN1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PREFERITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREFERITI_STORICO1, "358D46DD-E993-43D3-83A8-3D350AB941FB");
    PAN_PREFERITI.set_Header(MyGlb.OBJ_FIELD, PFL_PREFERITI_STORICO1, "STORICO");
    PAN_PREFERITI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREFERITI_STORICO1, "");
    PAN_PREFERITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREFERITI_STORICO1, MyGlb.VIS_NORMFIELPADR);
    PAN_PREFERITI.SetFlags(MyGlb.OBJ_FIELD, PFL_PREFERITI_STORICO1, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PREFERITI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREFERITI.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERITI_DESCRIZIRAM1, MyGlb.PANEL_LIST, 0, 24, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PREFERITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERITI_DESCRIZIRAM1, MyGlb.PANEL_LIST, 120);
    PAN_PREFERITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERITI_DESCRIZIRAM1, MyGlb.PANEL_LIST, 1);
    PAN_PREFERITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERITI_DESCRIZIRAM1, MyGlb.PANEL_LIST, "Preferiti");
    PAN_PREFERITI.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERITI_DESCRIZIRAM1, MyGlb.PANEL_FORM, 4, 4, 556, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERITI_DESCRIZIRAM1, MyGlb.PANEL_FORM, 120);
    PAN_PREFERITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERITI_DESCRIZIRAM1, MyGlb.PANEL_FORM, 2);
    PAN_PREFERITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERITI_DESCRIZIRAM1, MyGlb.PANEL_FORM, "Preferiti");
    PAN_PREFERITI.SetFieldPage(PFL_PREFERITI_DESCRIZIRAM1, -1, -1);
    PAN_PREFERITI.SetFieldPanel(PFL_PREFERITI_DESCRIZIRAM1, PPQRY_MENUSTAMPREF, "B.DESCRIZIONE_RAMO", "RECMENSTDERA", 5, 500, 0, -13997);
    PAN_PREFERITI.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERITI_LINKSTAMPA1, MyGlb.PANEL_LIST, 0, 24, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PREFERITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERITI_LINKSTAMPA1, MyGlb.PANEL_LIST, 84);
    PAN_PREFERITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERITI_LINKSTAMPA1, MyGlb.PANEL_LIST, 1);
    PAN_PREFERITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERITI_LINKSTAMPA1, MyGlb.PANEL_LIST, "LINK STAMPA");
    PAN_PREFERITI.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERITI_LINKSTAMPA1, MyGlb.PANEL_FORM, 4, 4, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERITI_LINKSTAMPA1, MyGlb.PANEL_FORM, 84);
    PAN_PREFERITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERITI_LINKSTAMPA1, MyGlb.PANEL_FORM, 1);
    PAN_PREFERITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERITI_LINKSTAMPA1, MyGlb.PANEL_FORM, "LINK STAMPA");
    PAN_PREFERITI.SetFieldPage(PFL_PREFERITI_LINKSTAMPA1, -1, -1);
    PAN_PREFERITI.SetFieldPanel(PFL_PREFERITI_LINKSTAMPA1, PPQRY_MENUSTAMPREF, "B.LINK_STAMPA", "RECMENSTLIST", 5, 100, 0, -13997);
    PAN_PREFERITI.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERITI_PARAMETRLIN1, MyGlb.PANEL_LIST, 0, 24, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERITI_PARAMETRLIN1, MyGlb.PANEL_LIST, 108);
    PAN_PREFERITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERITI_PARAMETRLIN1, MyGlb.PANEL_LIST, 1);
    PAN_PREFERITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERITI_PARAMETRLIN1, MyGlb.PANEL_LIST, "PARAMETRO LINK");
    PAN_PREFERITI.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERITI_PARAMETRLIN1, MyGlb.PANEL_FORM, 4, 4, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERITI_PARAMETRLIN1, MyGlb.PANEL_FORM, 108);
    PAN_PREFERITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERITI_PARAMETRLIN1, MyGlb.PANEL_FORM, 1);
    PAN_PREFERITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERITI_PARAMETRLIN1, MyGlb.PANEL_FORM, "PARAMETRO LINK");
    PAN_PREFERITI.SetFieldPage(PFL_PREFERITI_PARAMETRLIN1, -1, -1);
    PAN_PREFERITI.SetFieldPanel(PFL_PREFERITI_PARAMETRLIN1, PPQRY_MENUSTAMPREF, "B.PARAMETRO_LINK", "RECMENSTPALI", 5, 20, 0, -13997);
    PAN_PREFERITI.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERITI_STORICO1, MyGlb.PANEL_LIST, 0, 24, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERITI_STORICO1, MyGlb.PANEL_LIST, 60);
    PAN_PREFERITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERITI_STORICO1, MyGlb.PANEL_LIST, 1);
    PAN_PREFERITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERITI_STORICO1, MyGlb.PANEL_LIST, "STORICO");
    PAN_PREFERITI.SetRect(MyGlb.OBJ_FIELD, PFL_PREFERITI_STORICO1, MyGlb.PANEL_FORM, 4, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREFERITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREFERITI_STORICO1, MyGlb.PANEL_FORM, 60);
    PAN_PREFERITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREFERITI_STORICO1, MyGlb.PANEL_FORM, 1);
    PAN_PREFERITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREFERITI_STORICO1, MyGlb.PANEL_FORM, "STORICO");
    PAN_PREFERITI.SetFieldPage(PFL_PREFERITI_STORICO1, -1, -1);
    PAN_PREFERITI.SetFieldPanel(PFL_PREFERITI_STORICO1, PPQRY_MENUSTAMPREF, "B.STORICO", "RECMENSTASTO", 5, 2, 0, -13997);
  }

  private void PAN_PREFERITI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREFERITI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PREFERITI.SetIMDB(IMDB, "PQRY_MENUSTAMPREF", true);
    PAN_PREFERITI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE_RAMO as RECMENSTDERA, ");
    SQL.append("  B.TOOLTIP_RAMO as RECMENSTTORA, ");
    SQL.append("  B.LINK_STAMPA as RECMENSTLIST, ");
    SQL.append("  B.PARAMETRO_LINK as RECMENSTPALI, ");
    SQL.append("  B.CODICE as RECMENSTACOD, ");
    SQL.append("  B.STORICO as RECMENSTASTO ");
    PAN_PREFERITI.SetQuery(PPQRY_MENUSTAMPREF, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  MENU_STAMPE_PREFERITI A, ");
    SQL.append("  MENU_STAMPE B ");
    PAN_PREFERITI.SetQuery(PPQRY_MENUSTAMPREF, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.CODICE = A.CODICE) ");
    SQL.append("and   (B.MODULO = A.MODULO) ");
    SQL.append("and   (B.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (A.UTENTE = ~~TBL_DATISESSIONE.SESSUSERNAME~~) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(B.ESERCIZIO_DAL, 0) AND NVL(B.ESERCIZIO_AL, 9999))) ");
    PAN_PREFERITI.SetQuery(PPQRY_MENUSTAMPREF, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PREFERITI.SetQuery(PPQRY_MENUSTAMPREF, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PREFERITI.SetQuery(PPQRY_MENUSTAMPREF, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.DESCRIZIONE_RAMO ");
    PAN_PREFERITI.SetQuery(PPQRY_MENUSTAMPREF, 5, SQL, -1, "");
    PAN_PREFERITI.SetQueryDB(PPQRY_MENUSTAMPREF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREFERITI.SetMasterTable(0, "MENU_STAMPE_PREFERITI");
    PAN_PREFERITI.AddToSortList(PFL_PREFERITI_DESCRIZIRAM1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREFERITI.Status() == 2)
    {
      int oldListQBE = PAN_PREFERITI.iUseListQBE;
      PAN_PREFERITI.iUseListQBE = 0;
      PAN_PREFERITI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREFERITI.PanelCommand(Glb.PCM_FIND);
      PAN_PREFERITI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PIUUTILIZZAT_Init()
  {

    PAN_PIUUTILIZZAT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PIUUTILIZZAT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PIUUTILIZZAT.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PIUUTILIZZAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_DESCRIZIRAMO, "6D70ADE0-8F9E-40B6-8E4E-9768D3199982");
    PAN_PIUUTILIZZAT.set_Header(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_DESCRIZIRAMO, "Più Utilizzate");
    PAN_PIUUTILIZZAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_DESCRIZIRAMO, "Doppio Click per Attivare la Stampa");
    PAN_PIUUTILIZZAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_DESCRIZIRAMO, MyGlb.VIS_NORMFIELBUTT);
    PAN_PIUUTILIZZAT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_DESCRIZIRAMO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PIUUTILIZZAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_LINKSTAMPA, "71CF70F1-817F-44E3-835D-5CCE6AD76F0E");
    PAN_PIUUTILIZZAT.set_Header(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_LINKSTAMPA, "LINK STAMPA");
    PAN_PIUUTILIZZAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_LINKSTAMPA, "");
    PAN_PIUUTILIZZAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_LINKSTAMPA, MyGlb.VIS_NORMFIELPADR);
    PAN_PIUUTILIZZAT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_LINKSTAMPA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PIUUTILIZZAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_PARAMETRLINK, "4369FE5A-DF9C-4E7F-8999-8F07D913C045");
    PAN_PIUUTILIZZAT.set_Header(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_PARAMETRLINK, "PARAMETRO LINK");
    PAN_PIUUTILIZZAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_PARAMETRLINK, "");
    PAN_PIUUTILIZZAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_PARAMETRLINK, MyGlb.VIS_NORMFIELPADR);
    PAN_PIUUTILIZZAT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_PARAMETRLINK, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PIUUTILIZZAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_STORICO, "003BDC5B-9DF5-41BC-BBE3-786506567E48");
    PAN_PIUUTILIZZAT.set_Header(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_STORICO, "STORICO");
    PAN_PIUUTILIZZAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_STORICO, "");
    PAN_PIUUTILIZZAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_STORICO, MyGlb.VIS_NORMFIELPADR);
    PAN_PIUUTILIZZAT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_STORICO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PIUUTILIZZAT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PIUUTILIZZAT.SetRect(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_DESCRIZIRAMO, MyGlb.PANEL_LIST, 0, 24, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIUUTILIZZAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_DESCRIZIRAMO, MyGlb.PANEL_LIST, 120);
    PAN_PIUUTILIZZAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_DESCRIZIRAMO, MyGlb.PANEL_LIST, 1);
    PAN_PIUUTILIZZAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_DESCRIZIRAMO, MyGlb.PANEL_LIST, "Più Utilizzate");
    PAN_PIUUTILIZZAT.SetRect(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_DESCRIZIRAMO, MyGlb.PANEL_FORM, 4, 4, 556, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIUUTILIZZAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_DESCRIZIRAMO, MyGlb.PANEL_FORM, 120);
    PAN_PIUUTILIZZAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_DESCRIZIRAMO, MyGlb.PANEL_FORM, 2);
    PAN_PIUUTILIZZAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_DESCRIZIRAMO, MyGlb.PANEL_FORM, "Più Utilizzate");
    PAN_PIUUTILIZZAT.SetFieldPage(PFL_PIUUTILIZZAT_DESCRIZIRAMO, -1, -1);
    PAN_PIUUTILIZZAT.SetFieldPanel(PFL_PIUUTILIZZAT_DESCRIZIRAMO, PPQRY_MENUSTAMSTAT, "A.DESCRIZIONE_RAMO", "DESCRIZIONE_RAMO", 5, 500, 0, -13997);
    PAN_PIUUTILIZZAT.SetRect(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_LINKSTAMPA, MyGlb.PANEL_LIST, 0, 24, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIUUTILIZZAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_LINKSTAMPA, MyGlb.PANEL_LIST, 84);
    PAN_PIUUTILIZZAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_LINKSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_PIUUTILIZZAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_LINKSTAMPA, MyGlb.PANEL_LIST, "LINK STAMPA");
    PAN_PIUUTILIZZAT.SetRect(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_LINKSTAMPA, MyGlb.PANEL_FORM, 4, 4, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIUUTILIZZAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_LINKSTAMPA, MyGlb.PANEL_FORM, 84);
    PAN_PIUUTILIZZAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_LINKSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_PIUUTILIZZAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_LINKSTAMPA, MyGlb.PANEL_FORM, "LINK STAMPA");
    PAN_PIUUTILIZZAT.SetFieldPage(PFL_PIUUTILIZZAT_LINKSTAMPA, -1, -1);
    PAN_PIUUTILIZZAT.SetFieldPanel(PFL_PIUUTILIZZAT_LINKSTAMPA, PPQRY_MENUSTAMSTAT, "A.LINK_STAMPA", "LINK_STAMPA", 5, 100, 0, -13997);
    PAN_PIUUTILIZZAT.SetRect(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_PARAMETRLINK, MyGlb.PANEL_LIST, 0, 24, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIUUTILIZZAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_PARAMETRLINK, MyGlb.PANEL_LIST, 108);
    PAN_PIUUTILIZZAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_PARAMETRLINK, MyGlb.PANEL_LIST, 1);
    PAN_PIUUTILIZZAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_PARAMETRLINK, MyGlb.PANEL_LIST, "PARAMETRO LINK");
    PAN_PIUUTILIZZAT.SetRect(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_PARAMETRLINK, MyGlb.PANEL_FORM, 4, 4, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIUUTILIZZAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_PARAMETRLINK, MyGlb.PANEL_FORM, 108);
    PAN_PIUUTILIZZAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_PARAMETRLINK, MyGlb.PANEL_FORM, 1);
    PAN_PIUUTILIZZAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_PARAMETRLINK, MyGlb.PANEL_FORM, "PARAMETRO LINK");
    PAN_PIUUTILIZZAT.SetFieldPage(PFL_PIUUTILIZZAT_PARAMETRLINK, -1, -1);
    PAN_PIUUTILIZZAT.SetFieldPanel(PFL_PIUUTILIZZAT_PARAMETRLINK, PPQRY_MENUSTAMSTAT, "A.PARAMETRO_LINK", "REMESTSTPALI", 5, 20, 0, -13997);
    PAN_PIUUTILIZZAT.SetRect(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_STORICO, MyGlb.PANEL_LIST, 0, 24, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIUUTILIZZAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_STORICO, MyGlb.PANEL_LIST, 60);
    PAN_PIUUTILIZZAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_STORICO, MyGlb.PANEL_LIST, 1);
    PAN_PIUUTILIZZAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_STORICO, MyGlb.PANEL_LIST, "STORICO");
    PAN_PIUUTILIZZAT.SetRect(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_STORICO, MyGlb.PANEL_FORM, 4, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIUUTILIZZAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_STORICO, MyGlb.PANEL_FORM, 60);
    PAN_PIUUTILIZZAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_STORICO, MyGlb.PANEL_FORM, 1);
    PAN_PIUUTILIZZAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIUUTILIZZAT_STORICO, MyGlb.PANEL_FORM, "STORICO");
    PAN_PIUUTILIZZAT.SetFieldPage(PFL_PIUUTILIZZAT_STORICO, -1, -1);
    PAN_PIUUTILIZZAT.SetFieldPanel(PFL_PIUUTILIZZAT_STORICO, PPQRY_MENUSTAMSTAT, "A.STORICO", "RECMENSTSTST", 5, 2, 0, -13997);
  }

  private void PAN_PIUUTILIZZAT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PIUUTILIZZAT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PIUUTILIZZAT.SetIMDB(IMDB, "PQRY_MENUSTAMSTAT", true);
    PAN_PIUUTILIZZAT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE_RAMO as DESCRIZIONE_RAMO, ");
    SQL.append("  A.CONTATORE as CONTATORE, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.LINK_STAMPA as LINK_STAMPA, ");
    SQL.append("  A.PARAMETRO_LINK as REMESTSTPALI, ");
    SQL.append("  A.STORICO as RECMENSTSTST ");
    PAN_PIUUTILIZZAT.SetQuery(PPQRY_MENUSTAMSTAT, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  MENU_STAMPE_STAT A ");
    PAN_PIUUTILIZZAT.SetQuery(PPQRY_MENUSTAMSTAT, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.UTENTE = ~~TBL_DATISESSIONE.SESSUSERNAME~~) ");
    SQL.append("and   (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    PAN_PIUUTILIZZAT.SetQuery(PPQRY_MENUSTAMSTAT, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PIUUTILIZZAT.SetQuery(PPQRY_MENUSTAMSTAT, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PIUUTILIZZAT.SetQuery(PPQRY_MENUSTAMSTAT, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CONTATORE desc, ");
    SQL.append("  A.DATA_ULTIMO_AGG desc ");
    PAN_PIUUTILIZZAT.SetQuery(PPQRY_MENUSTAMSTAT, 5, SQL, -1, "");
    PAN_PIUUTILIZZAT.SetQueryDB(PPQRY_MENUSTAMSTAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PIUUTILIZZAT.SetMasterTable(0, "MENU_STAMPE_STAT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PIUUTILIZZAT.Status() == 2)
    {
      int oldListQBE = PAN_PIUUTILIZZAT.iUseListQBE;
      PAN_PIUUTILIZZAT.iUseListQBE = 0;
      PAN_PIUUTILIZZAT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PIUUTILIZZAT.PanelCommand(Glb.PCM_FIND);
      PAN_PIUUTILIZZAT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DESCRIZIONE) PAN_DESCRIZIONE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PREFERITI) PAN_PREFERITI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PIUUTILIZZAT) PAN_PIUUTILIZZAT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_DESCRIZIONE) PAN_DESCRIZIONE_ValidateRow(Cancel);
    if (SrcObj == PAN_PREFERITI) PAN_PREFERITI_ValidateRow(Cancel);
    if (SrcObj == PAN_PIUUTILIZZAT) PAN_PIUUTILIZZAT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_DESCRIZIONE) PAN_DESCRIZIONE_DynamicProperties();
    if (SrcObj == PAN_PREFERITI) PAN_PREFERITI_DynamicProperties();
    if (SrcObj == PAN_PIUUTILIZZAT) PAN_PIUUTILIZZAT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DESCRIZIONE) PAN_DESCRIZIONE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PREFERITI) PAN_PREFERITI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PIUUTILIZZAT) PAN_PIUUTILIZZAT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DESCRIZIONE) PAN_DESCRIZIONE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PREFERITI) PAN_PREFERITI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PIUUTILIZZAT) PAN_PIUUTILIZZAT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == TRE_MENUSTAMPE) TRE_MENUSTAMPE_NodeClick(Node);
  }    

  public void OnTreeDropNode(ATree SrcObj, IDVariant SourceHash, IDVariant SourceTreeIndex, IDVariant DestinationHash, IDVariant ShiftKey, IDVariant AltKey, IDVariant ControlKey)
  {
  }    

  public void OnTreeExpandNode(ATree SrcObj, IDVariant HashKey, IDVariant Cancel)
  {
    if (SrcObj == TRE_MENUSTAMPE) TRE_MENUSTAMPE_OnExpandNode(HashKey, Cancel);
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
    if (SrcObj == PAN_PREFERITI) PAN_PREFERITI_OnMouseClick(btn, x, y, xb, yb, c, r, cancel);
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
    if (SrcObj == PAN_PREFERITI) PAN_PREFERITI_OnGenericDrop(draginfo, cancel, button, x, y, xb, yb, colidx, rownum, doc);
  }
  
  public void OnGenericDrag(ATree SrcObj, IDVariant draginfo,  IDVariant button, IDVariant hashkey)
  {
    if (SrcObj == TRE_MENUSTAMPE) TRE_MENUSTAMPE_OnGenericDrag(draginfo, button, hashkey);
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
