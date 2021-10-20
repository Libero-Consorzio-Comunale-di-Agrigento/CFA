// **********************************************
// Estratto Conto Soggetto
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EstrattoContoSoggetto extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_DOCUMENTI = 0;
  private static int GRP_PARAM_DATADOCUMENT = 1;
  private static int GRP_PARAM_SOGGETTO = 2;

  private static int PFL_PARAM_PARTE = 0;
  private static int PFL_PARAM_APERTICHIUSI = 1;
  private static int PFL_PARAM_DAL = 2;
  private static int PFL_PARAM_AL = 3;
  private static int PFL_PARAM_ORDINAMENTO1 = 4;
  private static int PFL_PARAM_TOTALESPESA = 5;
  private static int PFL_PARAM_TOTALEENTRAT = 6;
  private static int PFL_PARAM_LABELSPESA = 7;
  private static int PFL_PARAM_LABELENTRATA = 8;
  private static int PFL_PARAM_INFOTOTASPES = 9;
  private static int PFL_PARAM_INFOTOTAENTR = 10;
  private static int PFL_PARAM_DETSOGRAGSOC = 11;
  private static int PFL_PARAM_DETTSOGGINDI = 12;
  private static int PFL_PARAM_DESOCOFIPAIV = 13;
  private static int PFL_PARAM_DETSOGCACOPR = 14;

  private static int PPQRY_PARAM83 = 0;


  IDPanel PAN_PARAM;
  private static int PFL_ESTRATTCONTO_DOCUMENTO = 0;
  private static int PFL_ESTRATTCONTO_INFO = 1;
  private static int PFL_ESTRATTCONTO_DETTAGLI = 2;
  private static int PFL_ESTRATTCONTO_CODDOC = 3;
  private static int PFL_ESTRATTCONTO_TIPODOCUMENT = 4;
  private static int PFL_ESTRATTCONTO_IMPORTO = 5;
  private static int PFL_ESTRATTCONTO_L = 6;
  private static int PFL_ESTRATTCONTO_IMPONIBILE = 7;
  private static int PFL_ESTRATTCONTO_IVA = 8;
  private static int PFL_ESTRATTCONTO_RETTIFICHE = 9;
  private static int PFL_ESTRATTCONTO_PAGATO = 10;
  private static int PFL_ESTRATTCONTO_SALDO = 11;
  private static int PFL_ESTRATTCONTO_RITENUTE = 12;
  private static int PFL_ESTRATTCONTO_UFFICIO = 13;
  private static int PFL_ESTRATTCONTO_DESCRIZIONE = 14;
  private static int PFL_ESTRATTCONTO_CATEGORIA = 15;
  private static int PFL_ESTRATTCONTO_DATARIENTRO = 16;
  private static int PFL_ESTRATTCONTO_ORDINAMEDATA = 17;
  private static int PFL_ESTRATTCONTO_ORDINANUMERO = 18;
  private static int PFL_ESTRATTCONTO_TIPO = 19;
  private static int PFL_ESTRATTCONTO_ANNO = 20;
  private static int PFL_ESTRATTCONTO_NUMERO = 21;
  private static int PFL_ESTRATTCONTO_SOGGETTO = 22;

  private static int PPQRY_CF4WESTRCONT = 0;


  IDPanel PAN_ESTRATTCONTO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM84(IMDB);
    Init_TBL_ENTRATA(IMDB);
    Init_TBL_SPESA(IMDB);
    //
    //
    Init_PQRY_PARAM83(IMDB);
    Init_PQRY_PARAM83_RS(IMDB);
    Init_PQRY_CF4WESTRCONT(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM84(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM84, 6);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM84, "TBL_PARAM84");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM84,IMDBDef2.FLD_PARAM84_ROWNAMCODSOG, "ROWNAMCODSOG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM84,IMDBDef2.FLD_PARAM84_ROWNAMCODSOG,1,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM84,IMDBDef2.FLD_PARAM84_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM84,IMDBDef2.FLD_PARAM84_ROWNAMEPARTE,12,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM84,IMDBDef2.FLD_PARAM84_ROWNAMAPECHI, "ROWNAMAPECHI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM84,IMDBDef2.FLD_PARAM84_ROWNAMAPECHI,12,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM84,IMDBDef2.FLD_PARAM84_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM84,IMDBDef2.FLD_PARAM84_ROWNAMEDAL,6,20,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM84,IMDBDef2.FLD_PARAM84_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM84,IMDBDef2.FLD_PARAM84_ROWNAMEAL,6,20,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM84,IMDBDef2.FLD_PARAM84_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM84,IMDBDef2.FLD_PARAM84_ROWNAMEORDIN,5,1,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM84, 0);
  }

  private static void Init_TBL_ENTRATA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_ENTRATA, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_ENTRATA, "TBL_ENTRATA");
    IMDB.set_FldCode(IMDBDef2.TBL_ENTRATA,IMDBDef2.FLD_ENTRATA_ROWNAMEIMPOR, "ROWNAMEIMPOR");
    IMDB.SetFldParams(IMDBDef2.TBL_ENTRATA,IMDBDef2.FLD_ENTRATA_ROWNAMEIMPOR,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_ENTRATA,IMDBDef2.FLD_ENTRATA_ROWNAMERETTI, "ROWNAMERETTI");
    IMDB.SetFldParams(IMDBDef2.TBL_ENTRATA,IMDBDef2.FLD_ENTRATA_ROWNAMERETTI,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_ENTRATA,IMDBDef2.FLD_ENTRATA_ROWNAMEPAGAT, "ROWNAMEPAGAT");
    IMDB.SetFldParams(IMDBDef2.TBL_ENTRATA,IMDBDef2.FLD_ENTRATA_ROWNAMEPAGAT,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_ENTRATA,IMDBDef2.FLD_ENTRATA_ROWNAMESALDO, "ROWNAMESALDO");
    IMDB.SetFldParams(IMDBDef2.TBL_ENTRATA,IMDBDef2.FLD_ENTRATA_ROWNAMESALDO,3,14,2);
    IMDB.TblAddNew(IMDBDef2.TBL_ENTRATA, 0);
  }

  private static void Init_TBL_SPESA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_SPESA, 5);
    IMDB.set_TblCode(IMDBDef2.TBL_SPESA, "TBL_SPESA");
    IMDB.set_FldCode(IMDBDef2.TBL_SPESA,IMDBDef2.FLD_SPESA_ROWNAMEIMPOR, "ROWNAMEIMPOR");
    IMDB.SetFldParams(IMDBDef2.TBL_SPESA,IMDBDef2.FLD_SPESA_ROWNAMEIMPOR,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_SPESA,IMDBDef2.FLD_SPESA_ROWNAMERETTI, "ROWNAMERETTI");
    IMDB.SetFldParams(IMDBDef2.TBL_SPESA,IMDBDef2.FLD_SPESA_ROWNAMERETTI,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_SPESA,IMDBDef2.FLD_SPESA_ROWNAMEPAGAT, "ROWNAMEPAGAT");
    IMDB.SetFldParams(IMDBDef2.TBL_SPESA,IMDBDef2.FLD_SPESA_ROWNAMEPAGAT,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_SPESA,IMDBDef2.FLD_SPESA_ROWNAMESALDO, "ROWNAMESALDO");
    IMDB.SetFldParams(IMDBDef2.TBL_SPESA,IMDBDef2.FLD_SPESA_ROWNAMESALDO,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_SPESA,IMDBDef2.FLD_SPESA_ROWNAMERITEN, "ROWNAMERITEN");
    IMDB.SetFldParams(IMDBDef2.TBL_SPESA,IMDBDef2.FLD_SPESA_ROWNAMERITEN,3,14,2);
    IMDB.TblAddNew(IMDBDef2.TBL_SPESA, 0);
  }

  private static void Init_PQRY_PARAM83(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAM83, 5);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAM83, "PQRY_PARAM83");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM83,IMDBDef9.PQSL_PARAM83_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM83,IMDBDef9.PQSL_PARAM83_ROWNAMEPARTE,12,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM83,IMDBDef9.PQSL_PARAM83_ROWNAMAPECHI, "ROWNAMAPECHI");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM83,IMDBDef9.PQSL_PARAM83_ROWNAMAPECHI,12,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM83,IMDBDef9.PQSL_PARAM83_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM83,IMDBDef9.PQSL_PARAM83_ROWNAMEDAL,6,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM83,IMDBDef9.PQSL_PARAM83_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM83,IMDBDef9.PQSL_PARAM83_ROWNAMEAL,6,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM83,IMDBDef9.PQSL_PARAM83_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM83,IMDBDef9.PQSL_PARAM83_ROWNAMEORDIN,5,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAM83, 0);
  }

  private static void Init_PQRY_PARAM83_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAM83_RS, 5);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAM83_RS, "PQRY_PARAM83_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM83_RS,IMDBDef9.PQSL_PARAM83_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM83_RS,IMDBDef9.PQSL_PARAM83_ROWNAMEPARTE,12,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM83_RS,IMDBDef9.PQSL_PARAM83_ROWNAMAPECHI, "ROWNAMAPECHI");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM83_RS,IMDBDef9.PQSL_PARAM83_ROWNAMAPECHI,12,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM83_RS,IMDBDef9.PQSL_PARAM83_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM83_RS,IMDBDef9.PQSL_PARAM83_ROWNAMEDAL,6,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM83_RS,IMDBDef9.PQSL_PARAM83_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM83_RS,IMDBDef9.PQSL_PARAM83_ROWNAMEAL,6,20,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAM83_RS,IMDBDef9.PQSL_PARAM83_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAM83_RS,IMDBDef9.PQSL_PARAM83_ROWNAMEORDIN,5,1,0);
  }

  private static void Init_PQRY_CF4WESTRCONT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_CF4WESTRCONT, 24);
    IMDB.set_TblCode(IMDBDef9.PQRY_CF4WESTRCONT, "PQRY_CF4WESTRCONT");
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_DOCUMENTO, "DOCUMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_DOCUMENTO,5,33,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_IMPORTO,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_PAGATO, "PAGATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_PAGATO,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_SALDO, "SALDO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_SALDO,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_RITENUTE, "RITENUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_RITENUTE,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_UFFICIO,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_CATEGORIA,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_DATA_RIENTRO, "DATA_RIENTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_DATA_RIENTRO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_VARIAZIONI, "VARIAZIONI");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_VARIAZIONI,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_FAT_DESCRIZIONE, "FAT_DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_FAT_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_CF4WESTRCONL, "CF4WESTRCONL");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_CF4WESTRCONL,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_ORDINAMEDATA, "ORDINAMEDATA");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_ORDINAMEDATA,6,0,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_ORDINANUMERO, "ORDINANUMERO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_ORDINANUMERO,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_CF4ESTCONINF, "CF4ESTCONINF");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_CF4ESTCONINF,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_CF4ESTCONDET, "CF4ESTCONDET");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_CF4ESTCONDET,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_TIPO,12,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_ANNO, "ANNO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_ANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_NUMERO, "NUMERO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_NUMERO,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_PARTE, "PARTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_PARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_CODICE_DOC, "CODICE_DOC");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_CODICE_DOC,1,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_SOGGETTO, "SOGGETTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_SOGGETTO,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_CF4ESTCONIMP, "CF4ESTCONIMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_CF4ESTCONIMP,3,14,2);
    IMDB.set_FldCode(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_CF4ESTCONIVA, "CF4ESTCONIVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_CF4WESTRCONT,IMDBDef9.PQSL_CF4WESTRCONT_CF4ESTCONIVA,3,14,2);
    IMDB.TblAddNew(IMDBDef9.PQRY_CF4WESTRCONT, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EstrattoContoSoggetto(MyWebEntryPoint w, IMDBObj imdb)
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
  public EstrattoContoSoggetto()
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
    FormIdx = MyGlb.FRM_ESTRCONTSOGG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C62CC9FC-9E42-4C64-83C7-03929ACCC0B2";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 832;
    DesignHeight = 570;
    set_Caption(new IDVariant("Estratto Conto Soggetto"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 832;
    Frames[1].Height = 544;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.279412;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 832;
    Frames[2].Height = 152;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 832;
    Frames[2].FixedHeight = 152;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 152-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "814AFA8D-EC30-403D-9B1F-1259F61F3D99");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 472, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 832;
    Frames[3].Height = 392;
    Frames[3].Caption = "Estratto Conto";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 392;
    PAN_ESTRATTCONTO = new IDPanel(w, this, 3, "PAN_ESTRATTCONTO");
    Frames[3].Content = PAN_ESTRATTCONTO;
    PAN_ESTRATTCONTO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESTRATTCONTO.VS = MainFrm.VisualStyleList;
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 392-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1405BF3D-3B8E-4589-BBAF-DD409C7388C9");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1468, 316, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESTRATTCONTO.InitStatus = 2;
    PAN_ESTRATTCONTO_Init();
    PAN_ESTRATTCONTO_InitFields();
    PAN_ESTRATTCONTO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM84, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESTRCONTSOGG_PARAM83();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_ESTRATTCONTO.UpdatePanel(MainFrm);
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
    return (obj instanceof EstrattoContoSoggetto);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EstrattoContoSoggetto.class.getName() : (Glb.ClassWithPackage(EstrattoContoSoggetto.class) ? EstrattoContoSoggetto.class.getName().substring(EstrattoContoSoggetto.class.getPackage().getName().length() + 1) : EstrattoContoSoggetto.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
      // 
      // Param On Validate Row Event Body
      // Procedure Body
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAM83, IMDBDef9.PQSL_PARAM83_ROWNAMEDAL, 0),(new IDVariant("1900/01/01# 00:00:00", IDVariant.DATETIME))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAM83, IMDBDef9.PQSL_PARAM83_ROWNAMEAL, 0),(new IDVariant("2999/12/31# 00:00:00", IDVariant.DATETIME))), true)>0)
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Data dal non può essere maggiore di data al", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrattoContoSoggetto", "ParamOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Info
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Info ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_TIPO, 0).equals((new IDVariant("FAT")), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_ANNO, 0));
        IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_NUMERO, 0));
        MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(0)).intValue(), this); 
      }
      if (IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_TIPO, 0).equals((new IDVariant("LIQ")), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_ANNO, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_NUMERO, 0));
        MainFrm.Show(MyGlb.FRM_INFOLIQUIDAZ, (new IDVariant(0)).intValue(), this); 
      }
      if (IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_TIPO, 0).equals((new IDVariant("MAN")), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMANNMAN, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_ANNO, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMNUMMAN, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_NUMERO, 0));
        MainFrm.Show(MyGlb.FRM_INFORMMANDAT, (new IDVariant(0)).intValue(), this); 
      }
      if (IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_TIPO, 0).equals((new IDVariant("ORD")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMANNOORD, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_ANNO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETINPU3, IMDBDef1.FLD_PARAMETINPU3_PARAMNUMEORD, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_NUMERO, 0));
        MainFrm.Show(MyGlb.FRM_INFOORDINATI, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrattoContoSoggetto", "Info", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Dettagli
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Dettagli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_TIPO, 0).equals((new IDVariant("MAN")), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM85, IMDBDef2.FLD_PARAM85_ROWNAMANNMAN, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_ANNO, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAM85, IMDBDef2.FLD_PARAM85_ROWNAMNUMMAN, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_NUMERO, 0));
        MainFrm.Show(MyGlb.FRM_DETTAGMANDAT, (new IDVariant(-1)).intValue(), this); 
      }
      if (IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_TIPO, 0).equals((new IDVariant("ORD")), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM86, IMDBDef2.FLD_PARAM86_ROWNAMANNORD, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_ANNO, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAM86, IMDBDef2.FLD_PARAM86_ROWNAMNUMORD, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_NUMERO, 0));
        MainFrm.Show(MyGlb.FRM_DETTAGORDINA, (new IDVariant(-1)).intValue(), this); 
      }
      if (IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_TIPO, 0).equals((new IDVariant("FAT")), true))
      {
        if (IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_CODICE_DOC, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_CODICE_DOC, 0).equals((new IDVariant(4)), true) || IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_CODICE_DOC, 0).equals((new IDVariant(5)), true) || IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_CODICE_DOC, 0).equals((new IDVariant(7)), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAM87, IMDBDef2.FLD_PARAM87_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_ANNO, 0));
          IMDB.set_Value(IMDBDef2.TBL_PARAM87, IMDBDef2.FLD_PARAM87_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_NUMERO, 0));
          IMDB.set_Value(IMDBDef2.TBL_PARAM87, IMDBDef2.FLD_PARAM87_ROWNAMEBENEF, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_SOGGETTO, 0));
          if (IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_CODICE_DOC, 0).equals((new IDVariant(1)), true))
          {
            IMDB.set_Value(IMDBDef2.TBL_PARAM87, IMDBDef2.FLD_PARAM87_ROWNAMFATNAC, 0, (new IDVariant("F")));
          }
          else
          {
            IMDB.set_Value(IMDBDef2.TBL_PARAM87, IMDBDef2.FLD_PARAM87_ROWNAMFATNAC, 0, (new IDVariant("N")));
          }
          MainFrm.Show(MyGlb.FRM_DETTFATTSPES, (new IDVariant(-1)).intValue(), this); 
        }
        else
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAM88, IMDBDef2.FLD_PARAM88_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_ANNO, 0));
          IMDB.set_Value(IMDBDef2.TBL_PARAM88, IMDBDef2.FLD_PARAM88_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_NUMERO, 0));
          IMDB.set_Value(IMDBDef2.TBL_PARAM88, IMDBDef2.FLD_PARAM88_ROWNAMEBENEF, 0, IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_SOGGETTO, 0));
          if (IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_CODICE_DOC, 0).equals((new IDVariant(3)), true))
          {
            IMDB.set_Value(IMDBDef2.TBL_PARAM88, IMDBDef2.FLD_PARAM88_ROWNAMFATNAC, 0, (new IDVariant("F")));
          }
          else
          {
            IMDB.set_Value(IMDBDef2.TBL_PARAM88, IMDBDef2.FLD_PARAM88_ROWNAMFATNAC, 0, (new IDVariant("N")));
          }
          MainFrm.Show(MyGlb.FRM_DETTFATTENTR, (new IDVariant(-1)).intValue(), this); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrattoContoSoggetto", "Dettagli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Importi
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaImporti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SOMMAENTRATA = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SOMMASPESA = new IDVariant(0,IDVariant.DECIMAL);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Setta Importi Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMERETTI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMEPAGAT, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMESALDO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMERETTI, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMEPAGAT, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMESALDO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMERITEN, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      C2 = PAN_ESTRATTCONTO.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_ESTRATTCONTO.GotoFirst();
      while (!PAN_ESTRATTCONTO.RSEOF())
      {
        if (C2.Get("CODICE_DOC").equals((new IDVariant(-1)), true))
        {
          if (C2.Get("PARTE").equals((new IDVariant("E")), true))
          {
            v_SOMMAENTRATA = new IDVariant(IDL.Add(v_SOMMAENTRATA, IDL.NullValue(C2.Get("IMPORTO"),(new IDVariant(0)))),IDVariant.DECIMAL);
            IMDB.set_Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMERETTI, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMERETTI, 0), IDL.NullValue(C2.Get("VARIAZIONI"),(new IDVariant(0)))),IDVariant.DECIMAL));
            IMDB.set_Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMEPAGAT, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMEPAGAT, 0), IDL.NullValue(C2.Get("PAGATO"),(new IDVariant(0)))),IDVariant.DECIMAL));
            IMDB.set_Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMESALDO, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMESALDO, 0), IDL.NullValue(C2.Get("SALDO"),(new IDVariant(0)))),IDVariant.DECIMAL));
          }
          if (C2.Get("PARTE").equals((new IDVariant("S")), true))
          {
            v_SOMMASPESA = new IDVariant(IDL.Add(v_SOMMASPESA, IDL.NullValue(C2.Get("IMPORTO"),(new IDVariant(0)))),IDVariant.DECIMAL);
            IMDB.set_Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMERETTI, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMERETTI, 0), IDL.NullValue(C2.Get("VARIAZIONI"),(new IDVariant(0)))),IDVariant.DECIMAL));
            IMDB.set_Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMEPAGAT, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMEPAGAT, 0), IDL.NullValue(C2.Get("PAGATO"),(new IDVariant(0)))),IDVariant.DECIMAL));
            IMDB.set_Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMESALDO, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMESALDO, 0), IDL.NullValue(C2.Get("SALDO"),(new IDVariant(0)))),IDVariant.DECIMAL));
            IMDB.set_Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMERITEN, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMERITEN, 0), IDL.NullValue(C2.Get("RITENUTE"),(new IDVariant(0)))),IDVariant.DECIMAL));
          }
        }
        else
        {
          if (C2.Get("CODICE_DOC").equals((new IDVariant(3)), true) || C2.Get("CODICE_DOC").equals((new IDVariant(4)), true) || C2.Get("CODICE_DOC").equals((new IDVariant(6)), true) || C2.Get("CODICE_DOC").equals((new IDVariant(8)), true))
          {
            v_SOMMAENTRATA = new IDVariant(IDL.Add(v_SOMMAENTRATA, IDL.NullValue(C2.Get("IMPORTO"),(new IDVariant(0)))),IDVariant.DECIMAL);
            IMDB.set_Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMERETTI, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMERETTI, 0), IDL.NullValue(C2.Get("VARIAZIONI"),(new IDVariant(0)))),IDVariant.DECIMAL));
            IMDB.set_Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMEPAGAT, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMEPAGAT, 0), IDL.NullValue(C2.Get("PAGATO"),(new IDVariant(0)))),IDVariant.DECIMAL));
            IMDB.set_Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMESALDO, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMESALDO, 0), IDL.NullValue(C2.Get("SALDO"),(new IDVariant(0)))),IDVariant.DECIMAL));
          }
          if (C2.Get("CODICE_DOC").equals((new IDVariant(1)), true) || C2.Get("CODICE_DOC").equals((new IDVariant(2)), true) || C2.Get("CODICE_DOC").equals((new IDVariant(5)), true) || C2.Get("CODICE_DOC").equals((new IDVariant(7)), true))
          {
            v_SOMMASPESA = new IDVariant(IDL.Add(v_SOMMASPESA, IDL.NullValue(C2.Get("IMPORTO"),(new IDVariant(0)))),IDVariant.DECIMAL);
            IMDB.set_Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMERETTI, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMERETTI, 0), IDL.NullValue(C2.Get("VARIAZIONI"),(new IDVariant(0)))),IDVariant.DECIMAL));
            IMDB.set_Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMEPAGAT, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMEPAGAT, 0), IDL.NullValue(C2.Get("PAGATO"),(new IDVariant(0)))),IDVariant.DECIMAL));
            IMDB.set_Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMESALDO, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMESALDO, 0), IDL.NullValue(C2.Get("SALDO"),(new IDVariant(0)))),IDVariant.DECIMAL));
            IMDB.set_Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMERITEN, 0, new IDVariant(IDL.Add(IMDB.Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMERITEN, 0), IDL.NullValue(C2.Get("RITENUTE"),(new IDVariant(0)))),IDVariant.DECIMAL));
          }
        }
        PAN_ESTRATTCONTO.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      PAN_PARAM.set_FieldText(PFL_PARAM_TOTALESPESA, IDL.ToString(IDL.NullValue(v_SOMMASPESA,(new IDVariant(0)))).stringValue());
      PAN_PARAM.set_FieldText(PFL_PARAM_TOTALEENTRAT, IDL.ToString(IDL.NullValue(v_SOMMAENTRATA,(new IDVariant(0)))).stringValue());
      IMDB.set_Value(IMDBDef2.TBL_ENTRATA, IMDBDef2.FLD_ENTRATA_ROWNAMEIMPOR, 0, IDL.NullValue(v_SOMMAENTRATA,(new IDVariant(0))));
      IMDB.set_Value(IMDBDef2.TBL_SPESA, IMDBDef2.FLD_SPESA_ROWNAMEIMPOR, 0, IDL.NullValue(v_SOMMASPESA,(new IDVariant(0))));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrattoContoSoggetto", "SettaImporti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Totale Spesa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoTotaleSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Totale Spesa Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_TOTALESPESA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrattoContoSoggetto", "InfoTotaleSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Totale Entrata
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoTotaleEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Totale Entrata Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_TOTALEENTRAT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrattoContoSoggetto", "InfoTotaleEntrata", _e);
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
    IDVariant v_RAGIONESOCIA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_INDIRIZZO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_COMUNE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PROVINCIA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CODICEFISCAL = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CF = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMECAMPO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMECAMPOPER = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PERSONALIZZA = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CF = (new IDVariant("C.F.", IDVariant.STRING));
      v_CAPTION = (new IDVariant("Estratto Conto", IDVariant.STRING));
      v_NOMECAMPO = (new IDVariant("data_rientro", IDVariant.STRING));
      v_NOMECAMPOPER = (new IDVariant("data_rientro_vis", IDVariant.STRING));
      v_PERSONALIZZA = (new IDVariant("data_rientro_vis", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IDVariant v_PARTITAIVA = new IDVariant(0,IDVariant.STRING);
      v_PARTITAIVA = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.RAGIONE_SOCIALE_ESTESA as BENRAGSOCEST, ");
      SQL.append("  A.INDIRIZZO as BENINDIRIZZO, ");
      SQL.append("  A.CAP as BENCAP, ");
      SQL.append("  B.DENOMINAZIONE as COMUNIDENOMI, ");
      SQL.append("  C.SIGLA as PROVINCSIGLA, ");
      SQL.append("  A.CODICE_FISCALE as BENCODICFISC, ");
      SQL.append("  A.PARTITA_IVA as BENPARTITIVA ");
      SQL.append("from ");
      SQL.append("  BEN A, ");
      SQL.append("  AD4_COMUNI B, ");
      SQL.append("  AD4_PROVINCIE C ");
      SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM84, IMDBDef2.FLD_PARAM84_ROWNAMCODSOG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.COMUNE = B.COMUNE) ");
      SQL.append("and   (A.PROVINCIA = C.PROVINCIA) ");
      SQL.append("and   (B.PROVINCIA_STATO = A.PROVINCIA) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_RAGIONESOCIA = QV.Get("BENRAGSOCEST", IDVariant.STRING) ;
        v_INDIRIZZO = QV.Get("BENINDIRIZZO", IDVariant.STRING) ;
        v_CAP = QV.Get("BENCAP", IDVariant.INTEGER) ;
        v_COMUNE = QV.Get("COMUNIDENOMI", IDVariant.STRING) ;
        v_PROVINCIA = QV.Get("PROVINCSIGLA", IDVariant.STRING) ;
        v_CODICEFISCAL = QV.Get("BENCODICFISC", IDVariant.STRING) ;
        v_PARTITAIVA = QV.Get("BENPARTITIVA", IDVariant.STRING) ;
      }
      QV.Close();
      PAN_PARAM.set_FieldText(PFL_PARAM_DETSOGRAGSOC, new IDVariant(v_RAGIONESOCIA).stringValue());
      PAN_PARAM.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAM_DETSOGRAGSOC,v_RAGIONESOCIA.stringValue()); 
      PAN_PARAM.set_FieldText(PFL_PARAM_DETTSOGGINDI, new IDVariant(v_INDIRIZZO).stringValue());
      PAN_PARAM.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAM_DETTSOGGINDI,v_INDIRIZZO.stringValue()); 
      PAN_PARAM.set_FieldText(PFL_PARAM_DETSOGCACOPR, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(v_CAP), (new IDVariant(" "))), v_COMUNE), (new IDVariant(" "))), v_PROVINCIA).stringValue());
      PAN_PARAM.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAM_DETSOGCACOPR,IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(v_CAP), (new IDVariant(" "))), v_COMUNE), (new IDVariant(" "))), v_PROVINCIA).stringValue()); 
      PAN_PARAM.set_FieldText(PFL_PARAM_DESOCOFIPAIV, IDL.Add(IDL.Add(IDL.Add(v_CF, (new IDVariant(" "))), v_CODICEFISCAL), ((!(IDL.IsNull(v_PARTITAIVA)))?IDL.Add(IDL.Add((new IDVariant(" - ")), (new IDVariant("P.I. "))), v_PARTITAIVA):(new IDVariant()))).stringValue());
      PAN_PARAM.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAM_DESOCOFIPAIV,IDL.Add(IDL.Add(IDL.Add(v_CF, (new IDVariant(" "))), v_CODICEFISCAL), ((!(IDL.IsNull(v_PARTITAIVA)))?IDL.Add(IDL.Add((new IDVariant(" - ")), (new IDVariant("P.I. "))), v_PARTITAIVA):(new IDVariant()))).stringValue()); 
      set_Caption(new IDVariant(v_CAPTION));
      IMDB.set_Value(IMDBDef2.TBL_PARAM84, IMDBDef2.FLD_PARAM84_ROWNAMEPARTE, 0, (new IDVariant("T")));
      IMDB.set_Value(IMDBDef2.TBL_PARAM84, IMDBDef2.FLD_PARAM84_ROWNAMAPECHI, 0, (new IDVariant("T")));
      IMDB.set_Value(IMDBDef2.TBL_PARAM84, IMDBDef2.FLD_PARAM84_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef2.TBL_PARAM84, IMDBDef2.FLD_PARAM84_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef2.TBL_PARAM84, IMDBDef2.FLD_PARAM84_ROWNAMEORDIN, 0, (new IDVariant("D")));
      PAN_ESTRATTCONTO.Freezed = (new IDVariant(-1)).booleanValue();
      v_PERSONALIZZA = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_NOMECAMPO);
      if (v_PERSONALIZZA.compareTo(v_NOMECAMPOPER, true)!=0)
      {
        PAN_ESTRATTCONTO.SetFlags (Glb.OBJ_FIELD, PFL_ESTRATTCONTO_DATARIENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_ESTRATTCONTO.set_Header(Glb.OBJ_FIELD,PFL_ESTRATTCONTO_INFO, (new IDVariant("")).stringValue());
      PAN_ESTRATTCONTO.set_Header(Glb.OBJ_FIELD,PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("")).stringValue());
      PAN_ESTRATTCONTO.SetFlags (Glb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ESTRATTCONTO.SetFlags (Glb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ESTRATTCONTO.SetFlags (Glb.OBJ_FIELD, PFL_ESTRATTCONTO_L, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_ESTRATTCONTO.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrattoContoSoggetto", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Estratto Conto On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESTRATTCONTO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TOOLTIPINFO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIPDETTA = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TOOLTIPINFO = (new IDVariant("Informazioni", IDVariant.STRING));
      v_TOOLTIPDETTA = (new IDVariant("Dettagli", IDVariant.STRING));
      MainFrm.DynamicProperties(PAN_ESTRATTCONTO);
      // 
      // Estratto Conto On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ESTRATTCONTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ESTRATTCONTO_TIPODOCUMENT,IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_FAT_DESCRIZIONE, 0).stringValue()); 
      PAN_ESTRATTCONTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ESTRATTCONTO_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_DESCRIZIONE, 0).stringValue()); 
      PAN_ESTRATTCONTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ESTRATTCONTO_UFFICIO,IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_UFFICIO, 0).stringValue()); 
      PAN_ESTRATTCONTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ESTRATTCONTO_CATEGORIA,IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_CATEGORIA, 0).stringValue()); 
      PAN_ESTRATTCONTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ESTRATTCONTO_DOCUMENTO,IMDB.Value(IMDBDef9.PQRY_CF4WESTRCONT, IMDBDef9.PQSL_CF4WESTRCONT_DOCUMENTO, 0).stringValue()); 
      PAN_ESTRATTCONTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ESTRATTCONTO_INFO,v_TOOLTIPINFO.stringValue()); 
      PAN_ESTRATTCONTO.set_ToolTip(Glb.OBJ_FIELD,PFL_ESTRATTCONTO_DETTAGLI,v_TOOLTIPDETTA.stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrattoContoSoggetto", "EstrattoContoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Estratto Conto After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ESTRATTCONTO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Estratto Conto After Find Event Body
      // Procedure Body
      // 
      SettaImporti();
      if (new IDVariant(PAN_ESTRATTCONTO.Status()).compareTo((new IDVariant(1)), true)!=0)
      {
        PAN_ESTRATTCONTO.SetFlags (Glb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTRATTCONTO.SetFlags (Glb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTRATTCONTO.SetFlags (Glb.OBJ_FIELD, PFL_ESTRATTCONTO_L, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrattoContoSoggetto", "EstrattoContoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Estratto Conto On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ESTRATTCONTO_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Estratto Conto On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_ESTRATTCONTO.Freezed = (new IDVariant(0)).booleanValue();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_ESTRATTCONTO.SetFlags (Glb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTRATTCONTO.SetFlags (Glb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ESTRATTCONTO.SetFlags (Glb.OBJ_FIELD, PFL_ESTRATTCONTO_L, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrattoContoSoggetto", "EstrattoContoOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void ESTRCONTSOGG_PARAM83() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAM83_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM84, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM84, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAM83_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAM83_RS, 0, IMDBDef2.TBL_PARAM84, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM83_RS, 0, 0, IMDBDef2.TBL_PARAM84, IMDBDef2.FLD_PARAM84_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM83_RS, 1, 0, IMDBDef2.TBL_PARAM84, IMDBDef2.FLD_PARAM84_ROWNAMAPECHI, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM83_RS, 2, 0, IMDBDef2.TBL_PARAM84, IMDBDef2.FLD_PARAM84_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM83_RS, 3, 0, IMDBDef2.TBL_PARAM84, IMDBDef2.FLD_PARAM84_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAM83_RS, 4, 0, IMDBDef2.TBL_PARAM84, IMDBDef2.FLD_PARAM84_ROWNAMEORDIN, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM84, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM84, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM84, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAM83_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_INFOTOTASPES)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoTotaleSpesa();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_INFOTOTAENTR)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoTotaleEntrata();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ESTRATTCONTO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ESTRATTCONTO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ESTRATTCONTO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESTRATTCONTO, Cancel);
    // Stub
  }

  private void PAN_ESTRATTCONTO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ESTRATTCONTO_INFO)
    {
      this.IdxPanelActived = this.PAN_ESTRATTCONTO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Info();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ESTRATTCONTO_DETTAGLI)
    {
      this.IdxPanelActived = this.PAN_ESTRATTCONTO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Dettagli();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ESTRATTCONTO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ESTRATTCONTO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESTRATTCONTO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, "87579961-14D4-47A4-A602-91601E8D4C54");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, "Documenti");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, MyGlb.PANEL_LIST, 48, -9999, 120, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, MyGlb.PANEL_FORM, 372, 14, 192, 62, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, 0, 61);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, 1, 2);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_DOCUMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, "2A05B552-50E0-46C7-A975-BED81616B3B4");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, "Data Documenti");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, MyGlb.PANEL_LIST, 168, -9999, 256, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, MyGlb.PANEL_FORM, 580, 14, 236, 38, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, 0, 91);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, 1, 2);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_DATADOCUMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_SOGGETTO, "9E75F880-FF74-4838-AF22-829C8D57D327");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_SOGGETTO, "Soggetto");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_SOGGETTO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_SOGGETTO, MyGlb.VIS_GROSTYLILEDI);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_SOGGETTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_SOGGETTO, MyGlb.PANEL_FORM, 4, 4, 264, 76, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_SOGGETTO, 0, 52);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_SOGGETTO, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_SOGGETTO, 0, 1);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_SOGGETTO, 1, 1);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_SOGGETTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "8778DF8E-5E34-4946-8887-610F31379EC9");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "Parte");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_APERTICHIUSI, "2865E124-7E13-42A6-A969-0CDB3516E5A3");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_APERTICHIUSI, "Aperti Chiusi");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_APERTICHIUSI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_APERTICHIUSI, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_APERTICHIUSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, "8AF28A80-FAF8-460A-A883-EF948648B744");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, "Dal");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "9BF4DDB1-9254-4DC0-ACDD-BC91B72B2A2D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "Al");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ORDINAMENTO1, "E99FBE29-F7D0-4F7A-9560-2D0D761797C1");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ORDINAMENTO1, "Ordinamento");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ORDINAMENTO1, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ORDINAMENTO1, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ORDINAMENTO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALESPESA, "9A5222EE-C6F7-4C02-9B20-3DF5E4B2CE45");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALESPESA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALESPESA, MyGlb.VIS_CAMPTOTADISA);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALESPESA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEENTRAT, "C42066FA-A38B-4E4D-AEC0-FCA03D374AC6");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEENTRAT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEENTRAT, MyGlb.VIS_CAMPTOTADISA);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEENTRAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_LABELSPESA, "FB7D274C-17F8-45BF-BD24-20ACF426361F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_LABELSPESA, "Totale Spesa");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_LABELSPESA, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_LABELSPESA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_LABELENTRATA, "E3FAFEC2-ADDB-4513-89C0-55747B3CEC5C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_LABELENTRATA, "Totale Entrata");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_LABELENTRATA, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_LABELENTRATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTASPES, "287EE9D0-C1E5-422C-B8D7-ED5F1A94421D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTASPES, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTASPES, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTASPES, 0, "info.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTASPES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTAENTR, "EDBFC009-3C27-443E-81DB-D1634B4AE340");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTAENTR, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTAENTR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTAENTR, 0, "info.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTAENTR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGRAGSOC, "1D379678-8003-4837-8FEA-0DA404556628");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGRAGSOC, "ADS");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGRAGSOC, MyGlb.VIS_VUGRALLECODI);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGRAGSOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DETTSOGGINDI, "40568559-B3C9-4D00-92D7-9737EFD6EAD1");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DETTSOGGINDI, "VIA DEL LAVORO 17");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DETTSOGGINDI, MyGlb.VIS_VUNOALLECODI);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DETTSOGGINDI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DESOCOFIPAIV, "8340C546-8B44-42E1-8A06-B526B305C8F3");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DESOCOFIPAIV, "C.F. 00311430375 - P.I. 00311430375");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DESOCOFIPAIV, MyGlb.VIS_VUNOALLECODI);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DESOCOFIPAIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGCACOPR, "C312BAA5-344A-4FD3-8E92-8FB95489AB2D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGCACOPR, "92100 AGRIGENTO AG");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGCACOPR, MyGlb.VIS_VUNOALLECODI);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGCACOPR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 48, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 376, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 104);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PARTE, -1, GRP_PARAM_DOCUMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PARTE, PPQRY_PARAM83, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 12, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("E")), "Entrata", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("S")), "Spesa", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("T")), "Tutti", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_APERTICHIUSI, MyGlb.PANEL_LIST, 112, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_APERTICHIUSI, MyGlb.PANEL_LIST, 68);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_APERTICHIUSI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_APERTICHIUSI, MyGlb.PANEL_LIST, "Aper. Ch.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_APERTICHIUSI, MyGlb.PANEL_FORM, 376, 52, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_APERTICHIUSI, MyGlb.PANEL_FORM, 104);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_APERTICHIUSI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_APERTICHIUSI, MyGlb.PANEL_FORM, "Aperti Chiusi");
    PAN_PARAM.SetFieldPage(PFL_PARAM_APERTICHIUSI, -1, GRP_PARAM_DOCUMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_APERTICHIUSI, PPQRY_PARAM83, "A.ROWNAMAPECHI", "ROWNAMAPECHI", 12, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_APERTICHIUSI, (new IDVariant("A")), "Aperti", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_APERTICHIUSI, (new IDVariant("C")), "Chiusi", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_APERTICHIUSI, (new IDVariant("T")), "Tutti", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, 168, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, 24);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, 584, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DAL, -1, GRP_PARAM_DATADOCUMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DAL, PPQRY_PARAM83, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 20, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 296, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 20);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 708, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAM.SetFieldPage(PFL_PARAM_AL, -1, GRP_PARAM_DATADOCUMENT);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_AL, PPQRY_PARAM83, "A.ROWNAMEAL", "ROWNAMEAL", 6, 20, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ORDINAMENTO1, MyGlb.PANEL_LIST, 424, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ORDINAMENTO1, MyGlb.PANEL_LIST, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ORDINAMENTO1, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ORDINAMENTO1, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ORDINAMENTO1, MyGlb.PANEL_FORM, 580, 68, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ORDINAMENTO1, MyGlb.PANEL_FORM, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ORDINAMENTO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ORDINAMENTO1, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ORDINAMENTO1, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ORDINAMENTO1, PPQRY_PARAM83, "A.ROWNAMEORDIN", "ROWNAMEORDIN", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ORDINAMENTO1, (new IDVariant("D")), "Data", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ORDINAMENTO1, (new IDVariant("N")), "Numero", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALESPESA, MyGlb.PANEL_LIST, 208, 92, 132, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALESPESA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALESPESA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALESPESA, MyGlb.PANEL_FORM, 96, 88, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALESPESA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALESPESA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_TOTALESPESA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TOTALESPESA, -1, "", "TOTALESPESA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEENTRAT, MyGlb.PANEL_LIST, 216, 100, 132, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEENTRAT, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEENTRAT, MyGlb.PANEL_FORM, 96, 112, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEENTRAT, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_TOTALEENTRAT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TOTALEENTRAT, -1, "", "TOTALEENTRAT", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABELSPESA, MyGlb.PANEL_LIST, 72, 92, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABELSPESA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABELSPESA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABELSPESA, MyGlb.PANEL_FORM, 12, 88, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABELSPESA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABELSPESA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_LABELSPESA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_LABELSPESA, -1, "", "LABELSPESA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABELENTRATA, MyGlb.PANEL_LIST, 80, 100, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABELENTRATA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABELENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LABELENTRATA, MyGlb.PANEL_FORM, 4, 112, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LABELENTRATA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LABELENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_LABELENTRATA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_LABELENTRATA, -1, "", "LABELENTRATA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTASPES, MyGlb.PANEL_LIST, 460, 84, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTASPES, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTASPES, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTASPES, MyGlb.PANEL_FORM, 224, 92, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTASPES, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTASPES, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_INFOTOTASPES, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INFOTOTASPES, -1, "", "INFOTOTASPES", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTAENTR, MyGlb.PANEL_LIST, 468, 92, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTAENTR, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTAENTR, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTAENTR, MyGlb.PANEL_FORM, 224, 116, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTAENTR, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOTOTAENTR, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_INFOTOTAENTR, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INFOTOTAENTR, -1, "", "INFOTOTAENTR", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGRAGSOC, MyGlb.PANEL_LIST, 4, 4, 272, 140, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGRAGSOC, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGRAGSOC, MyGlb.PANEL_LIST, 10);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGRAGSOC, MyGlb.PANEL_FORM, 8, 8, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGRAGSOC, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGRAGSOC, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_DETSOGRAGSOC, -1, GRP_PARAM_SOGGETTO);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DETSOGRAGSOC, -1, "", "DETSOGRAGSOC", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DETTSOGGINDI, MyGlb.PANEL_LIST, 12, 12, 272, 140, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DETTSOGGINDI, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DETTSOGGINDI, MyGlb.PANEL_LIST, 10);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DETTSOGGINDI, MyGlb.PANEL_FORM, 8, 24, 256, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DETTSOGGINDI, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DETTSOGGINDI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_DETTSOGGINDI, -1, GRP_PARAM_SOGGETTO);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DETTSOGGINDI, -1, "", "DETTSOGGINDI", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESOCOFIPAIV, MyGlb.PANEL_LIST, 20, 20, 272, 140, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESOCOFIPAIV, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESOCOFIPAIV, MyGlb.PANEL_LIST, 10);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESOCOFIPAIV, MyGlb.PANEL_FORM, 8, 56, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESOCOFIPAIV, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESOCOFIPAIV, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_DESOCOFIPAIV, -1, GRP_PARAM_SOGGETTO);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DESOCOFIPAIV, -1, "", "DESOCOFIPAIV", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGCACOPR, MyGlb.PANEL_LIST, 28, 28, 272, 140, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGCACOPR, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGCACOPR, MyGlb.PANEL_LIST, 10);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGCACOPR, MyGlb.PANEL_FORM, 8, 40, 256, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGCACOPR, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DETSOGCACOPR, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_DETSOGCACOPR, -1, GRP_PARAM_SOGGETTO);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DETSOGCACOPR, -1, "", "DETSOGCACOPR", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM83", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM83, IMDBDef9.PQRY_PARAM83_RS, IMDBDef2.TBL_PARAM84);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PARTE, IMDBDef2.FLD_PARAM84_ROWNAMEPARTE);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_APERTICHIUSI, IMDBDef2.FLD_PARAM84_ROWNAMAPECHI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DAL, IMDBDef2.FLD_PARAM84_ROWNAMEDAL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_AL, IMDBDef2.FLD_PARAM84_ROWNAMEAL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ORDINAMENTO1, IMDBDef2.FLD_PARAM84_ROWNAMEORDIN);
    PAN_PARAM.SetMasterTable(0, "PARAM84");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ESTRATTCONTO_Init()
  {

    PAN_ESTRATTCONTO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESTRATTCONTO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ESTRATTCONTO.SetSize(MyGlb.OBJ_FIELD, 23);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DOCUMENTO, "9E12DEB9-4E14-4DE2-A4A2-9E53A5FE754A");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DOCUMENTO, "Documento");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DOCUMENTO, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DOCUMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DOCUMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, "5CEA0369-62F3-40F1-B9AA-2E4809FA7F68");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, "Info");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, "92A84AA1-89BB-40BD-9A08-80F79D23B1A0");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, "Dettagli");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, "Dettagli");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, MyGlb.VIS_HYPELINKIMMA);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CODDOC, "D8B41374-476F-4CC2-92E7-FB4926F40F83");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CODDOC, "Cod Doc");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CODDOC, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CODDOC, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CODDOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPODOCUMENT, "8128EAD2-5FDA-436A-B324-8458AC4ED88D");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPODOCUMENT, "Tipo Documento");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPODOCUMENT, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPODOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPODOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPORTO, "916EAFF1-B7A8-497E-882F-5AE487A445FE");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPORTO, "Importo");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPORTO, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_L, "18EDB944-C07E-409F-B20F-00AA3DED1B7F");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_L, "L");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_L, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_L, MyGlb.VIS_HYPELINKIMMA);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_L, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPONIBILE, "82DD0137-60A1-4C22-98A0-0FA4A33A59CC");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPONIBILE, "Imponibile");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPONIBILE, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPONIBILE, MyGlb.VIS_NORFIECF4IMP);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPONIBILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IVA, "3CF17D5C-579A-4E97-ADAB-110AFF3CCE93");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IVA, "IVA");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IVA, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RETTIFICHE, "96F5EF0B-1852-400A-AB88-33AA60E771BB");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RETTIFICHE, "Rettifiche");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RETTIFICHE, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RETTIFICHE, MyGlb.VIS_NORFIECF4IMP);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RETTIFICHE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_PAGATO, "0A077805-25FC-40D9-859D-E7B2B9AE1C82");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_PAGATO, "Pagato");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_PAGATO, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_PAGATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_PAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SALDO, "AF269540-48FD-4F82-88E7-138208FBBEA6");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SALDO, "Saldo");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SALDO, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SALDO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SALDO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RITENUTE, "9F5D37B5-237D-4EF0-8439-9B87442881B0");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RITENUTE, "Ritenute");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RITENUTE, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RITENUTE, MyGlb.VIS_NORFIECF4IMP);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RITENUTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_UFFICIO, "7A6E5916-7A68-4C76-B798-2EA57C8A4D0F");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_UFFICIO, "Ufficio");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_UFFICIO, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_UFFICIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DESCRIZIONE, "5C4A05ED-7B0F-45B8-899F-28E6D3F034D5");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DESCRIZIONE, "Descrizione");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DESCRIZIONE, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CATEGORIA, "19137E3B-5D3F-46E4-90E8-D70876033EB6");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CATEGORIA, "Categoria");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CATEGORIA, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CATEGORIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DATARIENTRO, "F2C252D2-9653-4A5E-9FB9-3B2FB1479E24");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DATARIENTRO, "Data Rientro");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DATARIENTRO, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DATARIENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DATARIENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINAMEDATA, "1958CC80-050C-4FD9-9848-E8F6035BA797");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINAMEDATA, "Ordinamento Data");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINAMEDATA, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINAMEDATA, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINAMEDATA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINANUMERO, "944DB9BE-024B-4D26-BC8E-5A5929B9DC21");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINANUMERO, "Ordinamento Numero");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINANUMERO, "If (Row Name Ordinamento [Estratto Conto Soggetto - Param] = D, UNO, Fill Left (CF4WEB ESTRATTO CONTO ORDIN NUMERO,  20, ZeroStringa))");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINANUMERO, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINANUMERO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPO, "4F06D2B9-3579-4A4D-B2AD-2DCFEBA29963");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPO, "TIPO");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPO, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPO, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ANNO, "9B966E82-FED2-4219-A3AC-67DB8D2B4F19");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ANNO, "ANNO");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ANNO, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ANNO, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ANNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_NUMERO, "449552E6-7AC5-40D3-AC20-EC3236A55D9D");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_NUMERO, "NUMERO");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_NUMERO, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_NUMERO, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_NUMERO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTCONTO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SOGGETTO, "8ADE38D8-BCAE-4B6D-BFB2-15167153DE54");
    PAN_ESTRATTCONTO.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SOGGETTO, "SOGGETTO");
    PAN_ESTRATTCONTO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SOGGETTO, "");
    PAN_ESTRATTCONTO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SOGGETTO, MyGlb.VIS_NORMFIELPADR);
    PAN_ESTRATTCONTO.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SOGGETTO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ESTRATTCONTO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DOCUMENTO, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DOCUMENTO, MyGlb.PANEL_LIST, 72);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DOCUMENTO, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DOCUMENTO, MyGlb.PANEL_LIST, "Documento");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DOCUMENTO, MyGlb.PANEL_FORM, 4, 292, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DOCUMENTO, MyGlb.PANEL_FORM, 72);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DOCUMENTO, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DOCUMENTO, MyGlb.PANEL_FORM, "Documento");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_DOCUMENTO, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_DOCUMENTO, PPQRY_CF4WESTRCONT, "A.DOCUMENTO", "DOCUMENTO", 5, 33, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, MyGlb.PANEL_LIST, 152, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, MyGlb.PANEL_LIST, 28);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, MyGlb.PANEL_LIST, "In.");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, MyGlb.PANEL_FORM, 4, 628, 460, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, MyGlb.PANEL_FORM, 28);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, MyGlb.PANEL_FORM, 2);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_INFO, MyGlb.PANEL_FORM, "Inf.");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_INFO, -1, -1);
    PAN_ESTRATTCONTO.SetFieldUnbound(PFL_ESTRATTCONTO_INFO, true);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_INFO, PPQRY_CF4WESTRCONT, "'I'", "CF4ESTCONINF", 5, 1, 0, -13997);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_INFO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, MyGlb.PANEL_LIST, 176, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, MyGlb.PANEL_LIST, 48);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, MyGlb.PANEL_LIST, "Dt.");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, MyGlb.PANEL_FORM, 4, 676, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, MyGlb.PANEL_FORM, 48);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, MyGlb.PANEL_FORM, 2);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DETTAGLI, MyGlb.PANEL_FORM, "Dett.");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_DETTAGLI, -1, -1);
    PAN_ESTRATTCONTO.SetFieldUnbound(PFL_ESTRATTCONTO_DETTAGLI, true);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_DETTAGLI, PPQRY_CF4WESTRCONT, "CASE WHEN A.TIPO = 'LIQ' THEN '' ELSE 'D' END", "CF4ESTCONDET", 5, 99, 0, -13997);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_DETTAGLI, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CODDOC, MyGlb.PANEL_LIST, 216, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CODDOC, MyGlb.PANEL_LIST, 72);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CODDOC, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CODDOC, MyGlb.PANEL_LIST, "Cod Doc");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CODDOC, MyGlb.PANEL_FORM, 4, 724, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CODDOC, MyGlb.PANEL_FORM, 72);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CODDOC, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CODDOC, MyGlb.PANEL_FORM, "Cod Doc");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_CODDOC, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_CODDOC, PPQRY_CF4WESTRCONT, "A.CODICE_DOC", "CODICE_DOC", 1, 15, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPODOCUMENT, MyGlb.PANEL_LIST, 200, 36, 136, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPODOCUMENT, MyGlb.PANEL_LIST, 100);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPODOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPODOCUMENT, MyGlb.PANEL_LIST, "Tipo Documento");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPODOCUMENT, MyGlb.PANEL_FORM, 4, 544, 460, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPODOCUMENT, MyGlb.PANEL_FORM, 100);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPODOCUMENT, MyGlb.PANEL_FORM, 2);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPODOCUMENT, MyGlb.PANEL_FORM, "Tipo Documento");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_TIPODOCUMENT, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_TIPODOCUMENT, PPQRY_CF4WESTRCONT, "A.FAT_DESCRIZIONE", "FAT_DESCRIZIONE", 5, 140, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPORTO, MyGlb.PANEL_LIST, 336, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPORTO, MyGlb.PANEL_FORM, 4, 340, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_IMPORTO, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_IMPORTO, PPQRY_CF4WESTRCONT, "A.IMPORTO", "IMPORTO", 2, 15, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_L, MyGlb.PANEL_LIST, 424, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_L, MyGlb.PANEL_LIST, 16);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_L, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_L, MyGlb.PANEL_LIST, "L");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_L, MyGlb.PANEL_FORM, 4, 580, 448, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_L, MyGlb.PANEL_FORM, 16);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_L, MyGlb.PANEL_FORM, 2);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_L, MyGlb.PANEL_FORM, "L");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_L, -1, -1);
    PAN_ESTRATTCONTO.SetFieldUnbound(PFL_ESTRATTCONTO_L, true);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_L, PPQRY_CF4WESTRCONT, "GET_STATO_FATTURA(A.ANNO,A.NUMERO,A.CODICE_DOC,A.TIPO)", "CF4WESTRCONL", 5, 99, 0, -13997);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_L, (new IDVariant("N")), "Nera", "Mandato Emesso", "vnera.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_L, (new IDVariant("R")), "Rossa", "Liquidata - in Emissione", "vrossa.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_L, (new IDVariant("G")), "Gialla", "Inserita in Distinta", "vgialla.gif", -1);
    PAN_ESTRATTCONTO.SetValueListItem(PFL_ESTRATTCONTO_L, (new IDVariant("V")), "Verde", "Liquidata", "vverde.gif", -1);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPONIBILE, MyGlb.PANEL_LIST, 444, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPONIBILE, MyGlb.PANEL_LIST, 76);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPONIBILE, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPONIBILE, MyGlb.PANEL_LIST, "Imponibile");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPONIBILE, MyGlb.PANEL_FORM, 4, 724, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPONIBILE, MyGlb.PANEL_FORM, 76);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPONIBILE, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IMPONIBILE, MyGlb.PANEL_FORM, "Imponibile");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_IMPONIBILE, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_IMPONIBILE, PPQRY_CF4WESTRCONT, "A.IMPONIBILE", "CF4ESTCONIMP", 3, 14, 2, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IVA, MyGlb.PANEL_LIST, 532, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IVA, MyGlb.PANEL_LIST, 28);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IVA, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IVA, MyGlb.PANEL_LIST, "IVA");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IVA, MyGlb.PANEL_FORM, 4, 748, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IVA, MyGlb.PANEL_FORM, 28);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IVA, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_IVA, MyGlb.PANEL_FORM, "IVA");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_IVA, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_IVA, PPQRY_CF4WESTRCONT, "A.IVA", "CF4ESTCONIVA", 3, 14, 2, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RETTIFICHE, MyGlb.PANEL_LIST, 624, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RETTIFICHE, MyGlb.PANEL_LIST, 68);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RETTIFICHE, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RETTIFICHE, MyGlb.PANEL_LIST, "Rettifiche");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RETTIFICHE, MyGlb.PANEL_FORM, 4, 520, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RETTIFICHE, MyGlb.PANEL_FORM, 68);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RETTIFICHE, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RETTIFICHE, MyGlb.PANEL_FORM, "Rettifiche");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_RETTIFICHE, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_RETTIFICHE, PPQRY_CF4WESTRCONT, "A.VARIAZIONI", "VARIAZIONI", 2, 15, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_PAGATO, MyGlb.PANEL_LIST, 712, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_PAGATO, MyGlb.PANEL_LIST, 52);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_PAGATO, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_PAGATO, MyGlb.PANEL_LIST, "Pagato");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_PAGATO, MyGlb.PANEL_FORM, 4, 364, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_PAGATO, MyGlb.PANEL_FORM, 52);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_PAGATO, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_PAGATO, MyGlb.PANEL_FORM, "Pagato");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_PAGATO, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_PAGATO, PPQRY_CF4WESTRCONT, "A.PAGATO", "PAGATO", 2, 15, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SALDO, MyGlb.PANEL_LIST, 800, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SALDO, MyGlb.PANEL_LIST, 44);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SALDO, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SALDO, MyGlb.PANEL_LIST, "Saldo");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SALDO, MyGlb.PANEL_FORM, 4, 388, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SALDO, MyGlb.PANEL_FORM, 44);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SALDO, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SALDO, MyGlb.PANEL_FORM, "Saldo");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_SALDO, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_SALDO, PPQRY_CF4WESTRCONT, "A.SALDO", "SALDO", 2, 15, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RITENUTE, MyGlb.PANEL_LIST, 888, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RITENUTE, MyGlb.PANEL_LIST, 60);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RITENUTE, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RITENUTE, MyGlb.PANEL_LIST, "Ritenute");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RITENUTE, MyGlb.PANEL_FORM, 4, 412, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RITENUTE, MyGlb.PANEL_FORM, 60);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RITENUTE, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_RITENUTE, MyGlb.PANEL_FORM, "Ritenute");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_RITENUTE, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_RITENUTE, PPQRY_CF4WESTRCONT, "A.RITENUTE", "RITENUTE", 2, 15, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_UFFICIO, MyGlb.PANEL_LIST, 976, 36, 144, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_UFFICIO, MyGlb.PANEL_LIST, 52);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_UFFICIO, MyGlb.PANEL_FORM, 4, 436, 320, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_UFFICIO, MyGlb.PANEL_FORM, 2);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_UFFICIO, -1, -1);
    PAN_ESTRATTCONTO.SetFieldUnbound(PFL_ESTRATTCONTO_UFFICIO, true);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_UFFICIO, PPQRY_CF4WESTRCONT, "GET_DESCR_UFFICIO_INVIO(A.UFFICIO,~~TBL_DATISESSIONE.SESSIOMODULO~~,~~TBL_DATISESSIONE.SESSIONEENTE~~)", "UFFICIO", 5, 99, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DESCRIZIONE, MyGlb.PANEL_LIST, 1120, 36, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 316, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_DESCRIZIONE, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_DESCRIZIONE, PPQRY_CF4WESTRCONT, "A.DESCRIZIONE", "DESCRIZIONE", 5, 100, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CATEGORIA, MyGlb.PANEL_LIST, 1260, 36, 136, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CATEGORIA, MyGlb.PANEL_LIST, 68);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CATEGORIA, MyGlb.PANEL_FORM, 4, 472, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CATEGORIA, MyGlb.PANEL_FORM, 68);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_CATEGORIA, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_CATEGORIA, PPQRY_CF4WESTRCONT, "A.CATEGORIA", "CATEGORIA", 5, 49, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DATARIENTRO, MyGlb.PANEL_LIST, 1396, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DATARIENTRO, MyGlb.PANEL_LIST, 84);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DATARIENTRO, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DATARIENTRO, MyGlb.PANEL_LIST, "Data Rientro");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DATARIENTRO, MyGlb.PANEL_FORM, 4, 496, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DATARIENTRO, MyGlb.PANEL_FORM, 84);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DATARIENTRO, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_DATARIENTRO, MyGlb.PANEL_FORM, "Data Rientro");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_DATARIENTRO, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_DATARIENTRO, PPQRY_CF4WESTRCONT, "A.DATA_RIENTRO", "DATA_RIENTRO", 6, 19, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINAMEDATA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINAMEDATA, MyGlb.PANEL_LIST, 72);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINAMEDATA, MyGlb.PANEL_LIST, 2);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINAMEDATA, MyGlb.PANEL_LIST, "Ordinamento Data");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINAMEDATA, MyGlb.PANEL_FORM, 4, 628, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINAMEDATA, MyGlb.PANEL_FORM, 72);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINAMEDATA, MyGlb.PANEL_FORM, 2);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINAMEDATA, MyGlb.PANEL_FORM, "Ordin. Data");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_ORDINAMEDATA, -1, -1);
    PAN_ESTRATTCONTO.SetFieldUnbound(PFL_ESTRATTCONTO_ORDINAMEDATA, true);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_ORDINAMEDATA, PPQRY_CF4WESTRCONT, "CASE WHEN ~~PQRY_PARAM83.ROWNAMEORDIN~~ = 'D' THEN TO_DATE((TO_NUMBER(TO_CHAR(A.ORDIN_DATA, 'dd')))||'/'||(TO_NUMBER(TO_CHAR(A.ORDIN_DATA, 'mm' )))||'/'||(TO_NUMBER(TO_CHAR(A.ORDIN_DATA, 'yyyy'))),'dd/mm/yyyy') ELSE TRUNC( SYSDATE ) END", "ORDINAMEDATA", 6, 0, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINANUMERO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINANUMERO, MyGlb.PANEL_LIST, 112);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINANUMERO, MyGlb.PANEL_LIST, 2);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINANUMERO, MyGlb.PANEL_LIST, "Ordinamento Numero");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINANUMERO, MyGlb.PANEL_FORM, 4, 628, 544, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINANUMERO, MyGlb.PANEL_FORM, 112);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINANUMERO, MyGlb.PANEL_FORM, 2);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ORDINANUMERO, MyGlb.PANEL_FORM, "Ordinamento Numero");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_ORDINANUMERO, -1, -1);
    PAN_ESTRATTCONTO.SetFieldUnbound(PFL_ESTRATTCONTO_ORDINANUMERO, true);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_ORDINANUMERO, PPQRY_CF4WESTRCONT, "CASE WHEN ~~PQRY_PARAM83.ROWNAMEORDIN~~ = 'D' THEN '1' ELSE LPAD(A.ORDIN_NUMERO, 20, SUBSTR('0', 1, 1)) END", "ORDINANUMERO", 5, 99, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPO, MyGlb.PANEL_FORM, 4, 724, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPO, MyGlb.PANEL_FORM, 32);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_TIPO, MyGlb.PANEL_FORM, "TP.");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_TIPO, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_TIPO, PPQRY_CF4WESTRCONT, "A.TIPO", "TIPO", 12, 3, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ANNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ANNO, MyGlb.PANEL_LIST, 40);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ANNO, MyGlb.PANEL_LIST, "ANNO");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ANNO, MyGlb.PANEL_FORM, 4, 724, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ANNO, MyGlb.PANEL_FORM, 40);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_ANNO, MyGlb.PANEL_FORM, "ANNO");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_ANNO, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_ANNO, PPQRY_CF4WESTRCONT, "A.ANNO", "ANNO", 1, 4, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_NUMERO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_NUMERO, MyGlb.PANEL_LIST, 52);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_NUMERO, MyGlb.PANEL_LIST, "NUM.");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_NUMERO, MyGlb.PANEL_FORM, 4, 724, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_NUMERO, MyGlb.PANEL_FORM, 52);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_NUMERO, MyGlb.PANEL_FORM, "NUM.");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_NUMERO, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_NUMERO, PPQRY_CF4WESTRCONT, "A.NUMERO", "NUMERO", 1, 5, 0, -13997);
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SOGGETTO, MyGlb.PANEL_LIST, 1304, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SOGGETTO, MyGlb.PANEL_LIST, 64);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SOGGETTO, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SOGGETTO, MyGlb.PANEL_LIST, "SOGGETTO");
    PAN_ESTRATTCONTO.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SOGGETTO, MyGlb.PANEL_FORM, 4, 724, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTCONTO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SOGGETTO, MyGlb.PANEL_FORM, 64);
    PAN_ESTRATTCONTO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SOGGETTO, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTCONTO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTCONTO_SOGGETTO, MyGlb.PANEL_FORM, "SOGG.");
    PAN_ESTRATTCONTO.SetFieldPage(PFL_ESTRATTCONTO_SOGGETTO, -1, -1);
    PAN_ESTRATTCONTO.SetFieldPanel(PFL_ESTRATTCONTO_SOGGETTO, PPQRY_CF4WESTRCONT, "A.SOGGETTO", "SOGGETTO", 2, 15, 0, -13997);
  }

  private void PAN_ESTRATTCONTO_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESTRATTCONTO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ESTRATTCONTO.SetIMDB(IMDB, "PQRY_CF4WESTRCONT", true);
    PAN_ESTRATTCONTO.set_SetString(MyGlb.MASTER_ROWNAME, "CF4WEB ESTRATTO CONTO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DOCUMENTO as DOCUMENTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.PAGATO as PAGATO, ");
    SQL.append("  A.SALDO as SALDO, ");
    SQL.append("  A.RITENUTE as RITENUTE, ");
    SQL.append("  GET_DESCR_UFFICIO_INVIO(A.UFFICIO,~~TBL_DATISESSIONE.SESSIOMODULO~~,~~TBL_DATISESSIONE.SESSIONEENTE~~) as UFFICIO, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.DATA_RIENTRO as DATA_RIENTRO, ");
    SQL.append("  A.VARIAZIONI as VARIAZIONI, ");
    SQL.append("  A.FAT_DESCRIZIONE as FAT_DESCRIZIONE, ");
    SQL.append("  GET_STATO_FATTURA(A.ANNO,A.NUMERO,A.CODICE_DOC,A.TIPO) as CF4WESTRCONL, ");
    SQL.append("  CASE WHEN ~~PQRY_PARAM83.ROWNAMEORDIN~~ = 'D' THEN TO_DATE((TO_NUMBER(TO_CHAR(A.ORDIN_DATA, 'dd')))||'/'||(TO_NUMBER(TO_CHAR(A.ORDIN_DATA, 'mm' )))||'/'||(TO_NUMBER(TO_CHAR(A.ORDIN_DATA, 'yyyy'))),'dd/mm/yyyy') ELSE TRUNC( SYSDATE ) END as ORDINAMEDATA, ");
    SQL.append("  CASE WHEN ~~PQRY_PARAM83.ROWNAMEORDIN~~ = 'D' THEN '1' ELSE LPAD(A.ORDIN_NUMERO, 20, SUBSTR('0', 1, 1)) END as ORDINANUMERO, ");
    SQL.append("  'I' as CF4ESTCONINF, ");
    SQL.append("  CASE WHEN A.TIPO = 'LIQ' THEN '' ELSE 'D' END as CF4ESTCONDET, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.ANNO as ANNO, ");
    SQL.append("  A.NUMERO as NUMERO, ");
    SQL.append("  A.PARTE as PARTE, ");
    SQL.append("  A.CODICE_DOC as CODICE_DOC, ");
    SQL.append("  A.SOGGETTO as SOGGETTO, ");
    SQL.append("  A.IMPONIBILE as CF4ESTCONIMP, ");
    SQL.append("  A.IVA as CF4ESTCONIVA ");
    PAN_ESTRATTCONTO.SetQuery(PPQRY_CF4WESTRCONT, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CF4WEB_ESTRATTO_CONTO A ");
    PAN_ESTRATTCONTO.SetQuery(PPQRY_CF4WESTRCONT, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.SOGGETTO = ~~TBL_PARAM84.ROWNAMCODSOG~~) ");
    SQL.append("and   (A.DATA >= NVL(~~PQRY_PARAM83.ROWNAMEDAL~~, TO_DATE('1900-01-01','YYYY-MM-DD')) AND A.DATA <= NVL(~~PQRY_PARAM83.ROWNAMEAL~~, TO_DATE('2099-01-01','YYYY-MM-DD'))) ");
    SQL.append("and   (~~PQRY_PARAM83.ROWNAMAPECHI~~ = 'T' OR (~~PQRY_PARAM83.ROWNAMAPECHI~~ = 'A' AND A.SALDO <> 0) OR (~~PQRY_PARAM83.ROWNAMAPECHI~~ = 'C' AND A.SALDO = 0)) ");
    SQL.append("and   (~~PQRY_PARAM83.ROWNAMEPARTE~~ = 'T' OR (~~PQRY_PARAM83.ROWNAMEPARTE~~ = 'E' AND ((A.CODICE_DOC <> -1 AND A.CODICE_DOC IN (3, 4, 6, 8)) OR (A.CODICE_DOC = -1 AND A.PARTE = 'E'))) OR (~~PQRY_PARAM83.ROWNAMEPARTE~~ = 'S' AND ((A.CODICE_DOC <> -1 AND A.CODICE_DOC IN (1, 2, 5, 7)) OR (A.CODICE_DOC = -1 AND A.PARTE = 'S')))) ");
    PAN_ESTRATTCONTO.SetQuery(PPQRY_CF4WESTRCONT, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTRATTCONTO.SetQuery(PPQRY_CF4WESTRCONT, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTRATTCONTO.SetQuery(PPQRY_CF4WESTRCONT, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 13, 14 ");
    PAN_ESTRATTCONTO.SetQuery(PPQRY_CF4WESTRCONT, 5, SQL, -1, "");
    PAN_ESTRATTCONTO.SetQueryDB(PPQRY_CF4WESTRCONT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESTRATTCONTO.SetMasterTable(0, "CF4WEB_ESTRATTO_CONTO");
    PAN_ESTRATTCONTO.AddToSortList(PFL_ESTRATTCONTO_ORDINAMEDATA, true);
    PAN_ESTRATTCONTO.AddToSortList(PFL_ESTRATTCONTO_ORDINANUMERO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESTRATTCONTO.Status() == 2)
    {
      int oldListQBE = PAN_ESTRATTCONTO.iUseListQBE;
      PAN_ESTRATTCONTO.iUseListQBE = 0;
      PAN_ESTRATTCONTO.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESTRATTCONTO.PanelCommand(Glb.PCM_FIND);
      PAN_ESTRATTCONTO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ESTRATTCONTO) PAN_ESTRATTCONTO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_ESTRATTCONTO) PAN_ESTRATTCONTO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_ESTRATTCONTO) PAN_ESTRATTCONTO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ESTRATTCONTO) PAN_ESTRATTCONTO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ESTRATTCONTO) PAN_ESTRATTCONTO_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_ESTRATTCONTO) PAN_ESTRATTCONTO_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ESTRATTCONTO) PAN_ESTRATTCONTO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
