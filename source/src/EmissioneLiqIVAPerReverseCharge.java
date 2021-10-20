// **********************************************
// Emissione Liq IVA Per Reverse Charge
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneLiqIVAPerReverseCharge extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_NUMERO = 0;
  private static int GRP_PARAMETRI_DATA = 1;

  private static int PFL_PARAMETRI_LABEVUONUMSX = 0;
  private static int PFL_PARAMETRI_LABEVUONUMDX = 1;
  private static int PFL_PARAMETRI_LABEVUODATSX = 2;
  private static int PFL_PARAMETRI_LABEVUODATDX = 3;
  private static int PFL_PARAMETRI_DAL1 = 4;
  private static int PFL_PARAMETRI_AL1 = 5;
  private static int PFL_PARAMETRI_DAL = 6;
  private static int PFL_PARAMETRI_AL = 7;
  private static int PFL_PARAMETRI_BENEFICIARI1 = 8;
  private static int PFL_PARAMETRI_ORDINAMENTO = 9;
  private static int PFL_PARAMETRI_BENEFICIARI2 = 10;

  private static int PPQRY_PARAMETRI328 = 0;

  private static int PPQRY_BEN = 1;


  IDPanel PAN_PARAMETRI;
  private static int PFL_LIQUIDAZIONI_NUMEROLIQ = 0;
  private static int PFL_LIQUIDAZIONI_ANNOLIQ = 1;
  private static int PFL_LIQUIDAZIONI_DATA = 2;
  private static int PFL_LIQUIDAZIONI_CAPITOLO = 3;
  private static int PFL_LIQUIDAZIONI_ARTICOLO = 4;
  private static int PFL_LIQUIDAZIONI_NUMEROIMP = 5;
  private static int PFL_LIQUIDAZIONI_ANNOIMP = 6;
  private static int PFL_LIQUIDAZIONI_NUMEROSUBIMP = 7;
  private static int PFL_LIQUIDAZIONI_ANNOSUBIMP = 8;
  private static int PFL_LIQUIDAZIONI_IMPORTO = 9;
  private static int PFL_LIQUIDAZIONI_IMPORTOIVA = 10;
  private static int PFL_LIQUIDAZIONI_INEMIS = 11;
  private static int PFL_LIQUIDAZIONI_BENEFICIARIO = 12;
  private static int PFL_LIQUIDAZIONI_NUMERODOC = 13;
  private static int PFL_LIQUIDAZIONI_ANNODOC = 14;
  private static int PFL_LIQUIDAZIONI_INFODOC = 15;
  private static int PFL_LIQUIDAZIONI_INFODOC1 = 16;
  private static int PFL_LIQUIDAZIONI_UFFICIO = 17;
  private static int PFL_LIQUIDAZIONI_SEDEDEL = 18;
  private static int PFL_LIQUIDAZIONI_NUMERODEL = 19;
  private static int PFL_LIQUIDAZIONI_ANNODEL = 20;
  private static int PFL_LIQUIDAZIONI_UNITAPROPONE = 21;
  private static int PFL_LIQUIDAZIONI_NUMEROPROPOS = 22;
  private static int PFL_LIQUIDAZIONI_ANNOPROPOSTA = 23;
  private static int PFL_LIQUIDAZIONI_NUMERODISTIN = 24;
  private static int PFL_LIQUIDAZIONI_ANNODISTINTA = 25;
  private static int PFL_LIQUIDAZIONI_FINANZIAMENT = 26;
  private static int PFL_LIQUIDAZIONI_LIQUIDALABEL = 27;
  private static int PFL_LIQUIDAZIONI_CAPITOLLABEL = 28;
  private static int PFL_LIQUIDAZIONI_IMPEGNOLABEL = 29;
  private static int PFL_LIQUIDAZIONI_SUBIMPEGLABE = 30;
  private static int PFL_LIQUIDAZIONI_DOCUMENLABEL = 31;
  private static int PFL_LIQUIDAZIONI_DELIBERLABEL = 32;
  private static int PFL_LIQUIDAZIONI_PROPOSTLABEL = 33;
  private static int PFL_LIQUIDAZIONI_DISTINTLABEL = 34;
  private static int PFL_LIQUIDAZIONI_TIPODISTINTA = 35;
  private static int PFL_LIQUIDAZIONI_FATANNOPROG = 36;
  private static int PFL_LIQUIDAZIONI_FATNUMERPROG = 37;

  private static int PPQRY_LIQ10 = 0;


  IDPanel PAN_LIQUIDAZIONI;

  // Definition of Global Variables
  private IDVariant FASEESERCIZI = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI558(IMDB);
    //
    //
    Init_PQRY_PARAMETRI328(IMDB);
    Init_PQRY_PARAMETRI328_RS(IMDB);
    Init_PQRY_LIQ10(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI558(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI558, 7);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI558, "TBL_PARAMETRI558");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI558,IMDBDef5.FLD_PARAMETRI558_PARAMNUMEDAL, "PARAMNUMEDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI558,IMDBDef5.FLD_PARAMETRI558_PARAMNUMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI558,IMDBDef5.FLD_PARAMETRI558_PARAMNUMERAL, "PARAMNUMERAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI558,IMDBDef5.FLD_PARAMETRI558_PARAMNUMERAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI558,IMDBDef5.FLD_PARAMETRI558_PARAMDATADAL, "PARAMDATADAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI558,IMDBDef5.FLD_PARAMETRI558_PARAMDATADAL,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI558,IMDBDef5.FLD_PARAMETRI558_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI558,IMDBDef5.FLD_PARAMETRI558_PARAMDATAAL,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI558,IMDBDef5.FLD_PARAMETRI558_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI558,IMDBDef5.FLD_PARAMETRI558_PARAMORDINAM,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI558,IMDBDef5.FLD_PARAMETRI558_PARAMBENEFIC, "PARAMBENEFIC");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI558,IMDBDef5.FLD_PARAMETRI558_PARAMBENEFIC,2,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI558,IMDBDef5.FLD_PARAMETRI558_PARDATREGLIQ, "PARDATREGLIQ");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI558,IMDBDef5.FLD_PARAMETRI558_PARDATREGLIQ,6,10,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI558, 0);
  }

  private static void Init_PQRY_PARAMETRI328(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI328, 6);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI328, "PQRY_PARAMETRI328");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI328,IMDBDef14.PQSL_PARAMETRI328_PARAMNUMEDAL, "PARAMNUMEDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI328,IMDBDef14.PQSL_PARAMETRI328_PARAMNUMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI328,IMDBDef14.PQSL_PARAMETRI328_PARAMNUMERAL, "PARAMNUMERAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI328,IMDBDef14.PQSL_PARAMETRI328_PARAMNUMERAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI328,IMDBDef14.PQSL_PARAMETRI328_PARAMDATADAL, "PARAMDATADAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI328,IMDBDef14.PQSL_PARAMETRI328_PARAMDATADAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI328,IMDBDef14.PQSL_PARAMETRI328_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI328,IMDBDef14.PQSL_PARAMETRI328_PARAMDATAAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI328,IMDBDef14.PQSL_PARAMETRI328_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI328,IMDBDef14.PQSL_PARAMETRI328_PARAMORDINAM,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI328,IMDBDef14.PQSL_PARAMETRI328_PARAMBENEFIC, "PARAMBENEFIC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI328,IMDBDef14.PQSL_PARAMETRI328_PARAMBENEFIC,2,15,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI328, 0);
  }

  private static void Init_PQRY_PARAMETRI328_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI328_RS, 6);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI328_RS, "PQRY_PARAMETRI328_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI328_RS,IMDBDef14.PQSL_PARAMETRI328_PARAMNUMEDAL, "PARAMNUMEDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI328_RS,IMDBDef14.PQSL_PARAMETRI328_PARAMNUMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI328_RS,IMDBDef14.PQSL_PARAMETRI328_PARAMNUMERAL, "PARAMNUMERAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI328_RS,IMDBDef14.PQSL_PARAMETRI328_PARAMNUMERAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI328_RS,IMDBDef14.PQSL_PARAMETRI328_PARAMDATADAL, "PARAMDATADAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI328_RS,IMDBDef14.PQSL_PARAMETRI328_PARAMDATADAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI328_RS,IMDBDef14.PQSL_PARAMETRI328_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI328_RS,IMDBDef14.PQSL_PARAMETRI328_PARAMDATAAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI328_RS,IMDBDef14.PQSL_PARAMETRI328_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI328_RS,IMDBDef14.PQSL_PARAMETRI328_PARAMORDINAM,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI328_RS,IMDBDef14.PQSL_PARAMETRI328_PARAMBENEFIC, "PARAMBENEFIC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI328_RS,IMDBDef14.PQSL_PARAMETRI328_PARAMBENEFIC,2,15,0);
  }

  private static void Init_PQRY_LIQ10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ10, 32);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ10, "PQRY_LIQ10");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_LIQIMPORTIVA, "LIQIMPORTIVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_LIQIMPORTIVA,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_NUMERO_DISTINTA,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_LIQINEMIS, "LIQINEMIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_LIQINEMIS,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_LIBERASOESES, "LIBERASOESES");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_LIBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_DESCRIZIONE,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_LIQFINANZIAM, "LIQFINANZIAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_LIQFINANZIAM,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_TIPO_DISTINTA, "TIPO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_TIPO_DISTINTA,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_FAT_ANNO_PROG, "FAT_ANNO_PROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_FAT_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_FAT_NUMERO_PROG, "FAT_NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_FAT_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_LIQINFODOC, "LIQINFODOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_LIQINFODOC,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_LIQINFODOC1, "LIQINFODOC1");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ10,IMDBDef14.PQSL_LIQ10_LIQINFODOC1,5,99,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ10, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneLiqIVAPerReverseCharge(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneLiqIVAPerReverseCharge()
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
    FormIdx = MyGlb.FRM_EMLIIVPERECH;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2817BC9A-0594-447B-AA14-2ECF8429F226";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 912;
    DesignHeight = 466;
    set_Caption(new IDVariant("Emissione Liq. IVA per Reverse Charge"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 912;
    Frames[1].Height = 440;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.145455;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 912;
    Frames[2].Height = 64;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 64;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 912-MyGlb.PAN_OFFS_X, 64-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "535A150A-45B6-40E1-94D6-79DF24A2E5D5");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 680, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    Frames[3].Width = 912;
    Frames[3].Height = 376;
    Frames[3].Caption = "Liquidazioni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 376;
    PAN_LIQUIDAZIONI = new IDPanel(w, this, 3, "PAN_LIQUIDAZIONI");
    Frames[3].Content = PAN_LIQUIDAZIONI;
    PAN_LIQUIDAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIDAZIONI.VS = MainFrm.VisualStyleList;
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 912-MyGlb.PAN_OFFS_X, 376-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8F4D77CD-EA49-4D21-A5BC-BEBDBCD628A1");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 4, 1564, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIDAZIONI.InitStatus = 1;
    PAN_LIQUIDAZIONI_Init();
    PAN_LIQUIDAZIONI_InitFields();
    PAN_LIQUIDAZIONI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FA14+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_POPUPFA+BaseCmdSetIdx, "M" + (MyGlb.CMD_FA14+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SCLIQCOZ+BaseCmdLinIdx)
      {
        Collassailpannellodeiparametri();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EMISSILIQUID+BaseCmdLinIdx)
      {
        EmissioneLiquidazioni();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI558, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMLIIVPERECH_PARAMETRI328();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_LIQUIDAZIONI.UpdatePanel(MainFrm);
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
    return (obj instanceof EmissioneLiqIVAPerReverseCharge);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneLiqIVAPerReverseCharge.class.getName() : (Glb.ClassWithPackage(EmissioneLiqIVAPerReverseCharge.class) ? EmissioneLiqIVAPerReverseCharge.class.getName().substring(EmissioneLiqIVAPerReverseCharge.class.getPackage().getName().length() + 1) : EmissioneLiqIVAPerReverseCharge.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Liquidazioni", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      PAN_LIQUIDAZIONI.Freezed = (new IDVariant(-1)).booleanValue();
      PAN_LIQUIDAZIONI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_LIQUIDAZIONI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARAMDATADAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARAMDATAAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARAMORDINAM, 0, (new IDVariant("N")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiqIVAPerReverseCharge", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARAMNUMEDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARAMNUMERAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARAMDATADAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARAMDATAAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARAMORDINAM, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiqIVAPerReverseCharge", "UnloadEvent", _e);
    }
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
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_EMISSLIQUIRC)), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARDATREGLIQ, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI572, IMDBDef14.PQSL_PARAMETRI572_PARDATREGLIQ, 0));
          Doemettiliq();
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiqIVAPerReverseCharge", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQUIDAZIONI);
      // 
      // Liquidazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_BENEFICIARIO,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_BENEFICIARIO))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_UFFICIO,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_UFFICIO))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_FINANZIAMENT,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_FINANZIAMENT))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_NUMERODOC,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_NUMERODOC))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiqIVAPerReverseCharge", "LiquidazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_LIQUIDAZIONI.Freezed = (new IDVariant(0)).booleanValue();
        Ordinamento();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_LIQUIDAZIONI.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiqIVAPerReverseCharge", "LiquidazioniOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni After Find Event Body
      // Procedure Body
      // 
      PAN_LIQUIDAZIONI.EnableSorting();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiqIVAPerReverseCharge", "LiquidazioniAfterFindEvent", _e);
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
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ORDINAMENTO)), true))
      {
        Ordinamento();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiqIVAPerReverseCharge", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_PARAMETRI_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_PARAMETRI_BENEFICIARI1)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_STRINDACERCA = null;
          v_STRINDACERCA = IDL.Add(IDL.Add((new IDVariant("%")), IDL.Lower((new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_BENEFICIARI1))))), (new IDVariant("%")));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  BEN A ");
          SQL.append("where ((LOWER(TO_CHAR ( A.CODICE )) || '-' || A.RAGIONE_SOCIALE_ESTESA LIKE " + IDL.CSql(v_STRINDACERCA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") OR (LOWER(TO_CHAR ( A.CODICE_FISCALE )) LIKE " + IDL.CSql(v_STRINDACERCA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") OR LOWER(TO_CHAR ( A.PARTITA_IVA )) LIKE " + IDL.CSql(v_STRINDACERCA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
          SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Soggetto non trovato!", IDVariant.STRING));
            // 
            // 
            // 
            // 
            MainFrm.set_AlertMessage(v_MESSAGGIO); 
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiqIVAPerReverseCharge", "ParametriOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Ordinamento
  // **********************************************************************
  public int Ordinamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinamento Body
      // Procedure Body
      // 
      PAN_LIQUIDAZIONI.ResetSortList();
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI328, IMDBDef14.PQSL_PARAMETRI328_PARAMORDINAM, 0).equals((new IDVariant("V")), true))
      {
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_CAPITOLO, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ARTICOLO, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ANNOIMP, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_NUMEROIMP, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ANNOSUBIMP, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_NUMEROSUBIMP, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ANNOLIQ, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_NUMEROLIQ, (new IDVariant(-1)).booleanValue()); 
      }
      else
      {
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ANNOLIQ, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_NUMEROLIQ, (new IDVariant(-1)).booleanValue()); 
      }
      PAN_LIQUIDAZIONI.EnableSorting();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiqIVAPerReverseCharge", "Ordinamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Collassa il pannello dei parametri
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Collassailpannellodeiparametri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Collassa il pannello dei parametri Body
      // Corpo Procedura
      // 
      MainFrm.Collapseexpandparampanel(new IDVariant(MainFrm.CmdObj.GetCmdCode(MyGlb.CMDS_COMMASETLIQ3+BaseCmdSetIdx, new IDVariant(MainFrm.CmdObj.CmdLin[MyGlb.CMD_SCLIQCOZ+BaseCmdLinIdx].GetIndex()).intValue())), PAN_PARAMETRI);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiqIVAPerReverseCharge", "Collassailpannellodeiparametri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Doc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDoc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Doc Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ10, IMDBDef14.PQSL_LIQ10_FAT_ANNO_PROG, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ10, IMDBDef14.PQSL_LIQ10_FAT_ANNO_PROG, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ10, IMDBDef14.PQSL_LIQ10_FAT_NUMERO_PROG, 0));
      MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiqIVAPerReverseCharge", "InfoDoc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Doc 1
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDoc1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Doc 1 Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ10, IMDBDef14.PQSL_LIQ10_FAT_ANNO_PROG, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGANPRFA, 0, IMDB.Value(IMDBDef14.PQRY_LIQ10, IMDBDef14.PQSL_LIQ10_FAT_ANNO_PROG, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGNUPRFA, 0, IMDB.Value(IMDBDef14.PQRY_LIQ10, IMDBDef14.PQSL_LIQ10_FAT_NUMERO_PROG, 0));
      MainFrm.Show(MyGlb.FRM_RIEPILOGOIVA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiqIVAPerReverseCharge", "InfoDoc1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Emissione Liquidazioni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EmissioneLiquidazioni ()
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
      // Emissione Liquidazioni Body
      // Corpo Procedura
      // 
      IDVariant v_MSGERR = new IDVariant(0,IDVariant.STRING);
      v_MSGERR = (new IDVariant("Nessun record selezionato tramite selezione multipla"));
      if (!(PAN_LIQUIDAZIONI.ShowMultipleSel()))
      {
        MainFrm.set_AlertMessage(v_MSGERR); 
        return 0;
      }
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_SELECTED = new IDVariant(0,IDVariant.INTEGER);
      C4 = PAN_LIQUIDAZIONI.MasterRS();
      if (C4.size()>0) CurPos = C4.getRow(); else CurPos = 0;
      if (!C4.Bof()) PAN_LIQUIDAZIONI.GotoFirst();
      while (!PAN_LIQUIDAZIONI.RSEOF())
      {
        if (PAN_LIQUIDAZIONI.IsRowSelected(I.intValue()))
        {
          v_SELECTED = IDL.Add(v_SELECTED, (new IDVariant(1)));
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_LIQUIDAZIONI.GotoNext();
      }
      if (CurPos>0) C4.absolute(CurPos);
      if (v_SELECTED.equals((new IDVariant(0)), true))
      {
        MainFrm.set_AlertMessage(v_MSGERR); 
        return 0;
      }
      MainFrm.Show(MyGlb.FRM_EMISSLIQUIRC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiqIVAPerReverseCharge", "EmissioneLiquidazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Doemettiliq
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Doemettiliq ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;
    IDCachedRowSet C7;

    try
    {
      TransCount = 0;
      // 
      // Doemettiliq Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant N = new IDVariant(0,IDVariant.INTEGER);
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Liq. IVA RC per Documento "));
      IDVariant v_NLIQDAL = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_NLIQAL = new IDVariant(0,IDVariant.INTEGER);
      MainFrm.Cf4armDBObject.BeginTrans();
      C2 = PAN_LIQUIDAZIONI.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_LIQUIDAZIONI.GotoFirst();
      while (!PAN_LIQUIDAZIONI.RSEOF())
      {
        if (PAN_LIQUIDAZIONI.IsRowSelected(I.intValue()))
        {
          IDVariant v_NNUMEROLIQ = null;
          v_NNUMEROLIQ = (new IDVariant());
          MainFrm.Cf4armDBObject.ACHKNUMERAZIONE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("liq")), v_NNUMEROLIQ);
          try
          {
            SQL = new StringBuffer();
            SQL.append("insert into LIQ ");
            SQL.append("( ");
            SQL.append("  ANNO_LIQ, ");
            SQL.append("  NUMERO_LIQ, ");
            SQL.append("  CAPITOLO, ");
            SQL.append("  ARTICOLO, ");
            SQL.append("  ANNO_IMP, ");
            SQL.append("  NUMERO_IMP, ");
            SQL.append("  ANNO_SUBIMP, ");
            SQL.append("  NUMERO_SUBIMP, ");
            SQL.append("  ANNO_DEL, ");
            SQL.append("  NUMERO_DEL, ");
            SQL.append("  SEDE_DEL, ");
            SQL.append("  IMPORTO, ");
            SQL.append("  DIVERSO_BEN, ");
            SQL.append("  BENEFICIARIO, ");
            SQL.append("  NUM_QUIETANZA, ");
            SQL.append("  CAUSALE, ");
            SQL.append("  BOLLO, ");
            SQL.append("  DATA_PAGAM, ");
            SQL.append("  IMPORTO_PAGAM, ");
            SQL.append("  NUMERO_PAGAM, ");
            SQL.append("  NUM_QUIETANZA_DIV_BEN, ");
            SQL.append("  UFFICIO, ");
            SQL.append("  ANNO_PROPOSTA, ");
            SQL.append("  UNITA_PROPONENTE, ");
            SQL.append("  NUMERO_PROPOSTA, ");
            SQL.append("  VOCE_ECON, ");
            SQL.append("  CODICE_PTC, ");
            SQL.append("  D_DATA_PAGAM, ");
            SQL.append("  NUMERO_CONTABILE, ");
            SQL.append("  DATA_CONTABILE, ");
            SQL.append("  PROGRESSIVO_TESO, ");
            SQL.append("  LIRE_EURO, ");
            SQL.append("  PAGAMENTO_IN_EURO, ");
            SQL.append("  IMPORTO_EURO, ");
            SQL.append("  IMPONIBILE_EURO, ");
            SQL.append("  COD_IMP_ECO, ");
            SQL.append("  FINANZIAMENTO, ");
            SQL.append("  SPESE, ");
            SQL.append("  SCADENZA, ");
            SQL.append("  ALLEGATI, ");
            SQL.append("  COMMISSIONI, ");
            SQL.append("  INFO_TESORIERE, ");
            SQL.append("  CODICE_GESTIONALE, ");
            SQL.append("  NOTE, ");
            SQL.append("  UTENTE_INSERIMENTO, ");
            SQL.append("  DATA_INSERIMENTO, ");
            SQL.append("  PROGRESSIVO_BOAC, ");
            SQL.append("  CIG, ");
            SQL.append("  CUP, ");
            SQL.append("  CODICE_COFOG, ");
            SQL.append("  CODICE_EUROPEO, ");
            SQL.append("  COD_LIVELLO_5, ");
            SQL.append("  LIQ_PARZ, ");
            SQL.append("  IMPORTO_IVA, ");
            SQL.append("  IMPORTO_IVA_IST, ");
            SQL.append("  ANNO_LIQ_IVA, ");
            SQL.append("  NUMERO_LIQ_IVA, ");
            SQL.append("  TIPO_REGISTRO_DEF, ");
            SQL.append("  TIPO_BOLLATO_DEF, ");
            SQL.append("  ANNO_LIQ_RC, ");
            SQL.append("  NUMERO_LIQ_RC, ");
            SQL.append("  D_DATA_REG, ");
            SQL.append("  DESCRIZIONE ");
            SQL.append(") ");
            SQL.append("select ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(v_NNUMEROLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  A.CAPITOLO, ");
            SQL.append("  A.ARTICOLO, ");
            SQL.append("  A.ANNO_IMP, ");
            SQL.append("  A.NUMERO_IMP, ");
            SQL.append("  A.ANNO_SUBIMP, ");
            SQL.append("  A.NUMERO_SUBIMP, ");
            SQL.append("  A.ANNO_DEL, ");
            SQL.append("  A.NUMERO_DEL, ");
            SQL.append("  A.SEDE_DEL, ");
            SQL.append("  A.IMPORTO_IVA, ");
            SQL.append("  A.DIVERSO_BEN, ");
            SQL.append("  A.BENEFICIARIO, ");
            SQL.append("  A.NUM_QUIETANZA, ");
            SQL.append("  A.CAUSALE, ");
            SQL.append("  A.BOLLO, ");
            SQL.append("  A.DATA_PAGAM, ");
            SQL.append("  A.IMPORTO_PAGAM, ");
            SQL.append("  A.NUMERO_PAGAM, ");
            SQL.append("  A.NUM_QUIETANZA_DIV_BEN, ");
            SQL.append("  A.UFFICIO, ");
            SQL.append("  A.ANNO_PROPOSTA, ");
            SQL.append("  A.UNITA_PROPONENTE, ");
            SQL.append("  A.NUMERO_PROPOSTA, ");
            SQL.append("  DECODE(" + IDL.CSql(MainFrm.SIOPEATTIARM, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 'SI', to_number(NULL), A.VOCE_ECON), ");
            SQL.append("  A.CODICE_PTC, ");
            SQL.append("  A.D_DATA_PAGAM, ");
            SQL.append("  A.NUMERO_CONTABILE, ");
            SQL.append("  A.DATA_CONTABILE, ");
            SQL.append("  A.PROGRESSIVO_TESO, ");
            SQL.append("  A.LIRE_EURO, ");
            SQL.append("  A.PAGAMENTO_IN_EURO, ");
            SQL.append("  A.IMPORTO_EURO, ");
            SQL.append("  A.IMPONIBILE_EURO, ");
            SQL.append("  A.COD_IMP_ECO, ");
            SQL.append("  A.FINANZIAMENTO, ");
            SQL.append("  A.SPESE, ");
            SQL.append("  A.SCADENZA, ");
            SQL.append("  A.ALLEGATI, ");
            SQL.append("  A.COMMISSIONI, ");
            SQL.append("  A.INFO_TESORIERE, ");
            SQL.append("  DECODE(" + IDL.CSql(MainFrm.SIOPEATTIARM, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 'SI', to_number(NULL), A.CODICE_GESTIONALE), ");
            SQL.append("  A.NOTE, ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TRUNC( SYSDATE ), ");
            SQL.append("  A.PROGRESSIVO_BOAC, ");
            SQL.append("  A.CIG, ");
            SQL.append("  A.CUP, ");
            SQL.append("  A.CODICE_COFOG, ");
            SQL.append("  A.CODICE_EUROPEO, ");
            SQL.append("  A.COD_LIVELLO_5, ");
            SQL.append("  A.LIQ_PARZ, ");
            SQL.append("  A.IMPORTO_IVA, ");
            SQL.append("  A.IMPORTO_IVA_IST, ");
            SQL.append("  A.ANNO_LIQ_IVA, ");
            SQL.append("  A.NUMERO_LIQ_IVA, ");
            SQL.append("  A.TIPO_REGISTRO_DEF, ");
            SQL.append("  A.TIPO_BOLLATO_DEF, ");
            SQL.append("  A.ANNO_LIQ, ");
            SQL.append("  A.NUMERO_LIQ, ");
            SQL.append("  NVL(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARDATREGLIQ, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", TRUNC( SYSDATE )), ");
            SQL.append("  SUBSTR(" + IDL.CSql(S, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " || A.NUMERO_DOC || ' del ' || TO_CHAR ( B.D_DATA_DOC,'dd/mm/yyyy') || ' - ' || C.RAGIONE_SOCIALE, 1, 140) ");
            SQL.append("from ");
            SQL.append("  LIQ A, ");
            SQL.append("  FAT B, ");
            SQL.append("  BEN C ");
            SQL.append("where (A.ANNO_LIQ = " + IDL.CSql(C2.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_LIQ = " + IDL.CSql(C2.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (B.ANNO_PROG = A.FAT_ANNO_PROG) ");
            SQL.append("and   (B.NUMERO_PROG = A.FAT_NUMERO_PROG) ");
            SQL.append("and   (C.CODICE = A.BENEFICIARIO) ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_VESERCIZIO = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_VIMPECOFATTO = null;
            v_VIMPECOFATTO = (new IDVariant());
            IDVariant v_VIMPECOCENTR = null;
            v_VIMPECOCENTR = (new IDVariant());
            IDVariant v_VIMPECOIMPOR = new IDVariant(0,IDVariant.DECIMAL);
            IDVariant v_VIMPECOCOMDA = null;
            v_VIMPECOCOMDA = (new IDVariant());
            IDVariant v_VIMPECOCOMAL = null;
            v_VIMPECOCOMAL = (new IDVariant());
            IDVariant v_VIMPECONOTE = null;
            v_VIMPECONOTE = (new IDVariant());
            IDVariant v_VIMPECONOIVA = null;
            v_VIMPECONOIVA = (new IDVariant());
            IDVariant v_VIMPECOPROID = null;
            v_VIMPECOPROID = (new IDVariant());
            IDVariant v_VIMPECOIVA = null;
            v_VIMPECOIVA = (new IDVariant());
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1, ");
            SQL.append("  MAX(A.ESERCIZIO) as MAXIMPECOESE, ");
            SQL.append("  MAX(A.FATTORE) as MAXIMPECOFAT, ");
            SQL.append("  MAX(A.CENTRO) as MAXIMPECOCEN, ");
            SQL.append("  MAX(A.IMPORTO) as MAXIMPECOIMP, ");
            SQL.append("  MAX(A.COMPETENZA_DAL) as MAXIMPECCODA, ");
            SQL.append("  MAX(A.COMPETENZA_AL) as MAXIMPECCOAL, ");
            SQL.append("  MAX(A.NOTE) as MAXIMPECONOT, ");
            SQL.append("  MAX(A.NO_IVA) as MAXIMPECNOIV, ");
            SQL.append("  MAX(A.PROGETTO_ID) as MAXIMPECPRID, ");
            SQL.append("  SUM(A.IVA) as SUMIMPECOIVA ");
            SQL.append("from ");
            SQL.append("  IMP_ECO A ");
            SQL.append("where (A.ANNO_LIQ = " + IDL.CSql(C2.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_LIQ = " + IDL.CSql(C2.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
              v_VESERCIZIO = QV.Get("MAXIMPECOESE", IDVariant.INTEGER) ;
              v_VIMPECOFATTO = QV.Get("MAXIMPECOFAT", IDVariant.STRING) ;
              v_VIMPECOCENTR = QV.Get("MAXIMPECOCEN", IDVariant.STRING) ;
              v_VIMPECOIMPOR = QV.Get("MAXIMPECOIMP", IDVariant.DECIMAL) ;
              v_VIMPECOCOMDA = QV.Get("MAXIMPECCODA", IDVariant.DATETIME) ;
              v_VIMPECOCOMAL = QV.Get("MAXIMPECCOAL", IDVariant.DATETIME) ;
              v_VIMPECONOTE = QV.Get("MAXIMPECONOT", IDVariant.STRING) ;
              v_VIMPECONOIVA = QV.Get("MAXIMPECNOIV", IDVariant.STRING) ;
              v_VIMPECOPROID = QV.Get("MAXIMPECPRID", IDVariant.STRING) ;
              v_VIMPECOIVA = QV.Get("SUMIMPECOIVA", IDVariant.DECIMAL) ;
            }
            QV.Close();
            if (v_VCOUNT.equals((new IDVariant(1)), true))
            {
              SQL = new StringBuffer();
              SQL.append("insert into IMP_ECO ");
              SQL.append("( ");
              SQL.append("  ESERCIZIO, ");
              SQL.append("  PROGRESSIVO, ");
              SQL.append("  FATTORE, ");
              SQL.append("  CENTRO, ");
              SQL.append("  IMPORTO, ");
              SQL.append("  COMPETENZA_DAL, ");
              SQL.append("  COMPETENZA_AL, ");
              SQL.append("  NOTE, ");
              SQL.append("  NO_IVA, ");
              SQL.append("  PROGETTO_ID, ");
              SQL.append("  IVA, ");
              SQL.append("  UTENTE_INSERIMENTO, ");
              SQL.append("  DATA_INSERIMENTO, ");
              SQL.append("  ANNO_LIQ, ");
              SQL.append("  NUMERO_LIQ ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  " + IDL.CSql(v_VESERCIZIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  to_number(NULL), ");
              SQL.append("  " + IDL.CSql(v_VIMPECOFATTO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_VIMPECOCENTR, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C2.Get("LIQIMPORTIVA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_VIMPECOCOMDA, IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_VIMPECOCOMAL, IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_VIMPECONOTE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_VIMPECONOIVA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_VIMPECOPROID, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_VIMPECOIVA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  TRUNC( SYSDATE ), ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_NNUMEROLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            else if (v_VCOUNT.compareTo((new IDVariant(1)), true)>0)
            {
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  A.ESERCIZIO as IEESERCIZIO, ");
              SQL.append("  A.FATTORE as IEFATTORE, ");
              SQL.append("  A.CENTRO as IECENTRO, ");
              SQL.append("  A.IMPORTO as IEIMPORTO, ");
              SQL.append("  A.COMPETENZA_DAL as IECOMPETEDAL, ");
              SQL.append("  A.COMPETENZA_AL as IECOMPETENAL, ");
              SQL.append("  A.NOTE as IENOTE, ");
              SQL.append("  A.NO_IVA as IENOIVA, ");
              SQL.append("  A.PROGETTO_ID as IEPROGETTOID, ");
              SQL.append("  A.IVA as IEIVA ");
              SQL.append("from ");
              SQL.append("  IMP_ECO A ");
              SQL.append("where (A.ANNO_LIQ = " + IDL.CSql(C2.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_LIQ = " + IDL.CSql(C2.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              C7 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!C7.EOF()) C7.MoveNext();
              while (!C7.EOF())
              {
                SQL = new StringBuffer();
                SQL.append("insert into IMP_ECO ");
                SQL.append("( ");
                SQL.append("  ESERCIZIO, ");
                SQL.append("  PROGRESSIVO, ");
                SQL.append("  FATTORE, ");
                SQL.append("  CENTRO, ");
                SQL.append("  IMPORTO, ");
                SQL.append("  COMPETENZA_DAL, ");
                SQL.append("  COMPETENZA_AL, ");
                SQL.append("  NOTE, ");
                SQL.append("  NO_IVA, ");
                SQL.append("  PROGETTO_ID, ");
                SQL.append("  IVA, ");
                SQL.append("  UTENTE_INSERIMENTO, ");
                SQL.append("  DATA_INSERIMENTO, ");
                SQL.append("  ANNO_LIQ, ");
                SQL.append("  NUMERO_LIQ ");
                SQL.append(") ");
                SQL.append("values ");
                SQL.append("( ");
                SQL.append("  " + IDL.CSql(C7.Get("IEESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  to_number(NULL), ");
                SQL.append("  " + IDL.CSql(C7.Get("IEFATTORE"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C7.Get("IECENTRO"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C2.Get("LIQIMPORTIVA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " * " + IDL.CSql(C7.Get("IEIMPORTO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " / " + IDL.CSql(C2.Get("IMPORTO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C7.Get("IECOMPETEDAL"), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C7.Get("IECOMPETENAL"), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C7.Get("IENOTE"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C7.Get("IENOIVA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C7.Get("IEPROGETTOID"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C7.Get("IEIVA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  TRUNC( SYSDATE ), ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(v_NNUMEROLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append(") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                C7.MoveNext();
              }
              C7.Close();
            }
          }
          catch (Exception e8)
          {
            MainFrm.set_AlertMessage(new IDVariant(e8.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
          N = IDL.Add(N, (new IDVariant(1)));
          if (v_NLIQDAL.equals((new IDVariant(0)), true))
          {
            v_NLIQDAL = new IDVariant(v_NNUMEROLIQ);
          }
          v_NLIQAL = new IDVariant(v_NNUMEROLIQ);
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_LIQUIDAZIONI.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      MainFrm.Cf4armDBObject.CommitTrans();
      IDVariant v_EMISS = new IDVariant(0,IDVariant.STRING);
      v_EMISS = (new IDVariant("Emesse "));
      MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<BR/\">"))), v_EMISS), IDL.ToString(N)), (new IDVariant(" "))), (new IDVariant("Liquidazioni"))), ((N.compareTo((new IDVariant(0)), true)>0)?IDL.Add(IDL.Add(IDL.Add((new IDVariant(" dalla ")), IDL.ToString(v_NLIQDAL)), (new IDVariant(" alla "))), IDL.ToString(v_NLIQAL)):(new IDVariant(""))))); 
      PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiqIVAPerReverseCharge", "Doemettiliq", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void EMLIIVPERECH_PARAMETRI328() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI328_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI558, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI558, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI328_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI328_RS, 0, IMDBDef5.TBL_PARAMETRI558, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI328_RS, 0, 0, IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARAMNUMEDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI328_RS, 1, 0, IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARAMNUMERAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI328_RS, 2, 0, IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARAMDATADAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI328_RS, 3, 0, IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARAMDATAAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI328_RS, 4, 0, IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARAMORDINAM, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI328_RS, 5, 0, IMDBDef5.TBL_PARAMETRI558, IMDBDef5.FLD_PARAMETRI558_PARAMBENEFIC, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI558, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI558, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI558, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI328_RS, 0);
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
  private void PAN_LIQUIDAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQUIDAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUIDAZIONI, Cancel);
    // Stub
  }

  private void PAN_LIQUIDAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_INFODOC)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDoc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_INFODOC1)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDoc1();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LIQUIDAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUIDAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUIDAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, "980CF661-99BC-4164-BC41-1E95AEBCA2BA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, "Numero");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, MyGlb.PANEL_FORM, 4, 11, 184, 41, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 0, 44);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, "73B5FE51-F6BE-4EE0-83FD-B513BFB82B9C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, "Data");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, MyGlb.PANEL_FORM, 192, 11, 240, 41, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 0, 27);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, "894D61B6-E311-468D-AB87-0DBC0F933ADD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, "CF2267D9-F258-4A95-8E91-66B788184CF1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, "DF2AAF15-364D-4BEE-BE61-4790C562C512");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, "27C59660-B9A5-4495-9DF0-8826DD379D07");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "21D98172-F88E-4117-A02B-E03B13FD019E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "Dal ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "6E9056AD-EE10-4CC4-8106-20D7E8FC02D5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "12152568-4ADE-4E51-8B0C-16E00D363E53");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "94B7FA2B-8221-44B8-B712-D1F8EBDD6C96");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, "5AD1A739-A17D-493E-8D29-B4DD8FC8C20C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, "Beneficiario");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "9B1B2C7E-2AAC-4383-A366-D84FEC49966C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "Ordinamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI2, "7BDFD4B9-913A-4653-8A16-5B37A02A6848");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI2, "Beneficiario");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI2, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI2, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, MyGlb.PANEL_LIST, 8, 48, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, MyGlb.PANEL_FORM, 8, 40, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMSX, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABEVUONUMSX, -1, GRP_PARAMETRI_NUMERO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABEVUONUMSX, -1, "", "LABEVUONUMSX", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, MyGlb.PANEL_LIST, 16, 56, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, MyGlb.PANEL_FORM, 176, 36, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUONUMDX, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABEVUONUMDX, -1, GRP_PARAMETRI_NUMERO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABEVUONUMDX, -1, "", "LABEVUONUMDX", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, MyGlb.PANEL_LIST, 16, 56, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, MyGlb.PANEL_FORM, 196, 40, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATSX, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABEVUODATSX, -1, GRP_PARAMETRI_DATA);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABEVUODATSX, -1, "", "LABEVUODATSX", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, MyGlb.PANEL_LIST, 24, 64, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, MyGlb.PANEL_FORM, 420, 36, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUODATDX, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABEVUODATDX, -1, GRP_PARAMETRI_DATA);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABEVUODATDX, -1, "", "LABEVUODATDX", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, "Dal ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 28, 28, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, "Dal ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL1, PPQRY_PARAMETRI328, "A.PARAMNUMEDAL", "PARAMNUMEDAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 108, 28, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL1, PPQRY_PARAMETRI328, "A.PARAMNUMERAL", "PARAMNUMERAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 80, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 204, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI328, "A.PARAMDATADAL", "PARAMDATADAL", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 200, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 324, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI328, "A.PARAMDATAAL", "PARAMDATAAL", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_LIST, 0, 36, 360, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_FORM, 440, 28, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BENEFICIARI1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BENEFICIARI1, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE", "BENBENEFICIA", 5, 142, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 320, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 644, 28, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ORDINAMENTO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ORDINAMENTO, PPQRY_PARAMETRI328, "A.PARAMORDINAM", "PARAMORDINAM", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant("V")), "Capitolo/Art.", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant("N")), "Numero", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI2, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI2, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI2, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI2, MyGlb.PANEL_FORM, 444, 28, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI2, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI2, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BENEFICIARI2, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BENEFICIARI2, PPQRY_PARAMETRI328, "A.PARAMBENEFIC", "PARAMBENEFIC", 2, 15, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE as BENBENEFICIA, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~PARAMBENEFIC~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_PARAMETRI.SetQueryLKE(PPQRY_BEN, PFL_PARAMETRI_BENEFICIARI2, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE as BENBENEFICIA, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "BENBENEFICIA", "Beneficiario");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "BEN CODICE FISCALE");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "BEN PARTITA IVA");
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI328", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI328, IMDBDef14.PQRY_PARAMETRI328_RS, IMDBDef5.TBL_PARAMETRI558);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL1, IMDBDef5.FLD_PARAMETRI558_PARAMNUMEDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL1, IMDBDef5.FLD_PARAMETRI558_PARAMNUMERAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef5.FLD_PARAMETRI558_PARAMDATADAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef5.FLD_PARAMETRI558_PARAMDATAAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ORDINAMENTO, IMDBDef5.FLD_PARAMETRI558_PARAMORDINAM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_BENEFICIARI2, IMDBDef5.FLD_PARAMETRI558_PARAMBENEFIC);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI558");
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

  private void PAN_LIQUIDAZIONI_Init()
  {

    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_FIELD, 38);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "29181673-0FA1-4386-B825-CADD76D78E19");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "Numero liq");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "ED19F6B5-F9DA-4EC0-B028-EAD1FF997A80");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "Anno Liq");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, "12AC3612-E7BD-489C-8481-8D284FC9B481");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, "Data");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, "6088C9CC-1D7B-486B-A8A9-C9DFC4DF9441");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, "Capitolo");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, "52AE9B79-B4AB-4E6C-B237-AB97ACCDBD1D");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, "Articolo");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, "FEC6DDC6-C3A9-45F6-A865-690CE8DD5BFC");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, "Numero Imp");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, "580AB3D6-2D21-473A-9EAC-9267BB7DEEAB");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, "Anno Imp");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, "E9CBF995-D6E2-4AD9-8FDD-7BCEE433D4BB");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, "Numero Sub Imp");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, "1B6D8F6A-AC59-424A-B591-B36D8470C1B8");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, "Anno Sub Imp");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "4B20163E-B63E-4FE9-9207-D28D96B07CF8");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "Importo");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, "BD7E9388-F1F0-42FB-8F51-B2A0D06D2BDD");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, "Importo IVA");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, "8F30FF68-FCF6-4704-9006-3332B112F3B1");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, "In Emis.");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.VIS_CHECKSTYLE);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "3C840EF8-6565-424A-899C-AC5ED69D73B1");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "Beneficiario");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, "F1AAB9B6-2CD1-491D-9823-C44B89236BF5");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, "Numero Doc");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, "06CB1110-D935-45EC-B02F-EF6AEEF8F489");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, "Anno Doc");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, "CC5D3BDC-20A1-471E-ACC2-35F61C0B45DE");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, "Info Doc");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC1, "72D989AD-FCB4-4178-8E90-973D3C6AE929");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC1, "Info Doc 1");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC1, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC1, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, "5138B59C-5A0C-4146-90BD-75C314AD4787");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, "Ufficio");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "A0C46568-1589-44D4-B1EE-D39D0540434F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "Sede Del");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "5F164A52-EFA4-4EA0-BD4B-9A3ED02C8E4C");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "Numero Del");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "3A3FA0E3-4BE5-48A6-A3F2-B6D5A3326BC9");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "Anno Del");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, "DEB080FE-311E-4245-9A18-DF034FCB4D90");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, "Unita Proponente");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, "32156F30-3C44-4DBA-9D5E-5A655900F5B2");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, "Numero Proposta");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, "07102973-0608-47D5-B5BE-770F94A7BEB9");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, "Anno Proposta");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "99B8202B-F0B7-4045-A55D-C0185702237B");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "Numero Distinta");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "BB26F8D9-7C17-41DC-9EDA-B927676EE75B");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "Anno Distinta");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "92DEAD7E-18C0-4519-8212-184AD4DD50C2");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "Finanziamento");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, "D05F56D1-F200-4635-AAD4-A9FF46720668");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, "Liquidazione");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, "8EC5BA33-453D-44ED-AADF-D32B362E5AEF");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, "Capitolo/Art.");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, "9F345297-EF56-4BED-9F80-443422E4E7FF");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, "Impegno");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, "36B9E54F-5912-4EF0-8EC5-917E099E29A5");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, "Sub-Impegno");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, "0511FB7A-E748-40F5-8805-C25EAD91EEB1");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, "Documento");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, "3DD672D2-998A-4434-BABA-D18F4275F577");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, "Delibera");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, "58331AD2-4328-48E4-B851-FF3CF3FEF016");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, "Proposta");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, "79F6D449-97AC-4039-9C93-BE8A99927B5A");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, "Distinta");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, "337AB943-2DFE-46A0-A910-0DA092585E97");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, "Tipo Distinta");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, "8BD732C9-C30E-4FF2-9C6F-325D7D8CDACE");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, "FAT ANNO PROG");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, "C722A19D-EAFB-47BC-BEE7-24BCC5BF666A");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, "FAT NUMERO PROG");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_LIQUIDAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 0, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, "Num. liq");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, "Num. liq");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROLIQ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROLIQ, PPQRY_LIQ10, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 44, 40, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, "Anno Liq");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, "Anno Liq");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOLIQ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOLIQ, PPQRY_LIQ10, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_LIST, 80, 40, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_FORM, 4, 1360, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DATA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DATA, PPQRY_LIQ10, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 156, 40, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CAPITOLO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CAPITOLO, PPQRY_LIQ10, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 248, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ARTICOLO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ARTICOLO, PPQRY_LIQ10, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 268, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, "Num. Imp");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 4, 148, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, "Num. Imp");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROIMP, PPQRY_LIQ10, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 312, 40, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, "Anno Imp");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, "Anno Imp");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOIMP, PPQRY_LIQ10, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 348, 40, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Num. Sb. Im.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 196, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Num. S. I.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROSUBIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROSUBIMP, PPQRY_LIQ10, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 396, 40, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, "An. S. Im.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, "An. S. Im.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOSUBIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOSUBIMP, PPQRY_LIQ10, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 436, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 140, 28, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPORTO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPORTO, PPQRY_LIQ10, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, 516, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, 84);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, "Importo IVA");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, 4, 436, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, 84);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, "Importo IVA");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPORTOIVA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPORTOIVA, PPQRY_LIQ10, "A.IMPORTO_IVA", "LIQIMPORTIVA", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_LIST, 596, 40, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_LIST, "In Emis.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_FORM, 4, 388, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INEMIS, MyGlb.PANEL_FORM, "In Emis.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INEMIS, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_INEMIS, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INEMIS, PPQRY_LIQ10, "DECODE(A.ANNO_MAND, to_number(NULL), 0, 1)", "LIQINEMIS", 1, 19, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INEMIS, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INEMIS, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 644, 40, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 292, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_BENEFICIARIO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_BENEFICIARIO, PPQRY_LIQ10, "B.RAGIONE_SOCIALE_ESTESA", "LIBERASOESES", 5, 60, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 784, 40, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, "Numero Doc");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 124, 172, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, "Num. Doc");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODOC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODOC, PPQRY_LIQ10, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_LIST, 872, 40, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_LIST, "Ann. Doc");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_FORM, 124, 148, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODOC, MyGlb.PANEL_FORM, "Anno Doc");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNODOC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNODOC, PPQRY_LIQ10, "A.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_LIST, 904, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_LIST, "I. D.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_FORM, 4, 412, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_FORM, "Info Doc");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INFODOC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_INFODOC, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INFODOC, PPQRY_LIQ10, "CASE WHEN NOT ((A.FAT_ANNO_PROG IS NULL)) THEN 'I' ELSE '' END", "LIQINFODOC", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC1, MyGlb.PANEL_LIST, 924, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC1, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC1, MyGlb.PANEL_LIST, "I. D. 1");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC1, MyGlb.PANEL_FORM, 4, 412, 576, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC1, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC1, MyGlb.PANEL_FORM, "Info Doc 1");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INFODOC1, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_INFODOC1, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INFODOC1, PPQRY_LIQ10, "CASE WHEN NOT ((A.FAT_ANNO_PROG IS NULL)) THEN 'F' ELSE '' END", "LIQINFODOC1", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, 944, 40, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, 4, 316, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_UFFICIO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_UFFICIO, PPQRY_LIQ10, "C.DESCRIZIONE", "DESCRIZIONE", 5, 60, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 1064, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, "Sede Del");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 4, 268, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, "Sede Del");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SEDEDEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SEDEDEL, PPQRY_LIQ10, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 1108, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, "Num. Del");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 4, 244, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, "Num. Del");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODEL, PPQRY_LIQ10, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 1152, 40, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, "Ann. Del");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 4, 220, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, "Anno Del");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNODEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNODEL, PPQRY_LIQ10, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_LIST, 1184, 40, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_LIST, "Unita Proponente");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_FORM, 364, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UNITAPROPONE, MyGlb.PANEL_FORM, "Un. Prop.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_UNITAPROPONE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_UNITAPROPONE, PPQRY_LIQ10, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1292, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, "Num. Prop.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 380, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, "Num. Prp.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROPROPOS, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROPROPOS, PPQRY_LIQ10, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1336, 40, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Ann. Prp.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 404, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Ann. Prop.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOPROPOSTA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOPROPOSTA, PPQRY_LIQ10, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 1368, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, "Num. Dist.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 4, 1504, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, "Numero Distinta");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODISTIN, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODISTIN, PPQRY_LIQ10, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 6, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 1412, 40, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 88);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, "Ann. Dist.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 4, 1480, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 88);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, "Anno Distinta");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNODISTINTA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNODISTINTA, PPQRY_LIQ10, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1444, 40, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 340, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanz.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FINANZIAMENT, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_FINANZIAMENT, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FINANZIAMENT, PPQRY_LIQ10, "DECODE(A.FINANZIAMENTO, to_number(NULL), NULL, TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || D.DESCRIZIONE)", "LIQFINANZIAM", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, MyGlb.PANEL_LIST, 0, 4, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, MyGlb.PANEL_FORM, 0, 4, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDALABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_LIQUIDALABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_LIQUIDALABEL, -1, "", "LIQUIDALABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, MyGlb.PANEL_LIST, 156, 4, 112, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, MyGlb.PANEL_FORM, 8, 12, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CAPITOLLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CAPITOLLABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CAPITOLLABEL, -1, "", "CAPITOLLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, MyGlb.PANEL_LIST, 268, 4, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, MyGlb.PANEL_FORM, 8, 12, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNOLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPEGNOLABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPEGNOLABEL, -1, "", "IMPEGNOLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, MyGlb.PANEL_LIST, 348, 4, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, MyGlb.PANEL_FORM, 16, 20, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGLABE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SUBIMPEGLABE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SUBIMPEGLABE, -1, "", "SUBIMPEGLABE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, MyGlb.PANEL_LIST, 784, 4, 160, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, MyGlb.PANEL_FORM, 8, 12, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUMENLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DOCUMENLABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DOCUMENLABEL, -1, "", "DOCUMENLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, MyGlb.PANEL_LIST, 1064, 4, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, MyGlb.PANEL_FORM, 16, 20, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIBERLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DELIBERLABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DELIBERLABEL, -1, "", "DELIBERLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, MyGlb.PANEL_LIST, 1184, 4, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, MyGlb.PANEL_FORM, 24, 28, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROPOSTLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_PROPOSTLABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_PROPOSTLABEL, -1, "", "PROPOSTLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, MyGlb.PANEL_LIST, 1368, 4, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, MyGlb.PANEL_FORM, 32, 36, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DISTINTLABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DISTINTLABEL, -1, "", "DISTINTLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_LIST, 1904, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_LIST, 84);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_LIST, "Tipo Distinta");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_FORM, 4, 412, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_FORM, 84);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TIPODISTINTA, MyGlb.PANEL_FORM, "Tipo Distinta");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_TIPODISTINTA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_TIPODISTINTA, PPQRY_LIQ10, "A.TIPO_DISTINTA", "TIPO_DISTINTA", 5, 1, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_LIST, 1904, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_LIST, "FAT ANNO PROG");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_FORM, 4, 412, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_FORM, "FAT ANN. PROG");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FATANNOPROG, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FATANNOPROG, PPQRY_LIQ10, "A.FAT_ANNO_PROG", "FAT_ANNO_PROG", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_LIST, 1904, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_LIST, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_LIST, "FAT NUMERO PROG");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_FORM, 4, 436, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_FORM, "FAT NUM. PROG");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FATNUMERPROG, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FATNUMERPROG, PPQRY_LIQ10, "A.FAT_NUMERO_PROG", "FAT_NUMERO_PROG", 1, 5, 0, -13997);
  }

  private void PAN_LIQUIDAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LIQUIDAZIONI.SetIMDB(IMDB, "PQRY_LIQ10", true);
    PAN_LIQUIDAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.IMPORTO_IVA as LIQIMPORTIVA, ");
    SQL.append("  A.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  A.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.UFFICIO as UFFICIO, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.ANNO_DISTINTA as ANNO_DISTINTA, ");
    SQL.append("  A.NUMERO_DISTINTA as NUMERO_DISTINTA, ");
    SQL.append("  DECODE(A.ANNO_MAND, to_number(NULL), 0, 1) as LIQINEMIS, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as LIBERASOESES, ");
    SQL.append("  C.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  DECODE(A.FINANZIAMENTO, to_number(NULL), NULL, TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || D.DESCRIZIONE) as LIQFINANZIAM, ");
    SQL.append("  A.TIPO_DISTINTA as TIPO_DISTINTA, ");
    SQL.append("  A.FAT_ANNO_PROG as FAT_ANNO_PROG, ");
    SQL.append("  A.FAT_NUMERO_PROG as FAT_NUMERO_PROG, ");
    SQL.append("  CASE WHEN NOT ((A.FAT_ANNO_PROG IS NULL)) THEN 'I' ELSE '' END as LIQINFODOC, ");
    SQL.append("  CASE WHEN NOT ((A.FAT_ANNO_PROG IS NULL)) THEN 'F' ELSE '' END as LIQINFODOC1 ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ10, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B, ");
    SQL.append("  T53 C, ");
    SQL.append("  FINANZIAMENTI D, ");
    SQL.append("  FAT E ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ10, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_LIQ <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.IMPORTO_IVA, 0) > 0) ");
    SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
    SQL.append("and   ((A.NUMERO_LIQ BETWEEN NVL(~~TBL_PARAMETRI558.PARAMNUMEDAL~~, 1) AND NVL(~~TBL_PARAMETRI558.PARAMNUMERAL~~, 99999))) ");
    SQL.append("and   ((A.D_DATA_REG BETWEEN NVL(~~TBL_PARAMETRI558.PARAMDATADAL~~, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(~~TBL_PARAMETRI558.PARAMDATAAL~~, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (E.ANNO_PROG = A.FAT_ANNO_PROG) ");
    SQL.append("and   (E.NUMERO_PROG = A.FAT_NUMERO_PROG) ");
    SQL.append("and   (E.TRATTAMENTO_IVA = 'RC') ");
    SQL.append("and   (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  LIQ L2 ");
    SQL.append("where (L2.ANNO_LIQ_RC = A.ANNO_LIQ) ");
    SQL.append("and   (L2.NUMERO_LIQ_RC = A.NUMERO_LIQ) ");
    SQL.append(")))) ");
    SQL.append("and   (B.CODICE(+) = A.BENEFICIARIO) ");
    SQL.append("and   (C.CODICE(+) = A.UFFICIO) ");
    SQL.append("and   (D.CODICE(+) = A.FINANZIAMENTO) ");
    SQL.append("and   (A.BENEFICIARIO = NVL(~~PQRY_PARAMETRI328.PARAMBENEFIC~~, A.BENEFICIARIO)) ");
    SQL.append("and   ((A.IMPORTO_IVA_IST IS NULL)) ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ10, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ10, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ10, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ10, 5, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_LIQ10, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(0, "LIQ");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUIDAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_LIQUIDAZIONI.iUseListQBE;
      PAN_LIQUIDAZIONI.iUseListQBE = 0;
      PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUIDAZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_AfterFind(CmdFind);
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
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
