// **********************************************
// Mandati Per Vers IVA Istituzionale
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MandatiPerVersIVAIstituzionale extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARS_PERIODO = 0;
  private static int GRP_PARS_PROVVEDIMENT = 1;
  private static int GRP_PARS_CONTABTESORE = 2;
  private static int GRP_PARS_MANDATINFORM = 3;

  private static int PFL_PARS_ETICHETTASF2 = 0;
  private static int PFL_PARS_MESE = 1;
  private static int PFL_PARS_DAL = 2;
  private static int PFL_PARS_AL = 3;
  private static int PFL_PARS_ETICHETTASF1 = 4;
  private static int PFL_PARS_SEDEDEL = 5;
  private static int PFL_PARS_NUMERODEL = 6;
  private static int PFL_PARS_ANNODEL = 7;
  private static int PFL_PARS_ETICHSCELDEL = 8;
  private static int PFL_PARS_UNITAPROPONE = 9;
  private static int PFL_PARS_NUMEROPROPOS = 10;
  private static int PFL_PARS_ANNOPROPOSTA = 11;
  private static int PFL_PARS_ETICSCELPROP = 12;
  private static int PFL_PARS_BENEFICIARIO = 13;
  private static int PFL_PARS_BENBENEFERAR = 14;
  private static int PFL_PARS_QUIETANZA = 15;
  private static int PFL_PARS_BOLLO = 16;
  private static int PFL_PARS_UFFICIO = 17;
  private static int PFL_PARS_CAUSALE = 18;
  private static int PFL_PARS_NUMEROCONTAB = 19;
  private static int PFL_PARS_DATACONTABIL = 20;
  private static int PFL_PARS_ETICHETTASF = 21;
  private static int PFL_PARS_SPESE = 22;
  private static int PFL_PARS_SCADENZA = 23;
  private static int PFL_PARS_COMMISSIONI = 24;
  private static int PFL_PARS_ALLEGATI = 25;
  private static int PFL_PARS_INFOTESORIER = 26;
  private static int PFL_PARS_ETICHESTAMPA = 27;
  private static int PFL_PARS_ETICHEELABOR = 28;
  private static int PFL_PARS_ETICHEATTENZ = 29;

  private static int PPQRY_PARS77 = 0;

  private static int PPQRY_BEN = 1;

  private static int PPQRY_QTN = 2;
  private static int PPQRY_T60 = 3;
  private static int PPQRY_T53 = 4;
  private static int PPQRY_T58 = 5;
  private static int PPQRY_TIPISPESMINF = 6;


  IDPanel PAN_PARS;
  private static int PFL_NOTEFUNZIONA_MODULO = 0;
  private static int PFL_NOTEFUNZIONA_PAGINA = 1;
  private static int PFL_NOTEFUNZIONA_FUNZIONE = 2;
  private static int PFL_NOTEFUNZIONA_DESCRIZIONE = 3;

  private static int PPQRY_NOTEFUNZION3 = 0;


  IDPanel PAN_NOTEFUNZIONA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS75(IMDB);
    //
    //
    Init_PQRY_PARS77(IMDB);
    Init_PQRY_PARS77_RS(IMDB);
    Init_PQRY_NOTEFUNZION3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS75(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARS75, 21);
    IMDB.set_TblCode(IMDBDef5.TBL_PARS75, "TBL_PARS75");
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGETDAL, "NOMEOGGETDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGETDAL,6,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGETTAL, "NOMEOGGETTAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGETTAL,6,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGEMESE, "NOMEOGGEMESE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGEMESE,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGEBENE, "NOMEOGGEBENE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGEBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGESPES, "NOMEOGGESPES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGESPES,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGECOMM, "NOMEOGGECOMM");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGECOMM,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGEALLE, "NOMEOGGEALLE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGEALLE,5,250,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMOGGINFTES, "NOMOGGINFTES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMOGGINFTES,5,250,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGESCAD, "NOMEOGGESCAD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGESCAD,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGEQUIE, "NOMEOGGEQUIE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGEQUIE,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGEBOLL, "NOMEOGGEBOLL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMEOGGEBOLL,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMOGGNUMCON, "NOMOGGNUMCON");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMOGGNUMCON,5,50,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMOGGDATCON, "NOMOGGDATCON");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS75,IMDBDef5.FLD_PARS75_NOMOGGDATCON,6,16,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARS75, 0);
  }

  private static void Init_PQRY_PARS77(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARS77, 21);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARS77, "PQRY_PARS77");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGETDAL, "NOMEOGGETDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGETDAL,6,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGETTAL, "NOMEOGGETTAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGETTAL,6,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGEMESE, "NOMEOGGEMESE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGEMESE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGEBENE, "NOMEOGGEBENE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGEBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGESPES, "NOMEOGGESPES");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGESPES,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGESCAD, "NOMEOGGESCAD");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGESCAD,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGECOMM, "NOMEOGGECOMM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGECOMM,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGEALLE, "NOMEOGGEALLE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGEALLE,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMOGGINFTES, "NOMOGGINFTES");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMOGGINFTES,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGEQUIE, "NOMEOGGEQUIE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGEQUIE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGEBOLL, "NOMEOGGEBOLL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMEOGGEBOLL,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMOGGNUMCON, "NOMOGGNUMCON");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMOGGNUMCON,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMOGGDATCON, "NOMOGGDATCON");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77,IMDBDef15.PQSL_PARS77_NOMOGGDATCON,6,16,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARS77, 0);
  }

  private static void Init_PQRY_PARS77_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARS77_RS, 21);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARS77_RS, "PQRY_PARS77_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGETDAL, "NOMEOGGETDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGETDAL,6,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGETTAL, "NOMEOGGETTAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGETTAL,6,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGEMESE, "NOMEOGGEMESE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGEMESE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGEBENE, "NOMEOGGEBENE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGEBENE,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGESPES, "NOMEOGGESPES");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGESPES,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGESCAD, "NOMEOGGESCAD");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGESCAD,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGECOMM, "NOMEOGGECOMM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGECOMM,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGEALLE, "NOMEOGGEALLE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGEALLE,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMOGGINFTES, "NOMOGGINFTES");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMOGGINFTES,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGEQUIE, "NOMEOGGEQUIE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGEQUIE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGEBOLL, "NOMEOGGEBOLL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMEOGGEBOLL,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMOGGNUMCON, "NOMOGGNUMCON");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMOGGNUMCON,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMOGGDATCON, "NOMOGGDATCON");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS77_RS,IMDBDef15.PQSL_PARS77_NOMOGGDATCON,6,16,0);
  }

  private static void Init_PQRY_NOTEFUNZION3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NOTEFUNZION3, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_NOTEFUNZION3, "PQRY_NOTEFUNZION3");
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZION3,IMDBDef15.PQSL_NOTEFUNZION3_MODULO, "MODULO");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZION3,IMDBDef15.PQSL_NOTEFUNZION3_MODULO,5,20,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZION3,IMDBDef15.PQSL_NOTEFUNZION3_PAGINA, "PAGINA");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZION3,IMDBDef15.PQSL_NOTEFUNZION3_PAGINA,5,200,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZION3,IMDBDef15.PQSL_NOTEFUNZION3_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZION3,IMDBDef15.PQSL_NOTEFUNZION3_FUNZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NOTEFUNZION3,IMDBDef15.PQSL_NOTEFUNZION3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_NOTEFUNZION3,IMDBDef15.PQSL_NOTEFUNZION3_DESCRIZIONE,9,9999,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_NOTEFUNZION3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MandatiPerVersIVAIstituzionale(MyWebEntryPoint w, IMDBObj imdb)
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
  public MandatiPerVersIVAIstituzionale()
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
    FormIdx = MyGlb.FRM_MANPERVEIVIS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "823CBB77-1745-4415-A279-1AB9CEE0E902";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1056;
    DesignHeight = 534;
    set_Caption(new IDVariant("Mandati per Vers. IVA Istituzionale"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1056;
    Frames[1].Height = 508;
    Frames[1].FormFactor = 0.625;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 660;
    Frames[2].Height = 508;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pars";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 660;
    Frames[2].FixedHeight = 508;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    PAN_PARS = new IDPanel(w, this, 2, "PAN_PARS");
    Frames[2].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 660-MyGlb.PAN_OFFS_X, 508-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "32F1FB14-2965-4981-9A5D-AEAA7EAABC61");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2492, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 1;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 396;
    Frames[3].Height = 508;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "NOTE FUNZIONALITA";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 508;
    PAN_NOTEFUNZIONA = new IDPanel(w, this, 3, "PAN_NOTEFUNZIONA");
    Frames[3].Content = PAN_NOTEFUNZIONA;
    PAN_NOTEFUNZIONA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTEFUNZIONA.VS = MainFrm.VisualStyleList;
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 396-MyGlb.PAN_OFFS_X, 508-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AC8EC139-9676-4B73-A61B-1AE1AE696B80");
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARS75, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        MANPERVEIVIS_PARS77();
      }
      PAN_PARS.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARS.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARS_ETICHSCELDEL) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARS.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARS_ETICSCELPROP) {
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
    return (obj instanceof MandatiPerVersIVAIstituzionale);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MandatiPerVersIVAIstituzionale.class.getName() : (Glb.ClassWithPackage(MandatiPerVersIVAIstituzionale.class) ? MandatiPerVersIVAIstituzionale.class.getName().substring(MandatiPerVersIVAIstituzionale.class.getPackage().getName().length() + 1) : MandatiPerVersIVAIstituzionale.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Pars On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pars On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARS_SEDEDEL)), true) || Column.equals((new IDVariant(PFL_PARS_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_PARS_ANNODEL)), true))
      {
        IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
        IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_SEDE_DEL, 0)));
        v_SEDEDEL = IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_SEDE_DEL, 0);
        v_ANNODEL = IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_ANNO_DEL, 0);
        v_NUMERODEL = IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NUMERO_DEL, 0);
        MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_SEDE_DEL, 0, new IDVariant(v_SEDEDEL));
        IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NUMERO_DEL, 0, new IDVariant(v_NUMERODEL));
        IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_ANNO_DEL, 0, new IDVariant(v_ANNODEL));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_SEDE_DEL, 0))))
        {
          IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_SEDE_DEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARS_UNITAPROPONE)), true) || Column.equals((new IDVariant(PFL_PARS_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_PARS_ANNOPROPOSTA)), true))
      {
        IDVariant v_UNITAPROP = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNOPROP = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMEROPROP = new IDVariant(0,IDVariant.INTEGER);
        v_UNITAPROP = IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_UNITA_PROPONENTE, 0);
        v_ANNOPROP = IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_ANNO_PROPOSTA, 0);
        v_NUMEROPROP = IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NUMERO_PROPOSTA, 0);
        MainFrm.ControlloProposte(v_UNITAPROP, v_ANNOPROP, v_NUMEROPROP);
        IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_UNITA_PROPONENTE, 0, new IDVariant(v_UNITAPROP));
        IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NUMERO_PROPOSTA, 0, new IDVariant(v_NUMEROPROP));
        IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_ANNO_PROPOSTA, 0, new IDVariant(v_ANNOPROP));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_UNITA_PROPONENTE, 0))))
        {
          IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_UNITA_PROPONENTE, 0, IDL.Upper(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_UNITA_PROPONENTE, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARS_BENEFICIARIO)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEQUIE, 0, (new IDVariant()));
        IDVariant v_VMIN = null;
        v_VMIN = (new IDVariant());
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEBENE, 0))))
        {
          // SQL = new StringBuffer();
          // SQL.append("select ");
          // SQL.append("  MIN(A.NUM_QUIETANZA) as MINQTNNUMQUI ");
          // SQL.append("from ");
          // SQL.append("  QTN A ");
          // SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEBENE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          // SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
          // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          // if (!QV.EOF()) QV.MoveNext();
          // if (!QV.EOF())
          // {
          //   v_VMIN = QV.Get("MINQTNNUMQUI", IDVariant.INTEGER) ;
          // }
          // QV.Close();
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  MIN(A.NUM_QUIETANZA) as MINQTNNUMQUI ");
          SQL.append("from ");
          SQL.append("  QTN A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEBENE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.PREVALENTE = 'SI') ");
          SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VMIN = QV.Get("MINQTNNUMQUI", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (IDL.IsNull(v_VMIN))
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  MIN(A.NUM_QUIETANZA) as MINQTNNUMQUI ");
            SQL.append("from ");
            SQL.append("  QTN A ");
            SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEBENE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VMIN = QV.Get("MINQTNNUMQUI", IDVariant.INTEGER) ;
            }
            QV.Close();
          }
          IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEQUIE, 0, new IDVariant(v_VMIN));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiPerVersIVAIstituzionale", "ParsOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Pars On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_PARS_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pars On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_PARS_BENBENEFERAR)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_STRINDACERCA = null;
          v_STRINDACERCA = IDL.Add(IDL.Add((new IDVariant("%")), (new IDVariant(PAN_PARS.FieldText(PFL_PARS_BENBENEFERAR)))), (new IDVariant("%")));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  BEN A ");
          SQL.append("where ((LOWER(TO_CHAR ( A.CODICE )) || '-' || A.RAGIONE_SOCIALE_ESTESA LIKE " + IDL.CSql(v_STRINDACERCA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") OR (LOWER(TO_CHAR ( A.CODICE_FISCALE )) LIKE " + IDL.CSql(v_STRINDACERCA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") OR LOWER(TO_CHAR ( A.PARTITA_IVA )) LIKE " + IDL.CSql(v_STRINDACERCA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.DAL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
          SQL.append("and   (DECODE(A.D_SCADENZA, to_number(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
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
      MainFrm.ErrObj.ProcError ("MandatiPerVersIVAIstituzionale", "ParsOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Pars On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARS);
      // 
      // Pars On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (MainFrm.PERIOVERSIVA.equals((new IDVariant("M")), true))
      {
        if (IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEMESE, 0).equals((new IDVariant(12)), true))
        {
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICHEATTENZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICHEATTENZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiPerVersIVAIstituzionale", "ParsOnDynamicProperties", _e);
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
      IDVariant v_LICENZAMIF1 = new IDVariant(0,IDVariant.INTEGER);
      IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_UFFICIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0));
      if (MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.PERIOVERSIVA.equals((new IDVariant("M")), true))
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_DAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_MESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICHEATTENZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (IDL.Month(IDL.Today()).equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGEMESE, 0, (new IDVariant(12)));
        }
        else
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGEMESE, 0, IDL.Sub(IDL.Month(IDL.Today()), (new IDVariant(1))));
        }
      }
      else
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_MESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICHEATTENZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_DAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_AL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETDAL, 0, IDL.Today());
        IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETTAL, 0, IDL.Today());
      }
      v_LICENZAMIF1 = (new IDVariant(MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF")))));
      // 
      // Visibilità Mandato Informatico
      // 
      {
        if (MainFrm.LIQMO.equals((new IDVariant("SI")), true))
        {
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          if (v_LICENZAMIF1.booleanValue() && MainFrm.GESTIONSPESE.equals((new IDVariant("SI")), true))
          {
            PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          if (v_LICENZAMIF1.booleanValue() && MainFrm.GESTIOALLEGA.equals((new IDVariant("SI")), true))
          {
            PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          if (v_LICENZAMIF1.booleanValue())
          {
            PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_SCADENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        if (v_LICENZAMIF1.booleanValue() && MainFrm.GESTIOCOMMIS.equals((new IDVariant("SI")), true))
        {
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_COMMISSIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (v_LICENZAMIF1.booleanValue() && MainFrm.GESTINFOTESO.equals((new IDVariant("SI")), true))
        {
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_INFOTESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (!(v_LICENZAMIF1.booleanValue()) && MainFrm.LIQMO.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_PARS.SetFlags (Glb.OBJ_GROUP, GRP_PARS_MANDATINFORM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiPerVersIVAIstituzionale", "Load", _e);
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
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiPerVersIVAIstituzionale", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETTAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGEMESE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_SEDE_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NUMERO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_ANNO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_UNITA_PROPONENTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NUMERO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_ANNO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGEBENE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_UFFICIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_CAUSALE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGESPES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGECOMM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGEALLE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMOGGINFTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGESCAD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGEQUIE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGEBOLL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMOGGNUMCON, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMOGGDATCON, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
          IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
          IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
        }
        else
        {
          // IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_SEDE_DEL, 0, (new IDVariant()));
          // IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NUMERO_DEL, 0, (new IDVariant()));
          // IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_ANNO_DEL, 0, (new IDVariant()));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
          IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
          IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        }
        else
        {
          // IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_UNITA_PROPONENTE, 0, (new IDVariant()));
          // IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NUMERO_PROPOSTA, 0, (new IDVariant()));
          // IMDB.set_Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_ANNO_PROPOSTA, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiPerVersIVAIstituzionale", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Etichetta Scelta Del
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Del Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiPerVersIVAIstituzionale", "EtichettaSceltaDel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Proposta
  // **********************************************************************
  public int SceltaProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Proposta Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiPerVersIVAIstituzionale", "SceltaProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Presenza Fatture Miste Ist Non Ist
  // **********************************************************************
  public boolean PresenzaFattureMisteIstNonIst ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Presenza Fatture Miste Ist Non Ist Body
      // Corpo Procedura
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  MAN B, ");
      SQL.append("  FAT C, ");
      SQL.append("  IVA D, ");
      SQL.append("  T04 E, ");
      SQL.append("  T09 F ");
      SQL.append("where (B.ANNO_MAND = A.ANNO_MAND) ");
      SQL.append("and   (B.NUMERO_MAND = A.NUMERO_MAND) ");
      SQL.append("and   (C.ANNO_PROG = A.FAT_ANNO_PROG) ");
      SQL.append("and   (C.NUMERO_PROG = A.FAT_NUMERO_PROG) ");
      SQL.append("and   ((B.D_DATA_MAND BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETDAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETTAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (C.TRATTAMENTO_IVA = 'SP' OR C.TRATTAMENTO_IVA = 'RC') ");
      SQL.append("and   ((A.ANNO_LIQ_IVA IS NULL)) ");
      SQL.append("and   ((A.NUMERO_LIQ_IVA IS NULL)) ");
      SQL.append("and   (D.ANNO_PROG = C.ANNO_PROG) ");
      SQL.append("and   (D.NUMERO_PROG = C.NUMERO_PROG) ");
      SQL.append("and   (E.TIPO_REGISTRO = D.TIPO_REGISTRO) ");
      SQL.append("and   (E.TIPO_BOLLATO = D.SERVIZIO) ");
      SQL.append("and   (F.CODICE = E.ATTIVITA) ");
      SQL.append("and   (F.ISTITUZIONALE = 'SI') ");
      SQL.append("and   ((A.IMPORTO_IVA_IST IS NULL)) ");
      SQL.append("and   ((A.TIPO_REGISTRO_DEF IS NULL) AND A.IMPORTO < C.IMPORTO + NVL(C.VARIAZIONI, 0)) ");
      SQL.append("and   (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  1 ");
      SQL.append("from ");
      SQL.append("  IVA G, ");
      SQL.append("  T04 t04BIS, ");
      SQL.append("  T09 t09bis ");
      SQL.append("where (G.ANNO_PROG = D.ANNO_PROG) ");
      SQL.append("and   (G.NUMERO_PROG = D.NUMERO_PROG) ");
      SQL.append("and   (G.PROGRESSIVO <> D.PROGRESSIVO) ");
      SQL.append("and   (t04BIS.TIPO_REGISTRO = G.TIPO_REGISTRO) ");
      SQL.append("and   (t04BIS.TIPO_BOLLATO = G.SERVIZIO) ");
      SQL.append("and   (t09bis.CODICE = t04BIS.ATTIVITA) ");
      SQL.append("and   ((t09bis.ISTITUZIONALE IS NULL)) ");
      SQL.append("))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      IDVariant v_TRATTATI = new IDVariant(0,IDVariant.INTEGER);
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
      {
        v_TRATTATI = AutoSettaggioIVAIst();
        if (v_VCOUNT.equals(v_TRATTATI, true))
        {
          return (new IDVariant(0)).booleanValue();
        }
        else
        {
          return (new IDVariant(-1)).booleanValue();
        }
      }
      else
      {
        return (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiPerVersIVAIstituzionale", "PresenzaFattureMisteIstNonIst", _e);
      return false;
    }
  }

  // **********************************************************************
  // Auto Settaggio IVA Ist
  // **********************************************************************
  public IDVariant AutoSettaggioIVAIst ()
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
      // Auto Settaggio IVA Ist Body
      // Corpo Procedura
      // 
      IDVariant v_RET = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select distinct ");
      SQL.append("  C.ANNO_PROG as FATANNOPROG, ");
      SQL.append("  C.NUMERO_PROG as FATNUMERPROG, ");
      SQL.append("  A.ANNO_LIQ as ANNOLIQ, ");
      SQL.append("  A.NUMERO_LIQ as NUMEROLIQ ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  MAN B, ");
      SQL.append("  FAT C, ");
      SQL.append("  IVA D, ");
      SQL.append("  T04 E, ");
      SQL.append("  T09 F ");
      SQL.append("where (B.ANNO_MAND = A.ANNO_MAND) ");
      SQL.append("and   (B.NUMERO_MAND = A.NUMERO_MAND) ");
      SQL.append("and   (C.ANNO_PROG = A.FAT_ANNO_PROG) ");
      SQL.append("and   (C.NUMERO_PROG = A.FAT_NUMERO_PROG) ");
      SQL.append("and   ((B.D_DATA_MAND BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETDAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETTAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (C.TRATTAMENTO_IVA = 'SP' OR C.TRATTAMENTO_IVA = 'RC') ");
      SQL.append("and   ((A.ANNO_LIQ_IVA IS NULL)) ");
      SQL.append("and   ((A.NUMERO_LIQ_IVA IS NULL)) ");
      SQL.append("and   (D.ANNO_PROG = C.ANNO_PROG) ");
      SQL.append("and   (D.NUMERO_PROG = C.NUMERO_PROG) ");
      SQL.append("and   (E.TIPO_REGISTRO = D.TIPO_REGISTRO) ");
      SQL.append("and   (E.TIPO_BOLLATO = D.SERVIZIO) ");
      SQL.append("and   (F.CODICE = E.ATTIVITA) ");
      SQL.append("and   (F.ISTITUZIONALE = 'SI') ");
      SQL.append("and   ((A.IMPORTO_IVA_IST IS NULL)) ");
      SQL.append("and   (A.IMPORTO = C.IMPORTO) ");
      SQL.append("and   ((A.TIPO_REGISTRO_DEF IS NULL) AND A.IMPORTO < C.IMPORTO + NVL(C.VARIAZIONI, 0)) ");
      SQL.append("and   (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  1 ");
      SQL.append("from ");
      SQL.append("  IVA G, ");
      SQL.append("  T04 t04BIS, ");
      SQL.append("  T09 t09bis ");
      SQL.append("where (G.ANNO_PROG = D.ANNO_PROG) ");
      SQL.append("and   (G.NUMERO_PROG = D.NUMERO_PROG) ");
      SQL.append("and   (G.PROGRESSIVO <> D.PROGRESSIVO) ");
      SQL.append("and   (t04BIS.TIPO_REGISTRO = G.TIPO_REGISTRO) ");
      SQL.append("and   (t04BIS.TIPO_BOLLATO = G.SERVIZIO) ");
      SQL.append("and   (t09bis.CODICE = t04BIS.ATTIVITA) ");
      SQL.append("and   ((t09bis.ISTITUZIONALE IS NULL)) ");
      SQL.append("))) ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        IDVariant v_SOMMAIVAIST = new IDVariant(0,IDVariant.DECIMAL);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  GET_TOT_IVA_IST(" + IDL.CSql(C2.Get("FATANNOPROG"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C2.Get("FATNUMERPROG"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as GTIILFAPLFNP ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_SOMMAIVAIST = QV.Get("GTIILFAPLFNP", IDVariant.DECIMAL) ;
        }
        QV.Close();
        // SQL = new StringBuffer();
        // SQL.append("select ");
        // SQL.append("  NVL(SUM(A.IVA * DECODE(A.CODICE_DOC, B.CODICE_DOC, 1, -1)), 0) as NVSIIEICDFCD ");
        // SQL.append("from ");
        // SQL.append("  IVA A, ");
        // SQL.append("  FAT B ");
        // SQL.append("where (A.ANNO_PROG = " + IDL.CSql(C2.Get("FATANNOPROG"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        // SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(C2.Get("FATNUMERPROG"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        // SQL.append("and   (B.ANNO_PROG = A.ANNO_PROG) ");
        // SQL.append("and   (B.NUMERO_PROG = A.NUMERO_PROG) ");
        // SQL.append("and   (SE_ATTIVITA_IST(A.TIPO_REGISTRO,A.SERVIZIO) = 'SI') ");
        // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        // if (!QV.EOF()) QV.MoveNext();
        // if (!QV.EOF())
        // {
        //   v_SOMMAIVAIST = QV.Get("NVSIIEICDFCD", IDVariant.DECIMAL) ;
        // }
        // QV.Close();
        try
        {
          SQL = new StringBuffer();
          SQL.append("update LIQ set ");
          SQL.append("  IMPORTO_IVA_IST = " + IDL.CSql(v_SOMMAIVAIST, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append("where (ANNO_LIQ = " + IDL.CSql(C2.Get("ANNOLIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(C2.Get("NUMEROLIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e4)
        {
          break;
        }
        v_RET = IDL.Add(v_RET, (new IDVariant(1)));
        C2.MoveNext();
      }
      C2.Close();
      return v_RET;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiPerVersIVAIstituzionale", "AutoSettaggioIVAIst", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      if (MainFrm.PERIOVERSIVA.equals((new IDVariant("M")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEMESE, 0)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Indicare il mese"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
        else
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEMESE, 0),(new IDVariant(1))), (new IDVariant(1))));
          IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETTAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEMESE, 0), MainFrm.Finemese(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEMESE, 0),(new IDVariant(1))), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))));
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGETDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGETTAL, 0)))
        {
          IDVariant S = null;
          S = new IDVariant(MainFrm.G_I);
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
        else
        {
          if (IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGETDAL, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGETTAL, 0), true)>0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Date incoerenti"));
            MainFrm.set_AlertMessage(S); 
            return 0;
          }
        }
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEBENE, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Beneficiario Obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEQUIE, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Quietanza Obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (PresenzaFattureMisteIstNonIst())
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Sono presenti documenti con trattamento iva SP o RC e attività promiscue (sia istituzionali che commerciali). Prima di procedere occorre indicare la quota di iva isituzionale da versare all'Erario "));
        MainFrm.set_AlertMessage(S); 
        IMDB.set_Value(IMDBDef5.TBL_PARS79, IMDBDef5.FLD_PARS79_NOMEOGGETDAL, 0, IMDB.Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETDAL, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARS79, IMDBDef5.FLD_PARS79_NOMEOGGETTAL, 0, IMDB.Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETTAL, 0));
        MainFrm.Show(MyGlb.FRM_ELLICOIMIIDV, (new IDVariant(-1)).intValue(), this); 
        return 0;
      }
      IDVariant v_DA = new IDVariant(0,IDVariant.INTEGER);
      IDVariant A = new IDVariant(0,IDVariant.INTEGER);
      v_DA = (new IDVariant());
      A = (new IDVariant());
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.EMISSMANVERSIVAIST(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETDAL, 0), IMDB.Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETTAL, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_SEDE_DEL, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NUMERO_DEL, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_ANNO_DEL, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_UNITA_PROPONENTE, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NUMERO_PROPOSTA, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_ANNO_PROPOSTA, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEBENE, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_UFFICIO, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_CAUSALE, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGECOMM, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMOGGINFTES, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGESPES, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGESCAD, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEALLE, 0), v_DA, A, IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEQUIE, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEBOLL, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMOGGNUMCON, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMOGGDATCON, 0));
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
        v_MESSAGGIO = (new IDVariant("Elaborazione Eseguita <BR/>"));
        if (v_DA.compareTo(A, true)<=0)
        {
          IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
          v_STR = (new IDVariant("Emessi mandati da ", IDVariant.STRING));
          v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, v_STR), IDL.ToString(v_DA)), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), IDL.ToString(A));
        }
        else
        {
          IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
          v_STR = (new IDVariant("Non sono stati emessi Mandati", IDVariant.STRING));
          v_MESSAGGIO = IDL.Add(v_MESSAGGIO, v_STR);
        }
        MainFrm.set_AlertMessage(v_MESSAGGIO); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiPerVersIVAIstituzionale", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Stampa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaStampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Stampa Body
      // Corpo Procedura
      // 
      IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
      v_PAR1 = (new IDVariant("A_DAL"));
      IDVariant v_PAR2 = new IDVariant(0,IDVariant.STRING);
      v_PAR2 = (new IDVariant("A_AL"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Dettaglio_Mandati_Generati"));
      if (MainFrm.PERIOVERSIVA.equals((new IDVariant("M")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEMESE, 0)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Indicare il mese"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
        else
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEMESE, 0),(new IDVariant(1))), (new IDVariant(1))));
          IMDB.set_Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETTAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEMESE, 0), MainFrm.Finemese(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGEMESE, 0),(new IDVariant(1))), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))));
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGETDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGETTAL, 0)))
        {
          IDVariant S = null;
          S = new IDVariant(MainFrm.G_I);
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
        else
        {
          if (IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGETDAL, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_PARS77, IMDBDef15.PQSL_PARS77_NOMEOGGETTAL, 0), true)>0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Date incoerenti"));
            MainFrm.set_AlertMessage(S); 
            return 0;
          }
        }
      }
      MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETDAL, 0)));
      MainFrm.SetParametroStampaJasper(v_PAR2, IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETTAL, 0)));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiPerVersIVAIstituzionale", "EtichettaStampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void MANPERVEIVIS_PARS77() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARS77_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARS75, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARS75, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARS77_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARS77_RS, 0, IMDBDef5.TBL_PARS75, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 0, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 1, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGETTAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 2, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGEMESE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 3, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 4, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 5, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_ANNO_DEL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 6, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_UNITA_PROPONENTE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 7, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NUMERO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 8, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_ANNO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 9, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGEBENE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 10, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_UFFICIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 11, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_CAUSALE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 12, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGESPES, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 13, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGESCAD, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 14, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGECOMM, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 15, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGEALLE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 16, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMOGGINFTES, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 17, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGEQUIE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 18, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMEOGGEBOLL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 19, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMOGGNUMCON, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS77_RS, 20, 0, IMDBDef5.TBL_PARS75, IMDBDef5.FLD_PARS75_NOMOGGDATCON, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARS75, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARS75, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARS75, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARS77_RS, 0);
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARS_ETICHSCELDEL)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaDel();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARS_ETICSCELPROP)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARS_ETICHESTAMPA)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaStampa();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARS_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
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
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARS_PERIODO, "3CF4F70B-00DF-42E4-BF0C-4A65C049C47B");
    PAN_PARS.set_Header(MyGlb.OBJ_GROUP, GRP_PARS_PERIODO, "Periodo");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARS_PERIODO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARS_PERIODO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_PERIODO, MyGlb.PANEL_LIST, 0, -9999, 112, 16, 0, 0);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_PERIODO, MyGlb.PANEL_FORM, 128, 11, 240, 77, 0, 0);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_PERIODO, 0, 43);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_PERIODO, 1, 13);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_PERIODO, 0, 4);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_PERIODO, 1, 4);
    PAN_PARS.SetFlags(MyGlb.OBJ_GROUP, GRP_PARS_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, "621DB07B-A725-4D82-954A-F4BCAF4D1B67");
    PAN_PARS.set_Header(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, "Provvedimento");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 108, 16, 0, 0);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, MyGlb.PANEL_FORM, 372, 11, 280, 77, 0, 0);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, 0, 87);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, 1, 13);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, 0, 4);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, 1, 4);
    PAN_PARS.SetFlags(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARS_CONTABTESORE, "813A81ED-C534-4343-A9C8-3FBFB170BA2C");
    PAN_PARS.set_Header(MyGlb.OBJ_GROUP, GRP_PARS_CONTABTESORE, "Contabile Tesoreria");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARS_CONTABTESORE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARS_CONTABTESORE, MyGlb.VIS_GROUPSTYLE);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_CONTABTESORE, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_CONTABTESORE, MyGlb.PANEL_FORM, 128, 219, 524, 49, 0, 0);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_CONTABTESORE, 0, 110);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_CONTABTESORE, 1, 13);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_CONTABTESORE, 0, 4);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_CONTABTESORE, 1, 4);
    PAN_PARS.SetFlags(MyGlb.OBJ_GROUP, GRP_PARS_CONTABTESORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, "95FAE8B8-3360-4C41-8494-86D5E313729D");
    PAN_PARS.set_Header(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, "Mandato Informatico");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, MyGlb.VIS_GROUPSTYLE);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, MyGlb.PANEL_LIST, 0, -9999, 420, 16, 0, 0);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, MyGlb.PANEL_FORM, 128, 275, 524, 121, 0, 0);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, 0, 120);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, 1, 13);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, 0, 4);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, 1, 4);
    PAN_PARS.SetFlags(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 30);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, "4DDC0942-54DC-4F53-938B-4A9710E56152");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_MESE, "F9895944-DFEA-48FD-890B-DA497018FA37");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_MESE, " ");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_MESE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_MESE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_MESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DAL, "326DEB79-C6CF-43D3-AB00-B1D12D372C32");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DAL, "Dal");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DAL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_AL, "BE348CE9-CF96-471B-92AE-616F51D083DC");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_AL, "Al");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_AL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, "BB0EC23F-C749-4E3B-B9F6-FF6EC03C5C61");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, "AB415914-D673-4DFC-8D2D-2CA159269E25");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, "Delibera");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "7F1347B6-FE11-43A7-A98C-BF29864EAF52");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "-");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "36014824-292F-413E-A446-E10D47F7A66D");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "/");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, "77CE86A4-85EC-4BED-BA91-41B42A6365D8");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, 0, "wsearch1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, "D36D60EE-F9AB-4828-9516-DD1AF1845286");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, "Proposta");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, "9510BA1F-E94C-4D63-85BE-94AC464E24E1");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, "-");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, "020C0A09-D449-4914-BD5B-9BC2CDFA2979");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, "/");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, "7E35827E-F73C-40EF-86EA-21BB4282E10F");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, 0, "wsearch1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_BENEFICIARIO, "1D038CE4-F8E7-4FA8-9816-CE5EF0994422");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_BENEFICIARIO, "Beneficiario");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_BENEFICIARIO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_BENEFICIARIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_BENEFICIARIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_BENBENEFERAR, "BB7A0A0D-A472-4466-B8D5-34029C6CF6B4");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_BENBENEFERAR, "Beneficiario (Erario)");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_BENBENEFERAR, "Beneficiario (Erario)");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_BENBENEFERAR, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_BENBENEFERAR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_QUIETANZA, "FC281A40-207C-4A0D-82C1-3C3781A04859");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_QUIETANZA, "Quietanza");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_QUIETANZA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_QUIETANZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_BOLLO, "3D0CAF21-B73E-4816-B1DE-70D0B316BC07");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_BOLLO, "Bollo");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_BOLLO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, "8574D1E9-CF05-4DE2-BD2C-D076EC134ABF");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, "Ufficio");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, "88D10EE2-8739-4851-8861-C68A5B1FE6E4");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, "Causale");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROCONTAB, "6F0300B0-C470-4170-94CD-E6CB24765DE4");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROCONTAB, "Numero");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROCONTAB, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROCONTAB, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROCONTAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DATACONTABIL, "22A5138A-5E9C-4E53-8AC2-58EDDA59FC68");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DATACONTABIL, "Data");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DATACONTABIL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DATACONTABIL, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DATACONTABIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, "C4002A9C-AD1B-4CBA-BD13-D98DF816A475");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, " ");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, "sf");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, "24102E38-E387-4E75-AF57-E36060A2EFD7");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, "Spese");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, "B557E0AB-242F-4DEB-BBB0-6BED90148E71");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, "Scadenza");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, "3BFE8FB5-7954-4D3C-80AA-875C82554808");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, "Commissioni");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, "7D61858A-D8CC-4508-A162-94A9DC301DAF");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, "Allegati");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, "694A631D-66ED-4A60-B957-8EF5F730C84E");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, "Info Tesoriere");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHESTAMPA, "B91A31EE-C08A-4FDD-BC12-731B8D93B203");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHESTAMPA, "Stampa Dettagli");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHESTAMPA, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHESTAMPA, 0, "button_large.GIF", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHESTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "C015D9EC-2667-47B8-AA78-1BCF37FE5FB4");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "Genera Mandato");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0, "button_large.GIF", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEATTENZ, "FCE06011-B016-4D91-B2A7-E09B03EEB5AE");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEATTENZ, "Attenzione, scegliendo il mese di Dicembre, verranno trattati i mandati relativi al mese di Dicembre dell'esercizio precedente");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEATTENZ, MyGlb.VIS_ETIGRAFONROS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEATTENZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, MyGlb.PANEL_LIST, 324, 24, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, MyGlb.PANEL_FORM, 324, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHETTASF2, -1, GRP_PARS_PERIODO);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHETTASF2, -1, "", "ETICHETTASF2", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_MESE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_MESE, MyGlb.PANEL_LIST, 40);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_MESE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_MESE, MyGlb.PANEL_LIST, " ");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_MESE, MyGlb.PANEL_FORM, 132, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_MESE, MyGlb.PANEL_FORM, 36);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_MESE, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_MESE, MyGlb.PANEL_FORM, " ");
    PAN_PARS.SetFieldPage(PFL_PARS_MESE, -1, GRP_PARS_PERIODO);
    PAN_PARS.SetFieldPanel(PFL_PARS_MESE, PPQRY_PARS77, "A.NOMEOGGEMESE", "NOMEOGGEMESE", 1, 2, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_MESE, (new IDVariant(1)), "Gennaio", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_MESE, (new IDVariant(2)), "Febbraio", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_MESE, (new IDVariant(3)), "Marzo", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_MESE, (new IDVariant(4)), "Aprile", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_MESE, (new IDVariant(5)), "Maggio", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_MESE, (new IDVariant(6)), "Giugno", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_MESE, (new IDVariant(7)), "Luglio", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_MESE, (new IDVariant(8)), "Agosto", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_MESE, (new IDVariant(9)), "Settembre", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_MESE, (new IDVariant(10)), "Ottobre", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_MESE, (new IDVariant(11)), "Novembre", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_MESE, (new IDVariant(12)), "Dicembre", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DAL, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DAL, MyGlb.PANEL_LIST, 28);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DAL, MyGlb.PANEL_FORM, 132, 64, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DAL, MyGlb.PANEL_FORM, 36);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARS.SetFieldPage(PFL_PARS_DAL, -1, GRP_PARS_PERIODO);
    PAN_PARS.SetFieldPanel(PFL_PARS_DAL, PPQRY_PARS77, "A.NOMEOGGETDAL", "NOMEOGGETDAL", 6, 16, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_AL, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_AL, MyGlb.PANEL_LIST, 20);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_AL, MyGlb.PANEL_FORM, 256, 64, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_AL, MyGlb.PANEL_FORM, 24);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARS.SetFieldPage(PFL_PARS_AL, -1, GRP_PARS_PERIODO);
    PAN_PARS.SetFieldPanel(PFL_PARS_AL, PPQRY_PARS77, "A.NOMEOGGETTAL", "NOMEOGGETTAL", 6, 16, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, MyGlb.PANEL_LIST, 284, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, MyGlb.PANEL_FORM, 260, 68, 8, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHETTASF1, -1, GRP_PARS_PERIODO);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHETTASF1, -1, "", "ETICHETTASF1", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_LIST, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_LIST, "Delibera");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_FORM, 384, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_FORM, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARS.SetFieldPage(PFL_PARS_SEDEDEL, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_SEDEDEL, PPQRY_PARS77, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, "-");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 508, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, "-");
    PAN_PARS.SetFieldPage(PFL_PARS_NUMERODEL, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_NUMERODEL, PPQRY_PARS77, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, "/");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 572, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, "/");
    PAN_PARS.SetFieldPage(PFL_PARS_ANNODEL, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_ANNODEL, PPQRY_PARS77, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 252, 100, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 632, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHSCELDEL, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHSCELDEL, -1, "", "ETICHSCELDEL", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_LIST, 108);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_LIST, "Proposta");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_FORM, 376, 64, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_FORM, 68);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARS.SetFieldPage(PFL_PARS_UNITAPROPONE, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_UNITAPROPONE, PPQRY_PARS77, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_LIST, "-");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_FORM, 508, 64, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_FORM, "-");
    PAN_PARS.SetFieldPage(PFL_PARS_NUMEROPROPOS, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_NUMEROPROPOS, PPQRY_PARS77, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_LIST, 92);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_LIST, "/");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_FORM, 572, 64, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_FORM, "/");
    PAN_PARS.SetFieldPage(PFL_PARS_ANNOPROPOSTA, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_ANNOPROPOSTA, PPQRY_PARS77, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, MyGlb.PANEL_LIST, 260, 108, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, MyGlb.PANEL_FORM, 632, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICSCELPROP, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICSCELPROP, -1, "", "ETICSCELPROP", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_BENEFICIARIO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_BENEFICIARIO, MyGlb.PANEL_LIST, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_BENEFICIARIO, MyGlb.PANEL_FORM, 36, 164, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_BENEFICIARIO, MyGlb.PANEL_FORM, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_PARS.SetFieldPage(PFL_PARS_BENEFICIARIO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_BENEFICIARIO, PPQRY_PARS77, "A.NOMEOGGEBENE", "NOMEOGGEBENE", 2, 15, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_BENBENEFERAR, MyGlb.PANEL_LIST, 0, 36, 412, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_BENBENEFERAR, MyGlb.PANEL_LIST, 136);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_BENBENEFERAR, MyGlb.PANEL_LIST, 2);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_BENBENEFERAR, MyGlb.PANEL_LIST, "Beneficiario (Erario)");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_BENBENEFERAR, MyGlb.PANEL_FORM, 0, 96, 652, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_BENBENEFERAR, MyGlb.PANEL_FORM, 124);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_BENBENEFERAR, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_BENBENEFERAR, MyGlb.PANEL_FORM, "Beneficiario (Erario)");
    PAN_PARS.SetFieldPage(PFL_PARS_BENBENEFERAR, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_BENBENEFERAR, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA", "BENEFIERARIO", 5, 162, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_QUIETANZA, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_QUIETANZA, MyGlb.PANEL_LIST, 68);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_QUIETANZA, MyGlb.PANEL_FORM, 56, 120, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_QUIETANZA, MyGlb.PANEL_FORM, 68);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_PARS.SetFieldPage(PFL_PARS_QUIETANZA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_QUIETANZA, PPQRY_PARS77, "A.NOMEOGGEQUIE", "NOMEOGGEQUIE", 1, 2, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_BOLLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_BOLLO, MyGlb.PANEL_LIST, 36);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_BOLLO, MyGlb.PANEL_FORM, 88, 144, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_BOLLO, MyGlb.PANEL_FORM, 36);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_PARS.SetFieldPage(PFL_PARS_BOLLO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_BOLLO, PPQRY_PARS77, "A.NOMEOGGEBOLL", "NOMEOGGEBOLL", 1, 2, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_LIST, 44);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_FORM, 80, 168, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_FORM, 44);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARS.SetFieldPage(PFL_PARS_UFFICIO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_UFFICIO, PPQRY_PARS77, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_LIST, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_LIST, "Causale");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_FORM, 72, 192, 580, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_FORM, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_PARS.SetFieldPage(PFL_PARS_CAUSALE, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_CAUSALE, PPQRY_PARS77, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROCONTAB, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROCONTAB, MyGlb.PANEL_LIST, 108);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROCONTAB, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROCONTAB, MyGlb.PANEL_LIST, "Numero");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROCONTAB, MyGlb.PANEL_FORM, 132, 244, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROCONTAB, MyGlb.PANEL_FORM, 88);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROCONTAB, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROCONTAB, MyGlb.PANEL_FORM, "Numero");
    PAN_PARS.SetFieldPage(PFL_PARS_NUMEROCONTAB, -1, GRP_PARS_CONTABTESORE);
    PAN_PARS.SetFieldPanel(PFL_PARS_NUMEROCONTAB, PPQRY_PARS77, "A.NOMOGGNUMCON", "NOMOGGNUMCON", 5, 50, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DATACONTABIL, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DATACONTABIL, MyGlb.PANEL_LIST, 92);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DATACONTABIL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DATACONTABIL, MyGlb.PANEL_LIST, "Data");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DATACONTABIL, MyGlb.PANEL_FORM, 312, 244, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DATACONTABIL, MyGlb.PANEL_FORM, 40);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DATACONTABIL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DATACONTABIL, MyGlb.PANEL_FORM, "Data");
    PAN_PARS.SetFieldPage(PFL_PARS_DATACONTABIL, -1, GRP_PARS_CONTABTESORE);
    PAN_PARS.SetFieldPanel(PFL_PARS_DATACONTABIL, PPQRY_PARS77, "A.NOMOGGDATCON", "NOMOGGDATCON", 6, 16, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, MyGlb.PANEL_LIST, 620, 240, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, MyGlb.PANEL_FORM, 632, 244, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHETTASF, -1, GRP_PARS_CONTABTESORE);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHETTASF, -1, "", "ETICHETTASF", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_LIST, 44);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_FORM, 176, 300, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_FORM, 44);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_PARS.SetFieldPage(PFL_PARS_SPESE, -1, GRP_PARS_MANDATINFORM);
    PAN_PARS.SetFieldPanel(PFL_PARS_SPESE, PPQRY_PARS77, "A.NOMEOGGESPES", "NOMEOGGESPES", 1, 1, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_LIST, 64);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_FORM, 156, 324, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_FORM, 64);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_PARS.SetFieldPage(PFL_PARS_SCADENZA, -1, GRP_PARS_MANDATINFORM);
    PAN_PARS.SetFieldPanel(PFL_PARS_SCADENZA, PPQRY_PARS77, "A.NOMEOGGESCAD", "NOMEOGGESCAD", 6, 19, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_LIST, 80);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_LIST, "Commissioni");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_FORM, 464, 324, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_FORM, 80);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_PARS.SetFieldPage(PFL_PARS_COMMISSIONI, -1, GRP_PARS_MANDATINFORM);
    PAN_PARS.SetFieldPanel(PFL_PARS_COMMISSIONI, PPQRY_PARS77, "A.NOMEOGGECOMM", "NOMEOGGECOMM", 1, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_COMMISSIONI, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_LIST, 0, 36, 420, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_LIST, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_LIST, 2);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_FORM, 168, 348, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_FORM, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_PARS.SetFieldPage(PFL_PARS_ALLEGATI, -1, GRP_PARS_MANDATINFORM);
    PAN_PARS.SetFieldPanel(PFL_PARS_ALLEGATI, PPQRY_PARS77, "A.NOMEOGGEALLE", "NOMEOGGEALLE", 5, 250, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_LIST, 0, 36, 420, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_LIST, 88);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_LIST, 2);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_FORM, 132, 372, 516, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_FORM, 88);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_PARS.SetFieldPage(PFL_PARS_INFOTESORIER, -1, GRP_PARS_MANDATINFORM);
    PAN_PARS.SetFieldPanel(PFL_PARS_INFOTESORIER, PPQRY_PARS77, "A.NOMOGGINFTES", "NOMOGGINFTES", 5, 250, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHESTAMPA, MyGlb.PANEL_LIST, 168, 96, 116, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHESTAMPA, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHESTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHESTAMPA, MyGlb.PANEL_FORM, 544, 412, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHESTAMPA, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHESTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHESTAMPA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHESTAMPA, -1, "", "ETICHESTAMPA", 0, 0, 0, -13997);
    PAN_PARS.set_ImageResizeMode(PFL_PARS_ETICHESTAMPA, 3);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 160, 88, 116, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 424, 412, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHEELABOR, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PARS.set_ImageResizeMode(PFL_PARS_ETICHEELABOR, 3);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEATTENZ, MyGlb.PANEL_LIST, 128, 300, 436, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEATTENZ, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEATTENZ, MyGlb.PANEL_LIST, 2);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEATTENZ, MyGlb.PANEL_FORM, 128, 448, 524, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEATTENZ, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEATTENZ, MyGlb.PANEL_FORM, 2);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHEATTENZ, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHEATTENZ, -1, "", "ETICHEATTENZ", 0, 0, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 7);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENEFIERARIO, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGEBENE~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_PARS.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_PARS.SetQueryLKE(PPQRY_BEN, PFL_PARS_BENEFICIARIO, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENEFIERARIO, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_PARS.SetQueryHeaderColumn(PPQRY_BEN, "BENEFIERARIO", "Beneficiario Erario");
    PAN_PARS.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "BEN CODICE FISCALE");
    PAN_PARS.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "BEN PARTITA IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUM_QUIETANZA as QTNNUMQUIETA, ");
    SQL.append("  TO_CHAR ( A.NUM_QUIETANZA ) || ' - ' || B.DESCRIZIONE as QTNNUMQUIET1 ");
    SQL.append("from ");
    SQL.append("  QTN A, ");
    SQL.append("  T02 B ");
    SQL.append("where (A.NUM_QUIETANZA = ~~NOMEOGGEQUIE~~) ");
    SQL.append("and   (B.CODICE = A.TIPO_QUIETANZA) ");
    SQL.append("and   (A.CODICE = ~~NOMEOGGEBENE~~) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.NUM_QUIETANZA ");
    PAN_PARS.SetQuery(PPQRY_QTN, 0, SQL, PFL_PARS_QUIETANZA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUM_QUIETANZA as QTNNUMQUIETA, ");
    SQL.append("  TO_CHAR ( A.NUM_QUIETANZA ) || ' - ' || B.DESCRIZIONE as QTNNUMQUIET1 ");
    SQL.append("from ");
    SQL.append("  QTN A, ");
    SQL.append("  T02 B ");
    SQL.append("where (B.CODICE = A.TIPO_QUIETANZA) ");
    SQL.append("and   (A.CODICE = ~~NOMEOGGEBENE~~) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.NUM_QUIETANZA ");
    PAN_PARS.SetQuery(PPQRY_QTN, 1, SQL, PFL_PARS_QUIETANZA, "");
    PAN_PARS.SetQueryDB(PPQRY_QTN, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGEBOLL~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_T60, 0, SQL, PFL_PARS_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_T60, 1, SQL, PFL_PARS_BOLLO, "");
    PAN_PARS.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~UFFICIO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_T53, 0, SQL, PFL_PARS_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_T53, 1, SQL, PFL_PARS_UFFICIO, "");
    PAN_PARS.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T57T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~CAUSALE~~) ");
    PAN_PARS.SetQuery(PPQRY_T58, 0, SQL, PFL_PARS_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T57T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    PAN_PARS.SetQuery(PPQRY_T58, 1, SQL, PFL_PARS_CAUSALE, "");
    PAN_PARS.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGESPES~~) ");
    SQL.append("order by 2 ");
    PAN_PARS.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_PARS_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by 2 ");
    PAN_PARS.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_PARS_SPESE, "");
    PAN_PARS.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS77", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS77, IMDBDef15.PQRY_PARS77_RS, IMDBDef5.TBL_PARS75);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_MESE, IMDBDef5.FLD_PARS75_NOMEOGGEMESE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_DAL, IMDBDef5.FLD_PARS75_NOMEOGGETDAL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_AL, IMDBDef5.FLD_PARS75_NOMEOGGETTAL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_SEDEDEL, IMDBDef5.FLD_PARS75_SEDE_DEL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_NUMERODEL, IMDBDef5.FLD_PARS75_NUMERO_DEL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ANNODEL, IMDBDef5.FLD_PARS75_ANNO_DEL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_UNITAPROPONE, IMDBDef5.FLD_PARS75_UNITA_PROPONENTE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_NUMEROPROPOS, IMDBDef5.FLD_PARS75_NUMERO_PROPOSTA);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ANNOPROPOSTA, IMDBDef5.FLD_PARS75_ANNO_PROPOSTA);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_BENEFICIARIO, IMDBDef5.FLD_PARS75_NOMEOGGEBENE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_QUIETANZA, IMDBDef5.FLD_PARS75_NOMEOGGEQUIE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_BOLLO, IMDBDef5.FLD_PARS75_NOMEOGGEBOLL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_UFFICIO, IMDBDef5.FLD_PARS75_UFFICIO);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_CAUSALE, IMDBDef5.FLD_PARS75_CAUSALE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_NUMEROCONTAB, IMDBDef5.FLD_PARS75_NOMOGGNUMCON);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_DATACONTABIL, IMDBDef5.FLD_PARS75_NOMOGGDATCON);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_SPESE, IMDBDef5.FLD_PARS75_NOMEOGGESPES);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_SCADENZA, IMDBDef5.FLD_PARS75_NOMEOGGESCAD);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_COMMISSIONI, IMDBDef5.FLD_PARS75_NOMEOGGECOMM);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ALLEGATI, IMDBDef5.FLD_PARS75_NOMEOGGEALLE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_INFOTESORIER, IMDBDef5.FLD_PARS75_NOMOGGINFTES);
    PAN_PARS.SetMasterTable(0, "PARS75");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_NOTEFUNZIONA_Init()
  {

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "B6500633-093D-4E5C-A7ED-8760A0E557EF");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "MODULO");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "4195BD9C-9A1C-4C61-B5A3-761F45EEE55F");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "PAGINA");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "41094843-9B67-4BEB-A88E-EFF6806177A7");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "FUNZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "EDEF982A-F53B-4CE8-8360-31D9FD084182");
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
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_MODULO, PPQRY_NOTEFUNZION3, "A.MODULO", "MODULO", 5, 20, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 4, 164, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, "PAGINA");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 4, 28, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, "PAGINA");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_PAGINA, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_PAGINA, PPQRY_NOTEFUNZION3, "A.PAGINA", "PAGINA", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 4, 200, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 4, 52, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_FUNZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_FUNZIONE, PPQRY_NOTEFUNZION3, "A.FUNZIONE", "FUNZIONE", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 104, 236, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 12, 16, 376, 432, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 33);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_DESCRIZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_DESCRIZIONE, PPQRY_NOTEFUNZION3, "A.DESCRIZIONE", "DESCRIZIONE", 9, 9999, 0, -13997);
  }

  private void PAN_NOTEFUNZIONA_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTEFUNZIONA.SetIMDB(IMDB, "PQRY_NOTEFUNZION3", true);
    PAN_NOTEFUNZIONA.set_SetString(MyGlb.MASTER_ROWNAME, "NOTE FUNZIONALITA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MODULO as MODULO, ");
    SQL.append("  A.PAGINA as PAGINA, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (A.PAGINA = " + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_MANPERVEIVIS,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.FUNZIONE = " + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_MANPERVEIVIS,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZION3, 5, SQL, -1, "");
    PAN_NOTEFUNZIONA.SetQueryDB(PPQRY_NOTEFUNZION3, MainFrm.Cf4armDBObject.DB, 4);
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
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
