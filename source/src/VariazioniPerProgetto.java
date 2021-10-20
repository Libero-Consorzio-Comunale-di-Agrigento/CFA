// **********************************************
// Variazioni Per Progetto
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniPerProgetto extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_VARIAPERPROG_PARTE = 0;
  private static int GRP_VARIAPERPROG_VARIABILAPEG = 1;
  private static int GRP_VARIAPERPROG_VARIAZIONI = 2;
  private static int GRP_VARIAPERPROG_PERIODIVARIA = 3;
  private static int GRP_VARIAPERPROG_PROVVEDIMENT = 4;

  private static int PFL_VARIAPERPROG_PARTE = 0;
  private static int PFL_VARIAPERPROG_NEWPANELABE1 = 1;
  private static int PFL_VARIAPERPROG_VARIABILAPEG = 2;
  private static int PFL_VARIAPERPROG_NEWPANELABE7 = 3;
  private static int PFL_VARIAPERPROG_VARIAZIONI = 4;
  private static int PFL_VARIAPERPROG_NEWPANELABE5 = 5;
  private static int PFL_VARIAPERPROG_DAL = 6;
  private static int PFL_VARIAPERPROG_AL = 7;
  private static int PFL_VARIAPERPROG_NEWPANELABE6 = 8;
  private static int PFL_VARIAPERPROG_PROGRAMMA = 9;
  private static int PFL_VARIAPERPROG_PROGETTO = 10;
  private static int PFL_VARIAPERPROG_TIPOVARIAZIO = 11;
  private static int PFL_VARIAPERPROG_DELIBERA = 12;
  private static int PFL_VARIAPERPROG_TRATTIDELIBE = 13;
  private static int PFL_VARIAPERPROG_NUMERODELIBE = 14;
  private static int PFL_VARIAPERPROG_BARRADELIBER = 15;
  private static int PFL_VARIAPERPROG_ANNODELIBERA = 16;
  private static int PFL_VARIAPERPROG_APRISCELDELI = 17;
  private static int PFL_VARIAPERPROG_PROPOSTA = 18;
  private static int PFL_VARIAPERPROG_TRATTIPROPOS = 19;
  private static int PFL_VARIAPERPROG_NUMEROPROPOS = 20;
  private static int PFL_VARIAPERPROG_BARRAPROPOST = 21;
  private static int PFL_VARIAPERPROG_ANNOPROPOSTA = 22;
  private static int PFL_VARIAPERPROG_APRISCELPROP = 23;
  private static int PFL_VARIAPERPROG_ELABORA = 24;
  private static int PFL_VARIAPERPROG_DETTAGCAPITO = 25;
  private static int PFL_VARIAPERPROG_DESCRIINTERV = 26;
  private static int PFL_VARIAPERPROG_DESCRIVARIAZ = 27;
  private static int PFL_VARIAPERPROG_TIPOSTAMPA = 28;

  private static int PPQRY_PARAMETRI336 = 0;

  private static int PPQRY_PROGRAMMI = 1;
  private static int PPQRY_PROGETTI = 2;
  private static int PPQRY_T54 = 3;


  IDPanel PAN_VARIAPERPROG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI338(IMDB);
    Init_TBL_PARAMETRIO16(IMDB);
    //
    //
    Init_PQRY_PARAMETRI336(IMDB);
    Init_PQRY_PARAMETRI336_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI338(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI338, 19);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI338, "TBL_PARAMETRI338");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMVABIPE, "ROWNAMVABIPE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMVABIPE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMDAGIPR, "ROWNAMDAGIPR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMDAGIPR,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMTIPSTA,12,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMDESVAR, "ROWNAMDESVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMDESVAR,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMEPROGR,5,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMEPROGE, "ROWNAMEPROGE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI338,IMDBDef4.FLD_PARAMETRI338_ROWNAMEPROGE,5,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI338, 0);
  }

  private static void Init_TBL_PARAMETRIO16(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRIO16, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRIO16, "TBL_PARAMETRIO16");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRIO16,IMDBDef4.FLD_PARAMETRIO16_PROGRAMMAOLD, "PROGRAMMAOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRIO16,IMDBDef4.FLD_PARAMETRIO16_PROGRAMMAOLD,5,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRIO16, 0);
  }

  private static void Init_PQRY_PARAMETRI336(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI336, 18);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI336, "PQRY_PARAMETRI336");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMVABIPE, "ROWNAMVABIPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMVABIPE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMDESVAR, "ROWNAMDESVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMDESVAR,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPROGR,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPROGE, "ROWNAMEPROGE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPROGE,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336,IMDBDef12.PQSL_PARAMETRI336_ROWNAMTIPSTA,12,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI336, 0);
  }

  private static void Init_PQRY_PARAMETRI336_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI336_RS, 18);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI336_RS, "PQRY_PARAMETRI336_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMVABIPE, "ROWNAMVABIPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMVABIPE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMDESVAR, "ROWNAMDESVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMDESVAR,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPROGR,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPROGE, "ROWNAMEPROGE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPROGE,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI336_RS,IMDBDef12.PQSL_PARAMETRI336_ROWNAMTIPSTA,12,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniPerProgetto(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniPerProgetto()
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
    FormIdx = MyGlb.FRM_VARIAPERPROG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "588EBDD9-CD16-4520-995A-5AD7B87AE474";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 656;
    DesignHeight = 374;
    set_Caption(new IDVariant("Variazioni Per Progetto"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 656;
    Frames[1].Height = 348;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Variazioni Per Progetto";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 348;
    PAN_VARIAPERPROG = new IDPanel(w, this, 1, "PAN_VARIAPERPROG");
    Frames[1].Content = PAN_VARIAPERPROG;
    PAN_VARIAPERPROG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAPERPROG.VS = MainFrm.VisualStyleList;
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 656-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F2D5C7E3-1860-498B-BF52-1450D2E01523");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 852, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAPERPROG.InitStatus = 2;
    PAN_VARIAPERPROG_Init();
    PAN_VARIAPERPROG_InitFields();
    PAN_VARIAPERPROG_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI338, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIAPERPROG_PARAMETRI336();
      }
      PAN_VARIAPERPROG.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_VARIAPERPROG.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAPERPROG_APRISCELDELI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_VARIAPERPROG.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAPERPROG_APRISCELPROP) {
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
    return (obj instanceof VariazioniPerProgetto);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniPerProgetto.class.getName() : (Glb.ClassWithPackage(VariazioniPerProgetto.class) ? VariazioniPerProgetto.class.getName().substring(VariazioniPerProgetto.class.getPackage().getName().length() + 1) : VariazioniPerProgetto.class.getName()));
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
      MainFrm.ErrObj.ProcError ("VariazioniPerProgetto", "ApriDelibera", _e);
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
      MainFrm.ErrObj.ProcError ("VariazioniPerProgetto", "ApriProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ERR1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ERR2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_DVARTIPO3RPP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ERR1 = (new IDVariant("Errore. La data inserita non è corretta. Anno inferiore a 1900", IDVariant.STRING));
      v_ERR2 = (new IDVariant("Errore. Data Al inferiore a Data Dal", IDVariant.STRING));
      v_DVARTIPO3RPP = (new IDVariant("d_var_tipo3_rpp", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.Year(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMEDAL, 0)).compareTo((new IDVariant(1900)), true)<0 || IDL.Year(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMEAL, 0)).compareTo((new IDVariant(1900)), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR1); 
        return 0;
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMEAL, 0).compareTo(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMEDAL, 0), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR2); 
        return 0;
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMSEDDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMDEL, 0))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMDEL, 0))))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Delibera non presente", IDVariant.STRING));
          v_CONTATORE = (new IDVariant(0));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  DEL A ");
          SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMSEDDEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.equals((new IDVariant(0)), true))
          {
            MainFrm.set_AlertMessage(v_AVVISO); 
            return 0;
          }
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Dati della Delibera incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      if ((!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMUNIPRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMPRO, 0)) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNPRO, 0))))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNPRO, 0))))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Proposta inesistente", IDVariant.STRING));
          if (MainFrm.GESTIODELIBE.booleanValue())
          {
            v_CONTATORE = (new IDVariant(0));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  PROPOSTE A ");
            SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CONTATORE.equals((new IDVariant(0)), true))
            {
              MainFrm.set_AlertMessage(v_AVVISO); 
              return 0;
            }
          }
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Dati della Proposta incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPARTE, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMEVARIA, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMVABIPE, 0));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMTIPVAR, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMSEDDEL, 0),(new IDVariant("%20"))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNDEL, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMDEL, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMUNIPRO, 0),(new IDVariant("%20"))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNPRO, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMPRO, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IDL.Add(MainFrm.Datetostring(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMEDAL, 0)), (new IDVariant("%20%2000:00:00"))));
      MainFrm.SetParametroStampa(IDL.Add(MainFrm.Datetostring(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMEAL, 0)), (new IDVariant("%20%2000:00:00"))));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMTIPSTA, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMDETCAP, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPROGR, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPROGE, 0));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DVARTIPO3RPP);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerProgetto", "Elabora", _e);
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMTIPVAR, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMVABIPE, 0, (new IDVariant("PB")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMEPARTE, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMDETCAP, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMEVARIA, 0, (new IDVariant("P")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMSEDDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMNUMDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMANNDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMUNIPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMANNPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMTIPSTA, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMDETCAP, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMDESINT, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMEPROGR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO16, IMDBDef4.FLD_PARAMETRIO16_PROGRAMMAOLD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMEPROGE, 0, (new IDVariant()));
      if (!(MainFrm.GESTIODELIBE.booleanValue()))
      {
        PAN_VARIAPERPROG.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerProgetto", "LoadEvent", _e);
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
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerProgetto", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Per Finanziamento Tipo Variazione Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_VARIAPERPROG_TIPOVARIAZIO_ValidateCell(IDVariant Cancel)
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
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMTIPVAR, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMTIPVAR, 0, (new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerProgetto", "VariazioniPerFinanziamentoTipoVariazioneValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Per Progetto On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_VARIAPERPROG_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Per Progetto On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_VARIAPERPROG_PROGRAMMA)), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPROGR, 0),(new IDVariant("-1"))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef4.TBL_PARAMETRIO16, IMDBDef4.FLD_PARAMETRIO16_PROGRAMMAOLD, 0),(new IDVariant("-1"))), true)!=0)
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPROGE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRIO16, IMDBDef4.FLD_PARAMETRIO16_PROGRAMMAOLD, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMEPROGR, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAPERPROG_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMSEDDEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAPERPROG_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI336, IMDBDef12.PQSL_PARAMETRI336_ROWNAMUNIPRO, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerProgetto", "VariazioniPerProgettoOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void VARIAPERPROG_PARAMETRI336() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI336_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI338, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI338, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI336_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI336_RS, 0, IMDBDef4.TBL_PARAMETRI338, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 0, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMVABIPE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 1, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 2, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMTIPVAR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 3, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 4, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 5, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 6, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 7, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 8, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 9, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 10, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 11, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 12, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMDETCAP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 13, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMDESINT, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 14, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMDESVAR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 15, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMEPROGR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 16, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMEPROGE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI336_RS, 17, 0, IMDBDef4.TBL_PARAMETRI338, IMDBDef4.FLD_PARAMETRI338_ROWNAMTIPSTA, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI338, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI338, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI338, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI336_RS, 0);
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
  private void PAN_VARIAPERPROG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAPERPROG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAPERPROG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAPERPROG, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAPERPROG_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_VARIAPERPROG);
    // Stub
  }

  private void PAN_VARIAPERPROG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAPERPROG_APRISCELDELI)
    {
      this.IdxPanelActived = this.PAN_VARIAPERPROG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAPERPROG_APRISCELPROP)
    {
      this.IdxPanelActived = this.PAN_VARIAPERPROG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAPERPROG_ELABORA)
    {
      this.IdxPanelActived = this.PAN_VARIAPERPROG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAPERPROG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VARIAPERPROG_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_VARIAPERPROG_TIPOVARIAZIO)
      {
        PFL_VARIAPERPROG_TIPOVARIAZIO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAPERPROG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAPERPROG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAPERPROG_Init()
  {

    PAN_VARIAPERPROG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAPERPROG.SetSize(MyGlb.OBJ_GROUP, 5);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PARTE, "D8F94049-C5DC-42DF-9E0D-40753666D1AF");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PARTE, "Parte");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PARTE, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PARTE, MyGlb.PANEL_LIST, 72, -9999, 72, 16, 0, 0);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PARTE, MyGlb.PANEL_FORM, 368, 7, 252, 49, 0, 0);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PARTE, 0, 31);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PARTE, 1, 13);
    PAN_VARIAPERPROG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PARTE, 0, 4);
    PAN_VARIAPERPROG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PARTE, 1, 4);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIABILAPEG, "7F8010D3-AA12-49D0-AC2A-E0513E67F2EE");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIABILAPEG, "Variazioni Bilancio/P.e.g");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIABILAPEG, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIABILAPEG, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIABILAPEG, MyGlb.PANEL_LIST, 0, -9999, 72, 16, 0, 0);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIABILAPEG, MyGlb.PANEL_FORM, 12, 7, 352, 49, 0, 0);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIABILAPEG, 0, 134);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIABILAPEG, 1, 13);
    PAN_VARIAPERPROG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIABILAPEG, 0, 4);
    PAN_VARIAPERPROG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIABILAPEG, 1, 4);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIABILAPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIAZIONI, "CA8825B5-671F-4157-84C9-B8B865BC068B");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIAZIONI, "Variazioni");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIAZIONI, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIAZIONI, MyGlb.PANEL_LIST, 264, -9999, 80, 16, 0, 0);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIAZIONI, MyGlb.PANEL_FORM, 368, 67, 252, 49, 0, 0);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIAZIONI, 0, 55);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIAZIONI, 1, 13);
    PAN_VARIAPERPROG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIAZIONI, 0, 4);
    PAN_VARIAPERPROG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIAZIONI, 1, 4);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PERIODIVARIA, "7A8E5CB6-E3DB-43D3-A3A8-8208BC141BE1");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PERIODIVARIA, "Periodo di Variazione");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PERIODIVARIA, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PERIODIVARIA, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PERIODIVARIA, MyGlb.PANEL_LIST, 344, -9999, 200, 16, 0, 0);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PERIODIVARIA, MyGlb.PANEL_FORM, 368, 127, 252, 49, 0, 0);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PERIODIVARIA, 0, 118);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PERIODIVARIA, 1, 13);
    PAN_VARIAPERPROG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PERIODIVARIA, 0, 4);
    PAN_VARIAPERPROG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PERIODIVARIA, 1, 4);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PERIODIVARIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PROVVEDIMENT, "C781D94B-CC81-46D2-8924-6C59CE4136EE");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PROVVEDIMENT, "Provvedimento");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PROVVEDIMENT, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PROVVEDIMENT, MyGlb.PANEL_LIST, 544, -9999, 272, 16, 0, 0);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PROVVEDIMENT, MyGlb.PANEL_FORM, 12, 187, 608, 49, 0, 0);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PROVVEDIMENT, 0, 87);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PROVVEDIMENT, 1, 13);
    PAN_VARIAPERPROG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PROVVEDIMENT, 0, 4);
    PAN_VARIAPERPROG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PROVVEDIMENT, 1, 4);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAPERPROG_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAPERPROG.SetSize(MyGlb.OBJ_FIELD, 29);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PARTE, "EC7B9CE7-C1BC-4EFA-B5F9-D6DEDD84E839");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PARTE, "Parte");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PARTE, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE1, "BFCF0999-9BA5-40E0-BC23-89CC5CC2DA9A");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE1, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIABILAPEG, "A8D24D01-4713-4DE6-9744-5C5C703B1EC5");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIABILAPEG, "Variazioni Bilancio Peg");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIABILAPEG, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIABILAPEG, MyGlb.VIS_OPTBUTSENBOR);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIABILAPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE7, "F3DA26C3-8CFC-4B0F-BAFD-20E51C3B80BA");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE7, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE7, MyGlb.VIS_SFONEBORDTRA);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE7, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIAZIONI, "2CA1F734-5DFA-48F3-9B2E-1DEE1BA248B2");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIAZIONI, "Variazioni");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIAZIONI, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIAZIONI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE5, "969605B2-F7C9-4869-848C-A62CD6B07FE1");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE5, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE5, MyGlb.VIS_SFONEBORDTRA);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DAL, "8D94C583-DFAD-4CA1-B208-F57AD5202E67");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DAL, "Dal");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DAL, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_AL, "962B9E6E-5ABB-4D03-BD59-FB2CD25788D5");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_AL, "Al");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_AL, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE6, "FCDB8511-27A4-4EB4-A85A-ED3694BF5BB7");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE6, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE6, MyGlb.VIS_SFONEBORDTRA);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGRAMMA, "CD9F97E0-B4F9-493C-9D10-1B0C043E6F46");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGRAMMA, "Programma");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGRAMMA, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGRAMMA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGETTO, "89FF0DAA-DEE1-43A2-B5E8-4A9E951E2ED8");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGETTO, "Obiettivo Operativo");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGETTO, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGETTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOVARIAZIO, "D21A457E-F2C9-4F9A-8374-3FE186A870CB");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOVARIAZIO, "Tipo Variazione");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOVARIAZIO, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DELIBERA, "5C2383D4-36C9-4F33-9EA1-38371FA8FE2C");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DELIBERA, "Delibera");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DELIBERA, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIDELIBE, "83938C33-8AB6-43C2-94E5-39D0B4A0B25D");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIDELIBE, "-");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMERODELIBE, "FEA38F14-937C-416F-8FCE-EAE007594290");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMERODELIBE, "Numero Delibera");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMERODELIBE, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRADELIBER, "C4ECCD1D-A155-489A-8CD9-8856A8C5C063");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRADELIBER, "/");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNODELIBERA, "871F2640-4E0F-445C-A70D-6865866F88B8");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNODELIBERA, "Anno Delibera");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNODELIBERA, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELDELI, "8FD359B4-7E23-4335-A48F-340A21708320");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELDELI, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELDELI, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAPERPROG.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELDELI, 0, "wsearch1.gif", false);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROPOSTA, "E6C028F5-636B-4EAC-BFE1-A9C19FF59B72");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROPOSTA, "Proposta");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROPOSTA, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIPROPOS, "863400AF-B20C-461F-8566-7F711F4A436A");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIPROPOS, "-");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMEROPROPOS, "568FD6F2-A930-489A-B03C-7323B61E4DA4");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMEROPROPOS, "Numero Proposta");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMEROPROPOS, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRAPROPOST, "AA5E5725-14D2-430A-907F-3112A1378237");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRAPROPOST, "/");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNOPROPOSTA, "517692A4-D704-410F-9617-39A003D23934");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNOPROPOSTA, "Anno Proposta");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNOPROPOSTA, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELPROP, "0F6E3332-5FB4-4E43-8B94-EC37626AD7C6");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELPROP, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAPERPROG.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELPROP, 0, "wsearch1.gif", false);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ELABORA, "3D139F57-6969-4552-90F4-01C2CF6A0BCC");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ELABORA, "Elabora");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAPERPROG.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ELABORA, 0, "button1.gif", false);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DETTAGCAPITO, "D858AD87-B943-4A81-A184-53FD8B061B23");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DETTAGCAPITO, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DETTAGCAPITO, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DETTAGCAPITO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIINTERV, "110F2F14-6EF5-44A1-9961-EF0A17B85B6C");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIINTERV, "Descrizione Intervento");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIINTERV, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIINTERV, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIINTERV, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIVARIAZ, "8B1F3B6F-9C3C-4C5D-8F6A-DC74CBA7163F");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIVARIAZ, "Descrizione Variazione");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIVARIAZ, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIVARIAZ, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIVARIAZ, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOSTAMPA, "F1FE129B-B24F-409F-ACE7-5359246AAB86");
    PAN_VARIAPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOSTAMPA, "Tipo Stampa");
    PAN_VARIAPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOSTAMPA, "");
    PAN_VARIAPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOSTAMPA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOSTAMPA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAPERPROG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PARTE, MyGlb.PANEL_LIST, 72, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PARTE, MyGlb.PANEL_FORM, 404, 32, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PARTE, MyGlb.PANEL_FORM, 48);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_PARTE, -1, GRP_VARIAPERPROG_PARTE);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_PARTE, PPQRY_PARAMETRI336, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 2, 0, -13997);
    PAN_VARIAPERPROG.SetValueListItem(PFL_VARIAPERPROG_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_VARIAPERPROG.SetValueListItem(PFL_VARIAPERPROG_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_VARIAPERPROG.SetValueListItem(PFL_VARIAPERPROG_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE1, MyGlb.PANEL_LIST, 372, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE1, MyGlb.PANEL_FORM, 372, 36, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_NEWPANELABE1, -1, GRP_VARIAPERPROG_PARTE);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIABILAPEG, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIABILAPEG, MyGlb.PANEL_LIST, 112);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIABILAPEG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIABILAPEG, MyGlb.PANEL_LIST, "Var. Bil. Peg");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIABILAPEG, MyGlb.PANEL_FORM, 128, 32, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIABILAPEG, MyGlb.PANEL_FORM, 128);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIABILAPEG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIABILAPEG, MyGlb.PANEL_FORM, "Variaz. Bilancio Peg");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_VARIABILAPEG, -1, GRP_VARIAPERPROG_VARIABILAPEG);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_VARIABILAPEG, PPQRY_PARAMETRI336, "A.ROWNAMVABIPE", "ROWNAMVABIPE", 5, 2, 0, -13997);
    PAN_VARIAPERPROG.SetValueListItem(PFL_VARIAPERPROG_VARIABILAPEG, (new IDVariant("P")), "P.e.g", "", "", -1);
    PAN_VARIAPERPROG.SetValueListItem(PFL_VARIAPERPROG_VARIABILAPEG, (new IDVariant("SI")), "Bilancio", "", "", -1);
    PAN_VARIAPERPROG.SetValueListItem(PFL_VARIAPERPROG_VARIABILAPEG, (new IDVariant("PB")), "Entrambe", "", "", -1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE7, MyGlb.PANEL_LIST, 200, 32, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE7, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE7, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE7, MyGlb.PANEL_FORM, 16, 36, 20, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE7, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE7, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_NEWPANELABE7, -1, GRP_VARIAPERPROG_VARIABILAPEG);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_NEWPANELABE7, -1, "", "NEWPANELABE7", 0, 0, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIAZIONI, MyGlb.PANEL_LIST, 264, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIAZIONI, MyGlb.PANEL_FORM, 420, 92, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIAZIONI, MyGlb.PANEL_FORM, 128);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_VARIAZIONI, -1, GRP_VARIAPERPROG_VARIAZIONI);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_VARIAZIONI, PPQRY_PARAMETRI336, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 1, 0, -13997);
    PAN_VARIAPERPROG.SetValueListItem(PFL_VARIAPERPROG_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_VARIAPERPROG.SetValueListItem(PFL_VARIAPERPROG_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE5, MyGlb.PANEL_LIST, 172, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE5, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE5, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE5, MyGlb.PANEL_FORM, 372, 96, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE5, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE5, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_NEWPANELABE5, -1, GRP_VARIAPERPROG_VARIAZIONI);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_NEWPANELABE5, -1, "", "NEWPANELABE5", 0, 0, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DAL, MyGlb.PANEL_LIST, 344, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DAL, MyGlb.PANEL_LIST, 24);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DAL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DAL, MyGlb.PANEL_FORM, 388, 152, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DAL, MyGlb.PANEL_FORM, 28);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DAL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_DAL, -1, GRP_VARIAPERPROG_PERIODIVARIA);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_DAL, PPQRY_PARAMETRI336, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_AL, MyGlb.PANEL_LIST, 440, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_AL, MyGlb.PANEL_LIST, 20);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_AL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_AL, MyGlb.PANEL_LIST, "Al");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_AL, MyGlb.PANEL_FORM, 512, 152, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_AL, MyGlb.PANEL_FORM, 20);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_AL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_AL, MyGlb.PANEL_FORM, "Al");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_AL, -1, GRP_VARIAPERPROG_PERIODIVARIA);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_AL, PPQRY_PARAMETRI336, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE6, MyGlb.PANEL_LIST, 308, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE6, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE6, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE6, MyGlb.PANEL_FORM, 372, 152, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE6, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NEWPANELABE6, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_NEWPANELABE6, -1, GRP_VARIAPERPROG_PERIODIVARIA);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_NEWPANELABE6, -1, "", "NEWPANELABE6", 0, 0, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGRAMMA, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGRAMMA, MyGlb.PANEL_LIST, 64);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGRAMMA, MyGlb.PANEL_LIST, "Progr.");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGRAMMA, MyGlb.PANEL_FORM, 48, 68, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGRAMMA, MyGlb.PANEL_FORM, 76);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGRAMMA, MyGlb.PANEL_FORM, "Programma");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_PROGRAMMA, -1, -1);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_PROGRAMMA, PPQRY_PARAMETRI336, "A.ROWNAMEPROGR", "ROWNAMEPROGR", 5, 4, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGETTO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGETTO, MyGlb.PANEL_LIST, 52);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGETTO, MyGlb.PANEL_LIST, "Obiet. Oper.");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGETTO, MyGlb.PANEL_FORM, 4, 96, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGETTO, MyGlb.PANEL_FORM, 120);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROGETTO, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_PROGETTO, -1, -1);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_PROGETTO, PPQRY_PARAMETRI336, "A.ROWNAMEPROGE", "ROWNAMEPROGE", 5, 4, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOVARIAZIO, MyGlb.PANEL_LIST, 224, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOVARIAZIO, MyGlb.PANEL_LIST, 80);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tp. Var.");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOVARIAZIO, MyGlb.PANEL_FORM, 28, 152, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_TIPOVARIAZIO, -1, -1);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_TIPOVARIAZIO, PPQRY_PARAMETRI336, "A.ROWNAMTIPVAR", "ROWNAMTIPVAR", 1, 2, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DELIBERA, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DELIBERA, MyGlb.PANEL_FORM, 16, 212, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_DELIBERA, -1, GRP_VARIAPERPROG_PROVVEDIMENT);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_DELIBERA, PPQRY_PARAMETRI336, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIDELIBE, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIDELIBE, MyGlb.PANEL_FORM, 116, 212, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_TRATTIDELIBE, -1, GRP_VARIAPERPROG_PROVVEDIMENT);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMERODELIBE, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMERODELIBE, MyGlb.PANEL_LIST, "N. Dl.");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMERODELIBE, MyGlb.PANEL_FORM, 136, 212, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMERODELIBE, MyGlb.PANEL_FORM, 96);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_NUMERODELIBE, -1, GRP_VARIAPERPROG_PROVVEDIMENT);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_NUMERODELIBE, PPQRY_PARAMETRI336, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 5, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRADELIBER, MyGlb.PANEL_LIST, 164, 272, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRADELIBER, MyGlb.PANEL_FORM, 176, 212, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_BARRADELIBER, -1, GRP_VARIAPERPROG_PROVVEDIMENT);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNODELIBERA, MyGlb.PANEL_LIST, 624, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNODELIBERA, MyGlb.PANEL_LIST, "A. Dl.");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNODELIBERA, MyGlb.PANEL_FORM, 196, 212, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNODELIBERA, MyGlb.PANEL_FORM, 128);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_ANNODELIBERA, -1, GRP_VARIAPERPROG_PROVVEDIMENT);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_ANNODELIBERA, PPQRY_PARAMETRI336, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELDELI, MyGlb.PANEL_LIST, 508, 256, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELDELI, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELDELI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELDELI, MyGlb.PANEL_FORM, 236, 216, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELDELI, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELDELI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_APRISCELDELI, -1, GRP_VARIAPERPROG_PROVVEDIMENT);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_APRISCELDELI, -1, "", "APRISCELDELI", 0, 0, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROPOSTA, MyGlb.PANEL_LIST, 664, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROPOSTA, MyGlb.PANEL_FORM, 304, 212, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_PROPOSTA, -1, GRP_VARIAPERPROG_PROVVEDIMENT);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_PROPOSTA, PPQRY_PARAMETRI336, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIPROPOS, MyGlb.PANEL_LIST, 180, 288, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIPROPOS, MyGlb.PANEL_FORM, 480, 212, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_TRATTIPROPOS, -1, GRP_VARIAPERPROG_PROVVEDIMENT);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMEROPROPOS, MyGlb.PANEL_LIST, 736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMEROPROPOS, MyGlb.PANEL_LIST, "N. Pr.");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMEROPROPOS, MyGlb.PANEL_FORM, 500, 212, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMEROPROPOS, MyGlb.PANEL_FORM, 128);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_NUMEROPROPOS, -1, GRP_VARIAPERPROG_PROVVEDIMENT);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_NUMEROPROPOS, PPQRY_PARAMETRI336, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRAPROPOST, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRAPROPOST, MyGlb.PANEL_FORM, 540, 212, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_BARRAPROPOST, -1, GRP_VARIAPERPROG_PROVVEDIMENT);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNOPROPOSTA, MyGlb.PANEL_LIST, 776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. Pr.");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNOPROPOSTA, MyGlb.PANEL_FORM, 560, 212, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_ANNOPROPOSTA, -1, GRP_VARIAPERPROG_PROVVEDIMENT);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_ANNOPROPOSTA, PPQRY_PARAMETRI336, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELPROP, MyGlb.PANEL_LIST, 500, 248, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELPROP, MyGlb.PANEL_FORM, 600, 216, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_APRISCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_APRISCELPROP, -1, GRP_VARIAPERPROG_PROVVEDIMENT);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_APRISCELPROP, -1, "", "APRISCELPROP", 0, 0, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ELABORA, MyGlb.PANEL_LIST, 428, 292, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ELABORA, MyGlb.PANEL_FORM, 508, 256, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_ELABORA, -1, -1);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DETTAGCAPITO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DETTAGCAPITO, MyGlb.PANEL_LIST, 92);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dettaglio Capitoli");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DETTAGCAPITO, MyGlb.PANEL_FORM, 4, 288, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DETTAGCAPITO, MyGlb.PANEL_FORM, 92);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dett. Capitoli");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_DETTAGCAPITO, -1, -1);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_DETTAGCAPITO, PPQRY_PARAMETRI336, "A.ROWNAMDETCAP", "ROWNAMDETCAP", 5, 2, 0, -13997);
    PAN_VARIAPERPROG.SetValueListItem(PFL_VARIAPERPROG_DETTAGCAPITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAPERPROG.SetValueListItem(PFL_VARIAPERPROG_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIINTERV, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIINTERV, MyGlb.PANEL_LIST, "Descrizione Intervento");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIINTERV, MyGlb.PANEL_FORM, 4, 288, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIINTERV, MyGlb.PANEL_FORM, 120);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIINTERV, MyGlb.PANEL_FORM, "Descr. Intervento");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_DESCRIINTERV, -1, -1);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_DESCRIINTERV, PPQRY_PARAMETRI336, "A.ROWNAMDESINT", "ROWNAMDESINT", 5, 2, 0, -13997);
    PAN_VARIAPERPROG.SetValueListItem(PFL_VARIAPERPROG_DESCRIINTERV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAPERPROG.SetValueListItem(PFL_VARIAPERPROG_DESCRIINTERV, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIVARIAZ, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIVARIAZ, MyGlb.PANEL_LIST, 116);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIVARIAZ, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIVARIAZ, MyGlb.PANEL_LIST, "Descrizione Variazione");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIVARIAZ, MyGlb.PANEL_FORM, 4, 288, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIVARIAZ, MyGlb.PANEL_FORM, 116);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIVARIAZ, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_DESCRIVARIAZ, MyGlb.PANEL_FORM, "Descr. Variazione");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_DESCRIVARIAZ, -1, -1);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_DESCRIVARIAZ, PPQRY_PARAMETRI336, "A.ROWNAMDESVAR", "ROWNAMDESVAR", 5, 2, 0, -13997);
    PAN_VARIAPERPROG.SetValueListItem(PFL_VARIAPERPROG_DESCRIVARIAZ, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAPERPROG.SetValueListItem(PFL_VARIAPERPROG_DESCRIVARIAZ, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOSTAMPA, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOSTAMPA, MyGlb.PANEL_LIST, 68);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOSTAMPA, MyGlb.PANEL_LIST, "Tipo Stampa");
    PAN_VARIAPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOSTAMPA, MyGlb.PANEL_FORM, 4, 288, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOSTAMPA, MyGlb.PANEL_FORM, 68);
    PAN_VARIAPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERPROG_TIPOSTAMPA, MyGlb.PANEL_FORM, "Tp. Stam.");
    PAN_VARIAPERPROG.SetFieldPage(PFL_VARIAPERPROG_TIPOSTAMPA, -1, -1);
    PAN_VARIAPERPROG.SetFieldPanel(PFL_VARIAPERPROG_TIPOSTAMPA, PPQRY_PARAMETRI336, "A.ROWNAMTIPSTA", "ROWNAMTIPSTA", 12, 1, 0, -13997);
  }

  private void PAN_VARIAPERPROG_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAPERPROG.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as PROGRACODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as PROGRADESCRI ");
    SQL.append("from ");
    SQL.append("  PROGRAMMI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEPROGR~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEPROGR~~ = NULL) ");
    SQL.append("order by 1 ");
    PAN_VARIAPERPROG.SetQuery(PPQRY_PROGRAMMI, 0, SQL, PFL_VARIAPERPROG_PROGRAMMA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as PROGRACODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as PROGRADESCRI ");
    SQL.append("from ");
    SQL.append("  PROGRAMMI A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_VARIAPERPROG.SetQuery(PPQRY_PROGRAMMI, 1, SQL, PFL_VARIAPERPROG_PROGRAMMA, "");
    PAN_VARIAPERPROG.SetQueryDB(PPQRY_PROGRAMMI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as PROGETCODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as PROGETDESCRI ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEPROGE~~) ");
    SQL.append("and   (A.PROGRAMMA = ~~ROWNAMEPROGR~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEPROGE~~ = NULL) ");
    SQL.append("order by 1 ");
    PAN_VARIAPERPROG.SetQuery(PPQRY_PROGETTI, 0, SQL, PFL_VARIAPERPROG_PROGETTO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as PROGETCODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as PROGETDESCRI ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    SQL.append("where (A.PROGRAMMA = ~~ROWNAMEPROGR~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_VARIAPERPROG.SetQuery(PPQRY_PROGETTI, 1, SQL, PFL_VARIAPERPROG_PROGETTO, "");
    PAN_VARIAPERPROG.SetQueryDB(PPQRY_PROGETTI, MainFrm.Cf4armDBObject.DB, 4);
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
    SQL.append("order by 1 ");
    PAN_VARIAPERPROG.SetQuery(PPQRY_T54, 0, SQL, PFL_VARIAPERPROG_TIPOVARIAZIO, "");
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
    SQL.append("order by 1 ");
    PAN_VARIAPERPROG.SetQuery(PPQRY_T54, 1, SQL, PFL_VARIAPERPROG_TIPOVARIAZIO, "");
    PAN_VARIAPERPROG.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAPERPROG.SetIMDB(IMDB, "PQRY_PARAMETRI336", true);
    PAN_VARIAPERPROG.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_VARIAPERPROG.SetQueryIMDB(PPQRY_PARAMETRI336, IMDBDef12.PQRY_PARAMETRI336_RS, IMDBDef4.TBL_PARAMETRI338);
    JustLoaded = true;
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_PARTE, IMDBDef4.FLD_PARAMETRI338_ROWNAMEPARTE);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_VARIABILAPEG, IMDBDef4.FLD_PARAMETRI338_ROWNAMVABIPE);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_VARIAZIONI, IMDBDef4.FLD_PARAMETRI338_ROWNAMEVARIA);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_DAL, IMDBDef4.FLD_PARAMETRI338_ROWNAMEDAL);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_AL, IMDBDef4.FLD_PARAMETRI338_ROWNAMEAL);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_PROGRAMMA, IMDBDef4.FLD_PARAMETRI338_ROWNAMEPROGR);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_PROGETTO, IMDBDef4.FLD_PARAMETRI338_ROWNAMEPROGE);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_TIPOVARIAZIO, IMDBDef4.FLD_PARAMETRI338_ROWNAMTIPVAR);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_DELIBERA, IMDBDef4.FLD_PARAMETRI338_ROWNAMSEDDEL);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_NUMERODELIBE, IMDBDef4.FLD_PARAMETRI338_ROWNAMNUMDEL);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_ANNODELIBERA, IMDBDef4.FLD_PARAMETRI338_ROWNAMANNDEL);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_PROPOSTA, IMDBDef4.FLD_PARAMETRI338_ROWNAMUNIPRO);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_NUMEROPROPOS, IMDBDef4.FLD_PARAMETRI338_ROWNAMNUMPRO);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_ANNOPROPOSTA, IMDBDef4.FLD_PARAMETRI338_ROWNAMANNPRO);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_DETTAGCAPITO, IMDBDef4.FLD_PARAMETRI338_ROWNAMDETCAP);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_DESCRIINTERV, IMDBDef4.FLD_PARAMETRI338_ROWNAMDESINT);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_DESCRIVARIAZ, IMDBDef4.FLD_PARAMETRI338_ROWNAMDESVAR);
    PAN_VARIAPERPROG.SetFieldPrimaryIndex(PFL_VARIAPERPROG_TIPOSTAMPA, IMDBDef4.FLD_PARAMETRI338_ROWNAMTIPSTA);
    PAN_VARIAPERPROG.SetMasterTable(0, "PARAMETRI338");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAPERPROG.Status() == 2)
    {
      int oldListQBE = PAN_VARIAPERPROG.iUseListQBE;
      PAN_VARIAPERPROG.iUseListQBE = 0;
      PAN_VARIAPERPROG.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAPERPROG.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAPERPROG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAPERPROG) PAN_VARIAPERPROG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAPERPROG) PAN_VARIAPERPROG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAPERPROG) PAN_VARIAPERPROG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAPERPROG) PAN_VARIAPERPROG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIAPERPROG) PAN_VARIAPERPROG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
