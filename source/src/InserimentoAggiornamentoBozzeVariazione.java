// **********************************************
// Inserimento Aggiornamento Bozze Variazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InserimentoAggiornamentoBozzeVariazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_BOZZEVARIAZI_VOCEPEG = 0;
  private static int GRP_BOZZEVARIAZI_INSERIMENTO = 1;
  private static int GRP_BOZZEVARIAZI_AGGIORNAMENT = 2;

  private static int PFL_BOZZEVARIAZI_NOTA1 = 0;
  private static int PFL_BOZZEVARIAZI_NOTA2 = 1;
  private static int PFL_BOZZEVARIAZI_NOTA3 = 2;
  private static int PFL_BOZZEVARIAZI_NOTA4 = 3;
  private static int PFL_BOZZEVARIAZI_NOTA5 = 4;
  private static int PFL_BOZZEVARIAZI_STATO = 5;
  private static int PFL_BOZZEVARIAZI_PARTE = 6;
  private static int PFL_BOZZEVARIAZI_CAPITOLOART = 7;
  private static int PFL_BOZZEVARIAZI_CAPITOLO1 = 8;
  private static int PFL_BOZZEVARIAZI_ARTICOLO1 = 9;
  private static int PFL_BOZZEVARIAZI_NUOVA = 10;
  private static int PFL_BOZZEVARIAZI_RISORSINTERV = 11;
  private static int PFL_BOZZEVARIAZI_CAPITOLO = 12;
  private static int PFL_BOZZEVARIAZI_ARTICOLO = 13;
  private static int PFL_BOZZEVARIAZI_SLASH = 14;
  private static int PFL_BOZZEVARIAZI_APRIVOCEPEG = 15;
  private static int PFL_BOZZEVARIAZI_INFOVOCEPEG = 16;
  private static int PFL_BOZZEVARIAZI_VOCEPEGSMALL = 17;
  private static int PFL_BOZZEVARIAZI_VOCEPEGLARGE = 18;
  private static int PFL_BOZZEVARIAZI_TITOLO = 19;
  private static int PFL_BOZZEVARIAZI_TITOLIDESCRI = 20;
  private static int PFL_BOZZEVARIAZI_UNITAORGANI1 = 21;
  private static int PFL_BOZZEVARIAZI_IMPORTI = 22;
  private static int PFL_BOZZEVARIAZI_IMPORTO2 = 23;
  private static int PFL_BOZZEVARIAZI_IMPORTO3 = 24;
  private static int PFL_BOZZEVARIAZI_PROPVARDETID = 25;
  private static int PFL_BOZZEVARIAZI_PROPOSTA1 = 26;
  private static int PFL_BOZZEVARIAZI_BOZZAVARIAID = 27;
  private static int PFL_BOZZEVARIAZI_CONSSVIL = 28;
  private static int PFL_BOZZEVARIAZI_TIPOVARIAZIO = 29;
  private static int PFL_BOZZEVARIAZI_DESCRIZIONE = 30;
  private static int PFL_BOZZEVARIAZI_VARBIL = 31;
  private static int PFL_BOZZEVARIAZI_PROGETTO = 32;
  private static int PFL_BOZZEVARIAZI_POELPRFCDEPR = 33;
  private static int PFL_BOZZEVARIAZI_OBIETTIVO = 34;
  private static int PFL_BOZZEVARIAZI_POLOBIETDESC = 35;
  private static int PFL_BOZZEVARIAZI_FATTORE1 = 36;
  private static int PFL_BOZZEVARIAZI_FATTORDESCRI = 37;
  private static int PFL_BOZZEVARIAZI_CENTRO1 = 38;
  private static int PFL_BOZZEVARIAZI_CENTRIDESCRI = 39;
  private static int PFL_BOZZEVARIAZI_FINANZIAMENT = 40;
  private static int PFL_BOZZEVARIAZI_OPERA = 41;
  private static int PFL_BOZZEVARIAZI_VARIAZIONE = 42;
  private static int PFL_BOZZEVARIAZI_GENERATA = 43;
  private static int PFL_BOZZEVARIAZI_DESCRIZIONE1 = 44;
  private static int PFL_BOZZEVARIAZI_NOTE1 = 45;
  private static int PFL_BOZZEVARIAZI_SCHEDOBIETID = 46;
  private static int PFL_BOZZEVARIAZI_VARIAZIONEID = 47;
  private static int PFL_BOZZEVARIAZI_IMPORTILABEL = 48;
  private static int PFL_BOZZEVARIAZI_PANNELLO = 49;
  private static int PFL_BOZZEVARIAZI_UNITAORG = 50;
  private static int PFL_BOZZEVARIAZI_NOTAPIENA = 51;
  private static int PFL_BOZZEVARIAZI_NOTAVUOTA = 52;
  private static int PFL_BOZZEVARIAZI_ESERCIZIO3 = 53;
  private static int PFL_BOZZEVARIAZI_ESERCIZIO1 = 54;
  private static int PFL_BOZZEVARIAZI_ESERCIZIO2 = 55;
  private static int PFL_BOZZEVARIAZI_FINANZDESCRI = 56;
  private static int PFL_BOZZEVARIAZI_OPEREDESCRIZ = 57;
  private static int PFL_BOZZEVARIAZI_INFOPROGBUTT = 58;
  private static int PFL_BOZZEVARIAZI_INFOOBIEBUTT = 59;
  private static int PFL_BOZZEVARIAZI_ESERCIZIO = 60;
  private static int PFL_BOZZEVARIAZI_CODREC = 61;
  private static int PFL_BOZZEVARIAZI_PROPOSTA = 62;
  private static int PFL_BOZZEVARIAZI_POVIPRBODEPR = 63;
  private static int PFL_BOZZEVARIAZI_PANEL = 64;
  private static int PFL_BOZZEVARIAZI_UTENTE1 = 65;
  private static int PFL_BOZZEVARIAZI_DATA1 = 66;
  private static int PFL_BOZZEVARIAZI_UTENTE = 67;
  private static int PFL_BOZZEVARIAZI_DATA = 68;
  private static int PFL_BOZZEVARIAZI_FASULLO = 69;
  private static int PFL_BOZZEVARIAZI_INFOFINANZI1 = 70;
  private static int PFL_BOZZEVARIAZI_INFOOPERA1 = 71;

  private static int PPQRY_POLPROVARDE8 = 0;

  private static int PPQRY_POLSCHEDOBIE = 1;
  private static int PPQRY_POLVARBILPEG = 2;
  private static int PPQRY_DUAL1 = 3;
  private static int PPQRY_POLELENPROFC = 4;
  private static int PPQRY_FATTORI = 5;
  private static int PPQRY_CENTRI = 6;
  private static int PPQRY_FINANZIAMENT = 7;
  private static int PPQRY_OPERE = 8;
  private static int PPQRY_POLVISPROBOZ = 9;
  private static int PPQRY_TITOLI = 10;

  private static int PPQRY_VISTABILANUO = 11;
  private static int PPQRY_T54 = 12;
  private static int PPQRY_DUAL2 = 13;
  private static int PPQRY_DUAL = 14;


  IDPanel PAN_BOZZEVARIAZI;
  private static int PFL_FAKE_UNITAORGANIZ = 0;

  private static int PPQRY_PANNELLOUO1 = 0;

  private static int PPQRY_SO4ANAUNIORG = 1;


  IDPanel PAN_FAKE;
  private static int PFL_PANEL_FINANZIOPERA = 0;
  private static int PFL_PANEL_INFOFINANZIA = 1;
  private static int PFL_PANEL_INFOOPERA = 2;

  private static int PPQRY_PANEL2 = 0;

  private static int PPQRY_BILFIN = 1;


  IDPanel PAN_PANEL;
  private static int PFL_POLELENPROFC_PROGETTOID = 0;
  private static int PFL_POLELENPROFC_NEWEXPRESSIO = 1;
  private static int PFL_POLELENPROFC_FATTORE = 2;
  private static int PFL_POLELENPROFC_CENTRO = 3;

  private static int PPQRY_FASULLO1 = 0;


  IDPanel PAN_POLELENPROFC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS5(IMDB);
    Init_TBL_PANNELLOUO(IMDB);
    Init_TBL_OLDVALUES(IMDB);
    Init_TBL_PANEL(IMDB);
    Init_TBL_FASULLO(IMDB);
    //
    //
    Init_PQRY_POLPROVARDE8(IMDB);
    Init_PQRY_PANNELLOUO1(IMDB);
    Init_PQRY_PANNELLOUO1_RS(IMDB);
    Init_PQRY_PANEL2(IMDB);
    Init_PQRY_PANEL2_RS(IMDB);
    Init_PQRY_FASULLO1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS5, 10);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS5, "TBL_PARS5");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNAMEVISUA, "ROWNAMEVISUA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNAMEVISUA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNAMEBOZZA, "ROWNAMEBOZZA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNAMEBOZZA,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNAMVADEID, "ROWNAMVADEID");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNAMVADEID,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNAMEMODIF, "ROWNAMEMODIF");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNAMEMODIF,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNAMECOLLE, "ROWNAMECOLLE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNAMECOLLE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNAMEINSER, "ROWNAMEINSER");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNAMEINSER,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_RONAESCOREUN, "RONAESCOREUN");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_RONAESCOREUN,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNADACORE1, "ROWNADACORE1");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNADACORE1,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNAMEMODUO, "ROWNAMEMODUO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_ROWNAMEMODUO,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_RONAUODACOR1, "RONAUODACOR1");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS5,IMDBDef3.FLD_PARS5_RONAUODACOR1,1,8,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS5, 0);
  }

  private static void Init_TBL_PANNELLOUO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PANNELLOUO, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PANNELLOUO, "TBL_PANNELLOUO");
    IMDB.set_FldCode(IMDBDef3.TBL_PANNELLOUO,IMDBDef3.FLD_PANNELLOUO_ROWNAMEPROUO, "ROWNAMEPROUO");
    IMDB.SetFldParams(IMDBDef3.TBL_PANNELLOUO,IMDBDef3.FLD_PANNELLOUO_ROWNAMEPROUO,1,8,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PANNELLOUO, 0);
  }

  private static void Init_TBL_OLDVALUES(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_OLDVALUES, 8);
    IMDB.set_TblCode(IMDBDef3.TBL_OLDVALUES, "TBL_OLDVALUES");
    IMDB.set_FldCode(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMEES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMEUO, "ROWNAMEUO");
    IMDB.SetFldParams(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMEUO,1,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMEFATTO,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMECENTR,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMEPROGE, "ROWNAMEPROGE");
    IMDB.SetFldParams(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMEPROGE,5,9,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMSCHOBI, "ROWNAMSCHOBI");
    IMDB.SetFldParams(IMDBDef3.TBL_OLDVALUES,IMDBDef3.FLD_OLDVALUES_ROWNAMSCHOBI,1,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_OLDVALUES, 0);
  }

  private static void Init_TBL_PANEL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PANEL, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PANEL, "TBL_PANEL");
    IMDB.set_FldCode(IMDBDef3.TBL_PANEL,IMDBDef3.FLD_PANEL_ROWNAMEFINAZ, "ROWNAMEFINAZ");
    IMDB.SetFldParams(IMDBDef3.TBL_PANEL,IMDBDef3.FLD_PANEL_ROWNAMEFINAZ,5,49,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PANEL, 0);
  }

  private static void Init_TBL_FASULLO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_FASULLO, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_FASULLO, "TBL_FASULLO");
    IMDB.set_FldCode(IMDBDef3.TBL_FASULLO,IMDBDef3.FLD_FASULLO_ROWNAMECOUNT, "ROWNAMECOUNT");
    IMDB.SetFldParams(IMDBDef3.TBL_FASULLO,IMDBDef3.FLD_FASULLO_ROWNAMECOUNT,1,999,0);
    IMDB.TblAddNew(IMDBDef3.TBL_FASULLO, 0);
  }

  private static void Init_PQRY_POLPROVARDE8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLPROVARDE8, 39);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLPROVARDE8, "PQRY_POLPROVARDE8");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_NOTA_1, "NOTA_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_NOTA_1,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_NOTA_2, "NOTA_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_NOTA_2,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_NOTA_3, "NOTA_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_NOTA_3,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_NOTA_4, "NOTA_4");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_NOTA_4,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_NOTA_5, "NOTA_5");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_NOTA_5,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_STATO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC, "ISTITUZIONE_NC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_PROPOSTA_VAR_DETT_ID, "PROPOSTA_VAR_DETT_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_PROPOSTA_VAR_DETT_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_COD_REC, "COD_REC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_COD_REC,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_PROPOSTA_VAR_ID, "PROPOSTA_VAR_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_PROPOSTA_VAR_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_BOZZA_VARIAZIONE_ID, "BOZZA_VARIAZIONE_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_BOZZA_VARIAZIONE_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_RECORUNITORG, "RECORUNITORG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_RECORUNITORG,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_IMPORTO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_IMPORTO_2, "IMPORTO_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_IMPORTO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_IMPORTO_3, "IMPORTO_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_IMPORTO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_CONS_SVILUPPO, "CONS_SVILUPPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_CONS_SVILUPPO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_RECORDDESCRI,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_RECORDNOTE, "RECORDNOTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_RECORDNOTE,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_VAR_BIL, "VAR_BIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_VAR_BIL,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID, "SCHEDA_OBIETTIVO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_RECORDGENERA, "RECORDGENERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_RECORDGENERA,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_VARIAZIONE_ID, "VARIAZIONE_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_VARIAZIONE_ID,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE8,IMDBDef12.PQSL_POLPROVARDE8_TITOLO,1,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLPROVARDE8, 0);
  }

  private static void Init_PQRY_PANNELLOUO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PANNELLOUO1, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PANNELLOUO1, "PQRY_PANNELLOUO1");
    IMDB.set_FldCode(IMDBDef12.PQRY_PANNELLOUO1,IMDBDef12.PQSL_PANNELLOUO1_ROWNAMEPROUO, "ROWNAMEPROUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANNELLOUO1,IMDBDef12.PQSL_PANNELLOUO1_ROWNAMEPROUO,1,8,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PANNELLOUO1, 0);
  }

  private static void Init_PQRY_PANNELLOUO1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PANNELLOUO1_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PANNELLOUO1_RS, "PQRY_PANNELLOUO1_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PANNELLOUO1_RS,IMDBDef12.PQSL_PANNELLOUO1_ROWNAMEPROUO, "ROWNAMEPROUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANNELLOUO1_RS,IMDBDef12.PQSL_PANNELLOUO1_ROWNAMEPROUO,1,8,0);
  }

  private static void Init_PQRY_PANEL2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PANEL2, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PANEL2, "PQRY_PANEL2");
    IMDB.set_FldCode(IMDBDef12.PQRY_PANEL2,IMDBDef12.PQSL_PANEL2_ROWNAMEFINAZ, "ROWNAMEFINAZ");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANEL2,IMDBDef12.PQSL_PANEL2_ROWNAMEFINAZ,5,49,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PANEL2, 0);
  }

  private static void Init_PQRY_PANEL2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PANEL2_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PANEL2_RS, "PQRY_PANEL2_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PANEL2_RS,IMDBDef12.PQSL_PANEL2_ROWNAMEFINAZ, "ROWNAMEFINAZ");
    IMDB.SetFldParams(IMDBDef12.PQRY_PANEL2_RS,IMDBDef12.PQSL_PANEL2_ROWNAMEFINAZ,5,49,0);
  }

  private static void Init_PQRY_FASULLO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_FASULLO1, 4);
    IMDB.set_TblCode(IMDBDef12.PQRY_FASULLO1, "PQRY_FASULLO1");
    IMDB.set_FldCode(IMDBDef12.PQRY_FASULLO1,IMDBDef12.PQSL_FASULLO1_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_FASULLO1,IMDBDef12.PQSL_FASULLO1_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FASULLO1,IMDBDef12.PQSL_FASULLO1_ROWNAMNEWEXP, "ROWNAMNEWEXP");
    IMDB.SetFldParams(IMDBDef12.PQRY_FASULLO1,IMDBDef12.PQSL_FASULLO1_ROWNAMNEWEXP,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FASULLO1,IMDBDef12.PQSL_FASULLO1_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef12.PQRY_FASULLO1,IMDBDef12.PQSL_FASULLO1_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_FASULLO1,IMDBDef12.PQSL_FASULLO1_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_FASULLO1,IMDBDef12.PQSL_FASULLO1_CENTRO,5,8,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_FASULLO1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InserimentoAggiornamentoBozzeVariazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public InserimentoAggiornamentoBozzeVariazione()
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
    FormIdx = MyGlb.FRM_INSAGGBOZVAR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "462981D1-7011-4848-BD93-6AC5611B9949";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 644;
    DesignHeight = 710;
    set_Caption(new IDVariant("Inserimento Aggiornamento Bozze Variazione"));
    //
    Frames = new AFrame[5];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 644;
    Frames[1].Height = 684;
    Frames[1].Caption = "Bozze Variazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 684;
    PAN_BOZZEVARIAZI = new IDPanel(w, this, 1, "PAN_BOZZEVARIAZI");
    Frames[1].Content = PAN_BOZZEVARIAZI;
    PAN_BOZZEVARIAZI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BOZZEVARIAZI.VS = MainFrm.VisualStyleList;
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 644-MyGlb.PAN_OFFS_X, 684-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "86ECB930-D294-47BE-84F5-AA5B1F267F35");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 5648, 252, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 48);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BOZZEVARIAZI.InitStatus = 2;
    PAN_BOZZEVARIAZI_Init();
    PAN_BOZZEVARIAZI_InitFields();
    PAN_BOZZEVARIAZI_InitQueries();
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    PAN_BOZZEVARIAZI.SetSubFrame(PFL_BOZZEVARIAZI_PANNELLO,2);
    Frames[2].set_SubFrame(true);
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Fake";
    Frames[2].Parent = this;
    PAN_FAKE = new IDPanel(w, this, 2, "PAN_FAKE");
    Frames[2].Content = PAN_FAKE;
    PAN_FAKE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FAKE.VS = MainFrm.VisualStyleList;
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7A82A002-AD2B-4E4C-9A69-7DB27EAE9DD7");
    PAN_FAKE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 72, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FAKE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FAKE.InitStatus = 2;
    PAN_FAKE_Init();
    PAN_FAKE_InitFields();
    PAN_FAKE_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    PAN_BOZZEVARIAZI.SetSubFrame(PFL_BOZZEVARIAZI_PANEL,3);
    Frames[3].set_SubFrame(true);
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Panel";
    Frames[3].Parent = this;
    PAN_PANEL = new IDPanel(w, this, 3, "PAN_PANEL");
    Frames[3].Content = PAN_PANEL;
    PAN_PANEL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PANEL.VS = MainFrm.VisualStyleList;
    PAN_PANEL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CA721AE4-F508-4980-B535-FAC524CAAE1C");
    PAN_PANEL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 400, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PANEL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PANEL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PANEL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PANEL.InitStatus = 2;
    PAN_PANEL_Init();
    PAN_PANEL_InitFields();
    PAN_PANEL_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    PAN_BOZZEVARIAZI.SetSubFrame(PFL_BOZZEVARIAZI_FASULLO,4);
    Frames[4].set_SubFrame(true);
    Frames[4].FrHidden = true;
    Frames[4].Caption = "POL ELENCO PROG FC";
    Frames[4].Parent = this;
    PAN_POLELENPROFC = new IDPanel(w, this, 4, "PAN_POLELENPROFC");
    Frames[4].Content = PAN_POLELENPROFC;
    PAN_POLELENPROFC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_POLELENPROFC.VS = MainFrm.VisualStyleList;
    PAN_POLELENPROFC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E3F74521-879C-4C9C-8D31-D24DF2C6A516");
    PAN_POLELENPROFC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 184, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_POLELENPROFC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_POLELENPROFC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_POLELENPROFC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_POLELENPROFC.InitStatus = 2;
    PAN_POLELENPROFC_Init();
    PAN_POLELENPROFC_InitFields();
    PAN_POLELENPROFC_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PANNELLOUO, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INSAGGBOZVAR_PANNELLOUO1();
      }
      if (IMDB.TblModified(IMDBDef3.TBL_PANEL, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INSAGGBOZVAR_PANEL2();
      }
      PAN_BOZZEVARIAZI.UpdatePanel(MainFrm);
      PAN_FAKE.UpdatePanel(MainFrm);
      PAN_PANEL.UpdatePanel(MainFrm);
      PAN_POLELENPROFC.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SELEZITITOLI && flRis && IdxPanelActived == PAN_BOZZEVARIAZI.FrIndex)
    {
      if (IdxFieldActived ==PFL_BOZZEVARIAZI_TITOLO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_BOZZEVARIAZI.FrIndex)
    {
      if (IdxFieldActived ==PFL_BOZZEVARIAZI_FATTORE1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_BOZZEVARIAZI.FrIndex)
    {
      if (IdxFieldActived ==PFL_BOZZEVARIAZI_CENTRO1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEFINIMPACC && flRis && IdxPanelActived == PAN_BOZZEVARIAZI.FrIndex)
    {
      if (IdxFieldActived ==PFL_BOZZEVARIAZI_FINANZIAMENT) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAOPERE && flRis && IdxPanelActived == PAN_BOZZEVARIAZI.FrIndex)
    {
      if (IdxFieldActived ==PFL_BOZZEVARIAZI_OPERA) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELPROPBOZZ && flRis && IdxPanelActived == PAN_BOZZEVARIAZI.FrIndex)
    {
      if (IdxFieldActived ==PFL_BOZZEVARIAZI_PROPOSTA) {
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
    return (obj instanceof InserimentoAggiornamentoBozzeVariazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InserimentoAggiornamentoBozzeVariazione.class.getName() : (Glb.ClassWithPackage(InserimentoAggiornamentoBozzeVariazione.class) ? InserimentoAggiornamentoBozzeVariazione.class.getName().substring(InserimentoAggiornamentoBozzeVariazione.class.getPackage().getName().length() + 1) : InserimentoAggiornamentoBozzeVariazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Note
  // **********************************************************************
  public int ApriNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Note Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_NOTE1, IMDBDef4.FLD_NOTE1_ROWNAMENOTE1, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_1, 0));
      IMDB.set_Value(IMDBDef4.TBL_NOTE2, IMDBDef4.FLD_NOTE2_ROWNAMENOTE2, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_2, 0));
      IMDB.set_Value(IMDBDef4.TBL_NOTE3, IMDBDef4.FLD_NOTE3_ROWNAMENOTE3, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_3, 0));
      IMDB.set_Value(IMDBDef4.TBL_NOTE4, IMDBDef4.FLD_NOTE4_ROWNAMENOTE4, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_4, 0));
      IMDB.set_Value(IMDBDef4.TBL_NOTE5, IMDBDef4.FLD_NOTE5_ROWNAMENOTE5, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_5, 0));
      if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_STATO, 0).compareTo((new IDVariant("A")), true)!=0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PAR34, IMDBDef4.FLD_PAR34_ROWNAMEMODIF, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PAR34, IMDBDef4.FLD_PAR34_ROWNAMEMODIF, 0, (new IDVariant("NO")));
      }
      MainFrm.Show(MyGlb.FRM_SPECDIGITEST, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ApriNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi UO Da Voce PEG
  // **********************************************************************
  public int ProponiUODaVocePEG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_PROGRUO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi UO Da Voce PEG Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1, ");
      SQL.append("  MAX(A.PROGR_UNITA_ORGANIZZATIVA) as MAVIBIUOPRUO ");
      SQL.append("from ");
      SQL.append("  VISTA_BILANCIO_UO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO = 'O') ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        v_PROGRUO = QV.Get("MAVIBIUOPRUO", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(1)), true))
      {
        if (IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEMODUO, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGR_UNITA_ORGANIZZATIVA, 0, new IDVariant(v_PROGRUO));
        }
        else
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Modifica Unità Organizzativa non consentita", IDVariant.STRING));
          if (v_PROGRUO.compareTo(IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_RONAUODACOR1, 0), true)!=0)
          {
            MainFrm.set_AlertMessage(v_ERR); 
            IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0, new IDVariant(IDL.ToInteger(PAN_BOZZEVARIAZI.GetOrgValue(PFL_BOZZEVARIAZI_CAPITOLO1)),IDVariant.DECIMAL));
            IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0, IDL.ToInteger(PAN_BOZZEVARIAZI.GetOrgValue(PFL_BOZZEVARIAZI_ARTICOLO1)));
            IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0));
            IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0));
          }
        }
      }
      if (v_CONTATORE.equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMECOLLE, 0, (new IDVariant("NO")));
      }
      else
      {
        IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMECOLLE, 0, (new IDVariant("SI")));
        // IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGR_UNITA_ORGANIZZATIVA, 0, (new IDVariant()));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ProponiUODaVocePEG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voce P E G
  // **********************************************************************
  public int InfoVocePEG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voce P E G Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI453, IMDBDef1.FLD_PARAMETRI453_PARAMES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI622, IMDBDef1.FLD_PARAMETRI622_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI622, IMDBDef1.FLD_PARAMETRI622_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0));
      MainFrm.Show(MyGlb.FRM_INSUVOBIPEVA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "InfoVocePEG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlla Voce P E G
  // **********************************************************************
  public int ControllaVocePEG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlla Voce P E G Body
      // Procedure Body
      // 
      // 
      // NO Nuova voce PEG	
      // 
      // if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC, 0).equals((new IDVariant()), true))
      // {
        // SQL = new StringBuffer();
        // SQL.append("select distinct ");
        // SQL.append("  COUNT(*) as COUNT ");
        // SQL.append("from ");
        // SQL.append("  CAP A, ");
        // SQL.append("  BIL B ");
        // SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        // SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        // SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        // SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        // SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
        // SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
        // SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
        // SQL.append("and   (B.E_S = A.E_S) ");
        // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        // if (!QV.EOF()) QV.MoveNext();
        // if (!QV.EOF())
        // {
        //   v_CONTATORE = QV.Get("COUNT", IDVariant.INTEGER) ;
        // }
        // QV.Close();
        // if (v_CONTATORE.equals((new IDVariant(0)), true))
        // {
          // MainFrm.set_AlertMessage(v_ERR); 
          // Reset();
        // }
      // }
      // else
      // {
        // 
        // Nuova Voce PEG	
        // 
        // SQL = new StringBuffer();
        // SQL.append("select distinct ");
        // SQL.append("  COUNT(*) as COUNT ");
        // SQL.append("from ");
        // SQL.append("  CAP A ");
        // SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        // SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        // SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        // SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        // SQL.append("and   (TO_CHAR ( " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ) || '-' || TO_CHAR ( " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ) NOT IN ");
        // SQL.append("( ");
        // SQL.append("select ");
        // SQL.append("  TO_CHAR ( B.CAPITOLO ) || '-' || TO_CHAR ( B.ARTICOLO ) ");
        // SQL.append("from ");
        // SQL.append("  BIL B ");
        // SQL.append("where (B.E_S = B.E_S) ");
        // SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
        // SQL.append(")) ");
        // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        // if (!QV.EOF()) QV.MoveNext();
        // if (!QV.EOF())
        // {
        //   v_CONTATORE = QV.Get("COUNT", IDVariant.INTEGER) ;
        // }
        // QV.Close();
        // if (v_CONTATORE.equals((new IDVariant(0)), true))
        // {
          // MainFrm.set_AlertMessage(v_ERR); 
          // Reset();
        // }
      // }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ControllaVocePEG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Voce P E G
  // **********************************************************************
  public int ApriVocePEG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SEOBIETTIVI = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_TIPOPEG = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Apri Voce P E G Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A_GET_SE_OBIETTIVI_POL(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as AGESEOBPOSEE ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SEOBIETTIVI = QV.Get("AGESEOBPOSEE", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TIPO_PEG as POLPARTIPPEG ");
      SQL.append("from ");
      SQL.append("  POL_PARAMETRI A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_TIPOPEG = QV.Get("POLPARTIPPEG", IDVariant.STRING) ;
      }
      QV.Close();
      if (IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_RONAESCOREUN, 0).equals((new IDVariant("NO")), true) || PAN_BOZZEVARIAZI.IsNewRow())
      {
        // 
        // ------------- NO NUOVA----------------
        // 
        if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC, 0).equals((new IDVariant()), true))
        {
          if (v_SEOBIETTIVI.compareTo((new IDVariant(0)), true)!=0)
          {
            IMDB.set_Value(IMDBDef1.TBL_PARAMETRI108, IMDBDef1.FLD_PARAMETRI108_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
            IMDB.set_Value(IMDBDef1.TBL_PARAMETRI453, IMDBDef1.FLD_PARAMETRI453_PARAMES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
            MainFrm.Show(MyGlb.FRM_SCVOPEGPECOO, (new IDVariant(-1)).intValue(), this); 
          }
          else
          {
            IMDB.set_Value(IMDBDef1.TBL_PARAMETRI108, IMDBDef1.FLD_PARAMETRI108_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
            IMDB.set_Value(IMDBDef1.TBL_PARAMETRI453, IMDBDef1.FLD_PARAMETRI453_PARAMES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
            MainFrm.Show(MyGlb.FRM_SCVOPEGPESEO, (new IDVariant(-1)).intValue(), this); 
          }
        }
        else
        {
          // 
          // --------------NUOVA----------------
          // 
          if (v_SEOBIETTIVI.compareTo((new IDVariant(0)), true)!=0)
          {
            IMDB.set_Value(IMDBDef1.TBL_PARAMETRI108, IMDBDef1.FLD_PARAMETRI108_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
            IMDB.set_Value(IMDBDef1.TBL_PARAMETRI453, IMDBDef1.FLD_PARAMETRI453_PARAMES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
            MainFrm.Show(MyGlb.FRM_SCVOPEGPENCO, (new IDVariant(-1)).intValue(), this); 
          }
          else
          {
            IMDB.set_Value(IMDBDef1.TBL_PARAMETRI108, IMDBDef1.FLD_PARAMETRI108_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
            IMDB.set_Value(IMDBDef1.TBL_PARAMETRI453, IMDBDef1.FLD_PARAMETRI453_PARAMES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
            MainFrm.Show(MyGlb.FRM_SCVOPEGPENSO, (new IDVariant(-1)).intValue(), this); 
          }
        }
      }
      else
      {
        // 
        // ------- solo con uo collegata a record con cod rec
        // 1
        // 
        IDVariant v_UOCOLLEGATA = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as POPRVADEPRUO ");
        SQL.append("from ");
        SQL.append("  POL_PROPOSTE_VAR_DETT A ");
        SQL.append("where (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEBOZZA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.PROPOSTA_VAR_DETT_ID = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROPOSTA_VAR_DETT_ID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COD_REC = 1) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_UOCOLLEGATA = QV.Get("POPRVADEPRUO", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI131, IMDBDef1.FLD_PARAMETRI131_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI131, IMDBDef1.FLD_PARAMETRI131_ROWNAMEES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI131, IMDBDef1.FLD_PARAMETRI131_PROGR_UNITA_ORGANIZZATIVA, 0, new IDVariant(v_UOCOLLEGATA));
        MainFrm.Show(MyGlb.FRM_SCVOPEGSCAUC, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ApriVocePEG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Reset
  // **********************************************************************
  public int Reset ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Reset Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FATTORE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CENTRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FINANZIAMENTO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_OPERA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_TITOLO, 0, (new IDVariant()));
      // IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC, 0, (new IDVariant()));
      if ((IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0))) && IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_RONAESCOREUN, 0).equals((new IDVariant("NO")), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGR_UNITA_ORGANIZZATIVA, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_PANNELLOUO, IMDBDef3.FLD_PANNELLOUO_ROWNAMEPROUO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef12.PQRY_PANNELLOUO1, IMDBDef12.PQSL_PANNELLOUO1_ROWNAMEPROUO, 0, (new IDVariant()));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "Reset", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Progetto
  // **********************************************************************
  public int InfoProgetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Progetto Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI453, IMDBDef1.FLD_PARAMETRI453_PARAMES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI622, IMDBDef1.FLD_PARAMETRI622_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI622, IMDBDef1.FLD_PARAMETRI622_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI260, IMDBDef1.FLD_PARAMETRI260_PARAMPROGEID, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0));
        MainFrm.Show(MyGlb.FRM_SITUPROGVARI, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "InfoProgetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Obiettivo
  // **********************************************************************
  public int InfoObiettivo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Obiettivo Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI453, IMDBDef1.FLD_PARAMETRI453_PARAMES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI260, IMDBDef1.FLD_PARAMETRI260_PARAMPROGEID, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI406, IMDBDef4.FLD_PARAMETRI406_ROWNAMSCOBID, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI406, IMDBDef4.FLD_PARAMETRI406_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI406, IMDBDef4.FLD_PARAMETRI406_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0));
        MainFrm.Show(MyGlb.FRM_SITUOBIEVARI, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "InfoObiettivo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Fattore
  // **********************************************************************
  public int InfoFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Fattore Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FATTORE, 0))))
      {
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "InfoFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Centro
  // **********************************************************************
  public int InfoCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Centro Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CENTRO, 0))))
      {
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "InfoCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Finanziamento
  // **********************************************************************
  public int InfoFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Finanziamento Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FINANZIAMENTO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI33, IMDBDef1.FLD_PARAMETRI33_PARACODIFINA, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FINANZIAMENTO, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI89, IMDBDef2.FLD_PARAMETRI89_ROWNAMEDATAL, 0, IDL.Today());
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI108, IMDBDef1.FLD_PARAMETRI108_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        MainFrm.Show(MyGlb.FRM_INFFINPERVAR, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "InfoFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Opera
  // **********************************************************************
  public int InfoOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Opera Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_OPERA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMOPERA, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_OPERA, 0));
        MainFrm.Show(MyGlb.FRM_INFSULOPPEVA, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "InfoOpera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Info Buttons
  // **********************************************************************
  public int VisibilitàInfoButtons ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Info Buttons Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0)))
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOPROGBUTT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOPROGBUTT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID, 0)))
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOBIEBUTT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOBIEBUTT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FINANZIAMENTO, 0)))
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOFINANZI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOFINANZI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_OPERA, 0)))
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOPERA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOPERA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "VisibilitàInfoButtons", _e);
      return -1;
    }
  }

  // **********************************************************************
  // TOOLTIPS
  // **********************************************************************
  public int TOOLTIPS ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // TOOLTIPS Body
      // Procedure Body
      // 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_RISORSINTERV,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_RISORSINTERV))).stringValue()); 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_CAPITOLO,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_CAPITOLO))).stringValue()); 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_ARTICOLO,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_ARTICOLO))).stringValue()); 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_POELPRFCDEPR,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_POELPRFCDEPR))).stringValue()); 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_FATTORDESCRI,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_FATTORDESCRI))).stringValue()); 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_POLOBIETDESC,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_POLOBIETDESC))).stringValue()); 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_CENTRIDESCRI,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_CENTRIDESCRI))).stringValue()); 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_FINANZDESCRI,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_FINANZDESCRI))).stringValue()); 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_OPEREDESCRIZ,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_OPEREDESCRIZ))).stringValue()); 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_POVIPRBODEPR,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_POVIPRBODEPR))).stringValue()); 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_TITOLIDESCRI,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_TITOLIDESCRI))).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "TOOLTIPS", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Progetto
  // **********************************************************************
  public int ApriProgetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Progetto Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI260, IMDBDef1.FLD_PARAMETRI260_PARAMUOIMPEG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
        MainFrm.Show(MyGlb.FRM_SCPRCFVNVPEG, (new IDVariant(-1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI353, IMDBDef1.FLD_PARAMETRI353_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI353, IMDBDef1.FLD_PARAMETRI353_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI353, IMDBDef1.FLD_PARAMETRI353_ROWNAMEES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI353, IMDBDef1.FLD_PARAMETRI353_ROWNAMEUOIMP, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
        MainFrm.Show(MyGlb.FRM_SCEPROCFATVA, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ApriProgetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Obiettivo
  // **********************************************************************
  public int ApriObiettivo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Obiettivo Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEMODIF, 0).equals((new IDVariant("NO")), true))
      {
        return 0;
      }
      if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC, 0).equals((new IDVariant()), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI352, IMDBDef1.FLD_PARAMETRI352_PARAMCAPITOL, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI352, IMDBDef1.FLD_PARAMETRI352_PARAMARTICOL, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI352, IMDBDef1.FLD_PARAMETRI352_PARAMES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI352, IMDBDef1.FLD_PARAMETRI352_PARAMUOIMPEG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI352, IMDBDef1.FLD_PARAMETRI352_PARAMPROGEID, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0));
        MainFrm.Show(MyGlb.FRM_SCEOBIVAFUBI, (new IDVariant(-1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI453, IMDBDef1.FLD_PARAMETRI453_PARAMES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI260, IMDBDef1.FLD_PARAMETRI260_PARAMUOIMPEG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI260, IMDBDef1.FLD_PARAMETRI260_PARAMPROGEID, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0));
        MainFrm.Show(MyGlb.FRM_SCOBVANUVOPE, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ApriObiettivo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Fattore
  // **********************************************************************
  public int ApriFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Fattore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ApriFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Centro
  // **********************************************************************
  public int ApriCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Centro Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ApriCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Fin
  // **********************************************************************
  public int ApriFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMOPERA, 0, IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_OPERA, 0),(new IDVariant(-1))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMCAPITOL, 0, IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0),(new IDVariant(-1))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMARTICOL, 0, IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0),(new IDVariant(-1))));
      MainFrm.Show(MyGlb.FRM_SCEFINIMPACC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ApriFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Op
  // **********************************************************************
  public int ApriOp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Op Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI17, IMDBDef1.FLD_PARAMETRI17_ROWNAMEES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI17, IMDBDef1.FLD_PARAMETRI17_ROWNAMEFINAN, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI17, IMDBDef1.FLD_PARAMETRI17_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAOPERE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ApriOp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Disabilita Tutti I Campi
  // **********************************************************************
  public int DisabilitaTuttiICampi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disabilita Tutti I Campi Body
      // Procedure Body
      // 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_PARTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVARIAZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FAKE.SetFlags (Glb.OBJ_FIELD, PFL_FAKE_UNITAORGANIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "DisabilitaTuttiICampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scegli Proposte
  // **********************************************************************
  public int ScegliProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Proposte Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PAR63, IMDBDef1.FLD_PAR63_ROWNAMBOVAID, 0, IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEBOZZA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PAR63, IMDBDef1.FLD_PAR63_ROWNAMEUO, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGR_UNITA_ORGANIZZATIVA, 0));
      MainFrm.Show(MyGlb.FRM_SCELPROPBOZZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ScegliProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Proposta E Calcolo Cod Rec
  // **********************************************************************
  public int VisibilitàPropostaECalcoloCodRec ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Visibilità Proposta E Calcolo Cod Rec Body
      // Procedure Body
      // 
      if (PAN_BOZZEVARIAZI.IsNewRow())
      {
        IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEMODUO, 0, (new IDVariant("SI")));
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        IDVariant v_UOCODREC1 = new IDVariant(0,IDVariant.INTEGER);
        v_CONTATORE = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1, ");
        SQL.append("  MAX(A.PROGR_UNITA_ORGANIZZATIVA) as MAPOPRVADPUO ");
        SQL.append("from ");
        SQL.append("  POL_PROPOSTE_VAR_DETT A ");
        SQL.append("where (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEBOZZA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.PROPOSTA_VAR_DETT_ID = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROPOSTA_VAR_DETT_ID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COD_REC = 1) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          v_UOCODREC1 = QV.Get("MAPOPRVADPUO", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_RONAESCOREUN, 0, (new IDVariant("NO")));
          IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEMODUO, 0, (new IDVariant("SI")));
          if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROPOSTA_VAR_DETT_ID, 0))))
          {
            PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_RONAESCOREUN, 0, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEMODUO, 0, (new IDVariant("NO")));
          IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_RONAUODACOR1, 0, new IDVariant(v_UOCODREC1));
          PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "VisibilitàPropostaECalcoloCodRec", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Voce P E G
  // **********************************************************************
  public int VisibilitàVocePEG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Voce P E G Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0))) && IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0).compareTo((new IDVariant(0)), true)!=0)
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0))) && IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0).compareTo((new IDVariant(0)), true)!=0)
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "VisibilitàVocePEG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Progetto
  // **********************************************************************
  public int ProponiProgetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PROGETTO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_FATTORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CENTRO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DESFATTORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DESCENTRO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Proponi Progetto Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC, 0).equals((new IDVariant("SI")), true))
      {
        return 0;
      }
      // SQL = new StringBuffer();
      // SQL.append("select ");
      // SQL.append("  A.PROGETTO_ID as POELPRFCPRID, ");
      // SQL.append("  A.FATTORE as POLELEPRFCFA, ");
      // SQL.append("  A.CENTRO as POLELEPRFCCE, ");
      // SQL.append("  A.DES_FATTORE as POELPRFCDEFA, ");
      // SQL.append("  A.DES_CENTRO as POELPRFCDECE ");
      // SQL.append("from ");
      // SQL.append("  POL_ELENCO_PROG_FC A ");
      // SQL.append("where (A.ESERCIZIO >= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      // SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      // SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      // SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      // SQL.append("and   (A.ESERCIZIO_STN = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      // if (!QV.EOF()) QV.MoveNext();
      // if (!QV.EOF())
      // {
      //   v_PROGETTO = QV.Get("POELPRFCPRID", IDVariant.STRING) ;
      //   v_FATTORE = QV.Get("POLELEPRFCFA", IDVariant.STRING) ;
      //   v_CENTRO = QV.Get("POLELEPRFCCE", IDVariant.STRING) ;
      //   v_DESFATTORE = QV.Get("POELPRFCDEFA", IDVariant.STRING) ;
      //   v_DESCENTRO = QV.Get("POELPRFCDECE", IDVariant.STRING) ;
      // }
      // QV.Close();
      if ((new IDVariant(PAN_POLELENPROFC.GetNumRows())).equals((new IDVariant(1)), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_IMPECO11, IMDBDef9.PQSL_IMPECO11_PROGETTO_ID, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0, IMDB.Value(IMDBDef12.PQRY_FASULLO1, IMDBDef12.PQSL_FASULLO1_PROGETTO_ID, 0));
        }
        if (!(IDL.IsNull(v_FATTORE)) && (PAN_BOZZEVARIAZI.bFields(PFL_BOZZEVARIAZI_FATTORE1).IsVisible(PAN_BOZZEVARIAZI.AttR) && PAN_BOZZEVARIAZI.bFields(PFL_BOZZEVARIAZI_FATTORE1).IsPresent()))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FATTORE, 0, IMDB.Value(IMDBDef12.PQRY_FASULLO1, IMDBDef12.PQSL_FASULLO1_FATTORE, 0));
        }
        if (!(IDL.IsNull(v_CENTRO)) && (PAN_BOZZEVARIAZI.bFields(PFL_BOZZEVARIAZI_CENTRO1).IsVisible(PAN_BOZZEVARIAZI.AttR) && PAN_BOZZEVARIAZI.bFields(PFL_BOZZEVARIAZI_CENTRO1).IsPresent()))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CENTRO, 0, IMDB.Value(IMDBDef12.PQRY_FASULLO1, IMDBDef12.PQSL_FASULLO1_CENTRO, 0));
        }
        PAN_BOZZEVARIAZI.UpdatePanel(MainFrm);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ProponiProgetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Obiettivo
  // **********************************************************************
  public int ProponiObiettivo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SCHEDA = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Proponi Obiettivo Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC, 0).equals((new IDVariant("SI")), true))
      {
        return 0;
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(DISTINCT A.SCHEDA_OBIETTIVO_ID) as DICOPOEOFSOI, ");
      SQL.append("  MAX(A.SCHEDA_OBIETTIVO_ID) as MAPOELOBFSOI ");
      SQL.append("from ");
      SQL.append("  POL_ELENCO_OB_FC A, ");
      SQL.append("  POL_SCHEDE_OBIETTIVO B ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (NVL(A.PROGETTO_ID, '-1') = NVL(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.PROGETTO_ID, '-1'))) ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO_STN = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.SCHEDA_OBIETTIVO_ID = A.SCHEDA_OBIETTIVO_ID) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("DICOPOEOFSOI", IDVariant.INTEGER) ;
        v_SCHEDA = QV.Get("MAPOELOBFSOI", IDVariant.DECIMAL) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID, 0, new IDVariant(v_SCHEDA));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ProponiObiettivo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Checkfattorecentro
  // **********************************************************************
  public boolean Checkfattorecentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RETURN = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Checkfattorecentro Body
      // Procedure Body
      // 
      v_RETURN = (new IDVariant(-1));
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0))) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID, 0)))
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  POL_ELENCO_PROG_FC A ");
        SQL.append("where (A.ESERCIZIO >= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.PROGETTO_ID = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CENTRO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CENTRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ESERCIZIO_STN = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Fattore o Centro diversi da quelli collegati al Progetto", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          v_RETURN = (new IDVariant(0));
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID, 0))))
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  POL_ELENCO_OB_FC A ");
        SQL.append("where (A.ESERCIZIO >= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.PROGETTO_ID = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.SCHEDA_OBIETTIVO_ID = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CENTRO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CENTRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ESERCIZIO_STN = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Fattore o Centro diversi da quelli collegati all'obiettivo", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          v_RETURN = (new IDVariant(0));
        }
      }
      return v_RETURN.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "Checkfattorecentro", _e);
      return false;
    }
  }

  // **********************************************************************
  // Visibilità Finanziamento Opera Panel
  // **********************************************************************
  public int VisibilitàFinanziamentoOperaPanel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Finanziamento Opera Panel Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC, 0).compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FINANZIAMENTO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_OPERA, 0))))
        {
          IMDB.set_Value(IMDBDef3.TBL_PANEL, IMDBDef3.FLD_PANEL_ROWNAMEFINAZ, 0, IDL.Add(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FINANZIAMENTO, 0)), (new IDVariant("@"))), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_OPERA, 0))));
        }
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PANEL.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOFINANZI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOPERA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PANEL.set_Visible((new IDVariant(0)).booleanValue());
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "VisibilitàFinanziamentoOperaPanel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Titoli
  // **********************************************************************
  public int ApriTitoli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Titoli Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI97, IMDBDef1.FLD_PARAMETRI97_ROWNAMEES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
      MainFrm.Show(MyGlb.FRM_SELEZITITOLI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ApriTitoli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Titolo
  // **********************************************************************
  public int ProponiTitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TITOLO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Titolo Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TITOLO as CAPTITOLO ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_TITOLO = QV.Get("CAPTITOLO", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (!(IDL.IsNull(v_TITOLO)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_TITOLO, 0, new IDVariant(v_TITOLO));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ProponiTitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Reset Old Values
  // **********************************************************************
  public int ResetOldValues ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Reset Old Values Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMECAPIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEARTIC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEES, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEUO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEFATTO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMECENTR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEPROGE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMSCHOBI, 0, (new IDVariant()));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "ResetOldValues", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      if (MainFrm.VisualizzaRisorsaIntevento(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEVISUA, 0, (new IDVariant("SI")));
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEVISUA, 0, (new IDVariant("NO")));
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLARGE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.IsNull(MainFrm.GESTIOECONOM))
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(MainFrm.FINANZIAMENT.booleanValue()))
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PANEL.set_Visible((new IDVariant(0)).booleanValue());
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEMODIF, 0).equals((new IDVariant("NO")), true))
      {
        // PAN_BOZZEVARIAZI.set_Locked((new IDVariant(-1)).booleanValue());
        // PAN_BOZZEVARIAZI.set_iLockable((new IDVariant(0)).booleanValue());
        // PAN_FAKE.set_Locked((new IDVariant(-1)).booleanValue());
        // PAN_FAKE.set_iLockable((new IDVariant(0)).booleanValue());
        DisabilitaTuttiICampi();
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PANEL.SetFlags (Glb.OBJ_FIELD, PFL_PANEL_FINANZIOPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_BOZZEVARIAZI.set_Header(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_ESERCIZIO3, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).stringValue());
      PAN_BOZZEVARIAZI.set_Header(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_ESERCIZIO1, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)))).stringValue());
      PAN_BOZZEVARIAZI.set_Header(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_ESERCIZIO2, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2)))).stringValue());
      PAN_BOZZEVARIAZI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEINSER, 0).equals((new IDVariant("NO")), true))
      {
        PAN_BOZZEVARIAZI.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      }
      else
      {
        PAN_BOZZEVARIAZI.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(-1)).booleanValue()); 
      }
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "LoadEvent", _e);
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
      if (Result.equals((new IDVariant(-1)), true))
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SPECDIGITEST)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_1, 0, IMDB.Value(IMDBDef12.PQRY_NOTE7, IMDBDef12.PQSL_NOTE7_ROWNAMENOTE1, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_2, 0, IMDB.Value(IMDBDef12.PQRY_NOTE8, IMDBDef12.PQSL_NOTE8_ROWNAMENOTE2, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_3, 0, IMDB.Value(IMDBDef12.PQRY_NOTE9, IMDBDef12.PQSL_NOTE9_ROWNAMENOTE3, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_4, 0, IMDB.Value(IMDBDef12.PQRY_NOTE10, IMDBDef12.PQSL_NOTE10_ROWNAMENOTE4, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_5, 0, IMDB.Value(IMDBDef12.PQRY_NOTE11, IMDBDef12.PQSL_NOTE11_ROWNAMENOTE5, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEVOPEGDABI)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP17, IMDBDef7.PQSL_CAP17_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP17, IMDBDef7.PQSL_CAP17_ARTICOLO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEVOPEGNOBI)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP18, IMDBDef7.PQSL_CAP18_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP18, IMDBDef7.PQSL_CAP18_ARTICOLO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCPRCFVNVPEG)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI9, IMDBDef7.PQSL_PROGETTI9_PROGETTO_ID, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEPROCFATVA)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI3, IMDBDef7.PQSL_PROGETTI3_PROGETTO_ID, 0));
          if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FATTORE, 0)) && (PAN_BOZZEVARIAZI.bFields(PFL_BOZZEVARIAZI_FATTORE1).IsVisible(PAN_BOZZEVARIAZI.AttR) && PAN_BOZZEVARIAZI.bFields(PFL_BOZZEVARIAZI_FATTORE1).IsPresent()))
          {
            IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI3, IMDBDef7.PQSL_PROGETTI3_FATTORE, 0));
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CENTRO, 0)) && (PAN_BOZZEVARIAZI.bFields(PFL_BOZZEVARIAZI_CENTRO1).IsVisible(PAN_BOZZEVARIAZI.AttR) && PAN_BOZZEVARIAZI.bFields(PFL_BOZZEVARIAZI_CENTRO1).IsPresent()))
          {
            IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CENTRO, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI3, IMDBDef7.PQSL_PROGETTI3_CENTRO, 0));
          }
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCOBVANUVOPE)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID, 0, IMDB.Value(IMDBDef7.PQRY_POLELENCOBF1, IMDBDef7.PQSL_POLELENCOBF1_SCHEDA_OBIETTIVO_ID, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEOBIVAFUBI)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID, 0, IMDB.Value(IMDBDef7.PQRY_POLELENCOBFC, IMDBDef7.PQSL_POLELENCOBFC_SCHEDA_OBIETTIVO_ID, 0));
          if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC, 0).equals((new IDVariant()), true) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0)))
          {
            IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0, IMDB.Value(IMDBDef7.PQRY_POLELENCOBFC, IMDBDef7.PQSL_POLELENCOBFC_PROGETTO_ID, 0));
          }
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CENTRO, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEFINIMPACC)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FINANZIAMENTO, 0, IMDB.Value(IMDBDef7.PQRY_FINANZIAME10, IMDBDef7.PQSL_FINANZIAME10_CODICE, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAOPERE)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_OPERA, 0, IMDB.Value(IMDBDef7.PQRY_OPERE5, IMDBDef7.PQSL_OPERE5_CODICE, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELPROPBOZZ)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROPOSTA_VAR_ID, 0, IMDB.Value(IMDBDef7.PQRY_POLVISPROBOZ, IMDBDef7.PQSL_POLVISPROBOZ_PROPOSTA_VAR_ID, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCVOPEGSCAUC)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP15, IMDBDef7.PQSL_CAP15_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP15, IMDBDef7.PQSL_CAP15_ARTICOLO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SELEZITITOLI)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_TITOLO, 0, IMDB.Value(IMDBDef7.PQRY_TITOLI3, IMDBDef7.PQSL_TITOLI3_TITOLO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCVOPEGPECOO)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP21, IMDBDef7.PQSL_CAP21_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP21, IMDBDef7.PQSL_CAP21_ARTICOLO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCVOPEGPESEO)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP19, IMDBDef7.PQSL_CAP19_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP19, IMDBDef7.PQSL_CAP19_ARTICOLO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCVOPEGPENCO)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP22, IMDBDef7.PQSL_CAP22_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP22, IMDBDef7.PQSL_CAP22_ARTICOLO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCVOPEGPENSO)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP20, IMDBDef7.PQSL_CAP20_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAP20, IMDBDef7.PQSL_CAP20_ARTICOLO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "EndModalEvent", _e);
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
      ResetOldValues();
      ((BozzeVariazione)MainFrm.GetForm(MyGlb.FRM_BOZZEVARIAZI,0)).PAN_BOZZEVARIAZI.PanelCommand(Glb.PCM_REQUERY);
      IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEBOZZA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMVADEID, 0, ((new IDVariant())));
      IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNADACORE1, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PANNELLOUO, IMDBDef3.FLD_PANNELLOUO_ROWNAMEPROUO, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Variazione On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_BOZZEVARIAZI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_BOZZEVARIAZI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Bozze Variazione On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "BozzeVariazioneOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Variazione On Change Layout Event
  // Evento notificato dal pannello al cambiamento del layout
  // (da dettaglio a lista o viceversa)
  // New Layout: E' un numero intero che rappresenta il nuovo layout che sta per essere applicato al pannello. Deve essere confrontato con i valori della lista LayoutValues (Form, List). - Input
  // Cancel: E' un parametro booleano di input/output che può essere impostato a True per evitare che avvenga il cambio di layout. - Input/Output
  // **********************************************************************
  private void PAN_BOZZEVARIAZI_OnChangeLayout(IDVariant NewLayout,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Bozze Variazione On Change Layout Event Body
      // Procedure Body
      // 
      if (NewLayout.equals((new IDVariant(1)), true))
      {
        PAN_BOZZEVARIAZI.set_VisualStyle(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_PARTE,new IDVariant(MyGlb.VIS_OPTIONBUTTON).intValue()); 
      }
      else
      {
        PAN_BOZZEVARIAZI.set_VisualStyle(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_PARTE,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "BozzeVariazioneOnChangeLayoutEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Variazione On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BOZZEVARIAZI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_BOZZEVARIAZI);
      // 
      // Bozze Variazione On Dynamic Properties Event Body
      // Procedure Body
      // 
      TOOLTIPS();
      VisibilitàInfoButtons();
      VisibilitàVocePEG();
      VisibilitàFinanziamentoOperaPanel();
      if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0).equals((new IDVariant("E")), true))
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      // 
      // UOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
      // 
      if (((IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0))) && IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC, 0).equals((new IDVariant("SI")), true)) || (IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMECOLLE, 0).equals((new IDVariant("NO")), true)))
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEMODUO, 0).equals((new IDVariant("NO")), true))
        {
          IMDB.set_Value(IMDBDef3.TBL_PANNELLOUO, IMDBDef3.FLD_PANNELLOUO_ROWNAMEPROUO, 0, IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEUO, 0));
        }
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANNELLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FAKE.set_Visible((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FAKE.set_Visible((new IDVariant(0)).booleanValue());
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANNELLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IMDB.set_Value(IMDBDef3.TBL_PANNELLOUO, IMDBDef3.FLD_PANNELLOUO_ROWNAMEPROUO, 0, (new IDVariant()));
      }
      // 
      // NOTEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_1, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_2, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_3, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_4, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_NOTA_5, 0)))
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAPIENA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAVUOTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAPIENA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAVUOTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC, 0).compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0)))
        {
          PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "BozzeVariazioneOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Variazione After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_BOZZEVARIAZI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Bozze Variazione After Find Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEUO, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGR_UNITA_ORGANIZZATIVA, 0));
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEFATTO, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FATTORE, 0));
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMECENTR, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CENTRO, 0));
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEPROGE, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0));
      IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMSCHOBI, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID, 0),IDVariant.INTEGER));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  VISTA_BILANCIO_UO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO = 'O') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMECOLLE, 0, (new IDVariant("NO")));
      }
      else
      {
        IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMECOLLE, 0, (new IDVariant("SI")));
      }
      VisibilitàPropostaECalcoloCodRec();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "BozzeVariazioneAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Variazione On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_BOZZEVARIAZI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TEST = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Bozze Variazione On Updating Row Event Body
      // Procedure Body
      // 
      v_TEST = (new IDVariant(0));
      if ((IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0).compareTo(IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEARTIC, 0), true)!=0) || (IDL.IsNull(IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEARTIC, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0)))))
      {
        v_TEST = (new IDVariant(-1));
      }
      else
      {
        v_TEST = (new IDVariant(0));
      }
      if ((IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0).compareTo(IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMECAPIT, 0), true)!=0) || v_TEST.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0));
        Reset();
        if ((new IDVariant(MainFrm.VisualizzaRisorsaIntevento(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))).equals((new IDVariant(-1)), true))
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0))))
          {
            ProponiTitolo();
            ProponiUODaVocePEG();
            // ProponiProgetto();
            ProponiObiettivo();
          }
          else
          {
            // 
            // Voce PEG NUlla
            // 
            IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMECOLLE, 0, (new IDVariant("NO")));
            IMDB.set_Value(IMDBDef12.PQRY_PANNELLOUO1, IMDBDef12.PQSL_PANNELLOUO1_ROWNAMEPROUO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef3.TBL_PANNELLOUO, IMDBDef3.FLD_PANNELLOUO_ROWNAMEPROUO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGR_UNITA_ORGANIZZATIVA, 0, (new IDVariant()));
          }
        }
        else
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0))))
          {
            ProponiTitolo();
            ProponiUODaVocePEG();
            // ProponiProgetto();
            ProponiObiettivo();
          }
          else
          {
            // 
            // VOCE PEG NULLA
            // 
            IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMECOLLE, 0, (new IDVariant("NO")));
            IMDB.set_Value(IMDBDef12.PQRY_PANNELLOUO1, IMDBDef12.PQSL_PANNELLOUO1_ROWNAMEPROUO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef3.TBL_PANNELLOUO, IMDBDef3.FLD_PANNELLOUO_ROWNAMEPROUO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGR_UNITA_ORGANIZZATIVA, 0, (new IDVariant()));
          }
        }
      }
      if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0).compareTo(IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEES, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEES, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0));
        Reset();
        IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0, (new IDVariant()));
        if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_E_S, 0).equals((new IDVariant("E")), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CONS_SVILUPPO, 0, (new IDVariant()));
        }
        else
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CONS_SVILUPPO, 0)))
          {
            IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CONS_SVILUPPO, 0, (new IDVariant("C")));
          }
        }
      }
      if (!(Inserting.booleanValue()) && IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_RONAESCOREUN, 0).equals((new IDVariant("SI")), true))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Modifica Unità Organizzativa non consentita", IDVariant.STRING));
        if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGR_UNITA_ORGANIZZATIVA, 0).compareTo(IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEUO, 0), true)!=0)
        {
          MainFrm.set_AlertMessage(v_ERR); 
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGR_UNITA_ORGANIZZATIVA, 0, IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEUO, 0));
        }
      }
      if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0).compareTo(IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEPROGE, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEPROGE, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGETTO_ID, 0))))
        {
          ProponiObiettivo();
        }
        else
        {
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_SCHEDA_OBIETTIVO_ID, 0, (new IDVariant()));
        }
      }
      if (IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEFATTO, 0).compareTo(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FATTORE, 0), true)!=0 || IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CENTRO, 0).compareTo(IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMECENTR, 0), true)!=0)
      {
        IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEFATTO, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FATTORE, 0));
        IMDB.set_Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMECENTR, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CENTRO, 0));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FATTORE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CENTRO, 0))) && IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC, 0).equals((new IDVariant()), true))
        {
          Checkfattorecentro();
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "BozzeVariazioneOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Variazione Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_BOZZEVARIAZI_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MAXPLUSONE = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Bozze Variazione Before Insert Event Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.PROPOSTA_VAR_DETT_ID) + 1 as MAPOPRPRVDI1 ");
      SQL.append("from ");
      SQL.append("  POL_PROPOSTE_VAR_DETT A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_MAXPLUSONE = QV.Get("MAPOPRPRVDI1", IDVariant.DECIMAL) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_COD_REC, 0, (new IDVariant(2)));
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_BOZZA_VARIAZIONE_ID, 0, new IDVariant(IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEBOZZA, 0),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROPOSTA_VAR_DETT_ID, 0, new IDVariant(v_MAXPLUSONE));
      IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMVADEID, 0, new IDVariant(new IDVariant(v_MAXPLUSONE),IDVariant.INTEGER));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "BozzeVariazioneBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Variazione Before Update Event
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel: Se impostato a True non effettua l'aggiornamento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_BOZZEVARIAZI_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Bozze Variazione Before Update Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "BozzeVariazioneBeforeUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Variazione After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_BOZZEVARIAZI_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Bozze Variazione After Commit Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "BozzeVariazioneAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Variazione On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_BOZZEVARIAZI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Bozze Variazione On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(32)), true) || Command.equals((new IDVariant(64)), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_PANNELLOUO, IMDBDef3.FLD_PANNELLOUO_ROWNAMEPROUO, 0, IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEUO, 0));
      }
      if (Command.equals((new IDVariant(8)), true))
      {
        ResetOldValues();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "BozzeVariazioneOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Fake On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_FAKE_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_FAKE, Cancel);
      // 
      // Fake On Validate Row Event Body
      // Procedure Body
      // 
      if (((IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_CAPITOLO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ARTICOLO, 0))) && IMDB.Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_ISTITUZIONE_NC, 0).equals((new IDVariant("SI")), true)) || IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMECOLLE, 0).equals((new IDVariant("NO")), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGR_UNITA_ORGANIZZATIVA, 0, IMDB.Value(IMDBDef12.PQRY_PANNELLOUO1, IMDBDef12.PQSL_PANNELLOUO1_ROWNAMEPROUO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "FakeOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Fake On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_FAKE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Fake On Updating Row Event Body
      // Procedure Body
      // 
      if (!(PAN_BOZZEVARIAZI.IsNewRow()) && IMDB.Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_RONAESCOREUN, 0).equals((new IDVariant("SI")), true))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Modifica Unità Organizzativa non consentita", IDVariant.STRING));
        if (IMDB.Value(IMDBDef12.PQRY_PANNELLOUO1, IMDBDef12.PQSL_PANNELLOUO1_ROWNAMEPROUO, 0).compareTo(IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEUO, 0), true)!=0)
        {
          MainFrm.set_AlertMessage(v_ERR); 
          IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_PROGR_UNITA_ORGANIZZATIVA, 0, IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEUO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PANNELLOUO1, IMDBDef12.PQSL_PANNELLOUO1_ROWNAMEPROUO, 0, IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEUO, 0));
          IMDB.set_Value(IMDBDef3.TBL_PANNELLOUO, IMDBDef3.FLD_PANNELLOUO_ROWNAMEPROUO, 0, IMDB.Value(IMDBDef3.TBL_OLDVALUES, IMDBDef3.FLD_OLDVALUES_ROWNAMEUO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "FakeOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Panel On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PANEL_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PANEL, Cancel);
      // 
      // Panel On Validate Row Event Body
      // Procedure Body
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PANEL2, IMDBDef12.PQSL_PANEL2_ROWNAMEFINAZ, 0),(new IDVariant("@"))).compareTo((new IDVariant("@")), true)!=0)
      {
        IDVariant v_FINOPE = new IDVariant(0,IDVariant.STRING);
        v_FINOPE = IMDB.Value(IMDBDef12.PQRY_PANEL2, IMDBDef12.PQSL_PANEL2_ROWNAMEFINAZ, 0);
        IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FINANZIAMENTO, 0, IDL.ToInteger(MainFrm.Sottostringapb(v_FINOPE, (new IDVariant("@")))));
        IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_OPERA, 0, IDL.ToInteger(v_FINOPE));
      }
      else
      {
        IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_FINANZIAMENTO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef12.PQRY_POLPROVARDE8, IMDBDef12.PQSL_POLPROVARDE8_OPERA, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "PanelOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Panel On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PANEL_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PANEL);
      // 
      // Panel On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PANEL2, IMDBDef12.PQSL_PANEL2_ROWNAMEFINAZ, 0),(new IDVariant("@"))).compareTo((new IDVariant("@")), true)!=0)
      {
        PAN_PANEL.SetFlags (Glb.OBJ_FIELD, PFL_PANEL_INFOFINANZIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PANEL.SetFlags (Glb.OBJ_FIELD, PFL_PANEL_INFOOPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PANEL.SetFlags (Glb.OBJ_FIELD, PFL_PANEL_INFOFINANZIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PANEL.SetFlags (Glb.OBJ_FIELD, PFL_PANEL_INFOOPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "PanelOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // POL ELENCO PROG FC After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_POLELENPROFC_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // POL ELENCO PROG FC After Find Event Body
      // Procedure Body
      // 
      ProponiProgetto();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InserimentoAggiornamentoBozzeVariazione", "POLELENCOPROGFCAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Pannello UO
  // Primary record source for panel data
  // **********************************************************************
  private void INSAGGBOZVAR_PANNELLOUO1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PANNELLOUO1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PANNELLOUO, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PANNELLOUO, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PANNELLOUO1_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PANNELLOUO1_RS, 0, IMDBDef3.TBL_PANNELLOUO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PANNELLOUO1_RS, 0, 0, IMDBDef3.TBL_PANNELLOUO, IMDBDef3.FLD_PANNELLOUO_ROWNAMEPROUO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PANNELLOUO, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PANNELLOUO, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PANNELLOUO, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PANNELLOUO1_RS, 0);
  }

  // **********************************************************************
  // Panel
  // Primary record source for panel data
  // **********************************************************************
  private void INSAGGBOZVAR_PANEL2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PANEL2_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PANEL, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PANEL, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PANEL2_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PANEL2_RS, 0, IMDBDef3.TBL_PANEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PANEL2_RS, 0, 0, IMDBDef3.TBL_PANEL, IMDBDef3.FLD_PANEL_ROWNAMEFINAZ, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PANEL, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PANEL, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PANEL, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PANEL2_RS, 0);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BOZZEVARIAZI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BOZZEVARIAZI, Cancel);
    // Stub
  }

  private void PAN_BOZZEVARIAZI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_APRIVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVocePEG();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_INFOVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVocePEG();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_TITOLO)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriTitoli();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_PROGETTO)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProgetto();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_OBIETTIVO)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriObiettivo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_FATTORE1)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_CENTRO1)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_FINANZIAMENT)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_OPERA)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriOp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_NOTE1)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_NOTAPIENA)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_NOTAVUOTA)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_INFOPROGBUTT)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProgetto();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_INFOOBIEBUTT)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoObiettivo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_PROPOSTA)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_INFOFINANZI1)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoFinanziamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_INFOOPERA1)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoOpera();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_BOZZEVARIAZI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_BOZZEVARIAZI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_BOZZEVARIAZI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BOZZEVARIAZI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_FAKE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FAKE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FAKE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FAKE);
    // Stub
  }

  private void PAN_FAKE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FAKE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FAKE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_FAKE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FAKE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PANEL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PANEL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_PANEL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PANEL_INFOFINANZIA)
    {
      this.IdxPanelActived = this.PAN_PANEL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoFinanziamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PANEL_INFOOPERA)
    {
      this.IdxPanelActived = this.PAN_PANEL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoOpera();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PANEL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PANEL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PANEL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_POLELENPROFC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_POLELENPROFC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_POLELENPROFC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_POLELENPROFC, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_POLELENPROFC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_POLELENPROFC);
    // Stub
  }

  private void PAN_POLELENPROFC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_POLELENPROFC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_POLELENPROFC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_POLELENPROFC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BOZZEVARIAZI_Init()
  {

    PAN_BOZZEVARIAZI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BOZZEVARIAZI.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, "4990A287-895A-453F-AA2D-9153BEB83355");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, "Voce P.e.g.");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, MyGlb.VIS_GROUPSTYLE);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, MyGlb.PANEL_LIST, 0, -9999, 356, 0, 0, 0);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, MyGlb.PANEL_FORM, 12, 32, 556, 124, 0, 0);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, 0, 60);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, 1, 13);
    PAN_BOZZEVARIAZI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, 0, 1);
    PAN_BOZZEVARIAZI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, 1, 1);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_INSERIMENTO, "CAECF5F9-B420-4F32-91D9-8CF8E488EB03");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_INSERIMENTO, "Inserimento");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_INSERIMENTO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_INSERIMENTO, MyGlb.PANEL_LIST, 0, -9999, 120, 21, 0, 0);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_INSERIMENTO, MyGlb.PANEL_FORM, 28, 539, 268, 49, 0, 0);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_INSERIMENTO, 0, 70);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_INSERIMENTO, 1, 13);
    PAN_BOZZEVARIAZI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_INSERIMENTO, 0, 4);
    PAN_BOZZEVARIAZI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_INSERIMENTO, 1, 4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_AGGIORNAMENT, "A0D17C5E-25B0-43E8-B675-EDE1FD4F40C2");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_AGGIORNAMENT, "Aggiornamento");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_AGGIORNAMENT, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, -9999, 112, 21, 0, 0);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_AGGIORNAMENT, MyGlb.PANEL_FORM, 308, 539, 264, 49, 0, 0);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_AGGIORNAMENT, 0, 88);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_AGGIORNAMENT, 1, 13);
    PAN_BOZZEVARIAZI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_AGGIORNAMENT, 0, 4);
    PAN_BOZZEVARIAZI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_AGGIORNAMENT, 1, 4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BOZZEVARIAZI.SetSize(MyGlb.OBJ_FIELD, 72);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, "BA91F124-35A1-4440-906A-34EF004E2CA1");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, "NOTA 1");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, "A425AD75-9435-4707-B4F2-C89FFE46F173");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, "NOTA 2");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, "564FB1E0-F1A5-455E-8292-0A8160BC9245");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, "NOTA 3");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, "C86A75B5-0F74-4D0F-A60C-AD1C470FDDFF");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, "NOTA 4");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, "9B4C06DE-DD36-4EFF-81C5-07B43ED2EAA0");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, "NOTA 5");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, "11F71C5C-CE5C-4987-8452-E4745B07643E");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, "Stato");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PARTE, "8C5E419D-D8CE-4F01-9DEF-56E5CB3B692E");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PARTE, "Parte");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PARTE, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, "B03D1482-E0B9-4006-BBDF-AEC6D20C819E");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, "Capitolo/Art.");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, MyGlb.VIS_VUOTOGRASSET);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, "6A3ACA03-9480-4064-840D-8857ECC7DBFA");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, "Capitolo");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, "2158F8EB-DD0B-4073-9BFA-0F535EC40DAF");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, "Articolo");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, "964728DA-3235-4BAF-8435-8CC2B1AB5409");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, "Nuova");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.VIS_CHECKSTYLE);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, "7A4A03DF-3EBD-4DD7-B74A-89374C2C5422");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, "Risorsa Intervento");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, "14119BE8-786E-4E17-B4CB-436DCF31D380");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, "Capitolo  ");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, "B5414A34-D663-484B-9C4E-B2796FB80AB6");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, "Articolo ");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, "8BC0A301-1333-4930-BBC0-7AFB0E7037A0");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, "/");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, "DD370A96-E0D0-48EC-B4E7-6ED7164F32BD");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_BOZZEVARIAZI.SetImage(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, 0, "wsearch1.gif", false);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, "FC03EDD3-8C69-4B2E-905C-4CE67DE3E24D");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_BOZZEVARIAZI.SetImage(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, 0, "info.gif", false);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, "2F6E7C56-9BB2-4956-86F5-895FD2B3023A");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, "Voce P.e.g.");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, MyGlb.VIS_LABEVISUSTYL);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, 0 | MyGlb.FLD_INLIST, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLARGE, "94E38FFB-7121-4A35-A3E0-B175288530EE");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLARGE, "Voce P.e.g.");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLARGE, MyGlb.VIS_LABEVISUSTYL);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLARGE, 0 | MyGlb.FLD_INLIST, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, "442248EF-28FB-4E3C-9216-22DCEEDED6A0");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, "Titolo");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLIDESCRI, "26F6BC92-FAB2-4C1E-A957-C307E77E0749");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLIDESCRI, "TITOLI DESCRIZIONE");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLIDESCRI, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, "C02B1D7A-EEEA-4FA6-9582-6906D0BF734C");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, "Unità Organizzativa");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTI, "A644B974-FA30-46D1-90EA-4323F20D1CF5");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTI, "Importi");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTI, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTI, MyGlb.VIS_NORFIECF4IMP);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, "CE8368A9-05C0-47A0-92C3-30E8B77F9791");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, "IMPORTO 2");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, "CF94DE6C-ECAF-44FB-B4CF-DC42753184E5");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, "IMPORTO 3");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, "043A77D4-F2F4-4A82-A028-5373B89F2A6D");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, "PROPOSTA VAR DETT ID");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA1, "1364F4D3-4BB6-4B31-8462-CA1A80C3002A");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA1, "Proposta");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA1, MyGlb.VIS_NONNULLAFIEL);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA1, 0, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, "F9CC36A0-A29E-40B4-8766-77C3D5E69511");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, "BOZZA VARIAZIONE ID");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, "7B17414E-98FE-45FE-9197-C5DF4DEA9054");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, "Cons./Svil.");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.VIS_OPTIONBUTTON);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVARIAZIO, "2033EA84-EAD8-48AB-828B-EA52A282BE5C");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVARIAZIO, "Tipo Variazione");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVARIAZIO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, "ABC07009-39FB-4D9A-AA23-63C3EBF90094");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, "Descrizione ");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, "C2BB5780-7119-485B-8E38-5CB52E31E6BD");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, "Var.Bil.");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.VIS_CHECKSTYLE);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, "70E68B6C-34AB-42BA-A5DA-430523E244A8");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, "Obiettivo Operativo");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POELPRFCDEPR, "769DE75E-B5AD-4837-884E-CAE3C3E55410");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POELPRFCDEPR, "POL ELENCO PROG FC DES PROGETTO");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POELPRFCDEPR, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POELPRFCDEPR, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POELPRFCDEPR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, "D8926666-9ABF-45DC-960C-829D85976589");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, "Obiettivo Gestionale");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POLOBIETDESC, "7865E1B0-6C7E-47C3-A301-670CB716C325");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POLOBIETDESC, "POL OBIETTIVI DESCRIZIONE");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POLOBIETDESC, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POLOBIETDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POLOBIETDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, "70472C67-2A9D-4819-9B48-6EB30BCB30FC");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, "Fattore");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, "9BB097A2-FBF5-4D48-98EA-A58937D0284B");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, "BB331780-CA33-4AF0-8921-947E33DCB82B");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, "Centro");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, "46524C81-5305-4121-A1FA-62E8C6FB2227");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, "3A2D6677-CF4F-46E2-BA34-4C040ED3B101");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, "Finanziamento");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, "D6B4CB70-2B0D-4A8D-9D9E-993C6ED79ED4");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, "Opera");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, "85AEA948-480D-4501-B31C-5D0C1D7D32AC");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, "Variazione");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, "0FCF8D06-2995-446E-8793-DAD9A13CAC73");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, "Generata");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.VIS_CHECKSTYLE);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, "761552D9-47A7-4594-95F4-5232D765BB53");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, "Descrizione");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, "23DEE910-D080-4268-8AE0-7CFDBC4E5DC8");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, "Note");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.VIS_HYPELINKIMMA);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, "7CFBE06D-D0C6-4F2E-99DD-CBEAEED2FD50");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, "SCHEDA OBIETTIVO ID");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, "12EB594C-8F8F-4A08-A1E3-CAA130569776");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, "VARIAZIONE ID");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTILABEL, "01AEDFA5-6910-4719-A7E6-097E87E09BB8");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTILABEL, "Importi");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTILABEL, MyGlb.VIS_LABVISSTINGR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTILABEL, 0 | MyGlb.FLD_INLIST, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANNELLO, "52078954-DB12-4ACF-9ABC-4AD1932AB6C0");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANNELLO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANNELLO, MyGlb.VIS_VUOTONORMALE);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANNELLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, "193478A8-7286-4DB7-8662-3106EB284D70");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, "Unità Org");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, "Left (ANAGRAFE UNITA ORGANIZZATIVA GET DESCRIZIONE (POL PROPOSTE VAR DETT PROGR UNITA ORGANIZZATIVA, Today ()), C40)");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAPIENA, "961A5685-43B9-42F4-92BE-89DFA0C2F04D");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAPIENA, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAPIENA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_BOZZEVARIAZI.SetImage(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAPIENA, 0, "nota scritta.gif", false);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAPIENA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAVUOTA, "24D373C3-F81F-4B01-90E8-8657CA980691");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAVUOTA, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAVUOTA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_BOZZEVARIAZI.SetImage(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAVUOTA, 0, "nota bianca.gif", false);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAVUOTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO3, "8F760670-E244-495D-9FF1-E424FD83D66A");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO3, "Esercizio");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO3, MyGlb.VIS_VUOGRAALLECO);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO1, "19903265-CFE2-4026-B386-E3CC17FF264D");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO1, "Esercizio+1");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO1, MyGlb.VIS_VUOGRAALLECO);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO2, "E07BB5BF-1458-4F78-BBA7-4CA3357EE11E");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO2, "Esercizio+2");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO2, MyGlb.VIS_VUOGRAALLECO);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, "7186BC7E-D38C-4CA4-9494-E00552E8F4E2");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, "FINANZIAMENTI DESCRIZIONE");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, "98F03BAE-CBEA-4643-8CB5-11CAC43C119D");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, "OPERE DESCRIZIONE");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOPROGBUTT, "781DF1A7-3DCC-4616-8E87-688C44DF09BF");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOPROGBUTT, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOPROGBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_BOZZEVARIAZI.SetImage(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOPROGBUTT, 0, "info.gif", false);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOPROGBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOBIEBUTT, "C56D1465-8069-4D52-956F-B6B80194E3A0");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOBIEBUTT, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOBIEBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_BOZZEVARIAZI.SetImage(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOBIEBUTT, 0, "info.gif", false);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOBIEBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO, "D8A4D9B3-3E96-4FE4-A04E-E4DE11C0AE28");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO, "ESERCIZIO");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO, 0, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CODREC, "4DB33597-B6B6-4AA5-961E-D128F714E6A4");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CODREC, "COD REC");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CODREC, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CODREC, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CODREC, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, "3AA737F1-1AEE-4994-B45C-E9D589BDFE0A");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, "Proposta  ");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, "290AA609-D8F6-49C0-8DDA-74844EAE427B");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, "POL VISTA PROPOSTE BOZZA Desc Proposta");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANEL, "2119ED58-22C6-455D-ACE1-A99804F32FC2");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANEL, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANEL, MyGlb.VIS_VUOTONORMALE);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE1, "E0AC4E9D-F85D-45F9-A5FA-9B485510B2D2");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE1, "Utente");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA1, "57E6997F-F684-40B8-BBDB-FABCDFB48129");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA1, "Data");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE, "39F7842B-43F4-4656-B691-323627CBD348");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE, "Utente ");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA, "6A2301A3-665D-4716-BF47-3F8CBA16BA6E");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA, "Data ");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FASULLO, "D1BCE835-E4BD-48FB-BBB6-2278FEFCDD8E");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FASULLO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FASULLO, MyGlb.VIS_VUOTONORMALE);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FASULLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOFINANZI1, "51C9EA38-37FE-4CA2-BDB5-D2FEDB66DE0B");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOFINANZI1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOFINANZI1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_BOZZEVARIAZI.SetImage(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOFINANZI1, 0, "info.gif", false);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOFINANZI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOPERA1, "C8805027-92C5-4433-BC0B-27146BC3486E");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOPERA1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOPERA1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_BOZZEVARIAZI.SetImage(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOPERA1, 0, "info.gif", false);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOPERA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_BOZZEVARIAZI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_LIST, 32, 52, 424, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_LIST, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_LIST, "NOTA 1");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_FORM, 4, 256, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_FORM, "NOTA 1");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NOTA1, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NOTA1, PPQRY_POLPROVARDE8, "A.NOTA_1", "NOTA_1", 5, 400, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_LIST, 32, 52, 424, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_LIST, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_LIST, "NOTA 2");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_FORM, 4, 304, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_FORM, "NOTA 2");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NOTA2, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NOTA2, PPQRY_POLPROVARDE8, "A.NOTA_2", "NOTA_2", 5, 400, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_LIST, 32, 52, 424, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_LIST, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_LIST, "NOTA 3");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_FORM, 4, 352, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_FORM, "NOTA 3");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NOTA3, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NOTA3, PPQRY_POLPROVARDE8, "A.NOTA_3", "NOTA_3", 5, 400, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_LIST, 32, 52, 424, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_LIST, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_LIST, "NOTA 4");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_FORM, 4, 400, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_FORM, "NOTA 4");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NOTA4, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NOTA4, PPQRY_POLPROVARDE8, "A.NOTA_4", "NOTA_4", 5, 400, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_LIST, 32, 52, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_LIST, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_LIST, "NOTA 5");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_FORM, 4, 448, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_FORM, "NOTA 5");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NOTA5, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NOTA5, PPQRY_POLPROVARDE8, "A.NOTA_5", "NOTA_5", 5, 400, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_LIST, 0, 52, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_LIST, 44);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_LIST, "Stato");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_FORM, 76, 8, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_FORM, 36);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_FORM, "St.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_STATO, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldUnbound(PFL_BOZZEVARIAZI_STATO, true);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_STATO, PPQRY_POLPROVARDE8, "A.STATO", "STATO", 5, 1, 0, -13997);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_STATO, (new IDVariant("A")), "Approvata", "", "", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_STATO, (new IDVariant("N")), "Annullata", "", "", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_STATO, (new IDVariant()), "Attesa Appr.", "", "", -1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PARTE, MyGlb.PANEL_LIST, 92, 52, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PARTE, MyGlb.PANEL_LIST, 24);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PARTE, MyGlb.PANEL_FORM, 92, 8, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PARTE, MyGlb.PANEL_FORM, 40);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_PARTE, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_PARTE, PPQRY_POLPROVARDE8, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, MyGlb.PANEL_LIST, 28, 56, 52, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, MyGlb.PANEL_FORM, 36, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_CAPITOLOART, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_LIST, 204, 52, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_LIST, 60);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_LIST, "Capit.");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_FORM, 136, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_FORM, 60);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_CAPITOLO1, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_CAPITOLO1, PPQRY_POLPROVARDE8, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_LIST, 252, 52, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_LIST, 60);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_LIST, "Ar.");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_FORM, 276, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_FORM, 60);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_FORM, "Articolo");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_ARTICOLO1, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_ARTICOLO1, PPQRY_POLPROVARDE8, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_LIST, 276, 52, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_LIST, 92);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_LIST, "Nuov.");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_FORM, 340, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_FORM, 44);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_FORM, "Nuova");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NUOVA, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NUOVA, PPQRY_POLPROVARDE8, "A.ISTITUZIONE_NC", "ISTITUZIONE_NC", 5, 2, 0, -13997);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NUOVA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NUOVA, (new IDVariant()), "Null", "", "", -1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_LIST, 2164, 52, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_LIST, 136);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_LIST, "Risorsa Intervento");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_FORM, 16, 60, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_FORM, 116);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_FORM, "Risorsa Intervento");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_RISORSINTERV, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_RISORSINTERV, PPQRY_DUAL1, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,0,0)", "DUALINTDESCR", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_LIST, 2164, 52, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_LIST, 140);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo  ");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_FORM, 76, 84, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_FORM, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo  ");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_CAPITOLO, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_CAPITOLO, PPQRY_DUAL1, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,~~CAPITOLO~~,0)", "DUALCAPDESCR", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_LIST, 2164, 52, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_LIST, 136);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_LIST, "Articolo ");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_FORM, 76, 108, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_FORM, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_FORM, "Articolo ");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_ARTICOLO, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_ARTICOLO, PPQRY_DUAL1, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,~~CAPITOLO~~,~~ARTICOLO~~)", "DUALARTDESCR", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, MyGlb.PANEL_LIST, 172, 44, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, MyGlb.PANEL_FORM, 260, 36, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_SLASH, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, MyGlb.PANEL_LIST, 244, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, MyGlb.PANEL_FORM, 300, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_APRIVOCEPEG, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_APRIVOCEPEG, -1, "", "APRIVOCEPEG", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, MyGlb.PANEL_LIST, 252, 68, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, MyGlb.PANEL_FORM, 316, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_INFOVOCEPEG, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_INFOVOCEPEG, -1, "", "INFOVOCEPEG", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, MyGlb.PANEL_LIST, 204, 0, 72, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, MyGlb.PANEL_LIST, 3);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, MyGlb.PANEL_FORM, 232, 0, 80, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_VOCEPEGSMALL, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_VOCEPEGSMALL, -1, "", "VOCEPEGSMALL", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLARGE, MyGlb.PANEL_LIST, 152, 0, 124, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLARGE, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLARGE, MyGlb.PANEL_LIST, 3);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLARGE, MyGlb.PANEL_FORM, 240, 8, 80, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLARGE, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLARGE, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_VOCEPEGLARGE, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_VOCEPEGLARGE, -1, "", "VOCEPEGLARGE", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, MyGlb.PANEL_LIST, 0, 52, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, MyGlb.PANEL_LIST, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, MyGlb.PANEL_FORM, 84, 132, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_TITOLO, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_TITOLO, PPQRY_POLPROVARDE8, "A.TITOLO", "TITOLO", 1, 1, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLIDESCRI, MyGlb.PANEL_LIST, 0, 52, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLIDESCRI, MyGlb.PANEL_LIST, 112);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLIDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLIDESCRI, MyGlb.PANEL_LIST, "TITOLI DESCRIZIONE");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLIDESCRI, MyGlb.PANEL_FORM, 180, 132, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLIDESCRI, MyGlb.PANEL_FORM, 112);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TITOLIDESCRI, MyGlb.PANEL_FORM, "TIT. DESCRIZIONE");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_TITOLIDESCRI, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_TITOLIDESCRI, PPQRY_TITOLI, "A.DESCRIZIONE", "ROWNAMTITDES", 5, 140, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, MyGlb.PANEL_LIST, 0, 52, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, MyGlb.PANEL_LIST, 164);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, MyGlb.PANEL_FORM, 32, 172, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, MyGlb.PANEL_FORM, 120);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANI1, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_UNITAORGANI1, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_UNITAORGANI1, PPQRY_POLPROVARDE8, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTI, MyGlb.PANEL_LIST, 316, 52, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTI, MyGlb.PANEL_LIST, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTI, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTI, MyGlb.PANEL_LIST, "Importi");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTI, MyGlb.PANEL_FORM, 80, 232, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTI, MyGlb.PANEL_FORM, 52);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTI, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTI, MyGlb.PANEL_FORM, "Importi");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_IMPORTI, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_IMPORTI, PPQRY_POLPROVARDE8, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_LIST, 424, 52, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_LIST, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_LIST, "IMPORTO 2");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_FORM, 256, 232, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_FORM, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_FORM, "IMP. 2");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_IMPORTO2, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_IMPORTO2, PPQRY_POLPROVARDE8, "A.IMPORTO_2", "IMPORTO_2", 3, 14, 2, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_LIST, 532, 52, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_LIST, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_LIST, "IMPORTO 3");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_FORM, 372, 232, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_FORM, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_FORM, "IMP. 3");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_IMPORTO3, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_IMPORTO3, PPQRY_POLPROVARDE8, "A.IMPORTO_3", "IMPORTO_3", 3, 14, 2, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_LIST, 316, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_LIST, 128);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_LIST, "PROPOSTA VAR DETT ID");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_FORM, 4, 400, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_FORM, 128);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_FORM, "PROP. VAR DETT ID");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_PROPVARDETID, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_PROPVARDETID, PPQRY_POLPROVARDE8, "A.PROPOSTA_VAR_DETT_ID", "PROPOSTA_VAR_DETT_ID", 3, 10, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA1, MyGlb.PANEL_LIST, 316, 52, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA1, MyGlb.PANEL_LIST, 100);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA1, MyGlb.PANEL_LIST, "Proposta");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA1, MyGlb.PANEL_FORM, 4, 424, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA1, MyGlb.PANEL_FORM, 100);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA1, MyGlb.PANEL_FORM, "Proposta");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_PROPOSTA1, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_PROPOSTA1, PPQRY_POLPROVARDE8, "A.PROPOSTA_VAR_ID", "PROPOSTA_VAR_ID", 3, 10, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_LIST, 316, 52, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_LIST, 120);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_LIST, "BOZZA VARIAZIONE ID");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_FORM, 4, 448, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_FORM, 120);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_FORM, "BOZ. VARIAZIONE ID");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_BOZZAVARIAID, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_BOZZAVARIAID, PPQRY_POLPROVARDE8, "A.BOZZA_VARIAZIONE_ID", "BOZZA_VARIAZIONE_ID", 3, 10, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_LIST, 640, 52, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_LIST, 88);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_LIST, "Cons./Svil.");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_FORM, 136, 260, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_FORM, 60);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_FORM, "Cons Svil");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_CONSSVIL, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_CONSSVIL, PPQRY_POLPROVARDE8, "A.CONS_SVILUPPO", "CONS_SVILUPPO", 5, 1, 0, -13997);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_CONSSVIL, (new IDVariant("C")), "Consolidato", "", "", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_CONSSVIL, (new IDVariant("S")), "Sviluppo", "", "", -1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 708, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 36, 284, 508, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_TIPOVARIAZIO, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_TIPOVARIAZIO, PPQRY_POLPROVARDE8, "A.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 52, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione ");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_FORM, 56, 308, 488, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione ");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_DESCRIZIONE, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_DESCRIZIONE, PPQRY_POLPROVARDE8, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_LIST, 916, 52, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_LIST, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_LIST, "Var.Bil.");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_FORM, 64, 348, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_FORM, "Var.Bil.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_VARBIL, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_VARBIL, PPQRY_POLPROVARDE8, "A.VAR_BIL", "VAR_BIL", 5, 2, 0, -13997);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_VARBIL, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_VARBIL, (new IDVariant()), "Null", "", "", -1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_LIST, 960, 52, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_FORM, 8, 348, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_FORM, 124);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_PROGETTO, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_PROGETTO, PPQRY_POLPROVARDE8, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POELPRFCDEPR, MyGlb.PANEL_LIST, 0, 52, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POELPRFCDEPR, MyGlb.PANEL_LIST, 196);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POELPRFCDEPR, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POELPRFCDEPR, MyGlb.PANEL_LIST, "POL ELENCO PROG FC DES PROGETTO");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POELPRFCDEPR, MyGlb.PANEL_FORM, 216, 348, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POELPRFCDEPR, MyGlb.PANEL_FORM, 196);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POELPRFCDEPR, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POELPRFCDEPR, MyGlb.PANEL_FORM, "POL ELEN. PROG FC DES PROGETTO");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_POELPRFCDEPR, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_POELPRFCDEPR, PPQRY_POLELENPROFC, "A.DES_PROGETTO", "POELPRFCDEPR", 5, 100, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_LIST, 1360, 52, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_LIST, 124);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_LIST, "Obiettivo Gestionale");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_FORM, 8, 372, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_FORM, 124);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_FORM, "Obiettivo Gestionale");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_OBIETTIVO, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_OBIETTIVO, PPQRY_POLSCHEDOBIE, "B.CODICE", "POSCOBPOOBCO", 5, 10, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POLOBIETDESC, MyGlb.PANEL_LIST, 0, 52, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POLOBIETDESC, MyGlb.PANEL_LIST, 152);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POLOBIETDESC, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POLOBIETDESC, MyGlb.PANEL_LIST, "POL OBIETTIVI DESCRIZIONE");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POLOBIETDESC, MyGlb.PANEL_FORM, 216, 372, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POLOBIETDESC, MyGlb.PANEL_FORM, 152);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POLOBIETDESC, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POLOBIETDESC, MyGlb.PANEL_FORM, "POL OBIET. DESCRIZIONE");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_POLOBIETDESC, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_POLOBIETDESC, PPQRY_POLSCHEDOBIE, "B.DESCRIZIONE", "POSCOBPOOBDE", 5, 100, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, MyGlb.PANEL_LIST, 1040, 52, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, MyGlb.PANEL_LIST, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, MyGlb.PANEL_LIST, "Fattore");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, MyGlb.PANEL_FORM, 76, 396, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, MyGlb.PANEL_FORM, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE1, MyGlb.PANEL_FORM, "Fattore");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_FATTORE1, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_FATTORE1, PPQRY_POLPROVARDE8, "A.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 52, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, MyGlb.PANEL_FORM, 216, 396, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_FATTORDESCRI, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, MyGlb.PANEL_LIST, 1120, 52, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, MyGlb.PANEL_LIST, 52);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, MyGlb.PANEL_LIST, "Centro");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, MyGlb.PANEL_FORM, 80, 420, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, MyGlb.PANEL_FORM, 52);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO1, MyGlb.PANEL_FORM, "Centro");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_CENTRO1, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_CENTRO1, PPQRY_POLPROVARDE8, "A.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 52, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, MyGlb.PANEL_FORM, 216, 420, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_CENTRIDESCRI, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "CENTRIDESCRI", 5, 200, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_LIST, 1200, 52, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanz.");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_FORM, 40, 444, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_FINANZIAMENT, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_FINANZIAMENT, PPQRY_POLPROVARDE8, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_LIST, 1280, 52, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_LIST, 44);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_FORM, 88, 468, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_FORM, 44);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_OPERA, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_OPERA, PPQRY_POLPROVARDE8, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_LIST, 1440, 52, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_LIST, 184);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_LIST, "Variazione");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_FORM, 52, 526, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_FORM, 52);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_FORM, "Variaz.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_VARIAZIONE, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_VARIAZIONE, PPQRY_POLVARBILPEG, "SUBSTR(A.DESCRIZIONE, 1, 40)", "POLVARBIPEVA", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_LIST, 1652, 52, 56, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_LIST, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_LIST, "Gener.");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_FORM, 56, 552, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_FORM, 52);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_FORM, "Gener.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_GENERATA, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldUnbound(PFL_BOZZEVARIAZI_GENERATA, true);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_GENERATA, PPQRY_POLPROVARDE8, "CASE WHEN NOT ((A.PROGR_VARCOMPRO_1 IS NULL)) OR NOT ((A.PROGR_VARCOMPRO_2 IS NULL)) OR NOT ((A.PROGR_VARCOMPRO_3 IS NULL)) OR NOT ((A.PROGR_VARCOM_1 IS NULL)) OR NOT ((A.PROGR_VARCOM_2 IS NULL)) OR NOT ((A.PROGR_VARCOM_3 IS NULL)) THEN 'SI' ELSE NULL END", "RECORDGENERA", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_GENERATA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_GENERATA, (new IDVariant()), "Null", "", "", -1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_LIST, 1708, 52, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_LIST, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_FORM, 24, 280, 408, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_FORM, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descr.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_DESCRIZIONE1, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldUnbound(PFL_BOZZEVARIAZI_DESCRIZIONE1, true);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_DESCRIZIONE1, PPQRY_POLPROVARDE8, "SUBSTR(A.DESCRIZIONE, 1, 40)", "RECORDDESCRI", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_LIST, 1920, 52, 32, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_LIST, 32);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_LIST, "Note");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_FORM, 28, 312, 464, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_FORM, 32);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_FORM, "Note");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NOTE1, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldUnbound(PFL_BOZZEVARIAZI_NOTE1, true);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NOTE1, PPQRY_POLPROVARDE8, "CASE WHEN (A.NOTA_1 IS NULL) AND (A.NOTA_2 IS NULL) AND (A.NOTA_3 IS NULL) AND (A.NOTA_4 IS NULL) AND (A.NOTA_5 IS NULL) THEN 'N' ELSE 'P' END", "RECORDNOTE", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_LIST, 1744, 52, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_LIST, 120);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_LIST, "SCHEDA OBIETTIVO ID");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_FORM, 4, 808, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_FORM, 120);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_FORM, "SCH. OBIETTIVO ID");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_SCHEDOBIETID, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_SCHEDOBIETID, PPQRY_POLPROVARDE8, "A.SCHEDA_OBIETTIVO_ID", "SCHEDA_OBIETTIVO_ID", 3, 10, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_LIST, 2164, 52, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_LIST, 84);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_LIST, "VARIAZIONE ID");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_FORM, 4, 928, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_FORM, 84);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_FORM, "VARIAZ. ID");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_VARIAZIONEID, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_VARIAZIONEID, PPQRY_POLPROVARDE8, "A.VARIAZIONE_ID", "VARIAZIONE_ID", 1, 4, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTILABEL, MyGlb.PANEL_LIST, 316, 0, 324, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTILABEL, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTILABEL, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTILABEL, MyGlb.PANEL_FORM, 316, 0, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTILABEL, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTILABEL, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_IMPORTILABEL, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_IMPORTILABEL, -1, "", "IMPORTILABEL", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANNELLO, MyGlb.PANEL_LIST, 12, 160, 536, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANNELLO, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANNELLO, MyGlb.PANEL_LIST, 4);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANNELLO, MyGlb.PANEL_FORM, 28, 160, 572, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANNELLO, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANNELLO, MyGlb.PANEL_FORM, 4);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_PANNELLO, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_PANNELLO, -1, "", "PANNELLO", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_LIST, 0, 52, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_LIST, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_LIST, "Unità Org");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_FORM, 4, 608, 488, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_FORM, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_FORM, "Unità Org");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_UNITAORG, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldUnbound(PFL_BOZZEVARIAZI_UNITAORG, true);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_UNITAORG, PPQRY_POLPROVARDE8, "SUBSTR(ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), 1, 40)", "RECORUNITORG", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAPIENA, MyGlb.PANEL_LIST, 488, 368, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAPIENA, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAPIENA, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAPIENA, MyGlb.PANEL_FORM, 548, 308, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAPIENA, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAPIENA, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NOTAPIENA, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NOTAPIENA, -1, "", "NOTAPIENA", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAVUOTA, MyGlb.PANEL_LIST, 496, 376, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAVUOTA, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAVUOTA, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAVUOTA, MyGlb.PANEL_FORM, 548, 308, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAVUOTA, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTAVUOTA, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NOTAVUOTA, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NOTAVUOTA, -1, "", "NOTAVUOTA", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO3, MyGlb.PANEL_LIST, 120, 216, 92, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO3, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO3, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO3, MyGlb.PANEL_FORM, 152, 212, 96, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO3, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO3, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_ESERCIZIO3, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_ESERCIZIO3, -1, "", "ESERCIZIO3", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO1, MyGlb.PANEL_LIST, 128, 224, 92, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO1, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO1, MyGlb.PANEL_FORM, 276, 212, 96, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO1, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_ESERCIZIO1, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_ESERCIZIO1, -1, "", "ESERCIZIO1", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO2, MyGlb.PANEL_LIST, 136, 232, 92, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO2, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO2, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO2, MyGlb.PANEL_FORM, 388, 212, 96, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO2, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO2, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_ESERCIZIO2, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_ESERCIZIO2, -1, "", "ESERCIZIO2", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, MyGlb.PANEL_LIST, 0, 52, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, MyGlb.PANEL_LIST, 160);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, MyGlb.PANEL_LIST, "FINANZIAMENTI DESCRIZIONE");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, MyGlb.PANEL_FORM, 216, 444, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, MyGlb.PANEL_FORM, 160);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZDESCRI, MyGlb.PANEL_FORM, "FINANZ. DESCRIZIONE");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_FINANZDESCRI, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_FINANZDESCRI, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, MyGlb.PANEL_LIST, 0, 52, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, MyGlb.PANEL_LIST, 112);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, MyGlb.PANEL_LIST, "OPERE DESCRIZIONE");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, MyGlb.PANEL_FORM, 216, 468, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, MyGlb.PANEL_FORM, 112);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPEREDESCRIZ, MyGlb.PANEL_FORM, "OP. DESCRIZIONE");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_OPEREDESCRIZ, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_OPEREDESCRIZ, PPQRY_OPERE, "A.DESCRIZIONE", "OPEREDESCRIZ", 5, 200, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOPROGBUTT, MyGlb.PANEL_LIST, 528, 384, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOPROGBUTT, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOPROGBUTT, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOPROGBUTT, MyGlb.PANEL_FORM, 548, 356, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOPROGBUTT, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOPROGBUTT, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_INFOPROGBUTT, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_INFOPROGBUTT, -1, "", "INFOPROGBUTT", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOBIEBUTT, MyGlb.PANEL_LIST, 536, 392, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOBIEBUTT, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOBIEBUTT, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOBIEBUTT, MyGlb.PANEL_FORM, 548, 380, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOBIEBUTT, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOBIEBUTT, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_INFOOBIEBUTT, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_INFOOBIEBUTT, -1, "", "INFOOBIEBUTT", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 52, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO, MyGlb.PANEL_FORM, 4, 612, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_ESERCIZIO, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_ESERCIZIO, PPQRY_POLPROVARDE8, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CODREC, MyGlb.PANEL_LIST, 0, 52, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CODREC, MyGlb.PANEL_LIST, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CODREC, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CODREC, MyGlb.PANEL_LIST, "COD REC");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CODREC, MyGlb.PANEL_FORM, 4, 516, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CODREC, MyGlb.PANEL_FORM, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CODREC, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CODREC, MyGlb.PANEL_FORM, "COD REC");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_CODREC, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_CODREC, PPQRY_POLPROVARDE8, "A.COD_REC", "COD_REC", 1, 1, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, MyGlb.PANEL_LIST, 0, 52, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, MyGlb.PANEL_LIST, 236);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, MyGlb.PANEL_LIST, "Proposta  ");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, MyGlb.PANEL_FORM, 56, 508, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, MyGlb.PANEL_FORM, 76);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTA, MyGlb.PANEL_FORM, "Proposta  ");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_PROPOSTA, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_PROPOSTA, PPQRY_POLVISPROBOZ, "A.NUM_PROPOSTA", "POVIPRBONUPR", 1, 8, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, MyGlb.PANEL_LIST, 0, 52, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, MyGlb.PANEL_LIST, 224);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, MyGlb.PANEL_LIST, "POL VISTA PROPOSTE BOZZA Desc Proposta");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, MyGlb.PANEL_FORM, 216, 508, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, MyGlb.PANEL_FORM, 224);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_POVIPRBODEPR, MyGlb.PANEL_FORM, "POL VIS. PROP. BOZZA Desc Proposta");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_POVIPRBODEPR, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_POVIPRBODEPR, PPQRY_POLVISPROBOZ, "SUBSTR(A.DESCRIZIONE, 1, 40)", "POVIPRBODEPR", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANEL, MyGlb.PANEL_LIST, 120, 484, 412, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANEL, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANEL, MyGlb.PANEL_LIST, 4);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANEL, MyGlb.PANEL_FORM, 12, 444, 612, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANEL, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PANEL, MyGlb.PANEL_FORM, 4);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_PANEL, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_PANEL, -1, "", "PANEL", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE1, MyGlb.PANEL_LIST, 0, 52, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE1, MyGlb.PANEL_LIST, 120);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE1, MyGlb.PANEL_FORM, 32, 564, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE1, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_UTENTE1, -1, GRP_BOZZEVARIAZI_INSERIMENTO);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_UTENTE1, PPQRY_POLPROVARDE8, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA1, MyGlb.PANEL_LIST, 0, 52, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA1, MyGlb.PANEL_LIST, 108);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA1, MyGlb.PANEL_FORM, 192, 564, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA1, MyGlb.PANEL_FORM, 36);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_DATA1, -1, GRP_BOZZEVARIAZI_INSERIMENTO);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_DATA1, PPQRY_POLPROVARDE8, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE, MyGlb.PANEL_LIST, 0, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE, MyGlb.PANEL_LIST, 112);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE, MyGlb.PANEL_LIST, "Utente ");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE, MyGlb.PANEL_FORM, 312, 564, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UTENTE, MyGlb.PANEL_FORM, "Utente ");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_UTENTE, -1, GRP_BOZZEVARIAZI_AGGIORNAMENT);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_UTENTE, PPQRY_POLPROVARDE8, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA, MyGlb.PANEL_LIST, 0, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA, MyGlb.PANEL_LIST, 100);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA, MyGlb.PANEL_LIST, "Data ");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA, MyGlb.PANEL_FORM, 468, 564, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA, MyGlb.PANEL_FORM, 36);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DATA, MyGlb.PANEL_FORM, "Data ");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_DATA, -1, GRP_BOZZEVARIAZI_AGGIORNAMENT);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_DATA, PPQRY_POLPROVARDE8, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FASULLO, MyGlb.PANEL_LIST, 388, 4, 216, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FASULLO, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FASULLO, MyGlb.PANEL_LIST, 3);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FASULLO, MyGlb.PANEL_FORM, 404, 0, 216, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FASULLO, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FASULLO, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_FASULLO, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_FASULLO, -1, "", "FASULLO", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOFINANZI1, MyGlb.PANEL_LIST, 536, 392, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOFINANZI1, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOFINANZI1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOFINANZI1, MyGlb.PANEL_FORM, 548, 448, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOFINANZI1, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOFINANZI1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_INFOFINANZI1, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_INFOFINANZI1, -1, "", "INFOFINANZI1", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOPERA1, MyGlb.PANEL_LIST, 544, 400, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOPERA1, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOPERA1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOPERA1, MyGlb.PANEL_FORM, 548, 472, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOPERA1, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOOPERA1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_INFOOPERA1, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_INFOOPERA1, -1, "", "INFOOPERA1", 0, 0, 0, -13997);
  }

  private void PAN_BOZZEVARIAZI_InitQueries()
  {
    StringBuffer SQL;

    PAN_BOZZEVARIAZI.SetSize(MyGlb.OBJ_QUERY, 15);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.CODICE as POSCOBPOOBCO, ");
    SQL.append("  B.DESCRIZIONE as POSCOBPOOBDE ");
    SQL.append("from ");
    SQL.append("  POL_SCHEDE_OBIETTIVO A, ");
    SQL.append("  POL_OBIETTIVI B ");
    SQL.append("where (B.OBIETTIVO_ID = A.OBIETTIVO_ID) ");
    SQL.append("and   (A.SCHEDA_OBIETTIVO_ID = ~~SCHEDA_OBIETTIVO_ID~~) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLSCHEDOBIE, 0, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_POLSCHEDOBIE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(PPQRY_POLSCHEDOBIE, "POL_SCHEDE_OBIETTIVO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 1, 40) as POLVARBIPEVA ");
    SQL.append("from ");
    SQL.append("  POL_VARIAZIONI_BIL_PEG A ");
    SQL.append("where (A.VARIAZIONE_ID = ~~VARIAZIONE_ID~~) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLVARBILPEG, 0, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_POLVARBILPEG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(PPQRY_POLVARBILPEG, "POL_VARIAZIONI_BIL_PEG");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,0,0) as DUALINTDESCR, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,~~CAPITOLO~~,0) as DUALCAPDESCR, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,~~CAPITOLO~~,~~ARTICOLO~~) as DUALARTDESCR ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(PPQRY_DUAL1, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DES_PROGETTO as POELPRFCDEPR, ");
    SQL.append("  A.PROGETTO_ID as POELPRFCPRID, ");
    SQL.append("  " + IDL.CSql(MainFrm.ORDINAPROGET, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " as POLELEPRFCO1, ");
    SQL.append("  MAX(DECODE(" + IDL.CSql(MainFrm.ORDINAPROGET, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NULL, TO_DATE('1900-01-01','YYYY-MM-DD'), NVL(A.DATA_INIZIO_PROG, TO_DATE('1900-01-01','YYYY-MM-DD')))) as POLELEPRFCOR ");
    SQL.append("from ");
    SQL.append("  POL_ELENCO_PROG_FC A ");
    SQL.append("where (A.PROGETTO_ID = ~~PROGETTO_ID~~) ");
    SQL.append("and   (((A.ESERCIZIO >= ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND A.E_S = ~~E_S~~ AND A.CAPITOLO = ~~CAPITOLO~~ AND A.ARTICOLO = ~~ARTICOLO~~ AND A.ESERCIZIO_STN = ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND A.PROGR_UNITA_ORGANIZZATIVA = ~~TBL_DATISESSIONE.SESSIPROGRU1~~) AND NVL(~~ISTITUZIONE_NC~~, 'NO') = 'NO') OR (NVL(A.DATA_FINE_PROG, TO_DATE('1900-01-01','YYYY-MM-DD')) < TRUNC( SYSDATE ) AND ~~ISTITUZIONE_NC~~ = 'SI')) ");
    SQL.append("group by ");
    SQL.append("  A.DES_PROGETTO, ");
    SQL.append("  A.PROGETTO_ID ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLELENPROFC, 0, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_POLELENPROFC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(PPQRY_POLELENPROFC, "POL_ELENCO_PROG_FC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= TRUNC( SYSDATE )) ");
    SQL.append("and   (A.FATTORE = ~~FATTORE~~) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CENTRIDESCRI ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~CENTRO~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= TRUNC( SYSDATE )) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~FINANZIAMENTO~~) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as OPEREDESCRIZ ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~OPERA~~) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_OPERE, 0, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_OPERE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(PPQRY_OPERE, "OPERE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUM_PROPOSTA as POVIPRBONUPR, ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 1, 40) as POVIPRBODEPR ");
    SQL.append("from ");
    SQL.append("  POL_VISTA_PROPOSTE_BOZZA A ");
    SQL.append("where (A.BOZZA_VARIAZIONE_ID = ~~TBL_PARS5.ROWNAMEBOZZA~~) ");
    SQL.append("and   (A.PROPOSTA_VAR_ID = ~~PROPOSTA_VAR_ID~~) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLVISPROBOZ, 0, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_POLVISPROBOZ, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(PPQRY_POLVISPROBOZ, "POL_VISTA_PROPOSTE_BOZZA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMTITDES ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.TITOLO = ~~TITOLO~~) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_TITOLI, 0, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_TITOLI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(PPQRY_TITOLI, "TITOLI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as VIBIUOPRUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as VISBILUONEEX ");
    SQL.append("from ");
    SQL.append("  VISTA_BILANCIO_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.TIPO = 'O') ");
    SQL.append("order by 2 ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_VISTABILANUO, 0, SQL, PFL_BOZZEVARIAZI_UNITAORGANI1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as VIBIUOPRUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as VISBILUONEEX ");
    SQL.append("from ");
    SQL.append("  VISTA_BILANCIO_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.TIPO = 'O') ");
    SQL.append("order by 2 ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_VISTABILANUO, 1, SQL, PFL_BOZZEVARIAZI_UNITAORGANI1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_VISTABILANUO, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_T54, 0, SQL, PFL_BOZZEVARIAZI_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_T54, 1, SQL, PFL_BOZZEVARIAZI_TIPOVARIAZIO, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as REUTINAGBVB1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as REUTINAGBVBV ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_DUAL2, 0, SQL, PFL_BOZZEVARIAZI_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as REUTINAGBVB1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as REUTINAGBVBV ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_DUAL2, 1, SQL, PFL_BOZZEVARIAZI_UTENTE1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_DUAL2, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as REUT1INABVB1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as REUT1INABVBV ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_DUAL, 0, SQL, PFL_BOZZEVARIAZI_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as REUT1INABVB1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as REUT1INABVBV ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_DUAL, 1, SQL, PFL_BOZZEVARIAZI_UTENTE, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetIMDB(IMDB, "PQRY_POLPROVARDE8", true);
    PAN_BOZZEVARIAZI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.NOTA_1 as NOTA_1, ");
    SQL.append("  A.NOTA_2 as NOTA_2, ");
    SQL.append("  A.NOTA_3 as NOTA_3, ");
    SQL.append("  A.NOTA_4 as NOTA_4, ");
    SQL.append("  A.NOTA_5 as NOTA_5, ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ISTITUZIONE_NC as ISTITUZIONE_NC, ");
    SQL.append("  A.PROPOSTA_VAR_DETT_ID as PROPOSTA_VAR_DETT_ID, ");
    SQL.append("  A.COD_REC as COD_REC, ");
    SQL.append("  A.PROPOSTA_VAR_ID as PROPOSTA_VAR_ID, ");
    SQL.append("  A.BOZZA_VARIAZIONE_ID as BOZZA_VARIAZIONE_ID, ");
    SQL.append("  SUBSTR(ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), 1, 40) as RECORUNITORG, ");
    SQL.append("  A.IMPORTO_1 as IMPORTO_1, ");
    SQL.append("  A.IMPORTO_2 as IMPORTO_2, ");
    SQL.append("  A.IMPORTO_3 as IMPORTO_3, ");
    SQL.append("  A.CONS_SVILUPPO as CONS_SVILUPPO, ");
    SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 1, 40) as RECORDDESCRI, ");
    SQL.append("  CASE WHEN (A.NOTA_1 IS NULL) AND (A.NOTA_2 IS NULL) AND (A.NOTA_3 IS NULL) AND (A.NOTA_4 IS NULL) AND (A.NOTA_5 IS NULL) THEN 'N' ELSE 'P' END as RECORDNOTE, ");
    SQL.append("  A.VAR_BIL as VAR_BIL, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.SCHEDA_OBIETTIVO_ID as SCHEDA_OBIETTIVO_ID, ");
    SQL.append("  CASE WHEN NOT ((A.PROGR_VARCOMPRO_1 IS NULL)) OR NOT ((A.PROGR_VARCOMPRO_2 IS NULL)) OR NOT ((A.PROGR_VARCOMPRO_3 IS NULL)) OR NOT ((A.PROGR_VARCOM_1 IS NULL)) OR NOT ((A.PROGR_VARCOM_2 IS NULL)) OR NOT ((A.PROGR_VARCOM_3 IS NULL)) THEN 'SI' ELSE NULL END as RECORDGENERA, ");
    SQL.append("  A.VARIAZIONE_ID as VARIAZIONE_ID, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.TITOLO as TITOLO ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLPROVARDE8, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT A ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLPROVARDE8, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.BOZZA_VARIAZIONE_ID = ~~TBL_PARS5.ROWNAMEBOZZA~~) ");
    SQL.append("and   (A.PROPOSTA_VAR_DETT_ID = ~~TBL_PARS5.ROWNAMVADEID~~) ");
    SQL.append("and   ((A.COD_REC = CASE WHEN ~~TBL_PARS5.ROWNADACORE1~~ = 'SI' THEN 1 ELSE 2 END)) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLPROVARDE8, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLPROVARDE8, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLPROVARDE8, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLPROVARDE8, 5, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_POLPROVARDE8, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(0, "POL_PROPOSTE_VAR_DETT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BOZZEVARIAZI.Status() == 2)
    {
      int oldListQBE = PAN_BOZZEVARIAZI.iUseListQBE;
      PAN_BOZZEVARIAZI.iUseListQBE = 0;
      PAN_BOZZEVARIAZI.PanelCommand(Glb.PCM_SEARCH);
      PAN_BOZZEVARIAZI.PanelCommand(Glb.PCM_FIND);
      PAN_BOZZEVARIAZI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_FAKE_Init()
  {

    PAN_FAKE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FAKE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FAKE.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_FAKE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FAKE_UNITAORGANIZ, "E8E95712-DD9C-40A6-9569-BDC3748E51E8");
    PAN_FAKE.set_Header(MyGlb.OBJ_FIELD, PFL_FAKE_UNITAORGANIZ, "Unità Organizzativa");
    PAN_FAKE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FAKE_UNITAORGANIZ, "");
    PAN_FAKE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FAKE_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_FAKE.SetFlags(MyGlb.OBJ_FIELD, PFL_FAKE_UNITAORGANIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FAKE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_UNITAORGANIZ, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_UNITAORGANIZ, MyGlb.PANEL_LIST, 52);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_UNITAORGANIZ, MyGlb.PANEL_LIST, "Un. Organiz.");
    PAN_FAKE.SetRect(MyGlb.OBJ_FIELD, PFL_FAKE_UNITAORGANIZ, MyGlb.PANEL_FORM, 0, 8, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FAKE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FAKE_UNITAORGANIZ, MyGlb.PANEL_FORM, 120);
    PAN_FAKE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FAKE_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_FAKE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FAKE_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_FAKE.SetFieldPage(PFL_FAKE_UNITAORGANIZ, -1, -1);
    PAN_FAKE.SetFieldPanel(PFL_FAKE_UNITAORGANIZ, PPQRY_PANNELLOUO1, "A.ROWNAMEPROUO", "ROWNAMEPROUO", 1, 8, 0, -13997);
  }

  private void PAN_FAKE_InitQueries()
  {
    StringBuffer SQL;

    PAN_FAKE.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A, ");
    SQL.append("  PARAMETRI_WEB B ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~ROWNAMEPROUO~~) ");
    SQL.append("and   (B.OTTICA = A.OTTICA) ");
    SQL.append("and   (B.PROGRESSIVO = 1) ");
    SQL.append("and   (NVL(A.AL, TRUNC( SYSDATE )) <= TRUNC( SYSDATE )) ");
    SQL.append("order by 2 ");
    PAN_FAKE.SetQuery(PPQRY_SO4ANAUNIORG, 0, SQL, PFL_FAKE_UNITAORGANIZ, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A, ");
    SQL.append("  PARAMETRI_WEB B ");
    SQL.append("where (B.OTTICA = A.OTTICA) ");
    SQL.append("and   (B.PROGRESSIVO = 1) ");
    SQL.append("and   (NVL(A.AL, TRUNC( SYSDATE )) <= TRUNC( SYSDATE )) ");
    SQL.append("order by 2 ");
    PAN_FAKE.SetQuery(PPQRY_SO4ANAUNIORG, 1, SQL, PFL_FAKE_UNITAORGANIZ, "");
    PAN_FAKE.SetQueryDB(PPQRY_SO4ANAUNIORG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FAKE.SetIMDB(IMDB, "PQRY_PANNELLOUO1", true);
    PAN_FAKE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_FAKE.SetQueryIMDB(PPQRY_PANNELLOUO1, IMDBDef12.PQRY_PANNELLOUO1_RS, IMDBDef3.TBL_PANNELLOUO);
    JustLoaded = true;
    PAN_FAKE.SetFieldPrimaryIndex(PFL_FAKE_UNITAORGANIZ, IMDBDef3.FLD_PANNELLOUO_ROWNAMEPROUO);
    PAN_FAKE.SetMasterTable(0, "PANNELLOUO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FAKE.Status() == 2)
    {
      int oldListQBE = PAN_FAKE.iUseListQBE;
      PAN_FAKE.iUseListQBE = 0;
      PAN_FAKE.PanelCommand(Glb.PCM_SEARCH);
      PAN_FAKE.PanelCommand(Glb.PCM_FIND);
      PAN_FAKE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PANEL_Init()
  {

    PAN_PANEL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PANEL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PANEL.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANEL_FINANZIOPERA, "5B83C0C5-83C8-439D-A9F7-E7219A3CCA33");
    PAN_PANEL.set_Header(MyGlb.OBJ_FIELD, PFL_PANEL_FINANZIOPERA, "Finanziamento - Opera ");
    PAN_PANEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PANEL_FINANZIOPERA, "");
    PAN_PANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANEL_FINANZIOPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_PANEL_FINANZIOPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANEL_INFOFINANZIA, "6C73E132-3EDE-45C0-852E-8FB662461EC5");
    PAN_PANEL.set_Header(MyGlb.OBJ_FIELD, PFL_PANEL_INFOFINANZIA, "");
    PAN_PANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANEL_INFOFINANZIA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PANEL.SetImage(MyGlb.OBJ_FIELD, PFL_PANEL_INFOFINANZIA, 0, "info.gif", false);
    PAN_PANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_PANEL_INFOFINANZIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PANEL_INFOOPERA, "559E7B46-1F7D-4A79-AAD8-6C5A2D89A52F");
    PAN_PANEL.set_Header(MyGlb.OBJ_FIELD, PFL_PANEL_INFOOPERA, "");
    PAN_PANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PANEL_INFOOPERA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PANEL.SetImage(MyGlb.OBJ_FIELD, PFL_PANEL_INFOOPERA, 0, "info.gif", false);
    PAN_PANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_PANEL_INFOOPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PANEL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PANEL.SetRect(MyGlb.OBJ_FIELD, PFL_PANEL_FINANZIOPERA, MyGlb.PANEL_LIST, 0, 36, 400, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANEL_FINANZIOPERA, MyGlb.PANEL_LIST, 100);
    PAN_PANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANEL_FINANZIOPERA, MyGlb.PANEL_LIST, 1);
    PAN_PANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANEL_FINANZIOPERA, MyGlb.PANEL_LIST, "Finanziamento - Opera ");
    PAN_PANEL.SetRect(MyGlb.OBJ_FIELD, PFL_PANEL_FINANZIOPERA, MyGlb.PANEL_FORM, -4, 16, 544, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANEL_FINANZIOPERA, MyGlb.PANEL_FORM, 128);
    PAN_PANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANEL_FINANZIOPERA, MyGlb.PANEL_FORM, 1);
    PAN_PANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PANEL_FINANZIOPERA, MyGlb.PANEL_FORM, "Finanziamento Opera");
    PAN_PANEL.SetFieldPage(PFL_PANEL_FINANZIOPERA, -1, -1);
    PAN_PANEL.SetFieldPanel(PFL_PANEL_FINANZIOPERA, PPQRY_PANEL2, "A.ROWNAMEFINAZ", "ROWNAMEFINAZ", 5, 49, 0, -13997);
    PAN_PANEL.SetRect(MyGlb.OBJ_FIELD, PFL_PANEL_INFOFINANZIA, MyGlb.PANEL_LIST, 524, 8, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANEL_INFOFINANZIA, MyGlb.PANEL_LIST, 0);
    PAN_PANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANEL_INFOFINANZIA, MyGlb.PANEL_LIST, 1);
    PAN_PANEL.SetRect(MyGlb.OBJ_FIELD, PFL_PANEL_INFOFINANZIA, MyGlb.PANEL_FORM, 544, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANEL_INFOFINANZIA, MyGlb.PANEL_FORM, 0);
    PAN_PANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANEL_INFOFINANZIA, MyGlb.PANEL_FORM, 1);
    PAN_PANEL.SetFieldPage(PFL_PANEL_INFOFINANZIA, -1, -1);
    PAN_PANEL.SetFieldPanel(PFL_PANEL_INFOFINANZIA, -1, "", "INFOFINANZIA", 0, 0, 0, -13997);
    PAN_PANEL.SetRect(MyGlb.OBJ_FIELD, PFL_PANEL_INFOOPERA, MyGlb.PANEL_LIST, 532, 16, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANEL_INFOOPERA, MyGlb.PANEL_LIST, 0);
    PAN_PANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANEL_INFOOPERA, MyGlb.PANEL_LIST, 1);
    PAN_PANEL.SetRect(MyGlb.OBJ_FIELD, PFL_PANEL_INFOOPERA, MyGlb.PANEL_FORM, 560, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PANEL_INFOOPERA, MyGlb.PANEL_FORM, 0);
    PAN_PANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_PANEL_INFOOPERA, MyGlb.PANEL_FORM, 1);
    PAN_PANEL.SetFieldPage(PFL_PANEL_INFOOPERA, -1, -1);
    PAN_PANEL.SetFieldPanel(PFL_PANEL_INFOOPERA, -1, "", "INFOOPERA", 0, 0, 0, -13997);
  }

  private void PAN_PANEL_InitQueries()
  {
    StringBuffer SQL;

    PAN_PANEL.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || '@' || TO_CHAR ( A.OPERA ) as BILFINFINOPE, ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || TO_CHAR ( A.OPERA ) as BILFINORD, ");
    SQL.append("  LPAD(TO_CHAR ( A.FINANZIAMENTO ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( A.OPERA ), 5, SUBSTR(' ', 1, 1)) || ' ' || B.DESCRIZIONE || ' - ' || C.DESCRIZIONE as BILFINDESCRI ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B, ");
    SQL.append("  OPERE C ");
    SQL.append("where ((TO_CHAR ( A.FINANZIAMENTO ) || '@' || TO_CHAR ( A.OPERA )) = ~~ROWNAMEFINAZ~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.CAPITOLO = ~~PQRY_POLPROVARDE8.CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~PQRY_POLPROVARDE8.ARTICOLO~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_POLPROVARDE8.E_S~~) ");
    SQL.append("and   (A.FINANZIAMENTO IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  D.CODICE ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI D ");
    SQL.append("where ((D.SCADENZA IS NULL) OR D.SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append(")) ");
    SQL.append("and   (B.CODICE = A.FINANZIAMENTO) ");
    SQL.append("and   (C.CODICE = A.OPERA) ");
    PAN_PANEL.SetQuery(PPQRY_BILFIN, 0, SQL, PFL_PANEL_FINANZIOPERA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || '@' || TO_CHAR ( A.OPERA ) as BILFINFINOPE, ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || TO_CHAR ( A.OPERA ) as BILFINORD, ");
    SQL.append("  LPAD(TO_CHAR ( A.FINANZIAMENTO ), 5, SUBSTR(' ', 1, 1)) || ' - ' || LPAD(TO_CHAR ( A.OPERA ), 5, SUBSTR(' ', 1, 1)) || ' ' || B.DESCRIZIONE || ' - ' || C.DESCRIZIONE as BILFINDESCRI ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B, ");
    SQL.append("  OPERE C ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.CAPITOLO = ~~PQRY_POLPROVARDE8.CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~PQRY_POLPROVARDE8.ARTICOLO~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_POLPROVARDE8.E_S~~) ");
    SQL.append("and   (A.FINANZIAMENTO IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  D.CODICE ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI D ");
    SQL.append("where ((D.SCADENZA IS NULL) OR D.SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append(")) ");
    SQL.append("and   (B.CODICE = A.FINANZIAMENTO) ");
    SQL.append("and   (C.CODICE = A.OPERA) ");
    PAN_PANEL.SetQuery(PPQRY_BILFIN, 1, SQL, PFL_PANEL_FINANZIOPERA, "");
    PAN_PANEL.SetQueryDB(PPQRY_BILFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PANEL.SetIMDB(IMDB, "PQRY_PANEL2", true);
    PAN_PANEL.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PANEL.SetQueryIMDB(PPQRY_PANEL2, IMDBDef12.PQRY_PANEL2_RS, IMDBDef3.TBL_PANEL);
    JustLoaded = true;
    PAN_PANEL.SetFieldPrimaryIndex(PFL_PANEL_FINANZIOPERA, IMDBDef3.FLD_PANEL_ROWNAMEFINAZ);
    PAN_PANEL.SetMasterTable(0, "PANEL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PANEL.Status() == 2)
    {
      int oldListQBE = PAN_PANEL.iUseListQBE;
      PAN_PANEL.iUseListQBE = 0;
      PAN_PANEL.PanelCommand(Glb.PCM_SEARCH);
      PAN_PANEL.PanelCommand(Glb.PCM_FIND);
      PAN_PANEL.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_POLELENPROFC_Init()
  {

    PAN_POLELENPROFC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_POLELENPROFC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_POLELENPROFC.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_POLELENPROFC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_PROGETTOID, "31C21B79-7107-4704-ABC9-4E90E640FA8F");
    PAN_POLELENPROFC.set_Header(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_PROGETTOID, "PROGETTO ID");
    PAN_POLELENPROFC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_PROGETTOID, "");
    PAN_POLELENPROFC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_PROGETTOID, MyGlb.VIS_NORMFIELPADR);
    PAN_POLELENPROFC.SetFlags(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_PROGETTOID, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_POLELENPROFC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_NEWEXPRESSIO, "8763A641-00BD-40F7-B062-A3FEEC426136");
    PAN_POLELENPROFC.set_Header(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_NEWEXPRESSIO, "New Expression");
    PAN_POLELENPROFC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_NEWEXPRESSIO, "");
    PAN_POLELENPROFC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_NEWEXPRESSIO, MyGlb.VIS_NORMFIELPADR);
    PAN_POLELENPROFC.SetFlags(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_NEWEXPRESSIO, 0 | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_POLELENPROFC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_FATTORE, "3F612EAC-FB34-4E24-9777-C22A8F210A62");
    PAN_POLELENPROFC.set_Header(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_FATTORE, "FATTORE");
    PAN_POLELENPROFC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_FATTORE, "");
    PAN_POLELENPROFC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_FATTORE, MyGlb.VIS_NORMFIELPADR);
    PAN_POLELENPROFC.SetFlags(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_POLELENPROFC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_CENTRO, "29963C40-CCA2-48DB-BA25-CAE41D767C7C");
    PAN_POLELENPROFC.set_Header(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_CENTRO, "CENTRO");
    PAN_POLELENPROFC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_CENTRO, "");
    PAN_POLELENPROFC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_CENTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_POLELENPROFC.SetFlags(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_POLELENPROFC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_POLELENPROFC.SetRect(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_PROGETTOID, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POLELENPROFC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_PROGETTOID, MyGlb.PANEL_LIST, 76);
    PAN_POLELENPROFC.SetNumRow(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_PROGETTOID, MyGlb.PANEL_LIST, 1);
    PAN_POLELENPROFC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_PROGETTOID, MyGlb.PANEL_LIST, "PROGETTO ID");
    PAN_POLELENPROFC.SetRect(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_PROGETTOID, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POLELENPROFC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_PROGETTOID, MyGlb.PANEL_FORM, 76);
    PAN_POLELENPROFC.SetNumRow(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_PROGETTOID, MyGlb.PANEL_FORM, 1);
    PAN_POLELENPROFC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_PROGETTOID, MyGlb.PANEL_FORM, "PROG. ID");
    PAN_POLELENPROFC.SetFieldPage(PFL_POLELENPROFC_PROGETTOID, -1, -1);
    PAN_POLELENPROFC.SetFieldPanel(PFL_POLELENPROFC_PROGETTOID, PPQRY_FASULLO1, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_POLELENPROFC.SetRect(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_NEWEXPRESSIO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POLELENPROFC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_NEWEXPRESSIO, MyGlb.PANEL_LIST, 84);
    PAN_POLELENPROFC.SetNumRow(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_NEWEXPRESSIO, MyGlb.PANEL_LIST, 1);
    PAN_POLELENPROFC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_NEWEXPRESSIO, MyGlb.PANEL_LIST, "New Expression");
    PAN_POLELENPROFC.SetRect(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_NEWEXPRESSIO, MyGlb.PANEL_FORM, 4, 28, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POLELENPROFC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_NEWEXPRESSIO, MyGlb.PANEL_FORM, 84);
    PAN_POLELENPROFC.SetNumRow(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_NEWEXPRESSIO, MyGlb.PANEL_FORM, 1);
    PAN_POLELENPROFC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_NEWEXPRESSIO, MyGlb.PANEL_FORM, "New Expres.");
    PAN_POLELENPROFC.SetFieldPage(PFL_POLELENPROFC_NEWEXPRESSIO, -1, -1);
    PAN_POLELENPROFC.SetFieldUnbound(PFL_POLELENPROFC_NEWEXPRESSIO, true);
    PAN_POLELENPROFC.SetFieldPanel(PFL_POLELENPROFC_NEWEXPRESSIO, PPQRY_FASULLO1, "SUM(1)", "ROWNAMNEWEXP", 1, 19, 0, -13997);
    PAN_POLELENPROFC.SetRect(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_FATTORE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POLELENPROFC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_POLELENPROFC.SetNumRow(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_POLELENPROFC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_FATTORE, MyGlb.PANEL_LIST, "FATTORE");
    PAN_POLELENPROFC.SetRect(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_FATTORE, MyGlb.PANEL_FORM, 4, 28, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POLELENPROFC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_POLELENPROFC.SetNumRow(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_POLELENPROFC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_FATTORE, MyGlb.PANEL_FORM, "FATTORE");
    PAN_POLELENPROFC.SetFieldPage(PFL_POLELENPROFC_FATTORE, -1, -1);
    PAN_POLELENPROFC.SetFieldPanel(PFL_POLELENPROFC_FATTORE, PPQRY_FASULLO1, "A.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_POLELENPROFC.SetRect(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_CENTRO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POLELENPROFC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_POLELENPROFC.SetNumRow(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_POLELENPROFC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_CENTRO, MyGlb.PANEL_LIST, "CENTRO");
    PAN_POLELENPROFC.SetRect(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_CENTRO, MyGlb.PANEL_FORM, 4, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_POLELENPROFC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_POLELENPROFC.SetNumRow(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_POLELENPROFC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_POLELENPROFC_CENTRO, MyGlb.PANEL_FORM, "CENTRO");
    PAN_POLELENPROFC.SetFieldPage(PFL_POLELENPROFC_CENTRO, -1, -1);
    PAN_POLELENPROFC.SetFieldPanel(PFL_POLELENPROFC_CENTRO, PPQRY_FASULLO1, "A.CENTRO", "CENTRO", 5, 8, 0, -13997);
  }

  private void PAN_POLELENPROFC_InitQueries()
  {
    StringBuffer SQL;

    PAN_POLELENPROFC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_POLELENPROFC.SetIMDB(IMDB, "PQRY_FASULLO1", true);
    PAN_POLELENPROFC.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  SUM(1) as ROWNAMNEWEXP, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.CENTRO as CENTRO ");
    PAN_POLELENPROFC.SetQuery(PPQRY_FASULLO1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_ELENCO_PROG_FC A ");
    PAN_POLELENPROFC.SetQuery(PPQRY_FASULLO1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ESERCIZIO_STN = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_POLPROVARDE8.E_S~~) ");
    SQL.append("and   (A.CAPITOLO = ~~PQRY_POLPROVARDE8.CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~PQRY_POLPROVARDE8.ARTICOLO~~) ");
    PAN_POLELENPROFC.SetQuery(PPQRY_FASULLO1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  A.PROGETTO_ID, ");
    SQL.append("  A.FATTORE, ");
    SQL.append("  A.CENTRO ");
    PAN_POLELENPROFC.SetQuery(PPQRY_FASULLO1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_POLELENPROFC.SetQuery(PPQRY_FASULLO1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_POLELENPROFC.SetQuery(PPQRY_FASULLO1, 5, SQL, -1, "");
    PAN_POLELENPROFC.SetQueryDB(PPQRY_FASULLO1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_POLELENPROFC.SetMasterTable(0, "POL_ELENCO_PROG_FC");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_POLELENPROFC.Status() == 2)
    {
      int oldListQBE = PAN_POLELENPROFC.iUseListQBE;
      PAN_POLELENPROFC.iUseListQBE = 0;
      PAN_POLELENPROFC.PanelCommand(Glb.PCM_SEARCH);
      PAN_POLELENPROFC.PanelCommand(Glb.PCM_FIND);
      PAN_POLELENPROFC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_FAKE) PAN_FAKE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PANEL) PAN_PANEL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_POLELENPROFC) PAN_POLELENPROFC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_ValidateRow(Cancel);
    if (SrcObj == PAN_FAKE) PAN_FAKE_ValidateRow(Cancel);
    if (SrcObj == PAN_PANEL) PAN_PANEL_ValidateRow(Cancel);
    if (SrcObj == PAN_POLELENPROFC) PAN_POLELENPROFC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_DynamicProperties();
    if (SrcObj == PAN_FAKE) PAN_FAKE_DynamicProperties();
    if (SrcObj == PAN_PANEL) PAN_PANEL_DynamicProperties();
    if (SrcObj == PAN_POLELENPROFC) PAN_POLELENPROFC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_FAKE) PAN_FAKE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PANEL) PAN_PANEL_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_POLELENPROFC) PAN_POLELENPROFC_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_OnChangeLayout(NewLayout, Cancel);
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
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_AfterFind(CmdFind);
    if (SrcObj == PAN_POLELENPROFC) PAN_POLELENPROFC_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_FAKE) PAN_FAKE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PANEL) PAN_PANEL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_POLELENPROFC) PAN_POLELENPROFC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
