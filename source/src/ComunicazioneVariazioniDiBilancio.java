// **********************************************
// Comunicazione Variazioni Di Bilancio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ComunicazioneVariazioniDiBilancio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_RESIDUPRESUN = 0;

  private static int PFL_PARAMETRI_PARTE = 0;
  private static int PFL_PARAMETRI_VARIAZIONI = 1;
  private static int PFL_PARAMETRI_RESIDUINIZIA = 2;
  private static int PFL_PARAMETRI_STAMPAPRECED = 3;
  private static int PFL_PARAMETRI_RESIPRESFINA = 4;
  private static int PFL_PARAMETRI_SALVATAGDATI = 5;
  private static int PFL_PARAMETRI_DESCRISTAMPA = 6;
  private static int PFL_PARAMETRI_DELIBERA = 7;
  private static int PFL_PARAMETRI_NUMERODELIBE = 8;
  private static int PFL_PARAMETRI_ANNODELIBERA = 9;
  private static int PFL_PARAMETRI_APRIDELIBERA = 10;
  private static int PFL_PARAMETRI_INFODELIBERA = 11;
  private static int PFL_PARAMETRI_UNITAPROPOST = 12;
  private static int PFL_PARAMETRI_NUMEROPROPOS = 13;
  private static int PFL_PARAMETRI_ANNOPROPOSTA = 14;
  private static int PFL_PARAMETRI_APRIPROPOSTA = 15;
  private static int PFL_PARAMETRI_DAL = 16;
  private static int PFL_PARAMETRI_CAPITOLIFPV = 17;
  private static int PFL_PARAMETRI_SOLOCAPIVARI = 18;
  private static int PFL_PARAMETRI_ELABORBUTTON = 19;
  private static int PFL_PARAMETRI_INVAALPRINCI = 20;
  private static int PFL_PARAMETRI_ETINVADEALPR = 21;

  private static int PPQRY_PARAMESTAM29 = 0;

  private static int PPQRY_WORBILVARSTO = 1;


  IDPanel PAN_PARAMETRI;
  private static int PFL_NOTEFUNZIONA_MODULO = 0;
  private static int PFL_NOTEFUNZIONA_PAGINA = 1;
  private static int PFL_NOTEFUNZIONA_FUNZIONE = 2;
  private static int PFL_NOTEFUNZIONA_DESCRIZIONE = 3;

  private static int PPQRY_NOTEFUNZION5 = 0;


  IDPanel PAN_NOTEFUNZIONA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI470(IMDB);
    //
    //
    Init_PQRY_PARAMESTAM29(IMDB);
    Init_PQRY_PARAMESTAM29_RS(IMDB);
    Init_PQRY_NOTEFUNZION5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI470(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI470, 17);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI470, "TBL_PARAMETRI470");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMEDELIB,5,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMEDATA,6,10,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMREPRIN, "ROWNAMREPRIN");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMREPRIN,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMCAPFPV, "ROWNAMCAPFPV");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMCAPFPV,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMSOCAVA, "ROWNAMSOCAVA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMSOCAVA,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMPROSTA, "ROWNAMPROSTA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMPROSTA,1,6,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMSALDAT, "ROWNAMSALDAT");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMSALDAT,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMDESSTA, "ROWNAMDESSTA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMDESSTA,5,100,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMREPRFI, "ROWNAMREPRFI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_ROWNAMREPRFI,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_RONAINVAPICI, "RONAINVAPICI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI470,IMDBDef6.FLD_PARAMETRI470_RONAINVAPICI,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI470, 0);
  }

  private static void Init_PQRY_PARAMESTAM29(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAMESTAM29, 17);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAMESTAM29, "PQRY_PARAMESTAM29");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB,5,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDATA,6,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRIN, "ROWNAMREPRIN");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRIN,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMCAPFPV, "ROWNAMCAPFPV");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMCAPFPV,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMSOCAVA, "ROWNAMSOCAVA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMSOCAVA,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMPROSTA, "ROWNAMPROSTA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMPROSTA,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMSALDAT, "ROWNAMSALDAT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMSALDAT,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMDESSTA, "ROWNAMDESSTA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMDESSTA,5,100,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRFI, "ROWNAMREPRFI");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRFI,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_RONAINVAPICI, "RONAINVAPICI");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29,IMDBDef16.PQSL_PARAMESTAM29_RONAINVAPICI,5,2,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PARAMESTAM29, 0);
  }

  private static void Init_PQRY_PARAMESTAM29_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAMESTAM29_RS, 17);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAMESTAM29_RS, "PQRY_PARAMESTAM29_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB,5,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDATA,6,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRIN, "ROWNAMREPRIN");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRIN,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMCAPFPV, "ROWNAMCAPFPV");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMCAPFPV,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMSOCAVA, "ROWNAMSOCAVA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMSOCAVA,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMPROSTA, "ROWNAMPROSTA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMPROSTA,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMSALDAT, "ROWNAMSALDAT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMSALDAT,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMDESSTA, "ROWNAMDESSTA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMDESSTA,5,100,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRFI, "ROWNAMREPRFI");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRFI,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_RONAINVAPICI, "RONAINVAPICI");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAMESTAM29_RS,IMDBDef16.PQSL_PARAMESTAM29_RONAINVAPICI,5,2,0);
  }

  private static void Init_PQRY_NOTEFUNZION5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_NOTEFUNZION5, 4);
    IMDB.set_TblCode(IMDBDef16.PQRY_NOTEFUNZION5, "PQRY_NOTEFUNZION5");
    IMDB.set_FldCode(IMDBDef16.PQRY_NOTEFUNZION5,IMDBDef16.PQSL_NOTEFUNZION5_MODULO, "MODULO");
    IMDB.SetFldParams(IMDBDef16.PQRY_NOTEFUNZION5,IMDBDef16.PQSL_NOTEFUNZION5_MODULO,5,20,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_NOTEFUNZION5,IMDBDef16.PQSL_NOTEFUNZION5_PAGINA, "PAGINA");
    IMDB.SetFldParams(IMDBDef16.PQRY_NOTEFUNZION5,IMDBDef16.PQSL_NOTEFUNZION5_PAGINA,5,200,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_NOTEFUNZION5,IMDBDef16.PQSL_NOTEFUNZION5_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef16.PQRY_NOTEFUNZION5,IMDBDef16.PQSL_NOTEFUNZION5_FUNZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_NOTEFUNZION5,IMDBDef16.PQSL_NOTEFUNZION5_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef16.PQRY_NOTEFUNZION5,IMDBDef16.PQSL_NOTEFUNZION5_DESCRIZIONE,9,9999,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_NOTEFUNZION5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ComunicazioneVariazioniDiBilancio(MyWebEntryPoint w, IMDBObj imdb)
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
  public ComunicazioneVariazioniDiBilancio()
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
    FormIdx = MyGlb.FRM_COMUVARDIBIL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "446FBDD3-4188-4B30-8A0D-114DE233635C";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 852;
    DesignHeight = 426;
    set_Caption(new IDVariant("Comunicazione Variazioni di Bilancio"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 852;
    Frames[1].Height = 400;
    Frames[1].FormFactor = 0.539906;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 460;
    Frames[2].Height = 400;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 460;
    Frames[2].FixedHeight = 400;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 460-MyGlb.PAN_OFFS_X, 400-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "28D13E36-0D14-4DAE-A545-497D106CCC7D");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1452, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 392;
    Frames[3].Height = 400;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "NOTE FUNZIONALITA";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 400;
    PAN_NOTEFUNZIONA = new IDPanel(w, this, 3, "PAN_NOTEFUNZIONA");
    Frames[3].Content = PAN_NOTEFUNZIONA;
    PAN_NOTEFUNZIONA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTEFUNZIONA.VS = MainFrm.VisualStyleList;
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 392-MyGlb.PAN_OFFS_X, 400-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "95E0F78E-9B87-45B7-9C95-008F35238833");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTEFUNZIONA.InitStatus = 2;
    PAN_NOTEFUNZIONA_Init();
    PAN_NOTEFUNZIONA_InitFields();
    PAN_NOTEFUNZIONA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI470, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        COMUVARDIBIL_PARAMESTAM29();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRIDELIBERA) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRIPROPOSTA) {
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
    return (obj instanceof ComunicazioneVariazioniDiBilancio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ComunicazioneVariazioniDiBilancio.class.getName() : (Glb.ClassWithPackage(ComunicazioneVariazioniDiBilancio.class) ? ComunicazioneVariazioniDiBilancio.class.getName().substring(ComunicazioneVariazioniDiBilancio.class.getPackage().getName().length() + 1) : ComunicazioneVariazioniDiBilancio.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Dynamic Properties Event
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
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, 0).equals((new IDVariant("E")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRIN, 0).equals((new IDVariant("S")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMSALDAT, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneVariazioniDiBilancio", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
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
      // Parametri On Updating Row Event Body
      // Procedure Body
      // 
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_DELIBERA)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMERODELIBE)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNODELIBERA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0))))
        {
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0, (new IDVariant()));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0))))
        {
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0, IDL.Upper(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0))))
        {
          IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
          IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
          v_SEDEDEL = IDL.Upper(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0));
          v_NUMERODEL = IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0);
          v_ANNODEL = IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0);
          MainFrm.ControlloDelibereNonDaInserire(v_SEDEDEL, v_ANNODEL, v_NUMERODEL);
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0, new IDVariant(v_SEDEDEL));
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0, new IDVariant(v_NUMERODEL));
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0, new IDVariant(v_ANNODEL));
          if (!(IDL.IsNull(v_SEDEDEL)))
          {
            IDVariant v_VMAX = null;
            v_VMAX = (new IDVariant());
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  MAX(A.D_DATA_REG) as MAXVARDDATRE ");
            SQL.append("from ");
            SQL.append("  VARCOM A ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.SEDE_DEL = " + IDL.CSql(v_SEDEDEL, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(v_NUMERODEL, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(v_ANNODEL, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VMAX = QV.Get("MAXVARDDATRE", IDVariant.DATETIME) ;
            }
            QV.Close();
            if (!(IDL.IsNull(v_VMAX)))
            {
              if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDATA, 0)))
              {
                IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDATA, 0, new IDVariant(v_VMAX));
              }
            }
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_UNITAPROPOST)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_ANNOPROPOSTA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0))))
        {
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0, (new IDVariant()));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0)));
          if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0))))
          {
            IDVariant v_VMAX = null;
            v_VMAX = (new IDVariant());
            if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEVARIA, 0).equals((new IDVariant("D")), true))
            {
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  MAX(A.D_DATA_REG) as MAXVARDDATRE ");
              SQL.append("from ");
              SQL.append("  VARCOM A ");
              SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ANNO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VMAX = QV.Get("MAXVARDDATRE", IDVariant.DATETIME) ;
              }
              QV.Close();
            }
            else
            {
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  MAX(A.D_DATA_REG) as MAXVARDDATRE ");
              SQL.append("from ");
              SQL.append("  VARCOMPRO A ");
              SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ANNO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VMAX = QV.Get("MAXVARDDATRE", IDVariant.DATETIME) ;
              }
              QV.Close();
            }
            if (!(IDL.IsNull(v_VMAX)))
            {
              if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDATA, 0)))
              {
                IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDATA, 0, new IDVariant(v_VMAX));
              }
            }
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_VARIAZIONI)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0, (new IDVariant()));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_RESIDUINIZIA)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMPROSTA, 0, (new IDVariant()));
        PAN_PARAMETRI.ClearValueList(PFL_PARAMETRI_RESIPRESFINA);
        if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRIN, 0).equals((new IDVariant("I")), true))
        {
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIPRESFINA, (new IDVariant("I")), ((new IDVariant("I")).equals((new IDVariant("B")))? new IDVariant("Bilancio") : (new IDVariant("I")).equals((new IDVariant("I")))? new IDVariant("Iniziali") : (new IDVariant("I")).equals((new IDVariant("A")))? new IDVariant("Aggiornati") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIPRESFINA, (new IDVariant("A")), ((new IDVariant("A")).equals((new IDVariant("B")))? new IDVariant("Bilancio") : (new IDVariant("A")).equals((new IDVariant("I")))? new IDVariant("Iniziali") : (new IDVariant("A")).equals((new IDVariant("A")))? new IDVariant("Aggiornati") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
        else
        {
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIPRESFINA, (new IDVariant("B")), ((new IDVariant("B")).equals((new IDVariant("B")))? new IDVariant("Bilancio") : (new IDVariant("B")).equals((new IDVariant("I")))? new IDVariant("Iniziali") : (new IDVariant("B")).equals((new IDVariant("A")))? new IDVariant("Aggiornati") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIPRESFINA, (new IDVariant("I")), ((new IDVariant("I")).equals((new IDVariant("B")))? new IDVariant("Bilancio") : (new IDVariant("I")).equals((new IDVariant("I")))? new IDVariant("Iniziali") : (new IDVariant("I")).equals((new IDVariant("A")))? new IDVariant("Aggiornati") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIPRESFINA, (new IDVariant("A")), ((new IDVariant("A")).equals((new IDVariant("B")))? new IDVariant("Bilancio") : (new IDVariant("A")).equals((new IDVariant("I")))? new IDVariant("Iniziali") : (new IDVariant("A")).equals((new IDVariant("A")))? new IDVariant("Aggiornati") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PARTE)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMPROSTA, 0, (new IDVariant()));
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_SALVATAGDATI)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMDESSTA, 0, (new IDVariant()));
        if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMSALDAT, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, 0, (new IDVariant("ES")));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_RESIPRESFINA)), true) && FieldWasModified.booleanValue())
      {
        PAN_PARAMETRI.ClearValueList(PFL_PARAMETRI_RESIDUINIZIA);
        if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRFI, 0).equals((new IDVariant("B")), true))
        {
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUINIZIA, (new IDVariant("B")), ((new IDVariant("B")).equals((new IDVariant("B")))? new IDVariant("di Bilancio") : (new IDVariant("B")).equals((new IDVariant("I")))? new IDVariant("Iniziali") : (new IDVariant("B")).equals((new IDVariant("S")))? new IDVariant("Stampa Precedente") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUINIZIA, (new IDVariant("S")), ((new IDVariant("S")).equals((new IDVariant("B")))? new IDVariant("di Bilancio") : (new IDVariant("S")).equals((new IDVariant("I")))? new IDVariant("Iniziali") : (new IDVariant("S")).equals((new IDVariant("S")))? new IDVariant("Stampa Precedente") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
        else
        {
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUINIZIA, (new IDVariant("B")), ((new IDVariant("B")).equals((new IDVariant("B")))? new IDVariant("di Bilancio") : (new IDVariant("B")).equals((new IDVariant("I")))? new IDVariant("Iniziali") : (new IDVariant("B")).equals((new IDVariant("S")))? new IDVariant("Stampa Precedente") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUINIZIA, (new IDVariant("I")), ((new IDVariant("I")).equals((new IDVariant("B")))? new IDVariant("di Bilancio") : (new IDVariant("I")).equals((new IDVariant("I")))? new IDVariant("Iniziali") : (new IDVariant("I")).equals((new IDVariant("S")))? new IDVariant("Stampa Precedente") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUINIZIA, (new IDVariant("S")), ((new IDVariant("S")).equals((new IDVariant("B")))? new IDVariant("di Bilancio") : (new IDVariant("S")).equals((new IDVariant("I")))? new IDVariant("Iniziali") : (new IDVariant("S")).equals((new IDVariant("S")))? new IDVariant("Stampa Precedente") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneVariazioniDiBilancio", "ParametriOnUpdatingRowEvent", _e);
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
      LOADEVENT_PARAMEDELETE();
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMEPARTE, 0, (new IDVariant("ES")));
      // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_PARTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMEVARIA, 0, (new IDVariant("D")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMREPRIN, 0, (new IDVariant("B")));
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMSOCAVA, 0, (new IDVariant("NO")));
      if (!(MainFrm.GESTIODELIBE.booleanValue()))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMSALDAT, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMREPRFI, 0, (new IDVariant("A")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_RONAINVAPICI, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneVariazioniDiBilancio", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMEPARTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMEVARIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMEDELIB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMEDATA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMREPRIN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMCAPFPV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMSOCAVA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMPROSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMSALDAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMDESSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMREPRFI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_RONAINVAPICI, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneVariazioniDiBilancio", "EndModalEvent", _e);
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
      MainFrm.ErrObj.ProcError ("ComunicazioneVariazioniDiBilancio", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMEPARTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMEVARIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMEDELIB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMEDATA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMREPRIN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMCAPFPV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMSOCAVA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMPROSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMSALDAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMDESSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMREPRFI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_RONAINVAPICI, 0, new IDVariant());
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDATA, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Data obbligatoria"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRIN, 0).equals((new IDVariant("S")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMPROSTA, 0)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Selezionare una Stampa precedente"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMSALDAT, 0).equals((new IDVariant("SI")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMDESSTA, 0)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Descrizione Stampa obbligatoria"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
        else
        {
          IDVariant v_VCOUNT1 = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  WORK_BIL_VAR_STORICO A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.DATA_STAMPA = TRUNC( SYSDATE )) ");
          SQL.append("and   (A.DESCRIZIONE_STAMPA = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMDESSTA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT1 = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT1.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_SM = new IDVariant(0,IDVariant.STRING);
            v_SM = (new IDVariant("E' già stata salvata una stampa nella giornata odierna con la stessa descrizione. Variare la descrizione"));
            MainFrm.set_AlertMessage(v_SM); 
            return 0;
          }
        }
      }
      if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEVARIA, 0).equals((new IDVariant("D")), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0))))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0)) || IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0)))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("I dati della Delibera sono incompleti ", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            return 0;
          }
        }
        else if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0))))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0)))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("I dati della Proposta sono incompleti ", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            return 0;
          }
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Obbligatorio indicare la Delibera o la Proposta"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0)))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Proposta obbligatoria"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
        else if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0)))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("I dati della proposta sono incompleti ", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  VARCOMPRO A ");
        SQL.append("where (A.ANNO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ES', A.E_S, " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.equals((new IDVariant(0)), true))
        {
          IDVariant v_AVVISOPROV = new IDVariant(0,IDVariant.STRING);
          v_AVVISOPROV = (new IDVariant("Non sono presenti Variazioni Provvisorie per la proposta indicata"));
          MainFrm.set_AlertMessage(v_AVVISOPROV); 
          return 0;
        }
      }
      else
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0))))
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  VARCOM A ");
          SQL.append("where (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ES', A.E_S, " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ")) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISODEL = new IDVariant(0,IDVariant.STRING);
            v_AVVISODEL = (new IDVariant("Non sono presenti Variazioni Definitive per la Delibera indicata"));
            MainFrm.set_AlertMessage(v_AVVISODEL); 
            return 0;
          }
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0))))
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  VARCOM A ");
          SQL.append("where (A.ANNO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_PROPOSTA = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ES', A.E_S, " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ")) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISOPROP = new IDVariant(0,IDVariant.STRING);
            v_AVVISOPROP = (new IDVariant("Non sono presenti Variazioni Definitive per la Proposta indicata"));
            MainFrm.set_AlertMessage(v_AVVISOPROP); 
            return 0;
          }
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, 0).compareTo((new IDVariant("S")), true)!=0)
      {
        MainFrm.Cf4armDBObject.WORKBILVARE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDATA, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRIN, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEVARIA, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMPROSTA, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMSALDAT, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMDESSTA, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRFI, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_RONAINVAPICI, 0));
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if (IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, 0).compareTo((new IDVariant("E")), true)!=0)
      {
        MainFrm.Cf4armDBObject.WORKBILVARS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDATA, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRIN, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMCAPFPV, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEVARIA, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMPROSTA, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMSALDAT, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMDESSTA, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMREPRFI, 0), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_RONAINVAPICI, 0));
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_NOMESTAMPA = null;
        v_NOMESTAMPA = (new IDVariant("Comunicazione_Var_Bil"));
        MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("PARTE")), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEPARTE, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("SEDE_DEL")), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("NUM_DEL")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0),(new IDVariant(-1)))));
        MainFrm.SetParametroStampaJasper((new IDVariant("ANNO_DEL")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0),(new IDVariant(-1)))));
        MainFrm.SetParametroStampaJasper((new IDVariant("UNITA_PROP")), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMUNIPRO, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("NUM_PROP")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMPRO, 0),(new IDVariant(-1)))));
        MainFrm.SetParametroStampaJasper((new IDVariant("ANNO_PROP")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNPRO, 0),(new IDVariant(-1)))));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDATA, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("SOLO_CAP_VARIATI")), IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMSOCAVA, 0));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneVariazioniDiBilancio", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibere Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneVariazioniDiBilancio", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMEDELIB, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef16.PQRY_PARAMESTAM29, IMDBDef16.PQSL_PARAMESTAM29_ROWNAMNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneVariazioniDiBilancio", "InfoDelibere", _e);
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
      MainFrm.ErrObj.ProcError ("ComunicazioneVariazioniDiBilancio", "ApriProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Stampa
  // Primary record source for panel data
  // **********************************************************************
  private void COMUVARDIBIL_PARAMESTAM29() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PARAMESTAM29_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI470, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI470, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PARAMESTAM29_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PARAMESTAM29_RS, 0, IMDBDef6.TBL_PARAMETRI470, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 0, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 1, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMEDELIB, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 2, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 3, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 4, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMEDATA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 5, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 6, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 7, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 8, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 9, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMREPRIN, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 10, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMCAPFPV, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 11, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMSOCAVA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 12, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMPROSTA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 13, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMSALDAT, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 14, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMDESSTA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 15, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_ROWNAMREPRFI, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAMESTAM29_RS, 16, 0, IMDBDef6.TBL_PARAMETRI470, IMDBDef6.FLD_PARAMETRI470_RONAINVAPICI, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI470, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI470, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI470, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PARAMESTAM29_RS, 0);
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

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_APRIDELIBERA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRIPROPOSTA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_RESIDUPRESUN, "DE22494E-031E-4AD9-94BC-1EEEDDBB2FBE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_RESIDUPRESUN, "Residui Presunti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_RESIDUPRESUN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_RESIDUPRESUN, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_LIST, 0, -9999, 100, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_RESIDUPRESUN, MyGlb.PANEL_FORM, 8, 67, 444, 149, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_RESIDUPRESUN, 0, 91);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_RESIDUPRESUN, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_RESIDUPRESUN, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_RESIDUPRESUN, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_RESIDUPRESUN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 22);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "B6231751-8B19-434A-912A-5C504209CB5B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "Parte");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "C8B308C2-7092-4E3A-9D45-5544278A9269");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "Variazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUINIZIA, "2CE21883-9150-45ED-B113-817A1C0A621F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUINIZIA, "Residui Iniziali");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUINIZIA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUINIZIA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUINIZIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, "1A0BC693-5551-4D1D-AC3C-D9B4F8BCB64B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, "Stampa Precedente");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIPRESFINA, "BE8A7763-CAAE-4F41-AB3B-C45EAF6818D8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIPRESFINA, "Residui Finali");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIPRESFINA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIPRESFINA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIPRESFINA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVATAGDATI, "445B656D-4F47-4777-A7D3-2F3FABE5C019");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVATAGDATI, "Salvataggio Dati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVATAGDATI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVATAGDATI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVATAGDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, "B04B9658-9FA6-44FA-9429-C6E675EC1B6B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, "Descrizione Stampa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "641F01EF-B5A6-43E4-9CC7-2555B6FC3530");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "50619A59-0964-4D3C-93E6-ABD30F8F8786");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "-");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "82DCE945-8BE6-43CF-8F5D-E736FD009212");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, "76DEF05C-F22F-4971-946D-D4233E89141B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, "8D83B138-0840-4FA9-B364-4E5374F4BA6B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPOST, "C600000D-BB71-4CFD-AFA9-C9B2739A839D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPOST, "Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPOST, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPOST, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "D7F1DF4D-1DF1-4024-B25E-93A7456202EC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "-");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "57A44D6D-6FFD-4896-828E-EB10DD688EF7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, "639CF953-42A9-4786-B4C5-58BA93C324E0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "CDA5F9D5-FAD5-4FB9-B300-68DE301C32DD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Data");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, "EDB0737E-8E92-48FD-A2DF-2D4AD6B68238");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, "Anche Capitoli FPV");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCAPIVARI, "E92866D3-7818-43F1-8C54-CF5DB496ED15");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCAPIVARI, "Solo Capitoli variati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCAPIVARI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCAPIVARI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCAPIVARI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "1C743377-5E6C-479E-868A-798EAFD0E8F2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, "7C385164-C143-48BD-94EC-1F827A254EE0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, "Includi Variazioni Altre Proposte In Colonna Iniziale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, "Descrivi il contenuto del campo");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETINVADEALPR, "F4152200-D000-4D9B-82F1-A220279F0276");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETINVADEALPR, "Includi Variazioni delle altre Proposte in Colonna Iniziale");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETINVADEALPR, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETINVADEALPR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 84, 20, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARTE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARTE, PPQRY_PARAMESTAM29, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, "Var.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 64, 44, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VARIAZIONI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VARIAZIONI, PPQRY_PARAMESTAM29, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUINIZIA, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUINIZIA, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUINIZIA, MyGlb.PANEL_LIST, "Residui Iniziali");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUINIZIA, MyGlb.PANEL_FORM, 32, 92, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUINIZIA, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIDUINIZIA, MyGlb.PANEL_FORM, "Residui Iniziali");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_RESIDUINIZIA, -1, GRP_PARAMETRI_RESIDUPRESUN);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_RESIDUINIZIA, PPQRY_PARAMESTAM29, "A.ROWNAMREPRIN", "ROWNAMREPRIN", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUINIZIA, (new IDVariant("B")), "di Bilancio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUINIZIA, (new IDVariant("I")), "Iniziali", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIDUINIZIA, (new IDVariant("S")), "Stampa Precedente", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, MyGlb.PANEL_LIST, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, MyGlb.PANEL_LIST, "Stampa Precedente");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, MyGlb.PANEL_FORM, 12, 120, 432, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_STAMPAPRECED, MyGlb.PANEL_FORM, "Stampa Precedente");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_STAMPAPRECED, -1, GRP_PARAMETRI_RESIDUPRESUN);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_STAMPAPRECED, PPQRY_PARAMESTAM29, "A.ROWNAMPROSTA", "ROWNAMPROSTA", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIPRESFINA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIPRESFINA, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIPRESFINA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIPRESFINA, MyGlb.PANEL_LIST, "Residui Finali");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIPRESFINA, MyGlb.PANEL_FORM, 48, 144, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIPRESFINA, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIPRESFINA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESIPRESFINA, MyGlb.PANEL_FORM, "Residui Finali");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_RESIPRESFINA, -1, GRP_PARAMETRI_RESIDUPRESUN);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_RESIPRESFINA, PPQRY_PARAMESTAM29, "A.ROWNAMREPRFI", "ROWNAMREPRFI", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIPRESFINA, (new IDVariant("B")), "Bilancio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIPRESFINA, (new IDVariant("I")), "Iniziali", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESIPRESFINA, (new IDVariant("A")), "Aggiornati", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVATAGDATI, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVATAGDATI, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVATAGDATI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVATAGDATI, MyGlb.PANEL_LIST, "Salvataggio Dati");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVATAGDATI, MyGlb.PANEL_FORM, 32, 168, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVATAGDATI, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVATAGDATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SALVATAGDATI, MyGlb.PANEL_FORM, "Salvataggio Dati");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SALVATAGDATI, -1, GRP_PARAMETRI_RESIDUPRESUN);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SALVATAGDATI, PPQRY_PARAMESTAM29, "A.ROWNAMSALDAT", "ROWNAMSALDAT", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SALVATAGDATI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SALVATAGDATI, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, MyGlb.PANEL_LIST, "Descrizione Stampa");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, MyGlb.PANEL_FORM, 16, 192, 432, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRISTAMPA, MyGlb.PANEL_FORM, "Descrizione Stampa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRISTAMPA, -1, GRP_PARAMETRI_RESIDUPRESUN);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRISTAMPA, PPQRY_PARAMESTAM29, "A.ROWNAMDESSTA", "ROWNAMDESSTA", 5, 100, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 80, 220, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERA, PPQRY_PARAMESTAM29, "A.ROWNAMEDELIB", "ROWNAMEDELIB", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, "-");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 208, 220, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, "-");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODELIBE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODELIBE, PPQRY_PARAMESTAM29, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 276, 220, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODELIBERA, PPQRY_PARAMESTAM29, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_LIST, 232, 24, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_FORM, 344, 222, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRIDELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRIDELIBERA, -1, "", "APRIDELIBERA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 224, 16, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 364, 222, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFODELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPOST, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPOST, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPOST, MyGlb.PANEL_LIST, "Proposta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPOST, MyGlb.PANEL_FORM, 76, 244, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPOST, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPOST, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UNITAPROPOST, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UNITAPROPOST, PPQRY_PARAMESTAM29, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, "-");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 208, 244, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, "-");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROPROPOS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROPROPOS, PPQRY_PARAMESTAM29, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 276, 244, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOPROPOSTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOPROPOSTA, PPQRY_PARAMESTAM29, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, MyGlb.PANEL_LIST, 240, 32, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, MyGlb.PANEL_FORM, 344, 248, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRIPROPOSTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRIPROPOSTA, -1, "", "APRIPROPOSTA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Data");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 64, 268, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Data");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMESTAM29, "A.ROWNAMEDATA", "ROWNAMEDATA", 6, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, MyGlb.PANEL_LIST, "Anche Capitoli FPV");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, MyGlb.PANEL_FORM, 24, 292, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLIFPV, MyGlb.PANEL_FORM, "Anche Capitoli FPV");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPITOLIFPV, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPITOLIFPV, PPQRY_PARAMESTAM29, "A.ROWNAMCAPFPV", "ROWNAMCAPFPV", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CAPITOLIFPV, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CAPITOLIFPV, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCAPIVARI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCAPIVARI, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCAPIVARI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCAPIVARI, MyGlb.PANEL_LIST, "Solo Capitoli variati");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCAPIVARI, MyGlb.PANEL_FORM, 16, 316, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCAPIVARI, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCAPIVARI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCAPIVARI, MyGlb.PANEL_FORM, "Solo Capitoli variati");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOCAPIVARI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOCAPIVARI, PPQRY_PARAMESTAM29, "A.ROWNAMSOCAVA", "ROWNAMSOCAVA", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCAPIVARI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCAPIVARI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 100, 168, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 324, 348, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORBUTTON, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, MyGlb.PANEL_LIST, 0, 36, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, MyGlb.PANEL_LIST, 300);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, MyGlb.PANEL_LIST, "Includi Variazioni Altre Proposte In Colonna Iniziale");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, MyGlb.PANEL_FORM, 140, 352, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INVAALPRINCI, MyGlb.PANEL_FORM, "In. Var. A. Pr. I. Cl. In.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INVAALPRINCI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INVAALPRINCI, PPQRY_PARAMESTAM29, "A.RONAINVAPICI", "RONAINVAPICI", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_INVAALPRINCI, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_INVAALPRINCI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETINVADEALPR, MyGlb.PANEL_LIST, 236, 276, 120, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETINVADEALPR, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETINVADEALPR, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETINVADEALPR, MyGlb.PANEL_FORM, 12, 340, 128, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETINVADEALPR, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETINVADEALPR, MyGlb.PANEL_FORM, 3);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETINVADEALPR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETINVADEALPR, -1, "", "ETINVADEALPR", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_Alignment(PFL_PARAMETRI_ETINVADEALPR, 4);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO_STAMPA as WOBIVASTPRST, ");
    SQL.append("  SUM(0) as FAKE, ");
    SQL.append("  TO_CHAR ( A.DATA_STAMPA,'dd/mm/yyyy') || ' ' || A.DESCRIZIONE_STAMPA as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  WORK_BIL_VAR_STORICO A ");
    SQL.append("where (A.PROGRESSIVO_STAMPA = ~~ROWNAMPROSTA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~ROWNAMEPARTE~~ = 'ES' OR (INSTR(A.PARTE, ~~ROWNAMEPARTE~~) > 0)) ");
    SQL.append("group by ");
    SQL.append("  A.PROGRESSIVO_STAMPA, ");
    SQL.append("  TO_CHAR ( A.DATA_STAMPA,'dd/mm/yyyy') || ' ' || A.DESCRIZIONE_STAMPA ");
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO_STAMPA desc ");
    PAN_PARAMETRI.SetQuery(PPQRY_WORBILVARSTO, 0, SQL, PFL_PARAMETRI_STAMPAPRECED, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO_STAMPA as WOBIVASTPRST, ");
    SQL.append("  SUM(0) as FAKE, ");
    SQL.append("  TO_CHAR ( A.DATA_STAMPA,'dd/mm/yyyy') || ' ' || A.DESCRIZIONE_STAMPA as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  WORK_BIL_VAR_STORICO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~ROWNAMEPARTE~~ = 'ES' OR (INSTR(A.PARTE, ~~ROWNAMEPARTE~~) > 0)) ");
    SQL.append("group by ");
    SQL.append("  A.PROGRESSIVO_STAMPA, ");
    SQL.append("  TO_CHAR ( A.DATA_STAMPA,'dd/mm/yyyy') || ' ' || A.DESCRIZIONE_STAMPA ");
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO_STAMPA desc ");
    PAN_PARAMETRI.SetQuery(PPQRY_WORBILVARSTO, 1, SQL, PFL_PARAMETRI_STAMPAPRECED, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_WORBILVARSTO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMESTAM29", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMESTAM29, IMDBDef16.PQRY_PARAMESTAM29_RS, IMDBDef6.TBL_PARAMETRI470);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PARTE, IMDBDef6.FLD_PARAMETRI470_ROWNAMEPARTE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_VARIAZIONI, IMDBDef6.FLD_PARAMETRI470_ROWNAMEVARIA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_RESIDUINIZIA, IMDBDef6.FLD_PARAMETRI470_ROWNAMREPRIN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_STAMPAPRECED, IMDBDef6.FLD_PARAMETRI470_ROWNAMPROSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_RESIPRESFINA, IMDBDef6.FLD_PARAMETRI470_ROWNAMREPRFI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SALVATAGDATI, IMDBDef6.FLD_PARAMETRI470_ROWNAMSALDAT);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DESCRISTAMPA, IMDBDef6.FLD_PARAMETRI470_ROWNAMDESSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DELIBERA, IMDBDef6.FLD_PARAMETRI470_ROWNAMEDELIB);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODELIBE, IMDBDef6.FLD_PARAMETRI470_ROWNAMNUMDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODELIBERA, IMDBDef6.FLD_PARAMETRI470_ROWNAMANNDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UNITAPROPOST, IMDBDef6.FLD_PARAMETRI470_ROWNAMUNIPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROPROPOS, IMDBDef6.FLD_PARAMETRI470_ROWNAMNUMPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOPROPOSTA, IMDBDef6.FLD_PARAMETRI470_ROWNAMANNPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef6.FLD_PARAMETRI470_ROWNAMEDATA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAPITOLIFPV, IMDBDef6.FLD_PARAMETRI470_ROWNAMCAPFPV);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOCAPIVARI, IMDBDef6.FLD_PARAMETRI470_ROWNAMSOCAVA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_INVAALPRINCI, IMDBDef6.FLD_PARAMETRI470_RONAINVAPICI);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI470");
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

  private void PAN_NOTEFUNZIONA_Init()
  {

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "8B1CE587-0739-4775-97F7-D0D9C4A31C4D");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "MODULO");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "56B60274-F98A-4AC5-8AEB-2C99408277E5");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "PAGINA");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "711915CC-9536-48F0-87A1-265D9BFB6E99");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "FUNZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "CF2C1974-3622-4D88-9887-7E12025AE7C9");
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
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_MODULO, PPQRY_NOTEFUNZION5, "A.MODULO", "MODULO", 5, 20, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 4, 164, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, "PAGINA");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 4, 28, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, "PAGINA");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_PAGINA, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_PAGINA, PPQRY_NOTEFUNZION5, "A.PAGINA", "PAGINA", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 4, 200, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 4, 52, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_FUNZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_FUNZIONE, PPQRY_NOTEFUNZION5, "A.FUNZIONE", "FUNZIONE", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 104, 236, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 12, 16, 340, 212, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 16);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_DESCRIZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_DESCRIZIONE, PPQRY_NOTEFUNZION5, "A.DESCRIZIONE", "DESCRIZIONE", 9, 9999, 0, -13997);
  }

  private void PAN_NOTEFUNZIONA_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTEFUNZIONA.SetIMDB(IMDB, "PQRY_NOTEFUNZION5", true);
    PAN_NOTEFUNZIONA.set_SetString(MyGlb.MASTER_ROWNAME, "NOTE FUNZIONALITA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MODULO as MODULO, ");
    SQL.append("  A.PAGINA as PAGINA, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (A.PAGINA = " + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_COMUVARDIBIL,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.FUNZIONE = 'Comunicazione_Var_Bil') ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION5, 5, SQL, -1, "");
    PAN_NOTEFUNZIONA.SetQueryDB(PPQRY_NOTEFUNZION5, MainFrm.Cf4armDBObject.DB, 4);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
