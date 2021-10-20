// **********************************************
// Emissione Liquidazioni Cassa Eco
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneLiquidazioniCassaEco extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_PROVVEDIMENT = 0;

  private static int PFL_PARAMETRI_DELIBERLABEL = 0;
  private static int PFL_PARAMETRI_SEDEDEL = 1;
  private static int PFL_PARAMETRI_TRATDELILABE = 2;
  private static int PFL_PARAMETRI_NUMERODEL = 3;
  private static int PFL_PARAMETRI_BARRDELILABE = 4;
  private static int PFL_PARAMETRI_ANNODEL = 5;
  private static int PFL_PARAMETRI_SCEGDELILABE = 6;
  private static int PFL_PARAMETRI_PROPOSTLABEL = 7;
  private static int PFL_PARAMETRI_UNITAPROPONE = 8;
  private static int PFL_PARAMETRI_TRATPROPLABE = 9;
  private static int PFL_PARAMETRI_NUMEROPROPOS = 10;
  private static int PFL_PARAMETRI_BARRPROPLABE = 11;
  private static int PFL_PARAMETRI_ANNOPROPOSTA = 12;
  private static int PFL_PARAMETRI_SCEGPROPLABE = 13;
  private static int PFL_PARAMETRI_UFFICIO = 14;
  private static int PFL_PARAMETRI_CAUSALE = 15;
  private static int PFL_PARAMETRI_BOLLO = 16;
  private static int PFL_PARAMETRI_NUMQUIETANZA = 17;
  private static int PFL_PARAMETRI_T02DESCRIZIO = 18;
  private static int PFL_PARAMETRI_INEMISSIONE = 19;
  private static int PFL_PARAMETRI_DATALIQUIDAZ = 20;
  private static int PFL_PARAMETRI_SPESE = 21;
  private static int PFL_PARAMETRI_COMMISSIONI = 22;
  private static int PFL_PARAMETRI_SCADENZA = 23;
  private static int PFL_PARAMETRI_ALLEGATI = 24;
  private static int PFL_PARAMETRI_INFOTESORIER = 25;
  private static int PFL_PARAMETRI_ELABORALABEL = 26;
  private static int PFL_PARAMETRI_CENTRO = 27;
  private static int PFL_PARAMETRI_INTELIQUUNIC = 28;

  private static int PPQRY_PARAMETRI298 = 0;

  private static int PPQRY_CENTRI = 1;
  private static int PPQRY_QTN = 2;

  private static int PPQRY_T53 = 3;
  private static int PPQRY_T58 = 4;
  private static int PPQRY_T60 = 5;
  private static int PPQRY_TIPISPESMINF = 6;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables
  private IDVariant SPESADAPROPO = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant LICENZAMIF = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI297(IMDB);
    //
    //
    Init_PQRY_PARAMETRI298(IMDB);
    Init_PQRY_PARAMETRI298_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI297(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI297, 24);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI297, "TBL_PARAMETRI297");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARANUMEDIST, "PARANUMEDIST");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARANUMEDIST,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAANNODIST, "PARAANNODIST");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAANNODIST,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAMPERIDAL, "PARAMPERIDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAMPERIDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAMAL,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAMNUMQUIE, "PARAMNUMQUIE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAMNUMQUIE,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAMECONOMO, "PARAMECONOMO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAMECONOMO,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAMCENTRO, "PARAMCENTRO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAMCENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARADATALIQU, "PARADATALIQU");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARADATALIQU,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_COMMISSIONI, "COMMISSIONI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_COMMISSIONI,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAMSCADENZ, "PARAMSCADENZ");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARAMSCADENZ,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_INFO_TESORIERE, "INFO_TESORIERE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_INFO_TESORIERE,5,200,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARINTLIQUNI, "PARINTLIQUNI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI297,IMDBDef5.FLD_PARAMETRI297_PARINTLIQUNI,5,1,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI297, 0);
  }

  private static void Init_PQRY_PARAMETRI298(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI298, 19);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI298, "PQRY_PARAMETRI298");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_PARAMNUMQUIE, "PARAMNUMQUIE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_PARAMNUMQUIE,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_PARAMCENTRO, "PARAMCENTRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_PARAMCENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_PARADATALIQU, "PARADATALIQU");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_PARADATALIQU,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_COMMISSIONI, "COMMISSIONI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_COMMISSIONI,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_PARAMSCADENZ, "PARAMSCADENZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_PARAMSCADENZ,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_INFO_TESORIERE, "INFO_TESORIERE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_INFO_TESORIERE,5,200,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_PARINTLIQUNI, "PARINTLIQUNI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298,IMDBDef14.PQSL_PARAMETRI298_PARINTLIQUNI,5,1,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI298, 0);
  }

  private static void Init_PQRY_PARAMETRI298_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI298_RS, 19);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI298_RS, "PQRY_PARAMETRI298_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_PARAMNUMQUIE, "PARAMNUMQUIE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_PARAMNUMQUIE,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_PARAMCENTRO, "PARAMCENTRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_PARAMCENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_PARADATALIQU, "PARADATALIQU");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_PARADATALIQU,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_COMMISSIONI, "COMMISSIONI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_COMMISSIONI,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_PARAMSCADENZ, "PARAMSCADENZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_PARAMSCADENZ,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_INFO_TESORIERE, "INFO_TESORIERE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_INFO_TESORIERE,5,200,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_PARINTLIQUNI, "PARINTLIQUNI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI298_RS,IMDBDef14.PQSL_PARAMETRI298_PARINTLIQUNI,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneLiquidazioniCassaEco(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneLiquidazioniCassaEco()
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
    FormIdx = MyGlb.FRM_EMILIQCASECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "70D2D041-D215-4BC2-AEE5-6F0D8CA03A03";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 680;
    DesignHeight = 394;
    set_Caption(new IDVariant("Emissione Liquidazioni Cassa Eco"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 680;
    Frames[1].Height = 368;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 368;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 680-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F058AB44-680C-4C7B-809C-C60ED244D2B9");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1096, 256, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI297, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMILIQCASECO_PARAMETRI298();
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
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SCEGPROPLABE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEQUIDELSOG && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_NUMQUIETANZA) {
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
    return (obj instanceof EmissioneLiquidazioniCassaEco);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneLiquidazioniCassaEco.class.getName() : (Glb.ClassWithPackage(EmissioneLiquidazioniCassaEco.class) ? EmissioneLiquidazioniCassaEco.class.getName().substring(EmissioneLiquidazioniCassaEco.class.getPackage().getName().length() + 1) : EmissioneLiquidazioniCassaEco.class.getName()));
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
      v_CAPTION = (new IDVariant("Emissione Liquidazioni", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      v_PERS = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_NOTESOGGETTI);
      LICENZAMIF = (new IDVariant(MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF")))));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAMECONOMO, 0, EconomoDistinta());
      if (IsIntestatarioLiquidazioneUnico())
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARINTLIQUNI, 0, (new IDVariant("S")));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARINTLIQUNI, 0, (new IDVariant("N")));
      }
      if (IDL.IsNull(MainFrm.SPESE_DA_SOGGETTO))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CODICE as TIPSPEMINCOD ");
        SQL.append("from ");
        SQL.append("  TIPI_SPESA_MINF A ");
        SQL.append("where (A.DEFAULT_S = 'SI') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          SPESADAPROPO = QV.Get("TIPSPEMINCOD", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      // 
      // Visibilità Mandato Informatico
      // 
      {
        if (MainFrm.LIQMO.equals((new IDVariant("SI")), true))
        {
          if (IDL.IsNull(MainFrm.SPESE_DA_SOGGETTO))
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_SPESE, 0, new IDVariant(SPESADAPROPO));
          }
          else
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          if (LICENZAMIF.booleanValue() && MainFrm.GESTIONSPESE.equals((new IDVariant("SI")), true) && IDL.IsNull(MainFrm.SPESE_DA_SOGGETTO))
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_SPESE, 0, new IDVariant(SPESADAPROPO));
          }
          else
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          if (LICENZAMIF.booleanValue() && MainFrm.GESTIOALLEGA.equals((new IDVariant("SI")), true))
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          if (LICENZAMIF.booleanValue())
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        if (LICENZAMIF.booleanValue() && MainFrm.GESTIOCOMMIS.equals((new IDVariant("SI")), true))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (LICENZAMIF.booleanValue() && MainFrm.GESTINFOTESO.equals((new IDVariant("SI")), true))
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_UFFICIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniCassaEco", "LoadEvent", _e);
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
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_PARAMCENTRO, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEQUIDELSOG)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_PARAMNUMQUIE, 0, IMDB.Value(IMDBDef7.PQRY_QTN4, IMDBDef7.PQSL_QTN4_NUM_QUIETANZA, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniCassaEco", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARANUMEDIST, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAANNODIST, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_SEDE_DEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_NUMERO_DEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_ANNO_DEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_UNITA_PROPONENTE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_NUMERO_PROPOSTA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_ANNO_PROPOSTA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_UFFICIO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_CAUSALE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_BOLLO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAMCENTRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAMINEMISS, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARADATALIQU, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_SPESE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_COMMISSIONI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAMSCADENZ, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_ALLEGATI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_INFO_TESORIERE, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniCassaEco", "UnloadEvent", _e);
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
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ANNODEL)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_SEDEDEL)), true))
      {
        IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
        v_SEDEDEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_SEDE_DEL, 0);
        v_ANNODEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_ANNO_DEL, 0);
        v_NUMERODEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_NUMERO_DEL, 0);
        MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_SEDE_DEL, 0, new IDVariant(v_SEDEDEL));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_NUMERO_DEL, 0, new IDVariant(v_NUMERODEL));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_ANNO_DEL, 0, new IDVariant(v_ANNODEL));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_SEDE_DEL, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_SEDE_DEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ANNOPROPOSTA)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_PARAMETRI_UNITAPROPONE)), true))
      {
        IDVariant v_UNITAPROP = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNOPROP = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMEROPROP = new IDVariant(0,IDVariant.INTEGER);
        v_UNITAPROP = IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_UNITA_PROPONENTE, 0);
        v_ANNOPROP = IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_ANNO_PROPOSTA, 0);
        v_NUMEROPROP = IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_NUMERO_PROPOSTA, 0);
        MainFrm.ControlloProposte(v_UNITAPROP, v_ANNOPROP, v_NUMEROPROP);
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_UNITA_PROPONENTE, 0, new IDVariant(v_UNITAPROP));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_NUMERO_PROPOSTA, 0, new IDVariant(v_NUMEROPROP));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_ANNO_PROPOSTA, 0, new IDVariant(v_ANNOPROP));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_UNITA_PROPONENTE, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_UNITA_PROPONENTE, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_UNITA_PROPONENTE, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniCassaEco", "ParametriOnUpdatingRowEvent", _e);
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
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_PARINTLIQUNI, 0).equals((new IDVariant("S")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniCassaEco", "ParametriOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Apri Scelta Quietanza
  // **********************************************************************
  public int ApriSceltaQuietanza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Quietanza Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_ROWNAMESOGGE, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAMECONOMO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_ROWNAMESCADE, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCEQUIDELSOG, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniCassaEco", "ApriSceltaQuietanza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Economo Distinta
  // **********************************************************************
  public IDVariant EconomoDistinta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Economo Distinta Body
      // Corpo Procedura
      // 
      IDVariant v_VDISTINCOUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_PROGRECONOMO = null;
      v_PROGRECONOMO = (new IDVariant());
      IDVariant v_VANNODIST = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VNUMERODIST = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(DISTINCT A.PROGR_ECONOMO) as DICOMOCAGCPE, ");
      SQL.append("  A.ANNO_DISTINTA_RR as MOCAGCANDIRR, ");
      SQL.append("  A.NUMERO_DISTINTA_RR as MOCAGCNUDIRR ");
      SQL.append("from ");
      SQL.append("  MOVIMENTI_CASSE_GC4 A ");
      SQL.append("where (A.ANNO_DISTINTA_RR = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAANNODIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_DISTINTA_RR = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARANUMEDIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("group by ");
      SQL.append("  A.ANNO_DISTINTA_RR, ");
      SQL.append("  A.NUMERO_DISTINTA_RR ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VDISTINCOUNT = QV.Get("DICOMOCAGCPE", IDVariant.INTEGER) ;
        v_VANNODIST = QV.Get("MOCAGCANDIRR", IDVariant.INTEGER) ;
        v_VNUMERODIST = QV.Get("MOCAGCNUDIRR", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VDISTINCOUNT.equals((new IDVariant(1)), true))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.PROGR_ECONOMO as MOVCASGCPREC ");
        SQL.append("from ");
        SQL.append("  MOVIMENTI_CASSE_GC4 A ");
        SQL.append("where (A.ANNO_DISTINTA_RR = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAANNODIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_DISTINTA_RR = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARANUMEDIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_PROGRECONOMO = QV.Get("MOVCASGCPREC", IDVariant.INTEGER) ;
        }
        QV.Close();
        return v_PROGRECONOMO;
      }
      else
      {
        return (new IDVariant(-1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniCassaEco", "EconomoDistinta", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Is Intestatario Liquidazione Unico
  // Ritorna true se la liquidazione sarà intestata ad un
  // unico soggetto 
  // quindi il progressivo economo è solo uno e non si tratta
  // di una distinta nominativa dove possono essere generate
  //  a partire da una distinta, più liquidazioni intestate
  // ai soggetti intestatari dell'obiettivo indicato in
  // cassa economale
  // **********************************************************************
  public boolean IsIntestatarioLiquidazioneUnico ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Is Intestatario Liquidazione Unico Body
      // Corpo Procedura
      // 
      IDVariant v_VRET = null;
      v_VRET = (new IDVariant(-1));
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  MOVIMENTI_CASSE_GC4 A ");
      SQL.append("where (NVL(A.LIQ_NOMINATIVA, 'N') = 'Y') ");
      SQL.append("and   ((A.ANNO_LIQ IS NULL)) ");
      SQL.append("and   (A.ANNO_DISTINTA_RR = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAANNODIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_DISTINTA_RR = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARANUMEDIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
      {
        v_VRET = (new IDVariant(0));
      }
      else
      {
        v_VCOUNT = (new IDVariant(0));
        IDVariant v_VANNODIS = null;
        v_VANNODIS = (new IDVariant());
        IDVariant v_VNUMERODIS = null;
        v_VNUMERODIS = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(DISTINCT A.PROGR_ECONOMO) as DICOMOCAGCPE, ");
        SQL.append("  A.ANNO_DISTINTA_RR as MOCAGCANDIRR, ");
        SQL.append("  A.NUMERO_DISTINTA_RR as MOCAGCNUDIRR ");
        SQL.append("from ");
        SQL.append("  MOVIMENTI_CASSE_GC4 A ");
        SQL.append("where ((A.ANNO_LIQ IS NULL)) ");
        SQL.append("and   (A.ANNO_DISTINTA_RR = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAANNODIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_DISTINTA_RR = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARANUMEDIST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("group by ");
        SQL.append("  A.ANNO_DISTINTA_RR, ");
        SQL.append("  A.NUMERO_DISTINTA_RR ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("DICOMOCAGCPE", IDVariant.INTEGER) ;
          v_VANNODIS = QV.Get("MOCAGCANDIRR", IDVariant.INTEGER) ;
          v_VNUMERODIS = QV.Get("MOCAGCNUDIRR", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.compareTo((new IDVariant(1)), true)>0)
        {
          v_VRET = (new IDVariant(0));
        }
      }
      return v_VRET.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniCassaEco", "IsIntestatarioLiquidazioneUnico", _e);
      return false;
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
    IDVariant v_SPESE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SCADENZA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ALLEGATI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PARAMETROSED = new IDVariant(0,IDVariant.STRING);
    IDVariant v_COMMISSIONE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_INFOTES = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NUMLIQUIDATE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMULTLIQ = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ANTICIPAZION = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NOFINANZIAME = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_STRSTATOSIOP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STRANTICIPAZ = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STRFINANZIAM = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONFERMA = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CONFERMA = (new IDVariant("Elaborazione Eseguita!", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_NUMSTATOSIOP = null;
      v_NUMSTATOSIOP = (new IDVariant());
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_PARAMNUMQUIE, 0)) && IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_PARINTLIQUNI, 0).equals((new IDVariant("S")), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Selezionare una quietanza"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      v_NUMSTATOSIOP = ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_PARINTLIQUNI, 0).equals((new IDVariant("S")), true))?IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_PARAMNUMQUIE, 0):(new IDVariant()));
      v_PARAMETROSED = IDL.FillLR(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_SEDE_DEL, 0),(new IDVariant(" "))), (new IDVariant(4)), (new IDVariant(" ")), false);
      if (MainFrm.LIQMO.equals((new IDVariant("SI")), true) || LICENZAMIF.booleanValue())
      {
        v_SPESE = IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_SPESE, 0),(new IDVariant(0)));
        v_SCADENZA = IDL.NullValue(MainFrm.Datetostring(IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_PARAMSCADENZ, 0)),(new IDVariant("00/00/0000")));
        v_ALLEGATI = IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_ALLEGATI, 0),(new IDVariant(" ")));
        v_PARAMETROSED = IDL.Add(IDL.Add(IDL.Add(v_PARAMETROSED, IDL.ToString(v_SPESE)), v_SCADENZA), v_ALLEGATI);
      }
      if (LICENZAMIF.booleanValue())
      {
        v_COMMISSIONE = IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_COMMISSIONI, 0);
        v_INFOTES = IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_INFO_TESORIERE, 0);
      }
      else
      {
        v_COMMISSIONE = (new IDVariant());
        v_INFOTES = (new IDVariant());
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.BeginTrans();
      MainFrm.Cf4armDBObject.LIQUIDACASSAECONOMALEGC4(IMDB.Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARANUMEDIST, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAANNODIST, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAMPERIDAL, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAMAL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_UFFICIO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_BOLLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_CAUSALE, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_ANNO_DEL, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_NUMERO_DEL, 0), v_PARAMETROSED, ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_PARAMINEMISS, 0).equals((new IDVariant("SI"))))?IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0):(new IDVariant())), IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_ANNO_PROPOSTA, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_NUMERO_PROPOSTA, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_UNITA_PROPONENTE, 0), v_NUMLIQUIDATE, v_NUMULTLIQ, v_ANTICIPAZION, v_NOFINANZIAME, v_COMMISSIONE, v_INFOTES, v_NUMSTATOSIOP, IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_PARADATALIQU, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        MainFrm.Cf4armDBObject.RollbackTrans();
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Sono presenti record con disponibilità di cassa negativa. Continuare?"));
        IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_BLOCCNONBLOC = null;
        v_BLOCCNONBLOC = (new IDVariant());
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI298, IMDBDef14.PQSL_PARAMETRI298_PARAMINEMISS, 0).equals((new IDVariant("SI")), true))
        {
          v_BLOCCNONBLOC = new IDVariant(MainFrm.CONCASLIQEMI);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  LIQ A, ");
          SQL.append("  BIL B ");
          SQL.append("where (A.ANNO_LIQ = B.ESERCIZIO) ");
          SQL.append("and   ((A.NUMERO_LIQ BETWEEN " + IDL.CSql(v_NUMULTLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - " + IDL.CSql(v_NUMLIQUIDATE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " + 1 AND " + IDL.CSql(v_NUMULTLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
          SQL.append("and   (NOT ((A.ANNO_MAND IS NULL))) ");
          SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.E_S = 'S') ");
          SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
          SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
          SQL.append("and   (CONTROLLO_DISP_CASSA_VPRO_CAP(B.ESERCIZIO,B.CAPITOLO,B.ARTICOLO,'EM') < 0) ");
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
          SQL.append("  LIQ A, ");
          SQL.append("  BIL B ");
          SQL.append("where (A.ANNO_LIQ = B.ESERCIZIO) ");
          SQL.append("and   ((A.NUMERO_LIQ BETWEEN " + IDL.CSql(v_NUMULTLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - " + IDL.CSql(v_NUMLIQUIDATE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " + 1 AND " + IDL.CSql(v_NUMULTLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
          SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.E_S = 'S') ");
          SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
          SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
          SQL.append("and   (CONTROLLO_DISP_CASSA_VPRO_CAP(B.ESERCIZIO,B.CAPITOLO,B.ARTICOLO,'LI') < 0) ");
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
            IMDB.set_Value(IMDBDef5.TBL_PARS48, IMDBDef5.FLD_PARS48_NOMEOGGETDAL, 0, IDL.Add(IDL.Sub(v_NUMULTLIQ, v_NUMLIQUIDATE), (new IDVariant(1))));
            IMDB.set_Value(IMDBDef5.TBL_PARS48, IMDBDef5.FLD_PARS48_NOMEOGGETTAL, 0, new IDVariant(v_NUMULTLIQ));
            MainFrm.Show(MyGlb.FRM_CACODINEDAAL, (new IDVariant(-1)).intValue(), this); 
          }
        }
        else
        {
          MainFrm.Cf4armDBObject.CommitTrans();
        }
        if (v_NUMSTATOSIOP.equals((new IDVariant(1)), true))
        {
          IDVariant v_AVVISOSTATOS = new IDVariant(0,IDVariant.STRING);
          v_AVVISOSTATOS = (new IDVariant("Attenzione: Sono state emesse liquidazioni senza Codice Gestionale!", IDVariant.STRING));
          IDVariant v_AVVISTATLIV5 = new IDVariant(0,IDVariant.STRING);
          v_AVVISTATLIV5 = (new IDVariant("Attenzione: Sono state emesse liquidazioni senza Codice Livello 5!"));
          if (MainFrm.SIOPEATTIARM.booleanValue())
          {
            v_STRSTATOSIOP = IDL.Add(v_AVVISTATLIV5, (new IDVariant("<BR/>")));
          }
          else
          {
            v_STRSTATOSIOP = IDL.Add(v_AVVISOSTATOS, (new IDVariant("<BR/>")));
          }
        }
        else
        {
          v_STRSTATOSIOP = (new IDVariant(" "));
        }
        if (MainFrm.FINANZIAMENT.booleanValue())
        {
          if (v_ANTICIPAZION.compareTo((new IDVariant(0)), true)!=0)
          {
            IDVariant v_AVVISOANT = new IDVariant(0,IDVariant.STRING);
            v_AVVISOANT = (new IDVariant("Sono presenti casi di anticipazione sui finanziamenti!", IDVariant.STRING));
            v_STRANTICIPAZ = IDL.Add(v_AVVISOANT, (new IDVariant("<BR/>")));
          }
          else
          {
            v_STRANTICIPAZ = (new IDVariant(" "));
          }
          if (v_NOFINANZIAME.compareTo((new IDVariant(0)), true)!=0)
          {
            IDVariant v_AVVISOFIN = new IDVariant(0,IDVariant.STRING);
            v_AVVISOFIN = (new IDVariant("Sono state emesse liquidazioni senza finanziamento!", IDVariant.STRING));
            v_STRFINANZIAM = IDL.Add(v_AVVISOFIN, (new IDVariant("<BR/>")));
          }
          else
          {
            v_STRFINANZIAM = (new IDVariant(" "));
          }
        }
        else
        {
          v_STRANTICIPAZ = (new IDVariant(" "));
          v_STRFINANZIAM = (new IDVariant(" "));
        }
        if (v_NUMLIQUIDATE.equals((new IDVariant(1)), true))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Emessa liquidazione numero ", IDVariant.STRING));
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CONFERMA, (new IDVariant("<BR/>"))), v_AVVISO), IDL.ToString(v_NUMULTLIQ)), (new IDVariant("<BR/>"))), v_STRANTICIPAZ), v_STRFINANZIAM), v_STRSTATOSIOP)); 
        }
        else
        {
          if (v_NUMLIQUIDATE.equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Nessuna liquidazione emessa!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
          }
          else
          {
            IDVariant v_EMESSE = new IDVariant(0,IDVariant.STRING);
            v_EMESSE = (new IDVariant("Emesse n° ", IDVariant.STRING));
            IDVariant v_LIQUIDAZIONI = new IDVariant(0,IDVariant.STRING);
            v_LIQUIDAZIONI = (new IDVariant(" liquidazioni. ", IDVariant.STRING));
            IDVariant v_DALLANUMERO = new IDVariant(0,IDVariant.STRING);
            v_DALLANUMERO = (new IDVariant("Dalla numero ", IDVariant.STRING));
            IDVariant v_ALLANUMERO = new IDVariant(0,IDVariant.STRING);
            v_ALLANUMERO = (new IDVariant(" alla numero ", IDVariant.STRING));
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CONFERMA, (new IDVariant("<BR/>"))), v_EMESSE), IDL.ToString(v_NUMLIQUIDATE)), v_LIQUIDAZIONI), (new IDVariant("<BR/>"))), v_DALLANUMERO), IDL.ToString(IDL.Add(IDL.Sub(v_NUMULTLIQ, v_NUMLIQUIDATE), (new IDVariant(1))))), v_ALLANUMERO), IDL.ToString(v_NUMULTLIQ)), (new IDVariant("<BR/>"))), v_STRANTICIPAZ), v_STRFINANZIAM), v_STRSTATOSIOP);
            MainFrm.set_AlertMessage(v_MESSAGGIO); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniCassaEco", "Elabora", _e);
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
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniCassaEco", "SelezioneDelibere", _e);
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
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniCassaEco", "SelezioneProposte", _e);
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
      MainFrm.ErrObj.ProcError ("EmissioneLiquidazioniCassaEco", "SceltaCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void EMILIQCASECO_PARAMETRI298() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI298_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI297, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI297, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI298_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI298_RS, 0, IMDBDef5.TBL_PARAMETRI297, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 0, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 1, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 2, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_ANNO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 3, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_UNITA_PROPONENTE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 4, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_NUMERO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 5, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_ANNO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 6, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_UFFICIO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 7, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_CAUSALE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 8, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_BOLLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 9, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAMNUMQUIE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 10, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAMCENTRO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 11, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAMINEMISS, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 12, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARADATALIQU, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 13, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_SPESE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 14, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_COMMISSIONI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 15, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARAMSCADENZ, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 16, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_ALLEGATI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 17, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_INFO_TESORIERE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI298_RS, 18, 0, IMDBDef5.TBL_PARAMETRI297, IMDBDef5.FLD_PARAMETRI297_PARINTLIQUNI, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI297, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI297, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI297, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI298_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_SCEGPROPLABE)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_NUMQUIETANZA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaQuietanza();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORALABEL)
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "F04A3D1A-B33F-40FB-81A5-39975F52EEEE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "Provvedimento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 240, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, MyGlb.PANEL_FORM, 16, 15, 604, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0, 87);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 29);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, "E92E5B65-5917-4571-BB80-DA1E4613CFBC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, "Delibera");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "9ADF52B7-E842-422B-8985-3A43C090526F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "Sede Del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, "9159C039-225A-4234-8174-620EC6EE2002");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "6BE59509-30D3-4613-9AE5-1403543CEFAF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "Numero Del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, "0128DD67-F363-41BC-BDF2-0AB1454D5786");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "D3FDE18C-1F9D-4743-A06B-8050466147EA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "Anno Del");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, "F9C1A34C-4EE5-4B64-ABBA-57382507E4D7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, "99B5DF45-DEE3-4E74-A162-E2F4DB6B3CB9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, "Proposta");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "A9D59447-3880-4F72-8232-B89B198FF544");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "Unita Proponente");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATPROPLABE, "6FA7FABC-19DD-409F-9907-853826842EEA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATPROPLABE, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATPROPLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATPROPLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "7A261CF8-12A8-4CBC-AC68-0E89A61734B6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "Numero Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRPROPLABE, "C4E1B165-AFB5-414A-9E49-856C86495912");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRPROPLABE, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRPROPLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRPROPLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "3B5CF62C-CC8D-4119-B67C-991B0F7EC42A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "Anno Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, "316CF1BF-CA19-4CE9-A63B-748C14473F09");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "747B6BDE-CB86-476D-BF29-7EBE0A6BE095");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "D634F449-63F1-4CC6-B9D0-E9B7539704B2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "Causale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "65C2C19A-114F-4910-A961-1127F1BD447D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "Bollo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, "88187B42-CA5C-4D03-B1DD-182BE3A2AE9A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, "Quietanza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, "F5361B8F-8475-4294-987F-8E9033EE9502");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, "T02 DESCRIZIONE");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, "60E3E871-C0A9-4DA8-9603-D658F468FA73");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, "In Emissione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATALIQUIDAZ, "95A14932-4623-4B6B-96AC-EF7263EF9CED");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATALIQUIDAZ, "Data Liquidazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATALIQUIDAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATALIQUIDAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATALIQUIDAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "93058A5A-C6B0-42C6-A36F-3804EB7CFD57");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "Spese");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, "E89FF5E8-4134-4312-9B9D-B2DA4A655BA7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, "Commissioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, "324650A5-C6C4-42D0-A115-88879328C70C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, "Scadenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, "06A4D631-9AEA-48EA-8E47-D9E68B36D3C9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, "Allegati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, "30D4AD07-190E-4CDF-9392-2DC540F86655");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, "Info Tesoriere");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, "24A4B767-306A-4574-910D-190D8D0B9C44");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, "290F7F89-CA13-4025-A437-80AF805A8761");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, "Centro");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTELIQUUNIC, "7A8A8D9B-9AE5-4CF5-933E-3275830ADE2B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTELIQUUNIC, "Intestatario Liquidazione Unico");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTELIQUUNIC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTELIQUUNIC, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTELIQUUNIC, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 20, 8, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 20, 40, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERLABEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERLABEL, -1, "", "DELIBERLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_LIST, "Sd. Dl.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 100, 40, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDEDEL, MyGlb.PANEL_FORM, "Sd. Del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SEDEDEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SEDEDEL, PPQRY_PARAMETRI298, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_LIST, 36, 24, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_FORM, 152, 40, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATDELILABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATDELILABE, -1, "", "TRATDELILABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_LIST, "N. D.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 172, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODEL, MyGlb.PANEL_FORM, "Numero Del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODEL, PPQRY_PARAMETRI298, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_LIST, 28, 16, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_FORM, 220, 40, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRDELILABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRDELILABE, -1, "", "BARRDELILABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_LIST, "An. D.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 240, 40, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODEL, MyGlb.PANEL_FORM, "Ann. Del");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODEL, PPQRY_PARAMETRI298, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_LIST, 264, 44, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_FORM, 276, 44, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCEGDELILABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCEGDELILABE, -1, "", "SCEGDELILABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_SCEGDELILABE, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_LIST, 28, 16, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_FORM, 300, 40, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROPOSTLABEL, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROPOSTLABEL, -1, "", "PROPOSTLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_LIST, "U. Pr.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 364, 40, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UNITAPROPONE, MyGlb.PANEL_FORM, "Un. Propon.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UNITAPROPONE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UNITAPROPONE, PPQRY_PARAMETRI298, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATPROPLABE, MyGlb.PANEL_LIST, 44, 32, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATPROPLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATPROPLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATPROPLABE, MyGlb.PANEL_FORM, 476, 40, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATPROPLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATPROPLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATPROPLABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATPROPLABE, -1, "", "TRATPROPLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 160, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_LIST, "N. Pr.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 496, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROPOS, MyGlb.PANEL_FORM, "Num. Prop.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROPROPOS, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROPROPOS, PPQRY_PARAMETRI298, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRPROPLABE, MyGlb.PANEL_LIST, 36, 24, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRPROPLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRPROPLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRPROPLABE, MyGlb.PANEL_FORM, 544, 40, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRPROPLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BARRPROPLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BARRPROPLABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BARRPROPLABE, -1, "", "BARRPROPLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 200, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. Pr.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 564, 40, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Ann. Prop.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOPROPOSTA, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOPROPOSTA, PPQRY_PARAMETRI298, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, MyGlb.PANEL_LIST, 272, 52, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, MyGlb.PANEL_FORM, 600, 44, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGPROPLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCEGPROPLABE, -1, GRP_PARAMETRI_PROVVEDIMENT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCEGPROPLABE, -1, "", "SCEGPROPLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_SCEGPROPLABE, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Uff.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 44, 68, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_PARAMETRI298, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, "Caus.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 36, 92, 580, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAUSALE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAUSALE, PPQRY_PARAMETRI298, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 432, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 52, 116, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BOLLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BOLLO, PPQRY_PARAMETRI298, "A.BOLLO", "BOLLO", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, MyGlb.PANEL_FORM, 20, 236, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMQUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMQUIETANZA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMQUIETANZA, PPQRY_PARAMETRI298, "A.PARAMNUMQUIE", "PARAMNUMQUIE", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, MyGlb.PANEL_LIST, "T02 DESCRIZIONE");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, MyGlb.PANEL_FORM, 156, 236, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_T02DESCRIZIO, MyGlb.PANEL_FORM, "T02 DESCRIZIONE");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_T02DESCRIZIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_T02DESCRIZIO, PPQRY_QTN, "B.DESCRIZIONE", "QTNT02DESCRI", 5, 40, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, 544, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_LIST, "In Emiss.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, 16, 140, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INEMISSIONE, MyGlb.PANEL_FORM, "In Emissione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INEMISSIONE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INEMISSIONE, PPQRY_PARAMETRI298, "A.PARAMINEMISS", "PARAMINEMISS", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_INEMISSIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_INEMISSIONE, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATALIQUIDAZ, MyGlb.PANEL_LIST, 592, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATALIQUIDAZ, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATALIQUIDAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATALIQUIDAZ, MyGlb.PANEL_LIST, "Data Liquidazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATALIQUIDAZ, MyGlb.PANEL_FORM, 420, 140, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATALIQUIDAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATALIQUIDAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATALIQUIDAZ, MyGlb.PANEL_FORM, "Data Liquidazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATALIQUIDAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATALIQUIDAZ, PPQRY_PARAMETRI298, "A.PARADATALIQU", "PARADATALIQU", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 712, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 40, 260, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SPESE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SPESE, PPQRY_PARAMETRI298, "A.SPESE", "SPESE", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_LIST, 752, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_LIST, "Commissioni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_FORM, 424, 260, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_COMMISSIONI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_COMMISSIONI, PPQRY_PARAMETRI298, "A.COMMISSIONI", "COMMISSIONI", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_COMMISSIONI, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, 856, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, 24, 164, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCADENZA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCADENZA, PPQRY_PARAMETRI298, "A.PARAMSCADENZ", "PARAMSCADENZ", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, 4, 264, 472, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, 40, 188, 576, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ALLEGATI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ALLEGATI, PPQRY_PARAMETRI298, "A.ALLEGATI", "ALLEGATI", 5, 150, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_LIST, 4, 288, 472, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_FORM, 8, 212, 608, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFOTESORIER, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFOTESORIER, PPQRY_PARAMETRI298, "A.INFO_TESORIERE", "INFO_TESORIERE", 5, 200, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 468, 332, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 536, 300, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORALABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORALABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORALABEL, -1, "", "ELABORALABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_FORM, 4, 312, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_FORM, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CENTRO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CENTRO, PPQRY_PARAMETRI298, "A.PARAMCENTRO", "PARAMCENTRO", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTELIQUUNIC, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTELIQUUNIC, MyGlb.PANEL_LIST, 184);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTELIQUUNIC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTELIQUUNIC, MyGlb.PANEL_LIST, "Intestatario Liquidazione Unico");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTELIQUUNIC, MyGlb.PANEL_FORM, 4, 336, 228, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTELIQUUNIC, MyGlb.PANEL_FORM, 184);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTELIQUUNIC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INTELIQUUNIC, MyGlb.PANEL_FORM, "Intestatario Liquidazione Unico");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INTELIQUUNIC, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INTELIQUUNIC, PPQRY_PARAMETRI298, "A.PARINTLIQUNI", "PARINTLIQUNI", 5, 1, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 7);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CENTRIDESCRI ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~PARAMCENTRO~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR (A.DATA_VALIDITA >= TRUNC( SYSDATE ))) ");
    PAN_PARAMETRI.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as QTNT02DESCRI ");
    SQL.append("from ");
    SQL.append("  QTN A, ");
    SQL.append("  T02 B ");
    SQL.append("where (B.CODICE(+) = A.TIPO_QUIETANZA) ");
    SQL.append("and   (A.CODICE = ~~TBL_PARAMETRI297.PARAMECONOMO~~) ");
    SQL.append("and   (A.NUM_QUIETANZA = ~~PARAMNUMQUIE~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_QTN, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_QTN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_QTN, "QTN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~UFFICIO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAMETRI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~CAUSALE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T58, 0, SQL, PFL_PARAMETRI_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T58, 1, SQL, PFL_PARAMETRI_CAUSALE, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~BOLLO~~) ");
    SQL.append("and   (A.TIPO = 'L') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T60, 0, SQL, PFL_PARAMETRI_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.TIPO = 'L') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T60, 1, SQL, PFL_PARAMETRI_BOLLO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~SPESE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_PARAMETRI_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_PARAMETRI_SPESE, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI298", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI298, IMDBDef14.PQRY_PARAMETRI298_RS, IMDBDef5.TBL_PARAMETRI297);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SEDEDEL, IMDBDef5.FLD_PARAMETRI297_SEDE_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODEL, IMDBDef5.FLD_PARAMETRI297_NUMERO_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODEL, IMDBDef5.FLD_PARAMETRI297_ANNO_DEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UNITAPROPONE, IMDBDef5.FLD_PARAMETRI297_UNITA_PROPONENTE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROPROPOS, IMDBDef5.FLD_PARAMETRI297_NUMERO_PROPOSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOPROPOSTA, IMDBDef5.FLD_PARAMETRI297_ANNO_PROPOSTA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef5.FLD_PARAMETRI297_UFFICIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAUSALE, IMDBDef5.FLD_PARAMETRI297_CAUSALE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_BOLLO, IMDBDef5.FLD_PARAMETRI297_BOLLO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMQUIETANZA, IMDBDef5.FLD_PARAMETRI297_PARAMNUMQUIE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_INEMISSIONE, IMDBDef5.FLD_PARAMETRI297_PARAMINEMISS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATALIQUIDAZ, IMDBDef5.FLD_PARAMETRI297_PARADATALIQU);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SPESE, IMDBDef5.FLD_PARAMETRI297_SPESE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_COMMISSIONI, IMDBDef5.FLD_PARAMETRI297_COMMISSIONI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SCADENZA, IMDBDef5.FLD_PARAMETRI297_PARAMSCADENZ);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ALLEGATI, IMDBDef5.FLD_PARAMETRI297_ALLEGATI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_INFOTESORIER, IMDBDef5.FLD_PARAMETRI297_INFO_TESORIERE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CENTRO, IMDBDef5.FLD_PARAMETRI297_PARAMCENTRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_INTELIQUUNIC, IMDBDef5.FLD_PARAMETRI297_PARINTLIQUNI);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI297");
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
