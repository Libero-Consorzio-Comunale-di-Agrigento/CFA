// **********************************************
// Movimenti Proposte
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MovimentiProposte extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_TOTALI = 0;

  private static int PFL_PARAMETRI_UNITAPROP = 0;
  private static int PFL_PARAMETRI_NUMEROPROP = 1;
  private static int PFL_PARAMETRI_ANNOPROP = 2;
  private static int PFL_PARAMETRI_PROPOSTLABEL = 3;
  private static int PFL_PARAMETRI_TRATTINLABEL = 4;
  private static int PFL_PARAMETRI_BARRALABEL = 5;
  private static int PFL_PARAMETRI_ETICBLOCSBLO = 6;
  private static int PFL_PARAMETRI_STATO = 7;
  private static int PFL_PARAMETRI_IMPEGNI = 8;
  private static int PFL_PARAMETRI_TOTALSUBIMPE = 9;
  private static int PFL_PARAMETRI_ACCERTAMENTI = 10;
  private static int PFL_PARAMETRI_VARIMPEGNI = 11;
  private static int PFL_PARAMETRI_VARSUBIMPEGN = 12;
  private static int PFL_PARAMETRI_VARACCERTAME = 13;
  private static int PFL_PARAMETRI_LIQUIDAZIONI = 14;
  private static int PFL_PARAMETRI_MANDATI = 15;

  private static int PPQRY_PARAMETRI246 = 0;

  private static int PPQRY_IMP = 1;
  private static int PPQRY_SUBIMP = 2;
  private static int PPQRY_ACC = 3;
  private static int PPQRY_VARIMP = 4;
  private static int PPQRY_VARACC = 5;
  private static int PPQRY_VARSUB = 6;
  private static int PPQRY_VARCOM = 7;
  private static int PPQRY_VARCOMPRO = 8;
  private static int PPQRY_LIQMAN = 9;


  IDPanel PAN_PARAMETRI;
  private static int PFL_MOVIMEPROPOS_ES = 0;
  private static int PFL_MOVIMEPROPOS_CAPITOLO = 1;
  private static int PFL_MOVIMEPROPOS_ARTICOLO = 2;
  private static int PFL_MOVIMEPROPOS_INFOCAP = 3;
  private static int PFL_MOVIMEPROPOS_APRICAP = 4;
  private static int PFL_MOVIMEPROPOS_NUMEROIMPACC = 5;
  private static int PFL_MOVIMEPROPOS_ANNOIMPACC = 6;
  private static int PFL_MOVIMEPROPOS_INFOIMPACC = 7;
  private static int PFL_MOVIMEPROPOS_APRIIMPACC = 8;
  private static int PFL_MOVIMEPROPOS_NUMEROSUBIMP = 9;
  private static int PFL_MOVIMEPROPOS_ANNOSUBIMP = 10;
  private static int PFL_MOVIMEPROPOS_INFOSUBIMP = 11;
  private static int PFL_MOVIMEPROPOS_APRISUBIMP = 12;
  private static int PFL_MOVIMEPROPOS_NUMEROLIQ = 13;
  private static int PFL_MOVIMEPROPOS_ANNOLIQ = 14;
  private static int PFL_MOVIMEPROPOS_INFOLIQ = 15;
  private static int PFL_MOVIMEPROPOS_APRILIQ = 16;
  private static int PFL_MOVIMEPROPOS_NUMEROMAND = 17;
  private static int PFL_MOVIMEPROPOS_ANNOMAND = 18;
  private static int PFL_MOVIMEPROPOS_INFOMAN = 19;
  private static int PFL_MOVIMEPROPOS_APRIMAN = 20;
  private static int PFL_MOVIMEPROPOS_TIPO = 21;
  private static int PFL_MOVIMEPROPOS_IMPORTO = 22;
  private static int PFL_MOVIMEPROPOS_DESCRIZIONE = 23;
  private static int PFL_MOVIMEPROPOS_SOGGETTO = 24;
  private static int PFL_MOVIMEPROPOS_IMPACCLABEL = 25;
  private static int PFL_MOVIMEPROPOS_SUBIMPEGLABE = 26;
  private static int PFL_MOVIMEPROPOS_LIQUIDALABEL = 27;
  private static int PFL_MOVIMEPROPOS_MANDATOLABEL = 28;
  private static int PFL_MOVIMEPROPOS_CAPITOLOART = 29;
  private static int PFL_MOVIMEPROPOS_TIPOMOVI = 30;
  private static int PFL_MOVIMEPROPOS_PROGRESSIVAR = 31;

  private static int PPQRY_MOVIMENTPROP = 0;


  IDPanel PAN_MOVIMEPROPOS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI221(IMDB);
    //
    //
    Init_PQRY_PARAMETRI246(IMDB);
    Init_PQRY_PARAMETRI246_RS(IMDB);
    Init_PQRY_MOVIMENTPROP(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI221(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI221, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI221, "TBL_PARAMETRI221");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI221,IMDBDef2.FLD_PARAMETRI221_PARAUNITPROP, "PARAUNITPROP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI221,IMDBDef2.FLD_PARAMETRI221_PARAUNITPROP,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI221,IMDBDef2.FLD_PARAMETRI221_PARANUMEPROP, "PARANUMEPROP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI221,IMDBDef2.FLD_PARAMETRI221_PARANUMEPROP,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI221,IMDBDef2.FLD_PARAMETRI221_PARAANNOPROP, "PARAANNOPROP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI221,IMDBDef2.FLD_PARAMETRI221_PARAANNOPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI221,IMDBDef2.FLD_PARAMETRI221_PARAMSTATO, "PARAMSTATO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI221,IMDBDef2.FLD_PARAMETRI221_PARAMSTATO,1,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI221, 0);
  }

  private static void Init_PQRY_PARAMETRI246(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI246, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI246, "PQRY_PARAMETRI246");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI246,IMDBDef9.PQSL_PARAMETRI246_PARAUNITPROP, "PARAUNITPROP");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI246,IMDBDef9.PQSL_PARAMETRI246_PARAUNITPROP,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI246,IMDBDef9.PQSL_PARAMETRI246_PARANUMEPROP, "PARANUMEPROP");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI246,IMDBDef9.PQSL_PARAMETRI246_PARANUMEPROP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI246,IMDBDef9.PQSL_PARAMETRI246_PARAANNOPROP, "PARAANNOPROP");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI246,IMDBDef9.PQSL_PARAMETRI246_PARAANNOPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI246,IMDBDef9.PQSL_PARAMETRI246_PARAMSTATO, "PARAMSTATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI246,IMDBDef9.PQSL_PARAMETRI246_PARAMSTATO,1,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI246, 0);
  }

  private static void Init_PQRY_PARAMETRI246_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI246_RS, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI246_RS, "PQRY_PARAMETRI246_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI246_RS,IMDBDef9.PQSL_PARAMETRI246_PARAUNITPROP, "PARAUNITPROP");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI246_RS,IMDBDef9.PQSL_PARAMETRI246_PARAUNITPROP,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI246_RS,IMDBDef9.PQSL_PARAMETRI246_PARANUMEPROP, "PARANUMEPROP");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI246_RS,IMDBDef9.PQSL_PARAMETRI246_PARANUMEPROP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI246_RS,IMDBDef9.PQSL_PARAMETRI246_PARAANNOPROP, "PARAANNOPROP");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI246_RS,IMDBDef9.PQSL_PARAMETRI246_PARAANNOPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI246_RS,IMDBDef9.PQSL_PARAMETRI246_PARAMSTATO, "PARAMSTATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI246_RS,IMDBDef9.PQSL_PARAMETRI246_PARAMSTATO,1,2,0);
  }

  private static void Init_PQRY_MOVIMENTPROP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_MOVIMENTPROP, 33);
    IMDB.set_TblCode(IMDBDef9.PQRY_MOVIMENTPROP, "PQRY_MOVIMENTPROP");
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_TIPO_MOVI, "TIPO_MOVI");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_TIPO_MOVI,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_DESCR_TIPO, "DESCR_TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_DESCR_TIPO,5,23,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_DESCR_MOVI, "DESCR_MOVI");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_DESCR_MOVI,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_IMP_ACC, "NUMERO_IMP_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_IMP_ACC,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ANNO_IMP_ACC, "ANNO_IMP_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ANNO_IMP_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_SUBIMP,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_LIQ,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_MAND,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ANNO_VAR, "ANNO_VAR");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_ANNO_VAR,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_SEQUENZA, "SEQUENZA");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_SEQUENZA,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_RAG_SOC_BEN, "RAG_SOC_BEN");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_RAG_SOC_BEN,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_MOVPROPROVAR, "MOVPROPROVAR");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_MOVPROPROVAR,3,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_INFOIMPACC, "INFOIMPACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_INFOIMPACC,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_APRIIMPACC, "APRIIMPACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_APRIIMPACC,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_INFOSUBIMP, "INFOSUBIMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_INFOSUBIMP,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_APRISUBIMP, "APRISUBIMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_APRISUBIMP,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_INFOLIQ, "INFOLIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_INFOLIQ,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_APRILIQ, "APRILIQ");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_APRILIQ,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_INFOMAN, "INFOMAN");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_INFOMAN,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_APRIMAN, "APRIMAN");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_APRIMAN,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_INFOCAP, "INFOCAP");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_INFOCAP,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_APRICAP, "APRICAP");
    IMDB.SetFldParams(IMDBDef9.PQRY_MOVIMENTPROP,IMDBDef9.PQSL_MOVIMENTPROP_APRICAP,5,99,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_MOVIMENTPROP, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MovimentiProposte(MyWebEntryPoint w, IMDBObj imdb)
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
  public MovimentiProposte()
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
    FormIdx = MyGlb.FRM_MOVIMEPROPOS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "335CD3A1-B299-42EF-A3DC-1F6BC46C8271";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 876;
    DesignHeight = 586;
    set_Caption(new IDVariant("Movimenti Proposte"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 876;
    Frames[1].Height = 560;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.235714;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 876;
    Frames[2].Height = 132;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 132;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 876-MyGlb.PAN_OFFS_X, 132-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B2CB186C-2689-4E5D-8C97-E58064051623");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1128, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 876;
    Frames[3].Height = 428;
    Frames[3].Caption = "Movimenti Proposte";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 428;
    PAN_MOVIMEPROPOS = new IDPanel(w, this, 3, "PAN_MOVIMEPROPOS");
    Frames[3].Content = PAN_MOVIMEPROPOS;
    PAN_MOVIMEPROPOS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MOVIMEPROPOS.VS = MainFrm.VisualStyleList;
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 876-MyGlb.PAN_OFFS_X, 428-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B1C80CA0-9F7E-4FBC-B4F0-886630F011D7");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1332, 376, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MOVIMEPROPOS.InitStatus = 2;
    PAN_MOVIMEPROPOS_Init();
    PAN_MOVIMEPROPOS_InitFields();
    PAN_MOVIMEPROPOS_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_STAMPA11+BaseCmdLinIdx)
      {
        Stampa();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI221, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        MOVIMEPROPOS_PARAMETRI246();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_MOVIMEPROPOS.UpdatePanel(MainFrm);
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
    return (obj instanceof MovimentiProposte);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MovimentiProposte.class.getName() : (Glb.ClassWithPackage(MovimentiProposte.class) ? MovimentiProposte.class.getName().substring(MovimentiProposte.class.getPackage().getName().length() + 1) : MovimentiProposte.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if (FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAMSTATO, 0, (new IDVariant()));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAUNITPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARANUMEPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAANNOPROP, 0))))
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.STATO_PROPOSTA as PROPSTATPROP ");
          SQL.append("from ");
          SQL.append("  PROPOSTE A ");
          SQL.append("where (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAANNOPROP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARANUMEPROP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAUNITPROP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            IMDB.set_Value(IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAMSTATO, 0, QV.Get("PROPSTATPROP", IDVariant.INTEGER));
          }
          QV.Close();
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAUNITPROP, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARANUMEPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAANNOPROP, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_STATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_STATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "ParametriOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Movimenti Proposte On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MOVIMEPROPOS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_MOVIMEPROPOS);
      // 
      // Movimenti Proposte On Dynamic Properties Event Body
      // Procedure Body
      // 
      IDVariant v_BLOCCA = new IDVariant(0,IDVariant.STRING);
      v_BLOCCA = (new IDVariant("Blocca"));
      IDVariant v_SBLOCCA = new IDVariant(0,IDVariant.STRING);
      v_SBLOCCA = (new IDVariant("Sblocca"));
      PAN_MOVIMEPROPOS.set_ToolTip(Glb.OBJ_FIELD,PFL_MOVIMEPROPOS_DESCRIZIONE,(new IDVariant(PAN_MOVIMEPROPOS.FieldText(PFL_MOVIMEPROPOS_DESCRIZIONE))).stringValue()); 
      PAN_MOVIMEPROPOS.set_ToolTip(Glb.OBJ_FIELD,PFL_MOVIMEPROPOS_TIPO,(new IDVariant(PAN_MOVIMEPROPOS.FieldText(PFL_MOVIMEPROPOS_TIPO))).stringValue()); 
      PAN_MOVIMEPROPOS.set_ToolTip(Glb.OBJ_FIELD,PFL_MOVIMEPROPOS_SOGGETTO,(new IDVariant(PAN_MOVIMEPROPOS.FieldText(PFL_MOVIMEPROPOS_SOGGETTO))).stringValue()); 
      if (MainFrm.BLOCCOPROPOS.equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
      {
        if (IMDB.Value(IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAMSTATO, 0).equals((new IDVariant(20)), true))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.set_FieldText(PFL_PARAMETRI_ETICBLOCSBLO, new IDVariant(v_BLOCCA).stringValue());
        }
        else if (IMDB.Value(IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAMSTATO, 0).equals((new IDVariant(22)), true))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.set_FieldText(PFL_PARAMETRI_ETICBLOCSBLO, new IDVariant(v_SBLOCCA).stringValue());
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "MovimentiProposteOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Movimenti Proposte On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_MOVIMEPROPOS_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Movimenti Proposte On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_MOVIMEPROPOS.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET5+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.set_ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLOART, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_MOVIMEPROPOS.set_ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPACCLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_MOVIMEPROPOS.set_ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPACCLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_MOVIMEPROPOS.set_ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_SUBIMPEGLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_MOVIMEPROPOS.set_ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_LIQUIDALABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET5+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.SetFlags (Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MOVIMEPROPOS.set_ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLOART, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add(IDL.Add((new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_MOVIMEPROPOS.set_ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPACCLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add(IDL.Add((new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_MOVIMEPROPOS.set_ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_SUBIMPEGLABE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add(IDL.Add((new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_MOVIMEPROPOS.set_ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_LIQUIDALABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add(IDL.Add((new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_MOVIMEPROPOS.set_ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_MANDATOLABEL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add(IDL.Add((new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOMAND, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
      }
      PAN_MOVIMEPROPOS.set_ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPACCLABEL, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_MOVIMEPROPOS.set_ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_SUBIMPEGLABE, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_MOVIMEPROPOS.set_ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_LIQUIDALABEL, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_MOVIMEPROPOS.set_ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_MANDATOLABEL, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_MOVIMEPROPOS.ObjRect(Glb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "MovimentiProposteOnChangeStatusEvent", _e);
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
      UNLOADEVENT_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAUNITPROP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARANUMEPROP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAANNOPROP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAMSTATO, 0, new IDVariant());
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Stampa
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAANNOPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARANUMEPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAUNITPROP, 0))))
      {
        IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
        IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR2 = (new IDVariant("UNITA_PROP"));
        IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR3 = (new IDVariant("NUMERO_PROP"));
        IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR4 = (new IDVariant("ANNO_PROP"));
        IDVariant v_MOVIMEPROPOS = new IDVariant(0,IDVariant.STRING);
        v_MOVIMEPROPOS = (new IDVariant("Movimenti_Proposta"));
        IDVariant v_MOVIMPROPOTV = new IDVariant(0,IDVariant.STRING);
        v_MOVIMPROPOTV = (new IDVariant("Movimenti_Proposta_Tv"));
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAUNITPROP, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARANUMEPROP, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAANNOPROP, 0)));
        v_NOMESTAMPA = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_MOVIMEPROPOS);
        if (v_NOMESTAMPA.equals(v_MOVIMPROPOTV, true))
        {
          IDVariant v_SAVE = new IDVariant(0,IDVariant.STRING);
          v_SAVE = (new IDVariant("&save=yes&filename="));
          IDVariant v_NOMEFILE = null;
          v_NOMEFILE = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("/")), IDL.FillLR(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAUNITPROP, 0), (new IDVariant(8)), (new IDVariant("0")), true)), (new IDVariant("_"))), IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARANUMEPROP, 0)), (new IDVariant(4)), (new IDVariant("0")), true)), (new IDVariant("_"))), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAANNOPROP, 0))), (new IDVariant(".pdf")));
          IDVariant I = new IDVariant(0,IDVariant.INTEGER);
          // IDL.HttpRequest(MainFrm, IDL.Add(IDL.Add(MainFrm.StringaConnessioneJasper(v_NOMESTAMPA, MainFrm.CostruisciParametriJasper(), (new IDVariant(""))), v_SAVE), IDL.Replace(IDL.Replace(IDL.Add(MainFrm.PERCSTAMPERS, v_NOMEFILE), (new IDVariant("\\")), (new IDVariant("/"))), (new IDVariant(" ")), (new IDVariant("%20"))))); 
          // while (I.compareTo((new IDVariant(30)), true)<=0 && VBFiles.FileLen(IDL.Add(MainFrm.PERCSTAMPERS, v_NOMEFILE)).compareTo((new IDVariant(0)), true)<=0)
          // {
            // MainFrm.TrackPhase(I.intValue(),(new IDVariant(30)).intValue()); 
            // IDL.Sleep((new IDVariant(1)).intValue()*1000); 
            // I = IDL.Add(I, (new IDVariant(1)));
          // }
          // if (VBFiles.FileLen(IDL.Add(MainFrm.PERCSTAMPERS, v_NOMEFILE)).compareTo((new IDVariant(0)), true)<=0)
          // {
            // IDVariant v_AVVISO1 = new IDVariant(0,IDVariant.STRING);
            // v_AVVISO1 = (new IDVariant("Errore nella creazione del file PDF"));
            // MainFrm.set_AlertMessage(v_AVVISO1); 
          // }
          // else
          // {
            // Glb.CopyFile(IDL.Add((new IDVariant(MainFrm.RealPath)), v_NOMEFILE).stringValue(), MainFrm.PERCSTAMPERS.stringValue()); 
            // MainFrm.set_RedirectTo(IDL.SubStr(v_NOMEFILE, (new IDVariant(2))));
            // MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
            // MainFrm.set_RedirectFeatures((new IDVariant(""))); 
          // }
          // MainFrm.set_RedirectTo(IDL.Add(IDL.Add(MainFrm.StringaConnessioneJasper(v_NOMESTAMPA, MainFrm.CostruisciParametriJasper(), (new IDVariant(""))), v_SAVE), IDL.Replace(IDL.Replace(IDL.Add(MainFrm.PERCSTAMPERS, v_NOMEFILE), (new IDVariant("\\")), (new IDVariant("/"))), (new IDVariant(" ")), (new IDVariant("%20")))));
          // MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
          // MainFrm.set_RedirectFeatures((new IDVariant(""))); 
          MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("SI")), IDL.Replace(IDL.Replace(IDL.Add(MainFrm.PERCSTAMPERS, v_NOMEFILE), (new IDVariant("\\")), (new IDVariant("/"))), (new IDVariant(" ")), (new IDVariant("%20"))), (new IDVariant("")));
        }
        else
        {
          MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "Stampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Unita Prop Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_UNITAPROP_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Unita Prop Validate Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAUNITPROP, 0, IDL.Upper(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAUNITPROP, 0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "ParametriUnitaPropValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Etichetta Blocca Sblocca
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaBloccaSblocca ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Blocca Sblocca Body
      // Corpo Procedura
      // 
      IDVariant v_AVVISOBLOCCA = new IDVariant(0,IDVariant.STRING);
      v_AVVISOBLOCCA = (new IDVariant("L'operazione blocca la possibilità di modifica sulla proposta e i relativi movimenti. Continuare?."));
      IDVariant v_AVVISOSBLOCC = new IDVariant(0,IDVariant.STRING);
      v_AVVISOSBLOCC = (new IDVariant("A seguito dell’operazione sarà possibile modificare proposta e relativi movimenti. Continuare?"));
      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAMSTATO, 0).equals((new IDVariant(20)), true))
      {
        v_AVVISO = new IDVariant(v_AVVISOBLOCCA);
      }
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAMSTATO, 0).equals((new IDVariant(22)), true))
      {
        v_AVVISO = new IDVariant(v_AVVISOSBLOCC);
      }
      if (MainFrm.MessageConfirm(v_AVVISO))
      {
        try
        {
          SQL = new StringBuffer();
          SQL.append("update PROPOSTE set ");
          SQL.append("  STATO_PROPOSTA = DECODE(PROPOSTE.STATO_PROPOSTA, 22, 20, DECODE(PROPOSTE.STATO_PROPOSTA, 20, 22, PROPOSTE.STATO_PROPOSTA)) ");
          SQL.append("where (UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAUNITPROP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARANUMEPROP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (ANNO = " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_PARAMETRI246, IMDBDef9.PQSL_PARAMETRI246_PARAANNOPROP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e6)
        {
          MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
          return 0;
        }
        if (IMDB.Value(IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAMSTATO, 0).equals((new IDVariant(20)), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAMSTATO, 0, (new IDVariant(22)));
        }
        else if (IMDB.Value(IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAMSTATO, 0).equals((new IDVariant(22)), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAMSTATO, 0, (new IDVariant(20)));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "EtichettaBloccaSblocca", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Imp Acc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoImpAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Imp Acc Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_IMP_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_IMP_ACC, 0))))
      {
        if (IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_E_S, 0).equals((new IDVariant("S")), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_IMP_ACC, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_IMP_ACC, 0),IDVariant.INTEGER));
          if (IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_IMP_ACC, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
          {
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFORES")));
          }
          else
          {
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
          }
          MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_IMP_ACC, 0),IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_IMP_ACC, 0));
          if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
          {
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARATIPOFORM, 0, (new IDVariant("INFORES")));
          }
          else
          {
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARATIPOFORM, 0, (new IDVariant("INFO")));
          }
          MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "InfoImpAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Imp Acc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriImpAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Imp Acc Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_IMP_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_IMP_ACC, 0))) && IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_IMP_ACC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        if (IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_E_S, 0).equals((new IDVariant("S")), true))
        {
          if (IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_TIPO_MOVI, 0).equals((new IDVariant("VARIMP")), true))
          {
            IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
            SQL.append("from ");
            SQL.append("  IMP A ");
            SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_DESCRIZIONE = QV.Get("IMPDESCRIZIO", IDVariant.STRING) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_IMP_ACC, 0));
            IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMNUMIMP, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_IMP_ACC, 0),IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_IMP_ACC, 0));
            IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_IMP_ACC, 0),IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEDESCR, 0, new IDVariant(v_DESCRIZIONE));
            IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEPROGR, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_MOVPROPROVAR, 0),IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMCONPRO, 0, (new IDVariant("SI")));
            MainFrm.Show(MyGlb.FRM_FORMVARIAZIO, (new IDVariant(0)).intValue(), this); 
          }
          else
          {
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMIMPRES, 0, (new IDVariant("I")));
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_IMP_ACC, 0));
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI20, IMDBDef4.FLD_PARAMETRI20_ROWNAMNUMIMP, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_IMP_ACC, 0),IDVariant.INTEGER));
            MainFrm.Show(MyGlb.FRM_IMPEGNO, (new IDVariant(0)).intValue(), this); 
          }
        }
        else
        {
          if (IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_TIPO_MOVI, 0).equals((new IDVariant("ACC")), true))
          {
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARATIPOFORM, 0, (new IDVariant("Accertamento")));
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMANNOACC, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_IMP_ACC, 0));
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMNUMEACC, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_IMP_ACC, 0),IDVariant.INTEGER));
            MainFrm.Show(MyGlb.FRM_ACCERTAMENTI, (new IDVariant(0)).intValue(), this); 
          }
          else
          {
            IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMACC, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_IMP_ACC, 0),IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNACC, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_IMP_ACC, 0));
            IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMEPROGR, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_MOVPROPROVAR, 0),IDVariant.INTEGER));
            IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMCONPRO, 0, (new IDVariant("SI")));
            MainFrm.Show(MyGlb.FRM_VARIAZIONACC, (new IDVariant(0)).intValue(), this); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "ApriImpAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Subimp
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoSubimp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Subimp Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_SUBIMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_SUBIMP, 0),IDVariant.INTEGER));
        if (IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_SUBIMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
        }
        MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "InfoSubimp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Subimp
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriSubimp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Subimp Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_SUBIMP, 0))) && IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_SUBIMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        if (IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_TIPO_MOVI, 0).equals((new IDVariant("SUBIMP")), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMIMPRES, 0, (new IDVariant("I")));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_SUBIMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI340, IMDBDef4.FLD_PARAMETRI340_ROWNAMNUSUIM, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_SUBIMP, 0),IDVariant.INTEGER));
          MainFrm.Show(MyGlb.FRM_SUBIMPEGNO, (new IDVariant(0)).intValue(), this); 
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_IMP_ACC, 0));
          IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUMIMP, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_IMP_ACC, 0),IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_SUBIMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUSUIM, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_SUBIMP, 0),IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEPROGR, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_MOVPROPROVAR, 0),IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMCONPRO, 0, (new IDVariant("SI")));
          MainFrm.Show(MyGlb.FRM_FORMVARISUBI, (new IDVariant(0)).intValue(), this); 
          IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMPROVAR, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_MOVPROPROVAR, 0));
          MainFrm.Show(MyGlb.FRM_FORMVARISUBI, (new IDVariant(0)).intValue(), this); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "ApriSubimp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Liq
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoLiq ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Liq Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_LIQ, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_LIQ, 0))))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_LIQ, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMNUMELIQ, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_LIQ, 0),IDVariant.INTEGER));
        MainFrm.Show(MyGlb.FRM_INFOLIQUIDAZ, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "InfoLiq", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Liq
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriLiq ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Liq Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_LIQ, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_LIQ, 0))) && IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_LIQ, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_LIQ, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMNUMELIQ, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_LIQ, 0),IDVariant.INTEGER));
        MainFrm.Show(MyGlb.FRM_LIQUIDAZIONE, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "ApriLiq", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Man
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoMan ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Man Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_MAND, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_MAND, 0))))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMANNMAN, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_MAND, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMNUMMAN, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_MAND, 0),IDVariant.INTEGER));
        MainFrm.Show(MyGlb.FRM_INFORMMANDAT, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "InfoMan", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Man
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriMan ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Man Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_MAND, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_MAND, 0))) && IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_MAND, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMNUMDAL, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_MAND, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMENUMAL, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_NUMERO_MAND, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMEESERC, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ANNO_MAND, 0));
        IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMDATDAL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMEDATAL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMAPDAES, 0, (new IDVariant("SI")));
        MainFrm.Show(MyGlb.FRM_MANDATI, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "ApriMan", _e);
      return -1;
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_E_S, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, ((IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ARTICOLO, 0).equals((new IDVariant(-1))))?(new IDVariant(0)):IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ARTICOLO, 0)));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "InfoCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Cap
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriCap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Cap Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAENTRSPES, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_E_S, 0));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAMCAPITOL, 0, IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAMARTICOL, 0, ((IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ARTICOLO, 0).equals((new IDVariant(-1))))?(new IDVariant(0)):IMDB.Value(IMDBDef9.PQRY_MOVIMENTPROP, IMDBDef9.PQSL_MOVIMENTPROP_ARTICOLO, 0)));
        MainFrm.Show(MyGlb.FRM_STANBILAEFFE, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiProposte", "ApriCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void MOVIMEPROPOS_PARAMETRI246() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAMETRI246_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI221, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI221, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI246_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAMETRI246_RS, 0, IMDBDef2.TBL_PARAMETRI221, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI246_RS, 0, 0, IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAUNITPROP, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI246_RS, 1, 0, IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARANUMEPROP, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI246_RS, 2, 0, IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAANNOPROP, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI246_RS, 3, 0, IMDBDef2.TBL_PARAMETRI221, IMDBDef2.FLD_PARAMETRI221_PARAMSTATO, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI221, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI221, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI221, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAMETRI246_RS, 0);
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

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_ETICBLOCSBLO)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaBloccaSblocca();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_UNITAPROP)
      {
        PFL_PARAMETRI_UNITAPROP_ValidateCell(Cancel);
      }
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
  private void PAN_MOVIMEPROPOS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MOVIMEPROPOS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MOVIMEPROPOS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MOVIMEPROPOS, Cancel);
    // Stub
  }

  private void PAN_MOVIMEPROPOS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_MOVIMEPROPOS_INFOCAP)
    {
      this.IdxPanelActived = this.PAN_MOVIMEPROPOS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCap();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_MOVIMEPROPOS_APRICAP)
    {
      this.IdxPanelActived = this.PAN_MOVIMEPROPOS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCap();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_MOVIMEPROPOS_INFOIMPACC)
    {
      this.IdxPanelActived = this.PAN_MOVIMEPROPOS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpAcc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_MOVIMEPROPOS_APRIIMPACC)
    {
      this.IdxPanelActived = this.PAN_MOVIMEPROPOS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriImpAcc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_MOVIMEPROPOS_INFOSUBIMP)
    {
      this.IdxPanelActived = this.PAN_MOVIMEPROPOS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubimp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_MOVIMEPROPOS_APRISUBIMP)
    {
      this.IdxPanelActived = this.PAN_MOVIMEPROPOS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSubimp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_MOVIMEPROPOS_INFOLIQ)
    {
      this.IdxPanelActived = this.PAN_MOVIMEPROPOS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoLiq();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_MOVIMEPROPOS_APRILIQ)
    {
      this.IdxPanelActived = this.PAN_MOVIMEPROPOS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriLiq();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_MOVIMEPROPOS_INFOMAN)
    {
      this.IdxPanelActived = this.PAN_MOVIMEPROPOS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoMan();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_MOVIMEPROPOS_APRIMAN)
    {
      this.IdxPanelActived = this.PAN_MOVIMEPROPOS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriMan();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_MOVIMEPROPOS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_MOVIMEPROPOS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_MOVIMEPROPOS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, "4AF939E1-14D5-4D7A-8BA1-DEFE41317BDE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, "Totali");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, MyGlb.PANEL_LIST, 0, -9999, 168, 10, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, MyGlb.PANEL_FORM, 32, 58, 640, 62, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, 0, 32);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, 0, 2);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, 1, 2);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TOTALI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROP, "B0D1CB16-A3A0-4D8C-A158-F22471902E50");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROP, "Unita Prop");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, "9448933B-BEEE-44A8-9E22-D52AADD03996");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, "Numero Prop");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, "102C5F44-C0D4-4BA6-868A-6BACA0560018");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, "Anno Prop");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, "1A2B4D91-A1C5-48B0-8DD8-BE6D641667DE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, "Proposta");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, "78F13BBA-5E19-48FE-BB29-2A20B9FCA1E6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, "5748049D-82AF-4BC5-A6F9-546F746EA309");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, "2756F3D3-F694-4392-944C-B1B994FD1BC2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, "Blocca/Sblocca");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STATO, "4DFFF98C-11EF-4935-A4E6-C5E1EC33E7A4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STATO, "Stato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STATO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STATO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, "ADC53568-2704-411E-ACE1-B40907D7B319");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, "Impegni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALSUBIMPE, "99BC7EBE-DAAF-417E-AAFE-21CD40AD6212");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALSUBIMPE, "Totale Sub-Impegni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALSUBIMPE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALSUBIMPE, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALSUBIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, "67ECB91C-560A-46DD-9092-C5B77DD5C77A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, "Accertamenti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, "D0C0A772-38C8-47CF-BEE8-D6DC4EAA80FB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, "Var. Impegni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, "37195AED-6132-43B5-A958-2797B11BCBE6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, "Var. Sub-Impegni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, "59A98504-79B5-464E-A1AF-9A007A11340B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, "Var. Accertamenti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, "E57D33EB-C14A-44C6-A560-7D2AC81DDE75");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, "Liquidazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, "870CE3CC-9276-4D9C-84C6-54C60CCE9C2B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, "Mandati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROP, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROP, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROP, MyGlb.PANEL_LIST, "Unita Prop");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROP, MyGlb.PANEL_FORM, 76, 20, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROP, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROP, MyGlb.PANEL_FORM, "Unita Prop");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UNITAPROP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UNITAPROP, PPQRY_PARAMETRI246, "A.PARAUNITPROP", "PARAUNITPROP", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_LIST, 72, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_LIST, "Num. Prop");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_FORM, 208, 20, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_FORM, "Numero Prop");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROPROP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROPROP, PPQRY_PARAMETRI246, "A.PARANUMEPROP", "PARANUMEPROP", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_LIST, 112, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_LIST, "Anno Prop");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_FORM, 276, 20, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_FORM, "Anno Prop");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOPROP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOPROP, PPQRY_PARAMETRI246, "A.PARAANNOPROP", "PARAANNOPROP", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_LIST, 12, 8, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_FORM, 12, 20, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROPOSTLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROPOSTLABEL, -1, "", "PROPOSTLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 128, 8, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 188, 20, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTINLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTINLABEL, -1, "", "TRATTINLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_LIST, 136, 16, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_FORM, 256, 20, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRALABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRALABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRALABEL, -1, "", "BARRALABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, MyGlb.PANEL_LIST, 292, 16, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, MyGlb.PANEL_FORM, 464, 8, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICBLOCSBLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICBLOCSBLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICBLOCSBLO, -1, "", "ETICBLOCSBLO", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STATO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STATO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STATO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STATO, MyGlb.PANEL_LIST, "Stato");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STATO, MyGlb.PANEL_FORM, 324, 20, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STATO, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STATO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STATO, MyGlb.PANEL_FORM, "Stato");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_STATO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_STATO, PPQRY_PARAMETRI246, "A.PARAMSTATO", "PARAMSTATO", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STATO, (new IDVariant(10)), "in preparazione", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STATO, (new IDVariant(15)), "in modifica", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STATO, (new IDVariant(20)), "completata", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STATO, (new IDVariant(22)), "controllata", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_STATO, (new IDVariant(25)), "inclusa in atto", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_LIST, "Impegni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_FORM, 60, 72, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPEGNI, MyGlb.PANEL_FORM, "Impegni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPEGNI, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPEGNI, PPQRY_IMP, "NVL(SUM(A.IMPORTO), 0)", "TOTALEIMPEGN", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALSUBIMPE, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALSUBIMPE, MyGlb.PANEL_LIST, 168);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALSUBIMPE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALSUBIMPE, MyGlb.PANEL_LIST, "Totale Sub-Impegni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALSUBIMPE, MyGlb.PANEL_FORM, 232, 72, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALSUBIMPE, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALSUBIMPE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALSUBIMPE, MyGlb.PANEL_FORM, "Totale Sub-Impegni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TOTALSUBIMPE, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TOTALSUBIMPE, PPQRY_SUBIMP, "NVL(SUM(A.IMPORTO), 0)", "TOTALSUBIMPE", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_LIST, 152);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_LIST, "Accertamenti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_FORM, 480, 72, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ACCERTAMENTI, MyGlb.PANEL_FORM, "Accertamenti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ACCERTAMENTI, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ACCERTAMENTI, PPQRY_ACC, "NVL(SUM(A.IMPORTO), 0)", "TOTALEACCERT", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_LIST, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_LIST, "Var. Impegni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_FORM, 36, 96, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIMPEGNI, MyGlb.PANEL_FORM, "Var. Impegni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VARIMPEGNI, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VARIMPEGNI, PPQRY_VARIMP, "NVL(SUM(A.IMPORTO), 0)", "TOTALVARIMPE", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_LIST, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_LIST, "Var. Sub-Impegni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_FORM, 244, 96, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARSUBIMPEGN, MyGlb.PANEL_FORM, "Var. Sub-Impegni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VARSUBIMPEGN, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VARSUBIMPEGN, PPQRY_VARSUB, "NVL(SUM(A.IMPORTO), 0)", "TOTVARSUBIMP", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_LIST, 140);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_LIST, "Var. Accertamenti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_FORM, 456, 96, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARACCERTAME, MyGlb.PANEL_FORM, "Var. Accertamenti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VARACCERTAME, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VARACCERTAME, PPQRY_VARACC, "NVL(SUM(A.IMPORTO), 0)", "TOTALEVARACC", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_LIST, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_LIST, "Liquidazioni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_FORM, 676, 72, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LIQUIDAZIONI, MyGlb.PANEL_FORM, "Liquidazioni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LIQUIDAZIONI, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LIQUIDAZIONI, PPQRY_LIQMAN, "NVL(SUM(DECODE(A.NUMERO_MAND, to_number(NULL), A.IMPORTO, 0)), 0)", "TOTALELIQUID", 3, 28, 6, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, "Mandati");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, 696, 96, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, "Mandati");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_MANDATI, -1, GRP_PARAMETRI_TOTALI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_MANDATI, PPQRY_LIQMAN, "NVL(SUM(DECODE(A.NUMERO_MAND, to_number(NULL), 0, A.IMPORTO)), 0)", "TOTALEMANDAT", 3, 28, 6, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 10);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTALEIMPEGN ");
    SQL.append("from ");
    SQL.append("  IMP A ");
    SQL.append("where (A.UNITA_PROPONENTE = ~~PARAUNITPROP~~) ");
    SQL.append("and   (A.NUMERO_PROPOSTA = ~~PARANUMEPROP~~) ");
    SQL.append("and   (A.ANNO_PROPOSTA = ~~PARAANNOPROP~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_IMP, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_IMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_IMP, "IMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTALSUBIMPE ");
    SQL.append("from ");
    SQL.append("  SUBIMP A ");
    SQL.append("where (A.UNITA_PROPONENTE = ~~PARAUNITPROP~~) ");
    SQL.append("and   (A.NUMERO_PROPOSTA = ~~PARANUMEPROP~~) ");
    SQL.append("and   (A.ANNO_PROPOSTA = ~~PARAANNOPROP~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_SUBIMP, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_SUBIMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_SUBIMP, "SUBIMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTALEACCERT ");
    SQL.append("from ");
    SQL.append("  ACC A ");
    SQL.append("where (A.UNITA_PROPONENTE = ~~PARAUNITPROP~~) ");
    SQL.append("and   (A.NUMERO_PROPOSTA = ~~PARANUMEPROP~~) ");
    SQL.append("and   (A.ANNO_PROPOSTA = ~~PARAANNOPROP~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_ACC, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_ACC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_ACC, "ACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTALVARIMPE ");
    SQL.append("from ");
    SQL.append("  VARIMP A ");
    SQL.append("where (A.UNITA_PROPONENTE = ~~PARAUNITPROP~~) ");
    SQL.append("and   (A.NUMERO_PROPOSTA = ~~PARANUMEPROP~~) ");
    SQL.append("and   (A.ANNO_PROPOSTA = ~~PARAANNOPROP~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VARIMP, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VARIMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VARIMP, "VARIMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTALEVARACC ");
    SQL.append("from ");
    SQL.append("  VARACC A ");
    SQL.append("where (A.UNITA_PROPONENTE = ~~PARAUNITPROP~~) ");
    SQL.append("and   (A.NUMERO_PROPOSTA = ~~PARANUMEPROP~~) ");
    SQL.append("and   (A.ANNO_PROPOSTA = ~~PARAANNOPROP~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VARACC, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VARACC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VARACC, "VARACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTVARSUBIMP ");
    SQL.append("from ");
    SQL.append("  VARSUB A ");
    SQL.append("where (A.UNITA_PROPONENTE = ~~PARAUNITPROP~~) ");
    SQL.append("and   (A.NUMERO_PROPOSTA = ~~PARANUMEPROP~~) ");
    SQL.append("and   (A.ANNO_PROPOSTA = ~~PARAANNOPROP~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VARSUB, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VARSUB, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VARSUB, "VARSUB");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTALDEFCOMP, ");
    SQL.append("  NVL(SUM(A.IMPORTO_CASSA), 0) as TOTVARDEFCAS ");
    SQL.append("from ");
    SQL.append("  VARCOM A ");
    SQL.append("where (A.UNITA_PROPONENTE = ~~PARAUNITPROP~~) ");
    SQL.append("and   (A.NUMERO_PROPOSTA = ~~PARANUMEPROP~~) ");
    SQL.append("and   (A.ANNO_PROPOSTA = ~~PARAANNOPROP~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VARCOM, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VARCOM, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VARCOM, "VARCOM");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(A.IMPORTO), 0) as TOTAPROVCOMP, ");
    SQL.append("  NVL(SUM(A.IMPORTO_CASSA), 0) as TOTAPROVCASS ");
    SQL.append("from ");
    SQL.append("  VARCOMPRO A ");
    SQL.append("where (A.UNITA_PROPONENTE = ~~PARAUNITPROP~~) ");
    SQL.append("and   (A.NUMERO_PROPOSTA = ~~PARANUMEPROP~~) ");
    SQL.append("and   (A.ANNO_PROPOSTA = ~~PARAANNOPROP~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_VARCOMPRO, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VARCOMPRO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_VARCOMPRO, "VARCOMPRO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(SUM(DECODE(A.NUMERO_MAND, to_number(NULL), A.IMPORTO, 0)), 0) as TOTALELIQUID, ");
    SQL.append("  NVL(SUM(DECODE(A.NUMERO_MAND, to_number(NULL), 0, A.IMPORTO)), 0) as TOTALEMANDAT ");
    SQL.append("from ");
    SQL.append("  LIQ A ");
    SQL.append("where (A.UNITA_PROPONENTE = ~~PARAUNITPROP~~) ");
    SQL.append("and   (A.NUMERO_PROPOSTA = ~~PARANUMEPROP~~) ");
    SQL.append("and   (A.ANNO_PROPOSTA = ~~PARAANNOPROP~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_LIQMAN, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_LIQMAN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_LIQMAN, "LIQ");
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI246", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI246, IMDBDef9.PQRY_PARAMETRI246_RS, IMDBDef2.TBL_PARAMETRI221);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UNITAPROP, IMDBDef2.FLD_PARAMETRI221_PARAUNITPROP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROPROP, IMDBDef2.FLD_PARAMETRI221_PARANUMEPROP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOPROP, IMDBDef2.FLD_PARAMETRI221_PARAANNOPROP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_STATO, IMDBDef2.FLD_PARAMETRI221_PARAMSTATO);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI221");
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

  private void PAN_MOVIMEPROPOS_Init()
  {

    PAN_MOVIMEPROPOS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MOVIMEPROPOS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MOVIMEPROPOS.SetSize(MyGlb.OBJ_FIELD, 32);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ES, "D0B5A919-F3F5-4BE2-B674-79FBBF97D735");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ES, "E-S");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ES, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, "24F49109-8233-4C87-8A21-DDC4D2CEADC7");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, "Capitolo");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, "EFF6100B-4972-4B02-98F0-BFE26CA08144");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, "Art.");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, "C8D0DE05-0693-48A3-B9A9-A3FB43CBF078");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, "Info Cap");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, MyGlb.VIS_HYPELINKIMMA);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, "648ECC3E-7E03-4FA2-96BD-A1DB70194CB5");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, "Apri Cap");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, MyGlb.VIS_HYPELINKIMMA);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, "A94B6F5C-4E2B-4C55-9ADA-6756BC46F202");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, "Numero Imp Acc");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, "4325AB4D-036B-49A2-9181-245AFDA9381D");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, "Anno Imp Acc");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, "0072CFD7-BEE9-4570-B83A-F11ED9E18813");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, "Info Imp Acc");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, MyGlb.VIS_HYPELINKIMMA);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, "F3694FC1-2F43-42F8-A8B8-C51B4323B3B5");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, "Apri Imp Acc");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, MyGlb.VIS_HYPELINKIMMA);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, "95F44D72-90C2-449E-A8D8-CB199391D176");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, "Numero Subimp");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, "EC13C90E-F15E-4635-8D6E-14FE0B84C830");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, "Anno Subimp");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, "52E39BA2-53F5-4A3C-A1FB-84E7D0C1082F");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, "Info Subimp");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, MyGlb.VIS_HYPELINKIMMA);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, "18868C31-EF02-4D7B-A880-2FC3463CCC3A");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, "Apri Subimp");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, MyGlb.VIS_HYPELINKIMMA);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, "C98D52F2-CDE9-47C9-9EAE-D926A1A56C0F");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, "Numero Liq");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, "8F3C06CD-0893-4601-B33B-C3AEE837300E");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, "Anno Liq");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, "53069B54-73C2-4CB9-AFCF-CF61EF8F34C9");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, "Info Liq");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, MyGlb.VIS_HYPELINKIMMA);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, "04ACBEF6-84AD-4283-ABB8-685E61DA0DAE");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, "Apri Liq");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, MyGlb.VIS_HYPELINKIMMA);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, "A27DD75C-6F36-4513-9FE3-FF2E1E04638F");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, "Numero Mand");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOMAND, "1CC110A7-B849-4B64-8827-5E8708A3EDEF");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOMAND, "Anno Mand");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOMAND, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, "9DFE20A1-9286-4D81-B055-522C356116CC");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, "Info Man");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, MyGlb.VIS_HYPELINKIMMA);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, "0BC50BFF-3AA2-4E31-AA5F-34A6AC674A80");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, "Apri Man");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, MyGlb.VIS_HYPELINKIMMA);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPO, "F2D15FC6-6787-4ED5-810E-DC675B74DD99");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPO, "Tipo");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPO, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPORTO, "C93E9FB7-F234-4AF5-9DB1-B5AA50D870FA");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPORTO, "Importo");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPORTO, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_DESCRIZIONE, "60829136-C154-4627-98F0-1F8D32395C9F");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_DESCRIZIONE, "Descrizione");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_DESCRIZIONE, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SOGGETTO, "A82BFE58-ED2E-4977-8CA1-CB3A9464E961");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SOGGETTO, "Soggetto");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SOGGETTO, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SOGGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SOGGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPACCLABEL, "21902F54-9692-4EF8-9BF1-AAF436E53703");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPACCLABEL, "Imp./Acc.");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPACCLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPACCLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SUBIMPEGLABE, "649033FB-1454-4F93-86AA-1CD5E06913CF");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SUBIMPEGLABE, "Sub-Impegno");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SUBIMPEGLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SUBIMPEGLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_LIQUIDALABEL, "A116708D-59A3-4015-9066-545B90B52282");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_LIQUIDALABEL, "Liquidazione");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_LIQUIDALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_LIQUIDALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_MANDATOLABEL, "C35D5D62-58F4-4B97-AC09-24467D0192F8");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_MANDATOLABEL, "Mandato");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_MANDATOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_MANDATOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLOART, "3C637BF3-2D9E-4466-92E8-4B7E9DFAEBFC");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLOART, "Capitolo/Art.");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPOMOVI, "5C180370-6469-4F8E-A1EF-B03B0A024A6E");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPOMOVI, "TIPO MOVI");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPOMOVI, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPOMOVI, MyGlb.VIS_NORMFIELPADR);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPOMOVI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MOVIMEPROPOS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_PROGRESSIVAR, "F602C237-A5D6-44B5-A87B-C7B7B2BF6FCA");
    PAN_MOVIMEPROPOS.set_Header(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_PROGRESSIVAR, "PROGRESSIVO VAR");
    PAN_MOVIMEPROPOS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_PROGRESSIVAR, "");
    PAN_MOVIMEPROPOS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_PROGRESSIVAR, MyGlb.VIS_NONNULLAFIEL);
    PAN_MOVIMEPROPOS.SetFlags(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_PROGRESSIVAR, 0, -1);
  }

  private void PAN_MOVIMEPROPOS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ES, MyGlb.PANEL_LIST, 0, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ES, MyGlb.PANEL_LIST, 24);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ES, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ES, MyGlb.PANEL_LIST, "E-S");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ES, MyGlb.PANEL_FORM, 4, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ES, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ES, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ES, MyGlb.PANEL_FORM, "E-S");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_ES, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_ES, PPQRY_MOVIMENTPROP, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, MyGlb.PANEL_LIST, 28, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, MyGlb.PANEL_FORM, 324, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, MyGlb.PANEL_FORM, 72);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_CAPITOLO, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_CAPITOLO, PPQRY_MOVIMENTPROP, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, MyGlb.PANEL_LIST, 132, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_ARTICOLO, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_ARTICOLO, PPQRY_MOVIMENTPROP, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, MyGlb.PANEL_LIST, 164, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, MyGlb.PANEL_LIST, 56);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, MyGlb.PANEL_LIST, "In. Cp.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, MyGlb.PANEL_FORM, 4, 340, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, MyGlb.PANEL_FORM, 56);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOCAP, MyGlb.PANEL_FORM, "Info Cap");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_INFOCAP, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldUnbound(PFL_MOVIMEPROPOS_INFOCAP, true);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_INFOCAP, PPQRY_MOVIMENTPROP, "CASE WHEN NOT ((A.CAPITOLO IS NULL)) THEN 'I' ELSE '' END", "INFOCAP", 5, 99, 0, -13997);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOCAP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOCAP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOCAP, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, MyGlb.PANEL_LIST, 188, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, MyGlb.PANEL_LIST, 56);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, MyGlb.PANEL_LIST, "Ap. Cp.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, MyGlb.PANEL_FORM, 4, 364, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, MyGlb.PANEL_FORM, 56);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRICAP, MyGlb.PANEL_FORM, "Apri Cap");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_APRICAP, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldUnbound(PFL_MOVIMEPROPOS_APRICAP, true);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_APRICAP, PPQRY_MOVIMENTPROP, "CASE WHEN NOT ((A.CAPITOLO IS NULL)) THEN 'A' ELSE '' END", "APRICAP", 5, 99, 0, -13997);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRICAP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRICAP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRICAP, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, MyGlb.PANEL_LIST, 212, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, MyGlb.PANEL_LIST, 96);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, MyGlb.PANEL_LIST, "Num. I. Ac.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, MyGlb.PANEL_FORM, 324, 100, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, MyGlb.PANEL_FORM, 112);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROIMPACC, MyGlb.PANEL_FORM, "Numero Imp Acc");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_NUMEROIMPACC, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_NUMEROIMPACC, PPQRY_MOVIMENTPROP, "A.NUMERO_IMP_ACC", "NUMERO_IMP_ACC", 2, 15, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, MyGlb.PANEL_LIST, 252, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, MyGlb.PANEL_LIST, 84);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, MyGlb.PANEL_LIST, "An. I. Ac.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, MyGlb.PANEL_FORM, 4, 124, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOIMPACC, MyGlb.PANEL_FORM, "Anno Imp Acc");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_ANNOIMPACC, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_ANNOIMPACC, PPQRY_MOVIMENTPROP, "A.ANNO_IMP_ACC", "ANNO_IMP_ACC", 1, 4, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, MyGlb.PANEL_LIST, 288, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, MyGlb.PANEL_LIST, 80);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, MyGlb.PANEL_LIST, "I. I. A.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, MyGlb.PANEL_FORM, 4, 340, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, MyGlb.PANEL_FORM, 80);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOIMPACC, MyGlb.PANEL_FORM, "Info Imp Acc");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_INFOIMPACC, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldUnbound(PFL_MOVIMEPROPOS_INFOIMPACC, true);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_INFOIMPACC, PPQRY_MOVIMENTPROP, "CASE WHEN NOT ((A.NUMERO_IMP_ACC IS NULL)) THEN 'I' ELSE '' END", "INFOIMPACC", 5, 99, 0, -13997);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOIMPACC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOIMPACC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOIMPACC, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, MyGlb.PANEL_LIST, 312, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, MyGlb.PANEL_LIST, 80);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, MyGlb.PANEL_LIST, "A. I. A.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, MyGlb.PANEL_FORM, 4, 364, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, MyGlb.PANEL_FORM, 80);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIIMPACC, MyGlb.PANEL_FORM, "Apri Imp Acc");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_APRIIMPACC, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldUnbound(PFL_MOVIMEPROPOS_APRIIMPACC, true);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_APRIIMPACC, PPQRY_MOVIMENTPROP, "DECODE(A.ANNO_IMP_ACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 'A', '')", "APRIIMPACC", 5, 99, 0, -13997);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRIIMPACC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRIIMPACC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRIIMPACC, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, MyGlb.PANEL_LIST, 336, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Num. Subimp");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, MyGlb.PANEL_FORM, 172, 124, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, MyGlb.PANEL_FORM, 104);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Numero Subimp");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_NUMEROSUBIMP, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_NUMEROSUBIMP, PPQRY_MOVIMENTPROP, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 2, 15, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, MyGlb.PANEL_LIST, 384, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, MyGlb.PANEL_LIST, "Ann. Sub.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, MyGlb.PANEL_FORM, 324, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, MyGlb.PANEL_FORM, 112);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOSUBIMP, MyGlb.PANEL_FORM, "Anno Subimp");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_ANNOSUBIMP, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_ANNOSUBIMP, PPQRY_MOVIMENTPROP, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, MyGlb.PANEL_LIST, 424, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, MyGlb.PANEL_LIST, 76);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, MyGlb.PANEL_LIST, "I. Sb.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, MyGlb.PANEL_FORM, 4, 340, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, MyGlb.PANEL_FORM, 76);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOSUBIMP, MyGlb.PANEL_FORM, "Info Subimp");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_INFOSUBIMP, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldUnbound(PFL_MOVIMEPROPOS_INFOSUBIMP, true);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_INFOSUBIMP, PPQRY_MOVIMENTPROP, "CASE WHEN NOT ((A.NUMERO_SUBIMP IS NULL)) THEN 'I' ELSE '' END", "INFOSUBIMP", 5, 99, 0, -13997);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOSUBIMP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOSUBIMP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOSUBIMP, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, MyGlb.PANEL_LIST, 448, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, MyGlb.PANEL_LIST, 76);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, MyGlb.PANEL_LIST, "A. Sb.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, MyGlb.PANEL_FORM, 4, 364, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, MyGlb.PANEL_FORM, 76);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRISUBIMP, MyGlb.PANEL_FORM, "Apri Subimp");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_APRISUBIMP, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldUnbound(PFL_MOVIMEPROPOS_APRISUBIMP, true);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_APRISUBIMP, PPQRY_MOVIMENTPROP, "DECODE(A.ANNO_SUBIMP, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 'A', '')", "APRISUBIMP", 5, 99, 0, -13997);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRISUBIMP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRISUBIMP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRISUBIMP, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, MyGlb.PANEL_LIST, 472, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, MyGlb.PANEL_LIST, "Num. Liq");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 148, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROLIQ, MyGlb.PANEL_FORM, "Numero Liq");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_NUMEROLIQ, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_NUMEROLIQ, PPQRY_MOVIMENTPROP, "A.NUMERO_LIQ", "NUMERO_LIQ", 2, 15, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, MyGlb.PANEL_LIST, 516, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, MyGlb.PANEL_LIST, "Anno Liq");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, MyGlb.PANEL_FORM, 4, 172, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOLIQ, MyGlb.PANEL_FORM, "Anno Liq");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_ANNOLIQ, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_ANNOLIQ, PPQRY_MOVIMENTPROP, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, MyGlb.PANEL_LIST, 552, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, MyGlb.PANEL_LIST, 52);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, MyGlb.PANEL_LIST, "In. Lq.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, MyGlb.PANEL_FORM, 4, 340, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, MyGlb.PANEL_FORM, 52);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOLIQ, MyGlb.PANEL_FORM, "Info Liq");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_INFOLIQ, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldUnbound(PFL_MOVIMEPROPOS_INFOLIQ, true);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_INFOLIQ, PPQRY_MOVIMENTPROP, "CASE WHEN NOT ((A.NUMERO_LIQ IS NULL)) THEN 'I' ELSE '' END", "INFOLIQ", 5, 99, 0, -13997);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOLIQ, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOLIQ, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOLIQ, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, MyGlb.PANEL_LIST, 576, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, MyGlb.PANEL_LIST, 52);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, MyGlb.PANEL_LIST, "Ap. Lq.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, MyGlb.PANEL_FORM, 4, 364, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, MyGlb.PANEL_FORM, 52);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRILIQ, MyGlb.PANEL_FORM, "Apri Liq");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_APRILIQ, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldUnbound(PFL_MOVIMEPROPOS_APRILIQ, true);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_APRILIQ, PPQRY_MOVIMENTPROP, "DECODE(A.ANNO_LIQ, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 'A', '')", "APRILIQ", 5, 99, 0, -13997);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRILIQ, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRILIQ, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRILIQ, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, MyGlb.PANEL_LIST, 600, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, MyGlb.PANEL_LIST, "Num. Mand");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, MyGlb.PANEL_FORM, 4, 196, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_NUMEROMAND, MyGlb.PANEL_FORM, "Numero Mand");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_NUMEROMAND, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_NUMEROMAND, PPQRY_MOVIMENTPROP, "A.NUMERO_MAND", "NUMERO_MAND", 2, 15, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOMAND, MyGlb.PANEL_LIST, 640, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOMAND, MyGlb.PANEL_LIST, "Ann. Mnd.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOMAND, MyGlb.PANEL_FORM, 4, 220, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOMAND, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_ANNOMAND, MyGlb.PANEL_FORM, "Anno Mand");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_ANNOMAND, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_ANNOMAND, PPQRY_MOVIMENTPROP, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, MyGlb.PANEL_LIST, 676, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, MyGlb.PANEL_LIST, 60);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, MyGlb.PANEL_LIST, "In. M.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, MyGlb.PANEL_FORM, 4, 340, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, MyGlb.PANEL_FORM, 60);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_INFOMAN, MyGlb.PANEL_FORM, "Info Man");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_INFOMAN, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldUnbound(PFL_MOVIMEPROPOS_INFOMAN, true);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_INFOMAN, PPQRY_MOVIMENTPROP, "CASE WHEN NOT ((A.NUMERO_MAND IS NULL)) THEN 'I' ELSE '' END", "INFOMAN", 5, 99, 0, -13997);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOMAN, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOMAN, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_INFOMAN, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, MyGlb.PANEL_LIST, 700, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, MyGlb.PANEL_LIST, 60);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, MyGlb.PANEL_LIST, "Ap. M.");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, MyGlb.PANEL_FORM, 4, 364, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, MyGlb.PANEL_FORM, 60);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_APRIMAN, MyGlb.PANEL_FORM, "Apri Man");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_APRIMAN, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldUnbound(PFL_MOVIMEPROPOS_APRIMAN, true);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_APRIMAN, PPQRY_MOVIMENTPROP, "DECODE(A.ANNO_MAND, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 'A', '')", "APRIMAN", 5, 99, 0, -13997);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRIMAN, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRIMAN, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_MOVIMEPROPOS.SetValueListItem(PFL_MOVIMEPROPOS_APRIMAN, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPO, MyGlb.PANEL_LIST, 724, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPO, MyGlb.PANEL_LIST, 68);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPO, MyGlb.PANEL_FORM, 4, 76, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPO, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_TIPO, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_TIPO, PPQRY_MOVIMENTPROP, "A.DESCR_TIPO", "DESCR_TIPO", 5, 23, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPORTO, MyGlb.PANEL_LIST, 932, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPORTO, MyGlb.PANEL_FORM, 308, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPORTO, MyGlb.PANEL_FORM, 72);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_IMPORTO, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_IMPORTO, PPQRY_MOVIMENTPROP, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_DESCRIZIONE, MyGlb.PANEL_LIST, 1044, 36, 128, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_DESCRIZIONE, MyGlb.PANEL_LIST, 72);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 312, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_DESCRIZIONE, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_DESCRIZIONE, PPQRY_MOVIMENTPROP, "A.DESCR_MOVI", "DESCR_MOVI", 5, 140, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SOGGETTO, MyGlb.PANEL_LIST, 1172, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SOGGETTO, MyGlb.PANEL_LIST, 76);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SOGGETTO, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SOGGETTO, MyGlb.PANEL_LIST, "Soggetto");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SOGGETTO, MyGlb.PANEL_FORM, 4, 316, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SOGGETTO, MyGlb.PANEL_FORM, 76);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SOGGETTO, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SOGGETTO, MyGlb.PANEL_FORM, "Soggetto");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_SOGGETTO, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_SOGGETTO, PPQRY_MOVIMENTPROP, "A.RAG_SOC_BEN", "RAG_SOC_BEN", 5, 40, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPACCLABEL, MyGlb.PANEL_LIST, 212, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPACCLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPACCLABEL, MyGlb.PANEL_LIST, 2);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPACCLABEL, MyGlb.PANEL_FORM, 172, 0, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPACCLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_IMPACCLABEL, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_IMPACCLABEL, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_IMPACCLABEL, -1, "", "IMPACCLABEL", 0, 0, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SUBIMPEGLABE, MyGlb.PANEL_LIST, 336, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SUBIMPEGLABE, MyGlb.PANEL_LIST, 0);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SUBIMPEGLABE, MyGlb.PANEL_LIST, 2);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SUBIMPEGLABE, MyGlb.PANEL_FORM, 180, 8, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SUBIMPEGLABE, MyGlb.PANEL_FORM, 0);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_SUBIMPEGLABE, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_SUBIMPEGLABE, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_SUBIMPEGLABE, -1, "", "SUBIMPEGLABE", 0, 0, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_LIQUIDALABEL, MyGlb.PANEL_LIST, 472, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_LIQUIDALABEL, MyGlb.PANEL_LIST, 0);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_LIQUIDALABEL, MyGlb.PANEL_LIST, 2);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_LIQUIDALABEL, MyGlb.PANEL_FORM, 188, 16, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_LIQUIDALABEL, MyGlb.PANEL_FORM, 0);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_LIQUIDALABEL, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_LIQUIDALABEL, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_LIQUIDALABEL, -1, "", "LIQUIDALABEL", 0, 0, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_MANDATOLABEL, MyGlb.PANEL_LIST, 600, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_MANDATOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_MANDATOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_MANDATOLABEL, MyGlb.PANEL_FORM, 196, 24, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_MANDATOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_MANDATOLABEL, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_MANDATOLABEL, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_MANDATOLABEL, -1, "", "MANDATOLABEL", 0, 0, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLOART, MyGlb.PANEL_LIST, 28, 0, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLOART, MyGlb.PANEL_LIST, 2);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLOART, MyGlb.PANEL_FORM, 180, 8, 84, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_CAPITOLOART, MyGlb.PANEL_FORM, 2);
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_CAPITOLOART, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPOMOVI, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPOMOVI, MyGlb.PANEL_LIST, 68);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPOMOVI, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPOMOVI, MyGlb.PANEL_LIST, "TIPO MOVI");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPOMOVI, MyGlb.PANEL_FORM, 4, 340, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPOMOVI, MyGlb.PANEL_FORM, 68);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPOMOVI, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_TIPOMOVI, MyGlb.PANEL_FORM, "TIPO MOVI");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_TIPOMOVI, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_TIPOMOVI, PPQRY_MOVIMENTPROP, "A.TIPO_MOVI", "TIPO_MOVI", 5, 8, 0, -13997);
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_PROGRESSIVAR, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_PROGRESSIVAR, MyGlb.PANEL_LIST, 116);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_PROGRESSIVAR, MyGlb.PANEL_LIST, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_PROGRESSIVAR, MyGlb.PANEL_LIST, "PROGRESSIVO VAR");
    PAN_MOVIMEPROPOS.SetRect(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_PROGRESSIVAR, MyGlb.PANEL_FORM, 4, 340, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MOVIMEPROPOS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_PROGRESSIVAR, MyGlb.PANEL_FORM, 116);
    PAN_MOVIMEPROPOS.SetNumRow(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_PROGRESSIVAR, MyGlb.PANEL_FORM, 1);
    PAN_MOVIMEPROPOS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MOVIMEPROPOS_PROGRESSIVAR, MyGlb.PANEL_FORM, "PROGRESSIVO VAR");
    PAN_MOVIMEPROPOS.SetFieldPage(PFL_MOVIMEPROPOS_PROGRESSIVAR, -1, -1);
    PAN_MOVIMEPROPOS.SetFieldPanel(PFL_MOVIMEPROPOS_PROGRESSIVAR, PPQRY_MOVIMENTPROP, "A.PROGRESSIVO_VAR", "MOVPROPROVAR", 3, 10, 0, -13997);
  }

  private void PAN_MOVIMEPROPOS_InitQueries()
  {
    StringBuffer SQL;

    PAN_MOVIMEPROPOS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_MOVIMEPROPOS.SetIMDB(IMDB, "PQRY_MOVIMENTPROP", true);
    PAN_MOVIMEPROPOS.set_SetString(MyGlb.MASTER_ROWNAME, "MOVIMENTI PROP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.TIPO_MOVI as TIPO_MOVI, ");
    SQL.append("  A.DESCR_TIPO as DESCR_TIPO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DESCR_MOVI as DESCR_MOVI, ");
    SQL.append("  A.NUMERO_IMP_ACC as NUMERO_IMP_ACC, ");
    SQL.append("  A.ANNO_IMP_ACC as ANNO_IMP_ACC, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  A.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  A.ANNO_VAR as ANNO_VAR, ");
    SQL.append("  A.SEQUENZA as SEQUENZA, ");
    SQL.append("  A.RAG_SOC_BEN as RAG_SOC_BEN, ");
    SQL.append("  A.PROGRESSIVO_VAR as MOVPROPROVAR, ");
    SQL.append("  CASE WHEN NOT ((A.NUMERO_IMP_ACC IS NULL)) THEN 'I' ELSE '' END as INFOIMPACC, ");
    SQL.append("  DECODE(A.ANNO_IMP_ACC, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 'A', '') as APRIIMPACC, ");
    SQL.append("  CASE WHEN NOT ((A.NUMERO_SUBIMP IS NULL)) THEN 'I' ELSE '' END as INFOSUBIMP, ");
    SQL.append("  DECODE(A.ANNO_SUBIMP, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 'A', '') as APRISUBIMP, ");
    SQL.append("  CASE WHEN NOT ((A.NUMERO_LIQ IS NULL)) THEN 'I' ELSE '' END as INFOLIQ, ");
    SQL.append("  DECODE(A.ANNO_LIQ, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 'A', '') as APRILIQ, ");
    SQL.append("  CASE WHEN NOT ((A.NUMERO_MAND IS NULL)) THEN 'I' ELSE '' END as INFOMAN, ");
    SQL.append("  DECODE(A.ANNO_MAND, ~~TBL_DATISESSIONE.SESSIOESERCI~~, 'A', '') as APRIMAN, ");
    SQL.append("  CASE WHEN NOT ((A.CAPITOLO IS NULL)) THEN 'I' ELSE '' END as INFOCAP, ");
    SQL.append("  CASE WHEN NOT ((A.CAPITOLO IS NULL)) THEN 'A' ELSE '' END as APRICAP ");
    PAN_MOVIMEPROPOS.SetQuery(PPQRY_MOVIMENTPROP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  MOVIMENTI_PROP A ");
    PAN_MOVIMEPROPOS.SetQuery(PPQRY_MOVIMENTPROP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_PROPOSTA = ~~TBL_PARAMETRI221.PARAANNOPROP~~) ");
    SQL.append("and   (A.NUMERO_PROPOSTA = ~~TBL_PARAMETRI221.PARANUMEPROP~~) ");
    SQL.append("and   (A.UNITA_PROPONENTE = ~~TBL_PARAMETRI221.PARAUNITPROP~~) ");
    PAN_MOVIMEPROPOS.SetQuery(PPQRY_MOVIMENTPROP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOVIMEPROPOS.SetQuery(PPQRY_MOVIMENTPROP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MOVIMEPROPOS.SetQuery(PPQRY_MOVIMENTPROP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.SEQUENZA ");
    PAN_MOVIMEPROPOS.SetQuery(PPQRY_MOVIMENTPROP, 5, SQL, -1, "");
    PAN_MOVIMEPROPOS.SetQueryDB(PPQRY_MOVIMENTPROP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MOVIMEPROPOS.SetMasterTable(0, "MOVIMENTI_PROP");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MOVIMEPROPOS.Status() == 2)
    {
      int oldListQBE = PAN_MOVIMEPROPOS.iUseListQBE;
      PAN_MOVIMEPROPOS.iUseListQBE = 0;
      PAN_MOVIMEPROPOS.PanelCommand(Glb.PCM_SEARCH);
      PAN_MOVIMEPROPOS.PanelCommand(Glb.PCM_FIND);
      PAN_MOVIMEPROPOS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_MOVIMEPROPOS) PAN_MOVIMEPROPOS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_MOVIMEPROPOS) PAN_MOVIMEPROPOS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_MOVIMEPROPOS) PAN_MOVIMEPROPOS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_MOVIMEPROPOS) PAN_MOVIMEPROPOS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MOVIMEPROPOS) PAN_MOVIMEPROPOS_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_MOVIMEPROPOS) PAN_MOVIMEPROPOS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
