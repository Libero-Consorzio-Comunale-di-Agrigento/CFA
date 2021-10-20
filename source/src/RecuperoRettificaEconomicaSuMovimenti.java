// **********************************************
// Recupero Rettifica Economica Su Movimenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RecuperoRettificaEconomicaSuMovimenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_TIPOMOVIMENT = 0;
  private static int PFL_PARAMETRI_SOLMOVSENIMP = 1;
  private static int PFL_PARAMETRI_ETICSARAPOSS = 2;
  private static int PFL_PARAMETRI_ETISUIMOVCON = 3;
  private static int PFL_PARAMETRI_ETISUIMOVCO1 = 4;

  private static int PPQRY_IMDB5 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_RECRETECSUMO_TIPO = 0;
  private static int PFL_RECRETECSUMO_ESERCIZIO = 1;
  private static int PFL_RECRETECSUMO_CODICE = 2;
  private static int PFL_RECRETECSUMO_CODLIVELLO4 = 3;
  private static int PFL_RECRETECSUMO_CODLIVELLO5 = 4;
  private static int PFL_RECRETECSUMO_CAPITOLO = 5;
  private static int PFL_RECRETECSUMO_ARTICOLO = 6;
  private static int PFL_RECRETECSUMO_NUMEROIMPACC = 7;
  private static int PFL_RECRETECSUMO_ANNOIMPACC = 8;
  private static int PFL_RECRETECSUMO_DESCRIMPACC = 9;
  private static int PFL_RECRETECSUMO_NUMEROSUBIMP = 10;
  private static int PFL_RECRETECSUMO_ANNOSUBIMP = 11;
  private static int PFL_RECRETECSUMO_NUMEROLIQ = 12;
  private static int PFL_RECRETECSUMO_ANNOLIQ = 13;
  private static int PFL_RECRETECSUMO_DESCRLIQPRE = 14;
  private static int PFL_RECRETECSUMO_NUMEROMANORD = 15;
  private static int PFL_RECRETECSUMO_ANNOMANORD = 16;
  private static int PFL_RECRETECSUMO_SUBIMPDESCRI = 17;
  private static int PFL_RECRETECSUMO_BENEFICIARIO = 18;
  private static int PFL_RECRETECSUMO_RAGIONSOCIAL = 19;
  private static int PFL_RECRETECSUMO_FATTORE = 20;
  private static int PFL_RECRETECSUMO_DESCRIFATTOR = 21;
  private static int PFL_RECRETECSUMO_PIACONECOPAT = 22;
  private static int PFL_RECRETECSUMO_CONSTAECOPAT = 23;
  private static int PFL_RECRETECSUMO_COMPETENZDAL = 24;
  private static int PFL_RECRETECSUMO_COMPETENZAAL = 25;
  private static int PFL_RECRETECSUMO_CENTRO = 26;
  private static int PFL_RECRETECSUMO_DESCRICENTRO = 27;
  private static int PFL_RECRETECSUMO_RILEVANTEECO = 28;
  private static int PFL_RECRETECSUMO_ETICHEIMPEGN = 29;
  private static int PFL_RECRETECSUMO_ETICHESUBIMP = 30;
  private static int PFL_RECRETECSUMO_ETICHELIQUID = 31;
  private static int PFL_RECRETECSUMO_ETICHEMANDAT = 32;
  private static int PFL_RECRETECSUMO_NUOVCAMPSTAT = 33;

  private static int PPQRY_VISMOVRETIMP = 0;

  private static int PPQRY_DESCORDSUBIM = 1;


  IDPanel PAN_RECRETECSUMO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IMDB6(IMDB);
    //
    //
    Init_PQRY_IMDB5(IMDB);
    Init_PQRY_IMDB5_RS(IMDB);
    Init_PQRY_VISMOVRETIMP(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IMDB6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_IMDB6, 19);
    IMDB.set_TblCode(IMDBDef3.TBL_IMDB6, "TBL_IMDB6");
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGTIPMOV, "NOMOGGTIPMOV");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGTIPMOV,5,50,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOOGSOMOSEIM, "NOOGSOMOSEIM");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOOGSOMOSEIM,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGQUALIV, "NOMOGGQUALIV");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGQUALIV,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGQUILIV, "NOMOGGQUILIV");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGQUILIV,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMEOGGENUMR, "NOMEOGGENUMR");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMEOGGENUMR,1,9,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMEOGGECODI, "NOMEOGGECODI");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMEOGGECODI,5,20,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGANNIMP, "NOMOGGANNIMP");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGNUMIMP, "NOMOGGNUMIMP");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGANNSUB, "NOMOGGANNSUB");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGANNSUB,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGNUMSUB, "NOMOGGNUMSUB");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGANNLIQ, "NOMOGGANNLIQ");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGANNLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGNUMLIQ, "NOMOGGNUMLIQ");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGNUMLIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGANNMAN, "NOMOGGANNMAN");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGANNMAN,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGNUMMAN, "NOMOGGNUMMAN");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGNUMMAN,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMEOGGESELE, "NOMEOGGESELE");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMEOGGESELE,1,9,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMEOGGEFATT, "NOMEOGGEFATT");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMEOGGEFATT,5,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMEOGGECENT, "NOMEOGGECENT");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMEOGGECENT,5,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGCOMDAL, "NOMOGGCOMDAL");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMOGGCOMDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMEOGGCOMAL, "NOMEOGGCOMAL");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDB6,IMDBDef3.FLD_IMDB6_NOMEOGGCOMAL,6,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_IMDB6, 0);
  }

  private static void Init_PQRY_IMDB5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_IMDB5, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_IMDB5, "PQRY_IMDB5");
    IMDB.set_FldCode(IMDBDef11.PQRY_IMDB5,IMDBDef11.PQSL_IMDB5_NOOGSOMOSEIM, "NOOGSOMOSEIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_IMDB5,IMDBDef11.PQSL_IMDB5_NOOGSOMOSEIM,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_IMDB5,IMDBDef11.PQSL_IMDB5_NOMOGGTIPMOV, "NOMOGGTIPMOV");
    IMDB.SetFldParams(IMDBDef11.PQRY_IMDB5,IMDBDef11.PQSL_IMDB5_NOMOGGTIPMOV,5,50,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_IMDB5, 0);
  }

  private static void Init_PQRY_IMDB5_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_IMDB5_RS, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_IMDB5_RS, "PQRY_IMDB5_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_IMDB5_RS,IMDBDef11.PQSL_IMDB5_NOOGSOMOSEIM, "NOOGSOMOSEIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_IMDB5_RS,IMDBDef11.PQSL_IMDB5_NOOGSOMOSEIM,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_IMDB5_RS,IMDBDef11.PQSL_IMDB5_NOMOGGTIPMOV, "NOMOGGTIPMOV");
    IMDB.SetFldParams(IMDBDef11.PQRY_IMDB5_RS,IMDBDef11.PQSL_IMDB5_NOMOGGTIPMOV,5,50,0);
  }

  private static void Init_PQRY_VISMOVRETIMP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_VISMOVRETIMP, 28);
    IMDB.set_TblCode(IMDBDef11.PQRY_VISMOVRETIMP, "PQRY_VISMOVRETIMP");
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMTI, "VISMOVREIMTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMTI,12,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMES, "VISMOVREIMES");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMES,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMCO, "VISMOVREIMCO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMCO,5,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMCOL4, "VIMOREIMCOL4");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMCOL4,1,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMCOL5, "VIMOREIMCOL5");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMCOL5,1,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMCA, "VISMOVREIMCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMCA,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMAR, "VISMOVREIMAR");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMAR,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMANIM, "VIMOREIMANIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMANIM,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMNUIM, "VIMOREIMNUIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMNUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMDEIM, "VIMOREIMDEIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMDEIM,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMANSU, "VIMOREIMANSU");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMANSU,1,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMNUSU, "VIMOREIMNUSU");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMNUSU,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMANLI, "VIMOREIMANLI");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMANLI,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMNULI, "VIMOREIMNULI");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMNULI,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMDELI, "VIMOREIMDELI");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMDELI,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMANMA, "VIMOREIMANMA");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMANMA,1,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMNUMA, "VIMOREIMNUMA");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMBE, "VISMOVREIMBE");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMBE,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMRASO, "VIMOREIMRASO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMRASO,5,60,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMFA, "VISMOVREIMFA");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMFA,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMDEFA, "VIMOREIMDEFA");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMDEFA,5,255,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMPCEP, "VIMOREIMPCEP");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMPCEP,5,4000,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMCSEP, "VIMOREIMCSEP");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMCSEP,5,4000,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMCODA, "VIMOREIMCODA");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMCODA,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMCOAL, "VIMOREIMCOAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMCOAL,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMCE, "VISMOVREIMCE");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMCE,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMDECE, "VIMOREIMDECE");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMDECE,5,60,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMRIEC, "VIMOREIMRIEC");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVRETIMP,IMDBDef11.PQSL_VISMOVRETIMP_VIMOREIMRIEC,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_VISMOVRETIMP, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RecuperoRettificaEconomicaSuMovimenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public RecuperoRettificaEconomicaSuMovimenti()
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
    FormIdx = MyGlb.FRM_RECRETECSUMO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E07D3F0F-1A5A-4F3B-8736-8AC8E4830DE6";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 816;
    DesignHeight = 498;
    set_Caption(new IDVariant("Recupero/Rettifica Economica su Movimenti"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 816;
    Frames[1].Height = 472;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.228814;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 816;
    Frames[2].Height = 108;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 108;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 108-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "181B62F8-075E-447C-9ACB-D6C89370CD4C");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 40, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 816;
    Frames[3].Height = 364;
    Frames[3].Caption = "Recupero/Rettifica Economica su Movimenti";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 364;
    PAN_RECRETECSUMO = new IDPanel(w, this, 3, "PAN_RECRETECSUMO");
    Frames[3].Content = PAN_RECRETECSUMO;
    PAN_RECRETECSUMO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RECRETECSUMO.VS = MainFrm.VisualStyleList;
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8BFA2657-A408-4E7B-A570-DBF8EE0B0E2F");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 16, 0, 3048, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RECRETECSUMO.InitStatus = 2;
    PAN_RECRETECSUMO_Init();
    PAN_RECRETECSUMO_InitFields();
    PAN_RECRETECSUMO_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZAGG15+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG149+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGG15+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ASSOIMPUECON+BaseCmdLinIdx)
      {
        AssociaImputazioniEconomiche();
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
      if (IMDB.TblModified(IMDBDef3.TBL_IMDB6, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RECRETECSUMO_IMDB5();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_RECRETECSUMO.UpdatePanel(MainFrm);
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
    return (obj instanceof RecuperoRettificaEconomicaSuMovimenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RecuperoRettificaEconomicaSuMovimenti.class.getName() : (Glb.ClassWithPackage(RecuperoRettificaEconomicaSuMovimenti.class) ? RecuperoRettificaEconomicaSuMovimenti.class.getName().substring(RecuperoRettificaEconomicaSuMovimenti.class.getPackage().getName().length() + 1) : RecuperoRettificaEconomicaSuMovimenti.class.getName()));
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
      LOAD_IMDBDELETE();
      IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOOGSOMOSEIM, 0, (new IDVariant("SI")));
      PAN_RECRETECSUMO.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_RECRETECSUMO.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_RECRETECSUMO.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(2)), true)!=0)
      {
        PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRICENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RecuperoRettificaEconomicaSuMovimenti", "Load", _e);
    }
  }

  // **********************************************************************
  // IMDB: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_IMDBDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGTIPMOV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOOGSOMOSEIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGQUALIV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGQUILIV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGENUMR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECODI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNLIQ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMLIQ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNMAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMMAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGESELE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGEFATT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECENT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGCOMDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGCOMAL, 0, new IDVariant());
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
      UNLOAD_IMDBDELETE();
      IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGESELE, 0, (new IDVariant(0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RecuperoRettificaEconomicaSuMovimenti", "Unload", _e);
    }
  }

  // **********************************************************************
  // IMDB: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDBDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGTIPMOV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOOGSOMOSEIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGQUALIV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGQUILIV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGENUMR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECODI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNLIQ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMLIQ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNMAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMMAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGESELE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGEFATT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECENT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGCOMDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGCOMAL, 0, new IDVariant());
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
      // if (Result.booleanValue())
      // {
        // if (LookupForm.equals((new IDVariant(MyGlb.FRM_ASSOIMPUECON)), true))
        // {
          // IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGEFATT, 0, IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGEFATT, 0));
          // IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECENT, 0, IDL.NullValue(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGCEDICO, 0),IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGECENT, 0)));
          // IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGCOMDAL, 0, IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMOGGCOMDAL, 0));
          // IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGCOMAL, 0, IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGCOMAL, 0));
          // EtichettaElabora();
        // }
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RecuperoRettificaEconomicaSuMovimenti", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Recupero/Rettifica Economica su Movimenti On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RECRETECSUMO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_RECRETECSUMO);
      // 
      // Recupero/Rettifica Economica su Movimenti On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_RECRETECSUMO.set_ToolTip(Glb.OBJ_FIELD,PFL_RECRETECSUMO_DESCRIMPACC,(new IDVariant(PAN_RECRETECSUMO.FieldText(PFL_RECRETECSUMO_DESCRIMPACC))).stringValue()); 
      PAN_RECRETECSUMO.set_ToolTip(Glb.OBJ_FIELD,PFL_RECRETECSUMO_DESCRLIQPRE,(new IDVariant(PAN_RECRETECSUMO.FieldText(PFL_RECRETECSUMO_DESCRLIQPRE))).stringValue()); 
      PAN_RECRETECSUMO.set_ToolTip(Glb.OBJ_FIELD,PFL_RECRETECSUMO_RAGIONSOCIAL,(new IDVariant(PAN_RECRETECSUMO.FieldText(PFL_RECRETECSUMO_RAGIONSOCIAL))).stringValue()); 
      PAN_RECRETECSUMO.set_ToolTip(Glb.OBJ_FIELD,PFL_RECRETECSUMO_DESCRIFATTOR,(new IDVariant(PAN_RECRETECSUMO.FieldText(PFL_RECRETECSUMO_DESCRIFATTOR))).stringValue()); 
      PAN_RECRETECSUMO.set_ToolTip(Glb.OBJ_FIELD,PFL_RECRETECSUMO_PIACONECOPAT,(new IDVariant(PAN_RECRETECSUMO.FieldText(PFL_RECRETECSUMO_PIACONECOPAT))).stringValue()); 
      PAN_RECRETECSUMO.set_ToolTip(Glb.OBJ_FIELD,PFL_RECRETECSUMO_CONSTAECOPAT,(new IDVariant(PAN_RECRETECSUMO.FieldText(PFL_RECRETECSUMO_CONSTAECOPAT))).stringValue()); 
      PAN_RECRETECSUMO.set_ToolTip(Glb.OBJ_FIELD,PFL_RECRETECSUMO_DESCRICENTRO,(new IDVariant(PAN_RECRETECSUMO.FieldText(PFL_RECRETECSUMO_DESCRICENTRO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RecuperoRettificaEconomicaSuMovimenti", "Recupero/RettificaEconomicasuMovimentiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Recupero/Rettifica Economica su Movimenti After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_RECRETECSUMO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Recupero/Rettifica Economica su Movimenti After Find Body
      // Corpo Procedura
      // 
      PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      if (IMDB.Value(IMDBDef11.PQRY_VISMOVRETIMP, IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMTI, 0).equals((new IDVariant("A")), true) || IMDB.Value(IMDBDef11.PQRY_VISMOVRETIMP, IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMTI, 0).equals((new IDVariant("O")), true))
      {
        PAN_RECRETECSUMO.set_FieldText(PFL_RECRETECSUMO_ETICHEIMPEGN, (new IDVariant("Accertamento")).stringValue());
        PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHESUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RECRETECSUMO.set_FieldText(PFL_RECRETECSUMO_ETICHEMANDAT, (new IDVariant("Ordinativo")).stringValue());
        PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (IMDB.Value(IMDBDef11.PQRY_VISMOVRETIMP, IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMTI, 0).equals((new IDVariant("A")), true))
        {
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RECRETECSUMO.set_FieldText(PFL_RECRETECSUMO_ETICHEIMPEGN, (new IDVariant("Impegno")).stringValue());
        PAN_RECRETECSUMO.set_FieldText(PFL_RECRETECSUMO_ETICHEMANDAT, (new IDVariant("Mandato")).stringValue());
        if (IMDB.Value(IMDBDef11.PQRY_VISMOVRETIMP, IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMTI, 0).equals((new IDVariant("I")), true))
        {
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHESUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else if (IMDB.Value(IMDBDef11.PQRY_VISMOVRETIMP, IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMTI, 0).equals((new IDVariant("S")), true))
        {
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHESUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else if (IMDB.Value(IMDBDef11.PQRY_VISMOVRETIMP, IMDBDef11.PQSL_VISMOVRETIMP_VISMOVREIMTI, 0).equals((new IDVariant("L")), true))
        {
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if ((PAN_RECRETECSUMO.bFields(PFL_RECRETECSUMO_ETICHELIQUID).IsVisible(PAN_RECRETECSUMO.AttR) && PAN_RECRETECSUMO.bFields(PFL_RECRETECSUMO_ETICHELIQUID).IsPresent()))
      {
        PAN_RECRETECSUMO.set_ObjRect(Glb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_RECRETECSUMO.ObjRect(Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      }
      if ((PAN_RECRETECSUMO.bFields(PFL_RECRETECSUMO_ETICHEMANDAT).IsVisible(PAN_RECRETECSUMO.AttR) && PAN_RECRETECSUMO.bFields(PFL_RECRETECSUMO_ETICHEMANDAT).IsPresent()))
      {
        PAN_RECRETECSUMO.set_ObjRect(Glb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_RECRETECSUMO.ObjRect(Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGENUMR, 0))))
      {
        Riseleziona();
      }
      if ((!(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGQUALIV, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGQUILIV, 0)))))
      {
        PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUOVCAMPSTAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_RECRETECSUMO.SetFlags (Glb.OBJ_FIELD, PFL_RECRETECSUMO_NUOVCAMPSTAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RecuperoRettificaEconomicaSuMovimenti", "Recupero/RettificaEconomicasuMovimentiAfterFind", _e);
    }
  }

  // **********************************************************************
  // Recupero/Rettifica Economica su Movimenti On Change Selection
  // Evento notificato dal pannello quando in un pannello
  // con multi-selezione le righe selezionate cambiano.
  // Selected - Input
  // Final - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_RECRETECSUMO_OnChangeSelection(IDVariant Selected, IDVariant Final, IDVariant Cancel)
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
      // Recupero/Rettifica Economica su Movimenti On Change Selection Body
      // Corpo Procedura
      // 
      if (Final.booleanValue())
      {
        IDVariant I = null;
        I = (new IDVariant(1));
        IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
        C3 = PAN_RECRETECSUMO.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_RECRETECSUMO.GotoFirst();
        while (!PAN_RECRETECSUMO.RSEOF())
        {
          if (PAN_RECRETECSUMO.IsRowSelected(I.intValue()))
          {
            v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
            IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGQUALIV, 0, new IDVariant(C3.Get("VIMOREIMCOL4")));
            IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGQUILIV, 0, new IDVariant(C3.Get("VIMOREIMCOL5")));
            IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGENUMR, 0, new IDVariant(I));
            IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECODI, 0, new IDVariant(C3.Get("VISMOVREIMCO")));
            IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNIMP, 0, new IDVariant(C3.Get("VIMOREIMANIM")));
            IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMIMP, 0, new IDVariant(C3.Get("VIMOREIMNUIM")));
            IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNSUB, 0, new IDVariant(C3.Get("VIMOREIMANSU")));
            IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMSUB, 0, new IDVariant(C3.Get("VIMOREIMNUSU")));
            IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNLIQ, 0, new IDVariant(C3.Get("VIMOREIMANLI")));
            IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMLIQ, 0, new IDVariant(C3.Get("VIMOREIMNULI")));
            IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNMAN, 0, new IDVariant(C3.Get("VIMOREIMANMA")));
            IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMMAN, 0, new IDVariant(C3.Get("VIMOREIMNUMA")));
            return;
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_RECRETECSUMO.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
        if (v_COUNT.equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGQUALIV, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGQUILIV, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGENUMR, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECODI, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNIMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMIMP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNSUB, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMSUB, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNLIQ, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMLIQ, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNMAN, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMMAN, 0, (new IDVariant()));
        }
        IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGESELE, 0, new IDVariant(v_COUNT));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RecuperoRettificaEconomicaSuMovimenti", "Recupero/RettificaEconomicasuMovimentiOnChangeSelection", _e);
    }
  }

  // **********************************************************************
  // Riseleziona
  // **********************************************************************
  public int Riseleziona ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Riseleziona Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      C2 = PAN_RECRETECSUMO.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_RECRETECSUMO.GotoFirst();
      while (!PAN_RECRETECSUMO.RSEOF())
      {
        if (C2.Get("VISMOVREIMCO").equals(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECODI, 0), true) && C2.Get("VIMOREIMANIM").equals(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNIMP, 0), true) && C2.Get("VIMOREIMNUIM").equals(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMIMP, 0), true) && IDL.NullValue(C2.Get("VIMOREIMANSU"),(new IDVariant(-1))).equals(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNSUB, 0),(new IDVariant(-1))), true) && IDL.NullValue(C2.Get("VIMOREIMNUSU"),(new IDVariant(-1))).equals(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMSUB, 0),(new IDVariant(-1))), true) && IDL.NullValue(C2.Get("VIMOREIMANLI"),(new IDVariant(-1))).equals(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNLIQ, 0),(new IDVariant(-1))), true) && IDL.NullValue(C2.Get("VIMOREIMNULI"),(new IDVariant(-1))).equals(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMLIQ, 0),(new IDVariant(-1))), true) && IDL.NullValue(C2.Get("VIMOREIMANMA"),(new IDVariant(-1))).equals(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGANNMAN, 0),(new IDVariant(-1))), true) && IDL.NullValue(C2.Get("VIMOREIMNUMA"),(new IDVariant(-1))).equals(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGNUMMAN, 0),(new IDVariant(-1))), true))
        {
          PAN_RECRETECSUMO.SetRowSelected((new IDVariant(-1)).booleanValue(), I.intValue()); 
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_RECRETECSUMO.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RecuperoRettificaEconomicaSuMovimenti", "Riseleziona", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public boolean EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      MainFrm.Cf4armDBObject.BeginTrans();
      C2 = PAN_RECRETECSUMO.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_RECRETECSUMO.GotoFirst();
      while (!PAN_RECRETECSUMO.RSEOF())
      {
        if (PAN_RECRETECSUMO.IsRowSelected(I.intValue()))
        {
          v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
          try
          {
            switch (1) // Allows the use of BREAK inside ifs
            {
              default:
              if (IMDB.Value(IMDBDef11.PQRY_IMDB5, IMDBDef11.PQSL_IMDB5_NOMOGGTIPMOV, 0).equals((new IDVariant("A"))))	
              {
                SQL = new StringBuffer();
                SQL.append("update ACC set ");
                SQL.append("  RILEVANTE_ECO = 'SI', ");
                SQL.append("  FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGEFATT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  CENTRO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECENT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  COMPETENZA_DAL = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGCOMDAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  COMPETENZA_AL = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGCOMAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append("where (ANNO_ACC = " + IDL.CSql(C2.Get("VIMOREIMANIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (NUMERO_ACC = " + IDL.CSql(C2.Get("VIMOREIMNUIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              else if (IMDB.Value(IMDBDef11.PQRY_IMDB5, IMDBDef11.PQSL_IMDB5_NOMOGGTIPMOV, 0).equals((new IDVariant("O"))))	
              {
                IDVariant v_VPREIMPORTO = new IDVariant(0,IDVariant.DECIMAL);
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  A.IMPORTO as PREIMPORTO ");
                SQL.append("from ");
                SQL.append("  PRE A ");
                SQL.append("where (A.ANNO_PRE = " + IDL.CSql(C2.Get("VIMOREIMANLI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.NUMERO_PRE = " + IDL.CSql(C2.Get("VIMOREIMNULI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_VPREIMPORTO = QV.Get("PREIMPORTO", IDVariant.DECIMAL) ;
                }
                QV.Close();
                IDVariant v_VIMPECOPROGR = new IDVariant(0,IDVariant.DECIMAL);
                v_VIMPECOPROGR = (new IDVariant());
                // 
                // da esercizio a anno_liq Redmine #15505 qui e sotto
                // 
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  A.PROGRESSIVO as IMPECOPROGRE ");
                SQL.append("from ");
                SQL.append("  IMP_ECO A ");
                SQL.append("where (A.ESERCIZIO = " + IDL.CSql(C2.Get("VIMOREIMANLI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.ANNO_PRE = " + IDL.CSql(C2.Get("VIMOREIMANLI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.NUMERO_PRE = " + IDL.CSql(C2.Get("VIMOREIMNULI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_VIMPECOPROGR = QV.Get("IMPECOPROGRE", IDVariant.DECIMAL) ;
                }
                QV.Close();
                if (IDL.IsNull(v_VIMPECOPROGR))
                {
                  SQL = new StringBuffer();
                  SQL.append("insert into IMP_ECO ");
                  SQL.append("( ");
                  SQL.append("  ESERCIZIO, ");
                  SQL.append("  PROGRESSIVO, ");
                  SQL.append("  ANNO_PRE, ");
                  SQL.append("  NUMERO_PRE, ");
                  SQL.append("  FATTORE, ");
                  SQL.append("  CENTRO, ");
                  SQL.append("  COMPETENZA_DAL, ");
                  SQL.append("  COMPETENZA_AL, ");
                  SQL.append("  IMPORTO ");
                  SQL.append(") ");
                  SQL.append("values ");
                  SQL.append("( ");
                  SQL.append("  " + IDL.CSql(C2.Get("VIMOREIMANLI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  to_number(NULL), ");
                  SQL.append("  " + IDL.CSql(C2.Get("VIMOREIMANLI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(C2.Get("VIMOREIMNULI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGEFATT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECENT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGCOMDAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGCOMAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(v_VPREIMPORTO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                  SQL.append(") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
                else
                {
                  SQL = new StringBuffer();
                  SQL.append("update IMP_ECO set ");
                  SQL.append("  FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGEFATT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  CENTRO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECENT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  COMPETENZA_DAL = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGCOMDAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  COMPETENZA_AL = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGCOMAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ");
                  SQL.append("where (PROGRESSIVO = " + IDL.CSql(v_VIMPECOPROGR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
              }
              else if (IMDB.Value(IMDBDef11.PQRY_IMDB5, IMDBDef11.PQSL_IMDB5_NOMOGGTIPMOV, 0).equals((new IDVariant("I"))))	
              {
                SQL = new StringBuffer();
                SQL.append("update IMP set ");
                SQL.append("  RILEVANTE_ECO = 'SI', ");
                SQL.append("  FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGEFATT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  CENTRO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECENT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  COMPETENZA_DAL = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGCOMDAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  COMPETENZA_AL = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGCOMAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append("where (ANNO_IMP = " + IDL.CSql(C2.Get("VIMOREIMANIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (NUMERO_IMP = " + IDL.CSql(C2.Get("VIMOREIMNUIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              else if (IMDB.Value(IMDBDef11.PQRY_IMDB5, IMDBDef11.PQSL_IMDB5_NOMOGGTIPMOV, 0).equals((new IDVariant("S"))))	
              {
                SQL = new StringBuffer();
                SQL.append("update SUBIMP set ");
                SQL.append("  RILEVANTE_ECO = 'SI', ");
                SQL.append("  FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGEFATT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  CENTRO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECENT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  COMPETENZA_DAL = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGCOMDAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  COMPETENZA_AL = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGCOMAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append("where (ANNO_SUBIMP = " + IDL.CSql(C2.Get("VIMOREIMANSU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (NUMERO_SUBIMP = " + IDL.CSql(C2.Get("VIMOREIMNUSU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              else if (IMDB.Value(IMDBDef11.PQRY_IMDB5, IMDBDef11.PQSL_IMDB5_NOMOGGTIPMOV, 0).equals((new IDVariant("L"))))	
              {
                IDVariant v_VLIQIMPORTO = new IDVariant(0,IDVariant.DECIMAL);
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  A.IMPORTO as LIQIMPORTO ");
                SQL.append("from ");
                SQL.append("  LIQ A ");
                SQL.append("where (A.ANNO_LIQ = " + IDL.CSql(C2.Get("VIMOREIMANLI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.NUMERO_LIQ = " + IDL.CSql(C2.Get("VIMOREIMNULI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_VLIQIMPORTO = QV.Get("LIQIMPORTO", IDVariant.DECIMAL) ;
                }
                QV.Close();
                IDVariant v_VIMPECOPROGR = new IDVariant(0,IDVariant.DECIMAL);
                v_VIMPECOPROGR = (new IDVariant());
                // 
                // da esercizio a anno_liq Redmine #15505 qui e sotto
                // 
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  A.PROGRESSIVO as IMPECOPROGRE ");
                SQL.append("from ");
                SQL.append("  IMP_ECO A ");
                SQL.append("where (A.ESERCIZIO = " + IDL.CSql(C2.Get("VIMOREIMANLI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.ANNO_LIQ = " + IDL.CSql(C2.Get("VIMOREIMANLI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.NUMERO_LIQ = " + IDL.CSql(C2.Get("VIMOREIMNULI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_VIMPECOPROGR = QV.Get("IMPECOPROGRE", IDVariant.DECIMAL) ;
                }
                QV.Close();
                if (IDL.IsNull(v_VIMPECOPROGR))
                {
                  SQL = new StringBuffer();
                  SQL.append("insert into IMP_ECO ");
                  SQL.append("( ");
                  SQL.append("  ESERCIZIO, ");
                  SQL.append("  PROGRESSIVO, ");
                  SQL.append("  ANNO_LIQ, ");
                  SQL.append("  NUMERO_LIQ, ");
                  SQL.append("  FATTORE, ");
                  SQL.append("  CENTRO, ");
                  SQL.append("  COMPETENZA_DAL, ");
                  SQL.append("  COMPETENZA_AL, ");
                  SQL.append("  IMPORTO ");
                  SQL.append(") ");
                  SQL.append("values ");
                  SQL.append("( ");
                  SQL.append("  " + IDL.CSql(C2.Get("VIMOREIMANLI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  to_number(NULL), ");
                  SQL.append("  " + IDL.CSql(C2.Get("VIMOREIMANLI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(C2.Get("VIMOREIMNULI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGEFATT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECENT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGCOMDAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGCOMAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  " + IDL.CSql(v_VLIQIMPORTO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                  SQL.append(") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
                else
                {
                  SQL = new StringBuffer();
                  SQL.append("update IMP_ECO set ");
                  SQL.append("  FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGEFATT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  CENTRO = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECENT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  COMPETENZA_DAL = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGCOMDAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  COMPETENZA_AL = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGCOMAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ");
                  SQL.append("where (PROGRESSIVO = " + IDL.CSql(v_VIMPECOPROGR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
              }
              break;
            }
          }
          catch (Exception e15)
          {
            MainFrm.set_AlertMessage(new IDVariant(e15.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return (new IDVariant(0)).booleanValue();
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_RECRETECSUMO.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      MainFrm.Cf4armDBObject.CommitTrans();
      if (v_COUNT.equals((new IDVariant(0)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Nessun Record Selezionato"));
        MainFrm.set_AlertMessage(S); 
        return (new IDVariant(0)).booleanValue();
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
        IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGQUALIV, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGQUILIV, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGENUMR, 0, (new IDVariant()));
        PAN_RECRETECSUMO.PanelCommand(Glb.PCM_REQUERY);
        return (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RecuperoRettificaEconomicaSuMovimenti", "EtichettaElabora", _e);
      return false;
    }
  }

  // **********************************************************************
  // Associa Imputazioni Economiche
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AssociaImputazioniEconomiche ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Associa Imputazioni Economiche Body
      // Corpo Procedura
      // 
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_VQUARTO = null;
      v_VQUARTO = (new IDVariant());
      IDVariant v_VQUINTO = null;
      v_VQUINTO = (new IDVariant());
      C2 = PAN_RECRETECSUMO.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_RECRETECSUMO.GotoFirst();
      while (!PAN_RECRETECSUMO.RSEOF())
      {
        if (PAN_RECRETECSUMO.IsRowSelected(I.intValue()))
        {
          v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
          v_VQUARTO = new IDVariant(C2.Get("VIMOREIMCOL4"));
          v_VQUINTO = new IDVariant(C2.Get("VIMOREIMCOL5"));
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_RECRETECSUMO.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (v_COUNT.equals((new IDVariant(0)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Nessun record selezionato"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGEFATT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECENT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGCOMDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGCOMAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGQUALIV, 0, IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGQUALIV, 0));
      IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGQUILIV, 0, IMDB.Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGQUILIV, 0));
      if (IMDB.Value(IMDBDef11.PQRY_IMDB5, IMDBDef11.PQSL_IMDB5_NOMOGGTIPMOV, 0).equals((new IDVariant("A")), true) || IMDB.Value(IMDBDef11.PQRY_IMDB5, IMDBDef11.PQSL_IMDB5_NOMOGGTIPMOV, 0).equals((new IDVariant("O")), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGETTES, 0, (new IDVariant("E")));
      }
      else
      {
        IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGETTES, 0, (new IDVariant("S")));
      }
      MainFrm.Show(MyGlb.FRM_ASSOIMPUECON, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RecuperoRettificaEconomicaSuMovimenti", "AssociaImputazioniEconomiche", _e);
      return -1;
    }
  }

  // **********************************************************************
  // IMDB
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void RECRETECSUMO_IMDB5() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_IMDB5_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_IMDB6, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_IMDB6, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_IMDB5_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_IMDB5_RS, 0, IMDBDef3.TBL_IMDB6, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_IMDB5_RS, 0, 0, IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOOGSOMOSEIM, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_IMDB5_RS, 1, 0, IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGTIPMOV, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_IMDB6, 0);
      if (IMDB.Eof(IMDBDef3.TBL_IMDB6, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_IMDB6, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_IMDB5_RS, 0);
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
  private void PAN_RECRETECSUMO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RECRETECSUMO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RECRETECSUMO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RECRETECSUMO, Cancel);
    // Stub
  }

  private void PAN_RECRETECSUMO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_RECRETECSUMO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_RECRETECSUMO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RECRETECSUMO_IntValidateRow(Cancel);
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOMOVIMENT, "439800C0-84C4-428E-9ED6-4155A4FACB24");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOMOVIMENT, "Tipo Movimento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOMOVIMENT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOMOVIMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOMOVIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLMOVSENIMP, "68A2EDCC-36B9-4821-AD28-136F2B35ABCC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLMOVSENIMP, "Solo movimenti senza Imputazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLMOVSENIMP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLMOVSENIMP, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLMOVSENIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSARAPOSS, "A9B8651F-E9D5-45C4-A621-9A20405D1179");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSARAPOSS, "Sarà possibile indicare su tutti i movimenti selezionati la stessa imputazione economica.\nLa multiselezione è ammessa:");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSARAPOSS, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSARAPOSS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCON, "07CAD9C8-0266-4BB6-A02B-A09978C91DB2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCON, "°sui movimenti con uguale cod. Livello IV e cod. Livello V non indicato\n");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCON, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCON, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCO1, "D31E3E58-7940-4A2E-8E6F-A841EC255D7F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCO1, "°sui movimenti con uguale cod. Livello V");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCO1, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOMOVIMENT, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOMOVIMENT, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOMOVIMENT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOMOVIMENT, MyGlb.PANEL_LIST, "Tipo Movimento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOMOVIMENT, MyGlb.PANEL_FORM, 116, 16, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOMOVIMENT, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOMOVIMENT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOMOVIMENT, MyGlb.PANEL_FORM, "Tipo Movimento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOMOVIMENT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOMOVIMENT, PPQRY_IMDB5, "A.NOMOGGTIPMOV", "NOMOGGTIPMOV", 5, 50, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOMOVIMENT, (new IDVariant("A")), "Accertamenti", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOMOVIMENT, (new IDVariant("O")), "Ordinativi", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOMOVIMENT, (new IDVariant("I")), "Impegni", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOMOVIMENT, (new IDVariant("S")), "SubImpegni", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOMOVIMENT, (new IDVariant("L")), "Liquidazioni", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLMOVSENIMP, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLMOVSENIMP, MyGlb.PANEL_LIST, 208);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLMOVSENIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLMOVSENIMP, MyGlb.PANEL_LIST, "S. mv. s. Im.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLMOVSENIMP, MyGlb.PANEL_FORM, 8, 40, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLMOVSENIMP, MyGlb.PANEL_FORM, 208);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLMOVSENIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLMOVSENIMP, MyGlb.PANEL_FORM, "Solo movimenti senza Imputazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLMOVSENIMP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLMOVSENIMP, PPQRY_IMDB5, "A.NOOGSOMOSEIM", "NOOGSOMOSEIM", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLMOVSENIMP, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLMOVSENIMP, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSARAPOSS, MyGlb.PANEL_LIST, 340, 20, 296, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSARAPOSS, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSARAPOSS, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSARAPOSS, MyGlb.PANEL_FORM, 340, 20, 296, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSARAPOSS, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICSARAPOSS, MyGlb.PANEL_FORM, 3);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICSARAPOSS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICSARAPOSS, -1, "", "ETICSARAPOSS", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCON, MyGlb.PANEL_LIST, 368, 68, 300, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCON, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCON, MyGlb.PANEL_FORM, 368, 80, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETISUIMOVCON, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETISUIMOVCON, -1, "", "ETISUIMOVCON", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCO1, MyGlb.PANEL_LIST, 376, 76, 300, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCO1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCO1, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCO1, MyGlb.PANEL_FORM, 368, 64, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCO1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETISUIMOVCO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETISUIMOVCO1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETISUIMOVCO1, -1, "", "ETISUIMOVCO1", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_IMDB5", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_IMDB5, IMDBDef11.PQRY_IMDB5_RS, IMDBDef3.TBL_IMDB6);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOMOVIMENT, IMDBDef3.FLD_IMDB6_NOMOGGTIPMOV);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLMOVSENIMP, IMDBDef3.FLD_IMDB6_NOOGSOMOSEIM);
    PAN_PARAMETRI.SetMasterTable(0, "IMDB6");
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

  private void PAN_RECRETECSUMO_Init()
  {

    PAN_RECRETECSUMO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RECRETECSUMO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_RECRETECSUMO.SetSize(MyGlb.OBJ_FIELD, 34);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_TIPO, "CC12F574-9E0B-48EC-B9EA-FB4DD7A89F97");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_TIPO, "TIPO");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_TIPO, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_TIPO, MyGlb.VIS_NORMFIELPADR);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ESERCIZIO, "E6119CAF-1D33-4F7C-970B-5647CA14E910");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ESERCIZIO, "ESERCIZIO");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ESERCIZIO, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODICE, "4A423A47-ED62-48C0-8266-1CD62E31F1A7");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODICE, "Codice");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODICE, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO4, "03073FD0-8FC2-4304-9C16-45FA92C772DC");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO4, "IV Livello");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO4, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO4, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO5, "CF09249F-9F0E-4DB8-B839-DC53E0FD06C5");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO5, "V Livello");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO5, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO5, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CAPITOLO, "B7CE6106-8FC6-4FAD-B6CA-AAFCC8040FBF");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CAPITOLO, "Capitolo");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CAPITOLO, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ARTICOLO, "2EA3F0D0-BD06-4586-84A6-19A4908CCE63");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ARTICOLO, "Art.");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ARTICOLO, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROIMPACC, "C7C828BB-0B9B-40C4-BC2A-4FAF2303B62A");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROIMPACC, "Numero Impacc.");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROIMPACC, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOIMPACC, "696641A1-A029-45A1-9238-E30B500E2483");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOIMPACC, "Anno Impacc.");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOIMPACC, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIMPACC, "DD58C6DD-768E-4654-ABED-63DA41B9A309");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIMPACC, " ");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIMPACC, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIMPACC, MyGlb.VIS_NORFIECFHELE);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, "598D47AD-5A1E-46D1-9254-012590C0E42B");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, "Numero Subimp.");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, "F666FD69-AEA8-4517-B03B-64FDA08CAA9B");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, "Anno Subimp.");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, "EBB619C7-0BC2-4545-AC33-174BA61B43BB");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, "Numero Liq.");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, "D6BB835A-A82D-4151-9242-7E19C05263D9");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, "Anno Liq.");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, "911EE6FB-385C-444B-9409-9C73DFE7D59C");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, " ");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, MyGlb.VIS_NORFIECFHELE);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, "151A06D6-7BD6-46A0-B1DD-0E774A960B30");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, "Numero Manord.");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, "3EBF0417-B6A8-41DC-9D0A-EC672172267B");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, "Anno Manord.");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, "CA47B08A-A6A5-4BD1-A241-68D54C3603A2");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, " ");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_BENEFICIARIO, "5BD9841D-3AC0-4363-A792-379A624E7BD5");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_BENEFICIARIO, "Beneficiario");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_BENEFICIARIO, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RAGIONSOCIAL, "FDADCAB2-32EB-4BB5-9D94-4DA04A00369F");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RAGIONSOCIAL, "Ragione Sociale");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RAGIONSOCIAL, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_FATTORE, "9935A800-3B38-420D-ADE4-1D4BD04F088A");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_FATTORE, "Fattore");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_FATTORE, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIFATTOR, "285AB1F5-FF31-4999-A44A-0CE9AD602E24");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIFATTOR, "Descrizione Fattore");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIFATTOR, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIFATTOR, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIFATTOR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_PIACONECOPAT, "4815818D-6229-42A9-AEA5-5B47A58CD7E7");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_PIACONECOPAT, "Piano Conti Economico Patrimoniale");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_PIACONECOPAT, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_PIACONECOPAT, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_PIACONECOPAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CONSTAECOPAT, "BD4E6F02-96D1-4244-9EDD-9DF15FF8D85F");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CONSTAECOPAT, "Conto Stampa Eco-Pat");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CONSTAECOPAT, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CONSTAECOPAT, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CONSTAECOPAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZDAL, "BBF62CD1-A4C8-4C6B-ACF0-836A987F69EC");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZDAL, "Competenza Dal");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZDAL, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZDAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZAAL, "240016B3-DA91-426C-8CC3-CFF30EC863DB");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZAAL, "Competenza Al");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZAAL, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZAAL, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZAAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CENTRO, "B3001D56-8CD8-4925-8513-95ACF07C1B27");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CENTRO, "Centro");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CENTRO, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRICENTRO, "BF01C38D-596A-4AA2-87B4-80366B2DDD3A");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRICENTRO, "Descrizione Centro");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRICENTRO, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRICENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRICENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RILEVANTEECO, "8875472A-1AFF-4A12-9D16-49A6CB15B800");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RILEVANTEECO, "RILEVANTE ECO");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RILEVANTEECO, "");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RILEVANTEECO, MyGlb.VIS_NORMFIELPADR);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RILEVANTEECO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_ISOPT, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEIMPEGN, "0D639210-1027-44A6-A836-95F0F2E4CF56");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEIMPEGN, "Accertamento");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEIMPEGN, MyGlb.VIS_LABEVISUSTYL);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHESUBIMP, "9BD4EB91-6AC0-4941-A86B-88B300A8AC4B");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHESUBIMP, "Sub.Imp.");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHESUBIMP, MyGlb.VIS_LABEVISUSTYL);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHESUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, "D7FE4351-58C0-4617-905C-92EADBE6F430");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, "Liquidazione");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, MyGlb.VIS_LABEVISUSTYL);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, "2C5FD8A3-0621-48B6-8119-77FBFEC1293A");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, "Mandato");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, MyGlb.VIS_LABEVISUSTYL);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RECRETECSUMO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUOVCAMPSTAT, "76D77D81-E738-427F-A464-1A105C3CE0C4");
    PAN_RECRETECSUMO.set_Header(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUOVCAMPSTAT, " ");
    PAN_RECRETECSUMO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUOVCAMPSTAT, " ");
    PAN_RECRETECSUMO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUOVCAMPSTAT, MyGlb.VIS_VUOTONORMALE);
    PAN_RECRETECSUMO.SetFlags(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUOVCAMPSTAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_RECRETECSUMO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_TIPO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_TIPO, MyGlb.PANEL_LIST, 36);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_TIPO, MyGlb.PANEL_FORM, 4, 4, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_TIPO, MyGlb.PANEL_FORM, 128);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_TIPO, MyGlb.PANEL_FORM, "TIPO");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_TIPO, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_TIPO, PPQRY_VISMOVRETIMP, "A.TIPO", "VISMOVREIMTI", 12, 1, 0, -13997);
    PAN_RECRETECSUMO.SetValueListItem(PFL_RECRETECSUMO_TIPO, (new IDVariant("A")), "Accertamenti", "", "", -1);
    PAN_RECRETECSUMO.SetValueListItem(PFL_RECRETECSUMO_TIPO, (new IDVariant("O")), "Ordinativi", "", "", -1);
    PAN_RECRETECSUMO.SetValueListItem(PFL_RECRETECSUMO_TIPO, (new IDVariant("I")), "Impegni", "", "", -1);
    PAN_RECRETECSUMO.SetValueListItem(PFL_RECRETECSUMO_TIPO, (new IDVariant("S")), "Sub-Impegni", "", "", -1);
    PAN_RECRETECSUMO.SetValueListItem(PFL_RECRETECSUMO_TIPO, (new IDVariant("L")), "Liquidazioni", "", "", -1);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ESERCIZIO, MyGlb.PANEL_FORM, 236, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_ESERCIZIO, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_ESERCIZIO, PPQRY_VISMOVRETIMP, "A.ESERCIZIO", "VISMOVREIMES", 1, 4, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODICE, MyGlb.PANEL_LIST, 16, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODICE, MyGlb.PANEL_FORM, 372, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODICE, MyGlb.PANEL_FORM, 64);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_CODICE, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_CODICE, PPQRY_VISMOVRETIMP, "A.CODICE", "VISMOVREIMCO", 5, 10, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO4, MyGlb.PANEL_LIST, 88, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO4, MyGlb.PANEL_LIST, 88);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO4, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO4, MyGlb.PANEL_LIST, "IV Livello");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO4, MyGlb.PANEL_FORM, 4, 28, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO4, MyGlb.PANEL_FORM, 128);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO4, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO4, MyGlb.PANEL_FORM, "IV Livello");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_CODLIVELLO4, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_CODLIVELLO4, PPQRY_VISMOVRETIMP, "A.COD_LIVELLO_4", "VIMOREIMCOL4", 1, 15, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO5, MyGlb.PANEL_LIST, 176, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO5, MyGlb.PANEL_LIST, "V Livello");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO5, MyGlb.PANEL_FORM, 236, 28, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO5, MyGlb.PANEL_FORM, 104);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CODLIVELLO5, MyGlb.PANEL_FORM, "V Livello");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_CODLIVELLO5, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_CODLIVELLO5, PPQRY_VISMOVRETIMP, "A.COD_LIVELLO_5", "VIMOREIMCOL5", 1, 10, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CAPITOLO, MyGlb.PANEL_LIST, 264, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CAPITOLO, MyGlb.PANEL_FORM, 4, 52, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CAPITOLO, MyGlb.PANEL_FORM, 128);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_CAPITOLO, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_CAPITOLO, PPQRY_VISMOVRETIMP, "A.CAPITOLO", "VISMOVREIMCA", 3, 16, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ARTICOLO, MyGlb.PANEL_LIST, 400, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ARTICOLO, MyGlb.PANEL_FORM, 228, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ARTICOLO, MyGlb.PANEL_FORM, 80);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_ARTICOLO, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_ARTICOLO, PPQRY_VISMOVRETIMP, "A.ARTICOLO", "VISMOVREIMAR", 1, 2, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROIMPACC, MyGlb.PANEL_LIST, 432, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROIMPACC, MyGlb.PANEL_LIST, 104);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROIMPACC, MyGlb.PANEL_LIST, "Numero Impacc.");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROIMPACC, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROIMPACC, MyGlb.PANEL_FORM, 128);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROIMPACC, MyGlb.PANEL_FORM, "Numero Impacc.");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_NUMEROIMPACC, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_NUMEROIMPACC, PPQRY_VISMOVRETIMP, "A.NUMERO_IMPACC", "VIMOREIMNUIM", 1, 5, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOIMPACC, MyGlb.PANEL_LIST, 488, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOIMPACC, MyGlb.PANEL_LIST, 88);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOIMPACC, MyGlb.PANEL_LIST, "Ann. Imp.");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOIMPACC, MyGlb.PANEL_FORM, 364, 52, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOIMPACC, MyGlb.PANEL_FORM, 104);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOIMPACC, MyGlb.PANEL_FORM, "Anno Impacc.");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_ANNOIMPACC, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_ANNOIMPACC, PPQRY_VISMOVRETIMP, "A.ANNO_IMPACC", "VIMOREIMANIM", 1, 4, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIMPACC, MyGlb.PANEL_LIST, 524, 36, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIMPACC, MyGlb.PANEL_LIST, 92);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIMPACC, MyGlb.PANEL_LIST, " ");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIMPACC, MyGlb.PANEL_FORM, 4, 100, 472, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIMPACC, MyGlb.PANEL_FORM, 128);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIMPACC, MyGlb.PANEL_FORM, 2);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIMPACC, MyGlb.PANEL_FORM, " ");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_DESCRIMPACC, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_DESCRIMPACC, PPQRY_VISMOVRETIMP, "A.DESCR_IMPACC", "VIMOREIMDEIM", 5, 140, 0, -13997);
    PAN_RECRETECSUMO.set_Watermark(PFL_RECRETECSUMO_DESCRIMPACC, " ");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, MyGlb.PANEL_LIST, 700, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, MyGlb.PANEL_LIST, 104);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Num. Sub.");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, MyGlb.PANEL_FORM, 228, 124, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, MyGlb.PANEL_FORM, 120);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Numero Subimp.");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_NUMEROSUBIMP, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_NUMEROSUBIMP, PPQRY_VISMOVRETIMP, "A.NUMERO_SUBIMP", "VIMOREIMNUSU", 1, 5, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, MyGlb.PANEL_LIST, 740, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, MyGlb.PANEL_LIST, 88);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, MyGlb.PANEL_LIST, "Ann. Sub.");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, MyGlb.PANEL_FORM, 128);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOSUBIMP, MyGlb.PANEL_FORM, "Anno Subimp.");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_ANNOSUBIMP, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_ANNOSUBIMP, PPQRY_VISMOVRETIMP, "A.ANNO_SUBIMP", "VIMOREIMANSU", 1, 15, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, MyGlb.PANEL_LIST, 776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, MyGlb.PANEL_LIST, 80);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, MyGlb.PANEL_LIST, "Num. Liq");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 148, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, MyGlb.PANEL_FORM, 128);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROLIQ, MyGlb.PANEL_FORM, "Numero Liq.");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_NUMEROLIQ, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_NUMEROLIQ, PPQRY_VISMOVRETIMP, "A.NUMERO_LIQ", "VIMOREIMNULI", 1, 5, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, MyGlb.PANEL_LIST, 816, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, MyGlb.PANEL_LIST, "Anno Liq.");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, MyGlb.PANEL_FORM, 396, 124, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, MyGlb.PANEL_FORM, 72);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOLIQ, MyGlb.PANEL_FORM, "Anno Liq.");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_ANNOLIQ, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_ANNOLIQ, PPQRY_VISMOVRETIMP, "A.ANNO_LIQ", "VIMOREIMANLI", 1, 4, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, MyGlb.PANEL_LIST, 856, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, MyGlb.PANEL_LIST, 104);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, MyGlb.PANEL_LIST, " ");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, MyGlb.PANEL_FORM, 4, 172, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, MyGlb.PANEL_FORM, 128);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, MyGlb.PANEL_FORM, 2);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRLIQPRE, MyGlb.PANEL_FORM, " ");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_DESCRLIQPRE, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_DESCRLIQPRE, PPQRY_VISMOVRETIMP, "A.DESCR_LIQPRE", "VIMOREIMDELI", 5, 140, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, MyGlb.PANEL_LIST, 1032, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, MyGlb.PANEL_LIST, 108);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, MyGlb.PANEL_LIST, "Num. Man.");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, MyGlb.PANEL_FORM, 188, 196, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, MyGlb.PANEL_FORM, 120);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUMEROMANORD, MyGlb.PANEL_FORM, "Numero Manord.");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_NUMEROMANORD, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_NUMEROMANORD, PPQRY_VISMOVRETIMP, "A.NUMERO_MANORD", "VIMOREIMNUMA", 1, 5, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, MyGlb.PANEL_LIST, 1072, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, MyGlb.PANEL_LIST, 92);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, MyGlb.PANEL_LIST, "Ann. Man.");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, MyGlb.PANEL_FORM, 4, 196, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, MyGlb.PANEL_FORM, 128);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ANNOMANORD, MyGlb.PANEL_FORM, "Anno Manord.");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_ANNOMANORD, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_ANNOMANORD, PPQRY_VISMOVRETIMP, "A.ANNO_MANORD", "VIMOREIMANMA", 1, 15, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, MyGlb.PANEL_LIST, 1112, 36, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, MyGlb.PANEL_LIST, 132);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, MyGlb.PANEL_LIST, " ");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, MyGlb.PANEL_FORM, 4, 364, 492, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, MyGlb.PANEL_FORM, 132);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, MyGlb.PANEL_FORM, 2);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_SUBIMPDESCRI, MyGlb.PANEL_FORM, " ");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_SUBIMPDESCRI, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_SUBIMPDESCRI, PPQRY_DESCORDSUBIM, "A.DESCRIZIONE", "NOMOGGSUBDES", 5, 140, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_BENEFICIARIO, MyGlb.PANEL_LIST, 1288, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_BENEFICIARIO, MyGlb.PANEL_LIST, 112);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_BENEFICIARIO, MyGlb.PANEL_FORM, 364, 196, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_BENEFICIARIO, MyGlb.PANEL_FORM, 128);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_BENEFICIARIO, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_BENEFICIARIO, PPQRY_VISMOVRETIMP, "A.COD_BENEFICIARIO", "VISMOVREIMBE", 2, 15, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1364, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 108);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 220, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 128);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_RAGIONSOCIAL, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_RAGIONSOCIAL, PPQRY_VISMOVRETIMP, "A.RAGIONE_SOCIALE", "VIMOREIMRASO", 5, 60, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_FATTORE, MyGlb.PANEL_LIST, 1524, 36, 104, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_FATTORE, MyGlb.PANEL_LIST, 60);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_FATTORE, MyGlb.PANEL_FORM, 4, 244, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_FATTORE, MyGlb.PANEL_FORM, 128);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_FATTORE, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_FATTORE, PPQRY_VISMOVRETIMP, "A.FATTORE", "VISMOVREIMFA", 5, 16, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIFATTOR, MyGlb.PANEL_LIST, 1628, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIFATTOR, MyGlb.PANEL_LIST, 104);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIFATTOR, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIFATTOR, MyGlb.PANEL_LIST, "Descrizione Fattore");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIFATTOR, MyGlb.PANEL_FORM, 4, 268, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIFATTOR, MyGlb.PANEL_FORM, 128);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIFATTOR, MyGlb.PANEL_FORM, 2);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRIFATTOR, MyGlb.PANEL_FORM, "Descrizione Fattore");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_DESCRIFATTOR, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_DESCRIFATTOR, PPQRY_VISMOVRETIMP, "A.DESCRIZIONE_FATTORE", "VIMOREIMDEFA", 5, 255, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_PIACONECOPAT, MyGlb.PANEL_LIST, 1788, 36, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_PIACONECOPAT, MyGlb.PANEL_LIST, 104);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_PIACONECOPAT, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_PIACONECOPAT, MyGlb.PANEL_LIST, "Piano Conti Economico Patrimoniale");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_PIACONECOPAT, MyGlb.PANEL_FORM, 4, 292, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_PIACONECOPAT, MyGlb.PANEL_FORM, 128);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_PIACONECOPAT, MyGlb.PANEL_FORM, 2);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_PIACONECOPAT, MyGlb.PANEL_FORM, "Piano Conti Economico Patrimoniale");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_PIACONECOPAT, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_PIACONECOPAT, PPQRY_VISMOVRETIMP, "A.DESCR_PDC_ECOPAT", "VIMOREIMPCEP", 5, 4000, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CONSTAECOPAT, MyGlb.PANEL_LIST, 2164, 36, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CONSTAECOPAT, MyGlb.PANEL_LIST, 104);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CONSTAECOPAT, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CONSTAECOPAT, MyGlb.PANEL_LIST, "Conto Stampa Eco-Pat");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CONSTAECOPAT, MyGlb.PANEL_FORM, 4, 316, 560, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CONSTAECOPAT, MyGlb.PANEL_FORM, 160);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CONSTAECOPAT, MyGlb.PANEL_FORM, 2);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CONSTAECOPAT, MyGlb.PANEL_FORM, "Conto Stampa Eco-Pat");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_CONSTAECOPAT, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_CONSTAECOPAT, PPQRY_VISMOVRETIMP, "A.DESCR_PDC_ECOPAT_STAMPA", "VIMOREIMCSEP", 5, 4000, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZDAL, MyGlb.PANEL_LIST, 2540, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZDAL, MyGlb.PANEL_LIST, 108);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZDAL, MyGlb.PANEL_LIST, "Competenza Dal");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZDAL, MyGlb.PANEL_FORM, 276, 244, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZDAL, MyGlb.PANEL_FORM, 120);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZDAL, MyGlb.PANEL_FORM, "Competenza Dal");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_COMPETENZDAL, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_COMPETENZDAL, PPQRY_VISMOVRETIMP, "A.COMPETENZA_DAL", "VIMOREIMCODA", 6, 10, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZAAL, MyGlb.PANEL_LIST, 2620, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZAAL, MyGlb.PANEL_LIST, 104);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZAAL, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZAAL, MyGlb.PANEL_LIST, "Competenza Al");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZAAL, MyGlb.PANEL_FORM, 228, 148, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZAAL, MyGlb.PANEL_FORM, 120);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZAAL, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_COMPETENZAAL, MyGlb.PANEL_FORM, "Competenza Al");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_COMPETENZAAL, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_COMPETENZAAL, PPQRY_VISMOVRETIMP, "A.COMPETENZA_AL", "VIMOREIMCOAL", 6, 10, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CENTRO, MyGlb.PANEL_LIST, 2700, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CENTRO, MyGlb.PANEL_LIST, 64);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CENTRO, MyGlb.PANEL_FORM, 188, 76, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CENTRO, MyGlb.PANEL_FORM, 64);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_CENTRO, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_CENTRO, PPQRY_VISMOVRETIMP, "A.CENTRO", "VISMOVREIMCE", 5, 16, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRICENTRO, MyGlb.PANEL_LIST, 2804, 36, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRICENTRO, MyGlb.PANEL_LIST, 104);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRICENTRO, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRICENTRO, MyGlb.PANEL_LIST, "Descrizione Centro");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRICENTRO, MyGlb.PANEL_FORM, 4, 340, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRICENTRO, MyGlb.PANEL_FORM, 144);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRICENTRO, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_DESCRICENTRO, MyGlb.PANEL_FORM, "Descrizione Centro");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_DESCRICENTRO, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_DESCRICENTRO, PPQRY_VISMOVRETIMP, "A.DESCRIZIONE_CENTRO", "VIMOREIMDECE", 5, 60, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RILEVANTEECO, MyGlb.PANEL_LIST, 420, 496, 48, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RILEVANTEECO, MyGlb.PANEL_LIST, 20);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RILEVANTEECO, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RILEVANTEECO, MyGlb.PANEL_LIST, "RIL. EC.");
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RILEVANTEECO, MyGlb.PANEL_FORM, 436, 148, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RILEVANTEECO, MyGlb.PANEL_FORM, 104);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RILEVANTEECO, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_RILEVANTEECO, MyGlb.PANEL_FORM, "RILEVANTE ECO");
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_RILEVANTEECO, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_RILEVANTEECO, PPQRY_VISMOVRETIMP, "A.RILEVANTE_ECO", "VIMOREIMRIEC", 5, 2, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEIMPEGN, MyGlb.PANEL_LIST, 432, 0, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEIMPEGN, MyGlb.PANEL_LIST, 2);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEIMPEGN, MyGlb.PANEL_FORM, 416, 236, 76, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_ETICHEIMPEGN, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_ETICHEIMPEGN, -1, "", "ETICHEIMPEGN", 0, 0, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHESUBIMP, MyGlb.PANEL_LIST, 700, 0, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHESUBIMP, MyGlb.PANEL_LIST, 0);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHESUBIMP, MyGlb.PANEL_LIST, 2);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHESUBIMP, MyGlb.PANEL_FORM, 668, 240, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHESUBIMP, MyGlb.PANEL_FORM, 0);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHESUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_ETICHESUBIMP, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_ETICHESUBIMP, -1, "", "ETICHESUBIMP", 0, 0, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, MyGlb.PANEL_LIST, 776, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, MyGlb.PANEL_LIST, 0);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, MyGlb.PANEL_LIST, 2);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, MyGlb.PANEL_FORM, 744, 240, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, MyGlb.PANEL_FORM, 0);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHELIQUID, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_ETICHELIQUID, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_ETICHELIQUID, -1, "", "ETICHELIQUID", 0, 0, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, MyGlb.PANEL_LIST, 1032, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, MyGlb.PANEL_LIST, 0);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, MyGlb.PANEL_LIST, 2);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, MyGlb.PANEL_FORM, 824, 248, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, MyGlb.PANEL_FORM, 0);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_ETICHEMANDAT, MyGlb.PANEL_FORM, 1);
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_ETICHEMANDAT, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_ETICHEMANDAT, -1, "", "ETICHEMANDAT", 0, 0, 0, -13997);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 0, 0, 16, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 0);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUOVCAMPSTAT, MyGlb.PANEL_LIST, 1);
    PAN_RECRETECSUMO.SetRect(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 84, 260, 16, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RECRETECSUMO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 0);
    PAN_RECRETECSUMO.SetNumRow(MyGlb.OBJ_FIELD, PFL_RECRETECSUMO_NUOVCAMPSTAT, MyGlb.PANEL_FORM, 2);
    PAN_RECRETECSUMO.SetFieldPage(PFL_RECRETECSUMO_NUOVCAMPSTAT, -1, -1);
    PAN_RECRETECSUMO.SetFieldPanel(PFL_RECRETECSUMO_NUOVCAMPSTAT, -1, "", "NUOVCAMPSTAT", 0, 0, 0, -13997);
  }

  private void PAN_RECRETECSUMO_InitQueries()
  {
    StringBuffer SQL;

    PAN_RECRETECSUMO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as NOMOGGSUBDES ");
    SQL.append("from ");
    SQL.append("  SUBIMP A ");
    SQL.append("where (~~VISMOVREIMTI~~ = 'S') ");
    SQL.append("and   (A.ANNO_SUBIMP = ~~VIMOREIMANSU~~) ");
    SQL.append("and   (A.NUMERO_SUBIMP = ~~VIMOREIMNUSU~~) ");
    SQL.append("and   (NOT ((~~VIMOREIMANSU~~ IS NULL))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  PRE B ");
    SQL.append("where (~~VISMOVREIMTI~~ = 'O') ");
    SQL.append("and   (B.ANNO_PRE = ~~VIMOREIMANLI~~) ");
    SQL.append("and   (B.NUMERO_PRE = ~~VIMOREIMNULI~~) ");
    PAN_RECRETECSUMO.SetQuery(PPQRY_DESCORDSUBIM, 0, SQL, -1, "");
    PAN_RECRETECSUMO.SetQueryDB(PPQRY_DESCORDSUBIM, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RECRETECSUMO.SetMasterTable(PPQRY_DESCORDSUBIM, "SUBIMP");
    PAN_RECRETECSUMO.SetIMDB(IMDB, "PQRY_VISMOVRETIMP", true);
    PAN_RECRETECSUMO.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA MOV RETT IMPECO");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.TIPO as VISMOVREIMTI, ");
    SQL.append("  A.ESERCIZIO as VISMOVREIMES, ");
    SQL.append("  A.CODICE as VISMOVREIMCO, ");
    SQL.append("  A.COD_LIVELLO_4 as VIMOREIMCOL4, ");
    SQL.append("  A.COD_LIVELLO_5 as VIMOREIMCOL5, ");
    SQL.append("  A.CAPITOLO as VISMOVREIMCA, ");
    SQL.append("  A.ARTICOLO as VISMOVREIMAR, ");
    SQL.append("  A.ANNO_IMPACC as VIMOREIMANIM, ");
    SQL.append("  A.NUMERO_IMPACC as VIMOREIMNUIM, ");
    SQL.append("  A.DESCR_IMPACC as VIMOREIMDEIM, ");
    SQL.append("  A.ANNO_SUBIMP as VIMOREIMANSU, ");
    SQL.append("  A.NUMERO_SUBIMP as VIMOREIMNUSU, ");
    SQL.append("  A.ANNO_LIQ as VIMOREIMANLI, ");
    SQL.append("  A.NUMERO_LIQ as VIMOREIMNULI, ");
    SQL.append("  A.DESCR_LIQPRE as VIMOREIMDELI, ");
    SQL.append("  A.ANNO_MANORD as VIMOREIMANMA, ");
    SQL.append("  A.NUMERO_MANORD as VIMOREIMNUMA, ");
    SQL.append("  A.COD_BENEFICIARIO as VISMOVREIMBE, ");
    SQL.append("  A.RAGIONE_SOCIALE as VIMOREIMRASO, ");
    SQL.append("  A.FATTORE as VISMOVREIMFA, ");
    SQL.append("  A.DESCRIZIONE_FATTORE as VIMOREIMDEFA, ");
    SQL.append("  A.DESCR_PDC_ECOPAT as VIMOREIMPCEP, ");
    SQL.append("  A.DESCR_PDC_ECOPAT_STAMPA as VIMOREIMCSEP, ");
    SQL.append("  A.COMPETENZA_DAL as VIMOREIMCODA, ");
    SQL.append("  A.COMPETENZA_AL as VIMOREIMCOAL, ");
    SQL.append("  A.CENTRO as VISMOVREIMCE, ");
    SQL.append("  A.DESCRIZIONE_CENTRO as VIMOREIMDECE, ");
    SQL.append("  A.RILEVANTE_ECO as VIMOREIMRIEC ");
    PAN_RECRETECSUMO.SetQuery(PPQRY_VISMOVRETIMP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_MOV_RETT_IMPECO A ");
    PAN_RECRETECSUMO.SetQuery(PPQRY_VISMOVRETIMP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.TIPO = ~~PQRY_IMDB5.NOMOGGTIPMOV~~) ");
    SQL.append("and   (((A.TIPO IN ('I', 'S', 'A')) AND A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) OR (A.ESERCIZIO >= ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND A.TIPO NOT IN ('I', 'S', 'A'))) ");
    SQL.append("and   (~~PQRY_IMDB5.NOOGSOMOSEIM~~ = 'NO' OR (~~PQRY_IMDB5.NOOGSOMOSEIM~~ = 'SI' AND (((A.RILEVANTE_ECO IS NULL) AND A.TIPO IN ('I', 'S', 'A')) OR (A.TIPO IN ('O', 'L') AND (A.FATTORE IS NULL))))) ");
    SQL.append("and   (NVL(A.COD_LIVELLO_4, -1) = NVL(~~TBL_IMDB6.NOMOGGQUALIV~~, NVL(A.COD_LIVELLO_4, -1))) ");
    SQL.append("and   (NVL(A.COD_LIVELLO_5, -1) = CASE WHEN (~~TBL_IMDB6.NOMOGGQUALIV~~ IS NULL) THEN NVL(~~TBL_IMDB6.NOMOGGQUILIV~~, NVL(A.COD_LIVELLO_5, -1)) ELSE NVL(~~TBL_IMDB6.NOMOGGQUILIV~~, -1) END) ");
    PAN_RECRETECSUMO.SetQuery(PPQRY_VISMOVRETIMP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RECRETECSUMO.SetQuery(PPQRY_VISMOVRETIMP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_RECRETECSUMO.SetQuery(PPQRY_VISMOVRETIMP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.COD_LIVELLO_4, ");
    SQL.append("  A.COD_LIVELLO_5, ");
    SQL.append("  A.ESERCIZIO, ");
    SQL.append("  A.CODICE, ");
    SQL.append("  A.ANNO_IMPACC, ");
    SQL.append("  A.NUMERO_IMPACC, ");
    SQL.append("  A.ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ ");
    PAN_RECRETECSUMO.SetQuery(PPQRY_VISMOVRETIMP, 5, SQL, -1, "");
    PAN_RECRETECSUMO.SetQueryDB(PPQRY_VISMOVRETIMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RECRETECSUMO.SetMasterTable(0, "VISTA_MOV_RETT_IMPECO");
    PAN_RECRETECSUMO.AddToSortList(PFL_RECRETECSUMO_CODLIVELLO4, true);
    PAN_RECRETECSUMO.AddToSortList(PFL_RECRETECSUMO_CODLIVELLO5, true);
    PAN_RECRETECSUMO.AddToSortList(PFL_RECRETECSUMO_ESERCIZIO, true);
    PAN_RECRETECSUMO.AddToSortList(PFL_RECRETECSUMO_CODICE, true);
    PAN_RECRETECSUMO.AddToSortList(PFL_RECRETECSUMO_ANNOIMPACC, true);
    PAN_RECRETECSUMO.AddToSortList(PFL_RECRETECSUMO_NUMEROIMPACC, true);
    PAN_RECRETECSUMO.AddToSortList(PFL_RECRETECSUMO_ANNOSUBIMP, true);
    PAN_RECRETECSUMO.AddToSortList(PFL_RECRETECSUMO_NUMEROSUBIMP, true);
    PAN_RECRETECSUMO.AddToSortList(PFL_RECRETECSUMO_ANNOLIQ, true);
    PAN_RECRETECSUMO.AddToSortList(PFL_RECRETECSUMO_NUMEROLIQ, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RECRETECSUMO.Status() == 2)
    {
      int oldListQBE = PAN_RECRETECSUMO.iUseListQBE;
      PAN_RECRETECSUMO.iUseListQBE = 0;
      PAN_RECRETECSUMO.PanelCommand(Glb.PCM_SEARCH);
      PAN_RECRETECSUMO.PanelCommand(Glb.PCM_FIND);
      PAN_RECRETECSUMO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_RECRETECSUMO) PAN_RECRETECSUMO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_RECRETECSUMO) PAN_RECRETECSUMO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_RECRETECSUMO) PAN_RECRETECSUMO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_RECRETECSUMO) PAN_RECRETECSUMO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_RECRETECSUMO) PAN_RECRETECSUMO_OnChangeSelection(NewVal, Final, Cancel);
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
    if (SrcObj == PAN_RECRETECSUMO) PAN_RECRETECSUMO_AfterFind(CmdFind);
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
    if (SrcObj == PAN_RECRETECSUMO) PAN_RECRETECSUMO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
