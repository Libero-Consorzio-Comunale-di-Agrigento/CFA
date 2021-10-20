// **********************************************
// Informazioni Pluriennali
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InformazioniPluriennali extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PLURIENNALI_NRO = 0;
  private static int PFL_PLURIENNALI_ANNO = 1;
  private static int PFL_PLURIENNALI_DESCRIZIONE = 2;
  private static int PFL_PLURIENNALI_IMPORTO = 3;
  private static int PFL_PLURIENNALI_DATAREG = 4;
  private static int PFL_PLURIENNALI_ANNOPLUR = 5;
  private static int PFL_PLURIENNALI_CAPITOLO4 = 6;
  private static int PFL_PLURIENNALI_ARTICOLO4 = 7;
  private static int PFL_PLURIENNALI_ANNODEL = 8;
  private static int PFL_PLURIENNALI_NUMERODEL = 9;
  private static int PFL_PLURIENNALI_SEDEDEL = 10;
  private static int PFL_PLURIENNALI_CAUSALE = 11;
  private static int PFL_PLURIENNALI_IMPEGNOBBLIG = 12;
  private static int PFL_PLURIENNALI_ESERCISCADEN = 13;
  private static int PFL_PLURIENNALI_ANNOINTROD = 14;
  private static int PFL_PLURIENNALI_BENEFICIARIO = 15;
  private static int PFL_PLURIENNALI_SETTORE = 16;
  private static int PFL_PLURIENNALI_SERVIZIO = 17;
  private static int PFL_PLURIENNALI_TIPOLOGSPESA = 18;
  private static int PFL_PLURIENNALI_ANNOPROPOSTA = 19;
  private static int PFL_PLURIENNALI_UNITAPROPONE = 20;
  private static int PFL_PLURIENNALI_NUMEROPROPOS = 21;
  private static int PFL_PLURIENNALI_TIPO = 22;
  private static int PFL_PLURIENNALI_SERVIZIOCC = 23;
  private static int PFL_PLURIENNALI_PRENOTAZIONE = 24;
  private static int PFL_PLURIENNALI_VOCEECON = 25;
  private static int PFL_PLURIENNALI_TIPOVINCOLO = 26;
  private static int PFL_PLURIENNALI_INVESTIMENTO = 27;
  private static int PFL_PLURIENNALI_REGOLACONT = 28;
  private static int PFL_PLURIENNALI_CONTRIBSTR = 29;
  private static int PFL_PLURIENNALI_TITOLOGIURID = 30;
  private static int PFL_PLURIENNALI_S2 = 31;
  private static int PFL_PLURIENNALI_CENTRO = 32;
  private static int PFL_PLURIENNALI_FATTORE = 33;
  private static int PFL_PLURIENNALI_COMPETENZDAL = 34;
  private static int PFL_PLURIENNALI_COMPETENZAAL = 35;
  private static int PFL_PLURIENNALI_NOTE3 = 36;
  private static int PFL_PLURIENNALI_RILEVANTEECO = 37;
  private static int PFL_PLURIENNALI_CODIMPECO = 38;
  private static int PFL_PLURIENNALI_PROGETTOID = 39;
  private static int PFL_PLURIENNALI_OPERA2 = 40;
  private static int PFL_PLURIENNALI_COMUNEZONA = 41;
  private static int PFL_PLURIENNALI_PROVINCIZONA = 42;
  private static int PFL_PLURIENNALI_OBIETTIVO = 43;
  private static int PFL_PLURIENNALI_CODICEGESTIO = 44;
  private static int PFL_PLURIENNALI_CUP = 45;
  private static int PFL_PLURIENNALI_RESPONSABRES = 46;
  private static int PFL_PLURIENNALI_NUMEROPLUR = 47;

  private static int PPQRY_IMPEGNI2 = 0;


  IDPanel PAN_PLURIENNALI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI70(IMDB);
    //
    //
    Init_PQRY_IMPEGNI2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI70(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI70, 2);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI70, "TBL_PARAMETRI70");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI70,IMDBDef4.FLD_PARAMETRI70_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI70,IMDBDef4.FLD_PARAMETRI70_ROWNAMANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI70,IMDBDef4.FLD_PARAMETRI70_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI70,IMDBDef4.FLD_PARAMETRI70_ROWNAMNUMIMP,1,5,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI70, 0);
  }

  private static void Init_PQRY_IMPEGNI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_IMPEGNI2, 49);
    IMDB.set_TblCode(IMDBDef13.PQRY_IMPEGNI2, "PQRY_IMPEGNI2");
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_DATA_REG,1,7,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_IMPEGNO_OBBLIG, "IMPEGNO_OBBLIG");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_IMPEGNO_OBBLIG,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_ESERCIZIO_SCADENZA, "ESERCIZIO_SCADENZA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_ESERCIZIO_SCADENZA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_ANNO_INTROD, "ANNO_INTROD");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_ANNO_INTROD,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_SETTORE, "SETTORE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_SETTORE,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_SERVIZIO, "SERVIZIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_SERVIZIO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_TIPOLOGIA_SPESA, "TIPOLOGIA_SPESA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_TIPOLOGIA_SPESA,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_SERVIZIO_CC, "SERVIZIO_CC");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_SERVIZIO_CC,1,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_PRENOTAZIONE, "PRENOTAZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_PRENOTAZIONE,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_INVESTIMENTO, "INVESTIMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_INVESTIMENTO,5,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_REGOLA_CONT, "REGOLA_CONT");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_REGOLA_CONT,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_CONTRIB_STR, "CONTRIB_STR");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_CONTRIB_STR,1,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_TITOLO_GIURIDICO, "TITOLO_GIURIDICO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_TITOLO_GIURIDICO,5,60,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_S, "S");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_S,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_ANNO_PLUR, "ANNO_PLUR");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_ANNO_PLUR,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_NUMERO_PLUR, "NUMERO_PLUR");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_NUMERO_PLUR,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_RILEVANTE_ECO, "RILEVANTE_ECO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_RILEVANTE_ECO,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_COD_IMP_ECO, "COD_IMP_ECO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_COD_IMP_ECO,5,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_COMUNE_ZONA, "COMUNE_ZONA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_COMUNE_ZONA,1,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_PROVINCIA_ZONA, "PROVINCIA_ZONA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_PROVINCIA_ZONA,1,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_OBIETTIVO, "OBIETTIVO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_OBIETTIVO,5,9,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_CUP, "CUP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_CUP,5,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_RESPONSABILE_RES, "RESPONSABILE_RES");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPEGNI2,IMDBDef13.PQSL_IMPEGNI2_RESPONSABILE_RES,5,40,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_IMPEGNI2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InformazioniPluriennali(MyWebEntryPoint w, IMDBObj imdb)
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
  public InformazioniPluriennali()
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
    FormIdx = MyGlb.FRM_INFORMPLURIE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "50E601EB-F58C-4E66-B6D2-960B0EE6FDF0";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 712;
    DesignHeight = 394;
    set_Caption(new IDVariant("Informazioni Pluriennali"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 712;
    Frames[1].Height = 368;
    Frames[1].Caption = "Pluriennali";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 368;
    PAN_PLURIENNALI = new IDPanel(w, this, 1, "PAN_PLURIENNALI");
    Frames[1].Content = PAN_PLURIENNALI;
    PAN_PLURIENNALI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PLURIENNALI.VS = MainFrm.VisualStyleList;
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 712-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2AC92DDF-ED9B-4EDE-ABED-9D51A2DDF70E");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 556, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PLURIENNALI.InitStatus = 2;
    PAN_PLURIENNALI_Init();
    PAN_PLURIENNALI_InitFields();
    PAN_PLURIENNALI_InitQueries();
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
      PAN_PLURIENNALI.UpdatePanel(MainFrm);
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
    return (obj instanceof InformazioniPluriennali);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InformazioniPluriennali.class.getName() : (Glb.ClassWithPackage(InformazioniPluriennali.class) ? InformazioniPluriennali.class.getName().substring(InformazioniPluriennali.class.getPackage().getName().length() + 1) : InformazioniPluriennali.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Pluriennali On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PLURIENNALI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PLURIENNALI);
      // 
      // Pluriennali On Dynamic Properties Event Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_PLURIENNALI.Layout())).equals((new IDVariant(0)), true))
      {
        PAN_PLURIENNALI.SetFlags (Glb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PLURIENNALI.SetFlags (Glb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PLURIENNALI.SetFlags (Glb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PLURIENNALI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      }
      else
      {
        PAN_PLURIENNALI.SetFlags (Glb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PLURIENNALI.SetFlags (Glb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PLURIENNALI.SetFlags (Glb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PLURIENNALI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(-1)).booleanValue()); 
      }
      PAN_PLURIENNALI.set_ToolTip(Glb.OBJ_FIELD,PFL_PLURIENNALI_DESCRIZIONE,(new IDVariant(PAN_PLURIENNALI.FieldText(PFL_PLURIENNALI_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniPluriennali", "PluriennaliOnDynamicPropertiesEvent", _e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniPluriennali", "LoadEvent", _e);
    }
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
  private void PAN_PLURIENNALI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PLURIENNALI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PLURIENNALI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PLURIENNALI, Cancel);
    // Stub
  }

  private void PAN_PLURIENNALI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PLURIENNALI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PLURIENNALI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMPEGNI2, IMDBDef13.PQSL_IMPEGNI2_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef13.PQRY_IMPEGNI2, IMDBDef13.PQSL_IMPEGNI2_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMPEGNI2, IMDBDef13.PQSL_IMPEGNI2_S, 0)))
      {
        IMDB.set_Value(IMDBDef13.PQRY_IMPEGNI2, IMDBDef13.PQSL_IMPEGNI2_S, 0, (new IDVariant("S")));
      }
      if (Cancel.isFalse())
      {
        PAN_PLURIENNALI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PLURIENNALI_Init()
  {

    PAN_PLURIENNALI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PLURIENNALI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PLURIENNALI.SetSize(MyGlb.OBJ_FIELD, 48);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NRO, "351942CD-0EF1-4249-8256-4636572CF630");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NRO, "N.ro");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NRO, "Numero dell'impegno");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NRO, MyGlb.VIS_NORMALFIELDS);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, "2AA95C37-F0E4-42CC-9033-0D0AFEB59CC1");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, "Anno");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, "Anno Impegno");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, "5C293412-2D6E-4E05-86C2-C1BAFB313EC8");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, "Descrizione");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, "5219C5AC-E54F-43ED-B281-75EA847AAE49");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, "Importo");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, "0ABDA375-9812-4CB6-8F53-AA8A62E10012");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, "Data Reg.");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, "0ED3DBCA-BDD3-4867-BA69-6CB810905888");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, "ANNO PLUR");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO4, "B2B60796-7E22-4B97-838F-74714BAEC0E1");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO4, "CAPITOLO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO4, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO4, MyGlb.VIS_NONNULLAFIEL);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO4, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, "B07C0DD6-C5B9-4A0F-830A-51CF6359B317");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, "ARTICOLO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.VIS_NONNULLAFIEL);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, "67426B8A-52AD-4AA0-983E-9660008D77E7");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, "ANNO DEL");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, "D579AA50-17F4-4B6A-B949-3FF8792C5B39");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, "NUMERO DEL");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, "D567638B-3816-4D56-B758-7B6690D7820E");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, "SEDE DEL");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, "72E4D1FC-DD59-440E-965A-475A4F9DFA72");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, "CAUSALE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPEGNOBBLIG, "D15B33E2-2B98-4A8E-B35F-BF66B59341FB");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPEGNOBBLIG, "IMPEGNO OBBLIG");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPEGNOBBLIG, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPEGNOBBLIG, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPEGNOBBLIG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, "65F24754-6A9C-4486-B357-9D03566BF485");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, "ESERCIZIO SCADENZA");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, "24EF68D5-B6DA-4FBF-B259-D506B0CBD9A0");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, "ANNO INTROD");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_BENEFICIARIO, "14C1D85E-DB23-420B-A4FA-696B87FE300C");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_BENEFICIARIO, "BENEFICIARIO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_BENEFICIARIO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_BENEFICIARIO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_BENEFICIARIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SETTORE, "675DF54A-330D-40CF-92FF-C49CAFB71558");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SETTORE, "SETTORE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SETTORE, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SETTORE, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SETTORE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIO, "B83B434D-1EF6-4B5F-84AD-3308AD3B24D4");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIO, "SERVIZIO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOLOGSPESA, "86BAF17B-2781-49B0-B077-A3DA4480B5E2");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOLOGSPESA, "TIPOLOGIA SPESA");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOLOGSPESA, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOLOGSPESA, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOLOGSPESA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, "3B36675A-E75C-4BCE-AA7F-94B86305F405");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, "F62BDA31-0B50-4196-8393-17228CB054B2");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, "8F1AE55A-F159-4B68-B1FE-8FAEE8057967");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPO, "A56C1434-CA6D-4C6D-B85F-E6213107E0D8");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPO, "TIPO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIOCC, "B4930DD4-BA20-42B1-B863-8FD69A2CCCCE");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIOCC, "SERVIZIO CC");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIOCC, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIOCC, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIOCC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PRENOTAZIONE, "103AC2A0-7765-4C37-9CC1-0D6C5F4699E6");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PRENOTAZIONE, "PRENOTAZIONE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PRENOTAZIONE, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PRENOTAZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PRENOTAZIONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, "FFBF2F4E-4145-407B-AD0A-D3CD4B1E54E6");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, "VOCE ECON");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.VIS_NONNULLAFIEL);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, 0, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, "65EF5577-63CC-422C-B750-F73212EF6B10");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, "TIPO VINCOLO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_INVESTIMENTO, "2A252A3C-AF2C-4C46-8CF4-74715DE3D468");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_INVESTIMENTO, "INVESTIMENTO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_INVESTIMENTO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_INVESTIMENTO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_INVESTIMENTO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_REGOLACONT, "46586239-86B2-466D-ACC8-25E608C42824");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_REGOLACONT, "REGOLA CONT");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_REGOLACONT, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_REGOLACONT, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_REGOLACONT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CONTRIBSTR, "DCCFD1ED-1D97-46ED-967E-292B7A70A4F6");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CONTRIBSTR, "CONTRIB STR");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CONTRIBSTR, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CONTRIBSTR, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CONTRIBSTR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TITOLOGIURID, "696BE219-1DCC-4A33-B718-3E66E8A9FF41");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TITOLOGIURID, "TITOLO GIURIDICO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TITOLOGIURID, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TITOLOGIURID, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TITOLOGIURID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_S2, "4A217B8A-2528-46D9-BC86-63BDEEA5CD7A");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_S2, "S");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_S2, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_S2, MyGlb.VIS_NONNULLAFIEL);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_S2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, "43CDA56E-A58F-4B4B-BDD2-BD895BF988D0");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, "CENTRO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, "69059B43-9698-471A-9521-4866ACE220F7");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, "FATTORE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, "B17AB60F-A977-4F37-A312-76ADBA4AFF84");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, "COMPETENZA DAL");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, "93F0955A-0EA5-4BB8-AB1E-ED0E23D57CB9");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, "COMPETENZA AL");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, "05AB88AE-0199-40F3-B932-57958C734EAE");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, "NOTE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, "B65E5779-43D5-45B0-B935-B0ABCAB84E5F");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, "RILEVANTE ECO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, "0B319FE2-6DA1-4DF7-AB2E-0715AE73EF38");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, "COD IMP ECO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, "539804C7-468E-4C94-9239-9BF7A56D96AD");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, "PROGETTO ID");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA2, "EB351CB8-1956-41D0-888D-21DE0331D1D9");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA2, "OPERA");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA2, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA2, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMUNEZONA, "33342E44-03A2-48BC-A3EC-8D4799B27BDB");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMUNEZONA, "COMUNE ZONA");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMUNEZONA, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMUNEZONA, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMUNEZONA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROVINCIZONA, "61874E2F-7324-42A8-B0AD-9A394ECE4594");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROVINCIZONA, "PROVINCIA ZONA");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROVINCIZONA, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROVINCIZONA, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROVINCIZONA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, "3F23C003-A917-4844-ADB8-9B74A06172A1");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, "OBIETTIVO");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, "08769C0A-1B00-4DB8-9D73-FCF7A092C741");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, "CODICE GESTIONALE");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CUP, "06EC0230-42D7-46BD-9094-C293332472F3");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CUP, "CUP");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CUP, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CUP, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CUP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, "97579275-1388-4B56-B1B3-A8E9FC7E1B7A");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, "RESPONSABILE RES");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PLURIENNALI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, "CD331F9E-CD6C-416E-A19D-6CE7B858A0FA");
    PAN_PLURIENNALI.set_Header(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, "NUMERO PLUR");
    PAN_PLURIENNALI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, "");
    PAN_PLURIENNALI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.VIS_NORMFIELPADR);
    PAN_PLURIENNALI.SetFlags(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PLURIENNALI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NRO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NRO, MyGlb.PANEL_LIST, 72);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NRO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NRO, MyGlb.PANEL_LIST, "N.ro");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NRO, MyGlb.PANEL_FORM, 32, 20, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NRO, MyGlb.PANEL_FORM, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NRO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NRO, MyGlb.PANEL_FORM, "N.ro");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_NRO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_NRO, PPQRY_IMPEGNI2, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_LIST, 52, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_LIST, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_FORM, 260, 20, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_FORM, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ANNO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ANNO, PPQRY_IMPEGNI2, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_LIST, 96, 36, 276, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_FORM, 32, 44, 344, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_DESCRIZIONE, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_DESCRIZIONE, PPQRY_IMPEGNI2, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_LIST, 372, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_FORM, 32, 104, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_IMPORTO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_IMPORTO, PPQRY_IMPEGNI2, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_LIST, 468, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_LIST, 68);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_FORM, 208, 104, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_FORM, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_DATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_DATAREG, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_DATAREG, PPQRY_IMPEGNI2, "A.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_LIST, 656, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_LIST, 68);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_LIST, "ANNO PLUR");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_FORM, 4, 304, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_FORM, 68);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPLUR, MyGlb.PANEL_FORM, "ANNO PLUR");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ANNOPLUR, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ANNOPLUR, PPQRY_IMPEGNI2, "A.ANNO_PLUR", "ANNO_PLUR", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO4, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO4, MyGlb.PANEL_LIST, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO4, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO4, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO4, MyGlb.PANEL_FORM, 432, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO4, MyGlb.PANEL_FORM, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO4, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAPITOLO4, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_CAPITOLO4, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_CAPITOLO4, PPQRY_IMPEGNI2, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_LIST, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_FORM, 432, 68, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_FORM, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ARTICOLO4, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ARTICOLO4, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ARTICOLO4, PPQRY_IMPEGNI2, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_LIST, 656, 32, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_FORM, 4, 400, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ANNODEL, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ANNODEL, PPQRY_IMPEGNI2, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_LIST, 716, 32, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_LIST, "NUMERO DEL");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_FORM, 4, 424, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_NUMERODEL, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_NUMERODEL, PPQRY_IMPEGNI2, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_LIST, 788, 32, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_FORM, 4, 448, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_SEDEDEL, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_SEDEDEL, PPQRY_IMPEGNI2, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_LIST, 844, 32, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_LIST, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_LIST, "CAUSALE");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_FORM, 4, 472, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_FORM, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CAUSALE, MyGlb.PANEL_FORM, "CAUSALE");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_CAUSALE, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_CAUSALE, PPQRY_IMPEGNI2, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPEGNOBBLIG, MyGlb.PANEL_LIST, 900, 32, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPEGNOBBLIG, MyGlb.PANEL_LIST, 96);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPEGNOBBLIG, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPEGNOBBLIG, MyGlb.PANEL_LIST, "IMPEGNO OBBLIG");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPEGNOBBLIG, MyGlb.PANEL_FORM, 4, 496, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPEGNOBBLIG, MyGlb.PANEL_FORM, 96);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPEGNOBBLIG, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_IMPEGNOBBLIG, MyGlb.PANEL_FORM, "IMP. OBBLIG");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_IMPEGNOBBLIG, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_IMPEGNOBBLIG, PPQRY_IMPEGNI2, "A.IMPEGNO_OBBLIG", "IMPEGNO_OBBLIG", 5, 2, 0, -13997);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_IMPEGNOBBLIG, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_IMPEGNOBBLIG, (new IDVariant()), "Null", "", "", -1);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_LIST, 996, 32, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_LIST, 120);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_LIST, "ESERCIZIO SCADENZA");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_FORM, 4, 520, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_FORM, 120);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ESERCISCADEN, MyGlb.PANEL_FORM, "ESERC. SCADENZA");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ESERCISCADEN, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ESERCISCADEN, PPQRY_IMPEGNI2, "A.ESERCIZIO_SCADENZA", "ESERCIZIO_SCADENZA", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_LIST, 1116, 32, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_LIST, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_LIST, "ANNO INTROD");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_FORM, 4, 544, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_FORM, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOINTROD, MyGlb.PANEL_FORM, "ANN. INTROD");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ANNOINTROD, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ANNOINTROD, PPQRY_IMPEGNI2, "A.ANNO_INTROD", "ANNO_INTROD", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_BENEFICIARIO, MyGlb.PANEL_LIST, 1196, 32, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_BENEFICIARIO, MyGlb.PANEL_LIST, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_BENEFICIARIO, MyGlb.PANEL_LIST, "BENEFIC.");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 568, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_BENEFICIARIO, MyGlb.PANEL_FORM, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_BENEFICIARIO, MyGlb.PANEL_FORM, "BENEFIC.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_BENEFICIARIO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_BENEFICIARIO, PPQRY_IMPEGNI2, "A.BENEFICIARIO", "BENEFICIARIO", 2, 15, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SETTORE, MyGlb.PANEL_LIST, 1276, 32, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SETTORE, MyGlb.PANEL_LIST, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SETTORE, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SETTORE, MyGlb.PANEL_LIST, "SETTORE");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SETTORE, MyGlb.PANEL_FORM, 4, 592, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SETTORE, MyGlb.PANEL_FORM, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SETTORE, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SETTORE, MyGlb.PANEL_FORM, "SETTORE");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_SETTORE, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_SETTORE, PPQRY_IMPEGNI2, "A.SETTORE", "SETTORE", 1, 2, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIO, MyGlb.PANEL_LIST, 1332, 32, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIO, MyGlb.PANEL_LIST, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIO, MyGlb.PANEL_LIST, "SERV.");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIO, MyGlb.PANEL_FORM, 4, 616, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIO, MyGlb.PANEL_FORM, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIO, MyGlb.PANEL_FORM, "SERV.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_SERVIZIO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_SERVIZIO, PPQRY_IMPEGNI2, "A.SERVIZIO", "SERVIZIO", 1, 2, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOLOGSPESA, MyGlb.PANEL_LIST, 1388, 32, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOLOGSPESA, MyGlb.PANEL_LIST, 100);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOLOGSPESA, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOLOGSPESA, MyGlb.PANEL_LIST, "TIPOLOGIA SPESA");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOLOGSPESA, MyGlb.PANEL_FORM, 4, 640, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOLOGSPESA, MyGlb.PANEL_FORM, 100);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOLOGSPESA, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOLOGSPESA, MyGlb.PANEL_FORM, "TIPOL. SPESA");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_TIPOLOGSPESA, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_TIPOLOGSPESA, PPQRY_IMPEGNI2, "A.TIPOLOGIA_SPESA", "TIPOLOGIA_SPESA", 1, 2, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1488, 32, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANNO PROPOSTA");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 664, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_ANNOPROPOSTA, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_ANNOPROPOSTA, PPQRY_IMPEGNI2, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_LIST, 1584, 32, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 688, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_UNITAPROPONE, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_UNITAPROPONE, PPQRY_IMPEGNI2, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1696, 32, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUMERO PROPOSTA");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 712, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_NUMEROPROPOS, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_NUMEROPROPOS, PPQRY_IMPEGNI2, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPO, MyGlb.PANEL_LIST, 1804, 32, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPO, MyGlb.PANEL_FORM, 4, 736, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPO, MyGlb.PANEL_FORM, 32);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPO, MyGlb.PANEL_FORM, "TP.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_TIPO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_TIPO, PPQRY_IMPEGNI2, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIOCC, MyGlb.PANEL_LIST, 1844, 32, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIOCC, MyGlb.PANEL_LIST, 72);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIOCC, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIOCC, MyGlb.PANEL_LIST, "SERVIZIO CC");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIOCC, MyGlb.PANEL_FORM, 4, 760, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIOCC, MyGlb.PANEL_FORM, 72);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIOCC, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_SERVIZIOCC, MyGlb.PANEL_FORM, "SERV. CC");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_SERVIZIOCC, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_SERVIZIOCC, PPQRY_IMPEGNI2, "A.SERVIZIO_CC", "SERVIZIO_CC", 1, 3, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PRENOTAZIONE, MyGlb.PANEL_LIST, 1916, 32, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PRENOTAZIONE, MyGlb.PANEL_LIST, 88);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PRENOTAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PRENOTAZIONE, MyGlb.PANEL_LIST, "PRENOT.");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PRENOTAZIONE, MyGlb.PANEL_FORM, 4, 784, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PRENOTAZIONE, MyGlb.PANEL_FORM, 88);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PRENOTAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PRENOTAZIONE, MyGlb.PANEL_FORM, "PRENOT.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_PRENOTAZIONE, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_PRENOTAZIONE, PPQRY_IMPEGNI2, "A.PRENOTAZIONE", "PRENOTAZIONE", 5, 2, 0, -13997);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_PRENOTAZIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_PRENOTAZIONE, (new IDVariant()), "Null", "", "", -1);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_LIST, 2004, 32, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_LIST, 68);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_LIST, "VOCE ECON");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_FORM, 4, 808, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_FORM, 68);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_VOCEECON, MyGlb.PANEL_FORM, "VOCE ECON");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_VOCEECON, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_VOCEECON, PPQRY_IMPEGNI2, "A.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_LIST, 2072, 32, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_LIST, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_LIST, "TIPO VINCOLO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 832, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_FORM, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TIPOVINCOLO, MyGlb.PANEL_FORM, "TP. VINCOLO");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_TIPOVINCOLO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_TIPOVINCOLO, PPQRY_IMPEGNI2, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_INVESTIMENTO, MyGlb.PANEL_LIST, 2152, 32, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_INVESTIMENTO, MyGlb.PANEL_LIST, 84);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_INVESTIMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_INVESTIMENTO, MyGlb.PANEL_LIST, "INVEST.");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_INVESTIMENTO, MyGlb.PANEL_FORM, 4, 856, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_INVESTIMENTO, MyGlb.PANEL_FORM, 84);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_INVESTIMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_INVESTIMENTO, MyGlb.PANEL_FORM, "INVEST.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_INVESTIMENTO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_INVESTIMENTO, PPQRY_IMPEGNI2, "A.INVESTIMENTO", "INVESTIMENTO", 5, 6, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_REGOLACONT, MyGlb.PANEL_LIST, 2236, 32, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_REGOLACONT, MyGlb.PANEL_LIST, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_REGOLACONT, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_REGOLACONT, MyGlb.PANEL_LIST, "REGOLA CONT");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_REGOLACONT, MyGlb.PANEL_FORM, 4, 880, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_REGOLACONT, MyGlb.PANEL_FORM, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_REGOLACONT, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_REGOLACONT, MyGlb.PANEL_FORM, "REG. CONT");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_REGOLACONT, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_REGOLACONT, PPQRY_IMPEGNI2, "A.REGOLA_CONT", "REGOLA_CONT", 5, 2, 0, -13997);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_REGOLACONT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_REGOLACONT, (new IDVariant()), "Null", "", "", -1);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CONTRIBSTR, MyGlb.PANEL_LIST, 2316, 32, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CONTRIBSTR, MyGlb.PANEL_LIST, 76);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CONTRIBSTR, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CONTRIBSTR, MyGlb.PANEL_LIST, "CONTRIB STR");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CONTRIBSTR, MyGlb.PANEL_FORM, 4, 904, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CONTRIBSTR, MyGlb.PANEL_FORM, 76);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CONTRIBSTR, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CONTRIBSTR, MyGlb.PANEL_FORM, "CONT. STR");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_CONTRIBSTR, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_CONTRIBSTR, PPQRY_IMPEGNI2, "A.CONTRIB_STR", "CONTRIB_STR", 1, 3, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TITOLOGIURID, MyGlb.PANEL_LIST, 2392, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TITOLOGIURID, MyGlb.PANEL_LIST, 104);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TITOLOGIURID, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TITOLOGIURID, MyGlb.PANEL_LIST, "TITOLO GIURIDICO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TITOLOGIURID, MyGlb.PANEL_FORM, 4, 928, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TITOLOGIURID, MyGlb.PANEL_FORM, 104);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TITOLOGIURID, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_TITOLOGIURID, MyGlb.PANEL_FORM, "TIT. GIURIDICO");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_TITOLOGIURID, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_TITOLOGIURID, PPQRY_IMPEGNI2, "A.TITOLO_GIURIDICO", "TITOLO_GIURIDICO", 5, 60, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_S2, MyGlb.PANEL_LIST, 2700, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_S2, MyGlb.PANEL_LIST, 16);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_S2, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_S2, MyGlb.PANEL_LIST, "S");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_S2, MyGlb.PANEL_FORM, 4, 952, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_S2, MyGlb.PANEL_FORM, 16);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_S2, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_S2, MyGlb.PANEL_FORM, "S");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_S2, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_S2, PPQRY_IMPEGNI2, "A.S", "S", 5, 1, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_LIST, 2740, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_LIST, "CENTRO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_FORM, 4, 976, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CENTRO, MyGlb.PANEL_FORM, "CENTRO");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_CENTRO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_CENTRO, PPQRY_IMPEGNI2, "A.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_LIST, 2792, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_LIST, "FATTORE");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_FORM, 4, 1000, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_FATTORE, MyGlb.PANEL_FORM, "FATTORE");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_FATTORE, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_FATTORE, PPQRY_IMPEGNI2, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_LIST, 2848, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_LIST, 100);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_LIST, "COMPETENZA DAL");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_FORM, 4, 1024, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_FORM, 100);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZDAL, MyGlb.PANEL_FORM, "COMPET. DAL");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_COMPETENZDAL, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_COMPETENZDAL, PPQRY_IMPEGNI2, "A.COMPETENZA_DAL", "COMPETENZA_DAL", 6, 19, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_LIST, 2952, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_LIST, 92);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_LIST, "COMPETENZA AL");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_FORM, 4, 1048, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_FORM, 92);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMPETENZAAL, MyGlb.PANEL_FORM, "COMPET. AL");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_COMPETENZAAL, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_COMPETENZAAL, PPQRY_IMPEGNI2, "A.COMPETENZA_AL", "COMPETENZA_AL", 6, 19, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_LIST, 3056, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_LIST, 36);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_LIST, 2);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_LIST, "NOTE");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_FORM, 4, 1072, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_FORM, 36);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_FORM, 2);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NOTE3, MyGlb.PANEL_FORM, "NOTE");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_NOTE3, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_NOTE3, PPQRY_IMPEGNI2, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_LIST, 3488, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_LIST, 88);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_LIST, "RILEVANTE ECO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_FORM, 4, 1120, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_FORM, 88);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RILEVANTEECO, MyGlb.PANEL_FORM, "RILEV. ECO");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_RILEVANTEECO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_RILEVANTEECO, PPQRY_IMPEGNI2, "A.RILEVANTE_ECO", "RILEVANTE_ECO", 5, 2, 0, -13997);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_RILEVANTEECO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PLURIENNALI.SetValueListItem(PFL_PLURIENNALI_RILEVANTEECO, (new IDVariant()), "Null", "", "", -1);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_LIST, 3576, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_LIST, 76);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_LIST, "COD IMP ECO");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_FORM, 4, 1144, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_FORM, 76);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODIMPECO, MyGlb.PANEL_FORM, "CD. IMP ECO");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_CODIMPECO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_CODIMPECO, PPQRY_IMPEGNI2, "A.COD_IMP_ECO", "COD_IMP_ECO", 5, 16, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_LIST, 3652, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_LIST, 76);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_LIST, "PROGETTO ID");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_FORM, 4, 1168, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_FORM, 76);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROGETTOID, MyGlb.PANEL_FORM, "PROG. ID");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_PROGETTOID, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_PROGETTOID, PPQRY_IMPEGNI2, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA2, MyGlb.PANEL_LIST, 3728, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA2, MyGlb.PANEL_LIST, 44);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA2, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA2, MyGlb.PANEL_LIST, "OPERA");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA2, MyGlb.PANEL_FORM, 4, 1192, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA2, MyGlb.PANEL_FORM, 44);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA2, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OPERA2, MyGlb.PANEL_FORM, "OPERA");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_OPERA2, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_OPERA2, PPQRY_IMPEGNI2, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMUNEZONA, MyGlb.PANEL_LIST, 3772, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMUNEZONA, MyGlb.PANEL_LIST, 84);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMUNEZONA, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMUNEZONA, MyGlb.PANEL_LIST, "COMUNE ZONA");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMUNEZONA, MyGlb.PANEL_FORM, 4, 1216, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMUNEZONA, MyGlb.PANEL_FORM, 84);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMUNEZONA, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_COMUNEZONA, MyGlb.PANEL_FORM, "COM. ZONA");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_COMUNEZONA, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_COMUNEZONA, PPQRY_IMPEGNI2, "A.COMUNE_ZONA", "COMUNE_ZONA", 1, 3, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROVINCIZONA, MyGlb.PANEL_LIST, 3856, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROVINCIZONA, MyGlb.PANEL_LIST, 96);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROVINCIZONA, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROVINCIZONA, MyGlb.PANEL_LIST, "PROVINCIA ZONA");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROVINCIZONA, MyGlb.PANEL_FORM, 4, 1240, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROVINCIZONA, MyGlb.PANEL_FORM, 96);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROVINCIZONA, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_PROVINCIZONA, MyGlb.PANEL_FORM, "PROV. ZONA");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_PROVINCIZONA, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_PROVINCIZONA, PPQRY_IMPEGNI2, "A.PROVINCIA_ZONA", "PROVINCIA_ZONA", 1, 3, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_LIST, 3952, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_LIST, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_LIST, "OBIET.");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_FORM, 4, 1264, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_FORM, 64);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_OBIETTIVO, MyGlb.PANEL_FORM, "OBIET.");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_OBIETTIVO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_OBIETTIVO, PPQRY_IMPEGNI2, "A.OBIETTIVO", "OBIETTIVO", 5, 9, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_LIST, 4016, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_LIST, 112);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_LIST, "CODICE GESTIONALE");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_FORM, 4, 1288, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_FORM, 112);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CODICEGESTIO, MyGlb.PANEL_FORM, "COD. GESTIONALE");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_CODICEGESTIO, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_CODICEGESTIO, PPQRY_IMPEGNI2, "A.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CUP, MyGlb.PANEL_LIST, 4128, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CUP, MyGlb.PANEL_LIST, 28);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CUP, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CUP, MyGlb.PANEL_LIST, "CUP");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CUP, MyGlb.PANEL_FORM, 4, 1312, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CUP, MyGlb.PANEL_FORM, 28);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CUP, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_CUP, MyGlb.PANEL_FORM, "CUP");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_CUP, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_CUP, PPQRY_IMPEGNI2, "A.CUP", "CUP", 5, 15, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_LIST, 4212, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_LIST, 104);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_LIST, "RESPONSABILE RES");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_FORM, 4, 1336, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_FORM, 104);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_RESPONSABRES, MyGlb.PANEL_FORM, "RESPONS. RES");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_RESPONSABRES, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_RESPONSABRES, PPQRY_IMPEGNI2, "A.RESPONSABILE_RES", "RESPONSABILE_RES", 5, 40, 0, -13997);
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_LIST, 4420, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_LIST, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_LIST, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_LIST, "NUMERO PLUR");
    PAN_PLURIENNALI.SetRect(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_FORM, 4, 1360, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PLURIENNALI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_FORM, 80);
    PAN_PLURIENNALI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_FORM, 1);
    PAN_PLURIENNALI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PLURIENNALI_NUMEROPLUR, MyGlb.PANEL_FORM, "NUM. PLUR");
    PAN_PLURIENNALI.SetFieldPage(PFL_PLURIENNALI_NUMEROPLUR, -1, -1);
    PAN_PLURIENNALI.SetFieldPanel(PFL_PLURIENNALI_NUMEROPLUR, PPQRY_IMPEGNI2, "A.NUMERO_PLUR", "NUMERO_PLUR", 1, 5, 0, -13997);
  }

  private void PAN_PLURIENNALI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PLURIENNALI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PLURIENNALI.SetIMDB(IMDB, "PQRY_IMPEGNI2", true);
    PAN_PLURIENNALI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.DATA_REG as DATA_REG, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CAUSALE as CAUSALE, ");
    SQL.append("  A.IMPEGNO_OBBLIG as IMPEGNO_OBBLIG, ");
    SQL.append("  A.ESERCIZIO_SCADENZA as ESERCIZIO_SCADENZA, ");
    SQL.append("  A.ANNO_INTROD as ANNO_INTROD, ");
    SQL.append("  A.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  A.SETTORE as SETTORE, ");
    SQL.append("  A.SERVIZIO as SERVIZIO, ");
    SQL.append("  A.TIPOLOGIA_SPESA as TIPOLOGIA_SPESA, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.SERVIZIO_CC as SERVIZIO_CC, ");
    SQL.append("  A.PRENOTAZIONE as PRENOTAZIONE, ");
    SQL.append("  A.VOCE_ECON as VOCE_ECON, ");
    SQL.append("  A.TIPO_VINCOLO as TIPO_VINCOLO, ");
    SQL.append("  A.INVESTIMENTO as INVESTIMENTO, ");
    SQL.append("  A.REGOLA_CONT as REGOLA_CONT, ");
    SQL.append("  A.CONTRIB_STR as CONTRIB_STR, ");
    SQL.append("  A.TITOLO_GIURIDICO as TITOLO_GIURIDICO, ");
    SQL.append("  A.S as S, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.ANNO_PLUR as ANNO_PLUR, ");
    SQL.append("  A.NUMERO_PLUR as NUMERO_PLUR, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.COMPETENZA_DAL as COMPETENZA_DAL, ");
    SQL.append("  A.COMPETENZA_AL as COMPETENZA_AL, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.RILEVANTE_ECO as RILEVANTE_ECO, ");
    SQL.append("  A.COD_IMP_ECO as COD_IMP_ECO, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.COMUNE_ZONA as COMUNE_ZONA, ");
    SQL.append("  A.PROVINCIA_ZONA as PROVINCIA_ZONA, ");
    SQL.append("  A.OBIETTIVO as OBIETTIVO, ");
    SQL.append("  A.CODICE_GESTIONALE as CODICE_GESTIONALE, ");
    SQL.append("  A.CUP as CUP, ");
    SQL.append("  A.RESPONSABILE_RES as RESPONSABILE_RES ");
    PAN_PLURIENNALI.SetQuery(PPQRY_IMPEGNI2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  IMP A ");
    PAN_PLURIENNALI.SetQuery(PPQRY_IMPEGNI2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((A.ANNO_PLUR = ~~TBL_PARAMETRI70.ROWNAMANNIMP~~ AND A.NUMERO_PLUR = ~~TBL_PARAMETRI70.ROWNAMNUMIMP~~) OR (A.ANNO_IMP > ~~TBL_PARAMETRI70.ROWNAMANNIMP~~ AND EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  IMP B ");
    SQL.append("where (B.ANNO_PLUR = A.ANNO_PLUR) ");
    SQL.append("and   (B.NUMERO_PLUR = A.NUMERO_PLUR) ");
    SQL.append("and   (B.ANNO_IMP = ~~TBL_PARAMETRI70.ROWNAMANNIMP~~) ");
    SQL.append("and   (B.NUMERO_IMP = ~~TBL_PARAMETRI70.ROWNAMNUMIMP~~) ");
    SQL.append("and   (A.ANNO_IMP > B.ANNO_IMP) ");
    SQL.append(")))) ");
    PAN_PLURIENNALI.SetQuery(PPQRY_IMPEGNI2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PLURIENNALI.SetQuery(PPQRY_IMPEGNI2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PLURIENNALI.SetQuery(PPQRY_IMPEGNI2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP ");
    PAN_PLURIENNALI.SetQuery(PPQRY_IMPEGNI2, 5, SQL, -1, "");
    PAN_PLURIENNALI.SetQueryDB(PPQRY_IMPEGNI2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PLURIENNALI.SetMasterTable(0, "IMP");
    PAN_PLURIENNALI.AddToSortList(PFL_PLURIENNALI_ANNO, true);
    PAN_PLURIENNALI.AddToSortList(PFL_PLURIENNALI_NRO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PLURIENNALI.Status() == 2)
    {
      int oldListQBE = PAN_PLURIENNALI.iUseListQBE;
      PAN_PLURIENNALI.iUseListQBE = 0;
      PAN_PLURIENNALI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PLURIENNALI.PanelCommand(Glb.PCM_FIND);
      PAN_PLURIENNALI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PLURIENNALI) PAN_PLURIENNALI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
