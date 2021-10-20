// **********************************************
// Piano Dei Conti 77
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PianoDeiConti77 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PIANODEICONT_ARTICOLO1 = 0;
  private static int PFL_PIANODEICONT_CAPITOLO1 = 1;
  private static int PFL_PIANODEICONT_RISORSINTERV = 2;
  private static int PFL_PIANODEICONT_LABERISOINTE = 3;
  private static int PFL_PIANODEICONT_PROGRADESCRI = 4;
  private static int PFL_PIANODEICONT_PROGETDESCRI = 5;
  private static int PFL_PIANODEICONT_VINCOLDESCRI = 6;
  private static int PFL_PIANODEICONT_CENTRIDESCRI = 7;
  private static int PFL_PIANODEICONT_FATTORDESCRI = 8;
  private static int PFL_PIANODEICONT_CODICE1 = 9;
  private static int PFL_PIANODEICONT_VOCEECONOMIC = 10;
  private static int PFL_PIANODEICONT_LABELCODGEST = 11;
  private static int PFL_PIANODEICONT_CODICEGESTIO = 12;
  private static int PFL_PIANODEICONT_PROGRAMMA = 13;
  private static int PFL_PIANODEICONT_PROGETTO = 14;
  private static int PFL_PIANODEICONT_RESPONSABILE = 15;
  private static int PFL_PIANODEICONT_TIPOVINCOLO = 16;
  private static int PFL_PIANODEICONT_RILIVA = 17;
  private static int PFL_PIANODEICONT_CONTRCOMUN = 18;
  private static int PFL_PIANODEICONT_RISORSSIGNIF = 19;
  private static int PFL_PIANODEICONT_FUNZDEL = 20;
  private static int PFL_PIANODEICONT_FLESSIDESCRI = 21;
  private static int PFL_PIANODEICONT_FLESSIBILITA = 22;
  private static int PFL_PIANODEICONT_CODMONITORAG = 23;
  private static int PFL_PIANODEICONT_VOCIPSDESCRI = 24;
  private static int PFL_PIANODEICONT_FATTORE = 25;
  private static int PFL_PIANODEICONT_CENTRO = 26;
  private static int PFL_PIANODEICONT_CAPTERDESCRI = 27;
  private static int PFL_PIANODEICONT_CATEGODESCRI = 28;
  private static int PFL_PIANODEICONT_FUNZIODESCRI = 29;
  private static int PFL_PIANODEICONT_INTERVDESCRI = 30;
  private static int PFL_PIANODEICONT_TITOLIDESCRI = 31;
  private static int PFL_PIANODEICONT_SERVIZDESCRI = 32;
  private static int PFL_PIANODEICONT_CAPITOLO = 33;
  private static int PFL_PIANODEICONT_ARTICOLO = 34;
  private static int PFL_PIANODEICONT_VOCIECONDESC = 35;
  private static int PFL_PIANODEICONT_CODIGESTDESC = 36;
  private static int PFL_PIANODEICONT_ES = 37;
  private static int PFL_PIANODEICONT_UOUTILIZZO = 38;

  private static int PPQRY_CAP23 = 0;

  private static int PPQRY_VOCIPS = 1;


  IDPanel PAN_PIANODEICONT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI477(IMDB);
    //
    //
    Init_PQRY_CAP23(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI477(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI477, 6);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI477, "TBL_PARAMETRI477");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI477,IMDBDef1.FLD_PARAMETRI477_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI477,IMDBDef1.FLD_PARAMETRI477_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI477,IMDBDef1.FLD_PARAMETRI477_PARAMRISORSA, "PARAMRISORSA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI477,IMDBDef1.FLD_PARAMETRI477_PARAMRISORSA,1,7,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI477,IMDBDef1.FLD_PARAMETRI477_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI477,IMDBDef1.FLD_PARAMETRI477_PARAMCAPITOL,1,6,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI477,IMDBDef1.FLD_PARAMETRI477_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI477,IMDBDef1.FLD_PARAMETRI477_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI477,IMDBDef1.FLD_PARAMETRI477_PARAGESTECON, "PARAGESTECON");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI477,IMDBDef1.FLD_PARAMETRI477_PARAGESTECON,1,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI477,IMDBDef1.FLD_PARAMETRI477_PARAMSCADENZ, "PARAMSCADENZ");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI477,IMDBDef1.FLD_PARAMETRI477_PARAMSCADENZ,6,19,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI477, 0);
  }

  private static void Init_PQRY_CAP23(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_CAP23, 52);
    IMDB.set_TblCode(IMDBDef8.PQRY_CAP23, "PQRY_CAP23");
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_RISORSA_INTERVENTO, "RISORSA_INTERVENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_RISORSA_INTERVENTO,1,7,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CATEGORIA,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_FUNZIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_SERVIZIO, "SERVIZIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_SERVIZIO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CENTRO_COSTO, "CENTRO_COSTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CENTRO_COSTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_COD_INTERVENTO, "COD_INTERVENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_COD_INTERVENTO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_COD_TERZI, "COD_TERZI");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_COD_TERZI,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_UNA_TANTUM, "UNA_TANTUM");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_UNA_TANTUM,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_IVA, "IVA");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_IVA,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_PROGETTO, "PROGETTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_PROGETTO,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_PROGRAMMA,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_SETTORE_OPERATIVO, "SETTORE_OPERATIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_SETTORE_OPERATIVO,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_SERVIZIO_OPERATIVO, "SERVIZIO_OPERATIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_SERVIZIO_OPERATIVO,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_RESPONSABILE, "RESPONSABILE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_RESPONSABILE,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CONTROLLO_BUDGET, "CONTROLLO_BUDGET");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CONTROLLO_BUDGET,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_FUNZ_DEL, "FUNZ_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_FUNZ_DEL,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CONTRIB_COMU, "CONTRIB_COMU");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CONTRIB_COMU,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_PERC_CONTROLLO, "PERC_CONTROLLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_PERC_CONTROLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_RISORSA_SIGNIF, "RISORSA_SIGNIF");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_RISORSA_SIGNIF,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_FLESSIBILITA, "FLESSIBILITA");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_FLESSIBILITA,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPCODMONITO, "CAPCODMONITO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPCODMONITO,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPLABRISINT, "CAPLABRISINT");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPLABRISINT,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPCAPITOLO, "CAPCAPITOLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPCAPITOLO,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPRISORINTE, "CAPRISORINTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPRISORINTE,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPCAPTEDESC, "CAPCAPTEDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPCAPTEDESC,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPCATEGDESC, "CAPCATEGDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPCATEGDESC,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPFUNZIDESC, "CAPFUNZIDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPFUNZIDESC,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPINTERDESC, "CAPINTERDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPINTERDESC,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPPROGRDESC, "CAPPROGRDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPPROGRDESC,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPPROGEDESC, "CAPPROGEDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPPROGEDESC,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPVOCECODES, "CAPVOCECODES");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPVOCECODES,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPTITOLDESC, "CAPTITOLDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPTITOLDESC,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPSERVIDESC, "CAPSERVIDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPSERVIDESC,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPVINCODESC, "CAPVINCODESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPVINCODESC,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPCENTRDESC, "CAPCENTRDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPCENTRDESC,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPFATTODESC, "CAPFATTODESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPFATTODESC,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPCODICE, "CAPCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPCODICE,1,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPLABCODGES, "CAPLABCODGES");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPLABCODGES,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPFLESSDESC, "CAPFLESSDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPFLESSDESC,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPCODGESDES, "CAPCODGESDES");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPCODGESDES,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPUOUTILIZZ, "CAPUOUTILIZZ");
    IMDB.SetFldParams(IMDBDef8.PQRY_CAP23,IMDBDef8.PQSL_CAP23_CAPUOUTILIZZ,5,201,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_CAP23, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PianoDeiConti77(MyWebEntryPoint w, IMDBObj imdb)
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
  public PianoDeiConti77()
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
    FormIdx = MyGlb.FRM_PIANDEICON77;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "589C5062-88A0-4745-8C6B-434434B5EB09";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 644;
    DesignHeight = 450;
    set_Caption(new IDVariant("Piano Dei Conti 77"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 644;
    Frames[1].Height = 424;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Piano Dei Conti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 424;
    PAN_PIANODEICONT = new IDPanel(w, this, 1, "PAN_PIANODEICONT");
    Frames[1].Content = PAN_PIANODEICONT;
    PAN_PIANODEICONT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PIANODEICONT.VS = MainFrm.VisualStyleList;
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 644-MyGlb.PAN_OFFS_X, 424-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "44160823-E478-4A25-8678-C64C8274FB69");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 7040, 952, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PIANODEICONT.InitStatus = 2;
    PAN_PIANODEICONT_Init();
    PAN_PIANODEICONT_InitFields();
    PAN_PIANODEICONT_InitQueries();
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
      PAN_PIANODEICONT.UpdatePanel(MainFrm);
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
    return (obj instanceof PianoDeiConti77);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PianoDeiConti77.class.getName() : (Glb.ClassWithPackage(PianoDeiConti77.class) ? PianoDeiConti77.class.getName().substring(PianoDeiConti77.class.getPackage().getName().length() + 1) : PianoDeiConti77.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Piano Dei Conti After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PIANODEICONT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Piano Dei Conti After Find Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef8.PQRY_CAP23, IMDBDef8.PQSL_CAP23_CAPITOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef8.PQRY_CAP23, IMDBDef8.PQSL_CAP23_ARTICOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_CAP23, IMDBDef8.PQSL_CAP23_VOCE_ECON, 0)))
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI477, IMDBDef1.FLD_PARAMETRI477_PARAMES, 0).equals((new IDVariant("S")), true))
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.NullValue(MainFrm.GESTIOECONOM,(new IDVariant(-1))).equals((new IDVariant(-1)), true))
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.FunctionRppAttiva().equals((new IDVariant(0)), true))
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PIANODEICONT.SetFlags (Glb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiConti77", "PianoDeiContiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Piano Dei Conti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PIANODEICONT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PIANODEICONT);
      // 
      // Piano Dei Conti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PIANODEICONT.set_ToolTip(Glb.OBJ_FIELD,PFL_PIANODEICONT_ARTICOLO1,IMDB.Value(IMDBDef8.PQRY_CAP23, IMDBDef8.PQSL_CAP23_DESCRIZIONE, 0).stringValue()); 
      PAN_PIANODEICONT.set_ToolTip(Glb.OBJ_FIELD,PFL_PIANODEICONT_CAPITOLO1,IMDB.Value(IMDBDef8.PQRY_CAP23, IMDBDef8.PQSL_CAP23_CAPCAPITOLO, 0).stringValue()); 
      PAN_PIANODEICONT.set_ToolTip(Glb.OBJ_FIELD,PFL_PIANODEICONT_RISORSINTERV,IMDB.Value(IMDBDef8.PQRY_CAP23, IMDBDef8.PQSL_CAP23_CAPRISORINTE, 0).stringValue()); 
      PAN_PIANODEICONT.set_ToolTip(Glb.OBJ_FIELD,PFL_PIANODEICONT_PROGRADESCRI,IMDB.Value(IMDBDef8.PQRY_CAP23, IMDBDef8.PQSL_CAP23_CAPPROGRDESC, 0).stringValue()); 
      PAN_PIANODEICONT.set_ToolTip(Glb.OBJ_FIELD,PFL_PIANODEICONT_PROGETDESCRI,IMDB.Value(IMDBDef8.PQRY_CAP23, IMDBDef8.PQSL_CAP23_CAPPROGEDESC, 0).stringValue()); 
      PAN_PIANODEICONT.set_ToolTip(Glb.OBJ_FIELD,PFL_PIANODEICONT_VINCOLDESCRI,IMDB.Value(IMDBDef8.PQRY_CAP23, IMDBDef8.PQSL_CAP23_CAPVINCODESC, 0).stringValue()); 
      PAN_PIANODEICONT.set_ToolTip(Glb.OBJ_FIELD,PFL_PIANODEICONT_CENTRIDESCRI,IMDB.Value(IMDBDef8.PQRY_CAP23, IMDBDef8.PQSL_CAP23_CAPCENTRDESC, 0).stringValue()); 
      PAN_PIANODEICONT.set_ToolTip(Glb.OBJ_FIELD,PFL_PIANODEICONT_FATTORDESCRI,IMDB.Value(IMDBDef8.PQRY_CAP23, IMDBDef8.PQSL_CAP23_CAPFATTODESC, 0).stringValue()); 
      PAN_PIANODEICONT.set_ToolTip(Glb.OBJ_FIELD,PFL_PIANODEICONT_VOCIECONDESC,IMDB.Value(IMDBDef8.PQRY_CAP23, IMDBDef8.PQSL_CAP23_CAPVOCECODES, 0).stringValue()); 
      PAN_PIANODEICONT.set_ToolTip(Glb.OBJ_FIELD,PFL_PIANODEICONT_CODIGESTDESC,IMDB.Value(IMDBDef8.PQRY_CAP23, IMDBDef8.PQSL_CAP23_CAPCODGESDES, 0).stringValue()); 
      PAN_PIANODEICONT.set_ToolTip(Glb.OBJ_FIELD,PFL_PIANODEICONT_VOCIPSDESCRI,(new IDVariant(PAN_PIANODEICONT.FieldText(PFL_PIANODEICONT_VOCIPSDESCRI))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PianoDeiConti77", "PianoDeiContiOnDynamicPropertiesEvent", _e);
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
      MainFrm.ErrObj.ProcError ("PianoDeiConti77", "LoadEvent", _e);
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
  private void PAN_PIANODEICONT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PIANODEICONT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PIANODEICONT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PIANODEICONT, Cancel);
    // Stub
  }

  private void PAN_PIANODEICONT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PIANODEICONT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PIANODEICONT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PIANODEICONT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PIANODEICONT_Init()
  {

    PAN_PIANODEICONT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PIANODEICONT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PIANODEICONT.SetSize(MyGlb.OBJ_FIELD, 39);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, "1DDE0B22-D4FC-4C6C-B657-2B07B4D14295");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, "Articolo");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, "7E67D7B4-DE82-4628-B8E5-CBDA636638CE");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, "Capitolo");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSINTERV, "6523E1B6-4D9E-4159-8853-24C74C3A1C66");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSINTERV, "Risorsa Intervento");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSINTERV, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSINTERV, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSINTERV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABERISOINTE, "0958772C-76A0-4961-94EC-A2F2FCF646AD");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABERISOINTE, "Label Risorsa Intervento");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABERISOINTE, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABERISOINTE, MyGlb.VIS_VUOTONORMALE);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABERISOINTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, "C54839E4-01FF-4E19-BE59-91A51B625341");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, "Programmi Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, "AF1DD0A9-FAFD-4696-81A4-0B3B5999EA29");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, "Progetti Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VINCOLDESCRI, "8A4491B2-82A9-4E5A-8E6B-2835E52A378C");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VINCOLDESCRI, "Vincoli Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VINCOLDESCRI, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VINCOLDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VINCOLDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, "3B271AA1-4A12-4E3A-939A-EA8914E38056");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, "Centri Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, "7DBF614E-8FE6-4C8B-B56A-95A9FAE67A07");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, "Fattori Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE1, "355CDF78-2713-4678-A6AF-F8E9EBC09ECE");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE1, "Codice");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE1, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE1, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, "BE21C894-BEB4-482E-B7CD-DE8337FFCC35");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, "Voce Economica");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABELCODGEST, "879F2228-5178-4055-970F-5224E06B8EAC");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABELCODGEST, "Label Cod Gest");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABELCODGEST, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABELCODGEST, MyGlb.VIS_VUOTONORMALE);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABELCODGEST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICEGESTIO, "FA99CD73-6B4C-46C3-BB2E-3C44B1984C01");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICEGESTIO, "Codice Gestionale");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICEGESTIO, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICEGESTIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICEGESTIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, "679097F5-D714-4E33-BD57-FD5838E6B545");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, "Programma");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, "E5904CA4-0A44-4D05-9626-0075BF4CCB0B");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, "Obiettivo Operativo");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RESPONSABILE, "F9B97913-13A2-4759-8B18-802679A04E72");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RESPONSABILE, "Responsabile");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RESPONSABILE, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RESPONSABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RESPONSABILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TIPOVINCOLO, "ABFE74E7-4B4B-4176-87C2-73F101D2C16C");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TIPOVINCOLO, "Tipo Vincolo");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TIPOVINCOLO, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TIPOVINCOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RILIVA, "1F09B9A1-18E2-4BF0-93EF-D2932142C512");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RILIVA, "Ril. I.V.A.");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RILIVA, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RILIVA, MyGlb.VIS_CHECKSTYLE);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RILIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, "6B04ED91-A889-4007-9122-FB714BA77265");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, "Contr. Comun.");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, MyGlb.VIS_CHECKSTYLE);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, "11932A8D-F669-4A22-8944-3FF36DF77141");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, "Risorsa Signif.");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, MyGlb.VIS_CHECKSTYLE);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZDEL, "2DABAC66-112A-4230-9CB2-61E607BD8391");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZDEL, "Funz. Del.");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZDEL, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZDEL, MyGlb.VIS_CHECKSTYLE);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIDESCRI, "90E5CA81-9937-4D70-9163-EEDF2C2964B4");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIDESCRI, "Flessibilità Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIDESCRI, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIBILITA, "A0DA4E17-2A8D-4732-AA9D-EA0E42DD4322");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIBILITA, "Flessibilità");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIBILITA, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIBILITA, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIBILITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODMONITORAG, "7E5E019C-E28B-4626-A633-9A232D7F10CD");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODMONITORAG, "Cod. Monitoraggio");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODMONITORAG, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODMONITORAG, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODMONITORAG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIPSDESCRI, "8363EE23-0C61-4334-A28B-D3C554EF4B60");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIPSDESCRI, "VOCI PS DESCRIZIONE");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIPSDESCRI, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIPSDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIPSDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, "3A30141F-CC54-4563-A577-DE74BC665435");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, "Fattore");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, "B7060BD9-3F64-470E-A9A5-6BFD4CEF3899");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, "Centro");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPTERDESCRI, "08E6DAD4-9E6F-4D3E-A130-BA77AF38691D");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPTERDESCRI, "Capter Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPTERDESCRI, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPTERDESCRI, MyGlb.VIS_NORMFIELPADR);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPTERDESCRI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CATEGODESCRI, "D5B0A76C-46F3-404C-99C0-F619894614E7");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CATEGODESCRI, "Categoria Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CATEGODESCRI, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CATEGODESCRI, MyGlb.VIS_NORMFIELPADR);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CATEGODESCRI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZIODESCRI, "C3058D0A-9311-489B-AF22-8B24226B4A7B");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZIODESCRI, "Funzioni Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZIODESCRI, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZIODESCRI, MyGlb.VIS_NORMFIELPADR);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZIODESCRI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_INTERVDESCRI, "1354413C-C324-49A0-8D66-E6868C59D80B");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_INTERVDESCRI, "Interventi Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_INTERVDESCRI, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_INTERVDESCRI, MyGlb.VIS_NORMFIELPADR);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_INTERVDESCRI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TITOLIDESCRI, "6C69886F-C508-411F-BD5A-2431BEE2AD56");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TITOLIDESCRI, "Titoli Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TITOLIDESCRI, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TITOLIDESCRI, MyGlb.VIS_NORMFIELPADR);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TITOLIDESCRI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_SERVIZDESCRI, "101EC6D3-0DE2-4E05-92C9-EB8B29CAC9AD");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_SERVIZDESCRI, "Servizi Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_SERVIZDESCRI, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_SERVIZDESCRI, MyGlb.VIS_NORMFIELPADR);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_SERVIZDESCRI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, "60B06FC3-1A89-418E-AB8D-41C6F4D31E9B");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, "CAPITOLO");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, "CBF63969-2594-42DD-8A2B-BAB407497D6E");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, "ARTICOLO");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIECONDESC, "B5672A04-11A5-464C-951F-0AB2FC601A4B");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIECONDESC, "Voci Economiche Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIECONDESC, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIECONDESC, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIECONDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODIGESTDESC, "2D3CDD7A-1677-469A-A5EB-9C4DA724A5FC");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODIGESTDESC, "Codice Gestionale Descrizione");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODIGESTDESC, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODIGESTDESC, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODIGESTDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, "8F54E9BD-B1FB-4085-ABAD-8ED88FCC38A6");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, "E S");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PIANODEICONT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_UOUTILIZZO, "0F25D0FC-04C8-4930-8AA1-928BAB997330");
    PAN_PIANODEICONT.set_Header(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_UOUTILIZZO, "U. O. Utilizzo");
    PAN_PIANODEICONT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_UOUTILIZZO, "");
    PAN_PIANODEICONT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_UOUTILIZZO, MyGlb.VIS_NORMALFIELDS);
    PAN_PIANODEICONT.SetFlags(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_UOUTILIZZO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PIANODEICONT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, MyGlb.PANEL_LIST, 4, 960, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, MyGlb.PANEL_LIST, 96);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, MyGlb.PANEL_LIST, "Articolo");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, MyGlb.PANEL_FORM, 72, 64, 536, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, MyGlb.PANEL_FORM, 52);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO1, MyGlb.PANEL_FORM, "Articolo");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_ARTICOLO1, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_ARTICOLO1, PPQRY_CAP23, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, MyGlb.PANEL_LIST, 96);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, MyGlb.PANEL_FORM, 68, 40, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, MyGlb.PANEL_FORM, 56);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_CAPITOLO1, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_CAPITOLO1, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_CAPITOLO1, PPQRY_CAP23, "A_GET_DESCRIZIONE_CAP_77(~~TBL_DATISESSIONE.SESSIOESERCI~~,A.E_S,A.RISORSA_INTERVENTO,A.CAPITOLO,0)", "CAPCAPITOLO", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSINTERV, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSINTERV, MyGlb.PANEL_LIST, 96);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSINTERV, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSINTERV, MyGlb.PANEL_LIST, "Risorsa Intervento");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSINTERV, MyGlb.PANEL_FORM, 128, 16, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSINTERV, MyGlb.PANEL_FORM, 96);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSINTERV, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSINTERV, MyGlb.PANEL_FORM, "Ris. Intervento");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_RISORSINTERV, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_RISORSINTERV, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_RISORSINTERV, PPQRY_CAP23, "A_GET_DESCRIZIONE_CAP_77(~~TBL_DATISESSIONE.SESSIOESERCI~~,A.E_S,A.RISORSA_INTERVENTO,0,0)", "CAPRISORINTE", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABERISOINTE, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABERISOINTE, MyGlb.PANEL_LIST, 128);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABERISOINTE, MyGlb.PANEL_LIST, 3);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABERISOINTE, MyGlb.PANEL_LIST, "Label Risorsa Intervento");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABERISOINTE, MyGlb.PANEL_FORM, 44, 16, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABERISOINTE, MyGlb.PANEL_FORM, 128);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABERISOINTE, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABERISOINTE, MyGlb.PANEL_FORM, "Lab. Ris. Intervento");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_LABERISOINTE, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_LABERISOINTE, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_LABERISOINTE, PPQRY_CAP23, "DECODE(~~TBL_PARAMETRI61.PARAMES~~, 'E', 'Risorsa', 'Intervento')", "CAPLABRISINT", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, MyGlb.PANEL_LIST, 116);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, MyGlb.PANEL_LIST, "Programmi Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, MyGlb.PANEL_FORM, 184, 136, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, MyGlb.PANEL_FORM, 116);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRADESCRI, MyGlb.PANEL_FORM, "Progr. Descrizione");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_PROGRADESCRI, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_PROGRADESCRI, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_PROGRADESCRI, PPQRY_CAP23, "A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.PROGRAMMA ),NULL,'DPGM')", "CAPPROGRDESC", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, MyGlb.PANEL_LIST, 104);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, MyGlb.PANEL_LIST, "Progetti Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, MyGlb.PANEL_FORM, 176, 160, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, MyGlb.PANEL_FORM, 104);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETDESCRI, MyGlb.PANEL_FORM, "Prog. Descrizione");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_PROGETDESCRI, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_PROGETDESCRI, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_PROGETDESCRI, PPQRY_CAP23, "A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.PROGRAMMA ),TO_CHAR ( A.PROGETTO ),'DPRG')", "CAPPROGEDESC", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VINCOLDESCRI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VINCOLDESCRI, MyGlb.PANEL_LIST, 96);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VINCOLDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VINCOLDESCRI, MyGlb.PANEL_LIST, "Vincoli Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VINCOLDESCRI, MyGlb.PANEL_FORM, 184, 208, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VINCOLDESCRI, MyGlb.PANEL_FORM, 96);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VINCOLDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VINCOLDESCRI, MyGlb.PANEL_FORM, "Vinc. Descr.");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_VINCOLDESCRI, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_VINCOLDESCRI, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_VINCOLDESCRI, PPQRY_CAP23, "A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.TIPO_VINCOLO ),NULL,'DVI')", "CAPVINCODESC", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, MyGlb.PANEL_LIST, 96);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, MyGlb.PANEL_LIST, "Centri Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, MyGlb.PANEL_FORM, 184, 328, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, MyGlb.PANEL_FORM, 96);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRIDESCRI, MyGlb.PANEL_FORM, "Cent. Descr.");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_CENTRIDESCRI, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_CENTRIDESCRI, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_CENTRIDESCRI, PPQRY_CAP23, "A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.CENTRO ),NULL,'DCE')", "CAPCENTRDESC", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, MyGlb.PANEL_LIST, 100);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, MyGlb.PANEL_LIST, "Fattori Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, MyGlb.PANEL_FORM, 184, 304, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, MyGlb.PANEL_FORM, 100);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORDESCRI, MyGlb.PANEL_FORM, "Fatt. Descrizione");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_FATTORDESCRI, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_FATTORDESCRI, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_FATTORDESCRI, PPQRY_CAP23, "A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.FATTORE ),NULL,'DFA')", "CAPFATTODESC", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE1, MyGlb.PANEL_LIST, 40);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE1, MyGlb.PANEL_LIST, "Codice");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE1, MyGlb.PANEL_FORM, 76, 88, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE1, MyGlb.PANEL_FORM, 48);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICE1, MyGlb.PANEL_FORM, "Codice");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_CODICE1, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_CODICE1, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_CODICE1, PPQRY_CAP23, "A_GET_CODICE_CAP_77(~~TBL_DATISESSIONE.SESSIOESERCI~~,A.E_S,A.RISORSA_INTERVENTO,A.CAPITOLO,A.ARTICOLO)", "CAPCODICE", 1, 19, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, MyGlb.PANEL_LIST, 68);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, MyGlb.PANEL_LIST, "Voce Economica");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, MyGlb.PANEL_FORM, 216, 88, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, MyGlb.PANEL_FORM, 100);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCEECONOMIC, MyGlb.PANEL_FORM, "Voce Economica");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_VOCEECONOMIC, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_VOCEECONOMIC, PPQRY_CAP23, "A.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABELCODGEST, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABELCODGEST, MyGlb.PANEL_LIST, 80);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABELCODGEST, MyGlb.PANEL_LIST, 3);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABELCODGEST, MyGlb.PANEL_LIST, "Label Cod Gest");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABELCODGEST, MyGlb.PANEL_FORM, 72, 112, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABELCODGEST, MyGlb.PANEL_FORM, 80);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABELCODGEST, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_LABELCODGEST, MyGlb.PANEL_FORM, "Lab. Cod Gst.");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_LABELCODGEST, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_LABELCODGEST, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_LABELCODGEST, PPQRY_CAP23, "DECODE(~~TBL_PARAMETRI61.PARAMES~~, 'E', 'Cge', 'Cgu')", "CAPLABCODGES", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICEGESTIO, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICEGESTIO, MyGlb.PANEL_LIST, 112);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICEGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICEGESTIO, MyGlb.PANEL_LIST, "Codice Gestionale");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICEGESTIO, MyGlb.PANEL_FORM, 128, 112, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICEGESTIO, MyGlb.PANEL_FORM, 112);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICEGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODICEGESTIO, MyGlb.PANEL_FORM, "Codice Gestionale");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_CODICEGESTIO, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_CODICEGESTIO, PPQRY_CAP23, "A.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, MyGlb.PANEL_LIST, 76);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, MyGlb.PANEL_LIST, "Programma");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, MyGlb.PANEL_FORM, 48, 136, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, MyGlb.PANEL_FORM, 76);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGRAMMA, MyGlb.PANEL_FORM, "Programma");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_PROGRAMMA, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_PROGRAMMA, PPQRY_CAP23, "A.PROGRAMMA", "PROGRAMMA", 5, 4, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, MyGlb.PANEL_LIST, 64);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, MyGlb.PANEL_FORM, 4, 160, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, MyGlb.PANEL_FORM, 120);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_PROGETTO, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_PROGETTO, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_PROGETTO, PPQRY_CAP23, "A.PROGETTO", "PROGETTO", 5, 4, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RESPONSABILE, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RESPONSABILE, MyGlb.PANEL_LIST, 84);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RESPONSABILE, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RESPONSABILE, MyGlb.PANEL_LIST, "Responsabile");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RESPONSABILE, MyGlb.PANEL_FORM, 36, 184, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RESPONSABILE, MyGlb.PANEL_FORM, 88);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RESPONSABILE, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RESPONSABILE, MyGlb.PANEL_FORM, "Responsabile");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_RESPONSABILE, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_RESPONSABILE, PPQRY_CAP23, "A.RESPONSABILE", "RESPONSABILE", 5, 40, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TIPOVINCOLO, MyGlb.PANEL_LIST, 80);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TIPOVINCOLO, MyGlb.PANEL_FORM, 44, 208, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TIPOVINCOLO, MyGlb.PANEL_FORM, 80);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_TIPOVINCOLO, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_TIPOVINCOLO, PPQRY_CAP23, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RILIVA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RILIVA, MyGlb.PANEL_LIST, 28);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RILIVA, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RILIVA, MyGlb.PANEL_LIST, "Ril. I.V.A.");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RILIVA, MyGlb.PANEL_FORM, 60, 232, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RILIVA, MyGlb.PANEL_FORM, 64);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RILIVA, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RILIVA, MyGlb.PANEL_FORM, "Ril. I.V.A.");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_RILIVA, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_RILIVA, PPQRY_CAP23, "A.IVA", "IVA", 5, 2, 0, -13997);
    PAN_PIANODEICONT.SetValueListItem(PFL_PIANODEICONT_RILIVA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PIANODEICONT.SetValueListItem(PFL_PIANODEICONT_RILIVA, (new IDVariant()), "Null", "", "", -1);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, MyGlb.PANEL_LIST, 88);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, MyGlb.PANEL_LIST, "Contr. Comun.");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, MyGlb.PANEL_FORM, 176, 232, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, MyGlb.PANEL_FORM, 92);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CONTRCOMUN, MyGlb.PANEL_FORM, "Contr. Comun.");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_CONTRCOMUN, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_CONTRCOMUN, PPQRY_CAP23, "A.CONTRIB_COMU", "CONTRIB_COMU", 5, 2, 0, -13997);
    PAN_PIANODEICONT.SetValueListItem(PFL_PIANODEICONT_CONTRCOMUN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PIANODEICONT.SetValueListItem(PFL_PIANODEICONT_CONTRCOMUN, (new IDVariant()), "Null", "", "", -1);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, MyGlb.PANEL_LIST, 92);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, MyGlb.PANEL_LIST, "Risorsa Signif.");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, MyGlb.PANEL_FORM, 176, 232, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, MyGlb.PANEL_FORM, 92);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_RISORSSIGNIF, MyGlb.PANEL_FORM, "Risorsa Signif.");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_RISORSSIGNIF, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_RISORSSIGNIF, PPQRY_CAP23, "A.RISORSA_SIGNIF", "RISORSA_SIGNIF", 5, 2, 0, -13997);
    PAN_PIANODEICONT.SetValueListItem(PFL_PIANODEICONT_RISORSSIGNIF, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PIANODEICONT.SetValueListItem(PFL_PIANODEICONT_RISORSSIGNIF, (new IDVariant()), "Null", "", "", -1);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZDEL, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZDEL, MyGlb.PANEL_LIST, 56);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZDEL, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZDEL, MyGlb.PANEL_LIST, "Funz. Del.");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZDEL, MyGlb.PANEL_FORM, 316, 232, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZDEL, MyGlb.PANEL_FORM, 68);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZDEL, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZDEL, MyGlb.PANEL_FORM, "Funz. Del.");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_FUNZDEL, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_FUNZDEL, PPQRY_CAP23, "A.FUNZ_DEL", "FUNZ_DEL", 5, 2, 0, -13997);
    PAN_PIANODEICONT.SetValueListItem(PFL_PIANODEICONT_FUNZDEL, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PIANODEICONT.SetValueListItem(PFL_PIANODEICONT_FUNZDEL, (new IDVariant()), "Null", "", "", -1);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIDESCRI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIDESCRI, MyGlb.PANEL_LIST, 56);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIDESCRI, MyGlb.PANEL_LIST, "Flessibilità Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIDESCRI, MyGlb.PANEL_FORM, 184, 256, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIDESCRI, MyGlb.PANEL_FORM, 56);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIDESCRI, MyGlb.PANEL_FORM, "Fls. Dsc.");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_FLESSIDESCRI, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_FLESSIDESCRI, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_FLESSIDESCRI, PPQRY_CAP23, "A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.FLESSIBILITA ),NULL,'DFL')", "CAPFLESSDESC", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIBILITA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIBILITA, MyGlb.PANEL_LIST, 76);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIBILITA, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIBILITA, MyGlb.PANEL_LIST, "Flessibilità");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIBILITA, MyGlb.PANEL_FORM, 52, 256, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIBILITA, MyGlb.PANEL_FORM, 72);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIBILITA, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FLESSIBILITA, MyGlb.PANEL_FORM, "Flessibilità");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_FLESSIBILITA, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_FLESSIBILITA, PPQRY_CAP23, "A.FLESSIBILITA", "FLESSIBILITA", 5, 4, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODMONITORAG, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODMONITORAG, MyGlb.PANEL_LIST, 124);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODMONITORAG, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODMONITORAG, MyGlb.PANEL_LIST, "Cod. Monitoraggio");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODMONITORAG, MyGlb.PANEL_FORM, 12, 280, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODMONITORAG, MyGlb.PANEL_FORM, 112);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODMONITORAG, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODMONITORAG, MyGlb.PANEL_FORM, "Cod. Monitoraggio");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_CODMONITORAG, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_CODMONITORAG, PPQRY_CAP23, "A.COD_MONITORAGGIO", "CAPCODMONITO", 5, 4, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIPSDESCRI, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIPSDESCRI, MyGlb.PANEL_LIST, 132);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIPSDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIPSDESCRI, MyGlb.PANEL_LIST, "VOCI PS DESCRIZIONE");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIPSDESCRI, MyGlb.PANEL_FORM, 184, 280, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIPSDESCRI, MyGlb.PANEL_FORM, 132);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIPSDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIPSDESCRI, MyGlb.PANEL_FORM, "VOCI PS DESCRIZIONE");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_VOCIPSDESCRI, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_VOCIPSDESCRI, PPQRY_VOCIPS, "MIN(A.DESCRIZIONE)", "VOCIPSDESCRI", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, MyGlb.PANEL_FORM, 64, 304, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, MyGlb.PANEL_FORM, 60);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_FATTORE, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_FATTORE, PPQRY_CAP23, "A.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, MyGlb.PANEL_FORM, 64, 328, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, MyGlb.PANEL_FORM, 60);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_CENTRO, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_CENTRO, PPQRY_CAP23, "A.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPTERDESCRI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPTERDESCRI, MyGlb.PANEL_LIST, 100);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPTERDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPTERDESCRI, MyGlb.PANEL_LIST, "Capter Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPTERDESCRI, MyGlb.PANEL_FORM, 4, 304, 532, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPTERDESCRI, MyGlb.PANEL_FORM, 100);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPTERDESCRI, MyGlb.PANEL_FORM, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPTERDESCRI, MyGlb.PANEL_FORM, "Capter Descrizione");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_CAPTERDESCRI, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_CAPTERDESCRI, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_CAPTERDESCRI, PPQRY_CAP23, "A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.CAPITOLO ),NULL,'DTE')", "CAPCAPTEDESC", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CATEGODESCRI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CATEGODESCRI, MyGlb.PANEL_LIST, 112);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CATEGODESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CATEGODESCRI, MyGlb.PANEL_LIST, "Categoria Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CATEGODESCRI, MyGlb.PANEL_FORM, 4, 304, 544, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CATEGODESCRI, MyGlb.PANEL_FORM, 112);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CATEGODESCRI, MyGlb.PANEL_FORM, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CATEGODESCRI, MyGlb.PANEL_FORM, "Categoria Descrizione");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_CATEGODESCRI, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_CATEGODESCRI, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_CATEGODESCRI, PPQRY_CAP23, "A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.TITOLO ),TO_CHAR ( A.CATEGORIA ),'DCA')", "CAPCATEGDESC", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZIODESCRI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZIODESCRI, MyGlb.PANEL_LIST, 104);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZIODESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZIODESCRI, MyGlb.PANEL_LIST, "Funzioni Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZIODESCRI, MyGlb.PANEL_FORM, 4, 304, 536, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZIODESCRI, MyGlb.PANEL_FORM, 104);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZIODESCRI, MyGlb.PANEL_FORM, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_FUNZIODESCRI, MyGlb.PANEL_FORM, "Funzioni Descrizione");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_FUNZIODESCRI, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_FUNZIODESCRI, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_FUNZIODESCRI, PPQRY_CAP23, "A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.FUNZIONE ),NULL,'DFU')", "CAPFUNZIDESC", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_INTERVDESCRI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_INTERVDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_INTERVDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_INTERVDESCRI, MyGlb.PANEL_LIST, "Interventi Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_INTERVDESCRI, MyGlb.PANEL_FORM, 4, 304, 548, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_INTERVDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_INTERVDESCRI, MyGlb.PANEL_FORM, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_INTERVDESCRI, MyGlb.PANEL_FORM, "Interventi Descrizione");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_INTERVDESCRI, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_INTERVDESCRI, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_INTERVDESCRI, PPQRY_CAP23, "A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.TITOLO ),TO_CHAR ( A.RISORSA_INTERVENTO ),'DIN')", "CAPINTERDESC", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TITOLIDESCRI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TITOLIDESCRI, MyGlb.PANEL_LIST, 88);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TITOLIDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TITOLIDESCRI, MyGlb.PANEL_LIST, "Titoli Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TITOLIDESCRI, MyGlb.PANEL_FORM, 4, 304, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TITOLIDESCRI, MyGlb.PANEL_FORM, 88);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TITOLIDESCRI, MyGlb.PANEL_FORM, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_TITOLIDESCRI, MyGlb.PANEL_FORM, "Titoli Descrizione");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_TITOLIDESCRI, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_TITOLIDESCRI, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_TITOLIDESCRI, PPQRY_CAP23, "A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.TITOLO ),NULL,'DTI')", "CAPTITOLDESC", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_SERVIZDESCRI, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_SERVIZDESCRI, MyGlb.PANEL_LIST, 96);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_SERVIZDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_SERVIZDESCRI, MyGlb.PANEL_LIST, "Servizi Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_SERVIZDESCRI, MyGlb.PANEL_FORM, 4, 304, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_SERVIZDESCRI, MyGlb.PANEL_FORM, 96);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_SERVIZDESCRI, MyGlb.PANEL_FORM, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_SERVIZDESCRI, MyGlb.PANEL_FORM, "Servizi Descrizione");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_SERVIZDESCRI, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_SERVIZDESCRI, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_SERVIZDESCRI, PPQRY_CAP23, "A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.FUNZIONE ),TO_CHAR ( A.SERVIZIO ),'DSE')", "CAPSERVIDESC", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_LIST, 8, 44, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_FORM, 12, 312, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_CAPITOLO, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_CAPITOLO, PPQRY_CAP23, "A.CAPITOLO", "CAPITOLO", 1, 6, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_FORM, 4, 304, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_ARTICOLO, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_ARTICOLO, PPQRY_CAP23, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIECONDESC, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIECONDESC, MyGlb.PANEL_LIST, 144);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIECONDESC, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIECONDESC, MyGlb.PANEL_LIST, "Voci Economiche Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIECONDESC, MyGlb.PANEL_FORM, 348, 88, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIECONDESC, MyGlb.PANEL_FORM, 144);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIECONDESC, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_VOCIECONDESC, MyGlb.PANEL_FORM, "Vc. Econom. Descrizione");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_VOCIECONDESC, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_VOCIECONDESC, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_VOCIECONDESC, PPQRY_CAP23, "A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.VOCE_ECON ),NULL,'DVEC')", "CAPVOCECODES", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODIGESTDESC, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODIGESTDESC, MyGlb.PANEL_LIST, 152);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODIGESTDESC, MyGlb.PANEL_LIST, 2);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODIGESTDESC, MyGlb.PANEL_LIST, "Codice Gestionale Descrizione");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODIGESTDESC, MyGlb.PANEL_FORM, 184, 112, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODIGESTDESC, MyGlb.PANEL_FORM, 152);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODIGESTDESC, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_CODIGESTDESC, MyGlb.PANEL_FORM, "Cod. Gestion. Descrizione");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_CODIGESTDESC, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_CODIGESTDESC, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_CODIGESTDESC, PPQRY_CAP23, "A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.CODICE_GESTIONALE ),NULL,'DGEST')", "CAPCODGESDES", 5, 99, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_LIST, 24);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_LIST, "E S");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_FORM, 4, 328, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_FORM, 24);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_ES, MyGlb.PANEL_FORM, "E S");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_ES, -1, -1);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_ES, PPQRY_CAP23, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_UOUTILIZZO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_UOUTILIZZO, MyGlb.PANEL_LIST, 64);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_UOUTILIZZO, MyGlb.PANEL_LIST, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_UOUTILIZZO, MyGlb.PANEL_LIST, "U. O. Utilizzo");
    PAN_PIANODEICONT.SetRect(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_UOUTILIZZO, MyGlb.PANEL_FORM, 44, 352, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PIANODEICONT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_UOUTILIZZO, MyGlb.PANEL_FORM, 80);
    PAN_PIANODEICONT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_UOUTILIZZO, MyGlb.PANEL_FORM, 1);
    PAN_PIANODEICONT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PIANODEICONT_UOUTILIZZO, MyGlb.PANEL_FORM, "U. O. Utilizzo");
    PAN_PIANODEICONT.SetFieldPage(PFL_PIANODEICONT_UOUTILIZZO, -1, -1);
    PAN_PIANODEICONT.SetFieldUnbound(PFL_PIANODEICONT_UOUTILIZZO, true);
    PAN_PIANODEICONT.SetFieldPanel(PFL_PIANODEICONT_UOUTILIZZO, PPQRY_CAP23, "TO_CHAR ( GET_UO_UTILIZZO_77(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI477.PARAMES~~,~~TBL_PARAMETRI477.PARAMRISORSA~~,~~TBL_PARAMETRI477.PARAMCAPITOL~~,~~TBL_PARAMETRI477.PARAMARTICOL~~,~~TBL_PARAMETRI477.PARAMSCADENZ~~) ) || ' - ' || DECODE(GET_UO_UTILIZZO_77(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI477.PARAMES~~,~~TBL_PARAMETRI477.PARAMRISORSA~~,~~TBL_PARAMETRI477.PARAMCAPITOL~~,~~TBL_PARAMETRI477.PARAMARTICOL~~,~~TBL_PARAMETRI477.PARAMSCADENZ~~), to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(GET_UO_UTILIZZO_77(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI477.PARAMES~~,~~TBL_PARAMETRI477.PARAMRISORSA~~,~~TBL_PARAMETRI477.PARAMCAPITOL~~,~~TBL_PARAMETRI477.PARAMARTICOL~~,~~TBL_PARAMETRI477.PARAMSCADENZ~~),TRUNC( SYSDATE )))", "CAPUOUTILIZZ", 5, 201, 0, -13997);
  }

  private void PAN_PIANODEICONT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PIANODEICONT.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  MIN(A.DESCRIZIONE) as VOCIPSDESCRI ");
    SQL.append("from ");
    SQL.append("  VOCI_PS A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~ OR A.ESERCIZIO = 0) ");
    SQL.append("and   (A.TIPO_STAMPA = 'PS1') ");
    SQL.append("and   (A.CODICE = ~~CAPCODMONITO~~) ");
    PAN_PIANODEICONT.SetQuery(PPQRY_VOCIPS, 0, SQL, -1, "");
    PAN_PIANODEICONT.SetQueryDB(PPQRY_VOCIPS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PIANODEICONT.SetMasterTable(PPQRY_VOCIPS, "VOCI_PS");
    PAN_PIANODEICONT.SetIMDB(IMDB, "PQRY_CAP23", true);
    PAN_PIANODEICONT.set_SetString(MyGlb.MASTER_ROWNAME, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.RISORSA_INTERVENTO as RISORSA_INTERVENTO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.VOCE_ECON as VOCE_ECON, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.SERVIZIO as SERVIZIO, ");
    SQL.append("  A.CENTRO_COSTO as CENTRO_COSTO, ");
    SQL.append("  A.COD_INTERVENTO as COD_INTERVENTO, ");
    SQL.append("  A.COD_TERZI as COD_TERZI, ");
    SQL.append("  A.UNA_TANTUM as UNA_TANTUM, ");
    SQL.append("  A.TIPO_VINCOLO as TIPO_VINCOLO, ");
    SQL.append("  A.IVA as IVA, ");
    SQL.append("  A.PROGETTO as PROGETTO, ");
    SQL.append("  A.PROGRAMMA as PROGRAMMA, ");
    SQL.append("  A.SETTORE_OPERATIVO as SETTORE_OPERATIVO, ");
    SQL.append("  A.SERVIZIO_OPERATIVO as SERVIZIO_OPERATIVO, ");
    SQL.append("  A.RESPONSABILE as RESPONSABILE, ");
    SQL.append("  A.CONTROLLO_BUDGET as CONTROLLO_BUDGET, ");
    SQL.append("  A.FUNZ_DEL as FUNZ_DEL, ");
    SQL.append("  A.CONTRIB_COMU as CONTRIB_COMU, ");
    SQL.append("  A.PERC_CONTROLLO as PERC_CONTROLLO, ");
    SQL.append("  A.RISORSA_SIGNIF as RISORSA_SIGNIF, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.FLESSIBILITA as FLESSIBILITA, ");
    SQL.append("  A.COD_MONITORAGGIO as CAPCODMONITO, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  DECODE(~~TBL_PARAMETRI61.PARAMES~~, 'E', 'Risorsa', 'Intervento') as CAPLABRISINT, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP_77(~~TBL_DATISESSIONE.SESSIOESERCI~~,A.E_S,A.RISORSA_INTERVENTO,A.CAPITOLO,0) as CAPCAPITOLO, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP_77(~~TBL_DATISESSIONE.SESSIOESERCI~~,A.E_S,A.RISORSA_INTERVENTO,0,0) as CAPRISORINTE, ");
    SQL.append("  A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.CAPITOLO ),NULL,'DTE') as CAPCAPTEDESC, ");
    SQL.append("  A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.TITOLO ),TO_CHAR ( A.CATEGORIA ),'DCA') as CAPCATEGDESC, ");
    SQL.append("  A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.FUNZIONE ),NULL,'DFU') as CAPFUNZIDESC, ");
    SQL.append("  A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.TITOLO ),TO_CHAR ( A.RISORSA_INTERVENTO ),'DIN') as CAPINTERDESC, ");
    SQL.append("  A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.PROGRAMMA ),NULL,'DPGM') as CAPPROGRDESC, ");
    SQL.append("  A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.PROGRAMMA ),TO_CHAR ( A.PROGETTO ),'DPRG') as CAPPROGEDESC, ");
    SQL.append("  A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.VOCE_ECON ),NULL,'DVEC') as CAPVOCECODES, ");
    SQL.append("  A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.TITOLO ),NULL,'DTI') as CAPTITOLDESC, ");
    SQL.append("  A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.FUNZIONE ),TO_CHAR ( A.SERVIZIO ),'DSE') as CAPSERVIDESC, ");
    SQL.append("  A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.TIPO_VINCOLO ),NULL,'DVI') as CAPVINCODESC, ");
    SQL.append("  A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.CENTRO ),NULL,'DCE') as CAPCENTRDESC, ");
    SQL.append("  A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.FATTORE ),NULL,'DFA') as CAPFATTODESC, ");
    SQL.append("  A_GET_CODICE_CAP_77(~~TBL_DATISESSIONE.SESSIOESERCI~~,A.E_S,A.RISORSA_INTERVENTO,A.CAPITOLO,A.ARTICOLO) as CAPCODICE, ");
    SQL.append("  DECODE(~~TBL_PARAMETRI61.PARAMES~~, 'E', 'Cge', 'Cgu') as CAPLABCODGES, ");
    SQL.append("  A.CODICE_GESTIONALE as CODICE_GESTIONALE, ");
    SQL.append("  A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.FLESSIBILITA ),NULL,'DFL') as CAPFLESSDESC, ");
    SQL.append("  A_GET_DATI_CAP_FIN_77(A.E_S,TO_CHAR ( A.CODICE_GESTIONALE ),NULL,'DGEST') as CAPCODGESDES, ");
    SQL.append("  TO_CHAR ( GET_UO_UTILIZZO_77(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI477.PARAMES~~,~~TBL_PARAMETRI477.PARAMRISORSA~~,~~TBL_PARAMETRI477.PARAMCAPITOL~~,~~TBL_PARAMETRI477.PARAMARTICOL~~,~~TBL_PARAMETRI477.PARAMSCADENZ~~) ) || ' - ' || DECODE(GET_UO_UTILIZZO_77(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI477.PARAMES~~,~~TBL_PARAMETRI477.PARAMRISORSA~~,~~TBL_PARAMETRI477.PARAMCAPITOL~~,~~TBL_PARAMETRI477.PARAMARTICOL~~,~~TBL_PARAMETRI477.PARAMSCADENZ~~), to_number(NULL), NULL, SO4_UTIL.UNITA_GET_DESCR_VALIDA(GET_UO_UTILIZZO_77(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI477.PARAMES~~,~~TBL_PARAMETRI477.PARAMRISORSA~~,~~TBL_PARAMETRI477.PARAMCAPITOL~~,~~TBL_PARAMETRI477.PARAMARTICOL~~,~~TBL_PARAMETRI477.PARAMSCADENZ~~),TRUNC( SYSDATE ))) as CAPUOUTILIZZ ");
    PAN_PIANODEICONT.SetQuery(PPQRY_CAP23, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP_77 A ");
    PAN_PIANODEICONT.SetQuery(PPQRY_CAP23, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI477.PARAMES~~) ");
    SQL.append("and   (A.RISORSA_INTERVENTO = ~~TBL_PARAMETRI477.PARAMRISORSA~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI477.PARAMCAPITOL~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI477.PARAMARTICOL~~) ");
    PAN_PIANODEICONT.SetQuery(PPQRY_CAP23, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PIANODEICONT.SetQuery(PPQRY_CAP23, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PIANODEICONT.SetQuery(PPQRY_CAP23, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PIANODEICONT.SetQuery(PPQRY_CAP23, 5, SQL, -1, "");
    PAN_PIANODEICONT.SetQueryDB(PPQRY_CAP23, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PIANODEICONT.SetMasterTable(0, "CAP_77");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PIANODEICONT.Status() == 2)
    {
      int oldListQBE = PAN_PIANODEICONT.iUseListQBE;
      PAN_PIANODEICONT.iUseListQBE = 0;
      PAN_PIANODEICONT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PIANODEICONT.PanelCommand(Glb.PCM_FIND);
      PAN_PIANODEICONT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PIANODEICONT) PAN_PIANODEICONT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PIANODEICONT) PAN_PIANODEICONT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PIANODEICONT) PAN_PIANODEICONT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PIANODEICONT) PAN_PIANODEICONT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PIANODEICONT) PAN_PIANODEICONT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PIANODEICONT) PAN_PIANODEICONT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
