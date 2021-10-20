// **********************************************
// Esportazione Dati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EsportazioneDati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CFESTRASELEC_STATO = 0;
  private static int PFL_CFESTRASELEC_SELECTSQL = 1;
  private static int PFL_CFESTRASELEC_DESCRIZIONE = 2;
  private static int PFL_CFESTRASELEC_NOTE = 3;
  private static int PFL_CFESTRASELEC_DATAINIZVALI = 4;
  private static int PFL_CFESTRASELEC_DATAFINEVALI = 5;
  private static int PFL_CFESTRASELEC_UTENTEINSERI = 6;
  private static int PFL_CFESTRASELEC_DATAINSERIME = 7;
  private static int PFL_CFESTRASELEC_UTENTULTIAGG = 8;
  private static int PFL_CFESTRASELEC_DATAULTIMAGG = 9;
  private static int PFL_CFESTRASELEC_ID = 10;
  private static int PFL_CFESTRASELEC_NOMEFILEEXPO = 11;
  private static int PFL_CFESTRASELEC_CATEGORIA = 12;
  private static int PFL_CFESTRASELEC_CODICE = 13;
  private static int PFL_CFESTRASELEC_FILEASSOCIAT = 14;
  private static int PFL_CFESTRASELEC_ETICFILEASSO = 15;
  private static int PFL_CFESTRASELEC_ULTIMAESTRAZ = 16;
  private static int PFL_CFESTRASELEC_TITOLO = 17;
  private static int PFL_CFESTRASELEC_IDHELP = 18;
  private static int PFL_CFESTRASELEC_SELECTSQLSOS = 19;
  private static int PFL_CFESTRASELEC_HELP = 20;
  private static int PFL_CFESTRASELEC_INFO = 21;

  private static int PPQRY_CFESTRASELE6 = 0;


  IDPanel PAN_CFESTRASELEC;
  private static int PFL_PARAMESELECT_IMDBNOME = 0;
  private static int PFL_PARAMESELECT_TIPO = 1;
  private static int PFL_PARAMESELECT_IMDBVALORE = 2;
  private static int PFL_PARAMESELECT_IMDBVALODATA = 3;
  private static int PFL_PARAMESELECT_IMDBVALODEFA = 4;
  private static int PFL_PARAMESELECT_ESPORTAEXCEL = 5;
  private static int PFL_PARAMESELECT_ESPORTAPDF = 6;
  private static int PFL_PARAMESELECT_IMDBID = 7;
  private static int PFL_PARAMESELECT_IMDBIDSELECT = 8;
  private static int PFL_PARAMESELECT_IMDBDESCRIZI = 9;
  private static int PFL_PARAMESELECT_IMDBSTATO = 10;
  private static int PFL_PARAMESELECT_IMDBUTENINSE = 11;
  private static int PFL_PARAMESELECT_IMDBDATAINSE = 12;
  private static int PFL_PARAMESELECT_IMDUTEULTAGG = 13;
  private static int PFL_PARAMESELECT_IMDDATULTAGG = 14;
  private static int PFL_PARAMESELECT_ESPORTACSV = 15;
  private static int PFL_PARAMESELECT_BOTTONEQUERY = 16;
  private static int PFL_PARAMESELECT_BOTTPROVSELE = 17;

  private static int PPQRY_CFESTRPARSE3 = 0;


  IDPanel PAN_PARAMESELECT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI98(IMDB);
    //
    //
    Init_PQRY_CFESTRASELE6(IMDB);
    Init_PQRY_CFESTRPARSE3(IMDB);
    Init_PQRY_CFESTRPARSE3_RS(IMDB);
    Init_QRY_CFESTAPPPAS1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI98(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI98, 1);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI98, "TBL_PARAMETRI98");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI98,IMDBDef7.FLD_PARAMETRI98_NOMEOGGSELID, "NOMEOGGSELID");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI98,IMDBDef7.FLD_PARAMETRI98_NOMEOGGSELID,3,19,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI98, 0);
  }

  private static void Init_PQRY_CFESTRASELE6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CFESTRASELE6, 21);
    IMDB.set_TblCode(IMDBDef17.PQRY_CFESTRASELE6, "PQRY_CFESTRASELE6");
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_ID, "ID");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_ID,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_TITOLO,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_DESCRIZIONE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_CATEGORIA,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_STATO,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_SELECT_SQL, "SELECT_SQL");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_SELECT_SQL,9,9999,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_NOTE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_DATA_INIZIO_VALIDITA, "DATA_INIZIO_VALIDITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_DATA_INIZIO_VALIDITA,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_DATA_FINE_VALIDITA, "DATA_FINE_VALIDITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_DATA_FINE_VALIDITA,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_DATA_INSERIMENTO,6,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_NOME_FILE_EXPORT, "NOME_FILE_EXPORT");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_NOME_FILE_EXPORT,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_CFESTRSELCOD, "CFESTRSELCOD");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_CFESTRSELCOD,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_CFESTSELIDHE, "CFESTSELIDHE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_CFESTSELIDHE,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_HELP, "HELP");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_HELP,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_SELECTSQLSOS, "SELECTSQLSOS");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_SELECTSQLSOS,9,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_INFO, "INFO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_INFO,5,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_ULTIMAESTRAZ, "ULTIMAESTRAZ");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_ULTIMAESTRAZ,8,0,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_CFESTSELFIAS, "CFESTSELFIAS");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRASELE6,IMDBDef17.PQSL_CFESTRASELE6_CFESTSELFIAS,10,9999,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_CFESTRASELE6, 0);
  }

  private static void Init_PQRY_CFESTRPARSE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CFESTRPARSE3, 14);
    IMDB.set_TblCode(IMDBDef17.PQRY_CFESTRPARSE3, "PQRY_CFESTRPARSE3");
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_ID, "ID");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_ID,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_ID_SELECT, "ID_SELECT");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_ID_SELECT,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_NOME, "NOME");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_NOME,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_DESCRIZIONE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_SEQUENZA, "SEQUENZA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_SEQUENZA,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_TIPO,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_VALORE, "VALORE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_VALORE,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_VALORE_DEFAULT, "VALORE_DEFAULT");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_VALORE_DEFAULT,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_STATO,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_NOMOGGIMVADA, "NOMOGGIMVADA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3,IMDBDef17.PQSL_CFESTRPARSE3_NOMOGGIMVADA,6,10,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_CFESTRPARSE3, 0);
  }

  private static void Init_PQRY_CFESTRPARSE3_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 14);
    IMDB.set_TblCode(IMDBDef17.PQRY_CFESTRPARSE3_RS, "PQRY_CFESTRPARSE3_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_ID, "ID");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_ID,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_ID_SELECT, "ID_SELECT");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_ID_SELECT,3,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_NOME, "NOME");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_NOME,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_DESCRIZIONE,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_SEQUENZA, "SEQUENZA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_SEQUENZA,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_TIPO,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_VALORE, "VALORE");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_VALORE,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_VALORE_DEFAULT, "VALORE_DEFAULT");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_VALORE_DEFAULT,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_STATO,5,20,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_NOMOGGIMVADA, "NOMOGGIMVADA");
    IMDB.SetFldParams(IMDBDef17.PQRY_CFESTRPARSE3_RS,IMDBDef17.PQSL_CFESTRPARSE3_NOMOGGIMVADA,6,10,0);
  }

  private static void Init_QRY_CFESTAPPPAS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.QRY_CFESTAPPPAS1, 9);
    IMDB.set_TblCode(IMDBDef17.QRY_CFESTAPPPAS1, "QRY_CFESTAPPPAS1");
    IMDB.set_FldCode(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMEOGGIMDID, "NOMEOGGIMDID");
    IMDB.SetFldParams(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMEOGGIMDID,3,19,0);
    IMDB.set_FldCode(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMIDSE, "NOMOGGIMIDSE");
    IMDB.SetFldParams(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMIDSE,3,19,0);
    IMDB.set_FldCode(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMDNOM, "NOMOGGIMDNOM");
    IMDB.SetFldParams(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMDNOM,5,100,0);
    IMDB.set_FldCode(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMDDES, "NOMOGGIMDDES");
    IMDB.SetFldParams(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMDDES,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMDSEQ, "NOMOGGIMDSEQ");
    IMDB.SetFldParams(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMDSEQ,2,15,0);
    IMDB.set_FldCode(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMDTIP, "NOMOGGIMDTIP");
    IMDB.SetFldParams(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMDTIP,5,50,0);
    IMDB.set_FldCode(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMVADE, "NOMOGGIMVADE");
    IMDB.SetFldParams(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMVADE,5,100,0);
    IMDB.set_FldCode(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMDVAL, "NOMOGGIMDVAL");
    IMDB.SetFldParams(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMDVAL,5,100,0);
    IMDB.set_FldCode(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMVADA, "NOMOGGIMVADA");
    IMDB.SetFldParams(IMDBDef17.QRY_CFESTAPPPAS1,IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMVADA,6,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EsportazioneDati(MyWebEntryPoint w, IMDBObj imdb)
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
  public EsportazioneDati()
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
    FormIdx = MyGlb.FRM_ESPORTAZDATI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2FC49BFC-68DC-4C89-B6B4-1C0BDE0A912E";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2050;
    DesignWidth = 928;
    DesignHeight = 720;
    set_Caption(new IDVariant("Esportazione Dati"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 928;
    Frames[1].Height = 720;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.347222;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 928;
    Frames[2].Height = 250;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "CF ESTRAI SELECT";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 250;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_CFESTRASELEC = new IDPanel(w, this, 2, "PAN_CFESTRASELEC");
    Frames[2].Content = PAN_CFESTRASELEC;
    PAN_CFESTRASELEC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CFESTRASELEC.VS = MainFrm.VisualStyleList;
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 928-MyGlb.PAN_OFFS_X, 250-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D8324498-8CDF-4F79-86FF-76ED533BB32F");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 100, 792, 384, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CFESTRASELEC.InitStatus = 2;
    PAN_CFESTRASELEC_Init();
    PAN_CFESTRASELEC_InitFields();
    PAN_CFESTRASELEC_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 928;
    Frames[3].Height = 470;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Parametri";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 470;
    Frames[3].MinHeight = Frames[3].Height;
    Frames[3].MaxHeight = Frames[3].Height;
    PAN_PARAMESELECT = new IDPanel(w, this, 3, "PAN_PARAMESELECT");
    Frames[3].Content = PAN_PARAMESELECT;
    PAN_PARAMESELECT.ShowStatusbar = false;
    PAN_PARAMESELECT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMESELECT.VS = MainFrm.VisualStyleList;
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 928-MyGlb.PAN_OFFS_X, 470-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "89B3B04C-7497-48D8-BACD-200792435C24");
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 756, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMESELECT.InitStatus = 2;
    PAN_PARAMESELECT_Init();
    PAN_PARAMESELECT_InitFields();
    PAN_PARAMESELECT_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_NUOVAESTRAZI+BaseCmdLinIdx)
      {
        ((AlberoEstrazioni)MainFrm.GetForm(MyGlb.FRM_ALBEROESTRAZ,0)).NuovaEstrazione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DUPLICESTRAZ+BaseCmdLinIdx)
      {
        ((AlberoEstrazioni)MainFrm.GetForm(MyGlb.FRM_ALBEROESTRAZ,0)).DuplicaEstrazione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CANCELESTRAZ+BaseCmdLinIdx)
      {
        ((AlberoEstrazioni)MainFrm.GetForm(MyGlb.FRM_ALBEROESTRAZ,0)).CancellaEstrazioneSelect();
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
      if (IMDB.TblModified(IMDBDef7.TBL_CFESTAPPPASE, MyGlb.GlbRefModIdx) || IMDB.TblModified(IMDBDef17.PQRY_CFESTRASELE6, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESPORTAZDATI_CFESTRPARSE3();
      }
      PAN_CFESTRASELEC.UpdatePanel(MainFrm);
      PAN_PARAMESELECT.UpdatePanel(MainFrm);
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
    return (obj instanceof EsportazioneDati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EsportazioneDati.class.getName() : (Glb.ClassWithPackage(EsportazioneDati.class) ? EsportazioneDati.class.getName().substring(EsportazioneDati.class.getPackage().getName().length() + 1) : EsportazioneDati.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Estrai Csv
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EstraiCsv ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C6;

    try
    {
      TransCount = 0;
      // 
      // Estrai Csv Body
      // Corpo Procedura
      // 
      IDVariant v_VTIMESTSCORR = new IDVariant(0,IDVariant.DATETIME);
      IDVariant v_VTIMESTAMPCO = new IDVariant(0,IDVariant.DATETIME);
      PAN_CFESTRASELEC.PanelCommand(Glb.PCM_REQUERY);
      IDCachedRowSet R = null;
      R = (IDCachedRowSet)new IDCachedRowSet();
      v_VTIMESTSCORR = IDL.Time();
      R = EseguiSelect();
      v_VTIMESTAMPCO = IDL.Time();
      if (new IDVariant(R.RecordCount()).equals((new IDVariant(0)), true))
      {
        MainFrm.set_AlertMessage((new IDVariant("nessun risultato"))); 
      }
      else
      {
        R.MoveFirst();
        IDVariant v_FILEOUT = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NOMEFILE = new IDVariant(0,IDVariant.STRING);
        com.progamma.FileMangler v_FM = null;
        v_FM = (com.progamma.FileMangler)new com.progamma.FileMangler(MainFrm);
        v_FM.XLSEngine = (new IDVariant(0)).intValue();
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_NOME_FILE_EXPORT, 0)))
        {
          v_NOMEFILE = IDL.Add((new IDVariant("ESTRAZIONE_")), IDL.ToString(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_ID, 0)));
        }
        else
        {
          v_NOMEFILE = IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_NOME_FILE_EXPORT, 0);
        }
        v_FILEOUT = v_FM.writeCSV(MainFrm, R, IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/temp"))).stringValue(), v_NOMEFILE.stringValue());
        MainFrm.AddTempFile(v_FILEOUT.stringValue()); 
        MainFrm.set_RedirectTo(IDL.Add(IDL.Add((new IDVariant("temp/")), v_NOMEFILE), (new IDVariant(".csv"))));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
        IDVariant v_ID = new IDVariant(0,IDVariant.DECIMAL);
        MainFrm.Cf4armDBObject.CFESTRAILOGESECUZIONI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_SELECTSQLSOS, 0), IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_ID, 0), v_ID, IDL.Sub(v_VTIMESTAMPCO, v_VTIMESTSCORR));
        // 
        // salvo il risultato su tabella
        // 
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.ID_ESECUZIONE as ID_ESECUZIONE, ");
        SQL.append("  A.DATI_ESTRATTI as DATI_ESTRATTI ");
        SQL.append("from ");
        SQL.append("  CF_ESTRAI_ESECUZIONE_QUERY A ");
        SQL.append("where (A.ID_ESECUZIONE = " + IDL.CSql(v_ID, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        C6 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!C6.EOF()) C6.MoveNext();
        while (!C6.EOF())
        {
          C6.Set("DATI_ESTRATTI", Glb.LoadBlob(MainFrm,v_FILEOUT));
          C6.updateRow();
          C6.MoveNext();
        }
        MainFrm.Cf4armDBObject.DBO().UpdateRS("CF_ESTRAI_ESECUZIONE_QUERY", C6);
        C6.Close();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsportazioneDati", "EstraiCsv", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Estrai Xls
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EstraiXls ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C8;

    try
    {
      TransCount = 0;
      // 
      // Estrai Xls Body
      // Corpo Procedura
      // 
      IDCachedRowSet R = null;
      R = (IDCachedRowSet)new IDCachedRowSet();
      IDVariant v_VTIMESTSCORR = new IDVariant(0,IDVariant.DATETIME);
      IDVariant v_VTIMESTAMPCO = new IDVariant(0,IDVariant.DATETIME);
      v_VTIMESTSCORR = IDL.Time();
      R = EseguiSelect();
      v_VTIMESTAMPCO = IDL.Time();
      if (new IDVariant(R.RecordCount()).equals((new IDVariant(0)), true))
      {
        MainFrm.set_AlertMessage((new IDVariant("nessun risultato"))); 
      }
      else
      {
        R.MoveFirst();
        IDVariant v_NOMEFILE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_FILEOUT = new IDVariant(0,IDVariant.STRING);
        IDVariant v_FILEOUTXLS = new IDVariant(0,IDVariant.STRING);
        com.progamma.FileMangler v_FM = null;
        v_FM = (com.progamma.FileMangler)new com.progamma.FileMangler(MainFrm);
        v_FM.XLSEngine = (new IDVariant(0)).intValue();
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_NOME_FILE_EXPORT, 0)))
        {
          v_NOMEFILE = IDL.Add((new IDVariant("ESTRAZIONE_")), IDL.ToString(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_ID, 0)));
        }
        else
        {
          v_NOMEFILE = IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_NOME_FILE_EXPORT, 0);
        }
        v_FILEOUT = v_FM.writeCSV(MainFrm, R, IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/temp"))).stringValue(), v_NOMEFILE.stringValue());
        MainFrm.AddTempFile(v_FILEOUT.stringValue()); 
        v_FILEOUTXLS = IDL.Add(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/temp/"))), v_NOMEFILE), (new IDVariant(".xls")));
        if (VBFiles.FileExists(v_FILEOUTXLS))
        {
          VBFiles.Kill(v_FILEOUTXLS); 
        }
        try
        {
          it.finmatica.cfEstrai.ConvertiCsvXls C = null;
          C = (it.finmatica.cfEstrai.ConvertiCsvXls)new it.finmatica.cfEstrai.ConvertiCsvXls();
          C.converti(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/temp"))).stringValue(), v_NOMEFILE.stringValue(), v_NOMEFILE.stringValue()); 
        }
        catch (Exception e) {}
        MainFrm.AddTempFile(v_FILEOUTXLS.stringValue()); 
        MainFrm.set_RedirectTo(IDL.Add(IDL.Add((new IDVariant("temp/")), v_NOMEFILE), (new IDVariant(".xls"))));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
        IDVariant v_ID = new IDVariant(0,IDVariant.DECIMAL);
        MainFrm.Cf4armDBObject.CFESTRAILOGESECUZIONI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_SELECTSQLSOS, 0), IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_ID, 0), v_ID, IDL.Sub(v_VTIMESTAMPCO, v_VTIMESTSCORR));
        // 
        // salvo il risultato su tabella
        // 
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.ID_ESECUZIONE as ID_ESECUZIONE, ");
        SQL.append("  A.DATI_ESTRATTI as DATI_ESTRATTI ");
        SQL.append("from ");
        SQL.append("  CF_ESTRAI_ESECUZIONE_QUERY A ");
        SQL.append("where (A.ID_ESECUZIONE = " + IDL.CSql(v_ID, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        C8 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!C8.EOF()) C8.MoveNext();
        while (!C8.EOF())
        {
          C8.Set("DATI_ESTRATTI", Glb.LoadBlob(MainFrm,v_FILEOUTXLS));
          C8.updateRow();
          C8.MoveNext();
        }
        MainFrm.Cf4armDBObject.DBO().UpdateRS("CF_ESTRAI_ESECUZIONE_QUERY", C8);
        C8.Close();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsportazioneDati", "EstraiXls", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Estrai Pdf
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EstraiPdf ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C8;

    try
    {
      TransCount = 0;
      // 
      // Estrai Pdf Body
      // Corpo Procedura
      // 
      IDCachedRowSet R = null;
      R = (IDCachedRowSet)new IDCachedRowSet();
      IDVariant v_VTIMESTSCORR = new IDVariant(0,IDVariant.DATETIME);
      IDVariant v_VTIMESTAMPCO = new IDVariant(0,IDVariant.DATETIME);
      v_VTIMESTSCORR = IDL.Time();
      R = EseguiSelect();
      v_VTIMESTAMPCO = IDL.Time();
      if (new IDVariant(R.RecordCount()).equals((new IDVariant(0)), true))
      {
        MainFrm.set_AlertMessage((new IDVariant("nessun risultato"))); 
      }
      else
      {
        R.MoveFirst();
        IDVariant v_NOMEFILE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_FILEOUT = new IDVariant(0,IDVariant.STRING);
        IDVariant v_FILEOUTPDF = new IDVariant(0,IDVariant.STRING);
        com.progamma.FileMangler v_FM = null;
        v_FM = (com.progamma.FileMangler)new com.progamma.FileMangler(MainFrm);
        v_FM.XLSEngine = (new IDVariant(0)).intValue();
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_NOME_FILE_EXPORT, 0)))
        {
          v_NOMEFILE = IDL.Add((new IDVariant("ESTRAZIONE_")), IDL.ToString(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_ID, 0)));
        }
        else
        {
          v_NOMEFILE = IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_NOME_FILE_EXPORT, 0);
        }
        v_FILEOUT = v_FM.writeCSV(MainFrm, R, IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/temp"))).stringValue(), v_NOMEFILE.stringValue());
        MainFrm.AddTempFile(v_FILEOUT.stringValue()); 
        v_FILEOUTPDF = IDL.Add(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), v_NOMEFILE), (new IDVariant(".pdf")));
        if (VBFiles.FileExists(v_FILEOUTPDF))
        {
          VBFiles.Kill(v_FILEOUTPDF); 
        }
        try
        {
          it.finmatica.cfEstrai.ConvertiCsvPdf C = null;
          C = (it.finmatica.cfEstrai.ConvertiCsvPdf)new it.finmatica.cfEstrai.ConvertiCsvPdf();
          C.converti(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/temp"))).stringValue(), v_NOMEFILE.stringValue(), v_NOMEFILE.stringValue()); 
        }
        catch (Exception e) {}
        MainFrm.AddTempFile(v_FILEOUTPDF.stringValue()); 
        MainFrm.set_RedirectTo(IDL.Add(IDL.Add((new IDVariant("temp/")), v_NOMEFILE), (new IDVariant(".pdf"))));
        MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
        MainFrm.set_RedirectFeatures((new IDVariant(""))); 
        IDVariant v_ID = new IDVariant(0,IDVariant.DECIMAL);
        MainFrm.Cf4armDBObject.CFESTRAILOGESECUZIONI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_SELECTSQLSOS, 0), IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_ID, 0), v_ID, IDL.Sub(v_VTIMESTAMPCO, v_VTIMESTSCORR));
        // 
        // salvo il risultato su tabella
        // 
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.ID_ESECUZIONE as ID_ESECUZIONE, ");
        SQL.append("  A.DATI_ESTRATTI as DATI_ESTRATTI ");
        SQL.append("from ");
        SQL.append("  CF_ESTRAI_ESECUZIONE_QUERY A ");
        SQL.append("where (A.ID_ESECUZIONE = " + IDL.CSql(v_ID, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        C8 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!C8.EOF()) C8.MoveNext();
        while (!C8.EOF())
        {
          C8.Set("DATI_ESTRATTI", Glb.LoadBlob(MainFrm,v_FILEOUT));
          C8.updateRow();
          C8.MoveNext();
        }
        MainFrm.Cf4armDBObject.DBO().UpdateRS("CF_ESTRAI_ESECUZIONE_QUERY", C8);
        C8.Close();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsportazioneDati", "EstraiPdf", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Estrai Csv Anteprima
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EstraiCsvAnteprima ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C12;

    try
    {
      TransCount = 0;
      // 
      // Estrai Csv Anteprima Body
      // Corpo Procedura
      // 
      IDCachedRowSet R = null;
      R = (IDCachedRowSet)new IDCachedRowSet();
      IDVariant v_VTIMESTSCORR = new IDVariant(0,IDVariant.DATETIME);
      IDVariant v_VTIMESTAMPCO = new IDVariant(0,IDVariant.DATETIME);
      v_VTIMESTSCORR = IDL.Time();
      R = EseguiSelect();
      v_VTIMESTAMPCO = IDL.Time();
      if (new IDVariant(R.RecordCount()).equals((new IDVariant(0)), true))
      {
        MainFrm.set_AlertMessage((new IDVariant("nessun risultato"))); 
      }
      else
      {
        R.MoveFirst();
        IDVariant v_FILEOUT = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NOMEFILE = new IDVariant(0,IDVariant.STRING);
        com.progamma.FileMangler v_FM = null;
        v_FM = (com.progamma.FileMangler)new com.progamma.FileMangler(MainFrm);
        v_FM.XLSEngine = (new IDVariant(0)).intValue();
        if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_NOME_FILE_EXPORT, 0)))
        {
          v_NOMEFILE = IDL.Add((new IDVariant("ESTRAZIONE_")), IDL.ToString(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_ID, 0)));
        }
        else
        {
          v_NOMEFILE = IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_NOME_FILE_EXPORT, 0);
        }
        v_FILEOUT = v_FM.writeCSV(MainFrm, R, IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/temp"))).stringValue(), v_NOMEFILE.stringValue());
        IDVariant v_FD = new IDVariant(0,IDVariant.INTEGER);
        try
        {
          v_FD = MainFrm.VBFile.FreeFile();
          MainFrm.VBFile.OpenForInput(v_FILEOUT, v_FD); 
        }
        catch (Exception e7)
        {
          IDVariant S = null;
          S = (new IDVariant("Errore in fase di anteprima dati"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
        IDVariant v_NRIGA = null;
        v_NRIGA = (new IDVariant(1));
        IDVariant v_CURRLINE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CSV = new IDVariant(0,IDVariant.STRING);
        IDVariant C = new IDVariant(0,IDVariant.STRING);
        while (!(MainFrm.VBFile.EOF(v_FD)))
        {
          v_CURRLINE = MainFrm.VBFile.ReadLine(v_FD); 
          if (v_NRIGA.equals((new IDVariant(1)), true))
          {
            v_CSV = IDL.Add(IDL.Add(IDL.Add(v_CSV, (new IDVariant("<TR style=\"font-weight:bold\"><TD width=\"100%\" valign=\"top\" align=\"Left\" colspan=\"2\">"))), v_CURRLINE), (new IDVariant("</TR>")));
          }
          else
          {
            v_CSV = IDL.Add(IDL.Add(IDL.Add(v_CSV, (new IDVariant("<TR><TD width=\"100%\" valign=\"top\" align=\"Left\" colspan=\"2\">"))), v_CURRLINE), (new IDVariant("</TR>")));
          }
          v_NRIGA = IDL.Add(v_NRIGA, (new IDVariant(1)));
        }
        MainFrm.VBFile.Close(v_FD); 
        v_CSV = IDL.Replace(v_CSV, (new IDVariant("\"")), (new IDVariant("")));
        v_CSV = IDL.Replace(v_CSV, (new IDVariant(";")), (new IDVariant("</TD><TD width=\"100%\" valign=\"top\" align=\"Left\" colspan=\"2\">")));
        v_CSV = IDL.Add(IDL.Add((new IDVariant("<TABLE style=\"BORDER-COLLAPSE: collapse\" bordercolor=\"#111111\" cellspacing=\"2\" cellpadding=\"5\" width=\"100%\" border=\"1\">")), v_CSV), (new IDVariant("</TABLE>")));
        IMDB.set_Value(IMDBDef7.TBL_ANTEPRIMDATI, IMDBDef7.FLD_ANTEPRIMDATI_NOMOGGANTCSV, 0, new IDVariant(v_CSV));
        IDVariant v_ID = new IDVariant(0,IDVariant.DECIMAL);
        MainFrm.Cf4armDBObject.CFESTRAILOGESECUZIONI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_SELECTSQLSOS, 0), IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_ID, 0), v_ID, (IDL.Sub(v_VTIMESTAMPCO, v_VTIMESTSCORR)));
        // 
        // salvo il risultato su tabella
        // 
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.ID_ESECUZIONE as ID_ESECUZIONE, ");
        SQL.append("  A.DATI_ESTRATTI as DATI_ESTRATTI ");
        SQL.append("from ");
        SQL.append("  CF_ESTRAI_ESECUZIONE_QUERY A ");
        SQL.append("where (A.ID_ESECUZIONE = " + IDL.CSql(v_ID, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        C12 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!C12.EOF()) C12.MoveNext();
        while (!C12.EOF())
        {
          C12.Set("DATI_ESTRATTI", Glb.LoadBlob(MainFrm,v_FILEOUT));
          C12.updateRow();
          C12.MoveNext();
        }
        MainFrm.Cf4armDBObject.DBO().UpdateRS("CF_ESTRAI_ESECUZIONE_QUERY", C12);
        C12.Close();
        MainFrm.Show(MyGlb.FRM_ANTEPRIMDATI, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsportazioneDati", "EstraiCsvAnteprima", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Query
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriQuery ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Query Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMEOGGETPID, 0, IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_ID, 0));
      if ((new IDVariant(PAN_PARAMESELECT.FieldText(PFL_PARAMESELECT_BOTTONEQUERY))).equals((new IDVariant("Visualizza")), true))
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMOGGSOLVIS, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI64, IMDBDef7.FLD_PARAMETRI64_NOMOGGSOLVIS, 0, (new IDVariant()));
      }
      MainFrm.Show(MyGlb.FRM_VISUMODIESTR, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsportazioneDati", "ApriQuery", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Esegui Select
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public IDCachedRowSet EseguiSelect ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Esegui Select Body
      // Corpo Procedura
      // 
      // 
      // LOG delle esecuzioni
      // 
      IDPreparedStatement v_PS = null;
      v_PS = (IDPreparedStatement)new IDPreparedStatement();
      v_PS.SetCommand(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_SELECTSQLSOS, 0).stringValue()); 
      IDCachedRowSet R = null;
      R = (IDCachedRowSet)new IDCachedRowSet();
      try
      {
        R = MainFrm.Cf4armDBObject.DBO().ExecuteIDPS(v_PS, true);
      }
      catch (Exception e3)
      {
        MainFrm.set_AlertMessage((new IDVariant("Errore nell'esecuzione della query. Controllare i parametri di lancio"))); 
      }
      return R;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsportazioneDati", "EseguiSelect", _e);
      return null;
    }
  }

  // **********************************************************************
  // Riempi IMDB
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RiempiIMDB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi IMDB Body
      // Corpo Procedura
      // 
      RIEMPIIMDB_CFESAPPASEDE();
      RIEMPIIMDB_CFESAPPASII6();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsportazioneDati", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // CF ESTRAI APPOGGIO PARAMETRI SELECT: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_CFESAPPASEDE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef7.TBL_CFESTAPPPASE);
  }

  // **********************************************************************
  // CF ESTRAI APPOGGIO PARAMETRI SELECT: Insert into... select
  // Perchè stai inserendo questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_CFESAPPASII6() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID as CFESTPARSEID, ");
    SQL.append("  A.ID_SELECT as CFESTPARIDSE, ");
    SQL.append("  A.NOME as CFESTPARSENO, ");
    SQL.append("  A.DESCRIZIONE as CFESTPARSEDE, ");
    SQL.append("  A.SEQUENZA as CFESTPARSESE, ");
    SQL.append("  A.TIPO as CFESTPARSETI, ");
    SQL.append("  A.VALORE_DEFAULT as CFESPASEVADE, ");
    SQL.append("  A.STATO as CFESTPARSEST, ");
    SQL.append("  A.UTENTE_INSERIMENTO as CFESPASEUTIN, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as CFESPASEUTUA, ");
    SQL.append("  DECODE(A.VALORE_DEFAULT, NULL, A.VALORE, NVL(FN_ESTRAI_SQL(A.VALORE_DEFAULT), A.VALORE)) as IECEPSVDCEPS ");
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_PARAMETRI_SELECT A ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef7.TBL_CFESTAPPPASE, 0);
      IMDB.set_Value(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_ID,0,RS.Get(1));
      IMDB.set_Value(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_ID_SELECT,0,RS.Get(2));
      IMDB.set_Value(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_NOME,0,RS.Get(3));
      IMDB.set_Value(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_DESCRIZIONE,0,RS.Get(4));
      IMDB.set_Value(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_SEQUENZA,0,RS.Get(5));
      IMDB.set_Value(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_TIPO,0,RS.Get(6));
      IMDB.set_Value(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_VALORE_DEFAULT,0,RS.Get(7));
      IMDB.set_Value(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_STATO,0,RS.Get(8));
      IMDB.set_Value(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_UTENTE_INSERIMENTO,0,RS.Get(9));
      IMDB.set_Value(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_UTENTE_ULTIMO_AGG,0,RS.Get(10));
      IMDB.set_Value(IMDBDef7.TBL_CFESTAPPPASE,IMDBDef7.FLD_CFESTAPPPASE_VALORE,0,RS.Get(11));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Activate
  // Evento notificato alla videata quando essa viene attivata
  // cioè quando viene portata in primo piano
  // **********************************************************************
  public void Form_Activate()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.Form_Activate(this);
      // 
      // Activate Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef7.TBL_ANTEPRIMDATI, IMDBDef7.FLD_ANTEPRIMDATI_NOMOGGAGGPAN, 0).equals((new IDVariant("S")), true))
      {
        // PAN_CFESTRASELEC.PanelCommand(Glb.PCM_REQUERY);
        RiempiIMDB();
        PAN_PARAMESELECT.PanelCommand(Glb.PCM_REQUERY);
        IMDB.set_Value(IMDBDef7.TBL_ANTEPRIMDATI, IMDBDef7.FLD_ANTEPRIMDATI_NOMOGGAGGPAN, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsportazioneDati", "Activate", _e);
    }
  }

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
      // 
      // riempi imdb
      // 
      RiempiIMDB();
      IDVariant v_SELECTCARICA = new IDVariant(0,IDVariant.DECIMAL);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ID as CFESTRSELEID ");
      SQL.append("from ");
      SQL.append("  CF_ESTRAI_SELECT A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      v_SELECTCARICA = (QV.RecordCount()!=0 ? IDVariant.TRUE : IDVariant.FALSE);
      if (!QV.EOF())
      {
        v_SELECTCARICA = QV.Get("CFESTRSELEID", IDVariant.DECIMAL) ;
      }
      QV.Close();
      PAN_PARAMESELECT.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(0)).booleanValue())? Glb.PAN_FREEWHENHID : 0, Glb.PAN_FREEWHENHID); 
      if (IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_STATO, 0).equals((new IDVariant("S")), true))
      {
        PAN_PARAMESELECT.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IDVariant v_VALORE = null;
        v_VALORE = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.CHIAVE = 'INSERIMENTO') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VALORE = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_VALORE)) && MainFrm.GetAbilitazioni((new IDVariant("MODIFICA"))).equals((new IDVariant(-1)), true))
        {
          PAN_PARAMESELECT.set_FieldText(PFL_PARAMESELECT_BOTTONEQUERY, (new IDVariant("Modifica")).stringValue());
        }
        else
        {
          PAN_PARAMESELECT.set_FieldText(PFL_PARAMESELECT_BOTTONEQUERY, (new IDVariant("Visualizza")).stringValue());
        }
      }
      else
      {
        PAN_PARAMESELECT.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (MainFrm.GetAbilitazioni((new IDVariant("MODIFICA"))).equals((new IDVariant(-1)), true))
        {
          PAN_PARAMESELECT.set_FieldText(PFL_PARAMESELECT_BOTTONEQUERY, (new IDVariant("Modifica")).stringValue());
        }
        else
        {
          PAN_PARAMESELECT.set_FieldText(PFL_PARAMESELECT_BOTTONEQUERY, (new IDVariant("Visualizza")).stringValue());
        }
      }
      if (IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_CFESTSELFIAS, 0).equals((new IDVariant()), true))
      {
        PAN_CFESTRASELEC.SetFlags (Glb.OBJ_FIELD, PFL_CFESTRASELEC_ETICFILEASSO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CFESTRASELEC.SetFlags (Glb.OBJ_FIELD, PFL_CFESTRASELEC_ETICFILEASSO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsportazioneDati", "Load", _e);
    }
  }

  // **********************************************************************
  // On Send Message
  // Evento notificato quando una videata invia un messaggio
  // tramite la procedura SendMessage
  // Message - Input
  // Sender - Input
  // Doc - Input
  // Par 1 - Input
  // Par 2 - Input
  // Par 3 - Input
  // Par 4 - Input
  // **********************************************************************
  public void OnSendMessage(IDVariant Message, WebForm Sender, com.progamma.doc.IDDocument Doc, IDVariant Par1, IDVariant Par2, IDVariant Par3, IDVariant Par4)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // On Send Message Body
      // Corpo Procedura
      // 
      if (Message.equals((new IDVariant("Refresh")), true))
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI98, IMDBDef7.FLD_PARAMETRI98_NOMEOGGSELID, 0, new IDVariant(IDL.ToFloat(Par1),IDVariant.DECIMAL));
        PAN_CFESTRASELEC.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_PARAMESELECT.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_CFESTRASELEC.PanelCommand(Glb.PCM_REQUERY);
        RiempiIMDB();
        ONSENDMESSAG_CFESTAPPPAS1();
        while (!IMDB.Eof(IMDBDef17.QRY_CFESTAPPPAS1, 0))
        {
          SQL = new StringBuffer();
          SQL.append("update CF_ESTRAI_PARAMETRI_SELECT set ");
          SQL.append("  VALORE = " + IDL.CSql(IMDB.Value(IMDBDef17.QRY_CFESTAPPPAS1, IMDBDef17.QSL_CFESTAPPPAS1_NOMOGGIMDVAL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append("where (ID = " + IDL.CSql(IMDB.Value(IMDBDef17.QRY_CFESTAPPPAS1, IMDBDef17.QSL_CFESTAPPPAS1_NOMEOGGIMDID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          IMDB.TblMoveNext(IMDBDef17.QRY_CFESTAPPPAS1, 0);
        }
      }
      if (Message.equals((new IDVariant("NotVisible")), true))
      {
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI98, IMDBDef7.FLD_PARAMETRI98_NOMEOGGSELID, 0, (new IDVariant()));
        set_Visible((new IDVariant(0)).booleanValue());
        PAN_CFESTRASELEC.set_Visible((new IDVariant(0)).booleanValue());
        PAN_PARAMESELECT.set_Visible((new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsportazioneDati", "OnSendMessage", _e);
    }
  }

  // **********************************************************************
  // CF ESTRAI APPOGGIO PARAMETRI SELECT
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void ONSENDMESSAG_CFESTAPPPAS1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.QRY_CFESTAPPPAS1);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef7.TBL_CFESTAPPPASE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_CFESTAPPPASE, 0))
    {
      if (!(IDL.IsNull(IMDB.Value(IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_VALORE_DEFAULT, 0))))
      {
        IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
        IMDB.TblLinkRow(IMDBDef1.TMP_RECORDSET, 0, IMDBDef7.TBL_CFESTAPPPASE, 0);
        IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 0, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_ID, 0);
        IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 1, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_ID_SELECT, 0);
        IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 2, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_NOME, 0);
        IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 3, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_DESCRIZIONE, 0);
        IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 4, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_SEQUENZA, 0);
        IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 5, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_TIPO, 0);
        IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 6, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_VALORE_DEFAULT, 0);
        IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 7, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_VALORE, 0);
        IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 8, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_NOMOGGIMVADA, 0);
      }
      IMDB.TblMoveNext(IMDBDef7.TBL_CFESTAPPPASE, 0);
      if (IMDB.Eof(IMDBDef7.TBL_CFESTAPPPASE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_CFESTAPPPASE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef1.TMP_RECORDSET);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,0,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,1,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,2,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,3,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,4,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,5,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,6,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,7,true);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,8,true);
    IMDB.TblStartSort(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[9];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[9];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0);
          AggrBuff[1] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0);
          AggrBuff[2] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 2, 0);
          AggrBuff[3] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 3, 0);
          AggrBuff[4] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 4, 0);
          AggrBuff[5] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 5, 0);
          AggrBuff[6] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 6, 0);
          AggrBuff[7] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 7, 0);
          AggrBuff[8] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 8, 0);
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          AggrNewGroup = AggrNewGroup || !AggrBuff[0].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[1].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[2].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 2, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[3].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 3, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[4].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 4, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[5].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 5, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[6].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 6, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[7].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 7, 0));
          AggrNewGroup = AggrNewGroup || !AggrBuff[8].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 8, 0));
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef17.QRY_CFESTAPPPAS1, 0);
              IMDB.set_Value(IMDBDef17.QRY_CFESTAPPPAS1, 0, 0, AggrBuff[0]);
              IMDB.set_Value(IMDBDef17.QRY_CFESTAPPPAS1, 1, 0, AggrBuff[1]);
              IMDB.set_Value(IMDBDef17.QRY_CFESTAPPPAS1, 2, 0, AggrBuff[2]);
              IMDB.set_Value(IMDBDef17.QRY_CFESTAPPPAS1, 3, 0, AggrBuff[3]);
              IMDB.set_Value(IMDBDef17.QRY_CFESTAPPPAS1, 4, 0, AggrBuff[4]);
              IMDB.set_Value(IMDBDef17.QRY_CFESTAPPPAS1, 5, 0, AggrBuff[5]);
              IMDB.set_Value(IMDBDef17.QRY_CFESTAPPPAS1, 6, 0, AggrBuff[6]);
              IMDB.set_Value(IMDBDef17.QRY_CFESTAPPPAS1, 7, 0, AggrBuff[7]);
              IMDB.set_Value(IMDBDef17.QRY_CFESTAPPPAS1, 8, 0, AggrBuff[8]);
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef17.QRY_CFESTAPPPAS1, 0);
  }

  // **********************************************************************
  // Parametri Select On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMESELECT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMESELECT);
      // 
      // Parametri Select On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef17.PQRY_CFESTRPARSE3, IMDBDef17.PQSL_CFESTRPARSE3_TIPO, 0).equals((new IDVariant("D")), true))
      {
        PAN_PARAMESELECT.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMESELECT.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMESELECT.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMESELECT.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsportazioneDati", "ParametriSelectOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Parametri Select On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMESELECT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Select On Updating Row Body
      // Corpo Procedura
      // 
      if (FieldModified.booleanValue() && Column.equals((new IDVariant(PFL_PARAMESELECT_IMDBVALODATA)), true))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRPARSE3, IMDBDef17.PQSL_CFESTRPARSE3_VALORE, 0, IDL.ToString(IMDB.Value(IMDBDef17.PQRY_CFESTRPARSE3, IMDBDef17.PQSL_CFESTRPARSE3_NOMOGGIMVADA, 0)));
        SQL = new StringBuffer();
        SQL.append("update CF_ESTRAI_PARAMETRI_SELECT set ");
        SQL.append("  VALORE = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_CFESTRPARSE3, IMDBDef17.PQSL_CFESTRPARSE3_VALORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
        SQL.append("where (ID = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_CFESTRPARSE3, IMDBDef17.PQSL_CFESTRPARSE3_ID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      if (FieldModified.booleanValue() && Column.equals((new IDVariant(PFL_PARAMESELECT_IMDBVALORE)), true))
      {
        SQL = new StringBuffer();
        SQL.append("update CF_ESTRAI_PARAMETRI_SELECT set ");
        SQL.append("  VALORE = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_CFESTRPARSE3, IMDBDef17.PQSL_CFESTRPARSE3_VALORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
        SQL.append("where (ID = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_CFESTRPARSE3, IMDBDef17.PQSL_CFESTRPARSE3_ID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      if (IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_STATO, 0).equals((new IDVariant("S")), true))
      {
        PAN_PARAMESELECT.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMESELECT.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsportazioneDati", "ParametriSelectOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Parametri Select After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_PARAMESELECT_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Select After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_CFESTRASELEC.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsportazioneDati", "ParametriSelectAfterCommit", _e);
    }
  }

  // **********************************************************************
  // CF ESTRAI SELECT On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CFESTRASELEC_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CFESTRASELEC);
      // 
      // CF ESTRAI SELECT On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_STATO, 0).equals((new IDVariant("S")), true))
      {
        PAN_PARAMESELECT.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IDVariant v_VALORE = null;
        v_VALORE = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.CHIAVE = 'INSERIMENTO') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VALORE = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_VALORE)) && MainFrm.GetAbilitazioni((new IDVariant("MODIFICA"))).equals((new IDVariant(-1)), true))
        {
          PAN_PARAMESELECT.set_FieldText(PFL_PARAMESELECT_BOTTONEQUERY, (new IDVariant("Modifica")).stringValue());
        }
        else
        {
          PAN_PARAMESELECT.set_FieldText(PFL_PARAMESELECT_BOTTONEQUERY, (new IDVariant("Visualizza")).stringValue());
        }
      }
      else
      {
        PAN_PARAMESELECT.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_PARAMESELECT.set_FieldText(PFL_PARAMESELECT_BOTTONEQUERY, (new IDVariant("Modifica")).stringValue());
        if (MainFrm.GetAbilitazioni((new IDVariant("MODIFICA"))).equals((new IDVariant(-1)), true))
        {
          PAN_PARAMESELECT.set_FieldText(PFL_PARAMESELECT_BOTTONEQUERY, (new IDVariant("Modifica")).stringValue());
        }
        else
        {
          PAN_PARAMESELECT.set_FieldText(PFL_PARAMESELECT_BOTTONEQUERY, (new IDVariant("Visualizza")).stringValue());
        }
      }
      if (IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_CFESTSELFIAS, 0).equals((new IDVariant()), true))
      {
        PAN_CFESTRASELEC.SetFlags (Glb.OBJ_FIELD, PFL_CFESTRASELEC_ETICFILEASSO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CFESTRASELEC.SetFlags (Glb.OBJ_FIELD, PFL_CFESTRASELEC_ETICFILEASSO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EsportazioneDati", "CFESTRAISELECTOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // CF ESTRAI PARAMETRI SELECT
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ESPORTAZDATI_CFESTRPARSE3() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_CFESTRPARSE3_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_CFESTAPPPASE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_CFESTAPPPASE, 0))
    {
      if (IMDB.Value(IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_ID_SELECT, 0).equals(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_ID, 0), true))
      {
        IMDB.TblAddNew(IMDBDef17.PQRY_CFESTRPARSE3_RS, 0);
        IMDB.TblLinkRow(IMDBDef17.PQRY_CFESTRPARSE3_RS, 0, IMDBDef7.TBL_CFESTAPPPASE, 0);
        IMDB.TblLinkField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 0, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_ID, 0);
        IMDB.TblLinkField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 1, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_ID_SELECT, 0);
        IMDB.TblLinkField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 2, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_NOME, 0);
        IMDB.TblLinkField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 3, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_DESCRIZIONE, 0);
        IMDB.TblLinkField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 4, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_SEQUENZA, 0);
        IMDB.TblLinkField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 5, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_TIPO, 0);
        IMDB.TblLinkField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 6, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_VALORE, 0);
        IMDB.TblLinkField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 7, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_VALORE_DEFAULT, 0);
        IMDB.TblLinkField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 8, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_STATO, 0);
        IMDB.TblLinkField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 9, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_UTENTE_INSERIMENTO, 0);
        IMDB.TblLinkField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 10, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_DATA_INSERIMENTO, 0);
        IMDB.TblLinkField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 11, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_UTENTE_ULTIMO_AGG, 0);
        IMDB.TblLinkField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 12, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_DATA_ULTIMO_AGG, 0);
        IMDB.TblLinkField(IMDBDef17.PQRY_CFESTRPARSE3_RS, 13, 0, IMDBDef7.TBL_CFESTAPPPASE, IMDBDef7.FLD_CFESTAPPPASE_NOMOGGIMVADA, 0);
      }
      IMDB.TblMoveNext(IMDBDef7.TBL_CFESTAPPPASE, 0);
      if (IMDB.Eof(IMDBDef7.TBL_CFESTAPPPASE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_CFESTAPPPASE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef17.PQRY_CFESTRPARSE3_RS);
    IMDB.TblSortBy(IMDBDef17.PQRY_CFESTRPARSE3_RS,4,true);
    IMDB.TblStartSort(IMDBDef17.PQRY_CFESTRPARSE3_RS);
    IMDB.TblMoveFirst(IMDBDef17.PQRY_CFESTRPARSE3_RS, 0);
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

  
  
  // **********************************************
  // Frame Events
  // **********************************************
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CFESTRASELEC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CFESTRASELEC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CFESTRASELEC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CFESTRASELEC, Cancel);
    // Stub
  }

  private void PAN_CFESTRASELEC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CFESTRASELEC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CFESTRASELEC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_STATO, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_STATO, 0, (new IDVariant("S")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_DATA_INIZIO_VALIDITA, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_DATA_INIZIO_VALIDITA, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_DATA_INSERIMENTO, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_DATA_INSERIMENTO, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_DATA_ULTIMO_AGG, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_DATA_ULTIMO_AGG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_CFESTSELFIAS, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRASELE6, IMDBDef17.PQSL_CFESTRASELE6_CFESTSELFIAS, 0, (new IDVariant()));
      }
      if (Cancel.isFalse())
      {
        PAN_CFESTRASELEC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMESELECT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMESELECT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMESELECT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMESELECT, Cancel);
    // Stub
  }

  private void PAN_PARAMESELECT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMESELECT_ESPORTAEXCEL)
    {
      this.IdxPanelActived = this.PAN_PARAMESELECT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EstraiXls();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMESELECT_ESPORTAPDF)
    {
      this.IdxPanelActived = this.PAN_PARAMESELECT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EstraiPdf();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMESELECT_ESPORTACSV)
    {
      this.IdxPanelActived = this.PAN_PARAMESELECT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EstraiCsv();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMESELECT_BOTTONEQUERY)
    {
      this.IdxPanelActived = this.PAN_PARAMESELECT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriQuery();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMESELECT_BOTTPROVSELE)
    {
      this.IdxPanelActived = this.PAN_PARAMESELECT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EstraiCsvAnteprima();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMESELECT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMESELECT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMESELECT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRPARSE3, IMDBDef17.PQSL_CFESTRPARSE3_STATO, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRPARSE3, IMDBDef17.PQSL_CFESTRPARSE3_STATO, 0, (new IDVariant("S")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRPARSE3, IMDBDef17.PQSL_CFESTRPARSE3_DATA_INSERIMENTO, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRPARSE3, IMDBDef17.PQSL_CFESTRPARSE3_DATA_INSERIMENTO, 0, (new IDVariant("1999/12/31 02:00:00", IDVariant.DATETIME)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_CFESTRPARSE3, IMDBDef17.PQSL_CFESTRPARSE3_DATA_ULTIMO_AGG, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_CFESTRPARSE3, IMDBDef17.PQSL_CFESTRPARSE3_DATA_ULTIMO_AGG, 0, (new IDVariant("1999/12/31 02:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_PARAMESELECT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CFESTRASELEC_Init()
  {

    PAN_CFESTRASELEC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CFESTRASELEC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CFESTRASELEC.SetSize(MyGlb.OBJ_FIELD, 22);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_STATO, "4714A618-AD26-4753-84DB-C7A08AD0E9A2");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_STATO, "STATO");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_STATO, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_STATO, MyGlb.VIS_NORMFIELPADR);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_STATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQL, "387D06A3-0262-4699-BC5B-C997B904D4A2");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQL, "SELECT SQL");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQL, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQL, MyGlb.VIS_NONNULLAFIEL);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQL, 0, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DESCRIZIONE, "57B65A69-31E6-4D93-9008-EF1D1A115361");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DESCRIZIONE, "DESCRIZIONE");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DESCRIZIONE, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DESCRIZIONE, MyGlb.VIS_HTMLNORMFIEL);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOTE, "E72265C9-5EEA-413A-8350-A487A59437CE");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOTE, "NOTE");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOTE, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOTE, MyGlb.VIS_NORMFIELPADR);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOTE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINIZVALI, "AEA732D7-79E4-4715-8540-A9F9EE26D5F2");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINIZVALI, "DATA INIZIO VALIDITA");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINIZVALI, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINIZVALI, MyGlb.VIS_NORMFIELPADR);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINIZVALI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAFINEVALI, "E05D087D-74BC-46C4-99A3-F4417906C454");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAFINEVALI, "DATA FINE VALIDITA");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAFINEVALI, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAFINEVALI, MyGlb.VIS_NORMFIELPADR);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAFINEVALI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTEINSERI, "D66BD589-63B4-4AF1-B88E-1E9E6825A625");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTEINSERI, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTEINSERI, MyGlb.VIS_NONNULLAFIEL);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTEINSERI, 0, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINSERIME, "9A360194-E5EF-4A1C-8FB5-7B51E8EF8D03");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINSERIME, "DATA INSERIMENTO");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINSERIME, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTULTIAGG, "952894A4-7DC7-4D71-8807-719182957E17");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTULTIAGG, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTULTIAGG, MyGlb.VIS_NONNULLAFIEL);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTULTIAGG, 0, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAULTIMAGG, "615A545A-FE2A-4120-AAEF-F3EB9C790E93");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAULTIMAGG, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ID, "633F6B64-6C8D-4654-8148-5F3EAC4D5837");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ID, "ID");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ID, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOMEFILEEXPO, "0C9646A5-353E-494C-8E13-E25AE35E3B9F");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOMEFILEEXPO, "NOME FILE EXPORT");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOMEFILEEXPO, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOMEFILEEXPO, MyGlb.VIS_NORMFIELPADR);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOMEFILEEXPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CATEGORIA, "5D539DA3-9E61-4280-BB9A-8003CC0F7304");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CATEGORIA, "CATEGORIA");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CATEGORIA, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CATEGORIA, MyGlb.VIS_FOREIKEYFIEL);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CATEGORIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CODICE, "2A1CF071-CCBB-4181-9E60-1E533DF5FC1F");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CODICE, "Codice");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CODICE, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_FILEASSOCIAT, "DE1E4D93-32F1-4992-AD5E-43AEEBDBC774");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_FILEASSOCIAT, "File Associato");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_FILEASSOCIAT, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_FILEASSOCIAT, MyGlb.VIS_HYPERLIFIELD);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_FILEASSOCIAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ETICFILEASSO, "FA2EF1B0-7023-44AA-A47F-2760F9B3DE8C");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ETICFILEASSO, "File Associato:");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ETICFILEASSO, MyGlb.VIS_OPTBUTSEBOGR);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ETICFILEASSO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ULTIMAESTRAZ, "4FCC6780-F03A-43FB-ADAD-2AD4CB50D914");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ULTIMAESTRAZ, "Ultima Estrazione");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ULTIMAESTRAZ, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ULTIMAESTRAZ, MyGlb.VIS_NORMFIELPADR);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ULTIMAESTRAZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_TITOLO, "73843A64-48F5-41D5-AEE3-39CB05968E4C");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_TITOLO, "TITOLO");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_TITOLO, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_TITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_IDHELP, "C4442354-F801-454F-B4A1-2332A27A4DE0");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_IDHELP, "ID HELP");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_IDHELP, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_IDHELP, MyGlb.VIS_FOREIKEYFIEL);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_IDHELP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQLSOS, "9457E9D3-616B-4039-9963-A34EC92186C0");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQLSOS, "SELECTSQLSOSTITUITA");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQLSOS, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQLSOS, MyGlb.VIS_NORMFIELPADR);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQLSOS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_HELP, "8762CF1B-8B1F-43BA-8AE4-C71CDFC5524C");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_HELP, "HELP");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_HELP, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_HELP, MyGlb.VIS_NORMFIELPADR);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_HELP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CFESTRASELEC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_INFO, "49442ADE-1D17-4E53-89DA-C48BC804D431");
    PAN_CFESTRASELEC.set_Header(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_INFO, "Info");
    PAN_CFESTRASELEC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_INFO, "");
    PAN_CFESTRASELEC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_INFO, MyGlb.VIS_NORMFIELPADR);
    PAN_CFESTRASELEC.SetFlags(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_INFO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CFESTRASELEC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_STATO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_STATO, MyGlb.PANEL_LIST, 48);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_STATO, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_STATO, MyGlb.PANEL_LIST, "STATO");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_STATO, MyGlb.PANEL_FORM, 4, 100, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_STATO, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_STATO, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_STATO, MyGlb.PANEL_FORM, "STATO");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_STATO, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_STATO, PPQRY_CFESTRASELE6, "A.STATO", "STATO", 5, 20, 0, -13997);
    PAN_CFESTRASELEC.SetValueListItem(PFL_CFESTRASELEC_STATO, (new IDVariant("S")), "Standard", "", "", -1);
    PAN_CFESTRASELEC.SetValueListItem(PFL_CFESTRASELEC_STATO, (new IDVariant("P")), "Personalizzata", "", "", -1);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQL, MyGlb.PANEL_LIST, 4, 340, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQL, MyGlb.PANEL_LIST, 96);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQL, MyGlb.PANEL_LIST, 2);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQL, MyGlb.PANEL_LIST, "SELECT SQL");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQL, MyGlb.PANEL_FORM, -4, 100, 592, 288, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQL, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQL, MyGlb.PANEL_FORM, 21);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQL, MyGlb.PANEL_FORM, "SELECT SQL");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_SELECTSQL, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_SELECTSQL, PPQRY_CFESTRASELE6, "A.SELECT_SQL", "SELECT_SQL", 9, 9999, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DESCRIZIONE, MyGlb.PANEL_LIST, 80, 36, 452, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DESCRIZIONE, MyGlb.PANEL_FORM, 20, 80, 756, 140, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DESCRIZIONE, MyGlb.PANEL_FORM, 10);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_DESCRIZIONE, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_DESCRIZIONE, PPQRY_CFESTRASELE6, "A.DESCRIZIONE", "DESCRIZIONE", 5, 4000, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOTE, MyGlb.PANEL_LIST, 4, 388, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOTE, MyGlb.PANEL_LIST, 96);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOTE, MyGlb.PANEL_LIST, 2);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOTE, MyGlb.PANEL_LIST, "NOTE");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOTE, MyGlb.PANEL_FORM, 4, 104, 592, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOTE, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOTE, MyGlb.PANEL_FORM, "NOTE");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_NOTE, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_NOTE, PPQRY_CFESTRASELE6, "A.NOTE", "NOTE", 5, 4000, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINIZVALI, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINIZVALI, MyGlb.PANEL_LIST, 136);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINIZVALI, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINIZVALI, MyGlb.PANEL_LIST, "DATA INIZIO VALIDITA");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINIZVALI, MyGlb.PANEL_FORM, -4, 204, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINIZVALI, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINIZVALI, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINIZVALI, MyGlb.PANEL_FORM, "DT. INIZIO VALIDITA");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_DATAINIZVALI, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_DATAINIZVALI, PPQRY_CFESTRASELE6, "A.DATA_INIZIO_VALIDITA", "DATA_INIZIO_VALIDITA", 6, 10, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAFINEVALI, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAFINEVALI, MyGlb.PANEL_LIST, 124);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAFINEVALI, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAFINEVALI, MyGlb.PANEL_LIST, "DATA FINE VALIDITA");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAFINEVALI, MyGlb.PANEL_FORM, -4, 228, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAFINEVALI, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAFINEVALI, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAFINEVALI, MyGlb.PANEL_FORM, "DATA FINE VALIDITA");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_DATAFINEVALI, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_DATAFINEVALI, PPQRY_CFESTRASELE6, "A.DATA_FINE_VALIDITA", "DATA_FINE_VALIDITA", 6, 10, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTEINSERI, MyGlb.PANEL_LIST, 280, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 220, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTEINSERI, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_UTENTEINSERI, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_UTENTEINSERI, PPQRY_CFESTRASELE6, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINSERIME, MyGlb.PANEL_FORM, 4, 244, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINSERIME, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_DATAINSERIME, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_DATAINSERIME, PPQRY_CFESTRASELE6, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 20, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTULTIAGG, MyGlb.PANEL_LIST, 424, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 268, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTULTIAGG, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_UTENTULTIAGG, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_UTENTULTIAGG, PPQRY_CFESTRASELE6, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAULTIMAGG, MyGlb.PANEL_LIST, 424, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAULTIMAGG, MyGlb.PANEL_FORM, 188, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAULTIMAGG, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_DATAULTIMAGG, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_DATAULTIMAGG, PPQRY_CFESTRASELE6, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ID, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ID, MyGlb.PANEL_LIST, 24);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ID, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ID, MyGlb.PANEL_LIST, "ID");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ID, MyGlb.PANEL_FORM, 4, 292, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ID, MyGlb.PANEL_FORM, 24);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ID, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ID, MyGlb.PANEL_FORM, "ID");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_ID, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_ID, PPQRY_CFESTRASELE6, "A.ID", "ID", 3, 19, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOMEFILEEXPO, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOMEFILEEXPO, MyGlb.PANEL_LIST, 112);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOMEFILEEXPO, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOMEFILEEXPO, MyGlb.PANEL_LIST, "NOME FILE EXPORT");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOMEFILEEXPO, MyGlb.PANEL_FORM, 296, 28, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOMEFILEEXPO, MyGlb.PANEL_FORM, 112);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOMEFILEEXPO, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_NOMEFILEEXPO, MyGlb.PANEL_FORM, "NOME FILE EXPORT");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_NOMEFILEEXPO, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_NOMEFILEEXPO, PPQRY_CFESTRASELE6, "A.NOME_FILE_EXPORT", "NOME_FILE_EXPORT", 5, 100, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CATEGORIA, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CATEGORIA, MyGlb.PANEL_LIST, 96);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CATEGORIA, MyGlb.PANEL_LIST, "CATEGORIA");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CATEGORIA, MyGlb.PANEL_FORM, -4, 100, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CATEGORIA, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CATEGORIA, MyGlb.PANEL_FORM, "CATEGORIA");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_CATEGORIA, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_CATEGORIA, PPQRY_CFESTRASELE6, "A.CATEGORIA", "CATEGORIA", 5, 50, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CODICE, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CODICE, MyGlb.PANEL_FORM, 512, 16, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CODICE, MyGlb.PANEL_FORM, 52);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_CODICE, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_CODICE, PPQRY_CFESTRASELE6, "A.CODICE", "CFESTRSELCOD", 5, 20, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_FILEASSOCIAT, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_FILEASSOCIAT, MyGlb.PANEL_LIST, 100);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_FILEASSOCIAT, MyGlb.PANEL_LIST, 2);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_FILEASSOCIAT, MyGlb.PANEL_LIST, "File Associato");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_FILEASSOCIAT, MyGlb.PANEL_FORM, 112, 224, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_FILEASSOCIAT, MyGlb.PANEL_FORM, 100);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_FILEASSOCIAT, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_FILEASSOCIAT, MyGlb.PANEL_FORM, "File Associato");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_FILEASSOCIAT, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_FILEASSOCIAT, PPQRY_CFESTRASELE6, "A.FILE_ASSOCIATO", "CFESTSELFIAS", 10, 9999, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ETICFILEASSO, MyGlb.PANEL_LIST, 56, 224, 40, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ETICFILEASSO, MyGlb.PANEL_LIST, 0);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ETICFILEASSO, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ETICFILEASSO, MyGlb.PANEL_FORM, 20, 224, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ETICFILEASSO, MyGlb.PANEL_FORM, 0);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ETICFILEASSO, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_ETICFILEASSO, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_ETICFILEASSO, -1, "", "ETICFILEASSO", 0, 0, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ULTIMAESTRAZ, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ULTIMAESTRAZ, MyGlb.PANEL_LIST, 108);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ULTIMAESTRAZ, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ULTIMAESTRAZ, MyGlb.PANEL_LIST, "Ultima Estrazione");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ULTIMAESTRAZ, MyGlb.PANEL_FORM, 552, 224, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ULTIMAESTRAZ, MyGlb.PANEL_FORM, 108);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ULTIMAESTRAZ, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_ULTIMAESTRAZ, MyGlb.PANEL_FORM, "Ultima Estrazione");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_ULTIMAESTRAZ, -1, -1);
    PAN_CFESTRASELEC.SetFieldUnbound(PFL_CFESTRASELEC_ULTIMAESTRAZ, true);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_ULTIMAESTRAZ, PPQRY_CFESTRASELE6, "CF_ESTRAI.GET_ULTIMA_ESTRAZIONE(A.ID)", "ULTIMAESTRAZ", 8, 0, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_TITOLO, MyGlb.PANEL_LIST, 80, 36, 260, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_TITOLO, MyGlb.PANEL_LIST, 96);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_TITOLO, MyGlb.PANEL_LIST, "TITOLO");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_TITOLO, MyGlb.PANEL_FORM, 20, 48, 756, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_TITOLO, MyGlb.PANEL_FORM, 128);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_TITOLO, MyGlb.PANEL_FORM, "TITOLO");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_TITOLO, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_TITOLO, PPQRY_CFESTRASELE6, "A.TITOLO", "TITOLO", 5, 100, 0, -13997);
    PAN_CFESTRASELEC.set_FontModifiers(PFL_CFESTRASELEC_TITOLO, "B");
    PAN_CFESTRASELEC.set_ImageResizeMode(PFL_CFESTRASELEC_TITOLO, 3);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_IDHELP, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_IDHELP, MyGlb.PANEL_LIST, 52);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_IDHELP, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_IDHELP, MyGlb.PANEL_LIST, "ID HELP");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_IDHELP, MyGlb.PANEL_FORM, 4, 224, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_IDHELP, MyGlb.PANEL_FORM, 52);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_IDHELP, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_IDHELP, MyGlb.PANEL_FORM, "ID HELP");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_IDHELP, -1, -1);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_IDHELP, PPQRY_CFESTRASELE6, "A.ID_HELP", "CFESTSELIDHE", 3, 19, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQLSOS, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQLSOS, MyGlb.PANEL_LIST, 140);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQLSOS, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQLSOS, MyGlb.PANEL_LIST, "SELECTSQLSOSTITUITA");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQLSOS, MyGlb.PANEL_FORM, 4, 224, 648, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQLSOS, MyGlb.PANEL_FORM, 140);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQLSOS, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_SELECTSQLSOS, MyGlb.PANEL_FORM, "SELECTSQLSOSTITUITA");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_SELECTSQLSOS, -1, -1);
    PAN_CFESTRASELEC.SetFieldUnbound(PFL_CFESTRASELEC_SELECTSQLSOS, true);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_SELECTSQLSOS, PPQRY_CFESTRASELE6, "CF_ESTRAI.SOSTITUISCI_PARAMETRI(A.ID)", "SELECTSQLSOS", 9, 99, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_HELP, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_HELP, MyGlb.PANEL_LIST, 36);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_HELP, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_HELP, MyGlb.PANEL_LIST, "HELP");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_HELP, MyGlb.PANEL_FORM, 4, 224, 544, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_HELP, MyGlb.PANEL_FORM, 36);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_HELP, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_HELP, MyGlb.PANEL_FORM, "HELP");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_HELP, -1, -1);
    PAN_CFESTRASELEC.SetFieldUnbound(PFL_CFESTRASELEC_HELP, true);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_HELP, PPQRY_CFESTRASELE6, "CASE WHEN NOT ((A.ID_HELP IS NULL)) THEN 'SI' ELSE NULL END", "HELP", 5, 99, 0, -13997);
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_INFO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_INFO, MyGlb.PANEL_LIST, 32);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_INFO, MyGlb.PANEL_LIST, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_INFO, MyGlb.PANEL_LIST, "Info");
    PAN_CFESTRASELEC.SetRect(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_INFO, MyGlb.PANEL_FORM, 4, 224, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CFESTRASELEC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_INFO, MyGlb.PANEL_FORM, 32);
    PAN_CFESTRASELEC.SetNumRow(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_INFO, MyGlb.PANEL_FORM, 1);
    PAN_CFESTRASELEC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CFESTRASELEC_INFO, MyGlb.PANEL_FORM, "Info");
    PAN_CFESTRASELEC.SetFieldPage(PFL_CFESTRASELEC_INFO, -1, -1);
    PAN_CFESTRASELEC.SetFieldUnbound(PFL_CFESTRASELEC_INFO, true);
    PAN_CFESTRASELEC.SetFieldPanel(PFL_CFESTRASELEC_INFO, PPQRY_CFESTRASELE6, "'I'", "INFO", 5, 1, 0, -13997);
  }

  private void PAN_CFESTRASELEC_InitQueries()
  {
    StringBuffer SQL;

    PAN_CFESTRASELEC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CFESTRASELEC.SetIMDB(IMDB, "PQRY_CFESTRASELE6", true);
    PAN_CFESTRASELEC.set_SetString(MyGlb.MASTER_ROWNAME, "CF ESTRAI SELECT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID as ID, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  A.SELECT_SQL as SELECT_SQL, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.DATA_INIZIO_VALIDITA as DATA_INIZIO_VALIDITA, ");
    SQL.append("  A.DATA_FINE_VALIDITA as DATA_FINE_VALIDITA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.NOME_FILE_EXPORT as NOME_FILE_EXPORT, ");
    SQL.append("  A.CODICE as CFESTRSELCOD, ");
    SQL.append("  A.ID_HELP as CFESTSELIDHE, ");
    SQL.append("  CASE WHEN NOT ((A.ID_HELP IS NULL)) THEN 'SI' ELSE NULL END as HELP, ");
    SQL.append("  CF_ESTRAI.SOSTITUISCI_PARAMETRI(A.ID) as SELECTSQLSOS, ");
    SQL.append("  'I' as INFO, ");
    SQL.append("  CF_ESTRAI.GET_ULTIMA_ESTRAZIONE(A.ID) as ULTIMAESTRAZ, ");
    SQL.append("  A.FILE_ASSOCIATO as CFESTSELFIAS ");
    PAN_CFESTRASELEC.SetQuery(PPQRY_CFESTRASELE6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CF_ESTRAI_SELECT A, ");
    SQL.append("  CF_ESTRAI_HELP_SELECT B ");
    PAN_CFESTRASELEC.SetQuery(PPQRY_CFESTRASELE6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where B.ID(+) = A.ID_HELP ");
    SQL.append("and   (A.ID = ~~TBL_PARAMETRI98.NOMEOGGSELID~~) ");
    SQL.append("and   (A.ID_HELP = B.ID(+)) ");
    PAN_CFESTRASELEC.SetQuery(PPQRY_CFESTRASELE6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CFESTRASELEC.SetQuery(PPQRY_CFESTRASELE6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CFESTRASELEC.SetQuery(PPQRY_CFESTRASELE6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CFESTRASELEC.SetQuery(PPQRY_CFESTRASELE6, 5, SQL, -1, "");
    PAN_CFESTRASELEC.SetQueryDB(PPQRY_CFESTRASELE6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CFESTRASELEC.SetMasterTable(0, "CF_ESTRAI_SELECT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CFESTRASELEC.Status() == 2)
    {
      int oldListQBE = PAN_CFESTRASELEC.iUseListQBE;
      PAN_CFESTRASELEC.iUseListQBE = 0;
      PAN_CFESTRASELEC.PanelCommand(Glb.PCM_SEARCH);
      PAN_CFESTRASELEC.PanelCommand(Glb.PCM_FIND);
      PAN_CFESTRASELEC.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMESELECT_Init()
  {

    PAN_PARAMESELECT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMESELECT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMESELECT.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBNOME, "8FE5EA44-3012-443C-ABAD-3E985D0F5692");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBNOME, "Nome");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBNOME, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBNOME, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBNOME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_TIPO, "AE425292-6ADF-478E-82C5-E88BEDDDB011");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_TIPO, "Tipo");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_TIPO, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, "812EBFAC-93C1-401F-80A1-2CFC1D7CD8E8");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, "Valore");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, "C9CA3A9D-24AD-42DE-AB5C-95B7D2778C0B");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, "Valore (Data)");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODEFA, "8FD8096A-BD36-428A-B2B3-496545ACFCFF");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODEFA, "Valore di Default");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODEFA, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODEFA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODEFA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAEXCEL, "5CBBA7B6-7C83-4DC0-9420-AAF8C5572DD5");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAEXCEL, "Excel");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAEXCEL, " ");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAEXCEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESELECT.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAEXCEL, 0, "button1.gif", false);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAEXCEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAPDF, "03924988-A571-4E55-8872-8FF8F00FF547");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAPDF, "PDF");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAPDF, " ");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAPDF, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESELECT.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAPDF, 0, "button1.gif", false);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAPDF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBID, "2FCD5DD2-97EF-483E-9410-4C3F88E8F9DE");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBID, "IMDB ID");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBID, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBID, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBIDSELECT, "90F51B38-61D7-4672-B123-FF670735F829");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBIDSELECT, "IMDB ID SELECT");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBIDSELECT, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBIDSELECT, MyGlb.VIS_NONNULLAFIEL);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBIDSELECT, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDESCRIZI, "9F3347BD-7CFE-4330-BD18-F36C98302653");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDESCRIZI, "IMDB DESCRIZIONE");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDESCRIZI, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDESCRIZI, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDESCRIZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBSTATO, "1DECD037-6619-402E-A35D-B7BCCC5BF922");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBSTATO, "IMDB STATO");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBSTATO, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBSTATO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBSTATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBUTENINSE, "8D531578-F414-431D-BC07-13AF80BC9373");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBUTENINSE, "IMDB UTENTE INSERIMENTO");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBUTENINSE, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBUTENINSE, MyGlb.VIS_NONNULLAFIEL);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBUTENINSE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDATAINSE, "9B6459FD-F3D5-4CD8-8305-BB93DE50B77A");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDATAINSE, "IMDB DATA INSERIMENTO");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDATAINSE, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDATAINSE, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDATAINSE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDUTEULTAGG, "D50669DC-84F8-428C-841F-8D40F77710DF");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDUTEULTAGG, "IMDB UTENTE ULTIMO AGG");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDUTEULTAGG, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDUTEULTAGG, MyGlb.VIS_NONNULLAFIEL);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDUTEULTAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDDATULTAGG, "FEF70D6E-4851-4E88-A633-61CBD5F98FF5");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDDATULTAGG, "IMDB DATA ULTIMO AGG");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDDATULTAGG, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDDATULTAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDDATULTAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTACSV, "7666DF36-3802-42E6-BA23-F65C232397A4");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTACSV, "CSV");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTACSV, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTACSV, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESELECT.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTACSV, 0, "button1.gif", false);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTACSV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, "93E834D1-6E8F-4CDB-97CC-2DE6CA45E53D");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, "Modifica");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, "");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESELECT.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, 0, "button1.gif", false);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESELECT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTPROVSELE, "98F00A2E-B430-452E-A89F-E25BB19A6043");
    PAN_PARAMESELECT.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTPROVSELE, "Anteprima");
    PAN_PARAMESELECT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTPROVSELE, "Prova Select");
    PAN_PARAMESELECT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTPROVSELE, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESELECT.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTPROVSELE, 0, "button1.gif", false);
    PAN_PARAMESELECT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTPROVSELE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMESELECT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBNOME, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBNOME, MyGlb.PANEL_LIST, 120);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBNOME, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBNOME, MyGlb.PANEL_LIST, "Nome");
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBNOME, MyGlb.PANEL_FORM, 4, 52, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBNOME, MyGlb.PANEL_FORM, 128);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBNOME, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBNOME, MyGlb.PANEL_FORM, "Nome");
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_IMDBNOME, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_IMDBNOME, PPQRY_CFESTRPARSE3, "A.NOME", "NOME", 5, 100, 0, -13997);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_TIPO, MyGlb.PANEL_LIST, 144, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_TIPO, MyGlb.PANEL_LIST, 120);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_TIPO, MyGlb.PANEL_FORM, 4, 124, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_TIPO, MyGlb.PANEL_FORM, 128);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_TIPO, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_TIPO, PPQRY_CFESTRPARSE3, "A.TIPO", "TIPO", 5, 50, 0, -13997);
    PAN_PARAMESELECT.SetValueListItem(PFL_PARAMESELECT_TIPO, (new IDVariant("S")), "Stringa", "", "", -1);
    PAN_PARAMESELECT.SetValueListItem(PFL_PARAMESELECT_TIPO, (new IDVariant("N")), "Numero", "", "", -1);
    PAN_PARAMESELECT.SetValueListItem(PFL_PARAMESELECT_TIPO, (new IDVariant("D")), "Data", "", "", -1);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, MyGlb.PANEL_LIST, 244, 36, 200, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, MyGlb.PANEL_LIST, 52);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, MyGlb.PANEL_LIST, "Valore");
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, MyGlb.PANEL_FORM, 4, 292, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, MyGlb.PANEL_FORM, 52);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALORE, MyGlb.PANEL_FORM, "Valore");
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_IMDBVALORE, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_IMDBVALORE, PPQRY_CFESTRPARSE3, "A.VALORE", "VALORE", 5, 100, 0, -13997);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, MyGlb.PANEL_LIST, 444, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, MyGlb.PANEL_LIST, 88);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, MyGlb.PANEL_LIST, "Valore (Data)");
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, MyGlb.PANEL_FORM, 4, 316, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, MyGlb.PANEL_FORM, 88);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODATA, MyGlb.PANEL_FORM, "Valore (Data)");
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_IMDBVALODATA, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_IMDBVALODATA, PPQRY_CFESTRPARSE3, "A.NOMOGGIMVADA", "NOMOGGIMVADA", 6, 10, 0, -13997);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODEFA, MyGlb.PANEL_LIST, 524, 36, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODEFA, MyGlb.PANEL_LIST, 120);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODEFA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODEFA, MyGlb.PANEL_LIST, "Valore di Default");
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODEFA, MyGlb.PANEL_FORM, 4, 148, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODEFA, MyGlb.PANEL_FORM, 128);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODEFA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBVALODEFA, MyGlb.PANEL_FORM, "Valore di Default");
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_IMDBVALODEFA, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_IMDBVALODEFA, PPQRY_CFESTRPARSE3, "A.VALORE_DEFAULT", "VALORE_DEFAULT", 5, 100, 0, -13997);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAEXCEL, MyGlb.PANEL_LIST, 564, 236, 97, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAEXCEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAEXCEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAEXCEL, MyGlb.PANEL_FORM, 616, 200, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAEXCEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAEXCEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_ESPORTAEXCEL, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_ESPORTAEXCEL, -1, "", "ESPORTAEXCEL", 0, 0, 0, -13869);
    PAN_PARAMESELECT.set_Alignment(PFL_PARAMESELECT_ESPORTAEXCEL, 3);
    PAN_PARAMESELECT.set_ImageResizeMode(PFL_PARAMESELECT_ESPORTAEXCEL, 2);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAPDF, MyGlb.PANEL_LIST, 660, 236, 97, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAPDF, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAPDF, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAPDF, MyGlb.PANEL_FORM, 700, 200, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAPDF, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTAPDF, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_ESPORTAPDF, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_ESPORTAPDF, -1, "", "ESPORTAPDF", 0, 0, 0, -13869);
    PAN_PARAMESELECT.set_Alignment(PFL_PARAMESELECT_ESPORTAPDF, 3);
    PAN_PARAMESELECT.set_ImageResizeMode(PFL_PARAMESELECT_ESPORTAPDF, 2);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBID, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBID, MyGlb.PANEL_LIST, 24);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBID, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBID, MyGlb.PANEL_LIST, "IMDB ID");
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBID, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBID, MyGlb.PANEL_FORM, 128);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBID, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBID, MyGlb.PANEL_FORM, "IMDB ID");
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_IMDBID, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_IMDBID, PPQRY_CFESTRPARSE3, "A.ID", "ID", 3, 19, 0, -13997);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBIDSELECT, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBIDSELECT, MyGlb.PANEL_LIST, 64);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBIDSELECT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBIDSELECT, MyGlb.PANEL_LIST, "IMD. I. SEL.");
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBIDSELECT, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBIDSELECT, MyGlb.PANEL_FORM, 128);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBIDSELECT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBIDSELECT, MyGlb.PANEL_FORM, "IMDB ID SELECT");
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_IMDBIDSELECT, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_IMDBIDSELECT, PPQRY_CFESTRPARSE3, "A.ID_SELECT", "ID_SELECT", 3, 19, 0, -13997);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDESCRIZI, MyGlb.PANEL_LIST, 184, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDESCRIZI, MyGlb.PANEL_LIST, 120);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDESCRIZI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDESCRIZI, MyGlb.PANEL_LIST, "IMDB DESCRIZIONE");
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDESCRIZI, MyGlb.PANEL_FORM, 4, 76, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDESCRIZI, MyGlb.PANEL_FORM, 128);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDESCRIZI, MyGlb.PANEL_FORM, 2);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDESCRIZI, MyGlb.PANEL_FORM, "IMDB DESCRIZIONE");
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_IMDBDESCRIZI, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_IMDBDESCRIZI, PPQRY_CFESTRPARSE3, "A.DESCRIZIONE", "DESCRIZIONE", 5, 4000, 0, -13997);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBSTATO, MyGlb.PANEL_LIST, 40, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBSTATO, MyGlb.PANEL_LIST, 48);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBSTATO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBSTATO, MyGlb.PANEL_LIST, "IMDB STATO");
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBSTATO, MyGlb.PANEL_FORM, 4, 172, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBSTATO, MyGlb.PANEL_FORM, 128);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBSTATO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBSTATO, MyGlb.PANEL_FORM, "IMDB STATO");
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_IMDBSTATO, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_IMDBSTATO, PPQRY_CFESTRPARSE3, "A.STATO", "STATO", 5, 20, 0, -13997);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBUTENINSE, MyGlb.PANEL_LIST, 40, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBUTENINSE, MyGlb.PANEL_LIST, 128);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBUTENINSE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBUTENINSE, MyGlb.PANEL_LIST, "IMD. UTEN. INSER.");
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBUTENINSE, MyGlb.PANEL_FORM, 4, 196, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBUTENINSE, MyGlb.PANEL_FORM, 128);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBUTENINSE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBUTENINSE, MyGlb.PANEL_FORM, "IMD. UTEN. INSER.");
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_IMDBUTENINSE, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_IMDBUTENINSE, PPQRY_CFESTRPARSE3, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDATAINSE, MyGlb.PANEL_LIST, 40, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDATAINSE, MyGlb.PANEL_LIST, 120);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDATAINSE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDATAINSE, MyGlb.PANEL_LIST, "IMDB DATA INSERIMENTO");
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDATAINSE, MyGlb.PANEL_FORM, 4, 220, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDATAINSE, MyGlb.PANEL_FORM, 128);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDATAINSE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDBDATAINSE, MyGlb.PANEL_FORM, "IMD. DT. INSER.");
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_IMDBDATAINSE, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_IMDBDATAINSE, PPQRY_CFESTRPARSE3, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDUTEULTAGG, MyGlb.PANEL_LIST, 40, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDUTEULTAGG, MyGlb.PANEL_LIST, 124);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDUTEULTAGG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDUTEULTAGG, MyGlb.PANEL_LIST, "IMD. UTEN. ULT. AGG");
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDUTEULTAGG, MyGlb.PANEL_FORM, 4, 244, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDUTEULTAGG, MyGlb.PANEL_FORM, 128);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDUTEULTAGG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDUTEULTAGG, MyGlb.PANEL_FORM, "IMD. UTEN. ULT. AGG");
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_IMDUTEULTAGG, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_IMDUTEULTAGG, PPQRY_CFESTRPARSE3, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDDATULTAGG, MyGlb.PANEL_LIST, 40, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDDATULTAGG, MyGlb.PANEL_LIST, 116);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDDATULTAGG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDDATULTAGG, MyGlb.PANEL_LIST, "IMDB DATA ULTIMO AGG");
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDDATULTAGG, MyGlb.PANEL_FORM, 4, 268, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDDATULTAGG, MyGlb.PANEL_FORM, 128);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDDATULTAGG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_IMDDATULTAGG, MyGlb.PANEL_FORM, "IMD. DT. ULTIMO AGG");
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_IMDDATULTAGG, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_IMDDATULTAGG, PPQRY_CFESTRPARSE3, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTACSV, MyGlb.PANEL_LIST, 468, 236, 97, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTACSV, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTACSV, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTACSV, MyGlb.PANEL_FORM, 536, 200, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTACSV, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_ESPORTACSV, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_ESPORTACSV, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_ESPORTACSV, -1, "", "ESPORTACSV", 0, 0, 0, -13869);
    PAN_PARAMESELECT.set_Alignment(PFL_PARAMESELECT_ESPORTACSV, 3);
    PAN_PARAMESELECT.set_ImageResizeMode(PFL_PARAMESELECT_ESPORTACSV, 2);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, MyGlb.PANEL_LIST, 4, 236, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, MyGlb.PANEL_FORM, 4, 200, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTONEQUERY, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_BOTTONEQUERY, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_BOTTONEQUERY, -1, "", "BOTTONEQUERY", 0, 0, 0, -13997);
    PAN_PARAMESELECT.set_ImageResizeMode(PFL_PARAMESELECT_BOTTONEQUERY, 2);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTPROVSELE, MyGlb.PANEL_LIST, 376, 236, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTPROVSELE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTPROVSELE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESELECT.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTPROVSELE, MyGlb.PANEL_FORM, 656, 760, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESELECT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTPROVSELE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESELECT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESELECT_BOTTPROVSELE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESELECT.SetFieldPage(PFL_PARAMESELECT_BOTTPROVSELE, -1, -1);
    PAN_PARAMESELECT.SetFieldPanel(PFL_PARAMESELECT_BOTTPROVSELE, -1, "", "BOTTPROVSELE", 0, 0, 0, -13997);
    PAN_PARAMESELECT.set_ImageResizeMode(PFL_PARAMESELECT_BOTTPROVSELE, 2);
  }

  private void PAN_PARAMESELECT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMESELECT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMESELECT.SetIMDB(IMDB, "PQRY_CFESTRPARSE3", true);
    PAN_PARAMESELECT.set_SetString(MyGlb.MASTER_ROWNAME, "CF ESTRAI PARAMETRI SELECT");
    PAN_PARAMESELECT.SetQueryIMDB(PPQRY_CFESTRPARSE3, IMDBDef17.PQRY_CFESTRPARSE3_RS, IMDBDef7.TBL_CFESTAPPPASE);
    JustLoaded = true;
    PAN_PARAMESELECT.SetFieldPrimaryIndex(PFL_PARAMESELECT_IMDBNOME, IMDBDef7.FLD_CFESTAPPPASE_NOME);
    PAN_PARAMESELECT.SetFieldPrimaryIndex(PFL_PARAMESELECT_TIPO, IMDBDef7.FLD_CFESTAPPPASE_TIPO);
    PAN_PARAMESELECT.SetFieldPrimaryIndex(PFL_PARAMESELECT_IMDBVALORE, IMDBDef7.FLD_CFESTAPPPASE_VALORE);
    PAN_PARAMESELECT.SetFieldPrimaryIndex(PFL_PARAMESELECT_IMDBVALODATA, IMDBDef7.FLD_CFESTAPPPASE_NOMOGGIMVADA);
    PAN_PARAMESELECT.SetFieldPrimaryIndex(PFL_PARAMESELECT_IMDBVALODEFA, IMDBDef7.FLD_CFESTAPPPASE_VALORE_DEFAULT);
    PAN_PARAMESELECT.SetFieldPrimaryIndex(PFL_PARAMESELECT_IMDBID, IMDBDef7.FLD_CFESTAPPPASE_ID);
    PAN_PARAMESELECT.SetFieldPrimaryIndex(PFL_PARAMESELECT_IMDBIDSELECT, IMDBDef7.FLD_CFESTAPPPASE_ID_SELECT);
    PAN_PARAMESELECT.SetFieldPrimaryIndex(PFL_PARAMESELECT_IMDBDESCRIZI, IMDBDef7.FLD_CFESTAPPPASE_DESCRIZIONE);
    PAN_PARAMESELECT.SetFieldPrimaryIndex(PFL_PARAMESELECT_IMDBSTATO, IMDBDef7.FLD_CFESTAPPPASE_STATO);
    PAN_PARAMESELECT.SetFieldPrimaryIndex(PFL_PARAMESELECT_IMDBUTENINSE, IMDBDef7.FLD_CFESTAPPPASE_UTENTE_INSERIMENTO);
    PAN_PARAMESELECT.SetFieldPrimaryIndex(PFL_PARAMESELECT_IMDBDATAINSE, IMDBDef7.FLD_CFESTAPPPASE_DATA_INSERIMENTO);
    PAN_PARAMESELECT.SetFieldPrimaryIndex(PFL_PARAMESELECT_IMDUTEULTAGG, IMDBDef7.FLD_CFESTAPPPASE_UTENTE_ULTIMO_AGG);
    PAN_PARAMESELECT.SetFieldPrimaryIndex(PFL_PARAMESELECT_IMDDATULTAGG, IMDBDef7.FLD_CFESTAPPPASE_DATA_ULTIMO_AGG);
    PAN_PARAMESELECT.SetMasterTable(0, "CFESTAPPPASE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMESELECT.Status() == 2)
    {
      int oldListQBE = PAN_PARAMESELECT.iUseListQBE;
      PAN_PARAMESELECT.iUseListQBE = 0;
      PAN_PARAMESELECT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMESELECT.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMESELECT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CFESTRASELEC) PAN_CFESTRASELEC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMESELECT) PAN_PARAMESELECT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CFESTRASELEC) PAN_CFESTRASELEC_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMESELECT) PAN_PARAMESELECT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CFESTRASELEC) PAN_CFESTRASELEC_DynamicProperties();
    if (SrcObj == PAN_PARAMESELECT) PAN_PARAMESELECT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CFESTRASELEC) PAN_CFESTRASELEC_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMESELECT) PAN_PARAMESELECT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMESELECT) PAN_PARAMESELECT_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_CFESTRASELEC) PAN_CFESTRASELEC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMESELECT) PAN_PARAMESELECT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
