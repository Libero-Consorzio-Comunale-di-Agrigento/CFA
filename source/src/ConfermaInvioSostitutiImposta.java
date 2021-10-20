// **********************************************
// Conferma Invio Sostituti Imposta
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ConfermaInvioSostitutiImposta extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMESTAMPA_FIRMARIGA1 = 0;
  private static int PFL_PARAMESTAMPA_FIRMARIGA2 = 1;
  private static int PFL_PARAMESTAMPA_ETICVERRINVI = 2;
  private static int PFL_PARAMESTAMPA_ETICHETINVIA = 3;

  private static int PPQRY_PARAMESTAM25 = 0;


  IDPanel PAN_PARAMESTAMPA;
  CIDREObj BUK_CERSOSDIIMLI;
  OBook BKW_CERSOSDIIMLI;
  //
  // Template Pages constants
  private static int BUK_CERSOSDIIMLI_MST_CERSOSDIIMMA = 1;
  private static int BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA = 2;

  //
  // Reports constants
  private static int BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE = 3;
  private static int BUK_CERSOSDIIMLI_SEC_INTESTREPORT = 4;
  private static int BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT = 5;
  private static int BUK_CERSOSDIIMLI_RPTBOX_LOGO = 6;
  private static int BUK_CERSOSDIIMLI_RPTBOX_DATENTCOFIHE = 7;
  private static int BUK_CERSOSDIIMLI_SPAN_CODFISCALE1 = 8;
  private static int BUK_CERSOSDIIMLI_RPTBOX_DATENTCODFIS = 9;
  private static int BUK_CERSOSDIIMLI_SPAN_CODFISCALE = 10;
  private static int BUK_CERSOSDIIMLI_RPTBOX_DATENTATTHEA = 11;
  private static int BUK_CERSOSDIIMLI_SPAN_ATTIVITA1 = 12;
  private static int BUK_CERSOSDIIMLI_RPTBOX_DATIENTEATTI = 13;
  private static int BUK_CERSOSDIIMLI_SPAN_ATTIVITA = 14;
  private static int BUK_CERSOSDIIMLI_RPTBOX_DATIENTECOMU = 15;
  private static int BUK_CERSOSDIIMLI_SPAN_DECTSPDCCSDI = 16;
  private static int BUK_CERSOSDIIMLI_RPTBOX_OGGETTO = 17;
  private static int BUK_CERSOSDIIMLI_SPAN_OGTOTITOSTSE = 18;
  private static int BUK_CERSOSDIIMLI_RPTBOX_COMUNICAZION = 19;
  private static int BUK_CERSOSDIIMLI_SPAN_COAISDN31ESM = 20;
  private static int BUK_CERSOSDIIMLI_RPTBOX_COMUNIAGGIUN = 21;
  private static int BUK_CERSOSDIIMLI_SPAN_COMUNIAGGIUN = 22;
  private static int BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO = 23;
  private static int BUK_CERSOSDIIMLI_RPTBOX_PROTOCOLLO = 24;
  private static int BUK_CERSOSDIIMLI_SPAN_PTTTSPNPCSDI = 25;
  private static int BUK_CERSOSDIIMLI_RPTBOX_VISSOGCOFIHE = 26;
  private static int BUK_CERSOSDIIMLI_SPAN_IERCFCISICSD = 27;
  private static int BUK_CERSOSDIIMLI_RPTBOX_VISSOGCODFIS = 28;
  private static int BUK_CERSOSDIIMLI_SPAN_NVRCFCISICSD = 29;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BENDDATNASHE = 30;
  private static int BUK_CERSOSDIIMLI_SPAN_IERBDDNCISIC = 31;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BENDDATANASC = 32;
  private static int BUK_CERSOSDIIMLI_SPAN_RBDDNCISICSD = 33;
  private static int BUK_CERSOSDIIMLI_RPTBOX_COMNASDENHEA = 34;
  private static int BUK_CERSOSDIIMLI_SPAN_IERCDNECISIC = 35;
  private static int BUK_CERSOSDIIMLI_RPTBOX_COMUNASCDENO = 36;
  private static int BUK_CERSOSDIIMLI_SPAN_RCDNECISICSD = 37;
  private static int BUK_CERSOSDIIMLI_RPTBOX_PRONASSIGHEA = 38;
  private static int BUK_CERSOSDIIMLI_SPAN_IERPSNECISIC = 39;
  private static int BUK_CERSOSDIIMLI_RPTBOX_PROVNASCSIGL = 40;
  private static int BUK_CERSOSDIIMLI_SPAN_RPSNECISICSD = 41;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SPETTAHEADER = 42;
  private static int BUK_CERSOSDIIMLI_SPAN_SPETTLE = 43;
  private static int BUK_CERSOSDIIMLI_RPTBOX_VISOBERSEEDE = 44;
  private static int BUK_CERSOSDIIMLI_SPAN_RBRSEEDECISI = 45;
  private static int BUK_CERSOSDIIMLI_RPTBOX_INDIRIHEADER = 46;
  private static int BUK_CERSOSDIIMLI_SPAN_RIEDCISICSDI = 47;
  private static int BUK_CERSOSDIIMLI_RPTBOX_COMUPROVHEAD = 48;
  private static int BUK_CERSOSDIIMLI_SPAN_RCEDCISICSDI = 49;
  private static int BUK_CERSOSDIIMLI_SEC_INTEGRUPBENE = 50;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BENEFICIARIO = 51;
  private static int BUK_CERSOSDIIMLI_SPAN_BENEFICIARIO = 52;
  private static int BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD = 53;
  private static int BUK_CERSOSDIIMLI_RPTBOX_CAUSALHEADER = 54;
  private static int BUK_CERSOSDIIMLI_SPAN_CAUSALE = 55;
  private static int BUK_CERSOSDIIMLI_RPTBOX_IMPONIHEADER = 56;
  private static int BUK_CERSOSDIIMLI_SPAN_C1 = 57;
  private static int BUK_CERSOSDIIMLI_RPTBOX_IMPOPREVHEAD = 58;
  private static int BUK_CERSOSDIIMLI_SPAN_IMPONIPREVLE = 59;
  private static int BUK_CERSOSDIIMLI_RPTBOX_IMPOINAIHEAD = 60;
  private static int BUK_CERSOSDIIMLI_SPAN_IMPONIBINAIL = 61;
  private static int BUK_CERSOSDIIMLI_RPTBOX_ALIQUOHEADER = 62;
  private static int BUK_CERSOSDIIMLI_SPAN_ALIQUOTA1 = 63;
  private static int BUK_CERSOSDIIMLI_RPTBOX_ALIQINPSHEAD = 64;
  private static int BUK_CERSOSDIIMLI_SPAN_ALIQUOTA2 = 65;
  private static int BUK_CERSOSDIIMLI_RPTBOX_ALIQINAIHEAD = 66;
  private static int BUK_CERSOSDIIMLI_SPAN_ALIQUOTA = 67;
  private static int BUK_CERSOSDIIMLI_RPTBOX_RITEIRPEHEAD = 68;
  private static int BUK_CERSOSDIIMLI_SPAN_C2 = 69;
  private static int BUK_CERSOSDIIMLI_RPTBOX_RITEINPSHEAD = 70;
  private static int BUK_CERSOSDIIMLI_SPAN_RITENPREVI13 = 71;
  private static int BUK_CERSOSDIIMLI_RPTBOX_RITEINAIHEAD = 72;
  private static int BUK_CERSOSDIIMLI_SPAN_RITENUTINAIL = 73;
  private static int BUK_CERSOSDIIMLI_RPTBOX_IMPNONSOGHEA = 74;
  private static int BUK_CERSOSDIIMLI_SPAN_SOMMENONSOGG = 75;
  private static int BUK_CERSOSDIIMLI_RPTBOX_RITINPENTHEA = 76;
  private static int BUK_CERSOSDIIMLI_SPAN_RITPRECAEN23 = 77;
  private static int BUK_CERSOSDIIMLI_RPTBOX_RITINAENTHEA = 78;
  private static int BUK_CERSOSDIIMLI_SPAN_RITINACARENT = 79;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX13 = 80;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX14 = 81;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX15 = 82;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX16 = 83;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX17 = 84;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX18 = 85;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX19 = 86;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX20 = 87;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX21 = 88;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX22 = 89;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX23 = 90;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX11 = 91;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX12 = 92;
  private static int BUK_CERSOSDIIMLI_SEC_DETTAGLIO = 93;
  private static int BUK_CERSOSDIIMLI_RPTBOX_T62DESCRIZIO = 94;
  private static int BUK_CERSOSDIIMLI_SPAN_RTDCISICSDIL = 95;
  private static int BUK_CERSOSDIIMLI_RPTBOX_TIPORIT = 96;
  private static int BUK_CERSOSDIIMLI_SPAN_RTRCISICSDIL = 97;
  private static int BUK_CERSOSDIIMLI_RPTBOX_T62ARTICOLO = 98;
  private static int BUK_CERSOSDIIMLI_SPAN_RTACISICSDIL = 99;
  private static int BUK_CERSOSDIIMLI_RPTBOX_TOTALEIMPONI = 100;
  private static int BUK_CERSOSDIIMLI_SPAN_RTICISICSDIL = 101;
  private static int BUK_CERSOSDIIMLI_RPTBOX_TOTAIMPOINPS = 102;
  private static int BUK_CERSOSDIIMLI_SPAN_RTIICISICSD1 = 103;
  private static int BUK_CERSOSDIIMLI_RPTBOX_TOTAIMPOINAI = 104;
  private static int BUK_CERSOSDIIMLI_SPAN_RTIICISICSDI = 105;
  private static int BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTA = 106;
  private static int BUK_CERSOSDIIMLI_SPAN_RLACISICSDIL = 107;
  private static int BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTAINPS = 108;
  private static int BUK_CERSOSDIIMLI_SPAN_RLAICISICSD1 = 109;
  private static int BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTINAIL = 110;
  private static int BUK_CERSOSDIIMLI_SPAN_RLAICISICSDI = 111;
  private static int BUK_CERSOSDIIMLI_RPTBOX_TOTARITEIRPE = 112;
  private static int BUK_CERSOSDIIMLI_SPAN_RTRICISICSD1 = 113;
  private static int BUK_CERSOSDIIMLI_RPTBOX_TOTARITEINPS = 114;
  private static int BUK_CERSOSDIIMLI_SPAN_RTRICISICSD2 = 115;
  private static int BUK_CERSOSDIIMLI_RPTBOX_TOTARITEINAI = 116;
  private static int BUK_CERSOSDIIMLI_SPAN_RTRICISICSDI = 117;
  private static int BUK_CERSOSDIIMLI_RPTBOX_TOTIMPNONSOG = 118;
  private static int BUK_CERSOSDIIMLI_SPAN_RTINSCISICSD = 119;
  private static int BUK_CERSOSDIIMLI_RPTBOX_TOTRITINPENT = 120;
  private static int BUK_CERSOSDIIMLI_SPAN_RTRIECISICS1 = 121;
  private static int BUK_CERSOSDIIMLI_RPTBOX_TOTRITINAENT = 122;
  private static int BUK_CERSOSDIIMLI_SPAN_RTRIECISICSD = 123;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX = 124;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX24 = 125;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX25 = 126;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX26 = 127;
  private static int BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA = 128;
  private static int BUK_CERSOSDIIMLI_RPTBOX_TOTALI = 129;
  private static int BUK_CERSOSDIIMLI_SPAN_TOTALI = 130;
  private static int BUK_CERSOSDIIMLI_RPTBOX_LINEASUP = 131;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTAIMP = 132;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTSRTICISIC = 133;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTIMI1 = 134;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTSRTIICIS1 = 135;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTIMIN = 136;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTSRTIICISI = 137;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIIR = 138;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTSRTRICIS1 = 139;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRII1 = 140;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTSRTRICIS2 = 141;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIIN = 142;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTSRTRICISI = 143;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SUOFTOIMNOSO = 144;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTSRTINSCIS = 145;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIINE1 = 146;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTSRTRIECI1 = 147;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIINEN = 148;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTSRTRIECIS = 149;
  private static int BUK_CERSOSDIIMLI_RPTBOX_LINEAINF = 150;
  private static int BUK_CERSOSDIIMLI_RPTBOX_ADDIZIREGION = 151;
  private static int BUK_CERSOSDIIMLI_SPAN_ADDIZIREGION = 152;
  private static int BUK_CERSOSDIIMLI_RPTBOX_ADDIZICOMUNA = 153;
  private static int BUK_CERSOSDIIMLI_SPAN_ADDIZICOMUNA = 154;
  private static int BUK_CERSOSDIIMLI_RPTBOX_ADDCASPREPRO = 155;
  private static int BUK_CERSOSDIIMLI_SPAN_C = 156;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SUMOFIMPOREG = 157;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTSRIRCISIC = 158;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SUMOFIMPOCOM = 159;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTSRICCISIC = 160;
  private static int BUK_CERSOSDIIMLI_RPTBOX_MAXOFALIQREG = 161;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTMRARCISIC = 162;
  private static int BUK_CERSOSDIIMLI_RPTBOX_MAXOFALIQCOM = 163;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTMRACCISIC = 164;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIAD = 165;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTSRTRACISI = 166;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIADCO = 167;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTSRTRACCIS = 168;
  private static int BUK_CERSOSDIIMLI_RPTBOX_SUOFTORICAPR = 169;
  private static int BUK_CERSOSDIIMLI_SPAN_PGTSRTRCPCIS = 170;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOXLESOMME = 171;
  private static int BUK_CERSOSDIIMLI_SPAN_LESONOSOSCDE = 172;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOXIVA = 173;
  private static int BUK_CERSOSDIIMLI_SPAN_FNVRSICISICS = 174;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX1 = 175;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX2 = 176;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX3 = 177;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX4 = 178;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX5 = 179;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX6 = 180;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX7 = 181;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX8 = 182;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX9 = 183;
  private static int BUK_CERSOSDIIMLI_RPTBOX_BOX10 = 184;
  private static int BUK_CERSOSDIIMLI_SEC_PIEDGRUNOENT = 185;
  private static int BUK_CERSOSDIIMLI_RPTBOX_MODALIVERSAM = 186;
  private static int BUK_CERSOSDIIMLI_SPAN_MODALIVERSAM = 187;
  private static int BUK_CERSOSDIIMLI_RPTBOX_ESVCLMPDDPRN = 188;
  private static int BUK_CERSOSDIIMLI_SEC_PIEGRUNOENPR = 189;
  private static int BUK_CERSOSDIIMLI_RPTBOX_LIDCINPSESVC = 190;
  private static int BUK_CERSOSDIIMLI_SPAN_LIDCINPSESVC = 191;
  private static int BUK_CERSOSDIIMLI_SEC_PIEDGRUPFIRM = 192;
  private static int BUK_CERSOSDIIMLI_RPTBOX_FIRMA = 193;
  private static int BUK_CERSOSDIIMLI_RPTBOX_FIRMARIGA1 = 194;
  private static int BUK_CERSOSDIIMLI_SPAN_NOMOGGFIRRI1 = 195;
  private static int BUK_CERSOSDIIMLI_RPTBOX_FIRMARIGA2 = 196;
  private static int BUK_CERSOSDIIMLI_SPAN_NOMOGGFIRRI2 = 197;
  private static int BUK_CERSOSDIIMLI_SEC_PIEDEREPORT = 198;


  // Definition of Global Variables
  private IDVariant IMMAGINE = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMESTAM28(IMDB);
    //
    //
    Init_PQRY_PARAMESTAM25(IMDB);
    Init_PQRY_PARAMESTAM25_RS(IMDB);
    Init_PQRY_ENTIEMISSIO1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMESTAM28(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMESTAM28, 3);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMESTAM28, "TBL_PARAMESTAM28");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM28,IMDBDef5.FLD_PARAMESTAM28_NOMOGGFIRRI1, "NOMOGGFIRRI1");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM28,IMDBDef5.FLD_PARAMESTAM28_NOMOGGFIRRI1,5,200,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM28,IMDBDef5.FLD_PARAMESTAM28_NOMOGGFIRRI2, "NOMOGGFIRRI2");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM28,IMDBDef5.FLD_PARAMESTAM28_NOMOGGFIRRI2,5,200,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMESTAM28,IMDBDef5.FLD_PARAMESTAM28_NOMEOGGETIVA, "NOMEOGGETIVA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMESTAM28,IMDBDef5.FLD_PARAMESTAM28_NOMEOGGETIVA,5,50,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMESTAM28, 0);
  }

  private static void Init_PQRY_PARAMESTAM25(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMESTAM25, 2);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMESTAM25, "PQRY_PARAMESTAM25");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMESTAM25,IMDBDef15.PQSL_PARAMESTAM25_NOMOGGFIRRI1, "NOMOGGFIRRI1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMESTAM25,IMDBDef15.PQSL_PARAMESTAM25_NOMOGGFIRRI1,5,200,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMESTAM25,IMDBDef15.PQSL_PARAMESTAM25_NOMOGGFIRRI2, "NOMOGGFIRRI2");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMESTAM25,IMDBDef15.PQSL_PARAMESTAM25_NOMOGGFIRRI2,5,200,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMESTAM25, 0);
  }

  private static void Init_PQRY_PARAMESTAM25_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMESTAM25_RS, 2);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMESTAM25_RS, "PQRY_PARAMESTAM25_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMESTAM25_RS,IMDBDef15.PQSL_PARAMESTAM25_NOMOGGFIRRI1, "NOMOGGFIRRI1");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMESTAM25_RS,IMDBDef15.PQSL_PARAMESTAM25_NOMOGGFIRRI1,5,200,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMESTAM25_RS,IMDBDef15.PQSL_PARAMESTAM25_NOMOGGFIRRI2, "NOMOGGFIRRI2");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMESTAM25_RS,IMDBDef15.PQSL_PARAMESTAM25_NOMOGGFIRRI2,5,200,0);
  }

  private static void Init_PQRY_ENTIEMISSIO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ENTIEMISSIO1, 40);
    IMDB.set_TblCode(IMDBDef15.PQRY_ENTIEMISSIO1, "PQRY_ENTIEMISSIO1");
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTARITEIRPE, "TOTARITEIRPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTARITEIRPE,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECLIQCAUIRP, "RECLIQCAUIRP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECLIQCAUIRP,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECORLIQALIQ, "RECORLIQALIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECORLIQALIQ,3,4,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTALEIMPONI, "TOTALEIMPONI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTALEIMPONI,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTIMPNONSOG, "TOTIMPNONSOG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTIMPNONSOG,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECLIQALIINP, "RECLIQALIINP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECLIQALIINP,3,5,3);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTAIMPOINPS, "TOTAIMPOINPS");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTAIMPOINPS,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTARITEINPS, "TOTARITEINPS");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTARITEINPS,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECORT62DESC, "RECORT62DESC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECORT62DESC,5,30,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECORT62ARTI, "RECORT62ARTI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECORT62ARTI,5,30,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTALRITEADD, "TOTALRITEADD");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTALRITEADD,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_IMPONIBILREG, "IMPONIBILREG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_IMPONIBILREG,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_ALIQUOTAREG, "ALIQUOTAREG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_ALIQUOTAREG,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_IMPONIBILCOM, "IMPONIBILCOM");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_IMPONIBILCOM,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_ALIQUOTACOM, "ALIQUOTACOM");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_ALIQUOTACOM,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTRITADDCOM, "TOTRITADDCOM");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTRITADDCOM,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTRITINPENT, "TOTRITINPENT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTRITINPENT,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTRITCASPRO, "TOTRITCASPRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTRITCASPRO,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTAIMPOINAI, "TOTAIMPOINAI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTAIMPOINAI,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTARITEINAI, "TOTARITEINAI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTARITEINAI,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECLIQALIINA, "RECLIQALIINA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECLIQALIINA,3,5,3);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTRITINAENT, "TOTRITINAENT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_TOTRITINAENT,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECORTIPORIT, "RECORTIPORIT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECORTIPORIT,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECORSOMMIVA, "RECORSOMMIVA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECORSOMMIVA,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECORAGGBENE, "RECORAGGBENE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECORAGGBENE,5,201,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECOCODIFISC, "RECOCODIFISC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECOCODIFISC,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECBENPARIVA, "RECBENPARIVA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECBENPARIVA,5,11,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_REBERASOEEDE, "REBERASOEEDE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_REBERASOEEDE,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECINDENTDAT, "RECINDENTDAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECINDENTDAT,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECCAPENTDAT, "RECCAPENTDAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECCAPENTDAT,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECBENCODFIS, "RECBENCODFIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECBENCODFIS,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_REBERASOESEE, "REBERASOESEE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_REBERASOESEE,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECOCOMCOMEE, "RECOCOMCOMEE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECOCOMCOMEE,1,3,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECCOMDEENDA, "RECCOMDEENDA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECCOMDEENDA,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECPROSIENDA, "RECPROSIENDA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECPROSIENDA,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECBENDDATNA, "RECBENDDATNA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECBENDDATNA,8,0,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECCOMCONAEE, "RECCOMCONAEE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECCOMCONAEE,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECCOMDENAEE, "RECCOMDENAEE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECCOMDENAEE,5,0,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECPROSINAEE, "RECPROSINAEE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECPROSINAEE,5,0,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECOLIQBENEE, "RECOLIQBENEE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ENTIEMISSIO1,IMDBDef15.PQSL_ENTIEMISSIO1_RECOLIQBENEE,2,15,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ENTIEMISSIO1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ConfermaInvioSostitutiImposta(MyWebEntryPoint w, IMDBObj imdb)
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
  public ConfermaInvioSostitutiImposta()
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
    FormIdx = MyGlb.FRM_CONINVSOSIMP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "89D31938-3031-4E88-ACCF-E56EF4096A4C";
    ResModeW = 1;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 820;
    DesignHeight = 686;
    set_Caption(new IDVariant("Conferma Invio Sostituti Imposta"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 820;
    Frames[1].Height = 660;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.115152;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 820;
    Frames[2].Height = 76;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri Stampa";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 76;
    PAN_PARAMESTAMPA = new IDPanel(w, this, 2, "PAN_PARAMESTAMPA");
    Frames[2].Content = PAN_PARAMESTAMPA;
    PAN_PARAMESTAMPA.Lockable = false;
    PAN_PARAMESTAMPA.iLocked = false;
    PAN_PARAMESTAMPA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMESTAMPA.VS = MainFrm.VisualStyleList;
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 820-MyGlb.PAN_OFFS_X, 76-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "587FB189-48F5-4F8A-A448-09114DA9E5E9");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMESTAMPA.InitStatus = 1;
    PAN_PARAMESTAMPA_Init();
    PAN_PARAMESTAMPA_InitFields();
    PAN_PARAMESTAMPA_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 820;
    Frames[3].Height = 584;
    Frames[3].Caption = "Certificati Sostituti Di Imposta Libro";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 584;
    BKW_CERSOSDIIMLI = new OBook(this);
    BUK_CERSOSDIIMLI = new CIDREObj(BKW_CERSOSDIIMLI);
    Frames[3].Content = BKW_CERSOSDIIMLI;
    BKW_CERSOSDIIMLI.Height = 546;
    BKW_CERSOSDIIMLI.Width = 812;
    BKW_CERSOSDIIMLI.iGuid = "9EB7DFF0-2A1E-4C16-BBAB-080CFA0AB9EC";
    BKW_CERSOSDIIMLI.Code = "BUK_CERSOSDIIMLI";
    BKW_CERSOSDIIMLI.BookObj = BUK_CERSOSDIIMLI;
    BKW_CERSOSDIIMLI.InitDefMasks();
    BUK_CERSOSDIIMLI.set_FrIndex(3);
    BUK_CERSOSDIIMLI.InitBook(1, 1245441, "Certificati Sostituti Di Imposta Libro", IMDB, MainFrm.VisualStyleList);
    BUK_CERSOSDIIMLI.InitHTML();
    BUK_CERSOSDIIMLI.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CERSOSDIIMLI.SetSize(812, 546);
    BUK_CERSOSDIIMLI.Book.SetMainFrm(MainFrm);
    BUK_CERSOSDIIMLI.SetRTCGuid(0, "9EB7DFF0-2A1E-4C16-BBAB-080CFA0AB9EC");
    BUK_CERSOSDIIMLI.SetObjCode(0, "CERSOSDIIMLI");
    BUK_CERSOSDIIMLI_MST_CERSOSDIIMMA_Init();
    BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE_Init();
    BUK_CERSOSDIIMLI_InitLinks();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMESTAM28, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONINVSOSIMP_PARAMESTAM25();
      }
      PAN_PARAMESTAMPA.UpdatePanel(MainFrm);
      BUK_CERSOSDIIMLI.UpdateBook();
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
    if (Code.equals("BUK_CERSOSDIIMLI")) return BUK_CERSOSDIIMLI;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ConfermaInvioSostitutiImposta);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ConfermaInvioSostitutiImposta.class.getName() : (Glb.ClassWithPackage(ConfermaInvioSostitutiImposta.class) ? ConfermaInvioSostitutiImposta.class.getName().substring(ConfermaInvioSostitutiImposta.class.getPackage().getName().length() + 1) : ConfermaInvioSostitutiImposta.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Invia
  // **********************************************************************
  public int Invia ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CHIAVE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STRINOMEMITT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STRIINDIMITT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STRIOGGEMAIL = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STRITESTMAIL = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STRINOMEALLE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_OGGETTO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TESTO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMEMITTENTE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_EMAILMITTENT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMEALLEGATO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_FASE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CODBEN = new IDVariant(0,IDVariant.INTEGER);
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      v_CHIAVE = (new IDVariant("PRODUCTS/MAIL/CERTIFICATO", IDVariant.STRING));
      v_STRINOMEMITT = (new IDVariant("Nome Mittente", IDVariant.STRING));
      v_STRIINDIMITT = (new IDVariant("Indirizzo Mittente", IDVariant.STRING));
      v_STRIOGGEMAIL = (new IDVariant("Oggetto Mail", IDVariant.STRING));
      v_STRITESTMAIL = (new IDVariant("Testo Mail", IDVariant.STRING));
      v_STRINOMEALLE = (new IDVariant("Nome Allegato", IDVariant.STRING));
      v_FASE = (new IDVariant("Certificato sostituto d'imposta", IDVariant.STRING));
      // 
      // Invia Body
      // Procedure Body
      // 
      IDVariant v_AVVISIINVIAT = new IDVariant(0,IDVariant.INTEGER);
      // 
      // setta parametri registro
      // 
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.CHIAVE = " + IDL.CSql(v_CHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.STRINGA = " + IDL.CSql(v_STRINOMEMITT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NOMEMITTENTE = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.CHIAVE = " + IDL.CSql(v_CHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.STRINGA = " + IDL.CSql(v_STRIINDIMITT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_EMAILMITTENT = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.CHIAVE = " + IDL.CSql(v_CHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.STRINGA = " + IDL.CSql(v_STRIOGGEMAIL, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_OGGETTO = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.CHIAVE = " + IDL.CSql(v_CHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.STRINGA = " + IDL.CSql(v_STRITESTMAIL, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_TESTO = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.CHIAVE = " + IDL.CSql(v_CHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.STRINGA = " + IDL.CSql(v_STRINOMEALLE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NOMEALLEGATO = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
      }
      v_CODBEN = new IDVariant(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARACODIBENE, 0),IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  E.RAGIONE_SOCIALE_ESTESA as BENRAGSOCES2, ");
      SQL.append("  E.CODICE as BENCODICE, ");
      SQL.append("  E.E_MAIL as BENEMAIL2, ");
      SQL.append("  E.TELEX as BENTELEX, ");
      SQL.append("  E.INVIO_STAMPE as BENINVISTAM2 ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  MAN B, ");
      SQL.append("  T62 C, ");
      SQL.append("  BEN D, ");
      SQL.append("  BEN E ");
      SQL.append("where (D.CODICE = A.BENEFICIARIO) ");
      SQL.append("and   (A.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (A.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append("and   (A.CAUSALE_IRPEF = C.CODICE) ");
      SQL.append("and   (NOT ((A.CODICE IS NULL))) ");
      SQL.append("and   (NOT ((A.BENEFICIARIO IS NULL))) ");
      SQL.append("and   (C.TIPO_CERT = 'E') ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'M') ");
      SQL.append("and   (" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMPERENTI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'SI') ");
      SQL.append("and   (D.ENTE_DATORE_LAV = NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARACODIBENE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(D.ENTE_DATORE_LAV, -1))) ");
      SQL.append("and   (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((B.D_DATA_MAND BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMMANDDAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMMANDAAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (B.D_DATA_MAND = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(F.D_DATA_MAND) ");
      SQL.append("from ");
      SQL.append("  MAN F ");
      SQL.append("where (F.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (F.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("and   (NVL(A.CODICE, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMCODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, NVL(A.CODICE, -1), " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMCODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (E.CODICE = D.ENTE_DATORE_LAV) ");
      SQL.append("and   (NOT ((E.INVIO_STAMPE IS NULL))) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  K.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  K.CODICE, ");
      SQL.append("  K.E_MAIL, ");
      SQL.append("  K.TELEX, ");
      SQL.append("  K.INVIO_STAMPE ");
      SQL.append("from ");
      SQL.append("  LIQ G, ");
      SQL.append("  PAGAMENTI H, ");
      SQL.append("  T62 I, ");
      SQL.append("  BEN J, ");
      SQL.append("  BEN K ");
      SQL.append("where (J.CODICE = G.BENEFICIARIO) ");
      SQL.append("and   (G.ANNO_MAND = H.ANNO_MAND) ");
      SQL.append("and   (G.NUMERO_MAND = H.NUMERO_MAND) ");
      SQL.append("and   (G.ANNO_LIQ = H.ANNO_LIQ) ");
      SQL.append("and   (G.NUMERO_LIQ = H.NUMERO_LIQ) ");
      SQL.append("and   (G.CAUSALE_IRPEF = I.CODICE) ");
      SQL.append("and   (NOT ((G.CODICE IS NULL))) ");
      SQL.append("and   (NOT ((G.BENEFICIARIO IS NULL))) ");
      SQL.append("and   (I.TIPO_CERT = 'E') ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'P') ");
      SQL.append("and   (" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMPERENTI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'SI') ");
      SQL.append("and   (J.ENTE_DATORE_LAV = NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARACODIBENE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(J.ENTE_DATORE_LAV, -1))) ");
      SQL.append("and   (G.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((H.D_DATA_PAGAM BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMMANDDAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMMANDAAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   ((H.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(H.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(H.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (H.D_DATA_PAGAM = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(L.D_DATA_PAGAM) ");
      SQL.append("from ");
      SQL.append("  PAGAMENTI L ");
      SQL.append("where ((L.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(H.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(H.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (L.ANNO_MAND = H.ANNO_MAND) ");
      SQL.append("and   (L.NUMERO_MAND = H.NUMERO_MAND) ");
      SQL.append("and   (L.ANNO_LIQ = H.ANNO_LIQ) ");
      SQL.append("and   (L.NUMERO_LIQ = H.NUMERO_LIQ) ");
      SQL.append(")) ");
      SQL.append("and   (NVL(G.CODICE, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMCODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, NVL(G.CODICE, -1), " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMCODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (K.CODICE = J.ENTE_DATORE_LAV) ");
      SQL.append("and   (NOT ((K.INVIO_STAMPE IS NULL))) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  P.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  P.CODICE, ");
      SQL.append("  P.E_MAIL, ");
      SQL.append("  P.TELEX, ");
      SQL.append("  P.INVIO_STAMPE ");
      SQL.append("from ");
      SQL.append("  LIQ M, ");
      SQL.append("  MAN N, ");
      SQL.append("  T62 O, ");
      SQL.append("  BEN P, ");
      SQL.append("  AD4_COMUNI Q, ");
      SQL.append("  AD4_PROVINCIE R, ");
      SQL.append("  AD4_COMUNI S, ");
      SQL.append("  AD4_PROVINCIE T ");
      SQL.append("where (M.ANNO_MAND = N.ANNO_MAND) ");
      SQL.append("and   (M.NUMERO_MAND = N.NUMERO_MAND) ");
      SQL.append("and   (M.CAUSALE_IRPEF = O.CODICE) ");
      SQL.append("and   (NOT ((M.CODICE IS NULL))) ");
      SQL.append("and   (NOT ((M.BENEFICIARIO IS NULL))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'M') ");
      SQL.append("and   (" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMPERENTI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'NO') ");
      SQL.append("and   (M.BENEFICIARIO = NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARACODIBENE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(M.BENEFICIARIO, -1))) ");
      SQL.append("and   (M.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((N.D_DATA_MAND BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMMANDDAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMMANDAAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (N.D_DATA_MAND = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(U.D_DATA_MAND) ");
      SQL.append("from ");
      SQL.append("  MAN U ");
      SQL.append("where (U.ANNO_MAND = N.ANNO_MAND) ");
      SQL.append("and   (U.NUMERO_MAND = N.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("and   (NVL(M.CODICE, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMCODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, NVL(M.CODICE, -1), " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMCODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (P.CODICE = M.BENEFICIARIO) ");
      SQL.append("and   (Q.COMUNE(+) = NVL(P.COMUNE_DOMICILIO, P.COMUNE)) ");
      SQL.append("and   (Q.PROVINCIA_STATO(+) = NVL(P.PROVINCIA_DOMICILIO, P.PROVINCIA)) ");
      SQL.append("and   (R.PROVINCIA(+) = NVL(P.PROVINCIA_DOMICILIO, P.PROVINCIA)) ");
      SQL.append("and   (S.COMUNE(+) = P.COMUNE_NASCITA) ");
      SQL.append("and   (S.PROVINCIA_STATO(+) = P.PROVINCIA_NASCITA) ");
      SQL.append("and   (T.PROVINCIA(+) = P.PROVINCIA_NASCITA) ");
      SQL.append("and   (NOT ((P.INVIO_STAMPE IS NULL))) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  Y.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  Y.CODICE, ");
      SQL.append("  Y.E_MAIL, ");
      SQL.append("  Y.TELEX, ");
      SQL.append("  Y.INVIO_STAMPE ");
      SQL.append("from ");
      SQL.append("  LIQ V, ");
      SQL.append("  PAGAMENTI W, ");
      SQL.append("  T62 X, ");
      SQL.append("  BEN Y, ");
      SQL.append("  AD4_COMUNI Z, ");
      SQL.append("  AD4_PROVINCIE A1, ");
      SQL.append("  AD4_COMUNI B1, ");
      SQL.append("  AD4_PROVINCIE C1 ");
      SQL.append("where (V.ANNO_MAND = W.ANNO_MAND) ");
      SQL.append("and   (V.NUMERO_MAND = W.NUMERO_MAND) ");
      SQL.append("and   (V.ANNO_LIQ = W.ANNO_LIQ) ");
      SQL.append("and   (V.NUMERO_LIQ = W.NUMERO_LIQ) ");
      SQL.append("and   (V.CAUSALE_IRPEF = X.CODICE) ");
      SQL.append("and   (NOT ((V.CODICE IS NULL))) ");
      SQL.append("and   (NOT ((V.BENEFICIARIO IS NULL))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'P') ");
      SQL.append("and   (" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMPERENTI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'NO') ");
      SQL.append("and   (Y.CODICE = NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARACODIBENE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(Y.CODICE, -1))) ");
      SQL.append("and   (V.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((W.D_DATA_PAGAM BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMMANDDAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMMANDAAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   ((W.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(W.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(W.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (W.D_DATA_PAGAM = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(D1.D_DATA_PAGAM) ");
      SQL.append("from ");
      SQL.append("  PAGAMENTI D1 ");
      SQL.append("where ((D1.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(W.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(W.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (D1.ANNO_MAND = W.ANNO_MAND) ");
      SQL.append("and   (D1.NUMERO_MAND = W.NUMERO_MAND) ");
      SQL.append("and   (D1.ANNO_LIQ = W.ANNO_LIQ) ");
      SQL.append("and   (D1.NUMERO_LIQ = W.NUMERO_LIQ) ");
      SQL.append(")) ");
      SQL.append("and   (NVL(V.CODICE, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMCODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, NVL(V.CODICE, -1), " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMCODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (Y.CODICE = V.BENEFICIARIO) ");
      SQL.append("and   (Z.COMUNE(+) = NVL(Y.COMUNE_DOMICILIO, Y.COMUNE)) ");
      SQL.append("and   (Z.PROVINCIA_STATO(+) = NVL(Y.PROVINCIA_DOMICILIO, Y.PROVINCIA)) ");
      SQL.append("and   (A1.PROVINCIA(+) = NVL(Y.PROVINCIA_DOMICILIO, Y.PROVINCIA)) ");
      SQL.append("and   (B1.COMUNE(+) = Y.COMUNE_NASCITA) ");
      SQL.append("and   (B1.PROVINCIA_STATO(+) = Y.PROVINCIA_NASCITA) ");
      SQL.append("and   (C1.PROVINCIA(+) = Y.PROVINCIA_NASCITA) ");
      SQL.append("and   (NOT ((Y.INVIO_STAMPE IS NULL))) ");
      C3 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C3.EOF()) C3.MoveNext();
      while (!C3.EOF())
      {
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARACODIBENE, 0, new IDVariant(C3.Get("BENCODICE")));
        if (!(IDL.IsNull(C3.Get("BENINVISTAM2"))))
        {
          BUK_CERSOSDIIMLI.set_PrintDestination((new IDVariant(3)).intValue());
          BUK_CERSOSDIIMLI.SetBoxImage(BUK_CERSOSDIIMLI_RPTBOX_LOGO, null, (new IDVariant("logo.bmp")).toString()); 
          BUK_CERSOSDIIMLI.SetBoxImage(BUK_CERSOSDIIMLI_RPTBOX_FIRMA, null, IMMAGINE.toString()); 
          BUK_CERSOSDIIMLI.RefreshQuery();
          BUK_CERSOSDIIMLI.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
          BUK_CERSOSDIIMLI.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
          if (MainFrm.InvioMail(((C3.Get("BENINVISTAM2").equals((new IDVariant("M"))))?(new IDVariant("MAIL")):(new IDVariant("FAX"))), C3.Get("BENRAGSOCES2"), ((C3.Get("BENINVISTAM2").equals((new IDVariant("M"))))?C3.Get("BENEMAIL2"):(new IDVariant())), (new IDVariant()), (new IDVariant()), ((C3.Get("BENINVISTAM2").equals((new IDVariant("F"))))?C3.Get("BENTELEX"):(new IDVariant())), v_OGGETTO, v_TESTO, v_NOMEMITTENTE, v_EMAILMITTENT, v_NOMEALLEGATO, (new IDVariant(BUK_CERSOSDIIMLI.GetWebFileName())), v_FASE).equals((new IDVariant("SI")), true))
          {
            v_AVVISIINVIAT = IDL.Add(v_AVVISIINVIAT, (new IDVariant(1)));
          }
        }
        C3.MoveNext();
      }
      C3.Close();
      if (v_AVVISIINVIAT.compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant S = null;
        S = (new IDVariant("Certificati inviati correttamente"));
        MainFrm.set_AlertMessage(S); 
      }
      IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARACODIBENE, 0, new IDVariant(new IDVariant(v_CODBEN),IDVariant.FLOAT));
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaInvioSostitutiImposta", "Invia", _e);
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
      IDVariant v_CAPTION = null;
      v_CAPTION = (new IDVariant("Conferma invio certificato sostituto d'imposta"));
      set_Caption(new IDVariant(v_CAPTION));
      BUK_CERSOSDIIMLI.SetBoxImage(BUK_CERSOSDIIMLI_RPTBOX_LOGO, null, (new IDVariant("logo.bmp")).toString()); 
      BUK_CERSOSDIIMLI.SetBoxImage(BUK_CERSOSDIIMLI_RPTBOX_FIRMA, null, IMMAGINE.toString()); 
      BUK_CERSOSDIIMLI.RefreshQuery();
      BUK_CERSOSDIIMLI.RefreshBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      BUK_CERSOSDIIMLI.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaInvioSostitutiImposta", "Load", _e);
    }
  }

  // **********************************************************************
  // Visibilita Campi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int VisibilitaCampi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilita Campi Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMPERENTI, 0).equals((new IDVariant("SI")), true))
      {
        BUK_CERSOSDIIMLI.set_SectionVisible(BUK_CERSOSDIIMLI_SEC_INTEGRUPBENE, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_SectionVisible(BUK_CERSOSDIIMLI_SEC_PIEDGRUNOENT, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_SectionVisible(BUK_CERSOSDIIMLI_SEC_PIEGRUNOENPR, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_COMUNICAZION, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_COMUNIAGGIUN, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_CERSOSDIIMLI.set_SectionVisible(BUK_CERSOSDIIMLI_SEC_INTEGRUPBENE, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_COMUNICAZION, (new IDVariant(-1)).booleanValue());
        if (SommaRitenute(new IDVariant(IDL.ToInteger(IDL.SubStr(BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECORAGGBENE"), (new IDVariant(1)), (new IDVariant(6)))),IDVariant.FLOAT)).compareTo((new IDVariant(0)), true)>0)
        {
          BUK_CERSOSDIIMLI.set_SectionVisible(BUK_CERSOSDIIMLI_SEC_PIEDGRUNOENT, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          BUK_CERSOSDIIMLI.set_SectionVisible(BUK_CERSOSDIIMLI_SEC_PIEDGRUNOENT, (new IDVariant(0)).booleanValue());
        }
        if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARARITEPREV, 0).equals((new IDVariant("SI")), true))
        {
          BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_COMUNIAGGIUN, (new IDVariant(-1)).booleanValue());
          BUK_CERSOSDIIMLI.set_SectionVisible(BUK_CERSOSDIIMLI_SEC_PIEGRUNOENPR, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_COMUNIAGGIUN, (new IDVariant(0)).booleanValue());
          BUK_CERSOSDIIMLI.set_SectionVisible(BUK_CERSOSDIIMLI_SEC_PIEGRUNOENPR, (new IDVariant(0)).booleanValue());
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARANUMEPROT, 0))))
      {
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_PROTOCOLLO, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_PROTOCOLLO, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARRITPRCAEN, 0).equals((new IDVariant("SI")), true))
      {
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_RITINPENTHEA, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_TOTRITINPENT, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIINE1, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_RITINPENTHEA, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_TOTRITINPENT, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIINE1, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARARITEPREV, 0).equals((new IDVariant("SI")), true))
      {
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_IMPOPREVHEAD, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_ALIQINPSHEAD, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_RITEINPSHEAD, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_TOTAIMPOINPS, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTAINPS, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_TOTARITEINPS, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTIMI1, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRII1, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_IMPOPREVHEAD, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_ALIQINPSHEAD, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_RITEINPSHEAD, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_TOTAIMPOINPS, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTAINPS, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_TOTARITEINPS, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTIMI1, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRII1, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMINAIL, 0).equals((new IDVariant("SI")), true))
      {
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_IMPOINAIHEAD, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_ALIQINAIHEAD, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_RITEINAIHEAD, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_RITINAENTHEA, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_TOTAIMPOINAI, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTINAIL, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_TOTARITEINAI, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_TOTRITINAENT, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTIMIN, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIIN, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIINEN, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_IMPOINAIHEAD, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_ALIQINAIHEAD, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_RITEINAIHEAD, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_RITINAENTHEA, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_TOTAIMPOINAI, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTINAIL, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_TOTARITEINAI, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_TOTRITINAENT, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTIMIN, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIIN, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIINEN, (new IDVariant(0)).booleanValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaInvioSostitutiImposta", "VisibilitaCampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Somma Ritenute
  // Beneficiario:  - Input
  // **********************************************************************
  public IDVariant SommaRitenute (IDVariant Beneficiario)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Somma Ritenute Body
      // Corpo Procedura
      // 
      IDVariant v_SOMMARITENUT = new IDVariant(0,IDVariant.DECIMAL);
      v_SOMMARITENUT = (new IDVariant(0, IDVariant.DECIMAL));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  SUM(NVL(A.RITENUTE_IRPEF, 0)) as SUNUVALIRIIZ ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  MAN B ");
      SQL.append("where (A.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (A.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append("and   (NOT ((A.CODICE IS NULL))) ");
      SQL.append("and   (A.BENEFICIARIO = " + IDL.CSql(Beneficiario, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((B.D_DATA_MAND BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMMANDDAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMMANDAAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (B.D_DATA_MAND = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(C.D_DATA_MAND) ");
      SQL.append("from ");
      SQL.append("  MAN C ");
      SQL.append("where (C.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (C.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("and   (NVL(A.CODICE, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARAMCODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.CODICE, -1))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SOMMARITENUT = QV.Get("SUNUVALIRIIZ", IDVariant.DECIMAL) ;
      }
      QV.Close();
      return v_SOMMARITENUT;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaInvioSostitutiImposta", "SommaRitenute", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Certificati Sostituti Di Imposta Mastro On Formatting
  // Evento notificato da una pagina quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_CERSOSDIIMLI_MST_CERSOSDIIMMA_OnFormattingPage()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Certificati Sostituti Di Imposta Mastro On Formatting Body
      // Corpo Procedura
      // 
      VisibilitaCampi();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaInvioSostitutiImposta", "CertificatiSostitutiDiImpostaMastroOnFormatting", _e);
    }
  }

  // **********************************************************************
  // Piede Gruppo Totali After Formatting 1
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Piede Gruppo Totali After Formatting 1 Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef5.TBL_PARAMESTAM28, IMDBDef5.FLD_PARAMESTAM28_NOMEOGGETIVA, 0).equals((new IDVariant("SI")), true))
      {
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_BOXLESOMME, (new IDVariant(-1)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_BOXIVA, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_BOXLESOMME, (new IDVariant(0)).booleanValue());
        BUK_CERSOSDIIMLI.set_BoxVisible(BUK_CERSOSDIIMLI_RPTBOX_BOXIVA, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConfermaInvioSostitutiImposta", "PiedeGruppoTotaliAfterFormatting1", _e);
    }
  }

  // **********************************************************************
  // Parametri Stampa
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CONINVSOSIMP_PARAMESTAM25() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMESTAM25_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMESTAM28, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMESTAM28, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMESTAM25_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMESTAM25_RS, 0, IMDBDef5.TBL_PARAMESTAM28, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMESTAM25_RS, 0, 0, IMDBDef5.TBL_PARAMESTAM28, IMDBDef5.FLD_PARAMESTAM28_NOMOGGFIRRI1, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMESTAM25_RS, 1, 0, IMDBDef5.TBL_PARAMESTAM28, IMDBDef5.FLD_PARAMESTAM28_NOMOGGFIRRI2, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMESTAM28, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMESTAM28, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMESTAM28, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMESTAM25_RS, 0);
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
  private void PAN_PARAMESTAMPA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMESTAMPA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMESTAMPA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMESTAMPA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMESTAMPA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMESTAMPA);
    // Stub
  }

  private void PAN_PARAMESTAMPA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMESTAMPA_ETICHETINVIA)
    {
      this.IdxPanelActived = this.PAN_PARAMESTAMPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Invia();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMESTAMPA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMESTAMPA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMESTAMPA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CERSOSDIIMLI_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CERSOSDIIMLI_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CERSOSDIIMLI_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT)
    {
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_CODFISCALE, new IDVariant(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_COD_FISCALE, 0)));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_ATTIVITA, new IDVariant(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DATIENTEATTI, 0)));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_DECTSPDCCSDI, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_COMUNE, 0), (new IDVariant(","))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARADATACERT, 0)))));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_OGTOTITOSTSE, new IDVariant(IDL.Add((new IDVariant(BUK_CERSOSDIIMLI.BoxToolTip(BUK_CERSOSDIIMLI_RPTBOX_OGGETTO))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))));
    }
    if (SectionID==BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO)
    {
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PTTTSPNPCSDI, new IDVariant(IDL.Add((new IDVariant(BUK_CERSOSDIIMLI.BoxToolTip(BUK_CERSOSDIIMLI_RPTBOX_PROTOCOLLO))), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI214, IMDBDef15.PQSL_PARAMETRI214_PARANUMEPROT, 0)))));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_IERCFCISICSD, new IDVariant(((BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECOCODIFISC").equals((new IDVariant())))?((BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECBENPARIVA").equals((new IDVariant())))?(new IDVariant()):(new IDVariant("Partita Iva"))):(new IDVariant("Codice Fiscale")))));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_NVRCFCISICSD, new IDVariant(IDL.NullValue(BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECOCODIFISC"),BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECBENPARIVA"))));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_IERBDDNCISIC, new IDVariant(((BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECBENDDATNA").equals((new IDVariant())))?(new IDVariant()):(new IDVariant(BUK_CERSOSDIIMLI.BoxToolTip(BUK_CERSOSDIIMLI_RPTBOX_BENDDATNASHE))))));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_IERCDNECISIC, new IDVariant(((BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECCOMDENAEE").equals((new IDVariant())))?(new IDVariant()):((BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECCOMCONAEE").equals((new IDVariant(0))))?(new IDVariant("Stato di Nascita Estero")):(new IDVariant(BUK_CERSOSDIIMLI.BoxToolTip(BUK_CERSOSDIIMLI_RPTBOX_COMNASDENHEA)))))));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_IERPSNECISIC, new IDVariant(((BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECPROSINAEE").equals((new IDVariant())))?(new IDVariant()):(new IDVariant(BUK_CERSOSDIIMLI.BoxToolTip(BUK_CERSOSDIIMLI_RPTBOX_PRONASSIGHEA))))));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_RCEDCISICSDI, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECCAPENTDAT"), (new IDVariant(" "))), BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECCOMDEENDA")), (new IDVariant(" "))), BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECPROSIENDA"))));
    }
    if (SectionID==BUK_CERSOSDIIMLI_SEC_INTEGRUPBENE)
    {
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_BENEFICIARIO, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(BUK_CERSOSDIIMLI.BoxToolTip(BUK_CERSOSDIIMLI_RPTBOX_BENEFICIARIO))), BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "REBERASOESEE")), (new IDVariant(" "))), ((BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECBENCODFIS").equals((new IDVariant())))?(new IDVariant()):IDL.Add(IDL.Add((new IDVariant("(")), BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECBENCODFIS")), (new IDVariant(")"))))), (new IDVariant(" "))), (new IDVariant("dipendente di codesto Ente i sottoindicati importi:")))));
    }
    if (SectionID==BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD)
    {
    }
    if (SectionID==BUK_CERSOSDIIMLI_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA)
    {
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTSRTICISIC, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"TOTALEIMPONI")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTSRTIICIS1, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"TOTAIMPOINPS")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTSRTIICISI, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"TOTAIMPOINAI")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTSRTRICIS1, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"TOTARITEIRPE")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTSRTRICIS2, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"TOTARITEINPS")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTSRTRICISI, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"TOTARITEINAI")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTSRTINSCIS, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"TOTIMPNONSOG")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTSRTRIECI1, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"TOTRITINPENT")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTSRTRIECIS, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"TOTRITINAENT")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTSRIRCISIC, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"IMPONIBILREG")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTSRICCISIC, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"IMPONIBILCOM")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTMRARCISIC, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_MAX,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"ALIQUOTAREG")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTMRACCISIC, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_MAX,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"ALIQUOTACOM")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTSRTRACISI, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"TOTALRITEADD")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTSRTRACCIS, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"TOTRITADDCOM")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_PGTSRTRCPCIS, new IDVariant(BUK_CERSOSDIIMLI.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA,"TOTRITCASPRO")));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_FNVRSICISICS, new IDVariant(IDL.Add(IDL.Format(IDL.NullValue(BUK_CERSOSDIIMLI.GetReportColumn(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "RECORSOMMIVA"),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm), (new IDVariant(BUK_CERSOSDIIMLI.BoxToolTip(BUK_CERSOSDIIMLI_RPTBOX_BOXIVA))))));
    }
    if (SectionID==BUK_CERSOSDIIMLI_SEC_PIEDGRUNOENT)
    {
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_MODALIVERSAM, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(BUK_CERSOSDIIMLI.BoxToolTip(BUK_CERSOSDIIMLI_RPTBOX_MODALIVERSAM))), ((IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).compareTo((new IDVariant(2005)), true)>=0)?(new IDVariant("I.r.pe.f./Ires")):(new IDVariant("I.r.pe.f./I.r.pe.g.")))), (new IDVariant(BUK_CERSOSDIIMLI.BoxToolTip(BUK_CERSOSDIIMLI_RPTBOX_ESVCLMPDDPRN)))), ((IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DATENTTIPESA, 0).equals((new IDVariant("C"))))?(new IDVariant("il Concessionario per la riscossione dei tributi")):((IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DATENTTIPESA, 0).equals((new IDVariant("T"))))?(new IDVariant("Tesoreria Provinciale dello Stato")):(new IDVariant("Agenzia delle Entrate"))))), (new IDVariant(" "))), IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DATIENTEESAT, 0))));
    }
    if (SectionID==BUK_CERSOSDIIMLI_SEC_PIEGRUNOENPR)
    {
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_LIDCINPSESVC, new IDVariant(IDL.Add(IDL.Add(IDL.Add((new IDVariant(BUK_CERSOSDIIMLI.BoxToolTip(BUK_CERSOSDIIMLI_RPTBOX_LIDCINPSESVC))), IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DATENTSEDINP, 0)), (new IDVariant(" "))), (new IDVariant("Gestione Lavoratori Autonomi")))));
    }
    if (SectionID==BUK_CERSOSDIIMLI_SEC_PIEDGRUPFIRM)
    {
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_NOMOGGFIRRI1, new IDVariant(IMDB.Value(IMDBDef5.TBL_PARAMESTAM28, IMDBDef5.FLD_PARAMESTAM28_NOMOGGFIRRI1, 0)));
      BUK_CERSOSDIIMLI.set_SpanValue(BUK_CERSOSDIIMLI_SPAN_NOMOGGFIRRI2, new IDVariant(IMDB.Value(IMDBDef5.TBL_PARAMESTAM28, IMDBDef5.FLD_PARAMESTAM28_NOMOGGFIRRI2, 0)));
    }
    if (SectionID==BUK_CERSOSDIIMLI_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_CERSOSDIIMLI_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA)
    {
      BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA_OnAfterFormattingSection();
    }
  }

  private void BUK_CERSOSDIIMLI_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CERSOSDIIMLI_MST_CERSOSDIIMMA)
    {
      BUK_CERSOSDIIMLI_MST_CERSOSDIIMMA_OnFormattingPage();
    }
  }

  private void BUK_CERSOSDIIMLI_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CERSOSDIIMLI_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CERSOSDIIMLI_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CERSOSDIIMLI_OnPreview()
  {
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMESTAMPA_Init()
  {

    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA1, "FB9877DB-4205-483D-9561-41877871DF6C");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA1, "Firma Riga 1");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA1, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA1, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA2, "08BD3C10-2030-4B56-9321-B2D52292B47D");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA2, "Firma Riga 2");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA2, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA2, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, "88B811FD-E825-4B42-B400-ABDD719586EB");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, "Verranno inviati i seguenti certificati");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, "7FA13F37-18CD-4F7F-BAC8-FA9D74A4BF5D");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, "Invia");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, 0, "button1.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMESTAMPA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA1, MyGlb.PANEL_LIST, 4, 164, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA1, MyGlb.PANEL_LIST, 96);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA1, MyGlb.PANEL_LIST, 2);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA1, MyGlb.PANEL_LIST, "Firma Riga 1");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA1, MyGlb.PANEL_FORM, 4, 4, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA1, MyGlb.PANEL_FORM, 96);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA1, MyGlb.PANEL_FORM, 2);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA1, MyGlb.PANEL_FORM, "Firma Riga 1");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_FIRMARIGA1, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_FIRMARIGA1, PPQRY_PARAMESTAM25, "A.NOMOGGFIRRI1", "NOMOGGFIRRI1", 5, 200, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA2, MyGlb.PANEL_LIST, 4, 200, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA2, MyGlb.PANEL_LIST, 96);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA2, MyGlb.PANEL_LIST, 2);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA2, MyGlb.PANEL_LIST, "Firma Riga 2");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA2, MyGlb.PANEL_FORM, 4, 28, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA2, MyGlb.PANEL_FORM, 96);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA2, MyGlb.PANEL_FORM, 2);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_FIRMARIGA2, MyGlb.PANEL_FORM, "Firma Riga 2");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_FIRMARIGA2, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_FIRMARIGA2, PPQRY_PARAMESTAM25, "A.NOMOGGFIRRI2", "NOMOGGFIRRI2", 5, 200, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, MyGlb.PANEL_LIST, 16, 12, 540, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, MyGlb.PANEL_LIST, 3);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, MyGlb.PANEL_FORM, 16, 16, 224, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICVERRINVI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ETICVERRINVI, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ETICVERRINVI, -1, "", "ETICVERRINVI", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.PANEL_LIST, 676, 20, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.PANEL_FORM, 248, 12, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ETICHETINVIA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ETICHETINVIA, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ETICHETINVIA, -1, "", "ETICHETINVIA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMESTAMPA_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMESTAMPA.SetIMDB(IMDB, "PQRY_PARAMESTAM25", true);
    PAN_PARAMESTAMPA.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMESTAMPA.SetQueryIMDB(PPQRY_PARAMESTAM25, IMDBDef15.PQRY_PARAMESTAM25_RS, IMDBDef5.TBL_PARAMESTAM28);
    JustLoaded = true;
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_FIRMARIGA1, IMDBDef5.FLD_PARAMESTAM28_NOMOGGFIRRI1);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_FIRMARIGA2, IMDBDef5.FLD_PARAMESTAM28_NOMOGGFIRRI2);
    PAN_PARAMESTAMPA.SetMasterTable(0, "PARAMESTAM28");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMESTAMPA.Status() == 2)
    {
      int oldListQBE = PAN_PARAMESTAMPA.iUseListQBE;
      PAN_PARAMESTAMPA.iUseListQBE = 0;
      PAN_PARAMESTAMPA.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMESTAMPA.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMESTAMPA.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CERSOSDIIMLI_MST_CERSOSDIIMMA_Init()
  {
    BUK_CERSOSDIIMLI.InitMastro(BUK_CERSOSDIIMLI_MST_CERSOSDIIMMA, 3, 21000, 29700, 1, 1, 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_MST_CERSOSDIIMMA, "90628EC3-074E-4120-99EF-F56D91141B4E");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_MST_CERSOSDIIMMA, "CERSOSDIIMMA");
    BUK_CERSOSDIIMLI.InitMastroBox(BUK_CERSOSDIIMLI_MST_CERSOSDIIMMA, BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA, 1000, 1000, 19000, 27400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA, "6028AB30-7E7D-42A1-A68C-927D6381B2CD");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
  }

  private void BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE_InitQuery() { BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE_InitQuery(true, true); }
  private void BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  SUM(NVL(A.RITENUTE_IRPEF, 0)) as TOTARITEIRPE, ");
      SQL.append("  A.CAUSALE_IRPEF as RECLIQCAUIRP, ");
      SQL.append("  A.ALIQUOTA as RECORLIQALIQ, ");
      SQL.append("  SUM(NVL(A.IMPONIBILE, 0)) as TOTALEIMPONI, ");
      SQL.append("  SUM(NVL(A.IMPORTO_NON_SOG, 0)) as TOTIMPNONSOG, ");
      SQL.append("  A.ALIQUOTA_INPS as RECLIQALIINP, ");
      SQL.append("  SUM(A.IMPONIBILE_INPS) as TOTAIMPOINPS, ");
      SQL.append("  SUM(A.RITENUTE_INPS) as TOTARITEINPS, ");
      SQL.append("  C.DESCRIZIONE as RECORT62DESC, ");
      SQL.append("  C.ARTICOLO as RECORT62ARTI, ");
      SQL.append("  SUM(NVL(A.RITENUTE_ADD, 0)) as TOTALRITEADD, ");
      SQL.append("  NVL(SUM(NVL(A.IMPONIBILE, 0) * DECODE(A.RITENUTE_ADD, to_number(NULL), 0, 1)), 0) as IMPONIBILREG, ");
      SQL.append("  MAX(NVL(A.ALIQUOTA_ADD, 0)) as ALIQUOTAREG, ");
      SQL.append("  NVL(SUM(NVL(A.IMPONIBILE, 0) * DECODE(A.RITENUTE_ADD_COM, to_number(NULL), 0, 1)), 0) as IMPONIBILCOM, ");
      SQL.append("  MAX(NVL(A.ALIQUOTA_ADD_COM, 0)) as ALIQUOTACOM, ");
      SQL.append("  SUM(NVL(A.RITENUTE_ADD_COM, 0)) as TOTRITADDCOM, ");
      SQL.append("  SUM(NVL(A.RITENUTE_INPS_CE, 0)) as TOTRITINPENT, ");
      SQL.append("  SUM(NVL(A.RITENUTE_CASSE_PROF, 0)) as TOTRITCASPRO, ");
      SQL.append("  SUM(A.IMPONIBILE_INAIL) as TOTAIMPOINAI, ");
      SQL.append("  SUM(A.RITENUTE_INAIL) as TOTARITEINAI, ");
      SQL.append("  A.ALIQUOTA_INAIL as RECLIQALIINA, ");
      SQL.append("  SUM(NVL(A.RITENUTE_INAIL_CE, 0)) as TOTRITINAENT, ");
      SQL.append("  MAX(DECODE(C.TIPO_RITENUTA, NULL, NULL, DECODE(C.TIPO_RITENUTA, 'A', 'Ritenute d''Acconto', 'Ritenute d''Imposta'))) as RECORTIPORIT, ");
      SQL.append("  MAX(NVL(A_GET_IVA_RIT(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI214.PARAMMANDDAL~~,~~PQRY_PARAMETRI214.PARAMMANDAAL~~,A.BENEFICIARIO,TO_CHAR ( A.CODICE ),'E'), 0)) as RECORSOMMIVA, ");
      SQL.append("  LPAD(TO_CHAR ( D.ENTE_DATORE_LAV ), 6, SUBSTR('0', 1, 1)) || ' - ' || LPAD(TO_CHAR ( A.BENEFICIARIO ), 6, SUBSTR('0', 1, 1)) as RECORAGGBENE, ");
      SQL.append("  F.CODICE_FISCALE as RECOCODIFISC, ");
      SQL.append("  F.PARTITA_IVA as RECBENPARIVA, ");
      SQL.append("  F.RAGIONE_SOCIALE_ESTESA as REBERASOEEDE, ");
      SQL.append("  NVL(F.DOMICILIO, F.INDIRIZZO) as RECINDENTDAT, ");
      SQL.append("  TO_CHAR ( NVL(F.CAP_DOMICILIO, F.CAP) ) as RECCAPENTDAT, ");
      SQL.append("  D.CODICE_FISCALE as RECBENCODFIS, ");
      SQL.append("  D.RAGIONE_SOCIALE_ESTESA as REBERASOESEE, ");
      SQL.append("  G.COMUNE as RECOCOMCOMEE, ");
      SQL.append("  G.DENOMINAZIONE as RECCOMDEENDA, ");
      SQL.append("  H.SIGLA as RECPROSIENDA, ");
      SQL.append("  to_date(NULL) as RECBENDDATNA, ");
      SQL.append("  to_number(NULL) as RECCOMCONAEE, ");
      SQL.append("  NULL as RECCOMDENAEE, ");
      SQL.append("  NULL as RECPROSINAEE, ");
      SQL.append("  A.BENEFICIARIO as RECOLIQBENEE ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  MAN B, ");
      SQL.append("  T62 C, ");
      SQL.append("  BEN D, ");
      SQL.append("  BEN F, ");
      SQL.append("  AD4_COMUNI G, ");
      SQL.append("  AD4_PROVINCIE H ");
      SQL.append("where (D.CODICE = A.BENEFICIARIO) ");
      SQL.append("and   (A.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (A.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append("and   (A.CAUSALE_IRPEF = C.CODICE) ");
      SQL.append("and   (NOT ((A.CODICE IS NULL))) ");
      SQL.append("and   (NOT ((A.BENEFICIARIO IS NULL))) ");
      SQL.append("and   (C.TIPO_CERT = 'E') ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'M') ");
      SQL.append("and   (~~PQRY_PARAMETRI214.PARAMPERENTI~~ = 'SI') ");
      SQL.append("and   (D.ENTE_DATORE_LAV = NVL(~~PQRY_PARAMETRI214.PARACODIBENE~~, NVL(D.ENTE_DATORE_LAV, -1))) ");
      SQL.append("and   (A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((B.D_DATA_MAND BETWEEN ~~PQRY_PARAMETRI214.PARAMMANDDAL~~ AND ~~PQRY_PARAMETRI214.PARAMMANDAAL~~)) ");
      SQL.append("and   (B.D_DATA_MAND = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(E.D_DATA_MAND) ");
      SQL.append("from ");
      SQL.append("  MAN E ");
      SQL.append("where (E.ANNO_MAND = B.ANNO_MAND) ");
      SQL.append("and   (E.NUMERO_MAND = B.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("and   (NVL(A.CODICE, -1) = DECODE(~~PQRY_PARAMETRI214.PARAMCODICE~~, -1, NVL(A.CODICE, -1), ~~PQRY_PARAMETRI214.PARAMCODICE~~)) ");
      SQL.append("and   (F.CODICE = D.ENTE_DATORE_LAV) ");
      SQL.append("and   (G.COMUNE(+) = NVL(F.COMUNE_DOMICILIO, F.COMUNE)) ");
      SQL.append("and   (G.PROVINCIA_STATO(+) = NVL(F.PROVINCIA_DOMICILIO, F.PROVINCIA)) ");
      SQL.append("and   (H.PROVINCIA(+) = NVL(F.PROVINCIA_DOMICILIO, F.PROVINCIA)) ");
      SQL.append("and   (((F.INVIO_STAMPE IS NULL) AND ~~PQRY_PARAMETRI214.PARATIPOELAB~~ = 2) OR (NOT ((F.INVIO_STAMPE IS NULL)) AND ~~PQRY_PARAMETRI214.PARATIPOELAB~~ = 3) OR (~~PQRY_PARAMETRI214.PARATIPOELAB~~ = 1)) ");
      SQL.append("group by ");
      SQL.append("  LPAD(TO_CHAR ( D.ENTE_DATORE_LAV ), 6, SUBSTR('0', 1, 1)) || ' - ' || LPAD(TO_CHAR ( A.BENEFICIARIO ), 6, SUBSTR('0', 1, 1)), ");
      SQL.append("  A.CAUSALE_IRPEF, ");
      SQL.append("  A.ALIQUOTA, ");
      SQL.append("  A.ALIQUOTA_INPS, ");
      SQL.append("  A.ALIQUOTA_INAIL, ");
      SQL.append("  C.DESCRIZIONE, ");
      SQL.append("  C.ARTICOLO, ");
      SQL.append("  F.CODICE_FISCALE, ");
      SQL.append("  F.PARTITA_IVA, ");
      SQL.append("  F.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  NVL(F.DOMICILIO, F.INDIRIZZO), ");
      SQL.append("  TO_CHAR ( NVL(F.CAP_DOMICILIO, F.CAP) ), ");
      SQL.append("  D.CODICE_FISCALE, ");
      SQL.append("  D.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  G.DENOMINAZIONE, ");
      SQL.append("  H.SIGLA, ");
      SQL.append("  A.BENEFICIARIO, ");
      SQL.append("  G.COMUNE ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  SUM(NVL(I.RITENUTE_IRPEF, 0)), ");
      SQL.append("  I.CAUSALE_IRPEF, ");
      SQL.append("  I.ALIQUOTA, ");
      SQL.append("  SUM(NVL(I.IMPONIBILE, 0)), ");
      SQL.append("  SUM(NVL(I.IMPORTO_NON_SOG, 0)), ");
      SQL.append("  I.ALIQUOTA_INPS, ");
      SQL.append("  SUM(I.IMPONIBILE_INPS), ");
      SQL.append("  SUM(I.RITENUTE_INPS), ");
      SQL.append("  K.DESCRIZIONE, ");
      SQL.append("  K.ARTICOLO, ");
      SQL.append("  SUM(NVL(I.RITENUTE_ADD, 0)), ");
      SQL.append("  NVL(SUM(NVL(I.IMPONIBILE, 0) * DECODE(I.RITENUTE_ADD, to_number(NULL), 0, 1)), 0), ");
      SQL.append("  MAX(NVL(I.ALIQUOTA_ADD, 0)), ");
      SQL.append("  NVL(SUM(NVL(I.IMPONIBILE, 0) * DECODE(I.RITENUTE_ADD_COM, to_number(NULL), 0, 1)), 0), ");
      SQL.append("  MAX(NVL(I.ALIQUOTA_ADD_COM, 0)), ");
      SQL.append("  SUM(NVL(I.RITENUTE_ADD_COM, 0)), ");
      SQL.append("  SUM(NVL(I.RITENUTE_INPS_CE, 0)), ");
      SQL.append("  SUM(NVL(I.RITENUTE_CASSE_PROF, 0)), ");
      SQL.append("  SUM(I.IMPONIBILE_INAIL), ");
      SQL.append("  SUM(I.RITENUTE_INAIL), ");
      SQL.append("  I.ALIQUOTA_INAIL, ");
      SQL.append("  SUM(NVL(I.RITENUTE_INAIL_CE, 0)), ");
      SQL.append("  MAX(DECODE(K.TIPO_RITENUTA, NULL, NULL, DECODE(K.TIPO_RITENUTA, 'A', 'Ritenute d''Acconto', 'Ritenute d''Imposta'))), ");
      SQL.append("  MAX(A_GET_IVA_RIT(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI214.PARAMMANDDAL~~,~~PQRY_PARAMETRI214.PARAMMANDAAL~~,I.BENEFICIARIO,TO_CHAR ( I.CODICE ),'P')), ");
      SQL.append("  LPAD(TO_CHAR ( L.ENTE_DATORE_LAV ), 6, SUBSTR('0', 1, 1)) || ' - ' || LPAD(TO_CHAR ( I.BENEFICIARIO ), 6, SUBSTR('0', 1, 1)), ");
      SQL.append("  M.CODICE_FISCALE, ");
      SQL.append("  M.PARTITA_IVA, ");
      SQL.append("  M.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  NVL(M.DOMICILIO, M.INDIRIZZO), ");
      SQL.append("  TO_CHAR ( NVL(M.CAP_DOMICILIO, M.CAP) ), ");
      SQL.append("  L.CODICE_FISCALE, ");
      SQL.append("  L.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  N.COMUNE, ");
      SQL.append("  N.DENOMINAZIONE, ");
      SQL.append("  O.SIGLA, ");
      SQL.append("  to_date(NULL), ");
      SQL.append("  to_number(NULL), ");
      SQL.append("  NULL, ");
      SQL.append("  NULL, ");
      SQL.append("  I.BENEFICIARIO ");
      SQL.append("from ");
      SQL.append("  LIQ I, ");
      SQL.append("  PAGAMENTI J, ");
      SQL.append("  T62 K, ");
      SQL.append("  BEN L, ");
      SQL.append("  BEN M, ");
      SQL.append("  AD4_COMUNI N, ");
      SQL.append("  AD4_PROVINCIE O ");
      SQL.append("where (L.CODICE = I.BENEFICIARIO) ");
      SQL.append("and   (I.ANNO_MAND = J.ANNO_MAND) ");
      SQL.append("and   (I.NUMERO_MAND = J.NUMERO_MAND) ");
      SQL.append("and   (I.ANNO_LIQ = J.ANNO_LIQ) ");
      SQL.append("and   (I.NUMERO_LIQ = J.NUMERO_LIQ) ");
      SQL.append("and   (I.CAUSALE_IRPEF = K.CODICE) ");
      SQL.append("and   (NOT ((I.CODICE IS NULL))) ");
      SQL.append("and   (NOT ((I.BENEFICIARIO IS NULL))) ");
      SQL.append("and   (K.TIPO_CERT = 'E') ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'P') ");
      SQL.append("and   (~~PQRY_PARAMETRI214.PARAMPERENTI~~ = 'SI') ");
      SQL.append("and   (L.ENTE_DATORE_LAV = NVL(~~PQRY_PARAMETRI214.PARACODIBENE~~, NVL(L.ENTE_DATORE_LAV, -1))) ");
      SQL.append("and   (I.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((J.D_DATA_PAGAM BETWEEN ~~PQRY_PARAMETRI214.PARAMMANDDAL~~ AND ~~PQRY_PARAMETRI214.PARAMMANDAAL~~)) ");
      SQL.append("and   ((J.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(J.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(J.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (J.D_DATA_PAGAM = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(P.D_DATA_PAGAM) ");
      SQL.append("from ");
      SQL.append("  PAGAMENTI P ");
      SQL.append("where ((P.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(J.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(J.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (P.ANNO_MAND = J.ANNO_MAND) ");
      SQL.append("and   (P.NUMERO_MAND = J.NUMERO_MAND) ");
      SQL.append("and   (P.ANNO_LIQ = J.ANNO_LIQ) ");
      SQL.append("and   (P.NUMERO_LIQ = J.NUMERO_LIQ) ");
      SQL.append(")) ");
      SQL.append("and   (NVL(I.CODICE, -1) = DECODE(~~PQRY_PARAMETRI214.PARAMCODICE~~, -1, NVL(I.CODICE, -1), ~~PQRY_PARAMETRI214.PARAMCODICE~~)) ");
      SQL.append("and   (M.CODICE = L.ENTE_DATORE_LAV) ");
      SQL.append("and   (N.COMUNE(+) = NVL(M.COMUNE_DOMICILIO, M.COMUNE)) ");
      SQL.append("and   (N.PROVINCIA_STATO(+) = NVL(M.PROVINCIA_DOMICILIO, M.PROVINCIA)) ");
      SQL.append("and   (O.PROVINCIA(+) = NVL(M.PROVINCIA_DOMICILIO, M.PROVINCIA)) ");
      SQL.append("and   (((M.INVIO_STAMPE IS NULL) AND ~~PQRY_PARAMETRI214.PARATIPOELAB~~ = 2) OR (NOT ((M.INVIO_STAMPE IS NULL)) AND ~~PQRY_PARAMETRI214.PARATIPOELAB~~ = 3) OR (~~PQRY_PARAMETRI214.PARATIPOELAB~~ = 1)) ");
      SQL.append("group by ");
      SQL.append("  I.CAUSALE_IRPEF, ");
      SQL.append("  I.ALIQUOTA, ");
      SQL.append("  I.ALIQUOTA_INPS, ");
      SQL.append("  K.DESCRIZIONE, ");
      SQL.append("  K.ARTICOLO, ");
      SQL.append("  I.ALIQUOTA_INAIL, ");
      SQL.append("  LPAD(TO_CHAR ( L.ENTE_DATORE_LAV ), 6, SUBSTR('0', 1, 1)) || ' - ' || LPAD(TO_CHAR ( I.BENEFICIARIO ), 6, SUBSTR('0', 1, 1)), ");
      SQL.append("  M.CODICE_FISCALE, ");
      SQL.append("  M.PARTITA_IVA, ");
      SQL.append("  M.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  NVL(M.DOMICILIO, M.INDIRIZZO), ");
      SQL.append("  TO_CHAR ( NVL(M.CAP_DOMICILIO, M.CAP) ), ");
      SQL.append("  L.CODICE_FISCALE, ");
      SQL.append("  L.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  N.COMUNE, ");
      SQL.append("  N.DENOMINAZIONE, ");
      SQL.append("  O.SIGLA, ");
      SQL.append("  I.BENEFICIARIO ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  SUM(NVL(Q.RITENUTE_IRPEF, 0)), ");
      SQL.append("  Q.CAUSALE_IRPEF, ");
      SQL.append("  Q.ALIQUOTA, ");
      SQL.append("  SUM(NVL(Q.IMPONIBILE, 0)), ");
      SQL.append("  SUM(NVL(Q.IMPORTO_NON_SOG, 0)), ");
      SQL.append("  Q.ALIQUOTA_INPS, ");
      SQL.append("  SUM(Q.IMPONIBILE_INPS), ");
      SQL.append("  SUM(Q.RITENUTE_INPS), ");
      SQL.append("  S.DESCRIZIONE, ");
      SQL.append("  S.ARTICOLO, ");
      SQL.append("  SUM(NVL(Q.RITENUTE_ADD, 0)), ");
      SQL.append("  NVL(SUM(NVL(Q.IMPONIBILE, 0) * DECODE(Q.RITENUTE_ADD, to_number(NULL), 0, 1)), 0), ");
      SQL.append("  MAX(NVL(Q.ALIQUOTA_ADD, 0)), ");
      SQL.append("  NVL(SUM(NVL(Q.IMPONIBILE, 0) * DECODE(Q.RITENUTE_ADD_COM, to_number(NULL), 0, 1)), 0), ");
      SQL.append("  MAX(NVL(Q.ALIQUOTA_ADD_COM, 0)), ");
      SQL.append("  SUM(NVL(Q.RITENUTE_ADD_COM, 0)), ");
      SQL.append("  SUM(NVL(Q.RITENUTE_INPS_CE, 0)), ");
      SQL.append("  SUM(NVL(Q.RITENUTE_CASSE_PROF, 0)), ");
      SQL.append("  SUM(Q.IMPONIBILE_INAIL), ");
      SQL.append("  SUM(Q.RITENUTE_INAIL), ");
      SQL.append("  Q.ALIQUOTA_INAIL, ");
      SQL.append("  SUM(NVL(Q.RITENUTE_INAIL_CE, 0)), ");
      SQL.append("  MAX(DECODE(S.TIPO_RITENUTA, NULL, NULL, DECODE(S.TIPO_RITENUTA, 'A', 'Ritenute d''Acconto', 'Ritenute d''Imposta'))), ");
      SQL.append("  MAX(A_GET_IVA_RIT(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI214.PARAMMANDDAL~~,~~PQRY_PARAMETRI214.PARAMMANDAAL~~,Q.BENEFICIARIO,TO_CHAR ( Q.CODICE ),'E')), ");
      SQL.append("  LPAD(TO_CHAR ( Q.BENEFICIARIO ), 6, SUBSTR('0', 1, 1)), ");
      SQL.append("  T.CODICE_FISCALE, ");
      SQL.append("  T.PARTITA_IVA, ");
      SQL.append("  T.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  NVL(T.DOMICILIO, T.INDIRIZZO), ");
      SQL.append("  TO_CHAR ( NVL(T.CAP_DOMICILIO, T.CAP) ), ");
      SQL.append("  NULL, ");
      SQL.append("  NULL, ");
      SQL.append("  U.COMUNE, ");
      SQL.append("  U.DENOMINAZIONE, ");
      SQL.append("  V.SIGLA, ");
      SQL.append("  T.D_DATA_NASCITA, ");
      SQL.append("  W.COMUNE, ");
      SQL.append("  W.DENOMINAZIONE, ");
      SQL.append("  X.SIGLA, ");
      SQL.append("  Q.BENEFICIARIO ");
      SQL.append("from ");
      SQL.append("  LIQ Q, ");
      SQL.append("  MAN R, ");
      SQL.append("  T62 S, ");
      SQL.append("  BEN T, ");
      SQL.append("  AD4_COMUNI U, ");
      SQL.append("  AD4_PROVINCIE V, ");
      SQL.append("  AD4_COMUNI W, ");
      SQL.append("  AD4_PROVINCIE X ");
      SQL.append("where (Q.ANNO_MAND = R.ANNO_MAND) ");
      SQL.append("and   (Q.NUMERO_MAND = R.NUMERO_MAND) ");
      SQL.append("and   (Q.CAUSALE_IRPEF = S.CODICE) ");
      SQL.append("and   (NOT ((Q.CODICE IS NULL))) ");
      SQL.append("and   (NOT ((Q.BENEFICIARIO IS NULL))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'M') ");
      SQL.append("and   (~~PQRY_PARAMETRI214.PARAMPERENTI~~ = 'NO') ");
      SQL.append("and   (Q.BENEFICIARIO = NVL(~~PQRY_PARAMETRI214.PARACODIBENE~~, NVL(Q.BENEFICIARIO, -1))) ");
      SQL.append("and   (Q.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((R.D_DATA_MAND BETWEEN ~~PQRY_PARAMETRI214.PARAMMANDDAL~~ AND ~~PQRY_PARAMETRI214.PARAMMANDAAL~~)) ");
      SQL.append("and   (R.D_DATA_MAND = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(Y.D_DATA_MAND) ");
      SQL.append("from ");
      SQL.append("  MAN Y ");
      SQL.append("where (Y.ANNO_MAND = R.ANNO_MAND) ");
      SQL.append("and   (Y.NUMERO_MAND = R.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("and   (NVL(Q.CODICE, -1) = DECODE(~~PQRY_PARAMETRI214.PARAMCODICE~~, -1, NVL(Q.CODICE, -1), ~~PQRY_PARAMETRI214.PARAMCODICE~~)) ");
      SQL.append("and   (T.CODICE = Q.BENEFICIARIO) ");
      SQL.append("and   (U.COMUNE(+) = NVL(T.COMUNE_DOMICILIO, T.COMUNE)) ");
      SQL.append("and   (U.PROVINCIA_STATO(+) = NVL(T.PROVINCIA_DOMICILIO, T.PROVINCIA)) ");
      SQL.append("and   (V.PROVINCIA(+) = NVL(T.PROVINCIA_DOMICILIO, T.PROVINCIA)) ");
      SQL.append("and   (W.COMUNE(+) = T.COMUNE_NASCITA) ");
      SQL.append("and   (W.PROVINCIA_STATO(+) = T.PROVINCIA_NASCITA) ");
      SQL.append("and   (X.PROVINCIA(+) = T.PROVINCIA_NASCITA) ");
      SQL.append("and   (((T.INVIO_STAMPE IS NULL) AND ~~PQRY_PARAMETRI214.PARATIPOELAB~~ = 2) OR (NOT ((T.INVIO_STAMPE IS NULL)) AND ~~PQRY_PARAMETRI214.PARATIPOELAB~~ = 3) OR (~~PQRY_PARAMETRI214.PARATIPOELAB~~ = 1)) ");
      SQL.append("group by ");
      SQL.append("  Q.CAUSALE_IRPEF, ");
      SQL.append("  Q.ALIQUOTA, ");
      SQL.append("  Q.ALIQUOTA_INPS, ");
      SQL.append("  S.DESCRIZIONE, ");
      SQL.append("  S.ARTICOLO, ");
      SQL.append("  Q.ALIQUOTA_INAIL, ");
      SQL.append("  LPAD(TO_CHAR ( Q.BENEFICIARIO ), 6, SUBSTR('0', 1, 1)), ");
      SQL.append("  T.CODICE_FISCALE, ");
      SQL.append("  T.PARTITA_IVA, ");
      SQL.append("  T.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  NVL(T.DOMICILIO, T.INDIRIZZO), ");
      SQL.append("  TO_CHAR ( NVL(T.CAP_DOMICILIO, T.CAP) ), ");
      SQL.append("  U.COMUNE, ");
      SQL.append("  U.DENOMINAZIONE, ");
      SQL.append("  V.SIGLA, ");
      SQL.append("  T.D_DATA_NASCITA, ");
      SQL.append("  W.COMUNE, ");
      SQL.append("  W.DENOMINAZIONE, ");
      SQL.append("  X.SIGLA, ");
      SQL.append("  Q.BENEFICIARIO ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  SUM(NVL(Z.RITENUTE_IRPEF, 0)), ");
      SQL.append("  Z.CAUSALE_IRPEF, ");
      SQL.append("  Z.ALIQUOTA, ");
      SQL.append("  SUM(NVL(Z.IMPONIBILE, 0)), ");
      SQL.append("  SUM(NVL(Z.IMPORTO_NON_SOG, 0)), ");
      SQL.append("  Z.ALIQUOTA_INPS, ");
      SQL.append("  SUM(Z.IMPONIBILE_INPS), ");
      SQL.append("  SUM(Z.RITENUTE_INPS), ");
      SQL.append("  B1.DESCRIZIONE, ");
      SQL.append("  B1.ARTICOLO, ");
      SQL.append("  SUM(NVL(Z.RITENUTE_ADD, 0)), ");
      SQL.append("  NVL(SUM(NVL(Z.IMPONIBILE, 0) * DECODE(Z.RITENUTE_ADD, to_number(NULL), 0, 1)), 0), ");
      SQL.append("  MAX(NVL(Z.ALIQUOTA_ADD, 0)), ");
      SQL.append("  NVL(SUM(NVL(Z.IMPONIBILE, 0) * DECODE(Z.RITENUTE_ADD_COM, to_number(NULL), 0, 1)), 0), ");
      SQL.append("  MAX(NVL(Z.ALIQUOTA_ADD_COM, 0)), ");
      SQL.append("  SUM(NVL(Z.RITENUTE_ADD_COM, 0)), ");
      SQL.append("  SUM(NVL(Z.RITENUTE_INPS_CE, 0)), ");
      SQL.append("  SUM(NVL(Z.RITENUTE_CASSE_PROF, 0)), ");
      SQL.append("  SUM(Z.IMPONIBILE_INAIL), ");
      SQL.append("  SUM(Z.RITENUTE_INAIL), ");
      SQL.append("  Z.ALIQUOTA_INAIL, ");
      SQL.append("  SUM(NVL(Z.RITENUTE_INAIL_CE, 0)), ");
      SQL.append("  MAX(DECODE(B1.TIPO_RITENUTA, NULL, NULL, DECODE(B1.TIPO_RITENUTA, 'A', 'Ritenute d''Acconto', 'Ritenute d''Imposta'))), ");
      SQL.append("  MAX(A_GET_IVA_RIT(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI214.PARAMMANDDAL~~,~~PQRY_PARAMETRI214.PARAMMANDAAL~~,Z.BENEFICIARIO,TO_CHAR ( Z.CODICE ),'P')), ");
      SQL.append("  LPAD(TO_CHAR ( C1.ENTE_DATORE_LAV ), 6, SUBSTR('0', 1, 1)) || ' - ' || LPAD(TO_CHAR ( Z.BENEFICIARIO ), 6, SUBSTR('0', 1, 1)), ");
      SQL.append("  C1.CODICE_FISCALE, ");
      SQL.append("  C1.PARTITA_IVA, ");
      SQL.append("  C1.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  NVL(C1.DOMICILIO, C1.INDIRIZZO), ");
      SQL.append("  TO_CHAR ( NVL(C1.CAP_DOMICILIO, C1.CAP) ), ");
      SQL.append("  NULL, ");
      SQL.append("  NULL, ");
      SQL.append("  D1.COMUNE, ");
      SQL.append("  D1.DENOMINAZIONE, ");
      SQL.append("  E1.SIGLA, ");
      SQL.append("  C1.D_DATA_NASCITA, ");
      SQL.append("  F1.COMUNE, ");
      SQL.append("  F1.DENOMINAZIONE, ");
      SQL.append("  G1.SIGLA, ");
      SQL.append("  Z.BENEFICIARIO ");
      SQL.append("from ");
      SQL.append("  LIQ Z, ");
      SQL.append("  PAGAMENTI A1, ");
      SQL.append("  T62 B1, ");
      SQL.append("  BEN C1, ");
      SQL.append("  AD4_COMUNI D1, ");
      SQL.append("  AD4_PROVINCIE E1, ");
      SQL.append("  AD4_COMUNI F1, ");
      SQL.append("  AD4_PROVINCIE G1 ");
      SQL.append("where (Z.ANNO_MAND = A1.ANNO_MAND) ");
      SQL.append("and   (Z.NUMERO_MAND = A1.NUMERO_MAND) ");
      SQL.append("and   (Z.ANNO_LIQ = A1.ANNO_LIQ) ");
      SQL.append("and   (Z.NUMERO_LIQ = A1.NUMERO_LIQ) ");
      SQL.append("and   (Z.CAUSALE_IRPEF = B1.CODICE) ");
      SQL.append("and   (NOT ((Z.CODICE IS NULL))) ");
      SQL.append("and   (NOT ((Z.BENEFICIARIO IS NULL))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'P') ");
      SQL.append("and   (~~PQRY_PARAMETRI214.PARAMPERENTI~~ = 'NO') ");
      SQL.append("and   (C1.CODICE = NVL(~~PQRY_PARAMETRI214.PARACODIBENE~~, NVL(C1.CODICE, -1))) ");
      SQL.append("and   (Z.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   ((A1.D_DATA_PAGAM BETWEEN ~~PQRY_PARAMETRI214.PARAMMANDDAL~~ AND ~~PQRY_PARAMETRI214.PARAMMANDAAL~~)) ");
      SQL.append("and   ((A1.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(A1.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(A1.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (A1.D_DATA_PAGAM = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(H1.D_DATA_PAGAM) ");
      SQL.append("from ");
      SQL.append("  PAGAMENTI H1 ");
      SQL.append("where ((H1.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(A1.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(A1.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (H1.ANNO_MAND = A1.ANNO_MAND) ");
      SQL.append("and   (H1.NUMERO_MAND = A1.NUMERO_MAND) ");
      SQL.append("and   (H1.ANNO_LIQ = A1.ANNO_LIQ) ");
      SQL.append("and   (H1.NUMERO_LIQ = A1.NUMERO_LIQ) ");
      SQL.append(")) ");
      SQL.append("and   (NVL(Z.CODICE, -1) = DECODE(~~PQRY_PARAMETRI214.PARAMCODICE~~, -1, NVL(Z.CODICE, -1), ~~PQRY_PARAMETRI214.PARAMCODICE~~)) ");
      SQL.append("and   (C1.CODICE = Z.BENEFICIARIO) ");
      SQL.append("and   (D1.COMUNE(+) = NVL(C1.COMUNE_DOMICILIO, C1.COMUNE)) ");
      SQL.append("and   (D1.PROVINCIA_STATO(+) = NVL(C1.PROVINCIA_DOMICILIO, C1.PROVINCIA)) ");
      SQL.append("and   (E1.PROVINCIA(+) = NVL(C1.PROVINCIA_DOMICILIO, C1.PROVINCIA)) ");
      SQL.append("and   (F1.COMUNE(+) = C1.COMUNE_NASCITA) ");
      SQL.append("and   (F1.PROVINCIA_STATO(+) = C1.PROVINCIA_NASCITA) ");
      SQL.append("and   (G1.PROVINCIA(+) = C1.PROVINCIA_NASCITA) ");
      SQL.append("and   (((C1.INVIO_STAMPE IS NULL) AND ~~PQRY_PARAMETRI214.PARATIPOELAB~~ = 2) OR (NOT ((C1.INVIO_STAMPE IS NULL)) AND ~~PQRY_PARAMETRI214.PARATIPOELAB~~ = 3) OR (~~PQRY_PARAMETRI214.PARATIPOELAB~~ = 1)) ");
      SQL.append("group by ");
      SQL.append("  Z.CAUSALE_IRPEF, ");
      SQL.append("  Z.ALIQUOTA, ");
      SQL.append("  Z.ALIQUOTA_INPS, ");
      SQL.append("  B1.DESCRIZIONE, ");
      SQL.append("  B1.ARTICOLO, ");
      SQL.append("  Z.ALIQUOTA_INAIL, ");
      SQL.append("  LPAD(TO_CHAR ( C1.ENTE_DATORE_LAV ), 6, SUBSTR('0', 1, 1)) || ' - ' || LPAD(TO_CHAR ( Z.BENEFICIARIO ), 6, SUBSTR('0', 1, 1)), ");
      SQL.append("  C1.CODICE_FISCALE, ");
      SQL.append("  C1.PARTITA_IVA, ");
      SQL.append("  C1.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  NVL(C1.DOMICILIO, C1.INDIRIZZO), ");
      SQL.append("  TO_CHAR ( NVL(C1.CAP_DOMICILIO, C1.CAP) ), ");
      SQL.append("  D1.COMUNE, ");
      SQL.append("  D1.DENOMINAZIONE, ");
      SQL.append("  E1.SIGLA, ");
      SQL.append("  C1.D_DATA_NASCITA, ");
      SQL.append("  F1.COMUNE, ");
      SQL.append("  F1.DENOMINAZIONE, ");
      SQL.append("  G1.SIGLA, ");
      SQL.append("  Z.BENEFICIARIO ");
      SQL.append("order by 25 ");
      BUK_CERSOSDIIMLI.SetReportQuery(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "05A4C4DE-E669-48C5-9968-2D5632A56011");
      if (BUK_CERSOSDIIMLI.FindObjByID(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT) != null)
        BUK_CERSOSDIIMLI.AddReportGroup(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, "RECORAGGBENE");
      if (BUK_CERSOSDIIMLI.FindObjByID(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT) != null)
        BUK_CERSOSDIIMLI.AddReportGroup(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, "RECORAGGBENE");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE_Init()
  {
    BUK_CERSOSDIIMLI.InitReport(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, 196865);
    BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE_InitQuery(true, false);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "C3C70672-5125-43BC-80C4-84F9293A85D8");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, "CERSOSDIIMRE");
    BUK_CERSOSDIIMLI.InitSection(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, BUK_CERSOSDIIMLI_SEC_INTESTREPORT, 500, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CERSOSDIIMLI.SetSectionRendersInto(BUK_CERSOSDIIMLI_SEC_INTESTREPORT, BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SEC_INTESTREPORT, "58814D66-28BB-4B0D-8D9A-95E0E952E1B5");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_CERSOSDIIMLI.InitSection(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, 3500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 9240833, "RECORAGGBENE");
    BUK_CERSOSDIIMLI.SetSectionRendersInto(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, "B5DF1DB1-2548-4FD0-8A44-4E40B58ECD24");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, "INTEGRUPDITT");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, BUK_CERSOSDIIMLI_RPTBOX_LOGO, 100, 0, 6900, 1900, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_LOGO, "547A1885-381C-4DA5-8EA2-B92DBACA7C79");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_LOGO, "LOGO");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, BUK_CERSOSDIIMLI_RPTBOX_DATENTCOFIHE, 8100, 200, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_DATENTCOFIHE, "E13A5CF2-10C9-4EFE-A327-D6E9E75748EA");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_DATENTCOFIHE, "DATENTCOFIHE");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_DATENTCOFIHE, BUK_CERSOSDIIMLI_SPAN_CODFISCALE1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Cod. Fiscale:", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_CODFISCALE1, "9DE71842-6952-4AF5-9B54-2208952B1E45");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_CODFISCALE1, "CODFISCALE1");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, BUK_CERSOSDIIMLI_RPTBOX_DATENTCODFIS, 10900, 200, 5100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_DATENTCODFIS, "A31EB450-7FC5-413C-AD9B-2836CF57355D");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_DATENTCODFIS, "DATENTCODFIS");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_DATENTCODFIS, BUK_CERSOSDIIMLI_SPAN_CODFISCALE, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_CODFISCALE, "6B5D63C7-919E-45A4-9B5A-21DBADE231E8");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_CODFISCALE, "CODFISCALE");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, BUK_CERSOSDIIMLI_RPTBOX_DATENTATTHEA, 8100, 900, 2700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_DATENTATTHEA, "C37381A5-24A5-49DB-96DA-DFBCF6459802");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_DATENTATTHEA, "DATENTATTHEA");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_DATENTATTHEA, BUK_CERSOSDIIMLI_SPAN_ATTIVITA1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Attività:", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_ATTIVITA1, "F4D6B547-142D-4AC9-92A7-E62CD4289F3F");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_ATTIVITA1, "ATTIVITA1");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, BUK_CERSOSDIIMLI_RPTBOX_DATIENTEATTI, 10900, 900, 1300, 500, 0, 1, 1, MyGlb.VIS_NORMALA8LEFT, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_DATIENTEATTI, "D82EE289-7EA0-4F77-B321-1D37BE6E59D3");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_DATIENTEATTI, "DATIENTEATTI");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_DATIENTEATTI, BUK_CERSOSDIIMLI_SPAN_ATTIVITA, MyGlb.VIS_NORMALA8LEFT, 5, 8, 0, 271384961, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_ATTIVITA, "60136EA0-FF3B-48E4-BEF6-65F380020EFA");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_ATTIVITA, "ATTIVITA");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, BUK_CERSOSDIIMLI_RPTBOX_DATIENTECOMU, 13900, 1500, 4900, 500, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_DATIENTECOMU, "748D2AD7-C162-4664-ACB4-E8986CC8E635");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_DATIENTECOMU, "DATIENTECOMU");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_DATIENTECOMU, BUK_CERSOSDIIMLI_SPAN_DECTSPDCCSDI, MyGlb.VIS_NORMAA8RIGHT, 5, 131, 0, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_DECTSPDCCSDI, "6832DBF7-0CF7-40C5-8B33-179464CF6CD8");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_DECTSPDCCSDI, "DECTSPDCCSDI");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, BUK_CERSOSDIIMLI_RPTBOX_OGGETTO, 100, 2300, 18700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983297, 322, "OGGETTO: CERTIFICAZIONE COMPENSI ASSOGGETTATI A RITENUTA ANNO ", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_OGGETTO, "20887C75-34A9-4350-991C-5F8EE8F92735");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_OGGETTO, "OGGETTO");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_OGGETTO, BUK_CERSOSDIIMLI_SPAN_OGTOTITOSTSE, MyGlb.VIS_DEFAREPOSTYL, 5, 198, 0, 271384961, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_OGTOTITOSTSE, "EB38B3D4-E25D-4AF6-9348-AABDA92681BA");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_OGTOTITOSTSE, "OGTOTITOSTSE");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, BUK_CERSOSDIIMLI_RPTBOX_COMUNICAZION, 100, 2900, 7000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983297, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_COMUNICAZION, "CDAEEF8B-7DB8-4993-A972-42A9A7E5B0D9");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_COMUNICAZION, "COMUNICAZION");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_COMUNICAZION, BUK_CERSOSDIIMLI_SPAN_COAISDN31ESM, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Comunicazione ai sensi DPR N.322 -1998 e succ. modif.", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_COAISDN31ESM, "56DA576F-BCC4-4986-8119-8B22D9C8AF25");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_COAISDN31ESM, "COAISDN31ESM");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, BUK_CERSOSDIIMLI_RPTBOX_COMUNIAGGIUN, 7200, 2900, 5200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983297, 322, "e art.4 commi 6 ter e quater", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_COMUNIAGGIUN, "F410CC91-0C14-438B-BBE5-D18878FD4F49");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_COMUNIAGGIUN, "COMUNIAGGIUN");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_COMUNIAGGIUN, BUK_CERSOSDIIMLI_SPAN_COMUNIAGGIUN, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271319425, "", "e art.4 commi 6 ter e quater", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_COMUNIAGGIUN, "B0D72C38-00C2-4247-BD97-D7ED9F16008F");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_COMUNIAGGIUN, "COMUNIAGGIUN");
    BUK_CERSOSDIIMLI.InitSection(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, 3700, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGBENE");
    BUK_CERSOSDIIMLI.SetSectionRendersInto(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, "FFFBAB01-BCBE-4E13-B6E5-D10A79FF15AF");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, "INTEGRUPDATO");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, BUK_CERSOSDIIMLI_RPTBOX_PROTOCOLLO, 100, 100, 3900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983297, 322, "Protocollo n. ", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_PROTOCOLLO, "FAA5D0F5-EE58-45FA-8801-71F4A620FC1C");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_PROTOCOLLO, "PROTOCOLLO");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_PROTOCOLLO, BUK_CERSOSDIIMLI_SPAN_PTTTSPNPCSDI, MyGlb.VIS_DEFAREPOSTYL, 5, 198, 0, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PTTTSPNPCSDI, "1C12BBA7-ABC5-4808-85E1-D19AD150D99D");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PTTTSPNPCSDI, "PTTTSPNPCSDI");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, BUK_CERSOSDIIMLI_RPTBOX_VISSOGCOFIHE, 100, 1100, 2900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_VISSOGCOFIHE, "43F42717-BBEB-4636-8166-FF271BE5F84D");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_VISSOGCOFIHE, "VISSOGCOFIHE");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_VISSOGCOFIHE, BUK_CERSOSDIIMLI_SPAN_IERCFCISICSD, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384961, "Codice Fiscale", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_IERCFCISICSD, "F1DA51A6-444A-4D8A-96F7-4F36C432C544");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_IERCFCISICSD, "IERCFCISICSD");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, BUK_CERSOSDIIMLI_RPTBOX_VISSOGCODFIS, 3100, 1100, 3700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_VISSOGCODFIS, "B043B3A4-FD8B-48D4-A202-789DAD00DD5D");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_VISSOGCODFIS, "VISSOGCODFIS");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_VISSOGCODFIS, BUK_CERSOSDIIMLI_SPAN_NVRCFCISICSD, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_NVRCFCISICSD, "10FE7664-E906-4352-809C-E18DA7B5D19B");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_NVRCFCISICSD, "NVRCFCISICSD");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, BUK_CERSOSDIIMLI_RPTBOX_BENDDATNASHE, 100, 1700, 2900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983297, 322, "Data di Nascita", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BENDDATNASHE, "3AF56D02-5F60-45AF-ACA5-C3A8F473D5BD");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BENDDATNASHE, "BENDDATNASHE");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_BENDDATNASHE, BUK_CERSOSDIIMLI_SPAN_IERBDDNCISIC, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384961, "Data di Nascita", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_IERBDDNCISIC, "9C51C618-D486-4ECE-876B-E92AECB5C66C");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_IERBDDNCISIC, "IERBDDNCISIC");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, BUK_CERSOSDIIMLI_RPTBOX_BENDDATANASC, 3100, 1700, 2800, 500, 0, 1, 1, MyGlb.VIS_DATA, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BENDDATANASC, "2057403C-186E-497C-8418-FBE187B6CE28");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BENDDATANASC, "BENDDATANASC");
    BUK_CERSOSDIIMLI.set_BoxAlignment(BUK_CERSOSDIIMLI_RPTBOX_BENDDATANASC, 2);
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_BENDDATANASC, BUK_CERSOSDIIMLI_SPAN_RBDDNCISICSD, MyGlb.VIS_DATA, 8, 0, 0, 271384705, "", "::RECBENDDATNA", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RBDDNCISICSD, "D44CB4B2-7CC3-40D1-817A-1C3B953ACADD");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RBDDNCISICSD, "RBDDNCISICSD");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, BUK_CERSOSDIIMLI_RPTBOX_COMNASDENHEA, 100, 2300, 2900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983297, 322, "Comune di Nascita", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_COMNASDENHEA, "4234287B-D79E-478F-9FC0-EA96C75F8C34");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_COMNASDENHEA, "COMNASDENHEA");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_COMNASDENHEA, BUK_CERSOSDIIMLI_SPAN_IERCDNECISIC, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384961, "Comune di Nascita", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_IERCDNECISIC, "18D9E7B6-9FEC-49FB-B787-1ACC0EEE8DB2");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_IERCDNECISIC, "IERCDNECISIC");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, BUK_CERSOSDIIMLI_RPTBOX_COMUNASCDENO, 3100, 2300, 3700, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_COMUNASCDENO, "86A127C7-BC6C-4DD2-9CFF-DCAC306B0765");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_COMUNASCDENO, "COMUNASCDENO");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_COMUNASCDENO, BUK_CERSOSDIIMLI_SPAN_RCDNECISICSD, MyGlb.VIS_DEFAREPOSTYL, 5, 0, 0, 271384705, "", "::RECCOMDENAEE", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RCDNECISICSD, "D4F1BCEA-2EEA-4B75-8932-F80E98AA477C");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RCDNECISICSD, "RCDNECISICSD");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, BUK_CERSOSDIIMLI_RPTBOX_PRONASSIGHEA, 100, 2900, 2900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983297, 322, "Provincia di Nascita", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_PRONASSIGHEA, "8B8498E6-5152-481A-9CB1-E213A1AFFA8B");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_PRONASSIGHEA, "PRONASSIGHEA");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_PRONASSIGHEA, BUK_CERSOSDIIMLI_SPAN_IERPSNECISIC, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384961, "Provincia di Nascita", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_IERPSNECISIC, "6E77FED7-533B-458E-B4B6-65567BC0EFF5");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_IERPSNECISIC, "IERPSNECISIC");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, BUK_CERSOSDIIMLI_RPTBOX_PROVNASCSIGL, 3100, 2900, 1300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_PROVNASCSIGL, "D5E21788-1E5F-4299-BE97-E7F4051427B2");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_PROVNASCSIGL, "PROVNASCSIGL");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_PROVNASCSIGL, BUK_CERSOSDIIMLI_SPAN_RPSNECISICSD, MyGlb.VIS_DEFAREPOSTYL, 5, 0, 0, 271384705, "", "::RECPROSINAEE", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RPSNECISICSD, "46F94F9E-29F2-4FA6-BA6D-ABFCE397421C");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RPSNECISICSD, "RPSNECISICSD");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, BUK_CERSOSDIIMLI_RPTBOX_SPETTAHEADER, 7800, 1100, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SPETTAHEADER, "64A7F5D8-E5FF-46EE-81A2-9470708567EA");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SPETTAHEADER, "SPETTAHEADER");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SPETTAHEADER, BUK_CERSOSDIIMLI_SPAN_SPETTLE, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Spett.le", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_SPETTLE, "D88ADD25-B401-417D-9B86-7CC34657E6B4");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_SPETTLE, "SPETTLE");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, BUK_CERSOSDIIMLI_RPTBOX_VISOBERSEEDE, 9300, 1100, 9500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_VISOBERSEEDE, "EB27916C-A4A5-4DC6-A3C7-65E78DEF04BE");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_VISOBERSEEDE, "VISOBERSEEDE");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_VISOBERSEEDE, BUK_CERSOSDIIMLI_SPAN_RBRSEEDECISI, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "", "::REBERASOEEDE", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RBRSEEDECISI, "CA8FE37D-FB6E-4422-8895-7ACFBA99B2FE");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RBRSEEDECISI, "RBRSEEDECISI");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, BUK_CERSOSDIIMLI_RPTBOX_INDIRIHEADER, 9300, 1700, 9500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_INDIRIHEADER, "F53441CD-08FD-49B2-B1D4-A2731C060211");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_INDIRIHEADER, "INDIRIHEADER");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_INDIRIHEADER, BUK_CERSOSDIIMLI_SPAN_RIEDCISICSDI, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECINDENTDAT", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RIEDCISICSDI, "F7F433FB-FECC-4F65-AB71-0EA8021DAA10");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RIEDCISICSDI, "RIEDCISICSDI");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPDATO, BUK_CERSOSDIIMLI_RPTBOX_COMUPROVHEAD, 9300, 2300, 9500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_COMUPROVHEAD, "7FE3A2D5-5FD5-43D7-9150-4EFCC903056A");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_COMUPROVHEAD, "COMUPROVHEAD");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_COMUPROVHEAD, BUK_CERSOSDIIMLI_SPAN_RCEDCISICSDI, MyGlb.VIS_DEFAREPOSTYL, 5, 143, 0, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RCEDCISICSDI, "F6F2CF1F-7654-4340-B643-6EB867560622");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RCEDCISICSDI, "RCEDCISICSDI");
    BUK_CERSOSDIIMLI.InitSection(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, BUK_CERSOSDIIMLI_SEC_INTEGRUPBENE, 900, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGBENE");
    BUK_CERSOSDIIMLI.SetSectionRendersInto(BUK_CERSOSDIIMLI_SEC_INTEGRUPBENE, BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SEC_INTEGRUPBENE, "F98D44DF-FF90-4B89-B07E-C34D16E0DAFC");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SEC_INTEGRUPBENE, "INTEGRUPBENE");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPBENE, BUK_CERSOSDIIMLI_RPTBOX_BENEFICIARIO, 100, 100, 18900, 600, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BENEFICIARIO, "69D53614-C2A1-4BB8-93A2-82A2D0572FFA");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BENEFICIARIO, "BENEFICIARIO");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_BENEFICIARIO, BUK_CERSOSDIIMLI_SPAN_BENEFICIARIO, MyGlb.VIS_DEFAREPOSTYL, 5, 311, 0, 271319425, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_BENEFICIARIO, "C731BDA8-74C9-4457-BA80-477B09131879");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_BENEFICIARIO, "BENEFICIARIO");
    BUK_CERSOSDIIMLI.InitSection(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, 1800, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGBENE");
    BUK_CERSOSDIIMLI.SetSectionRendersInto(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, "B6B8F09A-8E6D-4BDA-891C-946DC219AA61");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, "INTEGRUPHEAD");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_CAUSALHEADER, 100, 700, 7800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_CAUSALHEADER, "E60BDFA4-A18D-4284-9F06-DCA438771B73");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_CAUSALHEADER, "CAUSALHEADER");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_CAUSALHEADER, BUK_CERSOSDIIMLI_SPAN_CAUSALE, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Causale", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_CAUSALE, "03BBB402-3D5B-43FF-80BE-2C2E80AAD3C5");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_CAUSALE, "CAUSALE");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_IMPONIHEADER, 6300, 100, 4700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_IMPONIHEADER, "A0E8D576-B03E-45B2-B1C9-69BEB249163D");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_IMPONIHEADER, "IMPONIHEADER");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_IMPONIHEADER, BUK_CERSOSDIIMLI_SPAN_C1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Imponibile I.r.p.e.f./ires", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_C1, "3F981CEA-96F0-4C51-9CD2-513B42F2EE0D");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_C1, "C1");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_IMPOPREVHEAD, 7700, 700, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_IMPOPREVHEAD, "B7DF7725-B6C5-4A62-9147-34B89178338A");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_IMPOPREVHEAD, "IMPOPREVHEAD");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_IMPOPREVHEAD, BUK_CERSOSDIIMLI_SPAN_IMPONIPREVLE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Imponibile Prev.le", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_IMPONIPREVLE, "8E0A7D56-2DB1-46C6-9423-13E4CB609DFE");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_IMPONIPREVLE, "IMPONIPREVLE");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_IMPOINAIHEAD, 7900, 1300, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_IMPOINAIHEAD, "F254D865-41D4-4763-A868-D7E3AA268C04");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_IMPOINAIHEAD, "IMPOINAIHEAD");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_IMPOINAIHEAD, BUK_CERSOSDIIMLI_SPAN_IMPONIBINAIL, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Imponibile Inail", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_IMPONIBINAIL, "28CC62F4-6B69-414D-A77D-AA70D9A115DB");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_IMPONIBINAIL, "IMPONIBINAIL");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_ALIQUOHEADER, 11200, 100, 1200, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOHEADER, "BA77DC6D-DBB7-4A3E-A95E-B92FEBBB9119");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOHEADER, "ALIQUOHEADER");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOHEADER, BUK_CERSOSDIIMLI_SPAN_ALIQUOTA1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Aliquota", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_ALIQUOTA1, "F8148D18-98C5-4933-ADD7-7A7A11D22D8D");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_ALIQUOTA1, "ALIQUOTA1");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_ALIQINPSHEAD, 11200, 700, 1200, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_ALIQINPSHEAD, "6AA8F57E-00C7-4260-89C1-01FC2E779423");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_ALIQINPSHEAD, "ALIQINPSHEAD");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_ALIQINPSHEAD, BUK_CERSOSDIIMLI_SPAN_ALIQUOTA2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Aliquota", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_ALIQUOTA2, "AACAAA0C-43AB-46DE-99F1-327892ECA7BE");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_ALIQUOTA2, "ALIQUOTA2");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_ALIQINAIHEAD, 11200, 1300, 1200, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_ALIQINAIHEAD, "11DBE3B0-C09B-47B3-B02C-E6FF65E8951E");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_ALIQINAIHEAD, "ALIQINAIHEAD");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_ALIQINAIHEAD, BUK_CERSOSDIIMLI_SPAN_ALIQUOTA, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Aliquota", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_ALIQUOTA, "3463ED41-20DD-4966-9A45-A38EB26642B9");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_ALIQUOTA, "ALIQUOTA");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_RITEIRPEHEAD, 12600, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_RITEIRPEHEAD, "36ADBBBE-86AF-4C69-8BBC-BFB762AB58DC");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_RITEIRPEHEAD, "RITEIRPEHEAD");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_RITEIRPEHEAD, BUK_CERSOSDIIMLI_SPAN_C2, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Ritenute I.r.p.e.f./Ires", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_C2, "A6083FC2-8F04-42BA-AB74-44C931BA4C94");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_C2, "C2");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_RITEINPSHEAD, 11400, 700, 4300, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_RITEINPSHEAD, "C77BC150-5F85-4499-926C-706B65F4D9DB");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_RITEINPSHEAD, "RITEINPSHEAD");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_RITEINPSHEAD, BUK_CERSOSDIIMLI_SPAN_RITENPREVI13, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Ritenute Previdenziali", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RITENPREVI13, "E15CB0B6-1CE3-4D2E-96A6-6A809672799A");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RITENPREVI13, "RITENPREVI13");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_RITEINAIHEAD, 12600, 1300, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_RITEINAIHEAD, "A2BB4C58-A0F0-4DF6-BC65-ED8204C85900");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_RITEINAIHEAD, "RITEINAIHEAD");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_RITEINAIHEAD, BUK_CERSOSDIIMLI_SPAN_RITENUTINAIL, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Ritenute Inail", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RITENUTINAIL, "7DFEEE50-3D8F-40A4-BF92-F27DEF57F861");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RITENUTINAIL, "RITENUTINAIL");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_IMPNONSOGHEA, 15800, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_IMPNONSOGHEA, "DFE70CAA-DE61-4FB3-8FF3-FB8F6641C02A");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_IMPNONSOGHEA, "IMPNONSOGHEA");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_IMPNONSOGHEA, BUK_CERSOSDIIMLI_SPAN_SOMMENONSOGG, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Somme non Soggette", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_SOMMENONSOGG, "628FDE2F-489E-49A1-968D-A29078EC89FD");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_SOMMENONSOGG, "SOMMENONSOGG");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_RITINPENTHEA, 15900, 700, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_RITINPENTHEA, "F03BBC41-110E-4445-98EB-1EEB77EB80BB");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_RITINPENTHEA, "RITINPENTHEA");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_RITINPENTHEA, BUK_CERSOSDIIMLI_SPAN_RITPRECAEN23, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Rit. Prev. Carico Ente(2/3)", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RITPRECAEN23, "B30600F0-0D4F-465C-BA02-4E7FDCD0F7E9");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RITPRECAEN23, "RITPRECAEN23");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_RITINAENTHEA, 15900, 1300, 3100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_RITINAENTHEA, "9BA50DFD-841B-40D9-B315-B29EF4985FA2");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_RITINAENTHEA, "RITINAENTHEA");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_RITINAENTHEA, BUK_CERSOSDIIMLI_SPAN_RITINACARENT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Rit. Inail Carico Ente", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RITINACARENT, "5AF7546D-9E38-4CC9-855B-5B1BEBEC0E05");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RITINACARENT, "RITINACARENT");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_BOX13, 0, 0, 7900, 1800, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX13, "01116034-24B9-4CF2-9944-8A2E2E85F7AF");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX13, "BOX13");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_BOX14, 7900, 0, 3200, 600, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX14, "62D11100-A60B-44EB-9EDF-E7B1CCBC3CED");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX14, "BOX14");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_BOX15, 7900, 600, 3200, 600, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX15, "74ED9748-829B-4AB5-91BF-CAF81BF7D7D0");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX15, "BOX15");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_BOX16, 7900, 1200, 3200, 600, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX16, "7F6166FC-3508-4B51-BA78-138FA3686028");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX16, "BOX16");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_BOX17, 11100, 0, 1400, 600, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX17, "AB80C876-D9B5-4022-A40E-FD493B9BB94A");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX17, "BOX17");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_BOX18, 11100, 600, 1400, 600, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX18, "76FFBD54-43E8-4030-A607-4EC97B807875");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX18, "BOX18");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_BOX19, 11100, 1200, 1400, 600, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX19, "8ADB30B3-F806-4D52-AB33-18B8124DC4D7");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX19, "BOX19");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_BOX20, 12500, 0, 3300, 600, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX20, "718DA1E4-F208-40AA-9391-07DC2ABA375C");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX20, "BOX20");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_BOX21, 12500, 600, 3300, 600, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX21, "D95135D1-63DE-457C-8E4E-927E665E1417");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX21, "BOX21");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_BOX22, 12500, 1200, 3300, 600, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX22, "860101C6-8726-4714-B9EE-7ECC7D6ACE19");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX22, "BOX22");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_BOX23, 15800, 0, 3200, 600, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX23, "0B0F0E1E-C7E4-4919-90C1-35322F4BA673");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX23, "BOX23");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_BOX11, 15800, 600, 3200, 600, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX11, "8167F4DE-4CF9-4F9C-9C97-B52608E45DD3");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX11, "BOX11");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_INTEGRUPHEAD, BUK_CERSOSDIIMLI_RPTBOX_BOX12, 15800, 1200, 3200, 600, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX12, "C270955E-DB0D-4B4C-86E1-A52F6789AA81");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX12, "BOX12");
    BUK_CERSOSDIIMLI.InitSection(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, BUK_CERSOSDIIMLI_SEC_DETTAGLIO, 1800, 1, 0, 4, MyGlb.VIS_A8BORDI, 8978433, "");
    BUK_CERSOSDIIMLI.SetSectionRendersInto(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, "F56DE9B6-DDD9-4F93-891E-08629FEF19DA");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_T62DESCRIZIO, 100, 100, 7800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_T62DESCRIZIO, "C62EE8B7-DAC8-4061-87F5-D80E71BBCC07");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_T62DESCRIZIO, "T62DESCRIZIO");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_T62DESCRIZIO, BUK_CERSOSDIIMLI_SPAN_RTDCISICSDIL, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "", "::RECORT62DESC", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RTDCISICSDIL, "F675E4D0-C4E2-4896-8988-D47BE17B7A98");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RTDCISICSDIL, "RTDCISICSDIL");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_TIPORIT, 100, 700, 7800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_TIPORIT, "2CFC0CDD-86AC-4D64-9C67-3CACDCDFF512");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_TIPORIT, "TIPORIT");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_TIPORIT, BUK_CERSOSDIIMLI_SPAN_RTRCISICSDIL, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::RECORTIPORIT", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RTRCISICSDIL, "E555BEA5-4A34-43D1-A61E-651EC98C126E");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RTRCISICSDIL, "RTRCISICSDIL");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_T62ARTICOLO, 100, 1300, 7800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_T62ARTICOLO, "C3B10F09-4D86-4C87-BFE5-AB7FD97C7555");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_T62ARTICOLO, "T62ARTICOLO");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_T62ARTICOLO, BUK_CERSOSDIIMLI_SPAN_RTACISICSDIL, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "", "::RECORT62ARTI", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RTACISICSDIL, "AD6E7124-F2D2-4184-9944-63BF83D23CBA");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RTACISICSDIL, "RTACISICSDIL");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_TOTALEIMPONI, 7900, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_TOTALEIMPONI, "1816D9AD-787C-48B7-B59C-E6DED6B14835");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_TOTALEIMPONI, "TOTALEIMPONI");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_TOTALEIMPONI, BUK_CERSOSDIIMLI_SPAN_RTICISICSDIL, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "::TOTALEIMPONI", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RTICISICSDIL, "1CF065E9-2D26-42E7-8486-3F0A3A1E6EF2");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RTICISICSDIL, "RTICISICSDIL");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_TOTAIMPOINPS, 7900, 700, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_TOTAIMPOINPS, "CC2ED86B-4F51-4CA1-84E4-2DB4964A9514");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_TOTAIMPOINPS, "TOTAIMPOINPS");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_TOTAIMPOINPS, BUK_CERSOSDIIMLI_SPAN_RTIICISICSD1, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "::TOTAIMPOINPS", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RTIICISICSD1, "A7CE5953-3E2C-4260-BBDF-647880111A0D");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RTIICISICSD1, "RTIICISICSD1");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_TOTAIMPOINAI, 7900, 1300, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_TOTAIMPOINAI, "C378F888-029B-4E59-BB82-816F367619A7");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_TOTAIMPOINAI, "TOTAIMPOINAI");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_TOTAIMPOINAI, BUK_CERSOSDIIMLI_SPAN_RTIICISICSDI, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "::TOTAIMPOINAI", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RTIICISICSDI, "2425DD62-B8E5-476A-87A4-8C227602F253");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RTIICISICSDI, "RTIICISICSDI");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTA, 11200, 100, 1200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTA, "F720720E-C43A-4D4E-A8D9-922313A70226");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTA, "ALIQUOTA");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTA, BUK_CERSOSDIIMLI_SPAN_RLACISICSDIL, MyGlb.VIS_DEFAREPOSTYL, 3, 4, 6, 271384705, "", "::RECORLIQALIQ", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RLACISICSDIL, "B63BDAEB-FF16-44BA-B627-A54A37CA7812");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RLACISICSDIL, "RLACISICSDIL");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTAINPS, 11200, 700, 1200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTAINPS, "B47132CC-5E04-446A-A4E3-DB610A082191");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTAINPS, "ALIQUOTAINPS");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTAINPS, BUK_CERSOSDIIMLI_SPAN_RLAICISICSD1, MyGlb.VIS_DEFAREPOSTYL, 3, 5, 6, 271384705, "", "::RECLIQALIINP", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RLAICISICSD1, "2E9BABA1-97CF-4DE2-8888-574AC46E200C");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RLAICISICSD1, "RLAICISICSD1");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTINAIL, 11200, 1300, 1200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTINAIL, "83A5A423-7C99-47DA-A45D-3801CBC3B6EF");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTINAIL, "ALIQUOTINAIL");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_ALIQUOTINAIL, BUK_CERSOSDIIMLI_SPAN_RLAICISICSDI, MyGlb.VIS_DEFAREPOSTYL, 3, 5, 6, 271384705, "", "::RECLIQALIINA", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RLAICISICSDI, "27149D6C-7C14-46AA-A0C7-04A03EC16A7B");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RLAICISICSDI, "RLAICISICSDI");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_TOTARITEIRPE, 12600, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_TOTARITEIRPE, "AC299C55-EC5F-4A79-9D03-FD9B9CB1F45E");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_TOTARITEIRPE, "TOTARITEIRPE");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_TOTARITEIRPE, BUK_CERSOSDIIMLI_SPAN_RTRICISICSD1, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "::TOTARITEIRPE", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RTRICISICSD1, "DC4DF6E8-2932-4950-B356-11A84D8D0EA9");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RTRICISICSD1, "RTRICISICSD1");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_TOTARITEINPS, 12600, 700, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_TOTARITEINPS, "FBED5226-CAB3-4DF3-90AD-6D9221D30577");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_TOTARITEINPS, "TOTARITEINPS");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_TOTARITEINPS, BUK_CERSOSDIIMLI_SPAN_RTRICISICSD2, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "::TOTARITEINPS", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RTRICISICSD2, "26471FBE-B064-427D-BF1B-E2243AFDE472");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RTRICISICSD2, "RTRICISICSD2");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_TOTARITEINAI, 12600, 1300, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_TOTARITEINAI, "3951ADD5-9FE3-4147-A759-C49D13C62F5C");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_TOTARITEINAI, "TOTARITEINAI");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_TOTARITEINAI, BUK_CERSOSDIIMLI_SPAN_RTRICISICSDI, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "::TOTARITEINAI", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RTRICISICSDI, "0EB9C9D4-8F30-424B-A6CB-1F4F68B0BAC5");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RTRICISICSDI, "RTRICISICSDI");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_TOTIMPNONSOG, 15800, 100, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_TOTIMPNONSOG, "3271264C-AE0A-4F00-945D-46CA69278FAF");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_TOTIMPNONSOG, "TOTIMPNONSOG");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_TOTIMPNONSOG, BUK_CERSOSDIIMLI_SPAN_RTINSCISICSD, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "::TOTIMPNONSOG", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RTINSCISICSD, "82E80378-1196-4F97-BB36-49424D84C2F3");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RTINSCISICSD, "RTINSCISICSD");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_TOTRITINPENT, 15800, 700, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_TOTRITINPENT, "83DB029D-216C-47F9-BFE3-40ECAADCEF87");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_TOTRITINPENT, "TOTRITINPENT");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_TOTRITINPENT, BUK_CERSOSDIIMLI_SPAN_RTRIECISICS1, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "::TOTRITINPENT", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RTRIECISICS1, "5CDE719F-4459-47CE-ABBA-38C89AF7C1A3");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RTRIECISICS1, "RTRIECISICS1");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_TOTRITINAENT, 15800, 1300, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_TOTRITINAENT, "42D0AD5C-E68C-4596-8400-18D3705D3340");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_TOTRITINAENT, "TOTRITINAENT");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_TOTRITINAENT, BUK_CERSOSDIIMLI_SPAN_RTRIECISICSD, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "::TOTRITINAENT", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_RTRIECISICSD, "36509CEF-3FA6-48AC-A908-F693867A9B61");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_RTRIECISICSD, "RTRIECISICSD");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_BOX, 7900, 0, 3200, 1800, 0, 1, 3, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX, "C2D80729-C5D0-4A0A-B4AB-1D262814C9FB");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX, "BOX");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_BOX24, 11100, 0, 1400, 1800, 0, 1, 3, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX24, "9E1B188C-888C-44B3-BF72-7F653D0123D0");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX24, "BOX24");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_BOX25, 12500, 0, 3300, 1800, 0, 1, 3, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX25, "059FD247-45C9-4B2E-8EEF-9312F1E4604A");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX25, "BOX25");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_DETTAGLIO, BUK_CERSOSDIIMLI_RPTBOX_BOX26, 15800, 0, 3200, 1800, 0, 1, 3, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX26, "CEBBA06E-F371-4321-AAF8-F174052DB833");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX26, "BOX26");
    BUK_CERSOSDIIMLI.InitSection(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, 5300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGBENE");
    BUK_CERSOSDIIMLI.SetSectionRendersInto(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, "3EAD6134-C94F-4BF5-9E50-6EADBFDB0307");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, "PIEDGRUPTOTA");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_TOTALI, 4500, 1500, 3300, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_TOTALI, "05C5B78E-C126-47C4-8C59-69A3788A4293");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_TOTALI, "TOTALI");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_TOTALI, BUK_CERSOSDIIMLI_SPAN_TOTALI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totali............", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_TOTALI, "E52FE81C-4EDB-44E5-A930-8D1BAE491540");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_TOTALI, "TOTALI");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_LINEASUP, 7900, 0, 11100, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_LINEASUP, "59CDA709-4B23-42AF-90F6-3145E9B443E6");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_LINEASUP, "LINEASUP");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTAIMP, 7900, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTAIMP, "F1FFFDB0-99E2-48A4-80B5-CBE49BFB7588");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTAIMP, "SUMOFTOTAIMP");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTAIMP, BUK_CERSOSDIIMLI_SPAN_PGTSRTICISIC, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTSRTICISIC, "C0A16E88-B4B3-466D-909C-9C07A32453BF");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTSRTICISIC, "PGTSRTICISIC");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTIMI1, 7900, 800, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTIMI1, "A61E91F6-01A7-48AE-92FB-5D6C9DA6C232");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTIMI1, "SUMOFTOTIMI1");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTIMI1, BUK_CERSOSDIIMLI_SPAN_PGTSRTIICIS1, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTSRTIICIS1, "B81AC393-FFEC-47F6-BA13-A6525D8AD987");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTSRTIICIS1, "PGTSRTIICIS1");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTIMIN, 7900, 1400, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTIMIN, "D790E9B1-6118-4B78-ABB1-C4FA44732C61");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTIMIN, "SUMOFTOTIMIN");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTIMIN, BUK_CERSOSDIIMLI_SPAN_PGTSRTIICISI, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTSRTIICISI, "7930D959-53F3-4B69-A092-FEC73490FC4B");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTSRTIICISI, "PGTSRTIICISI");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIIR, 12600, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIIR, "89B00F0F-E7F1-4520-95E2-F18D698228BD");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIIR, "SUMOFTOTRIIR");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIIR, BUK_CERSOSDIIMLI_SPAN_PGTSRTRICIS1, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTSRTRICIS1, "CD79C41A-8BDA-4A20-96C6-A5C56A8B5818");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTSRTRICIS1, "PGTSRTRICIS1");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRII1, 12600, 800, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRII1, "C6D0CDB0-AEBF-4ABE-BF79-44E6516207B9");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRII1, "SUMOFTOTRII1");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRII1, BUK_CERSOSDIIMLI_SPAN_PGTSRTRICIS2, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTSRTRICIS2, "DEDBC755-3562-4947-B02D-81B84FB8A3B1");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTSRTRICIS2, "PGTSRTRICIS2");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIIN, 12600, 1400, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIIN, "71A683C1-C9D5-4782-9F6B-49FD21272ADF");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIIN, "SUMOFTOTRIIN");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIIN, BUK_CERSOSDIIMLI_SPAN_PGTSRTRICISI, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTSRTRICISI, "24331D71-F806-4E00-8552-D9319FC29A41");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTSRTRICISI, "PGTSRTRICISI");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_SUOFTOIMNOSO, 15800, 200, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SUOFTOIMNOSO, "FE31FFF7-9261-48A2-9311-9AA22F2A0284");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SUOFTOIMNOSO, "SUOFTOIMNOSO");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SUOFTOIMNOSO, BUK_CERSOSDIIMLI_SPAN_PGTSRTINSCIS, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTSRTINSCIS, "CFA0A245-2F1E-42FF-850E-DF06D002F916");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTSRTINSCIS, "PGTSRTINSCIS");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIINE1, 15800, 800, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIINE1, "E354326A-B26E-4BF8-9DB4-2AFF9D1FC6E0");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIINE1, "SUOFTORIINE1");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIINE1, BUK_CERSOSDIIMLI_SPAN_PGTSRTRIECI1, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTSRTRIECI1, "F9A08D00-6B00-486B-B048-F7BDCD3C0738");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTSRTRIECI1, "PGTSRTRIECI1");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIINEN, 15800, 1400, 3100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIINEN, "2BBA0D8B-70B7-4B42-91F5-B37C0DAF585D");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIINEN, "SUOFTORIINEN");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIINEN, BUK_CERSOSDIIMLI_SPAN_PGTSRTRIECIS, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTSRTRIECIS, "2A3D6CE2-DD0C-44DB-9C84-52F02BAF406C");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTSRTRIECIS, "PGTSRTRIECIS");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_LINEAINF, 7900, 1700, 11100, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_LINEAINF, "3BBE1400-B105-4371-B315-0C0772B59CB6");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_LINEAINF, "LINEAINF");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_ADDIZIREGION, 0, 1900, 7900, 400, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_ADDIZIREGION, "D35226C5-E833-4E78-9E3A-709B999D42F6");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_ADDIZIREGION, "ADDIZIREGION");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_ADDIZIREGION, BUK_CERSOSDIIMLI_SPAN_ADDIZIREGION, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271384961, "", "Addizionale regionale", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_ADDIZIREGION, "B1D5DBD4-9990-4208-8F2E-59316D372931");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_ADDIZIREGION, "ADDIZIREGION");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_ADDIZICOMUNA, 0, 2300, 7900, 400, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_ADDIZICOMUNA, "AA9EE411-6306-4A81-BC64-9A8835F5C8C5");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_ADDIZICOMUNA, "ADDIZICOMUNA");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_ADDIZICOMUNA, BUK_CERSOSDIIMLI_SPAN_ADDIZICOMUNA, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271384961, "", "Addizionale comunale", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_ADDIZICOMUNA, "C587285A-DA47-4AB7-A00E-6E462335ED50");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_ADDIZICOMUNA, "ADDIZICOMUNA");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_ADDCASPREPRO, 0, 2700, 7900, 400, 0, 1, 1, MyGlb.VIS_INTCONBORDO, 983041, 340, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_ADDCASPREPRO, "E57E719E-5DD5-4E34-BC30-0316E3FC4363");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_ADDCASPREPRO, "ADDCASPREPRO");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_ADDCASPREPRO, BUK_CERSOSDIIMLI_SPAN_C, MyGlb.VIS_INTCONBORDO, 0, 0, 0, 271384961, "", "Contributo cassa previdenziale professionale", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_C, "998338FA-24FF-41CF-BD17-A387B32A1749");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_C, "C");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_SUMOFIMPOREG, 7900, 1900, 3200, 400, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SUMOFIMPOREG, "44633FB4-6FB7-4E24-AF4E-273A53C30E4A");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SUMOFIMPOREG, "SUMOFIMPOREG");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SUMOFIMPOREG, BUK_CERSOSDIIMLI_SPAN_PGTSRIRCISIC, MyGlb.VIS_A8BORDI, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTSRIRCISIC, "87F5B68D-3C77-4384-BE00-DA0EB99A75AE");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTSRIRCISIC, "PGTSRIRCISIC");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_SUMOFIMPOCOM, 7900, 2300, 3200, 400, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SUMOFIMPOCOM, "FE71FDCA-5CDE-4D57-912F-45279394376E");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SUMOFIMPOCOM, "SUMOFIMPOCOM");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SUMOFIMPOCOM, BUK_CERSOSDIIMLI_SPAN_PGTSRICCISIC, MyGlb.VIS_A8BORDI, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTSRICCISIC, "A926D76F-0A19-4FF3-98F8-C18C4FCDBC12");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTSRICCISIC, "PGTSRICCISIC");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_MAXOFALIQREG, 11100, 1900, 1400, 400, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_MAXOFALIQREG, "9383C9C3-07BE-40DB-A806-96EAE6762A64");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_MAXOFALIQREG, "MAXOFALIQREG");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_MAXOFALIQREG, BUK_CERSOSDIIMLI_SPAN_PGTMRARCISIC, MyGlb.VIS_A8BORDI, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTMRARCISIC, "1F9ABA99-ECDC-4FB2-ACA1-9EE35BE3E3AE");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTMRARCISIC, "PGTMRARCISIC");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_MAXOFALIQCOM, 11100, 2300, 1400, 400, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_MAXOFALIQCOM, "F2D47FC3-63A1-433C-9B21-85C8DD2518DF");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_MAXOFALIQCOM, "MAXOFALIQCOM");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_MAXOFALIQCOM, BUK_CERSOSDIIMLI_SPAN_PGTMRACCISIC, MyGlb.VIS_A8BORDI, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTMRACCISIC, "6FC1C709-E4CD-4A9C-81DF-822A4007A933");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTMRACCISIC, "PGTMRACCISIC");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIAD, 12500, 1900, 3300, 400, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIAD, "CC371CAF-B61D-4BC2-BE60-2208A0D05BCF");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIAD, "SUMOFTOTRIAD");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SUMOFTOTRIAD, BUK_CERSOSDIIMLI_SPAN_PGTSRTRACISI, MyGlb.VIS_A8BORDI, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTSRTRACISI, "BAD67AEF-F90F-46AA-B4FF-271C2F34B17F");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTSRTRACISI, "PGTSRTRACISI");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIADCO, 12500, 2300, 3300, 400, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIADCO, "5E79F7C7-3827-40A7-B0DA-C476938B4B4E");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIADCO, "SUOFTORIADCO");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORIADCO, BUK_CERSOSDIIMLI_SPAN_PGTSRTRACCIS, MyGlb.VIS_A8BORDI, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTSRTRACCIS, "3081D89D-C4F8-4569-A439-D08EDA6A859F");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTSRTRACCIS, "PGTSRTRACCIS");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_SUOFTORICAPR, 12500, 2700, 3300, 400, 0, 1, 1, MyGlb.VIS_A8BORDI, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORICAPR, "BA012F5F-F0EF-41BE-AE48-8B5BFA812993");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORICAPR, "SUOFTORICAPR");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_SUOFTORICAPR, BUK_CERSOSDIIMLI_SPAN_PGTSRTRCPCIS, MyGlb.VIS_A8BORDI, 3, 28, 6, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_PGTSRTRCPCIS, "0762CE3F-3F61-4832-9EEE-85B8CC96FB68");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_PGTSRTRCPCIS, "PGTSRTRCPCIS");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_BOXLESOMME, 100, 4300, 5700, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOXLESOMME, "225C036E-BCE3-46A6-BC99-4A5F87A81763");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOXLESOMME, "BOXLESOMME");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_BOXLESOMME, BUK_CERSOSDIIMLI_SPAN_LESONOSOSCDE, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Le somme non soggette sono comprensive di Euro", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_LESONOSOSCDE, "59091E58-954B-4BF8-A54C-800A243D968F");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_LESONOSOSCDE, "LESONOSOSCDE");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_BOXIVA, 5900, 4300, 5900, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983297, 322, " per I.V.A.", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOXIVA, "1BFC9394-70CA-4543-9141-181838C7EF2D");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOXIVA, "BOXIVA");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_BOXIVA, BUK_CERSOSDIIMLI_SPAN_FNVRSICISICS, MyGlb.VIS_DEFAREPOSTYL, 5, 198, 0, 271384961, "0,00", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_FNVRSICISICS, "2A478BEB-E521-47B5-88FB-28DC157B319F");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_FNVRSICISICS, "FNVRSICISICS");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_BOX1, 0, 0, 7900, 1900, 0, 1, 3, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX1, "08CB8CFF-D70D-4AA0-B056-DAE358E30C99");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX1, "BOX1");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_BOX2, 7900, 0, 3200, 1900, 0, 1, 3, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX2, "48F922C4-F6AB-42DE-97B5-7581C9D1209A");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX2, "BOX2");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_BOX3, 11100, 0, 1400, 1900, 0, 1, 3, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX3, "E617C87E-F036-4CA9-A367-D57971DCEBFC");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX3, "BOX3");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_BOX4, 12500, 0, 3300, 1900, 0, 1, 3, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX4, "E7902C19-BFC2-497D-B01F-6BDE3EE08B3E");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX4, "BOX4");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_BOX5, 15800, 0, 3200, 1900, 0, 1, 3, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX5, "BA1D72EF-2EE8-4744-8498-493E26FC983B");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX5, "BOX5");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_BOX6, 7900, 2700, 3200, 400, 0, 1, 3, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX6, "0DDD69B4-7480-4DF8-84F8-70D19720C6EB");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX6, "BOX6");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_BOX7, 11100, 2700, 1400, 400, 0, 1, 3, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX7, "18F5AF37-39C5-4686-8625-D837AE90EBE7");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX7, "BOX7");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_BOX8, 15800, 1900, 3200, 400, 0, 1, 3, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX8, "7B75C11C-A035-496D-AFDD-A74B1309A115");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX8, "BOX8");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_BOX9, 15800, 2300, 3200, 400, 0, 1, 3, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX9, "36C4FDF3-F45C-4757-B8F4-3CDD52CF2787");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX9, "BOX9");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPTOTA, BUK_CERSOSDIIMLI_RPTBOX_BOX10, 15800, 2700, 3200, 400, 0, 1, 3, MyGlb.VIS_A8BORDI, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_BOX10, "4CF55EC9-F650-4A7E-949A-42CE4AC46489");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_BOX10, "BOX10");
    BUK_CERSOSDIIMLI.InitSection(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, BUK_CERSOSDIIMLI_SEC_PIEDGRUNOENT, 700, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGBENE");
    BUK_CERSOSDIIMLI.SetSectionRendersInto(BUK_CERSOSDIIMLI_SEC_PIEDGRUNOENT, BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SEC_PIEDGRUNOENT, "14B9C7F0-9B64-441D-A735-4FEDEEDCA988");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SEC_PIEDGRUNOENT, "PIEDGRUNOENT");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUNOENT, BUK_CERSOSDIIMLI_RPTBOX_MODALIVERSAM, 100, 100, 18700, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983297, 322, "L'importo delle ritenute ", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_MODALIVERSAM, "99DF1921-3F40-4885-BD5E-1DCB3D54E111");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_MODALIVERSAM, "MODALIVERSAM");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_MODALIVERSAM, BUK_CERSOSDIIMLI_SPAN_MODALIVERSAM, MyGlb.VIS_DEFAREPOSTYL, 5, 434, 0, 271319169, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_MODALIVERSAM, "C9855826-40E4-4D2C-A579-58FFAB038935");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_MODALIVERSAM, "MODALIVERSAM");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUNOENT, BUK_CERSOSDIIMLI_RPTBOX_ESVCLMPDDPRN, 18800, 200, 100, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983297, 0, " e' stato versato con le modalità previste dal D.P.R. n. 322 del 22/7/98 presso ", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_ESVCLMPDDPRN, "95EA56BD-83AD-4FA4-9C85-ABD20837F354");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_ESVCLMPDDPRN, "ESVCLMPDDPRN");
    BUK_CERSOSDIIMLI.InitSection(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, BUK_CERSOSDIIMLI_SEC_PIEGRUNOENPR, 500, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGBENE");
    BUK_CERSOSDIIMLI.SetSectionRendersInto(BUK_CERSOSDIIMLI_SEC_PIEGRUNOENPR, BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SEC_PIEGRUNOENPR, "D344EF30-5A18-438F-9678-0B4BAD5BEE4B");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SEC_PIEGRUNOENPR, "PIEGRUNOENPR");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEGRUNOENPR, BUK_CERSOSDIIMLI_RPTBOX_LIDCINPSESVC, 100, 0, 18800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983297, 322, "L'importo dei contributi I.N.P.S. e' stato versato con le modalita' previste dal D.P.R. n. 322 del 22/7/98  presso I.N.P.S. Sede di ", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_LIDCINPSESVC, "BB88B680-A37F-4040-9FBA-FFAB27122E90");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_LIDCINPSESVC, "LIDCINPSESVC");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_LIDCINPSESVC, BUK_CERSOSDIIMLI_SPAN_LIDCINPSESVC, MyGlb.VIS_DEFAREPOSTYL, 5, 158, 0, 271384961, "L'importo dei contributi I.N.P.S. e' stato versato con le modalita' previste dal D.P.R. n.322 del 22/07/98 presso I.N.P.S. Sede di ", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_LIDCINPSESVC, "4A006CB0-B2D7-4255-9BFC-0406858A9735");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_LIDCINPSESVC, "LIDCINPSESVC");
    BUK_CERSOSDIIMLI.InitSection(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, BUK_CERSOSDIIMLI_SEC_PIEDGRUPFIRM, 5400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978689, "RECORAGGBENE");
    BUK_CERSOSDIIMLI.SetSectionRendersInto(BUK_CERSOSDIIMLI_SEC_PIEDGRUPFIRM, BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SEC_PIEDGRUPFIRM, "57C15013-5935-4027-ACD1-5F68E6E0562A");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SEC_PIEDGRUPFIRM, "PIEDGRUPFIRM");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPFIRM, BUK_CERSOSDIIMLI_RPTBOX_FIRMA, 3100, 1900, 6400, 2500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_FIRMA, "E47C952D-FCBD-414A-A172-49F044A374E9");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_FIRMA, "FIRMA");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPFIRM, BUK_CERSOSDIIMLI_RPTBOX_FIRMARIGA1, 100, 2300, 18800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_FIRMARIGA1, "BA0715F0-A3CB-4342-9D75-43402D8ED971");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_FIRMARIGA1, "FIRMARIGA1");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_FIRMARIGA1, BUK_CERSOSDIIMLI_SPAN_NOMOGGFIRRI1, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_NOMOGGFIRRI1, "BCCCB278-1048-4D94-932C-6DAE910B2289");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_NOMOGGFIRRI1, "NOMOGGFIRRI1");
    BUK_CERSOSDIIMLI.InitReportBox(BUK_CERSOSDIIMLI_SEC_PIEDGRUPFIRM, BUK_CERSOSDIIMLI_RPTBOX_FIRMARIGA2, 100, 3000, 18800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_RPTBOX_FIRMARIGA2, "B19C61A4-99C3-4CF2-8BE0-7A32BAFB34E3");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_RPTBOX_FIRMARIGA2, "FIRMARIGA2");
    BUK_CERSOSDIIMLI.InitBoxSpan(BUK_CERSOSDIIMLI_RPTBOX_FIRMARIGA2, BUK_CERSOSDIIMLI_SPAN_NOMOGGFIRRI2, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "", "", 1);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SPAN_NOMOGGFIRRI2, "BD18CB7F-EE3F-469E-895C-57D7E3AFE104");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SPAN_NOMOGGFIRRI2, "NOMOGGFIRRI2");
    BUK_CERSOSDIIMLI.InitSection(BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE, BUK_CERSOSDIIMLI_SEC_PIEDEREPORT, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CERSOSDIIMLI.SetSectionRendersInto(BUK_CERSOSDIIMLI_SEC_PIEDEREPORT, BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA);
    BUK_CERSOSDIIMLI.SetRTCGuid(BUK_CERSOSDIIMLI_SEC_PIEDEREPORT, "04CE468D-D9ED-4783-BED9-669F17407C25");
    BUK_CERSOSDIIMLI.SetObjCode(BUK_CERSOSDIIMLI_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_CERSOSDIIMLI.AddReportGroup(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, "RECORAGGBENE");
    BUK_CERSOSDIIMLI.AddReportGroup(BUK_CERSOSDIIMLI_SEC_INTEGRUPDITT, "RECORAGGBENE");
    BUK_CERSOSDIIMLI_RPT_CERSOSDIIMRE_InitQuery(false, true);
  }

  private void BUK_CERSOSDIIMLI_InitLinks()
  {
    BUK_CERSOSDIIMLI.SetBoxNextBox(BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA, BUK_CERSOSDIIMLI_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CERSOSDIIMLI) BUK_CERSOSDIIMLI_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CERSOSDIIMLI) BUK_CERSOSDIIMLI_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CERSOSDIIMLI) BUK_CERSOSDIIMLI_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CERSOSDIIMLI) BUK_CERSOSDIIMLI_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CERSOSDIIMLI) BUK_CERSOSDIIMLI_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CERSOSDIIMLI) BUK_CERSOSDIIMLI_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CERSOSDIIMLI) BUK_CERSOSDIIMLI_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CERSOSDIIMLI) BUK_CERSOSDIIMLI_OnPreview();
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
