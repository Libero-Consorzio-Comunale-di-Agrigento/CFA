// **********************************************
// Emissione Liquidazioni Da Distinta
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneLiquidazioniDaDistinta extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_PROVVEDIMENT = 0;

  private static int PFL_PARAMETRI_LABELGRUPPO = 0;
  private static int PFL_PARAMETRI_DISTINTAN = 1;
  private static int PFL_PARAMETRI_DEL = 2;
  private static int PFL_PARAMETRI_SOLOCONTDISP = 3;
  private static int PFL_PARAMETRI_DELIBERLABEL = 4;
  private static int PFL_PARAMETRI_SEDEDEL = 5;
  private static int PFL_PARAMETRI_TRATDELILABE = 6;
  private static int PFL_PARAMETRI_NUMERODEL = 7;
  private static int PFL_PARAMETRI_BARRDELILABE = 8;
  private static int PFL_PARAMETRI_ANNODEL = 9;
  private static int PFL_PARAMETRI_SCEGDELILABE = 10;
  private static int PFL_PARAMETRI_INFODELILABE = 11;
  private static int PFL_PARAMETRI_LABEGRUPDELI = 12;
  private static int PFL_PARAMETRI_DESCDADETUTE = 13;
  private static int PFL_PARAMETRI_DESCRIZIONE = 14;
  private static int PFL_PARAMETRI_UFFICIO = 15;
  private static int PFL_PARAMETRI_CAUSALE = 16;
  private static int PFL_PARAMETRI_BOLLO = 17;
  private static int PFL_PARAMETRI_INEMISSIONE = 18;
  private static int PFL_PARAMETRI_NUMCONTABILE = 19;
  private static int PFL_PARAMETRI_DATACONTABIL = 20;
  private static int PFL_PARAMETRI_COMPETENZDAL = 21;
  private static int PFL_PARAMETRI_AL = 22;
  private static int PFL_PARAMETRI_SPESE = 23;
  private static int PFL_PARAMETRI_SCADENZA = 24;
  private static int PFL_PARAMETRI_ALLEGATI = 25;
  private static int PFL_PARAMETRI_ESCLUSIONCIG = 26;
  private static int PFL_PARAMETRI_ELABORALABEL = 27;
  private static int PFL_PARAMETRI_UNITAPROPONE = 28;
  private static int PFL_PARAMETRI_NUMEROPROPOS = 29;
  private static int PFL_PARAMETRI_ANNOPROPOSTA = 30;
  private static int PFL_PARAMETRI_LABEL = 31;
  private static int PFL_PARAMETRI_ALL = 32;
  private static int PFL_PARAMETRI_ETICHETITOLO = 33;
  private static int PFL_PARAMETRI_DISTINTAANNO = 34;

  private static int PPQRY_PARAMETRI294 = 0;

  private static int PPQRY_T53 = 1;
  private static int PPQRY_T58 = 2;
  private static int PPQRY_T60 = 3;
  private static int PPQRY_TIPISPESMINF = 4;
  private static int PPQRY_ATTRIBUTIOPI = 5;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables
  private IDVariant SPESADAPROPO = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant LICENZAMIF = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI408(IMDB);
    //
    //
    Init_PQRY_PARAMETRI294(IMDB);
    Init_PQRY_PARAMETRI294_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI408(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI408, 32);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI408, "TBL_PARAMETRI408");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARANUMEDIST, "PARANUMEDIST");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARANUMEDIST,1,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAANNODIST, "PARAANNODIST");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAANNODIST,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARADATACONT, "PARADATACONT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARADATACONT,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMSCADENZ, "PARAMSCADENZ");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMSCADENZ,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMCOMPDAL, "PARAMCOMPDAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMCOMPDAL,6,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMCOMPAL, "PARAMCOMPAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMCOMPAL,6,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMNUMCONT, "PARAMNUMCONT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMNUMCONT,5,52,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARDESDADEUT, "PARDESDADEUT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARDESDADEUT,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARADISTANNO, "PARADISTANNO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARADISTANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMDISTINN, "PARAMDISTINN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMDISTINN,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMDEL, "PARAMDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMDEL,6,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARSOLCONDIS, "PARSOLCONDIS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARSOLCONDIS,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMUTENZA, "PARAMUTENZA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMUTENZA,5,52,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMBENEFIC, "PARAMBENEFIC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMBENEFIC,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMQUIETAN, "PARAMQUIETAN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMQUIETAN,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PAROLDNUMDIS, "PAROLDNUMDIS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PAROLDNUMDIS,1,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PAROLDANNDIS, "PAROLDANNDIS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PAROLDANNDIS,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARADESCUTEN, "PARADESCUTEN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARADESCUTEN,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMESCLCIG, "PARAMESCLCIG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI408,IMDBDef2.FLD_PARAMETRI408_PARAMESCLCIG,5,50,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI408, 0);
  }

  private static void Init_PQRY_PARAMETRI294(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI294, 24);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI294, "PQRY_PARAMETRI294");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARADATACONT, "PARADATACONT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARADATACONT,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMSCADENZ, "PARAMSCADENZ");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMSCADENZ,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMCOMPDAL, "PARAMCOMPDAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMCOMPDAL,6,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMCOMPAL, "PARAMCOMPAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMCOMPAL,6,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMNUMCONT, "PARAMNUMCONT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMNUMCONT,5,52,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARDESDADEUT, "PARDESDADEUT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARDESDADEUT,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMDISTINN, "PARAMDISTINN");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMDISTINN,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMDEL, "PARAMDEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMDEL,6,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARSOLCONDIS, "PARSOLCONDIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARSOLCONDIS,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARADISTANNO, "PARADISTANNO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARADISTANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMESCLCIG, "PARAMESCLCIG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294,IMDBDef10.PQSL_PARAMETRI294_PARAMESCLCIG,5,50,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI294, 0);
  }

  private static void Init_PQRY_PARAMETRI294_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI294_RS, 24);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI294_RS, "PQRY_PARAMETRI294_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARADATACONT, "PARADATACONT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARADATACONT,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMSCADENZ, "PARAMSCADENZ");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMSCADENZ,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMCOMPDAL, "PARAMCOMPDAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMCOMPDAL,6,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMCOMPAL, "PARAMCOMPAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMCOMPAL,6,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMNUMCONT, "PARAMNUMCONT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMNUMCONT,5,52,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARDESDADEUT, "PARDESDADEUT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARDESDADEUT,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMDISTINN, "PARAMDISTINN");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMDISTINN,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMDEL, "PARAMDEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMDEL,6,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARSOLCONDIS, "PARSOLCONDIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARSOLCONDIS,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARADISTANNO, "PARADISTANNO");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARADISTANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMESCLCIG, "PARAMESCLCIG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI294_RS,IMDBDef10.PQSL_PARAMETRI294_PARAMESCLCIG,5,50,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneLiquidazioniDaDistinta(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneLiquidazioniDaDistinta()
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
    FormIdx = MyGlb.FRM_EMISLIQDADIS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1E538620-D9AB-4B90-ACD4-6C2C4AF2715C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 656;
    DesignHeight = 478;
    set_Caption(new IDVariant("Emissione Liquidazioni Da Distinta"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 656;
    Frames[1].Height = 452;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 452;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 656-MyGlb.PAN_OFFS_X, 452-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "49923AF1-AE25-448B-A554-5EE6EC51C786");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1880, 256, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI408, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISLIQDADIS_PARAMETRI294();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
      if (IdxFieldActived ==PFL_PARAMETRI_SCEGDELILABE) {
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
    return (obj instanceof EmissioneLiquidazioniDaDistinta);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneLiquidazioniDaDistinta.class.getName() : (Glb.ClassWithPackage(EmissioneLiquidazioniDaDistinta.class) ? EmissioneLiquidazioniDaDistinta.class.getName().substring(EmissioneLiquidazioniDaDistinta.class.getPackage().getName().length() + 1) : EmissioneLiquidazioniDaDistinta.class.getName()));
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
    IDVariant v_PERS = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOTESOGGETTI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOTESOGGETTI = (new IDVariant("note_soggetti", IDVariant.STRING));
      v_CAPTION = (new IDVariant("Emissione Liquidazioni da Distinta", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      // v_PERS = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_NOTESOGGETTI);
      // LICENZAMIF = (new IDVariant(MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF")))));
      if (MainFrm.MODAIMPUSPES.compareTo((new IDVariant("LI")), true)!=0)
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_COMPETENZDAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      // 
      // Visibilità Mandato Informatico
      // 
      // {
        // if (MainFrm.LIQMO.equals((new IDVariant("SI")), true))
        // {
          // if (IDL.IsNull(MainFrm.SPESE_DA_SOGGETTO))
          // {
            // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            // IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_SPESE, 0, new IDVariant(SPESADAPROPO));
          // }
          // else
          // {
            // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          // }
          // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // }
        // else
        // {
          // if (LICENZAMIF.booleanValue() && MainFrm.GESTIONSPESE.equals((new IDVariant("SI")), true) && IDL.IsNull(MainFrm.SPESE_DA_SOGGETTO))
          // {
            // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            // IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_SPESE, 0, new IDVariant(SPESADAPROPO));
          // }
          // else
          // {
            // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          // }
          // if (LICENZAMIF.booleanValue() && MainFrm.GESTIOALLEGA.equals((new IDVariant("SI")), true))
          // {
            // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          // }
          // else
          // {
            // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          // }
          // if (LICENZAMIF.booleanValue())
          // {
            // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          // }
          // else
          // {
            // PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          // }
        // }
      // }
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARADISTANNO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PAROLDANNDIS, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_UFFICIO, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0),(new IDVariant(0))));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_CAUSALE, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_SPESE, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARSOLCONDIS, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMINEMISS, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARDESDADEUT, 0, (new IDVariant("NO")));
      IDVariant v_BOLLO = null;
      v_BOLLO = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.CODICE) as MINT60CODICE ");
      SQL.append("from ");
      SQL.append("  T60 A ");
      SQL.append("where (A.TIPO = 'F') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_BOLLO = QV.Get("MINT60CODICE", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_BOLLO, 0, new IDVariant(v_BOLLO));
      PAN_PARAMETRI.set_FieldText(PFL_PARAMETRI_ETICHETITOLO, IMDB.Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARADESCUTEN, 0).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniDaDistinta", "LoadEvent", _e);
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
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_ALLEGATI, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && !(Result.booleanValue()))
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniDaDistinta", "EndModalEvent", _e);
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
      UNLOADEVENT_PARADELEROWS();
      AutoSaveType = (new IDVariant("NONE")).stringValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniDaDistinta", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARANUMEDIST, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAANNODIST, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_SEDE_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_NUMERO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_ANNO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_UNITA_PROPONENTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_NUMERO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_ANNO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_DESCRIZIONE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_UFFICIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_CAUSALE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_BOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMINEMISS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARADATACONT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_SPESE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMSCADENZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_ALLEGATI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMCOMPDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMCOMPAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMNUMCONT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARDESDADEUT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARADISTANNO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMDISTINN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARSOLCONDIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMUTENZA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMBENEFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMQUIETAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PAROLDNUMDIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PAROLDANNDIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARADESCUTEN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMESCLCIG, 0, new IDVariant());
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
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ANNODEL)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_SEDEDEL)), true))
      {
        IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
        v_SEDEDEL = IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, 0);
        v_ANNODEL = IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL, 0);
        v_NUMERODEL = IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL, 0);
        MainFrm.ControlloDelibereUtenze(v_SEDEDEL, v_ANNODEL, v_NUMERODEL);
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, 0, new IDVariant(v_SEDEDEL));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL, 0, new IDVariant(v_NUMERODEL));
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL, 0, new IDVariant(v_ANNODEL));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, 0))))
        {
          IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniDaDistinta", "ParametriOnUpdatingRowEvent", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniDaDistinta", "ParametriOnDynamicProperties", _e);
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
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniDaDistinta", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Proposte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Proposte Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniDaDistinta", "SelezioneProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Centro
  // **********************************************************************
  public int SceltaCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Centro Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniDaDistinta", "SceltaCentro", _e);
      return -1;
    }
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
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ANNO_PROG as FATANNOPROG, ");
      SQL.append("  A.NUMERO_PROG as FATNUMERPROG ");
      SQL.append("from ");
      SQL.append("  FAT A ");
      SQL.append("where (A.NUMERO_DISTINTA_UT = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMDISTINN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO_DISTINTA_UT = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.IMPORTO + NVL(A.VARIAZIONI, 0) > 0) ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        IDVariant v_MSGIVA = new IDVariant(0,IDVariant.STRING);
        if (!(MainFrm.ControllaNORigheIvaFatturaSenzaRegistri(C2.Get("FATANNOPROG"), C2.Get("FATNUMERPROG"), (new IDVariant("SI")), (new IDVariant("SI")), v_MSGIVA, (new IDVariant("")))))
        {
          if (MainFrm.CONREGLIQFAT.equals((new IDVariant("B")), true))
          {
            MainFrm.set_AlertMessage(v_MSGIVA); 
            return 0;
          }
          else
          {
            if (!(MainFrm.MessageConfirm(IDL.Add(v_MSGIVA, (new IDVariant("<BR/>"))))))
            {
              return 0;
            }
          }
          break;
        }
        C2.MoveNext();
      }
      C2.Close();
      if ((!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL, 0)))) || (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL, 0))))
      {
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARSOLCONDIS, 0).compareTo((new IDVariant("SI")), true)!=0)
        {
          if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARDESDADEUT, 0).compareTo((new IDVariant("SI")), true)!=0)
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_DESCRIZIONE, 0)))
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant("Descrizione Obbligatoria!"));
              MainFrm.set_AlertMessage(v_SMS); 
              return 0;
            }
          }
          else
          {
            if (IDL.Length(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_DESCRIZIONE, 0)).compareTo((new IDVariant(99)), true)>0)
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant("La Descrizione non può superare i 99 caratteri"));
              MainFrm.set_AlertMessage(v_SMS); 
              return 0;
            }
          }
        }
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARSOLCONDIS, 0).compareTo((new IDVariant("SI")), true)!=0 && MainFrm.MODAIMPUSPES.equals((new IDVariant("LI")), true))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMCOMPDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMCOMPAL, 0)))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Le date di Competenza delle Liquidazioni non solo valorizzate. Si desidera continuare?"));
            IDVariant v_CONFERMA = null;
            v_CONFERMA = (new IDVariant(MainFrm.MessageConfirmEx(v_SMS)));
            if (!(IDL.IsNull(v_CONFERMA)))
            {
              if (!(v_CONFERMA.booleanValue()))
              {
                return 0;
              }
            }
            else
            {
              return 0;
            }
          }
        }
        MainFrm.Cf4armDBObject.CARICAUTENZETMPFAT(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARADISTANNO, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMUTENZA, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMDISTINN, 0));
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        IDVariant v_DESCLIQ = new IDVariant(0,IDVariant.STRING);
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARDESDADEUT, 0).equals((new IDVariant("SI")), true))
        {
          IDVariant v_DESCR = null;
          v_DESCR = (new IDVariant());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  MAX(B.DESCRIZIONE) as MAXCODUTEDES ");
          SQL.append("from ");
          SQL.append("  UTENZE_TMP A, ");
          SQL.append("  CODICI_UTENZE B ");
          SQL.append("where (A.SESSIONE_ID = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
          SQL.append("and   (A.TIPO_UTENZA = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMUTENZA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.CODICE_UTENZA(+) = A.CODICE_UTENZA) ");
          SQL.append("and   (B.TIPO_UTENZA(+) = A.TIPO_UTENZA) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_DESCR = QV.Get("MAXCODUTEDES", IDVariant.STRING) ;
          }
          QV.Close();
          if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_DESCRIZIONE, 0)))
          {
            v_DESCLIQ = new IDVariant(v_DESCR);
          }
          else
          {
            v_DESCLIQ = IDL.Add(IDL.Add(v_DESCR, (new IDVariant(" - "))), IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_DESCRIZIONE, 0));
          }
        }
        else
        {
          v_DESCLIQ = IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_DESCRIZIONE, 0);
        }
        IDVariant v_IMPDA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_IMPA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_SUBDA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_SUBA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_LIQDA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_LIQA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NANTICIPAZIO = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NOFINANZIAME = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NSUPDISPPURO = new IDVariant(0,IDVariant.INTEGER);
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BeginTrans();
        MainFrm.Cf4armDBObject.CARICALIQPI(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMUTENZA, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMBENEFIC, 0), ((IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_UFFICIO, 0).equals((new IDVariant(0))))?(new IDVariant()):IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_UFFICIO, 0)), ((IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_CAUSALE, 0).equals((new IDVariant(0))))?(new IDVariant()):IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_CAUSALE, 0)), ((IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_BOLLO, 0).equals((new IDVariant(0))))?(new IDVariant()):IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_BOLLO, 0)), IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL, 0), IDL.Add(IDL.Add(IDL.Add(IDL.FillLR(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, 0), (new IDVariant(4)), (new IDVariant(" ")), false), IDL.ToString(((IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SPESE, 0).equals((new IDVariant("0"))))?(new IDVariant()):IDL.ToString(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SPESE, 0))))), MainFrm.Datetostring(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMSCADENZ, 0))), IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_ALLEGATI, 0)), v_DESCLIQ, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.Today(), IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMINEMISS, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMQUIETAN, 0), v_IMPDA, v_IMPA, v_SUBDA, v_SUBA, v_LIQDA, v_LIQA, v_NANTICIPAZIO, v_NOFINANZIAME, IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARSOLCONDIS, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMCOMPDAL, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMCOMPAL, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMNUMCONT, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARADATACONT, 0), (new IDVariant()), v_NSUPDISPPURO, IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMESCLCIG, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          return 0;
        }
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARSOLCONDIS, 0).equals((new IDVariant("SI")), true))
        {
          IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  WRK_ERRORI A ");
          SQL.append("where (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTA.compareTo((new IDVariant(0)), true)>0)
          {
            // 
            // 
            // 
            // 
            IDVariant v_TITOLO = new IDVariant(0,IDVariant.STRING);
            v_TITOLO = (new IDVariant("Stampa Anomalie Utenze"));
            MainFrm.LanciaErrorReport(v_TITOLO, (new IDVariant("NO")));
            return 0;
          }
          else
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Controllo eseguito senza anomalie"));
            MainFrm.set_AlertMessage(v_SMS); 
            return 0;
          }
        }
        else
        {
          IDVariant v_MESS1 = new IDVariant(0,IDVariant.STRING);
          IDVariant v_MESS2 = new IDVariant(0,IDVariant.STRING);
          IDVariant v_SIMP = new IDVariant(0,IDVariant.STRING);
          IDVariant v_SSUB = new IDVariant(0,IDVariant.STRING);
          IDVariant v_SLIQ = new IDVariant(0,IDVariant.STRING);
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Sono presenti record con disponibilità di cassa negativa. Continuare?"));
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_BLOCCNONBLOC = null;
          v_BLOCCNONBLOC = (new IDVariant());
          if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMINEMISS, 0).equals((new IDVariant("SI")), true))
          {
            v_BLOCCNONBLOC = new IDVariant(MainFrm.CONCASLIQEMI);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  BIL A, ");
            SQL.append("  LIQ B ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = 'S') ");
            SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
            SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
            SQL.append("and   (B.ANNO_LIQ = A.ESERCIZIO) ");
            SQL.append("and   ((B.NUMERO_LIQ BETWEEN " + IDL.CSql(v_LIQDA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND NVL(" + IDL.CSql(v_LIQA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(v_LIQDA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "))) ");
            SQL.append("and   (CONTROLLO_DISP_CASSA_VPRO_CAP(A.ESERCIZIO,A.CAPITOLO,A.ARTICOLO,'EM') < 0) ");
            SQL.append("and   (NOT ((B.ANNO_MAND IS NULL))) ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
          }
          else
          {
            v_BLOCCNONBLOC = new IDVariant(MainFrm.CONTRCASSLIQ);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  BIL A, ");
            SQL.append("  LIQ B ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = 'S') ");
            SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
            SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
            SQL.append("and   (B.ANNO_LIQ = A.ESERCIZIO) ");
            SQL.append("and   (CONTROLLO_DISP_CASSA_VPRO_CAP(A.ESERCIZIO,A.CAPITOLO,A.ARTICOLO,'LI') < 0) ");
            SQL.append("and   ((B.NUMERO_LIQ BETWEEN " + IDL.CSql(v_LIQDA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND NVL(" + IDL.CSql(v_LIQA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(v_LIQDA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "))) ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
          }
          if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0 && !(IDL.IsNull(v_BLOCCNONBLOC)))
          {
            if (v_BLOCCNONBLOC.equals((new IDVariant(1)), true))
            {
              IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
              v_S1 = (new IDVariant("Sono presenti record con disponibilità di cassa negativa."));
              MainFrm.Cf4armDBObject.RollbackTrans();
              MainFrm.set_AlertMessage(v_S1); 
              return 0;
            }
            else
            {
              IDVariant v_RISP = null;
              v_RISP = (new IDVariant(MainFrm.MessageConfirmEx(S)));
              if (IDL.IsNull(v_RISP))
              {
                MainFrm.Cf4armDBObject.RollbackTrans();
                return 0;
              }
              if (v_RISP.equals((new IDVariant(-1)), true))
              {
                MainFrm.Cf4armDBObject.CommitTrans();
              }
              else
              {
                MainFrm.Cf4armDBObject.RollbackTrans();
                return 0;
              }
              IMDB.set_Value(IMDBDef5.TBL_PARS48, IMDBDef5.FLD_PARS48_NOMEOGGETDAL, 0, new IDVariant(v_LIQDA));
              IMDB.set_Value(IMDBDef5.TBL_PARS48, IMDBDef5.FLD_PARS48_NOMEOGGETTAL, 0, IDL.NullValue(v_LIQA,v_LIQDA));
              IMDB.set_Value(IMDBDef5.TBL_PARS48, IMDBDef5.FLD_PARS48_NOMEOGGETTES, 0, (new IDVariant("S")));
              MainFrm.Show(MyGlb.FRM_CACODINEDAAL, (new IDVariant(0)).intValue(), this); 
            }
          }
          else
          {
            MainFrm.Cf4armDBObject.CommitTrans();
          }
          if (MainFrm.FINANZIAMENT.booleanValue())
          {
            if (v_NANTICIPAZIO.compareTo((new IDVariant(0)), true)>0)
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant(" Sono presenti casi di anticipazione sui finanziamenti"));
              v_MESS1 = new IDVariant(v_SMS);
            }
            else
            {
              v_MESS1 = (new IDVariant());
            }
            if (v_NOFINANZIAME.compareTo((new IDVariant(0)), true)>0)
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant(" Sono state emesse liquidazioni senza finanziamento"));
              v_MESS2 = new IDVariant(v_SMS);
            }
            else
            {
              v_MESS2 = (new IDVariant());
            }
          }
          else
          {
            v_MESS1 = (new IDVariant());
            v_MESS2 = (new IDVariant());
          }
          if (v_IMPDA.compareTo(v_IMPA, true)>0)
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("nessuno"));
            v_SIMP = new IDVariant(v_SMS);
          }
          else
          {
            v_SIMP = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("dal")), (new IDVariant(" "))), IDL.ToString(v_IMPDA)), (new IDVariant(" "))), (new IDVariant("al"))), (new IDVariant(" "))), IDL.ToString(v_IMPA));
          }
          if (v_SUBDA.compareTo(v_SUBA, true)>0)
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("nessuno"));
            v_SSUB = new IDVariant(v_SMS);
          }
          else
          {
            v_SSUB = IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("dal numero ")), IDL.ToString(v_SUBDA)), (new IDVariant(" "))), (new IDVariant("al numero "))), IDL.ToString(v_SUBA));
          }
          if (v_LIQDA.compareTo(v_LIQA, true)>0)
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("nessuno"));
            v_SLIQ = new IDVariant(v_SMS);
          }
          else
          {
            v_SLIQ = IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("dal numero ")), IDL.ToString(v_LIQDA)), (new IDVariant(" "))), (new IDVariant("al numero "))), IDL.ToString(v_LIQA));
          }
          IDVariant v_VCOUNTLIQ = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  LIQ A, ");
          SQL.append("  FAT B ");
          SQL.append("where (B.ANNO_PROG = A.FAT_ANNO_PROG) ");
          SQL.append("and   (B.NUMERO_PROG = A.FAT_NUMERO_PROG) ");
          SQL.append("and   (A.ANNO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   ((A.NUMERO_LIQ BETWEEN " + IDL.CSql(v_LIQDA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(v_LIQA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
          SQL.append("and   ((A.IMPORTO_IVA IS NULL)) ");
          SQL.append("and   (NOT ((B.TRATTAMENTO_IVA IS NULL))) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNTLIQ = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("Procedura terminata."));
          IDVariant v_MESSAGGIO1 = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO1 = (new IDVariant("Impegni emessi: "));
          IDVariant v_MESSAGGIO2 = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO2 = (new IDVariant("Sub-Impegni emessi: "));
          IDVariant v_MESSAGGIO3 = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO3 = (new IDVariant("Liquidazioni emesse: "));
          IDVariant v_MESSUPDISPUR = new IDVariant(0,IDVariant.STRING);
          v_MESSUPDISPUR = (new IDVariant("Sono stati emessi impegni che superano la disponibilità dello stanziamento puro"));
          v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("<BR/>"))), v_MESSAGGIO1), v_SIMP), (new IDVariant("<BR/>"))), v_MESSAGGIO2), v_SSUB), (new IDVariant("<BR/>"))), v_MESSAGGIO3), v_SLIQ), v_MESS2), v_MESS1), (new IDVariant("<BR/>")));
          if (v_NSUPDISPPURO.equals((new IDVariant(1)), true))
          {
            v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, v_MESSUPDISPUR), (new IDVariant("<BR/>")));
          }
          if (v_VCOUNTLIQ.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_MESSAGGIOLIQ = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIOLIQ = (new IDVariant("Sono stati elaborati documenti con trattamento iva SP o RC associati  a più di una imputazione utenza e con differenti aliquote iva. Per le liquidazioni emesse su questi documenti non è stato possibile calcolare in automatico l'importo iva. Verificare le anomalie e indicare l'importo iva manualmente"));
            v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, v_MESSAGGIOLIQ), (new IDVariant("<BR/>")));
            IMDB.set_Value(IMDBDef2.TBL_PARAMETRI539, IMDBDef2.FLD_PARAMETRI539_PARAMLIQDA, 0, new IDVariant(v_LIQDA));
            IMDB.set_Value(IMDBDef2.TBL_PARAMETRI539, IMDBDef2.FLD_PARAMETRI539_PARAMLIQA, 0, new IDVariant(v_LIQA));
            MainFrm.Show(MyGlb.FRM_ELEANOLIQUTE, (new IDVariant(0)).intValue(), this); 
          }
          MainFrm.set_AlertMessage(v_MESSAGGIO); 
        }
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARSOLCONDIS, 0).compareTo((new IDVariant("SI")), true)!=0)
        {
          SQL = new StringBuffer();
          SQL.append("delete from UTENZE_TMP ");
          SQL.append("where (SESSIONE_ID = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          SQL = new StringBuffer();
          SQL.append("update TIPI_UTENZA set ");
          SQL.append("  DATA_ULTIMA_ELAB = TRUNC( SYSDATE ) ");
          SQL.append("where (CODICE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMUTENZA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
      }
      else
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Dati Delibera incompleti"));
        MainFrm.set_AlertMessage(v_SMS); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniDaDistinta", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // All
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int All ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // All Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM30, IMDBDef1.FLD_PARAM30_ROWNAMENOTE, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_ALLEGATI, 0));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniDaDistinta", "All", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Distinta n Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_DISTINTAN_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Distinta n Validate Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(MainFrm.VISUCHECDIST,(new IDVariant("N"))).equals((new IDVariant("S")), true))
      {
        IDVariant v_VDILIUTFLNUO = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.FLAG_NULLA_OSTA as DILIUTFLNUOS ");
        SQL.append("from ");
        SQL.append("  DISTINTE_LIQUIDAZIONE_UT A ");
        SQL.append("where (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMDISTINN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO = NVL(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARADISTANNO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VDILIUTFLNUO = QV.Get("DILIUTFLNUOS", IDVariant.STRING) ;
        }
        QV.Close();
        if (IDL.NullValue(v_VDILIUTFLNUO,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
        }
        else
        {
          MainFrm.set_AlertMessage((new IDVariant("La distinta non ha il nulla osta per cui non è liquidabile"))); 
          IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMDISTINN, 0, (new IDVariant()));
        }
      }
      else
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMDISTINN, 0))) && (IMDB.Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PAROLDNUMDIS, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMDISTINN, 0), true)!=0 || IMDB.Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PAROLDANNDIS, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARADISTANNO, 0), true)!=0))
        {
          IDVariant v_DATADISTINTA = null;
          v_DATADISTINTA = (new IDVariant());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  MIN(A.DATA_DISTINTA_UT) as MINFATDADIUT ");
          SQL.append("from ");
          SQL.append("  FAT A ");
          SQL.append("where (A.ANNO_DISTINTA_UT = NVL(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARADISTANNO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
          SQL.append("and   (A.NUMERO_DISTINTA_UT = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMDISTINN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO_UTENZA = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMUTENZA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.IMPORTO + NVL(A.VARIAZIONI, 0) - NVL(A.IMPUTATO, 0) > 0) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_DATADISTINTA = QV.Get("MINFATDADIUT", IDVariant.DATETIME) ;
          }
          QV.Close();
          if (IDL.IsNull(v_DATADISTINTA))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Distinta non presente o Distinta senza fatture da liquidare"));
            MainFrm.set_AlertMessage(v_SMS); 
            IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMDISTINN, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARADISTANNO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
            IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMDEL, 0, (new IDVariant()));
            return;
          }
          IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMDEL, 0, new IDVariant(v_DATADISTINTA));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PAROLDNUMDIS, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARAMDISTINN, 0));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PAROLDANNDIS, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_PARADISTANNO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniDaDistinta", "ParametriDistintanValidate", _e);
    }
  }

  // **********************************************************************
  // Info Delibera Label
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDeliberaLabel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibera Label Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI294, IMDBDef10.PQSL_PARAMETRI294_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniDaDistinta", "InfoDeliberaLabel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void EMISLIQDADIS_PARAMETRI294() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAMETRI294_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI408, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI408, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI294_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAMETRI294_RS, 0, IMDBDef2.TBL_PARAMETRI408, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 0, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 1, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 2, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_ANNO_DEL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 3, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_UNITA_PROPONENTE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 4, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_NUMERO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 5, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_ANNO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 6, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_DESCRIZIONE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 7, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_UFFICIO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 8, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_CAUSALE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 9, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_BOLLO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 10, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMINEMISS, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 11, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARADATACONT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 12, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_SPESE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 13, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMSCADENZ, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 14, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_ALLEGATI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 15, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMCOMPDAL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 16, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMCOMPAL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 17, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMNUMCONT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 18, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARDESDADEUT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 19, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMDISTINN, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 20, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMDEL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 21, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARSOLCONDIS, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 22, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARADISTANNO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI294_RS, 23, 0, IMDBDef2.TBL_PARAMETRI408, IMDBDef2.FLD_PARAMETRI408_PARAMESCLCIG, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI408, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI408, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI408, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAMETRI294_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_SCEGDELILABE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFODELILABE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDeliberaLabel();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORALABEL)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ALL)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      All();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_DISTINTAN)
      {
        PFL_PARAMETRI_DISTINTAN_ValidateCell(Cancel);
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "53BFC34A-BA29-4650-ACE2-62F9B9DE1543");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "Provvedimento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 120, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.PANEL_FORM, 44, 87, 324, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0, 87);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 35);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABELGRUPPO, "43775873-3750-45C6-B555-83941CCAE315");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABELGRUPPO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABELGRUPPO, MyGlb.VIS_GROSTYPERLAB);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABELGRUPPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, "6E47371D-3860-4402-9824-E9F09C3801B6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, "Distinta n.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DEL, "1C602955-AF20-4E73-85A6-832956B1B217");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DEL, "del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTDISP, "24256563-51F7-421B-A149-3030E79F0AC0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTDISP, "Solo Controllo Disponibilità");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTDISP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTDISP, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTDISP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, "F097CEC9-2E7B-4C62-B8B3-C723FB4512A6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, "Delibera");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "46CC91A6-66D8-4DD7-B0AB-1D51A342C3C3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "Sede Del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, "3137F749-1557-4899-B365-2FF8FBB16697");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "3B1E7597-F588-4673-8F46-FBC5ABCC3BDF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "Numero Del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, "887E4DAD-6357-497B-AFCA-53700C38DEF3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "B1844093-B259-402C-BDD6-4B86481E2773");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "Anno Del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, "79D9BE10-FB0F-4382-88B7-D3975A7C0832");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, "33FFA04C-D098-408E-A70B-A712BE81F27F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEGRUPDELI, "DF506943-9733-426E-A070-EBFF275B8EBB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEGRUPDELI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEGRUPDELI, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEGRUPDELI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCDADETUTE, "0D5F4A95-C93C-426F-824D-FA3A697D2E3F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCDADETUTE, "Descrizione da Dettagli Utenze");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCDADETUTE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCDADETUTE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCDADETUTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "460A35EB-E4F1-4C53-9720-BF7136DE100D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "Descrizione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "564EA44F-4E3D-48F0-A652-907B91D02EE6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "21CAB9A4-9E3E-47D1-A25D-7DECF0D50BC6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "Causale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "C0AC4189-B31A-46EC-A32E-6A2DE1683049");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "Bollo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, "381F2248-5ECB-4D99-8CD4-BBBBFDFE7419");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, "In Emissione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMCONTABILE, "E8A3D5F5-9DF8-46B5-8E3D-F8C7CB7C79B9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMCONTABILE, "Num. Contabile");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMCONTABILE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMCONTABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMCONTABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATACONTABIL, "0507763F-906E-434D-834E-0588BC90928E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATACONTABIL, "Data Contabile");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATACONTABIL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATACONTABIL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATACONTABIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMPETENZDAL, "ED17EB68-DBA7-410E-8474-6E3BF58820C8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMPETENZDAL, "Competenza Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMPETENZDAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMPETENZDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMPETENZDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "986FED09-7453-4672-A225-7C490344F297");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "EA6BD718-12D9-4A97-8F79-B29CE5E7DAF1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "Spese");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, "93554773-88BF-4A3E-B72D-B9B6E43BD1BD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, "Scadenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, "F4A8EBC2-1B7B-41FB-AE61-494C18A6EF55");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, "Allegati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESCLUSIONCIG, "6081886A-F1CB-401D-AA6C-7BDAAC483E16");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESCLUSIONCIG, "Esclusione Cig");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESCLUSIONCIG, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESCLUSIONCIG, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESCLUSIONCIG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, "292634E4-7A9A-44C1-9ABA-76A27C649A71");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "B69C161D-89DE-495D-8B49-1567D64A1AC1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "Unita Proponente");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "F891C103-4628-4E20-9B67-169CF1A474CD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "Numero Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "D0A3F127-C1BB-4884-B287-3A906D3861AA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "Anno Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, "10F79AE8-2B2B-4428-9471-38B6763E5666");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, "Dati Liquidazioni");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALL, "F3CE910B-6633-4937-9C3D-E28A24637B7A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALL, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALL, 0, "testo1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, "12422A7B-CDC8-4FE0-9016-34390E6C2E2D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, "Titolo");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, MyGlb.VIS_ETICGRASLEFT);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAANNO, "ADE553CE-30CF-420C-81BB-6ADFC6A4B801");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAANNO, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAANNO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAANNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABELGRUPPO, MyGlb.PANEL_LIST, 4, 52, 596, 280, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABELGRUPPO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABELGRUPPO, MyGlb.PANEL_LIST, 21);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABELGRUPPO, MyGlb.PANEL_FORM, 16, 72, 580, 316, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABELGRUPPO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABELGRUPPO, MyGlb.PANEL_FORM, 23);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABELGRUPPO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABELGRUPPO, -1, "", "LABELGRUPPO", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_LIST, "Distinta n.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_FORM, 52, 40, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_FORM, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_FORM, "Distinta n.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DISTINTAN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DISTINTAN, PPQRY_PARAMETRI294, "A.PARAMDISTINN", "PARAMDISTINN", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DEL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DEL, MyGlb.PANEL_LIST, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DEL, MyGlb.PANEL_LIST, "del");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DEL, MyGlb.PANEL_FORM, 232, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DEL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DEL, MyGlb.PANEL_FORM, "del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DEL, PPQRY_PARAMETRI294, "A.PARAMDEL", "PARAMDEL", 6, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTDISP, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTDISP, MyGlb.PANEL_LIST, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTDISP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTDISP, MyGlb.PANEL_LIST, "Solo Controllo Disponibilità");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTDISP, MyGlb.PANEL_FORM, 404, 40, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTDISP, MyGlb.PANEL_FORM, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTDISP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTDISP, MyGlb.PANEL_FORM, "Solo Controllo Disponibilità");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOCONTDISP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOCONTDISP, PPQRY_PARAMETRI294, "A.PARSOLCONDIS", "PARSOLCONDIS", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCONTDISP, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCONTDISP, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 20, 8, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 48, 112, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERLABEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERLABEL, -1, "", "DELIBERLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, "Sd. Dl.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 124, 112, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, "Sd. Del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SEDEDEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SEDEDEL, PPQRY_PARAMETRI294, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_LIST, 36, 24, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_FORM, 176, 112, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATDELILABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATDELILABE, -1, "", "TRATDELILABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, "N. D.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 196, 112, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, "Numero Del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODEL, PPQRY_PARAMETRI294, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_LIST, 28, 16, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_FORM, 244, 112, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRDELILABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRDELILABE, -1, "", "BARRDELILABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, "An. D.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 264, 112, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, "Ann. Del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODEL, PPQRY_PARAMETRI294, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_LIST, 264, 44, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_FORM, 312, 116, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCEGDELILABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCEGDELILABE, -1, "", "SCEGDELILABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_SCEGDELILABE, 3);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, MyGlb.PANEL_LIST, 272, 52, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, MyGlb.PANEL_FORM, 332, 116, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFODELILABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFODELILABE, -1, "", "INFODELILABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_INFODELILABE, 3);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEGRUPDELI, MyGlb.PANEL_LIST, 300, 392, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEGRUPDELI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEGRUPDELI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEGRUPDELI, MyGlb.PANEL_FORM, 352, 116, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEGRUPDELI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEGRUPDELI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABEGRUPDELI, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABEGRUPDELI, -1, "", "LABEGRUPDELI", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCDADETUTE, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCDADETUTE, MyGlb.PANEL_LIST, 184);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCDADETUTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCDADETUTE, MyGlb.PANEL_LIST, "Descrizione da Dettagli Utenze");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCDADETUTE, MyGlb.PANEL_FORM, 380, 88, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCDADETUTE, MyGlb.PANEL_FORM, 184);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCDADETUTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCDADETUTE, MyGlb.PANEL_FORM, "Descrizione da Dettagli Utenze");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCDADETUTE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCDADETUTE, PPQRY_PARAMETRI294, "A.PARDESDADEUT", "PARDESDADEUT", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DESCDADETUTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DESCDADETUTE, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 240, 36, 112, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 44, 140, 544, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRIZIONE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRIZIONE, PPQRY_PARAMETRI294, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Uff.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 68, 164, 404, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_PARAMETRI294, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, "Caus.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 60, 188, 412, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAUSALE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAUSALE, PPQRY_PARAMETRI294, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 432, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 76, 212, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BOLLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BOLLO, PPQRY_PARAMETRI294, "A.BOLLO", "BOLLO", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, 544, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, "In Emiss.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, 484, 200, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, "In Emissione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INEMISSIONE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INEMISSIONE, PPQRY_PARAMETRI294, "A.PARAMINEMISS", "PARAMINEMISS", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_INEMISSIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_INEMISSIONE, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMCONTABILE, MyGlb.PANEL_LIST, 0, 36, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMCONTABILE, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMCONTABILE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMCONTABILE, MyGlb.PANEL_LIST, "Num. Contabile");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMCONTABILE, MyGlb.PANEL_FORM, 28, 236, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMCONTABILE, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMCONTABILE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMCONTABILE, MyGlb.PANEL_FORM, "Num. Contabile");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMCONTABILE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMCONTABILE, PPQRY_PARAMETRI294, "A.PARAMNUMCONT", "PARAMNUMCONT", 5, 52, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATACONTABIL, MyGlb.PANEL_LIST, 592, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATACONTABIL, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATACONTABIL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATACONTABIL, MyGlb.PANEL_LIST, "Data Contabile");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATACONTABIL, MyGlb.PANEL_FORM, 396, 236, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATACONTABIL, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATACONTABIL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATACONTABIL, MyGlb.PANEL_FORM, "Data Contabile");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATACONTABIL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATACONTABIL, PPQRY_PARAMETRI294, "A.PARADATACONT", "PARADATACONT", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMPETENZDAL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMPETENZDAL, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMPETENZDAL, MyGlb.PANEL_LIST, "Competenza Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMPETENZDAL, MyGlb.PANEL_FORM, 20, 260, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMPETENZDAL, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMPETENZDAL, MyGlb.PANEL_FORM, "Competenza Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_COMPETENZDAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_COMPETENZDAL, PPQRY_PARAMETRI294, "A.PARAMCOMPDAL", "PARAMCOMPDAL", 6, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 208, 260, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI294, "A.PARAMCOMPAL", "PARAMCOMPAL", 6, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 712, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 64, 284, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SPESE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SPESE, PPQRY_PARAMETRI294, "A.SPESE", "SPESE", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, 856, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, 48, 308, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCADENZA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCADENZA, PPQRY_PARAMETRI294, "A.PARAMSCADENZ", "PARAMSCADENZ", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, 4, 264, 472, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, 64, 332, 500, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ALLEGATI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ALLEGATI, PPQRY_PARAMETRI294, "A.ALLEGATI", "ALLEGATI", 5, 150, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESCLUSIONCIG, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESCLUSIONCIG, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESCLUSIONCIG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESCLUSIONCIG, MyGlb.PANEL_LIST, "Esclusione Cig");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESCLUSIONCIG, MyGlb.PANEL_FORM, 32, 356, 532, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESCLUSIONCIG, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESCLUSIONCIG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESCLUSIONCIG, MyGlb.PANEL_FORM, "Esclusione Cig");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESCLUSIONCIG, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESCLUSIONCIG, PPQRY_PARAMETRI294, "A.PARAMESCLCIG", "PARAMESCLCIG", 5, 50, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 468, 332, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 508, 396, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORALABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORALABEL, -1, "", "ELABORALABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 8, 44, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, "Unita Proponente");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 12, 376, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, "Unita Proponente");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UNITAPROPONE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UNITAPROPONE, PPQRY_PARAMETRI294, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, "Numero Proposta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 368, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROPROPOS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROPROPOS, PPQRY_PARAMETRI294, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Anno Proposta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 368, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOPROPOSTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOPROPOSTA, PPQRY_PARAMETRI294, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, MyGlb.PANEL_LIST, 20, 44, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, MyGlb.PANEL_FORM, 32, 64, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALL, MyGlb.PANEL_LIST, 364, 360, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALL, MyGlb.PANEL_FORM, 568, 336, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ALL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ALL, -1, "", "ALL", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_ALL, 3);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, MyGlb.PANEL_LIST, 16, 12, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, MyGlb.PANEL_FORM, 16, 12, 580, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHETITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHETITOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHETITOLO, -1, "", "ETICHETITOLO", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAANNO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAANNO, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAANNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAANNO, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAANNO, MyGlb.PANEL_FORM, 172, 40, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAANNO, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAANNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAANNO, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DISTINTAANNO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DISTINTAANNO, PPQRY_PARAMETRI294, "A.PARADISTANNO", "PARADISTANNO", 1, 4, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 6);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~UFFICIO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  0, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~UFFICIO~~ = 0) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAMETRI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  0, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~CAUSALE~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  0, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~CAUSALE~~ = 0) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T58, 0, SQL, PFL_PARAMETRI_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  0, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T58, 1, SQL, PFL_PARAMETRI_CAUSALE, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~BOLLO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  0, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~BOLLO~~ = 0) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T60, 0, SQL, PFL_PARAMETRI_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  0, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T60, 1, SQL, PFL_PARAMETRI_BOLLO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~SPESE~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_PARAMETRI_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_PARAMETRI_SPESE, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRIOPICODI, ");
    SQL.append("  A.DESCRIZIONE as ATTRIOPIDESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_OPI A ");
    SQL.append("where (A.CODICE = ~~PARAMESCLCIG~~) ");
    SQL.append("and   (A.TIPO = 'MOT_ESC_CIG') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_ATTRIBUTIOPI, 0, SQL, PFL_PARAMETRI_ESCLUSIONCIG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRIOPICODI, ");
    SQL.append("  A.DESCRIZIONE as ATTRIOPIDESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_OPI A ");
    SQL.append("where (A.TIPO = 'MOT_ESC_CIG') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_ATTRIBUTIOPI, 1, SQL, PFL_PARAMETRI_ESCLUSIONCIG, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_ATTRIBUTIOPI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI294", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI294, IMDBDef10.PQRY_PARAMETRI294_RS, IMDBDef2.TBL_PARAMETRI408);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DISTINTAN, IMDBDef2.FLD_PARAMETRI408_PARAMDISTINN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DEL, IMDBDef2.FLD_PARAMETRI408_PARAMDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOCONTDISP, IMDBDef2.FLD_PARAMETRI408_PARSOLCONDIS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SEDEDEL, IMDBDef2.FLD_PARAMETRI408_SEDE_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODEL, IMDBDef2.FLD_PARAMETRI408_NUMERO_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODEL, IMDBDef2.FLD_PARAMETRI408_ANNO_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DESCDADETUTE, IMDBDef2.FLD_PARAMETRI408_PARDESDADEUT);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DESCRIZIONE, IMDBDef2.FLD_PARAMETRI408_DESCRIZIONE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef2.FLD_PARAMETRI408_UFFICIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAUSALE, IMDBDef2.FLD_PARAMETRI408_CAUSALE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_BOLLO, IMDBDef2.FLD_PARAMETRI408_BOLLO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_INEMISSIONE, IMDBDef2.FLD_PARAMETRI408_PARAMINEMISS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMCONTABILE, IMDBDef2.FLD_PARAMETRI408_PARAMNUMCONT);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATACONTABIL, IMDBDef2.FLD_PARAMETRI408_PARADATACONT);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_COMPETENZDAL, IMDBDef2.FLD_PARAMETRI408_PARAMCOMPDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef2.FLD_PARAMETRI408_PARAMCOMPAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SPESE, IMDBDef2.FLD_PARAMETRI408_SPESE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SCADENZA, IMDBDef2.FLD_PARAMETRI408_PARAMSCADENZ);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ALLEGATI, IMDBDef2.FLD_PARAMETRI408_ALLEGATI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESCLUSIONCIG, IMDBDef2.FLD_PARAMETRI408_PARAMESCLCIG);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UNITAPROPONE, IMDBDef2.FLD_PARAMETRI408_UNITA_PROPONENTE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROPROPOS, IMDBDef2.FLD_PARAMETRI408_NUMERO_PROPOSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOPROPOSTA, IMDBDef2.FLD_PARAMETRI408_ANNO_PROPOSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DISTINTAANNO, IMDBDef2.FLD_PARAMETRI408_PARADISTANNO);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI408");
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

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
