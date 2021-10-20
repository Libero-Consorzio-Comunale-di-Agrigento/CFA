// **********************************************
// Variazioni Spesa
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniSpesa extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ELENCOVARIAZ_VARIAZIONI = 0;
  private static int GRP_ELENCOVARIAZ_PROVVEDIMENT = 1;

  private static int PFL_ELENCOVARIAZ_VARIAZIONI = 0;
  private static int PFL_ELENCOVARIAZ_NEWPANELABE5 = 1;
  private static int PFL_ELENCOVARIAZ_TIPOVARIAZIO = 2;
  private static int PFL_ELENCOVARIAZ_DELIBERA = 3;
  private static int PFL_ELENCOVARIAZ_TRATTIDELIBE = 4;
  private static int PFL_ELENCOVARIAZ_NUMERODELIBE = 5;
  private static int PFL_ELENCOVARIAZ_BARRADELIBER = 6;
  private static int PFL_ELENCOVARIAZ_ANNODELIBERA = 7;
  private static int PFL_ELENCOVARIAZ_APRISCELDELI = 8;
  private static int PFL_ELENCOVARIAZ_PROPOSTA = 9;
  private static int PFL_ELENCOVARIAZ_TRATTIPROPOS = 10;
  private static int PFL_ELENCOVARIAZ_NUMEROPROPO1 = 11;
  private static int PFL_ELENCOVARIAZ_BARRAPROPOST = 12;
  private static int PFL_ELENCOVARIAZ_ANNOPROPOST1 = 13;
  private static int PFL_ELENCOVARIAZ_APRISCELPROP = 14;
  private static int PFL_ELENCOVARIAZ_ETICHETTASF = 15;
  private static int PFL_ELENCOVARIAZ_PARTE = 16;
  private static int PFL_ELENCOVARIAZ_ESERCIZIO1 = 17;

  private static int PPQRY_PARAMETRI513 = 0;

  private static int PPQRY_T54 = 1;
  private static int PPQRY_ESEFIN = 2;


  IDPanel PAN_ELENCOVARIAZ;
  private static int PFL_VARIAZIONI_ESERCIZIO = 0;
  private static int PFL_VARIAZIONI_CODICE = 1;
  private static int PFL_VARIAZIONI_CAPITOLO = 2;
  private static int PFL_VARIAZIONI_ARTICOLO = 3;
  private static int PFL_VARIAZIONI_DESCRIZIONE = 4;
  private static int PFL_VARIAZIONI_PURO = 5;
  private static int PFL_VARIAZIONI_REISCDAESIGI = 6;
  private static int PFL_VARIAZIONI_REISCDASTANZ = 7;
  private static int PFL_VARIAZIONI_IMPORTOCASSA = 8;
  private static int PFL_VARIAZIONI_UNITAPROPONE = 9;
  private static int PFL_VARIAZIONI_NUMEROPROPOS = 10;
  private static int PFL_VARIAZIONI_ANNOPROPOSTA = 11;
  private static int PFL_VARIAZIONI_SEDEDEL = 12;
  private static int PFL_VARIAZIONI_NUMERODEL = 13;
  private static int PFL_VARIAZIONI_ANNODEL = 14;
  private static int PFL_VARIAZIONI_CODITIPOVARI = 15;
  private static int PFL_VARIAZIONI_PROGRESSIVO = 16;
  private static int PFL_VARIAZIONI_DESCTIPOVARI = 17;
  private static int PFL_VARIAZIONI_MISSIONE = 18;
  private static int PFL_VARIAZIONI_CODICESTRUTT = 19;
  private static int PFL_VARIAZIONI_LIVELLO4 = 20;
  private static int PFL_VARIAZIONI_LIVELLO5 = 21;
  private static int PFL_VARIAZIONI_OBIETTOPERAT = 22;
  private static int PFL_VARIAZIONI_OBIETTGESTIO = 23;

  private static int PPQRY_VARCOM11 = 0;


  IDPanel PAN_VARIAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI532(IMDB);
    //
    //
    Init_PQRY_PARAMETRI513(IMDB);
    Init_PQRY_PARAMETRI513_RS(IMDB);
    Init_PQRY_VARCOM11(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI532(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI532, 10);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI532, "TBL_PARAMETRI532");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI532,IMDBDef6.FLD_PARAMETRI532_ROWNAMEESERC,1,4,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI532, 0);
  }

  private static void Init_PQRY_PARAMETRI513(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI513, 10);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI513, "PQRY_PARAMETRI513");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513,IMDBDef15.PQSL_PARAMETRI513_ROWNAMEESERC,1,4,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI513, 0);
  }

  private static void Init_PQRY_PARAMETRI513_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI513_RS, 10);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI513_RS, "PQRY_PARAMETRI513_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI513_RS,IMDBDef15.PQSL_PARAMETRI513_ROWNAMEESERC,1,4,0);
  }

  private static void Init_PQRY_VARCOM11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_VARCOM11, 24);
    IMDB.set_TblCode(IMDBDef15.PQRY_VARCOM11, "PQRY_VARCOM11");
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCVARIPROG, "VARCVARIPROG");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCVARIPROG,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCOMESERCI, "VARCOMESERCI");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCOMESERCI,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCOMCAPITO, "VARCOMCAPITO");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCOMCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCOMARTICO, "VARCOMARTICO");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCOMARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCOANNODEL, "VARCOANNODEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCOANNODEL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCONUMEDEL, "VARCONUMEDEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCONUMEDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCOSEDEDEL, "VARCOSEDEDEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCOSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCOMDESCRI, "VARCOMDESCRI");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCOMDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCODTIPVAR, "VARCODTIPVAR");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCODTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCANNOPROP, "VARCANNOPROP");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCANNOPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCUNITPROP, "VARCUNITPROP");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCUNITPROP,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCNUMEPROP, "VARCNUMEPROP");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCNUMEPROP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_PURO, "PURO");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_PURO,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_REISCDAESIGI, "REISCDAESIGI");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_REISCDAESIGI,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_REISCDASTANZ, "REISCDASTANZ");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_REISCDASTANZ,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCIMPOCASS, "VARCIMPOCASS");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCIMPOCASS,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARDESTIPVAR, "VARDESTIPVAR");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARDESTIPVAR,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_CODICE,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_MISSIONE, "MISSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_MISSIONE,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCAPCODSTR, "VARCAPCODSTR");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_VARCAPCODSTR,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_LIVELLO4, "LIVELLO4");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_LIVELLO4,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_LIVELLO5, "LIVELLO5");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_LIVELLO5,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_OBIETTOPERAT, "OBIETTOPERAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_OBIETTOPERAT,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_OBIETTGESTIO, "OBIETTGESTIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_VARCOM11,IMDBDef15.PQSL_VARCOM11_OBIETTGESTIO,5,99,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_VARCOM11, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniSpesa(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniSpesa()
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
    FormIdx = MyGlb.FRM_VARIAZISPESA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FDE9F198-4A5F-4C57-91E6-1C9705A9B07E";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 948;
    DesignHeight = 486;
    set_Caption(new IDVariant("Variazioni Spesa"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 948;
    Frames[1].Height = 460;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.278261;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 948;
    Frames[2].Height = 128;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Elenco Variazioni";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 948;
    Frames[2].FixedHeight = 128;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_ELENCOVARIAZ = new IDPanel(w, this, 2, "PAN_ELENCOVARIAZ");
    Frames[2].Content = PAN_ELENCOVARIAZ;
    PAN_ELENCOVARIAZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOVARIAZ.VS = MainFrm.VisualStyleList;
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 948-MyGlb.PAN_OFFS_X, 128-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "94F2F104-2E69-4E83-8737-8D832152EDDF");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 452, 416, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOVARIAZ.InitStatus = 1;
    PAN_ELENCOVARIAZ_Init();
    PAN_ELENCOVARIAZ_InitFields();
    PAN_ELENCOVARIAZ_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 948;
    Frames[3].Height = 332;
    Frames[3].Caption = "Variazioni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 332;
    PAN_VARIAZIONI = new IDPanel(w, this, 3, "PAN_VARIAZIONI");
    Frames[3].Content = PAN_VARIAZIONI;
    PAN_VARIAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIONI.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 948-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BAB38701-D987-4803-BCCB-714EEFE153CA");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2532, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIONI.InitStatus = 1;
    PAN_VARIAZIONI_Init();
    PAN_VARIAZIONI_InitFields();
    PAN_VARIAZIONI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI532, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIAZISPESA_PARAMETRI513();
      }
      PAN_ELENCOVARIAZ.UpdatePanel(MainFrm);
      PAN_VARIAZIONI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_ELENCOVARIAZ.FrIndex)
    {
      if (IdxFieldActived ==PFL_ELENCOVARIAZ_APRISCELDELI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_ELENCOVARIAZ.FrIndex)
    {
      if (IdxFieldActived ==PFL_ELENCOVARIAZ_APRISCELPROP) {
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
    return (obj instanceof VariazioniSpesa);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniSpesa.class.getName() : (Glb.ClassWithPackage(VariazioniSpesa.class) ? VariazioniSpesa.class.getName().substring(VariazioniSpesa.class.getPackage().getName().length() + 1) : VariazioniSpesa.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Delibera
  // **********************************************************************
  public int ApriDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSpesa", "ApriDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Proposta
  // **********************************************************************
  public int ApriProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Proposta Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSpesa", "ApriProposta", _e);
      return -1;
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
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMEPARTE, 0).equals((new IDVariant("E")), true))
      {
        set_Caption(IDL.Add((new IDVariant("Variazioni di Entrata")), MainFrm.ESERCIZIO));
      }
      else
      {
        set_Caption(IDL.Add((new IDVariant("Variazioni di Spesa")), MainFrm.ESERCIZIO));
      }
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMTIPVAR, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMEVARIA, 0, (new IDVariant("P")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMSEDDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMNUMDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMANNDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMUNIPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMANNPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if (!(MainFrm.GESTIODELIBE.booleanValue()))
      {
        PAN_ELENCOVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_VARIAZIONI.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSpesa", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI513, IMDBDef15.PQSL_PARAMETRI513_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI513, IMDBDef15.PQSL_PARAMETRI513_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI513, IMDBDef15.PQSL_PARAMETRI513_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI513, IMDBDef15.PQSL_PARAMETRI513_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI513, IMDBDef15.PQSL_PARAMETRI513_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI513, IMDBDef15.PQSL_PARAMETRI513_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSpesa", "EndModalEvent", _e);
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
      MainFrm.ErrObj.ProcError ("VariazioniSpesa", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMEPARTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMTIPVAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMEVARIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMEESERC, 0, new IDVariant());
  }

  // **********************************************************************
  // Elenco Variazioni On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ELENCOVARIAZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Variazioni On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_ELENCOVARIAZ_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI513, IMDBDef15.PQSL_PARAMETRI513_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI513, IMDBDef15.PQSL_PARAMETRI513_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef15.PQRY_PARAMETRI513, IMDBDef15.PQSL_PARAMETRI513_ROWNAMSEDDEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_ELENCOVARIAZ_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI513, IMDBDef15.PQSL_PARAMETRI513_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI513, IMDBDef15.PQSL_PARAMETRI513_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef15.PQRY_PARAMETRI513, IMDBDef15.PQSL_PARAMETRI513_ROWNAMUNIPRO, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSpesa", "ElencoVariazioniOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Per Finanziamento Tipo Variazione Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_ELENCOVARIAZ_TIPOVARIAZIO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Per Finanziamento Tipo Variazione Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI513, IMDBDef15.PQSL_PARAMETRI513_ROWNAMTIPVAR, 0)))
      {
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI513, IMDBDef15.PQSL_PARAMETRI513_ROWNAMTIPVAR, 0, (new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSpesa", "VariazioniPerFinanziamentoTipoVariazioneValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZIONI);
      // 
      // Variazioni On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_DESCRIZIONE,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRIZIONE))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_DESCTIPOVARI,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCTIPOVARI))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSpesa", "VariazioniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VARIAZIONI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_VARIAZIONI.Freezed = (new IDVariant(-1)).booleanValue();
      }
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_VARIAZIONI.Freezed = (new IDVariant(0)).booleanValue();
        PAN_VARIAZIONI_InitQueries();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSpesa", "VariazioniOnCommand", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void VARIAZISPESA_PARAMETRI513() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI513_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI532, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI532, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI513_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI513_RS, 0, IMDBDef6.TBL_PARAMETRI532, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI513_RS, 0, 0, IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI513_RS, 1, 0, IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMTIPVAR, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI513_RS, 2, 0, IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI513_RS, 3, 0, IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI513_RS, 4, 0, IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI513_RS, 5, 0, IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI513_RS, 6, 0, IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI513_RS, 7, 0, IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI513_RS, 8, 0, IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI513_RS, 9, 0, IMDBDef6.TBL_PARAMETRI532, IMDBDef6.FLD_PARAMETRI532_ROWNAMEESERC, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI532, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI532, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI532, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI513_RS, 0);
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
  private void PAN_ELENCOVARIAZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCOVARIAZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCOVARIAZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCOVARIAZ, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCOVARIAZ_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ELENCOVARIAZ);
    // Stub
  }

  private void PAN_ELENCOVARIAZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENCOVARIAZ_APRISCELDELI)
    {
      this.IdxPanelActived = this.PAN_ELENCOVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOVARIAZ_APRISCELPROP)
    {
      this.IdxPanelActived = this.PAN_ELENCOVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENCOVARIAZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ELENCOVARIAZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_ELENCOVARIAZ_TIPOVARIAZIO)
      {
        PFL_ELENCOVARIAZ_TIPOVARIAZIO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCOVARIAZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCOVARIAZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VARIAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZIONI, Cancel);
    // Stub
  }

  private void PAN_VARIAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VARIAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCOVARIAZ_Init()
  {

    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, "16A1EF57-4278-4541-9B86-C678156E5972");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, "Variazioni");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 264, -9999, 80, 16, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 360, 7, 228, 49, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 0, 55);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, "87AEEA09-249C-4CBF-BBBE-210471FFAF7F");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, "Provvedimento");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, MyGlb.PANEL_LIST, 544, -9999, 272, 16, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, MyGlb.PANEL_FORM, 24, 63, 564, 49, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 0, 87);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, "7EA1AF1B-748F-4FC2-95CC-1FE879FC0592");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, "Variazioni");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, "E847110C-AD90-4C4D-B381-95E70896D09E");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.VIS_SFONEBORDTRA);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "222FB343-5149-485D-BFFD-0217316F6F34");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "Tipo Variazione");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, "BDFB2861-1984-438A-8133-237C7B8517D0");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, "Delibera");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, "CF2B11C2-245D-4AD0-8B84-0B36916F4BED");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, "-");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, "7D7DE8B8-2F51-41F3-9E37-C4FCA8EDBC30");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, "Numero Delibera");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, "F7027C40-8FAB-46AF-91C6-DEAE30024EC5");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, "/");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, "1E954178-4FAB-42FD-B28C-A20E4C23D092");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, "Anno Delibera");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, "BD8DF088-361C-4C2F-BE8D-064E2B10F5DE");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.VIS_STATICBUTTON);
    PAN_ELENCOVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, 0, "wsearch1.gif", false);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, "83F2045C-4BD1-46C9-831E-01C08C147A25");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, "Proposta");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, "A3CBF305-1D81-4876-A2F9-4F9202D86FE6");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, "-");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPO1, "D0C978E8-359B-4176-B0FB-FC96C982E5FE");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPO1, "Numero Proposta");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPO1, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPO1, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, "B8B46617-F4EA-4DFC-9641-4817A7943985");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, "/");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOST1, "67DDBC6C-CE4A-4523-9836-3438D5FEC852");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOST1, "Anno Proposta");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOST1, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOST1, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOST1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, "4917552D-573E-4991-8703-D632E81628DA");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_ELENCOVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, 0, "wsearch1.gif", false);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, "2139A3B7-AAA8-4F39-99C2-DEBBCEBDBE26");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.VIS_SFONEBORDTRA);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, "7A1E1B0E-5E74-4E77-8DD1-D5A9165BCB33");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, "Parte");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ESERCIZIO1, "D12A304A-A0C3-41C5-9FB2-CAF8EFA223CC");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ESERCIZIO1, "Esercizio");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ESERCIZIO1, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ESERCIZIO1, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ESERCIZIO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ELENCOVARIAZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 264, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 396, 32, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 128);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_VARIAZIONI, -1, GRP_ELENCOVARIAZ_VARIAZIONI);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_VARIAZIONI, PPQRY_PARAMETRI513, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 1, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_LIST, 172, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_FORM, 364, 36, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NEWPANELABE5, -1, GRP_ELENCOVARIAZ_VARIAZIONI);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NEWPANELABE5, -1, "", "NEWPANELABE5", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 224, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tp. Var.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 28, 36, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TIPOVARIAZIO, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TIPOVARIAZIO, PPQRY_PARAMETRI513, "A.ROWNAMTIPVAR", "ROWNAMTIPVAR", 1, 2, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 28, 88, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_DELIBERA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_DELIBERA, PPQRY_PARAMETRI513, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 128, 88, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TRATTIDELIBE, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, "N. Dl.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 148, 88, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NUMERODELIBE, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NUMERODELIBE, PPQRY_PARAMETRI513, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 5, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 164, 272, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 188, 88, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_BARRADELIBER, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 624, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, "A. Dl.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 208, 88, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 128);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ANNODELIBERA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ANNODELIBERA, PPQRY_PARAMETRI513, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_LIST, 508, 256, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_FORM, 248, 92, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_APRISCELDELI, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_APRISCELDELI, -1, "", "APRISCELDELI", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 664, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 272, 88, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_PROPOSTA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_PROPOSTA, PPQRY_PARAMETRI513, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 180, 288, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 448, 88, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TRATTIPROPOS, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPO1, MyGlb.PANEL_LIST, 736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPO1, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPO1, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPO1, MyGlb.PANEL_LIST, "N. Pr.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPO1, MyGlb.PANEL_FORM, 468, 88, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPO1, MyGlb.PANEL_FORM, 128);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPO1, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPO1, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NUMEROPROPO1, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NUMEROPROPO1, PPQRY_PARAMETRI513, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 508, 88, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_BARRAPROPOST, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOST1, MyGlb.PANEL_LIST, 776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOST1, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOST1, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOST1, MyGlb.PANEL_LIST, "A. Pr.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOST1, MyGlb.PANEL_FORM, 528, 88, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOST1, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOST1, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOST1, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ANNOPROPOST1, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ANNOPROPOST1, PPQRY_PARAMETRI513, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_LIST, 500, 248, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_FORM, 568, 92, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_APRISCELPROP, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_APRISCELPROP, -1, "", "APRISCELPROP", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_LIST, 596, 220, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_FORM, 576, 88, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ETICHETTASF, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ETICHETTASF, -1, "", "ETICHETTASF", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_LIST, 40);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_FORM, 4, 232, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_FORM, 40);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_PARTE, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_PARTE, PPQRY_PARAMETRI513, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 2, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ESERCIZIO1, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ESERCIZIO1, MyGlb.PANEL_LIST, "Esercizio");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ESERCIZIO1, MyGlb.PANEL_FORM, 64, 12, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ESERCIZIO1, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ESERCIZIO1, MyGlb.PANEL_FORM, "Esercizio");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ESERCIZIO1, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ESERCIZIO1, PPQRY_PARAMETRI513, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
  }

  private void PAN_ELENCOVARIAZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPVAR~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMTIPVAR~~ = -1) ");
    SQL.append("order by 1, 2 ");
    PAN_ELENCOVARIAZ.SetQuery(PPQRY_T54, 0, SQL, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1, 2 ");
    PAN_ELENCOVARIAZ.SetQuery(PPQRY_T54, 1, SQL, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "");
    PAN_ELENCOVARIAZ.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI, ");
    SQL.append("  A.ESERCIZIO as ESEFINDESCRI ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where (A.ESERCIZIO = ~~ROWNAMEESERC~~) ");
    SQL.append("and   (A.FASE_BILANCIO >= 0 AND A.FASE_BILANCIO <= 9) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_ELENCOVARIAZ.SetQuery(PPQRY_ESEFIN, 0, SQL, PFL_ELENCOVARIAZ_ESERCIZIO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI, ");
    SQL.append("  A.ESERCIZIO as ESEFINDESCRI ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where (A.FASE_BILANCIO >= 0 AND A.FASE_BILANCIO <= 9) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_ELENCOVARIAZ.SetQuery(PPQRY_ESEFIN, 1, SQL, PFL_ELENCOVARIAZ_ESERCIZIO1, "");
    PAN_ELENCOVARIAZ.SetQueryDB(PPQRY_ESEFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOVARIAZ.SetIMDB(IMDB, "PQRY_PARAMETRI513", true);
    PAN_ELENCOVARIAZ.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ELENCOVARIAZ.SetQueryIMDB(PPQRY_PARAMETRI513, IMDBDef15.PQRY_PARAMETRI513_RS, IMDBDef6.TBL_PARAMETRI532);
    JustLoaded = true;
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_VARIAZIONI, IMDBDef6.FLD_PARAMETRI532_ROWNAMEVARIA);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_TIPOVARIAZIO, IMDBDef6.FLD_PARAMETRI532_ROWNAMTIPVAR);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_DELIBERA, IMDBDef6.FLD_PARAMETRI532_ROWNAMSEDDEL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_NUMERODELIBE, IMDBDef6.FLD_PARAMETRI532_ROWNAMNUMDEL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_ANNODELIBERA, IMDBDef6.FLD_PARAMETRI532_ROWNAMANNDEL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_PROPOSTA, IMDBDef6.FLD_PARAMETRI532_ROWNAMUNIPRO);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_NUMEROPROPO1, IMDBDef6.FLD_PARAMETRI532_ROWNAMNUMPRO);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_ANNOPROPOST1, IMDBDef6.FLD_PARAMETRI532_ROWNAMANNPRO);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_PARTE, IMDBDef6.FLD_PARAMETRI532_ROWNAMEPARTE);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_ESERCIZIO1, IMDBDef6.FLD_PARAMETRI532_ROWNAMEESERC);
    PAN_ELENCOVARIAZ.SetMasterTable(0, "PARAMETRI532");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCOVARIAZ.Status() == 2)
    {
      int oldListQBE = PAN_ELENCOVARIAZ.iUseListQBE;
      PAN_ELENCOVARIAZ.iUseListQBE = 0;
      PAN_ELENCOVARIAZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCOVARIAZ.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCOVARIAZ.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VARIAZIONI_Init()
  {

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_FIELD, 24);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIO, "5806C1A3-1DB3-49C3-A809-5CAE71DFB72F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIO, "Esercizio");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, "EBB6292A-8CD8-4B4C-9583-2F12CF9A340C");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, "Codice");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "C93E0F43-993D-4626-9076-E3F1868F7009");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "Capitolo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "3E51D067-EDB3-4B6D-8801-06CDEC4E584D");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "Articolo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "D84DE28D-B1FC-49EF-825E-75AFC65B985F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "Descrizione Variazione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PURO, "8974EA33-624A-43DA-ABF5-3B0933276E81");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PURO, "Puro");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PURO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDAESIGI, "DE9A45DC-E0AE-4E84-AE4D-7096C7D95ED4");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDAESIGI, "Reiscr. da Esigibilità");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDAESIGI, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDAESIGI, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDAESIGI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDASTANZ, "C4015A57-FB9F-4FD6-9A8C-E3FCBB98A95F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDASTANZ, "Reiscr. da Stanziamento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDASTANZ, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDASTANZ, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDASTANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, "24227BF3-F65C-4B6D-9A05-21689CE40723");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, "Cassa");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAPROPONE, "50CAFDB5-BFD2-48ED-BA69-7D7579B043D8");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAPROPONE, "Unita Proponente");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAPROPONE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, "0E7C28F6-4BE0-4B9B-AF76-2020659BFCF3");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, "Numero Proposta");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, "485CA500-50E3-4823-BE38-583AD7C84F7F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, "Anno Proposta");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, "Brief description of field content.");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SEDEDEL, "99907143-E840-4234-87E1-0BD0F83CFA02");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SEDEDEL, "Sede Del");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SEDEDEL, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, "A5EA578C-AAEF-4F1B-9D8E-16FB42A4DFA8");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, "Numero Del");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, "CEC87DEB-6ADA-4C0F-9444-85799049EA59");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, "Anno Del");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODITIPOVARI, "62165DD6-3724-4E5D-B354-F0071E19DCBC");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODITIPOVARI, "Codice Tipo Variazione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODITIPOVARI, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODITIPOVARI, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODITIPOVARI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "2E2AE7CE-24B6-4350-B93F-51906F76A4CC");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "PROGRESSIVO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, "C5DAFC68-30F7-4ADB-8E09-31417598568B");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, "Descrizione Tipo Variazione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MISSIONE, "01C3B5FF-C0E5-45C1-A741-79396C38D749");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MISSIONE, "Missione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MISSIONE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MISSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MISSIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUTT, "7E71A1A3-4BAC-4727-8D6A-CDAB3047500C");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUTT, "Programma");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUTT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUTT, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUTT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO4, "5CC8FC57-8AAC-420B-9894-7653B1E9AC38");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO4, "Codice Livello 4");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO4, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO4, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO5, "EB519957-04FF-4E32-AC41-A07DCD912D99");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO5, "Codice Livello 5");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO5, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO5, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTOPERAT, "045572D3-81E6-4329-A213-4F6CF1B900BB");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTOPERAT, "Obiettivo Operativo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTOPERAT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTOPERAT, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTOPERAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTGESTIO, "04C8CBC6-76C5-4E93-BA56-06E7E14E26AE");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTGESTIO, "Obiettivo di Gestione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTGESTIO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTGESTIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTGESTIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIO, MyGlb.PANEL_FORM, 172, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ESERCIZIO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ESERCIZIO, PPQRY_VARCOM11, "A.ESERCIZIO", "VARCOMESERCI", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_LIST, 60, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_FORM, 4, 220, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CODICE, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_CODICE, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CODICE, PPQRY_VARCOM11, "A_GET_CODICE_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO)", "CODICE", 1, 19, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 120, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLO, PPQRY_VARCOM11, "A.CAPITOLO", "VARCOMCAPITO", 3, 16, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 240, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 220, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ARTICOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ARTICOLO, PPQRY_VARCOM11, "A.ARTICOLO", "VARCOMARTICO", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 292, 36, 224, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione Variazione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 296, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione Variazione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DESCRIZIONE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DESCRIZIONE, PPQRY_VARCOM11, "A.DESCRIZIONE", "VARCOMDESCRI", 5, 140, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PURO, MyGlb.PANEL_LIST, 516, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PURO, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PURO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PURO, MyGlb.PANEL_LIST, "Puro");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PURO, MyGlb.PANEL_FORM, 4, 220, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PURO, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PURO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PURO, MyGlb.PANEL_FORM, "Puro");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PURO, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_PURO, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PURO, PPQRY_VARCOM11, "CASE WHEN (A.REISCRIZIONE_DA_IMP IS NULL) AND (A.REISCRIZIONE_DA_STN IS NULL) THEN A.IMPORTO ELSE to_number(NULL) END", "PURO", 3, 28, 6, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDAESIGI, MyGlb.PANEL_LIST, 640, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDAESIGI, MyGlb.PANEL_LIST, 140);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDAESIGI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDAESIGI, MyGlb.PANEL_LIST, "Reiscr. da Esigibilità");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDAESIGI, MyGlb.PANEL_FORM, 4, 220, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDAESIGI, MyGlb.PANEL_FORM, 140);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDAESIGI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDAESIGI, MyGlb.PANEL_FORM, "Reiscr. da Esigibilità");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_REISCDAESIGI, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_REISCDAESIGI, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_REISCDAESIGI, PPQRY_VARCOM11, "CASE WHEN NOT ((A.REISCRIZIONE_DA_IMP IS NULL)) AND (A.REISCRIZIONE_DA_STN IS NULL) THEN A.IMPORTO ELSE to_number(NULL) END", "REISCDAESIGI", 3, 28, 6, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDASTANZ, MyGlb.PANEL_LIST, 764, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDASTANZ, MyGlb.PANEL_LIST, 136);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDASTANZ, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDASTANZ, MyGlb.PANEL_LIST, "Reiscr. da Stanziamento");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDASTANZ, MyGlb.PANEL_FORM, 4, 220, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDASTANZ, MyGlb.PANEL_FORM, 136);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDASTANZ, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_REISCDASTANZ, MyGlb.PANEL_FORM, "Reis. da Stanziamento");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_REISCDASTANZ, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_REISCDASTANZ, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_REISCDASTANZ, PPQRY_VARCOM11, "CASE WHEN (A.REISCRIZIONE_DA_IMP IS NULL) AND NOT ((A.REISCRIZIONE_DA_STN IS NULL)) THEN A.IMPORTO ELSE to_number(NULL) END", "REISCDASTANZ", 3, 28, 6, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_LIST, 888, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_LIST, 104);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_LIST, "Cassa");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_FORM, 4, 244, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_FORM, 104);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOCASSA, MyGlb.PANEL_FORM, "Cassa");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTOCASSA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTOCASSA, PPQRY_VARCOM11, "A.IMPORTO_CASSA", "VARCIMPOCASS", 3, 14, 2, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAPROPONE, MyGlb.PANEL_LIST, 1012, 36, 76, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAPROPONE, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAPROPONE, MyGlb.PANEL_LIST, "Unita Proponente");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 148, 432, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAPROPONE, MyGlb.PANEL_FORM, 136);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAPROPONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UNITAPROPONE, MyGlb.PANEL_FORM, "Unita Proponente");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_UNITAPROPONE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_UNITAPROPONE, PPQRY_VARCOM11, "A.UNITA_PROPONENTE", "VARCUNITPROP", 5, 8, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1088, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, "Numero Proposta");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 172, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 136);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMEROPROPOS, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMEROPROPOS, PPQRY_VARCOM11, "A.NUMERO_PROPOSTA", "VARCNUMEPROP", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1148, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 104);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Anno Proposta");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOPROPOSTA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOPROPOSTA, PPQRY_VARCOM11, "A.ANNO_PROPOSTA", "VARCANNOPROP", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 1208, 36, 68, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SEDEDEL, MyGlb.PANEL_LIST, "Sede Del");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 156, 52, 360, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SEDEDEL, MyGlb.PANEL_FORM, "Sede Del");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_SEDEDEL, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_SEDEDEL, PPQRY_VARCOM11, "A.SEDE_DEL", "VARCOSEDEDEL", 5, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 1276, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_LIST, "Numero Del");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 4, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_FORM, "Numero Del");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMERODEL, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMERODEL, PPQRY_VARCOM11, "A.NUMERO_DEL", "VARCONUMEDEL", 1, 6, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_LIST, 1328, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_LIST, "Anno Del");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_FORM, 356, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_FORM, "Anno Del");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNODEL, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNODEL, PPQRY_VARCOM11, "A.ANNO_DEL", "VARCOANNODEL", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODITIPOVARI, MyGlb.PANEL_LIST, 1368, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODITIPOVARI, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODITIPOVARI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODITIPOVARI, MyGlb.PANEL_LIST, "Codice Tipo Variazione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODITIPOVARI, MyGlb.PANEL_FORM, 308, 100, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODITIPOVARI, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODITIPOVARI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODITIPOVARI, MyGlb.PANEL_FORM, "Cod. Tp. Var.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CODITIPOVARI, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CODITIPOVARI, PPQRY_VARCOM11, "A.TIPO_VAR", "VARCODTIPVAR", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 508, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROGRESSIVO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGRESSIVO, PPQRY_VARCOM11, "A.PROGRESSIVO", "VARCVARIPROG", 3, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_LIST, 1440, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_LIST, "Descrizione Tipo Variazione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_FORM, 4, 196, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_FORM, "Desc. Tp. Var.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DESCTIPOVARI, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DESCTIPOVARI, PPQRY_VARCOM11, "C.DESCRIZIONE", "VARDESTIPVAR", 5, 40, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MISSIONE, MyGlb.PANEL_LIST, 1648, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MISSIONE, MyGlb.PANEL_LIST, 48);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MISSIONE, MyGlb.PANEL_LIST, "Missione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MISSIONE, MyGlb.PANEL_FORM, 4, 268, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MISSIONE, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_MISSIONE, MyGlb.PANEL_FORM, "Missione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_MISSIONE, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_MISSIONE, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_MISSIONE, PPQRY_VARCOM11, "SUBSTR(B.CODICE_STRUTTURA, 1, 2)", "MISSIONE", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUTT, MyGlb.PANEL_LIST, 1712, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUTT, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUTT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUTT, MyGlb.PANEL_LIST, "Programma");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUTT, MyGlb.PANEL_FORM, 4, 292, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUTT, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUTT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUTT, MyGlb.PANEL_FORM, "Programma");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CODICESTRUTT, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CODICESTRUTT, PPQRY_VARCOM11, "B.CODICE_STRUTTURA", "VARCAPCODSTR", 5, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO4, MyGlb.PANEL_LIST, 1788, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO4, MyGlb.PANEL_LIST, 52);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO4, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO4, MyGlb.PANEL_LIST, "Codice Livello 4");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO4, MyGlb.PANEL_FORM, 4, 316, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO4, MyGlb.PANEL_FORM, 52);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO4, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO4, MyGlb.PANEL_FORM, "Cd. Lv. 4");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_LIVELLO4, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_LIVELLO4, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_LIVELLO4, PPQRY_VARCOM11, "GET_COD_RICL_CAP(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO,'MACRO')", "LIVELLO4", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO5, MyGlb.PANEL_LIST, 1884, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO5, MyGlb.PANEL_LIST, 52);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO5, MyGlb.PANEL_LIST, "Codice Livello 5");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO5, MyGlb.PANEL_FORM, 4, 340, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO5, MyGlb.PANEL_FORM, 52);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LIVELLO5, MyGlb.PANEL_FORM, "Cd. Lv. 5");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_LIVELLO5, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_LIVELLO5, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_LIVELLO5, PPQRY_VARCOM11, "GET_COD_RICL_CAP(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO,'MACRO_5')", "LIVELLO5", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTOPERAT, MyGlb.PANEL_LIST, 1984, 36, 272, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTOPERAT, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTOPERAT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTOPERAT, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTOPERAT, MyGlb.PANEL_FORM, 4, 364, 628, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTOPERAT, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTOPERAT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTOPERAT, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_OBIETTOPERAT, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_OBIETTOPERAT, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_OBIETTOPERAT, PPQRY_VARCOM11, "DUP.GET_OBIETTIVO_OPERATIVO(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'NO')", "OBIETTOPERAT", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTGESTIO, MyGlb.PANEL_LIST, 2256, 36, 276, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTGESTIO, MyGlb.PANEL_LIST, 116);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTGESTIO, MyGlb.PANEL_LIST, "Obiettivo di Gestione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTGESTIO, MyGlb.PANEL_FORM, 4, 388, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTGESTIO, MyGlb.PANEL_FORM, 116);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OBIETTGESTIO, MyGlb.PANEL_FORM, "Obiet. di Gestione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_OBIETTGESTIO, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_OBIETTGESTIO, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_OBIETTGESTIO, PPQRY_VARCOM11, "DUP.GET_OBIETTIVO_GESTIONE(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'NO')", "OBIETTGESTIO", 5, 99, 0, -13997);
  }

  private void PAN_VARIAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VARIAZIONI.SetIMDB(IMDB, "PQRY_VARCOM11", true);
    PAN_VARIAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "VARCOM");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as VARCVARIPROG, ");
    SQL.append("  A.ESERCIZIO as VARCOMESERCI, ");
    SQL.append("  A.CAPITOLO as VARCOMCAPITO, ");
    SQL.append("  A.ARTICOLO as VARCOMARTICO, ");
    SQL.append("  A.ANNO_DEL as VARCOANNODEL, ");
    SQL.append("  A.NUMERO_DEL as VARCONUMEDEL, ");
    SQL.append("  A.SEDE_DEL as VARCOSEDEDEL, ");
    SQL.append("  A.DESCRIZIONE as VARCOMDESCRI, ");
    SQL.append("  A.TIPO_VAR as VARCODTIPVAR, ");
    SQL.append("  A.ANNO_PROPOSTA as VARCANNOPROP, ");
    SQL.append("  A.UNITA_PROPONENTE as VARCUNITPROP, ");
    SQL.append("  A.NUMERO_PROPOSTA as VARCNUMEPROP, ");
    SQL.append("  CASE WHEN (A.REISCRIZIONE_DA_IMP IS NULL) AND (A.REISCRIZIONE_DA_STN IS NULL) THEN A.IMPORTO ELSE to_number(NULL) END as PURO, ");
    SQL.append("  CASE WHEN NOT ((A.REISCRIZIONE_DA_IMP IS NULL)) AND (A.REISCRIZIONE_DA_STN IS NULL) THEN A.IMPORTO ELSE to_number(NULL) END as REISCDAESIGI, ");
    SQL.append("  CASE WHEN (A.REISCRIZIONE_DA_IMP IS NULL) AND NOT ((A.REISCRIZIONE_DA_STN IS NULL)) THEN A.IMPORTO ELSE to_number(NULL) END as REISCDASTANZ, ");
    SQL.append("  A.IMPORTO_CASSA as VARCIMPOCASS, ");
    SQL.append("  C.DESCRIZIONE as VARDESTIPVAR, ");
    SQL.append("  A_GET_CODICE_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) as CODICE, ");
    SQL.append("  SUBSTR(B.CODICE_STRUTTURA, 1, 2) as MISSIONE, ");
    SQL.append("  B.CODICE_STRUTTURA as VARCAPCODSTR, ");
    SQL.append("  GET_COD_RICL_CAP(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO,'MACRO') as LIVELLO4, ");
    SQL.append("  GET_COD_RICL_CAP(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO,'MACRO_5') as LIVELLO5, ");
    SQL.append("  DUP.GET_OBIETTIVO_OPERATIVO(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'NO') as OBIETTOPERAT, ");
    SQL.append("  DUP.GET_OBIETTIVO_GESTIONE(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO,TRUNC( SYSDATE ),'NO') as OBIETTGESTIO ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM11, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARIAZIONI A, ");
    SQL.append("  CAP B, ");
    SQL.append("  T54 C ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM11, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   (A.ESERCIZIO = ~~PQRY_PARAMETRI513.ROWNAMEESERC~~) ");
    SQL.append("and   ((A.TIPO_VAR = ~~PQRY_PARAMETRI513.ROWNAMTIPVAR~~) OR (~~PQRY_PARAMETRI513.ROWNAMTIPVAR~~ = -1)) ");
    SQL.append("and   (((A.SEDE_DEL = ~~PQRY_PARAMETRI513.ROWNAMSEDDEL~~) AND (A.NUMERO_DEL = ~~PQRY_PARAMETRI513.ROWNAMNUMDEL~~) AND (A.ANNO_DEL = ~~PQRY_PARAMETRI513.ROWNAMANNDEL~~)) OR (~~PQRY_PARAMETRI513.ROWNAMSEDDEL~~ IS NULL)) ");
    SQL.append("and   (A.TIPO = ~~PQRY_PARAMETRI513.ROWNAMEVARIA~~) ");
    SQL.append("and   (((A.UNITA_PROPONENTE = ~~PQRY_PARAMETRI513.ROWNAMUNIPRO~~) AND (A.NUMERO_PROPOSTA = ~~PQRY_PARAMETRI513.ROWNAMNUMPRO~~) AND (A.ANNO_PROPOSTA = ~~PQRY_PARAMETRI513.ROWNAMANNPRO~~)) OR (~~PQRY_PARAMETRI513.ROWNAMUNIPRO~~ IS NULL)) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI532.ROWNAMEPARTE~~) ");
    SQL.append("and   (A.TIPO_VAR = C.CODICE(+)) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM11, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM11, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM11, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 2, 18, 3, 4 ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM11, 5, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_VARCOM11, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(0, "VARIAZIONI");
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_ESERCIZIO, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_CODICE, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_CAPITOLO, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZIONI.iUseListQBE;
      PAN_VARIAZIONI.iUseListQBE = 0;
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_ValidateRow(Cancel);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_DynamicProperties();
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
