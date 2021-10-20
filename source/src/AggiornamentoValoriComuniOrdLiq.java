// **********************************************
// Aggiornamento Valori Comuni Ord Liq
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornamentoValoriComuniOrdLiq extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_VALCOMORDLIQ_DELIBERA = 0;
  private static int GRP_VALCOMORDLIQ_CAPITOLO = 1;
  private static int GRP_VALCOMORDLIQ_IMPACC = 2;
  private static int GRP_VALCOMORDLIQ_SUBIMPEGNO = 3;
  private static int GRP_VALCOMORDLIQ_DESCRIZIONE = 4;
  private static int GRP_VALCOMORDLIQ_TIPOVINCOLO = 5;
  private static int GRP_VALCOMORDLIQ_MANDATINFORM = 6;
  private static int GRP_VALCOMORDLIQ_CODITRANELEM = 7;
  private static int GRP_VALCOMORDLIQ_ECONOMICA = 8;

  private static int PFL_VALCOMORDLIQ_INTESTALABEL = 0;
  private static int PFL_VALCOMORDLIQ_CKDELIBERA = 1;
  private static int PFL_VALCOMORDLIQ_SEDEDEL = 2;
  private static int PFL_VALCOMORDLIQ_TRATDELILABE = 3;
  private static int PFL_VALCOMORDLIQ_NUMERODEL = 4;
  private static int PFL_VALCOMORDLIQ_ANNODEL = 5;
  private static int PFL_VALCOMORDLIQ_BARRDELILABE = 6;
  private static int PFL_VALCOMORDLIQ_SCELDELIFORM = 7;
  private static int PFL_VALCOMORDLIQ_CKCAPITOLO = 8;
  private static int PFL_VALCOMORDLIQ_CAPITOLO = 9;
  private static int PFL_VALCOMORDLIQ_ARTICOLO = 10;
  private static int PFL_VALCOMORDLIQ_SCELTACAPITO = 11;
  private static int PFL_VALCOMORDLIQ_CKIMPACC = 12;
  private static int PFL_VALCOMORDLIQ_NUMEROIMPACC = 13;
  private static int PFL_VALCOMORDLIQ_ANNOIMPACC = 14;
  private static int PFL_VALCOMORDLIQ_SCELTAIMPACC = 15;
  private static int PFL_VALCOMORDLIQ_CKSUBIMP = 16;
  private static int PFL_VALCOMORDLIQ_NUMEROSUBIMP = 17;
  private static int PFL_VALCOMORDLIQ_ANNOSUBIMP = 18;
  private static int PFL_VALCOMORDLIQ_SCELTASUBIMP = 19;
  private static int PFL_VALCOMORDLIQ_CKDESCRIZION = 20;
  private static int PFL_VALCOMORDLIQ_DESCRIZIONE = 21;
  private static int PFL_VALCOMORDLIQ_CKTIPOVINCOL = 22;
  private static int PFL_VALCOMORDLIQ_TIPOVINCOLO = 23;
  private static int PFL_VALCOMORDLIQ_CKMANDAINFOR = 24;
  private static int PFL_VALCOMORDLIQ_SPESE = 25;
  private static int PFL_VALCOMORDLIQ_SCADENZA = 26;
  private static int PFL_VALCOMORDLIQ_COMMISSIONI = 27;
  private static int PFL_VALCOMORDLIQ_ALLEGATI = 28;
  private static int PFL_VALCOMORDLIQ_INFOTESORIER = 29;
  private static int PFL_VALCOMORDLIQ_ETICHETTASF1 = 30;
  private static int PFL_VALCOMORDLIQ_CKTRANS = 31;
  private static int PFL_VALCOMORDLIQ_CODLIVELLO5 = 32;
  private static int PFL_VALCOMORDLIQ_DUALDESCVLIV = 33;
  private static int PFL_VALCOMORDLIQ_CODICECOFOG = 34;
  private static int PFL_VALCOMORDLIQ_CODICEEUROPE = 35;
  private static int PFL_VALCOMORDLIQ_DUALDESCCOFO = 36;
  private static int PFL_VALCOMORDLIQ_ETICHETTASF = 37;
  private static int PFL_VALCOMORDLIQ_CKECONOMICA = 38;
  private static int PFL_VALCOMORDLIQ_FATTORE = 39;
  private static int PFL_VALCOMORDLIQ_FATTORDESCRI = 40;
  private static int PFL_VALCOMORDLIQ_CENTRO = 41;
  private static int PFL_VALCOMORDLIQ_CENTRIDESCRI = 42;
  private static int PFL_VALCOMORDLIQ_COMPDAL = 43;
  private static int PFL_VALCOMORDLIQ_COMPAL = 44;
  private static int PFL_VALCOMORDLIQ_CONFERMLABEL = 45;
  private static int PFL_VALCOMORDLIQ_VOCEECON = 46;
  private static int PFL_VALCOMORDLIQ_CODICEGESTIO = 47;
  private static int PFL_VALCOMORDLIQ_FINANZIAMENT = 48;
  private static int PFL_VALCOMORDLIQ_OPERA = 49;
  private static int PFL_VALCOMORDLIQ_SESUBIMPEGNO = 50;
  private static int PFL_VALCOMORDLIQ_PROGUNITORGA = 51;
  private static int PFL_VALCOMORDLIQ_BENEFICIARIO = 52;
  private static int PFL_VALCOMORDLIQ_NUMQUIETANZA = 53;

  private static int PPQRY_PARAMETRI569 = 0;

  private static int PPQRY_FATTORI = 1;
  private static int PPQRY_CENTRI = 2;
  private static int PPQRY_DUAL = 3;

  private static int PPQRY_VINCOLI = 4;
  private static int PPQRY_TIPISPESMINF = 5;
  private static int PPQRY_CODTRANSEURO = 6;


  IDPanel PAN_VALCOMORDLIQ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_PARAMETRI569(IMDB);
    Init_PQRY_PARAMETRI569_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_PARAMETRI569(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI569, 40);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI569, "PQRY_PARAMETRI569");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKDEL, "VALOCOMCKDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKDEL,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKDES, "VALOCOMCKDES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKDES,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALCOMCKTIVI, "VALCOMCKTIVI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALCOMCKTIVI,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALCOMCKMAIN, "VALCOMCKMAIN");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALCOMCKMAIN,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_SCADENZA,8,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_COMMISSIONI, "COMMISSIONI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_COMMISSIONI,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_INFO_TESORIERE, "INFO_TESORIERE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_INFO_TESORIERE,5,200,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKECO, "VALOCOMCKECO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKECO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_COMP_DAL, "COMP_DAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_COMP_DAL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_COMP_AL, "COMP_AL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_COMP_AL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKTRA, "VALOCOMCKTRA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKTRA,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG, "CODICE_COFOG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG,1,3,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, "COD_LIVELLO_5");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_CODICE_EUROPEO, "CODICE_EUROPEO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_CODICE_EUROPEO,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKCAP, "VALOCOMCKCAP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALCOMCKIMAC, "VALCOMCKIMAC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALCOMCKIMAC,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, "VALCOMANIMAC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, "VALCOMNUIMAC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKSUB, "VALOCOMCKSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKSUB,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALCOMANNSUB, "VALCOMANNSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALCOMANNSUB,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB, "VALCOMNUMSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_SE_SUBIMPEGNO, "SE_SUBIMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_SE_SUBIMPEGNO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569,IMDBDef14.PQSL_PARAMETRI569_NUM_QUIETANZA,1,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI569, 0);
  }

  private static void Init_PQRY_PARAMETRI569_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI569_RS, 40);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI569_RS, "PQRY_PARAMETRI569_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKDEL, "VALOCOMCKDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKDEL,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKDES, "VALOCOMCKDES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKDES,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALCOMCKTIVI, "VALCOMCKTIVI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALCOMCKTIVI,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALCOMCKMAIN, "VALCOMCKMAIN");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALCOMCKMAIN,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_SCADENZA,8,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_COMMISSIONI, "COMMISSIONI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_COMMISSIONI,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_INFO_TESORIERE, "INFO_TESORIERE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_INFO_TESORIERE,5,200,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKECO, "VALOCOMCKECO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKECO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_COMP_DAL, "COMP_DAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_COMP_DAL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_COMP_AL, "COMP_AL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_COMP_AL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKTRA, "VALOCOMCKTRA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKTRA,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG, "CODICE_COFOG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG,1,3,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, "COD_LIVELLO_5");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_CODICE_EUROPEO, "CODICE_EUROPEO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_CODICE_EUROPEO,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKCAP, "VALOCOMCKCAP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALCOMCKIMAC, "VALCOMCKIMAC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALCOMCKIMAC,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, "VALCOMANIMAC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, "VALCOMNUIMAC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKSUB, "VALOCOMCKSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKSUB,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALCOMANNSUB, "VALCOMANNSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALCOMANNSUB,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB, "VALCOMNUMSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_SE_SUBIMPEGNO, "SE_SUBIMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_SE_SUBIMPEGNO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI569_RS,IMDBDef14.PQSL_PARAMETRI569_NUM_QUIETANZA,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornamentoValoriComuniOrdLiq(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornamentoValoriComuniOrdLiq()
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
    FormIdx = MyGlb.FRM_AGGVALCOORLI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B69BBD70-3AE9-4CFC-AA7C-AE7D4C1ACB55";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 888;
    DesignHeight = 510;
    set_Caption(new IDVariant("Aggiornamento Valori Comuni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 888;
    Frames[1].Height = 484;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Valori Comuni Ord Liq";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 484;
    PAN_VALCOMORDLIQ = new IDPanel(w, this, 1, "PAN_VALCOMORDLIQ");
    Frames[1].Content = PAN_VALCOMORDLIQ;
    PAN_VALCOMORDLIQ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VALCOMORDLIQ.VS = MainFrm.VisualStyleList;
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 888-MyGlb.PAN_OFFS_X, 484-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0E6D7643-1A7F-4488-8F0C-2281CD532D5E");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3668, 568, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VALCOMORDLIQ.InitStatus = 2;
    PAN_VALCOMORDLIQ_Init();
    PAN_VALCOMORDLIQ_InitFields();
    PAN_VALCOMORDLIQ_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_VALCOMORDLIQ, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGVALCOORLI_PARAMETRI569();
      }
      PAN_VALCOMORDLIQ.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_VALCOMORDLIQ.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALCOMORDLIQ_SCELDELIFORM) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_VALCOMORDLIQ.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALCOMORDLIQ_SCELTACAPITO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELSUBIMPUO && flRis && IdxPanelActived == PAN_VALCOMORDLIQ.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALCOMORDLIQ_SCELTASUBIMP) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTARICLAS && flRis && IdxPanelActived == PAN_VALCOMORDLIQ.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALCOMORDLIQ_CODLIVELLO5) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACOFOG && flRis && IdxPanelActived == PAN_VALCOMORDLIQ.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALCOMORDLIQ_CODICECOFOG) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_VALCOMORDLIQ.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALCOMORDLIQ_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_VALCOMORDLIQ.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALCOMORDLIQ_CENTRO) {
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
    return (obj instanceof AggiornamentoValoriComuniOrdLiq);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornamentoValoriComuniOrdLiq.class.getName() : (Glb.ClassWithPackage(AggiornamentoValoriComuniOrdLiq.class) ? AggiornamentoValoriComuniOrdLiq.class.getName().substring(AggiornamentoValoriComuniOrdLiq.class.getPackage().getName().length() + 1) : AggiornamentoValoriComuniOrdLiq.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IDVariant v_IMPEGNO = new IDVariant(0,IDVariant.STRING);
      v_IMPEGNO = (new IDVariant("Impegno"));
      IDVariant v_ACCERTAMENTO = new IDVariant(0,IDVariant.STRING);
      v_ACCERTAMENTO = (new IDVariant("Accertamento"));
      VisibilitaMandatoInformatico();
      if (IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0).equals((new IDVariant("ORD")), true))
      {
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_GROUP, GRP_VALCOMORDLIQ_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VALCOMORDLIQ.set_Header(Glb.OBJ_GROUP,GRP_VALCOMORDLIQ_IMPACC,v_ACCERTAMENTO.stringValue()); 
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_GROUP, GRP_VALCOMORDLIQ_SUBIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_GROUP, GRP_VALCOMORDLIQ_DELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VALCOMORDLIQ.set_Header(Glb.OBJ_GROUP,GRP_VALCOMORDLIQ_IMPACC,v_IMPEGNO.stringValue()); 
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_GROUP, GRP_VALCOMORDLIQ_SUBIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "LoadEvent", _e);
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
      PAN_VALCOMORDLIQ.PanelCommand(Glb.PCM_UPDATE);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "UnloadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SEDE_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_NUMERO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ANNO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SEDE_DEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_NUMERO_DEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ANNO_DEL, 0, (new IDVariant()));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CENTRO, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTARICLAS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC2, IMDBDef7.PQSL_VISTSTRURIC2_VISSTRRICCOD, 0),IDVariant.DECIMAL));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACOFOG)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG, 0, IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC3, IMDBDef7.PQSL_VISTSTRURIC3_VISSTRRIPRCO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSUBIMPUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANNSUB, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_ANNO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_NUMERO_SUBIMP, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAACCERT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Valori Comuni Ord Liq On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_VALCOMORDLIQ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Valori Comuni Ord Liq On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_VALCOMORDLIQ_SEDEDEL)), true) || Column.equals((new IDVariant(PFL_VALCOMORDLIQ_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_VALCOMORDLIQ_ANNODEL)), true))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SEDE_DEL, 0)));
        if (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SEDE_DEL, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ANNO_DEL, 0))))
        {
          IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
          IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
          v_SEDEDEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SEDE_DEL, 0);
          v_NUMERODEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_NUMERO_DEL, 0);
          v_ANNODEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ANNO_DEL, 0);
          MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SEDE_DEL, 0, new IDVariant(v_SEDEDEL));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_NUMERO_DEL, 0, new IDVariant(v_NUMERODEL));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ANNO_DEL, 0, new IDVariant(v_ANNODEL));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKDEL, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKDEL, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_VALCOMORDLIQ_DESCRIZIONE)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_DESCRIZIONE, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKDES, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKDES, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_VALCOMORDLIQ_TIPOVINCOLO)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_TIPO_VINCOLO, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMCKTIVI, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMCKTIVI, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_VALCOMORDLIQ_SPESE)), true) || Column.equals((new IDVariant(PFL_VALCOMORDLIQ_SCADENZA)), true) || Column.equals((new IDVariant(PFL_VALCOMORDLIQ_ALLEGATI)), true) || Column.equals((new IDVariant(PFL_VALCOMORDLIQ_COMMISSIONI)), true) || Column.equals((new IDVariant(PFL_VALCOMORDLIQ_INFOTESORIER)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SPESE, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SCADENZA, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ALLEGATI, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMMISSIONI, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_INFO_TESORIERE, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMCKMAIN, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMCKMAIN, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_VALCOMORDLIQ_FATTORE)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0))))
        {
          if (MainFrm.FattorePresente(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0), IDL.Today(), (new IDVariant(""))).equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Fattore non presente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0, PAN_VALCOMORDLIQ.GetOrgValue(PFL_VALCOMORDLIQ_FATTORE));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_VALCOMORDLIQ_CENTRO)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CENTRO, 0))))
        {
          if (MainFrm.CentriPresente(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CENTRO, 0), IDL.Today()).equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Centro non presente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CENTRO, 0, PAN_VALCOMORDLIQ.GetOrgValue(PFL_VALCOMORDLIQ_CENTRO));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_VALCOMORDLIQ_FATTORE)), true) || Column.equals((new IDVariant(PFL_VALCOMORDLIQ_CENTRO)), true) || Column.equals((new IDVariant(PFL_VALCOMORDLIQ_COMPDAL)), true) || Column.equals((new IDVariant(PFL_VALCOMORDLIQ_COMPAL)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CENTRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMP_DAL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMP_AL, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKECO, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKECO, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_VALCOMORDLIQ_CODLIVELLO5)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, 0))))
        {
          IDVariant v_VGETDESCR = new IDVariant(0,IDVariant.STRING);
          v_VGETDESCR = (new IDVariant());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  GET_DESCR_COD_5_LIVELLO(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'LIQ', 'S', 'E')," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as GDC5LPCL5AVC ");
          SQL.append("from ");
          SQL.append("  DUAL A ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VGETDESCR = QV.Get("GDC5LPCL5AVC", IDVariant.STRING) ;
          }
          QV.Close();
          if (IDL.NullValue(v_VGETDESCR,(new IDVariant(""))).equals((new IDVariant("")), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Codice V Livello inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_VALCOMORDLIQ_CODICECOFOG)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  PROGRAMMI_COFOG A, ");
          SQL.append("  CAP B ");
          SQL.append("where (A.COFOG = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.E_S = 'S') ");
          SQL.append("and   (B.CODICE_STRUTTURA = A.PROGRAMMA) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Codice Cofog inesistente o non previsto"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_VALCOMORDLIQ_CODLIVELLO5)), true) || Column.equals((new IDVariant(PFL_VALCOMORDLIQ_CODICECOFOG)), true) || Column.equals((new IDVariant(PFL_VALCOMORDLIQ_CODICEEUROPE)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_EUROPEO, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKTRA, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKTRA, 0, (new IDVariant()));
        }
      }
      if ((Column.equals((new IDVariant(PFL_VALCOMORDLIQ_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_VALCOMORDLIQ_ARTICOLO)), true)) && FieldWasModified.booleanValue())
      {
        if ((IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CAPITOLO_OLD, 0),(new IDVariant(-1))), true)!=0) || (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_ARTICOLO_OLD, 0),(new IDVariant(-1))), true)!=0))
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0))))
          {
            ProponiDaCapitolo();
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKCAP, 0, (new IDVariant("SI")));
          }
          else
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKCAP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VOCE_ECON, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_GESTIONALE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_OPERA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SE_SUBIMPEGNO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_PROGR_UNITA_ORGANIZZATIVA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_BENEFICIARIO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_NUM_QUIETANZA, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CAPITOLO_OLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_ARTICOLO_OLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANNSUB, 0, (new IDVariant()));
        }
      }
      if ((Column.equals((new IDVariant(PFL_VALCOMORDLIQ_NUMEROIMPACC)), true) || Column.equals((new IDVariant(PFL_VALCOMORDLIQ_ANNOIMPACC)), true)) && FieldWasModified.booleanValue())
      {
        if ((IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VACONUIMACOL, 0),(new IDVariant(-1))), true)!=0) || (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VACOANIMACOL, 0),(new IDVariant(-1))), true)!=0))
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0))))
          {
            if (IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0).equals((new IDVariant("LIQ")), true))
            {
              if (MainFrm.ControlloImpegnoValido(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0)))
              {
                ProponiDaImp();
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMCKIMAC, 0, (new IDVariant("SI")));
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANNSUB, 0, (new IDVariant()));
              }
              else
              {
                IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
                v_AVVISO = (new IDVariant("Impegno non previsto in Bilancio!"));
                MainFrm.set_AlertMessage(v_AVVISO); 
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANNSUB, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB, 0, (new IDVariant()));
                return;
              }
            }
            else
            {
              if (MainFrm.ControlloAccertamentoValido(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0)))
              {
                ProponiDaAcc();
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMCKIMAC, 0, (new IDVariant("SI")));
              }
              else
              {
                IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
                v_AVVISO = (new IDVariant("Accertamento non previsto in Bilancio!", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_AVVISO); 
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0, (new IDVariant()));
                return;
              }
            }
          }
          else
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMCKIMAC, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VOCE_ECON, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_GESTIONALE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_OPERA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SE_SUBIMPEGNO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_PROGR_UNITA_ORGANIZZATIVA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_BENEFICIARIO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_NUM_QUIETANZA, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VACONUIMACOL, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0));
          IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VACOANIMACOL, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANNSUB, 0, (new IDVariant()));
        }
      }
      if ((Column.equals((new IDVariant(PFL_VALCOMORDLIQ_NUMEROSUBIMP)), true) || Column.equals((new IDVariant(PFL_VALCOMORDLIQ_ANNOSUBIMP)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANNSUB, 0))))
        {
          IDVariant v_ANNOIMP = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_NUMEROIMP = new IDVariant(0,IDVariant.INTEGER);
          if (MainFrm.ControlloSubimpegnoValido(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANNSUB, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB, 0), v_ANNOIMP, v_NUMEROIMP))
          {
            ProponiDaSubimp();
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKSUB, 0, (new IDVariant("SI")));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0, new IDVariant(v_ANNOIMP));
            IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VACOANIMACOL, 0, new IDVariant(v_ANNOIMP));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0, new IDVariant(v_NUMEROIMP));
            IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VACONUIMACOL, 0, new IDVariant(v_NUMEROIMP));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMCKIMAC, 0, (new IDVariant("SI")));
          }
          else
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Sub-Impegno non previsto in Bilancio!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANNSUB, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB, 0, (new IDVariant()));
            return;
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKSUB, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VOCE_ECON, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_GESTIONALE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_OPERA, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SE_SUBIMPEGNO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_PROGR_UNITA_ORGANIZZATIVA, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_BENEFICIARIO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_NUM_QUIETANZA, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "ValoriComuniOrdLiqOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Valori Comuni Ord Liq On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VALCOMORDLIQ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VALCOMORDLIQ);
      // 
      // Valori Comuni Ord Liq On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_VALCOMORDLIQ.set_ToolTip(Glb.OBJ_FIELD,PFL_VALCOMORDLIQ_DESCRIZIONE,(new IDVariant(PAN_VALCOMORDLIQ.FieldText(PFL_VALCOMORDLIQ_DESCRIZIONE))).stringValue()); 
      PAN_VALCOMORDLIQ.set_ToolTip(Glb.OBJ_FIELD,PFL_VALCOMORDLIQ_TIPOVINCOLO,(new IDVariant(PAN_VALCOMORDLIQ.FieldText(PFL_VALCOMORDLIQ_TIPOVINCOLO))).stringValue()); 
      PAN_VALCOMORDLIQ.set_ToolTip(Glb.OBJ_FIELD,PFL_VALCOMORDLIQ_ALLEGATI,(new IDVariant(PAN_VALCOMORDLIQ.FieldText(PFL_VALCOMORDLIQ_ALLEGATI))).stringValue()); 
      PAN_VALCOMORDLIQ.set_ToolTip(Glb.OBJ_FIELD,PFL_VALCOMORDLIQ_INFOTESORIER,(new IDVariant(PAN_VALCOMORDLIQ.FieldText(PFL_VALCOMORDLIQ_INFOTESORIER))).stringValue()); 
      PAN_VALCOMORDLIQ.set_ToolTip(Glb.OBJ_FIELD,PFL_VALCOMORDLIQ_FATTORDESCRI,(new IDVariant(PAN_VALCOMORDLIQ.FieldText(PFL_VALCOMORDLIQ_FATTORDESCRI))).stringValue()); 
      PAN_VALCOMORDLIQ.set_ToolTip(Glb.OBJ_FIELD,PFL_VALCOMORDLIQ_CENTRIDESCRI,(new IDVariant(PAN_VALCOMORDLIQ.FieldText(PFL_VALCOMORDLIQ_CENTRIDESCRI))).stringValue()); 
      PAN_VALCOMORDLIQ.set_ToolTip(Glb.OBJ_FIELD,PFL_VALCOMORDLIQ_DUALDESCVLIV,(new IDVariant(PAN_VALCOMORDLIQ.FieldText(PFL_VALCOMORDLIQ_DUALDESCVLIV))).stringValue()); 
      PAN_VALCOMORDLIQ.set_ToolTip(Glb.OBJ_FIELD,PFL_VALCOMORDLIQ_DUALDESCCOFO,(new IDVariant(PAN_VALCOMORDLIQ.FieldText(PFL_VALCOMORDLIQ_DUALDESCCOFO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "ValoriComuniOrdLiqOnDynamicPropertiesEvent", _e);
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
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Fattore
  // **********************************************************************
  public int ApriSceltaFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Fattore Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "ApriSceltaFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Centro
  // **********************************************************************
  public int ApriSceltaCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Centro Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "ApriSceltaCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // CODICE COFOG
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CODICECOFOG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // CODICE COFOG Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_SCELTACOFOG,(new IDVariant(-1)).booleanValue()); 
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGETTES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGECAPI, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0));
      MainFrm.Show(MyGlb.FRM_SCELTACOFOG, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "CODICECOFOG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // COD LIVELLO 5
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CODLIVELLO5 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // COD LIVELLO 5 Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_SCELTARICLAS,(new IDVariant(-1)).booleanValue()); 
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMOGGCOTIRI, 0, (new IDVariant("MACRO_5")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGETTES, 0, ((IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0).equals((new IDVariant("LIQ"))))?(new IDVariant("S")):(new IDVariant("E"))));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIVE, 0, (new IDVariant(2)));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIV4, 0, new IDVariant(MainFrm.GetLiv4DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0).equals((new IDVariant("LIQ"))))?(new IDVariant("S")):(new IDVariant("E"))), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0)),IDVariant.DECIMAL));
      MainFrm.Show(MyGlb.FRM_SCELTARICLAS, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "CODLIVELLO5", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Capitolo Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, ((IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0).equals((new IDVariant("LIQ"))))?(new IDVariant("S")):(new IDVariant("E"))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("B")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "SceltaCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Imp Acc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaImpAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Imp Acc Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0).equals((new IDVariant("LIQ")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        MainFrm.Show(MyGlb.FRM_SCELTAACCERT, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "SceltaImpAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Subimp
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaSubimp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Subimp Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI95, IMDBDef1.FLD_PARAMETRI95_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELSUBIMPUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "SceltaSubimp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Da Capitolo
  // **********************************************************************
  public int ProponiDaCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CGU = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_FATTORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CENTRO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_VOCEECONOMIC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_VINCOLO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Da Capitolo Body
      // Procedure Body
      // 
      IDVariant v_VCODEUROPEO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_LIVELLO5 = new IDVariant(0,IDVariant.DECIMAL);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VOCE_ECON as CAPVOCEECON, ");
      SQL.append("  A.TIPO_VINCOLO as CAPTIPOVINCO, ");
      SQL.append("  A.CODICE_GESTIONALE as CAPCODICGEST, ");
      SQL.append("  A.FATTORE as CAPFATTORE, ");
      SQL.append("  A.CENTRO as CAPCENTRO, ");
      SQL.append("  A.CODICE_EUROPEO as CAPCODICEURO ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'LIQ', 'S', 'E')) ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VOCEECONOMIC = QV.Get("CAPVOCEECON", IDVariant.INTEGER) ;
        v_VINCOLO = QV.Get("CAPTIPOVINCO", IDVariant.INTEGER) ;
        v_CGU = QV.Get("CAPCODICGEST", IDVariant.INTEGER) ;
        v_FATTORE = QV.Get("CAPFATTORE", IDVariant.STRING) ;
        v_CENTRO = QV.Get("CAPCENTRO", IDVariant.STRING) ;
        v_VCODEUROPEO = QV.Get("CAPCODICEURO", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SE_SUBIMPEGNO, 0, (new IDVariant("NO")));
      if (!(MainFrm.SIOPEATTIARM.booleanValue()))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VOCE_ECON, 0, new IDVariant(v_VOCEECONOMIC));
        if (!(IDL.IsNull(v_CGU)))
        {
          if (MainFrm.ControlloCguScaduto(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0).equals((new IDVariant("LIQ"))))?(new IDVariant("S")):(new IDVariant("E"))), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0), v_CGU, (new IDVariant())))
          {
            v_CGU = (new IDVariant());
          }
        }
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_GESTIONALE, 0, new IDVariant(v_CGU));
      }
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_EUROPEO, 0, new IDVariant(v_VCODEUROPEO));
      v_LIVELLO5 = MainFrm.GetCodLiv5DaCapOUnico(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0).equals((new IDVariant("LIQ"))))?(new IDVariant("S")):(new IDVariant("E"))), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0));
      if (!(IDL.IsNull(v_LIVELLO5)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, 0, new IDVariant(v_LIVELLO5));
      }
      if (!(IDL.IsNull(v_VINCOLO)))
      {
        if (!(MainFrm.ControlloVincoloScaduto(v_VINCOLO)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_TIPO_VINCOLO, 0, new IDVariant(v_VINCOLO));
        }
      }
      if (!(IDL.IsNull(v_FATTORE)) && MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        if (!(MainFrm.ControlloFattoreScaduto(v_FATTORE)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0, new IDVariant(v_FATTORE));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0))))
        {
          IDVariant v_VFATTORITIPO = new IDVariant(0,IDVariant.STRING);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.TIPO as FATTORITIPO ");
          SQL.append("from ");
          SQL.append("  FATTORI A ");
          SQL.append("where (A.FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VFATTORITIPO = QV.Get("FATTORITIPO", IDVariant.STRING) ;
          }
          QV.Close();
          if (v_VFATTORITIPO.compareTo((new IDVariant("E")), true)!=0)
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CENTRO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMP_DAL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMP_AL, 0, (new IDVariant()));
          }
        }
      }
      if (!(IDL.IsNull(v_CENTRO)) && MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
      {
        if (!(MainFrm.ControlloCentroScaduto(v_CENTRO)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CENTRO, 0, new IDVariant(v_CENTRO));
        }
      }
      if (IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0).equals((new IDVariant("LIQ")), true))
      {
        IDVariant v_VCOFOG = null;
        v_VCOFOG = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CODICE as VISRICCAPCOD ");
        SQL.append("from ");
        SQL.append("  VISTA_RICLASSIFICAZIONI_CAP A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = 'S') ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CODICE_TIPO_RICL = 'COFOG') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOFOG = QV.Get("VISRICCAPCOD", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_VCOFOG)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG, 0, new IDVariant(v_VCOFOG));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG, 0, MainFrm.CofogUnicoCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0)));
        }
      }
      // 
      // 
      // 
      // 
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        IDVariant v_FINANZIAMENT = new IDVariant(0,IDVariant.INTEGER);
        v_FINANZIAMENT = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.FINANZIAMENTO) as MINBILFINFIN ");
        SQL.append("from ");
        SQL.append("  BIL_FIN A, ");
        SQL.append("  FINANZIAMENTI B ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'LIQ', 'S', 'E')) ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.CODICE = A.FINANZIAMENTO) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_FINANZIAMENT = QV.Get("MINBILFINFIN", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_FINANZIAMENT)))
        {
          IDVariant v_OPERA = new IDVariant(0,IDVariant.INTEGER);
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO, 0, new IDVariant(v_FINANZIAMENT));
          v_OPERA = (new IDVariant());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  MIN(A.OPERA) as MINBILFINOPE ");
          SQL.append("from ");
          SQL.append("  BIL_FIN A, ");
          SQL.append("  OPERE B ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'LIQ', 'S', 'E')) ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.FINANZIAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.CODICE = A.OPERA) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_OPERA = QV.Get("MINBILFINOPE", IDVariant.INTEGER) ;
          }
          QV.Close();
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_OPERA, 0, new IDVariant(v_OPERA));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_OPERA, 0, (new IDVariant()));
        }
      }
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_PROGR_UNITA_ORGANIZZATIVA, 0, MainFrm.GetUOUnicaDaCap(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.FLOAT), ((IMDB.Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMORDLIQ, 0).equals((new IDVariant("LIQ"))))?(new IDVariant("S")):(new IDVariant("E"))), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "ProponiDaCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Da Imp
  // **********************************************************************
  public int ProponiDaImp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_VOCEECONOMIC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONSSVILUPPO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_BENEFICIARIO = new IDVariant(0,IDVariant.FLOAT);
    IDVariant v_FATTORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CENTRO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_COMPDAL = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_COMPAL = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_VINCOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CGUIMP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CGUCAP = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Da Imp Body
      // Procedure Body
      // 
      IDVariant v_VCOFOG = null;
      v_VCOFOG = (new IDVariant());
      IDVariant v_VLIVELLO5 = null;
      v_VLIVELLO5 = (new IDVariant());
      IDVariant v_VCODEUROPEO = null;
      v_VCODEUROPEO = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as IMPCAPITOLO, ");
      SQL.append("  A.ARTICOLO as IMPARTICOLO, ");
      SQL.append("  A.VOCE_ECON as IMPVOCEECON, ");
      SQL.append("  A.CONS_SVILUPPO as IMPCONSSVILU, ");
      SQL.append("  A.BENEFICIARIO as IMPBENEFICIA, ");
      SQL.append("  A.FATTORE as IMPFATTORE, ");
      SQL.append("  A.CENTRO as IMPCENTRO, ");
      SQL.append("  A.COMPETENZA_DAL as IMPCOMPETDAL, ");
      SQL.append("  A.COMPETENZA_AL as IMPCOMPETEAL, ");
      SQL.append("  A.TIPO_VINCOLO as IMPTIPOVINCO, ");
      SQL.append("  A.CODICE_GESTIONALE as IMPCODICGEST, ");
      SQL.append("  B.CODICE_GESTIONALE as CAPCODICGEST, ");
      SQL.append("  A.CODICE_COFOG as IMPCODICCOFO, ");
      SQL.append("  A.COD_LIVELLO_5 as IMPCODLIVEL5, ");
      SQL.append("  A.CODICE_EUROPEO as IMPCODICEURO ");
      SQL.append("from ");
      SQL.append("  IMP A, ");
      SQL.append("  CAP B ");
      SQL.append("where (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.E_S = 'S') ");
      SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CAPITOLO = QV.Get("IMPCAPITOLO", IDVariant.DECIMAL) ;
        v_ARTICOLO = QV.Get("IMPARTICOLO", IDVariant.INTEGER) ;
        v_VOCEECONOMIC = QV.Get("IMPVOCEECON", IDVariant.INTEGER) ;
        v_CONSSVILUPPO = QV.Get("IMPCONSSVILU", IDVariant.STRING) ;
        v_BENEFICIARIO = QV.Get("IMPBENEFICIA", IDVariant.FLOAT) ;
        v_FATTORE = QV.Get("IMPFATTORE", IDVariant.STRING) ;
        v_CENTRO = QV.Get("IMPCENTRO", IDVariant.STRING) ;
        v_COMPDAL = QV.Get("IMPCOMPETDAL", IDVariant.DATETIME) ;
        v_COMPAL = QV.Get("IMPCOMPETEAL", IDVariant.DATETIME) ;
        v_VINCOLO = QV.Get("IMPTIPOVINCO", IDVariant.INTEGER) ;
        v_CGUIMP = QV.Get("IMPCODICGEST", IDVariant.INTEGER) ;
        v_CGUCAP = QV.Get("CAPCODICGEST", IDVariant.INTEGER) ;
        v_VCOFOG = QV.Get("IMPCODICCOFO", IDVariant.INTEGER) ;
        v_VLIVELLO5 = QV.Get("IMPCODLIVEL5", IDVariant.INTEGER) ;
        v_VCODEUROPEO = QV.Get("IMPCODICEURO", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0, new IDVariant(v_CAPITOLO));
      IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CAPITOLO_OLD, 0, new IDVariant(v_CAPITOLO));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0, new IDVariant(v_ARTICOLO));
      IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_ARTICOLO_OLD, 0, new IDVariant(v_ARTICOLO));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKCAP, 0, (new IDVariant("SI")));
      if (!(MainFrm.SIOPEATTIARM.booleanValue()))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VOCE_ECON, 0, new IDVariant(v_VOCEECONOMIC));
        if (IDL.IsNull(v_CGUIMP) || MainFrm.ControlloCguScaduto(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0), v_CGUIMP, (new IDVariant())))
        {
          v_CGUIMP = (new IDVariant());
          if (IDL.IsNull(v_CGUCAP) || MainFrm.ControlloCguScaduto(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0), v_CGUCAP, (new IDVariant())))
          {
            v_CGUCAP = (new IDVariant());
          }
        }
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_GESTIONALE, 0, IDL.NullValue(v_CGUIMP,v_CGUCAP));
      }
      if (!(IDL.IsNull(v_VCOFOG)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG, 0, new IDVariant(v_VCOFOG));
      }
      else
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG, 0, MainFrm.CofogUnicoCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), v_CAPITOLO, v_ARTICOLO));
      }
      if (!(IDL.IsNull(v_VLIVELLO5)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, 0, new IDVariant(new IDVariant(v_VLIVELLO5),IDVariant.DECIMAL));
      }
      else
      {
        v_VLIVELLO5 = new IDVariant(MainFrm.GetCodLiv5DaCapOUnico(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), v_CAPITOLO, v_ARTICOLO),IDVariant.INTEGER);
        if (!(IDL.IsNull(v_VLIVELLO5)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, 0, new IDVariant(new IDVariant(v_VLIVELLO5),IDVariant.DECIMAL));
        }
      }
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_EUROPEO, 0, new IDVariant(v_VCODEUROPEO));
      if (!(IDL.IsNull(v_VINCOLO)))
      {
        if (!(MainFrm.ControlloVincoloScaduto(v_VINCOLO)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_TIPO_VINCOLO, 0, new IDVariant(v_VINCOLO));
        }
      }
      if (!(IDL.IsNull(v_BENEFICIARIO)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_BENEFICIARIO, 0, new IDVariant(v_BENEFICIARIO));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_NUM_QUIETANZA, 0, MainFrm.SettaQuietanzaBeneficiario(v_BENEFICIARIO, IDL.Today()));
      }
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMP_DAL, 0, new IDVariant(v_COMPDAL));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMP_AL, 0, new IDVariant(v_COMPAL));
        if (!(IDL.IsNull(v_FATTORE)))
        {
          if (!(MainFrm.ControlloFattoreScaduto(v_FATTORE)))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0, new IDVariant(v_FATTORE));
          }
        }
        if (!(IDL.IsNull(v_CENTRO)) && MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
        {
          if (!(MainFrm.ControlloCentroScaduto(v_CENTRO)))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CENTRO, 0, new IDVariant(v_CENTRO));
          }
        }
      }
      // 
      // 
      // 
      // 
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        IDVariant v_FINANZIAMENT = new IDVariant(0,IDVariant.INTEGER);
        v_FINANZIAMENT = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.FINANZIAMENTO) as MINIMPFINFIN ");
        SQL.append("from ");
        SQL.append("  IMP_FIN A, ");
        SQL.append("  ESEIMP_FIN B ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.FINANZIAMENTO = A.FINANZIAMENTO) ");
        SQL.append("and   (B.OPERA = A.OPERA) ");
        SQL.append("and   (B.ANNO_IMP = A.ANNO_IMP) ");
        SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
        SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) ");
        SQL.append("and   (NVL(B.SALDO_INI, 0) + NVL(B.VARIAZIONI, 0) + NVL(B.VARIAZIONI_RES, 0) > 0) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_FINANZIAMENT = QV.Get("MINIMPFINFIN", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_FINANZIAMENT)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO, 0, new IDVariant(v_FINANZIAMENT));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO, 0, (new IDVariant()));
        }
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_OPERA, 0, (new IDVariant()));
      }
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_PROGR_UNITA_ORGANIZZATIVA, 0, MainFrm.GetUOUnicaDaCap(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.FLOAT), (new IDVariant("S")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "ProponiDaImp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Da Acc
  // **********************************************************************
  public int ProponiDaAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_VOCEECONOMIC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_DEBITORE = new IDVariant(0,IDVariant.FLOAT);
    IDVariant v_FATTORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CENTRO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_COMPDAL = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_COMPAL = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_VINCOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CGUACC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CGUCAP = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Da Acc Body
      // Procedure Body
      // 
      IDVariant v_VACCCODLIVE5 = null;
      v_VACCCODLIVE5 = (new IDVariant());
      IDVariant v_VACCCODIEURO = null;
      v_VACCCODIEURO = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as ACCCAPITOLO, ");
      SQL.append("  A.ARTICOLO as ACCARTICOLO, ");
      SQL.append("  A.VOCE_ECON as ACCVOCEECON, ");
      SQL.append("  A.DEBITORE as ACCDEBITORE, ");
      SQL.append("  A.FATTORE as ACCFATTORE, ");
      SQL.append("  A.CENTRO as ACCCENTRO, ");
      SQL.append("  A.COMPETENZA_DAL as ACCCOMPETDAL, ");
      SQL.append("  A.COMPETENZA_AL as ACCCOMPETEAL, ");
      SQL.append("  A.TIPO_VINCOLO as ACCTIPOVINCO, ");
      SQL.append("  A.CODICE_GESTIONALE as ACCCODICGEST, ");
      SQL.append("  B.CODICE_GESTIONALE as CAPCODICGEST, ");
      SQL.append("  A.COD_LIVELLO_5 as ACCCODLIVEL5, ");
      SQL.append("  A.CODICE_EUROPEO as ACCCODICEURO ");
      SQL.append("from ");
      SQL.append("  ACC A, ");
      SQL.append("  CAP B ");
      SQL.append("where (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.E_S = 'E') ");
      SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CAPITOLO = QV.Get("ACCCAPITOLO", IDVariant.DECIMAL) ;
        v_ARTICOLO = QV.Get("ACCARTICOLO", IDVariant.INTEGER) ;
        v_VOCEECONOMIC = QV.Get("ACCVOCEECON", IDVariant.INTEGER) ;
        v_DEBITORE = QV.Get("ACCDEBITORE", IDVariant.FLOAT) ;
        v_FATTORE = QV.Get("ACCFATTORE", IDVariant.STRING) ;
        v_CENTRO = QV.Get("ACCCENTRO", IDVariant.STRING) ;
        v_COMPDAL = QV.Get("ACCCOMPETDAL", IDVariant.DATETIME) ;
        v_COMPAL = QV.Get("ACCCOMPETEAL", IDVariant.DATETIME) ;
        v_VINCOLO = QV.Get("ACCTIPOVINCO", IDVariant.INTEGER) ;
        v_CGUACC = QV.Get("ACCCODICGEST", IDVariant.INTEGER) ;
        v_CGUCAP = QV.Get("CAPCODICGEST", IDVariant.INTEGER) ;
        v_VACCCODLIVE5 = QV.Get("ACCCODLIVEL5", IDVariant.INTEGER) ;
        v_VACCCODIEURO = QV.Get("ACCCODICEURO", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0, new IDVariant(v_CAPITOLO));
      IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CAPITOLO_OLD, 0, new IDVariant(v_CAPITOLO));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0, new IDVariant(v_ARTICOLO));
      IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_ARTICOLO_OLD, 0, new IDVariant(v_ARTICOLO));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKCAP, 0, (new IDVariant("SI")));
      if (!(IDL.IsNull(v_VACCCODIEURO)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_EUROPEO, 0, new IDVariant(v_VACCCODIEURO));
      }
      if (!(IDL.IsNull(v_VACCCODLIVE5)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, 0, new IDVariant(new IDVariant(v_VACCCODLIVE5),IDVariant.DECIMAL));
      }
      else
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, 0, MainFrm.GetCodLiv5DaCapOUnico(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("E")), v_CAPITOLO, v_ARTICOLO));
      }
      if (!(MainFrm.SIOPEATTIARM.booleanValue()))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VOCE_ECON, 0, new IDVariant(v_VOCEECONOMIC));
        if (IDL.IsNull(v_CGUACC) || MainFrm.ControlloCguScaduto(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("E")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0), v_CGUACC, (new IDVariant())))
        {
          v_CGUACC = (new IDVariant());
          if (IDL.IsNull(v_CGUCAP) || MainFrm.ControlloCguScaduto(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("E")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0), v_CGUCAP, (new IDVariant())))
          {
            v_CGUCAP = (new IDVariant());
          }
        }
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_GESTIONALE, 0, IDL.NullValue(v_CGUACC,v_CGUCAP));
      }
      if (!(IDL.IsNull(v_VINCOLO)))
      {
        if (!(MainFrm.ControlloVincoloScaduto(v_VINCOLO)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_TIPO_VINCOLO, 0, new IDVariant(v_VINCOLO));
        }
      }
      if (!(IDL.IsNull(v_DEBITORE)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_BENEFICIARIO, 0, new IDVariant(v_DEBITORE));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_NUM_QUIETANZA, 0, MainFrm.SettaQuietanzaBeneficiario(v_DEBITORE, IDL.Today()));
      }
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMP_DAL, 0, new IDVariant(v_COMPDAL));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMP_AL, 0, new IDVariant(v_COMPAL));
        if (!(IDL.IsNull(v_FATTORE)))
        {
          if (!(MainFrm.ControlloFattoreScaduto(v_FATTORE)))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0, new IDVariant(v_FATTORE));
          }
        }
        if (!(IDL.IsNull(v_CENTRO)) && MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
        {
          if (!(MainFrm.ControlloCentroScaduto(v_CENTRO)))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CENTRO, 0, new IDVariant(v_CENTRO));
          }
        }
      }
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_OPERA = new IDVariant(0,IDVariant.INTEGER);
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO, 0, (new IDVariant()));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(DISTINCT A.OPERA) as DISCOUACOPOP, ");
        SQL.append("  MIN(A.OPERA) as MINACCOPEOPE ");
        SQL.append("from ");
        SQL.append("  ACC_OPE A ");
        SQL.append("where (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NUMREC = QV.Get("DISCOUACOPOP", IDVariant.INTEGER) ;
          v_OPERA = QV.Get("MINACCOPEOPE", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_NUMREC.equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_OPERA, 0, new IDVariant(v_OPERA));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_OPERA, 0, (new IDVariant()));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "ProponiDaAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Da Subimp
  // **********************************************************************
  public int ProponiDaSubimp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_VOCEECONOMIC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_BENEFICIARIO = new IDVariant(0,IDVariant.FLOAT);
    IDVariant v_FATTORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CENTRO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_COMPDAL = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_COMPAL = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_VINCOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CGUIMP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CGUCAP = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Da Subimp Body
      // Procedure Body
      // 
      IDVariant v_VCOFOG = null;
      v_VCOFOG = (new IDVariant());
      IDVariant v_VLIVELLO5 = null;
      v_VLIVELLO5 = (new IDVariant());
      IDVariant v_VCODEUROPEO = null;
      v_VCODEUROPEO = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as SUBIMPCAPITO, ");
      SQL.append("  A.ARTICOLO as SUBIMPARTICO, ");
      SQL.append("  A.BENEFICIARIO as SUBIMPBENEFI, ");
      SQL.append("  A.FATTORE as SUBIMPFATTOR, ");
      SQL.append("  A.CENTRO as SUBIMPCENTRO, ");
      SQL.append("  A.COMPETENZA_DAL as SUBIMCOMPDAL, ");
      SQL.append("  A.COMPETENZA_AL as SUBIMCOMPEAL, ");
      SQL.append("  A.CODICE_GESTIONALE as SUBICODIGEST, ");
      SQL.append("  C.CODICE_GESTIONALE as CAPCODICGEST, ");
      SQL.append("  B.VOCE_ECON as IMPVOCEECON, ");
      SQL.append("  A.CODICE_COFOG as SUBICODICOFO, ");
      SQL.append("  A.COD_LIVELLO_5 as SUBICODLIVE5, ");
      SQL.append("  A.CODICE_EUROPEO as SUBICODIEURO ");
      SQL.append("from ");
      SQL.append("  SUBIMP A, ");
      SQL.append("  IMP B, ");
      SQL.append("  CAP C ");
      SQL.append("where (C.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (C.E_S = 'S') ");
      SQL.append("and   (C.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (C.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANNSUB, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.ANNO_IMP(+) = A.ANNO_IMP) ");
      SQL.append("and   (B.NUMERO_IMP(+) = A.NUMERO_IMP) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CAPITOLO = QV.Get("SUBIMPCAPITO", IDVariant.DECIMAL) ;
        v_ARTICOLO = QV.Get("SUBIMPARTICO", IDVariant.INTEGER) ;
        v_BENEFICIARIO = QV.Get("SUBIMPBENEFI", IDVariant.FLOAT) ;
        v_FATTORE = QV.Get("SUBIMPFATTOR", IDVariant.STRING) ;
        v_CENTRO = QV.Get("SUBIMPCENTRO", IDVariant.STRING) ;
        v_COMPDAL = QV.Get("SUBIMCOMPDAL", IDVariant.DATETIME) ;
        v_COMPAL = QV.Get("SUBIMCOMPEAL", IDVariant.DATETIME) ;
        v_CGUIMP = QV.Get("SUBICODIGEST", IDVariant.INTEGER) ;
        v_CGUCAP = QV.Get("CAPCODICGEST", IDVariant.INTEGER) ;
        v_VOCEECONOMIC = QV.Get("IMPVOCEECON", IDVariant.INTEGER) ;
        v_VCOFOG = QV.Get("SUBICODICOFO", IDVariant.INTEGER) ;
        v_VLIVELLO5 = QV.Get("SUBICODLIVE5", IDVariant.INTEGER) ;
        v_VCODEUROPEO = QV.Get("SUBICODIEURO", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_SE_SUBIMPEGNO, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0, new IDVariant(v_CAPITOLO));
      IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CAPITOLO_OLD, 0, new IDVariant(v_CAPITOLO));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0, new IDVariant(v_ARTICOLO));
      IMDB.set_Value(IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_ARTICOLO_OLD, 0, new IDVariant(v_ARTICOLO));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALOCOMCKCAP, 0, (new IDVariant("SI")));
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VOCE_ECON, 0, new IDVariant(v_VOCEECONOMIC));
        if (!(IDL.IsNull(v_CGUIMP)))
        {
          if (!(MainFrm.ControlloCguScaduto(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0), v_CGUIMP, (new IDVariant()))))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_GESTIONALE, 0, new IDVariant(v_CGUIMP));
          }
        }
        else
        {
          if (!(IDL.IsNull(v_CGUCAP)))
          {
            if (!(MainFrm.ControlloCguScaduto(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0), v_CGUCAP, (new IDVariant()))))
            {
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_GESTIONALE, 0, new IDVariant(v_CGUCAP));
            }
          }
        }
      }
      if (!(IDL.IsNull(v_VCOFOG)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG, 0, new IDVariant(v_VCOFOG));
      }
      else
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_COFOG, 0, MainFrm.CofogUnicoCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), v_CAPITOLO, v_ARTICOLO));
      }
      if (!(IDL.IsNull(v_VLIVELLO5)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, 0, new IDVariant(new IDVariant(v_VLIVELLO5),IDVariant.DECIMAL));
      }
      else
      {
        v_VLIVELLO5 = new IDVariant(MainFrm.GetCodLiv5DaCapOUnico(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), v_CAPITOLO, v_ARTICOLO),IDVariant.INTEGER);
        if (!(IDL.IsNull(v_VLIVELLO5)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COD_LIVELLO_5, 0, new IDVariant(new IDVariant(v_VLIVELLO5),IDVariant.DECIMAL));
        }
      }
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CODICE_EUROPEO, 0, new IDVariant(v_VCODEUROPEO));
      if (!(IDL.IsNull(v_VINCOLO)))
      {
        if (!(MainFrm.ControlloVincoloScaduto(v_VINCOLO)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_TIPO_VINCOLO, 0, new IDVariant(v_VINCOLO));
        }
      }
      if (!(IDL.IsNull(v_BENEFICIARIO)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_BENEFICIARIO, 0, new IDVariant(v_BENEFICIARIO));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_NUM_QUIETANZA, 0, MainFrm.SettaQuietanzaBeneficiario(v_BENEFICIARIO, IDL.Today()));
      }
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMP_DAL, 0, new IDVariant(v_COMPDAL));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_COMP_AL, 0, new IDVariant(v_COMPAL));
        if (!(IDL.IsNull(v_FATTORE)))
        {
          if (!(MainFrm.ControlloFattoreScaduto(v_FATTORE)))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FATTORE, 0, new IDVariant(v_FATTORE));
          }
        }
        if (!(IDL.IsNull(v_CENTRO)) && MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
        {
          if (!(MainFrm.ControlloCentroScaduto(v_CENTRO)))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CENTRO, 0, new IDVariant(v_CENTRO));
          }
        }
      }
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        IDVariant v_FINANZIAMENT = new IDVariant(0,IDVariant.INTEGER);
        v_FINANZIAMENT = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.FINANZIAMENTO) as MINSUBFINFIN ");
        SQL.append("from ");
        SQL.append("  SUBIMP_FIN A, ");
        SQL.append("  ESESUB_FIN B ");
        SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMANNSUB, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_VALCOMNUMSUB, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.FINANZIAMENTO = A.FINANZIAMENTO) ");
        SQL.append("and   (B.ANNO_SUBIMP = A.ANNO_SUBIMP) ");
        SQL.append("and   (B.NUMERO_SUBIMP = A.NUMERO_SUBIMP) ");
        SQL.append("and   (NVL(B.SALDO_INI, 0) + NVL(B.VARIAZIONI, 0) + NVL(B.VARIAZIONI_RES, 0) > 0) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_FINANZIAMENT = QV.Get("MINSUBFINFIN", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_FINANZIAMENT)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO, 0, new IDVariant(v_FINANZIAMENT));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_FINANZIAMENTO, 0, (new IDVariant()));
        }
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_OPERA, 0, (new IDVariant()));
      }
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_PROGR_UNITA_ORGANIZZATIVA, 0, MainFrm.GetUOUnicaDaCap(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.FLOAT), (new IDVariant("S")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI569, IMDBDef14.PQSL_PARAMETRI569_ARTICOLO, 0)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "ProponiDaSubimp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilita Mandato Informatico
  // **********************************************************************
  public int VisibilitaMandatoInformatico ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_LICENZAMIF = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Visibilita Mandato Informatico Body
      // Procedure Body
      // 
      v_LICENZAMIF = (new IDVariant(MainFrm.Licenza((new IDVariant("MIF")))));
      if (MainFrm.LIQMO.equals((new IDVariant("SI")), true))
      {
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        if (v_LICENZAMIF.booleanValue() && MainFrm.GESTIONSPESE.equals((new IDVariant("SI")), true))
        {
          PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (v_LICENZAMIF.booleanValue() && MainFrm.GESTIOALLEGA.equals((new IDVariant("SI")), true))
        {
          PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (v_LICENZAMIF.booleanValue())
        {
          PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (v_LICENZAMIF.booleanValue() && MainFrm.GESTIOCOMMIS.equals((new IDVariant("SI")), true))
      {
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (v_LICENZAMIF.booleanValue() && MainFrm.GESTINFOTESO.equals((new IDVariant("SI")), true))
      {
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(v_LICENZAMIF.booleanValue()) && MainFrm.LIQMO.compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_GROUP, GRP_VALCOMORDLIQ_MANDATINFORM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VALCOMORDLIQ.SetFlags (Glb.OBJ_GROUP, GRP_VALCOMORDLIQ_MANDATINFORM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "VisibilitaMandatoInformatico", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Conferma
  // **********************************************************************
  public int Conferma ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conferma Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniOrdLiq", "Conferma", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void AGGVALCOORLI_PARAMETRI569() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI569_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_VALCOMORDLIQ, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_VALCOMORDLIQ, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI569_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI569_RS, 0, IMDBDef5.TBL_VALCOMORDLIQ, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 0, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKDEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 1, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_ANNO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 2, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 3, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 4, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKDES, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 5, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_DESCRIZIONE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 6, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKTIVI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 7, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_TIPO_VINCOLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 8, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKMAIN, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 9, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_SPESE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 10, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_SCADENZA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 11, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_ALLEGATI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 12, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_COMMISSIONI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 13, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_INFO_TESORIERE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 14, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKECO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 15, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_FATTORE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 16, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CENTRO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 17, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_COMP_DAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 18, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_COMP_AL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 19, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKTRA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 20, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CODICE_COFOG, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 21, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_COD_LIVELLO_5, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 22, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CODICE_EUROPEO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 23, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKCAP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 24, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CAPITOLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 25, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_ARTICOLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 26, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKIMAC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 27, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMANIMAC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 28, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMNUIMAC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 29, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKSUB, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 30, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMANNSUB, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 31, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMNUMSUB, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 32, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_VOCE_ECON, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 33, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_CODICE_GESTIONALE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 34, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_FINANZIAMENTO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 35, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_OPERA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 36, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_SE_SUBIMPEGNO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 37, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_PROGR_UNITA_ORGANIZZATIVA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 38, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_BENEFICIARIO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI569_RS, 39, 0, IMDBDef5.TBL_VALCOMORDLIQ, IMDBDef5.FLD_VALCOMORDLIQ_NUM_QUIETANZA, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_VALCOMORDLIQ, 0);
      if (IMDB.Eof(IMDBDef5.TBL_VALCOMORDLIQ, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_VALCOMORDLIQ, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI569_RS, 0);
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
  private void PAN_VALCOMORDLIQ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VALCOMORDLIQ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VALCOMORDLIQ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VALCOMORDLIQ, Cancel);
    // Stub
  }

  private void PAN_VALCOMORDLIQ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VALCOMORDLIQ_SCELDELIFORM)
    {
      this.IdxPanelActived = this.PAN_VALCOMORDLIQ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALCOMORDLIQ_SCELTACAPITO)
    {
      this.IdxPanelActived = this.PAN_VALCOMORDLIQ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALCOMORDLIQ_SCELTAIMPACC)
    {
      this.IdxPanelActived = this.PAN_VALCOMORDLIQ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaImpAcc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALCOMORDLIQ_SCELTASUBIMP)
    {
      this.IdxPanelActived = this.PAN_VALCOMORDLIQ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaSubimp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALCOMORDLIQ_CODLIVELLO5)
    {
      this.IdxPanelActived = this.PAN_VALCOMORDLIQ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CODLIVELLO5();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALCOMORDLIQ_CODICECOFOG)
    {
      this.IdxPanelActived = this.PAN_VALCOMORDLIQ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CODICECOFOG();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALCOMORDLIQ_FATTORE)
    {
      this.IdxPanelActived = this.PAN_VALCOMORDLIQ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALCOMORDLIQ_CENTRO)
    {
      this.IdxPanelActived = this.PAN_VALCOMORDLIQ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALCOMORDLIQ_CONFERMLABEL)
    {
      this.IdxPanelActived = this.PAN_VALCOMORDLIQ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Conferma();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VALCOMORDLIQ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VALCOMORDLIQ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VALCOMORDLIQ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VALCOMORDLIQ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VALCOMORDLIQ_Init()
  {

    PAN_VALCOMORDLIQ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VALCOMORDLIQ.SetSize(MyGlb.OBJ_GROUP, 9);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DELIBERA, "42B99498-3035-454D-8B06-6D48AE6EE956");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DELIBERA, "Delibera");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DELIBERA, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DELIBERA, MyGlb.VIS_GROUPSTYLE);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DELIBERA, MyGlb.PANEL_LIST, 0, -9999, 48, 16, 0, 0);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DELIBERA, MyGlb.PANEL_FORM, 4, 39, 236, 49, 0, 0);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DELIBERA, 0, 47);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DELIBERA, 1, 13);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DELIBERA, 0, 4);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DELIBERA, 1, 4);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CAPITOLO, "02E876EE-A74C-41FF-B508-72DB63C14AC9");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CAPITOLO, "Capitolo");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CAPITOLO, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CAPITOLO, MyGlb.VIS_GROUPSTYLE);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CAPITOLO, MyGlb.PANEL_LIST, 0, -9999, 88, 16, 0, 0);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CAPITOLO, MyGlb.PANEL_FORM, 248, 39, 256, 49, 0, 0);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CAPITOLO, 0, 46);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CAPITOLO, 1, 13);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CAPITOLO, 0, 4);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CAPITOLO, 1, 4);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_IMPACC, "1CD036F2-7EF1-41BE-9896-5330B251851A");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_IMPACC, "Imp Acc");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_IMPACC, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_IMPACC, MyGlb.VIS_GROUPSTYLE);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_IMPACC, MyGlb.PANEL_LIST, 0, -9999, 108, 16, 0, 0);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_IMPACC, MyGlb.PANEL_FORM, 512, 39, 168, 49, 0, 0);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_IMPACC, 0, 46);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_IMPACC, 1, 13);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_IMPACC, 0, 4);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_IMPACC, 1, 4);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_IMPACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_SUBIMPEGNO, "A9F6C572-4F2A-41D5-A460-348F2587F509");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_SUBIMPEGNO, "Sub-Impegno");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_SUBIMPEGNO, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_SUBIMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_SUBIMPEGNO, MyGlb.PANEL_LIST, 0, -9999, 104, 16, 0, 0);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_SUBIMPEGNO, MyGlb.PANEL_FORM, 688, 39, 164, 49, 0, 0);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_SUBIMPEGNO, 0, 77);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_SUBIMPEGNO, 1, 13);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_SUBIMPEGNO, 0, 4);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_SUBIMPEGNO, 1, 4);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_SUBIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DESCRIZIONE, "1DBD3270-FD45-4C32-AA0F-A8FB450FD5AA");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DESCRIZIONE, "Descrizione");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DESCRIZIONE, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DESCRIZIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DESCRIZIONE, MyGlb.PANEL_LIST, 0, -9999, 48, 16, 0, 0);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 91, 376, 49, 0, 0);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DESCRIZIONE, 0, 65);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DESCRIZIONE, 1, 13);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DESCRIZIONE, 0, 4);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DESCRIZIONE, 1, 4);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_TIPOVINCOLO, "0EFBEC2E-C0F6-446E-B40D-1B712AE09643");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_TIPOVINCOLO, "Tipo Vincolo");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_TIPOVINCOLO, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_TIPOVINCOLO, MyGlb.VIS_GROUPSTYLE);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, -9999, 48, 16, 0, 0);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_TIPOVINCOLO, MyGlb.PANEL_FORM, 388, 91, 464, 49, 0, 0);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_TIPOVINCOLO, 0, 67);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_TIPOVINCOLO, 1, 13);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_TIPOVINCOLO, 0, 4);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_TIPOVINCOLO, 1, 4);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_MANDATINFORM, "27AB1538-7EAE-4144-B858-B1DAA4AD3332");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_MANDATINFORM, "Mandato Informatico");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_MANDATINFORM, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_MANDATINFORM, MyGlb.VIS_GROUPSTYLE);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_MANDATINFORM, MyGlb.PANEL_LIST, 0, -9999, 104, 16, 0, 0);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_MANDATINFORM, MyGlb.PANEL_FORM, 4, 143, 376, 121, 0, 0);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_MANDATINFORM, 0, 120);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_MANDATINFORM, 1, 13);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_MANDATINFORM, 0, 4);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_MANDATINFORM, 1, 4);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_MANDATINFORM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CODITRANELEM, "75A74AD3-24EA-4ABA-89B9-61854685438A");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CODITRANELEM, "Codici Trans. Elementare");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CODITRANELEM, "Codici Trans. Elementare");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CODITRANELEM, MyGlb.VIS_GROUPSTYLE);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CODITRANELEM, MyGlb.PANEL_LIST, 0, -9999, 504, 16, 0, 0);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CODITRANELEM, MyGlb.PANEL_FORM, 388, 143, 464, 121, 0, 0);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CODITRANELEM, 0, 139);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CODITRANELEM, 1, 13);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CODITRANELEM, 0, 4);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CODITRANELEM, 1, 4);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_CODITRANELEM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_ECONOMICA, "850B7C1A-D3F9-49F5-AB84-AF4F560D5B3B");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_ECONOMICA, "Economica");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_ECONOMICA, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_ECONOMICA, MyGlb.VIS_GROUPSTYLE);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_ECONOMICA, MyGlb.PANEL_LIST, 0, -9999, 308, 16, 0, 0);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_ECONOMICA, MyGlb.PANEL_FORM, 4, 267, 848, 121, 0, 0);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_ECONOMICA, 0, 60);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_ECONOMICA, 1, 13);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_ECONOMICA, 0, 4);
    PAN_VALCOMORDLIQ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_ECONOMICA, 1, 4);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_GROUP, GRP_VALCOMORDLIQ_ECONOMICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALCOMORDLIQ.SetSize(MyGlb.OBJ_FIELD, 54);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INTESTALABEL, "B40F573D-1E92-479C-B68A-6ECE3BACFC4B");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INTESTALABEL, "I valori indicati verranno valorizzati su tutte le righe selezionate. I campi considerati sono quelli selezionati tramite checkbox");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INTESTALABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INTESTALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDELIBERA, "094939B9-DF7A-4F4F-9312-B53CEA42BC4D");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDELIBERA, "CK DELIBERA");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDELIBERA, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDELIBERA, MyGlb.VIS_CHECKSTYLE);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SEDEDEL, "3CF0C7A4-767A-42CC-BC6A-358634BDF346");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SEDEDEL, "SEDE DEL");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SEDEDEL, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TRATDELILABE, "1F3BBD96-3228-4A49-BD30-392282D9D787");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TRATDELILABE, "-");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TRATDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TRATDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMERODEL, "40A081A9-332D-4878-AAEB-072C076CBCA4");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMERODEL, "NUMERO DEL");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMERODEL, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNODEL, "7EB10489-BFE6-4978-99C9-7828B98CA383");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNODEL, "ANNO DEL");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNODEL, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BARRDELILABE, "3F684F1F-74DD-4785-BAE7-81065E72A6C1");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BARRDELILABE, "/");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BARRDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BARRDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELDELIFORM, "985D9E9E-B4F8-4773-95A1-79133C81D6C8");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELDELIFORM, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELDELIFORM, MyGlb.VIS_STATICBUTTON);
    PAN_VALCOMORDLIQ.SetImage(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELDELIFORM, 0, "wsearch1.gif", false);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELDELIFORM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKCAPITOLO, "74D64E09-FD8F-42ED-9B79-8B744877DECB");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKCAPITOLO, "CK CAPITOLO");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKCAPITOLO, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKCAPITOLO, MyGlb.VIS_CHECKSTYLE);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKCAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CAPITOLO, "F177D12F-054B-4A65-9DB7-C501CA267260");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CAPITOLO, "CAPITOLO");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CAPITOLO, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ARTICOLO, "43BE89A0-CDFC-4CAC-A748-C5BCE4C4D7B0");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ARTICOLO, "/");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ARTICOLO, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTACAPITO, "6B371C83-8362-4D82-916D-32C3FD25C9ED");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTACAPITO, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTACAPITO, MyGlb.VIS_STATICBUTTON);
    PAN_VALCOMORDLIQ.SetImage(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTACAPITO, 0, "wsearch1.gif", false);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTACAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKIMPACC, "BB21D676-750C-4F4C-851C-FF823FFA2579");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKIMPACC, "CK IMP ACC");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKIMPACC, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKIMPACC, MyGlb.VIS_CHECKSTYLE);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKIMPACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROIMPACC, "39C4F9F6-4FF4-4677-AD5E-1E652AD48F9E");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROIMPACC, "NUMERO IMP ACC");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROIMPACC, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROIMPACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOIMPACC, "44F07668-3FAC-446D-A9E7-8B5FA9DF39BB");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOIMPACC, "/");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOIMPACC, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOIMPACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTAIMPACC, "9CB4805B-8314-4B8B-990A-1F9132F09E07");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTAIMPACC, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTAIMPACC, MyGlb.VIS_STATICBUTTON);
    PAN_VALCOMORDLIQ.SetImage(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTAIMPACC, 0, "wsearch1.gif", false);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTAIMPACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKSUBIMP, "EE58C2B1-CFFE-4526-AC73-CBED3976CE68");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKSUBIMP, "CK SUBIMP");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKSUBIMP, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKSUBIMP, MyGlb.VIS_CHECKSTYLE);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROSUBIMP, "BC727334-4AB6-49B7-832D-D5682FDFD7AD");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROSUBIMP, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOSUBIMP, "40DB3C6B-DE02-46C8-AFEA-8802D5DBA24A");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOSUBIMP, "/");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOSUBIMP, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTASUBIMP, "A577D393-E736-4B0C-BCAC-44C923BCB95D");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTASUBIMP, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTASUBIMP, MyGlb.VIS_STATICBUTTON);
    PAN_VALCOMORDLIQ.SetImage(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTASUBIMP, 0, "wsearch1.gif", false);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTASUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDESCRIZION, "BEC03014-8A7D-44EC-98DF-5ADF6212BCB2");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDESCRIZION, "CK DESCRIZIONE");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDESCRIZION, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDESCRIZION, MyGlb.VIS_CHECKSTYLE);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDESCRIZION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DESCRIZIONE, "ED60A9FC-363E-409D-BBE6-AF672AB6FAEB");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DESCRIZIONE, "Descrizione");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DESCRIZIONE, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTIPOVINCOL, "127E95F9-14C9-4AA9-B47D-094B3797CD49");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTIPOVINCOL, "CK TIPO VINCOLO");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTIPOVINCOL, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTIPOVINCOL, MyGlb.VIS_CHECKSTYLE);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTIPOVINCOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TIPOVINCOLO, "0D85192D-7617-4DB2-AE39-73C734F24CEB");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TIPOVINCOLO, "TIPO VINCOLO");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TIPOVINCOLO, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKMANDAINFOR, "C48C6F57-BE8F-4E9F-B5D0-EE5B43BB0B10");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKMANDAINFOR, "CK MANDATO INFORMATICO");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKMANDAINFOR, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKMANDAINFOR, MyGlb.VIS_CHECKSTYLE);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKMANDAINFOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, "C7497FEE-2C5D-49F9-A15C-4132E2400F05");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, "Spese");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, "37A7074E-7936-4181-9E3A-7495035F1134");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, "Scadenza");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, "D4E80BDF-C591-4F6F-8A42-768235BF3C53");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, "Commissioni");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, "43BDF350-933B-4854-97CA-CD73CFF76490");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, "Allegati");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, "7EEF519B-4F34-429E-A4CC-233C6C88070D");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, "Info Tesoriere");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF1, "536FE647-ADB7-4D90-8DB8-8DBCA69C5217");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF1, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF1, MyGlb.VIS_SFONEBORDTRA);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTRANS, "7C3E6F81-4B18-44A4-BE0B-F6D2414D8161");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTRANS, "CK TRANS");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTRANS, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTRANS, MyGlb.VIS_CHECKSTYLE);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTRANS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODLIVELLO5, "A92522CC-1CDC-444B-B8AF-1B47B465267D");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODLIVELLO5, "Cod. V livello");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODLIVELLO5, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODLIVELLO5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCVLIV, "9DDFF3DF-E611-451A-B8B3-8F5B732A41EA");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCVLIV, "DUAL Descr VLiv");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCVLIV, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCVLIV, MyGlb.VIS_VISULOOUPCF4);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCVLIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, "F40796B8-1ED9-4EDF-B6C0-2E75B219BC9B");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, "Cod. Cofog");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEEUROPE, "8BCCBB94-1F3D-4F76-A26A-F818B4BC7DBA");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEEUROPE, "Cod. Europeo");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEEUROPE, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEEUROPE, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEEUROPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, "E4011FB1-847E-4553-A2BC-31CBF9DD960A");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, "DUAL Descr COFOG");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, MyGlb.VIS_VISULOOUPCF4);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF, "082AD802-0727-45EC-96F6-AA6EDC1B3092");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF, MyGlb.VIS_SFONEBORDTRA);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKECONOMICA, "DC360C41-F5AD-42F6-B540-DA8DA95D1660");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKECONOMICA, "CK ECONOMICA");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKECONOMICA, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKECONOMICA, MyGlb.VIS_CHECKSTYLE);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKECONOMICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORE, "7BD9D7E3-D8A2-42B2-B479-03A707B2F762");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORE, "Fattore");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORE, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORDESCRI, "633F192C-EC2C-42EB-810E-B73D4D96D6A4");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORDESCRI, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRO, "BE01E33C-E23A-4555-ABA1-FC9EC75E0564");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRO, "Centro");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRO, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRIDESCRI, "BD7765C8-6D15-4F2E-B8E7-0963DE615288");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRIDESCRI, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRIDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPDAL, "5B44949A-2171-4A6D-8E7C-77D300A2F4AA");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPDAL, "Competenza dal");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPDAL, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPAL, "7F0A03C9-3B33-4FC2-B181-795479840F68");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPAL, "al");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPAL, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPAL, MyGlb.VIS_NORMALFIELDS);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CONFERMLABEL, "EA33CCE5-66BF-4A0E-8B26-C8FDBFBBE407");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CONFERMLABEL, "Conferma");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CONFERMLABEL, MyGlb.VIS_STATICBUTTON);
    PAN_VALCOMORDLIQ.SetImage(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CONFERMLABEL, 0, "button1.gif", false);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CONFERMLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_VOCEECON, "08EB60C0-86A2-4753-B695-BFFC51F91823");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_VOCEECON, "VOCE ECON");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_VOCEECON, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_VOCEECON, MyGlb.VIS_NORMFIELPADR);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_VOCEECON, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEGESTIO, "3DC36E16-F432-4D99-A4A8-2A38470DDFF8");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEGESTIO, "CODICE GESTIONALE");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEGESTIO, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEGESTIO, MyGlb.VIS_NORMFIELPADR);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEGESTIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FINANZIAMENT, "83397FAC-9742-44B5-BD0C-4213E7D00788");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FINANZIAMENT, "FINANZIAMENTO");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FINANZIAMENT, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FINANZIAMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FINANZIAMENT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_OPERA, "A2AD37FC-95D0-4463-942F-558EFDA0AB08");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_OPERA, "OPERA");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_OPERA, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_OPERA, MyGlb.VIS_NORMFIELPADR);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_OPERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SESUBIMPEGNO, "2AAC21FE-930B-4CB7-8C39-CEAD6E6B08D9");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SESUBIMPEGNO, "SE SUBIMPEGNO");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SESUBIMPEGNO, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SESUBIMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SESUBIMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_PROGUNITORGA, "783A8A4F-2889-4ED5-8BDC-769ECD3DF50A");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_PROGUNITORGA, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_PROGUNITORGA, MyGlb.VIS_NORMFIELPADR);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_PROGUNITORGA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BENEFICIARIO, "08F6A25A-B7F8-4AB8-A025-8529E72BEFCA");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BENEFICIARIO, "BENEFICIARIO");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BENEFICIARIO, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BENEFICIARIO, MyGlb.VIS_NORMFIELPADR);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BENEFICIARIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VALCOMORDLIQ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMQUIETANZA, "E3D647E6-A469-4301-A0F3-4FBF5B4EAA18");
    PAN_VALCOMORDLIQ.set_Header(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMQUIETANZA, "NUM QUIETANZA");
    PAN_VALCOMORDLIQ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMQUIETANZA, "");
    PAN_VALCOMORDLIQ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMQUIETANZA, MyGlb.VIS_NORMFIELPADR);
    PAN_VALCOMORDLIQ.SetFlags(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMQUIETANZA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VALCOMORDLIQ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INTESTALABEL, MyGlb.PANEL_LIST, 80, 8, 484, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INTESTALABEL, MyGlb.PANEL_LIST, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INTESTALABEL, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INTESTALABEL, MyGlb.PANEL_FORM, 4, 8, 848, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INTESTALABEL, MyGlb.PANEL_FORM, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INTESTALABEL, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_INTESTALABEL, -1, -1);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_INTESTALABEL, -1, "", "INTESTALABEL", 0, 0, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDELIBERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDELIBERA, MyGlb.PANEL_LIST, 72);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDELIBERA, MyGlb.PANEL_LIST, "CK DEL.");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDELIBERA, MyGlb.PANEL_FORM, 8, 64, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDELIBERA, MyGlb.PANEL_FORM, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDELIBERA, MyGlb.PANEL_FORM, "CK DELIB.");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CKDELIBERA, -1, GRP_VALCOMORDLIQ_DELIBERA);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CKDELIBERA, PPQRY_PARAMETRI569, "A.VALOCOMCKDEL", "VALOCOMCKDEL", 5, 2, 0, -13997);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKDELIBERA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKDELIBERA, (new IDVariant()), "Null", "", "", -1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SEDEDEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SEDEDEL, MyGlb.PANEL_LIST, "SD. D.");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SEDEDEL, MyGlb.PANEL_FORM, 36, 64, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SEDEDEL, MyGlb.PANEL_FORM, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_SEDEDEL, -1, GRP_VALCOMORDLIQ_DELIBERA);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_SEDEDEL, PPQRY_PARAMETRI569, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TRATDELILABE, MyGlb.PANEL_LIST, 132, 64, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TRATDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TRATDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TRATDELILABE, MyGlb.PANEL_FORM, 84, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TRATDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TRATDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_TRATDELILABE, -1, GRP_VALCOMORDLIQ_DELIBERA);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_TRATDELILABE, -1, "", "TRATDELILABE", 0, 0, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMERODEL, MyGlb.PANEL_LIST, "NM. D.");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMERODEL, MyGlb.PANEL_FORM, 104, 64, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMERODEL, MyGlb.PANEL_FORM, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_NUMERODEL, -1, GRP_VALCOMORDLIQ_DELIBERA);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_NUMERODEL, PPQRY_PARAMETRI569, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNODEL, MyGlb.PANEL_LIST, "AN. D.");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNODEL, MyGlb.PANEL_FORM, 172, 64, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_ANNODEL, -1, GRP_VALCOMORDLIQ_DELIBERA);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_ANNODEL, PPQRY_PARAMETRI569, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BARRDELILABE, MyGlb.PANEL_LIST, 140, 72, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BARRDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BARRDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BARRDELILABE, MyGlb.PANEL_FORM, 152, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BARRDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BARRDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_BARRDELILABE, -1, GRP_VALCOMORDLIQ_DELIBERA);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_BARRDELILABE, -1, "", "BARRDELILABE", 0, 0, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELDELIFORM, MyGlb.PANEL_LIST, 292, 80, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELDELIFORM, MyGlb.PANEL_LIST, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELDELIFORM, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELDELIFORM, MyGlb.PANEL_FORM, 220, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELDELIFORM, MyGlb.PANEL_FORM, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELDELIFORM, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_SCELDELIFORM, -1, GRP_VALCOMORDLIQ_DELIBERA);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_SCELDELIFORM, -1, "", "SCELDELIFORM", 0, 0, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKCAPITOLO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKCAPITOLO, MyGlb.PANEL_LIST, 84);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKCAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKCAPITOLO, MyGlb.PANEL_LIST, "CK CAPITOLO");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKCAPITOLO, MyGlb.PANEL_FORM, 252, 64, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKCAPITOLO, MyGlb.PANEL_FORM, 84);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKCAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKCAPITOLO, MyGlb.PANEL_FORM, "CK CAPITOLO");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CKCAPITOLO, -1, GRP_VALCOMORDLIQ_CAPITOLO);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CKCAPITOLO, PPQRY_PARAMETRI569, "A.VALOCOMCKCAP", "VALOCOMCKCAP", 5, 2, 0, -13997);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKCAPITOLO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKCAPITOLO, (new IDVariant()), "Null", "", "", -1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CAPITOLO, MyGlb.PANEL_FORM, 276, 64, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CAPITOLO, -1, GRP_VALCOMORDLIQ_CAPITOLO);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CAPITOLO, PPQRY_PARAMETRI569, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ARTICOLO, MyGlb.PANEL_LIST, "/");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ARTICOLO, MyGlb.PANEL_FORM, 420, 64, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ARTICOLO, MyGlb.PANEL_FORM, 16);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ARTICOLO, MyGlb.PANEL_FORM, "/");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_ARTICOLO, -1, GRP_VALCOMORDLIQ_CAPITOLO);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_ARTICOLO, PPQRY_PARAMETRI569, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTACAPITO, MyGlb.PANEL_LIST, 308, 96, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTACAPITO, MyGlb.PANEL_LIST, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTACAPITO, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTACAPITO, MyGlb.PANEL_FORM, 484, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTACAPITO, MyGlb.PANEL_FORM, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTACAPITO, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_SCELTACAPITO, -1, GRP_VALCOMORDLIQ_CAPITOLO);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_SCELTACAPITO, -1, "", "SCELTACAPITO", 0, 0, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKIMPACC, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKIMPACC, MyGlb.PANEL_LIST, 72);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKIMPACC, MyGlb.PANEL_LIST, "CK IMP ACC");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKIMPACC, MyGlb.PANEL_FORM, 516, 64, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKIMPACC, MyGlb.PANEL_FORM, 72);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKIMPACC, MyGlb.PANEL_FORM, "CK IMP ACC");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CKIMPACC, -1, GRP_VALCOMORDLIQ_IMPACC);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CKIMPACC, PPQRY_PARAMETRI569, "A.VALCOMCKIMAC", "VALCOMCKIMAC", 5, 2, 0, -13997);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKIMPACC, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKIMPACC, (new IDVariant()), "Null", "", "", -1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROIMPACC, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROIMPACC, MyGlb.PANEL_LIST, 108);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROIMPACC, MyGlb.PANEL_LIST, "NUMERO IMP ACC");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROIMPACC, MyGlb.PANEL_FORM, 544, 64, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROIMPACC, MyGlb.PANEL_FORM, 108);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROIMPACC, MyGlb.PANEL_FORM, "NUMERO IMP ACC");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_NUMEROIMPACC, -1, GRP_VALCOMORDLIQ_IMPACC);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_NUMEROIMPACC, PPQRY_PARAMETRI569, "A.VALCOMNUIMAC", "VALCOMNUIMAC", 1, 5, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOIMPACC, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOIMPACC, MyGlb.PANEL_LIST, 88);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOIMPACC, MyGlb.PANEL_LIST, "/");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOIMPACC, MyGlb.PANEL_FORM, 596, 64, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOIMPACC, MyGlb.PANEL_FORM, 16);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOIMPACC, MyGlb.PANEL_FORM, "/");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_ANNOIMPACC, -1, GRP_VALCOMORDLIQ_IMPACC);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_ANNOIMPACC, PPQRY_PARAMETRI569, "A.VALCOMANIMAC", "VALCOMANIMAC", 1, 4, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTAIMPACC, MyGlb.PANEL_LIST, 316, 104, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTAIMPACC, MyGlb.PANEL_LIST, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTAIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTAIMPACC, MyGlb.PANEL_FORM, 660, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTAIMPACC, MyGlb.PANEL_FORM, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTAIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_SCELTAIMPACC, -1, GRP_VALCOMORDLIQ_IMPACC);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_SCELTAIMPACC, -1, "", "SCELTAIMPACC", 0, 0, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKSUBIMP, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKSUBIMP, MyGlb.PANEL_LIST, 72);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKSUBIMP, MyGlb.PANEL_LIST, "CK SUBIMP");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKSUBIMP, MyGlb.PANEL_FORM, 692, 64, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKSUBIMP, MyGlb.PANEL_FORM, 72);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKSUBIMP, MyGlb.PANEL_FORM, "CK SUBIMP");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CKSUBIMP, -1, GRP_VALCOMORDLIQ_SUBIMPEGNO);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CKSUBIMP, PPQRY_PARAMETRI569, "A.VALOCOMCKSUB", "VALOCOMCKSUB", 5, 2, 0, -13997);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKSUBIMP, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKSUBIMP, (new IDVariant()), "Null", "", "", -1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROSUBIMP, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROSUBIMP, MyGlb.PANEL_LIST, 104);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUMERO SUBIMP");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROSUBIMP, MyGlb.PANEL_FORM, 716, 64, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROSUBIMP, MyGlb.PANEL_FORM, 104);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUMERO SUBIMP");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_NUMEROSUBIMP, -1, GRP_VALCOMORDLIQ_SUBIMPEGNO);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_NUMEROSUBIMP, PPQRY_PARAMETRI569, "A.VALCOMNUMSUB", "VALCOMNUMSUB", 1, 5, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOSUBIMP, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOSUBIMP, MyGlb.PANEL_LIST, 88);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOSUBIMP, MyGlb.PANEL_LIST, "/");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOSUBIMP, MyGlb.PANEL_FORM, 768, 64, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOSUBIMP, MyGlb.PANEL_FORM, 16);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ANNOSUBIMP, MyGlb.PANEL_FORM, "/");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_ANNOSUBIMP, -1, GRP_VALCOMORDLIQ_SUBIMPEGNO);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_ANNOSUBIMP, PPQRY_PARAMETRI569, "A.VALCOMANNSUB", "VALCOMANNSUB", 1, 4, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTASUBIMP, MyGlb.PANEL_LIST, 324, 112, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTASUBIMP, MyGlb.PANEL_LIST, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTASUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTASUBIMP, MyGlb.PANEL_FORM, 832, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTASUBIMP, MyGlb.PANEL_FORM, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCELTASUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_SCELTASUBIMP, -1, GRP_VALCOMORDLIQ_SUBIMPEGNO);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_SCELTASUBIMP, -1, "", "SCELTASUBIMP", 0, 0, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDESCRIZION, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDESCRIZION, MyGlb.PANEL_LIST, 92);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDESCRIZION, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDESCRIZION, MyGlb.PANEL_LIST, "CK DSC.");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDESCRIZION, MyGlb.PANEL_FORM, 8, 116, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDESCRIZION, MyGlb.PANEL_FORM, 104);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDESCRIZION, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKDESCRIZION, MyGlb.PANEL_FORM, "CK DESCRIZIONE");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CKDESCRIZION, -1, GRP_VALCOMORDLIQ_DESCRIZIONE);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CKDESCRIZION, PPQRY_PARAMETRI569, "A.VALOCOMCKDES", "VALOCOMCKDES", 5, 2, 0, -13997);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKDESCRIZION, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKDESCRIZION, (new IDVariant()), "Null", "", "", -1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DESCRIZIONE, MyGlb.PANEL_LIST, 4, 576, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DESCRIZIONE, MyGlb.PANEL_LIST, 104);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DESCRIZIONE, MyGlb.PANEL_FORM, 32, 116, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_DESCRIZIONE, -1, GRP_VALCOMORDLIQ_DESCRIZIONE);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_DESCRIZIONE, PPQRY_PARAMETRI569, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTIPOVINCOL, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTIPOVINCOL, MyGlb.PANEL_LIST, 96);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTIPOVINCOL, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTIPOVINCOL, MyGlb.PANEL_LIST, "C. T. V.");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTIPOVINCOL, MyGlb.PANEL_FORM, 392, 116, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTIPOVINCOL, MyGlb.PANEL_FORM, 84);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTIPOVINCOL, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTIPOVINCOL, MyGlb.PANEL_FORM, "CK TP. VINC.");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CKTIPOVINCOL, -1, GRP_VALCOMORDLIQ_TIPOVINCOLO);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CKTIPOVINCOL, PPQRY_PARAMETRI569, "A.VALCOMCKTIVI", "VALCOMCKTIVI", 5, 2, 0, -13997);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKTIPOVINCOL, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKTIPOVINCOL, (new IDVariant()), "Null", "", "", -1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TIPOVINCOLO, MyGlb.PANEL_LIST, 80);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TIPOVINCOLO, MyGlb.PANEL_LIST, "T. VN.");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TIPOVINCOLO, MyGlb.PANEL_FORM, 416, 116, 432, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TIPOVINCOLO, MyGlb.PANEL_FORM, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_TIPOVINCOLO, MyGlb.PANEL_FORM, "TP. VINC.");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_TIPOVINCOLO, -1, GRP_VALCOMORDLIQ_TIPOVINCOLO);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_TIPOVINCOLO, PPQRY_PARAMETRI569, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKMANDAINFOR, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKMANDAINFOR, MyGlb.PANEL_LIST, 152);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKMANDAINFOR, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKMANDAINFOR, MyGlb.PANEL_LIST, "C. M. I.");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKMANDAINFOR, MyGlb.PANEL_FORM, 8, 168, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKMANDAINFOR, MyGlb.PANEL_FORM, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKMANDAINFOR, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKMANDAINFOR, MyGlb.PANEL_FORM, "C. MN. INF.");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CKMANDAINFOR, -1, GRP_VALCOMORDLIQ_MANDATINFORM);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CKMANDAINFOR, PPQRY_PARAMETRI569, "A.VALCOMCKMAIN", "VALCOMCKMAIN", 5, 2, 0, -13997);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKMANDAINFOR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKMANDAINFOR, (new IDVariant()), "Null", "", "", -1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, MyGlb.PANEL_FORM, 52, 168, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, MyGlb.PANEL_FORM, 44);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_SPESE, -1, GRP_VALCOMORDLIQ_MANDATINFORM);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_SPESE, PPQRY_PARAMETRI569, "A.SPESE", "SPESE", 1, 1, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, MyGlb.PANEL_LIST, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, MyGlb.PANEL_FORM, 32, 192, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, MyGlb.PANEL_FORM, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_SCADENZA, -1, GRP_VALCOMORDLIQ_MANDATINFORM);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_SCADENZA, PPQRY_PARAMETRI569, "A.SCADENZA", "SCADENZA", 8, 19, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, MyGlb.PANEL_LIST, 80);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, MyGlb.PANEL_LIST, "Commissioni");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, MyGlb.PANEL_FORM, 184, 192, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, MyGlb.PANEL_FORM, 80);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_COMMISSIONI, -1, GRP_VALCOMORDLIQ_MANDATINFORM);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_COMMISSIONI, PPQRY_PARAMETRI569, "A.COMMISSIONI", "COMMISSIONI", 1, 1, 0, -13997);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, MyGlb.PANEL_LIST, 4, 600, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, MyGlb.PANEL_LIST, 104);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, MyGlb.PANEL_LIST, 2);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, MyGlb.PANEL_FORM, 44, 216, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, MyGlb.PANEL_FORM, 52);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_ALLEGATI, -1, GRP_VALCOMORDLIQ_MANDATINFORM);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_ALLEGATI, PPQRY_PARAMETRI569, "A.ALLEGATI", "ALLEGATI", 5, 150, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, MyGlb.PANEL_LIST, 4, 624, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, MyGlb.PANEL_LIST, 104);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, MyGlb.PANEL_LIST, 2);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, MyGlb.PANEL_FORM, 8, 240, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, MyGlb.PANEL_FORM, 88);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_INFOTESORIER, -1, GRP_VALCOMORDLIQ_MANDATINFORM);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_INFOTESORIER, PPQRY_PARAMETRI569, "A.INFO_TESORIERE", "INFO_TESORIERE", 5, 200, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF1, MyGlb.PANEL_LIST, 656, 268, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF1, MyGlb.PANEL_LIST, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF1, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF1, MyGlb.PANEL_FORM, 644, 168, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF1, MyGlb.PANEL_FORM, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF1, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_ETICHETTASF1, -1, GRP_VALCOMORDLIQ_CODITRANELEM);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_ETICHETTASF1, -1, "", "ETICHETTASF1", 0, 0, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTRANS, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTRANS, MyGlb.PANEL_LIST, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTRANS, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTRANS, MyGlb.PANEL_LIST, "CK TRANS");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTRANS, MyGlb.PANEL_FORM, 392, 168, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTRANS, MyGlb.PANEL_FORM, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTRANS, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKTRANS, MyGlb.PANEL_FORM, "CK TRANS");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CKTRANS, -1, GRP_VALCOMORDLIQ_CODITRANELEM);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CKTRANS, PPQRY_PARAMETRI569, "A.VALOCOMCKTRA", "VALOCOMCKTRA", 5, 2, 0, -13997);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKTRANS, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKTRANS, (new IDVariant()), "Null", "", "", -1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODLIVELLO5, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODLIVELLO5, MyGlb.PANEL_LIST, "Cod. V livello");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODLIVELLO5, MyGlb.PANEL_FORM, 412, 172, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODLIVELLO5, MyGlb.PANEL_FORM, 80);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODLIVELLO5, MyGlb.PANEL_FORM, "Cod. V livello");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CODLIVELLO5, -1, GRP_VALCOMORDLIQ_CODITRANELEM);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CODLIVELLO5, PPQRY_PARAMETRI569, "A.COD_LIVELLO_5", "COD_LIVELLO_5", 3, 10, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCVLIV, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCVLIV, MyGlb.PANEL_LIST, 108);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCVLIV, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCVLIV, MyGlb.PANEL_LIST, "DUAL Descr VLiv");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCVLIV, MyGlb.PANEL_FORM, 584, 172, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCVLIV, MyGlb.PANEL_FORM, 108);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCVLIV, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCVLIV, MyGlb.PANEL_FORM, "DUAL Descr VLiv");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_DUALDESCVLIV, -1, GRP_VALCOMORDLIQ_CODITRANELEM);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_DUALDESCVLIV, PPQRY_DUAL, "GET_DESCR_COD_5_LIVELLO(~~COD_LIVELLO_5~~,DECODE(~~TBL_VALCOMORDLIQ.VALCOMORDLIQ~~, 'LIQ', 'S', 'E'),~~TBL_DATISESSIONE.SESSIOESERCI~~)", "DESCRVLIVU", 5, 99, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, MyGlb.PANEL_LIST, 92);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, MyGlb.PANEL_LIST, "Cod. Cofog");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, MyGlb.PANEL_FORM, 424, 196, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, MyGlb.PANEL_FORM, 68);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICECOFOG, MyGlb.PANEL_FORM, "Cod. Cofog");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CODICECOFOG, -1, GRP_VALCOMORDLIQ_CODITRANELEM);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CODICECOFOG, PPQRY_PARAMETRI569, "A.CODICE_COFOG", "CODICE_COFOG", 1, 3, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEEUROPE, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod. Europeo");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEEUROPE, MyGlb.PANEL_FORM, 412, 220, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEEUROPE, MyGlb.PANEL_FORM, 80);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CODICEEUROPE, -1, GRP_VALCOMORDLIQ_CODITRANELEM);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CODICEEUROPE, PPQRY_PARAMETRI569, "A.CODICE_EUROPEO", "CODICE_EUROPEO", 1, 1, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, MyGlb.PANEL_LIST, 116);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, MyGlb.PANEL_LIST, "DUAL Descr COFOG");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, MyGlb.PANEL_FORM, 584, 196, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, MyGlb.PANEL_FORM, 116);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_DUALDESCCOFO, MyGlb.PANEL_FORM, "DUAL Descr COFOG");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_DUALDESCCOFO, -1, GRP_VALCOMORDLIQ_CODITRANELEM);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_DUALDESCCOFO, PPQRY_DUAL, "GET_DESCR_COD_COFOG(~~CODICE_COFOG~~,~~TBL_DATISESSIONE.SESSIOESERCI~~,DECODE(~~TBL_VALCOMORDLIQ.VALCOMORDLIQ~~, 'LIQ', 'S', 'E'))", "DESCRCOFOG", 5, 99, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF, MyGlb.PANEL_LIST, 648, 260, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF, MyGlb.PANEL_LIST, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF, MyGlb.PANEL_FORM, 640, 248, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF, MyGlb.PANEL_FORM, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_ETICHETTASF, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_ETICHETTASF, -1, GRP_VALCOMORDLIQ_CODITRANELEM);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_ETICHETTASF, -1, "", "ETICHETTASF", 0, 0, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKECONOMICA, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKECONOMICA, MyGlb.PANEL_LIST, 92);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKECONOMICA, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKECONOMICA, MyGlb.PANEL_LIST, "CK ECONOMICA");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKECONOMICA, MyGlb.PANEL_FORM, 8, 292, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKECONOMICA, MyGlb.PANEL_FORM, 92);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKECONOMICA, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CKECONOMICA, MyGlb.PANEL_FORM, "CK ECONOMICA");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CKECONOMICA, -1, GRP_VALCOMORDLIQ_ECONOMICA);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CKECONOMICA, PPQRY_PARAMETRI569, "A.VALOCOMCKECO", "VALOCOMCKECO", 5, 2, 0, -13997);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKECONOMICA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_CKECONOMICA, (new IDVariant()), "Null", "", "", -1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORE, MyGlb.PANEL_LIST, 60);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORE, MyGlb.PANEL_FORM, 8, 316, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORE, MyGlb.PANEL_FORM, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_FATTORE, -1, GRP_VALCOMORDLIQ_ECONOMICA);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_FATTORE, PPQRY_PARAMETRI569, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORDESCRI, MyGlb.PANEL_LIST, 136);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORDESCRI, MyGlb.PANEL_FORM, 216, 316, 632, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORDESCRI, MyGlb.PANEL_FORM, 136);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FATTORDESCRI, MyGlb.PANEL_FORM, "FATTORI DESCRIZIONE");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_FATTORDESCRI, -1, GRP_VALCOMORDLIQ_ECONOMICA);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRO, MyGlb.PANEL_FORM, 8, 340, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRO, MyGlb.PANEL_FORM, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CENTRO, -1, GRP_VALCOMORDLIQ_ECONOMICA);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CENTRO, PPQRY_PARAMETRI569, "A.CENTRO", "CENTRO", 5, 16, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRIDESCRI, MyGlb.PANEL_LIST, 128);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRIDESCRI, MyGlb.PANEL_FORM, 216, 340, 632, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRIDESCRI, MyGlb.PANEL_FORM, 128);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENTRI DESCRIZIONE");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CENTRIDESCRI, -1, GRP_VALCOMORDLIQ_ECONOMICA);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "CENTRIDESCRI", 5, 200, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPDAL, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPDAL, MyGlb.PANEL_LIST, 68);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPDAL, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPDAL, MyGlb.PANEL_LIST, "Comp. dal");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPDAL, MyGlb.PANEL_FORM, 8, 364, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPDAL, MyGlb.PANEL_FORM, 64);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPDAL, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPDAL, MyGlb.PANEL_FORM, "Comp. dal");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_COMPDAL, -1, GRP_VALCOMORDLIQ_ECONOMICA);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_COMPDAL, PPQRY_PARAMETRI569, "A.COMP_DAL", "COMP_DAL", 6, 10, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPAL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPAL, MyGlb.PANEL_LIST, 60);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPAL, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPAL, MyGlb.PANEL_LIST, "al");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPAL, MyGlb.PANEL_FORM, 184, 364, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPAL, MyGlb.PANEL_FORM, 28);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPAL, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_COMPAL, MyGlb.PANEL_FORM, "al");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_COMPAL, -1, GRP_VALCOMORDLIQ_ECONOMICA);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_COMPAL, PPQRY_PARAMETRI569, "A.COMP_AL", "COMP_AL", 6, 10, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CONFERMLABEL, MyGlb.PANEL_LIST, 552, 336, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CONFERMLABEL, MyGlb.PANEL_LIST, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CONFERMLABEL, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CONFERMLABEL, MyGlb.PANEL_FORM, 768, 416, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CONFERMLABEL, MyGlb.PANEL_FORM, 0);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CONFERMLABEL, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CONFERMLABEL, -1, -1);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CONFERMLABEL, -1, "", "CONFERMLABEL", 0, 0, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_VOCEECON, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_VOCEECON, MyGlb.PANEL_LIST, 68);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_VOCEECON, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_VOCEECON, MyGlb.PANEL_LIST, "VOCE ECON");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_VOCEECON, MyGlb.PANEL_FORM, 4, 452, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_VOCEECON, MyGlb.PANEL_FORM, 68);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_VOCEECON, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_VOCEECON, MyGlb.PANEL_FORM, "VOCE ECON");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_VOCEECON, -1, -1);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_VOCEECON, PPQRY_PARAMETRI569, "A.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEGESTIO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEGESTIO, MyGlb.PANEL_LIST, 120);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEGESTIO, MyGlb.PANEL_LIST, "CODICE GESTIONALE");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEGESTIO, MyGlb.PANEL_FORM, 4, 476, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEGESTIO, MyGlb.PANEL_FORM, 120);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_CODICEGESTIO, MyGlb.PANEL_FORM, "CODICE GESTIONALE");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_CODICEGESTIO, -1, -1);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_CODICEGESTIO, PPQRY_PARAMETRI569, "A.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FINANZIAMENT, MyGlb.PANEL_LIST, "FINANZIAMENTO");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 524, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_FINANZIAMENT, MyGlb.PANEL_FORM, "FINANZIAMENTO");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_FINANZIAMENT, -1, -1);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_FINANZIAMENT, PPQRY_PARAMETRI569, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_OPERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_OPERA, MyGlb.PANEL_LIST, 48);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_OPERA, MyGlb.PANEL_LIST, "OPERA");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_OPERA, MyGlb.PANEL_FORM, 4, 548, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_OPERA, MyGlb.PANEL_FORM, 48);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_OPERA, MyGlb.PANEL_FORM, "OPERA");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_OPERA, -1, -1);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_OPERA, PPQRY_PARAMETRI569, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SESUBIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SESUBIMPEGNO, MyGlb.PANEL_LIST, 100);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SESUBIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SESUBIMPEGNO, MyGlb.PANEL_LIST, "SE SUBIMPEGNO");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SESUBIMPEGNO, MyGlb.PANEL_FORM, 4, 572, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SESUBIMPEGNO, MyGlb.PANEL_FORM, 100);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SESUBIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_SESUBIMPEGNO, MyGlb.PANEL_FORM, "SE SUBIMPEGNO");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_SESUBIMPEGNO, -1, -1);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_SESUBIMPEGNO, PPQRY_PARAMETRI569, "A.SE_SUBIMPEGNO", "SE_SUBIMPEGNO", 5, 2, 0, -13997);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_SESUBIMPEGNO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALCOMORDLIQ.SetValueListItem(PFL_VALCOMORDLIQ_SESUBIMPEGNO, (new IDVariant()), "Null", "", "", -1);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_PROGUNITORGA, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 452, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_PROGUNITORGA, MyGlb.PANEL_FORM, 184);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_PROGUNITORGA, MyGlb.PANEL_FORM, "PROGR UNITA ORGANIZZATIVA");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_PROGUNITORGA, -1, -1);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_PROGUNITORGA, PPQRY_PARAMETRI569, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BENEFICIARIO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BENEFICIARIO, MyGlb.PANEL_LIST, 88);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BENEFICIARIO, MyGlb.PANEL_LIST, "BENEFICIARIO");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 452, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BENEFICIARIO, MyGlb.PANEL_FORM, 88);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_BENEFICIARIO, MyGlb.PANEL_FORM, "BENEFICIARIO");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_BENEFICIARIO, -1, -1);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_BENEFICIARIO, PPQRY_PARAMETRI569, "A.BENEFICIARIO", "BENEFICIARIO", 2, 15, 0, -13997);
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMQUIETANZA, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMQUIETANZA, MyGlb.PANEL_LIST, 100);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMQUIETANZA, MyGlb.PANEL_LIST, "NUM QUIETANZA");
    PAN_VALCOMORDLIQ.SetRect(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMQUIETANZA, MyGlb.PANEL_FORM, 4, 476, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALCOMORDLIQ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMQUIETANZA, MyGlb.PANEL_FORM, 100);
    PAN_VALCOMORDLIQ.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_VALCOMORDLIQ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALCOMORDLIQ_NUMQUIETANZA, MyGlb.PANEL_FORM, "NUM QUIETANZA");
    PAN_VALCOMORDLIQ.SetFieldPage(PFL_VALCOMORDLIQ_NUMQUIETANZA, -1, -1);
    PAN_VALCOMORDLIQ.SetFieldPanel(PFL_VALCOMORDLIQ_NUMQUIETANZA, PPQRY_PARAMETRI569, "A.NUM_QUIETANZA", "NUM_QUIETANZA", 1, 2, 0, -13997);
  }

  private void PAN_VALCOMORDLIQ_InitQueries()
  {
    StringBuffer SQL;

    PAN_VALCOMORDLIQ.SetSize(MyGlb.OBJ_QUERY, 7);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE~~) ");
    SQL.append("and   (NVL(A.DATA_VALIDITA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
    PAN_VALCOMORDLIQ.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_VALCOMORDLIQ.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VALCOMORDLIQ.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CENTRIDESCRI ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~CENTRO~~) ");
    SQL.append("and   (NVL(A.DATA_VALIDITA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
    PAN_VALCOMORDLIQ.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_VALCOMORDLIQ.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VALCOMORDLIQ.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  GET_DESCR_COD_5_LIVELLO(~~COD_LIVELLO_5~~,DECODE(~~TBL_VALCOMORDLIQ.VALCOMORDLIQ~~, 'LIQ', 'S', 'E'),~~TBL_DATISESSIONE.SESSIOESERCI~~) as DESCRVLIVU, ");
    SQL.append("  GET_DESCR_COD_COFOG(~~CODICE_COFOG~~,~~TBL_DATISESSIONE.SESSIOESERCI~~,DECODE(~~TBL_VALCOMORDLIQ.VALCOMORDLIQ~~, 'LIQ', 'S', 'E')) as DESCRCOFOG ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VALCOMORDLIQ.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_VALCOMORDLIQ.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VALCOMORDLIQ.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~TIPO_VINCOLO~~) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALCOMORDLIQ.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_VALCOMORDLIQ_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALCOMORDLIQ.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_VALCOMORDLIQ_TIPOVINCOLO, "");
    PAN_VALCOMORDLIQ.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~SPESE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALCOMORDLIQ.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_VALCOMORDLIQ_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALCOMORDLIQ.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_VALCOMORDLIQ_SPESE, "");
    PAN_VALCOMORDLIQ.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODTRAEURCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  COD_TRANSAZIONI_EUROPEE A ");
    SQL.append("where (A.CODICE = ~~CODICE_EUROPEO~~) ");
    SQL.append("and   (A.E_S = DECODE(~~TBL_VALCOMORDLIQ.VALCOMORDLIQ~~, 'LIQ', 'S', 'E')) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALCOMORDLIQ.SetQuery(PPQRY_CODTRANSEURO, 0, SQL, PFL_VALCOMORDLIQ_CODICEEUROPE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODTRAEURCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  COD_TRANSAZIONI_EUROPEE A ");
    SQL.append("where (A.E_S = DECODE(~~TBL_VALCOMORDLIQ.VALCOMORDLIQ~~, 'LIQ', 'S', 'E')) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALCOMORDLIQ.SetQuery(PPQRY_CODTRANSEURO, 1, SQL, PFL_VALCOMORDLIQ_CODICEEUROPE, "");
    PAN_VALCOMORDLIQ.SetQueryDB(PPQRY_CODTRANSEURO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VALCOMORDLIQ.SetIMDB(IMDB, "PQRY_PARAMETRI569", true);
    PAN_VALCOMORDLIQ.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_VALCOMORDLIQ.SetQueryIMDB(PPQRY_PARAMETRI569, IMDBDef14.PQRY_PARAMETRI569_RS, IMDBDef5.TBL_VALCOMORDLIQ);
    JustLoaded = true;
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CKDELIBERA, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKDEL);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_SEDEDEL, IMDBDef5.FLD_VALCOMORDLIQ_SEDE_DEL);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_NUMERODEL, IMDBDef5.FLD_VALCOMORDLIQ_NUMERO_DEL);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_ANNODEL, IMDBDef5.FLD_VALCOMORDLIQ_ANNO_DEL);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CKCAPITOLO, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKCAP);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CAPITOLO, IMDBDef5.FLD_VALCOMORDLIQ_CAPITOLO);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_ARTICOLO, IMDBDef5.FLD_VALCOMORDLIQ_ARTICOLO);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CKIMPACC, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKIMAC);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_NUMEROIMPACC, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMNUIMAC);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_ANNOIMPACC, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMANIMAC);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CKSUBIMP, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKSUB);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_NUMEROSUBIMP, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMNUMSUB);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_ANNOSUBIMP, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMANNSUB);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CKDESCRIZION, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKDES);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_DESCRIZIONE, IMDBDef5.FLD_VALCOMORDLIQ_DESCRIZIONE);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CKTIPOVINCOL, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKTIVI);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_TIPOVINCOLO, IMDBDef5.FLD_VALCOMORDLIQ_TIPO_VINCOLO);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CKMANDAINFOR, IMDBDef5.FLD_VALCOMORDLIQ_VALCOMCKMAIN);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_SPESE, IMDBDef5.FLD_VALCOMORDLIQ_SPESE);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_SCADENZA, IMDBDef5.FLD_VALCOMORDLIQ_SCADENZA);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_COMMISSIONI, IMDBDef5.FLD_VALCOMORDLIQ_COMMISSIONI);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_ALLEGATI, IMDBDef5.FLD_VALCOMORDLIQ_ALLEGATI);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_INFOTESORIER, IMDBDef5.FLD_VALCOMORDLIQ_INFO_TESORIERE);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CKTRANS, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKTRA);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CODLIVELLO5, IMDBDef5.FLD_VALCOMORDLIQ_COD_LIVELLO_5);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CODICECOFOG, IMDBDef5.FLD_VALCOMORDLIQ_CODICE_COFOG);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CODICEEUROPE, IMDBDef5.FLD_VALCOMORDLIQ_CODICE_EUROPEO);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CKECONOMICA, IMDBDef5.FLD_VALCOMORDLIQ_VALOCOMCKECO);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_FATTORE, IMDBDef5.FLD_VALCOMORDLIQ_FATTORE);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CENTRO, IMDBDef5.FLD_VALCOMORDLIQ_CENTRO);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_COMPDAL, IMDBDef5.FLD_VALCOMORDLIQ_COMP_DAL);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_COMPAL, IMDBDef5.FLD_VALCOMORDLIQ_COMP_AL);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_VOCEECON, IMDBDef5.FLD_VALCOMORDLIQ_VOCE_ECON);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_CODICEGESTIO, IMDBDef5.FLD_VALCOMORDLIQ_CODICE_GESTIONALE);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_FINANZIAMENT, IMDBDef5.FLD_VALCOMORDLIQ_FINANZIAMENTO);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_OPERA, IMDBDef5.FLD_VALCOMORDLIQ_OPERA);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_SESUBIMPEGNO, IMDBDef5.FLD_VALCOMORDLIQ_SE_SUBIMPEGNO);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_PROGUNITORGA, IMDBDef5.FLD_VALCOMORDLIQ_PROGR_UNITA_ORGANIZZATIVA);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_BENEFICIARIO, IMDBDef5.FLD_VALCOMORDLIQ_BENEFICIARIO);
    PAN_VALCOMORDLIQ.SetFieldPrimaryIndex(PFL_VALCOMORDLIQ_NUMQUIETANZA, IMDBDef5.FLD_VALCOMORDLIQ_NUM_QUIETANZA);
    PAN_VALCOMORDLIQ.SetMasterTable(0, "VALCOMORDLIQ");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VALCOMORDLIQ.Status() == 2)
    {
      int oldListQBE = PAN_VALCOMORDLIQ.iUseListQBE;
      PAN_VALCOMORDLIQ.iUseListQBE = 0;
      PAN_VALCOMORDLIQ.PanelCommand(Glb.PCM_SEARCH);
      PAN_VALCOMORDLIQ.PanelCommand(Glb.PCM_FIND);
      PAN_VALCOMORDLIQ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VALCOMORDLIQ) PAN_VALCOMORDLIQ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VALCOMORDLIQ) PAN_VALCOMORDLIQ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VALCOMORDLIQ) PAN_VALCOMORDLIQ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VALCOMORDLIQ) PAN_VALCOMORDLIQ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VALCOMORDLIQ) PAN_VALCOMORDLIQ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
