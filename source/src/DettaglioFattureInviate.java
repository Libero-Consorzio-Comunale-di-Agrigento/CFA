// **********************************************
// Dettaglio Fatture Inviate
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DettaglioFattureInviate extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARDETFATINV_IDFILE = 0;
  private static int PFL_PARDETFATINV_ESERCIZIO = 1;
  private static int PFL_PARDETFATINV_ENTRATASPESA = 2;
  private static int PFL_PARDETFATINV_PERIODO = 3;
  private static int PFL_PARDETFATINV_NOMEFILEXML = 4;
  private static int PFL_PARDETFATINV_ELIMINATO = 5;

  private static int PPQRY_PARSFATTINVI = 0;


  IDPanel PAN_PARDETFATINV;
  OTabView TAB_TAB;
  private static int PFL_DOCUMENTI_IDCFATFILXML = 0;
  private static int PFL_DOCUMENTI_SEQDOCUMENTO = 1;
  private static int PFL_DOCUMENTI_FATANNOPROG = 2;
  private static int PFL_DOCUMENTI_FATNUMERPROG = 3;
  private static int PFL_DOCUMENTI_SOGDENOMINAZ = 4;
  private static int PFL_DOCUMENTI_SOGNOME = 5;
  private static int PFL_DOCUMENTI_SOGCOGNOME = 6;
  private static int PFL_DOCUMENTI_SOGPARTITIVA = 7;
  private static int PFL_DOCUMENTI_SOGPAESE = 8;
  private static int PFL_DOCUMENTI_SOGCODICFISC = 9;
  private static int PFL_DOCUMENTI_ANNULLATO = 10;
  private static int PFL_DOCUMENTI_TIPODOCUMENT = 11;
  private static int PFL_DOCUMENTI_DATADOCUMENT = 12;
  private static int PFL_DOCUMENTI_NUMERODOCUME = 13;
  private static int PFL_DOCUMENTI_INFOFATTURA = 14;
  private static int PFL_DOCUMENTI_DATAREGISDOC = 15;

  private static int PPQRY_CFADOCFILXML = 0;


  IDPanel PAN_DOCUMENTI;
  private static int PFL_DETTAGLIO_IMPONIIMPORT = 0;
  private static int PFL_DETTAGLIO_IMPOSTA = 1;
  private static int PFL_DETTAGLIO_ALIQUOTA = 2;
  private static int PFL_DETTAGLIO_NATURA = 3;
  private static int PFL_DETTAGLIO_DETRAIBILE = 4;
  private static int PFL_DETTAGLIO_DEDUCIBILE = 5;

  private static int PPQRY_CFADOCDEFIXM = 0;


  IDPanel PAN_DETTAGLIO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARDETFATINV(IMDB);
    //
    //
    Init_PQRY_PARSFATTINVI(IMDB);
    Init_PQRY_PARSFATTINVI_RS(IMDB);
    Init_PQRY_CFADOCFILXML(IMDB);
    Init_PQRY_CFADOCDEFIXM(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARDETFATINV(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARDETFATINV, 7);
    IMDB.set_TblCode(IMDBDef2.TBL_PARDETFATINV, "TBL_PARDETFATINV");
    IMDB.set_FldCode(IMDBDef2.TBL_PARDETFATINV,IMDBDef2.FLD_PARDETFATINV_NOMEOGGEIDFI, "NOMEOGGEIDFI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARDETFATINV,IMDBDef2.FLD_PARDETFATINV_NOMEOGGEIDFI,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARDETFATINV,IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef2.TBL_PARDETFATINV,IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARDETFATINV,IMDBDef2.FLD_PARDETFATINV_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARDETFATINV,IMDBDef2.FLD_PARDETFATINV_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARDETFATINV,IMDBDef2.FLD_PARDETFATINV_NOME_FILE_XML, "NOME_FILE_XML");
    IMDB.SetFldParams(IMDBDef2.TBL_PARDETFATINV,IMDBDef2.FLD_PARDETFATINV_NOME_FILE_XML,5,300,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARDETFATINV,IMDBDef2.FLD_PARDETFATINV_ELIMINATO, "ELIMINATO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARDETFATINV,IMDBDef2.FLD_PARDETFATINV_ELIMINATO,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARDETFATINV,IMDBDef2.FLD_PARDETFATINV_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARDETFATINV,IMDBDef2.FLD_PARDETFATINV_NOMEOGGEPERI,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARDETFATINV,IMDBDef2.FLD_PARDETFATINV_NOMOGGDATRIF, "NOMOGGDATRIF");
    IMDB.SetFldParams(IMDBDef2.TBL_PARDETFATINV,IMDBDef2.FLD_PARDETFATINV_NOMOGGDATRIF,6,16,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARDETFATINV, 0);
  }

  private static void Init_PQRY_PARSFATTINVI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARSFATTINVI, 6);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARSFATTINVI, "PQRY_PARSFATTINVI");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSFATTINVI,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEIDFI, "NOMEOGGEIDFI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSFATTINVI,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEIDFI,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSFATTINVI,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSFATTINVI,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSFATTINVI,IMDBDef10.PQSL_PARSFATTINVI_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSFATTINVI,IMDBDef10.PQSL_PARSFATTINVI_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSFATTINVI,IMDBDef10.PQSL_PARSFATTINVI_NOMOGGNOFIXM, "NOMOGGNOFIXM");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSFATTINVI,IMDBDef10.PQSL_PARSFATTINVI_NOMOGGNOFIXM,5,300,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSFATTINVI,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEELIM, "NOMEOGGEELIM");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSFATTINVI,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEELIM,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSFATTINVI,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSFATTINVI,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEPERI,1,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARSFATTINVI, 0);
  }

  private static void Init_PQRY_PARSFATTINVI_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARSFATTINVI_RS, 6);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARSFATTINVI_RS, "PQRY_PARSFATTINVI_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSFATTINVI_RS,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEIDFI, "NOMEOGGEIDFI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSFATTINVI_RS,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEIDFI,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSFATTINVI_RS,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSFATTINVI_RS,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSFATTINVI_RS,IMDBDef10.PQSL_PARSFATTINVI_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSFATTINVI_RS,IMDBDef10.PQSL_PARSFATTINVI_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSFATTINVI_RS,IMDBDef10.PQSL_PARSFATTINVI_NOMOGGNOFIXM, "NOMOGGNOFIXM");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSFATTINVI_RS,IMDBDef10.PQSL_PARSFATTINVI_NOMOGGNOFIXM,5,300,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSFATTINVI_RS,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEELIM, "NOMEOGGEELIM");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSFATTINVI_RS,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEELIM,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARSFATTINVI_RS,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARSFATTINVI_RS,IMDBDef10.PQSL_PARSFATTINVI_NOMEOGGEPERI,1,1,0);
  }

  private static void Init_PQRY_CFADOCFILXML(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CFADOCFILXML, 16);
    IMDB.set_TblCode(IMDBDef10.PQRY_CFADOCFILXML, "PQRY_CFADOCFILXML");
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOIDCFFX, "RECFDOIDCFFX");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOIDCFFX,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMS1, "RECFDOFIXMS1");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMS1,1,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXFAP, "RECFDOFIXFAP");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXFAP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXFNP, "RECFDOFIXFNP");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXFNP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMSD, "RECFDOFIXMSD");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMSD,5,80,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMSN, "RECFDOFIXMSN");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMSN,5,60,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMSC, "RECFDOFIXMSC");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMSC,5,60,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXSPI, "RECFDOFIXSPI");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXSPI,5,28,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMSP, "RECFDOFIXMSP");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMSP,5,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXSCF, "RECFDOFIXSCF");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXSCF,5,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMAN, "RECFDOFIXMAN");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMAN,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMTD, "RECFDOFIXMTD");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMTD,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMDD, "RECFDOFIXMDD");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMDD,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMND, "RECFDOFIXMND");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXMND,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXDRD, "RECFDOFIXDRD");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXDRD,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECOINFOFATT, "RECOINFOFATT");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCFILXML,IMDBDef10.PQSL_CFADOCFILXML_RECOINFOFATT,5,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CFADOCFILXML, 0);
  }

  private static void Init_PQRY_CFADOCDEFIXM(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CFADOCDEFIXM, 7);
    IMDB.set_TblCode(IMDBDef10.PQRY_CFADOCDEFIXM, "PQRY_CFADOCDEFIXM");
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCDEFIXM,IMDBDef10.PQSL_CFADOCDEFIXM_RECFDODEFXPD, "RECFDODEFXPD");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCDEFIXM,IMDBDef10.PQSL_CFADOCDEFIXM_RECFDODEFXPD,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCDEFIXM,IMDBDef10.PQSL_CFADOCDEFIXM_RECFDODEFXII, "RECFDODEFXII");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCDEFIXM,IMDBDef10.PQSL_CFADOCDEFIXM_RECFDODEFXII,3,15,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCDEFIXM,IMDBDef10.PQSL_CFADOCDEFIXM_RECFDODEFIXI, "RECFDODEFIXI");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCDEFIXM,IMDBDef10.PQSL_CFADOCDEFIXM_RECFDODEFIXI,3,15,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCDEFIXM,IMDBDef10.PQSL_CFADOCDEFIXM_RECFDODEFIXA, "RECFDODEFIXA");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCDEFIXM,IMDBDef10.PQSL_CFADOCDEFIXM_RECFDODEFIXA,3,5,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCDEFIXM,IMDBDef10.PQSL_CFADOCDEFIXM_RECFDODEFIXN, "RECFDODEFIXN");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCDEFIXM,IMDBDef10.PQSL_CFADOCDEFIXM_RECFDODEFIXN,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCDEFIXM,IMDBDef10.PQSL_CFADOCDEFIXM_RECFDODEFIX1, "RECFDODEFIX1");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCDEFIXM,IMDBDef10.PQSL_CFADOCDEFIXM_RECFDODEFIX1,3,5,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFADOCDEFIXM,IMDBDef10.PQSL_CFADOCDEFIXM_RECFDODEFIXD, "RECFDODEFIXD");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFADOCDEFIXM,IMDBDef10.PQSL_CFADOCDEFIXM_RECFDODEFIXD,5,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CFADOCDEFIXM, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DettaglioFattureInviate(MyWebEntryPoint w, IMDBObj imdb)
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
  public DettaglioFattureInviate()
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
    FormIdx = MyGlb.FRM_DETTFATTINVI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B2660289-4A1D-48EA-84C0-2BBC4E0F1A4F";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1104;
    DesignHeight = 482;
    set_Caption(new IDVariant("Dettaglio Fatture Inviate"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1104;
    Frames[1].Height = 456;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.140351;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1104;
    Frames[2].Height = 64;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pars Dett Fatture Inviate";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 64;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARDETFATINV = new IDPanel(w, this, 2, "PAN_PARDETFATINV");
    Frames[2].Content = PAN_PARDETFATINV;
    PAN_PARDETFATINV.Lockable = false;
    PAN_PARDETFATINV.iLocked = false;
    PAN_PARDETFATINV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARDETFATINV.VS = MainFrm.VisualStyleList;
    PAN_PARDETFATINV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1104-MyGlb.PAN_OFFS_X, 64-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARDETFATINV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3206DF1C-5494-4DBA-8EDA-D4699047D849");
    PAN_PARDETFATINV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 324, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARDETFATINV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARDETFATINV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARDETFATINV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARDETFATINV.InitStatus = 2;
    PAN_PARDETFATINV_Init();
    PAN_PARDETFATINV_InitFields();
    PAN_PARDETFATINV_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1104;
    Frames[3].Height = 392;
    Frames[3].Caption = "Tab";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 392;
    TAB_TAB = new OTabView(this);
    Frames[3].Content = TAB_TAB;
    TAB_TAB.iGuid = "BFB135A7-112C-4607-B84D-71BC84ED3EF1";
    TAB_TAB.SetItemCount(2);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 3;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Documenti";
    Frames[4].Parent = this;
    PAN_DOCUMENTI = new IDPanel(w, this, 4, "PAN_DOCUMENTI");
    Frames[4].Content = PAN_DOCUMENTI;
    PAN_DOCUMENTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DOCUMENTI.VS = MainFrm.VisualStyleList;
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1104-MyGlb.PAN_OFFS_X, 392-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "857CFC63-A1A7-4B4F-8288-AC56B136E039");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1476, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DOCUMENTI.InitStatus = 1;
    PAN_DOCUMENTI_Init();
    PAN_DOCUMENTI_InitFields();
    PAN_DOCUMENTI_InitQueries();
    TAB_TAB.SetItem(1, Frames[4], 0, "", "Documenti", "");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "Dettaglio";
    Frames[5].Parent = this;
    PAN_DETTAGLIO = new IDPanel(w, this, 5, "PAN_DETTAGLIO");
    Frames[5].Content = PAN_DETTAGLIO;
    PAN_DETTAGLIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGLIO.VS = MainFrm.VisualStyleList;
    PAN_DETTAGLIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1104-MyGlb.PAN_OFFS_X, 392-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DETTAGLIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "290C8B22-4994-482D-B71B-FE0C363F3105");
    PAN_DETTAGLIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 476, 276, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DETTAGLIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGLIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGLIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGLIO.InitStatus = 2;
    PAN_DETTAGLIO_Init();
    PAN_DETTAGLIO_InitFields();
    PAN_DETTAGLIO_InitQueries();
    TAB_TAB.SetItem(2, Frames[5], 0, "", "Dettaglio", "");
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
      if (CmdIdx==MyGlb.CMD_FUNZAGGIBOTT+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_POPFUNAGGBOT+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGGIBOTT+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CREAFILEANNU+BaseCmdLinIdx)
      {
        CreazioneFileAnnulli();
        break fine;
      }
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARDETFATINV, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DETTFATTINVI_PARSFATTINVI();
      }
      PAN_PARDETFATINV.UpdatePanel(MainFrm);
      PAN_DOCUMENTI.UpdatePanel(MainFrm);
      PAN_DETTAGLIO.UpdatePanel(MainFrm);
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
    return (obj instanceof DettaglioFattureInviate);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DettaglioFattureInviate.class.getName() : (Glb.ClassWithPackage(DettaglioFattureInviate.class) ? DettaglioFattureInviate.class.getName().substring(DettaglioFattureInviate.class.getPackage().getName().length() + 1) : DettaglioFattureInviate.class.getName()));
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
      creaAggiornaListaPeriodi();
      PAN_DOCUMENTI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_DOCUMENTI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      IDVariant v_VIDFILE = null;
      v_VIDFILE = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ID_FILE as CFAFILXMIDFI ");
      SQL.append("from ");
      SQL.append("  CFAT_FILE_XML A ");
      SQL.append("where (A.ID_CFAT_FILE_XML = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEIDFI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VIDFILE = QV.Get("CFAFILXMIDFI", IDVariant.STRING) ;
      }
      QV.Close();
      if (!(IDL.IsNull(v_VIDFILE)))
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_CREAFILEANNU+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdEnabled(MyGlb.CMD_CREAFILEANNU+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEPERI, 0))))
      {
        if (IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0).equals((new IDVariant(2017)), true))
        {
          if (IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEPERI, 0).equals((new IDVariant(1)), true))
          {
            IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMOGGDATRIF, 0, IDL.ToDate((new IDVariant(2017)), (new IDVariant(6)), (new IDVariant(30))));
          }
          else
          {
            IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMOGGDATRIF, 0, IDL.ToDate((new IDVariant(2017)), (new IDVariant(12)), (new IDVariant(31))));
          }
        }
        else
        {
          if (IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEPERI, 0).equals((new IDVariant(1)), true))
          {
            IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0), (new IDVariant(3)), (new IDVariant(31))));
          }
          else if (IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEPERI, 0).equals((new IDVariant(2)), true))
          {
            IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0), (new IDVariant(6)), (new IDVariant(30))));
          }
          else if (IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEPERI, 0).equals((new IDVariant(3)), true))
          {
            IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0), (new IDVariant(9)), (new IDVariant(30))));
          }
          else
          {
            IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMOGGDATRIF, 0, IDL.ToDate(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0), (new IDVariant(12)), (new IDVariant(31))));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioFattureInviate", "Load", _e);
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
      UNLOAD_PARDETFAINDE();
      if ((MainFrm.GetForm(MyGlb.FRM_ELENFATDAINV, 0, false)!=null))
      {
        ((ElencoFattureDaInviare)MainFrm.GetForm(MyGlb.FRM_ELENFATDAINV,0)).PAN_FATTURE.PanelCommand(Glb.PCM_REQUERY);
      }
      if ((MainFrm.GetForm(MyGlb.FRM_ELENFILEINVI, 0, false)!=null))
      {
        ((ElencoFileInviati)MainFrm.GetForm(MyGlb.FRM_ELENFILEINVI,0)).PAN_ELENFILEINVI.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioFattureInviate", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars Dett Fatture Inviate: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARDETFAINDE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEIDFI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMOGGENTSPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOME_FILE_XML, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_ELIMINATO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEPERI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMOGGDATRIF, 0, new IDVariant());
  }

  // **********************************************************************
  // crea Aggiorna Lista Periodi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int creaAggiornaListaPeriodi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // crea Aggiorna Lista Periodi Body
      // Corpo Procedura
      // 
      PAN_PARDETFATINV.ClearValueList(PFL_PARDETFATINV_PERIODO);
      if (IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0).equals((new IDVariant(2017)), true))
      {
        IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
        v_S1 = (new IDVariant("Dal 01/01/2017 Al 30/06/2017"));
        IDVariant v_S2 = new IDVariant(0,IDVariant.STRING);
        v_S2 = (new IDVariant("Dal 01/07/2017 Al 31/12/2017"));
        PAN_PARDETFATINV.SetValueListItem(PFL_PARDETFATINV_PERIODO, (new IDVariant(1)), v_S1.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_PARDETFATINV.SetValueListItem(PFL_PARDETFATINV_PERIODO, (new IDVariant(2)), v_S2.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      else
      {
        if (MainFrm.PERINVCOMFAT.equals((new IDVariant("SEMESTRALE")), true))
        {
          IDVariant v_TS1 = null;
          v_TS1 = (new IDVariant("Dal 01/01/|1 Al 30/06/|1"));
          IDVariant v_TS2 = null;
          v_TS2 = (new IDVariant("dal 01/07/|1 Al 31/12/|1"));
          PAN_PARDETFATINV.SetValueListItem(PFL_PARDETFATINV_PERIODO, (new IDVariant(1)), IDL.FormatMessage(v_TS1, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARDETFATINV.SetValueListItem(PFL_PARDETFATINV_PERIODO, (new IDVariant(2)), IDL.FormatMessage(v_TS2, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
        else
        {
          IDVariant v_T1 = new IDVariant(0,IDVariant.STRING);
          v_T1 = (new IDVariant("Dal 01/01/|1 Al 31/03/|1"));
          IDVariant v_T2 = new IDVariant(0,IDVariant.STRING);
          v_T2 = (new IDVariant("Dal 01/04/|1 Al 30/06/|1"));
          IDVariant v_T3 = new IDVariant(0,IDVariant.STRING);
          v_T3 = (new IDVariant("Dal 01/07/|1 Al 30/09/|1"));
          IDVariant v_T4 = new IDVariant(0,IDVariant.STRING);
          v_T4 = (new IDVariant("Dal 01/10/|1 Al 31/12/|1"));
          PAN_PARDETFATINV.SetValueListItem(PFL_PARDETFATINV_PERIODO, (new IDVariant(1)), IDL.FormatMessage(v_T1, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARDETFATINV.SetValueListItem(PFL_PARDETFATINV_PERIODO, (new IDVariant(2)), IDL.FormatMessage(v_T2, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARDETFATINV.SetValueListItem(PFL_PARDETFATINV_PERIODO, (new IDVariant(3)), IDL.FormatMessage(v_T3, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARDETFATINV.SetValueListItem(PFL_PARDETFATINV_PERIODO, (new IDVariant(4)), IDL.FormatMessage(v_T4, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
      }
      UpdateScreen();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioFattureInviate", "creaAggiornaListaPeriodi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Documenti On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DOCUMENTI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DOCUMENTI);
      // 
      // Documenti On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DOCUMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI_SOGDENOMINAZ,(new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_SOGDENOMINAZ))).stringValue()); 
      PAN_DOCUMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI_SOGNOME,(new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_SOGNOME))).stringValue()); 
      PAN_DOCUMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI_SOGCOGNOME,(new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_SOGCOGNOME))).stringValue()); 
      PAN_DOCUMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI_SOGPARTITIVA,(new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_SOGPARTITIVA))).stringValue()); 
      PAN_DOCUMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI_SOGPAESE,(new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_SOGPAESE))).stringValue()); 
      PAN_DOCUMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI_SOGCODICFISC,(new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_SOGCODICFISC))).stringValue()); 
      PAN_DOCUMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI_TIPODOCUMENT,(new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_TIPODOCUMENT))).stringValue()); 
      PAN_DOCUMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI_DATADOCUMENT,(new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_DATADOCUMENT))).stringValue()); 
      PAN_DOCUMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI_NUMERODOCUME,(new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_NUMERODOCUME))).stringValue()); 
      PAN_DOCUMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_DOCUMENTI_DATAREGISDOC,(new IDVariant(PAN_DOCUMENTI.FieldText(PFL_DOCUMENTI_DATAREGISDOC))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioFattureInviate", "DocumentiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Creazione File Annulli
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CreazioneFileAnnulli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C4;

    try
    {
      TransCount = 0;
      // 
      // Creazione File Annulli Body
      // Corpo Procedura
      // 
      if (!(PAN_DOCUMENTI.ShowMultipleSel()))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Selezionare una o più fatture"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant N = new IDVariant(0,IDVariant.INTEGER);
      MainFrm.Cf4armDBObject.BeginTrans();
      SQL = new StringBuffer();
      SQL.append("delete from CFAT_WRK_FATTURE ");
      SQL.append("where (DATA_CREAZIONE < TRUNC( SYSDATE ) - 30) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      SQL = new StringBuffer();
      SQL.append("delete from CFAT_WRK_FATTURE ");
      SQL.append("where (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      C4 = PAN_DOCUMENTI.MasterRS();
      if (C4.size()>0) CurPos = C4.getRow(); else CurPos = 0;
      if (!C4.Bof()) PAN_DOCUMENTI.GotoFirst();
      while (!PAN_DOCUMENTI.RSEOF())
      {
        if (PAN_DOCUMENTI.IsRowSelected(I.intValue()))
        {
          if (IDL.IsNull(C4.Get("RECFDOFIXMAN")))
          {
            N = IDL.Add(N, (new IDVariant(1)));
            try
            {
              SQL = new StringBuffer();
              SQL.append("insert into CFAT_WRK_FATTURE ");
              SQL.append("( ");
              SQL.append("  SESSIONE, ");
              SQL.append("  PROGRESSIVO, ");
              SQL.append("  E_S, ");
              SQL.append("  ESERCIZIO, ");
              SQL.append("  DATA_RIF, ");
              SQL.append("  ANNO_PROG, ");
              SQL.append("  NUMERO_PROG, ");
              SQL.append("  DATA_CREAZIONE, ");
              SQL.append("  ID_CFAT_FILE_XML, ");
              SQL.append("  SEQ_DOCUMENTO ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ), ");
              SQL.append("  " + IDL.CSql(N, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMOGGENTSPE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMOGGDATRIF, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C4.Get("RECFDOFIXFAP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C4.Get("RECFDOFIXFNP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  TRUNC( SYSDATE ), ");
              SQL.append("  " + IDL.CSql(C4.Get("RECFDOIDCFFX"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C4.Get("RECFDOFIXMS1"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e8)
            {
              MainFrm.set_AlertMessage(new IDVariant(e8.getMessage())); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              return 0;
            }
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_DOCUMENTI.GotoNext();
      }
      if (CurPos>0) C4.absolute(CurPos);
      MainFrm.Cf4armDBObject.CommitTrans();
      if (N.equals((new IDVariant(0)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Selezionare una o più fatture che non siano già state annullate"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      // 
      // --- TUTTO OK dopo di qui
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEESER, 0, IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGETTES, 0, IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMOGGENTSPE, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMEOGGEPERI, 0, IMDB.Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEPERI, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARSCFXML3, IMDBDef2.FLD_PARSCFXML3_NOMOGGXMLOAN, 0, (new IDVariant("A")));
      MainFrm.Show(MyGlb.FRM_CREFILXMCOFA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioFattureInviate", "CreazioneFileAnnulli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Fattura
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoFattura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Fattura Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFADOCFILXML, IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXFAP, 0)))
      {
        return 0;
      }
      if ((MainFrm.GetForm(MyGlb.FRM_INFOFATTURA, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_INFOFATTURA,(new IDVariant(0)).booleanValue()); 
      }
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef10.PQRY_CFADOCFILXML, IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXFAP, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef10.PQRY_CFADOCFILXML, IMDBDef10.PQSL_CFADOCFILXML_RECFDOFIXFNP, 0));
      MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioFattureInviate", "InfoFattura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars Fatture Inviate
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void DETTFATTINVI_PARSFATTINVI() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARSFATTINVI_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARDETFATINV, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARDETFATINV, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARSFATTINVI_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARSFATTINVI_RS, 0, IMDBDef2.TBL_PARDETFATINV, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARSFATTINVI_RS, 0, 0, IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEIDFI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARSFATTINVI_RS, 1, 0, IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARSFATTINVI_RS, 2, 0, IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMOGGENTSPE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARSFATTINVI_RS, 3, 0, IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOME_FILE_XML, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARSFATTINVI_RS, 4, 0, IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_ELIMINATO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARSFATTINVI_RS, 5, 0, IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEPERI, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARDETFATINV, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARDETFATINV, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARDETFATINV, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARSFATTINVI_RS, 0);
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
  private void PAN_PARDETFATINV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARDETFATINV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARDETFATINV_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARDETFATINV, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARDETFATINV_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARDETFATINV);
    // Stub
  }

  private void PAN_PARDETFATINV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARDETFATINV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARDETFATINV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARDETFATINV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void TAB_TAB_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DOCUMENTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DOCUMENTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DOCUMENTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DOCUMENTI, Cancel);
    // Stub
  }

  private void PAN_DOCUMENTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DOCUMENTI_INFOFATTURA)
    {
      this.IdxPanelActived = this.PAN_DOCUMENTI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoFattura();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DOCUMENTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DOCUMENTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DOCUMENTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DETTAGLIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTAGLIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGLIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGLIO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGLIO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DETTAGLIO);
    // Stub
  }

  private void PAN_DETTAGLIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DETTAGLIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGLIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGLIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARDETFATINV_Init()
  {

    PAN_PARDETFATINV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARDETFATINV.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARDETFATINV.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PARDETFATINV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_IDFILE, "684B50BC-8DF3-4CB4-88D6-461DFD70A7FF");
    PAN_PARDETFATINV.set_Header(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_IDFILE, "Idfile");
    PAN_PARDETFATINV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_IDFILE, "");
    PAN_PARDETFATINV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_IDFILE, MyGlb.VIS_NORMFIELPADR);
    PAN_PARDETFATINV.SetFlags(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_IDFILE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARDETFATINV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ESERCIZIO, "619D2FCD-2CFC-453A-AB0F-D5883F2F5599");
    PAN_PARDETFATINV.set_Header(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ESERCIZIO, "Esercizio");
    PAN_PARDETFATINV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ESERCIZIO, "");
    PAN_PARDETFATINV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARDETFATINV.SetFlags(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ESERCIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARDETFATINV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ENTRATASPESA, "75B3DD4B-C225-4FD2-A5DD-F3A47870E819");
    PAN_PARDETFATINV.set_Header(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ENTRATASPESA, "Entrata/Spesa");
    PAN_PARDETFATINV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ENTRATASPESA, "Entrata/Spesa");
    PAN_PARDETFATINV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ENTRATASPESA, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARDETFATINV.SetFlags(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ENTRATASPESA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARDETFATINV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_PERIODO, "49967A87-C577-4CC2-9A97-49FF352028CF");
    PAN_PARDETFATINV.set_Header(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_PERIODO, "Periodo di Riferimento");
    PAN_PARDETFATINV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_PERIODO, "");
    PAN_PARDETFATINV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_PERIODO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARDETFATINV.SetFlags(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_PERIODO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARDETFATINV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_NOMEFILEXML, "15A7B5A5-E528-4E44-8A94-C66F02D76E20");
    PAN_PARDETFATINV.set_Header(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_NOMEFILEXML, "Nome File XML");
    PAN_PARDETFATINV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_NOMEFILEXML, "");
    PAN_PARDETFATINV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_NOMEFILEXML, MyGlb.VIS_NORMALFIELDS);
    PAN_PARDETFATINV.SetFlags(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_NOMEFILEXML, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARDETFATINV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ELIMINATO, "DC6AD73E-D773-4ABD-BF5C-C893F4EF710B");
    PAN_PARDETFATINV.set_Header(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ELIMINATO, "Eliminato");
    PAN_PARDETFATINV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ELIMINATO, "");
    PAN_PARDETFATINV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ELIMINATO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARDETFATINV.SetFlags(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ELIMINATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARDETFATINV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARDETFATINV.SetRect(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_IDFILE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARDETFATINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_IDFILE, MyGlb.PANEL_LIST, 40);
    PAN_PARDETFATINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_IDFILE, MyGlb.PANEL_LIST, 1);
    PAN_PARDETFATINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_IDFILE, MyGlb.PANEL_LIST, "Idfile");
    PAN_PARDETFATINV.SetRect(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_IDFILE, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARDETFATINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_IDFILE, MyGlb.PANEL_FORM, 104);
    PAN_PARDETFATINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_IDFILE, MyGlb.PANEL_FORM, 1);
    PAN_PARDETFATINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_IDFILE, MyGlb.PANEL_FORM, "Idfile");
    PAN_PARDETFATINV.SetFieldPage(PFL_PARDETFATINV_IDFILE, -1, -1);
    PAN_PARDETFATINV.SetFieldPanel(PFL_PARDETFATINV_IDFILE, PPQRY_PARSFATTINVI, "A.NOMEOGGEIDFI", "NOMEOGGEIDFI", 1, 1, 0, -13997);
    PAN_PARDETFATINV.SetRect(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARDETFATINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_PARDETFATINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARDETFATINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARDETFATINV.SetRect(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ESERCIZIO, MyGlb.PANEL_FORM, 36, 8, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARDETFATINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_PARDETFATINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARDETFATINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARDETFATINV.SetFieldPage(PFL_PARDETFATINV_ESERCIZIO, -1, -1);
    PAN_PARDETFATINV.SetFieldPanel(PFL_PARDETFATINV_ESERCIZIO, PPQRY_PARSFATTINVI, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_PARDETFATINV.SetRect(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ENTRATASPESA, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARDETFATINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ENTRATASPESA, MyGlb.PANEL_LIST, 88);
    PAN_PARDETFATINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ENTRATASPESA, MyGlb.PANEL_LIST, 1);
    PAN_PARDETFATINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ENTRATASPESA, MyGlb.PANEL_LIST, "Entrata/Spesa");
    PAN_PARDETFATINV.SetRect(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ENTRATASPESA, MyGlb.PANEL_FORM, 136, 8, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARDETFATINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ENTRATASPESA, MyGlb.PANEL_FORM, 104);
    PAN_PARDETFATINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ENTRATASPESA, MyGlb.PANEL_FORM, 1);
    PAN_PARDETFATINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ENTRATASPESA, MyGlb.PANEL_FORM, "Entrata/Spesa");
    PAN_PARDETFATINV.SetFieldPage(PFL_PARDETFATINV_ENTRATASPESA, -1, -1);
    PAN_PARDETFATINV.SetFieldPanel(PFL_PARDETFATINV_ENTRATASPESA, PPQRY_PARSFATTINVI, "A.NOMOGGENTSPE", "NOMOGGENTSPE", 5, 1, 0, -13997);
    PAN_PARDETFATINV.SetValueListItem(PFL_PARDETFATINV_ENTRATASPESA, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARDETFATINV.SetValueListItem(PFL_PARDETFATINV_ENTRATASPESA, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARDETFATINV.SetRect(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_PERIODO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARDETFATINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_PERIODO, MyGlb.PANEL_LIST, 52);
    PAN_PARDETFATINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_PERIODO, MyGlb.PANEL_LIST, 1);
    PAN_PARDETFATINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_PERIODO, MyGlb.PANEL_LIST, "Per. di Rifer.");
    PAN_PARDETFATINV.SetRect(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_PERIODO, MyGlb.PANEL_FORM, 264, 8, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARDETFATINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_PERIODO, MyGlb.PANEL_FORM, 136);
    PAN_PARDETFATINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_PERIODO, MyGlb.PANEL_FORM, 1);
    PAN_PARDETFATINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_PERIODO, MyGlb.PANEL_FORM, "Periodo di Riferimento");
    PAN_PARDETFATINV.SetFieldPage(PFL_PARDETFATINV_PERIODO, -1, -1);
    PAN_PARDETFATINV.SetFieldPanel(PFL_PARDETFATINV_PERIODO, PPQRY_PARSFATTINVI, "A.NOMEOGGEPERI", "NOMEOGGEPERI", 1, 1, 0, -13997);
    PAN_PARDETFATINV.SetRect(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_NOMEFILEXML, MyGlb.PANEL_LIST, 4, 188, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARDETFATINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_NOMEFILEXML, MyGlb.PANEL_LIST, 104);
    PAN_PARDETFATINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_NOMEFILEXML, MyGlb.PANEL_LIST, 2);
    PAN_PARDETFATINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_NOMEFILEXML, MyGlb.PANEL_LIST, "Nome File XML");
    PAN_PARDETFATINV.SetRect(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_NOMEFILEXML, MyGlb.PANEL_FORM, 4, 32, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARDETFATINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_NOMEFILEXML, MyGlb.PANEL_FORM, 92);
    PAN_PARDETFATINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_NOMEFILEXML, MyGlb.PANEL_FORM, 1);
    PAN_PARDETFATINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_NOMEFILEXML, MyGlb.PANEL_FORM, "Nome File XML");
    PAN_PARDETFATINV.SetFieldPage(PFL_PARDETFATINV_NOMEFILEXML, -1, -1);
    PAN_PARDETFATINV.SetFieldPanel(PFL_PARDETFATINV_NOMEFILEXML, PPQRY_PARSFATTINVI, "A.NOME_FILE_XML", "NOMOGGNOFIXM", 5, 300, 0, -13997);
    PAN_PARDETFATINV.SetRect(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ELIMINATO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARDETFATINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ELIMINATO, MyGlb.PANEL_LIST, 60);
    PAN_PARDETFATINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ELIMINATO, MyGlb.PANEL_LIST, 1);
    PAN_PARDETFATINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ELIMINATO, MyGlb.PANEL_LIST, "Eliminato");
    PAN_PARDETFATINV.SetRect(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ELIMINATO, MyGlb.PANEL_FORM, 340, 32, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARDETFATINV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ELIMINATO, MyGlb.PANEL_FORM, 60);
    PAN_PARDETFATINV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ELIMINATO, MyGlb.PANEL_FORM, 1);
    PAN_PARDETFATINV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARDETFATINV_ELIMINATO, MyGlb.PANEL_FORM, "Eliminato");
    PAN_PARDETFATINV.SetFieldPage(PFL_PARDETFATINV_ELIMINATO, -1, -1);
    PAN_PARDETFATINV.SetFieldPanel(PFL_PARDETFATINV_ELIMINATO, PPQRY_PARSFATTINVI, "A.ELIMINATO", "NOMEOGGEELIM", 5, 2, 0, -13997);
    PAN_PARDETFATINV.SetValueListItem(PFL_PARDETFATINV_ELIMINATO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARDETFATINV.SetValueListItem(PFL_PARDETFATINV_ELIMINATO, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARDETFATINV_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARDETFATINV.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARDETFATINV.SetIMDB(IMDB, "PQRY_PARSFATTINVI", true);
    PAN_PARDETFATINV.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARDETFATINV.SetQueryIMDB(PPQRY_PARSFATTINVI, IMDBDef10.PQRY_PARSFATTINVI_RS, IMDBDef2.TBL_PARDETFATINV);
    JustLoaded = true;
    PAN_PARDETFATINV.SetFieldPrimaryIndex(PFL_PARDETFATINV_IDFILE, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEIDFI);
    PAN_PARDETFATINV.SetFieldPrimaryIndex(PFL_PARDETFATINV_ESERCIZIO, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER);
    PAN_PARDETFATINV.SetFieldPrimaryIndex(PFL_PARDETFATINV_ENTRATASPESA, IMDBDef2.FLD_PARDETFATINV_NOMOGGENTSPE);
    PAN_PARDETFATINV.SetFieldPrimaryIndex(PFL_PARDETFATINV_PERIODO, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEPERI);
    PAN_PARDETFATINV.SetFieldPrimaryIndex(PFL_PARDETFATINV_NOMEFILEXML, IMDBDef2.FLD_PARDETFATINV_NOME_FILE_XML);
    PAN_PARDETFATINV.SetFieldPrimaryIndex(PFL_PARDETFATINV_ELIMINATO, IMDBDef2.FLD_PARDETFATINV_ELIMINATO);
    PAN_PARDETFATINV.SetMasterTable(0, "PARDETFATINV");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARDETFATINV.Status() == 2)
    {
      int oldListQBE = PAN_PARDETFATINV.iUseListQBE;
      PAN_PARDETFATINV.iUseListQBE = 0;
      PAN_PARDETFATINV.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARDETFATINV.PanelCommand(Glb.PCM_FIND);
      PAN_PARDETFATINV.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DOCUMENTI_Init()
  {

    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDCFATFILXML, "63D6937D-2258-421F-92B6-8559E20945DB");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDCFATFILXML, "ID CFAT FILE XML");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDCFATFILXML, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDCFATFILXML, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDCFATFILXML, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEQDOCUMENTO, "D41FFA0E-2743-45CD-B7BD-3BCDBAA1ACD8");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEQDOCUMENTO, "Posizione");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEQDOCUMENTO, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEQDOCUMENTO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEQDOCUMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATANNOPROG, "7E1C34A2-0D71-434C-BE9B-A804C39D0478");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATANNOPROG, "FAT ANNO PROG");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATANNOPROG, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATANNOPROG, MyGlb.VIS_NONNULLAFIEL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATANNOPROG, 0, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATNUMERPROG, "38C3CB61-4D45-49A9-9AD4-E198A0ABA9F4");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATNUMERPROG, "FAT NUMERO PROG");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATNUMERPROG, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATNUMERPROG, MyGlb.VIS_NONNULLAFIEL);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATNUMERPROG, 0, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGDENOMINAZ, "69D1BB86-6C0A-4BE3-BF8A-1D5C98544891");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGDENOMINAZ, "Denominazione");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGDENOMINAZ, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGDENOMINAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGDENOMINAZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGNOME, "AECA3930-4593-40FB-AD84-C0A45E6F1745");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGNOME, "Nome");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGNOME, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGNOME, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGNOME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCOGNOME, "C7AE2559-FDAD-4C31-A9B5-6093E6DA4C99");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCOGNOME, "Cognome");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCOGNOME, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCOGNOME, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCOGNOME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPARTITIVA, "E07B8083-2724-41CB-A1CD-E36340DDA1A5");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPARTITIVA, "Partita IVA");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPARTITIVA, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPARTITIVA, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPARTITIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPAESE, "0EC27CD1-2376-4098-9102-4956BD539C9C");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPAESE, "Paese");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPAESE, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPAESE, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPAESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCODICFISC, "0722892A-9023-4EC6-B388-A387EB73FB1B");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCODICFISC, "Codice Fiscale");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCODICFISC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCODICFISC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCODICFISC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNULLATO, "75C31F83-931C-4031-8B6B-A7244A45D374");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNULLATO, "Annullato");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNULLATO, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNULLATO, MyGlb.VIS_CHECKSTYLE);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNULLATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPODOCUMENT, "448DA0B6-E096-4EDC-940F-0B73908198B9");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPODOCUMENT, "Tipo Documento");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPODOCUMENT, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPODOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPODOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOCUMENT, "30FDB5A4-A68B-4F77-A38B-EBF0396CFAFF");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOCUMENT, "Data Documento");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOCUMENT, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOCUME, "0F28E5A7-2A63-45DA-9137-3A6AEEB60684");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOCUME, "Numero Documento");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOCUME, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOCUME, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOCUME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, "C671FA39-60B7-4CB7-9769-E05F1D676FDF");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, " ");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.VIS_HYPELINKIMMA);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DOCUMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREGISDOC, "34CB220C-ADD8-4F74-81C7-F81127F32057");
    PAN_DOCUMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREGISDOC, "Data Registrazione");
    PAN_DOCUMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREGISDOC, "");
    PAN_DOCUMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREGISDOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCUMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREGISDOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DOCUMENTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDCFATFILXML, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDCFATFILXML, MyGlb.PANEL_LIST, 104);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDCFATFILXML, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDCFATFILXML, MyGlb.PANEL_LIST, "ID CFAT FILE XML");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDCFATFILXML, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDCFATFILXML, MyGlb.PANEL_FORM, 104);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDCFATFILXML, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_IDCFATFILXML, MyGlb.PANEL_FORM, "ID CFAT FILE XML");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_IDCFATFILXML, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_IDCFATFILXML, PPQRY_CFADOCFILXML, "A.ID_CFAT_FILE_XML", "RECFDOIDCFFX", 3, 10, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEQDOCUMENTO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEQDOCUMENTO, MyGlb.PANEL_LIST, 104);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEQDOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEQDOCUMENTO, MyGlb.PANEL_LIST, "Posizione");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEQDOCUMENTO, MyGlb.PANEL_FORM, 4, 28, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEQDOCUMENTO, MyGlb.PANEL_FORM, 104);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEQDOCUMENTO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SEQDOCUMENTO, MyGlb.PANEL_FORM, "Posizione");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_SEQDOCUMENTO, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_SEQDOCUMENTO, PPQRY_CFADOCFILXML, "A.SEQ_DOCUMENTO", "RECFDOFIXMS1", 1, 8, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATANNOPROG, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATANNOPROG, MyGlb.PANEL_LIST, 96);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATANNOPROG, MyGlb.PANEL_LIST, "FAT ANNO PROG");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATANNOPROG, MyGlb.PANEL_FORM, 4, 4, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATANNOPROG, MyGlb.PANEL_FORM, 96);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATANNOPROG, MyGlb.PANEL_FORM, "FAT ANNO PROG");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_FATANNOPROG, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_FATANNOPROG, PPQRY_CFADOCFILXML, "A.FAT_ANNO_PROG", "RECFDOFIXFAP", 1, 4, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATNUMERPROG, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATNUMERPROG, MyGlb.PANEL_LIST, 116);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATNUMERPROG, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATNUMERPROG, MyGlb.PANEL_LIST, "FAT NUMERO PROG");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATNUMERPROG, MyGlb.PANEL_FORM, 4, 28, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATNUMERPROG, MyGlb.PANEL_FORM, 116);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATNUMERPROG, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_FATNUMERPROG, MyGlb.PANEL_FORM, "FAT NUMERO PROG");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_FATNUMERPROG, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_FATNUMERPROG, PPQRY_CFADOCFILXML, "A.FAT_NUMERO_PROG", "RECFDOFIXFNP", 1, 5, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGDENOMINAZ, MyGlb.PANEL_LIST, 68, 36, 292, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGDENOMINAZ, MyGlb.PANEL_LIST, 128);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGDENOMINAZ, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGDENOMINAZ, MyGlb.PANEL_LIST, "Denominazione");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGDENOMINAZ, MyGlb.PANEL_FORM, 4, 4, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGDENOMINAZ, MyGlb.PANEL_FORM, 128);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGDENOMINAZ, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGDENOMINAZ, MyGlb.PANEL_FORM, "Denominazione");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_SOGDENOMINAZ, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_SOGDENOMINAZ, PPQRY_CFADOCFILXML, "A.SOG_DENOMINAZIONE", "RECFDOFIXMSD", 5, 80, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGNOME, MyGlb.PANEL_LIST, 360, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGNOME, MyGlb.PANEL_LIST, 68);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGNOME, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGNOME, MyGlb.PANEL_LIST, "Nome");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGNOME, MyGlb.PANEL_FORM, 4, 28, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGNOME, MyGlb.PANEL_FORM, 68);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGNOME, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGNOME, MyGlb.PANEL_FORM, "Nome");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_SOGNOME, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_SOGNOME, PPQRY_CFADOCFILXML, "A.SOG_NOME", "RECFDOFIXMSN", 5, 60, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCOGNOME, MyGlb.PANEL_LIST, 520, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCOGNOME, MyGlb.PANEL_LIST, 88);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCOGNOME, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCOGNOME, MyGlb.PANEL_LIST, "Cognome");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCOGNOME, MyGlb.PANEL_FORM, 4, 52, 400, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCOGNOME, MyGlb.PANEL_FORM, 88);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCOGNOME, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCOGNOME, MyGlb.PANEL_FORM, "Cognome");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_SOGCOGNOME, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_SOGCOGNOME, PPQRY_CFADOCFILXML, "A.SOG_COGNOME", "RECFDOFIXMSC", 5, 60, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPARTITIVA, MyGlb.PANEL_LIST, 680, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPARTITIVA, MyGlb.PANEL_LIST, 108);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPARTITIVA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPARTITIVA, MyGlb.PANEL_LIST, "Partita IVA");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPARTITIVA, MyGlb.PANEL_FORM, 4, 76, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPARTITIVA, MyGlb.PANEL_FORM, 108);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPARTITIVA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPARTITIVA, MyGlb.PANEL_FORM, "Partita IVA");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_SOGPARTITIVA, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_SOGPARTITIVA, PPQRY_CFADOCFILXML, "A.SOG_PARTITA_IVA", "RECFDOFIXSPI", 5, 28, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPAESE, MyGlb.PANEL_LIST, 800, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPAESE, MyGlb.PANEL_LIST, 68);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPAESE, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPAESE, MyGlb.PANEL_LIST, "Paese");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPAESE, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPAESE, MyGlb.PANEL_FORM, 68);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPAESE, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGPAESE, MyGlb.PANEL_FORM, "Paese");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_SOGPAESE, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_SOGPAESE, PPQRY_CFADOCFILXML, "A.SOG_PAESE", "RECFDOFIXMSP", 5, 5, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCODICFISC, MyGlb.PANEL_LIST, 844, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCODICFISC, MyGlb.PANEL_LIST, 124);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCODICFISC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCODICFISC, MyGlb.PANEL_LIST, "Codice Fiscale");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCODICFISC, MyGlb.PANEL_FORM, 4, 124, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCODICFISC, MyGlb.PANEL_FORM, 124);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCODICFISC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_SOGCODICFISC, MyGlb.PANEL_FORM, "Codice Fiscale");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_SOGCODICFISC, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_SOGCODICFISC, PPQRY_CFADOCFILXML, "A.SOG_CODICE_FISCALE", "RECFDOFIXSCF", 5, 16, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNULLATO, MyGlb.PANEL_LIST, 964, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNULLATO, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNULLATO, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNULLATO, MyGlb.PANEL_LIST, "Annullato");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNULLATO, MyGlb.PANEL_FORM, 4, 148, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNULLATO, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNULLATO, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_ANNULLATO, MyGlb.PANEL_FORM, "Annullato");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_ANNULLATO, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_ANNULLATO, PPQRY_CFADOCFILXML, "A.ANNULLATO", "RECFDOFIXMAN", 5, 2, 0, -13997);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_ANNULLATO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_ANNULLATO, (new IDVariant()), "Null", "", "", -1);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPODOCUMENT, MyGlb.PANEL_LIST, 1028, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPODOCUMENT, MyGlb.PANEL_LIST, 108);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPODOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPODOCUMENT, MyGlb.PANEL_LIST, "Tipo Documento");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPODOCUMENT, MyGlb.PANEL_FORM, 4, 172, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPODOCUMENT, MyGlb.PANEL_FORM, 108);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPODOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_TIPODOCUMENT, MyGlb.PANEL_FORM, "Tipo Documento");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_TIPODOCUMENT, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_TIPODOCUMENT, PPQRY_CFADOCFILXML, "A.TIPO_DOCUMENTO", "RECFDOFIXMTD", 5, 4, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOCUMENT, MyGlb.PANEL_LIST, 1136, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOCUMENT, MyGlb.PANEL_LIST, 112);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOCUMENT, MyGlb.PANEL_LIST, "Data Documento");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOCUMENT, MyGlb.PANEL_FORM, 4, 196, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOCUMENT, MyGlb.PANEL_FORM, 112);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATADOCUMENT, MyGlb.PANEL_FORM, "Data Documento");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DATADOCUMENT, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DATADOCUMENT, PPQRY_CFADOCFILXML, "A.DATA_DOCUMENTO", "RECFDOFIXMDD", 6, 19, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOCUME, MyGlb.PANEL_LIST, 1212, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOCUME, MyGlb.PANEL_LIST, 128);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOCUME, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOCUME, MyGlb.PANEL_LIST, "Numero Documento");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOCUME, MyGlb.PANEL_FORM, 4, 220, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOCUME, MyGlb.PANEL_FORM, 128);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOCUME, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_NUMERODOCUME, MyGlb.PANEL_FORM, "Numero Documento");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_NUMERODOCUME, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_NUMERODOCUME, PPQRY_CFADOCFILXML, "A.NUMERO_DOCUMENTO", "RECFDOFIXMND", 5, 20, 0, -13997);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_LIST, 1368, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_LIST, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_LIST, " ");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_FORM, 4, 268, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_FORM, 76);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_INFOFATTURA, MyGlb.PANEL_FORM, " ");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_INFOFATTURA, -1, -1);
    PAN_DOCUMENTI.SetFieldUnbound(PFL_DOCUMENTI_INFOFATTURA, true);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_INFOFATTURA, PPQRY_CFADOCFILXML, "'I'", "RECOINFOFATT", 5, 1, 0, -13997);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DOCUMENTI.SetValueListItem(PFL_DOCUMENTI_INFOFATTURA, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREGISDOC, MyGlb.PANEL_LIST, 1388, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREGISDOC, MyGlb.PANEL_LIST, 160);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREGISDOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREGISDOC, MyGlb.PANEL_LIST, "Data Registrazione");
    PAN_DOCUMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREGISDOC, MyGlb.PANEL_FORM, 4, 244, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCUMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREGISDOC, MyGlb.PANEL_FORM, 160);
    PAN_DOCUMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREGISDOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCUMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCUMENTI_DATAREGISDOC, MyGlb.PANEL_FORM, "Data Registrazione");
    PAN_DOCUMENTI.SetFieldPage(PFL_DOCUMENTI_DATAREGISDOC, -1, -1);
    PAN_DOCUMENTI.SetFieldPanel(PFL_DOCUMENTI_DATAREGISDOC, PPQRY_CFADOCFILXML, "A.DATA_REGISTRAZIONE_DOC", "RECFDOFIXDRD", 6, 19, 0, -13997);
  }

  private void PAN_DOCUMENTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_DOCUMENTI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DOCUMENTI.SetIMDB(IMDB, "PQRY_CFADOCFILXML", true);
    PAN_DOCUMENTI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_CFAT_FILE_XML as RECFDOIDCFFX, ");
    SQL.append("  A.SEQ_DOCUMENTO as RECFDOFIXMS1, ");
    SQL.append("  A.FAT_ANNO_PROG as RECFDOFIXFAP, ");
    SQL.append("  A.FAT_NUMERO_PROG as RECFDOFIXFNP, ");
    SQL.append("  A.SOG_DENOMINAZIONE as RECFDOFIXMSD, ");
    SQL.append("  A.SOG_NOME as RECFDOFIXMSN, ");
    SQL.append("  A.SOG_COGNOME as RECFDOFIXMSC, ");
    SQL.append("  A.SOG_PARTITA_IVA as RECFDOFIXSPI, ");
    SQL.append("  A.SOG_PAESE as RECFDOFIXMSP, ");
    SQL.append("  A.SOG_CODICE_FISCALE as RECFDOFIXSCF, ");
    SQL.append("  A.ANNULLATO as RECFDOFIXMAN, ");
    SQL.append("  A.TIPO_DOCUMENTO as RECFDOFIXMTD, ");
    SQL.append("  A.DATA_DOCUMENTO as RECFDOFIXMDD, ");
    SQL.append("  A.NUMERO_DOCUMENTO as RECFDOFIXMND, ");
    SQL.append("  A.DATA_REGISTRAZIONE_DOC as RECFDOFIXDRD, ");
    SQL.append("  'I' as RECOINFOFATT ");
    PAN_DOCUMENTI.SetQuery(PPQRY_CFADOCFILXML, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CFAT_DOCUMENTI_FILE_XML A ");
    PAN_DOCUMENTI.SetQuery(PPQRY_CFADOCFILXML, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ID_CFAT_FILE_XML = ~~TBL_PARDETFATINV.NOMEOGGEIDFI~~) ");
    PAN_DOCUMENTI.SetQuery(PPQRY_CFADOCFILXML, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMENTI.SetQuery(PPQRY_CFADOCFILXML, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCUMENTI.SetQuery(PPQRY_CFADOCFILXML, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.SEQ_DOCUMENTO ");
    PAN_DOCUMENTI.SetQuery(PPQRY_CFADOCFILXML, 5, SQL, -1, "");
    PAN_DOCUMENTI.SetQueryDB(PPQRY_CFADOCFILXML, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCUMENTI.SetMasterTable(0, "CFAT_DOCUMENTI_FILE_XML");
    PAN_DOCUMENTI.AddToSortList(PFL_DOCUMENTI_SEQDOCUMENTO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DOCUMENTI.Status() == 2)
    {
      int oldListQBE = PAN_DOCUMENTI.iUseListQBE;
      PAN_DOCUMENTI.iUseListQBE = 0;
      PAN_DOCUMENTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_DOCUMENTI.PanelCommand(Glb.PCM_FIND);
      PAN_DOCUMENTI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DETTAGLIO_Init()
  {

    PAN_DETTAGLIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGLIO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DETTAGLIO.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_DETTAGLIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPONIIMPORT, "DBFFBAA3-99F6-4D65-A2B1-FFE5BC71433D");
    PAN_DETTAGLIO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPONIIMPORT, "Imponibile");
    PAN_DETTAGLIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPONIIMPORT, "");
    PAN_DETTAGLIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPONIIMPORT, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGLIO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPONIIMPORT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPOSTA, "737EC024-BC1E-40C5-A28E-8EFA136ABC22");
    PAN_DETTAGLIO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPOSTA, "Imposta");
    PAN_DETTAGLIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPOSTA, "");
    PAN_DETTAGLIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPOSTA, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGLIO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_ALIQUOTA, "7A568410-A033-4254-9FF8-D9BA1FBAA807");
    PAN_DETTAGLIO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_ALIQUOTA, "Aliquota");
    PAN_DETTAGLIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_ALIQUOTA, "");
    PAN_DETTAGLIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_ALIQUOTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_ALIQUOTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_NATURA, "C4BFC707-797E-43C3-B651-F4827A6B182C");
    PAN_DETTAGLIO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_NATURA, "Natura");
    PAN_DETTAGLIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_NATURA, "");
    PAN_DETTAGLIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_NATURA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_NATURA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DETRAIBILE, "0C5FC668-2454-479F-9955-0C7A6E1C2B5C");
    PAN_DETTAGLIO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DETRAIBILE, "Detraibile");
    PAN_DETTAGLIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DETRAIBILE, "");
    PAN_DETTAGLIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DETRAIBILE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DETRAIBILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DEDUCIBILE, "070EDDB3-E4C3-4719-9ECA-AB00B51AD033");
    PAN_DETTAGLIO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DEDUCIBILE, "Deducibile");
    PAN_DETTAGLIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DEDUCIBILE, "");
    PAN_DETTAGLIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DEDUCIBILE, MyGlb.VIS_CHECKSTYLE);
    PAN_DETTAGLIO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DEDUCIBILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DETTAGLIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGLIO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPONIIMPORT, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPONIIMPORT, MyGlb.PANEL_LIST, 132);
    PAN_DETTAGLIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPONIIMPORT, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPONIIMPORT, MyGlb.PANEL_LIST, "Imponibile");
    PAN_DETTAGLIO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPONIIMPORT, MyGlb.PANEL_FORM, 4, 4, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPONIIMPORT, MyGlb.PANEL_FORM, 132);
    PAN_DETTAGLIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPONIIMPORT, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPONIIMPORT, MyGlb.PANEL_FORM, "Imponibile");
    PAN_DETTAGLIO.SetFieldPage(PFL_DETTAGLIO_IMPONIIMPORT, -1, -1);
    PAN_DETTAGLIO.SetFieldPanel(PFL_DETTAGLIO_IMPONIIMPORT, PPQRY_CFADOCDEFIXM, "A.IMPONIBILE_IMPORTO", "RECFDODEFXII", 3, 15, 2, -13997);
    PAN_DETTAGLIO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPOSTA, MyGlb.PANEL_LIST, 132, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPOSTA, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGLIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPOSTA, MyGlb.PANEL_LIST, "Imposta");
    PAN_DETTAGLIO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPOSTA, MyGlb.PANEL_FORM, 4, 28, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGLIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_IMPOSTA, MyGlb.PANEL_FORM, "Imposta");
    PAN_DETTAGLIO.SetFieldPage(PFL_DETTAGLIO_IMPOSTA, -1, -1);
    PAN_DETTAGLIO.SetFieldPanel(PFL_DETTAGLIO_IMPOSTA, PPQRY_CFADOCDEFIXM, "A.IMPOSTA", "RECFDODEFIXI", 3, 15, 2, -13997);
    PAN_DETTAGLIO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_ALIQUOTA, MyGlb.PANEL_LIST, 216, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_ALIQUOTA, MyGlb.PANEL_LIST, 68);
    PAN_DETTAGLIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_ALIQUOTA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_ALIQUOTA, MyGlb.PANEL_LIST, "Aliquota");
    PAN_DETTAGLIO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_ALIQUOTA, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_ALIQUOTA, MyGlb.PANEL_FORM, 68);
    PAN_DETTAGLIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_ALIQUOTA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_ALIQUOTA, MyGlb.PANEL_FORM, "Aliquota");
    PAN_DETTAGLIO.SetFieldPage(PFL_DETTAGLIO_ALIQUOTA, -1, -1);
    PAN_DETTAGLIO.SetFieldPanel(PFL_DETTAGLIO_ALIQUOTA, PPQRY_CFADOCDEFIXM, "A.ALIQUOTA", "RECFDODEFIXA", 3, 5, 2, -13997);
    PAN_DETTAGLIO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_NATURA, MyGlb.PANEL_LIST, 284, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_NATURA, MyGlb.PANEL_LIST, 48);
    PAN_DETTAGLIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_NATURA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_NATURA, MyGlb.PANEL_LIST, "Natura");
    PAN_DETTAGLIO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_NATURA, MyGlb.PANEL_FORM, 4, 76, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_NATURA, MyGlb.PANEL_FORM, 48);
    PAN_DETTAGLIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_NATURA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_NATURA, MyGlb.PANEL_FORM, "Natura");
    PAN_DETTAGLIO.SetFieldPage(PFL_DETTAGLIO_NATURA, -1, -1);
    PAN_DETTAGLIO.SetFieldPanel(PFL_DETTAGLIO_NATURA, PPQRY_CFADOCDEFIXM, "A.NATURA", "RECFDODEFIXN", 5, 2, 0, -13997);
    PAN_DETTAGLIO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DETRAIBILE, MyGlb.PANEL_LIST, 332, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DETRAIBILE, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DETRAIBILE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DETRAIBILE, MyGlb.PANEL_LIST, "Detraibile");
    PAN_DETTAGLIO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DETRAIBILE, MyGlb.PANEL_FORM, 4, 100, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DETRAIBILE, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGLIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DETRAIBILE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DETRAIBILE, MyGlb.PANEL_FORM, "Detraibile");
    PAN_DETTAGLIO.SetFieldPage(PFL_DETTAGLIO_DETRAIBILE, -1, -1);
    PAN_DETTAGLIO.SetFieldPanel(PFL_DETTAGLIO_DETRAIBILE, PPQRY_CFADOCDEFIXM, "A.DETRAIBILE", "RECFDODEFIX1", 3, 5, 2, -13997);
    PAN_DETTAGLIO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DEDUCIBILE, MyGlb.PANEL_LIST, 408, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DEDUCIBILE, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DEDUCIBILE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DEDUCIBILE, MyGlb.PANEL_LIST, "Deducibile");
    PAN_DETTAGLIO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DEDUCIBILE, MyGlb.PANEL_FORM, 4, 124, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DEDUCIBILE, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGLIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DEDUCIBILE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIO_DEDUCIBILE, MyGlb.PANEL_FORM, "Deducibile");
    PAN_DETTAGLIO.SetFieldPage(PFL_DETTAGLIO_DEDUCIBILE, -1, -1);
    PAN_DETTAGLIO.SetFieldPanel(PFL_DETTAGLIO_DEDUCIBILE, PPQRY_CFADOCDEFIXM, "A.DEDUCIBILE", "RECFDODEFIXD", 5, 2, 0, -13997);
    PAN_DETTAGLIO.SetValueListItem(PFL_DETTAGLIO_DEDUCIBILE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DETTAGLIO.SetValueListItem(PFL_DETTAGLIO_DEDUCIBILE, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_DETTAGLIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGLIO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DETTAGLIO.SetIMDB(IMDB, "PQRY_CFADOCDEFIXM", true);
    PAN_DETTAGLIO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_DETTAGLIO as RECFDODEFXPD, ");
    SQL.append("  A.IMPONIBILE_IMPORTO as RECFDODEFXII, ");
    SQL.append("  A.IMPOSTA as RECFDODEFIXI, ");
    SQL.append("  A.ALIQUOTA as RECFDODEFIXA, ");
    SQL.append("  A.NATURA as RECFDODEFIXN, ");
    SQL.append("  A.DETRAIBILE as RECFDODEFIX1, ");
    SQL.append("  A.DEDUCIBILE as RECFDODEFIXD ");
    PAN_DETTAGLIO.SetQuery(PPQRY_CFADOCDEFIXM, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CFAT_DOC_DETTAGLIO_FILE_XML A ");
    PAN_DETTAGLIO.SetQuery(PPQRY_CFADOCDEFIXM, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SEQ_DOCUMENTO = ~~PQRY_CFADOCFILXML.RECFDOFIXMS1~~) ");
    SQL.append("and   (A.ID_CFAT_FILE_XML = ~~PQRY_CFADOCFILXML.RECFDOIDCFFX~~) ");
    PAN_DETTAGLIO.SetQuery(PPQRY_CFADOCDEFIXM, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLIO.SetQuery(PPQRY_CFADOCDEFIXM, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLIO.SetQuery(PPQRY_CFADOCDEFIXM, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGR_DETTAGLIO ");
    PAN_DETTAGLIO.SetQuery(PPQRY_CFADOCDEFIXM, 5, SQL, -1, "");
    PAN_DETTAGLIO.SetQueryDB(PPQRY_CFADOCDEFIXM, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLIO.SetMasterTable(0, "CFAT_DOC_DETTAGLIO_FILE_XML");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGLIO.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGLIO.iUseListQBE;
      PAN_DETTAGLIO.iUseListQBE = 0;
      PAN_DETTAGLIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGLIO.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGLIO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARDETFATINV) PAN_PARDETFATINV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DETTAGLIO) PAN_DETTAGLIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARDETFATINV) PAN_PARDETFATINV_ValidateRow(Cancel);
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_ValidateRow(Cancel);
    if (SrcObj == PAN_DETTAGLIO) PAN_DETTAGLIO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARDETFATINV) PAN_PARDETFATINV_DynamicProperties();
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_DynamicProperties();
    if (SrcObj == PAN_DETTAGLIO) PAN_DETTAGLIO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARDETFATINV) PAN_PARDETFATINV_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DETTAGLIO) PAN_DETTAGLIO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARDETFATINV) PAN_PARDETFATINV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DOCUMENTI) PAN_DOCUMENTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DETTAGLIO) PAN_DETTAGLIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TAB) TAB_TAB_Click(PreviousPage, Cancel);
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
