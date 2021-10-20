// **********************************************
// Emiss Mandati Cassa Economale
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissMandatiCassaEconomale extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARS_LIQUIDMANDAT = 0;
  private static int GRP_PARS_ORDINATIVI = 1;
  private static int GRP_PARS_PROVVEDIMENT = 2;
  private static int GRP_PARS_MANDATINFORM = 3;
  private static int GRP_PARS_ORDINAINFORM = 4;

  private static int PFL_PARS_ETICQUESELAB = 0;
  private static int PFL_PARS_ETICHETTASF2 = 1;
  private static int PFL_PARS_ETICHETTASF3 = 2;
  private static int PFL_PARS_DATAEMISSION = 3;
  private static int PFL_PARS_ETICHETTASF = 4;
  private static int PFL_PARS_ETICHETTASF1 = 5;
  private static int PFL_PARS_SEDEDEL = 6;
  private static int PFL_PARS_NUMERODEL = 7;
  private static int PFL_PARS_ANNODEL = 8;
  private static int PFL_PARS_ETICHSCELDEL = 9;
  private static int PFL_PARS_UNITAPROPONE = 10;
  private static int PFL_PARS_NUMEROPROPOS = 11;
  private static int PFL_PARS_ANNOPROPOSTA = 12;
  private static int PFL_PARS_ETICSCELPROP = 13;
  private static int PFL_PARS_UFFICIO = 14;
  private static int PFL_PARS_CAUSALE = 15;
  private static int PFL_PARS_DESCRIZIONE = 16;
  private static int PFL_PARS_SPESE = 17;
  private static int PFL_PARS_SCADENZA = 18;
  private static int PFL_PARS_COMMISSIONI = 19;
  private static int PFL_PARS_ALLEGATI = 20;
  private static int PFL_PARS_INFOTESORIER = 21;
  private static int PFL_PARS_ETICHEELABOR = 22;
  private static int PFL_PARS_DATA = 23;
  private static int PFL_PARS_CAUSALEORD = 24;
  private static int PFL_PARS_BOLLOORD = 25;
  private static int PFL_PARS_UFFICIOORD = 26;
  private static int PFL_PARS_EMAUVPMDSASC = 27;
  private static int PFL_PARS_UNORDIPERBEN = 28;
  private static int PFL_PARS_SPESEORD = 29;
  private static int PFL_PARS_COMMISSIOORD = 30;
  private static int PFL_PARS_ALLEGATIORD = 31;
  private static int PFL_PARS_INFOTESORORD = 32;

  private static int PPQRY_PARS76 = 0;

  private static int PPQRY_T54 = 1;
  private static int PPQRY_T58 = 2;
  private static int PPQRY_TIPISPESMIN1 = 3;
  private static int PPQRY_T57 = 4;
  private static int PPQRY_T60 = 5;
  private static int PPQRY_T53 = 6;
  private static int PPQRY_TIPISPESMINF = 7;


  IDPanel PAN_PARS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS30(IMDB);
    //
    //
    Init_PQRY_PARS76(IMDB);
    Init_PQRY_PARS76_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS30(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARS30, 26);
    IMDB.set_TblCode(IMDBDef5.TBL_PARS30, "TBL_PARS30");
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGESPES, "NOMEOGGESPES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGESPES,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGECOMM, "NOMEOGGECOMM");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGECOMM,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGEALLE, "NOMEOGGEALLE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGEALLE,5,250,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMOGGINFTES, "NOMOGGINFTES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMOGGINFTES,5,250,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGESCAD, "NOMEOGGESCAD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGESCAD,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGEDATA, "NOMEOGGEDATA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGECAU1, "NOMEOGGECAU1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGECAU1,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGEBOLL, "NOMEOGGEBOLL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGEBOLL,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGEUFF1, "NOMEOGGEUFF1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGEUFF1,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOEAVPMDSASC, "NOEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOOGUNORPEBE, "NOOGUNORPEBE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOOGUNORPEBE,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGESPE1, "NOMEOGGESPE1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGESPE1,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGECOM1, "NOMEOGGECOM1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGECOM1,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGEALL1, "NOMEOGGEALL1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMEOGGEALL1,5,250,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMOGGINFTE1, "NOMOGGINFTE1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMOGGINFTE1,5,250,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMOGGTIPRIT, "NOMOGGTIPRIT");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMOGGTIPRIT,1,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMOGGDATEMI, "NOMOGGDATEMI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS30,IMDBDef5.FLD_PARS30_NOMOGGDATEMI,6,10,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARS30, 0);
  }

  private static void Init_PQRY_PARS76(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARS76, 25);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARS76, "PQRY_PARS76");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGESPES, "NOMEOGGESPES");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGESPES,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGESCAD, "NOMEOGGESCAD");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGESCAD,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGECOMM, "NOMEOGGECOMM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGECOMM,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGEALLE, "NOMEOGGEALLE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGEALLE,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMOGGINFTES, "NOMOGGINFTES");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMOGGINFTES,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGEDATA, "NOMEOGGEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGECAU1, "NOMEOGGECAU1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGECAU1,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGEBOLL, "NOMEOGGEBOLL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGEBOLL,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGEUFF1, "NOMEOGGEUFF1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGEUFF1,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOEAVPMDSASC, "NOEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOOGUNORPEBE, "NOOGUNORPEBE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOOGUNORPEBE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGESPE1, "NOMEOGGESPE1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGESPE1,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGECOM1, "NOMEOGGECOM1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGECOM1,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGEALL1, "NOMEOGGEALL1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMEOGGEALL1,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMOGGINFTE1, "NOMOGGINFTE1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMOGGINFTE1,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMOGGDATEMI, "NOMOGGDATEMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76,IMDBDef15.PQSL_PARS76_NOMOGGDATEMI,6,10,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARS76, 0);
  }

  private static void Init_PQRY_PARS76_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARS76_RS, 25);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARS76_RS, "PQRY_PARS76_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGESPES, "NOMEOGGESPES");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGESPES,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGESCAD, "NOMEOGGESCAD");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGESCAD,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGECOMM, "NOMEOGGECOMM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGECOMM,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGEALLE, "NOMEOGGEALLE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGEALLE,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMOGGINFTES, "NOMOGGINFTES");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMOGGINFTES,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGEDATA, "NOMEOGGEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGECAU1, "NOMEOGGECAU1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGECAU1,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGEBOLL, "NOMEOGGEBOLL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGEBOLL,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGEUFF1, "NOMEOGGEUFF1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGEUFF1,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOEAVPMDSASC, "NOEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOEAVPMDSASC,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOOGUNORPEBE, "NOOGUNORPEBE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOOGUNORPEBE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGESPE1, "NOMEOGGESPE1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGESPE1,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGECOM1, "NOMEOGGECOM1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGECOM1,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGEALL1, "NOMEOGGEALL1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMEOGGEALL1,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMOGGINFTE1, "NOMOGGINFTE1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMOGGINFTE1,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMOGGDATEMI, "NOMOGGDATEMI");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARS76_RS,IMDBDef15.PQSL_PARS76_NOMOGGDATEMI,6,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissMandatiCassaEconomale(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissMandatiCassaEconomale()
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
    FormIdx = MyGlb.FRM_EMIMANCASECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "44096464-269E-43B9-AB9B-80698C264815";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 700;
    DesignHeight = 782;
    set_Caption(new IDVariant("Emiss. Mandati Cassa Economale"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 700;
    Frames[1].Height = 756;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Pars";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 756;
    PAN_PARS = new IDPanel(w, this, 1, "PAN_PARS");
    Frames[1].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 700-MyGlb.PAN_OFFS_X, 756-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E476239D-23C1-4245-99F1-73DC454136F9");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3964, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 1;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARS30, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMIMANCASECO_PARS76();
      }
      PAN_PARS.UpdatePanel(MainFrm);
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
    return (obj instanceof EmissMandatiCassaEconomale);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissMandatiCassaEconomale.class.getName() : (Glb.ClassWithPackage(EmissMandatiCassaEconomale.class) ? EmissMandatiCassaEconomale.class.getName().substring(EmissMandatiCassaEconomale.class.getPackage().getName().length() + 1) : EmissMandatiCassaEconomale.class.getName()));
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
        IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_SEDE_DEL, 0)));
        v_SEDEDEL = IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_SEDE_DEL, 0);
        v_ANNODEL = IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_ANNO_DEL, 0);
        v_NUMERODEL = IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NUMERO_DEL, 0);
        MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_SEDE_DEL, 0, new IDVariant(v_SEDEDEL));
        IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NUMERO_DEL, 0, new IDVariant(v_NUMERODEL));
        IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_ANNO_DEL, 0, new IDVariant(v_ANNODEL));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_SEDE_DEL, 0))))
        {
          IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_SEDE_DEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARS_UNITAPROPONE)), true) || Column.equals((new IDVariant(PFL_PARS_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_PARS_ANNOPROPOSTA)), true))
      {
        IDVariant v_UNITAPROP = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNOPROP = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMEROPROP = new IDVariant(0,IDVariant.INTEGER);
        v_UNITAPROP = IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_UNITA_PROPONENTE, 0);
        v_ANNOPROP = IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_ANNO_PROPOSTA, 0);
        v_NUMEROPROP = IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NUMERO_PROPOSTA, 0);
        MainFrm.ControlloProposte(v_UNITAPROP, v_ANNOPROP, v_NUMEROPROP);
        IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_UNITA_PROPONENTE, 0, new IDVariant(v_UNITAPROP));
        IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NUMERO_PROPOSTA, 0, new IDVariant(v_NUMEROPROP));
        IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_ANNO_PROPOSTA, 0, new IDVariant(v_ANNOPROP));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_UNITA_PROPONENTE, 0))))
        {
          IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_UNITA_PROPONENTE, 0, IDL.Upper(IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_UNITA_PROPONENTE, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissMandatiCassaEconomale", "ParsOnUpdatingRow", _e);
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
      IDVariant v_MANDDA = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_ORDDA = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_MANDA = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_ORDA = new IDVariant(0,IDVariant.INTEGER);
      v_MANDDA = (new IDVariant());
      v_MANDA = (new IDVariant());
      v_ORDDA = (new IDVariant());
      v_ORDA = (new IDVariant());
      IDVariant v_VARACC = new IDVariant(0,IDVariant.STRING);
      IDVariant v_STATOSIOPMAN = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_STATOSIOEORD = new IDVariant(0,IDVariant.INTEGER);
      v_STATOSIOPMAN = (new IDVariant());
      v_STATOSIOEORD = (new IDVariant());
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGEDESC, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Descrizione obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGEDATA, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Data Obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      else
      {
        if (IDL.Year(IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGEDATA, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Data non appartenente all'esercizio del contesto"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.EMISSMANFATSPCG4(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_SEDE_DEL, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NUMERO_DEL, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_ANNO_DEL, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_UNITA_PROPONENTE, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NUMERO_PROPOSTA, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_ANNO_PROPOSTA, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGEDESC, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_UFFICIO, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_CAUSALE, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGECOMM, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMOGGINFTES, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGESPES, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGESCAD, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGEALLE, 0), v_MANDDA, v_MANDA, IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGEDATA, 0)), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGECAU1, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGEBOLL, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGEUFF1, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOEAVPMDSASC, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOOGUNORPEBE, 0), v_ORDDA, v_ORDA, v_VARACC, IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGECOM1, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMOGGINFTE1, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGESPE1, 0), IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMEOGGEALL1, 0), v_STATOSIOPMAN, v_STATOSIOEORD, IMDB.Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NOMOGGDATEMI, 0));
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
        v_MESSAGGIO = (new IDVariant("Elaborazione Eseguita <BR/>"));
        IDVariant v_STATSIOPMANS = new IDVariant(0,IDVariant.STRING);
        if (v_STATOSIOPMAN.equals((new IDVariant(1)), true))
        {
          IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
          v_STR = (new IDVariant("Attenzione: sono stati emessi mandati senza Codice Gestionale", IDVariant.STRING));
          v_STATSIOPMANS = new IDVariant(v_STR);
        }
        else
        {
          v_STATSIOPMANS = (new IDVariant(""));
        }
        if (v_MANDDA.compareTo(v_MANDA, true)<=0)
        {
          IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
          v_STR = (new IDVariant("Emessi mandati da ", IDVariant.STRING));
          v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, v_STR), IDL.ToString(v_MANDDA)), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), IDL.ToString(v_MANDA));
        }
        else
        {
          IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
          v_STR = (new IDVariant("Non sono stati emessi Mandati", IDVariant.STRING));
          v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, v_STR), (new IDVariant("<BR/\">"))), v_STATSIOPMANS);
        }
        IDVariant v_STATSIOPORDS = new IDVariant(0,IDVariant.STRING);
        if (v_STATOSIOEORD.equals((new IDVariant(1)), true))
        {
          IDVariant v_STRCGU = new IDVariant(0,IDVariant.STRING);
          v_STRCGU = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Gestionale", IDVariant.STRING));
          IDVariant v_STRLIV5 = new IDVariant(0,IDVariant.STRING);
          v_STRLIV5 = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Livello 5"));
          if (MainFrm.SIOPEATTIARM.booleanValue())
          {
            v_STATSIOPORDS = new IDVariant(v_STRLIV5);
          }
          else
          {
            v_STATSIOPORDS = new IDVariant(v_STRCGU);
          }
        }
        else
        {
          v_STATSIOPORDS = (new IDVariant(""));
        }
        if (v_ORDDA.compareTo(v_ORDA, true)<=0)
        {
          IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
          v_STR = (new IDVariant("Emessi ordinativi da ", IDVariant.STRING));
          v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("<BR/>"))), v_STR), IDL.ToString(v_ORDDA)), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), IDL.ToString(v_ORDA)), (new IDVariant("<BR/\">"))), v_STATSIOPORDS);
        }
        else
        {
          IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
          v_STR = (new IDVariant("Non sono stati emessi Ordinativi "));
          v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("<BR/>"))), v_STR);
        }
        if (IDL.NullValue(v_VARACC,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
        {
          IDVariant v_STR = new IDVariant(0,IDVariant.STRING);
          v_STR = (new IDVariant("Emesse Variazioni agli Accertamenti: "));
          v_STR = IDL.Add(v_STR, v_VARACC);
          v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, (new IDVariant("<BR/>"))), v_STR);
        }
        MainFrm.set_AlertMessage(v_MESSAGGIO); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissMandatiCassaEconomale", "EtichettaElabora", _e);
      return -1;
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
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOEAVPMDSASC, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOOGUNORPEBE, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_UFFICIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGEUFF1, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGEDATA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMOGGDATEMI, 0, IDL.Today());
      if (MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
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
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_SPESEORD, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          if (v_LICENZAMIF1.booleanValue() && MainFrm.GESTIONSPESE.equals((new IDVariant("SI")), true))
          {
            PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_SPESEORD, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_SPESEORD, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          if (v_LICENZAMIF1.booleanValue() && MainFrm.GESTIOALLEGA.equals((new IDVariant("SI")), true))
          {
            PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
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
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (v_LICENZAMIF1.booleanValue() && MainFrm.GESTINFOTESO.equals((new IDVariant("SI")), true))
        {
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_INFOTESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_INFOTESORORD, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_INFOTESORORD, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (!(v_LICENZAMIF1.booleanValue()) && MainFrm.LIQMO.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_PARS.SetFlags (Glb.OBJ_GROUP, GRP_PARS_MANDATINFORM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_GROUP, GRP_PARS_ORDINAINFORM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        }
      }
      IDVariant v_VMIN = new IDVariant(0,IDVariant.INTEGER);
      v_VMIN = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.CODICE) as MINTIPSPMICO ");
      SQL.append("from ");
      SQL.append("  TIPI_SPESA_MINF A ");
      SQL.append("where (A.DEFAULT_S = 'SI') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VMIN = QV.Get("MINTIPSPMICO", IDVariant.INTEGER) ;
      }
      QV.Close();
      IDVariant v_VMIN2 = new IDVariant(0,IDVariant.INTEGER);
      v_VMIN2 = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.CODICE) as MINTIPSPMICO ");
      SQL.append("from ");
      SQL.append("  TIPI_SPESA_MINF A ");
      SQL.append("where (A.DEFAULT_E = 'SI') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VMIN2 = QV.Get("MINTIPSPMICO", IDVariant.INTEGER) ;
      }
      QV.Close();
      if ((PAN_PARS.bFields(PFL_PARS_SPESE).IsVisible(PAN_PARS.AttR) && PAN_PARS.bFields(PFL_PARS_SPESE).IsPresent()))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGESPES, 0, new IDVariant(v_VMIN));
      }
      if ((PAN_PARS.bFields(PFL_PARS_SPESEORD).IsVisible(PAN_PARS.AttR) && PAN_PARS.bFields(PFL_PARS_SPESEORD).IsPresent()))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGESPE1, 0, new IDVariant(v_VMIN2));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissMandatiCassaEconomale", "Load", _e);
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
      ((ElencoEmissMandatiCassaEconomale)MainFrm.GetForm(MyGlb.FRM_ELEEMIMACAEC,0)).PAN_ELENFATDALIQ.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissMandatiCassaEconomale", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_SEDE_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NUMERO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_ANNO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_UNITA_PROPONENTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NUMERO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_ANNO_PROPOSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_UFFICIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_CAUSALE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGEDESC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGESPES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGECOMM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGEALLE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMOGGINFTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGESCAD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGEDATA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGECAU1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGEBOLL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGEUFF1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOEAVPMDSASC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOOGUNORPEBE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGESPE1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGECOM1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGEALL1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMOGGINFTE1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMOGGTIPRIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMOGGDATEMI, 0, new IDVariant());
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
          IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
          IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
          IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
        }
        else
        {
          // IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_SEDE_DEL, 0, (new IDVariant()));
          // IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NUMERO_DEL, 0, (new IDVariant()));
          // IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_ANNO_DEL, 0, (new IDVariant()));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
          IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
          IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        }
        else
        {
          // IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_UNITA_PROPONENTE, 0, (new IDVariant()));
          // IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_NUMERO_PROPOSTA, 0, (new IDVariant()));
          // IMDB.set_Value(IMDBDef15.PQRY_PARS76, IMDBDef15.PQSL_PARS76_ANNO_PROPOSTA, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissMandatiCassaEconomale", "EndModal", _e);
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
      MainFrm.ErrObj.ProcError ("EmissMandatiCassaEconomale", "EtichettaSceltaDel", _e);
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
      MainFrm.ErrObj.ProcError ("EmissMandatiCassaEconomale", "SceltaProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void EMIMANCASECO_PARS76() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARS76_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARS30, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARS30, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARS76_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARS76_RS, 0, IMDBDef5.TBL_PARS30, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 0, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 1, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 2, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_ANNO_DEL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 3, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_UNITA_PROPONENTE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 4, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NUMERO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 5, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_ANNO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 6, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_UFFICIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 7, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_CAUSALE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 8, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGESPES, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 9, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGESCAD, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 10, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGECOMM, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 11, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGEALLE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 12, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMOGGINFTES, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 13, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGEDESC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 14, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGEDATA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 15, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGECAU1, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 16, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGEBOLL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 17, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGEUFF1, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 18, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOEAVPMDSASC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 19, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOOGUNORPEBE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 20, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGESPE1, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 21, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGECOM1, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 22, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMEOGGEALL1, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 23, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMOGGINFTE1, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARS76_RS, 24, 0, IMDBDef5.TBL_PARS30, IMDBDef5.FLD_PARS30_NOMOGGDATEMI, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARS30, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARS30, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARS30, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARS76_RS, 0);
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 5);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARS_LIQUIDMANDAT, "11218C51-7322-44F8-AC95-C9D8F5AD0652");
    PAN_PARS.set_Header(MyGlb.OBJ_GROUP, GRP_PARS_LIQUIDMANDAT, "Liquidazioni/Mandati");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARS_LIQUIDMANDAT, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARS_LIQUIDMANDAT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_LIQUIDMANDAT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_LIQUIDMANDAT, MyGlb.PANEL_FORM, 12, 43, 672, 321, 0, 0);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_LIQUIDMANDAT, 0, 118);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_LIQUIDMANDAT, 1, 13);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_LIQUIDMANDAT, 0, 4);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_LIQUIDMANDAT, 1, 4);
    PAN_PARS.SetFlags(MyGlb.OBJ_GROUP, GRP_PARS_LIQUIDMANDAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARS_ORDINATIVI, "C5B18D07-1742-4D2D-BED6-6AA9818D7CA2");
    PAN_PARS.set_Header(MyGlb.OBJ_GROUP, GRP_PARS_ORDINATIVI, "Ordinativi");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARS_ORDINATIVI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARS_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_ORDINATIVI, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_ORDINATIVI, MyGlb.PANEL_FORM, 12, 371, 672, 333, 0, 0);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_ORDINATIVI, 0, 55);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_ORDINATIVI, 1, 13);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_ORDINATIVI, 0, 4);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_ORDINATIVI, 1, 4);
    PAN_PARS.SetFlags(MyGlb.OBJ_GROUP, GRP_PARS_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, "27986D46-BAC9-457E-8785-8F4D4902B927");
    PAN_PARS.set_Header(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, "Provvedimento");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 108, 16, 0, 0);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, MyGlb.PANEL_FORM, 116, 67, 548, 49, 0, 0);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, 0, 87);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, 1, 13);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, 0, 4);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, 1, 4);
    PAN_PARS.SetFlags(MyGlb.OBJ_GROUP, GRP_PARS_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, "BDF0B4E6-A9CB-4DD0-9650-AE91E4EF0C71");
    PAN_PARS.set_Header(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, "Mandato Informatico");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, MyGlb.VIS_GROUPSTYLE);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, MyGlb.PANEL_LIST, 0, -9999, 420, 16, 0, 0);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, MyGlb.PANEL_FORM, 116, 187, 548, 121, 0, 0);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, 0, 120);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, 1, 13);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, 0, 4);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, 1, 4);
    PAN_PARS.SetFlags(MyGlb.OBJ_GROUP, GRP_PARS_MANDATINFORM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARS_ORDINAINFORM, "40154E9D-83D7-4C6B-9DE1-9541395C085E");
    PAN_PARS.set_Header(MyGlb.OBJ_GROUP, GRP_PARS_ORDINAINFORM, "Ordinativo Informatico");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARS_ORDINAINFORM, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARS_ORDINAINFORM, MyGlb.VIS_GROUPSTYLE);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_ORDINAINFORM, MyGlb.PANEL_LIST, 0, -9999, 420, 16, 0, 0);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_ORDINAINFORM, MyGlb.PANEL_FORM, 112, 555, 552, 123, 0, 0);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_ORDINAINFORM, 0, 129);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_ORDINAINFORM, 1, 13);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_ORDINAINFORM, 0, 4);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_ORDINAINFORM, 1, 4);
    PAN_PARS.SetFlags(MyGlb.OBJ_GROUP, GRP_PARS_ORDINAINFORM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 33);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICQUESELAB, "131FE151-0612-4155-96B1-38BCEB0FB293");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICQUESELAB, "Questa elaborazione genera le liquidazioni e i mandati a chiusura della fattura e gli ordinativi collegati ai mandati");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICQUESELAB, MyGlb.VIS_ETICHEGRASSE);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICQUESELAB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, "51BFACB4-F797-48F6-8E2F-A0DBB967B1AC");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF3, "1E452AD0-7CC3-46BF-A637-C40247499286");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF3, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF3, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DATAEMISSION, "675C1428-1482-4DBA-B23C-B6066E731CBE");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DATAEMISSION, "Data Emissione");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DATAEMISSION, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DATAEMISSION, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DATAEMISSION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, "BA9310DC-CCEB-43CA-8742-BF4CD70E0F9D");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, "51CFA858-B011-498F-B063-C49E9721A8E3");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, "63FCC782-DE64-4CA9-B09E-4A57EAA3ED1B");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, "Delibera");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "9FE4E12A-8D82-4C59-B817-25B8AE9E1B02");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "-");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "664E38CD-A313-4FE2-8E6F-6C9AA77776D9");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "/");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, "59FA32C9-F376-4858-ABD8-4CCC77FAD46D");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, 0, "wsearch1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, "5CC84F98-7208-4648-9ADE-E08D06A8C462");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, "Proposta");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, "9E857DDA-8767-44A1-BBEC-E06309803554");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, "-");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, "E4BD9BD1-578A-4F8B-AC3C-0D53F10EB660");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, "/");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, "B4CFE088-391E-4969-87F0-98708AA487F2");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, 0, "wsearch1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, "4593E8C9-1A11-4901-901A-C15995179E02");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, "Ufficio");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, "52E41D1A-6C88-42C5-8509-1E2D78B8112A");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, "Causale");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DESCRIZIONE, "7812F23E-CD39-4D00-A8B3-5A076A0DAD11");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DESCRIZIONE, "Descrizione");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DESCRIZIONE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DESCRIZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, "3E6CD522-2046-4E19-AD02-71159884E21D");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, "Spese");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, "112D2513-B936-451F-B889-7D38FB9B7235");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, "Scadenza");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, "39066221-9695-4167-899E-1EE48F9CC158");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, "Commissioni");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, "07787165-C2F2-43DE-AC77-1B192A9B30BC");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, "Allegati");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, "4B1695FF-99AE-49F8-8E4C-1748CACCE544");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, "Info Tesoriere");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "A5075F9C-8B80-4E9A-9FC4-645BE85AB145");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "Elabora");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DATA, "51DEEA5E-AF56-4E7F-BF5D-7A2C22ABBAEF");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DATA, "Data");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DATA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DATA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALEORD, "96D74532-E3E5-4EEA-9839-C9A94CC47398");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALEORD, "Causale");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALEORD, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALEORD, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALEORD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_BOLLOORD, "486ABA2D-71CC-4692-BC80-DCA0A0E5EFE8");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_BOLLOORD, "Bollo");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_BOLLOORD, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_BOLLOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_BOLLOORD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIOORD, "971FBD3A-CFC8-4571-8F00-195CC40C5445");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIOORD, "Ufficio");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIOORD, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIOORD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_EMAUVPMDSASC, "4880C824-483A-4CD3-805A-56BC16DBF441");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_EMAUVPMDSASC, "Emissione Automatica Variazioni Per Mancata Disponibilità Su Accertamento Solo Competenze");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_EMAUVPMDSASC, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_EMAUVPMDSASC, MyGlb.VIS_CHECKSTYLE);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_EMAUVPMDSASC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_UNORDIPERBEN, "82F0CFE4-F3C5-4E17-921A-49BF798545E5");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_UNORDIPERBEN, "Un Ordinativo Per Beneficiario");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_UNORDIPERBEN, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_UNORDIPERBEN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_UNORDIPERBEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_SPESEORD, "3D90E5AB-59CA-4F97-A5B6-1EC22FDA0003");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_SPESEORD, "Spese");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_SPESEORD, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_SPESEORD, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_SPESEORD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, "490CE028-607C-4909-B772-8EFF6D2FB2B4");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, "Commissioni");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, "321D824B-CC2A-416C-8DB1-B93FD2031DF9");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, "Allegati");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORORD, "29FC350C-B47A-490C-960A-BB02D87C4254");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORORD, "Info Tesoriere");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORORD, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORORD, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORORD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICQUESELAB, MyGlb.PANEL_LIST, 28, 12, 656, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICQUESELAB, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICQUESELAB, MyGlb.PANEL_LIST, 3);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICQUESELAB, MyGlb.PANEL_FORM, 12, 8, 672, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICQUESELAB, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICQUESELAB, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICQUESELAB, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICQUESELAB, -1, "", "ETICQUESELAB", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, MyGlb.PANEL_LIST, 56, 60, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, MyGlb.PANEL_FORM, 16, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF2, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHETTASF2, -1, GRP_PARS_LIQUIDMANDAT);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHETTASF2, -1, "", "ETICHETTASF2", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF3, MyGlb.PANEL_LIST, 64, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF3, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF3, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF3, MyGlb.PANEL_FORM, 664, 344, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF3, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF3, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHETTASF3, -1, GRP_PARS_LIQUIDMANDAT);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHETTASF3, -1, "", "ETICHETTASF3", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DATAEMISSION, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DATAEMISSION, MyGlb.PANEL_LIST, 96);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DATAEMISSION, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DATAEMISSION, MyGlb.PANEL_LIST, "Data Emissione");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DATAEMISSION, MyGlb.PANEL_FORM, 16, 320, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DATAEMISSION, MyGlb.PANEL_FORM, 96);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DATAEMISSION, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DATAEMISSION, MyGlb.PANEL_FORM, "Data Emissione");
    PAN_PARS.SetFieldPage(PFL_PARS_DATAEMISSION, -1, GRP_PARS_LIQUIDMANDAT);
    PAN_PARS.SetFieldPanel(PFL_PARS_DATAEMISSION, PPQRY_PARS76, "A.NOMOGGDATEMI", "NOMOGGDATEMI", 6, 10, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, MyGlb.PANEL_LIST, 56, 60, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, MyGlb.PANEL_FORM, 16, 396, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHETTASF, -1, GRP_PARS_ORDINATIVI);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHETTASF, -1, "", "ETICHETTASF", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, MyGlb.PANEL_LIST, 64, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, MyGlb.PANEL_FORM, 664, 684, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASF1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHETTASF1, -1, GRP_PARS_ORDINATIVI);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHETTASF1, -1, "", "ETICHETTASF1", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_LIST, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_LIST, "Delibera");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_FORM, 120, 92, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_FORM, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SEDEDEL, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARS.SetFieldPage(PFL_PARS_SEDEDEL, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_SEDEDEL, PPQRY_PARS76, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, "-");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 244, 92, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, "-");
    PAN_PARS.SetFieldPage(PFL_PARS_NUMERODEL, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_NUMERODEL, PPQRY_PARS76, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, "/");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 308, 92, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, "/");
    PAN_PARS.SetFieldPage(PFL_PARS_ANNODEL, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_ANNODEL, PPQRY_PARS76, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 252, 100, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 368, 96, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHSCELDEL, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHSCELDEL, -1, "", "ETICHSCELDEL", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_LIST, 108);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_LIST, "Proposta");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_FORM, 388, 92, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_FORM, 68);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UNITAPROPONE, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARS.SetFieldPage(PFL_PARS_UNITAPROPONE, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_UNITAPROPONE, PPQRY_PARS76, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_LIST, "-");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_FORM, 520, 92, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMEROPROPOS, MyGlb.PANEL_FORM, "-");
    PAN_PARS.SetFieldPage(PFL_PARS_NUMEROPROPOS, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_NUMEROPROPOS, PPQRY_PARS76, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_LIST, 92);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_LIST, "/");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_FORM, 584, 92, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNOPROPOSTA, MyGlb.PANEL_FORM, "/");
    PAN_PARS.SetFieldPage(PFL_PARS_ANNOPROPOSTA, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_ANNOPROPOSTA, PPQRY_PARS76, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, MyGlb.PANEL_LIST, 260, 108, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, MyGlb.PANEL_FORM, 644, 96, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICSCELPROP, -1, GRP_PARS_PROVVEDIMENT);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICSCELPROP, -1, "", "ETICSCELPROP", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_LIST, 44);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_FORM, 68, 124, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_FORM, 44);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARS.SetFieldPage(PFL_PARS_UFFICIO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_UFFICIO, PPQRY_PARS76, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_LIST, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_LIST, "Causale");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_FORM, 372, 124, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_FORM, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_PARS.SetFieldPage(PFL_PARS_CAUSALE, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_CAUSALE, PPQRY_PARS76, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DESCRIZIONE, MyGlb.PANEL_FORM, 36, 148, 628, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARS.SetFieldPage(PFL_PARS_DESCRIZIONE, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_DESCRIZIONE, PPQRY_PARS76, "A.NOMEOGGEDESC", "NOMEOGGEDESC", 5, 140, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_LIST, 44);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_FORM, 164, 212, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_FORM, 44);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_PARS.SetFieldPage(PFL_PARS_SPESE, -1, GRP_PARS_MANDATINFORM);
    PAN_PARS.SetFieldPanel(PFL_PARS_SPESE, PPQRY_PARS76, "A.NOMEOGGESPES", "NOMEOGGESPES", 1, 1, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_LIST, 64);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_FORM, 144, 236, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_FORM, 64);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_PARS.SetFieldPage(PFL_PARS_SCADENZA, -1, GRP_PARS_MANDATINFORM);
    PAN_PARS.SetFieldPanel(PFL_PARS_SCADENZA, PPQRY_PARS76, "A.NOMEOGGESCAD", "NOMEOGGESCAD", 6, 19, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_LIST, 80);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_LIST, "Commissioni");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_FORM, 476, 236, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_FORM, 80);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_PARS.SetFieldPage(PFL_PARS_COMMISSIONI, -1, GRP_PARS_MANDATINFORM);
    PAN_PARS.SetFieldPanel(PFL_PARS_COMMISSIONI, PPQRY_PARS76, "A.NOMEOGGECOMM", "NOMEOGGECOMM", 1, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_COMMISSIONI, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_LIST, 0, 36, 420, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_LIST, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_LIST, 2);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_FORM, 156, 260, 504, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_FORM, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_PARS.SetFieldPage(PFL_PARS_ALLEGATI, -1, GRP_PARS_MANDATINFORM);
    PAN_PARS.SetFieldPanel(PFL_PARS_ALLEGATI, PPQRY_PARS76, "A.NOMEOGGEALLE", "NOMEOGGEALLE", 5, 250, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_LIST, 0, 36, 420, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_LIST, 88);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_LIST, 2);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_FORM, 120, 284, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_FORM, 88);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_PARS.SetFieldPage(PFL_PARS_INFOTESORIER, -1, GRP_PARS_MANDATINFORM);
    PAN_PARS.SetFieldPanel(PFL_PARS_INFOTESORIER, PPQRY_PARS76, "A.NOMOGGINFTES", "NOMOGGINFTES", 5, 250, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 160, 88, 116, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 592, 716, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHEELABOR, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DATA, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DATA, MyGlb.PANEL_LIST, 36);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DATA, MyGlb.PANEL_FORM, 172, 392, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DATA, MyGlb.PANEL_FORM, 36);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_PARS.SetFieldPage(PFL_PARS_DATA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_DATA, PPQRY_PARS76, "A.NOMEOGGEDATA", "NOMEOGGEDATA", 6, 14, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALEORD, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALEORD, MyGlb.PANEL_LIST, 64);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALEORD, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALEORD, MyGlb.PANEL_LIST, "Causale");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALEORD, MyGlb.PANEL_FORM, 144, 416, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALEORD, MyGlb.PANEL_FORM, 64);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALEORD, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CAUSALEORD, MyGlb.PANEL_FORM, "Causale");
    PAN_PARS.SetFieldPage(PFL_PARS_CAUSALEORD, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_CAUSALEORD, PPQRY_PARS76, "A.NOMEOGGECAU1", "NOMEOGGECAU1", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_BOLLOORD, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_BOLLOORD, MyGlb.PANEL_LIST, 36);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_BOLLOORD, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_BOLLOORD, MyGlb.PANEL_LIST, "Bollo");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_BOLLOORD, MyGlb.PANEL_FORM, 172, 440, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_BOLLOORD, MyGlb.PANEL_FORM, 36);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_BOLLOORD, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_BOLLOORD, MyGlb.PANEL_FORM, "Bollo");
    PAN_PARS.SetFieldPage(PFL_PARS_BOLLOORD, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_BOLLOORD, PPQRY_PARS76, "A.NOMEOGGEBOLL", "NOMEOGGEBOLL", 1, 2, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIOORD, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIOORD, MyGlb.PANEL_LIST, 56);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIOORD, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIOORD, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIOORD, MyGlb.PANEL_FORM, 152, 464, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIOORD, MyGlb.PANEL_FORM, 56);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIOORD, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UFFICIOORD, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARS.SetFieldPage(PFL_PARS_UFFICIOORD, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_UFFICIOORD, PPQRY_PARS76, "A.NOMEOGGEUFF1", "NOMEOGGEUFF1", 1, 2, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_EMAUVPMDSASC, MyGlb.PANEL_LIST, 0, 36, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_EMAUVPMDSASC, MyGlb.PANEL_LIST, 540);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_EMAUVPMDSASC, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_EMAUVPMDSASC, MyGlb.PANEL_LIST, "Emissione Automatica Variazioni Per Mancata Disponibilità Su Accertamento Solo Competenze");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_EMAUVPMDSASC, MyGlb.PANEL_FORM, 132, 492, 320, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_EMAUVPMDSASC, MyGlb.PANEL_FORM, 296);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_EMAUVPMDSASC, MyGlb.PANEL_FORM, 2);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_EMAUVPMDSASC, MyGlb.PANEL_FORM, "Emissione Automatica Variazioni Per Mancata Disponibilità Su Accertamento Solo Competenze");
    PAN_PARS.SetFieldPage(PFL_PARS_EMAUVPMDSASC, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_EMAUVPMDSASC, PPQRY_PARS76, "A.NOEAVPMDSASC", "NOEAVPMDSASC", 1, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_EMAUVPMDSASC, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_EMAUVPMDSASC, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UNORDIPERBEN, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UNORDIPERBEN, MyGlb.PANEL_LIST, 176);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UNORDIPERBEN, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UNORDIPERBEN, MyGlb.PANEL_LIST, "Un Ordinativo Per Beneficiario");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UNORDIPERBEN, MyGlb.PANEL_FORM, 252, 532, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UNORDIPERBEN, MyGlb.PANEL_FORM, 176);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UNORDIPERBEN, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UNORDIPERBEN, MyGlb.PANEL_FORM, "Un Ordinativo Per Beneficiario");
    PAN_PARS.SetFieldPage(PFL_PARS_UNORDIPERBEN, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_UNORDIPERBEN, PPQRY_PARS76, "A.NOOGUNORPEBE", "NOOGUNORPEBE", 1, 2, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_UNORDIPERBEN, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_UNORDIPERBEN, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SPESEORD, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SPESEORD, MyGlb.PANEL_LIST, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SPESEORD, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SPESEORD, MyGlb.PANEL_LIST, "Spese");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SPESEORD, MyGlb.PANEL_FORM, 156, 580, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SPESEORD, MyGlb.PANEL_FORM, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SPESEORD, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SPESEORD, MyGlb.PANEL_FORM, "Spese");
    PAN_PARS.SetFieldPage(PFL_PARS_SPESEORD, -1, GRP_PARS_ORDINAINFORM);
    PAN_PARS.SetFieldPanel(PFL_PARS_SPESEORD, PPQRY_PARS76, "A.NOMEOGGESPE1", "NOMEOGGESPE1", 1, 1, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, MyGlb.PANEL_LIST, 92);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, MyGlb.PANEL_LIST, "Commissioni");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, MyGlb.PANEL_FORM, 116, 604, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, MyGlb.PANEL_FORM, 92);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_COMMISSIOORD, MyGlb.PANEL_FORM, "Commissioni");
    PAN_PARS.SetFieldPage(PFL_PARS_COMMISSIOORD, -1, GRP_PARS_ORDINAINFORM);
    PAN_PARS.SetFieldPanel(PFL_PARS_COMMISSIOORD, PPQRY_PARS76, "A.NOMEOGGECOM1", "NOMEOGGECOM1", 1, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_COMMISSIOORD, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_COMMISSIOORD, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_COMMISSIOORD, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_COMMISSIOORD, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, MyGlb.PANEL_LIST, 0, 36, 420, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, MyGlb.PANEL_LIST, 64);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, MyGlb.PANEL_LIST, 2);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, MyGlb.PANEL_LIST, "Allegati");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, MyGlb.PANEL_FORM, 144, 628, 516, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, MyGlb.PANEL_FORM, 64);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ALLEGATIORD, MyGlb.PANEL_FORM, "Allegati");
    PAN_PARS.SetFieldPage(PFL_PARS_ALLEGATIORD, -1, GRP_PARS_ORDINAINFORM);
    PAN_PARS.SetFieldPanel(PFL_PARS_ALLEGATIORD, PPQRY_PARS76, "A.NOMEOGGEALL1", "NOMEOGGEALL1", 5, 250, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORORD, MyGlb.PANEL_LIST, 0, 36, 420, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORORD, MyGlb.PANEL_LIST, 100);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORORD, MyGlb.PANEL_LIST, 2);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORORD, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORORD, MyGlb.PANEL_FORM, 116, 654, 544, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORORD, MyGlb.PANEL_FORM, 92);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORORD, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_INFOTESORORD, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_PARS.SetFieldPage(PFL_PARS_INFOTESORORD, -1, GRP_PARS_ORDINAINFORM);
    PAN_PARS.SetFieldPanel(PFL_PARS_INFOTESORORD, PPQRY_PARS76, "A.NOMOGGINFTE1", "NOMOGGINFTE1", 5, 250, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 8);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~UFFICIO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_T54, 0, SQL, PFL_PARS_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_T54, 1, SQL, PFL_PARS_UFFICIO, "");
    PAN_PARS.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
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
    PAN_PARS.SetQuery(PPQRY_TIPISPESMIN1, 0, SQL, PFL_PARS_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by 2 ");
    PAN_PARS.SetQuery(PPQRY_TIPISPESMIN1, 1, SQL, PFL_PARS_SPESE, "");
    PAN_PARS.SetQueryDB(PPQRY_TIPISPESMIN1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T57T58CODICE, ");
    SQL.append("  A.DESCRIZIONE as T57T58DESCRI ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGECAU1~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE, ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PARS.SetQuery(PPQRY_T57, 0, SQL, PFL_PARS_CAUSALEORD, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T57T58CODICE, ");
    SQL.append("  A.DESCRIZIONE as T57T58DESCRI ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE, ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_PARS.SetQuery(PPQRY_T57, 1, SQL, PFL_PARS_CAUSALEORD, "");
    PAN_PARS.SetQueryDB(PPQRY_T57, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGEBOLL~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_T60, 0, SQL, PFL_PARS_BOLLOORD, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_T60, 1, SQL, PFL_PARS_BOLLOORD, "");
    PAN_PARS.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGEUFF1~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_T53, 0, SQL, PFL_PARS_UFFICIOORD, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_T53, 1, SQL, PFL_PARS_UFFICIOORD, "");
    PAN_PARS.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGESPE1~~) ");
    PAN_PARS.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_PARS_SPESEORD, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    PAN_PARS.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_PARS_SPESEORD, "");
    PAN_PARS.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS76", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS76, IMDBDef15.PQRY_PARS76_RS, IMDBDef5.TBL_PARS30);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_DATAEMISSION, IMDBDef5.FLD_PARS30_NOMOGGDATEMI);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_SEDEDEL, IMDBDef5.FLD_PARS30_SEDE_DEL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_NUMERODEL, IMDBDef5.FLD_PARS30_NUMERO_DEL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ANNODEL, IMDBDef5.FLD_PARS30_ANNO_DEL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_UNITAPROPONE, IMDBDef5.FLD_PARS30_UNITA_PROPONENTE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_NUMEROPROPOS, IMDBDef5.FLD_PARS30_NUMERO_PROPOSTA);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ANNOPROPOSTA, IMDBDef5.FLD_PARS30_ANNO_PROPOSTA);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_UFFICIO, IMDBDef5.FLD_PARS30_UFFICIO);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_CAUSALE, IMDBDef5.FLD_PARS30_CAUSALE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_DESCRIZIONE, IMDBDef5.FLD_PARS30_NOMEOGGEDESC);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_SPESE, IMDBDef5.FLD_PARS30_NOMEOGGESPES);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_SCADENZA, IMDBDef5.FLD_PARS30_NOMEOGGESCAD);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_COMMISSIONI, IMDBDef5.FLD_PARS30_NOMEOGGECOMM);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ALLEGATI, IMDBDef5.FLD_PARS30_NOMEOGGEALLE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_INFOTESORIER, IMDBDef5.FLD_PARS30_NOMOGGINFTES);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_DATA, IMDBDef5.FLD_PARS30_NOMEOGGEDATA);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_CAUSALEORD, IMDBDef5.FLD_PARS30_NOMEOGGECAU1);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_BOLLOORD, IMDBDef5.FLD_PARS30_NOMEOGGEBOLL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_UFFICIOORD, IMDBDef5.FLD_PARS30_NOMEOGGEUFF1);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_EMAUVPMDSASC, IMDBDef5.FLD_PARS30_NOEAVPMDSASC);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_UNORDIPERBEN, IMDBDef5.FLD_PARS30_NOOGUNORPEBE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_SPESEORD, IMDBDef5.FLD_PARS30_NOMEOGGESPE1);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_COMMISSIOORD, IMDBDef5.FLD_PARS30_NOMEOGGECOM1);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ALLEGATIORD, IMDBDef5.FLD_PARS30_NOMEOGGEALL1);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_INFOTESORORD, IMDBDef5.FLD_PARS30_NOMOGGINFTE1);
    PAN_PARS.SetMasterTable(0, "PARS30");
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

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
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
